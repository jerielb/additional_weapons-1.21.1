package com.jerielb.additional_weapons.entity.custom;

import com.jerielb.additional_weapons.entity.ModEntityTypes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.Heightmap;

public class PowerWildEntity extends Zombie {
	public PowerWildEntity(EntityType<? extends PowerWildEntity> entityType, Level level) {
		super(entityType, level);
	}

	public static AttributeSupplier.Builder createAttributes() {
		return Monster.createMobAttributes()
				.add(Attributes.MOVEMENT_SPEED, 0.23000000417232513)
				.add(Attributes.ATTACK_DAMAGE, 5.0)
				.add(Attributes.FOLLOW_RANGE, 35.0)
				.add(Attributes.ARMOR, 4.0)
				.add(Attributes.SPAWN_REINFORCEMENTS_CHANCE);
	}
	
	public static void init() {
		BiomeModifications.addSpawn(
				BiomeSelectors.foundInOverworld().and(BiomeSelectors.includeByKey(
						Biomes.JUNGLE, Biomes.SPARSE_JUNGLE, Biomes.BAMBOO_JUNGLE // Jungle*
						// Taiga?
				)),
				MobCategory.MONSTER,
				ModEntityTypes.POWER_WILD,
				25, 1, 2
		);
		
		SpawnPlacements.register(ModEntityTypes.POWER_WILD, SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkSurfaceMonstersSpawnRules);
	}
}
