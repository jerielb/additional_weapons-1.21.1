package com.jerielb.additional_weapons.item;

import com.jerielb.additional_weapons.AdditionalWeapons;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemsGroup {
	public static final ResourceKey<CreativeModeTab> ADDITIONAL_WEAPONS_CREATIVE_TAB_KEY = ResourceKey.create(
			BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(AdditionalWeapons.MOD_ID, "additional_weapons")
	);
	
//	public static final ItemGroup MISC = Registry.register(Registries.ITEM_GROUP,
//			Identifier.of(AdditionalWeapons.MOD_ID, "misc"),
//			FabricItemGroup.builder()
//					.icon(() -> new ItemStack(ModItems.MUNNY)) // icon of the creative tab
//					.displayName(Text.translatable("itemgroup.additional_weapons.misc"))
//					.entries((displayContext, entries) -> {
//						
//						entries.add(ModBlocks.CHISELED_POLISHED_BLACKSTONE_1);
//						entries.add(ModBlocks.CHISELED_POLISHED_BLACKSTONE_2);
//						
//						entries.add(ModItems.SOLDIER_SPAWN_EGG);
//						entries.add(ModItems.BANDIT_SPAWN_EGG);
//						entries.add(ModItems.PIRATE_SPAWN_EGG);
//						entries.add(ModItems.POWER_WILD_SPAWN_EGG);
//						entries.add(ModItems.WHITE_MUSHROOM_SPAWN_EGG);
//						entries.add(ModItems.SHADOW_SPAWN_EGG);
//					})
//					.build());
	
	public static final CreativeModeTab ADDITIONAL_WEAPONS_CREATIVE_TAB = FabricCreativeModeTab.builder()
			.icon(() -> new ItemStack(ModItems.MUNNY))
			.title(Component.translatable("creativeTab.additional_weapons"))
			.displayItems((params, output) -> {
				// ### MUNNY ###
				output.accept(ModItems.MUNNY);
				
				// ### KEYBLADES ###
				output.accept(ModItems.KINGDOM_KEY);
				output.accept(ModItems.JUNGLE_KING);
				output.accept(ModItems.THREE_WISHES);
				output.accept(ModItems.WISHING_STAR);
				output.accept(ModItems.SPELLBINDER);
				output.accept(ModItems.CRABCLAW);
				output.accept(ModItems.PUMPKINHEAD);
				output.accept(ModItems.FAIRY_HARP);
				output.accept(ModItems.METAL_CHOCOBO);
				output.accept(ModItems.OLYMPIA);
				output.accept(ModItems.LADY_LUCK);
				output.accept(ModItems.OBLIVION);
				output.accept(ModItems.DIVINE_ROSE);
				output.accept(ModItems.OATHKEEPER);
				output.accept(ModItems.LIONHEART);
				output.accept(ModItems.DIAMOND_DUST);
				output.accept(ModItems.ONE_WINGED_ANGEL);
				output.accept(ModItems.ULTIMA_WEAPON);
				output.accept(ModItems.KINGDOM_KEY_DARKSIDE);
				
				// ### BLOCKS ###
//				output.accept(ModBlocks.QUARTZ_BLOCK);
			})
			.build();
	
	public static void registerItemGroups() {
		AdditionalWeapons.LOGGER.info("Registering Item Groups for " + AdditionalWeapons.MOD_ID);
		
		// Register the group.
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ADDITIONAL_WEAPONS_CREATIVE_TAB_KEY, ADDITIONAL_WEAPONS_CREATIVE_TAB);
	}
}
