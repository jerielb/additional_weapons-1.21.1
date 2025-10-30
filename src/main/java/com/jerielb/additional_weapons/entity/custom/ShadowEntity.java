package com.jerielb.additional_weapons.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.world.World;

public class ShadowEntity extends CreeperEntity {
	public ShadowEntity(EntityType<? extends ShadowEntity> entityType, World world) {
		super(entityType, world);
	}
	
	public static DefaultAttributeContainer.Builder createAttributes() {
		return createCreeperAttributes();
	}
}
