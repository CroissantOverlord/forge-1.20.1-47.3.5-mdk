package net.daylonblazek.tutorialmod.datagen;

import net.daylonblazek.tutorialmod.TutorialMod;
import net.daylonblazek.tutorialmod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator  extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.AMBER_BLOCK.get())
                .add(ModBlocks.AMBER_ORE.get());


        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.AMBER_BLOCK.get(),
                        ModBlocks.AMBER_ORE.get());



        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);





    }
}