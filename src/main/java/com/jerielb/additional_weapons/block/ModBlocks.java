package com.jerielb.additional_weapons.block;

import com.jerielb.additional_weapons.AdditionalWeapons;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

import static net.minecraft.world.level.block.Blocks.POLISHED_BLACKSTONE;

public class ModBlocks {
	public static final Block CHISELED_POLISHED_BLACKSTONE_1 = registerBlock(
			"chiseled_polished_blackstone_1",
			Block::new,
			BlockBehaviour.Properties.ofLegacyCopy(POLISHED_BLACKSTONE).strength(1.5F, 6.0F),
			true
	);
	public static final Block CHISELED_POLISHED_BLACKSTONE_2 = registerBlock(
			"chiseled_polished_blackstone_2",
			Block::new,
			BlockBehaviour.Properties.ofLegacyCopy(POLISHED_BLACKSTONE).strength(1.5F, 6.0F),
			true
	);
	
	// helper methods
	private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, boolean shouldRegisterItem) {
		// Create a registry key for the block
		ResourceKey<Block> blockKey = keyOfBlock(name);
		// Create the block instance
		Block block = blockFactory.apply(settings.setId(blockKey));
		
		// Sometimes, you may not want to register an item for the block.
		// Eg: if it's a technical block like `minecraft:moving_piston` or `minecraft:end_gateway`
		if (shouldRegisterItem) {
			// Items need to be registered with a different type of registry key, but the ID
			// can be the same.
			ResourceKey<Item> itemKey = keyOfItem(name);
			
			BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
			Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
		}
		
		return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
	}
	
	private static ResourceKey<Block> keyOfBlock(String name) {
		return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(AdditionalWeapons.MOD_ID, name));
	}
	
	private static ResourceKey<Item> keyOfItem(String name) {
		return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdditionalWeapons.MOD_ID, name));
	}

	public static void registerModBlocks() {
		AdditionalWeapons.LOGGER.info("Registering Mod Blocks for " + AdditionalWeapons.MOD_ID);
	}
}
