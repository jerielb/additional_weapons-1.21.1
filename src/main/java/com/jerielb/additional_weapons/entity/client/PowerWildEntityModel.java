package com.jerielb.additional_weapons.entity.client;

import com.jerielb.additional_weapons.entity.custom.PowerWildEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.AbstractZombieModel;

@Environment(EnvType.CLIENT)
public class PowerWildEntityModel<T extends PowerWildEntity> extends AbstractZombieModel<PowerWildEntity> {
	public PowerWildEntityModel(ModelPart modelPart) {
		super(modelPart);
	}
	
	@Override
	public boolean isAttacking(PowerWildEntity entity) {
		return entity.isAttacking();
	}
}
