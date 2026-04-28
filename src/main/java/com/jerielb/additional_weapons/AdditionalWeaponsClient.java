package com.jerielb.additional_weapons;

import com.jerielb.additional_weapons.entity.ModEntityTypes;
import com.jerielb.additional_weapons.entity.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.entity.EntityRenderers;

public class AdditionalWeaponsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		ModEntityModelLayers.registerModelLayers();
		EntityRenderers.register(ModEntityTypes.SHADOW, ShadowEntityRenderer::new);

		EntityRenderers.register(ModEntityTypes.BANDIT, BanditEntityRenderer::new);
		EntityRenderers.register(ModEntityTypes.PIRATE, PirateEntityRenderer::new);
		EntityRenderers.register(ModEntityTypes.POWER_WILD, PowerWildEntityRenderer::new);
		EntityRenderers.register(ModEntityTypes.SOLDIER, SoldierEntityRenderer::new);
		EntityRenderers.register(ModEntityTypes.WHITE_MUSHROOM, WhiteMushroomEntityRenderer::new);
	}
}
