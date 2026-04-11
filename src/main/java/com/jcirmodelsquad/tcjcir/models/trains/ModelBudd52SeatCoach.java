//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck_41GT;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck_41TRV11;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck_41RC11;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelBudd52SeatCoach extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBudd52SeatCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[674];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 30, 122, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 206, 167, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 206, 176, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 208, 155, textureX, textureY); // Box 41
		bodyModel[8] = new ModelRendererTurbo(this, 223, 156, textureX, textureY); // Box 41
		bodyModel[9] = new ModelRendererTurbo(this, 205, 156, textureX, textureY); // Box 41
		bodyModel[10] = new ModelRendererTurbo(this, 203, 178, textureX, textureY); // Box 283
		bodyModel[11] = new ModelRendererTurbo(this, 106, 174, textureX, textureY); // Box 283
		bodyModel[12] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 74, 151, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[15] = new ModelRendererTurbo(this, 74, 148, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 94, 151, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 74, 141, textureX, textureY,"cull"); // Box 30 cull
		bodyModel[18] = new ModelRendererTurbo(this, 74, 138, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 94, 141, textureX, textureY); // Box 33
		bodyModel[20] = new ModelRendererTurbo(this, 47, 147, textureX, textureY); // Box 2
		bodyModel[21] = new ModelRendererTurbo(this, 69, 151, textureX, textureY); // Box 2
		bodyModel[22] = new ModelRendererTurbo(this, 47, 137, textureX, textureY); // Box 191
		bodyModel[23] = new ModelRendererTurbo(this, 69, 141, textureX, textureY); // Box 192
		bodyModel[24] = new ModelRendererTurbo(this, 340, 104, textureX, textureY); // Box 2
		bodyModel[25] = new ModelRendererTurbo(this, 310, 116, textureX, textureY); // Box 2
		bodyModel[26] = new ModelRendererTurbo(this, 347, 117, textureX, textureY); // Box 2
		bodyModel[27] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[28] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[29] = new ModelRendererTurbo(this, 272, 148, textureX, textureY); // Box 2
		bodyModel[30] = new ModelRendererTurbo(this, 272, 151, textureX, textureY); // Box 2
		bodyModel[31] = new ModelRendererTurbo(this, 260, 151, textureX, textureY); // Box 2
		bodyModel[32] = new ModelRendererTurbo(this, 253, 151, textureX, textureY); // Box 2
		bodyModel[33] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 24
		bodyModel[34] = new ModelRendererTurbo(this, 272, 141, textureX, textureY); // Box 25
		bodyModel[35] = new ModelRendererTurbo(this, 260, 141, textureX, textureY); // Box 27
		bodyModel[36] = new ModelRendererTurbo(this, 253, 141, textureX, textureY); // Box 29
		bodyModel[37] = new ModelRendererTurbo(this, 258, 148, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 289, 147, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 277, 151, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 289, 138, textureX, textureY); // Box 191
		bodyModel[41] = new ModelRendererTurbo(this, 277, 141, textureX, textureY); // Box 192
		bodyModel[42] = new ModelRendererTurbo(this, 256, 154, textureX, textureY); // Box 24
		bodyModel[43] = new ModelRendererTurbo(this, 249, 154, textureX, textureY); // Box 24
		bodyModel[44] = new ModelRendererTurbo(this, 331, 62, textureX, textureY); // Left step part
		bodyModel[45] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Left step part
		bodyModel[46] = new ModelRendererTurbo(this, 331, 77, textureX, textureY); // Left step part
		bodyModel[47] = new ModelRendererTurbo(this, 322, 79, textureX, textureY); // Left step part
		bodyModel[48] = new ModelRendererTurbo(this, 340, 79, textureX, textureY); // Left step part
		bodyModel[49] = new ModelRendererTurbo(this, 331, 74, textureX, textureY); // Left step part
		bodyModel[50] = new ModelRendererTurbo(this, 327, 81, textureX, textureY); // Left step part
		bodyModel[51] = new ModelRendererTurbo(this, 247, 155, textureX, textureY); // Box 26
		bodyModel[52] = new ModelRendererTurbo(this, 248, 158, textureX, textureY); // Box 26
		bodyModel[53] = new ModelRendererTurbo(this, 256, 155, textureX, textureY); // Box 26
		bodyModel[54] = new ModelRendererTurbo(this, 257, 158, textureX, textureY); // Box 26
		bodyModel[55] = new ModelRendererTurbo(this, 331, 68, textureX, textureY); // Left step part
		bodyModel[56] = new ModelRendererTurbo(this, 329, 71, textureX, textureY); // Left step part
		bodyModel[57] = new ModelRendererTurbo(this, 322, 77, textureX, textureY); // Left step part
		bodyModel[58] = new ModelRendererTurbo(this, 340, 77, textureX, textureY); // Left step part
		bodyModel[59] = new ModelRendererTurbo(this, 323, 74, textureX, textureY); // Left step part
		bodyModel[60] = new ModelRendererTurbo(this, 341, 74, textureX, textureY); // Left step part
		bodyModel[61] = new ModelRendererTurbo(this, 331, 87, textureX, textureY); // Right step part
		bodyModel[62] = new ModelRendererTurbo(this, 331, 102, textureX, textureY); // Right step part
		bodyModel[63] = new ModelRendererTurbo(this, 322, 100, textureX, textureY); // Right step part
		bodyModel[64] = new ModelRendererTurbo(this, 322, 98, textureX, textureY); // Right step part
		bodyModel[65] = new ModelRendererTurbo(this, 340, 100, textureX, textureY); // Right step part
		bodyModel[66] = new ModelRendererTurbo(this, 340, 98, textureX, textureY); // Right step part
		bodyModel[67] = new ModelRendererTurbo(this, 331, 99, textureX, textureY); // Right step part
		bodyModel[68] = new ModelRendererTurbo(this, 327, 106, textureX, textureY); // Right step part
		bodyModel[69] = new ModelRendererTurbo(this, 329, 90, textureX, textureY); // Right step part
		bodyModel[70] = new ModelRendererTurbo(this, 331, 93, textureX, textureY); // Right step part
		bodyModel[71] = new ModelRendererTurbo(this, 329, 96, textureX, textureY); // Right step part
		bodyModel[72] = new ModelRendererTurbo(this, 323, 95, textureX, textureY); // Right step part
		bodyModel[73] = new ModelRendererTurbo(this, 341, 95, textureX, textureY); // Right step part
		bodyModel[74] = new ModelRendererTurbo(this, 256, 163, textureX, textureY); // Box 144
		bodyModel[75] = new ModelRendererTurbo(this, 249, 163, textureX, textureY); // Box 145
		bodyModel[76] = new ModelRendererTurbo(this, 247, 164, textureX, textureY); // Box 140
		bodyModel[77] = new ModelRendererTurbo(this, 248, 167, textureX, textureY); // Box 141
		bodyModel[78] = new ModelRendererTurbo(this, 256, 164, textureX, textureY); // Box 142
		bodyModel[79] = new ModelRendererTurbo(this, 257, 167, textureX, textureY); // Box 143
		bodyModel[80] = new ModelRendererTurbo(this, 309, 69, textureX, textureY); // Left side door
		bodyModel[81] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[82] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 309, 90, textureX, textureY); // Right side door
		bodyModel[86] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[88] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[89] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[90] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[91] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[92] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[93] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[95] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[96] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[97] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[98] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[100] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[101] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[102] = new ModelRendererTurbo(this, 434, 23, textureX, textureY); // Box 128
		bodyModel[103] = new ModelRendererTurbo(this, 434, 35, textureX, textureY); // Box 128
		bodyModel[104] = new ModelRendererTurbo(this, 410, 2, textureX, textureY); // Box 128
		bodyModel[105] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 128
		bodyModel[107] = new ModelRendererTurbo(this, 424, 1, textureX, textureY); // Box 128
		bodyModel[108] = new ModelRendererTurbo(this, 445, 35, textureX, textureY); // Box 128
		bodyModel[109] = new ModelRendererTurbo(this, 381, 44, textureX, textureY); // Box 128
		bodyModel[110] = new ModelRendererTurbo(this, 360, 86, textureX, textureY); // Box 38
		bodyModel[111] = new ModelRendererTurbo(this, 365, 99, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 364, 95, textureX, textureY); // Box 128
		bodyModel[113] = new ModelRendererTurbo(this, 363, 90, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 361, 83, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 360, 67, textureX, textureY); // Box 248
		bodyModel[116] = new ModelRendererTurbo(this, 365, 71, textureX, textureY); // Box 250
		bodyModel[117] = new ModelRendererTurbo(this, 364, 74, textureX, textureY); // Box 252
		bodyModel[118] = new ModelRendererTurbo(this, 363, 78, textureX, textureY); // Box 254
		bodyModel[119] = new ModelRendererTurbo(this, 355, 86, textureX, textureY); // Box 38
		bodyModel[120] = new ModelRendererTurbo(this, 378, 101, textureX, textureY); // Box 128
		bodyModel[121] = new ModelRendererTurbo(this, 384, 66, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 374, 82, textureX, textureY); // Box 128
		bodyModel[123] = new ModelRendererTurbo(this, 394, 48, textureX, textureY); // Box 128
		bodyModel[124] = new ModelRendererTurbo(this, 355, 66, textureX, textureY); // Box 247
		bodyModel[125] = new ModelRendererTurbo(this, 378, 67, textureX, textureY); // Box 249
		bodyModel[126] = new ModelRendererTurbo(this, 384, 48, textureX, textureY); // Box 255
		bodyModel[127] = new ModelRendererTurbo(this, 396, 53, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 378, 53, textureX, textureY); // Box 261
		bodyModel[129] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[130] = new ModelRendererTurbo(this, 20, 43, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[132] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 128
		bodyModel[133] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 128
		bodyModel[135] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 128
		bodyModel[136] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 47, 77, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[139] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[140] = new ModelRendererTurbo(this, 17, 101, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 26, 99, textureX, textureY); // Box 128
		bodyModel[142] = new ModelRendererTurbo(this, 5, 135, textureX, textureY); // Box 128
		bodyModel[143] = new ModelRendererTurbo(this, 25, 95, textureX, textureY); // Box 128
		bodyModel[144] = new ModelRendererTurbo(this, 24, 90, textureX, textureY); // Box 128
		bodyModel[145] = new ModelRendererTurbo(this, 13, 82, textureX, textureY); // Box 128
		bodyModel[146] = new ModelRendererTurbo(this, 22, 83, textureX, textureY); // Box 128
		bodyModel[147] = new ModelRendererTurbo(this, 59, 91, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[149] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[150] = new ModelRendererTurbo(this, 17, 67, textureX, textureY); // Box 249
		bodyModel[151] = new ModelRendererTurbo(this, 26, 71, textureX, textureY); // Box 250
		bodyModel[152] = new ModelRendererTurbo(this, 25, 74, textureX, textureY); // Box 252
		bodyModel[153] = new ModelRendererTurbo(this, 24, 78, textureX, textureY); // Box 254
		bodyModel[154] = new ModelRendererTurbo(this, 60, 81, textureX, textureY); // Box 255
		bodyModel[155] = new ModelRendererTurbo(this, 55, 94, textureX, textureY); // Box 128
		bodyModel[156] = new ModelRendererTurbo(this, 55, 67, textureX, textureY); // Box 261
		bodyModel[157] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 128
		bodyModel[158] = new ModelRendererTurbo(this, 30, 8, textureX, textureY); // Box 128
		bodyModel[159] = new ModelRendererTurbo(this, 18, 8, textureX, textureY); // Box 176
		bodyModel[160] = new ModelRendererTurbo(this, 52, 3, textureX, textureY); // Box 128
		bodyModel[161] = new ModelRendererTurbo(this, 36, 361, textureX, textureY); // Box 128
		bodyModel[162] = new ModelRendererTurbo(this, 36, 339, textureX, textureY); // Box 177
		bodyModel[163] = new ModelRendererTurbo(this, 437, 2, textureX, textureY); // Box 128
		bodyModel[164] = new ModelRendererTurbo(this, 391, 9, textureX, textureY); // Box 128
		bodyModel[165] = new ModelRendererTurbo(this, 362, 9, textureX, textureY); // Box 176
		bodyModel[166] = new ModelRendererTurbo(this, 458, 1, textureX, textureY); // Box 128
		bodyModel[167] = new ModelRendererTurbo(this, 438, 91, textureX, textureY); // Box 128
		bodyModel[168] = new ModelRendererTurbo(this, 438, 63, textureX, textureY); // Box 185
		bodyModel[169] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[170] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[171] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[172] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[173] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[174] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[175] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[176] = new ModelRendererTurbo(this, 241, 151, textureX, textureY); // Box 2
		bodyModel[177] = new ModelRendererTurbo(this, 101, 151, textureX, textureY); // Box 2
		bodyModel[178] = new ModelRendererTurbo(this, 107, 148, textureX, textureY); // Box 2
		bodyModel[179] = new ModelRendererTurbo(this, 110, 151, textureX, textureY); // Box 2
		bodyModel[180] = new ModelRendererTurbo(this, 241, 141, textureX, textureY); // Box 35
		bodyModel[181] = new ModelRendererTurbo(this, 96, 137, textureX, textureY); // Box 37
		bodyModel[182] = new ModelRendererTurbo(this, 106, 138, textureX, textureY); // Box 38
		bodyModel[183] = new ModelRendererTurbo(this, 110, 141, textureX, textureY); // Box 39
		bodyModel[184] = new ModelRendererTurbo(this, 258, 138, textureX, textureY); // Box 41
		bodyModel[185] = new ModelRendererTurbo(this, 73, 164, textureX, textureY); // Box 2 cull test
		bodyModel[186] = new ModelRendererTurbo(this, 73, 157, textureX, textureY); // Box 41 cull test
		bodyModel[187] = new ModelRendererTurbo(this, 267, 163, textureX, textureY); // Box 2 cull test
		bodyModel[188] = new ModelRendererTurbo(this, 267, 156, textureX, textureY); // Box 41 cull test
		bodyModel[189] = new ModelRendererTurbo(this, 55, 209, textureX, textureY); // Box 128
		bodyModel[190] = new ModelRendererTurbo(this, 427, 47, textureX, textureY); // Box 128
		bodyModel[191] = new ModelRendererTurbo(this, 69, 97, textureX, textureY); // Box 204
		bodyModel[192] = new ModelRendererTurbo(this, 69, 78, textureX, textureY); // Box 194
		bodyModel[193] = new ModelRendererTurbo(this, 71, 167, textureX, textureY); // Box 2 cull test
		bodyModel[194] = new ModelRendererTurbo(this, 265, 166, textureX, textureY); // Box 2 cull test
		bodyModel[195] = new ModelRendererTurbo(this, 71, 160, textureX, textureY); // Box 39 cull test
		bodyModel[196] = new ModelRendererTurbo(this, 265, 159, textureX, textureY); // Box 39 cull test
		bodyModel[197] = new ModelRendererTurbo(this, 296, 306, textureX, textureY); // Box 38
		bodyModel[198] = new ModelRendererTurbo(this, 421, 69, textureX, textureY); // Box 128
		bodyModel[199] = new ModelRendererTurbo(this, 65, 306, textureX, textureY); // Box 128
		bodyModel[200] = new ModelRendererTurbo(this, 242, 244, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[201] = new ModelRendererTurbo(this, 243, 265, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[202] = new ModelRendererTurbo(this, 104, 255, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[203] = new ModelRendererTurbo(this, 104, 244, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[204] = new ModelRendererTurbo(this, 105, 247, textureX, textureY); // Box 38
		bodyModel[205] = new ModelRendererTurbo(this, 105, 258, textureX, textureY); // Box 276
		bodyModel[206] = new ModelRendererTurbo(this, 380, 291, textureX, textureY); // Box 38
		bodyModel[207] = new ModelRendererTurbo(this, 383, 296, textureX, textureY); // Box 38
		bodyModel[208] = new ModelRendererTurbo(this, 382, 300, textureX, textureY); // Box 38
		bodyModel[209] = new ModelRendererTurbo(this, 365, 286, textureX, textureY); // Box 340
		bodyModel[210] = new ModelRendererTurbo(this, 367, 290, textureX, textureY); // Box 41
		bodyModel[211] = new ModelRendererTurbo(this, 275, 286, textureX, textureY); // Right seat part
		bodyModel[212] = new ModelRendererTurbo(this, 285, 276, textureX, textureY); // Right seat part
		bodyModel[213] = new ModelRendererTurbo(this, 268, 297, textureX, textureY); // Boc 42
		bodyModel[214] = new ModelRendererTurbo(this, 272, 281, textureX, textureY); // Right seat part
		bodyModel[215] = new ModelRendererTurbo(this, 283, 299, textureX, textureY); // Right seat part
		bodyModel[216] = new ModelRendererTurbo(this, 272, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[217] = new ModelRendererTurbo(this, 283, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[218] = new ModelRendererTurbo(this, 247, 286, textureX, textureY); // Right seat part
		bodyModel[219] = new ModelRendererTurbo(this, 257, 276, textureX, textureY); // Right seat part
		bodyModel[220] = new ModelRendererTurbo(this, 247, 321, textureX, textureY); // Left seat part
		bodyModel[221] = new ModelRendererTurbo(this, 257, 311, textureX, textureY); // Left seat part
		bodyModel[222] = new ModelRendererTurbo(this, 240, 297, textureX, textureY); // Boc 42
		bodyModel[223] = new ModelRendererTurbo(this, 240, 332, textureX, textureY); // Box 638
		bodyModel[224] = new ModelRendererTurbo(this, 244, 281, textureX, textureY); // Right seat part
		bodyModel[225] = new ModelRendererTurbo(this, 255, 299, textureX, textureY); // Right seat part
		bodyModel[226] = new ModelRendererTurbo(this, 255, 334, textureX, textureY); // Left seat part
		bodyModel[227] = new ModelRendererTurbo(this, 244, 316, textureX, textureY); // Left seat part
		bodyModel[228] = new ModelRendererTurbo(this, 244, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[229] = new ModelRendererTurbo(this, 255, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[230] = new ModelRendererTurbo(this, 255, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[231] = new ModelRendererTurbo(this, 244, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[232] = new ModelRendererTurbo(this, 219, 286, textureX, textureY); // Right seat part
		bodyModel[233] = new ModelRendererTurbo(this, 229, 276, textureX, textureY); // Right seat part
		bodyModel[234] = new ModelRendererTurbo(this, 219, 321, textureX, textureY); // Left seat part
		bodyModel[235] = new ModelRendererTurbo(this, 229, 311, textureX, textureY); // Left seat part
		bodyModel[236] = new ModelRendererTurbo(this, 212, 297, textureX, textureY); // Boc 42
		bodyModel[237] = new ModelRendererTurbo(this, 212, 332, textureX, textureY); // Box 638
		bodyModel[238] = new ModelRendererTurbo(this, 216, 281, textureX, textureY); // Right seat part
		bodyModel[239] = new ModelRendererTurbo(this, 227, 299, textureX, textureY); // Right seat part
		bodyModel[240] = new ModelRendererTurbo(this, 227, 334, textureX, textureY); // Left seat part
		bodyModel[241] = new ModelRendererTurbo(this, 216, 316, textureX, textureY); // Left seat part
		bodyModel[242] = new ModelRendererTurbo(this, 216, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[243] = new ModelRendererTurbo(this, 227, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[244] = new ModelRendererTurbo(this, 227, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[245] = new ModelRendererTurbo(this, 216, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[246] = new ModelRendererTurbo(this, 191, 286, textureX, textureY); // Right seat part
		bodyModel[247] = new ModelRendererTurbo(this, 201, 276, textureX, textureY); // Right seat part
		bodyModel[248] = new ModelRendererTurbo(this, 191, 321, textureX, textureY); // Left seat part
		bodyModel[249] = new ModelRendererTurbo(this, 201, 311, textureX, textureY); // Left seat part
		bodyModel[250] = new ModelRendererTurbo(this, 184, 297, textureX, textureY); // Boc 42
		bodyModel[251] = new ModelRendererTurbo(this, 184, 332, textureX, textureY); // Box 638
		bodyModel[252] = new ModelRendererTurbo(this, 188, 281, textureX, textureY); // Right seat part
		bodyModel[253] = new ModelRendererTurbo(this, 199, 299, textureX, textureY); // Right seat part
		bodyModel[254] = new ModelRendererTurbo(this, 199, 334, textureX, textureY); // Left seat part
		bodyModel[255] = new ModelRendererTurbo(this, 188, 316, textureX, textureY); // Left seat part
		bodyModel[256] = new ModelRendererTurbo(this, 188, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[257] = new ModelRendererTurbo(this, 199, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[258] = new ModelRendererTurbo(this, 199, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[259] = new ModelRendererTurbo(this, 188, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[260] = new ModelRendererTurbo(this, 163, 286, textureX, textureY); // Right seat part
		bodyModel[261] = new ModelRendererTurbo(this, 173, 276, textureX, textureY); // Right seat part
		bodyModel[262] = new ModelRendererTurbo(this, 163, 321, textureX, textureY); // Left seat part
		bodyModel[263] = new ModelRendererTurbo(this, 173, 311, textureX, textureY); // Left seat part
		bodyModel[264] = new ModelRendererTurbo(this, 156, 297, textureX, textureY); // Boc 42
		bodyModel[265] = new ModelRendererTurbo(this, 156, 332, textureX, textureY); // Box 638
		bodyModel[266] = new ModelRendererTurbo(this, 160, 281, textureX, textureY); // Right seat part
		bodyModel[267] = new ModelRendererTurbo(this, 171, 299, textureX, textureY); // Right seat part
		bodyModel[268] = new ModelRendererTurbo(this, 171, 334, textureX, textureY); // Left seat part
		bodyModel[269] = new ModelRendererTurbo(this, 160, 316, textureX, textureY); // Left seat part
		bodyModel[270] = new ModelRendererTurbo(this, 160, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[271] = new ModelRendererTurbo(this, 171, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[272] = new ModelRendererTurbo(this, 171, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[273] = new ModelRendererTurbo(this, 160, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[274] = new ModelRendererTurbo(this, 135, 286, textureX, textureY); // Right seat part
		bodyModel[275] = new ModelRendererTurbo(this, 145, 276, textureX, textureY); // Right seat part
		bodyModel[276] = new ModelRendererTurbo(this, 135, 321, textureX, textureY); // Left seat part test
		bodyModel[277] = new ModelRendererTurbo(this, 145, 311, textureX, textureY); // Left seat part test
		bodyModel[278] = new ModelRendererTurbo(this, 128, 297, textureX, textureY); // Boc 42
		bodyModel[279] = new ModelRendererTurbo(this, 128, 332, textureX, textureY); // Box 638
		bodyModel[280] = new ModelRendererTurbo(this, 132, 281, textureX, textureY); // Right seat part
		bodyModel[281] = new ModelRendererTurbo(this, 143, 299, textureX, textureY); // Right seat part
		bodyModel[282] = new ModelRendererTurbo(this, 143, 334, textureX, textureY); // Left seat part test
		bodyModel[283] = new ModelRendererTurbo(this, 132, 316, textureX, textureY); // Left seat part test
		bodyModel[284] = new ModelRendererTurbo(this, 132, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[285] = new ModelRendererTurbo(this, 143, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[286] = new ModelRendererTurbo(this, 143, 328, textureX, textureY,"cull"); // Left seat part cull test
		bodyModel[287] = new ModelRendererTurbo(this, 132, 310, textureX, textureY,"cull"); // Left seat part cull test
		bodyModel[288] = new ModelRendererTurbo(this, 107, 321, textureX, textureY); // Left seat part
		bodyModel[289] = new ModelRendererTurbo(this, 117, 311, textureX, textureY); // Left seat part
		bodyModel[290] = new ModelRendererTurbo(this, 100, 332, textureX, textureY); // Box 638
		bodyModel[291] = new ModelRendererTurbo(this, 115, 334, textureX, textureY); // Left seat part
		bodyModel[292] = new ModelRendererTurbo(this, 104, 316, textureX, textureY); // Left seat part
		bodyModel[293] = new ModelRendererTurbo(this, 115, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[294] = new ModelRendererTurbo(this, 104, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[295] = new ModelRendererTurbo(this, 208, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[296] = new ModelRendererTurbo(this, 199, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[297] = new ModelRendererTurbo(this, 190, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[298] = new ModelRendererTurbo(this, 181, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[299] = new ModelRendererTurbo(this, 172, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[300] = new ModelRendererTurbo(this, 163, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[301] = new ModelRendererTurbo(this, 154, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[302] = new ModelRendererTurbo(this, 84, 261, textureX, textureY); // Box 38
		bodyModel[303] = new ModelRendererTurbo(this, 84, 266, textureX, textureY); // Box 462
		bodyModel[304] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 2
		bodyModel[305] = new ModelRendererTurbo(this, 74, 145, textureX, textureY); // Box 472
		bodyModel[306] = new ModelRendererTurbo(this, 62, 140, textureX, textureY); // Box 192
		bodyModel[307] = new ModelRendererTurbo(this, 282, 140, textureX, textureY); // Box 192
		bodyModel[308] = new ModelRendererTurbo(this, 62, 152, textureX, textureY); // Box 475
		bodyModel[309] = new ModelRendererTurbo(this, 282, 150, textureX, textureY); // Box 476
		bodyModel[310] = new ModelRendererTurbo(this, 140, 64, textureX, textureY); // Box 38
		bodyModel[311] = new ModelRendererTurbo(this, 94, 66, textureX, textureY); // Box 38
		bodyModel[312] = new ModelRendererTurbo(this, 140, 23, textureX, textureY); // Box 451
		bodyModel[313] = new ModelRendererTurbo(this, 94, 21, textureX, textureY); // Box 452
		bodyModel[314] = new ModelRendererTurbo(this, 75, 1, textureX, textureY); // Box 38
		bodyModel[315] = new ModelRendererTurbo(this, 287, 16, textureX, textureY); // Box 487
		bodyModel[316] = new ModelRendererTurbo(this, 296, 20, textureX, textureY); // Box 128
		bodyModel[317] = new ModelRendererTurbo(this, 296, 1, textureX, textureY); // Box 205
		bodyModel[318] = new ModelRendererTurbo(this, 150, 174, textureX, textureY); // Box 283
		bodyModel[319] = new ModelRendererTurbo(this, 178, 177, textureX, textureY); // Box 41
		bodyModel[320] = new ModelRendererTurbo(this, 193, 178, textureX, textureY); // Box 41
		bodyModel[321] = new ModelRendererTurbo(this, 175, 178, textureX, textureY); // Box 41
		bodyModel[322] = new ModelRendererTurbo(this, 185, 155, textureX, textureY); // Box 494
		bodyModel[323] = new ModelRendererTurbo(this, 17, 237, textureX, textureY); // Box 128
		bodyModel[324] = new ModelRendererTurbo(this, 1, 298, textureX, textureY); // Box 128
		bodyModel[325] = new ModelRendererTurbo(this, 18, 304, textureX, textureY); // Box 128
		bodyModel[326] = new ModelRendererTurbo(this, 67, 287, textureX, textureY); // Box 128
		bodyModel[327] = new ModelRendererTurbo(this, 1, 275, textureX, textureY); // Box 128
		bodyModel[328] = new ModelRendererTurbo(this, 360, 306, textureX, textureY); // Box 38
		bodyModel[329] = new ModelRendererTurbo(this, 380, 304, textureX, textureY); // Box 128
		bodyModel[330] = new ModelRendererTurbo(this, 395, 316, textureX, textureY); // Box 128
		bodyModel[331] = new ModelRendererTurbo(this, 331, 321, textureX, textureY); // Box 38
		bodyModel[332] = new ModelRendererTurbo(this, 89, 287, textureX, textureY); // Box 128
		bodyModel[333] = new ModelRendererTurbo(this, 78, 287, textureX, textureY); // Box 128
		bodyModel[334] = new ModelRendererTurbo(this, 26, 345, textureX, textureY); // Box 128
		bodyModel[335] = new ModelRendererTurbo(this, 268, 326, textureX, textureY); // Box 38
		bodyModel[336] = new ModelRendererTurbo(this, 113, 292, textureX, textureY); // Box 38
		bodyModel[337] = new ModelRendererTurbo(this, 104, 294, textureX, textureY); // Box 128
		bodyModel[338] = new ModelRendererTurbo(this, 18, 201, textureX, textureY); // Box 128
		bodyModel[339] = new ModelRendererTurbo(this, 18, 173, textureX, textureY); // Box 185
		bodyModel[340] = new ModelRendererTurbo(this, 7, 157, textureX, textureY); // Box 128
		bodyModel[341] = new ModelRendererTurbo(this, 1, 179, textureX, textureY); // Box 128
		bodyModel[342] = new ModelRendererTurbo(this, 72, 227, textureX, textureY); // Box 128
		bodyModel[343] = new ModelRendererTurbo(this, 72, 235, textureX, textureY); // Box 128
		bodyModel[344] = new ModelRendererTurbo(this, 72, 232, textureX, textureY); // Box 128
		bodyModel[345] = new ModelRendererTurbo(this, 72, 194, textureX, textureY); // Box 192
		bodyModel[346] = new ModelRendererTurbo(this, 72, 187, textureX, textureY); // Box 193
		bodyModel[347] = new ModelRendererTurbo(this, 72, 191, textureX, textureY); // Box 194
		bodyModel[348] = new ModelRendererTurbo(this, 71, 218, textureX, textureY); // Box 128
		bodyModel[349] = new ModelRendererTurbo(this, 4, 325, textureX, textureY); // Box 38
		bodyModel[350] = new ModelRendererTurbo(this, 7, 330, textureX, textureY); // Box 38
		bodyModel[351] = new ModelRendererTurbo(this, 6, 334, textureX, textureY); // Box 38
		bodyModel[352] = new ModelRendererTurbo(this, 365, 310, textureX, textureY); // Box 340
		bodyModel[353] = new ModelRendererTurbo(this, 367, 314, textureX, textureY); // Box 41
		bodyModel[354] = new ModelRendererTurbo(this, 366, 298, textureX, textureY); // Box 340
		bodyModel[355] = new ModelRendererTurbo(this, 367, 302, textureX, textureY); // Box 41
		bodyModel[356] = new ModelRendererTurbo(this, 30, 289, textureX, textureY); // Box 340
		bodyModel[357] = new ModelRendererTurbo(this, 32, 293, textureX, textureY); // Box 41
		bodyModel[358] = new ModelRendererTurbo(this, 30, 323, textureX, textureY); // Box 340
		bodyModel[359] = new ModelRendererTurbo(this, 32, 327, textureX, textureY); // Box 41
		bodyModel[360] = new ModelRendererTurbo(this, 31, 307, textureX, textureY); // Box 340
		bodyModel[361] = new ModelRendererTurbo(this, 32, 311, textureX, textureY); // Box 41
		bodyModel[362] = new ModelRendererTurbo(this, 66, 272, textureX, textureY); // Box 128
		bodyModel[363] = new ModelRendererTurbo(this, 66, 316, textureX, textureY); // Box 340
		bodyModel[364] = new ModelRendererTurbo(this, 336, 281, textureX, textureY); // Box 402
		bodyModel[365] = new ModelRendererTurbo(this, 314, 289, textureX, textureY); // Right seat part
		bodyModel[366] = new ModelRendererTurbo(this, 298, 284, textureX, textureY); // Right seat part
		bodyModel[367] = new ModelRendererTurbo(this, 315, 305, textureX, textureY,"cull"); // Boc 42 cull
		bodyModel[368] = new ModelRendererTurbo(this, 337, 310, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[369] = new ModelRendererTurbo(this, 337, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[370] = new ModelRendererTurbo(this, 31, 306, textureX, textureY); // Right seat part
		bodyModel[371] = new ModelRendererTurbo(this, 34, 288, textureX, textureY); // Right seat part
		bodyModel[372] = new ModelRendererTurbo(this, 32, 322, textureX, textureY); // Boc 42
		bodyModel[373] = new ModelRendererTurbo(this, 52, 327, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[374] = new ModelRendererTurbo(this, 50, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[375] = new ModelRendererTurbo(this, 351, 300, textureX, textureY); // Box 38
		bodyModel[376] = new ModelRendererTurbo(this, 348, 307, textureX, textureY); // Box 38
		bodyModel[377] = new ModelRendererTurbo(this, 348, 313, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[378] = new ModelRendererTurbo(this, 354, 304, textureX, textureY); // Box 38
		bodyModel[379] = new ModelRendererTurbo(this, 296, 5, textureX, textureY); // Box 205
		bodyModel[380] = new ModelRendererTurbo(this, 296, 15, textureX, textureY); // Box 205
		bodyModel[381] = new ModelRendererTurbo(this, 75, 17, textureX, textureY); // Box 487
		bodyModel[382] = new ModelRendererTurbo(this, 16, 95, textureX, textureY); // Box 128
		bodyModel[383] = new ModelRendererTurbo(this, 17, 90, textureX, textureY); // Box 128
		bodyModel[384] = new ModelRendererTurbo(this, 16, 70, textureX, textureY); // Box 251
		bodyModel[385] = new ModelRendererTurbo(this, 17, 76, textureX, textureY); // Box 253
		bodyModel[386] = new ModelRendererTurbo(this, 377, 95, textureX, textureY); // Box 128
		bodyModel[387] = new ModelRendererTurbo(this, 378, 90, textureX, textureY); // Box 128
		bodyModel[388] = new ModelRendererTurbo(this, 377, 70, textureX, textureY); // Box 251
		bodyModel[389] = new ModelRendererTurbo(this, 378, 76, textureX, textureY); // Box 253
		bodyModel[390] = new ModelRendererTurbo(this, 89, 66, textureX, textureY); // Box 38
		bodyModel[391] = new ModelRendererTurbo(this, 89, 21, textureX, textureY); // Box 432
		bodyModel[392] = new ModelRendererTurbo(this, 28, 133, textureX, textureY); // Box 191
		bodyModel[393] = new ModelRendererTurbo(this, 28, 143, textureX, textureY); // Box 191
		bodyModel[394] = new ModelRendererTurbo(this, 321, 135, textureX, textureY); // Box 191
		bodyModel[395] = new ModelRendererTurbo(this, 321, 146, textureX, textureY); // Box 191
		bodyModel[396] = new ModelRendererTurbo(this, 234, 151, textureX, textureY); // Box 2
		bodyModel[397] = new ModelRendererTurbo(this, 234, 141, textureX, textureY); // Box 35
		bodyModel[398] = new ModelRendererTurbo(this, 96, 147, textureX, textureY); // Box 2
		bodyModel[399] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[400] = new ModelRendererTurbo(this, 103, 147, textureX, textureY); // Box 2
		bodyModel[401] = new ModelRendererTurbo(this, 106, 141, textureX, textureY); // Box 39
		bodyModel[402] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 2
		bodyModel[403] = new ModelRendererTurbo(this, 230, 141, textureX, textureY); // Box 39
		bodyModel[404] = new ModelRendererTurbo(this, 244, 138, textureX, textureY); // Box 41
		bodyModel[405] = new ModelRendererTurbo(this, 248, 148, textureX, textureY); // Box 473
		bodyModel[406] = new ModelRendererTurbo(this, 91, 138, textureX, textureY); // Box 41
		bodyModel[407] = new ModelRendererTurbo(this, 91, 148, textureX, textureY); // Box 473
		bodyModel[408] = new ModelRendererTurbo(this, 89, 151, textureX, textureY); // Box 2
		bodyModel[409] = new ModelRendererTurbo(this, 89, 141, textureX, textureY); // Box 33
		bodyModel[410] = new ModelRendererTurbo(this, 248, 151, textureX, textureY); // Box 2
		bodyModel[411] = new ModelRendererTurbo(this, 248, 141, textureX, textureY); // Box 29
		bodyModel[412] = new ModelRendererTurbo(this, 91, 171, textureX, textureY); // Box 41
		bodyModel[413] = new ModelRendererTurbo(this, 108, 172, textureX, textureY); // Box 41
		bodyModel[414] = new ModelRendererTurbo(this, 88, 172, textureX, textureY); // Box 41
		bodyModel[415] = new ModelRendererTurbo(this, 229, 155, textureX, textureY); // Box 41
		bodyModel[416] = new ModelRendererTurbo(this, 244, 156, textureX, textureY); // Box 41
		bodyModel[417] = new ModelRendererTurbo(this, 226, 156, textureX, textureY); // Box 41
		bodyModel[418] = new ModelRendererTurbo(this, 168, 155, textureX, textureY); // Box 494
		bodyModel[419] = new ModelRendererTurbo(this, 186, 165, textureX, textureY); // Box 494
		bodyModel[420] = new ModelRendererTurbo(this, 189, 171, textureX, textureY); // Box 494
		bodyModel[421] = new ModelRendererTurbo(this, 141, 155, textureX, textureY); // Box 494
		bodyModel[422] = new ModelRendererTurbo(this, 116, 155, textureX, textureY); // Box 494
		bodyModel[423] = new ModelRendererTurbo(this, 117, 165, textureX, textureY); // Box 494
		bodyModel[424] = new ModelRendererTurbo(this, 120, 171, textureX, textureY); // Box 494
		bodyModel[425] = new ModelRendererTurbo(this, 127, 174, textureX, textureY); // Box 283
		bodyModel[426] = new ModelRendererTurbo(this, 196, 177, textureX, textureY); // Box 283
		bodyModel[427] = new ModelRendererTurbo(this, 253, 148, textureX, textureY); // Box 2
		bodyModel[428] = new ModelRendererTurbo(this, 252, 145, textureX, textureY); // Box 2
		bodyModel[429] = new ModelRendererTurbo(this, 238, 145, textureX, textureY); // Box 2
		bodyModel[430] = new ModelRendererTurbo(this, 238, 147, textureX, textureY); // Box 2
		bodyModel[431] = new ModelRendererTurbo(this, 254, 138, textureX, textureY); // Box 28
		bodyModel[432] = new ModelRendererTurbo(this, 248, 137, textureX, textureY); // Box 29
		bodyModel[433] = new ModelRendererTurbo(this, 240, 138, textureX, textureY); // Box 34
		bodyModel[434] = new ModelRendererTurbo(this, 234, 137, textureX, textureY); // Box 35
		bodyModel[435] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 2
		bodyModel[436] = new ModelRendererTurbo(this, 57, 148, textureX, textureY); // Box 2
		bodyModel[437] = new ModelRendererTurbo(this, 66, 145, textureX, textureY); // Box 2
		bodyModel[438] = new ModelRendererTurbo(this, 64, 148, textureX, textureY); // Box 2
		bodyModel[439] = new ModelRendererTurbo(this, 60, 133, textureX, textureY); // Box 32
		bodyModel[440] = new ModelRendererTurbo(this, 60, 136, textureX, textureY); // Box 33
		bodyModel[441] = new ModelRendererTurbo(this, 69, 133, textureX, textureY); // Box 36
		bodyModel[442] = new ModelRendererTurbo(this, 67, 136, textureX, textureY); // Box 37
		bodyModel[443] = new ModelRendererTurbo(this, 59, 79, textureX, textureY); // Box 128
		bodyModel[444] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 128
		bodyModel[445] = new ModelRendererTurbo(this, 59, 103, textureX, textureY); // Box 204
		bodyModel[446] = new ModelRendererTurbo(this, 81, 155, textureX, textureY); // Box 205
		bodyModel[447] = new ModelRendererTurbo(this, 414, 57, textureX, textureY); // Box 128
		bodyModel[448] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[449] = new ModelRendererTurbo(this, 55, 138, textureX, textureY); // Box 192
		bodyModel[450] = new ModelRendererTurbo(this, 287, 139, textureX, textureY); // Box 192
		bodyModel[451] = new ModelRendererTurbo(this, 61, 155, textureX, textureY); // Box 475
		bodyModel[452] = new ModelRendererTurbo(this, 287, 148, textureX, textureY); // Box 476
		bodyModel[453] = new ModelRendererTurbo(this, 9, 92, textureX, textureY); // Box 128
		bodyModel[454] = new ModelRendererTurbo(this, 1, 84, textureX, textureY); // Box 128
		bodyModel[455] = new ModelRendererTurbo(this, 10, 108, textureX, textureY); // Box 128
		bodyModel[456] = new ModelRendererTurbo(this, 18, 109, textureX, textureY); // Box 128
		bodyModel[457] = new ModelRendererTurbo(this, 9, 80, textureX, textureY); // Box 253
		bodyModel[458] = new ModelRendererTurbo(this, 4, 109, textureX, textureY); // Box 255
		bodyModel[459] = new ModelRendererTurbo(this, 14, 115, textureX, textureY); // Box 128
		bodyModel[460] = new ModelRendererTurbo(this, 4, 115, textureX, textureY); // Box 153
		bodyModel[461] = new ModelRendererTurbo(this, 17, 53, textureX, textureY); // Box 128
		bodyModel[462] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[463] = new ModelRendererTurbo(this, 391, 90, textureX, textureY); // Box 128
		bodyModel[464] = new ModelRendererTurbo(this, 383, 78, textureX, textureY); // Box 128
		bodyModel[465] = new ModelRendererTurbo(this, 419, 45, textureX, textureY); // Box 128
		bodyModel[466] = new ModelRendererTurbo(this, 427, 46, textureX, textureY); // Box 128
		bodyModel[467] = new ModelRendererTurbo(this, 392, 75, textureX, textureY); // Box 253
		bodyModel[468] = new ModelRendererTurbo(this, 413, 46, textureX, textureY); // Box 255
		bodyModel[469] = new ModelRendererTurbo(this, 423, 52, textureX, textureY); // Box 128
		bodyModel[470] = new ModelRendererTurbo(this, 413, 52, textureX, textureY); // Box 153
		bodyModel[471] = new ModelRendererTurbo(this, 426, 19, textureX, textureY); // Box 128
		bodyModel[472] = new ModelRendererTurbo(this, 447, 19, textureX, textureY); // Box 153
		bodyModel[473] = new ModelRendererTurbo(this, 386, 94, textureX, textureY); // Box 128
		bodyModel[474] = new ModelRendererTurbo(this, 386, 70, textureX, textureY); // Box 251
		bodyModel[475] = new ModelRendererTurbo(this, 4, 96, textureX, textureY); // Box 128
		bodyModel[476] = new ModelRendererTurbo(this, 4, 75, textureX, textureY); // Box 251
		bodyModel[477] = new ModelRendererTurbo(this, 1, 92, textureX, textureY); // Box 128
		bodyModel[478] = new ModelRendererTurbo(this, 1, 80, textureX, textureY); // Box 253
		bodyModel[479] = new ModelRendererTurbo(this, 384, 75, textureX, textureY); // Box 253
		bodyModel[480] = new ModelRendererTurbo(this, 384, 90, textureX, textureY); // Box 128
		bodyModel[481] = new ModelRendererTurbo(this, 84, 17, textureX, textureY); // Box 128
		bodyModel[482] = new ModelRendererTurbo(this, 84, 1, textureX, textureY); // Box 205
		bodyModel[483] = new ModelRendererTurbo(this, 84, 5, textureX, textureY); // Box 205
		bodyModel[484] = new ModelRendererTurbo(this, 84, 12, textureX, textureY); // Box 205
		bodyModel[485] = new ModelRendererTurbo(this, 291, 1, textureX, textureY); // Box 190
		bodyModel[486] = new ModelRendererTurbo(this, 291, 20, textureX, textureY); // Box 497
		bodyModel[487] = new ModelRendererTurbo(this, 79, 5, textureX, textureY); // Box 190
		bodyModel[488] = new ModelRendererTurbo(this, 396, 174, textureX, textureY); // Box 494
		bodyModel[489] = new ModelRendererTurbo(this, 251, 173, textureX, textureY); // Box 2
		bodyModel[490] = new ModelRendererTurbo(this, 251, 182, textureX, textureY); // Box 2
		bodyModel[491] = new ModelRendererTurbo(this, 208, 155, textureX, textureY); // Box 41
		bodyModel[492] = new ModelRendererTurbo(this, 223, 156, textureX, textureY); // Box 41
		bodyModel[493] = new ModelRendererTurbo(this, 205, 156, textureX, textureY); // Box 41
		bodyModel[494] = new ModelRendererTurbo(this, 229, 155, textureX, textureY); // Box 41
		bodyModel[495] = new ModelRendererTurbo(this, 244, 156, textureX, textureY); // Box 41
		bodyModel[496] = new ModelRendererTurbo(this, 226, 156, textureX, textureY); // Box 41
		bodyModel[497] = new ModelRendererTurbo(this, 285, 191, textureX, textureY); // Box 283
		bodyModel[498] = new ModelRendererTurbo(this, 260, 190, textureX, textureY); // Box 41
		bodyModel[499] = new ModelRendererTurbo(this, 275, 191, textureX, textureY); // Box 41

		bodyModel[0].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[0].setRotationPoint(52.5F, 3F, -5F);

		bodyModel[1].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[1].setRotationPoint(-57.5F, 3F, -5F);

		bodyModel[2].addBox(0F, 0F, 0F, 105, 1, 4, 0F); // Box 2
		bodyModel[2].setRotationPoint(-52.5F, 3F, -2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[3].setRotationPoint(40F, 4F, -1F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[4].setRotationPoint(-42F, 4F, -1F);

		bodyModel[5].addBox(0F, 0F, 0F, 16, 2, 6, 0F); // Box 2
		bodyModel[5].setRotationPoint(-26.5F, 4F, -3F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[6].setRotationPoint(-26.5F, 6F, -3F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[7].setRotationPoint(-16.5F, 2.75F, -8.5F);
		bodyModel[7].rotateAngleX = -0.78539816F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[8].setRotationPoint(-16.51F, 3F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[9].setRotationPoint(-11.49F, 3F, -9F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 283
		bodyModel[10].setRotationPoint(-26.5F, 3F, 8F);

		bodyModel[11].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 283
		bodyModel[11].setRotationPoint(18.5F, 3F, 5F);

		bodyModel[12].addBox(0F, 0F, 0F, 110, 2, 22, 0F); // Box 2
		bodyModel[12].setRotationPoint(-57.5F, 1F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[13].setRotationPoint(-59.5F, 3F, -1.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull
		bodyModel[14].setRotationPoint(-57.5F, 4F, 10.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[15].setRotationPoint(-57.5F, 3F, 10.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[16].setRotationPoint(-51.5F, 4F, 10.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30 cull
		bodyModel[17].setRotationPoint(-57.5F, 4F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[18].setRotationPoint(-57.5F, 3F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[19].setRotationPoint(-51.5F, 4F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[20].setRotationPoint(-57.5F, 3F, -10.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[21].setRotationPoint(-57.5F, 4F, -10.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[22].setRotationPoint(-57.5F, 3F, 4.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[23].setRotationPoint(-57.5F, 4F, 9.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[24].setRotationPoint(56.5F, 1F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[25].setRotationPoint(52.5F, 1F, -5F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[26].setRotationPoint(55.5F, 3F, -1.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[27].setRotationPoint(52.5F, 1F, -10.99F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[28].setRotationPoint(52.5F, 1F, 4.99F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[29].setRotationPoint(56.5F, 3F, 10.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[30].setRotationPoint(56.5F, 4F, 10.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[31].setRotationPoint(51.5F, 4F, 10.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 2
		bodyModel[32].setRotationPoint(49.5F, 4F, 10.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[33].setRotationPoint(56.5F, 3F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[34].setRotationPoint(56.5F, 4F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[35].setRotationPoint(51.5F, 4F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 29
		bodyModel[36].setRotationPoint(49.5F, 4F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[37].setRotationPoint(50.5F, 3F, 10.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[38].setRotationPoint(57F, 3F, -10.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[39].setRotationPoint(57F, 4F, -10.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[40].setRotationPoint(57F, 3F, 4.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[41].setRotationPoint(57F, 4F, 9.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[42].setRotationPoint(56.51F, 3F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[43].setRotationPoint(52.49F, 3F, -9F);

		bodyModel[44].addShapeBox(0F, 1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[44].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[45].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[45].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[46].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[46].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[47].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[47].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[48].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[48].setRotationPoint(56.49F, 4F, -8F);

		bodyModel[49].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[49].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[50].addShapeBox(0F, 2F, -2.5F, 4, 0, 4, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 1F, -0.5F, 0F, 1F, -0.5F); // Left step part
		bodyModel[50].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[51].setRotationPoint(52.5F, 3F, -10.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[52].setRotationPoint(52.5F, 4F, -10.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[53].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[54].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[55].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[55].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[56].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[56].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[57].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[58].setRotationPoint(56.49F, 4F, -8F);

		bodyModel[59].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[59].setRotationPoint(52.51F, 4F, -8F);

		bodyModel[60].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[60].setRotationPoint(56.49F, 4F, -8F);

		bodyModel[61].addShapeBox(0F, 1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[61].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[62].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[62].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[63].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[63].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[64].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[64].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[65].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[65].setRotationPoint(56.49F, 4F, 8F);

		bodyModel[66].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[66].setRotationPoint(56.49F, 4F, 8F);

		bodyModel[67].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[67].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[68].addShapeBox(0F, 2F, -1.5F, 4, 0, 4, 0F,0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[68].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[69].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[69].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[70].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[70].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[71].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[71].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[72].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[72].setRotationPoint(52.51F, 4F, 8F);

		bodyModel[73].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[73].setRotationPoint(56.49F, 4F, 8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 144
		bodyModel[74].setRotationPoint(56.51F, 3F, 8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 145
		bodyModel[75].setRotationPoint(52.49F, 3F, 8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
		bodyModel[76].setRotationPoint(52.5F, 3F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
		bodyModel[77].setRotationPoint(52.5F, 4F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[78].setRotationPoint(56.5F, 3F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 143
		bodyModel[79].setRotationPoint(56.5F, 4F, 8F);

		bodyModel[80].addShapeBox(0F, 0F, -1F, 5, 15, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[80].setRotationPoint(52.51F, -14F, -10.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 110, 16, 1, 0F); // Box 38
		bodyModel[81].setRotationPoint(-57.5F, -15F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 110, 16, 1, 0F); // Box 128
		bodyModel[82].setRotationPoint(-57.5F, -15F, 10F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[83].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[84].setRotationPoint(56.5F, -15F, 3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[85].setRotationPoint(52.51F, -14F, 10.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[86].setRotationPoint(-57.5F, -15F, -10F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[87].setRotationPoint(-57.5F, -15F, 3F);

		bodyModel[88].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[88].setRotationPoint(52.5F, -15F, -11F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[89].setRotationPoint(52.5F, -15F, 10F);

		bodyModel[90].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[90].setRotationPoint(-56.5F, -14F, -3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[91].setRotationPoint(57.5F, -7F, -3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[92].setRotationPoint(57.5F, -7F, -3F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[93].setRotationPoint(52F, -6F, -12F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[94].setRotationPoint(57F, -6F, -12F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[95].setRotationPoint(52F, -6F, 11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[96].setRotationPoint(57F, -6F, 11F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[97].setRotationPoint(-57.5F, -15F, -3F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[98].setRotationPoint(51.5F, -15F, -10F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[99].setRotationPoint(51.5F, -15F, 3F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[100].setRotationPoint(51.5F, -15F, -3F);

		bodyModel[101].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[101].setRotationPoint(51.5F, -14F, 3F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[102].setRotationPoint(57.5F, -15F, -4F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[103].setRotationPoint(57.5F, 1F, -4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[104].setRotationPoint(57.5F, -14F, -4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[105].setRotationPoint(57.5F, -14F, 3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[106].setRotationPoint(59F, -14F, -5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[107].setRotationPoint(59F, -14F, 3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[108].setRotationPoint(59F, 1F, -5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[109].setRotationPoint(59F, -17F, -5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 18, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[110].setRotationPoint(57.5F, -15F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[111].setRotationPoint(57.5F, -15F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, -1.75F, 0F, -1.5F, -1.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -1.5F, 1.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[112].setRotationPoint(57.5F, -19F, -10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[113].setRotationPoint(57.5F, -20F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 0, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[114].setRotationPoint(57.5F, -20F, -3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 18, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[115].setRotationPoint(57.5F, -15F, 11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 2.25F, -1F, -1.5F, 2.25F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -1.5F, -2.25F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[116].setRotationPoint(57.5F, -15F, 9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[117].setRotationPoint(57.5F, -19F, 7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[118].setRotationPoint(57.5F, -20F, 3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[119].setRotationPoint(59F, -15F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[120].setRotationPoint(59F, -16F, -11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[121].setRotationPoint(59F, 1F, -10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[122].setRotationPoint(59F, -20F, -3F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[123].setRotationPoint(59F, -20F, -5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[124].setRotationPoint(59F, -15F, 10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[125].setRotationPoint(59F, -16F, 9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[126].setRotationPoint(59F, -20F, 3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[127].setRotationPoint(59.5F, -7F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[128].setRotationPoint(59.5F, -7F, 5F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[129].setRotationPoint(56.5F, -15F, -3F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[130].setRotationPoint(-59F, -15F, -4F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[131].setRotationPoint(-59F, 1F, -4F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[132].setRotationPoint(-59F, -14F, -4F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[133].setRotationPoint(-59F, -14F, 3F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[134].setRotationPoint(-59.5F, -14F, -5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[135].setRotationPoint(-59.5F, -14F, 3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[136].setRotationPoint(-59.5F, 1F, -5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[137].setRotationPoint(-59.5F, -17F, -5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[138].setRotationPoint(-59.5F, -15F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 18, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[139].setRotationPoint(-59F, -15F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[140].setRotationPoint(-59.5F, -16F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[141].setRotationPoint(-59F, -15F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[142].setRotationPoint(-59.5F, 1F, -10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, -1.75F, 0F, -1.5F, -1.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -1.5F, 1.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[143].setRotationPoint(-59F, -19F, -10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[144].setRotationPoint(-59F, -20F, -7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[145].setRotationPoint(-59.5F, -20F, -3F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 0, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[146].setRotationPoint(-59F, -20F, -3F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[147].setRotationPoint(-59.5F, -19.75F, -5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[148].setRotationPoint(-59.5F, -15F, 10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 18, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[149].setRotationPoint(-59F, -15F, 11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[150].setRotationPoint(-59.5F, -16F, 9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 2.25F, -1F, -1.5F, 2.25F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -1.5F, -2.25F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[151].setRotationPoint(-59F, -15F, 9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[152].setRotationPoint(-59F, -19F, 7F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[153].setRotationPoint(-59F, -20F, 3F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[154].setRotationPoint(-59.5F, -19.75F, 3F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[155].setRotationPoint(-59.5F, -7F, -10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[156].setRotationPoint(-59.5F, -7F, 5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[157].setRotationPoint(-57.5F, -17F, -7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[158].setRotationPoint(-57.5F, -18F, -10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[159].setRotationPoint(-57.5F, -18F, 7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[160].setRotationPoint(-57.5F, -16.25F, -10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 115, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[161].setRotationPoint(-57.5F, -19F, -7F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 115, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[162].setRotationPoint(-57.5F, -19F, 3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[163].setRotationPoint(51.5F, -17F, -7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[164].setRotationPoint(51.5F, -18F, -10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 176
		bodyModel[165].setRotationPoint(51.5F, -18F, 7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[166].setRotationPoint(51.5F, -16.25F, -10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 20, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[167].setRotationPoint(31.5F, -18F, -10F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 20, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185
		bodyModel[168].setRotationPoint(31.5F, -18F, 7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 115, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[169].setRotationPoint(-57.5F, -16F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 115, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[170].setRotationPoint(-57.5F, -16F, 10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 115, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[171].setRotationPoint(-57.5F, -20F, -3F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 115, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[172].setRotationPoint(-57.5F, -20F, -7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 115, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[173].setRotationPoint(-57.5F, -19F, -10F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 115, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[174].setRotationPoint(-57.5F, -20F, 3F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 115, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[175].setRotationPoint(-57.5F, -19F, 7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[176].setRotationPoint(30.5F, 4F, 10.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 2
		bodyModel[177].setRotationPoint(-32.5F, 4F, 10.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 63, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[178].setRotationPoint(-31.5F, 3F, 10.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 59, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[179].setRotationPoint(-29.5F, 4F, 10.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[180].setRotationPoint(30.5F, 4F, -11F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 37
		bodyModel[181].setRotationPoint(-32.5F, 4F, -11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 63, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[182].setRotationPoint(-31.5F, 3F, -11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 59, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[183].setRotationPoint(-29.5F, 4F, -11F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[184].setRotationPoint(50.5F, 3F, -11F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull test
		bodyModel[185].setRotationPoint(-50.5F, 3F, 10.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41 cull test
		bodyModel[186].setRotationPoint(-50.5F, 3F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull test
		bodyModel[187].setRotationPoint(31.5F, 3F, 10.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41 cull test
		bodyModel[188].setRotationPoint(31.5F, 3F, -11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 115, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[189].setRotationPoint(-57.5F, -19F, -3F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 20, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[190].setRotationPoint(31.5F, -17F, -7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[191].setRotationPoint(-57F, -6F, 11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[192].setRotationPoint(-57F, -6F, -12F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull test
		bodyModel[193].setRotationPoint(-51.5F, 4F, 10.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull test
		bodyModel[194].setRotationPoint(30.5F, 4F, 10.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39 cull test
		bodyModel[195].setRotationPoint(-51.5F, 4F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39 cull test
		bodyModel[196].setRotationPoint(30.5F, 4F, -11F);

		bodyModel[197].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 38
		bodyModel[197].setRotationPoint(31.5F, -15F, -6F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 20, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[198].setRotationPoint(31.5F, -16.25F, -10F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 128
		bodyModel[199].setRotationPoint(-39.5F, -15F, -10F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 65, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 38 cull
		bodyModel[200].setRotationPoint(-33.5F, -14F, 7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 65, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 275 cull
		bodyModel[201].setRotationPoint(-38.5F, -14F, -10F);

		bodyModel[202].addBox(0F, 0F, 0F, 65, 0, 2, 0F); // Box 275 glow
		bodyModel[202].setRotationPoint(-38.5F, -12.99F, -9F);

		bodyModel[203].addBox(0F, 0F, 0F, 65, 0, 2, 0F); // Box 285 glow
		bodyModel[203].setRotationPoint(-33.5F, -12.99F, 7F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 65, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[204].setRotationPoint(-33.5F, -13F, 9F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 55, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[205].setRotationPoint(-28.5F, -13F, -10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[206].setRotationPoint(50.05F, -2F, 9.95F);
		bodyModel[206].rotateAngleY = -2.35619449F;

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[207].setRotationPoint(50.4F, -1F, 9.6F);
		bodyModel[207].rotateAngleY = -2.35619449F;

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[208].setRotationPoint(50.05F, 0.5F, 9.95F);
		bodyModel[208].rotateAngleY = -2.35619449F;

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[209].setRotationPoint(43.5F, -6F, 8F);

		bodyModel[210].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[210].setRotationPoint(44.5F, -5F, 9F);
		bodyModel[210].rotateAngleY = -0.78539816F;

		bodyModel[211].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[211].setRotationPoint(26.5F, -3F, 7F);
		bodyModel[211].rotateAngleY = -3.14159265F;

		bodyModel[212].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[212].setRotationPoint(26.5F, -8F, 7F);
		bodyModel[212].rotateAngleY = -3.14159265F;

		bodyModel[213].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[213].setRotationPoint(25F, -1F, 5F);

		bodyModel[214].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[214].setRotationPoint(26.5F, -3F, 7F);
		bodyModel[214].rotateAngleY = -3.14159265F;

		bodyModel[215].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[215].setRotationPoint(26.5F, -3F, 7F);
		bodyModel[215].rotateAngleY = -3.14159265F;

		bodyModel[216].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[216].setRotationPoint(26.5F, -5F, 7F);
		bodyModel[216].rotateAngleY = -3.14159265F;

		bodyModel[217].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[217].setRotationPoint(26.5F, -5F, 7F);
		bodyModel[217].rotateAngleY = -3.14159265F;

		bodyModel[218].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[218].setRotationPoint(16.5F, -3F, 7F);
		bodyModel[218].rotateAngleY = -3.14159265F;

		bodyModel[219].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[219].setRotationPoint(16.5F, -8F, 7F);
		bodyModel[219].rotateAngleY = -3.14159265F;

		bodyModel[220].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[220].setRotationPoint(16.5F, -3F, -7F);
		bodyModel[220].rotateAngleY = -3.14159265F;

		bodyModel[221].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[221].setRotationPoint(16.5F, -8F, -7F);
		bodyModel[221].rotateAngleY = -3.14159265F;

		bodyModel[222].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[222].setRotationPoint(15F, -1F, 5F);

		bodyModel[223].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[223].setRotationPoint(15F, -1F, -9F);

		bodyModel[224].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[224].setRotationPoint(16.5F, -3F, 7F);
		bodyModel[224].rotateAngleY = -3.14159265F;

		bodyModel[225].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[225].setRotationPoint(16.5F, -3F, 7F);
		bodyModel[225].rotateAngleY = -3.14159265F;

		bodyModel[226].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[226].setRotationPoint(16.5F, -3F, -7F);
		bodyModel[226].rotateAngleY = -3.14159265F;

		bodyModel[227].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[227].setRotationPoint(16.5F, -3F, -7F);
		bodyModel[227].rotateAngleY = -3.14159265F;

		bodyModel[228].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[228].setRotationPoint(16.5F, -5F, 7F);
		bodyModel[228].rotateAngleY = -3.14159265F;

		bodyModel[229].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[229].setRotationPoint(16.5F, -5F, 7F);
		bodyModel[229].rotateAngleY = -3.14159265F;

		bodyModel[230].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[230].setRotationPoint(16.5F, -5F, -7F);
		bodyModel[230].rotateAngleY = -3.14159265F;

		bodyModel[231].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[231].setRotationPoint(16.5F, -5F, -7F);
		bodyModel[231].rotateAngleY = -3.14159265F;

		bodyModel[232].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[232].setRotationPoint(6.5F, -3F, 7F);
		bodyModel[232].rotateAngleY = -3.14159265F;

		bodyModel[233].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[233].setRotationPoint(6.5F, -8F, 7F);
		bodyModel[233].rotateAngleY = -3.14159265F;

		bodyModel[234].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[234].setRotationPoint(6.5F, -3F, -7F);
		bodyModel[234].rotateAngleY = -3.14159265F;

		bodyModel[235].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[235].setRotationPoint(6.5F, -8F, -7F);
		bodyModel[235].rotateAngleY = -3.14159265F;

		bodyModel[236].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[236].setRotationPoint(5F, -1F, 5F);

		bodyModel[237].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[237].setRotationPoint(5F, -1F, -9F);

		bodyModel[238].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[238].setRotationPoint(6.5F, -3F, 7F);
		bodyModel[238].rotateAngleY = -3.14159265F;

		bodyModel[239].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[239].setRotationPoint(6.5F, -3F, 7F);
		bodyModel[239].rotateAngleY = -3.14159265F;

		bodyModel[240].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[240].setRotationPoint(6.5F, -3F, -7F);
		bodyModel[240].rotateAngleY = -3.14159265F;

		bodyModel[241].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[241].setRotationPoint(6.5F, -3F, -7F);
		bodyModel[241].rotateAngleY = -3.14159265F;

		bodyModel[242].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[242].setRotationPoint(6.5F, -5F, 7F);
		bodyModel[242].rotateAngleY = -3.14159265F;

		bodyModel[243].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[243].setRotationPoint(6.5F, -5F, 7F);
		bodyModel[243].rotateAngleY = -3.14159265F;

		bodyModel[244].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[244].setRotationPoint(6.5F, -5F, -7F);
		bodyModel[244].rotateAngleY = -3.14159265F;

		bodyModel[245].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[245].setRotationPoint(6.5F, -5F, -7F);
		bodyModel[245].rotateAngleY = -3.14159265F;

		bodyModel[246].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[246].setRotationPoint(-3.5F, -3F, 7F);
		bodyModel[246].rotateAngleY = -3.14159265F;

		bodyModel[247].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[247].setRotationPoint(-3.5F, -8F, 7F);
		bodyModel[247].rotateAngleY = -3.14159265F;

		bodyModel[248].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[248].setRotationPoint(-3.5F, -3F, -7F);
		bodyModel[248].rotateAngleY = -3.14159265F;

		bodyModel[249].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[249].setRotationPoint(-3.5F, -8F, -7F);
		bodyModel[249].rotateAngleY = -3.14159265F;

		bodyModel[250].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[250].setRotationPoint(-5F, -1F, 5F);

		bodyModel[251].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[251].setRotationPoint(-5F, -1F, -9F);

		bodyModel[252].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[252].setRotationPoint(-3.5F, -3F, 7F);
		bodyModel[252].rotateAngleY = -3.14159265F;

		bodyModel[253].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[253].setRotationPoint(-3.5F, -3F, 7F);
		bodyModel[253].rotateAngleY = -3.14159265F;

		bodyModel[254].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[254].setRotationPoint(-3.5F, -3F, -7F);
		bodyModel[254].rotateAngleY = -3.14159265F;

		bodyModel[255].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[255].setRotationPoint(-3.5F, -3F, -7F);
		bodyModel[255].rotateAngleY = -3.14159265F;

		bodyModel[256].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[256].setRotationPoint(-3.5F, -5F, 7F);
		bodyModel[256].rotateAngleY = -3.14159265F;

		bodyModel[257].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[257].setRotationPoint(-3.5F, -5F, 7F);
		bodyModel[257].rotateAngleY = -3.14159265F;

		bodyModel[258].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[258].setRotationPoint(-3.5F, -5F, -7F);
		bodyModel[258].rotateAngleY = -3.14159265F;

		bodyModel[259].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[259].setRotationPoint(-3.5F, -5F, -7F);
		bodyModel[259].rotateAngleY = -3.14159265F;

		bodyModel[260].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[260].setRotationPoint(-13.5F, -3F, 7F);
		bodyModel[260].rotateAngleY = -3.14159265F;

		bodyModel[261].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[261].setRotationPoint(-13.5F, -8F, 7F);
		bodyModel[261].rotateAngleY = -3.14159265F;

		bodyModel[262].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[262].setRotationPoint(-13.5F, -3F, -7F);
		bodyModel[262].rotateAngleY = -3.14159265F;

		bodyModel[263].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[263].setRotationPoint(-13.5F, -8F, -7F);
		bodyModel[263].rotateAngleY = -3.14159265F;

		bodyModel[264].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[264].setRotationPoint(-15F, -1F, 5F);

		bodyModel[265].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[265].setRotationPoint(-15F, -1F, -9F);

		bodyModel[266].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[266].setRotationPoint(-13.5F, -3F, 7F);
		bodyModel[266].rotateAngleY = -3.14159265F;

		bodyModel[267].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[267].setRotationPoint(-13.5F, -3F, 7F);
		bodyModel[267].rotateAngleY = -3.14159265F;

		bodyModel[268].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[268].setRotationPoint(-13.5F, -3F, -7F);
		bodyModel[268].rotateAngleY = -3.14159265F;

		bodyModel[269].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[269].setRotationPoint(-13.5F, -3F, -7F);
		bodyModel[269].rotateAngleY = -3.14159265F;

		bodyModel[270].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[270].setRotationPoint(-13.5F, -5F, 7F);
		bodyModel[270].rotateAngleY = -3.14159265F;

		bodyModel[271].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[271].setRotationPoint(-13.5F, -5F, 7F);
		bodyModel[271].rotateAngleY = -3.14159265F;

		bodyModel[272].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[272].setRotationPoint(-13.5F, -5F, -7F);
		bodyModel[272].rotateAngleY = -3.14159265F;

		bodyModel[273].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[273].setRotationPoint(-13.5F, -5F, -7F);
		bodyModel[273].rotateAngleY = -3.14159265F;

		bodyModel[274].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[274].setRotationPoint(-23.5F, -3F, 7F);
		bodyModel[274].rotateAngleY = -3.14159265F;

		bodyModel[275].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[275].setRotationPoint(-23.5F, -8F, 7F);
		bodyModel[275].rotateAngleY = -3.14159265F;

		bodyModel[276].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part test
		bodyModel[276].setRotationPoint(-23.5F, -3F, -7F);
		bodyModel[276].rotateAngleY = -3.14159265F;

		bodyModel[277].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[277].setRotationPoint(-23.5F, -8F, -7F);
		bodyModel[277].rotateAngleY = -3.14159265F;

		bodyModel[278].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[278].setRotationPoint(-25F, -1F, 5F);

		bodyModel[279].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[279].setRotationPoint(-25F, -1F, -9F);

		bodyModel[280].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[280].setRotationPoint(-23.5F, -3F, 7F);
		bodyModel[280].rotateAngleY = -3.14159265F;

		bodyModel[281].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[281].setRotationPoint(-23.5F, -3F, 7F);
		bodyModel[281].rotateAngleY = -3.14159265F;

		bodyModel[282].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[282].setRotationPoint(-23.5F, -3F, -7F);
		bodyModel[282].rotateAngleY = -3.14159265F;

		bodyModel[283].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[283].setRotationPoint(-23.5F, -3F, -7F);
		bodyModel[283].rotateAngleY = -3.14159265F;

		bodyModel[284].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[284].setRotationPoint(-23.5F, -5F, 7F);
		bodyModel[284].rotateAngleY = -3.14159265F;

		bodyModel[285].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[285].setRotationPoint(-23.5F, -5F, 7F);
		bodyModel[285].rotateAngleY = -3.14159265F;

		bodyModel[286].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull test
		bodyModel[286].setRotationPoint(-23.5F, -5F, -7F);
		bodyModel[286].rotateAngleY = -3.14159265F;

		bodyModel[287].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull test
		bodyModel[287].setRotationPoint(-23.5F, -5F, -7F);
		bodyModel[287].rotateAngleY = -3.14159265F;

		bodyModel[288].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[288].setRotationPoint(-33.5F, -3F, -7F);
		bodyModel[288].rotateAngleY = -3.14159265F;

		bodyModel[289].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[289].setRotationPoint(-33.5F, -8F, -7F);
		bodyModel[289].rotateAngleY = -3.14159265F;

		bodyModel[290].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[290].setRotationPoint(-35F, -1F, -9F);

		bodyModel[291].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[291].setRotationPoint(-33.5F, -3F, -7F);
		bodyModel[291].rotateAngleY = -3.14159265F;

		bodyModel[292].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[292].setRotationPoint(-33.5F, -3F, -7F);
		bodyModel[292].rotateAngleY = -3.14159265F;

		bodyModel[293].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[293].setRotationPoint(-33.5F, -5F, -7F);
		bodyModel[293].rotateAngleY = -3.14159265F;

		bodyModel[294].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[294].setRotationPoint(-33.5F, -5F, -7F);
		bodyModel[294].rotateAngleY = -3.14159265F;

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[295].setRotationPoint(25.5F, -16.5F, -0.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[296].setRotationPoint(15.5F, -16.5F, -0.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[297].setRotationPoint(5.5F, -16.5F, -0.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[298].setRotationPoint(-4.5F, -16.5F, -0.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[299].setRotationPoint(-14.5F, -16.5F, -0.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[300].setRotationPoint(-24.5F, -16.5F, -0.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[301].setRotationPoint(-34.5F, -16.5F, -0.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 70, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[302].setRotationPoint(-38.5F, -10F, -9.9F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 70, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[303].setRotationPoint(-38.5F, -10F, 9.9F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[304].setRotationPoint(-57F, 6F, 10.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[305].setRotationPoint(-57F, 6F, -10.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[306].setRotationPoint(-57.5F, 5F, 9F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[307].setRotationPoint(57F, 5F, 9F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 475
		bodyModel[308].setRotationPoint(-57.5F, 5F, -10F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 476
		bodyModel[309].setRotationPoint(57F, 5F, -10F);

		bodyModel[310].addBox(0F, 0F, 0F, 49, 1, 0, 0F); // Box 38
		bodyModel[310].setRotationPoint(-23.5F, -13.5F, -11.01F);

		bodyModel[311].addBox(0F, 0F, 0F, 96, 1, 0, 0F); // Box 38
		bodyModel[311].setRotationPoint(-49F, -2.5F, -11.01F);

		bodyModel[312].addBox(0F, 0F, 0F, 49, 1, 0, 0F); // Box 451
		bodyModel[312].setRotationPoint(-23.5F, -13.5F, 11.01F);

		bodyModel[313].addBox(0F, 0F, 0F, 96, 1, 0, 0F); // Box 452
		bodyModel[313].setRotationPoint(-49F, -2.5F, 11.01F);

		bodyModel[314].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[314].setRotationPoint(-54.5F, -19F, -7F);
		bodyModel[314].rotateAngleX = 0.2443461F;

		bodyModel[315].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 487
		bodyModel[315].setRotationPoint(48.5F, -19.5F, 5F);
		bodyModel[315].rotateAngleX = -0.2443461F;

		bodyModel[316].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.09F, -0.75F, 0F, 0.09F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F); // Box 128
		bodyModel[316].setRotationPoint(53F, -17.25F, 10F);
		bodyModel[316].rotateAngleX = 0.41887902F;

		bodyModel[317].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0.09F, -0.75F, 0F, 0.09F, -0.75F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[317].setRotationPoint(53F, -17.65F, -10.92F);
		bodyModel[317].rotateAngleX = -0.41887902F;

		bodyModel[318].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 283
		bodyModel[318].setRotationPoint(-3.5F, 3F, 5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[319].setRotationPoint(-20.5F, 2.75F, 8F);
		bodyModel[319].rotateAngleX = -0.78539816F;

		bodyModel[320].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[320].setRotationPoint(-20.51F, 3F, 7.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[321].setRotationPoint(-15.49F, 3F, 7.5F);

		bodyModel[322].addBox(0F, 0F, 0F, 7, 4, 5, 0F); // Box 494
		bodyModel[322].setRotationPoint(-9.5F, 3F, -10F);

		bodyModel[323].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 128
		bodyModel[323].setRotationPoint(-50.5F, -15F, -10F);

		bodyModel[324].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[324].setRotationPoint(-56.5F, -15F, -10F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 128
		bodyModel[325].setRotationPoint(-55.5F, -15F, -4F);

		bodyModel[326].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 128
		bodyModel[326].setRotationPoint(-49.5F, -15F, 5F);

		bodyModel[327].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // Box 128
		bodyModel[327].setRotationPoint(-56.5F, -15F, 4F);

		bodyModel[328].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 38
		bodyModel[328].setRotationPoint(45.5F, -15F, -6F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 128
		bodyModel[329].setRotationPoint(46.5F, -15F, 1F);

		bodyModel[330].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // Box 128
		bodyModel[330].setRotationPoint(49.5F, -15F, -10F);

		bodyModel[331].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 38
		bodyModel[331].setRotationPoint(42.5F, -15F, -6F);

		bodyModel[332].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 128
		bodyModel[332].setRotationPoint(-43.5F, -15F, 5F);

		bodyModel[333].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 128
		bodyModel[333].setRotationPoint(-46.5F, -15F, 5F);

		bodyModel[334].addBox(0F, 0F, 0F, 115, 1, 14, 0F); // Box 128
		bodyModel[334].setRotationPoint(-57.5F, -18F, -7F);

		bodyModel[335].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 38
		bodyModel[335].setRotationPoint(26.5F, -5F, -10F);

		bodyModel[336].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 38
		bodyModel[336].setRotationPoint(-34.5F, -5F, 4F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[337].setRotationPoint(-38.5F, -7F, -1F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 18, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[338].setRotationPoint(-56.5F, -18F, -10F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 18, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185
		bodyModel[339].setRotationPoint(-56.5F, -18F, 7F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 18, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[340].setRotationPoint(-56.5F, -17F, -7F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 18, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[341].setRotationPoint(-56.5F, -16.25F, -10F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 70, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[342].setRotationPoint(-38.5F, -17F, -8.25F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 70, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[343].setRotationPoint(-38.5F, -16F, -10F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 70, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[344].setRotationPoint(-38.5F, -18F, -8.25F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 70, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[345].setRotationPoint(-38.5F, -17F, 5.25F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 70, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[346].setRotationPoint(-38.5F, -16F, 8F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 70, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[347].setRotationPoint(-38.5F, -18F, 7.25F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 70, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[348].setRotationPoint(-38.5F, -17F, -2F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 38
		bodyModel[349].setRotationPoint(-54.36F, -2F, -10.28F);
		bodyModel[349].rotateAngleY = 0.78539816F;

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 38
		bodyModel[350].setRotationPoint(-54.53F, -1F, -9.75F);
		bodyModel[350].rotateAngleY = 0.78539816F;

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[351].setRotationPoint(-53.83F, 0.5F, -9.75F);
		bodyModel[351].rotateAngleY = 0.78539816F;

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[352].setRotationPoint(43.5F, -6F, -5F);

		bodyModel[353].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[353].setRotationPoint(44.5F, -5F, -4F);
		bodyModel[353].rotateAngleY = -0.78539816F;

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[354].setRotationPoint(44.5F, -6F, 0F);

		bodyModel[355].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[355].setRotationPoint(45F, -5F, 1F);
		bodyModel[355].rotateAngleY = -0.78539816F;

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[356].setRotationPoint(-49.5F, -6F, 3F);

		bodyModel[357].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[357].setRotationPoint(-48.5F, -5F, 4F);
		bodyModel[357].rotateAngleY = -0.78539816F;

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[358].setRotationPoint(-49.5F, -6F, -10F);

		bodyModel[359].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[359].setRotationPoint(-48.5F, -5F, -9F);
		bodyModel[359].rotateAngleY = -0.78539816F;

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[360].setRotationPoint(-49.5F, -6F, -2F);

		bodyModel[361].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[361].setRotationPoint(-49F, -5F, -1F);
		bodyModel[361].rotateAngleY = -0.78539816F;

		bodyModel[362].addShapeBox(0F, 0F, 0F, 6, 14, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[362].setRotationPoint(-46.5F, -14F, 5.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 340
		bodyModel[363].setRotationPoint(-42.5F, -15F, -10F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 402
		bodyModel[364].setRotationPoint(32.5F, -15F, 7F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 4, 2, 13, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[365].setRotationPoint(33F, -3F, -4F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[366].setRotationPoint(33F, -6.5F, -4F);

		bodyModel[367].addBox(0F, 0F, 0F, 3, 2, 13, 0F); // Boc 42 cull
		bodyModel[367].setRotationPoint(33F, -1F, -4F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F); // Right seat part cull
		bodyModel[368].setRotationPoint(33F, -4.5F, -5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F); // Right seat part cull
		bodyModel[369].setRotationPoint(33F, -4.5F, 9F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[370].setRotationPoint(-44F, -3F, -9F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F); // Right seat part
		bodyModel[371].setRotationPoint(-41F, -6.5F, -9F);

		bodyModel[372].addBox(0F, 0F, 0F, 3, 2, 13, 0F); // Boc 42
		bodyModel[372].setRotationPoint(-43F, -1F, -9F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F); // Right seat part cull
		bodyModel[373].setRotationPoint(-43F, -5F, -10F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F); // Right seat part cull
		bodyModel[374].setRotationPoint(-43F, -5F, 4F);

		bodyModel[375].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 38
		bodyModel[375].setRotationPoint(38.5F, -5F, 8F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[376].setRotationPoint(39F, -3F, 6F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[377].setRotationPoint(39F, -2F, 6F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[378].setRotationPoint(39F, -5F, 6F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 1.5F, -0.75F, 0F, 1.5F, -0.75F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2.05F, -0.75F, 0F, -2.05F, -0.75F, 0F, -2.13F, 0F, 0F, -2.13F, 0F); // Box 205
		bodyModel[379].setRotationPoint(53F, -18.55F, -9.75F);
		bodyModel[379].rotateAngleX = -1.04719755F;

		bodyModel[380].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.75F, 0F, 1.5F, -0.75F, 0F, -2.13F, 0F, 0F, -2.13F, 0F, 0F, -2.05F, -0.75F, 0F, -2.05F, -0.75F); // Box 205
		bodyModel[380].setRotationPoint(53F, -17.69F, 9.24F);
		bodyModel[380].rotateAngleX = 1.04719755F;

		bodyModel[381].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 487
		bodyModel[381].setRotationPoint(-54.5F, -19.5F, 5F);
		bodyModel[381].rotateAngleX = -0.2443461F;

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 128
		bodyModel[382].setRotationPoint(-59.5F, -19F, -10F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[383].setRotationPoint(-59.5F, -19.5F, -7F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[384].setRotationPoint(-59.5F, -19F, 7F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.7F, 0F, 0F, 0.7F, 0F); // Box 253
		bodyModel[385].setRotationPoint(-59.5F, -19.5F, 5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 128
		bodyModel[386].setRotationPoint(59F, -19F, -10F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[387].setRotationPoint(59F, -19.5F, -7F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[388].setRotationPoint(59F, -19F, 7F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.7F, 0F, 0F, 0.7F, 0F); // Box 253
		bodyModel[389].setRotationPoint(59F, -19.5F, 5F);

		bodyModel[390].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 38
		bodyModel[390].setRotationPoint(-49F, -0.5F, -11.01F);

		bodyModel[391].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 432
		bodyModel[391].setRotationPoint(-49F, -0.5F, 11.01F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[392].setRotationPoint(-57.5F, 4F, 1F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[393].setRotationPoint(-57.5F, 4F, -10.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[394].setRotationPoint(57F, 4F, 1F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[395].setRotationPoint(57F, 4F, -10.5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[396].setRotationPoint(29.5F, 4F, 10.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[397].setRotationPoint(29.5F, 4F, -11F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 2
		bodyModel[398].setRotationPoint(-31.5F, 4F, 10.5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 37
		bodyModel[399].setRotationPoint(-31.5F, 4F, -11F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[400].setRotationPoint(-30.5F, 4F, 10.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[401].setRotationPoint(-30.5F, 4F, -11F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[402].setRotationPoint(29.5F, 4F, 10.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[403].setRotationPoint(29.5F, 4F, -11F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F); // Box 41
		bodyModel[404].setRotationPoint(49.5F, 3F, -11F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 473
		bodyModel[405].setRotationPoint(49.5F, 3F, 10F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[406].setRotationPoint(-50.5F, 3F, -11F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[407].setRotationPoint(-50.5F, 3F, 10F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[408].setRotationPoint(-51.5F, 4F, 10.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[409].setRotationPoint(-51.5F, 4F, -11F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[410].setRotationPoint(50.5F, 4F, 10.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[411].setRotationPoint(50.5F, 4F, -11F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[412].setRotationPoint(23.5F, 4F, 0F);
		bodyModel[412].rotateAngleX = -0.78539816F;

		bodyModel[413].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[413].setRotationPoint(23.49F, 4F, -0.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[414].setRotationPoint(29.51F, 4F, -0.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[415].setRotationPoint(-23.5F, 2.75F, -8.5F);
		bodyModel[415].rotateAngleX = -0.78539816F;

		bodyModel[416].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[416].setRotationPoint(-23.51F, 3F, -9F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[417].setRotationPoint(-18.49F, 3F, -9F);

		bodyModel[418].addBox(0F, 0F, 0F, 3, 5, 5, 0F); // Box 494
		bodyModel[418].setRotationPoint(-0.5F, 3F, -10F);

		bodyModel[419].addBox(0F, 0F, 0F, 7, 1, 4, 0F); // Box 494
		bodyModel[419].setRotationPoint(-9.5F, 7F, -9F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[420].setRotationPoint(-9.5F, 7F, -10F);

		bodyModel[421].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 494
		bodyModel[421].setRotationPoint(5.5F, 3F, -10F);

		bodyModel[422].addBox(0F, 0F, 0F, 7, 4, 5, 0F); // Box 494
		bodyModel[422].setRotationPoint(15.5F, 3F, -10F);

		bodyModel[423].addBox(0F, 0F, 0F, 7, 1, 4, 0F); // Box 494
		bodyModel[423].setRotationPoint(15.5F, 7F, -9F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[424].setRotationPoint(15.5F, 7F, -10F);

		bodyModel[425].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 283
		bodyModel[425].setRotationPoint(7.5F, 3F, 5F);

		bodyModel[426].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 283
		bodyModel[426].setRotationPoint(-22.5F, 3F, 7F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[427].setRotationPoint(49.25F, 3F, 10.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[428].setRotationPoint(50F, 4F, 10.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[429].setRotationPoint(31.75F, 3F, 10.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[430].setRotationPoint(30F, 4F, 10.5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[431].setRotationPoint(49.25F, 3F, -11F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[432].setRotationPoint(50F, 4F, -11F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[433].setRotationPoint(31.75F, 3F, -11F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[434].setRotationPoint(30F, 4F, -11F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[435].setRotationPoint(-50.25F, 3F, 10.5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[436].setRotationPoint(-52F, 4F, 10.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[437].setRotationPoint(-32.75F, 3F, 10.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[438].setRotationPoint(-32F, 4F, 10.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[439].setRotationPoint(-50.25F, 3F, -11F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[440].setRotationPoint(-52F, 4F, -11F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[441].setRotationPoint(-32.75F, 3F, -11F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[442].setRotationPoint(-32F, 4F, -11F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[443].setRotationPoint(-57.5F, -1.5F, -12F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[444].setRotationPoint(-57.5F, 5F, -10.75F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[445].setRotationPoint(-57.5F, -1.5F, 11F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[446].setRotationPoint(-57.5F, 5F, 10.75F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[447].setRotationPoint(59F, -15F, -5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[448].setRotationPoint(-59.5F, -15F, -5F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[449].setRotationPoint(-57.5F, 4F, 8F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[450].setRotationPoint(57F, 4F, 8F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 475
		bodyModel[451].setRotationPoint(-57.5F, 4F, -10F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 476
		bodyModel[452].setRotationPoint(57F, 4F, -10F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[453].setRotationPoint(-59.5F, -20F, -5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[454].setRotationPoint(-59.5F, -20F, -3F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[455].setRotationPoint(-59.5F, -19F, -1F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[456].setRotationPoint(-59.5F, -18.75F, -5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 253
		bodyModel[457].setRotationPoint(-59.5F, -20F, 3F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[458].setRotationPoint(-59.5F, -18.75F, 4F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[459].setRotationPoint(-59.5F, -16F, -4F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[460].setRotationPoint(-59.5F, -16F, 1F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[461].setRotationPoint(-59.5F, -16F, -5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[462].setRotationPoint(-59.5F, -16F, 0F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[463].setRotationPoint(59F, -19.5F, -7F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[464].setRotationPoint(59F, -20F, -3F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[465].setRotationPoint(59F, -19F, -1F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[466].setRotationPoint(59F, -18.75F, -5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 253
		bodyModel[467].setRotationPoint(59F, -20F, 3F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[468].setRotationPoint(59F, -18.75F, 4F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[469].setRotationPoint(59F, -16F, -4F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[470].setRotationPoint(59F, -16F, 1F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[471].setRotationPoint(59F, -16F, -5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[472].setRotationPoint(59F, -16F, 0F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[473].setRotationPoint(59F, -19F, -10F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[474].setRotationPoint(59F, -19F, 7F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[475].setRotationPoint(-59.5F, -19F, -10F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[476].setRotationPoint(-59.5F, -19F, 7F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[477].setRotationPoint(-59.5F, -19.5F, -7F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 253
		bodyModel[478].setRotationPoint(-59.5F, -19.5F, 5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 253
		bodyModel[479].setRotationPoint(59F, -19.5F, 5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[480].setRotationPoint(59F, -20F, -5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.09F, -0.75F, 0F, 0.09F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F); // Box 128
		bodyModel[481].setRotationPoint(-52F, -17.25F, 10F);
		bodyModel[481].rotateAngleX = 0.41887902F;

		bodyModel[482].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0.09F, -0.75F, 0F, 0.09F, -0.75F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[482].setRotationPoint(-52F, -17.65F, -10.92F);
		bodyModel[482].rotateAngleX = -0.41887902F;

		bodyModel[483].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 1.5F, -0.75F, 0F, 1.5F, -0.75F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2.05F, -0.75F, 0F, -2.05F, -0.75F, 0F, -2.13F, 0F, 0F, -2.13F, 0F); // Box 205
		bodyModel[483].setRotationPoint(-52F, -18.55F, -9.75F);
		bodyModel[483].rotateAngleX = -1.04719755F;

		bodyModel[484].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.75F, 0F, 1.5F, -0.75F, 0F, -2.13F, 0F, 0F, -2.13F, 0F, 0F, -2.05F, -0.75F, 0F, -2.05F, -0.75F); // Box 205
		bodyModel[484].setRotationPoint(-52F, -17.69F, 9.24F);
		bodyModel[484].rotateAngleX = 1.04719755F;

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.35F, 0.25F, 0F, -0.35F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.65F, 0.25F, 0F, -1.65F, 0.25F); // Box 190
		bodyModel[485].setRotationPoint(47.5F, -18F, -10.56F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.35F, 0.25F, 0F, -0.35F, 0.25F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, 0F, -1.65F, 0.25F, 0F, -1.65F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[486].setRotationPoint(47.5F, -18F, 9.56F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.35F, 0.25F, 0F, -0.35F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.65F, 0.25F, 0F, -1.65F, 0.25F); // Box 190
		bodyModel[487].setRotationPoint(-52.5F, -18F, -10.56F);

		bodyModel[488].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 494
		bodyModel[488].setRotationPoint(-15.5F, 3F, -10F);

		bodyModel[489].addBox(0F, 0F, 0F, 16, 2, 6, 0F); // Box 2
		bodyModel[489].setRotationPoint(10.5F, 4F, -3F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 16, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[490].setRotationPoint(10.5F, 6F, -3F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[491].setRotationPoint(20.5F, 2.75F, -8.5F);
		bodyModel[491].rotateAngleX = -0.78539816F;

		bodyModel[492].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[492].setRotationPoint(20.49F, 3F, -9F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[493].setRotationPoint(25.51F, 3F, -9F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[494].setRotationPoint(13.5F, 2.75F, -8.5F);
		bodyModel[494].rotateAngleX = -0.78539816F;

		bodyModel[495].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[495].setRotationPoint(13.49F, 3F, -9F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[496].setRotationPoint(18.51F, 3F, -9F);

		bodyModel[497].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 283
		bodyModel[497].setRotationPoint(11.5F, 3F, 8F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[498].setRotationPoint(17.5F, 2.75F, 8F);
		bodyModel[498].rotateAngleX = -0.78539816F;

		bodyModel[499].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[499].setRotationPoint(17.49F, 3F, 7.5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 257, 191, textureX, textureY); // Box 41
		bodyModel[501] = new ModelRendererTurbo(this, 278, 190, textureX, textureY); // Box 283
		bodyModel[502] = new ModelRendererTurbo(this, 324, 175, textureX, textureY); // Box 41
		bodyModel[503] = new ModelRendererTurbo(this, 341, 176, textureX, textureY); // Box 41
		bodyModel[504] = new ModelRendererTurbo(this, 321, 176, textureX, textureY); // Box 41
		bodyModel[505] = new ModelRendererTurbo(this, 295, 186, textureX, textureY); // Box 514
		bodyModel[506] = new ModelRendererTurbo(this, 296, 196, textureX, textureY); // Box 515
		bodyModel[507] = new ModelRendererTurbo(this, 299, 202, textureX, textureY); // Box 516
		bodyModel[508] = new ModelRendererTurbo(this, 322, 186, textureX, textureY); // Box 513
		bodyModel[509] = new ModelRendererTurbo(this, 296, 174, textureX, textureY); // Box 518
		bodyModel[510] = new ModelRendererTurbo(this, 422, 175, textureX, textureY); // Box 41
		bodyModel[511] = new ModelRendererTurbo(this, 419, 176, textureX, textureY); // Box 41
		bodyModel[512] = new ModelRendererTurbo(this, 443, 176, textureX, textureY); // Box 41
		bodyModel[513] = new ModelRendererTurbo(this, 422, 180, textureX, textureY); // Box 41
		bodyModel[514] = new ModelRendererTurbo(this, 419, 181, textureX, textureY); // Box 41
		bodyModel[515] = new ModelRendererTurbo(this, 443, 181, textureX, textureY); // Box 41
		bodyModel[516] = new ModelRendererTurbo(this, 357, 172, textureX, textureY); // Box 38
		bodyModel[517] = new ModelRendererTurbo(this, 347, 171, textureX, textureY); // Box 38
		bodyModel[518] = new ModelRendererTurbo(this, 352, 171, textureX, textureY); // Box 38
		bodyModel[519] = new ModelRendererTurbo(this, 366, 172, textureX, textureY); // Box 38
		bodyModel[520] = new ModelRendererTurbo(this, 358, 176, textureX, textureY); // Box 41
		bodyModel[521] = new ModelRendererTurbo(this, 345, 176, textureX, textureY); // Box 41
		bodyModel[522] = new ModelRendererTurbo(this, 368, 183, textureX, textureY); // Box 41
		bodyModel[523] = new ModelRendererTurbo(this, 368, 176, textureX, textureY); // Box 41
		bodyModel[524] = new ModelRendererTurbo(this, 345, 183, textureX, textureY); // Box 41
		bodyModel[525] = new ModelRendererTurbo(this, 345, 176, textureX, textureY); // Box 41
		bodyModel[526] = new ModelRendererTurbo(this, 371, 174, textureX, textureY); // Box 494
		bodyModel[527] = new ModelRendererTurbo(this, 88, 145, textureX, textureY); // Box 128
		bodyModel[528] = new ModelRendererTurbo(this, 88, 154, textureX, textureY); // Box 205
		bodyModel[529] = new ModelRendererTurbo(this, 352, 205, textureX, textureY); // Box 2
		bodyModel[530] = new ModelRendererTurbo(this, 348, 188, textureX, textureY); // Box 283
		bodyModel[531] = new ModelRendererTurbo(this, 348, 197, textureX, textureY); // Box 283
		bodyModel[532] = new ModelRendererTurbo(this, 393, 198, textureX, textureY); // Box 513
		bodyModel[533] = new ModelRendererTurbo(this, 414, 198, textureX, textureY); // Box 513
		bodyModel[534] = new ModelRendererTurbo(this, 324, 221, textureX, textureY); // Box 283
		bodyModel[535] = new ModelRendererTurbo(this, 414, 187, textureX, textureY); // Box 544
		bodyModel[536] = new ModelRendererTurbo(this, 352, 227, textureX, textureY); // Box 545
		bodyModel[537] = new ModelRendererTurbo(this, 348, 210, textureX, textureY); // Box 546
		bodyModel[538] = new ModelRendererTurbo(this, 348, 219, textureX, textureY); // Box 547
		bodyModel[539] = new ModelRendererTurbo(this, 325, 210, textureX, textureY); // Box 548
		bodyModel[540] = new ModelRendererTurbo(this, 218, 235, textureX, textureY); // Box 128
		bodyModel[541] = new ModelRendererTurbo(this, 219, 231, textureX, textureY); // Box 128
		bodyModel[542] = new ModelRendererTurbo(this, 74, 200, textureX, textureY); // Box 193
		bodyModel[543] = new ModelRendererTurbo(this, 72, 205, textureX, textureY); // Box 194
		bodyModel[544] = new ModelRendererTurbo(this, 216, 208, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[545] = new ModelRendererTurbo(this, 241, 240, textureX, textureY); // Box 38
		bodyModel[546] = new ModelRendererTurbo(this, 241, 250, textureX, textureY); // Box 275
		bodyModel[547] = new ModelRendererTurbo(this, 296, 302, textureX, textureY); // Box 128
		bodyModel[548] = new ModelRendererTurbo(this, 11, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[549] = new ModelRendererTurbo(this, 272, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[550] = new ModelRendererTurbo(this, 263, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[551] = new ModelRendererTurbo(this, 254, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[552] = new ModelRendererTurbo(this, 245, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[553] = new ModelRendererTurbo(this, 236, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[554] = new ModelRendererTurbo(this, 227, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[555] = new ModelRendererTurbo(this, 218, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[556] = new ModelRendererTurbo(this, 238, 256, textureX, textureY); // Box 128
		bodyModel[557] = new ModelRendererTurbo(this, 243, 263, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[558] = new ModelRendererTurbo(this, 243, 254, textureX, textureY,"lamp"); // Box 566 glow
		bodyModel[559] = new ModelRendererTurbo(this, 292, 271, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[560] = new ModelRendererTurbo(this, 82, 258, textureX, textureY); // Box 276
		bodyModel[561] = new ModelRendererTurbo(this, 195, 379, textureX, textureY); // Box 38
		bodyModel[562] = new ModelRendererTurbo(this, 196, 375, textureX, textureY); // Box 38
		bodyModel[563] = new ModelRendererTurbo(this, 148, 367, textureX, textureY); // Box 38
		bodyModel[564] = new ModelRendererTurbo(this, 161, 387, textureX, textureY); // Box 38
		bodyModel[565] = new ModelRendererTurbo(this, 148, 380, textureX, textureY); // Box 38
		bodyModel[566] = new ModelRendererTurbo(this, 153, 375, textureX, textureY); // Box 38
		bodyModel[567] = new ModelRendererTurbo(this, 161, 384, textureX, textureY); // Box 38
		bodyModel[568] = new ModelRendererTurbo(this, 188, 384, textureX, textureY); // Box 38
		bodyModel[569] = new ModelRendererTurbo(this, 180, 386, textureX, textureY); // Box 38
		bodyModel[570] = new ModelRendererTurbo(this, 180, 382, textureX, textureY); // Box 38
		bodyModel[571] = new ModelRendererTurbo(this, 161, 380, textureX, textureY); // Box 38
		bodyModel[572] = new ModelRendererTurbo(this, 169, 376, textureX, textureY); // Box 38
		bodyModel[573] = new ModelRendererTurbo(this, 163, 374, textureX, textureY); // Box 38
		bodyModel[574] = new ModelRendererTurbo(this, 169, 378, textureX, textureY); // Box 38
		bodyModel[575] = new ModelRendererTurbo(this, 163, 369, textureX, textureY); // Box 38
		bodyModel[576] = new ModelRendererTurbo(this, 169, 380, textureX, textureY); // Box 38
		bodyModel[577] = new ModelRendererTurbo(this, 163, 379, textureX, textureY); // Box 38
		bodyModel[578] = new ModelRendererTurbo(this, 117, 367, textureX, textureY); // Box 38
		bodyModel[579] = new ModelRendererTurbo(this, 100, 359, textureX, textureY); // Box 38
		bodyModel[580] = new ModelRendererTurbo(this, 117, 384, textureX, textureY); // Box 38 magazine part
		bodyModel[581] = new ModelRendererTurbo(this, 101, 377, textureX, textureY); // Box 38 magazine part 2
		bodyModel[582] = new ModelRendererTurbo(this, 103, 250, textureX, textureY); // Box 275
		bodyModel[583] = new ModelRendererTurbo(this, 103, 239, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[584] = new ModelRendererTurbo(this, 2, 252, textureX, textureY); // Box 128
		bodyModel[585] = new ModelRendererTurbo(this, 1, 322, textureX, textureY); // Box 128
		bodyModel[586] = new ModelRendererTurbo(this, 20, 235, textureX, textureY); // Box 128
		bodyModel[587] = new ModelRendererTurbo(this, 64, 269, textureX, textureY); // Box 128
		bodyModel[588] = new ModelRendererTurbo(this, 7, 239, textureX, textureY); // Box 38
		bodyModel[589] = new ModelRendererTurbo(this, 10, 244, textureX, textureY); // Box 38
		bodyModel[590] = new ModelRendererTurbo(this, 9, 248, textureX, textureY); // Box 38
		bodyModel[591] = new ModelRendererTurbo(this, 51, 233, textureX, textureY); // Box 340
		bodyModel[592] = new ModelRendererTurbo(this, 53, 237, textureX, textureY); // Box 41
		bodyModel[593] = new ModelRendererTurbo(this, 52, 257, textureX, textureY); // Box 340
		bodyModel[594] = new ModelRendererTurbo(this, 53, 261, textureX, textureY); // Box 41
		bodyModel[595] = new ModelRendererTurbo(this, 52, 245, textureX, textureY); // Box 340
		bodyModel[596] = new ModelRendererTurbo(this, 53, 249, textureX, textureY); // Box 41
		bodyModel[597] = new ModelRendererTurbo(this, 76, 290, textureX, textureY); // Box 128
		bodyModel[598] = new ModelRendererTurbo(this, 79, 269, textureX, textureY); // Box 128
		bodyModel[599] = new ModelRendererTurbo(this, 423, 321, textureX, textureY); // Box 128
		bodyModel[600] = new ModelRendererTurbo(this, 421, 324, textureX, textureY); // Box 128
		bodyModel[601] = new ModelRendererTurbo(this, 340, 321, textureX, textureY); // Box 38
		bodyModel[602] = new ModelRendererTurbo(this, 412, 322, textureX, textureY); // Box 38
		bodyModel[603] = new ModelRendererTurbo(this, 84, 272, textureX, textureY); // Box 128
		bodyModel[604] = new ModelRendererTurbo(this, 48, 271, textureX, textureY); // Box 128
		bodyModel[605] = new ModelRendererTurbo(this, 62, 236, textureX, textureY); // Box 340
		bodyModel[606] = new ModelRendererTurbo(this, 64, 240, textureX, textureY); // Box 41
		bodyModel[607] = new ModelRendererTurbo(this, 361, 296, textureX, textureY); // Box 340
		bodyModel[608] = new ModelRendererTurbo(this, 362, 300, textureX, textureY); // Box 41
		bodyModel[609] = new ModelRendererTurbo(this, 336, 287, textureX, textureY); // Box 402
		bodyModel[610] = new ModelRendererTurbo(this, 66, 310, textureX, textureY); // Box 340
		bodyModel[611] = new ModelRendererTurbo(this, 61, 257, textureX, textureY); // Box 38
		bodyModel[612] = new ModelRendererTurbo(this, 58, 248, textureX, textureY); // Box 38
		bodyModel[613] = new ModelRendererTurbo(this, 58, 261, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[614] = new ModelRendererTurbo(this, 64, 254, textureX, textureY); // Box 38
		bodyModel[615] = new ModelRendererTurbo(this, 305, 303, textureX, textureY); // Box 128
		bodyModel[616] = new ModelRendererTurbo(this, 404, 292, textureX, textureY); // Right seat part
		bodyModel[617] = new ModelRendererTurbo(this, 404, 283, textureX, textureY); // Right seat part
		bodyModel[618] = new ModelRendererTurbo(this, 393, 291, textureX, textureY,"cull"); // Boc 42 cull
		bodyModel[619] = new ModelRendererTurbo(this, 393, 302, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[620] = new ModelRendererTurbo(this, 393, 277, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[621] = new ModelRendererTurbo(this, 393, 232, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[622] = new ModelRendererTurbo(this, 404, 247, textureX, textureY); // Right seat part
		bodyModel[623] = new ModelRendererTurbo(this, 404, 238, textureX, textureY); // Right seat part
		bodyModel[624] = new ModelRendererTurbo(this, 393, 246, textureX, textureY,"cull"); // Boc 42 cull
		bodyModel[625] = new ModelRendererTurbo(this, 393, 257, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[626] = new ModelRendererTurbo(this, 420, 299, textureX, textureY); // Right seat part
		bodyModel[627] = new ModelRendererTurbo(this, 423, 293, textureX, textureY); // Right seat part
		bodyModel[628] = new ModelRendererTurbo(this, 419, 306, textureX, textureY); // Boc 42 cull
		bodyModel[629] = new ModelRendererTurbo(this, 438, 299, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[630] = new ModelRendererTurbo(this, 408, 299, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[631] = new ModelRendererTurbo(this, 57, 271, textureX, textureY); // Box 128
		bodyModel[632] = new ModelRendererTurbo(this, 34, 400, textureX, textureY); // Box 128
		bodyModel[633] = new ModelRendererTurbo(this, 352, 284, textureX, textureY); // Right seat part
		bodyModel[634] = new ModelRendererTurbo(this, 354, 288, textureX, textureY); // Right seat part
		bodyModel[635] = new ModelRendererTurbo(this, 352, 296, textureX, textureY); // Right seat part
		bodyModel[636] = new ModelRendererTurbo(this, 38, 285, textureX, textureY); // Right seat part
		bodyModel[637] = new ModelRendererTurbo(this, 40, 289, textureX, textureY); // Right seat part
		bodyModel[638] = new ModelRendererTurbo(this, 38, 297, textureX, textureY); // Right seat part
		bodyModel[639] = new ModelRendererTurbo(this, 319, 164, textureX, textureY); // Box 2
		bodyModel[640] = new ModelRendererTurbo(this, 328, 164, textureX, textureY); // Box 2
		bodyModel[641] = new ModelRendererTurbo(this, 321, 167, textureX, textureY); // Box 2
		bodyModel[642] = new ModelRendererTurbo(this, 330, 167, textureX, textureY); // Box 2
		bodyModel[643] = new ModelRendererTurbo(this, 328, 170, textureX, textureY); // Box 2
		bodyModel[644] = new ModelRendererTurbo(this, 330, 173, textureX, textureY); // Box 2
		bodyModel[645] = new ModelRendererTurbo(this, 339, 166, textureX, textureY); // Box 128
		bodyModel[646] = new ModelRendererTurbo(this, 339, 178, textureX, textureY); // Box 128
		bodyModel[647] = new ModelRendererTurbo(this, 321, 166, textureX, textureY); // Box 128
		bodyModel[648] = new ModelRendererTurbo(this, 325, 178, textureX, textureY); // Box 128
		bodyModel[649] = new ModelRendererTurbo(this, 328, 180, textureX, textureY); // Box 2
		bodyModel[650] = new ModelRendererTurbo(this, 319, 149, textureX, textureY); // Box 628
		bodyModel[651] = new ModelRendererTurbo(this, 331, 149, textureX, textureY); // Box 629
		bodyModel[652] = new ModelRendererTurbo(this, 321, 152, textureX, textureY); // Box 631
		bodyModel[653] = new ModelRendererTurbo(this, 333, 152, textureX, textureY); // Box 632
		bodyModel[654] = new ModelRendererTurbo(this, 319, 156, textureX, textureY); // Box 633
		bodyModel[655] = new ModelRendererTurbo(this, 330, 157, textureX, textureY); // Box 634
		bodyModel[656] = new ModelRendererTurbo(this, 342, 150, textureX, textureY); // Box 635
		bodyModel[657] = new ModelRendererTurbo(this, 339, 157, textureX, textureY); // Box 636
		bodyModel[658] = new ModelRendererTurbo(this, 312, 150, textureX, textureY); // Box 638
		bodyModel[659] = new ModelRendererTurbo(this, 325, 157, textureX, textureY); // Box 639
		bodyModel[660] = new ModelRendererTurbo(this, 328, 160, textureX, textureY); // Box 630
		bodyModel[661] = new ModelRendererTurbo(this, 267, 151, textureX, textureY); // Box 2
		bodyModel[662] = new ModelRendererTurbo(this, 58, 167, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[663] = new ModelRendererTurbo(this, 68, 165, textureX, textureY); // Box 2
		bodyModel[664] = new ModelRendererTurbo(this, 66, 167, textureX, textureY); // Box 2
		bodyModel[665] = new ModelRendererTurbo(this, 58, 165, textureX, textureY); // Box 2
		bodyModel[666] = new ModelRendererTurbo(this, 267, 141, textureX, textureY); // Box 666
		bodyModel[667] = new ModelRendererTurbo(this, 58, 162, textureX, textureY); // Box 667
		bodyModel[668] = new ModelRendererTurbo(this, 68, 158, textureX, textureY); // Box 668
		bodyModel[669] = new ModelRendererTurbo(this, 67, 162, textureX, textureY); // Box 669
		bodyModel[670] = new ModelRendererTurbo(this, 58, 160, textureX, textureY); // Box 670
		bodyModel[671] = new ModelRendererTurbo(this, 31, 270, textureX, textureY); // Box 128
		bodyModel[672] = new ModelRendererTurbo(this, 375, 288, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[673] = new ModelRendererTurbo(this, 36, 235, textureX, textureY,"cull"); // Box 128 cull

		bodyModel[500].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[500].setRotationPoint(22.51F, 3F, 7.5F);

		bodyModel[501].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 283
		bodyModel[501].setRotationPoint(15.5F, 3F, 7F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[502].setRotationPoint(-29.5F, 4F, 0F);
		bodyModel[502].rotateAngleX = -0.78539816F;

		bodyModel[503].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[503].setRotationPoint(-29.51F, 4F, -0.5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[504].setRotationPoint(-23.49F, 4F, -0.5F);

		bodyModel[505].addBox(0F, 0F, 0F, 8, 4, 5, 0F); // Box 514
		bodyModel[505].setRotationPoint(-5.5F, 3F, 5F);

		bodyModel[506].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 515
		bodyModel[506].setRotationPoint(-5.5F, 7F, 5F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 516
		bodyModel[507].setRotationPoint(-5.5F, 7F, 9F);

		bodyModel[508].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 513
		bodyModel[508].setRotationPoint(-14.5F, 3F, 5F);

		bodyModel[509].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 518
		bodyModel[509].setRotationPoint(-14.5F, 3F, -10F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[510].setRotationPoint(-25.5F, 2.75F, -8.5F);
		bodyModel[510].rotateAngleX = -0.78539816F;

		bodyModel[511].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[511].setRotationPoint(-17.49F, 3F, -9F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[512].setRotationPoint(-25.51F, 3F, -9F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[513].setRotationPoint(-25.5F, 2.75F, -5.5F);
		bodyModel[513].rotateAngleX = -0.78539816F;

		bodyModel[514].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[514].setRotationPoint(-17.49F, 3F, -6F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[515].setRotationPoint(-25.51F, 3F, -6F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[516].setRotationPoint(-1.75F, 4F, -10F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[517].setRotationPoint(2.25F, 4F, -10F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[518].setRotationPoint(1.25F, 4F, -10F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -1.375F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, -1.375F, -0.5F, -0.25F, -0.375F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.25F, -0.375F, -0.5F); // Box 38
		bodyModel[519].setRotationPoint(-2.75F, 3.75F, -10F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[520].setRotationPoint(-1.45F, 4.2F, -9.5F);
		bodyModel[520].rotateAngleZ = -0.78539816F;

		bodyModel[521].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[521].setRotationPoint(1.75F, 4.2F, -9.5F);
		bodyModel[521].rotateAngleZ = -0.78539816F;

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[522].setRotationPoint(-1.95F, 3F, -5.49F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[523].setRotationPoint(-1.95F, 3F, -9.49F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[524].setRotationPoint(1.25F, 3F, -5.49F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[525].setRotationPoint(1.25F, 3F, -9.49F);

		bodyModel[526].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 494
		bodyModel[526].setRotationPoint(-11.5F, 3F, -10F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[527].setRotationPoint(-57.5F, 4F, -11F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[528].setRotationPoint(-57.5F, 4F, 11F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[529].setRotationPoint(-1.5F, 6F, 10F);

		bodyModel[530].addBox(0F, 0F, 0F, 17, 3, 5, 0F); // Box 283
		bodyModel[530].setRotationPoint(-1.5F, 3F, 5F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 17, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 283
		bodyModel[531].setRotationPoint(-1.5F, 6F, 5F);

		bodyModel[532].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 513
		bodyModel[532].setRotationPoint(-12.5F, 3F, 5F);

		bodyModel[533].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 513
		bodyModel[533].setRotationPoint(-21.5F, 3F, 5F);

		bodyModel[534].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 283
		bodyModel[534].setRotationPoint(11.5F, 3F, 5F);

		bodyModel[535].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 544
		bodyModel[535].setRotationPoint(-19.5F, 3F, -10F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 545
		bodyModel[536].setRotationPoint(-29.5F, 6F, -11F);

		bodyModel[537].addBox(0F, 0F, 0F, 17, 3, 5, 0F); // Box 546
		bodyModel[537].setRotationPoint(-29.5F, 3F, -10F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 17, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		bodyModel[538].setRotationPoint(-29.5F, 6F, -10F);

		bodyModel[539].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 548
		bodyModel[539].setRotationPoint(5.5F, 3F, -10F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 70, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F); // Box 128
		bodyModel[540].setRotationPoint(-38.5F, -16F, -10F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 70, 1, 2, 0F,0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[541].setRotationPoint(-38.5F, -18F, -9F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 70, 1, 3, 0F,0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[542].setRotationPoint(-38.5F, -16F, 7F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 70, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[543].setRotationPoint(-38.5F, -18F, 6.7F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 70, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[544].setRotationPoint(-38.5F, -16.99F, -0.5F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 65, 0, 3, 0F,-0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38
		bodyModel[545].setRotationPoint(-33.5F, -13.01F, 7F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 65, 0, 3, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F); // Box 275
		bodyModel[546].setRotationPoint(-38.5F, -13.01F, -10F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[547].setRotationPoint(29.5F, -7F, -1F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 70, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[548].setRotationPoint(-38.5F, -16.99F, -0.5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[549].setRotationPoint(25.5F, -17F, -0.5F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[550].setRotationPoint(15.5F, -17F, -0.5F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[551].setRotationPoint(5.5F, -17F, -0.5F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[552].setRotationPoint(-4.5F, -17F, -0.5F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[553].setRotationPoint(-14.5F, -17F, -0.5F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[554].setRotationPoint(-24.5F, -17F, -0.5F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[555].setRotationPoint(-34.5F, -17F, -0.5F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 70, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[556].setRotationPoint(-38.5F, -17F, -2F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 70, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[557].setRotationPoint(-38.5F, -17F, -2.01F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 70, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566 glow
		bodyModel[558].setRotationPoint(-38.5F, -17F, 2.01F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 55, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 275 cull
		bodyModel[559].setRotationPoint(-28.5F, -14F, -10F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[560].setRotationPoint(-38.5F, -13F, -10F);

		bodyModel[561].addBox(0F, 0F, 0F, 1, 8, 6, 0F); // Box 38
		bodyModel[561].setRotationPoint(-29.5F, -7F, -10F);

		bodyModel[562].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 38
		bodyModel[562].setRotationPoint(-29.5F, -15F, -10F);

		bodyModel[563].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 38
		bodyModel[563].setRotationPoint(-38.5F, -15F, -5F);

		bodyModel[564].addBox(0F, 0F, 0F, 9, 0, 2, 0F); // Box 38
		bodyModel[564].setRotationPoint(-38.5F, -4F, -10F);

		bodyModel[565].addBox(0F, 0F, 0F, 3, 5, 4, 0F); // Box 38
		bodyModel[565].setRotationPoint(-38.5F, -4F, -8F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[566].setRotationPoint(-37.5F, -7F, -5F);

		bodyModel[567].addBox(0F, 0F, 0F, 9, 0, 2, 0F); // Box 38
		bodyModel[567].setRotationPoint(-38.5F, -7F, -10F);

		bodyModel[568].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 38
		bodyModel[568].setRotationPoint(-31.5F, -7F, -5F);

		bodyModel[569].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 38
		bodyModel[569].setRotationPoint(-31.5F, -4F, -8F);

		bodyModel[570].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 38
		bodyModel[570].setRotationPoint(-31.5F, -7F, -8F);

		bodyModel[571].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 38
		bodyModel[571].setRotationPoint(-38.5F, -7F, -8F);

		bodyModel[572].addBox(0F, 0F, 0F, 9, 0, 1, 0F); // Box 38
		bodyModel[572].setRotationPoint(-38.5F, -15F, -10F);

		bodyModel[573].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 38
		bodyModel[573].setRotationPoint(-38.5F, -15F, -9F);

		bodyModel[574].addBox(0F, 0F, 0F, 9, 0, 1, 0F); // Box 38
		bodyModel[574].setRotationPoint(-38.5F, -12F, -10F);

		bodyModel[575].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 38
		bodyModel[575].setRotationPoint(-38.5F, -12F, -9F);

		bodyModel[576].addBox(0F, 0F, 0F, 9, 0, 1, 0F); // Box 38
		bodyModel[576].setRotationPoint(-38.5F, -9.5F, -10F);

		bodyModel[577].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 38
		bodyModel[577].setRotationPoint(-38.5F, -9.5F, -9F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 15, 16, 0, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -7F, -8F, 0F, -7F, -8F, 0F, 0F, -8F, 0F); // Box 38
		bodyModel[578].setRotationPoint(-37.5F, -15F, -9F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 0, 16, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, -4F, 0F, -8F, -4F); // Box 38
		bodyModel[579].setRotationPoint(-37.5F, -15F, -9F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 15, 15, 0, 0F,0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, -7.5F, -7.5F, 0F, -7.5F, -7.5F, 0F, 0F, -7.5F, 0F); // Box 38 magazine part
		bodyModel[580].setRotationPoint(-37F, -14.5F, -9.5F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 0, 15, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, -3.5F, 0F, -7.5F, -3.5F); // Box 38 magazine part 2
		bodyModel[581].setRotationPoint(-38F, -14.5F, -8.5F);

		bodyModel[582].addBox(0F, 0F, 0F, 65, 1, 3, 0F); // Box 275
		bodyModel[582].setRotationPoint(-38.5F, -14F, -10F);

		bodyModel[583].addBox(0F, 0F, 0F, 65, 1, 3, 0F); // Box 38 cull
		bodyModel[583].setRotationPoint(-33.5F, -14F, 7F);

		bodyModel[584].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 128
		bodyModel[584].setRotationPoint(-54.5F, -15F, 4F);

		bodyModel[585].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 128
		bodyModel[585].setRotationPoint(-51.5F, -15F, -10F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 128
		bodyModel[586].setRotationPoint(-56.5F, -15F, -4F);

		bodyModel[587].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 128
		bodyModel[587].setRotationPoint(-50.5F, -15F, 5F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 38
		bodyModel[588].setRotationPoint(-55.36F, -2F, -10.28F);
		bodyModel[588].rotateAngleY = 0.78539816F;

		bodyModel[589].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 38
		bodyModel[589].setRotationPoint(-55.53F, -1F, -9.75F);
		bodyModel[589].rotateAngleY = 0.78539816F;

		bodyModel[590].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[590].setRotationPoint(-54.83F, 0.5F, -9.75F);
		bodyModel[590].rotateAngleY = 0.78539816F;

		bodyModel[591].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[591].setRotationPoint(-50.5F, -6F, 3F);

		bodyModel[592].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[592].setRotationPoint(-49.5F, -5F, 4F);
		bodyModel[592].rotateAngleY = -0.78539816F;

		bodyModel[593].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[593].setRotationPoint(-50.5F, -6F, -10F);

		bodyModel[594].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[594].setRotationPoint(-49.5F, -5F, -9F);
		bodyModel[594].rotateAngleY = -0.78539816F;

		bodyModel[595].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[595].setRotationPoint(-50.5F, -6F, -2F);

		bodyModel[596].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[596].setRotationPoint(-50F, -5F, -1F);
		bodyModel[596].rotateAngleY = -0.78539816F;

		bodyModel[597].addShapeBox(0F, 0F, 0F, 6, 14, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[597].setRotationPoint(-47.5F, -14F, 5.5F);

		bodyModel[598].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 128
		bodyModel[598].setRotationPoint(-44.5F, -15F, 5F);

		bodyModel[599].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 128
		bodyModel[599].setRotationPoint(39.5F, -15F, -6F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 6, 14, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[600].setRotationPoint(39.5F, -14F, -5.5F);

		bodyModel[601].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 38
		bodyModel[601].setRotationPoint(32.5F, -15F, -6F);

		bodyModel[602].addBox(0F, 0F, 0F, 3, 15, 1, 0F); // Box 38
		bodyModel[602].setRotationPoint(39.5F, -14F, -6F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 6, 14, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[603].setRotationPoint(-50.5F, -14F, 5.5F);

		bodyModel[604].addBox(0F, 0F, 0F, 3, 15, 1, 0F); // Box 128
		bodyModel[604].setRotationPoint(-50.5F, -14F, 5F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[605].setRotationPoint(-48F, -6F, -10F);

		bodyModel[606].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[606].setRotationPoint(-47F, -5F, -9F);
		bodyModel[606].rotateAngleY = -0.78539816F;

		bodyModel[607].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[607].setRotationPoint(44.5F, -6F, 7F);

		bodyModel[608].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[608].setRotationPoint(45F, -5F, 8F);
		bodyModel[608].rotateAngleY = -0.78539816F;

		bodyModel[609].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 402
		bodyModel[609].setRotationPoint(32.5F, -15F, -5F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 340
		bodyModel[610].setRotationPoint(-42.5F, -15F, 2F);

		bodyModel[611].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 38
		bodyModel[611].setRotationPoint(-46.5F, -5F, -10F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[612].setRotationPoint(-47F, -3F, -8F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[613].setRotationPoint(-47F, -2F, -8F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[614].setRotationPoint(-47F, -5F, -6F);

		bodyModel[615].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 128
		bodyModel[615].setRotationPoint(32.5F, -15F, -5F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[616].setRotationPoint(33F, -3F, -3F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[617].setRotationPoint(33F, -6.5F, -3F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Boc 42 cull
		bodyModel[618].setRotationPoint(33F, -1F, -3F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 4, 12, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, -1F, -6.5F, 0F, -1F, -6.5F, 0F, 0F, -6.5F, 0F); // Right seat part cull
		bodyModel[619].setRotationPoint(33F, -4.5F, -4F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 4, 12, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, -1F, -6.5F, 0F, -1F, -6.5F, 0F, 0F, -6.5F, 0F); // Right seat part cull
		bodyModel[620].setRotationPoint(33F, -4.5F, 1F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 4, 12, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, -1F, -6.5F, 0F, -1F, -6.5F, 0F, 0F, -6.5F, 0F); // Right seat part cull
		bodyModel[621].setRotationPoint(33F, -4.5F, 8F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[622].setRotationPoint(33F, -3F, 4F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[623].setRotationPoint(33F, -6.5F, 4F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Boc 42 cull
		bodyModel[624].setRotationPoint(33F, -1F, 4F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 4, 12, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, -1F, -6.5F, 0F, -1F, -6.5F, 0F, 0F, -6.5F, 0F); // Right seat part cull
		bodyModel[625].setRotationPoint(33F, -4.5F, 3F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[626].setRotationPoint(36.5F, -3F, -4.5F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F); // Right seat part
		bodyModel[627].setRotationPoint(36.5F, -6.5F, -4.5F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Boc 42 cull
		bodyModel[628].setRotationPoint(36.5F, -1F, -4.5F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, -1F, 0F, -6.5F, -1F); // Right seat part cull
		bodyModel[629].setRotationPoint(40.5F, -4.5F, -4.5F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, -1F, 0F, -6.5F, -1F); // Right seat part cull
		bodyModel[630].setRotationPoint(35.5F, -4.5F, -4.5F);

		bodyModel[631].addBox(0F, 0F, 0F, 3, 15, 1, 0F); // Box 128
		bodyModel[631].setRotationPoint(-47.5F, -14F, 5F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 115, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[632].setRotationPoint(-57.5F, -20F, -3F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[633].setRotationPoint(37.5F, -5F, 1.5F);

		bodyModel[634].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[634].setRotationPoint(38.5F, -5.5F, 2.5F);
		bodyModel[634].rotateAngleY = -0.78539816F;

		bodyModel[635].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[635].setRotationPoint(37.5F, 0.5F, 1.5F);

		bodyModel[636].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[636].setRotationPoint(-46.5F, -5F, -3.5F);

		bodyModel[637].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[637].setRotationPoint(-45.5F, -5.5F, -2.5F);
		bodyModel[637].rotateAngleY = -0.78539816F;

		bodyModel[638].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[638].setRotationPoint(-46.5F, 0.5F, -3.5F);

		bodyModel[639].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[639].setRotationPoint(52.5F, 2.5F, 5F);

		bodyModel[640].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[640].setRotationPoint(52.5F, 4F, 6.5F);

		bodyModel[641].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[641].setRotationPoint(52.5F, 2.5F, 6.5F);

		bodyModel[642].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[642].setRotationPoint(52.5F, 4F, 8F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[643].setRotationPoint(52.5F, 5.5F, 8F);

		bodyModel[644].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[644].setRotationPoint(52.5F, 5.5F, 9.5F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 128
		bodyModel[645].setRotationPoint(56.49F, 3F, 5F);

		bodyModel[646].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[646].setRotationPoint(56.49F, 3F, 9.5F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 128
		bodyModel[647].setRotationPoint(52.51F, 3F, 5F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[648].setRotationPoint(52.51F, 3F, 9.5F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[649].setRotationPoint(52.5F, 7F, 9.5F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 628
		bodyModel[650].setRotationPoint(52.5F, 2.5F, -7F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 629
		bodyModel[651].setRotationPoint(52.5F, 4F, -8.5F);

		bodyModel[652].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 631
		bodyModel[652].setRotationPoint(52.5F, 2.5F, -6.5F);

		bodyModel[653].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 632
		bodyModel[653].setRotationPoint(52.5F, 4F, -8F);

		bodyModel[654].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 633
		bodyModel[654].setRotationPoint(52.5F, 5.5F, -10F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 634
		bodyModel[655].setRotationPoint(52.5F, 5.5F, -9.5F);

		bodyModel[656].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 635
		bodyModel[656].setRotationPoint(56.49F, 3F, -9F);

		bodyModel[657].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		bodyModel[657].setRotationPoint(56.49F, 3F, -11.5F);

		bodyModel[658].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 638
		bodyModel[658].setRotationPoint(52.51F, 3F, -9F);

		bodyModel[659].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		bodyModel[659].setRotationPoint(52.51F, 3F, -11.5F);

		bodyModel[660].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 630
		bodyModel[660].setRotationPoint(52.5F, 7F, -11.5F);

		bodyModel[661].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[661].setRotationPoint(56.5F, 4F, 10F);

		bodyModel[662].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull
		bodyModel[662].setRotationPoint(-57.5F, 4F, 10.5F);

		bodyModel[663].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 2
		bodyModel[663].setRotationPoint(-53.75F, 3F, 10.5F);

		bodyModel[664].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[664].setRotationPoint(-54.5F, 4F, 10.5F);

		bodyModel[665].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[665].setRotationPoint(-57.5F, 3F, 10.5F);

		bodyModel[666].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 666
		bodyModel[666].setRotationPoint(56.5F, 4F, -11F);

		bodyModel[667].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 667
		bodyModel[667].setRotationPoint(-57.5F, 4F, -11.5F);

		bodyModel[668].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.25F, 0F, 0F); // Box 668
		bodyModel[668].setRotationPoint(-53.75F, 3F, -11.5F);

		bodyModel[669].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 669
		bodyModel[669].setRotationPoint(-54.5F, 4F, -11.5F);

		bodyModel[670].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 670
		bodyModel[670].setRotationPoint(-57.5F, 3F, -11.5F);

		bodyModel[671].addBox(0F, 0F, 0F, 3, 15, 1, 0F); // Box 128
		bodyModel[671].setRotationPoint(-46.5F, -14F, 5F);

		bodyModel[672].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.5F, -0.01F, -0.8F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.8F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F); // Box 128 cull
		bodyModel[672].setRotationPoint(48F, -15F, 2F);

		bodyModel[673].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.8F, -0.5F, -0.01F, -1F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.8F, -0.5F, -0.01F, -1F); // Box 128 cull
		bodyModel[673].setRotationPoint(-54.5F, -15F, -3F);
	}
	ModelPS_Truck_41GT bogie1 = new ModelPS_Truck_41GT();
	ModelPS_Truck_41TRV11 bogie2 = new ModelPS_Truck_41TRV11();
	ModelPS_Truck_41RC11 bogie3 = new ModelPS_Truck_41RC11();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 674; i++)
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
		if(GetColor(entity)==14 || GetColor(entity)==1){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-TR_truck_silver_friction.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.57, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-5.14, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if(GetColor(entity)==8 || GetColor(entity)==7 || GetColor(entity)==4){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-TRV-11_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.57, -0.03, 0);
			bogie2.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.14, 0, 0);
			bogie2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if(GetColor(entity)==11){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-RC-11_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.57, -0.03, 0);
			bogie3.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-5.14, 0, 0);
			bogie3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if(GetColor(entity)==3 || GetColor(entity)==5){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-RC-11_truck_silver_other.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.57, -0.03, 0);
			bogie3.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-5.14, 0, 0);
			bogie3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}else if(GetColor(entity)==15 || GetColor(entity)==6){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-TR_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.57, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.14, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if(GetColor(entity)==123456){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-TR_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.57, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-5.14, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-TR_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.57, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-5.14, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}