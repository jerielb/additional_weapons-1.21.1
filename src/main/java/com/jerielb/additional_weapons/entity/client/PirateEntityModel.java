package com.jerielb.additional_weapons.entity.client;

import com.jerielb.additional_weapons.entity.custom.PirateEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.AbstractZombieModel;

@Environment(EnvType.CLIENT)
public class PirateEntityModel<T extends PirateEntity> extends AbstractZombieModel<PirateEntity> {
	public PirateEntityModel(ModelPart modelPart) {
		super(modelPart);
	}
	
	@Override
	public boolean isAttacking(PirateEntity entity) {
		return entity.isAttacking();
	}
}
