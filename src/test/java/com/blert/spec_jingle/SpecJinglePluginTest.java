package com.blert.spec_jingle;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class SpecJinglePluginTest
{
	public static void main(String[] args) throws Exception
	{
		//noinspection unchecked
		ExternalPluginManager.loadBuiltin(SpecJinglePlugin.class);
		RuneLite.main(args);
	}
}