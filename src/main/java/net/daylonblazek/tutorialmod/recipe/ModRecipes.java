package net.daylonblazek.tutorialmod.recipe;

import net.daylonblazek.tutorialmod.TutorialMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, TutorialMod.MOD_ID);


    public static final RegistryObject<RecipeSerializer<DNAExtractorRecipe>> DNA_EXTRACTOR_SERIALIZER =
            SERIALIZERS.register("dna_extractor", () -> DNAExtractorRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<IncubatorRecipe>> INCUBATOR_SERIALIZER =
            SERIALIZERS.register("incubator", () -> IncubatorRecipe.Serializer.INSTANCE);

    public  static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
