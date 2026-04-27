package com.jerielb.additional_weapons.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.AnimationState;

@Environment(EnvType.CLIENT)
public class ShadowEntityRenderState extends LivingEntityRenderState {
	public final AnimationState idleAnimationState;
	
	public ShadowEntityRenderState() {
		this.idleAnimationState = new AnimationState();
	}
}
