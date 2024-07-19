package net.daylonblazek.tutorialmod.datagen;

import net.daylonblazek.tutorialmod.TutorialMod;
import net.daylonblazek.tutorialmod.item.Moditems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MinecartItem;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(Moditems.AMBER);
        simpleItem(Moditems.AMBER_WITH_MOSQUITO);
        simpleItem(Moditems.UTAHRAPTOR_EGG);
        simpleItem(Moditems.SYRINGE_WITH_UTAHRAPTOR_DNA);
        simpleItem(Moditems.SYRINGE_WITH_STEGOSAURUS_DNA);
        simpleItem(Moditems.EMPTY_SYRINGE);

        withExistingParent(Moditems.UTAHRAPTOR_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(Moditems.STEGOSAURUS_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TutorialMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
