package com.jerielb.additional_weapons.entity.client;

import com.jerielb.additional_weapons.AdditionalWeapons;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ZombieEntityRenderer;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class BanditEntityRenderer extends ZombieEntityRenderer {
	private static final Identifier TEXTURE = Identifier.of(AdditionalWeapons.MOD_ID, "textures/entity/bandit.png");
	
	public BanditEntityRenderer(EntityRendererFactory.Context context) {
		super(context);
	}
	
	public Identifier getTexture(ZombieEntity zombieEntity) {
		return TEXTURE;
	}
}
