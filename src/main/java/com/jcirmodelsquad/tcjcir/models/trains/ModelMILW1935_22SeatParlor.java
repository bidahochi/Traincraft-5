//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelMILW_1934_1935_1936_Truck;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelMILW1935_22SeatParlor extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMILW1935_22SeatParlor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[455];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 53, 126, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 33, 189, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 47, 150, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 72, 148, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 316, 110, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 292, 134, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 78, 169, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 274, 169, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 268, 156, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 72, 156, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 14, 166, textureX, textureY); // Box 128
		bodyModel[11] = new ModelRendererTurbo(this, 14, 197, textureX, textureY); // Box 128
		bodyModel[12] = new ModelRendererTurbo(this, 22, 180, textureX, textureY); // Box 128
		bodyModel[13] = new ModelRendererTurbo(this, 8, 180, textureX, textureY); // Box 128
		bodyModel[14] = new ModelRendererTurbo(this, 1, 179, textureX, textureY); // Box 128
		bodyModel[15] = new ModelRendererTurbo(this, 15, 179, textureX, textureY); // Box 128
		bodyModel[16] = new ModelRendererTurbo(this, 1, 197, textureX, textureY); // Box 128
		bodyModel[17] = new ModelRendererTurbo(this, 1, 166, textureX, textureY); // Box 128
		bodyModel[18] = new ModelRendererTurbo(this, 357, 87, textureX, textureY); // Box 128
		bodyModel[19] = new ModelRendererTurbo(this, 357, 118, textureX, textureY); // Box 128
		bodyModel[20] = new ModelRendererTurbo(this, 357, 101, textureX, textureY); // Box 128
		bodyModel[21] = new ModelRendererTurbo(this, 378, 100, textureX, textureY); // Box 128
		bodyModel[22] = new ModelRendererTurbo(this, 364, 100, textureX, textureY); // Box 128
		bodyModel[23] = new ModelRendererTurbo(this, 368, 118, textureX, textureY); // Box 128
		bodyModel[24] = new ModelRendererTurbo(this, 368, 87, textureX, textureY); // Box 128
		bodyModel[25] = new ModelRendererTurbo(this, 371, 101, textureX, textureY); // Box 128
		bodyModel[26] = new ModelRendererTurbo(this, 1, 247, textureX, textureY); // Box 128
		bodyModel[27] = new ModelRendererTurbo(this, 1, 294, textureX, textureY); // Box 128
		bodyModel[28] = new ModelRendererTurbo(this, 35, 166, textureX, textureY); // Box 128
		bodyModel[29] = new ModelRendererTurbo(this, 54, 166, textureX, textureY); // Box 128
		bodyModel[30] = new ModelRendererTurbo(this, 12, 266, textureX, textureY); // Box 128
		bodyModel[31] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 128
		bodyModel[32] = new ModelRendererTurbo(this, 2, 272, textureX, textureY); // Vestibule door Rear
		bodyModel[33] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Right side door rear
		bodyModel[34] = new ModelRendererTurbo(this, 32, 148, textureX, textureY); // Left trapdoor rear
		bodyModel[35] = new ModelRendererTurbo(this, 32, 156, textureX, textureY); // Right trapdoor rear
		bodyModel[36] = new ModelRendererTurbo(this, 59, 63, textureX, textureY); // Left side door rear
		bodyModel[37] = new ModelRendererTurbo(this, 36, 189, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 48, 203, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 56, 189, textureX, textureY); // Box 42
		bodyModel[40] = new ModelRendererTurbo(this, 56, 203, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 72, 109, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 72, 120, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 59, 102, textureX, textureY); // Right side door rear
		bodyModel[44] = new ModelRendererTurbo(this, 59, 78, textureX, textureY); // Left side door rear
		bodyModel[45] = new ModelRendererTurbo(this, 72, 67, textureX, textureY); // Box 38
		bodyModel[46] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 47, 165, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 324, 1, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 72, 18, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 72, 12, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 323, 26, textureX, textureY); // Box 57
		bodyModel[52] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 58
		bodyModel[53] = new ModelRendererTurbo(this, 72, 48, textureX, textureY); // Box 59
		bodyModel[54] = new ModelRendererTurbo(this, 72, 26, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Box 128
		bodyModel[56] = new ModelRendererTurbo(this, 56, 75, textureX, textureY); // Box 128
		bodyModel[57] = new ModelRendererTurbo(this, 53, 75, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 56, 95, textureX, textureY); // Box 202
		bodyModel[59] = new ModelRendererTurbo(this, 53, 95, textureX, textureY); // Box 203
		bodyModel[60] = new ModelRendererTurbo(this, 91, 174, textureX, textureY); // Box 550
		bodyModel[61] = new ModelRendererTurbo(this, 89, 171, textureX, textureY); // Box 551
		bodyModel[62] = new ModelRendererTurbo(this, 91, 180, textureX, textureY); // Box 552
		bodyModel[63] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 553
		bodyModel[64] = new ModelRendererTurbo(this, 90, 189, textureX, textureY); // Box 554
		bodyModel[65] = new ModelRendererTurbo(this, 80, 172, textureX, textureY); // Box 555
		bodyModel[66] = new ModelRendererTurbo(this, 77, 174, textureX, textureY); // Box 556
		bodyModel[67] = new ModelRendererTurbo(this, 89, 183, textureX, textureY); // Box 557
		bodyModel[68] = new ModelRendererTurbo(this, 91, 186, textureX, textureY); // Box 558
		bodyModel[69] = new ModelRendererTurbo(this, 100, 172, textureX, textureY); // Box 559
		bodyModel[70] = new ModelRendererTurbo(this, 111, 174, textureX, textureY); // Box 560
		bodyModel[71] = new ModelRendererTurbo(this, 91, 169, textureX, textureY); // Box 551
		bodyModel[72] = new ModelRendererTurbo(this, 80, 170, textureX, textureY); // Box 555
		bodyModel[73] = new ModelRendererTurbo(this, 100, 170, textureX, textureY); // Box 559
		bodyModel[74] = new ModelRendererTurbo(this, 91, 196, textureX, textureY); // Box 82
		bodyModel[75] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 83
		bodyModel[76] = new ModelRendererTurbo(this, 91, 202, textureX, textureY); // Box 84
		bodyModel[77] = new ModelRendererTurbo(this, 89, 199, textureX, textureY); // Box 85
		bodyModel[78] = new ModelRendererTurbo(this, 90, 211, textureX, textureY); // Box 86
		bodyModel[79] = new ModelRendererTurbo(this, 80, 194, textureX, textureY); // Box 87
		bodyModel[80] = new ModelRendererTurbo(this, 77, 196, textureX, textureY); // Box 88
		bodyModel[81] = new ModelRendererTurbo(this, 89, 205, textureX, textureY); // Box 89
		bodyModel[82] = new ModelRendererTurbo(this, 91, 208, textureX, textureY); // Box 90
		bodyModel[83] = new ModelRendererTurbo(this, 100, 194, textureX, textureY); // Box 91
		bodyModel[84] = new ModelRendererTurbo(this, 111, 196, textureX, textureY); // Box 92
		bodyModel[85] = new ModelRendererTurbo(this, 91, 191, textureX, textureY); // Box 93
		bodyModel[86] = new ModelRendererTurbo(this, 80, 192, textureX, textureY); // Box 94
		bodyModel[87] = new ModelRendererTurbo(this, 100, 192, textureX, textureY); // Box 95
		bodyModel[88] = new ModelRendererTurbo(this, 315, 136, textureX, textureY); // Left trapdoor front
		bodyModel[89] = new ModelRendererTurbo(this, 315, 144, textureX, textureY); // Right trapdoor front
		bodyModel[90] = new ModelRendererTurbo(this, 265, 174, textureX, textureY); // Box 550
		bodyModel[91] = new ModelRendererTurbo(this, 265, 180, textureX, textureY); // Box 552
		bodyModel[92] = new ModelRendererTurbo(this, 263, 177, textureX, textureY); // Box 553
		bodyModel[93] = new ModelRendererTurbo(this, 264, 189, textureX, textureY); // Box 554
		bodyModel[94] = new ModelRendererTurbo(this, 254, 172, textureX, textureY); // Box 555
		bodyModel[95] = new ModelRendererTurbo(this, 251, 174, textureX, textureY); // Box 556
		bodyModel[96] = new ModelRendererTurbo(this, 263, 183, textureX, textureY); // Box 557
		bodyModel[97] = new ModelRendererTurbo(this, 265, 186, textureX, textureY); // Box 558
		bodyModel[98] = new ModelRendererTurbo(this, 274, 172, textureX, textureY); // Box 559
		bodyModel[99] = new ModelRendererTurbo(this, 285, 174, textureX, textureY); // Box 560
		bodyModel[100] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 551
		bodyModel[101] = new ModelRendererTurbo(this, 254, 170, textureX, textureY); // Box 555
		bodyModel[102] = new ModelRendererTurbo(this, 274, 170, textureX, textureY); // Box 559
		bodyModel[103] = new ModelRendererTurbo(this, 265, 196, textureX, textureY); // Box 82
		bodyModel[104] = new ModelRendererTurbo(this, 263, 193, textureX, textureY); // Box 83
		bodyModel[105] = new ModelRendererTurbo(this, 265, 202, textureX, textureY); // Box 84
		bodyModel[106] = new ModelRendererTurbo(this, 263, 199, textureX, textureY); // Box 85
		bodyModel[107] = new ModelRendererTurbo(this, 264, 211, textureX, textureY); // Box 86
		bodyModel[108] = new ModelRendererTurbo(this, 254, 194, textureX, textureY); // Box 87
		bodyModel[109] = new ModelRendererTurbo(this, 251, 196, textureX, textureY); // Box 88
		bodyModel[110] = new ModelRendererTurbo(this, 263, 205, textureX, textureY); // Box 89
		bodyModel[111] = new ModelRendererTurbo(this, 265, 208, textureX, textureY); // Box 90
		bodyModel[112] = new ModelRendererTurbo(this, 274, 194, textureX, textureY); // Box 91
		bodyModel[113] = new ModelRendererTurbo(this, 285, 196, textureX, textureY); // Box 92
		bodyModel[114] = new ModelRendererTurbo(this, 265, 191, textureX, textureY); // Box 93
		bodyModel[115] = new ModelRendererTurbo(this, 254, 192, textureX, textureY); // Box 94
		bodyModel[116] = new ModelRendererTurbo(this, 274, 192, textureX, textureY); // Box 95
		bodyModel[117] = new ModelRendererTurbo(this, 263, 171, textureX, textureY); // Box 551
		bodyModel[118] = new ModelRendererTurbo(this, 495, 228, textureX, textureY); // Box 128
		bodyModel[119] = new ModelRendererTurbo(this, 495, 275, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 486, 247, textureX, textureY); // Box 128
		bodyModel[121] = new ModelRendererTurbo(this, 497, 253, textureX, textureY); // Vestibule door Front
		bodyModel[122] = new ModelRendererTurbo(this, 379, 4, textureX, textureY); // Box 128
		bodyModel[123] = new ModelRendererTurbo(this, 459, 66, textureX, textureY); // Box 128
		bodyModel[124] = new ModelRendererTurbo(this, 293, 87, textureX, textureY); // Right side door front
		bodyModel[125] = new ModelRendererTurbo(this, 293, 68, textureX, textureY); // Left side door front
		bodyModel[126] = new ModelRendererTurbo(this, 293, 102, textureX, textureY); // Right side door front
		bodyModel[127] = new ModelRendererTurbo(this, 306, 71, textureX, textureY); // Left side door front
		bodyModel[128] = new ModelRendererTurbo(this, 309, 75, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 306, 75, textureX, textureY); // Box 128
		bodyModel[130] = new ModelRendererTurbo(this, 309, 95, textureX, textureY); // Box 202
		bodyModel[131] = new ModelRendererTurbo(this, 306, 95, textureX, textureY); // Box 203
		bodyModel[132] = new ModelRendererTurbo(this, 338, 87, textureX, textureY); // Box 128
		bodyModel[133] = new ModelRendererTurbo(this, 319, 87, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 339, 110, textureX, textureY); // Box 2
		bodyModel[135] = new ModelRendererTurbo(this, 339, 124, textureX, textureY); // Box 2
		bodyModel[136] = new ModelRendererTurbo(this, 319, 110, textureX, textureY); // Box 42
		bodyModel[137] = new ModelRendererTurbo(this, 331, 124, textureX, textureY); // Box 43
		bodyModel[138] = new ModelRendererTurbo(this, 330, 86, textureX, textureY); // Box 128
		bodyModel[139] = new ModelRendererTurbo(this, 243, 7, textureX, textureY); // Box 59
		bodyModel[140] = new ModelRendererTurbo(this, 246, 2, textureX, textureY); // Box 169
		bodyModel[141] = new ModelRendererTurbo(this, 254, 10, textureX, textureY); // Box 59
		bodyModel[142] = new ModelRendererTurbo(this, 243, 5, textureX, textureY); // Box 171
		bodyModel[143] = new ModelRendererTurbo(this, 398, 290, textureX, textureY); // Box 38
		bodyModel[144] = new ModelRendererTurbo(this, 120, 263, textureX, textureY); // Box 38
		bodyModel[145] = new ModelRendererTurbo(this, 72, 84, textureX, textureY); // Box 128
		bodyModel[146] = new ModelRendererTurbo(this, 72, 64, textureX, textureY); // Box 210
		bodyModel[147] = new ModelRendererTurbo(this, 235, 60, textureX, textureY); // Box 210
		bodyModel[148] = new ModelRendererTurbo(this, 235, 62, textureX, textureY); // Box 212
		bodyModel[149] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 57
		bodyModel[150] = new ModelRendererTurbo(this, 367, 30, textureX, textureY); // Box 38
		bodyModel[151] = new ModelRendererTurbo(this, 22, 96, textureX, textureY); // Box 38
		bodyModel[152] = new ModelRendererTurbo(this, 391, 33, textureX, textureY); // Box 38
		bodyModel[153] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 128
		bodyModel[154] = new ModelRendererTurbo(this, 72, 3, textureX, textureY); // Box 221
		bodyModel[155] = new ModelRendererTurbo(this, 1, 94, textureX, textureY); // Box 38
		bodyModel[156] = new ModelRendererTurbo(this, 340, 33, textureX, textureY); // Box 38
		bodyModel[157] = new ModelRendererTurbo(this, 355, 46, textureX, textureY); // Box 38
		bodyModel[158] = new ModelRendererTurbo(this, 471, 234, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[159] = new ModelRendererTurbo(this, 1, 235, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[160] = new ModelRendererTurbo(this, 31, 288, textureX, textureY); // Box 38
		bodyModel[161] = new ModelRendererTurbo(this, 464, 241, textureX, textureY); // Box 232
		bodyModel[162] = new ModelRendererTurbo(this, 19, 288, textureX, textureY); // Box 38
		bodyModel[163] = new ModelRendererTurbo(this, 483, 273, textureX, textureY); // Box 234
		bodyModel[164] = new ModelRendererTurbo(this, 447, 44, textureX, textureY); // Box 38
		bodyModel[165] = new ModelRendererTurbo(this, 349, 1, textureX, textureY); // Box 38
		bodyModel[166] = new ModelRendererTurbo(this, 488, 305, textureX, textureY); // Box 232
		bodyModel[167] = new ModelRendererTurbo(this, 1, 34, textureX, textureY); // Box 38
		bodyModel[168] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 38
		bodyModel[169] = new ModelRendererTurbo(this, 83, 262, textureX, textureY); // Box 232
		bodyModel[170] = new ModelRendererTurbo(this, 89, 262, textureX, textureY); // Box 232
		bodyModel[171] = new ModelRendererTurbo(this, 32, 39, textureX, textureY); // Box 232
		bodyModel[172] = new ModelRendererTurbo(this, 32, 31, textureX, textureY); // Box 232
		bodyModel[173] = new ModelRendererTurbo(this, 413, 48, textureX, textureY); // Box 247
		bodyModel[174] = new ModelRendererTurbo(this, 483, 305, textureX, textureY); // Box 232
		bodyModel[175] = new ModelRendererTurbo(this, 457, 305, textureX, textureY); // Box 232
		bodyModel[176] = new ModelRendererTurbo(this, 445, 300, textureX, textureY); // Box 232
		bodyModel[177] = new ModelRendererTurbo(this, 433, 305, textureX, textureY); // Box 232
		bodyModel[178] = new ModelRendererTurbo(this, 448, 305, textureX, textureY); // Box 232
		bodyModel[179] = new ModelRendererTurbo(this, 447, 303, textureX, textureY); // Box 232
		bodyModel[180] = new ModelRendererTurbo(this, 426, 9, textureX, textureY); // Box 262
		bodyModel[181] = new ModelRendererTurbo(this, 323, 6, textureX, textureY); // Box 263
		bodyModel[182] = new ModelRendererTurbo(this, 74, 115, textureX, textureY); // Box 43
		bodyModel[183] = new ModelRendererTurbo(this, 74, 104, textureX, textureY); // Box 266
		bodyModel[184] = new ModelRendererTurbo(this, 72, 152, textureX, textureY); // Box 267
		bodyModel[185] = new ModelRendererTurbo(this, 257, 156, textureX, textureY); // Box 2
		bodyModel[186] = new ModelRendererTurbo(this, 255, 160, textureX, textureY); // Box 2
		bodyModel[187] = new ModelRendererTurbo(this, 241, 156, textureX, textureY); // Box 2
		bodyModel[188] = new ModelRendererTurbo(this, 227, 158, textureX, textureY); // Box 271
		bodyModel[189] = new ModelRendererTurbo(this, 99, 156, textureX, textureY); // Box 2
		bodyModel[190] = new ModelRendererTurbo(this, 97, 160, textureX, textureY); // Box 2
		bodyModel[191] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 2
		bodyModel[192] = new ModelRendererTurbo(this, 115, 158, textureX, textureY); // Box 271
		bodyModel[193] = new ModelRendererTurbo(this, 72, 8, textureX, textureY); // Box 221
		bodyModel[194] = new ModelRendererTurbo(this, 316, 31, textureX, textureY); // Box 38
		bodyModel[195] = new ModelRendererTurbo(this, 362, 48, textureX, textureY); // Box 273
		bodyModel[196] = new ModelRendererTurbo(this, 72, 58, textureX, textureY); // Box 274
		bodyModel[197] = new ModelRendererTurbo(this, 72, 54, textureX, textureY); // Box 275
		bodyModel[198] = new ModelRendererTurbo(this, 37, 109, textureX, textureY); // Box 276
		bodyModel[199] = new ModelRendererTurbo(this, 25, 120, textureX, textureY); // Box 38
		bodyModel[200] = new ModelRendererTurbo(this, 47, 135, textureX, textureY); // Box 38
		bodyModel[201] = new ModelRendererTurbo(this, 39, 133, textureX, textureY); // Box 273
		bodyModel[202] = new ModelRendererTurbo(this, 1, 118, textureX, textureY); // Box 38
		bodyModel[203] = new ModelRendererTurbo(this, 457, 26, textureX, textureY); // Box 38
		bodyModel[204] = new ModelRendererTurbo(this, 475, 37, textureX, textureY); // Box 38
		bodyModel[205] = new ModelRendererTurbo(this, 456, 9, textureX, textureY); // Box 38
		bodyModel[206] = new ModelRendererTurbo(this, 413, 30, textureX, textureY); // Box 38
		bodyModel[207] = new ModelRendererTurbo(this, 431, 41, textureX, textureY); // Box 38
		bodyModel[208] = new ModelRendererTurbo(this, 431, 24, textureX, textureY); // Box 38
		bodyModel[209] = new ModelRendererTurbo(this, 429, 20, textureX, textureY); // Box 274
		bodyModel[210] = new ModelRendererTurbo(this, 429, 16, textureX, textureY); // Box 275
		bodyModel[211] = new ModelRendererTurbo(this, 21, 76, textureX, textureY); // Box 290
		bodyModel[212] = new ModelRendererTurbo(this, 1, 85, textureX, textureY); // Box 291
		bodyModel[213] = new ModelRendererTurbo(this, 1, 74, textureX, textureY); // Box 292
		bodyModel[214] = new ModelRendererTurbo(this, 1, 56, textureX, textureY); // Box 293
		bodyModel[215] = new ModelRendererTurbo(this, 1, 67, textureX, textureY); // Box 294
		bodyModel[216] = new ModelRendererTurbo(this, 21, 59, textureX, textureY); // Box 295
		bodyModel[217] = new ModelRendererTurbo(this, 35, 46, textureX, textureY); // Box 296
		bodyModel[218] = new ModelRendererTurbo(this, 35, 50, textureX, textureY); // Box 297
		bodyModel[219] = new ModelRendererTurbo(this, 386, 304, textureX, textureY,"lamp"); // Box 262 glow
		bodyModel[220] = new ModelRendererTurbo(this, 53, 274, textureX, textureY,"lamp"); // Box 232 glow
		bodyModel[221] = new ModelRendererTurbo(this, 306, 243, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[222] = new ModelRendererTurbo(this, 311, 252, textureX, textureY); // Box 38
		bodyModel[223] = new ModelRendererTurbo(this, 406, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[224] = new ModelRendererTurbo(this, 399, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[225] = new ModelRendererTurbo(this, 392, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[226] = new ModelRendererTurbo(this, 385, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[227] = new ModelRendererTurbo(this, 378, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[228] = new ModelRendererTurbo(this, 371, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[229] = new ModelRendererTurbo(this, 364, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[230] = new ModelRendererTurbo(this, 357, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[231] = new ModelRendererTurbo(this, 350, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[232] = new ModelRendererTurbo(this, 343, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[233] = new ModelRendererTurbo(this, 336, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[234] = new ModelRendererTurbo(this, 329, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[235] = new ModelRendererTurbo(this, 306, 263, textureX, textureY,"cull"); // Box 296 cull
		bodyModel[236] = new ModelRendererTurbo(this, 311, 272, textureX, textureY); // Box 297
		bodyModel[237] = new ModelRendererTurbo(this, 406, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[238] = new ModelRendererTurbo(this, 399, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[239] = new ModelRendererTurbo(this, 392, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[240] = new ModelRendererTurbo(this, 385, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[241] = new ModelRendererTurbo(this, 378, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[242] = new ModelRendererTurbo(this, 371, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[243] = new ModelRendererTurbo(this, 364, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[244] = new ModelRendererTurbo(this, 357, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[245] = new ModelRendererTurbo(this, 350, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[246] = new ModelRendererTurbo(this, 343, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[247] = new ModelRendererTurbo(this, 336, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[248] = new ModelRendererTurbo(this, 329, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[249] = new ModelRendererTurbo(this, 311, 238, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[250] = new ModelRendererTurbo(this, 311, 258, textureX, textureY,"cull"); // Box 313 cull
		bodyModel[251] = new ModelRendererTurbo(this, 306, 68, textureX, textureY); // Left side door front
		bodyModel[252] = new ModelRendererTurbo(this, 306, 87, textureX, textureY); // Right side door front
		bodyModel[253] = new ModelRendererTurbo(this, 59, 60, textureX, textureY); // Left side door rear
		bodyModel[254] = new ModelRendererTurbo(this, 59, 84, textureX, textureY); // Right side door rear
		bodyModel[255] = new ModelRendererTurbo(this, 235, 303, textureX, textureY); // Right seat part
		bodyModel[256] = new ModelRendererTurbo(this, 235, 280, textureX, textureY); // Left seat part
		bodyModel[257] = new ModelRendererTurbo(this, 229, 313, textureX, textureY); // Right seat part
		bodyModel[258] = new ModelRendererTurbo(this, 229, 290, textureX, textureY); // Left seat part
		bodyModel[259] = new ModelRendererTurbo(this, 250, 308, textureX, textureY); // Right seat part
		bodyModel[260] = new ModelRendererTurbo(this, 250, 323, textureX, textureY); // Right seat part
		bodyModel[261] = new ModelRendererTurbo(this, 250, 286, textureX, textureY); // Left seat part
		bodyModel[262] = new ModelRendererTurbo(this, 250, 298, textureX, textureY); // Left seat part
		bodyModel[263] = new ModelRendererTurbo(this, 250, 311, textureX, textureY); // Right seat part
		bodyModel[264] = new ModelRendererTurbo(this, 250, 320, textureX, textureY); // Right seat part
		bodyModel[265] = new ModelRendererTurbo(this, 250, 283, textureX, textureY); // Left seat part
		bodyModel[266] = new ModelRendererTurbo(this, 250, 295, textureX, textureY); // Left seat part
		bodyModel[267] = new ModelRendererTurbo(this, 198, 303, textureX, textureY); // Right seat part
		bodyModel[268] = new ModelRendererTurbo(this, 198, 280, textureX, textureY); // Left seat part
		bodyModel[269] = new ModelRendererTurbo(this, 192, 313, textureX, textureY); // Right seat part
		bodyModel[270] = new ModelRendererTurbo(this, 192, 290, textureX, textureY); // Left seat part
		bodyModel[271] = new ModelRendererTurbo(this, 213, 308, textureX, textureY); // Right seat part
		bodyModel[272] = new ModelRendererTurbo(this, 213, 323, textureX, textureY); // Right seat part
		bodyModel[273] = new ModelRendererTurbo(this, 213, 286, textureX, textureY); // Left seat part
		bodyModel[274] = new ModelRendererTurbo(this, 213, 298, textureX, textureY); // Left seat part
		bodyModel[275] = new ModelRendererTurbo(this, 213, 311, textureX, textureY); // Right seat part
		bodyModel[276] = new ModelRendererTurbo(this, 213, 320, textureX, textureY); // Right seat part
		bodyModel[277] = new ModelRendererTurbo(this, 213, 283, textureX, textureY); // Left seat part
		bodyModel[278] = new ModelRendererTurbo(this, 213, 295, textureX, textureY); // Left seat part
		bodyModel[279] = new ModelRendererTurbo(this, 272, 303, textureX, textureY); // Right seat part
		bodyModel[280] = new ModelRendererTurbo(this, 272, 280, textureX, textureY); // Left seat part
		bodyModel[281] = new ModelRendererTurbo(this, 266, 313, textureX, textureY); // Right seat part
		bodyModel[282] = new ModelRendererTurbo(this, 266, 290, textureX, textureY); // Left seat part
		bodyModel[283] = new ModelRendererTurbo(this, 287, 308, textureX, textureY); // Right seat part
		bodyModel[284] = new ModelRendererTurbo(this, 287, 323, textureX, textureY); // Right seat part
		bodyModel[285] = new ModelRendererTurbo(this, 287, 286, textureX, textureY); // Left seat part
		bodyModel[286] = new ModelRendererTurbo(this, 287, 298, textureX, textureY); // Left seat part
		bodyModel[287] = new ModelRendererTurbo(this, 287, 311, textureX, textureY); // Right seat part
		bodyModel[288] = new ModelRendererTurbo(this, 287, 320, textureX, textureY); // Right seat part
		bodyModel[289] = new ModelRendererTurbo(this, 287, 283, textureX, textureY); // Left seat part
		bodyModel[290] = new ModelRendererTurbo(this, 287, 295, textureX, textureY); // Left seat part
		bodyModel[291] = new ModelRendererTurbo(this, 309, 303, textureX, textureY); // Right seat part
		bodyModel[292] = new ModelRendererTurbo(this, 309, 280, textureX, textureY); // Left seat part
		bodyModel[293] = new ModelRendererTurbo(this, 303, 313, textureX, textureY); // Right seat part
		bodyModel[294] = new ModelRendererTurbo(this, 303, 290, textureX, textureY); // Left seat part
		bodyModel[295] = new ModelRendererTurbo(this, 324, 308, textureX, textureY); // Right seat part
		bodyModel[296] = new ModelRendererTurbo(this, 324, 323, textureX, textureY); // Right seat part
		bodyModel[297] = new ModelRendererTurbo(this, 324, 286, textureX, textureY); // Left seat part
		bodyModel[298] = new ModelRendererTurbo(this, 324, 298, textureX, textureY); // Left seat part
		bodyModel[299] = new ModelRendererTurbo(this, 324, 311, textureX, textureY); // Right seat part
		bodyModel[300] = new ModelRendererTurbo(this, 324, 320, textureX, textureY); // Right seat part
		bodyModel[301] = new ModelRendererTurbo(this, 324, 283, textureX, textureY); // Left seat part
		bodyModel[302] = new ModelRendererTurbo(this, 324, 295, textureX, textureY); // Left seat part
		bodyModel[303] = new ModelRendererTurbo(this, 346, 303, textureX, textureY); // Right seat part
		bodyModel[304] = new ModelRendererTurbo(this, 346, 280, textureX, textureY); // Left seat part
		bodyModel[305] = new ModelRendererTurbo(this, 340, 313, textureX, textureY); // Right seat part
		bodyModel[306] = new ModelRendererTurbo(this, 340, 290, textureX, textureY); // Left seat part
		bodyModel[307] = new ModelRendererTurbo(this, 361, 308, textureX, textureY); // Right seat part
		bodyModel[308] = new ModelRendererTurbo(this, 361, 323, textureX, textureY); // Right seat part
		bodyModel[309] = new ModelRendererTurbo(this, 361, 286, textureX, textureY); // Left seat part
		bodyModel[310] = new ModelRendererTurbo(this, 361, 298, textureX, textureY); // Left seat part
		bodyModel[311] = new ModelRendererTurbo(this, 361, 311, textureX, textureY); // Right seat part
		bodyModel[312] = new ModelRendererTurbo(this, 361, 320, textureX, textureY); // Right seat part
		bodyModel[313] = new ModelRendererTurbo(this, 361, 283, textureX, textureY); // Left seat part
		bodyModel[314] = new ModelRendererTurbo(this, 361, 295, textureX, textureY); // Left seat part
		bodyModel[315] = new ModelRendererTurbo(this, 144, 296, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[316] = new ModelRendererTurbo(this, 145, 308, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[317] = new ModelRendererTurbo(this, 21, 249, textureX, textureY); // Box 128
		bodyModel[318] = new ModelRendererTurbo(this, 494, 300, textureX, textureY); // Box 463
		bodyModel[319] = new ModelRendererTurbo(this, 81, 235, textureX, textureY); // Box 38
		bodyModel[320] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Box 462
		bodyModel[321] = new ModelRendererTurbo(this, 18, 306, textureX, textureY); // Box 38
		bodyModel[322] = new ModelRendererTurbo(this, 21, 311, textureX, textureY); // Box 38
		bodyModel[323] = new ModelRendererTurbo(this, 20, 315, textureX, textureY); // Box 38
		bodyModel[324] = new ModelRendererTurbo(this, 482, 291, textureX, textureY); // Box 38
		bodyModel[325] = new ModelRendererTurbo(this, 485, 296, textureX, textureY); // Box 38
		bodyModel[326] = new ModelRendererTurbo(this, 484, 300, textureX, textureY); // Box 38
		bodyModel[327] = new ModelRendererTurbo(this, 470, 306, textureX, textureY); // Box 232
		bodyModel[328] = new ModelRendererTurbo(this, 465, 273, textureX, textureY); // Box 380
		bodyModel[329] = new ModelRendererTurbo(this, 472, 273, textureX, textureY); // Box 381
		bodyModel[330] = new ModelRendererTurbo(this, 477, 277, textureX, textureY); // Box 382
		bodyModel[331] = new ModelRendererTurbo(this, 64, 303, textureX, textureY); // Box 380
		bodyModel[332] = new ModelRendererTurbo(this, 62, 308, textureX, textureY); // Box 381
		bodyModel[333] = new ModelRendererTurbo(this, 67, 312, textureX, textureY); // Box 382
		bodyModel[334] = new ModelRendererTurbo(this, 454, 278, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[335] = new ModelRendererTurbo(this, 448, 245, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[336] = new ModelRendererTurbo(this, 434, 252, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[337] = new ModelRendererTurbo(this, 460, 252, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[338] = new ModelRendererTurbo(this, 69, 276, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[339] = new ModelRendererTurbo(this, 76, 276, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[340] = new ModelRendererTurbo(this, 435, 233, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[341] = new ModelRendererTurbo(this, 440, 242, textureX, textureY); // Box 38
		bodyModel[342] = new ModelRendererTurbo(this, 422, 265, textureX, textureY); // Boc 42
		bodyModel[343] = new ModelRendererTurbo(this, 436, 300, textureX, textureY); // Boc 42
		bodyModel[344] = new ModelRendererTurbo(this, 417, 284, textureX, textureY); // Boc 42
		bodyModel[345] = new ModelRendererTurbo(this, 421, 293, textureX, textureY); // Boc 42
		bodyModel[346] = new ModelRendererTurbo(this, 437, 293, textureX, textureY); // Boc 42
		bodyModel[347] = new ModelRendererTurbo(this, 421, 290, textureX, textureY); // Boc 42
		bodyModel[348] = new ModelRendererTurbo(this, 437, 290, textureX, textureY); // Boc 42
		bodyModel[349] = new ModelRendererTurbo(this, 418, 300, textureX, textureY); // Boc 42
		bodyModel[350] = new ModelRendererTurbo(this, 427, 300, textureX, textureY); // Boc 42
		bodyModel[351] = new ModelRendererTurbo(this, 441, 259, textureX, textureY); // Boc 42
		bodyModel[352] = new ModelRendererTurbo(this, 440, 273, textureX, textureY); // Boc 42
		bodyModel[353] = new ModelRendererTurbo(this, 438, 266, textureX, textureY); // Boc 42
		bodyModel[354] = new ModelRendererTurbo(this, 441, 253, textureX, textureY); // Boc 42
		bodyModel[355] = new ModelRendererTurbo(this, 450, 253, textureX, textureY); // Boc 42
		bodyModel[356] = new ModelRendererTurbo(this, 441, 248, textureX, textureY); // Boc 42
		bodyModel[357] = new ModelRendererTurbo(this, 450, 248, textureX, textureY); // Boc 42
		bodyModel[358] = new ModelRendererTurbo(this, 449, 273, textureX, textureY); // Boc 42
		bodyModel[359] = new ModelRendererTurbo(this, 457, 286, textureX, textureY); // Box 498
		bodyModel[360] = new ModelRendererTurbo(this, 460, 300, textureX, textureY); // Box 499
		bodyModel[361] = new ModelRendererTurbo(this, 454, 293, textureX, textureY); // Box 500
		bodyModel[362] = new ModelRendererTurbo(this, 449, 291, textureX, textureY); // Box 501
		bodyModel[363] = new ModelRendererTurbo(this, 473, 290, textureX, textureY); // Box 502
		bodyModel[364] = new ModelRendererTurbo(this, 448, 286, textureX, textureY); // Box 503
		bodyModel[365] = new ModelRendererTurbo(this, 474, 285, textureX, textureY); // Box 504
		bodyModel[366] = new ModelRendererTurbo(this, 469, 300, textureX, textureY); // Box 505
		bodyModel[367] = new ModelRendererTurbo(this, 104, 283, textureX, textureY); // Boc 42
		bodyModel[368] = new ModelRendererTurbo(this, 105, 318, textureX, textureY); // Boc 42
		bodyModel[369] = new ModelRendererTurbo(this, 102, 302, textureX, textureY); // Boc 42
		bodyModel[370] = new ModelRendererTurbo(this, 106, 311, textureX, textureY); // Boc 42
		bodyModel[371] = new ModelRendererTurbo(this, 106, 292, textureX, textureY); // Boc 42
		bodyModel[372] = new ModelRendererTurbo(this, 106, 308, textureX, textureY); // Boc 42
		bodyModel[373] = new ModelRendererTurbo(this, 106, 289, textureX, textureY); // Boc 42
		bodyModel[374] = new ModelRendererTurbo(this, 123, 318, textureX, textureY); // Boc 42
		bodyModel[375] = new ModelRendererTurbo(this, 114, 318, textureX, textureY); // Boc 42
		bodyModel[376] = new ModelRendererTurbo(this, 84, 282, textureX, textureY); // Boc 42
		bodyModel[377] = new ModelRendererTurbo(this, 81, 289, textureX, textureY); // Boc 42
		bodyModel[378] = new ModelRendererTurbo(this, 75, 287, textureX, textureY); // Boc 42
		bodyModel[379] = new ModelRendererTurbo(this, 95, 287, textureX, textureY); // Boc 42
		bodyModel[380] = new ModelRendererTurbo(this, 75, 282, textureX, textureY); // Boc 42
		bodyModel[381] = new ModelRendererTurbo(this, 95, 282, textureX, textureY); // Boc 42
		bodyModel[382] = new ModelRendererTurbo(this, 85, 296, textureX, textureY); // Boc 42
		bodyModel[383] = new ModelRendererTurbo(this, 84, 301, textureX, textureY); // Box 498
		bodyModel[384] = new ModelRendererTurbo(this, 81, 308, textureX, textureY); // Box 500
		bodyModel[385] = new ModelRendererTurbo(this, 75, 306, textureX, textureY); // Box 501
		bodyModel[386] = new ModelRendererTurbo(this, 95, 306, textureX, textureY); // Box 502
		bodyModel[387] = new ModelRendererTurbo(this, 75, 301, textureX, textureY); // Box 503
		bodyModel[388] = new ModelRendererTurbo(this, 95, 301, textureX, textureY); // Box 504
		bodyModel[389] = new ModelRendererTurbo(this, 85, 315, textureX, textureY); // Box 505
		bodyModel[390] = new ModelRendererTurbo(this, 135, 185, textureX, textureY); // Box 2
		bodyModel[391] = new ModelRendererTurbo(this, 173, 185, textureX, textureY); // Box 2
		bodyModel[392] = new ModelRendererTurbo(this, 173, 193, textureX, textureY); // Box 2
		bodyModel[393] = new ModelRendererTurbo(this, 167, 185, textureX, textureY); // Box 2
		bodyModel[394] = new ModelRendererTurbo(this, 132, 185, textureX, textureY); // Box 2
		bodyModel[395] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 2
		bodyModel[396] = new ModelRendererTurbo(this, 166, 171, textureX, textureY); // Box 667
		bodyModel[397] = new ModelRendererTurbo(this, 197, 171, textureX, textureY); // Box 668
		bodyModel[398] = new ModelRendererTurbo(this, 154, 171, textureX, textureY); // Box 667
		bodyModel[399] = new ModelRendererTurbo(this, 165, 171, textureX, textureY); // Box 667
		bodyModel[400] = new ModelRendererTurbo(this, 142, 174, textureX, textureY); // Box 667
		bodyModel[401] = new ModelRendererTurbo(this, 145, 171, textureX, textureY,"cull"); // Box 667 cull
		bodyModel[402] = new ModelRendererTurbo(this, 172, 185, textureX, textureY); // Box 2
		bodyModel[403] = new ModelRendererTurbo(this, 158, 180, textureX, textureY); // Box 41
		bodyModel[404] = new ModelRendererTurbo(this, 141, 180, textureX, textureY); // Box 41
		bodyModel[405] = new ModelRendererTurbo(this, 207, 196, textureX, textureY); // Box 538
		bodyModel[406] = new ModelRendererTurbo(this, 206, 187, textureX, textureY,"cull"); // Box 538 cull
		bodyModel[407] = new ModelRendererTurbo(this, 208, 194, textureX, textureY); // Box 538
		bodyModel[408] = new ModelRendererTurbo(this, 207, 185, textureX, textureY); // Box 538
		bodyModel[409] = new ModelRendererTurbo(this, 113, 170, textureX, textureY); // Box 538
		bodyModel[410] = new ModelRendererTurbo(this, 132, 174, textureX, textureY,"cull"); // Box 668 cull
		bodyModel[411] = new ModelRendererTurbo(this, 134, 172, textureX, textureY); // Box 669
		bodyModel[412] = new ModelRendererTurbo(this, 133, 181, textureX, textureY); // Box 670
		bodyModel[413] = new ModelRendererTurbo(this, 87, 247, textureX, textureY); // Box 38
		bodyModel[414] = new ModelRendererTurbo(this, 87, 253, textureX, textureY); // Box 452
		bodyModel[415] = new ModelRendererTurbo(this, 87, 249, textureX, textureY); // Box 38
		bodyModel[416] = new ModelRendererTurbo(this, 87, 255, textureX, textureY); // Box 452
		bodyModel[417] = new ModelRendererTurbo(this, 311, 234, textureX, textureY); // Box 38
		bodyModel[418] = new ModelRendererTurbo(this, 311, 236, textureX, textureY); // Box 526
		bodyModel[419] = new ModelRendererTurbo(this, 440, 231, textureX, textureY); // Box 38
		bodyModel[420] = new ModelRendererTurbo(this, 213, 303, textureX, textureY); // Right seat part
		bodyModel[421] = new ModelRendererTurbo(this, 213, 315, textureX, textureY); // Right seat part
		bodyModel[422] = new ModelRendererTurbo(this, 250, 303, textureX, textureY); // Right seat part
		bodyModel[423] = new ModelRendererTurbo(this, 250, 315, textureX, textureY); // Right seat part
		bodyModel[424] = new ModelRendererTurbo(this, 287, 303, textureX, textureY); // Right seat part
		bodyModel[425] = new ModelRendererTurbo(this, 287, 315, textureX, textureY); // Right seat part
		bodyModel[426] = new ModelRendererTurbo(this, 324, 303, textureX, textureY); // Right seat part
		bodyModel[427] = new ModelRendererTurbo(this, 324, 315, textureX, textureY); // Right seat part
		bodyModel[428] = new ModelRendererTurbo(this, 361, 303, textureX, textureY); // Right seat part
		bodyModel[429] = new ModelRendererTurbo(this, 361, 315, textureX, textureY); // Right seat part
		bodyModel[430] = new ModelRendererTurbo(this, 361, 278, textureX, textureY); // Left seat part
		bodyModel[431] = new ModelRendererTurbo(this, 361, 290, textureX, textureY); // Left seat part
		bodyModel[432] = new ModelRendererTurbo(this, 324, 278, textureX, textureY); // Left seat part
		bodyModel[433] = new ModelRendererTurbo(this, 324, 290, textureX, textureY); // Left seat part
		bodyModel[434] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // Left seat part
		bodyModel[435] = new ModelRendererTurbo(this, 287, 290, textureX, textureY); // Left seat part
		bodyModel[436] = new ModelRendererTurbo(this, 250, 278, textureX, textureY); // Left seat part
		bodyModel[437] = new ModelRendererTurbo(this, 250, 290, textureX, textureY); // Left seat part
		bodyModel[438] = new ModelRendererTurbo(this, 213, 278, textureX, textureY); // Left seat part
		bodyModel[439] = new ModelRendererTurbo(this, 213, 290, textureX, textureY); // Left seat part
		bodyModel[440] = new ModelRendererTurbo(this, 235, 320, textureX, textureY); // Right seat part base
		bodyModel[441] = new ModelRendererTurbo(this, 198, 320, textureX, textureY); // Right seat part base
		bodyModel[442] = new ModelRendererTurbo(this, 198, 297, textureX, textureY); // Left seat part base
		bodyModel[443] = new ModelRendererTurbo(this, 309, 297, textureX, textureY); // Left seat part base
		bodyModel[444] = new ModelRendererTurbo(this, 346, 320, textureX, textureY); // Right seat part base
		bodyModel[445] = new ModelRendererTurbo(this, 309, 320, textureX, textureY); // Right seat part base
		bodyModel[446] = new ModelRendererTurbo(this, 272, 320, textureX, textureY); // Right seat part base
		bodyModel[447] = new ModelRendererTurbo(this, 346, 297, textureX, textureY); // Left seat part base
		bodyModel[448] = new ModelRendererTurbo(this, 272, 297, textureX, textureY); // Left seat part base
		bodyModel[449] = new ModelRendererTurbo(this, 235, 297, textureX, textureY); // Left seat part base
		bodyModel[450] = new ModelRendererTurbo(this, 395, 289, textureX, textureY); // Box 38
		bodyModel[451] = new ModelRendererTurbo(this, 20, 203, textureX, textureY); // Rear gate closed
		bodyModel[452] = new ModelRendererTurbo(this, 17, 208, textureX, textureY); // Rear gate open
		bodyModel[453] = new ModelRendererTurbo(this, 378, 124, textureX, textureY); // Front gate closed
		bodyModel[454] = new ModelRendererTurbo(this, 375, 129, textureX, textureY); // Front gate open

		bodyModel[0].addBox(0F, 0F, 0F, 109, 1, 20, 0F); // Box 2
		bodyModel[0].setRotationPoint(-54.5F, 1F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 2
		bodyModel[1].setRotationPoint(58.5F, 1F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(54.5F, 1F, -5F);

		bodyModel[3].addBox(0F, 0F, 0F, 109, 2, 1, 0F); // Box 2
		bodyModel[3].setRotationPoint(-54.5F, 2F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 2
		bodyModel[4].setRotationPoint(-59.5F, 1F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 2
		bodyModel[5].setRotationPoint(-58.5F, 1F, -5F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[6].setRotationPoint(58.5F, 3F, -1.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[7].setRotationPoint(-61.5F, 3F, -1.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 4, 8, 0F); // Box 2
		bodyModel[8].setRotationPoint(-58.5F, 2F, -4F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 4, 8, 0F); // Box 2
		bodyModel[9].setRotationPoint(54.5F, 2F, -4F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[10].setRotationPoint(59.5F, -15F, -4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[11].setRotationPoint(59.5F, 1F, -4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[12].setRotationPoint(59.5F, -14F, -4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[13].setRotationPoint(59.5F, -14F, 3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[14].setRotationPoint(61F, -14F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[15].setRotationPoint(61F, -14F, 3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[16].setRotationPoint(61F, 1F, -5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[17].setRotationPoint(61F, -16F, -5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[18].setRotationPoint(-61F, -15F, -4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[19].setRotationPoint(-61F, 1F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[20].setRotationPoint(-61F, -14F, 3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[21].setRotationPoint(-61.5F, -14F, -5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[22].setRotationPoint(-61.5F, -14F, 3F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[23].setRotationPoint(-61.5F, 1F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[24].setRotationPoint(-61.5F, -16F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[25].setRotationPoint(-61F, -14F, -4F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 17, 7, 0F); // Box 128
		bodyModel[26].setRotationPoint(53.5F, -16F, -10F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 17, 7, 0F); // Box 128
		bodyModel[27].setRotationPoint(53.5F, -16F, 3F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 128
		bodyModel[28].setRotationPoint(58.5F, -16F, -11F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 128
		bodyModel[29].setRotationPoint(58.5F, -16F, 3F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[30].setRotationPoint(53.5F, -16F, -3F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 128
		bodyModel[31].setRotationPoint(54.5F, -16F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Vestibule door Rear
		bodyModel[32].setRotationPoint(53.5F, -14F, 3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door rear
		bodyModel[33].setRotationPoint(54.5F, -15F, 10.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.22F, 0F, -0.5F, -0.22F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left trapdoor rear
		bodyModel[34].setRotationPoint(54.5F, 1F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.22F, 0F, -0.5F, -0.22F); // Right trapdoor rear
		bodyModel[35].setRotationPoint(54.5F, 1F, 5F);

		bodyModel[36].addShapeBox(0F, 0F, -1F, 5, 13, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Left side door rear
		bodyModel[36].setRotationPoint(54.5F, -15F, -10.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 2
		bodyModel[37].setRotationPoint(58.5F, -2F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[38].setRotationPoint(58.5F, -2F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 42
		bodyModel[39].setRotationPoint(58.5F, -2F, 3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 43
		bodyModel[40].setRotationPoint(58.5F, -2F, 10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 109, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[41].setRotationPoint(-54.5F, -2F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 109, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 43
		bodyModel[42].setRotationPoint(-54.5F, -2F, 10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.69F, 0F, 0F, -0.69F); // Right side door rear
		bodyModel[43].setRotationPoint(54.5F, -2F, 10.5F);

		bodyModel[44].addShapeBox(0F, 0F, -1F, 5, 3, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.69F, -1F, 0F, -0.69F, -1F, 0F, 0F, 0F, 0F, 0F); // Left side door rear
		bodyModel[44].setRotationPoint(54.5F, -2F, -10.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 109, 14, 1, 0F); // Box 38
		bodyModel[45].setRotationPoint(-54.5F, -16F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 109, 14, 1, 0F); // Box 128
		bodyModel[46].setRotationPoint(-54.5F, -16F, 10F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[47].setRotationPoint(58.5F, -16F, -3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[48].setRotationPoint(-59.5F, -18F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 119, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[49].setRotationPoint(-59.5F, -19.5F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 119, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[50].setRotationPoint(-59.5F, -19F, -9.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 29, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[51].setRotationPoint(-59.5F, -18F, 9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 119, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[52].setRotationPoint(-59.5F, -19.5F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 119, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[53].setRotationPoint(-59.5F, -19F, 5.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 119, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[54].setRotationPoint(-59.5F, -19F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[55].setRotationPoint(53.5F, -18F, -9.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 128
		bodyModel[56].setRotationPoint(54F, -6F, -12F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 128
		bodyModel[57].setRotationPoint(59F, -6F, -12F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 202
		bodyModel[58].setRotationPoint(54F, -6F, 11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 203
		bodyModel[59].setRotationPoint(59F, -6F, 11F);

		bodyModel[60].addShapeBox(0F, 2F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 550
		bodyModel[60].setRotationPoint(54.51F, 0.5F, -6.5F);

		bodyModel[61].addShapeBox(0F, 2F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[61].setRotationPoint(54.51F, 0.5F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 552
		bodyModel[62].setRotationPoint(54.51F, 4F, -8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[63].setRotationPoint(54.51F, 4F, -8.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0.25F, -0.02F, 0F, 0.25F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.02F, 0F, 0.25F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[64].setRotationPoint(54.51F, 7F, -10.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F); // Box 555
		bodyModel[65].setRotationPoint(58.49F, 2.5F, -10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 556
		bodyModel[66].setRotationPoint(58.49F, 2.5F, -10.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[67].setRotationPoint(54.51F, 5.5F, -10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 558
		bodyModel[68].setRotationPoint(54.51F, 5.5F, -9.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F); // Box 559
		bodyModel[69].setRotationPoint(54.51F, 2.5F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 560
		bodyModel[70].setRotationPoint(54.51F, 2.5F, -10.5F);

		bodyModel[71].addShapeBox(0F, 2F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 551
		bodyModel[71].setRotationPoint(54.5F, 0F, -5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 555
		bodyModel[72].setRotationPoint(58.49F, 2F, -9.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 559
		bodyModel[73].setRotationPoint(54.51F, 2F, -9.5F);

		bodyModel[74].addShapeBox(0F, 2F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 82
		bodyModel[74].setRotationPoint(54.51F, 0.5F, 6.5F);

		bodyModel[75].addShapeBox(0F, 2F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 83
		bodyModel[75].setRotationPoint(54.51F, 0.5F, 5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 84
		bodyModel[76].setRotationPoint(54.51F, 4F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 85
		bodyModel[77].setRotationPoint(54.51F, 4F, 6.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 86
		bodyModel[78].setRotationPoint(54.51F, 7F, 9.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 87
		bodyModel[79].setRotationPoint(58.49F, 2.5F, 5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 88
		bodyModel[80].setRotationPoint(58.49F, 2.5F, 9.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 89
		bodyModel[81].setRotationPoint(54.51F, 5.5F, 8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 90
		bodyModel[82].setRotationPoint(54.51F, 5.5F, 9.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 91
		bodyModel[83].setRotationPoint(54.51F, 2.5F, 5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 92
		bodyModel[84].setRotationPoint(54.51F, 2.5F, 9.5F);

		bodyModel[85].addShapeBox(0F, 2F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[85].setRotationPoint(54.5F, 0F, 5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[86].setRotationPoint(58.49F, 2F, 4.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[87].setRotationPoint(54.51F, 2F, 4.5F);

		bodyModel[88].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.22F, 0F, -0.5F, -0.22F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left trapdoor front
		bodyModel[88].setRotationPoint(-54.5F, 1F, -11F);

		bodyModel[89].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.22F, 0F, -0.5F, -0.22F); // Right trapdoor front
		bodyModel[89].setRotationPoint(-54.5F, 1F, 5F);

		bodyModel[90].addShapeBox(0F, 2F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 550
		bodyModel[90].setRotationPoint(-58.49F, 0.5F, -6.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 552
		bodyModel[91].setRotationPoint(-58.49F, 4F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[92].setRotationPoint(-58.49F, 4F, -8.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0.25F, -0.02F, 0F, 0.25F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.02F, 0F, 0.25F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[93].setRotationPoint(-58.49F, 7F, -10.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F); // Box 555
		bodyModel[94].setRotationPoint(-54.51F, 2.5F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 556
		bodyModel[95].setRotationPoint(-54.51F, 2.5F, -10.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[96].setRotationPoint(-58.49F, 5.5F, -10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 558
		bodyModel[97].setRotationPoint(-58.49F, 5.5F, -9.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F); // Box 559
		bodyModel[98].setRotationPoint(-58.49F, 2.5F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 560
		bodyModel[99].setRotationPoint(-58.49F, 2.5F, -10.5F);

		bodyModel[100].addShapeBox(0F, 2F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 551
		bodyModel[100].setRotationPoint(-58.5F, 0F, -5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 555
		bodyModel[101].setRotationPoint(-54.51F, 2F, -9.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 559
		bodyModel[102].setRotationPoint(-58.49F, 2F, -9.5F);

		bodyModel[103].addShapeBox(0F, 2F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 82
		bodyModel[103].setRotationPoint(-58.49F, 0.5F, 6.5F);

		bodyModel[104].addShapeBox(0F, 2F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 83
		bodyModel[104].setRotationPoint(-58.49F, 0.5F, 5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 84
		bodyModel[105].setRotationPoint(-58.49F, 4F, 8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 85
		bodyModel[106].setRotationPoint(-58.49F, 4F, 6.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 86
		bodyModel[107].setRotationPoint(-58.49F, 7F, 9.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 87
		bodyModel[108].setRotationPoint(-54.51F, 2.5F, 5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 88
		bodyModel[109].setRotationPoint(-54.51F, 2.5F, 9.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 89
		bodyModel[110].setRotationPoint(-58.49F, 5.5F, 8F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 90
		bodyModel[111].setRotationPoint(-58.49F, 5.5F, 9.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 91
		bodyModel[112].setRotationPoint(-58.49F, 2.5F, 5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 92
		bodyModel[113].setRotationPoint(-58.49F, 2.5F, 9.5F);

		bodyModel[114].addShapeBox(0F, 2F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[114].setRotationPoint(-58.5F, 0F, 5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[115].setRotationPoint(-54.51F, 2F, 4.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[116].setRotationPoint(-58.49F, 2F, 4.5F);

		bodyModel[117].addShapeBox(0F, 2F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[117].setRotationPoint(-58.49F, 0.5F, -7F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 17, 7, 0F); // Box 128
		bodyModel[118].setRotationPoint(-54.5F, -16F, -10F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 17, 7, 0F); // Box 128
		bodyModel[119].setRotationPoint(-54.5F, -16F, 3F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[120].setRotationPoint(-54.5F, -16F, -3F);

		bodyModel[121].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Vestibule door Front
		bodyModel[121].setRotationPoint(-53.5F, -14F, -3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 6, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[122].setRotationPoint(-59.5F, -18F, -9.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 128
		bodyModel[123].setRotationPoint(-58.5F, -16F, -11F);

		bodyModel[124].addShapeBox(-4F, 0F, 0F, 5, 13, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door front
		bodyModel[124].setRotationPoint(-54.5F, -15F, 10.5F);

		bodyModel[125].addShapeBox(-4F, 0F, -1F, 5, 13, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Left side door front
		bodyModel[125].setRotationPoint(-54.5F, -15F, -10.5F);

		bodyModel[126].addShapeBox(-4F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.69F, 0F, 0F, -0.69F); // Right side door front
		bodyModel[126].setRotationPoint(-54.5F, -2F, 10.5F);

		bodyModel[127].addShapeBox(-4F, 0F, -1F, 5, 3, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.69F, -1F, 0F, -0.69F, -1F, 0F, 0F, 0F, 0F, 0F); // Left side door front
		bodyModel[127].setRotationPoint(-54.5F, -2F, -10.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 128
		bodyModel[128].setRotationPoint(-59F, -6F, -12F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 128
		bodyModel[129].setRotationPoint(-54F, -6F, -12F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 202
		bodyModel[130].setRotationPoint(-59F, -6F, 11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 203
		bodyModel[131].setRotationPoint(-54F, -6F, 11F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 128
		bodyModel[132].setRotationPoint(-59.5F, -16F, -11F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 128
		bodyModel[133].setRotationPoint(-59.5F, -16F, 3F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 2
		bodyModel[134].setRotationPoint(-59.5F, -2F, -10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[135].setRotationPoint(-59.5F, -2F, -11F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 42
		bodyModel[136].setRotationPoint(-59.5F, -2F, 3F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 43
		bodyModel[137].setRotationPoint(-59.5F, -2F, 10F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[138].setRotationPoint(-59.5F, -16F, -3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.25F, -0.65F, -0.5F, -0.25F, -0.65F, -0.5F, -0.625F, -0.575F, 0F, -0.625F, -0.575F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.525F, -0.5F, 0F, 0.525F, -0.5F); // Box 59
		bodyModel[139].setRotationPoint(50F, -20.09F, 5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.625F, -0.575F, -0.5F, -0.625F, -0.575F, -0.5F, -0.25F, -0.65F, 0F, -0.25F, -0.65F, 0F, 0.525F, -0.5F, -0.5F, 0.525F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[140].setRotationPoint(-51.5F, -20.09F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 59
		bodyModel[141].setRotationPoint(-37F, -19.5F, 6.62F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 171
		bodyModel[142].setRotationPoint(34F, -19.5F, -6.62F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 38
		bodyModel[143].setRotationPoint(-31.5F, -15F, -10F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 38
		bodyModel[144].setRotationPoint(33.5F, -15F, -6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 190, 1, 1, 0F,0F, 0F, 0F, -95F, 0F, 0F, -95F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -95F, -0.5F, 0F, -95F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[145].setRotationPoint(-42.5F, -10F, 10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 186, 1, 1, 0F,0F, 0F, 0F, -93F, 0F, 0F, -93F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -93F, -0.5F, 0F, -93F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 210
		bodyModel[146].setRotationPoint(-52.5F, -10F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 95, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 210
		bodyModel[147].setRotationPoint(-53.5F, -10F, -10.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 97, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 212
		bodyModel[148].setRotationPoint(-43.5F, -10F, 10.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[149].setRotationPoint(48.5F, -18F, 9F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 38
		bodyModel[150].setRotationPoint(-31.5F, -16F, -10F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 38
		bodyModel[151].setRotationPoint(33.5F, -16F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[152].setRotationPoint(-31.5F, -18F, -9.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[153].setRotationPoint(33.5F, -18F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 82, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -0.125F, 0F, -2F, -0.125F); // Box 221
		bodyModel[154].setRotationPoint(-48.5F, -18F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[155].setRotationPoint(33.5F, -18F, -9.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[156].setRotationPoint(-30.5F, -18F, -9.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[157].setRotationPoint(-30.5F, -18F, -10F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 0, 18, 0F); // Box 128 glow
		bodyModel[158].setRotationPoint(-57F, -14.99F, -9F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 0, 18, 0F); // Box 128 glow
		bodyModel[159].setRotationPoint(56F, -14.99F, -9F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[160].setRotationPoint(48.5F, -15F, -5F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 232
		bodyModel[161].setRotationPoint(-49.5F, -15F, -10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 38
		bodyModel[162].setRotationPoint(49.5F, -15F, 0F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 234
		bodyModel[163].setRotationPoint(-53.5F, -15F, -1F);

		bodyModel[164].addBox(0F, 0F, 0F, 5, 1, 20, 0F); // Box 38
		bodyModel[164].setRotationPoint(-53.5F, -16F, -10F);

		bodyModel[165].addBox(0F, 0F, 0F, 5, 2, 19, 0F); // Box 38
		bodyModel[165].setRotationPoint(-53.5F, -18F, -9.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 232
		bodyModel[166].setRotationPoint(-49.5F, -15F, 5F);

		bodyModel[167].addBox(0F, 0F, 0F, 5, 1, 20, 0F); // Box 38
		bodyModel[167].setRotationPoint(48.5F, -16F, -10F);

		bodyModel[168].addBox(0F, 0F, 0F, 5, 2, 19, 0F); // Box 38
		bodyModel[168].setRotationPoint(48.5F, -18F, -9.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[169].setRotationPoint(48.5F, -15F, -6F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 14, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[170].setRotationPoint(34.5F, -15F, -6F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[171].setRotationPoint(34.5F, -16F, -10F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 14, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 232
		bodyModel[172].setRotationPoint(34.5F, -18F, -9.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 247
		bodyModel[173].setRotationPoint(-31.5F, -17.5F, -10F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[174].setRotationPoint(-48.5F, -15F, 5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[175].setRotationPoint(-44.5F, -15F, 5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 232
		bodyModel[176].setRotationPoint(-40F, -11F, 5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[177].setRotationPoint(-37F, -15F, 5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[178].setRotationPoint(-40F, -15F, 5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 232
		bodyModel[179].setRotationPoint(-41F, -11F, 5.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[180].setRotationPoint(-48.5F, -16F, 5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 17, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[181].setRotationPoint(-48.5F, -18F, 4.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 107, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.81F, 0F, 0F, -0.81F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[182].setRotationPoint(-53.5F, -2F, 9F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 107, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.81F, 0F, 0F, -0.81F); // Box 266
		bodyModel[183].setRotationPoint(-53.5F, -2F, -10F);

		bodyModel[184].addBox(0F, 0F, 0F, 109, 2, 1, 0F); // Box 267
		bodyModel[184].setRotationPoint(-54.5F, 2F, 1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[185].setRotationPoint(-43.5F, 4F, -1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[186].setRotationPoint(-44.5F, 2F, -1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[187].setRotationPoint(-43.5F, 2F, -11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 271
		bodyModel[188].setRotationPoint(-43.5F, 2F, 2F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[189].setRotationPoint(41.5F, 4F, -1F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[190].setRotationPoint(40.5F, 2F, -1F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[191].setRotationPoint(41.5F, 2F, -11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 271
		bodyModel[192].setRotationPoint(41.5F, 2F, 2F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 82, 1, 2, 0F,0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 221
		bodyModel[193].setRotationPoint(-48.5F, -18F, -9.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 2, 19, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.03F, -1.25F, 0F, -2.03F, -1.25F, 0F, -2.03F, -1.25F, 0F, 0.03F, -1.25F, 0F); // Box 38
		bodyModel[194].setRotationPoint(-30F, -18F, -9.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[195].setRotationPoint(-30.5F, -18F, 9F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 79, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 274
		bodyModel[196].setRotationPoint(-30.5F, -18F, 9F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 79, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F); // Box 275
		bodyModel[197].setRotationPoint(-30.5F, -18F, 7.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 276
		bodyModel[198].setRotationPoint(33.5F, -17.5F, 9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[199].setRotationPoint(32.5F, -18F, -9.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 38
		bodyModel[200].setRotationPoint(32.5F, -18F, -10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 273
		bodyModel[201].setRotationPoint(32.5F, -18F, 9F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 2, 19, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -2.03F, -1.25F, 0F, 0.03F, -1.25F, 0F, 0.03F, -1.25F, 0F, -2.03F, -1.25F, 0F); // Box 38
		bodyModel[202].setRotationPoint(31F, -18F, -9.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[203].setRotationPoint(-48.5F, -18F, -9.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[204].setRotationPoint(-48.5F, -18F, -10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.03F, -1.25F, 0F, -2.03F, -1.25F, 0F, -2.03F, -1.25F, -0.5F, 0.03F, -1.25F, -0.5F); // Box 38
		bodyModel[205].setRotationPoint(-48F, -18F, -9.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 38
		bodyModel[206].setRotationPoint(-32.5F, -18F, -9.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 38
		bodyModel[207].setRotationPoint(-32.5F, -18F, -10F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -2.03F, -1.25F, 0F, 0.03F, -1.25F, 0F, 0.03F, -1.25F, -0.5F, -2.03F, -1.25F, -0.5F); // Box 38
		bodyModel[208].setRotationPoint(-34F, -18F, -9.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 274
		bodyModel[209].setRotationPoint(-48.5F, -18F, 4F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F); // Box 275
		bodyModel[210].setRotationPoint(-48.5F, -18F, 2.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[211].setRotationPoint(34.5F, -18F, -5.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[212].setRotationPoint(34.5F, -18F, 9F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.03F, -1.25F, -0.5F, -2.03F, -1.25F, -0.5F, -2.03F, -1.25F, 0F, 0.03F, -1.25F, 0F); // Box 292
		bodyModel[213].setRotationPoint(35F, -18F, -5.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 293
		bodyModel[214].setRotationPoint(47.5F, -18F, -5.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 294
		bodyModel[215].setRotationPoint(47.5F, -18F, 9F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -2.03F, -1.25F, -0.5F, 0.03F, -1.25F, -0.5F, 0.03F, -1.25F, 0F, -2.03F, -1.25F, 0F); // Box 295
		bodyModel[216].setRotationPoint(46F, -18F, -5.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1.125F, 0F, -2F, -1.125F); // Box 296
		bodyModel[217].setRotationPoint(34.5F, -18F, -5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 297
		bodyModel[218].setRotationPoint(34.5F, -18F, -4.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 13, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262 glow
		bodyModel[219].setRotationPoint(-47.5F, -14.99F, 7.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 14, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232 glow
		bodyModel[220].setRotationPoint(34.5F, -14.99F, -8.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 58, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -1F, -3F); // Box 38 cull
		bodyModel[221].setRotationPoint(-30.5F, -14F, -10F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 58, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[222].setRotationPoint(-30.5F, -13F, -10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[223].setRotationPoint(-29.5F, -13F, -10F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[224].setRotationPoint(-24.5F, -13F, -10F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[225].setRotationPoint(-19.5F, -13F, -10F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[226].setRotationPoint(-14.5F, -13F, -10F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[227].setRotationPoint(-9.5F, -13F, -10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[228].setRotationPoint(-4.5F, -13F, -10F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[229].setRotationPoint(0.5F, -13F, -10F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[230].setRotationPoint(5.5F, -13F, -10F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[231].setRotationPoint(10.5F, -13F, -10F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[232].setRotationPoint(15.5F, -13F, -10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[233].setRotationPoint(20.5F, -13F, -10F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[234].setRotationPoint(25.5F, -13F, -10F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 58, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -1F, -3F); // Box 296 cull
		bodyModel[235].setRotationPoint(-24.5F, -14F, 7F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 58, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[236].setRotationPoint(-24.5F, -13F, 9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[237].setRotationPoint(-24.5F, -13F, 9F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[238].setRotationPoint(-19.5F, -13F, 9F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[239].setRotationPoint(-14.5F, -13F, 9F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[240].setRotationPoint(-9.5F, -13F, 9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[241].setRotationPoint(-4.5F, -13F, 9F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[242].setRotationPoint(0.5F, -13F, 9F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[243].setRotationPoint(5.5F, -13F, 9F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[244].setRotationPoint(10.5F, -13F, 9F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[245].setRotationPoint(15.5F, -13F, 9F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[246].setRotationPoint(20.5F, -13F, 9F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[247].setRotationPoint(25.5F, -13F, 9F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[248].setRotationPoint(30.5F, -13F, 9F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 57, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, -0.99F, 0F, -0.99F, -0.99F); // Box 38 cull
		bodyModel[249].setRotationPoint(-30F, -14F, -8F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 57, 2, 2, 0F,0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, -0.99F, 0F, -0.99F, -0.99F, 0F, -0.99F, 0F, 0F, -0.99F, 0F); // Box 313 cull
		bodyModel[250].setRotationPoint(-24F, -14F, 6F);

		bodyModel[251].addShapeBox(-3F, 0F, -1F, 5, 1, 1, 0F,0.2F, 0F, -0.5F, -2.8F, 0F, -0.5F, -2.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, -0.5F, -2.8F, -0.5F, -0.5F, -2.8F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Left side door front
		bodyModel[251].setRotationPoint(-54.5F, -10F, -10.5F);

		bodyModel[252].addShapeBox(-3F, 0F, 0F, 5, 1, 1, 0F,0.2F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, 0F, -2.8F, -0.5F, 0F, -2.8F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F); // Right side door front
		bodyModel[252].setRotationPoint(-54.5F, -10F, 10.5F);

		bodyModel[253].addShapeBox(1F, 0F, -1F, 5, 1, 1, 0F,0.2F, 0F, -0.5F, -2.8F, 0F, -0.5F, -2.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, -0.5F, -2.8F, -0.5F, -0.5F, -2.8F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Left side door rear
		bodyModel[253].setRotationPoint(54.5F, -10F, -10.5F);

		bodyModel[254].addShapeBox(1F, 0F, 0F, 5, 1, 1, 0F,0.2F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, 0F, -2.8F, -0.5F, 0F, -2.8F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F); // Right side door rear
		bodyModel[254].setRotationPoint(54.5F, -10F, 10.5F);

		bodyModel[255].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[255].setRotationPoint(12.5F, -7F, 7F);
		bodyModel[255].rotateAngleY = -1.57079633F;

		bodyModel[256].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[256].setRotationPoint(12.5F, -7F, -7F);
		bodyModel[256].rotateAngleY = -4.71238898F;

		bodyModel[257].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[257].setRotationPoint(12.5F, -3F, 7F);
		bodyModel[257].rotateAngleY = -1.57079633F;

		bodyModel[258].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[258].setRotationPoint(12.5F, -3F, -7F);
		bodyModel[258].rotateAngleY = -4.71238898F;

		bodyModel[259].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[259].setRotationPoint(12.5F, -4F, 7F);
		bodyModel[259].rotateAngleY = -1.57079633F;

		bodyModel[260].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[260].setRotationPoint(12.5F, -3F, 7F);
		bodyModel[260].rotateAngleY = -1.57079633F;

		bodyModel[261].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[261].setRotationPoint(12.5F, -3F, -7F);
		bodyModel[261].rotateAngleY = -4.71238898F;

		bodyModel[262].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[262].setRotationPoint(12.5F, -3F, -7F);
		bodyModel[262].rotateAngleY = -4.71238898F;

		bodyModel[263].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[263].setRotationPoint(12.5F, -3F, 7F);
		bodyModel[263].rotateAngleY = -1.57079633F;

		bodyModel[264].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[264].setRotationPoint(12.5F, -4F, 7F);
		bodyModel[264].rotateAngleY = -1.57079633F;

		bodyModel[265].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[265].setRotationPoint(12.5F, -4F, -7F);
		bodyModel[265].rotateAngleY = -4.71238898F;

		bodyModel[266].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[266].setRotationPoint(12.5F, -4F, -7F);
		bodyModel[266].rotateAngleY = -4.71238898F;

		bodyModel[267].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[267].setRotationPoint(23.5F, -7F, 7F);
		bodyModel[267].rotateAngleY = -1.57079633F;

		bodyModel[268].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[268].setRotationPoint(23.5F, -7F, -7F);
		bodyModel[268].rotateAngleY = -4.71238898F;

		bodyModel[269].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[269].setRotationPoint(23.5F, -3F, 7F);
		bodyModel[269].rotateAngleY = -1.57079633F;

		bodyModel[270].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[270].setRotationPoint(23.5F, -3F, -7F);
		bodyModel[270].rotateAngleY = -4.71238898F;

		bodyModel[271].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[271].setRotationPoint(23.5F, -4F, 7F);
		bodyModel[271].rotateAngleY = -1.57079633F;

		bodyModel[272].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[272].setRotationPoint(23.5F, -3F, 7F);
		bodyModel[272].rotateAngleY = -1.57079633F;

		bodyModel[273].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[273].setRotationPoint(23.5F, -3F, -7F);
		bodyModel[273].rotateAngleY = -4.71238898F;

		bodyModel[274].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[274].setRotationPoint(23.5F, -3F, -7F);
		bodyModel[274].rotateAngleY = -4.71238898F;

		bodyModel[275].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[275].setRotationPoint(23.5F, -3F, 7F);
		bodyModel[275].rotateAngleY = -1.57079633F;

		bodyModel[276].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[276].setRotationPoint(23.5F, -4F, 7F);
		bodyModel[276].rotateAngleY = -1.57079633F;

		bodyModel[277].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[277].setRotationPoint(23.5F, -4F, -7F);
		bodyModel[277].rotateAngleY = -4.71238898F;

		bodyModel[278].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[278].setRotationPoint(23.5F, -4F, -7F);
		bodyModel[278].rotateAngleY = -4.71238898F;

		bodyModel[279].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[279].setRotationPoint(1.5F, -7F, 7F);
		bodyModel[279].rotateAngleY = -1.57079633F;

		bodyModel[280].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[280].setRotationPoint(1.5F, -7F, -7F);
		bodyModel[280].rotateAngleY = -4.71238898F;

		bodyModel[281].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[281].setRotationPoint(1.5F, -3F, 7F);
		bodyModel[281].rotateAngleY = -1.57079633F;

		bodyModel[282].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[282].setRotationPoint(1.5F, -3F, -7F);
		bodyModel[282].rotateAngleY = -4.71238898F;

		bodyModel[283].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[283].setRotationPoint(1.5F, -4F, 7F);
		bodyModel[283].rotateAngleY = -1.57079633F;

		bodyModel[284].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[284].setRotationPoint(1.5F, -3F, 7F);
		bodyModel[284].rotateAngleY = -1.57079633F;

		bodyModel[285].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[285].setRotationPoint(1.5F, -3F, -7F);
		bodyModel[285].rotateAngleY = -4.71238898F;

		bodyModel[286].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[286].setRotationPoint(1.5F, -3F, -7F);
		bodyModel[286].rotateAngleY = -4.71238898F;

		bodyModel[287].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[287].setRotationPoint(1.5F, -3F, 7F);
		bodyModel[287].rotateAngleY = -1.57079633F;

		bodyModel[288].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[288].setRotationPoint(1.5F, -4F, 7F);
		bodyModel[288].rotateAngleY = -1.57079633F;

		bodyModel[289].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[289].setRotationPoint(1.5F, -4F, -7F);
		bodyModel[289].rotateAngleY = -4.71238898F;

		bodyModel[290].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[290].setRotationPoint(1.5F, -4F, -7F);
		bodyModel[290].rotateAngleY = -4.71238898F;

		bodyModel[291].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[291].setRotationPoint(-9.5F, -7F, 7F);
		bodyModel[291].rotateAngleY = -1.57079633F;

		bodyModel[292].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[292].setRotationPoint(-9.5F, -7F, -7F);
		bodyModel[292].rotateAngleY = -4.71238898F;

		bodyModel[293].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[293].setRotationPoint(-9.5F, -3F, 7F);
		bodyModel[293].rotateAngleY = -1.57079633F;

		bodyModel[294].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[294].setRotationPoint(-9.5F, -3F, -7F);
		bodyModel[294].rotateAngleY = -4.71238898F;

		bodyModel[295].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[295].setRotationPoint(-9.5F, -4F, 7F);
		bodyModel[295].rotateAngleY = -1.57079633F;

		bodyModel[296].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[296].setRotationPoint(-9.5F, -3F, 7F);
		bodyModel[296].rotateAngleY = -1.57079633F;

		bodyModel[297].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[297].setRotationPoint(-9.5F, -3F, -7F);
		bodyModel[297].rotateAngleY = -4.71238898F;

		bodyModel[298].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[298].setRotationPoint(-9.5F, -3F, -7F);
		bodyModel[298].rotateAngleY = -4.71238898F;

		bodyModel[299].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[299].setRotationPoint(-9.5F, -3F, 7F);
		bodyModel[299].rotateAngleY = -1.57079633F;

		bodyModel[300].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[300].setRotationPoint(-9.5F, -4F, 7F);
		bodyModel[300].rotateAngleY = -1.57079633F;

		bodyModel[301].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[301].setRotationPoint(-9.5F, -4F, -7F);
		bodyModel[301].rotateAngleY = -4.71238898F;

		bodyModel[302].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[302].setRotationPoint(-9.5F, -4F, -7F);
		bodyModel[302].rotateAngleY = -4.71238898F;

		bodyModel[303].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[303].setRotationPoint(-20.5F, -7F, 7F);
		bodyModel[303].rotateAngleY = -1.57079633F;

		bodyModel[304].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[304].setRotationPoint(-20.5F, -7F, -7F);
		bodyModel[304].rotateAngleY = -4.71238898F;

		bodyModel[305].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[305].setRotationPoint(-20.5F, -3F, 7F);
		bodyModel[305].rotateAngleY = -1.57079633F;

		bodyModel[306].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[306].setRotationPoint(-20.5F, -3F, -7F);
		bodyModel[306].rotateAngleY = -4.71238898F;

		bodyModel[307].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[307].setRotationPoint(-20.5F, -4F, 7F);
		bodyModel[307].rotateAngleY = -1.57079633F;

		bodyModel[308].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[308].setRotationPoint(-20.5F, -3F, 7F);
		bodyModel[308].rotateAngleY = -1.57079633F;

		bodyModel[309].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[309].setRotationPoint(-20.5F, -3F, -7F);
		bodyModel[309].rotateAngleY = -4.71238898F;

		bodyModel[310].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[310].setRotationPoint(-20.5F, -3F, -7F);
		bodyModel[310].rotateAngleY = -4.71238898F;

		bodyModel[311].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[311].setRotationPoint(-20.5F, -3F, 7F);
		bodyModel[311].rotateAngleY = -1.57079633F;

		bodyModel[312].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[312].setRotationPoint(-20.5F, -4F, 7F);
		bodyModel[312].rotateAngleY = -1.57079633F;

		bodyModel[313].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[313].setRotationPoint(-20.5F, -4F, -7F);
		bodyModel[313].rotateAngleY = -4.71238898F;

		bodyModel[314].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[314].setRotationPoint(-20.5F, -4F, -7F);
		bodyModel[314].rotateAngleY = -4.71238898F;

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[315].setRotationPoint(31.5F, -7F, -3F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -1.99F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -1.99F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, -0.01F, 0F, -0.01F, -0.01F); // Box 38 cull
		bodyModel[316].setRotationPoint(31.5F, -2F, -5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 128
		bodyModel[317].setRotationPoint(52.5F, -16F, -10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 17, 5, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[318].setRotationPoint(-53.5F, -16F, 5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 101, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[319].setRotationPoint(-48.5F, -11F, -9.9F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 101, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[320].setRotationPoint(-52.5F, -11F, 9.9F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[321].setRotationPoint(52.05F, -2F, 9.95F);
		bodyModel[321].rotateAngleY = -2.35619449F;

		bodyModel[322].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[322].setRotationPoint(52.4F, -1F, 9.6F);
		bodyModel[322].rotateAngleY = -2.35619449F;

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[323].setRotationPoint(52.05F, 0.5F, 9.95F);
		bodyModel[323].rotateAngleY = -2.35619449F;

		bodyModel[324].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[324].setRotationPoint(-52F, -2F, -9.75F);
		bodyModel[324].rotateAngleY = 0.78539816F;

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[325].setRotationPoint(-52.35F, -1F, -9.4F);
		bodyModel[325].rotateAngleY = 0.78539816F;

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[326].setRotationPoint(-52F, 0.5F, -9.75F);
		bodyModel[326].rotateAngleY = 0.78539816F;

		bodyModel[327].addShapeBox(0F, 0F, 0F, 6, 15, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[327].setRotationPoint(-47.5F, -15F, 5.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[328].setRotationPoint(-48.5F, -6F, -9F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 381
		bodyModel[329].setRotationPoint(-48.5F, -2.4F, -9F);
		bodyModel[329].rotateAngleZ = 1.04719755F;

		bodyModel[330].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[330].setRotationPoint(-47.25F, -5F, -7.5F);
		bodyModel[330].rotateAngleY = -0.78539816F;

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[331].setRotationPoint(46.5F, -6F, 6F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 381
		bodyModel[332].setRotationPoint(47F, -5F, 6F);
		bodyModel[332].rotateAngleZ = -1.04719755F;

		bodyModel[333].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[333].setRotationPoint(47.75F, -5F, 7.5F);
		bodyModel[333].rotateAngleY = -0.78539816F;

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[334].setRotationPoint(-39.5F, -14F, 4F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[335].setRotationPoint(-39.5F, -13F, -10F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 309 glow
		bodyModel[336].setRotationPoint(-32.5F, -14F, -3.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[337].setRotationPoint(-48.5F, -14F, -8.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 309 glow
		bodyModel[338].setRotationPoint(47.5F, -14F, 6.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[339].setRotationPoint(34.5F, -14F, 1.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -1F, -3F); // Box 38 cull
		bodyModel[340].setRotationPoint(-42.5F, -14F, -10F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[341].setRotationPoint(-42.5F, -13F, -10F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 5, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.585F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.585F, 0F); // Boc 42
		bodyModel[342].setRotationPoint(-32.5F, -7F, -9F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[343].setRotationPoint(-34F, -1F, -8F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 3, 2, 13, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[344].setRotationPoint(-35F, -3F, -9F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[345].setRotationPoint(-34.5F, -3F, 4F);

		bodyModel[346].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[346].setRotationPoint(-34.5F, -3F, -9F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[347].setRotationPoint(-34.5F, -4F, 4F);

		bodyModel[348].addShapeBox(0F, 0F, -1F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[348].setRotationPoint(-34.5F, -4F, -9F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[349].setRotationPoint(-34F, -1F, 1F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[350].setRotationPoint(-34F, -1F, -3.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.56F, 0F, 0F, -0.56F, 0F); // Boc 42
		bodyModel[351].setRotationPoint(-43.5F, -7F, -10F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Boc 42
		bodyModel[352].setRotationPoint(-39F, -1F, -9F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[353].setRotationPoint(-43.5F, -3F, -9.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[354].setRotationPoint(-36.5F, -3F, -9.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[355].setRotationPoint(-44F, -3F, -9.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[356].setRotationPoint(-36.5F, -4F, -9.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[357].setRotationPoint(-44F, -4F, -9.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[358].setRotationPoint(-43F, -1F, -9F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.56F, 0F, 0F, -0.56F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 498
		bodyModel[359].setRotationPoint(-43.5F, -7F, 4F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 499
		bodyModel[360].setRotationPoint(-39F, -1F, 2F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[361].setRotationPoint(-43.5F, -3F, 0.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[362].setRotationPoint(-36.5F, -3F, 1.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[363].setRotationPoint(-44F, -3F, 1.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[364].setRotationPoint(-36.5F, -4F, 1.5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[365].setRotationPoint(-44F, -4F, 1.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[366].setRotationPoint(-43F, -1F, 2F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 5, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, -0.5F, -0.5F, 0F); // Boc 42
		bodyModel[367].setRotationPoint(34.5F, -7F, -4F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[368].setRotationPoint(36F, -1F, -3F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 3, 2, 13, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[369].setRotationPoint(35F, -3F, -4F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Boc 42
		bodyModel[370].setRotationPoint(34.5F, -3F, 9F);

		bodyModel[371].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Boc 42
		bodyModel[371].setRotationPoint(34.5F, -3F, -4F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Boc 42
		bodyModel[372].setRotationPoint(34.5F, -4F, 9F);

		bodyModel[373].addShapeBox(0F, 0F, -1F, 3, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Boc 42
		bodyModel[373].setRotationPoint(34.5F, -4F, -4F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[374].setRotationPoint(36F, -1F, 6F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[375].setRotationPoint(36F, -1F, 1.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.56F, 0F, 0F, -0.56F, 0F); // Boc 42
		bodyModel[376].setRotationPoint(39.5F, -7F, -5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[377].setRotationPoint(39.5F, -3F, -4.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[378].setRotationPoint(43.5F, -3F, -4.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[379].setRotationPoint(39F, -3F, -4.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[380].setRotationPoint(43.5F, -4F, -4.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[381].setRotationPoint(39F, -4F, -4.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[382].setRotationPoint(40.75F, -1F, -4F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.56F, 0F, 0F, -0.56F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 498
		bodyModel[383].setRotationPoint(39.5F, -7F, 9F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[384].setRotationPoint(39.5F, -3F, 5.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[385].setRotationPoint(43.5F, -3F, 6.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[386].setRotationPoint(39F, -3F, 6.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[387].setRotationPoint(43.5F, -4F, 6.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[388].setRotationPoint(39F, -4F, 6.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[389].setRotationPoint(40.75F, -1F, 7F);

		bodyModel[390].addBox(0F, 0F, 0F, 13, 4, 5, 0F); // Box 2
		bodyModel[390].setRotationPoint(-6.5F, 2F, 5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[391].setRotationPoint(-22.5F, 2F, 5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[392].setRotationPoint(-22.5F, 5F, 5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[393].setRotationPoint(-8.5F, 2F, 9F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[394].setRotationPoint(22.5F, 2F, 10F);

		bodyModel[395].addBox(0F, 0F, 0F, 13, 1, 5, 0F); // Box 2
		bodyModel[395].setRotationPoint(-6.5F, 6F, 5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 11, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		bodyModel[396].setRotationPoint(-20.5F, 2F, -10F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 668
		bodyModel[397].setRotationPoint(-25.5F, 2F, -10F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		bodyModel[398].setRotationPoint(-2.5F, 2F, -10F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		bodyModel[399].setRotationPoint(-9.5F, 2F, -10F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 667
		bodyModel[400].setRotationPoint(2.5F, 2F, -9F);
		bodyModel[400].rotateAngleX = -0.78539816F;

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 667 cull
		bodyModel[401].setRotationPoint(3.5F, 2F, -9.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[402].setRotationPoint(-9.5F, 2F, 9.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, -0.58F, 0F, -0.58F, -0.58F); // Box 41
		bodyModel[403].setRotationPoint(-5.5F, 3F, 0F);
		bodyModel[403].rotateAngleX = -0.78539816F;

		bodyModel[404].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, -0.58F, 0F, -0.58F, -0.58F); // Box 41
		bodyModel[404].setRotationPoint(-0.5F, 3F, 0F);
		bodyModel[404].rotateAngleX = -0.78539816F;

		bodyModel[405].addShapeBox(0F, 0F, 0F, 12, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[405].setRotationPoint(-37F, 4.5F, -0.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.25F, -0.5F, 0F, 1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 538 cull
		bodyModel[406].setRotationPoint(-26F, 2F, 0.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0.25F, -0.45F, 0F, 0.25F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 538
		bodyModel[407].setRotationPoint(-26.5F, 4F, 1.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 538
		bodyModel[408].setRotationPoint(-26F, 2F, 4.75F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 12, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[409].setRotationPoint(25F, 4.5F, -0.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.5F, 0F, 1.25F, -0.5F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 668 cull
		bodyModel[410].setRotationPoint(25F, 2F, -3.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0.25F, -0.45F, 0F, 0.25F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 669
		bodyModel[411].setRotationPoint(24.25F, 4F, -1.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 670
		bodyModel[412].setRotationPoint(23.5F, 2F, -4.75F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 95, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[413].setRotationPoint(-47.5F, -2.5F, -11.01F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 95, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 452
		bodyModel[414].setRotationPoint(-47.5F, -2.5F, 11.01F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 95, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.035F, 0F, -0.5F, -0.035F, 0F, -0.5F, 0.035F, 0F, -0.5F, 0.035F); // Box 38
		bodyModel[415].setRotationPoint(-47.5F, -2F, -11.01F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 95, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.035F, 0F, -0.5F, 0.035F, 0F, -0.5F, -0.035F, 0F, -0.5F, -0.035F); // Box 452
		bodyModel[416].setRotationPoint(-47.5F, -2F, 11.01F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 58, 0, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[417].setRotationPoint(-30.5F, -13F, -9F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 58, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 526
		bodyModel[418].setRotationPoint(-24.5F, -13F, 8F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[419].setRotationPoint(-42.5F, -13F, -9F);

		bodyModel[420].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[420].setRotationPoint(23.5F, -7F, 7F);
		bodyModel[420].rotateAngleY = -1.57079633F;

		bodyModel[421].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[421].setRotationPoint(23.5F, -7F, 7F);
		bodyModel[421].rotateAngleY = -1.57079633F;

		bodyModel[422].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[422].setRotationPoint(12.5F, -7F, 7F);
		bodyModel[422].rotateAngleY = -1.57079633F;

		bodyModel[423].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[423].setRotationPoint(12.5F, -7F, 7F);
		bodyModel[423].rotateAngleY = -1.57079633F;

		bodyModel[424].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[424].setRotationPoint(1.5F, -7F, 7F);
		bodyModel[424].rotateAngleY = -1.57079633F;

		bodyModel[425].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[425].setRotationPoint(1.5F, -7F, 7F);
		bodyModel[425].rotateAngleY = -1.57079633F;

		bodyModel[426].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[426].setRotationPoint(-9.5F, -7F, 7F);
		bodyModel[426].rotateAngleY = -1.57079633F;

		bodyModel[427].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[427].setRotationPoint(-9.5F, -7F, 7F);
		bodyModel[427].rotateAngleY = -1.57079633F;

		bodyModel[428].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[428].setRotationPoint(-20.5F, -7F, 7F);
		bodyModel[428].rotateAngleY = -1.57079633F;

		bodyModel[429].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[429].setRotationPoint(-20.5F, -7F, 7F);
		bodyModel[429].rotateAngleY = -1.57079633F;

		bodyModel[430].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[430].setRotationPoint(-20.5F, -7F, -7F);
		bodyModel[430].rotateAngleY = -4.71238898F;

		bodyModel[431].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[431].setRotationPoint(-20.5F, -7F, -7F);
		bodyModel[431].rotateAngleY = -4.71238898F;

		bodyModel[432].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[432].setRotationPoint(-9.5F, -7F, -7F);
		bodyModel[432].rotateAngleY = -4.71238898F;

		bodyModel[433].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[433].setRotationPoint(-9.5F, -7F, -7F);
		bodyModel[433].rotateAngleY = -4.71238898F;

		bodyModel[434].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[434].setRotationPoint(1.5F, -7F, -7F);
		bodyModel[434].rotateAngleY = -4.71238898F;

		bodyModel[435].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[435].setRotationPoint(1.5F, -7F, -7F);
		bodyModel[435].rotateAngleY = -4.71238898F;

		bodyModel[436].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[436].setRotationPoint(12.5F, -7F, -7F);
		bodyModel[436].rotateAngleY = -4.71238898F;

		bodyModel[437].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[437].setRotationPoint(12.5F, -7F, -7F);
		bodyModel[437].rotateAngleY = -4.71238898F;

		bodyModel[438].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[438].setRotationPoint(23.5F, -7F, -7F);
		bodyModel[438].rotateAngleY = -4.71238898F;

		bodyModel[439].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[439].setRotationPoint(23.5F, -7F, -7F);
		bodyModel[439].rotateAngleY = -4.71238898F;

		bodyModel[440].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part base
		bodyModel[440].setRotationPoint(12.5F, -1F, 7F);
		bodyModel[440].rotateAngleY = -0.78539816F;

		bodyModel[441].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part base
		bodyModel[441].setRotationPoint(23.5F, -1F, 7F);
		bodyModel[441].rotateAngleY = -0.78539816F;

		bodyModel[442].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part base
		bodyModel[442].setRotationPoint(23.5F, -1F, -7F);
		bodyModel[442].rotateAngleY = -3.92699082F;

		bodyModel[443].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part base
		bodyModel[443].setRotationPoint(-9.5F, -1F, -7F);
		bodyModel[443].rotateAngleY = -3.92699082F;

		bodyModel[444].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part base
		bodyModel[444].setRotationPoint(-20.5F, -1F, 7F);
		bodyModel[444].rotateAngleY = -0.78539816F;

		bodyModel[445].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part base
		bodyModel[445].setRotationPoint(-9.5F, -1F, 7F);
		bodyModel[445].rotateAngleY = -0.78539816F;

		bodyModel[446].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part base
		bodyModel[446].setRotationPoint(1.5F, -1F, 7F);
		bodyModel[446].rotateAngleY = -0.78539816F;

		bodyModel[447].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part base
		bodyModel[447].setRotationPoint(-20.5F, -1F, -7F);
		bodyModel[447].rotateAngleY = -3.92699082F;

		bodyModel[448].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part base
		bodyModel[448].setRotationPoint(1.5F, -1F, -7F);
		bodyModel[448].rotateAngleY = -3.92699082F;

		bodyModel[449].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part base
		bodyModel[449].setRotationPoint(12.5F, -1F, -7F);
		bodyModel[449].rotateAngleY = -3.92699082F;

		bodyModel[450].addBox(0F, 0F, 0F, 2, 7, 7, 0F); // Box 38
		bodyModel[450].setRotationPoint(-30.5F, -6F, -10F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[451].setRotationPoint(59.5F, -8F, -3F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[452].setRotationPoint(59.5F, -8F, -3F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate closed
		bodyModel[453].setRotationPoint(-59.5F, -8F, -3F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate open
		bodyModel[454].setRotationPoint(-59.5F, -8F, 2F);
	}
	ModelMILW_1934_1935_1936_Truck bogie1 = new ModelMILW_1934_1935_1936_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 455; i++)
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
		if(GetColor(entity)==12345){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_1935_truck_silver_generator.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(0, 0, 1, 0);
			GL11.glTranslated(-2.655, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_1935_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.655, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if(GetColor(entity)==123456){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_1935_truck_UP_grey_generator.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(0, 0, 1, 0);
			GL11.glTranslated(-2.655, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_1935_truck_UP_grey.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.655, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if(GetColor(entity)==2) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_1935_truck_black_generator.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(0, 0, 1, 0);
			GL11.glTranslated(-2.655, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_1935_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.655, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_1935_truck_brown_generator.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(0, 0, 1, 0);
			GL11.glTranslated(-2.655, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_1935_truck_brown.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.655, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}