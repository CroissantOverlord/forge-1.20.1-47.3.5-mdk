package net.daylonblazek.tutorialmod.item;

import net.daylonblazek.tutorialmod.TutorialMod;
import net.daylonblazek.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.AMBER.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Moditems.AMBER.get());
                        pOutput.accept(Moditems.UTAHRAPTOR_EGG.get());
                        pOutput.accept(Moditems.UTAHRAPTOR_SPAWN_EGG.get());
                        pOutput.accept(Moditems.SYRINGE_WITH_UTAHRAPTOR_DNA.get());

                        pOutput.accept(ModBlocks.AMBER_BLOCK.get());
                        pOutput.accept(ModBlocks.AMBER_ORE.get());
                        pOutput.accept(ModBlocks.DNA_EXTRACTOR.get());

                    })
                    .build());

    public  static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
