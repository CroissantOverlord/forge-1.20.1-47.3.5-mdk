package net.daylonblazek.tutorialmod.datagen;

import net.daylonblazek.tutorialmod.TutorialMod;
import net.daylonblazek.tutorialmod.block.ModBlocks;
import net.daylonblazek.tutorialmod.item.Moditems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.entity.projectile.ThrownEgg;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.stringtemplate.v4.misc.Misc;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AMBER_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Moditems.AMBER.get())
                .unlockedBy(getHasName(Moditems.AMBER.get()), has(Moditems.AMBER.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DNA_EXTRACTOR.get())
                .pattern("SSS")
                .pattern("S#S")
                .pattern("AAA")
                .define('A', Items.IRON_BLOCK)
                .define('S', Items.IRON_INGOT)
                .define('#', Moditems.EMPTY_SYRINGE.get())
                .unlockedBy(getHasName(Moditems.EMPTY_SYRINGE.get()), has(Moditems.EMPTY_SYRINGE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.INCUBATOR.get())
                .pattern("SSS")
                .pattern("S#S")
                .pattern("ADA")
                .define('A', Items.IRON_BLOCK)
                .define('S', Items.IRON_INGOT)
                .define('#', Items.GLASS_PANE)
                .define('D', Items.REDSTONE)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(pWriter);








        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.EMPTY_SYRINGE.get())
                .pattern("S  ")
                .pattern(" A ")
                .pattern("  A")
                .define('A', Blocks.GLASS)
                .define('S', Items.IRON_INGOT)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Moditems.AMBER.get(), 9)
                .requires(ModBlocks.AMBER_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.AMBER_BLOCK.get()), has(ModBlocks.AMBER_BLOCK.get()))
                .save(pWriter);


    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, TutorialMod.MOD_ID + ":" + (pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
