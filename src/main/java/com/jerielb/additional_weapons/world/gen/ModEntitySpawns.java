package com.jerielb.additional_weapons.world.gen;

import com.jerielb.additional_weapons.entity.ModEntities;
import com.jerielb.additional_weapons.entity.custom.BanditEntity;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnLocationTypes;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;

public class ModEntitySpawns {
	
	public static void addSpawns() {
		// Heartless Soldier
		BiomeModifications.addSpawn(BiomeSelectors.includeByKey(
						BiomeKeys.PLAINS,
						BiomeKeys.FOREST, BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST, BiomeKeys.DARK_FOREST
				),
				SpawnGroup.MONSTER, ModEntities.SOLDIER, 100, 1, 2);
		
		SpawnRestriction.register(ModEntities.SOLDIER, SpawnLocationTypes.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BanditEntity::canSpawnInDark);
		
		// Heartless Bandit
		BiomeModifications.addSpawn(BiomeSelectors.includeByKey(
					BiomeKeys.DESERT, 
					BiomeKeys.SAVANNA, BiomeKeys.SAVANNA_PLATEAU, BiomeKeys.WINDSWEPT_SAVANNA,
					BiomeKeys.BADLANDS, BiomeKeys.WOODED_BADLANDS, BiomeKeys.ERODED_BADLANDS
				),
				SpawnGroup.MONSTER, ModEntities.BANDIT, 100, 1, 2);
		
		SpawnRestriction.register(ModEntities.BANDIT, SpawnLocationTypes.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BanditEntity::canSpawnInDark);
		
		// Heartless Pirate
		BiomeModifications.addSpawn(BiomeSelectors.includeByKey(
					BiomeKeys.BEACH, BiomeKeys.STONY_SHORE
				),
				SpawnGroup.MONSTER, ModEntities.PIRATE, 100, 1, 2);
		
		SpawnRestriction.register(ModEntities.PIRATE, SpawnLocationTypes.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BanditEntity::canSpawnInDark);
		
		// Heartless Power Wild
		BiomeModifications.addSpawn(BiomeSelectors.includeByKey(
					BiomeKeys.TAIGA, BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA,
					BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE, BiomeKeys.BAMBOO_JUNGLE
				),
				SpawnGroup.MONSTER, ModEntities.POWER_WILD, 100, 1, 2);
		
		SpawnRestriction.register(ModEntities.POWER_WILD, SpawnLocationTypes.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BanditEntity::canSpawnInDark);
		
		// Heartless White Mushroom
		BiomeModifications.addSpawn(BiomeSelectors.includeByKey(
					BiomeKeys.SWAMP, BiomeKeys.MANGROVE_SWAMP,
					BiomeKeys.FLOWER_FOREST, BiomeKeys.SUNFLOWER_PLAINS,
					BiomeKeys.CHERRY_GROVE
				),
				SpawnGroup.MONSTER, ModEntities.WHITE_MUSHROOM, 100, 1, 2);
		
		SpawnRestriction.register(ModEntities.WHITE_MUSHROOM, SpawnLocationTypes.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BanditEntity::canSpawnInDark);
		
		// Heartless Shadow
		BiomeModifications.addSpawn(BiomeSelectors.includeByKey(
					BiomeKeys.SNOWY_PLAINS, BiomeKeys.SNOWY_SLOPES, BiomeKeys.SNOWY_TAIGA,
					BiomeKeys.ICE_SPIKES
				),
				SpawnGroup.MONSTER, ModEntities.SHADOW, 100, 1, 2);
		
		SpawnRestriction.register(ModEntities.SHADOW, SpawnLocationTypes.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BanditEntity::canSpawnInDark);
		
	}
}
