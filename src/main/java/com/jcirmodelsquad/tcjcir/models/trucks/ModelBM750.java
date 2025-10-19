//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.10.2025 - 21:41:27
// Last changed on: 14.10.2025 - 21:41:27

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBM750 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public ModelBM750() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[119];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Wheel
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Wheel
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Wheel
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Wheel
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 53
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 53
		bodyModel[6] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 17
		bodyModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 24
		bodyModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 26
		bodyModel[9] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 39
		bodyModel[10] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 41
		bodyModel[11] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 149
		bodyModel[12] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 150
		bodyModel[13] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 73
		bodyModel[14] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 64
		bodyModel[15] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 120
		bodyModel[16] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 66
		bodyModel[17] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 67
		bodyModel[18] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 68
		bodyModel[19] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 69
		bodyModel[20] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 70
		bodyModel[21] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 71
		bodyModel[22] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 72
		bodyModel[23] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 73
		bodyModel[24] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 74
		bodyModel[25] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 75
		bodyModel[26] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 76
		bodyModel[27] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 77
		bodyModel[28] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 71
		bodyModel[29] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 346 tm
		bodyModel[30] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 372
		bodyModel[31] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 44
		bodyModel[32] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 53
		bodyModel[33] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 54
		bodyModel[34] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 373
		bodyModel[35] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 374
		bodyModel[36] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 405
		bodyModel[37] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 406
		bodyModel[38] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 407
		bodyModel[39] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 408
		bodyModel[40] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 409
		bodyModel[41] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 454
		bodyModel[42] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 470
		bodyModel[43] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 145
		bodyModel[44] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 146
		bodyModel[45] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 147
		bodyModel[46] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 82
		bodyModel[47] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 83
		bodyModel[48] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 84
		bodyModel[49] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 85
		bodyModel[50] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 86
		bodyModel[51] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 87
		bodyModel[52] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 89
		bodyModel[53] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 90
		bodyModel[54] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 91
		bodyModel[55] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 92
		bodyModel[56] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 117
		bodyModel[57] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 118
		bodyModel[58] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 123
		bodyModel[59] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 124
		bodyModel[60] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 152
		bodyModel[61] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 153
		bodyModel[62] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 372
		bodyModel[63] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 121
		bodyModel[64] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 122
		bodyModel[65] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 114
		bodyModel[66] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 115
		bodyModel[67] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 116
		bodyModel[68] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 117
		bodyModel[69] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 118
		bodyModel[70] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 119
		bodyModel[71] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 120
		bodyModel[72] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 121
		bodyModel[73] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 123
		bodyModel[74] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 124
		bodyModel[75] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 125
		bodyModel[76] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 126
		bodyModel[77] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 127
		bodyModel[78] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 129
		bodyModel[80] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 130
		bodyModel[81] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 131
		bodyModel[82] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 132
		bodyModel[83] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 133
		bodyModel[84] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 134
		bodyModel[85] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 135
		bodyModel[86] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 136
		bodyModel[87] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 137
		bodyModel[88] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 138
		bodyModel[89] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 139
		bodyModel[90] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 140
		bodyModel[91] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 141
		bodyModel[92] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 142
		bodyModel[93] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 143
		bodyModel[94] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 144
		bodyModel[95] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 145
		bodyModel[96] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 146
		bodyModel[97] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 147
		bodyModel[98] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 148
		bodyModel[99] = new ModelRendererTurbo(this, 5, 25, textureX, textureY); // Box 110 smol bering cab
		bodyModel[100] = new ModelRendererTurbo(this, 5, 25, textureX, textureY); // Box 339 smol bering cab
		bodyModel[101] = new ModelRendererTurbo(this, 5, 25, textureX, textureY); // Box 151
		bodyModel[102] = new ModelRendererTurbo(this, 5, 25, textureX, textureY); // Box 152
		bodyModel[103] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 153
		bodyModel[104] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 154
		bodyModel[105] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 155
		bodyModel[106] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 156
		bodyModel[107] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 157
		bodyModel[108] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 158
		bodyModel[109] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 159
		bodyModel[110] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 160
		bodyModel[111] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 161
		bodyModel[112] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 162
		bodyModel[113] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 163
		bodyModel[114] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 164
		bodyModel[115] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 165
		bodyModel[116] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 166
		bodyModel[117] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 119
		bodyModel[118] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 120

		bodyModel[0].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Wheel
		bodyModel[0].setRotationPoint(-11F, 4F, 6F);
		bodyModel[0].rotateAngleY = -0.01745329F;

		bodyModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Wheel
		bodyModel[1].setRotationPoint(-11F, 4F, -6F);
		bodyModel[1].rotateAngleY = -0.01745329F;

		bodyModel[2].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Wheel
		bodyModel[2].setRotationPoint(5F, 4F, 6F);
		bodyModel[2].rotateAngleY = -0.01745329F;

		bodyModel[3].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Wheel
		bodyModel[3].setRotationPoint(5F, 4F, -6F);
		bodyModel[3].rotateAngleY = -0.01745329F;

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 19, 0F); // Box 53
		bodyModel[4].setRotationPoint(-9F, 6F, -9.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 19, 0F); // Box 53
		bodyModel[5].setRotationPoint(7F, 6F, -9.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[6].setRotationPoint(-8F, 6.75F, -10.25F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[7].setRotationPoint(-11F, 4.5F, -8.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 26
		bodyModel[8].setRotationPoint(-3F, 5.5F, -8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[9].setRotationPoint(-11F, 4.5F, 7.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 41
		bodyModel[10].setRotationPoint(-3F, 5.5F, 7.5F);

		bodyModel[11].addShapeBox(-0.5F, -2F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 149
		bodyModel[11].setRotationPoint(-11.5F, 7F, -7.5F);

		bodyModel[12].addShapeBox(0F, 1F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 150
		bodyModel[12].setRotationPoint(-11.5F, 7F, -7.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 73
		bodyModel[13].setRotationPoint(-11F, 5F, -4.25F);
		bodyModel[13].rotateAngleY = 1.57079633F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 64
		bodyModel[14].setRotationPoint(-11F, 4F, 4.25F);
		bodyModel[14].rotateAngleY = 1.57079633F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[15].setRotationPoint(-11F, 8.5F, -8F);
		bodyModel[15].rotateAngleZ = 0.03490659F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 66
		bodyModel[16].setRotationPoint(12F, 5F, -4.25F);
		bodyModel[16].rotateAngleY = 1.57079633F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.25F, 0F, 0F); // Box 67
		bodyModel[17].setRotationPoint(12F, 4F, -8.25F);
		bodyModel[17].rotateAngleY = 1.57079633F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 1.5F, 0F, 0F); // Box 68
		bodyModel[18].setRotationPoint(12F, 4F, 4.25F);
		bodyModel[18].rotateAngleY = 1.57079633F;

		bodyModel[19].addShapeBox(-0.5F, -2F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 69
		bodyModel[19].setRotationPoint(-11.5F, 7F, 6.5F);

		bodyModel[20].addShapeBox(0F, 1F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 70
		bodyModel[20].setRotationPoint(-11.5F, 7F, 6.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 71
		bodyModel[21].setRotationPoint(-11F, 8.5F, 7F);
		bodyModel[21].rotateAngleZ = 0.03490659F;

		bodyModel[22].addShapeBox(-6F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[22].setRotationPoint(11F, 8.5F, -8F);
		bodyModel[22].rotateAngleZ = -0.03490659F;

		bodyModel[23].addShapeBox(0F, 1F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 73
		bodyModel[23].setRotationPoint(10.5F, 7F, -7.5F);

		bodyModel[24].addShapeBox(-0.5F, -2F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 74
		bodyModel[24].setRotationPoint(11.5F, 7F, -7.5F);

		bodyModel[25].addShapeBox(-0.5F, -2F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 75
		bodyModel[25].setRotationPoint(11.5F, 7F, 6.5F);

		bodyModel[26].addShapeBox(0F, 1F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 76
		bodyModel[26].setRotationPoint(10.5F, 7F, 6.5F);

		bodyModel[27].addShapeBox(-6F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 77
		bodyModel[27].setRotationPoint(11F, 8.5F, 7F);
		bodyModel[27].rotateAngleZ = -0.03490659F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 71
		bodyModel[28].setRotationPoint(-11F, 4F, -8.25F);
		bodyModel[28].rotateAngleY = 1.57079633F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 19, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346 tm
		bodyModel[29].setRotationPoint(-9.5F, 5F, -5.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 372
		bodyModel[30].setRotationPoint(-2F, 4.5F, -6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[31].setRotationPoint(-2.5F, 6F, -7.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[32].setRotationPoint(-2.5F, 6F, 5.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[33].setRotationPoint(-1.5F, 5F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 373
		bodyModel[34].setRotationPoint(9F, 6F, -9.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 374
		bodyModel[35].setRotationPoint(6F, 6F, -9.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 405
		bodyModel[36].setRotationPoint(-9F, 4F, -9.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 406
		bodyModel[37].setRotationPoint(-7F, 6F, -9.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 407
		bodyModel[38].setRotationPoint(-10F, 6F, -9.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 408
		bodyModel[39].setRotationPoint(-10F, 7F, -9.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 409
		bodyModel[40].setRotationPoint(7F, 4F, -9.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 454
		bodyModel[41].setRotationPoint(6F, 7F, -9.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[42].setRotationPoint(-2F, 6F, -9.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 145
		bodyModel[43].setRotationPoint(-6F, 4.5F, -9.3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F); // Box 146
		bodyModel[44].setRotationPoint(-5.25F, 3.75F, -8.85F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F); // Box 147
		bodyModel[45].setRotationPoint(-3.75F, 3.75F, -8.85F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 82
		bodyModel[46].setRotationPoint(-5.5F, 7F, -9.3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 83
		bodyModel[47].setRotationPoint(2.75F, 3.75F, -8.85F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 84
		bodyModel[48].setRotationPoint(4.25F, 3.75F, -8.85F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 85
		bodyModel[49].setRotationPoint(2.5F, 7F, -9.3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 86
		bodyModel[50].setRotationPoint(-8F, 7.75F, -10.25F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[51].setRotationPoint(1F, 6.75F, -10.25F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[52].setRotationPoint(-1.5F, 8.25F, -10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 90
		bodyModel[53].setRotationPoint(-0.5F, 8.25F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 91
		bodyModel[54].setRotationPoint(-1.5F, 8.25F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[55].setRotationPoint(0.5F, 8.25F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 117
		bodyModel[56].setRotationPoint(5F, 3.8F, -10.2F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 118
		bodyModel[57].setRotationPoint(6F, 3.8F, -10.2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 123
		bodyModel[58].setRotationPoint(-6F, 3.8F, -10.2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[59].setRotationPoint(-8F, 3.8F, -10.2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 152
		bodyModel[60].setRotationPoint(-6.25F, 3F, -8.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 153
		bodyModel[61].setRotationPoint(5.25F, 3F, -8.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 372
		bodyModel[62].setRotationPoint(-2F, 3.5F, -2F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 121
		bodyModel[63].setRotationPoint(-1.5F, 3.5F, -6F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 122
		bodyModel[64].setRotationPoint(-1.5F, 3.5F, 5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 114
		bodyModel[65].setRotationPoint(9F, 6F, 8.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 115
		bodyModel[66].setRotationPoint(6F, 6F, 8.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 116
		bodyModel[67].setRotationPoint(-9F, 4F, 8.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 117
		bodyModel[68].setRotationPoint(-7F, 6F, 8.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 118
		bodyModel[69].setRotationPoint(-10F, 6F, 8.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 119
		bodyModel[70].setRotationPoint(-10F, 7F, 8.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 120
		bodyModel[71].setRotationPoint(7F, 4F, 8.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 121
		bodyModel[72].setRotationPoint(6F, 7F, 8.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F); // Box 123
		bodyModel[73].setRotationPoint(7.5F, 4.75F, 8.75F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 124
		bodyModel[74].setRotationPoint(-6F, 4.5F, 8.3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F); // Box 125
		bodyModel[75].setRotationPoint(-5.25F, 3.75F, 7.85F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F); // Box 126
		bodyModel[76].setRotationPoint(-3.75F, 3.75F, 7.85F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 127
		bodyModel[77].setRotationPoint(-5.5F, 7F, 8.3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 128
		bodyModel[78].setRotationPoint(2.75F, 3.75F, 7.85F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, -1.25F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, -4.25F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.5F, 0.1F, 0.1F, -4.25F, 0.1F); // Box 129
		bodyModel[79].setRotationPoint(4.25F, 3.75F, 7.85F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 130
		bodyModel[80].setRotationPoint(2.5F, 7F, 8.3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, -0.6F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.6F, -0.6F, 0.1F, -0.6F, -0.6F); // Box 131
		bodyModel[81].setRotationPoint(7F, 3F, 9.2F);
		bodyModel[81].rotateAngleX = -0.78539816F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, -0.6F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.6F, -0.6F, 0.1F, -0.6F, -0.6F); // Box 132
		bodyModel[82].setRotationPoint(-11F, 3F, 9.2F);
		bodyModel[82].rotateAngleX = -0.78539816F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -1F, -1F, 0F, -0.25F); // Box 133
		bodyModel[83].setRotationPoint(5F, 3.8F, 6.2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 134
		bodyModel[84].setRotationPoint(6F, 3.8F, 9.2F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -1F); // Box 135
		bodyModel[85].setRotationPoint(-6F, 3.8F, 6.2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 136
		bodyModel[86].setRotationPoint(-8F, 3.8F, 9.2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 137
		bodyModel[87].setRotationPoint(-6.25F, 3F, 7.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 138
		bodyModel[88].setRotationPoint(5.25F, 3F, 7.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[89].setRotationPoint(-2F, 6F, 8.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[90].setRotationPoint(-1.5F, 5F, 6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 141
		bodyModel[91].setRotationPoint(-1F, 6.75F, 9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[92].setRotationPoint(-8F, 6.75F, 9.25F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 143
		bodyModel[93].setRotationPoint(-8F, 7.75F, 9.25F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 144
		bodyModel[94].setRotationPoint(1F, 6.75F, 9.25F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 145
		bodyModel[95].setRotationPoint(-1.5F, 8.25F, 9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 146
		bodyModel[96].setRotationPoint(-0.5F, 8.25F, 9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 147
		bodyModel[97].setRotationPoint(-1.5F, 8.25F, 9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 148
		bodyModel[98].setRotationPoint(0.5F, 8.25F, 9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110 smol bering cab
		bodyModel[99].setRotationPoint(7F, 6F, -9.75F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 339 smol bering cab
		bodyModel[100].setRotationPoint(7F, 6F, 8.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 151
		bodyModel[101].setRotationPoint(-9F, 6F, 8.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 152
		bodyModel[102].setRotationPoint(-9F, 6F, -9.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 153
		bodyModel[103].setRotationPoint(-1F, 6.75F, -10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.75F, 0F, 0F, -1.75F, 0F); // Box 154
		bodyModel[104].setRotationPoint(7.5F, 4.75F, -9.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F); // Box 155
		bodyModel[105].setRotationPoint(-8.5F, 4.75F, 8.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.75F, 0F, 0F, -1.75F, 0F); // Box 156
		bodyModel[106].setRotationPoint(-8.5F, 4.75F, -9.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[107].setRotationPoint(-6F, 4.5F, 7.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[108].setRotationPoint(-6F, 4.5F, -8.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 159
		bodyModel[109].setRotationPoint(-10F, 4F, 7.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 160
		bodyModel[110].setRotationPoint(-10F, 4F, -8.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 161
		bodyModel[111].setRotationPoint(6F, 4F, 7.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 162
		bodyModel[112].setRotationPoint(6F, 4F, -8.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[113].setRotationPoint(3F, 4.5F, -8.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[114].setRotationPoint(10F, 4.5F, -8.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[115].setRotationPoint(10F, 4.5F, 7.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[116].setRotationPoint(3F, 4.5F, 7.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, -0.6F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.6F, -0.6F, 0.1F, -0.6F, -0.6F); // Box 119
		bodyModel[117].setRotationPoint(7F, 3F, -9.2F);
		bodyModel[117].rotateAngleX = -0.78539816F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, -0.6F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.6F, -0.6F, 0.1F, -0.6F, -0.6F); // Box 120
		bodyModel[118].setRotationPoint(-11F, 3F, -9.2F);
		bodyModel[118].rotateAngleX = -0.78539816F;
	}
}