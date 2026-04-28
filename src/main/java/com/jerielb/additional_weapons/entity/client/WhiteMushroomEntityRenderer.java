package com.jerielb.additional_weapons.entity.client;

import com.jerielb.additional_weapons.AdditionalWeapons;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraft.client.renderer.entity.state.ZombieRenderState;
import net.minecraft.resources.Identifier;

@Environment(EnvType.CLIENT)
public class WhiteMushroomEntityRenderer extends ZombieRenderer {
	private static final Identifier WHITE_MUSHROOM = Identifier.fromNamespaceAndPath(AdditionalWeapons.MOD_ID, "textures/entity/white_mushroom.png");
	private static final Identifier WHITE_MUSHROOM_BABY = Identifier.fromNamespaceAndPath(AdditionalWeapons.MOD_ID, "textures/entity/white_mushroom_baby.png");

	public WhiteMushroomEntityRenderer(EntityRendererProvider.Context context) {
		super(context);
	}
	
	public Identifier getTextureLocation(final ZombieRenderState state) {
		return state.isBaby ? WHITE_MUSHROOM_BABY : WHITE_MUSHROOM;
	}
}
