package com.jerielb.additional_weapons.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.minecraft.world.level.Level;

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
}
