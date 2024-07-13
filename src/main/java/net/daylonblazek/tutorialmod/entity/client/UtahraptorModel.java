package net.daylonblazek.tutorialmod.entity.client;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.daylonblazek.tutorialmod.entity.animations.ModAnimationDefinitions;
import net.daylonblazek.tutorialmod.entity.custom.UtahraptorEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class UtahraptorModel<T extends Entity> extends HierarchicalModel<T> {

	private final ModelPart Raptor;
	private final ModelPart head;


	public UtahraptorModel(ModelPart root) {
		this.Raptor = root.getChild("Raptor");
		this.head = Raptor.getChild("head");

	}




	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Raptor = partdefinition.addOrReplaceChild("Raptor", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 4.0F, -11.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition head = Raptor.addOrReplaceChild("head", CubeListBuilder.create().texOffs(42, 16).addBox(-3.0F, -4.0F, 14.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(11, 0).addBox(-2.0F, -3.0F, 16.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 32).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 4.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(68, 50).addBox(-4.0F, -6.0F, 0.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(66, 31).addBox(-3.0F, -5.0F, 6.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.0F, 16.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(42, 0).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 53).addBox(-3.0F, 1.0F, 0.0F, 6.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(40, 53).addBox(-3.0F, -1.0F, 14.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(12, 19).addBox(-2.0F, -1.0F, 16.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition neck = Raptor.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 9.0F));

		PartDefinition cube_r1 = neck.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(48, 67).addBox(-5.0F, -4.0F, -2.0F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -5.0F, 5.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition body = Raptor.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(2.0F, 22.0F, 11.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -4.0F, -13.0F, 10.0F, 10.0F, 22.0F, new CubeDeformation(0.0F))
		.texOffs(28, 69).addBox(-4.0F, -4.0F, 9.0F, 8.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-4.0F, -5.0F, -12.0F, 8.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -23.0F, -10.0F));

		PartDefinition leftleg = body.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offset(-7.0F, -22.0F, -18.0F));

		PartDefinition cube_r2 = leftleg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 80).addBox(-0.8F, -8.0F, 0.0F, 1.8F, 12.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 9.0F, -2.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r3 = leftleg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -8.0F, 0.0F, 2.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.0F, -1.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition lowerleftleg = leftleg.addOrReplaceChild("lowerleftleg", CubeListBuilder.create().texOffs(72, 0).addBox(-3.0F, 5.0F, 0.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(58, 16).addBox(-3.0F, 6.0F, 6.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(66, 31).addBox(-1.0F, 7.0F, 7.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(18, 66).addBox(-3.0F, 7.0F, 7.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(50, 0).addBox(1.0F, 5.0F, 8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(44, 32).addBox(-3.0F, 6.5F, 6.0F, 1.0F, 1.5F, 2.8F, new CubeDeformation(-0.1F))
		.texOffs(11, 36).addBox(-1.0F, 6.5F, 6.0F, 1.0F, 1.5F, 2.8F, new CubeDeformation(-0.1F)), PartPose.offset(-1.0F, 12.0F, -1.0F));

		PartDefinition cube_r4 = lowerleftleg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 50).addBox(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.8F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.0F, 10.0F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r5 = lowerleftleg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 66).addBox(2.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.5F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.0F, 7.0F, 8.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r6 = lowerleftleg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(42, 0).addBox(-1.0F, -5.0F, 1.0F, 2.0F, 9.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition rightleg = body.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offset(3.0F, -22.0F, -18.0F));

		PartDefinition cube_r7 = rightleg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(68, 76).addBox(-0.8F, -8.0F, 0.0F, 1.8F, 12.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 9.0F, -2.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r8 = rightleg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -8.0F, 0.0F, 2.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 5.0F, -1.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition lowerrightleg = rightleg.addOrReplaceChild("lowerrightleg", CubeListBuilder.create().texOffs(68, 67).addBox(-2.0F, 5.0F, 0.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(-2.0F, 6.0F, 6.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 61).addBox(0.0F, 7.0F, 7.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 61).addBox(2.0F, 7.0F, 7.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 35).addBox(-2.0F, 5.0F, 8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(2.0F, 6.5F, 6.0F, 1.0F, 1.5F, 2.8F, new CubeDeformation(-0.1F))
		.texOffs(0, 0).addBox(0.0F, 6.5F, 6.0F, 1.0F, 1.5F, 2.8F, new CubeDeformation(-0.1F)), PartPose.offset(1.0F, 12.0F, -1.0F));

		PartDefinition cube_r9 = lowerrightleg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 2).addBox(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.8F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 6.0F, 10.0F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r10 = lowerrightleg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(11, 32).addBox(2.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.5F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-4.0F, 7.0F, 8.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r11 = lowerrightleg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(36, 32).addBox(-1.0F, -5.0F, 1.0F, 2.0F, 9.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition leftarm = body.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, -24.0F, -4.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftarm.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(24, 53).addBox(0.0F, -2.0F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition leftlowerarm = leftarm.addOrReplaceChild("leftlowerarm", CubeListBuilder.create().texOffs(66, 40).addBox(-3.0F, 3.0F, 6.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 5.0F, -3.0F));

		PartDefinition cube_r13 = leftlowerarm.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(36, 32).addBox(0.1F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(36, 34).addBox(2.9F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(42, 0).addBox(1.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.0F, 6.0F, 9.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftlowerarm.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(18, 13).addBox(0.1F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 16).addBox(2.9F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 32).addBox(1.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 5.0F, 10.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftlowerarm.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(20, 80).addBox(-1.0F, -1.6939F, -0.6193F, 1.0F, 10.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition rightarm = body.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -24.0F, -4.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r16 = rightarm.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 53).addBox(0.0F, -2.0F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition lowerrightarm = rightarm.addOrReplaceChild("lowerrightarm", CubeListBuilder.create().texOffs(40, 57).addBox(-1.0F, 3.0F, 6.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 5.0F, -3.0F));

		PartDefinition cube_r17 = lowerrightarm.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 5).addBox(0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(11, 5).addBox(1.9F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(15, 36).addBox(-0.9F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 6.0F, 9.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r18 = lowerrightarm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(18, 4).addBox(12.1F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 7).addBox(9.3F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 10).addBox(10.7F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.2F, 5.0F, 10.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r19 = lowerrightarm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(12, 80).addBox(0.0F, -2.0F, -2.0F, 1.0F, 10.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition tail = Raptor.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(64, 16).addBox(-4.0F, -5.0F, -11.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(45, 50).addBox(-3.0F, -4.0F, -22.0F, 6.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, -8.0F));

		PartDefinition midtail = tail.addOrReplaceChild("midtail", CubeListBuilder.create().texOffs(0, 66).addBox(-2.0F, -2.0F, -11.0F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(24, 55).addBox(-1.0F, -1.0F, -23.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -21.0F));

		PartDefinition hitbox = partdefinition.addOrReplaceChild("hitbox", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((UtahraptorEntity) entity).idleAnimationState, ModAnimationDefinitions.IDLE, ageInTicks, 1f);
		this.animate(((UtahraptorEntity) entity).attackAnimationState, ModAnimationDefinitions.ATTACK, ageInTicks, 1f);


	}


	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Raptor.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);

	}

	@Override
	public ModelPart root() {
		return Raptor;
	}

}