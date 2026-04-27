package com.jerielb.additional_weapons;

import com.jerielb.additional_weapons.entity.ModEntityTypes;
import com.jerielb.additional_weapons.entity.client.ModEntityModelLayers;
import com.jerielb.additional_weapons.entity.client.ShadowEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.entity.EntityRenderers;

public class AdditionalWeaponsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
//		EntityRendererRegistry.register(ModEntities.SOLDIER, SoldierEntityRenderer::new);
//		EntityRendererRegistry.register(ModEntities.BANDIT, BanditEntityRenderer::new);
//		EntityRendererRegistry.register(ModEntities.PIRATE, PirateEntityRenderer::new);
//		EntityRendererRegistry.register(ModEntities.POWER_WILD, PowerWildEntityRenderer::new);
//		EntityRendererRegistry.register(ModEntities.WHITE_MUSHROOM, WhiteMushroomEntityRenderer::new);
//		EntityRendererRegistry.register(ModEntities.SHADOW, ShadowEntityRenderer::new);
		
		ModEntityModelLayers.registerModelLayers();
		EntityRenderers.register(ModEntityTypes.SHADOW, ShadowEntityRenderer::new);
	}
}
