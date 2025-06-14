package com.jerielb.additional_weapons.block;

import com.jerielb.additional_weapons.AdditionalWeapons;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.POLISHED_BLACKSTONE;

public class ModBlocks {
	public static final Block CHISELED_POLISHED_BLACKSTONE_1 = registerBlock("chiseled_polished_blackstone_1", new Block(AbstractBlock.Settings.copyShallow(POLISHED_BLACKSTONE).strength(1.5F, 6.0F)));
	public static final Block CHISELED_POLISHED_BLACKSTONE_2 = registerBlock("chiseled_polished_blackstone_2", new Block(AbstractBlock.Settings.copyShallow(POLISHED_BLACKSTONE).strength(1.5F, 6.0F)));
	
	// helper methods
	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.of(AdditionalWeapons.MOD_ID, name), block);
	}
	
	private static void registerBlockItem(String name, Block block) {
		Registry.register(Registries.ITEM, Identifier.of(AdditionalWeapons.MOD_ID, name), new BlockItem(block, new Item.Settings()));
	}
	
	public static void registerModBlocks() {
		AdditionalWeapons.LOGGER.info("Registering Mod Blocks for " + AdditionalWeapons.MOD_ID);
	}
}
