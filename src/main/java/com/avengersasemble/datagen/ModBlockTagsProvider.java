package com.avengersasemble.datagen;

import com.avengersasemble.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.VIBRANIUM_ORE)
                .add(ModBlocks.DEEPSLATE_VIBRANIUM_ORE)
                .add(ModBlocks.VIBRANIUM_BAR)
                .add(ModBlocks.ENDER_URU_ORE)
                .add(ModBlocks.URU_BLOCK);

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.VIBRANIUM_ORE)
                .add(ModBlocks.DEEPSLATE_VIBRANIUM_ORE)
                .add(ModBlocks.VIBRANIUM_BAR)
                .add(ModBlocks.ENDER_URU_ORE)
                .add(ModBlocks.URU_BLOCK);
    }
}
