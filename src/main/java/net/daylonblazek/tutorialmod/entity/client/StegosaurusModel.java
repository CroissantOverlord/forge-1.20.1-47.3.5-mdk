package net.daylonblazek.tutorialmod.entity.client;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.daylonblazek.tutorialmod.entity.animations.ModAnimationDefinitions;
import net.daylonblazek.tutorialmod.entity.custom.StegosaurusEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class StegosaurusModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart stegosaurus;

	private final ModelPart head;



	public StegosaurusModel(ModelPart root) {
		this.stegosaurus = root.getChild("stegosaurus");
		this.head = stegosaurus.getChild("neck").getChild("head");



	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition stegosaurus = partdefinition.addOrReplaceChild("stegosaurus", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = stegosaurus.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(1.0F, -16.0F, -6.0F));

		PartDefinition backleftleg = body.addOrReplaceChild("backleftleg", CubeListBuilder.create().texOffs(0, 89).addBox(-3.0F, 16.0F, -5.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(26, 88).addBox(-3.0F, 12.0F, -4.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, -1.0F, 8.0F));

		PartDefinition cube_r1 = backleftleg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(47, 37).addBox(0.0F, -4.0F, -3.0F, 3.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r2 = backleftleg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(39, 74).addBox(-8.0F, -14.0F, -4.0F, 3.0F, 9.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(5.0F, 17.0F, 1.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition frontleftleg = body.addOrReplaceChild("frontleftleg", CubeListBuilder.create().texOffs(89, 45).addBox(-3.0F, 14.0F, 1.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(89, 19).addBox(-3.0F, 13.0F, 1.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(59, 37).addBox(-3.0F, 11.0F, 2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offset(9.0F, 1.0F, -11.0F));

		PartDefinition cube_r3 = frontleftleg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(89, 37).addBox(-2.0F, -6.0F, 2.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = frontleftleg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 77).addBox(-8.0F, -16.0F, -4.0F, 3.0F, 7.0F, 5.0F, new CubeDeformation(-0.01F))
		.texOffs(51, 87).addBox(-8.0F, -9.0F, -3.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(5.0F, 12.0F, 7.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition backrightleg = body.addOrReplaceChild("backrightleg", CubeListBuilder.create().texOffs(82, 87).addBox(0.0F, 16.0F, -5.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(87, 79).addBox(0.0F, 12.0F, -4.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, -1.0F, 8.0F));

		PartDefinition cube_r5 = backrightleg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 37).addBox(0.0F, -4.0F, -3.0F, 3.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r6 = backrightleg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(23, 74).addBox(-8.0F, -14.0F, -4.0F, 3.0F, 9.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(8.0F, 17.0F, 1.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition frontrightleg = body.addOrReplaceChild("frontrightleg", CubeListBuilder.create().texOffs(65, 88).addBox(0.0F, 14.0F, 1.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(82, 7).addBox(0.0F, 13.0F, 1.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(12, 37).addBox(0.0F, 11.0F, 2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offset(-10.0F, 1.0F, -11.0F));

		PartDefinition cube_r7 = frontrightleg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(52, 0).addBox(-2.0F, -6.0F, 2.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 12.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r8 = frontrightleg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 85).addBox(-8.0F, -9.0F, -3.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(-0.01F))
		.texOffs(78, 20).addBox(-8.0F, -16.0F, -4.0F, 3.0F, 7.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(8.0F, 12.0F, 7.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition plate = body.addOrReplaceChild("plate", CubeListBuilder.create(), PartPose.offset(-1.0F, -19.0F, 0.0F));

		PartDefinition plate2 = plate.addOrReplaceChild("plate2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -7.0F));

		PartDefinition torso = plate2.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -5.0F, -14.0F, 13.0F, 11.0F, 26.0F, new CubeDeformation(0.0F))
		.texOffs(0, 37).addBox(-6.0F, -7.0F, -13.0F, 11.0F, 2.0F, 25.0F, new CubeDeformation(0.0F))
		.texOffs(47, 37).addBox(-5.0F, -8.0F, -12.0F, 9.0F, 1.0F, 24.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.0F, -8.0F, 12.0F, 11.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(52, 0).addBox(-5.0F, -9.0F, 0.0F, 9.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(75, 79).addBox(-1.0F, -16.0F, -3.0F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(36, 64).addBox(-1.0F, -18.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(38, 74).addBox(-1.0F, -17.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(66, 68).addBox(-1.0F, -17.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 42).addBox(-1.0F, -16.0F, 2.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 42).addBox(-1.0F, -16.0F, -4.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 64).addBox(-1.0F, -14.0F, 5.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(68, 79).addBox(-1.0F, -16.0F, 6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(67, 59).addBox(-1.0F, -15.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 77).addBox(-1.0F, -14.0F, 9.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(47, 53).addBox(-1.0F, -14.0F, 4.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 51).addBox(-1.0F, -15.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(61, 49).addBox(-1.0F, -14.0F, -10.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(21, 50).addBox(-1.0F, -14.0F, -11.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(78, 13).addBox(-1.0F, -16.0F, -9.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 66).addBox(-1.0F, -15.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(-1.0F, -14.0F, -6.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 66).addBox(-1.0F, -15.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 19.0F, 7.0F));

		PartDefinition neck = stegosaurus.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(17, 64).addBox(-4.0F, -1.9128F, -4.0038F, 7.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(86, 62).addBox(-4.0F, -3.9128F, -5.0038F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 54).addBox(-4.0F, -4.9128F, -3.0038F, 7.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(56, 64).addBox(-4.0F, -4.9128F, -4.0038F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(78, 32).addBox(-4.0F, 3.0872F, -3.0038F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(82, 0).addBox(-3.0F, -3.0F, -8.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(82, 13).addBox(-3.0F, 0.0F, -8.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(89, 55).addBox(-1.0F, -6.0F, -7.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(21, 37).addBox(-1.0F, -7.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -15.0F, -20.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(75, 92).addBox(0.0F, -4.0F, -3.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -5.0F, 1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 13).addBox(0.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(61, 68).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -9.0F, 1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(55, 79).addBox(-1.0F, -1.0F, -7.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(89, 50).addBox(-1.0F, -2.0F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, -8.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(47, 53).addBox(-1.0F, 4.0F, -11.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 4.0F));

		PartDefinition tail = stegosaurus.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(52, 13).addBox(-5.0F, -4.0F, -1.0F, 11.0F, 8.0F, 4.0F, new CubeDeformation(-0.01F))
		.texOffs(40, 88).addBox(0.0F, -9.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(55, 78).addBox(0.0F, -9.0F, -3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 74).addBox(0.0F, -11.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(41, 64).addBox(0.0F, -10.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(47, 37).addBox(0.0F, -9.0F, 2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(6, 64).addBox(0.0F, -10.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(61, 93).addBox(0.0F, -7.0F, 5.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 64).addBox(0.0F, -7.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 37).addBox(0.0F, -9.0F, 6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 64).addBox(0.0F, -8.0F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 53).addBox(0.0F, -7.0F, 9.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 15).addBox(0.0F, -8.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 13).addBox(0.0F, -6.0F, 12.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(52, 13).addBox(0.0F, -7.0F, 13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.0F, 8.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(41, 64).addBox(-3.0F, -2.0F, 10.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(62, 62).addBox(-4.0F, -3.0F, 0.0F, 7.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition midtail = tail.addOrReplaceChild("midtail", CubeListBuilder.create().texOffs(85, 93).addBox(0.0F, -5.0F, 1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 41).addBox(0.0F, -6.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 16.0F));

		PartDefinition cube_r12 = midtail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 23).addBox(0.3388F, -0.9122F, -24.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 23).addBox(0.3388F, -0.9122F, -28.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -16.0F, -3.1416F, 0.0F, -3.0107F));

		PartDefinition cube_r13 = midtail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(52, 8).addBox(0.3388F, -0.9122F, -32.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -16.0F, -3.1416F, 0.0F, -3.0107F));

		PartDefinition cube_r14 = midtail.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(52, 10).addBox(0.1166F, -0.9023F, 23.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 74).addBox(0.1166F, -0.9023F, 27.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 76).addBox(0.1166F, -0.9023F, 31.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, -16.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r15 = midtail.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 64).addBox(-2.0F, -1.0F, 21.0F, 3.0F, 2.0F, 11.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.0F, -1.0F, -16.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r16 = midtail.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, -1.0F, 9.0F, 5.0F, 3.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -1.0F, -10.0F, 0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.STEGOSAURUS_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((StegosaurusEntity) entity).idleAnimationState, ModAnimationDefinitions.STEGOSAURUS_IDLE, ageInTicks, 1f);
		this.animate(((StegosaurusEntity) entity).attackAnimationState, ModAnimationDefinitions.STEGOSAURUS_ATTACK, ageInTicks, 1f);


	}


	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		stegosaurus.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);

	}

	@Override
	public ModelPart root() {
		return stegosaurus;
	}
}