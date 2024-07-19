package net.daylonblazek.tutorialmod.event;


import net.daylonblazek.tutorialmod.TutorialMod;
import net.daylonblazek.tutorialmod.entity.ModEntities;
import net.daylonblazek.tutorialmod.entity.custom.StegosaurusEntity;
import net.daylonblazek.tutorialmod.entity.custom.UtahraptorEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.UTAHRAPTOR.get(), UtahraptorEntity.createAttributes().build());
        event.put(ModEntities.STEGOSAURUS.get(), StegosaurusEntity.createAttributes().build());
    }

}
