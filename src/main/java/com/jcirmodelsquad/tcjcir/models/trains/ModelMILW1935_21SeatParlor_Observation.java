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

public class ModelMILW1935_21SeatParlor_Observation extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMILW1935_21SeatParlor_Observation() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[597];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 53, 126, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 31, 151, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 72, 148, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 316, 110, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 297, 124, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 78, 169, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 274, 169, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 268, 156, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 72, 156, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 18, 149, textureX, textureY); // Box 128
		bodyModel[10] = new ModelRendererTurbo(this, 357, 87, textureX, textureY); // Box 128
		bodyModel[11] = new ModelRendererTurbo(this, 357, 118, textureX, textureY); // Box 128
		bodyModel[12] = new ModelRendererTurbo(this, 357, 101, textureX, textureY); // Box 128
		bodyModel[13] = new ModelRendererTurbo(this, 378, 100, textureX, textureY); // Box 128
		bodyModel[14] = new ModelRendererTurbo(this, 364, 100, textureX, textureY); // Box 128
		bodyModel[15] = new ModelRendererTurbo(this, 368, 118, textureX, textureY); // Box 128
		bodyModel[16] = new ModelRendererTurbo(this, 368, 87, textureX, textureY); // Box 128
		bodyModel[17] = new ModelRendererTurbo(this, 371, 101, textureX, textureY); // Box 128
		bodyModel[18] = new ModelRendererTurbo(this, 72, 109, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 72, 120, textureX, textureY); // Box 43
		bodyModel[20] = new ModelRendererTurbo(this, 98, 67, textureX, textureY); // Box 38
		bodyModel[21] = new ModelRendererTurbo(this, 98, 87, textureX, textureY); // Box 128
		bodyModel[22] = new ModelRendererTurbo(this, 324, 1, textureX, textureY); // Box 128
		bodyModel[23] = new ModelRendererTurbo(this, 72, 18, textureX, textureY); // Box 128
		bodyModel[24] = new ModelRendererTurbo(this, 72, 12, textureX, textureY); // Box 128
		bodyModel[25] = new ModelRendererTurbo(this, 323, 26, textureX, textureY); // Box 57
		bodyModel[26] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 58
		bodyModel[27] = new ModelRendererTurbo(this, 72, 48, textureX, textureY); // Box 59
		bodyModel[28] = new ModelRendererTurbo(this, 72, 26, textureX, textureY); // Box 128
		bodyModel[29] = new ModelRendererTurbo(this, 315, 136, textureX, textureY); // Left trapdoor front
		bodyModel[30] = new ModelRendererTurbo(this, 315, 144, textureX, textureY); // Right trapdoor front
		bodyModel[31] = new ModelRendererTurbo(this, 265, 174, textureX, textureY); // Box 550
		bodyModel[32] = new ModelRendererTurbo(this, 265, 180, textureX, textureY); // Box 552
		bodyModel[33] = new ModelRendererTurbo(this, 263, 177, textureX, textureY); // Box 553
		bodyModel[34] = new ModelRendererTurbo(this, 264, 189, textureX, textureY); // Box 554
		bodyModel[35] = new ModelRendererTurbo(this, 254, 172, textureX, textureY); // Box 555
		bodyModel[36] = new ModelRendererTurbo(this, 251, 174, textureX, textureY); // Box 556
		bodyModel[37] = new ModelRendererTurbo(this, 263, 183, textureX, textureY); // Box 557
		bodyModel[38] = new ModelRendererTurbo(this, 265, 186, textureX, textureY); // Box 558
		bodyModel[39] = new ModelRendererTurbo(this, 274, 172, textureX, textureY); // Box 559
		bodyModel[40] = new ModelRendererTurbo(this, 285, 174, textureX, textureY); // Box 560
		bodyModel[41] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 551
		bodyModel[42] = new ModelRendererTurbo(this, 254, 170, textureX, textureY); // Box 555
		bodyModel[43] = new ModelRendererTurbo(this, 274, 170, textureX, textureY); // Box 559
		bodyModel[44] = new ModelRendererTurbo(this, 265, 196, textureX, textureY); // Box 82
		bodyModel[45] = new ModelRendererTurbo(this, 263, 193, textureX, textureY); // Box 83
		bodyModel[46] = new ModelRendererTurbo(this, 265, 202, textureX, textureY); // Box 84
		bodyModel[47] = new ModelRendererTurbo(this, 263, 199, textureX, textureY); // Box 85
		bodyModel[48] = new ModelRendererTurbo(this, 264, 211, textureX, textureY); // Box 86
		bodyModel[49] = new ModelRendererTurbo(this, 254, 194, textureX, textureY); // Box 87
		bodyModel[50] = new ModelRendererTurbo(this, 251, 196, textureX, textureY); // Box 88
		bodyModel[51] = new ModelRendererTurbo(this, 263, 205, textureX, textureY); // Box 89
		bodyModel[52] = new ModelRendererTurbo(this, 265, 208, textureX, textureY); // Box 90
		bodyModel[53] = new ModelRendererTurbo(this, 274, 194, textureX, textureY); // Box 91
		bodyModel[54] = new ModelRendererTurbo(this, 285, 196, textureX, textureY); // Box 92
		bodyModel[55] = new ModelRendererTurbo(this, 265, 191, textureX, textureY); // Box 93
		bodyModel[56] = new ModelRendererTurbo(this, 254, 192, textureX, textureY); // Box 94
		bodyModel[57] = new ModelRendererTurbo(this, 274, 192, textureX, textureY); // Box 95
		bodyModel[58] = new ModelRendererTurbo(this, 263, 171, textureX, textureY); // Box 551
		bodyModel[59] = new ModelRendererTurbo(this, 495, 228, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 495, 275, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 486, 247, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 497, 253, textureX, textureY); // Vestibule door Front
		bodyModel[63] = new ModelRendererTurbo(this, 379, 4, textureX, textureY); // Box 128
		bodyModel[64] = new ModelRendererTurbo(this, 459, 66, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 293, 87, textureX, textureY); // Right side door front
		bodyModel[66] = new ModelRendererTurbo(this, 293, 68, textureX, textureY); // Left side door front
		bodyModel[67] = new ModelRendererTurbo(this, 293, 102, textureX, textureY); // Right side door front
		bodyModel[68] = new ModelRendererTurbo(this, 306, 71, textureX, textureY); // Left side door front
		bodyModel[69] = new ModelRendererTurbo(this, 309, 75, textureX, textureY); // Box 128
		bodyModel[70] = new ModelRendererTurbo(this, 306, 75, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 309, 95, textureX, textureY); // Box 202
		bodyModel[72] = new ModelRendererTurbo(this, 306, 95, textureX, textureY); // Box 203
		bodyModel[73] = new ModelRendererTurbo(this, 338, 87, textureX, textureY); // Box 128
		bodyModel[74] = new ModelRendererTurbo(this, 319, 87, textureX, textureY); // Box 128
		bodyModel[75] = new ModelRendererTurbo(this, 339, 110, textureX, textureY); // Box 2
		bodyModel[76] = new ModelRendererTurbo(this, 339, 124, textureX, textureY); // Box 2
		bodyModel[77] = new ModelRendererTurbo(this, 319, 110, textureX, textureY); // Box 42
		bodyModel[78] = new ModelRendererTurbo(this, 331, 124, textureX, textureY); // Box 43
		bodyModel[79] = new ModelRendererTurbo(this, 330, 86, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 257, 2, textureX, textureY); // Box 169
		bodyModel[81] = new ModelRendererTurbo(this, 250, 8, textureX, textureY); // Box 59
		bodyModel[82] = new ModelRendererTurbo(this, 370, 292, textureX, textureY); // Box 38
		bodyModel[83] = new ModelRendererTurbo(this, 339, 309, textureX, textureY); // Box 38
		bodyModel[84] = new ModelRendererTurbo(this, 72, 84, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 72, 64, textureX, textureY); // Box 210
		bodyModel[86] = new ModelRendererTurbo(this, 235, 60, textureX, textureY); // Box 210
		bodyModel[87] = new ModelRendererTurbo(this, 235, 62, textureX, textureY); // Box 212
		bodyModel[88] = new ModelRendererTurbo(this, 55, 54, textureX, textureY); // Box 57
		bodyModel[89] = new ModelRendererTurbo(this, 299, 298, textureX, textureY); // Box 38
		bodyModel[90] = new ModelRendererTurbo(this, 387, 35, textureX, textureY); // Box 38
		bodyModel[91] = new ModelRendererTurbo(this, 55, 49, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 72, 3, textureX, textureY); // Box 221
		bodyModel[93] = new ModelRendererTurbo(this, 1, 66, textureX, textureY); // Box 38
		bodyModel[94] = new ModelRendererTurbo(this, 437, 71, textureX, textureY); // Box 38
		bodyModel[95] = new ModelRendererTurbo(this, 451, 84, textureX, textureY); // Box 38
		bodyModel[96] = new ModelRendererTurbo(this, 471, 234, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[97] = new ModelRendererTurbo(this, 464, 241, textureX, textureY); // Box 232
		bodyModel[98] = new ModelRendererTurbo(this, 483, 273, textureX, textureY); // Box 234
		bodyModel[99] = new ModelRendererTurbo(this, 461, 42, textureX, textureY); // Box 38
		bodyModel[100] = new ModelRendererTurbo(this, 349, 1, textureX, textureY); // Box 38
		bodyModel[101] = new ModelRendererTurbo(this, 488, 305, textureX, textureY); // Box 232
		bodyModel[102] = new ModelRendererTurbo(this, 0, 96, textureX, textureY); // Box 232
		bodyModel[103] = new ModelRendererTurbo(this, 401, 31, textureX, textureY); // Box 247
		bodyModel[104] = new ModelRendererTurbo(this, 483, 305, textureX, textureY); // Box 232
		bodyModel[105] = new ModelRendererTurbo(this, 457, 305, textureX, textureY); // Box 232
		bodyModel[106] = new ModelRendererTurbo(this, 445, 300, textureX, textureY); // Box 232
		bodyModel[107] = new ModelRendererTurbo(this, 404, 307, textureX, textureY); // Box 232
		bodyModel[108] = new ModelRendererTurbo(this, 448, 305, textureX, textureY); // Box 232
		bodyModel[109] = new ModelRendererTurbo(this, 447, 303, textureX, textureY); // Box 232
		bodyModel[110] = new ModelRendererTurbo(this, 434, 2, textureX, textureY); // Box 262
		bodyModel[111] = new ModelRendererTurbo(this, 293, 6, textureX, textureY); // Box 263
		bodyModel[112] = new ModelRendererTurbo(this, 74, 115, textureX, textureY); // Box 43
		bodyModel[113] = new ModelRendererTurbo(this, 74, 104, textureX, textureY); // Box 266
		bodyModel[114] = new ModelRendererTurbo(this, 72, 152, textureX, textureY); // Box 267
		bodyModel[115] = new ModelRendererTurbo(this, 257, 156, textureX, textureY); // Box 2
		bodyModel[116] = new ModelRendererTurbo(this, 255, 160, textureX, textureY); // Box 2
		bodyModel[117] = new ModelRendererTurbo(this, 241, 156, textureX, textureY); // Box 2
		bodyModel[118] = new ModelRendererTurbo(this, 227, 158, textureX, textureY); // Box 271
		bodyModel[119] = new ModelRendererTurbo(this, 99, 156, textureX, textureY); // Box 2
		bodyModel[120] = new ModelRendererTurbo(this, 97, 160, textureX, textureY); // Box 2
		bodyModel[121] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 2
		bodyModel[122] = new ModelRendererTurbo(this, 115, 158, textureX, textureY); // Box 271
		bodyModel[123] = new ModelRendererTurbo(this, 72, 8, textureX, textureY); // Box 221
		bodyModel[124] = new ModelRendererTurbo(this, 413, 74, textureX, textureY); // Box 38
		bodyModel[125] = new ModelRendererTurbo(this, 459, 84, textureX, textureY); // Box 273
		bodyModel[126] = new ModelRendererTurbo(this, 72, 58, textureX, textureY); // Box 274
		bodyModel[127] = new ModelRendererTurbo(this, 72, 54, textureX, textureY); // Box 275
		bodyModel[128] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 38
		bodyModel[129] = new ModelRendererTurbo(this, 47, 136, textureX, textureY); // Box 38
		bodyModel[130] = new ModelRendererTurbo(this, 39, 133, textureX, textureY); // Box 273
		bodyModel[131] = new ModelRendererTurbo(this, 1, 118, textureX, textureY); // Box 38
		bodyModel[132] = new ModelRendererTurbo(this, 447, 41, textureX, textureY); // Box 38
		bodyModel[133] = new ModelRendererTurbo(this, 465, 52, textureX, textureY); // Box 38
		bodyModel[134] = new ModelRendererTurbo(this, 458, 9, textureX, textureY); // Box 38
		bodyModel[135] = new ModelRendererTurbo(this, 413, 30, textureX, textureY); // Box 38
		bodyModel[136] = new ModelRendererTurbo(this, 431, 41, textureX, textureY); // Box 38
		bodyModel[137] = new ModelRendererTurbo(this, 431, 23, textureX, textureY); // Box 38
		bodyModel[138] = new ModelRendererTurbo(this, 434, 18, textureX, textureY); // Box 274
		bodyModel[139] = new ModelRendererTurbo(this, 434, 14, textureX, textureY); // Box 275
		bodyModel[140] = new ModelRendererTurbo(this, 388, 305, textureX, textureY,"lamp"); // Box 262 glow
		bodyModel[141] = new ModelRendererTurbo(this, 306, 243, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[142] = new ModelRendererTurbo(this, 307, 252, textureX, textureY); // Box 38
		bodyModel[143] = new ModelRendererTurbo(this, 406, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[144] = new ModelRendererTurbo(this, 399, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[145] = new ModelRendererTurbo(this, 392, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[146] = new ModelRendererTurbo(this, 385, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[147] = new ModelRendererTurbo(this, 378, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[148] = new ModelRendererTurbo(this, 371, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[149] = new ModelRendererTurbo(this, 364, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[150] = new ModelRendererTurbo(this, 357, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[151] = new ModelRendererTurbo(this, 350, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[152] = new ModelRendererTurbo(this, 343, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[153] = new ModelRendererTurbo(this, 336, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[154] = new ModelRendererTurbo(this, 329, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[155] = new ModelRendererTurbo(this, 306, 263, textureX, textureY,"cull"); // Box 296 cull
		bodyModel[156] = new ModelRendererTurbo(this, 311, 272, textureX, textureY); // Box 297
		bodyModel[157] = new ModelRendererTurbo(this, 399, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[158] = new ModelRendererTurbo(this, 392, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[159] = new ModelRendererTurbo(this, 385, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[160] = new ModelRendererTurbo(this, 378, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[161] = new ModelRendererTurbo(this, 371, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[162] = new ModelRendererTurbo(this, 364, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[163] = new ModelRendererTurbo(this, 357, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[164] = new ModelRendererTurbo(this, 350, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[165] = new ModelRendererTurbo(this, 343, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[166] = new ModelRendererTurbo(this, 336, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[167] = new ModelRendererTurbo(this, 329, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[168] = new ModelRendererTurbo(this, 311, 238, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[169] = new ModelRendererTurbo(this, 311, 258, textureX, textureY,"cull"); // Box 313 cull
		bodyModel[170] = new ModelRendererTurbo(this, 306, 68, textureX, textureY); // Left side door front
		bodyModel[171] = new ModelRendererTurbo(this, 306, 87, textureX, textureY); // Right side door front
		bodyModel[172] = new ModelRendererTurbo(this, 198, 303, textureX, textureY); // Right seat part
		bodyModel[173] = new ModelRendererTurbo(this, 198, 280, textureX, textureY); // Left seat part
		bodyModel[174] = new ModelRendererTurbo(this, 192, 313, textureX, textureY); // Right seat part
		bodyModel[175] = new ModelRendererTurbo(this, 192, 290, textureX, textureY); // Left seat part
		bodyModel[176] = new ModelRendererTurbo(this, 213, 308, textureX, textureY); // Right seat part
		bodyModel[177] = new ModelRendererTurbo(this, 213, 323, textureX, textureY); // Right seat part
		bodyModel[178] = new ModelRendererTurbo(this, 213, 286, textureX, textureY); // Left seat part
		bodyModel[179] = new ModelRendererTurbo(this, 213, 298, textureX, textureY); // Left seat part
		bodyModel[180] = new ModelRendererTurbo(this, 213, 311, textureX, textureY); // Right seat part
		bodyModel[181] = new ModelRendererTurbo(this, 213, 320, textureX, textureY); // Right seat part
		bodyModel[182] = new ModelRendererTurbo(this, 213, 283, textureX, textureY); // Left seat part
		bodyModel[183] = new ModelRendererTurbo(this, 213, 295, textureX, textureY); // Left seat part
		bodyModel[184] = new ModelRendererTurbo(this, 161, 303, textureX, textureY); // Right seat part
		bodyModel[185] = new ModelRendererTurbo(this, 161, 280, textureX, textureY); // Left seat part
		bodyModel[186] = new ModelRendererTurbo(this, 155, 313, textureX, textureY); // Right seat part
		bodyModel[187] = new ModelRendererTurbo(this, 155, 290, textureX, textureY); // Left seat part
		bodyModel[188] = new ModelRendererTurbo(this, 213, 308, textureX, textureY); // Right seat part
		bodyModel[189] = new ModelRendererTurbo(this, 176, 323, textureX, textureY); // Right seat part
		bodyModel[190] = new ModelRendererTurbo(this, 176, 286, textureX, textureY); // Left seat part
		bodyModel[191] = new ModelRendererTurbo(this, 176, 298, textureX, textureY); // Left seat part
		bodyModel[192] = new ModelRendererTurbo(this, 176, 311, textureX, textureY); // Right seat part
		bodyModel[193] = new ModelRendererTurbo(this, 176, 320, textureX, textureY); // Right seat part
		bodyModel[194] = new ModelRendererTurbo(this, 176, 283, textureX, textureY); // Left seat part
		bodyModel[195] = new ModelRendererTurbo(this, 176, 295, textureX, textureY); // Left seat part
		bodyModel[196] = new ModelRendererTurbo(this, 235, 303, textureX, textureY); // Right seat part
		bodyModel[197] = new ModelRendererTurbo(this, 235, 280, textureX, textureY); // Left seat part
		bodyModel[198] = new ModelRendererTurbo(this, 229, 313, textureX, textureY); // Right seat part
		bodyModel[199] = new ModelRendererTurbo(this, 229, 290, textureX, textureY); // Left seat part
		bodyModel[200] = new ModelRendererTurbo(this, 250, 308, textureX, textureY); // Right seat part
		bodyModel[201] = new ModelRendererTurbo(this, 250, 323, textureX, textureY); // Right seat part
		bodyModel[202] = new ModelRendererTurbo(this, 250, 286, textureX, textureY); // Left seat part
		bodyModel[203] = new ModelRendererTurbo(this, 250, 298, textureX, textureY); // Left seat part
		bodyModel[204] = new ModelRendererTurbo(this, 250, 311, textureX, textureY); // Right seat part
		bodyModel[205] = new ModelRendererTurbo(this, 250, 320, textureX, textureY); // Right seat part
		bodyModel[206] = new ModelRendererTurbo(this, 250, 283, textureX, textureY); // Left seat part
		bodyModel[207] = new ModelRendererTurbo(this, 250, 295, textureX, textureY); // Left seat part
		bodyModel[208] = new ModelRendererTurbo(this, 272, 303, textureX, textureY); // Right seat part
		bodyModel[209] = new ModelRendererTurbo(this, 272, 280, textureX, textureY); // Left seat part
		bodyModel[210] = new ModelRendererTurbo(this, 266, 313, textureX, textureY); // Right seat part
		bodyModel[211] = new ModelRendererTurbo(this, 266, 290, textureX, textureY); // Left seat part
		bodyModel[212] = new ModelRendererTurbo(this, 287, 308, textureX, textureY); // Right seat part
		bodyModel[213] = new ModelRendererTurbo(this, 287, 323, textureX, textureY); // Right seat part
		bodyModel[214] = new ModelRendererTurbo(this, 287, 286, textureX, textureY); // Left seat part
		bodyModel[215] = new ModelRendererTurbo(this, 287, 298, textureX, textureY); // Left seat part
		bodyModel[216] = new ModelRendererTurbo(this, 287, 311, textureX, textureY); // Right seat part
		bodyModel[217] = new ModelRendererTurbo(this, 287, 320, textureX, textureY); // Right seat part
		bodyModel[218] = new ModelRendererTurbo(this, 287, 283, textureX, textureY); // Left seat part
		bodyModel[219] = new ModelRendererTurbo(this, 287, 295, textureX, textureY); // Left seat part
		bodyModel[220] = new ModelRendererTurbo(this, 124, 303, textureX, textureY); // Right seat part
		bodyModel[221] = new ModelRendererTurbo(this, 124, 280, textureX, textureY); // Left seat part
		bodyModel[222] = new ModelRendererTurbo(this, 118, 313, textureX, textureY); // Right seat part
		bodyModel[223] = new ModelRendererTurbo(this, 118, 290, textureX, textureY); // Left seat part
		bodyModel[224] = new ModelRendererTurbo(this, 139, 308, textureX, textureY); // Right seat part
		bodyModel[225] = new ModelRendererTurbo(this, 139, 323, textureX, textureY); // Right seat part
		bodyModel[226] = new ModelRendererTurbo(this, 139, 286, textureX, textureY); // Left seat part
		bodyModel[227] = new ModelRendererTurbo(this, 139, 298, textureX, textureY); // Left seat part
		bodyModel[228] = new ModelRendererTurbo(this, 139, 311, textureX, textureY); // Right seat part
		bodyModel[229] = new ModelRendererTurbo(this, 139, 320, textureX, textureY); // Right seat part
		bodyModel[230] = new ModelRendererTurbo(this, 139, 283, textureX, textureY); // Left seat part
		bodyModel[231] = new ModelRendererTurbo(this, 139, 295, textureX, textureY); // Left seat part
		bodyModel[232] = new ModelRendererTurbo(this, 308, 300, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[233] = new ModelRendererTurbo(this, 309, 312, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[234] = new ModelRendererTurbo(this, 494, 300, textureX, textureY); // Box 463
		bodyModel[235] = new ModelRendererTurbo(this, 81, 235, textureX, textureY); // Box 38
		bodyModel[236] = new ModelRendererTurbo(this, 77, 241, textureX, textureY); // Box 462
		bodyModel[237] = new ModelRendererTurbo(this, 482, 291, textureX, textureY); // Box 38
		bodyModel[238] = new ModelRendererTurbo(this, 485, 296, textureX, textureY); // Box 38
		bodyModel[239] = new ModelRendererTurbo(this, 484, 300, textureX, textureY); // Box 38
		bodyModel[240] = new ModelRendererTurbo(this, 470, 306, textureX, textureY); // Box 232
		bodyModel[241] = new ModelRendererTurbo(this, 465, 273, textureX, textureY); // Box 380
		bodyModel[242] = new ModelRendererTurbo(this, 472, 273, textureX, textureY); // Box 381
		bodyModel[243] = new ModelRendererTurbo(this, 477, 277, textureX, textureY); // Box 382
		bodyModel[244] = new ModelRendererTurbo(this, 454, 278, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[245] = new ModelRendererTurbo(this, 448, 245, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[246] = new ModelRendererTurbo(this, 434, 252, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[247] = new ModelRendererTurbo(this, 460, 252, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[248] = new ModelRendererTurbo(this, 435, 233, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[249] = new ModelRendererTurbo(this, 440, 242, textureX, textureY); // Box 38
		bodyModel[250] = new ModelRendererTurbo(this, 422, 265, textureX, textureY); // Boc 42
		bodyModel[251] = new ModelRendererTurbo(this, 436, 300, textureX, textureY); // Boc 42
		bodyModel[252] = new ModelRendererTurbo(this, 418, 284, textureX, textureY); // Boc 42
		bodyModel[253] = new ModelRendererTurbo(this, 422, 293, textureX, textureY); // Boc 42
		bodyModel[254] = new ModelRendererTurbo(this, 438, 293, textureX, textureY); // Boc 42
		bodyModel[255] = new ModelRendererTurbo(this, 422, 290, textureX, textureY); // Boc 42
		bodyModel[256] = new ModelRendererTurbo(this, 438, 290, textureX, textureY); // Boc 42
		bodyModel[257] = new ModelRendererTurbo(this, 418, 300, textureX, textureY); // Boc 42
		bodyModel[258] = new ModelRendererTurbo(this, 427, 300, textureX, textureY); // Boc 42
		bodyModel[259] = new ModelRendererTurbo(this, 441, 259, textureX, textureY); // Boc 42
		bodyModel[260] = new ModelRendererTurbo(this, 440, 273, textureX, textureY); // Boc 42
		bodyModel[261] = new ModelRendererTurbo(this, 438, 266, textureX, textureY); // Boc 42
		bodyModel[262] = new ModelRendererTurbo(this, 441, 253, textureX, textureY); // Boc 42
		bodyModel[263] = new ModelRendererTurbo(this, 450, 253, textureX, textureY); // Boc 42
		bodyModel[264] = new ModelRendererTurbo(this, 441, 248, textureX, textureY); // Boc 42
		bodyModel[265] = new ModelRendererTurbo(this, 450, 248, textureX, textureY); // Boc 42
		bodyModel[266] = new ModelRendererTurbo(this, 449, 273, textureX, textureY); // Boc 42
		bodyModel[267] = new ModelRendererTurbo(this, 457, 286, textureX, textureY); // Box 498
		bodyModel[268] = new ModelRendererTurbo(this, 460, 300, textureX, textureY); // Box 499
		bodyModel[269] = new ModelRendererTurbo(this, 454, 293, textureX, textureY); // Box 500
		bodyModel[270] = new ModelRendererTurbo(this, 449, 291, textureX, textureY); // Box 501
		bodyModel[271] = new ModelRendererTurbo(this, 473, 290, textureX, textureY); // Box 502
		bodyModel[272] = new ModelRendererTurbo(this, 448, 286, textureX, textureY); // Box 503
		bodyModel[273] = new ModelRendererTurbo(this, 474, 285, textureX, textureY); // Box 504
		bodyModel[274] = new ModelRendererTurbo(this, 469, 300, textureX, textureY); // Box 505
		bodyModel[275] = new ModelRendererTurbo(this, 135, 185, textureX, textureY); // Box 2
		bodyModel[276] = new ModelRendererTurbo(this, 173, 185, textureX, textureY); // Box 2
		bodyModel[277] = new ModelRendererTurbo(this, 173, 193, textureX, textureY); // Box 2
		bodyModel[278] = new ModelRendererTurbo(this, 167, 185, textureX, textureY); // Box 2
		bodyModel[279] = new ModelRendererTurbo(this, 132, 185, textureX, textureY); // Box 2
		bodyModel[280] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 2
		bodyModel[281] = new ModelRendererTurbo(this, 166, 171, textureX, textureY); // Box 667
		bodyModel[282] = new ModelRendererTurbo(this, 197, 171, textureX, textureY); // Box 668
		bodyModel[283] = new ModelRendererTurbo(this, 154, 171, textureX, textureY); // Box 667
		bodyModel[284] = new ModelRendererTurbo(this, 165, 171, textureX, textureY); // Box 667
		bodyModel[285] = new ModelRendererTurbo(this, 142, 174, textureX, textureY); // Box 667
		bodyModel[286] = new ModelRendererTurbo(this, 145, 171, textureX, textureY,"cull"); // Box 667 cull
		bodyModel[287] = new ModelRendererTurbo(this, 172, 185, textureX, textureY); // Box 2
		bodyModel[288] = new ModelRendererTurbo(this, 158, 180, textureX, textureY); // Box 41
		bodyModel[289] = new ModelRendererTurbo(this, 141, 180, textureX, textureY); // Box 41
		bodyModel[290] = new ModelRendererTurbo(this, 207, 196, textureX, textureY); // Box 538
		bodyModel[291] = new ModelRendererTurbo(this, 206, 187, textureX, textureY,"cull"); // Box 538 cull
		bodyModel[292] = new ModelRendererTurbo(this, 208, 194, textureX, textureY); // Box 538
		bodyModel[293] = new ModelRendererTurbo(this, 207, 185, textureX, textureY); // Box 538
		bodyModel[294] = new ModelRendererTurbo(this, 113, 170, textureX, textureY); // Box 538
		bodyModel[295] = new ModelRendererTurbo(this, 132, 174, textureX, textureY,"cull"); // Box 668 cull
		bodyModel[296] = new ModelRendererTurbo(this, 134, 172, textureX, textureY); // Box 669
		bodyModel[297] = new ModelRendererTurbo(this, 133, 181, textureX, textureY); // Box 670
		bodyModel[298] = new ModelRendererTurbo(this, 87, 247, textureX, textureY); // Box 38
		bodyModel[299] = new ModelRendererTurbo(this, 87, 253, textureX, textureY); // Box 452
		bodyModel[300] = new ModelRendererTurbo(this, 87, 249, textureX, textureY); // Box 38
		bodyModel[301] = new ModelRendererTurbo(this, 87, 255, textureX, textureY); // Box 452
		bodyModel[302] = new ModelRendererTurbo(this, 311, 234, textureX, textureY); // Box 38
		bodyModel[303] = new ModelRendererTurbo(this, 311, 236, textureX, textureY); // Box 526
		bodyModel[304] = new ModelRendererTurbo(this, 440, 231, textureX, textureY); // Box 38
		bodyModel[305] = new ModelRendererTurbo(this, 176, 303, textureX, textureY); // Right seat part
		bodyModel[306] = new ModelRendererTurbo(this, 176, 315, textureX, textureY); // Right seat part
		bodyModel[307] = new ModelRendererTurbo(this, 213, 303, textureX, textureY); // Right seat part
		bodyModel[308] = new ModelRendererTurbo(this, 213, 315, textureX, textureY); // Right seat part
		bodyModel[309] = new ModelRendererTurbo(this, 250, 303, textureX, textureY); // Right seat part
		bodyModel[310] = new ModelRendererTurbo(this, 250, 315, textureX, textureY); // Right seat part
		bodyModel[311] = new ModelRendererTurbo(this, 287, 303, textureX, textureY); // Right seat part
		bodyModel[312] = new ModelRendererTurbo(this, 287, 315, textureX, textureY); // Right seat part
		bodyModel[313] = new ModelRendererTurbo(this, 139, 303, textureX, textureY); // Right seat part
		bodyModel[314] = new ModelRendererTurbo(this, 139, 315, textureX, textureY); // Right seat part
		bodyModel[315] = new ModelRendererTurbo(this, 139, 278, textureX, textureY); // Left seat part
		bodyModel[316] = new ModelRendererTurbo(this, 139, 290, textureX, textureY); // Left seat part
		bodyModel[317] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // Left seat part
		bodyModel[318] = new ModelRendererTurbo(this, 287, 290, textureX, textureY); // Left seat part
		bodyModel[319] = new ModelRendererTurbo(this, 250, 278, textureX, textureY); // Left seat part
		bodyModel[320] = new ModelRendererTurbo(this, 250, 290, textureX, textureY); // Left seat part
		bodyModel[321] = new ModelRendererTurbo(this, 213, 278, textureX, textureY); // Left seat part
		bodyModel[322] = new ModelRendererTurbo(this, 213, 290, textureX, textureY); // Left seat part
		bodyModel[323] = new ModelRendererTurbo(this, 176, 278, textureX, textureY); // Left seat part
		bodyModel[324] = new ModelRendererTurbo(this, 176, 290, textureX, textureY); // Left seat part
		bodyModel[325] = new ModelRendererTurbo(this, 198, 320, textureX, textureY); // Right seat part base
		bodyModel[326] = new ModelRendererTurbo(this, 161, 320, textureX, textureY); // Right seat part base
		bodyModel[327] = new ModelRendererTurbo(this, 161, 297, textureX, textureY); // Left seat part base
		bodyModel[328] = new ModelRendererTurbo(this, 272, 297, textureX, textureY); // Left seat part base
		bodyModel[329] = new ModelRendererTurbo(this, 124, 320, textureX, textureY); // Right seat part base
		bodyModel[330] = new ModelRendererTurbo(this, 272, 320, textureX, textureY); // Right seat part base
		bodyModel[331] = new ModelRendererTurbo(this, 235, 320, textureX, textureY); // Right seat part base
		bodyModel[332] = new ModelRendererTurbo(this, 124, 297, textureX, textureY); // Left seat part base
		bodyModel[333] = new ModelRendererTurbo(this, 235, 297, textureX, textureY); // Left seat part base
		bodyModel[334] = new ModelRendererTurbo(this, 198, 297, textureX, textureY); // Left seat part base
		bodyModel[335] = new ModelRendererTurbo(this, 304, 276, textureX, textureY); // Box 38
		bodyModel[336] = new ModelRendererTurbo(this, 50, 102, textureX, textureY); // Box 43
		bodyModel[337] = new ModelRendererTurbo(this, 53, 115, textureX, textureY); // Box 43
		bodyModel[338] = new ModelRendererTurbo(this, 89, 87, textureX, textureY); // Box 128
		bodyModel[339] = new ModelRendererTurbo(this, 47, 156, textureX, textureY); // Box 43
		bodyModel[340] = new ModelRendererTurbo(this, 47, 153, textureX, textureY); // Box 487
		bodyModel[341] = new ModelRendererTurbo(this, 53, 290, textureX, textureY); // Box 38
		bodyModel[342] = new ModelRendererTurbo(this, 53, 296, textureX, textureY); // Box 491
		bodyModel[343] = new ModelRendererTurbo(this, 288, 34, textureX, textureY); // Box 38
		bodyModel[344] = new ModelRendererTurbo(this, 302, 49, textureX, textureY); // Box 247
		bodyModel[345] = new ModelRendererTurbo(this, 388, 287, textureX, textureY); // Box 234
		bodyModel[346] = new ModelRendererTurbo(this, 397, 278, textureX, textureY); // Box 38
		bodyModel[347] = new ModelRendererTurbo(this, 369, 280, textureX, textureY); // Box 234
		bodyModel[348] = new ModelRendererTurbo(this, 361, 286, textureX, textureY); // Box 380
		bodyModel[349] = new ModelRendererTurbo(this, 370, 289, textureX, textureY); // Box 381
		bodyModel[350] = new ModelRendererTurbo(this, 375, 294, textureX, textureY); // Box 382
		bodyModel[351] = new ModelRendererTurbo(this, 363, 282, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[352] = new ModelRendererTurbo(this, 323, 287, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[353] = new ModelRendererTurbo(this, 317, 278, textureX, textureY); // Boc 42
		bodyModel[354] = new ModelRendererTurbo(this, 343, 313, textureX, textureY); // Boc 42
		bodyModel[355] = new ModelRendererTurbo(this, 322, 297, textureX, textureY); // Boc 42
		bodyModel[356] = new ModelRendererTurbo(this, 326, 306, textureX, textureY); // Boc 42
		bodyModel[357] = new ModelRendererTurbo(this, 342, 306, textureX, textureY); // Boc 42
		bodyModel[358] = new ModelRendererTurbo(this, 326, 303, textureX, textureY); // Boc 42
		bodyModel[359] = new ModelRendererTurbo(this, 342, 303, textureX, textureY); // Boc 42
		bodyModel[360] = new ModelRendererTurbo(this, 325, 313, textureX, textureY); // Boc 42
		bodyModel[361] = new ModelRendererTurbo(this, 334, 313, textureX, textureY); // Boc 42
		bodyModel[362] = new ModelRendererTurbo(this, 355, 291, textureX, textureY); // Box 498
		bodyModel[363] = new ModelRendererTurbo(this, 358, 305, textureX, textureY); // Box 499
		bodyModel[364] = new ModelRendererTurbo(this, 352, 298, textureX, textureY); // Box 500
		bodyModel[365] = new ModelRendererTurbo(this, 347, 296, textureX, textureY); // Box 501
		bodyModel[366] = new ModelRendererTurbo(this, 366, 296, textureX, textureY); // Box 502
		bodyModel[367] = new ModelRendererTurbo(this, 346, 291, textureX, textureY); // Box 503
		bodyModel[368] = new ModelRendererTurbo(this, 366, 291, textureX, textureY); // Box 504
		bodyModel[369] = new ModelRendererTurbo(this, 369, 38, textureX, textureY); // Box 38
		bodyModel[370] = new ModelRendererTurbo(this, 379, 46, textureX, textureY); // Box 38
		bodyModel[371] = new ModelRendererTurbo(this, 349, 35, textureX, textureY); // Box 38
		bodyModel[372] = new ModelRendererTurbo(this, 311, 35, textureX, textureY); // Box 38
		bodyModel[373] = new ModelRendererTurbo(this, 321, 46, textureX, textureY); // Box 38
		bodyModel[374] = new ModelRendererTurbo(this, 329, 38, textureX, textureY); // Box 38
		bodyModel[375] = new ModelRendererTurbo(this, 411, 11, textureX, textureY); // Box 274
		bodyModel[376] = new ModelRendererTurbo(this, 411, 7, textureX, textureY); // Box 275
		bodyModel[377] = new ModelRendererTurbo(this, 246, 2, textureX, textureY); // Box 169
		bodyModel[378] = new ModelRendererTurbo(this, 247, 8, textureX, textureY); // Box 59
		bodyModel[379] = new ModelRendererTurbo(this, 180, 56, textureX, textureY); // Box 58
		bodyModel[380] = new ModelRendererTurbo(this, 409, 277, textureX, textureY); // Box 38
		bodyModel[381] = new ModelRendererTurbo(this, 412, 282, textureX, textureY); // Box 38
		bodyModel[382] = new ModelRendererTurbo(this, 418, 285, textureX, textureY); // Box 38
		bodyModel[383] = new ModelRendererTurbo(this, 380, 289, textureX, textureY); // Box 38
		bodyModel[384] = new ModelRendererTurbo(this, 122, 187, textureX, textureY); // Box 2
		bodyModel[385] = new ModelRendererTurbo(this, 67, 64, textureX, textureY); // Box 210
		bodyModel[386] = new ModelRendererTurbo(this, 72, 99, textureX, textureY); // Box 43 side door
		bodyModel[387] = new ModelRendererTurbo(this, 73, 96, textureX, textureY); // Box 128
		bodyModel[388] = new ModelRendererTurbo(this, 33, 108, textureX, textureY); // Box 43 side door
		bodyModel[389] = new ModelRendererTurbo(this, 33, 102, textureX, textureY); // Box 43 side door
		bodyModel[390] = new ModelRendererTurbo(this, 78, 98, textureX, textureY); // Box 43 side door
		bodyModel[391] = new ModelRendererTurbo(this, 79, 92, textureX, textureY); // Box 43 side door
		bodyModel[392] = new ModelRendererTurbo(this, 77, 101, textureX, textureY); // Box 43 side door
		bodyModel[393] = new ModelRendererTurbo(this, 49, 88, textureX, textureY); // Box 202
		bodyModel[394] = new ModelRendererTurbo(this, 46, 88, textureX, textureY); // Box 203
		bodyModel[395] = new ModelRendererTurbo(this, 114, 189, textureX, textureY,"cull"); // Box 320 cull
		bodyModel[396] = new ModelRendererTurbo(this, 114, 185, textureX, textureY,"cull"); // Box 321 cull
		bodyModel[397] = new ModelRendererTurbo(this, 114, 177, textureX, textureY,"cull"); // Box 156 cull
		bodyModel[398] = new ModelRendererTurbo(this, 114, 173, textureX, textureY,"cull"); // Box 156 cull
		bodyModel[399] = new ModelRendererTurbo(this, 43, 144, textureX, textureY); // Box 2
		bodyModel[400] = new ModelRendererTurbo(this, 33, 142, textureX, textureY); // Box 2
		bodyModel[401] = new ModelRendererTurbo(this, 43, 159, textureX, textureY); // Box 436
		bodyModel[402] = new ModelRendererTurbo(this, 33, 155, textureX, textureY); // Box 437
		bodyModel[403] = new ModelRendererTurbo(this, 107, 189, textureX, textureY,"cull"); // Box 320 cull
		bodyModel[404] = new ModelRendererTurbo(this, 107, 185, textureX, textureY,"cull"); // Box 321 cull
		bodyModel[405] = new ModelRendererTurbo(this, 107, 177, textureX, textureY,"cull"); // Box 156 cull
		bodyModel[406] = new ModelRendererTurbo(this, 107, 173, textureX, textureY,"cull"); // Box 156 cull
		bodyModel[407] = new ModelRendererTurbo(this, 46, 67, textureX, textureY); // Box 43
		bodyModel[408] = new ModelRendererTurbo(this, 66, 309, textureX, textureY); // Box 232
		bodyModel[409] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 446
		bodyModel[410] = new ModelRendererTurbo(this, 10, 20, textureX, textureY); // Box 447
		bodyModel[411] = new ModelRendererTurbo(this, 2, 59, textureX, textureY); // Box 448
		bodyModel[412] = new ModelRendererTurbo(this, 63, 78, textureX, textureY); // Box 451
		bodyModel[413] = new ModelRendererTurbo(this, 45, 96, textureX, textureY); // Box 452
		bodyModel[414] = new ModelRendererTurbo(this, 72, 73, textureX, textureY); // Box 38
		bodyModel[415] = new ModelRendererTurbo(this, 83, 73, textureX, textureY); // Box 38
		bodyModel[416] = new ModelRendererTurbo(this, 66, 68, textureX, textureY); // Box 38
		bodyModel[417] = new ModelRendererTurbo(this, 54, 91, textureX, textureY); // Box 469
		bodyModel[418] = new ModelRendererTurbo(this, 65, 96, textureX, textureY); // Box 470
		bodyModel[419] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 128
		bodyModel[420] = new ModelRendererTurbo(this, 89, 67, textureX, textureY); // Box 38
		bodyModel[421] = new ModelRendererTurbo(this, 80, 67, textureX, textureY); // Box 38
		bodyModel[422] = new ModelRendererTurbo(this, 81, 69, textureX, textureY); // Box 38
		bodyModel[423] = new ModelRendererTurbo(this, 71, 67, textureX, textureY); // Box 38
		bodyModel[424] = new ModelRendererTurbo(this, 42, 3, textureX, textureY); // Box 128
		bodyModel[425] = new ModelRendererTurbo(this, 21, 30, textureX, textureY); // Box 486
		bodyModel[426] = new ModelRendererTurbo(this, 35, 47, textureX, textureY); // Box 487
		bodyModel[427] = new ModelRendererTurbo(this, 65, 92, textureX, textureY); // Box 490
		bodyModel[428] = new ModelRendererTurbo(this, 80, 87, textureX, textureY); // Box 491
		bodyModel[429] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 492
		bodyModel[430] = new ModelRendererTurbo(this, 64, 87, textureX, textureY); // Box 493
		bodyModel[431] = new ModelRendererTurbo(this, 70, 93, textureX, textureY); // Box 128
		bodyModel[432] = new ModelRendererTurbo(this, 93, 92, textureX, textureY); // Box 470
		bodyModel[433] = new ModelRendererTurbo(this, 33, 3, textureX, textureY); // Box 496
		bodyModel[434] = new ModelRendererTurbo(this, 57, 44, textureX, textureY); // Box 497
		bodyModel[435] = new ModelRendererTurbo(this, 46, 44, textureX, textureY); // Box 498
		bodyModel[436] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Box 499
		bodyModel[437] = new ModelRendererTurbo(this, 19, 13, textureX, textureY); // Box 474
		bodyModel[438] = new ModelRendererTurbo(this, 15, 3, textureX, textureY); // Box 495
		bodyModel[439] = new ModelRendererTurbo(this, 26, 8, textureX, textureY); // Box 496
		bodyModel[440] = new ModelRendererTurbo(this, 33, 267, textureX, textureY); // Box 232
		bodyModel[441] = new ModelRendererTurbo(this, 55, 6, textureX, textureY); // Box 128
		bodyModel[442] = new ModelRendererTurbo(this, 53, 14, textureX, textureY); // Box 128
		bodyModel[443] = new ModelRendererTurbo(this, 55, 36, textureX, textureY); // Box 500
		bodyModel[444] = new ModelRendererTurbo(this, 53, 25, textureX, textureY); // Box 501
		bodyModel[445] = new ModelRendererTurbo(this, 39, 8, textureX, textureY); // Box 128
		bodyModel[446] = new ModelRendererTurbo(this, 32, 16, textureX, textureY); // Box 128
		bodyModel[447] = new ModelRendererTurbo(this, 40, 36, textureX, textureY); // Box 504
		bodyModel[448] = new ModelRendererTurbo(this, 32, 26, textureX, textureY); // Box 505
		bodyModel[449] = new ModelRendererTurbo(this, 24, 3, textureX, textureY); // Box 496
		bodyModel[450] = new ModelRendererTurbo(this, 1, 15, textureX, textureY); // Box 506
		bodyModel[451] = new ModelRendererTurbo(this, 10, 15, textureX, textureY); // Box 507
		bodyModel[452] = new ModelRendererTurbo(this, 40, 307, textureX, textureY); // Box 495
		bodyModel[453] = new ModelRendererTurbo(this, 40, 298, textureX, textureY); // Box 510
		bodyModel[454] = new ModelRendererTurbo(this, 45, 316, textureX, textureY); // Box 496
		bodyModel[455] = new ModelRendererTurbo(this, 45, 294, textureX, textureY); // Box 510
		bodyModel[456] = new ModelRendererTurbo(this, 302, 252, textureX, textureY); // Box 38
		bodyModel[457] = new ModelRendererTurbo(this, 306, 272, textureX, textureY); // Box 512
		bodyModel[458] = new ModelRendererTurbo(this, 46, 267, textureX, textureY); // Box 38
		bodyModel[459] = new ModelRendererTurbo(this, 46, 283, textureX, textureY); // Box 515
		bodyModel[460] = new ModelRendererTurbo(this, 44, 289, textureX, textureY); // Box 38
		bodyModel[461] = new ModelRendererTurbo(this, 44, 320, textureX, textureY); // Box 517
		bodyModel[462] = new ModelRendererTurbo(this, 54, 330, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[463] = new ModelRendererTurbo(this, 2, 54, textureX, textureY); // Box 448
		bodyModel[464] = new ModelRendererTurbo(this, 1, 20, textureX, textureY); // Box 448
		bodyModel[465] = new ModelRendererTurbo(this, 21, 25, textureX, textureY); // Box 448
		bodyModel[466] = new ModelRendererTurbo(this, 46, 62, textureX, textureY); // Box 522
		bodyModel[467] = new ModelRendererTurbo(this, 46, 50, textureX, textureY); // Box 523
		bodyModel[468] = new ModelRendererTurbo(this, 75, 310, textureX, textureY); // Box 232
		bodyModel[469] = new ModelRendererTurbo(this, 75, 306, textureX, textureY); // Box 232
		bodyModel[470] = new ModelRendererTurbo(this, 65, 302, textureX, textureY); // Box 232
		bodyModel[471] = new ModelRendererTurbo(this, 70, 302, textureX, textureY); // Box 232
		bodyModel[472] = new ModelRendererTurbo(this, 16, 40, textureX, textureY); // Box 528
		bodyModel[473] = new ModelRendererTurbo(this, 75, 302, textureX, textureY); // Box 232
		bodyModel[474] = new ModelRendererTurbo(this, 75, 361, textureX, textureY); // Box 530
		bodyModel[475] = new ModelRendererTurbo(this, 75, 357, textureX, textureY); // Box 531
		bodyModel[476] = new ModelRendererTurbo(this, 65, 353, textureX, textureY); // Box 532
		bodyModel[477] = new ModelRendererTurbo(this, 70, 353, textureX, textureY); // Box 533
		bodyModel[478] = new ModelRendererTurbo(this, 75, 353, textureX, textureY); // Box 534
		bodyModel[479] = new ModelRendererTurbo(this, 55, 314, textureX, textureY); // Box 232
		bodyModel[480] = new ModelRendererTurbo(this, 66, 342, textureX, textureY); // Box 537
		bodyModel[481] = new ModelRendererTurbo(this, 55, 328, textureX, textureY); // Box 538
		bodyModel[482] = new ModelRendererTurbo(this, 48, 108, textureX, textureY); // Box 43 side door
		bodyModel[483] = new ModelRendererTurbo(this, 86, 318, textureX, textureY); // Right seat part
		bodyModel[484] = new ModelRendererTurbo(this, 86, 272, textureX, textureY); // Left seat part
		bodyModel[485] = new ModelRendererTurbo(this, 86, 335, textureX, textureY); // Boc 42
		bodyModel[486] = new ModelRendererTurbo(this, 85, 289, textureX, textureY); // Boc 42
		bodyModel[487] = new ModelRendererTurbo(this, 80, 328, textureX, textureY); // Right seat part
		bodyModel[488] = new ModelRendererTurbo(this, 80, 282, textureX, textureY); // Left seat part
		bodyModel[489] = new ModelRendererTurbo(this, 110, 320, textureX, textureY); // Right seat part
		bodyModel[490] = new ModelRendererTurbo(this, 101, 323, textureX, textureY); // Right seat part
		bodyModel[491] = new ModelRendererTurbo(this, 101, 320, textureX, textureY); // Right seat part
		bodyModel[492] = new ModelRendererTurbo(this, 110, 330, textureX, textureY); // Right seat part
		bodyModel[493] = new ModelRendererTurbo(this, 101, 336, textureX, textureY); // Right seat part
		bodyModel[494] = new ModelRendererTurbo(this, 101, 330, textureX, textureY); // Right seat part
		bodyModel[495] = new ModelRendererTurbo(this, 110, 274, textureX, textureY); // Left seat part
		bodyModel[496] = new ModelRendererTurbo(this, 101, 280, textureX, textureY); // Left seat part
		bodyModel[497] = new ModelRendererTurbo(this, 101, 274, textureX, textureY); // Left seat part
		bodyModel[498] = new ModelRendererTurbo(this, 110, 284, textureX, textureY); // Left seat part
		bodyModel[499] = new ModelRendererTurbo(this, 101, 290, textureX, textureY); // Left seat part

		bodyModel[0].addBox(0F, 0F, 0F, 112, 1, 20, 0F); // Box 2
		bodyModel[0].setRotationPoint(-54F, 1F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[1].setRotationPoint(58F, 1F, -4F);

		bodyModel[2].addBox(0F, 0F, 0F, 108, 2, 1, 0F); // Box 2
		bodyModel[2].setRotationPoint(-54F, 2F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 2
		bodyModel[3].setRotationPoint(-59F, 1F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 2
		bodyModel[4].setRotationPoint(-58F, 1F, -5F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[5].setRotationPoint(58F, 3F, -1.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[6].setRotationPoint(-61F, 3F, -1.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 4, 8, 0F); // Box 2
		bodyModel[7].setRotationPoint(-58F, 2F, -4F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 4, 8, 0F); // Box 2
		bodyModel[8].setRotationPoint(54F, 2F, -4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[9].setRotationPoint(59F, 1.5F, -4F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[10].setRotationPoint(-60.5F, -15F, -4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[11].setRotationPoint(-60.5F, 1F, -4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[12].setRotationPoint(-60.5F, -14F, 3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[13].setRotationPoint(-61F, -14F, -5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[14].setRotationPoint(-61F, -14F, 3F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[15].setRotationPoint(-61F, 1F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[16].setRotationPoint(-61F, -16F, -5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[17].setRotationPoint(-60.5F, -14F, -4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 106, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[18].setRotationPoint(-54F, -2F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 97, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 43
		bodyModel[19].setRotationPoint(-54F, -2F, 10F);

		bodyModel[20].addBox(0F, 0F, 0F, 96, 14, 1, 0F); // Box 38
		bodyModel[20].setRotationPoint(-54F, -16F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 96, 14, 1, 0F); // Box 128
		bodyModel[21].setRotationPoint(-54F, -16F, 10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[22].setRotationPoint(-59F, -18F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 101, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[23].setRotationPoint(-59F, -19.5F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 101, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[24].setRotationPoint(-59F, -19F, -9.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 44, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[25].setRotationPoint(-59F, -18F, 9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 101, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[26].setRotationPoint(-59F, -19.5F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 101, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[27].setRotationPoint(-59F, -19F, 5.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 101, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[28].setRotationPoint(-59F, -19F, -6F);

		bodyModel[29].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.22F, 0F, -0.5F, -0.22F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left trapdoor front
		bodyModel[29].setRotationPoint(-54F, 1F, -11F);

		bodyModel[30].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.22F, 0F, -0.5F, -0.22F); // Right trapdoor front
		bodyModel[30].setRotationPoint(-54F, 1F, 5F);

		bodyModel[31].addShapeBox(0F, 2F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 550
		bodyModel[31].setRotationPoint(-57.99F, 0.5F, -6.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 552
		bodyModel[32].setRotationPoint(-57.99F, 4F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[33].setRotationPoint(-57.99F, 4F, -8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0.25F, -0.02F, 0F, 0.25F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.02F, 0F, 0.25F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[34].setRotationPoint(-57.99F, 7F, -10.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F); // Box 555
		bodyModel[35].setRotationPoint(-54.01F, 2.5F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 556
		bodyModel[36].setRotationPoint(-54.01F, 2.5F, -10.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[37].setRotationPoint(-57.99F, 5.5F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 558
		bodyModel[38].setRotationPoint(-57.99F, 5.5F, -9.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F); // Box 559
		bodyModel[39].setRotationPoint(-57.99F, 2.5F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 560
		bodyModel[40].setRotationPoint(-57.99F, 2.5F, -10.5F);

		bodyModel[41].addShapeBox(0F, 2F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 551
		bodyModel[41].setRotationPoint(-58F, 0F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 555
		bodyModel[42].setRotationPoint(-54.01F, 2F, -9.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 559
		bodyModel[43].setRotationPoint(-57.99F, 2F, -9.5F);

		bodyModel[44].addShapeBox(0F, 2F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 82
		bodyModel[44].setRotationPoint(-57.99F, 0.5F, 6.5F);

		bodyModel[45].addShapeBox(0F, 2F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 83
		bodyModel[45].setRotationPoint(-57.99F, 0.5F, 5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 84
		bodyModel[46].setRotationPoint(-57.99F, 4F, 8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 85
		bodyModel[47].setRotationPoint(-57.99F, 4F, 6.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 86
		bodyModel[48].setRotationPoint(-57.99F, 7F, 9.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 87
		bodyModel[49].setRotationPoint(-54.01F, 2.5F, 5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 88
		bodyModel[50].setRotationPoint(-54.01F, 2.5F, 9.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 89
		bodyModel[51].setRotationPoint(-57.99F, 5.5F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 90
		bodyModel[52].setRotationPoint(-57.99F, 5.5F, 9.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 91
		bodyModel[53].setRotationPoint(-57.99F, 2.5F, 5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 92
		bodyModel[54].setRotationPoint(-57.99F, 2.5F, 9.5F);

		bodyModel[55].addShapeBox(0F, 2F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[55].setRotationPoint(-58F, 0F, 5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[56].setRotationPoint(-54.01F, 2F, 4.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[57].setRotationPoint(-57.99F, 2F, 4.5F);

		bodyModel[58].addShapeBox(0F, 2F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[58].setRotationPoint(-57.99F, 0.5F, -7F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 17, 7, 0F); // Box 128
		bodyModel[59].setRotationPoint(-54F, -16F, -10F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 17, 7, 0F); // Box 128
		bodyModel[60].setRotationPoint(-54F, -16F, 3F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[61].setRotationPoint(-54F, -16F, -3F);

		bodyModel[62].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Vestibule door Front
		bodyModel[62].setRotationPoint(-53F, -14F, -3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 6, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[63].setRotationPoint(-59F, -18F, -9.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 128
		bodyModel[64].setRotationPoint(-58F, -16F, -11F);

		bodyModel[65].addShapeBox(-4F, 0F, 0F, 5, 13, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door front
		bodyModel[65].setRotationPoint(-54F, -15F, 10.5F);

		bodyModel[66].addShapeBox(-4F, 0F, -1F, 5, 13, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Left side door front
		bodyModel[66].setRotationPoint(-54F, -15F, -10.5F);

		bodyModel[67].addShapeBox(-4F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.69F, 0F, 0F, -0.69F); // Right side door front
		bodyModel[67].setRotationPoint(-54F, -2F, 10.5F);

		bodyModel[68].addShapeBox(-4F, 0F, -1F, 5, 3, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.69F, -1F, 0F, -0.69F, -1F, 0F, 0F, 0F, 0F, 0F); // Left side door front
		bodyModel[68].setRotationPoint(-54F, -2F, -10.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 128
		bodyModel[69].setRotationPoint(-58.5F, -6F, -12F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 128
		bodyModel[70].setRotationPoint(-53.5F, -6F, -12F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 202
		bodyModel[71].setRotationPoint(-58.5F, -6F, 11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 203
		bodyModel[72].setRotationPoint(-53.5F, -6F, 11F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 128
		bodyModel[73].setRotationPoint(-59F, -16F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 128
		bodyModel[74].setRotationPoint(-59F, -16F, 3F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 2
		bodyModel[75].setRotationPoint(-59F, -2F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[76].setRotationPoint(-59F, -2F, -11F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 42
		bodyModel[77].setRotationPoint(-59F, -2F, 3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 43
		bodyModel[78].setRotationPoint(-59F, -2F, 10F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[79].setRotationPoint(-59F, -16F, -3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.625F, -0.575F, -0.5F, -0.625F, -0.575F, -0.5F, -0.25F, -0.65F, 0F, -0.25F, -0.65F, 0F, 0.525F, -0.5F, -0.5F, 0.525F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[80].setRotationPoint(-51F, -20.09F, -8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 59
		bodyModel[81].setRotationPoint(-36.5F, -19.5F, 6.62F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 17, 15, 0F); // Box 38
		bodyModel[82].setRotationPoint(-31F, -16F, -10F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 38
		bodyModel[83].setRotationPoint(-16F, -15F, -10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 176, 1, 1, 0F,0F, 0F, 0F, -88F, 0F, 0F, -88F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -88F, -0.5F, 0F, -88F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[84].setRotationPoint(-47F, -10F, 10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 194, 1, 1, 0F,0F, 0F, 0F, -97F, 0F, 0F, -97F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -97F, -0.5F, 0F, -97F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 210
		bodyModel[85].setRotationPoint(-52F, -10F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 99, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 210
		bodyModel[86].setRotationPoint(-53F, -10F, -10.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 90, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 212
		bodyModel[87].setRotationPoint(-48F, -10F, 10.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[88].setRotationPoint(36F, -18F, 9F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 38
		bodyModel[89].setRotationPoint(-16F, -16F, -10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[90].setRotationPoint(-31F, -18F, -9.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[91].setRotationPoint(36F, -18F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 84, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -0.125F, 0F, -2F, -0.125F); // Box 221
		bodyModel[92].setRotationPoint(-48F, -18F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[93].setRotationPoint(36F, -18F, -9.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[94].setRotationPoint(-15F, -18F, -9.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[95].setRotationPoint(-15F, -18F, -10F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 0, 18, 0F); // Box 128 glow
		bodyModel[96].setRotationPoint(-56.5F, -14.99F, -9F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 232
		bodyModel[97].setRotationPoint(-49F, -15F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 234
		bodyModel[98].setRotationPoint(-53F, -15F, -1F);

		bodyModel[99].addBox(0F, 0F, 0F, 5, 1, 20, 0F); // Box 38
		bodyModel[99].setRotationPoint(-53F, -16F, -10F);

		bodyModel[100].addBox(0F, 0F, 0F, 5, 2, 19, 0F); // Box 38
		bodyModel[100].setRotationPoint(-53F, -18F, -9.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 232
		bodyModel[101].setRotationPoint(-49F, -15F, 5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[102].setRotationPoint(36F, -16F, -10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 247
		bodyModel[103].setRotationPoint(-31F, -17.5F, -10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[104].setRotationPoint(-48F, -15F, 5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[105].setRotationPoint(-44F, -15F, 5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 232
		bodyModel[106].setRotationPoint(-39.5F, -11F, 5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 15, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[107].setRotationPoint(-31F, -15F, 5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[108].setRotationPoint(-39.5F, -15F, 5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 232
		bodyModel[109].setRotationPoint(-40.5F, -11F, 5.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 32, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[110].setRotationPoint(-48F, -16F, 5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 32, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[111].setRotationPoint(-48F, -18F, 4.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 96, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.81F, 0F, 0F, -0.81F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[112].setRotationPoint(-53F, -2F, 9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 104, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.81F, 0F, 0F, -0.81F); // Box 266
		bodyModel[113].setRotationPoint(-53F, -2F, -10F);

		bodyModel[114].addBox(0F, 0F, 0F, 108, 2, 1, 0F); // Box 267
		bodyModel[114].setRotationPoint(-54F, 2F, 1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[115].setRotationPoint(-43F, 4F, -1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[116].setRotationPoint(-44F, 2F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[117].setRotationPoint(-43F, 2F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 271
		bodyModel[118].setRotationPoint(-43F, 2F, 2F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[119].setRotationPoint(41F, 4F, -1F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[120].setRotationPoint(40F, 2F, -1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[121].setRotationPoint(41F, 2F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 271
		bodyModel[122].setRotationPoint(41F, 2F, 2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 84, 1, 2, 0F,0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 221
		bodyModel[123].setRotationPoint(-48F, -18F, -9.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 19, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.03F, -1.25F, 0F, -2.03F, -1.25F, 0F, -2.03F, -1.25F, 0F, 0.03F, -1.25F, 0F); // Box 38
		bodyModel[124].setRotationPoint(-14.5F, -18F, -9.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[125].setRotationPoint(-15F, -18F, 9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 51, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 274
		bodyModel[126].setRotationPoint(-15F, -18F, 9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 51, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F); // Box 275
		bodyModel[127].setRotationPoint(-15F, -18F, 7.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[128].setRotationPoint(35F, -18F, -9.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 38
		bodyModel[129].setRotationPoint(35F, -18F, -10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 273
		bodyModel[130].setRotationPoint(35F, -18F, 9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 2, 19, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -2.03F, -1.25F, 0F, 0.03F, -1.25F, 0F, 0.03F, -1.25F, 0F, -2.03F, -1.25F, 0F); // Box 38
		bodyModel[131].setRotationPoint(33.5F, -18F, -9.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[132].setRotationPoint(-48F, -18F, -9.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[133].setRotationPoint(-48F, -18F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.03F, -1.25F, 0F, -2.03F, -1.25F, 0F, -2.03F, -1.25F, -0.5F, 0.03F, -1.25F, -0.5F); // Box 38
		bodyModel[134].setRotationPoint(-47.5F, -18F, -9.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 38
		bodyModel[135].setRotationPoint(-32F, -18F, -9.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 38
		bodyModel[136].setRotationPoint(-32F, -18F, -10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -2.03F, -1.25F, 0F, 0.03F, -1.25F, 0F, 0.03F, -1.25F, -0.5F, -2.03F, -1.25F, -0.5F); // Box 38
		bodyModel[137].setRotationPoint(-33.5F, -18F, -9.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 274
		bodyModel[138].setRotationPoint(-48F, -18F, 4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F); // Box 275
		bodyModel[139].setRotationPoint(-48F, -18F, 2.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 29, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262 glow
		bodyModel[140].setRotationPoint(-47F, -14.99F, 7.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 51, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -1F, -3F); // Box 38 cull
		bodyModel[141].setRotationPoint(-15F, -14F, -10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 62, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[142].setRotationPoint(-15F, -13F, -10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[143].setRotationPoint(-14F, -13F, -10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[144].setRotationPoint(-9F, -13F, -10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[145].setRotationPoint(-4F, -13F, -10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[146].setRotationPoint(1F, -13F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[147].setRotationPoint(6F, -13F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[148].setRotationPoint(11F, -13F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[149].setRotationPoint(16F, -13F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[150].setRotationPoint(21F, -13F, -10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[151].setRotationPoint(26F, -13F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[152].setRotationPoint(31F, -13F, -10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[153].setRotationPoint(36F, -13F, -10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[154].setRotationPoint(41F, -13F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -1F, -3F); // Box 296 cull
		bodyModel[155].setRotationPoint(-9F, -14F, 7F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[156].setRotationPoint(-9F, -13F, 9F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[157].setRotationPoint(-9F, -13F, 9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[158].setRotationPoint(-4F, -13F, 9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[159].setRotationPoint(1F, -13F, 9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[160].setRotationPoint(6F, -13F, 9F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[161].setRotationPoint(11F, -13F, 9F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[162].setRotationPoint(16F, -13F, 9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[163].setRotationPoint(21F, -13F, 9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[164].setRotationPoint(26F, -13F, 9F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[165].setRotationPoint(31F, -13F, 9F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[166].setRotationPoint(36F, -13F, 9F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[167].setRotationPoint(41F, -13F, 9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 50, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, -0.99F, 0F, -0.99F, -0.99F); // Box 38 cull
		bodyModel[168].setRotationPoint(-14.5F, -14F, -8F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 44, 2, 2, 0F,0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, -0.99F, 0F, -0.99F, -0.99F, 0F, -0.99F, 0F, 0F, -0.99F, 0F); // Box 313 cull
		bodyModel[169].setRotationPoint(-8.5F, -14F, 6F);

		bodyModel[170].addShapeBox(-3F, 0F, -1F, 5, 1, 1, 0F,0.2F, 0F, -0.5F, -2.8F, 0F, -0.5F, -2.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, -0.5F, -2.8F, -0.5F, -0.5F, -2.8F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Left side door front
		bodyModel[170].setRotationPoint(-54F, -10F, -10.5F);

		bodyModel[171].addShapeBox(-3F, 0F, 0F, 5, 1, 1, 0F,0.2F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, 0F, -2.8F, -0.5F, 0F, -2.8F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F); // Right side door front
		bodyModel[171].setRotationPoint(-54F, -10F, 10.5F);

		bodyModel[172].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[172].setRotationPoint(17F, -7F, 7F);
		bodyModel[172].rotateAngleY = -1.57079633F;

		bodyModel[173].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[173].setRotationPoint(17F, -7F, -7F);
		bodyModel[173].rotateAngleY = -4.71238898F;

		bodyModel[174].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[174].setRotationPoint(17F, -3F, 7F);
		bodyModel[174].rotateAngleY = -1.57079633F;

		bodyModel[175].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[175].setRotationPoint(17F, -3F, -7F);
		bodyModel[175].rotateAngleY = -4.71238898F;

		bodyModel[176].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[176].setRotationPoint(17F, -4F, 7F);
		bodyModel[176].rotateAngleY = -1.57079633F;

		bodyModel[177].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[177].setRotationPoint(17F, -3F, 7F);
		bodyModel[177].rotateAngleY = -1.57079633F;

		bodyModel[178].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[178].setRotationPoint(17F, -3F, -7F);
		bodyModel[178].rotateAngleY = -4.71238898F;

		bodyModel[179].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[179].setRotationPoint(17F, -3F, -7F);
		bodyModel[179].rotateAngleY = -4.71238898F;

		bodyModel[180].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[180].setRotationPoint(17F, -3F, 7F);
		bodyModel[180].rotateAngleY = -1.57079633F;

		bodyModel[181].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[181].setRotationPoint(17F, -4F, 7F);
		bodyModel[181].rotateAngleY = -1.57079633F;

		bodyModel[182].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[182].setRotationPoint(17F, -4F, -7F);
		bodyModel[182].rotateAngleY = -4.71238898F;

		bodyModel[183].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[183].setRotationPoint(17F, -4F, -7F);
		bodyModel[183].rotateAngleY = -4.71238898F;

		bodyModel[184].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[184].setRotationPoint(28F, -7F, 7F);
		bodyModel[184].rotateAngleY = -1.57079633F;

		bodyModel[185].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[185].setRotationPoint(28F, -7F, -7F);
		bodyModel[185].rotateAngleY = -4.71238898F;

		bodyModel[186].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[186].setRotationPoint(28F, -3F, 7F);
		bodyModel[186].rotateAngleY = -1.57079633F;

		bodyModel[187].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[187].setRotationPoint(28F, -3F, -7F);
		bodyModel[187].rotateAngleY = -4.71238898F;

		bodyModel[188].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[188].setRotationPoint(28F, -4F, 7F);
		bodyModel[188].rotateAngleY = -1.57079633F;

		bodyModel[189].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[189].setRotationPoint(28F, -3F, 7F);
		bodyModel[189].rotateAngleY = -1.57079633F;

		bodyModel[190].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[190].setRotationPoint(28F, -3F, -7F);
		bodyModel[190].rotateAngleY = -4.71238898F;

		bodyModel[191].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[191].setRotationPoint(28F, -3F, -7F);
		bodyModel[191].rotateAngleY = -4.71238898F;

		bodyModel[192].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[192].setRotationPoint(28F, -3F, 7F);
		bodyModel[192].rotateAngleY = -1.57079633F;

		bodyModel[193].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[193].setRotationPoint(28F, -4F, 7F);
		bodyModel[193].rotateAngleY = -1.57079633F;

		bodyModel[194].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[194].setRotationPoint(28F, -4F, -7F);
		bodyModel[194].rotateAngleY = -4.71238898F;

		bodyModel[195].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[195].setRotationPoint(28F, -4F, -7F);
		bodyModel[195].rotateAngleY = -4.71238898F;

		bodyModel[196].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[196].setRotationPoint(6F, -7F, 7F);
		bodyModel[196].rotateAngleY = -1.57079633F;

		bodyModel[197].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[197].setRotationPoint(6F, -7F, -7F);
		bodyModel[197].rotateAngleY = -4.71238898F;

		bodyModel[198].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[198].setRotationPoint(6F, -3F, 7F);
		bodyModel[198].rotateAngleY = -1.57079633F;

		bodyModel[199].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[199].setRotationPoint(6F, -3F, -7F);
		bodyModel[199].rotateAngleY = -4.71238898F;

		bodyModel[200].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[200].setRotationPoint(6F, -4F, 7F);
		bodyModel[200].rotateAngleY = -1.57079633F;

		bodyModel[201].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[201].setRotationPoint(6F, -3F, 7F);
		bodyModel[201].rotateAngleY = -1.57079633F;

		bodyModel[202].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[202].setRotationPoint(6F, -3F, -7F);
		bodyModel[202].rotateAngleY = -4.71238898F;

		bodyModel[203].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[203].setRotationPoint(6F, -3F, -7F);
		bodyModel[203].rotateAngleY = -4.71238898F;

		bodyModel[204].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[204].setRotationPoint(6F, -3F, 7F);
		bodyModel[204].rotateAngleY = -1.57079633F;

		bodyModel[205].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[205].setRotationPoint(6F, -4F, 7F);
		bodyModel[205].rotateAngleY = -1.57079633F;

		bodyModel[206].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[206].setRotationPoint(6F, -4F, -7F);
		bodyModel[206].rotateAngleY = -4.71238898F;

		bodyModel[207].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[207].setRotationPoint(6F, -4F, -7F);
		bodyModel[207].rotateAngleY = -4.71238898F;

		bodyModel[208].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[208].setRotationPoint(-5F, -7F, 7F);
		bodyModel[208].rotateAngleY = -1.57079633F;

		bodyModel[209].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[209].setRotationPoint(-5F, -7F, -7F);
		bodyModel[209].rotateAngleY = -4.71238898F;

		bodyModel[210].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[210].setRotationPoint(-5F, -3F, 7F);
		bodyModel[210].rotateAngleY = -1.57079633F;

		bodyModel[211].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[211].setRotationPoint(-5F, -3F, -7F);
		bodyModel[211].rotateAngleY = -4.71238898F;

		bodyModel[212].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[212].setRotationPoint(-5F, -4F, 7F);
		bodyModel[212].rotateAngleY = -1.57079633F;

		bodyModel[213].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[213].setRotationPoint(-5F, -3F, 7F);
		bodyModel[213].rotateAngleY = -1.57079633F;

		bodyModel[214].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[214].setRotationPoint(-5F, -3F, -7F);
		bodyModel[214].rotateAngleY = -4.71238898F;

		bodyModel[215].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[215].setRotationPoint(-5F, -3F, -7F);
		bodyModel[215].rotateAngleY = -4.71238898F;

		bodyModel[216].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[216].setRotationPoint(-5F, -3F, 7F);
		bodyModel[216].rotateAngleY = -1.57079633F;

		bodyModel[217].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[217].setRotationPoint(-5F, -4F, 7F);
		bodyModel[217].rotateAngleY = -1.57079633F;

		bodyModel[218].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[218].setRotationPoint(-5F, -4F, -7F);
		bodyModel[218].rotateAngleY = -4.71238898F;

		bodyModel[219].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[219].setRotationPoint(-5F, -4F, -7F);
		bodyModel[219].rotateAngleY = -4.71238898F;

		bodyModel[220].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[220].setRotationPoint(39F, -7F, 7F);
		bodyModel[220].rotateAngleY = -1.57079633F;

		bodyModel[221].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[221].setRotationPoint(39F, -7F, -7F);
		bodyModel[221].rotateAngleY = -4.71238898F;

		bodyModel[222].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[222].setRotationPoint(39F, -3F, 7F);
		bodyModel[222].rotateAngleY = -1.57079633F;

		bodyModel[223].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[223].setRotationPoint(39F, -3F, -7F);
		bodyModel[223].rotateAngleY = -4.71238898F;

		bodyModel[224].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[224].setRotationPoint(39F, -4F, 7F);
		bodyModel[224].rotateAngleY = -1.57079633F;

		bodyModel[225].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[225].setRotationPoint(39F, -3F, 7F);
		bodyModel[225].rotateAngleY = -1.57079633F;

		bodyModel[226].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[226].setRotationPoint(39F, -3F, -7F);
		bodyModel[226].rotateAngleY = -4.71238898F;

		bodyModel[227].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[227].setRotationPoint(39F, -3F, -7F);
		bodyModel[227].rotateAngleY = -4.71238898F;

		bodyModel[228].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[228].setRotationPoint(39F, -3F, 7F);
		bodyModel[228].rotateAngleY = -1.57079633F;

		bodyModel[229].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[229].setRotationPoint(39F, -4F, 7F);
		bodyModel[229].rotateAngleY = -1.57079633F;

		bodyModel[230].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[230].setRotationPoint(39F, -4F, -7F);
		bodyModel[230].rotateAngleY = -4.71238898F;

		bodyModel[231].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[231].setRotationPoint(39F, -4F, -7F);
		bodyModel[231].rotateAngleY = -4.71238898F;

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[232].setRotationPoint(-15F, -7F, 0F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.01F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -1.99F, -0.01F, 0F, 0F, -0.01F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -1.99F, -0.01F, -0.01F, 0F); // Box 38 cull
		bodyModel[233].setRotationPoint(-15F, -2F, 3F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 17, 5, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[234].setRotationPoint(-53F, -16F, 5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 95, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[235].setRotationPoint(-48F, -11F, -9.9F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 99, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[236].setRotationPoint(-52F, -11F, 9.9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[237].setRotationPoint(-51.5F, -2F, -9.75F);
		bodyModel[237].rotateAngleY = 0.78539816F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[238].setRotationPoint(-51.85F, -1F, -9.4F);
		bodyModel[238].rotateAngleY = 0.78539816F;

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[239].setRotationPoint(-51.5F, 0.5F, -9.75F);
		bodyModel[239].rotateAngleY = 0.78539816F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 6, 15, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[240].setRotationPoint(-47F, -15F, 5.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[241].setRotationPoint(-48F, -6F, -9F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 381
		bodyModel[242].setRotationPoint(-48F, -2.4F, -9F);
		bodyModel[242].rotateAngleZ = 1.04719755F;

		bodyModel[243].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[243].setRotationPoint(-46.75F, -5F, -7.5F);
		bodyModel[243].rotateAngleY = -0.78539816F;

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[244].setRotationPoint(-39F, -14F, 4F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[245].setRotationPoint(-39F, -13F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 309 glow
		bodyModel[246].setRotationPoint(-32F, -14F, -3.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[247].setRotationPoint(-48F, -14F, -8.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -1F, -3F); // Box 38 cull
		bodyModel[248].setRotationPoint(-42F, -14F, -10F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[249].setRotationPoint(-42F, -13F, -10F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 5, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.585F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.585F, 0F); // Boc 42
		bodyModel[250].setRotationPoint(-32F, -7F, -9F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[251].setRotationPoint(-33.5F, -1F, -8F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 2, 13, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[252].setRotationPoint(-34.5F, -3F, -9F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[253].setRotationPoint(-34F, -3F, 4F);

		bodyModel[254].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[254].setRotationPoint(-34F, -3F, -9F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[255].setRotationPoint(-34F, -4F, 4F);

		bodyModel[256].addShapeBox(0F, 0F, -1F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[256].setRotationPoint(-34F, -4F, -9F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[257].setRotationPoint(-33.5F, -1F, 1F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[258].setRotationPoint(-33.5F, -1F, -3.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.56F, 0F, 0F, -0.56F, 0F); // Boc 42
		bodyModel[259].setRotationPoint(-43F, -7F, -10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Boc 42
		bodyModel[260].setRotationPoint(-38.5F, -1F, -9F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[261].setRotationPoint(-43F, -3F, -9.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[262].setRotationPoint(-36F, -3F, -9.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[263].setRotationPoint(-43.5F, -3F, -9.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[264].setRotationPoint(-36F, -4F, -9.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[265].setRotationPoint(-43.5F, -4F, -9.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[266].setRotationPoint(-42.5F, -1F, -9F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.56F, 0F, 0F, -0.56F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 498
		bodyModel[267].setRotationPoint(-43F, -7F, 4F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 499
		bodyModel[268].setRotationPoint(-38.5F, -1F, 2F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[269].setRotationPoint(-43F, -3F, 0.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[270].setRotationPoint(-36F, -3F, 1.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[271].setRotationPoint(-43.5F, -3F, 1.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[272].setRotationPoint(-36F, -4F, 1.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[273].setRotationPoint(-43.5F, -4F, 1.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[274].setRotationPoint(-42.5F, -1F, 2F);

		bodyModel[275].addBox(0F, 0F, 0F, 13, 4, 5, 0F); // Box 2
		bodyModel[275].setRotationPoint(-6F, 2F, 5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[276].setRotationPoint(-22F, 2F, 5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[277].setRotationPoint(-22F, 5F, 5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[278].setRotationPoint(-8F, 2F, 9F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[279].setRotationPoint(23F, 2F, -10F);

		bodyModel[280].addBox(0F, 0F, 0F, 13, 1, 5, 0F); // Box 2
		bodyModel[280].setRotationPoint(-6F, 6F, 5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 11, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		bodyModel[281].setRotationPoint(-20F, 2F, -10F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 668
		bodyModel[282].setRotationPoint(-25F, 2F, -10F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		bodyModel[283].setRotationPoint(-2F, 2F, -10F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		bodyModel[284].setRotationPoint(-9F, 2F, -10F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 667
		bodyModel[285].setRotationPoint(3F, 2F, -9F);
		bodyModel[285].rotateAngleX = -0.78539816F;

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 667 cull
		bodyModel[286].setRotationPoint(4F, 2F, -9.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[287].setRotationPoint(-9F, 2F, 9.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, -0.58F, 0F, -0.58F, -0.58F); // Box 41
		bodyModel[288].setRotationPoint(-5F, 3F, 0F);
		bodyModel[288].rotateAngleX = -0.78539816F;

		bodyModel[289].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, -0.58F, 0F, -0.58F, -0.58F); // Box 41
		bodyModel[289].setRotationPoint(0F, 3F, 0F);
		bodyModel[289].rotateAngleX = -0.78539816F;

		bodyModel[290].addShapeBox(0F, 0F, 0F, 12, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[290].setRotationPoint(-36.5F, 4.5F, -0.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.25F, -0.5F, 0F, 1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 538 cull
		bodyModel[291].setRotationPoint(-25.5F, 2F, 0.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0.25F, -0.45F, 0F, 0.25F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 538
		bodyModel[292].setRotationPoint(-26F, 4F, 1.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 538
		bodyModel[293].setRotationPoint(-25.5F, 2F, 4.75F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 12, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[294].setRotationPoint(25.5F, 4.5F, -0.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.5F, 0F, 1.25F, -0.5F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 668 cull
		bodyModel[295].setRotationPoint(25.5F, 2F, -3.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0.25F, -0.45F, 0F, 0.25F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 669
		bodyModel[296].setRotationPoint(24.75F, 4F, -1.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 670
		bodyModel[297].setRotationPoint(24F, 2F, -4.75F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 95, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[298].setRotationPoint(-47F, -2.5F, -11.01F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 89, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 452
		bodyModel[299].setRotationPoint(-47F, -2.5F, 11.01F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 95, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.035F, 0F, -0.5F, -0.035F, 0F, -0.5F, 0.035F, 0F, -0.5F, 0.035F); // Box 38
		bodyModel[300].setRotationPoint(-47F, -2F, -11.01F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 89, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.035F, 0F, -0.5F, 0.035F, 0F, -0.5F, -0.035F, 0F, -0.5F, -0.035F); // Box 452
		bodyModel[301].setRotationPoint(-47F, -2F, 11.01F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 51, 0, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[302].setRotationPoint(-15F, -13F, -9F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 45, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 526
		bodyModel[303].setRotationPoint(-9F, -13F, 8F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[304].setRotationPoint(-42F, -13F, -9F);

		bodyModel[305].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[305].setRotationPoint(28F, -7F, 7F);
		bodyModel[305].rotateAngleY = -1.57079633F;

		bodyModel[306].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[306].setRotationPoint(28F, -7F, 7F);
		bodyModel[306].rotateAngleY = -1.57079633F;

		bodyModel[307].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[307].setRotationPoint(17F, -7F, 7F);
		bodyModel[307].rotateAngleY = -1.57079633F;

		bodyModel[308].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[308].setRotationPoint(17F, -7F, 7F);
		bodyModel[308].rotateAngleY = -1.57079633F;

		bodyModel[309].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[309].setRotationPoint(6F, -7F, 7F);
		bodyModel[309].rotateAngleY = -1.57079633F;

		bodyModel[310].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[310].setRotationPoint(6F, -7F, 7F);
		bodyModel[310].rotateAngleY = -1.57079633F;

		bodyModel[311].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[311].setRotationPoint(-5F, -7F, 7F);
		bodyModel[311].rotateAngleY = -1.57079633F;

		bodyModel[312].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[312].setRotationPoint(-5F, -7F, 7F);
		bodyModel[312].rotateAngleY = -1.57079633F;

		bodyModel[313].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[313].setRotationPoint(39F, -7F, 7F);
		bodyModel[313].rotateAngleY = -1.57079633F;

		bodyModel[314].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Right seat part
		bodyModel[314].setRotationPoint(39F, -7F, 7F);
		bodyModel[314].rotateAngleY = -1.57079633F;

		bodyModel[315].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[315].setRotationPoint(39F, -7F, -7F);
		bodyModel[315].rotateAngleY = -4.71238898F;

		bodyModel[316].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[316].setRotationPoint(39F, -7F, -7F);
		bodyModel[316].rotateAngleY = -4.71238898F;

		bodyModel[317].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[317].setRotationPoint(-5F, -7F, -7F);
		bodyModel[317].rotateAngleY = -4.71238898F;

		bodyModel[318].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[318].setRotationPoint(-5F, -7F, -7F);
		bodyModel[318].rotateAngleY = -4.71238898F;

		bodyModel[319].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[319].setRotationPoint(6F, -7F, -7F);
		bodyModel[319].rotateAngleY = -4.71238898F;

		bodyModel[320].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[320].setRotationPoint(6F, -7F, -7F);
		bodyModel[320].rotateAngleY = -4.71238898F;

		bodyModel[321].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[321].setRotationPoint(17F, -7F, -7F);
		bodyModel[321].rotateAngleY = -4.71238898F;

		bodyModel[322].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[322].setRotationPoint(17F, -7F, -7F);
		bodyModel[322].rotateAngleY = -4.71238898F;

		bodyModel[323].addShapeBox(-3F, 0F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[323].setRotationPoint(28F, -7F, -7F);
		bodyModel[323].rotateAngleY = -4.71238898F;

		bodyModel[324].addShapeBox(-3F, 0F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Left seat part
		bodyModel[324].setRotationPoint(28F, -7F, -7F);
		bodyModel[324].rotateAngleY = -4.71238898F;

		bodyModel[325].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part base
		bodyModel[325].setRotationPoint(17F, -1F, 7F);
		bodyModel[325].rotateAngleY = -0.78539816F;

		bodyModel[326].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part base
		bodyModel[326].setRotationPoint(28F, -1F, 7F);
		bodyModel[326].rotateAngleY = -0.78539816F;

		bodyModel[327].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part base
		bodyModel[327].setRotationPoint(28F, -1F, -7F);
		bodyModel[327].rotateAngleY = -3.92699082F;

		bodyModel[328].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part base
		bodyModel[328].setRotationPoint(-5F, -1F, -7F);
		bodyModel[328].rotateAngleY = -3.92699082F;

		bodyModel[329].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part base
		bodyModel[329].setRotationPoint(39F, -1F, 7F);
		bodyModel[329].rotateAngleY = -0.78539816F;

		bodyModel[330].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part base
		bodyModel[330].setRotationPoint(-5F, -1F, 7F);
		bodyModel[330].rotateAngleY = -0.78539816F;

		bodyModel[331].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part base
		bodyModel[331].setRotationPoint(6F, -1F, 7F);
		bodyModel[331].rotateAngleY = -0.78539816F;

		bodyModel[332].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part base
		bodyModel[332].setRotationPoint(39F, -1F, -7F);
		bodyModel[332].rotateAngleY = -3.92699082F;

		bodyModel[333].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part base
		bodyModel[333].setRotationPoint(6F, -1F, -7F);
		bodyModel[333].rotateAngleY = -3.92699082F;

		bodyModel[334].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part base
		bodyModel[334].setRotationPoint(17F, -1F, -7F);
		bodyModel[334].rotateAngleY = -3.92699082F;

		bodyModel[335].addBox(0F, 0F, 0F, 2, 7, 7, 0F); // Box 38
		bodyModel[335].setRotationPoint(-15F, -6F, -10F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F); // Box 43
		bodyModel[336].setRotationPoint(46F, -2F, 10F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.81F, 0F, 0F, -0.81F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[337].setRotationPoint(46F, -2F, 9F);

		bodyModel[338].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 128
		bodyModel[338].setRotationPoint(42F, -15F, 10F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 43
		bodyModel[339].setRotationPoint(43F, 1F, 10F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487
		bodyModel[340].setRotationPoint(52F, 1F, -11F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[341].setRotationPoint(36F, -15F, -10F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[342].setRotationPoint(36F, -15F, 7F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[343].setRotationPoint(-16F, -18F, -9.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 247
		bodyModel[344].setRotationPoint(-16F, -17.5F, -10F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[345].setRotationPoint(-30F, -15F, -1F);

		bodyModel[346].addBox(0F, 0F, 0F, 1, 17, 9, 0F); // Box 38
		bodyModel[346].setRotationPoint(-27F, -16F, -10F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[347].setRotationPoint(-30F, -16F, -1F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[348].setRotationPoint(-26F, -6F, -9F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 381
		bodyModel[349].setRotationPoint(-26F, -2.4F, -9F);
		bodyModel[349].rotateAngleZ = 1.04719755F;

		bodyModel[350].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[350].setRotationPoint(-24.75F, -5F, -7.5F);
		bodyModel[350].rotateAngleY = -0.78539816F;

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[351].setRotationPoint(-26F, -14F, -8.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 309 glow
		bodyModel[352].setRotationPoint(-17F, -14F, -3.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 5, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.585F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.585F, 0F); // Boc 42
		bodyModel[353].setRotationPoint(-17F, -7F, -9F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[354].setRotationPoint(-18.5F, -1F, -8F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 3, 2, 13, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[355].setRotationPoint(-19.5F, -3F, -9F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[356].setRotationPoint(-19F, -3F, 4F);

		bodyModel[357].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[357].setRotationPoint(-19F, -3F, -9F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[358].setRotationPoint(-19F, -4F, 4F);

		bodyModel[359].addShapeBox(0F, 0F, -1F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[359].setRotationPoint(-19F, -4F, -9F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[360].setRotationPoint(-18.5F, -1F, 1F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Boc 42
		bodyModel[361].setRotationPoint(-18.5F, -1F, -3.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.56F, 0F, -0.5F, -0.56F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 498
		bodyModel[362].setRotationPoint(-24F, -7F, 4F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 499
		bodyModel[363].setRotationPoint(-23.5F, -1F, 2F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[364].setRotationPoint(-24F, -3F, 0.5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[365].setRotationPoint(-20.5F, -3F, 1.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[366].setRotationPoint(-24.5F, -3F, 1.5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[367].setRotationPoint(-20.5F, -4F, 1.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[368].setRotationPoint(-24.5F, -4F, 1.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[369].setRotationPoint(-26F, -18F, -9.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[370].setRotationPoint(-26F, -18F, -10F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.03F, -1.25F, 0F, -2.03F, -1.25F, 0F, -2.03F, -1.25F, -0.5F, 0.03F, -1.25F, -0.5F); // Box 38
		bodyModel[371].setRotationPoint(-25.5F, -18F, -9.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 38
		bodyModel[372].setRotationPoint(-17F, -18F, -9.5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 38
		bodyModel[373].setRotationPoint(-17F, -18F, -10F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -2.03F, -1.25F, 0F, 0.03F, -1.25F, 0F, 0.03F, -1.25F, -0.5F, -2.03F, -1.25F, -0.5F); // Box 38
		bodyModel[374].setRotationPoint(-18.5F, -18F, -9.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 274
		bodyModel[375].setRotationPoint(-26F, -18F, 4F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F); // Box 275
		bodyModel[376].setRotationPoint(-26F, -18F, 2.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.625F, -0.575F, -0.5F, -0.625F, -0.575F, -0.5F, -0.25F, -0.65F, 0F, -0.25F, -0.65F, 0F, 0.525F, -0.5F, -0.5F, 0.525F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[377].setRotationPoint(-29F, -20.09F, -8F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 59
		bodyModel[378].setRotationPoint(-14.5F, -19.5F, 6.62F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 93, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 58
		bodyModel[379].setRotationPoint(-55F, -20F, -0.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 38
		bodyModel[380].setRotationPoint(-30.5F, -2F, -9.75F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[381].setRotationPoint(-29F, -1F, -10F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[382].setRotationPoint(-29.5F, 0.5F, -9.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[383].setRotationPoint(-27F, -15F, -1F);

		bodyModel[384].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 2
		bodyModel[384].setRotationPoint(11F, 2F, 6F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[385].setRotationPoint(45.5F, -9F, -11F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F); // Box 43 side door
		bodyModel[386].setRotationPoint(45.5F, -9F, 10F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 128
		bodyModel[387].setRotationPoint(45F, -10F, 10F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.19F, 0F, 0F, -0.19F); // Box 43 side door
		bodyModel[388].setRotationPoint(43F, -2F, 10F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 43 side door
		bodyModel[389].setRotationPoint(43F, -6F, 10F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 43 side door
		bodyModel[390].setRotationPoint(45F, -10F, 10F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F); // Box 43 side door
		bodyModel[391].setRotationPoint(43F, -10F, 10F);

		bodyModel[392].addShapeBox(0.5F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 43 side door
		bodyModel[392].setRotationPoint(43F, -10F, 10F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 202
		bodyModel[393].setRotationPoint(42.5F, -6F, 11F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 203
		bodyModel[394].setRotationPoint(46.5F, -6F, 11F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320 cull
		bodyModel[395].setRotationPoint(43.5F, 3.5F, 9.75F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 321 cull
		bodyModel[396].setRotationPoint(43.5F, 2F, 9.75F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 156 cull
		bodyModel[397].setRotationPoint(46.5F, 3.5F, -10.75F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 156 cull
		bodyModel[398].setRotationPoint(46.5F, 2F, -10.75F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.19F, -0.5F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[399].setRotationPoint(58F, 1F, -11F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 2
		bodyModel[400].setRotationPoint(58.5F, 2F, -11F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 436
		bodyModel[401].setRotationPoint(58F, 1F, 4F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 437
		bodyModel[402].setRotationPoint(58.5F, 2F, 4F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320 cull
		bodyModel[403].setRotationPoint(55F, 3.5F, 9.75F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 321 cull
		bodyModel[404].setRotationPoint(55F, 2F, 9.75F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 156 cull
		bodyModel[405].setRotationPoint(55F, 3.5F, -10.75F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 156 cull
		bodyModel[406].setRotationPoint(55F, 2F, -10.75F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,1.45F, 0F, 0F, -1.44F, 0F, 0F, -3.45F, 0F, -0.5F, 1.45F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.69F, 0F, 0F, -0.69F); // Box 43
		bodyModel[407].setRotationPoint(53.75F, -2F, 9.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, -0.515F, 0F, 0F, 0.12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.85F, 0F, 0F, 3.505F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[408].setRotationPoint(51F, -6F, -9F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F,7.25F, 0F, 0F, -7.25F, 0F, 0F, -6.75F, 0F, 0F, 6.75F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[409].setRotationPoint(56F, -13F, -6F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,7.5F, 0F, -0.5F, -7.5F, 0F, -0.5F, -6.75F, 0F, 0F, 6.75F, 0F, 0F, 0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[410].setRotationPoint(55.5F, -13F, -10F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,1.45F, 0F, -0.5F, -3.45F, 0F, -0.5F, -1.44F, 0F, 0F, 1.45F, 0F, 0F, 0F, 0F, -0.69F, -2F, 0F, -0.69F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[411].setRotationPoint(53.75F, -2F, -11.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, -0.25F, 0F, -0.19F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[412].setRotationPoint(52F, -2F, -11F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.19F, 0F, 0F, -0.19F); // Box 452
		bodyModel[413].setRotationPoint(52F, -2F, 9F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0.035F, 0F, 0F, -4.035F, 0F, 0F, -4.035F, 0F, 0F, 0.035F, 0F, 0F, 0.035F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.035F, 0F, 0F); // Box 38
		bodyModel[414].setRotationPoint(48F, -11F, -11F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 6, 9, 1, 0F,0F, 0F, 0F, -0.035F, 0F, 0F, -0.035F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.035F, 0F, 0F, -0.035F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[415].setRotationPoint(42F, -11F, -11F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.035F, 0F, 0F, -0.035F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[416].setRotationPoint(47F, -13F, -11F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0.035F, 0F, 0F, -4.035F, 0F, 0F, -4.035F, 0F, 0F, 0.035F, 0F, 0F, 0.035F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.035F, 0F, 0F); // Box 469
		bodyModel[417].setRotationPoint(48F, -11F, 10F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, -0.035F, 0F, 0F, -0.035F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.035F, 0F, 0F, -0.035F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[418].setRotationPoint(46F, -11F, 10F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[419].setRotationPoint(42F, -18F, -11F);

		bodyModel[420].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 38
		bodyModel[420].setRotationPoint(42F, -15F, -11F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[421].setRotationPoint(42F, -16F, -11F);

		bodyModel[422].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 38
		bodyModel[422].setRotationPoint(45F, -13F, -11F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[423].setRotationPoint(45F, -15F, -11F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -2F, 0F, -0.5F, -2F, -1.5F, -0.5F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[424].setRotationPoint(45F, -17F, -11F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F,6.75F, 0F, 0F, -6.75F, 0F, 0F, -7.25F, 0F, 0F, 7.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 486
		bodyModel[425].setRotationPoint(56F, -13F, 0F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,6.75F, 0F, 0F, -6.75F, 0F, 0F, -7.5F, 0F, -0.5F, 7.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F); // Box 487
		bodyModel[426].setRotationPoint(55.5F, -13F, 6F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.035F, 0F, 0F, -0.035F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[427].setRotationPoint(47F, -13F, 10F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[428].setRotationPoint(42F, -16F, 10F);

		bodyModel[429].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 492
		bodyModel[429].setRotationPoint(45F, -13F, 10F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[430].setRotationPoint(45F, -15F, 9F);

		bodyModel[431].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 128
		bodyModel[431].setRotationPoint(43F, -11F, 10F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[432].setRotationPoint(42F, -11F, 10F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1.25F, 0F, 0F, -0.75F, 0F, 0F, -3.25F, 0F, -0.5F, 1.25F, 0F, -2F, -0.75F, 0F, 0F, -1.25F, 0F, -1.5F, -1.25F, 0F, -0.5F, -0.75F, 0F, -2F); // Box 496
		bodyModel[433].setRotationPoint(46.25F, -15F, 9.5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[434].setRotationPoint(42F, -18F, 9F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, -2F, -1.5F, 0F, -2F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 498
		bodyModel[435].setRotationPoint(45F, -17F, 9F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,2.05F, 0F, 0F, -2.05F, 0F, 0F, -1.45F, 0F, 0F, 1.45F, 0F, 0F, 0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.35F, 0F, 0F, 0.35F, 0F, 0F); // Box 499
		bodyModel[436].setRotationPoint(49.6F, -15F, -6F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,2.6F, 0F, -0.5F, -2.6F, 0F, -0.5F, -1.55F, 0F, 0F, 1.55F, 0F, 0F, 1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -0.35F, 0F, 0F, 0.35F, 0F, 0F); // Box 474
		bodyModel[437].setRotationPoint(49.1F, -15F, -10F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,1.45F, 0F, 0F, -1.45F, 0F, 0F, -2.05F, 0F, 0F, 2.05F, 0F, 0F, 0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.85F, 0F, 0F, 0.85F, 0F, 0F); // Box 495
		bodyModel[438].setRotationPoint(49.6F, -15F, 0F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1.55F, 0F, 0F, -1.55F, 0F, 0F, -2.6F, 0F, -0.5F, 2.6F, 0F, -0.5F, 0.35F, 0F, 0F, -0.35F, 0F, 0F, -1.1F, 0F, -0.5F, 1.1F, 0F, -0.5F); // Box 496
		bodyModel[439].setRotationPoint(49.1F, -15F, 6F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[440].setRotationPoint(42F, -16F, -10F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1.15F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[441].setRotationPoint(42F, -19F, -9.5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, -0.5F, 0F, 0F, -1.65F, 0F, 0F, -1.15F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[442].setRotationPoint(42F, -19.5F, -6F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, -0.5F, 0F, -1.15F, -0.5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[443].setRotationPoint(42F, -19F, 5.5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, -1.15F, 0F, 0F, -1.65F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 501
		bodyModel[444].setRotationPoint(42F, -19.5F, 0F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -1F, 0F, -0.5F, -3F, 0F, 0.55F, -3F, -0.5F, 0F, -0.15F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.55F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[445].setRotationPoint(45F, -18F, -9.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, -0.15F, 0F, -0.45F, -3F, 0F, 0.15F, -3F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[446].setRotationPoint(45F, -18F, -6F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -0.15F, -0.5F, 0.55F, -3F, -0.5F, -0.5F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0.55F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[447].setRotationPoint(45F, -18F, 5.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0.35F, 0F, 0.15F, -3F, 0F, -0.45F, -3F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[448].setRotationPoint(45F, -18F, 0F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2F, -1.25F, 0F, -2F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, -0.5F, -0.75F, 0F, -2F); // Box 496
		bodyModel[449].setRotationPoint(46.25F, -15F, 9.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,1.25F, 0F, -2F, -3.25F, 0F, -0.5F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, -2F, -1.25F, 0F, -0.5F, -1.25F, 0F, -1.5F, -0.75F, 0F, 0F); // Box 506
		bodyModel[450].setRotationPoint(46.25F, -15F, -11.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1.25F, 0F, -2F, -0.75F, 0F, -2F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, -2F, -1.25F, 0F, -0.5F, 0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 507
		bodyModel[451].setRotationPoint(46.25F, -15F, -11.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0.35F, 0F, 0F, -1.45F, 0F, 0F, -2.05F, 0F, 0F, 0.85F, 0F, 0F, 0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.85F, 0F, 0F, 0.85F, 0F, 0F); // Box 495
		bodyModel[452].setRotationPoint(47.6F, -15F, 0F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0.85F, 0F, 0F, -2.05F, 0F, 0F, -1.45F, 0F, 0F, 0.35F, 0F, 0F, 0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.35F, 0F, 0F, 0.35F, 0F, 0F); // Box 510
		bodyModel[453].setRotationPoint(47.6F, -15F, -6F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.35F, 0F, 0F, -1.55F, 0F, 0F, -1.85F, 0F, 0F, 0.56F, 0F, 0F, 0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.56F, 0F, 0F, 0.56F, 0F, 0F); // Box 496
		bodyModel[454].setRotationPoint(47.1F, -15F, 6F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.56F, 0F, 0F, -1.85F, 0F, 0F, -1.55F, 0F, 0F, 0.35F, 0F, 0F, 0.56F, 0F, 0F, -0.56F, 0F, 0F, -0.35F, 0F, 0F, 0.35F, 0F, 0F); // Box 510
		bodyModel[455].setRotationPoint(47.1F, -15F, -7F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[456].setRotationPoint(47F, -13F, -10F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[457].setRotationPoint(47F, -13F, 9F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 1.1F, 0F, 0F, 1.11F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 38
		bodyModel[458].setRotationPoint(45F, -15F, -9.5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 1.11F, 0F, -0.5F, 1.1F, 0F, 0F, -2F, 0F, 0F); // Box 515
		bodyModel[459].setRotationPoint(45F, -15F, 8.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -1.35F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.105F, 0F, 0F, 0.535F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[460].setRotationPoint(46F, -15F, -9F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -1.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.535F, 0F, 0F, 0.105F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[461].setRotationPoint(46F, -15F, 7F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.75F, -0.01F, 0F, -1F, -0.01F, 0F, -1F, -0.01F, 0F, 0.75F, -0.01F, 0F, 0.25F, 0F, 0F, -0.44F, 0F, 0F, -0.44F, 0F, 0F, 0.25F, 0F, 0F); // Box 38 glow
		bodyModel[462].setRotationPoint(49.17F, -13F, -1F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.65F, 0F, -0.5F, -2.65F, 0F, -0.5F, -0.65F, 0F, 0F, 0.65F, 0F, 0F, -0.3F, 0F, -0.5F, -1.7F, 0F, -0.5F, 0.31F, 0F, 0F, -0.3F, 0F, 0F); // Box 448
		bodyModel[463].setRotationPoint(52F, -4F, -11.5F);

		bodyModel[464].addShapeBox(0F, 0F, 2F, 2, 9, 2, 0F,3.95F, 0F, -1.45F, -5.95F, 0F, -0.5F, -3.95F, 0F, 0F, 2.9F, 0F, 0F, -0.4F, 0F, -1.45F, -1.6F, 0F, -0.5F, 0.4F, 0F, 0F, -1.45F, 0F, 0F); // Box 448
		bodyModel[464].setRotationPoint(50.95F, -13F, -13.5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,3.95F, 0F, -0.5F, -4.95F, 0F, -0.45F, -3.9F, 0F, 0F, 2.95F, 0F, 0F, -0.39F, 0F, -0.5F, -0.61F, 0F, -0.45F, 0.45F, 0F, 0F, -1.4F, 0F, 0F); // Box 448
		bodyModel[465].setRotationPoint(50.95F, -13F, -10.5F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.65F, 0F, 0F, -0.65F, 0F, 0F, -2.65F, 0F, -0.5F, 0.65F, 0F, -0.5F, -0.3F, 0F, 0F, 0.31F, 0F, 0F, -1.7F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 522
		bodyModel[466].setRotationPoint(52F, -4F, 9.5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,2.9F, 0F, 0F, -3.95F, 0F, 0F, -5.95F, 0F, -0.5F, 3.95F, 0F, -1.45F, -1.45F, 0F, 0F, 0.4F, 0F, 0F, -1.6F, 0F, -0.5F, -0.4F, 0F, -1.45F); // Box 523
		bodyModel[467].setRotationPoint(50.95F, -13F, 9.5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[468].setRotationPoint(51F, -2F, -10F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.31F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[469].setRotationPoint(51F, -4F, -10F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.65F, 0F, 0F, -0.66F, 0F, 0F, -0.55F, 0F, -0.5F, 0.65F, 0F, -0.5F, -1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.85F, 0F, -0.5F, -1.75F, 0F, -0.5F); // Box 232
		bodyModel[470].setRotationPoint(52F, -4F, -9.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.63F, 0F, -0.5F, -0.52F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0.34F, 0F, -0.5F, 0.45F, 0F, 0F, -0.1F, 0F, 0F); // Box 232
		bodyModel[471].setRotationPoint(51F, -6F, -10F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,2.95F, 0F, 0F, -3.9F, 0F, 0F, -4.95F, 0F, -0.45F, 3.95F, 0F, -0.5F, -1.4F, 0F, 0F, 0.45F, 0F, 0F, -0.61F, 0F, -0.45F, -0.39F, 0F, -0.5F); // Box 528
		bodyModel[472].setRotationPoint(50.95F, -13F, 9.5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[473].setRotationPoint(51F, -6F, -10F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[474].setRotationPoint(51F, -2F, 9F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.31F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 531
		bodyModel[475].setRotationPoint(51F, -4F, 9F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.65F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.66F, 0F, 0F, 0.65F, 0F, 0F, -1.75F, 0F, -0.5F, 1.85F, 0F, -0.5F, 1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 532
		bodyModel[476].setRotationPoint(52F, -4F, 8.5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.52F, 0F, 0F, -0.63F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0.45F, 0F, 0F, 0.34F, 0F, -0.5F, -0.35F, 0F, 0F); // Box 533
		bodyModel[477].setRotationPoint(51F, -6F, 9F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F); // Box 534
		bodyModel[478].setRotationPoint(51F, -6F, 9F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, -0.88F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.505F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[479].setRotationPoint(51F, -6F, -6F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0.12F, 0F, 0F, -0.515F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.505F, 0F, 0F, 2.85F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[480].setRotationPoint(51F, -6F, 6F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, -0.375F, 0F, 0F, -0.88F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2.505F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[481].setRotationPoint(51F, -6F, 0F);

		bodyModel[482].addShapeBox(0F, 0F, -1F, 6, 3, 1, 0F,0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.81F, -3F, 0F, -0.81F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 43 side door
		bodyModel[482].setRotationPoint(43F, -2F, 10F);

		bodyModel[483].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[483].setRotationPoint(48F, -7F, 7F);
		bodyModel[483].rotateAngleY = -3.14159265F;

		bodyModel[484].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[484].setRotationPoint(48F, -7F, -7F);
		bodyModel[484].rotateAngleY = -3.14159265F;

		bodyModel[485].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Boc 42
		bodyModel[485].setRotationPoint(46.5F, -1F, 6F);

		bodyModel[486].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Boc 42
		bodyModel[486].setRotationPoint(46.5F, -1F, -8F);

		bodyModel[487].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[487].setRotationPoint(48F, -3F, 7F);
		bodyModel[487].rotateAngleY = -3.14159265F;

		bodyModel[488].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[488].setRotationPoint(48F, -3F, -7F);
		bodyModel[488].rotateAngleY = -3.14159265F;

		bodyModel[489].addShapeBox(1F, 0F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[489].setRotationPoint(48F, -5F, 7F);
		bodyModel[489].rotateAngleY = -3.14159265F;

		bodyModel[490].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[490].setRotationPoint(48F, -4F, 7F);
		bodyModel[490].rotateAngleY = -3.14159265F;

		bodyModel[491].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[491].setRotationPoint(48F, -5F, 7F);
		bodyModel[491].rotateAngleY = -3.14159265F;

		bodyModel[492].addShapeBox(1F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[492].setRotationPoint(48F, -5F, 7F);
		bodyModel[492].rotateAngleY = -3.14159265F;

		bodyModel[493].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[493].setRotationPoint(48F, -3F, 7F);
		bodyModel[493].rotateAngleY = -3.14159265F;

		bodyModel[494].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[494].setRotationPoint(48F, -5F, 7F);
		bodyModel[494].rotateAngleY = -3.14159265F;

		bodyModel[495].addShapeBox(1F, 0F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[495].setRotationPoint(48F, -5F, -7F);
		bodyModel[495].rotateAngleY = -3.14159265F;

		bodyModel[496].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[496].setRotationPoint(48F, -3F, -7F);
		bodyModel[496].rotateAngleY = -3.14159265F;

		bodyModel[497].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[497].setRotationPoint(48F, -5F, -7F);
		bodyModel[497].rotateAngleY = -3.14159265F;

		bodyModel[498].addShapeBox(1F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[498].setRotationPoint(48F, -5F, -7F);
		bodyModel[498].rotateAngleY = -3.14159265F;

		bodyModel[499].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[499].setRotationPoint(48F, -3F, -7F);
		bodyModel[499].rotateAngleY = -3.14159265F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 101, 284, textureX, textureY); // Left seat part
		bodyModel[501] = new ModelRendererTurbo(this, 101, 326, textureX, textureY); // Right seat part
		bodyModel[502] = new ModelRendererTurbo(this, 101, 333, textureX, textureY); // Right seat part
		bodyModel[503] = new ModelRendererTurbo(this, 101, 277, textureX, textureY); // Left seat part
		bodyModel[504] = new ModelRendererTurbo(this, 101, 287, textureX, textureY); // Left seat part
		bodyModel[505] = new ModelRendererTurbo(this, 86, 295, textureX, textureY); // Left seat part
		bodyModel[506] = new ModelRendererTurbo(this, 86, 312, textureX, textureY); // Boc 42
		bodyModel[507] = new ModelRendererTurbo(this, 80, 305, textureX, textureY); // Left seat part
		bodyModel[508] = new ModelRendererTurbo(this, 110, 297, textureX, textureY); // Left seat part
		bodyModel[509] = new ModelRendererTurbo(this, 101, 303, textureX, textureY); // Left seat part
		bodyModel[510] = new ModelRendererTurbo(this, 101, 297, textureX, textureY); // Left seat part
		bodyModel[511] = new ModelRendererTurbo(this, 110, 307, textureX, textureY); // Left seat part
		bodyModel[512] = new ModelRendererTurbo(this, 101, 313, textureX, textureY); // Left seat part
		bodyModel[513] = new ModelRendererTurbo(this, 101, 307, textureX, textureY); // Left seat part
		bodyModel[514] = new ModelRendererTurbo(this, 101, 300, textureX, textureY); // Left seat part
		bodyModel[515] = new ModelRendererTurbo(this, 101, 310, textureX, textureY); // Left seat part
		bodyModel[516] = new ModelRendererTurbo(this, 16, 54, textureX, textureY); // Box 446
		bodyModel[517] = new ModelRendererTurbo(this, 19, 54, textureX, textureY); // Box 569
		bodyModel[518] = new ModelRendererTurbo(this, 15, 54, textureX, textureY); // Box 447
		bodyModel[519] = new ModelRendererTurbo(this, 24, 54, textureX, textureY); // Box 571
		bodyModel[520] = new ModelRendererTurbo(this, 15, 54, textureX, textureY); // Box 447
		bodyModel[521] = new ModelRendererTurbo(this, 30, 54, textureX, textureY); // Box 574
		bodyModel[522] = new ModelRendererTurbo(this, 37, 144, textureX, textureY); // Box 2
		bodyModel[523] = new ModelRendererTurbo(this, 37, 161, textureX, textureY); // Box 579
		bodyModel[524] = new ModelRendererTurbo(this, 31, 16, textureX, textureY); // Box 460
		bodyModel[525] = new ModelRendererTurbo(this, 1, 3, textureX, textureY); // Box 38
		bodyModel[526] = new ModelRendererTurbo(this, 8, 1, textureX, textureY); // Box 506
		bodyModel[527] = new ModelRendererTurbo(this, 3, -3, textureX, textureY); // Box 474
		bodyModel[528] = new ModelRendererTurbo(this, 12, -5, textureX, textureY); // Box 499
		bodyModel[529] = new ModelRendererTurbo(this, 52, 1, textureX, textureY); // Box 585
		bodyModel[530] = new ModelRendererTurbo(this, 47, -1, textureX, textureY); // Box 586
		bodyModel[531] = new ModelRendererTurbo(this, 38, -3, textureX, textureY); // Box 587
		bodyModel[532] = new ModelRendererTurbo(this, 25, -5, textureX, textureY); // Box 588
		bodyModel[533] = new ModelRendererTurbo(this, 72, 214, textureX, textureY); // Box 2
		bodyModel[534] = new ModelRendererTurbo(this, 281, 214, textureX, textureY); // Box 2
		bodyModel[535] = new ModelRendererTurbo(this, 286, 214, textureX, textureY); // Box 2
		bodyModel[536] = new ModelRendererTurbo(this, 114, 181, textureX, textureY,"cull"); // Box 156 cull
		bodyModel[537] = new ModelRendererTurbo(this, 65, 214, textureX, textureY); // Box 2
		bodyModel[538] = new ModelRendererTurbo(this, 72, 218, textureX, textureY); // Box 594
		bodyModel[539] = new ModelRendererTurbo(this, 65, 218, textureX, textureY); // Box 595
		bodyModel[540] = new ModelRendererTurbo(this, 114, 193, textureX, textureY,"cull"); // Box 320 cull
		bodyModel[541] = new ModelRendererTurbo(this, 54, 75, textureX, textureY,"lamp"); // marker light glow
		bodyModel[542] = new ModelRendererTurbo(this, 61, 75, textureX, textureY); // Box 38
		bodyModel[543] = new ModelRendererTurbo(this, 61, 72, textureX, textureY,"lamp"); // marker light glow
		bodyModel[544] = new ModelRendererTurbo(this, 52, 88, textureX, textureY,"lamp"); // Box 601 glow
		bodyModel[545] = new ModelRendererTurbo(this, 59, 88, textureX, textureY); // Box 38
		bodyModel[546] = new ModelRendererTurbo(this, 59, 85, textureX, textureY,"lamp"); // marker light glow
		bodyModel[547] = new ModelRendererTurbo(this, 60, 63, textureX, textureY,"lamp"); // marker light glow
		bodyModel[548] = new ModelRendererTurbo(this, 60, 59, textureX, textureY,"lamp"); // marker light glow
		bodyModel[549] = new ModelRendererTurbo(this, 61, 66, textureX, textureY); // Box 38
		bodyModel[550] = new ModelRendererTurbo(this, 61, 70, textureX, textureY); // Box 38
		bodyModel[551] = new ModelRendererTurbo(this, 45, 79, textureX, textureY,"lamp"); // marker light glow
		bodyModel[552] = new ModelRendererTurbo(this, 52, 78, textureX, textureY,"lamp"); // marker light glow
		bodyModel[553] = new ModelRendererTurbo(this, 53, 82, textureX, textureY); // Box 589
		bodyModel[554] = new ModelRendererTurbo(this, 53, 86, textureX, textureY); // Box 590
		bodyModel[555] = new ModelRendererTurbo(this, 69, 72, textureX, textureY); // Box 38
		bodyModel[556] = new ModelRendererTurbo(this, 46, 307, textureX, textureY); // Box 232
		bodyModel[557] = new ModelRendererTurbo(this, 32, 251, textureX, textureY); // Box 232
		bodyModel[558] = new ModelRendererTurbo(this, 31, 249, textureX, textureY); // Box 232
		bodyModel[559] = new ModelRendererTurbo(this, 32, 260, textureX, textureY); // Box 232
		bodyModel[560] = new ModelRendererTurbo(this, 31, 257, textureX, textureY); // Box 595
		bodyModel[561] = new ModelRendererTurbo(this, 32, 252, textureX, textureY); // Box 596
		bodyModel[562] = new ModelRendererTurbo(this, 378, 124, textureX, textureY); // Front gate closed
		bodyModel[563] = new ModelRendererTurbo(this, 375, 129, textureX, textureY); // Front gate open
		bodyModel[564] = new ModelRendererTurbo(this, 433, 325, textureX, textureY); // Box 232
		bodyModel[565] = new ModelRendererTurbo(this, 13, 2, textureX, textureY); // Box 506
		bodyModel[566] = new ModelRendererTurbo(this, 51, 2, textureX, textureY); // Box 566
		bodyModel[567] = new ModelRendererTurbo(this, 414, 109, textureX, textureY); // Box 128
		bodyModel[568] = new ModelRendererTurbo(this, 410, 97, textureX, textureY); // Box 128
		bodyModel[569] = new ModelRendererTurbo(this, 412, 104, textureX, textureY); // Box 128
		bodyModel[570] = new ModelRendererTurbo(this, 416, 112, textureX, textureY); // Box 38
		bodyModel[571] = new ModelRendererTurbo(this, 409, 109, textureX, textureY); // Box 520
		bodyModel[572] = new ModelRendererTurbo(this, 405, 97, textureX, textureY); // Box 521
		bodyModel[573] = new ModelRendererTurbo(this, 407, 104, textureX, textureY); // Box 522
		bodyModel[574] = new ModelRendererTurbo(this, 411, 112, textureX, textureY); // Box 523
		bodyModel[575] = new ModelRendererTurbo(this, 416, 127, textureX, textureY); // Box 28
		bodyModel[576] = new ModelRendererTurbo(this, 411, 127, textureX, textureY); // Box 524
		bodyModel[577] = new ModelRendererTurbo(this, 462, 124, textureX, textureY); // Box 28
		bodyModel[578] = new ModelRendererTurbo(this, 462, 108, textureX, textureY); // Box 38
		bodyModel[579] = new ModelRendererTurbo(this, 449, 118, textureX, textureY); // Box 28
		bodyModel[580] = new ModelRendererTurbo(this, 444, 97, textureX, textureY); // Box 128
		bodyModel[581] = new ModelRendererTurbo(this, 444, 105, textureX, textureY); // Box 128
		bodyModel[582] = new ModelRendererTurbo(this, 462, 105, textureX, textureY); // Box 38
		bodyModel[583] = new ModelRendererTurbo(this, 451, 99, textureX, textureY); // Box 38
		bodyModel[584] = new ModelRendererTurbo(this, 446, 102, textureX, textureY); // Box 128
		bodyModel[585] = new ModelRendererTurbo(this, 462, 102, textureX, textureY); // Box 38
		bodyModel[586] = new ModelRendererTurbo(this, 451, 105, textureX, textureY); // Box 128
		bodyModel[587] = new ModelRendererTurbo(this, 435, 97, textureX, textureY); // Box 537
		bodyModel[588] = new ModelRendererTurbo(this, 437, 105, textureX, textureY); // Box 538
		bodyModel[589] = new ModelRendererTurbo(this, 421, 124, textureX, textureY); // Box 539
		bodyModel[590] = new ModelRendererTurbo(this, 421, 108, textureX, textureY); // Box 540
		bodyModel[591] = new ModelRendererTurbo(this, 426, 118, textureX, textureY); // Box 541
		bodyModel[592] = new ModelRendererTurbo(this, 421, 105, textureX, textureY); // Box 542
		bodyModel[593] = new ModelRendererTurbo(this, 426, 99, textureX, textureY); // Box 543
		bodyModel[594] = new ModelRendererTurbo(this, 437, 102, textureX, textureY); // Box 544
		bodyModel[595] = new ModelRendererTurbo(this, 421, 102, textureX, textureY); // Box 545
		bodyModel[596] = new ModelRendererTurbo(this, 426, 105, textureX, textureY); // Box 546

		bodyModel[500].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[500].setRotationPoint(48F, -5F, -7F);
		bodyModel[500].rotateAngleY = -3.14159265F;

		bodyModel[501].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[501].setRotationPoint(48F, -3F, 7F);
		bodyModel[501].rotateAngleY = -3.14159265F;

		bodyModel[502].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[502].setRotationPoint(48F, -4F, 7F);
		bodyModel[502].rotateAngleY = -3.14159265F;

		bodyModel[503].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[503].setRotationPoint(48F, -4F, -7F);
		bodyModel[503].rotateAngleY = -3.14159265F;

		bodyModel[504].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[504].setRotationPoint(48F, -4F, -7F);
		bodyModel[504].rotateAngleY = -3.14159265F;

		bodyModel[505].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[505].setRotationPoint(48F, -7F, 0F);
		bodyModel[505].rotateAngleY = -3.14159265F;

		bodyModel[506].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Boc 42
		bodyModel[506].setRotationPoint(46.5F, -1F, -1F);

		bodyModel[507].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[507].setRotationPoint(48F, -3F, 0F);
		bodyModel[507].rotateAngleY = -3.14159265F;

		bodyModel[508].addShapeBox(1F, 0F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[508].setRotationPoint(48F, -5F, 0F);
		bodyModel[508].rotateAngleY = -3.14159265F;

		bodyModel[509].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[509].setRotationPoint(48F, -3F, 0F);
		bodyModel[509].rotateAngleY = -3.14159265F;

		bodyModel[510].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[510].setRotationPoint(48F, -5F, 0F);
		bodyModel[510].rotateAngleY = -3.14159265F;

		bodyModel[511].addShapeBox(1F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[511].setRotationPoint(48F, -5F, 0F);
		bodyModel[511].rotateAngleY = -3.14159265F;

		bodyModel[512].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[512].setRotationPoint(48F, -3F, 0F);
		bodyModel[512].rotateAngleY = -3.14159265F;

		bodyModel[513].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[513].setRotationPoint(48F, -5F, 0F);
		bodyModel[513].rotateAngleY = -3.14159265F;

		bodyModel[514].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[514].setRotationPoint(48F, -4F, 0F);
		bodyModel[514].rotateAngleY = -3.14159265F;

		bodyModel[515].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[515].setRotationPoint(48F, -4F, 0F);
		bodyModel[515].rotateAngleY = -3.14159265F;

		bodyModel[516].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[516].setRotationPoint(54.1F, -5F, -6F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 569
		bodyModel[517].setRotationPoint(54.1F, -5F, 0F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[518].setRotationPoint(53.6F, -5F, -10F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F); // Box 571
		bodyModel[519].setRotationPoint(53.6F, -5F, 6F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 447
		bodyModel[520].setRotationPoint(52.6F, -5F, -10.25F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, 0F, 0.75F, 0F, 0F); // Box 574
		bodyModel[521].setRotationPoint(52.6F, -5F, 9.25F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[522].setRotationPoint(58.56F, 2.05F, -10F);
		bodyModel[522].rotateAngleX = -0.07417649F;
		bodyModel[522].rotateAngleY = -0.07417649F;

		bodyModel[523].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		bodyModel[523].setRotationPoint(58.78F, 2.28F, 7F);
		bodyModel[523].rotateAngleX = 0.07417649F;
		bodyModel[523].rotateAngleY = 0.07417649F;

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.37F, 0F, 0F, 0.37F, 0F, 0F, 0.37F, 0F, 0F, 0.37F, 0F); // Box 460
		bodyModel[524].setRotationPoint(49.65F, -14F, -0.5F);
		bodyModel[524].rotateAngleZ = 0.48869219F;

		bodyModel[525].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0.01F, 0F, 0F, -0.74F, 0F, 0F, 0.74F, 0F, 0F, -0.01F, 0F, -1F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.01F, 0F, -1F, -0.01F); // Box 38
		bodyModel[525].setRotationPoint(42F, -16F, -11F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1.25F, 0F, -1.24F, -1.25F, 0F, -1.24F, 0.01F, 0F, 0F, -0.01F, 0F, 0F, 1.25F, 0F, -0.49F, -1.25F, 0F, -0.49F, 1.26F, 0F, 0F, -1.26F, 0F, 0F); // Box 506
		bodyModel[526].setRotationPoint(46.25F, -16F, -11.5F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,2.84F, 0F, -0.5F, -2.84F, 0F, -0.5F, -1.79F, 0F, 0F, 1.79F, 0F, 0F, 1.59F, 0F, -0.5F, -1.59F, 0F, -0.5F, -0.54F, 0F, 0F, 0.54F, 0F, 0F); // Box 474
		bodyModel[527].setRotationPoint(49.1F, -16F, -10F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,2.29F, 0F, 0F, -2.29F, 0F, 0F, -1.68F, 0F, 0F, 1.68F, 0F, 0F, 1.04F, 0F, 0F, -1.04F, 0F, 0F, -0.44F, 0F, 0F, 0.44F, 0F, 0F); // Box 499
		bodyModel[528].setRotationPoint(49.6F, -16F, -6F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, -0.01F, 0F, 0F, 0.74F, 0F, 0F, -0.74F, 0F, 0F, 0.01F, 0F, -1F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.01F, 0F, -1F, 0.01F); // Box 585
		bodyModel[529].setRotationPoint(42F, -16F, 11F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-0.01F, 0F, 0F, 0.01F, 0F, 0F, -1.25F, 0F, -1.24F, 1.25F, 0F, -1.24F, -1.26F, 0F, 0F, 1.26F, 0F, 0F, -1.25F, 0F, -0.49F, 1.25F, 0F, -0.49F); // Box 586
		bodyModel[530].setRotationPoint(46.25F, -16F, 9.5F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1.79F, 0F, 0F, -1.79F, 0F, 0F, -2.84F, 0F, -0.5F, 2.84F, 0F, -0.5F, 0.54F, 0F, 0F, -0.54F, 0F, 0F, -1.59F, 0F, -0.5F, 1.59F, 0F, -0.5F); // Box 587
		bodyModel[531].setRotationPoint(49.1F, -16F, 6F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,1.68F, 0F, 0F, -1.68F, 0F, 0F, -2.29F, 0F, 0F, 2.29F, 0F, 0F, 0.44F, 0F, 0F, -0.44F, 0F, 0F, -1.04F, 0F, 0F, 1.04F, 0F, 0F); // Box 588
		bodyModel[532].setRotationPoint(49.6F, -16F, 0F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 103, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[533].setRotationPoint(-50F, 2F, -10.75F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[534].setRotationPoint(-51F, 2F, -10.75F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[535].setRotationPoint(-54F, 2F, -10.75F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 156 cull
		bodyModel[536].setRotationPoint(46.5F, 4F, -10.75F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[537].setRotationPoint(53F, 2F, -10.75F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 107, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[538].setRotationPoint(-54F, 2F, 9.75F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[539].setRotationPoint(53F, 2F, 9.75F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 320 cull
		bodyModel[540].setRotationPoint(43.5F, 4F, 9.75F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.25F, 0F, -0.125F, -0.25F); // marker light glow
		bodyModel[541].setRotationPoint(46.25F, -11F, -12F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38
		bodyModel[542].setRotationPoint(46.5F, -11F, -12.25F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F); // marker light glow
		bodyModel[543].setRotationPoint(46.5F, -11F, -12.5F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 601 glow
		bodyModel[544].setRotationPoint(46.25F, -11F, 11F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[545].setRotationPoint(46.5F, -11F, 11.25F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // marker light glow
		bodyModel[546].setRotationPoint(46.5F, -11F, 11.5F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // marker light glow
		bodyModel[547].setRotationPoint(46.25F, -11F, -12.25F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F); // marker light glow
		bodyModel[548].setRotationPoint(46.5F, -11F, -12.5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[549].setRotationPoint(46.5F, -11F, -12.25F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 38
		bodyModel[550].setRotationPoint(46.5F, -9.5F, -11.25F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // marker light glow
		bodyModel[551].setRotationPoint(46.25F, -11F, 11.25F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // marker light glow
		bodyModel[552].setRotationPoint(46.5F, -11F, 10.5F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 589
		bodyModel[553].setRotationPoint(46.5F, -11F, 11.25F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		bodyModel[554].setRotationPoint(46.5F, -9.5F, 10.25F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[555].setRotationPoint(48F, -8F, -11.01F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[556].setRotationPoint(51F, -6.01F, -6F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 10, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 232
		bodyModel[557].setRotationPoint(36F, -15F, -7F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 232
		bodyModel[558].setRotationPoint(46F, -15F, -6F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.45F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.45F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 232
		bodyModel[559].setRotationPoint(46F, -15F, -7F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 595
		bodyModel[560].setRotationPoint(46F, -15F, 0F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.45F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 596
		bodyModel[561].setRotationPoint(46F, -15F, 6F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate closed
		bodyModel[562].setRotationPoint(-59.5F, -8F, -3F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate open
		bodyModel[563].setRotationPoint(-59.5F, -8F, 2F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[564].setRotationPoint(-36.5F, -15F, 5F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,1.25F, 0F, -0.24F, -1.25F, 0F, -0.24F, -0.4F, 0F, -0.24F, 0.4F, 0F, -0.24F, 1.25F, 0F, 0.51F, -1.25F, 0F, 0.51F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 506
		bodyModel[565].setRotationPoint(46.25F, -16F, -10.5F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.4F, 0F, -0.24F, -0.4F, 0F, -0.24F, -1.25F, 0F, -0.24F, 1.25F, 0F, -0.24F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1.25F, 0F, 0.51F, 1.25F, 0F, 0.51F); // Box 566
		bodyModel[566].setRotationPoint(46.25F, -16F, 9.5F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[567].setRotationPoint(-60.5F, -18F, -11F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[568].setRotationPoint(-60.5F, -19.5F, -6F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[569].setRotationPoint(-60.5F, -19F, -9.5F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 2, 14, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[570].setRotationPoint(-60.5F, -16F, -11F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 520
		bodyModel[571].setRotationPoint(-60.5F, -18F, 9F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 521
		bodyModel[572].setRotationPoint(-60.5F, -19.5F, 0F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 522
		bodyModel[573].setRotationPoint(-60.5F, -19F, 5.5F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 2, 14, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[574].setRotationPoint(-60.5F, -16F, 11F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 28
		bodyModel[575].setRotationPoint(-60.5F, -2F, -11F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 524
		bodyModel[576].setRotationPoint(-60.5F, -2F, 11F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[577].setRotationPoint(-61F, -2F, -11F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[578].setRotationPoint(-61F, -16F, -11F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[579].setRotationPoint(-61F, 0F, -10F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[580].setRotationPoint(-61F, -19.5F, -3F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0.085F, 0F, -0.5F, 0.085F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[581].setRotationPoint(-61F, -19F, -5F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.335F, 0F, 0F, 0.335F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[582].setRotationPoint(-61F, -17F, -11F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -1.2F, -0.5F, 0F, -1.2F, -0.5F); // Box 38
		bodyModel[583].setRotationPoint(-61F, -17.5F, -9.5F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.415F, 0F, 0F, -0.415F, 0F, 0F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 128
		bodyModel[584].setRotationPoint(-61F, -19.5F, -6F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.165F, 0F, -0.5F, -0.165F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.15F, -0.5F, 0F, -0.15F, -0.5F); // Box 38
		bodyModel[585].setRotationPoint(-61F, -17.5F, -10F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.01F, 0F, 0F, -0.51F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.01F, -0.25F, 0F, -0.51F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[586].setRotationPoint(-61F, -17.5F, -9F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 537
		bodyModel[587].setRotationPoint(-61F, -19.5F, 0F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.085F, 0F, 0F, 0.085F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[588].setRotationPoint(-61F, -19F, 3F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 539
		bodyModel[589].setRotationPoint(-61F, -2F, 10F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[590].setRotationPoint(-61F, -16F, 10F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 541
		bodyModel[591].setRotationPoint(-61F, 0F, 5F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.335F, 0F, -0.5F, 0.335F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[592].setRotationPoint(-61F, -17F, 10F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 1.5F, -0.5F, -0.5F, 1.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.2F, -0.5F, -0.5F, -1.2F, -0.5F, -0.5F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 543
		bodyModel[593].setRotationPoint(-61F, -17.5F, 5.5F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.415F, 0F, -0.5F, -0.415F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 544
		bodyModel[594].setRotationPoint(-61F, -19.5F, 5F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.165F, 0F, 0F, -0.165F, 0F, 0F, -0.15F, -0.5F, -0.5F, -0.15F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[595].setRotationPoint(-61F, -17.5F, 9F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.51F, 0F, 0F, 0.01F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.51F, -0.25F, 0F, 0.01F, -0.25F, 0F); // Box 546
		bodyModel[596].setRotationPoint(-61F, -17.5F, 5F);
	}
	ModelMILW_1934_1935_1936_Truck bogie1 = new ModelMILW_1934_1935_1936_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 597; i++)
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
			GL11.glTranslated(-2.625, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_1935_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.625, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if(GetColor(entity)==123456){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_1935_truck_UP_grey_generator.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(0, 0, 1, 0);
			GL11.glTranslated(-2.625, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_1935_truck_UP_grey.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.625, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if(GetColor(entity)==4
		|| GetColor(entity)==5) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_1935_truck_black_generator.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(0, 0, 1, 0);
			GL11.glTranslated(-2.625, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_1935_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.625, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_1935_truck_brown_generator.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(0, 0, 1, 0);
			GL11.glTranslated(-2.625, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_1935_truck_brown.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.625, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}