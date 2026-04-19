package com.jerielb.additional_weapons.util;

import com.jerielb.additional_weapons.AdditionalWeapons;
import com.jerielb.additional_weapons.item.ModItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModModelPredicates {
	public static void registerModelPredicates() {
		AdditionalWeapons.LOGGER.info("Registering Model Predicates for " + AdditionalWeapons.MOD_ID);
		
		registerCustomShield(ModItems.KNIGHTS_SHIELD);
		registerCustomShield(ModItems.DREAM_SHIELD);
	}
	
	private static void registerCustomShield(Item item) {
		ModelPredicateProviderRegistry.register(item, Identifier.ofVanilla("blocking"), (stack, world, entity, seed) ->
			entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F
		);
	}
}
