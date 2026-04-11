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

public class ModelPSCNW16_1_3Sleeper extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPSCNW16_1_3Sleeper() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[665];

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
		bodyModel[4] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 30, 122, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 256, 154, textureX, textureY); // Box 24
		bodyModel[11] = new ModelRendererTurbo(this, 249, 154, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 331, 62, textureX, textureY); // Left step part
		bodyModel[13] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Left step part
		bodyModel[14] = new ModelRendererTurbo(this, 331, 68, textureX, textureY); // Left step part
		bodyModel[15] = new ModelRendererTurbo(this, 329, 71, textureX, textureY); // Left step part
		bodyModel[16] = new ModelRendererTurbo(this, 331, 77, textureX, textureY); // Left step part
		bodyModel[17] = new ModelRendererTurbo(this, 322, 79, textureX, textureY); // Left step part
		bodyModel[18] = new ModelRendererTurbo(this, 322, 77, textureX, textureY); // Left step part
		bodyModel[19] = new ModelRendererTurbo(this, 323, 74, textureX, textureY); // Left step part
		bodyModel[20] = new ModelRendererTurbo(this, 340, 79, textureX, textureY); // Left step part
		bodyModel[21] = new ModelRendererTurbo(this, 340, 77, textureX, textureY); // Left step part
		bodyModel[22] = new ModelRendererTurbo(this, 341, 74, textureX, textureY); // Left step part
		bodyModel[23] = new ModelRendererTurbo(this, 331, 74, textureX, textureY); // Left step part
		bodyModel[24] = new ModelRendererTurbo(this, 327, 81, textureX, textureY); // Left step part
		bodyModel[25] = new ModelRendererTurbo(this, 256, 163, textureX, textureY); // Box 144
		bodyModel[26] = new ModelRendererTurbo(this, 249, 163, textureX, textureY); // Box 145
		bodyModel[27] = new ModelRendererTurbo(this, 331, 87, textureX, textureY); // Right step part
		bodyModel[28] = new ModelRendererTurbo(this, 329, 90, textureX, textureY); // Right step part
		bodyModel[29] = new ModelRendererTurbo(this, 331, 93, textureX, textureY); // Right step part
		bodyModel[30] = new ModelRendererTurbo(this, 329, 96, textureX, textureY); // Right step part
		bodyModel[31] = new ModelRendererTurbo(this, 331, 102, textureX, textureY); // Right step part
		bodyModel[32] = new ModelRendererTurbo(this, 322, 100, textureX, textureY); // Right step part
		bodyModel[33] = new ModelRendererTurbo(this, 322, 98, textureX, textureY); // Right step part
		bodyModel[34] = new ModelRendererTurbo(this, 323, 95, textureX, textureY); // Right step part
		bodyModel[35] = new ModelRendererTurbo(this, 340, 100, textureX, textureY); // Right step part
		bodyModel[36] = new ModelRendererTurbo(this, 340, 98, textureX, textureY); // Right step part
		bodyModel[37] = new ModelRendererTurbo(this, 341, 95, textureX, textureY); // Right step part
		bodyModel[38] = new ModelRendererTurbo(this, 331, 99, textureX, textureY); // Right step part
		bodyModel[39] = new ModelRendererTurbo(this, 327, 106, textureX, textureY); // Right step part
		bodyModel[40] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[41] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[42] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[43] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[44] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[50] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[56] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[57] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[58] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[61] = new ModelRendererTurbo(this, 74, 216, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 74, 210, textureX, textureY); // Box 177
		bodyModel[63] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[64] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[65] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[66] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[67] = new ModelRendererTurbo(this, 81, 18, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 80, 14, textureX, textureY); // Box 128
		bodyModel[69] = new ModelRendererTurbo(this, 107, 2, textureX, textureY); // Box 190
		bodyModel[70] = new ModelRendererTurbo(this, 106, 7, textureX, textureY); // Box 191
		bodyModel[71] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[72] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[74] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[75] = new ModelRendererTurbo(this, 75, 244, textureX, textureY); // Box 38
		bodyModel[76] = new ModelRendererTurbo(this, 23, 244, textureX, textureY); // Box 38
		bodyModel[77] = new ModelRendererTurbo(this, 41, 239, textureX, textureY); // Box 38
		bodyModel[78] = new ModelRendererTurbo(this, 60, 239, textureX, textureY); // Box 38
		bodyModel[79] = new ModelRendererTurbo(this, 91, 276, textureX, textureY); // Box 225
		bodyModel[80] = new ModelRendererTurbo(this, 59, 276, textureX, textureY); // Box 38
		bodyModel[81] = new ModelRendererTurbo(this, 1, 276, textureX, textureY); // Box 38
		bodyModel[82] = new ModelRendererTurbo(this, 23, 282, textureX, textureY); // Box 38
		bodyModel[83] = new ModelRendererTurbo(this, 8, 277, textureX, textureY); // Box 38
		bodyModel[84] = new ModelRendererTurbo(this, 33, 26, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 389, 59, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 389, 98, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 402, 89, textureX, textureY); // Box 128
		bodyModel[88] = new ModelRendererTurbo(this, 402, 69, textureX, textureY); // Box 128
		bodyModel[89] = new ModelRendererTurbo(this, 426, 69, textureX, textureY); // Box 128
		bodyModel[90] = new ModelRendererTurbo(this, 411, 69, textureX, textureY); // Box 128
		bodyModel[91] = new ModelRendererTurbo(this, 410, 57, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 18, 132, textureX, textureY); // Box 128
		bodyModel[93] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 2, 120, textureX, textureY); // Box 128
		bodyModel[95] = new ModelRendererTurbo(this, 20, 42, textureX, textureY); // Box 128
		bodyModel[96] = new ModelRendererTurbo(this, 1, 98, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 128
		bodyModel[98] = new ModelRendererTurbo(this, 1, 69, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 37, 284, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[100] = new ModelRendererTurbo(this, 41, 266, textureX, textureY); // Box 38
		bodyModel[101] = new ModelRendererTurbo(this, 42, 3, textureX, textureY); // Box 128
		bodyModel[102] = new ModelRendererTurbo(this, 427, 220, textureX, textureY); // Box 128
		bodyModel[103] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[104] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[105] = new ModelRendererTurbo(this, 74, 151, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[106] = new ModelRendererTurbo(this, 74, 148, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[107] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[108] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[109] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[110] = new ModelRendererTurbo(this, 244, 151, textureX, textureY); // Box 2
		bodyModel[111] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[112] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[113] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[114] = new ModelRendererTurbo(this, 74, 141, textureX, textureY,"cull"); // Box 30 cull
		bodyModel[115] = new ModelRendererTurbo(this, 74, 138, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[116] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[117] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[118] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[119] = new ModelRendererTurbo(this, 244, 141, textureX, textureY); // Box 35
		bodyModel[120] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[121] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[122] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[123] = new ModelRendererTurbo(this, 257, 148, textureX, textureY); // Box 2
		bodyModel[124] = new ModelRendererTurbo(this, 257, 151, textureX, textureY); // Box 2
		bodyModel[125] = new ModelRendererTurbo(this, 257, 138, textureX, textureY); // Box 28
		bodyModel[126] = new ModelRendererTurbo(this, 257, 141, textureX, textureY); // Box 29
		bodyModel[127] = new ModelRendererTurbo(this, 262, 148, textureX, textureY); // Box 2
		bodyModel[128] = new ModelRendererTurbo(this, 262, 138, textureX, textureY); // Box 41
		bodyModel[129] = new ModelRendererTurbo(this, 274, 148, textureX, textureY); // Box 2
		bodyModel[130] = new ModelRendererTurbo(this, 274, 151, textureX, textureY); // Box 2
		bodyModel[131] = new ModelRendererTurbo(this, 264, 151, textureX, textureY); // Box 2
		bodyModel[132] = new ModelRendererTurbo(this, 247, 164, textureX, textureY); // Box 140
		bodyModel[133] = new ModelRendererTurbo(this, 248, 167, textureX, textureY); // Box 141
		bodyModel[134] = new ModelRendererTurbo(this, 256, 164, textureX, textureY); // Box 142
		bodyModel[135] = new ModelRendererTurbo(this, 257, 167, textureX, textureY); // Box 143
		bodyModel[136] = new ModelRendererTurbo(this, 274, 138, textureX, textureY); // Box 24
		bodyModel[137] = new ModelRendererTurbo(this, 274, 141, textureX, textureY); // Box 25
		bodyModel[138] = new ModelRendererTurbo(this, 264, 141, textureX, textureY); // Box 27
		bodyModel[139] = new ModelRendererTurbo(this, 247, 155, textureX, textureY); // Box 26
		bodyModel[140] = new ModelRendererTurbo(this, 248, 158, textureX, textureY); // Box 26
		bodyModel[141] = new ModelRendererTurbo(this, 256, 155, textureX, textureY); // Box 26
		bodyModel[142] = new ModelRendererTurbo(this, 257, 158, textureX, textureY); // Box 26
		bodyModel[143] = new ModelRendererTurbo(this, 434, 23, textureX, textureY); // Box 128
		bodyModel[144] = new ModelRendererTurbo(this, 40, 45, textureX, textureY); // Box 128
		bodyModel[145] = new ModelRendererTurbo(this, 371, 158, textureX, textureY); // Box 38
		bodyModel[146] = new ModelRendererTurbo(this, 379, 152, textureX, textureY); // Box 462
		bodyModel[147] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 74, 222, textureX, textureY); // Box 128
		bodyModel[149] = new ModelRendererTurbo(this, 10, 6, textureX, textureY); // Box 176
		bodyModel[150] = new ModelRendererTurbo(this, 74, 194, textureX, textureY); // Box 128
		bodyModel[151] = new ModelRendererTurbo(this, 433, 204, textureX, textureY); // Box 128
		bodyModel[152] = new ModelRendererTurbo(this, 384, 233, textureX, textureY); // Box 128
		bodyModel[153] = new ModelRendererTurbo(this, 384, 184, textureX, textureY); // Box 176
		bodyModel[154] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[155] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 39
		bodyModel[156] = new ModelRendererTurbo(this, 360, 86, textureX, textureY); // Box 38
		bodyModel[157] = new ModelRendererTurbo(this, 363, 103, textureX, textureY); // Box 128
		bodyModel[158] = new ModelRendererTurbo(this, 362, 97, textureX, textureY); // Box 128
		bodyModel[159] = new ModelRendererTurbo(this, 361, 91, textureX, textureY); // Box 128
		bodyModel[160] = new ModelRendererTurbo(this, 359, 83, textureX, textureY); // Box 128
		bodyModel[161] = new ModelRendererTurbo(this, 360, 67, textureX, textureY); // Box 248
		bodyModel[162] = new ModelRendererTurbo(this, 363, 67, textureX, textureY); // Box 250
		bodyModel[163] = new ModelRendererTurbo(this, 362, 72, textureX, textureY); // Box 252
		bodyModel[164] = new ModelRendererTurbo(this, 361, 77, textureX, textureY); // Box 254
		bodyModel[165] = new ModelRendererTurbo(this, 355, 86, textureX, textureY); // Box 38
		bodyModel[166] = new ModelRendererTurbo(this, 374, 102, textureX, textureY); // Box 128
		bodyModel[167] = new ModelRendererTurbo(this, 413, 67, textureX, textureY); // Box 128
		bodyModel[168] = new ModelRendererTurbo(this, 373, 96, textureX, textureY); // Box 128
		bodyModel[169] = new ModelRendererTurbo(this, 372, 90, textureX, textureY); // Box 128
		bodyModel[170] = new ModelRendererTurbo(this, 370, 82, textureX, textureY); // Box 128
		bodyModel[171] = new ModelRendererTurbo(this, 389, 45, textureX, textureY); // Box 128
		bodyModel[172] = new ModelRendererTurbo(this, 397, 46, textureX, textureY); // Box 128
		bodyModel[173] = new ModelRendererTurbo(this, 355, 66, textureX, textureY); // Box 247
		bodyModel[174] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 249
		bodyModel[175] = new ModelRendererTurbo(this, 373, 71, textureX, textureY); // Box 251
		bodyModel[176] = new ModelRendererTurbo(this, 372, 76, textureX, textureY); // Box 253
		bodyModel[177] = new ModelRendererTurbo(this, 383, 46, textureX, textureY); // Box 255
		bodyModel[178] = new ModelRendererTurbo(this, 393, 52, textureX, textureY); // Box 128
		bodyModel[179] = new ModelRendererTurbo(this, 383, 52, textureX, textureY); // Box 153
		bodyModel[180] = new ModelRendererTurbo(this, 389, 51, textureX, textureY); // Box 128
		bodyModel[181] = new ModelRendererTurbo(this, 402, 54, textureX, textureY); // Box 128
		bodyModel[182] = new ModelRendererTurbo(this, 378, 54, textureX, textureY); // Box 259
		bodyModel[183] = new ModelRendererTurbo(this, 396, 52, textureX, textureY); // Box 128
		bodyModel[184] = new ModelRendererTurbo(this, 378, 52, textureX, textureY); // Box 261
		bodyModel[185] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[186] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[187] = new ModelRendererTurbo(this, 19, 102, textureX, textureY); // Box 128
		bodyModel[188] = new ModelRendererTurbo(this, 28, 103, textureX, textureY); // Box 128
		bodyModel[189] = new ModelRendererTurbo(this, 5, 130, textureX, textureY); // Box 128
		bodyModel[190] = new ModelRendererTurbo(this, 18, 96, textureX, textureY); // Box 128
		bodyModel[191] = new ModelRendererTurbo(this, 27, 97, textureX, textureY); // Box 128
		bodyModel[192] = new ModelRendererTurbo(this, 17, 90, textureX, textureY); // Box 128
		bodyModel[193] = new ModelRendererTurbo(this, 26, 91, textureX, textureY); // Box 128
		bodyModel[194] = new ModelRendererTurbo(this, 15, 82, textureX, textureY); // Box 128
		bodyModel[195] = new ModelRendererTurbo(this, 24, 83, textureX, textureY); // Box 128
		bodyModel[196] = new ModelRendererTurbo(this, 16, 115, textureX, textureY); // Box 128
		bodyModel[197] = new ModelRendererTurbo(this, 6, 115, textureX, textureY); // Box 153
		bodyModel[198] = new ModelRendererTurbo(this, 12, 108, textureX, textureY); // Box 128
		bodyModel[199] = new ModelRendererTurbo(this, 20, 109, textureX, textureY); // Box 128
		bodyModel[200] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[201] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[202] = new ModelRendererTurbo(this, 19, 67, textureX, textureY); // Box 249
		bodyModel[203] = new ModelRendererTurbo(this, 28, 67, textureX, textureY); // Box 250
		bodyModel[204] = new ModelRendererTurbo(this, 18, 71, textureX, textureY); // Box 251
		bodyModel[205] = new ModelRendererTurbo(this, 27, 72, textureX, textureY); // Box 252
		bodyModel[206] = new ModelRendererTurbo(this, 17, 76, textureX, textureY); // Box 253
		bodyModel[207] = new ModelRendererTurbo(this, 26, 77, textureX, textureY); // Box 254
		bodyModel[208] = new ModelRendererTurbo(this, 6, 109, textureX, textureY); // Box 255
		bodyModel[209] = new ModelRendererTurbo(this, 12, 114, textureX, textureY); // Box 128
		bodyModel[210] = new ModelRendererTurbo(this, 19, 115, textureX, textureY); // Box 128
		bodyModel[211] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 261
		bodyModel[212] = new ModelRendererTurbo(this, 62, 82, textureX, textureY); // Box 128
		bodyModel[213] = new ModelRendererTurbo(this, 62, 101, textureX, textureY); // Box 204
		bodyModel[214] = new ModelRendererTurbo(this, 62, 84, textureX, textureY); // Box 128
		bodyModel[215] = new ModelRendererTurbo(this, 62, 103, textureX, textureY); // Box 204
		bodyModel[216] = new ModelRendererTurbo(this, 25, 117, textureX, textureY); // Box 128
		bodyModel[217] = new ModelRendererTurbo(this, 1, 117, textureX, textureY); // Box 259
		bodyModel[218] = new ModelRendererTurbo(this, 65, 159, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[219] = new ModelRendererTurbo(this, 65, 157, textureX, textureY); // Box 31
		bodyModel[220] = new ModelRendererTurbo(this, 65, 140, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[221] = new ModelRendererTurbo(this, 65, 138, textureX, textureY); // Box 31
		bodyModel[222] = new ModelRendererTurbo(this, 261, 173, textureX, textureY); // Box 283
		bodyModel[223] = new ModelRendererTurbo(this, 286, 173, textureX, textureY); // Box 283
		bodyModel[224] = new ModelRendererTurbo(this, 187, 174, textureX, textureY); // Box 2
		bodyModel[225] = new ModelRendererTurbo(this, 74, 166, textureX, textureY); // Box 2
		bodyModel[226] = new ModelRendererTurbo(this, 74, 177, textureX, textureY); // Box 2
		bodyModel[227] = new ModelRendererTurbo(this, 99, 155, textureX, textureY); // Box 284
		bodyModel[228] = new ModelRendererTurbo(this, 162, 174, textureX, textureY); // Box 283
		bodyModel[229] = new ModelRendererTurbo(this, 137, 174, textureX, textureY); // Box 283
		bodyModel[230] = new ModelRendererTurbo(this, 203, 177, textureX, textureY); // Box 41
		bodyModel[231] = new ModelRendererTurbo(this, 200, 178, textureX, textureY); // Box 41
		bodyModel[232] = new ModelRendererTurbo(this, 224, 178, textureX, textureY); // Box 41
		bodyModel[233] = new ModelRendererTurbo(this, 230, 177, textureX, textureY); // Box 41
		bodyModel[234] = new ModelRendererTurbo(this, 227, 178, textureX, textureY); // Box 41
		bodyModel[235] = new ModelRendererTurbo(this, 251, 178, textureX, textureY); // Box 41
		bodyModel[236] = new ModelRendererTurbo(this, 254, 179, textureX, textureY); // Box 633
		bodyModel[237] = new ModelRendererTurbo(this, 96, 2, textureX, textureY); // Box 190
		bodyModel[238] = new ModelRendererTurbo(this, 95, 7, textureX, textureY); // Box 191
		bodyModel[239] = new ModelRendererTurbo(this, 85, 2, textureX, textureY); // Box 190
		bodyModel[240] = new ModelRendererTurbo(this, 84, 7, textureX, textureY); // Box 191
		bodyModel[241] = new ModelRendererTurbo(this, 74, 2, textureX, textureY); // Box 190
		bodyModel[242] = new ModelRendererTurbo(this, 73, 7, textureX, textureY); // Box 191
		bodyModel[243] = new ModelRendererTurbo(this, 159, 155, textureX, textureY); // Box 624
		bodyModel[244] = new ModelRendererTurbo(this, 184, 155, textureX, textureY); // Box 628
		bodyModel[245] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 624
		bodyModel[246] = new ModelRendererTurbo(this, 146, 156, textureX, textureY); // Box 41
		bodyModel[247] = new ModelRendererTurbo(this, 147, 157, textureX, textureY); // Box 41
		bodyModel[248] = new ModelRendererTurbo(this, 155, 157, textureX, textureY); // Box 41
		bodyModel[249] = new ModelRendererTurbo(this, 140, 157, textureX, textureY); // Box 739
		bodyModel[250] = new ModelRendererTurbo(this, 133, 156, textureX, textureY); // Box 283
		bodyModel[251] = new ModelRendererTurbo(this, 115, 155, textureX, textureY); // Box 41
		bodyModel[252] = new ModelRendererTurbo(this, 134, 156, textureX, textureY); // Box 41
		bodyModel[253] = new ModelRendererTurbo(this, 112, 156, textureX, textureY); // Box 41
		bodyModel[254] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 228
		bodyModel[255] = new ModelRendererTurbo(this, 73, 20, textureX, textureY); // Box 228
		bodyModel[256] = new ModelRendererTurbo(this, 117, 7, textureX, textureY); // Box 204
		bodyModel[257] = new ModelRendererTurbo(this, 117, 2, textureX, textureY); // Box 205
		bodyModel[258] = new ModelRendererTurbo(this, 36, 244, textureX, textureY); // Box 38
		bodyModel[259] = new ModelRendererTurbo(this, 37, 286, textureX, textureY); // Box 539
		bodyModel[260] = new ModelRendererTurbo(this, 30, 284, textureX, textureY); // Box 38
		bodyModel[261] = new ModelRendererTurbo(this, 76, 271, textureX, textureY); // Box 38
		bodyModel[262] = new ModelRendererTurbo(this, 8, 264, textureX, textureY); // Box 38 porter's bed
		bodyModel[263] = new ModelRendererTurbo(this, 420, 242, textureX, textureY); // Box 38
		bodyModel[264] = new ModelRendererTurbo(this, 342, 242, textureX, textureY); // Box 38
		bodyModel[265] = new ModelRendererTurbo(this, 324, 244, textureX, textureY); // Box 38
		bodyModel[266] = new ModelRendererTurbo(this, 312, 247, textureX, textureY); // Box 38
		bodyModel[267] = new ModelRendererTurbo(this, 353, 248, textureX, textureY); // Box 38
		bodyModel[268] = new ModelRendererTurbo(this, 310, 242, textureX, textureY); // Box 38
		bodyModel[269] = new ModelRendererTurbo(this, 313, 255, textureX, textureY); // Box 38
		bodyModel[270] = new ModelRendererTurbo(this, 329, 252, textureX, textureY); // Box 38
		bodyModel[271] = new ModelRendererTurbo(this, 160, 358, textureX, textureY); // Box 38
		bodyModel[272] = new ModelRendererTurbo(this, 342, 255, textureX, textureY); // Box 38 duplex lower bed
		bodyModel[273] = new ModelRendererTurbo(this, 366, 252, textureX, textureY); // Box 38
		bodyModel[274] = new ModelRendererTurbo(this, 385, 251, textureX, textureY); // Box 38
		bodyModel[275] = new ModelRendererTurbo(this, 372, 242, textureX, textureY); // Box 38
		bodyModel[276] = new ModelRendererTurbo(this, 361, 244, textureX, textureY); // Box 38
		bodyModel[277] = new ModelRendererTurbo(this, 409, 253, textureX, textureY); // Box 38
		bodyModel[278] = new ModelRendererTurbo(this, 412, 243, textureX, textureY); // Box 38
		bodyModel[279] = new ModelRendererTurbo(this, 342, 245, textureX, textureY); // Box 38
		bodyModel[280] = new ModelRendererTurbo(this, 421, 253, textureX, textureY); // Box 38
		bodyModel[281] = new ModelRendererTurbo(this, 433, 188, textureX, textureY); // Box 128
		bodyModel[282] = new ModelRendererTurbo(this, 377, 222, textureX, textureY); // Box 128
		bodyModel[283] = new ModelRendererTurbo(this, 377, 196, textureX, textureY); // Box 177
		bodyModel[284] = new ModelRendererTurbo(this, 350, 236, textureX, textureY); // Box 38
		bodyModel[285] = new ModelRendererTurbo(this, 399, 243, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[286] = new ModelRendererTurbo(this, 335, 241, textureX, textureY); // Box 38
		bodyModel[287] = new ModelRendererTurbo(this, 395, 243, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[288] = new ModelRendererTurbo(this, 407, 245, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[289] = new ModelRendererTurbo(this, 393, 243, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[290] = new ModelRendererTurbo(this, 3, 303, textureX, textureY); // Box 38
		bodyModel[291] = new ModelRendererTurbo(this, 1, 300, textureX, textureY); // Box 38
		bodyModel[292] = new ModelRendererTurbo(this, 4, 311, textureX, textureY); // Box 38
		bodyModel[293] = new ModelRendererTurbo(this, 420, 273, textureX, textureY); // Box 298
		bodyModel[294] = new ModelRendererTurbo(this, 342, 273, textureX, textureY); // Box 299
		bodyModel[295] = new ModelRendererTurbo(this, 324, 275, textureX, textureY); // Box 300
		bodyModel[296] = new ModelRendererTurbo(this, 312, 278, textureX, textureY); // Box 301
		bodyModel[297] = new ModelRendererTurbo(this, 353, 279, textureX, textureY); // Box 302
		bodyModel[298] = new ModelRendererTurbo(this, 310, 272, textureX, textureY); // Box 303
		bodyModel[299] = new ModelRendererTurbo(this, 313, 286, textureX, textureY); // Box 304
		bodyModel[300] = new ModelRendererTurbo(this, 329, 283, textureX, textureY); // Box 305
		bodyModel[301] = new ModelRendererTurbo(this, 342, 286, textureX, textureY); // Box 306 duplex lower bed
		bodyModel[302] = new ModelRendererTurbo(this, 366, 283, textureX, textureY); // Box 307
		bodyModel[303] = new ModelRendererTurbo(this, 385, 282, textureX, textureY); // Box 308
		bodyModel[304] = new ModelRendererTurbo(this, 372, 273, textureX, textureY); // Box 309
		bodyModel[305] = new ModelRendererTurbo(this, 361, 275, textureX, textureY); // Box 310
		bodyModel[306] = new ModelRendererTurbo(this, 409, 284, textureX, textureY); // Box 311
		bodyModel[307] = new ModelRendererTurbo(this, 412, 274, textureX, textureY); // Box 312
		bodyModel[308] = new ModelRendererTurbo(this, 342, 276, textureX, textureY); // Box 313
		bodyModel[309] = new ModelRendererTurbo(this, 350, 267, textureX, textureY); // Box 314
		bodyModel[310] = new ModelRendererTurbo(this, 335, 272, textureX, textureY); // Box 315
		bodyModel[311] = new ModelRendererTurbo(this, 3, 328, textureX, textureY); // Box 316
		bodyModel[312] = new ModelRendererTurbo(this, 1, 325, textureX, textureY); // Box 317
		bodyModel[313] = new ModelRendererTurbo(this, 4, 336, textureX, textureY); // Box 318
		bodyModel[314] = new ModelRendererTurbo(this, 399, 274, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[315] = new ModelRendererTurbo(this, 395, 274, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[316] = new ModelRendererTurbo(this, 393, 274, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[317] = new ModelRendererTurbo(this, 407, 276, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[318] = new ModelRendererTurbo(this, 15, 247, textureX, textureY); // Box 379
		bodyModel[319] = new ModelRendererTurbo(this, 14, 250, textureX, textureY); // Box 380
		bodyModel[320] = new ModelRendererTurbo(this, 16, 254, textureX, textureY); // Box 382
		bodyModel[321] = new ModelRendererTurbo(this, 1, 248, textureX, textureY); // Box 38
		bodyModel[322] = new ModelRendererTurbo(this, 4, 253, textureX, textureY); // Box 38
		bodyModel[323] = new ModelRendererTurbo(this, 3, 258, textureX, textureY); // Box 38
		bodyModel[324] = new ModelRendererTurbo(this, 111, 298, textureX, textureY); // Box 38
		bodyModel[325] = new ModelRendererTurbo(this, 33, 298, textureX, textureY); // Box 38
		bodyModel[326] = new ModelRendererTurbo(this, 15, 300, textureX, textureY); // Box 38
		bodyModel[327] = new ModelRendererTurbo(this, 44, 304, textureX, textureY); // Box 38
		bodyModel[328] = new ModelRendererTurbo(this, 20, 308, textureX, textureY); // Box 38
		bodyModel[329] = new ModelRendererTurbo(this, 33, 311, textureX, textureY); // Box 38 duplex lower bed
		bodyModel[330] = new ModelRendererTurbo(this, 57, 308, textureX, textureY); // Box 38
		bodyModel[331] = new ModelRendererTurbo(this, 76, 307, textureX, textureY); // Box 38
		bodyModel[332] = new ModelRendererTurbo(this, 63, 298, textureX, textureY); // Box 38
		bodyModel[333] = new ModelRendererTurbo(this, 52, 300, textureX, textureY); // Box 38
		bodyModel[334] = new ModelRendererTurbo(this, 100, 309, textureX, textureY); // Box 38
		bodyModel[335] = new ModelRendererTurbo(this, 103, 299, textureX, textureY); // Box 38
		bodyModel[336] = new ModelRendererTurbo(this, 33, 301, textureX, textureY); // Box 38
		bodyModel[337] = new ModelRendererTurbo(this, 41, 292, textureX, textureY); // Box 38
		bodyModel[338] = new ModelRendererTurbo(this, 90, 299, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[339] = new ModelRendererTurbo(this, 26, 297, textureX, textureY); // Box 38
		bodyModel[340] = new ModelRendererTurbo(this, 86, 299, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[341] = new ModelRendererTurbo(this, 98, 301, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[342] = new ModelRendererTurbo(this, 84, 299, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[343] = new ModelRendererTurbo(this, 128, 303, textureX, textureY); // Box 38
		bodyModel[344] = new ModelRendererTurbo(this, 129, 311, textureX, textureY); // Box 38
		bodyModel[345] = new ModelRendererTurbo(this, 111, 323, textureX, textureY); // Box 298
		bodyModel[346] = new ModelRendererTurbo(this, 33, 323, textureX, textureY); // Box 299
		bodyModel[347] = new ModelRendererTurbo(this, 15, 325, textureX, textureY); // Box 300
		bodyModel[348] = new ModelRendererTurbo(this, 44, 329, textureX, textureY); // Box 302
		bodyModel[349] = new ModelRendererTurbo(this, 20, 333, textureX, textureY); // Box 305
		bodyModel[350] = new ModelRendererTurbo(this, 33, 336, textureX, textureY); // Box 306 duplex lower bed
		bodyModel[351] = new ModelRendererTurbo(this, 57, 333, textureX, textureY); // Box 307
		bodyModel[352] = new ModelRendererTurbo(this, 76, 332, textureX, textureY); // Box 308
		bodyModel[353] = new ModelRendererTurbo(this, 63, 323, textureX, textureY); // Box 309
		bodyModel[354] = new ModelRendererTurbo(this, 52, 325, textureX, textureY); // Box 310
		bodyModel[355] = new ModelRendererTurbo(this, 100, 334, textureX, textureY); // Box 311
		bodyModel[356] = new ModelRendererTurbo(this, 103, 324, textureX, textureY); // Box 312
		bodyModel[357] = new ModelRendererTurbo(this, 33, 326, textureX, textureY); // Box 313
		bodyModel[358] = new ModelRendererTurbo(this, 41, 317, textureX, textureY); // Box 314
		bodyModel[359] = new ModelRendererTurbo(this, 26, 322, textureX, textureY); // Box 315
		bodyModel[360] = new ModelRendererTurbo(this, 128, 328, textureX, textureY); // Box 316
		bodyModel[361] = new ModelRendererTurbo(this, 126, 325, textureX, textureY); // Box 317
		bodyModel[362] = new ModelRendererTurbo(this, 129, 336, textureX, textureY); // Box 318
		bodyModel[363] = new ModelRendererTurbo(this, 90, 324, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[364] = new ModelRendererTurbo(this, 86, 324, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[365] = new ModelRendererTurbo(this, 84, 324, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[366] = new ModelRendererTurbo(this, 98, 326, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[367] = new ModelRendererTurbo(this, 236, 298, textureX, textureY); // Box 38
		bodyModel[368] = new ModelRendererTurbo(this, 158, 298, textureX, textureY); // Box 38
		bodyModel[369] = new ModelRendererTurbo(this, 140, 300, textureX, textureY); // Box 38
		bodyModel[370] = new ModelRendererTurbo(this, 169, 304, textureX, textureY); // Box 38
		bodyModel[371] = new ModelRendererTurbo(this, 145, 308, textureX, textureY); // Box 38
		bodyModel[372] = new ModelRendererTurbo(this, 158, 311, textureX, textureY); // Box 38 duplex lower bed
		bodyModel[373] = new ModelRendererTurbo(this, 182, 308, textureX, textureY); // Box 38
		bodyModel[374] = new ModelRendererTurbo(this, 201, 307, textureX, textureY); // Box 38
		bodyModel[375] = new ModelRendererTurbo(this, 188, 298, textureX, textureY); // Box 38
		bodyModel[376] = new ModelRendererTurbo(this, 177, 300, textureX, textureY); // Box 38
		bodyModel[377] = new ModelRendererTurbo(this, 225, 309, textureX, textureY); // Box 38
		bodyModel[378] = new ModelRendererTurbo(this, 228, 299, textureX, textureY); // Box 38
		bodyModel[379] = new ModelRendererTurbo(this, 158, 301, textureX, textureY); // Box 38
		bodyModel[380] = new ModelRendererTurbo(this, 166, 292, textureX, textureY); // Box 38
		bodyModel[381] = new ModelRendererTurbo(this, 215, 299, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[382] = new ModelRendererTurbo(this, 151, 297, textureX, textureY); // Box 38
		bodyModel[383] = new ModelRendererTurbo(this, 211, 299, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[384] = new ModelRendererTurbo(this, 223, 301, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[385] = new ModelRendererTurbo(this, 209, 299, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[386] = new ModelRendererTurbo(this, 253, 303, textureX, textureY); // Box 38
		bodyModel[387] = new ModelRendererTurbo(this, 254, 311, textureX, textureY); // Box 38
		bodyModel[388] = new ModelRendererTurbo(this, 236, 323, textureX, textureY); // Box 298
		bodyModel[389] = new ModelRendererTurbo(this, 158, 323, textureX, textureY); // Box 299
		bodyModel[390] = new ModelRendererTurbo(this, 140, 325, textureX, textureY); // Box 300
		bodyModel[391] = new ModelRendererTurbo(this, 169, 329, textureX, textureY); // Box 302
		bodyModel[392] = new ModelRendererTurbo(this, 145, 333, textureX, textureY); // Box 305
		bodyModel[393] = new ModelRendererTurbo(this, 158, 336, textureX, textureY); // Box 306 duplex lower bed
		bodyModel[394] = new ModelRendererTurbo(this, 182, 333, textureX, textureY); // Box 307
		bodyModel[395] = new ModelRendererTurbo(this, 201, 332, textureX, textureY); // Box 308
		bodyModel[396] = new ModelRendererTurbo(this, 188, 323, textureX, textureY); // Box 309
		bodyModel[397] = new ModelRendererTurbo(this, 177, 325, textureX, textureY); // Box 310
		bodyModel[398] = new ModelRendererTurbo(this, 225, 334, textureX, textureY); // Box 311
		bodyModel[399] = new ModelRendererTurbo(this, 228, 324, textureX, textureY); // Box 312
		bodyModel[400] = new ModelRendererTurbo(this, 158, 326, textureX, textureY); // Box 313
		bodyModel[401] = new ModelRendererTurbo(this, 166, 317, textureX, textureY); // Box 314
		bodyModel[402] = new ModelRendererTurbo(this, 151, 322, textureX, textureY); // Box 315
		bodyModel[403] = new ModelRendererTurbo(this, 253, 328, textureX, textureY); // Box 316
		bodyModel[404] = new ModelRendererTurbo(this, 251, 325, textureX, textureY); // Box 317
		bodyModel[405] = new ModelRendererTurbo(this, 254, 336, textureX, textureY); // Box 318
		bodyModel[406] = new ModelRendererTurbo(this, 215, 324, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[407] = new ModelRendererTurbo(this, 211, 324, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[408] = new ModelRendererTurbo(this, 209, 324, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[409] = new ModelRendererTurbo(this, 223, 326, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[410] = new ModelRendererTurbo(this, 361, 298, textureX, textureY); // Box 38
		bodyModel[411] = new ModelRendererTurbo(this, 283, 298, textureX, textureY); // Box 38
		bodyModel[412] = new ModelRendererTurbo(this, 265, 300, textureX, textureY); // Box 38
		bodyModel[413] = new ModelRendererTurbo(this, 294, 304, textureX, textureY); // Box 38
		bodyModel[414] = new ModelRendererTurbo(this, 270, 308, textureX, textureY); // Box 38
		bodyModel[415] = new ModelRendererTurbo(this, 283, 311, textureX, textureY); // Box 38 duplex lower bed
		bodyModel[416] = new ModelRendererTurbo(this, 307, 308, textureX, textureY); // Box 38
		bodyModel[417] = new ModelRendererTurbo(this, 326, 307, textureX, textureY); // Box 38
		bodyModel[418] = new ModelRendererTurbo(this, 313, 298, textureX, textureY); // Box 38
		bodyModel[419] = new ModelRendererTurbo(this, 302, 300, textureX, textureY); // Box 38
		bodyModel[420] = new ModelRendererTurbo(this, 350, 309, textureX, textureY); // Box 38
		bodyModel[421] = new ModelRendererTurbo(this, 353, 299, textureX, textureY); // Box 38
		bodyModel[422] = new ModelRendererTurbo(this, 283, 301, textureX, textureY); // Box 38
		bodyModel[423] = new ModelRendererTurbo(this, 291, 292, textureX, textureY); // Box 38
		bodyModel[424] = new ModelRendererTurbo(this, 340, 299, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[425] = new ModelRendererTurbo(this, 276, 297, textureX, textureY); // Box 38
		bodyModel[426] = new ModelRendererTurbo(this, 336, 299, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[427] = new ModelRendererTurbo(this, 348, 301, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[428] = new ModelRendererTurbo(this, 334, 299, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[429] = new ModelRendererTurbo(this, 361, 323, textureX, textureY); // Box 298
		bodyModel[430] = new ModelRendererTurbo(this, 283, 323, textureX, textureY); // Box 299
		bodyModel[431] = new ModelRendererTurbo(this, 265, 325, textureX, textureY); // Box 300
		bodyModel[432] = new ModelRendererTurbo(this, 294, 329, textureX, textureY); // Box 302
		bodyModel[433] = new ModelRendererTurbo(this, 270, 333, textureX, textureY); // Box 305
		bodyModel[434] = new ModelRendererTurbo(this, 283, 336, textureX, textureY); // Box 306 duplex lower bed
		bodyModel[435] = new ModelRendererTurbo(this, 307, 333, textureX, textureY); // Box 307
		bodyModel[436] = new ModelRendererTurbo(this, 326, 332, textureX, textureY); // Box 308
		bodyModel[437] = new ModelRendererTurbo(this, 313, 323, textureX, textureY); // Box 309
		bodyModel[438] = new ModelRendererTurbo(this, 302, 325, textureX, textureY); // Box 310
		bodyModel[439] = new ModelRendererTurbo(this, 350, 334, textureX, textureY); // Box 311
		bodyModel[440] = new ModelRendererTurbo(this, 353, 324, textureX, textureY); // Box 312
		bodyModel[441] = new ModelRendererTurbo(this, 283, 326, textureX, textureY); // Box 313
		bodyModel[442] = new ModelRendererTurbo(this, 291, 317, textureX, textureY); // Box 314
		bodyModel[443] = new ModelRendererTurbo(this, 276, 322, textureX, textureY); // Box 315
		bodyModel[444] = new ModelRendererTurbo(this, 340, 324, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[445] = new ModelRendererTurbo(this, 336, 324, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[446] = new ModelRendererTurbo(this, 334, 324, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[447] = new ModelRendererTurbo(this, 348, 326, textureX, textureY); // Box 38 duplex upper bed
		bodyModel[448] = new ModelRendererTurbo(this, 126, 300, textureX, textureY); // Box 38
		bodyModel[449] = new ModelRendererTurbo(this, 251, 300, textureX, textureY); // Box 38
		bodyModel[450] = new ModelRendererTurbo(this, 421, 284, textureX, textureY); // Box 461
		bodyModel[451] = new ModelRendererTurbo(this, 112, 309, textureX, textureY); // Box 38
		bodyModel[452] = new ModelRendererTurbo(this, 112, 334, textureX, textureY); // Box 461
		bodyModel[453] = new ModelRendererTurbo(this, 237, 309, textureX, textureY); // Box 38
		bodyModel[454] = new ModelRendererTurbo(this, 237, 334, textureX, textureY); // Box 461
		bodyModel[455] = new ModelRendererTurbo(this, 362, 309, textureX, textureY); // Box 38
		bodyModel[456] = new ModelRendererTurbo(this, 161, 244, textureX, textureY); // Box 38
		bodyModel[457] = new ModelRendererTurbo(this, 177, 276, textureX, textureY); // Box 225
		bodyModel[458] = new ModelRendererTurbo(this, 185, 244, textureX, textureY); // Box 38
		bodyModel[459] = new ModelRendererTurbo(this, 201, 276, textureX, textureY); // Box 225
		bodyModel[460] = new ModelRendererTurbo(this, 176, 253, textureX, textureY); // Box 38
		bodyModel[461] = new ModelRendererTurbo(this, 192, 285, textureX, textureY); // Box 225
		bodyModel[462] = new ModelRendererTurbo(this, 176, 242, textureX, textureY); // Box 476 hallway door F
		bodyModel[463] = new ModelRendererTurbo(this, 152, 244, textureX, textureY); // Box 476 hallway door R
		bodyModel[464] = new ModelRendererTurbo(this, 192, 274, textureX, textureY); // Box 476 hallway door F
		bodyModel[465] = new ModelRendererTurbo(this, 168, 276, textureX, textureY); // Box 476 hallway door R
		bodyModel[466] = new ModelRendererTurbo(this, 244, 270, textureX, textureY); // Box 225
		bodyModel[467] = new ModelRendererTurbo(this, 226, 244, textureX, textureY); // Box 38
		bodyModel[468] = new ModelRendererTurbo(this, 331, 360, textureX, textureY); // Box 225
		bodyModel[469] = new ModelRendererTurbo(this, 400, 326, textureX, textureY); // Box 38
		bodyModel[470] = new ModelRendererTurbo(this, 298, 352, textureX, textureY); // Box 38
		bodyModel[471] = new ModelRendererTurbo(this, 293, 366, textureX, textureY); // Box 38
		bodyModel[472] = new ModelRendererTurbo(this, 376, 319, textureX, textureY); // Box 38
		bodyModel[473] = new ModelRendererTurbo(this, 395, 326, textureX, textureY); // Box 38
		bodyModel[474] = new ModelRendererTurbo(this, 78, 347, textureX, textureY); // Box 38
		bodyModel[475] = new ModelRendererTurbo(this, 196, 352, textureX, textureY); // Box 38
		bodyModel[476] = new ModelRendererTurbo(this, 465, 312, textureX, textureY); // Box 38
		bodyModel[477] = new ModelRendererTurbo(this, 450, 158, textureX, textureY); // Box 38
		bodyModel[478] = new ModelRendererTurbo(this, 111, 349, textureX, textureY); // Box 38
		bodyModel[479] = new ModelRendererTurbo(this, 165, 365, textureX, textureY); // Folding seat/bed F
		bodyModel[480] = new ModelRendererTurbo(this, 135, 367, textureX, textureY); // Box 38
		bodyModel[481] = new ModelRendererTurbo(this, 137, 372, textureX, textureY); // Box 300
		bodyModel[482] = new ModelRendererTurbo(this, 124, 374, textureX, textureY); // Box 300
		bodyModel[483] = new ModelRendererTurbo(this, 124, 371, textureX, textureY); // Box 300
		bodyModel[484] = new ModelRendererTurbo(this, 134, 344, textureX, textureY); // Folding bed F
		bodyModel[485] = new ModelRendererTurbo(this, 148, 363, textureX, textureY); // Box 38
		bodyModel[486] = new ModelRendererTurbo(this, 56, 344, textureX, textureY); // Box 38
		bodyModel[487] = new ModelRendererTurbo(this, 165, 370, textureX, textureY); // Box 38
		bodyModel[488] = new ModelRendererTurbo(this, 276, 346, textureX, textureY); // Box 38
		bodyModel[489] = new ModelRendererTurbo(this, 233, 354, textureX, textureY); // Box 38
		bodyModel[490] = new ModelRendererTurbo(this, 20, 354, textureX, textureY); // Box 38
		bodyModel[491] = new ModelRendererTurbo(this, 151, 348, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[492] = new ModelRendererTurbo(this, 272, 351, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[493] = new ModelRendererTurbo(this, 52, 349, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[494] = new ModelRendererTurbo(this, 214, 350, textureX, textureY); // Box 38
		bodyModel[495] = new ModelRendererTurbo(this, 229, 368, textureX, textureY); // Box 38
		bodyModel[496] = new ModelRendererTurbo(this, 1, 350, textureX, textureY); // Box 38
		bodyModel[497] = new ModelRendererTurbo(this, 1, 367, textureX, textureY); // Box 38
		bodyModel[498] = new ModelRendererTurbo(this, 237, 345, textureX, textureY); // Folding seat/bed R
		bodyModel[499] = new ModelRendererTurbo(this, 24, 345, textureX, textureY); // Folding seat/bed R

		bodyModel[0].addBox(0F, 0F, 0F, 118, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-61.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(60.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(56.5F, 1F, -5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[3].setRotationPoint(59.5F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[4].setRotationPoint(56.5F, 3F, -5F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[5].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[6].setRotationPoint(-61.5F, 3F, -5F);

		bodyModel[7].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[7].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[8].setRotationPoint(43F, 4F, -1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[9].setRotationPoint(-45F, 4F, -1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[10].setRotationPoint(60.51F, 3F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[11].setRotationPoint(56.49F, 3F, -9F);

		bodyModel[12].addShapeBox(0F, 1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[12].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[13].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[13].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[14].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[14].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[15].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[15].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[16].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[16].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[17].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[17].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[18].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[19].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[19].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[20].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[20].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[21].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[22].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[22].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[23].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[24].addShapeBox(0F, 2F, -2.5F, 4, 0, 4, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 1F, -0.5F, 0F, 1F, -0.5F); // Left step part
		bodyModel[24].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 144
		bodyModel[25].setRotationPoint(60.51F, 3F, 8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 145
		bodyModel[26].setRotationPoint(56.49F, 3F, 8F);

		bodyModel[27].addShapeBox(0F, 1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[27].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[28].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[28].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[29].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[29].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[30].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[30].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[31].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[31].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[32].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[32].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[33].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[33].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[34].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[34].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[35].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[35].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[36].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[36].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[37].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[37].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[38].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[38].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[39].addShapeBox(0F, 2F, -1.5F, 4, 0, 4, 0F,0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[39].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[40].setRotationPoint(56.5F, 1F, -10.99F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[41].setRotationPoint(56.5F, 1F, 4.99F);

		bodyModel[42].addShapeBox(0F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[42].setRotationPoint(56.51F, -14F, -10.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 38
		bodyModel[43].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 128
		bodyModel[44].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[45].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[46].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[47].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[48].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[49].setRotationPoint(56.51F, -14F, 10.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[50].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[51].setRotationPoint(55.5F, -15F, -3F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[52].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[53].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[54].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[54].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[55].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[56].setRotationPoint(55.51F, -14F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[57].setRotationPoint(-61.49F, -14F, -3F);

		bodyModel[58].addBox(0F, 0F, 0F, 123, 2, 6, 0F); // Box 128
		bodyModel[58].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[59].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[60].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 37, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[61].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 37, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[62].setRotationPoint(-61.5F, -19F, 3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[63].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[64].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[65].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[66].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[67].setRotationPoint(6.5F, -18F, 10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[68].setRotationPoint(6.5F, -18.5F, 8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 190
		bodyModel[69].setRotationPoint(49.5F, -18F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 191
		bodyModel[70].setRotationPoint(49.5F, -18.5F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[71].setRotationPoint(56F, -6F, -12F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[72].setRotationPoint(61F, -6F, -12F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[73].setRotationPoint(56F, -6F, 11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[74].setRotationPoint(61F, -6F, 11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 37, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[75].setRotationPoint(10.5F, -15F, -4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[76].setRotationPoint(50.5F, -15F, -5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[77].setRotationPoint(47.5F, -15F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[78].setRotationPoint(46.5F, -15F, -10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 37, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[79].setRotationPoint(10.5F, -15F, 3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[80].setRotationPoint(47.5F, -9F, 3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[81].setRotationPoint(53.5F, -15F, 4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[82].setRotationPoint(51.5F, -9F, 5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[83].setRotationPoint(54.5F, -10F, 5F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[84].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[85].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[86].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[87].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[88].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[89].setRotationPoint(63F, -14F, -5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[90].setRotationPoint(63F, -14F, 3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[91].setRotationPoint(63F, -15F, -5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[92].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[93].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[94].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[95].setRotationPoint(-63F, -15F, -4F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[96].setRotationPoint(-63F, 1F, -4F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[97].setRotationPoint(-63F, -14F, -4F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[98].setRotationPoint(-63F, -14F, 3F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[99].setRotationPoint(50.5F, -6F, 4F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 12, 16, 0, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[100].setRotationPoint(54.5F, -15F, 4.49F);
		bodyModel[100].rotateAngleY = 1.57079633F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[101].setRotationPoint(-61.5F, -16.25F, -10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 22, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[102].setRotationPoint(39.5F, -16.25F, -10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[103].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[104].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull
		bodyModel[105].setRotationPoint(-61.5F, 4F, 10.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull
		bodyModel[106].setRotationPoint(-61.5F, 3F, 10.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[107].setRotationPoint(-53.25F, 3F, 10.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[108].setRotationPoint(-55F, 4F, 10.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[109].setRotationPoint(34.75F, 3F, 10.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[110].setRotationPoint(33F, 4F, 10.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[111].setRotationPoint(-35.75F, 3F, 10.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[112].setRotationPoint(-35F, 4F, 10.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[113].setRotationPoint(-34.5F, 3F, 10.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30 cull
		bodyModel[114].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31 cull
		bodyModel[115].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[116].setRotationPoint(-53.25F, 3F, -11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[117].setRotationPoint(-55F, 4F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[118].setRotationPoint(34.75F, 3F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[119].setRotationPoint(33F, 4F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[120].setRotationPoint(-35.75F, 3F, -11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[121].setRotationPoint(-35F, 4F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[122].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[123].setRotationPoint(52.25F, 3F, 10.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[124].setRotationPoint(53F, 4F, 10.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[125].setRotationPoint(52.25F, 3F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[126].setRotationPoint(53F, 4F, -11F);
		bodyModel[126].rotateAngleZ = 0.03490659F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[127].setRotationPoint(53.5F, 3F, 10.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[128].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[129].setRotationPoint(60.5F, 3F, 10.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[130].setRotationPoint(60.5F, 4F, 10.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[131].setRotationPoint(54.5F, 4F, 10.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
		bodyModel[132].setRotationPoint(56.5F, 3F, 7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
		bodyModel[133].setRotationPoint(56.5F, 4F, 8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[134].setRotationPoint(60.5F, 3F, 7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 143
		bodyModel[135].setRotationPoint(60.5F, 4F, 8F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[136].setRotationPoint(60.5F, 3F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[137].setRotationPoint(60.5F, 4F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[138].setRotationPoint(54.5F, 4F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[139].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[140].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[141].setRotationPoint(60.5F, 3F, -10.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[142].setRotationPoint(60.5F, 4F, -10.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[143].setRotationPoint(63F, 1F, -5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[144].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 39, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[145].setRotationPoint(-60.5F, -11F, -9.9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 31, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[146].setRotationPoint(-56.5F, -11F, 9.9F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[147].setRotationPoint(-61.5F, -17F, -7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 37, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[148].setRotationPoint(-61.5F, -18F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[149].setRotationPoint(-61.5F, -18F, 7F);

		bodyModel[150].addBox(0F, 0F, 0F, 37, 1, 14, 0F); // Box 128
		bodyModel[150].setRotationPoint(-61.5F, -18F, -7F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 22, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[151].setRotationPoint(39.5F, -17F, -7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 22, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[152].setRotationPoint(39.5F, -18F, -10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 22, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[153].setRotationPoint(39.5F, -18F, 7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[154].setRotationPoint(-33.5F, 4F, 10.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[155].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[156].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[157].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[158].setRotationPoint(61.5F, -19F, -10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[159].setRotationPoint(61.5F, -20F, -7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[160].setRotationPoint(61.5F, -20F, -3F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[161].setRotationPoint(61.5F, -15F, 11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[162].setRotationPoint(61.5F, -15F, 9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[163].setRotationPoint(61.5F, -19F, 7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[164].setRotationPoint(61.5F, -20F, 3F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[165].setRotationPoint(63F, -15F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[166].setRotationPoint(63F, -16F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[167].setRotationPoint(63F, 1F, -10F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[168].setRotationPoint(63F, -19F, -10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[169].setRotationPoint(63F, -20F, -7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[170].setRotationPoint(63F, -20F, -3F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 128
		bodyModel[171].setRotationPoint(63F, -19F, -1F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[172].setRotationPoint(63F, -18.75F, -5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[173].setRotationPoint(63F, -15F, 10F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[174].setRotationPoint(63F, -16F, 9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[175].setRotationPoint(63F, -19F, 7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[176].setRotationPoint(63F, -20F, 3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[177].setRotationPoint(63F, -18.75F, 4F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[178].setRotationPoint(63F, -16F, -4F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[179].setRotationPoint(63F, -16F, 1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 128
		bodyModel[180].setRotationPoint(63F, -15.8F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[181].setRotationPoint(63F, -16F, -5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[182].setRotationPoint(63F, -16F, 4F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[183].setRotationPoint(63.5F, -7F, -10F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[184].setRotationPoint(63.5F, -7F, 5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[185].setRotationPoint(-63.5F, -15F, -11F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[186].setRotationPoint(-63F, -15F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[187].setRotationPoint(-63.5F, -16F, -11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[188].setRotationPoint(-63F, -15F, -11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[189].setRotationPoint(-63.5F, 1F, -10F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[190].setRotationPoint(-63.5F, -19F, -10F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[191].setRotationPoint(-63F, -19F, -10F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[192].setRotationPoint(-63.5F, -20F, -7F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[193].setRotationPoint(-63F, -20F, -7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[194].setRotationPoint(-63.5F, -20F, -3F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[195].setRotationPoint(-63F, -20F, -3F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[196].setRotationPoint(-63.5F, -16F, -4F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[197].setRotationPoint(-63.5F, -16F, 1F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 128
		bodyModel[198].setRotationPoint(-63.5F, -19F, -1F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[199].setRotationPoint(-63.5F, -18.75F, -5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[200].setRotationPoint(-63.5F, -15F, 10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[201].setRotationPoint(-63F, -15F, 11F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[202].setRotationPoint(-63.5F, -16F, 9F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[203].setRotationPoint(-63F, -15F, 9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[204].setRotationPoint(-63.5F, -19F, 7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[205].setRotationPoint(-63F, -19F, 7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[206].setRotationPoint(-63.5F, -20F, 3F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[207].setRotationPoint(-63F, -20F, 3F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[208].setRotationPoint(-63.5F, -18.75F, 4F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 128
		bodyModel[209].setRotationPoint(-63.5F, -15.8F, -1F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[210].setRotationPoint(-63.5F, -7F, -10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[211].setRotationPoint(-63.5F, -7F, 5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[212].setRotationPoint(-61.5F, -4.5F, -12F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[213].setRotationPoint(-61.5F, -4.5F, 11F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[214].setRotationPoint(-61.5F, -1F, -12F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[215].setRotationPoint(-61.5F, -1F, 11F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[216].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[217].setRotationPoint(-63.5F, -16F, 4F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31 cull
		bodyModel[218].setRotationPoint(-61.5F, 3F, 10F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31
		bodyModel[219].setRotationPoint(-61.5F, 5F, 10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31 cull
		bodyModel[220].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31
		bodyModel[221].setRotationPoint(-61.5F, 5F, -11F);

		bodyModel[222].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 283
		bodyModel[222].setRotationPoint(18.5F, 3F, 5F);

		bodyModel[223].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // Box 283
		bodyModel[223].setRotationPoint(26.5F, 3F, 5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[224].setRotationPoint(-8.5F, 3F, 3F);

		bodyModel[225].addBox(0F, 0F, 0F, 25, 4, 6, 0F); // Box 2
		bodyModel[225].setRotationPoint(-11.5F, 4F, -3F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 25, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[226].setRotationPoint(-11.5F, 8F, -3F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[227].setRotationPoint(-8.5F, 3F, -11F);

		bodyModel[228].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 283
		bodyModel[228].setRotationPoint(-16.5F, 3F, 5F);

		bodyModel[229].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 283
		bodyModel[229].setRotationPoint(-29.5F, 3F, 5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[230].setRotationPoint(-5.5F, 2.75F, 9.4F);
		bodyModel[230].rotateAngleX = -0.78539816F;

		bodyModel[231].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[231].setRotationPoint(-5.51F, 3F, 8.9F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[232].setRotationPoint(2.51F, 3F, 8.9F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[233].setRotationPoint(3.5F, 2.75F, 9.4F);
		bodyModel[233].rotateAngleX = -0.78539816F;

		bodyModel[234].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[234].setRotationPoint(3.49F, 3F, 8.9F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[235].setRotationPoint(11.51F, 3F, 8.9F);

		bodyModel[236].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 633
		bodyModel[236].setRotationPoint(12.5F, 3F, 9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 190
		bodyModel[237].setRotationPoint(24.5F, -18F, -11F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 191
		bodyModel[238].setRotationPoint(24.5F, -18.5F, -10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 190
		bodyModel[239].setRotationPoint(-8.5F, -18F, -11F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 191
		bodyModel[240].setRotationPoint(-8.5F, -18.5F, -10F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 190
		bodyModel[241].setRotationPoint(-40.5F, -18F, -11F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 191
		bodyModel[242].setRotationPoint(-40.5F, -18.5F, -10F);

		bodyModel[243].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 624
		bodyModel[243].setRotationPoint(19.5F, 3F, -10F);

		bodyModel[244].addBox(0F, 0F, 0F, 3, 5, 5, 0F); // Box 628
		bodyModel[244].setRotationPoint(27.5F, 3F, -10F);

		bodyModel[245].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 624
		bodyModel[245].setRotationPoint(-29.5F, 3F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 41
		bodyModel[246].setRotationPoint(17.5F, 2.75F, -10F);
		bodyModel[246].rotateAngleZ = -0.78539816F;

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[247].setRotationPoint(17F, 3F, -10.01F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[248].setRotationPoint(17F, 3F, -5.99F);

		bodyModel[249].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 739
		bodyModel[249].setRotationPoint(13.5F, 3F, -10F);

		bodyModel[250].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 283
		bodyModel[250].setRotationPoint(4.5F, 3F, -10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[251].setRotationPoint(-3.5F, 2.75F, -9.4F);
		bodyModel[251].rotateAngleX = -0.78539816F;

		bodyModel[252].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[252].setRotationPoint(-3.51F, 3F, -9.9F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[253].setRotationPoint(3.51F, 3F, -9.9F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.15F, -0.05F, -0.25F, -0.15F, -0.05F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.375F, 0F, 0.2F, -0.375F, 0F, 0.2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 228
		bodyModel[254].setRotationPoint(-58.1F, -20.6F, 3F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0.1F, 0F, -0.05F, 0.1F, 0F, -0.05F, -0.025F, -0.5F, -0.25F, -0.025F, -0.5F, 0F, -0.375F, 0F, 0.2F, -0.375F, 0F, 0.2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 228
		bodyModel[255].setRotationPoint(-58.1F, -20.5F, 3.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, -0.75F, 0F, -0.43F, -0.75F, 0F, -0.51F, 0F, 0F, -0.51F, 0F); // Box 204
		bodyModel[256].setRotationPoint(57F, -19.36F, -8.36F);
		bodyModel[256].rotateAngleX = -1.04283423F;

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.08F, -0.75F, 0F, 0.08F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[257].setRotationPoint(57F, -17.65F, -10.92F);
		bodyModel[257].rotateAngleX = -0.41887902F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[258].setRotationPoint(47.5F, -15F, -4F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 539
		bodyModel[259].setRotationPoint(50.5F, -3F, 6F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[260].setRotationPoint(51.5F, -7F, 4F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[261].setRotationPoint(46.5F, -15F, 4F);

		bodyModel[262].addShapeBox(-0.5F, -6.5F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 porter's bed
		bodyModel[262].setRotationPoint(54F, -9.5F, 5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[263].setRotationPoint(29.5F, -15F, -10F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[264].setRotationPoint(38.5F, -10F, -10F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[265].setRotationPoint(39.5F, -3F, -8F);

		bodyModel[266].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 38
		bodyModel[266].setRotationPoint(43.5F, -3F, -10F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[267].setRotationPoint(38.5F, -8F, -10F);

		bodyModel[268].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 38
		bodyModel[268].setRotationPoint(44.5F, -5F, -5F);

		bodyModel[269].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 38
		bodyModel[269].setRotationPoint(44.5F, -1F, -10F);

		bodyModel[270].addBox(0F, 0F, 0F, 5, 9, 1, 0F); // Box 38
		bodyModel[270].setRotationPoint(36.5F, -8F, -5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 7, 0, 4, 0F,0F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[271].setRotationPoint(-48.5F, -14.5F, 8F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38 duplex lower bed
		bodyModel[272].setRotationPoint(29.5F, -5F, -10F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[273].setRotationPoint(30.5F, -6F, -10F);

		bodyModel[274].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 38
		bodyModel[274].setRotationPoint(34.5F, -9F, -10F);

		bodyModel[275].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 38
		bodyModel[275].setRotationPoint(35.5F, -8F, -10F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[276].setRotationPoint(35.5F, -7F, -10F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[277].setRotationPoint(30.5F, -9F, -8F);

		bodyModel[278].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 38
		bodyModel[278].setRotationPoint(30.5F, -14F, -5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 0, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 38
		bodyModel[279].setRotationPoint(38.5F, -7F, -10F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[280].setRotationPoint(29.5F, -5F, -10F);

		bodyModel[281].addBox(0F, 0F, 0F, 22, 1, 14, 0F); // Box 128
		bodyModel[281].setRotationPoint(39.5F, -18F, -7F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 24, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[282].setRotationPoint(37.5F, -19F, -7F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 24, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[283].setRotationPoint(37.5F, -19F, 3F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[284].setRotationPoint(39.5F, -15F, -10F);

		bodyModel[285].addShapeBox(-0.5F, -6.5F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 duplex upper bed
		bodyModel[285].setRotationPoint(38F, -9.5F, -10F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[286].setRotationPoint(37.5F, -17F, -5F);

		bodyModel[287].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38 duplex upper bed
		bodyModel[287].setRotationPoint(38F, -9.5F, -8.75F);

		bodyModel[288].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 duplex upper bed
		bodyModel[288].setRotationPoint(38F, -9.5F, -10F);

		bodyModel[289].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 duplex upper bed
		bodyModel[289].setRotationPoint(38F, -9.5F, -6F);

		bodyModel[290].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 38
		bodyModel[290].setRotationPoint(26.5F, -3F, -10F);

		bodyModel[291].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 38
		bodyModel[291].setRotationPoint(27.5F, -5F, -5F);

		bodyModel[292].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 38
		bodyModel[292].setRotationPoint(27.5F, -1F, -10F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[293].setRotationPoint(29.5F, -15F, 4F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[294].setRotationPoint(38.5F, -10F, 5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[295].setRotationPoint(39.5F, -3F, 5F);

		bodyModel[296].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 301
		bodyModel[296].setRotationPoint(43.5F, -3F, 5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[297].setRotationPoint(38.5F, -8F, 5F);

		bodyModel[298].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 303
		bodyModel[298].setRotationPoint(44.5F, -5F, 4F);

		bodyModel[299].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 304
		bodyModel[299].setRotationPoint(44.5F, -1F, 5F);

		bodyModel[300].addBox(0F, 0F, 0F, 5, 9, 1, 0F); // Box 305
		bodyModel[300].setRotationPoint(36.5F, -8F, 4F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 306 duplex lower bed
		bodyModel[301].setRotationPoint(29.5F, -5F, 5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[302].setRotationPoint(30.5F, -6F, 4F);

		bodyModel[303].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 308
		bodyModel[303].setRotationPoint(34.5F, -9F, 5F);

		bodyModel[304].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 309
		bodyModel[304].setRotationPoint(35.5F, -8F, 4F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[305].setRotationPoint(35.5F, -7F, 4F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[306].setRotationPoint(30.5F, -9F, 5F);

		bodyModel[307].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 312
		bodyModel[307].setRotationPoint(30.5F, -14F, 4F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 0, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 313
		bodyModel[308].setRotationPoint(38.5F, -7F, 5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[309].setRotationPoint(39.5F, -15F, 5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[310].setRotationPoint(37.5F, -17F, 4F);

		bodyModel[311].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 316
		bodyModel[311].setRotationPoint(26.5F, -3F, 5F);

		bodyModel[312].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 317
		bodyModel[312].setRotationPoint(27.5F, -5F, 4F);

		bodyModel[313].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 318
		bodyModel[313].setRotationPoint(27.5F, -1F, 5F);

		bodyModel[314].addShapeBox(-0.5F, -6.5F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 duplex upper bed
		bodyModel[314].setRotationPoint(38F, -9.5F, 5F);

		bodyModel[315].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38 duplex upper bed
		bodyModel[315].setRotationPoint(38F, -9.5F, 6.25F);

		bodyModel[316].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 duplex upper bed
		bodyModel[316].setRotationPoint(38F, -9.5F, 5F);

		bodyModel[317].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 duplex upper bed
		bodyModel[317].setRotationPoint(38F, -9.5F, 9F);

		bodyModel[318].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // Box 379
		bodyModel[318].setRotationPoint(50.5F, -8.5F, -10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[319].setRotationPoint(50.5F, -6F, -10F);

		bodyModel[320].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[320].setRotationPoint(51.5F, -5F, -9F);
		bodyModel[320].rotateAngleY = -0.78539816F;

		bodyModel[321].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 38
		bodyModel[321].setRotationPoint(52.13F, -2F, -9.75F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[322].setRotationPoint(53.63F, -1F, -10F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[323].setRotationPoint(53.13F, 0.5F, -9.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[324].setRotationPoint(12.5F, -15F, -10F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[325].setRotationPoint(21.5F, -10F, -10F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[326].setRotationPoint(22.5F, -3F, -8F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[327].setRotationPoint(21.5F, -8F, -10F);

		bodyModel[328].addBox(0F, 0F, 0F, 5, 9, 1, 0F); // Box 38
		bodyModel[328].setRotationPoint(19.5F, -8F, -5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38 duplex lower bed
		bodyModel[329].setRotationPoint(12.5F, -5F, -10F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[330].setRotationPoint(13.5F, -6F, -10F);

		bodyModel[331].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 38
		bodyModel[331].setRotationPoint(17.5F, -9F, -10F);

		bodyModel[332].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 38
		bodyModel[332].setRotationPoint(18.5F, -8F, -10F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[333].setRotationPoint(18.5F, -7F, -10F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[334].setRotationPoint(13.5F, -9F, -8F);

		bodyModel[335].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 38
		bodyModel[335].setRotationPoint(13.5F, -14F, -5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 0, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 38
		bodyModel[336].setRotationPoint(21.5F, -7F, -10F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[337].setRotationPoint(22.5F, -15F, -10F);

		bodyModel[338].addShapeBox(-0.5F, -6.5F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 duplex upper bed
		bodyModel[338].setRotationPoint(21F, -9.5F, -10F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[339].setRotationPoint(20.5F, -17F, -5F);

		bodyModel[340].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38 duplex upper bed
		bodyModel[340].setRotationPoint(21F, -9.5F, -8.75F);

		bodyModel[341].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 duplex upper bed
		bodyModel[341].setRotationPoint(21F, -9.5F, -10F);

		bodyModel[342].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 duplex upper bed
		bodyModel[342].setRotationPoint(21F, -9.5F, -6F);

		bodyModel[343].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 38
		bodyModel[343].setRotationPoint(9.5F, -3F, -10F);

		bodyModel[344].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 38
		bodyModel[344].setRotationPoint(10.5F, -1F, -10F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[345].setRotationPoint(12.5F, -15F, 4F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[346].setRotationPoint(21.5F, -10F, 5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[347].setRotationPoint(22.5F, -3F, 5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[348].setRotationPoint(21.5F, -8F, 5F);

		bodyModel[349].addBox(0F, 0F, 0F, 5, 9, 1, 0F); // Box 305
		bodyModel[349].setRotationPoint(19.5F, -8F, 4F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 306 duplex lower bed
		bodyModel[350].setRotationPoint(12.5F, -5F, 5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[351].setRotationPoint(13.5F, -6F, 4F);

		bodyModel[352].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 308
		bodyModel[352].setRotationPoint(17.5F, -9F, 5F);

		bodyModel[353].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 309
		bodyModel[353].setRotationPoint(18.5F, -8F, 4F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[354].setRotationPoint(18.5F, -7F, 4F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[355].setRotationPoint(13.5F, -9F, 5F);

		bodyModel[356].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 312
		bodyModel[356].setRotationPoint(13.5F, -14F, 4F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 0, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 313
		bodyModel[357].setRotationPoint(21.5F, -7F, 5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[358].setRotationPoint(22.5F, -15F, 5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[359].setRotationPoint(20.5F, -17F, 4F);

		bodyModel[360].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 316
		bodyModel[360].setRotationPoint(9.5F, -3F, 5F);

		bodyModel[361].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 317
		bodyModel[361].setRotationPoint(10.5F, -5F, 4F);

		bodyModel[362].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 318
		bodyModel[362].setRotationPoint(10.5F, -1F, 5F);

		bodyModel[363].addShapeBox(-0.5F, -6.5F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 duplex upper bed
		bodyModel[363].setRotationPoint(21F, -9.5F, 5F);

		bodyModel[364].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38 duplex upper bed
		bodyModel[364].setRotationPoint(21F, -9.5F, 6.25F);

		bodyModel[365].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 duplex upper bed
		bodyModel[365].setRotationPoint(21F, -9.5F, 5F);

		bodyModel[366].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 duplex upper bed
		bodyModel[366].setRotationPoint(21F, -9.5F, 9F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[367].setRotationPoint(-4.5F, -15F, -10F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[368].setRotationPoint(4.5F, -10F, -10F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[369].setRotationPoint(5.5F, -3F, -8F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[370].setRotationPoint(4.5F, -8F, -10F);

		bodyModel[371].addBox(0F, 0F, 0F, 5, 9, 1, 0F); // Box 38
		bodyModel[371].setRotationPoint(2.5F, -8F, -5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38 duplex lower bed
		bodyModel[372].setRotationPoint(-4.5F, -5F, -10F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[373].setRotationPoint(-3.5F, -6F, -10F);

		bodyModel[374].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 38
		bodyModel[374].setRotationPoint(0.5F, -9F, -10F);

		bodyModel[375].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 38
		bodyModel[375].setRotationPoint(1.5F, -8F, -10F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[376].setRotationPoint(1.5F, -7F, -10F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[377].setRotationPoint(-3.5F, -9F, -8F);

		bodyModel[378].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 38
		bodyModel[378].setRotationPoint(-3.5F, -14F, -5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 0, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 38
		bodyModel[379].setRotationPoint(4.5F, -7F, -10F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[380].setRotationPoint(5.5F, -15F, -10F);

		bodyModel[381].addShapeBox(-0.5F, -6.5F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 duplex upper bed
		bodyModel[381].setRotationPoint(4F, -9.5F, -10F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[382].setRotationPoint(3.5F, -17F, -5F);

		bodyModel[383].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38 duplex upper bed
		bodyModel[383].setRotationPoint(4F, -9.5F, -8.75F);

		bodyModel[384].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 duplex upper bed
		bodyModel[384].setRotationPoint(4F, -9.5F, -10F);

		bodyModel[385].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 duplex upper bed
		bodyModel[385].setRotationPoint(4F, -9.5F, -6F);

		bodyModel[386].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 38
		bodyModel[386].setRotationPoint(-7.5F, -3F, -10F);

		bodyModel[387].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 38
		bodyModel[387].setRotationPoint(-6.5F, -1F, -10F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[388].setRotationPoint(-4.5F, -15F, 4F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[389].setRotationPoint(4.5F, -10F, 5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[390].setRotationPoint(5.5F, -3F, 5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[391].setRotationPoint(4.5F, -8F, 5F);

		bodyModel[392].addBox(0F, 0F, 0F, 5, 9, 1, 0F); // Box 305
		bodyModel[392].setRotationPoint(2.5F, -8F, 4F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 306 duplex lower bed
		bodyModel[393].setRotationPoint(-4.5F, -5F, 5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[394].setRotationPoint(-3.5F, -6F, 4F);

		bodyModel[395].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 308
		bodyModel[395].setRotationPoint(0.5F, -9F, 5F);

		bodyModel[396].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 309
		bodyModel[396].setRotationPoint(1.5F, -8F, 4F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[397].setRotationPoint(1.5F, -7F, 4F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[398].setRotationPoint(-3.5F, -9F, 5F);

		bodyModel[399].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 312
		bodyModel[399].setRotationPoint(-3.5F, -14F, 4F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 0, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 313
		bodyModel[400].setRotationPoint(4.5F, -7F, 5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[401].setRotationPoint(5.5F, -15F, 5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[402].setRotationPoint(3.5F, -17F, 4F);

		bodyModel[403].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 316
		bodyModel[403].setRotationPoint(-7.5F, -3F, 5F);

		bodyModel[404].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 317
		bodyModel[404].setRotationPoint(-6.5F, -5F, 4F);

		bodyModel[405].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 318
		bodyModel[405].setRotationPoint(-6.5F, -1F, 5F);

		bodyModel[406].addShapeBox(-0.5F, -6.5F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 duplex upper bed
		bodyModel[406].setRotationPoint(4F, -9.5F, 5F);

		bodyModel[407].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38 duplex upper bed
		bodyModel[407].setRotationPoint(4F, -9.5F, 6.25F);

		bodyModel[408].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 duplex upper bed
		bodyModel[408].setRotationPoint(4F, -9.5F, 5F);

		bodyModel[409].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 duplex upper bed
		bodyModel[409].setRotationPoint(4F, -9.5F, 9F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[410].setRotationPoint(-21.5F, -15F, -10F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[411].setRotationPoint(-12.5F, -10F, -10F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[412].setRotationPoint(-11.5F, -3F, -8F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[413].setRotationPoint(-12.5F, -8F, -10F);

		bodyModel[414].addBox(0F, 0F, 0F, 5, 9, 1, 0F); // Box 38
		bodyModel[414].setRotationPoint(-14.5F, -8F, -5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38 duplex lower bed
		bodyModel[415].setRotationPoint(-21.5F, -5F, -10F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[416].setRotationPoint(-20.5F, -6F, -10F);

		bodyModel[417].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 38
		bodyModel[417].setRotationPoint(-16.5F, -9F, -10F);

		bodyModel[418].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 38
		bodyModel[418].setRotationPoint(-15.5F, -8F, -10F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[419].setRotationPoint(-15.5F, -7F, -10F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[420].setRotationPoint(-20.5F, -9F, -8F);

		bodyModel[421].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 38
		bodyModel[421].setRotationPoint(-20.5F, -14F, -5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 0, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 38
		bodyModel[422].setRotationPoint(-12.5F, -7F, -10F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[423].setRotationPoint(-11.5F, -15F, -10F);

		bodyModel[424].addShapeBox(-0.5F, -6.5F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 duplex upper bed
		bodyModel[424].setRotationPoint(-13F, -9.5F, -10F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[425].setRotationPoint(-13.5F, -17F, -5F);

		bodyModel[426].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38 duplex upper bed
		bodyModel[426].setRotationPoint(-13F, -9.5F, -8.75F);

		bodyModel[427].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 duplex upper bed
		bodyModel[427].setRotationPoint(-13F, -9.5F, -10F);

		bodyModel[428].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 duplex upper bed
		bodyModel[428].setRotationPoint(-13F, -9.5F, -6F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[429].setRotationPoint(-21.5F, -15F, 4F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[430].setRotationPoint(-12.5F, -10F, 5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[431].setRotationPoint(-11.5F, -3F, 5F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[432].setRotationPoint(-12.5F, -8F, 5F);

		bodyModel[433].addBox(0F, 0F, 0F, 5, 9, 1, 0F); // Box 305
		bodyModel[433].setRotationPoint(-14.5F, -8F, 4F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 306 duplex lower bed
		bodyModel[434].setRotationPoint(-21.5F, -5F, 5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[435].setRotationPoint(-20.5F, -6F, 4F);

		bodyModel[436].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 308
		bodyModel[436].setRotationPoint(-16.5F, -9F, 5F);

		bodyModel[437].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 309
		bodyModel[437].setRotationPoint(-15.5F, -8F, 4F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[438].setRotationPoint(-15.5F, -7F, 4F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[439].setRotationPoint(-20.5F, -9F, 5F);

		bodyModel[440].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 312
		bodyModel[440].setRotationPoint(-20.5F, -14F, 4F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 0, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 313
		bodyModel[441].setRotationPoint(-12.5F, -7F, 5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[442].setRotationPoint(-11.5F, -15F, 5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[443].setRotationPoint(-13.5F, -17F, 4F);

		bodyModel[444].addShapeBox(-0.5F, -6.5F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 duplex upper bed
		bodyModel[444].setRotationPoint(-13F, -9.5F, 5F);

		bodyModel[445].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38 duplex upper bed
		bodyModel[445].setRotationPoint(-13F, -9.5F, 6.25F);

		bodyModel[446].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38 duplex upper bed
		bodyModel[446].setRotationPoint(-13F, -9.5F, 5F);

		bodyModel[447].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 duplex upper bed
		bodyModel[447].setRotationPoint(-13F, -9.5F, 9F);

		bodyModel[448].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 38
		bodyModel[448].setRotationPoint(10.5F, -5F, -5F);

		bodyModel[449].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 38
		bodyModel[449].setRotationPoint(-6.5F, -5F, -5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[450].setRotationPoint(29.5F, -5F, 4F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[451].setRotationPoint(12.5F, -5F, -10F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[452].setRotationPoint(12.5F, -5F, 4F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[453].setRotationPoint(-4.5F, -5F, -10F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[454].setRotationPoint(-4.5F, -5F, 4F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[455].setRotationPoint(-21.5F, -5F, -10F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[456].setRotationPoint(1.5F, -15F, -4F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[457].setRotationPoint(1.5F, -15F, 3F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 19, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[458].setRotationPoint(-20.5F, -15F, -4F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 20, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[459].setRotationPoint(-21.5F, -15F, 3F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[460].setRotationPoint(-1.5F, -6F, -4F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[461].setRotationPoint(-1.5F, -6F, 3F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 476 hallway door F
		bodyModel[462].setRotationPoint(1F, -15F, -4F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 476 hallway door R
		bodyModel[463].setRotationPoint(5F, -15F, -4F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 476 hallway door F
		bodyModel[464].setRotationPoint(1F, -15F, 3F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 476 hallway door R
		bodyModel[465].setRotationPoint(5F, -15F, 3F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 3, 16, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[466].setRotationPoint(-24.5F, -15F, 3F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[467].setRotationPoint(-21.5F, -15F, -4F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 3, 16, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[468].setRotationPoint(-60.5F, -15F, 3F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 31, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[469].setRotationPoint(-56.5F, -15F, -6F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 16, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[470].setRotationPoint(-57.5F, -15F, -5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[471].setRotationPoint(-57.5F, -15F, -6F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 16, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[472].setRotationPoint(-25.5F, -15F, -5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[473].setRotationPoint(-25.5F, -15F, -6F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 16, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[474].setRotationPoint(-41.5F, -15F, -5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 16, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[475].setRotationPoint(-49.5F, -15F, -5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 16, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[476].setRotationPoint(-33.5F, -15F, -5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[477].setRotationPoint(50.5F, -11F, -9.9F);

		bodyModel[478].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 38
		bodyModel[478].setRotationPoint(-45.5F, -3F, -5F);

		bodyModel[479].addBox(-0.5F, -3.5F, 0F, 1, 4, 14, 0F); // Folding seat/bed F
		bodyModel[479].setRotationPoint(-42F, -3.5F, -5F);

		bodyModel[480].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 38
		bodyModel[480].setRotationPoint(-45.5F, -1F, -5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[481].setRotationPoint(-48.5F, -6F, 7F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[482].setRotationPoint(-46.5F, -6F, 9F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[483].setRotationPoint(-42.5F, -7F, 9F);

		bodyModel[484].addBox(-0.5F, -3.5F, 0F, 1, 4, 14, 0F); // Folding bed F
		bodyModel[484].setRotationPoint(-42F, -11.5F, -5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[485].setRotationPoint(-42.5F, -11F, -5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 3, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[486].setRotationPoint(-42.5F, -17F, -5F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[487].setRotationPoint(-42.5F, -15F, 9F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[488].setRotationPoint(-56.5F, -17F, -5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 7, 0, 4, 0F,0F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[489].setRotationPoint(-52.5F, -14.5F, 8F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 7, 0, 4, 0F,0F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[490].setRotationPoint(-36.5F, -14.5F, 8F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38 glow
		bodyModel[491].setRotationPoint(-43.5F, -17F, -2F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[492].setRotationPoint(-55.5F, -17F, -2F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[493].setRotationPoint(-39.5F, -17F, -2F);

		bodyModel[494].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 38
		bodyModel[494].setRotationPoint(-56.5F, -3F, -5F);

		bodyModel[495].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 38
		bodyModel[495].setRotationPoint(-56.5F, -1F, -5F);

		bodyModel[496].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 38
		bodyModel[496].setRotationPoint(-40.5F, -3F, -5F);

		bodyModel[497].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 38
		bodyModel[497].setRotationPoint(-40.5F, -1F, -5F);

		bodyModel[498].addBox(-0.5F, -3.5F, 0F, 1, 4, 14, 0F); // Folding seat/bed R
		bodyModel[498].setRotationPoint(-56F, -3.5F, -5F);

		bodyModel[499].addBox(-0.5F, -3.5F, 0F, 1, 4, 14, 0F); // Folding seat/bed R
		bodyModel[499].setRotationPoint(-40F, -3.5F, -5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 229, 373, textureX, textureY); // Box 300
		bodyModel[501] = new ModelRendererTurbo(this, 1, 372, textureX, textureY); // Box 300
		bodyModel[502] = new ModelRendererTurbo(this, 12, 374, textureX, textureY); // Box 300
		bodyModel[503] = new ModelRendererTurbo(this, 240, 375, textureX, textureY); // Box 300
		bodyModel[504] = new ModelRendererTurbo(this, 20, 371, textureX, textureY); // Box 300
		bodyModel[505] = new ModelRendererTurbo(this, 248, 372, textureX, textureY); // Box 300
		bodyModel[506] = new ModelRendererTurbo(this, 262, 368, textureX, textureY); // Box 38
		bodyModel[507] = new ModelRendererTurbo(this, 25, 364, textureX, textureY); // Box 38
		bodyModel[508] = new ModelRendererTurbo(this, 271, 375, textureX, textureY); // Box 38
		bodyModel[509] = new ModelRendererTurbo(this, 42, 371, textureX, textureY); // Box 38
		bodyModel[510] = new ModelRendererTurbo(this, 255, 350, textureX, textureY); // Folding bed R
		bodyModel[511] = new ModelRendererTurbo(this, 42, 366, textureX, textureY); // Folding bed R
		bodyModel[512] = new ModelRendererTurbo(this, 478, 294, textureX, textureY); // Box 38
		bodyModel[513] = new ModelRendererTurbo(this, 438, 273, textureX, textureY); // Box 38
		bodyModel[514] = new ModelRendererTurbo(this, 439, 312, textureX, textureY); // Box 38
		bodyModel[515] = new ModelRendererTurbo(this, 439, 296, textureX, textureY); // Folding seat/bed F
		bodyModel[516] = new ModelRendererTurbo(this, 454, 322, textureX, textureY); // Box 38
		bodyModel[517] = new ModelRendererTurbo(this, 462, 296, textureX, textureY); // Drop bed
		bodyModel[518] = new ModelRendererTurbo(this, 452, 289, textureX, textureY); // Box 225 wall plug
		bodyModel[519] = new ModelRendererTurbo(this, 170, 207, textureX, textureY); // Box 128
		bodyModel[520] = new ModelRendererTurbo(this, 184, 219, textureX, textureY); // Box 128
		bodyModel[521] = new ModelRendererTurbo(this, 184, 204, textureX, textureY); // Box 533
		bodyModel[522] = new ModelRendererTurbo(this, 149, 236, textureX, textureY); // Box 528
		bodyModel[523] = new ModelRendererTurbo(this, 149, 185, textureX, textureY); // Box 537
		bodyModel[524] = new ModelRendererTurbo(this, 353, 223, textureX, textureY); // Box 128
		bodyModel[525] = new ModelRendererTurbo(this, 337, 229, textureX, textureY); // Box 128
		bodyModel[526] = new ModelRendererTurbo(this, 337, 223, textureX, textureY); // Box 128
		bodyModel[527] = new ModelRendererTurbo(this, 314, 223, textureX, textureY); // Box 128
		bodyModel[528] = new ModelRendererTurbo(this, 366, 222, textureX, textureY); // Box 128
		bodyModel[529] = new ModelRendererTurbo(this, 290, 223, textureX, textureY); // Box 128
		bodyModel[530] = new ModelRendererTurbo(this, 274, 229, textureX, textureY); // Box 128
		bodyModel[531] = new ModelRendererTurbo(this, 274, 223, textureX, textureY); // Box 128
		bodyModel[532] = new ModelRendererTurbo(this, 251, 223, textureX, textureY); // Box 128
		bodyModel[533] = new ModelRendererTurbo(this, 303, 222, textureX, textureY); // Box 128
		bodyModel[534] = new ModelRendererTurbo(this, 227, 223, textureX, textureY); // Box 128
		bodyModel[535] = new ModelRendererTurbo(this, 211, 229, textureX, textureY); // Box 128
		bodyModel[536] = new ModelRendererTurbo(this, 211, 223, textureX, textureY); // Box 128
		bodyModel[537] = new ModelRendererTurbo(this, 188, 223, textureX, textureY); // Box 128
		bodyModel[538] = new ModelRendererTurbo(this, 240, 222, textureX, textureY); // Box 128
		bodyModel[539] = new ModelRendererTurbo(this, 353, 190, textureX, textureY); // Box 554
		bodyModel[540] = new ModelRendererTurbo(this, 337, 189, textureX, textureY); // Box 555
		bodyModel[541] = new ModelRendererTurbo(this, 337, 196, textureX, textureY); // Box 556
		bodyModel[542] = new ModelRendererTurbo(this, 314, 197, textureX, textureY); // Box 557
		bodyModel[543] = new ModelRendererTurbo(this, 366, 189, textureX, textureY); // Box 558
		bodyModel[544] = new ModelRendererTurbo(this, 290, 190, textureX, textureY); // Box 559
		bodyModel[545] = new ModelRendererTurbo(this, 274, 189, textureX, textureY); // Box 560
		bodyModel[546] = new ModelRendererTurbo(this, 274, 196, textureX, textureY); // Box 561
		bodyModel[547] = new ModelRendererTurbo(this, 251, 197, textureX, textureY); // Box 562
		bodyModel[548] = new ModelRendererTurbo(this, 303, 189, textureX, textureY); // Box 563
		bodyModel[549] = new ModelRendererTurbo(this, 227, 190, textureX, textureY); // Box 564
		bodyModel[550] = new ModelRendererTurbo(this, 211, 189, textureX, textureY); // Box 565
		bodyModel[551] = new ModelRendererTurbo(this, 211, 196, textureX, textureY); // Box 566
		bodyModel[552] = new ModelRendererTurbo(this, 188, 197, textureX, textureY); // Box 567
		bodyModel[553] = new ModelRendererTurbo(this, 240, 189, textureX, textureY); // Box 568
		bodyModel[554] = new ModelRendererTurbo(this, 168, 229, textureX, textureY); // Box 128
		bodyModel[555] = new ModelRendererTurbo(this, 163, 221, textureX, textureY); // Box 128
		bodyModel[556] = new ModelRendererTurbo(this, 163, 229, textureX, textureY); // Box 128
		bodyModel[557] = new ModelRendererTurbo(this, 177, 227, textureX, textureY); // Box 128
		bodyModel[558] = new ModelRendererTurbo(this, 177, 222, textureX, textureY); // Box 128
		bodyModel[559] = new ModelRendererTurbo(this, 163, 196, textureX, textureY); // Box 574
		bodyModel[560] = new ModelRendererTurbo(this, 166, 189, textureX, textureY); // Box 575
		bodyModel[561] = new ModelRendererTurbo(this, 177, 191, textureX, textureY); // Box 576
		bodyModel[562] = new ModelRendererTurbo(this, 177, 197, textureX, textureY); // Box 577
		bodyModel[563] = new ModelRendererTurbo(this, 377, 228, textureX, textureY); // Box 128
		bodyModel[564] = new ModelRendererTurbo(this, 386, 228, textureX, textureY); // Box 128
		bodyModel[565] = new ModelRendererTurbo(this, 385, 245, textureX, textureY); // Box 128
		bodyModel[566] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Box 128
		bodyModel[567] = new ModelRendererTurbo(this, 377, 191, textureX, textureY); // Box 582
		bodyModel[568] = new ModelRendererTurbo(this, 386, 191, textureX, textureY); // Box 583
		bodyModel[569] = new ModelRendererTurbo(this, 385, 276, textureX, textureY); // Box 584
		bodyModel[570] = new ModelRendererTurbo(this, 377, 188, textureX, textureY); // Box 585
		bodyModel[571] = new ModelRendererTurbo(this, 314, 228, textureX, textureY); // Box 128
		bodyModel[572] = new ModelRendererTurbo(this, 323, 228, textureX, textureY); // Box 128
		bodyModel[573] = new ModelRendererTurbo(this, 76, 301, textureX, textureY); // Box 128
		bodyModel[574] = new ModelRendererTurbo(this, 314, 233, textureX, textureY); // Box 128
		bodyModel[575] = new ModelRendererTurbo(this, 314, 192, textureX, textureY); // Box 582
		bodyModel[576] = new ModelRendererTurbo(this, 323, 192, textureX, textureY); // Box 583
		bodyModel[577] = new ModelRendererTurbo(this, 76, 326, textureX, textureY); // Box 584
		bodyModel[578] = new ModelRendererTurbo(this, 314, 189, textureX, textureY); // Box 585
		bodyModel[579] = new ModelRendererTurbo(this, 251, 228, textureX, textureY); // Box 128
		bodyModel[580] = new ModelRendererTurbo(this, 260, 228, textureX, textureY); // Box 128
		bodyModel[581] = new ModelRendererTurbo(this, 201, 301, textureX, textureY); // Box 128
		bodyModel[582] = new ModelRendererTurbo(this, 251, 233, textureX, textureY); // Box 128
		bodyModel[583] = new ModelRendererTurbo(this, 251, 192, textureX, textureY); // Box 582
		bodyModel[584] = new ModelRendererTurbo(this, 260, 192, textureX, textureY); // Box 583
		bodyModel[585] = new ModelRendererTurbo(this, 201, 326, textureX, textureY); // Box 584
		bodyModel[586] = new ModelRendererTurbo(this, 252, 189, textureX, textureY); // Box 585
		bodyModel[587] = new ModelRendererTurbo(this, 188, 228, textureX, textureY); // Box 128
		bodyModel[588] = new ModelRendererTurbo(this, 197, 228, textureX, textureY); // Box 128
		bodyModel[589] = new ModelRendererTurbo(this, 326, 301, textureX, textureY); // Box 128
		bodyModel[590] = new ModelRendererTurbo(this, 188, 233, textureX, textureY); // Box 128
		bodyModel[591] = new ModelRendererTurbo(this, 188, 192, textureX, textureY); // Box 582
		bodyModel[592] = new ModelRendererTurbo(this, 197, 192, textureX, textureY); // Box 583
		bodyModel[593] = new ModelRendererTurbo(this, 326, 326, textureX, textureY); // Box 584
		bodyModel[594] = new ModelRendererTurbo(this, 188, 189, textureX, textureY); // Box 585
		bodyModel[595] = new ModelRendererTurbo(this, 74, 228, textureX, textureY); // Box 128
		bodyModel[596] = new ModelRendererTurbo(this, 74, 232, textureX, textureY); // Box 128
		bodyModel[597] = new ModelRendererTurbo(this, 178, 345, textureX, textureY); // Box 38
		bodyModel[598] = new ModelRendererTurbo(this, 74, 185, textureX, textureY); // Box 38
		bodyModel[599] = new ModelRendererTurbo(this, 74, 190, textureX, textureY); // Box 38
		bodyModel[600] = new ModelRendererTurbo(this, 468, 293, textureX, textureY); // Box 38
		bodyModel[601] = new ModelRendererTurbo(this, 462, 277, textureX, textureY); // Box 38
		bodyModel[602] = new ModelRendererTurbo(this, 468, 267, textureX, textureY); // Box 38
		bodyModel[603] = new ModelRendererTurbo(this, 393, 182, textureX, textureY,"lamp"); // Box 462 glow
		bodyModel[604] = new ModelRendererTurbo(this, 393, 180, textureX, textureY,"lamp"); // Box 462 glow
		bodyModel[605] = new ModelRendererTurbo(this, 390, 180, textureX, textureY,"lamp"); // Box 462 glow
		bodyModel[606] = new ModelRendererTurbo(this, 388, 176, textureX, textureY,"lamp"); // Box 462 glow
		bodyModel[607] = new ModelRendererTurbo(this, 391, 176, textureX, textureY,"lamp"); // Box 462 glow
		bodyModel[608] = new ModelRendererTurbo(this, 384, 178, textureX, textureY,"lamp"); // Box 462 glow
		bodyModel[609] = new ModelRendererTurbo(this, 429, 174, textureX, textureY,"lamp"); // Box 462 glow
		bodyModel[610] = new ModelRendererTurbo(this, 383, 174, textureX, textureY,"lamp"); // Box 462 glow
		bodyModel[611] = new ModelRendererTurbo(this, 338, 172, textureX, textureY,"lamp"); // Box 462 glow
		bodyModel[612] = new ModelRendererTurbo(this, 353, 166, textureX, textureY,"lamp"); // Box 462 glow
		bodyModel[613] = new ModelRendererTurbo(this, 353, 168, textureX, textureY); // Box 618
		bodyModel[614] = new ModelRendererTurbo(this, 353, 164, textureX, textureY,"lamp"); // Box 462 glow
		bodyModel[615] = new ModelRendererTurbo(this, 353, 170, textureX, textureY); // Box 620
		bodyModel[616] = new ModelRendererTurbo(this, 466, 306, textureX, textureY); // Bed netting R
		bodyModel[617] = new ModelRendererTurbo(this, 44, 372, textureX, textureY); // Bed netting R
		bodyModel[618] = new ModelRendererTurbo(this, 47, 361, textureX, textureY); // bed ladder rear
		bodyModel[619] = new ModelRendererTurbo(this, 253, 367, textureX, textureY); // bed ladder rear
		bodyModel[620] = new ModelRendererTurbo(this, 264, 371, textureX, textureY); // Bed netting R
		bodyModel[621] = new ModelRendererTurbo(this, 170, 360, textureX, textureY); // bed ladder F
		bodyModel[622] = new ModelRendererTurbo(this, 167, 371, textureX, textureY); // Bed netting F
		bodyModel[623] = new ModelRendererTurbo(this, 457, 306, textureX, textureY); // bed ladder S
		bodyModel[624] = new ModelRendererTurbo(this, 285, 240, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[625] = new ModelRendererTurbo(this, 258, 240, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[626] = new ModelRendererTurbo(this, 285, 271, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[627] = new ModelRendererTurbo(this, 231, 240, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[628] = new ModelRendererTurbo(this, 221, 167, textureX, textureY); // Box 41
		bodyModel[629] = new ModelRendererTurbo(this, 238, 168, textureX, textureY); // Box 41
		bodyModel[630] = new ModelRendererTurbo(this, 218, 168, textureX, textureY); // Box 41
		bodyModel[631] = new ModelRendererTurbo(this, 310, 146, textureX, textureY); // Box 2
		bodyModel[632] = new ModelRendererTurbo(this, 295, 144, textureX, textureY); // Box 2
		bodyModel[633] = new ModelRendererTurbo(this, 279, 152, textureX, textureY); // Box 2
		bodyModel[634] = new ModelRendererTurbo(this, 282, 145, textureX, textureY); // Box 2
		bodyModel[635] = new ModelRendererTurbo(this, 282, 152, textureX, textureY); // Box 2
		bodyModel[636] = new ModelRendererTurbo(this, 277, 156, textureX, textureY); // Box 2
		bodyModel[637] = new ModelRendererTurbo(this, 306, 160, textureX, textureY); // Box 190
		bodyModel[638] = new ModelRendererTurbo(this, 291, 158, textureX, textureY); // Box 191
		bodyModel[639] = new ModelRendererTurbo(this, 273, 166, textureX, textureY); // Box 192
		bodyModel[640] = new ModelRendererTurbo(this, 278, 159, textureX, textureY); // Box 193
		bodyModel[641] = new ModelRendererTurbo(this, 278, 166, textureX, textureY); // Box 194
		bodyModel[642] = new ModelRendererTurbo(this, 273, 170, textureX, textureY); // Box 195
		bodyModel[643] = new ModelRendererTurbo(this, 30, 141, textureX, textureY); // Box 2
		bodyModel[644] = new ModelRendererTurbo(this, 41, 139, textureX, textureY); // Box 2
		bodyModel[645] = new ModelRendererTurbo(this, 69, 147, textureX, textureY); // Box 2
		bodyModel[646] = new ModelRendererTurbo(this, 56, 140, textureX, textureY); // Box 2
		bodyModel[647] = new ModelRendererTurbo(this, 56, 147, textureX, textureY); // Box 2
		bodyModel[648] = new ModelRendererTurbo(this, 69, 151, textureX, textureY); // Box 2
		bodyModel[649] = new ModelRendererTurbo(this, 30, 168, textureX, textureY); // Box 190
		bodyModel[650] = new ModelRendererTurbo(this, 41, 166, textureX, textureY); // Box 191
		bodyModel[651] = new ModelRendererTurbo(this, 69, 174, textureX, textureY); // Box 192
		bodyModel[652] = new ModelRendererTurbo(this, 56, 167, textureX, textureY); // Box 193
		bodyModel[653] = new ModelRendererTurbo(this, 56, 174, textureX, textureY); // Box 194
		bodyModel[654] = new ModelRendererTurbo(this, 69, 178, textureX, textureY); // Box 195
		bodyModel[655] = new ModelRendererTurbo(this, 269, 138, textureX, textureY); // Box 41
		bodyModel[656] = new ModelRendererTurbo(this, 269, 141, textureX, textureY); // Box 27
		bodyModel[657] = new ModelRendererTurbo(this, 269, 148, textureX, textureY); // Box 2
		bodyModel[658] = new ModelRendererTurbo(this, 269, 151, textureX, textureY); // Box 2
		bodyModel[659] = new ModelRendererTurbo(this, 76, 156, textureX, textureY); // Box 2
		bodyModel[660] = new ModelRendererTurbo(this, 76, 154, textureX, textureY); // Box 2
		bodyModel[661] = new ModelRendererTurbo(this, 74, 144, textureX, textureY); // Box 30
		bodyModel[662] = new ModelRendererTurbo(this, 77, 144, textureX, textureY); // Box 31
		bodyModel[663] = new ModelRendererTurbo(this, 21, 266, textureX, textureY); // Box 38
		bodyModel[664] = new ModelRendererTurbo(this, 66, 268, textureX, textureY); // Box 539

		bodyModel[500].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[500].setRotationPoint(-51.5F, -6F, 7F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[501].setRotationPoint(-35.5F, -6F, 7F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[502].setRotationPoint(-40.5F, -6F, 9F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[503].setRotationPoint(-56.5F, -6F, 9F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[504].setRotationPoint(-40.5F, -7F, 9F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[505].setRotationPoint(-56.5F, -7F, 9F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 38
		bodyModel[506].setRotationPoint(-56.5F, -11F, -5F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 38
		bodyModel[507].setRotationPoint(-40.5F, -11F, -5F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 38
		bodyModel[508].setRotationPoint(-56.5F, -15F, 9F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 38
		bodyModel[509].setRotationPoint(-40.5F, -15F, 9F);

		bodyModel[510].addBox(-0.5F, -3.5F, 0F, 1, 4, 14, 0F); // Folding bed R
		bodyModel[510].setRotationPoint(-56F, -11.5F, -5F);

		bodyModel[511].addBox(-0.5F, -3.5F, 0F, 1, 4, 14, 0F); // Folding bed R
		bodyModel[511].setRotationPoint(-40F, -11.5F, -5F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[512].setRotationPoint(-33.5F, -17F, -5F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 2, 14, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[513].setRotationPoint(-27.5F, -13F, -5F);

		bodyModel[514].addBox(0F, 0F, 0F, 5, 2, 7, 0F); // Box 38
		bodyModel[514].setRotationPoint(-29.5F, -3F, 3F);

		bodyModel[515].addBox(-0.5F, -7.5F, 0F, 1, 8, 7, 0F); // Folding seat/bed F
		bodyModel[515].setRotationPoint(-25F, -3.5F, 3F);

		bodyModel[516].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 38
		bodyModel[516].setRotationPoint(-28.5F, -1F, 3F);

		bodyModel[517].addBox(0F, 0F, 0F, 8, 2, 7, 0F); // Drop bed
		bodyModel[517].setRotationPoint(-32.5F, -16F, 3F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225 wall plug
		bodyModel[518].setRotationPoint(-25.5F, -14F, 3F);

		bodyModel[519].addBox(0F, 0F, 0F, 64, 3, 8, 0F); // Box 128
		bodyModel[519].setRotationPoint(-24.5F, -18F, -4F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 62, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[520].setRotationPoint(-24.5F, -19F, -4F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 62, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		bodyModel[521].setRotationPoint(-24.5F, -19F, 3F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 62, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.27F, -0.43F, 0F, -0.27F, -0.43F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F); // Box 528
		bodyModel[522].setRotationPoint(-22.5F, -16.85F, -10F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 62, 2, 1, 0F,0F, -0.27F, -0.43F, 0F, -0.27F, -0.43F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 537
		bodyModel[523].setRotationPoint(-22.5F, -16.85F, 9F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[524].setRotationPoint(22.5F, -16.25F, -10F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[525].setRotationPoint(22.5F, -18F, -10F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[526].setRotationPoint(22.5F, -18F, -7F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[527].setRotationPoint(20.5F, -19F, -7F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[528].setRotationPoint(28.5F, -15F, -10F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[529].setRotationPoint(5.5F, -16.25F, -10F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[530].setRotationPoint(5.5F, -18F, -10F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[531].setRotationPoint(5.5F, -18F, -7F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[532].setRotationPoint(3.5F, -19F, -7F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[533].setRotationPoint(11.5F, -15F, -10F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[534].setRotationPoint(-11.5F, -16.25F, -10F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[535].setRotationPoint(-11.5F, -18F, -10F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[536].setRotationPoint(-11.5F, -18F, -7F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[537].setRotationPoint(-13.5F, -19F, -7F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[538].setRotationPoint(-5.5F, -15F, -10F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 554
		bodyModel[539].setRotationPoint(22.5F, -16.25F, 4F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 555
		bodyModel[540].setRotationPoint(22.5F, -18F, 7F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 556
		bodyModel[541].setRotationPoint(22.5F, -18F, 4F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[542].setRotationPoint(20.5F, -19F, 4F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[543].setRotationPoint(28.5F, -15F, 4F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 559
		bodyModel[544].setRotationPoint(5.5F, -16.25F, 4F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 560
		bodyModel[545].setRotationPoint(5.5F, -18F, 7F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 561
		bodyModel[546].setRotationPoint(5.5F, -18F, 4F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		bodyModel[547].setRotationPoint(3.5F, -19F, 4F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[548].setRotationPoint(11.5F, -15F, 4F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 564
		bodyModel[549].setRotationPoint(-11.5F, -16.25F, 4F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 565
		bodyModel[550].setRotationPoint(-11.5F, -18F, 7F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 566
		bodyModel[551].setRotationPoint(-11.5F, -18F, 4F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[552].setRotationPoint(-13.5F, -19F, 4F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		bodyModel[553].setRotationPoint(-5.5F, -15F, 4F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[554].setRotationPoint(-22.5F, -15F, -10F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[555].setRotationPoint(-24.5F, -16.25F, -10F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[556].setRotationPoint(-24.5F, -18F, -10F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[557].setRotationPoint(-24.5F, -18F, -7F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[558].setRotationPoint(-24.5F, -19F, -7F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 574
		bodyModel[559].setRotationPoint(-24.5F, -16.25F, 4F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 575
		bodyModel[560].setRotationPoint(-24.5F, -18F, 7F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 576
		bodyModel[561].setRotationPoint(-24.5F, -18F, 4F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[562].setRotationPoint(-24.5F, -19F, 4F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[563].setRotationPoint(37.5F, -18F, -9F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[564].setRotationPoint(37.5F, -18F, -7F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[565].setRotationPoint(37.5F, -17F, -6.25F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[566].setRotationPoint(37.5F, -17F, -9.75F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 582
		bodyModel[567].setRotationPoint(37.5F, -18F, 7F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[568].setRotationPoint(37.5F, -18F, 4F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 584
		bodyModel[569].setRotationPoint(37.5F, -17F, 5.25F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 585
		bodyModel[570].setRotationPoint(37.5F, -17F, 8.75F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[571].setRotationPoint(20.5F, -18F, -9F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[572].setRotationPoint(20.5F, -18F, -7F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[573].setRotationPoint(20.5F, -17F, -6.25F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[574].setRotationPoint(20.5F, -17F, -9.75F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 582
		bodyModel[575].setRotationPoint(20.5F, -18F, 7F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[576].setRotationPoint(20.5F, -18F, 4F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 584
		bodyModel[577].setRotationPoint(20.5F, -17F, 5.25F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 585
		bodyModel[578].setRotationPoint(20.5F, -17F, 8.75F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[579].setRotationPoint(3.5F, -18F, -9F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[580].setRotationPoint(3.5F, -18F, -7F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[581].setRotationPoint(3.5F, -17F, -6.25F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[582].setRotationPoint(3.5F, -17F, -9.75F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 582
		bodyModel[583].setRotationPoint(3.5F, -18F, 7F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[584].setRotationPoint(3.5F, -18F, 4F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 584
		bodyModel[585].setRotationPoint(3.5F, -17F, 5.25F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 585
		bodyModel[586].setRotationPoint(3.5F, -17F, 8.75F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[587].setRotationPoint(-13.5F, -18F, -9F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[588].setRotationPoint(-13.5F, -18F, -7F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[589].setRotationPoint(-13.5F, -17F, -6.25F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[590].setRotationPoint(-13.5F, -17F, -9.75F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 582
		bodyModel[591].setRotationPoint(-13.5F, -18F, 7F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[592].setRotationPoint(-13.5F, -18F, 4F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 584
		bodyModel[593].setRotationPoint(-13.5F, -17F, 5.25F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 585
		bodyModel[594].setRotationPoint(-13.5F, -17F, 8.75F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 32, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[595].setRotationPoint(-56.5F, -17F, -7F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 32, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[596].setRotationPoint(-56.5F, -16.25F, -10F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[597].setRotationPoint(-49.5F, -17F, -5F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 22, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[598].setRotationPoint(-55.5F, -17F, 8F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 32, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.29F, 0F, -1F, -0.29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.29F, 0F, 0F, -0.29F); // Box 38
		bodyModel[599].setRotationPoint(-56.5F, -18F, 7F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.3F, 0F, -0.75F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 38
		bodyModel[600].setRotationPoint(-32.5F, -17F, 8.7F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 8, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 38
		bodyModel[601].setRotationPoint(-32.5F, -17F, -5F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[602].setRotationPoint(-32.5F, -16F, -5F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 17, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462 glow
		bodyModel[603].setRotationPoint(-56.5F, -8.5F, -4.99F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 17, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462 glow
		bodyModel[604].setRotationPoint(-56.5F, -8.5F, 9.99F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462 glow
		bodyModel[605].setRotationPoint(-26.5F, -9F, 9.99F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462 glow
		bodyModel[606].setRotationPoint(-27.5F, -15.99F, 6F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462 glow
		bodyModel[607].setRotationPoint(-31.5F, -14.99F, 1F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 25, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462 glow
		bodyModel[608].setRotationPoint(-52.5F, -14.99F, -8.5F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462 glow
		bodyModel[609].setRotationPoint(-59.5F, -14.99F, -1.5F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462 glow
		bodyModel[610].setRotationPoint(-23.5F, -14.99F, -5.5F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 71, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462 glow
		bodyModel[611].setRotationPoint(-18.5F, -14.99F, -0.5F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 56, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462 glow
		bodyModel[612].setRotationPoint(-18.5F, -18.12F, 6.5F);
		bodyModel[612].rotateAngleX = -0.38397244F;

		bodyModel[613].addShapeBox(0F, 0F, 0F, 56, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 618
		bodyModel[613].setRotationPoint(-18.5F, -17.7F, -7.5F);
		bodyModel[613].rotateAngleX = 0.41887902F;

		bodyModel[614].addShapeBox(0F, 0F, 0F, 56, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462 glow
		bodyModel[614].setRotationPoint(-9.5F, -14.99F, 6.5F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 56, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		bodyModel[615].setRotationPoint(-9.5F, -14.99F, -7.5F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 5, 7, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -4F, 0F); // Bed netting R
		bodyModel[616].setRotationPoint(-32.5F, -16F, 3F);
		bodyModel[616].rotateAngleX = 1.57079633F;

		bodyModel[617].addShapeBox(0F, 0F, 0F, 0, 8, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -6F, 0F, -3F, -6F); // Bed netting R
		bodyModel[617].setRotationPoint(-36.5F, -18F, -3F);
		bodyModel[617].rotateAngleZ = 1.57079633F;

		bodyModel[618].addShapeBox(0F, 0F, 0F, 0, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // bed ladder rear
		bodyModel[618].setRotationPoint(-36.49F, -18F, 5F);
		bodyModel[618].rotateAngleZ = 1.57079633F;

		bodyModel[619].addShapeBox(0F, 0F, 0F, 0, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // bed ladder rear
		bodyModel[619].setRotationPoint(-52.49F, -18F, 5F);
		bodyModel[619].rotateAngleZ = 1.57079633F;

		bodyModel[620].addShapeBox(0F, 0F, 0F, 0, 8, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -6F, 0F, -3F, -6F); // Bed netting R
		bodyModel[620].setRotationPoint(-52.5F, -18F, -3F);
		bodyModel[620].rotateAngleZ = 1.57079633F;

		bodyModel[621].addShapeBox(0F, 0F, 0F, 0, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // bed ladder F
		bodyModel[621].setRotationPoint(-45.51F, -18F, 5F);
		bodyModel[621].rotateAngleZ = -1.57079633F;

		bodyModel[622].addShapeBox(0F, 0F, 0F, 0, 8, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -6F, 0F, -3F, -6F); // Bed netting F
		bodyModel[622].setRotationPoint(-45.5F, -18F, -3F);
		bodyModel[622].rotateAngleZ = -1.57079633F;

		bodyModel[623].addShapeBox(0F, 0F, 0F, 4, 13, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // bed ladder S
		bodyModel[623].setRotationPoint(-29.5F, -16F, 2.99F);
		bodyModel[623].rotateAngleX = -1.57079633F;

		bodyModel[624].addShapeBox(0F, 0F, 0F, 3, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[624].setRotationPoint(-1.5F, -15F, -5F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 3, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[625].setRotationPoint(15.5F, -15F, -5F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 3, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[626].setRotationPoint(-18.5F, -15F, -5F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 3, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[627].setRotationPoint(32.5F, -15F, -5F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[628].setRotationPoint(25.5F, 4F, 0F);
		bodyModel[628].rotateAngleX = -0.78539816F;

		bodyModel[629].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[629].setRotationPoint(25.49F, 4F, -0.5F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[630].setRotationPoint(31.51F, 4F, -0.5F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[631].setRotationPoint(61F, 4F, -5F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[632].setRotationPoint(61F, 3F, -10.5F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[633].setRotationPoint(61F, 4F, -10.5F);

		bodyModel[634].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[634].setRotationPoint(61F, 4F, -10F);

		bodyModel[635].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[635].setRotationPoint(61F, 5F, -10F);

		bodyModel[636].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.06F, -0.4F, 0F, 0.06F, -0.4F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.06F, -0.4F, 0F, -1.06F, -0.4F); // Box 2
		bodyModel[636].setRotationPoint(61F, 5.5F, -10F);

		bodyModel[637].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[637].setRotationPoint(61F, 4F, 1F);

		bodyModel[638].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[638].setRotationPoint(61F, 3F, 4.5F);

		bodyModel[639].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[639].setRotationPoint(61F, 4F, 9.5F);

		bodyModel[640].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[640].setRotationPoint(61F, 4F, 5F);

		bodyModel[641].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 194
		bodyModel[641].setRotationPoint(61F, 5F, 5F);

		bodyModel[642].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.06F, -0.4F, -0.5F, 0.06F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.06F, -0.4F, -0.5F, -1.06F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 195
		bodyModel[642].setRotationPoint(61F, 5.5F, 9F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[643].setRotationPoint(-61.5F, 4F, -5F);

		bodyModel[644].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[644].setRotationPoint(-61.5F, 3F, -10.5F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[645].setRotationPoint(-61.5F, 4F, -10.5F);

		bodyModel[646].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[646].setRotationPoint(-61.5F, 4F, -10F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[647].setRotationPoint(-61.5F, 5F, -10F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.06F, -0.4F, 0F, 0.06F, -0.4F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.06F, -0.4F, 0F, -1.06F, -0.4F); // Box 2
		bodyModel[648].setRotationPoint(-61.5F, 5.5F, -10F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[649].setRotationPoint(-61.5F, 4F, 1F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[650].setRotationPoint(-61.5F, 3F, 4.5F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[651].setRotationPoint(-61.5F, 4F, 9.5F);

		bodyModel[652].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[652].setRotationPoint(-61.5F, 4F, 5F);

		bodyModel[653].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 194
		bodyModel[653].setRotationPoint(-61.5F, 5F, 5F);

		bodyModel[654].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.06F, -0.4F, -0.5F, 0.06F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.06F, -0.4F, -0.5F, -1.06F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 195
		bodyModel[654].setRotationPoint(-61.5F, 5.5F, 9F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[655].setRotationPoint(55.5F, 3F, -11F);

		bodyModel[656].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[656].setRotationPoint(55.5F, 4F, -11F);

		bodyModel[657].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[657].setRotationPoint(55.5F, 3F, 10.5F);

		bodyModel[658].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[658].setRotationPoint(55.5F, 4F, 10.5F);

		bodyModel[659].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[659].setRotationPoint(-58.5F, 4F, 10.5F);

		bodyModel[660].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[660].setRotationPoint(-58.5F, 3F, 10.5F);

		bodyModel[661].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[661].setRotationPoint(-58.5F, 4F, -11F);

		bodyModel[662].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[662].setRotationPoint(-58.5F, 3F, -11F);

		bodyModel[663].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[663].setRotationPoint(53.5F, -9F, 5F);

		bodyModel[664].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 539
		bodyModel[664].setRotationPoint(51.5F, -1F, 6F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 665; i++)
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
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_black.png"));
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