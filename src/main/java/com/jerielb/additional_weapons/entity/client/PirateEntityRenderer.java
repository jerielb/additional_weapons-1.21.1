package com.jerielb.additional_weapons.entity.client;

import com.jerielb.additional_weapons.AdditionalWeapons;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraft.client.renderer.entity.state.ZombieRenderState;
import net.minecraft.resources.Identifier;

@Environment(EnvType.CLIENT)
public class PirateEntityRenderer extends ZombieRenderer {
	private static final Identifier PIRATE = Identifier.fromNamespaceAndPath(AdditionalWeapons.MOD_ID, "textures/entity/pirate.png");
	private static final Identifier PIRATE_BABY = Identifier.fromNamespaceAndPath(AdditionalWeapons.MOD_ID, "textures/entity/pirate_baby.png");

	public PirateEntityRenderer(EntityRendererProvider.Context context) {
		super(context);
	}

	public Identifier getTextureLocation(final ZombieRenderState state) {
		return state.isBaby ? PIRATE_BABY : PIRATE;
	}
}
