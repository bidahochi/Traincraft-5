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

public class ModelACFGN60SeatCoach extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelACFGN60SeatCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[627];

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
		bodyModel[5] = new ModelRendererTurbo(this, 263, 148, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 260, 151, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 253, 148, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 253, 151, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 74, 151, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[10] = new ModelRendererTurbo(this, 74, 148, textureX, textureY,"cull"); // Box 2 cull
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
		bodyModel[21] = new ModelRendererTurbo(this, 263, 138, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 260, 141, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 253, 138, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 253, 141, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 74, 141, textureX, textureY,"cull"); // Box 30 cull
		bodyModel[26] = new ModelRendererTurbo(this, 74, 138, textureX, textureY,"cull"); // Box 31 cull
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
		bodyModel[38] = new ModelRendererTurbo(this, 301, 132, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 33, 117, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[43] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 158, 157, textureX, textureY); // Box 2
		bodyModel[45] = new ModelRendererTurbo(this, 159, 175, textureX, textureY); // Box 52
		bodyModel[46] = new ModelRendererTurbo(this, 74, 165, textureX, textureY); // Box 2
		bodyModel[47] = new ModelRendererTurbo(this, 74, 173, textureX, textureY); // Box 2
		bodyModel[48] = new ModelRendererTurbo(this, 77, 160, textureX, textureY); // Box 41
		bodyModel[49] = new ModelRendererTurbo(this, 74, 160, textureX, textureY); // Box 41
		bodyModel[50] = new ModelRendererTurbo(this, 96, 160, textureX, textureY); // Box 41
		bodyModel[51] = new ModelRendererTurbo(this, 208, 159, textureX, textureY); // Box 41
		bodyModel[52] = new ModelRendererTurbo(this, 208, 157, textureX, textureY); // Box 41
		bodyModel[53] = new ModelRendererTurbo(this, 228, 157, textureX, textureY); // Box 41
		bodyModel[54] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[55] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[56] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[57] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[63] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[64] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[69] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[70] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[71] = new ModelRendererTurbo(this, 434, 23, textureX, textureY); // Box 128
		bodyModel[72] = new ModelRendererTurbo(this, 434, 35, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 410, 2, textureX, textureY); // Box 128
		bodyModel[74] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[75] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 424, 1, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 445, 35, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 445, 23, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 445, 17, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 153
		bodyModel[81] = new ModelRendererTurbo(this, 20, 43, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Box 128
		bodyModel[88] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[89] = new ModelRendererTurbo(this, 17, 43, textureX, textureY); // Box 128
		bodyModel[90] = new ModelRendererTurbo(this, 3, 43, textureX, textureY); // Box 153
		bodyModel[91] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[93] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[95] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[96] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 30, 8, textureX, textureY); // Box 128
		bodyModel[98] = new ModelRendererTurbo(this, 72, 218, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 18, 8, textureX, textureY); // Box 176
		bodyModel[100] = new ModelRendererTurbo(this, 72, 196, textureX, textureY); // Box 177
		bodyModel[101] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[102] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[103] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[104] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[105] = new ModelRendererTurbo(this, 438, 1, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 492, 23, textureX, textureY); // Box 128
		bodyModel[107] = new ModelRendererTurbo(this, 460, 23, textureX, textureY); // Box 176
		bodyModel[108] = new ModelRendererTurbo(this, 459, 10, textureX, textureY); // Box 128
		bodyModel[109] = new ModelRendererTurbo(this, 52, 3, textureX, textureY); // Box 128
		bodyModel[110] = new ModelRendererTurbo(this, 72, 202, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 72, 228, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 72, 224, textureX, textureY); // Box 128
		bodyModel[113] = new ModelRendererTurbo(this, 72, 187, textureX, textureY); // Box 193
		bodyModel[114] = new ModelRendererTurbo(this, 72, 192, textureX, textureY); // Box 194
		bodyModel[115] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[116] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[117] = new ModelRendererTurbo(this, 62, 84, textureX, textureY); // Box 128
		bodyModel[118] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[119] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[120] = new ModelRendererTurbo(this, 62, 103, textureX, textureY); // Box 204
		bodyModel[121] = new ModelRendererTurbo(this, 65, 140, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[122] = new ModelRendererTurbo(this, 65, 138, textureX, textureY); // Box 31
		bodyModel[123] = new ModelRendererTurbo(this, 65, 150, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[124] = new ModelRendererTurbo(this, 65, 148, textureX, textureY); // Box 31
		bodyModel[125] = new ModelRendererTurbo(this, 5, 38, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 452, 16, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 366, 87, textureX, textureY); // Box 38
		bodyModel[128] = new ModelRendererTurbo(this, 374, 103, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 373, 97, textureX, textureY); // Box 128
		bodyModel[130] = new ModelRendererTurbo(this, 372, 91, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 370, 83, textureX, textureY); // Box 128
		bodyModel[132] = new ModelRendererTurbo(this, 366, 67, textureX, textureY); // Box 248
		bodyModel[133] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 250
		bodyModel[134] = new ModelRendererTurbo(this, 373, 72, textureX, textureY); // Box 252
		bodyModel[135] = new ModelRendererTurbo(this, 372, 77, textureX, textureY); // Box 254
		bodyModel[136] = new ModelRendererTurbo(this, 371, 86, textureX, textureY); // Box 38
		bodyModel[137] = new ModelRendererTurbo(this, 385, 110, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 392, 84, textureX, textureY); // Box 128
		bodyModel[139] = new ModelRendererTurbo(this, 384, 104, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 385, 99, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 381, 83, textureX, textureY); // Box 128
		bodyModel[142] = new ModelRendererTurbo(this, 385, 75, textureX, textureY); // Box 128
		bodyModel[143] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 247
		bodyModel[144] = new ModelRendererTurbo(this, 385, 60, textureX, textureY); // Box 249
		bodyModel[145] = new ModelRendererTurbo(this, 384, 64, textureX, textureY); // Box 251
		bodyModel[146] = new ModelRendererTurbo(this, 385, 70, textureX, textureY); // Box 253
		bodyModel[147] = new ModelRendererTurbo(this, 385, 91, textureX, textureY); // Box 255
		bodyModel[148] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[149] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[150] = new ModelRendererTurbo(this, 19, 110, textureX, textureY); // Box 128
		bodyModel[151] = new ModelRendererTurbo(this, 28, 103, textureX, textureY); // Box 128
		bodyModel[152] = new ModelRendererTurbo(this, 7, 114, textureX, textureY); // Box 128
		bodyModel[153] = new ModelRendererTurbo(this, 18, 104, textureX, textureY); // Box 128
		bodyModel[154] = new ModelRendererTurbo(this, 27, 97, textureX, textureY); // Box 128
		bodyModel[155] = new ModelRendererTurbo(this, 19, 99, textureX, textureY); // Box 128
		bodyModel[156] = new ModelRendererTurbo(this, 26, 91, textureX, textureY); // Box 128
		bodyModel[157] = new ModelRendererTurbo(this, 15, 83, textureX, textureY); // Box 128
		bodyModel[158] = new ModelRendererTurbo(this, 24, 83, textureX, textureY); // Box 128
		bodyModel[159] = new ModelRendererTurbo(this, 19, 91, textureX, textureY); // Box 128
		bodyModel[160] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[161] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[162] = new ModelRendererTurbo(this, 19, 60, textureX, textureY); // Box 249
		bodyModel[163] = new ModelRendererTurbo(this, 28, 67, textureX, textureY); // Box 250
		bodyModel[164] = new ModelRendererTurbo(this, 18, 64, textureX, textureY); // Box 251
		bodyModel[165] = new ModelRendererTurbo(this, 27, 72, textureX, textureY); // Box 252
		bodyModel[166] = new ModelRendererTurbo(this, 19, 70, textureX, textureY); // Box 253
		bodyModel[167] = new ModelRendererTurbo(this, 26, 77, textureX, textureY); // Box 254
		bodyModel[168] = new ModelRendererTurbo(this, 19, 75, textureX, textureY); // Box 255
		bodyModel[169] = new ModelRendererTurbo(this, 303, 7, textureX, textureY); // Box 275
		bodyModel[170] = new ModelRendererTurbo(this, 302, 10, textureX, textureY); // Box 276
		bodyModel[171] = new ModelRendererTurbo(this, 303, 1, textureX, textureY); // Box 275
		bodyModel[172] = new ModelRendererTurbo(this, 303, 4, textureX, textureY); // Box 275
		bodyModel[173] = new ModelRendererTurbo(this, 312, 16, textureX, textureY); // Box 259
		bodyModel[174] = new ModelRendererTurbo(this, 311, 12, textureX, textureY); // Box 260
		bodyModel[175] = new ModelRendererTurbo(this, 312, 22, textureX, textureY); // Box 261
		bodyModel[176] = new ModelRendererTurbo(this, 312, 19, textureX, textureY); // Box 262
		bodyModel[177] = new ModelRendererTurbo(this, 307, 22, textureX, textureY); // Box 260
		bodyModel[178] = new ModelRendererTurbo(this, 74, 145, textureX, textureY); // Box 128
		bodyModel[179] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 205
		bodyModel[180] = new ModelRendererTurbo(this, 82, 20, textureX, textureY); // Box 264
		bodyModel[181] = new ModelRendererTurbo(this, 82, 17, textureX, textureY); // Box 264
		bodyModel[182] = new ModelRendererTurbo(this, 82, 14, textureX, textureY); // Box 264
		bodyModel[183] = new ModelRendererTurbo(this, 82, 10, textureX, textureY); // Box 264
		bodyModel[184] = new ModelRendererTurbo(this, 82, 12, textureX, textureY); // Box 264
		bodyModel[185] = new ModelRendererTurbo(this, 290, 1, textureX, textureY); // Box 264
		bodyModel[186] = new ModelRendererTurbo(this, 291, 4, textureX, textureY); // Box 264
		bodyModel[187] = new ModelRendererTurbo(this, 291, 6, textureX, textureY); // Box 264
		bodyModel[188] = new ModelRendererTurbo(this, 158, 166, textureX, textureY); // Box 2
		bodyModel[189] = new ModelRendererTurbo(this, 185, 157, textureX, textureY); // Box 2
		bodyModel[190] = new ModelRendererTurbo(this, 185, 166, textureX, textureY); // Box 2
		bodyModel[191] = new ModelRendererTurbo(this, 144, 159, textureX, textureY); // Box 38
		bodyModel[192] = new ModelRendererTurbo(this, 134, 158, textureX, textureY); // Box 38
		bodyModel[193] = new ModelRendererTurbo(this, 139, 158, textureX, textureY); // Box 38
		bodyModel[194] = new ModelRendererTurbo(this, 153, 159, textureX, textureY); // Box 38
		bodyModel[195] = new ModelRendererTurbo(this, 108, 158, textureX, textureY); // Box 41
		bodyModel[196] = new ModelRendererTurbo(this, 121, 158, textureX, textureY); // Box 41
		bodyModel[197] = new ModelRendererTurbo(this, 117, 158, textureX, textureY); // Box 41
		bodyModel[198] = new ModelRendererTurbo(this, 130, 158, textureX, textureY); // Box 41
		bodyModel[199] = new ModelRendererTurbo(this, 122, 158, textureX, textureY); // Box 41
		bodyModel[200] = new ModelRendererTurbo(this, 109, 158, textureX, textureY); // Box 41
		bodyModel[201] = new ModelRendererTurbo(this, 125, 175, textureX, textureY); // Box 52
		bodyModel[202] = new ModelRendererTurbo(this, 191, 178, textureX, textureY); // Box 52
		bodyModel[203] = new ModelRendererTurbo(this, 182, 178, textureX, textureY); // Box 52
		bodyModel[204] = new ModelRendererTurbo(this, 116, 179, textureX, textureY); // Box 52
		bodyModel[205] = new ModelRendererTurbo(this, 99, 160, textureX, textureY); // Box 52
		bodyModel[206] = new ModelRendererTurbo(this, 150, 178, textureX, textureY); // Box 52
		bodyModel[207] = new ModelRendererTurbo(this, 103, 179, textureX, textureY); // Box 41
		bodyModel[208] = new ModelRendererTurbo(this, 112, 180, textureX, textureY); // Box 41
		bodyModel[209] = new ModelRendererTurbo(this, 104, 180, textureX, textureY); // Box 41
		bodyModel[210] = new ModelRendererTurbo(this, 95, 180, textureX, textureY); // Box 52
		bodyModel[211] = new ModelRendererTurbo(this, 83, 179, textureX, textureY); // Box 41
		bodyModel[212] = new ModelRendererTurbo(this, 92, 180, textureX, textureY); // Box 41
		bodyModel[213] = new ModelRendererTurbo(this, 84, 180, textureX, textureY); // Box 41
		bodyModel[214] = new ModelRendererTurbo(this, 74, 179, textureX, textureY); // Box 52
		bodyModel[215] = new ModelRendererTurbo(this, 202, 175, textureX, textureY); // Box 52
		bodyModel[216] = new ModelRendererTurbo(this, 227, 175, textureX, textureY); // Box 52
		bodyModel[217] = new ModelRendererTurbo(this, 304, 175, textureX, textureY); // Box 52
		bodyModel[218] = new ModelRendererTurbo(this, 253, 181, textureX, textureY); // Box 41
		bodyModel[219] = new ModelRendererTurbo(this, 252, 179, textureX, textureY); // Box 41
		bodyModel[220] = new ModelRendererTurbo(this, 274, 179, textureX, textureY); // Box 41
		bodyModel[221] = new ModelRendererTurbo(this, 286, 179, textureX, textureY); // Box 41
		bodyModel[222] = new ModelRendererTurbo(this, 295, 180, textureX, textureY); // Box 41
		bodyModel[223] = new ModelRendererTurbo(this, 287, 180, textureX, textureY); // Box 41
		bodyModel[224] = new ModelRendererTurbo(this, 277, 181, textureX, textureY); // Box 52
		bodyModel[225] = new ModelRendererTurbo(this, 299, 181, textureX, textureY); // Box 52
		bodyModel[226] = new ModelRendererTurbo(this, 322, 102, textureX, textureY); // windscreen R
		bodyModel[227] = new ModelRendererTurbo(this, 322, 78, textureX, textureY); // windscreen L
		bodyModel[228] = new ModelRendererTurbo(this, 81, 269, textureX, textureY); // Box 38
		bodyModel[229] = new ModelRendererTurbo(this, 81, 297, textureX, textureY); // Box 38
		bodyModel[230] = new ModelRendererTurbo(this, 316, 269, textureX, textureY); // Box 38
		bodyModel[231] = new ModelRendererTurbo(this, 316, 297, textureX, textureY); // Box 38
		bodyModel[232] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 38
		bodyModel[233] = new ModelRendererTurbo(this, 15, 161, textureX, textureY); // Box 38
		bodyModel[234] = new ModelRendererTurbo(this, 15, 137, textureX, textureY); // Box 276
		bodyModel[235] = new ModelRendererTurbo(this, 394, 52, textureX, textureY); // Box 38
		bodyModel[236] = new ModelRendererTurbo(this, 408, 71, textureX, textureY); // Box 38
		bodyModel[237] = new ModelRendererTurbo(this, 408, 47, textureX, textureY); // Box 276
		bodyModel[238] = new ModelRendererTurbo(this, 103, 244, textureX, textureY); // Box 38
		bodyModel[239] = new ModelRendererTurbo(this, 105, 239, textureX, textureY); // Box 38
		bodyModel[240] = new ModelRendererTurbo(this, 103, 252, textureX, textureY); // Box 275
		bodyModel[241] = new ModelRendererTurbo(this, 105, 259, textureX, textureY); // Box 276
		bodyModel[242] = new ModelRendererTurbo(this, 105, 257, textureX, textureY, "lamp"); // Box 275 glow
		bodyModel[243] = new ModelRendererTurbo(this, 105, 242, textureX, textureY, "lamp"); // Box 285 glow
		bodyModel[244] = new ModelRendererTurbo(this, 106, 262, textureX, textureY); // Box 38
		bodyModel[245] = new ModelRendererTurbo(this, 106, 233, textureX, textureY); // Box 462
		bodyModel[246] = new ModelRendererTurbo(this, 156, 249, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[247] = new ModelRendererTurbo(this, 163, 249, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[248] = new ModelRendererTurbo(this, 170, 249, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[249] = new ModelRendererTurbo(this, 177, 249, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[250] = new ModelRendererTurbo(this, 184, 249, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[251] = new ModelRendererTurbo(this, 191, 249, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[252] = new ModelRendererTurbo(this, 198, 249, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[253] = new ModelRendererTurbo(this, 205, 249, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[254] = new ModelRendererTurbo(this, 119, 276, textureX, textureY); // Right seat part
		bodyModel[255] = new ModelRendererTurbo(this, 119, 286, textureX, textureY); // Right seat part
		bodyModel[256] = new ModelRendererTurbo(this, 110, 269, textureX, textureY); // Right seat part
		bodyModel[257] = new ModelRendererTurbo(this, 99, 279, textureX, textureY); // Right seat part
		bodyModel[258] = new ModelRendererTurbo(this, 99, 269, textureX, textureY); // Right seat part
		bodyModel[259] = new ModelRendererTurbo(this, 110, 289, textureX, textureY); // Right seat part
		bodyModel[260] = new ModelRendererTurbo(this, 110, 286, textureX, textureY); // Right seat part
		bodyModel[261] = new ModelRendererTurbo(this, 110, 279, textureX, textureY); // Right seat part
		bodyModel[262] = new ModelRendererTurbo(this, 110, 276, textureX, textureY); // Right seat part
		bodyModel[263] = new ModelRendererTurbo(this, 119, 314, textureX, textureY); // Left seat part
		bodyModel[264] = new ModelRendererTurbo(this, 119, 304, textureX, textureY); // Left seat part
		bodyModel[265] = new ModelRendererTurbo(this, 110, 297, textureX, textureY); // Left seat part
		bodyModel[266] = new ModelRendererTurbo(this, 99, 297, textureX, textureY); // Left seat part
		bodyModel[267] = new ModelRendererTurbo(this, 110, 307, textureX, textureY); // Left seat part
		bodyModel[268] = new ModelRendererTurbo(this, 110, 304, textureX, textureY); // Left seat part
		bodyModel[269] = new ModelRendererTurbo(this, 110, 317, textureX, textureY); // Left seat part
		bodyModel[270] = new ModelRendererTurbo(this, 110, 314, textureX, textureY); // Left seat part
		bodyModel[271] = new ModelRendererTurbo(this, 150, 276, textureX, textureY); // Right seat part
		bodyModel[272] = new ModelRendererTurbo(this, 150, 286, textureX, textureY); // Right seat part
		bodyModel[273] = new ModelRendererTurbo(this, 141, 269, textureX, textureY); // Right seat part
		bodyModel[274] = new ModelRendererTurbo(this, 130, 269, textureX, textureY); // Right seat part
		bodyModel[275] = new ModelRendererTurbo(this, 141, 289, textureX, textureY); // Right seat part
		bodyModel[276] = new ModelRendererTurbo(this, 141, 286, textureX, textureY); // Right seat part
		bodyModel[277] = new ModelRendererTurbo(this, 141, 279, textureX, textureY); // Right seat part
		bodyModel[278] = new ModelRendererTurbo(this, 141, 276, textureX, textureY); // Right seat part
		bodyModel[279] = new ModelRendererTurbo(this, 150, 314, textureX, textureY); // Left seat part
		bodyModel[280] = new ModelRendererTurbo(this, 150, 304, textureX, textureY); // Left seat part
		bodyModel[281] = new ModelRendererTurbo(this, 141, 297, textureX, textureY); // Left seat part
		bodyModel[282] = new ModelRendererTurbo(this, 130, 297, textureX, textureY); // Left seat part
		bodyModel[283] = new ModelRendererTurbo(this, 141, 307, textureX, textureY); // Left seat part
		bodyModel[284] = new ModelRendererTurbo(this, 141, 304, textureX, textureY); // Left seat part
		bodyModel[285] = new ModelRendererTurbo(this, 141, 317, textureX, textureY); // Left seat part
		bodyModel[286] = new ModelRendererTurbo(this, 141, 314, textureX, textureY); // Left seat part
		bodyModel[287] = new ModelRendererTurbo(this, 181, 276, textureX, textureY); // Right seat part
		bodyModel[288] = new ModelRendererTurbo(this, 181, 286, textureX, textureY); // Right seat part
		bodyModel[289] = new ModelRendererTurbo(this, 161, 269, textureX, textureY); // Right seat part
		bodyModel[290] = new ModelRendererTurbo(this, 172, 289, textureX, textureY); // Right seat part
		bodyModel[291] = new ModelRendererTurbo(this, 172, 286, textureX, textureY); // Right seat part
		bodyModel[292] = new ModelRendererTurbo(this, 172, 279, textureX, textureY); // Right seat part
		bodyModel[293] = new ModelRendererTurbo(this, 172, 276, textureX, textureY); // Right seat part
		bodyModel[294] = new ModelRendererTurbo(this, 181, 314, textureX, textureY); // Left seat part
		bodyModel[295] = new ModelRendererTurbo(this, 181, 304, textureX, textureY); // Left seat part
		bodyModel[296] = new ModelRendererTurbo(this, 172, 297, textureX, textureY); // Left seat part
		bodyModel[297] = new ModelRendererTurbo(this, 161, 297, textureX, textureY); // Left seat part
		bodyModel[298] = new ModelRendererTurbo(this, 172, 307, textureX, textureY); // Left seat part
		bodyModel[299] = new ModelRendererTurbo(this, 172, 304, textureX, textureY); // Left seat part
		bodyModel[300] = new ModelRendererTurbo(this, 172, 317, textureX, textureY); // Left seat part
		bodyModel[301] = new ModelRendererTurbo(this, 172, 314, textureX, textureY); // Left seat part
		bodyModel[302] = new ModelRendererTurbo(this, 130, 279, textureX, textureY); // Right seat part
		bodyModel[303] = new ModelRendererTurbo(this, 161, 279, textureX, textureY); // Right seat part
		bodyModel[304] = new ModelRendererTurbo(this, 99, 307, textureX, textureY); // Left seat part
		bodyModel[305] = new ModelRendererTurbo(this, 130, 307, textureX, textureY); // Left seat part
		bodyModel[306] = new ModelRendererTurbo(this, 161, 307, textureX, textureY); // Left seat part
		bodyModel[307] = new ModelRendererTurbo(this, 172, 269, textureX, textureY); // Right seat part
		bodyModel[308] = new ModelRendererTurbo(this, 212, 276, textureX, textureY); // Right seat part
		bodyModel[309] = new ModelRendererTurbo(this, 212, 286, textureX, textureY); // Right seat part
		bodyModel[310] = new ModelRendererTurbo(this, 203, 269, textureX, textureY); // Right seat part
		bodyModel[311] = new ModelRendererTurbo(this, 192, 269, textureX, textureY); // Right seat part
		bodyModel[312] = new ModelRendererTurbo(this, 203, 289, textureX, textureY); // Right seat part
		bodyModel[313] = new ModelRendererTurbo(this, 203, 286, textureX, textureY); // Right seat part
		bodyModel[314] = new ModelRendererTurbo(this, 203, 279, textureX, textureY); // Right seat part
		bodyModel[315] = new ModelRendererTurbo(this, 203, 276, textureX, textureY); // Right seat part
		bodyModel[316] = new ModelRendererTurbo(this, 212, 314, textureX, textureY); // Left seat part
		bodyModel[317] = new ModelRendererTurbo(this, 212, 304, textureX, textureY); // Left seat part
		bodyModel[318] = new ModelRendererTurbo(this, 203, 297, textureX, textureY); // Left seat part
		bodyModel[319] = new ModelRendererTurbo(this, 192, 297, textureX, textureY); // Left seat part
		bodyModel[320] = new ModelRendererTurbo(this, 203, 307, textureX, textureY); // Left seat part
		bodyModel[321] = new ModelRendererTurbo(this, 203, 304, textureX, textureY); // Left seat part
		bodyModel[322] = new ModelRendererTurbo(this, 203, 317, textureX, textureY); // Left seat part
		bodyModel[323] = new ModelRendererTurbo(this, 203, 314, textureX, textureY); // Left seat part
		bodyModel[324] = new ModelRendererTurbo(this, 192, 279, textureX, textureY); // Right seat part
		bodyModel[325] = new ModelRendererTurbo(this, 192, 307, textureX, textureY); // Left seat part
		bodyModel[326] = new ModelRendererTurbo(this, 243, 276, textureX, textureY); // Right seat part
		bodyModel[327] = new ModelRendererTurbo(this, 243, 286, textureX, textureY); // Right seat part
		bodyModel[328] = new ModelRendererTurbo(this, 234, 269, textureX, textureY); // Right seat part
		bodyModel[329] = new ModelRendererTurbo(this, 223, 269, textureX, textureY); // Right seat part
		bodyModel[330] = new ModelRendererTurbo(this, 234, 289, textureX, textureY); // Right seat part
		bodyModel[331] = new ModelRendererTurbo(this, 234, 286, textureX, textureY); // Right seat part
		bodyModel[332] = new ModelRendererTurbo(this, 234, 279, textureX, textureY); // Right seat part
		bodyModel[333] = new ModelRendererTurbo(this, 234, 276, textureX, textureY); // Right seat part
		bodyModel[334] = new ModelRendererTurbo(this, 243, 314, textureX, textureY); // Left seat part
		bodyModel[335] = new ModelRendererTurbo(this, 243, 304, textureX, textureY); // Left seat part
		bodyModel[336] = new ModelRendererTurbo(this, 234, 297, textureX, textureY); // Left seat part
		bodyModel[337] = new ModelRendererTurbo(this, 223, 297, textureX, textureY); // Left seat part
		bodyModel[338] = new ModelRendererTurbo(this, 234, 307, textureX, textureY); // Left seat part
		bodyModel[339] = new ModelRendererTurbo(this, 234, 304, textureX, textureY); // Left seat part
		bodyModel[340] = new ModelRendererTurbo(this, 234, 317, textureX, textureY); // Left seat part
		bodyModel[341] = new ModelRendererTurbo(this, 234, 314, textureX, textureY); // Left seat part
		bodyModel[342] = new ModelRendererTurbo(this, 223, 279, textureX, textureY); // Right seat part
		bodyModel[343] = new ModelRendererTurbo(this, 223, 307, textureX, textureY); // Left seat part
		bodyModel[344] = new ModelRendererTurbo(this, 274, 276, textureX, textureY); // Right seat part
		bodyModel[345] = new ModelRendererTurbo(this, 274, 286, textureX, textureY); // Right seat part
		bodyModel[346] = new ModelRendererTurbo(this, 265, 269, textureX, textureY); // Right seat part
		bodyModel[347] = new ModelRendererTurbo(this, 254, 269, textureX, textureY); // Right seat part
		bodyModel[348] = new ModelRendererTurbo(this, 265, 289, textureX, textureY); // Right seat part
		bodyModel[349] = new ModelRendererTurbo(this, 265, 286, textureX, textureY); // Right seat part
		bodyModel[350] = new ModelRendererTurbo(this, 265, 279, textureX, textureY); // Right seat part
		bodyModel[351] = new ModelRendererTurbo(this, 265, 276, textureX, textureY); // Right seat part
		bodyModel[352] = new ModelRendererTurbo(this, 274, 314, textureX, textureY); // Left seat part
		bodyModel[353] = new ModelRendererTurbo(this, 274, 304, textureX, textureY); // Left seat part
		bodyModel[354] = new ModelRendererTurbo(this, 265, 297, textureX, textureY); // Left seat part
		bodyModel[355] = new ModelRendererTurbo(this, 254, 297, textureX, textureY); // Left seat part
		bodyModel[356] = new ModelRendererTurbo(this, 265, 307, textureX, textureY); // Left seat part
		bodyModel[357] = new ModelRendererTurbo(this, 265, 304, textureX, textureY); // Left seat part
		bodyModel[358] = new ModelRendererTurbo(this, 265, 317, textureX, textureY); // Left seat part
		bodyModel[359] = new ModelRendererTurbo(this, 265, 314, textureX, textureY); // Left seat part
		bodyModel[360] = new ModelRendererTurbo(this, 254, 279, textureX, textureY); // Right seat part
		bodyModel[361] = new ModelRendererTurbo(this, 254, 307, textureX, textureY); // Left seat part
		bodyModel[362] = new ModelRendererTurbo(this, 305, 276, textureX, textureY); // Right seat part
		bodyModel[363] = new ModelRendererTurbo(this, 305, 286, textureX, textureY); // Right seat part
		bodyModel[364] = new ModelRendererTurbo(this, 296, 269, textureX, textureY); // Right seat part
		bodyModel[365] = new ModelRendererTurbo(this, 285, 269, textureX, textureY); // Right seat part
		bodyModel[366] = new ModelRendererTurbo(this, 296, 289, textureX, textureY); // Right seat part
		bodyModel[367] = new ModelRendererTurbo(this, 296, 286, textureX, textureY); // Right seat part
		bodyModel[368] = new ModelRendererTurbo(this, 296, 279, textureX, textureY); // Right seat part
		bodyModel[369] = new ModelRendererTurbo(this, 296, 276, textureX, textureY); // Right seat part
		bodyModel[370] = new ModelRendererTurbo(this, 305, 314, textureX, textureY); // Left seat part
		bodyModel[371] = new ModelRendererTurbo(this, 305, 304, textureX, textureY); // Left seat part
		bodyModel[372] = new ModelRendererTurbo(this, 296, 297, textureX, textureY); // Left seat part
		bodyModel[373] = new ModelRendererTurbo(this, 285, 297, textureX, textureY); // Left seat part
		bodyModel[374] = new ModelRendererTurbo(this, 296, 307, textureX, textureY); // Left seat part
		bodyModel[375] = new ModelRendererTurbo(this, 296, 304, textureX, textureY); // Left seat part
		bodyModel[376] = new ModelRendererTurbo(this, 296, 317, textureX, textureY); // Left seat part
		bodyModel[377] = new ModelRendererTurbo(this, 296, 314, textureX, textureY); // Left seat part
		bodyModel[378] = new ModelRendererTurbo(this, 285, 279, textureX, textureY); // Right seat part
		bodyModel[379] = new ModelRendererTurbo(this, 285, 307, textureX, textureY); // Left seat part
		bodyModel[380] = new ModelRendererTurbo(this, 358, 260, textureX, textureY); // Box 38
		bodyModel[381] = new ModelRendererTurbo(this, 427, 259, textureX, textureY); // Box 38
		bodyModel[382] = new ModelRendererTurbo(this, 346, 303, textureX, textureY); // Box 38
		bodyModel[383] = new ModelRendererTurbo(this, 462, 274, textureX, textureY); // Box 38
		bodyModel[384] = new ModelRendererTurbo(this, 332, 321, textureX, textureY); // Box 38
		bodyModel[385] = new ModelRendererTurbo(this, 326, 296, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[386] = new ModelRendererTurbo(this, 77, 295, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[387] = new ModelRendererTurbo(this, 431, 238, textureX, textureY); // Box 38
		bodyModel[388] = new ModelRendererTurbo(this, 368, 303, textureX, textureY); // Box 38
		bodyModel[389] = new ModelRendererTurbo(this, 357, 303, textureX, textureY); // Box 38
		bodyModel[390] = new ModelRendererTurbo(this, 355, 307, textureX, textureY); // Box 38
		bodyModel[391] = new ModelRendererTurbo(this, 460, 299, textureX, textureY); // Box 38
		bodyModel[392] = new ModelRendererTurbo(this, 422, 212, textureX, textureY); // Box 526
		bodyModel[393] = new ModelRendererTurbo(this, 405, 193, textureX, textureY); // Box 527
		bodyModel[394] = new ModelRendererTurbo(this, 434, 202, textureX, textureY); // Box 528
		bodyModel[395] = new ModelRendererTurbo(this, 434, 227, textureX, textureY); // Box 529
		bodyModel[396] = new ModelRendererTurbo(this, 437, 205, textureX, textureY); // Box 530
		bodyModel[397] = new ModelRendererTurbo(this, 437, 230, textureX, textureY); // Box 531
		bodyModel[398] = new ModelRendererTurbo(this, 407, 210, textureX, textureY); // Box 532
		bodyModel[399] = new ModelRendererTurbo(this, 432, 208, textureX, textureY); // Box 533
		bodyModel[400] = new ModelRendererTurbo(this, 432, 233, textureX, textureY); // Box 534
		bodyModel[401] = new ModelRendererTurbo(this, 439, 220, textureX, textureY); // Box 531
		bodyModel[402] = new ModelRendererTurbo(this, 439, 216, textureX, textureY); // Box 531
		bodyModel[403] = new ModelRendererTurbo(this, 419, 283, textureX, textureY); // Box 38
		bodyModel[404] = new ModelRendererTurbo(this, 417, 274, textureX, textureY); // Box 38
		bodyModel[405] = new ModelRendererTurbo(this, 422, 274, textureX, textureY); // Box 38
		bodyModel[406] = new ModelRendererTurbo(this, 419, 246, textureX, textureY); // Box 38
		bodyModel[407] = new ModelRendererTurbo(this, 418, 255, textureX, textureY); // Box 38
		bodyModel[408] = new ModelRendererTurbo(this, 423, 255, textureX, textureY); // Box 38
		bodyModel[409] = new ModelRendererTurbo(this, 419, 264, textureX, textureY); // Box 38
		bodyModel[410] = new ModelRendererTurbo(this, 418, 243, textureX, textureY); // Box 38
		bodyModel[411] = new ModelRendererTurbo(this, 446, 262, textureX, textureY); // Box 38
		bodyModel[412] = new ModelRendererTurbo(this, 449, 267, textureX, textureY); // Box 38
		bodyModel[413] = new ModelRendererTurbo(this, 448, 271, textureX, textureY); // Box 38
		bodyModel[414] = new ModelRendererTurbo(this, 339, 257, textureX, textureY); // Conductor's scissor gate
		bodyModel[415] = new ModelRendererTurbo(this, 334, 247, textureX, textureY); // Box 38
		bodyModel[416] = new ModelRendererTurbo(this, 352, 247, textureX, textureY); // Box 38
		bodyModel[417] = new ModelRendererTurbo(this, 357, 321, textureX, textureY); // Box 38
		bodyModel[418] = new ModelRendererTurbo(this, 329, 247, textureX, textureY); // Box 264
		bodyModel[419] = new ModelRendererTurbo(this, 329, 240, textureX, textureY); // Box 38
		bodyModel[420] = new ModelRendererTurbo(this, 343, 247, textureX, textureY); // Box 128
		bodyModel[421] = new ModelRendererTurbo(this, 344, 240, textureX, textureY); // Box 128
		bodyModel[422] = new ModelRendererTurbo(this, 345, 251, textureX, textureY); // Box 128
		bodyModel[423] = new ModelRendererTurbo(this, 333, 266, textureX, textureY); // Box 38
		bodyModel[424] = new ModelRendererTurbo(this, 333, 275, textureX, textureY); // Box 38
		bodyModel[425] = new ModelRendererTurbo(this, 333, 284, textureX, textureY); // Box 38
		bodyModel[426] = new ModelRendererTurbo(this, 35, 288, textureX, textureY); // Box 38
		bodyModel[427] = new ModelRendererTurbo(this, 1, 271, textureX, textureY); // Box 38
		bodyModel[428] = new ModelRendererTurbo(this, 20, 269, textureX, textureY); // Box 38
		bodyModel[429] = new ModelRendererTurbo(this, 5, 256, textureX, textureY); // Box 38
		bodyModel[430] = new ModelRendererTurbo(this, 70, 303, textureX, textureY); // Box 38
		bodyModel[431] = new ModelRendererTurbo(this, 5, 235, textureX, textureY); // Box 38
		bodyModel[432] = new ModelRendererTurbo(this, 68, 272, textureX, textureY); // Box 38
		bodyModel[433] = new ModelRendererTurbo(this, 4, 274, textureX, textureY); // Box 38
		bodyModel[434] = new ModelRendererTurbo(this, 7, 279, textureX, textureY); // Box 38
		bodyModel[435] = new ModelRendererTurbo(this, 6, 283, textureX, textureY); // Box 38
		bodyModel[436] = new ModelRendererTurbo(this, 44, 295, textureX, textureY); // Box 38
		bodyModel[437] = new ModelRendererTurbo(this, 46, 286, textureX, textureY); // Box 38
		bodyModel[438] = new ModelRendererTurbo(this, 41, 286, textureX, textureY); // Box 38
		bodyModel[439] = new ModelRendererTurbo(this, 44, 258, textureX, textureY); // Box 38
		bodyModel[440] = new ModelRendererTurbo(this, 46, 267, textureX, textureY); // Box 38
		bodyModel[441] = new ModelRendererTurbo(this, 41, 267, textureX, textureY); // Box 38
		bodyModel[442] = new ModelRendererTurbo(this, 44, 276, textureX, textureY); // Box 38
		bodyModel[443] = new ModelRendererTurbo(this, 52, 299, textureX, textureY); // Box 38
		bodyModel[444] = new ModelRendererTurbo(this, 57, 235, textureX, textureY); // Box 38
		bodyModel[445] = new ModelRendererTurbo(this, 58, 300, textureX, textureY); // Box 38
		bodyModel[446] = new ModelRendererTurbo(this, 58, 245, textureX, textureY); // Box 128
		bodyModel[447] = new ModelRendererTurbo(this, 59, 239, textureX, textureY); // Box 128
		bodyModel[448] = new ModelRendererTurbo(this, 60, 249, textureX, textureY); // Box 128
		bodyModel[449] = new ModelRendererTurbo(this, 59, 290, textureX, textureY); // Box 128
		bodyModel[450] = new ModelRendererTurbo(this, 60, 294, textureX, textureY); // Box 128
		bodyModel[451] = new ModelRendererTurbo(this, 61, 284, textureX, textureY); // Box 128
		bodyModel[452] = new ModelRendererTurbo(this, 53, 251, textureX, textureY); // Box 527
		bodyModel[453] = new ModelRendererTurbo(this, 52, 264, textureX, textureY); // Box 528
		bodyModel[454] = new ModelRendererTurbo(this, 57, 276, textureX, textureY); // Box 529
		bodyModel[455] = new ModelRendererTurbo(this, 51, 267, textureX, textureY); // Box 530
		bodyModel[456] = new ModelRendererTurbo(this, 52, 276, textureX, textureY); // Box 531
		bodyModel[457] = new ModelRendererTurbo(this, 52, 270, textureX, textureY); // Box 532
		bodyModel[458] = new ModelRendererTurbo(this, 60, 265, textureX, textureY); // Box 533
		bodyModel[459] = new ModelRendererTurbo(this, 61, 279, textureX, textureY); // Box 534
		bodyModel[460] = new ModelRendererTurbo(this, 60, 259, textureX, textureY); // Box 528
		bodyModel[461] = new ModelRendererTurbo(this, 60, 262, textureX, textureY); // Box 528
		bodyModel[462] = new ModelRendererTurbo(this, 333, 300, textureX, textureY); // Box 515
		bodyModel[463] = new ModelRendererTurbo(this, 447, 299, textureX, textureY); // Box 38
		bodyModel[464] = new ModelRendererTurbo(this, 295, 1, textureX, textureY); // Box 275
		bodyModel[465] = new ModelRendererTurbo(this, 295, 4, textureX, textureY); // Box 275
		bodyModel[466] = new ModelRendererTurbo(this, 295, 7, textureX, textureY); // Box 275
		bodyModel[467] = new ModelRendererTurbo(this, 295, 10, textureX, textureY); // Box 275
		bodyModel[468] = new ModelRendererTurbo(this, 75, 11, textureX, textureY); // Box 549
		bodyModel[469] = new ModelRendererTurbo(this, 75, 14, textureX, textureY); // Box 550
		bodyModel[470] = new ModelRendererTurbo(this, 75, 17, textureX, textureY); // Box 551
		bodyModel[471] = new ModelRendererTurbo(this, 75, 20, textureX, textureY); // Box 552
		bodyModel[472] = new ModelRendererTurbo(this, 341, 48, textureX, textureY); // Right step part
		bodyModel[473] = new ModelRendererTurbo(this, 339, 45, textureX, textureY); // Right step part
		bodyModel[474] = new ModelRendererTurbo(this, 341, 54, textureX, textureY); // Right step part
		bodyModel[475] = new ModelRendererTurbo(this, 339, 51, textureX, textureY); // Right step part
		bodyModel[476] = new ModelRendererTurbo(this, 343, 63, textureX, textureY); // Right step part
		bodyModel[477] = new ModelRendererTurbo(this, 350, 50, textureX, textureY); // Box 142
		bodyModel[478] = new ModelRendererTurbo(this, 356, 47, textureX, textureY); // Right step part
		bodyModel[479] = new ModelRendererTurbo(this, 339, 57, textureX, textureY); // Right step part
		bodyModel[480] = new ModelRendererTurbo(this, 345, 60, textureX, textureY); // Right step part
		bodyModel[481] = new ModelRendererTurbo(this, 330, 50, textureX, textureY); // Box 142
		bodyModel[482] = new ModelRendererTurbo(this, 330, 47, textureX, textureY); // Right step part
		bodyModel[483] = new ModelRendererTurbo(this, 372, 48, textureX, textureY); // Box 550
		bodyModel[484] = new ModelRendererTurbo(this, 370, 45, textureX, textureY); // Box 551
		bodyModel[485] = new ModelRendererTurbo(this, 372, 54, textureX, textureY); // Box 552
		bodyModel[486] = new ModelRendererTurbo(this, 370, 51, textureX, textureY); // Box 553
		bodyModel[487] = new ModelRendererTurbo(this, 370, 63, textureX, textureY); // Box 554
		bodyModel[488] = new ModelRendererTurbo(this, 381, 49, textureX, textureY); // Box 555
		bodyModel[489] = new ModelRendererTurbo(this, 387, 46, textureX, textureY); // Box 556
		bodyModel[490] = new ModelRendererTurbo(this, 370, 57, textureX, textureY); // Box 557
		bodyModel[491] = new ModelRendererTurbo(this, 372, 60, textureX, textureY); // Box 558
		bodyModel[492] = new ModelRendererTurbo(this, 361, 50, textureX, textureY); // Box 559
		bodyModel[493] = new ModelRendererTurbo(this, 361, 47, textureX, textureY); // Box 560
		bodyModel[494] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[495] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[496] = new ModelRendererTurbo(this, 104, 328, textureX, textureY, "lamp"); // Box 275 glow
		bodyModel[497] = new ModelRendererTurbo(this, 104, 325, textureX, textureY, "lamp"); // Box 285 glow
		bodyModel[498] = new ModelRendererTurbo(this, 405, 280, textureX, textureY); // Box 526
		bodyModel[499] = new ModelRendererTurbo(this, 394, 268, textureX, textureY); // Box 527

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

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[5].setRotationPoint(54.5F, 3F, 10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[6].setRotationPoint(54.5F, 4F, 10.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[7].setRotationPoint(52.25F, 3F, 10.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[8].setRotationPoint(53F, 4F, 10.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull
		bodyModel[9].setRotationPoint(-61.5F, 4F, 10.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull
		bodyModel[10].setRotationPoint(-61.5F, 3F, 10.5F);

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

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[21].setRotationPoint(54.5F, 3F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[22].setRotationPoint(54.5F, 4F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[23].setRotationPoint(52.25F, 3F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[24].setRotationPoint(53F, 4F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30 cull
		bodyModel[25].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31 cull
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

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[35].setRotationPoint(53.5F, 3F, 10.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[36].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[37].setRotationPoint(60.5F, 3F, -1.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[38].setRotationPoint(56.5F, 3F, -4F);

		bodyModel[39].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[39].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[40].setRotationPoint(-60.5F, 3F, -4F);

		bodyModel[41].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[41].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[42].setRotationPoint(43F, 4F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[43].setRotationPoint(-45F, 4F, -1F);

		bodyModel[44].addBox(0F, 0F, 0F, 8, 3, 5, 0F); // Box 2
		bodyModel[44].setRotationPoint(5.5F, 3F, 5F);

		bodyModel[45].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 52
		bodyModel[45].setRotationPoint(17.5F, 3F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 18, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[46].setRotationPoint(-29.5F, 4F, -2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[47].setRotationPoint(-29.5F, 6.5F, -2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[48].setRotationPoint(-26.5F, 3F, 8.9F);
		bodyModel[48].rotateAngleX = -0.78539816F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[49].setRotationPoint(-26.51F, 3F, 8.4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[50].setRotationPoint(-19.49F, 3F, 8.4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[51].setRotationPoint(19.5F, 4F, 0F);
		bodyModel[51].rotateAngleX = -0.78539816F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[52].setRotationPoint(19.49F, 4F, -0.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[53].setRotationPoint(27.51F, 4F, -0.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[54].setRotationPoint(56.5F, 1F, -10.99F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[55].setRotationPoint(56.5F, 1F, 4.99F);

		bodyModel[56].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 38
		bodyModel[56].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[57].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 128
		bodyModel[57].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[58].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[59].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[60].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[61].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[62].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[63].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[64].setRotationPoint(55.5F, -15F, -3F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[65].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[66].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[67].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[68].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[69].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[69].setRotationPoint(55.51F, -14F, 3F);

		bodyModel[70].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[70].setRotationPoint(-60.49F, -14F, -3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[71].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[72].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[73].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[74].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[75].setRotationPoint(63F, -14F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[76].setRotationPoint(63F, -14F, 3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[77].setRotationPoint(63F, 1F, -5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[78].setRotationPoint(63F, -15F, -5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[79].setRotationPoint(63F, -16F, -5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 153
		bodyModel[80].setRotationPoint(63F, -16F, 1.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[81].setRotationPoint(-63F, -15F, -4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[82].setRotationPoint(-63F, 1F, -4F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[83].setRotationPoint(-63F, -14F, -4F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[84].setRotationPoint(-63F, -14F, 3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[85].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[86].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[87].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[88].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[89].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 153
		bodyModel[90].setRotationPoint(-63.5F, -16F, 1.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 123, 2, 6, 0F); // Box 128
		bodyModel[91].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[92].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[93].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[94].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[95].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[96].setRotationPoint(-61.5F, -17F, -7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[97].setRotationPoint(-61.5F, -18F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[98].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[99].setRotationPoint(-61.5F, -18F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[100].setRotationPoint(-61.5F, -19F, 3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[101].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[102].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[103].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[104].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[105].setRotationPoint(55.5F, -17F, -7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[106].setRotationPoint(55.5F, -18F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 176
		bodyModel[107].setRotationPoint(55.5F, -18F, 7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[108].setRotationPoint(55.5F, -16.25F, -10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[109].setRotationPoint(-61.5F, -16.25F, -10F);

		bodyModel[110].addBox(0F, 0F, 0F, 123, 1, 14, 0F); // Box 128
		bodyModel[110].setRotationPoint(-61.5F, -18F, -7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 116, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F); // Box 128
		bodyModel[111].setRotationPoint(-60.5F, -16F, -10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 116, 1, 2, 0F,0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[112].setRotationPoint(-60.5F, -18F, -9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 116, 1, 3, 0F,0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[113].setRotationPoint(-60.5F, -16F, 7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 116, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[114].setRotationPoint(-60.5F, -18F, 6.7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[115].setRotationPoint(56F, -6F, -12F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[116].setRotationPoint(61F, -6F, -12F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[117].setRotationPoint(-61.5F, -1.5F, -12F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[118].setRotationPoint(56F, -6F, 11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[119].setRotationPoint(61F, -6F, 11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[120].setRotationPoint(-61.5F, -1.5F, 11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31 cull
		bodyModel[121].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31
		bodyModel[122].setRotationPoint(-61.5F, 5F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31 cull
		bodyModel[123].setRotationPoint(-61.5F, 3F, 10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31
		bodyModel[124].setRotationPoint(-61.5F, 5F, 10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[125].setRotationPoint(-63.5F, -16F, -1.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[126].setRotationPoint(63F, -16F, -1.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[127].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[128].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[129].setRotationPoint(61.5F, -19F, -10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[130].setRotationPoint(61.5F, -20F, -7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[131].setRotationPoint(61.5F, -20F, -3F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[132].setRotationPoint(61.5F, -15F, 11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[133].setRotationPoint(61.5F, -15F, 9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[134].setRotationPoint(61.5F, -19F, 7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[135].setRotationPoint(61.5F, -20F, 3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[136].setRotationPoint(63F, -15F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[137].setRotationPoint(63F, -16F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[138].setRotationPoint(63F, 1F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[139].setRotationPoint(63F, -19F, -10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[140].setRotationPoint(63F, -19.5F, -7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[141].setRotationPoint(63F, -20F, -3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[142].setRotationPoint(63F, -20F, -5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[143].setRotationPoint(63F, -15F, 10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[144].setRotationPoint(63F, -16F, 9F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[145].setRotationPoint(63F, -19F, 7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 253
		bodyModel[146].setRotationPoint(63F, -19.5F, 5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[147].setRotationPoint(63F, -20F, 3F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[148].setRotationPoint(-63.5F, -15F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[149].setRotationPoint(-63F, -15F, -11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[150].setRotationPoint(-63.5F, -16F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[151].setRotationPoint(-63F, -15F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[152].setRotationPoint(-63.5F, 1F, -10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[153].setRotationPoint(-63.5F, -19F, -10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[154].setRotationPoint(-63F, -19F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[155].setRotationPoint(-63.5F, -19.5F, -7F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[156].setRotationPoint(-63F, -20F, -7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[157].setRotationPoint(-63.5F, -20F, -3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[158].setRotationPoint(-63F, -20F, -3F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[159].setRotationPoint(-63.5F, -20F, -5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[160].setRotationPoint(-63.5F, -15F, 10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[161].setRotationPoint(-63F, -15F, 11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[162].setRotationPoint(-63.5F, -16F, 9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[163].setRotationPoint(-63F, -15F, 9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[164].setRotationPoint(-63.5F, -19F, 7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[165].setRotationPoint(-63F, -19F, 7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 253
		bodyModel[166].setRotationPoint(-63.5F, -19.5F, 5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[167].setRotationPoint(-63F, -20F, 3F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[168].setRotationPoint(-63.5F, -20F, 3F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.16F, -0.51F, 0F, 0.16F, -0.51F); // Box 275
		bodyModel[169].setRotationPoint(56.5F, -18F, 10F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -1F, 0.16F, 0F, -1F, 0.16F, 0F, 0F, -0.45F, 0F, 0F, -0.45F); // Box 276
		bodyModel[170].setRotationPoint(56.5F, -18.25F, 8.45F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.47F, 0F, -0.25F, -0.47F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.75F, -0.47F, 0F, -0.75F, -0.47F, 0F, -0.2F, -0.29F, 0F, -0.2F, -0.29F); // Box 275
		bodyModel[171].setRotationPoint(56.5F, -16.4F, 10.02F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.38F, 0F, -0.25F, -0.38F, 0F, -0.11F, -0.38F, 0F, -0.11F, -0.38F, 0F, -0.2F, -0.62F, 0F, -0.2F, -0.62F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275
		bodyModel[172].setRotationPoint(56.5F, -16.95F, 9.87F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.16F, -0.51F, 0F, 0.16F, -0.51F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F); // Box 259
		bodyModel[173].setRotationPoint(56.5F, -18F, -11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, 0.16F, 0F, -1F, 0.16F); // Box 260
		bodyModel[174].setRotationPoint(56.5F, -18.25F, -10.45F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.25F, -0.47F, 0F, -0.25F, -0.47F, 0F, -0.2F, -0.29F, 0F, -0.2F, -0.29F, 0F, -0.75F, -0.47F, 0F, -0.75F, -0.47F); // Box 261
		bodyModel[175].setRotationPoint(56.5F, -16.4F, -11.02F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.11F, -0.38F, 0F, -0.11F, -0.38F, 0F, -0.25F, -0.38F, 0F, -0.25F, -0.38F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.2F, -0.62F, 0F, -0.2F, -0.62F); // Box 262
		bodyModel[176].setRotationPoint(56.5F, -16.95F, -10.87F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -1F, 0.3F, 0F, -1F, 0.3F); // Box 260
		bodyModel[177].setRotationPoint(36.5F, -19F, -8.3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[178].setRotationPoint(-61.5F, 6F, -10.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[179].setRotationPoint(-61.5F, 6F, 10.5F);

		bodyModel[180].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 264
		bodyModel[180].setRotationPoint(-44.5F, -19.75F, -5.85F);
		bodyModel[180].rotateAngleY = -0.78539816F;

		bodyModel[181].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F); // Box 264
		bodyModel[181].setRotationPoint(-44.5F, -20.4F, -5.85F);
		bodyModel[181].rotateAngleY = -0.78539816F;

		bodyModel[182].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 264
		bodyModel[182].setRotationPoint(-44.5F, -20.9F, -5.85F);
		bodyModel[182].rotateAngleY = -0.78539816F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 264
		bodyModel[183].setRotationPoint(-45.85F, -21.4F, -5.85F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 264
		bodyModel[184].setRotationPoint(-45.85F, -20.9F, -5.85F);

		bodyModel[185].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 264
		bodyModel[185].setRotationPoint(37.1F, -19.9F, 4.75F);
		bodyModel[185].rotateAngleY = -0.78539816F;

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 264
		bodyModel[186].setRotationPoint(36.85F, -20.5F, 4.75F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 264
		bodyModel[187].setRotationPoint(36.85F, -21.1F, 4.75F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[188].setRotationPoint(5.5F, 6F, 5F);

		bodyModel[189].addBox(0F, 0F, 0F, 6, 3, 5, 0F); // Box 2
		bodyModel[189].setRotationPoint(26.5F, 3F, 5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[190].setRotationPoint(26.5F, 6F, 5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.25F, -0.5F); // Box 38
		bodyModel[191].setRotationPoint(-6.8F, 4F, 9.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.125F, -0.5F, 0F, -0.875F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.875F, -0.5F); // Box 38
		bodyModel[192].setRotationPoint(-8.8F, 4F, 9.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[193].setRotationPoint(-7.8F, 4F, 9.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.75F, 0F, -0.25F, -1.375F, 0F, -0.25F, -1.375F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.25F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[194].setRotationPoint(-3.8F, 3.75F, 9.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[195].setRotationPoint(-7.5F, 4.2F, 5.5F);
		bodyModel[195].rotateAngleZ = -0.78539816F;

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[196].setRotationPoint(-4.3F, 4.2F, 5.5F);
		bodyModel[196].rotateAngleZ = -0.78539816F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[197].setRotationPoint(-8F, 3F, 9.49F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[198].setRotationPoint(-4.8F, 3F, 9.49F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[199].setRotationPoint(-4.8F, 3F, 5.49F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[200].setRotationPoint(-8F, 3F, 5.49F);

		bodyModel[201].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 52
		bodyModel[201].setRotationPoint(5.5F, 3F, -10F);

		bodyModel[202].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 52
		bodyModel[202].setRotationPoint(25.5F, 3F, -10F);

		bodyModel[203].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 52
		bodyModel[203].setRotationPoint(23.5F, 3F, -10F);

		bodyModel[204].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 52
		bodyModel[204].setRotationPoint(3.5F, 3F, -10F);

		bodyModel[205].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 52
		bodyModel[205].setRotationPoint(-12F, 3F, 8F);

		bodyModel[206].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 52
		bodyModel[206].setRotationPoint(12.5F, 3F, -10F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[207].setRotationPoint(-0.5F, 3.2F, -10F);
		bodyModel[207].rotateAngleZ = -0.78539816F;

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[208].setRotationPoint(-1F, 3F, -5.99F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[209].setRotationPoint(-1F, 3F, -10.01F);

		bodyModel[210].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 52
		bodyModel[210].setRotationPoint(-6.5F, 3F, -10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[211].setRotationPoint(-10.5F, 3.2F, -10F);
		bodyModel[211].rotateAngleZ = -0.78539816F;

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[212].setRotationPoint(-11F, 3F, -5.99F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[213].setRotationPoint(-11F, 3F, -10.01F);

		bodyModel[214].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 52
		bodyModel[214].setRotationPoint(-14.5F, 3F, -10F);

		bodyModel[215].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 52
		bodyModel[215].setRotationPoint(-29.5F, 3F, -10F);

		bodyModel[216].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 52
		bodyModel[216].setRotationPoint(-21.5F, 3F, -10F);

		bodyModel[217].addBox(0F, 0F, 0F, 9, 5, 5, 0F); // Box 52
		bodyModel[217].setRotationPoint(18.5F, 3F, -10F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[218].setRotationPoint(-8.5F, 3F, -8.9F);
		bodyModel[218].rotateAngleX = -0.78539816F;

		bodyModel[219].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[219].setRotationPoint(-8.51F, 3F, -9.4F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[220].setRotationPoint(0.51F, 3F, -9.4F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[221].setRotationPoint(11.5F, 3.2F, -10F);
		bodyModel[221].rotateAngleZ = -0.78539816F;

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[222].setRotationPoint(11F, 3F, -5.99F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[223].setRotationPoint(11F, 3F, -10.01F);

		bodyModel[224].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 52
		bodyModel[224].setRotationPoint(5.5F, 3F, -10F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 52
		bodyModel[225].setRotationPoint(14.5F, 3F, -10.5F);

		bodyModel[226].addShapeBox(-1F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // windscreen R
		bodyModel[226].setRotationPoint(56.5F, -14F, 11.01F);

		bodyModel[227].addShapeBox(-1F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // windscreen L
		bodyModel[227].setRotationPoint(56.5F, -14F, -11.01F);

		bodyModel[228].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[228].setRotationPoint(-42.5F, -15F, 3F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[229].setRotationPoint(-42.5F, -15F, -10F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[230].setRotationPoint(35.5F, -15F, 3F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[231].setRotationPoint(35.5F, -15F, -10F);

		bodyModel[232].addBox(0F, 0F, 0F, 19, 2, 16, 0F); // Box 38
		bodyModel[232].setRotationPoint(-60.5F, -17F, -8F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[233].setRotationPoint(-60.5F, -17F, -10F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[234].setRotationPoint(-60.5F, -17F, 8F);

		bodyModel[235].addBox(0F, 0F, 0F, 20, 2, 16, 0F); // Box 38
		bodyModel[235].setRotationPoint(35.5F, -17F, -8F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[236].setRotationPoint(35.5F, -17F, -10F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[237].setRotationPoint(35.5F, -17F, 8F);

		bodyModel[238].addBox(0F, 0F, 0F, 77, 1, 3, 0F); // Box 38
		bodyModel[238].setRotationPoint(-41.5F, -14F, 7F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 77, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[239].setRotationPoint(-41.5F, -13F, 9F);

		bodyModel[240].addBox(0F, 0F, 0F, 77, 1, 3, 0F); // Box 275
		bodyModel[240].setRotationPoint(-41.5F, -14F, -10F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 77, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[241].setRotationPoint(-41.5F, -13F, -10F);

		bodyModel[242].addBox(0F, 0F, 0F, 77, 0, 1, 0F); // Box 275 glow
		bodyModel[242].setRotationPoint(-41.5F, -12.99F, -8.5F);

		bodyModel[243].addBox(0F, 0F, 0F, 77, 0, 1, 0F); // Box 285 glow
		bodyModel[243].setRotationPoint(-41.5F, -12.99F, 7.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 91, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[244].setRotationPoint(-41.5F, -11F, -9.9F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 90, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[245].setRotationPoint(-54.5F, -11F, 9.9F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[246].setRotationPoint(-39.5F, -17F, -0.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[247].setRotationPoint(-29.5F, -17F, -0.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[248].setRotationPoint(-19.5F, -17F, -0.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[249].setRotationPoint(-9.5F, -17F, -0.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[250].setRotationPoint(0.5F, -17F, -0.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[251].setRotationPoint(10.5F, -17F, -0.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[252].setRotationPoint(20.5F, -17F, -0.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[253].setRotationPoint(30.5F, -17F, -0.5F);

		bodyModel[254].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[254].setRotationPoint(-30F, -5F, 7F);
		bodyModel[254].rotateAngleY = -3.14159265F;

		bodyModel[255].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[255].setRotationPoint(-30F, -5F, 7F);
		bodyModel[255].rotateAngleY = -3.14159265F;

		bodyModel[256].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[256].setRotationPoint(-30F, -3F, 7F);
		bodyModel[256].rotateAngleY = -3.14159265F;

		bodyModel[257].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[257].setRotationPoint(-30F, -3F, 7F);
		bodyModel[257].rotateAngleY = -3.14159265F;

		bodyModel[258].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[258].setRotationPoint(-30F, -8F, 7F);
		bodyModel[258].rotateAngleY = -3.14159265F;

		bodyModel[259].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[259].setRotationPoint(-30F, -4F, 7F);
		bodyModel[259].rotateAngleY = -3.14159265F;

		bodyModel[260].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[260].setRotationPoint(-30F, -5F, 7F);
		bodyModel[260].rotateAngleY = -3.14159265F;

		bodyModel[261].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[261].setRotationPoint(-30F, -4F, 7F);
		bodyModel[261].rotateAngleY = -3.14159265F;

		bodyModel[262].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[262].setRotationPoint(-30F, -5F, 7F);
		bodyModel[262].rotateAngleY = -3.14159265F;

		bodyModel[263].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[263].setRotationPoint(-30F, -5F, -7F);
		bodyModel[263].rotateAngleY = -3.14159265F;

		bodyModel[264].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[264].setRotationPoint(-30F, -5F, -7F);
		bodyModel[264].rotateAngleY = -3.14159265F;

		bodyModel[265].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[265].setRotationPoint(-30F, -3F, -7F);
		bodyModel[265].rotateAngleY = -3.14159265F;

		bodyModel[266].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[266].setRotationPoint(-30F, -8F, -7F);
		bodyModel[266].rotateAngleY = -3.14159265F;

		bodyModel[267].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[267].setRotationPoint(-30F, -4F, -7F);
		bodyModel[267].rotateAngleY = -3.14159265F;

		bodyModel[268].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[268].setRotationPoint(-30F, -5F, -7F);
		bodyModel[268].rotateAngleY = -3.14159265F;

		bodyModel[269].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[269].setRotationPoint(-30F, -4F, -7F);
		bodyModel[269].rotateAngleY = -3.14159265F;

		bodyModel[270].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[270].setRotationPoint(-30F, -5F, -7F);
		bodyModel[270].rotateAngleY = -3.14159265F;

		bodyModel[271].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[271].setRotationPoint(-20F, -5F, 7F);
		bodyModel[271].rotateAngleY = -3.14159265F;

		bodyModel[272].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[272].setRotationPoint(-20F, -5F, 7F);
		bodyModel[272].rotateAngleY = -3.14159265F;

		bodyModel[273].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[273].setRotationPoint(-20F, -3F, 7F);
		bodyModel[273].rotateAngleY = -3.14159265F;

		bodyModel[274].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[274].setRotationPoint(-20F, -8F, 7F);
		bodyModel[274].rotateAngleY = -3.14159265F;

		bodyModel[275].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[275].setRotationPoint(-20F, -4F, 7F);
		bodyModel[275].rotateAngleY = -3.14159265F;

		bodyModel[276].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[276].setRotationPoint(-20F, -5F, 7F);
		bodyModel[276].rotateAngleY = -3.14159265F;

		bodyModel[277].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[277].setRotationPoint(-20F, -4F, 7F);
		bodyModel[277].rotateAngleY = -3.14159265F;

		bodyModel[278].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[278].setRotationPoint(-20F, -5F, 7F);
		bodyModel[278].rotateAngleY = -3.14159265F;

		bodyModel[279].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[279].setRotationPoint(-20F, -5F, -7F);
		bodyModel[279].rotateAngleY = -3.14159265F;

		bodyModel[280].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[280].setRotationPoint(-20F, -5F, -7F);
		bodyModel[280].rotateAngleY = -3.14159265F;

		bodyModel[281].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[281].setRotationPoint(-20F, -3F, -7F);
		bodyModel[281].rotateAngleY = -3.14159265F;

		bodyModel[282].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[282].setRotationPoint(-20F, -8F, -7F);
		bodyModel[282].rotateAngleY = -3.14159265F;

		bodyModel[283].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[283].setRotationPoint(-20F, -4F, -7F);
		bodyModel[283].rotateAngleY = -3.14159265F;

		bodyModel[284].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[284].setRotationPoint(-20F, -5F, -7F);
		bodyModel[284].rotateAngleY = -3.14159265F;

		bodyModel[285].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[285].setRotationPoint(-20F, -4F, -7F);
		bodyModel[285].rotateAngleY = -3.14159265F;

		bodyModel[286].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[286].setRotationPoint(-20F, -5F, -7F);
		bodyModel[286].rotateAngleY = -3.14159265F;

		bodyModel[287].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[287].setRotationPoint(-10F, -5F, 7F);
		bodyModel[287].rotateAngleY = -3.14159265F;

		bodyModel[288].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[288].setRotationPoint(-10F, -5F, 7F);
		bodyModel[288].rotateAngleY = -3.14159265F;

		bodyModel[289].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[289].setRotationPoint(-10F, -8F, 7F);
		bodyModel[289].rotateAngleY = -3.14159265F;

		bodyModel[290].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[290].setRotationPoint(-10F, -4F, 7F);
		bodyModel[290].rotateAngleY = -3.14159265F;

		bodyModel[291].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[291].setRotationPoint(-10F, -5F, 7F);
		bodyModel[291].rotateAngleY = -3.14159265F;

		bodyModel[292].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[292].setRotationPoint(-10F, -4F, 7F);
		bodyModel[292].rotateAngleY = -3.14159265F;

		bodyModel[293].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[293].setRotationPoint(-10F, -5F, 7F);
		bodyModel[293].rotateAngleY = -3.14159265F;

		bodyModel[294].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[294].setRotationPoint(-10F, -5F, -7F);
		bodyModel[294].rotateAngleY = -3.14159265F;

		bodyModel[295].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[295].setRotationPoint(-10F, -5F, -7F);
		bodyModel[295].rotateAngleY = -3.14159265F;

		bodyModel[296].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[296].setRotationPoint(-10F, -3F, -7F);
		bodyModel[296].rotateAngleY = -3.14159265F;

		bodyModel[297].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[297].setRotationPoint(-10F, -8F, -7F);
		bodyModel[297].rotateAngleY = -3.14159265F;

		bodyModel[298].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[298].setRotationPoint(-10F, -4F, -7F);
		bodyModel[298].rotateAngleY = -3.14159265F;

		bodyModel[299].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[299].setRotationPoint(-10F, -5F, -7F);
		bodyModel[299].rotateAngleY = -3.14159265F;

		bodyModel[300].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[300].setRotationPoint(-10F, -4F, -7F);
		bodyModel[300].rotateAngleY = -3.14159265F;

		bodyModel[301].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[301].setRotationPoint(-10F, -5F, -7F);
		bodyModel[301].rotateAngleY = -3.14159265F;

		bodyModel[302].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[302].setRotationPoint(-20F, -3F, 7F);
		bodyModel[302].rotateAngleY = -3.14159265F;

		bodyModel[303].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[303].setRotationPoint(-10F, -3F, 7F);
		bodyModel[303].rotateAngleY = -3.14159265F;

		bodyModel[304].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[304].setRotationPoint(-30F, -3F, -7F);
		bodyModel[304].rotateAngleY = -3.14159265F;

		bodyModel[305].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[305].setRotationPoint(-20F, -3F, -7F);
		bodyModel[305].rotateAngleY = -3.14159265F;

		bodyModel[306].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[306].setRotationPoint(-10F, -3F, -7F);
		bodyModel[306].rotateAngleY = -3.14159265F;

		bodyModel[307].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[307].setRotationPoint(-10F, -3F, 7F);
		bodyModel[307].rotateAngleY = -3.14159265F;

		bodyModel[308].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[308].setRotationPoint(0F, -5F, 7F);
		bodyModel[308].rotateAngleY = -3.14159265F;

		bodyModel[309].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[309].setRotationPoint(0F, -5F, 7F);
		bodyModel[309].rotateAngleY = -3.14159265F;

		bodyModel[310].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[310].setRotationPoint(0F, -3F, 7F);
		bodyModel[310].rotateAngleY = -3.14159265F;

		bodyModel[311].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[311].setRotationPoint(0F, -8F, 7F);
		bodyModel[311].rotateAngleY = -3.14159265F;

		bodyModel[312].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[312].setRotationPoint(0F, -4F, 7F);
		bodyModel[312].rotateAngleY = -3.14159265F;

		bodyModel[313].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[313].setRotationPoint(0F, -5F, 7F);
		bodyModel[313].rotateAngleY = -3.14159265F;

		bodyModel[314].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[314].setRotationPoint(0F, -4F, 7F);
		bodyModel[314].rotateAngleY = -3.14159265F;

		bodyModel[315].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[315].setRotationPoint(0F, -5F, 7F);
		bodyModel[315].rotateAngleY = -3.14159265F;

		bodyModel[316].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[316].setRotationPoint(0F, -5F, -7F);
		bodyModel[316].rotateAngleY = -3.14159265F;

		bodyModel[317].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[317].setRotationPoint(0F, -5F, -7F);
		bodyModel[317].rotateAngleY = -3.14159265F;

		bodyModel[318].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[318].setRotationPoint(0F, -3F, -7F);
		bodyModel[318].rotateAngleY = -3.14159265F;

		bodyModel[319].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[319].setRotationPoint(0F, -8F, -7F);
		bodyModel[319].rotateAngleY = -3.14159265F;

		bodyModel[320].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[320].setRotationPoint(0F, -4F, -7F);
		bodyModel[320].rotateAngleY = -3.14159265F;

		bodyModel[321].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[321].setRotationPoint(0F, -5F, -7F);
		bodyModel[321].rotateAngleY = -3.14159265F;

		bodyModel[322].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[322].setRotationPoint(0F, -4F, -7F);
		bodyModel[322].rotateAngleY = -3.14159265F;

		bodyModel[323].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[323].setRotationPoint(0F, -5F, -7F);
		bodyModel[323].rotateAngleY = -3.14159265F;

		bodyModel[324].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[324].setRotationPoint(0F, -3F, 7F);
		bodyModel[324].rotateAngleY = -3.14159265F;

		bodyModel[325].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[325].setRotationPoint(0F, -3F, -7F);
		bodyModel[325].rotateAngleY = -3.14159265F;

		bodyModel[326].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[326].setRotationPoint(10F, -5F, 7F);
		bodyModel[326].rotateAngleY = -3.14159265F;

		bodyModel[327].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[327].setRotationPoint(10F, -5F, 7F);
		bodyModel[327].rotateAngleY = -3.14159265F;

		bodyModel[328].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[328].setRotationPoint(10F, -3F, 7F);
		bodyModel[328].rotateAngleY = -3.14159265F;

		bodyModel[329].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[329].setRotationPoint(10F, -8F, 7F);
		bodyModel[329].rotateAngleY = -3.14159265F;

		bodyModel[330].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[330].setRotationPoint(10F, -4F, 7F);
		bodyModel[330].rotateAngleY = -3.14159265F;

		bodyModel[331].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[331].setRotationPoint(10F, -5F, 7F);
		bodyModel[331].rotateAngleY = -3.14159265F;

		bodyModel[332].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[332].setRotationPoint(10F, -4F, 7F);
		bodyModel[332].rotateAngleY = -3.14159265F;

		bodyModel[333].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[333].setRotationPoint(10F, -5F, 7F);
		bodyModel[333].rotateAngleY = -3.14159265F;

		bodyModel[334].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[334].setRotationPoint(10F, -5F, -7F);
		bodyModel[334].rotateAngleY = -3.14159265F;

		bodyModel[335].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[335].setRotationPoint(10F, -5F, -7F);
		bodyModel[335].rotateAngleY = -3.14159265F;

		bodyModel[336].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[336].setRotationPoint(10F, -3F, -7F);
		bodyModel[336].rotateAngleY = -3.14159265F;

		bodyModel[337].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[337].setRotationPoint(10F, -8F, -7F);
		bodyModel[337].rotateAngleY = -3.14159265F;

		bodyModel[338].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[338].setRotationPoint(10F, -4F, -7F);
		bodyModel[338].rotateAngleY = -3.14159265F;

		bodyModel[339].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[339].setRotationPoint(10F, -5F, -7F);
		bodyModel[339].rotateAngleY = -3.14159265F;

		bodyModel[340].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[340].setRotationPoint(10F, -4F, -7F);
		bodyModel[340].rotateAngleY = -3.14159265F;

		bodyModel[341].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[341].setRotationPoint(10F, -5F, -7F);
		bodyModel[341].rotateAngleY = -3.14159265F;

		bodyModel[342].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[342].setRotationPoint(10F, -3F, 7F);
		bodyModel[342].rotateAngleY = -3.14159265F;

		bodyModel[343].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[343].setRotationPoint(10F, -3F, -7F);
		bodyModel[343].rotateAngleY = -3.14159265F;

		bodyModel[344].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[344].setRotationPoint(20F, -5F, 7F);
		bodyModel[344].rotateAngleY = -3.14159265F;

		bodyModel[345].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[345].setRotationPoint(20F, -5F, 7F);
		bodyModel[345].rotateAngleY = -3.14159265F;

		bodyModel[346].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[346].setRotationPoint(20F, -3F, 7F);
		bodyModel[346].rotateAngleY = -3.14159265F;

		bodyModel[347].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[347].setRotationPoint(20F, -8F, 7F);
		bodyModel[347].rotateAngleY = -3.14159265F;

		bodyModel[348].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[348].setRotationPoint(20F, -4F, 7F);
		bodyModel[348].rotateAngleY = -3.14159265F;

		bodyModel[349].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[349].setRotationPoint(20F, -5F, 7F);
		bodyModel[349].rotateAngleY = -3.14159265F;

		bodyModel[350].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[350].setRotationPoint(20F, -4F, 7F);
		bodyModel[350].rotateAngleY = -3.14159265F;

		bodyModel[351].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[351].setRotationPoint(20F, -5F, 7F);
		bodyModel[351].rotateAngleY = -3.14159265F;

		bodyModel[352].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[352].setRotationPoint(20F, -5F, -7F);
		bodyModel[352].rotateAngleY = -3.14159265F;

		bodyModel[353].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[353].setRotationPoint(20F, -5F, -7F);
		bodyModel[353].rotateAngleY = -3.14159265F;

		bodyModel[354].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[354].setRotationPoint(20F, -3F, -7F);
		bodyModel[354].rotateAngleY = -3.14159265F;

		bodyModel[355].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[355].setRotationPoint(20F, -8F, -7F);
		bodyModel[355].rotateAngleY = -3.14159265F;

		bodyModel[356].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[356].setRotationPoint(20F, -4F, -7F);
		bodyModel[356].rotateAngleY = -3.14159265F;

		bodyModel[357].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[357].setRotationPoint(20F, -5F, -7F);
		bodyModel[357].rotateAngleY = -3.14159265F;

		bodyModel[358].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[358].setRotationPoint(20F, -4F, -7F);
		bodyModel[358].rotateAngleY = -3.14159265F;

		bodyModel[359].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[359].setRotationPoint(20F, -5F, -7F);
		bodyModel[359].rotateAngleY = -3.14159265F;

		bodyModel[360].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[360].setRotationPoint(20F, -3F, 7F);
		bodyModel[360].rotateAngleY = -3.14159265F;

		bodyModel[361].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[361].setRotationPoint(20F, -3F, -7F);
		bodyModel[361].rotateAngleY = -3.14159265F;

		bodyModel[362].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[362].setRotationPoint(30F, -5F, 7F);
		bodyModel[362].rotateAngleY = -3.14159265F;

		bodyModel[363].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[363].setRotationPoint(30F, -5F, 7F);
		bodyModel[363].rotateAngleY = -3.14159265F;

		bodyModel[364].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[364].setRotationPoint(30F, -3F, 7F);
		bodyModel[364].rotateAngleY = -3.14159265F;

		bodyModel[365].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[365].setRotationPoint(30F, -8F, 7F);
		bodyModel[365].rotateAngleY = -3.14159265F;

		bodyModel[366].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[366].setRotationPoint(30F, -4F, 7F);
		bodyModel[366].rotateAngleY = -3.14159265F;

		bodyModel[367].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[367].setRotationPoint(30F, -5F, 7F);
		bodyModel[367].rotateAngleY = -3.14159265F;

		bodyModel[368].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[368].setRotationPoint(30F, -4F, 7F);
		bodyModel[368].rotateAngleY = -3.14159265F;

		bodyModel[369].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[369].setRotationPoint(30F, -5F, 7F);
		bodyModel[369].rotateAngleY = -3.14159265F;

		bodyModel[370].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[370].setRotationPoint(30F, -5F, -7F);
		bodyModel[370].rotateAngleY = -3.14159265F;

		bodyModel[371].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[371].setRotationPoint(30F, -5F, -7F);
		bodyModel[371].rotateAngleY = -3.14159265F;

		bodyModel[372].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[372].setRotationPoint(30F, -3F, -7F);
		bodyModel[372].rotateAngleY = -3.14159265F;

		bodyModel[373].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[373].setRotationPoint(30F, -8F, -7F);
		bodyModel[373].rotateAngleY = -3.14159265F;

		bodyModel[374].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[374].setRotationPoint(30F, -4F, -7F);
		bodyModel[374].rotateAngleY = -3.14159265F;

		bodyModel[375].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[375].setRotationPoint(30F, -5F, -7F);
		bodyModel[375].rotateAngleY = -3.14159265F;

		bodyModel[376].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[376].setRotationPoint(30F, -4F, -7F);
		bodyModel[376].rotateAngleY = -3.14159265F;

		bodyModel[377].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[377].setRotationPoint(30F, -5F, -7F);
		bodyModel[377].rotateAngleY = -3.14159265F;

		bodyModel[378].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[378].setRotationPoint(30F, -3F, 7F);
		bodyModel[378].rotateAngleY = -3.14159265F;

		bodyModel[379].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[379].setRotationPoint(30F, -3F, -7F);
		bodyModel[379].rotateAngleY = -3.14159265F;

		bodyModel[380].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 38
		bodyModel[380].setRotationPoint(41.5F, -15F, -6F);

		bodyModel[381].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 38
		bodyModel[381].setRotationPoint(50.5F, -15F, -6F);

		bodyModel[382].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 38
		bodyModel[382].setRotationPoint(42.5F, -15F, -6F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 38
		bodyModel[383].setRotationPoint(51.5F, -15F, 1F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 16, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[384].setRotationPoint(36.5F, -15F, -10F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 glow
		bodyModel[385].setRotationPoint(38.5F, -15F, -3F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 glow
		bodyModel[386].setRotationPoint(-45.5F, -15F, -0.5F);

		bodyModel[387].addBox(0F, 0F, 0F, 2, 16, 3, 0F); // Box 38
		bodyModel[387].setRotationPoint(42.5F, -15F, -5F);

		bodyModel[388].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 38
		bodyModel[388].setRotationPoint(48.5F, -15F, -6F);

		bodyModel[389].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 38
		bodyModel[389].setRotationPoint(45.5F, -15F, -6F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 6, 13, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[390].setRotationPoint(45.5F, -13F, -5.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[391].setRotationPoint(54.5F, -15F, -10F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[392].setRotationPoint(43.5F, -3F, -2F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[393].setRotationPoint(43F, -6F, -2F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[394].setRotationPoint(43F, -4.5F, 9.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[395].setRotationPoint(43F, -4.5F, -2F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[396].setRotationPoint(44.25F, -4.5F, 9.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[397].setRotationPoint(44.25F, -4.5F, -2.01F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[398].setRotationPoint(43F, -2.5F, -2F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 533
		bodyModel[399].setRotationPoint(42.5F, -1.5F, 9.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 534
		bodyModel[400].setRotationPoint(42.5F, -1.5F, -2F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[401].setRotationPoint(44.25F, -1.5F, 1.75F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[402].setRotationPoint(44.25F, -1.5F, 5.75F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[403].setRotationPoint(48.5F, -6F, -5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[404].setRotationPoint(48.5F, -6F, -4F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[405].setRotationPoint(49.5F, -6F, -4F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[406].setRotationPoint(48.5F, -6F, 9F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[407].setRotationPoint(48.5F, -6F, 8F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[408].setRotationPoint(49.5F, -6F, 8F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[409].setRotationPoint(49.5F, -6F, -1F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[410].setRotationPoint(46F, -3F, 8F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[411].setRotationPoint(53.57F, -2F, 6.57F);
		bodyModel[411].rotateAngleY = 0.78539816F;

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[412].setRotationPoint(53.75F, -1F, 7.45F);
		bodyModel[412].rotateAngleY = 0.78539816F;

		bodyModel[413].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[413].setRotationPoint(53.75F, 0.5F, 6.75F);
		bodyModel[413].rotateAngleY = 0.78539816F;

		bodyModel[414].addShapeBox(0F, 0F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Conductor's scissor gate
		bodyModel[414].setRotationPoint(37.5F, -5F, 3.5F);

		bodyModel[415].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 38
		bodyModel[415].setRotationPoint(36.5F, -15F, 3F);

		bodyModel[416].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 38
		bodyModel[416].setRotationPoint(40.5F, -15F, 3F);

		bodyModel[417].addBox(0F, 0F, 0F, 3, 14, 1, 0F); // Box 38
		bodyModel[417].setRotationPoint(45.5F, -13F, -6F);

		bodyModel[418].addShapeBox(-0.5F, 0F, -0.5F, 1, 16, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 264
		bodyModel[418].setRotationPoint(37.1F, -15F, 4.75F);
		bodyModel[418].rotateAngleY = -0.78539816F;

		bodyModel[419].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[419].setRotationPoint(36.5F, -5F, 5.5F);

		bodyModel[420].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 128
		bodyModel[420].setRotationPoint(38.5F, -3.5F, 6.75F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[421].setRotationPoint(40.5F, -6.5F, 6.75F);

		bodyModel[422].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 128
		bodyModel[422].setRotationPoint(39.62F, -2.5F, 7.75F);
		bodyModel[422].rotateAngleY = -0.78539816F;

		bodyModel[423].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 38
		bodyModel[423].setRotationPoint(36.5F, -12F, 3F);

		bodyModel[424].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 38
		bodyModel[424].setRotationPoint(36.5F, -8F, 3F);

		bodyModel[425].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 38
		bodyModel[425].setRotationPoint(36.5F, -4F, 3F);

		bodyModel[426].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 38
		bodyModel[426].setRotationPoint(-47.5F, -15F, -10F);

		bodyModel[427].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 38
		bodyModel[427].setRotationPoint(-56.5F, -15F, -10F);

		bodyModel[428].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 38
		bodyModel[428].setRotationPoint(-55.5F, -15F, 5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 38
		bodyModel[429].setRotationPoint(-60.5F, -15F, -4F);

		bodyModel[430].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 38
		bodyModel[430].setRotationPoint(-46.5F, -15F, -4F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[431].setRotationPoint(-60.5F, -15F, 6F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 2, 16, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[432].setRotationPoint(-44.5F, -15F, 6F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[433].setRotationPoint(-59F, -2F, -9.75F);
		bodyModel[433].rotateAngleY = 0.78539816F;

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[434].setRotationPoint(-59.35F, -1F, -9.4F);
		bodyModel[434].rotateAngleY = 0.78539816F;

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[435].setRotationPoint(-59F, 0.5F, -9.75F);
		bodyModel[435].rotateAngleY = 0.78539816F;

		bodyModel[436].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[436].setRotationPoint(-55.5F, -6F, -10F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[437].setRotationPoint(-54.5F, -6F, -9F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[438].setRotationPoint(-55.5F, -6F, -9F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[439].setRotationPoint(-55.5F, -6F, 4F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[440].setRotationPoint(-54.5F, -6F, 3F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[441].setRotationPoint(-55.5F, -6F, 3F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[442].setRotationPoint(-55.5F, -6F, -1F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[443].setRotationPoint(-53F, -3F, -10F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[444].setRotationPoint(-50.5F, -5F, 3F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[445].setRotationPoint(-50.5F, -5F, -10F);

		bodyModel[446].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 128
		bodyModel[446].setRotationPoint(-50F, -3.5F, 1.37F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[447].setRotationPoint(-50F, -6.5F, 0.86F);

		bodyModel[448].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 128
		bodyModel[448].setRotationPoint(-49F, -2.5F, 2.24F);
		bodyModel[448].rotateAngleY = -0.78539816F;

		bodyModel[449].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 128
		bodyModel[449].setRotationPoint(-50F, -3.5F, -8.37F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[450].setRotationPoint(-50F, -6.5F, -6.37F);

		bodyModel[451].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 128
		bodyModel[451].setRotationPoint(-49F, -2.5F, -7.25F);
		bodyModel[451].rotateAngleY = -0.78539816F;

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527
		bodyModel[452].setRotationPoint(-48F, -6F, -4.5F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[453].setRotationPoint(-50F, -4F, -1F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[454].setRotationPoint(-50F, -4F, -5.01F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 530
		bodyModel[455].setRotationPoint(-51F, -4F, -1F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 531
		bodyModel[456].setRotationPoint(-51F, -4F, -5.01F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[457].setRotationPoint(-51F, -3F, -4.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 533
		bodyModel[458].setRotationPoint(-48.5F, -2F, -1.5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 534
		bodyModel[459].setRotationPoint(-48.5F, -2F, -4.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[460].setRotationPoint(-48F, -3.5F, -1.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[461].setRotationPoint(-48F, -3.5F, -4.5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 2, 16, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[462].setRotationPoint(36.5F, -15F, -10F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[463].setRotationPoint(53.5F, -15F, -10F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.05F, 0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F); // Box 275
		bodyModel[464].setRotationPoint(52.5F, -17.5F, 9.85F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.36F, -0.15F, -0.25F, -0.36F, -0.15F, -0.25F, -0.35F, -0.15F, -0.17F, -0.35F, -0.15F, -0.17F); // Box 275
		bodyModel[465].setRotationPoint(52.5F, -17.5F, 9.85F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.36F, 0F, 0F, -0.36F, 0F, 0F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.31F, -0.4F, -0.35F, -0.31F, -0.4F, -0.35F, -0.31F, -0.4F, -0.34F, -0.31F, -0.4F, -0.34F); // Box 275
		bodyModel[466].setRotationPoint(52.5F, -16.65F, 10.1F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.31F, 0F, 0F, -0.31F, 0F, 0F, -0.31F, 0F, -0.69F, -0.31F, 0F, -0.69F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.6F, -0.25F, -0.3F, -0.6F); // Box 275
		bodyModel[467].setRotationPoint(52.5F, -16.05F, 10.45F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F); // Box 549
		bodyModel[468].setRotationPoint(-58.5F, -17.5F, -10.85F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.35F, -0.15F, -0.17F, -0.35F, -0.15F, -0.17F, -0.36F, -0.15F, -0.25F, -0.36F, -0.15F, -0.25F); // Box 550
		bodyModel[469].setRotationPoint(-58.5F, -17.5F, -10.85F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.36F, 0F, 0F, -0.36F, 0F, 0F, -0.31F, -0.4F, -0.34F, -0.31F, -0.4F, -0.34F, -0.31F, -0.4F, -0.35F, -0.31F, -0.4F, -0.35F); // Box 551
		bodyModel[470].setRotationPoint(-58.5F, -16.65F, -11.1F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.31F, 0F, -0.69F, -0.31F, 0F, -0.69F, -0.31F, 0F, 0F, -0.31F, 0F, 0F, -0.25F, -0.3F, -0.6F, -0.25F, -0.3F, -0.6F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F); // Box 552
		bodyModel[471].setRotationPoint(-58.5F, -16.05F, -11.45F);

		bodyModel[472].addShapeBox(0F, 2F, -2F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[472].setRotationPoint(56.51F, 0.75F, 8.5F);

		bodyModel[473].addShapeBox(0F, 2F, -2F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[473].setRotationPoint(56.5F, 0.75F, 7F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[474].setRotationPoint(56.51F, 4.5F, 8F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[475].setRotationPoint(56.51F, 4.5F, 6.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[476].setRotationPoint(56.51F, 8F, 9.5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[477].setRotationPoint(60.49F, 3F, 5F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[478].setRotationPoint(60.49F, 3F, 9.5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[479].setRotationPoint(56.51F, 6.25F, 8F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[480].setRotationPoint(56.51F, 6.25F, 9.5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[481].setRotationPoint(56.51F, 3F, 5F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[482].setRotationPoint(56.51F, 3F, 9.5F);

		bodyModel[483].addShapeBox(0F, 2F, -2F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 550
		bodyModel[483].setRotationPoint(56.51F, 0.75F, -4.5F);

		bodyModel[484].addShapeBox(0F, 2F, -2F, 4, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[484].setRotationPoint(56.5F, 0.75F, -5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 552
		bodyModel[485].setRotationPoint(56.51F, 4.5F, -8F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[486].setRotationPoint(56.51F, 4.5F, -8.5F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[487].setRotationPoint(56.51F, 8F, -11.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 555
		bodyModel[488].setRotationPoint(60.49F, 3F, -10F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[489].setRotationPoint(60.49F, 3F, -11.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[490].setRotationPoint(56.51F, 6.25F, -10F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 558
		bodyModel[491].setRotationPoint(56.51F, 6.25F, -9.5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 559
		bodyModel[492].setRotationPoint(56.51F, 3F, -10F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[493].setRotationPoint(56.51F, 3F, -11.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[494].setRotationPoint(56.5F, -14F, 10.5F);

		bodyModel[495].addShapeBox(0F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[495].setRotationPoint(56.5F, -14F, -10.5F);

		bodyModel[496].addBox(0F, 0F, 0F, 77, 0, 2, 0F); // Box 275 glow
		bodyModel[496].setRotationPoint(-41.5F, -12.99F, -9F);

		bodyModel[497].addBox(0F, 0F, 0F, 77, 0, 2, 0F); // Box 285 glow
		bodyModel[497].setRotationPoint(-41.5F, -12.99F, 7F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 526
		bodyModel[498].setRotationPoint(43.5F, -3F, -4.25F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527
		bodyModel[499].setRotationPoint(43F, -6F, -4.25F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 394, 277, textureX, textureY); // Box 528
		bodyModel[501] = new ModelRendererTurbo(this, 394, 286, textureX, textureY); // Box 529
		bodyModel[502] = new ModelRendererTurbo(this, 401, 277, textureX, textureY); // Box 530
		bodyModel[503] = new ModelRendererTurbo(this, 401, 286, textureX, textureY); // Box 531
		bodyModel[504] = new ModelRendererTurbo(this, 394, 280, textureX, textureY); // Box 532
		bodyModel[505] = new ModelRendererTurbo(this, 388, 293, textureX, textureY); // Box 533
		bodyModel[506] = new ModelRendererTurbo(this, 393, 293, textureX, textureY); // Box 534
		bodyModel[507] = new ModelRendererTurbo(this, 405, 259, textureX, textureY); // Box 526
		bodyModel[508] = new ModelRendererTurbo(this, 394, 247, textureX, textureY); // Box 527
		bodyModel[509] = new ModelRendererTurbo(this, 394, 256, textureX, textureY); // Box 528
		bodyModel[510] = new ModelRendererTurbo(this, 394, 265, textureX, textureY); // Box 529
		bodyModel[511] = new ModelRendererTurbo(this, 401, 256, textureX, textureY); // Box 530
		bodyModel[512] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 531
		bodyModel[513] = new ModelRendererTurbo(this, 394, 259, textureX, textureY); // Box 532
		bodyModel[514] = new ModelRendererTurbo(this, 389, 259, textureX, textureY); // Box 533
		bodyModel[515] = new ModelRendererTurbo(this, 389, 268, textureX, textureY); // Box 534
		bodyModel[516] = new ModelRendererTurbo(this, 405, 238, textureX, textureY); // Box 526
		bodyModel[517] = new ModelRendererTurbo(this, 394, 226, textureX, textureY); // Box 527
		bodyModel[518] = new ModelRendererTurbo(this, 394, 235, textureX, textureY); // Box 528
		bodyModel[519] = new ModelRendererTurbo(this, 394, 244, textureX, textureY); // Box 529
		bodyModel[520] = new ModelRendererTurbo(this, 401, 235, textureX, textureY); // Box 530
		bodyModel[521] = new ModelRendererTurbo(this, 401, 244, textureX, textureY); // Box 531
		bodyModel[522] = new ModelRendererTurbo(this, 394, 238, textureX, textureY); // Box 532
		bodyModel[523] = new ModelRendererTurbo(this, 389, 238, textureX, textureY); // Box 533
		bodyModel[524] = new ModelRendererTurbo(this, 389, 247, textureX, textureY); // Box 534
		bodyModel[525] = new ModelRendererTurbo(this, 329, 98, textureX, textureY); // Right step part
		bodyModel[526] = new ModelRendererTurbo(this, 329, 102, textureX, textureY); // Right step part
		bodyModel[527] = new ModelRendererTurbo(this, 322, 84, textureX, textureY); // Box 1353
		bodyModel[528] = new ModelRendererTurbo(this, 338, 84, textureX, textureY); // Box 1354
		bodyModel[529] = new ModelRendererTurbo(this, 338, 82, textureX, textureY); // Box 1357
		bodyModel[530] = new ModelRendererTurbo(this, 322, 82, textureX, textureY); // Box 1358
		bodyModel[531] = new ModelRendererTurbo(this, 338, 88, textureX, textureY); // Box 1359
		bodyModel[532] = new ModelRendererTurbo(this, 322, 88, textureX, textureY); // Box 1360
		bodyModel[533] = new ModelRendererTurbo(this, 329, 88, textureX, textureY); // Box 1355
		bodyModel[534] = new ModelRendererTurbo(this, 327, 85, textureX, textureY); // Box 1356
		bodyModel[535] = new ModelRendererTurbo(this, 329, 92, textureX, textureY); // Right step part
		bodyModel[536] = new ModelRendererTurbo(this, 327, 95, textureX, textureY); // Right step part
		bodyModel[537] = new ModelRendererTurbo(this, 327, 105, textureX, textureY); // Right step part
		bodyModel[538] = new ModelRendererTurbo(this, 324, 96, textureX, textureY); // Right step part
		bodyModel[539] = new ModelRendererTurbo(this, 338, 96, textureX, textureY); // Right step part
		bodyModel[540] = new ModelRendererTurbo(this, 324, 98, textureX, textureY); // Right step part
		bodyModel[541] = new ModelRendererTurbo(this, 338, 98, textureX, textureY); // Right step part
		bodyModel[542] = new ModelRendererTurbo(this, 322, 59, textureX, textureY); // Box 26
		bodyModel[543] = new ModelRendererTurbo(this, 338, 59, textureX, textureY); // Box 26
		bodyModel[544] = new ModelRendererTurbo(this, 338, 57, textureX, textureY); // Box 26
		bodyModel[545] = new ModelRendererTurbo(this, 322, 57, textureX, textureY); // Box 26
		bodyModel[546] = new ModelRendererTurbo(this, 338, 63, textureX, textureY); // Box 26
		bodyModel[547] = new ModelRendererTurbo(this, 322, 63, textureX, textureY); // Box 26
		bodyModel[548] = new ModelRendererTurbo(this, 329, 77, textureX, textureY); // Left step part
		bodyModel[549] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Left step part
		bodyModel[550] = new ModelRendererTurbo(this, 329, 63, textureX, textureY); // Box 26
		bodyModel[551] = new ModelRendererTurbo(this, 327, 60, textureX, textureY); // Box 26
		bodyModel[552] = new ModelRendererTurbo(this, 329, 67, textureX, textureY); // Left step part
		bodyModel[553] = new ModelRendererTurbo(this, 327, 70, textureX, textureY); // Left step part
		bodyModel[554] = new ModelRendererTurbo(this, 327, 80, textureX, textureY); // Left step part
		bodyModel[555] = new ModelRendererTurbo(this, 338, 73, textureX, textureY); // Left step part
		bodyModel[556] = new ModelRendererTurbo(this, 324, 73, textureX, textureY); // Left step part
		bodyModel[557] = new ModelRendererTurbo(this, 338, 71, textureX, textureY); // Left step part
		bodyModel[558] = new ModelRendererTurbo(this, 324, 71, textureX, textureY); // Left step part
		bodyModel[559] = new ModelRendererTurbo(this, 324, 68, textureX, textureY); // Left step part
		bodyModel[560] = new ModelRendererTurbo(this, 338, 68, textureX, textureY); // Left step part
		bodyModel[561] = new ModelRendererTurbo(this, 324, 93, textureX, textureY); // Right step part
		bodyModel[562] = new ModelRendererTurbo(this, 338, 93, textureX, textureY); // Right step part
		bodyModel[563] = new ModelRendererTurbo(this, 366, 103, textureX, textureY); // Box 128
		bodyModel[564] = new ModelRendererTurbo(this, 366, 101, textureX, textureY); // Box 261
		bodyModel[565] = new ModelRendererTurbo(this, 8, 119, textureX, textureY); // Box 128
		bodyModel[566] = new ModelRendererTurbo(this, 8, 117, textureX, textureY); // Box 261
		bodyModel[567] = new ModelRendererTurbo(this, 78, 337, textureX, textureY); // Box 38
		bodyModel[568] = new ModelRendererTurbo(this, 78, 335, textureX, textureY); // Box 452
		bodyModel[569] = new ModelRendererTurbo(this, 99, 333, textureX, textureY); // Box 38
		bodyModel[570] = new ModelRendererTurbo(this, 99, 331, textureX, textureY); // Box 452
		bodyModel[571] = new ModelRendererTurbo(this, 72, 339, textureX, textureY); // Box 128
		bodyModel[572] = new ModelRendererTurbo(this, 101, 286, textureX, textureY); // Right seat part
		bodyModel[573] = new ModelRendererTurbo(this, 106, 270, textureX, textureY); // Right seat part
		bodyModel[574] = new ModelRendererTurbo(this, 106, 298, textureX, textureY); // Left seat part
		bodyModel[575] = new ModelRendererTurbo(this, 101, 314, textureX, textureY); // Left seat part
		bodyModel[576] = new ModelRendererTurbo(this, 132, 286, textureX, textureY); // Right seat part
		bodyModel[577] = new ModelRendererTurbo(this, 137, 270, textureX, textureY); // Right seat part
		bodyModel[578] = new ModelRendererTurbo(this, 137, 298, textureX, textureY); // Left seat part
		bodyModel[579] = new ModelRendererTurbo(this, 132, 314, textureX, textureY); // Left seat part
		bodyModel[580] = new ModelRendererTurbo(this, 163, 286, textureX, textureY); // Right seat part
		bodyModel[581] = new ModelRendererTurbo(this, 168, 270, textureX, textureY); // Right seat part
		bodyModel[582] = new ModelRendererTurbo(this, 168, 298, textureX, textureY); // Left seat part
		bodyModel[583] = new ModelRendererTurbo(this, 163, 314, textureX, textureY); // Left seat part
		bodyModel[584] = new ModelRendererTurbo(this, 194, 286, textureX, textureY); // Right seat part
		bodyModel[585] = new ModelRendererTurbo(this, 199, 270, textureX, textureY); // Right seat part
		bodyModel[586] = new ModelRendererTurbo(this, 199, 298, textureX, textureY); // Left seat part
		bodyModel[587] = new ModelRendererTurbo(this, 194, 314, textureX, textureY); // Left seat part
		bodyModel[588] = new ModelRendererTurbo(this, 225, 286, textureX, textureY); // Right seat part
		bodyModel[589] = new ModelRendererTurbo(this, 230, 270, textureX, textureY); // Right seat part
		bodyModel[590] = new ModelRendererTurbo(this, 230, 298, textureX, textureY); // Left seat part
		bodyModel[591] = new ModelRendererTurbo(this, 225, 314, textureX, textureY); // Left seat part
		bodyModel[592] = new ModelRendererTurbo(this, 256, 286, textureX, textureY); // Right seat part
		bodyModel[593] = new ModelRendererTurbo(this, 261, 270, textureX, textureY); // Right seat part
		bodyModel[594] = new ModelRendererTurbo(this, 261, 298, textureX, textureY); // Left seat part
		bodyModel[595] = new ModelRendererTurbo(this, 256, 314, textureX, textureY); // Left seat part
		bodyModel[596] = new ModelRendererTurbo(this, 287, 286, textureX, textureY); // Right seat part
		bodyModel[597] = new ModelRendererTurbo(this, 292, 270, textureX, textureY); // Right seat part
		bodyModel[598] = new ModelRendererTurbo(this, 292, 298, textureX, textureY); // Left seat part
		bodyModel[599] = new ModelRendererTurbo(this, 287, 314, textureX, textureY); // Left seat part
		bodyModel[600] = new ModelRendererTurbo(this, 99, 289, textureX, textureY); // Right seat part
		bodyModel[601] = new ModelRendererTurbo(this, 99, 317, textureX, textureY); // Left seat part
		bodyModel[602] = new ModelRendererTurbo(this, 130, 289, textureX, textureY); // Right seat part
		bodyModel[603] = new ModelRendererTurbo(this, 130, 317, textureX, textureY); // Left seat part
		bodyModel[604] = new ModelRendererTurbo(this, 161, 289, textureX, textureY); // Right seat part
		bodyModel[605] = new ModelRendererTurbo(this, 161, 317, textureX, textureY); // Left seat part
		bodyModel[606] = new ModelRendererTurbo(this, 192, 289, textureX, textureY); // Right seat part
		bodyModel[607] = new ModelRendererTurbo(this, 192, 317, textureX, textureY); // Left seat part
		bodyModel[608] = new ModelRendererTurbo(this, 223, 289, textureX, textureY); // Right seat part
		bodyModel[609] = new ModelRendererTurbo(this, 223, 317, textureX, textureY); // Left seat part
		bodyModel[610] = new ModelRendererTurbo(this, 254, 289, textureX, textureY); // Right seat part
		bodyModel[611] = new ModelRendererTurbo(this, 254, 317, textureX, textureY); // Left seat part
		bodyModel[612] = new ModelRendererTurbo(this, 285, 289, textureX, textureY); // Right seat part
		bodyModel[613] = new ModelRendererTurbo(this, 285, 317, textureX, textureY); // Left seat part
		bodyModel[614] = new ModelRendererTurbo(this, 418, 240, textureX, textureY); // Box 38
		bodyModel[615] = new ModelRendererTurbo(this, 35, 241, textureX, textureY); // Box 38
		bodyModel[616] = new ModelRendererTurbo(this, 44, 250, textureX, textureY); // Box 38
		bodyModel[617] = new ModelRendererTurbo(this, 67, 294, textureX, textureY); // Box 38
		bodyModel[618] = new ModelRendererTurbo(this, 35, 254, textureX, textureY); // Box 619
		bodyModel[619] = new ModelRendererTurbo(this, 53, 288, textureX, textureY); // Box 128
		bodyModel[620] = new ModelRendererTurbo(this, 53, 293, textureX, textureY); // Box 128
		bodyModel[621] = new ModelRendererTurbo(this, 56, 282, textureX, textureY); // Box 128
		bodyModel[622] = new ModelRendererTurbo(this, 49, 245, textureX, textureY); // Box 128
		bodyModel[623] = new ModelRendererTurbo(this, 50, 240, textureX, textureY); // Box 128
		bodyModel[624] = new ModelRendererTurbo(this, 65, 249, textureX, textureY); // Box 128
		bodyModel[625] = new ModelRendererTurbo(this, 329, 293, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[626] = new ModelRendererTurbo(this, 80, 293, textureX, textureY, "lamp"); // Box 38 glow

		bodyModel[500].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[500].setRotationPoint(43F, -4.5F, -0.75F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[501].setRotationPoint(43F, -4.5F, -4.75F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[502].setRotationPoint(44.25F, -4.5F, -0.75F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[503].setRotationPoint(44.25F, -4.5F, -4.75F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[504].setRotationPoint(43F, -2.5F, -4.25F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 533
		bodyModel[505].setRotationPoint(42.5F, -4F, -0.75F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 534
		bodyModel[506].setRotationPoint(42.5F, -4F, -4.75F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 526
		bodyModel[507].setRotationPoint(43.5F, -3F, 0.75F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527
		bodyModel[508].setRotationPoint(43F, -6F, 0.75F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[509].setRotationPoint(43F, -4.5F, 4.25F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[510].setRotationPoint(43F, -4.5F, 0.25F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[511].setRotationPoint(44.25F, -4.5F, 4.25F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[512].setRotationPoint(44.25F, -4.5F, 0.25F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[513].setRotationPoint(43F, -2.5F, 0.75F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 533
		bodyModel[514].setRotationPoint(42.5F, -4F, 4.25F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 534
		bodyModel[515].setRotationPoint(42.5F, -4F, 0.25F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 526
		bodyModel[516].setRotationPoint(43.5F, -3F, 5.75F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527
		bodyModel[517].setRotationPoint(43F, -6F, 5.75F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[518].setRotationPoint(43F, -4.5F, 9.25F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[519].setRotationPoint(43F, -4.5F, 5.25F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[520].setRotationPoint(44.25F, -4.5F, 9.25F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[521].setRotationPoint(44.25F, -4.5F, 5.25F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[522].setRotationPoint(43F, -2.5F, 5.75F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 533
		bodyModel[523].setRotationPoint(42.5F, -4F, 9.25F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 534
		bodyModel[524].setRotationPoint(42.5F, -4F, 5.25F);

		bodyModel[525].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[525].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[526].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[526].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[527].setRotationPoint(56.5F, 3F, 4.5F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[528].setRotationPoint(60.5F, 3F, 4.5F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[529].setRotationPoint(60.5F, 3F, 7.5F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[530].setRotationPoint(56.5F, 3F, 7.5F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1359
		bodyModel[531].setRotationPoint(60.5F, 4F, 7.5F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1360
		bodyModel[532].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[533].setRotationPoint(56.51F, 3F, 7F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[534].setRotationPoint(56.51F, 3F, 5F);

		bodyModel[535].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[535].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[536].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[536].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[537].addShapeBox(0F, 2F, 0.5F, 4, 0, 2, 0F,0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[537].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[538].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[538].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[539].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[539].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[540].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[540].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[541].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[541].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[542].setRotationPoint(56.5F, 3F, -7.5F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[543].setRotationPoint(60.5F, 3F, -7.5F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[544].setRotationPoint(60.5F, 3F, -10.5F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[545].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[546].setRotationPoint(60.5F, 4F, -10.5F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[547].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[548].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[548].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[549].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[549].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[550].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[551].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[552].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[552].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[553].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[553].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[554].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[554].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[555].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[555].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[556].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[556].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[557].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[557].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[558].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[558].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[559].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[559].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[560].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[560].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[561].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[561].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[562].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[562].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[563].setRotationPoint(63.5F, -7F, -10F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[564].setRotationPoint(63.5F, -7F, 5F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[565].setRotationPoint(-63.5F, -7F, -10F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[566].setRotationPoint(-63.5F, -7F, 5F);

		bodyModel[567].addBox(0F, 0F, 0F, 116, 1, 0, 0F); // Box 38
		bodyModel[567].setRotationPoint(-60.5F, -13.5F, -11.01F);

		bodyModel[568].addBox(0F, 0F, 0F, 116, 1, 0, 0F); // Box 452
		bodyModel[568].setRotationPoint(-60.5F, -13.5F, 11.01F);

		bodyModel[569].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 38
		bodyModel[569].setRotationPoint(-47.5F, -1.5F, -11.01F);

		bodyModel[570].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 452
		bodyModel[570].setRotationPoint(-47.5F, -1.5F, 11.01F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 123, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[571].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[572].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[572].setRotationPoint(-30F, -5F, 7F);
		bodyModel[572].rotateAngleY = -3.14159265F;

		bodyModel[573].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[573].setRotationPoint(-30F, -5F, 7F);
		bodyModel[573].rotateAngleY = -3.14159265F;

		bodyModel[574].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[574].setRotationPoint(-30F, -5F, -7F);
		bodyModel[574].rotateAngleY = -3.14159265F;

		bodyModel[575].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[575].setRotationPoint(-30F, -5F, -7F);
		bodyModel[575].rotateAngleY = -3.14159265F;

		bodyModel[576].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[576].setRotationPoint(-20F, -5F, 7F);
		bodyModel[576].rotateAngleY = -3.14159265F;

		bodyModel[577].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[577].setRotationPoint(-20F, -5F, 7F);
		bodyModel[577].rotateAngleY = -3.14159265F;

		bodyModel[578].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[578].setRotationPoint(-20F, -5F, -7F);
		bodyModel[578].rotateAngleY = -3.14159265F;

		bodyModel[579].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[579].setRotationPoint(-20F, -5F, -7F);
		bodyModel[579].rotateAngleY = -3.14159265F;

		bodyModel[580].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[580].setRotationPoint(-10F, -5F, 7F);
		bodyModel[580].rotateAngleY = -3.14159265F;

		bodyModel[581].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[581].setRotationPoint(-10F, -5F, 7F);
		bodyModel[581].rotateAngleY = -3.14159265F;

		bodyModel[582].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[582].setRotationPoint(-10F, -5F, -7F);
		bodyModel[582].rotateAngleY = -3.14159265F;

		bodyModel[583].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[583].setRotationPoint(-10F, -5F, -7F);
		bodyModel[583].rotateAngleY = -3.14159265F;

		bodyModel[584].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[584].setRotationPoint(0F, -5F, 7F);
		bodyModel[584].rotateAngleY = -3.14159265F;

		bodyModel[585].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[585].setRotationPoint(0F, -5F, 7F);
		bodyModel[585].rotateAngleY = -3.14159265F;

		bodyModel[586].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[586].setRotationPoint(0F, -5F, -7F);
		bodyModel[586].rotateAngleY = -3.14159265F;

		bodyModel[587].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[587].setRotationPoint(0F, -5F, -7F);
		bodyModel[587].rotateAngleY = -3.14159265F;

		bodyModel[588].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[588].setRotationPoint(10F, -5F, 7F);
		bodyModel[588].rotateAngleY = -3.14159265F;

		bodyModel[589].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[589].setRotationPoint(10F, -5F, 7F);
		bodyModel[589].rotateAngleY = -3.14159265F;

		bodyModel[590].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[590].setRotationPoint(10F, -5F, -7F);
		bodyModel[590].rotateAngleY = -3.14159265F;

		bodyModel[591].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[591].setRotationPoint(10F, -5F, -7F);
		bodyModel[591].rotateAngleY = -3.14159265F;

		bodyModel[592].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[592].setRotationPoint(20F, -5F, 7F);
		bodyModel[592].rotateAngleY = -3.14159265F;

		bodyModel[593].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[593].setRotationPoint(20F, -5F, 7F);
		bodyModel[593].rotateAngleY = -3.14159265F;

		bodyModel[594].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[594].setRotationPoint(20F, -5F, -7F);
		bodyModel[594].rotateAngleY = -3.14159265F;

		bodyModel[595].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[595].setRotationPoint(20F, -5F, -7F);
		bodyModel[595].rotateAngleY = -3.14159265F;

		bodyModel[596].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[596].setRotationPoint(30F, -5F, 7F);
		bodyModel[596].rotateAngleY = -3.14159265F;

		bodyModel[597].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[597].setRotationPoint(30F, -5F, 7F);
		bodyModel[597].rotateAngleY = -3.14159265F;

		bodyModel[598].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[598].setRotationPoint(30F, -5F, -7F);
		bodyModel[598].rotateAngleY = -3.14159265F;

		bodyModel[599].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[599].setRotationPoint(30F, -5F, -7F);
		bodyModel[599].rotateAngleY = -3.14159265F;

		bodyModel[600].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[600].setRotationPoint(-30F, -3F, 7F);
		bodyModel[600].rotateAngleY = -3.14159265F;

		bodyModel[601].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[601].setRotationPoint(-30F, -3F, -7F);
		bodyModel[601].rotateAngleY = -3.14159265F;

		bodyModel[602].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[602].setRotationPoint(-20F, -3F, 7F);
		bodyModel[602].rotateAngleY = -3.14159265F;

		bodyModel[603].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[603].setRotationPoint(-20F, -3F, -7F);
		bodyModel[603].rotateAngleY = -3.14159265F;

		bodyModel[604].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[604].setRotationPoint(-10F, -3F, 7F);
		bodyModel[604].rotateAngleY = -3.14159265F;

		bodyModel[605].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[605].setRotationPoint(-10F, -3F, -7F);
		bodyModel[605].rotateAngleY = -3.14159265F;

		bodyModel[606].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[606].setRotationPoint(0F, -3F, 7F);
		bodyModel[606].rotateAngleY = -3.14159265F;

		bodyModel[607].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[607].setRotationPoint(0F, -3F, -7F);
		bodyModel[607].rotateAngleY = -3.14159265F;

		bodyModel[608].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[608].setRotationPoint(10F, -3F, 7F);
		bodyModel[608].rotateAngleY = -3.14159265F;

		bodyModel[609].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[609].setRotationPoint(10F, -3F, -7F);
		bodyModel[609].rotateAngleY = -3.14159265F;

		bodyModel[610].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[610].setRotationPoint(20F, -3F, 7F);
		bodyModel[610].rotateAngleY = -3.14159265F;

		bodyModel[611].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[611].setRotationPoint(20F, -3F, -7F);
		bodyModel[611].rotateAngleY = -3.14159265F;

		bodyModel[612].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[612].setRotationPoint(30F, -3F, 7F);
		bodyModel[612].rotateAngleY = -3.14159265F;

		bodyModel[613].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[613].setRotationPoint(30F, -3F, -7F);
		bodyModel[613].rotateAngleY = -3.14159265F;

		bodyModel[614].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[614].setRotationPoint(46F, -5F, 8F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,-2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
		bodyModel[615].setRotationPoint(-49.5F, -15F, 3F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[616].setRotationPoint(-50.5F, -5F, 2F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 38
		bodyModel[617].setRotationPoint(-50.5F, -5F, -10F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 619
		bodyModel[618].setRotationPoint(-49.5F, -15F, -10F);

		bodyModel[619].addBox(-1F, 0F, -1.12F, 2, 1, 2, 0F); // Box 128
		bodyModel[619].setRotationPoint(-50F, -3.5F, -7.5F);
		bodyModel[619].rotateAngleY = 0.78539816F;

		bodyModel[620].addShapeBox(-1F, 0F, 0.88F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 128
		bodyModel[620].setRotationPoint(-50F, -5F, -7.5F);
		bodyModel[620].rotateAngleY = 0.78539816F;

		bodyModel[621].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 128
		bodyModel[621].setRotationPoint(-50F, -2.5F, -7.5F);
		bodyModel[621].rotateAngleY = -0.78539816F;

		bodyModel[622].addBox(-1F, 0F, -1.12F, 2, 1, 2, 0F); // Box 128
		bodyModel[622].setRotationPoint(-50F, -3.5F, 2.5F);
		bodyModel[622].rotateAngleY = 2.35619449F;

		bodyModel[623].addShapeBox(-1F, 0F, 0.88F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 128
		bodyModel[623].setRotationPoint(-50F, -5F, 2.5F);
		bodyModel[623].rotateAngleY = 2.35619449F;

		bodyModel[624].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 128
		bodyModel[624].setRotationPoint(-50F, -2.5F, 2.5F);
		bodyModel[624].rotateAngleY = -0.78539816F;

		bodyModel[625].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[625].setRotationPoint(38.5F, -15F, -0.5F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[626].setRotationPoint(-45.5F, -15F, -0.5F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 627; i++)
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
		if(GetColor(entity)==16 || GetColor(entity)==17 || GetColor(entity)==18 || GetColor(entity)==19){
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