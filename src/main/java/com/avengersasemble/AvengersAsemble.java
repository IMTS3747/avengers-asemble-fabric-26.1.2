package com.avengersasemble;

import com.avengersasemble.block.ModBlocks;
import com.avengersasemble.creativemodetab.ModCreativeModeTabs;
import com.avengersasemble.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AvengersAsemble implements ModInitializer {
	public static final String MOD_ID = "avengersasemble";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModCreativeModeTabs.registerModCreativeModeTabs();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}