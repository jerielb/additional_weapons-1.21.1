package com.jerielb.additional_weapons.item;

import com.jerielb.additional_weapons.AdditionalWeapons;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

import java.util.function.Function;

public class ModItems {
	public static final Item MUNNY = registerItem(
			"munny",
			Item::new,
			new Item.Properties()
	);
	
	// Keyblades
	public static final Item KINGDOM_KEY = registerItem(
			"kingdom_key",
			Item::new, 
			new Item.Properties().sword(ToolMaterial.NETHERITE, 3.0F, -2.4F).fireResistant()
	);
	public static final Item JUNGLE_KING = registerItem(
			"jungle_king",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE, 5.0F, -2.4F).fireResistant()
	);
	public static final Item THREE_WISHES = registerItem(
			"three_wishes",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE, 6, -2.4F).fireResistant()
	);
	public static final Item WISHING_STAR = registerItem(
			"wishing_star",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE, 9, -2.4F).fireResistant()
	);
	public static final Item SPELLBINDER = registerItem(
			"spellbinder",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE, 4, -1.4F).fireResistant()
	);
	public static final Item CRABCLAW = registerItem(
			"crabclaw",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE, 6, -1.9F).fireResistant()
	);
	public static final Item PUMPKINHEAD = registerItem(
			"pumpkinhead",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE, 8, -2.4F).fireResistant()
	);
	public static final Item FAIRY_HARP = registerItem(
			"fairy_harp",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE, 8, -1.9F).fireResistant()
	);
	public static final Item METAL_CHOCOBO = registerItem(
			"metal_chocobo",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE, 9, -2.9F).fireResistant()
	);
	public static final Item OLYMPIA = registerItem(
			"olympia",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE, 10, -2.4F).fireResistant()
	);
	public static final Item LADY_LUCK = registerItem(
			"lady_luck",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE, 8, -1.4F).fireResistant()
	);
	public static final Item OBLIVION = registerItem(
			"oblivion",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE,  11, -2.9F).fireResistant()
	);
	public static final Item DIVINE_ROSE = registerItem(
			"divine_rose",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE, 11, -2.4F).fireResistant()
	);
	public static final Item OATHKEEPER = registerItem(
			"oathkeeper",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE, 10, -1.9F).fireResistant()
	);
	public static final Item LIONHEART = registerItem(
			"lionheart",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE, 10, -1.9F).fireResistant()
	);
	public static final Item DIAMOND_DUST = registerItem(
			"diamond_dust",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE, 3, -0.9F).fireResistant()
	);
	public static final Item ONE_WINGED_ANGEL = registerItem(
			"one_winged_angel",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE, 8, -3.4F).fireResistant()
	);
	public static final Item ULTIMA_WEAPON = registerItem(
			"ultima_weapon",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE, 13, -1.4F).fireResistant()
	);
	public static final Item KINGDOM_KEY_DARKSIDE = registerItem(
			"kingdom_key_darkside",
			Item::new,
			new Item.Properties().sword(ToolMaterial.NETHERITE, 13, -1.4F).fireResistant()
	);
	
//	// entity spawn eggs
//	public static final Item SOLDIER_SPAWN_EGG = registerItem("soldier_spawn_egg",
//			new SpawnEggItem(ModEntities.SOLDIER, 0x1E274E, 0xBBC0C6, new Item.Settings()));
//	public static final Item BANDIT_SPAWN_EGG = registerItem("bandit_spawn_egg",
//			new SpawnEggItem(ModEntities.BANDIT, 0x3A3522, 0xB6BB92, new Item.Settings()));
//	public static final Item PIRATE_SPAWN_EGG = registerItem("pirate_spawn_egg",
//			new SpawnEggItem(ModEntities.PIRATE, 0x1F2429, 0xB90613, new Item.Settings()));
//	public static final Item POWER_WILD_SPAWN_EGG = registerItem("power_wild_spawn_egg",
//			new SpawnEggItem(ModEntities.POWER_WILD, 0x6EA3C5, 0x374B63, new Item.Settings()));
//	public static final Item WHITE_MUSHROOM_SPAWN_EGG = registerItem("white_mushroom_spawn_egg",
//			new SpawnEggItem(ModEntities.WHITE_MUSHROOM, 0xCCC483, 0xB92A2E, new Item.Settings()));
//	public static final Item SHADOW_SPAWN_EGG = registerItem("shadow_spawn_egg",
//			new SpawnEggItem(ModEntities.SHADOW, 0x070707, 0xA28B2D, new Item.Settings()));
	
	public static <T extends Item> T registerItem(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {
		// Create the item key.
		ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdditionalWeapons.MOD_ID, name));
		
		// Create the item instance.
		T item = itemFactory.apply(settings.setId(itemKey));
		
		// Register the item.
		Registry.register(BuiltInRegistries.ITEM, itemKey, item);
		
		return item;
	}
	
	public static void registerModItems() {
		AdditionalWeapons.LOGGER.info("Registering Mod Items for " + AdditionalWeapons.MOD_ID);
	}
}
