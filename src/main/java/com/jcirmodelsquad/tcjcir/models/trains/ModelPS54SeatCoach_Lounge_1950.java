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

public class ModelPS54SeatCoach_Lounge_1950 extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPS54SeatCoach_Lounge_1950() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[521];

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
		bodyModel[3] = new ModelRendererTurbo(this, 275, 148, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 275, 151, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 266, 148, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 266, 151, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 256, 148, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 259, 151, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 74, 151, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 74, 148, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 245, 151, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 122, 151, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 281, 138, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 281, 141, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 272, 141, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 262, 138, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 265, 141, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 74, 141, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 74, 138, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 251, 141, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 122, 141, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 347, 117, textureX, textureY); // Box 2
		bodyModel[36] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 2
		bodyModel[37] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 202, 173, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 239, 173, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 151, 163, textureX, textureY); // Box 52
		bodyModel[43] = new ModelRendererTurbo(this, 266, 174, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[45] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 55
		bodyModel[46] = new ModelRendererTurbo(this, 141, 174, textureX, textureY); // Box 2
		bodyModel[47] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 2
		bodyModel[48] = new ModelRendererTurbo(this, 96, 172, textureX, textureY); // Box 2
		bodyModel[49] = new ModelRendererTurbo(this, 74, 158, textureX, textureY); // Box 59
		bodyModel[50] = new ModelRendererTurbo(this, 156, 177, textureX, textureY); // Box 41
		bodyModel[51] = new ModelRendererTurbo(this, 156, 175, textureX, textureY); // Box 41
		bodyModel[52] = new ModelRendererTurbo(this, 176, 175, textureX, textureY); // Box 41
		bodyModel[53] = new ModelRendererTurbo(this, 179, 177, textureX, textureY); // Box 41
		bodyModel[54] = new ModelRendererTurbo(this, 179, 175, textureX, textureY); // Box 41
		bodyModel[55] = new ModelRendererTurbo(this, 199, 175, textureX, textureY); // Box 41
		bodyModel[56] = new ModelRendererTurbo(this, 89, 157, textureX, textureY); // Box 41
		bodyModel[57] = new ModelRendererTurbo(this, 91, 158, textureX, textureY); // Box 41
		bodyModel[58] = new ModelRendererTurbo(this, 101, 158, textureX, textureY); // Box 41
		bodyModel[59] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 41
		bodyModel[60] = new ModelRendererTurbo(this, 219, 160, textureX, textureY); // Box 41
		bodyModel[61] = new ModelRendererTurbo(this, 239, 160, textureX, textureY); // Box 41
		bodyModel[62] = new ModelRendererTurbo(this, 200, 162, textureX, textureY); // Box 41
		bodyModel[63] = new ModelRendererTurbo(this, 200, 160, textureX, textureY); // Box 41
		bodyModel[64] = new ModelRendererTurbo(this, 216, 160, textureX, textureY); // Box 41
		bodyModel[65] = new ModelRendererTurbo(this, 226, 141, textureX, textureY); // Box 39
		bodyModel[66] = new ModelRendererTurbo(this, 205, 141, textureX, textureY); // Box 39
		bodyModel[67] = new ModelRendererTurbo(this, 150, 156, textureX, textureY); // Box 41
		bodyModel[68] = new ModelRendererTurbo(this, 150, 154, textureX, textureY); // Box 41
		bodyModel[69] = new ModelRendererTurbo(this, 162, 154, textureX, textureY); // Box 41
		bodyModel[70] = new ModelRendererTurbo(this, 141, 162, textureX, textureY); // Box 41
		bodyModel[71] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[72] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[73] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[74] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[75] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[81] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[88] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[89] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[90] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[91] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[92] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[93] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[94] = new ModelRendererTurbo(this, 188, 156, textureX, textureY); // Box 38
		bodyModel[95] = new ModelRendererTurbo(this, 195, 160, textureX, textureY); // Box 38
		bodyModel[96] = new ModelRendererTurbo(this, 197, 155, textureX, textureY); // Box 38
		bodyModel[97] = new ModelRendererTurbo(this, 183, 155, textureX, textureY); // Box 38
		bodyModel[98] = new ModelRendererTurbo(this, 203, 155, textureX, textureY); // Box 41
		bodyModel[99] = new ModelRendererTurbo(this, 222, 155, textureX, textureY); // Box 41
		bodyModel[100] = new ModelRendererTurbo(this, 212, 155, textureX, textureY); // Box 41
		bodyModel[101] = new ModelRendererTurbo(this, 231, 155, textureX, textureY); // Box 41
		bodyModel[102] = new ModelRendererTurbo(this, 223, 155, textureX, textureY); // Box 41
		bodyModel[103] = new ModelRendererTurbo(this, 204, 155, textureX, textureY); // Box 41
		bodyModel[104] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[105] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[107] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[108] = new ModelRendererTurbo(this, 51, 78, textureX, textureY); // Box 128
		bodyModel[109] = new ModelRendererTurbo(this, 60, 97, textureX, textureY); // Box 202
		bodyModel[110] = new ModelRendererTurbo(this, 63, 145, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 205
		bodyModel[112] = new ModelRendererTurbo(this, 366, 87, textureX, textureY); // Box 38
		bodyModel[113] = new ModelRendererTurbo(this, 374, 103, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 373, 97, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 372, 91, textureX, textureY); // Box 128
		bodyModel[116] = new ModelRendererTurbo(this, 370, 83, textureX, textureY); // Box 128
		bodyModel[117] = new ModelRendererTurbo(this, 366, 67, textureX, textureY); // Box 248
		bodyModel[118] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 250
		bodyModel[119] = new ModelRendererTurbo(this, 373, 72, textureX, textureY); // Box 252
		bodyModel[120] = new ModelRendererTurbo(this, 372, 77, textureX, textureY); // Box 254
		bodyModel[121] = new ModelRendererTurbo(this, 371, 86, textureX, textureY); // Box 38
		bodyModel[122] = new ModelRendererTurbo(this, 385, 102, textureX, textureY); // Box 128
		bodyModel[123] = new ModelRendererTurbo(this, 414, 67, textureX, textureY); // Box 128
		bodyModel[124] = new ModelRendererTurbo(this, 384, 96, textureX, textureY); // Box 128
		bodyModel[125] = new ModelRendererTurbo(this, 383, 90, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 381, 82, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 419, 45, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 427, 46, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 247
		bodyModel[130] = new ModelRendererTurbo(this, 385, 67, textureX, textureY); // Box 249
		bodyModel[131] = new ModelRendererTurbo(this, 384, 71, textureX, textureY); // Box 251
		bodyModel[132] = new ModelRendererTurbo(this, 383, 76, textureX, textureY); // Box 253
		bodyModel[133] = new ModelRendererTurbo(this, 413, 46, textureX, textureY); // Box 255
		bodyModel[134] = new ModelRendererTurbo(this, 411, 53, textureX, textureY); // Box 128
		bodyModel[135] = new ModelRendererTurbo(this, 423, 52, textureX, textureY); // Box 128
		bodyModel[136] = new ModelRendererTurbo(this, 413, 52, textureX, textureY); // Box 153
		bodyModel[137] = new ModelRendererTurbo(this, 427, 69, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 412, 69, textureX, textureY); // Box 128
		bodyModel[139] = new ModelRendererTurbo(this, 403, 69, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 403, 89, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 390, 59, textureX, textureY); // Box 128
		bodyModel[142] = new ModelRendererTurbo(this, 390, 98, textureX, textureY); // Box 128
		bodyModel[143] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[144] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[145] = new ModelRendererTurbo(this, 19, 102, textureX, textureY); // Box 128
		bodyModel[146] = new ModelRendererTurbo(this, 28, 103, textureX, textureY); // Box 128
		bodyModel[147] = new ModelRendererTurbo(this, 5, 130, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 18, 96, textureX, textureY); // Box 128
		bodyModel[149] = new ModelRendererTurbo(this, 27, 97, textureX, textureY); // Box 128
		bodyModel[150] = new ModelRendererTurbo(this, 17, 90, textureX, textureY); // Box 128
		bodyModel[151] = new ModelRendererTurbo(this, 26, 91, textureX, textureY); // Box 128
		bodyModel[152] = new ModelRendererTurbo(this, 15, 82, textureX, textureY); // Box 128
		bodyModel[153] = new ModelRendererTurbo(this, 24, 83, textureX, textureY); // Box 128
		bodyModel[154] = new ModelRendererTurbo(this, 10, 108, textureX, textureY); // Box 128
		bodyModel[155] = new ModelRendererTurbo(this, 18, 109, textureX, textureY); // Box 128
		bodyModel[156] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[157] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[158] = new ModelRendererTurbo(this, 19, 67, textureX, textureY); // Box 249
		bodyModel[159] = new ModelRendererTurbo(this, 28, 67, textureX, textureY); // Box 250
		bodyModel[160] = new ModelRendererTurbo(this, 18, 71, textureX, textureY); // Box 251
		bodyModel[161] = new ModelRendererTurbo(this, 27, 72, textureX, textureY); // Box 252
		bodyModel[162] = new ModelRendererTurbo(this, 17, 76, textureX, textureY); // Box 253
		bodyModel[163] = new ModelRendererTurbo(this, 26, 77, textureX, textureY); // Box 254
		bodyModel[164] = new ModelRendererTurbo(this, 4, 109, textureX, textureY); // Box 255
		bodyModel[165] = new ModelRendererTurbo(this, 2, 120, textureX, textureY); // Box 128
		bodyModel[166] = new ModelRendererTurbo(this, 14, 115, textureX, textureY); // Box 128
		bodyModel[167] = new ModelRendererTurbo(this, 4, 115, textureX, textureY); // Box 153
		bodyModel[168] = new ModelRendererTurbo(this, 18, 132, textureX, textureY); // Box 128
		bodyModel[169] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 128
		bodyModel[170] = new ModelRendererTurbo(this, 1, 59, textureX, textureY); // Box 128
		bodyModel[171] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 128
		bodyModel[172] = new ModelRendererTurbo(this, 1, 69, textureX, textureY); // Box 128
		bodyModel[173] = new ModelRendererTurbo(this, 1, 98, textureX, textureY); // Box 128
		bodyModel[174] = new ModelRendererTurbo(this, 327, 52, textureX, textureY); // Box 204
		bodyModel[175] = new ModelRendererTurbo(this, 327, 57, textureX, textureY); // Box 205
		bodyModel[176] = new ModelRendererTurbo(this, 62, 59, textureX, textureY); // Box 190
		bodyModel[177] = new ModelRendererTurbo(this, 61, 55, textureX, textureY); // Box 191
		bodyModel[178] = new ModelRendererTurbo(this, 300, 21, textureX, textureY); // Box 128
		bodyModel[179] = new ModelRendererTurbo(this, 299, 16, textureX, textureY); // Box 128
		bodyModel[180] = new ModelRendererTurbo(this, 311, 17, textureX, textureY); // Box 275
		bodyModel[181] = new ModelRendererTurbo(this, 310, 22, textureX, textureY); // Box 276
		bodyModel[182] = new ModelRendererTurbo(this, 79, 297, textureX, textureY); // Box 209
		bodyModel[183] = new ModelRendererTurbo(this, 79, 267, textureX, textureY); // Box 209
		bodyModel[184] = new ModelRendererTurbo(this, 310, 290, textureX, textureY); // Box 128
		bodyModel[185] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 209
		bodyModel[186] = new ModelRendererTurbo(this, 20, 178, textureX, textureY); // Box 209
		bodyModel[187] = new ModelRendererTurbo(this, 348, 304, textureX, textureY); // Box 128
		bodyModel[188] = new ModelRendererTurbo(this, 328, 271, textureX, textureY); // Box 128
		bodyModel[189] = new ModelRendererTurbo(this, 366, 299, textureX, textureY); // Box 128
		bodyModel[190] = new ModelRendererTurbo(this, 383, 306, textureX, textureY); // Box 38
		bodyModel[191] = new ModelRendererTurbo(this, 383, 314, textureX, textureY); // Box 38
		bodyModel[192] = new ModelRendererTurbo(this, 363, 281, textureX, textureY); // Box 128
		bodyModel[193] = new ModelRendererTurbo(this, 397, 281, textureX, textureY); // Box 128
		bodyModel[194] = new ModelRendererTurbo(this, 382, 276, textureX, textureY); // Box 128
		bodyModel[195] = new ModelRendererTurbo(this, 100, 228, textureX, textureY); // Box 38
		bodyModel[196] = new ModelRendererTurbo(this, 343, 305, textureX, textureY); // Box 128
		bodyModel[197] = new ModelRendererTurbo(this, 104, 191, textureX, textureY); // Box 38
		bodyModel[198] = new ModelRendererTurbo(this, 106, 196, textureX, textureY); // Box 38
		bodyModel[199] = new ModelRendererTurbo(this, 104, 258, textureX, textureY); // Box 275
		bodyModel[200] = new ModelRendererTurbo(this, 106, 263, textureX, textureY); // Box 276
		bodyModel[201] = new ModelRendererTurbo(this, 88, 259, textureX, textureY); // Box 275
		bodyModel[202] = new ModelRendererTurbo(this, 95, 259, textureX, textureY); // Box 275
		bodyModel[203] = new ModelRendererTurbo(this, 88, 263, textureX, textureY); // Box 275
		bodyModel[204] = new ModelRendererTurbo(this, 101, 263, textureX, textureY); // Box 276
		bodyModel[205] = new ModelRendererTurbo(this, 153, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[206] = new ModelRendererTurbo(this, 160, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[207] = new ModelRendererTurbo(this, 167, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[208] = new ModelRendererTurbo(this, 174, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[209] = new ModelRendererTurbo(this, 181, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[210] = new ModelRendererTurbo(this, 188, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[211] = new ModelRendererTurbo(this, 195, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[212] = new ModelRendererTurbo(this, 119, 274, textureX, textureY); // Right seat part
		bodyModel[213] = new ModelRendererTurbo(this, 119, 284, textureX, textureY); // Right seat part
		bodyModel[214] = new ModelRendererTurbo(this, 110, 267, textureX, textureY); // Right seat part
		bodyModel[215] = new ModelRendererTurbo(this, 99, 277, textureX, textureY); // Right seat part
		bodyModel[216] = new ModelRendererTurbo(this, 99, 267, textureX, textureY); // Right seat part
		bodyModel[217] = new ModelRendererTurbo(this, 110, 284, textureX, textureY); // Right seat part
		bodyModel[218] = new ModelRendererTurbo(this, 110, 277, textureX, textureY); // Right seat part
		bodyModel[219] = new ModelRendererTurbo(this, 110, 274, textureX, textureY); // Right seat part
		bodyModel[220] = new ModelRendererTurbo(this, 119, 312, textureX, textureY); // Left seat part
		bodyModel[221] = new ModelRendererTurbo(this, 119, 302, textureX, textureY); // Left seat part
		bodyModel[222] = new ModelRendererTurbo(this, 110, 295, textureX, textureY); // Left seat part
		bodyModel[223] = new ModelRendererTurbo(this, 99, 295, textureX, textureY); // Left seat part
		bodyModel[224] = new ModelRendererTurbo(this, 110, 305, textureX, textureY); // Left seat part
		bodyModel[225] = new ModelRendererTurbo(this, 110, 302, textureX, textureY); // Left seat part
		bodyModel[226] = new ModelRendererTurbo(this, 110, 315, textureX, textureY); // Left seat part
		bodyModel[227] = new ModelRendererTurbo(this, 110, 312, textureX, textureY); // Left seat part
		bodyModel[228] = new ModelRendererTurbo(this, 150, 274, textureX, textureY); // Right seat part
		bodyModel[229] = new ModelRendererTurbo(this, 150, 284, textureX, textureY); // Right seat part
		bodyModel[230] = new ModelRendererTurbo(this, 141, 267, textureX, textureY); // Right seat part
		bodyModel[231] = new ModelRendererTurbo(this, 130, 267, textureX, textureY); // Right seat part
		bodyModel[232] = new ModelRendererTurbo(this, 141, 287, textureX, textureY); // Right seat part
		bodyModel[233] = new ModelRendererTurbo(this, 141, 284, textureX, textureY); // Right seat part
		bodyModel[234] = new ModelRendererTurbo(this, 141, 277, textureX, textureY); // Right seat part
		bodyModel[235] = new ModelRendererTurbo(this, 141, 274, textureX, textureY); // Right seat part
		bodyModel[236] = new ModelRendererTurbo(this, 150, 312, textureX, textureY); // Left seat part
		bodyModel[237] = new ModelRendererTurbo(this, 150, 302, textureX, textureY); // Left seat part
		bodyModel[238] = new ModelRendererTurbo(this, 141, 295, textureX, textureY); // Left seat part
		bodyModel[239] = new ModelRendererTurbo(this, 130, 295, textureX, textureY); // Left seat part
		bodyModel[240] = new ModelRendererTurbo(this, 141, 305, textureX, textureY); // Left seat part
		bodyModel[241] = new ModelRendererTurbo(this, 141, 302, textureX, textureY); // Left seat part
		bodyModel[242] = new ModelRendererTurbo(this, 141, 315, textureX, textureY); // Left seat part
		bodyModel[243] = new ModelRendererTurbo(this, 141, 312, textureX, textureY); // Left seat part
		bodyModel[244] = new ModelRendererTurbo(this, 181, 274, textureX, textureY); // Right seat part
		bodyModel[245] = new ModelRendererTurbo(this, 181, 284, textureX, textureY); // Right seat part
		bodyModel[246] = new ModelRendererTurbo(this, 172, 267, textureX, textureY); // Right seat part
		bodyModel[247] = new ModelRendererTurbo(this, 161, 267, textureX, textureY); // Right seat part
		bodyModel[248] = new ModelRendererTurbo(this, 172, 287, textureX, textureY); // Right seat part
		bodyModel[249] = new ModelRendererTurbo(this, 172, 284, textureX, textureY); // Right seat part
		bodyModel[250] = new ModelRendererTurbo(this, 172, 277, textureX, textureY); // Right seat part
		bodyModel[251] = new ModelRendererTurbo(this, 172, 274, textureX, textureY); // Right seat part
		bodyModel[252] = new ModelRendererTurbo(this, 181, 312, textureX, textureY); // Left seat part
		bodyModel[253] = new ModelRendererTurbo(this, 181, 302, textureX, textureY); // Left seat part
		bodyModel[254] = new ModelRendererTurbo(this, 172, 295, textureX, textureY); // Left seat part
		bodyModel[255] = new ModelRendererTurbo(this, 161, 295, textureX, textureY); // Left seat part
		bodyModel[256] = new ModelRendererTurbo(this, 172, 305, textureX, textureY); // Left seat part
		bodyModel[257] = new ModelRendererTurbo(this, 172, 302, textureX, textureY); // Left seat part
		bodyModel[258] = new ModelRendererTurbo(this, 172, 315, textureX, textureY); // Left seat part
		bodyModel[259] = new ModelRendererTurbo(this, 172, 312, textureX, textureY); // Left seat part
		bodyModel[260] = new ModelRendererTurbo(this, 130, 277, textureX, textureY); // Right seat part
		bodyModel[261] = new ModelRendererTurbo(this, 161, 277, textureX, textureY); // Right seat part
		bodyModel[262] = new ModelRendererTurbo(this, 99, 305, textureX, textureY); // Left seat part
		bodyModel[263] = new ModelRendererTurbo(this, 130, 305, textureX, textureY); // Left seat part
		bodyModel[264] = new ModelRendererTurbo(this, 161, 305, textureX, textureY); // Left seat part
		bodyModel[265] = new ModelRendererTurbo(this, 212, 274, textureX, textureY); // Right seat part
		bodyModel[266] = new ModelRendererTurbo(this, 212, 284, textureX, textureY); // Right seat part
		bodyModel[267] = new ModelRendererTurbo(this, 203, 267, textureX, textureY); // Right seat part
		bodyModel[268] = new ModelRendererTurbo(this, 192, 277, textureX, textureY); // Right seat part
		bodyModel[269] = new ModelRendererTurbo(this, 192, 267, textureX, textureY); // Right seat part
		bodyModel[270] = new ModelRendererTurbo(this, 203, 287, textureX, textureY); // Right seat part
		bodyModel[271] = new ModelRendererTurbo(this, 203, 284, textureX, textureY); // Right seat part
		bodyModel[272] = new ModelRendererTurbo(this, 203, 277, textureX, textureY); // Right seat part
		bodyModel[273] = new ModelRendererTurbo(this, 203, 274, textureX, textureY); // Right seat part
		bodyModel[274] = new ModelRendererTurbo(this, 212, 312, textureX, textureY); // Left seat part
		bodyModel[275] = new ModelRendererTurbo(this, 212, 302, textureX, textureY); // Left seat part
		bodyModel[276] = new ModelRendererTurbo(this, 203, 295, textureX, textureY); // Left seat part
		bodyModel[277] = new ModelRendererTurbo(this, 192, 295, textureX, textureY); // Left seat part
		bodyModel[278] = new ModelRendererTurbo(this, 203, 305, textureX, textureY); // Left seat part
		bodyModel[279] = new ModelRendererTurbo(this, 203, 302, textureX, textureY); // Left seat part
		bodyModel[280] = new ModelRendererTurbo(this, 203, 315, textureX, textureY); // Left seat part
		bodyModel[281] = new ModelRendererTurbo(this, 203, 312, textureX, textureY); // Left seat part
		bodyModel[282] = new ModelRendererTurbo(this, 243, 274, textureX, textureY); // Right seat part
		bodyModel[283] = new ModelRendererTurbo(this, 243, 284, textureX, textureY); // Right seat part
		bodyModel[284] = new ModelRendererTurbo(this, 234, 267, textureX, textureY); // Right seat part
		bodyModel[285] = new ModelRendererTurbo(this, 223, 267, textureX, textureY); // Right seat part
		bodyModel[286] = new ModelRendererTurbo(this, 234, 287, textureX, textureY); // Right seat part
		bodyModel[287] = new ModelRendererTurbo(this, 234, 284, textureX, textureY); // Right seat part
		bodyModel[288] = new ModelRendererTurbo(this, 234, 277, textureX, textureY); // Right seat part
		bodyModel[289] = new ModelRendererTurbo(this, 234, 274, textureX, textureY); // Right seat part
		bodyModel[290] = new ModelRendererTurbo(this, 243, 312, textureX, textureY); // Left seat part
		bodyModel[291] = new ModelRendererTurbo(this, 243, 302, textureX, textureY); // Left seat part
		bodyModel[292] = new ModelRendererTurbo(this, 234, 295, textureX, textureY); // Left seat part
		bodyModel[293] = new ModelRendererTurbo(this, 223, 295, textureX, textureY); // Left seat part
		bodyModel[294] = new ModelRendererTurbo(this, 234, 305, textureX, textureY); // Left seat part
		bodyModel[295] = new ModelRendererTurbo(this, 234, 302, textureX, textureY); // Left seat part
		bodyModel[296] = new ModelRendererTurbo(this, 234, 315, textureX, textureY); // Left seat part
		bodyModel[297] = new ModelRendererTurbo(this, 234, 312, textureX, textureY); // Left seat part
		bodyModel[298] = new ModelRendererTurbo(this, 274, 274, textureX, textureY); // Right seat part
		bodyModel[299] = new ModelRendererTurbo(this, 274, 284, textureX, textureY); // Right seat part
		bodyModel[300] = new ModelRendererTurbo(this, 265, 267, textureX, textureY); // Right seat part
		bodyModel[301] = new ModelRendererTurbo(this, 254, 267, textureX, textureY); // Right seat part
		bodyModel[302] = new ModelRendererTurbo(this, 265, 287, textureX, textureY); // Right seat part
		bodyModel[303] = new ModelRendererTurbo(this, 265, 284, textureX, textureY); // Right seat part
		bodyModel[304] = new ModelRendererTurbo(this, 265, 277, textureX, textureY); // Right seat part
		bodyModel[305] = new ModelRendererTurbo(this, 265, 274, textureX, textureY); // Right seat part
		bodyModel[306] = new ModelRendererTurbo(this, 274, 312, textureX, textureY); // Left seat part
		bodyModel[307] = new ModelRendererTurbo(this, 274, 302, textureX, textureY); // Left seat part
		bodyModel[308] = new ModelRendererTurbo(this, 265, 295, textureX, textureY); // Left seat part
		bodyModel[309] = new ModelRendererTurbo(this, 254, 295, textureX, textureY); // Left seat part
		bodyModel[310] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Left seat part
		bodyModel[311] = new ModelRendererTurbo(this, 265, 302, textureX, textureY); // Left seat part
		bodyModel[312] = new ModelRendererTurbo(this, 265, 315, textureX, textureY); // Left seat part
		bodyModel[313] = new ModelRendererTurbo(this, 265, 312, textureX, textureY); // Left seat part
		bodyModel[314] = new ModelRendererTurbo(this, 223, 277, textureX, textureY); // Right seat part
		bodyModel[315] = new ModelRendererTurbo(this, 254, 277, textureX, textureY); // Right seat part
		bodyModel[316] = new ModelRendererTurbo(this, 192, 305, textureX, textureY); // Left seat part
		bodyModel[317] = new ModelRendererTurbo(this, 223, 305, textureX, textureY); // Left seat part
		bodyModel[318] = new ModelRendererTurbo(this, 254, 305, textureX, textureY); // Left seat part
		bodyModel[319] = new ModelRendererTurbo(this, 296, 267, textureX, textureY); // Right seat part
		bodyModel[320] = new ModelRendererTurbo(this, 285, 267, textureX, textureY); // Right seat part
		bodyModel[321] = new ModelRendererTurbo(this, 285, 277, textureX, textureY); // Right seat part
		bodyModel[322] = new ModelRendererTurbo(this, 285, 308, textureX, textureY); // Box 128
		bodyModel[323] = new ModelRendererTurbo(this, 289, 300, textureX, textureY); // Box 128
		bodyModel[324] = new ModelRendererTurbo(this, 291, 299, textureX, textureY); // Box 128
		bodyModel[325] = new ModelRendererTurbo(this, 288, 300, textureX, textureY); // Box 128
		bodyModel[326] = new ModelRendererTurbo(this, 10, 230, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[327] = new ModelRendererTurbo(this, 11, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[328] = new ModelRendererTurbo(this, 11, 238, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[329] = new ModelRendererTurbo(this, 18, 240, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[330] = new ModelRendererTurbo(this, 25, 238, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[331] = new ModelRendererTurbo(this, 24, 226, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[332] = new ModelRendererTurbo(this, 25, 234, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[333] = new ModelRendererTurbo(this, 10, 226, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[334] = new ModelRendererTurbo(this, 17, 224, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[335] = new ModelRendererTurbo(this, 24, 230, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[336] = new ModelRendererTurbo(this, 64, 286, textureX, textureY); // Box 209 inner door
		bodyModel[337] = new ModelRendererTurbo(this, 300, 310, textureX, textureY); // Box 128
		bodyModel[338] = new ModelRendererTurbo(this, 47, 312, textureX, textureY); // Box 209
		bodyModel[339] = new ModelRendererTurbo(this, 51, 305, textureX, textureY); // Box 209
		bodyModel[340] = new ModelRendererTurbo(this, 58, 308, textureX, textureY); // Box 209
		bodyModel[341] = new ModelRendererTurbo(this, 50, 299, textureX, textureY); // Box 209
		bodyModel[342] = new ModelRendererTurbo(this, 40, 306, textureX, textureY); // Box 209
		bodyModel[343] = new ModelRendererTurbo(this, 42, 313, textureX, textureY); // Box 209
		bodyModel[344] = new ModelRendererTurbo(this, 47, 280, textureX, textureY); // Box 470
		bodyModel[345] = new ModelRendererTurbo(this, 49, 274, textureX, textureY); // Box 471
		bodyModel[346] = new ModelRendererTurbo(this, 58, 276, textureX, textureY); // Box 472
		bodyModel[347] = new ModelRendererTurbo(this, 48, 268, textureX, textureY); // Box 473
		bodyModel[348] = new ModelRendererTurbo(this, 38, 275, textureX, textureY); // Box 474
		bodyModel[349] = new ModelRendererTurbo(this, 42, 281, textureX, textureY); // Box 475
		bodyModel[350] = new ModelRendererTurbo(this, 15, 275, textureX, textureY); // Box 209
		bodyModel[351] = new ModelRendererTurbo(this, 1, 282, textureX, textureY); // Box 209
		bodyModel[352] = new ModelRendererTurbo(this, 8, 274, textureX, textureY); // Box 209
		bodyModel[353] = new ModelRendererTurbo(this, 1, 274, textureX, textureY); // Box 209
		bodyModel[354] = new ModelRendererTurbo(this, 6, 280, textureX, textureY); // Box 209
		bodyModel[355] = new ModelRendererTurbo(this, 15, 283, textureX, textureY); // Box 209
		bodyModel[356] = new ModelRendererTurbo(this, 1, 264, textureX, textureY); // Box 209
		bodyModel[357] = new ModelRendererTurbo(this, 10, 264, textureX, textureY); // Box 209
		bodyModel[358] = new ModelRendererTurbo(this, 25, 299, textureX, textureY); // Box 492
		bodyModel[359] = new ModelRendererTurbo(this, 28, 289, textureX, textureY); // Box 493
		bodyModel[360] = new ModelRendererTurbo(this, 55, 321, textureX, textureY); // Box 498
		bodyModel[361] = new ModelRendererTurbo(this, 28, 296, textureX, textureY); // Box 492
		bodyModel[362] = new ModelRendererTurbo(this, 31, 316, textureX, textureY); // Box 498
		bodyModel[363] = new ModelRendererTurbo(this, 26, 316, textureX, textureY); // Box 499
		bodyModel[364] = new ModelRendererTurbo(this, 26, 312, textureX, textureY); // Box 493
		bodyModel[365] = new ModelRendererTurbo(this, 31, 312, textureX, textureY); // Box 493
		bodyModel[366] = new ModelRendererTurbo(this, 2, 299, textureX, textureY); // Box 492
		bodyModel[367] = new ModelRendererTurbo(this, 5, 289, textureX, textureY); // Box 493
		bodyModel[368] = new ModelRendererTurbo(this, 5, 296, textureX, textureY); // Box 492
		bodyModel[369] = new ModelRendererTurbo(this, 11, 316, textureX, textureY); // Box 498
		bodyModel[370] = new ModelRendererTurbo(this, 6, 316, textureX, textureY); // Box 499
		bodyModel[371] = new ModelRendererTurbo(this, 6, 312, textureX, textureY); // Box 493
		bodyModel[372] = new ModelRendererTurbo(this, 11, 312, textureX, textureY); // Box 493
		bodyModel[373] = new ModelRendererTurbo(this, 24, 271, textureX, textureY); // Box 526
		bodyModel[374] = new ModelRendererTurbo(this, 28, 281, textureX, textureY); // Box 527
		bodyModel[375] = new ModelRendererTurbo(this, 27, 278, textureX, textureY); // Box 532
		bodyModel[376] = new ModelRendererTurbo(this, 27, 263, textureX, textureY); // Box 533
		bodyModel[377] = new ModelRendererTurbo(this, 22, 265, textureX, textureY); // Box 534
		bodyModel[378] = new ModelRendererTurbo(this, 27, 259, textureX, textureY); // Box 535
		bodyModel[379] = new ModelRendererTurbo(this, 1, 245, textureX, textureY); // Box 526
		bodyModel[380] = new ModelRendererTurbo(this, 25, 242, textureX, textureY); // Box 527
		bodyModel[381] = new ModelRendererTurbo(this, 16, 246, textureX, textureY); // Box 532
		bodyModel[382] = new ModelRendererTurbo(this, 1, 240, textureX, textureY); // Box 533
		bodyModel[383] = new ModelRendererTurbo(this, 1, 259, textureX, textureY); // Box 534
		bodyModel[384] = new ModelRendererTurbo(this, 1, 236, textureX, textureY); // Box 535
		bodyModel[385] = new ModelRendererTurbo(this, 22, 261, textureX, textureY); // Box 546
		bodyModel[386] = new ModelRendererTurbo(this, 1, 255, textureX, textureY); // Box 546
		bodyModel[387] = new ModelRendererTurbo(this, 405, 265, textureX, textureY); // Box 38
		bodyModel[388] = new ModelRendererTurbo(this, 402, 269, textureX, textureY); // Box 38
		bodyModel[389] = new ModelRendererTurbo(this, 407, 269, textureX, textureY); // Box 38
		bodyModel[390] = new ModelRendererTurbo(this, 389, 267, textureX, textureY); // Box 38
		bodyModel[391] = new ModelRendererTurbo(this, 392, 272, textureX, textureY); // Box 38
		bodyModel[392] = new ModelRendererTurbo(this, 407, 273, textureX, textureY); // Box 38
		bodyModel[393] = new ModelRendererTurbo(this, 391, 276, textureX, textureY); // Box 38
		bodyModel[394] = new ModelRendererTurbo(this, 400, 276, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[395] = new ModelRendererTurbo(this, 371, 268, textureX, textureY); // Box 38
		bodyModel[396] = new ModelRendererTurbo(this, 374, 273, textureX, textureY); // Box 38
		bodyModel[397] = new ModelRendererTurbo(this, 373, 277, textureX, textureY); // Box 38
		bodyModel[398] = new ModelRendererTurbo(this, 410, 270, textureX, textureY); // Box 38
		bodyModel[399] = new ModelRendererTurbo(this, 337, 258, textureX, textureY); // Box 38
		bodyModel[400] = new ModelRendererTurbo(this, 336, 262, textureX, textureY); // Box 38
		bodyModel[401] = new ModelRendererTurbo(this, 341, 262, textureX, textureY); // Box 38
		bodyModel[402] = new ModelRendererTurbo(this, 337, 266, textureX, textureY); // Box 38
		bodyModel[403] = new ModelRendererTurbo(this, 328, 248, textureX, textureY); // Box 38
		bodyModel[404] = new ModelRendererTurbo(this, 326, 252, textureX, textureY); // Box 38
		bodyModel[405] = new ModelRendererTurbo(this, 332, 252, textureX, textureY); // Box 38
		bodyModel[406] = new ModelRendererTurbo(this, 329, 256, textureX, textureY); // Box 38
		bodyModel[407] = new ModelRendererTurbo(this, 335, 274, textureX, textureY); // Box 38
		bodyModel[408] = new ModelRendererTurbo(this, 329, 264, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[409] = new ModelRendererTurbo(this, 337, 279, textureX, textureY); // Box 38
		bodyModel[410] = new ModelRendererTurbo(this, 324, 240, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[411] = new ModelRendererTurbo(this, 398, 263, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[412] = new ModelRendererTurbo(this, 331, 241, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[413] = new ModelRendererTurbo(this, 317, 241, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[414] = new ModelRendererTurbo(this, 319, 258, textureX, textureY); // Box 349
		bodyModel[415] = new ModelRendererTurbo(this, 319, 244, textureX, textureY); // Box 349
		bodyModel[416] = new ModelRendererTurbo(this, 321, 249, textureX, textureY); // Box 349
		bodyModel[417] = new ModelRendererTurbo(this, 315, 267, textureX, textureY); // Box 38
		bodyModel[418] = new ModelRendererTurbo(this, 315, 278, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[419] = new ModelRendererTurbo(this, 315, 273, textureX, textureY); // Box 38
		bodyModel[420] = new ModelRendererTurbo(this, 318, 262, textureX, textureY); // Box 38
		bodyModel[421] = new ModelRendererTurbo(this, 353, 243, textureX, textureY); // Box 128
		bodyModel[422] = new ModelRendererTurbo(this, 84, 252, textureX, textureY); // Box 128
		bodyModel[423] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[424] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[425] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[426] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[427] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[428] = new ModelRendererTurbo(this, 72, 356, textureX, textureY); // Box 128
		bodyModel[429] = new ModelRendererTurbo(this, 72, 334, textureX, textureY); // Box 177
		bodyModel[430] = new ModelRendererTurbo(this, 72, 340, textureX, textureY); // Box 128
		bodyModel[431] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[432] = new ModelRendererTurbo(this, 453, 36, textureX, textureY); // Box 128
		bodyModel[433] = new ModelRendererTurbo(this, 453, 26, textureX, textureY); // Box 176
		bodyModel[434] = new ModelRendererTurbo(this, 419, 45, textureX, textureY); // Box 128
		bodyModel[435] = new ModelRendererTurbo(this, 121, 7, textureX, textureY); // Box 128
		bodyModel[436] = new ModelRendererTurbo(this, 184, 15, textureX, textureY); // Box 128
		bodyModel[437] = new ModelRendererTurbo(this, 132, 1, textureX, textureY); // Box 176
		bodyModel[438] = new ModelRendererTurbo(this, 52, 3, textureX, textureY); // Box 128
		bodyModel[439] = new ModelRendererTurbo(this, 72, 326, textureX, textureY); // Box 194
		bodyModel[440] = new ModelRendererTurbo(this, 72, 367, textureX, textureY); // Box 128
		bodyModel[441] = new ModelRendererTurbo(this, 72, 322, textureX, textureY); // Box 193
		bodyModel[442] = new ModelRendererTurbo(this, 72, 329, textureX, textureY); // Box 192
		bodyModel[443] = new ModelRendererTurbo(this, 72, 370, textureX, textureY); // Box 128
		bodyModel[444] = new ModelRendererTurbo(this, 72, 362, textureX, textureY); // Box 128
		bodyModel[445] = new ModelRendererTurbo(this, 305, 274, textureX, textureY); // Right seat part
		bodyModel[446] = new ModelRendererTurbo(this, 305, 284, textureX, textureY); // Right seat part
		bodyModel[447] = new ModelRendererTurbo(this, 296, 287, textureX, textureY); // Right seat part
		bodyModel[448] = new ModelRendererTurbo(this, 296, 284, textureX, textureY); // Right seat part
		bodyModel[449] = new ModelRendererTurbo(this, 296, 277, textureX, textureY); // Right seat part
		bodyModel[450] = new ModelRendererTurbo(this, 296, 274, textureX, textureY); // Right seat part
		bodyModel[451] = new ModelRendererTurbo(this, 17, 287, textureX, textureY); // Right seat part
		bodyModel[452] = new ModelRendererTurbo(this, 19, 291, textureX, textureY); // Right seat part
		bodyModel[453] = new ModelRendererTurbo(this, 17, 299, textureX, textureY); // Right seat part
		bodyModel[454] = new ModelRendererTurbo(this, 38, 321, textureX, textureY); // Box 498
		bodyModel[455] = new ModelRendererTurbo(this, 21, 321, textureX, textureY); // Box 498
		bodyModel[456] = new ModelRendererTurbo(this, 4, 321, textureX, textureY); // Box 498
		bodyModel[457] = new ModelRendererTurbo(this, 55, 249, textureX, textureY); // Box 735
		bodyModel[458] = new ModelRendererTurbo(this, 38, 249, textureX, textureY); // Box 736
		bodyModel[459] = new ModelRendererTurbo(this, 3, 353, textureX, textureY); // Box 498
		bodyModel[460] = new ModelRendererTurbo(this, 3, 340, textureX, textureY); // Box 498
		bodyModel[461] = new ModelRendererTurbo(this, 17, 42, textureX, textureY); // Box 128
		bodyModel[462] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[463] = new ModelRendererTurbo(this, 28, 138, textureX, textureY); // Box 128
		bodyModel[464] = new ModelRendererTurbo(this, 426, 19, textureX, textureY); // Box 128
		bodyModel[465] = new ModelRendererTurbo(this, 444, 19, textureX, textureY); // Box 153
		bodyModel[466] = new ModelRendererTurbo(this, 410, 89, textureX, textureY); // Box 128
		bodyModel[467] = new ModelRendererTurbo(this, 52, 85, textureX, textureY); // Box 128
		bodyModel[468] = new ModelRendererTurbo(this, 62, 105, textureX, textureY); // Box 204
		bodyModel[469] = new ModelRendererTurbo(this, 110, 287, textureX, textureY); // Right seat part
		bodyModel[470] = new ModelRendererTurbo(this, 80, 379, textureX, textureY); // Box 38
		bodyModel[471] = new ModelRendererTurbo(this, 106, 256, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[472] = new ModelRendererTurbo(this, 106, 199, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[473] = new ModelRendererTurbo(this, 72, 374, textureX, textureY); // Box 462
		bodyModel[474] = new ModelRendererTurbo(this, 89, 386, textureX, textureY); // Box 38
		bodyModel[475] = new ModelRendererTurbo(this, 89, 384, textureX, textureY); // Box 452
		bodyModel[476] = new ModelRendererTurbo(this, 91, 169, textureX, textureY); // Box 2
		bodyModel[477] = new ModelRendererTurbo(this, 91, 166, textureX, textureY); // Box 521
		bodyModel[478] = new ModelRendererTurbo(this, 308, 132, textureX, textureY); // Box 2
		bodyModel[479] = new ModelRendererTurbo(this, 34, 124, textureX, textureY); // Box 2
		bodyModel[480] = new ModelRendererTurbo(this, 311, 299, textureX, textureY); // Box 128
		bodyModel[481] = new ModelRendererTurbo(this, 320, 302, textureX, textureY); // Box 128
		bodyModel[482] = new ModelRendererTurbo(this, 14, 214, textureX, textureY); // Box 209
		bodyModel[483] = new ModelRendererTurbo(this, 324, 62, textureX, textureY); // Box 26
		bodyModel[484] = new ModelRendererTurbo(this, 340, 62, textureX, textureY); // Box 26
		bodyModel[485] = new ModelRendererTurbo(this, 340, 60, textureX, textureY); // Box 26
		bodyModel[486] = new ModelRendererTurbo(this, 324, 60, textureX, textureY); // Box 26
		bodyModel[487] = new ModelRendererTurbo(this, 340, 66, textureX, textureY); // Box 26
		bodyModel[488] = new ModelRendererTurbo(this, 324, 66, textureX, textureY); // Box 26
		bodyModel[489] = new ModelRendererTurbo(this, 329, 63, textureX, textureY); // Box 26
		bodyModel[490] = new ModelRendererTurbo(this, 331, 66, textureX, textureY); // Box 26
		bodyModel[491] = new ModelRendererTurbo(this, 331, 80, textureX, textureY); // Left step part
		bodyModel[492] = new ModelRendererTurbo(this, 331, 76, textureX, textureY); // Left step part
		bodyModel[493] = new ModelRendererTurbo(this, 331, 70, textureX, textureY); // Left step part
		bodyModel[494] = new ModelRendererTurbo(this, 340, 76, textureX, textureY); // Left step part
		bodyModel[495] = new ModelRendererTurbo(this, 326, 76, textureX, textureY); // Left step part
		bodyModel[496] = new ModelRendererTurbo(this, 340, 74, textureX, textureY); // Left step part
		bodyModel[497] = new ModelRendererTurbo(this, 326, 74, textureX, textureY); // Left step part
		bodyModel[498] = new ModelRendererTurbo(this, 326, 71, textureX, textureY); // Left step part
		bodyModel[499] = new ModelRendererTurbo(this, 340, 71, textureX, textureY); // Left step part

		bodyModel[0].addBox(0F, 0F, 0F, 118, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-61.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(60.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(56.5F, 1F, -5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(60.5F, 3F, 10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[4].setRotationPoint(60.5F, 4F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[5].setRotationPoint(53.5F, 3F, 10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[6].setRotationPoint(54.5F, 4F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 2
		bodyModel[7].setRotationPoint(52.25F, 3F, 10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 2
		bodyModel[8].setRotationPoint(53F, 4F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[9].setRotationPoint(-61.5F, 4F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[10].setRotationPoint(-61.5F, 3F, 10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 2
		bodyModel[11].setRotationPoint(-53.25F, 3F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 2
		bodyModel[12].setRotationPoint(-55F, 4F, 10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 2
		bodyModel[13].setRotationPoint(34.75F, 3F, 10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 2
		bodyModel[14].setRotationPoint(33F, 4F, 10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 2
		bodyModel[15].setRotationPoint(-35.75F, 3F, 10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 2
		bodyModel[16].setRotationPoint(-35F, 4F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[17].setRotationPoint(-34.5F, 3F, 10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 60, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[18].setRotationPoint(-26.5F, 4F, 10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[19].setRotationPoint(60.5F, 3F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[20].setRotationPoint(60.5F, 4F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[21].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[22].setRotationPoint(54.5F, 4F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[23].setRotationPoint(52.25F, 3F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[24].setRotationPoint(53F, 4F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[25].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
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

		bodyModel[34].addShapeBox(0F, 0F, 0F, 40, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(-26.5F, 4F, -11F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[35].setRotationPoint(60.5F, 3F, -1.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[36].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[37].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[38].setRotationPoint(43F, 4F, -1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[39].setRotationPoint(-45F, 4F, -1F);

		bodyModel[40].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 2
		bodyModel[40].setRotationPoint(0.5F, 3F, 4F);

		bodyModel[41].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 2
		bodyModel[41].setRotationPoint(14.5F, 3F, 4F);

		bodyModel[42].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 52
		bodyModel[42].setRotationPoint(0.5F, 3F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 5, 4, 0F); // Box 2
		bodyModel[43].setRotationPoint(23.5F, 3F, 4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[44].setRotationPoint(-33.5F, 4F, 10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[45].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 2
		bodyModel[46].setRotationPoint(-28.5F, 3F, 5F);

		bodyModel[47].addBox(0F, 0F, 0F, 17, 4, 10, 0F); // Box 2
		bodyModel[47].setRotationPoint(-28.5F, 4F, -5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[48].setRotationPoint(-28.5F, 8F, -5F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 59
		bodyModel[49].setRotationPoint(-28.5F, 3F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[50].setRotationPoint(-24.5F, 3F, 7.25F);
		bodyModel[50].rotateAngleX = -0.78539816F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[51].setRotationPoint(-24.51F, 3F, 6.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[52].setRotationPoint(-16.49F, 3F, 6.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[53].setRotationPoint(-15.5F, 3F, 7.25F);
		bodyModel[53].rotateAngleX = -0.78539816F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[54].setRotationPoint(-15.51F, 3F, 6.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[55].setRotationPoint(-7.49F, 3F, 6.75F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[56].setRotationPoint(-31F, 3F, 4F);
		bodyModel[56].rotateAngleZ = -0.78539816F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[57].setRotationPoint(-31.5F, 3F, 3.99F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[58].setRotationPoint(-31.5F, 3F, 9.01F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[59].setRotationPoint(23.5F, 4F, 0F);
		bodyModel[59].rotateAngleX = -0.78539816F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[60].setRotationPoint(23.49F, 4F, -0.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[61].setRotationPoint(31.51F, 4F, -0.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[62].setRotationPoint(23.5F, 3F, -7F);
		bodyModel[62].rotateAngleX = -0.78539816F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[63].setRotationPoint(23.49F, 3F, -7.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[64].setRotationPoint(29.51F, 3F, -7.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[65].setRotationPoint(22.5F, 4F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39
		bodyModel[66].setRotationPoint(13.5F, 4F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[67].setRotationPoint(-16.5F, 3F, -7.25F);
		bodyModel[67].rotateAngleX = -0.78539816F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[68].setRotationPoint(-16.51F, 3F, -7.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[69].setRotationPoint(-12.49F, 3F, -7.75F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[70].setRotationPoint(-21F, 3F, -9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[71].setRotationPoint(56.5F, 1F, -10.99F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[72].setRotationPoint(56.5F, 1F, 4.99F);

		bodyModel[73].addShapeBox(0F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[73].setRotationPoint(56.51F, -14F, -10.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 38
		bodyModel[74].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 128
		bodyModel[75].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[76].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[77].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[78].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[79].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[80].setRotationPoint(56.51F, -14F, 10.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[81].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[82].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[83].setRotationPoint(55.5F, -15F, -3F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[84].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[85].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[86].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[86].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[87].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[87].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[88].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[88].setRotationPoint(55.51F, -14F, 3F);

		bodyModel[89].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[89].setRotationPoint(-60.49F, -14F, -3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[90].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[91].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[92].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[93].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[94].setRotationPoint(15.25F, 4F, -10.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[95].setRotationPoint(19.25F, 4F, -10.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[96].setRotationPoint(18.25F, 4F, -10.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -1.375F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, -1.375F, -0.5F, -0.25F, -0.375F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.25F, -0.375F, -0.5F); // Box 38
		bodyModel[97].setRotationPoint(14.25F, 3.75F, -10.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[98].setRotationPoint(15.55F, 4.2F, -10F);
		bodyModel[98].rotateAngleZ = -0.78539816F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[99].setRotationPoint(18.75F, 4.2F, -10F);
		bodyModel[99].rotateAngleZ = -0.78539816F;

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[100].setRotationPoint(15.05F, 3F, -5.99F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[101].setRotationPoint(18.25F, 3F, -5.99F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[102].setRotationPoint(18.25F, 3F, -9.99F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[103].setRotationPoint(15.05F, 3F, -9.99F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[104].setRotationPoint(56F, -6F, -12F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[105].setRotationPoint(61F, -6F, -12F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[106].setRotationPoint(56F, -6F, 11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[107].setRotationPoint(61F, -6F, 11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[108].setRotationPoint(-61F, -6F, -12F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[109].setRotationPoint(-61F, -6F, 11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[110].setRotationPoint(-61.5F, 6F, -10.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[111].setRotationPoint(-61.5F, 6F, 10.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[112].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[113].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[114].setRotationPoint(61.5F, -19F, -10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[115].setRotationPoint(61.5F, -20F, -7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[116].setRotationPoint(61.5F, -20F, -3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[117].setRotationPoint(61.5F, -15F, 11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[118].setRotationPoint(61.5F, -15F, 9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[119].setRotationPoint(61.5F, -19F, 7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[120].setRotationPoint(61.5F, -20F, 3F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[121].setRotationPoint(63F, -15F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[122].setRotationPoint(63F, -16F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[123].setRotationPoint(63F, 1F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[124].setRotationPoint(63F, -19F, -10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[125].setRotationPoint(63F, -20F, -7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[126].setRotationPoint(63F, -20F, -3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[127].setRotationPoint(63F, -19F, -1F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[128].setRotationPoint(63F, -18.75F, -5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[129].setRotationPoint(63F, -15F, 10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[130].setRotationPoint(63F, -16F, 9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[131].setRotationPoint(63F, -19F, 7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[132].setRotationPoint(63F, -20F, 3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[133].setRotationPoint(63F, -18.75F, 4F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[134].setRotationPoint(63F, -15F, -5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[135].setRotationPoint(63F, -16F, -4F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[136].setRotationPoint(63F, -16F, 1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[137].setRotationPoint(63F, -14F, -5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[138].setRotationPoint(63F, -14F, 3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[139].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[140].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[141].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[142].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[143].setRotationPoint(-63.5F, -15F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[144].setRotationPoint(-63F, -15F, -11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[145].setRotationPoint(-63.5F, -16F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[146].setRotationPoint(-63F, -15F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[147].setRotationPoint(-63.5F, 1F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[148].setRotationPoint(-63.5F, -19F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[149].setRotationPoint(-63F, -19F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[150].setRotationPoint(-63.5F, -20F, -7F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[151].setRotationPoint(-63F, -20F, -7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[152].setRotationPoint(-63.5F, -20F, -3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[153].setRotationPoint(-63F, -20F, -3F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[154].setRotationPoint(-63.5F, -19F, -1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[155].setRotationPoint(-63.5F, -18.75F, -5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[156].setRotationPoint(-63.5F, -15F, 10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[157].setRotationPoint(-63F, -15F, 11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[158].setRotationPoint(-63.5F, -16F, 9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[159].setRotationPoint(-63F, -15F, 9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[160].setRotationPoint(-63.5F, -19F, 7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[161].setRotationPoint(-63F, -19F, 7F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[162].setRotationPoint(-63.5F, -20F, 3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[163].setRotationPoint(-63F, -20F, 3F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[164].setRotationPoint(-63.5F, -18.75F, 4F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[165].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[166].setRotationPoint(-63.5F, -16F, -4F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[167].setRotationPoint(-63.5F, -16F, 1F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[168].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[169].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[170].setRotationPoint(-63F, -15F, -4F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[171].setRotationPoint(-63F, -14F, -4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[172].setRotationPoint(-63F, -14F, 3F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[173].setRotationPoint(-63F, 1F, -4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F); // Box 204
		bodyModel[174].setRotationPoint(45F, -19.36F, -8.36F);
		bodyModel[174].rotateAngleX = -1.04283423F;

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, -0.5F, 0F, -0.54F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[175].setRotationPoint(45F, -17.65F, -10.92F);
		bodyModel[175].rotateAngleX = -0.41887902F;

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 190
		bodyModel[176].setRotationPoint(-49.5F, -18F, -11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 191
		bodyModel[177].setRotationPoint(-49.5F, -18.5F, -10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F); // Box 128
		bodyModel[178].setRotationPoint(45F, -18.5F, 7.85F);
		bodyModel[178].rotateAngleX = 1.04283423F;

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.5F, 0F, -0.54F, -0.5F); // Box 128
		bodyModel[179].setRotationPoint(45F, -17.25F, 10F);
		bodyModel[179].rotateAngleX = 0.41887902F;

		bodyModel[180].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -1.1F, -0.75F, 0F, -0.5F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 275
		bodyModel[180].setRotationPoint(51.5F, -18F, 10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -1F, -0.85F, 0F, -0.5F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 276
		bodyModel[181].setRotationPoint(51.5F, -18.5F, 8F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 209
		bodyModel[182].setRotationPoint(-38.5F, -15F, -10F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 209
		bodyModel[183].setRotationPoint(-38.5F, -15F, 3F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 128
		bodyModel[184].setRotationPoint(35.5F, -15F, -5F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 209
		bodyModel[185].setRotationPoint(-57.5F, -15F, -10F);

		bodyModel[186].addBox(0F, 0F, 0F, 3, 16, 6, 0F); // Box 209
		bodyModel[186].setRotationPoint(-60.5F, -15F, -10F);

		bodyModel[187].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 128
		bodyModel[187].setRotationPoint(36.5F, -15F, -6F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 128
		bodyModel[188].setRotationPoint(43.5F, -15F, -6F);

		bodyModel[189].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // Box 128
		bodyModel[189].setRotationPoint(47.5F, -15F, -10F);

		bodyModel[190].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 38
		bodyModel[190].setRotationPoint(49.5F, -10F, -10F);

		bodyModel[191].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 38
		bodyModel[191].setRotationPoint(49.5F, -4F, -10F);

		bodyModel[192].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 128
		bodyModel[192].setRotationPoint(44.5F, -15F, 3F);

		bodyModel[193].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 128
		bodyModel[193].setRotationPoint(52.5F, -15F, 4F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 128
		bodyModel[194].setRotationPoint(48.5F, -15F, 4F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 73, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[195].setRotationPoint(-37.5F, -17F, -2F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[196].setRotationPoint(35.5F, -14F, -6F);

		bodyModel[197].addBox(0F, 0F, 0F, 73, 1, 3, 0F); // Box 38
		bodyModel[197].setRotationPoint(-37.5F, -14F, 7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 73, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[198].setRotationPoint(-37.5F, -13F, 9F);

		bodyModel[199].addBox(0F, 0F, 0F, 64, 1, 3, 0F); // Box 275
		bodyModel[199].setRotationPoint(-37.5F, -14F, -10F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[200].setRotationPoint(-37.5F, -13F, -10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[201].setRotationPoint(28.5F, -14F, -10F);

		bodyModel[202].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 275
		bodyModel[202].setRotationPoint(26.5F, -14F, -10F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 275
		bodyModel[203].setRotationPoint(26.5F, -14F, -8F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F); // Box 276
		bodyModel[204].setRotationPoint(26.5F, -13F, -10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[205].setRotationPoint(-32.5F, -16.5F, -0.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[206].setRotationPoint(-22.5F, -16.5F, -0.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[207].setRotationPoint(-12.5F, -16.5F, -0.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[208].setRotationPoint(-2.5F, -16.5F, -0.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[209].setRotationPoint(7.5F, -16.5F, -0.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[210].setRotationPoint(17.5F, -16.5F, -0.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[211].setRotationPoint(27.5F, -16.5F, -0.5F);

		bodyModel[212].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[212].setRotationPoint(-31.5F, -5F, 7F);
		bodyModel[212].rotateAngleY = -3.14159265F;

		bodyModel[213].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[213].setRotationPoint(-31.5F, -5F, 7F);
		bodyModel[213].rotateAngleY = -3.14159265F;

		bodyModel[214].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[214].setRotationPoint(-31.5F, -3F, 7F);
		bodyModel[214].rotateAngleY = -3.14159265F;

		bodyModel[215].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[215].setRotationPoint(-31.5F, -3F, 7F);
		bodyModel[215].rotateAngleY = -3.14159265F;

		bodyModel[216].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[216].setRotationPoint(-31.5F, -8F, 7F);
		bodyModel[216].rotateAngleY = -3.14159265F;

		bodyModel[217].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[217].setRotationPoint(-31.5F, -5F, 7F);
		bodyModel[217].rotateAngleY = -3.14159265F;

		bodyModel[218].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[218].setRotationPoint(-31.5F, -4F, 7F);
		bodyModel[218].rotateAngleY = -3.14159265F;

		bodyModel[219].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[219].setRotationPoint(-31.5F, -5F, 7F);
		bodyModel[219].rotateAngleY = -3.14159265F;

		bodyModel[220].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[220].setRotationPoint(-31.5F, -5F, -7F);
		bodyModel[220].rotateAngleY = -3.14159265F;

		bodyModel[221].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[221].setRotationPoint(-31.5F, -5F, -7F);
		bodyModel[221].rotateAngleY = -3.14159265F;

		bodyModel[222].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[222].setRotationPoint(-31.5F, -3F, -7F);
		bodyModel[222].rotateAngleY = -3.14159265F;

		bodyModel[223].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[223].setRotationPoint(-31.5F, -8F, -7F);
		bodyModel[223].rotateAngleY = -3.14159265F;

		bodyModel[224].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[224].setRotationPoint(-31.5F, -4F, -7F);
		bodyModel[224].rotateAngleY = -3.14159265F;

		bodyModel[225].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[225].setRotationPoint(-31.5F, -5F, -7F);
		bodyModel[225].rotateAngleY = -3.14159265F;

		bodyModel[226].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[226].setRotationPoint(-31.5F, -4F, -7F);
		bodyModel[226].rotateAngleY = -3.14159265F;

		bodyModel[227].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[227].setRotationPoint(-31.5F, -5F, -7F);
		bodyModel[227].rotateAngleY = -3.14159265F;

		bodyModel[228].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[228].setRotationPoint(-21.5F, -5F, 7F);
		bodyModel[228].rotateAngleY = -3.14159265F;

		bodyModel[229].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[229].setRotationPoint(-21.5F, -5F, 7F);
		bodyModel[229].rotateAngleY = -3.14159265F;

		bodyModel[230].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[230].setRotationPoint(-21.5F, -3F, 7F);
		bodyModel[230].rotateAngleY = -3.14159265F;

		bodyModel[231].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[231].setRotationPoint(-21.5F, -8F, 7F);
		bodyModel[231].rotateAngleY = -3.14159265F;

		bodyModel[232].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[232].setRotationPoint(-21.5F, -4F, 7F);
		bodyModel[232].rotateAngleY = -3.14159265F;

		bodyModel[233].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[233].setRotationPoint(-21.5F, -5F, 7F);
		bodyModel[233].rotateAngleY = -3.14159265F;

		bodyModel[234].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[234].setRotationPoint(-21.5F, -4F, 7F);
		bodyModel[234].rotateAngleY = -3.14159265F;

		bodyModel[235].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[235].setRotationPoint(-21.5F, -5F, 7F);
		bodyModel[235].rotateAngleY = -3.14159265F;

		bodyModel[236].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[236].setRotationPoint(-21.5F, -5F, -7F);
		bodyModel[236].rotateAngleY = -3.14159265F;

		bodyModel[237].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[237].setRotationPoint(-21.5F, -5F, -7F);
		bodyModel[237].rotateAngleY = -3.14159265F;

		bodyModel[238].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[238].setRotationPoint(-21.5F, -3F, -7F);
		bodyModel[238].rotateAngleY = -3.14159265F;

		bodyModel[239].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[239].setRotationPoint(-21.5F, -8F, -7F);
		bodyModel[239].rotateAngleY = -3.14159265F;

		bodyModel[240].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[240].setRotationPoint(-21.5F, -4F, -7F);
		bodyModel[240].rotateAngleY = -3.14159265F;

		bodyModel[241].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[241].setRotationPoint(-21.5F, -5F, -7F);
		bodyModel[241].rotateAngleY = -3.14159265F;

		bodyModel[242].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[242].setRotationPoint(-21.5F, -4F, -7F);
		bodyModel[242].rotateAngleY = -3.14159265F;

		bodyModel[243].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[243].setRotationPoint(-21.5F, -5F, -7F);
		bodyModel[243].rotateAngleY = -3.14159265F;

		bodyModel[244].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[244].setRotationPoint(-11.5F, -5F, 7F);
		bodyModel[244].rotateAngleY = -3.14159265F;

		bodyModel[245].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[245].setRotationPoint(-11.5F, -5F, 7F);
		bodyModel[245].rotateAngleY = -3.14159265F;

		bodyModel[246].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[246].setRotationPoint(-11.5F, -3F, 7F);
		bodyModel[246].rotateAngleY = -3.14159265F;

		bodyModel[247].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[247].setRotationPoint(-11.5F, -8F, 7F);
		bodyModel[247].rotateAngleY = -3.14159265F;

		bodyModel[248].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[248].setRotationPoint(-11.5F, -4F, 7F);
		bodyModel[248].rotateAngleY = -3.14159265F;

		bodyModel[249].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[249].setRotationPoint(-11.5F, -5F, 7F);
		bodyModel[249].rotateAngleY = -3.14159265F;

		bodyModel[250].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[250].setRotationPoint(-11.5F, -4F, 7F);
		bodyModel[250].rotateAngleY = -3.14159265F;

		bodyModel[251].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[251].setRotationPoint(-11.5F, -5F, 7F);
		bodyModel[251].rotateAngleY = -3.14159265F;

		bodyModel[252].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[252].setRotationPoint(-11.5F, -5F, -7F);
		bodyModel[252].rotateAngleY = -3.14159265F;

		bodyModel[253].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[253].setRotationPoint(-11.5F, -5F, -7F);
		bodyModel[253].rotateAngleY = -3.14159265F;

		bodyModel[254].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[254].setRotationPoint(-11.5F, -3F, -7F);
		bodyModel[254].rotateAngleY = -3.14159265F;

		bodyModel[255].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[255].setRotationPoint(-11.5F, -8F, -7F);
		bodyModel[255].rotateAngleY = -3.14159265F;

		bodyModel[256].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[256].setRotationPoint(-11.5F, -4F, -7F);
		bodyModel[256].rotateAngleY = -3.14159265F;

		bodyModel[257].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[257].setRotationPoint(-11.5F, -5F, -7F);
		bodyModel[257].rotateAngleY = -3.14159265F;

		bodyModel[258].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[258].setRotationPoint(-11.5F, -4F, -7F);
		bodyModel[258].rotateAngleY = -3.14159265F;

		bodyModel[259].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[259].setRotationPoint(-11.5F, -5F, -7F);
		bodyModel[259].rotateAngleY = -3.14159265F;

		bodyModel[260].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[260].setRotationPoint(-21.5F, -3F, 7F);
		bodyModel[260].rotateAngleY = -3.14159265F;

		bodyModel[261].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[261].setRotationPoint(-11.5F, -3F, 7F);
		bodyModel[261].rotateAngleY = -3.14159265F;

		bodyModel[262].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[262].setRotationPoint(-31.5F, -3F, -7F);
		bodyModel[262].rotateAngleY = -3.14159265F;

		bodyModel[263].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[263].setRotationPoint(-21.5F, -3F, -7F);
		bodyModel[263].rotateAngleY = -3.14159265F;

		bodyModel[264].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[264].setRotationPoint(-11.5F, -3F, -7F);
		bodyModel[264].rotateAngleY = -3.14159265F;

		bodyModel[265].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[265].setRotationPoint(-1.5F, -5F, 7F);
		bodyModel[265].rotateAngleY = -3.14159265F;

		bodyModel[266].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[266].setRotationPoint(-1.5F, -5F, 7F);
		bodyModel[266].rotateAngleY = -3.14159265F;

		bodyModel[267].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[267].setRotationPoint(-1.5F, -3F, 7F);
		bodyModel[267].rotateAngleY = -3.14159265F;

		bodyModel[268].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[268].setRotationPoint(-1.5F, -3F, 7F);
		bodyModel[268].rotateAngleY = -3.14159265F;

		bodyModel[269].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[269].setRotationPoint(-1.5F, -8F, 7F);
		bodyModel[269].rotateAngleY = -3.14159265F;

		bodyModel[270].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[270].setRotationPoint(-1.5F, -4F, 7F);
		bodyModel[270].rotateAngleY = -3.14159265F;

		bodyModel[271].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[271].setRotationPoint(-1.5F, -5F, 7F);
		bodyModel[271].rotateAngleY = -3.14159265F;

		bodyModel[272].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[272].setRotationPoint(-1.5F, -4F, 7F);
		bodyModel[272].rotateAngleY = -3.14159265F;

		bodyModel[273].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[273].setRotationPoint(-1.5F, -5F, 7F);
		bodyModel[273].rotateAngleY = -3.14159265F;

		bodyModel[274].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[274].setRotationPoint(-1.5F, -5F, -7F);
		bodyModel[274].rotateAngleY = -3.14159265F;

		bodyModel[275].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[275].setRotationPoint(-1.5F, -5F, -7F);
		bodyModel[275].rotateAngleY = -3.14159265F;

		bodyModel[276].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[276].setRotationPoint(-1.5F, -3F, -7F);
		bodyModel[276].rotateAngleY = -3.14159265F;

		bodyModel[277].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[277].setRotationPoint(-1.5F, -8F, -7F);
		bodyModel[277].rotateAngleY = -3.14159265F;

		bodyModel[278].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[278].setRotationPoint(-1.5F, -4F, -7F);
		bodyModel[278].rotateAngleY = -3.14159265F;

		bodyModel[279].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[279].setRotationPoint(-1.5F, -5F, -7F);
		bodyModel[279].rotateAngleY = -3.14159265F;

		bodyModel[280].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[280].setRotationPoint(-1.5F, -4F, -7F);
		bodyModel[280].rotateAngleY = -3.14159265F;

		bodyModel[281].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[281].setRotationPoint(-1.5F, -5F, -7F);
		bodyModel[281].rotateAngleY = -3.14159265F;

		bodyModel[282].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[282].setRotationPoint(8.5F, -5F, 7F);
		bodyModel[282].rotateAngleY = -3.14159265F;

		bodyModel[283].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[283].setRotationPoint(8.5F, -5F, 7F);
		bodyModel[283].rotateAngleY = -3.14159265F;

		bodyModel[284].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[284].setRotationPoint(8.5F, -3F, 7F);
		bodyModel[284].rotateAngleY = -3.14159265F;

		bodyModel[285].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[285].setRotationPoint(8.5F, -8F, 7F);
		bodyModel[285].rotateAngleY = -3.14159265F;

		bodyModel[286].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[286].setRotationPoint(8.5F, -4F, 7F);
		bodyModel[286].rotateAngleY = -3.14159265F;

		bodyModel[287].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[287].setRotationPoint(8.5F, -5F, 7F);
		bodyModel[287].rotateAngleY = -3.14159265F;

		bodyModel[288].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[288].setRotationPoint(8.5F, -4F, 7F);
		bodyModel[288].rotateAngleY = -3.14159265F;

		bodyModel[289].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[289].setRotationPoint(8.5F, -5F, 7F);
		bodyModel[289].rotateAngleY = -3.14159265F;

		bodyModel[290].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[290].setRotationPoint(8.5F, -5F, -7F);
		bodyModel[290].rotateAngleY = -3.14159265F;

		bodyModel[291].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[291].setRotationPoint(8.5F, -5F, -7F);
		bodyModel[291].rotateAngleY = -3.14159265F;

		bodyModel[292].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[292].setRotationPoint(8.5F, -3F, -7F);
		bodyModel[292].rotateAngleY = -3.14159265F;

		bodyModel[293].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[293].setRotationPoint(8.5F, -8F, -7F);
		bodyModel[293].rotateAngleY = -3.14159265F;

		bodyModel[294].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[294].setRotationPoint(8.5F, -4F, -7F);
		bodyModel[294].rotateAngleY = -3.14159265F;

		bodyModel[295].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[295].setRotationPoint(8.5F, -5F, -7F);
		bodyModel[295].rotateAngleY = -3.14159265F;

		bodyModel[296].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[296].setRotationPoint(8.5F, -4F, -7F);
		bodyModel[296].rotateAngleY = -3.14159265F;

		bodyModel[297].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[297].setRotationPoint(8.5F, -5F, -7F);
		bodyModel[297].rotateAngleY = -3.14159265F;

		bodyModel[298].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[298].setRotationPoint(18.5F, -5F, 7F);
		bodyModel[298].rotateAngleY = -3.14159265F;

		bodyModel[299].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[299].setRotationPoint(18.5F, -5F, 7F);
		bodyModel[299].rotateAngleY = -3.14159265F;

		bodyModel[300].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[300].setRotationPoint(18.5F, -3F, 7F);
		bodyModel[300].rotateAngleY = -3.14159265F;

		bodyModel[301].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[301].setRotationPoint(18.5F, -8F, 7F);
		bodyModel[301].rotateAngleY = -3.14159265F;

		bodyModel[302].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[302].setRotationPoint(18.5F, -4F, 7F);
		bodyModel[302].rotateAngleY = -3.14159265F;

		bodyModel[303].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[303].setRotationPoint(18.5F, -5F, 7F);
		bodyModel[303].rotateAngleY = -3.14159265F;

		bodyModel[304].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[304].setRotationPoint(18.5F, -4F, 7F);
		bodyModel[304].rotateAngleY = -3.14159265F;

		bodyModel[305].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[305].setRotationPoint(18.5F, -5F, 7F);
		bodyModel[305].rotateAngleY = -3.14159265F;

		bodyModel[306].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[306].setRotationPoint(18.5F, -5F, -7F);
		bodyModel[306].rotateAngleY = -3.14159265F;

		bodyModel[307].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[307].setRotationPoint(18.5F, -5F, -7F);
		bodyModel[307].rotateAngleY = -3.14159265F;

		bodyModel[308].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[308].setRotationPoint(18.5F, -3F, -7F);
		bodyModel[308].rotateAngleY = -3.14159265F;

		bodyModel[309].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[309].setRotationPoint(18.5F, -8F, -7F);
		bodyModel[309].rotateAngleY = -3.14159265F;

		bodyModel[310].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[310].setRotationPoint(18.5F, -4F, -7F);
		bodyModel[310].rotateAngleY = -3.14159265F;

		bodyModel[311].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[311].setRotationPoint(18.5F, -5F, -7F);
		bodyModel[311].rotateAngleY = -3.14159265F;

		bodyModel[312].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[312].setRotationPoint(18.5F, -4F, -7F);
		bodyModel[312].rotateAngleY = -3.14159265F;

		bodyModel[313].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[313].setRotationPoint(18.5F, -5F, -7F);
		bodyModel[313].rotateAngleY = -3.14159265F;

		bodyModel[314].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[314].setRotationPoint(8.5F, -3F, 7F);
		bodyModel[314].rotateAngleY = -3.14159265F;

		bodyModel[315].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[315].setRotationPoint(18.5F, -3F, 7F);
		bodyModel[315].rotateAngleY = -3.14159265F;

		bodyModel[316].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[316].setRotationPoint(-1.5F, -3F, -7F);
		bodyModel[316].rotateAngleY = -3.14159265F;

		bodyModel[317].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[317].setRotationPoint(8.5F, -3F, -7F);
		bodyModel[317].rotateAngleY = -3.14159265F;

		bodyModel[318].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[318].setRotationPoint(18.5F, -3F, -7F);
		bodyModel[318].rotateAngleY = -3.14159265F;

		bodyModel[319].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[319].setRotationPoint(28.5F, -3F, 7F);
		bodyModel[319].rotateAngleY = -3.14159265F;

		bodyModel[320].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[320].setRotationPoint(28.5F, -8F, 7F);
		bodyModel[320].rotateAngleY = -3.14159265F;

		bodyModel[321].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[321].setRotationPoint(28.5F, -3F, 7F);
		bodyModel[321].rotateAngleY = -3.14159265F;

		bodyModel[322].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 128
		bodyModel[322].setRotationPoint(29.5F, -5F, -10F);

		bodyModel[323].addBox(0F, 0F, 0F, 0, 4, 3, 0F); // Box 128
		bodyModel[323].setRotationPoint(30F, -9F, -10F);

		bodyModel[324].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 128
		bodyModel[324].setRotationPoint(30F, -10F, -10F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[325].setRotationPoint(30F, -10F, -8F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[326].setRotationPoint(-55.5F, -15F, 2.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[327].setRotationPoint(-55.5F, -15F, -4.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[328].setRotationPoint(-52.5F, -15F, -8F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[329].setRotationPoint(-48.5F, -15F, -8F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[330].setRotationPoint(-44.5F, -15F, -8F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[331].setRotationPoint(-41.5F, -15F, 2.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[332].setRotationPoint(-41.5F, -15F, -4.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[333].setRotationPoint(-52.5F, -15F, 6F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[334].setRotationPoint(-48.5F, -15F, 6F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[335].setRotationPoint(-44.5F, -15F, 6F);

		bodyModel[336].addShapeBox(-0.5F, 0F, 0F, 1, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209 inner door
		bodyModel[336].setRotationPoint(-38F, -15F, -3F);
		bodyModel[336].rotateAngleY = 1.48352986F;

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[337].setRotationPoint(30.5F, -7F, -9F);

		bodyModel[338].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 209
		bodyModel[338].setRotationPoint(-40.5F, -1F, -10F);

		bodyModel[339].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 209
		bodyModel[339].setRotationPoint(-43.5F, -1F, -10F);

		bodyModel[340].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 209
		bodyModel[340].setRotationPoint(-41.5F, -3F, -10F);

		bodyModel[341].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 209
		bodyModel[341].setRotationPoint(-44.5F, -3F, -10F);

		bodyModel[342].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 209
		bodyModel[342].setRotationPoint(-44.5F, -6F, -7F);

		bodyModel[343].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 209
		bodyModel[343].setRotationPoint(-44.5F, -5F, -3.71F);
		bodyModel[343].rotateAngleY = -0.78539816F;

		bodyModel[344].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 470
		bodyModel[344].setRotationPoint(-40.5F, -1F, 4F);

		bodyModel[345].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 471
		bodyModel[345].setRotationPoint(-43.5F, -1F, 8F);

		bodyModel[346].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 472
		bodyModel[346].setRotationPoint(-41.5F, -3F, 3F);

		bodyModel[347].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 473
		bodyModel[347].setRotationPoint(-44.5F, -3F, 7F);

		bodyModel[348].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 474
		bodyModel[348].setRotationPoint(-44.5F, -6F, 3F);

		bodyModel[349].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 475
		bodyModel[349].setRotationPoint(-44.5F, -5F, 3.71F);
		bodyModel[349].rotateAngleY = -0.78539816F;

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F); // Box 209
		bodyModel[350].setRotationPoint(-56.5F, -6F, -6.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 209
		bodyModel[351].setRotationPoint(-54.49F, -5F, -9F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Box 209
		bodyModel[352].setRotationPoint(-55.5F, -6F, -8F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[353].setRotationPoint(-54.5F, -6F, -10F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -2.5F, 0.75F, 0F, -2.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -2.5F, 0.75F, 0F, -2.5F); // Box 209
		bodyModel[354].setRotationPoint(-54.74F, -5F, -8F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 209
		bodyModel[355].setRotationPoint(-55.49F, -5F, -6.5F);
		bodyModel[355].rotateAngleY = 0.9250245F;

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[356].setRotationPoint(-56.5F, -6F, -10F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 209
		bodyModel[357].setRotationPoint(-56.5F, -6F, -8F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[358].setRotationPoint(-48.5F, -3F, -8F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 493
		bodyModel[359].setRotationPoint(-48.5F, -7F, -9F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -3F, 0F, -5.5F, -3F); // Box 498
		bodyModel[360].setRotationPoint(-45.5F, -4.5F, -9F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[361].setRotationPoint(-48.5F, -2.5F, -9F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 498
		bodyModel[362].setRotationPoint(-45.99F, -2.5F, -9.51F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 499
		bodyModel[363].setRotationPoint(-48.51F, -2.5F, -9.51F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[364].setRotationPoint(-48.51F, -4.5F, -9.01F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[365].setRotationPoint(-45.99F, -4.5F, -9.01F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[366].setRotationPoint(-53F, -3F, -8F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 493
		bodyModel[367].setRotationPoint(-53F, -7F, -9F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[368].setRotationPoint(-53F, -2.5F, -9F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 498
		bodyModel[369].setRotationPoint(-50.49F, -2.5F, -9.51F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 499
		bodyModel[370].setRotationPoint(-53.01F, -2.5F, -9.51F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[371].setRotationPoint(-53.01F, -4.5F, -9.01F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.22F, -0.5F, 0F, 0.22F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493
		bodyModel[372].setRotationPoint(-50.49F, -4.5F, -9.01F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[373].setRotationPoint(-48.5F, -3F, 4F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[374].setRotationPoint(-48.5F, -7F, 8F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[375].setRotationPoint(-48.5F, -2.5F, 8F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 533
		bodyModel[376].setRotationPoint(-45.99F, -2.5F, 8.51F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 534
		bodyModel[377].setRotationPoint(-48.51F, -2.5F, 8.51F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.22F, 0F, 0F, 0.22F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 535
		bodyModel[378].setRotationPoint(-45.99F, -4.5F, 8.01F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[379].setRotationPoint(-55F, -3F, -1.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[380].setRotationPoint(-56F, -7F, -1.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[381].setRotationPoint(-56F, -2.5F, -1.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 533
		bodyModel[382].setRotationPoint(-56.51F, -2.5F, 1.01F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 534
		bodyModel[383].setRotationPoint(-56.51F, -2.5F, -1.51F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.22F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.22F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 535
		bodyModel[384].setRotationPoint(-56.01F, -4.5F, 1.01F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.22F, 0F, 0F, 0.22F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[385].setRotationPoint(-48.51F, -4.5F, 8.01F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.22F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.22F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 546
		bodyModel[386].setRotationPoint(-56.01F, -4.5F, -1.51F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[387].setRotationPoint(53.5F, -6F, 9F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[388].setRotationPoint(53.5F, -6F, 8F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[389].setRotationPoint(54.5F, -6F, 8F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[390].setRotationPoint(49.55F, -2F, 8.55F);
		bodyModel[390].rotateAngleY = -0.78539816F;

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[391].setRotationPoint(49.9F, -1F, 8.9F);
		bodyModel[391].rotateAngleY = -0.78539816F;

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[392].setRotationPoint(54.87F, -4.5F, 8.63F);
		bodyModel[392].rotateAngleY = 0.78539816F;

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[393].setRotationPoint(49.55F, 0.5F, 8.55F);
		bodyModel[393].rotateAngleY = -0.78539816F;

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.85F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.35F, -0.5F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 cull
		bodyModel[394].setRotationPoint(51.5F, -4F, 9.49F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[395].setRotationPoint(47.05F, -2F, 9.95F);
		bodyModel[395].rotateAngleY = -2.35619449F;

		bodyModel[396].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[396].setRotationPoint(47.4F, -1F, 9.6F);
		bodyModel[396].rotateAngleY = -2.35619449F;

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[397].setRotationPoint(47.05F, 0.5F, 9.95F);
		bodyModel[397].rotateAngleY = -2.35619449F;

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[398].setRotationPoint(54.5F, -5F, 5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[399].setRotationPoint(41.5F, -6F, 9F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[400].setRotationPoint(41.5F, -6F, 8F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[401].setRotationPoint(42.5F, -6F, 8F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[402].setRotationPoint(42.87F, -4.5F, 8.63F);
		bodyModel[402].rotateAngleY = 0.78539816F;

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[403].setRotationPoint(36.5F, -6F, 9F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[404].setRotationPoint(37.5F, -6F, 8F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[405].setRotationPoint(36.5F, -6F, 8F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[406].setRotationPoint(37.47F, -4.5F, 8.63F);
		bodyModel[406].rotateAngleY = 0.78539816F;

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[407].setRotationPoint(42F, -6F, 1F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.35F, 0F, 0F, -0.85F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.35F, -0.5F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38 cull
		bodyModel[408].setRotationPoint(39.25F, -4F, 9.49F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[409].setRotationPoint(42.92F, -4.5F, 1.63F);
		bodyModel[409].rotateAngleY = 0.78539816F;

		bodyModel[410].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 cull
		bodyModel[410].setRotationPoint(39F, -15F, 9.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 cull
		bodyModel[411].setRotationPoint(51F, -15F, 9.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[412].setRotationPoint(41.5F, -13.5F, 9.5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[413].setRotationPoint(36.5F, -13.5F, 9.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[414].setRotationPoint(36.5F, -6F, -5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[415].setRotationPoint(36.5F, -15F, -5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[416].setRotationPoint(36.5F, -13F, -5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[417].setRotationPoint(37F, -3.5F, -3.5F);
		bodyModel[417].rotateAngleY = -0.78539816F;

		bodyModel[418].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 38 cull
		bodyModel[418].setRotationPoint(37F, -2.5F, -3.5F);
		bodyModel[418].rotateAngleY = -0.78539816F;

		bodyModel[419].addShapeBox(0F, 0F, 0F, 4, 0, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[419].setRotationPoint(37F, -1.25F, -3.5F);
		bodyModel[419].rotateAngleY = -0.78539816F;

		bodyModel[420].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38
		bodyModel[420].setRotationPoint(38.06F, -6F, -2.44F);
		bodyModel[420].rotateAngleY = -0.78539816F;

		bodyModel[421].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 128
		bodyModel[421].setRotationPoint(35.49F, -17F, -6F);

		bodyModel[422].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 128
		bodyModel[422].setRotationPoint(-37.49F, -17F, 4F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[423].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[424].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[425].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[426].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[427].addBox(0F, 0F, 0F, 123, 2, 6, 0F); // Box 128
		bodyModel[427].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[428].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[429].setRotationPoint(-61.5F, -19F, 3F);

		bodyModel[430].addBox(0F, 0F, 0F, 123, 1, 14, 0F); // Box 128
		bodyModel[430].setRotationPoint(-61.5F, -18F, -7F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 26, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[431].setRotationPoint(35.5F, -17F, -7F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 26, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[432].setRotationPoint(35.5F, -18F, -10F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 26, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[433].setRotationPoint(35.5F, -18F, 7F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 26, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[434].setRotationPoint(35.5F, -16.25F, -10F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 24, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[435].setRotationPoint(-61.5F, -17F, -7F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 24, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[436].setRotationPoint(-61.5F, -18F, -10F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 24, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[437].setRotationPoint(-61.5F, -18F, 7F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 24, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[438].setRotationPoint(-61.5F, -16.25F, -10F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 73, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[439].setRotationPoint(-37.5F, -18F, 7.25F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 73, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[440].setRotationPoint(-37.5F, -18F, -8.25F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 73, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[441].setRotationPoint(-37.5F, -16F, 8F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 73, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[442].setRotationPoint(-37.5F, -17F, 5.25F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 73, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[443].setRotationPoint(-37.5F, -16F, -10F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 73, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[444].setRotationPoint(-37.5F, -17F, -8.25F);

		bodyModel[445].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[445].setRotationPoint(28.5F, -5F, 7F);
		bodyModel[445].rotateAngleY = -3.14159265F;

		bodyModel[446].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[446].setRotationPoint(28.5F, -5F, 7F);
		bodyModel[446].rotateAngleY = -3.14159265F;

		bodyModel[447].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[447].setRotationPoint(28.5F, -4F, 7F);
		bodyModel[447].rotateAngleY = -3.14159265F;

		bodyModel[448].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[448].setRotationPoint(28.5F, -5F, 7F);
		bodyModel[448].rotateAngleY = -3.14159265F;

		bodyModel[449].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[449].setRotationPoint(28.5F, -4F, 7F);
		bodyModel[449].rotateAngleY = -3.14159265F;

		bodyModel[450].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[450].setRotationPoint(28.5F, -5F, 7F);
		bodyModel[450].rotateAngleY = -3.14159265F;

		bodyModel[451].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[451].setRotationPoint(-50.25F, -5F, -4.5F);

		bodyModel[452].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[452].setRotationPoint(-49.25F, -5.5F, -3.5F);
		bodyModel[452].rotateAngleY = -0.78539816F;

		bodyModel[453].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[453].setRotationPoint(-50.25F, 0.5F, -4.5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -3F, 0F, -5.5F, -3F); // Box 498
		bodyModel[454].setRotationPoint(-49F, -4.5F, -9F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -3F, 0F, -5.5F, -3F); // Box 498
		bodyModel[455].setRotationPoint(-50F, -4.5F, -9F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -3F, 0F, -5.5F, -3F); // Box 498
		bodyModel[456].setRotationPoint(-53.5F, -4.5F, -9F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -3F, -0.5F, -5.5F, -3F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 735
		bodyModel[457].setRotationPoint(-45.5F, -4.5F, 2F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 11, 7, 0F,0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -3F, -0.5F, -5.5F, -3F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 736
		bodyModel[458].setRotationPoint(-49F, -4.5F, 2F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 7, 11, 1, 0F,0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -0.5F, -3F, -5.5F, -0.5F, -3F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 498
		bodyModel[459].setRotationPoint(-56F, -4.5F, -2.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 7, 11, 1, 0F,0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, -0.5F, -3F, -5.5F, -0.5F, -3F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 498
		bodyModel[460].setRotationPoint(-56F, -4.5F, 1F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[461].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[462].setRotationPoint(-63.5F, -16F, 0F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[463].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[464].setRotationPoint(63F, -16F, -5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[465].setRotationPoint(63F, -16F, 0F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[466].setRotationPoint(63F, 1F, -5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[467].setRotationPoint(-61.5F, -1.5F, -12F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[468].setRotationPoint(-61.5F, -1.5F, 11F);

		bodyModel[469].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[469].setRotationPoint(-31.5F, -4F, 7F);
		bodyModel[469].rotateAngleY = -3.14159265F;

		bodyModel[470].addShapeBox(0F, 0F, 0F, 104, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[470].setRotationPoint(-56.5F, -10F, -9.9F);

		bodyModel[471].addBox(0F, 0F, 0F, 64, 0, 1, 0F); // Box 275 glow
		bodyModel[471].setRotationPoint(-37.5F, -12.99F, -8.5F);

		bodyModel[472].addBox(0F, 0F, 0F, 73, 0, 1, 0F); // Box 285 glow
		bodyModel[472].setRotationPoint(-37.5F, -12.99F, 7.5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 112, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[473].setRotationPoint(-56.5F, -10F, 9.9F);

		bodyModel[474].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 38
		bodyModel[474].setRotationPoint(-47.5F, -1.5F, -11.01F);

		bodyModel[475].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 452
		bodyModel[475].setRotationPoint(-47.5F, -1.5F, 11.01F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		bodyModel[476].setRotationPoint(-27.5F, 5F, 9.75F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 521
		bodyModel[477].setRotationPoint(-27.5F, 5F, -10.75F);

		bodyModel[478].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[478].setRotationPoint(56.5F, 3F, -4F);

		bodyModel[479].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[479].setRotationPoint(-60.5F, 3F, -4F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[480].setRotationPoint(35.5F, -15F, -10F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[481].setRotationPoint(35.5F, -15F, -6F);

		bodyModel[482].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 209
		bodyModel[482].setRotationPoint(-56.5F, -15F, 6F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[483].setRotationPoint(56.5F, 3F, -7.5F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[484].setRotationPoint(60.5F, 3F, -7.5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[485].setRotationPoint(60.5F, 3F, -10.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[486].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[487].setRotationPoint(60.5F, 4F, -10.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[488].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[489].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[490].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[491].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[491].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[492].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[492].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[493].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[493].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[494].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[494].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[495].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[495].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[496].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[496].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[497].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[497].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[498].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[498].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[499].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[499].setRotationPoint(60.49F, 4F, -8F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 329, 83, textureX, textureY); // Left step part
		bodyModel[501] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Left step part
		bodyModel[502] = new ModelRendererTurbo(this, 324, 86, textureX, textureY); // Box 1353
		bodyModel[503] = new ModelRendererTurbo(this, 340, 86, textureX, textureY); // Box 1354
		bodyModel[504] = new ModelRendererTurbo(this, 340, 84, textureX, textureY); // Box 1357
		bodyModel[505] = new ModelRendererTurbo(this, 324, 84, textureX, textureY); // Box 1358
		bodyModel[506] = new ModelRendererTurbo(this, 340, 90, textureX, textureY); // Box 1359
		bodyModel[507] = new ModelRendererTurbo(this, 324, 90, textureX, textureY); // Box 1360
		bodyModel[508] = new ModelRendererTurbo(this, 329, 87, textureX, textureY); // Box 1356
		bodyModel[509] = new ModelRendererTurbo(this, 331, 90, textureX, textureY); // Box 1355
		bodyModel[510] = new ModelRendererTurbo(this, 331, 100, textureX, textureY); // Right step part
		bodyModel[511] = new ModelRendererTurbo(this, 331, 104, textureX, textureY); // Right step part
		bodyModel[512] = new ModelRendererTurbo(this, 331, 94, textureX, textureY); // Right step part
		bodyModel[513] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Right step part
		bodyModel[514] = new ModelRendererTurbo(this, 329, 107, textureX, textureY); // Right step part
		bodyModel[515] = new ModelRendererTurbo(this, 326, 98, textureX, textureY); // Right step part
		bodyModel[516] = new ModelRendererTurbo(this, 340, 98, textureX, textureY); // Right step part
		bodyModel[517] = new ModelRendererTurbo(this, 326, 100, textureX, textureY); // Right step part
		bodyModel[518] = new ModelRendererTurbo(this, 340, 100, textureX, textureY); // Right step part
		bodyModel[519] = new ModelRendererTurbo(this, 326, 95, textureX, textureY); // Right step part
		bodyModel[520] = new ModelRendererTurbo(this, 340, 95, textureX, textureY); // Right step part

		bodyModel[500].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[500].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[501].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[501].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[502].setRotationPoint(56.5F, 3F, 4.5F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[503].setRotationPoint(60.5F, 3F, 4.5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[504].setRotationPoint(60.5F, 3F, 7.5F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[505].setRotationPoint(56.5F, 3F, 7.5F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1359
		bodyModel[506].setRotationPoint(60.5F, 4F, 7.5F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1360
		bodyModel[507].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[508].setRotationPoint(56.51F, 3F, 5F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[509].setRotationPoint(56.51F, 3F, 7F);

		bodyModel[510].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[510].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[511].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[511].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[512].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[512].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[513].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[513].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[514].addShapeBox(0F, 2F, 0.5F, 4, 0, 2, 0F,0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[514].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[515].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[515].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[516].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[516].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[517].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[517].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[518].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[518].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[519].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[519].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[520].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[520].setRotationPoint(60.49F, 4F, 8F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 521; i++)
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
		if(GetColor(entity)==124562){
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