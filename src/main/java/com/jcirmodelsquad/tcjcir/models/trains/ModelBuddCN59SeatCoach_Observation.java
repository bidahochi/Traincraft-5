//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck_41CDO;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelBuddCN59SeatCoach_Observation extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBuddCN59SeatCoach_Observation() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[629];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 44, 116, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 322, 135, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 29, 123, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 69, 132, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 294, 119, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 33, 114, textureX, textureY); // Left trapdoor
		bodyModel[10] = new ModelRendererTurbo(this, 35, 129, textureX, textureY); // Right trapdoor
		bodyModel[11] = new ModelRendererTurbo(this, 70, 69, textureX, textureY); // Left side door
		bodyModel[12] = new ModelRendererTurbo(this, 83, 68, textureX, textureY); // Box 38
		bodyModel[13] = new ModelRendererTurbo(this, 83, 87, textureX, textureY); // Box 128
		bodyModel[14] = new ModelRendererTurbo(this, 6, 104, textureX, textureY); // Box 128
		bodyModel[15] = new ModelRendererTurbo(this, 28, 42, textureX, textureY); // Box 128
		bodyModel[16] = new ModelRendererTurbo(this, 45, 30, textureX, textureY); // Box 128
		bodyModel[17] = new ModelRendererTurbo(this, 44, 5, textureX, textureY); // Box 128
		bodyModel[18] = new ModelRendererTurbo(this, 70, 90, textureX, textureY); // Right side door
		bodyModel[19] = new ModelRendererTurbo(this, 10, 50, textureX, textureY); // Box 128
		bodyModel[20] = new ModelRendererTurbo(this, 29, 17, textureX, textureY); // Box 128
		bodyModel[21] = new ModelRendererTurbo(this, 71, 66, textureX, textureY); // Box 128
		bodyModel[22] = new ModelRendererTurbo(this, 71, 87, textureX, textureY); // Box 128
		bodyModel[23] = new ModelRendererTurbo(this, 1, 52, textureX, textureY); // Vestibule door
		bodyModel[24] = new ModelRendererTurbo(this, 64, 49, textureX, textureY); // Box 128
		bodyModel[25] = new ModelRendererTurbo(this, 64, 55, textureX, textureY); // Box 128
		bodyModel[26] = new ModelRendererTurbo(this, 64, 34, textureX, textureY); // Box 168
		bodyModel[27] = new ModelRendererTurbo(this, 64, 29, textureX, textureY); // Box 169
		bodyModel[28] = new ModelRendererTurbo(this, 64, 60, textureX, textureY); // Box 128
		bodyModel[29] = new ModelRendererTurbo(this, 64, 25, textureX, textureY); // Box 170
		bodyModel[30] = new ModelRendererTurbo(this, 32, 24, textureX, textureY); // Front gate closed
		bodyModel[31] = new ModelRendererTurbo(this, 29, 29, textureX, textureY); // Front gate open
		bodyModel[32] = new ModelRendererTurbo(this, 101, 7, textureX, textureY); // Box 128
		bodyModel[33] = new ModelRendererTurbo(this, 96, 15, textureX, textureY); // Box 128
		bodyModel[34] = new ModelRendererTurbo(this, 96, 3, textureX, textureY); // Box 176
		bodyModel[35] = new ModelRendererTurbo(this, 63, 3, textureX, textureY); // Box 128
		bodyModel[36] = new ModelRendererTurbo(this, 77, 148, textureX, textureY); // Box 2
		bodyModel[37] = new ModelRendererTurbo(this, 77, 151, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 84, 151, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 256, 148, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 77, 138, textureX, textureY); // Box 24
		bodyModel[41] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 25
		bodyModel[42] = new ModelRendererTurbo(this, 84, 141, textureX, textureY); // Box 27
		bodyModel[43] = new ModelRendererTurbo(this, 256, 138, textureX, textureY); // Box 31
		bodyModel[44] = new ModelRendererTurbo(this, 84, 148, textureX, textureY); // Box 2
		bodyModel[45] = new ModelRendererTurbo(this, 84, 138, textureX, textureY); // Box 41
		bodyModel[46] = new ModelRendererTurbo(this, 27, 3, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 14, 31, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 22, 14, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 15, 13, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 8, 13, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 64, 40, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 294, 106, textureX, textureY); // Box 2
		bodyModel[55] = new ModelRendererTurbo(this, 323, 115, textureX, textureY); // Box 2
		bodyModel[56] = new ModelRendererTurbo(this, 323, 119, textureX, textureY); // Box 174
		bodyModel[57] = new ModelRendererTurbo(this, 321, 109, textureX, textureY); // Box 2
		bodyModel[58] = new ModelRendererTurbo(this, 340, 111, textureX, textureY); // Box 2
		bodyModel[59] = new ModelRendererTurbo(this, 340, 117, textureX, textureY); // Box 161
		bodyModel[60] = new ModelRendererTurbo(this, 353, 114, textureX, textureY); // Box 2
		bodyModel[61] = new ModelRendererTurbo(this, 362, 106, textureX, textureY); // Box 2
		bodyModel[62] = new ModelRendererTurbo(this, 362, 113, textureX, textureY); // Box 163
		bodyModel[63] = new ModelRendererTurbo(this, 306, 68, textureX, textureY); // Box 38
		bodyModel[64] = new ModelRendererTurbo(this, 306, 87, textureX, textureY); // Box 175
		bodyModel[65] = new ModelRendererTurbo(this, 342, 80, textureX, textureY); // Box 38
		bodyModel[66] = new ModelRendererTurbo(this, 324, 67, textureX, textureY); // Box 2
		bodyModel[67] = new ModelRendererTurbo(this, 315, 70, textureX, textureY); // Box 38
		bodyModel[68] = new ModelRendererTurbo(this, 324, 86, textureX, textureY); // Box 176
		bodyModel[69] = new ModelRendererTurbo(this, 315, 90, textureX, textureY); // Box 177
		bodyModel[70] = new ModelRendererTurbo(this, 312, 41, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 358, 42, textureX, textureY); // Box 128
		bodyModel[72] = new ModelRendererTurbo(this, 351, 40, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 287, 41, textureX, textureY); // Box 128
		bodyModel[74] = new ModelRendererTurbo(this, 289, 60, textureX, textureY); // Box 128
		bodyModel[75] = new ModelRendererTurbo(this, 291, 55, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 293, 49, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 185
		bodyModel[78] = new ModelRendererTurbo(this, 291, 29, textureX, textureY); // Box 186
		bodyModel[79] = new ModelRendererTurbo(this, 293, 34, textureX, textureY); // Box 187
		bodyModel[80] = new ModelRendererTurbo(this, 351, 58, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 304, 60, textureX, textureY); // Box 38
		bodyModel[82] = new ModelRendererTurbo(this, 304, 25, textureX, textureY); // Box 203
		bodyModel[83] = new ModelRendererTurbo(this, 327, 50, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 263, 138, textureX, textureY); // Box 31
		bodyModel[85] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 31
		bodyModel[86] = new ModelRendererTurbo(this, 278, 138, textureX, textureY); // Box 2
		bodyModel[87] = new ModelRendererTurbo(this, 263, 148, textureX, textureY); // Box 239
		bodyModel[88] = new ModelRendererTurbo(this, 272, 148, textureX, textureY); // Box 240
		bodyModel[89] = new ModelRendererTurbo(this, 278, 148, textureX, textureY); // Box 241
		bodyModel[90] = new ModelRendererTurbo(this, 260, 141, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[91] = new ModelRendererTurbo(this, 269, 141, textureX, textureY); // Box 31
		bodyModel[92] = new ModelRendererTurbo(this, 285, 140, textureX, textureY); // Box 2
		bodyModel[93] = new ModelRendererTurbo(this, 260, 151, textureX, textureY,"cull"); // Box 245 cull
		bodyModel[94] = new ModelRendererTurbo(this, 269, 151, textureX, textureY); // Box 246
		bodyModel[95] = new ModelRendererTurbo(this, 285, 150, textureX, textureY); // Box 247
		bodyModel[96] = new ModelRendererTurbo(this, 337, 84, textureX, textureY); // Box 38
		bodyModel[97] = new ModelRendererTurbo(this, 337, 103, textureX, textureY); // Box 327
		bodyModel[98] = new ModelRendererTurbo(this, 334, 84, textureX, textureY); // Box 38
		bodyModel[99] = new ModelRendererTurbo(this, 334, 103, textureX, textureY); // Box 251
		bodyModel[100] = new ModelRendererTurbo(this, 357, 84, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[101] = new ModelRendererTurbo(this, 296, 145, textureX, textureY); // Box 472
		bodyModel[102] = new ModelRendererTurbo(this, 295, 143, textureX, textureY); // Box 38
		bodyModel[103] = new ModelRendererTurbo(this, 295, 150, textureX, textureY); // Box 327
		bodyModel[104] = new ModelRendererTurbo(this, 294, 65, textureX, textureY,"lamp"); // marker light red glow
		bodyModel[105] = new ModelRendererTurbo(this, 304, 65, textureX, textureY); // Box 38
		bodyModel[106] = new ModelRendererTurbo(this, 299, 64, textureX, textureY); // Box 38
		bodyModel[107] = new ModelRendererTurbo(this, 344, 52, textureX, textureY); // Box 260
		bodyModel[108] = new ModelRendererTurbo(this, 334, 55, textureX, textureY); // Box 266
		bodyModel[109] = new ModelRendererTurbo(this, 321, 55, textureX, textureY); // Box 267
		bodyModel[110] = new ModelRendererTurbo(this, 315, 60, textureX, textureY); // Box 38
		bodyModel[111] = new ModelRendererTurbo(this, 346, 59, textureX, textureY); // Box 2
		bodyModel[112] = new ModelRendererTurbo(this, 355, 26, textureX, textureY); // Box 291
		bodyModel[113] = new ModelRendererTurbo(this, 315, 25, textureX, textureY); // Box 296
		bodyModel[114] = new ModelRendererTurbo(this, 323, 60, textureX, textureY); // Box 2
		bodyModel[115] = new ModelRendererTurbo(this, 347, 19, textureX, textureY); // Box 304
		bodyModel[116] = new ModelRendererTurbo(this, 315, 86, textureX, textureY); // Box 305
		bodyModel[117] = new ModelRendererTurbo(this, 346, 25, textureX, textureY); // Box 307
		bodyModel[118] = new ModelRendererTurbo(this, 118, 185, textureX, textureY); // Box 38
		bodyModel[119] = new ModelRendererTurbo(this, 71, 187, textureX, textureY); // Box 38
		bodyModel[120] = new ModelRendererTurbo(this, 118, 181, textureX, textureY); // Box 451
		bodyModel[121] = new ModelRendererTurbo(this, 71, 183, textureX, textureY); // Box 452
		bodyModel[122] = new ModelRendererTurbo(this, 84, 354, textureX, textureY); // Box 38
		bodyModel[123] = new ModelRendererTurbo(this, 84, 359, textureX, textureY); // Box 462
		bodyModel[124] = new ModelRendererTurbo(this, 10, 73, textureX, textureY); // Box 128
		bodyModel[125] = new ModelRendererTurbo(this, 13, 73, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 10, 96, textureX, textureY); // Box 202
		bodyModel[127] = new ModelRendererTurbo(this, 13, 96, textureX, textureY); // Box 203
		bodyModel[128] = new ModelRendererTurbo(this, 69, 151, textureX, textureY); // Box 2
		bodyModel[129] = new ModelRendererTurbo(this, 69, 141, textureX, textureY); // Box 192
		bodyModel[130] = new ModelRendererTurbo(this, 340, 40, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 329, 44, textureX, textureY); // Box 128
		bodyModel[132] = new ModelRendererTurbo(this, 312, 50, textureX, textureY); // Box 265
		bodyModel[133] = new ModelRendererTurbo(this, 308, 55, textureX, textureY); // Box 268
		bodyModel[134] = new ModelRendererTurbo(this, 41, 252, textureX, textureY); // Box 128
		bodyModel[135] = new ModelRendererTurbo(this, 41, 274, textureX, textureY); // Box 177
		bodyModel[136] = new ModelRendererTurbo(this, 31, 258, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 18, 246, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 18, 218, textureX, textureY); // Box 185
		bodyModel[139] = new ModelRendererTurbo(this, 1, 191, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 1, 224, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 55, 207, textureX, textureY); // Box 128
		bodyModel[142] = new ModelRendererTurbo(this, 81, 215, textureX, textureY); // Box 128
		bodyModel[143] = new ModelRendererTurbo(this, 81, 202, textureX, textureY); // Box 324
		bodyModel[144] = new ModelRendererTurbo(this, 84, 200, textureX, textureY,"lamp"); // Box 324 glow
		bodyModel[145] = new ModelRendererTurbo(this, 84, 220, textureX, textureY,"lamp"); // Box 338 glow
		bodyModel[146] = new ModelRendererTurbo(this, 312, 327, textureX, textureY); // Box 332
		bodyModel[147] = new ModelRendererTurbo(this, 312, 257, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 312, 254, textureX, textureY); // Box 128
		bodyModel[149] = new ModelRendererTurbo(this, 312, 333, textureX, textureY); // Box 329
		bodyModel[150] = new ModelRendererTurbo(this, 312, 330, textureX, textureY); // Box 330
		bodyModel[151] = new ModelRendererTurbo(this, 313, 264, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[152] = new ModelRendererTurbo(this, 313, 340, textureX, textureY,"lamp"); // Box 340 glow
		bodyModel[153] = new ModelRendererTurbo(this, 346, 274, textureX, textureY); // Box 128
		bodyModel[154] = new ModelRendererTurbo(this, 372, 24, textureX, textureY); // Box 1353
		bodyModel[155] = new ModelRendererTurbo(this, 388, 24, textureX, textureY); // Box 1354
		bodyModel[156] = new ModelRendererTurbo(this, 372, 22, textureX, textureY); // Box 1358
		bodyModel[157] = new ModelRendererTurbo(this, 388, 28, textureX, textureY); // Box 1359
		bodyModel[158] = new ModelRendererTurbo(this, 372, 28, textureX, textureY); // Box 1360
		bodyModel[159] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 1356
		bodyModel[160] = new ModelRendererTurbo(this, 379, 28, textureX, textureY); // Box 1355
		bodyModel[161] = new ModelRendererTurbo(this, 379, 38, textureX, textureY); // Right step part
		bodyModel[162] = new ModelRendererTurbo(this, 379, 42, textureX, textureY); // Right step part
		bodyModel[163] = new ModelRendererTurbo(this, 379, 32, textureX, textureY); // Right step part
		bodyModel[164] = new ModelRendererTurbo(this, 377, 45, textureX, textureY); // Right step part
		bodyModel[165] = new ModelRendererTurbo(this, 374, 36, textureX, textureY); // Right step part
		bodyModel[166] = new ModelRendererTurbo(this, 388, 36, textureX, textureY); // Right step part
		bodyModel[167] = new ModelRendererTurbo(this, 374, 38, textureX, textureY); // Right step part
		bodyModel[168] = new ModelRendererTurbo(this, 388, 38, textureX, textureY); // Right step part
		bodyModel[169] = new ModelRendererTurbo(this, 374, 33, textureX, textureY); // Right step part
		bodyModel[170] = new ModelRendererTurbo(this, 388, 33, textureX, textureY); // Right step part
		bodyModel[171] = new ModelRendererTurbo(this, 388, 22, textureX, textureY); // Box 1357
		bodyModel[172] = new ModelRendererTurbo(this, 372, 0, textureX, textureY); // Box 26
		bodyModel[173] = new ModelRendererTurbo(this, 388, 0, textureX, textureY); // Box 26
		bodyModel[174] = new ModelRendererTurbo(this, 388, -2, textureX, textureY); // Box 26
		bodyModel[175] = new ModelRendererTurbo(this, 372, -2, textureX, textureY); // Box 26
		bodyModel[176] = new ModelRendererTurbo(this, 388, 4, textureX, textureY); // Box 26
		bodyModel[177] = new ModelRendererTurbo(this, 372, 4, textureX, textureY); // Box 26
		bodyModel[178] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 26
		bodyModel[179] = new ModelRendererTurbo(this, 379, 4, textureX, textureY); // Box 26
		bodyModel[180] = new ModelRendererTurbo(this, 379, 18, textureX, textureY); // Left step part
		bodyModel[181] = new ModelRendererTurbo(this, 379, 14, textureX, textureY); // Left step part
		bodyModel[182] = new ModelRendererTurbo(this, 379, 8, textureX, textureY); // Left step part
		bodyModel[183] = new ModelRendererTurbo(this, 374, 9, textureX, textureY); // Left step part
		bodyModel[184] = new ModelRendererTurbo(this, 377, 11, textureX, textureY); // Left step part
		bodyModel[185] = new ModelRendererTurbo(this, 377, 21, textureX, textureY); // Left step part
		bodyModel[186] = new ModelRendererTurbo(this, 388, 9, textureX, textureY); // Left step part
		bodyModel[187] = new ModelRendererTurbo(this, 26, 140, textureX, textureY); // Box 2
		bodyModel[188] = new ModelRendererTurbo(this, 69, 148, textureX, textureY); // Box 2
		bodyModel[189] = new ModelRendererTurbo(this, 60, 138, textureX, textureY); // Box 192
		bodyModel[190] = new ModelRendererTurbo(this, 60, 148, textureX, textureY); // Box 475
		bodyModel[191] = new ModelRendererTurbo(this, 69, 138, textureX, textureY); // Box 479
		bodyModel[192] = new ModelRendererTurbo(this, 47, 77, textureX, textureY); // Box 128
		bodyModel[193] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[194] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[195] = new ModelRendererTurbo(this, 17, 101, textureX, textureY); // Box 128
		bodyModel[196] = new ModelRendererTurbo(this, 26, 99, textureX, textureY); // Box 128
		bodyModel[197] = new ModelRendererTurbo(this, 3, 140, textureX, textureY); // Box 128
		bodyModel[198] = new ModelRendererTurbo(this, 16, 95, textureX, textureY); // Box 128
		bodyModel[199] = new ModelRendererTurbo(this, 25, 95, textureX, textureY); // Box 128
		bodyModel[200] = new ModelRendererTurbo(this, 17, 90, textureX, textureY); // Box 128
		bodyModel[201] = new ModelRendererTurbo(this, 24, 90, textureX, textureY); // Box 128
		bodyModel[202] = new ModelRendererTurbo(this, 13, 82, textureX, textureY); // Box 128
		bodyModel[203] = new ModelRendererTurbo(this, 22, 83, textureX, textureY); // Box 128
		bodyModel[204] = new ModelRendererTurbo(this, 59, 91, textureX, textureY); // Box 128
		bodyModel[205] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[206] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[207] = new ModelRendererTurbo(this, 17, 67, textureX, textureY); // Box 249
		bodyModel[208] = new ModelRendererTurbo(this, 26, 71, textureX, textureY); // Box 250
		bodyModel[209] = new ModelRendererTurbo(this, 16, 71, textureX, textureY); // Box 251
		bodyModel[210] = new ModelRendererTurbo(this, 25, 74, textureX, textureY); // Box 252
		bodyModel[211] = new ModelRendererTurbo(this, 17, 77, textureX, textureY); // Box 253
		bodyModel[212] = new ModelRendererTurbo(this, 24, 78, textureX, textureY); // Box 254
		bodyModel[213] = new ModelRendererTurbo(this, 60, 81, textureX, textureY); // Box 255
		bodyModel[214] = new ModelRendererTurbo(this, 55, 94, textureX, textureY); // Box 128
		bodyModel[215] = new ModelRendererTurbo(this, 55, 67, textureX, textureY); // Box 261
		bodyModel[216] = new ModelRendererTurbo(this, 47, 91, textureX, textureY); // Box 128
		bodyModel[217] = new ModelRendererTurbo(this, 47, 69, textureX, textureY); // Box 336
		bodyModel[218] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[219] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[220] = new ModelRendererTurbo(this, 249, 148, textureX, textureY); // Box 2
		bodyModel[221] = new ModelRendererTurbo(this, 249, 138, textureX, textureY); // Box 29
		bodyModel[222] = new ModelRendererTurbo(this, 242, 151, textureX, textureY); // Box 2
		bodyModel[223] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[224] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[225] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[226] = new ModelRendererTurbo(this, 242, 141, textureX, textureY); // Box 35
		bodyModel[227] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[228] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[229] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 39
		bodyModel[230] = new ModelRendererTurbo(this, 74, 164, textureX, textureY); // Box 2
		bodyModel[231] = new ModelRendererTurbo(this, 74, 157, textureX, textureY); // Box 41
		bodyModel[232] = new ModelRendererTurbo(this, 265, 164, textureX, textureY); // Box 2
		bodyModel[233] = new ModelRendererTurbo(this, 265, 157, textureX, textureY); // Box 41
		bodyModel[234] = new ModelRendererTurbo(this, 74, 167, textureX, textureY); // Box 2
		bodyModel[235] = new ModelRendererTurbo(this, 265, 167, textureX, textureY); // Box 2
		bodyModel[236] = new ModelRendererTurbo(this, 74, 160, textureX, textureY); // Box 39
		bodyModel[237] = new ModelRendererTurbo(this, 265, 160, textureX, textureY); // Box 39
		bodyModel[238] = new ModelRendererTurbo(this, 142, 20, textureX, textureY); // Box 128
		bodyModel[239] = new ModelRendererTurbo(this, 142, 1, textureX, textureY); // Box 205
		bodyModel[240] = new ModelRendererTurbo(this, 142, 6, textureX, textureY); // Box 38
		bodyModel[241] = new ModelRendererTurbo(this, 142, 16, textureX, textureY); // Box 487
		bodyModel[242] = new ModelRendererTurbo(this, 160, 9, textureX, textureY); // Box 38
		bodyModel[243] = new ModelRendererTurbo(this, 151, 9, textureX, textureY); // Box 38
		bodyModel[244] = new ModelRendererTurbo(this, 122, 168, textureX, textureY); // Box 41
		bodyModel[245] = new ModelRendererTurbo(this, 119, 169, textureX, textureY); // Box 41
		bodyModel[246] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 41
		bodyModel[247] = new ModelRendererTurbo(this, 197, 155, textureX, textureY); // Box 41
		bodyModel[248] = new ModelRendererTurbo(this, 194, 156, textureX, textureY); // Box 41
		bodyModel[249] = new ModelRendererTurbo(this, 212, 156, textureX, textureY); // Box 41
		bodyModel[250] = new ModelRendererTurbo(this, 199, 160, textureX, textureY); // Box 41
		bodyModel[251] = new ModelRendererTurbo(this, 196, 161, textureX, textureY); // Box 41
		bodyModel[252] = new ModelRendererTurbo(this, 210, 161, textureX, textureY); // Box 41
		bodyModel[253] = new ModelRendererTurbo(this, 118, 174, textureX, textureY); // Box 41
		bodyModel[254] = new ModelRendererTurbo(this, 118, 172, textureX, textureY); // Box 41
		bodyModel[255] = new ModelRendererTurbo(this, 138, 172, textureX, textureY); // Box 41
		bodyModel[256] = new ModelRendererTurbo(this, 119, 155, textureX, textureY); // Box 869
		bodyModel[257] = new ModelRendererTurbo(this, 119, 162, textureX, textureY); // Box 870
		bodyModel[258] = new ModelRendererTurbo(this, 158, 155, textureX, textureY); // Box 874
		bodyModel[259] = new ModelRendererTurbo(this, 167, 155, textureX, textureY); // Box 877
		bodyModel[260] = new ModelRendererTurbo(this, 193, 168, textureX, textureY); // Box 41
		bodyModel[261] = new ModelRendererTurbo(this, 190, 169, textureX, textureY); // Box 41
		bodyModel[262] = new ModelRendererTurbo(this, 212, 169, textureX, textureY); // Box 41
		bodyModel[263] = new ModelRendererTurbo(this, 141, 168, textureX, textureY); // Box 881
		bodyModel[264] = new ModelRendererTurbo(this, 168, 168, textureX, textureY); // Box 882
		bodyModel[265] = new ModelRendererTurbo(this, 39, 332, textureX, textureY); // Box 38
		bodyModel[266] = new ModelRendererTurbo(this, 20, 338, textureX, textureY); // Box 38
		bodyModel[267] = new ModelRendererTurbo(this, 3, 325, textureX, textureY); // Box 380
		bodyModel[268] = new ModelRendererTurbo(this, 13, 331, textureX, textureY); // Box 382
		bodyModel[269] = new ModelRendererTurbo(this, 61, 280, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[270] = new ModelRendererTurbo(this, 66, 280, textureX, textureY); // Box 38
		bodyModel[271] = new ModelRendererTurbo(this, 47, 286, textureX, textureY); // Box 38
		bodyModel[272] = new ModelRendererTurbo(this, 29, 291, textureX, textureY); // Box 340
		bodyModel[273] = new ModelRendererTurbo(this, 32, 296, textureX, textureY); // Box 41
		bodyModel[274] = new ModelRendererTurbo(this, 40, 285, textureX, textureY); // Box 38
		bodyModel[275] = new ModelRendererTurbo(this, 25, 299, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[276] = new ModelRendererTurbo(this, 109, 227, textureX, textureY); // Box 170
		bodyModel[277] = new ModelRendererTurbo(this, 109, 232, textureX, textureY); // Box 528
		bodyModel[278] = new ModelRendererTurbo(this, 1, 316, textureX, textureY); // Box 38
		bodyModel[279] = new ModelRendererTurbo(this, 4, 321, textureX, textureY); // Box 38
		bodyModel[280] = new ModelRendererTurbo(this, 11, 327, textureX, textureY); // Box 38
		bodyModel[281] = new ModelRendererTurbo(this, 14, 291, textureX, textureY); // Box 38
		bodyModel[282] = new ModelRendererTurbo(this, 17, 296, textureX, textureY); // Box 38
		bodyModel[283] = new ModelRendererTurbo(this, 16, 300, textureX, textureY); // Box 38
		bodyModel[284] = new ModelRendererTurbo(this, 293, 292, textureX, textureY); // Right seat part
		bodyModel[285] = new ModelRendererTurbo(this, 285, 274, textureX, textureY); // Right seat part
		bodyModel[286] = new ModelRendererTurbo(this, 293, 320, textureX, textureY); // Left seat part
		bodyModel[287] = new ModelRendererTurbo(this, 285, 302, textureX, textureY); // Left seat part
		bodyModel[288] = new ModelRendererTurbo(this, 262, 292, textureX, textureY); // Right seat part
		bodyModel[289] = new ModelRendererTurbo(this, 254, 274, textureX, textureY); // Right seat part
		bodyModel[290] = new ModelRendererTurbo(this, 262, 320, textureX, textureY); // Left seat part
		bodyModel[291] = new ModelRendererTurbo(this, 254, 302, textureX, textureY); // Left seat part
		bodyModel[292] = new ModelRendererTurbo(this, 231, 292, textureX, textureY); // Right seat part
		bodyModel[293] = new ModelRendererTurbo(this, 223, 274, textureX, textureY); // Right seat part
		bodyModel[294] = new ModelRendererTurbo(this, 231, 320, textureX, textureY); // Left seat part
		bodyModel[295] = new ModelRendererTurbo(this, 223, 302, textureX, textureY); // Left seat part
		bodyModel[296] = new ModelRendererTurbo(this, 200, 292, textureX, textureY); // Right seat part
		bodyModel[297] = new ModelRendererTurbo(this, 192, 274, textureX, textureY); // Right seat part
		bodyModel[298] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Left seat part
		bodyModel[299] = new ModelRendererTurbo(this, 192, 302, textureX, textureY); // Left seat part
		bodyModel[300] = new ModelRendererTurbo(this, 169, 292, textureX, textureY); // Right seat part
		bodyModel[301] = new ModelRendererTurbo(this, 161, 274, textureX, textureY); // Right seat part
		bodyModel[302] = new ModelRendererTurbo(this, 169, 320, textureX, textureY); // Left seat part
		bodyModel[303] = new ModelRendererTurbo(this, 161, 302, textureX, textureY); // Left seat part
		bodyModel[304] = new ModelRendererTurbo(this, 255, 151, textureX, textureY); // Box 2
		bodyModel[305] = new ModelRendererTurbo(this, 255, 141, textureX, textureY); // Box 27
		bodyModel[306] = new ModelRendererTurbo(this, 298, 211, textureX, textureY); // Box 128
		bodyModel[307] = new ModelRendererTurbo(this, 311, 211, textureX, textureY,"lamp"); // Box 338 glow
		bodyModel[308] = new ModelRendererTurbo(this, 299, 223, textureX, textureY); // Box 128
		bodyModel[309] = new ModelRendererTurbo(this, 301, 220, textureX, textureY); // Box 563
		bodyModel[310] = new ModelRendererTurbo(this, 428, 302, textureX, textureY); // Box 128
		bodyModel[311] = new ModelRendererTurbo(this, 411, 267, textureX, textureY); // Box 128
		bodyModel[312] = new ModelRendererTurbo(this, 418, 267, textureX, textureY); // Box 177
		bodyModel[313] = new ModelRendererTurbo(this, 426, 281, textureX, textureY); // Box 176
		bodyModel[314] = new ModelRendererTurbo(this, 428, 314, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[315] = new ModelRendererTurbo(this, 411, 274, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[316] = new ModelRendererTurbo(this, 418, 274, textureX, textureY,"lamp"); // Box 177 glow
		bodyModel[317] = new ModelRendererTurbo(this, 426, 290, textureX, textureY,"lamp"); // Box 176 glow
		bodyModel[318] = new ModelRendererTurbo(this, 411, 342, textureX, textureY); // Box 588
		bodyModel[319] = new ModelRendererTurbo(this, 418, 342, textureX, textureY); // Box 589
		bodyModel[320] = new ModelRendererTurbo(this, 426, 326, textureX, textureY); // Box 590
		bodyModel[321] = new ModelRendererTurbo(this, 411, 349, textureX, textureY, "lamp"); // Box 591 glow
		bodyModel[322] = new ModelRendererTurbo(this, 418, 349, textureX, textureY,"lamp"); // Box 592 glow
		bodyModel[323] = new ModelRendererTurbo(this, 426, 335, textureX, textureY,"lamp"); // Box 593 glow
		bodyModel[324] = new ModelRendererTurbo(this, 411, 264, textureX, textureY); // Box 128
		bodyModel[325] = new ModelRendererTurbo(this, 418, 264, textureX, textureY); // Box 177
		bodyModel[326] = new ModelRendererTurbo(this, 428, 294, textureX, textureY); // Box 128
		bodyModel[327] = new ModelRendererTurbo(this, 411, 339, textureX, textureY); // Box 599
		bodyModel[328] = new ModelRendererTurbo(this, 418, 339, textureX, textureY); // Box 600
		bodyModel[329] = new ModelRendererTurbo(this, 426, 321, textureX, textureY); // Box 602
		bodyModel[330] = new ModelRendererTurbo(this, 443, 306, textureX, textureY); // Box 128
		bodyModel[331] = new ModelRendererTurbo(this, 446, 314, textureX, textureY); // Box 128
		bodyModel[332] = new ModelRendererTurbo(this, 447, 324, textureX, textureY); // Box 332
		bodyModel[333] = new ModelRendererTurbo(this, 446, 319, textureX, textureY); // Box 128
		bodyModel[334] = new ModelRendererTurbo(this, 446, 296, textureX, textureY); // Box 610
		bodyModel[335] = new ModelRendererTurbo(this, 339, 46, textureX, textureY); // Box 128
		bodyModel[336] = new ModelRendererTurbo(this, 338, 47, textureX, textureY); // Box 614
		bodyModel[337] = new ModelRendererTurbo(this, 331, 66, textureX, textureY); // Box 128
		bodyModel[338] = new ModelRendererTurbo(this, 335, 74, textureX, textureY); // Box 265
		bodyModel[339] = new ModelRendererTurbo(this, 301, 217, textureX, textureY); // Box 128
		bodyModel[340] = new ModelRendererTurbo(this, 335, 79, textureX, textureY); // Box 128
		bodyModel[341] = new ModelRendererTurbo(this, 344, 68, textureX, textureY); // Box 128
		bodyModel[342] = new ModelRendererTurbo(this, 346, 68, textureX, textureY); // Box 128
		bodyModel[343] = new ModelRendererTurbo(this, 346, 73, textureX, textureY); // Box 128
		bodyModel[344] = new ModelRendererTurbo(this, 308, 220, textureX, textureY,"lamp"); // Box 338 glow
		bodyModel[345] = new ModelRendererTurbo(this, 308, 217, textureX, textureY,"lamp"); // Box 338 glow
		bodyModel[346] = new ModelRendererTurbo(this, 302, 228, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[347] = new ModelRendererTurbo(this, 426, 276, textureX, textureY); // Box 582
		bodyModel[348] = new ModelRendererTurbo(this, 446, 301, textureX, textureY); // Box 583
		bodyModel[349] = new ModelRendererTurbo(this, 326, 13, textureX, textureY); // Box 584
		bodyModel[350] = new ModelRendererTurbo(this, 299, 200, textureX, textureY); // Box 586
		bodyModel[351] = new ModelRendererTurbo(this, 301, 205, textureX, textureY); // Box 587
		bodyModel[352] = new ModelRendererTurbo(this, 301, 208, textureX, textureY); // Box 588
		bodyModel[353] = new ModelRendererTurbo(this, 308, 205, textureX, textureY,"lamp"); // Box 589 glow
		bodyModel[354] = new ModelRendererTurbo(this, 308, 208, textureX, textureY, "lamp"); // Box 590 glow
		bodyModel[355] = new ModelRendererTurbo(this, 302, 198, textureX, textureY, "lamp"); // Box 591 glow
		bodyModel[356] = new ModelRendererTurbo(this, 341, 35, textureX, textureY); // Box 592
		bodyModel[357] = new ModelRendererTurbo(this, 335, 18, textureX, textureY); // Box 593
		bodyModel[358] = new ModelRendererTurbo(this, 346, 20, textureX, textureY); // Box 594
		bodyModel[359] = new ModelRendererTurbo(this, 342, 15, textureX, textureY); // Box 595
		bodyModel[360] = new ModelRendererTurbo(this, 326, 18, textureX, textureY); // Box 596
		bodyModel[361] = new ModelRendererTurbo(this, 321, 20, textureX, textureY); // Box 597
		bodyModel[362] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 598
		bodyModel[363] = new ModelRendererTurbo(this, 327, 35, textureX, textureY); // Box 599
		bodyModel[364] = new ModelRendererTurbo(this, 342, 34, textureX, textureY); // Box 600
		bodyModel[365] = new ModelRendererTurbo(this, 334, 29, textureX, textureY); // Box 601
		bodyModel[366] = new ModelRendererTurbo(this, 321, 29, textureX, textureY); // Box 602
		bodyModel[367] = new ModelRendererTurbo(this, 308, 29, textureX, textureY); // Box 604
		bodyModel[368] = new ModelRendererTurbo(this, 303, 351, textureX, textureY); // Box 38
		bodyModel[369] = new ModelRendererTurbo(this, 326, 347, textureX, textureY); // Box 38
		bodyModel[370] = new ModelRendererTurbo(this, 317, 347, textureX, textureY); // Box 2
		bodyModel[371] = new ModelRendererTurbo(this, 310, 351, textureX, textureY); // Box 38
		bodyModel[372] = new ModelRendererTurbo(this, 303, 356, textureX, textureY); // Box 609
		bodyModel[373] = new ModelRendererTurbo(this, 317, 352, textureX, textureY); // Box 610
		bodyModel[374] = new ModelRendererTurbo(this, 310, 356, textureX, textureY); // Box 611
		bodyModel[375] = new ModelRendererTurbo(this, 294, 105, textureX, textureY,"lamp"); // marker light red glow
		bodyModel[376] = new ModelRendererTurbo(this, 304, 105, textureX, textureY); // Box 613
		bodyModel[377] = new ModelRendererTurbo(this, 299, 105, textureX, textureY); // Box 614
		bodyModel[378] = new ModelRendererTurbo(this, 296, 152, textureX, textureY); // Box 615
		bodyModel[379] = new ModelRendererTurbo(this, 344, 84, textureX, textureY); // Box 38
		bodyModel[380] = new ModelRendererTurbo(this, 344, 103, textureX, textureY); // Box 618
		bodyModel[381] = new ModelRendererTurbo(this, 360, 54, textureX, textureY,"lamp"); // marker light red glow
		bodyModel[382] = new ModelRendererTurbo(this, 365, 54, textureX, textureY); // marker light green off
		bodyModel[383] = new ModelRendererTurbo(this, 362, 50, textureX, textureY); // Box 38
		bodyModel[384] = new ModelRendererTurbo(this, 365, 39, textureX, textureY,"lamp"); // marker light red glow
		bodyModel[385] = new ModelRendererTurbo(this, 360, 39, textureX, textureY); // marker light green off
		bodyModel[386] = new ModelRendererTurbo(this, 362, 35, textureX, textureY); // Box 607
		bodyModel[387] = new ModelRendererTurbo(this, 341, 22, textureX, textureY); // Box 610
		bodyModel[388] = new ModelRendererTurbo(this, 326, 23, textureX, textureY); // Box 611
		bodyModel[389] = new ModelRendererTurbo(this, 359, 51, textureX, textureY); // Box 38
		bodyModel[390] = new ModelRendererTurbo(this, 359, 49, textureX, textureY); // Box 38
		bodyModel[391] = new ModelRendererTurbo(this, 369, 36, textureX, textureY); // Box 613
		bodyModel[392] = new ModelRendererTurbo(this, 369, 34, textureX, textureY); // Box 614
		bodyModel[393] = new ModelRendererTurbo(this, 377, 35, textureX, textureY); // Right step part
		bodyModel[394] = new ModelRendererTurbo(this, 374, 14, textureX, textureY); // Left step part
		bodyModel[395] = new ModelRendererTurbo(this, 374, 12, textureX, textureY); // Left step part
		bodyModel[396] = new ModelRendererTurbo(this, 388, 14, textureX, textureY); // Left step part
		bodyModel[397] = new ModelRendererTurbo(this, 388, 12, textureX, textureY); // Left step part
		bodyModel[398] = new ModelRendererTurbo(this, 347, 31, textureX, textureY); // Box 620
		bodyModel[399] = new ModelRendererTurbo(this, 346, 63, textureX, textureY); // Box 620
		bodyModel[400] = new ModelRendererTurbo(this, 337, 62, textureX, textureY); // Box 621
		bodyModel[401] = new ModelRendererTurbo(this, 335, 68, textureX, textureY); // Box 622
		bodyModel[402] = new ModelRendererTurbo(this, 315, 66, textureX, textureY); // Box 623
		bodyModel[403] = new ModelRendererTurbo(this, 447, 293, textureX, textureY); // Box 613
		bodyModel[404] = new ModelRendererTurbo(this, 312, 251, textureX, textureY); // Box 614
		bodyModel[405] = new ModelRendererTurbo(this, 294, 108, textureX, textureY); // marker light red off
		bodyModel[406] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // marker light red off
		bodyModel[407] = new ModelRendererTurbo(this, 360, 57, textureX, textureY); // marker light red off
		bodyModel[408] = new ModelRendererTurbo(this, 365, 57, textureX, textureY,"lamp"); // marker light green glow
		bodyModel[409] = new ModelRendererTurbo(this, 365, 30, textureX, textureY); // marker light red off
		bodyModel[410] = new ModelRendererTurbo(this, 360, 30, textureX, textureY,"lamp"); // marker light green glow
		bodyModel[411] = new ModelRendererTurbo(this, 159, 284, textureX, textureY); // Boc 42
		bodyModel[412] = new ModelRendererTurbo(this, 159, 312, textureX, textureY); // Boc 42
		bodyModel[413] = new ModelRendererTurbo(this, 172, 274, textureX, textureY); // Right seat part
		bodyModel[414] = new ModelRendererTurbo(this, 177, 277, textureX, textureY); // Right seat part
		bodyModel[415] = new ModelRendererTurbo(this, 179, 274, textureX, textureY); // Right seat part
		bodyModel[416] = new ModelRendererTurbo(this, 172, 277, textureX, textureY); // Right seat part
		bodyModel[417] = new ModelRendererTurbo(this, 186, 274, textureX, textureY); // Right seat part
		bodyModel[418] = new ModelRendererTurbo(this, 172, 282, textureX, textureY); // Right seat part
		bodyModel[419] = new ModelRendererTurbo(this, 177, 285, textureX, textureY); // Right seat part
		bodyModel[420] = new ModelRendererTurbo(this, 179, 282, textureX, textureY); // Right seat part
		bodyModel[421] = new ModelRendererTurbo(this, 172, 285, textureX, textureY); // Right seat part
		bodyModel[422] = new ModelRendererTurbo(this, 186, 282, textureX, textureY); // Right seat part
		bodyModel[423] = new ModelRendererTurbo(this, 172, 302, textureX, textureY); // Left seat part
		bodyModel[424] = new ModelRendererTurbo(this, 177, 305, textureX, textureY); // Left seat part
		bodyModel[425] = new ModelRendererTurbo(this, 179, 302, textureX, textureY); // Left seat part
		bodyModel[426] = new ModelRendererTurbo(this, 172, 305, textureX, textureY); // Left seat part
		bodyModel[427] = new ModelRendererTurbo(this, 186, 302, textureX, textureY); // Left seat part
		bodyModel[428] = new ModelRendererTurbo(this, 172, 310, textureX, textureY); // Left seat part
		bodyModel[429] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Left seat part
		bodyModel[430] = new ModelRendererTurbo(this, 179, 310, textureX, textureY); // Left seat part
		bodyModel[431] = new ModelRendererTurbo(this, 172, 313, textureX, textureY); // Left seat part
		bodyModel[432] = new ModelRendererTurbo(this, 186, 310, textureX, textureY); // Left seat part
		bodyModel[433] = new ModelRendererTurbo(this, 190, 284, textureX, textureY); // Boc 42
		bodyModel[434] = new ModelRendererTurbo(this, 190, 312, textureX, textureY); // Boc 42
		bodyModel[435] = new ModelRendererTurbo(this, 203, 274, textureX, textureY); // Right seat part
		bodyModel[436] = new ModelRendererTurbo(this, 208, 277, textureX, textureY); // Right seat part
		bodyModel[437] = new ModelRendererTurbo(this, 210, 274, textureX, textureY); // Right seat part
		bodyModel[438] = new ModelRendererTurbo(this, 203, 277, textureX, textureY); // Right seat part
		bodyModel[439] = new ModelRendererTurbo(this, 217, 274, textureX, textureY); // Right seat part
		bodyModel[440] = new ModelRendererTurbo(this, 203, 282, textureX, textureY); // Right seat part
		bodyModel[441] = new ModelRendererTurbo(this, 208, 285, textureX, textureY); // Right seat part
		bodyModel[442] = new ModelRendererTurbo(this, 210, 282, textureX, textureY); // Right seat part
		bodyModel[443] = new ModelRendererTurbo(this, 203, 285, textureX, textureY); // Right seat part
		bodyModel[444] = new ModelRendererTurbo(this, 217, 282, textureX, textureY); // Right seat part
		bodyModel[445] = new ModelRendererTurbo(this, 203, 302, textureX, textureY); // Left seat part
		bodyModel[446] = new ModelRendererTurbo(this, 208, 305, textureX, textureY); // Left seat part
		bodyModel[447] = new ModelRendererTurbo(this, 210, 302, textureX, textureY); // Left seat part
		bodyModel[448] = new ModelRendererTurbo(this, 203, 305, textureX, textureY); // Left seat part
		bodyModel[449] = new ModelRendererTurbo(this, 217, 302, textureX, textureY); // Left seat part
		bodyModel[450] = new ModelRendererTurbo(this, 203, 310, textureX, textureY); // Left seat part
		bodyModel[451] = new ModelRendererTurbo(this, 208, 313, textureX, textureY); // Left seat part
		bodyModel[452] = new ModelRendererTurbo(this, 210, 310, textureX, textureY); // Left seat part
		bodyModel[453] = new ModelRendererTurbo(this, 203, 313, textureX, textureY); // Left seat part
		bodyModel[454] = new ModelRendererTurbo(this, 217, 310, textureX, textureY); // Left seat part
		bodyModel[455] = new ModelRendererTurbo(this, 221, 284, textureX, textureY); // Boc 42
		bodyModel[456] = new ModelRendererTurbo(this, 221, 312, textureX, textureY); // Boc 42
		bodyModel[457] = new ModelRendererTurbo(this, 234, 274, textureX, textureY); // Right seat part
		bodyModel[458] = new ModelRendererTurbo(this, 239, 277, textureX, textureY); // Right seat part
		bodyModel[459] = new ModelRendererTurbo(this, 241, 274, textureX, textureY); // Right seat part
		bodyModel[460] = new ModelRendererTurbo(this, 234, 277, textureX, textureY); // Right seat part
		bodyModel[461] = new ModelRendererTurbo(this, 248, 274, textureX, textureY); // Right seat part
		bodyModel[462] = new ModelRendererTurbo(this, 234, 282, textureX, textureY); // Right seat part
		bodyModel[463] = new ModelRendererTurbo(this, 239, 285, textureX, textureY); // Right seat part
		bodyModel[464] = new ModelRendererTurbo(this, 241, 282, textureX, textureY); // Right seat part
		bodyModel[465] = new ModelRendererTurbo(this, 234, 285, textureX, textureY); // Right seat part
		bodyModel[466] = new ModelRendererTurbo(this, 248, 282, textureX, textureY); // Right seat part
		bodyModel[467] = new ModelRendererTurbo(this, 234, 302, textureX, textureY); // Left seat part
		bodyModel[468] = new ModelRendererTurbo(this, 239, 305, textureX, textureY); // Left seat part
		bodyModel[469] = new ModelRendererTurbo(this, 241, 302, textureX, textureY); // Left seat part
		bodyModel[470] = new ModelRendererTurbo(this, 234, 305, textureX, textureY); // Left seat part
		bodyModel[471] = new ModelRendererTurbo(this, 248, 302, textureX, textureY); // Left seat part
		bodyModel[472] = new ModelRendererTurbo(this, 234, 310, textureX, textureY); // Left seat part
		bodyModel[473] = new ModelRendererTurbo(this, 239, 313, textureX, textureY); // Left seat part
		bodyModel[474] = new ModelRendererTurbo(this, 241, 310, textureX, textureY); // Left seat part
		bodyModel[475] = new ModelRendererTurbo(this, 234, 313, textureX, textureY); // Left seat part
		bodyModel[476] = new ModelRendererTurbo(this, 248, 310, textureX, textureY); // Left seat part
		bodyModel[477] = new ModelRendererTurbo(this, 252, 312, textureX, textureY); // Boc 42
		bodyModel[478] = new ModelRendererTurbo(this, 265, 274, textureX, textureY); // Right seat part
		bodyModel[479] = new ModelRendererTurbo(this, 270, 277, textureX, textureY); // Right seat part
		bodyModel[480] = new ModelRendererTurbo(this, 272, 274, textureX, textureY); // Right seat part
		bodyModel[481] = new ModelRendererTurbo(this, 265, 277, textureX, textureY); // Right seat part
		bodyModel[482] = new ModelRendererTurbo(this, 279, 274, textureX, textureY); // Right seat part
		bodyModel[483] = new ModelRendererTurbo(this, 265, 282, textureX, textureY); // Right seat part
		bodyModel[484] = new ModelRendererTurbo(this, 270, 285, textureX, textureY); // Right seat part
		bodyModel[485] = new ModelRendererTurbo(this, 272, 282, textureX, textureY); // Right seat part
		bodyModel[486] = new ModelRendererTurbo(this, 265, 285, textureX, textureY); // Right seat part
		bodyModel[487] = new ModelRendererTurbo(this, 279, 282, textureX, textureY); // Right seat part
		bodyModel[488] = new ModelRendererTurbo(this, 265, 302, textureX, textureY); // Left seat part
		bodyModel[489] = new ModelRendererTurbo(this, 270, 305, textureX, textureY); // Left seat part
		bodyModel[490] = new ModelRendererTurbo(this, 272, 302, textureX, textureY); // Left seat part
		bodyModel[491] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Left seat part
		bodyModel[492] = new ModelRendererTurbo(this, 279, 302, textureX, textureY); // Left seat part
		bodyModel[493] = new ModelRendererTurbo(this, 265, 310, textureX, textureY); // Left seat part
		bodyModel[494] = new ModelRendererTurbo(this, 270, 313, textureX, textureY); // Left seat part
		bodyModel[495] = new ModelRendererTurbo(this, 272, 310, textureX, textureY); // Left seat part
		bodyModel[496] = new ModelRendererTurbo(this, 265, 313, textureX, textureY); // Left seat part
		bodyModel[497] = new ModelRendererTurbo(this, 279, 310, textureX, textureY); // Left seat part
		bodyModel[498] = new ModelRendererTurbo(this, 252, 284, textureX, textureY); // Boc 42
		bodyModel[499] = new ModelRendererTurbo(this, 283, 284, textureX, textureY); // Boc 42

		bodyModel[0].addBox(0F, 0F, 0F, 110, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-55.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(-60.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(-59.5F, 1F, -5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[3].setRotationPoint(58.5F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 3, 6, 0F); // Box 2
		bodyModel[4].setRotationPoint(55.5F, 3F, -3F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[5].setRotationPoint(-62.5F, 3F, -1.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 111, 1, 4, 0F); // Box 2
		bodyModel[6].setRotationPoint(-55.5F, 3F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[7].setRotationPoint(42F, 4F, -1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[8].setRotationPoint(-45F, 4F, -1F);

		bodyModel[9].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[9].setRotationPoint(-55.5F, 1F, -10.99F);

		bodyModel[10].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[10].setRotationPoint(-55.5F, 1F, 4.99F);

		bodyModel[11].addShapeBox(-5F, 0F, -1F, 5, 15, 1, 0F,-1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Left side door
		bodyModel[11].setRotationPoint(-55.49F, -14F, -10.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 110, 16, 1, 0F); // Box 38
		bodyModel[12].setRotationPoint(-55.5F, -15F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 110, 16, 1, 0F); // Box 128
		bodyModel[13].setRotationPoint(-55.5F, -15F, 10F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[14].setRotationPoint(-55.5F, -15F, -10F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[15].setRotationPoint(-55.5F, -15F, 3F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[16].setRotationPoint(-60.5F, -15F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[17].setRotationPoint(-60.5F, -15F, 3F);

		bodyModel[18].addShapeBox(-5F, 0F, 0F, 5, 15, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Right side door
		bodyModel[18].setRotationPoint(-55.49F, -14F, 10.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[19].setRotationPoint(-55.5F, -15F, -3F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[20].setRotationPoint(-60.5F, -15F, -3F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[21].setRotationPoint(-59.5F, -15F, -11F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[22].setRotationPoint(-59.5F, -15F, 10F);

		bodyModel[23].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[23].setRotationPoint(-54.49F, -14F, -3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 110, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[24].setRotationPoint(-60.5F, -20F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 110, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[25].setRotationPoint(-60.5F, -19F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 110, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[26].setRotationPoint(-60.5F, -20F, 3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 110, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[27].setRotationPoint(-60.5F, -19F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 110, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[28].setRotationPoint(-60.5F, -16F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 110, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[29].setRotationPoint(-60.5F, -16F, 10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate closed
		bodyModel[30].setRotationPoint(-60.5F, -7F, -3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate open
		bodyModel[31].setRotationPoint(-60.5F, -7F, 2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[32].setRotationPoint(-60.5F, -17F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[33].setRotationPoint(-60.5F, -18F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[34].setRotationPoint(-60.5F, -18F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[35].setRotationPoint(-60.5F, -16.25F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[36].setRotationPoint(-60.5F, 3F, 10.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[37].setRotationPoint(-60.5F, 4F, 10.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[38].setRotationPoint(-55.5F, 4F, 10.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[39].setRotationPoint(53.5F, 3F, 10.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[40].setRotationPoint(-60.5F, 3F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[41].setRotationPoint(-60.5F, 4F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[42].setRotationPoint(-55.5F, 4F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[43].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[44].setRotationPoint(-55.5F, 3F, 10.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[45].setRotationPoint(-55.5F, 3F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[46].setRotationPoint(-62F, -15F, -4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[47].setRotationPoint(-62F, 1F, -4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[48].setRotationPoint(-62F, -14F, -4F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[49].setRotationPoint(-62F, -14F, 3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[50].setRotationPoint(-62.5F, -14F, -5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[51].setRotationPoint(-62.5F, -14F, 3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[52].setRotationPoint(-62.5F, 1F, -5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 104, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[53].setRotationPoint(-60.5F, -20F, -3F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 2, 20, 0F); // Box 2
		bodyModel[54].setRotationPoint(54.5F, 1F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[55].setRotationPoint(54.5F, 1F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 174
		bodyModel[56].setRotationPoint(54.5F, 1F, 10F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 2
		bodyModel[57].setRotationPoint(57.5F, 1F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[58].setRotationPoint(57.5F, 1F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 161
		bodyModel[59].setRotationPoint(57.5F, 1F, 7F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 2
		bodyModel[60].setRotationPoint(59.5F, 1F, -3F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[61].setRotationPoint(59.5F, 1F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[62].setRotationPoint(59.5F, 1F, 3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, -0.55F, 0F, 0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.55F, 0F, 0.85F, 0F, 0F, 0F); // Box 38
		bodyModel[63].setRotationPoint(54.5F, -15F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, -0.55F, 0F, 0.85F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0.85F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 175
		bodyModel[64].setRotationPoint(54.5F, -15F, 10F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 14, 6, 0F); // Box 38
		bodyModel[65].setRotationPoint(59.5F, -13F, -3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,-0.3F, 0F, -0.55F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, -0.55F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[66].setRotationPoint(58.5F, -13F, -7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 14, 1, 0F,-0.55F, 0F, -0.15F, -0.45F, 0F, -3.15F, -1.15F, 0F, 2.7F, 0F, 0F, 0F, -0.55F, 0F, -0.15F, -0.45F, 0F, -3.15F, -1.15F, 0F, 2.7F, 0F, 0F, 0F); // Box 38
		bodyModel[67].setRotationPoint(56.95F, -13F, -10.15F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.55F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.55F); // Box 176
		bodyModel[68].setRotationPoint(58.5F, -13F, 3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 14, 1, 0F,0F, 0F, 0F, -1.15F, 0F, 2.7F, -0.45F, 0F, -3.15F, -0.55F, 0F, -0.15F, 0F, 0F, 0F, -1.15F, 0F, 2.7F, -0.45F, 0F, -3.15F, -0.55F, 0F, -0.15F); // Box 177
		bodyModel[69].setRotationPoint(56.95F, -13F, 9.15F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[70].setRotationPoint(49.5F, -20F, -3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 1.25F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 1F, 0F); // Box 128
		bodyModel[71].setRotationPoint(59.5F, -15F, -2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 1F, -0.95F, 0F, 0F, 0.55F, 0F, 0F, 0.55F, 0F, 1F, -0.95F, 0F); // Box 128
		bodyModel[72].setRotationPoint(58.5F, -17.5F, -2F);

		bodyModel[73].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 128
		bodyModel[73].setRotationPoint(43.5F, -20F, -3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[74].setRotationPoint(49.5F, -16F, -12F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1.75F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[75].setRotationPoint(49.5F, -19F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -1F, 0F, 0F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[76].setRotationPoint(49.5F, -20F, -7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 185
		bodyModel[77].setRotationPoint(49.5F, -16F, 10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 186
		bodyModel[78].setRotationPoint(49.5F, -19F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 187
		bodyModel[79].setRotationPoint(49.5F, -20F, 3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1.25F, -1F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 1F, 0F); // Box 128
		bodyModel[80].setRotationPoint(59.5F, -15F, -3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -2F, 0F, 0F, -2F, -1F, -0.55F, -0.25F, -0.15F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, -1F, -0.55F, 1F, -0.15F, 0F, 1F, -1F); // Box 38
		bodyModel[81].setRotationPoint(54.5F, -17F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.55F, -0.25F, 0.85F, 0F, -2F, -2F, 0F, -2F, -1F, 0F, 1F, 0F, -0.55F, 1F, 0.85F, 0F, 1F, -2F, 0F, 1F, -1F); // Box 203
		bodyModel[82].setRotationPoint(54.5F, -17F, 10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, -1.15F, -1.25F, 2.3F, 0F, -1.5F, -2F, 0F, 0F, -3F, 0F, -0.99F, 0F, -1.15F, 0.27F, 2.3F, 0F, 0.51F, -2F, 0F, -0.99F, -3F); // Box 128
		bodyModel[83].setRotationPoint(54.5F, -19F, -3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0.4F, 0F, 0F, -0.5F); // Box 31
		bodyModel[84].setRotationPoint(54.5F, 3F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, -3F, -1.4F, 0F, 2.3F, 0.25F, 0F, -0.6F, 0F, 0F, 0F, -1F, 0F, -3F, -1.4F, 0F, 2.3F, 0.25F, 0F, -0.6F); // Box 31
		bodyModel[85].setRotationPoint(57.5F, 3F, -10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.9F, 0F, -0.3F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, -0.3F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[86].setRotationPoint(60F, 3F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 239
		bodyModel[87].setRotationPoint(54.5F, 3F, 10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, 0F, -0.6F, -1.4F, 0F, 2.3F, -1F, 0F, -3F, 0F, 0F, 0F, 0.25F, 0F, -0.6F, -1.4F, 0F, 2.3F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 240
		bodyModel[88].setRotationPoint(57.5F, 3F, 9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.9F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.9F, 0F, -0.3F); // Box 241
		bodyModel[89].setRotationPoint(60F, 3F, 3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -1.4F, -0.55F, 0F, 0.85F, 0F, 0F, 0F); // Box 31 cull
		bodyModel[90].setRotationPoint(54.5F, 4F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, -3F, -1.4F, 0F, 2.3F, 0.25F, 0F, -0.6F, 0.3F, 0F, -0.4F, -1.4F, 0F, -3.3F, -1.8F, 0F, 2.6F, 0.55F, 0F, -0.15F); // Box 31
		bodyModel[91].setRotationPoint(57.5F, 4F, -10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.9F, 0F, -0.3F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.3F, 0F, -0.6F, -1.9F, 0F, -0.3F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 2
		bodyModel[92].setRotationPoint(60F, 4F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0.85F, -0.3F, 0F, -1.4F, 0F, 0F, -0.5F); // Box 245 cull
		bodyModel[93].setRotationPoint(54.5F, 4F, 10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.25F, 0F, -0.6F, -1.4F, 0F, 2.3F, -1F, 0F, -3F, 0F, 0F, 0F, 0.55F, 0F, -0.15F, -1.8F, 0F, 2.6F, -1.4F, 0F, -3.3F, 0.3F, 0F, -0.4F); // Box 246
		bodyModel[94].setRotationPoint(57.5F, 4F, 9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.9F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.9F, 0F, -0.3F, 1.3F, 0F, -0.6F); // Box 247
		bodyModel[95].setRotationPoint(60F, 4F, 3F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.025F, 0F, 0.05F, 0.4F, 0F, 0.1F, 0.17F, 0F, 0F, 0F, 0F, 0F, 0.025F, 0F, 0.05F, 0.4F, 0F, 0.1F, 0.17F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[96].setRotationPoint(54.81F, -2F, -11.95F);
		bodyModel[96].rotateAngleY = 0.32288591F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.025F, 0F, 0F, 0.17F, 0F, 0F, 0.4F, 0F, 0.1F, 0.025F, 0F, 0.05F, 0.025F, 0F, 0F, 0.17F, 0F, 0F, 0.4F, 0F, 0.1F, 0.025F, 0F, 0.05F); // Box 327
		bodyModel[97].setRotationPoint(54.5F, -2F, 11F);
		bodyModel[97].rotateAngleY = -0.32288591F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[98].setRotationPoint(53.5F, -2F, -12F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[99].setRotationPoint(53.5F, -2F, 11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 0, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -4F, -4F); // Box 38 glow
		bodyModel[100].setRotationPoint(60.51F, -3.5F, -2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.285F, 0F, 0F, -0.285F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.285F, 0F, 0F, -0.285F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[101].setRotationPoint(54.5F, 6F, -10.25F);
		bodyModel[101].rotateAngleY = 0.33161256F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0.05F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[102].setRotationPoint(54.81F, 6F, -11.45F);
		bodyModel[102].rotateAngleY = 0.32288591F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[103].setRotationPoint(54.5F, 6F, 10.5F);
		bodyModel[103].rotateAngleY = -0.32288591F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.475F, 0F, -0.5F, -0.875F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.475F, -0.5F, -0.5F); // marker light red glow
		bodyModel[104].setRotationPoint(52.45F, -13.75F, -11.6F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.05F, -0.3F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[105].setRotationPoint(53.5F, -14.1F, -12F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, -0.45F, 0F, 0F, -1F, -1.05F, -0.3F, 0F, -1.05F, -0.3F, 0F, -0.75F, 0F, -0.45F, -0.75F, 0F); // Box 38
		bodyModel[106].setRotationPoint(52.5F, -14.1F, -12F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,1.15F, 0F, -0.7F, -1.7F, -1.25F, 0.45F, -1F, -1.5F, 0F, 0F, -0.25F, 0F, 1.15F, -0.55F, -0.7F, -1.7F, 0.55F, 0.45F, -1F, 0.75F, 0F, 0F, -0.1F, 0F); // Box 260
		bodyModel[107].setRotationPoint(58.5F, -17.75F, -6F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.25F, 0F, -1.15F, -0.5F, -2.7F, -2.6F, 0.75F, 0.85F, -0.4F, 0.75F, 0.85F, 0F, -0.49F, 0F, -1.15F, -0.2F, -2.7F, -2.6F, -1.3F, 0.85F, -0.4F, -1.3F, 0.85F); // Box 266
		bodyModel[108].setRotationPoint(56.95F, -17F, -9.15F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.25F, 0F, -3F, -0.25F, 0F, -2.6F, 0.75F, 0.85F, 2.45F, 1.25F, -0.85F, 0F, -0.6F, 0F, -3F, -0.6F, 0F, -2.6F, -1.73F, 0.845F, 2.45F, -2F, -0.85F); // Box 267
		bodyModel[109].setRotationPoint(56.95F, -17F, -9.15F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.55F, -1.25F, -0.15F, -0.7F, -1.25F, -3.35F, -1.15F, 0.25F, 1.7F, 0F, 0.5F, -1F, -0.55F, 0.25F, -0.15F, -0.7F, 0.25F, -3.35F, -1.15F, 0.25F, 1.7F, 0F, 0.25F, -1F); // Box 38
		bodyModel[110].setRotationPoint(56.95F, -16.25F, -10.15F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.155F, -0.195F, -1F, -0.65F, -1.5F, -1F, -0.615F, -1.5F, 0.615F, 0F, -0.25F, 1F, 0F, -0.5F, -1F, -0.65F, -0.5F, -1F, -0.625F, -0.5F, 0.61F, 0F, -0.5F, 0.6F); // Box 2
		bodyModel[111].setRotationPoint(59.5F, -16.5F, -4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3825F, 1.5F, 0.615F, -1F, -0.5F, 0F, -1F, -0.5F, -1F, -0.35F, 1.5F, -1F, 0F, -2.5F, 0.6F, -2F, -0.5F, 0F, -2F, -0.5F, -1F, 0F, -2.5F, -1F); // Box 291
		bodyModel[112].setRotationPoint(59.5F, -13.5F, 3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0.5F, -1F, -1.15F, 0.25F, 1.7F, -0.7F, -1.25F, -3.35F, -0.55F, -1.25F, -0.15F, 0F, 0.25F, -1F, -1.15F, 0.25F, 1.7F, -0.7F, 0.25F, -3.35F, -0.55F, 0.25F, -0.15F); // Box 296
		bodyModel[113].setRotationPoint(56.95F, -16.25F, 8.15F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.3F, 0F, -0.55F, -1.25F, -1.5F, -0.2F, -0.65F, -1.5F, 0F, -0.845F, -0.195F, 0F, -0.3F, 0.5F, -0.55F, -1.25F, 0.5F, -0.2F, -0.65F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 2
		bodyModel[114].setRotationPoint(58.5F, -16.5F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.55F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.55F); // Box 304
		bodyModel[115].setRotationPoint(58.5F, -14F, 3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0.5F, 0F, -1.125F, -0.5F, 2.7F, -0.45F, -0.5F, -3.15F, -0.55F, 0.5F, -0.15F, 0F, -0.5F, 0F, -1.15F, -0.5F, 2.7F, -0.45F, -0.5F, -3.15F, -0.55F, -0.5F, -0.15F); // Box 305
		bodyModel[116].setRotationPoint(56.95F, -14.5F, 9.15F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1.35F, 0F, -0.5F, 0F, -2F, -0.5F, -1F, -1F, 0.5F, -0.75F, 0F, 0.3F, -1F, -1F, -0.5F, -1F, 1F, -0.5F, -1.7F, 0F, -0.05F, -0.3F, -1F, -0.05F); // Box 307
		bodyModel[117].setRotationPoint(58.5F, -15F, 2.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 49, 1, 0, 0F); // Box 38
		bodyModel[118].setRotationPoint(-22.5F, -13.5F, -11.01F);

		bodyModel[119].addBox(0F, 0F, 0F, 96, 1, 0, 0F); // Box 38
		bodyModel[119].setRotationPoint(-48F, -2.5F, -11.01F);

		bodyModel[120].addBox(0F, 0F, 0F, 49, 1, 0, 0F); // Box 451
		bodyModel[120].setRotationPoint(-22.5F, -13.5F, 11.01F);

		bodyModel[121].addBox(0F, 0F, 0F, 96, 1, 0, 0F); // Box 452
		bodyModel[121].setRotationPoint(-48F, -2.5F, 11.01F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 109, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[122].setRotationPoint(-54.5F, -10F, -9.9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 109, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[123].setRotationPoint(-54.5F, -10F, 9.9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[124].setRotationPoint(-60F, -6F, -12F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[125].setRotationPoint(-55F, -6F, -12F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[126].setRotationPoint(-60F, -6F, 11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[127].setRotationPoint(-55F, -6F, 11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[128].setRotationPoint(-60.5F, 4F, -10.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[129].setRotationPoint(-60.5F, 4F, 9.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.2F, 0F, 1F, -0.76F, 0F, 1F, -0.76F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.8F, 0F); // Box 128
		bodyModel[130].setRotationPoint(56.5F, -18.25F, -2F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, 0.51F, -1F, 0F, 0.51F, 0F, 0F, -0.98F, 0F); // Box 128
		bodyModel[131].setRotationPoint(54.5F, -19F, -3F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, -4F, -0.75F, 4F, -1.15F, -1.25F, -5.3F, 0F, 0F, -3F, 0F, -0.99F, 0F, -4F, 0F, 4F, -1.15F, 0.27F, -5.3F, 0F, -0.99F, -3F); // Box 265
		bodyModel[132].setRotationPoint(54.5F, -19F, -3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.55F, -0.25F, -0.85F, -3F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.96F, 0F, -0.55F, -0.49F, -0.85F, -3F, -2F, 0F, 0F, -2F, 0F); // Box 268
		bodyModel[133].setRotationPoint(54.5F, -17F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 22, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[134].setRotationPoint(-60.5F, -19F, -7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 22, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[135].setRotationPoint(-60.5F, -19F, 3F);

		bodyModel[136].addBox(0F, 0F, 0F, 22, 1, 14, 0F); // Box 128
		bodyModel[136].setRotationPoint(-60.5F, -18F, -7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 16, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[137].setRotationPoint(-54.5F, -18F, -10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 16, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185
		bodyModel[138].setRotationPoint(-54.5F, -18F, 7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 16, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[139].setRotationPoint(-54.5F, -17F, -7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 16, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[140].setRotationPoint(-54.5F, -16.25F, -10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 115, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[141].setRotationPoint(-60.5F, -19F, -3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 74, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[142].setRotationPoint(-19.5F, -19F, -6F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 74, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 324
		bodyModel[143].setRotationPoint(-19.5F, -19F, 3F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 74, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324 glow
		bodyModel[144].setRotationPoint(-19.5F, -18.25F, 6.01F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 74, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338 glow
		bodyModel[145].setRotationPoint(-19.5F, -18.25F, -6.01F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.98F, 0F, 0F, -0.98F, 0F); // Box 332
		bodyModel[146].setRotationPoint(42.5F, -17.45F, -9F);

		bodyModel[147].addBox(0F, 0F, 0F, 12, 5, 1, 0F); // Box 128
		bodyModel[147].setRotationPoint(42.5F, -16F, 9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 128
		bodyModel[148].setRotationPoint(42.5F, -16.85F, 9F);

		bodyModel[149].addBox(0F, 0F, 0F, 12, 5, 1, 0F); // Box 329
		bodyModel[149].setRotationPoint(42.5F, -16F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 330
		bodyModel[150].setRotationPoint(42.5F, -16.85F, -10F);

		bodyModel[151].addBox(0F, 0F, 0F, 11, 0, 1, 0F); // Box 128 glow
		bodyModel[151].setRotationPoint(43.5F, -10.99F, 9F);

		bodyModel[152].addBox(0F, 0F, 0F, 11, 0, 1, 0F); // Box 340 glow
		bodyModel[152].setRotationPoint(43.5F, -10.99F, -10F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 128
		bodyModel[153].setRotationPoint(42.5F, -11F, 9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[154].setRotationPoint(-59.5F, 3F, 4.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[155].setRotationPoint(-55.5F, 3F, 4.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[156].setRotationPoint(-59.5F, 3F, 7.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1359
		bodyModel[157].setRotationPoint(-55.5F, 4F, 7.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1360
		bodyModel[158].setRotationPoint(-59.5F, 4F, 7.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[159].setRotationPoint(-59.49F, 3F, 5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[160].setRotationPoint(-59.49F, 3F, 7F);

		bodyModel[161].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[161].setRotationPoint(-59.49F, 4F, 8F);

		bodyModel[162].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[162].setRotationPoint(-59.49F, 4F, 8F);

		bodyModel[163].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[163].setRotationPoint(-59.49F, 4F, 8F);

		bodyModel[164].addShapeBox(0F, 2F, 0.5F, 4, 0, 2, 0F,0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[164].setRotationPoint(-59.49F, 4F, 8F);

		bodyModel[165].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[165].setRotationPoint(-59.49F, 4F, 8F);

		bodyModel[166].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[166].setRotationPoint(-55.51F, 4F, 8F);

		bodyModel[167].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[167].setRotationPoint(-59.49F, 4F, 8F);

		bodyModel[168].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[168].setRotationPoint(-55.51F, 4F, 8F);

		bodyModel[169].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[169].setRotationPoint(-59.49F, 4F, 8F);

		bodyModel[170].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[170].setRotationPoint(-55.51F, 4F, 8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[171].setRotationPoint(-55.5F, 3F, 7.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[172].setRotationPoint(-59.5F, 3F, -7.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[173].setRotationPoint(-55.5F, 3F, -7.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[174].setRotationPoint(-55.5F, 3F, -10.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[175].setRotationPoint(-59.5F, 3F, -10.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[176].setRotationPoint(-55.5F, 4F, -10.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[177].setRotationPoint(-59.5F, 4F, -10.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[178].setRotationPoint(-59.49F, 3F, -7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[179].setRotationPoint(-59.49F, 3F, -7F);

		bodyModel[180].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[180].setRotationPoint(-59.49F, 4F, -8F);

		bodyModel[181].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[181].setRotationPoint(-59.49F, 4F, -8F);

		bodyModel[182].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[182].setRotationPoint(-59.49F, 4F, -8F);

		bodyModel[183].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[183].setRotationPoint(-59.49F, 4F, -8F);

		bodyModel[184].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[184].setRotationPoint(-59.49F, 4F, -8F);

		bodyModel[185].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[185].setRotationPoint(-59.49F, 4F, -8F);

		bodyModel[186].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[186].setRotationPoint(-55.51F, 4F, -8F);

		bodyModel[187].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[187].setRotationPoint(-59.5F, 3F, -4F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[188].setRotationPoint(-60.5F, 3F, -10.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[189].setRotationPoint(-60.5F, 3F, 7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 475
		bodyModel[190].setRotationPoint(-60.5F, 3F, -10F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[191].setRotationPoint(-60.5F, 3F, 9.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[192].setRotationPoint(-62.5F, -17F, -5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[193].setRotationPoint(-62.5F, -15F, -11F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 18, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[194].setRotationPoint(-62F, -15F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[195].setRotationPoint(-62.5F, -16F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[196].setRotationPoint(-62F, -15F, -11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[197].setRotationPoint(-62.5F, 1F, -10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[198].setRotationPoint(-62.5F, -19F, -10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, -1.75F, 0F, -1.5F, -1.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -1.5F, 1.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[199].setRotationPoint(-62F, -19F, -10F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[200].setRotationPoint(-62.5F, -19.5F, -7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[201].setRotationPoint(-62F, -20F, -7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[202].setRotationPoint(-62.5F, -20F, -3F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 0, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[203].setRotationPoint(-62F, -20F, -3F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[204].setRotationPoint(-62.5F, -19.75F, -5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[205].setRotationPoint(-62.5F, -15F, 10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 18, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[206].setRotationPoint(-62F, -15F, 11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[207].setRotationPoint(-62.5F, -16F, 9F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 2.25F, -1F, -1.5F, 2.25F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -1.5F, -2.25F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[208].setRotationPoint(-62F, -15F, 9F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[209].setRotationPoint(-62.5F, -19F, 7F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[210].setRotationPoint(-62F, -19F, 7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 253
		bodyModel[211].setRotationPoint(-62.5F, -19.5F, 5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[212].setRotationPoint(-62F, -20F, 3F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[213].setRotationPoint(-62.5F, -19.75F, 3F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[214].setRotationPoint(-62.5F, -7F, -10F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[215].setRotationPoint(-62.5F, -7F, 5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[216].setRotationPoint(-62.5F, -17.25F, -10F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 336
		bodyModel[217].setRotationPoint(-62.5F, -17.25F, 5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[218].setRotationPoint(-54.5F, 4F, 10.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[219].setRotationPoint(-54.5F, 4F, -11F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 2
		bodyModel[220].setRotationPoint(51.5F, 4F, 10.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 29
		bodyModel[221].setRotationPoint(51.5F, 4F, -11F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[222].setRotationPoint(32.5F, 4F, 10.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 2
		bodyModel[223].setRotationPoint(-35.5F, 4F, 10.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 66, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[224].setRotationPoint(-33.5F, 3F, 10.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 66, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[225].setRotationPoint(-33.5F, 4F, 10.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[226].setRotationPoint(32.5F, 4F, -11F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 37
		bodyModel[227].setRotationPoint(-35.5F, 4F, -11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 66, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[228].setRotationPoint(-33.5F, 3F, -11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 66, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[229].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[230].setRotationPoint(-54.5F, 3F, 10.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[231].setRotationPoint(-54.5F, 3F, -11F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[232].setRotationPoint(32.5F, 3F, 10.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[233].setRotationPoint(32.5F, 3F, -11F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[234].setRotationPoint(-54.5F, 4F, 10.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[235].setRotationPoint(32.5F, 4F, 10.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[236].setRotationPoint(-54.5F, 4F, -11F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[237].setRotationPoint(32.5F, 4F, -11F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F); // Box 128
		bodyModel[238].setRotationPoint(-59F, -17.25F, 10F);
		bodyModel[238].rotateAngleX = 0.41887902F;

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[239].setRotationPoint(-59F, -17.65F, -10.92F);
		bodyModel[239].rotateAngleX = -0.41887902F;

		bodyModel[240].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[240].setRotationPoint(-53.5F, -19F, -7F);
		bodyModel[240].rotateAngleX = 0.2443461F;

		bodyModel[241].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 487
		bodyModel[241].setRotationPoint(-53.5F, -19.5F, 5F);
		bodyModel[241].rotateAngleX = -0.2443461F;

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[242].setRotationPoint(47.5F, -20.5F, -1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[243].setRotationPoint(37.5F, -20.5F, -1F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[244].setRotationPoint(-30.5F, 2.75F, -6.1F);
		bodyModel[244].rotateAngleX = -0.78539816F;

		bodyModel[245].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[245].setRotationPoint(-30.51F, 3F, -6.6F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[246].setRotationPoint(-25.49F, 3F, -6.6F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[247].setRotationPoint(17.5F, 2.75F, 7.9F);
		bodyModel[247].rotateAngleX = -0.78539816F;

		bodyModel[248].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[248].setRotationPoint(17.49F, 3F, 7.4F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[249].setRotationPoint(22.51F, 3F, 7.4F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[250].setRotationPoint(18.5F, 2.75F, 5.4F);
		bodyModel[250].rotateAngleX = -0.78539816F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[251].setRotationPoint(18.49F, 3F, 4.9F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[252].setRotationPoint(21.51F, 3F, 4.9F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[253].setRotationPoint(-30.5F, 4F, 0F);
		bodyModel[253].rotateAngleX = -0.78539816F;

		bodyModel[254].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[254].setRotationPoint(-30.51F, 4F, -0.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[255].setRotationPoint(-22.49F, 4F, -0.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 15, 2, 4, 0F); // Box 869
		bodyModel[256].setRotationPoint(-25.5F, 3F, 4F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 870
		bodyModel[257].setRotationPoint(-25.5F, 5F, 4F);

		bodyModel[258].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 874
		bodyModel[258].setRotationPoint(-5.5F, 3F, 6F);

		bodyModel[259].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 877
		bodyModel[259].setRotationPoint(3.5F, 3F, 5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[260].setRotationPoint(5.5F, 3F, -8F);
		bodyModel[260].rotateAngleX = -0.78539816F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[261].setRotationPoint(5.49F, 3F, -8.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[262].setRotationPoint(12.51F, 3F, -8.5F);

		bodyModel[263].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 881
		bodyModel[263].setRotationPoint(-6.5F, 3F, -10F);

		bodyModel[264].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 882
		bodyModel[264].setRotationPoint(-15.5F, 3F, -10F);

		bodyModel[265].addBox(0F, 0F, 0F, 3, 16, 7, 0F); // Box 38
		bodyModel[265].setRotationPoint(-46.5F, -15F, 3F);

		bodyModel[266].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 38
		bodyModel[266].setRotationPoint(-54.5F, -15F, 3F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[267].setRotationPoint(-49.5F, -6F, 8F);

		bodyModel[268].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[268].setRotationPoint(-48.5F, -5F, 9F);
		bodyModel[268].rotateAngleY = -0.78539816F;

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[269].setRotationPoint(-47.5F, -14.99F, -0.5F);

		bodyModel[270].addBox(0F, 0F, 0F, 8, 16, 7, 0F); // Box 38
		bodyModel[270].setRotationPoint(-46.5F, -15F, -10F);

		bodyModel[271].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 38
		bodyModel[271].setRotationPoint(-54.5F, -15F, -4F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[272].setRotationPoint(-48.5F, -6F, -10F);

		bodyModel[273].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[273].setRotationPoint(-47.75F, -5F, -8.5F);
		bodyModel[273].rotateAngleY = -0.78539816F;

		bodyModel[274].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 38
		bodyModel[274].setRotationPoint(-47.5F, -15F, -6F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 38 cull
		bodyModel[275].setRotationPoint(-49.5F, -4F, -4.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 62, 3, 1, 0F,0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 170
		bodyModel[276].setRotationPoint(-19.5F, -16.85F, 9F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 62, 3, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F); // Box 528
		bodyModel[277].setRotationPoint(-19.5F, -16.85F, -10F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[278].setRotationPoint(-54.45F, -2F, 8.55F);
		bodyModel[278].rotateAngleY = -0.78539816F;

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[279].setRotationPoint(-54.1F, -1F, 8.9F);
		bodyModel[279].rotateAngleY = -0.78539816F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[280].setRotationPoint(-54.45F, 0.5F, 8.55F);
		bodyModel[280].rotateAngleY = -0.78539816F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[281].setRotationPoint(-53F, -2F, -9.95F);
		bodyModel[281].rotateAngleY = 0.78539816F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[282].setRotationPoint(-53.35F, -1F, -9.6F);
		bodyModel[282].rotateAngleY = 0.78539816F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[283].setRotationPoint(-53F, 0.5F, -9.95F);
		bodyModel[283].rotateAngleY = 0.78539816F;

		bodyModel[284].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[284].setRotationPoint(27.5F, -3F, 7F);
		bodyModel[284].rotateAngleY = -3.14159265F;

		bodyModel[285].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[285].setRotationPoint(27.5F, -8F, 7F);
		bodyModel[285].rotateAngleY = -3.14159265F;

		bodyModel[286].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[286].setRotationPoint(27.5F, -3F, -7F);
		bodyModel[286].rotateAngleY = -3.14159265F;

		bodyModel[287].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[287].setRotationPoint(27.5F, -8F, -7F);
		bodyModel[287].rotateAngleY = -3.14159265F;

		bodyModel[288].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[288].setRotationPoint(17.5F, -3F, 7F);
		bodyModel[288].rotateAngleY = -3.14159265F;

		bodyModel[289].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[289].setRotationPoint(17.5F, -8F, 7F);
		bodyModel[289].rotateAngleY = -3.14159265F;

		bodyModel[290].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[290].setRotationPoint(17.5F, -3F, -7F);
		bodyModel[290].rotateAngleY = -3.14159265F;

		bodyModel[291].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[291].setRotationPoint(17.5F, -8F, -7F);
		bodyModel[291].rotateAngleY = -3.14159265F;

		bodyModel[292].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[292].setRotationPoint(7.5F, -3F, 7F);
		bodyModel[292].rotateAngleY = -3.14159265F;

		bodyModel[293].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[293].setRotationPoint(7.5F, -8F, 7F);
		bodyModel[293].rotateAngleY = -3.14159265F;

		bodyModel[294].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[294].setRotationPoint(7.5F, -3F, -7F);
		bodyModel[294].rotateAngleY = -3.14159265F;

		bodyModel[295].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[295].setRotationPoint(7.5F, -8F, -7F);
		bodyModel[295].rotateAngleY = -3.14159265F;

		bodyModel[296].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[296].setRotationPoint(-2.5F, -3F, 7F);
		bodyModel[296].rotateAngleY = -3.14159265F;

		bodyModel[297].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[297].setRotationPoint(-2.5F, -8F, 7F);
		bodyModel[297].rotateAngleY = -3.14159265F;

		bodyModel[298].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[298].setRotationPoint(-2.5F, -3F, -7F);
		bodyModel[298].rotateAngleY = -3.14159265F;

		bodyModel[299].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[299].setRotationPoint(-2.5F, -8F, -7F);
		bodyModel[299].rotateAngleY = -3.14159265F;

		bodyModel[300].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[300].setRotationPoint(-12.5F, -3F, 7F);
		bodyModel[300].rotateAngleY = -3.14159265F;

		bodyModel[301].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[301].setRotationPoint(-12.5F, -8F, 7F);
		bodyModel[301].rotateAngleY = -3.14159265F;

		bodyModel[302].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[302].setRotationPoint(-12.5F, -3F, -7F);
		bodyModel[302].rotateAngleY = -3.14159265F;

		bodyModel[303].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[303].setRotationPoint(-12.5F, -8F, -7F);
		bodyModel[303].rotateAngleY = -3.14159265F;

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[304].setRotationPoint(53.5F, 4F, 10.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[305].setRotationPoint(53.5F, 4F, -11F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.02F, 0F, 0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[306].setRotationPoint(54.5F, -19F, -2F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338 glow
		bodyModel[307].setRotationPoint(56.51F, -18.25F, -2F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, 0F, -0.25F, -0.79F, -1.585F, -2F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0.75F, 0F, -0.25F, 0.75F, -1.585F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[308].setRotationPoint(54.5F, -19F, -6F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.02F, -1F, -0.25F, -0.79F, 0.415F, 0F, -0.8F, 0F, 0F, -0.02F, 0F, 0F, 0F, -1F, -0.25F, 0.75F, 0.415F, 0F, 0.75F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[309].setRotationPoint(54.5F, -19F, -4F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[310].setRotationPoint(58.5F, -16F, -3F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.45F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.45F, 0F, -0.85F, 0F, 0F, 0F); // Box 128
		bodyModel[311].setRotationPoint(54.5F, -16F, 9F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, -1.45F, 0F, 2.5F, -0.6F, 0F, -2.85F, -0.55F, 0F, -0.15F, 0F, 0F, 0F, -1.45F, 0F, 2.5F, -0.6F, 0F, -2.85F, -0.55F, 0F, -0.15F); // Box 177
		bodyModel[312].setRotationPoint(56.4F, -16F, 8.3F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-1F, 0F, 0F, 0.9F, 0F, 0F, 0.3F, 0F, 0.45F, -0.45F, 0F, -0.2F, -1F, 0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0.45F, -0.45F, 0F, -0.2F); // Box 176
		bodyModel[313].setRotationPoint(57.5F, -16F, 3F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[314].setRotationPoint(58.5F, -10.99F, -3F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.45F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.45F, 0F, -0.85F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[315].setRotationPoint(54.5F, -10.99F, 9F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, -1.45F, 0F, 2.5F, -0.6F, 0F, -2.85F, -0.55F, 0F, -0.15F, 0F, 0F, 0F, -1.45F, 0F, 2.5F, -0.6F, 0F, -2.85F, -0.55F, 0F, -0.15F); // Box 177 glow
		bodyModel[316].setRotationPoint(56.4F, -10.99F, 8.3F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-1F, 0F, 0F, 0.9F, 0F, 0F, 0.3F, 0F, 0.45F, -0.45F, 0F, -0.2F, -1F, 0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0.45F, -0.45F, 0F, -0.2F); // Box 176 glow
		bodyModel[317].setRotationPoint(57.5F, -10.99F, 3F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0.45F, 0F, -0.85F, -0.1F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0F, -0.85F, -0.1F, 0F, 0.7F, 0F, 0F, 0F); // Box 588
		bodyModel[318].setRotationPoint(54.5F, -16F, -10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-0.55F, 0F, -0.15F, -0.6F, 0F, -2.85F, -1.45F, 0F, 2.5F, 0F, 0F, 0F, -0.55F, 0F, -0.15F, -0.6F, 0F, -2.85F, -1.45F, 0F, 2.5F, 0F, 0F, 0F); // Box 589
		bodyModel[319].setRotationPoint(56.4F, -16F, -9.3F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.45F, 0F, -0.2F, 0.3F, 0F, 0.45F, 0.9F, 0F, 0F, -1F, 0F, 0F, -0.45F, 0F, -0.2F, 0.3F, 0F, 0.45F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 590
		bodyModel[320].setRotationPoint(57.5F, -16F, -6F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0.45F, 0F, -0.85F, -0.1F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0F, -0.85F, -0.1F, 0F, 0.7F, 0F, 0F, 0F); // Box 591 glow
		bodyModel[321].setRotationPoint(54.5F, -10.99F, -10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.55F, 0F, -0.15F, -0.6F, 0F, -2.85F, -1.45F, 0F, 2.5F, 0F, 0F, 0F, -0.55F, 0F, -0.15F, -0.6F, 0F, -2.85F, -1.45F, 0F, 2.5F, 0F, 0F, 0F); // Box 592 glow
		bodyModel[322].setRotationPoint(56.4F, -10.99F, -9.3F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-0.45F, 0F, -0.2F, 0.3F, 0F, 0.45F, 0.9F, 0F, 0F, -1F, 0F, 0F, -0.45F, 0F, -0.2F, 0.3F, 0F, 0.45F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 593 glow
		bodyModel[323].setRotationPoint(57.5F, -10.99F, -6F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.45F, -0.85F, -0.85F, 0F, -0.85F, 0F, 0F, -0.15F, 0F, -0.1F, -0.15F, 0.7F, 0.45F, -0.15F, -0.85F, 0F, -0.15F, 0F); // Box 128
		bodyModel[324].setRotationPoint(54.5F, -16.85F, 9F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1.45F, 0F, 2.5F, -0.6F, -0.85F, -2.85F, -0.55F, -0.85F, -0.15F, 0F, -0.15F, 0F, -1.45F, -0.15F, 2.5F, -0.6F, -0.15F, -2.85F, -0.55F, -0.15F, -0.15F); // Box 177
		bodyModel[325].setRotationPoint(56.4F, -16.85F, 8.3F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.15F, 0F, -0.1F, -0.85F, 0F, -0.1F, -0.85F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.1F, -0.15F, 0F, -0.1F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 128
		bodyModel[326].setRotationPoint(58.5F, -16.85F, -3F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.85F, 0F, 0.45F, -0.85F, -0.85F, -0.1F, 0F, 0.7F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0.45F, -0.15F, -0.85F, -0.1F, -0.15F, 0.7F, 0F, -0.15F, 0F); // Box 599
		bodyModel[327].setRotationPoint(54.5F, -16.85F, -10F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.55F, -0.85F, -0.15F, -0.6F, -0.85F, -2.85F, -1.45F, 0F, 2.5F, 0F, 0F, 0F, -0.55F, -0.15F, -0.15F, -0.6F, -0.15F, -2.85F, -1.45F, -0.15F, 2.5F, 0F, -0.15F, 0F); // Box 600
		bodyModel[328].setRotationPoint(56.4F, -16.85F, -9.3F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.45F, 0F, -0.2F, 0.3F, -0.85F, 0.45F, 0.9F, -0.85F, 0F, -1F, -0.15F, 0F, -0.45F, -0.15F, -0.2F, 0.3F, -0.15F, 0.45F, 0.9F, -0.15F, 0F, -1F, -0.15F, 0F); // Box 602
		bodyModel[329].setRotationPoint(57.5F, -16.85F, -6F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[330].setRotationPoint(57.5F, -17.45F, -3F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.35F, 0F, -0.85F, -0.55F, -0.6F, -0.2F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0.35F, -1F, -0.85F, -0.55F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[331].setRotationPoint(57.5F, -17.45F, -6F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.14F, 0F, -0.1F, -0.5F, -0.7F, -0.95F, 0.2F, 0.95F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.1F, 0.2F, -0.7F, -0.9F, -1F, 0.95F, 0F, -0.975F, 0F); // Box 332
		bodyModel[332].setRotationPoint(54.5F, -17.45F, -9F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.4F, 0F, -0.95F, -0.6F, -0.6F, 0.3F, 0.95F, -0.6F, -0.8F, -1.15F, 0F, -0.15F, 0.4F, -1F, -0.95F, -0.6F, 0.2F, 0.3F, 0.95F, 0.2F, -0.8F, -1.15F, -1F, -0.15F); // Box 128
		bodyModel[333].setRotationPoint(56F, -17.45F, -8F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1.15F, 0F, -0.15F, 0.95F, -0.6F, -0.8F, -0.6F, -0.6F, 0.3F, 0.4F, 0F, -0.95F, -1.15F, -1F, -0.15F, 0.95F, 0.2F, -0.8F, -0.6F, 0.2F, 0.3F, 0.4F, -1F, -0.95F); // Box 610
		bodyModel[334].setRotationPoint(56F, -17.45F, 5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.98F, 0F, 0F, 0.51F, 0F, 0F, 0.51F, 0F, 0F, -0.98F, 0F); // Box 128
		bodyModel[335].setRotationPoint(54.5F, -19F, -2F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.985F, 0F, 0.65F, -1.435F, 0F, 1F, -1.51F, 0F, -0.5F, -0.95F, 0F, -0.5F, -0.015F, 0F, 0F, 0.55F, 0F, 0F, 0.55F, 0F, -0.5F, -0.05F, 0F); // Box 614
		bodyModel[336].setRotationPoint(56.5F, -19F, -3F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.85F, -0.955F, 1.74F, -1.15F, -1.26F, 2.3F, -0.35F, -1.435F, -2F, 0.5F, -0.985F, -2F, 0.85F, -1.045F, 1.74F, -1.35F, -0.45F, 2.15F, -1F, -0.45F, -2F, 0.5F, -1.015F, -2F); // Box 128
		bodyModel[337].setRotationPoint(57.5F, -19F, -3F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.35F, -1F, 0.35F, -0.95F, -1.35F, 1.05F, 0.85F, -1.27F, -2.3F, -1.15F, -0.955F, -1.74F, 0.35F, 0F, 0.35F, -0.9F, 0.55F, 1.05F, 0.65F, 0.55F, -2.15F, -1.15F, -0.045F, -1.74F); // Box 265
		bodyModel[338].setRotationPoint(55.5F, -19F, -6F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.02F, 0F, 0F, -0.8F, 0F, 0F, -0.765F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[339].setRotationPoint(54.5F, -19F, -3F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.35F, 0F, 0.05F, -1.35F, -0.95F, -0.35F, -1F, 0.65F, 0F, -1F, 0F, 0F, 0.585F, 0F, 0.1F, 0.55F, -0.95F, -0.35F, 0F, 0.65F, 0F, 0F, 0F); // Box 128
		bodyModel[340].setRotationPoint(54.5F, -19F, -8F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.35F, 0.065F, 0F, -1.35F, -0.535F, 0F, -1F, -0.8F, 0F, 0F, -0.01F, 0F, 1F, -0.95F, 0F, -1.35F, -0.465F, 0F, -1F, -0.2F, 0F, 1F, -0.95F, 0F); // Box 128
		bodyModel[341].setRotationPoint(58.5F, -17.5F, -3F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,1.15F, 0.24F, -0.7F, -2.15F, -0.2F, -0.7F, -1.35F, -0.535F, 0F, 0.35F, 0.065F, 0F, 1.35F, -0.95F, -0.85F, -2.15F, -0.8F, -0.7F, -1.35F, -0.465F, 0F, 1F, -0.95F, 0F); // Box 128
		bodyModel[342].setRotationPoint(58.5F, -17.5F, -6F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.45F, 0.2F, -0.95F, -0.6F, -0.5F, 0.3F, 0.95F, -0.25F, -0.8F, -1.35F, 0.28F, -0.3F, 0.4F, -1F, -0.95F, -0.6F, -0.4F, 0.3F, 0.95F, -0.4F, -0.8F, -1.15F, -1F, -0.15F); // Box 128
		bodyModel[343].setRotationPoint(56F, -17.45F, -8F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.25F, -0.04F, 0.005F, -0.25F, -0.04F, 0.005F, 0F, -0.05F, 0.42F, 0F, -0.05F, 0.42F, 0.25F, 0F, 0.005F, -0.25F, 0F, 0.005F, 0F, 0F, 0.42F, 0F, 0F, 0.42F); // Box 338 glow
		bodyModel[344].setRotationPoint(56.51F, -18.25F, -4.42F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338 glow
		bodyModel[345].setRotationPoint(56.51F, -18.25F, -3F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -0.24F, -0.04F, -1.585F, -0.24F, -0.04F, 1.585F, 0F, 0F, 0F, 0F, 0F, 0F, -0.24F, 0F, -1.585F, -0.24F, 0F, 1.585F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[346].setRotationPoint(54.5F, -18.25F, -6.01F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -0.15F, 0F, 0.9F, -0.85F, 0F, 0.3F, -0.85F, 0.45F, -0.45F, 0F, -0.2F, -1F, -0.15F, 0F, 0.9F, -0.15F, 0F, 0.3F, -0.15F, 0.45F, -0.45F, -0.15F, -0.2F); // Box 582
		bodyModel[347].setRotationPoint(57.5F, -16.85F, 3F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, -0.55F, -0.6F, -0.2F, 0.35F, 0F, -0.85F, 0F, -1F, 0F, 0F, 0.2F, 0F, -0.55F, 0.2F, -0.2F, 0.35F, -1F, -0.85F); // Box 583
		bodyModel[348].setRotationPoint(57.5F, -17.45F, 3F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1.35F, 0.28F, -0.3F, 0.95F, -0.25F, -0.8F, -0.6F, -0.5F, 0.3F, 0.45F, 0.2F, -0.95F, -1.15F, -1F, -0.15F, 0.95F, -0.4F, -0.8F, -0.6F, -0.4F, 0.3F, 0.4F, -1F, -0.95F); // Box 584
		bodyModel[349].setRotationPoint(56F, -17.45F, 5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.02F, 0F, -2F, -0.02F, 0F, -0.25F, -0.79F, -1.585F, 0F, -0.75F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0.75F, -1.585F, 0F, 0.75F, 0F); // Box 586
		bodyModel[350].setRotationPoint(54.5F, -19F, 3F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.02F, 0F, 0F, -0.8F, 0F, -0.25F, -0.79F, 0.415F, 0F, -0.02F, -1F, 0F, 0F, 0F, 0F, 0.75F, 0F, -0.25F, 0.75F, 0.415F, 0F, 0F, -1F); // Box 587
		bodyModel[351].setRotationPoint(54.5F, -19F, 3F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.02F, 0F, 0F, -0.765F, 0F, 0F, -0.8F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[352].setRotationPoint(54.5F, -19F, 2F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.05F, 0.42F, 0F, -0.05F, 0.42F, -0.25F, -0.04F, 0.005F, 0.25F, -0.04F, 0.005F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, -0.25F, 0F, 0.005F, 0.25F, 0F, 0.005F); // Box 589 glow
		bodyModel[353].setRotationPoint(56.51F, -18.25F, 3.42F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590 glow
		bodyModel[354].setRotationPoint(56.51F, -18.25F, 2F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -0.24F, -0.04F, 1.585F, -0.24F, -0.04F, -1.585F, 0F, 0F, 0F, 0F, 0F, 0F, -0.24F, 0F, 1.585F, -0.24F, 0F, -1.585F, 0F, 0F, 0F); // Box 591 glow
		bodyModel[355].setRotationPoint(54.5F, -18.25F, 6.01F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.95F, 0F, 1F, -1.51F, 0F, 0.65F, -1.435F, 0F, -0.5F, -0.985F, 0F, -0.5F, -0.05F, 0F, 0F, 0.55F, 0F, 0F, 0.55F, 0F, -0.5F, -0.015F, 0F); // Box 592
		bodyModel[356].setRotationPoint(56.5F, -19F, 2F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.5F, -0.985F, -2F, -0.35F, -1.435F, -2F, -1.15F, -1.26F, 2.3F, 0.85F, -0.955F, 1.74F, 0.5F, -1.015F, -2F, -1F, -0.45F, -2F, -1.35F, -0.45F, 2.15F, 0.85F, -1.045F, 1.74F); // Box 593
		bodyModel[357].setRotationPoint(57.5F, -19F, 1F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.01F, 0F, -1F, -0.8F, 0F, -1.35F, -0.535F, 0F, 0.35F, 0.065F, 0F, 1F, -0.95F, 0F, -1F, -0.2F, 0F, -1.35F, -0.465F, 0F, 1F, -0.95F, 0F); // Box 594
		bodyModel[358].setRotationPoint(58.5F, -17.5F, 2F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.35F, 0.065F, 0F, -1.35F, -0.535F, 0F, -2.15F, -0.2F, -0.7F, 1.15F, 0.24F, -0.7F, 1F, -0.95F, 0F, -1.35F, -0.465F, 0F, -2.15F, -0.8F, -0.7F, 1.35F, -0.95F, -0.85F); // Box 595
		bodyModel[359].setRotationPoint(58.5F, -17.5F, 3F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1.15F, -0.955F, -1.74F, 0.85F, -1.27F, -2.3F, -0.95F, -1.35F, 1.05F, 0.35F, -1F, 0.35F, -1.15F, -0.045F, -1.74F, 0.65F, 0.55F, -2.15F, -0.9F, 0.55F, 1.05F, 0.35F, 0F, 0.35F); // Box 596
		bodyModel[360].setRotationPoint(55.5F, -19F, 3F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.35F, -1F, 0.65F, 0.05F, -1.35F, -0.95F, 0F, -1.35F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0.65F, 0.1F, 0.55F, -0.95F, 0F, 0.585F, 0F); // Box 597
		bodyModel[361].setRotationPoint(54.5F, -19F, 7F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, -0.98F, 0F, 0F, 0.51F, 0F, 0F, 0.51F, -1F, 0F, -0.99F, 0F); // Box 598
		bodyModel[362].setRotationPoint(54.5F, -19F, 2F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -3F, 0F, -1.5F, -2F, -1.15F, -1.25F, 2.3F, 0F, 0F, 0F, 0F, -0.99F, -3F, 0F, 0.51F, -2F, -1.15F, 0.27F, 2.3F, 0F, -0.99F, 0F); // Box 599
		bodyModel[363].setRotationPoint(54.5F, -19F, 0F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.25F, 0F, -1F, -1.5F, 0F, -1.7F, -1.25F, 0.45F, 1.15F, 0F, -0.7F, 0F, -0.1F, 0F, -1F, 0.75F, 0F, -1.7F, 0.55F, 0.45F, 1.15F, -0.55F, -0.7F); // Box 600
		bodyModel[364].setRotationPoint(58.5F, -17.75F, 2F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.4F, 0.75F, 0.85F, -2.6F, 0.75F, 0.85F, -1.15F, -0.5F, -2.7F, 0F, -0.25F, 0F, -0.4F, -1.3F, 0.85F, -2.6F, -1.3F, 0.85F, -1.15F, -0.2F, -2.7F, 0F, -0.49F, 0F); // Box 601
		bodyModel[365].setRotationPoint(56.95F, -17F, 6.15F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,2.45F, 1.25F, -0.85F, -2.6F, 0.75F, 0.85F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 2.45F, -2F, -0.85F, -2.6F, -1.73F, 0.845F, -3F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 602
		bodyModel[366].setRotationPoint(56.95F, -17F, 6.15F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 1.25F, 0F, -3F, 1.25F, 0F, -0.55F, -0.25F, -0.85F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -0.55F, -0.49F, -0.85F, 0F, -0.96F, 0F); // Box 604
		bodyModel[367].setRotationPoint(54.5F, -17F, 7F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, -0.15F, -0.55F, 0F, -1F, -0.55F, 0F, 1F, 0F, 0F, 0.15F, 0F, 0F, -0.15F, -0.55F, 0F, -1F, -0.55F, 0F, 1F, 0F, 0F, 0.15F); // Box 38
		bodyModel[368].setRotationPoint(54.5F, -10F, -10.05F);

		bodyModel[369].addBox(0F, 0F, 0F, 0, 4, 6, 0F); // Box 38
		bodyModel[369].setRotationPoint(59.4F, -10F, -3F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,-0.3F, 0F, -0.55F, 0.3F, 0F, -0.55F, 1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, -0.55F, 0.3F, 0F, -0.55F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[370].setRotationPoint(58.4F, -10F, -7F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0F, -1.25F, 0F, -2.6F, -1.25F, 0F, 2.6F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -2.6F, -1.25F, 0F, 2.6F, 0F, 0F, 0F); // Box 38
		bodyModel[371].setRotationPoint(56.95F, -10F, -9.05F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0.15F, -0.55F, 0F, 1F, -0.55F, 0F, -1F, 0F, 0F, -0.15F, 0F, 0F, 0.15F, -0.55F, 0F, 1F, -0.55F, 0F, -1F, 0F, 0F, -0.15F); // Box 609
		bodyModel[372].setRotationPoint(54.5F, -10F, 10.05F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0.3F, 0F, -0.55F, -0.3F, 0F, -0.55F, -1F, 0F, 0F, 1F, 0F, 0F, 0.3F, 0F, -0.55F, -0.3F, 0F, -0.55F); // Box 610
		bodyModel[373].setRotationPoint(58.4F, -10F, 3F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0F, -1.25F, 0F, 2.6F, -1.25F, 0F, -2.6F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 2.6F, -1.25F, 0F, -2.6F, 0F, 0F, 0F); // Box 611
		bodyModel[374].setRotationPoint(56.95F, -10F, 9.05F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.475F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.475F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.875F, -0.5F, 0F); // marker light red glow
		bodyModel[375].setRotationPoint(52.45F, -13.75F, 10.6F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -0.3F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.05F, -0.3F); // Box 613
		bodyModel[376].setRotationPoint(53.5F, -14.1F, 11F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.45F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, -0.45F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.05F, -0.3F, -1F, -1.05F, -0.3F); // Box 614
		bodyModel[377].setRotationPoint(52.5F, -14.1F, 11F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.285F, 0F, 0F, -0.285F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.285F, 0F, 0F, -0.285F, 0F, 0F, 0F, 0F, 0F); // Box 615
		bodyModel[378].setRotationPoint(54.5F, 6F, 10.25F);
		bodyModel[378].rotateAngleY = -0.33161256F;

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.25F, 0F, 0F, 0.2F, 0F, -1.39F, -0.63F, 0F, 0.95F, 0.3F, 0F, -0.05F, -0.25F, 0F, 0F, 0.2F, 0F, -1.39F, -0.63F, 0F, 0.95F, 0.3F, 0F, -0.05F); // Box 38
		bodyModel[379].setRotationPoint(57.8F, -2F, -10.95F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0.3F, 0F, -0.05F, -0.63F, 0F, 0.95F, 0.2F, 0F, -1.39F, -0.25F, 0F, 0F, 0.3F, 0F, -0.05F, -0.63F, 0F, 0.95F, 0.2F, 0F, -1.39F, -0.25F, 0F, 0F); // Box 618
		bodyModel[380].setRotationPoint(57.8F, -2F, 9.95F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, -0.75F, -0.375F, 0.125F, -0.75F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // marker light red glow
		bodyModel[381].setRotationPoint(59.66F, -14.25F, -6.77F);
		bodyModel[381].rotateAngleY = -0.2443461F;

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, -0.75F, -0.375F, 0.125F, -0.75F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // marker light green off
		bodyModel[382].setRotationPoint(59.92F, -14.25F, -5.75F);
		bodyModel[382].rotateAngleY = -0.2443461F;

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.01F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.06F, 0.16F, 0F, 0.06F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.06F, 0F, 0F, 0.06F); // Box 38
		bodyModel[383].setRotationPoint(59.36F, -14.5F, -6.96F);
		bodyModel[383].rotateAngleY = -0.2443461F;

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, -0.375F, -0.75F, 0.125F, -0.375F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.375F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0F, -0.375F, 0.125F); // marker light red glow
		bodyModel[384].setRotationPoint(59.9F, -14.25F, 5.81F);
		bodyModel[384].rotateAngleY = 0.2443461F;

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, -0.375F, -0.75F, 0.125F, -0.375F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.375F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0F, -0.375F, 0.125F); // marker light green off
		bodyModel[385].setRotationPoint(60.14F, -14.25F, 4.85F);
		bodyModel[385].rotateAngleY = 0.2443461F;

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.16F, 0F, 0.05F, -0.75F, 0F, 0.05F, -0.75F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0.05F, -0.75F, 0F, 0.05F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 607
		bodyModel[386].setRotationPoint(59.84F, -14.5F, 5.02F);
		bodyModel[386].rotateAngleY = 0.2443461F;

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 1F, -0.615F, -1.5F, 0.615F, -0.65F, -1.5F, -1F, 0.155F, -0.195F, -1F, 0F, -0.5F, 0.6F, -0.625F, -0.5F, 0.61F, -0.65F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 610
		bodyModel[387].setRotationPoint(59.5F, -16.5F, 3F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.845F, -0.195F, 0F, -0.65F, -1.5F, 0F, -1.25F, -1.5F, -0.2F, -0.3F, 0F, -0.55F, -1F, 0.5F, 0F, -0.65F, 0.5F, 0F, -1.25F, 0.5F, -0.2F, -0.3F, 0.5F, -0.55F); // Box 611
		bodyModel[388].setRotationPoint(58.5F, -16.5F, 3F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.34F, -0.33F, 0F, -0.34F, -0.33F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.34F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[389].setRotationPoint(59.51F, -14.5F, -7.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.43F, 0F, -0.045F, -0.43F, 0F, -0.045F, -0.16F, 0F, -0.455F, 0.16F, 0F, -0.455F, 0.34F, -0.67F, 0F, -0.34F, -0.67F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38
		bodyModel[390].setRotationPoint(59.51F, -14.5F, -7.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.34F, -0.33F, 0F, 0.34F, -0.33F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.34F, 0F, 0F, 0.34F, 0F, 0F); // Box 613
		bodyModel[391].setRotationPoint(59.51F, -14.5F, 6.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.16F, 0F, -0.455F, -0.16F, 0F, -0.455F, -0.43F, 0F, -0.045F, 0.43F, 0F, -0.045F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.34F, -0.67F, 0F, 0.34F, -0.67F, 0F); // Box 614
		bodyModel[392].setRotationPoint(59.51F, -14.5F, 6.5F);

		bodyModel[393].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[393].setRotationPoint(-59.49F, 4F, 8F);

		bodyModel[394].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[394].setRotationPoint(-59.49F, 4F, -8F);

		bodyModel[395].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[395].setRotationPoint(-59.49F, 4F, -8F);

		bodyModel[396].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[396].setRotationPoint(-55.51F, 4F, -8F);

		bodyModel[397].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[397].setRotationPoint(-55.51F, 4F, -8F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1.25F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 1.25F, -1F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 1F, 0F); // Box 620
		bodyModel[398].setRotationPoint(59.5F, -15F, 2F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.35F, 1.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, 0F, -0.3825F, 1.5F, 0.615F, 0F, -2.5F, -1F, -2F, -0.5F, -1F, -2F, -0.5F, 0F, 0F, -2.5F, 0.6F); // Box 620
		bodyModel[399].setRotationPoint(59.5F, -13.5F, -4F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.75F, 0F, 0.3F, -1F, -1F, 0.5F, 0F, -2F, -0.5F, -1.35F, 0F, -0.5F, -0.3F, -1F, -0.05F, -1.7F, 0F, -0.05F, -1F, 1F, -0.5F, -1F, -1F, -0.5F); // Box 621
		bodyModel[400].setRotationPoint(58.5F, -15F, -6.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, 0F, -0.55F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, -1F, 0F, -0.3F, 0F, -0.55F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 622
		bodyModel[401].setRotationPoint(58.5F, -14F, -7F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.55F, 0.5F, -0.15F, -0.45F, -0.5F, -3.15F, -1.125F, -0.5F, 2.7F, 0F, 0.5F, 0F, -0.55F, -0.5F, -0.15F, -0.45F, -0.5F, -3.15F, -1.15F, -0.5F, 2.7F, 0F, -0.5F, 0F); // Box 623
		bodyModel[402].setRotationPoint(56.95F, -14.5F, -10.15F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.2F, 0F, -0.95F, 0.2F, 0.95F, -0.1F, -0.5F, -0.7F, 0F, -0.14F, 0F, 0F, -0.975F, 0F, -0.9F, -1F, 0.95F, -0.1F, 0.2F, -0.7F, 0F, 0.2F, 0F); // Box 613
		bodyModel[403].setRotationPoint(54.5F, -17.45F, 8F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.98F, 0F, 0F, -0.98F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 614
		bodyModel[404].setRotationPoint(42.5F, -17.45F, 8F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.475F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.475F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.875F, -0.5F, 0F); // marker light red off
		bodyModel[405].setRotationPoint(52.45F, -13.75F, 10.6F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.475F, 0F, -0.5F, -0.875F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.475F, -0.5F, -0.5F); // marker light red off
		bodyModel[406].setRotationPoint(52.45F, -13.75F, -11.6F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, -0.75F, -0.375F, 0.125F, -0.75F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // marker light red off
		bodyModel[407].setRotationPoint(59.66F, -14.25F, -6.77F);
		bodyModel[407].rotateAngleY = -0.2443461F;

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, -0.75F, -0.375F, 0.125F, -0.75F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // marker light green glow
		bodyModel[408].setRotationPoint(59.92F, -14.25F, -5.75F);
		bodyModel[408].rotateAngleY = -0.2443461F;

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, -0.375F, -0.75F, 0.125F, -0.375F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.375F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0F, -0.375F, 0.125F); // marker light red off
		bodyModel[409].setRotationPoint(59.9F, -14.25F, 5.81F);
		bodyModel[409].rotateAngleY = 0.2443461F;

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, -0.375F, -0.75F, 0.125F, -0.375F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.375F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0F, -0.375F, 0.125F); // marker light green glow
		bodyModel[410].setRotationPoint(60.14F, -14.25F, 4.85F);
		bodyModel[410].rotateAngleY = 0.2443461F;

		bodyModel[411].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[411].setRotationPoint(-14F, 0F, 4F);

		bodyModel[412].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[412].setRotationPoint(-14F, 0F, -10F);

		bodyModel[413].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[413].setRotationPoint(-12.5F, -5F, 7F);
		bodyModel[413].rotateAngleY = -3.14159265F;

		bodyModel[414].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[414].setRotationPoint(-12.5F, -3F, 7F);
		bodyModel[414].rotateAngleY = -3.14159265F;

		bodyModel[415].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[415].setRotationPoint(-12.5F, -5F, 7F);
		bodyModel[415].rotateAngleY = -3.14159265F;

		bodyModel[416].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[416].setRotationPoint(-12.5F, -4.5F, 7F);
		bodyModel[416].rotateAngleY = -3.14159265F;

		bodyModel[417].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[417].setRotationPoint(-12.5F, -4F, 7F);
		bodyModel[417].rotateAngleY = -3.14159265F;

		bodyModel[418].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[418].setRotationPoint(-12.5F, -5F, 7F);
		bodyModel[418].rotateAngleY = -3.14159265F;

		bodyModel[419].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[419].setRotationPoint(-12.5F, -3F, 7F);
		bodyModel[419].rotateAngleY = -3.14159265F;

		bodyModel[420].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[420].setRotationPoint(-12.5F, -5F, 7F);
		bodyModel[420].rotateAngleY = -3.14159265F;

		bodyModel[421].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[421].setRotationPoint(-12.5F, -4.5F, 7F);
		bodyModel[421].rotateAngleY = -3.14159265F;

		bodyModel[422].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[422].setRotationPoint(-12.5F, -4F, 7F);
		bodyModel[422].rotateAngleY = -3.14159265F;

		bodyModel[423].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[423].setRotationPoint(-12.5F, -5F, -7F);
		bodyModel[423].rotateAngleY = -3.14159265F;

		bodyModel[424].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[424].setRotationPoint(-12.5F, -3F, -7F);
		bodyModel[424].rotateAngleY = -3.14159265F;

		bodyModel[425].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[425].setRotationPoint(-12.5F, -5F, -7F);
		bodyModel[425].rotateAngleY = -3.14159265F;

		bodyModel[426].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[426].setRotationPoint(-12.5F, -4.5F, -7F);
		bodyModel[426].rotateAngleY = -3.14159265F;

		bodyModel[427].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[427].setRotationPoint(-12.5F, -4F, -7F);
		bodyModel[427].rotateAngleY = -3.14159265F;

		bodyModel[428].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[428].setRotationPoint(-12.5F, -5F, -7F);
		bodyModel[428].rotateAngleY = -3.14159265F;

		bodyModel[429].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[429].setRotationPoint(-12.5F, -3F, -7F);
		bodyModel[429].rotateAngleY = -3.14159265F;

		bodyModel[430].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[430].setRotationPoint(-12.5F, -5F, -7F);
		bodyModel[430].rotateAngleY = -3.14159265F;

		bodyModel[431].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[431].setRotationPoint(-12.5F, -4.5F, -7F);
		bodyModel[431].rotateAngleY = -3.14159265F;

		bodyModel[432].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[432].setRotationPoint(-12.5F, -4F, -7F);
		bodyModel[432].rotateAngleY = -3.14159265F;

		bodyModel[433].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[433].setRotationPoint(-4F, 0F, 4F);

		bodyModel[434].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[434].setRotationPoint(-4F, 0F, -10F);

		bodyModel[435].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[435].setRotationPoint(-2.5F, -5F, 7F);
		bodyModel[435].rotateAngleY = -3.14159265F;

		bodyModel[436].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[436].setRotationPoint(-2.5F, -3F, 7F);
		bodyModel[436].rotateAngleY = -3.14159265F;

		bodyModel[437].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[437].setRotationPoint(-2.5F, -5F, 7F);
		bodyModel[437].rotateAngleY = -3.14159265F;

		bodyModel[438].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[438].setRotationPoint(-2.5F, -4.5F, 7F);
		bodyModel[438].rotateAngleY = -3.14159265F;

		bodyModel[439].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[439].setRotationPoint(-2.5F, -4F, 7F);
		bodyModel[439].rotateAngleY = -3.14159265F;

		bodyModel[440].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[440].setRotationPoint(-2.5F, -5F, 7F);
		bodyModel[440].rotateAngleY = -3.14159265F;

		bodyModel[441].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[441].setRotationPoint(-2.5F, -3F, 7F);
		bodyModel[441].rotateAngleY = -3.14159265F;

		bodyModel[442].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[442].setRotationPoint(-2.5F, -5F, 7F);
		bodyModel[442].rotateAngleY = -3.14159265F;

		bodyModel[443].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[443].setRotationPoint(-2.5F, -4.5F, 7F);
		bodyModel[443].rotateAngleY = -3.14159265F;

		bodyModel[444].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[444].setRotationPoint(-2.5F, -4F, 7F);
		bodyModel[444].rotateAngleY = -3.14159265F;

		bodyModel[445].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[445].setRotationPoint(-2.5F, -5F, -7F);
		bodyModel[445].rotateAngleY = -3.14159265F;

		bodyModel[446].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[446].setRotationPoint(-2.5F, -3F, -7F);
		bodyModel[446].rotateAngleY = -3.14159265F;

		bodyModel[447].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[447].setRotationPoint(-2.5F, -5F, -7F);
		bodyModel[447].rotateAngleY = -3.14159265F;

		bodyModel[448].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[448].setRotationPoint(-2.5F, -4.5F, -7F);
		bodyModel[448].rotateAngleY = -3.14159265F;

		bodyModel[449].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[449].setRotationPoint(-2.5F, -4F, -7F);
		bodyModel[449].rotateAngleY = -3.14159265F;

		bodyModel[450].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[450].setRotationPoint(-2.5F, -5F, -7F);
		bodyModel[450].rotateAngleY = -3.14159265F;

		bodyModel[451].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[451].setRotationPoint(-2.5F, -3F, -7F);
		bodyModel[451].rotateAngleY = -3.14159265F;

		bodyModel[452].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[452].setRotationPoint(-2.5F, -5F, -7F);
		bodyModel[452].rotateAngleY = -3.14159265F;

		bodyModel[453].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[453].setRotationPoint(-2.5F, -4.5F, -7F);
		bodyModel[453].rotateAngleY = -3.14159265F;

		bodyModel[454].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[454].setRotationPoint(-2.5F, -4F, -7F);
		bodyModel[454].rotateAngleY = -3.14159265F;

		bodyModel[455].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[455].setRotationPoint(6F, 0F, 4F);

		bodyModel[456].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[456].setRotationPoint(6F, 0F, -10F);

		bodyModel[457].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[457].setRotationPoint(7.5F, -5F, 7F);
		bodyModel[457].rotateAngleY = -3.14159265F;

		bodyModel[458].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[458].setRotationPoint(7.5F, -3F, 7F);
		bodyModel[458].rotateAngleY = -3.14159265F;

		bodyModel[459].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[459].setRotationPoint(7.5F, -5F, 7F);
		bodyModel[459].rotateAngleY = -3.14159265F;

		bodyModel[460].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[460].setRotationPoint(7.5F, -4.5F, 7F);
		bodyModel[460].rotateAngleY = -3.14159265F;

		bodyModel[461].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[461].setRotationPoint(7.5F, -4F, 7F);
		bodyModel[461].rotateAngleY = -3.14159265F;

		bodyModel[462].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[462].setRotationPoint(7.5F, -5F, 7F);
		bodyModel[462].rotateAngleY = -3.14159265F;

		bodyModel[463].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[463].setRotationPoint(7.5F, -3F, 7F);
		bodyModel[463].rotateAngleY = -3.14159265F;

		bodyModel[464].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[464].setRotationPoint(7.5F, -5F, 7F);
		bodyModel[464].rotateAngleY = -3.14159265F;

		bodyModel[465].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[465].setRotationPoint(7.5F, -4.5F, 7F);
		bodyModel[465].rotateAngleY = -3.14159265F;

		bodyModel[466].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[466].setRotationPoint(7.5F, -4F, 7F);
		bodyModel[466].rotateAngleY = -3.14159265F;

		bodyModel[467].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[467].setRotationPoint(7.5F, -5F, -7F);
		bodyModel[467].rotateAngleY = -3.14159265F;

		bodyModel[468].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[468].setRotationPoint(7.5F, -3F, -7F);
		bodyModel[468].rotateAngleY = -3.14159265F;

		bodyModel[469].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[469].setRotationPoint(7.5F, -5F, -7F);
		bodyModel[469].rotateAngleY = -3.14159265F;

		bodyModel[470].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[470].setRotationPoint(7.5F, -4.5F, -7F);
		bodyModel[470].rotateAngleY = -3.14159265F;

		bodyModel[471].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[471].setRotationPoint(7.5F, -4F, -7F);
		bodyModel[471].rotateAngleY = -3.14159265F;

		bodyModel[472].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[472].setRotationPoint(7.5F, -5F, -7F);
		bodyModel[472].rotateAngleY = -3.14159265F;

		bodyModel[473].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[473].setRotationPoint(7.5F, -3F, -7F);
		bodyModel[473].rotateAngleY = -3.14159265F;

		bodyModel[474].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[474].setRotationPoint(7.5F, -5F, -7F);
		bodyModel[474].rotateAngleY = -3.14159265F;

		bodyModel[475].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[475].setRotationPoint(7.5F, -4.5F, -7F);
		bodyModel[475].rotateAngleY = -3.14159265F;

		bodyModel[476].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[476].setRotationPoint(7.5F, -4F, -7F);
		bodyModel[476].rotateAngleY = -3.14159265F;

		bodyModel[477].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[477].setRotationPoint(16F, 0F, -10F);

		bodyModel[478].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[478].setRotationPoint(17.5F, -5F, 7F);
		bodyModel[478].rotateAngleY = -3.14159265F;

		bodyModel[479].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[479].setRotationPoint(17.5F, -3F, 7F);
		bodyModel[479].rotateAngleY = -3.14159265F;

		bodyModel[480].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[480].setRotationPoint(17.5F, -5F, 7F);
		bodyModel[480].rotateAngleY = -3.14159265F;

		bodyModel[481].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[481].setRotationPoint(17.5F, -4.5F, 7F);
		bodyModel[481].rotateAngleY = -3.14159265F;

		bodyModel[482].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[482].setRotationPoint(17.5F, -4F, 7F);
		bodyModel[482].rotateAngleY = -3.14159265F;

		bodyModel[483].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[483].setRotationPoint(17.5F, -5F, 7F);
		bodyModel[483].rotateAngleY = -3.14159265F;

		bodyModel[484].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[484].setRotationPoint(17.5F, -3F, 7F);
		bodyModel[484].rotateAngleY = -3.14159265F;

		bodyModel[485].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[485].setRotationPoint(17.5F, -5F, 7F);
		bodyModel[485].rotateAngleY = -3.14159265F;

		bodyModel[486].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[486].setRotationPoint(17.5F, -4.5F, 7F);
		bodyModel[486].rotateAngleY = -3.14159265F;

		bodyModel[487].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[487].setRotationPoint(17.5F, -4F, 7F);
		bodyModel[487].rotateAngleY = -3.14159265F;

		bodyModel[488].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[488].setRotationPoint(17.5F, -5F, -7F);
		bodyModel[488].rotateAngleY = -3.14159265F;

		bodyModel[489].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[489].setRotationPoint(17.5F, -3F, -7F);
		bodyModel[489].rotateAngleY = -3.14159265F;

		bodyModel[490].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[490].setRotationPoint(17.5F, -5F, -7F);
		bodyModel[490].rotateAngleY = -3.14159265F;

		bodyModel[491].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[491].setRotationPoint(17.5F, -4.5F, -7F);
		bodyModel[491].rotateAngleY = -3.14159265F;

		bodyModel[492].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[492].setRotationPoint(17.5F, -4F, -7F);
		bodyModel[492].rotateAngleY = -3.14159265F;

		bodyModel[493].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[493].setRotationPoint(17.5F, -5F, -7F);
		bodyModel[493].rotateAngleY = -3.14159265F;

		bodyModel[494].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[494].setRotationPoint(17.5F, -3F, -7F);
		bodyModel[494].rotateAngleY = -3.14159265F;

		bodyModel[495].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[495].setRotationPoint(17.5F, -5F, -7F);
		bodyModel[495].rotateAngleY = -3.14159265F;

		bodyModel[496].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[496].setRotationPoint(17.5F, -4.5F, -7F);
		bodyModel[496].rotateAngleY = -3.14159265F;

		bodyModel[497].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[497].setRotationPoint(17.5F, -4F, -7F);
		bodyModel[497].rotateAngleY = -3.14159265F;

		bodyModel[498].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[498].setRotationPoint(16F, 0F, 4F);

		bodyModel[499].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[499].setRotationPoint(26F, 0F, 4F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 283, 312, textureX, textureY); // Box 638
		bodyModel[501] = new ModelRendererTurbo(this, 296, 274, textureX, textureY); // Right seat part
		bodyModel[502] = new ModelRendererTurbo(this, 301, 277, textureX, textureY); // Right seat part
		bodyModel[503] = new ModelRendererTurbo(this, 303, 274, textureX, textureY); // Right seat part
		bodyModel[504] = new ModelRendererTurbo(this, 296, 277, textureX, textureY); // Right seat part
		bodyModel[505] = new ModelRendererTurbo(this, 310, 274, textureX, textureY); // Right seat part
		bodyModel[506] = new ModelRendererTurbo(this, 296, 282, textureX, textureY); // Right seat part
		bodyModel[507] = new ModelRendererTurbo(this, 301, 285, textureX, textureY); // Right seat part
		bodyModel[508] = new ModelRendererTurbo(this, 303, 282, textureX, textureY); // Right seat part
		bodyModel[509] = new ModelRendererTurbo(this, 310, 282, textureX, textureY); // Right seat part
		bodyModel[510] = new ModelRendererTurbo(this, 296, 302, textureX, textureY); // Left seat part
		bodyModel[511] = new ModelRendererTurbo(this, 301, 305, textureX, textureY); // Left seat part
		bodyModel[512] = new ModelRendererTurbo(this, 303, 302, textureX, textureY); // Left seat part
		bodyModel[513] = new ModelRendererTurbo(this, 296, 305, textureX, textureY); // Left seat part
		bodyModel[514] = new ModelRendererTurbo(this, 310, 302, textureX, textureY); // Left seat part
		bodyModel[515] = new ModelRendererTurbo(this, 296, 310, textureX, textureY); // Left seat part
		bodyModel[516] = new ModelRendererTurbo(this, 301, 313, textureX, textureY); // Left seat part
		bodyModel[517] = new ModelRendererTurbo(this, 303, 310, textureX, textureY); // Left seat part
		bodyModel[518] = new ModelRendererTurbo(this, 296, 313, textureX, textureY); // Left seat part
		bodyModel[519] = new ModelRendererTurbo(this, 310, 310, textureX, textureY); // Left seat part
		bodyModel[520] = new ModelRendererTurbo(this, 296, 285, textureX, textureY); // Right seat part
		bodyModel[521] = new ModelRendererTurbo(this, 324, 292, textureX, textureY); // Right seat part
		bodyModel[522] = new ModelRendererTurbo(this, 316, 274, textureX, textureY); // Right seat part
		bodyModel[523] = new ModelRendererTurbo(this, 324, 320, textureX, textureY); // Left seat part
		bodyModel[524] = new ModelRendererTurbo(this, 316, 302, textureX, textureY); // Left seat part
		bodyModel[525] = new ModelRendererTurbo(this, 314, 284, textureX, textureY); // Boc 42
		bodyModel[526] = new ModelRendererTurbo(this, 314, 312, textureX, textureY); // Boc 42
		bodyModel[527] = new ModelRendererTurbo(this, 327, 274, textureX, textureY); // Right seat part
		bodyModel[528] = new ModelRendererTurbo(this, 332, 277, textureX, textureY); // Right seat part
		bodyModel[529] = new ModelRendererTurbo(this, 334, 274, textureX, textureY); // Right seat part
		bodyModel[530] = new ModelRendererTurbo(this, 327, 277, textureX, textureY); // Right seat part
		bodyModel[531] = new ModelRendererTurbo(this, 341, 274, textureX, textureY); // Right seat part
		bodyModel[532] = new ModelRendererTurbo(this, 327, 282, textureX, textureY); // Right seat part
		bodyModel[533] = new ModelRendererTurbo(this, 332, 285, textureX, textureY); // Right seat part
		bodyModel[534] = new ModelRendererTurbo(this, 334, 282, textureX, textureY); // Right seat part
		bodyModel[535] = new ModelRendererTurbo(this, 327, 285, textureX, textureY); // Right seat part
		bodyModel[536] = new ModelRendererTurbo(this, 341, 282, textureX, textureY); // Right seat part
		bodyModel[537] = new ModelRendererTurbo(this, 327, 302, textureX, textureY); // Left seat part
		bodyModel[538] = new ModelRendererTurbo(this, 332, 305, textureX, textureY); // Left seat part
		bodyModel[539] = new ModelRendererTurbo(this, 334, 302, textureX, textureY); // Left seat part
		bodyModel[540] = new ModelRendererTurbo(this, 327, 305, textureX, textureY); // Left seat part
		bodyModel[541] = new ModelRendererTurbo(this, 341, 302, textureX, textureY); // Left seat part
		bodyModel[542] = new ModelRendererTurbo(this, 327, 310, textureX, textureY); // Left seat part
		bodyModel[543] = new ModelRendererTurbo(this, 332, 313, textureX, textureY); // Left seat part
		bodyModel[544] = new ModelRendererTurbo(this, 334, 310, textureX, textureY); // Left seat part
		bodyModel[545] = new ModelRendererTurbo(this, 327, 313, textureX, textureY); // Left seat part
		bodyModel[546] = new ModelRendererTurbo(this, 341, 310, textureX, textureY); // Left seat part
		bodyModel[547] = new ModelRendererTurbo(this, 368, 320, textureX, textureY); // Left seat part
		bodyModel[548] = new ModelRendererTurbo(this, 360, 302, textureX, textureY); // Left seat part
		bodyModel[549] = new ModelRendererTurbo(this, 358, 312, textureX, textureY); // Boc 42
		bodyModel[550] = new ModelRendererTurbo(this, 371, 302, textureX, textureY); // Left seat part
		bodyModel[551] = new ModelRendererTurbo(this, 376, 305, textureX, textureY); // Left seat part
		bodyModel[552] = new ModelRendererTurbo(this, 378, 302, textureX, textureY); // Left seat part
		bodyModel[553] = new ModelRendererTurbo(this, 371, 305, textureX, textureY); // Left seat part
		bodyModel[554] = new ModelRendererTurbo(this, 385, 302, textureX, textureY); // Left seat part
		bodyModel[555] = new ModelRendererTurbo(this, 371, 310, textureX, textureY); // Left seat part
		bodyModel[556] = new ModelRendererTurbo(this, 378, 310, textureX, textureY); // Left seat part
		bodyModel[557] = new ModelRendererTurbo(this, 371, 313, textureX, textureY); // Left seat part
		bodyModel[558] = new ModelRendererTurbo(this, 385, 310, textureX, textureY); // Left seat part
		bodyModel[559] = new ModelRendererTurbo(this, 376, 313, textureX, textureY); // Left seat part
		bodyModel[560] = new ModelRendererTurbo(this, 346, 302, textureX, textureY); // Box 128
		bodyModel[561] = new ModelRendererTurbo(this, 351, 305, textureX, textureY); // Box 128
		bodyModel[562] = new ModelRendererTurbo(this, 95, 148, textureX, textureY); // Box 2
		bodyModel[563] = new ModelRendererTurbo(this, 95, 138, textureX, textureY); // Box 41
		bodyModel[564] = new ModelRendererTurbo(this, 240, 148, textureX, textureY); // Box 2
		bodyModel[565] = new ModelRendererTurbo(this, 240, 138, textureX, textureY); // Box 41
		bodyModel[566] = new ModelRendererTurbo(this, 134, 299, textureX, textureY); // Box 38
		bodyModel[567] = new ModelRendererTurbo(this, 148, 278, textureX, textureY); // Box 38
		bodyModel[568] = new ModelRendererTurbo(this, 135, 278, textureX, textureY); // Box 38
		bodyModel[569] = new ModelRendererTurbo(this, 31, 304, textureX, textureY); // Box 38
		bodyModel[570] = new ModelRendererTurbo(this, 113, 309, textureX, textureY); // Box 38
		bodyModel[571] = new ModelRendererTurbo(this, 56, 309, textureX, textureY); // Box 38
		bodyModel[572] = new ModelRendererTurbo(this, 83, 313, textureX, textureY); // Box 38
		bodyModel[573] = new ModelRendererTurbo(this, 100, 306, textureX, textureY); // Box 38
		bodyModel[574] = new ModelRendererTurbo(this, 51, 308, textureX, textureY); // Box 38
		bodyModel[575] = new ModelRendererTurbo(this, 97, 281, textureX, textureY); // Box 38
		bodyModel[576] = new ModelRendererTurbo(this, 97, 287, textureX, textureY); // Box 38
		bodyModel[577] = new ModelRendererTurbo(this, 97, 293, textureX, textureY); // Box 38
		bodyModel[578] = new ModelRendererTurbo(this, 124, 278, textureX, textureY); // Box 38
		bodyModel[579] = new ModelRendererTurbo(this, 125, 270, textureX, textureY); // Box 38
		bodyModel[580] = new ModelRendererTurbo(this, 127, 275, textureX, textureY); // Box 38
		bodyModel[581] = new ModelRendererTurbo(this, 74, 327, textureX, textureY); // Box 38
		bodyModel[582] = new ModelRendererTurbo(this, 74, 336, textureX, textureY); // Box 38
		bodyModel[583] = new ModelRendererTurbo(this, 74, 345, textureX, textureY); // Box 38
		bodyModel[584] = new ModelRendererTurbo(this, 60, 340, textureX, textureY); // Box 38
		bodyModel[585] = new ModelRendererTurbo(this, 351, 278, textureX, textureY); // Box 630
		bodyModel[586] = new ModelRendererTurbo(this, 368, 292, textureX, textureY); // Right seat part
		bodyModel[587] = new ModelRendererTurbo(this, 360, 274, textureX, textureY); // Right seat part
		bodyModel[588] = new ModelRendererTurbo(this, 358, 284, textureX, textureY); // Boc 42
		bodyModel[589] = new ModelRendererTurbo(this, 371, 274, textureX, textureY); // Right seat part
		bodyModel[590] = new ModelRendererTurbo(this, 376, 277, textureX, textureY); // Right seat part
		bodyModel[591] = new ModelRendererTurbo(this, 378, 274, textureX, textureY); // Right seat part
		bodyModel[592] = new ModelRendererTurbo(this, 371, 277, textureX, textureY); // Right seat part
		bodyModel[593] = new ModelRendererTurbo(this, 385, 274, textureX, textureY); // Right seat part
		bodyModel[594] = new ModelRendererTurbo(this, 371, 282, textureX, textureY); // Right seat part
		bodyModel[595] = new ModelRendererTurbo(this, 376, 285, textureX, textureY); // Right seat part
		bodyModel[596] = new ModelRendererTurbo(this, 378, 282, textureX, textureY); // Right seat part
		bodyModel[597] = new ModelRendererTurbo(this, 371, 285, textureX, textureY); // Right seat part
		bodyModel[598] = new ModelRendererTurbo(this, 385, 282, textureX, textureY); // Right seat part
		bodyModel[599] = new ModelRendererTurbo(this, 101, 237, textureX, textureY); // Box 128
		bodyModel[600] = new ModelRendererTurbo(this, 190, 237, textureX, textureY); // Box 128
		bodyModel[601] = new ModelRendererTurbo(this, 190, 259, textureX, textureY); // Box 177
		bodyModel[602] = new ModelRendererTurbo(this, 180, 243, textureX, textureY); // Box 128
		bodyModel[603] = new ModelRendererTurbo(this, 65, 246, textureX, textureY); // Box 128
		bodyModel[604] = new ModelRendererTurbo(this, 65, 222, textureX, textureY); // Box 185
		bodyModel[605] = new ModelRendererTurbo(this, 54, 228, textureX, textureY); // Box 128
		bodyModel[606] = new ModelRendererTurbo(this, 346, 313, textureX, textureY); // Box 128
		bodyModel[607] = new ModelRendererTurbo(this, 353, 314, textureX, textureY); // Box 128
		bodyModel[608] = new ModelRendererTurbo(this, 346, 285, textureX, textureY); // Box 653
		bodyModel[609] = new ModelRendererTurbo(this, 353, 286, textureX, textureY); // Box 654
		bodyModel[610] = new ModelRendererTurbo(this, 1, 364, textureX, textureY); // Box 329
		bodyModel[611] = new ModelRendererTurbo(this, 308, 365, textureX, textureY); // Box 329
		bodyModel[612] = new ModelRendererTurbo(this, 321, 369, textureX, textureY); // Box 329
		bodyModel[613] = new ModelRendererTurbo(this, 67, 280, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[614] = new ModelRendererTurbo(this, 413, 302, textureX, textureY); // Box 38
		bodyModel[615] = new ModelRendererTurbo(this, 414, 322, textureX, textureY); // Box 38
		bodyModel[616] = new ModelRendererTurbo(this, 414, 291, textureX, textureY); // Box 443
		bodyModel[617] = new ModelRendererTurbo(this, 397, 302, textureX, textureY); // Box 38
		bodyModel[618] = new ModelRendererTurbo(this, 405, 324, textureX, textureY); // Box 38
		bodyModel[619] = new ModelRendererTurbo(this, 405, 293, textureX, textureY); // Box 444
		bodyModel[620] = new ModelRendererTurbo(this, 341, 26, textureX, textureY); // Box 306
		bodyModel[621] = new ModelRendererTurbo(this, 312, 35, textureX, textureY); // Box 603
		bodyModel[622] = new ModelRendererTurbo(this, 369, 51, textureX, textureY); // Box 38
		bodyModel[623] = new ModelRendererTurbo(this, 365, 46, textureX, textureY); // Box 38
		bodyModel[624] = new ModelRendererTurbo(this, 362, 47, textureX, textureY); // Box 38
		bodyModel[625] = new ModelRendererTurbo(this, 359, 36, textureX, textureY); // Box 610
		bodyModel[626] = new ModelRendererTurbo(this, 361, 31, textureX, textureY); // Box 611
		bodyModel[627] = new ModelRendererTurbo(this, 366, 32, textureX, textureY); // Box 612
		bodyModel[628] = new ModelRendererTurbo(this, 332, 61, textureX, textureY); // Box 624

		bodyModel[500].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 638
		bodyModel[500].setRotationPoint(26F, 0F, -10F);

		bodyModel[501].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[501].setRotationPoint(27.5F, -5F, 7F);
		bodyModel[501].rotateAngleY = -3.14159265F;

		bodyModel[502].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[502].setRotationPoint(27.5F, -3F, 7F);
		bodyModel[502].rotateAngleY = -3.14159265F;

		bodyModel[503].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[503].setRotationPoint(27.5F, -5F, 7F);
		bodyModel[503].rotateAngleY = -3.14159265F;

		bodyModel[504].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[504].setRotationPoint(27.5F, -4.5F, 7F);
		bodyModel[504].rotateAngleY = -3.14159265F;

		bodyModel[505].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[505].setRotationPoint(27.5F, -4F, 7F);
		bodyModel[505].rotateAngleY = -3.14159265F;

		bodyModel[506].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[506].setRotationPoint(27.5F, -5F, 7F);
		bodyModel[506].rotateAngleY = -3.14159265F;

		bodyModel[507].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[507].setRotationPoint(27.5F, -3F, 7F);
		bodyModel[507].rotateAngleY = -3.14159265F;

		bodyModel[508].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[508].setRotationPoint(27.5F, -5F, 7F);
		bodyModel[508].rotateAngleY = -3.14159265F;

		bodyModel[509].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[509].setRotationPoint(27.5F, -4F, 7F);
		bodyModel[509].rotateAngleY = -3.14159265F;

		bodyModel[510].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[510].setRotationPoint(27.5F, -5F, -7F);
		bodyModel[510].rotateAngleY = -3.14159265F;

		bodyModel[511].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[511].setRotationPoint(27.5F, -3F, -7F);
		bodyModel[511].rotateAngleY = -3.14159265F;

		bodyModel[512].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[512].setRotationPoint(27.5F, -5F, -7F);
		bodyModel[512].rotateAngleY = -3.14159265F;

		bodyModel[513].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[513].setRotationPoint(27.5F, -4.5F, -7F);
		bodyModel[513].rotateAngleY = -3.14159265F;

		bodyModel[514].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[514].setRotationPoint(27.5F, -4F, -7F);
		bodyModel[514].rotateAngleY = -3.14159265F;

		bodyModel[515].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[515].setRotationPoint(27.5F, -5F, -7F);
		bodyModel[515].rotateAngleY = -3.14159265F;

		bodyModel[516].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[516].setRotationPoint(27.5F, -3F, -7F);
		bodyModel[516].rotateAngleY = -3.14159265F;

		bodyModel[517].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[517].setRotationPoint(27.5F, -5F, -7F);
		bodyModel[517].rotateAngleY = -3.14159265F;

		bodyModel[518].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[518].setRotationPoint(27.5F, -4.5F, -7F);
		bodyModel[518].rotateAngleY = -3.14159265F;

		bodyModel[519].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[519].setRotationPoint(27.5F, -4F, -7F);
		bodyModel[519].rotateAngleY = -3.14159265F;

		bodyModel[520].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[520].setRotationPoint(27.5F, -4.5F, 7F);
		bodyModel[520].rotateAngleY = -3.14159265F;

		bodyModel[521].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[521].setRotationPoint(37.5F, -3F, 7F);
		bodyModel[521].rotateAngleY = -3.14159265F;

		bodyModel[522].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[522].setRotationPoint(37.5F, -8F, 7F);
		bodyModel[522].rotateAngleY = -3.14159265F;

		bodyModel[523].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[523].setRotationPoint(37.5F, -3F, -7F);
		bodyModel[523].rotateAngleY = -3.14159265F;

		bodyModel[524].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[524].setRotationPoint(37.5F, -8F, -7F);
		bodyModel[524].rotateAngleY = -3.14159265F;

		bodyModel[525].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[525].setRotationPoint(36F, 0F, 4F);

		bodyModel[526].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[526].setRotationPoint(36F, 0F, -10F);

		bodyModel[527].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[527].setRotationPoint(37.5F, -5F, 7F);
		bodyModel[527].rotateAngleY = -3.14159265F;

		bodyModel[528].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[528].setRotationPoint(37.5F, -3F, 7F);
		bodyModel[528].rotateAngleY = -3.14159265F;

		bodyModel[529].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[529].setRotationPoint(37.5F, -5F, 7F);
		bodyModel[529].rotateAngleY = -3.14159265F;

		bodyModel[530].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[530].setRotationPoint(37.5F, -4.5F, 7F);
		bodyModel[530].rotateAngleY = -3.14159265F;

		bodyModel[531].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[531].setRotationPoint(37.5F, -4F, 7F);
		bodyModel[531].rotateAngleY = -3.14159265F;

		bodyModel[532].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[532].setRotationPoint(37.5F, -5F, 7F);
		bodyModel[532].rotateAngleY = -3.14159265F;

		bodyModel[533].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[533].setRotationPoint(37.5F, -3F, 7F);
		bodyModel[533].rotateAngleY = -3.14159265F;

		bodyModel[534].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[534].setRotationPoint(37.5F, -5F, 7F);
		bodyModel[534].rotateAngleY = -3.14159265F;

		bodyModel[535].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[535].setRotationPoint(37.5F, -4.5F, 7F);
		bodyModel[535].rotateAngleY = -3.14159265F;

		bodyModel[536].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[536].setRotationPoint(37.5F, -4F, 7F);
		bodyModel[536].rotateAngleY = -3.14159265F;

		bodyModel[537].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[537].setRotationPoint(37.5F, -5F, -7F);
		bodyModel[537].rotateAngleY = -3.14159265F;

		bodyModel[538].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[538].setRotationPoint(37.5F, -3F, -7F);
		bodyModel[538].rotateAngleY = -3.14159265F;

		bodyModel[539].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[539].setRotationPoint(37.5F, -5F, -7F);
		bodyModel[539].rotateAngleY = -3.14159265F;

		bodyModel[540].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[540].setRotationPoint(37.5F, -4.5F, -7F);
		bodyModel[540].rotateAngleY = -3.14159265F;

		bodyModel[541].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[541].setRotationPoint(37.5F, -4F, -7F);
		bodyModel[541].rotateAngleY = -3.14159265F;

		bodyModel[542].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[542].setRotationPoint(37.5F, -5F, -7F);
		bodyModel[542].rotateAngleY = -3.14159265F;

		bodyModel[543].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[543].setRotationPoint(37.5F, -3F, -7F);
		bodyModel[543].rotateAngleY = -3.14159265F;

		bodyModel[544].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[544].setRotationPoint(37.5F, -5F, -7F);
		bodyModel[544].rotateAngleY = -3.14159265F;

		bodyModel[545].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[545].setRotationPoint(37.5F, -4.5F, -7F);
		bodyModel[545].rotateAngleY = -3.14159265F;

		bodyModel[546].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[546].setRotationPoint(37.5F, -4F, -7F);
		bodyModel[546].rotateAngleY = -3.14159265F;

		bodyModel[547].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[547].setRotationPoint(50.5F, -3F, -7F);
		bodyModel[547].rotateAngleY = -3.14159265F;

		bodyModel[548].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[548].setRotationPoint(50.5F, -8F, -7F);
		bodyModel[548].rotateAngleY = -3.14159265F;

		bodyModel[549].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[549].setRotationPoint(49F, 0F, -10F);

		bodyModel[550].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[550].setRotationPoint(50.5F, -5F, -7F);
		bodyModel[550].rotateAngleY = -3.14159265F;

		bodyModel[551].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[551].setRotationPoint(50.5F, -3F, -7F);
		bodyModel[551].rotateAngleY = -3.14159265F;

		bodyModel[552].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[552].setRotationPoint(50.5F, -5F, -7F);
		bodyModel[552].rotateAngleY = -3.14159265F;

		bodyModel[553].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[553].setRotationPoint(50.5F, -4.5F, -7F);
		bodyModel[553].rotateAngleY = -3.14159265F;

		bodyModel[554].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[554].setRotationPoint(50.5F, -4F, -7F);
		bodyModel[554].rotateAngleY = -3.14159265F;

		bodyModel[555].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[555].setRotationPoint(50.5F, -5F, -7F);
		bodyModel[555].rotateAngleY = -3.14159265F;

		bodyModel[556].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[556].setRotationPoint(50.5F, -5F, -7F);
		bodyModel[556].rotateAngleY = -3.14159265F;

		bodyModel[557].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[557].setRotationPoint(50.5F, -4.5F, -7F);
		bodyModel[557].rotateAngleY = -3.14159265F;

		bodyModel[558].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[558].setRotationPoint(50.5F, -4F, -7F);
		bodyModel[558].rotateAngleY = -3.14159265F;

		bodyModel[559].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[559].setRotationPoint(50.5F, -3F, -7F);
		bodyModel[559].rotateAngleY = -3.14159265F;

		bodyModel[560].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 128
		bodyModel[560].setRotationPoint(42.5F, -11F, -10F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[561].setRotationPoint(42.5F, -8F, -9F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[562].setRotationPoint(-45.5F, 3F, 10.5F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[563].setRotationPoint(-45.5F, 3F, -11F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[564].setRotationPoint(41.5F, 3F, 10.5F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[565].setRotationPoint(41.5F, 3F, -11F);

		bodyModel[566].addBox(0F, 0F, 0F, 1, 16, 11, 0F); // Box 38
		bodyModel[566].setRotationPoint(-20.5F, -15F, -10F);

		bodyModel[567].addBox(0F, 0F, 0F, 1, 16, 4, 0F); // Box 38
		bodyModel[567].setRotationPoint(-20.5F, -15F, 6F);

		bodyModel[568].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 38
		bodyModel[568].setRotationPoint(-20.5F, -15F, 1F);

		bodyModel[569].addBox(0F, 0F, 0F, 1, 16, 11, 0F); // Box 38
		bodyModel[569].setRotationPoint(-30.5F, -15F, -10F);

		bodyModel[570].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 38
		bodyModel[570].setRotationPoint(-29.5F, -15F, 0F);

		bodyModel[571].addBox(0F, 0F, 0F, 3, 7, 10, 0F); // Box 38
		bodyModel[571].setRotationPoint(-29.5F, -6F, -10F);

		bodyModel[572].addBox(0F, 0F, 0F, 2, 7, 6, 0F); // Box 38
		bodyModel[572].setRotationPoint(-22.5F, -6F, -6F);

		bodyModel[573].addBox(0F, 0F, 0F, 2, 16, 4, 0F); // Box 38
		bodyModel[573].setRotationPoint(-22.5F, -15F, -10F);

		bodyModel[574].addBox(0F, 0F, 0F, 2, 0, 10, 0F); // Box 38
		bodyModel[574].setRotationPoint(-29.5F, -8F, -10F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[575].setRotationPoint(-43.5F, -11F, 6F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[576].setRotationPoint(-43.5F, -6F, 6F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[577].setRotationPoint(-43.5F, -1F, 6F);

		bodyModel[578].addBox(0F, 0F, 0F, 1, 16, 4, 0F); // Box 38
		bodyModel[578].setRotationPoint(-34.5F, -15F, 6F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[579].setRotationPoint(-33.5F, -11F, 7F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38
		bodyModel[580].setRotationPoint(-33.5F, -9F, 7.75F);
		bodyModel[580].rotateAngleX = -0.78539816F;

		bodyModel[581].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[581].setRotationPoint(-38.5F, -11F, -10F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[582].setRotationPoint(-38.5F, -6F, -10F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[583].setRotationPoint(-38.5F, -1F, -10F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[584].setRotationPoint(-33.5F, -5F, -10F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 630
		bodyModel[585].setRotationPoint(42.5F, -8F, 8F);

		bodyModel[586].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[586].setRotationPoint(50.5F, -3F, 7F);
		bodyModel[586].rotateAngleY = -3.14159265F;

		bodyModel[587].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[587].setRotationPoint(50.5F, -8F, 7F);
		bodyModel[587].rotateAngleY = -3.14159265F;

		bodyModel[588].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[588].setRotationPoint(49F, 0F, 4F);

		bodyModel[589].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[589].setRotationPoint(50.5F, -5F, 7F);
		bodyModel[589].rotateAngleY = -3.14159265F;

		bodyModel[590].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[590].setRotationPoint(50.5F, -3F, 7F);
		bodyModel[590].rotateAngleY = -3.14159265F;

		bodyModel[591].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[591].setRotationPoint(50.5F, -5F, 7F);
		bodyModel[591].rotateAngleY = -3.14159265F;

		bodyModel[592].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[592].setRotationPoint(50.5F, -4.5F, 7F);
		bodyModel[592].rotateAngleY = -3.14159265F;

		bodyModel[593].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[593].setRotationPoint(50.5F, -4F, 7F);
		bodyModel[593].rotateAngleY = -3.14159265F;

		bodyModel[594].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[594].setRotationPoint(50.5F, -5F, 7F);
		bodyModel[594].rotateAngleY = -3.14159265F;

		bodyModel[595].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[595].setRotationPoint(50.5F, -3F, 7F);
		bodyModel[595].rotateAngleY = -3.14159265F;

		bodyModel[596].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[596].setRotationPoint(50.5F, -5F, 7F);
		bodyModel[596].rotateAngleY = -3.14159265F;

		bodyModel[597].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[597].setRotationPoint(50.5F, -4.5F, 7F);
		bodyModel[597].rotateAngleY = -3.14159265F;

		bodyModel[598].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[598].setRotationPoint(50.5F, -4F, 7F);
		bodyModel[598].rotateAngleY = -3.14159265F;

		bodyModel[599].addShapeBox(0F, 0F, 0F, 19, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[599].setRotationPoint(-38.5F, -16.25F, -10F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[600].setRotationPoint(-38.5F, -19F, -7F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[601].setRotationPoint(-38.5F, -19F, 3F);

		bodyModel[602].addBox(0F, 0F, 0F, 19, 1, 14, 0F); // Box 128
		bodyModel[602].setRotationPoint(-38.5F, -18F, -7F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 19, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[603].setRotationPoint(-38.5F, -18F, -10F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 19, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185
		bodyModel[604].setRotationPoint(-38.5F, -18F, 7F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 19, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[605].setRotationPoint(-38.5F, -17F, -7F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[606].setRotationPoint(42.5F, -2F, -10F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[607].setRotationPoint(42.5F, -2F, -8.25F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 653
		bodyModel[608].setRotationPoint(42.5F, -2F, 8F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 654
		bodyModel[609].setRotationPoint(42.5F, -2F, 7.25F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 152, 0, 37, 0F,0F, 0F, 0F, -76F, 0F, 0F, -76F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, -76F, 0F, 0F, -76F, 0F, -19F, 0F, 0F, -19F); // Box 329
		bodyModel[610].setRotationPoint(-19.5F, -15F, -9F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 2, 0, 35, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -18F, 0F, 0F, -18F); // Box 329
		bodyModel[611].setRotationPoint(56.5F, -15F, -8.5F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 2, 0, 27, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -13.9F, 0F, 0F, -13.9F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -13.9F, 0F, 0F, -13.9F); // Box 329
		bodyModel[612].setRotationPoint(57.5F, -15F, -6.55F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[613].setRotationPoint(-34.5F, -14.99F, 3F);

		bodyModel[614].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 38
		bodyModel[614].setRotationPoint(58.5F, -5F, -3F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 38
		bodyModel[615].setRotationPoint(58.5F, -5F, -6.45F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[616].setRotationPoint(58.5F, -5F, 2.45F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 38
		bodyModel[617].setRotationPoint(57.5F, -5F, -6.45F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, -0.1F, -2F, 0F, -0.1F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[618].setRotationPoint(57.5F, -5F, -8.45F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.7F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 444
		bodyModel[619].setRotationPoint(57.5F, -5F, 6.45F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.55F, 0F, -0.85F, -0.7F, 0F, 2.35F, -0.45F, -1F, -3.15F, -0.55F, 0F, -0.15F, 0F, -1F, 0F, -1.15F, -1F, 2.7F, -1.15F, 0F, -3.7F, 0F, -1F, -1F); // Box 306
		bodyModel[620].setRotationPoint(56.95F, -15F, 9.15F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -3F, -1.15F, -1.25F, -5.3F, -4F, -0.75F, 4F, 0.01F, 0F, 0F, 0F, -0.99F, -3F, -1.15F, 0.27F, -5.3F, -4F, 0F, 4F, 0.01F, -0.99F, 0F); // Box 603
		bodyModel[621].setRotationPoint(54.5F, -19F, 0F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.28F, 0F, -0.075F, -0.28F, 0F, -0.075F, -0.22F, 0F, -0.425F, 0.22F, 0F, -0.425F, -0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F); // Box 38
		bodyModel[622].setRotationPoint(60.01F, -14.5F, -5F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0.15F, 0F, -0.175F, -0.15F, 0F, -0.175F, 0.15F, 0F, 0.06F, -0.15F, 0F, 0.06F, 0F, -0.5F, -0.08F, 0F, -0.5F, -0.08F, 0.32F, -0.5F, 0.06F, -0.32F, -0.5F, 0.06F); // Box 38
		bodyModel[623].setRotationPoint(59.4F, -15F, -6.98F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.24F, 0F, 0F, -0.24F, 0F, 0F, -0.15F, 0F, -0.83F, 0.15F, 0F, -0.83F, 0.05F, -0.5F, -0.01F, -0.05F, -0.5F, -0.01F, 0F, -0.5F, -0.93F, 0F, -0.5F, -0.93F); // Box 38
		bodyModel[624].setRotationPoint(59.4F, -15F, -6.97F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.22F, 0F, -0.425F, -0.22F, 0F, -0.425F, -0.28F, 0F, -0.075F, 0.28F, 0F, -0.075F, -0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 610
		bodyModel[625].setRotationPoint(60.01F, -14.5F, 4F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-0.15F, 0F, 0.06F, 0.15F, 0F, 0.06F, -0.15F, 0F, -0.175F, 0.15F, 0F, -0.175F, -0.32F, -0.5F, 0.06F, 0.32F, -0.5F, 0.06F, 0F, -0.5F, -0.08F, 0F, -0.5F, -0.08F); // Box 611
		bodyModel[626].setRotationPoint(59.4F, -15F, 4.98F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.15F, 0F, -0.83F, -0.15F, 0F, -0.83F, -0.24F, 0F, 0F, 0.24F, 0F, 0F, 0F, -0.5F, -0.93F, 0F, -0.5F, -0.93F, -0.05F, -0.5F, -0.01F, 0.05F, -0.5F, -0.01F); // Box 612
		bodyModel[627].setRotationPoint(59.4F, -15F, 5.97F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.55F, 0F, -0.15F, -0.45F, -1F, -3.15F, -0.7F, 0F, 2.35F, -0.55F, 0F, -0.85F, 0F, -1F, -1F, -1.15F, 0F, -3.7F, -1.15F, -1F, 2.7F, 0F, -1F, 0F); // Box 624
		bodyModel[628].setRotationPoint(56.95F, -15F, -10.15F);
	}
	ModelPS_Truck_41CDO bogie1 = new ModelPS_Truck_41CDO();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 629; i++)
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
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-CDO_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.74, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.44, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-CDO_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.74, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.44, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}