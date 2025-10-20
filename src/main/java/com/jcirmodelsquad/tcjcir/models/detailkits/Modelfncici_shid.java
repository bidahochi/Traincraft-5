//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: fncici_shid
// Model Creator: biboos
// Created on: 05.05.2024 - 14:57:41
// Last changed on: 05.05.2024 - 14:57:41

package com.jcirmodelsquad.tcjcir.models.detailkits; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelfncici_shid extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public Modelfncici_shid() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[54];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 165, 189, textureX, textureY); // Box 53
		bodyModel[1] = new ModelRendererTurbo(this, 178, 192, textureX, textureY); // Box 54
		bodyModel[2] = new ModelRendererTurbo(this, 163, 162, textureX, textureY); // Box 55
		bodyModel[3] = new ModelRendererTurbo(this, 201, 167, textureX, textureY, "lamp"); // Box 71 markerlight cull
		bodyModel[4] = new ModelRendererTurbo(this, 185, 189, textureX, textureY); // Box 235
		bodyModel[5] = new ModelRendererTurbo(this, 201, 167, textureX, textureY, "lamp"); // Box 124 markerlight cull
		bodyModel[6] = new ModelRendererTurbo(this, 163, 148, textureX, textureY); // Box 125
		bodyModel[7] = new ModelRendererTurbo(this, 198, 197, textureX, textureY); // Box 338
		bodyModel[8] = new ModelRendererTurbo(this, 211, 197, textureX, textureY); // Box 340
		bodyModel[9] = new ModelRendererTurbo(this, 198, 195, textureX, textureY); // Box 344
		bodyModel[10] = new ModelRendererTurbo(this, 189, 168, textureX, textureY); // Box 143
		bodyModel[11] = new ModelRendererTurbo(this, 105, 217, textureX, textureY); // Box 52 door swing right
		bodyModel[12] = new ModelRendererTurbo(this, 145, 204, textureX, textureY); // Box 70
		bodyModel[13] = new ModelRendererTurbo(this, 43, 220, textureX, textureY); // Box 72
		bodyModel[14] = new ModelRendererTurbo(this, 116, 220, textureX, textureY); // Box 190
		bodyModel[15] = new ModelRendererTurbo(this, 70, 205, textureX, textureY); // Box 313
		bodyModel[16] = new ModelRendererTurbo(this, 182, 217, textureX, textureY); // Box 314 door swing right
		bodyModel[17] = new ModelRendererTurbo(this, 112, 153, textureX, textureY); // Box 68
		bodyModel[18] = new ModelRendererTurbo(this, 128, 180, textureX, textureY); // Box 69
		bodyModel[19] = new ModelRendererTurbo(this, 179, 140, textureX, textureY); // Box 74
		bodyModel[20] = new ModelRendererTurbo(this, 190, 137, textureX, textureY); // Box 75
		bodyModel[21] = new ModelRendererTurbo(this, 164, 137, textureX, textureY); // Box 76
		bodyModel[22] = new ModelRendererTurbo(this, 178, 127, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[23] = new ModelRendererTurbo(this, 178, 127, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[24] = new ModelRendererTurbo(this, 181, 135, textureX, textureY, "lamp"); // Box 186 Headlight Front
		bodyModel[25] = new ModelRendererTurbo(this, 181, 135, textureX, textureY, "lamp"); // Box 187 Headlight Front
		bodyModel[26] = new ModelRendererTurbo(this, 89, 156, textureX, textureY); // Box 332
		bodyModel[27] = new ModelRendererTurbo(this, 89, 178, textureX, textureY); // Box 333
		bodyModel[28] = new ModelRendererTurbo(this, 128, 173, textureX, textureY); // Box 67
		bodyModel[29] = new ModelRendererTurbo(this, 224, 197, textureX, textureY); // Box 323
		bodyModel[30] = new ModelRendererTurbo(this, 209, 162, textureX, textureY); // Box 96
		bodyModel[31] = new ModelRendererTurbo(this, 221, 179, textureX, textureY); // Box 312
		bodyModel[32] = new ModelRendererTurbo(this, 119, 187, textureX, textureY); // Box 410
		bodyModel[33] = new ModelRendererTurbo(this, 119, 187, textureX, textureY); // Box 411
		bodyModel[34] = new ModelRendererTurbo(this, 119, 182, textureX, textureY, "lamp"); // Box 412 ditchlight f glow
		bodyModel[35] = new ModelRendererTurbo(this, 119, 182, textureX, textureY, "lamp"); // Box 412 ditchlight f glow
		bodyModel[36] = new ModelRendererTurbo(this, 28, 197, textureX, textureY); // Box 412 cs
		bodyModel[37] = new ModelRendererTurbo(this, 42, 197, textureX, textureY); // Box 413 cs
		bodyModel[38] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86 cs
		bodyModel[39] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // Box 531 cs
		bodyModel[40] = new ModelRendererTurbo(this, 17, 194, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[41] = new ModelRendererTurbo(this, 17, 189, textureX, textureY); // Box 307 spedo
		bodyModel[42] = new ModelRendererTurbo(this, 267, 156, textureX, textureY); // Box 18 late stack
		bodyModel[43] = new ModelRendererTurbo(this, 265, 164, textureX, textureY); // Box 21 late stack
		bodyModel[44] = new ModelRendererTurbo(this, 284, 167, textureX, textureY); // Box 88
		bodyModel[45] = new ModelRendererTurbo(this, 273, 181, textureX, textureY); // Box 233
		bodyModel[46] = new ModelRendererTurbo(this, 284, 153, textureX, textureY); // Box 312
		bodyModel[47] = new ModelRendererTurbo(this, 292, 206, textureX, textureY); // Box 183
		bodyModel[48] = new ModelRendererTurbo(this, 292, 211, textureX, textureY); // Box 184
		bodyModel[49] = new ModelRendererTurbo(this, 397, 212, textureX, textureY); // Box 547
		bodyModel[50] = new ModelRendererTurbo(this, 397, 234, textureX, textureY); // Box 345
		bodyModel[51] = new ModelRendererTurbo(this, 342, 194, textureX, textureY); // Box 119
		bodyModel[52] = new ModelRendererTurbo(this, 341, 186, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 249, 184, textureX, textureY); // Box 45

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 53
		bodyModel[0].setRotationPoint(-44F, -14F, 1F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 54
		bodyModel[1].setRotationPoint(-44F, -14F, -1F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 14, 12, 0F); // Box 55
		bodyModel[2].setRotationPoint(-43F, -14F, -6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F); // Box 71 markerlight cull
		bodyModel[3].setRotationPoint(-43.25F, -13F, -5.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[4].setRotationPoint(-44F, -14F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 markerlight cull
		bodyModel[5].setRotationPoint(-43.25F, -13F, 3.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[6].setRotationPoint(-43F, -15F, -6F);

		bodyModel[7].addBox(0F, 0F, 0F, 6, 11, 0, 0F); // Box 338
		bodyModel[7].setRotationPoint(-43.5F, -15F, -5.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 11, 0, 0F); // Box 340
		bodyModel[8].setRotationPoint(-43.5F, -15F, 5.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 344
		bodyModel[9].setRotationPoint(-40.5F, -15F, 5.5F);
		bodyModel[9].rotateAngleY = -0.78539816F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143
		bodyModel[10].setRotationPoint(-43.5F, -14.5F, -1F);

		bodyModel[11].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[11].setRotationPoint(-36.5F, -19F, -9.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 70
		bodyModel[12].setRotationPoint(-25F, -19F, -10F);

		bodyModel[13].addBox(0F, 0F, 0F, 12, 14, 1, 0F); // Box 72
		bodyModel[13].setRotationPoint(-37F, -19F, 10F);

		bodyModel[14].addBox(0F, 0F, 0F, 13, 14, 1, 0F); // Box 190
		bodyModel[14].setRotationPoint(-37F, -19F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 313
		bodyModel[15].setRotationPoint(-37F, -19F, -6F);

		bodyModel[16].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[16].setRotationPoint(-24.5F, -19F, 10.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 13, 1, 18, 0F); // Box 68
		bodyModel[17].setRotationPoint(-37F, -23F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[18].setRotationPoint(-37F, -23F, 9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[19].setRotationPoint(-40F, -23F, -1F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[20].setRotationPoint(-39F, -23F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[21].setRotationPoint(-39F, -23F, 1F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[22].setRotationPoint(-37.05F, -22F, -6F);
		bodyModel[22].rotateAngleY = 0.38397244F;

		bodyModel[23].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[23].setRotationPoint(-37.05F, -22F, 6F);
		bodyModel[23].rotateAngleY = -0.38397244F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front
		bodyModel[24].setRotationPoint(-39.75F, -23F, -1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front
		bodyModel[25].setRotationPoint(-39.75F, -21F, -1F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 332
		bodyModel[26].setRotationPoint(-37F, -22F, -9F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 333
		bodyModel[27].setRotationPoint(-25F, -22F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[28].setRotationPoint(-37F, -23F, -11F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 323
		bodyModel[29].setRotationPoint(-41F, -5F, -7F);

		bodyModel[30].addBox(0F, 0F, 0F, 19, 2, 14, 0F); // Box 96
		bodyModel[30].setRotationPoint(-24F, -23F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[31].setRotationPoint(-5F, -23F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[32].setRotationPoint(-48.5F, -4F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[33].setRotationPoint(-48.5F, -4F, 4F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f glow
		bodyModel[34].setRotationPoint(-48.75F, -4F, -6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f glow
		bodyModel[35].setRotationPoint(-48.75F, -4F, 4F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[36].setRotationPoint(-29.8F, -15F, -5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[37].setRotationPoint(-36.5F, -13F, -3F);
		bodyModel[37].rotateAngleY = -0.45378561F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[38].setRotationPoint(-36.5F, -15F, -3F);
		bodyModel[38].rotateAngleY = -0.45378561F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[39].setRotationPoint(-36.5F, -9F, -3F);
		bodyModel[39].rotateAngleY = -0.45378561F;

		bodyModel[40].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[40].setRotationPoint(-34.5F, -17.25F, -2F);
		bodyModel[40].rotateAngleY = 0.78539816F;

		bodyModel[41].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo
		bodyModel[41].setRotationPoint(-34.5F, -17.25F, -2F);
		bodyModel[41].rotateAngleY = 0.78539816F;

		bodyModel[42].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18 late stack
		bodyModel[42].setRotationPoint(17F, -23.5F, -3F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 21 late stack
		bodyModel[43].setRotationPoint(16.5F, -22.5F, -3.5F);

		bodyModel[44].addShapeBox(0F, -1F, 0F, 22, 2, 11, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[44].setRotationPoint(22F, -23F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 22, 2, 22, 0F); // Box 233
		bodyModel[45].setRotationPoint(22F, -22F, -11F);

		bodyModel[46].addShapeBox(0F, -1F, 0F, 22, 2, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[46].setRotationPoint(22F, -23F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 183
		bodyModel[47].setRotationPoint(22F, -20F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 184
		bodyModel[48].setRotationPoint(22F, -20F, 8F);

		bodyModel[49].addShapeBox(0F, 0F, 0.5F, 36, 1, 19, 0F,0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -9.4F, 0F, 0F, -9.4F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -9.4F, 0F, 0F, -9.4F); // Box 547
		bodyModel[49].setRotationPoint(25F, -23.38F, 1F);
		bodyModel[49].rotateAngleX = -0.13613568F;

		bodyModel[50].addShapeBox(0F, 0F, -19.5F, 36, 1, 19, 0F,0F, 0F, -9.4F, -18F, 0F, -9.4F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.4F, -18F, 0F, -9.4F, -18F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[50].setRotationPoint(25F, -23.38F, -1F);
		bodyModel[50].rotateAngleX = 0.13613568F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 119
		bodyModel[51].setRotationPoint(33F, -20F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[52].setRotationPoint(33F, -20F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 45
		bodyModel[53].setRotationPoint(22F, -20F, -7.75F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for(ModelRendererTurbo m :bodyModel) {
			if(m.boxName.equals("lamp")){
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
	}
}