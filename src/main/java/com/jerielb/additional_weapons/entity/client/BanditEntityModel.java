package com.jerielb.additional_weapons.entity.client;

import com.jerielb.additional_weapons.entity.custom.BanditEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.AbstractZombieModel;

@Environment(EnvType.CLIENT)
public class BanditEntityModel<T extends BanditEntity> extends AbstractZombieModel<BanditEntity> {
	public BanditEntityModel(ModelPart modelPart) {
		super(modelPart);
	}
	
	@Override
	public boolean isAttacking(BanditEntity entity) {
		return entity.isAttacking();
	}
}
