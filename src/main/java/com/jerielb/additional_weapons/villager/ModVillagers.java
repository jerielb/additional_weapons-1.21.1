package com.jerielb.additional_weapons.villager;

import com.google.common.collect.ImmutableSet;
import com.jerielb.additional_weapons.AdditionalWeapons;
import com.jerielb.additional_weapons.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {
	public static final RegistryKey<PointOfInterestType> MERCHANT_POI_KEY = registerPoiKey("merchant_poi");
	public static final PointOfInterestType MERCHANT_POI = registerPOI("merchant_poi", ModBlocks.CHISELED_POLISHED_BLACKSTONE_1);
	
	public static final VillagerProfession MERCHANT = registerProfession("merchant", MERCHANT_POI_KEY);
	
	public static final RegistryKey<PointOfInterestType> MERCHANT_2_POI_KEY = registerPoiKey("merchant_2_poi");
	public static final PointOfInterestType MERCHANT_2_POI = registerPOI("merchant_2_poi", ModBlocks.CHISELED_POLISHED_BLACKSTONE_2);
	
	public static final VillagerProfession MERCHANT_2 = registerProfession("merchant_2", MERCHANT_2_POI_KEY);
	
	private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
		return Registry.register(Registries.VILLAGER_PROFESSION, Identifier.of(AdditionalWeapons.MOD_ID, name),
				new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
						ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_LIBRARIAN));
	}
	
	private static PointOfInterestType registerPOI(String name, Block block) {
		return PointOfInterestHelper.register(Identifier.of(AdditionalWeapons.MOD_ID, name),
				1, 1, block);
	}
	
	private static RegistryKey<PointOfInterestType> registerPoiKey(String name) {
		return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(AdditionalWeapons.MOD_ID, name));
	}
	
	public static void registerVillagers() {
		AdditionalWeapons.LOGGER.info("Registering Villagers for " + AdditionalWeapons.MOD_ID);
	}
}
