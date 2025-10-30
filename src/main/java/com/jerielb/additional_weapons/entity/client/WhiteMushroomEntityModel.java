package com.jerielb.additional_weapons.entity.client;

import com.jerielb.additional_weapons.entity.custom.WhiteMushroomEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.AbstractZombieModel;

@Environment(EnvType.CLIENT)
public class WhiteMushroomEntityModel<T extends WhiteMushroomEntity> extends AbstractZombieModel<WhiteMushroomEntity> {
	public WhiteMushroomEntityModel(ModelPart modelPart) {
		super(modelPart);
	}
	
	@Override
	public boolean isAttacking(WhiteMushroomEntity entity) {
		return entity.isAttacking();
	}
}
