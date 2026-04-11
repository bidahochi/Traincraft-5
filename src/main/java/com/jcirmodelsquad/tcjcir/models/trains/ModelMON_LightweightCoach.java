//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelGSC_postwar_6Wheel_LightweightTruck;
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

public class ModelMON_LightweightCoach extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelMON_LightweightCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[453];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 340, 104, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 347, 117, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[6] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[7] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[8] = new ModelRendererTurbo(this, 415, 19, textureX, textureY); // Box 128
		bodyModel[9] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[10] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[11] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[12] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[13] = new ModelRendererTurbo(this, 434, 36, textureX, textureY); // Box 128
		bodyModel[14] = new ModelRendererTurbo(this, 410, 2, textureX, textureY); // Box 128
		bodyModel[15] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[16] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 128
		bodyModel[17] = new ModelRendererTurbo(this, 424, 1, textureX, textureY); // Box 128
		bodyModel[18] = new ModelRendererTurbo(this, 445, 36, textureX, textureY); // Box 128
		bodyModel[19] = new ModelRendererTurbo(this, 445, 23, textureX, textureY); // Box 128
		bodyModel[20] = new ModelRendererTurbo(this, 20, 43, textureX, textureY); // Box 128
		bodyModel[21] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[22] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[23] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 128
		bodyModel[24] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 128
		bodyModel[25] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Box 128
		bodyModel[26] = new ModelRendererTurbo(this, 4, 38, textureX, textureY); // Box 128
		bodyModel[27] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[28] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[29] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[30] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[31] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[32] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 128
		bodyModel[33] = new ModelRendererTurbo(this, 30, 9, textureX, textureY); // Box 128
		bodyModel[34] = new ModelRendererTurbo(this, 4, 169, textureX, textureY); // Box 128
		bodyModel[35] = new ModelRendererTurbo(this, 18, 9, textureX, textureY); // Box 176
		bodyModel[36] = new ModelRendererTurbo(this, 4, 155, textureX, textureY); // Box 177
		bodyModel[37] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[38] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[39] = new ModelRendererTurbo(this, 438, 1, textureX, textureY); // Box 128
		bodyModel[40] = new ModelRendererTurbo(this, 492, 24, textureX, textureY); // Box 128
		bodyModel[41] = new ModelRendererTurbo(this, 460, 24, textureX, textureY); // Box 176
		bodyModel[42] = new ModelRendererTurbo(this, 459, 10, textureX, textureY); // Box 128
		bodyModel[43] = new ModelRendererTurbo(this, 52, 3, textureX, textureY); // Box 128
		bodyModel[44] = new ModelRendererTurbo(this, 4, 181, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 349, 75, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 352, 75, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 61, 84, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 349, 94, textureX, textureY); // Box 202
		bodyModel[49] = new ModelRendererTurbo(this, 352, 94, textureX, textureY); // Box 203
		bodyModel[50] = new ModelRendererTurbo(this, 61, 103, textureX, textureY); // Box 204
		bodyModel[51] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[52] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[53] = new ModelRendererTurbo(this, 69, 78, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 69, 97, textureX, textureY); // Box 202
		bodyModel[55] = new ModelRendererTurbo(this, 31, 132, textureX, textureY); // Box 2
		bodyModel[56] = new ModelRendererTurbo(this, 309, 132, textureX, textureY); // Box 2
		bodyModel[57] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 434, 23, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 310, 116, textureX, textureY); // Box 2
		bodyModel[61] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[63] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[64] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[65] = new ModelRendererTurbo(this, 26, 83, textureX, textureY); // Box 2
		bodyModel[66] = new ModelRendererTurbo(this, 45, 86, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 13, 86, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 8, 90, textureX, textureY); // Box 497
		bodyModel[69] = new ModelRendererTurbo(this, 58, 90, textureX, textureY); // Box 497
		bodyModel[70] = new ModelRendererTurbo(this, 44, 73, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 128
		bodyModel[72] = new ModelRendererTurbo(this, 24, 56, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 1, 69, textureX, textureY); // Box 170
		bodyModel[74] = new ModelRendererTurbo(this, 27, 62, textureX, textureY); // Box 168
		bodyModel[75] = new ModelRendererTurbo(this, 17, 66, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 8, 67, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 20, 62, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 11, 60, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 63, 69, textureX, textureY); // Box 80
		bodyModel[80] = new ModelRendererTurbo(this, 37, 62, textureX, textureY); // Box 81
		bodyModel[81] = new ModelRendererTurbo(this, 47, 66, textureX, textureY); // Box 82
		bodyModel[82] = new ModelRendererTurbo(this, 54, 67, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 44, 62, textureX, textureY); // Box 84
		bodyModel[84] = new ModelRendererTurbo(this, 51, 60, textureX, textureY); // Box 85
		bodyModel[85] = new ModelRendererTurbo(this, 349, 2, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 388, 15, textureX, textureY); // Box 170
		bodyModel[87] = new ModelRendererTurbo(this, 362, 8, textureX, textureY); // Box 168
		bodyModel[88] = new ModelRendererTurbo(this, 372, 12, textureX, textureY); // Box 128
		bodyModel[89] = new ModelRendererTurbo(this, 379, 13, textureX, textureY); // Box 128
		bodyModel[90] = new ModelRendererTurbo(this, 369, 8, textureX, textureY); // Box 128
		bodyModel[91] = new ModelRendererTurbo(this, 376, 6, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 326, 15, textureX, textureY); // Box 93
		bodyModel[93] = new ModelRendererTurbo(this, 352, 8, textureX, textureY); // Box 94
		bodyModel[94] = new ModelRendererTurbo(this, 342, 12, textureX, textureY); // Box 95
		bodyModel[95] = new ModelRendererTurbo(this, 333, 13, textureX, textureY); // Box 96
		bodyModel[96] = new ModelRendererTurbo(this, 345, 8, textureX, textureY); // Box 97
		bodyModel[97] = new ModelRendererTurbo(this, 336, 6, textureX, textureY); // Box 98
		bodyModel[98] = new ModelRendererTurbo(this, 408, 25, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 395, 25, textureX, textureY); // Box 100
		bodyModel[100] = new ModelRendererTurbo(this, 27, 71, textureX, textureY); // Box 128
		bodyModel[101] = new ModelRendererTurbo(this, 66, 94, textureX, textureY); // Box 128
		bodyModel[102] = new ModelRendererTurbo(this, 66, 75, textureX, textureY); // Box 202
		bodyModel[103] = new ModelRendererTurbo(this, 56, 94, textureX, textureY); // Box 128
		bodyModel[104] = new ModelRendererTurbo(this, 56, 75, textureX, textureY); // Box 202
		bodyModel[105] = new ModelRendererTurbo(this, 362, 68, textureX, textureY); // Rear gate closed
		bodyModel[106] = new ModelRendererTurbo(this, 359, 73, textureX, textureY); // Rear gate open
		bodyModel[107] = new ModelRendererTurbo(this, 494, 197, textureX, textureY); // Box 157
		bodyModel[108] = new ModelRendererTurbo(this, 494, 229, textureX, textureY); // Box 158
		bodyModel[109] = new ModelRendererTurbo(this, 406, 158, textureX, textureY); // Box 157
		bodyModel[110] = new ModelRendererTurbo(this, 4, 161, textureX, textureY); // Box 177
		bodyModel[111] = new ModelRendererTurbo(this, 280, 158, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 280, 144, textureX, textureY); // Box 177
		bodyModel[113] = new ModelRendererTurbo(this, 275, 170, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 278, 150, textureX, textureY); // Box 177
		bodyModel[115] = new ModelRendererTurbo(this, 188, 186, textureX, textureY); // Box 128
		bodyModel[116] = new ModelRendererTurbo(this, 275, 192, textureX, textureY); // Box 128
		bodyModel[117] = new ModelRendererTurbo(this, 286, 186, textureX, textureY); // Box 128
		bodyModel[118] = new ModelRendererTurbo(this, 286, 164, textureX, textureY); // Box 176
		bodyModel[119] = new ModelRendererTurbo(this, 65, 186, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 72, 170, textureX, textureY); // Box 128
		bodyModel[121] = new ModelRendererTurbo(this, 6, 197, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 6, 175, textureX, textureY); // Box 176
		bodyModel[123] = new ModelRendererTurbo(this, 77, 15, textureX, textureY); // Box 170
		bodyModel[124] = new ModelRendererTurbo(this, 77, 19, textureX, textureY); // Box 528
		bodyModel[125] = new ModelRendererTurbo(this, 137, 170, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 495, 221, textureX, textureY); // Box 158
		bodyModel[127] = new ModelRendererTurbo(this, 408, 166, textureX, textureY); // Box 157
		bodyModel[128] = new ModelRendererTurbo(this, 401, 173, textureX, textureY); // Box 157
		bodyModel[129] = new ModelRendererTurbo(this, 88, 4, textureX, textureY); // Box 116
		bodyModel[130] = new ModelRendererTurbo(this, 77, 4, textureX, textureY); // Box 116
		bodyModel[131] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[132] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[133] = new ModelRendererTurbo(this, 452, 32, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[134] = new ModelRendererTurbo(this, 350, 49, textureX, textureY); // Box 142
		bodyModel[135] = new ModelRendererTurbo(this, 356, 46, textureX, textureY); // Right step part
		bodyModel[136] = new ModelRendererTurbo(this, 330, 49, textureX, textureY); // Box 142
		bodyModel[137] = new ModelRendererTurbo(this, 330, 46, textureX, textureY); // Right step part
		bodyModel[138] = new ModelRendererTurbo(this, 381, 49, textureX, textureY); // Box 555
		bodyModel[139] = new ModelRendererTurbo(this, 387, 46, textureX, textureY); // Box 556
		bodyModel[140] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 559
		bodyModel[141] = new ModelRendererTurbo(this, 361, 46, textureX, textureY); // Box 560
		bodyModel[142] = new ModelRendererTurbo(this, 341, 48, textureX, textureY); // Right step part
		bodyModel[143] = new ModelRendererTurbo(this, 341, 54, textureX, textureY); // Right step part
		bodyModel[144] = new ModelRendererTurbo(this, 339, 51, textureX, textureY); // Right step part
		bodyModel[145] = new ModelRendererTurbo(this, 350, 63, textureX, textureY); // Right step part
		bodyModel[146] = new ModelRendererTurbo(this, 339, 57, textureX, textureY); // Right step part
		bodyModel[147] = new ModelRendererTurbo(this, 352, 60, textureX, textureY); // Right step part
		bodyModel[148] = new ModelRendererTurbo(this, 372, 48, textureX, textureY); // Box 550
		bodyModel[149] = new ModelRendererTurbo(this, 372, 54, textureX, textureY); // Box 552
		bodyModel[150] = new ModelRendererTurbo(this, 370, 51, textureX, textureY); // Box 553
		bodyModel[151] = new ModelRendererTurbo(this, 370, 63, textureX, textureY); // Box 554
		bodyModel[152] = new ModelRendererTurbo(this, 370, 57, textureX, textureY); // Box 557
		bodyModel[153] = new ModelRendererTurbo(this, 372, 60, textureX, textureY); // Box 558
		bodyModel[154] = new ModelRendererTurbo(this, 339, 45, textureX, textureY); // Right step part
		bodyModel[155] = new ModelRendererTurbo(this, 370, 45, textureX, textureY); // Box 551
		bodyModel[156] = new ModelRendererTurbo(this, 79, 148, textureX, textureY); // Box 2
		bodyModel[157] = new ModelRendererTurbo(this, 79, 138, textureX, textureY); // Box 26
		bodyModel[158] = new ModelRendererTurbo(this, 74, 148, textureX, textureY); // Box 2
		bodyModel[159] = new ModelRendererTurbo(this, 74, 138, textureX, textureY); // Box 192
		bodyModel[160] = new ModelRendererTurbo(this, 334, 45, textureX, textureY); // Box 2
		bodyModel[161] = new ModelRendererTurbo(this, 335, 46, textureX, textureY); // Box 2
		bodyModel[162] = new ModelRendererTurbo(this, 365, 45, textureX, textureY); // Box 197
		bodyModel[163] = new ModelRendererTurbo(this, 366, 46, textureX, textureY); // Box 198
		bodyModel[164] = new ModelRendererTurbo(this, 57, 148, textureX, textureY); // Box 2
		bodyModel[165] = new ModelRendererTurbo(this, 57, 138, textureX, textureY); // Box 26
		bodyModel[166] = new ModelRendererTurbo(this, 68, 148, textureX, textureY); // Box 2
		bodyModel[167] = new ModelRendererTurbo(this, 68, 138, textureX, textureY); // Box 192
		bodyModel[168] = new ModelRendererTurbo(this, 355, 71, textureX, textureY); // Box 2
		bodyModel[169] = new ModelRendererTurbo(this, 376, 87, textureX, textureY); // Box 2
		bodyModel[170] = new ModelRendererTurbo(this, 15, 94, textureX, textureY); // Box 2
		bodyModel[171] = new ModelRendererTurbo(this, 36, 110, textureX, textureY); // Box 2
		bodyModel[172] = new ModelRendererTurbo(this, 57, 151, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[173] = new ModelRendererTurbo(this, 57, 141, textureX, textureY,"cull"); // Box 208 cull
		bodyModel[174] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[175] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[176] = new ModelRendererTurbo(this, 131, 138, textureX, textureY); // Box 341
		bodyModel[177] = new ModelRendererTurbo(this, 98, 138, textureX, textureY); // Box 341
		bodyModel[178] = new ModelRendererTurbo(this, 96, 138, textureX, textureY); // Box 52
		bodyModel[179] = new ModelRendererTurbo(this, 164, 140, textureX, textureY); // Box 52
		bodyModel[180] = new ModelRendererTurbo(this, 176, 144, textureX, textureY); // Box 41
		bodyModel[181] = new ModelRendererTurbo(this, 177, 138, textureX, textureY,"cull"); // Box 41 cull
		bodyModel[182] = new ModelRendererTurbo(this, 190, 140, textureX, textureY); // Box 52
		bodyModel[183] = new ModelRendererTurbo(this, 91, 138, textureX, textureY); // Box 52
		bodyModel[184] = new ModelRendererTurbo(this, 183, 150, textureX, textureY); // Box 273
		bodyModel[185] = new ModelRendererTurbo(this, 117, 149, textureX, textureY); // Box 2
		bodyModel[186] = new ModelRendererTurbo(this, 117, 160, textureX, textureY); // Box 2
		bodyModel[187] = new ModelRendererTurbo(this, 117, 149, textureX, textureY); // Box 276
		bodyModel[188] = new ModelRendererTurbo(this, 174, 150, textureX, textureY); // Box 276
		bodyModel[189] = new ModelRendererTurbo(this, 211, 150, textureX, textureY); // Box 278
		bodyModel[190] = new ModelRendererTurbo(this, 165, 149, textureX, textureY); // Box 41
		bodyModel[191] = new ModelRendererTurbo(this, 163, 152, textureX, textureY); // Box 41
		bodyModel[192] = new ModelRendererTurbo(this, 161, 157, textureX, textureY); // Box 341
		bodyModel[193] = new ModelRendererTurbo(this, 157, 158, textureX, textureY); // Box 341
		bodyModel[194] = new ModelRendererTurbo(this, 96, 149, textureX, textureY); // Box 276
		bodyModel[195] = new ModelRendererTurbo(this, 91, 149, textureX, textureY); // Box 276
		bodyModel[196] = new ModelRendererTurbo(this, 187, 165, textureX, textureY); // Box 41
		bodyModel[197] = new ModelRendererTurbo(this, 190, 161, textureX, textureY); // Box 41
		bodyModel[198] = new ModelRendererTurbo(this, 202, 167, textureX, textureY); // Box 41
		bodyModel[199] = new ModelRendererTurbo(this, 206, 160, textureX, textureY,"cull"); // Box 41 cull
		bodyModel[200] = new ModelRendererTurbo(this, 199, 177, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[201] = new ModelRendererTurbo(this, 192, 177, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[202] = new ModelRendererTurbo(this, 185, 177, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[203] = new ModelRendererTurbo(this, 178, 177, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[204] = new ModelRendererTurbo(this, 171, 177, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[205] = new ModelRendererTurbo(this, 164, 177, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[206] = new ModelRendererTurbo(this, 157, 177, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[207] = new ModelRendererTurbo(this, 147, 208, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[208] = new ModelRendererTurbo(this, 150, 218, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[209] = new ModelRendererTurbo(this, 153, 225, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[210] = new ModelRendererTurbo(this, 150, 215, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[211] = new ModelRendererTurbo(this, 473, 202, textureX, textureY); // Right seat part
		bodyModel[212] = new ModelRendererTurbo(this, 483, 192, textureX, textureY); // Right seat part
		bodyModel[213] = new ModelRendererTurbo(this, 473, 233, textureX, textureY); // Left seat part
		bodyModel[214] = new ModelRendererTurbo(this, 483, 223, textureX, textureY); // Left seat part
		bodyModel[215] = new ModelRendererTurbo(this, 479, 215, textureX, textureY); // Boc 42
		bodyModel[216] = new ModelRendererTurbo(this, 479, 246, textureX, textureY); // Box 638
		bodyModel[217] = new ModelRendererTurbo(this, 470, 229, textureX, textureY); // Left seat part
		bodyModel[218] = new ModelRendererTurbo(this, 470, 192, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[219] = new ModelRendererTurbo(this, 470, 209, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[220] = new ModelRendererTurbo(this, 470, 240, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[221] = new ModelRendererTurbo(this, 470, 223, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[222] = new ModelRendererTurbo(this, 449, 202, textureX, textureY); // Right seat part
		bodyModel[223] = new ModelRendererTurbo(this, 459, 192, textureX, textureY); // Right seat part
		bodyModel[224] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Left seat part
		bodyModel[225] = new ModelRendererTurbo(this, 459, 223, textureX, textureY); // Left seat part
		bodyModel[226] = new ModelRendererTurbo(this, 455, 215, textureX, textureY); // Boc 42
		bodyModel[227] = new ModelRendererTurbo(this, 455, 246, textureX, textureY); // Box 638
		bodyModel[228] = new ModelRendererTurbo(this, 446, 198, textureX, textureY); // Right seat part
		bodyModel[229] = new ModelRendererTurbo(this, 446, 215, textureX, textureY); // Right seat part
		bodyModel[230] = new ModelRendererTurbo(this, 446, 246, textureX, textureY); // Left seat part
		bodyModel[231] = new ModelRendererTurbo(this, 446, 229, textureX, textureY); // Left seat part
		bodyModel[232] = new ModelRendererTurbo(this, 446, 192, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[233] = new ModelRendererTurbo(this, 446, 209, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[234] = new ModelRendererTurbo(this, 446, 240, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[235] = new ModelRendererTurbo(this, 446, 223, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[236] = new ModelRendererTurbo(this, 425, 202, textureX, textureY); // Right seat part
		bodyModel[237] = new ModelRendererTurbo(this, 435, 192, textureX, textureY); // Right seat part
		bodyModel[238] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Left seat part
		bodyModel[239] = new ModelRendererTurbo(this, 435, 223, textureX, textureY); // Left seat part
		bodyModel[240] = new ModelRendererTurbo(this, 431, 215, textureX, textureY); // Boc 42
		bodyModel[241] = new ModelRendererTurbo(this, 431, 246, textureX, textureY); // Box 638
		bodyModel[242] = new ModelRendererTurbo(this, 422, 198, textureX, textureY); // Right seat part
		bodyModel[243] = new ModelRendererTurbo(this, 422, 215, textureX, textureY); // Right seat part
		bodyModel[244] = new ModelRendererTurbo(this, 422, 246, textureX, textureY); // Left seat part
		bodyModel[245] = new ModelRendererTurbo(this, 422, 229, textureX, textureY); // Left seat part
		bodyModel[246] = new ModelRendererTurbo(this, 422, 192, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[247] = new ModelRendererTurbo(this, 422, 209, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[248] = new ModelRendererTurbo(this, 422, 240, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[249] = new ModelRendererTurbo(this, 422, 223, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[250] = new ModelRendererTurbo(this, 401, 202, textureX, textureY); // Right seat part
		bodyModel[251] = new ModelRendererTurbo(this, 411, 192, textureX, textureY); // Right seat part
		bodyModel[252] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Left seat part
		bodyModel[253] = new ModelRendererTurbo(this, 411, 223, textureX, textureY); // Left seat part
		bodyModel[254] = new ModelRendererTurbo(this, 407, 215, textureX, textureY); // Boc 42
		bodyModel[255] = new ModelRendererTurbo(this, 407, 246, textureX, textureY); // Box 638
		bodyModel[256] = new ModelRendererTurbo(this, 398, 198, textureX, textureY); // Right seat part
		bodyModel[257] = new ModelRendererTurbo(this, 398, 215, textureX, textureY); // Right seat part
		bodyModel[258] = new ModelRendererTurbo(this, 398, 246, textureX, textureY); // Left seat part
		bodyModel[259] = new ModelRendererTurbo(this, 398, 229, textureX, textureY); // Left seat part
		bodyModel[260] = new ModelRendererTurbo(this, 398, 192, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[261] = new ModelRendererTurbo(this, 398, 209, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[262] = new ModelRendererTurbo(this, 398, 240, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[263] = new ModelRendererTurbo(this, 398, 223, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[264] = new ModelRendererTurbo(this, 377, 202, textureX, textureY); // Right seat part
		bodyModel[265] = new ModelRendererTurbo(this, 387, 192, textureX, textureY); // Right seat part
		bodyModel[266] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Left seat part
		bodyModel[267] = new ModelRendererTurbo(this, 387, 223, textureX, textureY); // Left seat part
		bodyModel[268] = new ModelRendererTurbo(this, 383, 215, textureX, textureY); // Boc 42
		bodyModel[269] = new ModelRendererTurbo(this, 383, 246, textureX, textureY); // Box 638
		bodyModel[270] = new ModelRendererTurbo(this, 374, 198, textureX, textureY); // Right seat part
		bodyModel[271] = new ModelRendererTurbo(this, 374, 215, textureX, textureY); // Right seat part
		bodyModel[272] = new ModelRendererTurbo(this, 374, 246, textureX, textureY); // Left seat part
		bodyModel[273] = new ModelRendererTurbo(this, 374, 229, textureX, textureY); // Left seat part
		bodyModel[274] = new ModelRendererTurbo(this, 374, 192, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[275] = new ModelRendererTurbo(this, 374, 209, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[276] = new ModelRendererTurbo(this, 374, 240, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[277] = new ModelRendererTurbo(this, 374, 223, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[278] = new ModelRendererTurbo(this, 353, 202, textureX, textureY); // Right seat part
		bodyModel[279] = new ModelRendererTurbo(this, 363, 192, textureX, textureY); // Right seat part
		bodyModel[280] = new ModelRendererTurbo(this, 359, 215, textureX, textureY); // Boc 42
		bodyModel[281] = new ModelRendererTurbo(this, 350, 198, textureX, textureY); // Right seat part
		bodyModel[282] = new ModelRendererTurbo(this, 350, 215, textureX, textureY); // Right seat part
		bodyModel[283] = new ModelRendererTurbo(this, 350, 192, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[284] = new ModelRendererTurbo(this, 350, 209, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[285] = new ModelRendererTurbo(this, 470, 246, textureX, textureY); // Left seat part
		bodyModel[286] = new ModelRendererTurbo(this, 470, 215, textureX, textureY); // Right seat part
		bodyModel[287] = new ModelRendererTurbo(this, 470, 198, textureX, textureY); // Right seat part
		bodyModel[288] = new ModelRendererTurbo(this, 356, 238, textureX, textureY); // Box 128
		bodyModel[289] = new ModelRendererTurbo(this, 357, 228, textureX, textureY); // Box 128
		bodyModel[290] = new ModelRendererTurbo(this, 365, 232, textureX, textureY); // Box 128
		bodyModel[291] = new ModelRendererTurbo(this, 99, 9, textureX, textureY); // Box 38
		bodyModel[292] = new ModelRendererTurbo(this, 8, 208, textureX, textureY); // Box 462
		bodyModel[293] = new ModelRendererTurbo(this, 116, 214, textureX, textureY); // Box 38
		bodyModel[294] = new ModelRendererTurbo(this, 8, 214, textureX, textureY); // Box 38
		bodyModel[295] = new ModelRendererTurbo(this, 396, 172, textureX, textureY); // Box 157
		bodyModel[296] = new ModelRendererTurbo(this, 387, 171, textureX, textureY); // Box 157
		bodyModel[297] = new ModelRendererTurbo(this, 352, 138, textureX, textureY); // Box 157
		bodyModel[298] = new ModelRendererTurbo(this, 385, 152, textureX, textureY); // Box 157
		bodyModel[299] = new ModelRendererTurbo(this, 347, 128, textureX, textureY); // Box 157
		bodyModel[300] = new ModelRendererTurbo(this, 408, 122, textureX, textureY); // Box 157
		bodyModel[301] = new ModelRendererTurbo(this, 350, 171, textureX, textureY); // Box 157
		bodyModel[302] = new ModelRendererTurbo(this, 341, 208, textureX, textureY); // Box 193
		bodyModel[303] = new ModelRendererTurbo(this, 312, 224, textureX, textureY); // Box 157
		bodyModel[304] = new ModelRendererTurbo(this, 307, 238, textureX, textureY); // Box 157
		bodyModel[305] = new ModelRendererTurbo(this, 175, 227, textureX, textureY); // Box 157
		bodyModel[306] = new ModelRendererTurbo(this, 202, 238, textureX, textureY); // Box 157
		bodyModel[307] = new ModelRendererTurbo(this, 291, 238, textureX, textureY); // Box 157
		bodyModel[308] = new ModelRendererTurbo(this, 143, 229, textureX, textureY); // Box 157
		bodyModel[309] = new ModelRendererTurbo(this, 143, 247, textureX, textureY); // Box 157
		bodyModel[310] = new ModelRendererTurbo(this, 143, 238, textureX, textureY); // Box 157
		bodyModel[311] = new ModelRendererTurbo(this, 164, 237, textureX, textureY); // Box 158
		bodyModel[312] = new ModelRendererTurbo(this, 207, 238, textureX, textureY); // Box 157
		bodyModel[313] = new ModelRendererTurbo(this, 296, 238, textureX, textureY); // Box 157
		bodyModel[314] = new ModelRendererTurbo(this, 276, 233, textureX, textureY); // Box 157
		bodyModel[315] = new ModelRendererTurbo(this, 399, 152, textureX, textureY); // Box 157
		bodyModel[316] = new ModelRendererTurbo(this, 479, 159, textureX, textureY); // Box 157
		bodyModel[317] = new ModelRendererTurbo(this, 442, 159, textureX, textureY); // Box 157
		bodyModel[318] = new ModelRendererTurbo(this, 478, 146, textureX, textureY); // Box 157
		bodyModel[319] = new ModelRendererTurbo(this, 441, 142, textureX, textureY); // Box 157
		bodyModel[320] = new ModelRendererTurbo(this, 445, 124, textureX, textureY); // Box 157
		bodyModel[321] = new ModelRendererTurbo(this, 481, 132, textureX, textureY); // Box 157
		bodyModel[322] = new ModelRendererTurbo(this, 446, 159, textureX, textureY); // Box 157
		bodyModel[323] = new ModelRendererTurbo(this, 110, 151, textureX, textureY); // Box 276
		bodyModel[324] = new ModelRendererTurbo(this, 446, 150, textureX, textureY); // Box 157
		bodyModel[325] = new ModelRendererTurbo(this, 479, 159, textureX, textureY); // Box 157
		bodyModel[326] = new ModelRendererTurbo(this, 479, 150, textureX, textureY); // Box 157
		bodyModel[327] = new ModelRendererTurbo(this, 382, 140, textureX, textureY); // Box 157
		bodyModel[328] = new ModelRendererTurbo(this, 381, 128, textureX, textureY); // Box 157
		bodyModel[329] = new ModelRendererTurbo(this, 399, 124, textureX, textureY); // Box 157
		bodyModel[330] = new ModelRendererTurbo(this, 390, 152, textureX, textureY); // Box 157
		bodyModel[331] = new ModelRendererTurbo(this, 390, 122, textureX, textureY); // Box 157
		bodyModel[332] = new ModelRendererTurbo(this, 152, 180, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[333] = new ModelRendererTurbo(this, 152, 177, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[334] = new ModelRendererTurbo(this, 356, 133, textureX, textureY); // Box 38
		bodyModel[335] = new ModelRendererTurbo(this, 359, 138, textureX, textureY); // Box 38
		bodyModel[336] = new ModelRendererTurbo(this, 358, 142, textureX, textureY); // Box 38
		bodyModel[337] = new ModelRendererTurbo(this, 370, 129, textureX, textureY); // Box 38
		bodyModel[338] = new ModelRendererTurbo(this, 370, 141, textureX, textureY); // Box 38
		bodyModel[339] = new ModelRendererTurbo(this, 290, 228, textureX, textureY); // Box 38
		bodyModel[340] = new ModelRendererTurbo(this, 328, 213, textureX, textureY); // Box 38
		bodyModel[341] = new ModelRendererTurbo(this, 331, 218, textureX, textureY); // Box 38
		bodyModel[342] = new ModelRendererTurbo(this, 330, 222, textureX, textureY); // Box 38
		bodyModel[343] = new ModelRendererTurbo(this, 250, 244, textureX, textureY); // Box 157
		bodyModel[344] = new ModelRendererTurbo(this, 249, 232, textureX, textureY); // Box 157
		bodyModel[345] = new ModelRendererTurbo(this, 237, 228, textureX, textureY); // Box 157
		bodyModel[346] = new ModelRendererTurbo(this, 249, 244, textureX, textureY); // Box 157
		bodyModel[347] = new ModelRendererTurbo(this, 249, 231, textureX, textureY); // Box 157
		bodyModel[348] = new ModelRendererTurbo(this, 228, 237, textureX, textureY); // Box 157
		bodyModel[349] = new ModelRendererTurbo(this, 303, 225, textureX, textureY); // Box 38
		bodyModel[350] = new ModelRendererTurbo(this, 300, 228, textureX, textureY); // Box 38
		bodyModel[351] = new ModelRendererTurbo(this, 305, 228, textureX, textureY); // Box 38
		bodyModel[352] = new ModelRendererTurbo(this, 312, 235, textureX, textureY); // Box 38
		bodyModel[353] = new ModelRendererTurbo(this, 310, 221, textureX, textureY); // Box 38
		bodyModel[354] = new ModelRendererTurbo(this, 310, 227, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[355] = new ModelRendererTurbo(this, 314, 217, textureX, textureY); // Box 38
		bodyModel[356] = new ModelRendererTurbo(this, 137, 177, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[357] = new ModelRendererTurbo(this, 137, 180, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[358] = new ModelRendererTurbo(this, 142, 180, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[359] = new ModelRendererTurbo(this, 147, 180, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[360] = new ModelRendererTurbo(this, 216, 177, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[361] = new ModelRendererTurbo(this, 216, 180, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[362] = new ModelRendererTurbo(this, 206, 177, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[363] = new ModelRendererTurbo(this, 206, 180, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[364] = new ModelRendererTurbo(this, 211, 180, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[365] = new ModelRendererTurbo(this, 331, 92, textureX, textureY); // Right step part
		bodyModel[366] = new ModelRendererTurbo(this, 329, 95, textureX, textureY); // Right step part
		bodyModel[367] = new ModelRendererTurbo(this, 331, 98, textureX, textureY); // Right step part
		bodyModel[368] = new ModelRendererTurbo(this, 331, 102, textureX, textureY); // Right step part
		bodyModel[369] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Right step part
		bodyModel[370] = new ModelRendererTurbo(this, 326, 96, textureX, textureY); // Right step part
		bodyModel[371] = new ModelRendererTurbo(this, 340, 96, textureX, textureY); // Right step part
		bodyModel[372] = new ModelRendererTurbo(this, 326, 98, textureX, textureY); // Right step part
		bodyModel[373] = new ModelRendererTurbo(this, 340, 98, textureX, textureY); // Right step part
		bodyModel[374] = new ModelRendererTurbo(this, 324, 84, textureX, textureY); // Box 1353
		bodyModel[375] = new ModelRendererTurbo(this, 340, 84, textureX, textureY); // Box 1354
		bodyModel[376] = new ModelRendererTurbo(this, 331, 88, textureX, textureY); // Box 1355
		bodyModel[377] = new ModelRendererTurbo(this, 329, 85, textureX, textureY); // Box 1356
		bodyModel[378] = new ModelRendererTurbo(this, 340, 81, textureX, textureY); // Box 1357
		bodyModel[379] = new ModelRendererTurbo(this, 324, 82, textureX, textureY); // Box 1358
		bodyModel[380] = new ModelRendererTurbo(this, 340, 87, textureX, textureY); // Box 1359
		bodyModel[381] = new ModelRendererTurbo(this, 324, 88, textureX, textureY); // Box 1360
		bodyModel[382] = new ModelRendererTurbo(this, 326, 93, textureX, textureY); // Right step part
		bodyModel[383] = new ModelRendererTurbo(this, 340, 93, textureX, textureY); // Right step part
		bodyModel[384] = new ModelRendererTurbo(this, 322, 58, textureX, textureY); // Box 26
		bodyModel[385] = new ModelRendererTurbo(this, 338, 59, textureX, textureY); // Box 26
		bodyModel[386] = new ModelRendererTurbo(this, 347, 63, textureX, textureY); // Box 26
		bodyModel[387] = new ModelRendererTurbo(this, 322, 56, textureX, textureY); // Box 26
		bodyModel[388] = new ModelRendererTurbo(this, 338, 62, textureX, textureY); // Box 26
		bodyModel[389] = new ModelRendererTurbo(this, 322, 62, textureX, textureY); // Box 26
		bodyModel[390] = new ModelRendererTurbo(this, 329, 77, textureX, textureY); // Left step part
		bodyModel[391] = new ModelRendererTurbo(this, 324, 68, textureX, textureY); // Left step part
		bodyModel[392] = new ModelRendererTurbo(this, 329, 67, textureX, textureY); // Left step part
		bodyModel[393] = new ModelRendererTurbo(this, 327, 70, textureX, textureY); // Left step part
		bodyModel[394] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Left step part
		bodyModel[395] = new ModelRendererTurbo(this, 338, 68, textureX, textureY); // Left step part
		bodyModel[396] = new ModelRendererTurbo(this, 327, 80, textureX, textureY); // Left step part
		bodyModel[397] = new ModelRendererTurbo(this, 338, 73, textureX, textureY); // Left step part
		bodyModel[398] = new ModelRendererTurbo(this, 324, 73, textureX, textureY); // Left step part
		bodyModel[399] = new ModelRendererTurbo(this, 338, 71, textureX, textureY); // Left step part
		bodyModel[400] = new ModelRendererTurbo(this, 324, 71, textureX, textureY); // Left step part
		bodyModel[401] = new ModelRendererTurbo(this, 329, 63, textureX, textureY); // Box 26
		bodyModel[402] = new ModelRendererTurbo(this, 327, 60, textureX, textureY); // Box 26
		bodyModel[403] = new ModelRendererTurbo(this, 83, 151, textureX, textureY); // Box 2
		bodyModel[404] = new ModelRendererTurbo(this, 324, 90, textureX, textureY); // Box 1360
		bodyModel[405] = new ModelRendererTurbo(this, 83, 141, textureX, textureY); // Box 192
		bodyModel[406] = new ModelRendererTurbo(this, 322, 64, textureX, textureY); // Box 26
		bodyModel[407] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 2
		bodyModel[408] = new ModelRendererTurbo(this, 57, 135, textureX, textureY); // Box 430
		bodyModel[409] = new ModelRendererTurbo(this, 397, 17, textureX, textureY); // Box 128
		bodyModel[410] = new ModelRendererTurbo(this, 308, 107, textureX, textureY); // Box 128
		bodyModel[411] = new ModelRendererTurbo(this, 308, 124, textureX, textureY); // Box 130
		bodyModel[412] = new ModelRendererTurbo(this, 20, 94, textureX, textureY); // Box 248
		bodyModel[413] = new ModelRendererTurbo(this, 15, 100, textureX, textureY); // Box 249
		bodyModel[414] = new ModelRendererTurbo(this, 12, 100, textureX, textureY); // Box 249
		bodyModel[415] = new ModelRendererTurbo(this, 381, 140, textureX, textureY); // Box 38
		bodyModel[416] = new ModelRendererTurbo(this, 303, 231, textureX, textureY); // Box 38
		bodyModel[417] = new ModelRendererTurbo(this, 293, 231, textureX, textureY); // Box 38
		bodyModel[418] = new ModelRendererTurbo(this, 373, 134, textureX, textureY); // Box 38
		bodyModel[419] = new ModelRendererTurbo(this, 373, 146, textureX, textureY); // Box 38
		bodyModel[420] = new ModelRendererTurbo(this, 298, 230, textureX, textureY); // Box 38
		bodyModel[421] = new ModelRendererTurbo(this, 373, 171, textureX, textureY); // Box 157
		bodyModel[422] = new ModelRendererTurbo(this, 403, 101, textureX, textureY); // Left seat part
		bodyModel[423] = new ModelRendererTurbo(this, 413, 91, textureX, textureY); // Left seat part
		bodyModel[424] = new ModelRendererTurbo(this, 409, 114, textureX, textureY); // Box 638
		bodyModel[425] = new ModelRendererTurbo(this, 400, 114, textureX, textureY); // Left seat part
		bodyModel[426] = new ModelRendererTurbo(this, 400, 97, textureX, textureY); // Left seat part
		bodyModel[427] = new ModelRendererTurbo(this, 400, 108, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[428] = new ModelRendererTurbo(this, 400, 91, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[429] = new ModelRendererTurbo(this, 403, 70, textureX, textureY); // Right seat part
		bodyModel[430] = new ModelRendererTurbo(this, 413, 60, textureX, textureY); // Right seat part
		bodyModel[431] = new ModelRendererTurbo(this, 409, 83, textureX, textureY); // Boc 42
		bodyModel[432] = new ModelRendererTurbo(this, 400, 66, textureX, textureY); // Right seat part
		bodyModel[433] = new ModelRendererTurbo(this, 400, 83, textureX, textureY); // Right seat part
		bodyModel[434] = new ModelRendererTurbo(this, 400, 60, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[435] = new ModelRendererTurbo(this, 400, 77, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[436] = new ModelRendererTurbo(this, 426, 97, textureX, textureY); // Box 158
		bodyModel[437] = new ModelRendererTurbo(this, 429, 89, textureX, textureY); // Box 158
		bodyModel[438] = new ModelRendererTurbo(this, 430, 82, textureX, textureY); // Box 158
		bodyModel[439] = new ModelRendererTurbo(this, 429, 76, textureX, textureY); // Box 158
		bodyModel[440] = new ModelRendererTurbo(this, 432, 69, textureX, textureY); // Box 158
		bodyModel[441] = new ModelRendererTurbo(this, 432, 73, textureX, textureY); // Box 158
		bodyModel[442] = new ModelRendererTurbo(this, 455, 110, textureX, textureY); // Box 158
		bodyModel[443] = new ModelRendererTurbo(this, 13, 218, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[444] = new ModelRendererTurbo(this, 16, 225, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[445] = new ModelRendererTurbo(this, 88, 9, textureX, textureY); // Box 445
		bodyModel[446] = new ModelRendererTurbo(this, 475, 101, textureX, textureY); // Left seat part
		bodyModel[447] = new ModelRendererTurbo(this, 485, 91, textureX, textureY); // Left seat part
		bodyModel[448] = new ModelRendererTurbo(this, 481, 114, textureX, textureY); // Box 638
		bodyModel[449] = new ModelRendererTurbo(this, 472, 114, textureX, textureY); // Left seat part
		bodyModel[450] = new ModelRendererTurbo(this, 472, 97, textureX, textureY); // Left seat part
		bodyModel[451] = new ModelRendererTurbo(this, 472, 108, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[452] = new ModelRendererTurbo(this, 472, 91, textureX, textureY,"cull"); // Left seat part cull

		bodyModel[0].addBox(0F, 0F, 0F, 117, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-60.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 2
		bodyModel[1].setRotationPoint(60.5F, 1F, -5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[2].setRotationPoint(60.5F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[3].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[4].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 117, 16, 1, 0F); // Box 38
		bodyModel[5].setRotationPoint(-60.5F, -15F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 117, 16, 1, 0F); // Box 128
		bodyModel[6].setRotationPoint(-60.5F, -15F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 18, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[7].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[8].setRotationPoint(60.5F, -15F, 5F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[9].setRotationPoint(-60.5F, -15F, 3F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[10].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[11].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[12].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[12].setRotationPoint(-59.49F, -14F, -3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[13].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[14].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[15].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[16].setRotationPoint(63F, -14F, -5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[17].setRotationPoint(63F, -14F, 3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[18].setRotationPoint(63F, 1F, -5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[19].setRotationPoint(63F, -16F, -5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[20].setRotationPoint(-63F, -15F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[21].setRotationPoint(-63F, 1F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[22].setRotationPoint(-63F, -14F, 3F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[23].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[24].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[25].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[26].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[27].addBox(0F, 0F, 0F, 123, 1, 6, 0F); // Box 128
		bodyModel[27].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 121, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[28].setRotationPoint(-60.5F, -20F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 121, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[29].setRotationPoint(-60.5F, -19F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 121, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[30].setRotationPoint(-60.5F, -20F, 3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 121, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[31].setRotationPoint(-60.5F, -19F, 7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[32].setRotationPoint(-60.5F, -17F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[33].setRotationPoint(-60.5F, -18F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[34].setRotationPoint(-60.5F, -19F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[35].setRotationPoint(-60.5F, -18F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[36].setRotationPoint(-60.5F, -19F, 3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 121, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[37].setRotationPoint(-60.5F, -16F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 121, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[38].setRotationPoint(-60.5F, -16F, 10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[39].setRotationPoint(55.5F, -17F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[40].setRotationPoint(55.5F, -18F, -10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[41].setRotationPoint(55.5F, -18F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[42].setRotationPoint(55.5F, -16.25F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[43].setRotationPoint(-60.5F, -16.25F, -10F);

		bodyModel[44].addBox(0F, 0F, 0F, 26, 1, 14, 0F); // Box 128
		bodyModel[44].setRotationPoint(-60.5F, -18F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[45].setRotationPoint(56.5F, -8F, -12F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[46].setRotationPoint(60.5F, -8F, -12F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[47].setRotationPoint(-60.5F, -2.5F, -12F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[48].setRotationPoint(56.5F, -8F, 11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[49].setRotationPoint(60.5F, -8F, 11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[50].setRotationPoint(-60.5F, -2.5F, 11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[51].setRotationPoint(56.5F, -14F, 10F);

		bodyModel[52].addShapeBox(0F, 0F, -1F, 5, 15, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[52].setRotationPoint(56.5F, -14F, -10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[53].setRotationPoint(-60F, -6F, -12F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[54].setRotationPoint(-60F, -6F, 11F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[55].setRotationPoint(-60.5F, 3F, -4F);

		bodyModel[56].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[56].setRotationPoint(56.5F, 3F, -4F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[57].setRotationPoint(-60.5F, -15F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[58].setRotationPoint(-63F, -14F, -4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[59].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[60].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[60].setRotationPoint(56.5F, 1F, -5F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[61].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[62].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[63].setRotationPoint(55.5F, -15F, -3F);

		bodyModel[64].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[64].setRotationPoint(55.51F, -14F, 3F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 2
		bodyModel[65].setRotationPoint(-61.5F, 1F, -4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[66].setRotationPoint(-61.5F, 1F, -9.25F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 128
		bodyModel[67].setRotationPoint(-61.5F, 1F, 4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 497
		bodyModel[68].setRotationPoint(-61.5F, 1F, 9.25F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[69].setRotationPoint(-61.25F, 1F, -10.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[70].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[71].setRotationPoint(-61.5F, -15F, -4F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Box 128
		bodyModel[72].setRotationPoint(-61.5F, -19F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.085F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -1F, -1F, 0F, -1F, -1F, 0.085F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[73].setRotationPoint(-61F, -16F, 10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[74].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.165F, 0F, 0F); // Box 128
		bodyModel[75].setRotationPoint(-61.5F, -19F, 5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.415F, 0F, 0F, -0.165F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.415F, 0.25F, 0F); // Box 128
		bodyModel[76].setRotationPoint(-61.5F, -17.25F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.165F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.165F, -0.5F, 0F); // Box 128
		bodyModel[77].setRotationPoint(-61.5F, -19.5F, 5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.165F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.415F, -1.75F, 0F, -0.165F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.415F, -0.25F, 0F); // Box 128
		bodyModel[78].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, 1.25F, 0F, 0.085F, 1.25F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0.085F, 0F, 0F); // Box 80
		bodyModel[79].setRotationPoint(-61F, -16F, -12F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[80].setRotationPoint(-61.5F, -20F, -5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[81].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.415F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.165F, 0F, 0F, -0.415F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.165F, 0.25F, 0F); // Box 83
		bodyModel[82].setRotationPoint(-61.5F, -17.25F, -10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.165F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.165F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 84
		bodyModel[83].setRotationPoint(-61.5F, -19.5F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.415F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.165F, 0F, 0F, -0.415F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.165F, -0.25F, 0F); // Box 85
		bodyModel[84].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Box 128
		bodyModel[85].setRotationPoint(60.5F, -19F, -5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, 0F, -0.415F, 1.25F, 0F, -0.5F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -0.415F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[86].setRotationPoint(60.5F, -16F, 10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[87].setRotationPoint(60.5F, -20F, 3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.165F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[88].setRotationPoint(60.5F, -19F, 5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.165F, 0F, 0F, -0.415F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.165F, 0.25F, 0F, -0.415F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[89].setRotationPoint(60.5F, -17.25F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.165F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.165F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[90].setRotationPoint(60.5F, -19.5F, 5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.165F, 0F, 0F, -0.415F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, -0.165F, -0.25F, 0F, -0.415F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[91].setRotationPoint(60.5F, -19F, 7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, -1F, -0.5F, -1F, -1F, -0.415F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.415F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[92].setRotationPoint(60.5F, -16F, -12F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[93].setRotationPoint(60.5F, -20F, -5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[94].setRotationPoint(60.5F, -19F, -7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.415F, 0F, 0F, -0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.415F, 0.25F, 0F, -0.165F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 96
		bodyModel[95].setRotationPoint(60.5F, -17.25F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.165F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.165F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 97
		bodyModel[96].setRotationPoint(60.5F, -19.5F, -7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, -0.415F, -1.75F, 0F, -0.165F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.415F, -0.25F, 0F, -0.165F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 98
		bodyModel[97].setRotationPoint(60.5F, -19F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[98].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[99].setRotationPoint(60.5F, -15F, -5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[100].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[101].setRotationPoint(-61.5F, -8F, -10.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[102].setRotationPoint(-61.5F, -8F, 10.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[103].setRotationPoint(-61.5F, -8F, -10.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 0, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[104].setRotationPoint(-61.5F, -8F, 3.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[105].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[106].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 157
		bodyModel[107].setRotationPoint(32.5F, -15F, 3F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 158
		bodyModel[108].setRotationPoint(32.5F, -15F, -10F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 157
		bodyModel[109].setRotationPoint(-35.5F, -15F, -5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 26, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[110].setRotationPoint(-60.5F, -19F, -3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 28, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[111].setRotationPoint(32.5F, -19F, -7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 28, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[112].setRotationPoint(32.5F, -19F, 3F);

		bodyModel[113].addBox(0F, 0F, 0F, 23, 1, 14, 0F); // Box 128
		bodyModel[113].setRotationPoint(32.5F, -18F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 28, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[114].setRotationPoint(32.5F, -19F, -3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 23, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[115].setRotationPoint(32.5F, -16.25F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 23, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[116].setRotationPoint(32.5F, -17F, -7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 23, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[117].setRotationPoint(32.5F, -18F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 23, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[118].setRotationPoint(32.5F, -18F, 7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 25, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[119].setRotationPoint(-59.5F, -16.25F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 25, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[120].setRotationPoint(-59.5F, -17F, -7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 25, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[121].setRotationPoint(-59.5F, -18F, -10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 25, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[122].setRotationPoint(-59.5F, -18F, 7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 170
		bodyModel[123].setRotationPoint(-34.5F, -16.85F, 9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F); // Box 528
		bodyModel[124].setRotationPoint(-34.5F, -16.85F, -10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 67, 2, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[125].setRotationPoint(-34.5F, -19F, -2F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 158
		bodyModel[126].setRotationPoint(32.5F, -15F, -3F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 157
		bodyModel[127].setRotationPoint(-35.5F, -15F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[128].setRotationPoint(-35.5F, -14F, -6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.125F, -0.575F, -0.5F, -0.125F, -0.575F, -0.5F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.525F, -0.5F, 0F, 0.525F, -0.5F); // Box 116
		bodyModel[129].setRotationPoint(53F, -20.25F, 5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.125F, -0.575F, -0.5F, -0.125F, -0.575F, -0.5F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.525F, -0.5F, 0F, 0.525F, -0.5F); // Box 116
		bodyModel[130].setRotationPoint(-59F, -20.25F, 5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right trapdoor
		bodyModel[131].setRotationPoint(56.5F, 1F, 4.99F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F); // Left trapdoor
		bodyModel[132].setRotationPoint(56.5F, 1F, -10.99F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 0, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[133].setRotationPoint(58F, -14.99F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[134].setRotationPoint(60.49F, 3F, 5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[135].setRotationPoint(60.49F, 3F, 9.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[136].setRotationPoint(56.51F, 3F, 5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[137].setRotationPoint(56.51F, 3F, 9.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 555
		bodyModel[138].setRotationPoint(60.49F, 3F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[139].setRotationPoint(60.49F, 3F, -11.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 559
		bodyModel[140].setRotationPoint(56.51F, 3F, -10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[141].setRotationPoint(56.51F, 3F, -11.5F);

		bodyModel[142].addShapeBox(0F, 2F, -2F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[142].setRotationPoint(56.51F, 0.75F, 8.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[143].setRotationPoint(56.51F, 4.5F, 8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[144].setRotationPoint(56.51F, 4.5F, 6.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[145].setRotationPoint(56.51F, 8F, 9.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[146].setRotationPoint(56.51F, 6.25F, 8F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[147].setRotationPoint(56.51F, 6.25F, 9.5F);

		bodyModel[148].addShapeBox(0F, 2F, -2F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 550
		bodyModel[148].setRotationPoint(56.51F, 0.75F, -4.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 552
		bodyModel[149].setRotationPoint(56.51F, 4.5F, -8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[150].setRotationPoint(56.51F, 4.5F, -8.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[151].setRotationPoint(56.51F, 8F, -11.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[152].setRotationPoint(56.51F, 6.25F, -10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 558
		bodyModel[153].setRotationPoint(56.51F, 6.25F, -9.5F);

		bodyModel[154].addShapeBox(0F, 2F, -2F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[154].setRotationPoint(56.5F, 0.75F, 7F);

		bodyModel[155].addShapeBox(0F, 2F, -2F, 4, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[155].setRotationPoint(56.5F, 0.75F, -5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[156].setRotationPoint(53.5F, 3F, 10.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[157].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 2
		bodyModel[158].setRotationPoint(52.5F, 3F, 10.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 192
		bodyModel[159].setRotationPoint(52.5F, 3F, -11.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[160].setRotationPoint(56.5F, 3F, 9.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F); // Box 2
		bodyModel[161].setRotationPoint(56.5F, 4F, 9.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[162].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 198
		bodyModel[163].setRotationPoint(56.5F, 4F, -11.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[164].setRotationPoint(-60.5F, 3F, 10.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[165].setRotationPoint(-60.5F, 3F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[166].setRotationPoint(-56.5F, 3F, 10.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[167].setRotationPoint(-56.5F, 3F, -11.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[168].setRotationPoint(60.51F, 3F, -10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.01F, 0F, 0F); // Box 2
		bodyModel[169].setRotationPoint(60.51F, 5F, -0.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 0, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[170].setRotationPoint(-60.51F, 3F, -10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 2
		bodyModel[171].setRotationPoint(-60.51F, 5F, -0.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull
		bodyModel[172].setRotationPoint(-60.5F, 4F, 10.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208 cull
		bodyModel[173].setRotationPoint(-60.5F, 4F, -11.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[174].setRotationPoint(42F, 4F, -1F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[175].setRotationPoint(-44F, 4F, -1F);

		bodyModel[176].addBox(0F, 0F, 0F, 11, 4, 5, 0F); // Box 341
		bodyModel[176].setRotationPoint(1.5F, 3F, 5.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 11, 4, 5, 0F); // Box 341
		bodyModel[177].setRotationPoint(-11.5F, 3F, 5.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 52
		bodyModel[178].setRotationPoint(-15.5F, 3F, 9.5F);

		bodyModel[179].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 52
		bodyModel[179].setRotationPoint(13.5F, 3F, 9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[180].setRotationPoint(19.5F, 3.25F, 9F);
		bodyModel[180].rotateAngleX = -0.78539816F;

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.005F, 0F, 0F, 0.005F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, -0.335F, 0.005F, 0F, -0.335F, 0.005F, 0F, -0.335F, -0.175F, 0F, -0.335F, -0.175F); // Box 41 cull
		bodyModel[181].setRotationPoint(20.5F, 3F, 7.59F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 52
		bodyModel[182].setRotationPoint(25.5F, 3F, 9F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 52
		bodyModel[183].setRotationPoint(-26.5F, 3F, 9F);

		bodyModel[184].addBox(0F, 0F, 0F, 11, 4, 5, 0F); // Box 273
		bodyModel[184].setRotationPoint(15.5F, 3F, -10.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 13, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[185].setRotationPoint(-13.5F, 3F, -10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 13, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[186].setRotationPoint(-13.5F, 5.5F, -10F);

		bodyModel[187].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 276
		bodyModel[187].setRotationPoint(-15.5F, 3F, -10F);

		bodyModel[188].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 276
		bodyModel[188].setRotationPoint(12.5F, 3F, -10F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 278
		bodyModel[189].setRotationPoint(26.5F, 3F, -10F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 41
		bodyModel[190].setRotationPoint(9F, 3F, -9.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 41
		bodyModel[191].setRotationPoint(8.5F, 3.2F, -9F);
		bodyModel[191].rotateAngleX = -0.78539816F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 341
		bodyModel[192].setRotationPoint(6.5F, 3.75F, -9.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 341
		bodyModel[193].setRotationPoint(5.5F, 4.25F, -9.25F);

		bodyModel[194].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 276
		bodyModel[194].setRotationPoint(-23.5F, 3F, -8.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[195].setRotationPoint(-25F, 3F, -8.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[196].setRotationPoint(21.5F, 5F, 0F);
		bodyModel[196].rotateAngleX = -0.78539816F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[197].setRotationPoint(22.5F, 4F, -0.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 41
		bodyModel[198].setRotationPoint(26.5F, 6F, 0F);
		bodyModel[198].rotateAngleX = -0.78539816F;

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41 cull
		bodyModel[199].setRotationPoint(27.5F, 4F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[200].setRotationPoint(29.5F, -17.5F, -0.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[201].setRotationPoint(19.5F, -17.5F, -0.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[202].setRotationPoint(9.5F, -17.5F, -0.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[203].setRotationPoint(-0.5F, -17.5F, -0.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[204].setRotationPoint(-10.5F, -17.5F, -0.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[205].setRotationPoint(-20.5F, -17.5F, -0.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[206].setRotationPoint(-30.5F, -17.5F, -0.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 79, 1, 5, 0F,-0.01F, 0F, 0F, -12.01F, 0F, 0F, -12.01F, 0F, -2.51F, -0.01F, 0F, -2.51F, -0.01F, 0F, 0F, -12.01F, 0F, 0F, -12.01F, 0F, -2.51F, -0.01F, 0F, -2.51F); // Box 38 cull
		bodyModel[207].setRotationPoint(-34.5F, -13F, 7.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 71, 1, 5, 0F,0F, 0F, -0.01F, -10.51F, 0F, -0.01F, -10.51F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.01F, -10.51F, 0F, -0.01F, -10.51F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 275 cull
		bodyModel[208].setRotationPoint(-28F, -13F, -10F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 71, 0, 2, 0F,0F, 0F, -0.125F, -10.51F, 0F, -0.125F, -10.51F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, -10.51F, 0F, -0.125F, -10.51F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 275 glow
		bodyModel[209].setRotationPoint(-28F, -11.99F, -9.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 79, 0, 2, 0F,-0.01F, 0F, -0.125F, -12.01F, 0F, -0.125F, -12.01F, 0F, -0.625F, -0.01F, 0F, -0.625F, -0.01F, 0F, -0.125F, -12.01F, 0F, -0.125F, -12.01F, 0F, -0.625F, -0.01F, 0F, -0.625F); // Box 285 glow
		bodyModel[210].setRotationPoint(-34.5F, -11.99F, 8F);

		bodyModel[211].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[211].setRotationPoint(22.5F, -3F, 6F);
		bodyModel[211].rotateAngleY = -3.14159265F;

		bodyModel[212].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[212].setRotationPoint(22.5F, -8F, 6F);
		bodyModel[212].rotateAngleY = -3.14159265F;

		bodyModel[213].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[213].setRotationPoint(22.5F, -3F, -6F);
		bodyModel[213].rotateAngleY = -3.14159265F;

		bodyModel[214].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[214].setRotationPoint(22.5F, -8F, -6F);
		bodyModel[214].rotateAngleY = -3.14159265F;

		bodyModel[215].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[215].setRotationPoint(21F, -1F, 4F);

		bodyModel[216].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[216].setRotationPoint(21F, -1F, -8F);

		bodyModel[217].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[217].setRotationPoint(22.5F, -3F, -6F);
		bodyModel[217].rotateAngleY = -3.14159265F;

		bodyModel[218].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[218].setRotationPoint(22.5F, -5F, 6F);
		bodyModel[218].rotateAngleY = -3.14159265F;

		bodyModel[219].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[219].setRotationPoint(22.5F, -5F, 6F);
		bodyModel[219].rotateAngleY = -3.14159265F;

		bodyModel[220].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[220].setRotationPoint(22.5F, -5F, -6F);
		bodyModel[220].rotateAngleY = -3.14159265F;

		bodyModel[221].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[221].setRotationPoint(22.5F, -5F, -6F);
		bodyModel[221].rotateAngleY = -3.14159265F;

		bodyModel[222].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[222].setRotationPoint(12.5F, -3F, 6F);
		bodyModel[222].rotateAngleY = -3.14159265F;

		bodyModel[223].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[223].setRotationPoint(12.5F, -8F, 6F);
		bodyModel[223].rotateAngleY = -3.14159265F;

		bodyModel[224].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[224].setRotationPoint(12.5F, -3F, -6F);
		bodyModel[224].rotateAngleY = -3.14159265F;

		bodyModel[225].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[225].setRotationPoint(12.5F, -8F, -6F);
		bodyModel[225].rotateAngleY = -3.14159265F;

		bodyModel[226].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[226].setRotationPoint(11F, -1F, 4F);

		bodyModel[227].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[227].setRotationPoint(11F, -1F, -8F);

		bodyModel[228].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[228].setRotationPoint(12.5F, -3F, 6F);
		bodyModel[228].rotateAngleY = -3.14159265F;

		bodyModel[229].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[229].setRotationPoint(12.5F, -3F, 6F);
		bodyModel[229].rotateAngleY = -3.14159265F;

		bodyModel[230].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[230].setRotationPoint(12.5F, -3F, -6F);
		bodyModel[230].rotateAngleY = -3.14159265F;

		bodyModel[231].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[231].setRotationPoint(12.5F, -3F, -6F);
		bodyModel[231].rotateAngleY = -3.14159265F;

		bodyModel[232].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[232].setRotationPoint(12.5F, -5F, 6F);
		bodyModel[232].rotateAngleY = -3.14159265F;

		bodyModel[233].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[233].setRotationPoint(12.5F, -5F, 6F);
		bodyModel[233].rotateAngleY = -3.14159265F;

		bodyModel[234].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[234].setRotationPoint(12.5F, -5F, -6F);
		bodyModel[234].rotateAngleY = -3.14159265F;

		bodyModel[235].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[235].setRotationPoint(12.5F, -5F, -6F);
		bodyModel[235].rotateAngleY = -3.14159265F;

		bodyModel[236].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[236].setRotationPoint(2.5F, -3F, 6F);
		bodyModel[236].rotateAngleY = -3.14159265F;

		bodyModel[237].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[237].setRotationPoint(2.5F, -8F, 6F);
		bodyModel[237].rotateAngleY = -3.14159265F;

		bodyModel[238].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[238].setRotationPoint(2.5F, -3F, -6F);
		bodyModel[238].rotateAngleY = -3.14159265F;

		bodyModel[239].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[239].setRotationPoint(2.5F, -8F, -6F);
		bodyModel[239].rotateAngleY = -3.14159265F;

		bodyModel[240].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[240].setRotationPoint(1F, -1F, 4F);

		bodyModel[241].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[241].setRotationPoint(1F, -1F, -8F);

		bodyModel[242].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[242].setRotationPoint(2.5F, -3F, 6F);
		bodyModel[242].rotateAngleY = -3.14159265F;

		bodyModel[243].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[243].setRotationPoint(2.5F, -3F, 6F);
		bodyModel[243].rotateAngleY = -3.14159265F;

		bodyModel[244].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[244].setRotationPoint(2.5F, -3F, -6F);
		bodyModel[244].rotateAngleY = -3.14159265F;

		bodyModel[245].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[245].setRotationPoint(2.5F, -3F, -6F);
		bodyModel[245].rotateAngleY = -3.14159265F;

		bodyModel[246].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[246].setRotationPoint(2.5F, -5F, 6F);
		bodyModel[246].rotateAngleY = -3.14159265F;

		bodyModel[247].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[247].setRotationPoint(2.5F, -5F, 6F);
		bodyModel[247].rotateAngleY = -3.14159265F;

		bodyModel[248].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[248].setRotationPoint(2.5F, -5F, -6F);
		bodyModel[248].rotateAngleY = -3.14159265F;

		bodyModel[249].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[249].setRotationPoint(2.5F, -5F, -6F);
		bodyModel[249].rotateAngleY = -3.14159265F;

		bodyModel[250].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[250].setRotationPoint(-7.5F, -3F, 6F);
		bodyModel[250].rotateAngleY = -3.14159265F;

		bodyModel[251].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[251].setRotationPoint(-7.5F, -8F, 6F);
		bodyModel[251].rotateAngleY = -3.14159265F;

		bodyModel[252].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[252].setRotationPoint(-7.5F, -3F, -6F);
		bodyModel[252].rotateAngleY = -3.14159265F;

		bodyModel[253].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[253].setRotationPoint(-7.5F, -8F, -6F);
		bodyModel[253].rotateAngleY = -3.14159265F;

		bodyModel[254].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[254].setRotationPoint(-9F, -1F, 4F);

		bodyModel[255].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[255].setRotationPoint(-9F, -1F, -8F);

		bodyModel[256].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[256].setRotationPoint(-7.5F, -3F, 6F);
		bodyModel[256].rotateAngleY = -3.14159265F;

		bodyModel[257].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[257].setRotationPoint(-7.5F, -3F, 6F);
		bodyModel[257].rotateAngleY = -3.14159265F;

		bodyModel[258].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[258].setRotationPoint(-7.5F, -3F, -6F);
		bodyModel[258].rotateAngleY = -3.14159265F;

		bodyModel[259].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[259].setRotationPoint(-7.5F, -3F, -6F);
		bodyModel[259].rotateAngleY = -3.14159265F;

		bodyModel[260].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[260].setRotationPoint(-7.5F, -5F, 6F);
		bodyModel[260].rotateAngleY = -3.14159265F;

		bodyModel[261].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[261].setRotationPoint(-7.5F, -5F, 6F);
		bodyModel[261].rotateAngleY = -3.14159265F;

		bodyModel[262].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[262].setRotationPoint(-7.5F, -5F, -6F);
		bodyModel[262].rotateAngleY = -3.14159265F;

		bodyModel[263].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[263].setRotationPoint(-7.5F, -5F, -6F);
		bodyModel[263].rotateAngleY = -3.14159265F;

		bodyModel[264].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[264].setRotationPoint(-17.5F, -3F, 6F);
		bodyModel[264].rotateAngleY = -3.14159265F;

		bodyModel[265].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[265].setRotationPoint(-17.5F, -8F, 6F);
		bodyModel[265].rotateAngleY = -3.14159265F;

		bodyModel[266].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[266].setRotationPoint(-17.5F, -3F, -6F);
		bodyModel[266].rotateAngleY = -3.14159265F;

		bodyModel[267].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[267].setRotationPoint(-17.5F, -8F, -6F);
		bodyModel[267].rotateAngleY = -3.14159265F;

		bodyModel[268].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[268].setRotationPoint(-19F, -1F, 4F);

		bodyModel[269].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[269].setRotationPoint(-19F, -1F, -8F);

		bodyModel[270].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[270].setRotationPoint(-17.5F, -3F, 6F);
		bodyModel[270].rotateAngleY = -3.14159265F;

		bodyModel[271].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[271].setRotationPoint(-17.5F, -3F, 6F);
		bodyModel[271].rotateAngleY = -3.14159265F;

		bodyModel[272].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[272].setRotationPoint(-17.5F, -3F, -6F);
		bodyModel[272].rotateAngleY = -3.14159265F;

		bodyModel[273].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[273].setRotationPoint(-17.5F, -3F, -6F);
		bodyModel[273].rotateAngleY = -3.14159265F;

		bodyModel[274].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[274].setRotationPoint(-17.5F, -5F, 6F);
		bodyModel[274].rotateAngleY = -3.14159265F;

		bodyModel[275].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[275].setRotationPoint(-17.5F, -5F, 6F);
		bodyModel[275].rotateAngleY = -3.14159265F;

		bodyModel[276].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[276].setRotationPoint(-17.5F, -5F, -6F);
		bodyModel[276].rotateAngleY = -3.14159265F;

		bodyModel[277].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[277].setRotationPoint(-17.5F, -5F, -6F);
		bodyModel[277].rotateAngleY = -3.14159265F;

		bodyModel[278].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[278].setRotationPoint(-27.5F, -3F, 6F);
		bodyModel[278].rotateAngleY = -3.14159265F;

		bodyModel[279].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[279].setRotationPoint(-27.5F, -8F, 6F);
		bodyModel[279].rotateAngleY = -3.14159265F;

		bodyModel[280].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[280].setRotationPoint(-29F, -1F, 4F);

		bodyModel[281].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[281].setRotationPoint(-27.5F, -3F, 6F);
		bodyModel[281].rotateAngleY = -3.14159265F;

		bodyModel[282].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[282].setRotationPoint(-27.5F, -3F, 6F);
		bodyModel[282].rotateAngleY = -3.14159265F;

		bodyModel[283].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[283].setRotationPoint(-27.5F, -5F, 6F);
		bodyModel[283].rotateAngleY = -3.14159265F;

		bodyModel[284].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[284].setRotationPoint(-27.5F, -5F, 6F);
		bodyModel[284].rotateAngleY = -3.14159265F;

		bodyModel[285].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[285].setRotationPoint(22.5F, -3F, -6F);
		bodyModel[285].rotateAngleY = -3.14159265F;

		bodyModel[286].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[286].setRotationPoint(22.5F, -3F, 6F);
		bodyModel[286].rotateAngleY = -3.14159265F;

		bodyModel[287].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[287].setRotationPoint(22.5F, -3F, 6F);
		bodyModel[287].rotateAngleY = -3.14159265F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[288].setRotationPoint(-28.5F, -6F, -10F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 0, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[289].setRotationPoint(-28F, -8F, -10F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[290].setRotationPoint(-28F, -8F, -4F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 115, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[291].setRotationPoint(-59.5F, -11F, -9.9F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 67, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[292].setRotationPoint(-34.5F, -11F, 9.9F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 15, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[293].setRotationPoint(-56.5F, -9F, -9.9F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 13, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[294].setRotationPoint(36.5F, -9F, -9.9F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[295].setRotationPoint(-36.5F, -15F, -6F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[296].setRotationPoint(-39.5F, -15F, -6F);

		bodyModel[297].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 157
		bodyModel[297].setRotationPoint(-56.5F, -15F, -5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[298].setRotationPoint(-56.5F, -15F, -6F);

		bodyModel[299].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 157
		bodyModel[299].setRotationPoint(-59.5F, -15F, 3F);

		bodyModel[300].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 157
		bodyModel[300].setRotationPoint(-46.5F, -15F, -5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 10, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[301].setRotationPoint(-55.5F, -15F, -6F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 193
		bodyModel[302].setRotationPoint(52.5F, -15F, 3F);

		bodyModel[303].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 157
		bodyModel[303].setRotationPoint(51.5F, -15F, -5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[304].setRotationPoint(51.5F, -15F, -6F);

		bodyModel[305].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 157
		bodyModel[305].setRotationPoint(36.5F, -15F, -2F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[306].setRotationPoint(36.5F, -15F, -3F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[307].setRotationPoint(46.5F, -15F, -6F);

		bodyModel[308].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 157
		bodyModel[308].setRotationPoint(33.5F, -12F, 3F);

		bodyModel[309].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 157
		bodyModel[309].setRotationPoint(33.5F, -3F, 3F);

		bodyModel[310].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 157
		bodyModel[310].setRotationPoint(33.5F, -7.5F, 3F);

		bodyModel[311].addBox(0F, 0F, 0F, 3, 16, 2, 0F); // Box 158
		bodyModel[311].setRotationPoint(33.5F, -15F, -10F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 9, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[312].setRotationPoint(37.5F, -15F, -3F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[313].setRotationPoint(47.5F, -15F, -6F);

		bodyModel[314].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 157
		bodyModel[314].setRotationPoint(46.5F, -15F, -5F);

		bodyModel[315].addBox(0F, 0F, 0F, 1, 16, 3, 0F); // Box 157
		bodyModel[315].setRotationPoint(-47.5F, -15F, -5F);

		bodyModel[316].addBox(0F, 0F, 0F, 3, 2, 10, 0F); // Box 157
		bodyModel[316].setRotationPoint(-38.5F, -1F, -0.5F);

		bodyModel[317].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 157
		bodyModel[317].setRotationPoint(-45.5F, -1F, -4.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[318].setRotationPoint(-39F, -3F, -0.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 4, 2, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[319].setRotationPoint(-45.5F, -3F, -4.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[320].setRotationPoint(-45.5F, -6F, -4.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 157
		bodyModel[321].setRotationPoint(-36.5F, -6F, -0.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 157
		bodyModel[322].setRotationPoint(-45.5F, -4.5F, -5F);

		bodyModel[323].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 276
		bodyModel[323].setRotationPoint(-22.5F, 3F, -10F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 157
		bodyModel[324].setRotationPoint(-45.5F, -4.5F, 9.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 157
		bodyModel[325].setRotationPoint(-38.5F, -4.5F, -1F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 157
		bodyModel[326].setRotationPoint(-38.5F, -4.5F, 9.5F);

		bodyModel[327].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 157
		bodyModel[327].setRotationPoint(-49.5F, -1F, 0.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[328].setRotationPoint(-50F, -3F, 0.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 157
		bodyModel[329].setRotationPoint(-47.5F, -6F, 0.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 157
		bodyModel[330].setRotationPoint(-49.5F, -4.5F, 0F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 157
		bodyModel[331].setRotationPoint(-49.5F, -4.5F, 9.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[332].setRotationPoint(-41F, -15F, -1F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[333].setRotationPoint(-41F, -15F, 5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[334].setRotationPoint(-59.6F, -2F, 8.55F);
		bodyModel[334].rotateAngleY = -0.78539816F;

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[335].setRotationPoint(-59.25F, -1F, 8.9F);
		bodyModel[335].rotateAngleY = -0.78539816F;

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[336].setRotationPoint(-59.6F, 0.5F, 8.55F);
		bodyModel[336].rotateAngleY = -0.78539816F;

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[337].setRotationPoint(-55.5F, -5F, 0F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[338].setRotationPoint(-55.5F, -5F, -4F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[339].setRotationPoint(45.5F, -5F, 8F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[340].setRotationPoint(54.2F, -2F, 9.95F);
		bodyModel[340].rotateAngleY = -2.35619449F;

		bodyModel[341].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[341].setRotationPoint(54.55F, -1F, 9.6F);
		bodyModel[341].rotateAngleY = -2.35619449F;

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[342].setRotationPoint(54.2F, 0.5F, 9.95F);
		bodyModel[342].rotateAngleY = -2.35619449F;

		bodyModel[343].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 157
		bodyModel[343].setRotationPoint(37.5F, -1F, 0.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[344].setRotationPoint(37.5F, -3F, 0.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[345].setRotationPoint(37.5F, -6F, 0.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 157
		bodyModel[346].setRotationPoint(37.5F, -4.5F, 0F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 157
		bodyModel[347].setRotationPoint(37.5F, -4.5F, 9.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[348].setRotationPoint(37.5F, -15F, -2F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[349].setRotationPoint(49.5F, -5F, 9F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[350].setRotationPoint(49.5F, -5F, 8F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[351].setRotationPoint(50.5F, -5F, 8F);

		bodyModel[352].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 38
		bodyModel[352].setRotationPoint(47.5F, -6F, -5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[353].setRotationPoint(48.5F, -3F, -3.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[354].setRotationPoint(48.5F, -2F, -3.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[355].setRotationPoint(48.5F, -6F, -1.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[356].setRotationPoint(-58.5F, -15F, -0.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[357].setRotationPoint(-58.5F, -15F, -8.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[358].setRotationPoint(-48.25F, -15F, -8.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[359].setRotationPoint(-38F, -15F, -8.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[360].setRotationPoint(53.5F, -15F, -0.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[361].setRotationPoint(53.5F, -15F, -8.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[362].setRotationPoint(34.5F, -15F, -0.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[363].setRotationPoint(34.5F, -15F, -6.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[364].setRotationPoint(44F, -15F, -8.5F);

		bodyModel[365].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[365].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[366].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[366].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[367].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[367].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[368].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[368].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[369].addShapeBox(0F, 2F, 0.5F, 4, 0, 2, 0F,0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[369].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[370].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[370].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[371].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[371].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[372].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[372].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[373].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[373].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[374].setRotationPoint(56.5F, 3F, 4.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[375].setRotationPoint(60.5F, 3F, 4.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[376].setRotationPoint(56.51F, 3F, 7F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[377].setRotationPoint(56.51F, 3F, 5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1357
		bodyModel[378].setRotationPoint(60.5F, 3F, 7.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[379].setRotationPoint(56.5F, 3F, 7.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1359
		bodyModel[380].setRotationPoint(60.5F, 4F, 7.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 1360
		bodyModel[381].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[382].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[382].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[383].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[383].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[384].setRotationPoint(56.5F, 3F, -7.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[385].setRotationPoint(60.5F, 3F, -7.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[386].setRotationPoint(60.5F, 3F, -11F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[387].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[388].setRotationPoint(60.5F, 4F, -11F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[389].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[390].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[390].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[391].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[391].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[392].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[392].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[393].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[393].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[394].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[394].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[395].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[395].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[396].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[396].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[397].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[397].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[398].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[398].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[399].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[399].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[400].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[400].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[401].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[402].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -1F, 0F, -0.75F); // Box 2
		bodyModel[403].setRotationPoint(55.5F, 4F, 10.5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1360
		bodyModel[404].setRotationPoint(56.5F, 5F, 7.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -1F, 0F, 0.25F); // Box 192
		bodyModel[405].setRotationPoint(55.5F, 4F, -11.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[406].setRotationPoint(56.5F, 5F, -10.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[407].setRotationPoint(-60.5F, 3F, 10F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 430
		bodyModel[408].setRotationPoint(-60.5F, 3F, -11F);

		bodyModel[409].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[409].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[410].setRotationPoint(56.5F, 1F, 10.75F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[411].setRotationPoint(56.5F, 1F, -10.75F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 248
		bodyModel[412].setRotationPoint(-61.5F, -12.5F, 4.5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 249
		bodyModel[413].setRotationPoint(-61.5F, -11F, 7F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[414].setRotationPoint(-61F, -10F, 7.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[415].setRotationPoint(-55.5F, -5F, -1F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[416].setRotationPoint(50.87F, -4F, 8.63F);
		bodyModel[416].rotateAngleY = 0.78539816F;

		bodyModel[417].addShapeBox(-0.25F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[417].setRotationPoint(46.5F, -4F, 9F);
		bodyModel[417].rotateAngleY = 0.78539816F;

		bodyModel[418].addShapeBox(-0.25F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[418].setRotationPoint(-54.5F, -4F, 1.5F);
		bodyModel[418].rotateAngleY = 0.78539816F;

		bodyModel[419].addShapeBox(-0.25F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[419].setRotationPoint(-54.5F, -4F, -2.5F);
		bodyModel[419].rotateAngleY = 0.78539816F;

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[420].setRotationPoint(48F, -5F, 9F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[421].setRotationPoint(-45.5F, -15F, -6F);

		bodyModel[422].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[422].setRotationPoint(-27.5F, -3F, -6F);
		bodyModel[422].rotateAngleY = -3.14159265F;

		bodyModel[423].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[423].setRotationPoint(-27.5F, -8F, -6F);
		bodyModel[423].rotateAngleY = -3.14159265F;

		bodyModel[424].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[424].setRotationPoint(-29F, -1F, -8F);

		bodyModel[425].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[425].setRotationPoint(-27.5F, -3F, -6F);
		bodyModel[425].rotateAngleY = -3.14159265F;

		bodyModel[426].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[426].setRotationPoint(-27.5F, -3F, -6F);
		bodyModel[426].rotateAngleY = -3.14159265F;

		bodyModel[427].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[427].setRotationPoint(-27.5F, -5F, -6F);
		bodyModel[427].rotateAngleY = -3.14159265F;

		bodyModel[428].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[428].setRotationPoint(-27.5F, -5F, -6F);
		bodyModel[428].rotateAngleY = -3.14159265F;

		bodyModel[429].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[429].setRotationPoint(-37.5F, -3F, 6F);
		bodyModel[429].rotateAngleY = -3.14159265F;

		bodyModel[430].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[430].setRotationPoint(-37.5F, -8F, 6F);
		bodyModel[430].rotateAngleY = -3.14159265F;

		bodyModel[431].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[431].setRotationPoint(-39F, -1F, 4F);

		bodyModel[432].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[432].setRotationPoint(-37.5F, -3F, 6F);
		bodyModel[432].rotateAngleY = -3.14159265F;

		bodyModel[433].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[433].setRotationPoint(-37.5F, -3F, 6F);
		bodyModel[433].rotateAngleY = -3.14159265F;

		bodyModel[434].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[434].setRotationPoint(-37.5F, -5F, 6F);
		bodyModel[434].rotateAngleY = -3.14159265F;

		bodyModel[435].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[435].setRotationPoint(-37.5F, -5F, 6F);
		bodyModel[435].rotateAngleY = -3.14159265F;

		bodyModel[436].addBox(0F, 0F, 0F, 7, 16, 7, 0F); // Box 158
		bodyModel[436].setRotationPoint(25.5F, -15F, -10F);

		bodyModel[437].addBox(0F, 0F, 0F, 7, 3, 4, 0F); // Box 158
		bodyModel[437].setRotationPoint(25.5F, -18F, -7F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, -1.165F, -1F, 0F, -1.165F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[438].setRotationPoint(25.5F, -18F, -10F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[439].setRotationPoint(25.5F, -19F, -7F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F); // Box 158
		bodyModel[440].setRotationPoint(25.5F, -19F, -3F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.125F, 0F, -1F, 0.125F); // Box 158
		bodyModel[441].setRotationPoint(25.5F, -17.5F, -3F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 8, 10, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, -5F, 0F); // Box 158
		bodyModel[442].setRotationPoint(26.5F, -9F, -11.01F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 63, 1, 5, 0F,0F, 0F, -0.01F, -9.51F, 0F, -0.01F, -9.51F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.01F, -9.51F, 0F, -0.01F, -9.51F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 275 cull
		bodyModel[443].setRotationPoint(-28F, -13F, -10F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 63, 0, 2, 0F,0F, 0F, -0.125F, -9.51F, 0F, -0.125F, -9.51F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, -9.51F, 0F, -0.125F, -9.51F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 275 glow
		bodyModel[444].setRotationPoint(-28F, -11.99F, -9.5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.625F, -0.5F, -0.5F, -0.625F, -0.5F, -0.5F, -0.125F, -0.575F, 0F, -0.125F, -0.575F, 0F, 0.525F, -0.5F, -0.5F, 0.525F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 445
		bodyModel[445].setRotationPoint(28F, -20.25F, -8F);

		bodyModel[446].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[446].setRotationPoint(-37.5F, -3F, -6F);
		bodyModel[446].rotateAngleY = -3.14159265F;

		bodyModel[447].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[447].setRotationPoint(-37.5F, -8F, -6F);
		bodyModel[447].rotateAngleY = -3.14159265F;

		bodyModel[448].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[448].setRotationPoint(-39F, -1F, -8F);

		bodyModel[449].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[449].setRotationPoint(-37.5F, -3F, -6F);
		bodyModel[449].rotateAngleY = -3.14159265F;

		bodyModel[450].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[450].setRotationPoint(-37.5F, -3F, -6F);
		bodyModel[450].rotateAngleY = -3.14159265F;

		bodyModel[451].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[451].setRotationPoint(-37.5F, -5F, -6F);
		bodyModel[451].rotateAngleY = -3.14159265F;

		bodyModel[452].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[452].setRotationPoint(-37.5F, -5F, -6F);
		bodyModel[452].rotateAngleY = -3.14159265F;
	}
	ModelGSC_postwar_6Wheel_LightweightTruck bogie1 = new ModelGSC_postwar_6Wheel_LightweightTruck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 453; i++)
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
		if(GetColor(entity)==0 || GetColor(entity)==2 || GetColor(entity)==4){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/GSC_postwar_6_wheel_truck_friction_no_brake_cylinder.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.69, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.38, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/GSC_postwar_6_wheel_truck_friction.png"));
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