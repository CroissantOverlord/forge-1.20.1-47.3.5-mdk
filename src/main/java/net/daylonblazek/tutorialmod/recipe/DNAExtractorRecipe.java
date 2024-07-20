package net.daylonblazek.tutorialmod.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.daylonblazek.tutorialmod.TutorialMod;
import net.daylonblazek.tutorialmod.item.Moditems;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class DNAExtractorRecipe implements Recipe<SimpleContainer> {
    private final NonNullList<Ingredient> inputItems;
    private final ItemStack output;
    private final ResourceLocation id;

    public DNAExtractorRecipe(NonNullList<Ingredient> inputItems, ItemStack output, ResourceLocation id) {
        this.inputItems = inputItems;
        this.output = output;
        this.id = id;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        if(pLevel.isClientSide()) {
            return false;
        }

        return inputItems.get(0).test(pContainer.getItem(0));
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer, RegistryAccess pRegistryAccess) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }
    @Override
    public ItemStack getResultItem(RegistryAccess pRegistryAccess) {
        // Randomly determine which DNA syringe to return
        Random random = new Random();
        if (random.nextFloat() < 0.5) {
            Item utahraptorDNAItem = Moditems.SYRINGE_WITH_UTAHRAPTOR_DNA.get();
            return new ItemStack(utahraptorDNAItem);
        } else {
            Item stegosaurusDNAItem = Moditems.SYRINGE_WITH_STEGOSAURUS_DNA.get();
            return new ItemStack(stegosaurusDNAItem);
        }
    }


    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<DNAExtractorRecipe> {
        public static final Type INSTANCE = new Type();
        public static final String ID = "dna_extractor";
    }

    public static class Serializer implements RecipeSerializer<DNAExtractorRecipe> {
        public static Serializer INSTANCE = new Serializer();
        public  static final ResourceLocation ID = new ResourceLocation(TutorialMod.MOD_ID, "dna_extractor");

        @Override
        public DNAExtractorRecipe fromJson(ResourceLocation pRecipeId, JsonObject pSerializedRecipe) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, "output"));

            JsonArray ingredients = GsonHelper.getAsJsonArray(pSerializedRecipe, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(1, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }


            return new DNAExtractorRecipe(inputs, output, pRecipeId);
        }

        @Override
        public @Nullable DNAExtractorRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(pBuffer.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(pBuffer));
            }



            ItemStack output = pBuffer.readItem();
            return new DNAExtractorRecipe(inputs, output, pRecipeId);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, DNAExtractorRecipe pRecipe) {
            pBuffer.writeInt((pRecipe.inputItems.size()));

            for (Ingredient ingredient : pRecipe.getIngredients()) {
                ingredient.toNetwork(pBuffer);

            }

            pBuffer.writeItemStack(pRecipe.getResultItem(null), false);

        }

    }
}