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
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelBuddATSF50SeatCoach_Observation extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBuddATSF50SeatCoach_Observation() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[669];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 44, 116, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 322, 135, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 29, 123, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 46, 132, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 293, 119, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 57, 154, textureX, textureY); // Box 24
		bodyModel[11] = new ModelRendererTurbo(this, 66, 154, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 54, 62, textureX, textureY); // Left step part
		bodyModel[13] = new ModelRendererTurbo(this, 52, 65, textureX, textureY); // Left step part
		bodyModel[14] = new ModelRendererTurbo(this, 54, 68, textureX, textureY); // Left step part
		bodyModel[15] = new ModelRendererTurbo(this, 52, 71, textureX, textureY); // Left step part
		bodyModel[16] = new ModelRendererTurbo(this, 54, 77, textureX, textureY); // Left step part
		bodyModel[17] = new ModelRendererTurbo(this, 45, 79, textureX, textureY); // Left step part
		bodyModel[18] = new ModelRendererTurbo(this, 45, 77, textureX, textureY); // Left step part
		bodyModel[19] = new ModelRendererTurbo(this, 46, 74, textureX, textureY); // Left step part
		bodyModel[20] = new ModelRendererTurbo(this, 63, 79, textureX, textureY); // Left step part
		bodyModel[21] = new ModelRendererTurbo(this, 63, 77, textureX, textureY); // Left step part
		bodyModel[22] = new ModelRendererTurbo(this, 64, 74, textureX, textureY); // Left step part
		bodyModel[23] = new ModelRendererTurbo(this, 54, 74, textureX, textureY); // Left step part
		bodyModel[24] = new ModelRendererTurbo(this, 50, 81, textureX, textureY); // Left step part
		bodyModel[25] = new ModelRendererTurbo(this, 57, 163, textureX, textureY); // Box 144
		bodyModel[26] = new ModelRendererTurbo(this, 66, 163, textureX, textureY); // Box 145
		bodyModel[27] = new ModelRendererTurbo(this, 54, 87, textureX, textureY); // Right step part
		bodyModel[28] = new ModelRendererTurbo(this, 52, 90, textureX, textureY); // Right step part
		bodyModel[29] = new ModelRendererTurbo(this, 54, 93, textureX, textureY); // Right step part
		bodyModel[30] = new ModelRendererTurbo(this, 52, 96, textureX, textureY); // Right step part
		bodyModel[31] = new ModelRendererTurbo(this, 54, 102, textureX, textureY); // Right step part
		bodyModel[32] = new ModelRendererTurbo(this, 45, 100, textureX, textureY); // Right step part
		bodyModel[33] = new ModelRendererTurbo(this, 45, 98, textureX, textureY); // Right step part
		bodyModel[34] = new ModelRendererTurbo(this, 46, 95, textureX, textureY); // Right step part
		bodyModel[35] = new ModelRendererTurbo(this, 63, 100, textureX, textureY); // Right step part
		bodyModel[36] = new ModelRendererTurbo(this, 63, 98, textureX, textureY); // Right step part
		bodyModel[37] = new ModelRendererTurbo(this, 64, 95, textureX, textureY); // Right step part
		bodyModel[38] = new ModelRendererTurbo(this, 54, 99, textureX, textureY); // Right step part
		bodyModel[39] = new ModelRendererTurbo(this, 50, 106, textureX, textureY); // Right step part
		bodyModel[40] = new ModelRendererTurbo(this, 33, 114, textureX, textureY); // Left trapdoor
		bodyModel[41] = new ModelRendererTurbo(this, 35, 129, textureX, textureY); // Right trapdoor
		bodyModel[42] = new ModelRendererTurbo(this, 71, 69, textureX, textureY); // Left side door
		bodyModel[43] = new ModelRendererTurbo(this, 83, 68, textureX, textureY); // Box 38
		bodyModel[44] = new ModelRendererTurbo(this, 83, 87, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 28, 90, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 29, 56, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 45, 30, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 44, 5, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 71, 90, textureX, textureY); // Right side door
		bodyModel[50] = new ModelRendererTurbo(this, 35, 81, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 29, 17, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 72, 66, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 20, 75, textureX, textureY); // Vestibule door
		bodyModel[55] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[56] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[57] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[58] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[59] = new ModelRendererTurbo(this, 72, 233, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 72, 196, textureX, textureY); // Box 177
		bodyModel[61] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[63] = new ModelRendererTurbo(this, 32, 24, textureX, textureY); // Front gate closed
		bodyModel[64] = new ModelRendererTurbo(this, 29, 29, textureX, textureY); // Front gate open
		bodyModel[65] = new ModelRendererTurbo(this, 101, 7, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 96, 14, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 96, 2, textureX, textureY); // Box 176
		bodyModel[68] = new ModelRendererTurbo(this, 63, 3, textureX, textureY); // Box 128
		bodyModel[69] = new ModelRendererTurbo(this, 72, 202, textureX, textureY); // Box 128
		bodyModel[70] = new ModelRendererTurbo(this, 77, 148, textureX, textureY); // Box 2
		bodyModel[71] = new ModelRendererTurbo(this, 77, 151, textureX, textureY); // Box 2
		bodyModel[72] = new ModelRendererTurbo(this, 84, 151, textureX, textureY); // Box 2
		bodyModel[73] = new ModelRendererTurbo(this, 253, 148, textureX, textureY); // Box 2
		bodyModel[74] = new ModelRendererTurbo(this, 253, 151, textureX, textureY); // Box 2
		bodyModel[75] = new ModelRendererTurbo(this, 258, 148, textureX, textureY); // Box 2
		bodyModel[76] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[77] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[78] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[79] = new ModelRendererTurbo(this, 244, 151, textureX, textureY); // Box 2
		bodyModel[80] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[81] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[82] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[83] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[84] = new ModelRendererTurbo(this, 77, 138, textureX, textureY); // Box 24
		bodyModel[85] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 25
		bodyModel[86] = new ModelRendererTurbo(this, 84, 141, textureX, textureY); // Box 27
		bodyModel[87] = new ModelRendererTurbo(this, 253, 138, textureX, textureY); // Box 28
		bodyModel[88] = new ModelRendererTurbo(this, 253, 141, textureX, textureY); // Box 29
		bodyModel[89] = new ModelRendererTurbo(this, 258, 138, textureX, textureY); // Box 31
		bodyModel[90] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[91] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[92] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[93] = new ModelRendererTurbo(this, 244, 141, textureX, textureY); // Box 35
		bodyModel[94] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[95] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[96] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[97] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 39
		bodyModel[98] = new ModelRendererTurbo(this, 84, 148, textureX, textureY); // Box 2
		bodyModel[99] = new ModelRendererTurbo(this, 84, 138, textureX, textureY); // Box 41
		bodyModel[100] = new ModelRendererTurbo(this, 63, 155, textureX, textureY); // Box 26
		bodyModel[101] = new ModelRendererTurbo(this, 64, 158, textureX, textureY); // Box 26
		bodyModel[102] = new ModelRendererTurbo(this, 54, 155, textureX, textureY); // Box 26
		bodyModel[103] = new ModelRendererTurbo(this, 55, 158, textureX, textureY); // Box 26
		bodyModel[104] = new ModelRendererTurbo(this, 63, 164, textureX, textureY); // Box 140
		bodyModel[105] = new ModelRendererTurbo(this, 64, 167, textureX, textureY); // Box 141
		bodyModel[106] = new ModelRendererTurbo(this, 54, 164, textureX, textureY); // Box 142
		bodyModel[107] = new ModelRendererTurbo(this, 55, 167, textureX, textureY); // Box 143
		bodyModel[108] = new ModelRendererTurbo(this, 27, 3, textureX, textureY); // Box 128
		bodyModel[109] = new ModelRendererTurbo(this, 14, 31, textureX, textureY); // Box 128
		bodyModel[110] = new ModelRendererTurbo(this, 22, 14, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 15, 13, textureX, textureY); // Box 128
		bodyModel[113] = new ModelRendererTurbo(this, 8, 13, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 4, 1, textureX, textureY); // Box 128
		bodyModel[116] = new ModelRendererTurbo(this, 72, 228, textureX, textureY); // Box 128
		bodyModel[117] = new ModelRendererTurbo(this, 72, 187, textureX, textureY); // Box 193
		bodyModel[118] = new ModelRendererTurbo(this, 72, 224, textureX, textureY); // Box 128
		bodyModel[119] = new ModelRendererTurbo(this, 72, 192, textureX, textureY); // Box 194
		bodyModel[120] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[121] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 251, 157, textureX, textureY); // Box 2
		bodyModel[123] = new ModelRendererTurbo(this, 251, 166, textureX, textureY); // Box 2
		bodyModel[124] = new ModelRendererTurbo(this, 260, 174, textureX, textureY); // Box 41
		bodyModel[125] = new ModelRendererTurbo(this, 275, 175, textureX, textureY); // Box 41
		bodyModel[126] = new ModelRendererTurbo(this, 257, 175, textureX, textureY); // Box 41
		bodyModel[127] = new ModelRendererTurbo(this, 278, 174, textureX, textureY); // Box 283
		bodyModel[128] = new ModelRendererTurbo(this, 324, 175, textureX, textureY); // Box 41
		bodyModel[129] = new ModelRendererTurbo(this, 341, 176, textureX, textureY); // Box 41
		bodyModel[130] = new ModelRendererTurbo(this, 321, 176, textureX, textureY); // Box 41
		bodyModel[131] = new ModelRendererTurbo(this, 296, 154, textureX, textureY); // Box 283
		bodyModel[132] = new ModelRendererTurbo(this, 296, 163, textureX, textureY); // Box 283
		bodyModel[133] = new ModelRendererTurbo(this, 341, 164, textureX, textureY); // Box 513
		bodyModel[134] = new ModelRendererTurbo(this, 362, 164, textureX, textureY); // Box 513
		bodyModel[135] = new ModelRendererTurbo(this, 300, 171, textureX, textureY); // Box 2
		bodyModel[136] = new ModelRendererTurbo(this, 128, 1, textureX, textureY); // Box 205
		bodyModel[137] = new ModelRendererTurbo(this, 128, 5, textureX, textureY); // Box 205
		bodyModel[138] = new ModelRendererTurbo(this, 128, 17, textureX, textureY); // Box 128
		bodyModel[139] = new ModelRendererTurbo(this, 128, 12, textureX, textureY); // Box 205
		bodyModel[140] = new ModelRendererTurbo(this, 146, 2, textureX, textureY); // Box 38
		bodyModel[141] = new ModelRendererTurbo(this, 146, 6, textureX, textureY); // Box 38
		bodyModel[142] = new ModelRendererTurbo(this, 282, 106, textureX, textureY); // Box 2
		bodyModel[143] = new ModelRendererTurbo(this, 309, 118, textureX, textureY); // Box 2
		bodyModel[144] = new ModelRendererTurbo(this, 309, 122, textureX, textureY); // Box 174
		bodyModel[145] = new ModelRendererTurbo(this, 318, 109, textureX, textureY); // Box 2
		bodyModel[146] = new ModelRendererTurbo(this, 337, 111, textureX, textureY); // Box 2
		bodyModel[147] = new ModelRendererTurbo(this, 337, 117, textureX, textureY); // Box 161
		bodyModel[148] = new ModelRendererTurbo(this, 350, 114, textureX, textureY); // Box 2
		bodyModel[149] = new ModelRendererTurbo(this, 359, 106, textureX, textureY); // Box 2
		bodyModel[150] = new ModelRendererTurbo(this, 359, 113, textureX, textureY); // Box 163
		bodyModel[151] = new ModelRendererTurbo(this, 296, 321, textureX, textureY); // Box 38
		bodyModel[152] = new ModelRendererTurbo(this, 296, 318, textureX, textureY); // Box 38
		bodyModel[153] = new ModelRendererTurbo(this, 296, 286, textureX, textureY); // Box 156
		bodyModel[154] = new ModelRendererTurbo(this, 296, 283, textureX, textureY); // Box 157
		bodyModel[155] = new ModelRendererTurbo(this, 294, 68, textureX, textureY); // Box 38
		bodyModel[156] = new ModelRendererTurbo(this, 294, 87, textureX, textureY); // Box 175
		bodyModel[157] = new ModelRendererTurbo(this, 337, 72, textureX, textureY); // Box 38
		bodyModel[158] = new ModelRendererTurbo(this, 312, 67, textureX, textureY); // Box 2
		bodyModel[159] = new ModelRendererTurbo(this, 303, 70, textureX, textureY); // Box 38
		bodyModel[160] = new ModelRendererTurbo(this, 312, 86, textureX, textureY); // Box 176
		bodyModel[161] = new ModelRendererTurbo(this, 303, 89, textureX, textureY); // Box 177
		bodyModel[162] = new ModelRendererTurbo(this, 308, 41, textureX, textureY); // Box 128
		bodyModel[163] = new ModelRendererTurbo(this, 357, 43, textureX, textureY); // Box 128
		bodyModel[164] = new ModelRendererTurbo(this, 389, 44, textureX, textureY); // Box 128
		bodyModel[165] = new ModelRendererTurbo(this, 331, 42, textureX, textureY); // Box 128
		bodyModel[166] = new ModelRendererTurbo(this, 350, 46, textureX, textureY); // Box 128
		bodyModel[167] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 128
		bodyModel[168] = new ModelRendererTurbo(this, 285, 60, textureX, textureY); // Box 128
		bodyModel[169] = new ModelRendererTurbo(this, 287, 55, textureX, textureY); // Box 128
		bodyModel[170] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 128
		bodyModel[171] = new ModelRendererTurbo(this, 285, 25, textureX, textureY); // Box 185
		bodyModel[172] = new ModelRendererTurbo(this, 287, 29, textureX, textureY); // Box 186
		bodyModel[173] = new ModelRendererTurbo(this, 289, 34, textureX, textureY); // Box 187
		bodyModel[174] = new ModelRendererTurbo(this, 355, 65, textureX, textureY); // Box 2
		bodyModel[175] = new ModelRendererTurbo(this, 332, 62, textureX, textureY); // Box 128
		bodyModel[176] = new ModelRendererTurbo(this, 300, 61, textureX, textureY); // Box 38
		bodyModel[177] = new ModelRendererTurbo(this, 300, 24, textureX, textureY); // Box 203
		bodyModel[178] = new ModelRendererTurbo(this, 334, 49, textureX, textureY); // Box 128
		bodyModel[179] = new ModelRendererTurbo(this, 334, 38, textureX, textureY); // Box 208
		bodyModel[180] = new ModelRendererTurbo(this, 308, 49, textureX, textureY); // Box 128
		bodyModel[181] = new ModelRendererTurbo(this, 366, 31, textureX, textureY); // Box 219
		bodyModel[182] = new ModelRendererTurbo(this, 379, 31, textureX, textureY); // Box 220
		bodyModel[183] = new ModelRendererTurbo(this, 308, 35, textureX, textureY); // Box 221
		bodyModel[184] = new ModelRendererTurbo(this, 304, 29, textureX, textureY); // Box 222
		bodyModel[185] = new ModelRendererTurbo(this, 344, 40, textureX, textureY); // Box 223
		bodyModel[186] = new ModelRendererTurbo(this, 340, 33, textureX, textureY); // Box 229
		bodyModel[187] = new ModelRendererTurbo(this, 263, 138, textureX, textureY); // Box 31
		bodyModel[188] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 31
		bodyModel[189] = new ModelRendererTurbo(this, 278, 138, textureX, textureY); // Box 2
		bodyModel[190] = new ModelRendererTurbo(this, 263, 148, textureX, textureY); // Box 239
		bodyModel[191] = new ModelRendererTurbo(this, 272, 148, textureX, textureY); // Box 240
		bodyModel[192] = new ModelRendererTurbo(this, 278, 148, textureX, textureY); // Box 241
		bodyModel[193] = new ModelRendererTurbo(this, 260, 141, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[194] = new ModelRendererTurbo(this, 269, 141, textureX, textureY); // Box 31
		bodyModel[195] = new ModelRendererTurbo(this, 285, 140, textureX, textureY); // Box 2
		bodyModel[196] = new ModelRendererTurbo(this, 260, 151, textureX, textureY,"cull"); // Box 245 cull
		bodyModel[197] = new ModelRendererTurbo(this, 269, 151, textureX, textureY); // Box 246
		bodyModel[198] = new ModelRendererTurbo(this, 285, 150, textureX, textureY); // Box 247
		bodyModel[199] = new ModelRendererTurbo(this, 325, 84, textureX, textureY); // Box 38
		bodyModel[200] = new ModelRendererTurbo(this, 325, 103, textureX, textureY); // Box 327
		bodyModel[201] = new ModelRendererTurbo(this, 322, 84, textureX, textureY); // Box 38
		bodyModel[202] = new ModelRendererTurbo(this, 322, 103, textureX, textureY); // Box 251
		bodyModel[203] = new ModelRendererTurbo(this, 352, 76, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[204] = new ModelRendererTurbo(this, 296, 152, textureX, textureY); // Box 2
		bodyModel[205] = new ModelRendererTurbo(this, 296, 145, textureX, textureY); // Box 472
		bodyModel[206] = new ModelRendererTurbo(this, 295, 143, textureX, textureY); // Box 38
		bodyModel[207] = new ModelRendererTurbo(this, 295, 150, textureX, textureY); // Box 327
		bodyModel[208] = new ModelRendererTurbo(this, 421, 43, textureX, textureY); // Box 169
		bodyModel[209] = new ModelRendererTurbo(this, 426, 43, textureX, textureY); // Box 169
		bodyModel[210] = new ModelRendererTurbo(this, 419, 46, textureX, textureY); // Box 169
		bodyModel[211] = new ModelRendererTurbo(this, 416, 43, textureX, textureY); // Box 555
		bodyModel[212] = new ModelRendererTurbo(this, 426, 51, textureX, textureY); // Box 169
		bodyModel[213] = new ModelRendererTurbo(this, 416, 51, textureX, textureY); // Box 557
		bodyModel[214] = new ModelRendererTurbo(this, 421, 51, textureX, textureY); // Box 169
		bodyModel[215] = new ModelRendererTurbo(this, 432, 45, textureX, textureY, "lamp"); // Box 555 rear light
		bodyModel[216] = new ModelRendererTurbo(this, 435, 45, textureX, textureY, "lamp"); // Box 555 rear light
		bodyModel[217] = new ModelRendererTurbo(this, 430, 45, textureX, textureY, "lamp"); // Box 555 rear light
		bodyModel[218] = new ModelRendererTurbo(this, 429, 45, textureX, textureY, "lamp"); // Box 555 rear light
		bodyModel[219] = new ModelRendererTurbo(this, 435, 49, textureX, textureY, "lamp"); // Box 555 rear light
		bodyModel[220] = new ModelRendererTurbo(this, 429, 49, textureX, textureY, "lamp"); // Box 555 rear light
		bodyModel[221] = new ModelRendererTurbo(this, 432, 49, textureX, textureY, "lamp"); // Box 555 rear light
		bodyModel[222] = new ModelRendererTurbo(this, 323, 71, textureX, textureY, "lamp"); // marker light glow
		bodyModel[223] = new ModelRendererTurbo(this, 323, 88, textureX, textureY, "lamp"); // marker light glow
		bodyModel[224] = new ModelRendererTurbo(this, 330, 74, textureX, textureY); // Box 38
		bodyModel[225] = new ModelRendererTurbo(this, 323, 74, textureX, textureY); // Box 38
		bodyModel[226] = new ModelRendererTurbo(this, 330, 91, textureX, textureY); // Box 280
		bodyModel[227] = new ModelRendererTurbo(this, 323, 91, textureX, textureY); // Box 281
		bodyModel[228] = new ModelRendererTurbo(this, 320, 33, textureX, textureY); // Box 225
		bodyModel[229] = new ModelRendererTurbo(this, 372, 44, textureX, textureY); // Box 128
		bodyModel[230] = new ModelRendererTurbo(this, 375, 41, textureX, textureY); // Box 128
		bodyModel[231] = new ModelRendererTurbo(this, 373, 36, textureX, textureY); // Box 221
		bodyModel[232] = new ModelRendererTurbo(this, 330, 31, textureX, textureY); // Box 232
		bodyModel[233] = new ModelRendererTurbo(this, 356, 33, textureX, textureY); // Box 225
		bodyModel[234] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 225
		bodyModel[235] = new ModelRendererTurbo(this, 375, 50, textureX, textureY); // Box 258
		bodyModel[236] = new ModelRendererTurbo(this, 373, 53, textureX, textureY); // Box 259
		bodyModel[237] = new ModelRendererTurbo(this, 341, 50, textureX, textureY); // Box 260
		bodyModel[238] = new ModelRendererTurbo(this, 366, 58, textureX, textureY); // Box 261
		bodyModel[239] = new ModelRendererTurbo(this, 379, 58, textureX, textureY); // Box 262
		bodyModel[240] = new ModelRendererTurbo(this, 363, 55, textureX, textureY); // Box 263
		bodyModel[241] = new ModelRendererTurbo(this, 368, 55, textureX, textureY); // Box 264
		bodyModel[242] = new ModelRendererTurbo(this, 304, 55, textureX, textureY); // Box 265
		bodyModel[243] = new ModelRendererTurbo(this, 339, 56, textureX, textureY); // Box 266
		bodyModel[244] = new ModelRendererTurbo(this, 329, 54, textureX, textureY); // Box 267
		bodyModel[245] = new ModelRendererTurbo(this, 319, 56, textureX, textureY); // Box 268
		bodyModel[246] = new ModelRendererTurbo(this, 404, 42, textureX, textureY); // Box 38
		bodyModel[247] = new ModelRendererTurbo(this, 392, 50, textureX, textureY); // Box 128
		bodyModel[248] = new ModelRendererTurbo(this, 311, 61, textureX, textureY); // Box 38
		bodyModel[249] = new ModelRendererTurbo(this, 346, 67, textureX, textureY); // Box 38
		bodyModel[250] = new ModelRendererTurbo(this, 399, 42, textureX, textureY); // Box 128
		bodyModel[251] = new ModelRendererTurbo(this, 327, 62, textureX, textureY); // Box 2
		bodyModel[252] = new ModelRendererTurbo(this, 355, 61, textureX, textureY); // Box 2
		bodyModel[253] = new ModelRendererTurbo(this, 332, 25, textureX, textureY); // Box 289
		bodyModel[254] = new ModelRendererTurbo(this, 327, 25, textureX, textureY); // Box 290
		bodyModel[255] = new ModelRendererTurbo(this, 355, 26, textureX, textureY); // Box 291
		bodyModel[256] = new ModelRendererTurbo(this, 392, 41, textureX, textureY); // Box 292
		bodyModel[257] = new ModelRendererTurbo(this, 389, 53, textureX, textureY); // Box 128
		bodyModel[258] = new ModelRendererTurbo(this, 389, 35, textureX, textureY); // Box 295
		bodyModel[259] = new ModelRendererTurbo(this, 311, 24, textureX, textureY); // Box 296
		bodyModel[260] = new ModelRendererTurbo(this, 318, 62, textureX, textureY); // Box 2
		bodyModel[261] = new ModelRendererTurbo(this, 341, 62, textureX, textureY); // Box 38
		bodyModel[262] = new ModelRendererTurbo(this, 346, 61, textureX, textureY); // Box 2
		bodyModel[263] = new ModelRendererTurbo(this, 405, 58, textureX, textureY); // Box 38
		bodyModel[264] = new ModelRendererTurbo(this, 404, 51, textureX, textureY); // Box 2
		bodyModel[265] = new ModelRendererTurbo(this, 355, 19, textureX, textureY); // Box 304
		bodyModel[266] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Box 305
		bodyModel[267] = new ModelRendererTurbo(this, 341, 26, textureX, textureY); // Box 306
		bodyModel[268] = new ModelRendererTurbo(this, 346, 25, textureX, textureY); // Box 307
		bodyModel[269] = new ModelRendererTurbo(this, 318, 25, textureX, textureY); // Box 308
		bodyModel[270] = new ModelRendererTurbo(this, 405, 31, textureX, textureY); // Box 309
		bodyModel[271] = new ModelRendererTurbo(this, 404, 35, textureX, textureY); // Box 310
		bodyModel[272] = new ModelRendererTurbo(this, 93, 306, textureX, textureY); // Box 128
		bodyModel[273] = new ModelRendererTurbo(this, 275, 286, textureX, textureY); // Right seat part
		bodyModel[274] = new ModelRendererTurbo(this, 285, 276, textureX, textureY); // Right seat part
		bodyModel[275] = new ModelRendererTurbo(this, 268, 297, textureX, textureY); // Boc 42
		bodyModel[276] = new ModelRendererTurbo(this, 272, 281, textureX, textureY); // Right seat part
		bodyModel[277] = new ModelRendererTurbo(this, 283, 299, textureX, textureY); // Right seat part
		bodyModel[278] = new ModelRendererTurbo(this, 272, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[279] = new ModelRendererTurbo(this, 283, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[280] = new ModelRendererTurbo(this, 247, 286, textureX, textureY); // Right seat part
		bodyModel[281] = new ModelRendererTurbo(this, 257, 276, textureX, textureY); // Right seat part
		bodyModel[282] = new ModelRendererTurbo(this, 247, 321, textureX, textureY); // Left seat part
		bodyModel[283] = new ModelRendererTurbo(this, 257, 311, textureX, textureY); // Left seat part
		bodyModel[284] = new ModelRendererTurbo(this, 240, 297, textureX, textureY); // Boc 42
		bodyModel[285] = new ModelRendererTurbo(this, 240, 332, textureX, textureY); // Box 638
		bodyModel[286] = new ModelRendererTurbo(this, 244, 281, textureX, textureY); // Right seat part
		bodyModel[287] = new ModelRendererTurbo(this, 255, 299, textureX, textureY); // Right seat part
		bodyModel[288] = new ModelRendererTurbo(this, 255, 334, textureX, textureY); // Left seat part
		bodyModel[289] = new ModelRendererTurbo(this, 244, 316, textureX, textureY); // Left seat part
		bodyModel[290] = new ModelRendererTurbo(this, 244, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[291] = new ModelRendererTurbo(this, 255, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[292] = new ModelRendererTurbo(this, 255, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[293] = new ModelRendererTurbo(this, 244, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[294] = new ModelRendererTurbo(this, 219, 286, textureX, textureY); // Right seat part
		bodyModel[295] = new ModelRendererTurbo(this, 229, 276, textureX, textureY); // Right seat part
		bodyModel[296] = new ModelRendererTurbo(this, 219, 321, textureX, textureY); // Left seat part
		bodyModel[297] = new ModelRendererTurbo(this, 229, 311, textureX, textureY); // Left seat part
		bodyModel[298] = new ModelRendererTurbo(this, 212, 297, textureX, textureY); // Boc 42
		bodyModel[299] = new ModelRendererTurbo(this, 212, 332, textureX, textureY); // Box 638
		bodyModel[300] = new ModelRendererTurbo(this, 216, 281, textureX, textureY); // Right seat part
		bodyModel[301] = new ModelRendererTurbo(this, 227, 299, textureX, textureY); // Right seat part
		bodyModel[302] = new ModelRendererTurbo(this, 227, 334, textureX, textureY); // Left seat part
		bodyModel[303] = new ModelRendererTurbo(this, 216, 316, textureX, textureY); // Left seat part
		bodyModel[304] = new ModelRendererTurbo(this, 216, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[305] = new ModelRendererTurbo(this, 227, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[306] = new ModelRendererTurbo(this, 227, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[307] = new ModelRendererTurbo(this, 216, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[308] = new ModelRendererTurbo(this, 191, 286, textureX, textureY); // Right seat part
		bodyModel[309] = new ModelRendererTurbo(this, 201, 276, textureX, textureY); // Right seat part
		bodyModel[310] = new ModelRendererTurbo(this, 191, 321, textureX, textureY); // Left seat part
		bodyModel[311] = new ModelRendererTurbo(this, 201, 311, textureX, textureY); // Left seat part
		bodyModel[312] = new ModelRendererTurbo(this, 184, 297, textureX, textureY); // Boc 42
		bodyModel[313] = new ModelRendererTurbo(this, 184, 332, textureX, textureY); // Box 638
		bodyModel[314] = new ModelRendererTurbo(this, 188, 281, textureX, textureY); // Right seat part
		bodyModel[315] = new ModelRendererTurbo(this, 199, 299, textureX, textureY); // Right seat part
		bodyModel[316] = new ModelRendererTurbo(this, 199, 334, textureX, textureY); // Left seat part
		bodyModel[317] = new ModelRendererTurbo(this, 188, 316, textureX, textureY); // Left seat part
		bodyModel[318] = new ModelRendererTurbo(this, 188, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[319] = new ModelRendererTurbo(this, 199, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[320] = new ModelRendererTurbo(this, 199, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[321] = new ModelRendererTurbo(this, 188, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[322] = new ModelRendererTurbo(this, 163, 286, textureX, textureY); // Right seat part
		bodyModel[323] = new ModelRendererTurbo(this, 173, 276, textureX, textureY); // Right seat part
		bodyModel[324] = new ModelRendererTurbo(this, 163, 321, textureX, textureY); // Left seat part
		bodyModel[325] = new ModelRendererTurbo(this, 173, 311, textureX, textureY); // Left seat part
		bodyModel[326] = new ModelRendererTurbo(this, 156, 297, textureX, textureY); // Boc 42
		bodyModel[327] = new ModelRendererTurbo(this, 156, 332, textureX, textureY); // Box 638
		bodyModel[328] = new ModelRendererTurbo(this, 160, 281, textureX, textureY); // Right seat part
		bodyModel[329] = new ModelRendererTurbo(this, 171, 299, textureX, textureY); // Right seat part
		bodyModel[330] = new ModelRendererTurbo(this, 171, 334, textureX, textureY); // Left seat part
		bodyModel[331] = new ModelRendererTurbo(this, 160, 316, textureX, textureY); // Left seat part
		bodyModel[332] = new ModelRendererTurbo(this, 160, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[333] = new ModelRendererTurbo(this, 171, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[334] = new ModelRendererTurbo(this, 171, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[335] = new ModelRendererTurbo(this, 160, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[336] = new ModelRendererTurbo(this, 135, 286, textureX, textureY); // Right seat part
		bodyModel[337] = new ModelRendererTurbo(this, 145, 276, textureX, textureY); // Right seat part
		bodyModel[338] = new ModelRendererTurbo(this, 135, 321, textureX, textureY); // Left seat part test
		bodyModel[339] = new ModelRendererTurbo(this, 145, 311, textureX, textureY); // Left seat part test
		bodyModel[340] = new ModelRendererTurbo(this, 128, 297, textureX, textureY); // Boc 42
		bodyModel[341] = new ModelRendererTurbo(this, 128, 332, textureX, textureY); // Box 638
		bodyModel[342] = new ModelRendererTurbo(this, 132, 281, textureX, textureY); // Right seat part
		bodyModel[343] = new ModelRendererTurbo(this, 143, 299, textureX, textureY); // Right seat part
		bodyModel[344] = new ModelRendererTurbo(this, 143, 334, textureX, textureY); // Left seat part test
		bodyModel[345] = new ModelRendererTurbo(this, 132, 316, textureX, textureY); // Left seat part test
		bodyModel[346] = new ModelRendererTurbo(this, 132, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[347] = new ModelRendererTurbo(this, 143, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[348] = new ModelRendererTurbo(this, 143, 328, textureX, textureY,"cull"); // Left seat part cull test
		bodyModel[349] = new ModelRendererTurbo(this, 132, 310, textureX, textureY,"cull"); // Left seat part cull test
		bodyModel[350] = new ModelRendererTurbo(this, 275, 321, textureX, textureY); // Left seat part
		bodyModel[351] = new ModelRendererTurbo(this, 285, 311, textureX, textureY); // Left seat part
		bodyModel[352] = new ModelRendererTurbo(this, 268, 332, textureX, textureY); // Box 638
		bodyModel[353] = new ModelRendererTurbo(this, 283, 334, textureX, textureY); // Left seat part
		bodyModel[354] = new ModelRendererTurbo(this, 272, 316, textureX, textureY); // Left seat part
		bodyModel[355] = new ModelRendererTurbo(this, 283, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[356] = new ModelRendererTurbo(this, 272, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[357] = new ModelRendererTurbo(this, 119, 311, textureX, textureY); // Box 128
		bodyModel[358] = new ModelRendererTurbo(this, 257, 3, textureX, textureY); // Box 128
		bodyModel[359] = new ModelRendererTurbo(this, 210, 10, textureX, textureY); // Box 128
		bodyModel[360] = new ModelRendererTurbo(this, 210, 3, textureX, textureY); // Box 176
		bodyModel[361] = new ModelRendererTurbo(this, 135, 3, textureX, textureY); // Box 128
		bodyModel[362] = new ModelRendererTurbo(this, 16, 196, textureX, textureY); // Box 128
		bodyModel[363] = new ModelRendererTurbo(this, 1, 152, textureX, textureY); // Box 128
		bodyModel[364] = new ModelRendererTurbo(this, 22, 273, textureX, textureY); // Box 128
		bodyModel[365] = new ModelRendererTurbo(this, 55, 284, textureX, textureY); // Box 128
		bodyModel[366] = new ModelRendererTurbo(this, 3, 198, textureX, textureY); // Box 128
		bodyModel[367] = new ModelRendererTurbo(this, 3, 216, textureX, textureY); // Box 38
		bodyModel[368] = new ModelRendererTurbo(this, 6, 221, textureX, textureY); // Box 38
		bodyModel[369] = new ModelRendererTurbo(this, 5, 225, textureX, textureY); // Box 38
		bodyModel[370] = new ModelRendererTurbo(this, 28, 229, textureX, textureY); // Box 340
		bodyModel[371] = new ModelRendererTurbo(this, 30, 233, textureX, textureY); // Box 41
		bodyModel[372] = new ModelRendererTurbo(this, 28, 253, textureX, textureY); // Box 340
		bodyModel[373] = new ModelRendererTurbo(this, 30, 257, textureX, textureY); // Box 41
		bodyModel[374] = new ModelRendererTurbo(this, 29, 241, textureX, textureY); // Box 340
		bodyModel[375] = new ModelRendererTurbo(this, 30, 245, textureX, textureY); // Box 41
		bodyModel[376] = new ModelRendererTurbo(this, 37, 253, textureX, textureY); // Box 340
		bodyModel[377] = new ModelRendererTurbo(this, 39, 257, textureX, textureY); // Box 41
		bodyModel[378] = new ModelRendererTurbo(this, 49, 252, textureX, textureY); // Right seat part
		bodyModel[379] = new ModelRendererTurbo(this, 53, 234, textureX, textureY); // Right seat part
		bodyModel[380] = new ModelRendererTurbo(this, 50, 268, textureX, textureY); // Boc 42
		bodyModel[381] = new ModelRendererTurbo(this, 71, 257, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[382] = new ModelRendererTurbo(this, 69, 239, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[383] = new ModelRendererTurbo(this, 41, 314, textureX, textureY); // Box 128
		bodyModel[384] = new ModelRendererTurbo(this, 30, 321, textureX, textureY); // Box 128
		bodyModel[385] = new ModelRendererTurbo(this, 60, 327, textureX, textureY); // Box 340
		bodyModel[386] = new ModelRendererTurbo(this, 62, 331, textureX, textureY); // Box 41
		bodyModel[387] = new ModelRendererTurbo(this, 69, 327, textureX, textureY); // Box 340
		bodyModel[388] = new ModelRendererTurbo(this, 71, 331, textureX, textureY); // Box 41
		bodyModel[389] = new ModelRendererTurbo(this, 44, 249, textureX, textureY); // Right seat part
		bodyModel[390] = new ModelRendererTurbo(this, 46, 253, textureX, textureY); // Right seat part
		bodyModel[391] = new ModelRendererTurbo(this, 44, 261, textureX, textureY); // Right seat part
		bodyModel[392] = new ModelRendererTurbo(this, 78, 328, textureX, textureY); // Box 340
		bodyModel[393] = new ModelRendererTurbo(this, 79, 331, textureX, textureY); // Box 41
		bodyModel[394] = new ModelRendererTurbo(this, 37, 307, textureX, textureY); // Box 38
		bodyModel[395] = new ModelRendererTurbo(this, 52, 308, textureX, textureY); // Box 38
		bodyModel[396] = new ModelRendererTurbo(this, 52, 314, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[397] = new ModelRendererTurbo(this, 58, 303, textureX, textureY); // Box 38
		bodyModel[398] = new ModelRendererTurbo(this, 83, 278, textureX, textureY); // Box 340
		bodyModel[399] = new ModelRendererTurbo(this, 83, 272, textureX, textureY); // Box 340
		bodyModel[400] = new ModelRendererTurbo(this, 96, 303, textureX, textureY); // Box 402
		bodyModel[401] = new ModelRendererTurbo(this, 112, 303, textureX, textureY); // Box 402
		bodyModel[402] = new ModelRendererTurbo(this, 80, 307, textureX, textureY); // Right seat part
		bodyModel[403] = new ModelRendererTurbo(this, 83, 302, textureX, textureY); // Right seat part
		bodyModel[404] = new ModelRendererTurbo(this, 97, 309, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[405] = new ModelRendererTurbo(this, 69, 309, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[406] = new ModelRendererTurbo(this, 84, 323, textureX, textureY); // Right seat part
		bodyModel[407] = new ModelRendererTurbo(this, 86, 327, textureX, textureY); // Right seat part
		bodyModel[408] = new ModelRendererTurbo(this, 84, 335, textureX, textureY); // Right seat part
		bodyModel[409] = new ModelRendererTurbo(this, 201, 351, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[410] = new ModelRendererTurbo(this, 103, 239, textureX, textureY); // Box 38
		bodyModel[411] = new ModelRendererTurbo(this, 93, 257, textureX, textureY); // Box 275
		bodyModel[412] = new ModelRendererTurbo(this, 201, 357, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[413] = new ModelRendererTurbo(this, 105, 246, textureX, textureY); // Box 38
		bodyModel[414] = new ModelRendererTurbo(this, 107, 264, textureX, textureY); // Box 276
		bodyModel[415] = new ModelRendererTurbo(this, 94, 261, textureX, textureY, "lamp"); // Box 275 glow
		bodyModel[416] = new ModelRendererTurbo(this, 104, 243, textureX, textureY, "lamp"); // Box 285 glow
		bodyModel[417] = new ModelRendererTurbo(this, 80, 315, textureX, textureY); // Right seat part cull
		bodyModel[418] = new ModelRendererTurbo(this, 318, 303, textureX, textureY); // Box 38
		bodyModel[419] = new ModelRendererTurbo(this, 317, 317, textureX, textureY); // Box 38
		bodyModel[420] = new ModelRendererTurbo(this, 318, 300, textureX, textureY); // Box 435
		bodyModel[421] = new ModelRendererTurbo(this, 299, 301, textureX, textureY); // Box 38
		bodyModel[422] = new ModelRendererTurbo(this, 316, 326, textureX, textureY); // Box 38
		bodyModel[423] = new ModelRendererTurbo(this, 308, 325, textureX, textureY); // Box 38
		bodyModel[424] = new ModelRendererTurbo(this, 308, 320, textureX, textureY); // Box 38
		bodyModel[425] = new ModelRendererTurbo(this, 299, 320, textureX, textureY); // Box 38
		bodyModel[426] = new ModelRendererTurbo(this, 301, 325, textureX, textureY); // Box 38
		bodyModel[427] = new ModelRendererTurbo(this, 301, 317, textureX, textureY); // Box 38
		bodyModel[428] = new ModelRendererTurbo(this, 317, 295, textureX, textureY); // Box 443
		bodyModel[429] = new ModelRendererTurbo(this, 308, 292, textureX, textureY); // Box 444
		bodyModel[430] = new ModelRendererTurbo(this, 308, 296, textureX, textureY); // Box 445
		bodyModel[431] = new ModelRendererTurbo(this, 299, 296, textureX, textureY); // Box 446
		bodyModel[432] = new ModelRendererTurbo(this, 301, 293, textureX, textureY); // Box 447
		bodyModel[433] = new ModelRendererTurbo(this, 301, 301, textureX, textureY); // Box 448
		bodyModel[434] = new ModelRendererTurbo(this, 327, 297, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[435] = new ModelRendererTurbo(this, 327, 301, textureX, textureY, "lamp"); // Box 275 glow
		bodyModel[436] = new ModelRendererTurbo(this, 329, 305, textureX, textureY); // Box 41
		bodyModel[437] = new ModelRendererTurbo(this, 1, 175, textureX, textureY); // Box 128
		bodyModel[438] = new ModelRendererTurbo(this, 138, 339, textureX, textureY); // Box 128
		bodyModel[439] = new ModelRendererTurbo(this, 180, 389, textureX, textureY); // Left seat part
		bodyModel[440] = new ModelRendererTurbo(this, 190, 379, textureX, textureY); // Left seat part
		bodyModel[441] = new ModelRendererTurbo(this, 173, 400, textureX, textureY); // Box 638
		bodyModel[442] = new ModelRendererTurbo(this, 188, 402, textureX, textureY); // Left seat part
		bodyModel[443] = new ModelRendererTurbo(this, 177, 384, textureX, textureY); // Left seat part
		bodyModel[444] = new ModelRendererTurbo(this, 188, 396, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[445] = new ModelRendererTurbo(this, 177, 378, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[446] = new ModelRendererTurbo(this, 180, 354, textureX, textureY); // Right seat part
		bodyModel[447] = new ModelRendererTurbo(this, 190, 344, textureX, textureY); // Right seat part
		bodyModel[448] = new ModelRendererTurbo(this, 173, 365, textureX, textureY); // Boc 42
		bodyModel[449] = new ModelRendererTurbo(this, 177, 349, textureX, textureY); // Right seat part
		bodyModel[450] = new ModelRendererTurbo(this, 188, 367, textureX, textureY); // Right seat part
		bodyModel[451] = new ModelRendererTurbo(this, 177, 343, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[452] = new ModelRendererTurbo(this, 188, 361, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[453] = new ModelRendererTurbo(this, 164, 372, textureX, textureY); // Box 128
		bodyModel[454] = new ModelRendererTurbo(this, 416, 5, textureX, textureY); // Box 128
		bodyModel[455] = new ModelRendererTurbo(this, 403, 10, textureX, textureY); // Box 128
		bodyModel[456] = new ModelRendererTurbo(this, 403, 3, textureX, textureY); // Box 176
		bodyModel[457] = new ModelRendererTurbo(this, 362, 1, textureX, textureY); // Box 128
		bodyModel[458] = new ModelRendererTurbo(this, 82, 246, textureX, textureY); // Box 38
		bodyModel[459] = new ModelRendererTurbo(this, 84, 264, textureX, textureY); // Box 276
		bodyModel[460] = new ModelRendererTurbo(this, 201, 363, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[461] = new ModelRendererTurbo(this, 201, 369, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[462] = new ModelRendererTurbo(this, 35, 186, textureX, textureY); // Box 128
		bodyModel[463] = new ModelRendererTurbo(this, 73, 339, textureX, textureY); // Box 128
		bodyModel[464] = new ModelRendererTurbo(this, 108, 354, textureX, textureY); // Box 128
		bodyModel[465] = new ModelRendererTurbo(this, 18, 344, textureX, textureY); // Box 128
		bodyModel[466] = new ModelRendererTurbo(this, 51, 340, textureX, textureY); // Box 128
		bodyModel[467] = new ModelRendererTurbo(this, 23, 362, textureX, textureY); // Box 128
		bodyModel[468] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Box 340
		bodyModel[469] = new ModelRendererTurbo(this, 3, 366, textureX, textureY); // Box 41
		bodyModel[470] = new ModelRendererTurbo(this, 10, 362, textureX, textureY); // Box 38
		bodyModel[471] = new ModelRendererTurbo(this, 13, 367, textureX, textureY); // Box 38
		bodyModel[472] = new ModelRendererTurbo(this, 12, 371, textureX, textureY); // Box 38
		bodyModel[473] = new ModelRendererTurbo(this, 66, 350, textureX, textureY); // Box 340
		bodyModel[474] = new ModelRendererTurbo(this, 68, 354, textureX, textureY); // Box 41
		bodyModel[475] = new ModelRendererTurbo(this, 76, 374, textureX, textureY); // Box 340
		bodyModel[476] = new ModelRendererTurbo(this, 78, 378, textureX, textureY); // Box 41
		bodyModel[477] = new ModelRendererTurbo(this, 101, 340, textureX, textureY); // Box 340
		bodyModel[478] = new ModelRendererTurbo(this, 102, 344, textureX, textureY); // Box 41
		bodyModel[479] = new ModelRendererTurbo(this, 65, 375, textureX, textureY); // Box 38
		bodyModel[480] = new ModelRendererTurbo(this, 62, 382, textureX, textureY); // Box 38
		bodyModel[481] = new ModelRendererTurbo(this, 62, 388, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[482] = new ModelRendererTurbo(this, 68, 379, textureX, textureY); // Box 38
		bodyModel[483] = new ModelRendererTurbo(this, 36, 371, textureX, textureY); // Right seat part
		bodyModel[484] = new ModelRendererTurbo(this, 36, 362, textureX, textureY); // Right seat part
		bodyModel[485] = new ModelRendererTurbo(this, 49, 365, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[486] = new ModelRendererTurbo(this, 60, 365, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[487] = new ModelRendererTurbo(this, 36, 378, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[488] = new ModelRendererTurbo(this, 53, 375, textureX, textureY); // Right seat part
		bodyModel[489] = new ModelRendererTurbo(this, 55, 379, textureX, textureY); // Right seat part
		bodyModel[490] = new ModelRendererTurbo(this, 53, 387, textureX, textureY); // Right seat part
		bodyModel[491] = new ModelRendererTurbo(this, 1, 339, textureX, textureY); // Box 128
		bodyModel[492] = new ModelRendererTurbo(this, 222, 264, textureX, textureY); // Box 276
		bodyModel[493] = new ModelRendererTurbo(this, 210, 246, textureX, textureY); // Box 38
		bodyModel[494] = new ModelRendererTurbo(this, 201, 375, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[495] = new ModelRendererTurbo(this, 201, 381, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[496] = new ModelRendererTurbo(this, 482, 468, textureX, textureY); // Box 276
		bodyModel[497] = new ModelRendererTurbo(this, 477, 468, textureX, textureY); // Box 276
		bodyModel[498] = new ModelRendererTurbo(this, 493, 468, textureX, textureY); // Box 276
		bodyModel[499] = new ModelRendererTurbo(this, 482, 411, textureX, textureY); // Box 517

		bodyModel[0].addBox(0F, 0F, 0F, 104, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-52.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(-57.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(-56.5F, 1F, -5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[3].setRotationPoint(55.5F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 3, 6, 0F); // Box 2
		bodyModel[4].setRotationPoint(52.5F, 3F, -3F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[5].setRotationPoint(-59.5F, 3F, -1.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[6].setRotationPoint(-57.5F, 3F, -5F);

		bodyModel[7].addBox(0F, 0F, 0F, 105, 1, 4, 0F); // Box 2
		bodyModel[7].setRotationPoint(-52.5F, 3F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[8].setRotationPoint(40F, 4F, -1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[9].setRotationPoint(-42F, 4F, -1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[10].setRotationPoint(-56.51F, 3F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[11].setRotationPoint(-52.49F, 3F, -9F);

		bodyModel[12].addShapeBox(0F, 1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[12].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[13].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[13].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[14].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[14].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[15].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[15].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[16].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[16].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[17].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[17].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[18].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[19].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[19].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[20].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[20].setRotationPoint(-52.51F, 4F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[21].setRotationPoint(-52.51F, 4F, -8F);

		bodyModel[22].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[22].setRotationPoint(-52.51F, 4F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[23].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[24].addShapeBox(0F, 2F, -2.5F, 4, 0, 4, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 1F, -0.5F, 0F, 1F, -0.5F); // Left step part
		bodyModel[24].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 144
		bodyModel[25].setRotationPoint(-56.51F, 3F, 8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 145
		bodyModel[26].setRotationPoint(-52.49F, 3F, 8F);

		bodyModel[27].addShapeBox(0F, 1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[27].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[28].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[28].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[29].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[29].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[30].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[30].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[31].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[31].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[32].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[32].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[33].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[33].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[34].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[34].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[35].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[35].setRotationPoint(-52.51F, 4F, 8F);

		bodyModel[36].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[36].setRotationPoint(-52.51F, 4F, 8F);

		bodyModel[37].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[37].setRotationPoint(-52.51F, 4F, 8F);

		bodyModel[38].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[38].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[39].addShapeBox(0F, 2F, -1.5F, 4, 0, 4, 0F,0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[39].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[40].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[40].setRotationPoint(-52.5F, 1F, -10.99F);

		bodyModel[41].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[41].setRotationPoint(-52.5F, 1F, 4.99F);

		bodyModel[42].addShapeBox(-5F, 0F, -1F, 5, 15, 1, 0F,-1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Left side door
		bodyModel[42].setRotationPoint(-52.49F, -14F, -10.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 104, 16, 1, 0F); // Box 38
		bodyModel[43].setRotationPoint(-52.5F, -15F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 104, 16, 1, 0F); // Box 128
		bodyModel[44].setRotationPoint(-52.5F, -15F, 10F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[45].setRotationPoint(-52.5F, -15F, -10F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[46].setRotationPoint(-52.5F, -15F, 3F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[47].setRotationPoint(-57.5F, -15F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[48].setRotationPoint(-57.5F, -15F, 3F);

		bodyModel[49].addShapeBox(-5F, 0F, 0F, 5, 15, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Right side door
		bodyModel[49].setRotationPoint(-52.49F, -14F, 10.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[50].setRotationPoint(-52.5F, -15F, -3F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[51].setRotationPoint(-57.5F, -15F, -3F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[52].setRotationPoint(-56.5F, -15F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[53].setRotationPoint(-56.5F, -15F, 10F);

		bodyModel[54].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[54].setRotationPoint(-51.49F, -14F, -3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 104, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[55].setRotationPoint(-57.5F, -20F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 104, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[56].setRotationPoint(-57.5F, -19F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 104, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[57].setRotationPoint(-57.5F, -20F, 3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 104, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[58].setRotationPoint(-57.5F, -19F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[59].setRotationPoint(-57.5F, -19F, -7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[60].setRotationPoint(-57.5F, -19F, 3F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 104, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[61].setRotationPoint(-57.5F, -16F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 104, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[62].setRotationPoint(-57.5F, -16F, 10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate closed
		bodyModel[63].setRotationPoint(-57.5F, -7F, -3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate open
		bodyModel[64].setRotationPoint(-57.5F, -7F, 2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[65].setRotationPoint(-57.5F, -17F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[66].setRotationPoint(-57.5F, -18F, -10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 176
		bodyModel[67].setRotationPoint(-57.5F, -18F, 7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[68].setRotationPoint(-57.5F, -16.25F, -10F);

		bodyModel[69].addBox(0F, 0F, 0F, 109, 1, 14, 0F); // Box 128
		bodyModel[69].setRotationPoint(-57.5F, -18F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[70].setRotationPoint(-57.5F, 3F, 10.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[71].setRotationPoint(-57.5F, 4F, 10.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[72].setRotationPoint(-52.5F, 4F, 10.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[73].setRotationPoint(49.25F, 3F, 10.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[74].setRotationPoint(50F, 4F, 10.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[75].setRotationPoint(50.5F, 3F, 10.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[76].setRotationPoint(-50.25F, 3F, 10.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[77].setRotationPoint(-52F, 4F, 10.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[78].setRotationPoint(30.75F, 3F, 10.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[79].setRotationPoint(29F, 4F, 10.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[80].setRotationPoint(-31.75F, 3F, 10.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[81].setRotationPoint(-31F, 4F, 10.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 61, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[82].setRotationPoint(-30.5F, 3F, 10.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 59, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[83].setRotationPoint(-29.5F, 4F, 10.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[84].setRotationPoint(-57.5F, 3F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[85].setRotationPoint(-57.5F, 4F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[86].setRotationPoint(-52.5F, 4F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[87].setRotationPoint(49.25F, 3F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[88].setRotationPoint(50F, 4F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[89].setRotationPoint(50.5F, 3F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[90].setRotationPoint(-50.25F, 3F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[91].setRotationPoint(-52F, 4F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[92].setRotationPoint(30.75F, 3F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[93].setRotationPoint(29F, 4F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[94].setRotationPoint(-31.75F, 3F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[95].setRotationPoint(-31F, 4F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 61, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[96].setRotationPoint(-30.5F, 3F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 59, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[97].setRotationPoint(-29.5F, 4F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[98].setRotationPoint(-52.5F, 3F, 10.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[99].setRotationPoint(-52.5F, 3F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[100].setRotationPoint(-52.5F, 3F, -10.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[101].setRotationPoint(-52.5F, 4F, -10.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[102].setRotationPoint(-56.5F, 3F, -10.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[103].setRotationPoint(-56.5F, 4F, -10.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
		bodyModel[104].setRotationPoint(-52.5F, 3F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
		bodyModel[105].setRotationPoint(-52.5F, 4F, 8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[106].setRotationPoint(-56.5F, 3F, 7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 143
		bodyModel[107].setRotationPoint(-56.5F, 4F, 8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[108].setRotationPoint(-59F, -15F, -4F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[109].setRotationPoint(-59F, 1F, -4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[110].setRotationPoint(-59F, -14F, -4F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[111].setRotationPoint(-59F, -14F, 3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[112].setRotationPoint(-59.5F, -14F, -5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[113].setRotationPoint(-59.5F, -14F, 3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[114].setRotationPoint(-59.5F, 1F, -5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[115].setRotationPoint(-59.5F, -15F, -5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 103, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F); // Box 128
		bodyModel[116].setRotationPoint(-51.5F, -16F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 103, 1, 3, 0F,0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[117].setRotationPoint(-51.5F, -16F, 7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 103, 1, 2, 0F,0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[118].setRotationPoint(-51.5F, -18F, -9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 103, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[119].setRotationPoint(-51.5F, -18F, 6.7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 101, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[120].setRotationPoint(-57.5F, -20F, -3F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 109, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[121].setRotationPoint(-57.5F, -19F, -3F);

		bodyModel[122].addBox(0F, 0F, 0F, 16, 2, 6, 0F); // Box 2
		bodyModel[122].setRotationPoint(-26.5F, 4F, -3F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 16, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[123].setRotationPoint(-26.5F, 6F, -3F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[124].setRotationPoint(-22.5F, 2.75F, -8F);
		bodyModel[124].rotateAngleX = -0.78539816F;

		bodyModel[125].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[125].setRotationPoint(-22.51F, 3F, -8.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[126].setRotationPoint(-17.49F, 3F, -8.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 283
		bodyModel[127].setRotationPoint(-16.5F, 3F, -9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[128].setRotationPoint(23.5F, 4F, 0F);
		bodyModel[128].rotateAngleX = -0.78539816F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[129].setRotationPoint(23.49F, 4F, -0.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[130].setRotationPoint(29.51F, 4F, -0.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 17, 3, 5, 0F); // Box 283
		bodyModel[131].setRotationPoint(-8.5F, 3F, 5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 17, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 283
		bodyModel[132].setRotationPoint(-8.5F, 6F, 5F);

		bodyModel[133].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 513
		bodyModel[133].setRotationPoint(-15.5F, 3F, 4F);

		bodyModel[134].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 513
		bodyModel[134].setRotationPoint(-24.5F, 3F, 4F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[135].setRotationPoint(-8.5F, 6F, 10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0.09F, -0.75F, 0F, 0.09F, -0.75F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[136].setRotationPoint(-55.5F, -17.65F, -10.92F);
		bodyModel[136].rotateAngleX = -0.41887902F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 1.5F, -0.75F, 0F, 1.5F, -0.75F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2.05F, -0.75F, 0F, -2.05F, -0.75F, 0F, -2.13F, 0F, 0F, -2.13F, 0F); // Box 205
		bodyModel[137].setRotationPoint(-55.5F, -18.55F, -9.75F);
		bodyModel[137].rotateAngleX = -1.04719755F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.09F, -0.75F, 0F, 0.09F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F); // Box 128
		bodyModel[138].setRotationPoint(-55.5F, -17.25F, 10F);
		bodyModel[138].rotateAngleX = 0.41887902F;

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.75F, 0F, 1.5F, -0.75F, 0F, -2.13F, 0F, 0F, -2.13F, 0F, 0F, -2.05F, -0.75F, 0F, -2.05F, -0.75F); // Box 205
		bodyModel[139].setRotationPoint(-55.5F, -17.69F, 9.24F);
		bodyModel[139].rotateAngleX = 1.04719755F;

		bodyModel[140].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[140].setRotationPoint(-47.5F, -19F, -7F);
		bodyModel[140].rotateAngleX = 0.2443461F;

		bodyModel[141].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[141].setRotationPoint(-36.5F, -19F, -7F);
		bodyModel[141].rotateAngleX = 0.2443461F;

		bodyModel[142].addBox(0F, 0F, 0F, 3, 2, 20, 0F); // Box 2
		bodyModel[142].setRotationPoint(51.5F, 1F, -10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[143].setRotationPoint(51.5F, 1F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 174
		bodyModel[144].setRotationPoint(51.5F, 1F, 10F);

		bodyModel[145].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 2
		bodyModel[145].setRotationPoint(54.5F, 1F, -7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[146].setRotationPoint(54.5F, 1F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 161
		bodyModel[147].setRotationPoint(54.5F, 1F, 7F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 2
		bodyModel[148].setRotationPoint(56.5F, 1F, -3F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[149].setRotationPoint(56.5F, 1F, -7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[150].setRotationPoint(56.5F, 1F, 3F);

		bodyModel[151].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 38
		bodyModel[151].setRotationPoint(51.5F, -15F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -2.35F, 0F, 0F, -2.35F, 0F, 0F, 1.35F, 0F, 0F, 1.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[152].setRotationPoint(51.5F, -17F, -10F);

		bodyModel[153].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 156
		bodyModel[153].setRotationPoint(51.5F, -15F, 9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 1.35F, 0F, 0F, 1.35F, 0F, 0F, -2.35F, 0F, 0F, -2.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[154].setRotationPoint(51.5F, -17F, 9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, -0.55F, 0F, 0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.55F, 0F, 0.85F, 0F, 0F, 0F); // Box 38
		bodyModel[155].setRotationPoint(51.5F, -15F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, -0.55F, 0F, 0.85F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0.85F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 175
		bodyModel[156].setRotationPoint(51.5F, -15F, 10F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 14, 6, 0F); // Box 38
		bodyModel[157].setRotationPoint(56.5F, -13F, -3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,-0.3F, 0F, -0.55F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, -0.55F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[158].setRotationPoint(55.5F, -13F, -7F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 14, 1, 0F,-0.55F, 0F, -0.15F, -0.45F, 0F, -3.15F, -1.15F, 0F, 2.7F, 0F, 0F, 0F, -0.55F, 0F, -0.15F, -0.45F, 0F, -3.15F, -1.15F, 0F, 2.7F, 0F, 0F, 0F); // Box 38
		bodyModel[159].setRotationPoint(53.95F, -13F, -10.15F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.55F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.55F); // Box 176
		bodyModel[160].setRotationPoint(55.5F, -13F, 3F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 14, 1, 0F,0F, 0F, 0F, -1.15F, 0F, 2.7F, -0.45F, 0F, -3.15F, -0.55F, 0F, -0.15F, 0F, 0F, 0F, -1.15F, 0F, 2.7F, -0.45F, 0F, -3.15F, -0.55F, 0F, -0.15F); // Box 177
		bodyModel[161].setRotationPoint(53.95F, -13F, 9.15F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[162].setRotationPoint(46.5F, -20F, -3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 1.25F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 1.25F, 0F, -0.05F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.05F, 0F, 0F); // Box 128
		bodyModel[163].setRotationPoint(56.5F, -15F, -2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-1.7F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.7F, 1F, 0F, -0.65F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -2F, 0F); // Box 128
		bodyModel[164].setRotationPoint(53.5F, -16F, -2F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[165].setRotationPoint(51.5F, -19F, -2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0.3F, -1F, 0F, -1.3F, -0.5F, 0F, -1.3F, -0.5F, 0F, 0.3F, -1F, 0F); // Box 128
		bodyModel[166].setRotationPoint(55.5F, -17.5F, -2F);

		bodyModel[167].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 128
		bodyModel[167].setRotationPoint(43.5F, -20F, -3F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[168].setRotationPoint(46.5F, -16F, -11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1.75F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[169].setRotationPoint(46.5F, -19F, -10F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -1F, 0F, 0F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[170].setRotationPoint(46.5F, -20F, -7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 1.25F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[171].setRotationPoint(46.5F, -16F, 9F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 186
		bodyModel[172].setRotationPoint(46.5F, -19F, 7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 187
		bodyModel[173].setRotationPoint(46.5F, -20F, 3F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.335F, 0F, -0.51F, 0F, 0F, 0F, 1F, -1F, 0F, -1.05F, -1F, 0F, -0.35F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, -1.05F, 0F, 0F); // Box 2
		bodyModel[174].setRotationPoint(55.5F, -14F, -7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 1.25F, -1F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 1.25F, 0F, -0.05F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.05F, 0F, 0F); // Box 128
		bodyModel[175].setRotationPoint(56.5F, -15F, -3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, -1F, -0.55F, -0.25F, -0.15F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.55F, 0F, -0.15F, 0F, 0F, -1F); // Box 38
		bodyModel[176].setRotationPoint(51.5F, -17F, -11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -1F, -0.55F, -0.25F, -0.15F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, -0.55F, 0F, -0.15F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 203
		bodyModel[177].setRotationPoint(51.5F, -17F, 9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[178].setRotationPoint(51.5F, -19F, -3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 208
		bodyModel[179].setRotationPoint(51.5F, -19F, 2F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, -1.15F, -1.25F, 2.3F, 0F, -1.5F, -2F, 0F, 0F, -3F, 0F, -0.5F, 0F, -1.15F, -0.75F, 2.3F, 0F, -0.5F, -2F, 0F, -0.5F, -3F); // Box 128
		bodyModel[180].setRotationPoint(51.5F, -19F, -3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 1F, -3F, -0.55F, 0.75F, -2.15F, -0.55F, 0.75F, -0.85F, 0F, 1F, 0F, 0F, -2F, -0.65F, -1.8F, -2F, -0.2F, -0.55F, 0F, -0.85F, 0F, 0F, 0F); // Box 219
		bodyModel[181].setRotationPoint(51.5F, -16F, 7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.75F, -3F, -2.6F, 1F, 0.85F, -1.15F, 0.5F, -2.7F, 0F, 0.75F, 0F, 1.25F, -2F, -1.05F, -3.1F, -2F, 1.25F, -1.15F, 0F, -2.7F, 0F, 0F, 0F); // Box 220
		bodyModel[182].setRotationPoint(53.95F, -16F, 6.15F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -3F, 0F, -1.5F, -2F, -1.15F, -1.25F, 2.3F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -2F, -1.15F, -0.75F, 2.3F, 0F, -0.5F, 0F); // Box 221
		bodyModel[183].setRotationPoint(51.5F, -19F, 0F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -3F, -1.15F, -1.25F, -5.31F, -4F, -0.75F, 4F, 0.01F, 0F, 0F, 0F, 0F, -3F, -1.15F, 0F, -5.31F, -4F, 0F, 4F, 0.01F, 0F, 0F); // Box 222
		bodyModel[184].setRotationPoint(51.5F, -19F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.25F, 0F, -1F, -1.5F, 0F, -1.7F, -1.25F, 0.45F, 1.15F, 0F, -0.7F, 0.35F, -0.75F, 0F, -2.3F, -0.25F, 0F, -2.85F, -0.25F, -0.45F, 1.5F, -0.975F, -0.975F); // Box 223
		bodyModel[185].setRotationPoint(55.5F, -17.75F, 2F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.4F, 0.75F, 0.85F, -2.6F, 0.75F, 0.85F, -1.15F, -0.5F, -2.7F, 0F, -0.25F, 0F, -0.4F, -1.75F, 0.85F, -2.6F, -1.75F, 0.85F, -2.6F, -1F, -3.85F, 0F, -0.75F, 0F); // Box 229
		bodyModel[186].setRotationPoint(53.95F, -17F, 6.15F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0.4F, 0F, 0F, -0.5F); // Box 31
		bodyModel[187].setRotationPoint(51.5F, 3F, -11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, -3F, -1.4F, 0F, 2.3F, 0.25F, 0F, -0.6F, 0F, 0F, 0F, -1F, 0F, -3F, -1.4F, 0F, 2.3F, 0.25F, 0F, -0.6F); // Box 31
		bodyModel[188].setRotationPoint(54.5F, 3F, -10F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.9F, 0F, -0.3F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, -0.3F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[189].setRotationPoint(57F, 3F, -7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 239
		bodyModel[190].setRotationPoint(51.5F, 3F, 10F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, 0F, -0.6F, -1.4F, 0F, 2.3F, -1F, 0F, -3F, 0F, 0F, 0F, 0.25F, 0F, -0.6F, -1.4F, 0F, 2.3F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 240
		bodyModel[191].setRotationPoint(54.5F, 3F, 9F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.9F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.9F, 0F, -0.3F); // Box 241
		bodyModel[192].setRotationPoint(57F, 3F, 3F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -1.4F, -0.55F, 0F, 0.85F, 0F, 0F, 0F); // Box 31 cull
		bodyModel[193].setRotationPoint(51.5F, 4F, -11F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, -3F, -1.4F, 0F, 2.3F, 0.25F, 0F, -0.6F, 0.3F, 0F, -0.4F, -1.4F, 0F, -3.3F, -1.8F, 0F, 2.6F, 0.55F, 0F, -0.15F); // Box 31
		bodyModel[194].setRotationPoint(54.5F, 4F, -10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.9F, 0F, -0.3F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.3F, 0F, -0.6F, -1.9F, 0F, -0.3F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 2
		bodyModel[195].setRotationPoint(57F, 4F, -7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0.85F, -0.3F, 0F, -1.4F, 0F, 0F, -0.5F); // Box 245 cull
		bodyModel[196].setRotationPoint(51.5F, 4F, 10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.25F, 0F, -0.6F, -1.4F, 0F, 2.3F, -1F, 0F, -3F, 0F, 0F, 0F, 0.55F, 0F, -0.15F, -1.8F, 0F, 2.6F, -1.4F, 0F, -3.3F, 0.3F, 0F, -0.4F); // Box 246
		bodyModel[197].setRotationPoint(54.5F, 4F, 9F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.9F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.9F, 0F, -0.3F, 1.3F, 0F, -0.6F); // Box 247
		bodyModel[198].setRotationPoint(57F, 4F, 3F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.025F, 0F, 0.05F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0.025F, 0F, 0.05F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[199].setRotationPoint(51.81F, -2F, -11.95F);
		bodyModel[199].rotateAngleY = 0.32288591F;

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.025F, 0F, 0.05F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.025F, 0F, 0.05F); // Box 327
		bodyModel[200].setRotationPoint(51.5F, -2F, 11F);
		bodyModel[200].rotateAngleY = -0.32288591F;

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[201].setRotationPoint(50.7F, -2F, -12F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[202].setRotationPoint(50.7F, -2F, 11F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 0, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -4F, -4F); // Box 38 glow
		bodyModel[203].setRotationPoint(57.51F, -4F, -2F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[204].setRotationPoint(52F, 6F, 10.1F);
		bodyModel[204].rotateAngleY = -0.41015237F;

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[205].setRotationPoint(52F, 6F, -10.1F);
		bodyModel[205].rotateAngleY = 0.41015237F;

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0.05F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[206].setRotationPoint(51.81F, 6F, -11.45F);
		bodyModel[206].rotateAngleY = 0.32288591F;

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[207].setRotationPoint(51.5F, 6F, 10.5F);
		bodyModel[207].rotateAngleY = -0.32288591F;

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.02F, 0F, -0.3F, -0.5F, -0.35F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F); // Box 169
		bodyModel[208].setRotationPoint(55.8F, -17.15F, -0.35F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.02F, 0F, 0F, 0F, 0F, 0F, 0.15F, -0.65F, -0.35F, -0.5F, -0.65F, -0.35F, -0.5F, -0.35F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F); // Box 169
		bodyModel[209].setRotationPoint(55.8F, -17.15F, 0.35F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -1F, 0F, 0F, -1F, -0.3F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -1F, -0.3F, -0.4F, -1F); // Box 169
		bodyModel[210].setRotationPoint(56.3F, -16.5F, -1F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.65F, -0.35F, 0.15F, -0.65F, -0.35F, 0F, 0F, 0F, 0.02F, 0F, 0F, -0.5F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, 0F, -0.5F, -0.35F, 0F); // Box 555
		bodyModel[211].setRotationPoint(55.8F, -17.15F, -1.35F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.25F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.2F, -0.65F, -0.35F, -0.3F, -0.65F, -0.35F); // Box 169
		bodyModel[212].setRotationPoint(56.3F, -16.25F, 0.35F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.65F, -0.35F, -0.2F, -0.65F, -0.35F, -0.05F, 0F, 0F, -0.5F, 0F, 0F); // Box 557
		bodyModel[213].setRotationPoint(56.3F, -16.25F, -1.35F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.5F, -0.35F, 0F, -0.05F, -0.35F, 0F, -0.05F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F); // Box 169
		bodyModel[214].setRotationPoint(56.3F, -15.9F, -0.35F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.15F, -0.35F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F); // Box 555 rear light
		bodyModel[215].setRotationPoint(56.81F, -17.15F, -0.35F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.15F, -0.65F, -0.35F, -0.15F, -0.65F, -0.35F, -0.15F, -0.35F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F); // Box 555 rear light
		bodyModel[216].setRotationPoint(56.81F, -17.15F, 0.35F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.15F, -0.4F, 0F, 0.15F, -0.4F, 0F, 0.15F, -0.4F, -1F, -0.15F, -0.4F, -1F); // Box 555 rear light
		bodyModel[217].setRotationPoint(56.96F, -16.5F, -1F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,-0.15F, -0.65F, -0.35F, 0.15F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, 0F, -0.15F, -0.35F, 0F); // Box 555 rear light
		bodyModel[218].setRotationPoint(56.81F, -17.15F, -1.35F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 555 rear light
		bodyModel[219].setRotationPoint(57.11F, -16.25F, 0.35F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 555 rear light
		bodyModel[220].setRotationPoint(57.11F, -16.25F, -1.35F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.15F, -0.35F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F); // Box 555 rear light
		bodyModel[221].setRotationPoint(57.11F, -15.9F, -0.35F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.85F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.85F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F); // marker light glow
		bodyModel[222].setRotationPoint(50.95F, -13.85F, -11.9F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.45F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.85F, 0F, 0F, -0.45F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.85F, -0.25F, 0F); // marker light glow
		bodyModel[223].setRotationPoint(50.95F, -13.85F, 10.9F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.65F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.65F); // Box 38
		bodyModel[224].setRotationPoint(52.05F, -14.1F, -12.15F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.65F, -0.43F, 0.25F, -0.85F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.65F, -0.43F, -0.25F, -0.85F); // Box 38
		bodyModel[225].setRotationPoint(51.05F, -14.1F, -12.15F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, -0.65F, -0.5F, 0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.65F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 280
		bodyModel[226].setRotationPoint(52.05F, -14.1F, 10.15F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.43F, 0.25F, 0.15F, 0F, 0.25F, 0.35F, 0F, 0F, -1F, -1F, 0F, -1F, -0.43F, -0.25F, 0.15F, 0F, -0.25F, 0.35F, 0F, -0.75F, -1F, -1F, -0.75F, -1F); // Box 281
		bodyModel[227].setRotationPoint(51.05F, -14.1F, 11.15F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 1.25F, 0F, -3F, 1.25F, 0F, -0.55F, -0.25F, -0.85F, 0F, 0F, 0F, 0F, -1.1F, 0F, -3F, -1.1F, 0F, -0.55F, -0.75F, -0.85F, 0F, -1F, 0F); // Box 225
		bodyModel[228].setRotationPoint(51.5F, -17F, 7F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[229].setRotationPoint(51.5F, -17.5F, -2F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.375F, 0F, -0.9F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.325F, -0.5F, -0.92F, 0F, -0.5F, 0F); // Box 128
		bodyModel[230].setRotationPoint(51.5F, -17.5F, 2F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -3F, -0.375F, 0F, -2.1F, -1.5F, 0.225F, 2.025F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -2F, -0.85F, -0.5F, 2.55F, 0F, -0.5F, 0F); // Box 221
		bodyModel[231].setRotationPoint(51.5F, -17.5F, 0F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,2.45F, 1.25F, -0.85F, -2.6F, 0.75F, 0.85F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 2.45F, -1.1F, -0.85F, -2.6F, -1F, 0.845F, -3F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 232
		bodyModel[232].setRotationPoint(53.95F, -17F, 6.15F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0F, -1F, 0.1F, 0F, 0.2F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, -1F, 0F, -1F, -1F, 0F, 0.2F, -1F, -0.8F, 0F, -1F, 0.2F); // Box 225
		bodyModel[233].setRotationPoint(51.5F, -17F, 7F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.11F, 0.01F, -0.2F, -2F, 0.1F, 0F, -0.15F, 0F, -2.1F, -0.2F, 0F, -0.79F, -0.11F, -1F, -0.2F, -2F, -1F, 0F, -0.15F, -1F, -2.1F, -0.2F, -1F, -0.79F); // Box 225
		bodyModel[234].setRotationPoint(52.5F, -17F, 7F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.375F, 0F, -0.9F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.325F, -0.5F, -0.92F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 258
		bodyModel[235].setRotationPoint(51.5F, -17.5F, -3F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, -1.5F, 0.225F, 2.025F, -0.375F, 0F, -2.1F, 0F, 0F, -3F, 0F, -0.5F, 0F, -0.85F, -0.5F, 2.55F, 0F, -0.5F, -2F, 0F, -0.5F, -3F); // Box 259
		bodyModel[236].setRotationPoint(51.5F, -17.5F, -3F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,1.15F, 0F, -0.7F, -1.7F, -1.25F, 0.45F, -1F, -1.5F, 0F, 0F, -0.25F, 0F, 1.5F, -0.975F, -0.975F, -2.85F, -0.25F, -0.45F, -2.3F, -0.25F, 0F, 0.35F, -0.75F, 0F); // Box 260
		bodyModel[237].setRotationPoint(55.5F, -17.75F, -6F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 1F, 0F, -0.55F, 0.75F, -0.85F, -0.55F, 0.75F, -2.15F, 0F, 1F, -3F, 0F, 0F, 0F, -0.55F, 0F, -0.85F, -1.8F, -2F, -0.2F, 0F, -2F, -0.65F); // Box 261
		bodyModel[238].setRotationPoint(51.5F, -16F, -10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.75F, 0F, -1.15F, 0.5F, -2.7F, -2.6F, 1F, 0.85F, 0F, 0.75F, -3F, 0F, 0F, 0F, -1.15F, 0F, -2.7F, -3.1F, -2F, 1.25F, 1.25F, -2F, -1.05F); // Box 262
		bodyModel[239].setRotationPoint(53.95F, -16F, -9.15F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0.2F, 0F, -0.8F, -1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, 0.2F, 0.2F, -1F, -0.8F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 263
		bodyModel[240].setRotationPoint(51.5F, -17F, -8F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.8F, -0.15F, 0F, -2.1F, -2F, 0.1F, 0F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.8F, -0.15F, -1F, -2.1F, -2F, -1F, 0F, -0.2F, -1F, -0.2F); // Box 264
		bodyModel[241].setRotationPoint(52.5F, -17F, -8F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, -4F, -0.75F, 4F, -1.15F, -1.25F, -5.31F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F, 4F, -1.15F, 0F, -5.31F, 0F, 0F, -3F); // Box 265
		bodyModel[242].setRotationPoint(51.5F, -19F, -3F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.25F, 0F, -1.15F, -0.5F, -2.7F, -2.6F, 0.75F, 0.85F, -0.4F, 0.75F, 0.85F, 0F, -0.75F, 0F, -2.6F, -1F, -3.85F, -2.6F, -1.75F, 0.85F, -0.4F, -1.75F, 0.85F); // Box 266
		bodyModel[243].setRotationPoint(53.95F, -17F, -9.15F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.25F, 0F, -3F, -0.25F, 0F, -2.6F, 0.75F, 0.85F, 2.45F, 1.25F, -0.85F, 0F, -0.75F, 0F, -3F, -0.75F, 0F, -2.6F, -1F, 0.845F, 2.45F, -1.1F, -0.85F); // Box 267
		bodyModel[244].setRotationPoint(53.95F, -17F, -9.15F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.55F, -0.25F, -0.85F, -3F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, 0F, -0.55F, -0.75F, -0.85F, -3F, -1.1F, 0F, 0F, -1.1F, 0F); // Box 268
		bodyModel[245].setRotationPoint(51.5F, -17F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[246].setRotationPoint(56.5F, -15F, -3F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1.7F, 1F, -0.45F, -0.16F, 0.305F, 0.55F, 0F, 0.25F, -0.55F, -1.7F, 1F, -0.55F, -0.65F, -2F, -0.45F, 0F, 0F, 0.55F, 0F, 0F, -0.55F, -0.65F, -2F, -0.55F); // Box 128
		bodyModel[247].setRotationPoint(53.5F, -16F, -2.45F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.55F, -1.25F, -0.15F, -0.7F, -1.25F, -3.35F, -1.15F, 0.25F, 1.7F, 0F, 0.5F, -1F, -0.55F, -0.75F, -0.15F, -0.7F, -0.75F, -3.35F, -1.15F, -0.75F, 1.7F, 0F, -0.75F, -1F); // Box 38
		bodyModel[248].setRotationPoint(53.95F, -16.25F, -10.15F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.55F, 0.5F, -0.15F, -0.45F, -0.5F, -3.15F, -1.125F, -0.5F, 2.65F, -0.05F, 0.5F, -0.07F, -0.55F, -0.5F, -0.15F, -0.45F, -0.5F, -3.15F, -1.1F, -0.5F, 2.65F, -0.05F, -0.5F, -0.07F); // Box 38
		bodyModel[249].setRotationPoint(53.95F, -14.5F, -10.15F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.975F, 0.25F, 0F, -0.975F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[250].setRotationPoint(56.5F, -16.25F, -2F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.16F, -0.195F, -1F, -0.65F, -1.5F, -1F, -0.615F, -1.5F, 0.615F, 0F, -0.25F, 1F, 0F, -0.5F, -1F, -0.65F, -0.5F, -1F, -0.625F, -0.5F, 0.61F, 0F, -0.5F, 0.6F); // Box 2
		bodyModel[251].setRotationPoint(56.5F, -16.5F, -4F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.35F, 1.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, 0F, -0.3825F, 1.5F, 0.615F, 0F, -2.5F, -1F, -1.95F, -0.5F, -1F, -1.95F, -0.5F, 0F, 0F, -2.5F, 0.6F); // Box 2
		bodyModel[252].setRotationPoint(56.5F, -13.5F, -4F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 1.25F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 1.25F, -1F, -0.05F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.05F, 0F, 0F); // Box 289
		bodyModel[253].setRotationPoint(56.5F, -15F, 2F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 1F, -0.615F, -1.5F, 0.615F, -0.65F, -1.5F, -1F, 0.16F, -0.195F, -1F, 0F, -0.5F, 0.6F, -0.625F, -0.5F, 0.61F, -0.65F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 290
		bodyModel[254].setRotationPoint(56.5F, -16.5F, 3F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3825F, 1.5F, 0.615F, -1F, -0.5F, 0F, -1F, -0.5F, -1F, -0.35F, 1.5F, -1F, 0F, -2.5F, 0.6F, -1.95F, -0.5F, 0F, -1.95F, -0.5F, -1F, 0F, -2.5F, -1F); // Box 291
		bodyModel[255].setRotationPoint(56.5F, -13.5F, 3F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1.7F, 1F, -0.55F, 0F, 0.25F, -0.55F, -0.16F, 0.305F, 0.55F, -1.7F, 1F, -0.45F, -0.65F, -2F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0.55F, -0.65F, -2F, -0.45F); // Box 292
		bodyModel[256].setRotationPoint(53.5F, -16F, 1.45F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-1.15F, 1F, -0.9F, -0.7F, 0.5F, 0F, -0.15F, 0.3F, -0.55F, -1.7F, 1F, 0.45F, -0.35F, -2F, -1.5F, -0.7F, 0F, 0F, 0F, 0F, -0.55F, -0.65F, -2F, 0.45F); // Box 128
		bodyModel[257].setRotationPoint(53.5F, -16F, -6.45F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-1.7F, 1F, 0.45F, -0.15F, 0.3F, -0.55F, -0.7F, 0.5F, 0F, -1.15F, 1F, -0.9F, -0.65F, -2F, 0.45F, 0F, 0F, -0.55F, -0.7F, 0F, 0F, -0.35F, -2F, -1.5F); // Box 295
		bodyModel[258].setRotationPoint(53.5F, -16F, 2.45F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.5F, -1F, -1.15F, 0.25F, 1.7F, -0.7F, -1.25F, -3.35F, -0.55F, -1.25F, -0.15F, 0F, -0.75F, -1F, -1.15F, -0.75F, 1.7F, -0.7F, -0.75F, -3.35F, -0.55F, -0.75F, -0.15F); // Box 296
		bodyModel[259].setRotationPoint(53.95F, -16.25F, 8.15F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.3F, 0F, -0.55F, -1.25F, -1.5F, -0.2F, -0.65F, -1.5F, 0F, -0.85F, -0.2F, 0F, -0.3F, 0.5F, -0.55F, -1.25F, 0.5F, -0.2F, -0.65F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 2
		bodyModel[260].setRotationPoint(55.5F, -16.5F, -7F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.55F, 0F, -0.15F, -0.45F, -1F, -3.15F, -0.7F, 0F, 2.35F, -0.55F, 0F, -0.85F, -0.05F, -1F, -0.92F, -1.125F, 0F, -3.65F, -1.125F, -1F, 2.675F, -0.05F, -1F, -0.07F); // Box 38
		bodyModel[261].setRotationPoint(53.95F, -15F, -10.15F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.75F, 0F, 0.3F, -1F, -1F, 0.5F, 0F, -2F, -0.5F, -1.35F, 0F, -0.5F, -0.325F, -1F, -0.025F, -1.665F, 0F, -0.01F, -0.95F, 1F, -0.5F, -1.05F, -1F, -0.5F); // Box 2
		bodyModel[262].setRotationPoint(55.5F, -15F, -6.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.05F, 0F, -0.925F, -1.13F, 0F, -3.675F, -1.15F, 0F, 2.7F, 0F, 0F, 0F, -0.05F, 0F, -0.925F, -1.1F, 0F, -3.65F, -1.15F, 0F, 2.7F, 0F, 0F, 0F); // Box 38
		bodyModel[263].setRotationPoint(53.95F, -15F, -10.15F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.3F, 0F, -0.55F, -0.675F, 0F, -0.525F, 0.05F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, -0.55F, -0.65F, 0F, -0.5F, 0.05F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[264].setRotationPoint(55.5F, -15F, -7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1.05F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -0.335F, 0F, -0.51F, -1.05F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.5F); // Box 304
		bodyModel[265].setRotationPoint(55.5F, -14F, 3F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.05F, 0.5F, -0.07F, -1.125F, -0.5F, 2.65F, -0.45F, -0.5F, -3.15F, -0.55F, 0.5F, -0.15F, -0.05F, -0.5F, -0.07F, -1.1F, -0.5F, 2.65F, -0.45F, -0.5F, -3.15F, -0.55F, -0.5F, -0.15F); // Box 305
		bodyModel[266].setRotationPoint(53.95F, -14.5F, 9.15F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.55F, 0F, -0.85F, -0.7F, 0F, 2.35F, -0.45F, -1F, -3.15F, -0.55F, 0F, -0.15F, -0.05F, -1F, -0.07F, -1.125F, -1F, 2.675F, -1.125F, 0F, -3.65F, -0.05F, -1F, -0.92F); // Box 306
		bodyModel[267].setRotationPoint(53.95F, -15F, 9.15F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1.35F, 0F, -0.5F, 0F, -2F, -0.5F, -1F, -1F, 0.5F, -0.75F, 0F, 0.3F, -1.05F, -1F, -0.5F, -0.95F, 1F, -0.5F, -1.665F, 0F, -0.01F, -0.325F, -1F, -0.025F); // Box 307
		bodyModel[268].setRotationPoint(55.5F, -15F, 2.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.85F, -0.2F, 0F, -0.65F, -1.5F, 0F, -1.25F, -1.5F, -0.2F, -0.3F, 0F, -0.55F, -1F, 0.5F, 0F, -0.65F, 0.5F, 0F, -1.25F, 0.5F, -0.2F, -0.3F, 0.5F, -0.55F); // Box 308
		bodyModel[269].setRotationPoint(55.5F, -16.5F, 3F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -1.15F, 0F, 2.7F, -1.13F, 0F, -3.675F, -0.05F, 0F, -0.925F, 0F, 0F, 0F, -1.15F, 0F, 2.7F, -1.1F, 0F, -3.65F, -0.05F, 0F, -0.925F); // Box 309
		bodyModel[270].setRotationPoint(53.95F, -15F, 9.15F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0.05F, 0F, 0F, -0.675F, 0F, -0.525F, -0.3F, 0F, -0.55F, -1F, 0F, 0F, 0.05F, 0F, 0F, -0.65F, 0F, -0.5F, -0.3F, 0F, -0.55F); // Box 310
		bodyModel[271].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[272].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 128
		bodyModel[272].setRotationPoint(-15.5F, -15F, -10F);

		bodyModel[273].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[273].setRotationPoint(46.5F, -3F, 7F);
		bodyModel[273].rotateAngleY = -3.14159265F;

		bodyModel[274].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[274].setRotationPoint(46.5F, -8F, 7F);
		bodyModel[274].rotateAngleY = -3.14159265F;

		bodyModel[275].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[275].setRotationPoint(45F, -1F, 5F);

		bodyModel[276].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[276].setRotationPoint(46.5F, -3F, 7F);
		bodyModel[276].rotateAngleY = -3.14159265F;

		bodyModel[277].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[277].setRotationPoint(46.5F, -3F, 7F);
		bodyModel[277].rotateAngleY = -3.14159265F;

		bodyModel[278].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[278].setRotationPoint(46.5F, -5F, 7F);
		bodyModel[278].rotateAngleY = -3.14159265F;

		bodyModel[279].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[279].setRotationPoint(46.5F, -5F, 7F);
		bodyModel[279].rotateAngleY = -3.14159265F;

		bodyModel[280].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[280].setRotationPoint(36.5F, -3F, 7F);
		bodyModel[280].rotateAngleY = -3.14159265F;

		bodyModel[281].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[281].setRotationPoint(36.5F, -8F, 7F);
		bodyModel[281].rotateAngleY = -3.14159265F;

		bodyModel[282].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[282].setRotationPoint(36.5F, -3F, -7F);
		bodyModel[282].rotateAngleY = -3.14159265F;

		bodyModel[283].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[283].setRotationPoint(36.5F, -8F, -7F);
		bodyModel[283].rotateAngleY = -3.14159265F;

		bodyModel[284].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[284].setRotationPoint(35F, -1F, 5F);

		bodyModel[285].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[285].setRotationPoint(35F, -1F, -9F);

		bodyModel[286].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[286].setRotationPoint(36.5F, -3F, 7F);
		bodyModel[286].rotateAngleY = -3.14159265F;

		bodyModel[287].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[287].setRotationPoint(36.5F, -3F, 7F);
		bodyModel[287].rotateAngleY = -3.14159265F;

		bodyModel[288].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[288].setRotationPoint(36.5F, -3F, -7F);
		bodyModel[288].rotateAngleY = -3.14159265F;

		bodyModel[289].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[289].setRotationPoint(36.5F, -3F, -7F);
		bodyModel[289].rotateAngleY = -3.14159265F;

		bodyModel[290].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[290].setRotationPoint(36.5F, -5F, 7F);
		bodyModel[290].rotateAngleY = -3.14159265F;

		bodyModel[291].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[291].setRotationPoint(36.5F, -5F, 7F);
		bodyModel[291].rotateAngleY = -3.14159265F;

		bodyModel[292].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[292].setRotationPoint(36.5F, -5F, -7F);
		bodyModel[292].rotateAngleY = -3.14159265F;

		bodyModel[293].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[293].setRotationPoint(36.5F, -5F, -7F);
		bodyModel[293].rotateAngleY = -3.14159265F;

		bodyModel[294].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[294].setRotationPoint(26.5F, -3F, 7F);
		bodyModel[294].rotateAngleY = -3.14159265F;

		bodyModel[295].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[295].setRotationPoint(26.5F, -8F, 7F);
		bodyModel[295].rotateAngleY = -3.14159265F;

		bodyModel[296].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[296].setRotationPoint(26.5F, -3F, -7F);
		bodyModel[296].rotateAngleY = -3.14159265F;

		bodyModel[297].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[297].setRotationPoint(26.5F, -8F, -7F);
		bodyModel[297].rotateAngleY = -3.14159265F;

		bodyModel[298].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[298].setRotationPoint(25F, -1F, 5F);

		bodyModel[299].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[299].setRotationPoint(25F, -1F, -9F);

		bodyModel[300].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[300].setRotationPoint(26.5F, -3F, 7F);
		bodyModel[300].rotateAngleY = -3.14159265F;

		bodyModel[301].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[301].setRotationPoint(26.5F, -3F, 7F);
		bodyModel[301].rotateAngleY = -3.14159265F;

		bodyModel[302].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[302].setRotationPoint(26.5F, -3F, -7F);
		bodyModel[302].rotateAngleY = -3.14159265F;

		bodyModel[303].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[303].setRotationPoint(26.5F, -3F, -7F);
		bodyModel[303].rotateAngleY = -3.14159265F;

		bodyModel[304].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[304].setRotationPoint(26.5F, -5F, 7F);
		bodyModel[304].rotateAngleY = -3.14159265F;

		bodyModel[305].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[305].setRotationPoint(26.5F, -5F, 7F);
		bodyModel[305].rotateAngleY = -3.14159265F;

		bodyModel[306].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[306].setRotationPoint(26.5F, -5F, -7F);
		bodyModel[306].rotateAngleY = -3.14159265F;

		bodyModel[307].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[307].setRotationPoint(26.5F, -5F, -7F);
		bodyModel[307].rotateAngleY = -3.14159265F;

		bodyModel[308].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[308].setRotationPoint(16.5F, -3F, 7F);
		bodyModel[308].rotateAngleY = -3.14159265F;

		bodyModel[309].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[309].setRotationPoint(16.5F, -8F, 7F);
		bodyModel[309].rotateAngleY = -3.14159265F;

		bodyModel[310].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[310].setRotationPoint(16.5F, -3F, -7F);
		bodyModel[310].rotateAngleY = -3.14159265F;

		bodyModel[311].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[311].setRotationPoint(16.5F, -8F, -7F);
		bodyModel[311].rotateAngleY = -3.14159265F;

		bodyModel[312].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[312].setRotationPoint(15F, -1F, 5F);

		bodyModel[313].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[313].setRotationPoint(15F, -1F, -9F);

		bodyModel[314].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[314].setRotationPoint(16.5F, -3F, 7F);
		bodyModel[314].rotateAngleY = -3.14159265F;

		bodyModel[315].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[315].setRotationPoint(16.5F, -3F, 7F);
		bodyModel[315].rotateAngleY = -3.14159265F;

		bodyModel[316].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[316].setRotationPoint(16.5F, -3F, -7F);
		bodyModel[316].rotateAngleY = -3.14159265F;

		bodyModel[317].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[317].setRotationPoint(16.5F, -3F, -7F);
		bodyModel[317].rotateAngleY = -3.14159265F;

		bodyModel[318].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[318].setRotationPoint(16.5F, -5F, 7F);
		bodyModel[318].rotateAngleY = -3.14159265F;

		bodyModel[319].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[319].setRotationPoint(16.5F, -5F, 7F);
		bodyModel[319].rotateAngleY = -3.14159265F;

		bodyModel[320].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[320].setRotationPoint(16.5F, -5F, -7F);
		bodyModel[320].rotateAngleY = -3.14159265F;

		bodyModel[321].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[321].setRotationPoint(16.5F, -5F, -7F);
		bodyModel[321].rotateAngleY = -3.14159265F;

		bodyModel[322].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[322].setRotationPoint(6.5F, -3F, 7F);
		bodyModel[322].rotateAngleY = -3.14159265F;

		bodyModel[323].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[323].setRotationPoint(6.5F, -8F, 7F);
		bodyModel[323].rotateAngleY = -3.14159265F;

		bodyModel[324].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[324].setRotationPoint(6.5F, -3F, -7F);
		bodyModel[324].rotateAngleY = -3.14159265F;

		bodyModel[325].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[325].setRotationPoint(6.5F, -8F, -7F);
		bodyModel[325].rotateAngleY = -3.14159265F;

		bodyModel[326].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[326].setRotationPoint(5F, -1F, 5F);

		bodyModel[327].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[327].setRotationPoint(5F, -1F, -9F);

		bodyModel[328].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[328].setRotationPoint(6.5F, -3F, 7F);
		bodyModel[328].rotateAngleY = -3.14159265F;

		bodyModel[329].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[329].setRotationPoint(6.5F, -3F, 7F);
		bodyModel[329].rotateAngleY = -3.14159265F;

		bodyModel[330].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[330].setRotationPoint(6.5F, -3F, -7F);
		bodyModel[330].rotateAngleY = -3.14159265F;

		bodyModel[331].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[331].setRotationPoint(6.5F, -3F, -7F);
		bodyModel[331].rotateAngleY = -3.14159265F;

		bodyModel[332].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[332].setRotationPoint(6.5F, -5F, 7F);
		bodyModel[332].rotateAngleY = -3.14159265F;

		bodyModel[333].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[333].setRotationPoint(6.5F, -5F, 7F);
		bodyModel[333].rotateAngleY = -3.14159265F;

		bodyModel[334].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[334].setRotationPoint(6.5F, -5F, -7F);
		bodyModel[334].rotateAngleY = -3.14159265F;

		bodyModel[335].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[335].setRotationPoint(6.5F, -5F, -7F);
		bodyModel[335].rotateAngleY = -3.14159265F;

		bodyModel[336].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[336].setRotationPoint(-3.5F, -3F, 7F);
		bodyModel[336].rotateAngleY = -3.14159265F;

		bodyModel[337].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[337].setRotationPoint(-3.5F, -8F, 7F);
		bodyModel[337].rotateAngleY = -3.14159265F;

		bodyModel[338].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part test
		bodyModel[338].setRotationPoint(-3.5F, -3F, -7F);
		bodyModel[338].rotateAngleY = -3.14159265F;

		bodyModel[339].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[339].setRotationPoint(-3.5F, -8F, -7F);
		bodyModel[339].rotateAngleY = -3.14159265F;

		bodyModel[340].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[340].setRotationPoint(-5F, -1F, 5F);

		bodyModel[341].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[341].setRotationPoint(-5F, -1F, -9F);

		bodyModel[342].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[342].setRotationPoint(-3.5F, -3F, 7F);
		bodyModel[342].rotateAngleY = -3.14159265F;

		bodyModel[343].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[343].setRotationPoint(-3.5F, -3F, 7F);
		bodyModel[343].rotateAngleY = -3.14159265F;

		bodyModel[344].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[344].setRotationPoint(-3.5F, -3F, -7F);
		bodyModel[344].rotateAngleY = -3.14159265F;

		bodyModel[345].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[345].setRotationPoint(-3.5F, -3F, -7F);
		bodyModel[345].rotateAngleY = -3.14159265F;

		bodyModel[346].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[346].setRotationPoint(-3.5F, -5F, 7F);
		bodyModel[346].rotateAngleY = -3.14159265F;

		bodyModel[347].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[347].setRotationPoint(-3.5F, -5F, 7F);
		bodyModel[347].rotateAngleY = -3.14159265F;

		bodyModel[348].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull test
		bodyModel[348].setRotationPoint(-3.5F, -5F, -7F);
		bodyModel[348].rotateAngleY = -3.14159265F;

		bodyModel[349].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull test
		bodyModel[349].setRotationPoint(-3.5F, -5F, -7F);
		bodyModel[349].rotateAngleY = -3.14159265F;

		bodyModel[350].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[350].setRotationPoint(46.5F, -3F, -7F);
		bodyModel[350].rotateAngleY = -3.14159265F;

		bodyModel[351].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[351].setRotationPoint(46.5F, -8F, -7F);
		bodyModel[351].rotateAngleY = -3.14159265F;

		bodyModel[352].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[352].setRotationPoint(45F, -1F, -9F);

		bodyModel[353].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[353].setRotationPoint(46.5F, -3F, -7F);
		bodyModel[353].rotateAngleY = -3.14159265F;

		bodyModel[354].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[354].setRotationPoint(46.5F, -3F, -7F);
		bodyModel[354].rotateAngleY = -3.14159265F;

		bodyModel[355].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[355].setRotationPoint(46.5F, -5F, -7F);
		bodyModel[355].rotateAngleY = -3.14159265F;

		bodyModel[356].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[356].setRotationPoint(46.5F, -5F, -7F);
		bodyModel[356].rotateAngleY = -3.14159265F;

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[357].setRotationPoint(-14.5F, -7F, -1F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 27, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[358].setRotationPoint(-51.5F, -17F, -7F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 27, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[359].setRotationPoint(-51.5F, -18F, -10F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 27, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 176
		bodyModel[360].setRotationPoint(-51.5F, -18F, 7F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 27, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[361].setRotationPoint(-51.5F, -16.25F, -10F);

		bodyModel[362].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 128
		bodyModel[362].setRotationPoint(-46.5F, -15F, -10F);

		bodyModel[363].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 128
		bodyModel[363].setRotationPoint(-51.5F, -15F, 4F);

		bodyModel[364].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 128
		bodyModel[364].setRotationPoint(-32.5F, -15F, -10F);

		bodyModel[365].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 128
		bodyModel[365].setRotationPoint(-45.5F, -15F, 5F);

		bodyModel[366].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 128
		bodyModel[366].setRotationPoint(-51.5F, -15F, -4F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 38
		bodyModel[367].setRotationPoint(-50.36F, -2F, -10.28F);
		bodyModel[367].rotateAngleY = 0.78539816F;

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 38
		bodyModel[368].setRotationPoint(-50.53F, -1F, -9.75F);
		bodyModel[368].rotateAngleY = 0.78539816F;

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[369].setRotationPoint(-49.83F, 0.5F, -9.75F);
		bodyModel[369].rotateAngleY = 0.78539816F;

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[370].setRotationPoint(-45.5F, -6F, 3F);

		bodyModel[371].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[371].setRotationPoint(-44.5F, -5F, 4F);
		bodyModel[371].rotateAngleY = -0.78539816F;

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[372].setRotationPoint(-45.5F, -6F, -10F);

		bodyModel[373].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[373].setRotationPoint(-44.5F, -5F, -9F);
		bodyModel[373].rotateAngleY = -0.78539816F;

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[374].setRotationPoint(-45.5F, -6F, -2F);

		bodyModel[375].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[375].setRotationPoint(-45F, -5F, -1F);
		bodyModel[375].rotateAngleY = -0.78539816F;

		bodyModel[376].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[376].setRotationPoint(-43F, -6F, -10F);

		bodyModel[377].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[377].setRotationPoint(-42F, -5F, -9F);
		bodyModel[377].rotateAngleY = -0.78539816F;

		bodyModel[378].addShapeBox(0F, 0F, 0F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[378].setRotationPoint(-37F, -3F, -9F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F); // Right seat part
		bodyModel[379].setRotationPoint(-34F, -6.5F, -9F);

		bodyModel[380].addBox(0F, 0F, 0F, 3, 2, 13, 0F); // Boc 42
		bodyModel[380].setRotationPoint(-36F, -1F, -9F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F); // Right seat part cull
		bodyModel[381].setRotationPoint(-36F, -5F, -10F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F); // Right seat part cull
		bodyModel[382].setRotationPoint(-36F, -5F, 4F);

		bodyModel[383].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[383].setRotationPoint(-27.5F, -15F, -10F);

		bodyModel[384].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 128
		bodyModel[384].setRotationPoint(-31.5F, -15F, -3F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[385].setRotationPoint(-26.5F, -6F, -10F);

		bodyModel[386].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[386].setRotationPoint(-25.5F, -5F, -9F);
		bodyModel[386].rotateAngleY = -0.78539816F;

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[387].setRotationPoint(-24F, -6F, -10F);

		bodyModel[388].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[388].setRotationPoint(-23F, -5F, -9F);
		bodyModel[388].rotateAngleY = -0.78539816F;

		bodyModel[389].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[389].setRotationPoint(-39.5F, -5F, -3.5F);

		bodyModel[390].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[390].setRotationPoint(-38.5F, -5.5F, -2.5F);
		bodyModel[390].rotateAngleY = -0.78539816F;

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[391].setRotationPoint(-39.5F, 0.5F, -3.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[392].setRotationPoint(-21.5F, -6F, -10F);

		bodyModel[393].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[393].setRotationPoint(-20.5F, -5F, -9.5F);
		bodyModel[393].rotateAngleY = -0.78539816F;

		bodyModel[394].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 38
		bodyModel[394].setRotationPoint(-31.5F, -5F, -1F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[395].setRotationPoint(-29.5F, -3F, 0.5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[396].setRotationPoint(-29.5F, -2F, 0.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[397].setRotationPoint(-27.5F, -5F, 0.5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 340
		bodyModel[398].setRotationPoint(-35.5F, -15F, -10F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 340
		bodyModel[399].setRotationPoint(-35.5F, -15F, 2F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 402
		bodyModel[400].setRotationPoint(-18.5F, -15F, 2F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 402
		bodyModel[401].setRotationPoint(-18.5F, -15F, -10F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[402].setRotationPoint(-20.5F, -3F, 0.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[403].setRotationPoint(-20.5F, -6.5F, 3.5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -1F, 0F, -4.5F, -1F); // Right seat part cull
		bodyModel[404].setRotationPoint(-16.5F, -4.5F, 1.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -1F, 0F, -4.5F, -1F); // Right seat part cull
		bodyModel[405].setRotationPoint(-21.5F, -4.5F, 1.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[406].setRotationPoint(-19.5F, -5F, -3.5F);

		bodyModel[407].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[407].setRotationPoint(-18.5F, -5.5F, -2.5F);
		bodyModel[407].rotateAngleY = -0.78539816F;

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[408].setRotationPoint(-19.5F, 0.5F, -3.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 61, 2, 3, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, -1F, 0F); // Box 38 cull
		bodyModel[409].setRotationPoint(-9.5F, -14F, 7F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 71, 0, 3, 0F,-0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38
		bodyModel[410].setRotationPoint(-19.5F, -13.01F, 7F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 76, 0, 3, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F); // Box 275
		bodyModel[411].setRotationPoint(-24.5F, -13.01F, -10F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 66, 2, 3, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F); // Box 275 cull
		bodyModel[412].setRotationPoint(-14.5F, -14F, -10F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 51, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[413].setRotationPoint(-9.5F, -13F, 9F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[414].setRotationPoint(-14.5F, -13F, -10F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 76, 0, 2, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 275 glow
		bodyModel[415].setRotationPoint(-24.5F, -12.99F, -9F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 71, 0, 2, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 285 glow
		bodyModel[416].setRotationPoint(-19.5F, -12.99F, 7F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[417].setRotationPoint(-20.5F, -1F, 0.5F);

		bodyModel[418].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 38
		bodyModel[418].setRotationPoint(55.5F, -5F, -3F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[419].setRotationPoint(55.5F, -5F, -4F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[420].setRotationPoint(55.5F, -5F, 3F);

		bodyModel[421].addBox(0F, 0F, 0F, 1, 6, 8, 0F); // Box 38
		bodyModel[421].setRotationPoint(54.5F, -5F, -4F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 38
		bodyModel[422].setRotationPoint(55.5F, -5F, -6.45F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.1F, -2F, 0F, -0.1F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[423].setRotationPoint(54.5F, -5F, -8.45F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 38
		bodyModel[424].setRotationPoint(54.5F, -5F, -6.45F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.65F, 0F, 0F, -0.65F); // Box 38
		bodyModel[425].setRotationPoint(54F, -5F, -7.35F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[426].setRotationPoint(54F, -5F, -8.35F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
		bodyModel[427].setRotationPoint(54F, -5F, -5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.55F, -0.2F, 0F, -0.55F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, -0.2F, 0F, -0.55F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[428].setRotationPoint(55.5F, -5F, 3.45F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.7F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 444
		bodyModel[429].setRotationPoint(54.5F, -5F, 6.45F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[430].setRotationPoint(54.5F, -5F, 3.45F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[431].setRotationPoint(54F, -5F, 4.35F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 447
		bodyModel[432].setRotationPoint(54F, -5F, 7.35F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[433].setRotationPoint(54F, -5F, 4F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.375F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0.125F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.375F, 0.125F, -0.5F, -0.375F); // Box 275 cull
		bodyModel[434].setRotationPoint(54.75F, -7.25F, -0.75F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.385F, -0.01F, -0.385F, -0.885F, -0.01F, -0.385F, -0.885F, -0.01F, -0.885F, -0.385F, -0.01F, -0.885F, -0.13F, -0.75F, -0.13F, -0.63F, -0.75F, -0.13F, -0.63F, -0.75F, -0.63F, -0.13F, -0.75F, -0.63F); // Box 275 glow
		bodyModel[435].setRotationPoint(54.75F, -7.25F, -0.75F);

		bodyModel[436].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 41
		bodyModel[436].setRotationPoint(55.5F, -7F, 0F);
		bodyModel[436].rotateAngleY = -0.78539816F;

		bodyModel[437].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 128
		bodyModel[437].setRotationPoint(-50.5F, -15F, 4F);

		bodyModel[438].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 128
		bodyModel[438].setRotationPoint(-25.5F, -15F, -10F);

		bodyModel[439].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[439].setRotationPoint(-13.5F, -3F, -7F);
		bodyModel[439].rotateAngleY = -3.14159265F;

		bodyModel[440].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[440].setRotationPoint(-13.5F, -8F, -7F);
		bodyModel[440].rotateAngleY = -3.14159265F;

		bodyModel[441].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[441].setRotationPoint(-15F, -1F, -9F);

		bodyModel[442].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[442].setRotationPoint(-13.5F, -3F, -7F);
		bodyModel[442].rotateAngleY = -3.14159265F;

		bodyModel[443].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[443].setRotationPoint(-13.5F, -3F, -7F);
		bodyModel[443].rotateAngleY = -3.14159265F;

		bodyModel[444].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[444].setRotationPoint(-13.5F, -5F, -7F);
		bodyModel[444].rotateAngleY = -3.14159265F;

		bodyModel[445].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[445].setRotationPoint(-13.5F, -5F, -7F);
		bodyModel[445].rotateAngleY = -3.14159265F;

		bodyModel[446].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[446].setRotationPoint(-13.5F, -3F, 7F);
		bodyModel[446].rotateAngleY = -3.14159265F;

		bodyModel[447].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[447].setRotationPoint(-13.5F, -8F, 7F);
		bodyModel[447].rotateAngleY = -3.14159265F;

		bodyModel[448].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[448].setRotationPoint(-15F, -1F, 5F);

		bodyModel[449].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[449].setRotationPoint(-13.5F, -3F, 7F);
		bodyModel[449].rotateAngleY = -3.14159265F;

		bodyModel[450].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[450].setRotationPoint(-13.5F, -3F, 7F);
		bodyModel[450].rotateAngleY = -3.14159265F;

		bodyModel[451].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[451].setRotationPoint(-13.5F, -5F, 7F);
		bodyModel[451].rotateAngleY = -3.14159265F;

		bodyModel[452].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[452].setRotationPoint(-13.5F, -5F, 7F);
		bodyModel[452].rotateAngleY = -3.14159265F;

		bodyModel[453].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[453].setRotationPoint(-24.5F, -7F, -1F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 10, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[454].setRotationPoint(-24.5F, -17F, -7F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[455].setRotationPoint(-24.5F, -18F, -10F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 176
		bodyModel[456].setRotationPoint(-24.5F, -18F, 7F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[457].setRotationPoint(-24.5F, -16.25F, -10F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[458].setRotationPoint(-19.5F, -13F, 9F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[459].setRotationPoint(-24.5F, -13F, -10F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 71, 2, 3, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, -1F, 0F); // Box 38 cull
		bodyModel[460].setRotationPoint(-19.5F, -14F, 7F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 76, 2, 3, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, -1F, 0F); // Box 275 cull
		bodyModel[461].setRotationPoint(-24.5F, -14F, -10F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 128
		bodyModel[462].setRotationPoint(-47.5F, -15F, -3F);

		bodyModel[463].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 128
		bodyModel[463].setRotationPoint(-30.5F, -15F, -10F);

		bodyModel[464].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 128
		bodyModel[464].setRotationPoint(-29.5F, -15F, 0F);

		bodyModel[465].addBox(0F, 0F, 0F, 15, 16, 1, 0F); // Box 128
		bodyModel[465].setRotationPoint(-45.5F, -15F, 5F);

		bodyModel[466].addBox(0F, 0F, 0F, 2, 16, 5, 0F); // Box 128
		bodyModel[466].setRotationPoint(-45.5F, -15F, 0F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 128
		bodyModel[467].setRotationPoint(-51.5F, -15F, -4F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[468].setRotationPoint(-51.5F, -6F, -10F);

		bodyModel[469].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[469].setRotationPoint(-50.5F, -5F, -9F);
		bodyModel[469].rotateAngleY = -0.78539816F;

		bodyModel[470].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F); // Box 38
		bodyModel[470].setRotationPoint(-49.05F, -2F, -8.85F);
		bodyModel[470].rotateAngleY = -0.78539816F;

		bodyModel[471].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[471].setRotationPoint(-48.7F, -1F, -8.5F);
		bodyModel[471].rotateAngleY = -0.78539816F;

		bodyModel[472].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[472].setRotationPoint(-49.05F, 0.5F, -8.85F);
		bodyModel[472].rotateAngleY = -0.78539816F;

		bodyModel[473].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[473].setRotationPoint(-43.5F, -6F, 3F);

		bodyModel[474].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[474].setRotationPoint(-42.5F, -5F, 4F);
		bodyModel[474].rotateAngleY = -0.78539816F;

		bodyModel[475].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[475].setRotationPoint(-32.5F, -6F, -10F);

		bodyModel[476].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[476].setRotationPoint(-31.5F, -5F, -9F);
		bodyModel[476].rotateAngleY = -0.78539816F;

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[477].setRotationPoint(-31.5F, -6F, -3F);

		bodyModel[478].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[478].setRotationPoint(-31F, -5F, -2F);
		bodyModel[478].rotateAngleY = -0.78539816F;

		bodyModel[479].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 38
		bodyModel[479].setRotationPoint(-39.5F, -5F, -10F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[480].setRotationPoint(-39F, -3F, -8F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[481].setRotationPoint(-39F, -2F, -8F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[482].setRotationPoint(-39F, -5F, -6F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[483].setRotationPoint(-44.5F, -3F, -7F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[484].setRotationPoint(-44.5F, -6.5F, -7F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -1F, -4.5F, 0F); // Right seat part cull
		bodyModel[485].setRotationPoint(-45.5F, -4.5F, -8F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -1F, -4.5F, 0F); // Right seat part cull
		bodyModel[486].setRotationPoint(-45.5F, -4.5F, -3F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[487].setRotationPoint(-44.5F, -1F, -7F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[488].setRotationPoint(-40F, -5F, -5.5F);

		bodyModel[489].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[489].setRotationPoint(-39F, -5.5F, -4.5F);
		bodyModel[489].rotateAngleY = -0.78539816F;

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[490].setRotationPoint(-40F, 0.5F, -5.5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 2, 16, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[491].setRotationPoint(-50.5F, -15F, 4F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[492].setRotationPoint(41.5F, -13F, -10F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[493].setRotationPoint(41.5F, -13F, 9F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 61, 2, 3, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, -1F, 0F); // Box 38 cull
		bodyModel[494].setRotationPoint(-19.5F, -14F, 7F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 66, 2, 3, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, -1F, 0F); // Box 275 cull
		bodyModel[495].setRotationPoint(-24.5F, -14F, -10F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 276
		bodyModel[496].setRotationPoint(44.5F, -12F, -10F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -1F); // Box 276
		bodyModel[497].setRotationPoint(44F, -12F, -10F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, -0.5F, -0.5F); // Box 276
		bodyModel[498].setRotationPoint(48.5F, -12F, -10F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[499].setRotationPoint(44.5F, -12F, 9F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 477, 411, textureX, textureY); // Box 518
		bodyModel[501] = new ModelRendererTurbo(this, 493, 411, textureX, textureY); // Box 519
		bodyModel[502] = new ModelRendererTurbo(this, 483, 466, textureX, textureY, "lamp"); // Box 276 glow
		bodyModel[503] = new ModelRendererTurbo(this, 483, 409, textureX, textureY, "lamp"); // Box 521 glow
		bodyModel[504] = new ModelRendererTurbo(this, 119, 351, textureX, textureY); // Box 128
		bodyModel[505] = new ModelRendererTurbo(this, 119, 358, textureX, textureY); // Box 128
		bodyModel[506] = new ModelRendererTurbo(this, 119, 365, textureX, textureY); // Box 128
		bodyModel[507] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 205
		bodyModel[508] = new ModelRendererTurbo(this, 137, 6, textureX, textureY); // Box 205
		bodyModel[509] = new ModelRendererTurbo(this, 137, 16, textureX, textureY); // Box 128
		bodyModel[510] = new ModelRendererTurbo(this, 137, 11, textureX, textureY); // Box 205
		bodyModel[511] = new ModelRendererTurbo(this, 339, 175, textureX, textureY); // Box 513
		bodyModel[512] = new ModelRendererTurbo(this, 364, 175, textureX, textureY); // Box 513
		bodyModel[513] = new ModelRendererTurbo(this, 387, 153, textureX, textureY); // Box 524
		bodyModel[514] = new ModelRendererTurbo(this, 432, 153, textureX, textureY); // Box 524
		bodyModel[515] = new ModelRendererTurbo(this, 146, 10, textureX, textureY); // Box 38
		bodyModel[516] = new ModelRendererTurbo(this, 146, 15, textureX, textureY); // Box 38
		bodyModel[517] = new ModelRendererTurbo(this, 118, 181, textureX, textureY); // Box 38
		bodyModel[518] = new ModelRendererTurbo(this, 71, 183, textureX, textureY); // Box 38
		bodyModel[519] = new ModelRendererTurbo(this, 118, 177, textureX, textureY); // Box 451
		bodyModel[520] = new ModelRendererTurbo(this, 71, 179, textureX, textureY); // Box 452
		bodyModel[521] = new ModelRendererTurbo(this, 84, 407, textureX, textureY); // Box 38
		bodyModel[522] = new ModelRendererTurbo(this, 84, 412, textureX, textureY); // Box 462
		bodyModel[523] = new ModelRendererTurbo(this, 445, 427, textureX, textureY); // Box 38
		bodyModel[524] = new ModelRendererTurbo(this, 445, 453, textureX, textureY); // Box 534
		bodyModel[525] = new ModelRendererTurbo(this, 439, 409, textureX, textureY); // Box 38
		bodyModel[526] = new ModelRendererTurbo(this, 439, 435, textureX, textureY); // Box 536
		bodyModel[527] = new ModelRendererTurbo(this, 320, 345, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[528] = new ModelRendererTurbo(this, 313, 345, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[529] = new ModelRendererTurbo(this, 306, 345, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[530] = new ModelRendererTurbo(this, 299, 345, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[531] = new ModelRendererTurbo(this, 292, 345, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[532] = new ModelRendererTurbo(this, 285, 345, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[533] = new ModelRendererTurbo(this, 278, 345, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[534] = new ModelRendererTurbo(this, 230, 339, textureX, textureY); // Box 128
		bodyModel[535] = new ModelRendererTurbo(this, 201, 339, textureX, textureY); // Box 128
		bodyModel[536] = new ModelRendererTurbo(this, 212, 345, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[537] = new ModelRendererTurbo(this, 320, 348, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[538] = new ModelRendererTurbo(this, 313, 348, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[539] = new ModelRendererTurbo(this, 306, 348, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[540] = new ModelRendererTurbo(this, 299, 348, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[541] = new ModelRendererTurbo(this, 292, 348, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[542] = new ModelRendererTurbo(this, 285, 348, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[543] = new ModelRendererTurbo(this, 278, 348, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[544] = new ModelRendererTurbo(this, 212, 348, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[545] = new ModelRendererTurbo(this, 92, 349, textureX, textureY); // Box 340
		bodyModel[546] = new ModelRendererTurbo(this, 76, 349, textureX, textureY); // Box 340
		bodyModel[547] = new ModelRendererTurbo(this, 477, 422, textureX, textureY); // Right seat part
		bodyModel[548] = new ModelRendererTurbo(this, 482, 414, textureX, textureY); // Right seat part
		bodyModel[549] = new ModelRendererTurbo(this, 498, 418, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[550] = new ModelRendererTurbo(this, 464, 418, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[551] = new ModelRendererTurbo(this, 477, 430, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[552] = new ModelRendererTurbo(this, 481, 419, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[553] = new ModelRendererTurbo(this, 477, 448, textureX, textureY); // Box 573
		bodyModel[554] = new ModelRendererTurbo(this, 482, 440, textureX, textureY); // Box 574
		bodyModel[555] = new ModelRendererTurbo(this, 498, 444, textureX, textureY,"cull"); // Box 575 cull
		bodyModel[556] = new ModelRendererTurbo(this, 464, 444, textureX, textureY,"cull"); // Box 576 cull
		bodyModel[557] = new ModelRendererTurbo(this, 477, 456, textureX, textureY); // Box 577
		bodyModel[558] = new ModelRendererTurbo(this, 481, 445, textureX, textureY,"cull"); // Box 578 cull
		bodyModel[559] = new ModelRendererTurbo(this, 503, 456, textureX, textureY); // Right seat part
		bodyModel[560] = new ModelRendererTurbo(this, 505, 460, textureX, textureY); // Right seat part
		bodyModel[561] = new ModelRendererTurbo(this, 503, 468, textureX, textureY); // Right seat part
		bodyModel[562] = new ModelRendererTurbo(this, 405, 423, textureX, textureY); // Right seat part
		bodyModel[563] = new ModelRendererTurbo(this, 410, 417, textureX, textureY); // Right seat part
		bodyModel[564] = new ModelRendererTurbo(this, 426, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[565] = new ModelRendererTurbo(this, 392, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[566] = new ModelRendererTurbo(this, 406, 433, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[567] = new ModelRendererTurbo(this, 405, 449, textureX, textureY); // Box 587
		bodyModel[568] = new ModelRendererTurbo(this, 410, 443, textureX, textureY); // Box 588
		bodyModel[569] = new ModelRendererTurbo(this, 426, 452, textureX, textureY,"cull"); // Box 589 cull
		bodyModel[570] = new ModelRendererTurbo(this, 392, 452, textureX, textureY,"cull"); // Box 590 cull
		bodyModel[571] = new ModelRendererTurbo(this, 406, 459, textureX, textureY,"cull"); // Box 591 cull
		bodyModel[572] = new ModelRendererTurbo(this, 358, 423, textureX, textureY); // Right seat part
		bodyModel[573] = new ModelRendererTurbo(this, 363, 417, textureX, textureY); // Right seat part
		bodyModel[574] = new ModelRendererTurbo(this, 379, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[575] = new ModelRendererTurbo(this, 345, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[576] = new ModelRendererTurbo(this, 359, 433, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[577] = new ModelRendererTurbo(this, 358, 449, textureX, textureY); // Box 587
		bodyModel[578] = new ModelRendererTurbo(this, 363, 443, textureX, textureY); // Box 588
		bodyModel[579] = new ModelRendererTurbo(this, 379, 452, textureX, textureY,"cull"); // Box 589 cull
		bodyModel[580] = new ModelRendererTurbo(this, 345, 452, textureX, textureY,"cull"); // Box 590 cull
		bodyModel[581] = new ModelRendererTurbo(this, 359, 459, textureX, textureY,"cull"); // Box 591 cull
		bodyModel[582] = new ModelRendererTurbo(this, 311, 423, textureX, textureY); // Right seat part
		bodyModel[583] = new ModelRendererTurbo(this, 316, 417, textureX, textureY); // Right seat part
		bodyModel[584] = new ModelRendererTurbo(this, 332, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[585] = new ModelRendererTurbo(this, 298, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[586] = new ModelRendererTurbo(this, 312, 433, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[587] = new ModelRendererTurbo(this, 311, 449, textureX, textureY); // Box 587
		bodyModel[588] = new ModelRendererTurbo(this, 316, 443, textureX, textureY); // Box 588
		bodyModel[589] = new ModelRendererTurbo(this, 332, 452, textureX, textureY,"cull"); // Box 589 cull
		bodyModel[590] = new ModelRendererTurbo(this, 298, 452, textureX, textureY,"cull"); // Box 590 cull
		bodyModel[591] = new ModelRendererTurbo(this, 312, 459, textureX, textureY,"cull"); // Box 591 cull
		bodyModel[592] = new ModelRendererTurbo(this, 264, 423, textureX, textureY); // Right seat part
		bodyModel[593] = new ModelRendererTurbo(this, 269, 417, textureX, textureY); // Right seat part
		bodyModel[594] = new ModelRendererTurbo(this, 285, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[595] = new ModelRendererTurbo(this, 251, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[596] = new ModelRendererTurbo(this, 265, 433, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[597] = new ModelRendererTurbo(this, 264, 449, textureX, textureY); // Box 587
		bodyModel[598] = new ModelRendererTurbo(this, 269, 443, textureX, textureY); // Box 588
		bodyModel[599] = new ModelRendererTurbo(this, 285, 452, textureX, textureY,"cull"); // Box 589 cull
		bodyModel[600] = new ModelRendererTurbo(this, 251, 452, textureX, textureY,"cull"); // Box 590 cull
		bodyModel[601] = new ModelRendererTurbo(this, 265, 459, textureX, textureY,"cull"); // Box 591 cull
		bodyModel[602] = new ModelRendererTurbo(this, 217, 423, textureX, textureY); // Right seat part
		bodyModel[603] = new ModelRendererTurbo(this, 222, 417, textureX, textureY); // Right seat part
		bodyModel[604] = new ModelRendererTurbo(this, 238, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[605] = new ModelRendererTurbo(this, 204, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[606] = new ModelRendererTurbo(this, 218, 433, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[607] = new ModelRendererTurbo(this, 217, 449, textureX, textureY); // Box 587
		bodyModel[608] = new ModelRendererTurbo(this, 222, 443, textureX, textureY); // Box 588
		bodyModel[609] = new ModelRendererTurbo(this, 238, 452, textureX, textureY,"cull"); // Box 589 cull
		bodyModel[610] = new ModelRendererTurbo(this, 204, 452, textureX, textureY,"cull"); // Box 590 cull
		bodyModel[611] = new ModelRendererTurbo(this, 218, 459, textureX, textureY,"cull"); // Box 591 cull
		bodyModel[612] = new ModelRendererTurbo(this, 170, 423, textureX, textureY); // Right seat part
		bodyModel[613] = new ModelRendererTurbo(this, 175, 417, textureX, textureY); // Right seat part
		bodyModel[614] = new ModelRendererTurbo(this, 191, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[615] = new ModelRendererTurbo(this, 157, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[616] = new ModelRendererTurbo(this, 170, 449, textureX, textureY); // Box 587
		bodyModel[617] = new ModelRendererTurbo(this, 175, 443, textureX, textureY); // Box 588
		bodyModel[618] = new ModelRendererTurbo(this, 191, 452, textureX, textureY,"cull"); // Box 589 cull
		bodyModel[619] = new ModelRendererTurbo(this, 157, 452, textureX, textureY,"cull"); // Box 590 cull
		bodyModel[620] = new ModelRendererTurbo(this, 171, 459, textureX, textureY,"cull"); // Box 591 cull
		bodyModel[621] = new ModelRendererTurbo(this, 123, 423, textureX, textureY); // Right seat part
		bodyModel[622] = new ModelRendererTurbo(this, 128, 417, textureX, textureY); // Right seat part
		bodyModel[623] = new ModelRendererTurbo(this, 144, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[624] = new ModelRendererTurbo(this, 110, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[625] = new ModelRendererTurbo(this, 124, 433, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[626] = new ModelRendererTurbo(this, 123, 449, textureX, textureY); // Box 587
		bodyModel[627] = new ModelRendererTurbo(this, 128, 443, textureX, textureY); // Box 588
		bodyModel[628] = new ModelRendererTurbo(this, 144, 452, textureX, textureY,"cull"); // Box 589 cull
		bodyModel[629] = new ModelRendererTurbo(this, 110, 452, textureX, textureY,"cull"); // Box 590 cull
		bodyModel[630] = new ModelRendererTurbo(this, 124, 459, textureX, textureY,"cull"); // Box 591 cull
		bodyModel[631] = new ModelRendererTurbo(this, 76, 423, textureX, textureY); // Right seat part
		bodyModel[632] = new ModelRendererTurbo(this, 81, 417, textureX, textureY); // Right seat part
		bodyModel[633] = new ModelRendererTurbo(this, 97, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[634] = new ModelRendererTurbo(this, 63, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[635] = new ModelRendererTurbo(this, 77, 433, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[636] = new ModelRendererTurbo(this, 76, 449, textureX, textureY); // Box 587
		bodyModel[637] = new ModelRendererTurbo(this, 81, 443, textureX, textureY); // Box 588
		bodyModel[638] = new ModelRendererTurbo(this, 97, 452, textureX, textureY,"cull"); // Box 589 cull
		bodyModel[639] = new ModelRendererTurbo(this, 63, 452, textureX, textureY,"cull"); // Box 590 cull
		bodyModel[640] = new ModelRendererTurbo(this, 77, 459, textureX, textureY,"cull"); // Box 591 cull
		bodyModel[641] = new ModelRendererTurbo(this, 29, 423, textureX, textureY); // Right seat part
		bodyModel[642] = new ModelRendererTurbo(this, 34, 417, textureX, textureY); // Right seat part
		bodyModel[643] = new ModelRendererTurbo(this, 50, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[644] = new ModelRendererTurbo(this, 16, 426, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[645] = new ModelRendererTurbo(this, 30, 433, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[646] = new ModelRendererTurbo(this, 29, 449, textureX, textureY); // Box 587
		bodyModel[647] = new ModelRendererTurbo(this, 34, 443, textureX, textureY); // Box 588
		bodyModel[648] = new ModelRendererTurbo(this, 50, 452, textureX, textureY,"cull"); // Box 589 cull
		bodyModel[649] = new ModelRendererTurbo(this, 16, 452, textureX, textureY,"cull"); // Box 590 cull
		bodyModel[650] = new ModelRendererTurbo(this, 30, 459, textureX, textureY,"cull"); // Box 591 cull
		bodyModel[651] = new ModelRendererTurbo(this, 1, 446, textureX, textureY); // Box 534
		bodyModel[652] = new ModelRendererTurbo(this, 4, 440, textureX, textureY); // Box 534
		bodyModel[653] = new ModelRendererTurbo(this, 171, 433, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[654] = new ModelRendererTurbo(this, 20, 73, textureX, textureY); // Box 128
		bodyModel[655] = new ModelRendererTurbo(this, 23, 73, textureX, textureY); // Box 128
		bodyModel[656] = new ModelRendererTurbo(this, 22, 96, textureX, textureY); // Box 202
		bodyModel[657] = new ModelRendererTurbo(this, 25, 96, textureX, textureY); // Box 203
		bodyModel[658] = new ModelRendererTurbo(this, 79, 284, textureX, textureY); // Box 128
		bodyModel[659] = new ModelRendererTurbo(this, 68, 284, textureX, textureY); // Box 128
		bodyModel[660] = new ModelRendererTurbo(this, 66, 287, textureX, textureY); // Box 128
		bodyModel[661] = new ModelRendererTurbo(this, 43, 146, textureX, textureY); // Box 2
		bodyModel[662] = new ModelRendererTurbo(this, 72, 151, textureX, textureY); // Box 2
		bodyModel[663] = new ModelRendererTurbo(this, 52, 144, textureX, textureY); // Box 191
		bodyModel[664] = new ModelRendererTurbo(this, 72, 144, textureX, textureY); // Box 192
		bodyModel[665] = new ModelRendererTurbo(this, 65, 144, textureX, textureY); // Box 192
		bodyModel[666] = new ModelRendererTurbo(this, 65, 150, textureX, textureY); // Box 475
		bodyModel[667] = new ModelRendererTurbo(this, 23, 380, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[668] = new ModelRendererTurbo(this, 379, 40, textureX, textureY); // Box 128

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F); // Box 518
		bodyModel[500].setRotationPoint(44F, -12F, 9F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[501].setRotationPoint(48.5F, -12F, 9F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.28F, 0F, 0F, -0.28F, 0F, 0F, -0.28F, 0F, 0F, -0.28F, 0F); // Box 276 glow
		bodyModel[502].setRotationPoint(44.5F, -11.5F, -9.49F);
		bodyModel[502].rotateAngleX = -0.78539816F;

		bodyModel[503].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.28F, 0F, 0F, -0.28F, 0F, 0F, -0.28F, 0F, 0F, -0.28F, 0F); // Box 521 glow
		bodyModel[503].setRotationPoint(44.5F, -11.5F, 9.49F);
		bodyModel[503].rotateAngleX = 0.78539816F;

		bodyModel[504].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 128
		bodyModel[504].setRotationPoint(-29.5F, -12F, 1F);

		bodyModel[505].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 128
		bodyModel[505].setRotationPoint(-29.5F, -8F, 1F);

		bodyModel[506].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 128
		bodyModel[506].setRotationPoint(-29.5F, -4F, 1F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.09F, -0.75F, 0F, 0.09F, -0.75F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[507].setRotationPoint(-51.5F, -17.65F, -10.92F);
		bodyModel[507].rotateAngleX = -0.41887902F;

		bodyModel[508].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 1.5F, -0.75F, 0F, 1.5F, -0.75F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2.05F, -0.75F, 0F, -2.05F, -0.75F, 0F, -2.13F, 0F, 0F, -2.13F, 0F); // Box 205
		bodyModel[508].setRotationPoint(-51.5F, -18.55F, -9.75F);
		bodyModel[508].rotateAngleX = -1.04719755F;

		bodyModel[509].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.09F, -0.75F, 0F, 0.09F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F); // Box 128
		bodyModel[509].setRotationPoint(-51.5F, -17.25F, 10F);
		bodyModel[509].rotateAngleX = 0.41887902F;

		bodyModel[510].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.75F, 0F, 1.5F, -0.75F, 0F, -2.13F, 0F, 0F, -2.13F, 0F, 0F, -2.05F, -0.75F, 0F, -2.05F, -0.75F); // Box 205
		bodyModel[510].setRotationPoint(-51.5F, -17.69F, 9.24F);
		bodyModel[510].rotateAngleX = 1.04719755F;

		bodyModel[511].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 513
		bodyModel[511].setRotationPoint(-16.5F, 3F, -10F);

		bodyModel[512].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 513
		bodyModel[512].setRotationPoint(-6.5F, 3F, -10F);

		bodyModel[513].addBox(0F, 0F, 0F, 17, 5, 5, 0F); // Box 524
		bodyModel[513].setRotationPoint(2.5F, 3F, 5F);

		bodyModel[514].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 524
		bodyModel[514].setRotationPoint(-5.5F, 3F, 5F);

		bodyModel[515].addShapeBox(0F, -0.5F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[515].setRotationPoint(-47F, -18.45F, -8F);
		bodyModel[515].rotateAngleX = 0.3403392F;

		bodyModel[516].addShapeBox(0F, -0.5F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[516].setRotationPoint(-36F, -18.45F, -8F);
		bodyModel[516].rotateAngleX = 0.3403392F;

		bodyModel[517].addBox(0F, 0F, 0F, 49, 1, 0, 0F); // Box 38
		bodyModel[517].setRotationPoint(-23.5F, -13.5F, -11.01F);

		bodyModel[518].addBox(0F, 0F, 0F, 96, 1, 0, 0F); // Box 38
		bodyModel[518].setRotationPoint(-49F, -2.5F, -11.01F);

		bodyModel[519].addBox(0F, 0F, 0F, 49, 1, 0, 0F); // Box 451
		bodyModel[519].setRotationPoint(-23.5F, -13.5F, 11.01F);

		bodyModel[520].addBox(0F, 0F, 0F, 96, 1, 0, 0F); // Box 452
		bodyModel[520].setRotationPoint(-49F, -2.5F, 11.01F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 103, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[521].setRotationPoint(-51.5F, -10F, -9.9F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 103, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[522].setRotationPoint(-51.5F, -10F, 9.9F);

		bodyModel[523].addBox(0F, 0F, 0F, 0, 6, 6, 0F); // Box 38
		bodyModel[523].setRotationPoint(41.5F, -5F, 4F);

		bodyModel[524].addBox(0F, 0F, 0F, 0, 6, 6, 0F); // Box 534
		bodyModel[524].setRotationPoint(41.5F, -5F, -10F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 0, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -6F, 0F, -6F, -6F); // Box 38
		bodyModel[525].setRotationPoint(41.5F, -11F, 4F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 0, 12, 12, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 536
		bodyModel[526].setRotationPoint(41.5F, -11F, -16F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[527].setRotationPoint(49.5F, -16.5F, -0.5F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[528].setRotationPoint(39.5F, -16.5F, -0.5F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[529].setRotationPoint(29.5F, -16.5F, -0.5F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[530].setRotationPoint(19.5F, -16.5F, -0.5F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[531].setRotationPoint(9.5F, -16.5F, -0.5F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[532].setRotationPoint(-0.5F, -16.5F, -0.5F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[533].setRotationPoint(-10.5F, -16.5F, -0.5F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 68, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[534].setRotationPoint(-14.5F, -17F, -2F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[535].setRotationPoint(-24.5F, -17F, -2F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[536].setRotationPoint(-20.5F, -16.5F, -0.5F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[537].setRotationPoint(49.5F, -17F, -0.5F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[538].setRotationPoint(39.5F, -17F, -0.5F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[539].setRotationPoint(29.5F, -17F, -0.5F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[540].setRotationPoint(19.5F, -17F, -0.5F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[541].setRotationPoint(9.5F, -17F, -0.5F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[542].setRotationPoint(-0.5F, -17F, -0.5F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[543].setRotationPoint(-10.5F, -17F, -0.5F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[544].setRotationPoint(-20.5F, -17F, -0.5F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 340
		bodyModel[545].setRotationPoint(-33.5F, -15F, -10F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 340
		bodyModel[546].setRotationPoint(-33.5F, -15F, 2F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[547].setRotationPoint(44.5F, -3F, 3.5F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[548].setRotationPoint(44.5F, -6.5F, 8.5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Right seat part cull
		bodyModel[549].setRotationPoint(48.5F, -4.5F, 4.5F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Right seat part cull
		bodyModel[550].setRotationPoint(43.5F, -4.5F, 4.5F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[551].setRotationPoint(44.5F, -2F, 3.5F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.08F, 0F, -1F, -0.08F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[552].setRotationPoint(44.5F, -3.5F, 8.5F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[553].setRotationPoint(44.5F, -3F, -9.5F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[554].setRotationPoint(44.5F, -6.5F, -9.5F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 575 cull
		bodyModel[555].setRotationPoint(48.5F, -4.5F, -9.5F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 576 cull
		bodyModel[556].setRotationPoint(43.5F, -4.5F, -9.5F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[557].setRotationPoint(44.5F, -2F, -9.5F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.08F, 0F, 0F, -0.08F, 0F); // Box 578 cull
		bodyModel[558].setRotationPoint(44.5F, -3.5F, -9.5F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[559].setRotationPoint(52F, -5F, -1F);

		bodyModel[560].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[560].setRotationPoint(53F, -5.5F, 0F);
		bodyModel[560].rotateAngleY = -0.78539816F;

		bodyModel[561].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[561].setRotationPoint(52F, 0.5F, -1F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[562].setRotationPoint(35.5F, -3F, 3.5F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[563].setRotationPoint(35.5F, -6.5F, 8.5F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[564].setRotationPoint(39.5F, -4.5F, 4.5F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[565].setRotationPoint(34.5F, -4.5F, 4.5F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[566].setRotationPoint(35.5F, 0F, 4.5F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[567].setRotationPoint(35.5F, -3F, -9.5F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F); // Box 588
		bodyModel[568].setRotationPoint(35.5F, -6.5F, -9.5F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 589 cull
		bodyModel[569].setRotationPoint(39.5F, -4.5F, -9.5F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 590 cull
		bodyModel[570].setRotationPoint(34.5F, -4.5F, -9.5F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591 cull
		bodyModel[571].setRotationPoint(35.5F, 0F, -9.5F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[572].setRotationPoint(28.5F, -3F, 3.5F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[573].setRotationPoint(28.5F, -6.5F, 8.5F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[574].setRotationPoint(32.5F, -4.5F, 4.5F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[575].setRotationPoint(27.5F, -4.5F, 4.5F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[576].setRotationPoint(28.5F, 0F, 4.5F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[577].setRotationPoint(28.5F, -3F, -9.5F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F); // Box 588
		bodyModel[578].setRotationPoint(28.5F, -6.5F, -9.5F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 589 cull
		bodyModel[579].setRotationPoint(32.5F, -4.5F, -9.5F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 590 cull
		bodyModel[580].setRotationPoint(27.5F, -4.5F, -9.5F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591 cull
		bodyModel[581].setRotationPoint(28.5F, 0F, -9.5F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[582].setRotationPoint(21.5F, -3F, 3.5F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[583].setRotationPoint(21.5F, -6.5F, 8.5F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[584].setRotationPoint(25.5F, -4.5F, 4.5F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[585].setRotationPoint(20.5F, -4.5F, 4.5F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[586].setRotationPoint(21.5F, 0F, 4.5F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[587].setRotationPoint(21.5F, -3F, -9.5F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F); // Box 588
		bodyModel[588].setRotationPoint(21.5F, -6.5F, -9.5F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 589 cull
		bodyModel[589].setRotationPoint(25.5F, -4.5F, -9.5F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 590 cull
		bodyModel[590].setRotationPoint(20.5F, -4.5F, -9.5F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591 cull
		bodyModel[591].setRotationPoint(21.5F, 0F, -9.5F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[592].setRotationPoint(14.5F, -3F, 3.5F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[593].setRotationPoint(14.5F, -6.5F, 8.5F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[594].setRotationPoint(18.5F, -4.5F, 4.5F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[595].setRotationPoint(13.5F, -4.5F, 4.5F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[596].setRotationPoint(14.5F, 0F, 4.5F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[597].setRotationPoint(14.5F, -3F, -9.5F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F); // Box 588
		bodyModel[598].setRotationPoint(14.5F, -6.5F, -9.5F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 589 cull
		bodyModel[599].setRotationPoint(18.5F, -4.5F, -9.5F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 590 cull
		bodyModel[600].setRotationPoint(13.5F, -4.5F, -9.5F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591 cull
		bodyModel[601].setRotationPoint(14.5F, 0F, -9.5F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[602].setRotationPoint(7.5F, -3F, 3.5F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[603].setRotationPoint(7.5F, -6.5F, 8.5F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[604].setRotationPoint(11.5F, -4.5F, 4.5F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[605].setRotationPoint(6.5F, -4.5F, 4.5F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[606].setRotationPoint(7.5F, 0F, 4.5F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[607].setRotationPoint(7.5F, -3F, -9.5F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F); // Box 588
		bodyModel[608].setRotationPoint(7.5F, -6.5F, -9.5F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 589 cull
		bodyModel[609].setRotationPoint(11.5F, -4.5F, -9.5F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 590 cull
		bodyModel[610].setRotationPoint(6.5F, -4.5F, -9.5F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591 cull
		bodyModel[611].setRotationPoint(7.5F, 0F, -9.5F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[612].setRotationPoint(0.5F, -3F, 3.5F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[613].setRotationPoint(0.5F, -6.5F, 8.5F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[614].setRotationPoint(4.5F, -4.5F, 4.5F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[615].setRotationPoint(-0.5F, -4.5F, 4.5F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[616].setRotationPoint(0.5F, -3F, -9.5F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F); // Box 588
		bodyModel[617].setRotationPoint(0.5F, -6.5F, -9.5F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 589 cull
		bodyModel[618].setRotationPoint(4.5F, -4.5F, -9.5F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 590 cull
		bodyModel[619].setRotationPoint(-0.5F, -4.5F, -9.5F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591 cull
		bodyModel[620].setRotationPoint(0.5F, 0F, -9.5F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[621].setRotationPoint(-6.5F, -3F, 3.5F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[622].setRotationPoint(-6.5F, -6.5F, 8.5F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[623].setRotationPoint(-2.5F, -4.5F, 4.5F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[624].setRotationPoint(-7.5F, -4.5F, 4.5F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[625].setRotationPoint(-6.5F, 0F, 4.5F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[626].setRotationPoint(-6.5F, -3F, -9.5F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F); // Box 588
		bodyModel[627].setRotationPoint(-6.5F, -6.5F, -9.5F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 589 cull
		bodyModel[628].setRotationPoint(-2.5F, -4.5F, -9.5F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 590 cull
		bodyModel[629].setRotationPoint(-7.5F, -4.5F, -9.5F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591 cull
		bodyModel[630].setRotationPoint(-6.5F, 0F, -9.5F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[631].setRotationPoint(-13.5F, -3F, 3.5F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[632].setRotationPoint(-13.5F, -6.5F, 8.5F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[633].setRotationPoint(-9.5F, -4.5F, 4.5F);

		bodyModel[634].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[634].setRotationPoint(-14.5F, -4.5F, 4.5F);

		bodyModel[635].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[635].setRotationPoint(-13.5F, 0F, 4.5F);

		bodyModel[636].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[636].setRotationPoint(-13.5F, -3F, -9.5F);

		bodyModel[637].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F); // Box 588
		bodyModel[637].setRotationPoint(-13.5F, -6.5F, -9.5F);

		bodyModel[638].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 589 cull
		bodyModel[638].setRotationPoint(-9.5F, -4.5F, -9.5F);

		bodyModel[639].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 590 cull
		bodyModel[639].setRotationPoint(-14.5F, -4.5F, -9.5F);

		bodyModel[640].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591 cull
		bodyModel[640].setRotationPoint(-13.5F, 0F, -9.5F);

		bodyModel[641].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[641].setRotationPoint(-20.5F, -3F, 3.5F);

		bodyModel[642].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[642].setRotationPoint(-20.5F, -6.5F, 8.5F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[643].setRotationPoint(-16.5F, -4.5F, 4.5F);

		bodyModel[644].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part cull
		bodyModel[644].setRotationPoint(-21.5F, -4.5F, 4.5F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[645].setRotationPoint(-20.5F, 0F, 4.5F);

		bodyModel[646].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[646].setRotationPoint(-20.5F, -3F, -9.5F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F); // Box 588
		bodyModel[647].setRotationPoint(-20.5F, -6.5F, -9.5F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 589 cull
		bodyModel[648].setRotationPoint(-16.5F, -4.5F, -9.5F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 590 cull
		bodyModel[649].setRotationPoint(-21.5F, -4.5F, -9.5F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591 cull
		bodyModel[650].setRotationPoint(-20.5F, 0F, -9.5F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 2, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 534
		bodyModel[651].setRotationPoint(-24.5F, -5F, -8F);

		bodyModel[652].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		bodyModel[652].setRotationPoint(-24.5F, -7F, -7F);

		bodyModel[653].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[653].setRotationPoint(0.5F, 0F, 4.5F);

		bodyModel[654].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[654].setRotationPoint(-57F, -6F, -12F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[655].setRotationPoint(-52F, -6F, -12F);

		bodyModel[656].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[656].setRotationPoint(-57F, -6F, 11F);

		bodyModel[657].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[657].setRotationPoint(-52F, -6F, 11F);

		bodyModel[658].addBox(0F, 0F, 0F, 23, 16, 1, 0F); // Box 128
		bodyModel[658].setRotationPoint(-38.5F, -15F, 5F);

		bodyModel[659].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 128
		bodyModel[659].setRotationPoint(-41.5F, -15F, 5F);

		bodyModel[660].addShapeBox(0F, 0F, 0F, 6, 14, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[660].setRotationPoint(-41.5F, -14F, 5.5F);

		bodyModel[661].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[661].setRotationPoint(-57.5F, 3F, -10.5F);

		bodyModel[662].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[662].setRotationPoint(-57.5F, 4F, -10.5F);

		bodyModel[663].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[663].setRotationPoint(-57.5F, 3F, 4.5F);

		bodyModel[664].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[664].setRotationPoint(-57.5F, 4F, 9.5F);

		bodyModel[665].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[665].setRotationPoint(-57.5F, 4F, 8F);

		bodyModel[666].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 475
		bodyModel[666].setRotationPoint(-57.5F, 4F, -10F);

		bodyModel[667].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.8F, -0.5F, -0.01F, -1F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.8F, -0.5F, -0.01F, -1F); // Box 128 cull
		bodyModel[667].setRotationPoint(-49.5F, -15F, -3F);

		bodyModel[668].addShapeBox(0F, 0F, 0F, 1, 0, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[668].setRotationPoint(51.5F, -16.99F, -4F);
	}
	ModelPS_Truck_41GT bogie1 = new ModelPS_Truck_41GT();
	ModelPS_Truck_41TRV11 bogie2 = new ModelPS_Truck_41TRV11();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 669; i++)
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
		if(GetColor(entity)==5){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-R-C-11_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.57, -0.03, 0);
			bogie2.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-5.14, 0, 0);
			bogie2.render(entity, f, f1, f2, f3, f4, f5);
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