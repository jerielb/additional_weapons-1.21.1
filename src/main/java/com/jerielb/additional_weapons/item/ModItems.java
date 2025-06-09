package com.jerielb.additional_weapons.item;

import com.jerielb.additional_weapons.AdditionalWeapons;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	public static final Item MUNNY = registerItem("munny", new Item(new Item.Settings()));
	
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(AdditionalWeapons.MOD_ID, name), item);
	}
	
	public static void registerModItems() {
		AdditionalWeapons.LOGGER.info("Registering Mod Items for " + AdditionalWeapons.MOD_ID);
	}
}
