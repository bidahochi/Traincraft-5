//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: golf truck v2
// Model Creator: bida
// Created on: 16.10.2025 - 10:24:14
// Last changed on: 16.10.2025 - 10:24:14

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelgolftruck extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public Modelgolftruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[76];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 4 axle
		bodyModel[1] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 5 axle
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46 whee
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48 wheel
		bodyModel[6] = new ModelRendererTurbo(this, 12, 53, textureX, textureY); // Box 104 smol bering cab
		bodyModel[7] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Box 110 smol bering cab
		bodyModel[8] = new ModelRendererTurbo(this, 5, 57, textureX, textureY); // Box 339 smol bering cab
		bodyModel[9] = new ModelRendererTurbo(this, 12, 57, textureX, textureY); // Box 340 smol bering cab
		bodyModel[10] = new ModelRendererTurbo(this, 24, 46, textureX, textureY); // Box 346 tm
		bodyModel[11] = new ModelRendererTurbo(this, 24, 46, textureX, textureY); // Box 369 tm
		bodyModel[12] = new ModelRendererTurbo(this, 48, 20, textureX, textureY); // Box 372
		bodyModel[13] = new ModelRendererTurbo(this, 52, 27, textureX, textureY); // Box 121
		bodyModel[14] = new ModelRendererTurbo(this, 52, 27, textureX, textureY); // Box 122
		bodyModel[15] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 149
		bodyModel[16] = new ModelRendererTurbo(this, 34, 7, textureX, textureY); // Box 51
		bodyModel[17] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 52
		bodyModel[18] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 101
		bodyModel[19] = new ModelRendererTurbo(this, 34, 7, textureX, textureY); // Box 102
		bodyModel[20] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 103
		bodyModel[21] = new ModelRendererTurbo(this, 39, 10, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 39, 10, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 44, 1, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 32, 10, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 1, 48, textureX, textureY); // Box 157
		bodyModel[27] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 158
		bodyModel[28] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Box 155
		bodyModel[29] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Box 156
		bodyModel[30] = new ModelRendererTurbo(this, 7, 48, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 7, 48, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 16, 7, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 46, 7, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 44, 1, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 32, 10, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 16, 7, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 46, 7, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 22, 20, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Box 47
		bodyModel[41] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Box 48
		bodyModel[42] = new ModelRendererTurbo(this, 7, 48, textureX, textureY); // Box 49
		bodyModel[43] = new ModelRendererTurbo(this, 7, 48, textureX, textureY); // Box 50
		bodyModel[44] = new ModelRendererTurbo(this, 1, 48, textureX, textureY); // Box 51
		bodyModel[45] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 52
		bodyModel[46] = new ModelRendererTurbo(this, 57, 15, textureX, textureY); // Box 53
		bodyModel[47] = new ModelRendererTurbo(this, 57, 15, textureX, textureY); // Box 54
		bodyModel[48] = new ModelRendererTurbo(this, 57, 15, textureX, textureY); // Box 55
		bodyModel[49] = new ModelRendererTurbo(this, 57, 15, textureX, textureY); // Box 56
		bodyModel[50] = new ModelRendererTurbo(this, 25, 10, textureX, textureY); // Box 52
		bodyModel[51] = new ModelRendererTurbo(this, 25, 10, textureX, textureY); // Box 53
		bodyModel[52] = new ModelRendererTurbo(this, 25, 10, textureX, textureY); // Box 54
		bodyModel[53] = new ModelRendererTurbo(this, 25, 10, textureX, textureY); // Box 55
		bodyModel[54] = new ModelRendererTurbo(this, 18, 10, textureX, textureY); // Box 56
		bodyModel[55] = new ModelRendererTurbo(this, 18, 10, textureX, textureY); // Box 57
		bodyModel[56] = new ModelRendererTurbo(this, 18, 10, textureX, textureY); // Box 58
		bodyModel[57] = new ModelRendererTurbo(this, 18, 10, textureX, textureY); // Box 59
		bodyModel[58] = new ModelRendererTurbo(this, 59, 45, textureX, textureY); // Box 149
		bodyModel[59] = new ModelRendererTurbo(this, 59, 50, textureX, textureY); // Box 150
		bodyModel[60] = new ModelRendererTurbo(this, 43, 39, textureX, textureY); // Box 73
		bodyModel[61] = new ModelRendererTurbo(this, 32, 39, textureX, textureY); // Box 71
		bodyModel[62] = new ModelRendererTurbo(this, 32, 39, textureX, textureY); // Box 64
		bodyModel[63] = new ModelRendererTurbo(this, 49, 42, textureX, textureY); // Box 120
		bodyModel[64] = new ModelRendererTurbo(this, 43, 39, textureX, textureY); // Box 66
		bodyModel[65] = new ModelRendererTurbo(this, 32, 39, textureX, textureY); // Box 67
		bodyModel[66] = new ModelRendererTurbo(this, 32, 39, textureX, textureY); // Box 68
		bodyModel[67] = new ModelRendererTurbo(this, 59, 45, textureX, textureY); // Box 69
		bodyModel[68] = new ModelRendererTurbo(this, 59, 50, textureX, textureY); // Box 70
		bodyModel[69] = new ModelRendererTurbo(this, 49, 42, textureX, textureY); // Box 71
		bodyModel[70] = new ModelRendererTurbo(this, 49, 42, textureX, textureY); // Box 72
		bodyModel[71] = new ModelRendererTurbo(this, 59, 50, textureX, textureY); // Box 73
		bodyModel[72] = new ModelRendererTurbo(this, 59, 45, textureX, textureY); // Box 74
		bodyModel[73] = new ModelRendererTurbo(this, 59, 45, textureX, textureY); // Box 75
		bodyModel[74] = new ModelRendererTurbo(this, 59, 50, textureX, textureY); // Box 76
		bodyModel[75] = new ModelRendererTurbo(this, 49, 42, textureX, textureY); // Box 77

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4 axle
		bodyModel[0].setRotationPoint(-9F, 6F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5 axle
		bodyModel[1].setRotationPoint(7F, 6F, -9F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[2].setRotationPoint(8F, 7F, 5.5F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 whee
		bodyModel[3].setRotationPoint(-8F, 7F, 5.5F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[4].setRotationPoint(-8F, 7F, -5.5F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[5].setRotationPoint(8F, 7F, -5.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104 smol bering cab
		bodyModel[6].setRotationPoint(-9F, 6F, -9.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110 smol bering cab
		bodyModel[7].setRotationPoint(7F, 6F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 339 smol bering cab
		bodyModel[8].setRotationPoint(7F, 6F, 8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 340 smol bering cab
		bodyModel[9].setRotationPoint(-9F, 6F, 8.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 7, 4, 10, 0F); // Box 346 tm
		bodyModel[10].setRotationPoint(-9.5F, 5F, -5F);

		bodyModel[11].addBox(0F, 0F, 0F, 7, 4, 10, 0F); // Box 369 tm
		bodyModel[11].setRotationPoint(9.5F, 5F, 5F);
		bodyModel[11].rotateAngleY = 3.14159265F;

		bodyModel[12].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 372
		bodyModel[12].setRotationPoint(-2F, 3.5F, -2F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 121
		bodyModel[13].setRotationPoint(-1.5F, 3.5F, -6F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 122
		bodyModel[14].setRotationPoint(-1.5F, 3.5F, 5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 149
		bodyModel[15].setRotationPoint(-1.25F, 3.25F, 8.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 51
		bodyModel[16].setRotationPoint(-1.5F, 7F, 8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 52
		bodyModel[17].setRotationPoint(0.25F, 3.25F, 8.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 101
		bodyModel[18].setRotationPoint(-1.25F, 3.25F, -9.75F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[19].setRotationPoint(-1.5F, 7F, -9.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 103
		bodyModel[20].setRotationPoint(0.25F, 3.25F, -9.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 21
		bodyModel[21].setRotationPoint(-2F, 4F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-2F, 4F, 2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(-11F, 4.5F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(3F, 4.5F, -8.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 26
		bodyModel[25].setRotationPoint(-3F, 5.5F, -8.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 157
		bodyModel[26].setRotationPoint(-4.5F, 5F, -9.5F);
		bodyModel[26].rotateAngleX = -0.78539816F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 158
		bodyModel[27].setRotationPoint(2.5F, 5F, -9.5F);
		bodyModel[27].rotateAngleX = -0.78539816F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[28].setRotationPoint(4.5F, 5.9F, -10.25F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 156
		bodyModel[29].setRotationPoint(5.5F, 5.9F, -10.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 35
		bodyModel[30].setRotationPoint(-5.5F, 5.9F, -10.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 36
		bodyModel[31].setRotationPoint(-6.5F, 5.9F, -10.25F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 37
		bodyModel[32].setRotationPoint(-10F, 8.5F, -8.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[33].setRotationPoint(3F, 8.5F, -8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(-11F, 4.5F, 7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[35].setRotationPoint(3F, 4.5F, 7.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 41
		bodyModel[36].setRotationPoint(-3F, 5.5F, 7.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 42
		bodyModel[37].setRotationPoint(-10F, 8.5F, 7.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[38].setRotationPoint(3F, 8.5F, 7.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 5, 3, 15, 0F); // Box 44
		bodyModel[39].setRotationPoint(-2.5F, 6F, -7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 47
		bodyModel[40].setRotationPoint(4.5F, 5.9F, 9.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F); // Box 48
		bodyModel[41].setRotationPoint(5.5F, 5.9F, 6.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 49
		bodyModel[42].setRotationPoint(-5.5F, 5.9F, 9.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F); // Box 50
		bodyModel[43].setRotationPoint(-6.5F, 5.9F, 6.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 51
		bodyModel[44].setRotationPoint(-4.5F, 5F, 9.5F);
		bodyModel[44].rotateAngleX = -0.78539816F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 52
		bodyModel[45].setRotationPoint(2.5F, 5F, 9.5F);
		bodyModel[45].rotateAngleX = -0.78539816F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 53
		bodyModel[46].setRotationPoint(-9F, 5F, -8.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 54
		bodyModel[47].setRotationPoint(7F, 5F, -8.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 55
		bodyModel[48].setRotationPoint(-9F, 5F, 7.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 56
		bodyModel[49].setRotationPoint(7F, 5F, 7.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0.5F, -0.25F, -2F, 0.5F, -0.25F, -2F, 0.5F, -0.25F, -2F, 0.5F); // Box 52
		bodyModel[50].setRotationPoint(-9F, 5F, -8.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0.5F, -0.25F, -2F, 0.5F, -0.25F, -2F, 0.5F, -0.25F, -2F, 0.5F); // Box 53
		bodyModel[51].setRotationPoint(-9F, 5F, 7.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0.5F, -0.25F, -2F, 0.5F, -0.25F, -2F, 0.5F, -0.25F, -2F, 0.5F); // Box 54
		bodyModel[52].setRotationPoint(7F, 5F, 7.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0.5F, -0.25F, -2F, 0.5F, -0.25F, -2F, 0.5F, -0.25F, -2F, 0.5F); // Box 55
		bodyModel[53].setRotationPoint(7F, 5F, -8.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 56
		bodyModel[54].setRotationPoint(-9F, 4F, -8.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 57
		bodyModel[55].setRotationPoint(-9F, 4F, 7.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 58
		bodyModel[56].setRotationPoint(7F, 4F, 7.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 59
		bodyModel[57].setRotationPoint(7F, 4F, -8.5F);

		bodyModel[58].addShapeBox(-0.5F, -2F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 149
		bodyModel[58].setRotationPoint(-11.5F, 7F, -7.5F);

		bodyModel[59].addShapeBox(0F, 1F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 150
		bodyModel[59].setRotationPoint(-11.5F, 7F, -7.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 73
		bodyModel[60].setRotationPoint(-11F, 5F, -4.25F);
		bodyModel[60].rotateAngleY = 1.57079633F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 71
		bodyModel[61].setRotationPoint(-11F, 4F, -8.25F);
		bodyModel[61].rotateAngleY = 1.57079633F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 64
		bodyModel[62].setRotationPoint(-11F, 4F, 4.25F);
		bodyModel[62].rotateAngleY = 1.57079633F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[63].setRotationPoint(-11F, 8.5F, -8F);
		bodyModel[63].rotateAngleZ = 0.03490659F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 66
		bodyModel[64].setRotationPoint(12F, 5F, -4.25F);
		bodyModel[64].rotateAngleY = 1.57079633F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.25F, 0F, 0F); // Box 67
		bodyModel[65].setRotationPoint(12F, 4F, -8.25F);
		bodyModel[65].rotateAngleY = 1.57079633F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 1.5F, 0F, 0F); // Box 68
		bodyModel[66].setRotationPoint(12F, 4F, 4.25F);
		bodyModel[66].rotateAngleY = 1.57079633F;

		bodyModel[67].addShapeBox(-0.5F, -2F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 69
		bodyModel[67].setRotationPoint(-11.5F, 7F, 6.5F);

		bodyModel[68].addShapeBox(0F, 1F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 70
		bodyModel[68].setRotationPoint(-11.5F, 7F, 6.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 71
		bodyModel[69].setRotationPoint(-11F, 8.5F, 7F);
		bodyModel[69].rotateAngleZ = 0.03490659F;

		bodyModel[70].addShapeBox(-6F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[70].setRotationPoint(11F, 8.5F, -8F);
		bodyModel[70].rotateAngleZ = -0.03490659F;

		bodyModel[71].addShapeBox(0F, 1F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 73
		bodyModel[71].setRotationPoint(10.5F, 7F, -7.5F);

		bodyModel[72].addShapeBox(-0.5F, -2F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 74
		bodyModel[72].setRotationPoint(11.5F, 7F, -7.5F);

		bodyModel[73].addShapeBox(-0.5F, -2F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 75
		bodyModel[73].setRotationPoint(11.5F, 7F, 6.5F);

		bodyModel[74].addShapeBox(0F, 1F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 76
		bodyModel[74].setRotationPoint(10.5F, 7F, 6.5F);

		bodyModel[75].addShapeBox(-6F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 77
		bodyModel[75].setRotationPoint(11F, 8.5F, 7F);
		bodyModel[75].rotateAngleZ = -0.03490659F;
	}
}