package com.jerielb.additional_weapons.entity.client;

import com.jerielb.additional_weapons.entity.custom.ShadowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.CreeperEntityModel;

@Environment(EnvType.CLIENT)
public class ShadowEntityModel<T extends ShadowEntity> extends CreeperEntityModel<ShadowEntity> {
	public ShadowEntityModel(ModelPart root) {
		super(root);
	}
}
