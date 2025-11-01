package com.jerielb.additional_weapons.entity.client;

import com.jerielb.additional_weapons.entity.custom.PowerwildEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.AbstractZombieModel;

@Environment(EnvType.CLIENT)
public class PowerwildEntityModel<T extends PowerwildEntity> extends AbstractZombieModel<PowerwildEntity> {
	public PowerwildEntityModel(ModelPart modelPart) {
		super(modelPart);
	}
	
	@Override
	public boolean isAttacking(PowerwildEntity entity) {
		return entity.isAttacking();
	}
}
