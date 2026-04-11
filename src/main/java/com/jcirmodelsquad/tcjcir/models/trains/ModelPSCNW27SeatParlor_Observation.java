//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelPSCNW27SeatParlor_Observation extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPSCNW27SeatParlor_Observation() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[752];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 3, 115, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 44, 116, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 322, 135, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 29, 123, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 46, 132, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 57, 154, textureX, textureY); // Box 24
		bodyModel[9] = new ModelRendererTurbo(this, 66, 154, textureX, textureY); // Box 24
		bodyModel[10] = new ModelRendererTurbo(this, 54, 62, textureX, textureY); // Left step part
		bodyModel[11] = new ModelRendererTurbo(this, 52, 65, textureX, textureY); // Left step part
		bodyModel[12] = new ModelRendererTurbo(this, 54, 68, textureX, textureY); // Left step part
		bodyModel[13] = new ModelRendererTurbo(this, 52, 71, textureX, textureY); // Left step part
		bodyModel[14] = new ModelRendererTurbo(this, 54, 77, textureX, textureY); // Left step part
		bodyModel[15] = new ModelRendererTurbo(this, 45, 79, textureX, textureY); // Left step part
		bodyModel[16] = new ModelRendererTurbo(this, 45, 77, textureX, textureY); // Left step part
		bodyModel[17] = new ModelRendererTurbo(this, 46, 74, textureX, textureY); // Left step part
		bodyModel[18] = new ModelRendererTurbo(this, 63, 79, textureX, textureY); // Left step part
		bodyModel[19] = new ModelRendererTurbo(this, 63, 77, textureX, textureY); // Left step part
		bodyModel[20] = new ModelRendererTurbo(this, 64, 74, textureX, textureY); // Left step part
		bodyModel[21] = new ModelRendererTurbo(this, 54, 74, textureX, textureY); // Left step part
		bodyModel[22] = new ModelRendererTurbo(this, 50, 81, textureX, textureY); // Left step part
		bodyModel[23] = new ModelRendererTurbo(this, 57, 163, textureX, textureY); // Box 144
		bodyModel[24] = new ModelRendererTurbo(this, 66, 163, textureX, textureY); // Box 145
		bodyModel[25] = new ModelRendererTurbo(this, 54, 87, textureX, textureY); // Right step part
		bodyModel[26] = new ModelRendererTurbo(this, 52, 90, textureX, textureY); // Right step part
		bodyModel[27] = new ModelRendererTurbo(this, 54, 93, textureX, textureY); // Right step part
		bodyModel[28] = new ModelRendererTurbo(this, 52, 96, textureX, textureY); // Right step part
		bodyModel[29] = new ModelRendererTurbo(this, 54, 102, textureX, textureY); // Right step part
		bodyModel[30] = new ModelRendererTurbo(this, 45, 100, textureX, textureY); // Right step part
		bodyModel[31] = new ModelRendererTurbo(this, 45, 98, textureX, textureY); // Right step part
		bodyModel[32] = new ModelRendererTurbo(this, 46, 95, textureX, textureY); // Right step part
		bodyModel[33] = new ModelRendererTurbo(this, 63, 100, textureX, textureY); // Right step part
		bodyModel[34] = new ModelRendererTurbo(this, 63, 98, textureX, textureY); // Right step part
		bodyModel[35] = new ModelRendererTurbo(this, 64, 95, textureX, textureY); // Right step part
		bodyModel[36] = new ModelRendererTurbo(this, 54, 99, textureX, textureY); // Right step part
		bodyModel[37] = new ModelRendererTurbo(this, 50, 106, textureX, textureY); // Right step part
		bodyModel[38] = new ModelRendererTurbo(this, 33, 114, textureX, textureY); // Left trapdoor
		bodyModel[39] = new ModelRendererTurbo(this, 35, 129, textureX, textureY); // Right trapdoor
		bodyModel[40] = new ModelRendererTurbo(this, 85, 68, textureX, textureY); // Box 38
		bodyModel[41] = new ModelRendererTurbo(this, 85, 87, textureX, textureY); // Box 128
		bodyModel[42] = new ModelRendererTurbo(this, 28, 90, textureX, textureY); // Box 128
		bodyModel[43] = new ModelRendererTurbo(this, 29, 56, textureX, textureY); // Box 128
		bodyModel[44] = new ModelRendererTurbo(this, 45, 30, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 44, 5, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 35, 81, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 29, 17, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 73, 66, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 73, 87, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 20, 75, textureX, textureY); // Vestibule door
		bodyModel[51] = new ModelRendererTurbo(this, 64, 49, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 64, 55, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 64, 34, textureX, textureY); // Box 168
		bodyModel[54] = new ModelRendererTurbo(this, 64, 29, textureX, textureY); // Box 169
		bodyModel[55] = new ModelRendererTurbo(this, 72, 219, textureX, textureY); // Box 128
		bodyModel[56] = new ModelRendererTurbo(this, 72, 197, textureX, textureY); // Box 177
		bodyModel[57] = new ModelRendererTurbo(this, 64, 60, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 64, 25, textureX, textureY); // Box 170
		bodyModel[59] = new ModelRendererTurbo(this, 32, 24, textureX, textureY); // Front gate closed
		bodyModel[60] = new ModelRendererTurbo(this, 29, 29, textureX, textureY); // Front gate open
		bodyModel[61] = new ModelRendererTurbo(this, 101, 7, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 96, 14, textureX, textureY); // Box 128
		bodyModel[63] = new ModelRendererTurbo(this, 96, 2, textureX, textureY); // Box 176
		bodyModel[64] = new ModelRendererTurbo(this, 63, 3, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 72, 203, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 77, 148, textureX, textureY); // Box 2
		bodyModel[67] = new ModelRendererTurbo(this, 77, 151, textureX, textureY); // Box 2
		bodyModel[68] = new ModelRendererTurbo(this, 84, 151, textureX, textureY); // Box 2
		bodyModel[69] = new ModelRendererTurbo(this, 253, 148, textureX, textureY); // Box 2
		bodyModel[70] = new ModelRendererTurbo(this, 253, 151, textureX, textureY); // Box 2
		bodyModel[71] = new ModelRendererTurbo(this, 258, 148, textureX, textureY); // Box 2
		bodyModel[72] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[73] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[74] = new ModelRendererTurbo(this, 77, 138, textureX, textureY); // Box 24
		bodyModel[75] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 25
		bodyModel[76] = new ModelRendererTurbo(this, 84, 141, textureX, textureY); // Box 27
		bodyModel[77] = new ModelRendererTurbo(this, 253, 138, textureX, textureY); // Box 28
		bodyModel[78] = new ModelRendererTurbo(this, 253, 141, textureX, textureY); // Box 29
		bodyModel[79] = new ModelRendererTurbo(this, 258, 138, textureX, textureY); // Box 31
		bodyModel[80] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[81] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[82] = new ModelRendererTurbo(this, 84, 148, textureX, textureY); // Box 2
		bodyModel[83] = new ModelRendererTurbo(this, 84, 138, textureX, textureY); // Box 41
		bodyModel[84] = new ModelRendererTurbo(this, 63, 155, textureX, textureY); // Box 26
		bodyModel[85] = new ModelRendererTurbo(this, 64, 158, textureX, textureY); // Box 26
		bodyModel[86] = new ModelRendererTurbo(this, 54, 155, textureX, textureY); // Box 26
		bodyModel[87] = new ModelRendererTurbo(this, 55, 158, textureX, textureY); // Box 26
		bodyModel[88] = new ModelRendererTurbo(this, 63, 164, textureX, textureY); // Box 140
		bodyModel[89] = new ModelRendererTurbo(this, 64, 167, textureX, textureY); // Box 141
		bodyModel[90] = new ModelRendererTurbo(this, 54, 164, textureX, textureY); // Box 142
		bodyModel[91] = new ModelRendererTurbo(this, 55, 167, textureX, textureY); // Box 143
		bodyModel[92] = new ModelRendererTurbo(this, 27, 3, textureX, textureY); // Box 128
		bodyModel[93] = new ModelRendererTurbo(this, 14, 31, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 22, 14, textureX, textureY); // Box 128
		bodyModel[95] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 128
		bodyModel[96] = new ModelRendererTurbo(this, 15, 13, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 8, 13, textureX, textureY); // Box 128
		bodyModel[98] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 4, 1, textureX, textureY); // Box 128
		bodyModel[100] = new ModelRendererTurbo(this, 64, 40, textureX, textureY); // Box 128
		bodyModel[101] = new ModelRendererTurbo(this, 290, 106, textureX, textureY); // Box 2
		bodyModel[102] = new ModelRendererTurbo(this, 317, 118, textureX, textureY); // Box 2
		bodyModel[103] = new ModelRendererTurbo(this, 317, 122, textureX, textureY); // Box 174
		bodyModel[104] = new ModelRendererTurbo(this, 326, 109, textureX, textureY); // Box 2
		bodyModel[105] = new ModelRendererTurbo(this, 345, 111, textureX, textureY); // Box 2
		bodyModel[106] = new ModelRendererTurbo(this, 345, 117, textureX, textureY); // Box 161
		bodyModel[107] = new ModelRendererTurbo(this, 358, 114, textureX, textureY); // Box 2
		bodyModel[108] = new ModelRendererTurbo(this, 367, 106, textureX, textureY); // Box 2
		bodyModel[109] = new ModelRendererTurbo(this, 367, 113, textureX, textureY); // Box 163
		bodyModel[110] = new ModelRendererTurbo(this, 304, 68, textureX, textureY); // Box 38
		bodyModel[111] = new ModelRendererTurbo(this, 304, 87, textureX, textureY); // Box 175
		bodyModel[112] = new ModelRendererTurbo(this, 336, 72, textureX, textureY); // Box 38
		bodyModel[113] = new ModelRendererTurbo(this, 322, 66, textureX, textureY); // Box 2
		bodyModel[114] = new ModelRendererTurbo(this, 313, 70, textureX, textureY); // Box 38
		bodyModel[115] = new ModelRendererTurbo(this, 322, 87, textureX, textureY); // Box 176
		bodyModel[116] = new ModelRendererTurbo(this, 313, 88, textureX, textureY); // Box 177
		bodyModel[117] = new ModelRendererTurbo(this, 263, 138, textureX, textureY); // Box 31
		bodyModel[118] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 31
		bodyModel[119] = new ModelRendererTurbo(this, 278, 138, textureX, textureY); // Box 2
		bodyModel[120] = new ModelRendererTurbo(this, 263, 148, textureX, textureY); // Box 239
		bodyModel[121] = new ModelRendererTurbo(this, 272, 148, textureX, textureY); // Box 240
		bodyModel[122] = new ModelRendererTurbo(this, 278, 148, textureX, textureY); // Box 241
		bodyModel[123] = new ModelRendererTurbo(this, 260, 141, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[124] = new ModelRendererTurbo(this, 269, 141, textureX, textureY); // Box 31
		bodyModel[125] = new ModelRendererTurbo(this, 285, 140, textureX, textureY); // Box 2
		bodyModel[126] = new ModelRendererTurbo(this, 260, 151, textureX, textureY,"cull"); // Box 245 cull
		bodyModel[127] = new ModelRendererTurbo(this, 269, 151, textureX, textureY); // Box 246
		bodyModel[128] = new ModelRendererTurbo(this, 285, 150, textureX, textureY); // Box 247
		bodyModel[129] = new ModelRendererTurbo(this, 420, 43, textureX, textureY); // Box 169
		bodyModel[130] = new ModelRendererTurbo(this, 427, 43, textureX, textureY); // Box 169
		bodyModel[131] = new ModelRendererTurbo(this, 419, 46, textureX, textureY); // Box 169
		bodyModel[132] = new ModelRendererTurbo(this, 413, 43, textureX, textureY); // Box 555
		bodyModel[133] = new ModelRendererTurbo(this, 426, 51, textureX, textureY); // Box 169
		bodyModel[134] = new ModelRendererTurbo(this, 416, 51, textureX, textureY); // Box 557
		bodyModel[135] = new ModelRendererTurbo(this, 421, 51, textureX, textureY); // Box 169
		bodyModel[136] = new ModelRendererTurbo(this, 432, 45, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[137] = new ModelRendererTurbo(this, 435, 45, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[138] = new ModelRendererTurbo(this, 430, 45, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[139] = new ModelRendererTurbo(this, 429, 45, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[140] = new ModelRendererTurbo(this, 435, 49, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[141] = new ModelRendererTurbo(this, 429, 49, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[142] = new ModelRendererTurbo(this, 432, 49, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[143] = new ModelRendererTurbo(this, 31, 209, textureX, textureY); // Box 128
		bodyModel[144] = new ModelRendererTurbo(this, 53, 225, textureX, textureY); // Box 128
		bodyModel[145] = new ModelRendererTurbo(this, 58, 210, textureX, textureY); // Box 176
		bodyModel[146] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 128
		bodyModel[147] = new ModelRendererTurbo(this, 72, 232, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 72, 225, textureX, textureY); // Box 128
		bodyModel[149] = new ModelRendererTurbo(this, 72, 229, textureX, textureY); // Box 128
		bodyModel[150] = new ModelRendererTurbo(this, 72, 192, textureX, textureY); // Box 192
		bodyModel[151] = new ModelRendererTurbo(this, 72, 185, textureX, textureY); // Box 193
		bodyModel[152] = new ModelRendererTurbo(this, 72, 189, textureX, textureY); // Box 194
		bodyModel[153] = new ModelRendererTurbo(this, 20, 73, textureX, textureY); // Box 128
		bodyModel[154] = new ModelRendererTurbo(this, 23, 73, textureX, textureY); // Box 128
		bodyModel[155] = new ModelRendererTurbo(this, 22, 96, textureX, textureY); // Box 202
		bodyModel[156] = new ModelRendererTurbo(this, 25, 96, textureX, textureY); // Box 203
		bodyModel[157] = new ModelRendererTurbo(this, 335, 60, textureX, textureY); // Box 128
		bodyModel[158] = new ModelRendererTurbo(this, 339, 42, textureX, textureY); // Box 128
		bodyModel[159] = new ModelRendererTurbo(this, 332, 56, textureX, textureY); // Box 128
		bodyModel[160] = new ModelRendererTurbo(this, 330, 50, textureX, textureY); // Box 128
		bodyModel[161] = new ModelRendererTurbo(this, 322, 40, textureX, textureY); // Box 128
		bodyModel[162] = new ModelRendererTurbo(this, 303, 40, textureX, textureY); // Box 128
		bodyModel[163] = new ModelRendererTurbo(this, 299, 51, textureX, textureY); // Box 128
		bodyModel[164] = new ModelRendererTurbo(this, 298, 59, textureX, textureY); // Box 128
		bodyModel[165] = new ModelRendererTurbo(this, 324, 59, textureX, textureY); // Box 128
		bodyModel[166] = new ModelRendererTurbo(this, 319, 52, textureX, textureY); // Box 128
		bodyModel[167] = new ModelRendererTurbo(this, 311, 59, textureX, textureY); // Box 128
		bodyModel[168] = new ModelRendererTurbo(this, 310, 51, textureX, textureY); // Box 128
		bodyModel[169] = new ModelRendererTurbo(this, 335, 28, textureX, textureY); // Box 471
		bodyModel[170] = new ModelRendererTurbo(this, 334, 32, textureX, textureY); // Box 472
		bodyModel[171] = new ModelRendererTurbo(this, 333, 36, textureX, textureY); // Box 473
		bodyModel[172] = new ModelRendererTurbo(this, 345, 56, textureX, textureY); // Box 128
		bodyModel[173] = new ModelRendererTurbo(this, 299, 32, textureX, textureY); // Box 482
		bodyModel[174] = new ModelRendererTurbo(this, 298, 26, textureX, textureY); // Box 483
		bodyModel[175] = new ModelRendererTurbo(this, 324, 25, textureX, textureY); // Box 484
		bodyModel[176] = new ModelRendererTurbo(this, 319, 33, textureX, textureY); // Box 485
		bodyModel[177] = new ModelRendererTurbo(this, 311, 25, textureX, textureY); // Box 486
		bodyModel[178] = new ModelRendererTurbo(this, 310, 32, textureX, textureY); // Box 487
		bodyModel[179] = new ModelRendererTurbo(this, 345, 31, textureX, textureY); // Box 489
		bodyModel[180] = new ModelRendererTurbo(this, 356, 34, textureX, textureY); // Box 128
		bodyModel[181] = new ModelRendererTurbo(this, 362, 49, textureX, textureY); // Box 128
		bodyModel[182] = new ModelRendererTurbo(this, 362, 46, textureX, textureY); // Box 494
		bodyModel[183] = new ModelRendererTurbo(this, 378, 37, textureX, textureY); // Box 128
		bodyModel[184] = new ModelRendererTurbo(this, 396, 45, textureX, textureY); // Box 128
		bodyModel[185] = new ModelRendererTurbo(this, 380, 45, textureX, textureY); // Box 498
		bodyModel[186] = new ModelRendererTurbo(this, 404, 40, textureX, textureY); // Box 128
		bodyModel[187] = new ModelRendererTurbo(this, 405, 48, textureX, textureY); // Box 128
		bodyModel[188] = new ModelRendererTurbo(this, 405, 34, textureX, textureY); // Box 501
		bodyModel[189] = new ModelRendererTurbo(this, 73, 69, textureX, textureY); // Left side door
		bodyModel[190] = new ModelRendererTurbo(this, 73, 90, textureX, textureY); // Right side door
		bodyModel[191] = new ModelRendererTurbo(this, 43, 146, textureX, textureY); // Box 2
		bodyModel[192] = new ModelRendererTurbo(this, 72, 151, textureX, textureY); // Box 2
		bodyModel[193] = new ModelRendererTurbo(this, 52, 144, textureX, textureY); // Box 191
		bodyModel[194] = new ModelRendererTurbo(this, 72, 144, textureX, textureY); // Box 192
		bodyModel[195] = new ModelRendererTurbo(this, 41, 154, textureX, textureY); // Box 2
		bodyModel[196] = new ModelRendererTurbo(this, 25, 158, textureX, textureY); // Box 2
		bodyModel[197] = new ModelRendererTurbo(this, 33, 152, textureX, textureY); // Box 194
		bodyModel[198] = new ModelRendererTurbo(this, 29, 147, textureX, textureY); // Box 195
		bodyModel[199] = new ModelRendererTurbo(this, 290, 120, textureX, textureY); // Box 2
		bodyModel[200] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[201] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[202] = new ModelRendererTurbo(this, 244, 151, textureX, textureY); // Box 2
		bodyModel[203] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[204] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[205] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[206] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[207] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[208] = new ModelRendererTurbo(this, 244, 141, textureX, textureY); // Box 35
		bodyModel[209] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[210] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[211] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[212] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 39
		bodyModel[213] = new ModelRendererTurbo(this, 71, 266, textureX, textureY); // Box 38
		bodyModel[214] = new ModelRendererTurbo(this, 71, 303, textureX, textureY); // Box 38
		bodyModel[215] = new ModelRendererTurbo(this, 33, 309, textureX, textureY); // Box 38
		bodyModel[216] = new ModelRendererTurbo(this, 33, 272, textureX, textureY); // Box 547
		bodyModel[217] = new ModelRendererTurbo(this, 63, 312, textureX, textureY); // Box 379
		bodyModel[218] = new ModelRendererTurbo(this, 62, 315, textureX, textureY); // Box 380
		bodyModel[219] = new ModelRendererTurbo(this, 64, 319, textureX, textureY); // Box 382
		bodyModel[220] = new ModelRendererTurbo(this, 57, 321, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[221] = new ModelRendererTurbo(this, 62, 278, textureX, textureY); // Box 602
		bodyModel[222] = new ModelRendererTurbo(this, 57, 284, textureX, textureY); // Box 603
		bodyModel[223] = new ModelRendererTurbo(this, 64, 282, textureX, textureY); // Box 382
		bodyModel[224] = new ModelRendererTurbo(this, 46, 277, textureX, textureY); // Box 38
		bodyModel[225] = new ModelRendererTurbo(this, 49, 282, textureX, textureY); // Box 38
		bodyModel[226] = new ModelRendererTurbo(this, 48, 286, textureX, textureY); // Box 38
		bodyModel[227] = new ModelRendererTurbo(this, 46, 314, textureX, textureY); // Box 38
		bodyModel[228] = new ModelRendererTurbo(this, 49, 319, textureX, textureY); // Box 38
		bodyModel[229] = new ModelRendererTurbo(this, 48, 323, textureX, textureY); // Box 38
		bodyModel[230] = new ModelRendererTurbo(this, 63, 275, textureX, textureY); // Box 612
		bodyModel[231] = new ModelRendererTurbo(this, 131, 172, textureX, textureY); // Box 2
		bodyModel[232] = new ModelRendererTurbo(this, 74, 166, textureX, textureY); // Box 2
		bodyModel[233] = new ModelRendererTurbo(this, 74, 177, textureX, textureY); // Box 2
		bodyModel[234] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 284
		bodyModel[235] = new ModelRendererTurbo(this, 221, 167, textureX, textureY); // Box 41
		bodyModel[236] = new ModelRendererTurbo(this, 238, 168, textureX, textureY); // Box 41
		bodyModel[237] = new ModelRendererTurbo(this, 218, 168, textureX, textureY); // Box 41
		bodyModel[238] = new ModelRendererTurbo(this, 112, 155, textureX, textureY); // Box 617
		bodyModel[239] = new ModelRendererTurbo(this, 147, 160, textureX, textureY); // Box 41
		bodyModel[240] = new ModelRendererTurbo(this, 166, 156, textureX, textureY); // Box 41
		bodyModel[241] = new ModelRendererTurbo(this, 144, 156, textureX, textureY); // Box 41
		bodyModel[242] = new ModelRendererTurbo(this, 147, 155, textureX, textureY); // Box 41
		bodyModel[243] = new ModelRendererTurbo(this, 166, 161, textureX, textureY); // Box 41
		bodyModel[244] = new ModelRendererTurbo(this, 144, 161, textureX, textureY); // Box 41
		bodyModel[245] = new ModelRendererTurbo(this, 169, 155, textureX, textureY); // Box 624
		bodyModel[246] = new ModelRendererTurbo(this, 217, 155, textureX, textureY); // Box 628
		bodyModel[247] = new ModelRendererTurbo(this, 160, 174, textureX, textureY); // Box 606
		bodyModel[248] = new ModelRendererTurbo(this, 179, 172, textureX, textureY); // Box 629
		bodyModel[249] = new ModelRendererTurbo(this, 190, 175, textureX, textureY); // Box 41
		bodyModel[250] = new ModelRendererTurbo(this, 195, 182, textureX, textureY); // Box 41
		bodyModel[251] = new ModelRendererTurbo(this, 195, 172, textureX, textureY); // Box 41
		bodyModel[252] = new ModelRendererTurbo(this, 198, 172, textureX, textureY); // Box 633
		bodyModel[253] = new ModelRendererTurbo(this, 252, 163, textureX, textureY); // Box 612
		bodyModel[254] = new ModelRendererTurbo(this, 128, 11, textureX, textureY); // Box 128
		bodyModel[255] = new ModelRendererTurbo(this, 143, 1, textureX, textureY); // Box 270
		bodyModel[256] = new ModelRendererTurbo(this, 142, 6, textureX, textureY); // Box 271
		bodyModel[257] = new ModelRendererTurbo(this, 143, 20, textureX, textureY); // Box 128
		bodyModel[258] = new ModelRendererTurbo(this, 142, 16, textureX, textureY); // Box 128
		bodyModel[259] = new ModelRendererTurbo(this, 154, 20, textureX, textureY); // Box 128
		bodyModel[260] = new ModelRendererTurbo(this, 153, 16, textureX, textureY); // Box 128
		bodyModel[261] = new ModelRendererTurbo(this, 165, 20, textureX, textureY); // Box 128
		bodyModel[262] = new ModelRendererTurbo(this, 164, 16, textureX, textureY); // Box 128
		bodyModel[263] = new ModelRendererTurbo(this, 35, 183, textureX, textureY); // Box 38
		bodyModel[264] = new ModelRendererTurbo(this, 40, 183, textureX, textureY); // Box 38
		bodyModel[265] = new ModelRendererTurbo(this, 19, 199, textureX, textureY); // Box 128
		bodyModel[266] = new ModelRendererTurbo(this, 28, 200, textureX, textureY); // Box 128
		bodyModel[267] = new ModelRendererTurbo(this, 25, 183, textureX, textureY); // Box 128
		bodyModel[268] = new ModelRendererTurbo(this, 18, 193, textureX, textureY); // Box 128
		bodyModel[269] = new ModelRendererTurbo(this, 27, 194, textureX, textureY); // Box 128
		bodyModel[270] = new ModelRendererTurbo(this, 17, 187, textureX, textureY); // Box 128
		bodyModel[271] = new ModelRendererTurbo(this, 26, 188, textureX, textureY); // Box 128
		bodyModel[272] = new ModelRendererTurbo(this, 15, 179, textureX, textureY); // Box 128
		bodyModel[273] = new ModelRendererTurbo(this, 24, 180, textureX, textureY); // Box 128
		bodyModel[274] = new ModelRendererTurbo(this, 16, 115, textureX, textureY); // Box 128
		bodyModel[275] = new ModelRendererTurbo(this, 6, 115, textureX, textureY); // Box 153
		bodyModel[276] = new ModelRendererTurbo(this, 12, 108, textureX, textureY); // Box 128
		bodyModel[277] = new ModelRendererTurbo(this, 20, 109, textureX, textureY); // Box 128
		bodyModel[278] = new ModelRendererTurbo(this, 35, 163, textureX, textureY); // Box 247
		bodyModel[279] = new ModelRendererTurbo(this, 40, 164, textureX, textureY); // Box 248
		bodyModel[280] = new ModelRendererTurbo(this, 19, 164, textureX, textureY); // Box 249
		bodyModel[281] = new ModelRendererTurbo(this, 28, 164, textureX, textureY); // Box 250
		bodyModel[282] = new ModelRendererTurbo(this, 18, 168, textureX, textureY); // Box 251
		bodyModel[283] = new ModelRendererTurbo(this, 27, 169, textureX, textureY); // Box 252
		bodyModel[284] = new ModelRendererTurbo(this, 17, 173, textureX, textureY); // Box 253
		bodyModel[285] = new ModelRendererTurbo(this, 26, 174, textureX, textureY); // Box 254
		bodyModel[286] = new ModelRendererTurbo(this, 6, 109, textureX, textureY); // Box 255
		bodyModel[287] = new ModelRendererTurbo(this, 12, 114, textureX, textureY); // Box 128
		bodyModel[288] = new ModelRendererTurbo(this, 13, 115, textureX, textureY); // Box 128
		bodyModel[289] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 261
		bodyModel[290] = new ModelRendererTurbo(this, 19, 122, textureX, textureY); // Box 128
		bodyModel[291] = new ModelRendererTurbo(this, 1, 117, textureX, textureY); // Box 259
		bodyModel[292] = new ModelRendererTurbo(this, 193, 266, textureX, textureY); // Box 38
		bodyModel[293] = new ModelRendererTurbo(this, 193, 303, textureX, textureY); // Box 38
		bodyModel[294] = new ModelRendererTurbo(this, 250, 243, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[295] = new ModelRendererTurbo(this, 257, 243, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[296] = new ModelRendererTurbo(this, 264, 243, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[297] = new ModelRendererTurbo(this, 186, 313, textureX, textureY); // Left seat part
		bodyModel[298] = new ModelRendererTurbo(this, 158, 313, textureX, textureY); // Left seat part
		bodyModel[299] = new ModelRendererTurbo(this, 165, 309, textureX, textureY); // Left seat part
		bodyModel[300] = new ModelRendererTurbo(this, 158, 322, textureX, textureY); // Left seat part
		bodyModel[301] = new ModelRendererTurbo(this, 158, 319, textureX, textureY); // Left seat part
		bodyModel[302] = new ModelRendererTurbo(this, 184, 322, textureX, textureY); // Left seat part
		bodyModel[303] = new ModelRendererTurbo(this, 184, 319, textureX, textureY); // Left seat part
		bodyModel[304] = new ModelRendererTurbo(this, 171, 322, textureX, textureY); // Left seat part
		bodyModel[305] = new ModelRendererTurbo(this, 123, 276, textureX, textureY); // Right seat part
		bodyModel[306] = new ModelRendererTurbo(this, 151, 276, textureX, textureY); // Right seat part
		bodyModel[307] = new ModelRendererTurbo(this, 130, 272, textureX, textureY); // Right seat part
		bodyModel[308] = new ModelRendererTurbo(this, 149, 285, textureX, textureY); // Right seat part
		bodyModel[309] = new ModelRendererTurbo(this, 149, 282, textureX, textureY); // Right seat part
		bodyModel[310] = new ModelRendererTurbo(this, 123, 285, textureX, textureY); // Right seat part
		bodyModel[311] = new ModelRendererTurbo(this, 123, 282, textureX, textureY); // Right seat part
		bodyModel[312] = new ModelRendererTurbo(this, 136, 285, textureX, textureY); // Right seat part
		bodyModel[313] = new ModelRendererTurbo(this, 116, 313, textureX, textureY); // Left seat part
		bodyModel[314] = new ModelRendererTurbo(this, 88, 313, textureX, textureY); // Left seat part
		bodyModel[315] = new ModelRendererTurbo(this, 95, 309, textureX, textureY); // Left seat part
		bodyModel[316] = new ModelRendererTurbo(this, 88, 322, textureX, textureY); // Left seat part
		bodyModel[317] = new ModelRendererTurbo(this, 88, 319, textureX, textureY); // Left seat part
		bodyModel[318] = new ModelRendererTurbo(this, 114, 322, textureX, textureY); // Left seat part
		bodyModel[319] = new ModelRendererTurbo(this, 114, 319, textureX, textureY); // Left seat part
		bodyModel[320] = new ModelRendererTurbo(this, 101, 322, textureX, textureY); // Left seat part
		bodyModel[321] = new ModelRendererTurbo(this, 151, 313, textureX, textureY); // Left seat part
		bodyModel[322] = new ModelRendererTurbo(this, 123, 313, textureX, textureY); // Left seat part
		bodyModel[323] = new ModelRendererTurbo(this, 130, 309, textureX, textureY); // Left seat part
		bodyModel[324] = new ModelRendererTurbo(this, 123, 322, textureX, textureY); // Left seat part
		bodyModel[325] = new ModelRendererTurbo(this, 123, 319, textureX, textureY); // Left seat part
		bodyModel[326] = new ModelRendererTurbo(this, 149, 322, textureX, textureY); // Left seat part
		bodyModel[327] = new ModelRendererTurbo(this, 149, 319, textureX, textureY); // Left seat part
		bodyModel[328] = new ModelRendererTurbo(this, 136, 322, textureX, textureY); // Left seat part
		bodyModel[329] = new ModelRendererTurbo(this, 88, 276, textureX, textureY); // Right seat part
		bodyModel[330] = new ModelRendererTurbo(this, 116, 276, textureX, textureY); // Right seat part
		bodyModel[331] = new ModelRendererTurbo(this, 95, 272, textureX, textureY); // Right seat part
		bodyModel[332] = new ModelRendererTurbo(this, 99, 256, textureX, textureY); // Right seat part
		bodyModel[333] = new ModelRendererTurbo(this, 114, 285, textureX, textureY); // Right seat part
		bodyModel[334] = new ModelRendererTurbo(this, 114, 282, textureX, textureY); // Right seat part
		bodyModel[335] = new ModelRendererTurbo(this, 88, 285, textureX, textureY); // Right seat part
		bodyModel[336] = new ModelRendererTurbo(this, 88, 282, textureX, textureY); // Right seat part
		bodyModel[337] = new ModelRendererTurbo(this, 101, 285, textureX, textureY); // Right seat part
		bodyModel[338] = new ModelRendererTurbo(this, 100, 266, textureX, textureY); // Right seat part
		bodyModel[339] = new ModelRendererTurbo(this, 118, 270, textureX, textureY); // Right seat part
		bodyModel[340] = new ModelRendererTurbo(this, 88, 270, textureX, textureY); // Right seat part
		bodyModel[341] = new ModelRendererTurbo(this, 100, 279, textureX, textureY); // Right seat part
		bodyModel[342] = new ModelRendererTurbo(this, 134, 256, textureX, textureY); // Right seat part
		bodyModel[343] = new ModelRendererTurbo(this, 135, 266, textureX, textureY); // Right seat part
		bodyModel[344] = new ModelRendererTurbo(this, 153, 270, textureX, textureY); // Right seat part
		bodyModel[345] = new ModelRendererTurbo(this, 123, 270, textureX, textureY); // Right seat part
		bodyModel[346] = new ModelRendererTurbo(this, 135, 279, textureX, textureY); // Right seat part
		bodyModel[347] = new ModelRendererTurbo(this, 99, 293, textureX, textureY); // Left seat part
		bodyModel[348] = new ModelRendererTurbo(this, 100, 303, textureX, textureY); // Left seat part
		bodyModel[349] = new ModelRendererTurbo(this, 88, 307, textureX, textureY); // Left seat part
		bodyModel[350] = new ModelRendererTurbo(this, 118, 307, textureX, textureY); // Left seat part
		bodyModel[351] = new ModelRendererTurbo(this, 100, 316, textureX, textureY); // Left seat part
		bodyModel[352] = new ModelRendererTurbo(this, 123, 307, textureX, textureY); // Left seat part
		bodyModel[353] = new ModelRendererTurbo(this, 153, 307, textureX, textureY); // Left seat part
		bodyModel[354] = new ModelRendererTurbo(this, 135, 316, textureX, textureY); // Left seat part
		bodyModel[355] = new ModelRendererTurbo(this, 158, 307, textureX, textureY); // Left seat part
		bodyModel[356] = new ModelRendererTurbo(this, 188, 307, textureX, textureY); // Left seat part
		bodyModel[357] = new ModelRendererTurbo(this, 170, 316, textureX, textureY); // Left seat part
		bodyModel[358] = new ModelRendererTurbo(this, 134, 293, textureX, textureY); // Left seat part
		bodyModel[359] = new ModelRendererTurbo(this, 135, 303, textureX, textureY); // Left seat part
		bodyModel[360] = new ModelRendererTurbo(this, 169, 293, textureX, textureY); // Left seat part
		bodyModel[361] = new ModelRendererTurbo(this, 170, 303, textureX, textureY); // Left seat part
		bodyModel[362] = new ModelRendererTurbo(this, 158, 276, textureX, textureY); // Right seat part
		bodyModel[363] = new ModelRendererTurbo(this, 186, 276, textureX, textureY); // Right seat part
		bodyModel[364] = new ModelRendererTurbo(this, 165, 272, textureX, textureY); // Right seat part
		bodyModel[365] = new ModelRendererTurbo(this, 184, 285, textureX, textureY); // Right seat part
		bodyModel[366] = new ModelRendererTurbo(this, 184, 282, textureX, textureY); // Right seat part
		bodyModel[367] = new ModelRendererTurbo(this, 158, 285, textureX, textureY); // Right seat part
		bodyModel[368] = new ModelRendererTurbo(this, 158, 282, textureX, textureY); // Right seat part
		bodyModel[369] = new ModelRendererTurbo(this, 171, 285, textureX, textureY); // Right seat part
		bodyModel[370] = new ModelRendererTurbo(this, 169, 256, textureX, textureY); // Right seat part
		bodyModel[371] = new ModelRendererTurbo(this, 170, 266, textureX, textureY); // Right seat part
		bodyModel[372] = new ModelRendererTurbo(this, 188, 270, textureX, textureY); // Right seat part
		bodyModel[373] = new ModelRendererTurbo(this, 158, 270, textureX, textureY); // Right seat part
		bodyModel[374] = new ModelRendererTurbo(this, 170, 279, textureX, textureY); // Right seat part
		bodyModel[375] = new ModelRendererTurbo(this, 231, 303, textureX, textureY); // Box 38
		bodyModel[376] = new ModelRendererTurbo(this, 210, 309, textureX, textureY); // Box 38
		bodyModel[377] = new ModelRendererTurbo(this, 210, 318, textureX, textureY); // Box 38
		bodyModel[378] = new ModelRendererTurbo(this, 231, 266, textureX, textureY); // Box 397
		bodyModel[379] = new ModelRendererTurbo(this, 210, 272, textureX, textureY); // Box 398
		bodyModel[380] = new ModelRendererTurbo(this, 210, 281, textureX, textureY); // Box 399
		bodyModel[381] = new ModelRendererTurbo(this, 281, 309, textureX, textureY); // Box 38
		bodyModel[382] = new ModelRendererTurbo(this, 250, 296, textureX, textureY); // Box 38
		bodyModel[383] = new ModelRendererTurbo(this, 309, 314, textureX, textureY); // Box 38
		bodyModel[384] = new ModelRendererTurbo(this, 286, 309, textureX, textureY); // Box 38
		bodyModel[385] = new ModelRendererTurbo(this, 305, 308, textureX, textureY); // Box 38
		bodyModel[386] = new ModelRendererTurbo(this, 342, 167, textureX, textureY); // Box 128
		bodyModel[387] = new ModelRendererTurbo(this, 141, 225, textureX, textureY); // Box 128
		bodyModel[388] = new ModelRendererTurbo(this, 143, 190, textureX, textureY); // Box 176
		bodyModel[389] = new ModelRendererTurbo(this, 260, 163, textureX, textureY); // Box 128
		bodyModel[390] = new ModelRendererTurbo(this, 270, 244, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[391] = new ModelRendererTurbo(this, 246, 244, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[392] = new ModelRendererTurbo(this, 273, 244, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[393] = new ModelRendererTurbo(this, 245, 285, textureX, textureY); // Box 38
		bodyModel[394] = new ModelRendererTurbo(this, 247, 252, textureX, textureY); // Box 38
		bodyModel[395] = new ModelRendererTurbo(this, 247, 246, textureX, textureY); // Box 462
		bodyModel[396] = new ModelRendererTurbo(this, 324, 246, textureX, textureY); // Box 462
		bodyModel[397] = new ModelRendererTurbo(this, 352, 88, textureX, textureY); // Box 128
		bodyModel[398] = new ModelRendererTurbo(this, 359, 85, textureX, textureY,"lamp"); // Box 128 tailsign glow
		bodyModel[399] = new ModelRendererTurbo(this, 332, 72, textureX, textureY); // Box 128
		bodyModel[400] = new ModelRendererTurbo(this, 332, 101, textureX, textureY); // Box 204
		bodyModel[401] = new ModelRendererTurbo(this, 332, 74, textureX, textureY); // Box 128
		bodyModel[402] = new ModelRendererTurbo(this, 332, 103, textureX, textureY); // Box 204
		bodyModel[403] = new ModelRendererTurbo(this, 338, 98, textureX, textureY); // Box 169
		bodyModel[404] = new ModelRendererTurbo(this, 343, 98, textureX, textureY,"lamp"); // Box 169 marker lens LF
		bodyModel[405] = new ModelRendererTurbo(this, 333, 98, textureX, textureY,"lamp"); // Box 169 marker lens LR
		bodyModel[406] = new ModelRendererTurbo(this, 338, 69, textureX, textureY); // Box 548
		bodyModel[407] = new ModelRendererTurbo(this, 343, 69, textureX, textureY,"lamp"); // Box 549 marker lens RF
		bodyModel[408] = new ModelRendererTurbo(this, 333, 69, textureX, textureY,"lamp"); // Box 547 marker lens LR
		bodyModel[409] = new ModelRendererTurbo(this, 343, 95, textureX, textureY); // Box 169
		bodyModel[410] = new ModelRendererTurbo(this, 333, 95, textureX, textureY); // Box 169
		bodyModel[411] = new ModelRendererTurbo(this, 343, 66, textureX, textureY); // Box 549
		bodyModel[412] = new ModelRendererTurbo(this, 333, 66, textureX, textureY); // Box 547
		bodyModel[413] = new ModelRendererTurbo(this, 337, 72, textureX, textureY); // Box 128
		bodyModel[414] = new ModelRendererTurbo(this, 337, 74, textureX, textureY); // Box 128
		bodyModel[415] = new ModelRendererTurbo(this, 337, 101, textureX, textureY); // Box 204
		bodyModel[416] = new ModelRendererTurbo(this, 337, 103, textureX, textureY); // Box 204
		bodyModel[417] = new ModelRendererTurbo(this, 372, 117, textureX, textureY); // Box 2
		bodyModel[418] = new ModelRendererTurbo(this, 278, 283, textureX, textureY); // Box 38
		bodyModel[419] = new ModelRendererTurbo(this, 300, 275, textureX, textureY); // Box 38
		bodyModel[420] = new ModelRendererTurbo(this, 315, 287, textureX, textureY); // Box 38
		bodyModel[421] = new ModelRendererTurbo(this, 319, 281, textureX, textureY); // Box 38
		bodyModel[422] = new ModelRendererTurbo(this, 296, 291, textureX, textureY); // Box 38
		bodyModel[423] = new ModelRendererTurbo(this, 317, 315, textureX, textureY); // Box 38
		bodyModel[424] = new ModelRendererTurbo(this, 327, 318, textureX, textureY); // Box 38
		bodyModel[425] = new ModelRendererTurbo(this, 325, 315, textureX, textureY); // Box 38
		bodyModel[426] = new ModelRendererTurbo(this, 312, 315, textureX, textureY); // Box 38
		bodyModel[427] = new ModelRendererTurbo(this, 312, 258, textureX, textureY); // Box 38
		bodyModel[428] = new ModelRendererTurbo(this, 320, 276, textureX, textureY); // Box 38
		bodyModel[429] = new ModelRendererTurbo(this, 296, 269, textureX, textureY); // Box 38
		bodyModel[430] = new ModelRendererTurbo(this, 255, 269, textureX, textureY); // Box 38
		bodyModel[431] = new ModelRendererTurbo(this, 277, 258, textureX, textureY); // Box 38
		bodyModel[432] = new ModelRendererTurbo(this, 307, 285, textureX, textureY); // Box 38
		bodyModel[433] = new ModelRendererTurbo(this, 307, 281, textureX, textureY); // Box 38
		bodyModel[434] = new ModelRendererTurbo(this, 314, 280, textureX, textureY); // Box 38
		bodyModel[435] = new ModelRendererTurbo(this, 314, 275, textureX, textureY); // Box 38
		bodyModel[436] = new ModelRendererTurbo(this, 273, 242, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[437] = new ModelRendererTurbo(this, 176, 248, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[438] = new ModelRendererTurbo(this, 177, 242, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[439] = new ModelRendererTurbo(this, 177, 253, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[440] = new ModelRendererTurbo(this, 176, 237, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[441] = new ModelRendererTurbo(this, 179, 256, textureX, textureY); // Box 38
		bodyModel[442] = new ModelRendererTurbo(this, 179, 245, textureX, textureY); // Box 589
		bodyModel[443] = new ModelRendererTurbo(this, 194, 230, textureX, textureY); // Box 128
		bodyModel[444] = new ModelRendererTurbo(this, 198, 190, textureX, textureY); // Box 128
		bodyModel[445] = new ModelRendererTurbo(this, 200, 185, textureX, textureY); // Box 176
		bodyModel[446] = new ModelRendererTurbo(this, 196, 225, textureX, textureY); // Box 452
		bodyModel[447] = new ModelRendererTurbo(this, 311, 228, textureX, textureY); // Box 128
		bodyModel[448] = new ModelRendererTurbo(this, 311, 231, textureX, textureY); // Box 128
		bodyModel[449] = new ModelRendererTurbo(this, 313, 224, textureX, textureY); // Box 128
		bodyModel[450] = new ModelRendererTurbo(this, 311, 193, textureX, textureY); // Box 463
		bodyModel[451] = new ModelRendererTurbo(this, 311, 189, textureX, textureY); // Box 464
		bodyModel[452] = new ModelRendererTurbo(this, 313, 196, textureX, textureY); // Box 465
		bodyModel[453] = new ModelRendererTurbo(this, 370, 54, textureX, textureY); // Box 128
		bodyModel[454] = new ModelRendererTurbo(this, 370, 29, textureX, textureY); // Box 476
		bodyModel[455] = new ModelRendererTurbo(this, 398, 52, textureX, textureY); // Box 128
		bodyModel[456] = new ModelRendererTurbo(this, 358, 54, textureX, textureY); // Box 128
		bodyModel[457] = new ModelRendererTurbo(this, 362, 62, textureX, textureY); // Box 128
		bodyModel[458] = new ModelRendererTurbo(this, 364, 66, textureX, textureY); // Box 128
		bodyModel[459] = new ModelRendererTurbo(this, 364, 72, textureX, textureY); // Box 128
		bodyModel[460] = new ModelRendererTurbo(this, 362, 42, textureX, textureY); // Box 496
		bodyModel[461] = new ModelRendererTurbo(this, 364, 39, textureX, textureY); // Box 497
		bodyModel[462] = new ModelRendererTurbo(this, 364, 31, textureX, textureY); // Box 498
		bodyModel[463] = new ModelRendererTurbo(this, 382, 58, textureX, textureY); // Box 128
		bodyModel[464] = new ModelRendererTurbo(this, 391, 55, textureX, textureY); // Box 128
		bodyModel[465] = new ModelRendererTurbo(this, 405, 55, textureX, textureY); // Box 128
		bodyModel[466] = new ModelRendererTurbo(this, 381, 32, textureX, textureY); // Box 504
		bodyModel[467] = new ModelRendererTurbo(this, 388, 30, textureX, textureY); // Box 505
		bodyModel[468] = new ModelRendererTurbo(this, 395, 27, textureX, textureY); // Box 506
		bodyModel[469] = new ModelRendererTurbo(this, 346, 25, textureX, textureY); // Box 128
		bodyModel[470] = new ModelRendererTurbo(this, 372, 65, textureX, textureY); // Box 128
		bodyModel[471] = new ModelRendererTurbo(this, 364, 69, textureX, textureY); // Box 128
		bodyModel[472] = new ModelRendererTurbo(this, 364, 34, textureX, textureY); // Box 511
		bodyModel[473] = new ModelRendererTurbo(this, 353, 62, textureX, textureY); // Box 128
		bodyModel[474] = new ModelRendererTurbo(this, 353, 38, textureX, textureY); // Box 515
		bodyModel[475] = new ModelRendererTurbo(this, 381, 54, textureX, textureY); // Box 128
		bodyModel[476] = new ModelRendererTurbo(this, 388, 54, textureX, textureY); // Box 128
		bodyModel[477] = new ModelRendererTurbo(this, 371, 70, textureX, textureY); // Box 128
		bodyModel[478] = new ModelRendererTurbo(this, 378, 28, textureX, textureY); // Box 520
		bodyModel[479] = new ModelRendererTurbo(this, 385, 28, textureX, textureY); // Box 521
		bodyModel[480] = new ModelRendererTurbo(this, 371, 59, textureX, textureY); // Box 522
		bodyModel[481] = new ModelRendererTurbo(this, 462, 252, textureX, textureY); // Box 38
		bodyModel[482] = new ModelRendererTurbo(this, 462, 246, textureX, textureY); // Box 527
		bodyModel[483] = new ModelRendererTurbo(this, 485, 243, textureX, textureY); // Box 38
		bodyModel[484] = new ModelRendererTurbo(this, 476, 248, textureX, textureY); // Box 38
		bodyModel[485] = new ModelRendererTurbo(this, 476, 242, textureX, textureY); // Box 530
		bodyModel[486] = new ModelRendererTurbo(this, 469, 252, textureX, textureY); // Box 38
		bodyModel[487] = new ModelRendererTurbo(this, 469, 246, textureX, textureY); // Box 533
		bodyModel[488] = new ModelRendererTurbo(this, 276, 244, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[489] = new ModelRendererTurbo(this, 276, 238, textureX, textureY,"lamp"); // Box 536 glow
		bodyModel[490] = new ModelRendererTurbo(this, 367, 242, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[491] = new ModelRendererTurbo(this, 367, 238, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[492] = new ModelRendererTurbo(this, 367, 244, textureX, textureY,"lamp"); // Box 540 glow
		bodyModel[493] = new ModelRendererTurbo(this, 280, 240, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[494] = new ModelRendererTurbo(this, 289, 240, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[495] = new ModelRendererTurbo(this, 298, 240, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[496] = new ModelRendererTurbo(this, 307, 240, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[497] = new ModelRendererTurbo(this, 151, 366, textureX, textureY); // Box 38
		bodyModel[498] = new ModelRendererTurbo(this, 151, 339, textureX, textureY); // Box 540
		bodyModel[499] = new ModelRendererTurbo(this, 161, 345, textureX, textureY); // Box 38

		bodyModel[0].addBox(0F, 0F, 0F, 108, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-54.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(-59.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(-58.5F, 1F, -5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[3].setRotationPoint(57.5F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 3, 6, 0F); // Box 2
		bodyModel[4].setRotationPoint(54.5F, 3F, -3F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[5].setRotationPoint(-61.5F, 3F, -1.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[6].setRotationPoint(-59.5F, 3F, -5F);

		bodyModel[7].addBox(0F, 0F, 0F, 109, 1, 4, 0F); // Box 2
		bodyModel[7].setRotationPoint(-54.5F, 3F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[8].setRotationPoint(-58.51F, 3F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[9].setRotationPoint(-54.49F, 3F, -9F);

		bodyModel[10].addShapeBox(0F, 1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[10].setRotationPoint(-58.49F, 4F, -8F);

		bodyModel[11].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[11].setRotationPoint(-58.49F, 4F, -8F);

		bodyModel[12].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[12].setRotationPoint(-58.49F, 4F, -8F);

		bodyModel[13].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[13].setRotationPoint(-58.49F, 4F, -8F);

		bodyModel[14].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[14].setRotationPoint(-58.49F, 4F, -8F);

		bodyModel[15].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[15].setRotationPoint(-58.49F, 4F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[16].setRotationPoint(-58.49F, 4F, -8F);

		bodyModel[17].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[17].setRotationPoint(-58.49F, 4F, -8F);

		bodyModel[18].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[18].setRotationPoint(-54.51F, 4F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[19].setRotationPoint(-54.51F, 4F, -8F);

		bodyModel[20].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[20].setRotationPoint(-54.51F, 4F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[21].setRotationPoint(-58.49F, 4F, -8F);

		bodyModel[22].addShapeBox(0F, 2F, -2.5F, 4, 0, 4, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 1F, -0.5F, 0F, 1F, -0.5F); // Left step part
		bodyModel[22].setRotationPoint(-58.49F, 4F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 144
		bodyModel[23].setRotationPoint(-58.51F, 3F, 8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 145
		bodyModel[24].setRotationPoint(-54.49F, 3F, 8F);

		bodyModel[25].addShapeBox(0F, 1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[25].setRotationPoint(-58.49F, 4F, 8F);

		bodyModel[26].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[26].setRotationPoint(-58.49F, 4F, 8F);

		bodyModel[27].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[27].setRotationPoint(-58.49F, 4F, 8F);

		bodyModel[28].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[28].setRotationPoint(-58.49F, 4F, 8F);

		bodyModel[29].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[29].setRotationPoint(-58.49F, 4F, 8F);

		bodyModel[30].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[30].setRotationPoint(-58.49F, 4F, 8F);

		bodyModel[31].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[31].setRotationPoint(-58.49F, 4F, 8F);

		bodyModel[32].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[32].setRotationPoint(-58.49F, 4F, 8F);

		bodyModel[33].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[33].setRotationPoint(-54.51F, 4F, 8F);

		bodyModel[34].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[34].setRotationPoint(-54.51F, 4F, 8F);

		bodyModel[35].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[35].setRotationPoint(-54.51F, 4F, 8F);

		bodyModel[36].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[36].setRotationPoint(-58.49F, 4F, 8F);

		bodyModel[37].addShapeBox(0F, 2F, -1.5F, 4, 0, 4, 0F,0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[37].setRotationPoint(-58.49F, 4F, 8F);

		bodyModel[38].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[38].setRotationPoint(-54.5F, 1F, -10.99F);

		bodyModel[39].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[39].setRotationPoint(-54.5F, 1F, 4.99F);

		bodyModel[40].addBox(0F, 0F, 0F, 108, 16, 1, 0F); // Box 38
		bodyModel[40].setRotationPoint(-54.5F, -15F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 108, 16, 1, 0F); // Box 128
		bodyModel[41].setRotationPoint(-54.5F, -15F, 10F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[42].setRotationPoint(-54.5F, -15F, -10F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[43].setRotationPoint(-54.5F, -15F, 3F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[44].setRotationPoint(-59.5F, -15F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[45].setRotationPoint(-59.5F, -15F, 3F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[46].setRotationPoint(-54.5F, -15F, -3F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[47].setRotationPoint(-59.5F, -15F, -3F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[48].setRotationPoint(-58.5F, -15F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[49].setRotationPoint(-58.5F, -15F, 10F);

		bodyModel[50].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[50].setRotationPoint(-53.49F, -14F, -3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 113, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[51].setRotationPoint(-59.5F, -20F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 113, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[52].setRotationPoint(-59.5F, -19F, -10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 113, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[53].setRotationPoint(-59.5F, -20F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 113, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[54].setRotationPoint(-59.5F, -19F, 7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 113, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[55].setRotationPoint(-59.5F, -19F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 113, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[56].setRotationPoint(-59.5F, -19F, 3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 113, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[57].setRotationPoint(-59.5F, -16F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 113, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[58].setRotationPoint(-59.5F, -16F, 10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate closed
		bodyModel[59].setRotationPoint(-59.5F, -7F, -3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate open
		bodyModel[60].setRotationPoint(-59.5F, -7F, 2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[61].setRotationPoint(-59.5F, -17F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[62].setRotationPoint(-59.5F, -18F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 176
		bodyModel[63].setRotationPoint(-59.5F, -18F, 7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[64].setRotationPoint(-59.5F, -16.25F, -10F);

		bodyModel[65].addBox(0F, 0F, 0F, 113, 1, 14, 0F); // Box 128
		bodyModel[65].setRotationPoint(-59.5F, -18F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[66].setRotationPoint(-59.5F, 3F, 10.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[67].setRotationPoint(-59.5F, 4F, 10.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[68].setRotationPoint(-54.5F, 4F, 10.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[69].setRotationPoint(51.25F, 3F, 10.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[70].setRotationPoint(52F, 4F, 10.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[71].setRotationPoint(52.5F, 3F, 10.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[72].setRotationPoint(-52.25F, 3F, 10.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[73].setRotationPoint(-54F, 4F, 10.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[74].setRotationPoint(-59.5F, 3F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[75].setRotationPoint(-59.5F, 4F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[76].setRotationPoint(-54.5F, 4F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[77].setRotationPoint(51.25F, 3F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[78].setRotationPoint(52F, 4F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[79].setRotationPoint(52.5F, 3F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[80].setRotationPoint(-52.25F, 3F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[81].setRotationPoint(-54F, 4F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[82].setRotationPoint(-54.5F, 3F, 10.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[83].setRotationPoint(-54.5F, 3F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[84].setRotationPoint(-54.5F, 3F, -10.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[85].setRotationPoint(-54.5F, 4F, -10.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[86].setRotationPoint(-58.5F, 3F, -10.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[87].setRotationPoint(-58.5F, 4F, -10.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
		bodyModel[88].setRotationPoint(-54.5F, 3F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
		bodyModel[89].setRotationPoint(-54.5F, 4F, 8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[90].setRotationPoint(-58.5F, 3F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 143
		bodyModel[91].setRotationPoint(-58.5F, 4F, 8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[92].setRotationPoint(-61F, -15F, -4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[93].setRotationPoint(-61F, 1F, -4F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[94].setRotationPoint(-61F, -14F, -4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[95].setRotationPoint(-61F, -14F, 3F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[96].setRotationPoint(-61.5F, -14F, -5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[97].setRotationPoint(-61.5F, -14F, 3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[98].setRotationPoint(-61.5F, 1F, -5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[99].setRotationPoint(-61.5F, -15F, -5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 113, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[100].setRotationPoint(-59.5F, -20F, -3F);

		bodyModel[101].addBox(0F, 0F, 0F, 3, 2, 20, 0F); // Box 2
		bodyModel[101].setRotationPoint(53.5F, 1F, -10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[102].setRotationPoint(53.5F, 1F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 174
		bodyModel[103].setRotationPoint(53.5F, 1F, 10F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 2
		bodyModel[104].setRotationPoint(56.5F, 1F, -7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[105].setRotationPoint(56.5F, 1F, -10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 161
		bodyModel[106].setRotationPoint(56.5F, 1F, 7F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 2
		bodyModel[107].setRotationPoint(58.5F, 1F, -3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[108].setRotationPoint(58.5F, 1F, -7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[109].setRotationPoint(58.5F, 1F, 3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, -0.55F, 0F, 0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.55F, 0F, 0.85F, 0F, 0F, 0F); // Box 38
		bodyModel[110].setRotationPoint(53.5F, -15F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, -0.55F, 0F, 0.85F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0.85F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 175
		bodyModel[111].setRotationPoint(53.5F, -15F, 10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 16, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[112].setRotationPoint(58.5F, -15F, -3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,-0.3F, 0F, -0.55F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, -0.55F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[113].setRotationPoint(57.5F, -15F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,-0.55F, 0F, -0.15F, -0.45F, 0F, -3.15F, -1.15F, 0F, 2.7F, 0F, 0F, 0F, -0.55F, 0F, -0.15F, -0.45F, 0F, -3.15F, -1.15F, 0F, 2.7F, 0F, 0F, 0F); // Box 38
		bodyModel[114].setRotationPoint(55.95F, -15F, -10.15F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.55F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.55F); // Box 176
		bodyModel[115].setRotationPoint(57.5F, -15F, 3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, -1.15F, 0F, 2.7F, -0.45F, 0F, -3.15F, -0.55F, 0F, -0.15F, 0F, 0F, 0F, -1.15F, 0F, 2.7F, -0.45F, 0F, -3.15F, -0.55F, 0F, -0.15F); // Box 177
		bodyModel[116].setRotationPoint(55.95F, -15F, 9.15F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0.4F, 0F, 0F, -0.5F); // Box 31
		bodyModel[117].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, -3F, -1.4F, 0F, 2.3F, 0.25F, 0F, -0.6F, 0F, 0F, 0F, -1F, 0F, -3F, -1.4F, 0F, 2.3F, 0.25F, 0F, -0.6F); // Box 31
		bodyModel[118].setRotationPoint(56.5F, 3F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.9F, 0F, -0.3F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, -0.3F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[119].setRotationPoint(59F, 3F, -7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 239
		bodyModel[120].setRotationPoint(53.5F, 3F, 10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, 0F, -0.6F, -1.4F, 0F, 2.3F, -1F, 0F, -3F, 0F, 0F, 0F, 0.25F, 0F, -0.6F, -1.4F, 0F, 2.3F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 240
		bodyModel[121].setRotationPoint(56.5F, 3F, 9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.9F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.9F, 0F, -0.3F); // Box 241
		bodyModel[122].setRotationPoint(59F, 3F, 3F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -1.4F, -0.55F, 0F, 0.85F, 0F, 0F, 0F); // Box 31 cull
		bodyModel[123].setRotationPoint(53.5F, 4F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, -3F, -1.4F, 0F, 2.3F, 0.25F, 0F, -0.6F, 0.3F, 0F, -0.4F, -1.4F, 0F, -3.3F, -1.8F, 0F, 2.6F, 0.55F, 0F, -0.15F); // Box 31
		bodyModel[124].setRotationPoint(56.5F, 4F, -10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.9F, 0F, -0.3F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.3F, 0F, -0.6F, -1.9F, 0F, -0.3F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 2
		bodyModel[125].setRotationPoint(59F, 4F, -7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0.85F, -0.3F, 0F, -1.4F, 0F, 0F, -0.5F); // Box 245 cull
		bodyModel[126].setRotationPoint(53.5F, 4F, 10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.25F, 0F, -0.6F, -1.4F, 0F, 2.3F, -1F, 0F, -3F, 0F, 0F, 0F, 0.55F, 0F, -0.15F, -1.8F, 0F, 2.6F, -1.4F, 0F, -3.3F, 0.3F, 0F, -0.4F); // Box 246
		bodyModel[127].setRotationPoint(56.5F, 4F, 9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.9F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.9F, 0F, -0.3F, 1.3F, 0F, -0.6F); // Box 247
		bodyModel[128].setRotationPoint(59F, 4F, 3F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, -1F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, -1F, -0.35F, -0.3F); // Box 169
		bodyModel[129].setRotationPoint(57.5F, -20.07F, -0.35F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, -1F, -0.65F, -0.35F, -1F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, -1F, -0.35F, -0.35F); // Box 169
		bodyModel[130].setRotationPoint(57.5F, -20.07F, 0.35F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.38F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, -0.38F, -0.4F, -1F); // Box 169
		bodyModel[131].setRotationPoint(58.5F, -19.42F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, -1F, -0.35F, 0F); // Box 555
		bodyModel[132].setRotationPoint(57.5F, -20.07F, -1.35F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.38F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, -0.38F, -0.35F, -0.35F, -0.74F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, -0.38F, -0.65F, -0.35F); // Box 169
		bodyModel[133].setRotationPoint(58.5F, -19.17F, 0.35F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.34F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, -0.34F, -0.35F, 0F, -0.34F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, -0.74F, 0F, 0F); // Box 557
		bodyModel[134].setRotationPoint(58.5F, -19.17F, -1.35F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.38F, 0F, -0.3F, -0.74F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, -0.74F, -0.35F, -0.3F); // Box 169
		bodyModel[135].setRotationPoint(58.5F, -18.82F, -0.35F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 555 rear light
		bodyModel[136].setRotationPoint(59.51F, -20.07F, -0.35F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 555 rear light
		bodyModel[137].setRotationPoint(59.51F, -20.07F, 0.35F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F); // Box 555 rear light
		bodyModel[138].setRotationPoint(59.51F, -19.42F, -1F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 555 rear light
		bodyModel[139].setRotationPoint(59.51F, -20.07F, -1.35F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 555 rear light
		bodyModel[140].setRotationPoint(59.51F, -19.17F, 0.35F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555 rear light
		bodyModel[141].setRotationPoint(59.51F, -19.17F, -1.35F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 555 rear light
		bodyModel[142].setRotationPoint(59.51F, -18.82F, -0.35F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[143].setRotationPoint(-53.5F, -17F, -7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[144].setRotationPoint(-53.5F, -18F, -10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 176
		bodyModel[145].setRotationPoint(-53.5F, -18F, 7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[146].setRotationPoint(-53.5F, -16.25F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[147].setRotationPoint(-47.5F, -17F, -8.25F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 32, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[148].setRotationPoint(-47.5F, -16F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[149].setRotationPoint(-47.5F, -18F, -8.25F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[150].setRotationPoint(-47.5F, -17F, 5.25F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 32, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[151].setRotationPoint(-47.5F, -16F, 8F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[152].setRotationPoint(-47.5F, -18F, 7.25F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[153].setRotationPoint(-59F, -6F, -12F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[154].setRotationPoint(-54F, -6F, -12F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[155].setRotationPoint(-59F, -6F, 11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[156].setRotationPoint(-54F, -6F, 11F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, -1F, -0.55F, 1.25F, -0.15F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.55F, 0F, -0.15F, 0F, 0F, -1F); // Box 128
		bodyModel[157].setRotationPoint(53.5F, -16F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 1.25F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[158].setRotationPoint(58.5F, -16F, -3F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -1F, 0F, -1F, -1F, -3F, -1.7F, 1.25F, 1.55F, 0.55F, 1.25F, -1.15F, 0F, 0F, 0F, -1F, 0F, -3F, -1.7F, 0F, 1.55F, 0.55F, 0F, -1.15F); // Box 128
		bodyModel[159].setRotationPoint(56.5F, -16F, -10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.7F, 1.25F, -0.55F, -2F, -1F, 0F, -1F, -1F, 0F, 0F, 1.25F, 0F, 0.7F, 0F, -0.55F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[160].setRotationPoint(58.5F, -16F, -7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[161].setRotationPoint(56.5F, -19F, -3F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[162].setRotationPoint(53.5F, -20F, -3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -1F, 0F, -0.2F, -1F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[163].setRotationPoint(53.5F, -20F, -7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -1.75F, 0F, -0.55F, -1.75F, -0.85F, -2.2F, 0F, 0.35F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.55F, -0.25F, -0.85F, -2.2F, -0.25F, 0.35F, 0F, -0.25F, 0F); // Box 128
		bodyModel[164].setRotationPoint(53.5F, -19F, -10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0.75F, 0F, -1.15F, -0.7F, -1.75F, 0.45F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0.75F, -0.25F, -1.15F, -0.7F, -0.25F, 0.45F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[165].setRotationPoint(56.5F, -19F, -6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, -2F, -0.75F, -1F, -0.15F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.75F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[166].setRotationPoint(53.5F, -20F, -5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-1.65F, -1.75F, -0.5F, 0.5F, -1.75F, -3.2F, -1.55F, 0F, 1.8F, 0F, 0F, 0F, -1.65F, -0.25F, -0.5F, 0.5F, -0.25F, -3.2F, -1.55F, -0.25F, 1.8F, 0F, -0.25F, 0F); // Box 128
		bodyModel[167].setRotationPoint(54.3F, -19F, -9.65F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.8F, -1F, 0.65F, 1.25F, -1F, -1.15F, -1F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0.65F, 1.25F, 0F, -1.15F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[168].setRotationPoint(53.5F, -20F, -6F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 1.25F, -1F, -0.55F, 1.25F, -0.15F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, -0.55F, 0F, -0.15F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 471
		bodyModel[169].setRotationPoint(53.5F, -16F, 9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0.55F, 1.25F, -1.15F, -1.7F, 1.25F, 1.55F, -1F, -1F, -3F, 0F, -1F, 0F, 0.55F, 0F, -1.15F, -1.7F, 0F, 1.55F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 472
		bodyModel[170].setRotationPoint(56.5F, -16F, 8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 1.25F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 0.7F, 1.25F, -0.55F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0.7F, 0F, -0.55F); // Box 473
		bodyModel[171].setRotationPoint(58.5F, -16F, 3F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.55F, 0F, -0.85F, -2.2F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, -0.85F, -2.2F, 0F, 0.35F, 0F, 0F, 0F); // Box 128
		bodyModel[172].setRotationPoint(53.5F, -17.25F, -10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.2F, -1F, -0.35F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.35F, 0F, 0F, 0F); // Box 482
		bodyModel[173].setRotationPoint(53.5F, -20F, 3F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -2.2F, 0F, 0.35F, -0.55F, -1.75F, -0.85F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, -2.2F, -0.25F, 0.35F, -0.55F, -0.25F, -0.85F, 0F, -0.25F, 0F); // Box 483
		bodyModel[174].setRotationPoint(53.5F, -19F, 7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, -1.75F, 0.45F, 0.75F, 0F, -1.15F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.7F, -0.25F, 0.45F, 0.75F, -0.25F, -1.15F); // Box 484
		bodyModel[175].setRotationPoint(56.5F, -19F, 3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, -0.75F, -1F, -0.15F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.15F, 0F, 0F, -2F); // Box 485
		bodyModel[176].setRotationPoint(53.5F, -20F, 3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, -1.55F, 0F, 1.8F, 0.5F, -1.75F, -3.2F, -1.65F, -1.75F, -0.5F, 0F, -0.25F, 0F, -1.55F, -0.25F, 1.8F, 0.5F, -0.25F, -3.2F, -1.65F, -0.25F, -0.5F); // Box 486
		bodyModel[177].setRotationPoint(54.3F, -19F, 6.65F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, -1.15F, -0.8F, -1F, 0.65F, 0F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, -1.15F, -0.8F, 0F, 0.65F); // Box 487
		bodyModel[178].setRotationPoint(53.5F, -20F, 3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -2.2F, 0F, 0.35F, -0.55F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, -2.2F, 0F, 0.35F, -0.55F, 0F, -0.85F, 0F, 0F, 0F); // Box 489
		bodyModel[179].setRotationPoint(53.5F, -17.25F, 7F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F); // Box 128
		bodyModel[180].setRotationPoint(54.95F, -16.25F, -9.15F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.55F, 0F, -0.85F, -0.55F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.25F, 0F, -0.55F, 0.25F, -0.85F, -0.55F, 0.25F, -0.15F, 0F, 0.25F, -0.15F); // Box 128
		bodyModel[181].setRotationPoint(53.5F, -16.25F, -10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.15F, -0.55F, 0F, -0.15F, -0.55F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0.25F, -0.15F, -0.55F, 0.25F, -0.15F, -0.55F, 0.25F, -0.85F, 0F, 0.25F, 0F); // Box 494
		bodyModel[182].setRotationPoint(53.5F, -16.25F, 9F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, -0.1F, 0F, 0.25F, -0.1F); // Box 128
		bodyModel[183].setRotationPoint(55.95F, -16.25F, -6.45F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -0.15F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.25F, 0F, -2F, 0.25F, 0F, -0.15F, 0.25F, -0.3F, 0F, 0.25F, -0.3F); // Box 128
		bodyModel[184].setRotationPoint(55.95F, -16.25F, -9.15F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -0.3F, -0.15F, 0F, -0.3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.3F, -0.15F, 0.25F, -0.3F, -2F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 498
		bodyModel[185].setRotationPoint(55.95F, -16.25F, 6.15F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[186].setRotationPoint(57.8F, -16.25F, -3F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.3F, 0.25F, -0.55F, 0F, 0.25F, -0.55F); // Box 128
		bodyModel[187].setRotationPoint(57.8F, -16.25F, -6.45F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.55F, -0.3F, 0F, -0.55F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.55F, -0.3F, 0.25F, -0.55F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 501
		bodyModel[188].setRotationPoint(57.8F, -16.25F, 2.45F);

		bodyModel[189].addShapeBox(-4F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[189].setRotationPoint(-54.49F, -14F, -10.5F);

		bodyModel[190].addShapeBox(-4F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[190].setRotationPoint(-54.49F, -14F, 10.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[191].setRotationPoint(-59.5F, 3F, -10.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[192].setRotationPoint(-59.5F, 4F, -10.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[193].setRotationPoint(-59.5F, 3F, 4.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[194].setRotationPoint(-59.5F, 4F, 9.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[195].setRotationPoint(-59.5F, 5F, -10F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.06F, -0.4F, 0F, 0.06F, -0.4F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.06F, -0.4F, 0F, -1.06F, -0.4F); // Box 2
		bodyModel[196].setRotationPoint(-59.5F, 5.5F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 194
		bodyModel[197].setRotationPoint(-59.5F, 5F, 5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.06F, -0.4F, -0.5F, 0.06F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.06F, -0.4F, -0.5F, -1.06F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 195
		bodyModel[198].setRotationPoint(-59.5F, 5.5F, 9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[199].setRotationPoint(42F, 4F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[200].setRotationPoint(-44F, 4F, -1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[201].setRotationPoint(33.75F, 3F, 10.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[202].setRotationPoint(32F, 4F, 10.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[203].setRotationPoint(-34.75F, 3F, 10.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[204].setRotationPoint(-34F, 4F, 10.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 67, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[205].setRotationPoint(-33.5F, 3F, 10.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 65, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[206].setRotationPoint(-32.5F, 4F, 10.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[207].setRotationPoint(33.75F, 3F, -11F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[208].setRotationPoint(32F, 4F, -11F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[209].setRotationPoint(-34.75F, 3F, -11F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[210].setRotationPoint(-34F, 4F, -11F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 67, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[211].setRotationPoint(-33.5F, 3F, -11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 65, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[212].setRotationPoint(-32.5F, 4F, -11F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[213].setRotationPoint(-48.5F, -15F, 3F);

		bodyModel[214].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[214].setRotationPoint(-48.5F, -15F, -10F);

		bodyModel[215].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 38
		bodyModel[215].setRotationPoint(-53.5F, -15F, -4F);

		bodyModel[216].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 547
		bodyModel[216].setRotationPoint(-53.5F, -15F, 3F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // Box 379
		bodyModel[217].setRotationPoint(-49.5F, -8.5F, -10F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[218].setRotationPoint(-50.5F, -6F, -10F);

		bodyModel[219].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[219].setRotationPoint(-49.5F, -5F, -9F);
		bodyModel[219].rotateAngleY = -0.78539816F;

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 38 cull
		bodyModel[220].setRotationPoint(-49.5F, -2F, -8F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[221].setRotationPoint(-50.5F, -6F, 8F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -0.5F, -0.01F, -0.01F, -0.5F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 603
		bodyModel[222].setRotationPoint(-49.5F, -2F, 6F);

		bodyModel[223].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[223].setRotationPoint(-49.5F, -5F, 9F);
		bodyModel[223].rotateAngleY = -0.78539816F;

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[224].setRotationPoint(-53.45F, -2F, 8.55F);
		bodyModel[224].rotateAngleY = -0.78539816F;

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[225].setRotationPoint(-53.1F, -1F, 8.9F);
		bodyModel[225].rotateAngleY = -0.78539816F;

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[226].setRotationPoint(-53.45F, 0.5F, 8.55F);
		bodyModel[226].rotateAngleY = -0.78539816F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[227].setRotationPoint(-52F, -2F, -9.75F);
		bodyModel[227].rotateAngleY = 0.78539816F;

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[228].setRotationPoint(-52.35F, -1F, -9.4F);
		bodyModel[228].rotateAngleY = 0.78539816F;

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[229].setRotationPoint(-52F, 0.5F, -9.75F);
		bodyModel[229].rotateAngleY = 0.78539816F;

		bodyModel[230].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // Box 612
		bodyModel[230].setRotationPoint(-49.5F, -8.5F, 8F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[231].setRotationPoint(-29.5F, 3F, 3F);

		bodyModel[232].addBox(0F, 0F, 0F, 25, 4, 6, 0F); // Box 2
		bodyModel[232].setRotationPoint(-32.5F, 4F, -3F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 25, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[233].setRotationPoint(-32.5F, 8F, -3F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[234].setRotationPoint(-29.5F, 3F, -11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[235].setRotationPoint(25.5F, 4F, 0F);
		bodyModel[235].rotateAngleX = -0.78539816F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[236].setRotationPoint(25.49F, 4F, -0.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[237].setRotationPoint(31.51F, 4F, -0.5F);

		bodyModel[238].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 617
		bodyModel[238].setRotationPoint(-19.5F, 3F, 5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[239].setRotationPoint(-6.5F, 2.75F, 6.9F);
		bodyModel[239].rotateAngleX = -0.78539816F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[240].setRotationPoint(-6.51F, 3F, 6.4F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[241].setRotationPoint(0.51F, 3F, 6.4F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[242].setRotationPoint(-6.5F, 2.75F, 9.4F);
		bodyModel[242].rotateAngleX = -0.78539816F;

		bodyModel[243].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[243].setRotationPoint(-6.51F, 3F, 8.9F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[244].setRotationPoint(0.51F, 3F, 8.9F);

		bodyModel[245].addBox(0F, 0F, 0F, 9, 5, 5, 0F); // Box 624
		bodyModel[245].setRotationPoint(6.5F, 3F, 5F);

		bodyModel[246].addBox(0F, 0F, 0F, 3, 5, 5, 0F); // Box 628
		bodyModel[246].setRotationPoint(21.5F, 3F, 5F);

		bodyModel[247].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 606
		bodyModel[247].setRotationPoint(-18.5F, 3F, -10F);

		bodyModel[248].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 629
		bodyModel[248].setRotationPoint(-10.5F, 3F, -10F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 41
		bodyModel[249].setRotationPoint(-6.5F, 2.75F, -10F);
		bodyModel[249].rotateAngleZ = -0.78539816F;

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[250].setRotationPoint(-7F, 3F, -10.01F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[251].setRotationPoint(-7F, 3F, -5.99F);

		bodyModel[252].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 633
		bodyModel[252].setRotationPoint(-4.5F, 3F, -10F);

		bodyModel[253].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 612
		bodyModel[253].setRotationPoint(21.5F, 3F, -10F);

		bodyModel[254].addBox(0F, 0F, 0F, 87, 2, 0, 0F); // Box 128
		bodyModel[254].setRotationPoint(-45.5F, -22F, 0F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1.1F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -1F, -0.35F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, -0.5F, -2.25F, 0F); // Box 270
		bodyModel[255].setRotationPoint(-53.5F, -18F, -11F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, -0.5F, 0F, 0.15F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, -0.5F, -1F, 0.15F); // Box 271
		bodyModel[256].setRotationPoint(-53.5F, -18.5F, -10F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -1.1F, -0.75F, 0F, -0.5F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[257].setRotationPoint(-53.5F, -18F, 10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -1F, -0.85F, 0F, -0.5F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 128
		bodyModel[258].setRotationPoint(-53.5F, -18.5F, 8F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -1.1F, -0.75F, 0F, -0.5F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[259].setRotationPoint(-2.5F, -18F, 10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -1F, -0.85F, 0F, -0.5F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 128
		bodyModel[260].setRotationPoint(-2.5F, -18.5F, 8F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -1.1F, -0.75F, 0F, -0.5F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[261].setRotationPoint(37.5F, -18F, 10F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -1F, -0.85F, 0F, -0.5F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 128
		bodyModel[262].setRotationPoint(37.5F, -18.5F, 8F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[263].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[264].setRotationPoint(-61F, -15F, -11F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[265].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[266].setRotationPoint(-61F, -15F, -11F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[267].setRotationPoint(-61.5F, 1F, -10F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[268].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[269].setRotationPoint(-61F, -19F, -10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[270].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[271].setRotationPoint(-61F, -20F, -7F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[272].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[273].setRotationPoint(-61F, -20F, -3F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[274].setRotationPoint(-61.5F, -16F, -4F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[275].setRotationPoint(-61.5F, -16F, 1F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 128
		bodyModel[276].setRotationPoint(-61.5F, -19F, -1F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[277].setRotationPoint(-61.5F, -18.75F, -5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[278].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[279].setRotationPoint(-61F, -15F, 11F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[280].setRotationPoint(-61.5F, -16F, 9F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[281].setRotationPoint(-61F, -15F, 9F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[282].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[283].setRotationPoint(-61F, -19F, 7F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[284].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[285].setRotationPoint(-61F, -20F, 3F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[286].setRotationPoint(-61.5F, -18.75F, 4F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 128
		bodyModel[287].setRotationPoint(-61.5F, -15.8F, -1F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[288].setRotationPoint(-61.5F, -7F, -10F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[289].setRotationPoint(-61.5F, -7F, 5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[290].setRotationPoint(-61.5F, -16F, -5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[291].setRotationPoint(-61.5F, -16F, 4F);

		bodyModel[292].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[292].setRotationPoint(-15.5F, -15F, 3F);

		bodyModel[293].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[293].setRotationPoint(-15.5F, -15F, -10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[294].setRotationPoint(-43F, -17F, -0.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[295].setRotationPoint(-32.5F, -17F, -0.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[296].setRotationPoint(-22F, -17F, -0.5F);

		bodyModel[297].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Left seat part
		bodyModel[297].setRotationPoint(-23F, -5F, -6.4F);
		bodyModel[297].rotateAngleY = -4.71238898F;

		bodyModel[298].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Left seat part
		bodyModel[298].setRotationPoint(-23F, -5F, -6.4F);
		bodyModel[298].rotateAngleY = -4.71238898F;

		bodyModel[299].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[299].setRotationPoint(-23F, -3F, -6.4F);
		bodyModel[299].rotateAngleY = -4.71238898F;

		bodyModel[300].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Left seat part
		bodyModel[300].setRotationPoint(-23F, -4F, -6.4F);
		bodyModel[300].rotateAngleY = -4.71238898F;

		bodyModel[301].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[301].setRotationPoint(-23F, -5F, -6.4F);
		bodyModel[301].rotateAngleY = -4.71238898F;

		bodyModel[302].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Left seat part
		bodyModel[302].setRotationPoint(-23F, -4F, -6.4F);
		bodyModel[302].rotateAngleY = -4.71238898F;

		bodyModel[303].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[303].setRotationPoint(-23F, -5F, -6.4F);
		bodyModel[303].rotateAngleY = -4.71238898F;

		bodyModel[304].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[304].setRotationPoint(-23F, -1F, -6.4F);
		bodyModel[304].rotateAngleY = -3.92699082F;

		bodyModel[305].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[305].setRotationPoint(-31.5F, -5F, 6.4F);
		bodyModel[305].rotateAngleY = -1.57079633F;

		bodyModel[306].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[306].setRotationPoint(-31.5F, -5F, 6.4F);
		bodyModel[306].rotateAngleY = -1.57079633F;

		bodyModel[307].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[307].setRotationPoint(-31.5F, -3F, 6.4F);
		bodyModel[307].rotateAngleY = -1.57079633F;

		bodyModel[308].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[308].setRotationPoint(-31.5F, -4F, 6.4F);
		bodyModel[308].rotateAngleY = -1.57079633F;

		bodyModel[309].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[309].setRotationPoint(-31.5F, -5F, 6.4F);
		bodyModel[309].rotateAngleY = -1.57079633F;

		bodyModel[310].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[310].setRotationPoint(-31.5F, -4F, 6.4F);
		bodyModel[310].rotateAngleY = -1.57079633F;

		bodyModel[311].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[311].setRotationPoint(-31.5F, -5F, 6.4F);
		bodyModel[311].rotateAngleY = -1.57079633F;

		bodyModel[312].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[312].setRotationPoint(-31.5F, -1F, 6.4F);
		bodyModel[312].rotateAngleY = -0.78539816F;

		bodyModel[313].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Left seat part
		bodyModel[313].setRotationPoint(-40F, -5F, -6.4F);
		bodyModel[313].rotateAngleY = -4.71238898F;

		bodyModel[314].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Left seat part
		bodyModel[314].setRotationPoint(-40F, -5F, -6.4F);
		bodyModel[314].rotateAngleY = -4.71238898F;

		bodyModel[315].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[315].setRotationPoint(-40F, -3F, -6.4F);
		bodyModel[315].rotateAngleY = -4.71238898F;

		bodyModel[316].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Left seat part
		bodyModel[316].setRotationPoint(-40F, -4F, -6.4F);
		bodyModel[316].rotateAngleY = -4.71238898F;

		bodyModel[317].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[317].setRotationPoint(-40F, -5F, -6.4F);
		bodyModel[317].rotateAngleY = -4.71238898F;

		bodyModel[318].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Left seat part
		bodyModel[318].setRotationPoint(-40F, -4F, -6.4F);
		bodyModel[318].rotateAngleY = -4.71238898F;

		bodyModel[319].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[319].setRotationPoint(-40F, -5F, -6.4F);
		bodyModel[319].rotateAngleY = -4.71238898F;

		bodyModel[320].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[320].setRotationPoint(-40F, -1F, -6.4F);
		bodyModel[320].rotateAngleY = -3.92699082F;

		bodyModel[321].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Left seat part
		bodyModel[321].setRotationPoint(-31.5F, -5F, -6.4F);
		bodyModel[321].rotateAngleY = -4.71238898F;

		bodyModel[322].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Left seat part
		bodyModel[322].setRotationPoint(-31.5F, -5F, -6.4F);
		bodyModel[322].rotateAngleY = -4.71238898F;

		bodyModel[323].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[323].setRotationPoint(-31.5F, -3F, -6.4F);
		bodyModel[323].rotateAngleY = -4.71238898F;

		bodyModel[324].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Left seat part
		bodyModel[324].setRotationPoint(-31.5F, -4F, -6.4F);
		bodyModel[324].rotateAngleY = -4.71238898F;

		bodyModel[325].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[325].setRotationPoint(-31.5F, -5F, -6.4F);
		bodyModel[325].rotateAngleY = -4.71238898F;

		bodyModel[326].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Left seat part
		bodyModel[326].setRotationPoint(-31.5F, -4F, -6.4F);
		bodyModel[326].rotateAngleY = -4.71238898F;

		bodyModel[327].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[327].setRotationPoint(-31.5F, -5F, -6.4F);
		bodyModel[327].rotateAngleY = -4.71238898F;

		bodyModel[328].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[328].setRotationPoint(-31.5F, -1F, -6.4F);
		bodyModel[328].rotateAngleY = -3.92699082F;

		bodyModel[329].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[329].setRotationPoint(-40F, -5F, 6.4F);
		bodyModel[329].rotateAngleY = -1.57079633F;

		bodyModel[330].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[330].setRotationPoint(-40F, -5F, 6.4F);
		bodyModel[330].rotateAngleY = -1.57079633F;

		bodyModel[331].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[331].setRotationPoint(-40F, -3F, 6.4F);
		bodyModel[331].rotateAngleY = -1.57079633F;

		bodyModel[332].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[332].setRotationPoint(-40F, -8F, 6.4F);
		bodyModel[332].rotateAngleY = -1.57079633F;

		bodyModel[333].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[333].setRotationPoint(-40F, -4F, 6.4F);
		bodyModel[333].rotateAngleY = -1.57079633F;

		bodyModel[334].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[334].setRotationPoint(-40F, -5F, 6.4F);
		bodyModel[334].rotateAngleY = -1.57079633F;

		bodyModel[335].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[335].setRotationPoint(-40F, -4F, 6.4F);
		bodyModel[335].rotateAngleY = -1.57079633F;

		bodyModel[336].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[336].setRotationPoint(-40F, -5F, 6.4F);
		bodyModel[336].rotateAngleY = -1.57079633F;

		bodyModel[337].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[337].setRotationPoint(-40F, -1F, 6.4F);
		bodyModel[337].rotateAngleY = -0.78539816F;

		bodyModel[338].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[338].setRotationPoint(-40F, -4F, 6.4F);
		bodyModel[338].rotateAngleY = -1.57079633F;

		bodyModel[339].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[339].setRotationPoint(-40F, -4.5F, 6.4F);
		bodyModel[339].rotateAngleY = -1.57079633F;

		bodyModel[340].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[340].setRotationPoint(-40F, -4.5F, 6.4F);
		bodyModel[340].rotateAngleY = -1.57079633F;

		bodyModel[341].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[341].setRotationPoint(-40F, -1.5F, 6.4F);
		bodyModel[341].rotateAngleY = -1.57079633F;

		bodyModel[342].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[342].setRotationPoint(-31.5F, -8F, 6.4F);
		bodyModel[342].rotateAngleY = -1.57079633F;

		bodyModel[343].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[343].setRotationPoint(-31.5F, -4F, 6.4F);
		bodyModel[343].rotateAngleY = -1.57079633F;

		bodyModel[344].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[344].setRotationPoint(-31.5F, -4.5F, 6.4F);
		bodyModel[344].rotateAngleY = -1.57079633F;

		bodyModel[345].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[345].setRotationPoint(-31.5F, -4.5F, 6.4F);
		bodyModel[345].rotateAngleY = -1.57079633F;

		bodyModel[346].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[346].setRotationPoint(-31.5F, -1.5F, 6.4F);
		bodyModel[346].rotateAngleY = -1.57079633F;

		bodyModel[347].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Left seat part
		bodyModel[347].setRotationPoint(-40F, -8F, -6.4F);
		bodyModel[347].rotateAngleY = -4.71238898F;

		bodyModel[348].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[348].setRotationPoint(-40F, -4F, -6.4F);
		bodyModel[348].rotateAngleY = -4.71238898F;

		bodyModel[349].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[349].setRotationPoint(-40F, -4.5F, -6.4F);
		bodyModel[349].rotateAngleY = -4.71238898F;

		bodyModel[350].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[350].setRotationPoint(-40F, -4.5F, -6.4F);
		bodyModel[350].rotateAngleY = -4.71238898F;

		bodyModel[351].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Left seat part
		bodyModel[351].setRotationPoint(-40F, -1.5F, -6.4F);
		bodyModel[351].rotateAngleY = -4.71238898F;

		bodyModel[352].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[352].setRotationPoint(-31.5F, -4.5F, -6.4F);
		bodyModel[352].rotateAngleY = -4.71238898F;

		bodyModel[353].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[353].setRotationPoint(-31.5F, -4.5F, -6.4F);
		bodyModel[353].rotateAngleY = -4.71238898F;

		bodyModel[354].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Left seat part
		bodyModel[354].setRotationPoint(-31.5F, -1.5F, -6.4F);
		bodyModel[354].rotateAngleY = -4.71238898F;

		bodyModel[355].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[355].setRotationPoint(-23F, -4.5F, -6.4F);
		bodyModel[355].rotateAngleY = -4.71238898F;

		bodyModel[356].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[356].setRotationPoint(-23F, -4.5F, -6.4F);
		bodyModel[356].rotateAngleY = -4.71238898F;

		bodyModel[357].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Left seat part
		bodyModel[357].setRotationPoint(-23F, -1.5F, -6.4F);
		bodyModel[357].rotateAngleY = -4.71238898F;

		bodyModel[358].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Left seat part
		bodyModel[358].setRotationPoint(-31.5F, -8F, -6.4F);
		bodyModel[358].rotateAngleY = -4.71238898F;

		bodyModel[359].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[359].setRotationPoint(-31.5F, -4F, -6.4F);
		bodyModel[359].rotateAngleY = -4.71238898F;

		bodyModel[360].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Left seat part
		bodyModel[360].setRotationPoint(-23F, -8F, -6.4F);
		bodyModel[360].rotateAngleY = -4.71238898F;

		bodyModel[361].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[361].setRotationPoint(-23F, -4F, -6.4F);
		bodyModel[361].rotateAngleY = -4.71238898F;

		bodyModel[362].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[362].setRotationPoint(-23F, -5F, 6.4F);
		bodyModel[362].rotateAngleY = -1.57079633F;

		bodyModel[363].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[363].setRotationPoint(-23F, -5F, 6.4F);
		bodyModel[363].rotateAngleY = -1.57079633F;

		bodyModel[364].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[364].setRotationPoint(-23F, -3F, 6.4F);
		bodyModel[364].rotateAngleY = -1.57079633F;

		bodyModel[365].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[365].setRotationPoint(-23F, -4F, 6.4F);
		bodyModel[365].rotateAngleY = -1.57079633F;

		bodyModel[366].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[366].setRotationPoint(-23F, -5F, 6.4F);
		bodyModel[366].rotateAngleY = -1.57079633F;

		bodyModel[367].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[367].setRotationPoint(-23F, -4F, 6.4F);
		bodyModel[367].rotateAngleY = -1.57079633F;

		bodyModel[368].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[368].setRotationPoint(-23F, -5F, 6.4F);
		bodyModel[368].rotateAngleY = -1.57079633F;

		bodyModel[369].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[369].setRotationPoint(-23F, -1F, 6.4F);
		bodyModel[369].rotateAngleY = -0.78539816F;

		bodyModel[370].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[370].setRotationPoint(-23F, -8F, 6.4F);
		bodyModel[370].rotateAngleY = -1.57079633F;

		bodyModel[371].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[371].setRotationPoint(-23F, -4F, 6.4F);
		bodyModel[371].rotateAngleY = -1.57079633F;

		bodyModel[372].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[372].setRotationPoint(-23F, -4.5F, 6.4F);
		bodyModel[372].rotateAngleY = -1.57079633F;

		bodyModel[373].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[373].setRotationPoint(-23F, -4.5F, 6.4F);
		bodyModel[373].rotateAngleY = -1.57079633F;

		bodyModel[374].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[374].setRotationPoint(-23F, -1.5F, 6.4F);
		bodyModel[374].rotateAngleY = -1.57079633F;

		bodyModel[375].addBox(0F, 0F, 0F, 2, 16, 7, 0F); // Box 38
		bodyModel[375].setRotationPoint(-11.5F, -15F, -10F);

		bodyModel[376].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 38
		bodyModel[376].setRotationPoint(-14.5F, -11F, -10F);

		bodyModel[377].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 38
		bodyModel[377].setRotationPoint(-14.5F, -5F, -10F);

		bodyModel[378].addBox(0F, 0F, 0F, 5, 16, 7, 0F); // Box 397
		bodyModel[378].setRotationPoint(-11.5F, -15F, 3F);

		bodyModel[379].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 398
		bodyModel[379].setRotationPoint(-14.5F, -11F, 3F);

		bodyModel[380].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 399
		bodyModel[380].setRotationPoint(-14.5F, -5F, 3F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[381].setRotationPoint(-6.5F, -15F, -5F);

		bodyModel[382].addBox(0F, 0F, 0F, 1, 16, 14, 0F); // Box 38
		bodyModel[382].setRotationPoint(-6.5F, -15F, -4F);

		bodyModel[383].addBox(0F, 0F, 0F, 1, 9, 13, 0F); // Box 38
		bodyModel[383].setRotationPoint(3.5F, -8F, -3F);

		bodyModel[384].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 38
		bodyModel[384].setRotationPoint(-5.5F, -15F, -5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[385].setRotationPoint(3.5F, -15F, -5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 20, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[386].setRotationPoint(-15.5F, -17F, -7F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[387].setRotationPoint(-15.5F, -18F, -10F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 176
		bodyModel[388].setRotationPoint(-15.5F, -18F, 7F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 20, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[389].setRotationPoint(-15.5F, -16.25F, -10F);

		bodyModel[390].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[390].setRotationPoint(-11.5F, -14.99F, -0.5F);

		bodyModel[391].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[391].setRotationPoint(-51F, -14.99F, -0.5F);

		bodyModel[392].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[392].setRotationPoint(-2F, -14.99F, -8F);

		bodyModel[393].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 38
		bodyModel[393].setRotationPoint(-6.51F, -13F, -2.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 107, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[394].setRotationPoint(-53.5F, -11F, -9.9F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 38, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[395].setRotationPoint(-53.5F, -11F, 9.9F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 49, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[396].setRotationPoint(4.5F, -11F, 9.9F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[397].setRotationPoint(59.5F, -3F, -2F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 tailsign glow
		bodyModel[398].setRotationPoint(60.01F, -3F, -2F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[399].setRotationPoint(51.5F, -4.5F, -12F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[400].setRotationPoint(51.5F, -4.5F, 11F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[401].setRotationPoint(51.5F, -1F, -12F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[402].setRotationPoint(51.5F, -1F, 11F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 169
		bodyModel[403].setRotationPoint(50.25F, -13F, 11F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, 0F, 0F, -1F); // Box 169 marker lens LF
		bodyModel[404].setRotationPoint(51.25F, -13F, 11F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, -0.5F, -1F); // Box 169 marker lens LR
		bodyModel[405].setRotationPoint(50F, -13F, 11F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 548
		bodyModel[406].setRotationPoint(50.25F, -13F, -12F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 549 marker lens RF
		bodyModel[407].setRotationPoint(51.25F, -13F, -12F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 547 marker lens LR
		bodyModel[408].setRotationPoint(50F, -13F, -12F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, 0F, 0F, -1F); // Box 169
		bodyModel[409].setRotationPoint(51.25F, -13F, 11F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, -0.5F, -1F); // Box 169
		bodyModel[410].setRotationPoint(50F, -13F, 11F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 549
		bodyModel[411].setRotationPoint(51.25F, -13F, -12F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 547
		bodyModel[412].setRotationPoint(50F, -13F, -12F);

		bodyModel[413].addShapeBox(0F, 0F, -1F, 2, 0, 1, 0F,0.175F, 0F, -0.005F, 0.11F, 0F, 0F, 0.11F, 0F, 0F, 0F, 0F, 0F, 0.175F, 0F, -0.005F, 0.11F, 0F, 0F, 0.11F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[413].setRotationPoint(53.5F, -4.5F, -11F);
		bodyModel[413].rotateAngleY = 0.32288591F;

		bodyModel[414].addShapeBox(0F, 0F, -1F, 2, 0, 1, 0F,0.175F, 0F, -0.005F, 0.11F, 0F, 0F, 0.11F, 0F, 0F, 0F, 0F, 0F, 0.175F, 0F, -0.005F, 0.11F, 0F, 0F, 0.11F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[414].setRotationPoint(53.5F, -1F, -11F);
		bodyModel[414].rotateAngleY = 0.32288591F;

		bodyModel[415].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0.11F, 0F, 0F, 0.11F, 0F, 0F, 0.175F, 0F, -0.005F, 0F, 0F, 0F, 0.11F, 0F, 0F, 0.11F, 0F, 0F, 0.175F, 0F, -0.005F); // Box 204
		bodyModel[415].setRotationPoint(53.5F, -4.5F, 11F);
		bodyModel[415].rotateAngleY = -0.32288591F;

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0.11F, 0F, 0F, 0.11F, 0F, 0F, 0.175F, 0F, -0.005F, 0F, 0F, 0F, 0.11F, 0F, 0F, 0.11F, 0F, 0F, 0.175F, 0F, -0.005F); // Box 204
		bodyModel[416].setRotationPoint(53.5F, -1F, 11F);
		bodyModel[416].rotateAngleY = -0.32288591F;

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[417].setRotationPoint(59.5F, 1F, -3F);

		bodyModel[418].addBox(0F, 0F, 0F, 2, 7, 13, 0F); // Box 38
		bodyModel[418].setRotationPoint(1.5F, -6F, -3F);

		bodyModel[419].addBox(0F, 0F, 0F, 1, 0, 13, 0F); // Box 38
		bodyModel[419].setRotationPoint(2.5F, -8F, -3F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[420].setRotationPoint(2.5F, -8F, -4F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[421].setRotationPoint(1.5F, -6F, -4F);

		bodyModel[422].addBox(0F, 0F, 0F, 1, 3, 13, 0F); // Box 38
		bodyModel[422].setRotationPoint(3.5F, -15F, -3F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[423].setRotationPoint(3.5F, -12F, -2F);

		bodyModel[424].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 38
		bodyModel[424].setRotationPoint(3.5F, -12F, 7F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[425].setRotationPoint(3.5F, -12F, 6F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[426].setRotationPoint(3.5F, -12F, -3F);

		bodyModel[427].addBox(0F, 0F, 0F, 1, 3, 13, 0F); // Box 38
		bodyModel[427].setRotationPoint(2.5F, -15F, -3F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[428].setRotationPoint(2.5F, -15F, -4F);

		bodyModel[429].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 38
		bodyModel[429].setRotationPoint(-2.5F, -12F, 8F);

		bodyModel[430].addBox(0F, 0F, 0F, 4, 9, 14, 0F); // Box 38
		bodyModel[430].setRotationPoint(-5.5F, -8F, -4F);

		bodyModel[431].addBox(0F, 0F, 0F, 3, 9, 14, 0F); // Box 38
		bodyModel[431].setRotationPoint(-5.5F, -15F, -4F);

		bodyModel[432].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 38
		bodyModel[432].setRotationPoint(2.5F, -9.25F, 7F);

		bodyModel[433].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 38
		bodyModel[433].setRotationPoint(2.5F, -10.75F, 7F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[434].setRotationPoint(2.5F, -9.25F, -4F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[435].setRotationPoint(2.5F, -10.75F, -4F);

		bodyModel[436].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[436].setRotationPoint(-1F, -14.99F, 2.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F,-0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 275 cull
		bodyModel[437].setRotationPoint(-47.5F, -14F, -10F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 32, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38 glow
		bodyModel[438].setRotationPoint(-47.5F, -12.99F, 7.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 32, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38 glow
		bodyModel[439].setRotationPoint(-47.5F, -12.99F, -9.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38 cull
		bodyModel[440].setRotationPoint(-47.5F, -14F, 7F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 32, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38
		bodyModel[441].setRotationPoint(-47.5F, -13.99F, -9.99F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 32, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 589
		bodyModel[442].setRotationPoint(-47.5F, -13.99F, 9.99F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 13, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[443].setRotationPoint(41F, -17F, -10F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 13, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[444].setRotationPoint(41F, -17F, 6F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.28F, 0F, -1F, -0.28F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.28F, 0F, -1F, -0.28F); // Box 176
		bodyModel[445].setRotationPoint(41F, -18F, 7F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, -1F, -0.28F, -0.5F, -1F, -0.28F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.28F, -0.5F, -1F, -0.28F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 452
		bodyModel[446].setRotationPoint(41F, -18F, -9F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 128
		bodyModel[447].setRotationPoint(41F, -17F, -6F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 128
		bodyModel[448].setRotationPoint(41F, -16.5F, -6F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.375F, -0.125F, -0.5F, -0.375F, -0.125F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 128
		bodyModel[449].setRotationPoint(41F, -17F, -5.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 463
		bodyModel[450].setRotationPoint(41F, -17F, 5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, -0.125F, -0.375F, -0.5F, -0.125F, -0.375F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 464
		bodyModel[451].setRotationPoint(41F, -16.5F, 5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.375F, -0.125F, 0F, -0.375F, -0.125F); // Box 465
		bodyModel[452].setRotationPoint(41F, -17F, 3.5F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, -0.55F, 0.25F, 0F, -0.55F, 0.25F, 0.15F, 0F, 0.25F, 0.15F); // Box 128
		bodyModel[453].setRotationPoint(53.5F, -16.25F, -9.15F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0.15F, -0.55F, 0F, 0.15F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.15F, -0.55F, 0.25F, 0.15F, -0.55F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 476
		bodyModel[454].setRotationPoint(53.5F, -16.25F, 6.15F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.375F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.375F, -0.125F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 128
		bodyModel[455].setRotationPoint(53.95F, -16.5F, -2F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.45F, -0.25F, 0F); // Box 128
		bodyModel[456].setRotationPoint(54.5F, -17F, -3F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.45F, 0F, -0.81F, -0.75F, 0F, -0.15F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.25F, -0.81F, -0.75F, -0.25F, -0.15F, 0F, -0.25F, 0F, -0.45F, -0.25F, 0F); // Box 128
		bodyModel[457].setRotationPoint(54.5F, -17F, -5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, -0.99F, -1F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, -0.25F, 0F, -0.2F, -0.25F, -0.99F, -1F, -0.25F, 0.65F, 0F, -0.25F, 0.65F); // Box 128
		bodyModel[458].setRotationPoint(54.95F, -17F, -5.84F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, -0.35F, 0.325F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.2F, -0.25F, -0.35F, 0.325F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[459].setRotationPoint(53.5F, -17F, -7F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.45F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.15F, -0.45F, 0F, -0.81F, -0.45F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, -0.15F, -0.45F, -0.25F, -0.81F); // Box 496
		bodyModel[460].setRotationPoint(54.5F, -17F, 3F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.65F, -1F, 0F, 0.65F, -0.2F, 0F, -0.99F, 0F, 0F, 0F, 0F, -0.25F, 0.65F, -1F, -0.25F, 0.65F, -0.2F, -0.25F, -0.99F, 0F, -0.25F, 0F); // Box 497
		bodyModel[461].setRotationPoint(54.95F, -17F, 4.84F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.325F, 0F, 0F, -0.2F, 0F, -0.35F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.325F, -0.25F, 0F, -0.2F, -0.25F, -0.35F, 0F, -0.25F, 0F); // Box 498
		bodyModel[462].setRotationPoint(53.5F, -17F, 6F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -1F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 128
		bodyModel[463].setRotationPoint(53.5F, -16.5F, -6F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.45F, -0.125F, -0.625F, -0.95F, -0.125F, 0F, 0F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.05F, -0.5F, 0F, -0.95F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 128
		bodyModel[464].setRotationPoint(53.95F, -16.5F, -6F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.05F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -1F, -0.125F, 0F, -0.05F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 128
		bodyModel[465].setRotationPoint(53.95F, -16.5F, -6F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.125F, -0.375F, -1F, -0.125F, -0.375F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 504
		bodyModel[466].setRotationPoint(53.5F, -16.5F, 5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.375F, -0.125F, 0.25F, 0F, -0.125F, 0F, -0.95F, -0.125F, 0F, 0.45F, -0.125F, -0.625F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, -0.5F, 0F, -0.05F, -0.5F, 0F); // Box 505
		bodyModel[467].setRotationPoint(53.95F, -16.5F, 2F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.05F, -0.125F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.05F, -0.5F, 0F); // Box 506
		bodyModel[468].setRotationPoint(53.95F, -16.5F, 2F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.375F, -0.375F, 0F); // Box 128
		bodyModel[469].setRotationPoint(53.95F, -17F, -6F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, 0F, -0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, -0.25F, -0.125F, -0.375F, 0.25F, -0.125F, -0.375F, 0.25F, -0.5F, -1F, -0.25F); // Box 128
		bodyModel[470].setRotationPoint(52.45F, -17F, -1.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.375F, 0F, -0.175F, -0.375F, 0F, -0.175F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 128
		bodyModel[471].setRotationPoint(53.5F, -17F, -6F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.375F, -0.175F, 0F, -0.375F, -0.175F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.375F, -0.175F, -0.375F, -0.375F, -0.175F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 511
		bodyModel[472].setRotationPoint(53.5F, -17F, 5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.45F, 0F, -0.375F, -0.625F, 0F, -0.375F, -0.625F, 0F, 0F, -0.375F, 0F, 0F, 0.45F, -0.375F, -0.375F, -0.625F, -0.375F, -0.375F, -0.625F, -0.375F, 0F, -0.375F, -0.375F, 0F); // Box 128
		bodyModel[473].setRotationPoint(53.95F, -17F, -5.75F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.375F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.375F, 0.45F, 0F, -0.375F, -0.375F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.375F, 0.45F, -0.375F, -0.375F); // Box 515
		bodyModel[474].setRotationPoint(53.95F, -17F, 1.75F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.125F, -0.1F, 0F, -0.125F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.375F, -0.125F, -0.1F, -0.375F, -0.125F, -0.1F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 128
		bodyModel[475].setRotationPoint(51.5F, -17F, -5.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.125F, 0.1F, 0F, -0.125F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -1F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 128
		bodyModel[476].setRotationPoint(52.4F, -17F, -5.5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.9F, 0F, -1.5F, 0F, 0F, -0.125F, 0.825F, 0F, -0.25F, -1.45F, 0F, 0.25F, -0.9F, -1F, -1.5F, 0F, -0.375F, -0.125F, 0.825F, -0.375F, -0.25F, -1.45F, -1F, 0.25F); // Box 128
		bodyModel[477].setRotationPoint(51.5F, -17F, -5.5F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -1F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, -0.375F, -0.125F, 0F, -0.375F, -0.125F); // Box 520
		bodyModel[478].setRotationPoint(51.5F, -17F, 3.5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -1F, -0.5F, -1F, -1F, -0.5F, 0.1F, -0.375F, -0.125F, 0F, -0.375F, -0.125F); // Box 521
		bodyModel[479].setRotationPoint(52.4F, -17F, 3.5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1.45F, 0F, 0.25F, 0.825F, 0F, -0.25F, 0F, 0F, -0.125F, -0.9F, 0F, -1.5F, -1.45F, -1F, 0.25F, 0.825F, -0.375F, -0.25F, 0F, -0.375F, -0.125F, -0.9F, -1F, -1.5F); // Box 522
		bodyModel[480].setRotationPoint(51.5F, -17F, 1.5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 3, 5, 0, 0F,0F, 0F, 0F, -0.465F, 0F, 0F, -0.465F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.465F, 0F, 0F, -0.465F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[481].setRotationPoint(53.5F, -11F, -9.9F);
		bodyModel[481].rotateAngleY = 0.33161256F;

		bodyModel[482].addShapeBox(0F, 0F, 0F, 3, 5, 0, 0F,0F, 0F, 0F, -0.465F, 0F, 0F, -0.465F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.465F, 0F, 0F, -0.465F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[482].setRotationPoint(53.5F, -11F, 9.9F);
		bodyModel[482].rotateAngleY = -0.33161256F;

		bodyModel[483].addShapeBox(0F, 0F, 0F, 0, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[483].setRotationPoint(58.4F, -11F, -3F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 0, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 38
		bodyModel[484].setRotationPoint(57.72F, -11F, -6.37F);
		bodyModel[484].rotateAngleY = -0.19896753F;

		bodyModel[485].addShapeBox(0F, 0F, 0F, 0, 5, 4, 0F,0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[485].setRotationPoint(58.51F, -11F, 2.46F);
		bodyModel[485].rotateAngleY = 0.19896753F;

		bodyModel[486].addShapeBox(0F, 0F, 0F, 3, 5, 0, 0F,0.005F, 0F, 0F, 0.255F, 0F, 0F, 0.255F, 0F, 0F, 0.005F, 0F, 0F, 0.005F, 0F, 0F, 0.255F, 0F, 0F, 0.255F, 0F, 0F, 0.005F, 0F, 0F); // Box 38
		bodyModel[486].setRotationPoint(55.9F, -11F, -9.07F);
		bodyModel[486].rotateAngleY = 0.97738438F;

		bodyModel[487].addShapeBox(0F, 0F, 0F, 3, 5, 0, 0F,0.005F, 0F, 0F, 0.255F, 0F, 0F, 0.255F, 0F, 0F, 0.005F, 0F, 0F, 0.005F, 0F, 0F, 0.255F, 0F, 0F, 0.255F, 0F, 0F, 0.005F, 0F, 0F); // Box 533
		bodyModel[487].setRotationPoint(55.9F, -11F, 9.07F);
		bodyModel[487].rotateAngleY = -0.97738438F;

		bodyModel[488].addBox(0F, 0F, 0F, 10, 0, 1, 0F); // Box 384 glow
		bodyModel[488].setRotationPoint(41F, -14.99F, -8.5F);

		bodyModel[489].addBox(0F, 0F, 0F, 10, 0, 1, 0F); // Box 536 glow
		bodyModel[489].setRotationPoint(42F, -14.99F, 7.5F);

		bodyModel[490].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[490].setRotationPoint(56.25F, -14.99F, -0.5F);

		bodyModel[491].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[491].setRotationPoint(55.25F, -14.99F, -7F);

		bodyModel[492].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 540 glow
		bodyModel[492].setRotationPoint(55.25F, -14.99F, 6F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[493].setRotationPoint(14.5F, -17F, -1F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[494].setRotationPoint(24.5F, -17F, -1F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[495].setRotationPoint(34.5F, -17F, -1F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[496].setRotationPoint(44.5F, -17F, -1F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[497].setRotationPoint(40.5F, -6F, -10F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[498].setRotationPoint(40.5F, -6F, 3F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 0, 18, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -5F, 0F, -9F, -5F); // Box 38
		bodyModel[499].setRotationPoint(41F, -15F, -10F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 161, 318, textureX, textureY); // Box 598
		bodyModel[501] = new ModelRendererTurbo(this, 462, 347, textureX, textureY); // Right seat part
		bodyModel[502] = new ModelRendererTurbo(this, 464, 351, textureX, textureY); // Right seat part
		bodyModel[503] = new ModelRendererTurbo(this, 462, 359, textureX, textureY); // Right seat part
		bodyModel[504] = new ModelRendererTurbo(this, 462, 371, textureX, textureY); // Right seat part
		bodyModel[505] = new ModelRendererTurbo(this, 464, 375, textureX, textureY); // Right seat part
		bodyModel[506] = new ModelRendererTurbo(this, 462, 383, textureX, textureY); // Right seat part
		bodyModel[507] = new ModelRendererTurbo(this, 438, 46, textureX, textureY); // Box 128
		bodyModel[508] = new ModelRendererTurbo(this, 442, 48, textureX, textureY); // Box 128
		bodyModel[509] = new ModelRendererTurbo(this, 438, 52, textureX, textureY); // Box 128
		bodyModel[510] = new ModelRendererTurbo(this, 442, 54, textureX, textureY); // Box 128
		bodyModel[511] = new ModelRendererTurbo(this, 438, 58, textureX, textureY); // Box 128
		bodyModel[512] = new ModelRendererTurbo(this, 442, 60, textureX, textureY); // Box 128
		bodyModel[513] = new ModelRendererTurbo(this, 438, 64, textureX, textureY); // Box 128
		bodyModel[514] = new ModelRendererTurbo(this, 442, 66, textureX, textureY); // Box 128
		bodyModel[515] = new ModelRendererTurbo(this, 442, 42, textureX, textureY); // Box 620
		bodyModel[516] = new ModelRendererTurbo(this, 441, 36, textureX, textureY); // Box 622
		bodyModel[517] = new ModelRendererTurbo(this, 454, 49, textureX, textureY); // Box 128
		bodyModel[518] = new ModelRendererTurbo(this, 449, 46, textureX, textureY); // Box 128
		bodyModel[519] = new ModelRendererTurbo(this, 454, 46, textureX, textureY); // Box 128
		bodyModel[520] = new ModelRendererTurbo(this, 454, 55, textureX, textureY); // Box 128
		bodyModel[521] = new ModelRendererTurbo(this, 449, 52, textureX, textureY); // Box 128
		bodyModel[522] = new ModelRendererTurbo(this, 454, 52, textureX, textureY); // Box 128
		bodyModel[523] = new ModelRendererTurbo(this, 452, 61, textureX, textureY); // Box 128
		bodyModel[524] = new ModelRendererTurbo(this, 447, 58, textureX, textureY); // Box 128
		bodyModel[525] = new ModelRendererTurbo(this, 452, 58, textureX, textureY); // Box 128
		bodyModel[526] = new ModelRendererTurbo(this, 448, 66, textureX, textureY); // Box 128
		bodyModel[527] = new ModelRendererTurbo(this, 437, 34, textureX, textureY); // Box 636
		bodyModel[528] = new ModelRendererTurbo(this, 454, 43, textureX, textureY); // Box 637
		bodyModel[529] = new ModelRendererTurbo(this, 451, 37, textureX, textureY); // Box 640
		bodyModel[530] = new ModelRendererTurbo(this, 446, 34, textureX, textureY); // Box 641
		bodyModel[531] = new ModelRendererTurbo(this, 451, 34, textureX, textureY); // Box 642
		bodyModel[532] = new ModelRendererTurbo(this, 436, 73, textureX, textureY); // Box 128
		bodyModel[533] = new ModelRendererTurbo(this, 457, 46, textureX, textureY); // Box 128
		bodyModel[534] = new ModelRendererTurbo(this, 468, 46, textureX, textureY); // Box 128
		bodyModel[535] = new ModelRendererTurbo(this, 479, 46, textureX, textureY); // Box 128
		bodyModel[536] = new ModelRendererTurbo(this, 497, 42, textureX, textureY); // Box 128
		bodyModel[537] = new ModelRendererTurbo(this, 449, 40, textureX, textureY); // Box 658
		bodyModel[538] = new ModelRendererTurbo(this, 454, 40, textureX, textureY); // Box 659
		bodyModel[539] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 660
		bodyModel[540] = new ModelRendererTurbo(this, 468, 41, textureX, textureY); // Box 661
		bodyModel[541] = new ModelRendererTurbo(this, 488, 46, textureX, textureY); // Box 128
		bodyModel[542] = new ModelRendererTurbo(this, 457, 56, textureX, textureY); // Box 128
		bodyModel[543] = new ModelRendererTurbo(this, 457, 51, textureX, textureY); // Box 128
		bodyModel[544] = new ModelRendererTurbo(this, 457, 31, textureX, textureY); // Box 668
		bodyModel[545] = new ModelRendererTurbo(this, 457, 36, textureX, textureY); // Box 669
		bodyModel[546] = new ModelRendererTurbo(this, 468, 51, textureX, textureY); // Box 128
		bodyModel[547] = new ModelRendererTurbo(this, 468, 57, textureX, textureY); // Box 128
		bodyModel[548] = new ModelRendererTurbo(this, 479, 40, textureX, textureY); // Box 674
		bodyModel[549] = new ModelRendererTurbo(this, 488, 40, textureX, textureY); // Box 675
		bodyModel[550] = new ModelRendererTurbo(this, 468, 35, textureX, textureY); // Box 676
		bodyModel[551] = new ModelRendererTurbo(this, 468, 29, textureX, textureY); // Box 677
		bodyModel[552] = new ModelRendererTurbo(this, 438, 40, textureX, textureY); // Box 679
		bodyModel[553] = new ModelRendererTurbo(this, 477, 52, textureX, textureY); // Box 128
		bodyModel[554] = new ModelRendererTurbo(this, 477, 58, textureX, textureY); // Box 128
		bodyModel[555] = new ModelRendererTurbo(this, 477, 35, textureX, textureY); // Box 685
		bodyModel[556] = new ModelRendererTurbo(this, 477, 29, textureX, textureY); // Box 686
		bodyModel[557] = new ModelRendererTurbo(this, 448, 64, textureX, textureY); // Box 128
		bodyModel[558] = new ModelRendererTurbo(this, 445, 64, textureX, textureY); // Box 128
		bodyModel[559] = new ModelRendererTurbo(this, 438, 70, textureX, textureY); // Box 707
		bodyModel[560] = new ModelRendererTurbo(this, 444, 31, textureX, textureY); // Box 709
		bodyModel[561] = new ModelRendererTurbo(this, 447, 31, textureX, textureY); // Box 710
		bodyModel[562] = new ModelRendererTurbo(this, 436, 25, textureX, textureY); // Box 711
		bodyModel[563] = new ModelRendererTurbo(this, 462, 64, textureX, textureY); // Box 128
		bodyModel[564] = new ModelRendererTurbo(this, 451, 64, textureX, textureY); // Box 128
		bodyModel[565] = new ModelRendererTurbo(this, 466, 69, textureX, textureY); // Box 128
		bodyModel[566] = new ModelRendererTurbo(this, 437, 29, textureX, textureY); // Box 723
		bodyModel[567] = new ModelRendererTurbo(this, 447, 29, textureX, textureY); // Box 724
		bodyModel[568] = new ModelRendererTurbo(this, 444, 29, textureX, textureY); // Box 725
		bodyModel[569] = new ModelRendererTurbo(this, 467, 17, textureX, textureY); // Box 727
		bodyModel[570] = new ModelRendererTurbo(this, 456, 17, textureX, textureY); // Box 728
		bodyModel[571] = new ModelRendererTurbo(this, 473, 64, textureX, textureY); // Box 128
		bodyModel[572] = new ModelRendererTurbo(this, 467, 22, textureX, textureY); // Box 731
		bodyModel[573] = new ModelRendererTurbo(this, 477, 69, textureX, textureY); // Box 128
		bodyModel[574] = new ModelRendererTurbo(this, 484, 64, textureX, textureY); // Box 128
		bodyModel[575] = new ModelRendererTurbo(this, 478, 22, textureX, textureY); // Box 736
		bodyModel[576] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 737
		bodyModel[577] = new ModelRendererTurbo(this, 443, 73, textureX, textureY); // Box 128
		bodyModel[578] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 128
		bodyModel[579] = new ModelRendererTurbo(this, 457, 70, textureX, textureY); // Box 128
		bodyModel[580] = new ModelRendererTurbo(this, 443, 69, textureX, textureY); // Box 128
		bodyModel[581] = new ModelRendererTurbo(this, 438, 22, textureX, textureY); // Box 748
		bodyModel[582] = new ModelRendererTurbo(this, 457, 22, textureX, textureY); // Box 750
		bodyModel[583] = new ModelRendererTurbo(this, 462, 73, textureX, textureY); // Box 128
		bodyModel[584] = new ModelRendererTurbo(this, 478, 17, textureX, textureY); // Box 753
		bodyModel[585] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 754
		bodyModel[586] = new ModelRendererTurbo(this, 462, 25, textureX, textureY); // Box 755
		bodyModel[587] = new ModelRendererTurbo(this, 450, 69, textureX, textureY); // Box 128
		bodyModel[588] = new ModelRendererTurbo(this, 443, 21, textureX, textureY); // Box 763
		bodyModel[589] = new ModelRendererTurbo(this, 450, 21, textureX, textureY); // Box 764
		bodyModel[590] = new ModelRendererTurbo(this, 450, 73, textureX, textureY); // Box 128
		bodyModel[591] = new ModelRendererTurbo(this, 443, 25, textureX, textureY); // Box 767
		bodyModel[592] = new ModelRendererTurbo(this, 450, 25, textureX, textureY); // Box 768
		bodyModel[593] = new ModelRendererTurbo(this, 45, 161, textureX, textureY); // Box 2
		bodyModel[594] = new ModelRendererTurbo(this, 25, 156, textureX, textureY); // Box 2
		bodyModel[595] = new ModelRendererTurbo(this, 37, 144, textureX, textureY); // Box 190
		bodyModel[596] = new ModelRendererTurbo(this, 29, 145, textureX, textureY); // Box 193
		bodyModel[597] = new ModelRendererTurbo(this, 201, 156, textureX, textureY); // Box 41
		bodyModel[598] = new ModelRendererTurbo(this, 214, 157, textureX, textureY); // Box 41
		bodyModel[599] = new ModelRendererTurbo(this, 198, 157, textureX, textureY); // Box 41
		bodyModel[600] = new ModelRendererTurbo(this, 203, 173, textureX, textureY); // Box 634
		bodyModel[601] = new ModelRendererTurbo(this, 205, 172, textureX, textureY); // Box 611
		bodyModel[602] = new ModelRendererTurbo(this, 289, 361, textureX, textureY); // Box 38
		bodyModel[603] = new ModelRendererTurbo(this, 291, 374, textureX, textureY); // Box 38
		bodyModel[604] = new ModelRendererTurbo(this, 291, 350, textureX, textureY); // Box 443
		bodyModel[605] = new ModelRendererTurbo(this, 359, 215, textureX, textureY); // Box 128
		bodyModel[606] = new ModelRendererTurbo(this, 360, 220, textureX, textureY); // Box 128
		bodyModel[607] = new ModelRendererTurbo(this, 359, 203, textureX, textureY); // Box 192
		bodyModel[608] = new ModelRendererTurbo(this, 360, 208, textureX, textureY); // Box 193
		bodyModel[609] = new ModelRendererTurbo(this, 371, 235, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[610] = new ModelRendererTurbo(this, 360, 229, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[611] = new ModelRendererTurbo(this, 372, 240, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[612] = new ModelRendererTurbo(this, 359, 224, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[613] = new ModelRendererTurbo(this, 374, 243, textureX, textureY); // Box 38
		bodyModel[614] = new ModelRendererTurbo(this, 362, 232, textureX, textureY); // Box 589
		bodyModel[615] = new ModelRendererTurbo(this, 432, 369, textureX, textureY); // Box 492
		bodyModel[616] = new ModelRendererTurbo(this, 436, 363, textureX, textureY); // Box 493
		bodyModel[617] = new ModelRendererTurbo(this, 421, 368, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[618] = new ModelRendererTurbo(this, 443, 368, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[619] = new ModelRendererTurbo(this, 432, 345, textureX, textureY); // Box 563
		bodyModel[620] = new ModelRendererTurbo(this, 436, 339, textureX, textureY); // Box 564
		bodyModel[621] = new ModelRendererTurbo(this, 421, 344, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[622] = new ModelRendererTurbo(this, 443, 344, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[623] = new ModelRendererTurbo(this, 482, 369, textureX, textureY); // Box 492
		bodyModel[624] = new ModelRendererTurbo(this, 486, 363, textureX, textureY); // Box 493
		bodyModel[625] = new ModelRendererTurbo(this, 471, 368, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[626] = new ModelRendererTurbo(this, 493, 368, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[627] = new ModelRendererTurbo(this, 482, 345, textureX, textureY); // Box 563
		bodyModel[628] = new ModelRendererTurbo(this, 486, 339, textureX, textureY); // Box 564
		bodyModel[629] = new ModelRendererTurbo(this, 471, 344, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[630] = new ModelRendererTurbo(this, 493, 344, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[631] = new ModelRendererTurbo(this, 474, 315, textureX, textureY); // Left seat part
		bodyModel[632] = new ModelRendererTurbo(this, 446, 315, textureX, textureY); // Left seat part
		bodyModel[633] = new ModelRendererTurbo(this, 453, 311, textureX, textureY); // Left seat part
		bodyModel[634] = new ModelRendererTurbo(this, 446, 324, textureX, textureY); // Left seat part
		bodyModel[635] = new ModelRendererTurbo(this, 446, 321, textureX, textureY); // Left seat part
		bodyModel[636] = new ModelRendererTurbo(this, 472, 324, textureX, textureY); // Left seat part
		bodyModel[637] = new ModelRendererTurbo(this, 472, 321, textureX, textureY); // Left seat part
		bodyModel[638] = new ModelRendererTurbo(this, 459, 324, textureX, textureY); // Left seat part
		bodyModel[639] = new ModelRendererTurbo(this, 411, 278, textureX, textureY); // Right seat part
		bodyModel[640] = new ModelRendererTurbo(this, 439, 278, textureX, textureY); // Right seat part
		bodyModel[641] = new ModelRendererTurbo(this, 418, 274, textureX, textureY); // Right seat part
		bodyModel[642] = new ModelRendererTurbo(this, 437, 287, textureX, textureY); // Right seat part
		bodyModel[643] = new ModelRendererTurbo(this, 437, 284, textureX, textureY); // Right seat part
		bodyModel[644] = new ModelRendererTurbo(this, 411, 287, textureX, textureY); // Right seat part
		bodyModel[645] = new ModelRendererTurbo(this, 411, 284, textureX, textureY); // Right seat part
		bodyModel[646] = new ModelRendererTurbo(this, 424, 287, textureX, textureY); // Right seat part
		bodyModel[647] = new ModelRendererTurbo(this, 404, 315, textureX, textureY); // Left seat part
		bodyModel[648] = new ModelRendererTurbo(this, 376, 315, textureX, textureY); // Left seat part
		bodyModel[649] = new ModelRendererTurbo(this, 383, 311, textureX, textureY); // Left seat part
		bodyModel[650] = new ModelRendererTurbo(this, 376, 324, textureX, textureY); // Left seat part
		bodyModel[651] = new ModelRendererTurbo(this, 376, 321, textureX, textureY); // Left seat part
		bodyModel[652] = new ModelRendererTurbo(this, 402, 324, textureX, textureY); // Left seat part
		bodyModel[653] = new ModelRendererTurbo(this, 402, 321, textureX, textureY); // Left seat part
		bodyModel[654] = new ModelRendererTurbo(this, 388, 324, textureX, textureY); // Left seat part
		bodyModel[655] = new ModelRendererTurbo(this, 439, 315, textureX, textureY); // Left seat part
		bodyModel[656] = new ModelRendererTurbo(this, 411, 315, textureX, textureY); // Left seat part
		bodyModel[657] = new ModelRendererTurbo(this, 418, 311, textureX, textureY); // Left seat part
		bodyModel[658] = new ModelRendererTurbo(this, 411, 324, textureX, textureY); // Left seat part
		bodyModel[659] = new ModelRendererTurbo(this, 411, 321, textureX, textureY); // Left seat part
		bodyModel[660] = new ModelRendererTurbo(this, 437, 324, textureX, textureY); // Left seat part
		bodyModel[661] = new ModelRendererTurbo(this, 437, 321, textureX, textureY); // Left seat part
		bodyModel[662] = new ModelRendererTurbo(this, 424, 324, textureX, textureY); // Left seat part
		bodyModel[663] = new ModelRendererTurbo(this, 376, 278, textureX, textureY); // Right seat part
		bodyModel[664] = new ModelRendererTurbo(this, 404, 278, textureX, textureY); // Right seat part
		bodyModel[665] = new ModelRendererTurbo(this, 383, 274, textureX, textureY); // Right seat part
		bodyModel[666] = new ModelRendererTurbo(this, 387, 258, textureX, textureY); // Right seat part
		bodyModel[667] = new ModelRendererTurbo(this, 402, 287, textureX, textureY); // Right seat part
		bodyModel[668] = new ModelRendererTurbo(this, 376, 284, textureX, textureY); // Right seat part
		bodyModel[669] = new ModelRendererTurbo(this, 376, 287, textureX, textureY); // Right seat part
		bodyModel[670] = new ModelRendererTurbo(this, 402, 284, textureX, textureY); // Right seat part
		bodyModel[671] = new ModelRendererTurbo(this, 389, 287, textureX, textureY); // Right seat part
		bodyModel[672] = new ModelRendererTurbo(this, 388, 268, textureX, textureY); // Right seat part
		bodyModel[673] = new ModelRendererTurbo(this, 376, 272, textureX, textureY); // Right seat part
		bodyModel[674] = new ModelRendererTurbo(this, 406, 272, textureX, textureY); // Right seat part
		bodyModel[675] = new ModelRendererTurbo(this, 388, 281, textureX, textureY); // Right seat part
		bodyModel[676] = new ModelRendererTurbo(this, 422, 258, textureX, textureY); // Right seat part
		bodyModel[677] = new ModelRendererTurbo(this, 423, 268, textureX, textureY); // Right seat part
		bodyModel[678] = new ModelRendererTurbo(this, 441, 272, textureX, textureY); // Right seat part
		bodyModel[679] = new ModelRendererTurbo(this, 411, 272, textureX, textureY); // Right seat part
		bodyModel[680] = new ModelRendererTurbo(this, 423, 281, textureX, textureY); // Right seat part
		bodyModel[681] = new ModelRendererTurbo(this, 387, 295, textureX, textureY); // Left seat part
		bodyModel[682] = new ModelRendererTurbo(this, 388, 305, textureX, textureY); // Left seat part
		bodyModel[683] = new ModelRendererTurbo(this, 376, 309, textureX, textureY); // Left seat part
		bodyModel[684] = new ModelRendererTurbo(this, 406, 309, textureX, textureY); // Left seat part
		bodyModel[685] = new ModelRendererTurbo(this, 388, 318, textureX, textureY); // Left seat part
		bodyModel[686] = new ModelRendererTurbo(this, 411, 309, textureX, textureY); // Left seat part
		bodyModel[687] = new ModelRendererTurbo(this, 441, 309, textureX, textureY); // Left seat part
		bodyModel[688] = new ModelRendererTurbo(this, 423, 318, textureX, textureY); // Left seat part
		bodyModel[689] = new ModelRendererTurbo(this, 446, 309, textureX, textureY); // Left seat part
		bodyModel[690] = new ModelRendererTurbo(this, 476, 309, textureX, textureY); // Left seat part
		bodyModel[691] = new ModelRendererTurbo(this, 458, 318, textureX, textureY); // Left seat part
		bodyModel[692] = new ModelRendererTurbo(this, 422, 295, textureX, textureY); // Left seat part
		bodyModel[693] = new ModelRendererTurbo(this, 423, 305, textureX, textureY); // Left seat part
		bodyModel[694] = new ModelRendererTurbo(this, 457, 295, textureX, textureY); // Left seat part
		bodyModel[695] = new ModelRendererTurbo(this, 458, 305, textureX, textureY); // Left seat part
		bodyModel[696] = new ModelRendererTurbo(this, 446, 278, textureX, textureY); // Right seat part
		bodyModel[697] = new ModelRendererTurbo(this, 474, 278, textureX, textureY); // Right seat part
		bodyModel[698] = new ModelRendererTurbo(this, 453, 274, textureX, textureY); // Right seat part
		bodyModel[699] = new ModelRendererTurbo(this, 472, 287, textureX, textureY); // Right seat part
		bodyModel[700] = new ModelRendererTurbo(this, 472, 284, textureX, textureY); // Right seat part
		bodyModel[701] = new ModelRendererTurbo(this, 446, 287, textureX, textureY); // Right seat part
		bodyModel[702] = new ModelRendererTurbo(this, 446, 284, textureX, textureY); // Right seat part
		bodyModel[703] = new ModelRendererTurbo(this, 459, 287, textureX, textureY); // Right seat part
		bodyModel[704] = new ModelRendererTurbo(this, 457, 258, textureX, textureY); // Right seat part
		bodyModel[705] = new ModelRendererTurbo(this, 458, 268, textureX, textureY); // Right seat part
		bodyModel[706] = new ModelRendererTurbo(this, 476, 272, textureX, textureY); // Right seat part
		bodyModel[707] = new ModelRendererTurbo(this, 446, 272, textureX, textureY); // Right seat part
		bodyModel[708] = new ModelRendererTurbo(this, 458, 281, textureX, textureY); // Right seat part
		bodyModel[709] = new ModelRendererTurbo(this, 341, 278, textureX, textureY); // Right seat part
		bodyModel[710] = new ModelRendererTurbo(this, 369, 278, textureX, textureY); // Right seat part
		bodyModel[711] = new ModelRendererTurbo(this, 348, 274, textureX, textureY); // Right seat part
		bodyModel[712] = new ModelRendererTurbo(this, 352, 258, textureX, textureY); // Right seat part
		bodyModel[713] = new ModelRendererTurbo(this, 367, 284, textureX, textureY); // Right seat part
		bodyModel[714] = new ModelRendererTurbo(this, 341, 287, textureX, textureY); // Right seat part
		bodyModel[715] = new ModelRendererTurbo(this, 341, 284, textureX, textureY); // Right seat part
		bodyModel[716] = new ModelRendererTurbo(this, 354, 287, textureX, textureY); // Right seat part
		bodyModel[717] = new ModelRendererTurbo(this, 353, 268, textureX, textureY); // Right seat part
		bodyModel[718] = new ModelRendererTurbo(this, 371, 272, textureX, textureY); // Right seat part
		bodyModel[719] = new ModelRendererTurbo(this, 341, 272, textureX, textureY); // Right seat part
		bodyModel[720] = new ModelRendererTurbo(this, 353, 281, textureX, textureY); // Right seat part
		bodyModel[721] = new ModelRendererTurbo(this, 367, 287, textureX, textureY); // Right seat part
		bodyModel[722] = new ModelRendererTurbo(this, 361, 212, textureX, textureY); // Box 128
		bodyModel[723] = new ModelRendererTurbo(this, 361, 200, textureX, textureY); // Box 194
		bodyModel[724] = new ModelRendererTurbo(this, 180, 354, textureX, textureY); // Box 38
		bodyModel[725] = new ModelRendererTurbo(this, 180, 327, textureX, textureY); // Box 836
		bodyModel[726] = new ModelRendererTurbo(this, 63, 183, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[727] = new ModelRendererTurbo(this, 63, 181, textureX, textureY); // Box 31
		bodyModel[728] = new ModelRendererTurbo(this, 63, 175, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[729] = new ModelRendererTurbo(this, 63, 173, textureX, textureY); // Box 31
		bodyModel[730] = new ModelRendererTurbo(this, 319, 164, textureX, textureY); // Box 2
		bodyModel[731] = new ModelRendererTurbo(this, 328, 164, textureX, textureY); // Box 2
		bodyModel[732] = new ModelRendererTurbo(this, 328, 176, textureX, textureY); // Box 2
		bodyModel[733] = new ModelRendererTurbo(this, 321, 167, textureX, textureY); // Box 2
		bodyModel[734] = new ModelRendererTurbo(this, 330, 167, textureX, textureY); // Box 2
		bodyModel[735] = new ModelRendererTurbo(this, 328, 170, textureX, textureY); // Box 2
		bodyModel[736] = new ModelRendererTurbo(this, 330, 173, textureX, textureY); // Box 2
		bodyModel[737] = new ModelRendererTurbo(this, 339, 166, textureX, textureY); // Box 128
		bodyModel[738] = new ModelRendererTurbo(this, 339, 173, textureX, textureY); // Box 128
		bodyModel[739] = new ModelRendererTurbo(this, 321, 166, textureX, textureY); // Box 128
		bodyModel[740] = new ModelRendererTurbo(this, 325, 173, textureX, textureY); // Box 128
		bodyModel[741] = new ModelRendererTurbo(this, 319, 148, textureX, textureY); // Box 628
		bodyModel[742] = new ModelRendererTurbo(this, 328, 148, textureX, textureY); // Box 629
		bodyModel[743] = new ModelRendererTurbo(this, 328, 160, textureX, textureY); // Box 630
		bodyModel[744] = new ModelRendererTurbo(this, 321, 151, textureX, textureY); // Box 631
		bodyModel[745] = new ModelRendererTurbo(this, 330, 151, textureX, textureY); // Box 632
		bodyModel[746] = new ModelRendererTurbo(this, 328, 154, textureX, textureY); // Box 633
		bodyModel[747] = new ModelRendererTurbo(this, 330, 157, textureX, textureY); // Box 634
		bodyModel[748] = new ModelRendererTurbo(this, 339, 150, textureX, textureY); // Box 635
		bodyModel[749] = new ModelRendererTurbo(this, 339, 157, textureX, textureY); // Box 636
		bodyModel[750] = new ModelRendererTurbo(this, 321, 150, textureX, textureY); // Box 638
		bodyModel[751] = new ModelRendererTurbo(this, 325, 157, textureX, textureY); // Box 639

		bodyModel[500].addShapeBox(0F, 0F, 0F, 0, 18, 9, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -5F, 0F, -9F, -5F, 0F, -9F, 0F, 0F, -9F, 0F); // Box 598
		bodyModel[500].setRotationPoint(41F, -15F, 1F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[501].setRotationPoint(47.5F, -5F, 2.5F);

		bodyModel[502].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[502].setRotationPoint(48.5F, -5.5F, 3.5F);
		bodyModel[502].rotateAngleY = -0.78539816F;

		bodyModel[503].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[503].setRotationPoint(47.5F, 0.5F, 2.5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[504].setRotationPoint(47.5F, -5F, -4.5F);

		bodyModel[505].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[505].setRotationPoint(48.5F, -5.5F, -3.5F);
		bodyModel[505].rotateAngleY = -0.78539816F;

		bodyModel[506].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[506].setRotationPoint(47.5F, 0.5F, -4.5F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, -1F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[507].setRotationPoint(51.5F, -21F, 0F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[508].setRotationPoint(53.5F, -20F, 0F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, -1F, 0F, -0.25F, -0.61F, 0F, -0.25F, -0.61F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[509].setRotationPoint(51.5F, -21F, -3F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, -0.09F, 0F, -0.25F, -0.09F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[510].setRotationPoint(53.5F, -20F, -3F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, -1F, 0F, 0.25F, -0.51F, 0F, 0.25F, -0.51F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[511].setRotationPoint(51.5F, -20.25F, -6F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.25F, -0.17F, 0F, 0.25F, -0.17F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[512].setRotationPoint(53.5F, -19.25F, -6F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -1F, 0F, 0.25F, -0.51F, 0F, 0.25F, -0.51F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[513].setRotationPoint(51.5F, -18.83F, -9F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.25F, -0.74F, 0F, 0.25F, -0.74F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[514].setRotationPoint(53.5F, -17.83F, -9F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, -0.09F, 0F, -0.25F, -0.09F, 0F, 0F, -1F, 0F); // Box 620
		bodyModel[515].setRotationPoint(53.5F, -20F, 3F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.25F, -0.17F, 0F, 0.25F, -0.17F, 0F, 0F, -1F, 0F); // Box 622
		bodyModel[516].setRotationPoint(53.5F, -19.25F, 6F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0.24F, 0F, 0F, 0.24F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, 0.49F, 0.25F, 0F, 0.49F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 128
		bodyModel[517].setRotationPoint(58.5F, -17.25F, 0F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, 0.49F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0.49F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 128
		bodyModel[518].setRotationPoint(56.5F, -20F, 0F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, -0.01F, 0F, -1F, -0.01F, 0F, -1F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.25F, 0F, 0.24F, 0.25F, 0F, 0.24F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[519].setRotationPoint(58.5F, -19.5F, 0F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0.24F, 0F, 0F, 0.24F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, 0.49F, 0.25F, 0F, 0.49F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 128
		bodyModel[520].setRotationPoint(58.5F, -17.25F, -3F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0.25F, 0.39F, 0F, 0F, -0.76F, 0F, 0F, -0.76F, 0F, 0.25F, 0.39F, 0F, 0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -2F, 0F); // Box 128
		bodyModel[521].setRotationPoint(56.5F, -20F, -3F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, -0.26F, 0F, -1F, -0.26F, 0F, -1F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, 0.25F, 0F, 0.24F, 0.25F, 0F, 0.24F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[522].setRotationPoint(58.5F, -19.5F, -3F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.14F, 0F, 0F, 0.14F, 0F, 0F, 0.14F, 0F, 0F, -0.14F, 0F, 0F, -1F, 0.25F, 0F, 0.49F, 0.25F, 0F, 0.49F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 128
		bodyModel[523].setRotationPoint(57.75F, -17.25F, -6F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0.49F, 0F, 0.15F, -0.51F, 0F, 0.15F, -0.51F, 0F, 0F, 0.49F, 0F, 0F, -1F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[524].setRotationPoint(55.75F, -19.25F, -6F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, -0.76F, 0F, -1F, -0.76F, 0F, -1F, -0.76F, 0F, 0F, -0.76F, 0F, 0F, 0.25F, 0F, -0.01F, 0.25F, 0F, -0.01F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[525].setRotationPoint(57.9F, -19.5F, -6F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0.12F, 0F, 0F, -0.14F, 0F, 0F, -0.14F, 0F, 0F, 0.12F, 0F, 0F, -1F, 0.25F, 0F, 0.49F, 0.25F, 0F, 0.49F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 128
		bodyModel[526].setRotationPoint(56.17F, -17.25F, -9F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, -1F, 0F, 0.25F, -0.51F, 0F, 0.25F, -0.51F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 636
		bodyModel[527].setRotationPoint(51.5F, -20.25F, 6F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0.24F, 0F, 0F, 0.24F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, 0.49F, 0.25F, 0F, 0.49F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 637
		bodyModel[528].setRotationPoint(58.5F, -17.25F, 3F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.14F, 0F, 0F, 0.14F, 0F, 0F, 0.14F, 0F, 0F, -0.14F, 0F, 0F, -1F, 0.25F, 0F, 0.49F, 0.25F, 0F, 0.49F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 640
		bodyModel[529].setRotationPoint(57.75F, -17.25F, 6F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0.49F, 0F, 0.15F, -0.51F, 0F, 0.15F, -0.51F, 0F, 0F, 0.49F, 0F, 0F, -1F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, -1F, 0F); // Box 641
		bodyModel[530].setRotationPoint(55.75F, -19.25F, 6F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, -0.76F, 0F, -1F, -0.76F, 0F, -1F, -0.76F, 0F, 0F, -0.76F, 0F, 0F, 0.25F, 0F, -0.01F, 0.25F, 0F, -0.01F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 642
		bodyModel[531].setRotationPoint(57.9F, -19.5F, 6F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1.5F, 0F, -1.74F, 0.25F, 0F, -1.74F, 0.25F, 0F, 0.75F, -1.5F, 0F, 0.75F, 0F, 0.25F, -0.99F, 0.25F, 0.25F, -0.99F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[532].setRotationPoint(52.5F, -17.25F, -12F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.25F, -0.1F, 0F, 0F, -1.25F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.89F, 0F, 0F, 0.26F, 0F, -2F, -0.99F, 0F, 0F, -0.99F, 0F); // Box 128
		bodyModel[533].setRotationPoint(56.5F, -20.5F, -3F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-2F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0.26F, 0F, 0F, 0.26F, 0F, 0F, 0.01F, 0F, 0F, -0.99F, 0F); // Box 128
		bodyModel[534].setRotationPoint(56.5F, -20.5F, -3F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.01F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0.01F, 0F, 0F, -1.24F, 0.25F, 0F, 0.25F, 0.25F, 0F, -1F, -2F, 0F, 0.01F, -2F, 0F); // Box 128
		bodyModel[535].setRotationPoint(58.5F, -19.5F, -3F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0.01F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.01F, 0F, 0F, -0.24F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.24F, 0.25F, 0F); // Box 128
		bodyModel[536].setRotationPoint(59.75F, -17.25F, -3F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0.25F, 0.39F, 0F, 0F, -0.76F, 0F, 0F, -0.76F, 0F, 0.25F, 0.39F, 0F, 0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -2F, 0F); // Box 658
		bodyModel[537].setRotationPoint(56.5F, -20F, 3F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, -0.26F, 0F, -1F, -0.26F, 0F, -1F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, 0.25F, 0F, 0.24F, 0.25F, 0F, 0.24F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 659
		bodyModel[538].setRotationPoint(58.5F, -19.5F, 3F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -1.25F, 0F, 0.25F, -0.1F, 0F, 0F, -0.99F, 0F, -2F, -0.99F, 0F, 0F, 0.26F, 0F, 0.25F, -0.89F, 0F); // Box 660
		bodyModel[539].setRotationPoint(56.5F, -20.5F, 0F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, -2F, -1.25F, 0F, 0F, -0.99F, 0F, 0F, 0.01F, 0F, 0F, 0.26F, 0F, -2F, 0.26F, 0F); // Box 661
		bodyModel[540].setRotationPoint(56.5F, -20.5F, 0F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1.24F, -2.25F, 0F, 0.25F, -2.25F, 0F, -1F, 0F, 0F, 0.01F, 0F, 0F, -1.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -1.24F, 0.25F, 0F); // Box 128
		bodyModel[541].setRotationPoint(58.5F, -19.5F, -3F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-2.15F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0.75F, 0F, 0F, -0.5F, 1.15F, 0F, -2.15F, -0.49F, 0F, 0.15F, -0.49F, 0F, 0.75F, -0.99F, 0F, -0.5F, -2.14F, 0F); // Box 128
		bodyModel[542].setRotationPoint(55.75F, -19.25F, -6F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.5F, 0F, 0.15F, -0.5F, 0F, -1.5F, 1.15F, 0F, -0.5F, 1.15F, 0F, 0F, -1.49F, 0F, 0.15F, -0.49F, 0F, -1.5F, -2.14F, 0F, -0.5F, -2.14F, 0F); // Box 128
		bodyModel[543].setRotationPoint(55.75F, -19.25F, -6F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, 1.15F, 0F, 0.75F, 0F, 0F, 0.15F, -0.5F, 0F, -2.15F, -0.5F, 0F, -0.5F, -2.14F, 0F, 0.75F, -0.99F, 0F, 0.15F, -0.49F, 0F, -2.15F, -0.49F, 0F); // Box 668
		bodyModel[544].setRotationPoint(55.75F, -19.25F, 3F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, 1.15F, 0F, -1.5F, 1.15F, 0F, 0.15F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -2.14F, 0F, -1.5F, -2.14F, 0F, 0.15F, -0.49F, 0F, 0F, -1.49F, 0F); // Box 669
		bodyModel[545].setRotationPoint(55.75F, -19.25F, 3F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.76F, 0F, -1F, -0.75F, 0F, -0.4F, -0.25F, 0F, -0.59F, -0.25F, 0F, -0.99F, 0.25F, 0F, 0F, 0.25F, 0F, -0.4F, -1.75F, 0F, -0.59F, -1.75F, 0F); // Box 128
		bodyModel[546].setRotationPoint(57.9F, -19.5F, -6F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.99F, -2.25F, 0F, 0F, -2.25F, 0F, -0.4F, -0.25F, 0F, -0.59F, -0.25F, 0F, -0.99F, 0.25F, 0F, 0F, 0.25F, 0F, 0.85F, 0.25F, 0F, -1.84F, 0.25F, 0F); // Box 128
		bodyModel[547].setRotationPoint(57.9F, -19.5F, -6F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.01F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0.01F, -0.25F, 0F, 0.01F, -2F, 0F, -1F, -2F, 0F, 0.25F, 0.25F, 0F, -1.24F, 0.25F, 0F); // Box 674
		bodyModel[548].setRotationPoint(58.5F, -19.5F, 0F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.01F, 0F, 0F, -1F, 0F, 0F, 0.25F, -2.25F, 0F, -1.24F, -2.25F, 0F, -1.24F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -1.25F, 0.25F, 0F); // Box 675
		bodyModel[549].setRotationPoint(58.5F, -19.5F, 0F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.59F, -0.25F, 0F, -0.4F, -0.25F, 0F, -1F, -0.75F, 0F, 0F, -0.76F, 0F, -0.59F, -1.75F, 0F, -0.4F, -1.75F, 0F, 0F, 0.25F, 0F, -0.99F, 0.25F, 0F); // Box 676
		bodyModel[550].setRotationPoint(57.9F, -19.5F, 3F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.59F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0F, -2.25F, 0F, -0.99F, -2.25F, 0F, -1.84F, 0.25F, 0F, 0.85F, 0.25F, 0F, 0F, 0.25F, 0F, -0.99F, 0.25F, 0F); // Box 677
		bodyModel[551].setRotationPoint(57.9F, -19.5F, 3F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, -1F, 0F, -0.25F, -0.61F, 0F, -0.25F, -0.61F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 679
		bodyModel[552].setRotationPoint(51.5F, -21F, 3F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.86F, 0F, 0F, -1.85F, 0F, 0F, -1F, 0F, 0F, 0.01F, 0F, 0F, 0.51F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1F, -2F, 0F, 0.01F, -2F, 0F); // Box 128
		bodyModel[553].setRotationPoint(59.75F, -17.25F, -6F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.51F, -2.25F, 0F, -1.5F, -2.25F, 0F, -1F, 0F, 0F, 0.01F, 0F, 0F, 0.51F, 0.25F, 0F, -1.5F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.24F, 0.25F, 0F); // Box 128
		bodyModel[554].setRotationPoint(59.75F, -17.25F, -6F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.01F, 0F, 0F, -1F, 0F, 0F, -1.85F, 0F, 0F, 0.86F, 0F, 0F, 0.01F, -2F, 0F, -1F, -2F, 0F, -1.5F, 0.25F, 0F, 0.51F, 0.25F, 0F); // Box 685
		bodyModel[555].setRotationPoint(59.75F, -17.25F, 3F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.01F, 0F, 0F, -1F, 0F, 0F, -1.5F, -2.25F, 0F, 0.51F, -2.25F, 0F, -0.24F, 0.25F, 0F, -0.75F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0.51F, 0.25F, 0F); // Box 686
		bodyModel[556].setRotationPoint(59.75F, -17.25F, 3F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.07F, 0F, -0.02F, 0.07F, 0F, -0.02F, 0.07F, 0F, 0F, 0.07F, 0F); // Box 128
		bodyModel[557].setRotationPoint(56.05F, -18.32F, -9F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.3F, 0.08F, 0F, 0.3F, 0.08F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[558].setRotationPoint(54.75F, -18.32F, -9F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.25F, 0.5F, -2.25F, 0.25F, 0.5F, -2.25F, 0.25F, 0.49F, 1.25F, -1.25F, 0.49F, 1.25F, -0.5F, -0.42F, -0.99F, 0.25F, -0.42F, -0.99F, 0.25F, -0.42F, 0F, -0.5F, -0.42F, 0F); // Box 707
		bodyModel[559].setRotationPoint(53.5F, -17.83F, -11.25F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.25F, -0.73F, 0F, 0.25F, -0.73F, 0F, 0F, -1F, 0F); // Box 709
		bodyModel[560].setRotationPoint(53.5F, -17.83F, 9F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0.12F, 0F, 0F, -0.14F, 0F, 0F, -0.14F, 0F, 0F, 0.12F, 0F, 0F, -1F, 0.25F, 0F, 0.49F, 0.25F, 0F, 0.49F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 710
		bodyModel[561].setRotationPoint(56.17F, -17.25F, 9F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1.5F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, -1.74F, -1.5F, 0F, -1.74F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.99F, 0F, 0.25F, -0.99F); // Box 711
		bodyModel[562].setRotationPoint(52.5F, -17.25F, 11F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.3F, -0.92F, 0F, -1.7F, -0.92F, 0F, 0.15F, -0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -0.07F, 0F, -1.7F, -0.07F, 0F, 0.15F, -0.49F, 0F, 0F, -1.49F, 0F); // Box 128
		bodyModel[563].setRotationPoint(55.75F, -19.25F, -9F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.92F, 0F, -0.7F, -0.92F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.07F, 0F, -0.7F, -0.07F, 0F, -1F, -1.49F, 0F, -1F, -1.49F, 0F); // Box 128
		bodyModel[564].setRotationPoint(54.75F, -19.25F, -9F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.3F, -0.92F, 0F, -0.71F, -2F, 0F, 0.15F, -0.5F, 0F, -2.15F, -0.5F, 0F, -0.3F, -0.07F, 0F, -0.72F, 1F, 0F, 0.15F, -0.49F, 0F, -2.15F, -0.49F, 0F); // Box 128
		bodyModel[565].setRotationPoint(55.75F, -19.25F, -9F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -1F, 0F, 0.25F, -0.51F, 0F, 0.25F, -0.51F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 723
		bodyModel[566].setRotationPoint(51.5F, -18.83F, 9F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.07F, 0F, -0.02F, 0.07F, 0F, -0.02F, 0.07F, 0F, 0F, 0.07F, 0F); // Box 724
		bodyModel[567].setRotationPoint(56.05F, -18.32F, 9F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.3F, 0.08F, 0F, 0.3F, 0.08F, 0F, 0F, -0.25F, 0F); // Box 725
		bodyModel[568].setRotationPoint(54.75F, -18.32F, 9F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.5F, 0F, 0.15F, -0.5F, 0F, -1.7F, -0.92F, 0F, -0.3F, -0.92F, 0F, 0F, -1.49F, 0F, 0.15F, -0.49F, 0F, -1.7F, -0.07F, 0F, -0.3F, -0.07F, 0F); // Box 727
		bodyModel[569].setRotationPoint(55.75F, -19.25F, 6F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0.5F, 0F, -1F, 0.5F, 0F, -0.7F, -0.92F, 0F, 0F, -0.92F, 0F, -1F, -1.49F, 0F, -1F, -1.49F, 0F, -0.7F, -0.07F, 0F, 0F, -0.07F, 0F); // Box 728
		bodyModel[570].setRotationPoint(54.75F, -19.25F, 6F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1.29F, -2F, 0F, -0.71F, -2F, 0F, 1.15F, -2F, 0F, -2.15F, -0.5F, 0F, -1.28F, 1F, 0F, -0.72F, 1F, 0F, 1.14F, 1.01F, 0F, -2.15F, -0.49F, 0F); // Box 128
		bodyModel[571].setRotationPoint(55.75F, -19.25F, -9F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-2.15F, -0.5F, 0F, 0.15F, -0.5F, 0F, -0.71F, -2F, 0F, -0.3F, -0.92F, 0F, -2.15F, -0.49F, 0F, 0.15F, -0.49F, 0F, -0.72F, 1F, 0F, -0.3F, -0.07F, 0F); // Box 731
		bodyModel[572].setRotationPoint(55.75F, -19.25F, 6F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,2.72F, 0F, 0F, -3.71F, 0F, 0F, -1.85F, 0F, 0F, 0.86F, 0F, 0F, 2.09F, 0.25F, 0F, -3.08F, 0.25F, 0F, -1.85F, -2F, 0F, 0.86F, -2F, 0F); // Box 128
		bodyModel[573].setRotationPoint(59.75F, -17.25F, -9F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,2.09F, -2.25F, 0F, -3.08F, -2.25F, 0F, -1.85F, 0F, 0F, 0.86F, 0F, 0F, 2.09F, 0.25F, 0F, -3.08F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0.51F, 0.25F, 0F); // Box 128
		bodyModel[574].setRotationPoint(59.75F, -17.25F, -9F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.86F, 0F, 0F, -1.85F, 0F, 0F, -3.71F, 0F, 0F, 2.72F, 0F, 0F, 0.86F, -2F, 0F, -1.85F, -2F, 0F, -3.08F, 0.25F, 0F, 2.09F, 0.25F, 0F); // Box 736
		bodyModel[575].setRotationPoint(59.75F, -17.25F, 6F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.86F, 0F, 0F, -1.85F, 0F, 0F, -3.08F, -2.25F, 0F, 2.09F, -2.25F, 0F, 0.51F, 0.25F, 0F, -1.5F, 0.25F, 0F, -3.08F, 0.25F, 0F, 2.09F, 0.25F, 0F); // Box 737
		bodyModel[576].setRotationPoint(59.75F, -17.25F, 6F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1.74F, -0.48F, 0F, -2.34F, -0.48F, 0F, 1.35F, 0F, 0F, 0.75F, 0F, 0.25F, -0.99F, -2F, 0.25F, -0.99F, -2F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[577].setRotationPoint(54.75F, -17.25F, -12F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1.63F, 0F, -0.35F, -2.63F, 0F, -0.34F, -1.86F, 0F, 0F, 0.87F, 0F, 0F, 1.27F, 0.25F, 0.2F, -2.27F, 0.25F, 0.21F, -2.27F, 0.25F, -1.21F, 1.27F, 0.25F, -1.2F); // Box 128
		bodyModel[578].setRotationPoint(57.9F, -17.25F, -10F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, -0.92F, 0F, -1.48F, -2F, 0.66F, -0.71F, -2F, -1F, -0.3F, -0.92F, -1F, -0.3F, -0.07F, 0F, -1.48F, 1F, 0.65F, -0.72F, 1F, -1F, -0.3F, -0.07F, -1F); // Box 128
		bodyModel[579].setRotationPoint(55.75F, -19.25F, -9F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.92F, -2.25F, -0.7F, -0.92F, -2.25F, -0.7F, -0.93F, 1.25F, 0F, -0.93F, 1.25F, 0F, 0F, -0.99F, -2F, 0F, -0.99F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[580].setRotationPoint(54.75F, -19.25F, -11.25F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.25F, 0.49F, 1.25F, 0.25F, 0.49F, 1.25F, 0.25F, 0.5F, -2.25F, -1.25F, 0.5F, -2.25F, -0.5F, -0.42F, 0F, 0.25F, -0.42F, 0F, 0.25F, -0.42F, -0.99F, -0.5F, -0.42F, -0.99F); // Box 748
		bodyModel[581].setRotationPoint(53.5F, -17.83F, 10.25F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, -0.92F, -1F, -0.71F, -2F, -1F, -1.48F, -2F, 0.66F, -0.3F, -0.92F, 0F, -0.3F, -0.07F, -1F, -0.72F, 1F, -1F, -1.48F, 1F, 0.65F, -0.3F, -0.07F, 0F); // Box 750
		bodyModel[582].setRotationPoint(55.75F, -19.25F, 8F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.87F, 0F, -1F, -1.86F, 0F, -1F, -1.86F, 0F, 0F, 0.87F, 0F, 0F, 1.27F, 0.25F, 0.2F, -2.27F, 0.25F, 0.21F, -1.23F, 0.25F, 0F, 0.24F, 0.25F, 0F); // Box 128
		bodyModel[583].setRotationPoint(57.9F, -17.25F, -10F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-2.15F, -0.5F, 0F, 1.15F, -2F, 0F, -0.71F, -2F, 0F, -1.29F, -2F, 0F, -2.15F, -0.49F, 0F, 1.14F, 1.01F, 0F, -0.72F, 1F, 0F, -1.28F, 1F, 0F); // Box 753
		bodyModel[584].setRotationPoint(55.75F, -19.25F, 6F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.87F, 0F, 0F, -1.86F, 0F, 0F, -2.63F, 0F, -0.34F, 1.63F, 0F, -0.35F, 1.27F, 0.25F, -1.2F, -2.27F, 0.25F, -1.21F, -2.27F, 0.25F, 0.21F, 1.27F, 0.25F, 0.2F); // Box 754
		bodyModel[585].setRotationPoint(57.9F, -17.25F, 9F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.87F, 0F, 0F, -1.86F, 0F, 0F, -1.86F, 0F, -1F, 0.87F, 0F, -1F, 0.24F, 0.25F, 0F, -1.23F, 0.25F, 0F, -2.27F, 0.25F, 0.21F, 1.27F, 0.25F, 0.2F); // Box 755
		bodyModel[586].setRotationPoint(57.9F, -17.25F, 9F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1.3F, -0.92F, -2.25F, -0.7F, -0.92F, -2.25F, -0.7F, -0.93F, 1.25F, -1.3F, -0.93F, 1.25F, 0F, 0F, -0.99F, -0.48F, 0F, -1.59F, -0.48F, 0F, 0.6F, 0F, 0F, 0F); // Box 128
		bodyModel[587].setRotationPoint(54.75F, -19.25F, -11.25F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.93F, 1.25F, -0.7F, -0.93F, 1.25F, -0.7F, -0.92F, -2.25F, 0F, -0.92F, -2.25F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.99F, 0F, 0F, -0.99F); // Box 763
		bodyModel[588].setRotationPoint(54.75F, -19.25F, 10.25F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1.3F, -0.93F, 1.25F, -0.7F, -0.93F, 1.25F, -0.7F, -0.92F, -2.25F, -1.3F, -0.92F, -2.25F, 0F, 0F, 0F, -0.48F, 0F, 0.6F, -0.48F, 0F, -1.59F, 0F, 0F, -0.99F); // Box 764
		bodyModel[589].setRotationPoint(54.75F, -19.25F, 10.25F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1.52F, 0F, -2.34F, -0.48F, 0F, -2.34F, -0.48F, 0F, 1.35F, -1.52F, 0F, 1.35F, 0F, 0.25F, -0.99F, -0.12F, 0.25F, -1.79F, -0.12F, 0.25F, 0.8F, 0F, 0.25F, 0F); // Box 128
		bodyModel[590].setRotationPoint(54.75F, -17.25F, -12F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.75F, -0.48F, 0F, 1.35F, -0.48F, 0F, -2.34F, 0F, 0F, -1.74F, 0F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, -0.99F, 0F, 0.25F, -0.99F); // Box 767
		bodyModel[591].setRotationPoint(54.75F, -17.25F, 11F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1.52F, 0F, 1.35F, -0.48F, 0F, 1.35F, -0.48F, 0F, -2.34F, -1.52F, 0F, -2.34F, 0F, 0.25F, 0F, -0.12F, 0.25F, 0.8F, -0.12F, 0.25F, -1.79F, 0F, 0.25F, -0.99F); // Box 768
		bodyModel[592].setRotationPoint(54.75F, -17.25F, 11F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[593].setRotationPoint(-59.5F, 4F, -5F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[594].setRotationPoint(-59.5F, 4F, -10F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[595].setRotationPoint(-59.5F, 4F, 1F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[596].setRotationPoint(-59.5F, 4F, 5F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[597].setRotationPoint(16.5F, 3.75F, 9.4F);
		bodyModel[597].rotateAngleX = -0.78539816F;

		bodyModel[598].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[598].setRotationPoint(16.49F, 4F, 8.9F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[599].setRotationPoint(20.51F, 4F, 8.9F);

		bodyModel[600].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 634
		bodyModel[600].setRotationPoint(-1.5F, 3F, -10F);

		bodyModel[601].addBox(0F, 0F, 0F, 9, 5, 5, 0F); // Box 611
		bodyModel[601].setRotationPoint(6.5F, 3F, -10F);

		bodyModel[602].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 38
		bodyModel[602].setRotationPoint(57.5F, -5F, -3F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, -0.1F, -0.78F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.78F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[603].setRotationPoint(57.5F, -5F, -7F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.78F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.78F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 443
		bodyModel[604].setRotationPoint(57.5F, -5F, 3F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 37, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[605].setRotationPoint(4.5F, -17F, -8.25F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 37, 1, 2, 0F,0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[606].setRotationPoint(4.5F, -16F, -10F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 37, 1, 3, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[607].setRotationPoint(4.5F, -17F, 5.25F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 37, 1, 2, 0F,0F, 1.275F, -0.25F, -0.5F, 1.275F, -0.25F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[608].setRotationPoint(4.5F, -16F, 8F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F,-0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 275 cull
		bodyModel[609].setRotationPoint(8.5F, -14F, -10F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 37, 0, 2, 0F,-0.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38 glow
		bodyModel[610].setRotationPoint(4.5F, -12.99F, 7.5F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 32, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38 glow
		bodyModel[611].setRotationPoint(8.5F, -12.99F, -9.5F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 37, 1, 3, 0F,-0.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38 cull
		bodyModel[612].setRotationPoint(4.5F, -14F, 7F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 32, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38
		bodyModel[613].setRotationPoint(8.5F, -13.99F, -9.99F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 37, 2, 0, 0F,-0.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 589
		bodyModel[614].setRotationPoint(4.5F, -13.99F, 9.99F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[615].setRotationPoint(44F, -3F, -9F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[616].setRotationPoint(44F, -7F, -9F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[617].setRotationPoint(43.55F, -4.5F, -9F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F); // Box 495 cull
		bodyModel[618].setRotationPoint(47.45F, -4.5F, -9F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[619].setRotationPoint(44F, -3F, 4F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[620].setRotationPoint(44F, -7F, 8F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 565 cull
		bodyModel[621].setRotationPoint(43.55F, -4.5F, 1F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 566 cull
		bodyModel[622].setRotationPoint(47.45F, -4.5F, 1F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[623].setRotationPoint(49F, -3F, -9F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[624].setRotationPoint(49F, -7F, -9F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[625].setRotationPoint(48.55F, -4.5F, -9F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F); // Box 495 cull
		bodyModel[626].setRotationPoint(52.45F, -4.5F, -9F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[627].setRotationPoint(49F, -3F, 4F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[628].setRotationPoint(49F, -7F, 8F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 565 cull
		bodyModel[629].setRotationPoint(48.55F, -4.5F, 1F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 566 cull
		bodyModel[630].setRotationPoint(52.45F, -4.5F, 1F);

		bodyModel[631].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Left seat part
		bodyModel[631].setRotationPoint(36F, -5F, -6.4F);
		bodyModel[631].rotateAngleY = -4.71238898F;

		bodyModel[632].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Left seat part
		bodyModel[632].setRotationPoint(36F, -5F, -6.4F);
		bodyModel[632].rotateAngleY = -4.71238898F;

		bodyModel[633].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[633].setRotationPoint(36F, -3F, -6.4F);
		bodyModel[633].rotateAngleY = -4.71238898F;

		bodyModel[634].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Left seat part
		bodyModel[634].setRotationPoint(36F, -4F, -6.4F);
		bodyModel[634].rotateAngleY = -4.71238898F;

		bodyModel[635].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[635].setRotationPoint(36F, -5F, -6.4F);
		bodyModel[635].rotateAngleY = -4.71238898F;

		bodyModel[636].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Left seat part
		bodyModel[636].setRotationPoint(36F, -4F, -6.4F);
		bodyModel[636].rotateAngleY = -4.71238898F;

		bodyModel[637].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[637].setRotationPoint(36F, -5F, -6.4F);
		bodyModel[637].rotateAngleY = -4.71238898F;

		bodyModel[638].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[638].setRotationPoint(36F, -1F, -6.4F);
		bodyModel[638].rotateAngleY = -3.92699082F;

		bodyModel[639].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[639].setRotationPoint(27.5F, -5F, 6.4F);
		bodyModel[639].rotateAngleY = -1.57079633F;

		bodyModel[640].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[640].setRotationPoint(27.5F, -5F, 6.4F);
		bodyModel[640].rotateAngleY = -1.57079633F;

		bodyModel[641].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[641].setRotationPoint(27.5F, -3F, 6.4F);
		bodyModel[641].rotateAngleY = -1.57079633F;

		bodyModel[642].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[642].setRotationPoint(27.5F, -4F, 6.4F);
		bodyModel[642].rotateAngleY = -1.57079633F;

		bodyModel[643].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[643].setRotationPoint(27.5F, -5F, 6.4F);
		bodyModel[643].rotateAngleY = -1.57079633F;

		bodyModel[644].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[644].setRotationPoint(27.5F, -4F, 6.4F);
		bodyModel[644].rotateAngleY = -1.57079633F;

		bodyModel[645].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[645].setRotationPoint(27.5F, -5F, 6.4F);
		bodyModel[645].rotateAngleY = -1.57079633F;

		bodyModel[646].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[646].setRotationPoint(27.5F, -1F, 6.4F);
		bodyModel[646].rotateAngleY = -0.78539816F;

		bodyModel[647].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Left seat part
		bodyModel[647].setRotationPoint(19F, -5F, -6.4F);
		bodyModel[647].rotateAngleY = -4.71238898F;

		bodyModel[648].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Left seat part
		bodyModel[648].setRotationPoint(19F, -5F, -6.4F);
		bodyModel[648].rotateAngleY = -4.71238898F;

		bodyModel[649].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[649].setRotationPoint(19F, -3F, -6.4F);
		bodyModel[649].rotateAngleY = -4.71238898F;

		bodyModel[650].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Left seat part
		bodyModel[650].setRotationPoint(19F, -4F, -6.4F);
		bodyModel[650].rotateAngleY = -4.71238898F;

		bodyModel[651].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[651].setRotationPoint(19F, -5F, -6.4F);
		bodyModel[651].rotateAngleY = -4.71238898F;

		bodyModel[652].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Left seat part
		bodyModel[652].setRotationPoint(19F, -4F, -6.4F);
		bodyModel[652].rotateAngleY = -4.71238898F;

		bodyModel[653].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[653].setRotationPoint(19F, -5F, -6.4F);
		bodyModel[653].rotateAngleY = -4.71238898F;

		bodyModel[654].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[654].setRotationPoint(19F, -1F, -6.4F);
		bodyModel[654].rotateAngleY = -3.92699082F;

		bodyModel[655].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Left seat part
		bodyModel[655].setRotationPoint(27.5F, -5F, -6.4F);
		bodyModel[655].rotateAngleY = -4.71238898F;

		bodyModel[656].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Left seat part
		bodyModel[656].setRotationPoint(27.5F, -5F, -6.4F);
		bodyModel[656].rotateAngleY = -4.71238898F;

		bodyModel[657].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[657].setRotationPoint(27.5F, -3F, -6.4F);
		bodyModel[657].rotateAngleY = -4.71238898F;

		bodyModel[658].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Left seat part
		bodyModel[658].setRotationPoint(27.5F, -4F, -6.4F);
		bodyModel[658].rotateAngleY = -4.71238898F;

		bodyModel[659].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[659].setRotationPoint(27.5F, -5F, -6.4F);
		bodyModel[659].rotateAngleY = -4.71238898F;

		bodyModel[660].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Left seat part
		bodyModel[660].setRotationPoint(27.5F, -4F, -6.4F);
		bodyModel[660].rotateAngleY = -4.71238898F;

		bodyModel[661].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[661].setRotationPoint(27.5F, -5F, -6.4F);
		bodyModel[661].rotateAngleY = -4.71238898F;

		bodyModel[662].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[662].setRotationPoint(27.5F, -1F, -6.4F);
		bodyModel[662].rotateAngleY = -3.92699082F;

		bodyModel[663].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[663].setRotationPoint(19F, -5F, 6.4F);
		bodyModel[663].rotateAngleY = -1.57079633F;

		bodyModel[664].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[664].setRotationPoint(19F, -5F, 6.4F);
		bodyModel[664].rotateAngleY = -1.57079633F;

		bodyModel[665].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[665].setRotationPoint(19F, -3F, 6.4F);
		bodyModel[665].rotateAngleY = -1.57079633F;

		bodyModel[666].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[666].setRotationPoint(19F, -8F, 6.4F);
		bodyModel[666].rotateAngleY = -1.57079633F;

		bodyModel[667].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[667].setRotationPoint(19F, -4F, 6.4F);
		bodyModel[667].rotateAngleY = -1.57079633F;

		bodyModel[668].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[668].setRotationPoint(19F, -5F, 6.4F);
		bodyModel[668].rotateAngleY = -1.57079633F;

		bodyModel[669].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[669].setRotationPoint(19F, -4F, 6.4F);
		bodyModel[669].rotateAngleY = -1.57079633F;

		bodyModel[670].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[670].setRotationPoint(19F, -5F, 6.4F);
		bodyModel[670].rotateAngleY = -1.57079633F;

		bodyModel[671].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[671].setRotationPoint(19F, -1F, 6.4F);
		bodyModel[671].rotateAngleY = -0.78539816F;

		bodyModel[672].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[672].setRotationPoint(19F, -4F, 6.4F);
		bodyModel[672].rotateAngleY = -1.57079633F;

		bodyModel[673].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[673].setRotationPoint(19F, -4.5F, 6.4F);
		bodyModel[673].rotateAngleY = -1.57079633F;

		bodyModel[674].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[674].setRotationPoint(19F, -4.5F, 6.4F);
		bodyModel[674].rotateAngleY = -1.57079633F;

		bodyModel[675].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[675].setRotationPoint(19F, -1.5F, 6.4F);
		bodyModel[675].rotateAngleY = -1.57079633F;

		bodyModel[676].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[676].setRotationPoint(27.5F, -8F, 6.4F);
		bodyModel[676].rotateAngleY = -1.57079633F;

		bodyModel[677].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[677].setRotationPoint(27.5F, -4F, 6.4F);
		bodyModel[677].rotateAngleY = -1.57079633F;

		bodyModel[678].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[678].setRotationPoint(27.5F, -4.5F, 6.4F);
		bodyModel[678].rotateAngleY = -1.57079633F;

		bodyModel[679].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[679].setRotationPoint(27.5F, -4.5F, 6.4F);
		bodyModel[679].rotateAngleY = -1.57079633F;

		bodyModel[680].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[680].setRotationPoint(27.5F, -1.5F, 6.4F);
		bodyModel[680].rotateAngleY = -1.57079633F;

		bodyModel[681].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Left seat part
		bodyModel[681].setRotationPoint(19F, -8F, -6.4F);
		bodyModel[681].rotateAngleY = -4.71238898F;

		bodyModel[682].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[682].setRotationPoint(19F, -4F, -6.4F);
		bodyModel[682].rotateAngleY = -4.71238898F;

		bodyModel[683].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[683].setRotationPoint(19F, -4.5F, -6.4F);
		bodyModel[683].rotateAngleY = -4.71238898F;

		bodyModel[684].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[684].setRotationPoint(19F, -4.5F, -6.4F);
		bodyModel[684].rotateAngleY = -4.71238898F;

		bodyModel[685].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Left seat part
		bodyModel[685].setRotationPoint(19F, -1.5F, -6.4F);
		bodyModel[685].rotateAngleY = -4.71238898F;

		bodyModel[686].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[686].setRotationPoint(27.5F, -4.5F, -6.4F);
		bodyModel[686].rotateAngleY = -4.71238898F;

		bodyModel[687].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[687].setRotationPoint(27.5F, -4.5F, -6.4F);
		bodyModel[687].rotateAngleY = -4.71238898F;

		bodyModel[688].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Left seat part
		bodyModel[688].setRotationPoint(27.5F, -1.5F, -6.4F);
		bodyModel[688].rotateAngleY = -4.71238898F;

		bodyModel[689].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[689].setRotationPoint(36F, -4.5F, -6.4F);
		bodyModel[689].rotateAngleY = -4.71238898F;

		bodyModel[690].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[690].setRotationPoint(36F, -4.5F, -6.4F);
		bodyModel[690].rotateAngleY = -4.71238898F;

		bodyModel[691].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Left seat part
		bodyModel[691].setRotationPoint(36F, -1.5F, -6.4F);
		bodyModel[691].rotateAngleY = -4.71238898F;

		bodyModel[692].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Left seat part
		bodyModel[692].setRotationPoint(27.5F, -8F, -6.4F);
		bodyModel[692].rotateAngleY = -4.71238898F;

		bodyModel[693].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[693].setRotationPoint(27.5F, -4F, -6.4F);
		bodyModel[693].rotateAngleY = -4.71238898F;

		bodyModel[694].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Left seat part
		bodyModel[694].setRotationPoint(36F, -8F, -6.4F);
		bodyModel[694].rotateAngleY = -4.71238898F;

		bodyModel[695].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[695].setRotationPoint(36F, -4F, -6.4F);
		bodyModel[695].rotateAngleY = -4.71238898F;

		bodyModel[696].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[696].setRotationPoint(36F, -5F, 6.4F);
		bodyModel[696].rotateAngleY = -1.57079633F;

		bodyModel[697].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[697].setRotationPoint(36F, -5F, 6.4F);
		bodyModel[697].rotateAngleY = -1.57079633F;

		bodyModel[698].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[698].setRotationPoint(36F, -3F, 6.4F);
		bodyModel[698].rotateAngleY = -1.57079633F;

		bodyModel[699].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[699].setRotationPoint(36F, -4F, 6.4F);
		bodyModel[699].rotateAngleY = -1.57079633F;

		bodyModel[700].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[700].setRotationPoint(36F, -5F, 6.4F);
		bodyModel[700].rotateAngleY = -1.57079633F;

		bodyModel[701].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[701].setRotationPoint(36F, -4F, 6.4F);
		bodyModel[701].rotateAngleY = -1.57079633F;

		bodyModel[702].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[702].setRotationPoint(36F, -5F, 6.4F);
		bodyModel[702].rotateAngleY = -1.57079633F;

		bodyModel[703].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[703].setRotationPoint(36F, -1F, 6.4F);
		bodyModel[703].rotateAngleY = -0.78539816F;

		bodyModel[704].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[704].setRotationPoint(36F, -8F, 6.4F);
		bodyModel[704].rotateAngleY = -1.57079633F;

		bodyModel[705].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[705].setRotationPoint(36F, -4F, 6.4F);
		bodyModel[705].rotateAngleY = -1.57079633F;

		bodyModel[706].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[706].setRotationPoint(36F, -4.5F, 6.4F);
		bodyModel[706].rotateAngleY = -1.57079633F;

		bodyModel[707].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[707].setRotationPoint(36F, -4.5F, 6.4F);
		bodyModel[707].rotateAngleY = -1.57079633F;

		bodyModel[708].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[708].setRotationPoint(36F, -1.5F, 6.4F);
		bodyModel[708].rotateAngleY = -1.57079633F;

		bodyModel[709].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[709].setRotationPoint(10.5F, -5F, 6.4F);
		bodyModel[709].rotateAngleY = -1.57079633F;

		bodyModel[710].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[710].setRotationPoint(10.5F, -5F, 6.4F);
		bodyModel[710].rotateAngleY = -1.57079633F;

		bodyModel[711].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[711].setRotationPoint(10.5F, -3F, 6.4F);
		bodyModel[711].rotateAngleY = -1.57079633F;

		bodyModel[712].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[712].setRotationPoint(10.5F, -8F, 6.4F);
		bodyModel[712].rotateAngleY = -1.57079633F;

		bodyModel[713].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[713].setRotationPoint(10.5F, -5F, 6.4F);
		bodyModel[713].rotateAngleY = -1.57079633F;

		bodyModel[714].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[714].setRotationPoint(10.5F, -4F, 6.4F);
		bodyModel[714].rotateAngleY = -1.57079633F;

		bodyModel[715].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[715].setRotationPoint(10.5F, -5F, 6.4F);
		bodyModel[715].rotateAngleY = -1.57079633F;

		bodyModel[716].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[716].setRotationPoint(10.5F, -1F, 6.4F);
		bodyModel[716].rotateAngleY = -0.78539816F;

		bodyModel[717].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[717].setRotationPoint(10.5F, -4F, 6.4F);
		bodyModel[717].rotateAngleY = -1.57079633F;

		bodyModel[718].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[718].setRotationPoint(10.5F, -4.5F, 6.4F);
		bodyModel[718].rotateAngleY = -1.57079633F;

		bodyModel[719].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[719].setRotationPoint(10.5F, -4.5F, 6.4F);
		bodyModel[719].rotateAngleY = -1.57079633F;

		bodyModel[720].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[720].setRotationPoint(10.5F, -1.5F, 6.4F);
		bodyModel[720].rotateAngleY = -1.57079633F;

		bodyModel[721].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[721].setRotationPoint(10.5F, -4F, 6.4F);
		bodyModel[721].rotateAngleY = -1.57079633F;

		bodyModel[722].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F,0F, -0.725F, 0F, -0.5F, -0.725F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[722].setRotationPoint(4.5F, -18F, -8.25F);

		bodyModel[723].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[723].setRotationPoint(4.5F, -18F, 7.25F);

		bodyModel[724].addShapeBox(0F, 0F, 0F, 1, 9, 0, 0F,-0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F); // Box 38
		bodyModel[724].setRotationPoint(41F, -15F, -9.99F);

		bodyModel[725].addShapeBox(0F, 0F, 0F, 1, 9, 0, 0F,-0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F); // Box 836
		bodyModel[725].setRotationPoint(41F, -15F, 9.99F);

		bodyModel[726].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31 cull
		bodyModel[726].setRotationPoint(52.3F, 3F, 10.02F);
		bodyModel[726].rotateAngleY = -0.21816616F;

		bodyModel[727].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[727].setRotationPoint(52.3F, 5F, 10.02F);
		bodyModel[727].rotateAngleY = -0.21816616F;

		bodyModel[728].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31 cull
		bodyModel[728].setRotationPoint(52.5F, 3F, -11F);
		bodyModel[728].rotateAngleY = 0.21816616F;

		bodyModel[729].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[729].setRotationPoint(52.5F, 5F, -11F);
		bodyModel[729].rotateAngleY = 0.21816616F;

		bodyModel[730].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[730].setRotationPoint(-58.5F, 2.5F, 5F);

		bodyModel[731].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[731].setRotationPoint(-58.5F, 4F, 6.5F);

		bodyModel[732].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F); // Box 2
		bodyModel[732].setRotationPoint(-58.5F, 7F, 9.5F);

		bodyModel[733].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[733].setRotationPoint(-58.5F, 2.5F, 6.5F);

		bodyModel[734].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[734].setRotationPoint(-58.5F, 4F, 8F);

		bodyModel[735].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[735].setRotationPoint(-58.5F, 5.5F, 8F);

		bodyModel[736].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[736].setRotationPoint(-58.5F, 5.5F, 9.5F);

		bodyModel[737].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 128
		bodyModel[737].setRotationPoint(-54.51F, 3F, 5F);

		bodyModel[738].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 128
		bodyModel[738].setRotationPoint(-54.51F, 3F, 9.5F);

		bodyModel[739].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 128
		bodyModel[739].setRotationPoint(-58.49F, 3F, 5F);

		bodyModel[740].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 128
		bodyModel[740].setRotationPoint(-58.49F, 3F, 9.5F);

		bodyModel[741].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 628
		bodyModel[741].setRotationPoint(-58.5F, 2.5F, -7F);

		bodyModel[742].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 629
		bodyModel[742].setRotationPoint(-58.5F, 4F, -8.5F);

		bodyModel[743].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 630
		bodyModel[743].setRotationPoint(-58.5F, 7F, -11.5F);

		bodyModel[744].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 631
		bodyModel[744].setRotationPoint(-58.5F, 2.5F, -6.5F);

		bodyModel[745].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 632
		bodyModel[745].setRotationPoint(-58.5F, 4F, -8F);

		bodyModel[746].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 633
		bodyModel[746].setRotationPoint(-58.5F, 5.5F, -10F);

		bodyModel[747].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 634
		bodyModel[747].setRotationPoint(-58.5F, 5.5F, -9.5F);

		bodyModel[748].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 635
		bodyModel[748].setRotationPoint(-54.51F, 3F, -9F);

		bodyModel[749].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		bodyModel[749].setRotationPoint(-54.51F, 3F, -11.5F);

		bodyModel[750].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 638
		bodyModel[750].setRotationPoint(-58.49F, 3F, -9F);

		bodyModel[751].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		bodyModel[751].setRotationPoint(-58.49F, 3F, -11.5F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 752; i++)
		{
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if(GetColor(entity)==123456){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.69, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.38, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.69, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.38, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}