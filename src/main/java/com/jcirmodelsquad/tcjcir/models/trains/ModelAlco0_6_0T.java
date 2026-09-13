//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ClimaxNew
// Model Creator: Bida
// Created on: 27.10.2020 - 13:21:34
// Last changed on: 27.10.2020 - 13:21:34

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.client.renderhelper.ModelRenderHelper;

public class ModelAlco0_6_0T extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelAlco0_6_0T() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[332];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 126, 27, textureX, textureY); // Box 35
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // boiler
		bodyModel[2] = new ModelRendererTurbo(this, 0, 8, textureX, textureY); // boiler
		bodyModel[3] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // boiler
		bodyModel[4] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 79
		bodyModel[5] = new ModelRendererTurbo(this, 49, 58, textureX, textureY); // Box 202
		bodyModel[6] = new ModelRendererTurbo(this, 60, 56, textureX, textureY); // Box 203
		bodyModel[7] = new ModelRendererTurbo(this, 55, 58, textureX, textureY); // Box 206
		bodyModel[8] = new ModelRendererTurbo(this, 63, 63, textureX, textureY); // Box 207
		bodyModel[9] = new ModelRendererTurbo(this, 63, 63, textureX, textureY); // Box 321
		bodyModel[10] = new ModelRendererTurbo(this, 55, 58, textureX, textureY); // Box 322
		bodyModel[11] = new ModelRendererTurbo(this, 81, 11, textureX, textureY); // Box 88
		bodyModel[12] = new ModelRendererTurbo(this, 0, 31, textureX, textureY); // tank
		bodyModel[13] = new ModelRendererTurbo(this, 0, 41, textureX, textureY); // tank
		bodyModel[14] = new ModelRendererTurbo(this, 0, 53, textureX, textureY); // tank
		bodyModel[15] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // tank
		bodyModel[16] = new ModelRendererTurbo(this, 0, 31, textureX, textureY); // tank
		bodyModel[17] = new ModelRendererTurbo(this, 0, 41, textureX, textureY); // tank
		bodyModel[18] = new ModelRendererTurbo(this, 0, 53, textureX, textureY); // tank
		bodyModel[19] = new ModelRendererTurbo(this, 0, 96, textureX, textureY); // Box 105
		bodyModel[20] = new ModelRendererTurbo(this, 70, 96, textureX, textureY); // Box 106
		bodyModel[21] = new ModelRendererTurbo(this, 90, 112, textureX, textureY); // Box 132
		bodyModel[22] = new ModelRendererTurbo(this, 90, 116, textureX, textureY); // Box 133
		bodyModel[23] = new ModelRendererTurbo(this, 90, 123, textureX, textureY); // Box 135
		bodyModel[24] = new ModelRendererTurbo(this, 90, 112, textureX, textureY); // Box 172
		bodyModel[25] = new ModelRendererTurbo(this, 90, 116, textureX, textureY); // Box 173
		bodyModel[26] = new ModelRendererTurbo(this, 90, 109, textureX, textureY); // Box 171
		bodyModel[27] = new ModelRendererTurbo(this, 90, 109, textureX, textureY); // Box 113
		bodyModel[28] = new ModelRendererTurbo(this, 48, 96, textureX, textureY); // Box 114
		bodyModel[29] = new ModelRendererTurbo(this, 25, 96, textureX, textureY); // Box 115
		bodyModel[30] = new ModelRendererTurbo(this, 47, 96, textureX, textureY); // Box 117
		bodyModel[31] = new ModelRendererTurbo(this, 0, 62, textureX, textureY); // Box 119
		bodyModel[32] = new ModelRendererTurbo(this, 0, 88, textureX, textureY); // Box 120
		bodyModel[33] = new ModelRendererTurbo(this, 102, 52, textureX, textureY); // Box 194
		bodyModel[34] = new ModelRendererTurbo(this, 104, 57, textureX, textureY); // Box 195
		bodyModel[35] = new ModelRendererTurbo(this, 68, 51, textureX, textureY); // Box 202
		bodyModel[36] = new ModelRendererTurbo(this, 69, 56, textureX, textureY); // Box 203
		bodyModel[37] = new ModelRendererTurbo(this, 90, 49, textureX, textureY); // Box 206
		bodyModel[38] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 207
		bodyModel[39] = new ModelRendererTurbo(this, 90, 49, textureX, textureY); // Box 324
		bodyModel[40] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 325
		bodyModel[41] = new ModelRendererTurbo(this, 104, 57, textureX, textureY); // Box 326
		bodyModel[42] = new ModelRendererTurbo(this, 81, 54, textureX, textureY); // Box 142
		bodyModel[43] = new ModelRendererTurbo(this, 86, 56, textureX, textureY); // Box 143
		bodyModel[44] = new ModelRendererTurbo(this, 81, 54, textureX, textureY); // Box 144
		bodyModel[45] = new ModelRendererTurbo(this, 49, 63, textureX, textureY); // Box 148
		bodyModel[46] = new ModelRendererTurbo(this, 54, 63, textureX, textureY); // Box 149
		bodyModel[47] = new ModelRendererTurbo(this, 49, 63, textureX, textureY); // Box 150
		bodyModel[48] = new ModelRendererTurbo(this, 49, 63, textureX, textureY); // Box 151
		bodyModel[49] = new ModelRendererTurbo(this, 55, 58, textureX, textureY); // Box 152
		bodyModel[50] = new ModelRendererTurbo(this, 63, 63, textureX, textureY); // Box 153
		bodyModel[51] = new ModelRendererTurbo(this, 63, 63, textureX, textureY); // Box 154
		bodyModel[52] = new ModelRendererTurbo(this, 49, 58, textureX, textureY); // Box 155
		bodyModel[53] = new ModelRendererTurbo(this, 60, 56, textureX, textureY); // Box 156
		bodyModel[54] = new ModelRendererTurbo(this, 55, 58, textureX, textureY); // Box 157
		bodyModel[55] = new ModelRendererTurbo(this, 49, 63, textureX, textureY); // Box 158
		bodyModel[56] = new ModelRendererTurbo(this, 54, 63, textureX, textureY); // Box 159
		bodyModel[57] = new ModelRendererTurbo(this, 90, 32, textureX, textureY); // Box 206
		bodyModel[58] = new ModelRendererTurbo(this, 90, 32, textureX, textureY); // Box 206
		bodyModel[59] = new ModelRendererTurbo(this, 97, 32, textureX, textureY); // Box 206
		bodyModel[60] = new ModelRendererTurbo(this, 85, 32, textureX, textureY); // Box 206
		bodyModel[61] = new ModelRendererTurbo(this, 85, 32, textureX, textureY); // Box 206
		bodyModel[62] = new ModelRendererTurbo(this, 80, 32, textureX, textureY); // Box 206
		bodyModel[63] = new ModelRendererTurbo(this, 80, 32, textureX, textureY); // Box 206
		bodyModel[64] = new ModelRendererTurbo(this, 90, 29, textureX, textureY); // Box 206
		bodyModel[65] = new ModelRendererTurbo(this, 80, 32, textureX, textureY); // Box 206
		bodyModel[66] = new ModelRendererTurbo(this, 0, 171, textureX, textureY); // Box 170
		bodyModel[67] = new ModelRendererTurbo(this, 100, 7, textureX, textureY); // Box 162
		bodyModel[68] = new ModelRendererTurbo(this, 100, 16, textureX, textureY); // Box 163
		bodyModel[69] = new ModelRendererTurbo(this, 109, 17, textureX, textureY); // Box 164
		bodyModel[70] = new ModelRendererTurbo(this, 109, 17, textureX, textureY); // Box 165
		bodyModel[71] = new ModelRendererTurbo(this, 118, 19, textureX, textureY); // Box 212
		bodyModel[72] = new ModelRendererTurbo(this, 116, 12, textureX, textureY); // Box 213
		bodyModel[73] = new ModelRendererTurbo(this, 129, 12, textureX, textureY,"lamp"); // bulb2
		bodyModel[74] = new ModelRendererTurbo(this, 129, 17, textureX, textureY,"numberboard").setLightFixtureId("numberboard_body_74"); // numberboard
		bodyModel[75] = new ModelRendererTurbo(this, 132, 8, textureX, textureY); // Box 184
		bodyModel[76] = new ModelRendererTurbo(this, 116, 0, textureX, textureY); // Box 96
		bodyModel[77] = new ModelRendererTurbo(this, 129, 0, textureX, textureY,"lamp"); // bulb
		bodyModel[78] = new ModelRendererTurbo(this, 125, 7, textureX, textureY); // Box 189
		bodyModel[79] = new ModelRendererTurbo(this, 125, 7, textureX, textureY); // Box 192
		bodyModel[80] = new ModelRendererTurbo(this, 113, 21, textureX, textureY); // Switching Pilot
		bodyModel[81] = new ModelRendererTurbo(this, 69, 68, textureX, textureY); // Box 350
		bodyModel[82] = new ModelRendererTurbo(this, 69, 68, textureX, textureY); // Box 224
		bodyModel[83] = new ModelRendererTurbo(this, 69, 65, textureX, textureY); // Box 225
		bodyModel[84] = new ModelRendererTurbo(this, 69, 65, textureX, textureY); // Box 226
		bodyModel[85] = new ModelRendererTurbo(this, 51, 43, textureX, textureY); // Box 177
		bodyModel[86] = new ModelRendererTurbo(this, 93, 38, textureX, textureY); // aircompressor airside
		bodyModel[87] = new ModelRendererTurbo(this, 80, 38, textureX, textureY); // aircompressor steamside
		bodyModel[88] = new ModelRendererTurbo(this, 103, 38, textureX, textureY); // aircompressor piston
		bodyModel[89] = new ModelRendererTurbo(this, 91, 38, textureX, textureY); // aircompressor inletvalve
		bodyModel[90] = new ModelRendererTurbo(this, 51, 43, textureX, textureY); // radiator pipes
		bodyModel[91] = new ModelRendererTurbo(this, 85, 23, textureX, textureY); // Box 292
		bodyModel[92] = new ModelRendererTurbo(this, 80, 23, textureX, textureY); // Box 293
		bodyModel[93] = new ModelRendererTurbo(this, 9, 96, textureX, textureY); // Box 252
		bodyModel[94] = new ModelRendererTurbo(this, 89, 102, textureX, textureY); // Box 260
		bodyModel[95] = new ModelRendererTurbo(this, 99, 57, textureX, textureY); // Box 206
		bodyModel[96] = new ModelRendererTurbo(this, 99, 68, textureX, textureY); // Box 269
		bodyModel[97] = new ModelRendererTurbo(this, 99, 68, textureX, textureY); // Box 270
		bodyModel[98] = new ModelRendererTurbo(this, 100, 66, textureX, textureY); // Box 271
		bodyModel[99] = new ModelRendererTurbo(this, 87, 69, textureX, textureY); // Box 272
		bodyModel[100] = new ModelRendererTurbo(this, 79, -10, textureX, textureY); // Box 259
		bodyModel[101] = new ModelRendererTurbo(this, 100, -6, textureX, textureY); // Box 260
		bodyModel[102] = new ModelRendererTurbo(this, 45, 14, textureX, textureY); // Box 261
		bodyModel[103] = new ModelRendererTurbo(this, 45, 14, textureX, textureY); // Box 262
		bodyModel[104] = new ModelRendererTurbo(this, 35, 135, textureX, textureY); // Box 305
		bodyModel[105] = new ModelRendererTurbo(this, 35, 135, textureX, textureY); // Box 306
		bodyModel[106] = new ModelRendererTurbo(this, 92, 29, textureX, textureY); // Box 339
		bodyModel[107] = new ModelRendererTurbo(this, 92, 29, textureX, textureY); // Box 372
		bodyModel[108] = new ModelRendererTurbo(this, 113, 22, textureX, textureY); // Box 382
		bodyModel[109] = new ModelRendererTurbo(this, 107, 7, textureX, textureY); // Box 160
		bodyModel[110] = new ModelRendererTurbo(this, 107, 12, textureX, textureY); // Box 340
		bodyModel[111] = new ModelRendererTurbo(this, 116, 7, textureX, textureY); // Box 327
		bodyModel[112] = new ModelRendererTurbo(this, 40, 195, textureX, textureY); // Box 22
		bodyModel[113] = new ModelRendererTurbo(this, 40, 195, textureX, textureY); // Box 23
		bodyModel[114] = new ModelRendererTurbo(this, 40, 195, textureX, textureY); // Box 25
		bodyModel[115] = new ModelRendererTurbo(this, 57, 195, textureX, textureY); // Box 26
		bodyModel[116] = new ModelRendererTurbo(this, 40, 195, textureX, textureY); // Box 29
		bodyModel[117] = new ModelRendererTurbo(this, 109, 75, textureX, textureY); // Box 39
		bodyModel[118] = new ModelRendererTurbo(this, 94, 75, textureX, textureY); // Box 40
		bodyModel[119] = new ModelRendererTurbo(this, 94, 75, textureX, textureY); // Box 58
		bodyModel[120] = new ModelRendererTurbo(this, 109, 75, textureX, textureY); // Box 59
		bodyModel[121] = new ModelRendererTurbo(this, 109, 75, textureX, textureY); // Box 61
		bodyModel[122] = new ModelRendererTurbo(this, 94, 75, textureX, textureY); // Box 62
		bodyModel[123] = new ModelRendererTurbo(this, 0, 199, textureX, textureY); // Box 37
		bodyModel[124] = new ModelRendererTurbo(this, 35, 138, textureX, textureY); // Box 40
		bodyModel[125] = new ModelRendererTurbo(this, 57, 195, textureX, textureY); // Box 42
		bodyModel[126] = new ModelRendererTurbo(this, 77, 195, textureX, textureY); // Box 43
		bodyModel[127] = new ModelRendererTurbo(this, 77, 195, textureX, textureY); // Box 44
		bodyModel[128] = new ModelRendererTurbo(this, 77, 195, textureX, textureY); // Box 45
		bodyModel[129] = new ModelRendererTurbo(this, 77, 195, textureX, textureY); // Box 46
		bodyModel[130] = new ModelRendererTurbo(this, 77, 195, textureX, textureY); // Box 47
		bodyModel[131] = new ModelRendererTurbo(this, 77, 195, textureX, textureY); // Box 48
		bodyModel[132] = new ModelRendererTurbo(this, 40, 195, textureX, textureY); // Box 49
		bodyModel[133] = new ModelRendererTurbo(this, 25, 195, textureX, textureY); // Box 50
		bodyModel[134] = new ModelRendererTurbo(this, 25, 195, textureX, textureY); // Box 51
		bodyModel[135] = new ModelRendererTurbo(this, 25, 195, textureX, textureY); // Box 52
		bodyModel[136] = new ModelRendererTurbo(this, 25, 195, textureX, textureY); // Box 53
		bodyModel[137] = new ModelRendererTurbo(this, 82, 72, textureX, textureY); // Box 55
		bodyModel[138] = new ModelRendererTurbo(this, 62, 67, textureX, textureY); // Box 57
		bodyModel[139] = new ModelRendererTurbo(this, 94, 83, textureX, textureY); // Box 70
		bodyModel[140] = new ModelRendererTurbo(this, 94, 83, textureX, textureY); // Box 66
		bodyModel[141] = new ModelRendererTurbo(this, 94, 83, textureX, textureY); // Box 67
		bodyModel[142] = new ModelRendererTurbo(this, 47, 195, textureX, textureY); // Box 68
		bodyModel[143] = new ModelRendererTurbo(this, 66, 195, textureX, textureY); // Box 70
		bodyModel[144] = new ModelRendererTurbo(this, 66, 195, textureX, textureY); // Box 71
		bodyModel[145] = new ModelRendererTurbo(this, 0, 195, textureX, textureY); // Box 72
		bodyModel[146] = new ModelRendererTurbo(this, 0, 199, textureX, textureY); // Box 73
		bodyModel[147] = new ModelRendererTurbo(this, 0, 195, textureX, textureY); // Box 74
		bodyModel[148] = new ModelRendererTurbo(this, 47, 195, textureX, textureY); // Box 76
		bodyModel[149] = new ModelRendererTurbo(this, 40, 195, textureX, textureY); // Box 77
		bodyModel[150] = new ModelRendererTurbo(this, 40, 195, textureX, textureY); // Box 78
		bodyModel[151] = new ModelRendererTurbo(this, 73, 72, textureX, textureY); // Box 81
		bodyModel[152] = new ModelRendererTurbo(this, 30, 211, textureX, textureY); // Box 313
		bodyModel[153] = new ModelRendererTurbo(this, 41, 202, textureX, textureY); // Box 316
		bodyModel[154] = new ModelRendererTurbo(this, 41, 202, textureX, textureY); // Box 326
		bodyModel[155] = new ModelRendererTurbo(this, 58, 202, textureX, textureY); // Box 327
		bodyModel[156] = new ModelRendererTurbo(this, 0, 205, textureX, textureY); // Box 318
		bodyModel[157] = new ModelRendererTurbo(this, 0, 202, textureX, textureY); // Box 319
		bodyModel[158] = new ModelRendererTurbo(this, 48, 202, textureX, textureY); // Box 320
		bodyModel[159] = new ModelRendererTurbo(this, 48, 202, textureX, textureY); // Box 323
		bodyModel[160] = new ModelRendererTurbo(this, 48, 202, textureX, textureY); // Box 324
		bodyModel[161] = new ModelRendererTurbo(this, 43, 205, textureX, textureY); // Box 169
		bodyModel[162] = new ModelRendererTurbo(this, 23, 211, textureX, textureY); // Box 170
		bodyModel[163] = new ModelRendererTurbo(this, 41, 202, textureX, textureY); // Box 172
		bodyModel[164] = new ModelRendererTurbo(this, 58, 202, textureX, textureY); // Box 173
		bodyModel[165] = new ModelRendererTurbo(this, 0, 205, textureX, textureY); // Box 174
		bodyModel[166] = new ModelRendererTurbo(this, 0, 202, textureX, textureY); // Box 175
		bodyModel[167] = new ModelRendererTurbo(this, 48, 202, textureX, textureY); // Box 176
		bodyModel[168] = new ModelRendererTurbo(this, 48, 202, textureX, textureY); // Box 178
		bodyModel[169] = new ModelRendererTurbo(this, 43, 205, textureX, textureY); // Box 179
		bodyModel[170] = new ModelRendererTurbo(this, 0, 211, textureX, textureY); // Box 371
		bodyModel[171] = new ModelRendererTurbo(this, 55, 209, textureX, textureY); // Box 440
		bodyModel[172] = new ModelRendererTurbo(this, 55, 209, textureX, textureY); // Box 441
		bodyModel[173] = new ModelRendererTurbo(this, 45, 208, textureX, textureY); // Box 21
		bodyModel[174] = new ModelRendererTurbo(this, 50, 209, textureX, textureY); // Box 23
		bodyModel[175] = new ModelRendererTurbo(this, 0, 208, textureX, textureY); // Box 24
		bodyModel[176] = new ModelRendererTurbo(this, 53, 202, textureX, textureY); // Box 30
		bodyModel[177] = new ModelRendererTurbo(this, 31, 208, textureX, textureY); // Box 199
		bodyModel[178] = new ModelRendererTurbo(this, 0, 211, textureX, textureY); // Box 203
		bodyModel[179] = new ModelRendererTurbo(this, 55, 209, textureX, textureY); // Box 204
		bodyModel[180] = new ModelRendererTurbo(this, 55, 209, textureX, textureY); // Box 205
		bodyModel[181] = new ModelRendererTurbo(this, 45, 208, textureX, textureY); // Box 206
		bodyModel[182] = new ModelRendererTurbo(this, 50, 209, textureX, textureY); // Box 207
		bodyModel[183] = new ModelRendererTurbo(this, 0, 208, textureX, textureY); // Box 208
		bodyModel[184] = new ModelRendererTurbo(this, 53, 202, textureX, textureY); // Box 212
		bodyModel[185] = new ModelRendererTurbo(this, 31, 208, textureX, textureY); // Box 215
		bodyModel[186] = new ModelRendererTurbo(this, 40, 195, textureX, textureY); // Box 216
		bodyModel[187] = new ModelRendererTurbo(this, 30, 211, textureX, textureY); // Box 246
		bodyModel[188] = new ModelRendererTurbo(this, 41, 202, textureX, textureY); // Box 247
		bodyModel[189] = new ModelRendererTurbo(this, 41, 186, textureX, textureY,"cull"); // Ladder CULL
		bodyModel[190] = new ModelRendererTurbo(this, 41, 186, textureX, textureY,"cull"); // Ladder CULL
		bodyModel[191] = new ModelRendererTurbo(this, 50, 186, textureX, textureY,"cull"); // Ladder CULL
		bodyModel[192] = new ModelRendererTurbo(this, 50, 186, textureX, textureY,"cull"); // Ladder CULL
		bodyModel[193] = new ModelRendererTurbo(this, 19, 137, textureX, textureY); // Box 304
		bodyModel[194] = new ModelRendererTurbo(this, 9, 147, textureX, textureY); // Box 305
		bodyModel[195] = new ModelRendererTurbo(this, 19, 137, textureX, textureY); // Box 306
		bodyModel[196] = new ModelRendererTurbo(this, 9, 147, textureX, textureY); // Box 307
		bodyModel[197] = new ModelRendererTurbo(this, 19, 137, textureX, textureY); // Box 308
		bodyModel[198] = new ModelRendererTurbo(this, 9, 147, textureX, textureY); // Box 309
		bodyModel[199] = new ModelRendererTurbo(this, 9, 147, textureX, textureY); // Box 310
		bodyModel[200] = new ModelRendererTurbo(this, 19, 137, textureX, textureY); // Box 311
		bodyModel[201] = new ModelRendererTurbo(this, 73, 70, textureX, textureY); // Box 347 backhead testure plane
		bodyModel[202] = new ModelRendererTurbo(this, 23, 211, textureX, textureY); // Box 315
		bodyModel[203] = new ModelRendererTurbo(this, 48, 202, textureX, textureY); // Box 177
		bodyModel[204] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 75
		bodyModel[205] = new ModelRendererTurbo(this, 92, 204, textureX, textureY); // Box 28
		bodyModel[206] = new ModelRendererTurbo(this, 92, 204, textureX, textureY); // Box 177
		bodyModel[207] = new ModelRendererTurbo(this, 73, 210, textureX, textureY); // Box 179
		bodyModel[208] = new ModelRendererTurbo(this, 73, 210, textureX, textureY); // Box 179
		bodyModel[209] = new ModelRendererTurbo(this, 73, 210, textureX, textureY); // Box 335
		bodyModel[210] = new ModelRendererTurbo(this, 73, 210, textureX, textureY); // Box 336
		bodyModel[211] = new ModelRendererTurbo(this, 129, 206, textureX, textureY); // Box 10
		bodyModel[212] = new ModelRendererTurbo(this, 129, 202, textureX, textureY); // Box 11
		bodyModel[213] = new ModelRendererTurbo(this, 129, 206, textureX, textureY); // Box 12
		bodyModel[214] = new ModelRendererTurbo(this, 129, 202, textureX, textureY); // Box 13
		bodyModel[215] = new ModelRendererTurbo(this, 133, 189, textureX, textureY); // Box 15
		bodyModel[216] = new ModelRendererTurbo(this, 112, 196, textureX, textureY); // Box 16
		bodyModel[217] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 24
		bodyModel[218] = new ModelRendererTurbo(this, 63, 202, textureX, textureY); // Box 87
		bodyModel[219] = new ModelRendererTurbo(this, 63, 202, textureX, textureY); // Box 88
		bodyModel[220] = new ModelRendererTurbo(this, 63, 202, textureX, textureY); // Box 89
		bodyModel[221] = new ModelRendererTurbo(this, 63, 202, textureX, textureY); // Box 90
		bodyModel[222] = new ModelRendererTurbo(this, 60, 205, textureX, textureY); // Box 109
		bodyModel[223] = new ModelRendererTurbo(this, 60, 205, textureX, textureY); // Box 59
		bodyModel[224] = new ModelRendererTurbo(this, 63, 202, textureX, textureY); // Box 62
		bodyModel[225] = new ModelRendererTurbo(this, 63, 202, textureX, textureY); // Box 63
		bodyModel[226] = new ModelRendererTurbo(this, 63, 202, textureX, textureY); // Box 64
		bodyModel[227] = new ModelRendererTurbo(this, 63, 202, textureX, textureY); // Box 65
		bodyModel[228] = new ModelRendererTurbo(this, 112, 203, textureX, textureY); // Box 82
		bodyModel[229] = new ModelRendererTurbo(this, 87, 202, textureX, textureY,"cull"); // Gear Hanger CULL
		bodyModel[230] = new ModelRendererTurbo(this, 88, 198, textureX, textureY,"cull"); // Gear Frame CULL
		bodyModel[231] = new ModelRendererTurbo(this, 95, 196, textureX, textureY); // Box 198
		bodyModel[232] = new ModelRendererTurbo(this, 50, 220, textureX, textureY); // Box 200
		bodyModel[233] = new ModelRendererTurbo(this, 0, 216, textureX, textureY); // Box 201
		bodyModel[234] = new ModelRendererTurbo(this, 16, 236, textureX, textureY); // Box 202
		bodyModel[235] = new ModelRendererTurbo(this, 87, 202, textureX, textureY); // Box 209
		bodyModel[236] = new ModelRendererTurbo(this, 95, 197, textureX, textureY); // Box 210
		bodyModel[237] = new ModelRendererTurbo(this, 102, 199, textureX, textureY); // Box 211
		bodyModel[238] = new ModelRendererTurbo(this, 88, 198, textureX, textureY); // Box 213
		bodyModel[239] = new ModelRendererTurbo(this, 95, 196, textureX, textureY); // Box 214
		bodyModel[240] = new ModelRendererTurbo(this, 102, 199, textureX, textureY); // Box 209
		bodyModel[241] = new ModelRendererTurbo(this, 93, 215, textureX, textureY); // Box 51
		bodyModel[242] = new ModelRendererTurbo(this, 87, 213, textureX, textureY); // Box 53
		bodyModel[243] = new ModelRendererTurbo(this, 87, 213, textureX, textureY); // Box 55
		bodyModel[244] = new ModelRendererTurbo(this, 31, 219, textureX, textureY); // Box 240
		bodyModel[245] = new ModelRendererTurbo(this, 111, 199, textureX, textureY); // Box 248
		bodyModel[246] = new ModelRendererTurbo(this, 121, 196, textureX, textureY); // Box 102
		bodyModel[247] = new ModelRendererTurbo(this, 121, 196, textureX, textureY); // Box 265
		bodyModel[248] = new ModelRendererTurbo(this, 25, 216, textureX, textureY); // Box 159
		bodyModel[249] = new ModelRendererTurbo(this, 46, 213, textureX, textureY); // Box 160
		bodyModel[250] = new ModelRendererTurbo(this, 25, 216, textureX, textureY); // Box 161
		bodyModel[251] = new ModelRendererTurbo(this, 40, 231, textureX, textureY); // Box 151
		bodyModel[252] = new ModelRendererTurbo(this, 31, 231, textureX, textureY); // Box 151
		bodyModel[253] = new ModelRendererTurbo(this, 7, 236, textureX, textureY); // Box 151
		bodyModel[254] = new ModelRendererTurbo(this, 0, 236, textureX, textureY); // Box 151
		bodyModel[255] = new ModelRendererTurbo(this, 0, 236, textureX, textureY); // Box 151
		bodyModel[256] = new ModelRendererTurbo(this, 55, 220, textureX, textureY); // Box 151
		bodyModel[257] = new ModelRendererTurbo(this, 72, 229, textureX, textureY); // Box 151
		bodyModel[258] = new ModelRendererTurbo(this, 72, 229, textureX, textureY); // Box 151
		bodyModel[259] = new ModelRendererTurbo(this, 72, 229, textureX, textureY); // Box 151
		bodyModel[260] = new ModelRendererTurbo(this, 72, 220, textureX, textureY); // Box 151
		bodyModel[261] = new ModelRendererTurbo(this, 55, 229, textureX, textureY); // Box 278
		bodyModel[262] = new ModelRendererTurbo(this, 49, 232, textureX, textureY); // Box 279
		bodyModel[263] = new ModelRendererTurbo(this, 31, 231, textureX, textureY); // Box 280
		bodyModel[264] = new ModelRendererTurbo(this, 0, 214, textureX, textureY); // Box 176
		bodyModel[265] = new ModelRendererTurbo(this, 64, 212, textureX, textureY); // Box 411
		bodyModel[266] = new ModelRendererTurbo(this, 73, 214, textureX, textureY); // Box 413
		bodyModel[267] = new ModelRendererTurbo(this, 78, 214, textureX, textureY); // Box 415
		bodyModel[268] = new ModelRendererTurbo(this, 83, 214, textureX, textureY); // Box 418
		bodyModel[269] = new ModelRendererTurbo(this, 0, 214, textureX, textureY); // Box 284
		bodyModel[270] = new ModelRendererTurbo(this, 64, 212, textureX, textureY); // Box 285
		bodyModel[271] = new ModelRendererTurbo(this, 73, 214, textureX, textureY); // Box 286
		bodyModel[272] = new ModelRendererTurbo(this, 78, 214, textureX, textureY); // Box 287
		bodyModel[273] = new ModelRendererTurbo(this, 83, 214, textureX, textureY); // Box 288
		bodyModel[274] = new ModelRendererTurbo(this, 113, 175, textureX, textureY); // Box 294
		bodyModel[275] = new ModelRendererTurbo(this, 113, 186, textureX, textureY,"numberboard").setLightFixtureId("numberboard_body_275"); // Box 295 numberboard
		bodyModel[276] = new ModelRendererTurbo(this, 113, 179, textureX, textureY); // Box 296
		bodyModel[277] = new ModelRendererTurbo(this, 126, 187, textureX, textureY,"lamp"); // Box 297 headlight rear
		bodyModel[278] = new ModelRendererTurbo(this, 87, 213, textureX, textureY); // Box 379
		bodyModel[279] = new ModelRendererTurbo(this, 103, 218, textureX, textureY); // Box 380
		bodyModel[280] = new ModelRendererTurbo(this, 87, 213, textureX, textureY); // Box 381
		bodyModel[281] = new ModelRendererTurbo(this, 1, 219, textureX, textureY); // Box 241
		bodyModel[282] = new ModelRendererTurbo(this, 0, 219, textureX, textureY); // Box 242
		bodyModel[283] = new ModelRendererTurbo(this, 0, 219, textureX, textureY); // Box 249
		bodyModel[284] = new ModelRendererTurbo(this, 6, 219, textureX, textureY); // Box 339
		bodyModel[285] = new ModelRendererTurbo(this, 60, 205, textureX, textureY); // Box 359
		bodyModel[286] = new ModelRendererTurbo(this, 60, 205, textureX, textureY); // Box 360
		bodyModel[287] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 239
		bodyModel[288] = new ModelRendererTurbo(this, 90, 173, textureX, textureY); // Box 250
		bodyModel[289] = new ModelRendererTurbo(this, 142, 181, textureX, textureY); // Box 318
		bodyModel[290] = new ModelRendererTurbo(this, 142, 181, textureX, textureY); // Box 320
		bodyModel[291] = new ModelRendererTurbo(this, 126, 174, textureX, textureY); // Box 321
		bodyModel[292] = new ModelRendererTurbo(this, 135, 181, textureX, textureY,"lamp"); // Box 322 headlight rear
		bodyModel[293] = new ModelRendererTurbo(this, 126, 181, textureX, textureY); // Box 323
		bodyModel[294] = new ModelRendererTurbo(this, 194, 117, textureX, textureY); // Box 118
		bodyModel[295] = new ModelRendererTurbo(this, 119, 127, textureX, textureY); // Box 221
		bodyModel[296] = new ModelRendererTurbo(this, 169, 115, textureX, textureY); // Box 222 coal load
		bodyModel[297] = new ModelRendererTurbo(this, 142, 119, textureX, textureY); // Box 257
		bodyModel[298] = new ModelRendererTurbo(this, 128, 131, textureX, textureY); // Box 258
		bodyModel[299] = new ModelRendererTurbo(this, 128, 141, textureX, textureY); // Box 343
		bodyModel[300] = new ModelRendererTurbo(this, 128, 138, textureX, textureY); // Box 344
		bodyModel[301] = new ModelRendererTurbo(this, 128, 135, textureX, textureY); // Box 345
		bodyModel[302] = new ModelRendererTurbo(this, 128, 141, textureX, textureY); // Box 346
		bodyModel[303] = new ModelRendererTurbo(this, 63, 140, textureX, textureY); // Box 254
		bodyModel[304] = new ModelRendererTurbo(this, 74, 141, textureX, textureY); // Box 255
		bodyModel[305] = new ModelRendererTurbo(this, 79, 148, textureX, textureY); // Box 256
		bodyModel[306] = new ModelRendererTurbo(this, 72, 148, textureX, textureY,"lamp"); // Box 257 headlight REAR
		bodyModel[307] = new ModelRendererTurbo(this, 63, 140, textureX, textureY); // Box 258
		bodyModel[308] = new ModelRendererTurbo(this, 63, 143, textureX, textureY); // Box 259
		bodyModel[309] = new ModelRendererTurbo(this, 103, 148, textureX, textureY,"numberboard").setLightFixtureId("numberboard_body_309"); // Box 312 numberboard
		bodyModel[310] = new ModelRendererTurbo(this, 110, 137, textureX, textureY); // Box 313
		bodyModel[311] = new ModelRendererTurbo(this, 103, 141, textureX, textureY); // Box 314
		bodyModel[312] = new ModelRendererTurbo(this, 103, 136, textureX, textureY,"lamp"); // Box 315 headlight REAR
		bodyModel[313] = new ModelRendererTurbo(this, 129, 92, textureX, textureY); // Box 289
		bodyModel[314] = new ModelRendererTurbo(this, 129, 92, textureX, textureY); // Box 290
		bodyModel[315] = new ModelRendererTurbo(this, 187, 76, textureX, textureY); // Box 291
		bodyModel[316] = new ModelRendererTurbo(this, 129, 92, textureX, textureY); // Box 292
		bodyModel[317] = new ModelRendererTurbo(this, 160, 72, textureX, textureY); // Box 293 coal load
		bodyModel[318] = new ModelRendererTurbo(this, 129, 67, textureX, textureY); // Box 316
		bodyModel[319] = new ModelRendererTurbo(this, 140, 98, textureX, textureY); // Box 317
		bodyModel[320] = new ModelRendererTurbo(this, 140, 92, textureX, textureY); // Box 341
		bodyModel[321] = new ModelRendererTurbo(this, 140, 95, textureX, textureY); // Box 342
		bodyModel[322] = new ModelRendererTurbo(this, 126, 51, textureX, textureY,"cull"); // Radiator pipes CULL
		bodyModel[323] = new ModelRendererTurbo(this, 179, 51, textureX, textureY,"cull"); // Box 323 radiator pipes CULL
		bodyModel[324] = new ModelRendererTurbo(this, 170, 176, textureX, textureY); // Box 294
		bodyModel[325] = new ModelRendererTurbo(this, 157, 173, textureX, textureY); // Box 297
		bodyModel[326] = new ModelRendererTurbo(this, 170, 176, textureX, textureY); // Box 330
		bodyModel[327] = new ModelRendererTurbo(this, 157, 173, textureX, textureY); // Box 331
		bodyModel[328] = new ModelRendererTurbo(this, 170, 176, textureX, textureY); // Box 332
		bodyModel[329] = new ModelRendererTurbo(this, 157, 173, textureX, textureY); // Box 333
		bodyModel[330] = new ModelRendererTurbo(this, 170, 176, textureX, textureY); // Box 334
		bodyModel[331] = new ModelRendererTurbo(this, 157, 173, textureX, textureY); // Box 335

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[0].setRotationPoint(-24.5F, 3F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 36, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // boiler
		bodyModel[1].setRotationPoint(-22.5F, -7F, -5F);

		bodyModel[2].addBox(0F, 0F, 0F, 36, 10, 4, 0F); // boiler
		bodyModel[2].setRotationPoint(-22.5F, -10F, -2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 36, 4, 3, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // boiler
		bodyModel[3].setRotationPoint(-22.5F, -7F, 2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 79
		bodyModel[4].setRotationPoint(24F, 3F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 202
		bodyModel[5].setRotationPoint(-10.5F, -17F, -1F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[6].setRotationPoint(-10.5F, -16F, -1.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 206
		bodyModel[7].setRotationPoint(-11.5F, -16F, -0.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 207
		bodyModel[8].setRotationPoint(-11.5F, -17F, -0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 321
		bodyModel[9].setRotationPoint(-9.5F, -17F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 322
		bodyModel[10].setRotationPoint(-9.5F, -16F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 88
		bodyModel[11].setRotationPoint(-18F, -18F, -1.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 18, 5, 4, 0F); // tank
		bodyModel[12].setRotationPoint(-12.5F, -7F, 4.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 18, 4, 7, 0F,0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // tank
		bodyModel[13].setRotationPoint(-12.5F, -11F, 1F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 18, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // tank
		bodyModel[14].setRotationPoint(-12.5F, -13.5F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 18, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -6F, 0F, -0.2F, -6F, 0F, -5F, 0F, 0F, -5F, 0F); // tank
		bodyModel[15].setRotationPoint(-12.5F, -11.5F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 18, 5, 4, 0F); // tank
		bodyModel[16].setRotationPoint(-12.5F, -7F, -8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 18, 4, 7, 0F,0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // tank
		bodyModel[17].setRotationPoint(-12.5F, -11F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 18, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // tank
		bodyModel[18].setRotationPoint(-12.5F, -13.5F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 16, 22, 0F); // Box 105
		bodyModel[19].setRotationPoint(6.5F, -16F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 8, 14, 1, 0F); // Box 106
		bodyModel[20].setRotationPoint(7.5F, -14F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[21].setRotationPoint(5.5F, -16F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 16, 1, 5, 0F,0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[22].setRotationPoint(5.5F, -17F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 16, 1, 6, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[23].setRotationPoint(5.5F, -17F, -3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 172
		bodyModel[24].setRotationPoint(5.5F, -16F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 1, 5, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 173
		bodyModel[25].setRotationPoint(5.5F, -17F, 3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[26].setRotationPoint(5.5F, -14.99F, 10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[27].setRotationPoint(5.5F, -15F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 8, 14, 1, 0F); // Box 114
		bodyModel[28].setRotationPoint(7.5F, -14F, 10F);

		bodyModel[29].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 115
		bodyModel[29].setRotationPoint(15.5F, -14F, 10F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 117
		bodyModel[30].setRotationPoint(19.5F, -16F, -10F);

		bodyModel[31].addBox(0F, 0F, 0F, 21, 1, 6, 0F); // Box 119
		bodyModel[31].setRotationPoint(-14.5F, -2F, -10.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 21, 1, 6, 0F); // Box 120
		bodyModel[32].setRotationPoint(-14.5F, -2F, 4.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[33].setRotationPoint(-0.5F, -14F, -1.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 195
		bodyModel[34].setRotationPoint(-1.5F, -14F, -0.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 202
		bodyModel[35].setRotationPoint(-6.5F, -17.75F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[36].setRotationPoint(-6.5F, -16.75F, -2.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 206
		bodyModel[37].setRotationPoint(-7.5F, -16.75F, -1.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 207
		bodyModel[38].setRotationPoint(-7.5F, -17.75F, -1.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 324
		bodyModel[39].setRotationPoint(-3.5F, -16.75F, -1.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 325
		bodyModel[40].setRotationPoint(-3.5F, -17.75F, -1.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 326
		bodyModel[41].setRotationPoint(0.5F, -14F, -0.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 2F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -0.5F, 2F); // Box 142
		bodyModel[42].setRotationPoint(-3.5F, -13.75F, -1.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 143
		bodyModel[43].setRotationPoint(-6.5F, -13.75F, -3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 1F, -1F, 0F); // Box 144
		bodyModel[44].setRotationPoint(-7.5F, -13.75F, -1.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1.5F); // Box 148
		bodyModel[45].setRotationPoint(-9.5F, -13.75F, -0.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 149
		bodyModel[46].setRotationPoint(-10.5F, -13.75F, -1.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0.5F, 0F, 0F); // Box 150
		bodyModel[47].setRotationPoint(-11.5F, -13.75F, -0.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1.5F); // Box 151
		bodyModel[48].setRotationPoint(4F, -13.75F, -0.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 152
		bodyModel[49].setRotationPoint(4F, -16F, -0.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 153
		bodyModel[50].setRotationPoint(2F, -17F, -0.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 154
		bodyModel[51].setRotationPoint(4F, -17F, -0.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 155
		bodyModel[52].setRotationPoint(3F, -17F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[53].setRotationPoint(3F, -16F, -1.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 157
		bodyModel[54].setRotationPoint(2F, -16F, -0.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0.5F, 0F, 0F); // Box 158
		bodyModel[55].setRotationPoint(2F, -13.75F, -0.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 159
		bodyModel[56].setRotationPoint(3F, -13.75F, -1.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[57].setRotationPoint(-14F, -11F, -2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 206
		bodyModel[58].setRotationPoint(-14F, -11F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[59].setRotationPoint(-14.5F, -14F, -1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[60].setRotationPoint(-14F, -14F, -2.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[61].setRotationPoint(-14F, -14F, 1.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[62].setRotationPoint(-14F, -13.5F, 0.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 206
		bodyModel[63].setRotationPoint(-14F, -13.5F, -1.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[64].setRotationPoint(-14F, -12.5F, -0.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[65].setRotationPoint(-14F, -14.5F, -3.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 9, 1, 22, 0F); // Box 170
		bodyModel[66].setRotationPoint(6.5F, 0F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 162
		bodyModel[67].setRotationPoint(-23F, -8F, -1F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 163
		bodyModel[68].setRotationPoint(-23.5F, -6.5F, -1.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 164
		bodyModel[69].setRotationPoint(-23.25F, -7F, -3.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 165
		bodyModel[70].setRotationPoint(-23.25F, -4F, -3.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 212
		bodyModel[71].setRotationPoint(-25.5F, -9.5F, -1F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 213
		bodyModel[72].setRotationPoint(-25.75F, -12.5F, -1.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // bulb2
		bodyModel[73].setRotationPoint(-25.76F, -12F, -1F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.15F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, 0F, 0F, 0.15F); // numberboard
		bodyModel[74].setRotationPoint(-25.5F, -12F, -1.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 184
		bodyModel[75].setRotationPoint(-23.25F, -10.75F, -1F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 96
		bodyModel[76].setRotationPoint(-23.75F, -15F, 0F);
		bodyModel[76].rotateAngleX = -0.78539816F;

		bodyModel[77].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // bulb
		bodyModel[77].setRotationPoint(-23.76F, -14.25F, 0F);
		bodyModel[77].rotateAngleX = -0.78539816F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[78].setRotationPoint(-23.5F, -11.75F, -1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[79].setRotationPoint(-23.5F, -11.75F, 0F);

		bodyModel[80].addBox(0F, 0F, 0F, 0, 6, 16, 0F); // Switching Pilot CULL
		bodyModel[80].setRotationPoint(-24.51F, 3F, -8F);

		bodyModel[81].addBox(0F, 1.5F, 0F, 9, 2, 0, 0F); // Box 350
		bodyModel[81].setRotationPoint(-22F, -10.5F, 5.5F);
		bodyModel[81].rotateAngleX = -0.78539816F;

		bodyModel[82].addBox(0F, 1.5F, 0F, 9, 2, 0, 0F); // Box 224
		bodyModel[82].setRotationPoint(-22F, -10.5F, -5.5F);
		bodyModel[82].rotateAngleX = 0.78539816F;

		bodyModel[83].addBox(0F, 1.5F, 0F, 17, 2, 0, 0F); // Box 225
		bodyModel[83].setRotationPoint(-12F, -13.5F, -8F);
		bodyModel[83].rotateAngleX = 0.78539816F;

		bodyModel[84].addBox(0F, 1.5F, 0F, 17, 2, 0, 0F); // Box 226
		bodyModel[84].setRotationPoint(-12F, -13.5F, 8F);
		bodyModel[84].rotateAngleX = -0.78539816F;

		bodyModel[85].addShapeBox(0F, -0.25F, 0F, 10, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 177
		bodyModel[85].setRotationPoint(-14F, -1.5F, -7F);
		bodyModel[85].rotateAngleX = -0.78539816F;

		bodyModel[86].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // aircompressor airside
		bodyModel[86].setRotationPoint(-18F, -4F, -8F);

		bodyModel[87].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // aircompressor steamside
		bodyModel[87].setRotationPoint(-18F, -8F, -8F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // aircompressor piston
		bodyModel[88].setRotationPoint(-17F, -5F, -7F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // aircompressor inletvalve
		bodyModel[89].setRotationPoint(-17F, -8.5F, -7F);

		bodyModel[90].addShapeBox(0F, -0.25F, 0F, 10, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // radiator pipes CULL
		bodyModel[90].setRotationPoint(-14F, -1.5F, 7F);
		bodyModel[90].rotateAngleX = -0.78539816F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[91].setRotationPoint(-20.75F, -11.5F, -1.5F);
		bodyModel[91].rotateAngleZ = 0.78539816F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[92].setRotationPoint(-19F, -18.25F, -1.25F);

		bodyModel[93].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 252
		bodyModel[93].setRotationPoint(15.5F, -14F, -11F);

		bodyModel[94].addShapeBox(0F, -1F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[94].setRotationPoint(7.5F, -17F, -2.5F);
		bodyModel[94].rotateAngleZ = 0.17453293F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[95].setRotationPoint(-6.5F, -17F, 2.5F);
		bodyModel[95].rotateAngleZ = 0.78539816F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 269
		bodyModel[96].setRotationPoint(-23F, -1F, 2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[97].setRotationPoint(-23F, -1F, -4F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[98].setRotationPoint(-23F, -1F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[99].setRotationPoint(-19F, -5F, 5F);

		bodyModel[100].addBox(0F, 0F, 0F, 0, 10, 10, 0F); // Box 259
		bodyModel[100].setRotationPoint(-22.51F, -10F, -5F);

		bodyModel[101].addBox(0F, 0F, 0F, 0, 6, 6, 0F); // Box 260
		bodyModel[101].setRotationPoint(-23.01F, -8F, -3F);

		bodyModel[102].addBox(0F, 0F, 0F, 0, 11, 17, 0F); // Box 261
		bodyModel[102].setRotationPoint(-12.51F, -13F, -8.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 0, 11, 17, 0F); // Box 262
		bodyModel[103].setRotationPoint(5.51F, -13F, -8.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 12, 2, 0, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[104].setRotationPoint(7.5F, -14F, -12F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 12, 2, 0, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[105].setRotationPoint(7.5F, -14F, 12F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 0, 16, 0F); // Box 339
		bodyModel[106].setRotationPoint(-26.51F, 9F, -8F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 0, 16, 0F); // Box 372
		bodyModel[107].setRotationPoint(24.51F, 9F, -8F);

		bodyModel[108].addBox(0F, 0F, 0F, 0, 6, 16, 0F); // Box 382
		bodyModel[108].setRotationPoint(24.51F, 3F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[109].setRotationPoint(-23F, -6F, 1F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 340
		bodyModel[110].setRotationPoint(-23F, -6F, -3F);

		bodyModel[111].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 327
		bodyModel[111].setRotationPoint(-23.25F, -15.25F, -1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[112].setRotationPoint(-22F, 4.5F, 4.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 23
		bodyModel[113].setRotationPoint(-20F, 5.5F, 4.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 25
		bodyModel[114].setRotationPoint(-20F, 5.5F, -5.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[115].setRotationPoint(-14.5F, 3F, -5.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 29
		bodyModel[116].setRotationPoint(-13.5F, 7F, 4.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[117].setRotationPoint(-13F, 3F, 5.76F);

		bodyModel[118].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 40
		bodyModel[118].setRotationPoint(-13F, 3F, -5.76F);

		bodyModel[119].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 58
		bodyModel[119].setRotationPoint(-3.5F, 3F, -5.76F);

		bodyModel[120].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 59
		bodyModel[120].setRotationPoint(-3.5F, 3F, 5.76F);

		bodyModel[121].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 61
		bodyModel[121].setRotationPoint(5.5F, 3F, 5.76F);

		bodyModel[122].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 62
		bodyModel[122].setRotationPoint(5.5F, 3F, -5.76F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[123].setRotationPoint(-11.5F, 3F, 4.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 9, 7, 9, 0F,0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 40
		bodyModel[124].setRotationPoint(6.35F, -4F, -4.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[125].setRotationPoint(-14.5F, 3F, 4.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[126].setRotationPoint(-11.5F, 4.5F, -5.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[127].setRotationPoint(-11.5F, 4.5F, 4.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[128].setRotationPoint(-2F, 4.5F, 4.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[129].setRotationPoint(-2F, 4.5F, -5.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[130].setRotationPoint(7F, 4.5F, 4.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[131].setRotationPoint(7F, 4.5F, -5.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[132].setRotationPoint(-13.5F, 7F, -5.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[133].setRotationPoint(-7.5F, 7.5F, 4.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[134].setRotationPoint(-7.5F, 7.5F, -5.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 52
		bodyModel[135].setRotationPoint(2F, 7.5F, -5.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 53
		bodyModel[136].setRotationPoint(2F, 7.5F, 4.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 3F, 0F, -1F, 3F, 0F, -0.575F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0.425F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[137].setRotationPoint(13.5F, -7F, 2F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.425F, 0F, 0F, 0.425F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[138].setRotationPoint(13.5F, -10F, -2F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 70
		bodyModel[139].setRotationPoint(-1F, 5.5F, -6F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 66
		bodyModel[140].setRotationPoint(-10.5F, 5.5F, -6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 67
		bodyModel[141].setRotationPoint(8F, 5.5F, -6F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[142].setRotationPoint(11F, 7.5F, 4.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[143].setRotationPoint(15.5F, 5.5F, 4.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[144].setRotationPoint(15.5F, 5.5F, -5.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[145].setRotationPoint(15.5F, 3F, 4.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[146].setRotationPoint(-11.5F, 3F, -5.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[147].setRotationPoint(15.5F, 3F, -5.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[148].setRotationPoint(11F, 7.5F, -5.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[149].setRotationPoint(13.5F, 6.5F, -5.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[150].setRotationPoint(13.5F, 6.5F, 4.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -0.575F, 0F, 0F, -1F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.425F, 3F, 0F, 0F, 3F, 0F); // Box 81
		bodyModel[151].setRotationPoint(13.5F, -7F, -5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 313
		bodyModel[152].setRotationPoint(-13.5F, 4.5F, 7.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[153].setRotationPoint(-11.5F, 4.75F, 7.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 326
		bodyModel[154].setRotationPoint(-11.5F, 5.75F, 7.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[155].setRotationPoint(-11F, 5.75F, 7.75F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 318
		bodyModel[156].setRotationPoint(-9.5F, 5.75F, 7.75F);
		bodyModel[156].rotateAngleZ = -0.0837758F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 319
		bodyModel[157].setRotationPoint(-8.5F, 7.5F, 6.25F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F); // Box 320
		bodyModel[158].setRotationPoint(-8.5F, 7.5F, 6F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.5F, 0.125F, 0.125F, 0.5F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.5F, 0.125F, 0.125F, 0.5F); // Box 323
		bodyModel[159].setRotationPoint(10F, 7.5F, 6F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F); // Box 324
		bodyModel[160].setRotationPoint(1F, 7.5F, 6F);

		bodyModel[161].addShapeBox(19.6F, 0F, 0F, 2, 1, 1, 0F,0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F); // Box 169
		bodyModel[161].setRotationPoint(-10.5F, 5.75F, 7.5F);
		bodyModel[161].rotateAngleZ = -0.0837758F;

		bodyModel[162].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 170
		bodyModel[162].setRotationPoint(-13.5F, 5.75F, -8.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 172
		bodyModel[163].setRotationPoint(-11.5F, 5.75F, -8.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 173
		bodyModel[164].setRotationPoint(-11F, 5.75F, -8.75F);

		bodyModel[165].addShapeBox(0F, -1F, 0F, 20, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[165].setRotationPoint(-9.5F, 6.75F, -8.75F);
		bodyModel[165].rotateAngleZ = 0.06108652F;

		bodyModel[166].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[166].setRotationPoint(-8.5F, 4.5F, -7.25F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.25F); // Box 176
		bodyModel[167].setRotationPoint(-8.5F, 4.5F, -7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.25F); // Box 178
		bodyModel[168].setRotationPoint(1F, 4.5F, -7F);

		bodyModel[169].addShapeBox(18.6F, -1F, 0F, 2, 1, 1, 0F,0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F); // Box 179
		bodyModel[169].setRotationPoint(-9.5F, 6.75F, -8.5F);
		bodyModel[169].rotateAngleZ = 0.06108652F;

		bodyModel[170].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F); // Box 371
		bodyModel[170].setRotationPoint(-0.75F, 6.25F, 9F);
		bodyModel[170].rotateAngleZ = 0.03490659F;

		bodyModel[171].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[171].setRotationPoint(10.5F, 8F, 8F);
		bodyModel[171].rotateAngleZ = 0.78539816F;

		bodyModel[172].addShapeBox(-0.5F, -2.5F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[172].setRotationPoint(10.5F, 8F, 8F);
		bodyModel[172].rotateAngleZ = 0.78539816F;

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 21
		bodyModel[173].setRotationPoint(0.25F, 1F, 8.5F);
		bodyModel[173].rotateAngleZ = -0.30543262F;

		bodyModel[174].addShapeBox(-0.25F, -1F, 0F, 1, 2, 1, 0F,0.1F, 0.15F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, 0.1F, 0.15F, -0.5F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, -0.5F, -0.25F, 0.1F, -0.5F); // Box 23
		bodyModel[174].setRotationPoint(-0.75F, 6F, 8.5F);
		bodyModel[174].rotateAngleZ = -0.12217305F;

		bodyModel[175].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F); // Box 24
		bodyModel[175].setRotationPoint(-12.75F, 2F, 8F);
		bodyModel[175].rotateAngleZ = -0.13962634F;

		bodyModel[176].addShapeBox(-0.25F, 0.25F, 0F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Box 30
		bodyModel[176].setRotationPoint(-12.75F, 2F, 8.25F);
		bodyModel[176].rotateAngleZ = 0.20943951F;

		bodyModel[177].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 199
		bodyModel[177].setRotationPoint(-15F, 3.25F, 7.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 203
		bodyModel[178].setRotationPoint(0.75F, 6.25F, -10F);
		bodyModel[178].rotateAngleZ = -0.03490659F;

		bodyModel[179].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 204
		bodyModel[179].setRotationPoint(10.5F, 5F, -9F);
		bodyModel[179].rotateAngleZ = 3.14159265F;

		bodyModel[180].addShapeBox(-0.5F, -2.5F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 205
		bodyModel[180].setRotationPoint(10.5F, 5F, -9F);
		bodyModel[180].rotateAngleZ = 3.14159265F;

		bodyModel[181].addShapeBox(-0.5F, -2F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[181].setRotationPoint(0.25F, 3F, -9.5F);
		bodyModel[181].rotateAngleZ = 0.04363323F;

		bodyModel[182].addShapeBox(-0.75F, 2.05F, 0F, 1, 2, 1, 0F,0.1F, 0.15F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0.1F, 0.15F, 0F, -0.25F, 0.1F, -0.5F, -0.25F, 0.1F, -0.5F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F); // Box 207
		bodyModel[182].setRotationPoint(0.25F, 3F, -9.5F);
		bodyModel[182].rotateAngleZ = 0.2268928F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 208
		bodyModel[183].setRotationPoint(-11.75F, 2F, -9F);
		bodyModel[183].rotateAngleZ = -0.13962634F;

		bodyModel[184].addShapeBox(-0.25F, -4.75F, 0F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Box 212
		bodyModel[184].setRotationPoint(-11.75F, 7F, -9.25F);
		bodyModel[184].rotateAngleZ = 0.01745329F;

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 215
		bodyModel[185].setRotationPoint(-15.4F, 3.25F, -8.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 216
		bodyModel[186].setRotationPoint(-22F, 4.5F, -5.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 246
		bodyModel[187].setRotationPoint(-13.5F, 4.5F, -8.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[188].setRotationPoint(-11.5F, 4.75F, -8.5F);

		bodyModel[189].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Ladder CULL
		bodyModel[189].setRotationPoint(16.5F, 3F, -10.75F);

		bodyModel[190].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Ladder CULL
		bodyModel[190].setRotationPoint(16.5F, 6F, -10.75F);

		bodyModel[191].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Ladder CULL
		bodyModel[191].setRotationPoint(16.5F, 3F, 9.75F);

		bodyModel[192].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Ladder CULL
		bodyModel[192].setRotationPoint(16.5F, 6F, 9.75F);

		bodyModel[193].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 304
		bodyModel[193].setRotationPoint(16.01F, -7F, 11F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 305
		bodyModel[194].setRotationPoint(16.01F, 3F, 5F);

		bodyModel[195].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 306
		bodyModel[195].setRotationPoint(16.01F, -7F, -12F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[196].setRotationPoint(16.01F, 3F, -11F);

		bodyModel[197].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 308
		bodyModel[197].setRotationPoint(20F, -7F, -12F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[198].setRotationPoint(20F, 3F, -11F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 310
		bodyModel[199].setRotationPoint(20F, 3F, 5F);

		bodyModel[200].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 311
		bodyModel[200].setRotationPoint(20F, -7F, 11F);

		bodyModel[201].addBox(0F, 0F, 0F, 0, 10, 10, 0F); // Box 347 backhead testure plane
		bodyModel[201].setRotationPoint(13.51F, -10F, -5F);
		bodyModel[201].rotateAngleZ = 0.14137167F;

		bodyModel[202].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 315
		bodyModel[202].setRotationPoint(-13.5F, 5.75F, 7.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.125F, 0.5F, 0.125F, 0.125F, 0.5F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.5F, 0.125F, 0.125F, 0.5F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.25F); // Box 177
		bodyModel[203].setRotationPoint(10F, 4.5F, -7F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 75
		bodyModel[204].setRotationPoint(-18.5F, 2F, 5F);

		bodyModel[205].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 28
		bodyModel[205].setRotationPoint(-19.5F, 4.25F, -9F);

		bodyModel[206].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 177
		bodyModel[206].setRotationPoint(-19.5F, 4.25F, 7F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 179
		bodyModel[207].setRotationPoint(-19.5F, 4.25F, 9F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 179
		bodyModel[208].setRotationPoint(-19.5F, 4.25F, 6F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 335
		bodyModel[209].setRotationPoint(-19.5F, 4.25F, -10F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 336
		bodyModel[210].setRotationPoint(-19.5F, 4.25F, -7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 10
		bodyModel[211].setRotationPoint(-18.5F, 5.25F, 0F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[212].setRotationPoint(-18.5F, 4.25F, 3F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 12
		bodyModel[213].setRotationPoint(-18.5F, 5.25F, -6F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[214].setRotationPoint(-18.5F, 4.25F, -5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 15
		bodyModel[215].setRotationPoint(-18.5F, -1F, -3F);

		bodyModel[216].addShapeBox(-1F, 0F, -1F, 2, 4, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 16
		bodyModel[216].setRotationPoint(-20F, 0.01F, 0F);
		bodyModel[216].rotateAngleY = -0.78539816F;

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 24
		bodyModel[217].setRotationPoint(-18.5F, 2F, -10F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[218].setRotationPoint(0F, 2F, 4.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 88
		bodyModel[219].setRotationPoint(-3F, 2F, -5.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[220].setRotationPoint(0F, 2F, -5.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 90
		bodyModel[221].setRotationPoint(-3F, 2F, 4.5F);

		bodyModel[222].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 109
		bodyModel[222].setRotationPoint(-3F, 2F, 5.4F);

		bodyModel[223].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 59
		bodyModel[223].setRotationPoint(-12.5F, 2F, 5.4F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 62
		bodyModel[224].setRotationPoint(-12.5F, 2F, -5.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[225].setRotationPoint(-9.5F, 2F, -5.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[226].setRotationPoint(-9.5F, 2F, 4.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 65
		bodyModel[227].setRotationPoint(-12.5F, 2F, 4.5F);

		bodyModel[228].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[228].setRotationPoint(-20F, -0.49F, 0F);
		bodyModel[228].rotateAngleY = -0.78539816F;

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Gear Hanger CULL
		bodyModel[229].setRotationPoint(0.25F, 3F, 9F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Gear Frame CULL
		bodyModel[230].setRotationPoint(2.25F, 2F, 9F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 198
		bodyModel[231].setRotationPoint(3.75F, 2F, 7F);

		bodyModel[232].addShapeBox(0F, 0F, -0.25F, 1, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 200
		bodyModel[232].setRotationPoint(10.25F, -7.5F, 6.5F);
		bodyModel[232].rotateAngleZ = 0.10471976F;

		bodyModel[233].addShapeBox(0F, 0F, -0.25F, 11, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 201
		bodyModel[233].setRotationPoint(1F, 1.5F, 7F);

		bodyModel[234].addShapeBox(0F, 9F, -0.25F, 1, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 202
		bodyModel[234].setRotationPoint(10.25F, -7.5F, 4F);
		bodyModel[234].rotateAngleZ = 0.10471976F;

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 1F, -0.75F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[235].setRotationPoint(0.25F, 3F, -10F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 210
		bodyModel[236].setRotationPoint(3.75F, 2F, -7F);

		bodyModel[237].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 211
		bodyModel[237].setRotationPoint(1.15F, 1.6F, 7.5F);
		bodyModel[237].rotateAngleZ = -0.10471976F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[238].setRotationPoint(2.25F, 2F, -10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[239].setRotationPoint(3.75F, 2F, -9F);

		bodyModel[240].addShapeBox(-0.5F, 0F, 0.5F, 1, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 209
		bodyModel[240].setRotationPoint(1.15F, 1.6F, -8.5F);
		bodyModel[240].rotateAngleZ = 0.15707963F;

		bodyModel[241].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 51
		bodyModel[241].setRotationPoint(-27.5F, 3F, -1.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[242].setRotationPoint(-25.5F, 2F, -1.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 55
		bodyModel[243].setRotationPoint(-25.5F, 5F, -1.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,5.25F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 5.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[244].setRotationPoint(11.35F, 3F, -3.5F);

		bodyModel[245].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 15, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 248
		bodyModel[245].setRotationPoint(1.15F, 1.5F, -7.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[246].setRotationPoint(-24F, -3F, -4.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[247].setRotationPoint(-24F, -3F, 3.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 159
		bodyModel[248].setRotationPoint(-19.5F, -0.5F, 2.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 6, 1, 5, 0F); // Box 160
		bodyModel[249].setRotationPoint(-19.5F, -0.5F, -2.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[250].setRotationPoint(-19.5F, -0.5F, -3.5F);

		bodyModel[251].addBox(-1F, 0F, -1F, 2, 6, 2, 0F); // Box 151
		bodyModel[251].setRotationPoint(9.5F, -6F, 9F);
		bodyModel[251].rotateAngleY = -0.78539816F;

		bodyModel[252].addBox(-0.5F, 0F, -0.5F, 1, 1, 3, 0F); // Box 151
		bodyModel[252].setRotationPoint(9.5F, -7F, 9F);
		bodyModel[252].rotateAngleY = -1.25663706F;

		bodyModel[253].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 151
		bodyModel[253].setRotationPoint(10.5F, -2F, 6.25F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[254].setRotationPoint(13.5F, -2F, 6.25F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[255].setRotationPoint(8.5F, -2F, 6.25F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 151
		bodyModel[256].setRotationPoint(10.25F, -11F, 0F);
		bodyModel[256].rotateAngleY = -0.13962634F;

		bodyModel[257].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 151
		bodyModel[257].setRotationPoint(9F, -12.5F, 2F);
		bodyModel[257].rotateAngleY = 0.41887902F;

		bodyModel[258].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 151
		bodyModel[258].setRotationPoint(9F, -11.25F, 4.5F);
		bodyModel[258].rotateAngleY = 0.41887902F;

		bodyModel[259].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 151
		bodyModel[259].setRotationPoint(9F, -10F, 7F);
		bodyModel[259].rotateAngleY = 0.41887902F;

		bodyModel[260].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 151
		bodyModel[260].setRotationPoint(8F, -11F, 2F);
		bodyModel[260].rotateAngleX = -0.43633231F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278
		bodyModel[261].setRotationPoint(4.25F, -11F, 1F);

		bodyModel[262].addBox(-1F, 0F, -1F, 2, 4, 2, 0F); // Box 279
		bodyModel[262].setRotationPoint(11.5F, -4F, 9F);
		bodyModel[262].rotateAngleY = -0.78539816F;

		bodyModel[263].addBox(-0.5F, 0F, -0.5F, 1, 1, 3, 0F); // Box 280
		bodyModel[263].setRotationPoint(11.5F, -5F, 9F);
		bodyModel[263].rotateAngleY = -1.11701072F;

		bodyModel[264].addBox(0F, 0F, 0F, 25, 1, 0, 0F); // Box 176
		bodyModel[264].setRotationPoint(-10.5F, 8F, -5.52F);

		bodyModel[265].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 411
		bodyModel[265].setRotationPoint(12.5F, 1F, -6.5F);
		bodyModel[265].rotateAngleY = -0.78539816F;

		bodyModel[266].addBox(0.5F, 0F, 0.5F, 1, 1, 1, 0F); // Box 413
		bodyModel[266].setRotationPoint(12.5F, 3F, -6.5F);
		bodyModel[266].rotateAngleY = -0.78539816F;

		bodyModel[267].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 415
		bodyModel[267].setRotationPoint(14.5F, 8F, -6.54F);

		bodyModel[268].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 418
		bodyModel[268].setRotationPoint(13.5F, 4F, -6.5F);
		bodyModel[268].rotateAngleZ = 0.20943951F;

		bodyModel[269].addBox(0F, 0F, 0F, 25, 1, 0, 0F); // Box 284
		bodyModel[269].setRotationPoint(-10.5F, 8F, 5.52F);

		bodyModel[270].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 285
		bodyModel[270].setRotationPoint(12.5F, 1F, 6.5F);
		bodyModel[270].rotateAngleY = -0.78539816F;

		bodyModel[271].addBox(0.5F, 0F, 0.5F, 1, 1, 1, 0F); // Box 286
		bodyModel[271].setRotationPoint(12.5F, 3F, 6.5F);
		bodyModel[271].rotateAngleY = -0.78539816F;

		bodyModel[272].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 287
		bodyModel[272].setRotationPoint(14.5F, 8F, 5.54F);

		bodyModel[273].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 288
		bodyModel[273].setRotationPoint(13.5F, 4F, 6.5F);
		bodyModel[273].rotateAngleZ = 0.20943951F;

		bodyModel[274].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[274].setRotationPoint(24.5F, -9.5F, -1F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.5F, 0F, 0.8F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, 0F, 0.8F); // Box 295 numberboard
		bodyModel[275].setRotationPoint(24.5F, -12F, -1.5F);

		bodyModel[276].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 296
		bodyModel[276].setRotationPoint(24.75F, -12.5F, -1.5F);

		bodyModel[277].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 297 headlight rear
		bodyModel[277].setRotationPoint(26.76F, -12F, -1F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 379
		bodyModel[278].setRotationPoint(24.5F, 5F, -1.5F);

		bodyModel[279].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 380
		bodyModel[279].setRotationPoint(24.5F, 3F, -1.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[280].setRotationPoint(24.5F, 2F, -1.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 241
		bodyModel[281].setRotationPoint(15.49F, 4F, -6F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 242
		bodyModel[282].setRotationPoint(15.49F, 4F, -11F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4F, 0F, 0F, -4F, 0F); // Box 249
		bodyModel[283].setRotationPoint(15.49F, 4F, 6F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[284].setRotationPoint(15.49F, 3F, -11F);

		bodyModel[285].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 359
		bodyModel[285].setRotationPoint(-3F, 2F, -5.4F);

		bodyModel[286].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 360
		bodyModel[286].setRotationPoint(-12.5F, 2F, -5.4F);

		bodyModel[287].addBox(0F, 0F, 0F, 9, 1, 22, 0F); // Box 239
		bodyModel[287].setRotationPoint(15.5F, 2F, -11F);

		bodyModel[288].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 250
		bodyModel[288].setRotationPoint(15.5F, 0F, -10F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 318
		bodyModel[289].setRotationPoint(24.5F, -10.5F, -1F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 320
		bodyModel[290].setRotationPoint(24.5F, -10.5F, 0F);

		bodyModel[291].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 321
		bodyModel[291].setRotationPoint(24.75F, -13.75F, 0F);
		bodyModel[291].rotateAngleX = -0.78539816F;

		bodyModel[292].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 322 headlight rear
		bodyModel[292].setRotationPoint(26.76F, -13F, 0F);
		bodyModel[292].rotateAngleX = -0.78539816F;

		bodyModel[293].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 323
		bodyModel[293].setRotationPoint(25.25F, -14.25F, -1F);

		bodyModel[294].addBox(0F, 0F, 0F, 4, 7, 22, 0F); // Box 118
		bodyModel[294].setRotationPoint(20.5F, -5F, -11F);

		bodyModel[295].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 221
		bodyModel[295].setRotationPoint(23.5F, -6F, -10F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 3, 3, 20, 0F,0F, 0F, -6F, -1.5F, -0.5F, -6F, -1.5F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222 coal load
		bodyModel[296].setRotationPoint(20.5F, -8F, -10F);

		bodyModel[297].addBox(0F, 0F, 0F, 3, 7, 20, 0F); // Box 257
		bodyModel[297].setRotationPoint(20.5F, -7F, -10F);

		bodyModel[298].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 258
		bodyModel[298].setRotationPoint(21F, -8F, -1F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[299].setRotationPoint(20.5F, -10F, -11F);

		bodyModel[300].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 344
		bodyModel[300].setRotationPoint(20.5F, -6F, -11F);

		bodyModel[301].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 345
		bodyModel[301].setRotationPoint(20.5F, -6F, 10F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[302].setRotationPoint(20.5F, -10F, 10F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 254
		bodyModel[303].setRotationPoint(20.5F, -11.75F, -1F);

		bodyModel[304].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 255
		bodyModel[304].setRotationPoint(20.75F, -15F, 0F);
		bodyModel[304].rotateAngleX = -0.78539816F;

		bodyModel[305].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 256
		bodyModel[305].setRotationPoint(21.25F, -15.5F, -1F);

		bodyModel[306].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 257 headlight REAR
		bodyModel[306].setRotationPoint(22.76F, -14.25F, 0F);
		bodyModel[306].rotateAngleX = -0.78539816F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 258
		bodyModel[307].setRotationPoint(20.5F, -11.75F, 0F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[308].setRotationPoint(20.5F, -10.75F, -1F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.5F, 0F, 0.8F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, 0F, 0.8F); // Box 312 numberboard
		bodyModel[309].setRotationPoint(20.5F, -14F, -1.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[310].setRotationPoint(20.5F, -11.5F, -1F);

		bodyModel[311].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 314
		bodyModel[311].setRotationPoint(20.75F, -14.5F, -1.5F);

		bodyModel[312].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 315 headlight REAR
		bodyModel[312].setRotationPoint(22.76F, -14F, -1F);

		bodyModel[313].addBox(0F, 0F, 0F, 4, 4, 22, 0F); // Box 289
		bodyModel[313].setRotationPoint(20.5F, -9F, -11F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[314].setRotationPoint(20.5F, -14F, -11F);

		bodyModel[315].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 291
		bodyModel[315].setRotationPoint(23.5F, -10F, -10F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[316].setRotationPoint(20.5F, -14F, 10F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 3, 3, 20, 0F,0F, 0F, -6F, -1.5F, -0.5F, -6F, -1.5F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293 coal load
		bodyModel[317].setRotationPoint(20.5F, -12F, -10F);

		bodyModel[318].addBox(0F, 0F, 0F, 3, 4, 20, 0F); // Box 316
		bodyModel[318].setRotationPoint(20.5F, -11F, -10F);

		bodyModel[319].addBox(-11F, 0F, 0F, 2, 1, 2, 0F); // Box 317
		bodyModel[319].setRotationPoint(32F, -12F, -1F);

		bodyModel[320].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 341
		bodyModel[320].setRotationPoint(20.5F, -10F, -11F);

		bodyModel[321].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 342
		bodyModel[321].setRotationPoint(20.5F, -10F, 10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 21, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Radiator pipes CULL
		bodyModel[322].setRotationPoint(-14.01F, -1F, -9.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 21, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 323
		bodyModel[323].setRotationPoint(-14.01F, -1F, 6.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1.5F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 1.5F, 0F, 0F); // Box 294
		bodyModel[324].setRotationPoint(-26F, 7F, -10F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -3.5F, -0.5F, 0F, 3F, -0.5F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -3F, 0F, 0F, 2.5F, 0F, 0F); // Box 297
		bodyModel[325].setRotationPoint(-24F, 5F, -10F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 330
		bodyModel[326].setRotationPoint(-26F, 7F, 0F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, -0.5F, 0F, -3.5F, -0.5F, 0F, -1.5F, 0F, -0.5F, 1F, 0F, -0.5F, 2.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 331
		bodyModel[327].setRotationPoint(-24F, 5F, 0F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,1F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, 1.5F, 0F, 0F, -2F, 0F, 0F); // Box 332
		bodyModel[328].setRotationPoint(25F, 7F, -10F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1.5F, 0F, -0.5F, 1F, 0F, -0.5F, 3F, -0.5F, 0F, -3.5F, -0.5F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 333
		bodyModel[329].setRotationPoint(23F, 5F, -10F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, -0.5F, 1F, 0F, -0.5F, -2F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 334
		bodyModel[330].setRotationPoint(25F, 7F, 0F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, -0.5F, 0F, 3F, -0.5F, 0F, 1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 335
		bodyModel[331].setRotationPoint(23F, 5F, 0F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderLocomotiveModelWithoutBeacon(bodyModel, entity, f5);
	}
}