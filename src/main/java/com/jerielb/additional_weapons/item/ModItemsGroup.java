package com.jerielb.additional_weapons.item;

import com.jerielb.additional_weapons.AdditionalWeapons;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroup {
	public static final ItemGroup MISC = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(AdditionalWeapons.MOD_ID, "misc"),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(ModItems.MUNNY)) // icon of the creative tab
					.displayName(Text.translatable("itemgroup.additional_weapons.misc"))
					.entries((displayContext, entries) -> {
						entries.add(ModItems.MUNNY);
					})
					.build());
	
	public static final ItemGroup KEYBLADES = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(AdditionalWeapons.MOD_ID, "keyblades"),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(ModItems.KINGDOM_KEY)) // icon of the creative tab
					.displayName(Text.translatable("itemgroup.additional_weapons.keyblades"))
					.entries((displayContext, entries) -> {
						entries.add(ModItems.KINGDOM_KEY);
						entries.add(ModItems.JUNGLE_KING);
						entries.add(ModItems.THREE_WISHES);
						entries.add(ModItems.WISHING_STAR);
						entries.add(ModItems.SPELLBINDER);
						entries.add(ModItems.CRABCLAW);
						entries.add(ModItems.PUMPKINHEAD);
						entries.add(ModItems.FAIRY_HARP);
						entries.add(ModItems.METAL_CHOCOBO);
						entries.add(ModItems.OLYMPIA);
						entries.add(ModItems.LADY_LUCK);
						entries.add(ModItems.OBLIVION);
						entries.add(ModItems.DIVINE_ROSE);
						entries.add(ModItems.OATHKEEPER);
						entries.add(ModItems.LIONHEART);
						entries.add(ModItems.DIAMOND_DUST);
						entries.add(ModItems.ONE_WINGED_ANGEL);
						entries.add(ModItems.ULTIMA_WEAPON);
					})
					.build());
	
	public static void registerItemGroups() {
		AdditionalWeapons.LOGGER.info("Registering Item Groups for " + AdditionalWeapons.MOD_ID);
	}
}
