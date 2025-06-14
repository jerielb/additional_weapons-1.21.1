package com.jerielb.additional_weapons.item;

import com.jerielb.additional_weapons.AdditionalWeapons;
import com.jerielb.additional_weapons.entity.ModEntities;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	public static final Item MUNNY = registerItem("munny", new Item(new Item.Settings()));
	
	// Keyblades
	public static final Item KINGDOM_KEY = registerItem("kingdom_key", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item JUNGLE_KING = registerItem("jungle_king", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 5, -2.4F))));
	public static final Item THREE_WISHES = registerItem("three_wishes", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 6, -2.4F))));
	public static final Item WISHING_STAR = registerItem("wishing_star", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 9, -2.4F))));
	public static final Item SPELLBINDER = registerItem("spellbinder", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 4, -1.4F))));
	public static final Item CRABCLAW = registerItem("crabclaw", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 6, -1.9F))));
	public static final Item PUMPKINHEAD = registerItem("pumpkinhead", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 8, -2.4F))));
	public static final Item FAIRY_HARP = registerItem("fairy_harp", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 8, -1.9F))));
	public static final Item METAL_CHOCOBO = registerItem("metal_chocobo", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 9, -2.9F))));
	public static final Item OLYMPIA = registerItem("olympia", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 10, -2.4F))));
	public static final Item LADY_LUCK = registerItem("lady_luck", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 8, -1.4F))));
	public static final Item OBLIVION = registerItem("oblivion", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 11, -2.9F))));
	public static final Item DIVINE_ROSE = registerItem("divine_rose", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 11, -2.4F))));
	public static final Item OATHKEEPER = registerItem("oathkeeper", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 10, -1.9F))));
	public static final Item LIONHEART = registerItem("lionheart", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 10, -1.9F))));
	public static final Item DIAMOND_DUST = registerItem("diamond_dust", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -0.9F))));
	public static final Item ONE_WINGED_ANGEL = registerItem("one_winged_angel", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 8, -3.4F))));
	public static final Item ULTIMA_WEAPON = registerItem("ultima_weapon", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 13, -1.4F))));
	public static final Item KINGDOM_KEY_DARKSIDE = registerItem("kingdom_key_darkside", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 13, -1.4F))));
	
	// entity spawn eggs
	public static final Item SOLDIER_SPAWN_EGG = registerItem("soldier_spawn_egg",
			new SpawnEggItem(ModEntities.SOLDIER, 0x1E274E, 0xBBC0C6, new Item.Settings()));
	public static final Item BANDIT_SPAWN_EGG = registerItem("bandit_spawn_egg",
			new SpawnEggItem(ModEntities.BANDIT, 0x3A3522, 0xB6BB92, new Item.Settings()));
	public static final Item PIRATE_SPAWN_EGG = registerItem("pirate_spawn_egg",
			new SpawnEggItem(ModEntities.PIRATE, 0x1F2429, 0xB90613, new Item.Settings()));
	public static final Item POWER_WILD_SPAWN_EGG = registerItem("power_wild_spawn_egg",
			new SpawnEggItem(ModEntities.POWER_WILD, 0x6EA3C5, 0x374B63, new Item.Settings()));
	public static final Item WHITE_MUSHROOM_SPAWN_EGG = registerItem("white_mushroom_spawn_egg",
			new SpawnEggItem(ModEntities.WHITE_MUSHROOM, 0xCCC483, 0xB92A2E, new Item.Settings()));
	public static final Item SHADOW_SPAWN_EGG = registerItem("shadow_spawn_egg",
			new SpawnEggItem(ModEntities.SHADOW, 0x070707, 0xA28B2D, new Item.Settings()));
	
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(AdditionalWeapons.MOD_ID, name), item);
	}
	
	public static void registerModItems() {
		AdditionalWeapons.LOGGER.info("Registering Mod Items for " + AdditionalWeapons.MOD_ID);
	}
}
