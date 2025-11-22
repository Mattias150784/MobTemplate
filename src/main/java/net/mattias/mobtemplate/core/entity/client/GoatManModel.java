package net.mattias.mobtemplate.core.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.Entity;

public class GoatManModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart bone9;
	private final ModelPart bone;
	private final ModelPart bone11;
	private final ModelPart bone2;
	private final ModelPart bone12;
	private final ModelPart bone13;
	private final ModelPart bone14;
	private final ModelPart bone15;
	private final ModelPart bone16;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart bone17;
	private final ModelPart bone20;
	private final ModelPart bone21;
	private final ModelPart bone22;
	private final ModelPart bone23;
	private final ModelPart bone24;
	private final ModelPart bone25;
	private final ModelPart bone26;
	private final ModelPart bone27;
	private final ModelPart bone10;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone3;
	private final ModelPart bone7;
	private final ModelPart bone8;

	public GoatManModel(ModelPart root) {
		this.bone9 = root.getChild("bone9");
		this.bone = this.bone9.getChild("bone");
		this.bone11 = this.bone.getChild("bone11");
		this.bone2 = this.bone11.getChild("bone2");
		this.bone12 = this.bone.getChild("bone12");
		this.bone13 = this.bone12.getChild("bone13");
		this.bone14 = this.bone13.getChild("bone14");
		this.bone15 = this.bone14.getChild("bone15");
		this.bone16 = this.bone15.getChild("bone16");
		this.bone18 = this.bone15.getChild("bone18");
		this.bone19 = this.bone15.getChild("bone19");
		this.bone17 = this.bone15.getChild("bone17");
		this.bone20 = this.bone.getChild("bone20");
		this.bone21 = this.bone20.getChild("bone21");
		this.bone22 = this.bone21.getChild("bone22");
		this.bone23 = this.bone22.getChild("bone23");
		this.bone24 = this.bone23.getChild("bone24");
		this.bone25 = this.bone23.getChild("bone25");
		this.bone26 = this.bone23.getChild("bone26");
		this.bone27 = this.bone23.getChild("bone27");
		this.bone10 = this.bone9.getChild("bone10");
		this.bone4 = this.bone10.getChild("bone4");
		this.bone5 = this.bone4.getChild("bone5");
		this.bone6 = this.bone5.getChild("bone6");
		this.bone3 = this.bone10.getChild("bone3");
		this.bone7 = this.bone3.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone9 = partdefinition.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.0F, 23.0F, 0.0F));

		PartDefinition bone = bone9.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 19).addBox(-4.5F, -14.6293F, -2.7153F, 9.0F, 11.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(52, 35).addBox(-3.5F, -6.6293F, -3.2153F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -32.6314F, 6.0962F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(92, 73).addBox(-7.2987F, -6.6204F, -3.958F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -16.8655F, -3.3608F, 0.1922F, 0.4432F, -0.0493F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(92, 89).addBox(1.2987F, -6.6204F, -3.958F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -16.8655F, -3.3608F, 0.1922F, -0.4432F, 0.0493F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(93, 18).addBox(-5.5F, -6.5F, -2.5F, 2.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.1293F, 0.2847F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(96, 33).addBox(3.5F, -6.5F, -2.5F, 2.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.1293F, 0.2847F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-7.5F, 5.5F, -4.0F, 15.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -29.8686F, -3.0962F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone11 = bone.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(20, 38).addBox(-4.5F, -10.5F, -6.5F, 9.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(46, 0).addBox(-4.25F, -9.0F, -6.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(0, 4).addBox(2.25F, -9.0F, -6.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -23.8686F, -0.5962F));

		PartDefinition cube_r6 = bone11.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 84).addBox(-1.5F, -3.5F, -1.0F, 3.0F, 13.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(58, 60).addBox(-3.5F, -5.5F, -3.0F, 7.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, -2.5F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone11.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 52).addBox(-1.0F, -2.5F, -1.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -6.0F, -4.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r8 = bone11.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(112, 99).addBox(-0.3328F, -8.4886F, 6.2566F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.72F, -9.7053F, -3.3422F, -0.2873F, -0.682F, -0.1279F));

		PartDefinition cube_r9 = bone11.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(108, 41).addBox(-0.3328F, -3.3648F, 3.994F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-3.72F, -9.7053F, -3.3422F, 0.3236F, -0.682F, -0.1279F));

		PartDefinition cube_r10 = bone11.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(96, 47).addBox(-0.8328F, -1.5802F, -1.0224F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-3.72F, -9.7053F, -3.3422F, 0.7163F, -0.682F, -0.1279F));

		PartDefinition cube_r11 = bone11.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(112, 108).addBox(-1.6672F, -8.4886F, 6.2566F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.72F, -9.7053F, -3.3422F, -0.2873F, 0.682F, 0.1279F));

		PartDefinition cube_r12 = bone11.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(108, 65).addBox(-1.6672F, -3.3648F, 3.994F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(3.72F, -9.7053F, -3.3422F, 0.3236F, 0.682F, 0.1279F));

		PartDefinition cube_r13 = bone11.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(98, 0).addBox(-2.1672F, -1.5802F, -1.0224F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.72F, -9.7053F, -3.3422F, 0.7163F, 0.682F, 0.1279F));

		PartDefinition cube_r14 = bone11.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(8, 42).addBox(1.7948F, -2.3107F, 5.4026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 21).addBox(1.7948F, -2.3107F, 3.4026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 27).addBox(1.7948F, -2.3107F, 0.4026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, -12.0498F, 0.023F, 0.173F, -3.0087F));

		PartDefinition cube_r15 = bone11.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(50, 35).addBox(1.7948F, -2.6551F, -2.338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 52).addBox(1.7948F, -2.6551F, -5.338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, -12.0498F, 0.1975F, 0.173F, -3.0087F));

		PartDefinition cube_r16 = bone11.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(20, 52).addBox(-2.7948F, -2.6551F, -5.338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 52).addBox(-2.7948F, -2.6551F, -2.338F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, -12.0498F, 0.1975F, -0.173F, 3.0087F));

		PartDefinition cube_r17 = bone11.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(35, 52).addBox(-2.7948F, -2.3107F, 0.4026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 38).addBox(-2.7948F, -2.3107F, 3.4026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 52).addBox(-2.7948F, -2.3107F, 5.4026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, -12.0498F, 0.023F, -0.173F, 3.0087F));

		PartDefinition cube_r18 = bone11.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(38, 21).addBox(-1.0537F, 0.0F, -4.5974F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, -13.0498F, 0.0F, 0.1745F, -3.1416F));

		PartDefinition cube_r19 = bone11.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(32, 38).addBox(-2.0F, 0.0F, -5.4502F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -4.5F, -13.0498F, 0.0F, 0.0F, 3.1416F));

		PartDefinition cube_r20 = bone11.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 52).addBox(-2.9463F, 0.0F, -4.5974F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, -13.0498F, 0.0F, -0.1745F, -3.1416F));

		PartDefinition cube_r21 = bone11.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, -8.0F, -5.125F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r22 = bone11.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(32, 52).addBox(-2.0F, -1.0F, -5.5F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -6.4848F, -12.6736F, -0.1745F, 0.0F, 3.1416F));

		PartDefinition cube_r23 = bone11.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(24, 19).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, -8.0F, -5.125F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r24 = bone11.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(54, 6).addBox(-1.0F, -2.5F, -1.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -6.0F, -4.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition bone2 = bone11.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(34, 7).addBox(-2.0F, -0.541F, -12.8939F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, -2.959F, -5.6061F));

		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4341F, -1.541F, -2.0556F, 0.023F, 0.173F, 0.1329F));

		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 19).addBox(-0.5F, -1.0F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0868F, -1.541F, -4.0252F, 0.023F, 0.173F, 0.1329F));

		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(32, 21).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 27).addBox(-0.5F, -1.0F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0449F, -1.541F, -9.9341F, 0.1975F, 0.173F, 0.1329F));

		PartDefinition cube_r28 = bone2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4341F, -1.541F, -2.0556F, 0.023F, -0.173F, -0.1329F));

		PartDefinition cube_r29 = bone2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(8, 36).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 21).addBox(-0.5F, -1.0F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0868F, -1.541F, -4.0252F, 0.023F, -0.173F, -0.1329F));

		PartDefinition cube_r30 = bone2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 42).addBox(-0.5F, -1.0F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0449F, -1.541F, -9.9341F, 0.1975F, -0.173F, -0.1329F));

		PartDefinition cube_r31 = bone2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(18, 24).addBox(-2.0F, -1.0F, -7.5F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4359F, 0.459F, -4.7496F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r32 = bone2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 38).addBox(-2.0F, -1.0F, -7.5F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4359F, 0.459F, -4.7496F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bone12 = bone.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(60, 80).addBox(-3.9083F, -1.6667F, -2.3346F, 4.0F, 20.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0917F, -20.9626F, 0.6193F));

		PartDefinition bone13 = bone12.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(66, 0).addBox(0.1F, 0.1F, -3.9F, 4.0F, 22.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(-4.0083F, 18.2333F, 1.5654F));

		PartDefinition bone14 = bone13.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9821F, 20.8099F, -1.9162F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone14.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(73, 26).addBox(-3.0F, -2.0F, -4.0F, 6.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1179F, 0.0F, -2.9346F, 0.0F, 0.0F, -3.1416F));

		PartDefinition bone15 = bone14.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offset(0.1054F, -1.0F, -6.3442F));

		PartDefinition bone16 = bone15.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offset(-1.8625F, -0.5F, -0.5903F));

		PartDefinition cube_r34 = bone16.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(112, 91).addBox(-1.9132F, -0.5F, -7.4924F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r35 = bone16.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(108, 12).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6375F, 1.5F, -2.3567F, 0.0F, -0.1745F, -3.1416F));

		PartDefinition bone18 = bone15.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offset(2.5F, -0.5F, -0.4471F));

		PartDefinition cube_r36 = bone18.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(112, 74).addBox(-1.0868F, -0.5F, -9.4924F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r37 = bone18.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(42, 107).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -2.5F, 0.0F, 0.1745F, -3.1416F));

		PartDefinition bone19 = bone15.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 0.5F, 4.5529F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r38 = bone19.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(64, 112).addBox(-1.0F, -0.5F, -9.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r39 = bone19.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(102, 105).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -2.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition bone17 = bone15.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(26, 112).addBox(-1.0F, 0.0F, -13.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -0.1971F));

		PartDefinition cube_r40 = bone17.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(57, 49).addBox(-1.0F, -1.5F, -3.5F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -3.75F, 0.0F, 0.0F, -3.1416F));

		PartDefinition bone20 = bone.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(60, 80).mirror().addBox(-0.0917F, -1.6667F, -2.3346F, 4.0F, 20.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(7.0917F, -20.9626F, 0.6193F));

		PartDefinition bone21 = bone20.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-4.1F, 0.1F, -3.9F, 4.0F, 22.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offset(4.0083F, 18.2333F, 1.5654F));

		PartDefinition bone22 = bone21.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9821F, 20.8099F, -1.9162F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r41 = bone22.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(73, 26).mirror().addBox(-3.0F, -2.0F, -4.0F, 6.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1179F, 0.0F, -2.9346F, 0.0F, 0.0F, 3.1416F));

		PartDefinition bone23 = bone22.addOrReplaceChild("bone23", CubeListBuilder.create(), PartPose.offset(-0.1054F, -1.0F, -6.3442F));

		PartDefinition bone24 = bone23.addOrReplaceChild("bone24", CubeListBuilder.create(), PartPose.offset(1.8625F, -0.5F, -0.5903F));

		PartDefinition cube_r42 = bone24.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(112, 91).mirror().addBox(-0.0868F, -0.5F, -7.4924F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r43 = bone24.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(108, 12).mirror().addBox(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6375F, 1.5F, -2.3567F, 0.0F, 0.1745F, 3.1416F));

		PartDefinition bone25 = bone23.addOrReplaceChild("bone25", CubeListBuilder.create(), PartPose.offset(-2.5F, -0.5F, -0.4471F));

		PartDefinition cube_r44 = bone25.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(112, 74).mirror().addBox(-0.9132F, -0.5F, -9.4924F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r45 = bone25.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(42, 107).mirror().addBox(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5F, -2.5F, 0.0F, -0.1745F, 3.1416F));

		PartDefinition bone26 = bone23.addOrReplaceChild("bone26", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 0.5F, 4.5529F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r46 = bone26.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(64, 112).mirror().addBox(-1.0F, -0.5F, -9.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r47 = bone26.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(102, 105).mirror().addBox(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bone27 = bone23.addOrReplaceChild("bone27", CubeListBuilder.create().texOffs(26, 112).mirror().addBox(-1.0F, 0.0F, -13.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, -0.1971F));

		PartDefinition cube_r48 = bone27.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(57, 49).mirror().addBox(-1.0F, -1.5F, -3.5F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -3.75F, 0.0F, 0.0F, 3.1416F));

		PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(0.0F, -33.0F, 7.0F));

		PartDefinition bone4 = bone10.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 92).addBox(-1.9083F, -1.6667F, -2.3346F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0917F, 0.4059F, -0.2846F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(82, 0).addBox(-1.9F, 0.1F, 0.1F, 4.0F, 19.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(-0.0083F, 14.2333F, -2.4346F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(36, 72).addBox(-2.8821F, 0.3571F, -4.0016F, 6.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(32, 103).addBox(-1.0196F, 1.3571F, -8.8584F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.05F))
				.texOffs(0, 42).addBox(-1.0196F, 2.3571F, -12.8584F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0179F, 15.7429F, 2.1016F));

		PartDefinition cube_r49 = bone6.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(38, 27).addBox(-1.0F, -0.5F, -7.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(16, 102).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(2.4804F, 2.8571F, -3.8584F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r50 = bone6.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(50, 0).addBox(-2.0F, -0.5F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(70, 103).addBox(-2.0F, -1.5F, -1.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-1.8821F, 2.8571F, -6.0016F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bone3 = bone10.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-2.0917F, -1.6667F, -2.3346F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(3.0917F, 0.4059F, -0.2846F));

		PartDefinition bone7 = bone3.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-2.1F, 0.1F, 0.1F, 4.0F, 19.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offset(0.0083F, 14.2333F, -2.4346F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(36, 72).mirror().addBox(-3.1179F, 0.3571F, -4.0016F, 6.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 103).mirror().addBox(-0.9804F, 1.3571F, -8.8584F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.05F)).mirror(false)
				.texOffs(0, 42).mirror().addBox(-0.9804F, 2.3571F, -12.8584F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0179F, 15.7429F, 2.1016F));

		PartDefinition cube_r51 = bone8.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(38, 27).mirror().addBox(-1.0F, -0.5F, -7.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 102).mirror().addBox(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(-2.4804F, 2.8571F, -3.8584F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r52 = bone8.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(0.0F, -0.5F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 103).mirror().addBox(0.0F, -1.5F, -1.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(1.8821F, 2.8571F, -6.0016F, 0.0F, -0.1745F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone9.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return bone9;
	}
}