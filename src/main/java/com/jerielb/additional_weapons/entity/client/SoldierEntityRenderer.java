package com.jerielb.additional_weapons.entity.client;

import com.jerielb.additional_weapons.AdditionalWeapons;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraft.client.renderer.entity.state.ZombieRenderState;
import net.minecraft.resources.Identifier;

@Environment(EnvType.CLIENT)
public class SoldierEntityRenderer extends ZombieRenderer {
	private static final Identifier SOLDIER = Identifier.fromNamespaceAndPath(AdditionalWeapons.MOD_ID, "textures/entity/soldier.png");
//	private static final Identifier SOLDIER_BABY = Identifier.fromNamespaceAndPath(AdditionalWeapons.MOD_ID, "textures/entity/soldier_baby.png");

	public SoldierEntityRenderer(EntityRendererProvider.Context context) {
		super(context);
	}
	
	public Identifier getTextureLocation(final ZombieRenderState state) {
		return state.isBaby ? SOLDIER : SOLDIER;
	}
}
