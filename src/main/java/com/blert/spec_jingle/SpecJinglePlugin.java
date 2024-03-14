package com.blert.spec_jingle;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.VarPlayer;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "Spec Jingle"
)
public class SpecJinglePlugin extends Plugin {
	@Inject
	private Client client;

	@Inject
	private SpecJingleConfig config;

	private boolean initialSpecValueSet = false;
	private double currentSpecialAttackPercent = -1;

	@Override
	protected void startUp() throws Exception {}

	@Override
	protected void shutDown() throws Exception {}

	@Subscribe
	protected final void onVarbitChanged(VarbitChanged varbitChanged) {
		if (varbitChanged.getVarpId() != VarPlayer.SPECIAL_ATTACK_PERCENT) {
			return;
		}

		int newPercent = varbitChanged.getValue();

		if (!initialSpecValueSet) {
			currentSpecialAttackPercent = newPercent;
			initialSpecValueSet = true;
		} else {

			if (currentSpecialAttackPercent != -1 && newPercent >= currentSpecialAttackPercent) {

				currentSpecialAttackPercent = newPercent;

				double percentAsActualPercent = (double) newPercent / 10;

				int[] percentValues = {100, 95, 90, 85, 80, 75, 70, 65, 60, 55, 50, 45, 40, 35, 30, 25, 20, 15, 10, 5};
				boolean shouldPlaySoundEffect = false;

				for (int percent : percentValues) {
					if (percentAsActualPercent >= percent) {
						shouldPlaySoundEffect = true;
						break;
					}
				}

				if (shouldPlaySoundEffect) {
					client.playSoundEffect(2055, this.config.volume());
				}
			} else {
				currentSpecialAttackPercent = newPercent;
				// it was a spec reduction (i.e. spec use), no-op
				return;
			}
		}
	}

	@Provides
	SpecJingleConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(SpecJingleConfig.class);
	}
}
