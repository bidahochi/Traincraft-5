//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck;
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

public class ModelACF_LN_KCS60SeatDividedCoach extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelACF_LN_KCS60SeatDividedCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[585];

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
		bodyModel[3] = new ModelRendererTurbo(this, 272, 148, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 272, 151, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 265, 148, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 265, 151, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 253, 148, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 253, 151, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 80, 151, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 80, 148, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 244, 151, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 272, 141, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 265, 138, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 265, 141, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 253, 138, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 253, 141, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 71, 141, textureX, textureY,"cull"); // Box 30 cull
		bodyModel[26] = new ModelRendererTurbo(this, 71, 138, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[27] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 244, 141, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 258, 148, textureX, textureY); // Box 2
		bodyModel[36] = new ModelRendererTurbo(this, 258, 138, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 347, 117, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 89, 165, textureX, textureY); // Box 2
		bodyModel[43] = new ModelRendererTurbo(this, 89, 173, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 96, 182, textureX, textureY); // Box 41
		bodyModel[45] = new ModelRendererTurbo(this, 97, 179, textureX, textureY,"cull"); // Box 41 cull
		bodyModel[46] = new ModelRendererTurbo(this, 187, 165, textureX, textureY); // Box 41
		bodyModel[47] = new ModelRendererTurbo(this, 190, 161, textureX, textureY); // Box 41
		bodyModel[48] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[49] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[50] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[51] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[56] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[57] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[63] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[64] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[65] = new ModelRendererTurbo(this, 434, 23, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 434, 35, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 410, 2, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[69] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 128
		bodyModel[70] = new ModelRendererTurbo(this, 424, 1, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 445, 35, textureX, textureY); // Box 128
		bodyModel[72] = new ModelRendererTurbo(this, 445, 23, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 20, 43, textureX, textureY); // Box 128
		bodyModel[74] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[75] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[85] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[86] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 30, 8, textureX, textureY); // Box 128
		bodyModel[88] = new ModelRendererTurbo(this, 72, 218, textureX, textureY); // Box 128
		bodyModel[89] = new ModelRendererTurbo(this, 18, 8, textureX, textureY); // Box 176
		bodyModel[90] = new ModelRendererTurbo(this, 72, 196, textureX, textureY); // Box 177
		bodyModel[91] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[93] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[94] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[95] = new ModelRendererTurbo(this, 438, 1, textureX, textureY); // Box 128
		bodyModel[96] = new ModelRendererTurbo(this, 492, 24, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 460, 24, textureX, textureY); // Box 176
		bodyModel[98] = new ModelRendererTurbo(this, 459, 10, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 52, 3, textureX, textureY); // Box 128
		bodyModel[100] = new ModelRendererTurbo(this, 72, 202, textureX, textureY); // Box 128
		bodyModel[101] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[102] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[103] = new ModelRendererTurbo(this, 59, 84, textureX, textureY); // Box 128
		bodyModel[104] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[105] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[106] = new ModelRendererTurbo(this, 59, 103, textureX, textureY); // Box 204
		bodyModel[107] = new ModelRendererTurbo(this, 71, 145, textureX, textureY); // Box 128
		bodyModel[108] = new ModelRendererTurbo(this, 71, 155, textureX, textureY); // Box 205
		bodyModel[109] = new ModelRendererTurbo(this, 73, 159, textureX, textureY); // Box 52
		bodyModel[110] = new ModelRendererTurbo(this, 105, 179, textureX, textureY); // Box 52
		bodyModel[111] = new ModelRendererTurbo(this, 64, 328, textureX, textureY); // Box 38
		bodyModel[112] = new ModelRendererTurbo(this, 64, 366, textureX, textureY); // Box 38
		bodyModel[113] = new ModelRendererTurbo(this, 275, 328, textureX, textureY); // Box 38
		bodyModel[114] = new ModelRendererTurbo(this, 275, 366, textureX, textureY); // Box 38
		bodyModel[115] = new ModelRendererTurbo(this, 1, 174, textureX, textureY); // Box 38
		bodyModel[116] = new ModelRendererTurbo(this, 431, 77, textureX, textureY); // Box 38
		bodyModel[117] = new ModelRendererTurbo(this, 64, 308, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[118] = new ModelRendererTurbo(this, 64, 318, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[119] = new ModelRendererTurbo(this, 69, 324, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[120] = new ModelRendererTurbo(this, 69, 314, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[121] = new ModelRendererTurbo(this, 82, 288, textureX, textureY); // Box 38
		bodyModel[122] = new ModelRendererTurbo(this, 82, 294, textureX, textureY); // Box 462
		bodyModel[123] = new ModelRendererTurbo(this, 132, 303, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[124] = new ModelRendererTurbo(this, 141, 303, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[125] = new ModelRendererTurbo(this, 150, 303, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[126] = new ModelRendererTurbo(this, 159, 303, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[127] = new ModelRendererTurbo(this, 168, 303, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[128] = new ModelRendererTurbo(this, 177, 303, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[129] = new ModelRendererTurbo(this, 186, 303, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[130] = new ModelRendererTurbo(this, 275, 353, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[131] = new ModelRendererTurbo(this, 77, 353, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[132] = new ModelRendererTurbo(this, 364, 362, textureX, textureY); // Box 38
		bodyModel[133] = new ModelRendererTurbo(this, 361, 359, textureX, textureY); // Box 38
		bodyModel[134] = new ModelRendererTurbo(this, 366, 359, textureX, textureY); // Box 38
		bodyModel[135] = new ModelRendererTurbo(this, 368, 340, textureX, textureY); // Box 38
		bodyModel[136] = new ModelRendererTurbo(this, 365, 343, textureX, textureY); // Box 38
		bodyModel[137] = new ModelRendererTurbo(this, 370, 343, textureX, textureY); // Box 38
		bodyModel[138] = new ModelRendererTurbo(this, 351, 358, textureX, textureY); // Box 38
		bodyModel[139] = new ModelRendererTurbo(this, 1, 373, textureX, textureY); // Box 38
		bodyModel[140] = new ModelRendererTurbo(this, 27, 373, textureX, textureY); // Box 38
		bodyModel[141] = new ModelRendererTurbo(this, 14, 357, textureX, textureY); // Box 38
		bodyModel[142] = new ModelRendererTurbo(this, 19, 354, textureX, textureY); // Box 38
		bodyModel[143] = new ModelRendererTurbo(this, 14, 354, textureX, textureY); // Box 38
		bodyModel[144] = new ModelRendererTurbo(this, 14, 316, textureX, textureY); // Box 38
		bodyModel[145] = new ModelRendererTurbo(this, 19, 319, textureX, textureY); // Box 38
		bodyModel[146] = new ModelRendererTurbo(this, 14, 319, textureX, textureY); // Box 38
		bodyModel[147] = new ModelRendererTurbo(this, 26, 325, textureX, textureY); // Box 38
		bodyModel[148] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[149] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[150] = new ModelRendererTurbo(this, 158, 368, textureX, textureY); // Box 128
		bodyModel[151] = new ModelRendererTurbo(this, 359, 367, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[152] = new ModelRendererTurbo(this, 82, 300, textureX, textureY); // Box 38
		bodyModel[153] = new ModelRendererTurbo(this, 448, 49, textureX, textureY); // Box 128
		bodyModel[154] = new ModelRendererTurbo(this, 448, 71, textureX, textureY); // Box 176
		bodyModel[155] = new ModelRendererTurbo(this, 18, 146, textureX, textureY); // Box 128
		bodyModel[156] = new ModelRendererTurbo(this, 18, 168, textureX, textureY); // Box 176
		bodyModel[157] = new ModelRendererTurbo(this, 437, 55, textureX, textureY); // Box 128
		bodyModel[158] = new ModelRendererTurbo(this, 7, 152, textureX, textureY); // Box 128
		bodyModel[159] = new ModelRendererTurbo(this, 331, 92, textureX, textureY); // Right step part
		bodyModel[160] = new ModelRendererTurbo(this, 329, 95, textureX, textureY); // Right step part
		bodyModel[161] = new ModelRendererTurbo(this, 331, 98, textureX, textureY); // Right step part
		bodyModel[162] = new ModelRendererTurbo(this, 331, 102, textureX, textureY); // Right step part
		bodyModel[163] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Right step part
		bodyModel[164] = new ModelRendererTurbo(this, 326, 96, textureX, textureY); // Right step part
		bodyModel[165] = new ModelRendererTurbo(this, 340, 96, textureX, textureY); // Right step part
		bodyModel[166] = new ModelRendererTurbo(this, 326, 98, textureX, textureY); // Right step part
		bodyModel[167] = new ModelRendererTurbo(this, 340, 98, textureX, textureY); // Right step part
		bodyModel[168] = new ModelRendererTurbo(this, 324, 84, textureX, textureY); // Box 1353
		bodyModel[169] = new ModelRendererTurbo(this, 340, 84, textureX, textureY); // Box 1354
		bodyModel[170] = new ModelRendererTurbo(this, 331, 88, textureX, textureY); // Box 1355
		bodyModel[171] = new ModelRendererTurbo(this, 329, 85, textureX, textureY); // Box 1356
		bodyModel[172] = new ModelRendererTurbo(this, 340, 82, textureX, textureY); // Box 1357
		bodyModel[173] = new ModelRendererTurbo(this, 324, 82, textureX, textureY); // Box 1358
		bodyModel[174] = new ModelRendererTurbo(this, 322, 59, textureX, textureY); // Box 26
		bodyModel[175] = new ModelRendererTurbo(this, 338, 59, textureX, textureY); // Box 26
		bodyModel[176] = new ModelRendererTurbo(this, 329, 63, textureX, textureY); // Box 26
		bodyModel[177] = new ModelRendererTurbo(this, 327, 60, textureX, textureY); // Box 26
		bodyModel[178] = new ModelRendererTurbo(this, 338, 57, textureX, textureY); // Box 26
		bodyModel[179] = new ModelRendererTurbo(this, 322, 57, textureX, textureY); // Box 26
		bodyModel[180] = new ModelRendererTurbo(this, 338, 63, textureX, textureY); // Box 26
		bodyModel[181] = new ModelRendererTurbo(this, 322, 63, textureX, textureY); // Box 26
		bodyModel[182] = new ModelRendererTurbo(this, 340, 88, textureX, textureY); // Box 1359
		bodyModel[183] = new ModelRendererTurbo(this, 324, 88, textureX, textureY); // Box 1360
		bodyModel[184] = new ModelRendererTurbo(this, 329, 77, textureX, textureY); // Left step part
		bodyModel[185] = new ModelRendererTurbo(this, 324, 68, textureX, textureY); // Left step part
		bodyModel[186] = new ModelRendererTurbo(this, 329, 67, textureX, textureY); // Left step part
		bodyModel[187] = new ModelRendererTurbo(this, 327, 70, textureX, textureY); // Left step part
		bodyModel[188] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Left step part
		bodyModel[189] = new ModelRendererTurbo(this, 338, 68, textureX, textureY); // Left step part
		bodyModel[190] = new ModelRendererTurbo(this, 327, 80, textureX, textureY); // Left step part
		bodyModel[191] = new ModelRendererTurbo(this, 338, 73, textureX, textureY); // Left step part
		bodyModel[192] = new ModelRendererTurbo(this, 324, 73, textureX, textureY); // Left step part
		bodyModel[193] = new ModelRendererTurbo(this, 338, 71, textureX, textureY); // Left step part
		bodyModel[194] = new ModelRendererTurbo(this, 324, 71, textureX, textureY); // Left step part
		bodyModel[195] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 204
		bodyModel[196] = new ModelRendererTurbo(this, 313, 21, textureX, textureY); // Box 205
		bodyModel[197] = new ModelRendererTurbo(this, 69, 78, textureX, textureY); // Box 128
		bodyModel[198] = new ModelRendererTurbo(this, 69, 97, textureX, textureY); // Box 202
		bodyModel[199] = new ModelRendererTurbo(this, 431, 19, textureX, textureY); // Box 128
		bodyModel[200] = new ModelRendererTurbo(this, 468, 17, textureX, textureY); // Box 153
		bodyModel[201] = new ModelRendererTurbo(this, 17, 42, textureX, textureY); // Box 128
		bodyModel[202] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[203] = new ModelRendererTurbo(this, 72, 156, textureX, textureY); // Box 2
		bodyModel[204] = new ModelRendererTurbo(this, 76, 171, textureX, textureY); // Box 59
		bodyModel[205] = new ModelRendererTurbo(this, 183, 155, textureX, textureY); // Box 52
		bodyModel[206] = new ModelRendererTurbo(this, 326, 93, textureX, textureY); // Right step part
		bodyModel[207] = new ModelRendererTurbo(this, 340, 93, textureX, textureY); // Right step part
		bodyModel[208] = new ModelRendererTurbo(this, 31, 132, textureX, textureY); // Box 2
		bodyModel[209] = new ModelRendererTurbo(this, 309, 132, textureX, textureY); // Box 2
		bodyModel[210] = new ModelRendererTurbo(this, 158, 334, textureX, textureY); // Box 606
		bodyModel[211] = new ModelRendererTurbo(this, 72, 187, textureX, textureY); // Box 193
		bodyModel[212] = new ModelRendererTurbo(this, 74, 192, textureX, textureY); // Box 194
		bodyModel[213] = new ModelRendererTurbo(this, 72, 228, textureX, textureY); // Box 128
		bodyModel[214] = new ModelRendererTurbo(this, 72, 224, textureX, textureY); // Box 128
		bodyModel[215] = new ModelRendererTurbo(this, 82, 306, textureX, textureY); // Box 611
		bodyModel[216] = new ModelRendererTurbo(this, 10, 367, textureX, textureY); // Box 38
		bodyModel[217] = new ModelRendererTurbo(this, 1, 335, textureX, textureY); // Box 613
		bodyModel[218] = new ModelRendererTurbo(this, 47, 335, textureX, textureY); // Box 614
		bodyModel[219] = new ModelRendererTurbo(this, 10, 329, textureX, textureY); // Box 615
		bodyModel[220] = new ModelRendererTurbo(this, 390, 373, textureX, textureY); // Box 38
		bodyModel[221] = new ModelRendererTurbo(this, 336, 373, textureX, textureY); // Box 38
		bodyModel[222] = new ModelRendererTurbo(this, 373, 367, textureX, textureY); // Box 38
		bodyModel[223] = new ModelRendererTurbo(this, 392, 335, textureX, textureY); // Box 613
		bodyModel[224] = new ModelRendererTurbo(this, 302, 335, textureX, textureY); // Box 614
		bodyModel[225] = new ModelRendererTurbo(this, 375, 329, textureX, textureY); // Box 615
		bodyModel[226] = new ModelRendererTurbo(this, 83, 341, textureX, textureY); // Seat part
		bodyModel[227] = new ModelRendererTurbo(this, 84, 337, textureX, textureY); // Seat part
		bodyModel[228] = new ModelRendererTurbo(this, 84, 354, textureX, textureY); // Seat part
		bodyModel[229] = new ModelRendererTurbo(this, 85, 351, textureX, textureY); // Seat part
		bodyModel[230] = new ModelRendererTurbo(this, 85, 334, textureX, textureY); // Seat part
		bodyModel[231] = new ModelRendererTurbo(this, 92, 331, textureX, textureY); // Seat part
		bodyModel[232] = new ModelRendererTurbo(this, 92, 348, textureX, textureY); // Seat part
		bodyModel[233] = new ModelRendererTurbo(this, 92, 334, textureX, textureY); // Seat part
		bodyModel[234] = new ModelRendererTurbo(this, 92, 351, textureX, textureY); // Seat part
		bodyModel[235] = new ModelRendererTurbo(this, 83, 331, textureX, textureY); // Seat part
		bodyModel[236] = new ModelRendererTurbo(this, 83, 348, textureX, textureY); // Seat part
		bodyModel[237] = new ModelRendererTurbo(this, 83, 375, textureX, textureY); // Seat part
		bodyModel[238] = new ModelRendererTurbo(this, 84, 388, textureX, textureY); // Seat part
		bodyModel[239] = new ModelRendererTurbo(this, 84, 371, textureX, textureY); // Seat part
		bodyModel[240] = new ModelRendererTurbo(this, 92, 382, textureX, textureY); // Seat part
		bodyModel[241] = new ModelRendererTurbo(this, 92, 365, textureX, textureY); // Seat part
		bodyModel[242] = new ModelRendererTurbo(this, 92, 385, textureX, textureY); // Seat part
		bodyModel[243] = new ModelRendererTurbo(this, 92, 368, textureX, textureY); // Seat part
		bodyModel[244] = new ModelRendererTurbo(this, 85, 368, textureX, textureY); // Seat part
		bodyModel[245] = new ModelRendererTurbo(this, 85, 385, textureX, textureY); // Seat part
		bodyModel[246] = new ModelRendererTurbo(this, 83, 382, textureX, textureY); // Seat part
		bodyModel[247] = new ModelRendererTurbo(this, 83, 365, textureX, textureY); // Seat part
		bodyModel[248] = new ModelRendererTurbo(this, 108, 341, textureX, textureY); // Seat part
		bodyModel[249] = new ModelRendererTurbo(this, 109, 337, textureX, textureY); // Seat part
		bodyModel[250] = new ModelRendererTurbo(this, 110, 351, textureX, textureY); // Seat part
		bodyModel[251] = new ModelRendererTurbo(this, 110, 334, textureX, textureY); // Seat part
		bodyModel[252] = new ModelRendererTurbo(this, 117, 331, textureX, textureY); // Seat part
		bodyModel[253] = new ModelRendererTurbo(this, 117, 348, textureX, textureY); // Seat part
		bodyModel[254] = new ModelRendererTurbo(this, 117, 334, textureX, textureY); // Seat part
		bodyModel[255] = new ModelRendererTurbo(this, 117, 351, textureX, textureY); // Seat part
		bodyModel[256] = new ModelRendererTurbo(this, 108, 331, textureX, textureY); // Seat part
		bodyModel[257] = new ModelRendererTurbo(this, 108, 348, textureX, textureY); // Seat part
		bodyModel[258] = new ModelRendererTurbo(this, 108, 375, textureX, textureY); // Seat part
		bodyModel[259] = new ModelRendererTurbo(this, 109, 388, textureX, textureY); // Seat part
		bodyModel[260] = new ModelRendererTurbo(this, 109, 371, textureX, textureY); // Seat part
		bodyModel[261] = new ModelRendererTurbo(this, 117, 382, textureX, textureY); // Seat part
		bodyModel[262] = new ModelRendererTurbo(this, 117, 365, textureX, textureY); // Seat part
		bodyModel[263] = new ModelRendererTurbo(this, 117, 385, textureX, textureY); // Seat part
		bodyModel[264] = new ModelRendererTurbo(this, 117, 368, textureX, textureY); // Seat part
		bodyModel[265] = new ModelRendererTurbo(this, 110, 368, textureX, textureY); // Seat part
		bodyModel[266] = new ModelRendererTurbo(this, 110, 385, textureX, textureY); // Seat part
		bodyModel[267] = new ModelRendererTurbo(this, 108, 382, textureX, textureY); // Seat part
		bodyModel[268] = new ModelRendererTurbo(this, 108, 365, textureX, textureY); // Seat part
		bodyModel[269] = new ModelRendererTurbo(this, 133, 341, textureX, textureY); // Seat part
		bodyModel[270] = new ModelRendererTurbo(this, 134, 337, textureX, textureY); // Seat part
		bodyModel[271] = new ModelRendererTurbo(this, 135, 351, textureX, textureY); // Seat part
		bodyModel[272] = new ModelRendererTurbo(this, 135, 334, textureX, textureY); // Seat part
		bodyModel[273] = new ModelRendererTurbo(this, 142, 331, textureX, textureY); // Seat part
		bodyModel[274] = new ModelRendererTurbo(this, 142, 348, textureX, textureY); // Seat part
		bodyModel[275] = new ModelRendererTurbo(this, 142, 334, textureX, textureY); // Seat part
		bodyModel[276] = new ModelRendererTurbo(this, 142, 351, textureX, textureY); // Seat part
		bodyModel[277] = new ModelRendererTurbo(this, 133, 331, textureX, textureY); // Seat part
		bodyModel[278] = new ModelRendererTurbo(this, 133, 348, textureX, textureY); // Seat part
		bodyModel[279] = new ModelRendererTurbo(this, 133, 375, textureX, textureY); // Seat part
		bodyModel[280] = new ModelRendererTurbo(this, 134, 388, textureX, textureY); // Seat part
		bodyModel[281] = new ModelRendererTurbo(this, 134, 371, textureX, textureY); // Seat part
		bodyModel[282] = new ModelRendererTurbo(this, 142, 382, textureX, textureY); // Seat part
		bodyModel[283] = new ModelRendererTurbo(this, 142, 365, textureX, textureY); // Seat part
		bodyModel[284] = new ModelRendererTurbo(this, 142, 385, textureX, textureY); // Seat part
		bodyModel[285] = new ModelRendererTurbo(this, 142, 368, textureX, textureY); // Seat part
		bodyModel[286] = new ModelRendererTurbo(this, 135, 368, textureX, textureY); // Seat part
		bodyModel[287] = new ModelRendererTurbo(this, 135, 385, textureX, textureY); // Seat part
		bodyModel[288] = new ModelRendererTurbo(this, 133, 382, textureX, textureY); // Seat part
		bodyModel[289] = new ModelRendererTurbo(this, 133, 365, textureX, textureY); // Seat part
		bodyModel[290] = new ModelRendererTurbo(this, 147, 331, textureX, textureY); // Seat part
		bodyModel[291] = new ModelRendererTurbo(this, 147, 365, textureX, textureY); // Seat part
		bodyModel[292] = new ModelRendererTurbo(this, 122, 331, textureX, textureY); // Seat part
		bodyModel[293] = new ModelRendererTurbo(this, 122, 365, textureX, textureY); // Seat part
		bodyModel[294] = new ModelRendererTurbo(this, 97, 365, textureX, textureY); // Seat part
		bodyModel[295] = new ModelRendererTurbo(this, 143, 354, textureX, textureY); // Boc 42
		bodyModel[296] = new ModelRendererTurbo(this, 143, 388, textureX, textureY); // Boc 42
		bodyModel[297] = new ModelRendererTurbo(this, 118, 354, textureX, textureY); // Boc 42
		bodyModel[298] = new ModelRendererTurbo(this, 118, 388, textureX, textureY); // Boc 42
		bodyModel[299] = new ModelRendererTurbo(this, 93, 354, textureX, textureY); // Boc 42
		bodyModel[300] = new ModelRendererTurbo(this, 93, 388, textureX, textureY); // Boc 42
		bodyModel[301] = new ModelRendererTurbo(this, 97, 331, textureX, textureY); // Seat part
		bodyModel[302] = new ModelRendererTurbo(this, 109, 354, textureX, textureY); // Seat part
		bodyModel[303] = new ModelRendererTurbo(this, 134, 354, textureX, textureY); // Seat part
		bodyModel[304] = new ModelRendererTurbo(this, 175, 341, textureX, textureY); // Seat part
		bodyModel[305] = new ModelRendererTurbo(this, 176, 337, textureX, textureY); // Seat part
		bodyModel[306] = new ModelRendererTurbo(this, 177, 351, textureX, textureY); // Seat part
		bodyModel[307] = new ModelRendererTurbo(this, 177, 334, textureX, textureY); // Seat part
		bodyModel[308] = new ModelRendererTurbo(this, 184, 331, textureX, textureY); // Seat part
		bodyModel[309] = new ModelRendererTurbo(this, 184, 348, textureX, textureY); // Seat part
		bodyModel[310] = new ModelRendererTurbo(this, 184, 334, textureX, textureY); // Seat part
		bodyModel[311] = new ModelRendererTurbo(this, 184, 351, textureX, textureY); // Seat part
		bodyModel[312] = new ModelRendererTurbo(this, 175, 331, textureX, textureY); // Seat part
		bodyModel[313] = new ModelRendererTurbo(this, 175, 348, textureX, textureY); // Seat part
		bodyModel[314] = new ModelRendererTurbo(this, 175, 375, textureX, textureY); // Seat part
		bodyModel[315] = new ModelRendererTurbo(this, 176, 388, textureX, textureY); // Seat part
		bodyModel[316] = new ModelRendererTurbo(this, 176, 371, textureX, textureY); // Seat part
		bodyModel[317] = new ModelRendererTurbo(this, 184, 382, textureX, textureY); // Seat part
		bodyModel[318] = new ModelRendererTurbo(this, 184, 365, textureX, textureY); // Seat part
		bodyModel[319] = new ModelRendererTurbo(this, 184, 368, textureX, textureY); // Seat part
		bodyModel[320] = new ModelRendererTurbo(this, 177, 368, textureX, textureY); // Seat part
		bodyModel[321] = new ModelRendererTurbo(this, 177, 385, textureX, textureY); // Seat part
		bodyModel[322] = new ModelRendererTurbo(this, 175, 382, textureX, textureY); // Seat part
		bodyModel[323] = new ModelRendererTurbo(this, 175, 365, textureX, textureY); // Seat part
		bodyModel[324] = new ModelRendererTurbo(this, 189, 331, textureX, textureY); // Seat part
		bodyModel[325] = new ModelRendererTurbo(this, 189, 365, textureX, textureY); // Seat part
		bodyModel[326] = new ModelRendererTurbo(this, 185, 354, textureX, textureY); // Boc 42
		bodyModel[327] = new ModelRendererTurbo(this, 185, 388, textureX, textureY); // Boc 42
		bodyModel[328] = new ModelRendererTurbo(this, 176, 354, textureX, textureY); // Seat part
		bodyModel[329] = new ModelRendererTurbo(this, 184, 385, textureX, textureY); // Seat part
		bodyModel[330] = new ModelRendererTurbo(this, 200, 341, textureX, textureY); // Seat part
		bodyModel[331] = new ModelRendererTurbo(this, 201, 337, textureX, textureY); // Seat part
		bodyModel[332] = new ModelRendererTurbo(this, 201, 354, textureX, textureY); // Seat part
		bodyModel[333] = new ModelRendererTurbo(this, 202, 351, textureX, textureY); // Seat part
		bodyModel[334] = new ModelRendererTurbo(this, 202, 334, textureX, textureY); // Seat part
		bodyModel[335] = new ModelRendererTurbo(this, 209, 331, textureX, textureY); // Seat part
		bodyModel[336] = new ModelRendererTurbo(this, 209, 348, textureX, textureY); // Seat part
		bodyModel[337] = new ModelRendererTurbo(this, 209, 334, textureX, textureY); // Seat part
		bodyModel[338] = new ModelRendererTurbo(this, 209, 351, textureX, textureY); // Seat part
		bodyModel[339] = new ModelRendererTurbo(this, 200, 331, textureX, textureY); // Seat part
		bodyModel[340] = new ModelRendererTurbo(this, 200, 348, textureX, textureY); // Seat part
		bodyModel[341] = new ModelRendererTurbo(this, 200, 375, textureX, textureY); // Seat part
		bodyModel[342] = new ModelRendererTurbo(this, 201, 388, textureX, textureY); // Seat part
		bodyModel[343] = new ModelRendererTurbo(this, 201, 371, textureX, textureY); // Seat part
		bodyModel[344] = new ModelRendererTurbo(this, 209, 382, textureX, textureY); // Seat part
		bodyModel[345] = new ModelRendererTurbo(this, 209, 365, textureX, textureY); // Seat part
		bodyModel[346] = new ModelRendererTurbo(this, 209, 385, textureX, textureY); // Seat part
		bodyModel[347] = new ModelRendererTurbo(this, 209, 368, textureX, textureY); // Seat part
		bodyModel[348] = new ModelRendererTurbo(this, 202, 368, textureX, textureY); // Seat part
		bodyModel[349] = new ModelRendererTurbo(this, 202, 385, textureX, textureY); // Seat part
		bodyModel[350] = new ModelRendererTurbo(this, 200, 382, textureX, textureY); // Seat part
		bodyModel[351] = new ModelRendererTurbo(this, 200, 365, textureX, textureY); // Seat part
		bodyModel[352] = new ModelRendererTurbo(this, 225, 341, textureX, textureY); // Seat part
		bodyModel[353] = new ModelRendererTurbo(this, 226, 337, textureX, textureY); // Seat part
		bodyModel[354] = new ModelRendererTurbo(this, 227, 351, textureX, textureY); // Seat part
		bodyModel[355] = new ModelRendererTurbo(this, 227, 334, textureX, textureY); // Seat part
		bodyModel[356] = new ModelRendererTurbo(this, 234, 331, textureX, textureY); // Seat part
		bodyModel[357] = new ModelRendererTurbo(this, 234, 348, textureX, textureY); // Seat part
		bodyModel[358] = new ModelRendererTurbo(this, 234, 334, textureX, textureY); // Seat part
		bodyModel[359] = new ModelRendererTurbo(this, 234, 351, textureX, textureY); // Seat part
		bodyModel[360] = new ModelRendererTurbo(this, 225, 331, textureX, textureY); // Seat part
		bodyModel[361] = new ModelRendererTurbo(this, 225, 348, textureX, textureY); // Seat part
		bodyModel[362] = new ModelRendererTurbo(this, 226, 388, textureX, textureY); // Seat part
		bodyModel[363] = new ModelRendererTurbo(this, 234, 382, textureX, textureY); // Seat part
		bodyModel[364] = new ModelRendererTurbo(this, 234, 365, textureX, textureY); // Seat part
		bodyModel[365] = new ModelRendererTurbo(this, 234, 385, textureX, textureY); // Seat part
		bodyModel[366] = new ModelRendererTurbo(this, 234, 368, textureX, textureY); // Seat part
		bodyModel[367] = new ModelRendererTurbo(this, 227, 368, textureX, textureY); // Seat part
		bodyModel[368] = new ModelRendererTurbo(this, 227, 385, textureX, textureY); // Seat part
		bodyModel[369] = new ModelRendererTurbo(this, 225, 382, textureX, textureY); // Seat part
		bodyModel[370] = new ModelRendererTurbo(this, 225, 365, textureX, textureY); // Seat part
		bodyModel[371] = new ModelRendererTurbo(this, 250, 341, textureX, textureY); // Seat part
		bodyModel[372] = new ModelRendererTurbo(this, 251, 337, textureX, textureY); // Seat part
		bodyModel[373] = new ModelRendererTurbo(this, 252, 351, textureX, textureY); // Seat part
		bodyModel[374] = new ModelRendererTurbo(this, 252, 334, textureX, textureY); // Seat part
		bodyModel[375] = new ModelRendererTurbo(this, 259, 331, textureX, textureY); // Seat part
		bodyModel[376] = new ModelRendererTurbo(this, 259, 348, textureX, textureY); // Seat part
		bodyModel[377] = new ModelRendererTurbo(this, 259, 334, textureX, textureY); // Seat part
		bodyModel[378] = new ModelRendererTurbo(this, 259, 351, textureX, textureY); // Seat part
		bodyModel[379] = new ModelRendererTurbo(this, 250, 331, textureX, textureY); // Seat part
		bodyModel[380] = new ModelRendererTurbo(this, 250, 348, textureX, textureY); // Seat part
		bodyModel[381] = new ModelRendererTurbo(this, 250, 375, textureX, textureY); // Seat part
		bodyModel[382] = new ModelRendererTurbo(this, 251, 388, textureX, textureY); // Seat part
		bodyModel[383] = new ModelRendererTurbo(this, 251, 371, textureX, textureY); // Seat part
		bodyModel[384] = new ModelRendererTurbo(this, 259, 382, textureX, textureY); // Seat part
		bodyModel[385] = new ModelRendererTurbo(this, 259, 365, textureX, textureY); // Seat part
		bodyModel[386] = new ModelRendererTurbo(this, 259, 385, textureX, textureY); // Seat part
		bodyModel[387] = new ModelRendererTurbo(this, 259, 368, textureX, textureY); // Seat part
		bodyModel[388] = new ModelRendererTurbo(this, 252, 368, textureX, textureY); // Seat part
		bodyModel[389] = new ModelRendererTurbo(this, 252, 385, textureX, textureY); // Seat part
		bodyModel[390] = new ModelRendererTurbo(this, 250, 382, textureX, textureY); // Seat part
		bodyModel[391] = new ModelRendererTurbo(this, 250, 365, textureX, textureY); // Seat part
		bodyModel[392] = new ModelRendererTurbo(this, 264, 331, textureX, textureY); // Seat part
		bodyModel[393] = new ModelRendererTurbo(this, 264, 365, textureX, textureY); // Seat part
		bodyModel[394] = new ModelRendererTurbo(this, 239, 331, textureX, textureY); // Seat part
		bodyModel[395] = new ModelRendererTurbo(this, 239, 365, textureX, textureY); // Seat part
		bodyModel[396] = new ModelRendererTurbo(this, 214, 365, textureX, textureY); // Seat part
		bodyModel[397] = new ModelRendererTurbo(this, 260, 354, textureX, textureY); // Boc 42
		bodyModel[398] = new ModelRendererTurbo(this, 260, 388, textureX, textureY); // Boc 42
		bodyModel[399] = new ModelRendererTurbo(this, 235, 354, textureX, textureY); // Boc 42
		bodyModel[400] = new ModelRendererTurbo(this, 235, 388, textureX, textureY); // Boc 42
		bodyModel[401] = new ModelRendererTurbo(this, 210, 354, textureX, textureY); // Boc 42
		bodyModel[402] = new ModelRendererTurbo(this, 210, 388, textureX, textureY); // Boc 42
		bodyModel[403] = new ModelRendererTurbo(this, 214, 331, textureX, textureY); // Seat part
		bodyModel[404] = new ModelRendererTurbo(this, 226, 354, textureX, textureY); // Seat part
		bodyModel[405] = new ModelRendererTurbo(this, 251, 354, textureX, textureY); // Seat part
		bodyModel[406] = new ModelRendererTurbo(this, 225, 375, textureX, textureY); // Seat part
		bodyModel[407] = new ModelRendererTurbo(this, 226, 371, textureX, textureY); // Seat part
		bodyModel[408] = new ModelRendererTurbo(this, 363, 260, textureX, textureY); // Box 128
		bodyModel[409] = new ModelRendererTurbo(this, 217, 155, textureX, textureY); // Box 38
		bodyModel[410] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 547
		bodyModel[411] = new ModelRendererTurbo(this, 159, 308, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[412] = new ModelRendererTurbo(this, 159, 318, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[413] = new ModelRendererTurbo(this, 160, 324, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[414] = new ModelRendererTurbo(this, 160, 314, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[415] = new ModelRendererTurbo(this, 27, 335, textureX, textureY); // Box 614
		bodyModel[416] = new ModelRendererTurbo(this, 36, 334, textureX, textureY); // Box 614
		bodyModel[417] = new ModelRendererTurbo(this, 34, 337, textureX, textureY); // Box 614
		bodyModel[418] = new ModelRendererTurbo(this, 366, 373, textureX, textureY); // Box 614
		bodyModel[419] = new ModelRendererTurbo(this, 355, 372, textureX, textureY); // Box 614
		bodyModel[420] = new ModelRendererTurbo(this, 353, 375, textureX, textureY); // Box 614
		bodyModel[421] = new ModelRendererTurbo(this, 338, 362, textureX, textureY); // Box 38
		bodyModel[422] = new ModelRendererTurbo(this, 343, 359, textureX, textureY); // Box 38
		bodyModel[423] = new ModelRendererTurbo(this, 338, 359, textureX, textureY); // Box 38
		bodyModel[424] = new ModelRendererTurbo(this, 346, 340, textureX, textureY); // Box 38
		bodyModel[425] = new ModelRendererTurbo(this, 351, 343, textureX, textureY); // Box 38
		bodyModel[426] = new ModelRendererTurbo(this, 346, 343, textureX, textureY); // Box 38
		bodyModel[427] = new ModelRendererTurbo(this, 36, 357, textureX, textureY); // Box 38
		bodyModel[428] = new ModelRendererTurbo(this, 33, 354, textureX, textureY); // Box 38
		bodyModel[429] = new ModelRendererTurbo(this, 38, 354, textureX, textureY); // Box 38
		bodyModel[430] = new ModelRendererTurbo(this, 38, 316, textureX, textureY); // Box 38
		bodyModel[431] = new ModelRendererTurbo(this, 35, 319, textureX, textureY); // Box 38
		bodyModel[432] = new ModelRendererTurbo(this, 40, 319, textureX, textureY); // Box 38
		bodyModel[433] = new ModelRendererTurbo(this, 329, 354, textureX, textureY); // Box 38
		bodyModel[434] = new ModelRendererTurbo(this, 45, 316, textureX, textureY); // Box 522
		bodyModel[435] = new ModelRendererTurbo(this, 357, 343, textureX, textureY); // Box 523
		bodyModel[436] = new ModelRendererTurbo(this, 25, 354, textureX, textureY); // Box 525
		bodyModel[437] = new ModelRendererTurbo(this, 14, 322, textureX, textureY); // Box 38
		bodyModel[438] = new ModelRendererTurbo(this, 14, 360, textureX, textureY); // Box 38
		bodyModel[439] = new ModelRendererTurbo(this, 346, 346, textureX, textureY); // Box 38
		bodyModel[440] = new ModelRendererTurbo(this, 338, 365, textureX, textureY); // Box 38
		bodyModel[441] = new ModelRendererTurbo(this, 370, 346, textureX, textureY); // Box 38
		bodyModel[442] = new ModelRendererTurbo(this, 352, 361, textureX, textureY); // Box 38
		bodyModel[443] = new ModelRendererTurbo(this, 40, 322, textureX, textureY); // Box 38
		bodyModel[444] = new ModelRendererTurbo(this, 38, 360, textureX, textureY); // Box 38
		bodyModel[445] = new ModelRendererTurbo(this, 26, 357, textureX, textureY); // Box 38
		bodyModel[446] = new ModelRendererTurbo(this, 27, 328, textureX, textureY); // Box 38
		bodyModel[447] = new ModelRendererTurbo(this, 366, 365, textureX, textureY); // Box 38
		bodyModel[448] = new ModelRendererTurbo(this, 358, 346, textureX, textureY); // Box 38
		bodyModel[449] = new ModelRendererTurbo(this, 317, 366, textureX, textureY); // Box 38
		bodyModel[450] = new ModelRendererTurbo(this, 294, 366, textureX, textureY); // Box 38
		bodyModel[451] = new ModelRendererTurbo(this, 25, 320, textureX, textureY); // Box 128
		bodyModel[452] = new ModelRendererTurbo(this, 350, 368, textureX, textureY); // Box 526
		bodyModel[453] = new ModelRendererTurbo(this, 343, 367, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[454] = new ModelRendererTurbo(this, 363, 348, textureX, textureY,"cull"); // Box 528 cull
		bodyModel[455] = new ModelRendererTurbo(this, 351, 348, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[456] = new ModelRendererTurbo(this, 31, 362, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[457] = new ModelRendererTurbo(this, 19, 362, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[458] = new ModelRendererTurbo(this, 33, 324, textureX, textureY,"cull"); // Box 528 cull
		bodyModel[459] = new ModelRendererTurbo(this, 19, 324, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[460] = new ModelRendererTurbo(this, 332, 329, textureX, textureY); // Box 38
		bodyModel[461] = new ModelRendererTurbo(this, 329, 339, textureX, textureY); // Box 38
		bodyModel[462] = new ModelRendererTurbo(this, 329, 345, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[463] = new ModelRendererTurbo(this, 333, 331, textureX, textureY); // Box 38
		bodyModel[464] = new ModelRendererTurbo(this, 56, 357, textureX, textureY); // Box 38
		bodyModel[465] = new ModelRendererTurbo(this, 43, 359, textureX, textureY); // Box 38
		bodyModel[466] = new ModelRendererTurbo(this, 43, 365, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[467] = new ModelRendererTurbo(this, 47, 351, textureX, textureY); // Box 38
		bodyModel[468] = new ModelRendererTurbo(this, 1, 322, textureX, textureY); // Box 38
		bodyModel[469] = new ModelRendererTurbo(this, 4, 327, textureX, textureY); // Box 38
		bodyModel[470] = new ModelRendererTurbo(this, 3, 331, textureX, textureY); // Box 38
		bodyModel[471] = new ModelRendererTurbo(this, 1, 360, textureX, textureY); // Box 38
		bodyModel[472] = new ModelRendererTurbo(this, 4, 365, textureX, textureY); // Box 38
		bodyModel[473] = new ModelRendererTurbo(this, 3, 369, textureX, textureY); // Box 38
		bodyModel[474] = new ModelRendererTurbo(this, 388, 322, textureX, textureY); // Box 38
		bodyModel[475] = new ModelRendererTurbo(this, 391, 327, textureX, textureY); // Box 38
		bodyModel[476] = new ModelRendererTurbo(this, 390, 331, textureX, textureY); // Box 38
		bodyModel[477] = new ModelRendererTurbo(this, 386, 360, textureX, textureY); // Box 38
		bodyModel[478] = new ModelRendererTurbo(this, 389, 365, textureX, textureY); // Box 38
		bodyModel[479] = new ModelRendererTurbo(this, 388, 369, textureX, textureY); // Box 38
		bodyModel[480] = new ModelRendererTurbo(this, 452, 32, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[481] = new ModelRendererTurbo(this, 1, 248, textureX, textureY); // Box 128
		bodyModel[482] = new ModelRendererTurbo(this, 404, 239, textureX, textureY); // Box 128
		bodyModel[483] = new ModelRendererTurbo(this, 75, 264, textureX, textureY); // Box 38
		bodyModel[484] = new ModelRendererTurbo(this, 75, 279, textureX, textureY); // Box 558
		bodyModel[485] = new ModelRendererTurbo(this, 59, 237, textureX, textureY); // Box 38
		bodyModel[486] = new ModelRendererTurbo(this, 72, 233, textureX, textureY); // Box 128
		bodyModel[487] = new ModelRendererTurbo(this, 72, 254, textureX, textureY); // Box 561
		bodyModel[488] = new ModelRendererTurbo(this, 76, 261, textureX, textureY); // Box 38
		bodyModel[489] = new ModelRendererTurbo(this, 76, 276, textureX, textureY); // Box 563
		bodyModel[490] = new ModelRendererTurbo(this, 75, 258, textureX, textureY); // Box 38
		bodyModel[491] = new ModelRendererTurbo(this, 75, 273, textureX, textureY); // Box 565
		bodyModel[492] = new ModelRendererTurbo(this, 268, 2, textureX, textureY); // Box 275
		bodyModel[493] = new ModelRendererTurbo(this, 268, 5, textureX, textureY); // Box 701
		bodyModel[494] = new ModelRendererTurbo(this, 268, 18, textureX, textureY); // Box 549
		bodyModel[495] = new ModelRendererTurbo(this, 268, 21, textureX, textureY); // Box 550
		bodyModel[496] = new ModelRendererTurbo(this, 306, 2, textureX, textureY); // Box 275
		bodyModel[497] = new ModelRendererTurbo(this, 306, 5, textureX, textureY); // Box 701
		bodyModel[498] = new ModelRendererTurbo(this, 306, 18, textureX, textureY); // Box 549
		bodyModel[499] = new ModelRendererTurbo(this, 306, 21, textureX, textureY); // Box 550

		bodyModel[0].addBox(0F, 0F, 0F, 118, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-61.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(60.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(56.5F, 1F, -5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[3].setRotationPoint(60.5F, 3F, 10.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[4].setRotationPoint(60.5F, 4F, 10.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[5].setRotationPoint(55.5F, 3F, 10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[6].setRotationPoint(55.5F, 4F, 10.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[7].setRotationPoint(52.25F, 3F, 10.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[8].setRotationPoint(53F, 4F, 10.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[9].setRotationPoint(-58.5F, 4F, 10.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[10].setRotationPoint(-58.5F, 3F, 10.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[11].setRotationPoint(-53.25F, 3F, 10.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[12].setRotationPoint(-55F, 4F, 10.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[13].setRotationPoint(34.75F, 3F, 10.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[14].setRotationPoint(33F, 4F, 10.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[15].setRotationPoint(-35.75F, 3F, 10.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[16].setRotationPoint(-35F, 4F, 10.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[17].setRotationPoint(-34.5F, 3F, 10.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[18].setRotationPoint(-33.5F, 4F, 10.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[19].setRotationPoint(60.5F, 3F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[20].setRotationPoint(60.5F, 4F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[21].setRotationPoint(55.5F, 3F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[22].setRotationPoint(55.5F, 4F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[23].setRotationPoint(52.25F, 3F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[24].setRotationPoint(53F, 4F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30 cull
		bodyModel[25].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31 cull
		bodyModel[26].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[27].setRotationPoint(-53.25F, 3F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(-55F, 4F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[29].setRotationPoint(34.75F, 3F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[30].setRotationPoint(33F, 4F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[31].setRotationPoint(-35.75F, 3F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(-35F, 4F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[33].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[35].setRotationPoint(53.5F, 3F, 10.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[36].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[37].setRotationPoint(60.5F, 3F, -1.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[38].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[39].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[40].setRotationPoint(43F, 4F, -1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[41].setRotationPoint(-45F, 4F, -1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 20, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[42].setRotationPoint(-22.5F, 4F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[43].setRotationPoint(-22.5F, 6.5F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[44].setRotationPoint(-17.5F, 3.25F, -8.9F);
		bodyModel[44].rotateAngleX = -0.78539816F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 41 cull
		bodyModel[45].setRotationPoint(-17F, 3F, -9.4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[46].setRotationPoint(25.5F, 5F, 0F);
		bodyModel[46].rotateAngleX = -0.78539816F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[47].setRotationPoint(26.5F, 4F, -0.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F); // Left trapdoor
		bodyModel[48].setRotationPoint(56.5F, 1F, -10.99F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right trapdoor
		bodyModel[49].setRotationPoint(56.5F, 1F, 4.99F);

		bodyModel[50].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 38
		bodyModel[50].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 128
		bodyModel[51].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[52].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[53].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[54].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[55].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[56].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[57].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[58].setRotationPoint(55.5F, -15F, -3F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[59].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[60].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[61].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[61].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[62].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[63].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[63].setRotationPoint(55.51F, -14F, 3F);

		bodyModel[64].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[64].setRotationPoint(-60.49F, -14F, -3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[65].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[66].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[67].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[68].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[69].setRotationPoint(63F, -14F, -5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[70].setRotationPoint(63F, -14F, 3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[71].setRotationPoint(63F, 1F, -5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[72].setRotationPoint(63F, -15F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[73].setRotationPoint(-63F, -15F, -4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[74].setRotationPoint(-63F, 1F, -4F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[75].setRotationPoint(-63F, -14F, -4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[76].setRotationPoint(-63F, -14F, 3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[77].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[78].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[79].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[80].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[81].addBox(0F, 0F, 0F, 123, 2, 6, 0F); // Box 128
		bodyModel[81].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[82].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[83].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[84].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[85].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[86].setRotationPoint(-61.5F, -17F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[87].setRotationPoint(-61.5F, -18F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[88].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[89].setRotationPoint(-61.5F, -18F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[90].setRotationPoint(-61.5F, -19F, 3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[91].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[92].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[93].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[94].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[95].setRotationPoint(55.5F, -17F, -7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[96].setRotationPoint(55.5F, -18F, -10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[97].setRotationPoint(55.5F, -18F, 7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[98].setRotationPoint(55.5F, -16.25F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[99].setRotationPoint(-61.5F, -16.25F, -10F);

		bodyModel[100].addBox(0F, 0F, 0F, 123, 1, 14, 0F); // Box 128
		bodyModel[100].setRotationPoint(-61.5F, -18F, -7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[101].setRotationPoint(56F, -6F, -12F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[102].setRotationPoint(61F, -6F, -12F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[103].setRotationPoint(-61.5F, -1.5F, -12F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[104].setRotationPoint(56F, -6F, 11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[105].setRotationPoint(61F, -6F, 11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[106].setRotationPoint(-61.5F, -1.5F, 11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[107].setRotationPoint(-61.5F, 6F, -10.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[108].setRotationPoint(-61.5F, 6F, 10.5F);

		bodyModel[109].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[109].setRotationPoint(-27.5F, 3F, 9F);

		bodyModel[110].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 52
		bodyModel[110].setRotationPoint(-12.5F, 3F, -10F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 38
		bodyModel[111].setRotationPoint(-45.5F, -15F, 2F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 38
		bodyModel[112].setRotationPoint(-45.5F, -15F, -10F);

		bodyModel[113].addBox(0F, 0F, 0F, 5, 16, 8, 0F); // Box 38
		bodyModel[113].setRotationPoint(35.5F, -15F, 2F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 38
		bodyModel[114].setRotationPoint(35.5F, -15F, -10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 16, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[115].setRotationPoint(-60.5F, -16.25F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 20, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[116].setRotationPoint(35.5F, -16.25F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 42, 1, 5, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1.51F, 0F, 0F, -1.51F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1.51F, 0F, 0F, -1.51F); // Box 38 cull
		bodyModel[117].setRotationPoint(-44F, -13F, 6.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 42, 1, 5, 0F,0F, 0F, -0.01F, -6F, 0F, -0.01F, -6F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.01F, -6F, 0F, -0.01F, -6F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 275 cull
		bodyModel[118].setRotationPoint(-44F, -13F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 42, 0, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 275 glow
		bodyModel[119].setRotationPoint(-44F, -11.99F, -9.25F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 42, 0, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 285 glow
		bodyModel[120].setRotationPoint(-44F, -11.99F, 7.25F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 160, 5, 0, 0F,0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[121].setRotationPoint(-44.5F, -11F, -9.9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 160, 5, 0, 0F,0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[122].setRotationPoint(-44.5F, -11F, 9.9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[123].setRotationPoint(-36F, -17F, -0.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[124].setRotationPoint(-25.5F, -17F, -0.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[125].setRotationPoint(-15F, -17F, -0.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[126].setRotationPoint(-3F, -17F, -0.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[127].setRotationPoint(7.5F, -17F, -0.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[128].setRotationPoint(18F, -17F, -0.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[129].setRotationPoint(28.5F, -17F, -0.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[130].setRotationPoint(41.5F, -14.99F, -0.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[131].setRotationPoint(-52F, -14.99F, -0.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[132].setRotationPoint(49.5F, -5F, -10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[133].setRotationPoint(49.5F, -5F, -9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[134].setRotationPoint(50.5F, -5F, -9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[135].setRotationPoint(49.5F, -5F, 9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[136].setRotationPoint(49.5F, -5F, 8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[137].setRotationPoint(50.5F, -5F, 8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[138].setRotationPoint(44.5F, -5F, -4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 38
		bodyModel[139].setRotationPoint(-60.5F, -15F, -4F);

		bodyModel[140].addBox(0F, 0F, 0F, 12, 16, 1, 0F); // Box 38
		bodyModel[140].setRotationPoint(-57.5F, -15F, -3F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[141].setRotationPoint(-56.5F, -5F, -10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[142].setRotationPoint(-55.5F, -5F, -9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[143].setRotationPoint(-56.5F, -5F, -9F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[144].setRotationPoint(-56.5F, -5F, 9F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[145].setRotationPoint(-55.5F, -5F, 8F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[146].setRotationPoint(-56.5F, -5F, 8F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[147].setRotationPoint(-51.5F, -5F, 3F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[148].setRotationPoint(56.5F, -14F, 10.5F);

		bodyModel[149].addShapeBox(0F, 0F, -1F, 5, 15, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[149].setRotationPoint(56.5F, -14F, -10.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[150].setRotationPoint(-8F, -6F, -10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 cull
		bodyModel[151].setRotationPoint(49F, -3F, -9.99F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 80, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[152].setRotationPoint(-44.5F, -17F, -3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 20, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[153].setRotationPoint(35.5F, -18F, -10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 20, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[154].setRotationPoint(35.5F, -18F, 7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 16, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[155].setRotationPoint(-60.5F, -18F, -10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 16, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[156].setRotationPoint(-60.5F, -18F, 7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 20, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[157].setRotationPoint(35.5F, -17F, -7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 16, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[158].setRotationPoint(-60.5F, -17F, -7F);

		bodyModel[159].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[159].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[160].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[160].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[161].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[161].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[162].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[162].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[163].addShapeBox(0F, 2F, 0.5F, 4, 0, 2, 0F,0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[163].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[164].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[164].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[165].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[165].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[166].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[166].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[167].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[167].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[168].setRotationPoint(56.5F, 3F, 4.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[169].setRotationPoint(60.5F, 3F, 4.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[170].setRotationPoint(56.51F, 3F, 7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[171].setRotationPoint(56.51F, 3F, 5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[172].setRotationPoint(60.5F, 3F, 7.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[173].setRotationPoint(56.5F, 3F, 7.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[174].setRotationPoint(56.5F, 3F, -7.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[175].setRotationPoint(60.5F, 3F, -7.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[176].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[177].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[178].setRotationPoint(60.5F, 3F, -10.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[179].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[180].setRotationPoint(60.5F, 4F, -10.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[181].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1359
		bodyModel[182].setRotationPoint(60.5F, 4F, 7.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1360
		bodyModel[183].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[184].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[184].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[185].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[185].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[186].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[186].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[187].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[187].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[188].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[188].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[189].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[189].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[190].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[190].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[191].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[191].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[192].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[192].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[193].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[193].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[194].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[194].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.76F, 0F, -0.5F, -0.76F, 0F, -0.515F, 0F, 0F, -0.515F, 0F); // Box 204
		bodyModel[195].setRotationPoint(57F, -18.86F, -9.22F);
		bodyModel[195].rotateAngleX = -1.04283423F;

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0.13F, -0.79F, 0F, 0.13F, -0.79F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.675F, 0F, -0.65F, -0.675F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 205
		bodyModel[196].setRotationPoint(57F, -17.65F, -10.91F);
		bodyModel[196].rotateAngleX = -0.41887902F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[197].setRotationPoint(-61F, -6F, -12F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[198].setRotationPoint(-61F, -6F, 11F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[199].setRotationPoint(63F, -16.5F, -5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 153
		bodyModel[200].setRotationPoint(63F, -16.5F, 1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[201].setRotationPoint(-63.5F, -16.5F, -5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 153
		bodyModel[202].setRotationPoint(-63.5F, -16.5F, 1F);

		bodyModel[203].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 2
		bodyModel[203].setRotationPoint(-22.5F, 3F, 2F);

		bodyModel[204].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 59
		bodyModel[204].setRotationPoint(-22.5F, 3F, -10F);

		bodyModel[205].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 52
		bodyModel[205].setRotationPoint(31.5F, 3F, 9F);

		bodyModel[206].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[206].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[207].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[207].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[208].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[208].setRotationPoint(-60.5F, 3F, -4F);

		bodyModel[209].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[209].setRotationPoint(56.5F, 3F, -4F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[210].setRotationPoint(-8F, -6F, 3F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 80, 1, 3, 0F,0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[211].setRotationPoint(-44.5F, -16F, 7F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 80, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[212].setRotationPoint(-44.5F, -18F, 6.7F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 80, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F); // Box 128
		bodyModel[213].setRotationPoint(-44.5F, -16F, -10F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 80, 1, 2, 0F,0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[214].setRotationPoint(-44.5F, -18F, -9F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 80, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 611
		bodyModel[215].setRotationPoint(-44.5F, -17F, 2F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[216].setRotationPoint(-57.5F, -15F, -10F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 613
		bodyModel[217].setRotationPoint(-60.5F, -15F, 3F);

		bodyModel[218].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 614
		bodyModel[218].setRotationPoint(-52.5F, -15F, 2F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 615
		bodyModel[219].setRotationPoint(-57.5F, -15F, 3F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 38
		bodyModel[220].setRotationPoint(52.5F, -15F, -4F);

		bodyModel[221].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 38
		bodyModel[221].setRotationPoint(40.5F, -15F, -3F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[222].setRotationPoint(51.5F, -15F, -10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 613
		bodyModel[223].setRotationPoint(52.5F, -15F, 3F);

		bodyModel[224].addBox(0F, 0F, 0F, 12, 16, 1, 0F); // Box 614
		bodyModel[224].setRotationPoint(40.5F, -15F, 2F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 615
		bodyModel[225].setRotationPoint(51.5F, -15F, 3F);

		bodyModel[226].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Seat part
		bodyModel[226].setRotationPoint(-34.5F, -3F, 6F);

		bodyModel[227].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Seat part
		bodyModel[227].setRotationPoint(-34.5F, -3F, 6F);

		bodyModel[228].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Seat part
		bodyModel[228].setRotationPoint(-34.5F, -3F, 6F);

		bodyModel[229].addShapeBox(0.5F, 0F, 2F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[229].setRotationPoint(-34.5F, -4F, 6F);

		bodyModel[230].addShapeBox(0.5F, 0F, -3F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[230].setRotationPoint(-34.5F, -4F, 6F);

		bodyModel[231].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[231].setRotationPoint(-34.5F, -5F, 6F);

		bodyModel[232].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[232].setRotationPoint(-34.5F, -5F, 6F);

		bodyModel[233].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[233].setRotationPoint(-34.5F, -4F, 6F);

		bodyModel[234].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[234].setRotationPoint(-34.5F, -4F, 6F);

		bodyModel[235].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[235].setRotationPoint(-34.5F, -5F, 6F);

		bodyModel[236].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[236].setRotationPoint(-34.5F, -5F, 6F);

		bodyModel[237].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Seat part
		bodyModel[237].setRotationPoint(-34.5F, -3F, -6F);

		bodyModel[238].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Seat part
		bodyModel[238].setRotationPoint(-34.5F, -3F, -6F);

		bodyModel[239].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Seat part
		bodyModel[239].setRotationPoint(-34.5F, -3F, -6F);

		bodyModel[240].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[240].setRotationPoint(-34.5F, -5F, -6F);

		bodyModel[241].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[241].setRotationPoint(-34.5F, -5F, -6F);

		bodyModel[242].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[242].setRotationPoint(-34.5F, -4F, -6F);

		bodyModel[243].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[243].setRotationPoint(-34.5F, -4F, -6F);

		bodyModel[244].addShapeBox(0.5F, 0F, -3F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[244].setRotationPoint(-34.5F, -4F, -6F);

		bodyModel[245].addShapeBox(0.5F, 0F, 2F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[245].setRotationPoint(-34.5F, -4F, -6F);

		bodyModel[246].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[246].setRotationPoint(-34.5F, -5F, -6F);

		bodyModel[247].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[247].setRotationPoint(-34.5F, -5F, -6F);

		bodyModel[248].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Seat part
		bodyModel[248].setRotationPoint(-24F, -3F, 6F);

		bodyModel[249].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Seat part
		bodyModel[249].setRotationPoint(-24F, -3F, 6F);

		bodyModel[250].addShapeBox(0.5F, 0F, 2F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[250].setRotationPoint(-24F, -4F, 6F);

		bodyModel[251].addShapeBox(0.5F, 0F, -3F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[251].setRotationPoint(-24F, -4F, 6F);

		bodyModel[252].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[252].setRotationPoint(-24F, -5F, 6F);

		bodyModel[253].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[253].setRotationPoint(-24F, -5F, 6F);

		bodyModel[254].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[254].setRotationPoint(-24F, -4F, 6F);

		bodyModel[255].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[255].setRotationPoint(-24F, -4F, 6F);

		bodyModel[256].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[256].setRotationPoint(-24F, -5F, 6F);

		bodyModel[257].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[257].setRotationPoint(-24F, -5F, 6F);

		bodyModel[258].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Seat part
		bodyModel[258].setRotationPoint(-24F, -3F, -6F);

		bodyModel[259].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Seat part
		bodyModel[259].setRotationPoint(-24F, -3F, -6F);

		bodyModel[260].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Seat part
		bodyModel[260].setRotationPoint(-24F, -3F, -6F);

		bodyModel[261].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[261].setRotationPoint(-24F, -5F, -6F);

		bodyModel[262].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[262].setRotationPoint(-24F, -5F, -6F);

		bodyModel[263].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[263].setRotationPoint(-24F, -4F, -6F);

		bodyModel[264].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[264].setRotationPoint(-24F, -4F, -6F);

		bodyModel[265].addShapeBox(0.5F, 0F, -3F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[265].setRotationPoint(-24F, -4F, -6F);

		bodyModel[266].addShapeBox(0.5F, 0F, 2F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[266].setRotationPoint(-24F, -4F, -6F);

		bodyModel[267].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[267].setRotationPoint(-24F, -5F, -6F);

		bodyModel[268].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[268].setRotationPoint(-24F, -5F, -6F);

		bodyModel[269].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Seat part
		bodyModel[269].setRotationPoint(-13.5F, -3F, 6F);

		bodyModel[270].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Seat part
		bodyModel[270].setRotationPoint(-13.5F, -3F, 6F);

		bodyModel[271].addShapeBox(0.5F, 0F, 2F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[271].setRotationPoint(-13.5F, -4F, 6F);

		bodyModel[272].addShapeBox(0.5F, 0F, -3F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[272].setRotationPoint(-13.5F, -4F, 6F);

		bodyModel[273].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[273].setRotationPoint(-13.5F, -5F, 6F);

		bodyModel[274].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[274].setRotationPoint(-13.5F, -5F, 6F);

		bodyModel[275].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[275].setRotationPoint(-13.5F, -4F, 6F);

		bodyModel[276].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[276].setRotationPoint(-13.5F, -4F, 6F);

		bodyModel[277].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[277].setRotationPoint(-13.5F, -5F, 6F);

		bodyModel[278].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[278].setRotationPoint(-13.5F, -5F, 6F);

		bodyModel[279].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Seat part
		bodyModel[279].setRotationPoint(-13.5F, -3F, -6F);

		bodyModel[280].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Seat part
		bodyModel[280].setRotationPoint(-13.5F, -3F, -6F);

		bodyModel[281].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Seat part
		bodyModel[281].setRotationPoint(-13.5F, -3F, -6F);

		bodyModel[282].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[282].setRotationPoint(-13.5F, -5F, -6F);

		bodyModel[283].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[283].setRotationPoint(-13.5F, -5F, -6F);

		bodyModel[284].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[284].setRotationPoint(-13.5F, -4F, -6F);

		bodyModel[285].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[285].setRotationPoint(-13.5F, -4F, -6F);

		bodyModel[286].addShapeBox(0.5F, 0F, -3F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[286].setRotationPoint(-13.5F, -4F, -6F);

		bodyModel[287].addShapeBox(0.5F, 0F, 2F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[287].setRotationPoint(-13.5F, -4F, -6F);

		bodyModel[288].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[288].setRotationPoint(-13.5F, -5F, -6F);

		bodyModel[289].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[289].setRotationPoint(-13.5F, -5F, -6F);

		bodyModel[290].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[290].setRotationPoint(-13.5F, -8F, 6F);

		bodyModel[291].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[291].setRotationPoint(-13.5F, -8F, -6F);

		bodyModel[292].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[292].setRotationPoint(-24F, -8F, 6F);

		bodyModel[293].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[293].setRotationPoint(-24F, -8F, -6F);

		bodyModel[294].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[294].setRotationPoint(-34.5F, -8F, -6F);

		bodyModel[295].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[295].setRotationPoint(-15F, -1F, 4F);

		bodyModel[296].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[296].setRotationPoint(-15F, -1F, -8F);

		bodyModel[297].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[297].setRotationPoint(-25.5F, -1F, 4F);

		bodyModel[298].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[298].setRotationPoint(-25.5F, -1F, -8F);

		bodyModel[299].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[299].setRotationPoint(-36F, -1F, 4F);

		bodyModel[300].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[300].setRotationPoint(-36F, -1F, -8F);

		bodyModel[301].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[301].setRotationPoint(-34.5F, -8F, 6F);

		bodyModel[302].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Seat part
		bodyModel[302].setRotationPoint(-24F, -3F, 6F);

		bodyModel[303].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Seat part
		bodyModel[303].setRotationPoint(-13.5F, -3F, 6F);

		bodyModel[304].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Seat part
		bodyModel[304].setRotationPoint(-1.5F, -3F, 6F);

		bodyModel[305].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Seat part
		bodyModel[305].setRotationPoint(-1.5F, -3F, 6F);

		bodyModel[306].addShapeBox(0.5F, 0F, 2F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[306].setRotationPoint(-1.5F, -4F, 6F);

		bodyModel[307].addShapeBox(0.5F, 0F, -3F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[307].setRotationPoint(-1.5F, -4F, 6F);

		bodyModel[308].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[308].setRotationPoint(-1.5F, -5F, 6F);

		bodyModel[309].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[309].setRotationPoint(-1.5F, -5F, 6F);

		bodyModel[310].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[310].setRotationPoint(-1.5F, -4F, 6F);

		bodyModel[311].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[311].setRotationPoint(-1.5F, -4F, 6F);

		bodyModel[312].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[312].setRotationPoint(-1.5F, -5F, 6F);

		bodyModel[313].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[313].setRotationPoint(-1.5F, -5F, 6F);

		bodyModel[314].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Seat part
		bodyModel[314].setRotationPoint(-1.5F, -3F, -6F);

		bodyModel[315].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Seat part
		bodyModel[315].setRotationPoint(-1.5F, -3F, -6F);

		bodyModel[316].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Seat part
		bodyModel[316].setRotationPoint(-1.5F, -3F, -6F);

		bodyModel[317].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[317].setRotationPoint(-1.5F, -5F, -6F);

		bodyModel[318].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[318].setRotationPoint(-1.5F, -5F, -6F);

		bodyModel[319].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[319].setRotationPoint(-1.5F, -4F, -6F);

		bodyModel[320].addShapeBox(0.5F, 0F, -3F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[320].setRotationPoint(-1.5F, -4F, -6F);

		bodyModel[321].addShapeBox(0.5F, 0F, 2F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[321].setRotationPoint(-1.5F, -4F, -6F);

		bodyModel[322].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[322].setRotationPoint(-1.5F, -5F, -6F);

		bodyModel[323].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[323].setRotationPoint(-1.5F, -5F, -6F);

		bodyModel[324].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[324].setRotationPoint(-1.5F, -8F, 6F);

		bodyModel[325].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[325].setRotationPoint(-1.5F, -8F, -6F);

		bodyModel[326].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[326].setRotationPoint(-3F, -1F, 4F);

		bodyModel[327].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[327].setRotationPoint(-3F, -1F, -8F);

		bodyModel[328].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Seat part
		bodyModel[328].setRotationPoint(-2F, -3F, 6F);

		bodyModel[329].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[329].setRotationPoint(-1.5F, -4F, -6F);

		bodyModel[330].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Seat part
		bodyModel[330].setRotationPoint(9F, -3F, 6F);

		bodyModel[331].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Seat part
		bodyModel[331].setRotationPoint(9F, -3F, 6F);

		bodyModel[332].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Seat part
		bodyModel[332].setRotationPoint(9F, -3F, 6F);

		bodyModel[333].addShapeBox(0.5F, 0F, 2F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[333].setRotationPoint(9F, -4F, 6F);

		bodyModel[334].addShapeBox(0.5F, 0F, -3F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[334].setRotationPoint(9F, -4F, 6F);

		bodyModel[335].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[335].setRotationPoint(9F, -5F, 6F);

		bodyModel[336].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[336].setRotationPoint(9F, -5F, 6F);

		bodyModel[337].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[337].setRotationPoint(9F, -4F, 6F);

		bodyModel[338].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[338].setRotationPoint(9F, -4F, 6F);

		bodyModel[339].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[339].setRotationPoint(9F, -5F, 6F);

		bodyModel[340].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[340].setRotationPoint(9F, -5F, 6F);

		bodyModel[341].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Seat part
		bodyModel[341].setRotationPoint(9F, -3F, -6F);

		bodyModel[342].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Seat part
		bodyModel[342].setRotationPoint(9F, -3F, -6F);

		bodyModel[343].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Seat part
		bodyModel[343].setRotationPoint(9F, -3F, -6F);

		bodyModel[344].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[344].setRotationPoint(9F, -5F, -6F);

		bodyModel[345].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[345].setRotationPoint(9F, -5F, -6F);

		bodyModel[346].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[346].setRotationPoint(9F, -4F, -6F);

		bodyModel[347].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[347].setRotationPoint(9F, -4F, -6F);

		bodyModel[348].addShapeBox(0.5F, 0F, -3F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[348].setRotationPoint(9F, -4F, -6F);

		bodyModel[349].addShapeBox(0.5F, 0F, 2F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[349].setRotationPoint(9F, -4F, -6F);

		bodyModel[350].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[350].setRotationPoint(9F, -5F, -6F);

		bodyModel[351].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[351].setRotationPoint(9F, -5F, -6F);

		bodyModel[352].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Seat part
		bodyModel[352].setRotationPoint(19.5F, -3F, 6F);

		bodyModel[353].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Seat part
		bodyModel[353].setRotationPoint(19.5F, -3F, 6F);

		bodyModel[354].addShapeBox(0.5F, 0F, 2F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[354].setRotationPoint(19.5F, -4F, 6F);

		bodyModel[355].addShapeBox(0.5F, 0F, -3F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[355].setRotationPoint(19.5F, -4F, 6F);

		bodyModel[356].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[356].setRotationPoint(19.5F, -5F, 6F);

		bodyModel[357].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[357].setRotationPoint(19.5F, -5F, 6F);

		bodyModel[358].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[358].setRotationPoint(19.5F, -4F, 6F);

		bodyModel[359].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[359].setRotationPoint(19.5F, -4F, 6F);

		bodyModel[360].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[360].setRotationPoint(19.5F, -5F, 6F);

		bodyModel[361].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[361].setRotationPoint(19.5F, -5F, 6F);

		bodyModel[362].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Seat part
		bodyModel[362].setRotationPoint(19.5F, -3F, -6F);

		bodyModel[363].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[363].setRotationPoint(19.5F, -5F, -6F);

		bodyModel[364].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[364].setRotationPoint(19.5F, -5F, -6F);

		bodyModel[365].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[365].setRotationPoint(19.5F, -4F, -6F);

		bodyModel[366].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[366].setRotationPoint(19.5F, -4F, -6F);

		bodyModel[367].addShapeBox(0.5F, 0F, -3F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[367].setRotationPoint(19.5F, -4F, -6F);

		bodyModel[368].addShapeBox(0.5F, 0F, 2F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[368].setRotationPoint(19.5F, -4F, -6F);

		bodyModel[369].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[369].setRotationPoint(19.5F, -5F, -6F);

		bodyModel[370].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[370].setRotationPoint(19.5F, -5F, -6F);

		bodyModel[371].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Seat part
		bodyModel[371].setRotationPoint(30F, -3F, 6F);

		bodyModel[372].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Seat part
		bodyModel[372].setRotationPoint(30F, -3F, 6F);

		bodyModel[373].addShapeBox(0.5F, 0F, 2F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[373].setRotationPoint(30F, -4F, 6F);

		bodyModel[374].addShapeBox(0.5F, 0F, -3F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[374].setRotationPoint(30F, -4F, 6F);

		bodyModel[375].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[375].setRotationPoint(30F, -5F, 6F);

		bodyModel[376].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[376].setRotationPoint(30F, -5F, 6F);

		bodyModel[377].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[377].setRotationPoint(30F, -4F, 6F);

		bodyModel[378].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[378].setRotationPoint(30F, -4F, 6F);

		bodyModel[379].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[379].setRotationPoint(30F, -5F, 6F);

		bodyModel[380].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[380].setRotationPoint(30F, -5F, 6F);

		bodyModel[381].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Seat part
		bodyModel[381].setRotationPoint(30F, -3F, -6F);

		bodyModel[382].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Seat part
		bodyModel[382].setRotationPoint(30F, -3F, -6F);

		bodyModel[383].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Seat part
		bodyModel[383].setRotationPoint(30F, -3F, -6F);

		bodyModel[384].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[384].setRotationPoint(30F, -5F, -6F);

		bodyModel[385].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[385].setRotationPoint(30F, -5F, -6F);

		bodyModel[386].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[386].setRotationPoint(30F, -4F, -6F);

		bodyModel[387].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[387].setRotationPoint(30F, -4F, -6F);

		bodyModel[388].addShapeBox(0.5F, 0F, -3F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[388].setRotationPoint(30F, -4F, -6F);

		bodyModel[389].addShapeBox(0.5F, 0F, 2F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Seat part
		bodyModel[389].setRotationPoint(30F, -4F, -6F);

		bodyModel[390].addShapeBox(-1.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[390].setRotationPoint(30F, -5F, -6F);

		bodyModel[391].addShapeBox(-1.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[391].setRotationPoint(30F, -5F, -6F);

		bodyModel[392].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[392].setRotationPoint(30F, -8F, 6F);

		bodyModel[393].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[393].setRotationPoint(30F, -8F, -6F);

		bodyModel[394].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[394].setRotationPoint(19.5F, -8F, 6F);

		bodyModel[395].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[395].setRotationPoint(19.5F, -8F, -6F);

		bodyModel[396].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[396].setRotationPoint(9F, -8F, -6F);

		bodyModel[397].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[397].setRotationPoint(28.5F, -1F, 4F);

		bodyModel[398].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[398].setRotationPoint(28.5F, -1F, -8F);

		bodyModel[399].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[399].setRotationPoint(18F, -1F, 4F);

		bodyModel[400].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[400].setRotationPoint(18F, -1F, -8F);

		bodyModel[401].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[401].setRotationPoint(7.5F, -1F, 4F);

		bodyModel[402].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[402].setRotationPoint(7.5F, -1F, -8F);

		bodyModel[403].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[403].setRotationPoint(9F, -8F, 6F);

		bodyModel[404].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Seat part
		bodyModel[404].setRotationPoint(19.5F, -3F, 6F);

		bodyModel[405].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Seat part
		bodyModel[405].setRotationPoint(30F, -3F, 6F);

		bodyModel[406].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Seat part
		bodyModel[406].setRotationPoint(19.5F, -3F, -6F);

		bodyModel[407].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Seat part
		bodyModel[407].setRotationPoint(19.5F, -3F, -6F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 0, 18, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -20F, 0F, -9F, -20F); // Box 128
		bodyModel[408].setRotationPoint(-7.5F, -15F, -10F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 128, 4, 1, 0F,0F, 0F, 0F, -64F, 0F, 0F, -64F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -64F, 0F, 0F, -64F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[409].setRotationPoint(-39.5F, -10F, -11F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 128, 4, 1, 0F,0F, 0F, 0F, -64F, 0F, 0F, -64F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -64F, 0F, 0F, -64F, 0F, 0F, 0F, 0F, 0F); // Box 547
		bodyModel[410].setRotationPoint(-39.5F, -10F, 10F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 48, 1, 5, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1.51F, 0F, 0F, -1.51F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1.51F, 0F, 0F, -1.51F); // Box 38 cull
		bodyModel[411].setRotationPoint(-7F, -13F, 6.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 48, 1, 5, 0F,0F, 0F, -0.01F, -6F, 0F, -0.01F, -6F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.01F, -6F, 0F, -0.01F, -6F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 275 cull
		bodyModel[412].setRotationPoint(-7F, -13F, -10F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 48, 0, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 275 glow
		bodyModel[413].setRotationPoint(-7F, -11.99F, -9.25F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 48, 0, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 285 glow
		bodyModel[414].setRotationPoint(-7F, -11.99F, 7.25F);

		bodyModel[415].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 614
		bodyModel[415].setRotationPoint(-57.5F, -15F, 2F);

		bodyModel[416].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 614
		bodyModel[416].setRotationPoint(-55.5F, -15F, 2F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 6, 14, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 614
		bodyModel[417].setRotationPoint(-55.5F, -14F, 2.5F);

		bodyModel[418].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 614
		bodyModel[418].setRotationPoint(50.5F, -15F, -3F);

		bodyModel[419].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 614
		bodyModel[419].setRotationPoint(47.5F, -15F, -3F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 6, 14, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 614
		bodyModel[420].setRotationPoint(47.5F, -14F, -2.5F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[421].setRotationPoint(40.5F, -5F, -10F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[422].setRotationPoint(41.5F, -5F, -9F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[423].setRotationPoint(40.5F, -5F, -9F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[424].setRotationPoint(40.5F, -5F, 9F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[425].setRotationPoint(41.5F, -5F, 8F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[426].setRotationPoint(40.5F, -5F, 8F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[427].setRotationPoint(-47.5F, -5F, -10F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[428].setRotationPoint(-47.5F, -5F, -9F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[429].setRotationPoint(-46.5F, -5F, -9F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[430].setRotationPoint(-47.5F, -5F, 9F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[431].setRotationPoint(-47.5F, -5F, 8F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[432].setRotationPoint(-46.5F, -5F, 8F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[433].setRotationPoint(40.5F, -15F, -5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[434].setRotationPoint(-47.5F, -15F, 3F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[435].setRotationPoint(47.5F, -5F, 3F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[436].setRotationPoint(-54.5F, -5F, -4F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[437].setRotationPoint(-55.53F, -4F, 8.63F);
		bodyModel[437].rotateAngleY = 0.78539816F;

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[438].setRotationPoint(-55.53F, -4F, -9.69F);
		bodyModel[438].rotateAngleY = 0.78539816F;

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[439].setRotationPoint(41.47F, -4F, 8.63F);
		bodyModel[439].rotateAngleY = 0.78539816F;

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[440].setRotationPoint(41.47F, -4F, -9.69F);
		bodyModel[440].rotateAngleY = 0.78539816F;

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[441].setRotationPoint(50.87F, -4F, 8.63F);
		bodyModel[441].rotateAngleY = 0.78539816F;

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[442].setRotationPoint(50.87F, -4F, -9.69F);
		bodyModel[442].rotateAngleY = 0.78539816F;

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[443].setRotationPoint(-46.13F, -4F, 8.63F);
		bodyModel[443].rotateAngleY = 0.78539816F;

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[444].setRotationPoint(-46.13F, -4F, -9.69F);
		bodyModel[444].rotateAngleY = 0.78539816F;

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[445].setRotationPoint(-53.32F, -4F, -4.04F);
		bodyModel[445].rotateAngleY = 0.78539816F;

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[446].setRotationPoint(-50.32F, -4F, 2.96F);
		bodyModel[446].rotateAngleY = 0.78539816F;

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[447].setRotationPoint(45.68F, -4F, -4.04F);
		bodyModel[447].rotateAngleY = 0.78539816F;

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[448].setRotationPoint(48.68F, -4F, 2.96F);
		bodyModel[448].rotateAngleY = 0.78539816F;

		bodyModel[449].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 38
		bodyModel[449].setRotationPoint(39.5F, -15F, -10F);

		bodyModel[450].addBox(0F, 0F, 0F, 3, 10, 8, 0F); // Box 38
		bodyModel[450].setRotationPoint(36.5F, -15F, -10F);

		bodyModel[451].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 128
		bodyModel[451].setRotationPoint(-52F, -3.5F, 8F);

		bodyModel[452].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 526
		bodyModel[452].setRotationPoint(45F, -3.5F, -10F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 cull
		bodyModel[453].setRotationPoint(41.5F, -3F, -9.99F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 528 cull
		bodyModel[454].setRotationPoint(49F, -3F, 8.99F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 529 cull
		bodyModel[455].setRotationPoint(41.5F, -3F, 8.99F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 cull
		bodyModel[456].setRotationPoint(-48F, -3F, -9.99F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 cull
		bodyModel[457].setRotationPoint(-55.5F, -3F, -9.99F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 528 cull
		bodyModel[458].setRotationPoint(-48F, -3F, 8.99F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 529 cull
		bodyModel[459].setRotationPoint(-55.5F, -3F, 8.99F);

		bodyModel[460].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 38
		bodyModel[460].setRotationPoint(40.5F, -6F, 3F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[461].setRotationPoint(41F, -3F, 4F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[462].setRotationPoint(41F, -2F, 4F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[463].setRotationPoint(43F, -6F, 4F);

		bodyModel[464].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 38
		bodyModel[464].setRotationPoint(-46.5F, -6F, -7F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[465].setRotationPoint(-48F, -3F, -6F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[466].setRotationPoint(-48F, -2F, -6F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[467].setRotationPoint(-48F, -6F, -6F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[468].setRotationPoint(-60.6F, -2F, 8.55F);
		bodyModel[468].rotateAngleY = -0.78539816F;

		bodyModel[469].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[469].setRotationPoint(-60.25F, -1F, 8.9F);
		bodyModel[469].rotateAngleY = -0.78539816F;

		bodyModel[470].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[470].setRotationPoint(-60.6F, 0.5F, 8.55F);
		bodyModel[470].rotateAngleY = -0.78539816F;

		bodyModel[471].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[471].setRotationPoint(-59.2F, -2F, -9.95F);
		bodyModel[471].rotateAngleY = 0.78539816F;

		bodyModel[472].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[472].setRotationPoint(-59.55F, -1F, -9.6F);
		bodyModel[472].rotateAngleY = 0.78539816F;

		bodyModel[473].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[473].setRotationPoint(-59.2F, 0.5F, -9.95F);
		bodyModel[473].rotateAngleY = 0.78539816F;

		bodyModel[474].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[474].setRotationPoint(54.2F, -2F, 9.95F);
		bodyModel[474].rotateAngleY = -2.35619449F;

		bodyModel[475].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[475].setRotationPoint(54.55F, -1F, 9.6F);
		bodyModel[475].rotateAngleY = -2.35619449F;

		bodyModel[476].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[476].setRotationPoint(54.2F, 0.5F, 9.95F);
		bodyModel[476].rotateAngleY = -2.35619449F;

		bodyModel[477].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F); // Box 38
		bodyModel[477].setRotationPoint(53.15F, -2F, -8.85F);
		bodyModel[477].rotateAngleY = -0.78539816F;

		bodyModel[478].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[478].setRotationPoint(53.5F, -1F, -8.5F);
		bodyModel[478].rotateAngleY = -0.78539816F;

		bodyModel[479].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[479].setRotationPoint(53.15F, 0.5F, -8.85F);
		bodyModel[479].rotateAngleY = -0.78539816F;

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 0, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[480].setRotationPoint(58F, -14.99F, -8F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 0, 8, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -20F, 0F, -4F, -20F); // Box 128
		bodyModel[481].setRotationPoint(-44.49F, -11F, -10F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 0, 8, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -20F, 0F, -4F, -20F); // Box 128
		bodyModel[482].setRotationPoint(35.49F, -11F, -10F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 160, 8, 0, 0F,0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -80F, -4F, 0F, -80F, -4F, 0F, 0F, -4F, 0F); // Box 38
		bodyModel[483].setRotationPoint(-44.5F, -10F, -9.99F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 160, 8, 0, 0F,0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -80F, -4F, 0F, -80F, -4F, 0F, 0F, -4F, 0F); // Box 558
		bodyModel[484].setRotationPoint(-44.5F, -10F, 9.99F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 160, 0, 16, 0F,0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[485].setRotationPoint(-44.5F, -16.99F, -8F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 160, 0, 3, 0F,0F, 0F, 0F, -80F, 0F, 0F, -80F, 2F, -0.64F, 0F, 2F, -0.64F, 0F, 0F, 0F, -80F, 0F, 0F, -80F, -2F, -0.64F, 0F, -2F, -0.64F); // Box 128
		bodyModel[486].setRotationPoint(-44.5F, -15F, -10F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 160, 0, 3, 0F,0F, 2F, -0.64F, -80F, 2F, -0.64F, -80F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.64F, -80F, -2F, -0.64F, -80F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[487].setRotationPoint(-44.5F, -15F, 7F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 159, 2, 0, 0F,0F, 0F, 0F, -79.5F, 0F, 0F, -79.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -79.5F, 0F, 0F, -79.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[488].setRotationPoint(-44.25F, -14F, -9.99F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 159, 2, 0, 0F,0F, 0F, 0F, -79.5F, 0F, 0F, -79.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -79.5F, 0F, 0F, -79.5F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[489].setRotationPoint(-44.25F, -14F, 9.99F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 160, 2, 0, 0F,0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[490].setRotationPoint(-44.5F, -14F, -9.99F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 160, 2, 0, 0F,0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[491].setRotationPoint(-44.5F, -14F, 9.99F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.05F, 0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F); // Box 275
		bodyModel[492].setRotationPoint(-59.25F, -17.5F, 9.85F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.26F, 0.15F, -1F, -0.26F, 0.15F, -1F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F); // Box 701
		bodyModel[493].setRotationPoint(-59.25F, -17.5F, 9.85F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F); // Box 549
		bodyModel[494].setRotationPoint(-59.25F, -17.5F, -10.85F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.26F, 0.15F, -1F, -0.26F, 0.15F, -1F); // Box 550
		bodyModel[495].setRotationPoint(-59.25F, -17.5F, -10.85F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.05F, 0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F); // Box 275
		bodyModel[496].setRotationPoint(52.75F, -17.5F, 9.85F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.26F, 0.15F, -1F, -0.26F, 0.15F, -1F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F); // Box 701
		bodyModel[497].setRotationPoint(52.75F, -17.5F, 9.85F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F); // Box 549
		bodyModel[498].setRotationPoint(52.75F, -17.5F, -10.85F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.26F, 0.15F, -1F, -0.26F, 0.15F, -1F); // Box 550
		bodyModel[499].setRotationPoint(52.75F, -17.5F, -10.85F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 75, 9, textureX, textureY); // Box 574
		bodyModel[501] = new ModelRendererTurbo(this, 275, 13, textureX, textureY); // Box 128
		bodyModel[502] = new ModelRendererTurbo(this, 279, 21, textureX, textureY); // Box 128
		bodyModel[503] = new ModelRendererTurbo(this, 279, 9, textureX, textureY); // Box 199
		bodyModel[504] = new ModelRendererTurbo(this, 144, 170, textureX, textureY); // Box 2
		bodyModel[505] = new ModelRendererTurbo(this, 177, 176, textureX, textureY); // Box 2
		bodyModel[506] = new ModelRendererTurbo(this, 194, 176, textureX, textureY); // Box 52
		bodyModel[507] = new ModelRendererTurbo(this, 202, 167, textureX, textureY); // Box 41
		bodyModel[508] = new ModelRendererTurbo(this, 180, 166, textureX, textureY); // Box 41
		bodyModel[509] = new ModelRendererTurbo(this, 206, 160, textureX, textureY,"cull"); // Box 41 cull
		bodyModel[510] = new ModelRendererTurbo(this, 76, 182, textureX, textureY); // Box 52
		bodyModel[511] = new ModelRendererTurbo(this, 116, 179, textureX, textureY); // Box 52
		bodyModel[512] = new ModelRendererTurbo(this, 141, 176, textureX, textureY); // Box 52
		bodyModel[513] = new ModelRendererTurbo(this, 85, 182, textureX, textureY); // Box 52
		bodyModel[514] = new ModelRendererTurbo(this, 125, 180, textureX, textureY); // Box 52
		bodyModel[515] = new ModelRendererTurbo(this, 130, 172, textureX, textureY); // Box 52
		bodyModel[516] = new ModelRendererTurbo(this, 176, 155, textureX, textureY); // Box 52
		bodyModel[517] = new ModelRendererTurbo(this, 128, 155, textureX, textureY); // Box 601
		bodyModel[518] = new ModelRendererTurbo(this, 160, 157, textureX, textureY); // Box 2
		bodyModel[519] = new ModelRendererTurbo(this, 166, 160, textureX, textureY); // Box 41
		bodyModel[520] = new ModelRendererTurbo(this, 169, 156, textureX, textureY); // Box 41
		bodyModel[521] = new ModelRendererTurbo(this, 128, 156, textureX, textureY); // Box 605
		bodyModel[522] = new ModelRendererTurbo(this, 86, 158, textureX, textureY); // Box 41
		bodyModel[523] = new ModelRendererTurbo(this, 85, 156, textureX, textureY); // Box 41
		bodyModel[524] = new ModelRendererTurbo(this, 105, 156, textureX, textureY); // Box 41
		bodyModel[525] = new ModelRendererTurbo(this, 109, 158, textureX, textureY); // Box 41
		bodyModel[526] = new ModelRendererTurbo(this, 108, 156, textureX, textureY); // Box 41
		bodyModel[527] = new ModelRendererTurbo(this, 118, 156, textureX, textureY); // Box 41
		bodyModel[528] = new ModelRendererTurbo(this, 121, 157, textureX, textureY); // Box 605
		bodyModel[529] = new ModelRendererTurbo(this, 68, 159, textureX, textureY); // Box 605
		bodyModel[530] = new ModelRendererTurbo(this, 56, 140, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[531] = new ModelRendererTurbo(this, 56, 138, textureX, textureY); // Box 31
		bodyModel[532] = new ModelRendererTurbo(this, 56, 150, textureX, textureY,"cull"); // Box 616 cull
		bodyModel[533] = new ModelRendererTurbo(this, 56, 148, textureX, textureY); // Box 617
		bodyModel[534] = new ModelRendererTurbo(this, 335, 108, textureX, textureY); // Left trapdoor KCS
		bodyModel[535] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Right trapdoor KCS
		bodyModel[536] = new ModelRendererTurbo(this, 350, 49, textureX, textureY); // Box 142
		bodyModel[537] = new ModelRendererTurbo(this, 356, 46, textureX, textureY); // Right step part
		bodyModel[538] = new ModelRendererTurbo(this, 330, 49, textureX, textureY); // Box 142
		bodyModel[539] = new ModelRendererTurbo(this, 330, 46, textureX, textureY); // Right step part
		bodyModel[540] = new ModelRendererTurbo(this, 381, 49, textureX, textureY); // Box 555
		bodyModel[541] = new ModelRendererTurbo(this, 387, 46, textureX, textureY); // Box 556
		bodyModel[542] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 559
		bodyModel[543] = new ModelRendererTurbo(this, 361, 46, textureX, textureY); // Box 560
		bodyModel[544] = new ModelRendererTurbo(this, 341, 48, textureX, textureY); // Right step part
		bodyModel[545] = new ModelRendererTurbo(this, 339, 45, textureX, textureY); // Right step part
		bodyModel[546] = new ModelRendererTurbo(this, 341, 54, textureX, textureY); // Right step part
		bodyModel[547] = new ModelRendererTurbo(this, 339, 51, textureX, textureY); // Right step part
		bodyModel[548] = new ModelRendererTurbo(this, 343, 63, textureX, textureY); // Right step part
		bodyModel[549] = new ModelRendererTurbo(this, 339, 57, textureX, textureY); // Right step part
		bodyModel[550] = new ModelRendererTurbo(this, 345, 60, textureX, textureY); // Right step part
		bodyModel[551] = new ModelRendererTurbo(this, 372, 48, textureX, textureY); // Box 550
		bodyModel[552] = new ModelRendererTurbo(this, 370, 45, textureX, textureY); // Box 551
		bodyModel[553] = new ModelRendererTurbo(this, 372, 54, textureX, textureY); // Box 552
		bodyModel[554] = new ModelRendererTurbo(this, 370, 51, textureX, textureY); // Box 553
		bodyModel[555] = new ModelRendererTurbo(this, 370, 63, textureX, textureY); // Box 554
		bodyModel[556] = new ModelRendererTurbo(this, 370, 57, textureX, textureY); // Box 557
		bodyModel[557] = new ModelRendererTurbo(this, 372, 60, textureX, textureY); // Box 558
		bodyModel[558] = new ModelRendererTurbo(this, 80, 141, textureX, textureY); // Box 30
		bodyModel[559] = new ModelRendererTurbo(this, 80, 138, textureX, textureY); // Box 31
		bodyModel[560] = new ModelRendererTurbo(this, 71, 151, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[561] = new ModelRendererTurbo(this, 71, 148, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[562] = new ModelRendererTurbo(this, 63, 138, textureX, textureY); // Box 31
		bodyModel[563] = new ModelRendererTurbo(this, 63, 148, textureX, textureY); // Box 655
		bodyModel[564] = new ModelRendererTurbo(this, 28, 92, textureX, textureY); // Box 2
		bodyModel[565] = new ModelRendererTurbo(this, 365, 99, textureX, textureY); // Box 2
		bodyModel[566] = new ModelRendererTurbo(this, 448, 19, textureX, textureY); // Box 128
		bodyModel[567] = new ModelRendererTurbo(this, 7, 37, textureX, textureY); // Box 128
		bodyModel[568] = new ModelRendererTurbo(this, 260, 141, textureX, textureY); // Box 27
		bodyModel[569] = new ModelRendererTurbo(this, 260, 151, textureX, textureY); // Box 2
		bodyModel[570] = new ModelRendererTurbo(this, 75, 317, textureX, textureY); // Box 563
		bodyModel[571] = new ModelRendererTurbo(this, 75, 327, textureX, textureY); // Box 571
		bodyModel[572] = new ModelRendererTurbo(this, 40, 237, textureX, textureY); // Box 38
		bodyModel[573] = new ModelRendererTurbo(this, 67, 233, textureX, textureY); // Box 128
		bodyModel[574] = new ModelRendererTurbo(this, 67, 254, textureX, textureY); // Box 561
		bodyModel[575] = new ModelRendererTurbo(this, 275, 355, textureX, textureY); // Box 38
		bodyModel[576] = new ModelRendererTurbo(this, 70, 353, textureX, textureY); // Box 38
		bodyModel[577] = new ModelRendererTurbo(this, 75, 395, textureX, textureY); // Box 563
		bodyModel[578] = new ModelRendererTurbo(this, 75, 397, textureX, textureY); // Box 571
		bodyModel[579] = new ModelRendererTurbo(this, 438, 50, textureX, textureY,"lamp"); // Box 71 markerlight twO
		bodyModel[580] = new ModelRendererTurbo(this, 438, 45, textureX, textureY,"lamp"); // Box 1208 makrerlight twO
		bodyModel[581] = new ModelRendererTurbo(this, 9, 51, textureX, textureY); // Box 128
		bodyModel[582] = new ModelRendererTurbo(this, 419, 45, textureX, textureY); // Box 128
		bodyModel[583] = new ModelRendererTurbo(this, 1, 56, textureX, textureY,"lamp"); // Box 71 markerlight twO
		bodyModel[584] = new ModelRendererTurbo(this, 1, 51, textureX, textureY,"lamp"); // Box 1208 makrerlight twO

		bodyModel[500].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[500].setRotationPoint(-62F, -7F, 2F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[501].setRotationPoint(42.5F, -20.5F, -3F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[502].setRotationPoint(42.5F, -20.5F, -5F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[503].setRotationPoint(42.5F, -20.5F, 3F);

		bodyModel[504].addBox(0F, 0F, 0F, 13, 4, 5, 0F); // Box 2
		bodyModel[504].setRotationPoint(0.5F, 3F, -10F);

		bodyModel[505].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 2
		bodyModel[505].setRotationPoint(18.5F, 3F, -10F);

		bodyModel[506].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 52
		bodyModel[506].setRotationPoint(31.5F, 3F, -10.5F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0.25F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0.25F, 0F, -0.5F, -0.5F); // Box 41
		bodyModel[507].setRotationPoint(30.5F, 6F, 0F);
		bodyModel[507].rotateAngleX = -0.78539816F;

		bodyModel[508].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[508].setRotationPoint(24.5F, 5.9F, -0.5F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41 cull
		bodyModel[509].setRotationPoint(32.5F, 4F, -1F);

		bodyModel[510].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 52
		bodyModel[510].setRotationPoint(-27.5F, 3F, -10F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[511].setRotationPoint(-9.5F, 3.5F, -10F);

		bodyModel[512].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 52
		bodyModel[512].setRotationPoint(-3F, 3F, -10F);

		bodyModel[513].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 52
		bodyModel[513].setRotationPoint(-20F, 3F, -10F);

		bodyModel[514].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 52
		bodyModel[514].setRotationPoint(-7F, 3F, -10F);

		bodyModel[515].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 52
		bodyModel[515].setRotationPoint(-6F, 4F, -10F);

		bodyModel[516].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[516].setRotationPoint(27.5F, 3F, 9F);

		bodyModel[517].addBox(0F, 0F, 0F, 13, 4, 5, 0F); // Box 601
		bodyModel[517].setRotationPoint(0.5F, 3F, 5F);

		bodyModel[518].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 2
		bodyModel[518].setRotationPoint(15.5F, 3F, 9.5F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[519].setRotationPoint(23.5F, 3F, 6F);
		bodyModel[519].rotateAngleZ = -0.78539816F;

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[520].setRotationPoint(23F, 3F, 7F);

		bodyModel[521].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 605
		bodyModel[521].setRotationPoint(-0.5F, 3F, 9.5F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[522].setRotationPoint(-19.5F, 3F, 8.9F);
		bodyModel[522].rotateAngleX = -0.78539816F;

		bodyModel[523].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[523].setRotationPoint(-19.51F, 3F, 8.4F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[524].setRotationPoint(-11.49F, 3F, 8.4F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 41
		bodyModel[525].setRotationPoint(-10F, 3F, 8.9F);
		bodyModel[525].rotateAngleX = -0.78539816F;

		bodyModel[526].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 41
		bodyModel[526].setRotationPoint(-10.01F, 3F, 8.4F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 41
		bodyModel[527].setRotationPoint(-6.99F, 3F, 8.4F);

		bodyModel[528].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 605
		bodyModel[528].setRotationPoint(-4F, 3F, 9F);

		bodyModel[529].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 605
		bodyModel[529].setRotationPoint(-59F, 3F, 9F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31 cull
		bodyModel[530].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[531].setRotationPoint(-61.5F, 5F, -11F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616 cull
		bodyModel[532].setRotationPoint(-61.5F, 3F, 10F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617
		bodyModel[533].setRotationPoint(-61.5F, 5F, 10F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left trapdoor KCS
		bodyModel[534].setRotationPoint(56.5F, 1F, -10.99F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right trapdoor KCS
		bodyModel[535].setRotationPoint(56.5F, 1F, 4.99F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[536].setRotationPoint(60.49F, 3F, 5F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[537].setRotationPoint(60.49F, 3F, 9.5F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[538].setRotationPoint(56.51F, 3F, 5F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[539].setRotationPoint(56.51F, 3F, 9.5F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 555
		bodyModel[540].setRotationPoint(60.49F, 3F, -10F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[541].setRotationPoint(60.49F, 3F, -11.5F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 559
		bodyModel[542].setRotationPoint(56.51F, 3F, -10F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[543].setRotationPoint(56.51F, 3F, -11.5F);

		bodyModel[544].addShapeBox(0F, 2F, -2F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[544].setRotationPoint(56.51F, 0.75F, 8.5F);

		bodyModel[545].addShapeBox(0F, 2F, -2F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[545].setRotationPoint(56.5F, 0.75F, 7F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[546].setRotationPoint(56.51F, 4.5F, 8F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[547].setRotationPoint(56.51F, 4.5F, 6.5F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[548].setRotationPoint(56.51F, 8F, 9.5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[549].setRotationPoint(56.51F, 6.25F, 8F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[550].setRotationPoint(56.51F, 6.25F, 9.5F);

		bodyModel[551].addShapeBox(0F, 2F, -2F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 550
		bodyModel[551].setRotationPoint(56.51F, 0.75F, -4.5F);

		bodyModel[552].addShapeBox(0F, 2F, -2F, 4, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[552].setRotationPoint(56.5F, 0.75F, -5F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 552
		bodyModel[553].setRotationPoint(56.51F, 4.5F, -8F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[554].setRotationPoint(56.51F, 4.5F, -8.5F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[555].setRotationPoint(56.51F, 8F, -11.5F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[556].setRotationPoint(56.51F, 6.25F, -10F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 558
		bodyModel[557].setRotationPoint(56.51F, 6.25F, -9.5F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[558].setRotationPoint(-58.5F, 4F, -11F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[559].setRotationPoint(-58.5F, 3F, -11F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull
		bodyModel[560].setRotationPoint(-61.5F, 4F, 10.5F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull
		bodyModel[561].setRotationPoint(-61.5F, 3F, 10.5F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0.005F, 0F, 0F, 0.005F, 0F, 0F, -0.505F, 0F, 0F, -0.505F, 0F, 0F, 0.005F, 0F, 0F, 0.005F, 0F, 0F, -0.505F, 0F, 0F, -0.505F); // Box 31
		bodyModel[562].setRotationPoint(-61.5F, 4.5F, -10.87F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, -0.505F, 0F, 0F, -0.505F, 0F, 0F, 0.005F, 0F, 0F, 0.005F, 0F, 0F, -0.505F, 0F, 0F, -0.505F, 0F, 0F, 0.005F, 0F, 0F, 0.005F); // Box 655
		bodyModel[563].setRotationPoint(-61.5F, 4.5F, 9.87F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 0, 4, 22, 0F,-0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[564].setRotationPoint(-61.51F, 3F, -11F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 0, 4, 22, 0F,0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[565].setRotationPoint(61.51F, 3F, -11F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[566].setRotationPoint(63F, -16.5F, -1F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[567].setRotationPoint(-63.5F, -16.5F, -1F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[568].setRotationPoint(54.5F, 4F, -11F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[569].setRotationPoint(54.5F, 4F, 10.5F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 126, 1, 0, 0F,0F, 0F, 0F, -63F, 0F, 0F, -63F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -63F, 0F, 0F, -63F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[570].setRotationPoint(-39F, -6F, 9.99F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 126, 1, 0, 0F,0F, 0F, 0F, -63F, 0F, 0F, -63F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -63F, 0F, 0F, -63F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[571].setRotationPoint(-39F, -6F, -9.99F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 0, 16, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[572].setRotationPoint(-7.75F, -16.99F, -8F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, -0.64F, 0F, 2F, -0.64F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, -0.64F, 0F, -2F, -0.64F); // Box 128
		bodyModel[573].setRotationPoint(-7.75F, -15F, -10F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 2F, -0.64F, -0.5F, 2F, -0.64F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.64F, -0.5F, -2F, -0.64F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[574].setRotationPoint(-7.75F, -15F, 7F);

		bodyModel[575].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 38
		bodyModel[575].setRotationPoint(35.5F, -15F, -2F);

		bodyModel[576].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 38
		bodyModel[576].setRotationPoint(-45.5F, -15F, -2F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 126, 1, 0, 0F,0F, 0F, 0F, -63F, 0F, 0F, -63F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -63F, 0F, 0F, -63F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[577].setRotationPoint(-39F, -11F, 9.99F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 126, 1, 0, 0F,0F, 0F, 0F, -63F, 0F, 0F, -63F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -63F, 0F, 0F, -63F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[578].setRotationPoint(-39F, -11F, -9.99F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[579].setRotationPoint(61.5F, -13.5F, -9.5F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[580].setRotationPoint(61.5F, -13.5F, 7.5F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[581].setRotationPoint(63F, 1F, -4F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[582].setRotationPoint(-63.5F, 1F, -4F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[583].setRotationPoint(-62F, -13.5F, -9.5F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[584].setRotationPoint(-62F, -13.5F, 7.5F);
	}
	ModelPS_Truck_41CDO bogie1 = new ModelPS_Truck_41CDO();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 585; i++)
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
		if(GetColor(entity)==3 || GetColor(entity)==4){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-CDO_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-CDO_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}