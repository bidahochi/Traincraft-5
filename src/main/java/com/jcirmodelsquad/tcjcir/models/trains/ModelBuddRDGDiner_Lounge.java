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

public class ModelBuddRDGDiner_Lounge extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBuddRDGDiner_Lounge() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[530];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 310, 119, textureX, textureY); // Box 2
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
		bodyModel[21] = new ModelRendererTurbo(this, 310, 123, textureX, textureY); // Box 2
		bodyModel[22] = new ModelRendererTurbo(this, 260, 151, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[23] = new ModelRendererTurbo(this, 253, 151, textureX, textureY); // Box 2
		bodyModel[24] = new ModelRendererTurbo(this, 260, 141, textureX, textureY,"cull"); // Box 27 cull
		bodyModel[25] = new ModelRendererTurbo(this, 253, 141, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 258, 148, textureX, textureY); // Box 2
		bodyModel[27] = new ModelRendererTurbo(this, 277, 148, textureX, textureY); // Box 2
		bodyModel[28] = new ModelRendererTurbo(this, 277, 151, textureX, textureY); // Box 2
		bodyModel[29] = new ModelRendererTurbo(this, 277, 141, textureX, textureY); // Box 192
		bodyModel[30] = new ModelRendererTurbo(this, 100, 87, textureX, textureY); // Box 38
		bodyModel[31] = new ModelRendererTurbo(this, 100, 68, textureX, textureY); // Box 128
		bodyModel[32] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[33] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[34] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[35] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[36] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[37] = new ModelRendererTurbo(this, 317, 95, textureX, textureY); // Box 128
		bodyModel[38] = new ModelRendererTurbo(this, 320, 95, textureX, textureY); // Box 128
		bodyModel[39] = new ModelRendererTurbo(this, 317, 76, textureX, textureY); // Box 202
		bodyModel[40] = new ModelRendererTurbo(this, 320, 76, textureX, textureY); // Box 203
		bodyModel[41] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[42] = new ModelRendererTurbo(this, 434, 23, textureX, textureY); // Box 128
		bodyModel[43] = new ModelRendererTurbo(this, 434, 35, textureX, textureY); // Box 128
		bodyModel[44] = new ModelRendererTurbo(this, 410, 2, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 424, 1, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 445, 35, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 381, 44, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 360, 86, textureX, textureY); // Box 38
		bodyModel[51] = new ModelRendererTurbo(this, 365, 99, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 364, 95, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 363, 90, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 361, 83, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 360, 67, textureX, textureY); // Box 248
		bodyModel[56] = new ModelRendererTurbo(this, 365, 71, textureX, textureY); // Box 250
		bodyModel[57] = new ModelRendererTurbo(this, 364, 74, textureX, textureY); // Box 252
		bodyModel[58] = new ModelRendererTurbo(this, 363, 78, textureX, textureY); // Box 254
		bodyModel[59] = new ModelRendererTurbo(this, 355, 86, textureX, textureY); // Box 38
		bodyModel[60] = new ModelRendererTurbo(this, 378, 101, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 384, 66, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 377, 95, textureX, textureY); // Box 128
		bodyModel[63] = new ModelRendererTurbo(this, 378, 90, textureX, textureY); // Box 128
		bodyModel[64] = new ModelRendererTurbo(this, 374, 82, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 394, 48, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 355, 66, textureX, textureY); // Box 247
		bodyModel[67] = new ModelRendererTurbo(this, 378, 67, textureX, textureY); // Box 249
		bodyModel[68] = new ModelRendererTurbo(this, 377, 71, textureX, textureY); // Box 251
		bodyModel[69] = new ModelRendererTurbo(this, 378, 77, textureX, textureY); // Box 253
		bodyModel[70] = new ModelRendererTurbo(this, 384, 48, textureX, textureY); // Box 255
		bodyModel[71] = new ModelRendererTurbo(this, 396, 53, textureX, textureY); // Box 128
		bodyModel[72] = new ModelRendererTurbo(this, 378, 53, textureX, textureY); // Box 261
		bodyModel[73] = new ModelRendererTurbo(this, 391, 18, textureX, textureY); // Box 128
		bodyModel[74] = new ModelRendererTurbo(this, 20, 43, textureX, textureY); // Box 128
		bodyModel[75] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 47, 77, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[83] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[84] = new ModelRendererTurbo(this, 17, 101, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 26, 99, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 5, 130, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 16, 95, textureX, textureY); // Box 128
		bodyModel[88] = new ModelRendererTurbo(this, 25, 95, textureX, textureY); // Box 128
		bodyModel[89] = new ModelRendererTurbo(this, 17, 90, textureX, textureY); // Box 128
		bodyModel[90] = new ModelRendererTurbo(this, 24, 90, textureX, textureY); // Box 128
		bodyModel[91] = new ModelRendererTurbo(this, 13, 82, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 22, 83, textureX, textureY); // Box 128
		bodyModel[93] = new ModelRendererTurbo(this, 59, 91, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[95] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[96] = new ModelRendererTurbo(this, 17, 67, textureX, textureY); // Box 249
		bodyModel[97] = new ModelRendererTurbo(this, 26, 71, textureX, textureY); // Box 250
		bodyModel[98] = new ModelRendererTurbo(this, 16, 71, textureX, textureY); // Box 251
		bodyModel[99] = new ModelRendererTurbo(this, 25, 74, textureX, textureY); // Box 252
		bodyModel[100] = new ModelRendererTurbo(this, 17, 77, textureX, textureY); // Box 253
		bodyModel[101] = new ModelRendererTurbo(this, 24, 78, textureX, textureY); // Box 254
		bodyModel[102] = new ModelRendererTurbo(this, 60, 81, textureX, textureY); // Box 255
		bodyModel[103] = new ModelRendererTurbo(this, 55, 94, textureX, textureY); // Box 128
		bodyModel[104] = new ModelRendererTurbo(this, 55, 67, textureX, textureY); // Box 261
		bodyModel[105] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 30, 8, textureX, textureY); // Box 128
		bodyModel[107] = new ModelRendererTurbo(this, 11, 260, textureX, textureY); // Box 128
		bodyModel[108] = new ModelRendererTurbo(this, 18, 8, textureX, textureY); // Box 176
		bodyModel[109] = new ModelRendererTurbo(this, 11, 238, textureX, textureY); // Box 177
		bodyModel[110] = new ModelRendererTurbo(this, 52, 3, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 1, 244, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 454, 379, textureX, textureY); // Box 128
		bodyModel[113] = new ModelRendererTurbo(this, 473, 387, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 473, 381, textureX, textureY); // Box 176
		bodyModel[115] = new ModelRendererTurbo(this, 467, 375, textureX, textureY); // Box 128
		bodyModel[116] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[117] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[118] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[119] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[121] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[122] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[123] = new ModelRendererTurbo(this, 244, 151, textureX, textureY); // Box 2
		bodyModel[124] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[125] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[126] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[127] = new ModelRendererTurbo(this, 244, 141, textureX, textureY); // Box 35
		bodyModel[128] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[129] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[130] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 39
		bodyModel[131] = new ModelRendererTurbo(this, 258, 138, textureX, textureY); // Box 41
		bodyModel[132] = new ModelRendererTurbo(this, 76, 164, textureX, textureY); // Box 2
		bodyModel[133] = new ModelRendererTurbo(this, 76, 157, textureX, textureY); // Box 41
		bodyModel[134] = new ModelRendererTurbo(this, 267, 164, textureX, textureY); // Box 2
		bodyModel[135] = new ModelRendererTurbo(this, 267, 157, textureX, textureY); // Box 41
		bodyModel[136] = new ModelRendererTurbo(this, 18, 250, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 69, 78, textureX, textureY); // Box 204
		bodyModel[138] = new ModelRendererTurbo(this, 69, 98, textureX, textureY); // Box 194
		bodyModel[139] = new ModelRendererTurbo(this, 74, 167, textureX, textureY); // Box 2
		bodyModel[140] = new ModelRendererTurbo(this, 265, 167, textureX, textureY); // Box 2
		bodyModel[141] = new ModelRendererTurbo(this, 74, 160, textureX, textureY); // Box 39
		bodyModel[142] = new ModelRendererTurbo(this, 265, 160, textureX, textureY); // Box 39
		bodyModel[143] = new ModelRendererTurbo(this, 411, 309, textureX, textureY); // Box 128
		bodyModel[144] = new ModelRendererTurbo(this, 411, 356, textureX, textureY); // Box 128
		bodyModel[145] = new ModelRendererTurbo(this, 104, 228, textureX, textureY); // Box 170
		bodyModel[146] = new ModelRendererTurbo(this, 104, 232, textureX, textureY); // Box 528
		bodyModel[147] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 81, 204, textureX, textureY); // Box 324
		bodyModel[149] = new ModelRendererTurbo(this, 247, 219, textureX, textureY); // Box 128
		bodyModel[150] = new ModelRendererTurbo(this, 247, 213, textureX, textureY); // Box 128
		bodyModel[151] = new ModelRendererTurbo(this, 247, 242, textureX, textureY); // Box 329
		bodyModel[152] = new ModelRendererTurbo(this, 247, 239, textureX, textureY); // Box 330
		bodyModel[153] = new ModelRendererTurbo(this, 247, 216, textureX, textureY); // Box 128
		bodyModel[154] = new ModelRendererTurbo(this, 247, 236, textureX, textureY); // Box 332
		bodyModel[155] = new ModelRendererTurbo(this, 404, 49, textureX, textureY); // Box 128
		bodyModel[156] = new ModelRendererTurbo(this, 368, 49, textureX, textureY); // Box 334
		bodyModel[157] = new ModelRendererTurbo(this, 47, 91, textureX, textureY); // Box 128
		bodyModel[158] = new ModelRendererTurbo(this, 47, 69, textureX, textureY); // Box 336
		bodyModel[159] = new ModelRendererTurbo(this, 84, 202, textureX, textureY,"lamp"); // Box 324 glow
		bodyModel[160] = new ModelRendererTurbo(this, 84, 222, textureX, textureY,"lamp"); // Box 338 glow
		bodyModel[161] = new ModelRendererTurbo(this, 247, 226, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[162] = new ModelRendererTurbo(this, 247, 249, textureX, textureY,"lamp"); // Box 340 glow
		bodyModel[163] = new ModelRendererTurbo(this, 190, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[164] = new ModelRendererTurbo(this, 181, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[165] = new ModelRendererTurbo(this, 172, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[166] = new ModelRendererTurbo(this, 163, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[167] = new ModelRendererTurbo(this, 154, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[168] = new ModelRendererTurbo(this, 145, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[169] = new ModelRendererTurbo(this, 136, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[170] = new ModelRendererTurbo(this, 239, 264, textureX, textureY); // Box 38
		bodyModel[171] = new ModelRendererTurbo(this, 214, 259, textureX, textureY); // Box 462
		bodyModel[172] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 2
		bodyModel[173] = new ModelRendererTurbo(this, 74, 145, textureX, textureY); // Box 472
		bodyModel[174] = new ModelRendererTurbo(this, 60, 138, textureX, textureY); // Box 192
		bodyModel[175] = new ModelRendererTurbo(this, 282, 138, textureX, textureY); // Box 192
		bodyModel[176] = new ModelRendererTurbo(this, 60, 148, textureX, textureY); // Box 475
		bodyModel[177] = new ModelRendererTurbo(this, 282, 148, textureX, textureY); // Box 476
		bodyModel[178] = new ModelRendererTurbo(this, 140, 64, textureX, textureY); // Box 38
		bodyModel[179] = new ModelRendererTurbo(this, 94, 66, textureX, textureY); // Box 38
		bodyModel[180] = new ModelRendererTurbo(this, 140, 23, textureX, textureY); // Box 451
		bodyModel[181] = new ModelRendererTurbo(this, 94, 21, textureX, textureY); // Box 452
		bodyModel[182] = new ModelRendererTurbo(this, 93, 9, textureX, textureY); // Box 38
		bodyModel[183] = new ModelRendererTurbo(this, 84, 9, textureX, textureY); // Box 38
		bodyModel[184] = new ModelRendererTurbo(this, 75, 5, textureX, textureY); // Box 38
		bodyModel[185] = new ModelRendererTurbo(this, 75, 13, textureX, textureY); // Box 487
		bodyModel[186] = new ModelRendererTurbo(this, 84, 4, textureX, textureY); // Box 128
		bodyModel[187] = new ModelRendererTurbo(this, 97, 13, textureX, textureY); // Box 205
		bodyModel[188] = new ModelRendererTurbo(this, 144, 166, textureX, textureY); // Box 283
		bodyModel[189] = new ModelRendererTurbo(this, 122, 166, textureX, textureY); // Box 41
		bodyModel[190] = new ModelRendererTurbo(this, 119, 167, textureX, textureY); // Box 41
		bodyModel[191] = new ModelRendererTurbo(this, 141, 167, textureX, textureY); // Box 41
		bodyModel[192] = new ModelRendererTurbo(this, 140, 155, textureX, textureY); // Box 494
		bodyModel[193] = new ModelRendererTurbo(this, 122, 155, textureX, textureY); // Box 41
		bodyModel[194] = new ModelRendererTurbo(this, 119, 156, textureX, textureY); // Box 41
		bodyModel[195] = new ModelRendererTurbo(this, 137, 156, textureX, textureY); // Box 41
		bodyModel[196] = new ModelRendererTurbo(this, 124, 160, textureX, textureY); // Box 41
		bodyModel[197] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 41
		bodyModel[198] = new ModelRendererTurbo(this, 135, 161, textureX, textureY); // Box 41
		bodyModel[199] = new ModelRendererTurbo(this, 324, 124, textureX, textureY); // Box 2
		bodyModel[200] = new ModelRendererTurbo(this, 34, 124, textureX, textureY); // Box 2
		bodyModel[201] = new ModelRendererTurbo(this, 69, 138, textureX, textureY); // Box 479
		bodyModel[202] = new ModelRendererTurbo(this, 277, 138, textureX, textureY); // Box 480
		bodyModel[203] = new ModelRendererTurbo(this, 207, 334, textureX, textureY); // Box 38
		bodyModel[204] = new ModelRendererTurbo(this, 64, 301, textureX, textureY); // Box 38
		bodyModel[205] = new ModelRendererTurbo(this, 45, 294, textureX, textureY); // Box 543
		bodyModel[206] = new ModelRendererTurbo(this, 242, 330, textureX, textureY); // Box 38
		bodyModel[207] = new ModelRendererTurbo(this, 242, 301, textureX, textureY); // Box 543
		bodyModel[208] = new ModelRendererTurbo(this, 267, 355, textureX, textureY); // Box 38
		bodyModel[209] = new ModelRendererTurbo(this, 276, 364, textureX, textureY); // Box 38
		bodyModel[210] = new ModelRendererTurbo(this, 267, 308, textureX, textureY); // Box 279
		bodyModel[211] = new ModelRendererTurbo(this, 276, 317, textureX, textureY); // Box 280
		bodyModel[212] = new ModelRendererTurbo(this, 261, 327, textureX, textureY); // Box 38
		bodyModel[213] = new ModelRendererTurbo(this, 261, 324, textureX, textureY); // Box 38
		bodyModel[214] = new ModelRendererTurbo(this, 261, 298, textureX, textureY); // Box 38
		bodyModel[215] = new ModelRendererTurbo(this, 261, 295, textureX, textureY); // Box 38
		bodyModel[216] = new ModelRendererTurbo(this, 124, 249, textureX, textureY); // Box 128
		bodyModel[217] = new ModelRendererTurbo(this, 124, 243, textureX, textureY); // Box 177
		bodyModel[218] = new ModelRendererTurbo(this, 110, 261, textureX, textureY); // Box 128
		bodyModel[219] = new ModelRendererTurbo(this, 124, 255, textureX, textureY); // Box 128
		bodyModel[220] = new ModelRendererTurbo(this, 49, 237, textureX, textureY); // Box 185
		bodyModel[221] = new ModelRendererTurbo(this, 110, 277, textureX, textureY); // Box 128
		bodyModel[222] = new ModelRendererTurbo(this, 67, 273, textureX, textureY); // Box 128
		bodyModel[223] = new ModelRendererTurbo(this, 22, 260, textureX, textureY); // Box 128
		bodyModel[224] = new ModelRendererTurbo(this, 22, 237, textureX, textureY); // Box 177
		bodyModel[225] = new ModelRendererTurbo(this, 37, 244, textureX, textureY); // Box 128
		bodyModel[226] = new ModelRendererTurbo(this, 18, 288, textureX, textureY); // Box 128
		bodyModel[227] = new ModelRendererTurbo(this, 40, 260, textureX, textureY); // Box 128
		bodyModel[228] = new ModelRendererTurbo(this, 1, 266, textureX, textureY); // Box 128
		bodyModel[229] = new ModelRendererTurbo(this, 70, 253, textureX, textureY); // Box 128
		bodyModel[230] = new ModelRendererTurbo(this, 71, 243, textureX, textureY); // Box 177
		bodyModel[231] = new ModelRendererTurbo(this, 71, 247, textureX, textureY); // Box 128
		bodyModel[232] = new ModelRendererTurbo(this, 55, 209, textureX, textureY); // Box 128
		bodyModel[233] = new ModelRendererTurbo(this, 13, 297, textureX, textureY); // Box 38
		bodyModel[234] = new ModelRendererTurbo(this, 16, 302, textureX, textureY); // Box 38
		bodyModel[235] = new ModelRendererTurbo(this, 15, 306, textureX, textureY); // Box 38
		bodyModel[236] = new ModelRendererTurbo(this, 32, 297, textureX, textureY); // Box 543
		bodyModel[237] = new ModelRendererTurbo(this, 1, 301, textureX, textureY); // Box 543
		bodyModel[238] = new ModelRendererTurbo(this, 25, 301, textureX, textureY); // Box 543
		bodyModel[239] = new ModelRendererTurbo(this, 14, 310, textureX, textureY); // Box 72
		bodyModel[240] = new ModelRendererTurbo(this, 17, 316, textureX, textureY); // Box 87
		bodyModel[241] = new ModelRendererTurbo(this, 1, 330, textureX, textureY); // Box 543
		bodyModel[242] = new ModelRendererTurbo(this, 89, 93, textureX, textureY); // Left side loading door
		bodyModel[243] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Right side loading door
		bodyModel[244] = new ModelRendererTurbo(this, 89, 87, textureX, textureY); // Box 38
		bodyModel[245] = new ModelRendererTurbo(this, 89, 67, textureX, textureY); // Box 128
		bodyModel[246] = new ModelRendererTurbo(this, 72, 88, textureX, textureY); // Box 38
		bodyModel[247] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 128
		bodyModel[248] = new ModelRendererTurbo(this, 33, 336, textureX, textureY); // Box 543
		bodyModel[249] = new ModelRendererTurbo(this, 26, 336, textureX, textureY); // Box 543
		bodyModel[250] = new ModelRendererTurbo(this, 114, 343, textureX, textureY); // Box 38
		bodyModel[251] = new ModelRendererTurbo(this, 148, 333, textureX, textureY); // Box 38
		bodyModel[252] = new ModelRendererTurbo(this, 146, 328, textureX, textureY); // Box 38
		bodyModel[253] = new ModelRendererTurbo(this, 156, 351, textureX, textureY); // Box 38
		bodyModel[254] = new ModelRendererTurbo(this, 136, 332, textureX, textureY); // Box 38
		bodyModel[255] = new ModelRendererTurbo(this, 136, 328, textureX, textureY); // Box 38
		bodyModel[256] = new ModelRendererTurbo(this, 124, 322, textureX, textureY); // Box 38
		bodyModel[257] = new ModelRendererTurbo(this, 44, 332, textureX, textureY); // Box 38
		bodyModel[258] = new ModelRendererTurbo(this, 134, 316, textureX, textureY); // Box 38
		bodyModel[259] = new ModelRendererTurbo(this, 191, 328, textureX, textureY); // Box 38
		bodyModel[260] = new ModelRendererTurbo(this, 195, 341, textureX, textureY); // Box 38
		bodyModel[261] = new ModelRendererTurbo(this, 190, 341, textureX, textureY); // Box 38
		bodyModel[262] = new ModelRendererTurbo(this, 183, 343, textureX, textureY); // Box 38
		bodyModel[263] = new ModelRendererTurbo(this, 180, 334, textureX, textureY); // Box 38
		bodyModel[264] = new ModelRendererTurbo(this, 185, 334, textureX, textureY); // Box 38
		bodyModel[265] = new ModelRendererTurbo(this, 105, 320, textureX, textureY); // Box 38
		bodyModel[266] = new ModelRendererTurbo(this, 135, 302, textureX, textureY); // Box 38
		bodyModel[267] = new ModelRendererTurbo(this, 177, 295, textureX, textureY); // Box 38
		bodyModel[268] = new ModelRendererTurbo(this, 88, 322, textureX, textureY); // Box 38
		bodyModel[269] = new ModelRendererTurbo(this, 117, 314, textureX, textureY); // Box 38
		bodyModel[270] = new ModelRendererTurbo(this, 165, 311, textureX, textureY); // Box 38
		bodyModel[271] = new ModelRendererTurbo(this, 161, 343, textureX, textureY); // Box 38
		bodyModel[272] = new ModelRendererTurbo(this, 231, 331, textureX, textureY); // Box 38
		bodyModel[273] = new ModelRendererTurbo(this, 190, 350, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[274] = new ModelRendererTurbo(this, 51, 325, textureX, textureY); // Box 128
		bodyModel[275] = new ModelRendererTurbo(this, 81, 332, textureX, textureY); // Box 128
		bodyModel[276] = new ModelRendererTurbo(this, 96, 340, textureX, textureY); // Box 128
		bodyModel[277] = new ModelRendererTurbo(this, 45, 319, textureX, textureY); // Box 128
		bodyModel[278] = new ModelRendererTurbo(this, 82, 340, textureX, textureY); // Box 128
		bodyModel[279] = new ModelRendererTurbo(this, 44, 344, textureX, textureY); // Box 38
		bodyModel[280] = new ModelRendererTurbo(this, 73, 347, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[281] = new ModelRendererTurbo(this, 75, 344, textureX, textureY); // Box 426
		bodyModel[282] = new ModelRendererTurbo(this, 82, 347, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[283] = new ModelRendererTurbo(this, 84, 344, textureX, textureY); // Box 426
		bodyModel[284] = new ModelRendererTurbo(this, 79, 325, textureX, textureY); // Box 128 coffee urn
		bodyModel[285] = new ModelRendererTurbo(this, 68, 325, textureX, textureY); // Box 128
		bodyModel[286] = new ModelRendererTurbo(this, 69, 319, textureX, textureY); // Box 128
		bodyModel[287] = new ModelRendererTurbo(this, 214, 330, textureX, textureY); // Box 38
		bodyModel[288] = new ModelRendererTurbo(this, 214, 344, textureX, textureY); // Box 38
		bodyModel[289] = new ModelRendererTurbo(this, 214, 327, textureX, textureY); // Box 38
		bodyModel[290] = new ModelRendererTurbo(this, 221, 311, textureX, textureY); // Box 38
		bodyModel[291] = new ModelRendererTurbo(this, 207, 325, textureX, textureY); // Box 38
		bodyModel[292] = new ModelRendererTurbo(this, 207, 310, textureX, textureY); // Box 38
		bodyModel[293] = new ModelRendererTurbo(this, 200, 309, textureX, textureY); // Box 38
		bodyModel[294] = new ModelRendererTurbo(this, 207, 312, textureX, textureY); // Box 38
		bodyModel[295] = new ModelRendererTurbo(this, 138, 314, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[296] = new ModelRendererTurbo(this, 182, 320, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[297] = new ModelRendererTurbo(this, 152, 341, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[298] = new ModelRendererTurbo(this, 400, 21, textureX, textureY); // Back end door
		bodyModel[299] = new ModelRendererTurbo(this, 436, 385, textureX, textureY); // Box 128
		bodyModel[300] = new ModelRendererTurbo(this, 436, 379, textureX, textureY); // Box 177
		bodyModel[301] = new ModelRendererTurbo(this, 435, 377, textureX, textureY); // Box 128
		bodyModel[302] = new ModelRendererTurbo(this, 497, 420, textureX, textureY); // Box 128
		bodyModel[303] = new ModelRendererTurbo(this, 497, 397, textureX, textureY); // Box 128
		bodyModel[304] = new ModelRendererTurbo(this, 494, 427, textureX, textureY); // Box 38
		bodyModel[305] = new ModelRendererTurbo(this, 494, 425, textureX, textureY); // Box 38
		bodyModel[306] = new ModelRendererTurbo(this, 493, 404, textureX, textureY); // Box 38
		bodyModel[307] = new ModelRendererTurbo(this, 493, 402, textureX, textureY); // Box 38
		bodyModel[308] = new ModelRendererTurbo(this, 268, 155, textureX, textureY); // Box 2
		bodyModel[309] = new ModelRendererTurbo(this, 268, 145, textureX, textureY); // Box 472
		bodyModel[310] = new ModelRendererTurbo(this, 323, 78, textureX, textureY); // Box 204
		bodyModel[311] = new ModelRendererTurbo(this, 323, 97, textureX, textureY); // Box 194
		bodyModel[312] = new ModelRendererTurbo(this, 315, 355, textureX, textureY); // Box 38
		bodyModel[313] = new ModelRendererTurbo(this, 324, 364, textureX, textureY); // Box 38
		bodyModel[314] = new ModelRendererTurbo(this, 363, 355, textureX, textureY); // Box 38
		bodyModel[315] = new ModelRendererTurbo(this, 372, 364, textureX, textureY); // Box 38
		bodyModel[316] = new ModelRendererTurbo(this, 282, 340, textureX, textureY); // Box 38
		bodyModel[317] = new ModelRendererTurbo(this, 330, 340, textureX, textureY); // Box 38
		bodyModel[318] = new ModelRendererTurbo(this, 378, 340, textureX, textureY); // Box 38
		bodyModel[319] = new ModelRendererTurbo(this, 365, 324, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[320] = new ModelRendererTurbo(this, 315, 308, textureX, textureY); // Box 279
		bodyModel[321] = new ModelRendererTurbo(this, 324, 317, textureX, textureY); // Box 280
		bodyModel[322] = new ModelRendererTurbo(this, 363, 308, textureX, textureY); // Box 279
		bodyModel[323] = new ModelRendererTurbo(this, 372, 317, textureX, textureY); // Box 280
		bodyModel[324] = new ModelRendererTurbo(this, 282, 359, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[325] = new ModelRendererTurbo(this, 281, 350, textureX, textureY); // Box 38
		bodyModel[326] = new ModelRendererTurbo(this, 282, 293, textureX, textureY); // Box 281
		bodyModel[327] = new ModelRendererTurbo(this, 282, 312, textureX, textureY,"cull"); // Box 283 cull
		bodyModel[328] = new ModelRendererTurbo(this, 281, 303, textureX, textureY); // Box 284
		bodyModel[329] = new ModelRendererTurbo(this, 330, 359, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[330] = new ModelRendererTurbo(this, 329, 350, textureX, textureY); // Box 38
		bodyModel[331] = new ModelRendererTurbo(this, 330, 293, textureX, textureY); // Box 281
		bodyModel[332] = new ModelRendererTurbo(this, 330, 312, textureX, textureY,"cull"); // Box 283 cull
		bodyModel[333] = new ModelRendererTurbo(this, 329, 303, textureX, textureY); // Box 284
		bodyModel[334] = new ModelRendererTurbo(this, 378, 359, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[335] = new ModelRendererTurbo(this, 377, 350, textureX, textureY); // Box 38
		bodyModel[336] = new ModelRendererTurbo(this, 378, 293, textureX, textureY); // Box 281
		bodyModel[337] = new ModelRendererTurbo(this, 378, 312, textureX, textureY,"cull"); // Box 283 cull
		bodyModel[338] = new ModelRendererTurbo(this, 377, 303, textureX, textureY); // Box 284
		bodyModel[339] = new ModelRendererTurbo(this, 365, 334, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[340] = new ModelRendererTurbo(this, 365, 345, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[341] = new ModelRendererTurbo(this, 317, 324, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[342] = new ModelRendererTurbo(this, 317, 334, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[343] = new ModelRendererTurbo(this, 317, 345, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[344] = new ModelRendererTurbo(this, 269, 324, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[345] = new ModelRendererTurbo(this, 269, 334, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[346] = new ModelRendererTurbo(this, 269, 345, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[347] = new ModelRendererTurbo(this, 365, 277, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[348] = new ModelRendererTurbo(this, 365, 287, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[349] = new ModelRendererTurbo(this, 365, 298, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[350] = new ModelRendererTurbo(this, 317, 277, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[351] = new ModelRendererTurbo(this, 317, 287, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[352] = new ModelRendererTurbo(this, 317, 298, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[353] = new ModelRendererTurbo(this, 269, 277, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[354] = new ModelRendererTurbo(this, 269, 287, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[355] = new ModelRendererTurbo(this, 269, 298, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[356] = new ModelRendererTurbo(this, 413, 336, textureX, textureY); // Box 128
		bodyModel[357] = new ModelRendererTurbo(this, 422, 339, textureX, textureY); // Box 128
		bodyModel[358] = new ModelRendererTurbo(this, 421, 350, textureX, textureY); // Box 128
		bodyModel[359] = new ModelRendererTurbo(this, 412, 347, textureX, textureY); // Box 128
		bodyModel[360] = new ModelRendererTurbo(this, 416, 340, textureX, textureY); // Box 128
		bodyModel[361] = new ModelRendererTurbo(this, 416, 338, textureX, textureY); // Box 128
		bodyModel[362] = new ModelRendererTurbo(this, 416, 294, textureX, textureY); // Box 128
		bodyModel[363] = new ModelRendererTurbo(this, 416, 292, textureX, textureY); // Box 128
		bodyModel[364] = new ModelRendererTurbo(this, 413, 290, textureX, textureY); // Box 128
		bodyModel[365] = new ModelRendererTurbo(this, 422, 293, textureX, textureY); // Box 128
		bodyModel[366] = new ModelRendererTurbo(this, 421, 304, textureX, textureY); // Box 128
		bodyModel[367] = new ModelRendererTurbo(this, 412, 301, textureX, textureY); // Box 128
		bodyModel[368] = new ModelRendererTurbo(this, 247, 251, textureX, textureY); // Box 329
		bodyModel[369] = new ModelRendererTurbo(this, 248, 256, textureX, textureY,"lamp"); // Box 329 glow
		bodyModel[370] = new ModelRendererTurbo(this, 247, 228, textureX, textureY); // Box 329
		bodyModel[371] = new ModelRendererTurbo(this, 248, 233, textureX, textureY,"lamp"); // Box 329 glow
		bodyModel[372] = new ModelRendererTurbo(this, 470, 354, textureX, textureY); // Box 38
		bodyModel[373] = new ModelRendererTurbo(this, 384, 477, textureX, textureY); // Box 38
		bodyModel[374] = new ModelRendererTurbo(this, 437, 473, textureX, textureY); // Box 38
		bodyModel[375] = new ModelRendererTurbo(this, 385, 473, textureX, textureY); // Box 38
		bodyModel[376] = new ModelRendererTurbo(this, 382, 469, textureX, textureY); // Box 38
		bodyModel[377] = new ModelRendererTurbo(this, 389, 469, textureX, textureY); // Box 38
		bodyModel[378] = new ModelRendererTurbo(this, 428, 345, textureX, textureY); // Box 38
		bodyModel[379] = new ModelRendererTurbo(this, 428, 358, textureX, textureY); // Box 38
		bodyModel[380] = new ModelRendererTurbo(this, 428, 352, textureX, textureY); // Box 38
		bodyModel[381] = new ModelRendererTurbo(this, 429, 365, textureX, textureY); // Box 38
		bodyModel[382] = new ModelRendererTurbo(this, 437, 364, textureX, textureY); // Box 38
		bodyModel[383] = new ModelRendererTurbo(this, 441, 354, textureX, textureY); // Box 38
		bodyModel[384] = new ModelRendererTurbo(this, 437, 341, textureX, textureY); // Box 38
		bodyModel[385] = new ModelRendererTurbo(this, 428, 339, textureX, textureY); // Box 38
		bodyModel[386] = new ModelRendererTurbo(this, 428, 327, textureX, textureY); // Box 38
		bodyModel[387] = new ModelRendererTurbo(this, 434, 334, textureX, textureY); // Box 38
		bodyModel[388] = new ModelRendererTurbo(this, 445, 334, textureX, textureY); // Box 38
		bodyModel[389] = new ModelRendererTurbo(this, 428, 298, textureX, textureY); // Box 485
		bodyModel[390] = new ModelRendererTurbo(this, 428, 311, textureX, textureY); // Box 486
		bodyModel[391] = new ModelRendererTurbo(this, 428, 305, textureX, textureY); // Box 487
		bodyModel[392] = new ModelRendererTurbo(this, 429, 318, textureX, textureY); // Box 488
		bodyModel[393] = new ModelRendererTurbo(this, 437, 317, textureX, textureY); // Box 489
		bodyModel[394] = new ModelRendererTurbo(this, 441, 307, textureX, textureY); // Box 490
		bodyModel[395] = new ModelRendererTurbo(this, 437, 294, textureX, textureY); // Box 491
		bodyModel[396] = new ModelRendererTurbo(this, 428, 292, textureX, textureY); // Box 492
		bodyModel[397] = new ModelRendererTurbo(this, 434, 287, textureX, textureY); // Box 493
		bodyModel[398] = new ModelRendererTurbo(this, 445, 287, textureX, textureY); // Box 494
		bodyModel[399] = new ModelRendererTurbo(this, 428, 280, textureX, textureY); // Box 495
		bodyModel[400] = new ModelRendererTurbo(this, 463, 464, textureX, textureY); // Box 38
		bodyModel[401] = new ModelRendererTurbo(this, 465, 477, textureX, textureY); // Box 38
		bodyModel[402] = new ModelRendererTurbo(this, 481, 471, textureX, textureY); // Box 38
		bodyModel[403] = new ModelRendererTurbo(this, 482, 484, textureX, textureY); // Box 38
		bodyModel[404] = new ModelRendererTurbo(this, 454, 341, textureX, textureY); // Box 38
		bodyModel[405] = new ModelRendererTurbo(this, 454, 294, textureX, textureY); // Box 491
		bodyModel[406] = new ModelRendererTurbo(this, 468, 460, textureX, textureY); // Box 38
		bodyModel[407] = new ModelRendererTurbo(this, 485, 458, textureX, textureY); // Box 38
		bodyModel[408] = new ModelRendererTurbo(this, 479, 446, textureX, textureY); // Box 38
		bodyModel[409] = new ModelRendererTurbo(this, 477, 453, textureX, textureY); // Box 38
		bodyModel[410] = new ModelRendererTurbo(this, 466, 453, textureX, textureY); // Box 38
		bodyModel[411] = new ModelRendererTurbo(this, 463, 460, textureX, textureY); // Box 38
		bodyModel[412] = new ModelRendererTurbo(this, 480, 483, textureX, textureY); // Box 38
		bodyModel[413] = new ModelRendererTurbo(this, 476, 473, textureX, textureY); // Box 38
		bodyModel[414] = new ModelRendererTurbo(this, 462, 417, textureX, textureY); // Box 510
		bodyModel[415] = new ModelRendererTurbo(this, 464, 430, textureX, textureY); // Box 511
		bodyModel[416] = new ModelRendererTurbo(this, 480, 424, textureX, textureY); // Box 512
		bodyModel[417] = new ModelRendererTurbo(this, 481, 437, textureX, textureY); // Box 513
		bodyModel[418] = new ModelRendererTurbo(this, 467, 413, textureX, textureY); // Box 514
		bodyModel[419] = new ModelRendererTurbo(this, 484, 411, textureX, textureY); // Box 515
		bodyModel[420] = new ModelRendererTurbo(this, 478, 399, textureX, textureY); // Box 516
		bodyModel[421] = new ModelRendererTurbo(this, 476, 406, textureX, textureY); // Box 517
		bodyModel[422] = new ModelRendererTurbo(this, 465, 406, textureX, textureY); // Box 518
		bodyModel[423] = new ModelRendererTurbo(this, 462, 413, textureX, textureY); // Box 519
		bodyModel[424] = new ModelRendererTurbo(this, 479, 436, textureX, textureY); // Box 520
		bodyModel[425] = new ModelRendererTurbo(this, 475, 426, textureX, textureY); // Box 521
		bodyModel[426] = new ModelRendererTurbo(this, 424, 420, textureX, textureY); // Box 38
		bodyModel[427] = new ModelRendererTurbo(this, 482, 301, textureX, textureY); // Box 38
		bodyModel[428] = new ModelRendererTurbo(this, 442, 320, textureX, textureY); // Box 128
		bodyModel[429] = new ModelRendererTurbo(this, 442, 317, textureX, textureY); // Box 128
		bodyModel[430] = new ModelRendererTurbo(this, 458, 317, textureX, textureY); // Box 128
		bodyModel[431] = new ModelRendererTurbo(this, 442, 323, textureX, textureY); // Box 128
		bodyModel[432] = new ModelRendererTurbo(this, 458, 323, textureX, textureY); // Box 128
		bodyModel[433] = new ModelRendererTurbo(this, 458, 320, textureX, textureY); // Box 128
		bodyModel[434] = new ModelRendererTurbo(this, 447, 318, textureX, textureY); // Box 128
		bodyModel[435] = new ModelRendererTurbo(this, 458, 439, textureX, textureY); // Box 128
		bodyModel[436] = new ModelRendererTurbo(this, 458, 436, textureX, textureY); // Box 128
		bodyModel[437] = new ModelRendererTurbo(this, 474, 436, textureX, textureY); // Box 128
		bodyModel[438] = new ModelRendererTurbo(this, 458, 442, textureX, textureY); // Box 128
		bodyModel[439] = new ModelRendererTurbo(this, 474, 442, textureX, textureY); // Box 128
		bodyModel[440] = new ModelRendererTurbo(this, 474, 439, textureX, textureY); // Box 128
		bodyModel[441] = new ModelRendererTurbo(this, 463, 437, textureX, textureY); // Box 128
		bodyModel[442] = new ModelRendererTurbo(this, 442, 367, textureX, textureY); // Box 525
		bodyModel[443] = new ModelRendererTurbo(this, 442, 370, textureX, textureY); // Box 526
		bodyModel[444] = new ModelRendererTurbo(this, 458, 370, textureX, textureY); // Box 527
		bodyModel[445] = new ModelRendererTurbo(this, 442, 364, textureX, textureY); // Box 528
		bodyModel[446] = new ModelRendererTurbo(this, 458, 364, textureX, textureY); // Box 529
		bodyModel[447] = new ModelRendererTurbo(this, 458, 367, textureX, textureY); // Box 530
		bodyModel[448] = new ModelRendererTurbo(this, 447, 365, textureX, textureY); // Box 531
		bodyModel[449] = new ModelRendererTurbo(this, 459, 486, textureX, textureY); // Box 533
		bodyModel[450] = new ModelRendererTurbo(this, 459, 489, textureX, textureY); // Box 534
		bodyModel[451] = new ModelRendererTurbo(this, 475, 489, textureX, textureY); // Box 535
		bodyModel[452] = new ModelRendererTurbo(this, 459, 483, textureX, textureY); // Box 536
		bodyModel[453] = new ModelRendererTurbo(this, 475, 483, textureX, textureY); // Box 537
		bodyModel[454] = new ModelRendererTurbo(this, 475, 486, textureX, textureY); // Box 538
		bodyModel[455] = new ModelRendererTurbo(this, 464, 484, textureX, textureY); // Box 539
		bodyModel[456] = new ModelRendererTurbo(this, 463, 366, textureX, textureY,"cull"); // Box 531 cull
		bodyModel[457] = new ModelRendererTurbo(this, 463, 319, textureX, textureY,"cull"); // Box 531 cull
		bodyModel[458] = new ModelRendererTurbo(this, 448, 485, textureX, textureY,"cull"); // Box 531 cull
		bodyModel[459] = new ModelRendererTurbo(this, 447, 438, textureX, textureY,"cull"); // Box 531 cull
		bodyModel[460] = new ModelRendererTurbo(this, 474, 361, textureX, textureY,"cull"); // Box 531 cull
		bodyModel[461] = new ModelRendererTurbo(this, 437, 480, textureX, textureY,"cull"); // Box 531 cull
		bodyModel[462] = new ModelRendererTurbo(this, 484, 308, textureX, textureY,"cull"); // Box 531 cull
		bodyModel[463] = new ModelRendererTurbo(this, 426, 427, textureX, textureY,"cull"); // Box 531 cull
		bodyModel[464] = new ModelRendererTurbo(this, 384, 480, textureX, textureY,"cull"); // Box 531 cull
		bodyModel[465] = new ModelRendererTurbo(this, 466, 336, textureX, textureY); // Box 38
		bodyModel[466] = new ModelRendererTurbo(this, 464, 342, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[467] = new ModelRendererTurbo(this, 463, 327, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[468] = new ModelRendererTurbo(this, 474, 329, textureX, textureY); // Box 38
		bodyModel[469] = new ModelRendererTurbo(this, 439, 455, textureX, textureY); // Box 38
		bodyModel[470] = new ModelRendererTurbo(this, 437, 461, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[471] = new ModelRendererTurbo(this, 448, 446, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[472] = new ModelRendererTurbo(this, 437, 448, textureX, textureY); // Box 38
		bodyModel[473] = new ModelRendererTurbo(this, 493, 283, textureX, textureY); // Box 38
		bodyModel[474] = new ModelRendererTurbo(this, 491, 289, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[475] = new ModelRendererTurbo(this, 496, 274, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[476] = new ModelRendererTurbo(this, 496, 267, textureX, textureY); // Box 38
		bodyModel[477] = new ModelRendererTurbo(this, 411, 402, textureX, textureY); // Box 38
		bodyModel[478] = new ModelRendererTurbo(this, 409, 408, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[479] = new ModelRendererTurbo(this, 414, 393, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[480] = new ModelRendererTurbo(this, 414, 386, textureX, textureY); // Box 38
		bodyModel[481] = new ModelRendererTurbo(this, 439, 420, textureX, textureY); // Box 38
		bodyModel[482] = new ModelRendererTurbo(this, 437, 426, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[483] = new ModelRendererTurbo(this, 445, 411, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[484] = new ModelRendererTurbo(this, 445, 404, textureX, textureY); // Box 38
		bodyModel[485] = new ModelRendererTurbo(this, 465, 301, textureX, textureY); // Box 38
		bodyModel[486] = new ModelRendererTurbo(this, 463, 307, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[487] = new ModelRendererTurbo(this, 465, 292, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[488] = new ModelRendererTurbo(this, 465, 285, textureX, textureY); // Box 38
		bodyModel[489] = new ModelRendererTurbo(this, 381, 449, textureX, textureY); // Box 38
		bodyModel[490] = new ModelRendererTurbo(this, 379, 455, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[491] = new ModelRendererTurbo(this, 384, 443, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[492] = new ModelRendererTurbo(this, 384, 439, textureX, textureY); // Box 38
		bodyModel[493] = new ModelRendererTurbo(this, 485, 330, textureX, textureY); // Box 38
		bodyModel[494] = new ModelRendererTurbo(this, 485, 336, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[495] = new ModelRendererTurbo(this, 485, 324, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[496] = new ModelRendererTurbo(this, 485, 320, textureX, textureY); // Box 38
		bodyModel[497] = new ModelRendererTurbo(this, 420, 449, textureX, textureY); // Box 38
		bodyModel[498] = new ModelRendererTurbo(this, 416, 455, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[499] = new ModelRendererTurbo(this, 425, 443, textureX, textureY,"cull"); // Box 38 cull

		bodyModel[0].addBox(0F, 0F, 0F, 108, 1, 4, 0F); // Box 2
		bodyModel[0].setRotationPoint(-54F, 3F, -2F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[1].setRotationPoint(41.5F, 4F, -1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-40.5F, 4F, -1F);

		bodyModel[3].addBox(0F, 0F, 0F, 15, 2, 4, 0F); // Box 2
		bodyModel[3].setRotationPoint(0F, 3F, 4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[4].setRotationPoint(0F, 5F, 4F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[5].setRotationPoint(-17F, 2.75F, -8.9F);
		bodyModel[5].rotateAngleX = -0.78539816F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[6].setRotationPoint(-17.01F, 3F, -9.4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[7].setRotationPoint(-11.99F, 3F, -9.4F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 283
		bodyModel[8].setRotationPoint(17F, 3F, 6F);

		bodyModel[9].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 283
		bodyModel[9].setRotationPoint(7F, 3F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 118, 2, 22, 0F); // Box 2
		bodyModel[10].setRotationPoint(-59F, 1F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[11].setRotationPoint(-61F, 3F, -1.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull
		bodyModel[12].setRotationPoint(-59F, 4F, 10.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[13].setRotationPoint(-59F, 3F, 10.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[14].setRotationPoint(-53F, 4F, 10.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30 cull
		bodyModel[15].setRotationPoint(-59F, 4F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[16].setRotationPoint(-59F, 3F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[17].setRotationPoint(-53F, 4F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[18].setRotationPoint(-59F, 3F, -10.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[19].setRotationPoint(-59F, 4F, -10.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[20].setRotationPoint(-59F, 4F, 9.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[21].setRotationPoint(58F, 3F, -1.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull
		bodyModel[22].setRotationPoint(53F, 4F, 10.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 2
		bodyModel[23].setRotationPoint(51F, 4F, 10.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27 cull
		bodyModel[24].setRotationPoint(53F, 4F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 29
		bodyModel[25].setRotationPoint(51F, 4F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[26].setRotationPoint(52F, 3F, 10.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[27].setRotationPoint(58.5F, 3F, -10.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[28].setRotationPoint(58.5F, 4F, -10.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[29].setRotationPoint(58.5F, 4F, 9.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 107, 16, 1, 0F); // Box 38
		bodyModel[30].setRotationPoint(-48F, -15F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 107, 16, 1, 0F); // Box 128
		bodyModel[31].setRotationPoint(-48F, -15F, 10F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[32].setRotationPoint(58F, -15F, -10F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[33].setRotationPoint(58F, -15F, 3F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[34].setRotationPoint(-59F, -15F, -10F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[35].setRotationPoint(-59F, -15F, 3F);

		bodyModel[36].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[36].setRotationPoint(-58F, -14F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[37].setRotationPoint(-52.5F, -8F, -12F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[38].setRotationPoint(-47.5F, -8F, -12F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[39].setRotationPoint(-52.5F, -8F, 11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[40].setRotationPoint(-47.5F, -8F, 11F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[41].setRotationPoint(-59F, -15F, -3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[42].setRotationPoint(59F, -15F, -4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[43].setRotationPoint(59F, 1F, -4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[44].setRotationPoint(59F, -14F, -4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[45].setRotationPoint(59F, -14F, 3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[46].setRotationPoint(60.5F, -14F, -5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[47].setRotationPoint(60.5F, -14F, 3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[48].setRotationPoint(60.5F, 1F, -5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[49].setRotationPoint(60.5F, -17F, -5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 18, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[50].setRotationPoint(59F, -15F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[51].setRotationPoint(59F, -15F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, -1.75F, 0F, -1.5F, -1.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -1.5F, 1.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[52].setRotationPoint(59F, -19F, -10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[53].setRotationPoint(59F, -20F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 0, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[54].setRotationPoint(59F, -20F, -3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 18, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[55].setRotationPoint(59F, -15F, 11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 2.25F, -1F, -1.5F, 2.25F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -1.5F, -2.25F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[56].setRotationPoint(59F, -15F, 9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[57].setRotationPoint(59F, -19F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[58].setRotationPoint(59F, -20F, 3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[59].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[60].setRotationPoint(60.5F, -16F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[61].setRotationPoint(60.5F, 1F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[62].setRotationPoint(60.5F, -19F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[63].setRotationPoint(60.5F, -19.5F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[64].setRotationPoint(60.5F, -20F, -3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[65].setRotationPoint(60.5F, -20F, -5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[66].setRotationPoint(60.5F, -15F, 10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[67].setRotationPoint(60.5F, -16F, 9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[68].setRotationPoint(60.5F, -19F, 7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 253
		bodyModel[69].setRotationPoint(60.5F, -19.5F, 5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[70].setRotationPoint(60.5F, -20F, 3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[71].setRotationPoint(61F, -7F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[72].setRotationPoint(61F, -7F, 5F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[73].setRotationPoint(58F, -15F, -3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[74].setRotationPoint(-60.5F, -15F, -4F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[75].setRotationPoint(-60.5F, 1F, -4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[76].setRotationPoint(-60.5F, -14F, -4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[77].setRotationPoint(-60.5F, -14F, 3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[78].setRotationPoint(-61F, -14F, -5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[79].setRotationPoint(-61F, -14F, 3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[80].setRotationPoint(-61F, 1F, -5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[81].setRotationPoint(-61F, -17F, -5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[82].setRotationPoint(-61F, -15F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 18, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[83].setRotationPoint(-60.5F, -15F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[84].setRotationPoint(-61F, -16F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[85].setRotationPoint(-60.5F, -15F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[86].setRotationPoint(-61F, 1F, -10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[87].setRotationPoint(-61F, -19F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, -1.75F, 0F, -1.5F, -1.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -1.5F, 1.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[88].setRotationPoint(-60.5F, -19F, -10F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[89].setRotationPoint(-61F, -19.5F, -7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[90].setRotationPoint(-60.5F, -20F, -7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[91].setRotationPoint(-61F, -20F, -3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 0, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[92].setRotationPoint(-60.5F, -20F, -3F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[93].setRotationPoint(-61F, -19.75F, -5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[94].setRotationPoint(-61F, -15F, 10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 18, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[95].setRotationPoint(-60.5F, -15F, 11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[96].setRotationPoint(-61F, -16F, 9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 2.25F, -1F, -1.5F, 2.25F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -1.5F, -2.25F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[97].setRotationPoint(-60.5F, -15F, 9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[98].setRotationPoint(-61F, -19F, 7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[99].setRotationPoint(-60.5F, -19F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 253
		bodyModel[100].setRotationPoint(-61F, -19.5F, 5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[101].setRotationPoint(-60.5F, -20F, 3F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[102].setRotationPoint(-61F, -19.75F, 3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[103].setRotationPoint(-61F, -7F, -10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[104].setRotationPoint(-61F, -7F, 5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[105].setRotationPoint(-59F, -17F, -7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[106].setRotationPoint(-59F, -18F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[107].setRotationPoint(-59F, -19F, -7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[108].setRotationPoint(-59F, -18F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[109].setRotationPoint(-59F, -19F, 3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[110].setRotationPoint(-59F, -16.25F, -10F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 128
		bodyModel[111].setRotationPoint(-59F, -18F, -7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[112].setRotationPoint(57F, -17F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[113].setRotationPoint(57F, -18F, -10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[114].setRotationPoint(57F, -18F, 7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[115].setRotationPoint(57F, -16.25F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 118, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[116].setRotationPoint(-59F, -16F, -11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 118, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[117].setRotationPoint(-59F, -16F, 10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 118, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[118].setRotationPoint(-59F, -20F, -3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 118, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[119].setRotationPoint(-59F, -20F, -7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 118, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[120].setRotationPoint(-59F, -19F, -10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 118, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[121].setRotationPoint(-59F, -20F, 3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 118, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[122].setRotationPoint(-59F, -19F, 7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[123].setRotationPoint(32F, 4F, 10.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 2
		bodyModel[124].setRotationPoint(-34F, 4F, 10.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 66, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[125].setRotationPoint(-33F, 3F, 10.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 64, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[126].setRotationPoint(-32F, 4F, 10.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[127].setRotationPoint(32F, 4F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 37
		bodyModel[128].setRotationPoint(-34F, 4F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 66, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[129].setRotationPoint(-33F, 3F, -11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 64, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[130].setRotationPoint(-32F, 4F, -11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[131].setRotationPoint(52F, 3F, -11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[132].setRotationPoint(-52F, 3F, 10.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[133].setRotationPoint(-52F, 3F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[134].setRotationPoint(33F, 3F, 10.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[135].setRotationPoint(33F, 3F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[136].setRotationPoint(-59F, -19F, -3F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[137].setRotationPoint(-58.5F, -6F, 11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[138].setRotationPoint(-58.5F, -6F, -12F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[139].setRotationPoint(-53F, 4F, 10.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[140].setRotationPoint(32F, 4F, 10.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[141].setRotationPoint(-53F, 4F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[142].setRotationPoint(32F, 4F, -11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[143].setRotationPoint(16.5F, -6F, 3F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[144].setRotationPoint(16.5F, -6F, -10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 70, 2, 1, 0F,0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 170
		bodyModel[145].setRotationPoint(-13F, -16.85F, 9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 70, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F); // Box 528
		bodyModel[146].setRotationPoint(-13F, -16.85F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 70, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[147].setRotationPoint(-13F, -19F, -6F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 70, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 324
		bodyModel[148].setRotationPoint(-13F, -19F, 3F);

		bodyModel[149].addBox(0F, 0F, 0F, 70, 5, 1, 0F); // Box 128
		bodyModel[149].setRotationPoint(-13F, -16F, 9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 70, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 128
		bodyModel[150].setRotationPoint(-13F, -16.85F, 9F);

		bodyModel[151].addBox(0F, 0F, 0F, 70, 5, 1, 0F); // Box 329
		bodyModel[151].setRotationPoint(-13F, -16F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 70, 1, 1, 0F,0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 330
		bodyModel[152].setRotationPoint(-13F, -16.85F, -10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 70, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 128
		bodyModel[153].setRotationPoint(-13F, -17.45F, 8F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 70, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 332
		bodyModel[154].setRotationPoint(-13F, -17.45F, -9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[155].setRotationPoint(60.5F, -17.25F, 5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 334
		bodyModel[156].setRotationPoint(60.5F, -17.25F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[157].setRotationPoint(-61F, -17.25F, -10F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 336
		bodyModel[158].setRotationPoint(-61F, -17.25F, 5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 70, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324 glow
		bodyModel[159].setRotationPoint(-13F, -18.25F, 6.01F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 70, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338 glow
		bodyModel[160].setRotationPoint(-13F, -18.25F, -6.01F);

		bodyModel[161].addBox(0F, 0F, 0F, 70, 0, 1, 0F); // Box 128 glow
		bodyModel[161].setRotationPoint(-13F, -10.99F, 9F);

		bodyModel[162].addBox(0F, 0F, 0F, 70, 0, 1, 0F); // Box 340 glow
		bodyModel[162].setRotationPoint(-13F, -10.99F, -10F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[163].setRotationPoint(51F, -18F, -1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[164].setRotationPoint(41F, -18F, -1F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[165].setRotationPoint(31F, -18F, -1F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[166].setRotationPoint(21F, -18F, -1F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[167].setRotationPoint(11F, -18F, -1F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[168].setRotationPoint(1F, -18F, -1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[169].setRotationPoint(-9F, -18F, -1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 80, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[170].setRotationPoint(-23F, -10F, -9.9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 105, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[171].setRotationPoint(-48F, -10F, 9.9F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[172].setRotationPoint(-58.5F, 6F, 10.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[173].setRotationPoint(-58.5F, 6F, -10.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[174].setRotationPoint(-59F, 3F, 7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[175].setRotationPoint(58.5F, 3F, 7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 475
		bodyModel[176].setRotationPoint(-59F, 3F, -10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 476
		bodyModel[177].setRotationPoint(58.5F, 3F, -10F);

		bodyModel[178].addBox(0F, 0F, 0F, 49, 1, 0, 0F); // Box 38
		bodyModel[178].setRotationPoint(-23F, -13.5F, -11.01F);

		bodyModel[179].addBox(0F, 0F, 0F, 96, 1, 0, 0F); // Box 38
		bodyModel[179].setRotationPoint(-47.5F, -2.5F, -11.01F);

		bodyModel[180].addBox(0F, 0F, 0F, 49, 1, 0, 0F); // Box 451
		bodyModel[180].setRotationPoint(-23F, -13.5F, 11.01F);

		bodyModel[181].addBox(0F, 0F, 0F, 96, 1, 0, 0F); // Box 452
		bodyModel[181].setRotationPoint(-47.5F, -2.5F, 11.01F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[182].setRotationPoint(-41F, -20.5F, -1F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[183].setRotationPoint(-47F, -20.5F, -1F);

		bodyModel[184].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[184].setRotationPoint(-58F, -19F, -7F);
		bodyModel[184].rotateAngleX = 0.2443461F;

		bodyModel[185].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 487
		bodyModel[185].setRotationPoint(-58F, -19.5F, 5F);
		bodyModel[185].rotateAngleX = -0.2443461F;

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F); // Box 128
		bodyModel[186].setRotationPoint(-55.5F, -17.25F, 10F);
		bodyModel[186].rotateAngleX = 0.41887902F;

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[187].setRotationPoint(-22.5F, -17.65F, -10.92F);
		bodyModel[187].rotateAngleX = -0.41887902F;

		bodyModel[188].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 283
		bodyModel[188].setRotationPoint(-2F, 3F, -10F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[189].setRotationPoint(19F, 3F, -8F);
		bodyModel[189].rotateAngleX = -0.78539816F;

		bodyModel[190].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[190].setRotationPoint(18.99F, 3F, -8.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[191].setRotationPoint(26.01F, 3F, -8.5F);

		bodyModel[192].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 494
		bodyModel[192].setRotationPoint(-11F, 3F, 5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[193].setRotationPoint(-22F, 2.75F, 9.1F);
		bodyModel[193].rotateAngleX = -0.78539816F;

		bodyModel[194].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[194].setRotationPoint(-22.01F, 3F, 8.6F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[195].setRotationPoint(-16.99F, 3F, 8.6F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[196].setRotationPoint(-21F, 2.75F, 6.6F);
		bodyModel[196].rotateAngleX = -0.78539816F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[197].setRotationPoint(-21.01F, 3F, 6.1F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[198].setRotationPoint(-17.99F, 3F, 6.1F);

		bodyModel[199].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[199].setRotationPoint(54F, 3F, -4F);

		bodyModel[200].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[200].setRotationPoint(-58F, 3F, -4F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[201].setRotationPoint(-59F, 3F, 9.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 480
		bodyModel[202].setRotationPoint(58.5F, 3F, 9.5F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 38
		bodyModel[203].setRotationPoint(-24F, -15F, -5F);

		bodyModel[204].addBox(0F, 0F, 0F, 27, 16, 1, 0F); // Box 38
		bodyModel[204].setRotationPoint(-50F, -15F, 5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 16, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[205].setRotationPoint(-50F, -15F, -3F);

		bodyModel[206].addBox(0F, 0F, 0F, 6, 16, 6, 0F); // Box 38
		bodyModel[206].setRotationPoint(-19F, -15F, -10F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 6, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[207].setRotationPoint(-19F, -15F, 4F);

		bodyModel[208].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 38
		bodyModel[208].setRotationPoint(-13F, -5F, -10F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 38
		bodyModel[209].setRotationPoint(-11.5F, -4F, -5F);

		bodyModel[210].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 279
		bodyModel[210].setRotationPoint(-13F, -5F, 3F);

		bodyModel[211].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 280
		bodyModel[211].setRotationPoint(-11.5F, -4F, 4F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 38
		bodyModel[212].setRotationPoint(-14F, -6F, -4F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[213].setRotationPoint(-14F, -7F, -4F);

		bodyModel[214].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 38
		bodyModel[214].setRotationPoint(-14F, -6F, 3F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[215].setRotationPoint(-14F, -7F, 3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[216].setRotationPoint(-24F, -19F, -7F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[217].setRotationPoint(-24F, -19F, 3F);

		bodyModel[218].addBox(0F, 0F, 0F, 11, 1, 14, 0F); // Box 128
		bodyModel[218].setRotationPoint(-24F, -18F, -7F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[219].setRotationPoint(-24F, -18F, -10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 45, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185
		bodyModel[220].setRotationPoint(-58F, -18F, 7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 11, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[221].setRotationPoint(-24F, -17F, -7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 11, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[222].setRotationPoint(-24F, -16.25F, -10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[223].setRotationPoint(-58F, -19F, -7F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[224].setRotationPoint(-58F, -19F, 3F);

		bodyModel[225].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // Box 128
		bodyModel[225].setRotationPoint(-58F, -18F, -7F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[226].setRotationPoint(-58F, -18F, -10F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 9, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[227].setRotationPoint(-58F, -17F, -7F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 9, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[228].setRotationPoint(-58F, -16.25F, -10F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 25, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[229].setRotationPoint(-49F, -16.25F, 7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 25, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[230].setRotationPoint(-49F, -19F, 5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 25, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[231].setRotationPoint(-49F, -18F, 5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 83, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[232].setRotationPoint(-24F, -19F, -3F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[233].setRotationPoint(-57.95F, -2F, 8.55F);
		bodyModel[233].rotateAngleY = -0.78539816F;

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[234].setRotationPoint(-57.6F, -1F, 8.9F);
		bodyModel[234].rotateAngleY = -0.78539816F;

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[235].setRotationPoint(-57.95F, 0.5F, 8.55F);
		bodyModel[235].rotateAngleY = -0.78539816F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[236].setRotationPoint(-54F, -15F, 5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[237].setRotationPoint(-58F, -15F, 4F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[238].setRotationPoint(-55F, -15F, 3F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 72
		bodyModel[239].setRotationPoint(-58F, -10F, 2.99F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 87
		bodyModel[240].setRotationPoint(-56.75F, -8.75F, 3F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 5, 16, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[241].setRotationPoint(-58F, -15F, -10F);

		bodyModel[242].addShapeBox(-4F, 0F, -1F, 4, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left side loading door
		bodyModel[242].setRotationPoint(-48F, -11F, -10F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 4, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right side loading door
		bodyModel[243].setRotationPoint(-52F, -11F, 10F);

		bodyModel[244].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 38
		bodyModel[244].setRotationPoint(-52F, -15F, -11F);

		bodyModel[245].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 128
		bodyModel[245].setRotationPoint(-52F, -15F, 10F);

		bodyModel[246].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 38
		bodyModel[246].setRotationPoint(-59F, -15F, -11F);

		bodyModel[247].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 128
		bodyModel[247].setRotationPoint(-59F, -15F, 10F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[248].setRotationPoint(-53F, -15F, -4F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[249].setRotationPoint(-53F, -15F, -5F);

		bodyModel[250].addBox(0F, 0F, 0F, 19, 7, 3, 0F); // Box 38
		bodyModel[250].setRotationPoint(-47F, -6F, -10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[251].setRotationPoint(-48F, -17F, -10F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[252].setRotationPoint(-49F, -18F, -10F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[253].setRotationPoint(-49F, -17F, -10F);

		bodyModel[254].addBox(0F, 0F, 0F, 3, 7, 3, 0F); // Box 38
		bodyModel[254].setRotationPoint(-35F, -6F, -7F);

		bodyModel[255].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 38
		bodyModel[255].setRotationPoint(-35F, -6F, -4F);

		bodyModel[256].addBox(0F, 0F, 0F, 3, 7, 2, 0F); // Box 38
		bodyModel[256].setRotationPoint(-35F, -6F, -1F);

		bodyModel[257].addBox(0F, 0F, 0F, 14, 7, 4, 0F); // Box 38
		bodyModel[257].setRotationPoint(-49F, -6F, 1F);

		bodyModel[258].addBox(0F, 0F, 0F, 11, 7, 4, 0F); // Box 38
		bodyModel[258].setRotationPoint(-35F, -6F, 1F);

		bodyModel[259].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Box 38
		bodyModel[259].setRotationPoint(-27F, -6F, -4F);

		bodyModel[260].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[260].setRotationPoint(-26F, -6F, -5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[261].setRotationPoint(-27F, -6F, -5F);

		bodyModel[262].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 38
		bodyModel[262].setRotationPoint(-28F, -6F, -10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[263].setRotationPoint(-28F, -6F, -8F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[264].setRotationPoint(-28F, -6F, -8F);

		bodyModel[265].addBox(0F, 0F, 0F, 3, 5, 12, 0F); // Box 38
		bodyModel[265].setRotationPoint(-38F, -18F, -7F);

		bodyModel[266].addBox(0F, 0F, 0F, 11, 8, 3, 0F); // Box 38
		bodyModel[266].setRotationPoint(-35F, -19F, 2F);

		bodyModel[267].addBox(0F, 0F, 0F, 3, 8, 7, 0F); // Box 38
		bodyModel[267].setRotationPoint(-27F, -19F, -5F);

		bodyModel[268].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 38
		bodyModel[268].setRotationPoint(-38F, -19F, -3F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[269].setRotationPoint(-38F, -19F, -7F);

		bodyModel[270].addBox(0F, 0F, 0F, 3, 7, 9, 0F); // Box 38
		bodyModel[270].setRotationPoint(-35F, -18F, -7F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 8, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[271].setRotationPoint(-35F, -17F, -10F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 0, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[272].setRotationPoint(-23F, -15F, -10F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -0.5F, 0F, -4F, -0.5F); // Box 38 cull
		bodyModel[273].setRotationPoint(-26.5F, -4F, -10F);

		bodyModel[274].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 128
		bodyModel[274].setRotationPoint(-43F, -14F, 2F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[275].setRotationPoint(-41F, -7F, -1F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[276].setRotationPoint(-35F, -11F, 2F);

		bodyModel[277].addShapeBox(-1F, 0F, -1F, 2, 6, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 128
		bodyModel[277].setRotationPoint(-40.5F, -19F, 3.5F);
		bodyModel[277].rotateAngleY = 0.78539816F;

		bodyModel[278].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[278].setRotationPoint(-41F, -7F, -2F);

		bodyModel[279].addBox(0F, 0F, 0F, 12, 7, 2, 0F); // Box 38
		bodyModel[279].setRotationPoint(-47F, -6F, -1F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[280].setRotationPoint(-44F, -18F, -3.5F);

		bodyModel[281].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 426
		bodyModel[281].setRotationPoint(-43.5F, -19F, -3F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[282].setRotationPoint(-30.5F, -18F, -3.5F);

		bodyModel[283].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 426
		bodyModel[283].setRotationPoint(-30F, -19F, -3F);

		bodyModel[284].addShapeBox(-1F, 0F, -1F, 2, 4, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 128 coffee urn
		bodyModel[284].setRotationPoint(-36.5F, -11F, 3F);
		bodyModel[284].rotateAngleY = 0.78539816F;

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[285].setRotationPoint(-40.5F, -9.75F, 0F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[286].setRotationPoint(-40.5F, -9.75F, 3F);

		bodyModel[287].addBox(0F, 0F, 0F, 2, 7, 6, 0F); // Box 38
		bodyModel[287].setRotationPoint(-24F, -6F, -3F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[288].setRotationPoint(-23F, -6F, -4F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[289].setRotationPoint(-23F, -6F, 3F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[290].setRotationPoint(-23F, -15F, -3F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[291].setRotationPoint(-23F, -15F, -3.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[292].setRotationPoint(-23F, -15F, 3F);

		bodyModel[293].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 38
		bodyModel[293].setRotationPoint(-24F, -15F, 3F);

		bodyModel[294].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 38
		bodyModel[294].setRotationPoint(-24F, -15F, -3F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[295].setRotationPoint(-34F, -10.99F, 3F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 0, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[296].setRotationPoint(-26F, -10.99F, -5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 13, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[297].setRotationPoint(-48F, -12.99F, -9F);

		bodyModel[298].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Back end door
		bodyModel[298].setRotationPoint(58.01F, -14F, 3F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[299].setRotationPoint(57F, -19F, -7F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[300].setRotationPoint(57F, -19F, 3F);

		bodyModel[301].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 128
		bodyModel[301].setRotationPoint(57F, -18F, -7F);

		bodyModel[302].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 128
		bodyModel[302].setRotationPoint(57F, -15F, -10F);

		bodyModel[303].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 128
		bodyModel[303].setRotationPoint(57F, -15F, 4F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38
		bodyModel[304].setRotationPoint(57F, -6F, -4F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[305].setRotationPoint(57F, -7F, -4F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38
		bodyModel[306].setRotationPoint(57F, -6F, 3F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[307].setRotationPoint(57F, -7F, 3F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[308].setRotationPoint(55.5F, 6F, 10.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[309].setRotationPoint(55.5F, 6F, -10.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[310].setRotationPoint(58.5F, -6F, 11F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[311].setRotationPoint(58.5F, -6F, -12F);

		bodyModel[312].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 38
		bodyModel[312].setRotationPoint(-3F, -5F, -10F);

		bodyModel[313].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 38
		bodyModel[313].setRotationPoint(-1.5F, -4F, -5F);

		bodyModel[314].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 38
		bodyModel[314].setRotationPoint(7F, -5F, -10F);

		bodyModel[315].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 38
		bodyModel[315].setRotationPoint(8.5F, -4F, -5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 38
		bodyModel[316].setRotationPoint(-9F, -3F, -9F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 38
		bodyModel[317].setRotationPoint(1F, -3F, -9F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 38
		bodyModel[318].setRotationPoint(11F, -3F, -9F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -4F, -0.25F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[319].setRotationPoint(14.5F, -7F, -9F);

		bodyModel[320].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 279
		bodyModel[320].setRotationPoint(-3F, -5F, 3F);

		bodyModel[321].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 280
		bodyModel[321].setRotationPoint(-1.5F, -4F, 4F);

		bodyModel[322].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 279
		bodyModel[322].setRotationPoint(7F, -5F, 3F);

		bodyModel[323].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 280
		bodyModel[323].setRotationPoint(8.5F, -4F, 4F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[324].setRotationPoint(-9F, -2F, -9F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 9, 0, 8, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F); // Box 38
		bodyModel[325].setRotationPoint(-9F, -0.5F, -9F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 281
		bodyModel[326].setRotationPoint(-9F, -3F, 5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 283 cull
		bodyModel[327].setRotationPoint(-9F, -2F, 5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 9, 0, 8, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F); // Box 284
		bodyModel[328].setRotationPoint(-9F, -0.5F, 5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[329].setRotationPoint(1F, -2F, -9F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 9, 0, 8, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F); // Box 38
		bodyModel[330].setRotationPoint(1F, -0.5F, -9F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 281
		bodyModel[331].setRotationPoint(1F, -3F, 5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 283 cull
		bodyModel[332].setRotationPoint(1F, -2F, 5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 9, 0, 8, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F); // Box 284
		bodyModel[333].setRotationPoint(1F, -0.5F, 5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[334].setRotationPoint(11F, -2F, -9F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 9, 0, 8, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F); // Box 38
		bodyModel[335].setRotationPoint(11F, -0.5F, -9F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 281
		bodyModel[336].setRotationPoint(11F, -3F, 5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 283 cull
		bodyModel[337].setRotationPoint(11F, -2F, 5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 9, 0, 8, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F); // Box 284
		bodyModel[338].setRotationPoint(11F, -0.5F, 5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[339].setRotationPoint(14.5F, -6F, -9F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[340].setRotationPoint(14.5F, -4F, -9F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -4F, -0.25F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[341].setRotationPoint(4.5F, -7F, -9F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[342].setRotationPoint(4.5F, -6F, -9F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[343].setRotationPoint(4.5F, -4F, -9F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -4F, -0.25F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[344].setRotationPoint(-5.5F, -7F, -9F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[345].setRotationPoint(-5.5F, -6F, -9F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[346].setRotationPoint(-5.5F, -4F, -9F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -4F, -0.25F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[347].setRotationPoint(14.5F, -7F, 5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[348].setRotationPoint(14.5F, -6F, 5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[349].setRotationPoint(14.5F, -4F, 5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -4F, -0.25F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[350].setRotationPoint(4.5F, -7F, 5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[351].setRotationPoint(4.5F, -6F, 5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[352].setRotationPoint(4.5F, -4F, 5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -4F, -0.25F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[353].setRotationPoint(-5.5F, -7F, 5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[354].setRotationPoint(-5.5F, -6F, 5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 38 cull
		bodyModel[355].setRotationPoint(-5.5F, -4F, 5F);

		bodyModel[356].addBox(0F, 0F, 0F, 0, 4, 6, 0F); // Box 128
		bodyModel[356].setRotationPoint(16.75F, -11F, -10F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[357].setRotationPoint(16.75F, -11F, -5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[358].setRotationPoint(16.5F, -7F, -4F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[359].setRotationPoint(16.5F, -7F, -10F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[360].setRotationPoint(15.75F, -11.01F, -9F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F); // Box 128
		bodyModel[361].setRotationPoint(15.75F, -11.01F, -8F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[362].setRotationPoint(15.75F, -11.01F, 8F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[363].setRotationPoint(15.75F, -11.01F, 7F);

		bodyModel[364].addBox(0F, 0F, 0F, 0, 4, 6, 0F); // Box 128
		bodyModel[364].setRotationPoint(16.75F, -11F, 4F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[365].setRotationPoint(16.75F, -11F, 4F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[366].setRotationPoint(16.5F, -7F, 3F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[367].setRotationPoint(16.5F, -7F, 4F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 71, 1, 3, 0F,-0.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 329
		bodyModel[368].setRotationPoint(-13F, -14F, -9F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 71, 0, 2, 0F,-0.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 329 glow
		bodyModel[369].setRotationPoint(-13F, -12.99F, -8.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 71, 1, 3, 0F,-0.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 329
		bodyModel[370].setRotationPoint(-13F, -14F, 6F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 71, 0, 2, 0F,-0.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 329 glow
		bodyModel[371].setRotationPoint(-13F, -12.99F, 6.5F);

		bodyModel[372].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 38
		bodyModel[372].setRotationPoint(28F, -5F, -10F);

		bodyModel[373].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 38
		bodyModel[373].setRotationPoint(35F, -5F, -10F);

		bodyModel[374].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 38
		bodyModel[374].setRotationPoint(44F, -5F, -10F);

		bodyModel[375].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 38
		bodyModel[375].setRotationPoint(36F, -5F, -9F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[376].setRotationPoint(35F, -5F, -9F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[377].setRotationPoint(38F, -5F, -9F);

		bodyModel[378].addBox(0F, 0F, 0F, 11, 2, 4, 0F); // Box 38
		bodyModel[378].setRotationPoint(17F, -3F, -10F);

		bodyModel[379].addBox(0F, 0F, 0F, 11, 2, 3, 0F); // Box 38
		bodyModel[379].setRotationPoint(17F, -1F, -10F);

		bodyModel[380].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 38
		bodyModel[380].setRotationPoint(17F, -3F, -6F);

		bodyModel[381].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 38
		bodyModel[381].setRotationPoint(17F, -1F, -7F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[382].setRotationPoint(19F, -1F, -7F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[383].setRotationPoint(20F, -3F, -6F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[384].setRotationPoint(20F, -5F, -10F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[385].setRotationPoint(17F, -5F, -6F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[386].setRotationPoint(17F, -5F, -10F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-3F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[387].setRotationPoint(17F, -5F, -10F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[388].setRotationPoint(17F, -5F, -10F);

		bodyModel[389].addBox(0F, 0F, 0F, 11, 2, 4, 0F); // Box 485
		bodyModel[389].setRotationPoint(17F, -3F, 6F);

		bodyModel[390].addBox(0F, 0F, 0F, 11, 2, 3, 0F); // Box 486
		bodyModel[390].setRotationPoint(17F, -1F, 7F);

		bodyModel[391].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 487
		bodyModel[391].setRotationPoint(17F, -3F, 3F);

		bodyModel[392].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 488
		bodyModel[392].setRotationPoint(17F, -1F, 4F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[393].setRotationPoint(19F, -1F, 6F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[394].setRotationPoint(20F, -3F, 5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[395].setRotationPoint(20F, -5F, 9F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[396].setRotationPoint(17F, -5F, 3F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 493
		bodyModel[397].setRotationPoint(17F, -5F, 6F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-3F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.05F, -1F, -3F, 0F, 0F); // Box 494
		bodyModel[398].setRotationPoint(17F, -5F, 6F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[399].setRotationPoint(17F, -5F, 6F);

		bodyModel[400].addBox(0F, 0F, 0F, 11, 2, 4, 0F); // Box 38
		bodyModel[400].setRotationPoint(46F, -3F, -10F);

		bodyModel[401].addBox(0F, 0F, 0F, 11, 2, 3, 0F); // Box 38
		bodyModel[401].setRotationPoint(46F, -1F, -10F);

		bodyModel[402].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 38
		bodyModel[402].setRotationPoint(54F, -3F, -6F);

		bodyModel[403].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 38
		bodyModel[403].setRotationPoint(55F, -1F, -7F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[404].setRotationPoint(27F, -5F, -10F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[405].setRotationPoint(27F, -5F, 9F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[406].setRotationPoint(47F, -5F, -10F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[407].setRotationPoint(56F, -5F, -6F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 38
		bodyModel[408].setRotationPoint(54F, -5F, -10F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[409].setRotationPoint(56F, -5F, -10F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[410].setRotationPoint(56F, -5F, -10F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[411].setRotationPoint(46F, -5F, -10F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[412].setRotationPoint(54F, -1F, -7F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[413].setRotationPoint(53F, -3F, -6F);

		bodyModel[414].addBox(0F, 0F, 0F, 11, 2, 4, 0F); // Box 510
		bodyModel[414].setRotationPoint(46F, -3F, 6F);

		bodyModel[415].addBox(0F, 0F, 0F, 11, 2, 3, 0F); // Box 511
		bodyModel[415].setRotationPoint(46F, -1F, 7F);

		bodyModel[416].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 512
		bodyModel[416].setRotationPoint(54F, -3F, 3F);

		bodyModel[417].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 513
		bodyModel[417].setRotationPoint(55F, -1F, 4F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[418].setRotationPoint(47F, -5F, 9F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[419].setRotationPoint(56F, -5F, 3F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[420].setRotationPoint(54F, -5F, 6F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 517
		bodyModel[421].setRotationPoint(56F, -5F, 6F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,2F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -1F); // Box 518
		bodyModel[422].setRotationPoint(56F, -5F, 6F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[423].setRotationPoint(46F, -5F, 9F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[424].setRotationPoint(54F, -1F, 6F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[425].setRotationPoint(53F, -3F, 5F);

		bodyModel[426].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 38
		bodyModel[426].setRotationPoint(40F, -5F, 5F);

		bodyModel[427].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 38
		bodyModel[427].setRotationPoint(32F, -5F, 5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[428].setRotationPoint(22F, -5F, 4F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 128
		bodyModel[429].setRotationPoint(22F, -5F, 5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[430].setRotationPoint(25F, -5F, 5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[431].setRotationPoint(22F, -5F, 3F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[432].setRotationPoint(25F, -5F, 3F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[433].setRotationPoint(25F, -5F, 4F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[434].setRotationPoint(23F, -5F, 3F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[435].setRotationPoint(48F, -5F, 4F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 128
		bodyModel[436].setRotationPoint(48F, -5F, 5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[437].setRotationPoint(51F, -5F, 5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[438].setRotationPoint(48F, -5F, 3F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[439].setRotationPoint(51F, -5F, 3F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[440].setRotationPoint(51F, -5F, 4F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[441].setRotationPoint(49F, -5F, 3F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[442].setRotationPoint(22F, -5F, -5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[443].setRotationPoint(22F, -5F, -6F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[444].setRotationPoint(25F, -5F, -6F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 528
		bodyModel[445].setRotationPoint(22F, -5F, -4F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 529
		bodyModel[446].setRotationPoint(25F, -5F, -4F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[447].setRotationPoint(25F, -5F, -5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		bodyModel[448].setRotationPoint(23F, -5F, -6F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		bodyModel[449].setRotationPoint(48F, -5F, -5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		bodyModel[450].setRotationPoint(48F, -5F, -6F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		bodyModel[451].setRotationPoint(51F, -5F, -6F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 536
		bodyModel[452].setRotationPoint(48F, -5F, -4F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[453].setRotationPoint(51F, -5F, -4F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[454].setRotationPoint(51F, -5F, -5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[455].setRotationPoint(49F, -5F, -6F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 531 cull
		bodyModel[456].setRotationPoint(23F, -4F, -4.75F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 531 cull
		bodyModel[457].setRotationPoint(23F, -4F, 4.25F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 531 cull
		bodyModel[458].setRotationPoint(49F, -4F, -4.75F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 531 cull
		bodyModel[459].setRotationPoint(49F, -4F, 4.25F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -5.01F, 0F, -2F, -5.01F, 0F, -2F, -5.01F, -0.5F, 0F, -5.01F, -0.5F); // Box 531 cull
		bodyModel[460].setRotationPoint(28F, -4F, -6F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -5.01F, 0F, -2F, -5.01F, 0F, -2F, -5.01F, -0.5F, 0F, -5.01F, -0.5F); // Box 531 cull
		bodyModel[461].setRotationPoint(44F, -4F, -6F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -5.01F, 0F, -2F, -5.01F, 0F, -2F, -5.01F, -0.5F, 0F, -5.01F, -0.5F); // Box 531 cull
		bodyModel[462].setRotationPoint(32F, -4F, 5.5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -5.01F, 0F, -2F, -5.01F, 0F, -2F, -5.01F, -0.5F, 0F, -5.01F, -0.5F); // Box 531 cull
		bodyModel[463].setRotationPoint(40F, -4F, 5.5F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -5.01F, 0F, -2F, -5.01F, 0F, -2F, -5.01F, -0.5F, 0F, -5.01F, -0.5F); // Box 531 cull
		bodyModel[464].setRotationPoint(36F, -4F, -8F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 38
		bodyModel[465].setRotationPoint(30F, -3F, -9F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 6, 7, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, -3.51F, 0F, -3F, -3.51F, 0F, -3F, -3.51F, -2F, 0F, -3.51F, -2F); // Box 38 cull
		bodyModel[466].setRotationPoint(30F, -2.5F, -9F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, -0.01F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -2F, -0.01F, -2F, -2F); // Box 38 cull
		bodyModel[467].setRotationPoint(32F, -4F, -9F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[468].setRotationPoint(32F, -6F, -9F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 38
		bodyModel[469].setRotationPoint(42F, -3F, -9F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 6, 7, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, -3.51F, 0F, -3F, -3.51F, 0F, -3F, -3.51F, -2F, 0F, -3.51F, -2F); // Box 38 cull
		bodyModel[470].setRotationPoint(41F, -2.5F, -9F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, -0.51F, -2F, 0F, -0.51F, -2F, -2F, 0F, -2F, -2F); // Box 38 cull
		bodyModel[471].setRotationPoint(41.5F, -4F, -9F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[472].setRotationPoint(41.5F, -6F, -9F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 38
		bodyModel[473].setRotationPoint(34F, -3F, 7F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 6, 7, 4, 0F,0F, 0F, 0F, -3.01F, 0F, 0F, -3.01F, 0F, -2F, 0F, 0F, -2F, 0F, -3.51F, 0F, -3.01F, -3.51F, 0F, -3.01F, -3.51F, -2F, 0F, -3.51F, -2F); // Box 38 cull
		bodyModel[474].setRotationPoint(34F, -2.5F, 7F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, -0.01F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -2F, -0.01F, -2F, -2F); // Box 38 cull
		bodyModel[475].setRotationPoint(36F, -4F, 7F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[476].setRotationPoint(36F, -6F, 7F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 38
		bodyModel[477].setRotationPoint(38F, -3F, 7F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 6, 7, 4, 0F,-0.01F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -3.51F, 0F, -3F, -3.51F, 0F, -3F, -3.51F, -2F, -0.01F, -3.51F, -2F); // Box 38 cull
		bodyModel[478].setRotationPoint(37F, -2.5F, 7F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, -0.51F, -2F, 0F, -0.51F, -2F, -2F, 0F, -2F, -2F); // Box 38 cull
		bodyModel[479].setRotationPoint(37.5F, -4F, 7F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[480].setRotationPoint(37.5F, -6F, 7F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 38
		bodyModel[481].setRotationPoint(42F, -3F, 7F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 6, 7, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, -3.51F, 0F, -3F, -3.51F, 0F, -3F, -3.51F, -2F, 0F, -3.51F, -2F); // Box 38 cull
		bodyModel[482].setRotationPoint(42F, -2.5F, 7F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, -0.01F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -2F, -0.01F, -2F, -2F); // Box 38 cull
		bodyModel[483].setRotationPoint(44F, -4F, 7F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[484].setRotationPoint(44F, -6F, 7F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 38
		bodyModel[485].setRotationPoint(30F, -3F, 7F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 6, 7, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, -3.51F, 0F, -3F, -3.51F, 0F, -3F, -3.51F, -2F, 0F, -3.51F, -2F); // Box 38 cull
		bodyModel[486].setRotationPoint(29F, -2.5F, 7F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, -0.51F, -2F, 0F, -0.51F, -2F, -2F, 0F, -2F, -2F); // Box 38 cull
		bodyModel[487].setRotationPoint(29.5F, -4F, 7F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[488].setRotationPoint(29.5F, -6F, 7F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 38
		bodyModel[489].setRotationPoint(36F, -3F, -7F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 4, 7, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, -3.51F, 0F, -2F, -3.51F, 0F, -2F, -3.51F, -3F, 0F, -3.51F, -3F); // Box 38 cull
		bodyModel[490].setRotationPoint(36F, -2.5F, -7F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.51F, -2F, -2F, -0.51F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 38 cull
		bodyModel[491].setRotationPoint(36F, -4F, -5.5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[492].setRotationPoint(36F, -6F, -5.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 38
		bodyModel[493].setRotationPoint(32F, -3F, 3F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 4, 7, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, -3.51F, 0F, -2F, -3.51F, 0F, -2F, -3.51F, -3F, 0F, -3.51F, -3F); // Box 38 cull
		bodyModel[494].setRotationPoint(32F, -2.5F, 2F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.01F, -2F, -0.5F, -2F, -2F, -0.5F, -2F, -2F, 0F, -0.01F, -2F, 0F); // Box 38 cull
		bodyModel[495].setRotationPoint(32F, -4F, 2F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[496].setRotationPoint(32F, -6F, 2F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 38
		bodyModel[497].setRotationPoint(40F, -3F, 3F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 4, 7, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, -3.51F, 0F, -2F, -3.51F, 0F, -2F, -3.51F, -3F, 0F, -3.51F, -3F); // Box 38 cull
		bodyModel[498].setRotationPoint(40F, -2.5F, 2F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.01F, -2F, -0.5F, -2F, -2F, -0.5F, -2F, -2F, 0F, -0.01F, -2F, 0F); // Box 38 cull
		bodyModel[499].setRotationPoint(40F, -4F, 2F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 425, 439, textureX, textureY); // Box 38
		bodyModel[501] = new ModelRendererTurbo(this, 365, 472, textureX, textureY); // Box 38
		bodyModel[502] = new ModelRendererTurbo(this, 363, 478, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[503] = new ModelRendererTurbo(this, 368, 466, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[504] = new ModelRendererTurbo(this, 368, 462, textureX, textureY); // Box 38
		bodyModel[505] = new ModelRendererTurbo(this, 397, 472, textureX, textureY); // Box 38
		bodyModel[506] = new ModelRendererTurbo(this, 395, 478, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[507] = new ModelRendererTurbo(this, 400, 466, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[508] = new ModelRendererTurbo(this, 400, 462, textureX, textureY); // Box 38
		bodyModel[509] = new ModelRendererTurbo(this, 33, 330, textureX, textureY); // Box 128
		bodyModel[510] = new ModelRendererTurbo(this, 33, 325, textureX, textureY); // Box 128
		bodyModel[511] = new ModelRendererTurbo(this, 93, 4, textureX, textureY); // Box 128
		bodyModel[512] = new ModelRendererTurbo(this, 106, 13, textureX, textureY); // Box 205
		bodyModel[513] = new ModelRendererTurbo(this, 84, 13, textureX, textureY); // Box 205
		bodyModel[514] = new ModelRendererTurbo(this, 102, 9, textureX, textureY); // Box 38
		bodyModel[515] = new ModelRendererTurbo(this, 111, 9, textureX, textureY); // Box 38
		bodyModel[516] = new ModelRendererTurbo(this, 120, 9, textureX, textureY); // Box 38
		bodyModel[517] = new ModelRendererTurbo(this, 31, 320, textureX, textureY); // Box 128
		bodyModel[518] = new ModelRendererTurbo(this, 67, 166, textureX, textureY); // Box 472
		bodyModel[519] = new ModelRendererTurbo(this, 67, 164, textureX, textureY); // Box 472
		bodyModel[520] = new ModelRendererTurbo(this, 67, 159, textureX, textureY); // Box 472
		bodyModel[521] = new ModelRendererTurbo(this, 67, 157, textureX, textureY); // Box 472
		bodyModel[522] = new ModelRendererTurbo(this, 105, 343, textureX, textureY); // Box 38
		bodyModel[523] = new ModelRendererTurbo(this, 220, 312, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[524] = new ModelRendererTurbo(this, 197, 307, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[525] = new ModelRendererTurbo(this, 200, 305, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[526] = new ModelRendererTurbo(this, 198, 174, textureX, textureY); // Box 41
		bodyModel[527] = new ModelRendererTurbo(this, 198, 172, textureX, textureY); // Box 41
		bodyModel[528] = new ModelRendererTurbo(this, 218, 172, textureX, textureY); // Box 41
		bodyModel[529] = new ModelRendererTurbo(this, 20, 326, textureX, textureY); // Box 128

		bodyModel[500].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[500].setRotationPoint(40F, -6F, 2F);

		bodyModel[501].addShapeBox(-1F, 0F, -1F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 38
		bodyModel[501].setRotationPoint(34.5F, -3F, -7F);
		bodyModel[501].rotateAngleY = 0.78539816F;

		bodyModel[502].addShapeBox(-1F, 0F, -1F, 4, 7, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, -3.51F, 0F, -2F, -3.51F, 0F, -2F, -3.51F, -3F, 0F, -3.51F, -3F); // Box 38 cull
		bodyModel[502].setRotationPoint(34.5F, -2.5F, -7F);
		bodyModel[502].rotateAngleY = 0.78539816F;

		bodyModel[503].addShapeBox(-1F, 0F, 0.5F, 4, 4, 1, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.51F, -2F, -2F, -0.51F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 38 cull
		bodyModel[503].setRotationPoint(34.5F, -4F, -7F);
		bodyModel[503].rotateAngleY = 0.78539816F;

		bodyModel[504].addShapeBox(-1F, 0F, 0.5F, 4, 2, 1, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[504].setRotationPoint(34.5F, -6F, -7F);
		bodyModel[504].rotateAngleY = 0.78539816F;

		bodyModel[505].addShapeBox(-1F, 0F, -1F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 38
		bodyModel[505].setRotationPoint(39.5F, -3F, -7F);
		bodyModel[505].rotateAngleY = -0.78539816F;

		bodyModel[506].addShapeBox(-1F, 0F, -1F, 4, 7, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, -3.51F, 0F, -2F, -3.51F, 0F, -2F, -3.51F, -3F, 0F, -3.51F, -3F); // Box 38 cull
		bodyModel[506].setRotationPoint(39.5F, -2.5F, -7F);
		bodyModel[506].rotateAngleY = -0.78539816F;

		bodyModel[507].addShapeBox(-1F, 0F, 0.5F, 4, 4, 1, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.51F, -2F, -2F, -0.51F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 38 cull
		bodyModel[507].setRotationPoint(39.5F, -4F, -7F);
		bodyModel[507].rotateAngleY = -0.78539816F;

		bodyModel[508].addShapeBox(-1F, 0F, 0.5F, 4, 2, 1, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[508].setRotationPoint(39.5F, -6F, -7F);
		bodyModel[508].rotateAngleY = -0.78539816F;

		bodyModel[509].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[509].setRotationPoint(-47F, -12F, 2F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[510].setRotationPoint(-47F, -13F, 2F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F); // Box 128
		bodyModel[511].setRotationPoint(-22.5F, -17.25F, 10F);
		bodyModel[511].rotateAngleX = 0.41887902F;

		bodyModel[512].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 205
		bodyModel[512].setRotationPoint(-14F, -17.47F, -10.12F);
		bodyModel[512].rotateAngleX = 0.5279621F;

		bodyModel[513].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 205
		bodyModel[513].setRotationPoint(-53F, -17.47F, -10.12F);
		bodyModel[513].rotateAngleX = 0.5279621F;

		bodyModel[514].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[514].setRotationPoint(-30F, -20.5F, -1F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[515].setRotationPoint(27F, -20.5F, -1F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[516].setRotationPoint(50F, -20.5F, -1F);

		bodyModel[517].addShapeBox(-1F, 0F, -1F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 128
		bodyModel[517].setRotationPoint(-45F, -19F, 4.75F);
		bodyModel[517].rotateAngleY = 0.78539816F;

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 472
		bodyModel[518].setRotationPoint(-52F, 4F, -11F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 472
		bodyModel[519].setRotationPoint(-52F, 5.5F, -11F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 472
		bodyModel[520].setRotationPoint(-52F, 4F, 10.5F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 472
		bodyModel[521].setRotationPoint(-52F, 5.5F, 10.5F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[522].setRotationPoint(-48F, -6F, -10F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 0, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[523].setRotationPoint(-21.5F, -14.99F, -8.5F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[524].setRotationPoint(-54.5F, -14.99F, -0.5F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 22, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[525].setRotationPoint(-48.5F, -14.99F, 7.5F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[526].setRotationPoint(21F, 4F, 0F);
		bodyModel[526].rotateAngleX = -0.78539816F;

		bodyModel[527].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[527].setRotationPoint(20.99F, 4F, -0.5F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[528].setRotationPoint(29.01F, 4F, -0.5F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[529].setRotationPoint(-47F, -14F, 3.25F);
	}
	ModelPS_Truck_41GT bogie1 = new ModelPS_Truck_41GT();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 530; i++)
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
		if(GetColor(entity)==4 || GetColor(entity)==6){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-GT_truck_RDGBlue.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.66, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-5.32, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if(GetColor(entity)==123456){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-GT_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.66, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-5.32, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-GT_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.66, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-5.32, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}