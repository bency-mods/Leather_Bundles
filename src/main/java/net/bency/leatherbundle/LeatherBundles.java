package net.bency.leatherbundle;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeatherBundles implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("leatherbundle");
	// If you're reading this, this shit is crazy simple. Check resource/data/leatherbundle/recipes.
	// That's literally it. I'm not kidding.

	@Override
	public void onInitialize() {
		LOGGER.info("Leather Bundles mod Initialized.");
	}
}