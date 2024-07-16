package net.daylonblazek.tutorialmod.block.entity;

import net.daylonblazek.tutorialmod.TutorialMod;
import net.daylonblazek.tutorialmod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TutorialMod.MOD_ID);


    public static final RegistryObject<BlockEntityType<DNAExtractorBlockEntity>> DNA_EXTRACTOR_BE =
            BLOCK_ENTITIES.register("dna_extractor_be", () ->
                    BlockEntityType.Builder.of(DNAExtractorBlockEntity::new,
                            ModBlocks.DNA_EXTRACTOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<IncubatorBlockEntity>> INCUBATOR_BE =
            BLOCK_ENTITIES.register("incubator_be", () ->
                    BlockEntityType.Builder.of(IncubatorBlockEntity::new,
                            ModBlocks.INCUBATOR.get()).build(null));

    public static void  register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}