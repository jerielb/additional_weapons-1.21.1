package com.jerielb.additional_weapons.entity.client;

import com.jerielb.additional_weapons.AdditionalWeapons;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraft.client.renderer.entity.state.ZombieRenderState;
import net.minecraft.resources.Identifier;

@Environment(EnvType.CLIENT)
public class PowerWildEntityRenderer extends ZombieRenderer {
	private static final Identifier POWER_WILD = Identifier.fromNamespaceAndPath(AdditionalWeapons.MOD_ID, "textures/entity/power_wild.png");
//	private static final Identifier POWER_WILD_BABY = Identifier.fromNamespaceAndPath(AdditionalWeapons.MOD_ID, "textures/entity/power_wild_baby.png");

	public PowerWildEntityRenderer(EntityRendererProvider.Context context) {
		super(context);
	}
	
	public Identifier getTextureLocation(final ZombieRenderState state) {
		return state.isBaby ? POWER_WILD : POWER_WILD;
	}
}
