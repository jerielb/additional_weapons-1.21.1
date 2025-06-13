package com.jerielb.additional_weapons.entity.client;

import com.jerielb.additional_weapons.entity.custom.SoldierEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.AbstractZombieModel;

@Environment(EnvType.CLIENT)
public class SoldierEntityModel<T extends SoldierEntity> extends AbstractZombieModel<SoldierEntity> {
	public SoldierEntityModel(ModelPart modelPart) {
		super(modelPart);
	}
	
	@Override
	public boolean isAttacking(SoldierEntity entity) {
		return entity.isAttacking();
	}
}
