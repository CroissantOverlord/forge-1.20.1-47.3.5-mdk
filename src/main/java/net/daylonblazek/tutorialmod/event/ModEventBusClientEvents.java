package net.daylonblazek.tutorialmod.event;

import net.daylonblazek.tutorialmod.TutorialMod;
import net.daylonblazek.tutorialmod.entity.client.ModModelLayers;
import net.daylonblazek.tutorialmod.entity.client.UtahraptorModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.UTAHRAPTOR_LAYER, UtahraptorModel::createBodyLayer);
    }
}
