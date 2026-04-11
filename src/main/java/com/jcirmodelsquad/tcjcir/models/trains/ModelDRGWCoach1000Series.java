//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_2410_Truck;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelP_S_Truck;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelDRGWCoach1000Series extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelDRGWCoach1000Series() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[546];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 284, 137, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 42, 137, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 44, 116, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 144, 227, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 144, 224, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 315, 50, textureX, textureY); // Box 128
		bodyModel[7] = new ModelRendererTurbo(this, 308, 70, textureX, textureY); // Box 128
		bodyModel[8] = new ModelRendererTurbo(this, 323, 61, textureX, textureY); // Box 128
		bodyModel[9] = new ModelRendererTurbo(this, 330, 91, textureX, textureY); // Box 128
		bodyModel[10] = new ModelRendererTurbo(this, 330, 60, textureX, textureY); // Box 128
		bodyModel[11] = new ModelRendererTurbo(this, 307, 80, textureX, textureY); // Box 128
		bodyModel[12] = new ModelRendererTurbo(this, 312, 38, textureX, textureY); // Box 128
		bodyModel[13] = new ModelRendererTurbo(this, 311, 41, textureX, textureY); // Box 128
		bodyModel[14] = new ModelRendererTurbo(this, 325, 41, textureX, textureY); // Box 153
		bodyModel[15] = new ModelRendererTurbo(this, 323, 92, textureX, textureY); // Box 128
		bodyModel[16] = new ModelRendererTurbo(this, 300, 65, textureX, textureY); // Box 60
		bodyModel[17] = new ModelRendererTurbo(this, 285, 84, textureX, textureY); // Box 13
		bodyModel[18] = new ModelRendererTurbo(this, 285, 61, textureX, textureY); // Box 100
		bodyModel[19] = new ModelRendererTurbo(this, 303, 101, textureX, textureY); // Box 100
		bodyModel[20] = new ModelRendererTurbo(this, 300, 88, textureX, textureY); // Box 13
		bodyModel[21] = new ModelRendererTurbo(this, 1, 50, textureX, textureY); // Box 128
		bodyModel[22] = new ModelRendererTurbo(this, 10, 70, textureX, textureY); // Box 128
		bodyModel[23] = new ModelRendererTurbo(this, 2, 91, textureX, textureY); // Box 128
		bodyModel[24] = new ModelRendererTurbo(this, 2, 60, textureX, textureY); // Box 128
		bodyModel[25] = new ModelRendererTurbo(this, 9, 80, textureX, textureY); // Box 128
		bodyModel[26] = new ModelRendererTurbo(this, 2, 38, textureX, textureY); // Box 128
		bodyModel[27] = new ModelRendererTurbo(this, 15, 41, textureX, textureY); // Box 128
		bodyModel[28] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 153
		bodyModel[29] = new ModelRendererTurbo(this, 9, 92, textureX, textureY); // Box 128
		bodyModel[30] = new ModelRendererTurbo(this, 32, 65, textureX, textureY); // Box 60
		bodyModel[31] = new ModelRendererTurbo(this, 39, 84, textureX, textureY); // Box 13
		bodyModel[32] = new ModelRendererTurbo(this, 25, 52, textureX, textureY); // Box 13
		bodyModel[33] = new ModelRendererTurbo(this, 17, 60, textureX, textureY); // Box 60
		bodyModel[34] = new ModelRendererTurbo(this, 39, 61, textureX, textureY); // Box 100
		bodyModel[35] = new ModelRendererTurbo(this, 21, 123, textureX, textureY); // Box 13
		bodyModel[36] = new ModelRendererTurbo(this, 21, 101, textureX, textureY); // Box 100
		bodyModel[37] = new ModelRendererTurbo(this, 32, 60, textureX, textureY); // Box 60
		bodyModel[38] = new ModelRendererTurbo(this, 32, 83, textureX, textureY); // Box 129
		bodyModel[39] = new ModelRendererTurbo(this, 23, 39, textureX, textureY); // Box 130
		bodyModel[40] = new ModelRendererTurbo(this, 9, 61, textureX, textureY); // Box 128
		bodyModel[41] = new ModelRendererTurbo(this, 22, 24, textureX, textureY); // Box 101
		bodyModel[42] = new ModelRendererTurbo(this, 23, 34, textureX, textureY); // Box 60
		bodyModel[43] = new ModelRendererTurbo(this, 32, 88, textureX, textureY); // Box 13
		bodyModel[44] = new ModelRendererTurbo(this, 303, 123, textureX, textureY); // Box 13
		bodyModel[45] = new ModelRendererTurbo(this, 17, 110, textureX, textureY); // Box 2
		bodyModel[46] = new ModelRendererTurbo(this, 18, 110, textureX, textureY); // Box 2
		bodyModel[47] = new ModelRendererTurbo(this, 266, 116, textureX, textureY); // Box 2
		bodyModel[48] = new ModelRendererTurbo(this, 299, 110, textureX, textureY); // Box 2
		bodyModel[49] = new ModelRendererTurbo(this, 274, 110, textureX, textureY); // Box 2
		bodyModel[50] = new ModelRendererTurbo(this, 287, 30, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 287, 1, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 304, 7, textureX, textureY); // Rear vestibule door
		bodyModel[53] = new ModelRendererTurbo(this, 297, 29, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 55, 41, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 55, 8, textureX, textureY); // Box 128
		bodyModel[56] = new ModelRendererTurbo(this, 46, 26, textureX, textureY); // Front vestibule door
		bodyModel[57] = new ModelRendererTurbo(this, 61, 33, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 60, 87, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 60, 65, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 54, 88, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 54, 68, textureX, textureY); // Box 121
		bodyModel[62] = new ModelRendererTurbo(this, 8, 26, textureX, textureY); // Box 60
		bodyModel[63] = new ModelRendererTurbo(this, 2, 115, textureX, textureY); // Box 130
		bodyModel[64] = new ModelRendererTurbo(this, 338, 50, textureX, textureY); // Box 13
		bodyModel[65] = new ModelRendererTurbo(this, 341, 32, textureX, textureY); // Box 101
		bodyModel[66] = new ModelRendererTurbo(this, 268, 87, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 268, 61, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 280, 88, textureX, textureY); // Box 128
		bodyModel[69] = new ModelRendererTurbo(this, 280, 68, textureX, textureY); // Box 121
		bodyModel[70] = new ModelRendererTurbo(this, 307, 60, textureX, textureY); // Box 60
		bodyModel[71] = new ModelRendererTurbo(this, 300, 60, textureX, textureY); // Box 60
		bodyModel[72] = new ModelRendererTurbo(this, 300, 83, textureX, textureY); // Box 129
		bodyModel[73] = new ModelRendererTurbo(this, 347, 52, textureX, textureY); // Box 130
		bodyModel[74] = new ModelRendererTurbo(this, 347, 40, textureX, textureY); // Box 60
		bodyModel[75] = new ModelRendererTurbo(this, 376, 30, textureX, textureY); // Box 130
		bodyModel[76] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 38
		bodyModel[77] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 296, 315, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 296, 280, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 97, 311, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 1, 268, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 40, 120, textureX, textureY); // Front left trapdoor
		bodyModel[83] = new ModelRendererTurbo(this, 40, 114, textureX, textureY); // Front right trapdoor
		bodyModel[84] = new ModelRendererTurbo(this, 280, 120, textureX, textureY); // Rear left trapdoor
		bodyModel[85] = new ModelRendererTurbo(this, 280, 114, textureX, textureY); // Rear right trapdoor
		bodyModel[86] = new ModelRendererTurbo(this, 267, 91, textureX, textureY); // Left rear door
		bodyModel[87] = new ModelRendererTurbo(this, 267, 69, textureX, textureY); // Right rear door
		bodyModel[88] = new ModelRendererTurbo(this, 59, 91, textureX, textureY); // Left front door
		bodyModel[89] = new ModelRendererTurbo(this, 59, 69, textureX, textureY); // Right front door
		bodyModel[90] = new ModelRendererTurbo(this, 267, 135, textureX, textureY); // Box 2
		bodyModel[91] = new ModelRendererTurbo(this, 47, 135, textureX, textureY); // Box 2
		bodyModel[92] = new ModelRendererTurbo(this, 70, 135, textureX, textureY); // Box 2
		bodyModel[93] = new ModelRendererTurbo(this, 70, 132, textureX, textureY); // Box 2
		bodyModel[94] = new ModelRendererTurbo(this, 258, 142, textureX, textureY); // Box 2
		bodyModel[95] = new ModelRendererTurbo(this, 256, 138, textureX, textureY); // Box 2
		bodyModel[96] = new ModelRendererTurbo(this, 72, 142, textureX, textureY); // Box 2
		bodyModel[97] = new ModelRendererTurbo(this, 70, 138, textureX, textureY); // Box 2
		bodyModel[98] = new ModelRendererTurbo(this, 134, 142, textureX, textureY); // Box 2
		bodyModel[99] = new ModelRendererTurbo(this, 103, 142, textureX, textureY); // Box 2
		bodyModel[100] = new ModelRendererTurbo(this, 205, 142, textureX, textureY); // Box 2
		bodyModel[101] = new ModelRendererTurbo(this, 134, 138, textureX, textureY); // Box 532
		bodyModel[102] = new ModelRendererTurbo(this, 103, 138, textureX, textureY); // Box 533
		bodyModel[103] = new ModelRendererTurbo(this, 205, 138, textureX, textureY); // Box 534
		bodyModel[104] = new ModelRendererTurbo(this, 103, 150, textureX, textureY); // Box 2
		bodyModel[105] = new ModelRendererTurbo(this, 229, 150, textureX, textureY); // Box 2
		bodyModel[106] = new ModelRendererTurbo(this, 228, 150, textureX, textureY); // Box 2
		bodyModel[107] = new ModelRendererTurbo(this, 92, 138, textureX, textureY); // Box 540
		bodyModel[108] = new ModelRendererTurbo(this, 228, 138, textureX, textureY); // Box 541
		bodyModel[109] = new ModelRendererTurbo(this, 92, 150, textureX, textureY); // Box 2
		bodyModel[110] = new ModelRendererTurbo(this, 204, 179, textureX, textureY); // Box 341
		bodyModel[111] = new ModelRendererTurbo(this, 165, 176, textureX, textureY); // Box 341
		bodyModel[112] = new ModelRendererTurbo(this, 168, 189, textureX, textureY); // Box 341
		bodyModel[113] = new ModelRendererTurbo(this, 168, 184, textureX, textureY); // Box 341
		bodyModel[114] = new ModelRendererTurbo(this, 168, 194, textureX, textureY); // Box 341
		bodyModel[115] = new ModelRendererTurbo(this, 160, 186, textureX, textureY); // Box 341
		bodyModel[116] = new ModelRendererTurbo(this, 161, 189, textureX, textureY); // Box 341
		bodyModel[117] = new ModelRendererTurbo(this, 165, 186, textureX, textureY); // Box 341
		bodyModel[118] = new ModelRendererTurbo(this, 148, 188, textureX, textureY); // Box 41
		bodyModel[119] = new ModelRendererTurbo(this, 147, 186, textureX, textureY); // Box 41
		bodyModel[120] = new ModelRendererTurbo(this, 157, 186, textureX, textureY); // Box 41
		bodyModel[121] = new ModelRendererTurbo(this, 271, 186, textureX, textureY); // Box 341
		bodyModel[122] = new ModelRendererTurbo(this, 274, 180, textureX, textureY,"cull"); // Box 341 cull
		bodyModel[123] = new ModelRendererTurbo(this, 247, 180, textureX, textureY); // Box 341
		bodyModel[124] = new ModelRendererTurbo(this, 249, 190, textureX, textureY); // Box 341
		bodyModel[125] = new ModelRendererTurbo(this, 264, 180, textureX, textureY); // Box 341
		bodyModel[126] = new ModelRendererTurbo(this, 269, 180, textureX, textureY); // Box 341
		bodyModel[127] = new ModelRendererTurbo(this, 110, 146, textureX, textureY); // Box 341
		bodyModel[128] = new ModelRendererTurbo(this, 163, 147, textureX, textureY); // Box 41
		bodyModel[129] = new ModelRendererTurbo(this, 143, 146, textureX, textureY); // Box 341
		bodyModel[130] = new ModelRendererTurbo(this, 148, 149, textureX, textureY); // Box 341
		bodyModel[131] = new ModelRendererTurbo(this, 151, 146, textureX, textureY,"cull"); // Box 341 cull
		bodyModel[132] = new ModelRendererTurbo(this, 323, 116, textureX, textureY); // Box 128
		bodyModel[133] = new ModelRendererTurbo(this, 326, 116, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 323, 108, textureX, textureY); // Box 202
		bodyModel[135] = new ModelRendererTurbo(this, 326, 108, textureX, textureY); // Box 203
		bodyModel[136] = new ModelRendererTurbo(this, 6, 116, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 9, 116, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 6, 108, textureX, textureY); // Box 202
		bodyModel[139] = new ModelRendererTurbo(this, 9, 108, textureX, textureY); // Box 203
		bodyModel[140] = new ModelRendererTurbo(this, 310, 86, textureX, textureY); // Rear gate closed
		bodyModel[141] = new ModelRendererTurbo(this, 307, 91, textureX, textureY); // Rear gate open
		bodyModel[142] = new ModelRendererTurbo(this, 19, 86, textureX, textureY); // Front gate closed
		bodyModel[143] = new ModelRendererTurbo(this, 16, 91, textureX, textureY); // Front gate open
		bodyModel[144] = new ModelRendererTurbo(this, 303, 148, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[145] = new ModelRendererTurbo(this, 306, 136, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[146] = new ModelRendererTurbo(this, 306, 139, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[147] = new ModelRendererTurbo(this, 306, 143, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[148] = new ModelRendererTurbo(this, 295, 148, textureX, textureY); // Box 2
		bodyModel[149] = new ModelRendererTurbo(this, 295, 142, textureX, textureY); // Box 2
		bodyModel[150] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 2
		bodyModel[151] = new ModelRendererTurbo(this, 295, 136, textureX, textureY); // Box 2
		bodyModel[152] = new ModelRendererTurbo(this, 297, 139, textureX, textureY); // Box 2
		bodyModel[153] = new ModelRendererTurbo(this, 303, 156, textureX, textureY,"cull"); // Box 323 cull
		bodyModel[154] = new ModelRendererTurbo(this, 306, 173, textureX, textureY,"cull"); // Box 323 cull
		bodyModel[155] = new ModelRendererTurbo(this, 306, 169, textureX, textureY,"cull"); // Box 323 cull
		bodyModel[156] = new ModelRendererTurbo(this, 306, 164, textureX, textureY,"cull"); // Box 323 cull
		bodyModel[157] = new ModelRendererTurbo(this, 19, 148, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[158] = new ModelRendererTurbo(this, 22, 136, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[159] = new ModelRendererTurbo(this, 22, 139, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[160] = new ModelRendererTurbo(this, 22, 143, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[161] = new ModelRendererTurbo(this, 19, 156, textureX, textureY,"cull"); // Box 323 cull
		bodyModel[162] = new ModelRendererTurbo(this, 22, 173, textureX, textureY,"cull"); // Box 323 cull
		bodyModel[163] = new ModelRendererTurbo(this, 22, 169, textureX, textureY,"cull"); // Box 323 cull
		bodyModel[164] = new ModelRendererTurbo(this, 22, 164, textureX, textureY,"cull"); // Box 323 cull
		bodyModel[165] = new ModelRendererTurbo(this, 1, 266, textureX, textureY); // Box 128
		bodyModel[166] = new ModelRendererTurbo(this, 313, 286, textureX, textureY); // Box 128
		bodyModel[167] = new ModelRendererTurbo(this, 1, 243, textureX, textureY); // Box 128
		bodyModel[168] = new ModelRendererTurbo(this, 92, 286, textureX, textureY); // Box 128
		bodyModel[169] = new ModelRendererTurbo(this, 295, 164, textureX, textureY); // Box 361
		bodyModel[170] = new ModelRendererTurbo(this, 295, 170, textureX, textureY); // Box 362
		bodyModel[171] = new ModelRendererTurbo(this, 297, 167, textureX, textureY); // Box 363
		bodyModel[172] = new ModelRendererTurbo(this, 295, 176, textureX, textureY); // Box 364
		bodyModel[173] = new ModelRendererTurbo(this, 297, 173, textureX, textureY); // Box 365
		bodyModel[174] = new ModelRendererTurbo(this, 31, 148, textureX, textureY); // Box 2
		bodyModel[175] = new ModelRendererTurbo(this, 31, 142, textureX, textureY); // Box 2
		bodyModel[176] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 2
		bodyModel[177] = new ModelRendererTurbo(this, 31, 136, textureX, textureY); // Box 2
		bodyModel[178] = new ModelRendererTurbo(this, 33, 139, textureX, textureY); // Box 2
		bodyModel[179] = new ModelRendererTurbo(this, 31, 164, textureX, textureY); // Box 361
		bodyModel[180] = new ModelRendererTurbo(this, 31, 170, textureX, textureY); // Box 362
		bodyModel[181] = new ModelRendererTurbo(this, 33, 167, textureX, textureY); // Box 363
		bodyModel[182] = new ModelRendererTurbo(this, 31, 176, textureX, textureY); // Box 364
		bodyModel[183] = new ModelRendererTurbo(this, 33, 173, textureX, textureY); // Box 365
		bodyModel[184] = new ModelRendererTurbo(this, 30, 303, textureX, textureY); // Box 380
		bodyModel[185] = new ModelRendererTurbo(this, 33, 308, textureX, textureY); // Box 382
		bodyModel[186] = new ModelRendererTurbo(this, 335, 289, textureX, textureY); // Box 380
		bodyModel[187] = new ModelRendererTurbo(this, 340, 296, textureX, textureY); // Box 382
		bodyModel[188] = new ModelRendererTurbo(this, 32, 316, textureX, textureY); // Box 38
		bodyModel[189] = new ModelRendererTurbo(this, 33, 320, textureX, textureY); // Box 38
		bodyModel[190] = new ModelRendererTurbo(this, 328, 286, textureX, textureY); // Box 128
		bodyModel[191] = new ModelRendererTurbo(this, 163, 145, textureX, textureY); // Box 41
		bodyModel[192] = new ModelRendererTurbo(this, 181, 145, textureX, textureY); // Box 41
		bodyModel[193] = new ModelRendererTurbo(this, 70, 312, textureX, textureY); // Box 38
		bodyModel[194] = new ModelRendererTurbo(this, 59, 328, textureX, textureY); // Box 38
		bodyModel[195] = new ModelRendererTurbo(this, 59, 334, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[196] = new ModelRendererTurbo(this, 63, 320, textureX, textureY); // Box 38
		bodyModel[197] = new ModelRendererTurbo(this, 76, 328, textureX, textureY); // Box 38
		bodyModel[198] = new ModelRendererTurbo(this, 76, 334, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[199] = new ModelRendererTurbo(this, 80, 320, textureX, textureY); // Box 38
		bodyModel[200] = new ModelRendererTurbo(this, 75, 319, textureX, textureY); // Box 38
		bodyModel[201] = new ModelRendererTurbo(this, 75, 312, textureX, textureY); // Box 38
		bodyModel[202] = new ModelRendererTurbo(this, 73, 315, textureX, textureY); // Box 38
		bodyModel[203] = new ModelRendererTurbo(this, 86, 301, textureX, textureY); // Box 38
		bodyModel[204] = new ModelRendererTurbo(this, 86, 308, textureX, textureY); // Box 38
		bodyModel[205] = new ModelRendererTurbo(this, 86, 315, textureX, textureY); // Box 38
		bodyModel[206] = new ModelRendererTurbo(this, 65, 298, textureX, textureY); // Box 38
		bodyModel[207] = new ModelRendererTurbo(this, 65, 304, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[208] = new ModelRendererTurbo(this, 69, 290, textureX, textureY); // Box 38
		bodyModel[209] = new ModelRendererTurbo(this, 40, 324, textureX, textureY); // Box 492
		bodyModel[210] = new ModelRendererTurbo(this, 43, 317, textureX, textureY); // Box 493
		bodyModel[211] = new ModelRendererTurbo(this, 41, 298, textureX, textureY,"cull"); // Box 498 cull
		bodyModel[212] = new ModelRendererTurbo(this, 39, 330, textureX, textureY); // Box 492
		bodyModel[213] = new ModelRendererTurbo(this, 39, 312, textureX, textureY,"cull"); // Box 498 cull
		bodyModel[214] = new ModelRendererTurbo(this, 39, 337, textureX, textureY,"cull"); // Box 498 cull
		bodyModel[215] = new ModelRendererTurbo(this, 41, 284, textureX, textureY,"cull"); // Box 498 cull
		bodyModel[216] = new ModelRendererTurbo(this, 82, 237, textureX, textureY); // Box 38
		bodyModel[217] = new ModelRendererTurbo(this, 84, 230, textureX, textureY); // Box 38
		bodyModel[218] = new ModelRendererTurbo(this, 87, 234, textureX, textureY); // Box 38
		bodyModel[219] = new ModelRendererTurbo(this, 82, 250, textureX, textureY); // Box 425
		bodyModel[220] = new ModelRendererTurbo(this, 84, 243, textureX, textureY); // Box 426
		bodyModel[221] = new ModelRendererTurbo(this, 87, 247, textureX, textureY); // Box 427
		bodyModel[222] = new ModelRendererTurbo(this, 275, 286, textureX, textureY); // Right seat part
		bodyModel[223] = new ModelRendererTurbo(this, 285, 276, textureX, textureY); // Right seat part
		bodyModel[224] = new ModelRendererTurbo(this, 268, 297, textureX, textureY); // Boc 42
		bodyModel[225] = new ModelRendererTurbo(this, 272, 281, textureX, textureY); // Right seat part
		bodyModel[226] = new ModelRendererTurbo(this, 283, 299, textureX, textureY); // Right seat part
		bodyModel[227] = new ModelRendererTurbo(this, 272, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[228] = new ModelRendererTurbo(this, 283, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[229] = new ModelRendererTurbo(this, 247, 286, textureX, textureY); // Right seat part
		bodyModel[230] = new ModelRendererTurbo(this, 257, 276, textureX, textureY); // Right seat part
		bodyModel[231] = new ModelRendererTurbo(this, 247, 321, textureX, textureY); // Left seat part
		bodyModel[232] = new ModelRendererTurbo(this, 257, 311, textureX, textureY); // Left seat part
		bodyModel[233] = new ModelRendererTurbo(this, 240, 297, textureX, textureY); // Boc 42
		bodyModel[234] = new ModelRendererTurbo(this, 240, 332, textureX, textureY); // Box 638
		bodyModel[235] = new ModelRendererTurbo(this, 244, 281, textureX, textureY); // Right seat part
		bodyModel[236] = new ModelRendererTurbo(this, 255, 299, textureX, textureY); // Right seat part
		bodyModel[237] = new ModelRendererTurbo(this, 255, 334, textureX, textureY); // Left seat part
		bodyModel[238] = new ModelRendererTurbo(this, 244, 316, textureX, textureY); // Left seat part
		bodyModel[239] = new ModelRendererTurbo(this, 244, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[240] = new ModelRendererTurbo(this, 255, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[241] = new ModelRendererTurbo(this, 255, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[242] = new ModelRendererTurbo(this, 244, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[243] = new ModelRendererTurbo(this, 219, 286, textureX, textureY); // Right seat part
		bodyModel[244] = new ModelRendererTurbo(this, 229, 276, textureX, textureY); // Right seat part
		bodyModel[245] = new ModelRendererTurbo(this, 219, 321, textureX, textureY); // Left seat part
		bodyModel[246] = new ModelRendererTurbo(this, 229, 311, textureX, textureY); // Left seat part
		bodyModel[247] = new ModelRendererTurbo(this, 212, 297, textureX, textureY); // Boc 42
		bodyModel[248] = new ModelRendererTurbo(this, 212, 332, textureX, textureY); // Box 638
		bodyModel[249] = new ModelRendererTurbo(this, 216, 281, textureX, textureY); // Right seat part
		bodyModel[250] = new ModelRendererTurbo(this, 227, 299, textureX, textureY); // Right seat part
		bodyModel[251] = new ModelRendererTurbo(this, 227, 334, textureX, textureY); // Left seat part
		bodyModel[252] = new ModelRendererTurbo(this, 216, 316, textureX, textureY); // Left seat part
		bodyModel[253] = new ModelRendererTurbo(this, 216, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[254] = new ModelRendererTurbo(this, 227, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[255] = new ModelRendererTurbo(this, 227, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[256] = new ModelRendererTurbo(this, 216, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[257] = new ModelRendererTurbo(this, 191, 286, textureX, textureY); // Right seat part
		bodyModel[258] = new ModelRendererTurbo(this, 201, 276, textureX, textureY); // Right seat part
		bodyModel[259] = new ModelRendererTurbo(this, 191, 321, textureX, textureY); // Left seat part
		bodyModel[260] = new ModelRendererTurbo(this, 201, 311, textureX, textureY); // Left seat part
		bodyModel[261] = new ModelRendererTurbo(this, 184, 297, textureX, textureY); // Boc 42
		bodyModel[262] = new ModelRendererTurbo(this, 184, 332, textureX, textureY); // Box 638
		bodyModel[263] = new ModelRendererTurbo(this, 188, 281, textureX, textureY); // Right seat part
		bodyModel[264] = new ModelRendererTurbo(this, 199, 299, textureX, textureY); // Right seat part
		bodyModel[265] = new ModelRendererTurbo(this, 199, 334, textureX, textureY); // Left seat part
		bodyModel[266] = new ModelRendererTurbo(this, 188, 316, textureX, textureY); // Left seat part
		bodyModel[267] = new ModelRendererTurbo(this, 188, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[268] = new ModelRendererTurbo(this, 199, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[269] = new ModelRendererTurbo(this, 199, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[270] = new ModelRendererTurbo(this, 188, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[271] = new ModelRendererTurbo(this, 163, 286, textureX, textureY); // Right seat part
		bodyModel[272] = new ModelRendererTurbo(this, 173, 276, textureX, textureY); // Right seat part
		bodyModel[273] = new ModelRendererTurbo(this, 163, 321, textureX, textureY); // Left seat part
		bodyModel[274] = new ModelRendererTurbo(this, 173, 311, textureX, textureY); // Left seat part
		bodyModel[275] = new ModelRendererTurbo(this, 156, 297, textureX, textureY); // Boc 42
		bodyModel[276] = new ModelRendererTurbo(this, 156, 332, textureX, textureY); // Box 638
		bodyModel[277] = new ModelRendererTurbo(this, 160, 281, textureX, textureY); // Right seat part
		bodyModel[278] = new ModelRendererTurbo(this, 171, 299, textureX, textureY); // Right seat part
		bodyModel[279] = new ModelRendererTurbo(this, 171, 334, textureX, textureY); // Left seat part
		bodyModel[280] = new ModelRendererTurbo(this, 160, 316, textureX, textureY); // Left seat part
		bodyModel[281] = new ModelRendererTurbo(this, 160, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[282] = new ModelRendererTurbo(this, 171, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[283] = new ModelRendererTurbo(this, 171, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[284] = new ModelRendererTurbo(this, 160, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[285] = new ModelRendererTurbo(this, 135, 286, textureX, textureY); // Right seat part
		bodyModel[286] = new ModelRendererTurbo(this, 145, 276, textureX, textureY); // Right seat part
		bodyModel[287] = new ModelRendererTurbo(this, 135, 321, textureX, textureY); // Left seat part test
		bodyModel[288] = new ModelRendererTurbo(this, 145, 311, textureX, textureY); // Left seat part test
		bodyModel[289] = new ModelRendererTurbo(this, 128, 297, textureX, textureY); // Boc 42
		bodyModel[290] = new ModelRendererTurbo(this, 128, 332, textureX, textureY); // Box 638
		bodyModel[291] = new ModelRendererTurbo(this, 132, 281, textureX, textureY); // Right seat part
		bodyModel[292] = new ModelRendererTurbo(this, 143, 299, textureX, textureY); // Right seat part
		bodyModel[293] = new ModelRendererTurbo(this, 143, 334, textureX, textureY); // Left seat part test
		bodyModel[294] = new ModelRendererTurbo(this, 132, 316, textureX, textureY); // Left seat part test
		bodyModel[295] = new ModelRendererTurbo(this, 132, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[296] = new ModelRendererTurbo(this, 143, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[297] = new ModelRendererTurbo(this, 143, 328, textureX, textureY,"cull"); // Left seat part cull test
		bodyModel[298] = new ModelRendererTurbo(this, 132, 310, textureX, textureY,"cull"); // Left seat part cull test
		bodyModel[299] = new ModelRendererTurbo(this, 275, 321, textureX, textureY); // Left seat part
		bodyModel[300] = new ModelRendererTurbo(this, 285, 311, textureX, textureY); // Left seat part
		bodyModel[301] = new ModelRendererTurbo(this, 268, 332, textureX, textureY); // Box 638
		bodyModel[302] = new ModelRendererTurbo(this, 283, 334, textureX, textureY); // Left seat part
		bodyModel[303] = new ModelRendererTurbo(this, 272, 316, textureX, textureY); // Left seat part
		bodyModel[304] = new ModelRendererTurbo(this, 283, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[305] = new ModelRendererTurbo(this, 272, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[306] = new ModelRendererTurbo(this, 120, 304, textureX, textureY); // Box 128
		bodyModel[307] = new ModelRendererTurbo(this, 142, 210, textureX, textureY); // Box 11
		bodyModel[308] = new ModelRendererTurbo(this, 128, 215, textureX, textureY); // Box 11
		bodyModel[309] = new ModelRendererTurbo(this, 130, 220, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[310] = new ModelRendererTurbo(this, 118, 267, textureX, textureY); // Box 38
		bodyModel[311] = new ModelRendererTurbo(this, 118, 258, textureX, textureY); // Box 462
		bodyModel[312] = new ModelRendererTurbo(this, 380, 22, textureX, textureY); // Box 60
		bodyModel[313] = new ModelRendererTurbo(this, 121, 286, textureX, textureY); // Box 128
		bodyModel[314] = new ModelRendererTurbo(this, 116, 286, textureX, textureY); // Box 128
		bodyModel[315] = new ModelRendererTurbo(this, 74, 8, textureX, textureY); // Box 128
		bodyModel[316] = new ModelRendererTurbo(this, 74, 18, textureX, textureY); // Box 128
		bodyModel[317] = new ModelRendererTurbo(this, 74, 1, textureX, textureY); // Box 168
		bodyModel[318] = new ModelRendererTurbo(this, 76, 33, textureX, textureY); // Box 128
		bodyModel[319] = new ModelRendererTurbo(this, 72, 65, textureX, textureY); // Box 128
		bodyModel[320] = new ModelRendererTurbo(this, 76, 26, textureX, textureY); // Box 419
		bodyModel[321] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[322] = new ModelRendererTurbo(this, 107, 60, textureX, textureY); // Box 128
		bodyModel[323] = new ModelRendererTurbo(this, 107, 56, textureX, textureY); // Box 128
		bodyModel[324] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 423
		bodyModel[325] = new ModelRendererTurbo(this, 332, 4, textureX, textureY); // Box 424
		bodyModel[326] = new ModelRendererTurbo(this, 332, 9, textureX, textureY); // Box 425
		bodyModel[327] = new ModelRendererTurbo(this, 89, 260, textureX, textureY); // Box 128
		bodyModel[328] = new ModelRendererTurbo(this, 303, 192, textureX, textureY); // Box 128
		bodyModel[329] = new ModelRendererTurbo(this, 20, 262, textureX, textureY); // Box 128
		bodyModel[330] = new ModelRendererTurbo(this, 27, 216, textureX, textureY); // Box 128
		bodyModel[331] = new ModelRendererTurbo(this, 321, 159, textureX, textureY); // Box 128
		bodyModel[332] = new ModelRendererTurbo(this, 307, 168, textureX, textureY); // Box 128
		bodyModel[333] = new ModelRendererTurbo(this, 323, 188, textureX, textureY); // Box 128
		bodyModel[334] = new ModelRendererTurbo(this, 323, 164, textureX, textureY); // Box 433
		bodyModel[335] = new ModelRendererTurbo(this, 321, 154, textureX, textureY); // Box 434
		bodyModel[336] = new ModelRendererTurbo(this, 20, 238, textureX, textureY); // Box 128
		bodyModel[337] = new ModelRendererTurbo(this, 31, 258, textureX, textureY); // Box 128
		bodyModel[338] = new ModelRendererTurbo(this, 24, 234, textureX, textureY); // Box 433
		bodyModel[339] = new ModelRendererTurbo(this, 80, 257, textureX, textureY); // Box 128
		bodyModel[340] = new ModelRendererTurbo(this, 89, 259, textureX, textureY); // Box 128
		bodyModel[341] = new ModelRendererTurbo(this, 73, 233, textureX, textureY); // Box 440
		bodyModel[342] = new ModelRendererTurbo(this, 82, 235, textureX, textureY); // Box 441
		bodyModel[343] = new ModelRendererTurbo(this, 139, 227, textureX, textureY); // Box 11
		bodyModel[344] = new ModelRendererTurbo(this, 139, 224, textureX, textureY); // Box 11
		bodyModel[345] = new ModelRendererTurbo(this, 133, 210, textureX, textureY); // Box 11
		bodyModel[346] = new ModelRendererTurbo(this, 27, 211, textureX, textureY); // Box 445
		bodyModel[347] = new ModelRendererTurbo(this, 40, 52, textureX, textureY); // Box 13
		bodyModel[348] = new ModelRendererTurbo(this, 37, 24, textureX, textureY); // Box 101
		bodyModel[349] = new ModelRendererTurbo(this, 329, 48, textureX, textureY); // Box 13
		bodyModel[350] = new ModelRendererTurbo(this, 332, 30, textureX, textureY); // Box 101
		bodyModel[351] = new ModelRendererTurbo(this, 360, 12, textureX, textureY); // Box 149
		bodyModel[352] = new ModelRendererTurbo(this, 369, 15, textureX, textureY); // Box 150
		bodyModel[353] = new ModelRendererTurbo(this, 337, 15, textureX, textureY); // Box 164
		bodyModel[354] = new ModelRendererTurbo(this, 381, 24, textureX, textureY); // Box 128
		bodyModel[355] = new ModelRendererTurbo(this, 356, 40, textureX, textureY); // Box 11
		bodyModel[356] = new ModelRendererTurbo(this, 367, 40, textureX, textureY); // Box 11
		bodyModel[357] = new ModelRendererTurbo(this, 337, 58, textureX, textureY); // Box 457
		bodyModel[358] = new ModelRendererTurbo(this, 356, 33, textureX, textureY); // Box 11
		bodyModel[359] = new ModelRendererTurbo(this, 367, 34, textureX, textureY); // Box 11
		bodyModel[360] = new ModelRendererTurbo(this, 356, 47, textureX, textureY); // Box 460
		bodyModel[361] = new ModelRendererTurbo(this, 367, 46, textureX, textureY); // Box 461
		bodyModel[362] = new ModelRendererTurbo(this, 360, 69, textureX, textureY); // Box 463
		bodyModel[363] = new ModelRendererTurbo(this, 369, 66, textureX, textureY); // Box 464
		bodyModel[364] = new ModelRendererTurbo(this, 356, 26, textureX, textureY); // Box 166
		bodyModel[365] = new ModelRendererTurbo(this, 354, 18, textureX, textureY); // Box 166
		bodyModel[366] = new ModelRendererTurbo(this, 367, 28, textureX, textureY); // Box 11
		bodyModel[367] = new ModelRendererTurbo(this, 367, 20, textureX, textureY); // Box 11
		bodyModel[368] = new ModelRendererTurbo(this, 356, 54, textureX, textureY); // Box 470
		bodyModel[369] = new ModelRendererTurbo(this, 354, 61, textureX, textureY); // Box 471
		bodyModel[370] = new ModelRendererTurbo(this, 367, 52, textureX, textureY); // Box 472
		bodyModel[371] = new ModelRendererTurbo(this, 367, 58, textureX, textureY); // Box 473
		bodyModel[372] = new ModelRendererTurbo(this, 43, 162, textureX, textureY); // Box 2
		bodyModel[373] = new ModelRendererTurbo(this, 228, 200, textureX, textureY); // Box 2
		bodyModel[374] = new ModelRendererTurbo(this, 228, 165, textureX, textureY); // Box 2
		bodyModel[375] = new ModelRendererTurbo(this, 235, 165, textureX, textureY); // Box 2
		bodyModel[376] = new ModelRendererTurbo(this, 221, 165, textureX, textureY); // Box 2
		bodyModel[377] = new ModelRendererTurbo(this, 207, 165, textureX, textureY); // Box 2
		bodyModel[378] = new ModelRendererTurbo(this, 46, 165, textureX, textureY); // Box 2
		bodyModel[379] = new ModelRendererTurbo(this, 67, 165, textureX, textureY); // Box 2
		bodyModel[380] = new ModelRendererTurbo(this, 53, 165, textureX, textureY); // Box 2
		bodyModel[381] = new ModelRendererTurbo(this, 74, 165, textureX, textureY); // Box 2
		bodyModel[382] = new ModelRendererTurbo(this, 174, 165, textureX, textureY); // Box 2
		bodyModel[383] = new ModelRendererTurbo(this, 228, 172, textureX, textureY); // Box 490
		bodyModel[384] = new ModelRendererTurbo(this, 221, 172, textureX, textureY); // Box 491
		bodyModel[385] = new ModelRendererTurbo(this, 207, 172, textureX, textureY); // Box 492
		bodyModel[386] = new ModelRendererTurbo(this, 46, 172, textureX, textureY); // Box 493
		bodyModel[387] = new ModelRendererTurbo(this, 67, 172, textureX, textureY); // Box 494
		bodyModel[388] = new ModelRendererTurbo(this, 53, 172, textureX, textureY); // Box 495
		bodyModel[389] = new ModelRendererTurbo(this, 172, 172, textureX, textureY); // Box 496
		bodyModel[390] = new ModelRendererTurbo(this, 74, 172, textureX, textureY); // Box 497
		bodyModel[391] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 498
		bodyModel[392] = new ModelRendererTurbo(this, 235, 172, textureX, textureY); // Box 499
		bodyModel[393] = new ModelRendererTurbo(this, 43, 165, textureX, textureY); // Box 2
		bodyModel[394] = new ModelRendererTurbo(this, 43, 171, textureX, textureY); // Box 499
		bodyModel[395] = new ModelRendererTurbo(this, 74, 200, textureX, textureY); // Box 2
		bodyModel[396] = new ModelRendererTurbo(this, 174, 200, textureX, textureY); // Box 2
		bodyModel[397] = new ModelRendererTurbo(this, 149, 200, textureX, textureY); // Box 2
		bodyModel[398] = new ModelRendererTurbo(this, 221, 200, textureX, textureY); // Box 2
		bodyModel[399] = new ModelRendererTurbo(this, 207, 200, textureX, textureY); // Box 2
		bodyModel[400] = new ModelRendererTurbo(this, 46, 200, textureX, textureY); // Box 2
		bodyModel[401] = new ModelRendererTurbo(this, 67, 200, textureX, textureY); // Box 2
		bodyModel[402] = new ModelRendererTurbo(this, 53, 200, textureX, textureY); // Box 2
		bodyModel[403] = new ModelRendererTurbo(this, 228, 204, textureX, textureY); // Box 510
		bodyModel[404] = new ModelRendererTurbo(this, 172, 204, textureX, textureY); // Box 511
		bodyModel[405] = new ModelRendererTurbo(this, 74, 204, textureX, textureY); // Box 512
		bodyModel[406] = new ModelRendererTurbo(this, 137, 204, textureX, textureY); // Box 513
		bodyModel[407] = new ModelRendererTurbo(this, 221, 204, textureX, textureY); // Box 514
		bodyModel[408] = new ModelRendererTurbo(this, 207, 204, textureX, textureY); // Box 515
		bodyModel[409] = new ModelRendererTurbo(this, 46, 204, textureX, textureY); // Box 516
		bodyModel[410] = new ModelRendererTurbo(this, 67, 204, textureX, textureY); // Box 517
		bodyModel[411] = new ModelRendererTurbo(this, 53, 204, textureX, textureY); // Box 518
		bodyModel[412] = new ModelRendererTurbo(this, 149, 165, textureX, textureY); // Box 2
		bodyModel[413] = new ModelRendererTurbo(this, 137, 172, textureX, textureY); // Box 520
		bodyModel[414] = new ModelRendererTurbo(this, 398, 20, textureX, textureY); // Box 101
		bodyModel[415] = new ModelRendererTurbo(this, 396, 14, textureX, textureY); // Box 101
		bodyModel[416] = new ModelRendererTurbo(this, 398, 44, textureX, textureY); // Box 469
		bodyModel[417] = new ModelRendererTurbo(this, 396, 48, textureX, textureY); // Box 470
		bodyModel[418] = new ModelRendererTurbo(this, 12, 22, textureX, textureY); // Box 101
		bodyModel[419] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 101
		bodyModel[420] = new ModelRendererTurbo(this, 12, 34, textureX, textureY); // Box 469
		bodyModel[421] = new ModelRendererTurbo(this, 1, 20, textureX, textureY); // Box 470
		bodyModel[422] = new ModelRendererTurbo(this, 13, 174, textureX, textureY); // Box 149
		bodyModel[423] = new ModelRendererTurbo(this, 6, 178, textureX, textureY); // Box 150
		bodyModel[424] = new ModelRendererTurbo(this, 28, 179, textureX, textureY); // Box 164
		bodyModel[425] = new ModelRendererTurbo(this, 28, 221, textureX, textureY); // Box 457
		bodyModel[426] = new ModelRendererTurbo(this, 12, 232, textureX, textureY); // Box 463
		bodyModel[427] = new ModelRendererTurbo(this, 6, 229, textureX, textureY); // Box 464
		bodyModel[428] = new ModelRendererTurbo(this, 14, 32, textureX, textureY); // Box 128
		bodyModel[429] = new ModelRendererTurbo(this, 16, 203, textureX, textureY); // Box 11
		bodyModel[430] = new ModelRendererTurbo(this, 7, 203, textureX, textureY); // Box 11
		bodyModel[431] = new ModelRendererTurbo(this, 16, 196, textureX, textureY); // Box 11
		bodyModel[432] = new ModelRendererTurbo(this, 7, 197, textureX, textureY); // Box 11
		bodyModel[433] = new ModelRendererTurbo(this, 16, 210, textureX, textureY); // Box 460
		bodyModel[434] = new ModelRendererTurbo(this, 7, 209, textureX, textureY); // Box 461
		bodyModel[435] = new ModelRendererTurbo(this, 16, 189, textureX, textureY); // Box 166
		bodyModel[436] = new ModelRendererTurbo(this, 15, 181, textureX, textureY); // Box 166
		bodyModel[437] = new ModelRendererTurbo(this, 7, 191, textureX, textureY); // Box 11
		bodyModel[438] = new ModelRendererTurbo(this, 2, 183, textureX, textureY); // Box 11
		bodyModel[439] = new ModelRendererTurbo(this, 16, 217, textureX, textureY); // Box 470
		bodyModel[440] = new ModelRendererTurbo(this, 15, 224, textureX, textureY); // Box 471
		bodyModel[441] = new ModelRendererTurbo(this, 7, 215, textureX, textureY); // Box 472
		bodyModel[442] = new ModelRendererTurbo(this, 2, 221, textureX, textureY); // Box 473
		bodyModel[443] = new ModelRendererTurbo(this, 1, 373, textureX, textureY); // Box 38
		bodyModel[444] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 128
		bodyModel[445] = new ModelRendererTurbo(this, 325, 35, textureX, textureY); // Box 153
		bodyModel[446] = new ModelRendererTurbo(this, 16, 35, textureX, textureY); // Box 128
		bodyModel[447] = new ModelRendererTurbo(this, 45, 16, textureX, textureY); // Box 128
		bodyModel[448] = new ModelRendererTurbo(this, 45, 12, textureX, textureY); // Box 128
		bodyModel[449] = new ModelRendererTurbo(this, 45, 4, textureX, textureY); // Box 504
		bodyModel[450] = new ModelRendererTurbo(this, 45, 8, textureX, textureY); // Box 505
		bodyModel[451] = new ModelRendererTurbo(this, 1, 343, textureX, textureY); // Box 128
		bodyModel[452] = new ModelRendererTurbo(this, 1, 358, textureX, textureY); // Box 507
		bodyModel[453] = new ModelRendererTurbo(this, 350, 287, textureX, textureY); // Box 38
		bodyModel[454] = new ModelRendererTurbo(this, 353, 292, textureX, textureY); // Box 38
		bodyModel[455] = new ModelRendererTurbo(this, 352, 295, textureX, textureY); // Box 38
		bodyModel[456] = new ModelRendererTurbo(this, 19, 333, textureX, textureY); // Box 349
		bodyModel[457] = new ModelRendererTurbo(this, 17, 325, textureX, textureY); // Box 350
		bodyModel[458] = new ModelRendererTurbo(this, 20, 330, textureX, textureY); // Box 351
		bodyModel[459] = new ModelRendererTurbo(this, 94, 304, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[460] = new ModelRendererTurbo(this, 32, 331, textureX, textureY); // Box 380
		bodyModel[461] = new ModelRendererTurbo(this, 33, 334, textureX, textureY); // Box 382
		bodyModel[462] = new ModelRendererTurbo(this, 30, 328, textureX, textureY); // Box 380
		bodyModel[463] = new ModelRendererTurbo(this, 35, 328, textureX, textureY); // Box 380
		bodyModel[464] = new ModelRendererTurbo(this, 118, 265, textureX, textureY); // Box 38
		bodyModel[465] = new ModelRendererTurbo(this, 118, 256, textureX, textureY); // Box 521
		bodyModel[466] = new ModelRendererTurbo(this, 154, 215, textureX, textureY); // Box 11
		bodyModel[467] = new ModelRendererTurbo(this, 156, 220, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[468] = new ModelRendererTurbo(this, 141, 215, textureX, textureY); // Box 11
		bodyModel[469] = new ModelRendererTurbo(this, 143, 220, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[470] = new ModelRendererTurbo(this, 167, 215, textureX, textureY); // Box 11
		bodyModel[471] = new ModelRendererTurbo(this, 169, 220, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[472] = new ModelRendererTurbo(this, 180, 215, textureX, textureY); // Box 11
		bodyModel[473] = new ModelRendererTurbo(this, 182, 220, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[474] = new ModelRendererTurbo(this, 206, 215, textureX, textureY); // Box 11
		bodyModel[475] = new ModelRendererTurbo(this, 208, 220, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[476] = new ModelRendererTurbo(this, 193, 215, textureX, textureY); // Box 11
		bodyModel[477] = new ModelRendererTurbo(this, 195, 220, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[478] = new ModelRendererTurbo(this, 219, 215, textureX, textureY); // Box 11
		bodyModel[479] = new ModelRendererTurbo(this, 221, 220, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[480] = new ModelRendererTurbo(this, 232, 215, textureX, textureY); // Box 11
		bodyModel[481] = new ModelRendererTurbo(this, 234, 220, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[482] = new ModelRendererTurbo(this, 258, 215, textureX, textureY); // Box 11
		bodyModel[483] = new ModelRendererTurbo(this, 260, 220, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[484] = new ModelRendererTurbo(this, 245, 215, textureX, textureY); // Box 11
		bodyModel[485] = new ModelRendererTurbo(this, 247, 220, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[486] = new ModelRendererTurbo(this, 271, 215, textureX, textureY); // Box 11
		bodyModel[487] = new ModelRendererTurbo(this, 273, 220, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[488] = new ModelRendererTurbo(this, 284, 215, textureX, textureY); // Box 11
		bodyModel[489] = new ModelRendererTurbo(this, 286, 220, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[490] = new ModelRendererTurbo(this, 184, 146, textureX, textureY); // Box 341
		bodyModel[491] = new ModelRendererTurbo(this, 186, 147, textureX, textureY); // Box 341
		bodyModel[492] = new ModelRendererTurbo(this, 194, 147, textureX, textureY); // Box 341
		bodyModel[493] = new ModelRendererTurbo(this, 185, 304, textureX, textureY); // Seat part
		bodyModel[494] = new ModelRendererTurbo(this, 185, 286, textureX, textureY); // Seat part
		bodyModel[495] = new ModelRendererTurbo(this, 185, 293, textureX, textureY); // Seat part
		bodyModel[496] = new ModelRendererTurbo(this, 192, 304, textureX, textureY); // Seat part
		bodyModel[497] = new ModelRendererTurbo(this, 185, 321, textureX, textureY); // Seat part
		bodyModel[498] = new ModelRendererTurbo(this, 185, 339, textureX, textureY); // Seat part
		bodyModel[499] = new ModelRendererTurbo(this, 192, 339, textureX, textureY); // Seat part

		bodyModel[0].addBox(0F, 0F, 0F, 96, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-48F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[1].setRotationPoint(53F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[2].setRotationPoint(-56F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[3].setRotationPoint(-52F, 1F, -5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 67, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[4].setRotationPoint(-27F, -17F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 67, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[5].setRotationPoint(-27F, -17F, 5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[6].setRotationPoint(53.5F, -15F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[7].setRotationPoint(53.5F, 1F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[8].setRotationPoint(53.5F, -14F, 3F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[9].setRotationPoint(55F, -14F, -5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[10].setRotationPoint(55F, -14F, 3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[11].setRotationPoint(55F, 1F, -5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[12].setRotationPoint(55F, -15F, -5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 128
		bodyModel[13].setRotationPoint(55F, -16.5F, -5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 153
		bodyModel[14].setRotationPoint(55F, -16.5F, 1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[15].setRotationPoint(53.5F, -14F, -4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[16].setRotationPoint(53F, -14F, 3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[17].setRotationPoint(53F, -15F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 100
		bodyModel[18].setRotationPoint(53F, -15F, 5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[19].setRotationPoint(53F, 1F, 5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[20].setRotationPoint(53F, -14F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[21].setRotationPoint(-55.5F, -15F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[22].setRotationPoint(-55.5F, 1F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[23].setRotationPoint(-56F, -14F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[24].setRotationPoint(-56F, -14F, 3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[25].setRotationPoint(-56F, 1F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[26].setRotationPoint(-56F, -15F, -5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 128
		bodyModel[27].setRotationPoint(-56F, -16.5F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 153
		bodyModel[28].setRotationPoint(-56F, -16.5F, 1.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[29].setRotationPoint(-55.5F, -14F, -4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[30].setRotationPoint(-54F, -14F, 3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[31].setRotationPoint(-54F, -15F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0.07F, 0F, 0F, 0.07F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[32].setRotationPoint(-54F, -16F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 60
		bodyModel[33].setRotationPoint(-54F, -16.5F, -3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 100
		bodyModel[34].setRotationPoint(-54F, -15F, 5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[35].setRotationPoint(-54F, 1F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 100
		bodyModel[36].setRotationPoint(-54F, 1F, 5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 60
		bodyModel[37].setRotationPoint(-54F, -15.5F, 3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 129
		bodyModel[38].setRotationPoint(-54F, -15.5F, -5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.43F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[39].setRotationPoint(-54F, -16.5F, -5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[40].setRotationPoint(-55.5F, -14F, 3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0.07F, 0F, 0F, 0.07F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 101
		bodyModel[41].setRotationPoint(-54F, -16F, 5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[42].setRotationPoint(-54F, -16.5F, 3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[43].setRotationPoint(-54F, -14F, -5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[44].setRotationPoint(53F, 1F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 2
		bodyModel[45].setRotationPoint(-54F, 1F, -5F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[46].setRotationPoint(-53F, 1F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[47].setRotationPoint(48F, 1F, -5F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 2
		bodyModel[48].setRotationPoint(53F, 1F, -5F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[49].setRotationPoint(52F, 1F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[50].setRotationPoint(47F, -15F, -10F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[51].setRotationPoint(47F, -15F, 3F);

		bodyModel[52].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear vestibule door
		bodyModel[52].setRotationPoint(47F, -14F, 3F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[53].setRotationPoint(47F, -15F, -3F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[54].setRotationPoint(-48F, -15F, -10F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[55].setRotationPoint(-48F, -15F, 3F);

		bodyModel[56].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front vestibule door
		bodyModel[56].setRotationPoint(-48F, -14F, 3F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[57].setRotationPoint(-48F, -15F, -3F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 128
		bodyModel[58].setRotationPoint(-52F, -15F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 128
		bodyModel[59].setRotationPoint(-52F, -15F, 10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.835F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.835F, 0F, 0F); // Box 128
		bodyModel[60].setRotationPoint(-53F, -15F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.835F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.835F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 121
		bodyModel[61].setRotationPoint(-53F, -15F, 10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[62].setRotationPoint(-53F, -16.5F, -3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 130
		bodyModel[63].setRotationPoint(-53F, -15.5F, -5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, 0.07F, 0F, 0F, 0.07F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[64].setRotationPoint(53F, -16F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0.07F, 0F, 0F, 0.07F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[65].setRotationPoint(53F, -16F, 5F);

		bodyModel[66].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 128
		bodyModel[66].setRotationPoint(48F, -15F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 128
		bodyModel[67].setRotationPoint(48F, -15F, 10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.835F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.835F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[68].setRotationPoint(52F, -15F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -0.835F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.835F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[69].setRotationPoint(52F, -15F, 10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 60
		bodyModel[70].setRotationPoint(53F, -16.5F, -3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 60
		bodyModel[71].setRotationPoint(53F, -15.5F, 3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 129
		bodyModel[72].setRotationPoint(53F, -15.5F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.43F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[73].setRotationPoint(52F, -16.5F, -5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[74].setRotationPoint(52F, -16.5F, 3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 130
		bodyModel[75].setRotationPoint(52F, -15.5F, -5F);

		bodyModel[76].addBox(0F, 0F, 0F, 96, 16, 1, 0F); // Box 38
		bodyModel[76].setRotationPoint(-48F, -15F, -11F);

		bodyModel[77].addBox(0F, 0F, 0F, 96, 16, 1, 0F); // Box 128
		bodyModel[77].setRotationPoint(-48F, -15F, 10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 7, 16, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[78].setRotationPoint(40F, -15F, -10F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[79].setRotationPoint(40F, -15F, 3F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 16, 14, 0F); // Box 128
		bodyModel[80].setRotationPoint(-28.5F, -15F, -10F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 128
		bodyModel[81].setRotationPoint(-41F, -15F, -10F);

		bodyModel[82].addBox(-4F, 0F, 0F, 4, 0, 5, 0F); // Front left trapdoor
		bodyModel[82].setRotationPoint(-48F, 1F, -10F);

		bodyModel[83].addBox(-4F, 0F, 0F, 4, 0, 5, 0F); // Front right trapdoor
		bodyModel[83].setRotationPoint(-48F, 1F, 5F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 0, 5, 0F); // Rear left trapdoor
		bodyModel[84].setRotationPoint(48F, 1F, -10F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 0, 5, 0F); // Rear right trapdoor
		bodyModel[85].setRotationPoint(48F, 1F, 5F);

		bodyModel[86].addShapeBox(0F, 0F, -1F, 5, 16, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Left rear door
		bodyModel[86].setRotationPoint(48F, -13F, -10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Right rear door
		bodyModel[87].setRotationPoint(48F, -13F, 10F);

		bodyModel[88].addShapeBox(-4F, 0F, -1F, 5, 16, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Left front door
		bodyModel[88].setRotationPoint(-48F, -13F, -10F);

		bodyModel[89].addShapeBox(-4F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Right front door
		bodyModel[89].setRotationPoint(-48F, -13F, 10F);

		bodyModel[90].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[90].setRotationPoint(49F, 3F, -4F);

		bodyModel[91].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[91].setRotationPoint(-53F, 3F, -4F);

		bodyModel[92].addBox(0F, 0F, 0F, 98, 1, 1, 0F); // Box 2
		bodyModel[92].setRotationPoint(-49F, 3F, -2F);

		bodyModel[93].addBox(0F, 0F, 0F, 98, 1, 1, 0F); // Box 2
		bodyModel[93].setRotationPoint(-49F, 3F, 1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[94].setRotationPoint(37.5F, 4F, -1F);

		bodyModel[95].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 2
		bodyModel[95].setRotationPoint(36.5F, 3F, -1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[96].setRotationPoint(-39.5F, 4F, -1F);

		bodyModel[97].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 2
		bodyModel[97].setRotationPoint(-40.5F, 3F, -1F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 34, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[98].setRotationPoint(-17F, 4F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 2
		bodyModel[99].setRotationPoint(-31F, 4F, -2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[100].setRotationPoint(17F, 4F, -2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 34, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 532
		bodyModel[101].setRotationPoint(-17F, 4F, 1F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 533
		bodyModel[102].setRotationPoint(-31F, 4F, 1F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 534
		bodyModel[103].setRotationPoint(17F, 4F, 1F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[104].setRotationPoint(-17F, 4F, -1F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[105].setRotationPoint(16F, 4F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[106].setRotationPoint(16F, 3F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 540
		bodyModel[107].setRotationPoint(-17F, 3F, 2F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 541
		bodyModel[108].setRotationPoint(16F, 3F, 2F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[109].setRotationPoint(-17F, 3F, -10F);

		bodyModel[110].addBox(0F, 0F, 0F, 16, 5, 5, 0F); // Box 341
		bodyModel[110].setRotationPoint(-1F, 3F, -10.5F);

		bodyModel[111].addBox(0F, 0F, 0F, 14, 2, 5, 0F); // Box 341
		bodyModel[111].setRotationPoint(-16F, 3F, -10.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[112].setRotationPoint(-16F, 5F, -9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 341
		bodyModel[113].setRotationPoint(-16F, 5F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[114].setRotationPoint(-16F, 5F, -11F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 341
		bodyModel[115].setRotationPoint(-24F, 3F, -10.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 341
		bodyModel[116].setRotationPoint(-24F, 4F, -10F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 341
		bodyModel[117].setRotationPoint(-22F, 3F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[118].setRotationPoint(-28F, 2.75F, -9.4F);
		bodyModel[118].rotateAngleX = -0.78539816F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[119].setRotationPoint(-28.01F, 3F, -9.9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[120].setRotationPoint(-24.99F, 3F, -9.9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[121].setRotationPoint(26.5F, 4.45F, 5F);
		bodyModel[121].rotateAngleZ = -0.78539816F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341 cull
		bodyModel[122].setRotationPoint(26F, 3F, 6F);

		bodyModel[123].addBox(0F, 0F, 0F, 4, 5, 4, 0F); // Box 341
		bodyModel[123].setRotationPoint(17F, 3F, -9.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, 0F, -0.5F, -0.01F); // Box 341
		bodyModel[124].setRotationPoint(19F, 5.87F, -9.5F);
		bodyModel[124].rotateAngleZ = -0.78539816F;

		bodyModel[125].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 341
		bodyModel[125].setRotationPoint(22F, 3F, -10.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 341
		bodyModel[126].setRotationPoint(24F, 3F, -10.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 11, 4, 5, 0F); // Box 341
		bodyModel[127].setRotationPoint(-16F, 3F, 5.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[128].setRotationPoint(8F, 2.75F, 6F);
		bodyModel[128].rotateAngleX = -0.78539816F;

		bodyModel[129].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 341
		bodyModel[129].setRotationPoint(1F, 3F, 9.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 341
		bodyModel[130].setRotationPoint(6F, 2.75F, 9.4F);
		bodyModel[130].rotateAngleX = -0.78539816F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 341 cull
		bodyModel[131].setRotationPoint(7F, 3F, 8.9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[132].setRotationPoint(48F, -5F, -12F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[133].setRotationPoint(52F, -5F, -12F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[134].setRotationPoint(48F, -5F, 11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[135].setRotationPoint(52F, -5F, 11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[136].setRotationPoint(-52F, -5F, -12F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[137].setRotationPoint(-48F, -5F, -12F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[138].setRotationPoint(-52F, -5F, 11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[139].setRotationPoint(-48F, -5F, 11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[140].setRotationPoint(53.5F, -7F, -3F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[141].setRotationPoint(53.5F, -7F, -3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate closed
		bodyModel[142].setRotationPoint(-53.5F, -7F, -3F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate open
		bodyModel[143].setRotationPoint(-53.5F, -7F, 2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128 cull
		bodyModel[144].setRotationPoint(48F, 3F, 5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 cull
		bodyModel[145].setRotationPoint(48F, 5F, 9.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 cull
		bodyModel[146].setRotationPoint(48F, 3F, 9.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 cull
		bodyModel[147].setRotationPoint(48F, 3F, 8.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		bodyModel[148].setRotationPoint(48F, 2.75F, 5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 2
		bodyModel[149].setRotationPoint(48F, 4.5F, 6.75F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 2
		bodyModel[150].setRotationPoint(48F, 2.75F, 6.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		bodyModel[151].setRotationPoint(48F, 6F, 8.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[152].setRotationPoint(48F, 4.5F, 8.75F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 323 cull
		bodyModel[153].setRotationPoint(48F, 3F, -9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323 cull
		bodyModel[154].setRotationPoint(48F, 5F, -10.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323 cull
		bodyModel[155].setRotationPoint(48F, 3F, -10.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323 cull
		bodyModel[156].setRotationPoint(48F, 3F, -9.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128 cull
		bodyModel[157].setRotationPoint(-52F, 3F, 5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 cull
		bodyModel[158].setRotationPoint(-52F, 5F, 9.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 cull
		bodyModel[159].setRotationPoint(-52F, 3F, 9.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 cull
		bodyModel[160].setRotationPoint(-52F, 3F, 8.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 323 cull
		bodyModel[161].setRotationPoint(-52F, 3F, -9F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323 cull
		bodyModel[162].setRotationPoint(-52F, 5F, -10.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323 cull
		bodyModel[163].setRotationPoint(-52F, 3F, -10.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323 cull
		bodyModel[164].setRotationPoint(-52F, 3F, -9.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 128
		bodyModel[165].setRotationPoint(-47F, -15F, -4F);

		bodyModel[166].addBox(0F, 0F, 0F, 6, 16, 1, 0F); // Box 128
		bodyModel[166].setRotationPoint(41F, -15F, 3F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[167].setRotationPoint(-47F, -15F, 4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 11, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[168].setRotationPoint(-40F, -15F, 5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[169].setRotationPoint(48F, 2.75F, -7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 362
		bodyModel[170].setRotationPoint(48F, 4.5F, -8.75F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 363
		bodyModel[171].setRotationPoint(48F, 2.75F, -6.75F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[172].setRotationPoint(48F, 6F, -10.75F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 365
		bodyModel[173].setRotationPoint(48F, 4.5F, -8.75F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		bodyModel[174].setRotationPoint(-52F, 2.75F, 5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 2
		bodyModel[175].setRotationPoint(-52F, 4.5F, 6.75F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 2
		bodyModel[176].setRotationPoint(-52F, 2.75F, 6.75F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		bodyModel[177].setRotationPoint(-52F, 6F, 8.75F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[178].setRotationPoint(-52F, 4.5F, 8.75F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[179].setRotationPoint(-52F, 2.75F, -7F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 362
		bodyModel[180].setRotationPoint(-52F, 4.5F, -8.75F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 363
		bodyModel[181].setRotationPoint(-52F, 2.75F, -6.75F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[182].setRotationPoint(-52F, 6F, -10.75F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 365
		bodyModel[183].setRotationPoint(-52F, 4.5F, -8.75F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[184].setRotationPoint(-40F, -6F, 2F);

		bodyModel[185].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[185].setRotationPoint(-39.25F, -5F, 3.5F);
		bodyModel[185].rotateAngleY = -0.78539816F;

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[186].setRotationPoint(41F, -6F, 5F);

		bodyModel[187].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[187].setRotationPoint(41.75F, -5F, 6.5F);
		bodyModel[187].rotateAngleY = -0.78539816F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[188].setRotationPoint(-40F, -6F, -1F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[189].setRotationPoint(-39.45F, -5F, -0.5F);
		bodyModel[189].rotateAngleY = 0.78539816F;

		bodyModel[190].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 128
		bodyModel[190].setRotationPoint(41F, -15F, 4F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[191].setRotationPoint(7.99F, 3F, 5.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[192].setRotationPoint(15.01F, 3F, 5.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 38
		bodyModel[193].setRotationPoint(-29.5F, -6F, -8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[194].setRotationPoint(-31.5F, -3F, -1.75F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[195].setRotationPoint(-31.5F, -2F, -1.75F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[196].setRotationPoint(-31.5F, -6F, -1.75F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[197].setRotationPoint(-31.5F, -3F, -6.25F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[198].setRotationPoint(-31.5F, -2F, -6.25F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[199].setRotationPoint(-31.5F, -6F, -6.25F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F); // Box 38
		bodyModel[200].setRotationPoint(-30F, -6F, -8F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[201].setRotationPoint(-30F, -6F, 1F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[202].setRotationPoint(-30F, -6F, -4F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[203].setRotationPoint(-30F, -11F, 1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[204].setRotationPoint(-30F, -11F, -3.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[205].setRotationPoint(-30F, -11F, -8F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[206].setRotationPoint(-37F, -3F, 2.25F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[207].setRotationPoint(-37F, -2F, 2.25F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[208].setRotationPoint(-35F, -6F, 2.25F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[209].setRotationPoint(-36.75F, -3F, -8F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 493
		bodyModel[210].setRotationPoint(-36.75F, -7F, -9F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -3F, 0F, -0.49F, -3F, 0F, -0.49F, -3F, -3.5F, 0F, -3F, -3.5F); // Box 498 cull
		bodyModel[211].setRotationPoint(-33.25F, -4.5F, -8.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[212].setRotationPoint(-36.75F, -2.5F, -9F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0.01F, 0F, 0F, -3.99F, 0F, 0F, -3.99F, 0F, -0.49F, 0.01F, 0F, -0.49F, 0.01F, -0.51F, 0F, -3.99F, -0.51F, 0F, -3.99F, -0.51F, -0.49F, 0.01F, -0.51F, -0.49F); // Box 498 cull
		bodyModel[213].setRotationPoint(-36.75F, -1.5F, -5.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, -0.51F, 0F, -4F, -0.51F, 0F, -4F, -0.51F, -0.49F, 0F, -0.51F, -0.49F); // Box 498 cull
		bodyModel[214].setRotationPoint(-36.75F, -1.5F, -9F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,-0.49F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.49F, 0F, -3.5F, -0.49F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3.5F, -0.49F, -3F, -3.5F); // Box 498 cull
		bodyModel[215].setRotationPoint(-37.25F, -4.5F, -8.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 125, 0, 5, 0F,0F, 0F, 0F, -62.5F, 0F, 0F, -62.5F, -0.75F, -2.5F, 0F, -0.75F, -2.5F, 0F, 0F, 0F, -62.5F, 0F, 0F, -62.5F, 0.75F, -2.5F, 0F, 0.75F, -2.5F); // Box 38
		bodyModel[216].setRotationPoint(-23.25F, -13.75F, 7.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 125, 0, 3, 0F,0F, 0F, 0F, -62.5F, 0F, 0F, -62.5F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0F, 0F, -62.5F, 0F, 0F, -62.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 38
		bodyModel[217].setRotationPoint(-23.25F, -13.75F, 7.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 125, 2, 0, 0F,0F, 0F, 0F, -62.5F, 0F, 0F, -62.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -62.5F, -0.5F, 0F, -62.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[218].setRotationPoint(-23.25F, -14.5F, 9.99F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 125, 0, 5, 0F,0F, -0.75F, -2.5F, -62.5F, -0.75F, -2.5F, -62.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -2.5F, -62.5F, 0.75F, -2.5F, -62.5F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[219].setRotationPoint(-23.25F, -13.75F, -12.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 125, 0, 3, 0F,0F, 0.75F, -0.5F, -62.5F, 0.75F, -0.5F, -62.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -62.5F, -0.75F, -0.5F, -62.5F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[220].setRotationPoint(-23.25F, -13.75F, -10.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 125, 2, 0, 0F,0F, 0F, 0F, -62.5F, 0F, 0F, -62.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -62.5F, -0.5F, 0F, -62.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 427
		bodyModel[221].setRotationPoint(-23.25F, -14.5F, -9.99F);

		bodyModel[222].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[222].setRotationPoint(34.5F, -3F, 7F);
		bodyModel[222].rotateAngleY = -3.14159265F;

		bodyModel[223].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[223].setRotationPoint(34.5F, -8F, 7F);
		bodyModel[223].rotateAngleY = -3.14159265F;

		bodyModel[224].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[224].setRotationPoint(33F, -1F, 5F);

		bodyModel[225].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[225].setRotationPoint(34.5F, -3F, 7F);
		bodyModel[225].rotateAngleY = -3.14159265F;

		bodyModel[226].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[226].setRotationPoint(34.5F, -3F, 7F);
		bodyModel[226].rotateAngleY = -3.14159265F;

		bodyModel[227].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[227].setRotationPoint(34.5F, -5F, 7F);
		bodyModel[227].rotateAngleY = -3.14159265F;

		bodyModel[228].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[228].setRotationPoint(34.5F, -5F, 7F);
		bodyModel[228].rotateAngleY = -3.14159265F;

		bodyModel[229].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[229].setRotationPoint(24.5F, -3F, 7F);
		bodyModel[229].rotateAngleY = -3.14159265F;

		bodyModel[230].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[230].setRotationPoint(24.5F, -8F, 7F);
		bodyModel[230].rotateAngleY = -3.14159265F;

		bodyModel[231].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[231].setRotationPoint(24.5F, -3F, -7F);
		bodyModel[231].rotateAngleY = -3.14159265F;

		bodyModel[232].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[232].setRotationPoint(24.5F, -8F, -7F);
		bodyModel[232].rotateAngleY = -3.14159265F;

		bodyModel[233].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[233].setRotationPoint(23F, -1F, 5F);

		bodyModel[234].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[234].setRotationPoint(23F, -1F, -9F);

		bodyModel[235].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[235].setRotationPoint(24.5F, -3F, 7F);
		bodyModel[235].rotateAngleY = -3.14159265F;

		bodyModel[236].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[236].setRotationPoint(24.5F, -3F, 7F);
		bodyModel[236].rotateAngleY = -3.14159265F;

		bodyModel[237].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[237].setRotationPoint(24.5F, -3F, -7F);
		bodyModel[237].rotateAngleY = -3.14159265F;

		bodyModel[238].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[238].setRotationPoint(24.5F, -3F, -7F);
		bodyModel[238].rotateAngleY = -3.14159265F;

		bodyModel[239].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[239].setRotationPoint(24.5F, -5F, 7F);
		bodyModel[239].rotateAngleY = -3.14159265F;

		bodyModel[240].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[240].setRotationPoint(24.5F, -5F, 7F);
		bodyModel[240].rotateAngleY = -3.14159265F;

		bodyModel[241].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[241].setRotationPoint(24.5F, -5F, -7F);
		bodyModel[241].rotateAngleY = -3.14159265F;

		bodyModel[242].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[242].setRotationPoint(24.5F, -5F, -7F);
		bodyModel[242].rotateAngleY = -3.14159265F;

		bodyModel[243].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[243].setRotationPoint(14.5F, -3F, 7F);
		bodyModel[243].rotateAngleY = -3.14159265F;

		bodyModel[244].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[244].setRotationPoint(14.5F, -8F, 7F);
		bodyModel[244].rotateAngleY = -3.14159265F;

		bodyModel[245].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[245].setRotationPoint(14.5F, -3F, -7F);
		bodyModel[245].rotateAngleY = -3.14159265F;

		bodyModel[246].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[246].setRotationPoint(14.5F, -8F, -7F);
		bodyModel[246].rotateAngleY = -3.14159265F;

		bodyModel[247].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[247].setRotationPoint(13F, -1F, 5F);

		bodyModel[248].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[248].setRotationPoint(13F, -1F, -9F);

		bodyModel[249].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[249].setRotationPoint(14.5F, -3F, 7F);
		bodyModel[249].rotateAngleY = -3.14159265F;

		bodyModel[250].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[250].setRotationPoint(14.5F, -3F, 7F);
		bodyModel[250].rotateAngleY = -3.14159265F;

		bodyModel[251].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[251].setRotationPoint(14.5F, -3F, -7F);
		bodyModel[251].rotateAngleY = -3.14159265F;

		bodyModel[252].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[252].setRotationPoint(14.5F, -3F, -7F);
		bodyModel[252].rotateAngleY = -3.14159265F;

		bodyModel[253].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[253].setRotationPoint(14.5F, -5F, 7F);
		bodyModel[253].rotateAngleY = -3.14159265F;

		bodyModel[254].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[254].setRotationPoint(14.5F, -5F, 7F);
		bodyModel[254].rotateAngleY = -3.14159265F;

		bodyModel[255].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[255].setRotationPoint(14.5F, -5F, -7F);
		bodyModel[255].rotateAngleY = -3.14159265F;

		bodyModel[256].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[256].setRotationPoint(14.5F, -5F, -7F);
		bodyModel[256].rotateAngleY = -3.14159265F;

		bodyModel[257].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[257].setRotationPoint(4.5F, -3F, 7F);
		bodyModel[257].rotateAngleY = -3.14159265F;

		bodyModel[258].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[258].setRotationPoint(4.5F, -8F, 7F);
		bodyModel[258].rotateAngleY = -3.14159265F;

		bodyModel[259].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[259].setRotationPoint(4.5F, -3F, -7F);
		bodyModel[259].rotateAngleY = -3.14159265F;

		bodyModel[260].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[260].setRotationPoint(4.5F, -8F, -7F);
		bodyModel[260].rotateAngleY = -3.14159265F;

		bodyModel[261].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[261].setRotationPoint(3F, -1F, 5F);

		bodyModel[262].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[262].setRotationPoint(3F, -1F, -9F);

		bodyModel[263].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[263].setRotationPoint(4.5F, -3F, 7F);
		bodyModel[263].rotateAngleY = -3.14159265F;

		bodyModel[264].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[264].setRotationPoint(4.5F, -3F, 7F);
		bodyModel[264].rotateAngleY = -3.14159265F;

		bodyModel[265].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[265].setRotationPoint(4.5F, -3F, -7F);
		bodyModel[265].rotateAngleY = -3.14159265F;

		bodyModel[266].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[266].setRotationPoint(4.5F, -3F, -7F);
		bodyModel[266].rotateAngleY = -3.14159265F;

		bodyModel[267].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[267].setRotationPoint(4.5F, -5F, 7F);
		bodyModel[267].rotateAngleY = -3.14159265F;

		bodyModel[268].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[268].setRotationPoint(4.5F, -5F, 7F);
		bodyModel[268].rotateAngleY = -3.14159265F;

		bodyModel[269].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[269].setRotationPoint(4.5F, -5F, -7F);
		bodyModel[269].rotateAngleY = -3.14159265F;

		bodyModel[270].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[270].setRotationPoint(4.5F, -5F, -7F);
		bodyModel[270].rotateAngleY = -3.14159265F;

		bodyModel[271].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[271].setRotationPoint(-5.5F, -3F, 7F);
		bodyModel[271].rotateAngleY = -3.14159265F;

		bodyModel[272].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[272].setRotationPoint(-5.5F, -8F, 7F);
		bodyModel[272].rotateAngleY = -3.14159265F;

		bodyModel[273].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[273].setRotationPoint(-5.5F, -3F, -7F);
		bodyModel[273].rotateAngleY = -3.14159265F;

		bodyModel[274].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[274].setRotationPoint(-5.5F, -8F, -7F);
		bodyModel[274].rotateAngleY = -3.14159265F;

		bodyModel[275].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[275].setRotationPoint(-7F, -1F, 5F);

		bodyModel[276].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[276].setRotationPoint(-7F, -1F, -9F);

		bodyModel[277].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[277].setRotationPoint(-5.5F, -3F, 7F);
		bodyModel[277].rotateAngleY = -3.14159265F;

		bodyModel[278].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[278].setRotationPoint(-5.5F, -3F, 7F);
		bodyModel[278].rotateAngleY = -3.14159265F;

		bodyModel[279].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[279].setRotationPoint(-5.5F, -3F, -7F);
		bodyModel[279].rotateAngleY = -3.14159265F;

		bodyModel[280].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[280].setRotationPoint(-5.5F, -3F, -7F);
		bodyModel[280].rotateAngleY = -3.14159265F;

		bodyModel[281].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[281].setRotationPoint(-5.5F, -5F, 7F);
		bodyModel[281].rotateAngleY = -3.14159265F;

		bodyModel[282].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[282].setRotationPoint(-5.5F, -5F, 7F);
		bodyModel[282].rotateAngleY = -3.14159265F;

		bodyModel[283].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[283].setRotationPoint(-5.5F, -5F, -7F);
		bodyModel[283].rotateAngleY = -3.14159265F;

		bodyModel[284].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[284].setRotationPoint(-5.5F, -5F, -7F);
		bodyModel[284].rotateAngleY = -3.14159265F;

		bodyModel[285].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[285].setRotationPoint(-15.5F, -3F, 7F);
		bodyModel[285].rotateAngleY = -3.14159265F;

		bodyModel[286].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[286].setRotationPoint(-15.5F, -8F, 7F);
		bodyModel[286].rotateAngleY = -3.14159265F;

		bodyModel[287].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part test
		bodyModel[287].setRotationPoint(-15.5F, -3F, -7F);
		bodyModel[287].rotateAngleY = -3.14159265F;

		bodyModel[288].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[288].setRotationPoint(-15.5F, -8F, -7F);
		bodyModel[288].rotateAngleY = -3.14159265F;

		bodyModel[289].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[289].setRotationPoint(-17F, -1F, 5F);

		bodyModel[290].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[290].setRotationPoint(-17F, -1F, -9F);

		bodyModel[291].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[291].setRotationPoint(-15.5F, -3F, 7F);
		bodyModel[291].rotateAngleY = -3.14159265F;

		bodyModel[292].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[292].setRotationPoint(-15.5F, -3F, 7F);
		bodyModel[292].rotateAngleY = -3.14159265F;

		bodyModel[293].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[293].setRotationPoint(-15.5F, -3F, -7F);
		bodyModel[293].rotateAngleY = -3.14159265F;

		bodyModel[294].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[294].setRotationPoint(-15.5F, -3F, -7F);
		bodyModel[294].rotateAngleY = -3.14159265F;

		bodyModel[295].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[295].setRotationPoint(-15.5F, -5F, 7F);
		bodyModel[295].rotateAngleY = -3.14159265F;

		bodyModel[296].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[296].setRotationPoint(-15.5F, -5F, 7F);
		bodyModel[296].rotateAngleY = -3.14159265F;

		bodyModel[297].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull test
		bodyModel[297].setRotationPoint(-15.5F, -5F, -7F);
		bodyModel[297].rotateAngleY = -3.14159265F;

		bodyModel[298].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull test
		bodyModel[298].setRotationPoint(-15.5F, -5F, -7F);
		bodyModel[298].rotateAngleY = -3.14159265F;

		bodyModel[299].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[299].setRotationPoint(34.5F, -3F, -7F);
		bodyModel[299].rotateAngleY = -3.14159265F;

		bodyModel[300].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[300].setRotationPoint(34.5F, -8F, -7F);
		bodyModel[300].rotateAngleY = -3.14159265F;

		bodyModel[301].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[301].setRotationPoint(33F, -1F, -9F);

		bodyModel[302].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[302].setRotationPoint(34.5F, -3F, -7F);
		bodyModel[302].rotateAngleY = -3.14159265F;

		bodyModel[303].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[303].setRotationPoint(34.5F, -3F, -7F);
		bodyModel[303].rotateAngleY = -3.14159265F;

		bodyModel[304].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[304].setRotationPoint(34.5F, -5F, -7F);
		bodyModel[304].rotateAngleY = -3.14159265F;

		bodyModel[305].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[305].setRotationPoint(34.5F, -5F, -7F);
		bodyModel[305].rotateAngleY = -3.14159265F;

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[306].setRotationPoint(-29.5F, -7F, 4F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 67, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 11
		bodyModel[307].setRotationPoint(-27F, -17F, -1.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 11
		bodyModel[308].setRotationPoint(-25.5F, -16.75F, -1.25F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[309].setRotationPoint(-25F, -16.25F, -0.75F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 94, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[310].setRotationPoint(-47F, -12F, -9.9F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 94, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[311].setRotationPoint(-47F, -12F, 9.9F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[312].setRotationPoint(52F, -16.5F, -3F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[313].setRotationPoint(-30F, -15F, 3F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[314].setRotationPoint(-30F, -15F, 4F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 100, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[315].setRotationPoint(-50F, -20.5F, -3F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 100, 1, 6, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[316].setRotationPoint(-50F, -20.5F, -9F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 100, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F); // Box 168
		bodyModel[317].setRotationPoint(-50F, -20.5F, 3F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 100, 2, 4, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[318].setRotationPoint(-50F, -19.5F, -7F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 104, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[319].setRotationPoint(-52F, -16F, -11F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 100, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 419
		bodyModel[320].setRotationPoint(-50F, -19.5F, 3F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 100, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[321].setRotationPoint(-50F, -18F, -7F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 67, 1, 3, 0F,0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[322].setRotationPoint(-27F, -18F, -10F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 68, 1, 2, 0F,0F, -2F, -0.665F, 0F, -2F, -0.665F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[323].setRotationPoint(-28F, -18F, -11F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 104, 1, 1, 0F,0F, 0F, -0.335F, 0F, 0F, -0.335F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 423
		bodyModel[324].setRotationPoint(-52F, -16F, 10F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 67, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 424
		bodyModel[325].setRotationPoint(-27F, -18F, 7F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 68, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.665F, 0F, -2F, -0.665F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 425
		bodyModel[326].setRotationPoint(-28F, -18F, 9F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[327].setRotationPoint(-28F, -16F, -10F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 12, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[328].setRotationPoint(40F, -16F, -10F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 24, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[329].setRotationPoint(-52F, -16F, -10F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F,0F, -2F, -0.665F, 0F, -2F, -0.665F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.665F, 0F, 0F, -0.665F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[330].setRotationPoint(-52F, -18F, -11F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, -2F, -0.665F, 0F, -2F, -0.665F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.665F, 0F, 0F, -0.665F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[331].setRotationPoint(40F, -18F, -11F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 10, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[332].setRotationPoint(40F, -17F, -9F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[333].setRotationPoint(40F, -18F, -9F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[334].setRotationPoint(40F, -18F, 7F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.665F, 0F, -2F, -0.665F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.665F, 0F, 0F, -0.665F); // Box 434
		bodyModel[335].setRotationPoint(40F, -18F, 9F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 23, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[336].setRotationPoint(-50F, -17F, -9F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[337].setRotationPoint(-50F, -18F, -9F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[338].setRotationPoint(-50F, -18F, 7F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, -1F, -0.5F, -0.75F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[339].setRotationPoint(-27.5F, -18F, -10F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[340].setRotationPoint(-28F, -17F, -10F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 440
		bodyModel[341].setRotationPoint(-27.5F, -18F, 7F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[342].setRotationPoint(-28F, -17F, 9F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[343].setRotationPoint(-27.5F, -17F, -6F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[344].setRotationPoint(-27.5F, -17F, 5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 11
		bodyModel[345].setRotationPoint(-27.5F, -17F, -1.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.665F, 0F, -2F, -0.665F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.665F, 0F, 0F, -0.665F); // Box 445
		bodyModel[346].setRotationPoint(-52F, -18F, 9F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.07F, 0F, 0F, 0.07F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[347].setRotationPoint(-53F, -16F, -11F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0.07F, 0F, 0F, 0.07F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[348].setRotationPoint(-53F, -16F, 5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.07F, 0F, 0F, 0.07F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[349].setRotationPoint(52F, -16F, -11F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0.07F, 0F, 0F, 0.07F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[350].setRotationPoint(52F, -16F, 5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 1F, -1F, -1F, 1F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.3525F, -1F, -1F, -0.3525F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[351].setRotationPoint(52F, -17F, 8F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 1F, 0F, -0.665F, -1.6475F, 0F, -1F, -2F, 0F, 0F, 1F, -2F, 0F, -0.3525F, 0F, -0.665F, -0.3525F, 0F, -1F, 0F, 0F, 0F, -0.3525F, -2F); // Box 150
		bodyModel[352].setRotationPoint(52F, -17F, 9F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[353].setRotationPoint(50F, -20.5F, 3F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[354].setRotationPoint(50F, -16.5F, -9F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[355].setRotationPoint(50F, -20.5F, -1F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.25F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[356].setRotationPoint(52.5F, -19.5F, -1F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[357].setRotationPoint(50F, -20.5F, -9F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[358].setRotationPoint(50F, -20.5F, 1F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.25F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[359].setRotationPoint(52.5F, -19.5F, 1F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, -0.5F, -1.375F, 0F, -0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[360].setRotationPoint(50F, -20.5F, -3F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.375F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[361].setRotationPoint(52.5F, -19.5F, -3F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.3525F, -1F, 0F, -0.3525F, -1F); // Box 463
		bodyModel[362].setRotationPoint(52F, -17F, -11F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 1F, -2F, -1F, -2F, 0F, -0.665F, -1.6475F, 0F, 0F, 1F, 0F, 0F, -0.3525F, -2F, -1F, 0F, 0F, -0.665F, -0.3525F, 0F, 0F, -0.3525F, 0F); // Box 464
		bodyModel[363].setRotationPoint(52F, -17F, -11F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, -0.5F, -1.375F, 0F, -0.5F, -1.75F, 0F, -0.665F, -0.835F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.665F, 0F, 0F); // Box 166
		bodyModel[364].setRotationPoint(50F, -20.5F, 3F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-0.165F, 0.165F, 0F, 0F, -0.75F, 0F, -0.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.165F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 166
		bodyModel[365].setRotationPoint(50.5F, -19.5F, 5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.375F, 0F, -0.5F, -3F, 0F, -0.5F, -3.435F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 11
		bodyModel[366].setRotationPoint(52.5F, -19.5F, 3F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -0.75F, 0F, -0.5F, -3.435F, 0F, -1.165F, -4.15F, 0F, 0.5F, -1.5F, 0F, 0F, 0.435F, 0F, -0.5F, 0.435F, 0F, -1.165F, 1.145F, 0F, 0.5F, 1.145F, 0F); // Box 11
		bodyModel[367].setRotationPoint(52.5F, -19.5F, 5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.665F, -0.835F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.375F, 0F, 0F, 0F, 0F, -0.665F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[368].setRotationPoint(50F, -20.5F, -5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-1.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.75F, 0F, -0.165F, 0.165F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.165F, 0F, 0F); // Box 471
		bodyModel[369].setRotationPoint(50.5F, -19.5F, -9F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.75F, 0F, -0.5F, -3.435F, 0F, -0.5F, -3F, 0F, 0F, -0.375F, 0F, 0F, 0.435F, 0F, -0.5F, 0.435F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[370].setRotationPoint(52.5F, -19.5F, -5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0.5F, -1.5F, 0F, -1.165F, -4.15F, 0F, -0.5F, -3.435F, 0F, 0F, -0.75F, 0F, 0.5F, 1.15F, 0F, -1.165F, 1.15F, 0F, -0.5F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 473
		bodyModel[371].setRotationPoint(52.5F, -19.5F, -9F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 96, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[372].setRotationPoint(-48F, 3F, 10F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[373].setRotationPoint(46F, 4F, 10F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 2
		bodyModel[374].setRotationPoint(46F, 4F, 10F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.335F, -0.825F, 0F, -0.335F, -0.825F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[375].setRotationPoint(48F, 3F, 9.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, -1.5F, -0.5F, -0.375F); // Box 2
		bodyModel[376].setRotationPoint(44.5F, 4F, 10F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.125F, -1.5F, -0.5F, -0.125F, -1.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F); // Box 2
		bodyModel[377].setRotationPoint(30.5F, 4F, 10F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 2
		bodyModel[378].setRotationPoint(-48F, 4F, 10F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, -1.5F, -0.5F, -0.375F); // Box 2
		bodyModel[379].setRotationPoint(-32.5F, 4F, 10F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.125F, -1.5F, -0.5F, -0.125F, -1.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F); // Box 2
		bodyModel[380].setRotationPoint(-46.5F, 4F, 10F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 2
		bodyModel[381].setRotationPoint(-5F, 4F, 10F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 2
		bodyModel[382].setRotationPoint(-31F, 4F, 10F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 490
		bodyModel[383].setRotationPoint(46F, 4F, -11F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, -1.5F, -0.5F, -0.125F); // Box 491
		bodyModel[384].setRotationPoint(44.5F, 4F, -11F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.375F, -1.5F, -0.5F, -0.375F, -1.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F); // Box 492
		bodyModel[385].setRotationPoint(30.5F, 4F, -11F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 493
		bodyModel[386].setRotationPoint(-48F, 4F, -11F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, -1.5F, -0.5F, -0.125F); // Box 494
		bodyModel[387].setRotationPoint(-32.5F, 4F, -11F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.375F, -1.5F, -0.5F, -0.375F, -1.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F); // Box 495
		bodyModel[388].setRotationPoint(-46.5F, 4F, -11F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 496
		bodyModel[389].setRotationPoint(15F, 4F, -11F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 30, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 497
		bodyModel[390].setRotationPoint(-31F, 4F, -11F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 96, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 498
		bodyModel[391].setRotationPoint(-48F, 3F, -11F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.335F, -0.825F, 0F, -0.335F, -0.825F); // Box 499
		bodyModel[392].setRotationPoint(48F, 3F, -10.5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.335F, -0.825F, 0F, -0.335F, -0.825F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[393].setRotationPoint(-48F, 3F, 9.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.335F, -0.825F, 0F, -0.335F, -0.825F); // Box 499
		bodyModel[394].setRotationPoint(-48F, 3F, -10.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[395].setRotationPoint(-5F, 4F, 10F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[396].setRotationPoint(-31F, 4F, 10F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[397].setRotationPoint(-16F, 4F, 10F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 2
		bodyModel[398].setRotationPoint(44F, 4F, 10F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[399].setRotationPoint(31F, 4F, 10F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[400].setRotationPoint(-48F, 4F, 10F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 2
		bodyModel[401].setRotationPoint(-33F, 4F, 10F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[402].setRotationPoint(-46F, 4F, 10F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[403].setRotationPoint(46F, 4F, -11F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		bodyModel[404].setRotationPoint(15F, 4F, -11F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 30, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[405].setRotationPoint(-31F, 4F, -11F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 513
		bodyModel[406].setRotationPoint(-1F, 4F, -11F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 514
		bodyModel[407].setRotationPoint(44F, 4F, -11F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[408].setRotationPoint(31F, 4F, -11F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[409].setRotationPoint(-48F, 4F, -11F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 517
		bodyModel[410].setRotationPoint(-33F, 4F, -11F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[411].setRotationPoint(-46F, 4F, -11F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 2
		bodyModel[412].setRotationPoint(-16F, 4F, 10F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 520
		bodyModel[413].setRotationPoint(-1F, 4F, -11F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.565F, 0F, 0F, -0.565F, 0F); // Box 101
		bodyModel[414].setRotationPoint(52F, -16.5F, 3F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.565F, 0F, -0.5F, -0.565F, 0F, -1F, 0.145F, 0F, 0F, 0.145F, 0F); // Box 101
		bodyModel[415].setRotationPoint(52F, -16.5F, 5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.565F, 0F, -0.5F, -0.565F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 469
		bodyModel[416].setRotationPoint(52F, -16.5F, -5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.145F, 0F, -1F, 0.145F, 0F, -0.5F, -0.565F, 0F, 0F, -0.565F, 0F); // Box 470
		bodyModel[417].setRotationPoint(52F, -16.5F, -9F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.565F, 0F, 0F, -0.565F, 0F); // Box 101
		bodyModel[418].setRotationPoint(-52.5F, -16.5F, 3F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.565F, 0F, 0F, -0.565F, 0F, 0F, 0.145F, 0F, -1F, 0.145F, 0F); // Box 101
		bodyModel[419].setRotationPoint(-53F, -16.5F, 5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.565F, 0F, -0.5F, -0.565F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 469
		bodyModel[420].setRotationPoint(-52.5F, -16.5F, -5F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.145F, 0F, 0F, 0.145F, 0F, 0F, -0.565F, 0F, -0.5F, -0.565F, 0F); // Box 470
		bodyModel[421].setRotationPoint(-53F, -16.5F, -9F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -0.3525F, -1F, 0F, -0.3525F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[422].setRotationPoint(-53F, -17F, 8F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.665F, -1.6475F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, -1F, -2F, 0F, -0.665F, -0.3525F, 0F, 0F, -0.3525F, 0F, 0F, -0.3525F, -2F, -1F, 0F, 0F); // Box 150
		bodyModel[423].setRotationPoint(-54F, -17F, 9F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[424].setRotationPoint(-52F, -20.5F, 3F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 457
		bodyModel[425].setRotationPoint(-52F, -20.5F, -9F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3525F, -1F, -1F, -0.3525F, -1F); // Box 463
		bodyModel[426].setRotationPoint(-53F, -17F, -11F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, -0.665F, -1.6475F, 0F, -1F, 0F, 0F, 0F, -0.3525F, -2F, 0F, -0.3525F, 0F, -0.665F, -0.3525F, 0F); // Box 464
		bodyModel[427].setRotationPoint(-54F, -17F, -11F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[428].setRotationPoint(-52F, -16.5F, -9F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 11
		bodyModel[429].setRotationPoint(-53F, -20.5F, -1F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, -3F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 11
		bodyModel[430].setRotationPoint(-54.5F, -19.5F, -1F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.375F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 11
		bodyModel[431].setRotationPoint(-53F, -20.5F, 1F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, -3F, 0F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 11
		bodyModel[432].setRotationPoint(-54.5F, -19.5F, 1F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, -1.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 460
		bodyModel[433].setRotationPoint(-53F, -20.5F, -3F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, -3F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 461
		bodyModel[434].setRotationPoint(-54.5F, -19.5F, -3F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, -1.375F, 0F, 0F, 0F, 0F, -0.665F, -0.835F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.665F, 0F, 0F, -0.5F, 0F, 0F); // Box 166
		bodyModel[435].setRotationPoint(-53F, -20.5F, 3F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -0.75F, 0F, -0.165F, 0.165F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, -0.165F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 166
		bodyModel[436].setRotationPoint(-52.5F, -19.5F, 5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, -3F, 0F, 0F, -0.375F, 0F, 0F, -0.75F, 0F, -0.5F, -3.435F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.435F, 0F, -0.5F, 0.435F, 0F); // Box 11
		bodyModel[437].setRotationPoint(-54.5F, -19.5F, 3F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-0.5F, -3.435F, 0F, 0F, -0.75F, 0F, 0.5F, -1.5F, 0F, -1.165F, -4.15F, 0F, -0.5F, 0.435F, 0F, 0F, 0.435F, 0F, 0.5F, 1.145F, 0F, -1.165F, 1.145F, 0F); // Box 11
		bodyModel[438].setRotationPoint(-54.5F, -19.5F, 5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, -1.75F, 0F, -0.665F, -0.835F, 0F, 0F, 0F, 0F, -0.5F, -1.375F, 0F, -0.5F, 0F, 0F, -0.665F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 470
		bodyModel[439].setRotationPoint(-53F, -20.5F, -5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-0.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.165F, 0.165F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.165F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[440].setRotationPoint(-52.5F, -19.5F, -9F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, -3.435F, 0F, 0F, -0.75F, 0F, 0F, -0.375F, 0F, -0.5F, -3F, 0F, -0.5F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 472
		bodyModel[441].setRotationPoint(-54.5F, -19.5F, -5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-1.165F, -4.15F, 0F, 0.5F, -1.5F, 0F, 0F, -0.75F, 0F, -0.5F, -3.435F, 0F, -1.165F, 1.15F, 0F, 0.5F, 1.15F, 0F, 0F, 0.435F, 0F, -0.5F, 0.435F, 0F); // Box 473
		bodyModel[442].setRotationPoint(-54.5F, -19.5F, -9F);

		bodyModel[443].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 38
		bodyModel[443].setRotationPoint(-28.5F, -12F, -11F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 32, 2, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[444].setRotationPoint(9F, -22F, 0F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 153
		bodyModel[445].setRotationPoint(55F, -16.5F, -1.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[446].setRotationPoint(-56F, -16.5F, -1.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0.5F, 0F, -0.01F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.4F, 0F, -0.75F, 0.4F); // Box 128
		bodyModel[447].setRotationPoint(43F, -16.14F, -10.54F);
		bodyModel[447].rotateAngleX = 0.9817477F;

		bodyModel[448].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0.045F, 0F, 0F, 0.045F, 0F, 0F, 0.17F, 0F, 0F, 0.17F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.17F, 0F, -0.75F, 0.17F); // Box 128
		bodyModel[448].setRotationPoint(43F, -18.23F, -9.1F);
		bodyModel[448].rotateAngleX = 0.39531708F;

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.01F, 0.5F, 0F, -0.01F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.4F, 0F, -0.75F, 0.4F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 504
		bodyModel[449].setRotationPoint(43F, -17.8F, 9.43F);
		bodyModel[449].rotateAngleX = -0.9817477F;

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0.17F, 0F, 0F, 0.17F, 0F, 0F, 0.045F, 0F, 0F, 0.045F, 0F, -0.75F, 0.17F, 0F, -0.75F, 0.17F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 505
		bodyModel[450].setRotationPoint(43F, -19F, 7.26F);
		bodyModel[450].rotateAngleX = -0.39793507F;

		bodyModel[451].addShapeBox(0F, 0F, 0F, 192, 14, 0, 0F,0F, 0F, 0F, -96F, 0F, 0F, -96F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -96F, -7F, 0F, -96F, -7F, 0F, 0F, -7F, 0F); // Box 128
		bodyModel[451].setRotationPoint(-48F, -12.5F, 11.01F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 192, 14, 0, 0F,0F, 0F, 0F, -96F, 0F, 0F, -96F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -96F, -7F, 0F, -96F, -7F, 0F, 0F, -7F, 0F); // Box 507
		bodyModel[452].setRotationPoint(-48F, -12.5F, -11.01F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[453].setRotationPoint(45.18F, -2F, 6.78F);
		bodyModel[453].rotateAngleY = 0.78539816F;

		bodyModel[454].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[454].setRotationPoint(45.53F, -1F, 7.84F);
		bodyModel[454].rotateAngleY = 0.78539816F;

		bodyModel[455].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,-1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[455].setRotationPoint(45.5F, -5F, 8.5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 349
		bodyModel[456].setRotationPoint(-47.5F, -5F, -10.5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 350
		bodyModel[457].setRotationPoint(-45.54F, -2F, -9.95F);
		bodyModel[457].rotateAngleY = 0.78539816F;

		bodyModel[458].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[458].setRotationPoint(-45.89F, -1F, -9.6F);
		bodyModel[458].rotateAngleY = 0.78539816F;

		bodyModel[459].addShapeBox(0F, 0F, 0F, 4, 16, 4, 0F,0F, 0F, -0.75F, -2F, 0F, 0F, -2F, 0F, -2F, 1.5F, 0F, -2F, 0F, 0F, -0.75F, -2F, 0F, 0F, -2F, 0F, -2F, 1.5F, 0F, -2F); // Box 128 cull
		bodyModel[459].setRotationPoint(-32F, -15F, 3F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[460].setRotationPoint(-40F, -6F, -10F);

		bodyModel[461].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[461].setRotationPoint(-39F, -5F, -9F);
		bodyModel[461].rotateAngleY = -0.78539816F;

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[462].setRotationPoint(-40F, -6F, -9F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[463].setRotationPoint(-39F, -6F, -9F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 94, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[464].setRotationPoint(-47F, -12F, -10.1F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 94, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[465].setRotationPoint(-47F, -12F, 10.1F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 11
		bodyModel[466].setRotationPoint(-15.5F, -16.75F, -1.25F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[467].setRotationPoint(-15F, -16.25F, -0.75F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 11
		bodyModel[468].setRotationPoint(-20.5F, -16.75F, -1.25F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[469].setRotationPoint(-20F, -16.25F, -0.75F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 11
		bodyModel[470].setRotationPoint(-10.5F, -16.75F, -1.25F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[471].setRotationPoint(-10F, -16.25F, -0.75F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 11
		bodyModel[472].setRotationPoint(-5.5F, -16.75F, -1.25F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[473].setRotationPoint(-5F, -16.25F, -0.75F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 11
		bodyModel[474].setRotationPoint(4.5F, -16.75F, -1.25F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[475].setRotationPoint(5F, -16.25F, -0.75F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 11
		bodyModel[476].setRotationPoint(-0.5F, -16.75F, -1.25F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[477].setRotationPoint(0F, -16.25F, -0.75F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 11
		bodyModel[478].setRotationPoint(9.5F, -16.75F, -1.25F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[479].setRotationPoint(10F, -16.25F, -0.75F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 11
		bodyModel[480].setRotationPoint(14.5F, -16.75F, -1.25F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[481].setRotationPoint(15F, -16.25F, -0.75F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 11
		bodyModel[482].setRotationPoint(24.5F, -16.75F, -1.25F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[483].setRotationPoint(25F, -16.25F, -0.75F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 11
		bodyModel[484].setRotationPoint(19.5F, -16.75F, -1.25F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[485].setRotationPoint(20F, -16.25F, -0.75F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 11
		bodyModel[486].setRotationPoint(29.5F, -16.75F, -1.25F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[487].setRotationPoint(30F, -16.25F, -0.75F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 11
		bodyModel[488].setRotationPoint(34.5F, -16.75F, -1.25F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[489].setRotationPoint(35F, -16.25F, -0.75F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[490].setRotationPoint(24.5F, 3.45F, 2.5F);
		bodyModel[490].rotateAngleZ = -0.78539816F;

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[491].setRotationPoint(24F, 2F, 7.51F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[492].setRotationPoint(24F, 2F, 2.49F);

		bodyModel[493].addBox(0.5F, 0F, 2F, 2, 2, 1, 0F); // Seat part
		bodyModel[493].setRotationPoint(4.5F, -5F, 7F);
		bodyModel[493].rotateAngleY = -3.14159265F;

		bodyModel[494].addBox(0.5F, 0F, -3F, 2, 2, 1, 0F); // Seat part
		bodyModel[494].setRotationPoint(4.5F, -5F, 7F);
		bodyModel[494].rotateAngleY = -3.14159265F;

		bodyModel[495].addShapeBox(-2.5F, 0F, -3F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[495].setRotationPoint(4.5F, -5F, 7F);
		bodyModel[495].rotateAngleY = -3.14159265F;

		bodyModel[496].addShapeBox(-2.5F, 0F, 2F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[496].setRotationPoint(4.5F, -5F, 7F);
		bodyModel[496].rotateAngleY = -3.14159265F;

		bodyModel[497].addBox(0.5F, 0F, -3F, 2, 2, 1, 0F); // Seat part
		bodyModel[497].setRotationPoint(4.5F, -5F, -7F);
		bodyModel[497].rotateAngleY = -3.14159265F;

		bodyModel[498].addBox(0.5F, 0F, 2F, 2, 2, 1, 0F); // Seat part
		bodyModel[498].setRotationPoint(4.5F, -5F, -7F);
		bodyModel[498].rotateAngleY = -3.14159265F;

		bodyModel[499].addShapeBox(-2.5F, 0F, 2F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[499].setRotationPoint(4.5F, -5F, -7F);
		bodyModel[499].rotateAngleY = -3.14159265F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 185, 328, textureX, textureY); // Seat part
		bodyModel[501] = new ModelRendererTurbo(this, 157, 304, textureX, textureY); // Seat part
		bodyModel[502] = new ModelRendererTurbo(this, 157, 286, textureX, textureY); // Seat part
		bodyModel[503] = new ModelRendererTurbo(this, 157, 293, textureX, textureY); // Seat part
		bodyModel[504] = new ModelRendererTurbo(this, 164, 304, textureX, textureY); // Seat part
		bodyModel[505] = new ModelRendererTurbo(this, 157, 321, textureX, textureY); // Seat part
		bodyModel[506] = new ModelRendererTurbo(this, 157, 339, textureX, textureY); // Seat part
		bodyModel[507] = new ModelRendererTurbo(this, 163, 339, textureX, textureY); // Seat part
		bodyModel[508] = new ModelRendererTurbo(this, 157, 328, textureX, textureY); // Seat part
		bodyModel[509] = new ModelRendererTurbo(this, 129, 304, textureX, textureY); // Seat part
		bodyModel[510] = new ModelRendererTurbo(this, 129, 286, textureX, textureY); // Seat part
		bodyModel[511] = new ModelRendererTurbo(this, 129, 293, textureX, textureY); // Seat part
		bodyModel[512] = new ModelRendererTurbo(this, 136, 304, textureX, textureY); // Seat part
		bodyModel[513] = new ModelRendererTurbo(this, 129, 321, textureX, textureY); // Seat part
		bodyModel[514] = new ModelRendererTurbo(this, 129, 339, textureX, textureY); // Seat part
		bodyModel[515] = new ModelRendererTurbo(this, 136, 339, textureX, textureY); // Seat part
		bodyModel[516] = new ModelRendererTurbo(this, 129, 328, textureX, textureY); // Seat part
		bodyModel[517] = new ModelRendererTurbo(this, 213, 304, textureX, textureY); // Seat part
		bodyModel[518] = new ModelRendererTurbo(this, 213, 286, textureX, textureY); // Seat part
		bodyModel[519] = new ModelRendererTurbo(this, 213, 293, textureX, textureY); // Seat part
		bodyModel[520] = new ModelRendererTurbo(this, 220, 304, textureX, textureY); // Seat part
		bodyModel[521] = new ModelRendererTurbo(this, 213, 321, textureX, textureY); // Seat part
		bodyModel[522] = new ModelRendererTurbo(this, 213, 339, textureX, textureY); // Seat part
		bodyModel[523] = new ModelRendererTurbo(this, 220, 339, textureX, textureY); // Seat part
		bodyModel[524] = new ModelRendererTurbo(this, 213, 328, textureX, textureY); // Seat part
		bodyModel[525] = new ModelRendererTurbo(this, 241, 304, textureX, textureY); // Seat part
		bodyModel[526] = new ModelRendererTurbo(this, 241, 286, textureX, textureY); // Seat part
		bodyModel[527] = new ModelRendererTurbo(this, 241, 293, textureX, textureY); // Seat part
		bodyModel[528] = new ModelRendererTurbo(this, 248, 304, textureX, textureY); // Seat part
		bodyModel[529] = new ModelRendererTurbo(this, 241, 321, textureX, textureY); // Seat part
		bodyModel[530] = new ModelRendererTurbo(this, 241, 339, textureX, textureY); // Seat part
		bodyModel[531] = new ModelRendererTurbo(this, 248, 339, textureX, textureY); // Seat part
		bodyModel[532] = new ModelRendererTurbo(this, 241, 328, textureX, textureY); // Seat part
		bodyModel[533] = new ModelRendererTurbo(this, 269, 304, textureX, textureY); // Seat part
		bodyModel[534] = new ModelRendererTurbo(this, 269, 286, textureX, textureY); // Seat part
		bodyModel[535] = new ModelRendererTurbo(this, 269, 293, textureX, textureY); // Seat part
		bodyModel[536] = new ModelRendererTurbo(this, 276, 304, textureX, textureY); // Seat part
		bodyModel[537] = new ModelRendererTurbo(this, 269, 321, textureX, textureY); // Seat part
		bodyModel[538] = new ModelRendererTurbo(this, 269, 339, textureX, textureY); // Seat part
		bodyModel[539] = new ModelRendererTurbo(this, 276, 339, textureX, textureY); // Seat part
		bodyModel[540] = new ModelRendererTurbo(this, 269, 328, textureX, textureY); // Seat part
		bodyModel[541] = new ModelRendererTurbo(this, 145, 154, textureX, textureY); // DRGW 1005,1007 underbody part
		bodyModel[542] = new ModelRendererTurbo(this, 143, 157, textureX, textureY); // DRGW 1005,1007 underbody part
		bodyModel[543] = new ModelRendererTurbo(this, 154, 159, textureX, textureY); // DRGW 1005,1007 underbody part
		bodyModel[544] = new ModelRendererTurbo(this, 154, 156, textureX, textureY); // DRGW 1005,1007 underbody part
		bodyModel[545] = new ModelRendererTurbo(this, 160, 157, textureX, textureY); // DRGW 1005,1007 underbody part

		bodyModel[500].addShapeBox(-2.5F, 0F, -3F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[500].setRotationPoint(4.5F, -5F, -7F);
		bodyModel[500].rotateAngleY = -3.14159265F;

		bodyModel[501].addBox(0.5F, 0F, 2F, 2, 2, 1, 0F); // Seat part
		bodyModel[501].setRotationPoint(-5.5F, -5F, 7F);
		bodyModel[501].rotateAngleY = -3.14159265F;

		bodyModel[502].addBox(0.5F, 0F, -3F, 2, 2, 1, 0F); // Seat part
		bodyModel[502].setRotationPoint(-5.5F, -5F, 7F);
		bodyModel[502].rotateAngleY = -3.14159265F;

		bodyModel[503].addShapeBox(-2.5F, 0F, -3F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[503].setRotationPoint(-5.5F, -5F, 7F);
		bodyModel[503].rotateAngleY = -3.14159265F;

		bodyModel[504].addShapeBox(-2.5F, 0F, 2F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[504].setRotationPoint(-5.5F, -5F, 7F);
		bodyModel[504].rotateAngleY = -3.14159265F;

		bodyModel[505].addBox(0.5F, 0F, -3F, 2, 2, 1, 0F); // Seat part
		bodyModel[505].setRotationPoint(-5.5F, -5F, -7F);
		bodyModel[505].rotateAngleY = -3.14159265F;

		bodyModel[506].addBox(0.5F, 0F, 2F, 2, 2, 1, 0F); // Seat part
		bodyModel[506].setRotationPoint(-5.5F, -5F, -7F);
		bodyModel[506].rotateAngleY = -3.14159265F;

		bodyModel[507].addShapeBox(-2.5F, 0F, 2F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[507].setRotationPoint(-5.5F, -5F, -7F);
		bodyModel[507].rotateAngleY = -3.14159265F;

		bodyModel[508].addShapeBox(-2.5F, 0F, -3F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[508].setRotationPoint(-5.5F, -5F, -7F);
		bodyModel[508].rotateAngleY = -3.14159265F;

		bodyModel[509].addBox(0.5F, 0F, 2F, 2, 2, 1, 0F); // Seat part
		bodyModel[509].setRotationPoint(-15.5F, -5F, 7F);
		bodyModel[509].rotateAngleY = -3.14159265F;

		bodyModel[510].addBox(0.5F, 0F, -3F, 2, 2, 1, 0F); // Seat part
		bodyModel[510].setRotationPoint(-15.5F, -5F, 7F);
		bodyModel[510].rotateAngleY = -3.14159265F;

		bodyModel[511].addShapeBox(-2.5F, 0F, -3F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[511].setRotationPoint(-15.5F, -5F, 7F);
		bodyModel[511].rotateAngleY = -3.14159265F;

		bodyModel[512].addShapeBox(-2.5F, 0F, 2F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[512].setRotationPoint(-15.5F, -5F, 7F);
		bodyModel[512].rotateAngleY = -3.14159265F;

		bodyModel[513].addBox(0.5F, 0F, -3F, 2, 2, 1, 0F); // Seat part
		bodyModel[513].setRotationPoint(-15.5F, -5F, -7F);
		bodyModel[513].rotateAngleY = -3.14159265F;

		bodyModel[514].addBox(0.5F, 0F, 2F, 2, 2, 1, 0F); // Seat part
		bodyModel[514].setRotationPoint(-15.5F, -5F, -7F);
		bodyModel[514].rotateAngleY = -3.14159265F;

		bodyModel[515].addShapeBox(-2.5F, 0F, 2F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[515].setRotationPoint(-15.5F, -5F, -7F);
		bodyModel[515].rotateAngleY = -3.14159265F;

		bodyModel[516].addShapeBox(-2.5F, 0F, -3F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[516].setRotationPoint(-15.5F, -5F, -7F);
		bodyModel[516].rotateAngleY = -3.14159265F;

		bodyModel[517].addBox(0.5F, 0F, 2F, 2, 2, 1, 0F); // Seat part
		bodyModel[517].setRotationPoint(14.5F, -5F, 7F);
		bodyModel[517].rotateAngleY = -3.14159265F;

		bodyModel[518].addBox(0.5F, 0F, -3F, 2, 2, 1, 0F); // Seat part
		bodyModel[518].setRotationPoint(14.5F, -5F, 7F);
		bodyModel[518].rotateAngleY = -3.14159265F;

		bodyModel[519].addShapeBox(-2.5F, 0F, -3F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[519].setRotationPoint(14.5F, -5F, 7F);
		bodyModel[519].rotateAngleY = -3.14159265F;

		bodyModel[520].addShapeBox(-2.5F, 0F, 2F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[520].setRotationPoint(14.5F, -5F, 7F);
		bodyModel[520].rotateAngleY = -3.14159265F;

		bodyModel[521].addBox(0.5F, 0F, -3F, 2, 2, 1, 0F); // Seat part
		bodyModel[521].setRotationPoint(14.5F, -5F, -7F);
		bodyModel[521].rotateAngleY = -3.14159265F;

		bodyModel[522].addBox(0.5F, 0F, 2F, 2, 2, 1, 0F); // Seat part
		bodyModel[522].setRotationPoint(14.5F, -5F, -7F);
		bodyModel[522].rotateAngleY = -3.14159265F;

		bodyModel[523].addShapeBox(-2.5F, 0F, 2F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[523].setRotationPoint(14.5F, -5F, -7F);
		bodyModel[523].rotateAngleY = -3.14159265F;

		bodyModel[524].addShapeBox(-2.5F, 0F, -3F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[524].setRotationPoint(14.5F, -5F, -7F);
		bodyModel[524].rotateAngleY = -3.14159265F;

		bodyModel[525].addBox(0.5F, 0F, 2F, 2, 2, 1, 0F); // Seat part
		bodyModel[525].setRotationPoint(24.5F, -5F, 7F);
		bodyModel[525].rotateAngleY = -3.14159265F;

		bodyModel[526].addBox(0.5F, 0F, -3F, 2, 2, 1, 0F); // Seat part
		bodyModel[526].setRotationPoint(24.5F, -5F, 7F);
		bodyModel[526].rotateAngleY = -3.14159265F;

		bodyModel[527].addShapeBox(-2.5F, 0F, -3F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[527].setRotationPoint(24.5F, -5F, 7F);
		bodyModel[527].rotateAngleY = -3.14159265F;

		bodyModel[528].addShapeBox(-2.5F, 0F, 2F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[528].setRotationPoint(24.5F, -5F, 7F);
		bodyModel[528].rotateAngleY = -3.14159265F;

		bodyModel[529].addBox(0.5F, 0F, -3F, 2, 2, 1, 0F); // Seat part
		bodyModel[529].setRotationPoint(24.5F, -5F, -7F);
		bodyModel[529].rotateAngleY = -3.14159265F;

		bodyModel[530].addBox(0.5F, 0F, 2F, 2, 2, 1, 0F); // Seat part
		bodyModel[530].setRotationPoint(24.5F, -5F, -7F);
		bodyModel[530].rotateAngleY = -3.14159265F;

		bodyModel[531].addShapeBox(-2.5F, 0F, 2F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[531].setRotationPoint(24.5F, -5F, -7F);
		bodyModel[531].rotateAngleY = -3.14159265F;

		bodyModel[532].addShapeBox(-2.5F, 0F, -3F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[532].setRotationPoint(24.5F, -5F, -7F);
		bodyModel[532].rotateAngleY = -3.14159265F;

		bodyModel[533].addBox(0.5F, 0F, 2F, 2, 2, 1, 0F); // Seat part
		bodyModel[533].setRotationPoint(34.5F, -5F, 7F);
		bodyModel[533].rotateAngleY = -3.14159265F;

		bodyModel[534].addBox(0.5F, 0F, -3F, 2, 2, 1, 0F); // Seat part
		bodyModel[534].setRotationPoint(34.5F, -5F, 7F);
		bodyModel[534].rotateAngleY = -3.14159265F;

		bodyModel[535].addShapeBox(-2.5F, 0F, -3F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[535].setRotationPoint(34.5F, -5F, 7F);
		bodyModel[535].rotateAngleY = -3.14159265F;

		bodyModel[536].addShapeBox(-2.5F, 0F, 2F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[536].setRotationPoint(34.5F, -5F, 7F);
		bodyModel[536].rotateAngleY = -3.14159265F;

		bodyModel[537].addBox(0.5F, 0F, -3F, 2, 2, 1, 0F); // Seat part
		bodyModel[537].setRotationPoint(34.5F, -5F, -7F);
		bodyModel[537].rotateAngleY = -3.14159265F;

		bodyModel[538].addBox(0.5F, 0F, 2F, 2, 2, 1, 0F); // Seat part
		bodyModel[538].setRotationPoint(34.5F, -5F, -7F);
		bodyModel[538].rotateAngleY = -3.14159265F;

		bodyModel[539].addShapeBox(-2.5F, 0F, 2F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[539].setRotationPoint(34.5F, -5F, -7F);
		bodyModel[539].rotateAngleY = -3.14159265F;

		bodyModel[540].addShapeBox(-2.5F, 0F, -3F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[540].setRotationPoint(34.5F, -5F, -7F);
		bodyModel[540].rotateAngleY = -3.14159265F;

		bodyModel[541].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // DRGW 1005,1007 underbody part
		bodyModel[541].setRotationPoint(-2F, 3F, 8F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // DRGW 1005,1007 underbody part
		bodyModel[542].setRotationPoint(-2.5F, 3.2F, 8.5F);
		bodyModel[542].rotateAngleX = -0.78539816F;

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // DRGW 1005,1007 underbody part
		bodyModel[543].setRotationPoint(0.5F, 4.5F, 8.5F);
		bodyModel[543].rotateAngleX = -0.78539816F;

		bodyModel[544].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // DRGW 1005,1007 underbody part
		bodyModel[544].setRotationPoint(0.5F, 3.75F, 8F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // DRGW 1005,1007 underbody part
		bodyModel[545].setRotationPoint(2.5F, 4.25F, 8.25F);
	}
	ModelP_S_Truck bogie1 = new ModelP_S_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 546; i++)
		{
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if(GetColor(entity)==11 || GetColor(entity) ==8){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/P_S_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.4, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(4.8, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/P_S_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.4, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(4.8, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}