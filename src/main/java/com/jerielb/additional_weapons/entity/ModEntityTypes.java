package com.jerielb.additional_weapons.entity;

import com.jerielb.additional_weapons.AdditionalWeapons;
import com.jerielb.additional_weapons.entity.custom.ShadowEntity;
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
//	public static final EntityType<BanditEntity> BANDIT = register(
//			"bandit",
//			EntityType.Builder.<BanditEntity>of(BanditEntity::new, MobCategory.MONSTER)
//					.sized(0.6f, 1.95f)
//	);
//
//	public static final EntityType<PirateEntity> PIRATE = Registry.register(
//			Registries.ENTITY_TYPE,
//			Identifier.of(AdditionalWeapons.MOD_ID, "pirate"),
//			EntityType.Builder.create(PirateEntity::new, SpawnGroup.MONSTER)
//					.dimensions(0.6F, 1.95F)
//					.build()
//	);
//
//	public static final EntityType<PowerWildEntity> POWER_WILD = Registry.register(
//			Registries.ENTITY_TYPE,
//			Identifier.of(AdditionalWeapons.MOD_ID, "power_wild"),
//			EntityType.Builder.create(PowerWildEntity::new, SpawnGroup.MONSTER)
//					.dimensions(0.6F, 1.95F)
//					.build()
//	);

	public static final EntityType<ShadowEntity> SHADOW = register(
			"shadow",
			EntityType.Builder.<ShadowEntity>of(ShadowEntity::new, MobCategory.MONSTER)
					.sized(0.5f, 0.9f)
	);
	
//	public static final EntityType<SoldierEntity> SOLDIER = Registry.register(
//			Registries.ENTITY_TYPE,
//			Identifier.of(AdditionalWeapons.MOD_ID, "soldier"),
//			EntityType.Builder.create(SoldierEntity::new, SpawnGroup.MONSTER)
//					.dimensions(0.6F, 1.95F)
//					.build()
//	);
//
//	public static final EntityType<WhiteMushroomEntity> WHITE_MUSHROOM = Registry.register(
//			Registries.ENTITY_TYPE,
//			Identifier.of(AdditionalWeapons.MOD_ID, "white_mushroom"),
//			EntityType.Builder.create(WhiteMushroomEntity::new, SpawnGroup.MONSTER)
//					.dimensions(0.6F, 1.95F)
//					.build()
//	);

	private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
		ResourceKey<EntityType<?>> key = ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(AdditionalWeapons.MOD_ID, name));
		return Registry.register(BuiltInRegistries.ENTITY_TYPE, key, builder.build(key));
	}

	public static void registerModEntityTypes() {
		AdditionalWeapons.LOGGER.info("Registering Mod EntityTypes for " + AdditionalWeapons.MOD_ID);

//		FabricDefaultAttributeRegistry.register(BANDIT, BanditEntity.createCubeAttributes());
//		FabricDefaultAttributeRegistry.register(PIRATE, PirateEntity.createCubeAttributes());
//		FabricDefaultAttributeRegistry.register(POWER_WILD, PowerWildEntity.createCubeAttributes());
		FabricDefaultAttributeRegistry.register(SHADOW, ShadowEntity.createCubeAttributes());
//		FabricDefaultAttributeRegistry.register(SOLDIER, SoldierEntity.createCubeAttributes());
//		FabricDefaultAttributeRegistry.register(WHITE_MUSHROOM, WhiteMushroomEntity.createCubeAttributes());
	}
}
