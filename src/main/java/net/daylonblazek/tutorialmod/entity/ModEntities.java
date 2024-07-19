package net.daylonblazek.tutorialmod.entity;

import net.daylonblazek.tutorialmod.TutorialMod;
import net.daylonblazek.tutorialmod.entity.custom.StegosaurusEntity;
import net.daylonblazek.tutorialmod.entity.custom.UtahraptorEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TutorialMod.MOD_ID);



    public static final RegistryObject<EntityType<UtahraptorEntity>> UTAHRAPTOR =
            ENTITY_TYPES.register("utahraptor", () -> EntityType.Builder.of(UtahraptorEntity::new, MobCategory.CREATURE)
                    .sized(1.5f,1.5f).build("utahraptor"));

    public static final RegistryObject<EntityType<StegosaurusEntity>> STEGOSAURUS =
            ENTITY_TYPES.register("stegosaurus", () -> EntityType.Builder.of(StegosaurusEntity::new, MobCategory.CREATURE)
                    .sized(2.0f,2.0f).build("stegosaurus"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
