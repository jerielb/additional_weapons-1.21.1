package com.jerielb.additional_weapons.entity.custom;

import com.jerielb.additional_weapons.entity.ModEntityTypes;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;

public class ShadowEntity extends PathfinderMob {
	public final AnimationState idleAnimationState = new AnimationState();
	private int idleAnimationTimeout = 0;
	
	public ShadowEntity(Level world) {
		this(ModEntityTypes.SHADOW, world);
	}
	public ShadowEntity(EntityType<? extends ShadowEntity> entityType, Level world) {
		super(entityType, world);
	}
	
	public static AttributeSupplier.Builder createCubeAttributes() {
		return PathfinderMob.createMobAttributes()
				.add(Attributes.MAX_HEALTH, 18)
				.add(Attributes.MOVEMENT_SPEED, 0.35);
	}
	
	public void tick() {
		super.tick();
		
		if (this.level().isClientSide()) {
			this.setupAnimationStates();
		}
	}
	
	private void setupAnimationStates() {
		if (this.idleAnimationTimeout <= 0) {
			this.idleAnimationTimeout = 60;
			this.idleAnimationState.start(this.tickCount);
		} else {
			--this.idleAnimationTimeout;
		}
	}
}
