package com.avengersasemble.datagen;

import com.avengersasemble.block.ModBlocks;
import com.avengersasemble.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

import static com.avengersasemble.block.ModBlocks.*;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(VIBRANIUM_BAR);
        dropSelf(URU_BLOCK);
        dropSelf(TESSERACT);


        add(ModBlocks.VIBRANIUM_ORE, createOreDrop(ModBlocks.VIBRANIUM_ORE, ModItems.RAW_VIBRANIUM));
        add(ModBlocks.DEEPSLATE_VIBRANIUM_ORE, createOreDrop(ModBlocks.DEEPSLATE_VIBRANIUM_ORE, ModItems.RAW_VIBRANIUM));
        add(ENDER_URU_ORE, createOreDrop(ENDER_URU_ORE, ModItems.RAW_URU));
    }
}
