package net.daylonblazek.tutorialmod.item;

import net.daylonblazek.tutorialmod.TutorialMod;
import net.daylonblazek.tutorialmod.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VELOCIRAPTOR_EGG = ITEMS.register("velociraptor_egg",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> UTAHRAPTOR_SPAWN_EGG = ITEMS.register("utahraptor_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.UTAHRAPTOR, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));

}
