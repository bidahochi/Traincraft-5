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

public class ModelPSBM56SeatCoach extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPSBM56SeatCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[519];

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
		bodyModel[3] = new ModelRendererTurbo(this, 347, 117, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 150, 171, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 74, 159, textureX, textureY); // Box 52
		bodyModel[10] = new ModelRendererTurbo(this, 165, 161, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 102, 152, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 102, 163, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 132, 171, textureX, textureY); // Box 59
		bodyModel[14] = new ModelRendererTurbo(this, 219, 165, textureX, textureY); // Box 41
		bodyModel[15] = new ModelRendererTurbo(this, 219, 163, textureX, textureY); // Box 41
		bodyModel[16] = new ModelRendererTurbo(this, 239, 163, textureX, textureY); // Box 41
		bodyModel[17] = new ModelRendererTurbo(this, 104, 173, textureX, textureY); // Box 41
		bodyModel[18] = new ModelRendererTurbo(this, 104, 171, textureX, textureY); // Box 41
		bodyModel[19] = new ModelRendererTurbo(this, 116, 171, textureX, textureY); // Box 41
		bodyModel[20] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[21] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[22] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[23] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[24] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[25] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[26] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[27] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[28] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[29] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[30] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[31] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[32] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[33] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[34] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[35] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[36] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[37] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[38] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[39] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[40] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[41] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[42] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[43] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[44] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 30, 8, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 72, 221, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 18, 8, textureX, textureY); // Box 176
		bodyModel[48] = new ModelRendererTurbo(this, 72, 199, textureX, textureY); // Box 177
		bodyModel[49] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[51] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[52] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[53] = new ModelRendererTurbo(this, 437, 2, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 394, 9, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 362, 9, textureX, textureY); // Box 176
		bodyModel[56] = new ModelRendererTurbo(this, 458, 1, textureX, textureY); // Box 128
		bodyModel[57] = new ModelRendererTurbo(this, 48, 3, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 72, 205, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 72, 227, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 304, 235, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 72, 232, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 72, 194, textureX, textureY); // Box 192
		bodyModel[63] = new ModelRendererTurbo(this, 72, 187, textureX, textureY); // Box 193
		bodyModel[64] = new ModelRendererTurbo(this, 72, 191, textureX, textureY); // Box 194
		bodyModel[65] = new ModelRendererTurbo(this, 74, 173, textureX, textureY); // Box 41
		bodyModel[66] = new ModelRendererTurbo(this, 74, 171, textureX, textureY); // Box 41
		bodyModel[67] = new ModelRendererTurbo(this, 100, 171, textureX, textureY); // Box 41
		bodyModel[68] = new ModelRendererTurbo(this, 120, 175, textureX, textureY); // Box 41
		bodyModel[69] = new ModelRendererTurbo(this, 120, 171, textureX, textureY); // Box 41
		bodyModel[70] = new ModelRendererTurbo(this, 128, 171, textureX, textureY); // Box 41
		bodyModel[71] = new ModelRendererTurbo(this, 182, 152, textureX, textureY); // Box 52
		bodyModel[72] = new ModelRendererTurbo(this, 182, 159, textureX, textureY); // Box 52
		bodyModel[73] = new ModelRendererTurbo(this, 208, 152, textureX, textureY); // Box 52
		bodyModel[74] = new ModelRendererTurbo(this, 296, 13, textureX, textureY); // Box 128
		bodyModel[75] = new ModelRendererTurbo(this, 300, 21, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 300, 9, textureX, textureY); // Box 199
		bodyModel[77] = new ModelRendererTurbo(this, 328, 59, textureX, textureY); // Box 199
		bodyModel[78] = new ModelRendererTurbo(this, 327, 55, textureX, textureY); // Box 199
		bodyModel[79] = new ModelRendererTurbo(this, 327, 52, textureX, textureY); // Box 199
		bodyModel[80] = new ModelRendererTurbo(this, 66, 59, textureX, textureY); // Box 199
		bodyModel[81] = new ModelRendererTurbo(this, 65, 55, textureX, textureY); // Box 199
		bodyModel[82] = new ModelRendererTurbo(this, 65, 52, textureX, textureY); // Box 199
		bodyModel[83] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 62, 84, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 74, 145, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[88] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[89] = new ModelRendererTurbo(this, 62, 103, textureX, textureY); // Box 204
		bodyModel[90] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 205
		bodyModel[91] = new ModelRendererTurbo(this, 316, 295, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 316, 267, textureX, textureY); // Box 128
		bodyModel[93] = new ModelRendererTurbo(this, 81, 295, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 81, 267, textureX, textureY); // Box 128
		bodyModel[95] = new ModelRendererTurbo(this, 368, 50, textureX, textureY); // Box 128
		bodyModel[96] = new ModelRendererTurbo(this, 382, 69, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 382, 45, textureX, textureY); // Box 185
		bodyModel[98] = new ModelRendererTurbo(this, 1, 98, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 1, 117, textureX, textureY); // Box 128
		bodyModel[100] = new ModelRendererTurbo(this, 1, 56, textureX, textureY); // Box 185
		bodyModel[101] = new ModelRendererTurbo(this, 107, 331, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[102] = new ModelRendererTurbo(this, 117, 250, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[103] = new ModelRendererTurbo(this, 117, 256, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[104] = new ModelRendererTurbo(this, 99, 267, textureX, textureY); // Right seat part
		bodyModel[105] = new ModelRendererTurbo(this, 99, 295, textureX, textureY); // Left seat part
		bodyModel[106] = new ModelRendererTurbo(this, 130, 267, textureX, textureY); // Right seat part
		bodyModel[107] = new ModelRendererTurbo(this, 130, 295, textureX, textureY); // Left seat part
		bodyModel[108] = new ModelRendererTurbo(this, 161, 267, textureX, textureY); // Right seat part
		bodyModel[109] = new ModelRendererTurbo(this, 161, 295, textureX, textureY); // Left seat part
		bodyModel[110] = new ModelRendererTurbo(this, 192, 267, textureX, textureY); // Right seat part
		bodyModel[111] = new ModelRendererTurbo(this, 192, 295, textureX, textureY); // Left seat part
		bodyModel[112] = new ModelRendererTurbo(this, 223, 267, textureX, textureY); // Right seat part
		bodyModel[113] = new ModelRendererTurbo(this, 223, 295, textureX, textureY); // Left seat part
		bodyModel[114] = new ModelRendererTurbo(this, 254, 267, textureX, textureY); // Right seat part
		bodyModel[115] = new ModelRendererTurbo(this, 254, 295, textureX, textureY); // Left seat part
		bodyModel[116] = new ModelRendererTurbo(this, 285, 267, textureX, textureY); // Right seat part
		bodyModel[117] = new ModelRendererTurbo(this, 285, 295, textureX, textureY); // Left seat part
		bodyModel[118] = new ModelRendererTurbo(this, 45, 292, textureX, textureY); // Box 128
		bodyModel[119] = new ModelRendererTurbo(this, 68, 299, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 19, 272, textureX, textureY); // Box 128
		bodyModel[121] = new ModelRendererTurbo(this, 1, 272, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 9, 272, textureX, textureY); // Box 128
		bodyModel[123] = new ModelRendererTurbo(this, 72, 271, textureX, textureY); // Box 128
		bodyModel[124] = new ModelRendererTurbo(this, 42, 242, textureX, textureY); // Box 128
		bodyModel[125] = new ModelRendererTurbo(this, 1, 251, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 1, 227, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 39, 270, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 28, 272, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 65, 248, textureX, textureY); // Box 128
		bodyModel[130] = new ModelRendererTurbo(this, 74, 250, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 345, 301, textureX, textureY); // Box 128
		bodyModel[132] = new ModelRendererTurbo(this, 369, 293, textureX, textureY); // Box 128
		bodyModel[133] = new ModelRendererTurbo(this, 454, 301, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 338, 301, textureX, textureY); // Box 128
		bodyModel[135] = new ModelRendererTurbo(this, 333, 301, textureX, textureY); // Box 128
		bodyModel[136] = new ModelRendererTurbo(this, 333, 268, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 388, 268, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 383, 273, textureX, textureY); // Box 128
		bodyModel[139] = new ModelRendererTurbo(this, 350, 267, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 350, 275, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 350, 283, textureX, textureY); // Box 128
		bodyModel[142] = new ModelRendererTurbo(this, 1, 61, textureX, textureY); // Box 128
		bodyModel[143] = new ModelRendererTurbo(this, 2, 80, textureX, textureY); // Box 128
		bodyModel[144] = new ModelRendererTurbo(this, 32, 61, textureX, textureY); // Box 128
		bodyModel[145] = new ModelRendererTurbo(this, 54, 65, textureX, textureY); // Box 128
		bodyModel[146] = new ModelRendererTurbo(this, 32, 65, textureX, textureY); // Box 128
		bodyModel[147] = new ModelRendererTurbo(this, 1, 80, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 263, 235, textureX, textureY); // Box 128
		bodyModel[149] = new ModelRendererTurbo(this, 72, 235, textureX, textureY); // Box 128
		bodyModel[150] = new ModelRendererTurbo(this, 32, 70, textureX, textureY); // Box 128
		bodyModel[151] = new ModelRendererTurbo(this, 60, 70, textureX, textureY); // Box 128
		bodyModel[152] = new ModelRendererTurbo(this, 263, 239, textureX, textureY); // Box 128
		bodyModel[153] = new ModelRendererTurbo(this, 26, 291, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[154] = new ModelRendererTurbo(this, 1, 291, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[155] = new ModelRendererTurbo(this, 20, 293, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[156] = new ModelRendererTurbo(this, 48, 214, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[157] = new ModelRendererTurbo(this, 36, 291, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[158] = new ModelRendererTurbo(this, 45, 291, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[159] = new ModelRendererTurbo(this, 30, 214, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[160] = new ModelRendererTurbo(this, 21, 214, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[161] = new ModelRendererTurbo(this, 30, 214, textureX, textureY); // Box 526
		bodyModel[162] = new ModelRendererTurbo(this, 18, 219, textureX, textureY); // Box 527
		bodyModel[163] = new ModelRendererTurbo(this, 30, 234, textureX, textureY); // Box 528
		bodyModel[164] = new ModelRendererTurbo(this, 18, 234, textureX, textureY); // Box 529
		bodyModel[165] = new ModelRendererTurbo(this, 34, 237, textureX, textureY); // Box 530
		bodyModel[166] = new ModelRendererTurbo(this, 22, 237, textureX, textureY); // Box 531
		bodyModel[167] = new ModelRendererTurbo(this, 18, 235, textureX, textureY); // Box 532
		bodyModel[168] = new ModelRendererTurbo(this, 33, 246, textureX, textureY); // Box 533
		bodyModel[169] = new ModelRendererTurbo(this, 18, 246, textureX, textureY); // Box 534
		bodyModel[170] = new ModelRendererTurbo(this, 23, 246, textureX, textureY); // Box 531
		bodyModel[171] = new ModelRendererTurbo(this, 28, 246, textureX, textureY); // Box 531
		bodyModel[172] = new ModelRendererTurbo(this, 1, 287, textureX, textureY); // Box 526
		bodyModel[173] = new ModelRendererTurbo(this, 24, 291, textureX, textureY); // Box 527
		bodyModel[174] = new ModelRendererTurbo(this, 24, 307, textureX, textureY); // Box 532
		bodyModel[175] = new ModelRendererTurbo(this, 25, 309, textureX, textureY); // Box 530
		bodyModel[176] = new ModelRendererTurbo(this, 36, 309, textureX, textureY); // Box 531
		bodyModel[177] = new ModelRendererTurbo(this, 35, 318, textureX, textureY); // Box 531
		bodyModel[178] = new ModelRendererTurbo(this, 30, 318, textureX, textureY); // Box 531
		bodyModel[179] = new ModelRendererTurbo(this, 25, 318, textureX, textureY); // Box 533
		bodyModel[180] = new ModelRendererTurbo(this, 40, 318, textureX, textureY); // Box 534
		bodyModel[181] = new ModelRendererTurbo(this, 24, 306, textureX, textureY); // Box 528
		bodyModel[182] = new ModelRendererTurbo(this, 36, 306, textureX, textureY); // Box 529
		bodyModel[183] = new ModelRendererTurbo(this, 55, 222, textureX, textureY); // Box 526
		bodyModel[184] = new ModelRendererTurbo(this, 58, 214, textureX, textureY); // Box 527
		bodyModel[185] = new ModelRendererTurbo(this, 56, 228, textureX, textureY); // Box 528
		bodyModel[186] = new ModelRendererTurbo(this, 47, 227, textureX, textureY); // Box 529
		bodyModel[187] = new ModelRendererTurbo(this, 55, 237, textureX, textureY); // Box 530
		bodyModel[188] = new ModelRendererTurbo(this, 47, 236, textureX, textureY); // Box 531
		bodyModel[189] = new ModelRendererTurbo(this, 55, 231, textureX, textureY); // Box 533
		bodyModel[190] = new ModelRendererTurbo(this, 47, 230, textureX, textureY); // Box 534
		bodyModel[191] = new ModelRendererTurbo(this, 1, 307, textureX, textureY); // Box 526
		bodyModel[192] = new ModelRendererTurbo(this, 4, 299, textureX, textureY); // Box 527
		bodyModel[193] = new ModelRendererTurbo(this, 9, 315, textureX, textureY); // Box 528
		bodyModel[194] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 529
		bodyModel[195] = new ModelRendererTurbo(this, 6, 324, textureX, textureY); // Box 530
		bodyModel[196] = new ModelRendererTurbo(this, 1, 322, textureX, textureY); // Box 531
		bodyModel[197] = new ModelRendererTurbo(this, 6, 318, textureX, textureY); // Box 533
		bodyModel[198] = new ModelRendererTurbo(this, 1, 316, textureX, textureY); // Box 534
		bodyModel[199] = new ModelRendererTurbo(this, 38, 235, textureX, textureY); // Right seat part
		bodyModel[200] = new ModelRendererTurbo(this, 40, 239, textureX, textureY); // Right seat part
		bodyModel[201] = new ModelRendererTurbo(this, 38, 246, textureX, textureY); // Right seat part
		bodyModel[202] = new ModelRendererTurbo(this, 16, 307, textureX, textureY); // Right seat part
		bodyModel[203] = new ModelRendererTurbo(this, 18, 311, textureX, textureY); // Right seat part
		bodyModel[204] = new ModelRendererTurbo(this, 16, 318, textureX, textureY); // Right seat part
		bodyModel[205] = new ModelRendererTurbo(this, 17, 258, textureX, textureY); // Box 38
		bodyModel[206] = new ModelRendererTurbo(this, 21, 255, textureX, textureY); // Box 38
		bodyModel[207] = new ModelRendererTurbo(this, 16, 255, textureX, textureY); // Box 38
		bodyModel[208] = new ModelRendererTurbo(this, 29, 255, textureX, textureY); // Box 38
		bodyModel[209] = new ModelRendererTurbo(this, 32, 261, textureX, textureY); // Box 38
		bodyModel[210] = new ModelRendererTurbo(this, 31, 265, textureX, textureY); // Box 38
		bodyModel[211] = new ModelRendererTurbo(this, 24, 264, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[212] = new ModelRendererTurbo(this, 18, 261, textureX, textureY); // Box 38
		bodyModel[213] = new ModelRendererTurbo(this, 24, 260, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[214] = new ModelRendererTurbo(this, 463, 306, textureX, textureY); // Box 38
		bodyModel[215] = new ModelRendererTurbo(this, 466, 311, textureX, textureY); // Box 38
		bodyModel[216] = new ModelRendererTurbo(this, 465, 315, textureX, textureY); // Box 38
		bodyModel[217] = new ModelRendererTurbo(this, 449, 301, textureX, textureY); // Box 128
		bodyModel[218] = new ModelRendererTurbo(this, 356, 302, textureX, textureY); // Box 128
		bodyModel[219] = new ModelRendererTurbo(this, 441, 308, textureX, textureY); // Box 38
		bodyModel[220] = new ModelRendererTurbo(this, 439, 305, textureX, textureY); // Box 38
		bodyModel[221] = new ModelRendererTurbo(this, 444, 305, textureX, textureY); // Box 38
		bodyModel[222] = new ModelRendererTurbo(this, 442, 311, textureX, textureY); // Box 38
		bodyModel[223] = new ModelRendererTurbo(this, 441, 300, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[224] = new ModelRendererTurbo(this, 390, 303, textureX, textureY); // Box 526
		bodyModel[225] = new ModelRendererTurbo(this, 390, 291, textureX, textureY); // Box 527
		bodyModel[226] = new ModelRendererTurbo(this, 395, 312, textureX, textureY); // Box 528
		bodyModel[227] = new ModelRendererTurbo(this, 395, 322, textureX, textureY); // Box 529
		bodyModel[228] = new ModelRendererTurbo(this, 396, 315, textureX, textureY); // Box 530
		bodyModel[229] = new ModelRendererTurbo(this, 396, 325, textureX, textureY); // Box 531
		bodyModel[230] = new ModelRendererTurbo(this, 403, 300, textureX, textureY); // Box 532
		bodyModel[231] = new ModelRendererTurbo(this, 390, 312, textureX, textureY); // Box 533
		bodyModel[232] = new ModelRendererTurbo(this, 390, 316, textureX, textureY); // Box 534
		bodyModel[233] = new ModelRendererTurbo(this, 409, 308, textureX, textureY); // Box 526
		bodyModel[234] = new ModelRendererTurbo(this, 435, 314, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[235] = new ModelRendererTurbo(this, 418, 300, textureX, textureY); // Box 38
		bodyModel[236] = new ModelRendererTurbo(this, 418, 311, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[237] = new ModelRendererTurbo(this, 418, 306, textureX, textureY); // Box 38
		bodyModel[238] = new ModelRendererTurbo(this, 421, 293, textureX, textureY); // Box 38
		bodyModel[239] = new ModelRendererTurbo(this, 421, 297, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[240] = new ModelRendererTurbo(this, 423, 289, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[241] = new ModelRendererTurbo(this, 423, 287, textureX, textureY); // Box 38
		bodyModel[242] = new ModelRendererTurbo(this, 419, 281, textureX, textureY); // Box 38
		bodyModel[243] = new ModelRendererTurbo(this, 429, 281, textureX, textureY); // Box 38
		bodyModel[244] = new ModelRendererTurbo(this, 424, 282, textureX, textureY); // Box 38
		bodyModel[245] = new ModelRendererTurbo(this, 72, 340, textureX, textureY); // Box 38
		bodyModel[246] = new ModelRendererTurbo(this, 72, 334, textureX, textureY); // Box 462
		bodyModel[247] = new ModelRendererTurbo(this, 58, 297, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[248] = new ModelRendererTurbo(this, 154, 64, textureX, textureY); // Box 38
		bodyModel[249] = new ModelRendererTurbo(this, 96, 66, textureX, textureY); // Box 38
		bodyModel[250] = new ModelRendererTurbo(this, 154, 23, textureX, textureY); // Box 451
		bodyModel[251] = new ModelRendererTurbo(this, 96, 21, textureX, textureY); // Box 452
		bodyModel[252] = new ModelRendererTurbo(this, 431, 18, textureX, textureY); // Box 128
		bodyModel[253] = new ModelRendererTurbo(this, 437, 35, textureX, textureY); // Box 128
		bodyModel[254] = new ModelRendererTurbo(this, 387, 2, textureX, textureY); // Box 128
		bodyModel[255] = new ModelRendererTurbo(this, 430, 2, textureX, textureY); // Box 128
		bodyModel[256] = new ModelRendererTurbo(this, 416, 1, textureX, textureY); // Box 128
		bodyModel[257] = new ModelRendererTurbo(this, 423, 1, textureX, textureY); // Box 128
		bodyModel[258] = new ModelRendererTurbo(this, 446, 23, textureX, textureY); // Box 128
		bodyModel[259] = new ModelRendererTurbo(this, 424, 35, textureX, textureY); // Box 128
		bodyModel[260] = new ModelRendererTurbo(this, 426, 19, textureX, textureY); // Box 128
		bodyModel[261] = new ModelRendererTurbo(this, 444, 19, textureX, textureY); // Box 153
		bodyModel[262] = new ModelRendererTurbo(this, 22, 43, textureX, textureY); // Box 128
		bodyModel[263] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[264] = new ModelRendererTurbo(this, 71, 2, textureX, textureY); // Box 128
		bodyModel[265] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[266] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 128
		bodyModel[267] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 128
		bodyModel[268] = new ModelRendererTurbo(this, 33, 45, textureX, textureY); // Box 128
		bodyModel[269] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[270] = new ModelRendererTurbo(this, 17, 42, textureX, textureY); // Box 128
		bodyModel[271] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[272] = new ModelRendererTurbo(this, 256, 148, textureX, textureY); // Box 2
		bodyModel[273] = new ModelRendererTurbo(this, 259, 151, textureX, textureY); // Box 2
		bodyModel[274] = new ModelRendererTurbo(this, 74, 151, textureX, textureY); // Box 2
		bodyModel[275] = new ModelRendererTurbo(this, 74, 148, textureX, textureY); // Box 2
		bodyModel[276] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[277] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[278] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[279] = new ModelRendererTurbo(this, 245, 151, textureX, textureY); // Box 2
		bodyModel[280] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[281] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[282] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[283] = new ModelRendererTurbo(this, 109, 145, textureX, textureY); // Box 2
		bodyModel[284] = new ModelRendererTurbo(this, 262, 138, textureX, textureY); // Box 28
		bodyModel[285] = new ModelRendererTurbo(this, 265, 141, textureX, textureY); // Box 29
		bodyModel[286] = new ModelRendererTurbo(this, 74, 141, textureX, textureY); // Box 30
		bodyModel[287] = new ModelRendererTurbo(this, 74, 138, textureX, textureY); // Box 31
		bodyModel[288] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[289] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[290] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[291] = new ModelRendererTurbo(this, 251, 141, textureX, textureY); // Box 35
		bodyModel[292] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[293] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[294] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[295] = new ModelRendererTurbo(this, 114, 141, textureX, textureY); // Box 39
		bodyModel[296] = new ModelRendererTurbo(this, 261, 148, textureX, textureY); // Box 2
		bodyModel[297] = new ModelRendererTurbo(this, 267, 138, textureX, textureY); // Box 41
		bodyModel[298] = new ModelRendererTurbo(this, 275, 148, textureX, textureY); // Box 2
		bodyModel[299] = new ModelRendererTurbo(this, 275, 151, textureX, textureY); // Box 2
		bodyModel[300] = new ModelRendererTurbo(this, 266, 148, textureX, textureY); // Box 2
		bodyModel[301] = new ModelRendererTurbo(this, 266, 151, textureX, textureY); // Box 2
		bodyModel[302] = new ModelRendererTurbo(this, 281, 138, textureX, textureY); // Box 24
		bodyModel[303] = new ModelRendererTurbo(this, 281, 141, textureX, textureY); // Box 25
		bodyModel[304] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 26
		bodyModel[305] = new ModelRendererTurbo(this, 272, 141, textureX, textureY); // Box 27
		bodyModel[306] = new ModelRendererTurbo(this, 283, 285, textureX, textureY); // Boc 42
		bodyModel[307] = new ModelRendererTurbo(this, 252, 285, textureX, textureY); // Boc 42
		bodyModel[308] = new ModelRendererTurbo(this, 221, 285, textureX, textureY); // Boc 42
		bodyModel[309] = new ModelRendererTurbo(this, 190, 285, textureX, textureY); // Boc 42
		bodyModel[310] = new ModelRendererTurbo(this, 159, 285, textureX, textureY); // Boc 42
		bodyModel[311] = new ModelRendererTurbo(this, 128, 285, textureX, textureY); // Boc 42
		bodyModel[312] = new ModelRendererTurbo(this, 97, 285, textureX, textureY); // Boc 42
		bodyModel[313] = new ModelRendererTurbo(this, 252, 313, textureX, textureY); // Boc 42
		bodyModel[314] = new ModelRendererTurbo(this, 221, 313, textureX, textureY); // Boc 42
		bodyModel[315] = new ModelRendererTurbo(this, 190, 313, textureX, textureY); // Boc 42
		bodyModel[316] = new ModelRendererTurbo(this, 159, 313, textureX, textureY); // Boc 42
		bodyModel[317] = new ModelRendererTurbo(this, 128, 313, textureX, textureY); // Boc 42
		bodyModel[318] = new ModelRendererTurbo(this, 97, 313, textureX, textureY); // Boc 42
		bodyModel[319] = new ModelRendererTurbo(this, 283, 313, textureX, textureY); // Box 638
		bodyModel[320] = new ModelRendererTurbo(this, 110, 267, textureX, textureY); // Right seat part
		bodyModel[321] = new ModelRendererTurbo(this, 110, 295, textureX, textureY); // Left seat part
		bodyModel[322] = new ModelRendererTurbo(this, 141, 267, textureX, textureY); // Right seat part
		bodyModel[323] = new ModelRendererTurbo(this, 141, 295, textureX, textureY); // Left seat part
		bodyModel[324] = new ModelRendererTurbo(this, 172, 267, textureX, textureY); // Right seat part
		bodyModel[325] = new ModelRendererTurbo(this, 172, 295, textureX, textureY); // Left seat part
		bodyModel[326] = new ModelRendererTurbo(this, 203, 295, textureX, textureY); // Left seat part
		bodyModel[327] = new ModelRendererTurbo(this, 234, 267, textureX, textureY); // Right seat part
		bodyModel[328] = new ModelRendererTurbo(this, 234, 295, textureX, textureY); // Left seat part
		bodyModel[329] = new ModelRendererTurbo(this, 265, 267, textureX, textureY); // Right seat part
		bodyModel[330] = new ModelRendererTurbo(this, 265, 295, textureX, textureY); // Left seat part
		bodyModel[331] = new ModelRendererTurbo(this, 296, 274, textureX, textureY); // Right seat part
		bodyModel[332] = new ModelRendererTurbo(this, 296, 267, textureX, textureY); // Right seat part
		bodyModel[333] = new ModelRendererTurbo(this, 301, 277, textureX, textureY); // Right seat part
		bodyModel[334] = new ModelRendererTurbo(this, 303, 274, textureX, textureY); // Right seat part
		bodyModel[335] = new ModelRendererTurbo(this, 296, 277, textureX, textureY); // Right seat part
		bodyModel[336] = new ModelRendererTurbo(this, 310, 274, textureX, textureY); // Right seat part
		bodyModel[337] = new ModelRendererTurbo(this, 296, 282, textureX, textureY); // Right seat part
		bodyModel[338] = new ModelRendererTurbo(this, 301, 285, textureX, textureY); // Right seat part
		bodyModel[339] = new ModelRendererTurbo(this, 303, 282, textureX, textureY); // Right seat part
		bodyModel[340] = new ModelRendererTurbo(this, 296, 285, textureX, textureY); // Right seat part
		bodyModel[341] = new ModelRendererTurbo(this, 310, 282, textureX, textureY); // Right seat part
		bodyModel[342] = new ModelRendererTurbo(this, 265, 274, textureX, textureY); // Right seat part
		bodyModel[343] = new ModelRendererTurbo(this, 270, 277, textureX, textureY); // Right seat part
		bodyModel[344] = new ModelRendererTurbo(this, 272, 274, textureX, textureY); // Right seat part
		bodyModel[345] = new ModelRendererTurbo(this, 265, 277, textureX, textureY); // Right seat part
		bodyModel[346] = new ModelRendererTurbo(this, 279, 274, textureX, textureY); // Right seat part
		bodyModel[347] = new ModelRendererTurbo(this, 265, 282, textureX, textureY); // Right seat part
		bodyModel[348] = new ModelRendererTurbo(this, 270, 285, textureX, textureY); // Right seat part
		bodyModel[349] = new ModelRendererTurbo(this, 272, 282, textureX, textureY); // Right seat part
		bodyModel[350] = new ModelRendererTurbo(this, 265, 285, textureX, textureY); // Right seat part
		bodyModel[351] = new ModelRendererTurbo(this, 279, 282, textureX, textureY); // Right seat part
		bodyModel[352] = new ModelRendererTurbo(this, 234, 274, textureX, textureY); // Right seat part
		bodyModel[353] = new ModelRendererTurbo(this, 239, 277, textureX, textureY); // Right seat part
		bodyModel[354] = new ModelRendererTurbo(this, 241, 274, textureX, textureY); // Right seat part
		bodyModel[355] = new ModelRendererTurbo(this, 234, 277, textureX, textureY); // Right seat part
		bodyModel[356] = new ModelRendererTurbo(this, 248, 274, textureX, textureY); // Right seat part
		bodyModel[357] = new ModelRendererTurbo(this, 234, 282, textureX, textureY); // Right seat part
		bodyModel[358] = new ModelRendererTurbo(this, 239, 285, textureX, textureY); // Right seat part
		bodyModel[359] = new ModelRendererTurbo(this, 241, 282, textureX, textureY); // Right seat part
		bodyModel[360] = new ModelRendererTurbo(this, 234, 285, textureX, textureY); // Right seat part
		bodyModel[361] = new ModelRendererTurbo(this, 248, 282, textureX, textureY); // Right seat part
		bodyModel[362] = new ModelRendererTurbo(this, 203, 274, textureX, textureY); // Right seat part
		bodyModel[363] = new ModelRendererTurbo(this, 208, 277, textureX, textureY); // Right seat part
		bodyModel[364] = new ModelRendererTurbo(this, 210, 274, textureX, textureY); // Right seat part
		bodyModel[365] = new ModelRendererTurbo(this, 203, 277, textureX, textureY); // Right seat part
		bodyModel[366] = new ModelRendererTurbo(this, 217, 274, textureX, textureY); // Right seat part
		bodyModel[367] = new ModelRendererTurbo(this, 203, 282, textureX, textureY); // Right seat part
		bodyModel[368] = new ModelRendererTurbo(this, 208, 285, textureX, textureY); // Right seat part
		bodyModel[369] = new ModelRendererTurbo(this, 210, 282, textureX, textureY); // Right seat part
		bodyModel[370] = new ModelRendererTurbo(this, 203, 285, textureX, textureY); // Right seat part
		bodyModel[371] = new ModelRendererTurbo(this, 217, 282, textureX, textureY); // Right seat part
		bodyModel[372] = new ModelRendererTurbo(this, 172, 274, textureX, textureY); // Right seat part
		bodyModel[373] = new ModelRendererTurbo(this, 177, 277, textureX, textureY); // Right seat part
		bodyModel[374] = new ModelRendererTurbo(this, 179, 274, textureX, textureY); // Right seat part
		bodyModel[375] = new ModelRendererTurbo(this, 172, 277, textureX, textureY); // Right seat part
		bodyModel[376] = new ModelRendererTurbo(this, 186, 274, textureX, textureY); // Right seat part
		bodyModel[377] = new ModelRendererTurbo(this, 172, 282, textureX, textureY); // Right seat part
		bodyModel[378] = new ModelRendererTurbo(this, 177, 285, textureX, textureY); // Right seat part
		bodyModel[379] = new ModelRendererTurbo(this, 179, 282, textureX, textureY); // Right seat part
		bodyModel[380] = new ModelRendererTurbo(this, 172, 285, textureX, textureY); // Right seat part
		bodyModel[381] = new ModelRendererTurbo(this, 186, 282, textureX, textureY); // Right seat part
		bodyModel[382] = new ModelRendererTurbo(this, 141, 274, textureX, textureY); // Right seat part
		bodyModel[383] = new ModelRendererTurbo(this, 146, 277, textureX, textureY); // Right seat part
		bodyModel[384] = new ModelRendererTurbo(this, 148, 274, textureX, textureY); // Right seat part
		bodyModel[385] = new ModelRendererTurbo(this, 141, 277, textureX, textureY); // Right seat part
		bodyModel[386] = new ModelRendererTurbo(this, 155, 274, textureX, textureY); // Right seat part
		bodyModel[387] = new ModelRendererTurbo(this, 141, 282, textureX, textureY); // Right seat part
		bodyModel[388] = new ModelRendererTurbo(this, 146, 285, textureX, textureY); // Right seat part
		bodyModel[389] = new ModelRendererTurbo(this, 148, 282, textureX, textureY); // Right seat part
		bodyModel[390] = new ModelRendererTurbo(this, 141, 285, textureX, textureY); // Right seat part
		bodyModel[391] = new ModelRendererTurbo(this, 155, 282, textureX, textureY); // Right seat part
		bodyModel[392] = new ModelRendererTurbo(this, 110, 274, textureX, textureY); // Right seat part
		bodyModel[393] = new ModelRendererTurbo(this, 115, 277, textureX, textureY); // Right seat part
		bodyModel[394] = new ModelRendererTurbo(this, 117, 274, textureX, textureY); // Right seat part
		bodyModel[395] = new ModelRendererTurbo(this, 110, 277, textureX, textureY); // Right seat part
		bodyModel[396] = new ModelRendererTurbo(this, 124, 274, textureX, textureY); // Right seat part
		bodyModel[397] = new ModelRendererTurbo(this, 110, 282, textureX, textureY); // Right seat part
		bodyModel[398] = new ModelRendererTurbo(this, 115, 285, textureX, textureY); // Right seat part
		bodyModel[399] = new ModelRendererTurbo(this, 117, 282, textureX, textureY); // Right seat part
		bodyModel[400] = new ModelRendererTurbo(this, 110, 285, textureX, textureY); // Right seat part
		bodyModel[401] = new ModelRendererTurbo(this, 124, 282, textureX, textureY); // Right seat part
		bodyModel[402] = new ModelRendererTurbo(this, 265, 302, textureX, textureY); // Left seat part
		bodyModel[403] = new ModelRendererTurbo(this, 270, 305, textureX, textureY); // Left seat part
		bodyModel[404] = new ModelRendererTurbo(this, 272, 302, textureX, textureY); // Left seat part
		bodyModel[405] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Left seat part
		bodyModel[406] = new ModelRendererTurbo(this, 279, 302, textureX, textureY); // Left seat part
		bodyModel[407] = new ModelRendererTurbo(this, 265, 310, textureX, textureY); // Left seat part
		bodyModel[408] = new ModelRendererTurbo(this, 270, 313, textureX, textureY); // Left seat part
		bodyModel[409] = new ModelRendererTurbo(this, 272, 310, textureX, textureY); // Left seat part
		bodyModel[410] = new ModelRendererTurbo(this, 265, 313, textureX, textureY); // Left seat part
		bodyModel[411] = new ModelRendererTurbo(this, 279, 310, textureX, textureY); // Left seat part
		bodyModel[412] = new ModelRendererTurbo(this, 234, 302, textureX, textureY); // Left seat part
		bodyModel[413] = new ModelRendererTurbo(this, 239, 305, textureX, textureY); // Left seat part
		bodyModel[414] = new ModelRendererTurbo(this, 241, 302, textureX, textureY); // Left seat part
		bodyModel[415] = new ModelRendererTurbo(this, 234, 305, textureX, textureY); // Left seat part
		bodyModel[416] = new ModelRendererTurbo(this, 248, 302, textureX, textureY); // Left seat part
		bodyModel[417] = new ModelRendererTurbo(this, 234, 310, textureX, textureY); // Left seat part
		bodyModel[418] = new ModelRendererTurbo(this, 239, 313, textureX, textureY); // Left seat part
		bodyModel[419] = new ModelRendererTurbo(this, 241, 310, textureX, textureY); // Left seat part
		bodyModel[420] = new ModelRendererTurbo(this, 234, 313, textureX, textureY); // Left seat part
		bodyModel[421] = new ModelRendererTurbo(this, 248, 310, textureX, textureY); // Left seat part
		bodyModel[422] = new ModelRendererTurbo(this, 203, 302, textureX, textureY); // Left seat part
		bodyModel[423] = new ModelRendererTurbo(this, 208, 305, textureX, textureY); // Left seat part
		bodyModel[424] = new ModelRendererTurbo(this, 210, 302, textureX, textureY); // Left seat part
		bodyModel[425] = new ModelRendererTurbo(this, 203, 305, textureX, textureY); // Left seat part
		bodyModel[426] = new ModelRendererTurbo(this, 217, 302, textureX, textureY); // Left seat part
		bodyModel[427] = new ModelRendererTurbo(this, 203, 310, textureX, textureY); // Left seat part
		bodyModel[428] = new ModelRendererTurbo(this, 208, 313, textureX, textureY); // Left seat part
		bodyModel[429] = new ModelRendererTurbo(this, 210, 310, textureX, textureY); // Left seat part
		bodyModel[430] = new ModelRendererTurbo(this, 203, 313, textureX, textureY); // Left seat part
		bodyModel[431] = new ModelRendererTurbo(this, 217, 310, textureX, textureY); // Left seat part
		bodyModel[432] = new ModelRendererTurbo(this, 172, 302, textureX, textureY); // Left seat part
		bodyModel[433] = new ModelRendererTurbo(this, 177, 305, textureX, textureY); // Left seat part
		bodyModel[434] = new ModelRendererTurbo(this, 179, 302, textureX, textureY); // Left seat part
		bodyModel[435] = new ModelRendererTurbo(this, 172, 305, textureX, textureY); // Left seat part
		bodyModel[436] = new ModelRendererTurbo(this, 186, 302, textureX, textureY); // Left seat part
		bodyModel[437] = new ModelRendererTurbo(this, 172, 310, textureX, textureY); // Left seat part
		bodyModel[438] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Left seat part
		bodyModel[439] = new ModelRendererTurbo(this, 179, 310, textureX, textureY); // Left seat part
		bodyModel[440] = new ModelRendererTurbo(this, 172, 313, textureX, textureY); // Left seat part
		bodyModel[441] = new ModelRendererTurbo(this, 186, 310, textureX, textureY); // Left seat part
		bodyModel[442] = new ModelRendererTurbo(this, 141, 302, textureX, textureY); // Left seat part
		bodyModel[443] = new ModelRendererTurbo(this, 146, 305, textureX, textureY); // Left seat part
		bodyModel[444] = new ModelRendererTurbo(this, 148, 302, textureX, textureY); // Left seat part
		bodyModel[445] = new ModelRendererTurbo(this, 141, 305, textureX, textureY); // Left seat part
		bodyModel[446] = new ModelRendererTurbo(this, 155, 302, textureX, textureY); // Left seat part
		bodyModel[447] = new ModelRendererTurbo(this, 141, 310, textureX, textureY); // Left seat part
		bodyModel[448] = new ModelRendererTurbo(this, 146, 313, textureX, textureY); // Left seat part
		bodyModel[449] = new ModelRendererTurbo(this, 148, 310, textureX, textureY); // Left seat part
		bodyModel[450] = new ModelRendererTurbo(this, 141, 313, textureX, textureY); // Left seat part
		bodyModel[451] = new ModelRendererTurbo(this, 155, 310, textureX, textureY); // Left seat part
		bodyModel[452] = new ModelRendererTurbo(this, 110, 302, textureX, textureY); // Left seat part
		bodyModel[453] = new ModelRendererTurbo(this, 115, 305, textureX, textureY); // Left seat part
		bodyModel[454] = new ModelRendererTurbo(this, 117, 302, textureX, textureY); // Left seat part
		bodyModel[455] = new ModelRendererTurbo(this, 110, 305, textureX, textureY); // Left seat part
		bodyModel[456] = new ModelRendererTurbo(this, 124, 302, textureX, textureY); // Left seat part
		bodyModel[457] = new ModelRendererTurbo(this, 110, 310, textureX, textureY); // Left seat part
		bodyModel[458] = new ModelRendererTurbo(this, 115, 313, textureX, textureY); // Left seat part
		bodyModel[459] = new ModelRendererTurbo(this, 117, 310, textureX, textureY); // Left seat part
		bodyModel[460] = new ModelRendererTurbo(this, 110, 313, textureX, textureY); // Left seat part
		bodyModel[461] = new ModelRendererTurbo(this, 124, 310, textureX, textureY); // Left seat part
		bodyModel[462] = new ModelRendererTurbo(this, 203, 267, textureX, textureY); // Right seat part
		bodyModel[463] = new ModelRendererTurbo(this, 296, 295, textureX, textureY); // Left seat part
		bodyModel[464] = new ModelRendererTurbo(this, 296, 302, textureX, textureY); // Left seat part
		bodyModel[465] = new ModelRendererTurbo(this, 301, 305, textureX, textureY); // Left seat part
		bodyModel[466] = new ModelRendererTurbo(this, 303, 302, textureX, textureY); // Left seat part
		bodyModel[467] = new ModelRendererTurbo(this, 296, 305, textureX, textureY); // Left seat part
		bodyModel[468] = new ModelRendererTurbo(this, 310, 302, textureX, textureY); // Left seat part
		bodyModel[469] = new ModelRendererTurbo(this, 296, 310, textureX, textureY); // Left seat part
		bodyModel[470] = new ModelRendererTurbo(this, 301, 313, textureX, textureY); // Left seat part
		bodyModel[471] = new ModelRendererTurbo(this, 303, 310, textureX, textureY); // Left seat part
		bodyModel[472] = new ModelRendererTurbo(this, 296, 313, textureX, textureY); // Left seat part
		bodyModel[473] = new ModelRendererTurbo(this, 310, 310, textureX, textureY); // Left seat part
		bodyModel[474] = new ModelRendererTurbo(this, 118, 246, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[475] = new ModelRendererTurbo(this, 118, 262, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[476] = new ModelRendererTurbo(this, 258, 331, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[477] = new ModelRendererTurbo(this, 308, 132, textureX, textureY); // Box 2
		bodyModel[478] = new ModelRendererTurbo(this, 34, 124, textureX, textureY); // Box 2
		bodyModel[479] = new ModelRendererTurbo(this, 324, 62, textureX, textureY); // Box 26
		bodyModel[480] = new ModelRendererTurbo(this, 340, 62, textureX, textureY); // Box 26
		bodyModel[481] = new ModelRendererTurbo(this, 340, 60, textureX, textureY); // Box 26
		bodyModel[482] = new ModelRendererTurbo(this, 324, 60, textureX, textureY); // Box 26
		bodyModel[483] = new ModelRendererTurbo(this, 340, 66, textureX, textureY); // Box 26
		bodyModel[484] = new ModelRendererTurbo(this, 324, 66, textureX, textureY); // Box 26
		bodyModel[485] = new ModelRendererTurbo(this, 329, 63, textureX, textureY); // Box 26
		bodyModel[486] = new ModelRendererTurbo(this, 331, 66, textureX, textureY); // Box 26
		bodyModel[487] = new ModelRendererTurbo(this, 331, 80, textureX, textureY); // Left step part
		bodyModel[488] = new ModelRendererTurbo(this, 331, 76, textureX, textureY); // Left step part
		bodyModel[489] = new ModelRendererTurbo(this, 331, 70, textureX, textureY); // Left step part
		bodyModel[490] = new ModelRendererTurbo(this, 340, 76, textureX, textureY); // Left step part
		bodyModel[491] = new ModelRendererTurbo(this, 326, 76, textureX, textureY); // Left step part
		bodyModel[492] = new ModelRendererTurbo(this, 340, 74, textureX, textureY); // Left step part
		bodyModel[493] = new ModelRendererTurbo(this, 326, 74, textureX, textureY); // Left step part
		bodyModel[494] = new ModelRendererTurbo(this, 326, 71, textureX, textureY); // Left step part
		bodyModel[495] = new ModelRendererTurbo(this, 340, 71, textureX, textureY); // Left step part
		bodyModel[496] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Left step part
		bodyModel[497] = new ModelRendererTurbo(this, 329, 83, textureX, textureY); // Left step part
		bodyModel[498] = new ModelRendererTurbo(this, 324, 86, textureX, textureY); // Box 1353
		bodyModel[499] = new ModelRendererTurbo(this, 340, 86, textureX, textureY); // Box 1354

		bodyModel[0].addBox(0F, 0F, 0F, 118, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-61.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(60.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(56.5F, 1F, -5F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[3].setRotationPoint(60.5F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[4].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[5].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[6].setRotationPoint(43F, 4F, -1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[7].setRotationPoint(-45F, 4F, -1F);

		bodyModel[8].addBox(0F, 0F, 0F, 11, 5, 5, 0F); // Box 2
		bodyModel[8].setRotationPoint(8.5F, 3F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 52
		bodyModel[9].setRotationPoint(-30.5F, 3F, 4F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 2
		bodyModel[10].setRotationPoint(5.5F, 3F, 3F);

		bodyModel[11].addBox(0F, 0F, 0F, 25, 4, 6, 0F); // Box 2
		bodyModel[11].setRotationPoint(-17.5F, 4F, -3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 25, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[12].setRotationPoint(-17.5F, 8F, -3F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 59
		bodyModel[13].setRotationPoint(5.5F, 3F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[14].setRotationPoint(23.5F, 4F, 0F);
		bodyModel[14].rotateAngleX = -0.78539816F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[15].setRotationPoint(23.49F, 4F, -0.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[16].setRotationPoint(31.51F, 4F, -0.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[17].setRotationPoint(-6.5F, 3F, -8.25F);
		bodyModel[17].rotateAngleX = -0.78539816F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[18].setRotationPoint(-6.51F, 3F, -8.75F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[19].setRotationPoint(-2.49F, 3F, -8.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[20].setRotationPoint(56.5F, 1F, -10.99F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[21].setRotationPoint(56.5F, 1F, 4.99F);

		bodyModel[22].addShapeBox(0F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[22].setRotationPoint(56.51F, -14F, -10.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 38
		bodyModel[23].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[24].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 128
		bodyModel[24].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[25].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[26].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[27].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[28].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[29].setRotationPoint(56.51F, -14F, 10.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[30].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[31].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[32].setRotationPoint(55.5F, -15F, -3F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[33].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[34].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[35].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[36].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[37].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[37].setRotationPoint(55.51F, -14F, 3F);

		bodyModel[38].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[38].setRotationPoint(-60.49F, -14F, -3F);

		bodyModel[39].addBox(0F, 0F, 0F, 123, 2, 6, 0F); // Box 128
		bodyModel[39].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[40].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[41].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[42].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[43].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[44].setRotationPoint(-61.5F, -17F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[45].setRotationPoint(-61.5F, -18F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[46].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[47].setRotationPoint(-61.5F, -18F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[48].setRotationPoint(-61.5F, -19F, 3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[49].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[50].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[51].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[52].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[53].setRotationPoint(55.5F, -17F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[54].setRotationPoint(55.5F, -18F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[55].setRotationPoint(55.5F, -18F, 7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[56].setRotationPoint(55.5F, -16.25F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[57].setRotationPoint(-61.5F, -16.25F, -10F);

		bodyModel[58].addBox(0F, 0F, 0F, 123, 1, 14, 0F); // Box 128
		bodyModel[58].setRotationPoint(-61.5F, -18F, -7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 116, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[59].setRotationPoint(-60.5F, -17F, -8.25F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[60].setRotationPoint(-60.5F, -16F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 116, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[61].setRotationPoint(-60.5F, -18F, -8.25F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 116, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[62].setRotationPoint(-60.5F, -17F, 5.25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 116, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[63].setRotationPoint(-60.5F, -16F, 8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 116, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[64].setRotationPoint(-60.5F, -18F, 7.25F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[65].setRotationPoint(-29.5F, 3F, -8.25F);
		bodyModel[65].rotateAngleX = -0.78539816F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[66].setRotationPoint(-29.51F, 3F, -8.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[67].setRotationPoint(-18.49F, 3F, -8.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[68].setRotationPoint(-1F, 3F, -8.25F);
		bodyModel[68].rotateAngleX = -0.78539816F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 41
		bodyModel[69].setRotationPoint(-1.01F, 3F, -8.75F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 41
		bodyModel[70].setRotationPoint(2.01F, 3F, -8.75F);

		bodyModel[71].addBox(0F, 0F, 0F, 7, 1, 5, 0F); // Box 52
		bodyModel[71].setRotationPoint(11.5F, 3F, 4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 52
		bodyModel[72].setRotationPoint(11.5F, 4F, 4F);

		bodyModel[73].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 52
		bodyModel[73].setRotationPoint(20.5F, 3F, 4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[74].setRotationPoint(43.5F, -20.5F, -3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[75].setRotationPoint(43.5F, -20.5F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[76].setRotationPoint(43.5F, -20.5F, 3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.09F, 0F, -0.5F, 0.09F, 0F, -0.5F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0.09F, 0F, -0.5F, 0.09F, 0F, -0.5F); // Box 199
		bodyModel[77].setRotationPoint(53.5F, -18.25F, -10.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.09F, -1.15F, 0.25F, 0.09F, -1.15F, 0.25F, 0.47F, 0.16F, 0F, 0.47F, 0.16F, 0F, 0.09F, 1.15F, 0.25F, 0.09F, 1.15F, 0.25F, 0.47F, 0F, 0F, 0.47F, 0F, 0F); // Box 199
		bodyModel[78].setRotationPoint(53.5F, -19.4F, -9.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.03F, -0.44F, -0.25F, -0.03F, -0.44F, -0.25F, 0.06F, -0.6F, -0.25F, 0.06F, -0.6F, -0.25F, -0.03F, 0.6F, -0.25F, -0.03F, 0.6F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 199
		bodyModel[79].setRotationPoint(53F, -20F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.09F, 0F, -0.5F, 0.09F, 0F, -0.5F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0.09F, 0F, -0.5F, 0.09F, 0F, -0.5F); // Box 199
		bodyModel[80].setRotationPoint(-57.5F, -18.25F, -10.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.09F, -1.15F, 0.25F, 0.09F, -1.15F, 0.25F, 0.47F, 0.16F, 0F, 0.47F, 0.16F, 0F, 0.09F, 1.15F, 0.25F, 0.09F, 1.15F, 0.25F, 0.47F, 0F, 0F, 0.47F, 0F, 0F); // Box 199
		bodyModel[81].setRotationPoint(-57.5F, -19.4F, -9.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.03F, -0.44F, -0.25F, -0.03F, -0.44F, -0.25F, 0.06F, -0.6F, -0.25F, 0.06F, -0.6F, -0.25F, -0.03F, 0.6F, -0.25F, -0.03F, 0.6F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 199
		bodyModel[82].setRotationPoint(-58F, -20F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[83].setRotationPoint(56F, -6F, -12F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[84].setRotationPoint(61F, -6F, -12F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[85].setRotationPoint(-61.5F, -1.5F, -12F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[86].setRotationPoint(-61.5F, 5F, -10.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[87].setRotationPoint(56F, -6F, 11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[88].setRotationPoint(61F, -6F, 11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[89].setRotationPoint(-61.5F, -1.5F, 11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[90].setRotationPoint(-61.5F, 5F, 10.75F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[91].setRotationPoint(40.5F, -15F, -10F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[92].setRotationPoint(40.5F, -15F, 3F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[93].setRotationPoint(-34.5F, -15F, -10F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[94].setRotationPoint(-34.5F, -15F, 3F);

		bodyModel[95].addBox(0F, 0F, 0F, 15, 2, 16, 0F); // Box 128
		bodyModel[95].setRotationPoint(40.5F, -17F, -8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[96].setRotationPoint(40.5F, -17F, -10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[97].setRotationPoint(40.5F, -17F, 8F);

		bodyModel[98].addBox(0F, 0F, 0F, 5, 2, 16, 0F); // Box 128
		bodyModel[98].setRotationPoint(-38.5F, -17F, -8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[99].setRotationPoint(-37.5F, -17F, -10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 27, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[100].setRotationPoint(-60.5F, -17F, 8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 74, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[101].setRotationPoint(-33.5F, -17F, -0.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 74, 1, 4, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 38 cull
		bodyModel[102].setRotationPoint(-33.5F, -14F, 6.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 74, 1, 4, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 38 cull
		bodyModel[103].setRotationPoint(-33.5F, -14F, -10F);

		bodyModel[104].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[104].setRotationPoint(-26.5F, -8F, 7F);
		bodyModel[104].rotateAngleY = -3.14159265F;

		bodyModel[105].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[105].setRotationPoint(-26.5F, -8F, -7F);
		bodyModel[105].rotateAngleY = -3.14159265F;

		bodyModel[106].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[106].setRotationPoint(-16.5F, -8F, 7F);
		bodyModel[106].rotateAngleY = -3.14159265F;

		bodyModel[107].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[107].setRotationPoint(-16.5F, -8F, -7F);
		bodyModel[107].rotateAngleY = -3.14159265F;

		bodyModel[108].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[108].setRotationPoint(-6.5F, -8F, 7F);
		bodyModel[108].rotateAngleY = -3.14159265F;

		bodyModel[109].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[109].setRotationPoint(-6.5F, -8F, -7F);
		bodyModel[109].rotateAngleY = -3.14159265F;

		bodyModel[110].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[110].setRotationPoint(3.5F, -8F, 7F);
		bodyModel[110].rotateAngleY = -3.14159265F;

		bodyModel[111].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[111].setRotationPoint(3.5F, -8F, -7F);
		bodyModel[111].rotateAngleY = -3.14159265F;

		bodyModel[112].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[112].setRotationPoint(13.5F, -8F, 7F);
		bodyModel[112].rotateAngleY = -3.14159265F;

		bodyModel[113].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[113].setRotationPoint(13.5F, -8F, -7F);
		bodyModel[113].rotateAngleY = -3.14159265F;

		bodyModel[114].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[114].setRotationPoint(23.5F, -8F, 7F);
		bodyModel[114].rotateAngleY = -3.14159265F;

		bodyModel[115].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[115].setRotationPoint(23.5F, -8F, -7F);
		bodyModel[115].rotateAngleY = -3.14159265F;

		bodyModel[116].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[116].setRotationPoint(33.5F, -8F, 7F);
		bodyModel[116].rotateAngleY = -3.14159265F;

		bodyModel[117].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[117].setRotationPoint(33.5F, -8F, -7F);
		bodyModel[117].rotateAngleY = -3.14159265F;

		bodyModel[118].addBox(0F, 0F, 0F, 1, 16, 10, 0F); // Box 128
		bodyModel[118].setRotationPoint(-38.5F, -15F, -10F);

		bodyModel[119].addBox(0F, 0F, 0F, 3, 16, 3, 0F); // Box 128
		bodyModel[119].setRotationPoint(-37.5F, -15F, -10F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 128
		bodyModel[120].setRotationPoint(-44.5F, -16F, 5F);

		bodyModel[121].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 128
		bodyModel[121].setRotationPoint(-51.5F, -16F, 5F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 128
		bodyModel[122].setRotationPoint(-48.5F, -16F, 5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 16, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 128
		bodyModel[123].setRotationPoint(-35.5F, -15F, 7F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 16, 10, 0F); // Box 128
		bodyModel[124].setRotationPoint(-55.5F, -15F, -10F);

		bodyModel[125].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 128
		bodyModel[125].setRotationPoint(-60.5F, -15F, -5F);

		bodyModel[126].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // Box 128
		bodyModel[126].setRotationPoint(-60.5F, -15F, 4F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, -0.5F); // Box 128
		bodyModel[127].setRotationPoint(-38.5F, -16F, 0F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F,0F, 0F, 0F, -1.4F, 0F, 2.5F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 2.5F, -0.5F, 0F, -3F, 0F, 0F, 0F); // Box 128
		bodyModel[128].setRotationPoint(-41.5F, -16F, 5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, -0.5F, -0.5F, 0F, 0F); // Box 128
		bodyModel[129].setRotationPoint(-55.5F, -16F, 0F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F,-1.4F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -1.4F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F); // Box 128
		bodyModel[130].setRotationPoint(-55.5F, -16F, 5F);

		bodyModel[131].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 128
		bodyModel[131].setRotationPoint(43.5F, -15F, -2F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 16, 9, 0F); // Box 128
		bodyModel[132].setRotationPoint(50.5F, -15F, -10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 128
		bodyModel[133].setRotationPoint(52.5F, -15F, -2F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 1.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, 0F, 0F, 1.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F); // Box 128
		bodyModel[134].setRotationPoint(41.5F, -15F, -2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -1F); // Box 128
		bodyModel[135].setRotationPoint(40.5F, -15F, -3F);

		bodyModel[136].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // Box 128
		bodyModel[136].setRotationPoint(41.5F, -15F, 4F);

		bodyModel[137].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // Box 128
		bodyModel[137].setRotationPoint(53.5F, -15F, 4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[138].setRotationPoint(48F, -13F, 3.99F);

		bodyModel[139].addBox(0F, 0F, 0F, 10, 1, 6, 0F); // Box 128
		bodyModel[139].setRotationPoint(43.5F, -13F, 4F);

		bodyModel[140].addBox(0F, 0F, 0F, 10, 1, 6, 0F); // Box 128
		bodyModel[140].setRotationPoint(43.5F, -8F, 4F);

		bodyModel[141].addBox(0F, 0F, 0F, 10, 1, 6, 0F); // Box 128
		bodyModel[141].setRotationPoint(43.5F, -3F, 4F);

		bodyModel[142].addBox(0F, 0F, 0F, 6, 2, 16, 0F); // Box 128
		bodyModel[142].setRotationPoint(-60.5F, -17F, -8F);

		bodyModel[143].addBox(0F, 0F, 0F, 16, 1, 16, 0F); // Box 128
		bodyModel[143].setRotationPoint(-54.5F, -17F, -8F);

		bodyModel[144].addBox(0F, 0F, 0F, 16, 1, 2, 0F); // Box 128
		bodyModel[144].setRotationPoint(-54.5F, -16F, 6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[145].setRotationPoint(-41.5F, -16F, 3F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[146].setRotationPoint(-54.5F, -16F, 3F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[147].setRotationPoint(-60.5F, -17F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0.02F, -1.75F, 0F, 0.02F, -1.75F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[148].setRotationPoint(-55.5F, -17.25F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 93, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[149].setRotationPoint(-37.5F, -16F, -10F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 128
		bodyModel[150].setRotationPoint(-55.5F, -16F, -10F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 128
		bodyModel[151].setRotationPoint(-38.5F, -16F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 128
		bodyModel[152].setRotationPoint(-55.5F, -16.25F, -10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[153].setRotationPoint(-43F, -15F, 7.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[154].setRotationPoint(-53F, -15F, 7.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[155].setRotationPoint(-45F, -16F, 2.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[156].setRotationPoint(-50F, -16F, 2.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[157].setRotationPoint(-41F, -16F, -3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[158].setRotationPoint(-41F, -16F, -9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[159].setRotationPoint(-53F, -16F, -3F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[160].setRotationPoint(-53F, -16F, -9F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 526
		bodyModel[161].setRotationPoint(-53F, -3F, -9.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527
		bodyModel[162].setRotationPoint(-54F, -7F, -9.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[163].setRotationPoint(-53.5F, -4.5F, -1.49F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[164].setRotationPoint(-53.5F, -4.5F, -9.51F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[165].setRotationPoint(-51F, -4.5F, -1.49F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[166].setRotationPoint(-51F, -4.5F, -9.51F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[167].setRotationPoint(-54F, -2.5F, -9.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 533
		bodyModel[168].setRotationPoint(-54.5F, -1.5F, -1.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 534
		bodyModel[169].setRotationPoint(-54.5F, -1.5F, -9.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[170].setRotationPoint(-51F, -1.5F, -6.75F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[171].setRotationPoint(-51F, -1.5F, -4.25F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 526
		bodyModel[172].setRotationPoint(-44F, -3F, -9.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527
		bodyModel[173].setRotationPoint(-40F, -7F, -9.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[174].setRotationPoint(-40F, -2.5F, -9.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[175].setRotationPoint(-43.5F, -4.5F, -1.49F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[176].setRotationPoint(-43.5F, -4.5F, -9.51F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[177].setRotationPoint(-43.5F, -1.5F, -6.75F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[178].setRotationPoint(-43.5F, -1.5F, -4.25F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 533
		bodyModel[179].setRotationPoint(-40F, -1.5F, -1.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 534
		bodyModel[180].setRotationPoint(-40F, -1.5F, -9.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[181].setRotationPoint(-42.5F, -4.5F, -1.49F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[182].setRotationPoint(-42.5F, -4.5F, -9.51F);

		bodyModel[183].addShapeBox(-2.5F, 0F, -2F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[183].setRotationPoint(-50.25F, -2F, 1.5F);
		bodyModel[183].rotateAngleY = -0.34906585F;

		bodyModel[184].addShapeBox(-2.5F, 0F, -2F, 1, 3, 4, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[184].setRotationPoint(-50.25F, -5.5F, 1.5F);
		bodyModel[184].rotateAngleY = -0.34906585F;

		bodyModel[185].addShapeBox(-2F, 0F, 1.51F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[185].setRotationPoint(-50.25F, -4.5F, 1.5F);
		bodyModel[185].rotateAngleY = -0.34906585F;

		bodyModel[186].addShapeBox(-2F, 0F, -2.01F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[186].setRotationPoint(-50.25F, -4.5F, 1.5F);
		bodyModel[186].rotateAngleY = -0.34906585F;

		bodyModel[187].addShapeBox(0F, 0F, 1.51F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[187].setRotationPoint(-50.25F, -4.5F, 1.5F);
		bodyModel[187].rotateAngleY = -0.34906585F;

		bodyModel[188].addShapeBox(0F, 0F, -2.01F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[188].setRotationPoint(-50.25F, -4.5F, 1.5F);
		bodyModel[188].rotateAngleY = -0.34906585F;

		bodyModel[189].addShapeBox(-3.01F, 0F, 1F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 533
		bodyModel[189].setRotationPoint(-50.25F, -3F, 1.5F);
		bodyModel[189].rotateAngleY = -0.34906585F;

		bodyModel[190].addShapeBox(-3.01F, 0F, -1.5F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 534
		bodyModel[190].setRotationPoint(-50.26F, -3F, 1.5F);
		bodyModel[190].rotateAngleY = -0.34906585F;

		bodyModel[191].addShapeBox(-2.5F, 0F, -2F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[191].setRotationPoint(-42.75F, -2F, 1.5F);
		bodyModel[191].rotateAngleY = -2.7925268F;

		bodyModel[192].addShapeBox(-2.5F, 0F, -2F, 1, 3, 4, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[192].setRotationPoint(-42.75F, -5.5F, 1.5F);
		bodyModel[192].rotateAngleY = -2.7925268F;

		bodyModel[193].addShapeBox(-2F, 0F, 1.51F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[193].setRotationPoint(-42.75F, -4.5F, 1.5F);
		bodyModel[193].rotateAngleY = -2.7925268F;

		bodyModel[194].addShapeBox(-2F, 0F, -2.01F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[194].setRotationPoint(-42.75F, -4.5F, 1.5F);
		bodyModel[194].rotateAngleY = -2.7925268F;

		bodyModel[195].addShapeBox(0F, 0F, 1.51F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[195].setRotationPoint(-42.75F, -4.5F, 1.5F);
		bodyModel[195].rotateAngleY = -2.7925268F;

		bodyModel[196].addShapeBox(0F, 0F, -2.01F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[196].setRotationPoint(-42.75F, -4.5F, 1.5F);
		bodyModel[196].rotateAngleY = -2.7925268F;

		bodyModel[197].addShapeBox(-3.01F, 0F, 1F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 533
		bodyModel[197].setRotationPoint(-42.75F, -3F, 1.5F);
		bodyModel[197].rotateAngleY = -2.7925268F;

		bodyModel[198].addShapeBox(-3.01F, 0F, -1.5F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 534
		bodyModel[198].setRotationPoint(-42.76F, -3F, 1.5F);
		bodyModel[198].rotateAngleY = -2.7925268F;

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[199].setRotationPoint(-49.5F, -5F, -1.75F);

		bodyModel[200].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[200].setRotationPoint(-48.75F, -4.5F, -1F);
		bodyModel[200].rotateAngleY = -0.78539816F;

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[201].setRotationPoint(-49.75F, 0.5F, -2F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[202].setRotationPoint(-45F, -5F, -1.75F);

		bodyModel[203].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[203].setRotationPoint(-44.25F, -4.5F, -1F);
		bodyModel[203].rotateAngleY = -0.78539816F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[204].setRotationPoint(-45.25F, 0.5F, -2F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[205].setRotationPoint(-60.5F, -6F, -10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[206].setRotationPoint(-59.5F, -6F, -9F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[207].setRotationPoint(-60.5F, -6F, -9F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[208].setRotationPoint(-58F, -2F, -9F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[209].setRotationPoint(-57.25F, -1F, -8.55F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[210].setRotationPoint(-57.75F, 0.5F, -9.05F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.85F, 0F, 0F, -0.35F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.85F, -0.5F, 0F, -0.35F, -0.5F, 0F); // Box 38 cull
		bodyModel[211].setRotationPoint(-58.5F, -4F, -10.49F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[212].setRotationPoint(-59.47F, -5F, -9.73F);
		bodyModel[212].rotateAngleY = 0.78539816F;

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38 cull
		bodyModel[213].setRotationPoint(-60F, -10F, -10F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F); // Box 38
		bodyModel[214].setRotationPoint(52.95F, -2F, -8.85F);
		bodyModel[214].rotateAngleY = -0.78539816F;

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[215].setRotationPoint(53.3F, -1F, -8.5F);
		bodyModel[215].rotateAngleY = -0.78539816F;

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[216].setRotationPoint(52.95F, 0.5F, -8.85F);
		bodyModel[216].rotateAngleY = -0.78539816F;

		bodyModel[217].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 128
		bodyModel[217].setRotationPoint(51.5F, -15F, -2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 6, 14, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[218].setRotationPoint(47.5F, -15F, -1.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[219].setRotationPoint(48.5F, -6F, -10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[220].setRotationPoint(48.5F, -6F, -9F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[221].setRotationPoint(49.5F, -6F, -9F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[222].setRotationPoint(49.87F, -5F, -9.67F);
		bodyModel[222].rotateAngleY = 0.78539816F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38 cull
		bodyModel[223].setRotationPoint(48.5F, -10F, -10F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[224].setRotationPoint(42F, -3F, -9.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.17F, -0.5F, -0.5F, 0F); // Box 527
		bodyModel[225].setRotationPoint(41F, -7F, -9.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.076F, 0F, 0F, -0.076F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.076F, -0.5F, 0F, -0.076F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[226].setRotationPoint(41.66F, -4.5F, -3.97F);
		bodyModel[226].rotateAngleY = 0.32288591F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[227].setRotationPoint(41.5F, -4.5F, -9.51F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[228].setRotationPoint(43.01F, -4.5F, -3.52F);
		bodyModel[228].rotateAngleY = 0.32288591F;

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[229].setRotationPoint(43F, -4.5F, -9.51F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.17F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.17F, 0F, 0F, 0F); // Box 532
		bodyModel[230].setRotationPoint(41.5F, -2.5F, -9.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 533
		bodyModel[231].setRotationPoint(41.18F, -1.5F, -4.14F);
		bodyModel[231].rotateAngleY = 0.32288591F;

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 534
		bodyModel[232].setRotationPoint(41.5F, -1.5F, -9.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.83F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.83F); // Box 526
		bodyModel[233].setRotationPoint(42F, -3F, -3.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.85F, 0F, 0F, -0.35F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.85F, -0.5F, 0F, -0.35F, -0.5F, 0F); // Box 38 cull
		bodyModel[234].setRotationPoint(46.5F, -4F, -10.49F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[235].setRotationPoint(44.75F, -3F, -5.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[236].setRotationPoint(44.75F, -2F, -5.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 4, 0, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[237].setRotationPoint(44.75F, -0.5F, -5.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[238].setRotationPoint(44.75F, -6F, -5.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38 cull
		bodyModel[239].setRotationPoint(44.75F, -4F, -5.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[240].setRotationPoint(44.75F, -5F, -3F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[241].setRotationPoint(44.75F, -5.01F, -3F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[242].setRotationPoint(44.25F, -10F, -2.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 38
		bodyModel[243].setRotationPoint(46.25F, -10F, -2.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[244].setRotationPoint(45F, -10F, -2.01F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 116, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[245].setRotationPoint(-60.5F, -11F, -9.9F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 116, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[246].setRotationPoint(-60.5F, -11F, 9.9F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[247].setRotationPoint(-36.5F, -15F, -1.5F);

		bodyModel[248].addBox(0F, 0F, 0F, 37, 1, 0, 0F); // Box 38
		bodyModel[248].setRotationPoint(-20.5F, -13.5F, -11.01F);

		bodyModel[249].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 38
		bodyModel[249].setRotationPoint(-47.5F, -2.5F, -11.01F);

		bodyModel[250].addBox(0F, 0F, 0F, 37, 1, 0, 0F); // Box 451
		bodyModel[250].setRotationPoint(-20.5F, -13.5F, 11.01F);

		bodyModel[251].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 452
		bodyModel[251].setRotationPoint(-47.5F, -2.5F, 11.01F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[252].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[253].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[254].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[255].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[256].setRotationPoint(63F, -14F, -5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[257].setRotationPoint(63F, -14F, 3F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[258].setRotationPoint(63F, 1F, -5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[259].setRotationPoint(63F, -15F, -5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[260].setRotationPoint(63F, -16F, -5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[261].setRotationPoint(63F, -16F, 0F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[262].setRotationPoint(-63F, -15F, -4F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[263].setRotationPoint(-63F, 1F, -4F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[264].setRotationPoint(-63F, -14F, -4F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[265].setRotationPoint(-63F, -14F, 3F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[266].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[267].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[268].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[269].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[270].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[271].setRotationPoint(-63.5F, -16F, 0F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[272].setRotationPoint(52.25F, 3F, 10.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[273].setRotationPoint(53F, 4F, 10.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[274].setRotationPoint(-61.5F, 4F, 10.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[275].setRotationPoint(-61.5F, 3F, 10.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[276].setRotationPoint(-53.25F, 3F, 10.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[277].setRotationPoint(-55F, 4F, 10.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[278].setRotationPoint(34.75F, 3F, 10.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[279].setRotationPoint(33F, 4F, 10.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[280].setRotationPoint(-35.75F, 3F, 10.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[281].setRotationPoint(-35F, 4F, 10.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[282].setRotationPoint(-34.5F, 3F, 10.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[283].setRotationPoint(-33.5F, 4F, 10.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[284].setRotationPoint(52.25F, 3F, -11F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[285].setRotationPoint(53F, 4F, -11F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[286].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[287].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[288].setRotationPoint(-53.25F, 3F, -11F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[289].setRotationPoint(-55F, 4F, -11F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[290].setRotationPoint(34.75F, 3F, -11F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[291].setRotationPoint(33F, 4F, -11F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[292].setRotationPoint(-35.75F, 3F, -11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[293].setRotationPoint(-35F, 4F, -11F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[294].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[295].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[296].setRotationPoint(53.5F, 3F, 10.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[297].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[298].setRotationPoint(60.5F, 3F, 10.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[299].setRotationPoint(60.5F, 4F, 10.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[300].setRotationPoint(54.5F, 3F, 10.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[301].setRotationPoint(54.5F, 4F, 10.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[302].setRotationPoint(60.5F, 3F, -11F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[303].setRotationPoint(60.5F, 4F, -11F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[304].setRotationPoint(54.5F, 3F, -11F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[305].setRotationPoint(54.5F, 4F, -11F);

		bodyModel[306].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[306].setRotationPoint(32F, 0F, 4F);

		bodyModel[307].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[307].setRotationPoint(22F, 0F, 4F);

		bodyModel[308].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[308].setRotationPoint(12F, 0F, 4F);

		bodyModel[309].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[309].setRotationPoint(2F, 0F, 4F);

		bodyModel[310].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[310].setRotationPoint(-8F, 0F, 4F);

		bodyModel[311].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[311].setRotationPoint(-18F, 0F, 4F);

		bodyModel[312].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[312].setRotationPoint(-28F, 0F, 4F);

		bodyModel[313].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[313].setRotationPoint(22F, 0F, -10F);

		bodyModel[314].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[314].setRotationPoint(12F, 0F, -10F);

		bodyModel[315].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[315].setRotationPoint(2F, 0F, -10F);

		bodyModel[316].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[316].setRotationPoint(-8F, 0F, -10F);

		bodyModel[317].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[317].setRotationPoint(-18F, 0F, -10F);

		bodyModel[318].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[318].setRotationPoint(-28F, 0F, -10F);

		bodyModel[319].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 638
		bodyModel[319].setRotationPoint(32F, 0F, -10F);

		bodyModel[320].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[320].setRotationPoint(-26.5F, -3F, 7F);
		bodyModel[320].rotateAngleY = -3.14159265F;

		bodyModel[321].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[321].setRotationPoint(-26.5F, -3F, -7F);
		bodyModel[321].rotateAngleY = -3.14159265F;

		bodyModel[322].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[322].setRotationPoint(-16.5F, -3F, 7F);
		bodyModel[322].rotateAngleY = -3.14159265F;

		bodyModel[323].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[323].setRotationPoint(-16.5F, -3F, -7F);
		bodyModel[323].rotateAngleY = -3.14159265F;

		bodyModel[324].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[324].setRotationPoint(-6.5F, -3F, 7F);
		bodyModel[324].rotateAngleY = -3.14159265F;

		bodyModel[325].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[325].setRotationPoint(-6.5F, -3F, -7F);
		bodyModel[325].rotateAngleY = -3.14159265F;

		bodyModel[326].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[326].setRotationPoint(3.5F, -3F, -7F);
		bodyModel[326].rotateAngleY = -3.14159265F;

		bodyModel[327].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[327].setRotationPoint(13.5F, -3F, 7F);
		bodyModel[327].rotateAngleY = -3.14159265F;

		bodyModel[328].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[328].setRotationPoint(13.5F, -3F, -7F);
		bodyModel[328].rotateAngleY = -3.14159265F;

		bodyModel[329].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[329].setRotationPoint(23.5F, -3F, 7F);
		bodyModel[329].rotateAngleY = -3.14159265F;

		bodyModel[330].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[330].setRotationPoint(23.5F, -3F, -7F);
		bodyModel[330].rotateAngleY = -3.14159265F;

		bodyModel[331].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[331].setRotationPoint(33.5F, -5F, 7F);
		bodyModel[331].rotateAngleY = -3.14159265F;

		bodyModel[332].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[332].setRotationPoint(33.5F, -3F, 7F);
		bodyModel[332].rotateAngleY = -3.14159265F;

		bodyModel[333].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[333].setRotationPoint(33.5F, -3F, 7F);
		bodyModel[333].rotateAngleY = -3.14159265F;

		bodyModel[334].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[334].setRotationPoint(33.5F, -5F, 7F);
		bodyModel[334].rotateAngleY = -3.14159265F;

		bodyModel[335].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[335].setRotationPoint(33.5F, -4.5F, 7F);
		bodyModel[335].rotateAngleY = -3.14159265F;

		bodyModel[336].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[336].setRotationPoint(33.5F, -4F, 7F);
		bodyModel[336].rotateAngleY = -3.14159265F;

		bodyModel[337].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[337].setRotationPoint(33.5F, -5F, 7F);
		bodyModel[337].rotateAngleY = -3.14159265F;

		bodyModel[338].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[338].setRotationPoint(33.5F, -3F, 7F);
		bodyModel[338].rotateAngleY = -3.14159265F;

		bodyModel[339].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[339].setRotationPoint(33.5F, -5F, 7F);
		bodyModel[339].rotateAngleY = -3.14159265F;

		bodyModel[340].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[340].setRotationPoint(33.5F, -4.5F, 7F);
		bodyModel[340].rotateAngleY = -3.14159265F;

		bodyModel[341].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[341].setRotationPoint(33.5F, -4F, 7F);
		bodyModel[341].rotateAngleY = -3.14159265F;

		bodyModel[342].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[342].setRotationPoint(23.5F, -5F, 7F);
		bodyModel[342].rotateAngleY = -3.14159265F;

		bodyModel[343].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[343].setRotationPoint(23.5F, -3F, 7F);
		bodyModel[343].rotateAngleY = -3.14159265F;

		bodyModel[344].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[344].setRotationPoint(23.5F, -5F, 7F);
		bodyModel[344].rotateAngleY = -3.14159265F;

		bodyModel[345].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[345].setRotationPoint(23.5F, -4.5F, 7F);
		bodyModel[345].rotateAngleY = -3.14159265F;

		bodyModel[346].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[346].setRotationPoint(23.5F, -4F, 7F);
		bodyModel[346].rotateAngleY = -3.14159265F;

		bodyModel[347].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[347].setRotationPoint(23.5F, -5F, 7F);
		bodyModel[347].rotateAngleY = -3.14159265F;

		bodyModel[348].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[348].setRotationPoint(23.5F, -3F, 7F);
		bodyModel[348].rotateAngleY = -3.14159265F;

		bodyModel[349].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[349].setRotationPoint(23.5F, -5F, 7F);
		bodyModel[349].rotateAngleY = -3.14159265F;

		bodyModel[350].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[350].setRotationPoint(23.5F, -4.5F, 7F);
		bodyModel[350].rotateAngleY = -3.14159265F;

		bodyModel[351].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[351].setRotationPoint(23.5F, -4F, 7F);
		bodyModel[351].rotateAngleY = -3.14159265F;

		bodyModel[352].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[352].setRotationPoint(13.5F, -5F, 7F);
		bodyModel[352].rotateAngleY = -3.14159265F;

		bodyModel[353].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[353].setRotationPoint(13.5F, -3F, 7F);
		bodyModel[353].rotateAngleY = -3.14159265F;

		bodyModel[354].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[354].setRotationPoint(13.5F, -5F, 7F);
		bodyModel[354].rotateAngleY = -3.14159265F;

		bodyModel[355].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[355].setRotationPoint(13.5F, -4.5F, 7F);
		bodyModel[355].rotateAngleY = -3.14159265F;

		bodyModel[356].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[356].setRotationPoint(13.5F, -4F, 7F);
		bodyModel[356].rotateAngleY = -3.14159265F;

		bodyModel[357].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[357].setRotationPoint(13.5F, -5F, 7F);
		bodyModel[357].rotateAngleY = -3.14159265F;

		bodyModel[358].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[358].setRotationPoint(13.5F, -3F, 7F);
		bodyModel[358].rotateAngleY = -3.14159265F;

		bodyModel[359].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[359].setRotationPoint(13.5F, -5F, 7F);
		bodyModel[359].rotateAngleY = -3.14159265F;

		bodyModel[360].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[360].setRotationPoint(13.5F, -4.5F, 7F);
		bodyModel[360].rotateAngleY = -3.14159265F;

		bodyModel[361].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[361].setRotationPoint(13.5F, -4F, 7F);
		bodyModel[361].rotateAngleY = -3.14159265F;

		bodyModel[362].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[362].setRotationPoint(3.5F, -5F, 7F);
		bodyModel[362].rotateAngleY = -3.14159265F;

		bodyModel[363].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[363].setRotationPoint(3.5F, -3F, 7F);
		bodyModel[363].rotateAngleY = -3.14159265F;

		bodyModel[364].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[364].setRotationPoint(3.5F, -5F, 7F);
		bodyModel[364].rotateAngleY = -3.14159265F;

		bodyModel[365].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[365].setRotationPoint(3.5F, -4.5F, 7F);
		bodyModel[365].rotateAngleY = -3.14159265F;

		bodyModel[366].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[366].setRotationPoint(3.5F, -4F, 7F);
		bodyModel[366].rotateAngleY = -3.14159265F;

		bodyModel[367].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[367].setRotationPoint(3.5F, -5F, 7F);
		bodyModel[367].rotateAngleY = -3.14159265F;

		bodyModel[368].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[368].setRotationPoint(3.5F, -3F, 7F);
		bodyModel[368].rotateAngleY = -3.14159265F;

		bodyModel[369].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[369].setRotationPoint(3.5F, -5F, 7F);
		bodyModel[369].rotateAngleY = -3.14159265F;

		bodyModel[370].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[370].setRotationPoint(3.5F, -4.5F, 7F);
		bodyModel[370].rotateAngleY = -3.14159265F;

		bodyModel[371].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[371].setRotationPoint(3.5F, -4F, 7F);
		bodyModel[371].rotateAngleY = -3.14159265F;

		bodyModel[372].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[372].setRotationPoint(-6.5F, -5F, 7F);
		bodyModel[372].rotateAngleY = -3.14159265F;

		bodyModel[373].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[373].setRotationPoint(-6.5F, -3F, 7F);
		bodyModel[373].rotateAngleY = -3.14159265F;

		bodyModel[374].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[374].setRotationPoint(-6.5F, -5F, 7F);
		bodyModel[374].rotateAngleY = -3.14159265F;

		bodyModel[375].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[375].setRotationPoint(-6.5F, -4.5F, 7F);
		bodyModel[375].rotateAngleY = -3.14159265F;

		bodyModel[376].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[376].setRotationPoint(-6.5F, -4F, 7F);
		bodyModel[376].rotateAngleY = -3.14159265F;

		bodyModel[377].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[377].setRotationPoint(-6.5F, -5F, 7F);
		bodyModel[377].rotateAngleY = -3.14159265F;

		bodyModel[378].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[378].setRotationPoint(-6.5F, -3F, 7F);
		bodyModel[378].rotateAngleY = -3.14159265F;

		bodyModel[379].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[379].setRotationPoint(-6.5F, -5F, 7F);
		bodyModel[379].rotateAngleY = -3.14159265F;

		bodyModel[380].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[380].setRotationPoint(-6.5F, -4.5F, 7F);
		bodyModel[380].rotateAngleY = -3.14159265F;

		bodyModel[381].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[381].setRotationPoint(-6.5F, -4F, 7F);
		bodyModel[381].rotateAngleY = -3.14159265F;

		bodyModel[382].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[382].setRotationPoint(-16.5F, -5F, 7F);
		bodyModel[382].rotateAngleY = -3.14159265F;

		bodyModel[383].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[383].setRotationPoint(-16.5F, -3F, 7F);
		bodyModel[383].rotateAngleY = -3.14159265F;

		bodyModel[384].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[384].setRotationPoint(-16.5F, -5F, 7F);
		bodyModel[384].rotateAngleY = -3.14159265F;

		bodyModel[385].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[385].setRotationPoint(-16.5F, -4.5F, 7F);
		bodyModel[385].rotateAngleY = -3.14159265F;

		bodyModel[386].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[386].setRotationPoint(-16.5F, -4F, 7F);
		bodyModel[386].rotateAngleY = -3.14159265F;

		bodyModel[387].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[387].setRotationPoint(-16.5F, -5F, 7F);
		bodyModel[387].rotateAngleY = -3.14159265F;

		bodyModel[388].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[388].setRotationPoint(-16.5F, -3F, 7F);
		bodyModel[388].rotateAngleY = -3.14159265F;

		bodyModel[389].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[389].setRotationPoint(-16.5F, -5F, 7F);
		bodyModel[389].rotateAngleY = -3.14159265F;

		bodyModel[390].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[390].setRotationPoint(-16.5F, -4.5F, 7F);
		bodyModel[390].rotateAngleY = -3.14159265F;

		bodyModel[391].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[391].setRotationPoint(-16.5F, -4F, 7F);
		bodyModel[391].rotateAngleY = -3.14159265F;

		bodyModel[392].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[392].setRotationPoint(-26.5F, -5F, 7F);
		bodyModel[392].rotateAngleY = -3.14159265F;

		bodyModel[393].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[393].setRotationPoint(-26.5F, -3F, 7F);
		bodyModel[393].rotateAngleY = -3.14159265F;

		bodyModel[394].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[394].setRotationPoint(-26.5F, -5F, 7F);
		bodyModel[394].rotateAngleY = -3.14159265F;

		bodyModel[395].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[395].setRotationPoint(-26.5F, -4.5F, 7F);
		bodyModel[395].rotateAngleY = -3.14159265F;

		bodyModel[396].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[396].setRotationPoint(-26.5F, -4F, 7F);
		bodyModel[396].rotateAngleY = -3.14159265F;

		bodyModel[397].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[397].setRotationPoint(-26.5F, -5F, 7F);
		bodyModel[397].rotateAngleY = -3.14159265F;

		bodyModel[398].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[398].setRotationPoint(-26.5F, -3F, 7F);
		bodyModel[398].rotateAngleY = -3.14159265F;

		bodyModel[399].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[399].setRotationPoint(-26.5F, -5F, 7F);
		bodyModel[399].rotateAngleY = -3.14159265F;

		bodyModel[400].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[400].setRotationPoint(-26.5F, -4.5F, 7F);
		bodyModel[400].rotateAngleY = -3.14159265F;

		bodyModel[401].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[401].setRotationPoint(-26.5F, -4F, 7F);
		bodyModel[401].rotateAngleY = -3.14159265F;

		bodyModel[402].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[402].setRotationPoint(23.5F, -5F, -7F);
		bodyModel[402].rotateAngleY = -3.14159265F;

		bodyModel[403].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[403].setRotationPoint(23.5F, -3F, -7F);
		bodyModel[403].rotateAngleY = -3.14159265F;

		bodyModel[404].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[404].setRotationPoint(23.5F, -5F, -7F);
		bodyModel[404].rotateAngleY = -3.14159265F;

		bodyModel[405].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[405].setRotationPoint(23.5F, -4.5F, -7F);
		bodyModel[405].rotateAngleY = -3.14159265F;

		bodyModel[406].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[406].setRotationPoint(23.5F, -4F, -7F);
		bodyModel[406].rotateAngleY = -3.14159265F;

		bodyModel[407].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[407].setRotationPoint(23.5F, -5F, -7F);
		bodyModel[407].rotateAngleY = -3.14159265F;

		bodyModel[408].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[408].setRotationPoint(23.5F, -3F, -7F);
		bodyModel[408].rotateAngleY = -3.14159265F;

		bodyModel[409].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[409].setRotationPoint(23.5F, -5F, -7F);
		bodyModel[409].rotateAngleY = -3.14159265F;

		bodyModel[410].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[410].setRotationPoint(23.5F, -4.5F, -7F);
		bodyModel[410].rotateAngleY = -3.14159265F;

		bodyModel[411].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[411].setRotationPoint(23.5F, -4F, -7F);
		bodyModel[411].rotateAngleY = -3.14159265F;

		bodyModel[412].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[412].setRotationPoint(13.5F, -5F, -7F);
		bodyModel[412].rotateAngleY = -3.14159265F;

		bodyModel[413].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[413].setRotationPoint(13.5F, -3F, -7F);
		bodyModel[413].rotateAngleY = -3.14159265F;

		bodyModel[414].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[414].setRotationPoint(13.5F, -5F, -7F);
		bodyModel[414].rotateAngleY = -3.14159265F;

		bodyModel[415].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[415].setRotationPoint(13.5F, -4.5F, -7F);
		bodyModel[415].rotateAngleY = -3.14159265F;

		bodyModel[416].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[416].setRotationPoint(13.5F, -4F, -7F);
		bodyModel[416].rotateAngleY = -3.14159265F;

		bodyModel[417].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[417].setRotationPoint(13.5F, -5F, -7F);
		bodyModel[417].rotateAngleY = -3.14159265F;

		bodyModel[418].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[418].setRotationPoint(13.5F, -3F, -7F);
		bodyModel[418].rotateAngleY = -3.14159265F;

		bodyModel[419].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[419].setRotationPoint(13.5F, -5F, -7F);
		bodyModel[419].rotateAngleY = -3.14159265F;

		bodyModel[420].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[420].setRotationPoint(13.5F, -4.5F, -7F);
		bodyModel[420].rotateAngleY = -3.14159265F;

		bodyModel[421].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[421].setRotationPoint(13.5F, -4F, -7F);
		bodyModel[421].rotateAngleY = -3.14159265F;

		bodyModel[422].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[422].setRotationPoint(3.5F, -5F, -7F);
		bodyModel[422].rotateAngleY = -3.14159265F;

		bodyModel[423].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[423].setRotationPoint(3.5F, -3F, -7F);
		bodyModel[423].rotateAngleY = -3.14159265F;

		bodyModel[424].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[424].setRotationPoint(3.5F, -5F, -7F);
		bodyModel[424].rotateAngleY = -3.14159265F;

		bodyModel[425].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[425].setRotationPoint(3.5F, -4.5F, -7F);
		bodyModel[425].rotateAngleY = -3.14159265F;

		bodyModel[426].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[426].setRotationPoint(3.5F, -4F, -7F);
		bodyModel[426].rotateAngleY = -3.14159265F;

		bodyModel[427].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[427].setRotationPoint(3.5F, -5F, -7F);
		bodyModel[427].rotateAngleY = -3.14159265F;

		bodyModel[428].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[428].setRotationPoint(3.5F, -3F, -7F);
		bodyModel[428].rotateAngleY = -3.14159265F;

		bodyModel[429].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[429].setRotationPoint(3.5F, -5F, -7F);
		bodyModel[429].rotateAngleY = -3.14159265F;

		bodyModel[430].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[430].setRotationPoint(3.5F, -4.5F, -7F);
		bodyModel[430].rotateAngleY = -3.14159265F;

		bodyModel[431].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[431].setRotationPoint(3.5F, -4F, -7F);
		bodyModel[431].rotateAngleY = -3.14159265F;

		bodyModel[432].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[432].setRotationPoint(-6.5F, -5F, -7F);
		bodyModel[432].rotateAngleY = -3.14159265F;

		bodyModel[433].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[433].setRotationPoint(-6.5F, -3F, -7F);
		bodyModel[433].rotateAngleY = -3.14159265F;

		bodyModel[434].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[434].setRotationPoint(-6.5F, -5F, -7F);
		bodyModel[434].rotateAngleY = -3.14159265F;

		bodyModel[435].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[435].setRotationPoint(-6.5F, -4.5F, -7F);
		bodyModel[435].rotateAngleY = -3.14159265F;

		bodyModel[436].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[436].setRotationPoint(-6.5F, -4F, -7F);
		bodyModel[436].rotateAngleY = -3.14159265F;

		bodyModel[437].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[437].setRotationPoint(-6.5F, -5F, -7F);
		bodyModel[437].rotateAngleY = -3.14159265F;

		bodyModel[438].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[438].setRotationPoint(-6.5F, -3F, -7F);
		bodyModel[438].rotateAngleY = -3.14159265F;

		bodyModel[439].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[439].setRotationPoint(-6.5F, -5F, -7F);
		bodyModel[439].rotateAngleY = -3.14159265F;

		bodyModel[440].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[440].setRotationPoint(-6.5F, -4.5F, -7F);
		bodyModel[440].rotateAngleY = -3.14159265F;

		bodyModel[441].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[441].setRotationPoint(-6.5F, -4F, -7F);
		bodyModel[441].rotateAngleY = -3.14159265F;

		bodyModel[442].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[442].setRotationPoint(-16.5F, -5F, -7F);
		bodyModel[442].rotateAngleY = -3.14159265F;

		bodyModel[443].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[443].setRotationPoint(-16.5F, -3F, -7F);
		bodyModel[443].rotateAngleY = -3.14159265F;

		bodyModel[444].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[444].setRotationPoint(-16.5F, -5F, -7F);
		bodyModel[444].rotateAngleY = -3.14159265F;

		bodyModel[445].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[445].setRotationPoint(-16.5F, -4.5F, -7F);
		bodyModel[445].rotateAngleY = -3.14159265F;

		bodyModel[446].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[446].setRotationPoint(-16.5F, -4F, -7F);
		bodyModel[446].rotateAngleY = -3.14159265F;

		bodyModel[447].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[447].setRotationPoint(-16.5F, -5F, -7F);
		bodyModel[447].rotateAngleY = -3.14159265F;

		bodyModel[448].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[448].setRotationPoint(-16.5F, -3F, -7F);
		bodyModel[448].rotateAngleY = -3.14159265F;

		bodyModel[449].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[449].setRotationPoint(-16.5F, -5F, -7F);
		bodyModel[449].rotateAngleY = -3.14159265F;

		bodyModel[450].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[450].setRotationPoint(-16.5F, -4.5F, -7F);
		bodyModel[450].rotateAngleY = -3.14159265F;

		bodyModel[451].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[451].setRotationPoint(-16.5F, -4F, -7F);
		bodyModel[451].rotateAngleY = -3.14159265F;

		bodyModel[452].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[452].setRotationPoint(-26.5F, -5F, -7F);
		bodyModel[452].rotateAngleY = -3.14159265F;

		bodyModel[453].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[453].setRotationPoint(-26.5F, -3F, -7F);
		bodyModel[453].rotateAngleY = -3.14159265F;

		bodyModel[454].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[454].setRotationPoint(-26.5F, -5F, -7F);
		bodyModel[454].rotateAngleY = -3.14159265F;

		bodyModel[455].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[455].setRotationPoint(-26.5F, -4.5F, -7F);
		bodyModel[455].rotateAngleY = -3.14159265F;

		bodyModel[456].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[456].setRotationPoint(-26.5F, -4F, -7F);
		bodyModel[456].rotateAngleY = -3.14159265F;

		bodyModel[457].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[457].setRotationPoint(-26.5F, -5F, -7F);
		bodyModel[457].rotateAngleY = -3.14159265F;

		bodyModel[458].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[458].setRotationPoint(-26.5F, -3F, -7F);
		bodyModel[458].rotateAngleY = -3.14159265F;

		bodyModel[459].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[459].setRotationPoint(-26.5F, -5F, -7F);
		bodyModel[459].rotateAngleY = -3.14159265F;

		bodyModel[460].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[460].setRotationPoint(-26.5F, -4.5F, -7F);
		bodyModel[460].rotateAngleY = -3.14159265F;

		bodyModel[461].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[461].setRotationPoint(-26.5F, -4F, -7F);
		bodyModel[461].rotateAngleY = -3.14159265F;

		bodyModel[462].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[462].setRotationPoint(3.5F, -3F, 7F);
		bodyModel[462].rotateAngleY = -3.14159265F;

		bodyModel[463].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[463].setRotationPoint(33.5F, -3F, -7F);
		bodyModel[463].rotateAngleY = -3.14159265F;

		bodyModel[464].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[464].setRotationPoint(33.5F, -5F, -7F);
		bodyModel[464].rotateAngleY = -3.14159265F;

		bodyModel[465].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[465].setRotationPoint(33.5F, -3F, -7F);
		bodyModel[465].rotateAngleY = -3.14159265F;

		bodyModel[466].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[466].setRotationPoint(33.5F, -5F, -7F);
		bodyModel[466].rotateAngleY = -3.14159265F;

		bodyModel[467].addShapeBox(1F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[467].setRotationPoint(33.5F, -4.5F, -7F);
		bodyModel[467].rotateAngleY = -3.14159265F;

		bodyModel[468].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[468].setRotationPoint(33.5F, -4F, -7F);
		bodyModel[468].rotateAngleY = -3.14159265F;

		bodyModel[469].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[469].setRotationPoint(33.5F, -5F, -7F);
		bodyModel[469].rotateAngleY = -3.14159265F;

		bodyModel[470].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[470].setRotationPoint(33.5F, -3F, -7F);
		bodyModel[470].rotateAngleY = -3.14159265F;

		bodyModel[471].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[471].setRotationPoint(33.5F, -5F, -7F);
		bodyModel[471].rotateAngleY = -3.14159265F;

		bodyModel[472].addShapeBox(1F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[472].setRotationPoint(33.5F, -4.5F, -7F);
		bodyModel[472].rotateAngleY = -3.14159265F;

		bodyModel[473].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[473].setRotationPoint(33.5F, -4F, -7F);
		bodyModel[473].rotateAngleY = -3.14159265F;

		bodyModel[474].addShapeBox(0F, 0F, 0F, 74, 0, 3, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.51F, 0F, 0F, -0.51F); // Box 38 glow
		bodyModel[474].setRotationPoint(-33.49F, -12.99F, 7F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 74, 0, 3, 0F,0F, 0F, -0.01F, -0.02F, 0F, -0.01F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, -0.02F, 0F, -0.01F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38 glow
		bodyModel[475].setRotationPoint(-33.49F, -12.99F, -9.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[476].setRotationPoint(47F, -15F, 1F);

		bodyModel[477].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[477].setRotationPoint(56.5F, 3F, -4F);

		bodyModel[478].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[478].setRotationPoint(-60.5F, 3F, -4F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[479].setRotationPoint(56.5F, 3F, -7.5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[480].setRotationPoint(60.5F, 3F, -7.5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[481].setRotationPoint(60.5F, 3F, -10.5F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[482].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[483].setRotationPoint(60.5F, 4F, -10.5F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[484].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[485].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[486].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[487].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[487].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[488].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[488].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[489].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[489].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[490].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[490].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[491].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[491].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[492].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[492].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[493].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[493].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[494].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[494].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[495].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[495].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[496].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[496].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[497].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[497].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[498].setRotationPoint(56.5F, 3F, 4.5F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[499].setRotationPoint(60.5F, 3F, 4.5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 340, 84, textureX, textureY); // Box 1357
		bodyModel[501] = new ModelRendererTurbo(this, 324, 84, textureX, textureY); // Box 1358
		bodyModel[502] = new ModelRendererTurbo(this, 340, 90, textureX, textureY); // Box 1359
		bodyModel[503] = new ModelRendererTurbo(this, 324, 90, textureX, textureY); // Box 1360
		bodyModel[504] = new ModelRendererTurbo(this, 329, 87, textureX, textureY); // Box 1356
		bodyModel[505] = new ModelRendererTurbo(this, 331, 90, textureX, textureY); // Box 1355
		bodyModel[506] = new ModelRendererTurbo(this, 331, 100, textureX, textureY); // Right step part
		bodyModel[507] = new ModelRendererTurbo(this, 331, 104, textureX, textureY); // Right step part
		bodyModel[508] = new ModelRendererTurbo(this, 331, 94, textureX, textureY); // Right step part
		bodyModel[509] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Right step part
		bodyModel[510] = new ModelRendererTurbo(this, 329, 107, textureX, textureY); // Right step part
		bodyModel[511] = new ModelRendererTurbo(this, 326, 95, textureX, textureY); // Right step part
		bodyModel[512] = new ModelRendererTurbo(this, 340, 95, textureX, textureY); // Right step part
		bodyModel[513] = new ModelRendererTurbo(this, 326, 98, textureX, textureY); // Right step part
		bodyModel[514] = new ModelRendererTurbo(this, 340, 98, textureX, textureY); // Right step part
		bodyModel[515] = new ModelRendererTurbo(this, 326, 100, textureX, textureY); // Right step part
		bodyModel[516] = new ModelRendererTurbo(this, 340, 100, textureX, textureY); // Right step part
		bodyModel[517] = new ModelRendererTurbo(this, 462, 315, textureX, textureY); // Box 128
		bodyModel[518] = new ModelRendererTurbo(this, 386, 319, textureX, textureY); // Box 128

		bodyModel[500].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[500].setRotationPoint(60.5F, 3F, 7.5F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[501].setRotationPoint(56.5F, 3F, 7.5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1359
		bodyModel[502].setRotationPoint(60.5F, 4F, 7.5F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1360
		bodyModel[503].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[504].setRotationPoint(56.51F, 3F, 5F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[505].setRotationPoint(56.51F, 3F, 7F);

		bodyModel[506].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[506].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[507].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[507].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[508].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[508].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[509].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[509].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[510].addShapeBox(0F, 2F, 0.5F, 4, 0, 2, 0F,0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[510].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[511].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[511].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[512].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[512].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[513].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[513].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[514].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[514].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[515].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[515].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[516].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[516].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.665F, 0F, 0F, -0.665F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.665F, 0F, 0F, -0.665F); // Box 128
		bodyModel[517].setRotationPoint(53.5F, 0.99F, -3F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.515F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.675F, -1F, 0F, -0.675F, -0.515F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.675F, -1F, 0F, -0.675F); // Box 128
		bodyModel[518].setRotationPoint(41.5F, 0.99F, -3F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 519; i++)
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
			GL11.glTranslated(-2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}