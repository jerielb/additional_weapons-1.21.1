package com.jerielb.additional_weapons.entity.client;

import com.jerielb.additional_weapons.AdditionalWeapons;
import com.jerielb.additional_weapons.entity.custom.ShadowEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;

public class ShadowEntityRenderer extends MobRenderer<ShadowEntity, ShadowEntityRenderState, ShadowEntityModel> {
	private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath(AdditionalWeapons.MOD_ID, "textures/entity/shadow.png");
	
	public ShadowEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new ShadowEntityModel(context.bakeLayer(ModEntityModelLayers.SHADOW)), 0.375f); // 0.375 shadow radius
	}
	
	@Override
	public ShadowEntityRenderState createRenderState() {
		return new ShadowEntityRenderState();
	}
	
	@Override
	public Identifier getTextureLocation(ShadowEntityRenderState state) {
		return TEXTURE;
	}
	
	public void extractRenderState(final ShadowEntity entity, final ShadowEntityRenderState state, final float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		extractAdditionalState(entity, state, partialTicks);
	}
	
	static void extractAdditionalState(ShadowEntity entity, ShadowEntityRenderState state, float partialTicks) {
		state.idleAnimationState.copyFrom(entity.idleAnimationState);
	}
}
