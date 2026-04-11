//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck_41CDO;
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

public class ModelBuddCNCoach extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBuddCNCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[630];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 176, 155, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 176, 162, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 201, 168, textureX, textureY); // Box 41
		bodyModel[6] = new ModelRendererTurbo(this, 198, 169, textureX, textureY); // Box 41
		bodyModel[7] = new ModelRendererTurbo(this, 216, 169, textureX, textureY); // Box 41
		bodyModel[8] = new ModelRendererTurbo(this, 167, 155, textureX, textureY); // Box 283
		bodyModel[9] = new ModelRendererTurbo(this, 171, 168, textureX, textureY); // Box 283
		bodyModel[10] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 60, 123, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 74, 151, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[13] = new ModelRendererTurbo(this, 74, 148, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 74, 141, textureX, textureY,"cull"); // Box 30 cull
		bodyModel[16] = new ModelRendererTurbo(this, 74, 138, textureX, textureY); // Box 31
		bodyModel[17] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[18] = new ModelRendererTurbo(this, 69, 148, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 69, 151, textureX, textureY); // Box 2
		bodyModel[20] = new ModelRendererTurbo(this, 69, 141, textureX, textureY); // Box 192
		bodyModel[21] = new ModelRendererTurbo(this, 340, 104, textureX, textureY); // Box 2
		bodyModel[22] = new ModelRendererTurbo(this, 310, 116, textureX, textureY); // Box 2
		bodyModel[23] = new ModelRendererTurbo(this, 349, 117, textureX, textureY); // Box 2
		bodyModel[24] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[25] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[26] = new ModelRendererTurbo(this, 272, 148, textureX, textureY); // Box 2
		bodyModel[27] = new ModelRendererTurbo(this, 272, 151, textureX, textureY); // Box 2
		bodyModel[28] = new ModelRendererTurbo(this, 260, 151, textureX, textureY); // Box 2
		bodyModel[29] = new ModelRendererTurbo(this, 253, 151, textureX, textureY); // Box 2
		bodyModel[30] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 24
		bodyModel[31] = new ModelRendererTurbo(this, 272, 141, textureX, textureY); // Box 25
		bodyModel[32] = new ModelRendererTurbo(this, 260, 141, textureX, textureY); // Box 27
		bodyModel[33] = new ModelRendererTurbo(this, 253, 141, textureX, textureY); // Box 29
		bodyModel[34] = new ModelRendererTurbo(this, 260, 148, textureX, textureY); // Box 2
		bodyModel[35] = new ModelRendererTurbo(this, 277, 148, textureX, textureY); // Box 2
		bodyModel[36] = new ModelRendererTurbo(this, 277, 151, textureX, textureY); // Box 2
		bodyModel[37] = new ModelRendererTurbo(this, 277, 141, textureX, textureY); // Box 192
		bodyModel[38] = new ModelRendererTurbo(this, 309, 69, textureX, textureY); // Left side door
		bodyModel[39] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[40] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[41] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[42] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[43] = new ModelRendererTurbo(this, 309, 90, textureX, textureY); // Right side door
		bodyModel[44] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[49] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[50] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[51] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[54] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[55] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[56] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[57] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[60] = new ModelRendererTurbo(this, 434, 23, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 434, 35, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 410, 2, textureX, textureY); // Box 128
		bodyModel[63] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[64] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 424, 1, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 445, 35, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 381, 44, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 360, 86, textureX, textureY); // Box 38
		bodyModel[69] = new ModelRendererTurbo(this, 365, 99, textureX, textureY); // Box 128
		bodyModel[70] = new ModelRendererTurbo(this, 364, 95, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 363, 90, textureX, textureY); // Box 128
		bodyModel[72] = new ModelRendererTurbo(this, 361, 83, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 360, 67, textureX, textureY); // Box 248
		bodyModel[74] = new ModelRendererTurbo(this, 365, 71, textureX, textureY); // Box 250
		bodyModel[75] = new ModelRendererTurbo(this, 364, 74, textureX, textureY); // Box 252
		bodyModel[76] = new ModelRendererTurbo(this, 363, 78, textureX, textureY); // Box 254
		bodyModel[77] = new ModelRendererTurbo(this, 355, 86, textureX, textureY); // Box 38
		bodyModel[78] = new ModelRendererTurbo(this, 378, 101, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 384, 66, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 377, 95, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 378, 90, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 374, 82, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 394, 48, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 355, 66, textureX, textureY); // Box 247
		bodyModel[85] = new ModelRendererTurbo(this, 378, 67, textureX, textureY); // Box 249
		bodyModel[86] = new ModelRendererTurbo(this, 377, 71, textureX, textureY); // Box 251
		bodyModel[87] = new ModelRendererTurbo(this, 378, 77, textureX, textureY); // Box 253
		bodyModel[88] = new ModelRendererTurbo(this, 384, 48, textureX, textureY); // Box 255
		bodyModel[89] = new ModelRendererTurbo(this, 396, 53, textureX, textureY); // Box 128
		bodyModel[90] = new ModelRendererTurbo(this, 378, 53, textureX, textureY); // Box 261
		bodyModel[91] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 20, 43, textureX, textureY); // Box 128
		bodyModel[93] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 128
		bodyModel[95] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[96] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 128
		bodyModel[98] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 47, 77, textureX, textureY); // Box 128
		bodyModel[100] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[101] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[102] = new ModelRendererTurbo(this, 17, 101, textureX, textureY); // Box 128
		bodyModel[103] = new ModelRendererTurbo(this, 26, 99, textureX, textureY); // Box 128
		bodyModel[104] = new ModelRendererTurbo(this, 5, 130, textureX, textureY); // Box 128
		bodyModel[105] = new ModelRendererTurbo(this, 16, 95, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 25, 95, textureX, textureY); // Box 128
		bodyModel[107] = new ModelRendererTurbo(this, 17, 90, textureX, textureY); // Box 128
		bodyModel[108] = new ModelRendererTurbo(this, 24, 90, textureX, textureY); // Box 128
		bodyModel[109] = new ModelRendererTurbo(this, 13, 82, textureX, textureY); // Box 128
		bodyModel[110] = new ModelRendererTurbo(this, 22, 83, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 59, 91, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[113] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[114] = new ModelRendererTurbo(this, 17, 67, textureX, textureY); // Box 249
		bodyModel[115] = new ModelRendererTurbo(this, 26, 71, textureX, textureY); // Box 250
		bodyModel[116] = new ModelRendererTurbo(this, 16, 71, textureX, textureY); // Box 251
		bodyModel[117] = new ModelRendererTurbo(this, 25, 74, textureX, textureY); // Box 252
		bodyModel[118] = new ModelRendererTurbo(this, 17, 77, textureX, textureY); // Box 253
		bodyModel[119] = new ModelRendererTurbo(this, 24, 78, textureX, textureY); // Box 254
		bodyModel[120] = new ModelRendererTurbo(this, 60, 81, textureX, textureY); // Box 255
		bodyModel[121] = new ModelRendererTurbo(this, 55, 94, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 55, 67, textureX, textureY); // Box 261
		bodyModel[123] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 128
		bodyModel[124] = new ModelRendererTurbo(this, 30, 8, textureX, textureY); // Box 128
		bodyModel[125] = new ModelRendererTurbo(this, 11, 260, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 18, 8, textureX, textureY); // Box 176
		bodyModel[127] = new ModelRendererTurbo(this, 11, 238, textureX, textureY); // Box 177
		bodyModel[128] = new ModelRendererTurbo(this, 52, 3, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 1, 244, textureX, textureY); // Box 128
		bodyModel[130] = new ModelRendererTurbo(this, 323, 279, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 323, 257, textureX, textureY); // Box 177
		bodyModel[132] = new ModelRendererTurbo(this, 438, 2, textureX, textureY); // Box 128
		bodyModel[133] = new ModelRendererTurbo(this, 391, 9, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 362, 9, textureX, textureY); // Box 176
		bodyModel[135] = new ModelRendererTurbo(this, 459, 1, textureX, textureY); // Box 128
		bodyModel[136] = new ModelRendererTurbo(this, 313, 263, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 438, 91, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 438, 63, textureX, textureY); // Box 185
		bodyModel[139] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[141] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[142] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[143] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[144] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[145] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[146] = new ModelRendererTurbo(this, 244, 151, textureX, textureY); // Box 2
		bodyModel[147] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[148] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[149] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[150] = new ModelRendererTurbo(this, 244, 141, textureX, textureY); // Box 35
		bodyModel[151] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[152] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[153] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 39
		bodyModel[154] = new ModelRendererTurbo(this, 260, 138, textureX, textureY); // Box 41
		bodyModel[155] = new ModelRendererTurbo(this, 74, 164, textureX, textureY); // Box 2
		bodyModel[156] = new ModelRendererTurbo(this, 74, 157, textureX, textureY); // Box 41
		bodyModel[157] = new ModelRendererTurbo(this, 265, 163, textureX, textureY); // Box 2
		bodyModel[158] = new ModelRendererTurbo(this, 265, 156, textureX, textureY); // Box 41
		bodyModel[159] = new ModelRendererTurbo(this, 55, 209, textureX, textureY); // Box 128
		bodyModel[160] = new ModelRendererTurbo(this, 427, 47, textureX, textureY); // Box 128
		bodyModel[161] = new ModelRendererTurbo(this, 69, 97, textureX, textureY); // Box 204
		bodyModel[162] = new ModelRendererTurbo(this, 69, 78, textureX, textureY); // Box 194
		bodyModel[163] = new ModelRendererTurbo(this, 74, 167, textureX, textureY); // Box 2
		bodyModel[164] = new ModelRendererTurbo(this, 265, 166, textureX, textureY); // Box 2
		bodyModel[165] = new ModelRendererTurbo(this, 74, 160, textureX, textureY); // Box 39
		bodyModel[166] = new ModelRendererTurbo(this, 265, 159, textureX, textureY); // Box 39
		bodyModel[167] = new ModelRendererTurbo(this, 275, 249, textureX, textureY); // Box 38
		bodyModel[168] = new ModelRendererTurbo(this, 306, 249, textureX, textureY); // Box 38
		bodyModel[169] = new ModelRendererTurbo(this, 336, 315, textureX, textureY); // Box 38
		bodyModel[170] = new ModelRendererTurbo(this, 357, 321, textureX, textureY); // Box 38
		bodyModel[171] = new ModelRendererTurbo(this, 327, 286, textureX, textureY); // Box 38
		bodyModel[172] = new ModelRendererTurbo(this, 421, 69, textureX, textureY); // Box 128
		bodyModel[173] = new ModelRendererTurbo(this, 103, 236, textureX, textureY); // Box 38
		bodyModel[174] = new ModelRendererTurbo(this, 103, 247, textureX, textureY); // Box 275
		bodyModel[175] = new ModelRendererTurbo(this, 104, 252, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[176] = new ModelRendererTurbo(this, 104, 241, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[177] = new ModelRendererTurbo(this, 104, 228, textureX, textureY); // Box 170
		bodyModel[178] = new ModelRendererTurbo(this, 104, 232, textureX, textureY); // Box 528
		bodyModel[179] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 128
		bodyModel[180] = new ModelRendererTurbo(this, 81, 204, textureX, textureY); // Box 324
		bodyModel[181] = new ModelRendererTurbo(this, 105, 244, textureX, textureY); // Box 38
		bodyModel[182] = new ModelRendererTurbo(this, 105, 255, textureX, textureY); // Box 276
		bodyModel[183] = new ModelRendererTurbo(this, 404, 49, textureX, textureY); // Box 128
		bodyModel[184] = new ModelRendererTurbo(this, 368, 49, textureX, textureY); // Box 334
		bodyModel[185] = new ModelRendererTurbo(this, 47, 91, textureX, textureY); // Box 128
		bodyModel[186] = new ModelRendererTurbo(this, 47, 69, textureX, textureY); // Box 336
		bodyModel[187] = new ModelRendererTurbo(this, 313, 312, textureX, textureY); // Box 38
		bodyModel[188] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Box 38
		bodyModel[189] = new ModelRendererTurbo(this, 313, 330, textureX, textureY); // Box 38
		bodyModel[190] = new ModelRendererTurbo(this, 369, 291, textureX, textureY); // Box 38
		bodyModel[191] = new ModelRendererTurbo(this, 372, 296, textureX, textureY); // Box 38
		bodyModel[192] = new ModelRendererTurbo(this, 371, 300, textureX, textureY); // Box 38
		bodyModel[193] = new ModelRendererTurbo(this, 390, 331, textureX, textureY); // Box 368
		bodyModel[194] = new ModelRendererTurbo(this, 389, 335, textureX, textureY); // Box 369
		bodyModel[195] = new ModelRendererTurbo(this, 387, 326, textureX, textureY); // Box 370
		bodyModel[196] = new ModelRendererTurbo(this, 376, 327, textureX, textureY); // Box 380
		bodyModel[197] = new ModelRendererTurbo(this, 353, 291, textureX, textureY); // Box 340
		bodyModel[198] = new ModelRendererTurbo(this, 356, 296, textureX, textureY); // Box 41
		bodyModel[199] = new ModelRendererTurbo(this, 379, 331, textureX, textureY); // Box 382
		bodyModel[200] = new ModelRendererTurbo(this, 346, 285, textureX, textureY); // Box 38
		bodyModel[201] = new ModelRendererTurbo(this, 364, 299, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[202] = new ModelRendererTurbo(this, 283, 292, textureX, textureY); // Right seat part
		bodyModel[203] = new ModelRendererTurbo(this, 285, 274, textureX, textureY); // Right seat part
		bodyModel[204] = new ModelRendererTurbo(this, 283, 320, textureX, textureY); // Left seat part
		bodyModel[205] = new ModelRendererTurbo(this, 285, 302, textureX, textureY); // Left seat part
		bodyModel[206] = new ModelRendererTurbo(this, 252, 292, textureX, textureY); // Right seat part
		bodyModel[207] = new ModelRendererTurbo(this, 254, 274, textureX, textureY); // Right seat part
		bodyModel[208] = new ModelRendererTurbo(this, 252, 320, textureX, textureY); // Left seat part
		bodyModel[209] = new ModelRendererTurbo(this, 254, 302, textureX, textureY); // Left seat part
		bodyModel[210] = new ModelRendererTurbo(this, 221, 292, textureX, textureY); // Right seat part
		bodyModel[211] = new ModelRendererTurbo(this, 223, 274, textureX, textureY); // Right seat part
		bodyModel[212] = new ModelRendererTurbo(this, 221, 320, textureX, textureY); // Left seat part
		bodyModel[213] = new ModelRendererTurbo(this, 223, 302, textureX, textureY); // Left seat part
		bodyModel[214] = new ModelRendererTurbo(this, 190, 292, textureX, textureY); // Right seat part
		bodyModel[215] = new ModelRendererTurbo(this, 192, 274, textureX, textureY); // Right seat part
		bodyModel[216] = new ModelRendererTurbo(this, 190, 320, textureX, textureY); // Left seat part
		bodyModel[217] = new ModelRendererTurbo(this, 192, 302, textureX, textureY); // Left seat part
		bodyModel[218] = new ModelRendererTurbo(this, 159, 292, textureX, textureY); // Right seat part
		bodyModel[219] = new ModelRendererTurbo(this, 161, 274, textureX, textureY); // Right seat part
		bodyModel[220] = new ModelRendererTurbo(this, 159, 320, textureX, textureY); // Left seat part
		bodyModel[221] = new ModelRendererTurbo(this, 161, 302, textureX, textureY); // Left seat part
		bodyModel[222] = new ModelRendererTurbo(this, 128, 292, textureX, textureY); // Right seat part
		bodyModel[223] = new ModelRendererTurbo(this, 130, 274, textureX, textureY); // Right seat part
		bodyModel[224] = new ModelRendererTurbo(this, 128, 320, textureX, textureY); // Left seat part
		bodyModel[225] = new ModelRendererTurbo(this, 130, 302, textureX, textureY); // Left seat part
		bodyModel[226] = new ModelRendererTurbo(this, 97, 292, textureX, textureY); // Right seat part
		bodyModel[227] = new ModelRendererTurbo(this, 99, 274, textureX, textureY); // Right seat part
		bodyModel[228] = new ModelRendererTurbo(this, 97, 320, textureX, textureY); // Left seat part
		bodyModel[229] = new ModelRendererTurbo(this, 99, 302, textureX, textureY); // Left seat part
		bodyModel[230] = new ModelRendererTurbo(this, 208, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[231] = new ModelRendererTurbo(this, 199, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[232] = new ModelRendererTurbo(this, 190, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[233] = new ModelRendererTurbo(this, 181, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[234] = new ModelRendererTurbo(this, 172, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[235] = new ModelRendererTurbo(this, 163, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[236] = new ModelRendererTurbo(this, 154, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[237] = new ModelRendererTurbo(this, 145, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[238] = new ModelRendererTurbo(this, 136, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[239] = new ModelRendererTurbo(this, 84, 258, textureX, textureY); // Box 38
		bodyModel[240] = new ModelRendererTurbo(this, 84, 263, textureX, textureY); // Box 462
		bodyModel[241] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 2
		bodyModel[242] = new ModelRendererTurbo(this, 74, 145, textureX, textureY); // Box 472
		bodyModel[243] = new ModelRendererTurbo(this, 60, 138, textureX, textureY); // Box 192
		bodyModel[244] = new ModelRendererTurbo(this, 282, 138, textureX, textureY); // Box 192
		bodyModel[245] = new ModelRendererTurbo(this, 60, 148, textureX, textureY); // Box 475
		bodyModel[246] = new ModelRendererTurbo(this, 282, 148, textureX, textureY); // Box 476
		bodyModel[247] = new ModelRendererTurbo(this, 140, 64, textureX, textureY); // Box 38
		bodyModel[248] = new ModelRendererTurbo(this, 94, 66, textureX, textureY); // Box 38
		bodyModel[249] = new ModelRendererTurbo(this, 140, 23, textureX, textureY); // Box 451
		bodyModel[250] = new ModelRendererTurbo(this, 94, 21, textureX, textureY); // Box 452
		bodyModel[251] = new ModelRendererTurbo(this, 84, 9, textureX, textureY); // Box 38
		bodyModel[252] = new ModelRendererTurbo(this, 75, 9, textureX, textureY); // Box 38
		bodyModel[253] = new ModelRendererTurbo(this, 296, 6, textureX, textureY); // Box 38
		bodyModel[254] = new ModelRendererTurbo(this, 296, 16, textureX, textureY); // Box 487
		bodyModel[255] = new ModelRendererTurbo(this, 296, 20, textureX, textureY); // Box 128
		bodyModel[256] = new ModelRendererTurbo(this, 296, 1, textureX, textureY); // Box 205
		bodyModel[257] = new ModelRendererTurbo(this, 144, 166, textureX, textureY); // Box 283
		bodyModel[258] = new ModelRendererTurbo(this, 122, 166, textureX, textureY); // Box 41
		bodyModel[259] = new ModelRendererTurbo(this, 119, 167, textureX, textureY); // Box 41
		bodyModel[260] = new ModelRendererTurbo(this, 141, 167, textureX, textureY); // Box 41
		bodyModel[261] = new ModelRendererTurbo(this, 140, 155, textureX, textureY); // Box 494
		bodyModel[262] = new ModelRendererTurbo(this, 122, 155, textureX, textureY); // Box 41
		bodyModel[263] = new ModelRendererTurbo(this, 119, 156, textureX, textureY); // Box 41
		bodyModel[264] = new ModelRendererTurbo(this, 137, 156, textureX, textureY); // Box 41
		bodyModel[265] = new ModelRendererTurbo(this, 124, 160, textureX, textureY); // Box 41
		bodyModel[266] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 41
		bodyModel[267] = new ModelRendererTurbo(this, 135, 161, textureX, textureY); // Box 41
		bodyModel[268] = new ModelRendererTurbo(this, 308, 129, textureX, textureY); // Box 2
		bodyModel[269] = new ModelRendererTurbo(this, 34, 124, textureX, textureY); // Box 2
		bodyModel[270] = new ModelRendererTurbo(this, 69, 138, textureX, textureY); // Box 479
		bodyModel[271] = new ModelRendererTurbo(this, 277, 138, textureX, textureY); // Box 480
		bodyModel[272] = new ModelRendererTurbo(this, 324, 86, textureX, textureY); // Box 1353
		bodyModel[273] = new ModelRendererTurbo(this, 340, 86, textureX, textureY); // Box 1354
		bodyModel[274] = new ModelRendererTurbo(this, 340, 84, textureX, textureY); // Box 1357
		bodyModel[275] = new ModelRendererTurbo(this, 324, 84, textureX, textureY); // Box 1358
		bodyModel[276] = new ModelRendererTurbo(this, 340, 90, textureX, textureY); // Box 1359
		bodyModel[277] = new ModelRendererTurbo(this, 324, 90, textureX, textureY); // Box 1360
		bodyModel[278] = new ModelRendererTurbo(this, 329, 87, textureX, textureY); // Box 1356
		bodyModel[279] = new ModelRendererTurbo(this, 331, 90, textureX, textureY); // Box 1355
		bodyModel[280] = new ModelRendererTurbo(this, 331, 100, textureX, textureY); // Right step part
		bodyModel[281] = new ModelRendererTurbo(this, 331, 104, textureX, textureY); // Right step part
		bodyModel[282] = new ModelRendererTurbo(this, 331, 94, textureX, textureY); // Right step part
		bodyModel[283] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Right step part
		bodyModel[284] = new ModelRendererTurbo(this, 329, 107, textureX, textureY); // Right step part
		bodyModel[285] = new ModelRendererTurbo(this, 326, 98, textureX, textureY); // Right step part
		bodyModel[286] = new ModelRendererTurbo(this, 340, 98, textureX, textureY); // Right step part
		bodyModel[287] = new ModelRendererTurbo(this, 326, 100, textureX, textureY); // Right step part
		bodyModel[288] = new ModelRendererTurbo(this, 340, 100, textureX, textureY); // Right step part
		bodyModel[289] = new ModelRendererTurbo(this, 326, 95, textureX, textureY); // Right step part
		bodyModel[290] = new ModelRendererTurbo(this, 340, 95, textureX, textureY); // Right step part
		bodyModel[291] = new ModelRendererTurbo(this, 324, 62, textureX, textureY); // Box 26
		bodyModel[292] = new ModelRendererTurbo(this, 340, 62, textureX, textureY); // Box 26
		bodyModel[293] = new ModelRendererTurbo(this, 340, 60, textureX, textureY); // Box 26
		bodyModel[294] = new ModelRendererTurbo(this, 324, 60, textureX, textureY); // Box 26
		bodyModel[295] = new ModelRendererTurbo(this, 340, 66, textureX, textureY); // Box 26
		bodyModel[296] = new ModelRendererTurbo(this, 324, 66, textureX, textureY); // Box 26
		bodyModel[297] = new ModelRendererTurbo(this, 329, 63, textureX, textureY); // Box 26
		bodyModel[298] = new ModelRendererTurbo(this, 331, 66, textureX, textureY); // Box 26
		bodyModel[299] = new ModelRendererTurbo(this, 331, 80, textureX, textureY); // Left step part
		bodyModel[300] = new ModelRendererTurbo(this, 331, 76, textureX, textureY); // Left step part
		bodyModel[301] = new ModelRendererTurbo(this, 331, 70, textureX, textureY); // Left step part
		bodyModel[302] = new ModelRendererTurbo(this, 340, 76, textureX, textureY); // Left step part
		bodyModel[303] = new ModelRendererTurbo(this, 326, 76, textureX, textureY); // Left step part
		bodyModel[304] = new ModelRendererTurbo(this, 340, 74, textureX, textureY); // Left step part
		bodyModel[305] = new ModelRendererTurbo(this, 326, 74, textureX, textureY); // Left step part
		bodyModel[306] = new ModelRendererTurbo(this, 326, 71, textureX, textureY); // Left step part
		bodyModel[307] = new ModelRendererTurbo(this, 340, 71, textureX, textureY); // Left step part
		bodyModel[308] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Left step part
		bodyModel[309] = new ModelRendererTurbo(this, 329, 83, textureX, textureY); // Left step part
		bodyModel[310] = new ModelRendererTurbo(this, 97, 284, textureX, textureY); // Boc 42
		bodyModel[311] = new ModelRendererTurbo(this, 97, 312, textureX, textureY); // Boc 42
		bodyModel[312] = new ModelRendererTurbo(this, 110, 274, textureX, textureY); // Right seat part
		bodyModel[313] = new ModelRendererTurbo(this, 115, 277, textureX, textureY); // Right seat part
		bodyModel[314] = new ModelRendererTurbo(this, 117, 274, textureX, textureY); // Right seat part
		bodyModel[315] = new ModelRendererTurbo(this, 110, 277, textureX, textureY); // Right seat part
		bodyModel[316] = new ModelRendererTurbo(this, 124, 274, textureX, textureY); // Right seat part
		bodyModel[317] = new ModelRendererTurbo(this, 110, 282, textureX, textureY); // Right seat part
		bodyModel[318] = new ModelRendererTurbo(this, 115, 285, textureX, textureY); // Right seat part
		bodyModel[319] = new ModelRendererTurbo(this, 117, 282, textureX, textureY); // Right seat part
		bodyModel[320] = new ModelRendererTurbo(this, 110, 285, textureX, textureY); // Right seat part
		bodyModel[321] = new ModelRendererTurbo(this, 124, 282, textureX, textureY); // Right seat part
		bodyModel[322] = new ModelRendererTurbo(this, 110, 302, textureX, textureY); // Left seat part
		bodyModel[323] = new ModelRendererTurbo(this, 115, 305, textureX, textureY); // Left seat part
		bodyModel[324] = new ModelRendererTurbo(this, 117, 302, textureX, textureY); // Left seat part
		bodyModel[325] = new ModelRendererTurbo(this, 110, 305, textureX, textureY); // Left seat part
		bodyModel[326] = new ModelRendererTurbo(this, 124, 302, textureX, textureY); // Left seat part
		bodyModel[327] = new ModelRendererTurbo(this, 110, 310, textureX, textureY); // Left seat part
		bodyModel[328] = new ModelRendererTurbo(this, 115, 313, textureX, textureY); // Left seat part
		bodyModel[329] = new ModelRendererTurbo(this, 117, 310, textureX, textureY); // Left seat part
		bodyModel[330] = new ModelRendererTurbo(this, 110, 313, textureX, textureY); // Left seat part
		bodyModel[331] = new ModelRendererTurbo(this, 124, 310, textureX, textureY); // Left seat part
		bodyModel[332] = new ModelRendererTurbo(this, 128, 284, textureX, textureY); // Boc 42
		bodyModel[333] = new ModelRendererTurbo(this, 128, 312, textureX, textureY); // Boc 42
		bodyModel[334] = new ModelRendererTurbo(this, 141, 274, textureX, textureY); // Right seat part
		bodyModel[335] = new ModelRendererTurbo(this, 146, 277, textureX, textureY); // Right seat part
		bodyModel[336] = new ModelRendererTurbo(this, 148, 274, textureX, textureY); // Right seat part
		bodyModel[337] = new ModelRendererTurbo(this, 141, 277, textureX, textureY); // Right seat part
		bodyModel[338] = new ModelRendererTurbo(this, 155, 274, textureX, textureY); // Right seat part
		bodyModel[339] = new ModelRendererTurbo(this, 141, 282, textureX, textureY); // Right seat part
		bodyModel[340] = new ModelRendererTurbo(this, 146, 285, textureX, textureY); // Right seat part
		bodyModel[341] = new ModelRendererTurbo(this, 148, 282, textureX, textureY); // Right seat part
		bodyModel[342] = new ModelRendererTurbo(this, 141, 285, textureX, textureY); // Right seat part
		bodyModel[343] = new ModelRendererTurbo(this, 155, 282, textureX, textureY); // Right seat part
		bodyModel[344] = new ModelRendererTurbo(this, 141, 302, textureX, textureY); // Left seat part
		bodyModel[345] = new ModelRendererTurbo(this, 146, 305, textureX, textureY); // Left seat part
		bodyModel[346] = new ModelRendererTurbo(this, 148, 302, textureX, textureY); // Left seat part
		bodyModel[347] = new ModelRendererTurbo(this, 141, 305, textureX, textureY); // Left seat part
		bodyModel[348] = new ModelRendererTurbo(this, 155, 302, textureX, textureY); // Left seat part
		bodyModel[349] = new ModelRendererTurbo(this, 141, 310, textureX, textureY); // Left seat part
		bodyModel[350] = new ModelRendererTurbo(this, 146, 313, textureX, textureY); // Left seat part
		bodyModel[351] = new ModelRendererTurbo(this, 148, 310, textureX, textureY); // Left seat part
		bodyModel[352] = new ModelRendererTurbo(this, 141, 313, textureX, textureY); // Left seat part
		bodyModel[353] = new ModelRendererTurbo(this, 190, 284, textureX, textureY); // Boc 42
		bodyModel[354] = new ModelRendererTurbo(this, 159, 284, textureX, textureY); // Boc 42
		bodyModel[355] = new ModelRendererTurbo(this, 190, 312, textureX, textureY); // Boc 42
		bodyModel[356] = new ModelRendererTurbo(this, 159, 312, textureX, textureY); // Boc 42
		bodyModel[357] = new ModelRendererTurbo(this, 203, 274, textureX, textureY); // Right seat part
		bodyModel[358] = new ModelRendererTurbo(this, 208, 277, textureX, textureY); // Right seat part
		bodyModel[359] = new ModelRendererTurbo(this, 210, 274, textureX, textureY); // Right seat part
		bodyModel[360] = new ModelRendererTurbo(this, 203, 277, textureX, textureY); // Right seat part
		bodyModel[361] = new ModelRendererTurbo(this, 217, 274, textureX, textureY); // Right seat part
		bodyModel[362] = new ModelRendererTurbo(this, 203, 282, textureX, textureY); // Right seat part
		bodyModel[363] = new ModelRendererTurbo(this, 208, 285, textureX, textureY); // Right seat part
		bodyModel[364] = new ModelRendererTurbo(this, 210, 282, textureX, textureY); // Right seat part
		bodyModel[365] = new ModelRendererTurbo(this, 203, 285, textureX, textureY); // Right seat part
		bodyModel[366] = new ModelRendererTurbo(this, 217, 282, textureX, textureY); // Right seat part
		bodyModel[367] = new ModelRendererTurbo(this, 172, 274, textureX, textureY); // Right seat part
		bodyModel[368] = new ModelRendererTurbo(this, 177, 277, textureX, textureY); // Right seat part
		bodyModel[369] = new ModelRendererTurbo(this, 179, 274, textureX, textureY); // Right seat part
		bodyModel[370] = new ModelRendererTurbo(this, 172, 277, textureX, textureY); // Right seat part
		bodyModel[371] = new ModelRendererTurbo(this, 186, 274, textureX, textureY); // Right seat part
		bodyModel[372] = new ModelRendererTurbo(this, 172, 282, textureX, textureY); // Right seat part
		bodyModel[373] = new ModelRendererTurbo(this, 177, 285, textureX, textureY); // Right seat part
		bodyModel[374] = new ModelRendererTurbo(this, 179, 282, textureX, textureY); // Right seat part
		bodyModel[375] = new ModelRendererTurbo(this, 172, 285, textureX, textureY); // Right seat part
		bodyModel[376] = new ModelRendererTurbo(this, 186, 282, textureX, textureY); // Right seat part
		bodyModel[377] = new ModelRendererTurbo(this, 203, 302, textureX, textureY); // Left seat part
		bodyModel[378] = new ModelRendererTurbo(this, 208, 305, textureX, textureY); // Left seat part
		bodyModel[379] = new ModelRendererTurbo(this, 210, 302, textureX, textureY); // Left seat part
		bodyModel[380] = new ModelRendererTurbo(this, 203, 305, textureX, textureY); // Left seat part
		bodyModel[381] = new ModelRendererTurbo(this, 217, 302, textureX, textureY); // Left seat part
		bodyModel[382] = new ModelRendererTurbo(this, 203, 310, textureX, textureY); // Left seat part
		bodyModel[383] = new ModelRendererTurbo(this, 208, 313, textureX, textureY); // Left seat part
		bodyModel[384] = new ModelRendererTurbo(this, 210, 310, textureX, textureY); // Left seat part
		bodyModel[385] = new ModelRendererTurbo(this, 203, 313, textureX, textureY); // Left seat part
		bodyModel[386] = new ModelRendererTurbo(this, 217, 310, textureX, textureY); // Left seat part
		bodyModel[387] = new ModelRendererTurbo(this, 172, 302, textureX, textureY); // Left seat part
		bodyModel[388] = new ModelRendererTurbo(this, 177, 305, textureX, textureY); // Left seat part
		bodyModel[389] = new ModelRendererTurbo(this, 179, 302, textureX, textureY); // Left seat part
		bodyModel[390] = new ModelRendererTurbo(this, 172, 305, textureX, textureY); // Left seat part
		bodyModel[391] = new ModelRendererTurbo(this, 186, 302, textureX, textureY); // Left seat part
		bodyModel[392] = new ModelRendererTurbo(this, 172, 310, textureX, textureY); // Left seat part
		bodyModel[393] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Left seat part
		bodyModel[394] = new ModelRendererTurbo(this, 179, 310, textureX, textureY); // Left seat part
		bodyModel[395] = new ModelRendererTurbo(this, 172, 313, textureX, textureY); // Left seat part
		bodyModel[396] = new ModelRendererTurbo(this, 186, 310, textureX, textureY); // Left seat part
		bodyModel[397] = new ModelRendererTurbo(this, 221, 284, textureX, textureY); // Boc 42
		bodyModel[398] = new ModelRendererTurbo(this, 252, 312, textureX, textureY); // Boc 42
		bodyModel[399] = new ModelRendererTurbo(this, 221, 312, textureX, textureY); // Boc 42
		bodyModel[400] = new ModelRendererTurbo(this, 265, 274, textureX, textureY); // Right seat part
		bodyModel[401] = new ModelRendererTurbo(this, 270, 277, textureX, textureY); // Right seat part
		bodyModel[402] = new ModelRendererTurbo(this, 272, 274, textureX, textureY); // Right seat part
		bodyModel[403] = new ModelRendererTurbo(this, 265, 277, textureX, textureY); // Right seat part
		bodyModel[404] = new ModelRendererTurbo(this, 279, 274, textureX, textureY); // Right seat part
		bodyModel[405] = new ModelRendererTurbo(this, 265, 282, textureX, textureY); // Right seat part
		bodyModel[406] = new ModelRendererTurbo(this, 270, 285, textureX, textureY); // Right seat part
		bodyModel[407] = new ModelRendererTurbo(this, 272, 282, textureX, textureY); // Right seat part
		bodyModel[408] = new ModelRendererTurbo(this, 265, 285, textureX, textureY); // Right seat part
		bodyModel[409] = new ModelRendererTurbo(this, 279, 282, textureX, textureY); // Right seat part
		bodyModel[410] = new ModelRendererTurbo(this, 234, 274, textureX, textureY); // Right seat part
		bodyModel[411] = new ModelRendererTurbo(this, 239, 277, textureX, textureY); // Right seat part
		bodyModel[412] = new ModelRendererTurbo(this, 241, 274, textureX, textureY); // Right seat part
		bodyModel[413] = new ModelRendererTurbo(this, 234, 277, textureX, textureY); // Right seat part
		bodyModel[414] = new ModelRendererTurbo(this, 248, 274, textureX, textureY); // Right seat part
		bodyModel[415] = new ModelRendererTurbo(this, 234, 282, textureX, textureY); // Right seat part
		bodyModel[416] = new ModelRendererTurbo(this, 239, 285, textureX, textureY); // Right seat part
		bodyModel[417] = new ModelRendererTurbo(this, 241, 282, textureX, textureY); // Right seat part
		bodyModel[418] = new ModelRendererTurbo(this, 234, 285, textureX, textureY); // Right seat part
		bodyModel[419] = new ModelRendererTurbo(this, 248, 282, textureX, textureY); // Right seat part
		bodyModel[420] = new ModelRendererTurbo(this, 265, 302, textureX, textureY); // Left seat part
		bodyModel[421] = new ModelRendererTurbo(this, 270, 305, textureX, textureY); // Left seat part
		bodyModel[422] = new ModelRendererTurbo(this, 272, 302, textureX, textureY); // Left seat part
		bodyModel[423] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Left seat part
		bodyModel[424] = new ModelRendererTurbo(this, 279, 302, textureX, textureY); // Left seat part
		bodyModel[425] = new ModelRendererTurbo(this, 265, 310, textureX, textureY); // Left seat part
		bodyModel[426] = new ModelRendererTurbo(this, 270, 313, textureX, textureY); // Left seat part
		bodyModel[427] = new ModelRendererTurbo(this, 272, 310, textureX, textureY); // Left seat part
		bodyModel[428] = new ModelRendererTurbo(this, 265, 313, textureX, textureY); // Left seat part
		bodyModel[429] = new ModelRendererTurbo(this, 279, 310, textureX, textureY); // Left seat part
		bodyModel[430] = new ModelRendererTurbo(this, 234, 302, textureX, textureY); // Left seat part
		bodyModel[431] = new ModelRendererTurbo(this, 239, 305, textureX, textureY); // Left seat part
		bodyModel[432] = new ModelRendererTurbo(this, 241, 302, textureX, textureY); // Left seat part
		bodyModel[433] = new ModelRendererTurbo(this, 234, 305, textureX, textureY); // Left seat part
		bodyModel[434] = new ModelRendererTurbo(this, 248, 302, textureX, textureY); // Left seat part
		bodyModel[435] = new ModelRendererTurbo(this, 234, 310, textureX, textureY); // Left seat part
		bodyModel[436] = new ModelRendererTurbo(this, 239, 313, textureX, textureY); // Left seat part
		bodyModel[437] = new ModelRendererTurbo(this, 241, 310, textureX, textureY); // Left seat part
		bodyModel[438] = new ModelRendererTurbo(this, 234, 313, textureX, textureY); // Left seat part
		bodyModel[439] = new ModelRendererTurbo(this, 248, 310, textureX, textureY); // Left seat part
		bodyModel[440] = new ModelRendererTurbo(this, 283, 284, textureX, textureY); // Boc 42
		bodyModel[441] = new ModelRendererTurbo(this, 283, 312, textureX, textureY); // Box 638
		bodyModel[442] = new ModelRendererTurbo(this, 296, 274, textureX, textureY); // Right seat part
		bodyModel[443] = new ModelRendererTurbo(this, 301, 277, textureX, textureY); // Right seat part
		bodyModel[444] = new ModelRendererTurbo(this, 303, 274, textureX, textureY); // Right seat part
		bodyModel[445] = new ModelRendererTurbo(this, 296, 277, textureX, textureY); // Right seat part
		bodyModel[446] = new ModelRendererTurbo(this, 310, 274, textureX, textureY); // Right seat part
		bodyModel[447] = new ModelRendererTurbo(this, 296, 282, textureX, textureY); // Right seat part
		bodyModel[448] = new ModelRendererTurbo(this, 301, 285, textureX, textureY); // Right seat part
		bodyModel[449] = new ModelRendererTurbo(this, 303, 282, textureX, textureY); // Right seat part
		bodyModel[450] = new ModelRendererTurbo(this, 296, 285, textureX, textureY); // Right seat part
		bodyModel[451] = new ModelRendererTurbo(this, 310, 282, textureX, textureY); // Right seat part
		bodyModel[452] = new ModelRendererTurbo(this, 296, 302, textureX, textureY); // Left seat part
		bodyModel[453] = new ModelRendererTurbo(this, 301, 305, textureX, textureY); // Left seat part
		bodyModel[454] = new ModelRendererTurbo(this, 303, 302, textureX, textureY); // Left seat part
		bodyModel[455] = new ModelRendererTurbo(this, 296, 305, textureX, textureY); // Left seat part
		bodyModel[456] = new ModelRendererTurbo(this, 310, 302, textureX, textureY); // Left seat part
		bodyModel[457] = new ModelRendererTurbo(this, 296, 310, textureX, textureY); // Left seat part
		bodyModel[458] = new ModelRendererTurbo(this, 301, 313, textureX, textureY); // Left seat part
		bodyModel[459] = new ModelRendererTurbo(this, 303, 310, textureX, textureY); // Left seat part
		bodyModel[460] = new ModelRendererTurbo(this, 296, 313, textureX, textureY); // Left seat part
		bodyModel[461] = new ModelRendererTurbo(this, 310, 310, textureX, textureY); // Left seat part
		bodyModel[462] = new ModelRendererTurbo(this, 252, 284, textureX, textureY); // Boc 42
		bodyModel[463] = new ModelRendererTurbo(this, 155, 310, textureX, textureY); // Left seat part
		bodyModel[464] = new ModelRendererTurbo(this, 128, 351, textureX, textureY); // Right seat part
		bodyModel[465] = new ModelRendererTurbo(this, 130, 333, textureX, textureY); // Right seat part
		bodyModel[466] = new ModelRendererTurbo(this, 128, 379, textureX, textureY); // Left seat part
		bodyModel[467] = new ModelRendererTurbo(this, 130, 361, textureX, textureY); // Left seat part
		bodyModel[468] = new ModelRendererTurbo(this, 97, 351, textureX, textureY); // Right seat part
		bodyModel[469] = new ModelRendererTurbo(this, 99, 333, textureX, textureY); // Right seat part
		bodyModel[470] = new ModelRendererTurbo(this, 97, 379, textureX, textureY); // Left seat part
		bodyModel[471] = new ModelRendererTurbo(this, 99, 361, textureX, textureY); // Left seat part
		bodyModel[472] = new ModelRendererTurbo(this, 97, 343, textureX, textureY); // Boc 42
		bodyModel[473] = new ModelRendererTurbo(this, 97, 371, textureX, textureY); // Boc 42
		bodyModel[474] = new ModelRendererTurbo(this, 110, 333, textureX, textureY); // Right seat part
		bodyModel[475] = new ModelRendererTurbo(this, 115, 336, textureX, textureY); // Right seat part
		bodyModel[476] = new ModelRendererTurbo(this, 117, 333, textureX, textureY); // Right seat part
		bodyModel[477] = new ModelRendererTurbo(this, 110, 336, textureX, textureY); // Right seat part
		bodyModel[478] = new ModelRendererTurbo(this, 124, 333, textureX, textureY); // Right seat part
		bodyModel[479] = new ModelRendererTurbo(this, 110, 341, textureX, textureY); // Right seat part
		bodyModel[480] = new ModelRendererTurbo(this, 115, 344, textureX, textureY); // Right seat part
		bodyModel[481] = new ModelRendererTurbo(this, 117, 341, textureX, textureY); // Right seat part
		bodyModel[482] = new ModelRendererTurbo(this, 110, 344, textureX, textureY); // Right seat part
		bodyModel[483] = new ModelRendererTurbo(this, 124, 341, textureX, textureY); // Right seat part
		bodyModel[484] = new ModelRendererTurbo(this, 110, 361, textureX, textureY); // Left seat part
		bodyModel[485] = new ModelRendererTurbo(this, 115, 364, textureX, textureY); // Left seat part
		bodyModel[486] = new ModelRendererTurbo(this, 117, 361, textureX, textureY); // Left seat part
		bodyModel[487] = new ModelRendererTurbo(this, 110, 364, textureX, textureY); // Left seat part
		bodyModel[488] = new ModelRendererTurbo(this, 124, 361, textureX, textureY); // Left seat part
		bodyModel[489] = new ModelRendererTurbo(this, 110, 369, textureX, textureY); // Left seat part
		bodyModel[490] = new ModelRendererTurbo(this, 117, 369, textureX, textureY); // Left seat part
		bodyModel[491] = new ModelRendererTurbo(this, 110, 372, textureX, textureY); // Left seat part
		bodyModel[492] = new ModelRendererTurbo(this, 124, 369, textureX, textureY); // Left seat part
		bodyModel[493] = new ModelRendererTurbo(this, 128, 343, textureX, textureY); // Boc 42
		bodyModel[494] = new ModelRendererTurbo(this, 128, 371, textureX, textureY); // Boc 42
		bodyModel[495] = new ModelRendererTurbo(this, 141, 333, textureX, textureY); // Right seat part
		bodyModel[496] = new ModelRendererTurbo(this, 146, 336, textureX, textureY); // Right seat part
		bodyModel[497] = new ModelRendererTurbo(this, 148, 333, textureX, textureY); // Right seat part
		bodyModel[498] = new ModelRendererTurbo(this, 141, 336, textureX, textureY); // Right seat part
		bodyModel[499] = new ModelRendererTurbo(this, 155, 333, textureX, textureY); // Right seat part

		bodyModel[0].addBox(0F, 0F, 0F, 105, 1, 4, 0F); // Box 2
		bodyModel[0].setRotationPoint(-52.5F, 3F, -2F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[1].setRotationPoint(40F, 4F, -1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-42F, 4F, -1F);

		bodyModel[3].addBox(0F, 0F, 0F, 15, 2, 4, 0F); // Box 2
		bodyModel[3].setRotationPoint(7.5F, 3F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[4].setRotationPoint(7.5F, 5F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[5].setRotationPoint(22.5F, 2.75F, 6.1F);
		bodyModel[5].rotateAngleX = -0.78539816F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[6].setRotationPoint(22.49F, 3F, 5.6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[7].setRotationPoint(27.51F, 3F, 5.6F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 283
		bodyModel[8].setRotationPoint(-0.5F, 3F, -7F);

		bodyModel[9].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 283
		bodyModel[9].setRotationPoint(4.5F, 3F, 5F);

		bodyModel[10].addBox(0F, 0F, 0F, 110, 2, 22, 0F); // Box 2
		bodyModel[10].setRotationPoint(-57.5F, 1F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[11].setRotationPoint(-59.5F, 3F, -1.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull
		bodyModel[12].setRotationPoint(-57.5F, 4F, 10.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[13].setRotationPoint(-57.5F, 3F, 10.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[14].setRotationPoint(-51.5F, 4F, 10.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30 cull
		bodyModel[15].setRotationPoint(-57.5F, 4F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[16].setRotationPoint(-57.5F, 3F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[17].setRotationPoint(-51.5F, 4F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[18].setRotationPoint(-57.5F, 3F, -10.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[19].setRotationPoint(-57.5F, 4F, -10.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[20].setRotationPoint(-57.5F, 4F, 9.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[21].setRotationPoint(56.5F, 1F, -11F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[22].setRotationPoint(52.5F, 1F, -5F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[23].setRotationPoint(56.5F, 3F, -1.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[24].setRotationPoint(52.5F, 1F, -10.99F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[25].setRotationPoint(52.5F, 1F, 4.99F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[26].setRotationPoint(56.5F, 3F, 10.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[27].setRotationPoint(56.5F, 4F, 10.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[28].setRotationPoint(51.5F, 4F, 10.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 2
		bodyModel[29].setRotationPoint(49.5F, 4F, 10.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[30].setRotationPoint(56.5F, 3F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[31].setRotationPoint(56.5F, 4F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[32].setRotationPoint(51.5F, 4F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 29
		bodyModel[33].setRotationPoint(49.5F, 4F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[34].setRotationPoint(51.5F, 3F, 10.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[35].setRotationPoint(57F, 3F, -10.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[36].setRotationPoint(57F, 4F, -10.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[37].setRotationPoint(57F, 4F, 9.5F);

		bodyModel[38].addShapeBox(0F, 0F, -1F, 5, 15, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[38].setRotationPoint(52.51F, -14F, -10.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 110, 16, 1, 0F); // Box 38
		bodyModel[39].setRotationPoint(-57.5F, -15F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 110, 16, 1, 0F); // Box 128
		bodyModel[40].setRotationPoint(-57.5F, -15F, 10F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[41].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[42].setRotationPoint(56.5F, -15F, 3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[43].setRotationPoint(52.51F, -14F, 10.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[44].setRotationPoint(-57.5F, -15F, -10F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[45].setRotationPoint(-57.5F, -15F, 3F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[46].setRotationPoint(52.5F, -15F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[47].setRotationPoint(52.5F, -15F, 10F);

		bodyModel[48].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[48].setRotationPoint(-56.5F, -14F, -3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[49].setRotationPoint(57.5F, -7F, -3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[50].setRotationPoint(57.5F, -7F, -3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[51].setRotationPoint(52F, -6F, -12F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[52].setRotationPoint(57F, -6F, -12F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[53].setRotationPoint(52F, -6F, 11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[54].setRotationPoint(57F, -6F, 11F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[55].setRotationPoint(-57.5F, -15F, -3F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[56].setRotationPoint(51.5F, -15F, -10F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[57].setRotationPoint(51.5F, -15F, 3F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[58].setRotationPoint(51.5F, -15F, -3F);

		bodyModel[59].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[59].setRotationPoint(51.5F, -14F, 3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[60].setRotationPoint(57.5F, -15F, -4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[61].setRotationPoint(57.5F, 1F, -4F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[62].setRotationPoint(57.5F, -14F, -4F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[63].setRotationPoint(57.5F, -14F, 3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[64].setRotationPoint(59F, -14F, -5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[65].setRotationPoint(59F, -14F, 3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[66].setRotationPoint(59F, 1F, -5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[67].setRotationPoint(59F, -17F, -5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 18, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[68].setRotationPoint(57.5F, -15F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[69].setRotationPoint(57.5F, -15F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, -1.75F, 0F, -1.5F, -1.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -1.5F, 1.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[70].setRotationPoint(57.5F, -19F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[71].setRotationPoint(57.5F, -20F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 0, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[72].setRotationPoint(57.5F, -20F, -3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 18, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[73].setRotationPoint(57.5F, -15F, 11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 2.25F, -1F, -1.5F, 2.25F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -1.5F, -2.25F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[74].setRotationPoint(57.5F, -15F, 9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[75].setRotationPoint(57.5F, -19F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[76].setRotationPoint(57.5F, -20F, 3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[77].setRotationPoint(59F, -15F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[78].setRotationPoint(59F, -16F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[79].setRotationPoint(59F, 1F, -10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[80].setRotationPoint(59F, -19F, -10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[81].setRotationPoint(59F, -19.5F, -7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[82].setRotationPoint(59F, -20F, -3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[83].setRotationPoint(59F, -20F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[84].setRotationPoint(59F, -15F, 10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[85].setRotationPoint(59F, -16F, 9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[86].setRotationPoint(59F, -19F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 253
		bodyModel[87].setRotationPoint(59F, -19.5F, 5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[88].setRotationPoint(59F, -20F, 3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[89].setRotationPoint(59.5F, -7F, -10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[90].setRotationPoint(59.5F, -7F, 5F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[91].setRotationPoint(56.5F, -15F, -3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[92].setRotationPoint(-59F, -15F, -4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[93].setRotationPoint(-59F, 1F, -4F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[94].setRotationPoint(-59F, -14F, -4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[95].setRotationPoint(-59F, -14F, 3F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[96].setRotationPoint(-59.5F, -14F, -5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[97].setRotationPoint(-59.5F, -14F, 3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[98].setRotationPoint(-59.5F, 1F, -5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[99].setRotationPoint(-59.5F, -17F, -5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[100].setRotationPoint(-59.5F, -15F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 18, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[101].setRotationPoint(-59F, -15F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[102].setRotationPoint(-59.5F, -16F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[103].setRotationPoint(-59F, -15F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[104].setRotationPoint(-59.5F, 1F, -10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[105].setRotationPoint(-59.5F, -19F, -10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, -1.75F, 0F, -1.5F, -1.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -1.5F, 1.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[106].setRotationPoint(-59F, -19F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[107].setRotationPoint(-59.5F, -19.5F, -7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[108].setRotationPoint(-59F, -20F, -7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[109].setRotationPoint(-59.5F, -20F, -3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 0, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[110].setRotationPoint(-59F, -20F, -3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[111].setRotationPoint(-59.5F, -19.75F, -5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[112].setRotationPoint(-59.5F, -15F, 10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 18, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[113].setRotationPoint(-59F, -15F, 11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[114].setRotationPoint(-59.5F, -16F, 9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 2.25F, -1F, -1.5F, 2.25F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -1.5F, -2.25F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[115].setRotationPoint(-59F, -15F, 9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[116].setRotationPoint(-59.5F, -19F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[117].setRotationPoint(-59F, -19F, 7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 253
		bodyModel[118].setRotationPoint(-59.5F, -19.5F, 5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[119].setRotationPoint(-59F, -20F, 3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[120].setRotationPoint(-59.5F, -19.75F, 3F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[121].setRotationPoint(-59.5F, -7F, -10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[122].setRotationPoint(-59.5F, -7F, 5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[123].setRotationPoint(-57.5F, -17F, -7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[124].setRotationPoint(-57.5F, -18F, -10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[125].setRotationPoint(-57.5F, -19F, -7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[126].setRotationPoint(-57.5F, -18F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[127].setRotationPoint(-57.5F, -19F, 3F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[128].setRotationPoint(-57.5F, -16.25F, -10F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 128
		bodyModel[129].setRotationPoint(-57.5F, -18F, -7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 22, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[130].setRotationPoint(35.5F, -19F, -7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 22, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[131].setRotationPoint(35.5F, -19F, 3F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[132].setRotationPoint(51.5F, -17F, -7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[133].setRotationPoint(51.5F, -18F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[134].setRotationPoint(51.5F, -18F, 7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[135].setRotationPoint(51.5F, -16.25F, -10F);

		bodyModel[136].addBox(0F, 0F, 0F, 22, 1, 14, 0F); // Box 128
		bodyModel[136].setRotationPoint(35.5F, -18F, -7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 16, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[137].setRotationPoint(35.5F, -18F, -10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 16, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185
		bodyModel[138].setRotationPoint(35.5F, -18F, 7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 115, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[139].setRotationPoint(-57.5F, -16F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 115, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[140].setRotationPoint(-57.5F, -16F, 10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 115, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[141].setRotationPoint(-57.5F, -20F, -3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 115, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[142].setRotationPoint(-57.5F, -20F, -7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 115, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[143].setRotationPoint(-57.5F, -19F, -10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 115, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[144].setRotationPoint(-57.5F, -20F, 3F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 115, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[145].setRotationPoint(-57.5F, -19F, 7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[146].setRotationPoint(30.5F, 4F, 10.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 2
		bodyModel[147].setRotationPoint(-32.5F, 4F, 10.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 61, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[148].setRotationPoint(-30.5F, 3F, 10.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 61, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[149].setRotationPoint(-30.5F, 4F, 10.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[150].setRotationPoint(30.5F, 4F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 37
		bodyModel[151].setRotationPoint(-32.5F, 4F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 61, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[152].setRotationPoint(-30.5F, 3F, -11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 61, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[153].setRotationPoint(-30.5F, 4F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[154].setRotationPoint(51.5F, 3F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[155].setRotationPoint(-51.5F, 3F, 10.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[156].setRotationPoint(-51.5F, 3F, -11F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[157].setRotationPoint(30.5F, 3F, 10.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[158].setRotationPoint(30.5F, 3F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 115, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[159].setRotationPoint(-57.5F, -19F, -3F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 16, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[160].setRotationPoint(35.5F, -17F, -7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[161].setRotationPoint(-57F, -6F, 11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[162].setRotationPoint(-57F, -6F, -12F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[163].setRotationPoint(-51.5F, 4F, 10.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[164].setRotationPoint(30.5F, 4F, 10.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[165].setRotationPoint(-51.5F, 4F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[166].setRotationPoint(30.5F, 4F, -11F);

		bodyModel[167].addBox(0F, 0F, 0F, 8, 16, 7, 0F); // Box 38
		bodyModel[167].setRotationPoint(35.5F, -15F, 3F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[168].setRotationPoint(35.5F, -15F, -10F);

		bodyModel[169].addBox(0F, 0F, 0F, 3, 16, 7, 0F); // Box 38
		bodyModel[169].setRotationPoint(40.5F, -15F, -10F);

		bodyModel[170].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 38
		bodyModel[170].setRotationPoint(43.5F, -15F, -4F);

		bodyModel[171].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 38
		bodyModel[171].setRotationPoint(43.5F, -15F, 3F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 16, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[172].setRotationPoint(35.5F, -16.25F, -10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 71, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[173].setRotationPoint(-35.5F, -14F, 7F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 71, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275
		bodyModel[174].setRotationPoint(-35.5F, -14F, -10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 71, 0, 2, 0F,0F, 0.165F, 0F, 0F, 0.165F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.165F, 0F, 0F, -0.165F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275 glow
		bodyModel[175].setRotationPoint(-35.5F, -12.99F, -9F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 71, 0, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.165F, 0F, 0F, 0.165F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.165F, 0F, 0F, -0.165F, 0F); // Box 285 glow
		bodyModel[176].setRotationPoint(-35.5F, -12.99F, 7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 91, 2, 1, 0F,0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 170
		bodyModel[177].setRotationPoint(-55.5F, -16.85F, 9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 91, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F); // Box 528
		bodyModel[178].setRotationPoint(-55.5F, -16.85F, -10F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 72, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[179].setRotationPoint(-46.5F, -19F, -6F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 72, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 324
		bodyModel[180].setRotationPoint(-46.5F, -19F, 3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 71, 1, 1, 0F,0F, 0.165F, 0F, 0F, 0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.165F, 0F, 0F, -1.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[181].setRotationPoint(-35.5F, -13F, 9F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 71, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.165F, 0F, 0F, 0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.165F, 0F, 0F, -1.165F, 0F); // Box 276
		bodyModel[182].setRotationPoint(-35.5F, -13F, -10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[183].setRotationPoint(59F, -17.25F, 5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 334
		bodyModel[184].setRotationPoint(59F, -17.25F, -10F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[185].setRotationPoint(-59.5F, -17.25F, -10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 336
		bodyModel[186].setRotationPoint(-59.5F, -17.25F, 5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[187].setRotationPoint(36.5F, -12F, -10F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[188].setRotationPoint(36.5F, -8F, -10F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[189].setRotationPoint(36.5F, -4F, -10F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[190].setRotationPoint(50.05F, -2F, 9.95F);
		bodyModel[190].rotateAngleY = -2.35619449F;

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[191].setRotationPoint(50.4F, -1F, 9.6F);
		bodyModel[191].rotateAngleY = -2.35619449F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[192].setRotationPoint(50.05F, 0.5F, 9.95F);
		bodyModel[192].rotateAngleY = -2.35619449F;

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 368
		bodyModel[193].setRotationPoint(49.15F, -1F, -8.35F);
		bodyModel[193].rotateAngleY = -0.78539816F;

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 369
		bodyModel[194].setRotationPoint(48.45F, 0.5F, -8.35F);
		bodyModel[194].rotateAngleY = -0.78539816F;

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[195].setRotationPoint(47.55F, -2F, -8.9F);
		bodyModel[195].rotateAngleY = -0.78539816F;

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[196].setRotationPoint(44.5F, -6F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[197].setRotationPoint(43.5F, -6F, 7F);

		bodyModel[198].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[198].setRotationPoint(44.25F, -5F, 8.5F);
		bodyModel[198].rotateAngleY = -0.78539816F;

		bodyModel[199].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[199].setRotationPoint(45.5F, -5F, -9F);
		bodyModel[199].rotateAngleY = -0.78539816F;

		bodyModel[200].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 38
		bodyModel[200].setRotationPoint(43.5F, -15F, 4F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 38 cull
		bodyModel[201].setRotationPoint(44.5F, -4F, 4F);

		bodyModel[202].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[202].setRotationPoint(29.5F, -3F, 7F);

		bodyModel[203].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[203].setRotationPoint(29.5F, -8F, 7F);

		bodyModel[204].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[204].setRotationPoint(29.5F, -3F, -7F);

		bodyModel[205].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[205].setRotationPoint(29.5F, -8F, -7F);

		bodyModel[206].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[206].setRotationPoint(19.5F, -3F, 7F);

		bodyModel[207].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[207].setRotationPoint(19.5F, -8F, 7F);

		bodyModel[208].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[208].setRotationPoint(19.5F, -3F, -7F);

		bodyModel[209].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[209].setRotationPoint(19.5F, -8F, -7F);

		bodyModel[210].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[210].setRotationPoint(9.5F, -3F, 7F);

		bodyModel[211].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[211].setRotationPoint(9.5F, -8F, 7F);

		bodyModel[212].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[212].setRotationPoint(9.5F, -3F, -7F);

		bodyModel[213].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[213].setRotationPoint(9.5F, -8F, -7F);

		bodyModel[214].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[214].setRotationPoint(-0.5F, -3F, 7F);

		bodyModel[215].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[215].setRotationPoint(-0.5F, -8F, 7F);

		bodyModel[216].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[216].setRotationPoint(-0.5F, -3F, -7F);

		bodyModel[217].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[217].setRotationPoint(-0.5F, -8F, -7F);

		bodyModel[218].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[218].setRotationPoint(-10.5F, -3F, 7F);

		bodyModel[219].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[219].setRotationPoint(-10.5F, -8F, 7F);

		bodyModel[220].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[220].setRotationPoint(-10.5F, -3F, -7F);

		bodyModel[221].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[221].setRotationPoint(-10.5F, -8F, -7F);

		bodyModel[222].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[222].setRotationPoint(-20.5F, -3F, 7F);

		bodyModel[223].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[223].setRotationPoint(-20.5F, -8F, 7F);

		bodyModel[224].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[224].setRotationPoint(-20.5F, -3F, -7F);

		bodyModel[225].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[225].setRotationPoint(-20.5F, -8F, -7F);

		bodyModel[226].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[226].setRotationPoint(-30.5F, -3F, 7F);

		bodyModel[227].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[227].setRotationPoint(-30.5F, -8F, 7F);

		bodyModel[228].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[228].setRotationPoint(-30.5F, -3F, -7F);

		bodyModel[229].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[229].setRotationPoint(-30.5F, -8F, -7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[230].setRotationPoint(24.5F, -18F, -1F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[231].setRotationPoint(14.5F, -18F, -1F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[232].setRotationPoint(4.5F, -18F, -1F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[233].setRotationPoint(-5.5F, -18F, -1F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[234].setRotationPoint(-15.5F, -18F, -1F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[235].setRotationPoint(-25.5F, -18F, -1F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[236].setRotationPoint(-35.5F, -18F, -1F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[237].setRotationPoint(-45.5F, -18F, -1F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[238].setRotationPoint(-55.5F, -18F, -1F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 92, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[239].setRotationPoint(-56.5F, -10F, -9.9F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 92, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[240].setRotationPoint(-56.5F, -10F, 9.9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[241].setRotationPoint(-57F, 6F, 10.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[242].setRotationPoint(-57F, 6F, -10.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[243].setRotationPoint(-57.5F, 3F, 7F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[244].setRotationPoint(57F, 3F, 7F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 475
		bodyModel[245].setRotationPoint(-57.5F, 3F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 476
		bodyModel[246].setRotationPoint(57F, 3F, -10F);

		bodyModel[247].addBox(0F, 0F, 0F, 49, 1, 0, 0F); // Box 38
		bodyModel[247].setRotationPoint(-28.5F, -13.5F, -11.01F);

		bodyModel[248].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 38
		bodyModel[248].setRotationPoint(-48F, -2.5F, -11.01F);

		bodyModel[249].addBox(0F, 0F, 0F, 49, 1, 0, 0F); // Box 451
		bodyModel[249].setRotationPoint(-28.5F, -13.5F, 11.01F);

		bodyModel[250].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 452
		bodyModel[250].setRotationPoint(-48F, -2.5F, 11.01F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[251].setRotationPoint(-43.5F, -20.5F, -1F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[252].setRotationPoint(-53.5F, -20.5F, -1F);

		bodyModel[253].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[253].setRotationPoint(48.5F, -19F, -7F);
		bodyModel[253].rotateAngleX = 0.2443461F;

		bodyModel[254].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 487
		bodyModel[254].setRotationPoint(48.5F, -19.5F, 5F);
		bodyModel[254].rotateAngleX = -0.2443461F;

		bodyModel[255].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F); // Box 128
		bodyModel[255].setRotationPoint(53F, -17.25F, 10F);
		bodyModel[255].rotateAngleX = 0.41887902F;

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[256].setRotationPoint(53F, -17.65F, -10.92F);
		bodyModel[256].rotateAngleX = -0.41887902F;

		bodyModel[257].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 283
		bodyModel[257].setRotationPoint(-4.5F, 3F, 5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[258].setRotationPoint(-15.5F, 3F, 8F);
		bodyModel[258].rotateAngleX = -0.78539816F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[259].setRotationPoint(-15.51F, 3F, 7.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[260].setRotationPoint(-8.49F, 3F, 7.5F);

		bodyModel[261].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 494
		bodyModel[261].setRotationPoint(-14.5F, 3F, -10F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[262].setRotationPoint(-25.5F, 2.75F, -7.9F);
		bodyModel[262].rotateAngleX = -0.78539816F;

		bodyModel[263].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[263].setRotationPoint(-25.51F, 3F, -8.4F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[264].setRotationPoint(-20.49F, 3F, -8.4F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[265].setRotationPoint(-24.5F, 2.75F, -5.4F);
		bodyModel[265].rotateAngleX = -0.78539816F;

		bodyModel[266].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[266].setRotationPoint(-24.51F, 3F, -5.9F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[267].setRotationPoint(-21.49F, 3F, -5.9F);

		bodyModel[268].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[268].setRotationPoint(52.5F, 3F, -4F);

		bodyModel[269].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[269].setRotationPoint(-56.5F, 3F, -4F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[270].setRotationPoint(-57.5F, 3F, 9.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 480
		bodyModel[271].setRotationPoint(57F, 3F, 9.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[272].setRotationPoint(52.5F, 3F, 4.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[273].setRotationPoint(56.5F, 3F, 4.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[274].setRotationPoint(56.5F, 3F, 7.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[275].setRotationPoint(52.5F, 3F, 7.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1359
		bodyModel[276].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1360
		bodyModel[277].setRotationPoint(52.5F, 4F, 7.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[278].setRotationPoint(52.51F, 3F, 5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[279].setRotationPoint(52.51F, 3F, 7F);

		bodyModel[280].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[280].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[281].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[281].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[282].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[282].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[283].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[283].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[284].addShapeBox(0F, 2F, 0.5F, 4, 0, 2, 0F,0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[284].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[285].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[285].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[286].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[286].setRotationPoint(56.49F, 4F, 8F);

		bodyModel[287].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[287].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[288].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[288].setRotationPoint(56.49F, 4F, 8F);

		bodyModel[289].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[289].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[290].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[290].setRotationPoint(56.49F, 4F, 8F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[291].setRotationPoint(52.5F, 3F, -7.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[292].setRotationPoint(56.5F, 3F, -7.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[293].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[294].setRotationPoint(52.5F, 3F, -10.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[295].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[296].setRotationPoint(52.5F, 4F, -10.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[297].setRotationPoint(52.51F, 3F, -7F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[298].setRotationPoint(52.51F, 3F, -7F);

		bodyModel[299].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[299].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[300].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[300].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[301].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[301].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[302].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[302].setRotationPoint(56.49F, 4F, -8F);

		bodyModel[303].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[303].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[304].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[304].setRotationPoint(56.49F, 4F, -8F);

		bodyModel[305].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[305].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[306].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[306].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[307].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[307].setRotationPoint(56.49F, 4F, -8F);

		bodyModel[308].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[308].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[309].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[309].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[310].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[310].setRotationPoint(-32F, 0F, 4F);

		bodyModel[311].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[311].setRotationPoint(-32F, 0F, -10F);

		bodyModel[312].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[312].setRotationPoint(-30.5F, -5F, 7F);

		bodyModel[313].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[313].setRotationPoint(-30.5F, -3F, 7F);

		bodyModel[314].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[314].setRotationPoint(-30.5F, -5F, 7F);

		bodyModel[315].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[315].setRotationPoint(-30.5F, -4.5F, 7F);

		bodyModel[316].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[316].setRotationPoint(-30.5F, -4F, 7F);

		bodyModel[317].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[317].setRotationPoint(-30.5F, -5F, 7F);

		bodyModel[318].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[318].setRotationPoint(-30.5F, -3F, 7F);

		bodyModel[319].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[319].setRotationPoint(-30.5F, -5F, 7F);

		bodyModel[320].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[320].setRotationPoint(-30.5F, -4.5F, 7F);

		bodyModel[321].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[321].setRotationPoint(-30.5F, -4F, 7F);

		bodyModel[322].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[322].setRotationPoint(-30.5F, -5F, -7F);

		bodyModel[323].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[323].setRotationPoint(-30.5F, -3F, -7F);

		bodyModel[324].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[324].setRotationPoint(-30.5F, -5F, -7F);

		bodyModel[325].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[325].setRotationPoint(-30.5F, -4.5F, -7F);

		bodyModel[326].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[326].setRotationPoint(-30.5F, -4F, -7F);

		bodyModel[327].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[327].setRotationPoint(-30.5F, -5F, -7F);

		bodyModel[328].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[328].setRotationPoint(-30.5F, -3F, -7F);

		bodyModel[329].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[329].setRotationPoint(-30.5F, -5F, -7F);

		bodyModel[330].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[330].setRotationPoint(-30.5F, -4.5F, -7F);

		bodyModel[331].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[331].setRotationPoint(-30.5F, -4F, -7F);

		bodyModel[332].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[332].setRotationPoint(-22F, 0F, 4F);

		bodyModel[333].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[333].setRotationPoint(-22F, 0F, -10F);

		bodyModel[334].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[334].setRotationPoint(-20.5F, -5F, 7F);

		bodyModel[335].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[335].setRotationPoint(-20.5F, -3F, 7F);

		bodyModel[336].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[336].setRotationPoint(-20.5F, -5F, 7F);

		bodyModel[337].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[337].setRotationPoint(-20.5F, -4.5F, 7F);

		bodyModel[338].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[338].setRotationPoint(-20.5F, -4F, 7F);

		bodyModel[339].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[339].setRotationPoint(-20.5F, -5F, 7F);

		bodyModel[340].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[340].setRotationPoint(-20.5F, -3F, 7F);

		bodyModel[341].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[341].setRotationPoint(-20.5F, -5F, 7F);

		bodyModel[342].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[342].setRotationPoint(-20.5F, -4.5F, 7F);

		bodyModel[343].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[343].setRotationPoint(-20.5F, -4F, 7F);

		bodyModel[344].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[344].setRotationPoint(-20.5F, -5F, -7F);

		bodyModel[345].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[345].setRotationPoint(-20.5F, -3F, -7F);

		bodyModel[346].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[346].setRotationPoint(-20.5F, -5F, -7F);

		bodyModel[347].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[347].setRotationPoint(-20.5F, -4.5F, -7F);

		bodyModel[348].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[348].setRotationPoint(-20.5F, -4F, -7F);

		bodyModel[349].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[349].setRotationPoint(-20.5F, -5F, -7F);

		bodyModel[350].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[350].setRotationPoint(-20.5F, -3F, -7F);

		bodyModel[351].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[351].setRotationPoint(-20.5F, -5F, -7F);

		bodyModel[352].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[352].setRotationPoint(-20.5F, -4.5F, -7F);

		bodyModel[353].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[353].setRotationPoint(-2F, 0F, 4F);

		bodyModel[354].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[354].setRotationPoint(-12F, 0F, 4F);

		bodyModel[355].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[355].setRotationPoint(-2F, 0F, -10F);

		bodyModel[356].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[356].setRotationPoint(-12F, 0F, -10F);

		bodyModel[357].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[357].setRotationPoint(-0.5F, -5F, 7F);

		bodyModel[358].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[358].setRotationPoint(-0.5F, -3F, 7F);

		bodyModel[359].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[359].setRotationPoint(-0.5F, -5F, 7F);

		bodyModel[360].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[360].setRotationPoint(-0.5F, -4.5F, 7F);

		bodyModel[361].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[361].setRotationPoint(-0.5F, -4F, 7F);

		bodyModel[362].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[362].setRotationPoint(-0.5F, -5F, 7F);

		bodyModel[363].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[363].setRotationPoint(-0.5F, -3F, 7F);

		bodyModel[364].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[364].setRotationPoint(-0.5F, -5F, 7F);

		bodyModel[365].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[365].setRotationPoint(-0.5F, -4.5F, 7F);

		bodyModel[366].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[366].setRotationPoint(-0.5F, -4F, 7F);

		bodyModel[367].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[367].setRotationPoint(-10.5F, -5F, 7F);

		bodyModel[368].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[368].setRotationPoint(-10.5F, -3F, 7F);

		bodyModel[369].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[369].setRotationPoint(-10.5F, -5F, 7F);

		bodyModel[370].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[370].setRotationPoint(-10.5F, -4.5F, 7F);

		bodyModel[371].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[371].setRotationPoint(-10.5F, -4F, 7F);

		bodyModel[372].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[372].setRotationPoint(-10.5F, -5F, 7F);

		bodyModel[373].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[373].setRotationPoint(-10.5F, -3F, 7F);

		bodyModel[374].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[374].setRotationPoint(-10.5F, -5F, 7F);

		bodyModel[375].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[375].setRotationPoint(-10.5F, -4.5F, 7F);

		bodyModel[376].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[376].setRotationPoint(-10.5F, -4F, 7F);

		bodyModel[377].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[377].setRotationPoint(-0.5F, -5F, -7F);

		bodyModel[378].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[378].setRotationPoint(-0.5F, -3F, -7F);

		bodyModel[379].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[379].setRotationPoint(-0.5F, -5F, -7F);

		bodyModel[380].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[380].setRotationPoint(-0.5F, -4.5F, -7F);

		bodyModel[381].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[381].setRotationPoint(-0.5F, -4F, -7F);

		bodyModel[382].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[382].setRotationPoint(-0.5F, -5F, -7F);

		bodyModel[383].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[383].setRotationPoint(-0.5F, -3F, -7F);

		bodyModel[384].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[384].setRotationPoint(-0.5F, -5F, -7F);

		bodyModel[385].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[385].setRotationPoint(-0.5F, -4.5F, -7F);

		bodyModel[386].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[386].setRotationPoint(-0.5F, -4F, -7F);

		bodyModel[387].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[387].setRotationPoint(-10.5F, -5F, -7F);

		bodyModel[388].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[388].setRotationPoint(-10.5F, -3F, -7F);

		bodyModel[389].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[389].setRotationPoint(-10.5F, -5F, -7F);

		bodyModel[390].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[390].setRotationPoint(-10.5F, -4.5F, -7F);

		bodyModel[391].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[391].setRotationPoint(-10.5F, -4F, -7F);

		bodyModel[392].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[392].setRotationPoint(-10.5F, -5F, -7F);

		bodyModel[393].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[393].setRotationPoint(-10.5F, -3F, -7F);

		bodyModel[394].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[394].setRotationPoint(-10.5F, -5F, -7F);

		bodyModel[395].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[395].setRotationPoint(-10.5F, -4.5F, -7F);

		bodyModel[396].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[396].setRotationPoint(-10.5F, -4F, -7F);

		bodyModel[397].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[397].setRotationPoint(8F, 0F, 4F);

		bodyModel[398].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[398].setRotationPoint(18F, 0F, -10F);

		bodyModel[399].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[399].setRotationPoint(8F, 0F, -10F);

		bodyModel[400].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[400].setRotationPoint(19.5F, -5F, 7F);

		bodyModel[401].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[401].setRotationPoint(19.5F, -3F, 7F);

		bodyModel[402].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[402].setRotationPoint(19.5F, -5F, 7F);

		bodyModel[403].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[403].setRotationPoint(19.5F, -4.5F, 7F);

		bodyModel[404].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[404].setRotationPoint(19.5F, -4F, 7F);

		bodyModel[405].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[405].setRotationPoint(19.5F, -5F, 7F);

		bodyModel[406].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[406].setRotationPoint(19.5F, -3F, 7F);

		bodyModel[407].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[407].setRotationPoint(19.5F, -5F, 7F);

		bodyModel[408].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[408].setRotationPoint(19.5F, -4.5F, 7F);

		bodyModel[409].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[409].setRotationPoint(19.5F, -4F, 7F);

		bodyModel[410].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[410].setRotationPoint(9.5F, -5F, 7F);

		bodyModel[411].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[411].setRotationPoint(9.5F, -3F, 7F);

		bodyModel[412].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[412].setRotationPoint(9.5F, -5F, 7F);

		bodyModel[413].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[413].setRotationPoint(9.5F, -4.5F, 7F);

		bodyModel[414].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[414].setRotationPoint(9.5F, -4F, 7F);

		bodyModel[415].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[415].setRotationPoint(9.5F, -5F, 7F);

		bodyModel[416].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[416].setRotationPoint(9.5F, -3F, 7F);

		bodyModel[417].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[417].setRotationPoint(9.5F, -5F, 7F);

		bodyModel[418].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[418].setRotationPoint(9.5F, -4.5F, 7F);

		bodyModel[419].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[419].setRotationPoint(9.5F, -4F, 7F);

		bodyModel[420].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[420].setRotationPoint(19.5F, -5F, -7F);

		bodyModel[421].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[421].setRotationPoint(19.5F, -3F, -7F);

		bodyModel[422].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[422].setRotationPoint(19.5F, -5F, -7F);

		bodyModel[423].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[423].setRotationPoint(19.5F, -4.5F, -7F);

		bodyModel[424].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[424].setRotationPoint(19.5F, -4F, -7F);

		bodyModel[425].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[425].setRotationPoint(19.5F, -5F, -7F);

		bodyModel[426].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[426].setRotationPoint(19.5F, -3F, -7F);

		bodyModel[427].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[427].setRotationPoint(19.5F, -5F, -7F);

		bodyModel[428].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[428].setRotationPoint(19.5F, -4.5F, -7F);

		bodyModel[429].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[429].setRotationPoint(19.5F, -4F, -7F);

		bodyModel[430].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[430].setRotationPoint(9.5F, -5F, -7F);

		bodyModel[431].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[431].setRotationPoint(9.5F, -3F, -7F);

		bodyModel[432].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[432].setRotationPoint(9.5F, -5F, -7F);

		bodyModel[433].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[433].setRotationPoint(9.5F, -4.5F, -7F);

		bodyModel[434].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[434].setRotationPoint(9.5F, -4F, -7F);

		bodyModel[435].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[435].setRotationPoint(9.5F, -5F, -7F);

		bodyModel[436].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[436].setRotationPoint(9.5F, -3F, -7F);

		bodyModel[437].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[437].setRotationPoint(9.5F, -5F, -7F);

		bodyModel[438].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[438].setRotationPoint(9.5F, -4.5F, -7F);

		bodyModel[439].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[439].setRotationPoint(9.5F, -4F, -7F);

		bodyModel[440].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[440].setRotationPoint(28F, 0F, 4F);

		bodyModel[441].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 638
		bodyModel[441].setRotationPoint(28F, 0F, -10F);

		bodyModel[442].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[442].setRotationPoint(29.5F, -5F, 7F);

		bodyModel[443].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[443].setRotationPoint(29.5F, -3F, 7F);

		bodyModel[444].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[444].setRotationPoint(29.5F, -5F, 7F);

		bodyModel[445].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[445].setRotationPoint(29.5F, -4.5F, 7F);

		bodyModel[446].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[446].setRotationPoint(29.5F, -4F, 7F);

		bodyModel[447].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[447].setRotationPoint(29.5F, -5F, 7F);

		bodyModel[448].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[448].setRotationPoint(29.5F, -3F, 7F);

		bodyModel[449].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[449].setRotationPoint(29.5F, -5F, 7F);

		bodyModel[450].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[450].setRotationPoint(29.5F, -4.5F, 7F);

		bodyModel[451].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[451].setRotationPoint(29.5F, -4F, 7F);

		bodyModel[452].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[452].setRotationPoint(29.5F, -5F, -7F);

		bodyModel[453].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[453].setRotationPoint(29.5F, -3F, -7F);

		bodyModel[454].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[454].setRotationPoint(29.5F, -5F, -7F);

		bodyModel[455].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[455].setRotationPoint(29.5F, -4.5F, -7F);

		bodyModel[456].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[456].setRotationPoint(29.5F, -4F, -7F);

		bodyModel[457].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[457].setRotationPoint(29.5F, -5F, -7F);

		bodyModel[458].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[458].setRotationPoint(29.5F, -3F, -7F);

		bodyModel[459].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[459].setRotationPoint(29.5F, -5F, -7F);

		bodyModel[460].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[460].setRotationPoint(29.5F, -4.5F, -7F);

		bodyModel[461].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[461].setRotationPoint(29.5F, -4F, -7F);

		bodyModel[462].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[462].setRotationPoint(18F, 0F, 4F);

		bodyModel[463].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[463].setRotationPoint(-20.5F, -4F, -7F);

		bodyModel[464].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[464].setRotationPoint(-40.5F, -3F, 7F);

		bodyModel[465].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[465].setRotationPoint(-40.5F, -8F, 7F);

		bodyModel[466].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[466].setRotationPoint(-40.5F, -3F, -7F);

		bodyModel[467].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[467].setRotationPoint(-40.5F, -8F, -7F);

		bodyModel[468].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[468].setRotationPoint(-50.5F, -3F, 7F);

		bodyModel[469].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[469].setRotationPoint(-50.5F, -8F, 7F);

		bodyModel[470].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[470].setRotationPoint(-50.5F, -3F, -7F);

		bodyModel[471].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[471].setRotationPoint(-50.5F, -8F, -7F);

		bodyModel[472].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[472].setRotationPoint(-52F, 0F, 4F);

		bodyModel[473].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[473].setRotationPoint(-52F, 0F, -10F);

		bodyModel[474].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[474].setRotationPoint(-50.5F, -5F, 7F);

		bodyModel[475].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[475].setRotationPoint(-50.5F, -3F, 7F);

		bodyModel[476].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[476].setRotationPoint(-50.5F, -5F, 7F);

		bodyModel[477].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[477].setRotationPoint(-50.5F, -4.5F, 7F);

		bodyModel[478].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[478].setRotationPoint(-50.5F, -4F, 7F);

		bodyModel[479].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[479].setRotationPoint(-50.5F, -5F, 7F);

		bodyModel[480].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[480].setRotationPoint(-50.5F, -3F, 7F);

		bodyModel[481].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[481].setRotationPoint(-50.5F, -5F, 7F);

		bodyModel[482].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[482].setRotationPoint(-50.5F, -4.5F, 7F);

		bodyModel[483].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[483].setRotationPoint(-50.5F, -4F, 7F);

		bodyModel[484].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[484].setRotationPoint(-50.5F, -5F, -7F);

		bodyModel[485].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[485].setRotationPoint(-50.5F, -3F, -7F);

		bodyModel[486].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[486].setRotationPoint(-50.5F, -5F, -7F);

		bodyModel[487].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[487].setRotationPoint(-50.5F, -4.5F, -7F);

		bodyModel[488].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[488].setRotationPoint(-50.5F, -4F, -7F);

		bodyModel[489].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[489].setRotationPoint(-50.5F, -5F, -7F);

		bodyModel[490].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[490].setRotationPoint(-50.5F, -5F, -7F);

		bodyModel[491].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[491].setRotationPoint(-50.5F, -4.5F, -7F);

		bodyModel[492].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[492].setRotationPoint(-50.5F, -4F, -7F);

		bodyModel[493].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[493].setRotationPoint(-42F, 0F, 4F);

		bodyModel[494].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[494].setRotationPoint(-42F, 0F, -10F);

		bodyModel[495].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[495].setRotationPoint(-40.5F, -5F, 7F);

		bodyModel[496].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[496].setRotationPoint(-40.5F, -3F, 7F);

		bodyModel[497].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[497].setRotationPoint(-40.5F, -5F, 7F);

		bodyModel[498].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[498].setRotationPoint(-40.5F, -4.5F, 7F);

		bodyModel[499].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[499].setRotationPoint(-40.5F, -4F, 7F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 141, 341, textureX, textureY); // Right seat part
		bodyModel[501] = new ModelRendererTurbo(this, 146, 344, textureX, textureY); // Right seat part
		bodyModel[502] = new ModelRendererTurbo(this, 148, 341, textureX, textureY); // Right seat part
		bodyModel[503] = new ModelRendererTurbo(this, 141, 344, textureX, textureY); // Right seat part
		bodyModel[504] = new ModelRendererTurbo(this, 155, 341, textureX, textureY); // Right seat part
		bodyModel[505] = new ModelRendererTurbo(this, 141, 361, textureX, textureY); // Left seat part
		bodyModel[506] = new ModelRendererTurbo(this, 146, 364, textureX, textureY); // Left seat part
		bodyModel[507] = new ModelRendererTurbo(this, 148, 361, textureX, textureY); // Left seat part
		bodyModel[508] = new ModelRendererTurbo(this, 141, 364, textureX, textureY); // Left seat part
		bodyModel[509] = new ModelRendererTurbo(this, 155, 361, textureX, textureY); // Left seat part
		bodyModel[510] = new ModelRendererTurbo(this, 141, 369, textureX, textureY); // Left seat part
		bodyModel[511] = new ModelRendererTurbo(this, 146, 372, textureX, textureY); // Left seat part
		bodyModel[512] = new ModelRendererTurbo(this, 148, 369, textureX, textureY); // Left seat part
		bodyModel[513] = new ModelRendererTurbo(this, 141, 372, textureX, textureY); // Left seat part
		bodyModel[514] = new ModelRendererTurbo(this, 155, 369, textureX, textureY); // Left seat part
		bodyModel[515] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Box 38
		bodyModel[516] = new ModelRendererTurbo(this, 25, 318, textureX, textureY); // Box 38
		bodyModel[517] = new ModelRendererTurbo(this, 29, 304, textureX, textureY); // Box 128
		bodyModel[518] = new ModelRendererTurbo(this, 29, 267, textureX, textureY); // Box 177
		bodyModel[519] = new ModelRendererTurbo(this, 22, 304, textureX, textureY); // Box 128
		bodyModel[520] = new ModelRendererTurbo(this, 31, 267, textureX, textureY); // Box 185
		bodyModel[521] = new ModelRendererTurbo(this, 25, 310, textureX, textureY); // Box 128
		bodyModel[522] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Box 128
		bodyModel[523] = new ModelRendererTurbo(this, 22, 267, textureX, textureY); // Box 128
		bodyModel[524] = new ModelRendererTurbo(this, 31, 304, textureX, textureY); // Box 128
		bodyModel[525] = new ModelRendererTurbo(this, 89, 282, textureX, textureY); // Box 128
		bodyModel[526] = new ModelRendererTurbo(this, 89, 317, textureX, textureY); // Box 128
		bodyModel[527] = new ModelRendererTurbo(this, 84, 280, textureX, textureY); // Box 128
		bodyModel[528] = new ModelRendererTurbo(this, 84, 315, textureX, textureY); // Box 128
		bodyModel[529] = new ModelRendererTurbo(this, 89, 274, textureX, textureY); // Box 128
		bodyModel[530] = new ModelRendererTurbo(this, 90, 278, textureX, textureY); // Box 128
		bodyModel[531] = new ModelRendererTurbo(this, 89, 309, textureX, textureY); // Box 320
		bodyModel[532] = new ModelRendererTurbo(this, 90, 313, textureX, textureY); // Box 321
		bodyModel[533] = new ModelRendererTurbo(this, 40, 274, textureX, textureY); // Box 128
		bodyModel[534] = new ModelRendererTurbo(this, 40, 271, textureX, textureY); // Box 128
		bodyModel[535] = new ModelRendererTurbo(this, 40, 310, textureX, textureY); // Box 329
		bodyModel[536] = new ModelRendererTurbo(this, 40, 307, textureX, textureY); // Box 330
		bodyModel[537] = new ModelRendererTurbo(this, 40, 268, textureX, textureY); // Box 128
		bodyModel[538] = new ModelRendererTurbo(this, 40, 304, textureX, textureY); // Box 332
		bodyModel[539] = new ModelRendererTurbo(this, 40, 281, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[540] = new ModelRendererTurbo(this, 40, 317, textureX, textureY,"lamp"); // Box 340 glow
		bodyModel[541] = new ModelRendererTurbo(this, 95, 148, textureX, textureY); // Box 2
		bodyModel[542] = new ModelRendererTurbo(this, 95, 138, textureX, textureY); // Box 41
		bodyModel[543] = new ModelRendererTurbo(this, 232, 148, textureX, textureY); // Box 2
		bodyModel[544] = new ModelRendererTurbo(this, 232, 138, textureX, textureY); // Box 41
		bodyModel[545] = new ModelRendererTurbo(this, 153, 414, textureX, textureY); // Box 38
		bodyModel[546] = new ModelRendererTurbo(this, 132, 424, textureX, textureY); // Box 38
		bodyModel[547] = new ModelRendererTurbo(this, 62, 384, textureX, textureY); // Box 128
		bodyModel[548] = new ModelRendererTurbo(this, 62, 378, textureX, textureY); // Box 177
		bodyModel[549] = new ModelRendererTurbo(this, 77, 388, textureX, textureY); // Box 128
		bodyModel[550] = new ModelRendererTurbo(this, 63, 396, textureX, textureY); // Box 128
		bodyModel[551] = new ModelRendererTurbo(this, 63, 390, textureX, textureY); // Box 185
		bodyModel[552] = new ModelRendererTurbo(this, 77, 404, textureX, textureY); // Box 128
		bodyModel[553] = new ModelRendererTurbo(this, 71, 420, textureX, textureY); // Box 128
		bodyModel[554] = new ModelRendererTurbo(this, 54, 217, textureX, textureY); // Box 128
		bodyModel[555] = new ModelRendererTurbo(this, 54, 204, textureX, textureY); // Box 324
		bodyModel[556] = new ModelRendererTurbo(this, 154, 442, textureX, textureY); // Box 38
		bodyModel[557] = new ModelRendererTurbo(this, 120, 442, textureX, textureY); // Box 38
		bodyModel[558] = new ModelRendererTurbo(this, 165, 442, textureX, textureY); // Box 38
		bodyModel[559] = new ModelRendererTurbo(this, 222, 338, textureX, textureY); // Box 38
		bodyModel[560] = new ModelRendererTurbo(this, 275, 373, textureX, textureY); // Box 128
		bodyModel[561] = new ModelRendererTurbo(this, 275, 367, textureX, textureY); // Box 177
		bodyModel[562] = new ModelRendererTurbo(this, 227, 367, textureX, textureY); // Box 128
		bodyModel[563] = new ModelRendererTurbo(this, 276, 385, textureX, textureY); // Box 128
		bodyModel[564] = new ModelRendererTurbo(this, 276, 379, textureX, textureY); // Box 185
		bodyModel[565] = new ModelRendererTurbo(this, 227, 383, textureX, textureY); // Box 128
		bodyModel[566] = new ModelRendererTurbo(this, 256, 391, textureX, textureY); // Box 128
		bodyModel[567] = new ModelRendererTurbo(this, 317, 366, textureX, textureY); // Box 38
		bodyModel[568] = new ModelRendererTurbo(this, 304, 366, textureX, textureY); // Box 38
		bodyModel[569] = new ModelRendererTurbo(this, 352, 339, textureX, textureY); // Box 38
		bodyModel[570] = new ModelRendererTurbo(this, 352, 348, textureX, textureY); // Box 38
		bodyModel[571] = new ModelRendererTurbo(this, 352, 357, textureX, textureY); // Box 38
		bodyModel[572] = new ModelRendererTurbo(this, 338, 352, textureX, textureY); // Box 38
		bodyModel[573] = new ModelRendererTurbo(this, 354, 366, textureX, textureY); // Box 38
		bodyModel[574] = new ModelRendererTurbo(this, 354, 372, textureX, textureY); // Box 38
		bodyModel[575] = new ModelRendererTurbo(this, 354, 378, textureX, textureY); // Box 38
		bodyModel[576] = new ModelRendererTurbo(this, 327, 345, textureX, textureY); // Box 38
		bodyModel[577] = new ModelRendererTurbo(this, 306, 348, textureX, textureY); // Box 38
		bodyModel[578] = new ModelRendererTurbo(this, 343, 366, textureX, textureY); // Box 38
		bodyModel[579] = new ModelRendererTurbo(this, 328, 367, textureX, textureY); // Box 38
		bodyModel[580] = new ModelRendererTurbo(this, 330, 372, textureX, textureY); // Box 38
		bodyModel[581] = new ModelRendererTurbo(this, 279, 348, textureX, textureY); // Box 38
		bodyModel[582] = new ModelRendererTurbo(this, 262, 352, textureX, textureY); // Box 38
		bodyModel[583] = new ModelRendererTurbo(this, 247, 345, textureX, textureY); // Box 38
		bodyModel[584] = new ModelRendererTurbo(this, 274, 347, textureX, textureY); // Box 38
		bodyModel[585] = new ModelRendererTurbo(this, 133, 443, textureX, textureY); // Box 38
		bodyModel[586] = new ModelRendererTurbo(this, 135, 448, textureX, textureY); // Box 38
		bodyModel[587] = new ModelRendererTurbo(this, 143, 411, textureX, textureY); // Box 340
		bodyModel[588] = new ModelRendererTurbo(this, 146, 416, textureX, textureY); // Box 41
		bodyModel[589] = new ModelRendererTurbo(this, 130, 411, textureX, textureY); // Box 38
		bodyModel[590] = new ModelRendererTurbo(this, 133, 416, textureX, textureY); // Box 38
		bodyModel[591] = new ModelRendererTurbo(this, 132, 420, textureX, textureY); // Box 38
		bodyModel[592] = new ModelRendererTurbo(this, 154, 406, textureX, textureY); // Box 38
		bodyModel[593] = new ModelRendererTurbo(this, 161, 359, textureX, textureY); // Box 38
		bodyModel[594] = new ModelRendererTurbo(this, 161, 398, textureX, textureY); // Box 38
		bodyModel[595] = new ModelRendererTurbo(this, 162, 351, textureX, textureY); // Box 38
		bodyModel[596] = new ModelRendererTurbo(this, 162, 390, textureX, textureY); // Box 38
		bodyModel[597] = new ModelRendererTurbo(this, 163, 393, textureX, textureY); // Box 38
		bodyModel[598] = new ModelRendererTurbo(this, 163, 354, textureX, textureY); // Box 38
		bodyModel[599] = new ModelRendererTurbo(this, 163, 376, textureX, textureY); // Box 38
		bodyModel[600] = new ModelRendererTurbo(this, 164, 374, textureX, textureY); // Box 38
		bodyModel[601] = new ModelRendererTurbo(this, 166, 374, textureX, textureY); // Box 38
		bodyModel[602] = new ModelRendererTurbo(this, 168, 374, textureX, textureY); // Box 38
		bodyModel[603] = new ModelRendererTurbo(this, 173, 375, textureX, textureY); // Box 38
		bodyModel[604] = new ModelRendererTurbo(this, 175, 378, textureX, textureY); // Box 38
		bodyModel[605] = new ModelRendererTurbo(this, 163, 337, textureX, textureY); // Box 617
		bodyModel[606] = new ModelRendererTurbo(this, 164, 335, textureX, textureY); // Box 618
		bodyModel[607] = new ModelRendererTurbo(this, 166, 335, textureX, textureY); // Box 619
		bodyModel[608] = new ModelRendererTurbo(this, 168, 335, textureX, textureY); // Box 620
		bodyModel[609] = new ModelRendererTurbo(this, 173, 336, textureX, textureY); // Box 621
		bodyModel[610] = new ModelRendererTurbo(this, 175, 339, textureX, textureY); // Box 622
		bodyModel[611] = new ModelRendererTurbo(this, 175, 350, textureX, textureY); // Box 38
		bodyModel[612] = new ModelRendererTurbo(this, 177, 355, textureX, textureY); // Box 38
		bodyModel[613] = new ModelRendererTurbo(this, 177, 363, textureX, textureY); // Box 276
		bodyModel[614] = new ModelRendererTurbo(this, 175, 358, textureX, textureY); // Box 275
		bodyModel[615] = new ModelRendererTurbo(this, 178, 413, textureX, textureY); // Box 38
		bodyModel[616] = new ModelRendererTurbo(this, 180, 418, textureX, textureY); // Box 38
		bodyModel[617] = new ModelRendererTurbo(this, 180, 429, textureX, textureY); // Box 276
		bodyModel[618] = new ModelRendererTurbo(this, 178, 424, textureX, textureY); // Box 275
		bodyModel[619] = new ModelRendererTurbo(this, 179, 421, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[620] = new ModelRendererTurbo(this, 179, 432, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[621] = new ModelRendererTurbo(this, 115, 372, textureX, textureY); // Left seat part
		bodyModel[622] = new ModelRendererTurbo(this, 232, 204, textureX, textureY); // Box 324
		bodyModel[623] = new ModelRendererTurbo(this, 232, 217, textureX, textureY); // Box 128
		bodyModel[624] = new ModelRendererTurbo(this, 375, 283, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[625] = new ModelRendererTurbo(this, 84, 202, textureX, textureY,"lamp"); // Box 324 glow
		bodyModel[626] = new ModelRendererTurbo(this, 84, 222, textureX, textureY,"lamp"); // Box 338 glow
		bodyModel[627] = new ModelRendererTurbo(this, 198, 174, textureX, textureY); // Box 41
		bodyModel[628] = new ModelRendererTurbo(this, 198, 172, textureX, textureY); // Box 41
		bodyModel[629] = new ModelRendererTurbo(this, 218, 172, textureX, textureY); // Box 41

		bodyModel[500].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[500].setRotationPoint(-40.5F, -5F, 7F);

		bodyModel[501].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[501].setRotationPoint(-40.5F, -3F, 7F);

		bodyModel[502].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[502].setRotationPoint(-40.5F, -5F, 7F);

		bodyModel[503].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[503].setRotationPoint(-40.5F, -4.5F, 7F);

		bodyModel[504].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[504].setRotationPoint(-40.5F, -4F, 7F);

		bodyModel[505].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[505].setRotationPoint(-40.5F, -5F, -7F);

		bodyModel[506].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[506].setRotationPoint(-40.5F, -3F, -7F);

		bodyModel[507].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[507].setRotationPoint(-40.5F, -5F, -7F);

		bodyModel[508].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[508].setRotationPoint(-40.5F, -4.5F, -7F);

		bodyModel[509].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[509].setRotationPoint(-40.5F, -4F, -7F);

		bodyModel[510].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[510].setRotationPoint(-40.5F, -5F, -7F);

		bodyModel[511].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[511].setRotationPoint(-40.5F, -3F, -7F);

		bodyModel[512].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[512].setRotationPoint(-40.5F, -5F, -7F);

		bodyModel[513].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[513].setRotationPoint(-40.5F, -4.5F, -7F);

		bodyModel[514].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[514].setRotationPoint(-40.5F, -4F, -7F);

		bodyModel[515].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 38
		bodyModel[515].setRotationPoint(-56.5F, -15F, 4F);

		bodyModel[516].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 38
		bodyModel[516].setRotationPoint(-56.5F, -15F, -10F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[517].setRotationPoint(-56.5F, -19F, -7F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[518].setRotationPoint(-56.5F, -19F, 6F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[519].setRotationPoint(-56.5F, -18F, -10F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185
		bodyModel[520].setRotationPoint(-56.5F, -18F, 7F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[521].setRotationPoint(-56.5F, -16.25F, -10F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[522].setRotationPoint(-56.5F, -16.25F, 4F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[523].setRotationPoint(-56.5F, -18F, 4F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[524].setRotationPoint(-56.5F, -18F, -7F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[525].setRotationPoint(-35.5F, -15F, 7F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[526].setRotationPoint(-35.5F, -15F, -10F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F); // Box 128
		bodyModel[527].setRotationPoint(-35.5F, -16.75F, 7F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F); // Box 128
		bodyModel[528].setRotationPoint(-35.5F, -16.75F, -9.15F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.15F, 0F, -1.25F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0.15F); // Box 128
		bodyModel[529].setRotationPoint(-35.5F, -18F, 7F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F); // Box 128
		bodyModel[530].setRotationPoint(-35.5F, -16.75F, 9.15F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.25F, 0.15F, 0F, -1.25F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 320
		bodyModel[531].setRotationPoint(-35.5F, -18F, -9F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 321
		bodyModel[532].setRotationPoint(-35.5F, -16.75F, -10.15F);

		bodyModel[533].addBox(0F, 0F, 0F, 20, 5, 1, 0F); // Box 128
		bodyModel[533].setRotationPoint(-55.5F, -16F, 9F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 128
		bodyModel[534].setRotationPoint(-55.5F, -16.85F, 9F);

		bodyModel[535].addBox(0F, 0F, 0F, 20, 5, 1, 0F); // Box 329
		bodyModel[535].setRotationPoint(-55.5F, -16F, -10F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 330
		bodyModel[536].setRotationPoint(-55.5F, -16.85F, -10F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 128
		bodyModel[537].setRotationPoint(-55.5F, -17.45F, 8F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 332
		bodyModel[538].setRotationPoint(-55.5F, -17.45F, -9F);

		bodyModel[539].addBox(0F, 0F, 0F, 20, 0, 1, 0F); // Box 128 glow
		bodyModel[539].setRotationPoint(-55.5F, -10.99F, 9F);

		bodyModel[540].addBox(0F, 0F, 0F, 20, 0, 1, 0F); // Box 340 glow
		bodyModel[540].setRotationPoint(-55.5F, -10.99F, -10F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[541].setRotationPoint(-42.5F, 3F, 10.5F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[542].setRotationPoint(-42.5F, 3F, -11F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[543].setRotationPoint(39.5F, 3F, 10.5F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[544].setRotationPoint(39.5F, 3F, -11F);

		bodyModel[545].addBox(0F, 0F, 0F, 1, 16, 11, 0F); // Box 38
		bodyModel[545].setRotationPoint(-47.5F, -15F, -1F);

		bodyModel[546].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 38
		bodyModel[546].setRotationPoint(-56.5F, -15F, 3F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[547].setRotationPoint(-56.5F, -19F, -7F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[548].setRotationPoint(-56.5F, -19F, 3F);

		bodyModel[549].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 128
		bodyModel[549].setRotationPoint(-56.5F, -18F, -7F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[550].setRotationPoint(-56.5F, -18F, -10F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185
		bodyModel[551].setRotationPoint(-56.5F, -18F, 7F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 10, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[552].setRotationPoint(-56.5F, -17F, -7F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[553].setRotationPoint(-56.5F, -16.25F, -10F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[554].setRotationPoint(-56.5F, -19F, -6F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 324
		bodyModel[555].setRotationPoint(-56.5F, -19F, 3F);

		bodyModel[556].addBox(0F, 0F, 0F, 1, 16, 4, 0F); // Box 38
		bodyModel[556].setRotationPoint(-47.5F, -15F, -10F);

		bodyModel[557].addBox(0F, 0F, 0F, 2, 16, 4, 0F); // Box 38
		bodyModel[557].setRotationPoint(-56.5F, -15F, -10F);

		bodyModel[558].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 38
		bodyModel[558].setRotationPoint(-47.5F, -15F, -6F);

		bodyModel[559].addBox(0F, 0F, 0F, 1, 16, 11, 0F); // Box 38
		bodyModel[559].setRotationPoint(25.5F, -15F, -1F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[560].setRotationPoint(25.5F, -19F, -7F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[561].setRotationPoint(25.5F, -19F, 3F);

		bodyModel[562].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 128
		bodyModel[562].setRotationPoint(25.5F, -18F, -7F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[563].setRotationPoint(25.5F, -18F, -10F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185
		bodyModel[564].setRotationPoint(25.5F, -18F, 7F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 10, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[565].setRotationPoint(25.5F, -17F, -7F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[566].setRotationPoint(25.5F, -16.25F, -10F);

		bodyModel[567].addBox(0F, 0F, 0F, 1, 16, 4, 0F); // Box 38
		bodyModel[567].setRotationPoint(25.5F, -15F, -10F);

		bodyModel[568].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 38
		bodyModel[568].setRotationPoint(25.5F, -15F, -6F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[569].setRotationPoint(43.5F, -11F, 3F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[570].setRotationPoint(43.5F, -6F, 3F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[571].setRotationPoint(43.5F, -1F, 3F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[572].setRotationPoint(43.5F, -5F, 3F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[573].setRotationPoint(31.5F, -11F, -10F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[574].setRotationPoint(31.5F, -6F, -10F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[575].setRotationPoint(31.5F, -1F, -10F);

		bodyModel[576].addBox(0F, 0F, 0F, 1, 16, 4, 0F); // Box 38
		bodyModel[576].setRotationPoint(35.5F, -15F, -1F);

		bodyModel[577].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 38
		bodyModel[577].setRotationPoint(26.5F, -15F, -1F);

		bodyModel[578].addBox(0F, 0F, 0F, 1, 16, 4, 0F); // Box 38
		bodyModel[578].setRotationPoint(30.5F, -15F, -10F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[579].setRotationPoint(26.5F, -11F, -10F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38
		bodyModel[580].setRotationPoint(26.5F, -9F, -8.25F);
		bodyModel[580].rotateAngleX = -0.78539816F;

		bodyModel[581].addBox(0F, 0F, 0F, 3, 7, 10, 0F); // Box 38
		bodyModel[581].setRotationPoint(32.5F, -6F, 0F);

		bodyModel[582].addBox(0F, 0F, 0F, 2, 7, 6, 0F); // Box 38
		bodyModel[582].setRotationPoint(26.5F, -6F, 0F);

		bodyModel[583].addBox(0F, 0F, 0F, 2, 16, 4, 0F); // Box 38
		bodyModel[583].setRotationPoint(26.5F, -15F, 6F);

		bodyModel[584].addBox(0F, 0F, 0F, 2, 0, 10, 0F); // Box 38
		bodyModel[584].setRotationPoint(33.5F, -8F, 0F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[585].setRotationPoint(-54.5F, -11F, -10F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38
		bodyModel[586].setRotationPoint(-54.5F, -9F, -8.25F);
		bodyModel[586].rotateAngleX = -0.78539816F;

		bodyModel[587].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[587].setRotationPoint(-49.5F, -6F, 7F);

		bodyModel[588].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[588].setRotationPoint(-48.75F, -5F, 8.5F);
		bodyModel[588].rotateAngleY = -0.78539816F;

		bodyModel[589].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[589].setRotationPoint(-56.45F, -2F, 8.55F);
		bodyModel[589].rotateAngleY = -0.78539816F;

		bodyModel[590].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[590].setRotationPoint(-56.1F, -1F, 8.9F);
		bodyModel[590].rotateAngleY = -0.78539816F;

		bodyModel[591].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[591].setRotationPoint(-56.45F, 0.5F, 8.55F);
		bodyModel[591].rotateAngleY = -0.78539816F;

		bodyModel[592].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 38
		bodyModel[592].setRotationPoint(-48.5F, -15F, 4F);

		bodyModel[593].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 38
		bodyModel[593].setRotationPoint(4.5F, -7F, 3F);

		bodyModel[594].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 38
		bodyModel[594].setRotationPoint(4.5F, -7F, -10F);

		bodyModel[595].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 38
		bodyModel[595].setRotationPoint(4.5F, -8F, 4F);

		bodyModel[596].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 38
		bodyModel[596].setRotationPoint(4.5F, -8F, -10F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[597].setRotationPoint(4.5F, -8F, -4F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[598].setRotationPoint(4.5F, -8F, 3F);

		bodyModel[599].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 38
		bodyModel[599].setRotationPoint(5F, -15F, -10F);

		bodyModel[600].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 38
		bodyModel[600].setRotationPoint(5F, -17F, -9F);

		bodyModel[601].addBox(0F, 0F, 0F, 0, 1, 3, 0F); // Box 38
		bodyModel[601].setRotationPoint(5F, -18F, -7F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[602].setRotationPoint(5F, -19F, -7F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[603].setRotationPoint(5F, -18F, -9F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[604].setRotationPoint(5F, -17F, -10F);

		bodyModel[605].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 617
		bodyModel[605].setRotationPoint(5F, -15F, 4F);

		bodyModel[606].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 618
		bodyModel[606].setRotationPoint(5F, -17F, 4F);

		bodyModel[607].addBox(0F, 0F, 0F, 0, 1, 3, 0F); // Box 619
		bodyModel[607].setRotationPoint(5F, -18F, 4F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		bodyModel[608].setRotationPoint(5F, -19F, 6F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 621
		bodyModel[609].setRotationPoint(5F, -18F, 7F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		bodyModel[610].setRotationPoint(5F, -17F, 9F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[611].setRotationPoint(5.5F, -14F, 7F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0.165F, 0F, 0F, 0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.165F, 0F, 0F, -1.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[612].setRotationPoint(5.5F, -13F, 9F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.165F, 0F, 0F, 0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.165F, 0F, 0F, -1.165F, 0F); // Box 276
		bodyModel[613].setRotationPoint(5.5F, -13F, -10F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275
		bodyModel[614].setRotationPoint(5.5F, -14F, -10F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[615].setRotationPoint(-46.5F, -14F, 7F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 51, 1, 1, 0F,0F, 0.165F, 0F, 0F, 0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.165F, 0F, 0F, -1.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[616].setRotationPoint(-46.5F, -13F, 9F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 51, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.165F, 0F, 0F, 0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.165F, 0F, 0F, -1.165F, 0F); // Box 276
		bodyModel[617].setRotationPoint(-46.5F, -13F, -10F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275
		bodyModel[618].setRotationPoint(-46.5F, -14F, -10F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 11, 0, 2, 0F,0F, 0.165F, 0F, 0F, 0.165F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.165F, 0F, 0F, -0.165F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275 glow
		bodyModel[619].setRotationPoint(-46.5F, -12.99F, -9F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 11, 0, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.165F, 0F, 0F, 0.165F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.165F, 0F, 0F, -0.165F, 0F); // Box 285 glow
		bodyModel[620].setRotationPoint(-46.5F, -12.99F, 7F);

		bodyModel[621].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[621].setRotationPoint(-50.5F, -3F, -7F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 324
		bodyModel[622].setRotationPoint(25.5F, -19F, 3F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[623].setRotationPoint(25.5F, -19F, -6F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[624].setRotationPoint(42.5F, -14.99F, -0.5F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 92, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324 glow
		bodyModel[625].setRotationPoint(-56.5F, -18.25F, 6.01F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 92, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338 glow
		bodyModel[626].setRotationPoint(-56.5F, -18.25F, -6.01F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[627].setRotationPoint(19.5F, 4F, 0F);
		bodyModel[627].rotateAngleX = -0.78539816F;

		bodyModel[628].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[628].setRotationPoint(19.49F, 4F, -0.5F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[629].setRotationPoint(27.51F, 4F, -0.5F);
	}
	ModelPS_Truck_41CDO bogie1 = new ModelPS_Truck_41CDO();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 630; i++)
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
			GL11.glTranslated(2.57, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.14, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-CDO_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.57, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.14, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}