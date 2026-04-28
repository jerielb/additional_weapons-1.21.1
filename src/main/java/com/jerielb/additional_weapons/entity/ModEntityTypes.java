package com.jerielb.additional_weapons.entity;

import com.jerielb.additional_weapons.AdditionalWeapons;
import com.jerielb.additional_weapons.entity.custom.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ModEntityTypes {
	public static final EntityType<BanditEntity> BANDIT = register(
			"bandit",
			EntityType.Builder.<BanditEntity>of(BanditEntity::new, MobCategory.MONSTER)
					.sized(0.6f, 1.95f)
	);

	public static final EntityType<PirateEntity> PIRATE = register(
			"pirate",
			EntityType.Builder.<PirateEntity>of(PirateEntity::new, MobCategory.MONSTER)
					.sized(0.6f, 1.95f)
	);

	public static final EntityType<PowerWildEntity> POWER_WILD = register(
			"power_wild",
			EntityType.Builder.<PowerWildEntity>of(PowerWildEntity::new, MobCategory.MONSTER)
					.sized(0.6f, 1.95f)
	);

	public static final EntityType<ShadowEntity> SHADOW = register(
			"shadow",
			EntityType.Builder.<ShadowEntity>of(ShadowEntity::new, MobCategory.MONSTER)
					.sized(0.5f, 0.9f)
	);
	
	public static final EntityType<SoldierEntity> SOLDIER = register(
			"soldier",
			EntityType.Builder.<SoldierEntity>of(SoldierEntity::new, MobCategory.MONSTER)
					.sized(0.5f, 0.9f)
	);

	public static final EntityType<WhiteMushroomEntity> WHITE_MUSHROOM = register(
			"white_mushroom",
			EntityType.Builder.<WhiteMushroomEntity>of(WhiteMushroomEntity::new, MobCategory.MONSTER)
					.sized(0.5f, 0.9f)
	);

	private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
		ResourceKey<EntityType<?>> key = ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(AdditionalWeapons.MOD_ID, name));
		return Registry.register(BuiltInRegistries.ENTITY_TYPE, key, builder.build(key));
	}

	public static void registerModEntityTypes() {
		AdditionalWeapons.LOGGER.info("Registering Mod EntityTypes for " + AdditionalWeapons.MOD_ID);
		
		FabricDefaultAttributeRegistry.register(SHADOW, ShadowEntity.createAttributes());
		
		FabricDefaultAttributeRegistry.register(BANDIT, BanditEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(PIRATE, PirateEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(POWER_WILD, PowerWildEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(SOLDIER, SoldierEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(WHITE_MUSHROOM, WhiteMushroomEntity.createAttributes());
		
		initModEntities();
	}
	
	public static void initModEntities() {
//		ShadowEntity.init();
		
		BanditEntity.init();
		PirateEntity.init();
		PowerWildEntity.init();
		SoldierEntity.init();
		WhiteMushroomEntity.init();
	}
}
