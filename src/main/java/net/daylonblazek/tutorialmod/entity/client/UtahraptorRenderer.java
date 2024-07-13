package net.daylonblazek.tutorialmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.daylonblazek.tutorialmod.TutorialMod;
import net.daylonblazek.tutorialmod.entity.custom.UtahraptorEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class UtahraptorRenderer extends MobRenderer<UtahraptorEntity, UtahraptorModel<UtahraptorEntity>> {


    public UtahraptorRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new UtahraptorModel<>(pContext.bakeLayer(ModModelLayers.UTAHRAPTOR_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(UtahraptorEntity pEntity) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/utahraptor.png");
    }

    @Override
    public void render(UtahraptorEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.3f, 0.3f, 0.3f);
        }


        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
