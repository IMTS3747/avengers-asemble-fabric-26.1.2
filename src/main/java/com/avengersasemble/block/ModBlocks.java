package com.avengersasemble.block;

import com.avengersasemble.AvengersAsemble;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;

public class ModBlocks {
    public static final Block VIBRANIUM_BAR = registerBlock("vibranium_bar",
            properties -> new Block(properties.strength(3f, 600f)
                    .mapColor(MapColor.COLOR_PURPLE).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final Block DEEPSLATE_VIBRANIUM_ORE = registerBlock("deepslate_vibranium_ore",
            properties -> new Block(properties.strength(1.5f, 7f)
                    .mapColor(MapColor.COLOR_PURPLE).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final Block VIBRANIUM_ORE = registerBlock("vibranium_ore",
            properties -> new Block(properties.strength(1f, 6f)
                    .mapColor(MapColor.COLOR_PURPLE).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block ENDER_URU_ORE = registerBlock("ender_uru_ore",
            properties -> new Block(properties.strength(1.5f, 6f)
                    .mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block TESSERACT = registerBlock("tesseract",
            properties -> new Block(properties.strength(3f, 600f)
                    .mapColor(MapColor.COLOR_BLUE).sound(SoundType.GLASS)));
    public static final Block URU_BLOCK = registerBlock("uru_block",
            properties -> new Block(properties.strength(3f, 600f)
                    .mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops().sound(SoundType.IRON)));



    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(AvengersAsemble.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(AvengersAsemble.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(AvengersAsemble.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AvengersAsemble.MOD_ID, name)))));
    }

    public static void registerModBlocks(){
        AvengersAsemble.LOGGER.info("Registering Mod Blocks for " + AvengersAsemble.MOD_ID);
    }
}
