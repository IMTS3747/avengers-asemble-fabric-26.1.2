package com.avengersasemble.datagen;

import com.avengersasemble.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.VIBRANIUM_SHARD, ModelTemplates. FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_VIBRANIUM, ModelTemplates. FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TIME_STONE, ModelTemplates. FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SPACE_STONE, ModelTemplates. FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.REALITY_STONE, ModelTemplates. FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MIND_STONE, ModelTemplates. FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.POWER_STONE, ModelTemplates. FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SOUL_STONE, ModelTemplates. FLAT_ITEM);
    }
}
