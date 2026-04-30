package com.jerielb.additional_weapons.entity.client;

import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class ShadowEntityModel extends EntityModel<ShadowEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "shadowentity"), "main");
	
	private final ModelPart SHADOW;
	
	// Animation(s)
	private final KeyframeAnimation SHADOW_IDLE_ANIMATION;
	private final KeyframeAnimation SHADOW_WALK_ANIMATION;
	
	public ShadowEntityModel(ModelPart root) {
		super(root);
		this.SHADOW = root.getChild("SHADOW");
		this.SHADOW_IDLE_ANIMATION = ShadowEntityAnimations.SHADOW_ANIMATION_IDLE.bake(root);
		this.SHADOW_WALK_ANIMATION = ShadowEntityAnimations.SHADOW_ANIMATION_WALK.bake(root);
	}
	
	public static LayerDefinition getTexturedModelData() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition SHADOW = partdefinition.addOrReplaceChild("SHADOW", CubeListBuilder.create(), PartPose.offset(0.0F, 16.5F, 0.5F));
		PartDefinition UPPER_BODY = SHADOW.addOrReplaceChild("UPPER_BODY", CubeListBuilder.create().texOffs(16, 14).addBox(-2.5F, -2.0F, -1.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, 0.0F));
		PartDefinition UPPER_BODY1 = UPPER_BODY.addOrReplaceChild("UPPER_BODY1", CubeListBuilder.create().texOffs(0, 14).addBox(-2.5F, -2.0F, -1.5F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -4.0F, 0.0F));
		PartDefinition HEAD = UPPER_BODY1.addOrReplaceChild("HEAD", CubeListBuilder.create().texOffs(6, 3).addBox(-3.5F, -5.0F, -2.5F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offset(0.5F, -1.5F, 0.0F));
		PartDefinition EAR_LEFT = HEAD.addOrReplaceChild("EAR_LEFT", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition START_LEFT = EAR_LEFT.addOrReplaceChild("START_LEFT", CubeListBuilder.create().texOffs(2, 1).addBox(1.0F, -7.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition MID_LEFT = START_LEFT.addOrReplaceChild("MID_LEFT", CubeListBuilder.create(), PartPose.offset(0.75F, -3.7223F, -1.0129F));
		PartDefinition mid_r1 = MID_LEFT.addOrReplaceChild("mid_r1", CubeListBuilder.create().texOffs(2, 1).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -3.2777F, 0.0129F, 0.6981F, 0.0F, 0.0F));
		PartDefinition END_LEFT = MID_LEFT.addOrReplaceChild("END_LEFT", CubeListBuilder.create(), PartPose.offset(0.75F, -4.6616F, -2.8531F));
		PartDefinition end_r1 = END_LEFT.addOrReplaceChild("end_r1", CubeListBuilder.create().texOffs(3, 2).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.366F, 1.366F, 1.0472F, 0.0F, 0.0F));
		PartDefinition EAR_RIGHT = HEAD.addOrReplaceChild("EAR_RIGHT", CubeListBuilder.create(), PartPose.offset(-4.0F, 0.0F, 1.0F));
		PartDefinition START_RIGHT = EAR_RIGHT.addOrReplaceChild("START_RIGHT", CubeListBuilder.create().texOffs(2, 1).addBox(1.0F, -7.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition MID_RIGHT = START_RIGHT.addOrReplaceChild("MID_RIGHT", CubeListBuilder.create(), PartPose.offset(1.5F, -7.9143F, -2.9459F));
		PartDefinition mid_r2 = MID_RIGHT.addOrReplaceChild("mid_r2", CubeListBuilder.create().texOffs(2, 1).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.9143F, 1.9459F, 0.6981F, 0.0F, 0.0F));
		PartDefinition END_RIGHT = MID_RIGHT.addOrReplaceChild("END_RIGHT", CubeListBuilder.create(), PartPose.offset(0.0F, -0.4697F, -0.9201F));
		PartDefinition end_r2 = END_RIGHT.addOrReplaceChild("end_r2", CubeListBuilder.create().texOffs(3, 2).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.366F, 1.366F, 1.0472F, 0.0F, 0.0F));
		PartDefinition EYES = HEAD.addOrReplaceChild("EYES", CubeListBuilder.create(), PartPose.offset(-0.55F, -3.95F, -3.25F));
		PartDefinition EYE_RIGHT = EYES.addOrReplaceChild("EYE_RIGHT", CubeListBuilder.create().texOffs(55, 2).addBox(0.8F, 0.7F, 0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.25F, -0.75F, -0.05F));
		PartDefinition EYE_LEFT = EYES.addOrReplaceChild("EYE_LEFT", CubeListBuilder.create().texOffs(55, 8).addBox(-2.8F, 0.7F, 0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.35F, -0.75F, -0.05F));
		PartDefinition ARM_RIGHT = UPPER_BODY1.addOrReplaceChild("ARM_RIGHT", CubeListBuilder.create().texOffs(27, 4).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(-2.5F, 0.0F, 0.0F));
		PartDefinition ARM_RIGHT2 = ARM_RIGHT.addOrReplaceChild("ARM_RIGHT2", CubeListBuilder.create().texOffs(27, 0).addBox(-3.0F, -1.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 0.0F, 1.0F));
		PartDefinition FINGER_RIGHT1 = ARM_RIGHT2.addOrReplaceChild("FINGER_RIGHT1", CubeListBuilder.create().texOffs(0, 3).addBox(-1.8233F, -0.5946F, -0.0261F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9312F, -0.3854F, -1.9458F, 0.1309F, -0.2618F, -0.4363F));
		PartDefinition FINGER_RIGHT2 = ARM_RIGHT2.addOrReplaceChild("FINGER_RIGHT2", CubeListBuilder.create().texOffs(3, 0).addBox(-1.8732F, -0.2719F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -0.7F, -1.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition FINGER_RIGHT3 = ARM_RIGHT2.addOrReplaceChild("FINGER_RIGHT3", CubeListBuilder.create().texOffs(3, 1).addBox(-1.8775F, -0.2738F, -0.003F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -0.7F, 0.0F, -0.1309F, 0.2618F, -0.4363F));
		PartDefinition ARM_LEFT = UPPER_BODY1.addOrReplaceChild("ARM_LEFT", CubeListBuilder.create().texOffs(27, 24).addBox(0.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(2.5F, 0.0F, 0.0F));
		PartDefinition ARM_LEFT2 = ARM_LEFT.addOrReplaceChild("ARM_LEFT2", CubeListBuilder.create().texOffs(27, 20).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 0.0F, 1.0F));
		PartDefinition FINGER_LEFT1 = ARM_LEFT2.addOrReplaceChild("FINGER_LEFT1", CubeListBuilder.create().texOffs(4, 5).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -1.0F, -2.0F, 0.1309F, 0.2618F, 0.4363F));
		PartDefinition FINGER_LEFT2 = ARM_LEFT2.addOrReplaceChild("FINGER_LEFT2", CubeListBuilder.create().texOffs(3, 4).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition FINGER_LEFT3 = ARM_LEFT2.addOrReplaceChild("FINGER_LEFT3", CubeListBuilder.create().texOffs(0, 5).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -1.0F, 0.0F, -0.1309F, -0.2618F, 0.4363F));
		PartDefinition LEG_RIGHT = SHADOW.addOrReplaceChild("LEG_RIGHT", CubeListBuilder.create(), PartPose.offset(-2.0F, 0.5F, 0.0F));
		PartDefinition leg_right_r1 = LEG_RIGHT.addOrReplaceChild("leg_right_r1", CubeListBuilder.create().texOffs(52, 12).mirror().addBox(-4.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition LEG_RIGHT2 = LEG_RIGHT.addOrReplaceChild("LEG_RIGHT2", CubeListBuilder.create(), PartPose.offset(0.0F, 3.5F, -1.0F));
		PartDefinition leg_right2_r1 = LEG_RIGHT2.addOrReplaceChild("leg_right2_r1", CubeListBuilder.create().texOffs(32, 12).mirror().addBox(-4.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition FOOT_RIGHT = LEG_RIGHT2.addOrReplaceChild("FOOT_RIGHT", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 1.0F));
		PartDefinition foot_right_r1 = FOOT_RIGHT.addOrReplaceChild("foot_right_r1", CubeListBuilder.create().texOffs(0, 5).mirror().addBox(-0.75F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.25F, -2.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition foot_right_r2 = FOOT_RIGHT.addOrReplaceChild("foot_right_r2", CubeListBuilder.create().texOffs(34, 8).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition LEG_LEFT = SHADOW.addOrReplaceChild("LEG_LEFT", CubeListBuilder.create(), PartPose.offset(2.0F, 0.5F, 0.0F));
		PartDefinition leg_left_r1 = LEG_LEFT.addOrReplaceChild("leg_left_r1", CubeListBuilder.create().texOffs(52, 16).addBox(0.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition LEG_LEFT2 = LEG_LEFT.addOrReplaceChild("LEG_LEFT2", CubeListBuilder.create(), PartPose.offset(0.0F, 3.5F, -1.0F));
		PartDefinition leg_left2_r1 = LEG_LEFT2.addOrReplaceChild("leg_left2_r1", CubeListBuilder.create().texOffs(32, 16).addBox(0.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition FOOT_LEFT = LEG_LEFT2.addOrReplaceChild("FOOT_LEFT", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 1.0F));
		PartDefinition foot_left_r1 = FOOT_LEFT.addOrReplaceChild("foot_left_r1", CubeListBuilder.create().texOffs(2, 2).addBox(-0.25F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.25F, -2.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition foot_left_r2 = FOOT_LEFT.addOrReplaceChild("foot_left_r2", CubeListBuilder.create().texOffs(38, 6).addBox(3.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 1.5708F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}
	
	@Override
	public void setupAnim(ShadowEntityRenderState state) {
		super.setupAnim(state);
		this.SHADOW_IDLE_ANIMATION.apply(state.idleAnimationState, state.ageInTicks);
		this.SHADOW_WALK_ANIMATION.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1.0F, 1.0F);
	}

//	@Override
//	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
//		SHADOW.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
	
}
