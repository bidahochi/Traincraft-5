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

public class ModelMILW1935Dorm_56SeatCoach extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMILW1935Dorm_56SeatCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[617];

		initbodyModel_1();
		initbodyModel_2();

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
		bodyModel[48] = new ModelRendererTurbo(this, 299, 2, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 72, 18, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 72, 12, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 298, 7, textureX, textureY); // Box 57
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
		bodyModel[122] = new ModelRendererTurbo(this, 357, 4, textureX, textureY); // Box 128
		bodyModel[123] = new ModelRendererTurbo(this, 459, 33, textureX, textureY); // Box 128
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
		bodyModel[139] = new ModelRendererTurbo(this, 258, 7, textureX, textureY); // Box 59
		bodyModel[140] = new ModelRendererTurbo(this, 286, 7, textureX, textureY); // Box 169
		bodyModel[141] = new ModelRendererTurbo(this, 255, 10, textureX, textureY); // Box 59
		bodyModel[142] = new ModelRendererTurbo(this, 287, 3, textureX, textureY); // Box 171
		bodyModel[143] = new ModelRendererTurbo(this, 49, 296, textureX, textureY); // Box 38
		bodyModel[144] = new ModelRendererTurbo(this, 72, 84, textureX, textureY); // Box 128
		bodyModel[145] = new ModelRendererTurbo(this, 72, 64, textureX, textureY); // Box 210
		bodyModel[146] = new ModelRendererTurbo(this, 255, 60, textureX, textureY); // Box 210
		bodyModel[147] = new ModelRendererTurbo(this, 255, 62, textureX, textureY); // Box 212
		bodyModel[148] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 57
		bodyModel[149] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 128
		bodyModel[150] = new ModelRendererTurbo(this, 72, 3, textureX, textureY); // Box 221
		bodyModel[151] = new ModelRendererTurbo(this, 374, 28, textureX, textureY); // Box 38
		bodyModel[152] = new ModelRendererTurbo(this, 398, 7, textureX, textureY); // Box 38
		bodyModel[153] = new ModelRendererTurbo(this, 434, 19, textureX, textureY); // Box 38
		bodyModel[154] = new ModelRendererTurbo(this, 471, 234, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[155] = new ModelRendererTurbo(this, 1, 235, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[156] = new ModelRendererTurbo(this, 17, 283, textureX, textureY); // Box 38
		bodyModel[157] = new ModelRendererTurbo(this, 491, 353, textureX, textureY); // Box 234
		bodyModel[158] = new ModelRendererTurbo(this, 451, 11, textureX, textureY); // Box 38
		bodyModel[159] = new ModelRendererTurbo(this, 317, 1, textureX, textureY); // Box 38
		bodyModel[160] = new ModelRendererTurbo(this, 447, 352, textureX, textureY); // Box 232
		bodyModel[161] = new ModelRendererTurbo(this, 1, 50, textureX, textureY); // Box 38
		bodyModel[162] = new ModelRendererTurbo(this, 15, 28, textureX, textureY); // Box 38
		bodyModel[163] = new ModelRendererTurbo(this, 40, 300, textureX, textureY); // Box 232
		bodyModel[164] = new ModelRendererTurbo(this, 74, 115, textureX, textureY); // Box 43
		bodyModel[165] = new ModelRendererTurbo(this, 74, 104, textureX, textureY); // Box 266
		bodyModel[166] = new ModelRendererTurbo(this, 72, 152, textureX, textureY); // Box 267
		bodyModel[167] = new ModelRendererTurbo(this, 257, 156, textureX, textureY); // Box 2
		bodyModel[168] = new ModelRendererTurbo(this, 255, 160, textureX, textureY); // Box 2
		bodyModel[169] = new ModelRendererTurbo(this, 241, 156, textureX, textureY); // Box 2
		bodyModel[170] = new ModelRendererTurbo(this, 227, 158, textureX, textureY); // Box 271
		bodyModel[171] = new ModelRendererTurbo(this, 99, 156, textureX, textureY); // Box 2
		bodyModel[172] = new ModelRendererTurbo(this, 97, 160, textureX, textureY); // Box 2
		bodyModel[173] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 2
		bodyModel[174] = new ModelRendererTurbo(this, 115, 158, textureX, textureY); // Box 271
		bodyModel[175] = new ModelRendererTurbo(this, 72, 8, textureX, textureY); // Box 221
		bodyModel[176] = new ModelRendererTurbo(this, 420, 4, textureX, textureY); // Box 38
		bodyModel[177] = new ModelRendererTurbo(this, 444, 19, textureX, textureY); // Box 273
		bodyModel[178] = new ModelRendererTurbo(this, 72, 58, textureX, textureY); // Box 274
		bodyModel[179] = new ModelRendererTurbo(this, 72, 54, textureX, textureY); // Box 275
		bodyModel[180] = new ModelRendererTurbo(this, 396, 43, textureX, textureY); // Box 276
		bodyModel[181] = new ModelRendererTurbo(this, 25, 120, textureX, textureY); // Box 38
		bodyModel[182] = new ModelRendererTurbo(this, 47, 135, textureX, textureY); // Box 38
		bodyModel[183] = new ModelRendererTurbo(this, 39, 132, textureX, textureY); // Box 273
		bodyModel[184] = new ModelRendererTurbo(this, 1, 117, textureX, textureY); // Box 38
		bodyModel[185] = new ModelRendererTurbo(this, 439, 375, textureX, textureY,"lamp"); // Box 262 glow
		bodyModel[186] = new ModelRendererTurbo(this, 28, 281, textureX, textureY,"lamp"); // Box 232 glow
		bodyModel[187] = new ModelRendererTurbo(this, 302, 243, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[188] = new ModelRendererTurbo(this, 311, 252, textureX, textureY); // Box 38
		bodyModel[189] = new ModelRendererTurbo(this, 448, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[190] = new ModelRendererTurbo(this, 441, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[191] = new ModelRendererTurbo(this, 434, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[192] = new ModelRendererTurbo(this, 427, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[193] = new ModelRendererTurbo(this, 420, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[194] = new ModelRendererTurbo(this, 381, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[195] = new ModelRendererTurbo(this, 374, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[196] = new ModelRendererTurbo(this, 367, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[197] = new ModelRendererTurbo(this, 360, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[198] = new ModelRendererTurbo(this, 353, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[199] = new ModelRendererTurbo(this, 346, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[200] = new ModelRendererTurbo(this, 339, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[201] = new ModelRendererTurbo(this, 302, 263, textureX, textureY,"cull"); // Box 296 cull
		bodyModel[202] = new ModelRendererTurbo(this, 311, 272, textureX, textureY); // Box 297
		bodyModel[203] = new ModelRendererTurbo(this, 448, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[204] = new ModelRendererTurbo(this, 441, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[205] = new ModelRendererTurbo(this, 434, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[206] = new ModelRendererTurbo(this, 427, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[207] = new ModelRendererTurbo(this, 420, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[208] = new ModelRendererTurbo(this, 381, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[209] = new ModelRendererTurbo(this, 374, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[210] = new ModelRendererTurbo(this, 367, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[211] = new ModelRendererTurbo(this, 360, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[212] = new ModelRendererTurbo(this, 353, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[213] = new ModelRendererTurbo(this, 346, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[214] = new ModelRendererTurbo(this, 339, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[215] = new ModelRendererTurbo(this, 307, 238, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[216] = new ModelRendererTurbo(this, 307, 258, textureX, textureY,"cull"); // Box 313 cull
		bodyModel[217] = new ModelRendererTurbo(this, 306, 68, textureX, textureY); // Left side door front
		bodyModel[218] = new ModelRendererTurbo(this, 306, 87, textureX, textureY); // Right side door front
		bodyModel[219] = new ModelRendererTurbo(this, 59, 60, textureX, textureY); // Left side door rear
		bodyModel[220] = new ModelRendererTurbo(this, 59, 84, textureX, textureY); // Right side door rear
		bodyModel[221] = new ModelRendererTurbo(this, 235, 301, textureX, textureY); // Right seat part
		bodyModel[222] = new ModelRendererTurbo(this, 198, 278, textureX, textureY); // Left seat part
		bodyModel[223] = new ModelRendererTurbo(this, 235, 318, textureX, textureY); // Boc 42
		bodyModel[224] = new ModelRendererTurbo(this, 198, 295, textureX, textureY); // Boc 42
		bodyModel[225] = new ModelRendererTurbo(this, 229, 311, textureX, textureY); // Right seat part
		bodyModel[226] = new ModelRendererTurbo(this, 192, 288, textureX, textureY); // Left seat part
		bodyModel[227] = new ModelRendererTurbo(this, 259, 303, textureX, textureY); // Right seat part
		bodyModel[228] = new ModelRendererTurbo(this, 250, 306, textureX, textureY); // Right seat part
		bodyModel[229] = new ModelRendererTurbo(this, 250, 303, textureX, textureY); // Right seat part
		bodyModel[230] = new ModelRendererTurbo(this, 259, 313, textureX, textureY); // Right seat part
		bodyModel[231] = new ModelRendererTurbo(this, 250, 319, textureX, textureY); // Right seat part
		bodyModel[232] = new ModelRendererTurbo(this, 250, 313, textureX, textureY); // Right seat part
		bodyModel[233] = new ModelRendererTurbo(this, 222, 280, textureX, textureY); // Left seat part
		bodyModel[234] = new ModelRendererTurbo(this, 213, 286, textureX, textureY); // Left seat part
		bodyModel[235] = new ModelRendererTurbo(this, 213, 280, textureX, textureY); // Left seat part
		bodyModel[236] = new ModelRendererTurbo(this, 222, 290, textureX, textureY); // Left seat part
		bodyModel[237] = new ModelRendererTurbo(this, 213, 296, textureX, textureY); // Left seat part
		bodyModel[238] = new ModelRendererTurbo(this, 213, 290, textureX, textureY); // Left seat part
		bodyModel[239] = new ModelRendererTurbo(this, 250, 309, textureX, textureY); // Right seat part
		bodyModel[240] = new ModelRendererTurbo(this, 250, 316, textureX, textureY); // Right seat part
		bodyModel[241] = new ModelRendererTurbo(this, 213, 283, textureX, textureY); // Left seat part
		bodyModel[242] = new ModelRendererTurbo(this, 213, 293, textureX, textureY); // Left seat part
		bodyModel[243] = new ModelRendererTurbo(this, 161, 301, textureX, textureY); // Right seat part
		bodyModel[244] = new ModelRendererTurbo(this, 161, 318, textureX, textureY); // Boc 42
		bodyModel[245] = new ModelRendererTurbo(this, 155, 311, textureX, textureY); // Right seat part
		bodyModel[246] = new ModelRendererTurbo(this, 185, 303, textureX, textureY); // Right seat part
		bodyModel[247] = new ModelRendererTurbo(this, 176, 306, textureX, textureY); // Right seat part
		bodyModel[248] = new ModelRendererTurbo(this, 176, 303, textureX, textureY); // Right seat part
		bodyModel[249] = new ModelRendererTurbo(this, 185, 313, textureX, textureY); // Right seat part
		bodyModel[250] = new ModelRendererTurbo(this, 176, 319, textureX, textureY); // Right seat part
		bodyModel[251] = new ModelRendererTurbo(this, 176, 313, textureX, textureY); // Right seat part
		bodyModel[252] = new ModelRendererTurbo(this, 176, 309, textureX, textureY); // Right seat part
		bodyModel[253] = new ModelRendererTurbo(this, 176, 316, textureX, textureY); // Right seat part
		bodyModel[254] = new ModelRendererTurbo(this, 198, 301, textureX, textureY); // Right seat part
		bodyModel[255] = new ModelRendererTurbo(this, 161, 278, textureX, textureY); // Left seat part
		bodyModel[256] = new ModelRendererTurbo(this, 198, 318, textureX, textureY); // Boc 42
		bodyModel[257] = new ModelRendererTurbo(this, 161, 295, textureX, textureY); // Boc 42
		bodyModel[258] = new ModelRendererTurbo(this, 192, 311, textureX, textureY); // Right seat part
		bodyModel[259] = new ModelRendererTurbo(this, 155, 288, textureX, textureY); // Left seat part
		bodyModel[260] = new ModelRendererTurbo(this, 222, 303, textureX, textureY); // Right seat part
		bodyModel[261] = new ModelRendererTurbo(this, 213, 306, textureX, textureY); // Right seat part
		bodyModel[262] = new ModelRendererTurbo(this, 213, 303, textureX, textureY); // Right seat part
		bodyModel[263] = new ModelRendererTurbo(this, 222, 313, textureX, textureY); // Right seat part
		bodyModel[264] = new ModelRendererTurbo(this, 213, 319, textureX, textureY); // Right seat part
		bodyModel[265] = new ModelRendererTurbo(this, 213, 313, textureX, textureY); // Right seat part
		bodyModel[266] = new ModelRendererTurbo(this, 185, 280, textureX, textureY); // Left seat part
		bodyModel[267] = new ModelRendererTurbo(this, 176, 286, textureX, textureY); // Left seat part
		bodyModel[268] = new ModelRendererTurbo(this, 176, 280, textureX, textureY); // Left seat part
		bodyModel[269] = new ModelRendererTurbo(this, 185, 290, textureX, textureY); // Left seat part
		bodyModel[270] = new ModelRendererTurbo(this, 176, 296, textureX, textureY); // Left seat part
		bodyModel[271] = new ModelRendererTurbo(this, 176, 290, textureX, textureY); // Left seat part
		bodyModel[272] = new ModelRendererTurbo(this, 213, 309, textureX, textureY); // Right seat part
		bodyModel[273] = new ModelRendererTurbo(this, 213, 316, textureX, textureY); // Right seat part
		bodyModel[274] = new ModelRendererTurbo(this, 176, 283, textureX, textureY); // Left seat part
		bodyModel[275] = new ModelRendererTurbo(this, 176, 293, textureX, textureY); // Left seat part
		bodyModel[276] = new ModelRendererTurbo(this, 272, 301, textureX, textureY); // Right seat part
		bodyModel[277] = new ModelRendererTurbo(this, 235, 278, textureX, textureY); // Left seat part
		bodyModel[278] = new ModelRendererTurbo(this, 272, 318, textureX, textureY); // Boc 42
		bodyModel[279] = new ModelRendererTurbo(this, 235, 295, textureX, textureY); // Boc 42
		bodyModel[280] = new ModelRendererTurbo(this, 266, 311, textureX, textureY); // Right seat part
		bodyModel[281] = new ModelRendererTurbo(this, 229, 288, textureX, textureY); // Left seat part
		bodyModel[282] = new ModelRendererTurbo(this, 296, 303, textureX, textureY); // Right seat part
		bodyModel[283] = new ModelRendererTurbo(this, 287, 306, textureX, textureY); // Right seat part
		bodyModel[284] = new ModelRendererTurbo(this, 287, 303, textureX, textureY); // Right seat part
		bodyModel[285] = new ModelRendererTurbo(this, 296, 313, textureX, textureY); // Right seat part
		bodyModel[286] = new ModelRendererTurbo(this, 287, 319, textureX, textureY); // Right seat part
		bodyModel[287] = new ModelRendererTurbo(this, 287, 313, textureX, textureY); // Right seat part
		bodyModel[288] = new ModelRendererTurbo(this, 259, 280, textureX, textureY); // Left seat part
		bodyModel[289] = new ModelRendererTurbo(this, 250, 286, textureX, textureY); // Left seat part
		bodyModel[290] = new ModelRendererTurbo(this, 250, 280, textureX, textureY); // Left seat part
		bodyModel[291] = new ModelRendererTurbo(this, 259, 290, textureX, textureY); // Left seat part
		bodyModel[292] = new ModelRendererTurbo(this, 250, 296, textureX, textureY); // Left seat part
		bodyModel[293] = new ModelRendererTurbo(this, 250, 290, textureX, textureY); // Left seat part
		bodyModel[294] = new ModelRendererTurbo(this, 287, 309, textureX, textureY); // Right seat part
		bodyModel[295] = new ModelRendererTurbo(this, 287, 316, textureX, textureY); // Right seat part
		bodyModel[296] = new ModelRendererTurbo(this, 250, 283, textureX, textureY); // Left seat part
		bodyModel[297] = new ModelRendererTurbo(this, 250, 293, textureX, textureY); // Left seat part
		bodyModel[298] = new ModelRendererTurbo(this, 309, 301, textureX, textureY); // Right seat part
		bodyModel[299] = new ModelRendererTurbo(this, 272, 278, textureX, textureY); // Left seat part
		bodyModel[300] = new ModelRendererTurbo(this, 309, 318, textureX, textureY); // Boc 42
		bodyModel[301] = new ModelRendererTurbo(this, 272, 295, textureX, textureY); // Boc 42
		bodyModel[302] = new ModelRendererTurbo(this, 303, 311, textureX, textureY); // Right seat part
		bodyModel[303] = new ModelRendererTurbo(this, 266, 288, textureX, textureY); // Left seat part
		bodyModel[304] = new ModelRendererTurbo(this, 333, 303, textureX, textureY); // Right seat part
		bodyModel[305] = new ModelRendererTurbo(this, 324, 306, textureX, textureY); // Right seat part
		bodyModel[306] = new ModelRendererTurbo(this, 324, 303, textureX, textureY); // Right seat part
		bodyModel[307] = new ModelRendererTurbo(this, 333, 313, textureX, textureY); // Right seat part
		bodyModel[308] = new ModelRendererTurbo(this, 324, 319, textureX, textureY); // Right seat part
		bodyModel[309] = new ModelRendererTurbo(this, 324, 313, textureX, textureY); // Right seat part
		bodyModel[310] = new ModelRendererTurbo(this, 296, 280, textureX, textureY); // Left seat part
		bodyModel[311] = new ModelRendererTurbo(this, 287, 286, textureX, textureY); // Left seat part
		bodyModel[312] = new ModelRendererTurbo(this, 287, 280, textureX, textureY); // Left seat part
		bodyModel[313] = new ModelRendererTurbo(this, 296, 290, textureX, textureY); // Left seat part
		bodyModel[314] = new ModelRendererTurbo(this, 287, 296, textureX, textureY); // Left seat part
		bodyModel[315] = new ModelRendererTurbo(this, 287, 290, textureX, textureY); // Left seat part
		bodyModel[316] = new ModelRendererTurbo(this, 324, 309, textureX, textureY); // Right seat part
		bodyModel[317] = new ModelRendererTurbo(this, 324, 316, textureX, textureY); // Right seat part
		bodyModel[318] = new ModelRendererTurbo(this, 287, 283, textureX, textureY); // Left seat part
		bodyModel[319] = new ModelRendererTurbo(this, 287, 293, textureX, textureY); // Left seat part
		bodyModel[320] = new ModelRendererTurbo(this, 346, 301, textureX, textureY); // Right seat part
		bodyModel[321] = new ModelRendererTurbo(this, 309, 278, textureX, textureY); // Left seat part
		bodyModel[322] = new ModelRendererTurbo(this, 346, 318, textureX, textureY); // Boc 42
		bodyModel[323] = new ModelRendererTurbo(this, 309, 295, textureX, textureY); // Boc 42
		bodyModel[324] = new ModelRendererTurbo(this, 340, 311, textureX, textureY); // Right seat part
		bodyModel[325] = new ModelRendererTurbo(this, 303, 288, textureX, textureY); // Left seat part
		bodyModel[326] = new ModelRendererTurbo(this, 370, 303, textureX, textureY); // Right seat part
		bodyModel[327] = new ModelRendererTurbo(this, 361, 306, textureX, textureY); // Right seat part
		bodyModel[328] = new ModelRendererTurbo(this, 361, 303, textureX, textureY); // Right seat part
		bodyModel[329] = new ModelRendererTurbo(this, 370, 313, textureX, textureY); // Right seat part
		bodyModel[330] = new ModelRendererTurbo(this, 361, 319, textureX, textureY); // Right seat part
		bodyModel[331] = new ModelRendererTurbo(this, 361, 313, textureX, textureY); // Right seat part
		bodyModel[332] = new ModelRendererTurbo(this, 333, 280, textureX, textureY); // Left seat part
		bodyModel[333] = new ModelRendererTurbo(this, 324, 286, textureX, textureY); // Left seat part
		bodyModel[334] = new ModelRendererTurbo(this, 324, 280, textureX, textureY); // Left seat part
		bodyModel[335] = new ModelRendererTurbo(this, 333, 290, textureX, textureY); // Left seat part
		bodyModel[336] = new ModelRendererTurbo(this, 324, 296, textureX, textureY); // Left seat part
		bodyModel[337] = new ModelRendererTurbo(this, 324, 290, textureX, textureY); // Left seat part
		bodyModel[338] = new ModelRendererTurbo(this, 361, 309, textureX, textureY); // Right seat part
		bodyModel[339] = new ModelRendererTurbo(this, 361, 316, textureX, textureY); // Right seat part
		bodyModel[340] = new ModelRendererTurbo(this, 324, 283, textureX, textureY); // Left seat part
		bodyModel[341] = new ModelRendererTurbo(this, 324, 293, textureX, textureY); // Left seat part
		bodyModel[342] = new ModelRendererTurbo(this, 346, 278, textureX, textureY); // Left seat part
		bodyModel[343] = new ModelRendererTurbo(this, 346, 295, textureX, textureY); // Boc 42
		bodyModel[344] = new ModelRendererTurbo(this, 340, 288, textureX, textureY); // Left seat part
		bodyModel[345] = new ModelRendererTurbo(this, 370, 280, textureX, textureY); // Left seat part
		bodyModel[346] = new ModelRendererTurbo(this, 361, 286, textureX, textureY); // Left seat part
		bodyModel[347] = new ModelRendererTurbo(this, 361, 280, textureX, textureY); // Left seat part
		bodyModel[348] = new ModelRendererTurbo(this, 370, 290, textureX, textureY); // Left seat part
		bodyModel[349] = new ModelRendererTurbo(this, 361, 296, textureX, textureY); // Left seat part
		bodyModel[350] = new ModelRendererTurbo(this, 361, 290, textureX, textureY); // Left seat part
		bodyModel[351] = new ModelRendererTurbo(this, 361, 283, textureX, textureY); // Left seat part
		bodyModel[352] = new ModelRendererTurbo(this, 361, 293, textureX, textureY); // Left seat part
		bodyModel[353] = new ModelRendererTurbo(this, 476, 379, textureX, textureY); // Box 463
		bodyModel[354] = new ModelRendererTurbo(this, 74, 235, textureX, textureY); // Box 38
		bodyModel[355] = new ModelRendererTurbo(this, 74, 241, textureX, textureY); // Box 462
		bodyModel[356] = new ModelRendererTurbo(this, 461, 349, textureX, textureY); // Box 232
		bodyModel[357] = new ModelRendererTurbo(this, 465, 385, textureX, textureY); // Box 380
		bodyModel[358] = new ModelRendererTurbo(this, 463, 390, textureX, textureY); // Box 381
		bodyModel[359] = new ModelRendererTurbo(this, 468, 395, textureX, textureY); // Box 382
		bodyModel[360] = new ModelRendererTurbo(this, 29, 301, textureX, textureY); // Box 380
		bodyModel[361] = new ModelRendererTurbo(this, 27, 306, textureX, textureY); // Box 381
		bodyModel[362] = new ModelRendererTurbo(this, 32, 311, textureX, textureY); // Box 382
		bodyModel[363] = new ModelRendererTurbo(this, 306, 398, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[364] = new ModelRendererTurbo(this, 430, 373, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[365] = new ModelRendererTurbo(this, 34, 297, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[366] = new ModelRendererTurbo(this, 135, 185, textureX, textureY); // Box 2
		bodyModel[367] = new ModelRendererTurbo(this, 173, 185, textureX, textureY); // Box 2
		bodyModel[368] = new ModelRendererTurbo(this, 173, 193, textureX, textureY); // Box 2
		bodyModel[369] = new ModelRendererTurbo(this, 167, 185, textureX, textureY); // Box 2
		bodyModel[370] = new ModelRendererTurbo(this, 202, 184, textureX, textureY); // Box 2
		bodyModel[371] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 2
		bodyModel[372] = new ModelRendererTurbo(this, 166, 171, textureX, textureY); // Box 667
		bodyModel[373] = new ModelRendererTurbo(this, 200, 171, textureX, textureY); // Box 668
		bodyModel[374] = new ModelRendererTurbo(this, 154, 171, textureX, textureY); // Box 667
		bodyModel[375] = new ModelRendererTurbo(this, 165, 171, textureX, textureY); // Box 667
		bodyModel[376] = new ModelRendererTurbo(this, 142, 174, textureX, textureY); // Box 667
		bodyModel[377] = new ModelRendererTurbo(this, 145, 171, textureX, textureY,"cull"); // Box 667 cull
		bodyModel[378] = new ModelRendererTurbo(this, 172, 185, textureX, textureY); // Box 2
		bodyModel[379] = new ModelRendererTurbo(this, 158, 180, textureX, textureY); // Box 41
		bodyModel[380] = new ModelRendererTurbo(this, 141, 180, textureX, textureY); // Box 41
		bodyModel[381] = new ModelRendererTurbo(this, 207, 196, textureX, textureY); // Box 538
		bodyModel[382] = new ModelRendererTurbo(this, 206, 187, textureX, textureY,"cull"); // Box 538 cull
		bodyModel[383] = new ModelRendererTurbo(this, 208, 194, textureX, textureY); // Box 538
		bodyModel[384] = new ModelRendererTurbo(this, 207, 185, textureX, textureY); // Box 538
		bodyModel[385] = new ModelRendererTurbo(this, 113, 170, textureX, textureY); // Box 538
		bodyModel[386] = new ModelRendererTurbo(this, 132, 174, textureX, textureY,"cull"); // Box 668 cull
		bodyModel[387] = new ModelRendererTurbo(this, 134, 172, textureX, textureY); // Box 669
		bodyModel[388] = new ModelRendererTurbo(this, 133, 181, textureX, textureY); // Box 670
		bodyModel[389] = new ModelRendererTurbo(this, 87, 251, textureX, textureY); // Box 38
		bodyModel[390] = new ModelRendererTurbo(this, 87, 257, textureX, textureY); // Box 452
		bodyModel[391] = new ModelRendererTurbo(this, 87, 247, textureX, textureY); // Box 38
		bodyModel[392] = new ModelRendererTurbo(this, 87, 253, textureX, textureY); // Box 452
		bodyModel[393] = new ModelRendererTurbo(this, 87, 249, textureX, textureY); // Box 38
		bodyModel[394] = new ModelRendererTurbo(this, 87, 255, textureX, textureY); // Box 452
		bodyModel[395] = new ModelRendererTurbo(this, 72, 226, textureX, textureY); // Box 128
		bodyModel[396] = new ModelRendererTurbo(this, 54, 226, textureX, textureY); // Box 43
		bodyModel[397] = new ModelRendererTurbo(this, 306, 226, textureX, textureY); // Box 43
		bodyModel[398] = new ModelRendererTurbo(this, 72, 213, textureX, textureY); // Box 680
		bodyModel[399] = new ModelRendererTurbo(this, 54, 213, textureX, textureY); // Box 681
		bodyModel[400] = new ModelRendererTurbo(this, 306, 213, textureX, textureY); // Box 682
		bodyModel[401] = new ModelRendererTurbo(this, 51, 212, textureX, textureY); // Box 128
		bodyModel[402] = new ModelRendererTurbo(this, 48, 212, textureX, textureY); // Box 128
		bodyModel[403] = new ModelRendererTurbo(this, 51, 225, textureX, textureY); // Box 202
		bodyModel[404] = new ModelRendererTurbo(this, 48, 225, textureX, textureY); // Box 203
		bodyModel[405] = new ModelRendererTurbo(this, 314, 212, textureX, textureY); // Box 128
		bodyModel[406] = new ModelRendererTurbo(this, 311, 212, textureX, textureY); // Box 128
		bodyModel[407] = new ModelRendererTurbo(this, 314, 225, textureX, textureY); // Box 202
		bodyModel[408] = new ModelRendererTurbo(this, 311, 225, textureX, textureY); // Box 203
		bodyModel[409] = new ModelRendererTurbo(this, 55, 218, textureX, textureY); // Left trapdoor rear
		bodyModel[410] = new ModelRendererTurbo(this, 53, 231, textureX, textureY); // Right trapdoor rear
		bodyModel[411] = new ModelRendererTurbo(this, 59, 226, textureX, textureY); // Right side door rear
		bodyModel[412] = new ModelRendererTurbo(this, 59, 213, textureX, textureY); // Left side door rear
		bodyModel[413] = new ModelRendererTurbo(this, 289, 218, textureX, textureY); // Left trapdoor front
		bodyModel[414] = new ModelRendererTurbo(this, 289, 231, textureX, textureY); // Right trapdoor front
		bodyModel[415] = new ModelRendererTurbo(this, 293, 226, textureX, textureY); // Right side door front
		bodyModel[416] = new ModelRendererTurbo(this, 293, 213, textureX, textureY); // Left side door front
		bodyModel[417] = new ModelRendererTurbo(this, 72, 232, textureX, textureY); // Box 128
		bodyModel[418] = new ModelRendererTurbo(this, 54, 232, textureX, textureY); // Box 43
		bodyModel[419] = new ModelRendererTurbo(this, 306, 232, textureX, textureY); // Box 43
		bodyModel[420] = new ModelRendererTurbo(this, 72, 219, textureX, textureY); // Box 680
		bodyModel[421] = new ModelRendererTurbo(this, 54, 219, textureX, textureY); // Box 681
		bodyModel[422] = new ModelRendererTurbo(this, 306, 219, textureX, textureY); // Box 682
		bodyModel[423] = new ModelRendererTurbo(this, 288, 2, textureX, textureY); // Box 59
		bodyModel[424] = new ModelRendererTurbo(this, 269, 10, textureX, textureY); // Box 59
		bodyModel[425] = new ModelRendererTurbo(this, 283, 10, textureX, textureY); // Box 59
		bodyModel[426] = new ModelRendererTurbo(this, 265, 3, textureX, textureY); // Box 171
		bodyModel[427] = new ModelRendererTurbo(this, 311, 234, textureX, textureY); // Box 38
		bodyModel[428] = new ModelRendererTurbo(this, 311, 236, textureX, textureY); // Box 526
		bodyModel[429] = new ModelRendererTurbo(this, 20, 203, textureX, textureY); // Rear gate closed
		bodyModel[430] = new ModelRendererTurbo(this, 17, 208, textureX, textureY); // Rear gate open
		bodyModel[431] = new ModelRendererTurbo(this, 378, 124, textureX, textureY); // Front gate closed
		bodyModel[432] = new ModelRendererTurbo(this, 375, 129, textureX, textureY); // Front gate open
		bodyModel[433] = new ModelRendererTurbo(this, 255, 2, textureX, textureY); // Box 169
		bodyModel[434] = new ModelRendererTurbo(this, 255, 57, textureX, textureY); // Box 58
		bodyModel[435] = new ModelRendererTurbo(this, 373, 329, textureX, textureY); // Box 38
		bodyModel[436] = new ModelRendererTurbo(this, 341, 329, textureX, textureY); // Box 236
		bodyModel[437] = new ModelRendererTurbo(this, 358, 323, textureX, textureY); // Box 236
		bodyModel[438] = new ModelRendererTurbo(this, 298, 331, textureX, textureY); // Box 236
		bodyModel[439] = new ModelRendererTurbo(this, 358, 331, textureX, textureY); // Box 236 smoking room door
		bodyModel[440] = new ModelRendererTurbo(this, 415, 302, textureX, textureY); // Box 38
		bodyModel[441] = new ModelRendererTurbo(this, 415, 278, textureX, textureY); // Box 236
		bodyModel[442] = new ModelRendererTurbo(this, 433, 282, textureX, textureY); // Box 236
		bodyModel[443] = new ModelRendererTurbo(this, 419, 312, textureX, textureY); // Box 236
		bodyModel[444] = new ModelRendererTurbo(this, 433, 290, textureX, textureY); // Box 236 dorm door
		bodyModel[445] = new ModelRendererTurbo(this, 49, 264, textureX, textureY); // Box 38
		bodyModel[446] = new ModelRendererTurbo(this, 32, 265, textureX, textureY); // Box 581
		bodyModel[447] = new ModelRendererTurbo(this, 347, 31, textureX, textureY); // Box 38
		bodyModel[448] = new ModelRendererTurbo(this, 361, 43, textureX, textureY); // Box 38
		bodyModel[449] = new ModelRendererTurbo(this, 323, 28, textureX, textureY); // Box 38
		bodyModel[450] = new ModelRendererTurbo(this, 369, 46, textureX, textureY); // Box 273
		bodyModel[451] = new ModelRendererTurbo(this, 388, 43, textureX, textureY); // Box 587
		bodyModel[452] = new ModelRendererTurbo(this, 471, 68, textureX, textureY); // Box 38
		bodyModel[453] = new ModelRendererTurbo(this, 493, 83, textureX, textureY); // Box 276
		bodyModel[454] = new ModelRendererTurbo(this, 485, 83, textureX, textureY); // Box 587
		bodyModel[455] = new ModelRendererTurbo(this, 420, 28, textureX, textureY); // Box 38
		bodyModel[456] = new ModelRendererTurbo(this, 420, 43, textureX, textureY); // Box 38
		bodyModel[457] = new ModelRendererTurbo(this, 410, 43, textureX, textureY); // Box 273
		bodyModel[458] = new ModelRendererTurbo(this, 396, 31, textureX, textureY); // Box 38
		bodyModel[459] = new ModelRendererTurbo(this, 407, 243, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[460] = new ModelRendererTurbo(this, 412, 252, textureX, textureY); // Box 38
		bodyModel[461] = new ModelRendererTurbo(this, 412, 238, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[462] = new ModelRendererTurbo(this, 412, 234, textureX, textureY); // Box 38
		bodyModel[463] = new ModelRendererTurbo(this, 332, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[464] = new ModelRendererTurbo(this, 325, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[465] = new ModelRendererTurbo(this, 407, 263, textureX, textureY,"cull"); // Box 296 cull
		bodyModel[466] = new ModelRendererTurbo(this, 412, 272, textureX, textureY); // Box 297
		bodyModel[467] = new ModelRendererTurbo(this, 412, 258, textureX, textureY,"cull"); // Box 313 cull
		bodyModel[468] = new ModelRendererTurbo(this, 412, 236, textureX, textureY); // Box 526
		bodyModel[469] = new ModelRendererTurbo(this, 332, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[470] = new ModelRendererTurbo(this, 325, 275, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[471] = new ModelRendererTurbo(this, 430, 379, textureX, textureY); // Box 38
		bodyModel[472] = new ModelRendererTurbo(this, 430, 347, textureX, textureY); // Box 38
		bodyModel[473] = new ModelRendererTurbo(this, 491, 385, textureX, textureY); // Box 585
		bodyModel[474] = new ModelRendererTurbo(this, 467, 381, textureX, textureY,"lamp"); // Box 309 glow
		bodyModel[475] = new ModelRendererTurbo(this, 431, 371, textureX, textureY); // Box 236
		bodyModel[476] = new ModelRendererTurbo(this, 50, 288, textureX, textureY); // Box 236
		bodyModel[477] = new ModelRendererTurbo(this, 465, 351, textureX, textureY); // Box 232
		bodyModel[478] = new ModelRendererTurbo(this, 458, 349, textureX, textureY,"cull"); // Box 232 shower cull
		bodyModel[479] = new ModelRendererTurbo(this, 22, 251, textureX, textureY); // Box 38
		bodyModel[480] = new ModelRendererTurbo(this, 25, 256, textureX, textureY); // Box 38
		bodyModel[481] = new ModelRendererTurbo(this, 24, 260, textureX, textureY); // Box 38
		bodyModel[482] = new ModelRendererTurbo(this, 478, 358, textureX, textureY); // Box 38
		bodyModel[483] = new ModelRendererTurbo(this, 481, 363, textureX, textureY); // Box 38
		bodyModel[484] = new ModelRendererTurbo(this, 480, 367, textureX, textureY); // Box 38
		bodyModel[485] = new ModelRendererTurbo(this, 35, 243, textureX, textureY,"lamp"); // Box 597 glow
		bodyModel[486] = new ModelRendererTurbo(this, 33, 247, textureX, textureY); // Box 380
		bodyModel[487] = new ModelRendererTurbo(this, 31, 252, textureX, textureY); // Box 381
		bodyModel[488] = new ModelRendererTurbo(this, 36, 257, textureX, textureY); // Box 382
		bodyModel[489] = new ModelRendererTurbo(this, 457, 377, textureX, textureY); // Box 380
		bodyModel[490] = new ModelRendererTurbo(this, 455, 382, textureX, textureY); // Box 381
		bodyModel[491] = new ModelRendererTurbo(this, 460, 387, textureX, textureY); // Box 382
		bodyModel[492] = new ModelRendererTurbo(this, 383, 301, textureX, textureY); // Right seat part
		bodyModel[493] = new ModelRendererTurbo(this, 383, 318, textureX, textureY); // Boc 42
		bodyModel[494] = new ModelRendererTurbo(this, 377, 311, textureX, textureY); // Right seat part
		bodyModel[495] = new ModelRendererTurbo(this, 407, 303, textureX, textureY); // Right seat part
		bodyModel[496] = new ModelRendererTurbo(this, 398, 306, textureX, textureY); // Right seat part
		bodyModel[497] = new ModelRendererTurbo(this, 398, 303, textureX, textureY); // Right seat part
		bodyModel[498] = new ModelRendererTurbo(this, 407, 313, textureX, textureY); // Right seat part
		bodyModel[499] = new ModelRendererTurbo(this, 398, 319, textureX, textureY); // Right seat part

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

		bodyModel[48].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[48].setRotationPoint(-59.5F, -18F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 119, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[49].setRotationPoint(-59.5F, -19.5F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 119, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[50].setRotationPoint(-59.5F, -19F, -9.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
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
		bodyModel[139].setRotationPoint(51F, -20.09F, 5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.625F, -0.575F, -0.5F, -0.625F, -0.575F, -0.5F, -0.25F, -0.65F, 0F, -0.25F, -0.65F, 0F, 0.525F, -0.5F, -0.5F, 0.525F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[140].setRotationPoint(-52F, -20.09F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 59
		bodyModel[141].setRotationPoint(53F, -19.5F, 6.62F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 171
		bodyModel[142].setRotationPoint(-45F, -19.5F, -6.62F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[143].setRotationPoint(45.5F, -15F, 3F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 200, 1, 1, 0F,0F, 0F, 0F, -100F, 0F, 0F, -100F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -100F, -0.5F, 0F, -100F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[144].setRotationPoint(-47.5F, -10F, 10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 210, 1, 1, 0F,0F, 0F, 0F, -105F, 0F, 0F, -105F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -105F, -0.5F, 0F, -105F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 210
		bodyModel[145].setRotationPoint(-52.5F, -10F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 107, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 210
		bodyModel[146].setRotationPoint(-53.5F, -10F, -10.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 102, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 212
		bodyModel[147].setRotationPoint(-48.5F, -10F, 10.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[148].setRotationPoint(45.5F, -18F, 9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[149].setRotationPoint(45.5F, -18F, -11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 89, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -0.125F, 0F, -2F, -0.125F); // Box 221
		bodyModel[150].setRotationPoint(-43.5F, -18F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[151].setRotationPoint(0.5F, -18F, -9.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[152].setRotationPoint(-23.5F, -18F, -9.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[153].setRotationPoint(-23.5F, -18F, -10F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 0, 18, 0F); // Box 128 glow
		bodyModel[154].setRotationPoint(-57F, -14.99F, -9F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 0, 18, 0F); // Box 128 glow
		bodyModel[155].setRotationPoint(56F, -14.99F, -9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 7, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[156].setRotationPoint(46.5F, -15F, 3F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 9, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[157].setRotationPoint(-53.5F, -15F, -4F);

		bodyModel[158].addBox(0F, 0F, 0F, 10, 1, 20, 0F); // Box 38
		bodyModel[158].setRotationPoint(-53.5F, -16F, -10F);

		bodyModel[159].addBox(0F, 0F, 0F, 10, 2, 19, 0F); // Box 38
		bodyModel[159].setRotationPoint(-53.5F, -18F, -9.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[160].setRotationPoint(-47.5F, -15F, -6F);

		bodyModel[161].addBox(0F, 0F, 0F, 8, 1, 20, 0F); // Box 38
		bodyModel[161].setRotationPoint(45.5F, -16F, -10F);

		bodyModel[162].addBox(0F, 0F, 0F, 8, 2, 19, 0F); // Box 38
		bodyModel[162].setRotationPoint(45.5F, -18F, -9.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[163].setRotationPoint(46.5F, -15F, 4F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 107, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.81F, 0F, 0F, -0.81F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[164].setRotationPoint(-53.5F, -2F, 9F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 107, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.81F, 0F, 0F, -0.81F); // Box 266
		bodyModel[165].setRotationPoint(-53.5F, -2F, -10F);

		bodyModel[166].addBox(0F, 0F, 0F, 109, 2, 1, 0F); // Box 267
		bodyModel[166].setRotationPoint(-54.5F, 2F, 1F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[167].setRotationPoint(-43.5F, 4F, -1F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[168].setRotationPoint(-44.5F, 2F, -1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[169].setRotationPoint(-43.5F, 2F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 271
		bodyModel[170].setRotationPoint(-43.5F, 2F, 2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[171].setRotationPoint(41.5F, 4F, -1F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[172].setRotationPoint(40.5F, 2F, -1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[173].setRotationPoint(41.5F, 2F, -11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 271
		bodyModel[174].setRotationPoint(41.5F, 2F, 2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 89, 1, 2, 0F,0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 221
		bodyModel[175].setRotationPoint(-43.5F, -18F, -9.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 2, 19, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.03F, -1.25F, 0F, -2.03F, -1.25F, 0F, -2.03F, -1.25F, 0F, 0.03F, -1.25F, 0F); // Box 38
		bodyModel[176].setRotationPoint(-23F, -18F, -9.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[177].setRotationPoint(-23.5F, -18F, 9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 89, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 274
		bodyModel[178].setRotationPoint(-43.5F, -18F, 9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 89, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F); // Box 275
		bodyModel[179].setRotationPoint(-43.5F, -18F, 7.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 276
		bodyModel[180].setRotationPoint(0.5F, -17.5F, 9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[181].setRotationPoint(44.5F, -18F, -9.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 38
		bodyModel[182].setRotationPoint(44.5F, -18F, -10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 273
		bodyModel[183].setRotationPoint(44.5F, -18F, 9F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 2, 19, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -2.03F, -1.25F, 0F, 0.03F, -1.25F, 0F, 0.03F, -1.25F, 0F, -2.03F, -1.25F, 0F); // Box 38
		bodyModel[184].setRotationPoint(43F, -18F, -9.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262 glow
		bodyModel[185].setRotationPoint(-49.5F, -14.99F, -0.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232 glow
		bodyModel[186].setRotationPoint(49.5F, -14.99F, -0.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 46, 2, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, -3F, 0F, -1F, -3F); // Box 38 cull
		bodyModel[187].setRotationPoint(1.5F, -14F, -10F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[188].setRotationPoint(1.5F, -13F, -10F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[189].setRotationPoint(-22.5F, -13F, -10F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[190].setRotationPoint(-17.5F, -13F, -10F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[191].setRotationPoint(-12.5F, -13F, -10F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[192].setRotationPoint(-7.5F, -13F, -10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[193].setRotationPoint(-2.5F, -13F, -10F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[194].setRotationPoint(2.5F, -13F, -10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[195].setRotationPoint(7.5F, -13F, -10F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[196].setRotationPoint(12.5F, -13F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[197].setRotationPoint(17.5F, -13F, -10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[198].setRotationPoint(22.5F, -13F, -10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[199].setRotationPoint(27.5F, -13F, -10F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[200].setRotationPoint(32.5F, -13F, -10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 46, 2, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, -3F, 0F, -1F, -3F); // Box 296 cull
		bodyModel[201].setRotationPoint(1.5F, -14F, 7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[202].setRotationPoint(1.5F, -13F, 9F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[203].setRotationPoint(-22.5F, -13F, 9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[204].setRotationPoint(-17.5F, -13F, 9F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[205].setRotationPoint(-12.5F, -13F, 9F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[206].setRotationPoint(-7.5F, -13F, 9F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[207].setRotationPoint(-2.5F, -13F, 9F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[208].setRotationPoint(2.5F, -13F, 9F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[209].setRotationPoint(7.5F, -13F, 9F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[210].setRotationPoint(12.5F, -13F, 9F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[211].setRotationPoint(17.5F, -13F, 9F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[212].setRotationPoint(22.5F, -13F, 9F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[213].setRotationPoint(27.5F, -13F, 9F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[214].setRotationPoint(32.5F, -13F, 9F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 45, 2, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -0.99F, 0F, -2F, -0.99F, 0F, -2F, -0.99F, -0.99F, 0F, -0.99F, -0.99F); // Box 38 cull
		bodyModel[215].setRotationPoint(2F, -14F, -8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 45, 2, 2, 0F,0F, 0F, -0.99F, -2F, 0F, -0.99F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, -0.99F, -2F, -0.99F, -0.99F, -2F, -0.99F, 0F, 0F, -0.99F, 0F); // Box 313 cull
		bodyModel[216].setRotationPoint(2F, -14F, 6F);

		bodyModel[217].addShapeBox(-3F, 0F, -1F, 5, 1, 1, 0F,0.2F, 0F, -0.5F, -2.8F, 0F, -0.5F, -2.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, -0.5F, -2.8F, -0.5F, -0.5F, -2.8F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Left side door front
		bodyModel[217].setRotationPoint(-54.5F, -10F, -10.5F);

		bodyModel[218].addShapeBox(-3F, 0F, 0F, 5, 1, 1, 0F,0.2F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, 0F, -2.8F, -0.5F, 0F, -2.8F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F); // Right side door front
		bodyModel[218].setRotationPoint(-54.5F, -10F, 10.5F);

		bodyModel[219].addShapeBox(1F, 0F, -1F, 5, 1, 1, 0F,0.2F, 0F, -0.5F, -2.8F, 0F, -0.5F, -2.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, -0.5F, -2.8F, -0.5F, -0.5F, -2.8F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Left side door rear
		bodyModel[219].setRotationPoint(54.5F, -10F, -10.5F);

		bodyModel[220].addShapeBox(1F, 0F, 0F, 5, 1, 1, 0F,0.2F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, 0F, -2.8F, -0.5F, 0F, -2.8F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F); // Right side door rear
		bodyModel[220].setRotationPoint(54.5F, -10F, 10.5F);

		bodyModel[221].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[221].setRotationPoint(23.5F, -7F, 7F);
		bodyModel[221].rotateAngleY = -3.14159265F;

		bodyModel[222].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[222].setRotationPoint(32F, -7F, -7F);
		bodyModel[222].rotateAngleY = -3.14159265F;

		bodyModel[223].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Boc 42
		bodyModel[223].setRotationPoint(22F, -1F, 6F);

		bodyModel[224].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Boc 42
		bodyModel[224].setRotationPoint(30.5F, -1F, -8F);

		bodyModel[225].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[225].setRotationPoint(23.5F, -3F, 7F);
		bodyModel[225].rotateAngleY = -3.14159265F;

		bodyModel[226].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[226].setRotationPoint(32F, -3F, -7F);
		bodyModel[226].rotateAngleY = -3.14159265F;

		bodyModel[227].addShapeBox(1F, 0F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[227].setRotationPoint(23.5F, -5F, 7F);
		bodyModel[227].rotateAngleY = -3.14159265F;

		bodyModel[228].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[228].setRotationPoint(23.5F, -4F, 7F);
		bodyModel[228].rotateAngleY = -3.14159265F;

		bodyModel[229].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[229].setRotationPoint(23.5F, -5F, 7F);
		bodyModel[229].rotateAngleY = -3.14159265F;

		bodyModel[230].addShapeBox(1F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[230].setRotationPoint(23.5F, -5F, 7F);
		bodyModel[230].rotateAngleY = -3.14159265F;

		bodyModel[231].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[231].setRotationPoint(23.5F, -3F, 7F);
		bodyModel[231].rotateAngleY = -3.14159265F;

		bodyModel[232].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[232].setRotationPoint(23.5F, -5F, 7F);
		bodyModel[232].rotateAngleY = -3.14159265F;

		bodyModel[233].addShapeBox(1F, 0F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[233].setRotationPoint(32F, -5F, -7F);
		bodyModel[233].rotateAngleY = -3.14159265F;

		bodyModel[234].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[234].setRotationPoint(32F, -3F, -7F);
		bodyModel[234].rotateAngleY = -3.14159265F;

		bodyModel[235].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[235].setRotationPoint(32F, -5F, -7F);
		bodyModel[235].rotateAngleY = -3.14159265F;

		bodyModel[236].addShapeBox(1F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[236].setRotationPoint(32F, -5F, -7F);
		bodyModel[236].rotateAngleY = -3.14159265F;

		bodyModel[237].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[237].setRotationPoint(32F, -3F, -7F);
		bodyModel[237].rotateAngleY = -3.14159265F;

		bodyModel[238].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[238].setRotationPoint(32F, -5F, -7F);
		bodyModel[238].rotateAngleY = -3.14159265F;

		bodyModel[239].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[239].setRotationPoint(23.5F, -3F, 7F);
		bodyModel[239].rotateAngleY = -3.14159265F;

		bodyModel[240].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[240].setRotationPoint(23.5F, -4F, 7F);
		bodyModel[240].rotateAngleY = -3.14159265F;

		bodyModel[241].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[241].setRotationPoint(32F, -4F, -7F);
		bodyModel[241].rotateAngleY = -3.14159265F;

		bodyModel[242].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[242].setRotationPoint(32F, -4F, -7F);
		bodyModel[242].rotateAngleY = -3.14159265F;

		bodyModel[243].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[243].setRotationPoint(40.5F, -7F, 7F);
		bodyModel[243].rotateAngleY = -3.14159265F;

		bodyModel[244].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Boc 42
		bodyModel[244].setRotationPoint(39F, -1F, 6F);

		bodyModel[245].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[245].setRotationPoint(40.5F, -3F, 7F);
		bodyModel[245].rotateAngleY = -3.14159265F;

		bodyModel[246].addShapeBox(1F, 0F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[246].setRotationPoint(40.5F, -5F, 7F);
		bodyModel[246].rotateAngleY = -3.14159265F;

		bodyModel[247].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[247].setRotationPoint(40.5F, -4F, 7F);
		bodyModel[247].rotateAngleY = -3.14159265F;

		bodyModel[248].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[248].setRotationPoint(40.5F, -5F, 7F);
		bodyModel[248].rotateAngleY = -3.14159265F;

		bodyModel[249].addShapeBox(1F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[249].setRotationPoint(40.5F, -5F, 7F);
		bodyModel[249].rotateAngleY = -3.14159265F;

		bodyModel[250].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[250].setRotationPoint(40.5F, -3F, 7F);
		bodyModel[250].rotateAngleY = -3.14159265F;

		bodyModel[251].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[251].setRotationPoint(40.5F, -5F, 7F);
		bodyModel[251].rotateAngleY = -3.14159265F;

		bodyModel[252].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[252].setRotationPoint(40.5F, -3F, 7F);
		bodyModel[252].rotateAngleY = -3.14159265F;

		bodyModel[253].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[253].setRotationPoint(40.5F, -4F, 7F);
		bodyModel[253].rotateAngleY = -3.14159265F;

		bodyModel[254].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[254].setRotationPoint(32F, -7F, 7F);
		bodyModel[254].rotateAngleY = -3.14159265F;

		bodyModel[255].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[255].setRotationPoint(40.5F, -7F, -7F);
		bodyModel[255].rotateAngleY = -3.14159265F;

		bodyModel[256].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Boc 42
		bodyModel[256].setRotationPoint(30.5F, -1F, 6F);

		bodyModel[257].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Boc 42
		bodyModel[257].setRotationPoint(39F, -1F, -8F);

		bodyModel[258].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[258].setRotationPoint(32F, -3F, 7F);
		bodyModel[258].rotateAngleY = -3.14159265F;

		bodyModel[259].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[259].setRotationPoint(40.5F, -3F, -7F);
		bodyModel[259].rotateAngleY = -3.14159265F;

		bodyModel[260].addShapeBox(1F, 0F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[260].setRotationPoint(32F, -5F, 7F);
		bodyModel[260].rotateAngleY = -3.14159265F;

		bodyModel[261].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[261].setRotationPoint(32F, -4F, 7F);
		bodyModel[261].rotateAngleY = -3.14159265F;

		bodyModel[262].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[262].setRotationPoint(32F, -5F, 7F);
		bodyModel[262].rotateAngleY = -3.14159265F;

		bodyModel[263].addShapeBox(1F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[263].setRotationPoint(32F, -5F, 7F);
		bodyModel[263].rotateAngleY = -3.14159265F;

		bodyModel[264].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[264].setRotationPoint(32F, -3F, 7F);
		bodyModel[264].rotateAngleY = -3.14159265F;

		bodyModel[265].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[265].setRotationPoint(32F, -5F, 7F);
		bodyModel[265].rotateAngleY = -3.14159265F;

		bodyModel[266].addShapeBox(1F, 0F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[266].setRotationPoint(40.5F, -5F, -7F);
		bodyModel[266].rotateAngleY = -3.14159265F;

		bodyModel[267].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[267].setRotationPoint(40.5F, -3F, -7F);
		bodyModel[267].rotateAngleY = -3.14159265F;

		bodyModel[268].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[268].setRotationPoint(40.5F, -5F, -7F);
		bodyModel[268].rotateAngleY = -3.14159265F;

		bodyModel[269].addShapeBox(1F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[269].setRotationPoint(40.5F, -5F, -7F);
		bodyModel[269].rotateAngleY = -3.14159265F;

		bodyModel[270].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[270].setRotationPoint(40.5F, -3F, -7F);
		bodyModel[270].rotateAngleY = -3.14159265F;

		bodyModel[271].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[271].setRotationPoint(40.5F, -5F, -7F);
		bodyModel[271].rotateAngleY = -3.14159265F;

		bodyModel[272].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[272].setRotationPoint(32F, -3F, 7F);
		bodyModel[272].rotateAngleY = -3.14159265F;

		bodyModel[273].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[273].setRotationPoint(32F, -4F, 7F);
		bodyModel[273].rotateAngleY = -3.14159265F;

		bodyModel[274].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[274].setRotationPoint(40.5F, -4F, -7F);
		bodyModel[274].rotateAngleY = -3.14159265F;

		bodyModel[275].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[275].setRotationPoint(40.5F, -4F, -7F);
		bodyModel[275].rotateAngleY = -3.14159265F;

		bodyModel[276].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[276].setRotationPoint(15F, -7F, 7F);
		bodyModel[276].rotateAngleY = -3.14159265F;

		bodyModel[277].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[277].setRotationPoint(23.5F, -7F, -7F);
		bodyModel[277].rotateAngleY = -3.14159265F;

		bodyModel[278].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Boc 42
		bodyModel[278].setRotationPoint(13.5F, -1F, 6F);

		bodyModel[279].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Boc 42
		bodyModel[279].setRotationPoint(22F, -1F, -8F);

		bodyModel[280].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[280].setRotationPoint(15F, -3F, 7F);
		bodyModel[280].rotateAngleY = -3.14159265F;

		bodyModel[281].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[281].setRotationPoint(23.5F, -3F, -7F);
		bodyModel[281].rotateAngleY = -3.14159265F;

		bodyModel[282].addShapeBox(1F, 0F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[282].setRotationPoint(15F, -5F, 7F);
		bodyModel[282].rotateAngleY = -3.14159265F;

		bodyModel[283].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[283].setRotationPoint(15F, -4F, 7F);
		bodyModel[283].rotateAngleY = -3.14159265F;

		bodyModel[284].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[284].setRotationPoint(15F, -5F, 7F);
		bodyModel[284].rotateAngleY = -3.14159265F;

		bodyModel[285].addShapeBox(1F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[285].setRotationPoint(15F, -5F, 7F);
		bodyModel[285].rotateAngleY = -3.14159265F;

		bodyModel[286].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[286].setRotationPoint(15F, -3F, 7F);
		bodyModel[286].rotateAngleY = -3.14159265F;

		bodyModel[287].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[287].setRotationPoint(15F, -5F, 7F);
		bodyModel[287].rotateAngleY = -3.14159265F;

		bodyModel[288].addShapeBox(1F, 0F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[288].setRotationPoint(23.5F, -5F, -7F);
		bodyModel[288].rotateAngleY = -3.14159265F;

		bodyModel[289].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[289].setRotationPoint(23.5F, -3F, -7F);
		bodyModel[289].rotateAngleY = -3.14159265F;

		bodyModel[290].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[290].setRotationPoint(23.5F, -5F, -7F);
		bodyModel[290].rotateAngleY = -3.14159265F;

		bodyModel[291].addShapeBox(1F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[291].setRotationPoint(23.5F, -5F, -7F);
		bodyModel[291].rotateAngleY = -3.14159265F;

		bodyModel[292].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[292].setRotationPoint(23.5F, -3F, -7F);
		bodyModel[292].rotateAngleY = -3.14159265F;

		bodyModel[293].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[293].setRotationPoint(23.5F, -5F, -7F);
		bodyModel[293].rotateAngleY = -3.14159265F;

		bodyModel[294].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[294].setRotationPoint(15F, -3F, 7F);
		bodyModel[294].rotateAngleY = -3.14159265F;

		bodyModel[295].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[295].setRotationPoint(15F, -4F, 7F);
		bodyModel[295].rotateAngleY = -3.14159265F;

		bodyModel[296].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[296].setRotationPoint(23.5F, -4F, -7F);
		bodyModel[296].rotateAngleY = -3.14159265F;

		bodyModel[297].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[297].setRotationPoint(23.5F, -4F, -7F);
		bodyModel[297].rotateAngleY = -3.14159265F;

		bodyModel[298].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[298].setRotationPoint(6.5F, -7F, 7F);
		bodyModel[298].rotateAngleY = -3.14159265F;

		bodyModel[299].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[299].setRotationPoint(15F, -7F, -7F);
		bodyModel[299].rotateAngleY = -3.14159265F;

		bodyModel[300].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Boc 42
		bodyModel[300].setRotationPoint(5F, -1F, 6F);

		bodyModel[301].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Boc 42
		bodyModel[301].setRotationPoint(13.5F, -1F, -8F);

		bodyModel[302].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[302].setRotationPoint(6.5F, -3F, 7F);
		bodyModel[302].rotateAngleY = -3.14159265F;

		bodyModel[303].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[303].setRotationPoint(15F, -3F, -7F);
		bodyModel[303].rotateAngleY = -3.14159265F;

		bodyModel[304].addShapeBox(1F, 0F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[304].setRotationPoint(6.5F, -5F, 7F);
		bodyModel[304].rotateAngleY = -3.14159265F;

		bodyModel[305].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[305].setRotationPoint(6.5F, -4F, 7F);
		bodyModel[305].rotateAngleY = -3.14159265F;

		bodyModel[306].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[306].setRotationPoint(6.5F, -5F, 7F);
		bodyModel[306].rotateAngleY = -3.14159265F;

		bodyModel[307].addShapeBox(1F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[307].setRotationPoint(6.5F, -5F, 7F);
		bodyModel[307].rotateAngleY = -3.14159265F;

		bodyModel[308].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[308].setRotationPoint(6.5F, -3F, 7F);
		bodyModel[308].rotateAngleY = -3.14159265F;

		bodyModel[309].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[309].setRotationPoint(6.5F, -5F, 7F);
		bodyModel[309].rotateAngleY = -3.14159265F;

		bodyModel[310].addShapeBox(1F, 0F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[310].setRotationPoint(15F, -5F, -7F);
		bodyModel[310].rotateAngleY = -3.14159265F;

		bodyModel[311].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[311].setRotationPoint(15F, -3F, -7F);
		bodyModel[311].rotateAngleY = -3.14159265F;

		bodyModel[312].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[312].setRotationPoint(15F, -5F, -7F);
		bodyModel[312].rotateAngleY = -3.14159265F;

		bodyModel[313].addShapeBox(1F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[313].setRotationPoint(15F, -5F, -7F);
		bodyModel[313].rotateAngleY = -3.14159265F;

		bodyModel[314].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[314].setRotationPoint(15F, -3F, -7F);
		bodyModel[314].rotateAngleY = -3.14159265F;

		bodyModel[315].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[315].setRotationPoint(15F, -5F, -7F);
		bodyModel[315].rotateAngleY = -3.14159265F;

		bodyModel[316].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[316].setRotationPoint(6.5F, -3F, 7F);
		bodyModel[316].rotateAngleY = -3.14159265F;

		bodyModel[317].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[317].setRotationPoint(6.5F, -4F, 7F);
		bodyModel[317].rotateAngleY = -3.14159265F;

		bodyModel[318].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[318].setRotationPoint(15F, -4F, -7F);
		bodyModel[318].rotateAngleY = -3.14159265F;

		bodyModel[319].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[319].setRotationPoint(15F, -4F, -7F);
		bodyModel[319].rotateAngleY = -3.14159265F;

		bodyModel[320].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[320].setRotationPoint(-6F, -7F, 7F);
		bodyModel[320].rotateAngleY = -3.14159265F;

		bodyModel[321].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[321].setRotationPoint(6.5F, -7F, -7F);
		bodyModel[321].rotateAngleY = -3.14159265F;

		bodyModel[322].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Boc 42
		bodyModel[322].setRotationPoint(-7.5F, -1F, 6F);

		bodyModel[323].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Boc 42
		bodyModel[323].setRotationPoint(5F, -1F, -8F);

		bodyModel[324].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[324].setRotationPoint(-6F, -3F, 7F);
		bodyModel[324].rotateAngleY = -3.14159265F;

		bodyModel[325].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[325].setRotationPoint(6.5F, -3F, -7F);
		bodyModel[325].rotateAngleY = -3.14159265F;

		bodyModel[326].addShapeBox(1F, 0F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[326].setRotationPoint(-6F, -5F, 7F);
		bodyModel[326].rotateAngleY = -3.14159265F;

		bodyModel[327].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[327].setRotationPoint(-6F, -4F, 7F);
		bodyModel[327].rotateAngleY = -3.14159265F;

		bodyModel[328].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[328].setRotationPoint(-6F, -5F, 7F);
		bodyModel[328].rotateAngleY = -3.14159265F;

		bodyModel[329].addShapeBox(1F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[329].setRotationPoint(-6F, -5F, 7F);
		bodyModel[329].rotateAngleY = -3.14159265F;

		bodyModel[330].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[330].setRotationPoint(-6F, -3F, 7F);
		bodyModel[330].rotateAngleY = -3.14159265F;

		bodyModel[331].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[331].setRotationPoint(-6F, -5F, 7F);
		bodyModel[331].rotateAngleY = -3.14159265F;

		bodyModel[332].addShapeBox(1F, 0F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[332].setRotationPoint(6.5F, -5F, -7F);
		bodyModel[332].rotateAngleY = -3.14159265F;

		bodyModel[333].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[333].setRotationPoint(6.5F, -3F, -7F);
		bodyModel[333].rotateAngleY = -3.14159265F;

		bodyModel[334].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[334].setRotationPoint(6.5F, -5F, -7F);
		bodyModel[334].rotateAngleY = -3.14159265F;

		bodyModel[335].addShapeBox(1F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[335].setRotationPoint(6.5F, -5F, -7F);
		bodyModel[335].rotateAngleY = -3.14159265F;

		bodyModel[336].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[336].setRotationPoint(6.5F, -3F, -7F);
		bodyModel[336].rotateAngleY = -3.14159265F;

		bodyModel[337].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[337].setRotationPoint(6.5F, -5F, -7F);
		bodyModel[337].rotateAngleY = -3.14159265F;

		bodyModel[338].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[338].setRotationPoint(-6F, -3F, 7F);
		bodyModel[338].rotateAngleY = -3.14159265F;

		bodyModel[339].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[339].setRotationPoint(-6F, -4F, 7F);
		bodyModel[339].rotateAngleY = -3.14159265F;

		bodyModel[340].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[340].setRotationPoint(6.5F, -4F, -7F);
		bodyModel[340].rotateAngleY = -3.14159265F;

		bodyModel[341].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[341].setRotationPoint(6.5F, -4F, -7F);
		bodyModel[341].rotateAngleY = -3.14159265F;

		bodyModel[342].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[342].setRotationPoint(-6F, -7F, -7F);
		bodyModel[342].rotateAngleY = -3.14159265F;

		bodyModel[343].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Boc 42
		bodyModel[343].setRotationPoint(-7.5F, -1F, -8F);

		bodyModel[344].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[344].setRotationPoint(-6F, -3F, -7F);
		bodyModel[344].rotateAngleY = -3.14159265F;

		bodyModel[345].addShapeBox(1F, 0F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[345].setRotationPoint(-6F, -5F, -7F);
		bodyModel[345].rotateAngleY = -3.14159265F;

		bodyModel[346].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[346].setRotationPoint(-6F, -3F, -7F);
		bodyModel[346].rotateAngleY = -3.14159265F;

		bodyModel[347].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[347].setRotationPoint(-6F, -5F, -7F);
		bodyModel[347].rotateAngleY = -3.14159265F;

		bodyModel[348].addShapeBox(1F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[348].setRotationPoint(-6F, -5F, -7F);
		bodyModel[348].rotateAngleY = -3.14159265F;

		bodyModel[349].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[349].setRotationPoint(-6F, -3F, -7F);
		bodyModel[349].rotateAngleY = -3.14159265F;

		bodyModel[350].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[350].setRotationPoint(-6F, -5F, -7F);
		bodyModel[350].rotateAngleY = -3.14159265F;

		bodyModel[351].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[351].setRotationPoint(-6F, -4F, -7F);
		bodyModel[351].rotateAngleY = -3.14159265F;

		bodyModel[352].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[352].setRotationPoint(-6F, -4F, -7F);
		bodyModel[352].rotateAngleY = -3.14159265F;

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[353].setRotationPoint(-53.5F, -16F, 4F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 107, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[354].setRotationPoint(-53.5F, -11F, -9.9F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 107, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[355].setRotationPoint(-53.5F, -11F, 9.9F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 0, 13, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 232
		bodyModel[356].setRotationPoint(-47.5F, -13F, -10F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[357].setRotationPoint(-46.5F, -6F, 7F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 381
		bodyModel[358].setRotationPoint(-46F, -5F, 7F);
		bodyModel[358].rotateAngleZ = -1.04719755F;

		bodyModel[359].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[359].setRotationPoint(-45.25F, -5F, 8.5F);
		bodyModel[359].rotateAngleY = -0.78539816F;

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[360].setRotationPoint(46.5F, -6F, 6F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 381
		bodyModel[361].setRotationPoint(47F, -2.4F, 6F);
		bodyModel[361].rotateAngleZ = 1.04719755F;

		bodyModel[362].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[362].setRotationPoint(47.75F, -5F, 7.5F);
		bodyModel[362].rotateAngleY = -0.78539816F;

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 309 glow
		bodyModel[363].setRotationPoint(-25.5F, -18F, -1F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[364].setRotationPoint(-43.5F, -18F, -1F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[365].setRotationPoint(46.5F, -14F, 6.5F);

		bodyModel[366].addBox(0F, 0F, 0F, 13, 4, 5, 0F); // Box 2
		bodyModel[366].setRotationPoint(-6.5F, 2F, 5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[367].setRotationPoint(-22.5F, 2F, 5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[368].setRotationPoint(-22.5F, 5F, 5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[369].setRotationPoint(-8.5F, 2F, 9F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[370].setRotationPoint(-25.5F, 2F, 10F);

		bodyModel[371].addBox(0F, 0F, 0F, 13, 1, 5, 0F); // Box 2
		bodyModel[371].setRotationPoint(-6.5F, 6F, 5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 11, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		bodyModel[372].setRotationPoint(-20.5F, 2F, -10F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 668
		bodyModel[373].setRotationPoint(-25.5F, 2F, -10F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		bodyModel[374].setRotationPoint(-2.5F, 2F, -10F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		bodyModel[375].setRotationPoint(-9.5F, 2F, -10F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 667
		bodyModel[376].setRotationPoint(2.5F, 2F, -9F);
		bodyModel[376].rotateAngleX = -0.78539816F;

		bodyModel[377].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 667 cull
		bodyModel[377].setRotationPoint(3.5F, 2F, -9.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[378].setRotationPoint(-9.5F, 2F, 9.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, -0.58F, 0F, -0.58F, -0.58F); // Box 41
		bodyModel[379].setRotationPoint(-5.5F, 3F, 0F);
		bodyModel[379].rotateAngleX = -0.78539816F;

		bodyModel[380].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, -0.58F, 0F, -0.58F, -0.58F); // Box 41
		bodyModel[380].setRotationPoint(-0.5F, 3F, 0F);
		bodyModel[380].rotateAngleX = -0.78539816F;

		bodyModel[381].addShapeBox(0F, 0F, 0F, 12, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[381].setRotationPoint(-37F, 4.5F, -0.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.25F, -0.5F, 0F, 1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 538 cull
		bodyModel[382].setRotationPoint(-26F, 2F, 0.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0.25F, -0.45F, 0F, 0.25F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 538
		bodyModel[383].setRotationPoint(-26.5F, 4F, 1.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 538
		bodyModel[384].setRotationPoint(-26F, 2F, 4.75F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 12, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[385].setRotationPoint(25F, 4.5F, -0.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.5F, 0F, 1.25F, -0.5F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 668 cull
		bodyModel[386].setRotationPoint(25F, 2F, -3.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0.25F, -0.45F, 0F, 0.25F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 669
		bodyModel[387].setRotationPoint(24.25F, 4F, -1.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 670
		bodyModel[388].setRotationPoint(23.5F, 2F, -4.75F);

		bodyModel[389].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 38
		bodyModel[389].setRotationPoint(-47.5F, -2.5F, -11.01F);

		bodyModel[390].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 452
		bodyModel[390].setRotationPoint(-47.5F, -2.5F, 11.01F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 95, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[391].setRotationPoint(-47.5F, -2.5F, -11.01F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 95, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 452
		bodyModel[392].setRotationPoint(-47.5F, -2.5F, 11.01F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 95, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.035F, 0F, -0.5F, -0.035F, 0F, -0.5F, 0.035F, 0F, -0.5F, 0.035F); // Box 38
		bodyModel[393].setRotationPoint(-47.5F, -2F, -11.01F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 95, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.035F, 0F, -0.5F, 0.035F, 0F, -0.5F, -0.035F, 0F, -0.5F, -0.035F); // Box 452
		bodyModel[394].setRotationPoint(-47.5F, -2F, 11.01F);

		bodyModel[395].addBox(0F, 0F, 0F, 109, 4, 1, 0F); // Box 128
		bodyModel[395].setRotationPoint(-54.5F, -2F, 10F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[396].setRotationPoint(58.5F, -2F, 10F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[397].setRotationPoint(-59.5F, -2F, 10F);

		bodyModel[398].addBox(0F, 0F, 0F, 109, 4, 1, 0F); // Box 680
		bodyModel[398].setRotationPoint(-54.5F, -2F, -11F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 681
		bodyModel[399].setRotationPoint(58.5F, -2F, -11F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 682
		bodyModel[400].setRotationPoint(-59.5F, -2F, -11F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[401].setRotationPoint(54F, -6F, -12F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[402].setRotationPoint(59F, -6F, -12F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[403].setRotationPoint(54F, -6F, 11F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[404].setRotationPoint(59F, -6F, 11F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[405].setRotationPoint(-59F, -6F, -12F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[406].setRotationPoint(-54F, -6F, -12F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[407].setRotationPoint(-59F, -6F, 11F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[408].setRotationPoint(-54F, -6F, 11F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left trapdoor rear
		bodyModel[409].setRotationPoint(54.5F, 1F, -11F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right trapdoor rear
		bodyModel[410].setRotationPoint(54.5F, 1F, 5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door rear
		bodyModel[411].setRotationPoint(54.5F, -2F, 10.5F);

		bodyModel[412].addShapeBox(0F, 0F, -1F, 5, 3, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Left side door rear
		bodyModel[412].setRotationPoint(54.5F, -2F, -10.5F);

		bodyModel[413].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left trapdoor front
		bodyModel[413].setRotationPoint(-54.5F, 1F, -11F);

		bodyModel[414].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right trapdoor front
		bodyModel[414].setRotationPoint(-54.5F, 1F, 5F);

		bodyModel[415].addShapeBox(-4F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door front
		bodyModel[415].setRotationPoint(-54.5F, -2F, 10.5F);

		bodyModel[416].addShapeBox(-4F, 0F, -1F, 5, 3, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Left side door front
		bodyModel[416].setRotationPoint(-54.5F, -2F, -10.5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 109, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[417].setRotationPoint(-54.5F, 2F, 10F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[418].setRotationPoint(58.5F, 2F, 10F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[419].setRotationPoint(-59.5F, 2F, 10F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 109, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 680
		bodyModel[420].setRotationPoint(-54.5F, 2F, -11F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 681
		bodyModel[421].setRotationPoint(58.5F, 2F, -11F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 682
		bodyModel[422].setRotationPoint(-59.5F, 2F, -11F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.25F, -0.65F, -0.5F, -0.25F, -0.65F, -0.5F, -0.625F, -0.575F, 0F, -0.625F, -0.575F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.525F, -0.5F, 0F, 0.525F, -0.5F); // Box 59
		bodyModel[423].setRotationPoint(-52.5F, -20.09F, 5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 59
		bodyModel[424].setRotationPoint(47F, -19.5F, 6.62F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 59
		bodyModel[425].setRotationPoint(-45F, -19.5F, 6.62F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 171
		bodyModel[426].setRotationPoint(47F, -19.5F, -6.62F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 44, 0, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[427].setRotationPoint(1.5F, -13F, -9F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 44, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 526
		bodyModel[428].setRotationPoint(1.5F, -13F, 8F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[429].setRotationPoint(59.5F, -8F, -3F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[430].setRotationPoint(59.5F, -8F, -3F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate closed
		bodyModel[431].setRotationPoint(-59.5F, -8F, -3F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate open
		bodyModel[432].setRotationPoint(-59.5F, -8F, 2F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.625F, -0.575F, -0.5F, -0.625F, -0.575F, -0.5F, -0.25F, -0.65F, 0F, -0.25F, -0.65F, 0F, 0.525F, -0.5F, -0.5F, 0.525F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[433].setRotationPoint(51F, -20.09F, -8F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 117, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 58
		bodyModel[434].setRotationPoint(-58.5F, -20F, -0.5F);

		bodyModel[435].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[435].setRotationPoint(0.5F, -15F, 3F);

		bodyModel[436].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 236
		bodyModel[436].setRotationPoint(0.5F, -15F, -10F);

		bodyModel[437].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 236
		bodyModel[437].setRotationPoint(0.5F, -15F, -3F);

		bodyModel[438].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 236
		bodyModel[438].setRotationPoint(0.5F, -16F, -10F);

		bodyModel[439].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Box 236 smoking room door
		bodyModel[439].setRotationPoint(0.5F, -14F, -3F);
		bodyModel[439].rotateAngleY = 1.48352986F;

		bodyModel[440].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[440].setRotationPoint(-24.5F, -15F, 3F);

		bodyModel[441].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 236
		bodyModel[441].setRotationPoint(-24.5F, -15F, -10F);

		bodyModel[442].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 236
		bodyModel[442].setRotationPoint(-24.5F, -15F, -3F);

		bodyModel[443].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 236
		bodyModel[443].setRotationPoint(-24.5F, -16F, -10F);

		bodyModel[444].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Box 236 dorm door
		bodyModel[444].setRotationPoint(-24.5F, -14F, -3F);
		bodyModel[444].rotateAngleY = 1.48352986F;

		bodyModel[445].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[445].setRotationPoint(45.5F, -15F, -10F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 7, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		bodyModel[446].setRotationPoint(46.5F, -15F, -4F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[447].setRotationPoint(1.5F, -18F, -9.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[448].setRotationPoint(1.5F, -18F, -10F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 2, 19, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.03F, -1.25F, 0F, -2.03F, -1.25F, 0F, -2.03F, -1.25F, 0F, 0.03F, -1.25F, 0F); // Box 38
		bodyModel[449].setRotationPoint(2F, -18F, -9.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[450].setRotationPoint(1.5F, -18F, 9F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 587
		bodyModel[451].setRotationPoint(0.5F, -17.5F, -10F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[452].setRotationPoint(-24.5F, -18F, -9.5F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 276
		bodyModel[453].setRotationPoint(-24.5F, -17.5F, 9F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 587
		bodyModel[454].setRotationPoint(-24.5F, -17.5F, -10F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[455].setRotationPoint(-0.5F, -18F, -9.5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 38
		bodyModel[456].setRotationPoint(-0.5F, -18F, -10F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 273
		bodyModel[457].setRotationPoint(-0.5F, -18F, 9F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 2, 2, 19, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -2.03F, -1.25F, 0F, 0.03F, -1.25F, 0F, 0.03F, -1.25F, 0F, -2.03F, -1.25F, 0F); // Box 38
		bodyModel[458].setRotationPoint(-2F, -18F, -9.5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, -3F, 0F, -1F, -3F); // Box 38 cull
		bodyModel[459].setRotationPoint(-23.5F, -14F, -10F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[460].setRotationPoint(-23.5F, -13F, -10F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, -0.99F, 0F, -2F, -0.99F, 0F, -2F, -0.99F, -0.99F, 0F, -0.99F, -0.99F); // Box 38 cull
		bodyModel[461].setRotationPoint(-23F, -14F, -8F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 24, 0, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[462].setRotationPoint(-23.5F, -13F, -9F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[463].setRotationPoint(37.5F, -13F, -10F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 glow
		bodyModel[464].setRotationPoint(42.5F, -13F, -10F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, -3F, 0F, -1F, -3F); // Box 296 cull
		bodyModel[465].setRotationPoint(-23.5F, -14F, 7F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[466].setRotationPoint(-23.5F, -13F, 9F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F,0F, 0F, -0.99F, -2F, 0F, -0.99F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, -0.99F, -2F, -0.99F, -0.99F, -2F, -0.99F, 0F, 0F, -0.99F, 0F); // Box 313 cull
		bodyModel[467].setRotationPoint(-23F, -14F, 6F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 24, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 526
		bodyModel[468].setRotationPoint(-23.5F, -13F, 8F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[469].setRotationPoint(37.5F, -13F, 9F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.01F, 0.75F, 0F, -0.01F, 0.75F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 glow
		bodyModel[470].setRotationPoint(42.5F, -13F, 9F);

		bodyModel[471].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[471].setRotationPoint(-44.5F, -15F, 3F);

		bodyModel[472].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[472].setRotationPoint(-44.5F, -15F, -10F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 9, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[473].setRotationPoint(-53.5F, -15F, 3F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 309 glow
		bodyModel[474].setRotationPoint(-45.5F, -14F, 7.5F);

		bodyModel[475].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 236
		bodyModel[475].setRotationPoint(-44.5F, -15F, -3F);

		bodyModel[476].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 236
		bodyModel[476].setRotationPoint(45.5F, -15F, -3F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[477].setRotationPoint(-47.5F, -14F, -10F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, -0.01F, 0F, -0.51F, -0.01F, 0F, -0.51F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F); // Box 232 shower cull
		bodyModel[478].setRotationPoint(-46F, -15F, -8.5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[479].setRotationPoint(50.75F, -2F, -9F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[480].setRotationPoint(51.5F, -1F, -8.55F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[481].setRotationPoint(51F, 0.5F, -9.05F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[482].setRotationPoint(-53.25F, -2F, -9F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[483].setRotationPoint(-53.25F, -1F, -8.55F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[484].setRotationPoint(-53.25F, 0.5F, -9.05F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 597 glow
		bodyModel[485].setRotationPoint(46.5F, -14F, -8F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[486].setRotationPoint(46.5F, -6F, -8F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 381
		bodyModel[487].setRotationPoint(47F, -2.4F, -8F);
		bodyModel[487].rotateAngleZ = 1.04719755F;

		bodyModel[488].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[488].setRotationPoint(47.75F, -5F, -6.5F);
		bodyModel[488].rotateAngleY = -0.78539816F;

		bodyModel[489].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[489].setRotationPoint(-46.5F, -6F, 4F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 381
		bodyModel[490].setRotationPoint(-46F, -5F, 4F);
		bodyModel[490].rotateAngleZ = -1.04719755F;

		bodyModel[491].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[491].setRotationPoint(-45.25F, -5F, 5.5F);
		bodyModel[491].rotateAngleY = -0.78539816F;

		bodyModel[492].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[492].setRotationPoint(-16F, -7F, 7F);
		bodyModel[492].rotateAngleY = -3.14159265F;

		bodyModel[493].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Boc 42
		bodyModel[493].setRotationPoint(-17.5F, -1F, 6F);

		bodyModel[494].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[494].setRotationPoint(-16F, -3F, 7F);
		bodyModel[494].rotateAngleY = -3.14159265F;

		bodyModel[495].addShapeBox(1F, 0F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[495].setRotationPoint(-16F, -5F, 7F);
		bodyModel[495].rotateAngleY = -3.14159265F;

		bodyModel[496].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[496].setRotationPoint(-16F, -4F, 7F);
		bodyModel[496].rotateAngleY = -3.14159265F;

		bodyModel[497].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[497].setRotationPoint(-16F, -5F, 7F);
		bodyModel[497].rotateAngleY = -3.14159265F;

		bodyModel[498].addShapeBox(1F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[498].setRotationPoint(-16F, -5F, 7F);
		bodyModel[498].rotateAngleY = -3.14159265F;

		bodyModel[499].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[499].setRotationPoint(-16F, -3F, 7F);
		bodyModel[499].rotateAngleY = -3.14159265F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 398, 313, textureX, textureY); // Right seat part
		bodyModel[501] = new ModelRendererTurbo(this, 398, 309, textureX, textureY); // Right seat part
		bodyModel[502] = new ModelRendererTurbo(this, 398, 316, textureX, textureY); // Right seat part
		bodyModel[503] = new ModelRendererTurbo(this, 383, 278, textureX, textureY); // Left seat part
		bodyModel[504] = new ModelRendererTurbo(this, 383, 295, textureX, textureY); // Boc 42
		bodyModel[505] = new ModelRendererTurbo(this, 377, 288, textureX, textureY); // Left seat part
		bodyModel[506] = new ModelRendererTurbo(this, 407, 280, textureX, textureY); // Left seat part
		bodyModel[507] = new ModelRendererTurbo(this, 398, 286, textureX, textureY); // Left seat part
		bodyModel[508] = new ModelRendererTurbo(this, 398, 280, textureX, textureY); // Left seat part
		bodyModel[509] = new ModelRendererTurbo(this, 407, 290, textureX, textureY); // Left seat part
		bodyModel[510] = new ModelRendererTurbo(this, 398, 296, textureX, textureY); // Left seat part
		bodyModel[511] = new ModelRendererTurbo(this, 398, 290, textureX, textureY); // Left seat part
		bodyModel[512] = new ModelRendererTurbo(this, 398, 283, textureX, textureY); // Left seat part
		bodyModel[513] = new ModelRendererTurbo(this, 398, 293, textureX, textureY); // Left seat part
		bodyModel[514] = new ModelRendererTurbo(this, 442, 290, textureX, textureY); // Box 236 dorm door curtain
		bodyModel[515] = new ModelRendererTurbo(this, 313, 390, textureX, textureY); // Box 128
		bodyModel[516] = new ModelRendererTurbo(this, 314, 382, textureX, textureY); // Box 128
		bodyModel[517] = new ModelRendererTurbo(this, 364, 397, textureX, textureY); // Box 128
		bodyModel[518] = new ModelRendererTurbo(this, 369, 382, textureX, textureY); // Box 128
		bodyModel[519] = new ModelRendererTurbo(this, 351, 381, textureX, textureY); // Section low sliding part F
		bodyModel[520] = new ModelRendererTurbo(this, 313, 381, textureX, textureY); // Section lower sliding part R
		bodyModel[521] = new ModelRendererTurbo(this, 364, 390, textureX, textureY); // Box 128
		bodyModel[522] = new ModelRendererTurbo(this, 317, 397, textureX, textureY); // Box 128
		bodyModel[523] = new ModelRendererTurbo(this, 364, 397, textureX, textureY); // Box 128
		bodyModel[524] = new ModelRendererTurbo(this, 374, 397, textureX, textureY); // Box 128
		bodyModel[525] = new ModelRendererTurbo(this, 315, 372, textureX, textureY); // Section lower folding part LR
		bodyModel[526] = new ModelRendererTurbo(this, 315, 363, textureX, textureY); // Section lower folding part UR
		bodyModel[527] = new ModelRendererTurbo(this, 313, 380, textureX, textureY); // Box 128
		bodyModel[528] = new ModelRendererTurbo(this, 364, 382, textureX, textureY); // Box 128
		bodyModel[529] = new ModelRendererTurbo(this, 353, 363, textureX, textureY); // Section lower folding part UF
		bodyModel[530] = new ModelRendererTurbo(this, 353, 372, textureX, textureY); // Section lower folding part LF
		bodyModel[531] = new ModelRendererTurbo(this, 421, 390, textureX, textureY); // Box 128
		bodyModel[532] = new ModelRendererTurbo(this, 421, 397, textureX, textureY); // Box 128
		bodyModel[533] = new ModelRendererTurbo(this, 374, 382, textureX, textureY); // Box 128
		bodyModel[534] = new ModelRendererTurbo(this, 424, 382, textureX, textureY); // Box 128
		bodyModel[535] = new ModelRendererTurbo(this, 389, 380, textureX, textureY); // Box 128
		bodyModel[536] = new ModelRendererTurbo(this, 411, 381, textureX, textureY); // Section low sliding part F
		bodyModel[537] = new ModelRendererTurbo(this, 373, 381, textureX, textureY); // Section lower sliding part R
		bodyModel[538] = new ModelRendererTurbo(this, 375, 372, textureX, textureY); // Section lower folding part LR
		bodyModel[539] = new ModelRendererTurbo(this, 375, 363, textureX, textureY); // Section lower folding part UR
		bodyModel[540] = new ModelRendererTurbo(this, 413, 363, textureX, textureY); // Section lower folding part UF
		bodyModel[541] = new ModelRendererTurbo(this, 413, 372, textureX, textureY); // Section lower folding part LF
		bodyModel[542] = new ModelRendererTurbo(this, 326, 387, textureX, textureY); // Section upper rotating part L
		bodyModel[543] = new ModelRendererTurbo(this, 330, 395, textureX, textureY); // Section upper rotating part L
		bodyModel[544] = new ModelRendererTurbo(this, 369, 378, textureX, textureY); // Box 128
		bodyModel[545] = new ModelRendererTurbo(this, 368, 361, textureX, textureY); // Box 128
		bodyModel[546] = new ModelRendererTurbo(this, 368, 369, textureX, textureY); // Box 128
		bodyModel[547] = new ModelRendererTurbo(this, 368, 357, textureX, textureY); // Box 128
		bodyModel[548] = new ModelRendererTurbo(this, 386, 387, textureX, textureY); // Section upper rotating part L
		bodyModel[549] = new ModelRendererTurbo(this, 390, 395, textureX, textureY); // Section upper rotating part L
		bodyModel[550] = new ModelRendererTurbo(this, 326, 379, textureX, textureY); // Section lower mattress L
		bodyModel[551] = new ModelRendererTurbo(this, 386, 379, textureX, textureY); // Section lower mattress L
		bodyModel[552] = new ModelRendererTurbo(this, 369, 438, textureX, textureY); // Box 687
		bodyModel[553] = new ModelRendererTurbo(this, 368, 421, textureX, textureY); // Box 688
		bodyModel[554] = new ModelRendererTurbo(this, 368, 429, textureX, textureY); // Box 689
		bodyModel[555] = new ModelRendererTurbo(this, 368, 417, textureX, textureY); // Box 690
		bodyModel[556] = new ModelRendererTurbo(this, 313, 449, textureX, textureY); // Box 691
		bodyModel[557] = new ModelRendererTurbo(this, 314, 441, textureX, textureY); // Box 692
		bodyModel[558] = new ModelRendererTurbo(this, 364, 456, textureX, textureY); // Box 693
		bodyModel[559] = new ModelRendererTurbo(this, 369, 441, textureX, textureY); // Box 694
		bodyModel[560] = new ModelRendererTurbo(this, 351, 440, textureX, textureY); // Section low sliding part F
		bodyModel[561] = new ModelRendererTurbo(this, 313, 440, textureX, textureY); // Section lower sliding part R
		bodyModel[562] = new ModelRendererTurbo(this, 364, 449, textureX, textureY); // Box 697
		bodyModel[563] = new ModelRendererTurbo(this, 317, 456, textureX, textureY); // Box 698
		bodyModel[564] = new ModelRendererTurbo(this, 364, 456, textureX, textureY); // Box 699
		bodyModel[565] = new ModelRendererTurbo(this, 374, 456, textureX, textureY); // Box 700
		bodyModel[566] = new ModelRendererTurbo(this, 315, 431, textureX, textureY); // Section lower folding part LR
		bodyModel[567] = new ModelRendererTurbo(this, 315, 422, textureX, textureY); // Section lower folding part UR
		bodyModel[568] = new ModelRendererTurbo(this, 364, 441, textureX, textureY); // Box 703
		bodyModel[569] = new ModelRendererTurbo(this, 353, 422, textureX, textureY); // Section lower folding part UF
		bodyModel[570] = new ModelRendererTurbo(this, 353, 431, textureX, textureY); // Section lower folding part LF
		bodyModel[571] = new ModelRendererTurbo(this, 421, 449, textureX, textureY); // Box 706
		bodyModel[572] = new ModelRendererTurbo(this, 421, 456, textureX, textureY); // Box 707
		bodyModel[573] = new ModelRendererTurbo(this, 374, 441, textureX, textureY); // Box 708
		bodyModel[574] = new ModelRendererTurbo(this, 424, 441, textureX, textureY); // Box 709
		bodyModel[575] = new ModelRendererTurbo(this, 411, 440, textureX, textureY); // Section low sliding part F
		bodyModel[576] = new ModelRendererTurbo(this, 373, 440, textureX, textureY); // Section lower sliding part R
		bodyModel[577] = new ModelRendererTurbo(this, 375, 431, textureX, textureY); // Section lower folding part LR
		bodyModel[578] = new ModelRendererTurbo(this, 375, 422, textureX, textureY); // Section lower folding part UR
		bodyModel[579] = new ModelRendererTurbo(this, 413, 422, textureX, textureY); // Section lower folding part UF
		bodyModel[580] = new ModelRendererTurbo(this, 413, 431, textureX, textureY); // Section lower folding part LF
		bodyModel[581] = new ModelRendererTurbo(this, 327, 353, textureX, textureY); // Section curtain rotating part L
		bodyModel[582] = new ModelRendererTurbo(this, 332, 359, textureX, textureY); // Section curtain part LU
		bodyModel[583] = new ModelRendererTurbo(this, 332, 367, textureX, textureY); // Section curtain part LM
		bodyModel[584] = new ModelRendererTurbo(this, 332, 373, textureX, textureY); // Section curtain part LL
		bodyModel[585] = new ModelRendererTurbo(this, 387, 353, textureX, textureY); // Section curtain rotating part L
		bodyModel[586] = new ModelRendererTurbo(this, 392, 359, textureX, textureY); // Section curtain part LU
		bodyModel[587] = new ModelRendererTurbo(this, 392, 367, textureX, textureY); // Section curtain part LM
		bodyModel[588] = new ModelRendererTurbo(this, 392, 373, textureX, textureY); // Section curtain part LL
		bodyModel[589] = new ModelRendererTurbo(this, 326, 438, textureX, textureY); // Section lower mattress R
		bodyModel[590] = new ModelRendererTurbo(this, 327, 412, textureX, textureY); // Section curtain rotating part R
		bodyModel[591] = new ModelRendererTurbo(this, 332, 418, textureX, textureY); // Section curtain part RU
		bodyModel[592] = new ModelRendererTurbo(this, 332, 426, textureX, textureY); // Section curtain part RM
		bodyModel[593] = new ModelRendererTurbo(this, 332, 432, textureX, textureY); // Section curtain part RL
		bodyModel[594] = new ModelRendererTurbo(this, 386, 438, textureX, textureY); // Section lower mattress R
		bodyModel[595] = new ModelRendererTurbo(this, 387, 412, textureX, textureY); // Section curtain rotating part R
		bodyModel[596] = new ModelRendererTurbo(this, 392, 418, textureX, textureY); // Section curtain part RU
		bodyModel[597] = new ModelRendererTurbo(this, 392, 426, textureX, textureY); // Section curtain part RM
		bodyModel[598] = new ModelRendererTurbo(this, 392, 432, textureX, textureY); // Section curtain part RL
		bodyModel[599] = new ModelRendererTurbo(this, 330, 454, textureX, textureY); // Section upper rotating part R
		bodyModel[600] = new ModelRendererTurbo(this, 326, 446, textureX, textureY); // Section upper rotating part R
		bodyModel[601] = new ModelRendererTurbo(this, 390, 454, textureX, textureY); // Section upper rotating part R
		bodyModel[602] = new ModelRendererTurbo(this, 386, 446, textureX, textureY); // Section upper rotating part R
		bodyModel[603] = new ModelRendererTurbo(this, 322, 405, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[604] = new ModelRendererTurbo(this, 322, 407, textureX, textureY,"lamp"); // Box 744 glow
		bodyModel[605] = new ModelRendererTurbo(this, 18, 306, textureX, textureY); // Box 38
		bodyModel[606] = new ModelRendererTurbo(this, 21, 311, textureX, textureY); // Box 38
		bodyModel[607] = new ModelRendererTurbo(this, 20, 315, textureX, textureY); // Box 38
		bodyModel[608] = new ModelRendererTurbo(this, 197, 171, textureX, textureY); // Box 668
		bodyModel[609] = new ModelRendererTurbo(this, 132, 185, textureX, textureY); // Box 2
		bodyModel[610] = new ModelRendererTurbo(this, 272, 7, textureX, textureY); // Box 116
		bodyModel[611] = new ModelRendererTurbo(this, 266, 2, textureX, textureY); // Box 169
		bodyModel[612] = new ModelRendererTurbo(this, 277, 2, textureX, textureY); // Box 169
		bodyModel[613] = new ModelRendererTurbo(this, 323, 29, textureX, textureY); // Box 116
		bodyModel[614] = new ModelRendererTurbo(this, 331, 31, textureX, textureY); // Box 116
		bodyModel[615] = new ModelRendererTurbo(this, 323, 24, textureX, textureY); // Box 169
		bodyModel[616] = new ModelRendererTurbo(this, 331, 26, textureX, textureY); // Box 169

		bodyModel[500].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[500].setRotationPoint(-16F, -5F, 7F);
		bodyModel[500].rotateAngleY = -3.14159265F;

		bodyModel[501].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[501].setRotationPoint(-16F, -3F, 7F);
		bodyModel[501].rotateAngleY = -3.14159265F;

		bodyModel[502].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[502].setRotationPoint(-16F, -4F, 7F);
		bodyModel[502].rotateAngleY = -3.14159265F;

		bodyModel[503].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[503].setRotationPoint(-16F, -7F, -7F);
		bodyModel[503].rotateAngleY = -3.14159265F;

		bodyModel[504].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Boc 42
		bodyModel[504].setRotationPoint(-17.5F, -1F, -8F);

		bodyModel[505].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[505].setRotationPoint(-16F, -3F, -7F);
		bodyModel[505].rotateAngleY = -3.14159265F;

		bodyModel[506].addShapeBox(1F, 0F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[506].setRotationPoint(-16F, -5F, -7F);
		bodyModel[506].rotateAngleY = -3.14159265F;

		bodyModel[507].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[507].setRotationPoint(-16F, -3F, -7F);
		bodyModel[507].rotateAngleY = -3.14159265F;

		bodyModel[508].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[508].setRotationPoint(-16F, -5F, -7F);
		bodyModel[508].rotateAngleY = -3.14159265F;

		bodyModel[509].addShapeBox(1F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[509].setRotationPoint(-16F, -5F, -7F);
		bodyModel[509].rotateAngleY = -3.14159265F;

		bodyModel[510].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[510].setRotationPoint(-16F, -3F, -7F);
		bodyModel[510].rotateAngleY = -3.14159265F;

		bodyModel[511].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[511].setRotationPoint(-16F, -5F, -7F);
		bodyModel[511].rotateAngleY = -3.14159265F;

		bodyModel[512].addShapeBox(-2.5F, 0F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[512].setRotationPoint(-16F, -4F, -7F);
		bodyModel[512].rotateAngleY = -3.14159265F;

		bodyModel[513].addShapeBox(-2.5F, 0F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[513].setRotationPoint(-16F, -4F, -7F);
		bodyModel[513].rotateAngleY = -3.14159265F;

		bodyModel[514].addShapeBox(0.5F, 0F, 1F, 0, 1, 4, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 236 dorm door curtain
		bodyModel[514].setRotationPoint(-24.5F, -12F, -3F);
		bodyModel[514].rotateAngleY = 1.48352986F;

		bodyModel[515].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[515].setRotationPoint(-27F, -5F, -4F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 128
		bodyModel[516].setRotationPoint(-25.5F, -7.5F, -4F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[517].setRotationPoint(-34.5F, -7.5F, -10F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[518].setRotationPoint(-34.5F, -7.5F, -4F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Section low sliding part F
		bodyModel[519].setRotationPoint(-33.5F, -3F, -10F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Section lower sliding part R
		bodyModel[520].setRotationPoint(-27.5F, -3F, -10F);

		bodyModel[521].addBox(0F, 0F, 0F, 6, 5, 1, 0F); // Box 128
		bodyModel[521].setRotationPoint(-37F, -5F, -4F);

		bodyModel[522].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128
		bodyModel[522].setRotationPoint(-27F, 0F, -4F);

		bodyModel[523].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128
		bodyModel[523].setRotationPoint(-32F, 0F, -4F);

		bodyModel[524].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128
		bodyModel[524].setRotationPoint(-37F, 0F, -4F);

		bodyModel[525].addShapeBox(-1F, -2F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Section lower folding part LR
		bodyModel[525].setRotationPoint(-24.5F, -3F, -10F);

		bodyModel[526].addShapeBox(-0.25F, -0.25F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Section lower folding part UR
		bodyModel[526].setRotationPoint(-24.75F, -6.75F, -10F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[527].setRotationPoint(-24.51F, -7.5F, -10F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[528].setRotationPoint(-33.5F, -7.5F, -4F);

		bodyModel[529].addShapeBox(-0.25F, -0.25F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Section lower folding part UF
		bodyModel[529].setRotationPoint(-33.25F, -6.75F, -10F);

		bodyModel[530].addShapeBox(0F, -2F, 0F, 1, 2, 6, 0F,-0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Section lower folding part LF
		bodyModel[530].setRotationPoint(-33.5F, -3F, -10F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[531].setRotationPoint(-43.5F, -5F, -4F);

		bodyModel[532].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128
		bodyModel[532].setRotationPoint(-42F, 0F, -4F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 128
		bodyModel[533].setRotationPoint(-35.5F, -7.5F, -4F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[534].setRotationPoint(-43.5F, -7.5F, -4F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[535].setRotationPoint(-43.49F, -7.5F, -10F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Section low sliding part F
		bodyModel[536].setRotationPoint(-43.5F, -3F, -10F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Section lower sliding part R
		bodyModel[537].setRotationPoint(-37.5F, -3F, -10F);

		bodyModel[538].addShapeBox(-1F, -2F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Section lower folding part LR
		bodyModel[538].setRotationPoint(-34.5F, -3F, -10F);

		bodyModel[539].addShapeBox(-0.25F, -0.25F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Section lower folding part UR
		bodyModel[539].setRotationPoint(-34.75F, -6.75F, -10F);

		bodyModel[540].addShapeBox(-0.25F, -0.25F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Section lower folding part UF
		bodyModel[540].setRotationPoint(-43.25F, -6.75F, -10F);

		bodyModel[541].addShapeBox(0F, -2F, 0F, 1, 2, 6, 0F,-0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Section lower folding part LF
		bodyModel[541].setRotationPoint(-43.5F, -3F, -10F);

		bodyModel[542].addShapeBox(0F, -0.5F, 1.45F, 9, 1, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.55F, -1.19F, 0F, 1.55F, -1.19F, 0F, 0.26F, 0F, 0F, 0.26F, 0F, 0F, -1.87F, -0.625F, 0F, -1.87F, -0.625F); // Section upper rotating part L
		bodyModel[542].setRotationPoint(-33.5F, -11.86F, -9.26F);
		bodyModel[542].rotateAngleX = 0.88400927F;

		bodyModel[543].addShapeBox(0F, -0.5F, -0.55F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.01F, -0.18F, 0F, 0.01F, -0.18F, 0F, 0.26F, 0F, 0F, 0.26F, 0F); // Section upper rotating part L
		bodyModel[543].setRotationPoint(-33.5F, -11.86F, -9.26F);
		bodyModel[543].rotateAngleX = 0.88400927F;

		bodyModel[544].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F); // Box 128
		bodyModel[544].setRotationPoint(-34.5F, -12.5F, -10F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 128
		bodyModel[545].setRotationPoint(-34.5F, -17.25F, -10F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 128
		bodyModel[546].setRotationPoint(-34.5F, -18F, -7.75F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 128
		bodyModel[547].setRotationPoint(-34.5F, -18F, -10F);

		bodyModel[548].addShapeBox(0F, -0.5F, 1.45F, 9, 1, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.55F, -1.19F, 0F, 1.55F, -1.19F, 0F, 0.26F, 0F, 0F, 0.26F, 0F, 0F, -1.87F, -0.625F, 0F, -1.87F, -0.625F); // Section upper rotating part L
		bodyModel[548].setRotationPoint(-43.5F, -11.86F, -9.26F);
		bodyModel[548].rotateAngleX = 0.88400927F;

		bodyModel[549].addShapeBox(0F, -0.5F, -0.55F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.01F, -0.18F, 0F, 0.01F, -0.18F, 0F, 0.26F, 0F, 0F, 0.26F, 0F); // Section upper rotating part L
		bodyModel[549].setRotationPoint(-43.5F, -11.86F, -9.26F);
		bodyModel[549].rotateAngleX = 0.88400927F;

		bodyModel[550].addShapeBox(0F, -0.25F, 0F, 9, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Section lower mattress L
		bodyModel[550].setRotationPoint(-33.5F, -12.29F, -9.78F);
		bodyModel[550].rotateAngleX = 1.08210414F;

		bodyModel[551].addShapeBox(0F, -0.25F, 0F, 9, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Section lower mattress L
		bodyModel[551].setRotationPoint(-43.5F, -12.29F, -9.78F);
		bodyModel[551].rotateAngleX = 1.08210414F;

		bodyModel[552].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 687
		bodyModel[552].setRotationPoint(-34.5F, -12.5F, 9F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 688
		bodyModel[553].setRotationPoint(-34.5F, -17.25F, 8F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 689
		bodyModel[554].setRotationPoint(-34.5F, -18F, 5.75F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 690
		bodyModel[555].setRotationPoint(-34.5F, -18F, 8F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 691
		bodyModel[556].setRotationPoint(-27F, -5F, 3F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 692
		bodyModel[557].setRotationPoint(-25.5F, -7.5F, 3F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 693
		bodyModel[558].setRotationPoint(-34.5F, -7.5F, 4F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 694
		bodyModel[559].setRotationPoint(-34.5F, -7.5F, 3F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Section low sliding part F
		bodyModel[560].setRotationPoint(-33.5F, -3F, 4F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Section lower sliding part R
		bodyModel[561].setRotationPoint(-27.5F, -3F, 4F);

		bodyModel[562].addBox(0F, 0F, 0F, 6, 5, 1, 0F); // Box 697
		bodyModel[562].setRotationPoint(-37F, -5F, 3F);

		bodyModel[563].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 698
		bodyModel[563].setRotationPoint(-27F, 0F, 3F);

		bodyModel[564].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 699
		bodyModel[564].setRotationPoint(-32F, 0F, 3F);

		bodyModel[565].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 700
		bodyModel[565].setRotationPoint(-37F, 0F, 3F);

		bodyModel[566].addShapeBox(-1F, -2F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Section lower folding part LR
		bodyModel[566].setRotationPoint(-24.5F, -3F, 4F);

		bodyModel[567].addShapeBox(-0.25F, -0.25F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Section lower folding part UR
		bodyModel[567].setRotationPoint(-24.75F, -6.75F, 4F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 703
		bodyModel[568].setRotationPoint(-33.5F, -7.5F, 3F);

		bodyModel[569].addShapeBox(-0.25F, -0.25F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Section lower folding part UF
		bodyModel[569].setRotationPoint(-33.25F, -6.75F, 4F);

		bodyModel[570].addShapeBox(0F, -2F, 0F, 1, 2, 6, 0F,-0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Section lower folding part LF
		bodyModel[570].setRotationPoint(-33.5F, -3F, 4F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 706
		bodyModel[571].setRotationPoint(-43.5F, -5F, 3F);

		bodyModel[572].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 707
		bodyModel[572].setRotationPoint(-42F, 0F, 3F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 708
		bodyModel[573].setRotationPoint(-35.5F, -7.5F, 3F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 709
		bodyModel[574].setRotationPoint(-43.5F, -7.5F, 3F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Section low sliding part F
		bodyModel[575].setRotationPoint(-43.5F, -3F, 4F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Section lower sliding part R
		bodyModel[576].setRotationPoint(-37.5F, -3F, 4F);

		bodyModel[577].addShapeBox(-1F, -2F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Section lower folding part LR
		bodyModel[577].setRotationPoint(-34.5F, -3F, 4F);

		bodyModel[578].addShapeBox(-0.25F, -0.25F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Section lower folding part UR
		bodyModel[578].setRotationPoint(-34.75F, -6.75F, 4F);

		bodyModel[579].addShapeBox(-0.25F, -0.25F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Section lower folding part UF
		bodyModel[579].setRotationPoint(-43.25F, -6.75F, 4F);

		bodyModel[580].addShapeBox(0F, -2F, 0F, 1, 2, 6, 0F,-0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Section lower folding part LF
		bodyModel[580].setRotationPoint(-43.5F, -3F, 4F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 9, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Section curtain rotating part L
		bodyModel[581].setRotationPoint(-33.5F, -18F, -7.5F);
		bodyModel[581].rotateAngleX = -2.05948852F;

		bodyModel[582].addShapeBox(0F, 0F, 0F, 9, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Section curtain part LU
		bodyModel[582].setRotationPoint(-33.5F, -18F, -6.25F);
		bodyModel[582].rotateAngleX = -0.52359878F;

		bodyModel[583].addShapeBox(0F, 0F, 0F, 9, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Section curtain part LM
		bodyModel[583].setRotationPoint(-33.5F, -18F, -7.4F);
		bodyModel[583].rotateAngleX = -0.45378561F;

		bodyModel[584].addShapeBox(0F, 0F, 0F, 9, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Section curtain part LL
		bodyModel[584].setRotationPoint(-33.5F, -18F, -7.39F);
		bodyModel[584].rotateAngleX = -0.45378561F;

		bodyModel[585].addShapeBox(0F, 0F, 0F, 9, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Section curtain rotating part L
		bodyModel[585].setRotationPoint(-43.5F, -18F, -7.5F);
		bodyModel[585].rotateAngleX = -2.05948852F;

		bodyModel[586].addShapeBox(0F, 0F, 0F, 9, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Section curtain part LU
		bodyModel[586].setRotationPoint(-43.5F, -18F, -6.25F);
		bodyModel[586].rotateAngleX = -0.52359878F;

		bodyModel[587].addShapeBox(0F, 0F, 0F, 9, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Section curtain part LM
		bodyModel[587].setRotationPoint(-43.5F, -18F, -7.4F);
		bodyModel[587].rotateAngleX = -0.45378561F;

		bodyModel[588].addShapeBox(0F, 0F, 0F, 9, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Section curtain part LL
		bodyModel[588].setRotationPoint(-43.5F, -18F, -7.39F);
		bodyModel[588].rotateAngleX = -0.45378561F;

		bodyModel[589].addShapeBox(0F, -0.25F, -5.75F, 9, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Section lower mattress R
		bodyModel[589].setRotationPoint(-33.5F, -12.29F, 9.78F);
		bodyModel[589].rotateAngleX = -1.08210414F;

		bodyModel[590].addShapeBox(0F, 0F, 0F, 9, 0, 5, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Section curtain rotating part R
		bodyModel[590].setRotationPoint(-33.5F, -18F, 7.5F);
		bodyModel[590].rotateAngleX = -1.08210414F;

		bodyModel[591].addShapeBox(0F, 0F, 0F, 9, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Section curtain part RU
		bodyModel[591].setRotationPoint(-33.5F, -18F, 6.25F);
		bodyModel[591].rotateAngleX = 0.52359878F;

		bodyModel[592].addShapeBox(0F, 0F, 0F, 9, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Section curtain part RM
		bodyModel[592].setRotationPoint(-33.5F, -18F, 7.4F);
		bodyModel[592].rotateAngleX = 0.45378561F;

		bodyModel[593].addShapeBox(0F, 0F, 0F, 9, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Section curtain part RL
		bodyModel[593].setRotationPoint(-33.5F, -18F, 7.39F);
		bodyModel[593].rotateAngleX = 0.45378561F;

		bodyModel[594].addShapeBox(0F, -0.25F, -5.75F, 9, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Section lower mattress R
		bodyModel[594].setRotationPoint(-43.5F, -12.29F, 9.78F);
		bodyModel[594].rotateAngleX = -1.08210414F;

		bodyModel[595].addShapeBox(0F, 0F, 0F, 9, 0, 5, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Section curtain rotating part R
		bodyModel[595].setRotationPoint(-43.5F, -18F, 7.5F);
		bodyModel[595].rotateAngleX = -1.08210414F;

		bodyModel[596].addShapeBox(0F, 0F, 0F, 9, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Section curtain part RU
		bodyModel[596].setRotationPoint(-43.5F, -18F, 6.25F);
		bodyModel[596].rotateAngleX = 0.52359878F;

		bodyModel[597].addShapeBox(0F, 0F, 0F, 9, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Section curtain part RM
		bodyModel[597].setRotationPoint(-43.5F, -18F, 7.4F);
		bodyModel[597].rotateAngleX = 0.45378561F;

		bodyModel[598].addShapeBox(0F, 0F, 0F, 9, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Section curtain part RL
		bodyModel[598].setRotationPoint(-43.5F, -18F, 7.39F);
		bodyModel[598].rotateAngleX = 0.45378561F;

		bodyModel[599].addShapeBox(0F, -0.5F, -1.45F, 9, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.26F, 0F, 0F, 0.26F, 0F, 0F, 0.01F, -0.18F, 0F, 0.01F, -0.18F); // Section upper rotating part R
		bodyModel[599].setRotationPoint(-33.5F, -11.86F, 9.26F);
		bodyModel[599].rotateAngleX = -0.88400927F;

		bodyModel[600].addShapeBox(0F, -0.5F, -7.45F, 9, 1, 6, 0F,0F, 1.55F, -1.19F, 0F, 1.55F, -1.19F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.87F, -0.625F, 0F, -1.87F, -0.625F, 0F, 0.26F, 0F, 0F, 0.26F, 0F); // Section upper rotating part R
		bodyModel[600].setRotationPoint(-33.5F, -11.86F, 9.26F);
		bodyModel[600].rotateAngleX = -0.88400927F;

		bodyModel[601].addShapeBox(0F, -0.5F, -1.45F, 9, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.26F, 0F, 0F, 0.26F, 0F, 0F, 0.01F, -0.18F, 0F, 0.01F, -0.18F); // Section upper rotating part R
		bodyModel[601].setRotationPoint(-43.5F, -11.86F, 9.26F);
		bodyModel[601].rotateAngleX = -0.88400927F;

		bodyModel[602].addShapeBox(0F, -0.5F, -7.45F, 9, 1, 6, 0F,0F, 1.55F, -1.19F, 0F, 1.55F, -1.19F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.87F, -0.625F, 0F, -1.87F, -0.625F, 0F, 0.26F, 0F, 0F, 0.26F, 0F); // Section upper rotating part R
		bodyModel[602].setRotationPoint(-43.5F, -11.86F, 9.26F);
		bodyModel[602].rotateAngleX = -0.88400927F;

		bodyModel[603].addShapeBox(0F, 0F, 0F, 19, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[603].setRotationPoint(-43.5F, -10.5F, -9.99F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 19, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 744 glow
		bodyModel[604].setRotationPoint(-43.5F, -10.5F, 9.99F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[605].setRotationPoint(50.75F, -2F, 7F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[606].setRotationPoint(51.5F, -1F, 7.45F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[607].setRotationPoint(51F, 0.5F, 6.95F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 668
		bodyModel[608].setRotationPoint(31.5F, 2F, -10F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[609].setRotationPoint(31.5F, 2F, 10F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.525F, -0.5F, 0F, 0.525F, -0.5F); // Box 116
		bodyModel[610].setRotationPoint(0F, -20.09F, 5F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.375F, -0.65F, 0F, -0.375F, -0.65F, 0F, 0.525F, -0.5F, -0.5F, 0.525F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[611].setRotationPoint(-23F, -20.09F, -8F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.375F, -0.65F, 0F, -0.375F, -0.65F, 0F, 0.525F, -0.5F, -0.5F, 0.525F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[612].setRotationPoint(-31F, -20.09F, -8F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.525F, -0.5F, 0F, 0.525F, -0.5F); // Box 116
		bodyModel[613].setRotationPoint(51F, -20.09F, 5F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.525F, -0.5F, 0F, 0.525F, -0.5F); // Box 116
		bodyModel[614].setRotationPoint(-52.5F, -20.09F, 5F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.375F, -0.65F, 0F, -0.375F, -0.65F, 0F, 0.525F, -0.5F, -0.5F, 0.525F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[615].setRotationPoint(51F, -20.09F, -8F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.375F, -0.65F, 0F, -0.375F, -0.65F, 0F, 0.525F, -0.5F, -0.5F, 0.525F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[616].setRotationPoint(-52F, -20.09F, -8F);
	}
	ModelMILW_1934_1935_1936_Truck bogie1 = new ModelMILW_1934_1935_1936_Truck();
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
		} else if(GetColor(entity)==7
				|| GetColor(entity)==8){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_1935_truck_PGE_silver_generator.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(0, 0, 1, 0);
			GL11.glTranslated(-2.655, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/MILW_1935_truck_PGE_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.655, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if(GetColor(entity)==5
				|| GetColor(entity)==6){
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
		} else if(GetColor(entity)==2
		|| GetColor(entity)==3
		|| GetColor(entity)==4) {
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