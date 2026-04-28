package com.jerielb.additional_weapons.entity.custom;

import com.jerielb.additional_weapons.entity.ModEntityTypes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.Heightmap;

public class BanditEntity extends Zombie {
	public BanditEntity(EntityType<? extends BanditEntity> entityType, Level level) {
		super(entityType, level);
	}
	
	public static AttributeSupplier.Builder createAttributes() {
		return Monster.createMobAttributes()
				.add(Attributes.MAX_HEALTH, 18)
				.add(Attributes.MOVEMENT_SPEED, 0.23000000417232513)
				.add(Attributes.ATTACK_DAMAGE, 5.0)
				.add(Attributes.FOLLOW_RANGE, 35.0)
				.add(Attributes.ARMOR, 4)
				.add(Attributes.SPAWN_REINFORCEMENTS_CHANCE)
				;
	}
	
	public static void init() {
		BiomeModifications.addSpawn(
				BiomeSelectors.foundInOverworld().and(BiomeSelectors.excludeByKey(Biomes.MUSHROOM_FIELDS, Biomes.DEEP_DARK)),
				MobCategory.MONSTER,
				ModEntityTypes.BANDIT,
				50, 1, 2
		);
		
		SpawnPlacements.register(ModEntityTypes.BANDIT, SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkSurfaceMonstersSpawnRules);
	}
}
