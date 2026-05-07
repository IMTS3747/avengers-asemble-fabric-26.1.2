package com.avengersasemble.item;

import com.avengersasemble.AvengersAsemble;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function; // Added this import

public class ModItems {

    public static final Item VIBRANIUM_SHARD = registerItem("vibranium_shard", Item::new);
    public static final Item RAW_VIBRANIUM = registerItem("raw_vibranium", Item::new);

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        Identifier id = Identifier.fromNamespaceAndPath(AvengersAsemble.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);

        return Registry.register(BuiltInRegistries.ITEM, id, function.apply(new Item.Properties().setId(key)));
    }

    public static void registerModItems() {
        AvengersAsemble.LOGGER.info("Registering mod items for " + AvengersAsemble.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(VIBRANIUM_SHARD);
            output.accept(RAW_VIBRANIUM);
        } );
    }
}