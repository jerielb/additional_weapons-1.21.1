package com.jerielb.additional_weapons;

import com.jerielb.additional_weapons.item.ModItems;
import com.jerielb.additional_weapons.item.ModItemsGroup;
import com.jerielb.additional_weapons.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class AdditionalWeapons implements ModInitializer {
	public static final String MOD_ID = "additional_weapons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroup.registerItemGroups();
		ModItems.registerModItems();
		
		ModVillagers.registerVillagers();
		// Merchant Trades
		// NOVICE
		TradeOfferHelper.registerVillagerOffers(ModVillagers.MERCHANT, 1, factories -> {
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MUNNY, 8),
					Optional.of(new TradedItem(ModItems.KINGDOM_KEY, 1)),
					new ItemStack(ModItems.JUNGLE_KING, 1), 4, 7, 0.04f)
			));
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MUNNY, 8),
					Optional.of(new TradedItem(ModItems.KINGDOM_KEY, 1)),
					new ItemStack(ModItems.THREE_WISHES, 1), 4, 7, 0.04f)
			));
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MUNNY, 8),
					Optional.of(new TradedItem(ModItems.KINGDOM_KEY, 1)),
					new ItemStack(ModItems.WISHING_STAR, 1), 4, 7, 0.04f)
			));
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MUNNY, 8),
					Optional.of(new TradedItem(ModItems.KINGDOM_KEY, 1)),
					new ItemStack(ModItems.SPELLBINDER, 1), 4, 7, 0.04f)
			));
		});
		// APPRENTICE
		TradeOfferHelper.registerVillagerOffers(ModVillagers.MERCHANT, 2, factories -> {
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MUNNY, 8),
					Optional.of(new TradedItem(ModItems.KINGDOM_KEY, 1)),
					new ItemStack(ModItems.CRABCLAW, 1), 4, 7, 0.04f)
			));
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MUNNY, 8),
					Optional.of(new TradedItem(ModItems.KINGDOM_KEY, 1)),
					new ItemStack(ModItems.PUMPKINHEAD, 1), 4, 7, 0.04f)
			));
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MUNNY, 8),
					Optional.of(new TradedItem(ModItems.KINGDOM_KEY, 1)),
					new ItemStack(ModItems.FAIRY_HARP, 1), 4, 7, 0.04f)
			));
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MUNNY, 8),
					Optional.of(new TradedItem(ModItems.KINGDOM_KEY, 1)),
					new ItemStack(ModItems.METAL_CHOCOBO, 1), 4, 7, 0.04f)
			));
		});
		// JOURNEYMAN
		TradeOfferHelper.registerVillagerOffers(ModVillagers.MERCHANT, 3, factories -> {
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MUNNY, 8),
					Optional.of(new TradedItem(ModItems.KINGDOM_KEY, 1)),
					new ItemStack(ModItems.OLYMPIA, 1), 4, 7, 0.04f)
			));
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MUNNY, 8),
					Optional.of(new TradedItem(ModItems.KINGDOM_KEY, 1)),
					new ItemStack(ModItems.LADY_LUCK, 1), 4, 7, 0.04f)
			));
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MUNNY, 8),
					Optional.of(new TradedItem(ModItems.KINGDOM_KEY, 1)),
					new ItemStack(ModItems.OBLIVION, 1), 4, 7, 0.04f)
			));
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MUNNY, 8),
					Optional.of(new TradedItem(ModItems.KINGDOM_KEY, 1)),
					new ItemStack(ModItems.DIVINE_ROSE, 1), 4, 7, 0.04f)
			));
		});
		// EXPERT
		TradeOfferHelper.registerVillagerOffers(ModVillagers.MERCHANT, 4, factories -> {
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MUNNY, 8),
					Optional.of(new TradedItem(ModItems.KINGDOM_KEY, 1)),
					new ItemStack(ModItems.OATHKEEPER, 1), 4, 7, 0.04f)
			));
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MUNNY, 8),
					Optional.of(new TradedItem(ModItems.KINGDOM_KEY, 1)),
					new ItemStack(ModItems.LIONHEART, 1), 4, 7, 0.04f)
			));
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MUNNY, 8),
					Optional.of(new TradedItem(ModItems.KINGDOM_KEY, 1)),
					new ItemStack(ModItems.DIAMOND_DUST, 1), 4, 7, 0.04f)
			));
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.MUNNY, 8),
					Optional.of(new TradedItem(ModItems.KINGDOM_KEY, 1)),
					new ItemStack(ModItems.ONE_WINGED_ANGEL, 1), 4, 7, 0.04f)
			));
		});
		// MASTER
		TradeOfferHelper.registerVillagerOffers(ModVillagers.MERCHANT, 5, factories -> {
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(Items.NETHERITE_INGOT, 4),
					Optional.of(new TradedItem(ModItems.KINGDOM_KEY, 1)),
					new ItemStack(ModItems.ULTIMA_WEAPON, 1), 4, 7, 0.04f)
			));
		});
	}
}