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
    public static final Item REFINED_URU_INGOT = registerItem("refined_uru_ingot", Item::new);
    public static final Item RAW_URU = registerItem("raw_uru", Item::new);
    public static final Item RAW_VIBRANIUM = registerItem("raw_vibranium", Item::new);
    public static final Item TIME_STONE = registerItem("time_stone", Item::new);
    public static final Item SPACE_STONE = registerItem("space_stone", Item::new);
    public static final Item REALITY_STONE = registerItem("reality_stone", Item::new);
    public static final Item MIND_STONE = registerItem("mind_stone", Item::new);
    public static final Item POWER_STONE = registerItem("power_stone", Item::new);
    public static final Item SOUL_STONE = registerItem("soul_stone", Item::new);

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        Identifier id = Identifier.fromNamespaceAndPath(AvengersAsemble.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);

        return Registry.register(BuiltInRegistries.ITEM, id, function.apply(new Item.Properties().setId(key)));
    }

    public static void registerModItems() {
        AvengersAsemble.LOGGER.info("Registering mod items for " + AvengersAsemble.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
        });
    }
}