package net.daylonblazek.tutorialmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.daylonblazek.tutorialmod.TutorialMod;
import net.daylonblazek.tutorialmod.entity.custom.StegosaurusEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class StegosaurusRenderer extends MobRenderer<StegosaurusEntity, StegosaurusModel<StegosaurusEntity>> {


    public StegosaurusRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new StegosaurusModel<>(pContext.bakeLayer(ModModelLayers.STEGOSAURUS_LAYER)), 2.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(StegosaurusEntity pEntity) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/stegosaurus_texture.png");
    }

    @Override
    public void render(StegosaurusEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.3f, 0.3f, 0.3f);
        }
        pMatrixStack.scale(2.5f, 2.5f, 2.5f); // Adjust the scale factor as needed


        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }





}
