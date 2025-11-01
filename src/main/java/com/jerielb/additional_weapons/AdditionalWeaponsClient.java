package com.jerielb.additional_weapons;

import com.jerielb.additional_weapons.entity.ModEntities;
import com.jerielb.additional_weapons.entity.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class AdditionalWeaponsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		EntityRendererRegistry.register(ModEntities.SOLDIER, SoldierEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.BANDIT, BanditEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.PIRATE, PirateEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.POWERWILD, PowerwildEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.WHITE_MUSHROOM, WhiteMushroomEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.SHADOW, ShadowEntityRenderer::new);
	}
}
