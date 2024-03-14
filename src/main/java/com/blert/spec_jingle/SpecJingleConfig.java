package com.blert.spec_jingle;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup("example")
public interface SpecJingleConfig extends Config
{
	@Range(min = 1, max = 100)
	@ConfigItem(
			keyName = "volume",
			name = "Volume",
			description = "Jingle volume",
			position = -1
	)
	default int volume() {
		return 20;
	}

	@ConfigItem(
		keyName = "playJingleAtFivePercent",
		name = "Play at 5%",
			position = 0,
		description = "Should the sound effect play when your spec regens to 5%?"
	)
	default boolean playJingleAtFivePercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtTenPercent",
			name = "Play at 10%",
			position = 1,
			description = "Should the sound effect play when your spec regens to 10%?"
	)
	default boolean playJingleAtTenPercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtFifteenPercent",
			name = "Play at 15%",
			position = 2,
			description = "Should the sound effect play when your spec regens to 15%?"
	)
	default boolean playJingleAtFifteenPercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtTwentyPercent",
			name = "Play at 20%",
			position = 3,
			description = "Should the sound effect play when your spec regens to 20%?"
	)
	default boolean playJingleAtTwentyPercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtTwentyFivePercent",
			name = "Play at 25%",
			position = 4,
			description = "Should the sound effect play when your spec regens to 25%?"
	)
	default boolean playJingleAtTwentyFivePercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtThirtyPercent",
			name = "Play at 30%",
			position = 5,
			description = "Should the sound effect play when your spec regens to 30%?"
	)
	default boolean playJingleAtThirtyPercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtThirtyFivePercent",
			name = "Play at 35%",
			position = 6,
			description = "Should the sound effect play when your spec regens to 35%?"
	)
	default boolean playJingleAtThirtyFivePercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtFortyPercent",
			name = "Play at 40%",
			position = 7,
			description = "Should the sound effect play when your spec regens to 40%?"
	)
	default boolean playJingleAtFortyPercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtFortyFivePercent",
			name = "Play at 45%",
			position = 8,
			description = "Should the sound effect play when your spec regens to 45%?"
	)
	default boolean playJingleAtFortyFivePercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtFiftyPercent",
			name = "Play at 50%",
			position = 9,
			description = "Should the sound effect play when your spec regens to 50%?"
	)
	default boolean playJingleAtFiftyPercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtFiftyFivePercent",
			name = "Play at 55%",
			position = 10,
			description = "Should the sound effect play when your spec regens to 55%?"
	)
	default boolean playJingleAtFiftyFivePercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtSixtyPercent",
			name = "Play at 60%",
			position = 11,
			description = "Should the sound effect play when your spec regens to 60%?"
	)
	default boolean playJingleAtSixtyPercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtSixtyFivePercent",
			name = "Play at 65%",
			position = 12,
			description = "Should the sound effect play when your spec regens to 65%?"
	)
	default boolean playJingleAtSixtyFivePercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtSeventyPercent",
			name = "Play at 70%",
			position = 13,
			description = "Should the sound effect play when your spec regens to 70%?"
	)
	default boolean playJingleAtSeventyPercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtSeventyFivePercent",
			name = "Play at 75%",
			position = 14,
			description = "Should the sound effect play when your spec regens to 75%?"
	)
	default boolean playJingleAtSeventyFivePercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtEightyPercent",
			name = "Play at 80%",
			position = 15,
			description = "Should the sound effect play when your spec regens to 80%?"
	)
	default boolean playJingleAtEightyPercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtEightyFivePercent",
			name = "Play at 85%",
			position = 16,
			description = "Should the sound effect play when your spec regens to 85%?"
	)
	default boolean playJingleAtEightyFivePercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtNinetyPercent",
			name = "Play at 90%",
			position = 17,
			description = "Should the sound effect play when your spec regens to 90%?"
	)
	default boolean playJingleAtNinetyPercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtNinetyFivePercent",
			name = "Play at 95%",
			position = 18,
			description = "Should the sound effect play when your spec regens to 95%?"
	)
	default boolean playJingleAtNinetyFivePercent()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playJingleAtOneHundredPercent",
			name = "Play at 100%",
			position = 19,
			description = "Should the sound effect play when your spec regens to 100%?"
	)
	default boolean playJingleAtOneHundredPercent()
	{
		return false;
	}
}
