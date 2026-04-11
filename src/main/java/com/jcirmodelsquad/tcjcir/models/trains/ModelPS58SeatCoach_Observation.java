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

public class ModelPS58SeatCoach_Observation extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPS58SeatCoach_Observation() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[617];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 340, 104, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 310, 116, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 74, 141, textureX, textureY); // Box 30
		bodyModel[4] = new ModelRendererTurbo(this, 74, 138, textureX, textureY); // Box 31
		bodyModel[5] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[6] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[7] = new ModelRendererTurbo(this, 347, 117, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 202, 173, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 239, 173, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 151, 163, textureX, textureY); // Box 52
		bodyModel[15] = new ModelRendererTurbo(this, 266, 174, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 141, 174, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 96, 172, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 74, 158, textureX, textureY); // Box 59
		bodyModel[20] = new ModelRendererTurbo(this, 156, 177, textureX, textureY); // Box 41
		bodyModel[21] = new ModelRendererTurbo(this, 156, 175, textureX, textureY); // Box 41
		bodyModel[22] = new ModelRendererTurbo(this, 176, 175, textureX, textureY); // Box 41
		bodyModel[23] = new ModelRendererTurbo(this, 179, 177, textureX, textureY); // Box 41
		bodyModel[24] = new ModelRendererTurbo(this, 179, 175, textureX, textureY); // Box 41
		bodyModel[25] = new ModelRendererTurbo(this, 199, 175, textureX, textureY); // Box 41
		bodyModel[26] = new ModelRendererTurbo(this, 89, 157, textureX, textureY); // Box 41
		bodyModel[27] = new ModelRendererTurbo(this, 91, 158, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 101, 158, textureX, textureY); // Box 41
		bodyModel[29] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 41
		bodyModel[30] = new ModelRendererTurbo(this, 219, 160, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 239, 160, textureX, textureY); // Box 41
		bodyModel[32] = new ModelRendererTurbo(this, 200, 162, textureX, textureY); // Box 41
		bodyModel[33] = new ModelRendererTurbo(this, 200, 160, textureX, textureY); // Box 41
		bodyModel[34] = new ModelRendererTurbo(this, 216, 160, textureX, textureY); // Box 41
		bodyModel[35] = new ModelRendererTurbo(this, 150, 156, textureX, textureY); // Box 41
		bodyModel[36] = new ModelRendererTurbo(this, 150, 154, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 162, 154, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 141, 162, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[40] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[41] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[42] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[43] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[44] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[49] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[56] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[57] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[58] = new ModelRendererTurbo(this, 21, 43, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 43, 35, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 62, 2, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 56, 1, textureX, textureY); // Box 128
		bodyModel[63] = new ModelRendererTurbo(this, 50, 1, textureX, textureY); // Box 128
		bodyModel[64] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 17, 42, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[68] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[69] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[70] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[72] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[73] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[74] = new ModelRendererTurbo(this, 188, 156, textureX, textureY); // Box 38
		bodyModel[75] = new ModelRendererTurbo(this, 195, 160, textureX, textureY); // Box 38
		bodyModel[76] = new ModelRendererTurbo(this, 197, 155, textureX, textureY); // Box 38
		bodyModel[77] = new ModelRendererTurbo(this, 183, 155, textureX, textureY); // Box 38
		bodyModel[78] = new ModelRendererTurbo(this, 203, 155, textureX, textureY); // Box 41
		bodyModel[79] = new ModelRendererTurbo(this, 222, 155, textureX, textureY); // Box 41
		bodyModel[80] = new ModelRendererTurbo(this, 212, 155, textureX, textureY); // Box 41
		bodyModel[81] = new ModelRendererTurbo(this, 231, 155, textureX, textureY); // Box 41
		bodyModel[82] = new ModelRendererTurbo(this, 223, 155, textureX, textureY); // Box 41
		bodyModel[83] = new ModelRendererTurbo(this, 204, 155, textureX, textureY); // Box 41
		bodyModel[84] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[87] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[88] = new ModelRendererTurbo(this, 51, 78, textureX, textureY); // Box 128
		bodyModel[89] = new ModelRendererTurbo(this, 60, 97, textureX, textureY); // Box 202
		bodyModel[90] = new ModelRendererTurbo(this, 63, 145, textureX, textureY); // Box 128
		bodyModel[91] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 205
		bodyModel[92] = new ModelRendererTurbo(this, 366, 87, textureX, textureY); // Box 38
		bodyModel[93] = new ModelRendererTurbo(this, 374, 103, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 373, 97, textureX, textureY); // Box 128
		bodyModel[95] = new ModelRendererTurbo(this, 372, 91, textureX, textureY); // Box 128
		bodyModel[96] = new ModelRendererTurbo(this, 370, 83, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 366, 67, textureX, textureY); // Box 248
		bodyModel[98] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 250
		bodyModel[99] = new ModelRendererTurbo(this, 373, 72, textureX, textureY); // Box 252
		bodyModel[100] = new ModelRendererTurbo(this, 372, 77, textureX, textureY); // Box 254
		bodyModel[101] = new ModelRendererTurbo(this, 371, 86, textureX, textureY); // Box 38
		bodyModel[102] = new ModelRendererTurbo(this, 385, 102, textureX, textureY); // Box 128
		bodyModel[103] = new ModelRendererTurbo(this, 414, 67, textureX, textureY); // Box 128
		bodyModel[104] = new ModelRendererTurbo(this, 384, 96, textureX, textureY); // Box 128
		bodyModel[105] = new ModelRendererTurbo(this, 383, 90, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 381, 82, textureX, textureY); // Box 128
		bodyModel[107] = new ModelRendererTurbo(this, 419, 45, textureX, textureY); // Box 128
		bodyModel[108] = new ModelRendererTurbo(this, 427, 46, textureX, textureY); // Box 128
		bodyModel[109] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 247
		bodyModel[110] = new ModelRendererTurbo(this, 385, 67, textureX, textureY); // Box 249
		bodyModel[111] = new ModelRendererTurbo(this, 384, 71, textureX, textureY); // Box 251
		bodyModel[112] = new ModelRendererTurbo(this, 383, 76, textureX, textureY); // Box 253
		bodyModel[113] = new ModelRendererTurbo(this, 413, 46, textureX, textureY); // Box 255
		bodyModel[114] = new ModelRendererTurbo(this, 411, 53, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 423, 52, textureX, textureY); // Box 128
		bodyModel[116] = new ModelRendererTurbo(this, 413, 52, textureX, textureY); // Box 153
		bodyModel[117] = new ModelRendererTurbo(this, 427, 69, textureX, textureY); // Box 128
		bodyModel[118] = new ModelRendererTurbo(this, 412, 69, textureX, textureY); // Box 128
		bodyModel[119] = new ModelRendererTurbo(this, 403, 69, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 403, 89, textureX, textureY); // Box 128
		bodyModel[121] = new ModelRendererTurbo(this, 390, 59, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 390, 98, textureX, textureY); // Box 128
		bodyModel[123] = new ModelRendererTurbo(this, 327, 52, textureX, textureY); // Box 204
		bodyModel[124] = new ModelRendererTurbo(this, 327, 57, textureX, textureY); // Box 205
		bodyModel[125] = new ModelRendererTurbo(this, 62, 59, textureX, textureY); // Box 190
		bodyModel[126] = new ModelRendererTurbo(this, 61, 55, textureX, textureY); // Box 191
		bodyModel[127] = new ModelRendererTurbo(this, 300, 21, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 299, 16, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 311, 17, textureX, textureY); // Box 275
		bodyModel[130] = new ModelRendererTurbo(this, 310, 22, textureX, textureY); // Box 276
		bodyModel[131] = new ModelRendererTurbo(this, 79, 297, textureX, textureY); // Box 209
		bodyModel[132] = new ModelRendererTurbo(this, 79, 267, textureX, textureY); // Box 209
		bodyModel[133] = new ModelRendererTurbo(this, 310, 290, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 348, 304, textureX, textureY); // Box 128
		bodyModel[135] = new ModelRendererTurbo(this, 328, 271, textureX, textureY); // Box 128
		bodyModel[136] = new ModelRendererTurbo(this, 366, 299, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 383, 306, textureX, textureY); // Box 38
		bodyModel[138] = new ModelRendererTurbo(this, 383, 314, textureX, textureY); // Box 38
		bodyModel[139] = new ModelRendererTurbo(this, 363, 281, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 397, 281, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 382, 276, textureX, textureY); // Box 128
		bodyModel[142] = new ModelRendererTurbo(this, 100, 228, textureX, textureY); // Box 38
		bodyModel[143] = new ModelRendererTurbo(this, 343, 305, textureX, textureY); // Box 128
		bodyModel[144] = new ModelRendererTurbo(this, 104, 191, textureX, textureY); // Box 38
		bodyModel[145] = new ModelRendererTurbo(this, 106, 196, textureX, textureY); // Box 38
		bodyModel[146] = new ModelRendererTurbo(this, 104, 258, textureX, textureY); // Box 275
		bodyModel[147] = new ModelRendererTurbo(this, 106, 263, textureX, textureY); // Box 276
		bodyModel[148] = new ModelRendererTurbo(this, 88, 259, textureX, textureY); // Box 275
		bodyModel[149] = new ModelRendererTurbo(this, 95, 259, textureX, textureY); // Box 275
		bodyModel[150] = new ModelRendererTurbo(this, 88, 263, textureX, textureY); // Box 275
		bodyModel[151] = new ModelRendererTurbo(this, 101, 263, textureX, textureY); // Box 276
		bodyModel[152] = new ModelRendererTurbo(this, 153, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[153] = new ModelRendererTurbo(this, 160, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[154] = new ModelRendererTurbo(this, 167, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[155] = new ModelRendererTurbo(this, 174, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[156] = new ModelRendererTurbo(this, 181, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[157] = new ModelRendererTurbo(this, 188, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[158] = new ModelRendererTurbo(this, 195, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[159] = new ModelRendererTurbo(this, 99, 267, textureX, textureY); // Right seat part
		bodyModel[160] = new ModelRendererTurbo(this, 99, 295, textureX, textureY); // Left seat part
		bodyModel[161] = new ModelRendererTurbo(this, 130, 267, textureX, textureY); // Right seat part
		bodyModel[162] = new ModelRendererTurbo(this, 130, 295, textureX, textureY); // Left seat part
		bodyModel[163] = new ModelRendererTurbo(this, 161, 267, textureX, textureY); // Right seat part
		bodyModel[164] = new ModelRendererTurbo(this, 161, 295, textureX, textureY); // Left seat part
		bodyModel[165] = new ModelRendererTurbo(this, 192, 267, textureX, textureY); // Right seat part
		bodyModel[166] = new ModelRendererTurbo(this, 192, 295, textureX, textureY); // Left seat part
		bodyModel[167] = new ModelRendererTurbo(this, 223, 267, textureX, textureY); // Right seat part
		bodyModel[168] = new ModelRendererTurbo(this, 223, 295, textureX, textureY); // Left seat part
		bodyModel[169] = new ModelRendererTurbo(this, 254, 267, textureX, textureY); // Right seat part
		bodyModel[170] = new ModelRendererTurbo(this, 254, 295, textureX, textureY); // Left seat part
		bodyModel[171] = new ModelRendererTurbo(this, 285, 267, textureX, textureY); // Right seat part
		bodyModel[172] = new ModelRendererTurbo(this, 285, 308, textureX, textureY); // Box 128
		bodyModel[173] = new ModelRendererTurbo(this, 289, 300, textureX, textureY); // Box 128
		bodyModel[174] = new ModelRendererTurbo(this, 291, 299, textureX, textureY); // Box 128
		bodyModel[175] = new ModelRendererTurbo(this, 288, 300, textureX, textureY); // Box 128
		bodyModel[176] = new ModelRendererTurbo(this, 10, 230, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[177] = new ModelRendererTurbo(this, 11, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[178] = new ModelRendererTurbo(this, 11, 238, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[179] = new ModelRendererTurbo(this, 18, 240, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[180] = new ModelRendererTurbo(this, 25, 238, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[181] = new ModelRendererTurbo(this, 24, 226, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[182] = new ModelRendererTurbo(this, 25, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[183] = new ModelRendererTurbo(this, 10, 226, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[184] = new ModelRendererTurbo(this, 17, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[185] = new ModelRendererTurbo(this, 24, 230, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[186] = new ModelRendererTurbo(this, 300, 310, textureX, textureY); // Box 128
		bodyModel[187] = new ModelRendererTurbo(this, 47, 312, textureX, textureY); // Box 209
		bodyModel[188] = new ModelRendererTurbo(this, 51, 305, textureX, textureY); // Box 209
		bodyModel[189] = new ModelRendererTurbo(this, 58, 308, textureX, textureY); // Box 209
		bodyModel[190] = new ModelRendererTurbo(this, 50, 299, textureX, textureY); // Box 209
		bodyModel[191] = new ModelRendererTurbo(this, 40, 306, textureX, textureY); // Box 209
		bodyModel[192] = new ModelRendererTurbo(this, 42, 313, textureX, textureY); // Box 209
		bodyModel[193] = new ModelRendererTurbo(this, 47, 280, textureX, textureY); // Box 470
		bodyModel[194] = new ModelRendererTurbo(this, 49, 274, textureX, textureY); // Box 471
		bodyModel[195] = new ModelRendererTurbo(this, 58, 276, textureX, textureY); // Box 472
		bodyModel[196] = new ModelRendererTurbo(this, 48, 268, textureX, textureY); // Box 473
		bodyModel[197] = new ModelRendererTurbo(this, 38, 275, textureX, textureY); // Box 474
		bodyModel[198] = new ModelRendererTurbo(this, 42, 281, textureX, textureY); // Box 475
		bodyModel[199] = new ModelRendererTurbo(this, 25, 299, textureX, textureY); // Box 492
		bodyModel[200] = new ModelRendererTurbo(this, 28, 289, textureX, textureY); // Box 493
		bodyModel[201] = new ModelRendererTurbo(this, 28, 296, textureX, textureY); // Box 492
		bodyModel[202] = new ModelRendererTurbo(this, 31, 316, textureX, textureY); // Box 498
		bodyModel[203] = new ModelRendererTurbo(this, 26, 316, textureX, textureY); // Box 499
		bodyModel[204] = new ModelRendererTurbo(this, 26, 312, textureX, textureY); // Box 493
		bodyModel[205] = new ModelRendererTurbo(this, 31, 312, textureX, textureY); // Box 493
		bodyModel[206] = new ModelRendererTurbo(this, 2, 299, textureX, textureY); // Box 492
		bodyModel[207] = new ModelRendererTurbo(this, 5, 289, textureX, textureY); // Box 493
		bodyModel[208] = new ModelRendererTurbo(this, 5, 296, textureX, textureY); // Box 492
		bodyModel[209] = new ModelRendererTurbo(this, 11, 316, textureX, textureY); // Box 498
		bodyModel[210] = new ModelRendererTurbo(this, 6, 316, textureX, textureY); // Box 499
		bodyModel[211] = new ModelRendererTurbo(this, 6, 312, textureX, textureY); // Box 493
		bodyModel[212] = new ModelRendererTurbo(this, 11, 312, textureX, textureY); // Box 493
		bodyModel[213] = new ModelRendererTurbo(this, 24, 271, textureX, textureY); // Box 526
		bodyModel[214] = new ModelRendererTurbo(this, 28, 281, textureX, textureY); // Box 527
		bodyModel[215] = new ModelRendererTurbo(this, 27, 278, textureX, textureY); // Box 532
		bodyModel[216] = new ModelRendererTurbo(this, 27, 263, textureX, textureY); // Box 533
		bodyModel[217] = new ModelRendererTurbo(this, 22, 265, textureX, textureY); // Box 534
		bodyModel[218] = new ModelRendererTurbo(this, 27, 259, textureX, textureY); // Box 535
		bodyModel[219] = new ModelRendererTurbo(this, 22, 261, textureX, textureY); // Box 546
		bodyModel[220] = new ModelRendererTurbo(this, 405, 265, textureX, textureY); // Box 38
		bodyModel[221] = new ModelRendererTurbo(this, 402, 269, textureX, textureY); // Box 38
		bodyModel[222] = new ModelRendererTurbo(this, 407, 269, textureX, textureY); // Box 38
		bodyModel[223] = new ModelRendererTurbo(this, 389, 267, textureX, textureY); // Box 38
		bodyModel[224] = new ModelRendererTurbo(this, 392, 272, textureX, textureY); // Box 38
		bodyModel[225] = new ModelRendererTurbo(this, 407, 273, textureX, textureY); // Box 38
		bodyModel[226] = new ModelRendererTurbo(this, 391, 276, textureX, textureY); // Box 38
		bodyModel[227] = new ModelRendererTurbo(this, 400, 276, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[228] = new ModelRendererTurbo(this, 371, 268, textureX, textureY); // Box 38
		bodyModel[229] = new ModelRendererTurbo(this, 374, 273, textureX, textureY); // Box 38
		bodyModel[230] = new ModelRendererTurbo(this, 373, 277, textureX, textureY); // Box 38
		bodyModel[231] = new ModelRendererTurbo(this, 410, 270, textureX, textureY); // Box 38
		bodyModel[232] = new ModelRendererTurbo(this, 337, 258, textureX, textureY); // Box 38
		bodyModel[233] = new ModelRendererTurbo(this, 336, 262, textureX, textureY); // Box 38
		bodyModel[234] = new ModelRendererTurbo(this, 341, 262, textureX, textureY); // Box 38
		bodyModel[235] = new ModelRendererTurbo(this, 337, 266, textureX, textureY); // Box 38
		bodyModel[236] = new ModelRendererTurbo(this, 328, 248, textureX, textureY); // Box 38
		bodyModel[237] = new ModelRendererTurbo(this, 326, 252, textureX, textureY); // Box 38
		bodyModel[238] = new ModelRendererTurbo(this, 332, 252, textureX, textureY); // Box 38
		bodyModel[239] = new ModelRendererTurbo(this, 329, 256, textureX, textureY); // Box 38
		bodyModel[240] = new ModelRendererTurbo(this, 335, 274, textureX, textureY); // Box 38
		bodyModel[241] = new ModelRendererTurbo(this, 329, 264, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[242] = new ModelRendererTurbo(this, 337, 279, textureX, textureY); // Box 38
		bodyModel[243] = new ModelRendererTurbo(this, 324, 240, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[244] = new ModelRendererTurbo(this, 398, 263, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[245] = new ModelRendererTurbo(this, 331, 241, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[246] = new ModelRendererTurbo(this, 317, 241, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[247] = new ModelRendererTurbo(this, 319, 258, textureX, textureY); // Box 349
		bodyModel[248] = new ModelRendererTurbo(this, 319, 244, textureX, textureY); // Box 349
		bodyModel[249] = new ModelRendererTurbo(this, 321, 249, textureX, textureY); // Box 349
		bodyModel[250] = new ModelRendererTurbo(this, 315, 267, textureX, textureY); // Box 38
		bodyModel[251] = new ModelRendererTurbo(this, 315, 278, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[252] = new ModelRendererTurbo(this, 315, 273, textureX, textureY); // Box 38
		bodyModel[253] = new ModelRendererTurbo(this, 318, 262, textureX, textureY); // Box 38
		bodyModel[254] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // Box 128
		bodyModel[255] = new ModelRendererTurbo(this, 55, 23, textureX, textureY); // Box 548
		bodyModel[256] = new ModelRendererTurbo(this, 30, 96, textureX, textureY); // Box 2
		bodyModel[257] = new ModelRendererTurbo(this, 69, 138, textureX, textureY); // Box 553
		bodyModel[258] = new ModelRendererTurbo(this, 69, 141, textureX, textureY); // Box 30
		bodyModel[259] = new ModelRendererTurbo(this, 68, 1, textureX, textureY); // Box 170
		bodyModel[260] = new ModelRendererTurbo(this, 70, 22, textureX, textureY); // Box 524
		bodyModel[261] = new ModelRendererTurbo(this, 68, 0, textureX, textureY); // Box 170
		bodyModel[262] = new ModelRendererTurbo(this, 1, 191, textureX, textureY); // Box 128
		bodyModel[263] = new ModelRendererTurbo(this, 85, 1, textureX, textureY); // Box 169
		bodyModel[264] = new ModelRendererTurbo(this, 102, 13, textureX, textureY); // Box 530
		bodyModel[265] = new ModelRendererTurbo(this, 102, 8, textureX, textureY); // Box 531
		bodyModel[266] = new ModelRendererTurbo(this, 94, 18, textureX, textureY); // Box 169
		bodyModel[267] = new ModelRendererTurbo(this, 85, 6, textureX, textureY); // Box 169
		bodyModel[268] = new ModelRendererTurbo(this, 69, 10, textureX, textureY); // Box 170
		bodyModel[269] = new ModelRendererTurbo(this, 11, 11, textureX, textureY); // Box 128
		bodyModel[270] = new ModelRendererTurbo(this, 27, 9, textureX, textureY); // Box 538
		bodyModel[271] = new ModelRendererTurbo(this, 19, 3, textureX, textureY); // Box 128
		bodyModel[272] = new ModelRendererTurbo(this, 77, 16, textureX, textureY); // Box 540
		bodyModel[273] = new ModelRendererTurbo(this, 2, 203, textureX, textureY); // Box 169
		bodyModel[274] = new ModelRendererTurbo(this, 87, 11, textureX, textureY); // Box 169
		bodyModel[275] = new ModelRendererTurbo(this, 98, 1, textureX, textureY); // Box 543
		bodyModel[276] = new ModelRendererTurbo(this, 60, 34, textureX, textureY); // Box 169
		bodyModel[277] = new ModelRendererTurbo(this, 62, 87, textureX, textureY); // Box 169
		bodyModel[278] = new ModelRendererTurbo(this, 67, 87, textureX, textureY,"lamp"); // Box 169 marker lense LF
		bodyModel[279] = new ModelRendererTurbo(this, 57, 87, textureX, textureY,"lamp"); // Box 169 marker lense LR
		bodyModel[280] = new ModelRendererTurbo(this, 62, 68, textureX, textureY); // Box 548
		bodyModel[281] = new ModelRendererTurbo(this, 67, 68, textureX, textureY,"lamp"); // Box 549 marker lense RF
		bodyModel[282] = new ModelRendererTurbo(this, 57, 68, textureX, textureY,"lamp"); // Box 547 marker lense LR
		bodyModel[283] = new ModelRendererTurbo(this, 61, 46, textureX, textureY); // Box 169
		bodyModel[284] = new ModelRendererTurbo(this, 63, 43, textureX, textureY); // Box 169
		bodyModel[285] = new ModelRendererTurbo(this, 60, 39, textureX, textureY); // Box 169
		bodyModel[286] = new ModelRendererTurbo(this, 54, 51, textureX, textureY); // Box 169
		bodyModel[287] = new ModelRendererTurbo(this, 61, 49, textureX, textureY); // Box 555
		bodyModel[288] = new ModelRendererTurbo(this, 56, 56, textureX, textureY); // Box 169
		bodyModel[289] = new ModelRendererTurbo(this, 56, 62, textureX, textureY); // Box 557
		bodyModel[290] = new ModelRendererTurbo(this, 56, 59, textureX, textureY); // Box 169
		bodyModel[291] = new ModelRendererTurbo(this, 61, 25, textureX, textureY); // Box 169
		bodyModel[292] = new ModelRendererTurbo(this, 61, 19, textureX, textureY); // Box 169
		bodyModel[293] = new ModelRendererTurbo(this, 61, 22, textureX, textureY); // Box 169
		bodyModel[294] = new ModelRendererTurbo(this, 61, 31, textureX, textureY); // Box 564
		bodyModel[295] = new ModelRendererTurbo(this, 61, 28, textureX, textureY); // Box 565
		bodyModel[296] = new ModelRendererTurbo(this, 50, 55, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[297] = new ModelRendererTurbo(this, 47, 55, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[298] = new ModelRendererTurbo(this, 48, 55, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[299] = new ModelRendererTurbo(this, 53, 55, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[300] = new ModelRendererTurbo(this, 47, 59, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[301] = new ModelRendererTurbo(this, 53, 59, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[302] = new ModelRendererTurbo(this, 50, 59, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[303] = new ModelRendererTurbo(this, 1, 242, textureX, textureY); // Box 576
		bodyModel[304] = new ModelRendererTurbo(this, 1, 232, textureX, textureY); // Box 577
		bodyModel[305] = new ModelRendererTurbo(this, 1, 239, textureX, textureY); // Box 584
		bodyModel[306] = new ModelRendererTurbo(this, 11, 258, textureX, textureY); // Box 585
		bodyModel[307] = new ModelRendererTurbo(this, 6, 258, textureX, textureY); // Box 586
		bodyModel[308] = new ModelRendererTurbo(this, 6, 254, textureX, textureY); // Box 587
		bodyModel[309] = new ModelRendererTurbo(this, 11, 254, textureX, textureY); // Box 588
		bodyModel[310] = new ModelRendererTurbo(this, 202, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[311] = new ModelRendererTurbo(this, 285, 323, textureX, textureY); // Left seat part
		bodyModel[312] = new ModelRendererTurbo(this, 285, 253, textureX, textureY); // Box 128
		bodyModel[313] = new ModelRendererTurbo(this, 285, 246, textureX, textureY); // Box 128
		bodyModel[314] = new ModelRendererTurbo(this, 294, 253, textureX, textureY); // Box 128
		bodyModel[315] = new ModelRendererTurbo(this, 300, 257, textureX, textureY); // Box 128
		bodyModel[316] = new ModelRendererTurbo(this, 306, 245, textureX, textureY); // Box 128
		bodyModel[317] = new ModelRendererTurbo(this, 304, 250, textureX, textureY); // Box 128
		bodyModel[318] = new ModelRendererTurbo(this, 302, 261, textureX, textureY); // Box 128
		bodyModel[319] = new ModelRendererTurbo(this, 1, 43, textureX, textureY,"lamp"); // Tail Sign glow
		bodyModel[320] = new ModelRendererTurbo(this, 44, 37, textureX, textureY,"lamp"); // Tail Sign glow
		bodyModel[321] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[322] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[323] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[324] = new ModelRendererTurbo(this, 353, 243, textureX, textureY); // Box 128
		bodyModel[325] = new ModelRendererTurbo(this, 72, 356, textureX, textureY); // Box 128
		bodyModel[326] = new ModelRendererTurbo(this, 72, 334, textureX, textureY); // Box 177
		bodyModel[327] = new ModelRendererTurbo(this, 72, 340, textureX, textureY); // Box 128
		bodyModel[328] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[329] = new ModelRendererTurbo(this, 453, 36, textureX, textureY); // Box 128
		bodyModel[330] = new ModelRendererTurbo(this, 453, 26, textureX, textureY); // Box 176
		bodyModel[331] = new ModelRendererTurbo(this, 419, 45, textureX, textureY); // Box 128
		bodyModel[332] = new ModelRendererTurbo(this, 84, 252, textureX, textureY); // Box 128
		bodyModel[333] = new ModelRendererTurbo(this, 164, 8, textureX, textureY); // Box 128
		bodyModel[334] = new ModelRendererTurbo(this, 209, 16, textureX, textureY); // Box 128
		bodyModel[335] = new ModelRendererTurbo(this, 175, 2, textureX, textureY); // Box 176
		bodyModel[336] = new ModelRendererTurbo(this, 113, 4, textureX, textureY); // Box 128
		bodyModel[337] = new ModelRendererTurbo(this, 72, 326, textureX, textureY); // Box 194
		bodyModel[338] = new ModelRendererTurbo(this, 72, 367, textureX, textureY); // Box 128
		bodyModel[339] = new ModelRendererTurbo(this, 72, 322, textureX, textureY); // Box 193
		bodyModel[340] = new ModelRendererTurbo(this, 72, 329, textureX, textureY); // Box 192
		bodyModel[341] = new ModelRendererTurbo(this, 72, 370, textureX, textureY); // Box 128
		bodyModel[342] = new ModelRendererTurbo(this, 72, 362, textureX, textureY); // Box 128
		bodyModel[343] = new ModelRendererTurbo(this, 60, 145, textureX, textureY); // Box 128
		bodyModel[344] = new ModelRendererTurbo(this, 74, 151, textureX, textureY); // Box 2
		bodyModel[345] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[346] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[347] = new ModelRendererTurbo(this, 69, 148, textureX, textureY); // Box 128
		bodyModel[348] = new ModelRendererTurbo(this, 69, 151, textureX, textureY); // Box 2
		bodyModel[349] = new ModelRendererTurbo(this, 74, 148, textureX, textureY); // Box 2
		bodyModel[350] = new ModelRendererTurbo(this, 71, 155, textureX, textureY); // Box 128
		bodyModel[351] = new ModelRendererTurbo(this, 275, 148, textureX, textureY); // Box 2
		bodyModel[352] = new ModelRendererTurbo(this, 275, 151, textureX, textureY); // Box 2
		bodyModel[353] = new ModelRendererTurbo(this, 266, 148, textureX, textureY); // Box 2
		bodyModel[354] = new ModelRendererTurbo(this, 266, 151, textureX, textureY); // Box 2
		bodyModel[355] = new ModelRendererTurbo(this, 256, 148, textureX, textureY); // Box 2
		bodyModel[356] = new ModelRendererTurbo(this, 259, 151, textureX, textureY); // Box 2
		bodyModel[357] = new ModelRendererTurbo(this, 281, 138, textureX, textureY); // Box 24
		bodyModel[358] = new ModelRendererTurbo(this, 281, 141, textureX, textureY); // Box 25
		bodyModel[359] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 26
		bodyModel[360] = new ModelRendererTurbo(this, 272, 141, textureX, textureY); // Box 27
		bodyModel[361] = new ModelRendererTurbo(this, 262, 138, textureX, textureY); // Box 28
		bodyModel[362] = new ModelRendererTurbo(this, 265, 141, textureX, textureY); // Box 29
		bodyModel[363] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[364] = new ModelRendererTurbo(this, 245, 151, textureX, textureY); // Box 2
		bodyModel[365] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[366] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[367] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[368] = new ModelRendererTurbo(this, 122, 151, textureX, textureY); // Box 2
		bodyModel[369] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[370] = new ModelRendererTurbo(this, 251, 141, textureX, textureY); // Box 35
		bodyModel[371] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[372] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[373] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[374] = new ModelRendererTurbo(this, 122, 141, textureX, textureY); // Box 39
		bodyModel[375] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[376] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 55
		bodyModel[377] = new ModelRendererTurbo(this, 226, 141, textureX, textureY); // Box 39
		bodyModel[378] = new ModelRendererTurbo(this, 205, 141, textureX, textureY); // Box 39
		bodyModel[379] = new ModelRendererTurbo(this, 91, 169, textureX, textureY); // Box 2
		bodyModel[380] = new ModelRendererTurbo(this, 91, 166, textureX, textureY); // Box 521
		bodyModel[381] = new ModelRendererTurbo(this, 426, 19, textureX, textureY); // Box 128
		bodyModel[382] = new ModelRendererTurbo(this, 444, 19, textureX, textureY); // Box 153
		bodyModel[383] = new ModelRendererTurbo(this, 410, 89, textureX, textureY); // Box 128
		bodyModel[384] = new ModelRendererTurbo(this, 106, 256, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[385] = new ModelRendererTurbo(this, 106, 199, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[386] = new ModelRendererTurbo(this, 283, 285, textureX, textureY); // Boc 42
		bodyModel[387] = new ModelRendererTurbo(this, 252, 285, textureX, textureY); // Boc 42
		bodyModel[388] = new ModelRendererTurbo(this, 221, 285, textureX, textureY); // Boc 42
		bodyModel[389] = new ModelRendererTurbo(this, 190, 285, textureX, textureY); // Boc 42
		bodyModel[390] = new ModelRendererTurbo(this, 159, 285, textureX, textureY); // Boc 42
		bodyModel[391] = new ModelRendererTurbo(this, 128, 285, textureX, textureY); // Boc 42
		bodyModel[392] = new ModelRendererTurbo(this, 97, 285, textureX, textureY); // Boc 42
		bodyModel[393] = new ModelRendererTurbo(this, 252, 313, textureX, textureY); // Boc 42
		bodyModel[394] = new ModelRendererTurbo(this, 221, 313, textureX, textureY); // Boc 42
		bodyModel[395] = new ModelRendererTurbo(this, 190, 313, textureX, textureY); // Boc 42
		bodyModel[396] = new ModelRendererTurbo(this, 159, 313, textureX, textureY); // Boc 42
		bodyModel[397] = new ModelRendererTurbo(this, 128, 313, textureX, textureY); // Boc 42
		bodyModel[398] = new ModelRendererTurbo(this, 97, 313, textureX, textureY); // Boc 42
		bodyModel[399] = new ModelRendererTurbo(this, 266, 325, textureX, textureY); // Box 638
		bodyModel[400] = new ModelRendererTurbo(this, 110, 267, textureX, textureY); // Right seat part
		bodyModel[401] = new ModelRendererTurbo(this, 110, 295, textureX, textureY); // Left seat part
		bodyModel[402] = new ModelRendererTurbo(this, 141, 267, textureX, textureY); // Right seat part
		bodyModel[403] = new ModelRendererTurbo(this, 141, 295, textureX, textureY); // Left seat part
		bodyModel[404] = new ModelRendererTurbo(this, 172, 267, textureX, textureY); // Right seat part
		bodyModel[405] = new ModelRendererTurbo(this, 172, 295, textureX, textureY); // Left seat part
		bodyModel[406] = new ModelRendererTurbo(this, 203, 295, textureX, textureY); // Left seat part
		bodyModel[407] = new ModelRendererTurbo(this, 234, 267, textureX, textureY); // Right seat part
		bodyModel[408] = new ModelRendererTurbo(this, 234, 295, textureX, textureY); // Left seat part
		bodyModel[409] = new ModelRendererTurbo(this, 265, 267, textureX, textureY); // Right seat part
		bodyModel[410] = new ModelRendererTurbo(this, 265, 295, textureX, textureY); // Left seat part
		bodyModel[411] = new ModelRendererTurbo(this, 296, 274, textureX, textureY); // Right seat part
		bodyModel[412] = new ModelRendererTurbo(this, 295, 267, textureX, textureY); // Right seat part
		bodyModel[413] = new ModelRendererTurbo(this, 301, 277, textureX, textureY); // Right seat part
		bodyModel[414] = new ModelRendererTurbo(this, 303, 274, textureX, textureY); // Right seat part
		bodyModel[415] = new ModelRendererTurbo(this, 296, 277, textureX, textureY); // Right seat part
		bodyModel[416] = new ModelRendererTurbo(this, 310, 274, textureX, textureY); // Right seat part
		bodyModel[417] = new ModelRendererTurbo(this, 296, 282, textureX, textureY); // Right seat part
		bodyModel[418] = new ModelRendererTurbo(this, 301, 285, textureX, textureY); // Right seat part
		bodyModel[419] = new ModelRendererTurbo(this, 303, 282, textureX, textureY); // Right seat part
		bodyModel[420] = new ModelRendererTurbo(this, 296, 285, textureX, textureY); // Right seat part
		bodyModel[421] = new ModelRendererTurbo(this, 310, 282, textureX, textureY); // Right seat part
		bodyModel[422] = new ModelRendererTurbo(this, 265, 274, textureX, textureY); // Right seat part
		bodyModel[423] = new ModelRendererTurbo(this, 270, 277, textureX, textureY); // Right seat part
		bodyModel[424] = new ModelRendererTurbo(this, 272, 274, textureX, textureY); // Right seat part
		bodyModel[425] = new ModelRendererTurbo(this, 265, 277, textureX, textureY); // Right seat part
		bodyModel[426] = new ModelRendererTurbo(this, 279, 274, textureX, textureY); // Right seat part
		bodyModel[427] = new ModelRendererTurbo(this, 265, 282, textureX, textureY); // Right seat part
		bodyModel[428] = new ModelRendererTurbo(this, 270, 285, textureX, textureY); // Right seat part
		bodyModel[429] = new ModelRendererTurbo(this, 272, 282, textureX, textureY); // Right seat part
		bodyModel[430] = new ModelRendererTurbo(this, 265, 285, textureX, textureY); // Right seat part
		bodyModel[431] = new ModelRendererTurbo(this, 279, 282, textureX, textureY); // Right seat part
		bodyModel[432] = new ModelRendererTurbo(this, 234, 274, textureX, textureY); // Right seat part
		bodyModel[433] = new ModelRendererTurbo(this, 239, 277, textureX, textureY); // Right seat part
		bodyModel[434] = new ModelRendererTurbo(this, 241, 274, textureX, textureY); // Right seat part
		bodyModel[435] = new ModelRendererTurbo(this, 234, 277, textureX, textureY); // Right seat part
		bodyModel[436] = new ModelRendererTurbo(this, 248, 274, textureX, textureY); // Right seat part
		bodyModel[437] = new ModelRendererTurbo(this, 234, 282, textureX, textureY); // Right seat part
		bodyModel[438] = new ModelRendererTurbo(this, 239, 285, textureX, textureY); // Right seat part
		bodyModel[439] = new ModelRendererTurbo(this, 241, 282, textureX, textureY); // Right seat part
		bodyModel[440] = new ModelRendererTurbo(this, 234, 285, textureX, textureY); // Right seat part
		bodyModel[441] = new ModelRendererTurbo(this, 248, 282, textureX, textureY); // Right seat part
		bodyModel[442] = new ModelRendererTurbo(this, 203, 274, textureX, textureY); // Right seat part
		bodyModel[443] = new ModelRendererTurbo(this, 208, 277, textureX, textureY); // Right seat part
		bodyModel[444] = new ModelRendererTurbo(this, 210, 274, textureX, textureY); // Right seat part
		bodyModel[445] = new ModelRendererTurbo(this, 203, 277, textureX, textureY); // Right seat part
		bodyModel[446] = new ModelRendererTurbo(this, 217, 274, textureX, textureY); // Right seat part
		bodyModel[447] = new ModelRendererTurbo(this, 203, 282, textureX, textureY); // Right seat part
		bodyModel[448] = new ModelRendererTurbo(this, 208, 285, textureX, textureY); // Right seat part
		bodyModel[449] = new ModelRendererTurbo(this, 210, 282, textureX, textureY); // Right seat part
		bodyModel[450] = new ModelRendererTurbo(this, 203, 285, textureX, textureY); // Right seat part
		bodyModel[451] = new ModelRendererTurbo(this, 217, 282, textureX, textureY); // Right seat part
		bodyModel[452] = new ModelRendererTurbo(this, 172, 274, textureX, textureY); // Right seat part
		bodyModel[453] = new ModelRendererTurbo(this, 177, 277, textureX, textureY); // Right seat part
		bodyModel[454] = new ModelRendererTurbo(this, 179, 274, textureX, textureY); // Right seat part
		bodyModel[455] = new ModelRendererTurbo(this, 172, 277, textureX, textureY); // Right seat part
		bodyModel[456] = new ModelRendererTurbo(this, 186, 274, textureX, textureY); // Right seat part
		bodyModel[457] = new ModelRendererTurbo(this, 172, 282, textureX, textureY); // Right seat part
		bodyModel[458] = new ModelRendererTurbo(this, 177, 285, textureX, textureY); // Right seat part
		bodyModel[459] = new ModelRendererTurbo(this, 179, 282, textureX, textureY); // Right seat part
		bodyModel[460] = new ModelRendererTurbo(this, 172, 285, textureX, textureY); // Right seat part
		bodyModel[461] = new ModelRendererTurbo(this, 186, 282, textureX, textureY); // Right seat part
		bodyModel[462] = new ModelRendererTurbo(this, 141, 274, textureX, textureY); // Right seat part
		bodyModel[463] = new ModelRendererTurbo(this, 146, 277, textureX, textureY); // Right seat part
		bodyModel[464] = new ModelRendererTurbo(this, 148, 274, textureX, textureY); // Right seat part
		bodyModel[465] = new ModelRendererTurbo(this, 141, 277, textureX, textureY); // Right seat part
		bodyModel[466] = new ModelRendererTurbo(this, 155, 274, textureX, textureY); // Right seat part
		bodyModel[467] = new ModelRendererTurbo(this, 141, 282, textureX, textureY); // Right seat part
		bodyModel[468] = new ModelRendererTurbo(this, 146, 285, textureX, textureY); // Right seat part
		bodyModel[469] = new ModelRendererTurbo(this, 148, 282, textureX, textureY); // Right seat part
		bodyModel[470] = new ModelRendererTurbo(this, 141, 285, textureX, textureY); // Right seat part
		bodyModel[471] = new ModelRendererTurbo(this, 155, 282, textureX, textureY); // Right seat part
		bodyModel[472] = new ModelRendererTurbo(this, 110, 274, textureX, textureY); // Right seat part
		bodyModel[473] = new ModelRendererTurbo(this, 115, 277, textureX, textureY); // Right seat part
		bodyModel[474] = new ModelRendererTurbo(this, 117, 274, textureX, textureY); // Right seat part
		bodyModel[475] = new ModelRendererTurbo(this, 110, 277, textureX, textureY); // Right seat part
		bodyModel[476] = new ModelRendererTurbo(this, 124, 274, textureX, textureY); // Right seat part
		bodyModel[477] = new ModelRendererTurbo(this, 110, 282, textureX, textureY); // Right seat part
		bodyModel[478] = new ModelRendererTurbo(this, 115, 285, textureX, textureY); // Right seat part
		bodyModel[479] = new ModelRendererTurbo(this, 117, 282, textureX, textureY); // Right seat part
		bodyModel[480] = new ModelRendererTurbo(this, 110, 285, textureX, textureY); // Right seat part
		bodyModel[481] = new ModelRendererTurbo(this, 124, 282, textureX, textureY); // Right seat part
		bodyModel[482] = new ModelRendererTurbo(this, 265, 302, textureX, textureY); // Left seat part
		bodyModel[483] = new ModelRendererTurbo(this, 270, 305, textureX, textureY); // Left seat part
		bodyModel[484] = new ModelRendererTurbo(this, 272, 302, textureX, textureY); // Left seat part
		bodyModel[485] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Left seat part
		bodyModel[486] = new ModelRendererTurbo(this, 279, 302, textureX, textureY); // Left seat part
		bodyModel[487] = new ModelRendererTurbo(this, 265, 310, textureX, textureY); // Left seat part
		bodyModel[488] = new ModelRendererTurbo(this, 270, 313, textureX, textureY); // Left seat part
		bodyModel[489] = new ModelRendererTurbo(this, 272, 310, textureX, textureY); // Left seat part
		bodyModel[490] = new ModelRendererTurbo(this, 265, 313, textureX, textureY); // Left seat part
		bodyModel[491] = new ModelRendererTurbo(this, 279, 310, textureX, textureY); // Left seat part
		bodyModel[492] = new ModelRendererTurbo(this, 234, 302, textureX, textureY); // Left seat part
		bodyModel[493] = new ModelRendererTurbo(this, 239, 305, textureX, textureY); // Left seat part
		bodyModel[494] = new ModelRendererTurbo(this, 241, 302, textureX, textureY); // Left seat part
		bodyModel[495] = new ModelRendererTurbo(this, 234, 305, textureX, textureY); // Left seat part
		bodyModel[496] = new ModelRendererTurbo(this, 248, 302, textureX, textureY); // Left seat part
		bodyModel[497] = new ModelRendererTurbo(this, 234, 310, textureX, textureY); // Left seat part
		bodyModel[498] = new ModelRendererTurbo(this, 239, 313, textureX, textureY); // Left seat part
		bodyModel[499] = new ModelRendererTurbo(this, 241, 310, textureX, textureY); // Left seat part

		bodyModel[0].addBox(0F, 0F, 0F, 117, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-60.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(60.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(56.5F, 1F, -5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[3].setRotationPoint(-60.5F, 4F, -11F);

		bodyModel[4].addShapeBox(1F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[4].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[5].setRotationPoint(-53.25F, 3F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[6].setRotationPoint(-55F, 4F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[7].setRotationPoint(60.5F, 3F, -1.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[8].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[9].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[10].setRotationPoint(43F, 4F, -1F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[11].setRotationPoint(-45F, 4F, -1F);

		bodyModel[12].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 2
		bodyModel[12].setRotationPoint(0.5F, 3F, 4F);

		bodyModel[13].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 2
		bodyModel[13].setRotationPoint(14.5F, 3F, 4F);

		bodyModel[14].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 52
		bodyModel[14].setRotationPoint(0.5F, 3F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 5, 4, 0F); // Box 2
		bodyModel[15].setRotationPoint(23.5F, 3F, 4F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 2
		bodyModel[16].setRotationPoint(-28.5F, 3F, 5F);

		bodyModel[17].addBox(0F, 0F, 0F, 17, 4, 10, 0F); // Box 2
		bodyModel[17].setRotationPoint(-28.5F, 4F, -5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[18].setRotationPoint(-28.5F, 8F, -5F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 59
		bodyModel[19].setRotationPoint(-28.5F, 3F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[20].setRotationPoint(-24.5F, 3F, 7.25F);
		bodyModel[20].rotateAngleX = -0.78539816F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[21].setRotationPoint(-24.51F, 3F, 6.75F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[22].setRotationPoint(-16.49F, 3F, 6.75F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[23].setRotationPoint(-15.5F, 3F, 7.25F);
		bodyModel[23].rotateAngleX = -0.78539816F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[24].setRotationPoint(-15.51F, 3F, 6.75F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[25].setRotationPoint(-7.49F, 3F, 6.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[26].setRotationPoint(-31F, 3F, 4F);
		bodyModel[26].rotateAngleZ = -0.78539816F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[27].setRotationPoint(-31.5F, 3F, 3.99F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[28].setRotationPoint(-31.5F, 3F, 9.01F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[29].setRotationPoint(23.5F, 4F, 0F);
		bodyModel[29].rotateAngleX = -0.78539816F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[30].setRotationPoint(23.49F, 4F, -0.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[31].setRotationPoint(31.51F, 4F, -0.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[32].setRotationPoint(23.5F, 3F, -7F);
		bodyModel[32].rotateAngleX = -0.78539816F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[33].setRotationPoint(23.49F, 3F, -7.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[34].setRotationPoint(29.51F, 3F, -7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[35].setRotationPoint(-16.5F, 3F, -7.25F);
		bodyModel[35].rotateAngleX = -0.78539816F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[36].setRotationPoint(-16.51F, 3F, -7.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[37].setRotationPoint(-12.49F, 3F, -7.75F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[38].setRotationPoint(-21F, 3F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[39].setRotationPoint(56.5F, 1F, -10.99F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[40].setRotationPoint(56.5F, 1F, 4.99F);

		bodyModel[41].addShapeBox(0F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[41].setRotationPoint(56.51F, -14F, -10.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 117, 16, 1, 0F); // Box 38
		bodyModel[42].setRotationPoint(-60.5F, -15F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 117, 16, 1, 0F); // Box 128
		bodyModel[43].setRotationPoint(-60.5F, -15F, 10F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[44].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[45].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[46].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[47].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[48].setRotationPoint(56.51F, -14F, 10.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[49].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[50].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[51].setRotationPoint(55.5F, -15F, -3F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[52].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[53].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[54].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[54].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[55].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[56].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[56].setRotationPoint(55.51F, -14F, 3F);

		bodyModel[57].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[57].setRotationPoint(-60.49F, -14F, -3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[58].setRotationPoint(-63F, -15F, -4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[59].setRotationPoint(-63F, 1F, -4F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[60].setRotationPoint(-63F, -14F, -4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[61].setRotationPoint(-63F, -14F, 3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[62].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[63].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[64].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[65].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[66].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[67].setRotationPoint(-63.5F, -16F, 0F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 119, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[68].setRotationPoint(-57.5F, -20F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 119, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[69].setRotationPoint(-57.5F, -20F, 3F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 122, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[70].setRotationPoint(-60.5F, -16F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 122, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[71].setRotationPoint(-60.5F, -16F, 10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[72].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[73].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[74].setRotationPoint(15.25F, 3F, -10.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[75].setRotationPoint(19.25F, 3F, -10.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[76].setRotationPoint(18.25F, 3F, -10.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -1.375F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, -1.375F, -0.5F, -0.25F, -0.375F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.25F, -0.375F, -0.5F); // Box 38
		bodyModel[77].setRotationPoint(14.25F, 2.75F, -10.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[78].setRotationPoint(15.55F, 3.2F, -10F);
		bodyModel[78].rotateAngleZ = -0.78539816F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[79].setRotationPoint(18.75F, 3.2F, -10F);
		bodyModel[79].rotateAngleZ = -0.78539816F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[80].setRotationPoint(15.05F, 3F, -5.99F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[81].setRotationPoint(18.25F, 3F, -5.99F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[82].setRotationPoint(18.25F, 3F, -9.99F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[83].setRotationPoint(15.05F, 3F, -9.99F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[84].setRotationPoint(56F, -6F, -12F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[85].setRotationPoint(61F, -6F, -12F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[86].setRotationPoint(56F, -6F, 11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[87].setRotationPoint(61F, -6F, 11F);

		bodyModel[88].addShapeBox(0F, 0F, -1F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[88].setRotationPoint(-61F, -6F, -10.5F);
		bodyModel[88].rotateAngleY = -0.78539816F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[89].setRotationPoint(-61F, -6F, 10.5F);
		bodyModel[89].rotateAngleY = 0.78539816F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[90].setRotationPoint(-61.5F, 6F, -10.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[91].setRotationPoint(-61.5F, 6F, 10.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[92].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[93].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[94].setRotationPoint(61.5F, -19F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[95].setRotationPoint(61.5F, -20F, -7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[96].setRotationPoint(61.5F, -20F, -3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[97].setRotationPoint(61.5F, -15F, 11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[98].setRotationPoint(61.5F, -15F, 9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[99].setRotationPoint(61.5F, -19F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[100].setRotationPoint(61.5F, -20F, 3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[101].setRotationPoint(63F, -15F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[102].setRotationPoint(63F, -16F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[103].setRotationPoint(63F, 1F, -10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[104].setRotationPoint(63F, -19F, -10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[105].setRotationPoint(63F, -20F, -7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[106].setRotationPoint(63F, -20F, -3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[107].setRotationPoint(63F, -19F, -1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[108].setRotationPoint(63F, -18.75F, -5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[109].setRotationPoint(63F, -15F, 10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[110].setRotationPoint(63F, -16F, 9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[111].setRotationPoint(63F, -19F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[112].setRotationPoint(63F, -20F, 3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[113].setRotationPoint(63F, -18.75F, 4F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[114].setRotationPoint(63F, -15F, -5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[115].setRotationPoint(63F, -16F, -4F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[116].setRotationPoint(63F, -16F, 1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[117].setRotationPoint(63F, -14F, -5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[118].setRotationPoint(63F, -14F, 3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[119].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[120].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[121].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[122].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F); // Box 204
		bodyModel[123].setRotationPoint(45F, -19.36F, -8.36F);
		bodyModel[123].rotateAngleX = -1.04283423F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, -0.5F, 0F, -0.54F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[124].setRotationPoint(45F, -17.65F, -10.92F);
		bodyModel[124].rotateAngleX = -0.41887902F;

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 190
		bodyModel[125].setRotationPoint(-53.5F, -18F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 191
		bodyModel[126].setRotationPoint(-53.5F, -18.5F, -10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F); // Box 128
		bodyModel[127].setRotationPoint(45F, -18.5F, 7.85F);
		bodyModel[127].rotateAngleX = 1.04283423F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.5F, 0F, -0.54F, -0.5F); // Box 128
		bodyModel[128].setRotationPoint(45F, -17.25F, 10F);
		bodyModel[128].rotateAngleX = 0.41887902F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -1.1F, -0.75F, 0F, -0.5F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 275
		bodyModel[129].setRotationPoint(51.5F, -18F, 10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -1F, -0.85F, 0F, -0.5F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 276
		bodyModel[130].setRotationPoint(51.5F, -18.5F, 8F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 209
		bodyModel[131].setRotationPoint(-43.5F, -15F, -10F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 209
		bodyModel[132].setRotationPoint(-43.5F, -15F, 3F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 128
		bodyModel[133].setRotationPoint(35.5F, -15F, -5F);

		bodyModel[134].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 128
		bodyModel[134].setRotationPoint(36.5F, -15F, -6F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 128
		bodyModel[135].setRotationPoint(43.5F, -15F, -6F);

		bodyModel[136].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // Box 128
		bodyModel[136].setRotationPoint(47.5F, -15F, -10F);

		bodyModel[137].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 38
		bodyModel[137].setRotationPoint(49.5F, -10F, -10F);

		bodyModel[138].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 38
		bodyModel[138].setRotationPoint(49.5F, -4F, -10F);

		bodyModel[139].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 128
		bodyModel[139].setRotationPoint(44.5F, -15F, 3F);

		bodyModel[140].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 128
		bodyModel[140].setRotationPoint(52.5F, -15F, 4F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 128
		bodyModel[141].setRotationPoint(48.5F, -15F, 4F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 78, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[142].setRotationPoint(-42.5F, -17F, -2F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[143].setRotationPoint(35.5F, -14F, -6F);

		bodyModel[144].addBox(0F, 0F, 0F, 78, 1, 3, 0F); // Box 38
		bodyModel[144].setRotationPoint(-42.5F, -14F, 7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[145].setRotationPoint(-42.5F, -13F, 9F);

		bodyModel[146].addBox(0F, 0F, 0F, 69, 1, 3, 0F); // Box 275
		bodyModel[146].setRotationPoint(-42.5F, -14F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[147].setRotationPoint(-42.5F, -13F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[148].setRotationPoint(28.5F, -14F, -10F);

		bodyModel[149].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 275
		bodyModel[149].setRotationPoint(26.5F, -14F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 275
		bodyModel[150].setRotationPoint(26.5F, -14F, -8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F); // Box 276
		bodyModel[151].setRotationPoint(26.5F, -13F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[152].setRotationPoint(-38.5F, -16.5F, -0.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[153].setRotationPoint(-28.5F, -16.5F, -0.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[154].setRotationPoint(-18.5F, -16.5F, -0.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[155].setRotationPoint(-8.5F, -16.5F, -0.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[156].setRotationPoint(1.5F, -16.5F, -0.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[157].setRotationPoint(11.5F, -16.5F, -0.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[158].setRotationPoint(21.5F, -16.5F, -0.5F);

		bodyModel[159].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[159].setRotationPoint(-36.5F, -8F, 7F);

		bodyModel[160].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[160].setRotationPoint(-36.5F, -8F, -7F);

		bodyModel[161].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[161].setRotationPoint(-26.5F, -8F, 7F);

		bodyModel[162].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[162].setRotationPoint(-26.5F, -8F, -7F);

		bodyModel[163].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[163].setRotationPoint(-16.5F, -8F, 7F);

		bodyModel[164].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[164].setRotationPoint(-16.5F, -8F, -7F);

		bodyModel[165].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[165].setRotationPoint(-6.5F, -8F, 7F);

		bodyModel[166].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[166].setRotationPoint(-6.5F, -8F, -7F);

		bodyModel[167].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[167].setRotationPoint(3.5F, -8F, 7F);

		bodyModel[168].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[168].setRotationPoint(3.5F, -8F, -7F);

		bodyModel[169].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[169].setRotationPoint(13.5F, -8F, 7F);

		bodyModel[170].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[170].setRotationPoint(13.5F, -8F, -7F);

		bodyModel[171].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[171].setRotationPoint(23.5F, -8F, 7F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 128
		bodyModel[172].setRotationPoint(29.5F, -5F, -10F);

		bodyModel[173].addBox(0F, 0F, 0F, 0, 4, 3, 0F); // Box 128
		bodyModel[173].setRotationPoint(30F, -9F, -10F);

		bodyModel[174].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 128
		bodyModel[174].setRotationPoint(30F, -10F, -10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[175].setRotationPoint(30F, -10F, -8F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[176].setRotationPoint(-59.5F, -15F, 2.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[177].setRotationPoint(-59.5F, -15F, -4.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[178].setRotationPoint(-56.5F, -15F, -8F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[179].setRotationPoint(-53F, -15F, -8F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[180].setRotationPoint(-49.5F, -15F, -8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[181].setRotationPoint(-46.5F, -15F, 2.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[182].setRotationPoint(-46.5F, -15F, -4.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[183].setRotationPoint(-56.5F, -15F, 6F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[184].setRotationPoint(-53F, -15F, 6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[185].setRotationPoint(-49.5F, -15F, 6F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[186].setRotationPoint(30.5F, -7F, -9F);

		bodyModel[187].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 209
		bodyModel[187].setRotationPoint(-45.5F, -1F, -10F);

		bodyModel[188].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 209
		bodyModel[188].setRotationPoint(-48.5F, -1F, -10F);

		bodyModel[189].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 209
		bodyModel[189].setRotationPoint(-46.5F, -3F, -10F);

		bodyModel[190].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 209
		bodyModel[190].setRotationPoint(-49.5F, -3F, -10F);

		bodyModel[191].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 209
		bodyModel[191].setRotationPoint(-49.5F, -6F, -7F);

		bodyModel[192].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 209
		bodyModel[192].setRotationPoint(-49.5F, -5F, -3.71F);
		bodyModel[192].rotateAngleY = -0.78539816F;

		bodyModel[193].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 470
		bodyModel[193].setRotationPoint(-45.5F, -1F, 4F);

		bodyModel[194].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 471
		bodyModel[194].setRotationPoint(-48.5F, -1F, 8F);

		bodyModel[195].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 472
		bodyModel[195].setRotationPoint(-46.5F, -3F, 3F);

		bodyModel[196].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 473
		bodyModel[196].setRotationPoint(-49.5F, -3F, 7F);

		bodyModel[197].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 474
		bodyModel[197].setRotationPoint(-49.5F, -6F, 3F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 475
		bodyModel[198].setRotationPoint(-49.5F, -5F, 3.71F);
		bodyModel[198].rotateAngleY = -0.78539816F;

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[199].setRotationPoint(-54.25F, -3F, -8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 493
		bodyModel[200].setRotationPoint(-54.25F, -7F, -9F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[201].setRotationPoint(-54.25F, -2.5F, -9F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 498
		bodyModel[202].setRotationPoint(-51.74F, -2.5F, -9.51F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 499
		bodyModel[203].setRotationPoint(-54.26F, -2.5F, -9.51F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[204].setRotationPoint(-54.26F, -4.5F, -9.01F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[205].setRotationPoint(-51.74F, -4.5F, -9.01F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[206].setRotationPoint(-58.75F, -3F, -8F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 493
		bodyModel[207].setRotationPoint(-58.75F, -7F, -9F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[208].setRotationPoint(-58.75F, -2.5F, -9F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 498
		bodyModel[209].setRotationPoint(-56.24F, -2.5F, -9.51F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 499
		bodyModel[210].setRotationPoint(-58.76F, -2.5F, -9.51F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[211].setRotationPoint(-58.76F, -4.5F, -9.01F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[212].setRotationPoint(-56.24F, -4.5F, -9.01F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[213].setRotationPoint(-54.25F, -3F, 4F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[214].setRotationPoint(-54.25F, -7F, 8F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[215].setRotationPoint(-54.25F, -2.5F, 8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 533
		bodyModel[216].setRotationPoint(-51.74F, -2.5F, 8.51F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 534
		bodyModel[217].setRotationPoint(-54.26F, -2.5F, 8.51F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.22F, 0F, 0F, 0.22F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 535
		bodyModel[218].setRotationPoint(-51.74F, -4.5F, 8.01F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.22F, 0F, 0F, 0.22F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[219].setRotationPoint(-54.26F, -4.5F, 8.01F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[220].setRotationPoint(53.5F, -6F, 9F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[221].setRotationPoint(53.5F, -6F, 8F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[222].setRotationPoint(54.5F, -6F, 8F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[223].setRotationPoint(49.55F, -2F, 8.55F);
		bodyModel[223].rotateAngleY = -0.78539816F;

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[224].setRotationPoint(49.9F, -1F, 8.9F);
		bodyModel[224].rotateAngleY = -0.78539816F;

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[225].setRotationPoint(54.87F, -4.5F, 8.63F);
		bodyModel[225].rotateAngleY = 0.78539816F;

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[226].setRotationPoint(49.55F, 0.5F, 8.55F);
		bodyModel[226].rotateAngleY = -0.78539816F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.85F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.35F, -0.5F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 cull
		bodyModel[227].setRotationPoint(51.5F, -4F, 9.49F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[228].setRotationPoint(47.05F, -2F, 9.95F);
		bodyModel[228].rotateAngleY = -2.35619449F;

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[229].setRotationPoint(47.4F, -1F, 9.6F);
		bodyModel[229].rotateAngleY = -2.35619449F;

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[230].setRotationPoint(47.05F, 0.5F, 9.95F);
		bodyModel[230].rotateAngleY = -2.35619449F;

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[231].setRotationPoint(54.5F, -5F, 5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[232].setRotationPoint(41.5F, -6F, 9F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[233].setRotationPoint(41.5F, -6F, 8F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[234].setRotationPoint(42.5F, -6F, 8F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[235].setRotationPoint(42.87F, -4.5F, 8.63F);
		bodyModel[235].rotateAngleY = 0.78539816F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[236].setRotationPoint(36.5F, -6F, 9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[237].setRotationPoint(37.5F, -6F, 8F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[238].setRotationPoint(36.5F, -6F, 8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[239].setRotationPoint(37.47F, -4.5F, 8.63F);
		bodyModel[239].rotateAngleY = 0.78539816F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[240].setRotationPoint(42F, -6F, 1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.85F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.35F, -0.5F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 cull
		bodyModel[241].setRotationPoint(39.25F, -4F, 9.49F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[242].setRotationPoint(42.92F, -4.5F, 1.63F);
		bodyModel[242].rotateAngleY = 0.78539816F;

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 cull
		bodyModel[243].setRotationPoint(39F, -15F, 9.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 cull
		bodyModel[244].setRotationPoint(51F, -15F, 9.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[245].setRotationPoint(41.5F, -13.5F, 9.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[246].setRotationPoint(36.5F, -13.5F, 9.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[247].setRotationPoint(36.5F, -6F, -5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[248].setRotationPoint(36.5F, -15F, -5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[249].setRotationPoint(36.5F, -13F, -5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[250].setRotationPoint(37F, -3.5F, -3.5F);
		bodyModel[250].rotateAngleY = -0.78539816F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 38 cull
		bodyModel[251].setRotationPoint(37F, -2.5F, -3.5F);
		bodyModel[251].rotateAngleY = -0.78539816F;

		bodyModel[252].addShapeBox(0F, 0F, 0F, 4, 0, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[252].setRotationPoint(37F, -1.25F, -3.5F);
		bodyModel[252].rotateAngleY = -0.78539816F;

		bodyModel[253].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38
		bodyModel[253].setRotationPoint(38.06F, -6F, -2.44F);
		bodyModel[253].rotateAngleY = -0.78539816F;

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 128
		bodyModel[254].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[255].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 2
		bodyModel[256].setRotationPoint(-61.5F, 1F, -10F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F); // Box 553
		bodyModel[257].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 30
		bodyModel[258].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 170
		bodyModel[259].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, -2F, 0F, -1F, -1F, 0F, 1.25F, 0F, -1F, 1.25F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		bodyModel[260].setRotationPoint(-61.5F, -16F, -12F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[261].setRotationPoint(-61.5F, -17F, 3F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[262].setRotationPoint(-60.5F, -17.25F, -10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -3F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 169
		bodyModel[263].setRotationPoint(-60.5F, -19F, 7F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -3F, 0.75F, 0F); // Box 530
		bodyModel[264].setRotationPoint(-60.5F, -19F, -10F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1.75F, 0F, -3F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1.32F, 0F, 0F, 0.75F, 0F, -3F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 531
		bodyModel[265].setRotationPoint(-60.5F, -19F, -10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 169
		bodyModel[266].setRotationPoint(-60.5F, -20F, -3F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1.32F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -3F, 0F, 0.75F, 0F); // Box 169
		bodyModel[267].setRotationPoint(-60.5F, -19F, 7F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -1F, 1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 170
		bodyModel[268].setRotationPoint(-61.5F, -17F, -3F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[269].setRotationPoint(-61.5F, -16F, 3F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[270].setRotationPoint(-61.5F, -16F, -10F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[271].setRotationPoint(-61.5F, -16F, -3F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, -1F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 540
		bodyModel[272].setRotationPoint(-61.5F, -17F, -10F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[273].setRotationPoint(-60.5F, -18.25F, -3F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.32F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 169
		bodyModel[274].setRotationPoint(-60.5F, -20F, 3F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -2.32F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 543
		bodyModel[275].setRotationPoint(-60.5F, -20F, -7F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F); // Box 169
		bodyModel[276].setRotationPoint(-60.5F, -20F, -1F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 169
		bodyModel[277].setRotationPoint(-56.5F, -14F, 11F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, 0F, 0F, -1F); // Box 169 marker lense LF
		bodyModel[278].setRotationPoint(-55.5F, -14F, 11F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, -0.5F, -1F); // Box 169 marker lense LR
		bodyModel[279].setRotationPoint(-56.75F, -14F, 11F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 548
		bodyModel[280].setRotationPoint(-56.5F, -14F, -12F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 549 marker lense RF
		bodyModel[281].setRotationPoint(-55.5F, -14F, -12F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 547 marker lense LR
		bodyModel[282].setRotationPoint(-56.75F, -14F, -12F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 169
		bodyModel[283].setRotationPoint(-61.5F, -20.95F, -0.35F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 169
		bodyModel[284].setRotationPoint(-61.5F, -20.95F, 0.35F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 169
		bodyModel[285].setRotationPoint(-60.5F, -20.3F, -1F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F); // Box 169
		bodyModel[286].setRotationPoint(-61.5F, -20.3F, -1F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 555
		bodyModel[287].setRotationPoint(-61.5F, -20.95F, -1.35F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 169
		bodyModel[288].setRotationPoint(-61.5F, -20.05F, 0.35F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[289].setRotationPoint(-61.5F, -20.05F, -1.35F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 169
		bodyModel[290].setRotationPoint(-61.5F, -19.7F, -0.35F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.05F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.3F, 0F, -0.05F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 169
		bodyModel[291].setRotationPoint(-57.5F, -21F, -0.35F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.95F, 0F, 0F, -0.3F, 0F, -0.7F, -0.05F, -0.5F, -0.7F, -0.05F, -0.5F, -0.7F, -0.95F, 0F, -0.7F, -0.3F); // Box 169
		bodyModel[292].setRotationPoint(-57.5F, -20.3F, 0.3F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.05F, -0.05F, -0.5F, -1F, -0.05F, -0.5F, -1F, -0.95F, 0F, -0.7F, -0.3F, 0F, -0.3F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.95F, 0F, -0.3F, -0.3F); // Box 169
		bodyModel[293].setRotationPoint(-57.5F, -21F, 0.3F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.3F, -0.5F, -0.3F, -0.95F, -0.5F, -0.3F, -0.05F, 0F, 0F, -0.05F, 0F, -0.7F, -0.3F, -0.5F, -0.7F, -0.95F, -0.5F, -0.7F, -0.05F, 0F, -0.7F, -0.05F); // Box 564
		bodyModel[294].setRotationPoint(-57.5F, -20.3F, -1.3F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.7F, -0.3F, -0.5F, -1F, -0.95F, -0.5F, -1F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.3F, -0.3F, -0.5F, 0F, -0.95F, -0.5F, 0F, -0.05F, 0F, -0.3F, -0.05F); // Box 565
		bodyModel[295].setRotationPoint(-57.5F, -21F, -1.3F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 555 rear light
		bodyModel[296].setRotationPoint(-61.51F, -20.95F, -0.35F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 555 rear light
		bodyModel[297].setRotationPoint(-61.51F, -20.95F, 0.35F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F); // Box 555 rear light
		bodyModel[298].setRotationPoint(-61.51F, -20.3F, -1F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 555 rear light
		bodyModel[299].setRotationPoint(-61.51F, -20.95F, -1.35F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 555 rear light
		bodyModel[300].setRotationPoint(-61.51F, -20.05F, 0.35F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555 rear light
		bodyModel[301].setRotationPoint(-61.51F, -20.05F, -1.35F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 555 rear light
		bodyModel[302].setRotationPoint(-61.51F, -19.7F, -0.35F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 576
		bodyModel[303].setRotationPoint(-58.75F, -3F, 4F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 577
		bodyModel[304].setRotationPoint(-58.75F, -7F, 8F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[305].setRotationPoint(-58.75F, -2.5F, 8F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 585
		bodyModel[306].setRotationPoint(-56.24F, -2.5F, 8.51F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 586
		bodyModel[307].setRotationPoint(-58.76F, -2.5F, 8.51F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.22F, 0F, 0F, 0.22F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[308].setRotationPoint(-58.76F, -4.5F, 8.01F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.22F, 0F, 0F, 0.22F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[309].setRotationPoint(-56.24F, -4.5F, 8.01F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[310].setRotationPoint(31.5F, -16.5F, -0.5F);

		bodyModel[311].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[311].setRotationPoint(23.5F, -8F, -7F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[312].setRotationPoint(29.5F, -5F, 4F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[313].setRotationPoint(30.5F, -5F, 6F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[314].setRotationPoint(30.5F, -4F, 6F);

		bodyModel[315].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 128
		bodyModel[315].setRotationPoint(32.5F, -3F, 7F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[316].setRotationPoint(34.5F, -6F, 7F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 128
		bodyModel[317].setRotationPoint(34.5F, -4F, 7F);

		bodyModel[318].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 128
		bodyModel[318].setRotationPoint(33.62F, -2F, 8F);
		bodyModel[318].rotateAngleY = -0.78539816F;

		bodyModel[319].addShapeBox(0F, 0F, 0F, 0, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Tail Sign glow
		bodyModel[319].setRotationPoint(-61.51F, -5F, 5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 0, 5, 8, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F, 0F); // Tail Sign glow
		bodyModel[320].setRotationPoint(-61.51F, -5F, -13F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 119, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[321].setRotationPoint(-57.5F, -19F, -10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 119, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[322].setRotationPoint(-57.5F, -19F, 7F);

		bodyModel[323].addBox(0F, 0F, 0F, 119, 2, 6, 0F); // Box 128
		bodyModel[323].setRotationPoint(-57.5F, -20F, -3F);

		bodyModel[324].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 128
		bodyModel[324].setRotationPoint(35.49F, -17F, -6F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 119, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[325].setRotationPoint(-57.5F, -19F, -7F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 119, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[326].setRotationPoint(-57.5F, -19F, 3F);

		bodyModel[327].addBox(0F, 0F, 0F, 119, 1, 14, 0F); // Box 128
		bodyModel[327].setRotationPoint(-57.5F, -18F, -7F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 26, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[328].setRotationPoint(35.5F, -17F, -7F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 26, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[329].setRotationPoint(35.5F, -18F, -10F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 26, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[330].setRotationPoint(35.5F, -18F, 7F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 26, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[331].setRotationPoint(35.5F, -16.25F, -10F);

		bodyModel[332].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 128
		bodyModel[332].setRotationPoint(-42.49F, -17F, 4F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 15, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[333].setRotationPoint(-57.5F, -17F, -7F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 15, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[334].setRotationPoint(-57.5F, -18F, -10F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 15, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[335].setRotationPoint(-57.5F, -18F, 7F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 15, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[336].setRotationPoint(-57.5F, -16.25F, -10F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[337].setRotationPoint(-42.5F, -18F, 7.25F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[338].setRotationPoint(-42.5F, -18F, -8.25F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[339].setRotationPoint(-42.5F, -16F, 8F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 78, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[340].setRotationPoint(-42.5F, -17F, 5.25F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[341].setRotationPoint(-42.5F, -16F, -10F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 78, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[342].setRotationPoint(-42.5F, -17F, -8.25F);

		bodyModel[343].addShapeBox(0F, -1F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[343].setRotationPoint(-61.5F, 6F, -10.5F);
		bodyModel[343].rotateAngleX = 0.2443461F;

		bodyModel[344].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[344].setRotationPoint(-60.5F, 4F, 10F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 2
		bodyModel[345].setRotationPoint(-53.25F, 3F, 10F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 2
		bodyModel[346].setRotationPoint(-55F, 4F, 10F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 128
		bodyModel[347].setRotationPoint(-61.5F, 3F, 10F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F); // Box 2
		bodyModel[348].setRotationPoint(-61.5F, 4F, 10F);

		bodyModel[349].addShapeBox(1F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[349].setRotationPoint(-61.5F, 3F, 10F);

		bodyModel[350].addShapeBox(0F, -1F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[350].setRotationPoint(-61.5F, 6F, 10.5F);
		bodyModel[350].rotateAngleX = -0.2443461F;

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[351].setRotationPoint(60.5F, 3F, 10F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[352].setRotationPoint(60.5F, 4F, 10F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[353].setRotationPoint(53.5F, 3F, 10F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[354].setRotationPoint(54.5F, 4F, 10F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 2
		bodyModel[355].setRotationPoint(52.25F, 3F, 10F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 2
		bodyModel[356].setRotationPoint(53F, 4F, 10F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[357].setRotationPoint(60.5F, 3F, -11F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[358].setRotationPoint(60.5F, 4F, -11F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[359].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[360].setRotationPoint(54.5F, 4F, -11F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[361].setRotationPoint(52.25F, 3F, -11F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[362].setRotationPoint(53F, 4F, -11F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 2
		bodyModel[363].setRotationPoint(34.75F, 3F, 10F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 2
		bodyModel[364].setRotationPoint(33F, 4F, 10F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 2
		bodyModel[365].setRotationPoint(-35.75F, 3F, 10F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 2
		bodyModel[366].setRotationPoint(-35F, 4F, 10F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[367].setRotationPoint(-34.5F, 3F, 10F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 60, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[368].setRotationPoint(-26.5F, 4F, 10F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[369].setRotationPoint(34.75F, 3F, -11F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[370].setRotationPoint(33F, 4F, -11F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[371].setRotationPoint(-35.75F, 3F, -11F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[372].setRotationPoint(-35F, 4F, -11F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[373].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 40, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[374].setRotationPoint(-26.5F, 4F, -11F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[375].setRotationPoint(-33.5F, 4F, 10F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[376].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[377].setRotationPoint(22.5F, 4F, -11F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39
		bodyModel[378].setRotationPoint(13.5F, 4F, -11F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		bodyModel[379].setRotationPoint(-27.5F, 5F, 9.75F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 521
		bodyModel[380].setRotationPoint(-27.5F, 5F, -10.75F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[381].setRotationPoint(63F, -16F, -5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[382].setRotationPoint(63F, -16F, 0F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[383].setRotationPoint(63F, 1F, -5F);

		bodyModel[384].addBox(0F, 0F, 0F, 69, 0, 1, 0F); // Box 275 glow
		bodyModel[384].setRotationPoint(-42.5F, -12.99F, -8.5F);

		bodyModel[385].addBox(0F, 0F, 0F, 78, 0, 1, 0F); // Box 285 glow
		bodyModel[385].setRotationPoint(-42.5F, -12.99F, 7.5F);

		bodyModel[386].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[386].setRotationPoint(22F, 0F, 4F);

		bodyModel[387].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[387].setRotationPoint(12F, 0F, 4F);

		bodyModel[388].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[388].setRotationPoint(2F, 0F, 4F);

		bodyModel[389].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[389].setRotationPoint(-8F, 0F, 4F);

		bodyModel[390].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[390].setRotationPoint(-18F, 0F, 4F);

		bodyModel[391].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[391].setRotationPoint(-28F, 0F, 4F);

		bodyModel[392].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[392].setRotationPoint(-38F, 0F, 4F);

		bodyModel[393].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[393].setRotationPoint(12F, 0F, -10F);

		bodyModel[394].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[394].setRotationPoint(2F, 0F, -10F);

		bodyModel[395].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[395].setRotationPoint(-8F, 0F, -10F);

		bodyModel[396].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[396].setRotationPoint(-18F, 0F, -10F);

		bodyModel[397].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[397].setRotationPoint(-28F, 0F, -10F);

		bodyModel[398].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[398].setRotationPoint(-38F, 0F, -10F);

		bodyModel[399].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 638
		bodyModel[399].setRotationPoint(22F, 0F, -10F);

		bodyModel[400].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[400].setRotationPoint(-36.5F, -3F, 7F);

		bodyModel[401].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[401].setRotationPoint(-36.5F, -3F, -7F);

		bodyModel[402].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[402].setRotationPoint(-26.5F, -3F, 7F);

		bodyModel[403].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[403].setRotationPoint(-26.5F, -3F, -7F);

		bodyModel[404].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[404].setRotationPoint(-16.5F, -3F, 7F);

		bodyModel[405].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[405].setRotationPoint(-16.5F, -3F, -7F);

		bodyModel[406].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[406].setRotationPoint(-6.5F, -3F, -7F);

		bodyModel[407].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[407].setRotationPoint(3.5F, -3F, 7F);

		bodyModel[408].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[408].setRotationPoint(3.5F, -3F, -7F);

		bodyModel[409].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[409].setRotationPoint(13.5F, -3F, 7F);

		bodyModel[410].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[410].setRotationPoint(13.5F, -3F, -7F);

		bodyModel[411].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[411].setRotationPoint(23.5F, -5F, 7F);

		bodyModel[412].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[412].setRotationPoint(23.5F, -3F, 7F);

		bodyModel[413].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[413].setRotationPoint(23.5F, -3F, 7F);

		bodyModel[414].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[414].setRotationPoint(23.5F, -5F, 7F);

		bodyModel[415].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[415].setRotationPoint(23.5F, -4.5F, 7F);

		bodyModel[416].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[416].setRotationPoint(23.5F, -4F, 7F);

		bodyModel[417].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[417].setRotationPoint(23.5F, -5F, 7F);

		bodyModel[418].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[418].setRotationPoint(23.5F, -3F, 7F);

		bodyModel[419].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[419].setRotationPoint(23.5F, -5F, 7F);

		bodyModel[420].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[420].setRotationPoint(23.5F, -4.5F, 7F);

		bodyModel[421].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[421].setRotationPoint(23.5F, -4F, 7F);

		bodyModel[422].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[422].setRotationPoint(13.5F, -5F, 7F);

		bodyModel[423].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[423].setRotationPoint(13.5F, -3F, 7F);

		bodyModel[424].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[424].setRotationPoint(13.5F, -5F, 7F);

		bodyModel[425].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[425].setRotationPoint(13.5F, -4.5F, 7F);

		bodyModel[426].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[426].setRotationPoint(13.5F, -4F, 7F);

		bodyModel[427].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[427].setRotationPoint(13.5F, -5F, 7F);

		bodyModel[428].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[428].setRotationPoint(13.5F, -3F, 7F);

		bodyModel[429].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[429].setRotationPoint(13.5F, -5F, 7F);

		bodyModel[430].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[430].setRotationPoint(13.5F, -4.5F, 7F);

		bodyModel[431].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[431].setRotationPoint(13.5F, -4F, 7F);

		bodyModel[432].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[432].setRotationPoint(3.5F, -5F, 7F);

		bodyModel[433].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[433].setRotationPoint(3.5F, -3F, 7F);

		bodyModel[434].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[434].setRotationPoint(3.5F, -5F, 7F);

		bodyModel[435].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[435].setRotationPoint(3.5F, -4.5F, 7F);

		bodyModel[436].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[436].setRotationPoint(3.5F, -4F, 7F);

		bodyModel[437].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[437].setRotationPoint(3.5F, -5F, 7F);

		bodyModel[438].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[438].setRotationPoint(3.5F, -3F, 7F);

		bodyModel[439].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[439].setRotationPoint(3.5F, -5F, 7F);

		bodyModel[440].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[440].setRotationPoint(3.5F, -4.5F, 7F);

		bodyModel[441].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[441].setRotationPoint(3.5F, -4F, 7F);

		bodyModel[442].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[442].setRotationPoint(-6.5F, -5F, 7F);

		bodyModel[443].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[443].setRotationPoint(-6.5F, -3F, 7F);

		bodyModel[444].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[444].setRotationPoint(-6.5F, -5F, 7F);

		bodyModel[445].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[445].setRotationPoint(-6.5F, -4.5F, 7F);

		bodyModel[446].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[446].setRotationPoint(-6.5F, -4F, 7F);

		bodyModel[447].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[447].setRotationPoint(-6.5F, -5F, 7F);

		bodyModel[448].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[448].setRotationPoint(-6.5F, -3F, 7F);

		bodyModel[449].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[449].setRotationPoint(-6.5F, -5F, 7F);

		bodyModel[450].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[450].setRotationPoint(-6.5F, -4.5F, 7F);

		bodyModel[451].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[451].setRotationPoint(-6.5F, -4F, 7F);

		bodyModel[452].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[452].setRotationPoint(-16.5F, -5F, 7F);

		bodyModel[453].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[453].setRotationPoint(-16.5F, -3F, 7F);

		bodyModel[454].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[454].setRotationPoint(-16.5F, -5F, 7F);

		bodyModel[455].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[455].setRotationPoint(-16.5F, -4.5F, 7F);

		bodyModel[456].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[456].setRotationPoint(-16.5F, -4F, 7F);

		bodyModel[457].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[457].setRotationPoint(-16.5F, -5F, 7F);

		bodyModel[458].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[458].setRotationPoint(-16.5F, -3F, 7F);

		bodyModel[459].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[459].setRotationPoint(-16.5F, -5F, 7F);

		bodyModel[460].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[460].setRotationPoint(-16.5F, -4.5F, 7F);

		bodyModel[461].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[461].setRotationPoint(-16.5F, -4F, 7F);

		bodyModel[462].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[462].setRotationPoint(-26.5F, -5F, 7F);

		bodyModel[463].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[463].setRotationPoint(-26.5F, -3F, 7F);

		bodyModel[464].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[464].setRotationPoint(-26.5F, -5F, 7F);

		bodyModel[465].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[465].setRotationPoint(-26.5F, -4.5F, 7F);

		bodyModel[466].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[466].setRotationPoint(-26.5F, -4F, 7F);

		bodyModel[467].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[467].setRotationPoint(-26.5F, -5F, 7F);

		bodyModel[468].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[468].setRotationPoint(-26.5F, -3F, 7F);

		bodyModel[469].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[469].setRotationPoint(-26.5F, -5F, 7F);

		bodyModel[470].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[470].setRotationPoint(-26.5F, -4.5F, 7F);

		bodyModel[471].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[471].setRotationPoint(-26.5F, -4F, 7F);

		bodyModel[472].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[472].setRotationPoint(-36.5F, -5F, 7F);

		bodyModel[473].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[473].setRotationPoint(-36.5F, -3F, 7F);

		bodyModel[474].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[474].setRotationPoint(-36.5F, -5F, 7F);

		bodyModel[475].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[475].setRotationPoint(-36.5F, -4.5F, 7F);

		bodyModel[476].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[476].setRotationPoint(-36.5F, -4F, 7F);

		bodyModel[477].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[477].setRotationPoint(-36.5F, -5F, 7F);

		bodyModel[478].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[478].setRotationPoint(-36.5F, -3F, 7F);

		bodyModel[479].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[479].setRotationPoint(-36.5F, -5F, 7F);

		bodyModel[480].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[480].setRotationPoint(-36.5F, -4.5F, 7F);

		bodyModel[481].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[481].setRotationPoint(-36.5F, -4F, 7F);

		bodyModel[482].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[482].setRotationPoint(13.5F, -5F, -7F);

		bodyModel[483].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[483].setRotationPoint(13.5F, -3F, -7F);

		bodyModel[484].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[484].setRotationPoint(13.5F, -5F, -7F);

		bodyModel[485].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[485].setRotationPoint(13.5F, -4.5F, -7F);

		bodyModel[486].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[486].setRotationPoint(13.5F, -4F, -7F);

		bodyModel[487].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[487].setRotationPoint(13.5F, -5F, -7F);

		bodyModel[488].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[488].setRotationPoint(13.5F, -3F, -7F);

		bodyModel[489].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[489].setRotationPoint(13.5F, -5F, -7F);

		bodyModel[490].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[490].setRotationPoint(13.5F, -4.5F, -7F);

		bodyModel[491].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[491].setRotationPoint(13.5F, -4F, -7F);

		bodyModel[492].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[492].setRotationPoint(3.5F, -5F, -7F);

		bodyModel[493].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[493].setRotationPoint(3.5F, -3F, -7F);

		bodyModel[494].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[494].setRotationPoint(3.5F, -5F, -7F);

		bodyModel[495].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[495].setRotationPoint(3.5F, -4.5F, -7F);

		bodyModel[496].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[496].setRotationPoint(3.5F, -4F, -7F);

		bodyModel[497].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[497].setRotationPoint(3.5F, -5F, -7F);

		bodyModel[498].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[498].setRotationPoint(3.5F, -3F, -7F);

		bodyModel[499].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[499].setRotationPoint(3.5F, -5F, -7F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 234, 313, textureX, textureY); // Left seat part
		bodyModel[501] = new ModelRendererTurbo(this, 248, 310, textureX, textureY); // Left seat part
		bodyModel[502] = new ModelRendererTurbo(this, 203, 302, textureX, textureY); // Left seat part
		bodyModel[503] = new ModelRendererTurbo(this, 208, 305, textureX, textureY); // Left seat part
		bodyModel[504] = new ModelRendererTurbo(this, 210, 302, textureX, textureY); // Left seat part
		bodyModel[505] = new ModelRendererTurbo(this, 203, 305, textureX, textureY); // Left seat part
		bodyModel[506] = new ModelRendererTurbo(this, 217, 302, textureX, textureY); // Left seat part
		bodyModel[507] = new ModelRendererTurbo(this, 203, 310, textureX, textureY); // Left seat part
		bodyModel[508] = new ModelRendererTurbo(this, 208, 313, textureX, textureY); // Left seat part
		bodyModel[509] = new ModelRendererTurbo(this, 210, 310, textureX, textureY); // Left seat part
		bodyModel[510] = new ModelRendererTurbo(this, 203, 313, textureX, textureY); // Left seat part
		bodyModel[511] = new ModelRendererTurbo(this, 217, 310, textureX, textureY); // Left seat part
		bodyModel[512] = new ModelRendererTurbo(this, 172, 302, textureX, textureY); // Left seat part
		bodyModel[513] = new ModelRendererTurbo(this, 177, 305, textureX, textureY); // Left seat part
		bodyModel[514] = new ModelRendererTurbo(this, 179, 302, textureX, textureY); // Left seat part
		bodyModel[515] = new ModelRendererTurbo(this, 172, 305, textureX, textureY); // Left seat part
		bodyModel[516] = new ModelRendererTurbo(this, 186, 302, textureX, textureY); // Left seat part
		bodyModel[517] = new ModelRendererTurbo(this, 172, 310, textureX, textureY); // Left seat part
		bodyModel[518] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Left seat part
		bodyModel[519] = new ModelRendererTurbo(this, 179, 310, textureX, textureY); // Left seat part
		bodyModel[520] = new ModelRendererTurbo(this, 172, 313, textureX, textureY); // Left seat part
		bodyModel[521] = new ModelRendererTurbo(this, 186, 310, textureX, textureY); // Left seat part
		bodyModel[522] = new ModelRendererTurbo(this, 141, 302, textureX, textureY); // Left seat part
		bodyModel[523] = new ModelRendererTurbo(this, 146, 305, textureX, textureY); // Left seat part
		bodyModel[524] = new ModelRendererTurbo(this, 148, 302, textureX, textureY); // Left seat part
		bodyModel[525] = new ModelRendererTurbo(this, 141, 305, textureX, textureY); // Left seat part
		bodyModel[526] = new ModelRendererTurbo(this, 155, 302, textureX, textureY); // Left seat part
		bodyModel[527] = new ModelRendererTurbo(this, 141, 310, textureX, textureY); // Left seat part
		bodyModel[528] = new ModelRendererTurbo(this, 146, 313, textureX, textureY); // Left seat part
		bodyModel[529] = new ModelRendererTurbo(this, 148, 310, textureX, textureY); // Left seat part
		bodyModel[530] = new ModelRendererTurbo(this, 141, 313, textureX, textureY); // Left seat part
		bodyModel[531] = new ModelRendererTurbo(this, 155, 310, textureX, textureY); // Left seat part
		bodyModel[532] = new ModelRendererTurbo(this, 110, 302, textureX, textureY); // Left seat part
		bodyModel[533] = new ModelRendererTurbo(this, 115, 305, textureX, textureY); // Left seat part
		bodyModel[534] = new ModelRendererTurbo(this, 117, 302, textureX, textureY); // Left seat part
		bodyModel[535] = new ModelRendererTurbo(this, 110, 305, textureX, textureY); // Left seat part
		bodyModel[536] = new ModelRendererTurbo(this, 124, 302, textureX, textureY); // Left seat part
		bodyModel[537] = new ModelRendererTurbo(this, 110, 310, textureX, textureY); // Left seat part
		bodyModel[538] = new ModelRendererTurbo(this, 115, 313, textureX, textureY); // Left seat part
		bodyModel[539] = new ModelRendererTurbo(this, 117, 310, textureX, textureY); // Left seat part
		bodyModel[540] = new ModelRendererTurbo(this, 110, 313, textureX, textureY); // Left seat part
		bodyModel[541] = new ModelRendererTurbo(this, 124, 310, textureX, textureY); // Left seat part
		bodyModel[542] = new ModelRendererTurbo(this, 203, 267, textureX, textureY); // Right seat part
		bodyModel[543] = new ModelRendererTurbo(this, 296, 323, textureX, textureY); // Left seat part
		bodyModel[544] = new ModelRendererTurbo(this, 317, 323, textureX, textureY); // Left seat part
		bodyModel[545] = new ModelRendererTurbo(this, 322, 326, textureX, textureY); // Left seat part
		bodyModel[546] = new ModelRendererTurbo(this, 324, 323, textureX, textureY); // Left seat part
		bodyModel[547] = new ModelRendererTurbo(this, 317, 326, textureX, textureY); // Left seat part
		bodyModel[548] = new ModelRendererTurbo(this, 331, 323, textureX, textureY); // Left seat part
		bodyModel[549] = new ModelRendererTurbo(this, 317, 331, textureX, textureY); // Left seat part
		bodyModel[550] = new ModelRendererTurbo(this, 322, 334, textureX, textureY); // Left seat part
		bodyModel[551] = new ModelRendererTurbo(this, 324, 331, textureX, textureY); // Left seat part
		bodyModel[552] = new ModelRendererTurbo(this, 317, 334, textureX, textureY); // Left seat part
		bodyModel[553] = new ModelRendererTurbo(this, 331, 331, textureX, textureY); // Left seat part
		bodyModel[554] = new ModelRendererTurbo(this, 17, 287, textureX, textureY); // Right seat part
		bodyModel[555] = new ModelRendererTurbo(this, 19, 291, textureX, textureY); // Right seat part
		bodyModel[556] = new ModelRendererTurbo(this, 17, 299, textureX, textureY); // Right seat part
		bodyModel[557] = new ModelRendererTurbo(this, 7, 273, textureX, textureY); // Right seat part
		bodyModel[558] = new ModelRendererTurbo(this, 9, 277, textureX, textureY); // Right seat part
		bodyModel[559] = new ModelRendererTurbo(this, 7, 285, textureX, textureY); // Right seat part
		bodyModel[560] = new ModelRendererTurbo(this, 80, 379, textureX, textureY); // Box 38
		bodyModel[561] = new ModelRendererTurbo(this, 72, 374, textureX, textureY); // Box 462
		bodyModel[562] = new ModelRendererTurbo(this, 89, 386, textureX, textureY); // Box 38
		bodyModel[563] = new ModelRendererTurbo(this, 89, 384, textureX, textureY); // Box 452
		bodyModel[564] = new ModelRendererTurbo(this, 38, 361, textureX, textureY); // Box 38
		bodyModel[565] = new ModelRendererTurbo(this, 75, 379, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[566] = new ModelRendererTurbo(this, 67, 373, textureX, textureY,"cull"); // Box 808 cull
		bodyModel[567] = new ModelRendererTurbo(this, 55, 321, textureX, textureY); // Box 498
		bodyModel[568] = new ModelRendererTurbo(this, 38, 321, textureX, textureY); // Box 498
		bodyModel[569] = new ModelRendererTurbo(this, 21, 321, textureX, textureY); // Box 498
		bodyModel[570] = new ModelRendererTurbo(this, 4, 321, textureX, textureY); // Box 498
		bodyModel[571] = new ModelRendererTurbo(this, 55, 249, textureX, textureY); // Box 735
		bodyModel[572] = new ModelRendererTurbo(this, 38, 249, textureX, textureY); // Box 736
		bodyModel[573] = new ModelRendererTurbo(this, 51, 230, textureX, textureY); // Box 735
		bodyModel[574] = new ModelRendererTurbo(this, 34, 230, textureX, textureY); // Box 736
		bodyModel[575] = new ModelRendererTurbo(this, 308, 132, textureX, textureY); // Box 2
		bodyModel[576] = new ModelRendererTurbo(this, 34, 124, textureX, textureY); // Box 2
		bodyModel[577] = new ModelRendererTurbo(this, 324, 86, textureX, textureY); // Box 1353
		bodyModel[578] = new ModelRendererTurbo(this, 340, 86, textureX, textureY); // Box 1354
		bodyModel[579] = new ModelRendererTurbo(this, 340, 84, textureX, textureY); // Box 1357
		bodyModel[580] = new ModelRendererTurbo(this, 324, 84, textureX, textureY); // Box 1358
		bodyModel[581] = new ModelRendererTurbo(this, 340, 90, textureX, textureY); // Box 1359
		bodyModel[582] = new ModelRendererTurbo(this, 324, 90, textureX, textureY); // Box 1360
		bodyModel[583] = new ModelRendererTurbo(this, 329, 87, textureX, textureY); // Box 1356
		bodyModel[584] = new ModelRendererTurbo(this, 331, 90, textureX, textureY); // Box 1355
		bodyModel[585] = new ModelRendererTurbo(this, 331, 100, textureX, textureY); // Right step part
		bodyModel[586] = new ModelRendererTurbo(this, 331, 104, textureX, textureY); // Right step part
		bodyModel[587] = new ModelRendererTurbo(this, 331, 94, textureX, textureY); // Right step part
		bodyModel[588] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Right step part
		bodyModel[589] = new ModelRendererTurbo(this, 329, 107, textureX, textureY); // Right step part
		bodyModel[590] = new ModelRendererTurbo(this, 326, 98, textureX, textureY); // Right step part
		bodyModel[591] = new ModelRendererTurbo(this, 340, 98, textureX, textureY); // Right step part
		bodyModel[592] = new ModelRendererTurbo(this, 326, 100, textureX, textureY); // Right step part
		bodyModel[593] = new ModelRendererTurbo(this, 340, 100, textureX, textureY); // Right step part
		bodyModel[594] = new ModelRendererTurbo(this, 326, 95, textureX, textureY); // Right step part
		bodyModel[595] = new ModelRendererTurbo(this, 340, 95, textureX, textureY); // Right step part
		bodyModel[596] = new ModelRendererTurbo(this, 324, 62, textureX, textureY); // Box 26
		bodyModel[597] = new ModelRendererTurbo(this, 340, 62, textureX, textureY); // Box 26
		bodyModel[598] = new ModelRendererTurbo(this, 340, 60, textureX, textureY); // Box 26
		bodyModel[599] = new ModelRendererTurbo(this, 324, 60, textureX, textureY); // Box 26
		bodyModel[600] = new ModelRendererTurbo(this, 340, 66, textureX, textureY); // Box 26
		bodyModel[601] = new ModelRendererTurbo(this, 324, 66, textureX, textureY); // Box 26
		bodyModel[602] = new ModelRendererTurbo(this, 329, 63, textureX, textureY); // Box 26
		bodyModel[603] = new ModelRendererTurbo(this, 331, 66, textureX, textureY); // Box 26
		bodyModel[604] = new ModelRendererTurbo(this, 331, 80, textureX, textureY); // Left step part
		bodyModel[605] = new ModelRendererTurbo(this, 331, 76, textureX, textureY); // Left step part
		bodyModel[606] = new ModelRendererTurbo(this, 331, 70, textureX, textureY); // Left step part
		bodyModel[607] = new ModelRendererTurbo(this, 340, 76, textureX, textureY); // Left step part
		bodyModel[608] = new ModelRendererTurbo(this, 326, 76, textureX, textureY); // Left step part
		bodyModel[609] = new ModelRendererTurbo(this, 340, 74, textureX, textureY); // Left step part
		bodyModel[610] = new ModelRendererTurbo(this, 326, 74, textureX, textureY); // Left step part
		bodyModel[611] = new ModelRendererTurbo(this, 326, 71, textureX, textureY); // Left step part
		bodyModel[612] = new ModelRendererTurbo(this, 340, 71, textureX, textureY); // Left step part
		bodyModel[613] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Left step part
		bodyModel[614] = new ModelRendererTurbo(this, 329, 83, textureX, textureY); // Left step part
		bodyModel[615] = new ModelRendererTurbo(this, 311, 299, textureX, textureY); // Box 128
		bodyModel[616] = new ModelRendererTurbo(this, 320, 302, textureX, textureY); // Box 128

		bodyModel[500].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[500].setRotationPoint(3.5F, -4.5F, -7F);

		bodyModel[501].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[501].setRotationPoint(3.5F, -4F, -7F);

		bodyModel[502].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[502].setRotationPoint(-6.5F, -5F, -7F);

		bodyModel[503].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[503].setRotationPoint(-6.5F, -3F, -7F);

		bodyModel[504].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[504].setRotationPoint(-6.5F, -5F, -7F);

		bodyModel[505].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[505].setRotationPoint(-6.5F, -4.5F, -7F);

		bodyModel[506].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[506].setRotationPoint(-6.5F, -4F, -7F);

		bodyModel[507].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[507].setRotationPoint(-6.5F, -5F, -7F);

		bodyModel[508].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[508].setRotationPoint(-6.5F, -3F, -7F);

		bodyModel[509].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[509].setRotationPoint(-6.5F, -5F, -7F);

		bodyModel[510].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[510].setRotationPoint(-6.5F, -4.5F, -7F);

		bodyModel[511].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[511].setRotationPoint(-6.5F, -4F, -7F);

		bodyModel[512].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[512].setRotationPoint(-16.5F, -5F, -7F);

		bodyModel[513].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[513].setRotationPoint(-16.5F, -3F, -7F);

		bodyModel[514].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[514].setRotationPoint(-16.5F, -5F, -7F);

		bodyModel[515].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[515].setRotationPoint(-16.5F, -4.5F, -7F);

		bodyModel[516].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[516].setRotationPoint(-16.5F, -4F, -7F);

		bodyModel[517].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[517].setRotationPoint(-16.5F, -5F, -7F);

		bodyModel[518].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[518].setRotationPoint(-16.5F, -3F, -7F);

		bodyModel[519].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[519].setRotationPoint(-16.5F, -5F, -7F);

		bodyModel[520].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[520].setRotationPoint(-16.5F, -4.5F, -7F);

		bodyModel[521].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[521].setRotationPoint(-16.5F, -4F, -7F);

		bodyModel[522].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[522].setRotationPoint(-26.5F, -5F, -7F);

		bodyModel[523].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[523].setRotationPoint(-26.5F, -3F, -7F);

		bodyModel[524].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[524].setRotationPoint(-26.5F, -5F, -7F);

		bodyModel[525].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[525].setRotationPoint(-26.5F, -4.5F, -7F);

		bodyModel[526].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[526].setRotationPoint(-26.5F, -4F, -7F);

		bodyModel[527].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[527].setRotationPoint(-26.5F, -5F, -7F);

		bodyModel[528].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[528].setRotationPoint(-26.5F, -3F, -7F);

		bodyModel[529].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[529].setRotationPoint(-26.5F, -5F, -7F);

		bodyModel[530].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[530].setRotationPoint(-26.5F, -4.5F, -7F);

		bodyModel[531].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[531].setRotationPoint(-26.5F, -4F, -7F);

		bodyModel[532].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[532].setRotationPoint(-36.5F, -5F, -7F);

		bodyModel[533].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[533].setRotationPoint(-36.5F, -3F, -7F);

		bodyModel[534].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[534].setRotationPoint(-36.5F, -5F, -7F);

		bodyModel[535].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[535].setRotationPoint(-36.5F, -4.5F, -7F);

		bodyModel[536].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[536].setRotationPoint(-36.5F, -4F, -7F);

		bodyModel[537].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[537].setRotationPoint(-36.5F, -5F, -7F);

		bodyModel[538].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[538].setRotationPoint(-36.5F, -3F, -7F);

		bodyModel[539].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[539].setRotationPoint(-36.5F, -5F, -7F);

		bodyModel[540].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[540].setRotationPoint(-36.5F, -4.5F, -7F);

		bodyModel[541].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[541].setRotationPoint(-36.5F, -4F, -7F);

		bodyModel[542].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[542].setRotationPoint(-6.5F, -3F, 7F);

		bodyModel[543].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[543].setRotationPoint(23.5F, -3F, -7F);

		bodyModel[544].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[544].setRotationPoint(23.5F, -5F, -7F);

		bodyModel[545].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[545].setRotationPoint(23.5F, -3F, -7F);

		bodyModel[546].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[546].setRotationPoint(23.5F, -5F, -7F);

		bodyModel[547].addShapeBox(1F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[547].setRotationPoint(23.5F, -4.5F, -7F);

		bodyModel[548].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[548].setRotationPoint(23.5F, -4F, -7F);

		bodyModel[549].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[549].setRotationPoint(23.5F, -5F, -7F);

		bodyModel[550].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[550].setRotationPoint(23.5F, -3F, -7F);

		bodyModel[551].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[551].setRotationPoint(23.5F, -5F, -7F);

		bodyModel[552].addShapeBox(1F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[552].setRotationPoint(23.5F, -4.5F, -7F);

		bodyModel[553].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[553].setRotationPoint(23.5F, -4F, -7F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[554].setRotationPoint(-56F, -5F, -4F);

		bodyModel[555].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[555].setRotationPoint(-55F, -5.5F, -3F);
		bodyModel[555].rotateAngleY = -0.78539816F;

		bodyModel[556].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[556].setRotationPoint(-56F, 0.5F, -4F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[557].setRotationPoint(-56F, -5F, 2F);

		bodyModel[558].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[558].setRotationPoint(-55F, -5.5F, 3F);
		bodyModel[558].rotateAngleY = -0.78539816F;

		bodyModel[559].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[559].setRotationPoint(-56F, 0.5F, 2F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 107, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[560].setRotationPoint(-59.5F, -10F, -9.9F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 115, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[561].setRotationPoint(-59.5F, -10F, 9.9F);

		bodyModel[562].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 38
		bodyModel[562].setRotationPoint(-47.5F, -1.5F, -11.01F);

		bodyModel[563].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 452
		bodyModel[563].setRotationPoint(-47.5F, -1.5F, 11.01F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 0, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[564].setRotationPoint(-60.4F, -10F, -9F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 38 cull
		bodyModel[565].setRotationPoint(-60.4F, -10F, -9.9F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 808 cull
		bodyModel[566].setRotationPoint(-60.4F, -10F, 8.9F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -3F, 0F, -5.5F, -3F); // Box 498
		bodyModel[567].setRotationPoint(-51.25F, -4.5F, -9F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -3F, 0F, -5.5F, -3F); // Box 498
		bodyModel[568].setRotationPoint(-54.75F, -4.5F, -9F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -3F, 0F, -5.5F, -3F); // Box 498
		bodyModel[569].setRotationPoint(-55.75F, -4.5F, -9F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -3F, 0F, -5.5F, -3F); // Box 498
		bodyModel[570].setRotationPoint(-59.25F, -4.5F, -9F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -3F, -0.5F, -5.5F, -3F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 735
		bodyModel[571].setRotationPoint(-51.25F, -4.5F, 2F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -3F, -0.5F, -5.5F, -3F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 736
		bodyModel[572].setRotationPoint(-54.75F, -4.5F, 2F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -3F, -0.5F, -5.5F, -3F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 735
		bodyModel[573].setRotationPoint(-55.75F, -4.5F, 2F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -3F, -0.5F, -5.5F, -3F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 736
		bodyModel[574].setRotationPoint(-59.25F, -4.5F, 2F);

		bodyModel[575].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[575].setRotationPoint(56.5F, 3F, -4F);

		bodyModel[576].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[576].setRotationPoint(-60.5F, 3F, -4F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[577].setRotationPoint(56.5F, 3F, 4.5F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[578].setRotationPoint(60.5F, 3F, 4.5F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[579].setRotationPoint(60.5F, 3F, 7.5F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[580].setRotationPoint(56.5F, 3F, 7.5F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1359
		bodyModel[581].setRotationPoint(60.5F, 4F, 7.5F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1360
		bodyModel[582].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[583].setRotationPoint(56.51F, 3F, 5F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[584].setRotationPoint(56.51F, 3F, 7F);

		bodyModel[585].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[585].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[586].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[586].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[587].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[587].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[588].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[588].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[589].addShapeBox(0F, 2F, 0.5F, 4, 0, 2, 0F,0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[589].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[590].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[590].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[591].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[591].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[592].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[592].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[593].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[593].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[594].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[594].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[595].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[595].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[596].setRotationPoint(56.5F, 3F, -7.5F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[597].setRotationPoint(60.5F, 3F, -7.5F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[598].setRotationPoint(60.5F, 3F, -10.5F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[599].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[600].setRotationPoint(60.5F, 4F, -10.5F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[601].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[602].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[603].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[604].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[604].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[605].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[605].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[606].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[606].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[607].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[607].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[608].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[608].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[609].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[609].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[610].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[610].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[611].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[611].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[612].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[612].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[613].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[613].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[614].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[614].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[615].setRotationPoint(35.5F, -15F, -10F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[616].setRotationPoint(35.5F, -15F, -6F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 617; i++)
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
		}
		if(GetColor(entity)==123465){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}