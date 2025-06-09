package com.jerielb.additional_weapons;

import com.jerielb.additional_weapons.item.ModItems;
import com.jerielb.additional_weapons.item.ModItemsGroup;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdditionalWeapons implements ModInitializer {
	public static final String MOD_ID = "additional_weapons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroup.registerItemGroups();
		ModItems.registerModItems();
	}
}