package com.jerielb.additional_weapons.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.monster.zombie.AbstractZombieModel;
import net.minecraft.client.renderer.entity.state.ZombieRenderState;

@Environment(EnvType.CLIENT)
public class PowerWildEntityModel<T extends ZombieRenderState> extends AbstractZombieModel<T> {
	public PowerWildEntityModel(ModelPart root) {
		super(root);
	}
}
