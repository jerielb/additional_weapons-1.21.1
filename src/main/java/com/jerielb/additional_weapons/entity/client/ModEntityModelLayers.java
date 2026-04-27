package com.jerielb.additional_weapons.entity.client;

import com.jerielb.additional_weapons.AdditionalWeapons;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.Identifier;

public class ModEntityModelLayers {
	public static final ModelLayerLocation SHADOW = createMain("shadow");
	public static final ModelLayerLocation BANDIT = createMain("bandit");
	
	private static ModelLayerLocation createMain(String name) {
		return new ModelLayerLocation(Identifier.fromNamespaceAndPath(AdditionalWeapons.MOD_ID, name), "main");
	}
	
	public static void registerModelLayers() {
		ModelLayerRegistry.registerModelLayer(ModEntityModelLayers.SHADOW, ShadowEntityModel::getTexturedModelData);
	}
}
