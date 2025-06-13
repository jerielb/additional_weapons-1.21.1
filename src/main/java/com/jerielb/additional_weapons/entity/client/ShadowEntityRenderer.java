package com.jerielb.additional_weapons.entity.client;

import com.jerielb.additional_weapons.AdditionalWeapons;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.CreeperEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ShadowEntityRenderer extends CreeperEntityRenderer {
	private static final Identifier TEXTURE = Identifier.of(AdditionalWeapons.MOD_ID, "textures/entity/shadow.png");
	
	public ShadowEntityRenderer(EntityRendererFactory.Context context) {
		super(context);
	}
	
	public Identifier getTexture(CreeperEntity creeperEntity) {
		return TEXTURE;
	}
}
