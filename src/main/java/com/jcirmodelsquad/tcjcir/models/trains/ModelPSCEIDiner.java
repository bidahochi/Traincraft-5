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

public class ModelPSCEIDiner extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPSCEIDiner() //Same as Filename
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
		bodyModel[1] = new ModelRendererTurbo(this, 258, 148, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 260, 151, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 253, 148, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 253, 151, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 74, 151, textureX, textureY, "cull"); // Box 2 cull
		bodyModel[6] = new ModelRendererTurbo(this, 74, 148, textureX, textureY, "cull"); // Box 2 cull
		bodyModel[7] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 244, 151, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 258, 138, textureX, textureY); // Box 26
		bodyModel[14] = new ModelRendererTurbo(this, 260, 141, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 253, 138, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 253, 141, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 74, 141, textureX, textureY, "cull"); // Box 30 cull
		bodyModel[18] = new ModelRendererTurbo(this, 74, 138, textureX, textureY, "cull"); // Box 31 cull
		bodyModel[19] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[20] = new ModelRendererTurbo(this, 244, 141, textureX, textureY); // Box 35
		bodyModel[21] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[22] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[23] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[24] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 39
		bodyModel[25] = new ModelRendererTurbo(this, 347, 117, textureX, textureY); // Box 2
		bodyModel[26] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 2
		bodyModel[27] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 2
		bodyModel[28] = new ModelRendererTurbo(this, 30, 122, textureX, textureY); // Box 2
		bodyModel[29] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[30] = new ModelRendererTurbo(this, 320, 121, textureX, textureY); // Box 2
		bodyModel[31] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[32] = new ModelRendererTurbo(this, 209, 164, textureX, textureY); // Box 2
		bodyModel[33] = new ModelRendererTurbo(this, 209, 172, textureX, textureY); // Box 2
		bodyModel[34] = new ModelRendererTurbo(this, 230, 158, textureX, textureY); // Box 41
		bodyModel[35] = new ModelRendererTurbo(this, 229, 156, textureX, textureY); // Box 41
		bodyModel[36] = new ModelRendererTurbo(this, 249, 156, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 254, 170, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 254, 168, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 274, 168, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 88, 68, textureX, textureY); // Box 38
		bodyModel[41] = new ModelRendererTurbo(this, 80, 87, textureX, textureY); // Box 128
		bodyModel[42] = new ModelRendererTurbo(this, 381, 20, textureX, textureY); // Box 128
		bodyModel[43] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[44] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 400, 22, textureX, textureY); // Vestibule door
		bodyModel[49] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[50] = new ModelRendererTurbo(this, 434, 23, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 434, 35, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 410, 2, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 424, 1, textureX, textureY); // Box 128
		bodyModel[56] = new ModelRendererTurbo(this, 445, 35, textureX, textureY); // Box 128
		bodyModel[57] = new ModelRendererTurbo(this, 445, 23, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 20, 43, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 128
		bodyModel[63] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 128
		bodyModel[64] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[69] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[70] = new ModelRendererTurbo(this, 32, 205, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[72] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[73] = new ModelRendererTurbo(this, 45, 86, textureX, textureY); // Box 128
		bodyModel[74] = new ModelRendererTurbo(this, 48, 106, textureX, textureY); // Box 204
		bodyModel[75] = new ModelRendererTurbo(this, 366, 87, textureX, textureY); // Box 38
		bodyModel[76] = new ModelRendererTurbo(this, 374, 103, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 373, 97, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 372, 91, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 370, 83, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 366, 67, textureX, textureY); // Box 248
		bodyModel[81] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 250
		bodyModel[82] = new ModelRendererTurbo(this, 373, 72, textureX, textureY); // Box 252
		bodyModel[83] = new ModelRendererTurbo(this, 372, 77, textureX, textureY); // Box 254
		bodyModel[84] = new ModelRendererTurbo(this, 371, 86, textureX, textureY); // Box 38
		bodyModel[85] = new ModelRendererTurbo(this, 384, 101, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 392, 84, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 247
		bodyModel[88] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 249
		bodyModel[89] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[90] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[91] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 28, 103, textureX, textureY); // Box 128
		bodyModel[93] = new ModelRendererTurbo(this, 7, 114, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 27, 97, textureX, textureY); // Box 128
		bodyModel[95] = new ModelRendererTurbo(this, 26, 91, textureX, textureY); // Box 128
		bodyModel[96] = new ModelRendererTurbo(this, 24, 83, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[98] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[99] = new ModelRendererTurbo(this, 19, 67, textureX, textureY); // Box 249
		bodyModel[100] = new ModelRendererTurbo(this, 28, 67, textureX, textureY); // Box 250
		bodyModel[101] = new ModelRendererTurbo(this, 27, 72, textureX, textureY); // Box 252
		bodyModel[102] = new ModelRendererTurbo(this, 26, 77, textureX, textureY); // Box 254
		bodyModel[103] = new ModelRendererTurbo(this, 74, 145, textureX, textureY); // Box 128
		bodyModel[104] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 205
		bodyModel[105] = new ModelRendererTurbo(this, 161, 155, textureX, textureY); // Box 2
		bodyModel[106] = new ModelRendererTurbo(this, 252, 159, textureX, textureY); // Box 52
		bodyModel[107] = new ModelRendererTurbo(this, 245, 181, textureX, textureY); // Box 52
		bodyModel[108] = new ModelRendererTurbo(this, 204, 180, textureX, textureY); // Box 52
		bodyModel[109] = new ModelRendererTurbo(this, 225, 181, textureX, textureY); // Box 41
		bodyModel[110] = new ModelRendererTurbo(this, 224, 179, textureX, textureY); // Box 41
		bodyModel[111] = new ModelRendererTurbo(this, 242, 179, textureX, textureY); // Box 41
		bodyModel[112] = new ModelRendererTurbo(this, 439, 399, textureX, textureY); // Box 38
		bodyModel[113] = new ModelRendererTurbo(this, 272, 263, textureX, textureY); // Box 38
		bodyModel[114] = new ModelRendererTurbo(this, 108, 403, textureX, textureY); // Box 38
		bodyModel[115] = new ModelRendererTurbo(this, 59, 409, textureX, textureY); // Box 462
		bodyModel[116] = new ModelRendererTurbo(this, 479, 399, textureX, textureY); // Box 38
		bodyModel[117] = new ModelRendererTurbo(this, 125, 285, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[118] = new ModelRendererTurbo(this, 480, 367, textureX, textureY); // Box 38
		bodyModel[119] = new ModelRendererTurbo(this, 29, 309, textureX, textureY); // Box 38
		bodyModel[120] = new ModelRendererTurbo(this, 27, 312, textureX, textureY); // Box 38
		bodyModel[121] = new ModelRendererTurbo(this, 32, 312, textureX, textureY); // Box 38
		bodyModel[122] = new ModelRendererTurbo(this, 28, 315, textureX, textureY); // Box 38
		bodyModel[123] = new ModelRendererTurbo(this, 26, 304, textureX, textureY); // Box 38
		bodyModel[124] = new ModelRendererTurbo(this, 26, 297, textureX, textureY); // Box 38
		bodyModel[125] = new ModelRendererTurbo(this, 289, 235, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Box 176
		bodyModel[127] = new ModelRendererTurbo(this, 278, 247, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 84, 3, textureX, textureY); // Box 275
		bodyModel[129] = new ModelRendererTurbo(this, 83, 8, textureX, textureY); // Box 276
		bodyModel[130] = new ModelRendererTurbo(this, 110, 2, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 110, 7, textureX, textureY); // Box 128
		bodyModel[132] = new ModelRendererTurbo(this, 109, 13, textureX, textureY); // Box 204
		bodyModel[133] = new ModelRendererTurbo(this, 109, 18, textureX, textureY); // Box 205
		bodyModel[134] = new ModelRendererTurbo(this, 46, 78, textureX, textureY); // Box 128
		bodyModel[135] = new ModelRendererTurbo(this, 46, 100, textureX, textureY); // Box 202
		bodyModel[136] = new ModelRendererTurbo(this, 382, 90, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 380, 82, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 422, 52, textureX, textureY); // Box 128
		bodyModel[139] = new ModelRendererTurbo(this, 412, 52, textureX, textureY); // Box 153
		bodyModel[140] = new ModelRendererTurbo(this, 418, 45, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 426, 46, textureX, textureY); // Box 128
		bodyModel[142] = new ModelRendererTurbo(this, 382, 76, textureX, textureY); // Box 253
		bodyModel[143] = new ModelRendererTurbo(this, 412, 46, textureX, textureY); // Box 255
		bodyModel[144] = new ModelRendererTurbo(this, 383, 96, textureX, textureY); // Box 128
		bodyModel[145] = new ModelRendererTurbo(this, 383, 71, textureX, textureY); // Box 251
		bodyModel[146] = new ModelRendererTurbo(this, 426, 19, textureX, textureY); // Box 128
		bodyModel[147] = new ModelRendererTurbo(this, 446, 17, textureX, textureY); // Box 153
		bodyModel[148] = new ModelRendererTurbo(this, 17, 90, textureX, textureY); // Box 128
		bodyModel[149] = new ModelRendererTurbo(this, 15, 82, textureX, textureY); // Box 128
		bodyModel[150] = new ModelRendererTurbo(this, 14, 115, textureX, textureY); // Box 128
		bodyModel[151] = new ModelRendererTurbo(this, 4, 115, textureX, textureY); // Box 153
		bodyModel[152] = new ModelRendererTurbo(this, 10, 108, textureX, textureY); // Box 128
		bodyModel[153] = new ModelRendererTurbo(this, 18, 109, textureX, textureY); // Box 128
		bodyModel[154] = new ModelRendererTurbo(this, 17, 76, textureX, textureY); // Box 253
		bodyModel[155] = new ModelRendererTurbo(this, 4, 109, textureX, textureY); // Box 255
		bodyModel[156] = new ModelRendererTurbo(this, 18, 96, textureX, textureY); // Box 128
		bodyModel[157] = new ModelRendererTurbo(this, 18, 71, textureX, textureY); // Box 251
		bodyModel[158] = new ModelRendererTurbo(this, 16, 42, textureX, textureY); // Box 128
		bodyModel[159] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[160] = new ModelRendererTurbo(this, 251, 157, textureX, textureY); // Box 2
		bodyModel[161] = new ModelRendererTurbo(this, 251, 177, textureX, textureY); // Box 59
		bodyModel[162] = new ModelRendererTurbo(this, 264, 159, textureX, textureY); // Box 52
		bodyModel[163] = new ModelRendererTurbo(this, 252, 181, textureX, textureY); // Box 52
		bodyModel[164] = new ModelRendererTurbo(this, 189, 181, textureX, textureY); // Box 41
		bodyModel[165] = new ModelRendererTurbo(this, 188, 179, textureX, textureY); // Box 41
		bodyModel[166] = new ModelRendererTurbo(this, 202, 179, textureX, textureY); // Box 41
		bodyModel[167] = new ModelRendererTurbo(this, 161, 166, textureX, textureY); // Box 2
		bodyModel[168] = new ModelRendererTurbo(this, 192, 166, textureX, textureY); // Box 2
		bodyModel[169] = new ModelRendererTurbo(this, 457, 375, textureX, textureY); // Box 38
		bodyModel[170] = new ModelRendererTurbo(this, 456, 407, textureX, textureY); // Box 38
		bodyModel[171] = new ModelRendererTurbo(this, 438, 375, textureX, textureY); // Box 540
		bodyModel[172] = new ModelRendererTurbo(this, 440, 359, textureX, textureY); // Box 543
		bodyModel[173] = new ModelRendererTurbo(this, 105, 263, textureX, textureY); // Box 38
		bodyModel[174] = new ModelRendererTurbo(this, 31, 199, textureX, textureY); // Box 128
		bodyModel[175] = new ModelRendererTurbo(this, 4, 225, textureX, textureY); // Box 176
		bodyModel[176] = new ModelRendererTurbo(this, 103, 247, textureX, textureY); // Box 128
		bodyModel[177] = new ModelRendererTurbo(this, 34, 211, textureX, textureY); // Box 128
		bodyModel[178] = new ModelRendererTurbo(this, 52, 68, textureX, textureY); // Box 38
		bodyModel[179] = new ModelRendererTurbo(this, 52, 87, textureX, textureY); // Box 128
		bodyModel[180] = new ModelRendererTurbo(this, 52, 3, textureX, textureY); // Box 128
		bodyModel[181] = new ModelRendererTurbo(this, 46, 71, textureX, textureY); // Box 194
		bodyModel[182] = new ModelRendererTurbo(this, 49, 71, textureX, textureY); // Box 194
		bodyModel[183] = new ModelRendererTurbo(this, 1, 211, textureX, textureY); // Box 128
		bodyModel[184] = new ModelRendererTurbo(this, 3, 205, textureX, textureY); // Box 128
		bodyModel[185] = new ModelRendererTurbo(this, 1, 247, textureX, textureY); // Box 128
		bodyModel[186] = new ModelRendererTurbo(this, 4, 199, textureX, textureY); // Box 128
		bodyModel[187] = new ModelRendererTurbo(this, 1, 231, textureX, textureY); // Box 128
		bodyModel[188] = new ModelRendererTurbo(this, 1, 263, textureX, textureY); // Box 128
		bodyModel[189] = new ModelRendererTurbo(this, 8, 1, textureX, textureY); // Box 128
		bodyModel[190] = new ModelRendererTurbo(this, 19, 1, textureX, textureY); // Box 128
		bodyModel[191] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 177
		bodyModel[192] = new ModelRendererTurbo(this, 40, 45, textureX, textureY); // Box 128
		bodyModel[193] = new ModelRendererTurbo(this, 20, 59, textureX, textureY); // Box 128
		bodyModel[194] = new ModelRendererTurbo(this, 4, 59, textureX, textureY); // Box 176
		bodyModel[195] = new ModelRendererTurbo(this, 1, 51, textureX, textureY); // Box 128
		bodyModel[196] = new ModelRendererTurbo(this, 46, 93, textureX, textureY); // Box 204
		bodyModel[197] = new ModelRendererTurbo(this, 49, 93, textureX, textureY); // Box 204
		bodyModel[198] = new ModelRendererTurbo(this, 56, 362, textureX, textureY); // Box 528
		bodyModel[199] = new ModelRendererTurbo(this, 63, 137, textureX, textureY); // Box 154
		bodyModel[200] = new ModelRendererTurbo(this, 71, 137, textureX, textureY); // Box 155
		bodyModel[201] = new ModelRendererTurbo(this, 65, 138, textureX, textureY); // Box 156
		bodyModel[202] = new ModelRendererTurbo(this, 65, 141, textureX, textureY); // Box 157
		bodyModel[203] = new ModelRendererTurbo(this, 63, 147, textureX, textureY); // Box 320
		bodyModel[204] = new ModelRendererTurbo(this, 71, 147, textureX, textureY); // Box 321
		bodyModel[205] = new ModelRendererTurbo(this, 65, 148, textureX, textureY); // Box 322
		bodyModel[206] = new ModelRendererTurbo(this, 65, 151, textureX, textureY); // Box 323
		bodyModel[207] = new ModelRendererTurbo(this, 119, 18, textureX, textureY); // Box 193
		bodyModel[208] = new ModelRendererTurbo(this, 118, 15, textureX, textureY); // Box 194
		bodyModel[209] = new ModelRendererTurbo(this, 100, 14, textureX, textureY); // Box 279
		bodyModel[210] = new ModelRendererTurbo(this, 86, 14, textureX, textureY); // Box 279
		bodyModel[211] = new ModelRendererTurbo(this, 168, 180, textureX, textureY); // Box 52
		bodyModel[212] = new ModelRendererTurbo(this, 40, 417, textureX, textureY); // Box 38
		bodyModel[213] = new ModelRendererTurbo(this, 40, 415, textureX, textureY); // Box 452
		bodyModel[214] = new ModelRendererTurbo(this, 61, 421, textureX, textureY); // Box 38
		bodyModel[215] = new ModelRendererTurbo(this, 61, 419, textureX, textureY); // Box 452
		bodyModel[216] = new ModelRendererTurbo(this, 60, 196, textureX, textureY); // Box 128
		bodyModel[217] = new ModelRendererTurbo(this, 270, 145, textureX, textureY); // Box 128
		bodyModel[218] = new ModelRendererTurbo(this, 270, 155, textureX, textureY); // Box 205
		bodyModel[219] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[220] = new ModelRendererTurbo(this, 3, 219, textureX, textureY); // Box 177
		bodyModel[221] = new ModelRendererTurbo(this, 103, 231, textureX, textureY); // Box 128
		bodyModel[222] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[223] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[224] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[225] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[226] = new ModelRendererTurbo(this, 77, 66, textureX, textureY); // Box 38
		bodyModel[227] = new ModelRendererTurbo(this, 77, 70, textureX, textureY); // Left side loading door
		bodyModel[228] = new ModelRendererTurbo(this, 76, 18, textureX, textureY); // Box 190
		bodyModel[229] = new ModelRendererTurbo(this, 75, 14, textureX, textureY); // Box 191
		bodyModel[230] = new ModelRendererTurbo(this, 69, 86, textureX, textureY); // Box 128
		bodyModel[231] = new ModelRendererTurbo(this, 69, 90, textureX, textureY); // Right side loading door
		bodyModel[232] = new ModelRendererTurbo(this, 95, 20, textureX, textureY); // Box 264
		bodyModel[233] = new ModelRendererTurbo(this, 95, 17, textureX, textureY); // Box 264
		bodyModel[234] = new ModelRendererTurbo(this, 96, 13, textureX, textureY); // Box 264
		bodyModel[235] = new ModelRendererTurbo(this, 96, 15, textureX, textureY); // Box 264
		bodyModel[236] = new ModelRendererTurbo(this, 94, 9, textureX, textureY); // Box 264
		bodyModel[237] = new ModelRendererTurbo(this, 94, 6, textureX, textureY); // Box 264
		bodyModel[238] = new ModelRendererTurbo(this, 95, 2, textureX, textureY); // Box 264
		bodyModel[239] = new ModelRendererTurbo(this, 95, 4, textureX, textureY); // Box 264
		bodyModel[240] = new ModelRendererTurbo(this, 78, 9, textureX, textureY); // Box 264
		bodyModel[241] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 264
		bodyModel[242] = new ModelRendererTurbo(this, 79, 2, textureX, textureY); // Box 264
		bodyModel[243] = new ModelRendererTurbo(this, 79, 4, textureX, textureY); // Box 264
		bodyModel[244] = new ModelRendererTurbo(this, 459, 363, textureX, textureY); // Box 38
		bodyModel[245] = new ModelRendererTurbo(this, 458, 397, textureX, textureY); // Box 38
		bodyModel[246] = new ModelRendererTurbo(this, 310, 323, textureX, textureY); // Box 38
		bodyModel[247] = new ModelRendererTurbo(this, 309, 306, textureX, textureY); // Box 540
		bodyModel[248] = new ModelRendererTurbo(this, 311, 290, textureX, textureY); // Box 543
		bodyModel[249] = new ModelRendererTurbo(this, 366, 370, textureX, textureY); // Box 128
		bodyModel[250] = new ModelRendererTurbo(this, 337, 375, textureX, textureY); // Box 128
		bodyModel[251] = new ModelRendererTurbo(this, 328, 296, textureX, textureY); // Box 128
		bodyModel[252] = new ModelRendererTurbo(this, 421, 361, textureX, textureY); // Box 128
		bodyModel[253] = new ModelRendererTurbo(this, 383, 310, textureX, textureY); // Box 128
		bodyModel[254] = new ModelRendererTurbo(this, 398, 385, textureX, textureY); // Box 128
		bodyModel[255] = new ModelRendererTurbo(this, 421, 370, textureX, textureY); // Box 128
		bodyModel[256] = new ModelRendererTurbo(this, 392, 375, textureX, textureY); // Box 128
		bodyModel[257] = new ModelRendererTurbo(this, 366, 402, textureX, textureY); // Box 361
		bodyModel[258] = new ModelRendererTurbo(this, 337, 407, textureX, textureY); // Box 362
		bodyModel[259] = new ModelRendererTurbo(this, 328, 328, textureX, textureY); // Box 363
		bodyModel[260] = new ModelRendererTurbo(this, 421, 393, textureX, textureY); // Box 364
		bodyModel[261] = new ModelRendererTurbo(this, 421, 402, textureX, textureY); // Box 367
		bodyModel[262] = new ModelRendererTurbo(this, 392, 407, textureX, textureY); // Box 368
		bodyModel[263] = new ModelRendererTurbo(this, 359, 409, textureX, textureY); // Box 369
		bodyModel[264] = new ModelRendererTurbo(this, 361, 405, textureX, textureY); // Box 372
		bodyModel[265] = new ModelRendererTurbo(this, 414, 409, textureX, textureY); // Box 373
		bodyModel[266] = new ModelRendererTurbo(this, 402, 401, textureX, textureY); // Box 374
		bodyModel[267] = new ModelRendererTurbo(this, 409, 404, textureX, textureY); // Box 375
		bodyModel[268] = new ModelRendererTurbo(this, 416, 405, textureX, textureY); // Box 376
		bodyModel[269] = new ModelRendererTurbo(this, 340, 394, textureX, textureY); // Box 377
		bodyModel[270] = new ModelRendererTurbo(this, 395, 394, textureX, textureY); // Box 378
		bodyModel[271] = new ModelRendererTurbo(this, 343, 391, textureX, textureY); // Box 380
		bodyModel[272] = new ModelRendererTurbo(this, 404, 406, textureX, textureY); // Box 375
		bodyModel[273] = new ModelRendererTurbo(this, 402, 369, textureX, textureY); // Box 383
		bodyModel[274] = new ModelRendererTurbo(this, 409, 372, textureX, textureY); // Box 384
		bodyModel[275] = new ModelRendererTurbo(this, 404, 374, textureX, textureY); // Box 385
		bodyModel[276] = new ModelRendererTurbo(this, 347, 401, textureX, textureY); // Box 374
		bodyModel[277] = new ModelRendererTurbo(this, 354, 404, textureX, textureY); // Box 375
		bodyModel[278] = new ModelRendererTurbo(this, 349, 406, textureX, textureY); // Box 375
		bodyModel[279] = new ModelRendererTurbo(this, 354, 372, textureX, textureY); // Box 384
		bodyModel[280] = new ModelRendererTurbo(this, 349, 374, textureX, textureY); // Box 385
		bodyModel[281] = new ModelRendererTurbo(this, 398, 417, textureX, textureY); // Box 468
		bodyModel[282] = new ModelRendererTurbo(this, 352, 391, textureX, textureY); // Box 380
		bodyModel[283] = new ModelRendererTurbo(this, 398, 391, textureX, textureY); // Box 380
		bodyModel[284] = new ModelRendererTurbo(this, 407, 391, textureX, textureY); // Box 380
		bodyModel[285] = new ModelRendererTurbo(this, 343, 385, textureX, textureY); // Box 128
		bodyModel[286] = new ModelRendererTurbo(this, 343, 417, textureX, textureY); // Box 360
		bodyModel[287] = new ModelRendererTurbo(this, 359, 377, textureX, textureY); // Box 128
		bodyModel[288] = new ModelRendererTurbo(this, 361, 373, textureX, textureY); // Box 128
		bodyModel[289] = new ModelRendererTurbo(this, 414, 377, textureX, textureY); // Box 128
		bodyModel[290] = new ModelRendererTurbo(this, 416, 373, textureX, textureY); // Box 128
		bodyModel[291] = new ModelRendererTurbo(this, 476, 300, textureX, textureY); // Box 128
		bodyModel[292] = new ModelRendererTurbo(this, 447, 305, textureX, textureY); // Box 128
		bodyModel[293] = new ModelRendererTurbo(this, 311, 370, textureX, textureY); // Box 128
		bodyModel[294] = new ModelRendererTurbo(this, 282, 375, textureX, textureY); // Box 128
		bodyModel[295] = new ModelRendererTurbo(this, 476, 332, textureX, textureY); // Box 361
		bodyModel[296] = new ModelRendererTurbo(this, 447, 337, textureX, textureY); // Box 362
		bodyModel[297] = new ModelRendererTurbo(this, 311, 402, textureX, textureY); // Box 367
		bodyModel[298] = new ModelRendererTurbo(this, 282, 407, textureX, textureY); // Box 368
		bodyModel[299] = new ModelRendererTurbo(this, 469, 339, textureX, textureY); // Box 369
		bodyModel[300] = new ModelRendererTurbo(this, 471, 335, textureX, textureY); // Box 372
		bodyModel[301] = new ModelRendererTurbo(this, 304, 409, textureX, textureY); // Box 373
		bodyModel[302] = new ModelRendererTurbo(this, 292, 401, textureX, textureY); // Box 374
		bodyModel[303] = new ModelRendererTurbo(this, 299, 404, textureX, textureY); // Box 375
		bodyModel[304] = new ModelRendererTurbo(this, 306, 405, textureX, textureY); // Box 376
		bodyModel[305] = new ModelRendererTurbo(this, 450, 324, textureX, textureY); // Box 377
		bodyModel[306] = new ModelRendererTurbo(this, 285, 394, textureX, textureY); // Box 378
		bodyModel[307] = new ModelRendererTurbo(this, 453, 321, textureX, textureY); // Box 380
		bodyModel[308] = new ModelRendererTurbo(this, 294, 406, textureX, textureY); // Box 375
		bodyModel[309] = new ModelRendererTurbo(this, 292, 369, textureX, textureY); // Box 383
		bodyModel[310] = new ModelRendererTurbo(this, 299, 372, textureX, textureY); // Box 384
		bodyModel[311] = new ModelRendererTurbo(this, 294, 374, textureX, textureY); // Box 385
		bodyModel[312] = new ModelRendererTurbo(this, 457, 331, textureX, textureY); // Box 374
		bodyModel[313] = new ModelRendererTurbo(this, 464, 334, textureX, textureY); // Box 375
		bodyModel[314] = new ModelRendererTurbo(this, 459, 336, textureX, textureY); // Box 375
		bodyModel[315] = new ModelRendererTurbo(this, 457, 299, textureX, textureY); // Box 383
		bodyModel[316] = new ModelRendererTurbo(this, 464, 302, textureX, textureY); // Box 384
		bodyModel[317] = new ModelRendererTurbo(this, 459, 304, textureX, textureY); // Box 385
		bodyModel[318] = new ModelRendererTurbo(this, 462, 321, textureX, textureY); // Box 380
		bodyModel[319] = new ModelRendererTurbo(this, 288, 391, textureX, textureY); // Box 380
		bodyModel[320] = new ModelRendererTurbo(this, 297, 391, textureX, textureY); // Box 380
		bodyModel[321] = new ModelRendererTurbo(this, 469, 307, textureX, textureY); // Box 128
		bodyModel[322] = new ModelRendererTurbo(this, 471, 303, textureX, textureY); // Box 128
		bodyModel[323] = new ModelRendererTurbo(this, 304, 377, textureX, textureY); // Box 128
		bodyModel[324] = new ModelRendererTurbo(this, 306, 373, textureX, textureY); // Box 128
		bodyModel[325] = new ModelRendererTurbo(this, 421, 300, textureX, textureY); // Box 128
		bodyModel[326] = new ModelRendererTurbo(this, 392, 305, textureX, textureY); // Box 128
		bodyModel[327] = new ModelRendererTurbo(this, 421, 332, textureX, textureY); // Box 361
		bodyModel[328] = new ModelRendererTurbo(this, 392, 337, textureX, textureY); // Box 362
		bodyModel[329] = new ModelRendererTurbo(this, 414, 339, textureX, textureY); // Box 369
		bodyModel[330] = new ModelRendererTurbo(this, 416, 335, textureX, textureY); // Box 372
		bodyModel[331] = new ModelRendererTurbo(this, 395, 324, textureX, textureY); // Box 377
		bodyModel[332] = new ModelRendererTurbo(this, 398, 321, textureX, textureY); // Box 380
		bodyModel[333] = new ModelRendererTurbo(this, 402, 331, textureX, textureY); // Box 374
		bodyModel[334] = new ModelRendererTurbo(this, 409, 334, textureX, textureY); // Box 375
		bodyModel[335] = new ModelRendererTurbo(this, 404, 336, textureX, textureY); // Box 375
		bodyModel[336] = new ModelRendererTurbo(this, 402, 299, textureX, textureY); // Box 383
		bodyModel[337] = new ModelRendererTurbo(this, 409, 302, textureX, textureY); // Box 384
		bodyModel[338] = new ModelRendererTurbo(this, 404, 304, textureX, textureY); // Box 385
		bodyModel[339] = new ModelRendererTurbo(this, 407, 321, textureX, textureY); // Box 380
		bodyModel[340] = new ModelRendererTurbo(this, 414, 307, textureX, textureY); // Box 128
		bodyModel[341] = new ModelRendererTurbo(this, 416, 303, textureX, textureY); // Box 128
		bodyModel[342] = new ModelRendererTurbo(this, 288, 385, textureX, textureY); // Box 128
		bodyModel[343] = new ModelRendererTurbo(this, 288, 417, textureX, textureY); // Box 468
		bodyModel[344] = new ModelRendererTurbo(this, 453, 315, textureX, textureY); // Box 128
		bodyModel[345] = new ModelRendererTurbo(this, 453, 347, textureX, textureY); // Box 360
		bodyModel[346] = new ModelRendererTurbo(this, 398, 315, textureX, textureY); // Box 128
		bodyModel[347] = new ModelRendererTurbo(this, 398, 347, textureX, textureY); // Box 360
		bodyModel[348] = new ModelRendererTurbo(this, 366, 361, textureX, textureY); // Box 128
		bodyModel[349] = new ModelRendererTurbo(this, 366, 393, textureX, textureY); // Box 545
		bodyModel[350] = new ModelRendererTurbo(this, 311, 361, textureX, textureY); // Box 128
		bodyModel[351] = new ModelRendererTurbo(this, 311, 393, textureX, textureY); // Box 545
		bodyModel[352] = new ModelRendererTurbo(this, 476, 291, textureX, textureY); // Box 128
		bodyModel[353] = new ModelRendererTurbo(this, 476, 323, textureX, textureY); // Box 545
		bodyModel[354] = new ModelRendererTurbo(this, 421, 291, textureX, textureY); // Box 128
		bodyModel[355] = new ModelRendererTurbo(this, 421, 323, textureX, textureY); // Box 545
		bodyModel[356] = new ModelRendererTurbo(this, 397, 357, textureX, textureY); // Box 128
		bodyModel[357] = new ModelRendererTurbo(this, 395, 362, textureX, textureY); // Box 128
		bodyModel[358] = new ModelRendererTurbo(this, 342, 357, textureX, textureY); // Box 128
		bodyModel[359] = new ModelRendererTurbo(this, 340, 362, textureX, textureY); // Box 128
		bodyModel[360] = new ModelRendererTurbo(this, 287, 357, textureX, textureY); // Box 128
		bodyModel[361] = new ModelRendererTurbo(this, 285, 362, textureX, textureY); // Box 128
		bodyModel[362] = new ModelRendererTurbo(this, 452, 287, textureX, textureY); // Box 128
		bodyModel[363] = new ModelRendererTurbo(this, 450, 292, textureX, textureY); // Box 128
		bodyModel[364] = new ModelRendererTurbo(this, 397, 287, textureX, textureY); // Box 128
		bodyModel[365] = new ModelRendererTurbo(this, 395, 292, textureX, textureY); // Box 128
		bodyModel[366] = new ModelRendererTurbo(this, 438, 310, textureX, textureY); // Box 128
		bodyModel[367] = new ModelRendererTurbo(this, 417, 310, textureX, textureY); // Box 128
		bodyModel[368] = new ModelRendererTurbo(this, 273, 380, textureX, textureY); // Box 128
		bodyModel[369] = new ModelRendererTurbo(this, 472, 310, textureX, textureY); // Box 128
		bodyModel[370] = new ModelRendererTurbo(this, 328, 380, textureX, textureY); // Box 128
		bodyModel[371] = new ModelRendererTurbo(this, 307, 380, textureX, textureY); // Box 128
		bodyModel[372] = new ModelRendererTurbo(this, 383, 380, textureX, textureY); // Box 128
		bodyModel[373] = new ModelRendererTurbo(this, 362, 380, textureX, textureY); // Box 128
		bodyModel[374] = new ModelRendererTurbo(this, 417, 380, textureX, textureY); // Box 128
		bodyModel[375] = new ModelRendererTurbo(this, 438, 342, textureX, textureY); // Box 625
		bodyModel[376] = new ModelRendererTurbo(this, 417, 342, textureX, textureY); // Box 626
		bodyModel[377] = new ModelRendererTurbo(this, 273, 412, textureX, textureY); // Box 627
		bodyModel[378] = new ModelRendererTurbo(this, 472, 342, textureX, textureY); // Box 628
		bodyModel[379] = new ModelRendererTurbo(this, 328, 412, textureX, textureY); // Box 629
		bodyModel[380] = new ModelRendererTurbo(this, 307, 412, textureX, textureY); // Box 630
		bodyModel[381] = new ModelRendererTurbo(this, 383, 412, textureX, textureY); // Box 631
		bodyModel[382] = new ModelRendererTurbo(this, 362, 412, textureX, textureY); // Box 632
		bodyModel[383] = new ModelRendererTurbo(this, 417, 412, textureX, textureY); // Box 633
		bodyModel[384] = new ModelRendererTurbo(this, 383, 342, textureX, textureY); // Box 634
		bodyModel[385] = new ModelRendererTurbo(this, 347, 369, textureX, textureY); // Box 383
		bodyModel[386] = new ModelRendererTurbo(this, 328, 310, textureX, textureY); // Box 128
		bodyModel[387] = new ModelRendererTurbo(this, 366, 300, textureX, textureY); // Box 128
		bodyModel[388] = new ModelRendererTurbo(this, 337, 305, textureX, textureY); // Box 128
		bodyModel[389] = new ModelRendererTurbo(this, 366, 332, textureX, textureY); // Box 361
		bodyModel[390] = new ModelRendererTurbo(this, 337, 337, textureX, textureY); // Box 362
		bodyModel[391] = new ModelRendererTurbo(this, 359, 339, textureX, textureY); // Box 369
		bodyModel[392] = new ModelRendererTurbo(this, 361, 335, textureX, textureY); // Box 372
		bodyModel[393] = new ModelRendererTurbo(this, 340, 324, textureX, textureY); // Box 377
		bodyModel[394] = new ModelRendererTurbo(this, 343, 321, textureX, textureY); // Box 380
		bodyModel[395] = new ModelRendererTurbo(this, 347, 331, textureX, textureY); // Box 374
		bodyModel[396] = new ModelRendererTurbo(this, 354, 334, textureX, textureY); // Box 375
		bodyModel[397] = new ModelRendererTurbo(this, 349, 336, textureX, textureY); // Box 375
		bodyModel[398] = new ModelRendererTurbo(this, 347, 299, textureX, textureY); // Box 383
		bodyModel[399] = new ModelRendererTurbo(this, 354, 302, textureX, textureY); // Box 384
		bodyModel[400] = new ModelRendererTurbo(this, 349, 304, textureX, textureY); // Box 385
		bodyModel[401] = new ModelRendererTurbo(this, 352, 321, textureX, textureY); // Box 380
		bodyModel[402] = new ModelRendererTurbo(this, 359, 307, textureX, textureY); // Box 128
		bodyModel[403] = new ModelRendererTurbo(this, 361, 303, textureX, textureY); // Box 128
		bodyModel[404] = new ModelRendererTurbo(this, 343, 315, textureX, textureY); // Box 128
		bodyModel[405] = new ModelRendererTurbo(this, 343, 347, textureX, textureY); // Box 360
		bodyModel[406] = new ModelRendererTurbo(this, 342, 287, textureX, textureY); // Box 128
		bodyModel[407] = new ModelRendererTurbo(this, 340, 292, textureX, textureY); // Box 128
		bodyModel[408] = new ModelRendererTurbo(this, 362, 310, textureX, textureY); // Box 128
		bodyModel[409] = new ModelRendererTurbo(this, 362, 342, textureX, textureY); // Box 626
		bodyModel[410] = new ModelRendererTurbo(this, 328, 342, textureX, textureY); // Box 634
		bodyModel[411] = new ModelRendererTurbo(this, 366, 291, textureX, textureY); // Box 128
		bodyModel[412] = new ModelRendererTurbo(this, 366, 323, textureX, textureY); // Box 545
		bodyModel[413] = new ModelRendererTurbo(this, 229, 295, textureX, textureY); // Box 38
		bodyModel[414] = new ModelRendererTurbo(this, 257, 300, textureX, textureY); // Box 38
		bodyModel[415] = new ModelRendererTurbo(this, 191, 224, textureX, textureY); // Box 194
		bodyModel[416] = new ModelRendererTurbo(this, 191, 252, textureX, textureY); // Box 128
		bodyModel[417] = new ModelRendererTurbo(this, 190, 227, textureX, textureY); // Box 193
		bodyModel[418] = new ModelRendererTurbo(this, 189, 219, textureX, textureY); // Box 192
		bodyModel[419] = new ModelRendererTurbo(this, 190, 255, textureX, textureY); // Box 128
		bodyModel[420] = new ModelRendererTurbo(this, 189, 247, textureX, textureY); // Box 128
		bodyModel[421] = new ModelRendererTurbo(this, 26, 288, textureX, textureY); // Box 38
		bodyModel[422] = new ModelRendererTurbo(this, 29, 285, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[423] = new ModelRendererTurbo(this, 29, 294, textureX, textureY,"lamp"); // Box 883 glow
		bodyModel[424] = new ModelRendererTurbo(this, 23, 285, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[425] = new ModelRendererTurbo(this, 266, 310, textureX, textureY); // Box 540
		bodyModel[426] = new ModelRendererTurbo(this, 259, 312, textureX, textureY); // Box 540
		bodyModel[427] = new ModelRendererTurbo(this, 277, 312, textureX, textureY); // Box 540
		bodyModel[428] = new ModelRendererTurbo(this, 267, 325, textureX, textureY); // Box 38
		bodyModel[429] = new ModelRendererTurbo(this, 57, 302, textureX, textureY); // Box 38
		bodyModel[430] = new ModelRendererTurbo(this, 77, 304, textureX, textureY); // Box 38
		bodyModel[431] = new ModelRendererTurbo(this, 36, 256, textureX, textureY); // Box 128
		bodyModel[432] = new ModelRendererTurbo(this, 36, 240, textureX, textureY); // Box 128
		bodyModel[433] = new ModelRendererTurbo(this, 32, 219, textureX, textureY); // Box 177
		bodyModel[434] = new ModelRendererTurbo(this, 14, 309, textureX, textureY); // Box 38
		bodyModel[435] = new ModelRendererTurbo(this, 17, 314, textureX, textureY); // Box 38
		bodyModel[436] = new ModelRendererTurbo(this, 16, 318, textureX, textureY); // Box 38
		bodyModel[437] = new ModelRendererTurbo(this, 42, 299, textureX, textureY); // Box 543
		bodyModel[438] = new ModelRendererTurbo(this, 1, 304, textureX, textureY); // Box 543
		bodyModel[439] = new ModelRendererTurbo(this, 37, 304, textureX, textureY); // Box 543
		bodyModel[440] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 543
		bodyModel[441] = new ModelRendererTurbo(this, 12, 323, textureX, textureY); // Box 543
		bodyModel[442] = new ModelRendererTurbo(this, 39, 323, textureX, textureY); // Box 543
		bodyModel[443] = new ModelRendererTurbo(this, 66, 301, textureX, textureY); // Hallway door
		bodyModel[444] = new ModelRendererTurbo(this, 17, 285, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[445] = new ModelRendererTurbo(this, 10, 285, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[446] = new ModelRendererTurbo(this, -2, 285, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[447] = new ModelRendererTurbo(this, 286, 299, textureX, textureY); // Box 543
		bodyModel[448] = new ModelRendererTurbo(this, 285, 323, textureX, textureY); // Box 543
		bodyModel[449] = new ModelRendererTurbo(this, 278, 329, textureX, textureY); // Box 543
		bodyModel[450] = new ModelRendererTurbo(this, 113, 388, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[451] = new ModelRendererTurbo(this, 50, 387, textureX, textureY); // Box 38
		bodyModel[452] = new ModelRendererTurbo(this, 146, 368, textureX, textureY); // Box 38
		bodyModel[453] = new ModelRendererTurbo(this, 161, 338, textureX, textureY); // Box 38
		bodyModel[454] = new ModelRendererTurbo(this, 146, 380, textureX, textureY); // Box 38
		bodyModel[455] = new ModelRendererTurbo(this, 205, 350, textureX, textureY); // Box 38
		bodyModel[456] = new ModelRendererTurbo(this, 204, 336, textureX, textureY); // Box 38
		bodyModel[457] = new ModelRendererTurbo(this, 199, 318, textureX, textureY); // Box 38
		bodyModel[458] = new ModelRendererTurbo(this, 166, 322, textureX, textureY); // Box 38
		bodyModel[459] = new ModelRendererTurbo(this, 170, 332, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[460] = new ModelRendererTurbo(this, 200, 334, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[461] = new ModelRendererTurbo(this, 168, 334, textureX, textureY); // Box 38
		bodyModel[462] = new ModelRendererTurbo(this, 211, 323, textureX, textureY); // Box 38
		bodyModel[463] = new ModelRendererTurbo(this, 139, 338, textureX, textureY); // Box 38
		bodyModel[464] = new ModelRendererTurbo(this, 143, 322, textureX, textureY); // Box 38
		bodyModel[465] = new ModelRendererTurbo(this, 147, 332, textureX, textureY); // Box 38
		bodyModel[466] = new ModelRendererTurbo(this, 64, 362, textureX, textureY); // Box 38
		bodyModel[467] = new ModelRendererTurbo(this, 53, 372, textureX, textureY); // Box 38
		bodyModel[468] = new ModelRendererTurbo(this, 53, 367, textureX, textureY); // Box 38
		bodyModel[469] = new ModelRendererTurbo(this, 100, 382, textureX, textureY); // Box 38
		bodyModel[470] = new ModelRendererTurbo(this, 55, 380, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[471] = new ModelRendererTurbo(this, 105, 384, textureX, textureY); // Box 38
		bodyModel[472] = new ModelRendererTurbo(this, 107, 380, textureX, textureY); // Box 528
		bodyModel[473] = new ModelRendererTurbo(this, 63, 382, textureX, textureY); // Box 38
		bodyModel[474] = new ModelRendererTurbo(this, 152, 360, textureX, textureY); // Box 38
		bodyModel[475] = new ModelRendererTurbo(this, 150, 364, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[476] = new ModelRendererTurbo(this, 171, 350, textureX, textureY); // Box 128
		bodyModel[477] = new ModelRendererTurbo(this, 185, 356, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[478] = new ModelRendererTurbo(this, 187, 353, textureX, textureY); // Box 426
		bodyModel[479] = new ModelRendererTurbo(this, 171, 356, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[480] = new ModelRendererTurbo(this, 173, 353, textureX, textureY); // Box 426
		bodyModel[481] = new ModelRendererTurbo(this, 202, 334, textureX, textureY); // Box 38
		bodyModel[482] = new ModelRendererTurbo(this, 97, 354, textureX, textureY); // Box 38
		bodyModel[483] = new ModelRendererTurbo(this, 87, 322, textureX, textureY); // Box 38
		bodyModel[484] = new ModelRendererTurbo(this, 74, 340, textureX, textureY); // Box 38
		bodyModel[485] = new ModelRendererTurbo(this, 75, 323, textureX, textureY); // Box 38
		bodyModel[486] = new ModelRendererTurbo(this, 63, 323, textureX, textureY); // Box 38
		bodyModel[487] = new ModelRendererTurbo(this, 56, 352, textureX, textureY); // Box 128
		bodyModel[488] = new ModelRendererTurbo(this, 56, 358, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[489] = new ModelRendererTurbo(this, 58, 355, textureX, textureY); // Box 426
		bodyModel[490] = new ModelRendererTurbo(this, 74, 358, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[491] = new ModelRendererTurbo(this, 76, 355, textureX, textureY); // Box 426
		bodyModel[492] = new ModelRendererTurbo(this, 150, 356, textureX, textureY); // Box 128 coffee urn
		bodyModel[493] = new ModelRendererTurbo(this, 100, 333, textureX, textureY); // Box 128
		bodyModel[494] = new ModelRendererTurbo(this, 100, 340, textureX, textureY); // Box 128
		bodyModel[495] = new ModelRendererTurbo(this, 102, 348, textureX, textureY); // Box 128
		bodyModel[496] = new ModelRendererTurbo(this, 113, 340, textureX, textureY); // Box 128
		bodyModel[497] = new ModelRendererTurbo(this, 114, 348, textureX, textureY); // Box 128
		bodyModel[498] = new ModelRendererTurbo(this, 122, 342, textureX, textureY); // Box 38
		bodyModel[499] = new ModelRendererTurbo(this, 129, 333, textureX, textureY); // Box 128 coffee urn

		bodyModel[0].addBox(0F, 0F, 0F, 123, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-61.5F, 1F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[1].setRotationPoint(53.5F, 3F, 10.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[2].setRotationPoint(54.5F, 4F, 10.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[3].setRotationPoint(52.25F, 3F, 10.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[4].setRotationPoint(53F, 4F, 10.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull
		bodyModel[5].setRotationPoint(-61.5F, 4F, 10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull
		bodyModel[6].setRotationPoint(-61.5F, 3F, 10.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[7].setRotationPoint(34.75F, 3F, 10.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[8].setRotationPoint(33F, 4F, 10.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[9].setRotationPoint(-35.75F, 3F, 10.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[10].setRotationPoint(-35F, 4F, 10.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[11].setRotationPoint(-34.5F, 3F, 10.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[12].setRotationPoint(-33.5F, 4F, 10.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[13].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[14].setRotationPoint(54.5F, 4F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[15].setRotationPoint(52.25F, 3F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[16].setRotationPoint(53F, 4F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30 cull
		bodyModel[17].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31 cull
		bodyModel[18].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[19].setRotationPoint(34.75F, 3F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[20].setRotationPoint(33F, 4F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[21].setRotationPoint(-35.75F, 3F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[22].setRotationPoint(-35F, 4F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[23].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[24].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[25].setRotationPoint(59.5F, 3F, -1.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[26].setRotationPoint(56.5F, 3F, -5F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[27].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[28].setRotationPoint(-61.5F, 3F, -5F);

		bodyModel[29].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[29].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[30].setRotationPoint(43F, 4F, -1F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[31].setRotationPoint(-45F, 4F, -1F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 18, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[32].setRotationPoint(-33.5F, 4F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[33].setRotationPoint(-33.5F, 6.5F, -2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[34].setRotationPoint(-17.5F, 3F, 8.9F);
		bodyModel[34].rotateAngleX = -0.78539816F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[35].setRotationPoint(-17.51F, 3F, 8.4F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[36].setRotationPoint(-9.49F, 3F, 8.4F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[37].setRotationPoint(19.5F, 4F, 0F);
		bodyModel[37].rotateAngleX = -0.78539816F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[38].setRotationPoint(19.49F, 4F, -0.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[39].setRotationPoint(27.51F, 4F, -0.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 108, 16, 1, 0F); // Box 38
		bodyModel[40].setRotationPoint(-46.5F, -15F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 112, 16, 1, 0F); // Box 128
		bodyModel[41].setRotationPoint(-50.5F, -15F, 10F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[42].setRotationPoint(60.5F, -15F, -10F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[43].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[44].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[45].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[46].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[47].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[48].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[48].setRotationPoint(60.51F, -14F, 3F);

		bodyModel[49].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[49].setRotationPoint(-60.49F, -14F, -3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[50].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[51].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[52].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[53].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[54].setRotationPoint(63F, -14F, -5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[55].setRotationPoint(63F, -14F, 3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[56].setRotationPoint(63F, 1F, -5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[57].setRotationPoint(63F, -15F, -5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[58].setRotationPoint(-63F, -15F, -4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[59].setRotationPoint(-63F, 1F, -4F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[60].setRotationPoint(-63F, -14F, -4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[61].setRotationPoint(-63F, -14F, 3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[62].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[63].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[64].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[65].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[66].addBox(0F, 0F, 0F, 123, 1, 6, 0F); // Box 128
		bodyModel[66].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[67].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[68].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[69].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 74, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[70].setRotationPoint(-12.5F, -19F, -7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[71].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[72].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[73].setRotationPoint(-61.5F, -1.5F, -12F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[74].setRotationPoint(-61.5F, -1.5F, 11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[75].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[76].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[77].setRotationPoint(61.5F, -19F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[78].setRotationPoint(61.5F, -20F, -7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[79].setRotationPoint(61.5F, -20F, -3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[80].setRotationPoint(61.5F, -15F, 11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[81].setRotationPoint(61.5F, -15F, 9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[82].setRotationPoint(61.5F, -19F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[83].setRotationPoint(61.5F, -20F, 3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[84].setRotationPoint(63F, -15F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[85].setRotationPoint(63F, -16F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[86].setRotationPoint(63F, 1F, -10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[87].setRotationPoint(63F, -15F, 10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[88].setRotationPoint(63F, -16F, 9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[89].setRotationPoint(-63.5F, -15F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[90].setRotationPoint(-63F, -15F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[91].setRotationPoint(-63.5F, -16F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[92].setRotationPoint(-63F, -15F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[93].setRotationPoint(-63.5F, 1F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[94].setRotationPoint(-63F, -19F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[95].setRotationPoint(-63F, -20F, -7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[96].setRotationPoint(-63F, -20F, -3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[97].setRotationPoint(-63.5F, -15F, 10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[98].setRotationPoint(-63F, -15F, 11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[99].setRotationPoint(-63.5F, -16F, 9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[100].setRotationPoint(-63F, -15F, 9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[101].setRotationPoint(-63F, -19F, 7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[102].setRotationPoint(-63F, -20F, 3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[103].setRotationPoint(-61.5F, 6F, -10.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[104].setRotationPoint(-61.5F, 6F, 10.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 16, 5, 5, 0F); // Box 2
		bodyModel[105].setRotationPoint(6.5F, 3F, 5F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[106].setRotationPoint(1.5F, 3F, 9F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[107].setRotationPoint(1.5F, 3F, -10F);

		bodyModel[108].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 52
		bodyModel[108].setRotationPoint(5.5F, 3F, -10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[109].setRotationPoint(-7.5F, 3F, -8.9F);
		bodyModel[109].rotateAngleX = -0.78539816F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[110].setRotationPoint(-7.51F, 3F, -9.4F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[111].setRotationPoint(-0.49F, 3F, -9.4F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[112].setRotationPoint(46.5F, -15F, -10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 15, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[113].setRotationPoint(46.5F, -16.25F, -10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 48, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[114].setRotationPoint(-1.5F, -11F, -9.9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 97, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[115].setRotationPoint(-50.5F, -11F, 9.9F);

		bodyModel[116].addBox(0F, 0F, 0F, 8, 16, 7, 0F); // Box 38
		bodyModel[116].setRotationPoint(52.5F, -15F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[117].setRotationPoint(56F, -14.99F, -1.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 8, 16, 7, 0F); // Box 38
		bodyModel[118].setRotationPoint(52.5F, -15F, 3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[119].setRotationPoint(-57.5F, -5F, 9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[120].setRotationPoint(-57.5F, -5F, 8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[121].setRotationPoint(-56.5F, -5F, 8F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[122].setRotationPoint(-56.53F, -4F, 8.63F);
		bodyModel[122].rotateAngleY = 0.78539816F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
		bodyModel[123].setRotationPoint(-57.5F, -9F, 8F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
		bodyModel[124].setRotationPoint(-57.5F, -14F, 8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 15, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[125].setRotationPoint(46.5F, -18F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 15, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[126].setRotationPoint(46.5F, -18F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 15, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[127].setRotationPoint(46.5F, -17F, -7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -1.1F, -0.75F, 0F, -0.5F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 275
		bodyModel[128].setRotationPoint(-42.5F, -18F, 10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -1F, -0.85F, 0F, -0.5F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 276
		bodyModel[129].setRotationPoint(-42.5F, -18.5F, 8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F); // Box 128
		bodyModel[130].setRotationPoint(49F, -18.5F, 7.85F);
		bodyModel[130].rotateAngleX = 1.04283423F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.5F, 0F, -0.54F, -0.5F); // Box 128
		bodyModel[131].setRotationPoint(49F, -17.25F, 10F);
		bodyModel[131].rotateAngleX = 0.41887902F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F); // Box 204
		bodyModel[132].setRotationPoint(49F, -19.36F, -8.36F);
		bodyModel[132].rotateAngleX = -1.04283423F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, -0.5F, 0F, -0.54F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[133].setRotationPoint(49F, -17.65F, -10.92F);
		bodyModel[133].rotateAngleX = -0.41887902F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[134].setRotationPoint(-61F, -6F, -12F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[135].setRotationPoint(-61F, -6F, 11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[136].setRotationPoint(63F, -20F, -7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[137].setRotationPoint(63F, -20F, -3F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[138].setRotationPoint(63F, -16F, -4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[139].setRotationPoint(63F, -16F, 1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[140].setRotationPoint(63F, -19F, -1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[141].setRotationPoint(63F, -18.75F, -5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[142].setRotationPoint(63F, -20F, 3F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[143].setRotationPoint(63F, -18.75F, 4F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[144].setRotationPoint(63F, -19F, -10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[145].setRotationPoint(63F, -19F, 7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[146].setRotationPoint(63F, -16F, -5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[147].setRotationPoint(63F, -16F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[148].setRotationPoint(-63.5F, -20F, -7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[149].setRotationPoint(-63.5F, -20F, -3F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[150].setRotationPoint(-63.5F, -16F, -4F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[151].setRotationPoint(-63.5F, -16F, 1F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[152].setRotationPoint(-63.5F, -19F, -1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[153].setRotationPoint(-63.5F, -18.75F, -5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[154].setRotationPoint(-63.5F, -20F, 3F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[155].setRotationPoint(-63.5F, -18.75F, 4F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[156].setRotationPoint(-63.5F, -19F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[157].setRotationPoint(-63.5F, -19F, 7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[158].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[159].setRotationPoint(-63.5F, -16F, 0F);

		bodyModel[160].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 2
		bodyModel[160].setRotationPoint(-31.5F, 3F, 2F);

		bodyModel[161].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 59
		bodyModel[161].setRotationPoint(-31.5F, 3F, -10F);

		bodyModel[162].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[162].setRotationPoint(23.5F, 3F, 9F);

		bodyModel[163].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[163].setRotationPoint(11.5F, 3F, -10F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[164].setRotationPoint(-18.5F, 3F, -8.9F);
		bodyModel[164].rotateAngleX = -0.78539816F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[165].setRotationPoint(-18.51F, 3F, -9.4F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[166].setRotationPoint(-13.49F, 3F, -9.4F);

		bodyModel[167].addBox(0F, 0F, 0F, 10, 5, 5, 0F); // Box 2
		bodyModel[167].setRotationPoint(6.5F, 3F, 5F);

		bodyModel[168].addBox(0F, 0F, 0F, 3, 5, 5, 0F); // Box 2
		bodyModel[168].setRotationPoint(19.5F, 3F, 5F);

		bodyModel[169].addBox(0F, 0F, 0F, 5, 9, 6, 0F); // Box 38
		bodyModel[169].setRotationPoint(47.5F, -8F, 4F);

		bodyModel[170].addBox(0F, 0F, 0F, 5, 9, 6, 0F); // Box 38
		bodyModel[170].setRotationPoint(47.5F, -8F, -10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[171].setRotationPoint(46.5F, -6F, 2F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[172].setRotationPoint(46.5F, -15F, 4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 11, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[173].setRotationPoint(-12.5F, -16.25F, -10F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[174].setRotationPoint(-12.5F, -18F, -10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 59, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[175].setRotationPoint(-60.5F, -18F, 7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 11, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[176].setRotationPoint(-12.5F, -17F, -7F);

		bodyModel[177].addBox(0F, 0F, 0F, 74, 1, 6, 0F); // Box 128
		bodyModel[177].setRotationPoint(-12.5F, -19F, -3F);

		bodyModel[178].addBox(0F, 0F, 0F, 11, 16, 1, 0F); // Box 38
		bodyModel[178].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[179].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 128
		bodyModel[179].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[180].setRotationPoint(-61.5F, -16.25F, -10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[181].setRotationPoint(-51F, -6F, -12F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[182].setRotationPoint(-46F, -6F, -12F);

		bodyModel[183].addBox(0F, 0F, 0F, 10, 1, 6, 0F); // Box 128
		bodyModel[183].setRotationPoint(-60.5F, -19F, -3F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[184].setRotationPoint(-60.5F, -19F, -7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 10, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[185].setRotationPoint(-60.5F, -17F, -7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[186].setRotationPoint(-60.5F, -18F, -10F);

		bodyModel[187].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 128
		bodyModel[187].setRotationPoint(-60.5F, -18F, -7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[188].setRotationPoint(-60.5F, -16.25F, -10F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[189].setRotationPoint(-61.5F, -19F, -3F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[190].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[191].setRotationPoint(-61.5F, -19F, 3F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[192].setRotationPoint(-61.5F, -17F, -7F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[193].setRotationPoint(-61.5F, -18F, -10F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[194].setRotationPoint(-61.5F, -18F, 7F);

		bodyModel[195].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 128
		bodyModel[195].setRotationPoint(-61.5F, -18F, -7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[196].setRotationPoint(-55F, -6F, 11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[197].setRotationPoint(-50F, -6F, 11F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F); // Box 528
		bodyModel[198].setRotationPoint(-50.5F, -16.85F, -10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 154
		bodyModel[199].setRotationPoint(-50.49F, 3F, -11.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 155
		bodyModel[200].setRotationPoint(-48.51F, 3F, -11.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 156
		bodyModel[201].setRotationPoint(-50.5F, 4.5F, -11.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 157
		bodyModel[202].setRotationPoint(-50.5F, 6.5F, -11.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 320
		bodyModel[203].setRotationPoint(-52.49F, 3F, 10.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 321
		bodyModel[204].setRotationPoint(-50.51F, 3F, 10.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 322
		bodyModel[205].setRotationPoint(-52.5F, 4.5F, 10.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 323
		bodyModel[206].setRotationPoint(-52.5F, 6.5F, 10.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, -0.25F, 0F, 0.6F, -0.25F, 0F); // Box 193
		bodyModel[207].setRotationPoint(56.5F, -20F, -7F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.35F, -0.25F, -0.15F, 0.15F, -0.25F, -0.15F, 0F, -0.25F, -0.5F, 0.2F, -0.25F, -0.5F, 0.5F, -0.375F, 0F, 0.3F, -0.375F, 0F); // Box 194
		bodyModel[208].setRotationPoint(55.9F, -20F, -6.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 279
		bodyModel[209].setRotationPoint(-6F, -19.25F, -7F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 279
		bodyModel[210].setRotationPoint(-55.25F, -19.25F, -7F);

		bodyModel[211].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 52
		bodyModel[211].setRotationPoint(25.5F, 3F, -10F);

		bodyModel[212].addBox(0F, 0F, 0F, 116, 1, 0, 0F); // Box 38
		bodyModel[212].setRotationPoint(-60.5F, -13.5F, -11.01F);

		bodyModel[213].addBox(0F, 0F, 0F, 116, 1, 0, 0F); // Box 452
		bodyModel[213].setRotationPoint(-60.5F, -13.5F, 11.01F);

		bodyModel[214].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 38
		bodyModel[214].setRotationPoint(-47.5F, -1.5F, -11.01F);

		bodyModel[215].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 452
		bodyModel[215].setRotationPoint(-47.5F, -1.5F, 11.01F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 123, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[216].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[217].setRotationPoint(58.5F, 6F, -10.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[218].setRotationPoint(58.5F, 6F, 10.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[219].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[220].setRotationPoint(-60.5F, -19F, 3F);

		bodyModel[221].addBox(0F, 0F, 0F, 74, 1, 14, 0F); // Box 128
		bodyModel[221].setRotationPoint(-12.5F, -18F, -7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[222].setRotationPoint(-53.25F, 3F, 10.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[223].setRotationPoint(-55F, 4F, 10.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[224].setRotationPoint(-53.25F, 3F, -11F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[225].setRotationPoint(-55F, 4F, -11F);

		bodyModel[226].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 38
		bodyModel[226].setRotationPoint(-50.5F, -15F, -11F);

		bodyModel[227].addShapeBox(-4F, 0F, -1F, 4, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left side loading door
		bodyModel[227].setRotationPoint(-46.5F, -13F, -10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 190
		bodyModel[228].setRotationPoint(-59.5F, -18F, -11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 191
		bodyModel[229].setRotationPoint(-59.5F, -18.5F, -10F);

		bodyModel[230].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 128
		bodyModel[230].setRotationPoint(-54.5F, -15F, 10F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right side loading door
		bodyModel[231].setRotationPoint(-54.5F, -13F, 10F);

		bodyModel[232].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F); // Box 264
		bodyModel[232].setRotationPoint(-33F, -20.75F, -0.5F);
		bodyModel[232].rotateAngleY = -0.78539816F;

		bodyModel[233].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 264
		bodyModel[233].setRotationPoint(-33F, -21.25F, -0.5F);
		bodyModel[233].rotateAngleY = -0.78539816F;

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 264
		bodyModel[234].setRotationPoint(-34.35F, -21.75F, -0.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 264
		bodyModel[235].setRotationPoint(-34.35F, -21.25F, -0.5F);

		bodyModel[236].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F); // Box 264
		bodyModel[236].setRotationPoint(-38.5F, -20.29F, 4F);
		bodyModel[236].rotateAngleY = -0.78539816F;

		bodyModel[237].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 264
		bodyModel[237].setRotationPoint(-38.5F, -20.79F, 4F);
		bodyModel[237].rotateAngleY = -0.78539816F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 264
		bodyModel[238].setRotationPoint(-37.95F, -21.29F, 4F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 264
		bodyModel[239].setRotationPoint(-38.15F, -20.79F, 4F);

		bodyModel[240].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F); // Box 264
		bodyModel[240].setRotationPoint(-45.5F, -20.29F, 4F);
		bodyModel[240].rotateAngleY = -0.78539816F;

		bodyModel[241].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 264
		bodyModel[241].setRotationPoint(-45.5F, -20.79F, 4F);
		bodyModel[241].rotateAngleY = -0.78539816F;

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 264
		bodyModel[242].setRotationPoint(-44.95F, -21.29F, 4F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 264
		bodyModel[243].setRotationPoint(-45.15F, -20.79F, 4F);

		bodyModel[244].addBox(0F, 0F, 0F, 5, 7, 4, 0F); // Box 38
		bodyModel[244].setRotationPoint(47.5F, -15F, 6F);

		bodyModel[245].addBox(0F, 0F, 0F, 5, 5, 4, 0F); // Box 38
		bodyModel[245].setRotationPoint(47.5F, -15F, -10F);

		bodyModel[246].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[246].setRotationPoint(-2.5F, -15F, -10F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[247].setRotationPoint(-2.5F, -6F, 2F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[248].setRotationPoint(-2.5F, -15F, 4F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[249].setRotationPoint(34.5F, -3F, 4F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[250].setRotationPoint(31.5F, -3F, 4F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, -1F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[251].setRotationPoint(-1.5F, -6F, 5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,-3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[252].setRotationPoint(43.5F, -6F, 5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[253].setRotationPoint(6.5F, -3F, 4F);

		bodyModel[254].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 128
		bodyModel[254].setRotationPoint(39.5F, -3F, 9F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[255].setRotationPoint(42.5F, -3F, 4F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[256].setRotationPoint(39.5F, -3F, 4F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 361
		bodyModel[257].setRotationPoint(34.5F, -3F, -9F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 362
		bodyModel[258].setRotationPoint(31.5F, -3F, -9F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[259].setRotationPoint(-1.5F, -6F, -10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 364
		bodyModel[260].setRotationPoint(43.5F, -6F, -10F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 367
		bodyModel[261].setRotationPoint(42.5F, -3F, -9F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 368
		bodyModel[262].setRotationPoint(39.5F, -3F, -9F);

		bodyModel[263].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 369
		bodyModel[263].setRotationPoint(34F, -2F, -9F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[264].setRotationPoint(34F, -4F, -7F);

		bodyModel[265].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 373
		bodyModel[265].setRotationPoint(42F, -2F, -9F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 374
		bodyModel[266].setRotationPoint(42F, -5F, -6F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[267].setRotationPoint(42F, -4F, -6.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[268].setRotationPoint(42F, -4F, -7F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[269].setRotationPoint(31.5F, -6F, -9F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[270].setRotationPoint(39.5F, -6F, -9F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 380
		bodyModel[271].setRotationPoint(31.5F, -6F, -4.25F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 375
		bodyModel[272].setRotationPoint(42F, -4F, -4.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[273].setRotationPoint(42F, -5F, 3F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 384
		bodyModel[274].setRotationPoint(42F, -4F, 4.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[275].setRotationPoint(42F, -4F, 3.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 374
		bodyModel[276].setRotationPoint(34F, -5F, -6F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[277].setRotationPoint(34F, -4F, -6.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 375
		bodyModel[278].setRotationPoint(34F, -4F, -4.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 384
		bodyModel[279].setRotationPoint(34F, -4F, 4.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[280].setRotationPoint(34F, -4F, 3.5F);

		bodyModel[281].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 468
		bodyModel[281].setRotationPoint(39.5F, -3F, -10F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 380
		bodyModel[282].setRotationPoint(34.5F, -6F, -4.25F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 380
		bodyModel[283].setRotationPoint(39.5F, -6F, -4.25F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 380
		bodyModel[284].setRotationPoint(42.5F, -6F, -4.25F);

		bodyModel[285].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 128
		bodyModel[285].setRotationPoint(31.5F, -3F, 9F);

		bodyModel[286].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 360
		bodyModel[286].setRotationPoint(31.5F, -3F, -10F);

		bodyModel[287].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 128
		bodyModel[287].setRotationPoint(34F, -2F, 6F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[288].setRotationPoint(34F, -4F, 6F);

		bodyModel[289].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 128
		bodyModel[289].setRotationPoint(42F, -2F, 6F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[290].setRotationPoint(42F, -4F, 6F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[291].setRotationPoint(18.5F, -3F, 4F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[292].setRotationPoint(15.5F, -3F, 4F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[293].setRotationPoint(26.5F, -3F, 4F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[294].setRotationPoint(23.5F, -3F, 4F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 361
		bodyModel[295].setRotationPoint(18.5F, -3F, -9F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 362
		bodyModel[296].setRotationPoint(15.5F, -3F, -9F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 367
		bodyModel[297].setRotationPoint(26.5F, -3F, -9F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 368
		bodyModel[298].setRotationPoint(23.5F, -3F, -9F);

		bodyModel[299].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 369
		bodyModel[299].setRotationPoint(18F, -2F, -9F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[300].setRotationPoint(18F, -4F, -7F);

		bodyModel[301].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 373
		bodyModel[301].setRotationPoint(26F, -2F, -9F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 374
		bodyModel[302].setRotationPoint(26F, -5F, -6F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[303].setRotationPoint(26F, -4F, -6.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[304].setRotationPoint(26F, -4F, -7F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[305].setRotationPoint(15.5F, -6F, -9F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[306].setRotationPoint(23.5F, -6F, -9F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 380
		bodyModel[307].setRotationPoint(15.5F, -6F, -4.25F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 375
		bodyModel[308].setRotationPoint(26F, -4F, -4.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[309].setRotationPoint(26F, -5F, 3F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 384
		bodyModel[310].setRotationPoint(26F, -4F, 4.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[311].setRotationPoint(26F, -4F, 3.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 374
		bodyModel[312].setRotationPoint(18F, -5F, -6F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[313].setRotationPoint(18F, -4F, -6.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 375
		bodyModel[314].setRotationPoint(18F, -4F, -4.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[315].setRotationPoint(18F, -5F, 3F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 384
		bodyModel[316].setRotationPoint(18F, -4F, 4.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[317].setRotationPoint(18F, -4F, 3.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 380
		bodyModel[318].setRotationPoint(18.5F, -6F, -4.25F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 380
		bodyModel[319].setRotationPoint(23.5F, -6F, -4.25F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 380
		bodyModel[320].setRotationPoint(26.5F, -6F, -4.25F);

		bodyModel[321].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 128
		bodyModel[321].setRotationPoint(18F, -2F, 6F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[322].setRotationPoint(18F, -4F, 6F);

		bodyModel[323].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 128
		bodyModel[323].setRotationPoint(26F, -2F, 6F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[324].setRotationPoint(26F, -4F, 6F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[325].setRotationPoint(10.5F, -3F, 4F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[326].setRotationPoint(7.5F, -3F, 4F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 361
		bodyModel[327].setRotationPoint(10.5F, -3F, -9F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 362
		bodyModel[328].setRotationPoint(7.5F, -3F, -9F);

		bodyModel[329].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 369
		bodyModel[329].setRotationPoint(10F, -2F, -9F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[330].setRotationPoint(10F, -4F, -7F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[331].setRotationPoint(7.5F, -6F, -9F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 380
		bodyModel[332].setRotationPoint(7.5F, -6F, -4.25F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 374
		bodyModel[333].setRotationPoint(10F, -5F, -6F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[334].setRotationPoint(10F, -4F, -6.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 375
		bodyModel[335].setRotationPoint(10F, -4F, -4.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[336].setRotationPoint(10F, -5F, 3F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 384
		bodyModel[337].setRotationPoint(10F, -4F, 4.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[338].setRotationPoint(10F, -4F, 3.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 380
		bodyModel[339].setRotationPoint(10.5F, -6F, -4.25F);

		bodyModel[340].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 128
		bodyModel[340].setRotationPoint(10F, -2F, 6F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[341].setRotationPoint(10F, -4F, 6F);

		bodyModel[342].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 128
		bodyModel[342].setRotationPoint(23.5F, -3F, 9F);

		bodyModel[343].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 468
		bodyModel[343].setRotationPoint(23.5F, -3F, -10F);

		bodyModel[344].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 128
		bodyModel[344].setRotationPoint(15.5F, -3F, 9F);

		bodyModel[345].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 360
		bodyModel[345].setRotationPoint(15.5F, -3F, -10F);

		bodyModel[346].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 128
		bodyModel[346].setRotationPoint(7.5F, -3F, 9F);

		bodyModel[347].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 360
		bodyModel[347].setRotationPoint(7.5F, -3F, -10F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, -1F, -3F, 0F, -1F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 128
		bodyModel[348].setRotationPoint(38.5F, -6F, 5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[349].setRotationPoint(38.5F, -6F, -10F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, -1F, -3F, 0F, -1F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 128
		bodyModel[350].setRotationPoint(30.5F, -6F, 5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[351].setRotationPoint(30.5F, -6F, -10F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, -1F, -3F, 0F, -1F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 128
		bodyModel[352].setRotationPoint(22.5F, -6F, 5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[353].setRotationPoint(22.5F, -6F, -10F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, -1F, -3F, 0F, -1F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 128
		bodyModel[354].setRotationPoint(14.5F, -6F, 5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[355].setRotationPoint(14.5F, -6F, -10F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[356].setRotationPoint(39.5F, -6F, 1F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 128
		bodyModel[357].setRotationPoint(39.5F, -6F, 4F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[358].setRotationPoint(31.5F, -6F, 1F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 128
		bodyModel[359].setRotationPoint(31.5F, -6F, 4F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[360].setRotationPoint(23.5F, -6F, 1F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 128
		bodyModel[361].setRotationPoint(23.5F, -6F, 4F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[362].setRotationPoint(15.5F, -6F, 1F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 128
		bodyModel[363].setRotationPoint(15.5F, -6F, 4F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[364].setRotationPoint(7.5F, -6F, 1F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 128
		bodyModel[365].setRotationPoint(7.5F, -6F, 4F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[366].setRotationPoint(14.5F, -3F, 4F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[367].setRotationPoint(13.5F, -3F, 4F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[368].setRotationPoint(22.5F, -3F, 4F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[369].setRotationPoint(21.5F, -3F, 4F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[370].setRotationPoint(30.5F, -3F, 4F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[371].setRotationPoint(29.5F, -3F, 4F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[372].setRotationPoint(38.5F, -3F, 4F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[373].setRotationPoint(37.5F, -3F, 4F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[374].setRotationPoint(45.5F, -3F, 4F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 625
		bodyModel[375].setRotationPoint(14.5F, -3F, -10F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 626
		bodyModel[376].setRotationPoint(13.5F, -3F, -10F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 627
		bodyModel[377].setRotationPoint(22.5F, -3F, -10F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 628
		bodyModel[378].setRotationPoint(21.5F, -3F, -10F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 629
		bodyModel[379].setRotationPoint(30.5F, -3F, -10F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 630
		bodyModel[380].setRotationPoint(29.5F, -3F, -10F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 631
		bodyModel[381].setRotationPoint(38.5F, -3F, -10F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 632
		bodyModel[382].setRotationPoint(37.5F, -3F, -10F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 633
		bodyModel[383].setRotationPoint(45.5F, -3F, -10F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 634
		bodyModel[384].setRotationPoint(6.5F, -3F, -10F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[385].setRotationPoint(34F, -5F, 3F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[386].setRotationPoint(-1.5F, -3F, 4F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[387].setRotationPoint(2.5F, -3F, 4F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[388].setRotationPoint(-0.5F, -3F, 4F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 361
		bodyModel[389].setRotationPoint(2.5F, -3F, -9F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 362
		bodyModel[390].setRotationPoint(-0.5F, -3F, -9F);

		bodyModel[391].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 369
		bodyModel[391].setRotationPoint(2F, -2F, -9F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[392].setRotationPoint(2F, -4F, -7F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[393].setRotationPoint(-0.5F, -6F, -9F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 380
		bodyModel[394].setRotationPoint(-0.5F, -6F, -4.25F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 374
		bodyModel[395].setRotationPoint(2F, -5F, -6F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[396].setRotationPoint(2F, -4F, -6.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 375
		bodyModel[397].setRotationPoint(2F, -4F, -4.5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[398].setRotationPoint(2F, -5F, 3F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 384
		bodyModel[399].setRotationPoint(2F, -4F, 4.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[400].setRotationPoint(2F, -4F, 3.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 380
		bodyModel[401].setRotationPoint(2.5F, -6F, -4.25F);

		bodyModel[402].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 128
		bodyModel[402].setRotationPoint(2F, -2F, 6F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[403].setRotationPoint(2F, -4F, 6F);

		bodyModel[404].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 128
		bodyModel[404].setRotationPoint(-0.5F, -3F, 9F);

		bodyModel[405].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 360
		bodyModel[405].setRotationPoint(-0.5F, -3F, -10F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[406].setRotationPoint(-0.5F, -6F, 1F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 128
		bodyModel[407].setRotationPoint(-0.5F, -6F, 4F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[408].setRotationPoint(5.5F, -3F, 4F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 626
		bodyModel[409].setRotationPoint(5.5F, -3F, -10F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 634
		bodyModel[410].setRotationPoint(-1.5F, -3F, -10F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, -1F, -3F, 0F, -1F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 128
		bodyModel[411].setRotationPoint(6.5F, -6F, 5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[412].setRotationPoint(6.5F, -6F, -10F);

		bodyModel[413].addBox(0F, 0F, 0F, 1, 16, 10, 0F); // Box 38
		bodyModel[413].setRotationPoint(-12.5F, -15F, -5F);

		bodyModel[414].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 38
		bodyModel[414].setRotationPoint(-11.49F, -13F, -2.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[415].setRotationPoint(-1.5F, -18F, 7.25F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[416].setRotationPoint(-1.5F, -18F, -8.25F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 48, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[417].setRotationPoint(-1.5F, -16F, 8F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 48, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[418].setRotationPoint(-1.5F, -17F, 5.25F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 48, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[419].setRotationPoint(-1.5F, -16F, -10F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 48, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[420].setRotationPoint(-1.5F, -17F, -8.25F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 48, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[421].setRotationPoint(-1.5F, -17F, -2F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[422].setRotationPoint(-1.5F, -17F, 5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 883 glow
		bodyModel[423].setRotationPoint(-1.5F, -17F, -6F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[424].setRotationPoint(-10F, -14.99F, -1.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[425].setRotationPoint(-11.5F, -6F, -2F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[426].setRotationPoint(-11.5F, -6F, -4F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[427].setRotationPoint(-11.5F, -6F, 2F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 0, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[428].setRotationPoint(-11.5F, -15F, -10F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 16, 3, 0F,2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -1F); // Box 38
		bodyModel[429].setRotationPoint(-49.5F, -15F, 4F);

		bodyModel[430].addBox(0F, 0F, 0F, 37, 16, 1, 0F); // Box 38
		bodyModel[430].setRotationPoint(-49.5F, -15F, 5F);

		bodyModel[431].addBox(0F, 0F, 0F, 38, 2, 2, 0F); // Box 128
		bodyModel[431].setRotationPoint(-50.5F, -17F, 5F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 38, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[432].setRotationPoint(-50.5F, -19F, 5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 74, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[433].setRotationPoint(-12.5F, -19F, 3F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[434].setRotationPoint(-60.45F, -2F, 8.55F);
		bodyModel[434].rotateAngleY = -0.78539816F;

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[435].setRotationPoint(-60.1F, -1F, 8.9F);
		bodyModel[435].rotateAngleY = -0.78539816F;

		bodyModel[436].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[436].setRotationPoint(-60.45F, 0.5F, 8.55F);
		bodyModel[436].rotateAngleY = -0.78539816F;

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[437].setRotationPoint(-55.5F, -15F, 4F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[438].setRotationPoint(-60.5F, -15F, 3F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[439].setRotationPoint(-55.5F, -15F, 3F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[440].setRotationPoint(-60.5F, -15F, -4F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 6, 16, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[441].setRotationPoint(-56.5F, -15F, -10F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 16, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[442].setRotationPoint(-51.5F, -15F, -3F);

		bodyModel[443].addBox(-0.5F, 0F, 0F, 1, 16, 4, 0F); // Hallway door
		bodyModel[443].setRotationPoint(-46F, -15F, 6F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[444].setRotationPoint(-20.5F, -14.99F, 7.5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[445].setRotationPoint(-35.5F, -14.99F, 7.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[446].setRotationPoint(-56F, -14.99F, -1.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 5, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[447].setRotationPoint(-7.5F, -15F, 4F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 5, 16, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[448].setRotationPoint(-7.5F, -15F, -10F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[449].setRotationPoint(-9.5F, -15F, -10F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, -0.5F, 0F, -4F, -0.5F); // Box 38 cull
		bodyModel[450].setRotationPoint(-16F, -4F, -10F);

		bodyModel[451].addBox(0F, 0F, 0F, 28, 7, 3, 0F); // Box 38
		bodyModel[451].setRotationPoint(-46.5F, -6F, -10F);

		bodyModel[452].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Box 38
		bodyModel[452].setRotationPoint(-29.5F, -6F, -3F);

		bodyModel[453].addBox(0F, 0F, 0F, 17, 7, 4, 0F); // Box 38
		bodyModel[453].setRotationPoint(-29.5F, -6F, 1F);

		bodyModel[454].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 38
		bodyModel[454].setRotationPoint(-29.5F, -6F, -7F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 3, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[455].setRotationPoint(-15.5F, -15F, -10F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[456].setRotationPoint(-15.5F, -6F, -5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[457].setRotationPoint(-15.5F, -19F, -5F);

		bodyModel[458].addBox(0F, 0F, 0F, 13, 6, 3, 0F); // Box 38
		bodyModel[458].setRotationPoint(-25.5F, -19F, 2F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 11, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[459].setRotationPoint(-25.5F, -12.99F, 2F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[460].setRotationPoint(-15.5F, -12.99F, -5F);

		bodyModel[461].addBox(0F, 0F, 0F, 13, 2, 1, 0F); // Box 38
		bodyModel[461].setRotationPoint(-25.5F, -13F, 4F);

		bodyModel[462].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 38
		bodyModel[462].setRotationPoint(-13.5F, -13F, -5F);

		bodyModel[463].addBox(0F, 0F, 0F, 3, 5, 12, 0F); // Box 38
		bodyModel[463].setRotationPoint(-28.5F, -18F, -7F);

		bodyModel[464].addBox(0F, 0F, 0F, 3, 1, 8, 0F); // Box 38
		bodyModel[464].setRotationPoint(-28.5F, -19F, -3F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[465].setRotationPoint(-28.5F, -19F, -7F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 4, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[466].setRotationPoint(-50.5F, -13F, -10F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 25, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[467].setRotationPoint(-46.5F, -17F, -10F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 25, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[468].setRotationPoint(-46.5F, -18F, -10F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[469].setRotationPoint(-21.5F, -15F, -10F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 25, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[470].setRotationPoint(-46.5F, -12.99F, -8F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[471].setRotationPoint(-20.5F, -15F, -10F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F); // Box 528
		bodyModel[472].setRotationPoint(-21.5F, -16.85F, -10F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[473].setRotationPoint(-36.5F, -13F, -10F);

		bodyModel[474].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 38
		bodyModel[474].setRotationPoint(-28.5F, -11F, -8F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38 cull
		bodyModel[475].setRotationPoint(-28.5F, -13F, -1.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[476].setRotationPoint(-25.5F, -19F, -3F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[477].setRotationPoint(-25F, -17.25F, -3.5F);

		bodyModel[478].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 426
		bodyModel[478].setRotationPoint(-24.5F, -18.25F, -3F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[479].setRotationPoint(-20F, -17.25F, -3.5F);

		bodyModel[480].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 426
		bodyModel[480].setRotationPoint(-19.5F, -18.25F, -3F);

		bodyModel[481].addBox(0F, 0F, 0F, 2, 7, 0, 0F); // Box 38
		bodyModel[481].setRotationPoint(-14.5F, -13F, -5F);

		bodyModel[482].addBox(0F, 0F, 0F, 15, 7, 5, 0F); // Box 38
		bodyModel[482].setRotationPoint(-44.5F, -6F, 0F);

		bodyModel[483].addBox(0F, 0F, 0F, 2, 20, 4, 0F); // Box 38
		bodyModel[483].setRotationPoint(-46.5F, -19F, 1F);

		bodyModel[484].addBox(0F, 0F, 0F, 2, 7, 4, 0F); // Box 38
		bodyModel[484].setRotationPoint(-48.5F, -6F, 1F);

		bodyModel[485].addBox(0F, 0F, 0F, 2, 13, 3, 0F); // Box 38
		bodyModel[485].setRotationPoint(-48.5F, -19F, 2F);

		bodyModel[486].addBox(0F, 0F, 0F, 2, 20, 3, 0F); // Box 38
		bodyModel[486].setRotationPoint(-50.5F, -19F, 1F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[487].setRotationPoint(-50.5F, -19F, -3F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[488].setRotationPoint(-48F, -17.25F, -3.5F);

		bodyModel[489].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 426
		bodyModel[489].setRotationPoint(-47.5F, -18.25F, -3F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[490].setRotationPoint(-32F, -17.25F, -3.5F);

		bodyModel[491].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 426
		bodyModel[491].setRotationPoint(-31.5F, -18.25F, -3F);

		bodyModel[492].addShapeBox(-1F, 0F, -1F, 2, 5, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 128 coffee urn
		bodyModel[492].setRotationPoint(-28F, -11F, 1F);
		bodyModel[492].rotateAngleY = 0.78539816F;

		bodyModel[493].addBox(0F, 0F, 0F, 11, 3, 3, 0F); // Box 128
		bodyModel[493].setRotationPoint(-44.5F, -13F, 2F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[494].setRotationPoint(-44.5F, -10F, 2F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[495].setRotationPoint(-44.5F, -8.75F, 0F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[496].setRotationPoint(-34.5F, -10F, 2F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[497].setRotationPoint(-34.5F, -8.75F, 0F);

		bodyModel[498].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 38
		bodyModel[498].setRotationPoint(-32.5F, -13F, 4F);

		bodyModel[499].addShapeBox(-1F, 0F, -1F, 2, 6, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 128 coffee urn
		bodyModel[499].setRotationPoint(-38F, -19F, 3.5F);
		bodyModel[499].rotateAngleY = 0.78539816F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 100, 322, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[501] = new ModelRendererTurbo(this, 65, 358, textureX, textureY); // Box 128
		bodyModel[502] = new ModelRendererTurbo(this, 230, 158, textureX, textureY); // Box 41
		bodyModel[503] = new ModelRendererTurbo(this, 229, 156, textureX, textureY); // Box 41
		bodyModel[504] = new ModelRendererTurbo(this, 249, 156, textureX, textureY); // Box 41
		bodyModel[505] = new ModelRendererTurbo(this, 100, 3, textureX, textureY); // Box 275
		bodyModel[506] = new ModelRendererTurbo(this, 99, 8, textureX, textureY); // Box 276
		bodyModel[507] = new ModelRendererTurbo(this, 307, 78, textureX, textureY); // Box 128
		bodyModel[508] = new ModelRendererTurbo(this, 307, 97, textureX, textureY); // Box 202
		bodyModel[509] = new ModelRendererTurbo(this, 309, 84, textureX, textureY); // Box 128
		bodyModel[510] = new ModelRendererTurbo(this, 309, 103, textureX, textureY); // Box 204
		bodyModel[511] = new ModelRendererTurbo(this, 42, 278, textureX, textureY); // Box 128
		bodyModel[512] = new ModelRendererTurbo(this, 56, 325, textureX, textureY); // Box 38
		bodyModel[513] = new ModelRendererTurbo(this, 3, 285, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[514] = new ModelRendererTurbo(this, 252, 304, textureX, textureY); // Box 38
		bodyModel[515] = new ModelRendererTurbo(this, 422, 52, textureX, textureY); // Box 128
		bodyModel[516] = new ModelRendererTurbo(this, 410, 52, textureX, textureY); // Box 261
		bodyModel[517] = new ModelRendererTurbo(this, 14, 115, textureX, textureY); // Box 128
		bodyModel[518] = new ModelRendererTurbo(this, 2, 115, textureX, textureY); // Box 261

		bodyModel[500].addShapeBox(0F, 0F, 0F, 16, 5, 5, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 38 cull
		bodyModel[500].setRotationPoint(-44.5F, -19F, 0F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.24F, 0F, 0F, -0.24F, 0F, 0F, -0.24F, 0F, 0F, -0.24F, 0F); // Box 128
		bodyModel[501].setRotationPoint(-34.5F, -19F, -3.5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[502].setRotationPoint(-28.5F, 3F, 8.9F);
		bodyModel[502].rotateAngleX = -0.78539816F;

		bodyModel[503].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[503].setRotationPoint(-28.51F, 3F, 8.4F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[504].setRotationPoint(-20.49F, 3F, 8.4F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -1.1F, -0.75F, 0F, -0.5F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 275
		bodyModel[505].setRotationPoint(-35.5F, -18F, 10F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -1F, -0.85F, 0F, -0.5F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 276
		bodyModel[506].setRotationPoint(-35.5F, -18.5F, 8F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[507].setRotationPoint(61F, -6F, -12F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[508].setRotationPoint(61F, -6F, 11F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[509].setRotationPoint(57.5F, -1.5F, -12F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[510].setRotationPoint(57.5F, -1.5F, 11F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 38, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[511].setRotationPoint(-50.5F, -16.25F, 7F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[512].setRotationPoint(-50.5F, -19F, 4F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[513].setRotationPoint(-51F, -14.99F, 7.5F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[514].setRotationPoint(-12.5F, -15F, 5F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[515].setRotationPoint(63.5F, -7F, -10F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[516].setRotationPoint(63.5F, -7F, 5F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[517].setRotationPoint(-63.5F, -7F, -10F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[518].setRotationPoint(-63.5F, -7F, 5F);
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