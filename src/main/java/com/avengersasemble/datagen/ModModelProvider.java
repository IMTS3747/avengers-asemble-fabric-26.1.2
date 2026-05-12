package com.avengersasemble.datagen;

import com.avengersasemble.block.ModBlocks;
import com.avengersasemble.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.VIBRANIUM_BAR);
        blockModelGenerators.createTrivialCube(ModBlocks.VIBRANIUM_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_VIBRANIUM_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.ENDER_URU_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.URU_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.TESSERACT);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.VIBRANIUM_SHARD, ModelTemplates. FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_VIBRANIUM, ModelTemplates. FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.REFINED_URU_INGOT, ModelTemplates. FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_URU, ModelTemplates. FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TIME_STONE, ModelTemplates. FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SPACE_STONE, ModelTemplates. FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.REALITY_STONE, ModelTemplates. FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MIND_STONE, ModelTemplates. FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.POWER_STONE, ModelTemplates. FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SOUL_STONE, ModelTemplates. FLAT_ITEM);
    }
}
