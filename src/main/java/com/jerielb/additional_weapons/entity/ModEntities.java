package com.jerielb.additional_weapons.entity;

import com.jerielb.additional_weapons.AdditionalWeapons;
import com.jerielb.additional_weapons.entity.custom.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
	public static final EntityType<SoldierEntity> SOLDIER = Registry.register(
			Registries.ENTITY_TYPE,
			Identifier.of(AdditionalWeapons.MOD_ID, "soldier"),
			EntityType.Builder.create(SoldierEntity::new, SpawnGroup.MONSTER)
					.dimensions(0.6F, 1.95F)
					.build()
	);
	
	public static final EntityType<BanditEntity> BANDIT = Registry.register(
			Registries.ENTITY_TYPE, 
			Identifier.of(AdditionalWeapons.MOD_ID, "bandit"),
			EntityType.Builder.create(BanditEntity::new, SpawnGroup.MONSTER)
					.dimensions(0.6F, 1.95F)
					.build()
	);
	
	public static final EntityType<PirateEntity> PIRATE = Registry.register(
			Registries.ENTITY_TYPE,
			Identifier.of(AdditionalWeapons.MOD_ID, "pirate"),
			EntityType.Builder.create(PirateEntity::new, SpawnGroup.MONSTER)
					.dimensions(0.6F, 1.95F)
					.build()
	);
	
	public static final EntityType<PowerwildEntity> POWERWILD = Registry.register(
			Registries.ENTITY_TYPE,
			Identifier.of(AdditionalWeapons.MOD_ID, "powerwild"),
			EntityType.Builder.create(PowerwildEntity::new, SpawnGroup.MONSTER)
					.dimensions(0.6F, 1.95F)
					.build()
	);
	
	public static final EntityType<WhiteMushroomEntity> WHITE_MUSHROOM = Registry.register(
			Registries.ENTITY_TYPE,
			Identifier.of(AdditionalWeapons.MOD_ID, "white_mushroom"),
			EntityType.Builder.create(WhiteMushroomEntity::new, SpawnGroup.MONSTER)
					.dimensions(0.6F, 1.95F)
					.build()
	);
	
	public static final EntityType<ShadowEntity> SHADOW = Registry.register(
			Registries.ENTITY_TYPE,
			Identifier.of(AdditionalWeapons.MOD_ID, "shadow"),
			EntityType.Builder.create(ShadowEntity::new, SpawnGroup.MONSTER)
					.dimensions(0.6F, 1.7F)
					.build()
	);
	
	public static void registerModEntities() {
		AdditionalWeapons.LOGGER.info("Registering Mod Entities for " + AdditionalWeapons.MOD_ID);
		
		FabricDefaultAttributeRegistry.register(SOLDIER, SoldierEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(BANDIT, BanditEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(PIRATE, PirateEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(POWERWILD, PowerwildEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(WHITE_MUSHROOM, WhiteMushroomEntity.createAttributes());
		
		FabricDefaultAttributeRegistry.register(SHADOW, ShadowEntity.createAttributes());
	}
}
