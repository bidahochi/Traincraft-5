//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: fmsr hot tub tender
// Model Creator: bida
// Created on: 30.10.2025 - 10:31:44
// Last changed on: 30.10.2025 - 10:31:44

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelASF_crown_LS_truck;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.library.Info;

public class ModelHotTubTender extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelHotTubTender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[74];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 235, 104, textureX, textureY); // Box 542
		bodyModel[1] = new ModelRendererTurbo(this, 234, 110, textureX, textureY); // Box 543
		bodyModel[2] = new ModelRendererTurbo(this, 235, 117, textureX, textureY); // Box 211
		bodyModel[3] = new ModelRendererTurbo(this, 141, 2, textureX, textureY); // Box 675
		bodyModel[4] = new ModelRendererTurbo(this, 205, 10, textureX, textureY); // Box 69
		bodyModel[5] = new ModelRendererTurbo(this, 205, 10, textureX, textureY); // Box 70
		bodyModel[6] = new ModelRendererTurbo(this, 185, 102, textureX, textureY); // Box 582 i am KING PIN
		bodyModel[7] = new ModelRendererTurbo(this, 188, 82, textureX, textureY); // Box 214 fmsr pin puller
		bodyModel[8] = new ModelRendererTurbo(this, 1, 90, textureX, textureY); // Box 546
		bodyModel[9] = new ModelRendererTurbo(this, 134, 111, textureX, textureY); // Box 547
		bodyModel[10] = new ModelRendererTurbo(this, 148, 16, textureX, textureY); // Box 254
		bodyModel[11] = new ModelRendererTurbo(this, 147, 22, textureX, textureY); // Box 63
		bodyModel[12] = new ModelRendererTurbo(this, 147, 22, textureX, textureY); // Box 581
		bodyModel[13] = new ModelRendererTurbo(this, 148, 16, textureX, textureY); // Box 583
		bodyModel[14] = new ModelRendererTurbo(this, 79, 43, textureX, textureY); // Box 341 fmsr backing light housing
		bodyModel[15] = new ModelRendererTurbo(this, 84, 36, textureX, textureY, "lamp"); // Box 342 headlight rear fmsr
		bodyModel[16] = new ModelRendererTurbo(this, 93, 38, textureX, textureY, "cull"); // Box 343 cull fmsr backing light housing
		bodyModel[17] = new ModelRendererTurbo(this, 92, 44, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_17"); // Box 345 numberboard glow fmsr
		bodyModel[18] = new ModelRendererTurbo(this, 84, 50, textureX, textureY); // Box 346 fmsr backinglight support
		bodyModel[19] = new ModelRendererTurbo(this, 161, 85, textureX, textureY); // Box 2
		bodyModel[20] = new ModelRendererTurbo(this, 164, 84, textureX, textureY, "marker").setLightFixtureId("marker_body_20"); // Box 410 glow marker
		bodyModel[21] = new ModelRendererTurbo(this, 161, 85, textureX, textureY); // Box 594
		bodyModel[22] = new ModelRendererTurbo(this, 164, 84, textureX, textureY, "marker").setLightFixtureId("marker_body_22"); // Box 595 glow marker
		bodyModel[23] = new ModelRendererTurbo(this, 230, 93, textureX, textureY, "cull"); // Box cull pipos
		bodyModel[24] = new ModelRendererTurbo(this, 230, 86, textureX, textureY); // Box stokerbit
		bodyModel[25] = new ModelRendererTurbo(this, 13, 45, textureX, textureY); // Box 553
		bodyModel[26] = new ModelRendererTurbo(this, 13, 53, textureX, textureY); // Box 556
		bodyModel[27] = new ModelRendererTurbo(this, 8, 61, textureX, textureY); // Box 558
		bodyModel[28] = new ModelRendererTurbo(this, 14, 38, textureX, textureY); // Box 580
		bodyModel[29] = new ModelRendererTurbo(this, 187, 113, textureX, textureY); // Box 138 fmsr pilot beam
		bodyModel[30] = new ModelRendererTurbo(this, 188, 99, textureX, textureY); // Box 186 fmsr step support
		bodyModel[31] = new ModelRendererTurbo(this, 186, 124, textureX, textureY); // Box 187 fmsr pilot step
		bodyModel[32] = new ModelRendererTurbo(this, 187, 107, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 90, 77, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 193, 92, textureX, textureY); // Box 326
		bodyModel[35] = new ModelRendererTurbo(this, 200, 95, textureX, textureY); // Box 327
		bodyModel[36] = new ModelRendererTurbo(this, 201, 93, textureX, textureY); // Box 328
		bodyModel[37] = new ModelRendererTurbo(this, 193, 92, textureX, textureY); // Box 348
		bodyModel[38] = new ModelRendererTurbo(this, 200, 95, textureX, textureY); // Box 349
		bodyModel[39] = new ModelRendererTurbo(this, 201, 93, textureX, textureY); // Box 350
		bodyModel[40] = new ModelRendererTurbo(this, 114, 86, textureX, textureY, "cull"); // Box 259 cull ladder
		bodyModel[41] = new ModelRendererTurbo(this, 127, 91, textureX, textureY, "cull"); // Box 376 cull handrails
		bodyModel[42] = new ModelRendererTurbo(this, 127, 103, textureX, textureY); // Box 662
		bodyModel[43] = new ModelRendererTurbo(this, 185, 27, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 217, 27, textureX, textureY); // Box 46
		bodyModel[45] = new ModelRendererTurbo(this, 167, 27, textureX, textureY); // Box 130 air res
		bodyModel[46] = new ModelRendererTurbo(this, 168, 34, textureX, textureY); // Box 131 air res
		bodyModel[47] = new ModelRendererTurbo(this, 168, 34, textureX, textureY); // Box 132 air res
		bodyModel[48] = new ModelRendererTurbo(this, 146, 28, textureX, textureY); // Box 78 air res support
		bodyModel[49] = new ModelRendererTurbo(this, 184, 37, textureX, textureY); // Box 51
		bodyModel[50] = new ModelRendererTurbo(this, 165, 91, textureX, textureY); // Box 62
		bodyModel[51] = new ModelRendererTurbo(this, 165, 91, textureX, textureY); // Box 63
		bodyModel[52] = new ModelRendererTurbo(this, 10, 82, textureX, textureY); // Box 548
		bodyModel[53] = new ModelRendererTurbo(this, 10, 96, textureX, textureY); // Box 550
		bodyModel[54] = new ModelRendererTurbo(this, 23, 80, textureX, textureY); // Box 58
		bodyModel[55] = new ModelRendererTurbo(this, 184, 86, textureX, textureY); // Box 59
		bodyModel[56] = new ModelRendererTurbo(this, 174, 92, textureX, textureY); // Box 60
		bodyModel[57] = new ModelRendererTurbo(this, 173, 94, textureX, textureY); // Box 61
		bodyModel[58] = new ModelRendererTurbo(this, 173, 94, textureX, textureY); // Box 62
		bodyModel[59] = new ModelRendererTurbo(this, 174, 92, textureX, textureY); // Box 63
		bodyModel[60] = new ModelRendererTurbo(this, 184, 86, textureX, textureY); // Box 64
		bodyModel[61] = new ModelRendererTurbo(this, 29, 38, textureX, textureY); // Box 65
		bodyModel[62] = new ModelRendererTurbo(this, 174, 92, textureX, textureY); // Box 69
		bodyModel[63] = new ModelRendererTurbo(this, 174, 92, textureX, textureY); // Box 70
		bodyModel[64] = new ModelRendererTurbo(this, 174, 92, textureX, textureY); // Box 71
		bodyModel[65] = new ModelRendererTurbo(this, 174, 92, textureX, textureY); // Box 72
		bodyModel[66] = new ModelRendererTurbo(this, 219, 10, textureX, textureY); // Box 73
		bodyModel[67] = new ModelRendererTurbo(this, 168, 91, textureX, textureY); // Box 74
		bodyModel[68] = new ModelRendererTurbo(this, 168, 89, textureX, textureY); // Box 75
		bodyModel[69] = new ModelRendererTurbo(this, 168, 91, textureX, textureY); // Box 76
		bodyModel[70] = new ModelRendererTurbo(this, 168, 89, textureX, textureY); // Box 77
		bodyModel[71] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 45
		bodyModel[72] = new ModelRendererTurbo(this, 4, 45, textureX, textureY); // Box 277
		bodyModel[73] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 355 brakewheel

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 542
		bodyModel[0].setRotationPoint(-28F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 543
		bodyModel[1].setRotationPoint(27.5F, 3F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[2].setRotationPoint(27F, 2.75F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 53, 2, 4, 0F); // Box 675
		bodyModel[3].setRotationPoint(-26F, 3F, -2F);

		bodyModel[4].addBox(-3F, -3F, 0F, 3, 1, 3, 0F); // Box 69
		bodyModel[4].setRotationPoint(-14F, 7.5F, -1.5F);

		bodyModel[5].addBox(-3F, -3F, 0F, 3, 1, 3, 0F); // Box 70
		bodyModel[5].setRotationPoint(18F, 7.5F, -1.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 582 i am KING PIN
		bodyModel[6].setRotationPoint(27.5F, 0.28F, 0F);

		bodyModel[7].addBox(0F, -3F, 0F, 0, 3, 20, 0F); // Box 214 fmsr pin puller
		bodyModel[7].setRotationPoint(27F, 3.28F, -10F);
		bodyModel[7].rotateAngleZ = -0.48869219F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 43, 15, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[8].setRotationPoint(-21F, -12.25F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 20, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 547
		bodyModel[9].setRotationPoint(23F, -12.25F, -10F);
		bodyModel[9].rotateAngleY = 1.57079633F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 52, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[10].setRotationPoint(-26F, 2.5F, -8.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 52, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[11].setRotationPoint(-26F, 4.5F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 52, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 581
		bodyModel[12].setRotationPoint(-26F, 4.5F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 52, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[13].setRotationPoint(-26F, 2.5F, 7.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 341 fmsr backing light housing
		bodyModel[14].setRotationPoint(20F, -16F, -4.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 342 headlight rear fmsr
		bodyModel[15].setRotationPoint(22.5F, -16F, -4.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 343 cull fmsr backing light housing
		bodyModel[16].setRotationPoint(23F, -16F, -4.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 345 numberboard glow fmsr
		bodyModel[17].setRotationPoint(20.5F, -15.5F, -4.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 346 fmsr backinglight support
		bodyModel[18].setRotationPoint(20F, -13F, -4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[19].setRotationPoint(22.95F, -13.25F, 8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow marker
		bodyModel[20].setRotationPoint(23F, -13.5F, 8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[21].setRotationPoint(23F, -13.25F, -8.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 595 glow marker
		bodyModel[22].setRotationPoint(23.05F, -13.5F, -9F);

		bodyModel[23].addBox(0F, 0F, 0F, 7, 4, 5, 0F); // Box cull pipos
		bodyModel[23].setRotationPoint(-30F, 1F, -2.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 9, 3, 3, 0F); // Box stokerbit
		bodyModel[24].setRotationPoint(-29.5F, -1F, -1.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 30, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 553
		bodyModel[25].setRotationPoint(-21F, -17.25F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 30, 5, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[26].setRotationPoint(-21F, -17.25F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 27, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[27].setRotationPoint(-18F, -16.25F, -6F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 580
		bodyModel[28].setRotationPoint(-15.5F, -17F, -2F);

		bodyModel[29].addShapeBox(0F, 0F, -2F, 20, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138 fmsr pilot beam
		bodyModel[29].setRotationPoint(25F, 1.75F, -10F);
		bodyModel[29].rotateAngleY = 1.57079633F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 0, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186 fmsr step support
		bodyModel[30].setRotationPoint(27.01F, 4.5F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, -2F, 20, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187 fmsr pilot step
		bodyModel[31].setRotationPoint(27.01F, 8.5F, -10F);
		bodyModel[31].rotateAngleY = 1.57079633F;

		bodyModel[32].addBox(0F, 0F, 0F, 18, 1, 3, 0F); // Box 32
		bodyModel[32].setRotationPoint(26F, 1.75F, -9F);
		bodyModel[32].rotateAngleY = 1.57079633F;

		bodyModel[33].addBox(0F, 0F, 0F, 3, 5, 4, 0F); // Box 33
		bodyModel[33].setRotationPoint(10F, -17F, -2F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 326
		bodyModel[34].setRotationPoint(22F, 2F, -9.01F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 327
		bodyModel[35].setRotationPoint(22F, 7F, -11F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 328
		bodyModel[36].setRotationPoint(22F, 4F, -10F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 348
		bodyModel[37].setRotationPoint(22F, 2F, 9.01F);

		bodyModel[38].addBox(-4F, 0F, -2F, 4, 0, 2, 0F); // Box 349
		bodyModel[38].setRotationPoint(22F, 7F, 9F);
		bodyModel[38].rotateAngleY = -3.14159265F;

		bodyModel[39].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 350
		bodyModel[39].setRotationPoint(22F, 4F, 9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 17, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 259 cull ladder
		bodyModel[40].setRotationPoint(23F, -17.25F, 2F);

		bodyModel[41].addBox(0F, 0F, 0F, 14, 6, 4, 0F); // Box 376 cull handrails
		bodyModel[41].setRotationPoint(9F, -18.25F, 2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 13, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
		bodyModel[42].setRotationPoint(9F, -13.75F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 12, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[43].setRotationPoint(-6F, 2.75F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 12, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[44].setRotationPoint(-6F, 2.75F, 4F);

		bodyModel[45].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 130 air res
		bodyModel[45].setRotationPoint(-3.5F, 5F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 131 air res
		bodyModel[46].setRotationPoint(-3.5F, 6F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132 air res
		bodyModel[47].setRotationPoint(-3.5F, 6F, -8F);

		bodyModel[48].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 78 air res support
		bodyModel[48].setRotationPoint(-5F, 3.5F, -9.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[49].setRotationPoint(-6F, 2.75F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 9, 0, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 62
		bodyModel[50].setRotationPoint(22F, -7.5F, 10.75F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 9, 0, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 63
		bodyModel[51].setRotationPoint(22F, -7.5F, -10.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 548
		bodyModel[52].setRotationPoint(-22F, -12.25F, -10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 550
		bodyModel[53].setRotationPoint(-22F, -12.25F, 5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 22, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[54].setRotationPoint(-21F, -4.25F, -11F);
		bodyModel[54].rotateAngleY = 1.57079633F;

		bodyModel[55].addBox(0F, 0F, 0F, 4, 11, 0, 0F); // Box 59
		bodyModel[55].setRotationPoint(-26F, -4F, -9.01F);

		bodyModel[56].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 60
		bodyModel[56].setRotationPoint(-26F, 4F, -10F);

		bodyModel[57].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 61
		bodyModel[57].setRotationPoint(-26F, 7F, -11F);

		bodyModel[58].addBox(-4F, 0F, -2F, 4, 0, 2, 0F); // Box 62
		bodyModel[58].setRotationPoint(-26F, 7F, 9F);
		bodyModel[58].rotateAngleY = -3.14159265F;

		bodyModel[59].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 63
		bodyModel[59].setRotationPoint(-26F, 4F, 9F);

		bodyModel[60].addBox(0F, 0F, 0F, 4, 11, 0, 0F); // Box 64
		bodyModel[60].setRotationPoint(-26F, -4F, 9.01F);

		bodyModel[61].addBox(0F, 0F, 0F, 18, 1, 4, 0F); // Box 65
		bodyModel[61].setRotationPoint(-22F, -4.25F, -9F);
		bodyModel[61].rotateAngleY = 1.57079633F;

		bodyModel[62].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 69
		bodyModel[62].setRotationPoint(-26F, 1F, -10F);

		bodyModel[63].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 70
		bodyModel[63].setRotationPoint(-26F, -2F, -10F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 71
		bodyModel[64].setRotationPoint(-26F, 1F, 9F);

		bodyModel[65].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 72
		bodyModel[65].setRotationPoint(-26F, -2F, 9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[66].setRotationPoint(-23F, 2.5F, -7.5F);
		bodyModel[66].rotateAngleY = 1.57079633F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 13, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F); // Box 74
		bodyModel[67].setRotationPoint(-22.5F, -11F, -11.01F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 75
		bodyModel[68].setRotationPoint(-21.5F, -12F, -11.01F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 13, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F); // Box 76
		bodyModel[69].setRotationPoint(-22.5F, -11F, 11.01F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 77
		bodyModel[70].setRotationPoint(-21.5F, -12F, 11.01F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 45
		bodyModel[71].setRotationPoint(-22.5F, -8F, -3F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[72].setRotationPoint(-22.5F, -11F, -6.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 355 brakewheel
		bodyModel[73].setRotationPoint(-22.5F, -13F, -8.5F);
	}
	ModelASF_crown_LS_truck truck = new ModelASF_crown_LS_truck();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for(ModelRendererTurbo m :bodyModel) {
			if((m.boxName.equals("lamp") || m.boxName.equals("marker"))){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				m.render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if(m.boxName.equals("cull")){
				GL11.glDisable(GL11.GL_CULL_FACE);
				m.render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			}else{
				m.render(f5);
			}
		}
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/asf_crown_ls_truck_black.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-0.95F, 0.0F, 0F);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(1.05F, 0.0F, 0);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}