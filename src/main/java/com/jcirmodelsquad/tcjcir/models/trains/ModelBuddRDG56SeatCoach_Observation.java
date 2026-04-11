//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck_41GT;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelBuddRDG56SeatCoach_Observation extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBuddRDG56SeatCoach_Observation() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[619];

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
		bodyModel[117] = new ModelRendererTurbo(this, 341, 26, textureX, textureY); // Box 306
		bodyModel[118] = new ModelRendererTurbo(this, 346, 25, textureX, textureY); // Box 307
		bodyModel[119] = new ModelRendererTurbo(this, 413, 302, textureX, textureY); // Box 38
		bodyModel[120] = new ModelRendererTurbo(this, 414, 315, textureX, textureY); // Box 38
		bodyModel[121] = new ModelRendererTurbo(this, 414, 300, textureX, textureY); // Box 435
		bodyModel[122] = new ModelRendererTurbo(this, 412, 323, textureX, textureY); // Box 38
		bodyModel[123] = new ModelRendererTurbo(this, 412, 295, textureX, textureY); // Box 443
		bodyModel[124] = new ModelRendererTurbo(this, 118, 185, textureX, textureY); // Box 38
		bodyModel[125] = new ModelRendererTurbo(this, 71, 187, textureX, textureY); // Box 38
		bodyModel[126] = new ModelRendererTurbo(this, 118, 181, textureX, textureY); // Box 451
		bodyModel[127] = new ModelRendererTurbo(this, 71, 183, textureX, textureY); // Box 452
		bodyModel[128] = new ModelRendererTurbo(this, 84, 351, textureX, textureY); // Box 38
		bodyModel[129] = new ModelRendererTurbo(this, 84, 356, textureX, textureY); // Box 462
		bodyModel[130] = new ModelRendererTurbo(this, 10, 73, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 13, 73, textureX, textureY); // Box 128
		bodyModel[132] = new ModelRendererTurbo(this, 10, 96, textureX, textureY); // Box 202
		bodyModel[133] = new ModelRendererTurbo(this, 13, 96, textureX, textureY); // Box 203
		bodyModel[134] = new ModelRendererTurbo(this, 69, 151, textureX, textureY); // Box 2
		bodyModel[135] = new ModelRendererTurbo(this, 69, 141, textureX, textureY); // Box 192
		bodyModel[136] = new ModelRendererTurbo(this, 340, 40, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 329, 44, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 312, 50, textureX, textureY); // Box 265
		bodyModel[139] = new ModelRendererTurbo(this, 308, 55, textureX, textureY); // Box 268
		bodyModel[140] = new ModelRendererTurbo(this, 41, 252, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 41, 274, textureX, textureY); // Box 177
		bodyModel[142] = new ModelRendererTurbo(this, 31, 258, textureX, textureY); // Box 128
		bodyModel[143] = new ModelRendererTurbo(this, 18, 246, textureX, textureY); // Box 128
		bodyModel[144] = new ModelRendererTurbo(this, 18, 218, textureX, textureY); // Box 185
		bodyModel[145] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 128
		bodyModel[146] = new ModelRendererTurbo(this, 1, 224, textureX, textureY); // Box 128
		bodyModel[147] = new ModelRendererTurbo(this, 55, 209, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 128
		bodyModel[149] = new ModelRendererTurbo(this, 81, 204, textureX, textureY); // Box 324
		bodyModel[150] = new ModelRendererTurbo(this, 84, 202, textureX, textureY,"lamp"); // Box 324 glow
		bodyModel[151] = new ModelRendererTurbo(this, 84, 222, textureX, textureY,"lamp"); // Box 338 glow
		bodyModel[152] = new ModelRendererTurbo(this, 312, 304, textureX, textureY); // Box 332
		bodyModel[153] = new ModelRendererTurbo(this, 312, 257, textureX, textureY); // Box 128
		bodyModel[154] = new ModelRendererTurbo(this, 312, 254, textureX, textureY); // Box 128
		bodyModel[155] = new ModelRendererTurbo(this, 312, 310, textureX, textureY); // Box 329
		bodyModel[156] = new ModelRendererTurbo(this, 312, 307, textureX, textureY); // Box 330
		bodyModel[157] = new ModelRendererTurbo(this, 312, 264, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[158] = new ModelRendererTurbo(this, 312, 317, textureX, textureY,"lamp"); // Box 340 glow
		bodyModel[159] = new ModelRendererTurbo(this, 103, 236, textureX, textureY); // Box 38
		bodyModel[160] = new ModelRendererTurbo(this, 103, 247, textureX, textureY); // Box 275
		bodyModel[161] = new ModelRendererTurbo(this, 104, 252, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[162] = new ModelRendererTurbo(this, 104, 241, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[163] = new ModelRendererTurbo(this, 105, 244, textureX, textureY); // Box 38
		bodyModel[164] = new ModelRendererTurbo(this, 105, 255, textureX, textureY); // Box 276
		bodyModel[165] = new ModelRendererTurbo(this, 300, 289, textureX, textureY); // Box 128
		bodyModel[166] = new ModelRendererTurbo(this, 300, 324, textureX, textureY); // Box 128
		bodyModel[167] = new ModelRendererTurbo(this, 296, 282, textureX, textureY); // Box 128
		bodyModel[168] = new ModelRendererTurbo(this, 296, 317, textureX, textureY); // Box 128
		bodyModel[169] = new ModelRendererTurbo(this, 303, 280, textureX, textureY); // Box 128
		bodyModel[170] = new ModelRendererTurbo(this, 303, 315, textureX, textureY); // Box 128
		bodyModel[171] = new ModelRendererTurbo(this, 306, 277, textureX, textureY); // Box 128
		bodyModel[172] = new ModelRendererTurbo(this, 307, 274, textureX, textureY); // Box 128
		bodyModel[173] = new ModelRendererTurbo(this, 300, 274, textureX, textureY); // Box 128
		bodyModel[174] = new ModelRendererTurbo(this, 301, 278, textureX, textureY); // Box 128
		bodyModel[175] = new ModelRendererTurbo(this, 306, 312, textureX, textureY); // Box 318
		bodyModel[176] = new ModelRendererTurbo(this, 300, 309, textureX, textureY); // Box 320
		bodyModel[177] = new ModelRendererTurbo(this, 301, 313, textureX, textureY); // Box 321
		bodyModel[178] = new ModelRendererTurbo(this, 190, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[179] = new ModelRendererTurbo(this, 181, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[180] = new ModelRendererTurbo(this, 172, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[181] = new ModelRendererTurbo(this, 163, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[182] = new ModelRendererTurbo(this, 154, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[183] = new ModelRendererTurbo(this, 145, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[184] = new ModelRendererTurbo(this, 136, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[185] = new ModelRendererTurbo(this, 199, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[186] = new ModelRendererTurbo(this, 372, 24, textureX, textureY); // Box 1353
		bodyModel[187] = new ModelRendererTurbo(this, 388, 24, textureX, textureY); // Box 1354
		bodyModel[188] = new ModelRendererTurbo(this, 372, 22, textureX, textureY); // Box 1358
		bodyModel[189] = new ModelRendererTurbo(this, 388, 28, textureX, textureY); // Box 1359
		bodyModel[190] = new ModelRendererTurbo(this, 372, 28, textureX, textureY); // Box 1360
		bodyModel[191] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 1356
		bodyModel[192] = new ModelRendererTurbo(this, 379, 28, textureX, textureY); // Box 1355
		bodyModel[193] = new ModelRendererTurbo(this, 379, 38, textureX, textureY); // Right step part
		bodyModel[194] = new ModelRendererTurbo(this, 379, 42, textureX, textureY); // Right step part
		bodyModel[195] = new ModelRendererTurbo(this, 379, 32, textureX, textureY); // Right step part
		bodyModel[196] = new ModelRendererTurbo(this, 377, 45, textureX, textureY); // Right step part
		bodyModel[197] = new ModelRendererTurbo(this, 374, 36, textureX, textureY); // Right step part
		bodyModel[198] = new ModelRendererTurbo(this, 388, 36, textureX, textureY); // Right step part
		bodyModel[199] = new ModelRendererTurbo(this, 374, 38, textureX, textureY); // Right step part
		bodyModel[200] = new ModelRendererTurbo(this, 388, 38, textureX, textureY); // Right step part
		bodyModel[201] = new ModelRendererTurbo(this, 374, 33, textureX, textureY); // Right step part
		bodyModel[202] = new ModelRendererTurbo(this, 388, 33, textureX, textureY); // Right step part
		bodyModel[203] = new ModelRendererTurbo(this, 388, 22, textureX, textureY); // Box 1357
		bodyModel[204] = new ModelRendererTurbo(this, 372, 0, textureX, textureY); // Box 26
		bodyModel[205] = new ModelRendererTurbo(this, 388, 0, textureX, textureY); // Box 26
		bodyModel[206] = new ModelRendererTurbo(this, 388, -2, textureX, textureY); // Box 26
		bodyModel[207] = new ModelRendererTurbo(this, 372, -2, textureX, textureY); // Box 26
		bodyModel[208] = new ModelRendererTurbo(this, 388, 4, textureX, textureY); // Box 26
		bodyModel[209] = new ModelRendererTurbo(this, 372, 4, textureX, textureY); // Box 26
		bodyModel[210] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 26
		bodyModel[211] = new ModelRendererTurbo(this, 379, 4, textureX, textureY); // Box 26
		bodyModel[212] = new ModelRendererTurbo(this, 379, 18, textureX, textureY); // Left step part
		bodyModel[213] = new ModelRendererTurbo(this, 379, 14, textureX, textureY); // Left step part
		bodyModel[214] = new ModelRendererTurbo(this, 379, 8, textureX, textureY); // Left step part
		bodyModel[215] = new ModelRendererTurbo(this, 374, 9, textureX, textureY); // Left step part
		bodyModel[216] = new ModelRendererTurbo(this, 377, 11, textureX, textureY); // Left step part
		bodyModel[217] = new ModelRendererTurbo(this, 377, 21, textureX, textureY); // Left step part
		bodyModel[218] = new ModelRendererTurbo(this, 388, 9, textureX, textureY); // Left step part
		bodyModel[219] = new ModelRendererTurbo(this, 26, 140, textureX, textureY); // Box 2
		bodyModel[220] = new ModelRendererTurbo(this, 69, 148, textureX, textureY); // Box 2
		bodyModel[221] = new ModelRendererTurbo(this, 60, 138, textureX, textureY); // Box 192
		bodyModel[222] = new ModelRendererTurbo(this, 60, 148, textureX, textureY); // Box 475
		bodyModel[223] = new ModelRendererTurbo(this, 69, 138, textureX, textureY); // Box 479
		bodyModel[224] = new ModelRendererTurbo(this, 47, 77, textureX, textureY); // Box 128
		bodyModel[225] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[226] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[227] = new ModelRendererTurbo(this, 17, 101, textureX, textureY); // Box 128
		bodyModel[228] = new ModelRendererTurbo(this, 26, 99, textureX, textureY); // Box 128
		bodyModel[229] = new ModelRendererTurbo(this, 3, 140, textureX, textureY); // Box 128
		bodyModel[230] = new ModelRendererTurbo(this, 16, 95, textureX, textureY); // Box 128
		bodyModel[231] = new ModelRendererTurbo(this, 25, 95, textureX, textureY); // Box 128
		bodyModel[232] = new ModelRendererTurbo(this, 17, 90, textureX, textureY); // Box 128
		bodyModel[233] = new ModelRendererTurbo(this, 24, 90, textureX, textureY); // Box 128
		bodyModel[234] = new ModelRendererTurbo(this, 13, 82, textureX, textureY); // Box 128
		bodyModel[235] = new ModelRendererTurbo(this, 22, 83, textureX, textureY); // Box 128
		bodyModel[236] = new ModelRendererTurbo(this, 59, 91, textureX, textureY); // Box 128
		bodyModel[237] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[238] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[239] = new ModelRendererTurbo(this, 17, 67, textureX, textureY); // Box 249
		bodyModel[240] = new ModelRendererTurbo(this, 26, 71, textureX, textureY); // Box 250
		bodyModel[241] = new ModelRendererTurbo(this, 16, 71, textureX, textureY); // Box 251
		bodyModel[242] = new ModelRendererTurbo(this, 25, 74, textureX, textureY); // Box 252
		bodyModel[243] = new ModelRendererTurbo(this, 17, 77, textureX, textureY); // Box 253
		bodyModel[244] = new ModelRendererTurbo(this, 24, 78, textureX, textureY); // Box 254
		bodyModel[245] = new ModelRendererTurbo(this, 60, 81, textureX, textureY); // Box 255
		bodyModel[246] = new ModelRendererTurbo(this, 55, 94, textureX, textureY); // Box 128
		bodyModel[247] = new ModelRendererTurbo(this, 55, 67, textureX, textureY); // Box 261
		bodyModel[248] = new ModelRendererTurbo(this, 47, 91, textureX, textureY); // Box 128
		bodyModel[249] = new ModelRendererTurbo(this, 47, 69, textureX, textureY); // Box 336
		bodyModel[250] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[251] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[252] = new ModelRendererTurbo(this, 249, 148, textureX, textureY); // Box 2
		bodyModel[253] = new ModelRendererTurbo(this, 249, 138, textureX, textureY); // Box 29
		bodyModel[254] = new ModelRendererTurbo(this, 242, 151, textureX, textureY); // Box 2
		bodyModel[255] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[256] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[257] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[258] = new ModelRendererTurbo(this, 242, 141, textureX, textureY); // Box 35
		bodyModel[259] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[260] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[261] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 39
		bodyModel[262] = new ModelRendererTurbo(this, 76, 164, textureX, textureY); // Box 2
		bodyModel[263] = new ModelRendererTurbo(this, 76, 157, textureX, textureY); // Box 41
		bodyModel[264] = new ModelRendererTurbo(this, 267, 164, textureX, textureY); // Box 2
		bodyModel[265] = new ModelRendererTurbo(this, 267, 157, textureX, textureY); // Box 41
		bodyModel[266] = new ModelRendererTurbo(this, 74, 167, textureX, textureY); // Box 2
		bodyModel[267] = new ModelRendererTurbo(this, 265, 167, textureX, textureY); // Box 2
		bodyModel[268] = new ModelRendererTurbo(this, 74, 160, textureX, textureY); // Box 39
		bodyModel[269] = new ModelRendererTurbo(this, 265, 160, textureX, textureY); // Box 39
		bodyModel[270] = new ModelRendererTurbo(this, 142, 20, textureX, textureY); // Box 128
		bodyModel[271] = new ModelRendererTurbo(this, 142, 1, textureX, textureY); // Box 205
		bodyModel[272] = new ModelRendererTurbo(this, 142, 6, textureX, textureY); // Box 38
		bodyModel[273] = new ModelRendererTurbo(this, 142, 16, textureX, textureY); // Box 487
		bodyModel[274] = new ModelRendererTurbo(this, 160, 9, textureX, textureY); // Box 38
		bodyModel[275] = new ModelRendererTurbo(this, 151, 9, textureX, textureY); // Box 38
		bodyModel[276] = new ModelRendererTurbo(this, 122, 168, textureX, textureY); // Box 41
		bodyModel[277] = new ModelRendererTurbo(this, 119, 169, textureX, textureY); // Box 41
		bodyModel[278] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 41
		bodyModel[279] = new ModelRendererTurbo(this, 197, 155, textureX, textureY); // Box 41
		bodyModel[280] = new ModelRendererTurbo(this, 194, 156, textureX, textureY); // Box 41
		bodyModel[281] = new ModelRendererTurbo(this, 212, 156, textureX, textureY); // Box 41
		bodyModel[282] = new ModelRendererTurbo(this, 199, 160, textureX, textureY); // Box 41
		bodyModel[283] = new ModelRendererTurbo(this, 196, 161, textureX, textureY); // Box 41
		bodyModel[284] = new ModelRendererTurbo(this, 210, 161, textureX, textureY); // Box 41
		bodyModel[285] = new ModelRendererTurbo(this, 118, 174, textureX, textureY); // Box 41
		bodyModel[286] = new ModelRendererTurbo(this, 118, 172, textureX, textureY); // Box 41
		bodyModel[287] = new ModelRendererTurbo(this, 138, 172, textureX, textureY); // Box 41
		bodyModel[288] = new ModelRendererTurbo(this, 119, 155, textureX, textureY); // Box 869
		bodyModel[289] = new ModelRendererTurbo(this, 119, 162, textureX, textureY); // Box 870
		bodyModel[290] = new ModelRendererTurbo(this, 158, 155, textureX, textureY); // Box 874
		bodyModel[291] = new ModelRendererTurbo(this, 167, 155, textureX, textureY); // Box 877
		bodyModel[292] = new ModelRendererTurbo(this, 193, 168, textureX, textureY); // Box 41
		bodyModel[293] = new ModelRendererTurbo(this, 190, 169, textureX, textureY); // Box 41
		bodyModel[294] = new ModelRendererTurbo(this, 212, 169, textureX, textureY); // Box 41
		bodyModel[295] = new ModelRendererTurbo(this, 141, 168, textureX, textureY); // Box 881
		bodyModel[296] = new ModelRendererTurbo(this, 168, 168, textureX, textureY); // Box 882
		bodyModel[297] = new ModelRendererTurbo(this, 83, 315, textureX, textureY); // Box 38
		bodyModel[298] = new ModelRendererTurbo(this, 39, 315, textureX, textureY); // Box 38
		bodyModel[299] = new ModelRendererTurbo(this, 20, 321, textureX, textureY); // Box 38
		bodyModel[300] = new ModelRendererTurbo(this, 60, 312, textureX, textureY); // Box 38
		bodyModel[301] = new ModelRendererTurbo(this, 60, 321, textureX, textureY); // Box 38
		bodyModel[302] = new ModelRendererTurbo(this, 60, 330, textureX, textureY); // Box 38
		bodyModel[303] = new ModelRendererTurbo(this, 3, 325, textureX, textureY); // Box 380
		bodyModel[304] = new ModelRendererTurbo(this, 13, 331, textureX, textureY); // Box 382
		bodyModel[305] = new ModelRendererTurbo(this, 64, 280, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[306] = new ModelRendererTurbo(this, 69, 280, textureX, textureY); // Box 38
		bodyModel[307] = new ModelRendererTurbo(this, 50, 286, textureX, textureY); // Box 38
		bodyModel[308] = new ModelRendererTurbo(this, 32, 291, textureX, textureY); // Box 340
		bodyModel[309] = new ModelRendererTurbo(this, 35, 296, textureX, textureY); // Box 41
		bodyModel[310] = new ModelRendererTurbo(this, 43, 285, textureX, textureY); // Box 38
		bodyModel[311] = new ModelRendererTurbo(this, 25, 299, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[312] = new ModelRendererTurbo(this, 104, 228, textureX, textureY); // Box 170
		bodyModel[313] = new ModelRendererTurbo(this, 104, 232, textureX, textureY); // Box 528
		bodyModel[314] = new ModelRendererTurbo(this, 1, 316, textureX, textureY); // Box 38
		bodyModel[315] = new ModelRendererTurbo(this, 4, 321, textureX, textureY); // Box 38
		bodyModel[316] = new ModelRendererTurbo(this, 11, 327, textureX, textureY); // Box 38
		bodyModel[317] = new ModelRendererTurbo(this, 14, 291, textureX, textureY); // Box 38
		bodyModel[318] = new ModelRendererTurbo(this, 17, 296, textureX, textureY); // Box 38
		bodyModel[319] = new ModelRendererTurbo(this, 16, 300, textureX, textureY); // Box 38
		bodyModel[320] = new ModelRendererTurbo(this, 275, 286, textureX, textureY); // Right seat part
		bodyModel[321] = new ModelRendererTurbo(this, 285, 276, textureX, textureY); // Right seat part
		bodyModel[322] = new ModelRendererTurbo(this, 275, 321, textureX, textureY); // Left seat part
		bodyModel[323] = new ModelRendererTurbo(this, 285, 311, textureX, textureY); // Left seat part
		bodyModel[324] = new ModelRendererTurbo(this, 268, 297, textureX, textureY); // Boc 42
		bodyModel[325] = new ModelRendererTurbo(this, 268, 332, textureX, textureY); // Box 638
		bodyModel[326] = new ModelRendererTurbo(this, 272, 281, textureX, textureY); // Right seat part
		bodyModel[327] = new ModelRendererTurbo(this, 283, 299, textureX, textureY); // Right seat part
		bodyModel[328] = new ModelRendererTurbo(this, 283, 334, textureX, textureY); // Left seat part
		bodyModel[329] = new ModelRendererTurbo(this, 272, 316, textureX, textureY); // Left seat part
		bodyModel[330] = new ModelRendererTurbo(this, 272, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[331] = new ModelRendererTurbo(this, 283, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[332] = new ModelRendererTurbo(this, 283, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[333] = new ModelRendererTurbo(this, 272, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[334] = new ModelRendererTurbo(this, 247, 286, textureX, textureY); // Right seat part
		bodyModel[335] = new ModelRendererTurbo(this, 257, 276, textureX, textureY); // Right seat part
		bodyModel[336] = new ModelRendererTurbo(this, 247, 321, textureX, textureY); // Left seat part
		bodyModel[337] = new ModelRendererTurbo(this, 257, 311, textureX, textureY); // Left seat part
		bodyModel[338] = new ModelRendererTurbo(this, 240, 297, textureX, textureY); // Boc 42
		bodyModel[339] = new ModelRendererTurbo(this, 240, 332, textureX, textureY); // Box 638
		bodyModel[340] = new ModelRendererTurbo(this, 244, 281, textureX, textureY); // Right seat part
		bodyModel[341] = new ModelRendererTurbo(this, 255, 299, textureX, textureY); // Right seat part
		bodyModel[342] = new ModelRendererTurbo(this, 255, 334, textureX, textureY); // Left seat part
		bodyModel[343] = new ModelRendererTurbo(this, 244, 316, textureX, textureY); // Left seat part
		bodyModel[344] = new ModelRendererTurbo(this, 244, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[345] = new ModelRendererTurbo(this, 255, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[346] = new ModelRendererTurbo(this, 255, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[347] = new ModelRendererTurbo(this, 244, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[348] = new ModelRendererTurbo(this, 219, 286, textureX, textureY); // Right seat part
		bodyModel[349] = new ModelRendererTurbo(this, 229, 276, textureX, textureY); // Right seat part
		bodyModel[350] = new ModelRendererTurbo(this, 219, 321, textureX, textureY); // Left seat part
		bodyModel[351] = new ModelRendererTurbo(this, 229, 311, textureX, textureY); // Left seat part
		bodyModel[352] = new ModelRendererTurbo(this, 212, 297, textureX, textureY); // Boc 42
		bodyModel[353] = new ModelRendererTurbo(this, 212, 332, textureX, textureY); // Box 638
		bodyModel[354] = new ModelRendererTurbo(this, 216, 281, textureX, textureY); // Right seat part
		bodyModel[355] = new ModelRendererTurbo(this, 227, 299, textureX, textureY); // Right seat part
		bodyModel[356] = new ModelRendererTurbo(this, 227, 334, textureX, textureY); // Left seat part
		bodyModel[357] = new ModelRendererTurbo(this, 216, 316, textureX, textureY); // Left seat part
		bodyModel[358] = new ModelRendererTurbo(this, 216, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[359] = new ModelRendererTurbo(this, 227, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[360] = new ModelRendererTurbo(this, 227, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[361] = new ModelRendererTurbo(this, 216, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[362] = new ModelRendererTurbo(this, 191, 286, textureX, textureY); // Right seat part
		bodyModel[363] = new ModelRendererTurbo(this, 201, 276, textureX, textureY); // Right seat part
		bodyModel[364] = new ModelRendererTurbo(this, 191, 321, textureX, textureY); // Left seat part
		bodyModel[365] = new ModelRendererTurbo(this, 201, 311, textureX, textureY); // Left seat part
		bodyModel[366] = new ModelRendererTurbo(this, 184, 297, textureX, textureY); // Boc 42
		bodyModel[367] = new ModelRendererTurbo(this, 184, 332, textureX, textureY); // Box 638
		bodyModel[368] = new ModelRendererTurbo(this, 188, 281, textureX, textureY); // Right seat part
		bodyModel[369] = new ModelRendererTurbo(this, 199, 299, textureX, textureY); // Right seat part
		bodyModel[370] = new ModelRendererTurbo(this, 199, 334, textureX, textureY); // Left seat part
		bodyModel[371] = new ModelRendererTurbo(this, 188, 316, textureX, textureY); // Left seat part
		bodyModel[372] = new ModelRendererTurbo(this, 188, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[373] = new ModelRendererTurbo(this, 199, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[374] = new ModelRendererTurbo(this, 199, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[375] = new ModelRendererTurbo(this, 188, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[376] = new ModelRendererTurbo(this, 163, 286, textureX, textureY); // Right seat part
		bodyModel[377] = new ModelRendererTurbo(this, 173, 276, textureX, textureY); // Right seat part
		bodyModel[378] = new ModelRendererTurbo(this, 163, 321, textureX, textureY); // Left seat part
		bodyModel[379] = new ModelRendererTurbo(this, 173, 311, textureX, textureY); // Left seat part
		bodyModel[380] = new ModelRendererTurbo(this, 156, 297, textureX, textureY); // Boc 42
		bodyModel[381] = new ModelRendererTurbo(this, 156, 332, textureX, textureY); // Box 638
		bodyModel[382] = new ModelRendererTurbo(this, 160, 281, textureX, textureY); // Right seat part
		bodyModel[383] = new ModelRendererTurbo(this, 171, 299, textureX, textureY); // Right seat part
		bodyModel[384] = new ModelRendererTurbo(this, 171, 334, textureX, textureY); // Left seat part
		bodyModel[385] = new ModelRendererTurbo(this, 160, 316, textureX, textureY); // Left seat part
		bodyModel[386] = new ModelRendererTurbo(this, 160, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[387] = new ModelRendererTurbo(this, 171, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[388] = new ModelRendererTurbo(this, 171, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[389] = new ModelRendererTurbo(this, 160, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[390] = new ModelRendererTurbo(this, 135, 286, textureX, textureY); // Right seat part
		bodyModel[391] = new ModelRendererTurbo(this, 145, 276, textureX, textureY); // Right seat part
		bodyModel[392] = new ModelRendererTurbo(this, 135, 321, textureX, textureY); // Left seat part
		bodyModel[393] = new ModelRendererTurbo(this, 145, 311, textureX, textureY); // Left seat part
		bodyModel[394] = new ModelRendererTurbo(this, 128, 297, textureX, textureY); // Boc 42
		bodyModel[395] = new ModelRendererTurbo(this, 128, 332, textureX, textureY); // Box 638
		bodyModel[396] = new ModelRendererTurbo(this, 132, 281, textureX, textureY); // Right seat part
		bodyModel[397] = new ModelRendererTurbo(this, 143, 299, textureX, textureY); // Right seat part
		bodyModel[398] = new ModelRendererTurbo(this, 143, 334, textureX, textureY); // Left seat part
		bodyModel[399] = new ModelRendererTurbo(this, 132, 316, textureX, textureY); // Left seat part
		bodyModel[400] = new ModelRendererTurbo(this, 132, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[401] = new ModelRendererTurbo(this, 143, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[402] = new ModelRendererTurbo(this, 143, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[403] = new ModelRendererTurbo(this, 132, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[404] = new ModelRendererTurbo(this, 107, 286, textureX, textureY); // Right seat part
		bodyModel[405] = new ModelRendererTurbo(this, 117, 276, textureX, textureY); // Right seat part
		bodyModel[406] = new ModelRendererTurbo(this, 107, 321, textureX, textureY); // Left seat part
		bodyModel[407] = new ModelRendererTurbo(this, 117, 311, textureX, textureY); // Left seat part
		bodyModel[408] = new ModelRendererTurbo(this, 100, 297, textureX, textureY); // Boc 42
		bodyModel[409] = new ModelRendererTurbo(this, 100, 332, textureX, textureY); // Box 638
		bodyModel[410] = new ModelRendererTurbo(this, 104, 281, textureX, textureY); // Right seat part
		bodyModel[411] = new ModelRendererTurbo(this, 115, 299, textureX, textureY); // Right seat part
		bodyModel[412] = new ModelRendererTurbo(this, 115, 334, textureX, textureY); // Left seat part
		bodyModel[413] = new ModelRendererTurbo(this, 104, 316, textureX, textureY); // Left seat part
		bodyModel[414] = new ModelRendererTurbo(this, 104, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[415] = new ModelRendererTurbo(this, 115, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[416] = new ModelRendererTurbo(this, 115, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[417] = new ModelRendererTurbo(this, 104, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[418] = new ModelRendererTurbo(this, 394, 300, textureX, textureY); // Box 38
		bodyModel[419] = new ModelRendererTurbo(this, 404, 328, textureX, textureY); // Box 38
		bodyModel[420] = new ModelRendererTurbo(this, 403, 323, textureX, textureY); // Box 38
		bodyModel[421] = new ModelRendererTurbo(this, 403, 318, textureX, textureY); // Box 38
		bodyModel[422] = new ModelRendererTurbo(this, 401, 323, textureX, textureY); // Box 38
		bodyModel[423] = new ModelRendererTurbo(this, 401, 318, textureX, textureY); // Box 38
		bodyModel[424] = new ModelRendererTurbo(this, 404, 286, textureX, textureY); // Box 444
		bodyModel[425] = new ModelRendererTurbo(this, 403, 295, textureX, textureY); // Box 445
		bodyModel[426] = new ModelRendererTurbo(this, 403, 290, textureX, textureY); // Box 446
		bodyModel[427] = new ModelRendererTurbo(this, 401, 290, textureX, textureY); // Box 447
		bodyModel[428] = new ModelRendererTurbo(this, 401, 295, textureX, textureY); // Box 448
		bodyModel[429] = new ModelRendererTurbo(this, 317, 325, textureX, textureY); // Box 492
		bodyModel[430] = new ModelRendererTurbo(this, 322, 319, textureX, textureY); // Box 493
		bodyModel[431] = new ModelRendererTurbo(this, 311, 325, textureX, textureY); // Box 495
		bodyModel[432] = new ModelRendererTurbo(this, 319, 332, textureX, textureY); // Box 493
		bodyModel[433] = new ModelRendererTurbo(this, 317, 320, textureX, textureY); // Box 495
		bodyModel[434] = new ModelRendererTurbo(this, 333, 325, textureX, textureY); // Box 495
		bodyModel[435] = new ModelRendererTurbo(this, 331, 320, textureX, textureY); // Box 495
		bodyModel[436] = new ModelRendererTurbo(this, 317, 289, textureX, textureY); // Box 442
		bodyModel[437] = new ModelRendererTurbo(this, 322, 283, textureX, textureY); // Box 443
		bodyModel[438] = new ModelRendererTurbo(this, 311, 289, textureX, textureY); // Box 444
		bodyModel[439] = new ModelRendererTurbo(this, 319, 296, textureX, textureY); // Box 445
		bodyModel[440] = new ModelRendererTurbo(this, 317, 284, textureX, textureY); // Box 446
		bodyModel[441] = new ModelRendererTurbo(this, 333, 289, textureX, textureY); // Box 447
		bodyModel[442] = new ModelRendererTurbo(this, 331, 284, textureX, textureY); // Box 448
		bodyModel[443] = new ModelRendererTurbo(this, 315, 270, textureX, textureY); // Box 438
		bodyModel[444] = new ModelRendererTurbo(this, 326, 270, textureX, textureY); // Box 439
		bodyModel[445] = new ModelRendererTurbo(this, 319, 278, textureX, textureY); // Box 441
		bodyModel[446] = new ModelRendererTurbo(this, 313, 342, textureX, textureY); // Box 495
		bodyModel[447] = new ModelRendererTurbo(this, 325, 342, textureX, textureY); // Box 495
		bodyModel[448] = new ModelRendererTurbo(this, 319, 337, textureX, textureY); // Box 493
		bodyModel[449] = new ModelRendererTurbo(this, 337, 325, textureX, textureY); // Box 492
		bodyModel[450] = new ModelRendererTurbo(this, 342, 319, textureX, textureY); // Box 493
		bodyModel[451] = new ModelRendererTurbo(this, 332, 338, textureX, textureY); // Box 495
		bodyModel[452] = new ModelRendererTurbo(this, 350, 338, textureX, textureY); // Box 495
		bodyModel[453] = new ModelRendererTurbo(this, 339, 337, textureX, textureY); // Box 493
		bodyModel[454] = new ModelRendererTurbo(this, 339, 332, textureX, textureY); // Box 493
		bodyModel[455] = new ModelRendererTurbo(this, 337, 289, textureX, textureY); // Box 436
		bodyModel[456] = new ModelRendererTurbo(this, 342, 283, textureX, textureY); // Box 437
		bodyModel[457] = new ModelRendererTurbo(this, 335, 266, textureX, textureY); // Box 438
		bodyModel[458] = new ModelRendererTurbo(this, 346, 266, textureX, textureY); // Box 439
		bodyModel[459] = new ModelRendererTurbo(this, 339, 274, textureX, textureY); // Box 440
		bodyModel[460] = new ModelRendererTurbo(this, 339, 296, textureX, textureY); // Box 441
		bodyModel[461] = new ModelRendererTurbo(this, 357, 325, textureX, textureY); // Box 492
		bodyModel[462] = new ModelRendererTurbo(this, 362, 319, textureX, textureY); // Box 493
		bodyModel[463] = new ModelRendererTurbo(this, 351, 325, textureX, textureY); // Box 495
		bodyModel[464] = new ModelRendererTurbo(this, 359, 332, textureX, textureY); // Box 493
		bodyModel[465] = new ModelRendererTurbo(this, 357, 320, textureX, textureY); // Box 495
		bodyModel[466] = new ModelRendererTurbo(this, 373, 325, textureX, textureY); // Box 495
		bodyModel[467] = new ModelRendererTurbo(this, 357, 289, textureX, textureY); // Box 449
		bodyModel[468] = new ModelRendererTurbo(this, 362, 283, textureX, textureY); // Box 450
		bodyModel[469] = new ModelRendererTurbo(this, 351, 289, textureX, textureY); // Box 451
		bodyModel[470] = new ModelRendererTurbo(this, 359, 296, textureX, textureY); // Box 452
		bodyModel[471] = new ModelRendererTurbo(this, 357, 284, textureX, textureY); // Box 453
		bodyModel[472] = new ModelRendererTurbo(this, 373, 289, textureX, textureY); // Box 454
		bodyModel[473] = new ModelRendererTurbo(this, 371, 284, textureX, textureY); // Box 455
		bodyModel[474] = new ModelRendererTurbo(this, 355, 270, textureX, textureY); // Box 458
		bodyModel[475] = new ModelRendererTurbo(this, 366, 270, textureX, textureY); // Box 459
		bodyModel[476] = new ModelRendererTurbo(this, 359, 278, textureX, textureY); // Box 461
		bodyModel[477] = new ModelRendererTurbo(this, 355, 346, textureX, textureY); // Box 495
		bodyModel[478] = new ModelRendererTurbo(this, 366, 346, textureX, textureY); // Box 495
		bodyModel[479] = new ModelRendererTurbo(this, 359, 337, textureX, textureY); // Box 493
		bodyModel[480] = new ModelRendererTurbo(this, 255, 151, textureX, textureY); // Box 2
		bodyModel[481] = new ModelRendererTurbo(this, 255, 141, textureX, textureY); // Box 27
		bodyModel[482] = new ModelRendererTurbo(this, 377, 325, textureX, textureY); // Box 492
		bodyModel[483] = new ModelRendererTurbo(this, 382, 319, textureX, textureY); // Box 493
		bodyModel[484] = new ModelRendererTurbo(this, 372, 338, textureX, textureY); // Box 495
		bodyModel[485] = new ModelRendererTurbo(this, 390, 338, textureX, textureY); // Box 495
		bodyModel[486] = new ModelRendererTurbo(this, 379, 337, textureX, textureY); // Box 493
		bodyModel[487] = new ModelRendererTurbo(this, 379, 332, textureX, textureY); // Box 493
		bodyModel[488] = new ModelRendererTurbo(this, 377, 289, textureX, textureY); // Box 456
		bodyModel[489] = new ModelRendererTurbo(this, 382, 283, textureX, textureY); // Box 457
		bodyModel[490] = new ModelRendererTurbo(this, 375, 266, textureX, textureY); // Box 458
		bodyModel[491] = new ModelRendererTurbo(this, 386, 266, textureX, textureY); // Box 459
		bodyModel[492] = new ModelRendererTurbo(this, 379, 296, textureX, textureY); // Box 461
		bodyModel[493] = new ModelRendererTurbo(this, 379, 274, textureX, textureY); // Box 460
		bodyModel[494] = new ModelRendererTurbo(this, 372, 301, textureX, textureY); // Box 492
		bodyModel[495] = new ModelRendererTurbo(this, 376, 306, textureX, textureY); // Box 492
		bodyModel[496] = new ModelRendererTurbo(this, 374, 314, textureX, textureY); // Box 492
		bodyModel[497] = new ModelRendererTurbo(this, 385, 301, textureX, textureY); // Box 492
		bodyModel[498] = new ModelRendererTurbo(this, 389, 306, textureX, textureY); // Box 492
		bodyModel[499] = new ModelRendererTurbo(this, 387, 314, textureX, textureY); // Box 492

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

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[39].setRotationPoint(52.5F, 3F, 10.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[40].setRotationPoint(-60.5F, 3F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[41].setRotationPoint(-60.5F, 4F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[42].setRotationPoint(-55.5F, 4F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[43].setRotationPoint(52.5F, 3F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[44].setRotationPoint(-55.5F, 3F, 10.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
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

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.55F, 0F, -0.85F, -0.7F, 0F, 2.35F, -0.45F, -1F, -3.15F, -0.55F, 0F, -0.15F, 0F, -1F, 0F, -1.15F, -1F, 2.7F, -1.15F, 0F, -3.7F, 0F, -1F, -1F); // Box 306
		bodyModel[117].setRotationPoint(56.95F, -15F, 9.15F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1.35F, 0F, -0.5F, 0F, -2F, -0.5F, -1F, -1F, 0.5F, -0.75F, 0F, 0.3F, -1F, -1F, -0.5F, -1F, 1F, -0.5F, -1.7F, 0F, -0.05F, -0.3F, -1F, -0.05F); // Box 307
		bodyModel[118].setRotationPoint(58.5F, -15F, 2.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 38
		bodyModel[119].setRotationPoint(58.5F, -5F, -3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[120].setRotationPoint(58.5F, -5F, -4F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[121].setRotationPoint(58.5F, -5F, 3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 38
		bodyModel[122].setRotationPoint(58.5F, -5F, -6.45F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.55F, -0.2F, 0F, -0.55F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, -0.2F, 0F, -0.55F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[123].setRotationPoint(58.5F, -5F, 3.45F);

		bodyModel[124].addBox(0F, 0F, 0F, 49, 1, 0, 0F); // Box 38
		bodyModel[124].setRotationPoint(-22.5F, -13.5F, -11.01F);

		bodyModel[125].addBox(0F, 0F, 0F, 96, 1, 0, 0F); // Box 38
		bodyModel[125].setRotationPoint(-48F, -2.5F, -11.01F);

		bodyModel[126].addBox(0F, 0F, 0F, 49, 1, 0, 0F); // Box 451
		bodyModel[126].setRotationPoint(-22.5F, -13.5F, 11.01F);

		bodyModel[127].addBox(0F, 0F, 0F, 96, 1, 0, 0F); // Box 452
		bodyModel[127].setRotationPoint(-48F, -2.5F, 11.01F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 109, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[128].setRotationPoint(-54.5F, -10F, -9.9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 109, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[129].setRotationPoint(-54.5F, -10F, 9.9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[130].setRotationPoint(-60F, -6F, -12F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[131].setRotationPoint(-55F, -6F, -12F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[132].setRotationPoint(-60F, -6F, 11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[133].setRotationPoint(-55F, -6F, 11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[134].setRotationPoint(-60.5F, 4F, -10.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[135].setRotationPoint(-60.5F, 4F, 9.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.2F, 0F, 1F, -0.76F, 0F, 1F, -0.76F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.8F, 0F); // Box 128
		bodyModel[136].setRotationPoint(56.5F, -18.25F, -2F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, 0.51F, -1F, 0F, 0.51F, 0F, 0F, -0.98F, 0F); // Box 128
		bodyModel[137].setRotationPoint(54.5F, -19F, -3F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, -4F, -0.75F, 4F, -1.15F, -1.25F, -5.3F, 0F, 0F, -3F, 0F, -0.99F, 0F, -4F, 0F, 4F, -1.15F, 0.27F, -5.3F, 0F, -0.99F, -3F); // Box 265
		bodyModel[138].setRotationPoint(54.5F, -19F, -3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.55F, -0.25F, -0.85F, -3F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.96F, 0F, -0.55F, -0.49F, -0.85F, -3F, -2F, 0F, 0F, -2F, 0F); // Box 268
		bodyModel[139].setRotationPoint(54.5F, -17F, -10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 22, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[140].setRotationPoint(-60.5F, -19F, -7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 22, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[141].setRotationPoint(-60.5F, -19F, 3F);

		bodyModel[142].addBox(0F, 0F, 0F, 22, 1, 14, 0F); // Box 128
		bodyModel[142].setRotationPoint(-60.5F, -18F, -7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 16, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[143].setRotationPoint(-54.5F, -18F, -10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 16, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185
		bodyModel[144].setRotationPoint(-54.5F, -18F, 7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 16, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[145].setRotationPoint(-54.5F, -17F, -7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 16, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[146].setRotationPoint(-54.5F, -16.25F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 115, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[147].setRotationPoint(-60.5F, -19F, -3F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 93, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[148].setRotationPoint(-38.5F, -19F, -6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 93, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 324
		bodyModel[149].setRotationPoint(-38.5F, -19F, 3F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 93, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324 glow
		bodyModel[150].setRotationPoint(-38.5F, -18.25F, 6.01F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 93, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338 glow
		bodyModel[151].setRotationPoint(-38.5F, -18.25F, -6.01F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.98F, 0F, 0F, -0.98F, 0F); // Box 332
		bodyModel[152].setRotationPoint(32.5F, -17.45F, -9F);

		bodyModel[153].addBox(0F, 0F, 0F, 22, 5, 1, 0F); // Box 128
		bodyModel[153].setRotationPoint(32.5F, -16F, 9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 128
		bodyModel[154].setRotationPoint(32.5F, -16.85F, 9F);

		bodyModel[155].addBox(0F, 0F, 0F, 22, 5, 1, 0F); // Box 329
		bodyModel[155].setRotationPoint(32.5F, -16F, -10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 330
		bodyModel[156].setRotationPoint(32.5F, -16.85F, -10F);

		bodyModel[157].addBox(0F, 0F, 0F, 22, 0, 1, 0F); // Box 128 glow
		bodyModel[157].setRotationPoint(32.5F, -10.99F, 9F);

		bodyModel[158].addBox(0F, 0F, 0F, 22, 0, 1, 0F); // Box 340 glow
		bodyModel[158].setRotationPoint(32.5F, -10.99F, -10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 70, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[159].setRotationPoint(-38.5F, -14F, 7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 70, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275
		bodyModel[160].setRotationPoint(-38.5F, -14F, -10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 70, 0, 2, 0F,0F, 0.165F, 0F, 0F, 0.165F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.165F, 0F, 0F, -0.165F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275 glow
		bodyModel[161].setRotationPoint(-38.5F, -12.99F, -9F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 70, 0, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.165F, 0F, 0F, 0.165F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.165F, 0F, 0F, -0.165F, 0F); // Box 285 glow
		bodyModel[162].setRotationPoint(-38.5F, -12.99F, 7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 70, 1, 1, 0F,0F, 0.165F, 0F, 0F, 0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.165F, 0F, 0F, -1.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[163].setRotationPoint(-38.5F, -13F, 9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 70, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.165F, 0F, 0F, 0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.165F, 0F, 0F, -1.165F, 0F); // Box 276
		bodyModel[164].setRotationPoint(-38.5F, -13F, -10F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 128
		bodyModel[165].setRotationPoint(31.5F, -6F, 3F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 128
		bodyModel[166].setRotationPoint(31.5F, -6F, -10F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 128
		bodyModel[167].setRotationPoint(31.5F, -15F, 6F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 128
		bodyModel[168].setRotationPoint(31.5F, -15F, -10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F); // Box 128
		bodyModel[169].setRotationPoint(31.5F, -16.75F, 6F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F); // Box 128
		bodyModel[170].setRotationPoint(31.5F, -16.75F, -9.15F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[171].setRotationPoint(31.5F, -18F, 6F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 128
		bodyModel[172].setRotationPoint(31.5F, -18.25F, 6F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.15F, 0F, -1.25F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0.15F); // Box 128
		bodyModel[173].setRotationPoint(31.5F, -18F, 7F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F); // Box 128
		bodyModel[174].setRotationPoint(31.5F, -16.75F, 9.15F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 318
		bodyModel[175].setRotationPoint(31.5F, -18F, -7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.25F, 0.15F, 0F, -1.25F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 320
		bodyModel[176].setRotationPoint(31.5F, -18F, -9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 321
		bodyModel[177].setRotationPoint(31.5F, -16.75F, -10.15F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[178].setRotationPoint(30.5F, -18F, -1F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[179].setRotationPoint(20.5F, -18F, -1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[180].setRotationPoint(10.5F, -18F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[181].setRotationPoint(0.5F, -18F, -1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[182].setRotationPoint(-9.5F, -18F, -1F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[183].setRotationPoint(-19.5F, -18F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[184].setRotationPoint(-29.5F, -18F, -1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[185].setRotationPoint(40.5F, -18F, -1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[186].setRotationPoint(-59.5F, 3F, 4.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[187].setRotationPoint(-55.5F, 3F, 4.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[188].setRotationPoint(-59.5F, 3F, 7.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1359
		bodyModel[189].setRotationPoint(-55.5F, 4F, 7.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1360
		bodyModel[190].setRotationPoint(-59.5F, 4F, 7.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[191].setRotationPoint(-59.49F, 3F, 5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[192].setRotationPoint(-59.49F, 3F, 7F);

		bodyModel[193].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[193].setRotationPoint(-59.49F, 4F, 8F);

		bodyModel[194].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[194].setRotationPoint(-59.49F, 4F, 8F);

		bodyModel[195].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[195].setRotationPoint(-59.49F, 4F, 8F);

		bodyModel[196].addShapeBox(0F, 2F, 0.5F, 4, 0, 2, 0F,0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[196].setRotationPoint(-59.49F, 4F, 8F);

		bodyModel[197].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[197].setRotationPoint(-59.49F, 4F, 8F);

		bodyModel[198].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[198].setRotationPoint(-55.51F, 4F, 8F);

		bodyModel[199].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[199].setRotationPoint(-59.49F, 4F, 8F);

		bodyModel[200].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[200].setRotationPoint(-55.51F, 4F, 8F);

		bodyModel[201].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[201].setRotationPoint(-59.49F, 4F, 8F);

		bodyModel[202].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[202].setRotationPoint(-55.51F, 4F, 8F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[203].setRotationPoint(-55.5F, 3F, 7.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[204].setRotationPoint(-59.5F, 3F, -7.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[205].setRotationPoint(-55.5F, 3F, -7.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[206].setRotationPoint(-55.5F, 3F, -10.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[207].setRotationPoint(-59.5F, 3F, -10.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[208].setRotationPoint(-55.5F, 4F, -10.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[209].setRotationPoint(-59.5F, 4F, -10.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[210].setRotationPoint(-59.49F, 3F, -7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[211].setRotationPoint(-59.49F, 3F, -7F);

		bodyModel[212].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[212].setRotationPoint(-59.49F, 4F, -8F);

		bodyModel[213].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[213].setRotationPoint(-59.49F, 4F, -8F);

		bodyModel[214].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[214].setRotationPoint(-59.49F, 4F, -8F);

		bodyModel[215].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[215].setRotationPoint(-59.49F, 4F, -8F);

		bodyModel[216].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[216].setRotationPoint(-59.49F, 4F, -8F);

		bodyModel[217].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[217].setRotationPoint(-59.49F, 4F, -8F);

		bodyModel[218].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[218].setRotationPoint(-55.51F, 4F, -8F);

		bodyModel[219].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[219].setRotationPoint(-59.5F, 3F, -4F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[220].setRotationPoint(-60.5F, 3F, -10.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[221].setRotationPoint(-60.5F, 3F, 7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 475
		bodyModel[222].setRotationPoint(-60.5F, 3F, -10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[223].setRotationPoint(-60.5F, 3F, 9.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[224].setRotationPoint(-62.5F, -17F, -5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[225].setRotationPoint(-62.5F, -15F, -11F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 18, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[226].setRotationPoint(-62F, -15F, -11F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[227].setRotationPoint(-62.5F, -16F, -11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[228].setRotationPoint(-62F, -15F, -11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[229].setRotationPoint(-62.5F, 1F, -10F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[230].setRotationPoint(-62.5F, -19F, -10F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, -1.75F, 0F, -1.5F, -1.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -1.5F, 1.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[231].setRotationPoint(-62F, -19F, -10F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[232].setRotationPoint(-62.5F, -19.5F, -7F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[233].setRotationPoint(-62F, -20F, -7F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[234].setRotationPoint(-62.5F, -20F, -3F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 0, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[235].setRotationPoint(-62F, -20F, -3F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[236].setRotationPoint(-62.5F, -19.75F, -5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[237].setRotationPoint(-62.5F, -15F, 10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 18, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[238].setRotationPoint(-62F, -15F, 11F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[239].setRotationPoint(-62.5F, -16F, 9F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 2.25F, -1F, -1.5F, 2.25F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -1.5F, -2.25F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[240].setRotationPoint(-62F, -15F, 9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[241].setRotationPoint(-62.5F, -19F, 7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[242].setRotationPoint(-62F, -19F, 7F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 253
		bodyModel[243].setRotationPoint(-62.5F, -19.5F, 5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[244].setRotationPoint(-62F, -20F, 3F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[245].setRotationPoint(-62.5F, -19.75F, 3F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[246].setRotationPoint(-62.5F, -7F, -10F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[247].setRotationPoint(-62.5F, -7F, 5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[248].setRotationPoint(-62.5F, -17.25F, -10F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 336
		bodyModel[249].setRotationPoint(-62.5F, -17.25F, 5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[250].setRotationPoint(-54.5F, 4F, 10.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[251].setRotationPoint(-54.5F, 4F, -11F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 2
		bodyModel[252].setRotationPoint(51.5F, 4F, 10.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 29
		bodyModel[253].setRotationPoint(51.5F, 4F, -11F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[254].setRotationPoint(32.5F, 4F, 10.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 2
		bodyModel[255].setRotationPoint(-35.5F, 4F, 10.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 68, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[256].setRotationPoint(-34.5F, 3F, 10.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 66, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[257].setRotationPoint(-33.5F, 4F, 10.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[258].setRotationPoint(32.5F, 4F, -11F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 37
		bodyModel[259].setRotationPoint(-35.5F, 4F, -11F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 68, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[260].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 66, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[261].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[262].setRotationPoint(-53.5F, 3F, 10.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[263].setRotationPoint(-53.5F, 3F, -11F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[264].setRotationPoint(33.5F, 3F, 10.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[265].setRotationPoint(33.5F, 3F, -11F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[266].setRotationPoint(-54.5F, 4F, 10.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[267].setRotationPoint(32.5F, 4F, 10.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[268].setRotationPoint(-54.5F, 4F, -11F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[269].setRotationPoint(32.5F, 4F, -11F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F); // Box 128
		bodyModel[270].setRotationPoint(-59F, -17.25F, 10F);
		bodyModel[270].rotateAngleX = 0.41887902F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[271].setRotationPoint(-59F, -17.65F, -10.92F);
		bodyModel[271].rotateAngleX = -0.41887902F;

		bodyModel[272].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[272].setRotationPoint(-53.5F, -19F, -7F);
		bodyModel[272].rotateAngleX = 0.2443461F;

		bodyModel[273].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 487
		bodyModel[273].setRotationPoint(-53.5F, -19.5F, 5F);
		bodyModel[273].rotateAngleX = -0.2443461F;

		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[274].setRotationPoint(47.5F, -20.5F, -1F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[275].setRotationPoint(37.5F, -20.5F, -1F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[276].setRotationPoint(-30.5F, 2.75F, -6.1F);
		bodyModel[276].rotateAngleX = -0.78539816F;

		bodyModel[277].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[277].setRotationPoint(-30.51F, 3F, -6.6F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[278].setRotationPoint(-25.49F, 3F, -6.6F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[279].setRotationPoint(17.5F, 2.75F, 7.9F);
		bodyModel[279].rotateAngleX = -0.78539816F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[280].setRotationPoint(17.49F, 3F, 7.4F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[281].setRotationPoint(22.51F, 3F, 7.4F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[282].setRotationPoint(18.5F, 2.75F, 5.4F);
		bodyModel[282].rotateAngleX = -0.78539816F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[283].setRotationPoint(18.49F, 3F, 4.9F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[284].setRotationPoint(21.51F, 3F, 4.9F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[285].setRotationPoint(-30.5F, 4F, 0F);
		bodyModel[285].rotateAngleX = -0.78539816F;

		bodyModel[286].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[286].setRotationPoint(-30.51F, 4F, -0.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[287].setRotationPoint(-22.49F, 4F, -0.5F);

		bodyModel[288].addBox(0F, 0F, 0F, 15, 2, 4, 0F); // Box 869
		bodyModel[288].setRotationPoint(-25.5F, 3F, 4F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 870
		bodyModel[289].setRotationPoint(-25.5F, 5F, 4F);

		bodyModel[290].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 874
		bodyModel[290].setRotationPoint(-5.5F, 3F, 6F);

		bodyModel[291].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 877
		bodyModel[291].setRotationPoint(3.5F, 3F, 5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[292].setRotationPoint(5.5F, 3F, -8F);
		bodyModel[292].rotateAngleX = -0.78539816F;

		bodyModel[293].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[293].setRotationPoint(5.49F, 3F, -8.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[294].setRotationPoint(12.51F, 3F, -8.5F);

		bodyModel[295].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 881
		bodyModel[295].setRotationPoint(-6.5F, 3F, -10F);

		bodyModel[296].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 882
		bodyModel[296].setRotationPoint(-15.5F, 3F, -10F);

		bodyModel[297].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[297].setRotationPoint(-39.5F, -15F, 3F);

		bodyModel[298].addBox(0F, 0F, 0F, 3, 16, 7, 0F); // Box 38
		bodyModel[298].setRotationPoint(-46.5F, -15F, 3F);

		bodyModel[299].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 38
		bodyModel[299].setRotationPoint(-54.5F, -15F, 3F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[300].setRotationPoint(-43.5F, -12F, 3F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[301].setRotationPoint(-43.5F, -8F, 3F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[302].setRotationPoint(-43.5F, -4F, 3F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[303].setRotationPoint(-49.5F, -6F, 8F);

		bodyModel[304].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[304].setRotationPoint(-48.5F, -5F, 9F);
		bodyModel[304].rotateAngleY = -0.78539816F;

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[305].setRotationPoint(-47.5F, -14.99F, -0.5F);

		bodyModel[306].addBox(0F, 0F, 0F, 8, 16, 7, 0F); // Box 38
		bodyModel[306].setRotationPoint(-46.5F, -15F, -10F);

		bodyModel[307].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 38
		bodyModel[307].setRotationPoint(-54.5F, -15F, -4F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[308].setRotationPoint(-48.5F, -6F, -10F);

		bodyModel[309].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[309].setRotationPoint(-47.75F, -5F, -8.5F);
		bodyModel[309].rotateAngleY = -0.78539816F;

		bodyModel[310].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 38
		bodyModel[310].setRotationPoint(-47.5F, -15F, -6F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 38 cull
		bodyModel[311].setRotationPoint(-49.5F, -4F, -4.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 71, 2, 1, 0F,0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 170
		bodyModel[312].setRotationPoint(-38.5F, -16.85F, 9F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 71, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F); // Box 528
		bodyModel[313].setRotationPoint(-38.5F, -16.85F, -10F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[314].setRotationPoint(-54.45F, -2F, 8.55F);
		bodyModel[314].rotateAngleY = -0.78539816F;

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[315].setRotationPoint(-54.1F, -1F, 8.9F);
		bodyModel[315].rotateAngleY = -0.78539816F;

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[316].setRotationPoint(-54.45F, 0.5F, 8.55F);
		bodyModel[316].rotateAngleY = -0.78539816F;

		bodyModel[317].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[317].setRotationPoint(-53F, -2F, -9.95F);
		bodyModel[317].rotateAngleY = 0.78539816F;

		bodyModel[318].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[318].setRotationPoint(-53.35F, -1F, -9.6F);
		bodyModel[318].rotateAngleY = 0.78539816F;

		bodyModel[319].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[319].setRotationPoint(-53F, 0.5F, -9.95F);
		bodyModel[319].rotateAngleY = 0.78539816F;

		bodyModel[320].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[320].setRotationPoint(27.5F, -3F, 7F);
		bodyModel[320].rotateAngleY = -3.14159265F;

		bodyModel[321].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[321].setRotationPoint(27.5F, -8F, 7F);
		bodyModel[321].rotateAngleY = -3.14159265F;

		bodyModel[322].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[322].setRotationPoint(27.5F, -3F, -7F);
		bodyModel[322].rotateAngleY = -3.14159265F;

		bodyModel[323].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[323].setRotationPoint(27.5F, -8F, -7F);
		bodyModel[323].rotateAngleY = -3.14159265F;

		bodyModel[324].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[324].setRotationPoint(26F, -1F, 5F);

		bodyModel[325].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[325].setRotationPoint(26F, -1F, -9F);

		bodyModel[326].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[326].setRotationPoint(27.5F, -3F, 7F);
		bodyModel[326].rotateAngleY = -3.14159265F;

		bodyModel[327].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[327].setRotationPoint(27.5F, -3F, 7F);
		bodyModel[327].rotateAngleY = -3.14159265F;

		bodyModel[328].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[328].setRotationPoint(27.5F, -3F, -7F);
		bodyModel[328].rotateAngleY = -3.14159265F;

		bodyModel[329].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[329].setRotationPoint(27.5F, -3F, -7F);
		bodyModel[329].rotateAngleY = -3.14159265F;

		bodyModel[330].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[330].setRotationPoint(27.5F, -5F, 7F);
		bodyModel[330].rotateAngleY = -3.14159265F;

		bodyModel[331].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[331].setRotationPoint(27.5F, -5F, 7F);
		bodyModel[331].rotateAngleY = -3.14159265F;

		bodyModel[332].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[332].setRotationPoint(27.5F, -5F, -7F);
		bodyModel[332].rotateAngleY = -3.14159265F;

		bodyModel[333].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[333].setRotationPoint(27.5F, -5F, -7F);
		bodyModel[333].rotateAngleY = -3.14159265F;

		bodyModel[334].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[334].setRotationPoint(17.5F, -3F, 7F);
		bodyModel[334].rotateAngleY = -3.14159265F;

		bodyModel[335].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[335].setRotationPoint(17.5F, -8F, 7F);
		bodyModel[335].rotateAngleY = -3.14159265F;

		bodyModel[336].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[336].setRotationPoint(17.5F, -3F, -7F);
		bodyModel[336].rotateAngleY = -3.14159265F;

		bodyModel[337].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[337].setRotationPoint(17.5F, -8F, -7F);
		bodyModel[337].rotateAngleY = -3.14159265F;

		bodyModel[338].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[338].setRotationPoint(16F, -1F, 5F);

		bodyModel[339].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[339].setRotationPoint(16F, -1F, -9F);

		bodyModel[340].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[340].setRotationPoint(17.5F, -3F, 7F);
		bodyModel[340].rotateAngleY = -3.14159265F;

		bodyModel[341].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[341].setRotationPoint(17.5F, -3F, 7F);
		bodyModel[341].rotateAngleY = -3.14159265F;

		bodyModel[342].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[342].setRotationPoint(17.5F, -3F, -7F);
		bodyModel[342].rotateAngleY = -3.14159265F;

		bodyModel[343].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[343].setRotationPoint(17.5F, -3F, -7F);
		bodyModel[343].rotateAngleY = -3.14159265F;

		bodyModel[344].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[344].setRotationPoint(17.5F, -5F, 7F);
		bodyModel[344].rotateAngleY = -3.14159265F;

		bodyModel[345].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[345].setRotationPoint(17.5F, -5F, 7F);
		bodyModel[345].rotateAngleY = -3.14159265F;

		bodyModel[346].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[346].setRotationPoint(17.5F, -5F, -7F);
		bodyModel[346].rotateAngleY = -3.14159265F;

		bodyModel[347].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[347].setRotationPoint(17.5F, -5F, -7F);
		bodyModel[347].rotateAngleY = -3.14159265F;

		bodyModel[348].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[348].setRotationPoint(7.5F, -3F, 7F);
		bodyModel[348].rotateAngleY = -3.14159265F;

		bodyModel[349].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[349].setRotationPoint(7.5F, -8F, 7F);
		bodyModel[349].rotateAngleY = -3.14159265F;

		bodyModel[350].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[350].setRotationPoint(7.5F, -3F, -7F);
		bodyModel[350].rotateAngleY = -3.14159265F;

		bodyModel[351].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[351].setRotationPoint(7.5F, -8F, -7F);
		bodyModel[351].rotateAngleY = -3.14159265F;

		bodyModel[352].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[352].setRotationPoint(6F, -1F, 5F);

		bodyModel[353].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[353].setRotationPoint(6F, -1F, -9F);

		bodyModel[354].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[354].setRotationPoint(7.5F, -3F, 7F);
		bodyModel[354].rotateAngleY = -3.14159265F;

		bodyModel[355].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[355].setRotationPoint(7.5F, -3F, 7F);
		bodyModel[355].rotateAngleY = -3.14159265F;

		bodyModel[356].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[356].setRotationPoint(7.5F, -3F, -7F);
		bodyModel[356].rotateAngleY = -3.14159265F;

		bodyModel[357].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[357].setRotationPoint(7.5F, -3F, -7F);
		bodyModel[357].rotateAngleY = -3.14159265F;

		bodyModel[358].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[358].setRotationPoint(7.5F, -5F, 7F);
		bodyModel[358].rotateAngleY = -3.14159265F;

		bodyModel[359].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[359].setRotationPoint(7.5F, -5F, 7F);
		bodyModel[359].rotateAngleY = -3.14159265F;

		bodyModel[360].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[360].setRotationPoint(7.5F, -5F, -7F);
		bodyModel[360].rotateAngleY = -3.14159265F;

		bodyModel[361].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[361].setRotationPoint(7.5F, -5F, -7F);
		bodyModel[361].rotateAngleY = -3.14159265F;

		bodyModel[362].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[362].setRotationPoint(-2.5F, -3F, 7F);
		bodyModel[362].rotateAngleY = -3.14159265F;

		bodyModel[363].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[363].setRotationPoint(-2.5F, -8F, 7F);
		bodyModel[363].rotateAngleY = -3.14159265F;

		bodyModel[364].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[364].setRotationPoint(-2.5F, -3F, -7F);
		bodyModel[364].rotateAngleY = -3.14159265F;

		bodyModel[365].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[365].setRotationPoint(-2.5F, -8F, -7F);
		bodyModel[365].rotateAngleY = -3.14159265F;

		bodyModel[366].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[366].setRotationPoint(-4F, -1F, 5F);

		bodyModel[367].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[367].setRotationPoint(-4F, -1F, -9F);

		bodyModel[368].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[368].setRotationPoint(-2.5F, -3F, 7F);
		bodyModel[368].rotateAngleY = -3.14159265F;

		bodyModel[369].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[369].setRotationPoint(-2.5F, -3F, 7F);
		bodyModel[369].rotateAngleY = -3.14159265F;

		bodyModel[370].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[370].setRotationPoint(-2.5F, -3F, -7F);
		bodyModel[370].rotateAngleY = -3.14159265F;

		bodyModel[371].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[371].setRotationPoint(-2.5F, -3F, -7F);
		bodyModel[371].rotateAngleY = -3.14159265F;

		bodyModel[372].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[372].setRotationPoint(-2.5F, -5F, 7F);
		bodyModel[372].rotateAngleY = -3.14159265F;

		bodyModel[373].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[373].setRotationPoint(-2.5F, -5F, 7F);
		bodyModel[373].rotateAngleY = -3.14159265F;

		bodyModel[374].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[374].setRotationPoint(-2.5F, -5F, -7F);
		bodyModel[374].rotateAngleY = -3.14159265F;

		bodyModel[375].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[375].setRotationPoint(-2.5F, -5F, -7F);
		bodyModel[375].rotateAngleY = -3.14159265F;

		bodyModel[376].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[376].setRotationPoint(-12.5F, -3F, 7F);
		bodyModel[376].rotateAngleY = -3.14159265F;

		bodyModel[377].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[377].setRotationPoint(-12.5F, -8F, 7F);
		bodyModel[377].rotateAngleY = -3.14159265F;

		bodyModel[378].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[378].setRotationPoint(-12.5F, -3F, -7F);
		bodyModel[378].rotateAngleY = -3.14159265F;

		bodyModel[379].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[379].setRotationPoint(-12.5F, -8F, -7F);
		bodyModel[379].rotateAngleY = -3.14159265F;

		bodyModel[380].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[380].setRotationPoint(-14F, -1F, 5F);

		bodyModel[381].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[381].setRotationPoint(-14F, -1F, -9F);

		bodyModel[382].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[382].setRotationPoint(-12.5F, -3F, 7F);
		bodyModel[382].rotateAngleY = -3.14159265F;

		bodyModel[383].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[383].setRotationPoint(-12.5F, -3F, 7F);
		bodyModel[383].rotateAngleY = -3.14159265F;

		bodyModel[384].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[384].setRotationPoint(-12.5F, -3F, -7F);
		bodyModel[384].rotateAngleY = -3.14159265F;

		bodyModel[385].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[385].setRotationPoint(-12.5F, -3F, -7F);
		bodyModel[385].rotateAngleY = -3.14159265F;

		bodyModel[386].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[386].setRotationPoint(-12.5F, -5F, 7F);
		bodyModel[386].rotateAngleY = -3.14159265F;

		bodyModel[387].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[387].setRotationPoint(-12.5F, -5F, 7F);
		bodyModel[387].rotateAngleY = -3.14159265F;

		bodyModel[388].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[388].setRotationPoint(-12.5F, -5F, -7F);
		bodyModel[388].rotateAngleY = -3.14159265F;

		bodyModel[389].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[389].setRotationPoint(-12.5F, -5F, -7F);
		bodyModel[389].rotateAngleY = -3.14159265F;

		bodyModel[390].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[390].setRotationPoint(-22.5F, -3F, 7F);
		bodyModel[390].rotateAngleY = -3.14159265F;

		bodyModel[391].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[391].setRotationPoint(-22.5F, -8F, 7F);
		bodyModel[391].rotateAngleY = -3.14159265F;

		bodyModel[392].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[392].setRotationPoint(-22.5F, -3F, -7F);
		bodyModel[392].rotateAngleY = -3.14159265F;

		bodyModel[393].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[393].setRotationPoint(-22.5F, -8F, -7F);
		bodyModel[393].rotateAngleY = -3.14159265F;

		bodyModel[394].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[394].setRotationPoint(-24F, -1F, 5F);

		bodyModel[395].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[395].setRotationPoint(-24F, -1F, -9F);

		bodyModel[396].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[396].setRotationPoint(-22.5F, -3F, 7F);
		bodyModel[396].rotateAngleY = -3.14159265F;

		bodyModel[397].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[397].setRotationPoint(-22.5F, -3F, 7F);
		bodyModel[397].rotateAngleY = -3.14159265F;

		bodyModel[398].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[398].setRotationPoint(-22.5F, -3F, -7F);
		bodyModel[398].rotateAngleY = -3.14159265F;

		bodyModel[399].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[399].setRotationPoint(-22.5F, -3F, -7F);
		bodyModel[399].rotateAngleY = -3.14159265F;

		bodyModel[400].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[400].setRotationPoint(-22.5F, -5F, 7F);
		bodyModel[400].rotateAngleY = -3.14159265F;

		bodyModel[401].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[401].setRotationPoint(-22.5F, -5F, 7F);
		bodyModel[401].rotateAngleY = -3.14159265F;

		bodyModel[402].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[402].setRotationPoint(-22.5F, -5F, -7F);
		bodyModel[402].rotateAngleY = -3.14159265F;

		bodyModel[403].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[403].setRotationPoint(-22.5F, -5F, -7F);
		bodyModel[403].rotateAngleY = -3.14159265F;

		bodyModel[404].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[404].setRotationPoint(-32.5F, -3F, 7F);
		bodyModel[404].rotateAngleY = -3.14159265F;

		bodyModel[405].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[405].setRotationPoint(-32.5F, -8F, 7F);
		bodyModel[405].rotateAngleY = -3.14159265F;

		bodyModel[406].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[406].setRotationPoint(-32.5F, -3F, -7F);
		bodyModel[406].rotateAngleY = -3.14159265F;

		bodyModel[407].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[407].setRotationPoint(-32.5F, -8F, -7F);
		bodyModel[407].rotateAngleY = -3.14159265F;

		bodyModel[408].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[408].setRotationPoint(-34F, -1F, 5F);

		bodyModel[409].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[409].setRotationPoint(-34F, -1F, -9F);

		bodyModel[410].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[410].setRotationPoint(-32.5F, -3F, 7F);
		bodyModel[410].rotateAngleY = -3.14159265F;

		bodyModel[411].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[411].setRotationPoint(-32.5F, -3F, 7F);
		bodyModel[411].rotateAngleY = -3.14159265F;

		bodyModel[412].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[412].setRotationPoint(-32.5F, -3F, -7F);
		bodyModel[412].rotateAngleY = -3.14159265F;

		bodyModel[413].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[413].setRotationPoint(-32.5F, -3F, -7F);
		bodyModel[413].rotateAngleY = -3.14159265F;

		bodyModel[414].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[414].setRotationPoint(-32.5F, -5F, 7F);
		bodyModel[414].rotateAngleY = -3.14159265F;

		bodyModel[415].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[415].setRotationPoint(-32.5F, -5F, 7F);
		bodyModel[415].rotateAngleY = -3.14159265F;

		bodyModel[416].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[416].setRotationPoint(-32.5F, -5F, -7F);
		bodyModel[416].rotateAngleY = -3.14159265F;

		bodyModel[417].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[417].setRotationPoint(-32.5F, -5F, -7F);
		bodyModel[417].rotateAngleY = -3.14159265F;

		bodyModel[418].addBox(0F, 0F, 0F, 1, 6, 8, 0F); // Box 38
		bodyModel[418].setRotationPoint(57.5F, -5F, -4F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.1F, -2F, 0F, -0.1F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[419].setRotationPoint(57.5F, -5F, -8.45F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 38
		bodyModel[420].setRotationPoint(57.5F, -5F, -6.45F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.65F, 0F, 0F, -0.65F); // Box 38
		bodyModel[421].setRotationPoint(57F, -5F, -7.35F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[422].setRotationPoint(57F, -5F, -8.35F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
		bodyModel[423].setRotationPoint(57F, -5F, -5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.7F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 444
		bodyModel[424].setRotationPoint(57.5F, -5F, 6.45F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[425].setRotationPoint(57.5F, -5F, 3.45F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[426].setRotationPoint(57F, -5F, 4.35F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 447
		bodyModel[427].setRotationPoint(57F, -5F, 7.35F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[428].setRotationPoint(57F, -5F, 4F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F); // Box 492
		bodyModel[429].setRotationPoint(34F, -3F, -9F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.12F, 0F, -0.5F, 0.12F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.12F, 0F, 0F, 0.12F, 0F, 0F); // Box 493
		bodyModel[430].setRotationPoint(34.5F, -7F, -9F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.28F, -0.5F, 0F, -0.22F, -0.5F, 0F, -0.54F, 0F, 0.1F, 0.04F, 0F, 0.1F, -0.28F, 0F, 0F, -0.22F, 0F, 0F, -0.54F, -0.5F, 0.1F, 0.04F, -0.5F, 0.1F); // Box 495
		bodyModel[431].setRotationPoint(33.65F, -4.5F, -8.6F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[432].setRotationPoint(34.5F, -2F, -8.75F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.07F, 0F, -0.5F, -0.57F, 0F, -0.5F, -0.63F, 0F, 0F, 0.13F, 0F, 0F, 0.07F, -0.5F, -0.5F, -0.57F, -0.5F, -0.5F, -0.63F, -0.5F, 0F, 0.13F, -0.5F, 0F); // Box 495
		bodyModel[433].setRotationPoint(33.68F, -4.5F, -6F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.22F, -0.5F, 0F, -0.28F, -0.5F, 0F, 0.04F, 0F, 0.1F, -0.54F, 0F, 0.1F, -0.22F, 0F, 0F, -0.28F, 0F, 0F, 0.04F, -0.5F, 0.1F, -0.54F, -0.5F, 0.1F); // Box 495
		bodyModel[434].setRotationPoint(37.35F, -4.5F, -8.6F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.57F, 0F, -0.5F, 0.07F, 0F, -0.5F, 0.13F, 0F, 0F, -0.63F, 0F, 0F, -0.57F, -0.5F, -0.5F, 0.07F, -0.5F, -0.5F, 0.13F, -0.5F, 0F, -0.63F, -0.5F, 0F); // Box 495
		bodyModel[435].setRotationPoint(37.32F, -4.5F, -6F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.49F, 0F, 0F, -0.49F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[436].setRotationPoint(34F, -3F, 4F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0.12F, 0F, -0.5F, 0.12F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.12F, 0F, 0F, 0.12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[437].setRotationPoint(34.5F, -7F, 8F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.04F, 0F, 0.1F, -0.54F, 0F, 0.1F, -0.22F, -0.5F, 0F, -0.28F, -0.5F, 0F, 0.04F, -0.5F, 0.1F, -0.54F, -0.5F, 0.1F, -0.22F, 0F, 0F, -0.28F, 0F, 0F); // Box 444
		bodyModel[438].setRotationPoint(33.65F, -4.5F, 5.6F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[439].setRotationPoint(34.5F, -2F, 7.75F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.13F, 0F, 0F, -0.63F, 0F, 0F, -0.57F, 0F, -0.5F, 0.07F, 0F, -0.5F, 0.13F, -0.5F, 0F, -0.63F, -0.5F, 0F, -0.57F, -0.5F, -0.5F, 0.07F, -0.5F, -0.5F); // Box 446
		bodyModel[440].setRotationPoint(33.68F, -4.5F, 5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.54F, 0F, 0.1F, 0.04F, 0F, 0.1F, -0.28F, -0.5F, 0F, -0.22F, -0.5F, 0F, -0.54F, -0.5F, 0.1F, 0.04F, -0.5F, 0.1F, -0.28F, 0F, 0F, -0.22F, 0F, 0F); // Box 447
		bodyModel[441].setRotationPoint(37.35F, -4.5F, 5.6F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.63F, 0F, 0F, 0.13F, 0F, 0F, 0.07F, 0F, -0.5F, -0.57F, 0F, -0.5F, -0.63F, -0.5F, 0F, 0.13F, -0.5F, 0F, 0.07F, -0.5F, -0.5F, -0.57F, -0.5F, -0.5F); // Box 448
		bodyModel[442].setRotationPoint(37.32F, -4.5F, 5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.13F, 0F, 0F, -0.63F, 0F, 0F, -0.22F, 0F, -0.3F, -0.28F, 0F, -0.3F, 0.13F, -0.5F, 0F, -0.63F, -0.5F, 0F, -0.22F, -0.5F, -0.3F, -0.28F, -0.5F, -0.3F); // Box 438
		bodyModel[443].setRotationPoint(33.68F, -4.5F, 5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.63F, 0F, 0F, 0.13F, 0F, 0F, -0.28F, 0F, -0.3F, -0.22F, 0F, -0.3F, -0.63F, -0.5F, 0F, 0.13F, -0.5F, 0F, -0.28F, -0.5F, -0.3F, -0.22F, -0.5F, -0.3F); // Box 439
		bodyModel[444].setRotationPoint(37.32F, -4.5F, 5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[445].setRotationPoint(34.25F, -2F, 4.25F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.28F, 0F, -0.3F, -0.22F, 0F, -0.3F, -0.63F, 0F, 0F, 0.13F, 0F, 0F, -0.28F, -0.5F, -0.3F, -0.22F, -0.5F, -0.3F, -0.63F, -0.5F, 0F, 0.13F, -0.5F, 0F); // Box 495
		bodyModel[446].setRotationPoint(33.68F, -4.5F, -9F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.22F, 0F, -0.3F, -0.28F, 0F, -0.3F, 0.13F, 0F, 0F, -0.63F, 0F, 0F, -0.22F, -0.5F, -0.3F, -0.28F, -0.5F, -0.3F, 0.13F, -0.5F, 0F, -0.63F, -0.5F, 0F); // Box 495
		bodyModel[447].setRotationPoint(37.32F, -4.5F, -9F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[448].setRotationPoint(34.25F, -2F, -5.25F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F); // Box 492
		bodyModel[449].setRotationPoint(39F, -3F, -9F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.12F, 0F, -0.5F, 0.12F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.12F, 0F, 0F, 0.12F, 0F, 0F); // Box 493
		bodyModel[450].setRotationPoint(39.5F, -7F, -9F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.28F, 0F, -0.3F, -0.22F, 0F, -0.3F, -0.63F, 0F, 0F, 0.13F, 0F, 0F, -0.28F, -0.5F, -0.3F, -0.22F, -0.5F, -0.3F, -0.63F, -0.5F, 0F, 0.13F, -0.5F, 0F); // Box 495
		bodyModel[451].setRotationPoint(38.68F, -4.5F, -9F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.22F, 0F, -0.3F, -0.28F, 0F, -0.3F, 0.13F, 0F, 0F, -0.63F, 0F, 0F, -0.22F, -0.5F, -0.3F, -0.28F, -0.5F, -0.3F, 0.13F, -0.5F, 0F, -0.63F, -0.5F, 0F); // Box 495
		bodyModel[452].setRotationPoint(42.32F, -4.5F, -9F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[453].setRotationPoint(39.5F, -2F, -8.75F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[454].setRotationPoint(39.25F, -2F, -5.25F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.49F, 0F, 0F, -0.49F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 436
		bodyModel[455].setRotationPoint(39F, -3F, 4F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0.12F, 0F, -0.5F, 0.12F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.12F, 0F, 0F, 0.12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyModel[456].setRotationPoint(39.5F, -7F, 8F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.13F, 0F, 0F, -0.63F, 0F, 0F, -0.22F, 0F, -0.3F, -0.28F, 0F, -0.3F, 0.13F, -0.5F, 0F, -0.63F, -0.5F, 0F, -0.22F, -0.5F, -0.3F, -0.28F, -0.5F, -0.3F); // Box 438
		bodyModel[457].setRotationPoint(38.68F, -4.5F, 5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.63F, 0F, 0F, 0.13F, 0F, 0F, -0.28F, 0F, -0.3F, -0.22F, 0F, -0.3F, -0.63F, -0.5F, 0F, 0.13F, -0.5F, 0F, -0.28F, -0.5F, -0.3F, -0.22F, -0.5F, -0.3F); // Box 439
		bodyModel[458].setRotationPoint(42.32F, -4.5F, 5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[459].setRotationPoint(39.5F, -2F, 7.75F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[460].setRotationPoint(39.25F, -2F, 4.25F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F); // Box 492
		bodyModel[461].setRotationPoint(44F, -3F, -9F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.12F, 0F, -0.5F, 0.12F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.12F, 0F, 0F, 0.12F, 0F, 0F); // Box 493
		bodyModel[462].setRotationPoint(44.5F, -7F, -9F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.28F, -0.5F, 0F, -0.22F, -0.5F, 0F, -0.54F, 0F, 0.1F, 0.04F, 0F, 0.1F, -0.28F, 0F, 0F, -0.22F, 0F, 0F, -0.54F, -0.5F, 0.1F, 0.04F, -0.5F, 0.1F); // Box 495
		bodyModel[463].setRotationPoint(43.65F, -4.5F, -8.6F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[464].setRotationPoint(44.5F, -2F, -8.75F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.07F, 0F, -0.5F, -0.57F, 0F, -0.5F, -0.63F, 0F, 0F, 0.13F, 0F, 0F, 0.07F, -0.5F, -0.5F, -0.57F, -0.5F, -0.5F, -0.63F, -0.5F, 0F, 0.13F, -0.5F, 0F); // Box 495
		bodyModel[465].setRotationPoint(43.68F, -4.5F, -6F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.22F, -0.5F, 0F, -0.28F, -0.5F, 0F, 0.04F, 0F, 0.1F, -0.54F, 0F, 0.1F, -0.22F, 0F, 0F, -0.28F, 0F, 0F, 0.04F, -0.5F, 0.1F, -0.54F, -0.5F, 0.1F); // Box 495
		bodyModel[466].setRotationPoint(47.35F, -4.5F, -8.6F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.49F, 0F, 0F, -0.49F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[467].setRotationPoint(44F, -3F, 4F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0.12F, 0F, -0.5F, 0.12F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.12F, 0F, 0F, 0.12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[468].setRotationPoint(44.5F, -7F, 8F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.04F, 0F, 0.1F, -0.54F, 0F, 0.1F, -0.22F, -0.5F, 0F, -0.28F, -0.5F, 0F, 0.04F, -0.5F, 0.1F, -0.54F, -0.5F, 0.1F, -0.22F, 0F, 0F, -0.28F, 0F, 0F); // Box 451
		bodyModel[469].setRotationPoint(43.65F, -4.5F, 5.6F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[470].setRotationPoint(44.5F, -2F, 7.75F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.13F, 0F, 0F, -0.63F, 0F, 0F, -0.57F, 0F, -0.5F, 0.07F, 0F, -0.5F, 0.13F, -0.5F, 0F, -0.63F, -0.5F, 0F, -0.57F, -0.5F, -0.5F, 0.07F, -0.5F, -0.5F); // Box 453
		bodyModel[471].setRotationPoint(43.68F, -4.5F, 5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.54F, 0F, 0.1F, 0.04F, 0F, 0.1F, -0.28F, -0.5F, 0F, -0.22F, -0.5F, 0F, -0.54F, -0.5F, 0.1F, 0.04F, -0.5F, 0.1F, -0.28F, 0F, 0F, -0.22F, 0F, 0F); // Box 454
		bodyModel[472].setRotationPoint(47.35F, -4.5F, 5.6F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.63F, 0F, 0F, 0.13F, 0F, 0F, 0.07F, 0F, -0.5F, -0.57F, 0F, -0.5F, -0.63F, -0.5F, 0F, 0.13F, -0.5F, 0F, 0.07F, -0.5F, -0.5F, -0.57F, -0.5F, -0.5F); // Box 455
		bodyModel[473].setRotationPoint(47.32F, -4.5F, 5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.13F, 0F, 0F, -0.63F, 0F, 0F, -0.22F, 0F, -0.3F, -0.28F, 0F, -0.3F, 0.13F, -0.5F, 0F, -0.63F, -0.5F, 0F, -0.22F, -0.5F, -0.3F, -0.28F, -0.5F, -0.3F); // Box 458
		bodyModel[474].setRotationPoint(43.68F, -4.5F, 5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.63F, 0F, 0F, 0.13F, 0F, 0F, -0.28F, 0F, -0.3F, -0.22F, 0F, -0.3F, -0.63F, -0.5F, 0F, 0.13F, -0.5F, 0F, -0.28F, -0.5F, -0.3F, -0.22F, -0.5F, -0.3F); // Box 459
		bodyModel[475].setRotationPoint(47.32F, -4.5F, 5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[476].setRotationPoint(44.25F, -2F, 4.25F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.28F, 0F, -0.3F, -0.22F, 0F, -0.3F, -0.63F, 0F, 0F, 0.13F, 0F, 0F, -0.28F, -0.5F, -0.3F, -0.22F, -0.5F, -0.3F, -0.63F, -0.5F, 0F, 0.13F, -0.5F, 0F); // Box 495
		bodyModel[477].setRotationPoint(43.68F, -4.5F, -9F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.22F, 0F, -0.3F, -0.28F, 0F, -0.3F, 0.13F, 0F, 0F, -0.63F, 0F, 0F, -0.22F, -0.5F, -0.3F, -0.28F, -0.5F, -0.3F, 0.13F, -0.5F, 0F, -0.63F, -0.5F, 0F); // Box 495
		bodyModel[478].setRotationPoint(47.32F, -4.5F, -9F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[479].setRotationPoint(44.25F, -2F, -5.25F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[480].setRotationPoint(53.5F, 4F, 10.5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[481].setRotationPoint(53.5F, 4F, -11F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F); // Box 492
		bodyModel[482].setRotationPoint(49F, -3F, -9F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.12F, 0F, -0.5F, 0.12F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.12F, 0F, 0F, 0.12F, 0F, 0F); // Box 493
		bodyModel[483].setRotationPoint(49.5F, -7F, -9F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.28F, 0F, -0.3F, -0.22F, 0F, -0.3F, -0.63F, 0F, 0F, 0.13F, 0F, 0F, -0.28F, -0.5F, -0.3F, -0.22F, -0.5F, -0.3F, -0.63F, -0.5F, 0F, 0.13F, -0.5F, 0F); // Box 495
		bodyModel[484].setRotationPoint(48.68F, -4.5F, -9F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.22F, 0F, -0.3F, -0.28F, 0F, -0.3F, 0.13F, 0F, 0F, -0.63F, 0F, 0F, -0.22F, -0.5F, -0.3F, -0.28F, -0.5F, -0.3F, 0.13F, -0.5F, 0F, -0.63F, -0.5F, 0F); // Box 495
		bodyModel[485].setRotationPoint(52.32F, -4.5F, -9F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[486].setRotationPoint(49.5F, -2F, -8.75F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[487].setRotationPoint(49.25F, -2F, -5.25F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.49F, 0F, 0F, -0.49F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 456
		bodyModel[488].setRotationPoint(49F, -3F, 4F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0.12F, 0F, -0.5F, 0.12F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.12F, 0F, 0F, 0.12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[489].setRotationPoint(49.5F, -7F, 8F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.13F, 0F, 0F, -0.63F, 0F, 0F, -0.22F, 0F, -0.3F, -0.28F, 0F, -0.3F, 0.13F, -0.5F, 0F, -0.63F, -0.5F, 0F, -0.22F, -0.5F, -0.3F, -0.28F, -0.5F, -0.3F); // Box 458
		bodyModel[490].setRotationPoint(48.68F, -4.5F, 5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.63F, 0F, 0F, 0.13F, 0F, 0F, -0.28F, 0F, -0.3F, -0.22F, 0F, -0.3F, -0.63F, -0.5F, 0F, 0.13F, -0.5F, 0F, -0.28F, -0.5F, -0.3F, -0.22F, -0.5F, -0.3F); // Box 459
		bodyModel[491].setRotationPoint(52.32F, -4.5F, 5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[492].setRotationPoint(49.25F, -2F, 4.25F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[493].setRotationPoint(49.5F, -2F, 7.75F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 492
		bodyModel[494].setRotationPoint(42F, -5F, -1.5F);

		bodyModel[495].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 492
		bodyModel[495].setRotationPoint(43.5F, -5.5F, 0F);
		bodyModel[495].rotateAngleY = -0.78539816F;

		bodyModel[496].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 492
		bodyModel[496].setRotationPoint(42.5F, 0.5F, -1F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 492
		bodyModel[497].setRotationPoint(50F, -5F, -1.5F);

		bodyModel[498].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 492
		bodyModel[498].setRotationPoint(51.5F, -5.5F, 0F);
		bodyModel[498].rotateAngleY = -0.78539816F;

		bodyModel[499].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 492
		bodyModel[499].setRotationPoint(50.5F, 0.5F, -1F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 359, 301, textureX, textureY); // Box 492
		bodyModel[501] = new ModelRendererTurbo(this, 363, 306, textureX, textureY); // Box 492
		bodyModel[502] = new ModelRendererTurbo(this, 361, 314, textureX, textureY); // Box 492
		bodyModel[503] = new ModelRendererTurbo(this, 208, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[504] = new ModelRendererTurbo(this, 298, 211, textureX, textureY); // Box 128
		bodyModel[505] = new ModelRendererTurbo(this, 311, 211, textureX, textureY,"lamp"); // Box 338 glow
		bodyModel[506] = new ModelRendererTurbo(this, 299, 223, textureX, textureY); // Box 128
		bodyModel[507] = new ModelRendererTurbo(this, 301, 220, textureX, textureY); // Box 563
		bodyModel[508] = new ModelRendererTurbo(this, 428, 302, textureX, textureY); // Box 128
		bodyModel[509] = new ModelRendererTurbo(this, 411, 267, textureX, textureY); // Box 128
		bodyModel[510] = new ModelRendererTurbo(this, 418, 267, textureX, textureY); // Box 177
		bodyModel[511] = new ModelRendererTurbo(this, 426, 281, textureX, textureY); // Box 176
		bodyModel[512] = new ModelRendererTurbo(this, 428, 314, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[513] = new ModelRendererTurbo(this, 411, 274, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[514] = new ModelRendererTurbo(this, 418, 274, textureX, textureY,"lamp"); // Box 177 glow
		bodyModel[515] = new ModelRendererTurbo(this, 426, 290, textureX, textureY,"lamp"); // Box 176 glow
		bodyModel[516] = new ModelRendererTurbo(this, 411, 342, textureX, textureY); // Box 588
		bodyModel[517] = new ModelRendererTurbo(this, 418, 342, textureX, textureY); // Box 589
		bodyModel[518] = new ModelRendererTurbo(this, 426, 326, textureX, textureY); // Box 590
		bodyModel[519] = new ModelRendererTurbo(this, 411, 349, textureX, textureY,"lamp"); // Box 591 glow
		bodyModel[520] = new ModelRendererTurbo(this, 418, 349, textureX, textureY,"lamp"); // Box 592 glow
		bodyModel[521] = new ModelRendererTurbo(this, 426, 335, textureX, textureY,"lamp"); // Box 593 glow
		bodyModel[522] = new ModelRendererTurbo(this, 411, 264, textureX, textureY); // Box 128
		bodyModel[523] = new ModelRendererTurbo(this, 418, 264, textureX, textureY); // Box 177
		bodyModel[524] = new ModelRendererTurbo(this, 428, 294, textureX, textureY); // Box 128
		bodyModel[525] = new ModelRendererTurbo(this, 411, 339, textureX, textureY); // Box 599
		bodyModel[526] = new ModelRendererTurbo(this, 418, 339, textureX, textureY); // Box 600
		bodyModel[527] = new ModelRendererTurbo(this, 426, 321, textureX, textureY); // Box 602
		bodyModel[528] = new ModelRendererTurbo(this, 443, 306, textureX, textureY); // Box 128
		bodyModel[529] = new ModelRendererTurbo(this, 446, 314, textureX, textureY); // Box 128
		bodyModel[530] = new ModelRendererTurbo(this, 447, 324, textureX, textureY); // Box 332
		bodyModel[531] = new ModelRendererTurbo(this, 446, 319, textureX, textureY); // Box 128
		bodyModel[532] = new ModelRendererTurbo(this, 446, 296, textureX, textureY); // Box 610
		bodyModel[533] = new ModelRendererTurbo(this, 307, 309, textureX, textureY); // Box 319
		bodyModel[534] = new ModelRendererTurbo(this, 339, 46, textureX, textureY); // Box 128
		bodyModel[535] = new ModelRendererTurbo(this, 338, 47, textureX, textureY); // Box 614
		bodyModel[536] = new ModelRendererTurbo(this, 331, 66, textureX, textureY); // Box 128
		bodyModel[537] = new ModelRendererTurbo(this, 335, 74, textureX, textureY); // Box 265
		bodyModel[538] = new ModelRendererTurbo(this, 301, 217, textureX, textureY); // Box 128
		bodyModel[539] = new ModelRendererTurbo(this, 335, 79, textureX, textureY); // Box 128
		bodyModel[540] = new ModelRendererTurbo(this, 344, 68, textureX, textureY); // Box 128
		bodyModel[541] = new ModelRendererTurbo(this, 346, 68, textureX, textureY); // Box 128
		bodyModel[542] = new ModelRendererTurbo(this, 346, 73, textureX, textureY); // Box 128
		bodyModel[543] = new ModelRendererTurbo(this, 308, 220, textureX, textureY,"lamp"); // Box 338 glow
		bodyModel[544] = new ModelRendererTurbo(this, 308, 217, textureX, textureY,"lamp"); // Box 338 glow
		bodyModel[545] = new ModelRendererTurbo(this, 302, 228, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[546] = new ModelRendererTurbo(this, 426, 276, textureX, textureY); // Box 582
		bodyModel[547] = new ModelRendererTurbo(this, 446, 301, textureX, textureY); // Box 583
		bodyModel[548] = new ModelRendererTurbo(this, 326, 13, textureX, textureY); // Box 584
		bodyModel[549] = new ModelRendererTurbo(this, 299, 200, textureX, textureY); // Box 586
		bodyModel[550] = new ModelRendererTurbo(this, 301, 205, textureX, textureY); // Box 587
		bodyModel[551] = new ModelRendererTurbo(this, 301, 208, textureX, textureY); // Box 588
		bodyModel[552] = new ModelRendererTurbo(this, 308, 205, textureX, textureY,"lamp"); // Box 589 glow
		bodyModel[553] = new ModelRendererTurbo(this, 308, 208, textureX, textureY,"lamp"); // Box 590 glow
		bodyModel[554] = new ModelRendererTurbo(this, 302, 198, textureX, textureY,"lamp"); // Box 591 glow
		bodyModel[555] = new ModelRendererTurbo(this, 341, 35, textureX, textureY); // Box 592
		bodyModel[556] = new ModelRendererTurbo(this, 335, 18, textureX, textureY); // Box 593
		bodyModel[557] = new ModelRendererTurbo(this, 346, 20, textureX, textureY); // Box 594
		bodyModel[558] = new ModelRendererTurbo(this, 342, 15, textureX, textureY); // Box 595
		bodyModel[559] = new ModelRendererTurbo(this, 326, 18, textureX, textureY); // Box 596
		bodyModel[560] = new ModelRendererTurbo(this, 321, 20, textureX, textureY); // Box 597
		bodyModel[561] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 598
		bodyModel[562] = new ModelRendererTurbo(this, 327, 35, textureX, textureY); // Box 599
		bodyModel[563] = new ModelRendererTurbo(this, 342, 34, textureX, textureY); // Box 600
		bodyModel[564] = new ModelRendererTurbo(this, 334, 29, textureX, textureY); // Box 601
		bodyModel[565] = new ModelRendererTurbo(this, 321, 29, textureX, textureY); // Box 602
		bodyModel[566] = new ModelRendererTurbo(this, 312, 35, textureX, textureY); // Box 603
		bodyModel[567] = new ModelRendererTurbo(this, 308, 29, textureX, textureY); // Box 604
		bodyModel[568] = new ModelRendererTurbo(this, 303, 351, textureX, textureY); // Box 38
		bodyModel[569] = new ModelRendererTurbo(this, 326, 347, textureX, textureY); // Box 38
		bodyModel[570] = new ModelRendererTurbo(this, 317, 347, textureX, textureY); // Box 2
		bodyModel[571] = new ModelRendererTurbo(this, 310, 351, textureX, textureY); // Box 38
		bodyModel[572] = new ModelRendererTurbo(this, 303, 356, textureX, textureY); // Box 609
		bodyModel[573] = new ModelRendererTurbo(this, 317, 352, textureX, textureY); // Box 610
		bodyModel[574] = new ModelRendererTurbo(this, 310, 356, textureX, textureY); // Box 611
		bodyModel[575] = new ModelRendererTurbo(this, 294, 105, textureX, textureY,"lamp"); // marker light red glow
		bodyModel[576] = new ModelRendererTurbo(this, 304, 105, textureX, textureY); // Box 613
		bodyModel[577] = new ModelRendererTurbo(this, 299, 105, textureX, textureY); // Box 614
		bodyModel[578] = new ModelRendererTurbo(this, 296, 152, textureX, textureY); // Box 615
		bodyModel[579] = new ModelRendererTurbo(this, 344, 84, textureX, textureY); // Box 38
		bodyModel[580] = new ModelRendererTurbo(this, 344, 103, textureX, textureY); // Box 618
		bodyModel[581] = new ModelRendererTurbo(this, 360, 54, textureX, textureY,"lamp"); // marker light red glow
		bodyModel[582] = new ModelRendererTurbo(this, 365, 54, textureX, textureY); // marker light green off
		bodyModel[583] = new ModelRendererTurbo(this, 362, 50, textureX, textureY); // Box 38
		bodyModel[584] = new ModelRendererTurbo(this, 365, 39, textureX, textureY,"lamp"); // marker light red glow
		bodyModel[585] = new ModelRendererTurbo(this, 360, 39, textureX, textureY); // marker light green off
		bodyModel[586] = new ModelRendererTurbo(this, 362, 35, textureX, textureY); // Box 607
		bodyModel[587] = new ModelRendererTurbo(this, 369, 51, textureX, textureY); // Box 38
		bodyModel[588] = new ModelRendererTurbo(this, 365, 46, textureX, textureY); // Box 38
		bodyModel[589] = new ModelRendererTurbo(this, 341, 22, textureX, textureY); // Box 610
		bodyModel[590] = new ModelRendererTurbo(this, 326, 23, textureX, textureY); // Box 611
		bodyModel[591] = new ModelRendererTurbo(this, 362, 47, textureX, textureY); // Box 38
		bodyModel[592] = new ModelRendererTurbo(this, 359, 51, textureX, textureY); // Box 38
		bodyModel[593] = new ModelRendererTurbo(this, 359, 49, textureX, textureY); // Box 38
		bodyModel[594] = new ModelRendererTurbo(this, 359, 36, textureX, textureY); // Box 610
		bodyModel[595] = new ModelRendererTurbo(this, 361, 31, textureX, textureY); // Box 611
		bodyModel[596] = new ModelRendererTurbo(this, 366, 32, textureX, textureY); // Box 612
		bodyModel[597] = new ModelRendererTurbo(this, 369, 36, textureX, textureY); // Box 613
		bodyModel[598] = new ModelRendererTurbo(this, 369, 34, textureX, textureY); // Box 614
		bodyModel[599] = new ModelRendererTurbo(this, 377, 35, textureX, textureY); // Right step part
		bodyModel[600] = new ModelRendererTurbo(this, 374, 14, textureX, textureY); // Left step part
		bodyModel[601] = new ModelRendererTurbo(this, 374, 12, textureX, textureY); // Left step part
		bodyModel[602] = new ModelRendererTurbo(this, 388, 14, textureX, textureY); // Left step part
		bodyModel[603] = new ModelRendererTurbo(this, 388, 12, textureX, textureY); // Left step part
		bodyModel[604] = new ModelRendererTurbo(this, 347, 31, textureX, textureY); // Box 620
		bodyModel[605] = new ModelRendererTurbo(this, 346, 63, textureX, textureY); // Box 620
		bodyModel[606] = new ModelRendererTurbo(this, 337, 62, textureX, textureY); // Box 621
		bodyModel[607] = new ModelRendererTurbo(this, 335, 68, textureX, textureY); // Box 622
		bodyModel[608] = new ModelRendererTurbo(this, 315, 66, textureX, textureY); // Box 623
		bodyModel[609] = new ModelRendererTurbo(this, 332, 61, textureX, textureY); // Box 624
		bodyModel[610] = new ModelRendererTurbo(this, 371, 320, textureX, textureY); // Box 495
		bodyModel[611] = new ModelRendererTurbo(this, 447, 293, textureX, textureY); // Box 613
		bodyModel[612] = new ModelRendererTurbo(this, 312, 251, textureX, textureY); // Box 614
		bodyModel[613] = new ModelRendererTurbo(this, 294, 108, textureX, textureY); // marker light red off
		bodyModel[614] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // marker light red off
		bodyModel[615] = new ModelRendererTurbo(this, 360, 57, textureX, textureY); // marker light red off
		bodyModel[616] = new ModelRendererTurbo(this, 365, 57, textureX, textureY,"lamp"); // marker light green glow
		bodyModel[617] = new ModelRendererTurbo(this, 365, 30, textureX, textureY); // marker light red off
		bodyModel[618] = new ModelRendererTurbo(this, 360, 30, textureX, textureY,"lamp"); // marker light green glow

		bodyModel[500].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 492
		bodyModel[500].setRotationPoint(34F, -5F, -1.5F);

		bodyModel[501].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 492
		bodyModel[501].setRotationPoint(35.5F, -5.5F, 0F);
		bodyModel[501].rotateAngleY = -0.78539816F;

		bodyModel[502].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 492
		bodyModel[502].setRotationPoint(34.5F, 0.5F, -1F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[503].setRotationPoint(50.5F, -18F, -1F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.02F, 0F, 0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[504].setRotationPoint(54.5F, -19F, -2F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338 glow
		bodyModel[505].setRotationPoint(56.51F, -18.25F, -2F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, 0F, -0.25F, -0.79F, -1.585F, -2F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0.75F, 0F, -0.25F, 0.75F, -1.585F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[506].setRotationPoint(54.5F, -19F, -6F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.02F, -1F, -0.25F, -0.79F, 0.415F, 0F, -0.8F, 0F, 0F, -0.02F, 0F, 0F, 0F, -1F, -0.25F, 0.75F, 0.415F, 0F, 0.75F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[507].setRotationPoint(54.5F, -19F, -4F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[508].setRotationPoint(58.5F, -16F, -3F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.45F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.45F, 0F, -0.85F, 0F, 0F, 0F); // Box 128
		bodyModel[509].setRotationPoint(54.5F, -16F, 9F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, -1.45F, 0F, 2.5F, -0.6F, 0F, -2.85F, -0.55F, 0F, -0.15F, 0F, 0F, 0F, -1.45F, 0F, 2.5F, -0.6F, 0F, -2.85F, -0.55F, 0F, -0.15F); // Box 177
		bodyModel[510].setRotationPoint(56.4F, -16F, 8.3F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-1F, 0F, 0F, 0.9F, 0F, 0F, 0.3F, 0F, 0.45F, -0.45F, 0F, -0.2F, -1F, 0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0.45F, -0.45F, 0F, -0.2F); // Box 176
		bodyModel[511].setRotationPoint(57.5F, -16F, 3F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[512].setRotationPoint(58.5F, -10.99F, -3F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.45F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.45F, 0F, -0.85F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[513].setRotationPoint(54.5F, -10.99F, 9F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, -1.45F, 0F, 2.5F, -0.6F, 0F, -2.85F, -0.55F, 0F, -0.15F, 0F, 0F, 0F, -1.45F, 0F, 2.5F, -0.6F, 0F, -2.85F, -0.55F, 0F, -0.15F); // Box 177 glow
		bodyModel[514].setRotationPoint(56.4F, -10.99F, 8.3F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-1F, 0F, 0F, 0.9F, 0F, 0F, 0.3F, 0F, 0.45F, -0.45F, 0F, -0.2F, -1F, 0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0.45F, -0.45F, 0F, -0.2F); // Box 176 glow
		bodyModel[515].setRotationPoint(57.5F, -10.99F, 3F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0.45F, 0F, -0.85F, -0.1F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0F, -0.85F, -0.1F, 0F, 0.7F, 0F, 0F, 0F); // Box 588
		bodyModel[516].setRotationPoint(54.5F, -16F, -10F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-0.55F, 0F, -0.15F, -0.6F, 0F, -2.85F, -1.45F, 0F, 2.5F, 0F, 0F, 0F, -0.55F, 0F, -0.15F, -0.6F, 0F, -2.85F, -1.45F, 0F, 2.5F, 0F, 0F, 0F); // Box 589
		bodyModel[517].setRotationPoint(56.4F, -16F, -9.3F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.45F, 0F, -0.2F, 0.3F, 0F, 0.45F, 0.9F, 0F, 0F, -1F, 0F, 0F, -0.45F, 0F, -0.2F, 0.3F, 0F, 0.45F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 590
		bodyModel[518].setRotationPoint(57.5F, -16F, -6F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0.45F, 0F, -0.85F, -0.1F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0F, -0.85F, -0.1F, 0F, 0.7F, 0F, 0F, 0F); // Box 591 glow
		bodyModel[519].setRotationPoint(54.5F, -10.99F, -10F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.55F, 0F, -0.15F, -0.6F, 0F, -2.85F, -1.45F, 0F, 2.5F, 0F, 0F, 0F, -0.55F, 0F, -0.15F, -0.6F, 0F, -2.85F, -1.45F, 0F, 2.5F, 0F, 0F, 0F); // Box 592 glow
		bodyModel[520].setRotationPoint(56.4F, -10.99F, -9.3F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-0.45F, 0F, -0.2F, 0.3F, 0F, 0.45F, 0.9F, 0F, 0F, -1F, 0F, 0F, -0.45F, 0F, -0.2F, 0.3F, 0F, 0.45F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 593 glow
		bodyModel[521].setRotationPoint(57.5F, -10.99F, -6F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.45F, -0.85F, -0.85F, 0F, -0.85F, 0F, 0F, -0.15F, 0F, -0.1F, -0.15F, 0.7F, 0.45F, -0.15F, -0.85F, 0F, -0.15F, 0F); // Box 128
		bodyModel[522].setRotationPoint(54.5F, -16.85F, 9F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1.45F, 0F, 2.5F, -0.6F, -0.85F, -2.85F, -0.55F, -0.85F, -0.15F, 0F, -0.15F, 0F, -1.45F, -0.15F, 2.5F, -0.6F, -0.15F, -2.85F, -0.55F, -0.15F, -0.15F); // Box 177
		bodyModel[523].setRotationPoint(56.4F, -16.85F, 8.3F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.15F, 0F, -0.1F, -0.85F, 0F, -0.1F, -0.85F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.1F, -0.15F, 0F, -0.1F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 128
		bodyModel[524].setRotationPoint(58.5F, -16.85F, -3F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.85F, 0F, 0.45F, -0.85F, -0.85F, -0.1F, 0F, 0.7F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0.45F, -0.15F, -0.85F, -0.1F, -0.15F, 0.7F, 0F, -0.15F, 0F); // Box 599
		bodyModel[525].setRotationPoint(54.5F, -16.85F, -10F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.55F, -0.85F, -0.15F, -0.6F, -0.85F, -2.85F, -1.45F, 0F, 2.5F, 0F, 0F, 0F, -0.55F, -0.15F, -0.15F, -0.6F, -0.15F, -2.85F, -1.45F, -0.15F, 2.5F, 0F, -0.15F, 0F); // Box 600
		bodyModel[526].setRotationPoint(56.4F, -16.85F, -9.3F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.45F, 0F, -0.2F, 0.3F, -0.85F, 0.45F, 0.9F, -0.85F, 0F, -1F, -0.15F, 0F, -0.45F, -0.15F, -0.2F, 0.3F, -0.15F, 0.45F, 0.9F, -0.15F, 0F, -1F, -0.15F, 0F); // Box 602
		bodyModel[527].setRotationPoint(57.5F, -16.85F, -6F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[528].setRotationPoint(57.5F, -17.45F, -3F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.35F, 0F, -0.85F, -0.55F, -0.6F, -0.2F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0.35F, -1F, -0.85F, -0.55F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[529].setRotationPoint(57.5F, -17.45F, -6F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.14F, 0F, -0.1F, -0.5F, -0.7F, -0.95F, 0.2F, 0.95F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.1F, 0.2F, -0.7F, -0.9F, -1F, 0.95F, 0F, -0.975F, 0F); // Box 332
		bodyModel[530].setRotationPoint(54.5F, -17.45F, -9F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.4F, 0F, -0.95F, -0.6F, -0.6F, 0.3F, 0.95F, -0.6F, -0.8F, -1.15F, 0F, -0.15F, 0.4F, -1F, -0.95F, -0.6F, 0.2F, 0.3F, 0.95F, 0.2F, -0.8F, -1.15F, -1F, -0.15F); // Box 128
		bodyModel[531].setRotationPoint(56F, -17.45F, -8F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1.15F, 0F, -0.15F, 0.95F, -0.6F, -0.8F, -0.6F, -0.6F, 0.3F, 0.4F, 0F, -0.95F, -1.15F, -1F, -0.15F, 0.95F, 0.2F, -0.8F, -0.6F, 0.2F, 0.3F, 0.4F, -1F, -0.95F); // Box 610
		bodyModel[532].setRotationPoint(56F, -17.45F, 5F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 319
		bodyModel[533].setRotationPoint(31.5F, -18.25F, -7F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.98F, 0F, 0F, 0.51F, 0F, 0F, 0.51F, 0F, 0F, -0.98F, 0F); // Box 128
		bodyModel[534].setRotationPoint(54.5F, -19F, -2F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.985F, 0F, 0.65F, -1.435F, 0F, 1F, -1.51F, 0F, -0.5F, -0.95F, 0F, -0.5F, -0.015F, 0F, 0F, 0.55F, 0F, 0F, 0.55F, 0F, -0.5F, -0.05F, 0F); // Box 614
		bodyModel[535].setRotationPoint(56.5F, -19F, -3F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.85F, -0.955F, 1.74F, -1.15F, -1.26F, 2.3F, -0.35F, -1.435F, -2F, 0.5F, -0.985F, -2F, 0.85F, -1.045F, 1.74F, -1.35F, -0.45F, 2.15F, -1F, -0.45F, -2F, 0.5F, -1.015F, -2F); // Box 128
		bodyModel[536].setRotationPoint(57.5F, -19F, -3F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.35F, -1F, 0.35F, -0.95F, -1.35F, 1.05F, 0.85F, -1.27F, -2.3F, -1.15F, -0.955F, -1.74F, 0.35F, 0F, 0.35F, -0.9F, 0.55F, 1.05F, 0.65F, 0.55F, -2.15F, -1.15F, -0.045F, -1.74F); // Box 265
		bodyModel[537].setRotationPoint(55.5F, -19F, -6F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.02F, 0F, 0F, -0.8F, 0F, 0F, -0.765F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[538].setRotationPoint(54.5F, -19F, -3F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.35F, 0F, 0.05F, -1.35F, -0.95F, -0.35F, -1F, 0.65F, 0F, -1F, 0F, 0F, 0.585F, 0F, 0.1F, 0.55F, -0.95F, -0.35F, 0F, 0.65F, 0F, 0F, 0F); // Box 128
		bodyModel[539].setRotationPoint(54.5F, -19F, -8F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.35F, 0.065F, 0F, -1.35F, -0.535F, 0F, -1F, -0.8F, 0F, 0F, -0.01F, 0F, 1F, -0.95F, 0F, -1.35F, -0.465F, 0F, -1F, -0.2F, 0F, 1F, -0.95F, 0F); // Box 128
		bodyModel[540].setRotationPoint(58.5F, -17.5F, -3F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,1.15F, 0.24F, -0.7F, -2.15F, -0.2F, -0.7F, -1.35F, -0.535F, 0F, 0.35F, 0.065F, 0F, 1.35F, -0.95F, -0.85F, -2.15F, -0.8F, -0.7F, -1.35F, -0.465F, 0F, 1F, -0.95F, 0F); // Box 128
		bodyModel[541].setRotationPoint(58.5F, -17.5F, -6F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.45F, 0.2F, -0.95F, -0.6F, -0.5F, 0.3F, 0.95F, -0.25F, -0.8F, -1.35F, 0.28F, -0.3F, 0.4F, -1F, -0.95F, -0.6F, -0.4F, 0.3F, 0.95F, -0.4F, -0.8F, -1.15F, -1F, -0.15F); // Box 128
		bodyModel[542].setRotationPoint(56F, -17.45F, -8F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.25F, -0.04F, 0.005F, -0.25F, -0.04F, 0.005F, 0F, -0.05F, 0.42F, 0F, -0.05F, 0.42F, 0.25F, 0F, 0.005F, -0.25F, 0F, 0.005F, 0F, 0F, 0.42F, 0F, 0F, 0.42F); // Box 338 glow
		bodyModel[543].setRotationPoint(56.51F, -18.25F, -4.42F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338 glow
		bodyModel[544].setRotationPoint(56.51F, -18.25F, -3F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -0.24F, -0.04F, -1.585F, -0.24F, -0.04F, 1.585F, 0F, 0F, 0F, 0F, 0F, 0F, -0.24F, 0F, -1.585F, -0.24F, 0F, 1.585F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[545].setRotationPoint(54.5F, -18.25F, -6.01F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -0.15F, 0F, 0.9F, -0.85F, 0F, 0.3F, -0.85F, 0.45F, -0.45F, 0F, -0.2F, -1F, -0.15F, 0F, 0.9F, -0.15F, 0F, 0.3F, -0.15F, 0.45F, -0.45F, -0.15F, -0.2F); // Box 582
		bodyModel[546].setRotationPoint(57.5F, -16.85F, 3F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, -0.55F, -0.6F, -0.2F, 0.35F, 0F, -0.85F, 0F, -1F, 0F, 0F, 0.2F, 0F, -0.55F, 0.2F, -0.2F, 0.35F, -1F, -0.85F); // Box 583
		bodyModel[547].setRotationPoint(57.5F, -17.45F, 3F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1.35F, 0.28F, -0.3F, 0.95F, -0.25F, -0.8F, -0.6F, -0.5F, 0.3F, 0.45F, 0.2F, -0.95F, -1.15F, -1F, -0.15F, 0.95F, -0.4F, -0.8F, -0.6F, -0.4F, 0.3F, 0.4F, -1F, -0.95F); // Box 584
		bodyModel[548].setRotationPoint(56F, -17.45F, 5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.02F, 0F, -2F, -0.02F, 0F, -0.25F, -0.79F, -1.585F, 0F, -0.75F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0.75F, -1.585F, 0F, 0.75F, 0F); // Box 586
		bodyModel[549].setRotationPoint(54.5F, -19F, 3F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.02F, 0F, 0F, -0.8F, 0F, -0.25F, -0.79F, 0.415F, 0F, -0.02F, -1F, 0F, 0F, 0F, 0F, 0.75F, 0F, -0.25F, 0.75F, 0.415F, 0F, 0F, -1F); // Box 587
		bodyModel[550].setRotationPoint(54.5F, -19F, 3F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.02F, 0F, 0F, -0.765F, 0F, 0F, -0.8F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[551].setRotationPoint(54.5F, -19F, 2F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.05F, 0.42F, 0F, -0.05F, 0.42F, -0.25F, -0.04F, 0.005F, 0.25F, -0.04F, 0.005F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, -0.25F, 0F, 0.005F, 0.25F, 0F, 0.005F); // Box 589 glow
		bodyModel[552].setRotationPoint(56.51F, -18.25F, 3.42F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590 glow
		bodyModel[553].setRotationPoint(56.51F, -18.25F, 2F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -0.24F, -0.04F, 1.585F, -0.24F, -0.04F, -1.585F, 0F, 0F, 0F, 0F, 0F, 0F, -0.24F, 0F, 1.585F, -0.24F, 0F, -1.585F, 0F, 0F, 0F); // Box 591 glow
		bodyModel[554].setRotationPoint(54.5F, -18.25F, 6.01F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.95F, 0F, 1F, -1.51F, 0F, 0.65F, -1.435F, 0F, -0.5F, -0.985F, 0F, -0.5F, -0.05F, 0F, 0F, 0.55F, 0F, 0F, 0.55F, 0F, -0.5F, -0.015F, 0F); // Box 592
		bodyModel[555].setRotationPoint(56.5F, -19F, 2F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.5F, -0.985F, -2F, -0.35F, -1.435F, -2F, -1.15F, -1.26F, 2.3F, 0.85F, -0.955F, 1.74F, 0.5F, -1.015F, -2F, -1F, -0.45F, -2F, -1.35F, -0.45F, 2.15F, 0.85F, -1.045F, 1.74F); // Box 593
		bodyModel[556].setRotationPoint(57.5F, -19F, 1F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.01F, 0F, -1F, -0.8F, 0F, -1.35F, -0.535F, 0F, 0.35F, 0.065F, 0F, 1F, -0.95F, 0F, -1F, -0.2F, 0F, -1.35F, -0.465F, 0F, 1F, -0.95F, 0F); // Box 594
		bodyModel[557].setRotationPoint(58.5F, -17.5F, 2F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.35F, 0.065F, 0F, -1.35F, -0.535F, 0F, -2.15F, -0.2F, -0.7F, 1.15F, 0.24F, -0.7F, 1F, -0.95F, 0F, -1.35F, -0.465F, 0F, -2.15F, -0.8F, -0.7F, 1.35F, -0.95F, -0.85F); // Box 595
		bodyModel[558].setRotationPoint(58.5F, -17.5F, 3F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1.15F, -0.955F, -1.74F, 0.85F, -1.27F, -2.3F, -0.95F, -1.35F, 1.05F, 0.35F, -1F, 0.35F, -1.15F, -0.045F, -1.74F, 0.65F, 0.55F, -2.15F, -0.9F, 0.55F, 1.05F, 0.35F, 0F, 0.35F); // Box 596
		bodyModel[559].setRotationPoint(55.5F, -19F, 3F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.35F, -1F, 0.65F, 0.05F, -1.35F, -0.95F, 0F, -1.35F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0.65F, 0.1F, 0.55F, -0.95F, 0F, 0.585F, 0F); // Box 597
		bodyModel[560].setRotationPoint(54.5F, -19F, 7F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, -0.98F, 0F, 0F, 0.51F, 0F, 0F, 0.51F, -1F, 0F, -0.99F, 0F); // Box 598
		bodyModel[561].setRotationPoint(54.5F, -19F, 2F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -3F, 0F, -1.5F, -2F, -1.15F, -1.25F, 2.3F, 0F, 0F, 0F, 0F, -0.99F, -3F, 0F, 0.51F, -2F, -1.15F, 0.27F, 2.3F, 0F, -0.99F, 0F); // Box 599
		bodyModel[562].setRotationPoint(54.5F, -19F, 0F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.25F, 0F, -1F, -1.5F, 0F, -1.7F, -1.25F, 0.45F, 1.15F, 0F, -0.7F, 0F, -0.1F, 0F, -1F, 0.75F, 0F, -1.7F, 0.55F, 0.45F, 1.15F, -0.55F, -0.7F); // Box 600
		bodyModel[563].setRotationPoint(58.5F, -17.75F, 2F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.4F, 0.75F, 0.85F, -2.6F, 0.75F, 0.85F, -1.15F, -0.5F, -2.7F, 0F, -0.25F, 0F, -0.4F, -1.3F, 0.85F, -2.6F, -1.3F, 0.85F, -1.15F, -0.2F, -2.7F, 0F, -0.49F, 0F); // Box 601
		bodyModel[564].setRotationPoint(56.95F, -17F, 6.15F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,2.45F, 1.25F, -0.85F, -2.6F, 0.75F, 0.85F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 2.45F, -2F, -0.85F, -2.6F, -1.73F, 0.845F, -3F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 602
		bodyModel[565].setRotationPoint(56.95F, -17F, 6.15F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -3F, -1.15F, -1.25F, -5.3F, -4F, -0.75F, 4F, 0.01F, 0F, 0F, 0F, -0.99F, -3F, -1.15F, 0.27F, -5.3F, -4F, 0F, 4F, 0.01F, -0.99F, 0F); // Box 603
		bodyModel[566].setRotationPoint(54.5F, -19F, 0F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 1.25F, 0F, -3F, 1.25F, 0F, -0.55F, -0.25F, -0.85F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -0.55F, -0.49F, -0.85F, 0F, -0.96F, 0F); // Box 604
		bodyModel[567].setRotationPoint(54.5F, -17F, 7F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, -0.15F, -0.55F, 0F, -1F, -0.55F, 0F, 1F, 0F, 0F, 0.15F, 0F, 0F, -0.15F, -0.55F, 0F, -1F, -0.55F, 0F, 1F, 0F, 0F, 0.15F); // Box 38
		bodyModel[568].setRotationPoint(54.5F, -10F, -10.05F);

		bodyModel[569].addBox(0F, 0F, 0F, 0, 4, 6, 0F); // Box 38
		bodyModel[569].setRotationPoint(59.4F, -10F, -3F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,-0.3F, 0F, -0.55F, 0.3F, 0F, -0.55F, 1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, -0.55F, 0.3F, 0F, -0.55F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[570].setRotationPoint(58.4F, -10F, -7F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0F, -1.25F, 0F, -2.6F, -1.25F, 0F, 2.6F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -2.6F, -1.25F, 0F, 2.6F, 0F, 0F, 0F); // Box 38
		bodyModel[571].setRotationPoint(56.95F, -10F, -9.05F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0.15F, -0.55F, 0F, 1F, -0.55F, 0F, -1F, 0F, 0F, -0.15F, 0F, 0F, 0.15F, -0.55F, 0F, 1F, -0.55F, 0F, -1F, 0F, 0F, -0.15F); // Box 609
		bodyModel[572].setRotationPoint(54.5F, -10F, 10.05F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0.3F, 0F, -0.55F, -0.3F, 0F, -0.55F, -1F, 0F, 0F, 1F, 0F, 0F, 0.3F, 0F, -0.55F, -0.3F, 0F, -0.55F); // Box 610
		bodyModel[573].setRotationPoint(58.4F, -10F, 3F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0F, -1.25F, 0F, 2.6F, -1.25F, 0F, -2.6F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 2.6F, -1.25F, 0F, -2.6F, 0F, 0F, 0F); // Box 611
		bodyModel[574].setRotationPoint(56.95F, -10F, 9.05F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.475F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.475F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.875F, -0.5F, 0F); // marker light red glow
		bodyModel[575].setRotationPoint(52.45F, -13.75F, 10.6F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -0.3F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.05F, -0.3F); // Box 613
		bodyModel[576].setRotationPoint(53.5F, -14.1F, 11F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.45F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, -0.45F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.05F, -0.3F, -1F, -1.05F, -0.3F); // Box 614
		bodyModel[577].setRotationPoint(52.5F, -14.1F, 11F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.285F, 0F, 0F, -0.285F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.285F, 0F, 0F, -0.285F, 0F, 0F, 0F, 0F, 0F); // Box 615
		bodyModel[578].setRotationPoint(54.5F, 6F, 10.25F);
		bodyModel[578].rotateAngleY = -0.33161256F;

		bodyModel[579].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.25F, 0F, 0F, 0.2F, 0F, -1.39F, -0.63F, 0F, 0.95F, 0.3F, 0F, -0.05F, -0.25F, 0F, 0F, 0.2F, 0F, -1.39F, -0.63F, 0F, 0.95F, 0.3F, 0F, -0.05F); // Box 38
		bodyModel[579].setRotationPoint(57.8F, -2F, -10.95F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0.3F, 0F, -0.05F, -0.63F, 0F, 0.95F, 0.2F, 0F, -1.39F, -0.25F, 0F, 0F, 0.3F, 0F, -0.05F, -0.63F, 0F, 0.95F, 0.2F, 0F, -1.39F, -0.25F, 0F, 0F); // Box 618
		bodyModel[580].setRotationPoint(57.8F, -2F, 9.95F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, -0.75F, -0.375F, 0.125F, -0.75F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // marker light red glow
		bodyModel[581].setRotationPoint(59.66F, -14.25F, -6.77F);
		bodyModel[581].rotateAngleY = -0.2443461F;

		bodyModel[582].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, -0.75F, -0.375F, 0.125F, -0.75F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // marker light green off
		bodyModel[582].setRotationPoint(59.92F, -14.25F, -5.75F);
		bodyModel[582].rotateAngleY = -0.2443461F;

		bodyModel[583].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.01F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.06F, 0.16F, 0F, 0.06F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.06F, 0F, 0F, 0.06F); // Box 38
		bodyModel[583].setRotationPoint(59.36F, -14.5F, -6.96F);
		bodyModel[583].rotateAngleY = -0.2443461F;

		bodyModel[584].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, -0.375F, -0.75F, 0.125F, -0.375F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.375F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0F, -0.375F, 0.125F); // marker light red glow
		bodyModel[584].setRotationPoint(59.9F, -14.25F, 5.81F);
		bodyModel[584].rotateAngleY = 0.2443461F;

		bodyModel[585].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, -0.375F, -0.75F, 0.125F, -0.375F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.375F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0F, -0.375F, 0.125F); // marker light green off
		bodyModel[585].setRotationPoint(60.14F, -14.25F, 4.85F);
		bodyModel[585].rotateAngleY = 0.2443461F;

		bodyModel[586].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.16F, 0F, 0.05F, -0.75F, 0F, 0.05F, -0.75F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0.05F, -0.75F, 0F, 0.05F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 607
		bodyModel[586].setRotationPoint(59.84F, -14.5F, 5.02F);
		bodyModel[586].rotateAngleY = 0.2443461F;

		bodyModel[587].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.28F, 0F, -0.075F, -0.28F, 0F, -0.075F, -0.22F, 0F, -0.425F, 0.22F, 0F, -0.425F, -0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F); // Box 38
		bodyModel[587].setRotationPoint(60.01F, -14.5F, -5F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0.15F, 0F, -0.175F, -0.15F, 0F, -0.175F, 0.15F, 0F, 0.06F, -0.15F, 0F, 0.06F, 0F, -0.5F, -0.08F, 0F, -0.5F, -0.08F, 0.32F, -0.5F, 0.06F, -0.32F, -0.5F, 0.06F); // Box 38
		bodyModel[588].setRotationPoint(59.4F, -15F, -6.98F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 1F, -0.615F, -1.5F, 0.615F, -0.65F, -1.5F, -1F, 0.155F, -0.195F, -1F, 0F, -0.5F, 0.6F, -0.625F, -0.5F, 0.61F, -0.65F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 610
		bodyModel[589].setRotationPoint(59.5F, -16.5F, 3F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.845F, -0.195F, 0F, -0.65F, -1.5F, 0F, -1.25F, -1.5F, -0.2F, -0.3F, 0F, -0.55F, -1F, 0.5F, 0F, -0.65F, 0.5F, 0F, -1.25F, 0.5F, -0.2F, -0.3F, 0.5F, -0.55F); // Box 611
		bodyModel[590].setRotationPoint(58.5F, -16.5F, 3F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.24F, 0F, 0F, -0.24F, 0F, 0F, -0.15F, 0F, -0.83F, 0.15F, 0F, -0.83F, 0.05F, -0.5F, -0.01F, -0.05F, -0.5F, -0.01F, 0F, -0.5F, -0.93F, 0F, -0.5F, -0.93F); // Box 38
		bodyModel[591].setRotationPoint(59.4F, -15F, -6.97F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.34F, -0.33F, 0F, -0.34F, -0.33F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.34F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[592].setRotationPoint(59.51F, -14.5F, -7.5F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.43F, 0F, -0.045F, -0.43F, 0F, -0.045F, -0.16F, 0F, -0.455F, 0.16F, 0F, -0.455F, 0.34F, -0.67F, 0F, -0.34F, -0.67F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38
		bodyModel[593].setRotationPoint(59.51F, -14.5F, -7.5F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.22F, 0F, -0.425F, -0.22F, 0F, -0.425F, -0.28F, 0F, -0.075F, 0.28F, 0F, -0.075F, -0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 610
		bodyModel[594].setRotationPoint(60.01F, -14.5F, 4F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-0.15F, 0F, 0.06F, 0.15F, 0F, 0.06F, -0.15F, 0F, -0.175F, 0.15F, 0F, -0.175F, -0.32F, -0.5F, 0.06F, 0.32F, -0.5F, 0.06F, 0F, -0.5F, -0.08F, 0F, -0.5F, -0.08F); // Box 611
		bodyModel[595].setRotationPoint(59.4F, -15F, 4.98F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.15F, 0F, -0.83F, -0.15F, 0F, -0.83F, -0.24F, 0F, 0F, 0.24F, 0F, 0F, 0F, -0.5F, -0.93F, 0F, -0.5F, -0.93F, -0.05F, -0.5F, -0.01F, 0.05F, -0.5F, -0.01F); // Box 612
		bodyModel[596].setRotationPoint(59.4F, -15F, 5.97F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.34F, -0.33F, 0F, 0.34F, -0.33F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.34F, 0F, 0F, 0.34F, 0F, 0F); // Box 613
		bodyModel[597].setRotationPoint(59.51F, -14.5F, 6.5F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.16F, 0F, -0.455F, -0.16F, 0F, -0.455F, -0.43F, 0F, -0.045F, 0.43F, 0F, -0.045F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.34F, -0.67F, 0F, 0.34F, -0.67F, 0F); // Box 614
		bodyModel[598].setRotationPoint(59.51F, -14.5F, 6.5F);

		bodyModel[599].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[599].setRotationPoint(-59.49F, 4F, 8F);

		bodyModel[600].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[600].setRotationPoint(-59.49F, 4F, -8F);

		bodyModel[601].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[601].setRotationPoint(-59.49F, 4F, -8F);

		bodyModel[602].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[602].setRotationPoint(-55.51F, 4F, -8F);

		bodyModel[603].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[603].setRotationPoint(-55.51F, 4F, -8F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1.25F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 1.25F, -1F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 1F, 0F); // Box 620
		bodyModel[604].setRotationPoint(59.5F, -15F, 2F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.35F, 1.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, 0F, -0.3825F, 1.5F, 0.615F, 0F, -2.5F, -1F, -2F, -0.5F, -1F, -2F, -0.5F, 0F, 0F, -2.5F, 0.6F); // Box 620
		bodyModel[605].setRotationPoint(59.5F, -13.5F, -4F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.75F, 0F, 0.3F, -1F, -1F, 0.5F, 0F, -2F, -0.5F, -1.35F, 0F, -0.5F, -0.3F, -1F, -0.05F, -1.7F, 0F, -0.05F, -1F, 1F, -0.5F, -1F, -1F, -0.5F); // Box 621
		bodyModel[606].setRotationPoint(58.5F, -15F, -6.5F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, 0F, -0.55F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, -1F, 0F, -0.3F, 0F, -0.55F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 622
		bodyModel[607].setRotationPoint(58.5F, -14F, -7F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.55F, 0.5F, -0.15F, -0.45F, -0.5F, -3.15F, -1.125F, -0.5F, 2.7F, 0F, 0.5F, 0F, -0.55F, -0.5F, -0.15F, -0.45F, -0.5F, -3.15F, -1.15F, -0.5F, 2.7F, 0F, -0.5F, 0F); // Box 623
		bodyModel[608].setRotationPoint(56.95F, -14.5F, -10.15F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.55F, 0F, -0.15F, -0.45F, -1F, -3.15F, -0.7F, 0F, 2.35F, -0.55F, 0F, -0.85F, 0F, -1F, -1F, -1.15F, 0F, -3.7F, -1.15F, -1F, 2.7F, 0F, -1F, 0F); // Box 624
		bodyModel[609].setRotationPoint(56.95F, -15F, -10.15F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.57F, 0F, -0.5F, 0.07F, 0F, -0.5F, 0.13F, 0F, 0F, -0.63F, 0F, 0F, -0.57F, -0.5F, -0.5F, 0.07F, -0.5F, -0.5F, 0.13F, -0.5F, 0F, -0.63F, -0.5F, 0F); // Box 495
		bodyModel[610].setRotationPoint(47.32F, -4.5F, -6F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.2F, 0F, -0.95F, 0.2F, 0.95F, -0.1F, -0.5F, -0.7F, 0F, -0.14F, 0F, 0F, -0.975F, 0F, -0.9F, -1F, 0.95F, -0.1F, 0.2F, -0.7F, 0F, 0.2F, 0F); // Box 613
		bodyModel[611].setRotationPoint(54.5F, -17.45F, 8F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.98F, 0F, 0F, -0.98F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 614
		bodyModel[612].setRotationPoint(32.5F, -17.45F, 8F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.475F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.475F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.875F, -0.5F, 0F); // marker light red off
		bodyModel[613].setRotationPoint(52.45F, -13.75F, 10.6F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.475F, 0F, -0.5F, -0.875F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.475F, -0.5F, -0.5F); // marker light red off
		bodyModel[614].setRotationPoint(52.45F, -13.75F, -11.6F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, -0.75F, -0.375F, 0.125F, -0.75F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // marker light red off
		bodyModel[615].setRotationPoint(59.66F, -14.25F, -6.77F);
		bodyModel[615].rotateAngleY = -0.2443461F;

		bodyModel[616].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, -0.75F, -0.375F, 0.125F, -0.75F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // marker light green glow
		bodyModel[616].setRotationPoint(59.92F, -14.25F, -5.75F);
		bodyModel[616].rotateAngleY = -0.2443461F;

		bodyModel[617].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, -0.375F, -0.75F, 0.125F, -0.375F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.375F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0F, -0.375F, 0.125F); // marker light red off
		bodyModel[617].setRotationPoint(59.9F, -14.25F, 5.81F);
		bodyModel[617].rotateAngleY = 0.2443461F;

		bodyModel[618].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, -0.375F, -0.75F, 0.125F, -0.375F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.375F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0F, -0.375F, 0.125F); // marker light green glow
		bodyModel[618].setRotationPoint(60.14F, -14.25F, 4.85F);
		bodyModel[618].rotateAngleY = 0.2443461F;
	}
	ModelPS_Truck_41GT bogie1 = new ModelPS_Truck_41GT();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 619; i++)
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
		if(GetColor(entity)==4 || GetColor(entity)==6 || GetColor(entity)==8 || GetColor(entity)==7 || GetColor(entity)==12 || GetColor(entity)==15){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-GT_truck_RDGBlue.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.69, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-5.44, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if(GetColor(entity)==123456){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-GT_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.69, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-5.44, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-GT_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.69, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-5.44, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}