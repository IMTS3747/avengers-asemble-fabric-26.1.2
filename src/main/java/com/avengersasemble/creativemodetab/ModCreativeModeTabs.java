package com.avengersasemble.creativemodetab;

import com.avengersasemble.AvengersAsemble;
import com.avengersasemble.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab MARVEL_ORES_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(AvengersAsemble.MOD_ID, "marvel_ores_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VIBRANIUM_SHARD))
                    .title(Component.translatable("creativetab.avengersasemble.ores"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.VIBRANIUM_SHARD);
                        output.accept(ModItems.RAW_VIBRANIUM);
                    }).build());

    public static final CreativeModeTab INFINITY_ITEMS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(AvengersAsemble.MOD_ID, "infinity_items_tab"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TIME_STONE))
                    .title(Component.translatable("Infinity Items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.TIME_STONE);
                        output.accept(ModItems.SPACE_STONE);
                        output.accept(ModItems.REALITY_STONE);
                        output.accept(ModItems.SOUL_STONE);
                        output.accept(ModItems.POWER_STONE);
                        output.accept(ModItems.MIND_STONE);
                    }).build());

    public static void registerModCreativeModeTabs(){
        AvengersAsemble.LOGGER.info("Registering Creative Mode Tabs for " + AvengersAsemble.MOD_ID);
    }
}