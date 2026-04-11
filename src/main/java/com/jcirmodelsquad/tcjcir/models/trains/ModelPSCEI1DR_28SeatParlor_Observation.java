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

public class ModelPSCEI1DR_28SeatParlor_Observation extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPSCEI1DR_28SeatParlor_Observation() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[696];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 23, 84, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 44, 116, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 324, 135, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 303, 132, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 29, 125, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 46, 132, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 283, 122, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 33, 109, textureX, textureY); // Left trapdoor
		bodyModel[10] = new ModelRendererTurbo(this, 33, 117, textureX, textureY); // Right trapdoor
		bodyModel[11] = new ModelRendererTurbo(this, 72, 69, textureX, textureY); // Left side door
		bodyModel[12] = new ModelRendererTurbo(this, 83, 68, textureX, textureY); // Box 38
		bodyModel[13] = new ModelRendererTurbo(this, 83, 87, textureX, textureY); // Box 128
		bodyModel[14] = new ModelRendererTurbo(this, 1, 83, textureX, textureY); // Box 128
		bodyModel[15] = new ModelRendererTurbo(this, 1, 56, textureX, textureY); // Box 128
		bodyModel[16] = new ModelRendererTurbo(this, 45, 30, textureX, textureY); // Box 128
		bodyModel[17] = new ModelRendererTurbo(this, 44, 5, textureX, textureY); // Box 128
		bodyModel[18] = new ModelRendererTurbo(this, 72, 90, textureX, textureY); // Right side door
		bodyModel[19] = new ModelRendererTurbo(this, 11, 55, textureX, textureY); // Box 128
		bodyModel[20] = new ModelRendererTurbo(this, 29, 17, textureX, textureY); // Box 128
		bodyModel[21] = new ModelRendererTurbo(this, 72, 66, textureX, textureY); // Box 128
		bodyModel[22] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[23] = new ModelRendererTurbo(this, 26, 43, textureX, textureY); // Vestibule door
		bodyModel[24] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[25] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[26] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[27] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[28] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[29] = new ModelRendererTurbo(this, 78, 221, textureX, textureY); // Box 128
		bodyModel[30] = new ModelRendererTurbo(this, 78, 199, textureX, textureY); // Box 177
		bodyModel[31] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[32] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[33] = new ModelRendererTurbo(this, 32, 24, textureX, textureY); // Front gate closed
		bodyModel[34] = new ModelRendererTurbo(this, 29, 29, textureX, textureY); // Front gate open
		bodyModel[35] = new ModelRendererTurbo(this, 101, 7, textureX, textureY); // Box 128
		bodyModel[36] = new ModelRendererTurbo(this, 96, 14, textureX, textureY); // Box 128
		bodyModel[37] = new ModelRendererTurbo(this, 96, 2, textureX, textureY); // Box 176
		bodyModel[38] = new ModelRendererTurbo(this, 63, 3, textureX, textureY); // Box 128
		bodyModel[39] = new ModelRendererTurbo(this, 78, 205, textureX, textureY); // Box 128
		bodyModel[40] = new ModelRendererTurbo(this, 77, 148, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 77, 151, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 84, 151, textureX, textureY); // Box 2
		bodyModel[43] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[45] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[46] = new ModelRendererTurbo(this, 244, 151, textureX, textureY); // Box 2
		bodyModel[47] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[48] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[49] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[50] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[51] = new ModelRendererTurbo(this, 77, 138, textureX, textureY); // Box 24
		bodyModel[52] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 25
		bodyModel[53] = new ModelRendererTurbo(this, 84, 141, textureX, textureY); // Box 27
		bodyModel[54] = new ModelRendererTurbo(this, 253, 138, textureX, textureY); // Box 28
		bodyModel[55] = new ModelRendererTurbo(this, 253, 141, textureX, textureY); // Box 29
		bodyModel[56] = new ModelRendererTurbo(this, 258, 138, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[57] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[58] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[59] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[60] = new ModelRendererTurbo(this, 244, 141, textureX, textureY); // Box 35
		bodyModel[61] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[62] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[63] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[64] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 39
		bodyModel[65] = new ModelRendererTurbo(this, 84, 148, textureX, textureY); // Box 2
		bodyModel[66] = new ModelRendererTurbo(this, 84, 138, textureX, textureY); // Box 41
		bodyModel[67] = new ModelRendererTurbo(this, 27, 3, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 14, 31, textureX, textureY); // Box 128
		bodyModel[69] = new ModelRendererTurbo(this, 22, 14, textureX, textureY); // Box 128
		bodyModel[70] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 15, 13, textureX, textureY); // Box 128
		bodyModel[72] = new ModelRendererTurbo(this, 8, 13, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 128
		bodyModel[74] = new ModelRendererTurbo(this, 4, 1, textureX, textureY); // Box 128
		bodyModel[75] = new ModelRendererTurbo(this, 282, 108, textureX, textureY); // Box 2
		bodyModel[76] = new ModelRendererTurbo(this, 317, 118, textureX, textureY); // Box 2
		bodyModel[77] = new ModelRendererTurbo(this, 294, 68, textureX, textureY); // Box 38
		bodyModel[78] = new ModelRendererTurbo(this, 326, 111, textureX, textureY); // Box 2
		bodyModel[79] = new ModelRendererTurbo(this, 345, 117, textureX, textureY); // Box 2
		bodyModel[80] = new ModelRendererTurbo(this, 355, 113, textureX, textureY); // Box 2
		bodyModel[81] = new ModelRendererTurbo(this, 333, 68, textureX, textureY); // Rear end door part
		bodyModel[82] = new ModelRendererTurbo(this, 333, 91, textureX, textureY); // Rear end door part
		bodyModel[83] = new ModelRendererTurbo(this, 366, 118, textureX, textureY); // Box 2
		bodyModel[84] = new ModelRendererTurbo(this, 357, 120, textureX, textureY); // Box 2
		bodyModel[85] = new ModelRendererTurbo(this, 345, 111, textureX, textureY); // Box 161
		bodyModel[86] = new ModelRendererTurbo(this, 366, 112, textureX, textureY); // Box 162
		bodyModel[87] = new ModelRendererTurbo(this, 355, 106, textureX, textureY); // Box 163
		bodyModel[88] = new ModelRendererTurbo(this, 322, 65, textureX, textureY); // Box 2
		bodyModel[89] = new ModelRendererTurbo(this, 339, 66, textureX, textureY); // Box 2
		bodyModel[90] = new ModelRendererTurbo(this, 334, 86, textureX, textureY); // Box 168
		bodyModel[91] = new ModelRendererTurbo(this, 313, 68, textureX, textureY); // Box 38
		bodyModel[92] = new ModelRendererTurbo(this, 317, 113, textureX, textureY); // Box 174
		bodyModel[93] = new ModelRendererTurbo(this, 294, 87, textureX, textureY); // Box 175
		bodyModel[94] = new ModelRendererTurbo(this, 322, 86, textureX, textureY); // Box 176
		bodyModel[95] = new ModelRendererTurbo(this, 313, 87, textureX, textureY); // Box 177
		bodyModel[96] = new ModelRendererTurbo(this, 296, 64, textureX, textureY); // Box 38
		bodyModel[97] = new ModelRendererTurbo(this, 318, 61, textureX, textureY); // Box 38
		bodyModel[98] = new ModelRendererTurbo(this, 341, 60, textureX, textureY); // Box 2
		bodyModel[99] = new ModelRendererTurbo(this, 296, 14, textureX, textureY); // Box 182
		bodyModel[100] = new ModelRendererTurbo(this, 317, 23, textureX, textureY); // Box 183
		bodyModel[101] = new ModelRendererTurbo(this, 319, 16, textureX, textureY); // Box 184
		bodyModel[102] = new ModelRendererTurbo(this, 295, 57, textureX, textureY); // Box 128
		bodyModel[103] = new ModelRendererTurbo(this, 295, 18, textureX, textureY); // Box 188
		bodyModel[104] = new ModelRendererTurbo(this, 329, 58, textureX, textureY); // Box 128
		bodyModel[105] = new ModelRendererTurbo(this, 325, 24, textureX, textureY); // Box 191
		bodyModel[106] = new ModelRendererTurbo(this, 339, 54, textureX, textureY); // Box 128
		bodyModel[107] = new ModelRendererTurbo(this, 328, 18, textureX, textureY); // Box 196
		bodyModel[108] = new ModelRendererTurbo(this, 351, 46, textureX, textureY); // Box 128
		bodyModel[109] = new ModelRendererTurbo(this, 349, 40, textureX, textureY); // Box 200
		bodyModel[110] = new ModelRendererTurbo(this, 309, 34, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 316, 47, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 299, 44, textureX, textureY); // Box 128
		bodyModel[113] = new ModelRendererTurbo(this, 308, 51, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 315, 30, textureX, textureY); // Box 205
		bodyModel[115] = new ModelRendererTurbo(this, 297, 31, textureX, textureY); // Box 206
		bodyModel[116] = new ModelRendererTurbo(this, 295, 25, textureX, textureY); // Box 207
		bodyModel[117] = new ModelRendererTurbo(this, 329, 50, textureX, textureY); // Box 128
		bodyModel[118] = new ModelRendererTurbo(this, 329, 38, textureX, textureY); // Box 214
		bodyModel[119] = new ModelRendererTurbo(this, 330, 52, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 325, 32, textureX, textureY); // Box 220
		bodyModel[121] = new ModelRendererTurbo(this, 340, 48, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 334, 28, textureX, textureY); // Box 222
		bodyModel[123] = new ModelRendererTurbo(this, 340, 42, textureX, textureY); // Box 128
		bodyModel[124] = new ModelRendererTurbo(this, 334, 34, textureX, textureY); // Box 224
		bodyModel[125] = new ModelRendererTurbo(this, 265, 138, textureX, textureY); // Box 31
		bodyModel[126] = new ModelRendererTurbo(this, 265, 141, textureX, textureY); // Box 31
		bodyModel[127] = new ModelRendererTurbo(this, 265, 148, textureX, textureY); // Box 228
		bodyModel[128] = new ModelRendererTurbo(this, 265, 151, textureX, textureY); // Box 229
		bodyModel[129] = new ModelRendererTurbo(this, 274, 143, textureX, textureY); // Box 30
		bodyModel[130] = new ModelRendererTurbo(this, 274, 138, textureX, textureY); // Box 31
		bodyModel[131] = new ModelRendererTurbo(this, 274, 154, textureX, textureY); // Box 232
		bodyModel[132] = new ModelRendererTurbo(this, 274, 149, textureX, textureY); // Box 233
		bodyModel[133] = new ModelRendererTurbo(this, 260, 141, textureX, textureY,"cull"); // Box 30 cull
		bodyModel[134] = new ModelRendererTurbo(this, 253, 148, textureX, textureY); // Box 235
		bodyModel[135] = new ModelRendererTurbo(this, 253, 151, textureX, textureY); // Box 236
		bodyModel[136] = new ModelRendererTurbo(this, 258, 148, textureX, textureY); // Box 237
		bodyModel[137] = new ModelRendererTurbo(this, 260, 151, textureX, textureY); // Box 238
		bodyModel[138] = new ModelRendererTurbo(this, 350, 63, textureX, textureY); // Box 128
		bodyModel[139] = new ModelRendererTurbo(this, 350, 56, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 360, 48, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 373, 48, textureX, textureY); // Box 128
		bodyModel[142] = new ModelRendererTurbo(this, 386, 48, textureX, textureY); // Box 128
		bodyModel[143] = new ModelRendererTurbo(this, 343, 24, textureX, textureY); // Box 248
		bodyModel[144] = new ModelRendererTurbo(this, 347, 32, textureX, textureY); // Box 249
		bodyModel[145] = new ModelRendererTurbo(this, 360, 40, textureX, textureY); // Box 250
		bodyModel[146] = new ModelRendererTurbo(this, 373, 41, textureX, textureY); // Box 251
		bodyModel[147] = new ModelRendererTurbo(this, 386, 40, textureX, textureY); // Box 252
		bodyModel[148] = new ModelRendererTurbo(this, 78, 227, textureX, textureY); // Box 128
		bodyModel[149] = new ModelRendererTurbo(this, 78, 235, textureX, textureY); // Box 128
		bodyModel[150] = new ModelRendererTurbo(this, 78, 232, textureX, textureY); // Box 128
		bodyModel[151] = new ModelRendererTurbo(this, 75, 194, textureX, textureY); // Box 192
		bodyModel[152] = new ModelRendererTurbo(this, 72, 187, textureX, textureY); // Box 193
		bodyModel[153] = new ModelRendererTurbo(this, 86, 191, textureX, textureY); // Box 194
		bodyModel[154] = new ModelRendererTurbo(this, 328, 44, textureX, textureY); // Box 128
		bodyModel[155] = new ModelRendererTurbo(this, 336, 40, textureX, textureY); // Box 726
		bodyModel[156] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 2
		bodyModel[157] = new ModelRendererTurbo(this, 348, 221, textureX, textureY); // Box 2
		bodyModel[158] = new ModelRendererTurbo(this, 348, 199, textureX, textureY); // Box 230
		bodyModel[159] = new ModelRendererTurbo(this, 373, 214, textureX, textureY); // Box 2
		bodyModel[160] = new ModelRendererTurbo(this, 373, 196, textureX, textureY); // Box 232
		bodyModel[161] = new ModelRendererTurbo(this, 384, 205, textureX, textureY); // Box 2
		bodyModel[162] = new ModelRendererTurbo(this, 384, 194, textureX, textureY); // Box 234
		bodyModel[163] = new ModelRendererTurbo(this, 394, 203, textureX, textureY); // Box 2
		bodyModel[164] = new ModelRendererTurbo(this, 394, 199, textureX, textureY); // Box 236
		bodyModel[165] = new ModelRendererTurbo(this, 383, 199, textureX, textureY); // Box 2
		bodyModel[166] = new ModelRendererTurbo(this, 365, 201, textureX, textureY); // Box 2
		bodyModel[167] = new ModelRendererTurbo(this, 334, 203, textureX, textureY); // Box 2
		bodyModel[168] = new ModelRendererTurbo(this, 435, 39, textureX, textureY); // Box 103
		bodyModel[169] = new ModelRendererTurbo(this, 434, 43, textureX, textureY); // Box 103
		bodyModel[170] = new ModelRendererTurbo(this, 434, 48, textureX, textureY); // Box 103
		bodyModel[171] = new ModelRendererTurbo(this, 435, 52, textureX, textureY); // Box 103
		bodyModel[172] = new ModelRendererTurbo(this, 435, 35, textureX, textureY); // Box 103
		bodyModel[173] = new ModelRendererTurbo(this, 435, 56, textureX, textureY); // Box 103
		bodyModel[174] = new ModelRendererTurbo(this, 434, 31, textureX, textureY); // Box 103
		bodyModel[175] = new ModelRendererTurbo(this, 434, 60, textureX, textureY); // Box 103
		bodyModel[176] = new ModelRendererTurbo(this, 415, 48, textureX, textureY); // Box 165
		bodyModel[177] = new ModelRendererTurbo(this, 415, 41, textureX, textureY); // Box 164
		bodyModel[178] = new ModelRendererTurbo(this, 451, 53, textureX, textureY); // Box 2
		bodyModel[179] = new ModelRendererTurbo(this, 451, 38, textureX, textureY); // Box 307
		bodyModel[180] = new ModelRendererTurbo(this, 427, 36, textureX, textureY); // Box 167
		bodyModel[181] = new ModelRendererTurbo(this, 427, 53, textureX, textureY); // Box 166
		bodyModel[182] = new ModelRendererTurbo(this, 420, 53, textureX, textureY); // Box 166
		bodyModel[183] = new ModelRendererTurbo(this, 420, 36, textureX, textureY); // Box 309
		bodyModel[184] = new ModelRendererTurbo(this, 441, 43, textureX, textureY,"lamp"); // Box 169 rear MARS light
		bodyModel[185] = new ModelRendererTurbo(this, 451, 50, textureX, textureY); // Box 2
		bodyModel[186] = new ModelRendererTurbo(this, 451, 47, textureX, textureY); // Box 2
		bodyModel[187] = new ModelRendererTurbo(this, 451, 41, textureX, textureY); // Box 261
		bodyModel[188] = new ModelRendererTurbo(this, 451, 44, textureX, textureY); // Box 262
		bodyModel[189] = new ModelRendererTurbo(this, 56, 90, textureX, textureY); // Right step part
		bodyModel[190] = new ModelRendererTurbo(this, 54, 93, textureX, textureY); // Right step part
		bodyModel[191] = new ModelRendererTurbo(this, 56, 100, textureX, textureY); // Right step part
		bodyModel[192] = new ModelRendererTurbo(this, 51, 94, textureX, textureY); // Right step part
		bodyModel[193] = new ModelRendererTurbo(this, 65, 94, textureX, textureY); // Right step part
		bodyModel[194] = new ModelRendererTurbo(this, 51, 96, textureX, textureY); // Right step part
		bodyModel[195] = new ModelRendererTurbo(this, 65, 96, textureX, textureY); // Right step part
		bodyModel[196] = new ModelRendererTurbo(this, 49, 82, textureX, textureY); // Box 1353
		bodyModel[197] = new ModelRendererTurbo(this, 65, 82, textureX, textureY); // Box 1354
		bodyModel[198] = new ModelRendererTurbo(this, 56, 86, textureX, textureY); // Box 1355
		bodyModel[199] = new ModelRendererTurbo(this, 54, 83, textureX, textureY); // Box 1356
		bodyModel[200] = new ModelRendererTurbo(this, 65, 80, textureX, textureY); // Box 1357
		bodyModel[201] = new ModelRendererTurbo(this, 65, 86, textureX, textureY); // Box 1359
		bodyModel[202] = new ModelRendererTurbo(this, 49, 86, textureX, textureY); // Box 1360
		bodyModel[203] = new ModelRendererTurbo(this, 51, 91, textureX, textureY); // Right step part
		bodyModel[204] = new ModelRendererTurbo(this, 65, 91, textureX, textureY); // Right step part
		bodyModel[205] = new ModelRendererTurbo(this, 56, 96, textureX, textureY); // Right step part
		bodyModel[206] = new ModelRendererTurbo(this, 49, 80, textureX, textureY); // Box 1358
		bodyModel[207] = new ModelRendererTurbo(this, 49, 58, textureX, textureY); // Box 26
		bodyModel[208] = new ModelRendererTurbo(this, 65, 58, textureX, textureY); // Box 26
		bodyModel[209] = new ModelRendererTurbo(this, 56, 62, textureX, textureY); // Box 26
		bodyModel[210] = new ModelRendererTurbo(this, 54, 59, textureX, textureY); // Box 26
		bodyModel[211] = new ModelRendererTurbo(this, 65, 56, textureX, textureY); // Box 26
		bodyModel[212] = new ModelRendererTurbo(this, 49, 56, textureX, textureY); // Box 26
		bodyModel[213] = new ModelRendererTurbo(this, 65, 62, textureX, textureY); // Box 26
		bodyModel[214] = new ModelRendererTurbo(this, 49, 62, textureX, textureY); // Box 26
		bodyModel[215] = new ModelRendererTurbo(this, 56, 76, textureX, textureY); // Left step part
		bodyModel[216] = new ModelRendererTurbo(this, 51, 67, textureX, textureY); // Left step part
		bodyModel[217] = new ModelRendererTurbo(this, 56, 66, textureX, textureY); // Left step part
		bodyModel[218] = new ModelRendererTurbo(this, 54, 69, textureX, textureY); // Left step part
		bodyModel[219] = new ModelRendererTurbo(this, 56, 72, textureX, textureY); // Left step part
		bodyModel[220] = new ModelRendererTurbo(this, 65, 67, textureX, textureY); // Left step part
		bodyModel[221] = new ModelRendererTurbo(this, 54, 79, textureX, textureY); // Left step part
		bodyModel[222] = new ModelRendererTurbo(this, 65, 72, textureX, textureY); // Left step part
		bodyModel[223] = new ModelRendererTurbo(this, 51, 72, textureX, textureY); // Left step part
		bodyModel[224] = new ModelRendererTurbo(this, 65, 70, textureX, textureY); // Left step part
		bodyModel[225] = new ModelRendererTurbo(this, 51, 70, textureX, textureY); // Left step part
		bodyModel[226] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[227] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[228] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 128
		bodyModel[229] = new ModelRendererTurbo(this, 28, 103, textureX, textureY); // Box 128
		bodyModel[230] = new ModelRendererTurbo(this, 6, 114, textureX, textureY); // Box 128
		bodyModel[231] = new ModelRendererTurbo(this, 27, 97, textureX, textureY); // Box 128
		bodyModel[232] = new ModelRendererTurbo(this, 26, 91, textureX, textureY); // Box 128
		bodyModel[233] = new ModelRendererTurbo(this, 24, 83, textureX, textureY); // Box 128
		bodyModel[234] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[235] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[236] = new ModelRendererTurbo(this, 19, 67, textureX, textureY); // Box 249
		bodyModel[237] = new ModelRendererTurbo(this, 28, 67, textureX, textureY); // Box 250
		bodyModel[238] = new ModelRendererTurbo(this, 27, 72, textureX, textureY); // Box 252
		bodyModel[239] = new ModelRendererTurbo(this, 26, 77, textureX, textureY); // Box 254
		bodyModel[240] = new ModelRendererTurbo(this, 18, 90, textureX, textureY); // Box 128
		bodyModel[241] = new ModelRendererTurbo(this, 15, 82, textureX, textureY); // Box 128
		bodyModel[242] = new ModelRendererTurbo(this, 14, 115, textureX, textureY); // Box 128
		bodyModel[243] = new ModelRendererTurbo(this, 4, 115, textureX, textureY); // Box 153
		bodyModel[244] = new ModelRendererTurbo(this, 10, 108, textureX, textureY); // Box 128
		bodyModel[245] = new ModelRendererTurbo(this, 18, 109, textureX, textureY); // Box 128
		bodyModel[246] = new ModelRendererTurbo(this, 18, 76, textureX, textureY); // Box 253
		bodyModel[247] = new ModelRendererTurbo(this, 4, 109, textureX, textureY); // Box 255
		bodyModel[248] = new ModelRendererTurbo(this, 18, 96, textureX, textureY); // Box 128
		bodyModel[249] = new ModelRendererTurbo(this, 18, 71, textureX, textureY); // Box 251
		bodyModel[250] = new ModelRendererTurbo(this, 16, 42, textureX, textureY); // Box 128
		bodyModel[251] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[252] = new ModelRendererTurbo(this, 66, 43, textureX, textureY); // Box 194
		bodyModel[253] = new ModelRendererTurbo(this, 69, 43, textureX, textureY); // Box 194
		bodyModel[254] = new ModelRendererTurbo(this, 66, 50, textureX, textureY); // Box 204
		bodyModel[255] = new ModelRendererTurbo(this, 69, 50, textureX, textureY); // Box 204
		bodyModel[256] = new ModelRendererTurbo(this, 469, 280, textureX, textureY); // Box 38
		bodyModel[257] = new ModelRendererTurbo(this, 469, 308, textureX, textureY); // Box 38
		bodyModel[258] = new ModelRendererTurbo(this, 469, 293, textureX, textureY); // Box 38
		bodyModel[259] = new ModelRendererTurbo(this, 469, 265, textureX, textureY); // Box 543
		bodyModel[260] = new ModelRendererTurbo(this, 266, 271, textureX, textureY); // Right seat part
		bodyModel[261] = new ModelRendererTurbo(this, 266, 301, textureX, textureY); // Left seat part
		bodyModel[262] = new ModelRendererTurbo(this, 298, 271, textureX, textureY); // Right seat part
		bodyModel[263] = new ModelRendererTurbo(this, 298, 301, textureX, textureY); // Left seat part
		bodyModel[264] = new ModelRendererTurbo(this, 330, 271, textureX, textureY); // Right seat part
		bodyModel[265] = new ModelRendererTurbo(this, 330, 301, textureX, textureY); // Left seat part
		bodyModel[266] = new ModelRendererTurbo(this, 362, 271, textureX, textureY); // Right seat part
		bodyModel[267] = new ModelRendererTurbo(this, 362, 301, textureX, textureY); // Left seat part
		bodyModel[268] = new ModelRendererTurbo(this, 394, 271, textureX, textureY); // Right seat part
		bodyModel[269] = new ModelRendererTurbo(this, 394, 301, textureX, textureY); // Left seat part
		bodyModel[270] = new ModelRendererTurbo(this, 426, 271, textureX, textureY); // Right seat part
		bodyModel[271] = new ModelRendererTurbo(this, 426, 301, textureX, textureY); // Left seat part
		bodyModel[272] = new ModelRendererTurbo(this, 458, 271, textureX, textureY); // Right seat part
		bodyModel[273] = new ModelRendererTurbo(this, 458, 301, textureX, textureY); // Left seat part
		bodyModel[274] = new ModelRendererTurbo(this, 245, 275, textureX, textureY); // Right seat part
		bodyModel[275] = new ModelRendererTurbo(this, 245, 305, textureX, textureY); // Left seat part
		bodyModel[276] = new ModelRendererTurbo(this, 250, 282, textureX, textureY); // Right seat part
		bodyModel[277] = new ModelRendererTurbo(this, 249, 289, textureX, textureY); // Right seat part
		bodyModel[278] = new ModelRendererTurbo(this, 259, 282, textureX, textureY); // Right seat part
		bodyModel[279] = new ModelRendererTurbo(this, 245, 285, textureX, textureY); // Right seat part
		bodyModel[280] = new ModelRendererTurbo(this, 266, 286, textureX, textureY); // Right seat part
		bodyModel[281] = new ModelRendererTurbo(this, 250, 264, textureX, textureY); // Right seat part
		bodyModel[282] = new ModelRendererTurbo(this, 249, 271, textureX, textureY); // Right seat part
		bodyModel[283] = new ModelRendererTurbo(this, 259, 264, textureX, textureY); // Right seat part
		bodyModel[284] = new ModelRendererTurbo(this, 245, 267, textureX, textureY); // Right seat part
		bodyModel[285] = new ModelRendererTurbo(this, 266, 268, textureX, textureY); // Right seat part
		bodyModel[286] = new ModelRendererTurbo(this, 250, 312, textureX, textureY); // Left seat part
		bodyModel[287] = new ModelRendererTurbo(this, 249, 319, textureX, textureY); // Left seat part
		bodyModel[288] = new ModelRendererTurbo(this, 259, 312, textureX, textureY); // Left seat part
		bodyModel[289] = new ModelRendererTurbo(this, 245, 315, textureX, textureY); // Left seat part
		bodyModel[290] = new ModelRendererTurbo(this, 266, 316, textureX, textureY); // Left seat part
		bodyModel[291] = new ModelRendererTurbo(this, 250, 294, textureX, textureY); // Left seat part
		bodyModel[292] = new ModelRendererTurbo(this, 249, 301, textureX, textureY); // Left seat part
		bodyModel[293] = new ModelRendererTurbo(this, 259, 294, textureX, textureY); // Left seat part
		bodyModel[294] = new ModelRendererTurbo(this, 245, 297, textureX, textureY); // Left seat part
		bodyModel[295] = new ModelRendererTurbo(this, 266, 298, textureX, textureY); // Left seat part
		bodyModel[296] = new ModelRendererTurbo(this, 277, 275, textureX, textureY); // Right seat part
		bodyModel[297] = new ModelRendererTurbo(this, 277, 305, textureX, textureY); // Left seat part
		bodyModel[298] = new ModelRendererTurbo(this, 282, 282, textureX, textureY); // Right seat part
		bodyModel[299] = new ModelRendererTurbo(this, 281, 289, textureX, textureY); // Right seat part
		bodyModel[300] = new ModelRendererTurbo(this, 291, 282, textureX, textureY); // Right seat part
		bodyModel[301] = new ModelRendererTurbo(this, 277, 285, textureX, textureY); // Right seat part
		bodyModel[302] = new ModelRendererTurbo(this, 298, 286, textureX, textureY); // Right seat part
		bodyModel[303] = new ModelRendererTurbo(this, 282, 264, textureX, textureY); // Right seat part
		bodyModel[304] = new ModelRendererTurbo(this, 281, 271, textureX, textureY); // Right seat part
		bodyModel[305] = new ModelRendererTurbo(this, 291, 264, textureX, textureY); // Right seat part
		bodyModel[306] = new ModelRendererTurbo(this, 277, 267, textureX, textureY); // Right seat part
		bodyModel[307] = new ModelRendererTurbo(this, 298, 268, textureX, textureY); // Right seat part
		bodyModel[308] = new ModelRendererTurbo(this, 282, 312, textureX, textureY); // Left seat part
		bodyModel[309] = new ModelRendererTurbo(this, 281, 319, textureX, textureY); // Left seat part
		bodyModel[310] = new ModelRendererTurbo(this, 291, 312, textureX, textureY); // Left seat part
		bodyModel[311] = new ModelRendererTurbo(this, 277, 315, textureX, textureY); // Left seat part
		bodyModel[312] = new ModelRendererTurbo(this, 298, 316, textureX, textureY); // Left seat part
		bodyModel[313] = new ModelRendererTurbo(this, 282, 294, textureX, textureY); // Left seat part
		bodyModel[314] = new ModelRendererTurbo(this, 281, 301, textureX, textureY); // Left seat part
		bodyModel[315] = new ModelRendererTurbo(this, 291, 294, textureX, textureY); // Left seat part
		bodyModel[316] = new ModelRendererTurbo(this, 277, 297, textureX, textureY); // Left seat part
		bodyModel[317] = new ModelRendererTurbo(this, 309, 275, textureX, textureY); // Right seat part
		bodyModel[318] = new ModelRendererTurbo(this, 309, 305, textureX, textureY); // Left seat part
		bodyModel[319] = new ModelRendererTurbo(this, 341, 305, textureX, textureY); // Left seat part
		bodyModel[320] = new ModelRendererTurbo(this, 346, 282, textureX, textureY); // Right seat part
		bodyModel[321] = new ModelRendererTurbo(this, 345, 289, textureX, textureY); // Right seat part
		bodyModel[322] = new ModelRendererTurbo(this, 355, 282, textureX, textureY); // Right seat part
		bodyModel[323] = new ModelRendererTurbo(this, 341, 285, textureX, textureY); // Right seat part
		bodyModel[324] = new ModelRendererTurbo(this, 362, 286, textureX, textureY); // Right seat part
		bodyModel[325] = new ModelRendererTurbo(this, 346, 264, textureX, textureY); // Right seat part
		bodyModel[326] = new ModelRendererTurbo(this, 345, 271, textureX, textureY); // Right seat part
		bodyModel[327] = new ModelRendererTurbo(this, 355, 264, textureX, textureY); // Right seat part
		bodyModel[328] = new ModelRendererTurbo(this, 341, 267, textureX, textureY); // Right seat part
		bodyModel[329] = new ModelRendererTurbo(this, 362, 268, textureX, textureY); // Right seat part
		bodyModel[330] = new ModelRendererTurbo(this, 314, 282, textureX, textureY); // Right seat part
		bodyModel[331] = new ModelRendererTurbo(this, 313, 289, textureX, textureY); // Right seat part
		bodyModel[332] = new ModelRendererTurbo(this, 323, 282, textureX, textureY); // Right seat part
		bodyModel[333] = new ModelRendererTurbo(this, 309, 285, textureX, textureY); // Right seat part
		bodyModel[334] = new ModelRendererTurbo(this, 330, 286, textureX, textureY); // Right seat part
		bodyModel[335] = new ModelRendererTurbo(this, 314, 264, textureX, textureY); // Right seat part
		bodyModel[336] = new ModelRendererTurbo(this, 313, 271, textureX, textureY); // Right seat part
		bodyModel[337] = new ModelRendererTurbo(this, 323, 264, textureX, textureY); // Right seat part
		bodyModel[338] = new ModelRendererTurbo(this, 309, 267, textureX, textureY); // Right seat part
		bodyModel[339] = new ModelRendererTurbo(this, 330, 268, textureX, textureY); // Right seat part
		bodyModel[340] = new ModelRendererTurbo(this, 346, 312, textureX, textureY); // Left seat part
		bodyModel[341] = new ModelRendererTurbo(this, 345, 319, textureX, textureY); // Left seat part
		bodyModel[342] = new ModelRendererTurbo(this, 355, 312, textureX, textureY); // Left seat part
		bodyModel[343] = new ModelRendererTurbo(this, 341, 315, textureX, textureY); // Left seat part
		bodyModel[344] = new ModelRendererTurbo(this, 362, 316, textureX, textureY); // Left seat part
		bodyModel[345] = new ModelRendererTurbo(this, 346, 294, textureX, textureY); // Left seat part
		bodyModel[346] = new ModelRendererTurbo(this, 345, 301, textureX, textureY); // Left seat part
		bodyModel[347] = new ModelRendererTurbo(this, 355, 294, textureX, textureY); // Left seat part
		bodyModel[348] = new ModelRendererTurbo(this, 341, 297, textureX, textureY); // Left seat part
		bodyModel[349] = new ModelRendererTurbo(this, 362, 298, textureX, textureY); // Left seat part
		bodyModel[350] = new ModelRendererTurbo(this, 314, 312, textureX, textureY); // Left seat part
		bodyModel[351] = new ModelRendererTurbo(this, 313, 319, textureX, textureY); // Left seat part
		bodyModel[352] = new ModelRendererTurbo(this, 323, 312, textureX, textureY); // Left seat part
		bodyModel[353] = new ModelRendererTurbo(this, 309, 315, textureX, textureY); // Left seat part
		bodyModel[354] = new ModelRendererTurbo(this, 330, 316, textureX, textureY); // Left seat part
		bodyModel[355] = new ModelRendererTurbo(this, 314, 294, textureX, textureY); // Left seat part
		bodyModel[356] = new ModelRendererTurbo(this, 313, 301, textureX, textureY); // Left seat part
		bodyModel[357] = new ModelRendererTurbo(this, 323, 294, textureX, textureY); // Left seat part
		bodyModel[358] = new ModelRendererTurbo(this, 309, 297, textureX, textureY); // Left seat part
		bodyModel[359] = new ModelRendererTurbo(this, 330, 298, textureX, textureY); // Left seat part
		bodyModel[360] = new ModelRendererTurbo(this, 341, 275, textureX, textureY); // Right seat part
		bodyModel[361] = new ModelRendererTurbo(this, 373, 275, textureX, textureY); // Right seat part
		bodyModel[362] = new ModelRendererTurbo(this, 373, 305, textureX, textureY); // Left seat part
		bodyModel[363] = new ModelRendererTurbo(this, 405, 275, textureX, textureY); // Right seat part
		bodyModel[364] = new ModelRendererTurbo(this, 405, 305, textureX, textureY); // Left seat part
		bodyModel[365] = new ModelRendererTurbo(this, 410, 282, textureX, textureY); // Right seat part
		bodyModel[366] = new ModelRendererTurbo(this, 409, 289, textureX, textureY); // Right seat part
		bodyModel[367] = new ModelRendererTurbo(this, 419, 282, textureX, textureY); // Right seat part
		bodyModel[368] = new ModelRendererTurbo(this, 405, 285, textureX, textureY); // Right seat part
		bodyModel[369] = new ModelRendererTurbo(this, 426, 286, textureX, textureY); // Right seat part
		bodyModel[370] = new ModelRendererTurbo(this, 410, 264, textureX, textureY); // Right seat part
		bodyModel[371] = new ModelRendererTurbo(this, 409, 271, textureX, textureY); // Right seat part
		bodyModel[372] = new ModelRendererTurbo(this, 419, 264, textureX, textureY); // Right seat part
		bodyModel[373] = new ModelRendererTurbo(this, 405, 267, textureX, textureY); // Right seat part
		bodyModel[374] = new ModelRendererTurbo(this, 426, 268, textureX, textureY); // Right seat part
		bodyModel[375] = new ModelRendererTurbo(this, 378, 282, textureX, textureY); // Right seat part
		bodyModel[376] = new ModelRendererTurbo(this, 377, 289, textureX, textureY); // Right seat part
		bodyModel[377] = new ModelRendererTurbo(this, 387, 282, textureX, textureY); // Right seat part
		bodyModel[378] = new ModelRendererTurbo(this, 373, 285, textureX, textureY); // Right seat part
		bodyModel[379] = new ModelRendererTurbo(this, 394, 286, textureX, textureY); // Right seat part
		bodyModel[380] = new ModelRendererTurbo(this, 378, 264, textureX, textureY); // Right seat part
		bodyModel[381] = new ModelRendererTurbo(this, 377, 271, textureX, textureY); // Right seat part
		bodyModel[382] = new ModelRendererTurbo(this, 387, 264, textureX, textureY); // Right seat part
		bodyModel[383] = new ModelRendererTurbo(this, 373, 267, textureX, textureY); // Right seat part
		bodyModel[384] = new ModelRendererTurbo(this, 394, 268, textureX, textureY); // Right seat part
		bodyModel[385] = new ModelRendererTurbo(this, 410, 312, textureX, textureY); // Left seat part
		bodyModel[386] = new ModelRendererTurbo(this, 409, 319, textureX, textureY); // Left seat part
		bodyModel[387] = new ModelRendererTurbo(this, 419, 312, textureX, textureY); // Left seat part
		bodyModel[388] = new ModelRendererTurbo(this, 405, 315, textureX, textureY); // Left seat part
		bodyModel[389] = new ModelRendererTurbo(this, 426, 316, textureX, textureY); // Left seat part
		bodyModel[390] = new ModelRendererTurbo(this, 410, 294, textureX, textureY); // Left seat part
		bodyModel[391] = new ModelRendererTurbo(this, 409, 301, textureX, textureY); // Left seat part
		bodyModel[392] = new ModelRendererTurbo(this, 419, 294, textureX, textureY); // Left seat part
		bodyModel[393] = new ModelRendererTurbo(this, 405, 297, textureX, textureY); // Left seat part
		bodyModel[394] = new ModelRendererTurbo(this, 426, 298, textureX, textureY); // Left seat part
		bodyModel[395] = new ModelRendererTurbo(this, 378, 312, textureX, textureY); // Left seat part
		bodyModel[396] = new ModelRendererTurbo(this, 377, 319, textureX, textureY); // Left seat part
		bodyModel[397] = new ModelRendererTurbo(this, 387, 312, textureX, textureY); // Left seat part
		bodyModel[398] = new ModelRendererTurbo(this, 373, 315, textureX, textureY); // Left seat part
		bodyModel[399] = new ModelRendererTurbo(this, 394, 316, textureX, textureY); // Left seat part
		bodyModel[400] = new ModelRendererTurbo(this, 378, 294, textureX, textureY); // Left seat part
		bodyModel[401] = new ModelRendererTurbo(this, 377, 301, textureX, textureY); // Left seat part
		bodyModel[402] = new ModelRendererTurbo(this, 387, 294, textureX, textureY); // Left seat part
		bodyModel[403] = new ModelRendererTurbo(this, 373, 297, textureX, textureY); // Left seat part
		bodyModel[404] = new ModelRendererTurbo(this, 394, 298, textureX, textureY); // Left seat part
		bodyModel[405] = new ModelRendererTurbo(this, 442, 282, textureX, textureY); // Right seat part
		bodyModel[406] = new ModelRendererTurbo(this, 437, 275, textureX, textureY); // Right seat part
		bodyModel[407] = new ModelRendererTurbo(this, 441, 289, textureX, textureY); // Right seat part
		bodyModel[408] = new ModelRendererTurbo(this, 451, 282, textureX, textureY); // Right seat part
		bodyModel[409] = new ModelRendererTurbo(this, 437, 285, textureX, textureY); // Right seat part
		bodyModel[410] = new ModelRendererTurbo(this, 458, 286, textureX, textureY); // Right seat part
		bodyModel[411] = new ModelRendererTurbo(this, 442, 264, textureX, textureY); // Right seat part
		bodyModel[412] = new ModelRendererTurbo(this, 441, 271, textureX, textureY); // Right seat part
		bodyModel[413] = new ModelRendererTurbo(this, 451, 264, textureX, textureY); // Right seat part
		bodyModel[414] = new ModelRendererTurbo(this, 437, 267, textureX, textureY); // Right seat part
		bodyModel[415] = new ModelRendererTurbo(this, 458, 268, textureX, textureY); // Right seat part
		bodyModel[416] = new ModelRendererTurbo(this, 437, 305, textureX, textureY); // Left seat part
		bodyModel[417] = new ModelRendererTurbo(this, 442, 312, textureX, textureY); // Left seat part
		bodyModel[418] = new ModelRendererTurbo(this, 441, 319, textureX, textureY); // Left seat part
		bodyModel[419] = new ModelRendererTurbo(this, 451, 312, textureX, textureY); // Left seat part
		bodyModel[420] = new ModelRendererTurbo(this, 437, 315, textureX, textureY); // Left seat part
		bodyModel[421] = new ModelRendererTurbo(this, 458, 316, textureX, textureY); // Left seat part
		bodyModel[422] = new ModelRendererTurbo(this, 442, 294, textureX, textureY); // Left seat part
		bodyModel[423] = new ModelRendererTurbo(this, 441, 301, textureX, textureY); // Left seat part
		bodyModel[424] = new ModelRendererTurbo(this, 451, 294, textureX, textureY); // Left seat part
		bodyModel[425] = new ModelRendererTurbo(this, 437, 297, textureX, textureY); // Left seat part
		bodyModel[426] = new ModelRendererTurbo(this, 458, 298, textureX, textureY); // Left seat part
		bodyModel[427] = new ModelRendererTurbo(this, 298, 298, textureX, textureY); // Left seat part
		bodyModel[428] = new ModelRendererTurbo(this, 228, 269, textureX, textureY); // Box 38
		bodyModel[429] = new ModelRendererTurbo(this, 228, 297, textureX, textureY); // Box 38
		bodyModel[430] = new ModelRendererTurbo(this, 362, 281, textureX, textureY); // Right seat part
		bodyModel[431] = new ModelRendererTurbo(this, 394, 281, textureX, textureY); // Right seat part
		bodyModel[432] = new ModelRendererTurbo(this, 426, 281, textureX, textureY); // Right seat part
		bodyModel[433] = new ModelRendererTurbo(this, 458, 281, textureX, textureY); // Right seat part
		bodyModel[434] = new ModelRendererTurbo(this, 394, 311, textureX, textureY); // Left seat part
		bodyModel[435] = new ModelRendererTurbo(this, 426, 311, textureX, textureY); // Left seat part
		bodyModel[436] = new ModelRendererTurbo(this, 458, 311, textureX, textureY); // Left seat part
		bodyModel[437] = new ModelRendererTurbo(this, 298, 311, textureX, textureY); // Left seat part
		bodyModel[438] = new ModelRendererTurbo(this, 266, 281, textureX, textureY); // Right seat part
		bodyModel[439] = new ModelRendererTurbo(this, 298, 281, textureX, textureY); // Right seat part
		bodyModel[440] = new ModelRendererTurbo(this, 330, 281, textureX, textureY); // Right seat part
		bodyModel[441] = new ModelRendererTurbo(this, 266, 311, textureX, textureY); // Left seat part
		bodyModel[442] = new ModelRendererTurbo(this, 330, 311, textureX, textureY); // Left seat part
		bodyModel[443] = new ModelRendererTurbo(this, 362, 311, textureX, textureY); // Left seat part
		bodyModel[444] = new ModelRendererTurbo(this, 442, 267, textureX, textureY); // Right seat part
		bodyModel[445] = new ModelRendererTurbo(this, 451, 267, textureX, textureY); // Right seat part
		bodyModel[446] = new ModelRendererTurbo(this, 451, 285, textureX, textureY); // Right seat part
		bodyModel[447] = new ModelRendererTurbo(this, 442, 285, textureX, textureY); // Right seat part
		bodyModel[448] = new ModelRendererTurbo(this, 442, 315, textureX, textureY); // Left seat part
		bodyModel[449] = new ModelRendererTurbo(this, 442, 297, textureX, textureY); // Left seat part
		bodyModel[450] = new ModelRendererTurbo(this, 451, 315, textureX, textureY); // Left seat part
		bodyModel[451] = new ModelRendererTurbo(this, 451, 297, textureX, textureY); // Left seat part
		bodyModel[452] = new ModelRendererTurbo(this, 410, 267, textureX, textureY); // Right seat part
		bodyModel[453] = new ModelRendererTurbo(this, 419, 267, textureX, textureY); // Right seat part
		bodyModel[454] = new ModelRendererTurbo(this, 419, 285, textureX, textureY); // Right seat part
		bodyModel[455] = new ModelRendererTurbo(this, 410, 285, textureX, textureY); // Right seat part
		bodyModel[456] = new ModelRendererTurbo(this, 410, 315, textureX, textureY); // Left seat part
		bodyModel[457] = new ModelRendererTurbo(this, 410, 297, textureX, textureY); // Left seat part
		bodyModel[458] = new ModelRendererTurbo(this, 419, 315, textureX, textureY); // Left seat part
		bodyModel[459] = new ModelRendererTurbo(this, 419, 297, textureX, textureY); // Left seat part
		bodyModel[460] = new ModelRendererTurbo(this, 378, 267, textureX, textureY); // Right seat part
		bodyModel[461] = new ModelRendererTurbo(this, 387, 267, textureX, textureY); // Right seat part
		bodyModel[462] = new ModelRendererTurbo(this, 387, 285, textureX, textureY); // Right seat part
		bodyModel[463] = new ModelRendererTurbo(this, 378, 285, textureX, textureY); // Right seat part
		bodyModel[464] = new ModelRendererTurbo(this, 378, 315, textureX, textureY); // Left seat part
		bodyModel[465] = new ModelRendererTurbo(this, 378, 297, textureX, textureY); // Left seat part
		bodyModel[466] = new ModelRendererTurbo(this, 387, 315, textureX, textureY); // Left seat part
		bodyModel[467] = new ModelRendererTurbo(this, 387, 297, textureX, textureY); // Left seat part
		bodyModel[468] = new ModelRendererTurbo(this, 346, 267, textureX, textureY); // Right seat part
		bodyModel[469] = new ModelRendererTurbo(this, 355, 267, textureX, textureY); // Right seat part
		bodyModel[470] = new ModelRendererTurbo(this, 355, 285, textureX, textureY); // Right seat part
		bodyModel[471] = new ModelRendererTurbo(this, 346, 285, textureX, textureY); // Right seat part
		bodyModel[472] = new ModelRendererTurbo(this, 346, 315, textureX, textureY); // Left seat part
		bodyModel[473] = new ModelRendererTurbo(this, 346, 297, textureX, textureY); // Left seat part
		bodyModel[474] = new ModelRendererTurbo(this, 355, 315, textureX, textureY); // Left seat part
		bodyModel[475] = new ModelRendererTurbo(this, 355, 297, textureX, textureY); // Left seat part
		bodyModel[476] = new ModelRendererTurbo(this, 314, 267, textureX, textureY); // Right seat part
		bodyModel[477] = new ModelRendererTurbo(this, 323, 267, textureX, textureY); // Right seat part
		bodyModel[478] = new ModelRendererTurbo(this, 323, 285, textureX, textureY); // Right seat part
		bodyModel[479] = new ModelRendererTurbo(this, 314, 285, textureX, textureY); // Right seat part
		bodyModel[480] = new ModelRendererTurbo(this, 314, 315, textureX, textureY); // Left seat part
		bodyModel[481] = new ModelRendererTurbo(this, 314, 297, textureX, textureY); // Left seat part
		bodyModel[482] = new ModelRendererTurbo(this, 323, 315, textureX, textureY); // Left seat part
		bodyModel[483] = new ModelRendererTurbo(this, 323, 297, textureX, textureY); // Left seat part
		bodyModel[484] = new ModelRendererTurbo(this, 282, 267, textureX, textureY); // Right seat part
		bodyModel[485] = new ModelRendererTurbo(this, 291, 267, textureX, textureY); // Right seat part
		bodyModel[486] = new ModelRendererTurbo(this, 291, 285, textureX, textureY); // Right seat part
		bodyModel[487] = new ModelRendererTurbo(this, 282, 285, textureX, textureY); // Right seat part
		bodyModel[488] = new ModelRendererTurbo(this, 282, 315, textureX, textureY); // Left seat part
		bodyModel[489] = new ModelRendererTurbo(this, 282, 297, textureX, textureY); // Left seat part
		bodyModel[490] = new ModelRendererTurbo(this, 291, 315, textureX, textureY); // Left seat part
		bodyModel[491] = new ModelRendererTurbo(this, 291, 297, textureX, textureY); // Left seat part
		bodyModel[492] = new ModelRendererTurbo(this, 250, 267, textureX, textureY); // Right seat part
		bodyModel[493] = new ModelRendererTurbo(this, 259, 267, textureX, textureY); // Right seat part
		bodyModel[494] = new ModelRendererTurbo(this, 259, 285, textureX, textureY); // Right seat part
		bodyModel[495] = new ModelRendererTurbo(this, 250, 285, textureX, textureY); // Right seat part
		bodyModel[496] = new ModelRendererTurbo(this, 250, 315, textureX, textureY); // Left seat part
		bodyModel[497] = new ModelRendererTurbo(this, 250, 297, textureX, textureY); // Left seat part
		bodyModel[498] = new ModelRendererTurbo(this, 259, 315, textureX, textureY); // Left seat part
		bodyModel[499] = new ModelRendererTurbo(this, 259, 297, textureX, textureY); // Left seat part

		bodyModel[0].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-61F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[1].setRotationPoint(-60F, 1F, -5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(60.5F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(57F, 3F, -3F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[4].setRotationPoint(-63F, 3F, -1.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[5].setRotationPoint(-61F, 3F, -5F);

		bodyModel[6].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[6].setRotationPoint(-56F, 3F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[7].setRotationPoint(43.5F, 4F, -1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[8].setRotationPoint(-44.5F, 4F, -1F);

		bodyModel[9].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[9].setRotationPoint(-56F, 1F, -10.99F);

		bodyModel[10].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[10].setRotationPoint(-56F, 1F, 4.99F);

		bodyModel[11].addShapeBox(-4F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[11].setRotationPoint(-55.99F, -14F, -10.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 104, 16, 1, 0F); // Box 38
		bodyModel[12].setRotationPoint(-56F, -15F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 104, 16, 1, 0F); // Box 128
		bodyModel[13].setRotationPoint(-56F, -15F, 10F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[14].setRotationPoint(-56F, -15F, -10F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[15].setRotationPoint(-56F, -15F, 3F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[16].setRotationPoint(-61F, -15F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[17].setRotationPoint(-61F, -15F, 3F);

		bodyModel[18].addShapeBox(-4F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[18].setRotationPoint(-55.99F, -14F, 10.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[19].setRotationPoint(-56F, -15F, -3F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[20].setRotationPoint(-61F, -15F, -3F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[21].setRotationPoint(-60F, -15F, -11F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[22].setRotationPoint(-60F, -15F, 10F);

		bodyModel[23].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[23].setRotationPoint(-54.99F, -14F, -3F);

		bodyModel[24].addBox(0F, 0F, 0F, 109, 2, 6, 0F); // Box 128
		bodyModel[24].setRotationPoint(-61F, -20F, -3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[25].setRotationPoint(-61F, -20F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 109, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[26].setRotationPoint(-61F, -19F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[27].setRotationPoint(-61F, -20F, 3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 109, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[28].setRotationPoint(-61F, -19F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[29].setRotationPoint(-61F, -19F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[30].setRotationPoint(-61F, -19F, 3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 109, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[31].setRotationPoint(-61F, -16F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 109, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[32].setRotationPoint(-61F, -16F, 10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate closed
		bodyModel[33].setRotationPoint(-61F, -7F, -3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate open
		bodyModel[34].setRotationPoint(-61F, -7F, 2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[35].setRotationPoint(-61F, -17F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[36].setRotationPoint(-61F, -18F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[37].setRotationPoint(-61F, -18F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[38].setRotationPoint(-61F, -16.25F, -10F);

		bodyModel[39].addBox(0F, 0F, 0F, 109, 1, 14, 0F); // Box 128
		bodyModel[39].setRotationPoint(-61F, -18F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[40].setRotationPoint(-61F, 3F, 10.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[41].setRotationPoint(-61F, 4F, 10.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[42].setRotationPoint(-56F, 4F, 10.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[43].setRotationPoint(-52.75F, 3F, 10.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[44].setRotationPoint(-54.5F, 4F, 10.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[45].setRotationPoint(35.25F, 3F, 10.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[46].setRotationPoint(33.5F, 4F, 10.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[47].setRotationPoint(-35.25F, 3F, 10.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[48].setRotationPoint(-34.5F, 4F, 10.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[49].setRotationPoint(-34F, 3F, 10.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[50].setRotationPoint(-33F, 4F, 10.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[51].setRotationPoint(-61F, 3F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[52].setRotationPoint(-61F, 4F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[53].setRotationPoint(-56F, 4F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.2F, 0F, 0F, -0.5F, -0.75F, 0F, -0.15F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.2F, -0.75F, 0F, -0.35F); // Box 28
		bodyModel[54].setRotationPoint(52.75F, 3F, -9.8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.1F, 0F, 0F, -0.5F, -1F, 0F, -0.8F, -0.5F, 0F, -0.9F, -0.5F, 0F, 0.4F, -1F, 0F, 0.3F); // Box 29
		bodyModel[55].setRotationPoint(53.5F, 4F, -9.65F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.05F, 0F, 0F, -0.5F); // Box 31 cull
		bodyModel[56].setRotationPoint(54F, 3F, -9.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[57].setRotationPoint(-52.75F, 3F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[58].setRotationPoint(-54.5F, 4F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[59].setRotationPoint(35.25F, 3F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[60].setRotationPoint(33.5F, 4F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[61].setRotationPoint(-35.25F, 3F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[62].setRotationPoint(-34.5F, 4F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[63].setRotationPoint(-34F, 3F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[64].setRotationPoint(-33F, 4F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[65].setRotationPoint(-56F, 3F, 10.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[66].setRotationPoint(-56F, 3F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[67].setRotationPoint(-62.5F, -15F, -4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[68].setRotationPoint(-62.5F, 1F, -4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[69].setRotationPoint(-62.5F, -14F, -4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[70].setRotationPoint(-62.5F, -14F, 3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[71].setRotationPoint(-63F, -14F, -5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[72].setRotationPoint(-63F, -14F, 3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[73].setRotationPoint(-63F, 1F, -5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[74].setRotationPoint(-63F, -15F, -5F);

		bodyModel[75].addBox(0F, 0F, 0F, 8, 2, 18, 0F); // Box 2
		bodyModel[75].setRotationPoint(48F, 1F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[76].setRotationPoint(48F, 1F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, -0.55F, 0F, 1.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.55F, 0F, 1.85F, 0F, 0F, 0F); // Box 38
		bodyModel[77].setRotationPoint(48F, -15F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 3, 2, 12, 0F); // Box 2
		bodyModel[78].setRotationPoint(56F, 1F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[79].setRotationPoint(56F, 1F, -9F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 2
		bodyModel[80].setRotationPoint(59F, 1F, -2F);

		bodyModel[81].addShapeBox(0F, 0F, -5F, 1, 14, 3, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear end door part
		bodyModel[81].setRotationPoint(60.5F, -13F, 2F);

		bodyModel[82].addShapeBox(0F, 0F, -3F, 1, 14, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Rear end door part
		bodyModel[82].setRotationPoint(60.5F, -13F, 2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[83].setRotationPoint(61F, 1F, -2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[84].setRotationPoint(59F, 1F, -6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 161
		bodyModel[85].setRotationPoint(56F, 1F, 6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[86].setRotationPoint(61F, 1F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[87].setRotationPoint(59F, 1F, 2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,-0.3F, 0F, -0.55F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -0.3F, 0F, -0.55F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 2
		bodyModel[88].setRotationPoint(58F, -15F, -6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		bodyModel[89].setRotationPoint(60F, -15F, -2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[90].setRotationPoint(60F, -15F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,-0.55F, 0F, -0.15F, 0.55F, 0F, -3.15F, -0.15F, 0F, 2.7F, 0F, 0F, 0F, -0.55F, 0F, -0.15F, 0.55F, 0F, -3.15F, -0.15F, 0F, 2.7F, 0F, 0F, 0F); // Box 38
		bodyModel[91].setRotationPoint(55.45F, -15F, -9.15F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 174
		bodyModel[92].setRotationPoint(48F, 1F, 9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 0F, 0F, -0.55F, 0F, 1.85F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 1.85F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 175
		bodyModel[93].setRotationPoint(48F, -15F, 10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.55F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.55F); // Box 176
		bodyModel[94].setRotationPoint(58F, -15F, 2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, -0.15F, 0F, 2.7F, 0.55F, 0F, -3.15F, -0.55F, 0F, -0.15F, 0F, 0F, 0F, -0.15F, 0F, 2.7F, 0.55F, 0F, -3.15F, -0.55F, 0F, -0.15F); // Box 177
		bodyModel[95].setRotationPoint(55.45F, -15F, 8.15F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, -0.55F, 1.25F, 0.85F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -0.55F, 0F, 0.85F, 0F, 0F, -1F); // Box 38
		bodyModel[96].setRotationPoint(48F, -16F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.55F, -1F, -0.15F, 0.55F, -1F, -3.15F, -0.15F, 1.25F, 1.7F, 0F, 1.25F, -1F, -0.55F, 0F, -0.15F, 0.55F, 0F, -3.15F, -0.15F, 0F, 1.7F, 0F, 0F, -1F); // Box 38
		bodyModel[97].setRotationPoint(55.45F, -16F, -9.15F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.3F, 1.25F, -0.55F, -1F, -1F, 0F, 1F, -1F, 0F, -2F, 1.25F, 0F, -0.3F, 0F, -0.55F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 2
		bodyModel[98].setRotationPoint(58F, -16F, -6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 1.25F, -1F, -0.55F, 1.25F, 0.85F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, -0.55F, 0F, 0.85F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 182
		bodyModel[99].setRotationPoint(48F, -16F, 9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 1.25F, -1F, -0.15F, 1.25F, 1.7F, 0.55F, -1F, -3.15F, -0.55F, -1F, -0.15F, 0F, 0F, -1F, -0.15F, 0F, 1.7F, 0.55F, 0F, -3.15F, -0.55F, 0F, -0.15F); // Box 183
		bodyModel[100].setRotationPoint(55.45F, -16F, 7.15F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2F, 1.25F, 0F, 1F, -1F, 0F, -1F, -1F, 0F, -0.3F, 1.25F, -0.55F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, -0.55F); // Box 184
		bodyModel[101].setRotationPoint(58F, -16F, 2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, -1.75F, 0F, -0.55F, -1.75F, -1.85F, -2.2F, 0F, 1.35F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, -1.85F, -2.2F, 0F, 1.35F, 0F, 0F, 0F); // Box 128
		bodyModel[102].setRotationPoint(48F, -19F, -10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, -2.2F, 0F, 1.35F, -0.55F, -1.75F, -1.85F, 0F, -1.75F, 0F, 0F, 0F, 0F, -2.2F, 0F, 1.35F, -0.55F, 0F, -1.85F, 0F, 0F, 0F); // Box 188
		bodyModel[103].setRotationPoint(48F, -19F, 7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-2.2F, -1.75F, 2.35F, 2.05F, -1.75F, -0.35F, -0.4F, 0F, -0.75F, -0.55F, 0F, -2.85F, -2.2F, 0F, 2.35F, 2.05F, 0F, -0.35F, -0.4F, 0F, -0.75F, -0.55F, 0F, -2.85F); // Box 128
		bodyModel[104].setRotationPoint(53.25F, -19F, -5.8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.55F, 0F, -2.85F, -0.4F, 0F, -0.75F, 2.05F, -1.75F, -0.35F, -2.2F, -1.75F, 2.35F, -0.55F, 0F, -2.85F, -0.4F, 0F, -0.75F, 2.05F, 0F, -0.35F, -2.2F, 0F, 2.35F); // Box 191
		bodyModel[105].setRotationPoint(53.25F, -19F, 2.8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-0.4F, 0F, -0.75F, -0.9F, 0F, -4.2F, -3.9F, 1.75F, 0.2F, 2.05F, 1.75F, -1.35F, -0.4F, 0.25F, -0.75F, -0.9F, 0.25F, -4.2F, -3.9F, 0.25F, 0.2F, 2.05F, 0.25F, -1.35F); // Box 128
		bodyModel[106].setRotationPoint(57.9F, -17.25F, -6.2F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,2.05F, 1.75F, -1.35F, -3.9F, 1.75F, 0.2F, -0.9F, 0F, -4.2F, -0.4F, 0F, -0.75F, 2.05F, 0.25F, -1.35F, -3.9F, 0.25F, 0.2F, -0.9F, 0.25F, -4.2F, -0.4F, 0.25F, -0.75F); // Box 196
		bodyModel[107].setRotationPoint(57.9F, -17.25F, 2.2F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[108].setRotationPoint(57F, -19F, -2F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[109].setRotationPoint(57F, -19F, 0F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 4, 5, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 128
		bodyModel[110].setRotationPoint(48F, -20F, -2.3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, -0.35F, 0F, -0.7F, -0.35F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.35F, 0F, -0.7F, -0.35F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 128
		bodyModel[111].setRotationPoint(48F, -20F, -3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -1F, 0F, -0.35F, 0F, -4.7F, -0.35F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -4.7F, -0.35F, 0F, 0.7F, 0F, 0F, 0F); // Box 128
		bodyModel[112].setRotationPoint(48F, -20F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0.7F, -0.2F, 0F, -0.65F, -2.35F, 1F, 0F, 0F, 0F, -4.7F, 0F, 0F, 0.7F, -0.2F, 0F, -0.65F, -2.35F, 0F, 0F, 0F, 0F, -4.7F); // Box 128
		bodyModel[113].setRotationPoint(48F, -19F, -6.3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.7F, 0F, 0F, 0F); // Box 205
		bodyModel[114].setRotationPoint(48F, -20F, 2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -0.4F, 0F, 0.7F, -0.35F, 0F, -4.7F, 0F, -1F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0.7F, -0.35F, 0F, -4.7F, 0F, 0F, 0F); // Box 206
		bodyModel[115].setRotationPoint(48F, -20F, 3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, -4.7F, -2.35F, 1F, 0F, -0.2F, 0F, -0.65F, 0F, 0F, 0.7F, 0F, 0F, -4.7F, -2.35F, 0F, 0F, -0.2F, 0F, -0.65F, 0F, 0F, 0.7F); // Box 207
		bodyModel[116].setRotationPoint(48F, -19F, 2.3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0.05F, 0F, -1.2F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.05F, 0F, -1.2F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 128
		bodyModel[117].setRotationPoint(51.65F, -20F, -2.3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -1.2F, 0F, 0F, 0F); // Box 214
		bodyModel[118].setRotationPoint(51.65F, -20F, 1.3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2.15F, -1F, 0F, 2.2F, -1F, -2.1F, -0.95F, 0F, 0.55F, 0F, 0F, -0.65F, -2.15F, 1F, 0F, 2.2F, 1F, -2.1F, -0.95F, 0F, 0.55F, 0F, 0F, -0.65F); // Box 128
		bodyModel[119].setRotationPoint(51.65F, -20F, -5.65F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -0.65F, -0.95F, 0F, 0.55F, 2.2F, -1F, -2.1F, -2.15F, -1F, 0F, 0F, 0F, -0.65F, -0.95F, 0F, 0.55F, 2.2F, 1F, -2.1F, -2.15F, 1F, 0F); // Box 220
		bodyModel[120].setRotationPoint(51.65F, -20F, 1.65F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.95F, 0F, 0.55F, 0.1F, 0F, -1F, -4.2F, 1F, -2.1F, 2.2F, 1F, -2.1F, -0.95F, 0F, 0.55F, 0.1F, 0F, -1F, -4.2F, -1F, -2.1F, 2.2F, -1F, -2.1F); // Box 128
		bodyModel[121].setRotationPoint(54.9F, -19F, -3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,2.2F, 1F, -2.1F, -4.2F, 1F, -2.1F, 0.1F, 0F, -1F, -0.95F, 0F, 0.55F, 2.2F, -1F, -2.1F, -4.2F, -1F, -2.1F, 0.1F, 0F, -1F, -0.95F, 0F, 0.55F); // Box 222
		bodyModel[122].setRotationPoint(54.9F, -19F, -1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-4.2F, -1F, -2.1F, 2.7F, -1F, -4.1F, -1.6F, 0F, 0.1F, 0.1F, 0F, -1F, -4.2F, 1F, -2.1F, 2.7F, 1F, -4.1F, -1.6F, 0F, 0.1F, 0.1F, 0F, -1F); // Box 128
		bodyModel[123].setRotationPoint(52.8F, -20F, -4.1F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.1F, 0F, -1F, -1.6F, 0F, 0.1F, 2.7F, -1F, -4.1F, -4.2F, -1F, -2.1F, 0.1F, 0F, -1F, -1.6F, 0F, 0.1F, 2.7F, 1F, -4.1F, -4.2F, 1F, -2.1F); // Box 224
		bodyModel[124].setRotationPoint(52.8F, -20F, 0.0999999999999996F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, -0.4F, 0F, 2.3F, 0.3F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, -3F, -0.4F, 0F, 2.3F, 0.3F, 0F, -0.55F); // Box 31
		bodyModel[125].setRotationPoint(56F, 3F, -9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, -0.4F, 0F, 2.3F, 0.3F, 0F, -0.55F, 0.25F, 0F, -0.4F, -0.4F, 0F, -3.3F, -0.8F, 0F, 2.6F, 0.55F, 0F, -0.15F); // Box 31
		bodyModel[126].setRotationPoint(56F, 4F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.3F, 0F, -0.55F, -0.4F, 0F, 2.3F, 0F, 0F, -3F, 0F, 0F, 0F, 0.3F, 0F, -0.55F, -0.4F, 0F, 2.3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 228
		bodyModel[127].setRotationPoint(56F, 3F, 8F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.3F, 0F, -0.55F, -0.4F, 0F, 2.3F, 0F, 0F, -3F, 0F, 0F, 0F, 0.55F, 0F, -0.15F, -0.8F, 0F, 2.6F, -0.4F, 0F, -3.3F, 0.25F, 0F, -0.4F); // Box 229
		bodyModel[128].setRotationPoint(56F, 4F, 8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.9F, 0F, -0.3F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.3F, 0F, -0.6F, -1.9F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[129].setRotationPoint(59.5F, 4F, -6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.1F, 0F, -0.3F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.1F, 0F, -0.3F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 31
		bodyModel[130].setRotationPoint(58.5F, 3F, -6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.9F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.9F, 0F, -0.3F, 1.3F, 0F, -0.6F); // Box 232
		bodyModel[131].setRotationPoint(59.5F, 4F, 3F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, -0.3F, -1.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, -0.3F); // Box 233
		bodyModel[132].setRotationPoint(58.5F, 3F, 3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, -0.3F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.65F, -0.55F, 0F, 0.1F, 0F, 0F, 0F); // Box 30 cull
		bodyModel[133].setRotationPoint(55F, 4F, -9.25F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.3F, 0F, 0F, 0F, -0.75F, 0F, -0.35F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.3F, -0.75F, 0F, -0.15F); // Box 235
		bodyModel[134].setRotationPoint(52.75F, 3F, 8.8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.4F, 0F, 0F, 0F, -1F, 0F, 0.3F, -0.5F, 0F, 0.4F, -0.5F, 0F, -0.9F, -1F, 0F, -0.8F); // Box 236
		bodyModel[135].setRotationPoint(53.5F, 4F, 8.65F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.3F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 237
		bodyModel[136].setRotationPoint(54F, 3F, 8.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0.1F, -0.25F, 0F, -0.65F, 0F, 0F, -0.5F); // Box 238
		bodyModel[137].setRotationPoint(55F, 4F, 8.25F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, -0.35F, 0F, -4.7F, -0.35F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.35F, 0F, -4.7F, -0.35F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 128
		bodyModel[138].setRotationPoint(48F, -18F, -7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0.7F, -0.2F, 0F, -0.65F, -2.35F, 0F, 0F, 0F, 0F, -4.7F, 0F, 0F, 0.7F, -0.2F, 0F, -0.65F, -2.35F, 0F, 0F, 0F, 0F, -4.7F); // Box 128
		bodyModel[139].setRotationPoint(48F, -18F, -6.3F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-2.15F, -1F, 0F, 2.2F, -1F, -2.1F, -0.95F, 0F, 0.55F, 0F, 0F, -0.65F, -2.15F, 0F, 0F, 2.2F, 0F, -2.1F, -0.95F, 0F, 0.55F, 0F, 0F, -0.65F); // Box 128
		bodyModel[140].setRotationPoint(51.65F, -19F, -5.65F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.95F, 0F, 0.55F, 0.1F, 0F, -1F, -4.2F, 1F, -2.1F, 2.2F, 1F, -2.1F, -0.95F, 0F, 0.55F, 0.1F, 0F, -1F, -4.2F, 0F, -2.1F, 2.2F, 0F, -2.1F); // Box 128
		bodyModel[141].setRotationPoint(54.9F, -18F, -3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-4.2F, -1F, -2.1F, 2.7F, -1F, -4.1F, -1.6F, 0F, 0.1F, 0.1F, 0F, -1F, -4.2F, 0F, -2.1F, 2.7F, 0F, -4.1F, -1.6F, 0F, 0.1F, 0.1F, 0F, -1F); // Box 128
		bodyModel[142].setRotationPoint(52.8F, -19F, -4.1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -4.7F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -4.7F, 0F, 0F, 0F); // Box 248
		bodyModel[143].setRotationPoint(48F, -18F, 2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -4.7F, -2.35F, 0F, 0F, -0.2F, 0F, -0.65F, 0F, 0F, 0.7F, 0F, 0F, -4.7F, -2.35F, 0F, 0F, -0.2F, 0F, -0.65F, 0F, 0F, 0.7F); // Box 249
		bodyModel[144].setRotationPoint(48F, -18F, 2.3F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, -0.65F, -0.95F, 0F, 0.55F, 2.2F, -1F, -2.1F, -2.15F, -1F, 0F, 0F, 0F, -0.65F, -0.95F, 0F, 0.55F, 2.2F, 0F, -2.1F, -2.15F, 0F, 0F); // Box 250
		bodyModel[145].setRotationPoint(51.65F, -19F, 1.65F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,2.2F, 1F, -2.1F, -4.2F, 1F, -2.1F, 0.1F, 0F, -1F, -0.95F, 0F, 0.55F, 2.2F, 0F, -2.1F, -4.2F, 0F, -2.1F, 0.1F, 0F, -1F, -0.95F, 0F, 0.55F); // Box 251
		bodyModel[146].setRotationPoint(54.9F, -18F, -1F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0.1F, 0F, -1F, -1.6F, 0F, 0.1F, 2.7F, -1F, -4.1F, -4.2F, -1F, -2.1F, 0.1F, 0F, -1F, -1.6F, 0F, 0.1F, 2.7F, 0F, -4.1F, -4.2F, 0F, -2.1F); // Box 252
		bodyModel[147].setRotationPoint(52.8F, -19F, 0.0999999999999996F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 71, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[148].setRotationPoint(-27F, -17F, -8.25F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 71, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[149].setRotationPoint(-27F, -16F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 71, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[150].setRotationPoint(-27F, -18F, -8.25F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 71, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[151].setRotationPoint(-27F, -17F, 5.25F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 71, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[152].setRotationPoint(-27F, -16F, 8F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 71, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[153].setRotationPoint(-27F, -18F, 7.25F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, -0.95F, 0F, 0F, -0.45F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.45F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 128
		bodyModel[154].setRotationPoint(51.65F, -20F, -1.1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0.1F, -0.45F, 0F, 0.1F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.45F, 0F, 0.1F, -0.95F, 0F, 0F, 0F, 0F, 0F); // Box 726
		bodyModel[155].setRotationPoint(51.65F, -20F, 0.1F);

		bodyModel[156].addBox(0F, 0F, 0F, 104, 2, 22, 0F); // Box 2
		bodyModel[156].setRotationPoint(-56F, 1F, -11F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0.45F, 0F, -1.85F, 0.45F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0.45F, 0F, -1.85F, 0.45F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 2
		bodyModel[157].setRotationPoint(48F, -16F, -10F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, -0.15F, 0.45F, 0F, -0.15F, 0.45F, 0F, -1.85F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0.45F, 0F, -0.15F, 0.45F, 0F, -1.85F, 0F, 0F, 0F); // Box 230
		bodyModel[158].setRotationPoint(48F, -16F, 8F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.15F, 0F, -2.7F, -0.15F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.15F, 0F, -2.7F, -0.15F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 2
		bodyModel[159].setRotationPoint(55.45F, -16F, -8.15F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -2.7F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -2.7F, 0F, 0F, 0F); // Box 232
		bodyModel[160].setRotationPoint(55.45F, -16F, 5.15F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -0.3F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, -2F, 0F, 0F, -0.3F, 0F, 0.45F, 0F, 0F, 0.45F); // Box 2
		bodyModel[161].setRotationPoint(58.3F, -16F, -5.45F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0.45F, -0.3F, 0F, 0.45F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, -0.3F, 0F, 0.45F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[162].setRotationPoint(58.3F, -16F, 2.45F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[163].setRotationPoint(60F, -16F, -2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[164].setRotationPoint(60F, -16F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[165].setRotationPoint(58.3F, -16F, -2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 2
		bodyModel[166].setRotationPoint(55.45F, -16F, -5.45F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 7, 1, 16, 0F,0F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2
		bodyModel[167].setRotationPoint(48F, -16F, -8.15F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[168].setRotationPoint(60.5F, -19.75F, 1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[169].setRotationPoint(60.5F, -19.75F, 0F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[170].setRotationPoint(60.5F, -19.75F, -2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[171].setRotationPoint(60.5F, -19.75F, -2F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[172].setRotationPoint(60.5F, -17.75F, 1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[173].setRotationPoint(60.5F, -17.75F, -2F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[174].setRotationPoint(60.5F, -16.75F, 0F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[175].setRotationPoint(60.5F, -16.75F, -2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[176].setRotationPoint(53.2F, -19.75F, -2F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[177].setRotationPoint(53.2F, -19.75F, 0F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1.25F, 0F, -1F, -1F, 0F, -0.875F, -1F, -0.5F, -0.125F, 1.25F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.875F, 0F, -0.5F, -0.125F, 0F, -0.5F); // Box 2
		bodyModel[178].setRotationPoint(60F, -16F, -2F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.125F, 1.25F, -0.5F, -0.875F, -1F, -0.5F, -1F, -1F, 0F, 0F, 1.25F, 0F, -0.125F, 0F, -0.5F, -0.875F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[179].setRotationPoint(60F, -16F, 1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 167
		bodyModel[180].setRotationPoint(59.5F, -17.75F, 0F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[181].setRotationPoint(59.5F, -17.75F, -2F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, -0.8F, -0.5F, 0F); // Box 166
		bodyModel[182].setRotationPoint(58.7F, -17.75F, -2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 309
		bodyModel[183].setRotationPoint(58.7F, -17.75F, 0F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 rear MARS light
		bodyModel[184].setRotationPoint(60.5F, -19F, -1.25F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.125F, 0.25F, 0F, -1.43F, 0.25F, 0F, -1.225F, 0.085F, -0.5F, -0.25F, 0.085F, -0.5F, -0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 2
		bodyModel[185].setRotationPoint(60F, -16F, -1.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0.085F, 0F, -1.225F, 0.085F, 0F, -0.84F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		bodyModel[186].setRotationPoint(60F, -16F, -1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0.085F, -0.5F, -1.225F, 0.085F, -0.5F, -1.43F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.875F, 0F, 0F, -0.125F, 0F, 0F); // Box 261
		bodyModel[187].setRotationPoint(60F, -16F, 0.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.25F, 0F, -0.84F, -0.25F, 0F, -1.225F, 0.085F, 0F, -0.25F, 0.085F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F); // Box 262
		bodyModel[188].setRotationPoint(60F, -16F, 0F);

		bodyModel[189].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[189].setRotationPoint(-59.99F, 4F, 8F);

		bodyModel[190].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[190].setRotationPoint(-59.99F, 4F, 8F);

		bodyModel[191].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[191].setRotationPoint(-59.99F, 4F, 8F);

		bodyModel[192].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[192].setRotationPoint(-59.99F, 4F, 8F);

		bodyModel[193].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[193].setRotationPoint(-56.01F, 4F, 8F);

		bodyModel[194].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[194].setRotationPoint(-59.99F, 4F, 8F);

		bodyModel[195].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[195].setRotationPoint(-56.01F, 4F, 8F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[196].setRotationPoint(-60F, 3F, 4.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[197].setRotationPoint(-56F, 3F, 4.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[198].setRotationPoint(-59.99F, 3F, 7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[199].setRotationPoint(-59.99F, 3F, 5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[200].setRotationPoint(-56F, 3F, 7.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1359
		bodyModel[201].setRotationPoint(-56F, 4F, 7.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1360
		bodyModel[202].setRotationPoint(-60F, 4F, 7.5F);

		bodyModel[203].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[203].setRotationPoint(-59.99F, 4F, 8F);

		bodyModel[204].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[204].setRotationPoint(-56.01F, 4F, 8F);

		bodyModel[205].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[205].setRotationPoint(-59.99F, 4F, 8F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[206].setRotationPoint(-60F, 3F, 7.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[207].setRotationPoint(-60F, 3F, -7.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[208].setRotationPoint(-56F, 3F, -7.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[209].setRotationPoint(-59.99F, 3F, -7F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[210].setRotationPoint(-59.99F, 3F, -7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[211].setRotationPoint(-56F, 3F, -10.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[212].setRotationPoint(-60F, 3F, -10.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[213].setRotationPoint(-56F, 4F, -10.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[214].setRotationPoint(-60F, 4F, -10.5F);

		bodyModel[215].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[215].setRotationPoint(-59.99F, 4F, -8F);

		bodyModel[216].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[216].setRotationPoint(-59.99F, 4F, -8F);

		bodyModel[217].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[217].setRotationPoint(-59.99F, 4F, -8F);

		bodyModel[218].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[218].setRotationPoint(-59.99F, 4F, -8F);

		bodyModel[219].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[219].setRotationPoint(-59.99F, 4F, -8F);

		bodyModel[220].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[220].setRotationPoint(-56.01F, 4F, -8F);

		bodyModel[221].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[221].setRotationPoint(-59.99F, 4F, -8F);

		bodyModel[222].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[222].setRotationPoint(-56.01F, 4F, -8F);

		bodyModel[223].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[223].setRotationPoint(-59.99F, 4F, -8F);

		bodyModel[224].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[224].setRotationPoint(-56.01F, 4F, -8F);

		bodyModel[225].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[225].setRotationPoint(-59.99F, 4F, -8F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[226].setRotationPoint(-63F, -15F, -11F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[227].setRotationPoint(-62.5F, -15F, -11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[228].setRotationPoint(-63F, -16F, -11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[229].setRotationPoint(-62.5F, -15F, -11F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[230].setRotationPoint(-63F, 1F, -10F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[231].setRotationPoint(-62.5F, -19F, -10F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[232].setRotationPoint(-62.5F, -20F, -7F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[233].setRotationPoint(-62.5F, -20F, -3F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[234].setRotationPoint(-63F, -15F, 10F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[235].setRotationPoint(-62.5F, -15F, 11F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[236].setRotationPoint(-63F, -16F, 9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[237].setRotationPoint(-62.5F, -15F, 9F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[238].setRotationPoint(-62.5F, -19F, 7F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[239].setRotationPoint(-62.5F, -20F, 3F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[240].setRotationPoint(-63F, -20F, -7F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[241].setRotationPoint(-63F, -20F, -3F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[242].setRotationPoint(-63F, -16F, -4F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[243].setRotationPoint(-63F, -16F, 1F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[244].setRotationPoint(-63F, -19F, -1F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[245].setRotationPoint(-63F, -18.75F, -5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[246].setRotationPoint(-63F, -20F, 3F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[247].setRotationPoint(-63F, -18.75F, 4F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[248].setRotationPoint(-63F, -19F, -10F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[249].setRotationPoint(-63F, -19F, 7F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[250].setRotationPoint(-63F, -16F, -5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[251].setRotationPoint(-63F, -16F, 0F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[252].setRotationPoint(-60.5F, -6F, -12F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[253].setRotationPoint(-55.5F, -6F, -12F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[254].setRotationPoint(-60.5F, -6F, 11F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[255].setRotationPoint(-55.5F, -6F, 11F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 38
		bodyModel[256].setRotationPoint(44F, -5F, 4F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 38
		bodyModel[257].setRotationPoint(44F, -5F, -10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 0, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[258].setRotationPoint(44F, -15F, -10F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 0, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[259].setRotationPoint(44F, -15F, 6F);

		bodyModel[260].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[260].setRotationPoint(-21.5F, -8F, 7F);
		bodyModel[260].rotateAngleY = -1.57079633F;

		bodyModel[261].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[261].setRotationPoint(-21.5F, -8F, -7F);
		bodyModel[261].rotateAngleY = -4.71238898F;

		bodyModel[262].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[262].setRotationPoint(-11.5F, -8F, 7F);
		bodyModel[262].rotateAngleY = -1.57079633F;

		bodyModel[263].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[263].setRotationPoint(-11.5F, -8F, -7F);
		bodyModel[263].rotateAngleY = -4.71238898F;

		bodyModel[264].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[264].setRotationPoint(-1.5F, -8F, 7F);
		bodyModel[264].rotateAngleY = -1.57079633F;

		bodyModel[265].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[265].setRotationPoint(-1.5F, -8F, -7F);
		bodyModel[265].rotateAngleY = -4.71238898F;

		bodyModel[266].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[266].setRotationPoint(8.5F, -8F, 7F);
		bodyModel[266].rotateAngleY = -1.57079633F;

		bodyModel[267].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[267].setRotationPoint(8.5F, -8F, -7F);
		bodyModel[267].rotateAngleY = -4.71238898F;

		bodyModel[268].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[268].setRotationPoint(18.5F, -8F, 7F);
		bodyModel[268].rotateAngleY = -1.57079633F;

		bodyModel[269].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[269].setRotationPoint(18.5F, -8F, -7F);
		bodyModel[269].rotateAngleY = -4.71238898F;

		bodyModel[270].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[270].setRotationPoint(28.5F, -8F, 7F);
		bodyModel[270].rotateAngleY = -1.57079633F;

		bodyModel[271].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[271].setRotationPoint(28.5F, -8F, -7F);
		bodyModel[271].rotateAngleY = -4.71238898F;

		bodyModel[272].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[272].setRotationPoint(38.5F, -8F, 7F);
		bodyModel[272].rotateAngleY = -1.57079633F;

		bodyModel[273].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[273].setRotationPoint(38.5F, -8F, -7F);
		bodyModel[273].rotateAngleY = -4.71238898F;

		bodyModel[274].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[274].setRotationPoint(-21.5F, -3F, 7F);
		bodyModel[274].rotateAngleY = -1.57079633F;

		bodyModel[275].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[275].setRotationPoint(-21.5F, -3F, -7F);
		bodyModel[275].rotateAngleY = -4.71238898F;

		bodyModel[276].addShapeBox(-1F, 0F, 2F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[276].setRotationPoint(-21.5F, -5F, 7F);
		bodyModel[276].rotateAngleY = -1.57079633F;

		bodyModel[277].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Right seat part
		bodyModel[277].setRotationPoint(-21.5F, -3F, 7F);
		bodyModel[277].rotateAngleY = -1.57079633F;

		bodyModel[278].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[278].setRotationPoint(-21.5F, -5F, 7F);
		bodyModel[278].rotateAngleY = -1.57079633F;

		bodyModel[279].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[279].setRotationPoint(-21.5F, -4.5F, 7F);
		bodyModel[279].rotateAngleY = -1.57079633F;

		bodyModel[280].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[280].setRotationPoint(-21.5F, -4F, 7F);
		bodyModel[280].rotateAngleY = -1.57079633F;

		bodyModel[281].addShapeBox(-1F, 0F, -3F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[281].setRotationPoint(-21.5F, -5F, 7F);
		bodyModel[281].rotateAngleY = -1.57079633F;

		bodyModel[282].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[282].setRotationPoint(-21.5F, -3F, 7F);
		bodyModel[282].rotateAngleY = -1.57079633F;

		bodyModel[283].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[283].setRotationPoint(-21.5F, -5F, 7F);
		bodyModel[283].rotateAngleY = -1.57079633F;

		bodyModel[284].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[284].setRotationPoint(-21.5F, -4.5F, 7F);
		bodyModel[284].rotateAngleY = -1.57079633F;

		bodyModel[285].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[285].setRotationPoint(-21.5F, -4F, 7F);
		bodyModel[285].rotateAngleY = -1.57079633F;

		bodyModel[286].addShapeBox(-1F, 0F, 2F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[286].setRotationPoint(-21.5F, -5F, -7F);
		bodyModel[286].rotateAngleY = -4.71238898F;

		bodyModel[287].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[287].setRotationPoint(-21.5F, -3F, -7F);
		bodyModel[287].rotateAngleY = -4.71238898F;

		bodyModel[288].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[288].setRotationPoint(-21.5F, -5F, -7F);
		bodyModel[288].rotateAngleY = -4.71238898F;

		bodyModel[289].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[289].setRotationPoint(-21.5F, -4.5F, -7F);
		bodyModel[289].rotateAngleY = -4.71238898F;

		bodyModel[290].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[290].setRotationPoint(-21.5F, -4F, -7F);
		bodyModel[290].rotateAngleY = -4.71238898F;

		bodyModel[291].addShapeBox(-1F, 0F, -3F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[291].setRotationPoint(-21.5F, -5F, -7F);
		bodyModel[291].rotateAngleY = -4.71238898F;

		bodyModel[292].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[292].setRotationPoint(-21.5F, -3F, -7F);
		bodyModel[292].rotateAngleY = -4.71238898F;

		bodyModel[293].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[293].setRotationPoint(-21.5F, -5F, -7F);
		bodyModel[293].rotateAngleY = -4.71238898F;

		bodyModel[294].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[294].setRotationPoint(-21.5F, -4.5F, -7F);
		bodyModel[294].rotateAngleY = -4.71238898F;

		bodyModel[295].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[295].setRotationPoint(-21.5F, -4F, -7F);
		bodyModel[295].rotateAngleY = -4.71238898F;

		bodyModel[296].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[296].setRotationPoint(-11.5F, -3F, 7F);
		bodyModel[296].rotateAngleY = -1.57079633F;

		bodyModel[297].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[297].setRotationPoint(-11.5F, -3F, -7F);
		bodyModel[297].rotateAngleY = -4.71238898F;

		bodyModel[298].addShapeBox(-1F, 0F, 2F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[298].setRotationPoint(-11.5F, -5F, 7F);
		bodyModel[298].rotateAngleY = -1.57079633F;

		bodyModel[299].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Right seat part
		bodyModel[299].setRotationPoint(-11.5F, -3F, 7F);
		bodyModel[299].rotateAngleY = -1.57079633F;

		bodyModel[300].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[300].setRotationPoint(-11.5F, -5F, 7F);
		bodyModel[300].rotateAngleY = -1.57079633F;

		bodyModel[301].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[301].setRotationPoint(-11.5F, -4.5F, 7F);
		bodyModel[301].rotateAngleY = -1.57079633F;

		bodyModel[302].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[302].setRotationPoint(-11.5F, -4F, 7F);
		bodyModel[302].rotateAngleY = -1.57079633F;

		bodyModel[303].addShapeBox(-1F, 0F, -3F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[303].setRotationPoint(-11.5F, -5F, 7F);
		bodyModel[303].rotateAngleY = -1.57079633F;

		bodyModel[304].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[304].setRotationPoint(-11.5F, -3F, 7F);
		bodyModel[304].rotateAngleY = -1.57079633F;

		bodyModel[305].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[305].setRotationPoint(-11.5F, -5F, 7F);
		bodyModel[305].rotateAngleY = -1.57079633F;

		bodyModel[306].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[306].setRotationPoint(-11.5F, -4.5F, 7F);
		bodyModel[306].rotateAngleY = -1.57079633F;

		bodyModel[307].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[307].setRotationPoint(-11.5F, -4F, 7F);
		bodyModel[307].rotateAngleY = -1.57079633F;

		bodyModel[308].addShapeBox(-1F, 0F, 2F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[308].setRotationPoint(-11.5F, -5F, -7F);
		bodyModel[308].rotateAngleY = -4.71238898F;

		bodyModel[309].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[309].setRotationPoint(-11.5F, -3F, -7F);
		bodyModel[309].rotateAngleY = -4.71238898F;

		bodyModel[310].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[310].setRotationPoint(-11.5F, -5F, -7F);
		bodyModel[310].rotateAngleY = -4.71238898F;

		bodyModel[311].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[311].setRotationPoint(-11.5F, -4.5F, -7F);
		bodyModel[311].rotateAngleY = -4.71238898F;

		bodyModel[312].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[312].setRotationPoint(-11.5F, -4F, -7F);
		bodyModel[312].rotateAngleY = -4.71238898F;

		bodyModel[313].addShapeBox(-1F, 0F, -3F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[313].setRotationPoint(-11.5F, -5F, -7F);
		bodyModel[313].rotateAngleY = -4.71238898F;

		bodyModel[314].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[314].setRotationPoint(-11.5F, -3F, -7F);
		bodyModel[314].rotateAngleY = -4.71238898F;

		bodyModel[315].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[315].setRotationPoint(-11.5F, -5F, -7F);
		bodyModel[315].rotateAngleY = -4.71238898F;

		bodyModel[316].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[316].setRotationPoint(-11.5F, -4.5F, -7F);
		bodyModel[316].rotateAngleY = -4.71238898F;

		bodyModel[317].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[317].setRotationPoint(-1.5F, -3F, 7F);
		bodyModel[317].rotateAngleY = -1.57079633F;

		bodyModel[318].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[318].setRotationPoint(-1.5F, -3F, -7F);
		bodyModel[318].rotateAngleY = -4.71238898F;

		bodyModel[319].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[319].setRotationPoint(8.5F, -3F, -7F);
		bodyModel[319].rotateAngleY = -4.71238898F;

		bodyModel[320].addShapeBox(-1F, 0F, 2F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[320].setRotationPoint(8.5F, -5F, 7F);
		bodyModel[320].rotateAngleY = -1.57079633F;

		bodyModel[321].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Right seat part
		bodyModel[321].setRotationPoint(8.5F, -3F, 7F);
		bodyModel[321].rotateAngleY = -1.57079633F;

		bodyModel[322].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[322].setRotationPoint(8.5F, -5F, 7F);
		bodyModel[322].rotateAngleY = -1.57079633F;

		bodyModel[323].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[323].setRotationPoint(8.5F, -4.5F, 7F);
		bodyModel[323].rotateAngleY = -1.57079633F;

		bodyModel[324].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[324].setRotationPoint(8.5F, -4F, 7F);
		bodyModel[324].rotateAngleY = -1.57079633F;

		bodyModel[325].addShapeBox(-1F, 0F, -3F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[325].setRotationPoint(8.5F, -5F, 7F);
		bodyModel[325].rotateAngleY = -1.57079633F;

		bodyModel[326].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[326].setRotationPoint(8.5F, -3F, 7F);
		bodyModel[326].rotateAngleY = -1.57079633F;

		bodyModel[327].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[327].setRotationPoint(8.5F, -5F, 7F);
		bodyModel[327].rotateAngleY = -1.57079633F;

		bodyModel[328].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[328].setRotationPoint(8.5F, -4.5F, 7F);
		bodyModel[328].rotateAngleY = -1.57079633F;

		bodyModel[329].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[329].setRotationPoint(8.5F, -4F, 7F);
		bodyModel[329].rotateAngleY = -1.57079633F;

		bodyModel[330].addShapeBox(-1F, 0F, 2F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[330].setRotationPoint(-1.5F, -5F, 7F);
		bodyModel[330].rotateAngleY = -1.57079633F;

		bodyModel[331].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Right seat part
		bodyModel[331].setRotationPoint(-1.5F, -3F, 7F);
		bodyModel[331].rotateAngleY = -1.57079633F;

		bodyModel[332].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[332].setRotationPoint(-1.5F, -5F, 7F);
		bodyModel[332].rotateAngleY = -1.57079633F;

		bodyModel[333].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[333].setRotationPoint(-1.5F, -4.5F, 7F);
		bodyModel[333].rotateAngleY = -1.57079633F;

		bodyModel[334].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[334].setRotationPoint(-1.5F, -4F, 7F);
		bodyModel[334].rotateAngleY = -1.57079633F;

		bodyModel[335].addShapeBox(-1F, 0F, -3F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[335].setRotationPoint(-1.5F, -5F, 7F);
		bodyModel[335].rotateAngleY = -1.57079633F;

		bodyModel[336].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[336].setRotationPoint(-1.5F, -3F, 7F);
		bodyModel[336].rotateAngleY = -1.57079633F;

		bodyModel[337].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[337].setRotationPoint(-1.5F, -5F, 7F);
		bodyModel[337].rotateAngleY = -1.57079633F;

		bodyModel[338].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[338].setRotationPoint(-1.5F, -4.5F, 7F);
		bodyModel[338].rotateAngleY = -1.57079633F;

		bodyModel[339].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[339].setRotationPoint(-1.5F, -4F, 7F);
		bodyModel[339].rotateAngleY = -1.57079633F;

		bodyModel[340].addShapeBox(-1F, 0F, 2F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[340].setRotationPoint(8.5F, -5F, -7F);
		bodyModel[340].rotateAngleY = -4.71238898F;

		bodyModel[341].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[341].setRotationPoint(8.5F, -3F, -7F);
		bodyModel[341].rotateAngleY = -4.71238898F;

		bodyModel[342].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[342].setRotationPoint(8.5F, -5F, -7F);
		bodyModel[342].rotateAngleY = -4.71238898F;

		bodyModel[343].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[343].setRotationPoint(8.5F, -4.5F, -7F);
		bodyModel[343].rotateAngleY = -4.71238898F;

		bodyModel[344].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[344].setRotationPoint(8.5F, -4F, -7F);
		bodyModel[344].rotateAngleY = -4.71238898F;

		bodyModel[345].addShapeBox(-1F, 0F, -3F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[345].setRotationPoint(8.5F, -5F, -7F);
		bodyModel[345].rotateAngleY = -4.71238898F;

		bodyModel[346].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[346].setRotationPoint(8.5F, -3F, -7F);
		bodyModel[346].rotateAngleY = -4.71238898F;

		bodyModel[347].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[347].setRotationPoint(8.5F, -5F, -7F);
		bodyModel[347].rotateAngleY = -4.71238898F;

		bodyModel[348].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[348].setRotationPoint(8.5F, -4.5F, -7F);
		bodyModel[348].rotateAngleY = -4.71238898F;

		bodyModel[349].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[349].setRotationPoint(8.5F, -4F, -7F);
		bodyModel[349].rotateAngleY = -4.71238898F;

		bodyModel[350].addShapeBox(-1F, 0F, 2F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[350].setRotationPoint(-1.5F, -5F, -7F);
		bodyModel[350].rotateAngleY = -4.71238898F;

		bodyModel[351].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[351].setRotationPoint(-1.5F, -3F, -7F);
		bodyModel[351].rotateAngleY = -4.71238898F;

		bodyModel[352].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[352].setRotationPoint(-1.5F, -5F, -7F);
		bodyModel[352].rotateAngleY = -4.71238898F;

		bodyModel[353].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[353].setRotationPoint(-1.5F, -4.5F, -7F);
		bodyModel[353].rotateAngleY = -4.71238898F;

		bodyModel[354].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[354].setRotationPoint(-1.5F, -4F, -7F);
		bodyModel[354].rotateAngleY = -4.71238898F;

		bodyModel[355].addShapeBox(-1F, 0F, -3F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[355].setRotationPoint(-1.5F, -5F, -7F);
		bodyModel[355].rotateAngleY = -4.71238898F;

		bodyModel[356].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[356].setRotationPoint(-1.5F, -3F, -7F);
		bodyModel[356].rotateAngleY = -4.71238898F;

		bodyModel[357].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[357].setRotationPoint(-1.5F, -5F, -7F);
		bodyModel[357].rotateAngleY = -4.71238898F;

		bodyModel[358].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[358].setRotationPoint(-1.5F, -4.5F, -7F);
		bodyModel[358].rotateAngleY = -4.71238898F;

		bodyModel[359].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[359].setRotationPoint(-1.5F, -4F, -7F);
		bodyModel[359].rotateAngleY = -4.71238898F;

		bodyModel[360].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[360].setRotationPoint(8.5F, -3F, 7F);
		bodyModel[360].rotateAngleY = -1.57079633F;

		bodyModel[361].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[361].setRotationPoint(18.5F, -3F, 7F);
		bodyModel[361].rotateAngleY = -1.57079633F;

		bodyModel[362].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[362].setRotationPoint(18.5F, -3F, -7F);
		bodyModel[362].rotateAngleY = -4.71238898F;

		bodyModel[363].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[363].setRotationPoint(28.5F, -3F, 7F);
		bodyModel[363].rotateAngleY = -1.57079633F;

		bodyModel[364].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[364].setRotationPoint(28.5F, -3F, -7F);
		bodyModel[364].rotateAngleY = -4.71238898F;

		bodyModel[365].addShapeBox(-1F, 0F, 2F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[365].setRotationPoint(28.5F, -5F, 7F);
		bodyModel[365].rotateAngleY = -1.57079633F;

		bodyModel[366].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Right seat part
		bodyModel[366].setRotationPoint(28.5F, -3F, 7F);
		bodyModel[366].rotateAngleY = -1.57079633F;

		bodyModel[367].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[367].setRotationPoint(28.5F, -5F, 7F);
		bodyModel[367].rotateAngleY = -1.57079633F;

		bodyModel[368].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[368].setRotationPoint(28.5F, -4.5F, 7F);
		bodyModel[368].rotateAngleY = -1.57079633F;

		bodyModel[369].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[369].setRotationPoint(28.5F, -4F, 7F);
		bodyModel[369].rotateAngleY = -1.57079633F;

		bodyModel[370].addShapeBox(-1F, 0F, -3F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[370].setRotationPoint(28.5F, -5F, 7F);
		bodyModel[370].rotateAngleY = -1.57079633F;

		bodyModel[371].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[371].setRotationPoint(28.5F, -3F, 7F);
		bodyModel[371].rotateAngleY = -1.57079633F;

		bodyModel[372].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[372].setRotationPoint(28.5F, -5F, 7F);
		bodyModel[372].rotateAngleY = -1.57079633F;

		bodyModel[373].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[373].setRotationPoint(28.5F, -4.5F, 7F);
		bodyModel[373].rotateAngleY = -1.57079633F;

		bodyModel[374].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[374].setRotationPoint(28.5F, -4F, 7F);
		bodyModel[374].rotateAngleY = -1.57079633F;

		bodyModel[375].addShapeBox(-1F, 0F, 2F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[375].setRotationPoint(18.5F, -5F, 7F);
		bodyModel[375].rotateAngleY = -1.57079633F;

		bodyModel[376].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Right seat part
		bodyModel[376].setRotationPoint(18.5F, -3F, 7F);
		bodyModel[376].rotateAngleY = -1.57079633F;

		bodyModel[377].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[377].setRotationPoint(18.5F, -5F, 7F);
		bodyModel[377].rotateAngleY = -1.57079633F;

		bodyModel[378].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[378].setRotationPoint(18.5F, -4.5F, 7F);
		bodyModel[378].rotateAngleY = -1.57079633F;

		bodyModel[379].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[379].setRotationPoint(18.5F, -4F, 7F);
		bodyModel[379].rotateAngleY = -1.57079633F;

		bodyModel[380].addShapeBox(-1F, 0F, -3F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[380].setRotationPoint(18.5F, -5F, 7F);
		bodyModel[380].rotateAngleY = -1.57079633F;

		bodyModel[381].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[381].setRotationPoint(18.5F, -3F, 7F);
		bodyModel[381].rotateAngleY = -1.57079633F;

		bodyModel[382].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[382].setRotationPoint(18.5F, -5F, 7F);
		bodyModel[382].rotateAngleY = -1.57079633F;

		bodyModel[383].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[383].setRotationPoint(18.5F, -4.5F, 7F);
		bodyModel[383].rotateAngleY = -1.57079633F;

		bodyModel[384].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[384].setRotationPoint(18.5F, -4F, 7F);
		bodyModel[384].rotateAngleY = -1.57079633F;

		bodyModel[385].addShapeBox(-1F, 0F, 2F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[385].setRotationPoint(28.5F, -5F, -7F);
		bodyModel[385].rotateAngleY = -4.71238898F;

		bodyModel[386].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[386].setRotationPoint(28.5F, -3F, -7F);
		bodyModel[386].rotateAngleY = -4.71238898F;

		bodyModel[387].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[387].setRotationPoint(28.5F, -5F, -7F);
		bodyModel[387].rotateAngleY = -4.71238898F;

		bodyModel[388].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[388].setRotationPoint(28.5F, -4.5F, -7F);
		bodyModel[388].rotateAngleY = -4.71238898F;

		bodyModel[389].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[389].setRotationPoint(28.5F, -4F, -7F);
		bodyModel[389].rotateAngleY = -4.71238898F;

		bodyModel[390].addShapeBox(-1F, 0F, -3F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[390].setRotationPoint(28.5F, -5F, -7F);
		bodyModel[390].rotateAngleY = -4.71238898F;

		bodyModel[391].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[391].setRotationPoint(28.5F, -3F, -7F);
		bodyModel[391].rotateAngleY = -4.71238898F;

		bodyModel[392].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[392].setRotationPoint(28.5F, -5F, -7F);
		bodyModel[392].rotateAngleY = -4.71238898F;

		bodyModel[393].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[393].setRotationPoint(28.5F, -4.5F, -7F);
		bodyModel[393].rotateAngleY = -4.71238898F;

		bodyModel[394].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[394].setRotationPoint(28.5F, -4F, -7F);
		bodyModel[394].rotateAngleY = -4.71238898F;

		bodyModel[395].addShapeBox(-1F, 0F, 2F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[395].setRotationPoint(18.5F, -5F, -7F);
		bodyModel[395].rotateAngleY = -4.71238898F;

		bodyModel[396].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[396].setRotationPoint(18.5F, -3F, -7F);
		bodyModel[396].rotateAngleY = -4.71238898F;

		bodyModel[397].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[397].setRotationPoint(18.5F, -5F, -7F);
		bodyModel[397].rotateAngleY = -4.71238898F;

		bodyModel[398].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[398].setRotationPoint(18.5F, -4.5F, -7F);
		bodyModel[398].rotateAngleY = -4.71238898F;

		bodyModel[399].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[399].setRotationPoint(18.5F, -4F, -7F);
		bodyModel[399].rotateAngleY = -4.71238898F;

		bodyModel[400].addShapeBox(-1F, 0F, -3F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[400].setRotationPoint(18.5F, -5F, -7F);
		bodyModel[400].rotateAngleY = -4.71238898F;

		bodyModel[401].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[401].setRotationPoint(18.5F, -3F, -7F);
		bodyModel[401].rotateAngleY = -4.71238898F;

		bodyModel[402].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[402].setRotationPoint(18.5F, -5F, -7F);
		bodyModel[402].rotateAngleY = -4.71238898F;

		bodyModel[403].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[403].setRotationPoint(18.5F, -4.5F, -7F);
		bodyModel[403].rotateAngleY = -4.71238898F;

		bodyModel[404].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[404].setRotationPoint(18.5F, -4F, -7F);
		bodyModel[404].rotateAngleY = -4.71238898F;

		bodyModel[405].addShapeBox(-1F, 0F, 2F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[405].setRotationPoint(38.5F, -5F, 7F);
		bodyModel[405].rotateAngleY = -1.57079633F;

		bodyModel[406].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[406].setRotationPoint(38.5F, -3F, 7F);
		bodyModel[406].rotateAngleY = -1.57079633F;

		bodyModel[407].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Right seat part
		bodyModel[407].setRotationPoint(38.5F, -3F, 7F);
		bodyModel[407].rotateAngleY = -1.57079633F;

		bodyModel[408].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[408].setRotationPoint(38.5F, -5F, 7F);
		bodyModel[408].rotateAngleY = -1.57079633F;

		bodyModel[409].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[409].setRotationPoint(38.5F, -4.5F, 7F);
		bodyModel[409].rotateAngleY = -1.57079633F;

		bodyModel[410].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[410].setRotationPoint(38.5F, -4F, 7F);
		bodyModel[410].rotateAngleY = -1.57079633F;

		bodyModel[411].addShapeBox(-1F, 0F, -3F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[411].setRotationPoint(38.5F, -5F, 7F);
		bodyModel[411].rotateAngleY = -1.57079633F;

		bodyModel[412].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[412].setRotationPoint(38.5F, -3F, 7F);
		bodyModel[412].rotateAngleY = -1.57079633F;

		bodyModel[413].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[413].setRotationPoint(38.5F, -5F, 7F);
		bodyModel[413].rotateAngleY = -1.57079633F;

		bodyModel[414].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[414].setRotationPoint(38.5F, -4.5F, 7F);
		bodyModel[414].rotateAngleY = -1.57079633F;

		bodyModel[415].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[415].setRotationPoint(38.5F, -4F, 7F);
		bodyModel[415].rotateAngleY = -1.57079633F;

		bodyModel[416].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[416].setRotationPoint(38.5F, -3F, -7F);
		bodyModel[416].rotateAngleY = -4.71238898F;

		bodyModel[417].addShapeBox(-1F, 0F, 2F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[417].setRotationPoint(38.5F, -5F, -7F);
		bodyModel[417].rotateAngleY = -4.71238898F;

		bodyModel[418].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[418].setRotationPoint(38.5F, -3F, -7F);
		bodyModel[418].rotateAngleY = -4.71238898F;

		bodyModel[419].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[419].setRotationPoint(38.5F, -5F, -7F);
		bodyModel[419].rotateAngleY = -4.71238898F;

		bodyModel[420].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[420].setRotationPoint(38.5F, -4.5F, -7F);
		bodyModel[420].rotateAngleY = -4.71238898F;

		bodyModel[421].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[421].setRotationPoint(38.5F, -4F, -7F);
		bodyModel[421].rotateAngleY = -4.71238898F;

		bodyModel[422].addShapeBox(-1F, 0F, -3F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[422].setRotationPoint(38.5F, -5F, -7F);
		bodyModel[422].rotateAngleY = -4.71238898F;

		bodyModel[423].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[423].setRotationPoint(38.5F, -3F, -7F);
		bodyModel[423].rotateAngleY = -4.71238898F;

		bodyModel[424].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[424].setRotationPoint(38.5F, -5F, -7F);
		bodyModel[424].rotateAngleY = -4.71238898F;

		bodyModel[425].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[425].setRotationPoint(38.5F, -4.5F, -7F);
		bodyModel[425].rotateAngleY = -4.71238898F;

		bodyModel[426].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[426].setRotationPoint(38.5F, -4F, -7F);
		bodyModel[426].rotateAngleY = -4.71238898F;

		bodyModel[427].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[427].setRotationPoint(-11.5F, -4F, -7F);
		bodyModel[427].rotateAngleY = -4.71238898F;

		bodyModel[428].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[428].setRotationPoint(-28F, -15F, 3F);

		bodyModel[429].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[429].setRotationPoint(-28F, -15F, -10F);

		bodyModel[430].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[430].setRotationPoint(8.5F, -1F, 7F);
		bodyModel[430].rotateAngleY = -0.78539816F;

		bodyModel[431].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[431].setRotationPoint(18.5F, -1F, 7F);
		bodyModel[431].rotateAngleY = -0.78539816F;

		bodyModel[432].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[432].setRotationPoint(28.5F, -1F, 7F);
		bodyModel[432].rotateAngleY = -0.78539816F;

		bodyModel[433].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[433].setRotationPoint(38.5F, -1F, 7F);
		bodyModel[433].rotateAngleY = -0.78539816F;

		bodyModel[434].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[434].setRotationPoint(18.5F, -1F, -7F);
		bodyModel[434].rotateAngleY = -3.92699082F;

		bodyModel[435].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[435].setRotationPoint(28.5F, -1F, -7F);
		bodyModel[435].rotateAngleY = -3.92699082F;

		bodyModel[436].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[436].setRotationPoint(38.5F, -1F, -7F);
		bodyModel[436].rotateAngleY = -3.92699082F;

		bodyModel[437].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[437].setRotationPoint(-11.5F, -1F, -7F);
		bodyModel[437].rotateAngleY = -3.92699082F;

		bodyModel[438].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[438].setRotationPoint(-21.5F, -1F, 7F);
		bodyModel[438].rotateAngleY = -0.78539816F;

		bodyModel[439].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[439].setRotationPoint(-11.5F, -1F, 7F);
		bodyModel[439].rotateAngleY = -0.78539816F;

		bodyModel[440].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[440].setRotationPoint(-1.5F, -1F, 7F);
		bodyModel[440].rotateAngleY = -0.78539816F;

		bodyModel[441].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[441].setRotationPoint(-21.5F, -1F, -7F);
		bodyModel[441].rotateAngleY = -3.92699082F;

		bodyModel[442].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[442].setRotationPoint(-1.5F, -1F, -7F);
		bodyModel[442].rotateAngleY = -3.92699082F;

		bodyModel[443].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[443].setRotationPoint(8.5F, -1F, -7F);
		bodyModel[443].rotateAngleY = -3.92699082F;

		bodyModel[444].addShapeBox(-1F, 0F, -3F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[444].setRotationPoint(38.5F, -4.5F, 7F);
		bodyModel[444].rotateAngleY = -1.57079633F;

		bodyModel[445].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[445].setRotationPoint(38.5F, -4.5F, 7F);
		bodyModel[445].rotateAngleY = -1.57079633F;

		bodyModel[446].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[446].setRotationPoint(38.5F, -4.5F, 7F);
		bodyModel[446].rotateAngleY = -1.57079633F;

		bodyModel[447].addShapeBox(-1F, 0F, 2F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[447].setRotationPoint(38.5F, -4.5F, 7F);
		bodyModel[447].rotateAngleY = -1.57079633F;

		bodyModel[448].addShapeBox(-1F, 0F, 2F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[448].setRotationPoint(38.5F, -4.5F, -7F);
		bodyModel[448].rotateAngleY = -4.71238898F;

		bodyModel[449].addShapeBox(-1F, 0F, -3F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[449].setRotationPoint(38.5F, -4.5F, -7F);
		bodyModel[449].rotateAngleY = -4.71238898F;

		bodyModel[450].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[450].setRotationPoint(38.5F, -4.5F, -7F);
		bodyModel[450].rotateAngleY = -4.71238898F;

		bodyModel[451].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[451].setRotationPoint(38.5F, -4.5F, -7F);
		bodyModel[451].rotateAngleY = -4.71238898F;

		bodyModel[452].addShapeBox(-1F, 0F, -3F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[452].setRotationPoint(28.5F, -4.5F, 7F);
		bodyModel[452].rotateAngleY = -1.57079633F;

		bodyModel[453].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[453].setRotationPoint(28.5F, -4.5F, 7F);
		bodyModel[453].rotateAngleY = -1.57079633F;

		bodyModel[454].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[454].setRotationPoint(28.5F, -4.5F, 7F);
		bodyModel[454].rotateAngleY = -1.57079633F;

		bodyModel[455].addShapeBox(-1F, 0F, 2F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[455].setRotationPoint(28.5F, -4.5F, 7F);
		bodyModel[455].rotateAngleY = -1.57079633F;

		bodyModel[456].addShapeBox(-1F, 0F, 2F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[456].setRotationPoint(28.5F, -4.5F, -7F);
		bodyModel[456].rotateAngleY = -4.71238898F;

		bodyModel[457].addShapeBox(-1F, 0F, -3F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[457].setRotationPoint(28.5F, -4.5F, -7F);
		bodyModel[457].rotateAngleY = -4.71238898F;

		bodyModel[458].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[458].setRotationPoint(28.5F, -4.5F, -7F);
		bodyModel[458].rotateAngleY = -4.71238898F;

		bodyModel[459].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[459].setRotationPoint(28.5F, -4.5F, -7F);
		bodyModel[459].rotateAngleY = -4.71238898F;

		bodyModel[460].addShapeBox(-1F, 0F, -3F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[460].setRotationPoint(18.5F, -4.5F, 7F);
		bodyModel[460].rotateAngleY = -1.57079633F;

		bodyModel[461].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[461].setRotationPoint(18.5F, -4.5F, 7F);
		bodyModel[461].rotateAngleY = -1.57079633F;

		bodyModel[462].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[462].setRotationPoint(18.5F, -4.5F, 7F);
		bodyModel[462].rotateAngleY = -1.57079633F;

		bodyModel[463].addShapeBox(-1F, 0F, 2F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[463].setRotationPoint(18.5F, -4.5F, 7F);
		bodyModel[463].rotateAngleY = -1.57079633F;

		bodyModel[464].addShapeBox(-1F, 0F, 2F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[464].setRotationPoint(18.5F, -4.5F, -7F);
		bodyModel[464].rotateAngleY = -4.71238898F;

		bodyModel[465].addShapeBox(-1F, 0F, -3F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[465].setRotationPoint(18.5F, -4.5F, -7F);
		bodyModel[465].rotateAngleY = -4.71238898F;

		bodyModel[466].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[466].setRotationPoint(18.5F, -4.5F, -7F);
		bodyModel[466].rotateAngleY = -4.71238898F;

		bodyModel[467].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[467].setRotationPoint(18.5F, -4.5F, -7F);
		bodyModel[467].rotateAngleY = -4.71238898F;

		bodyModel[468].addShapeBox(-1F, 0F, -3F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[468].setRotationPoint(8.5F, -4.5F, 7F);
		bodyModel[468].rotateAngleY = -1.57079633F;

		bodyModel[469].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[469].setRotationPoint(8.5F, -4.5F, 7F);
		bodyModel[469].rotateAngleY = -1.57079633F;

		bodyModel[470].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[470].setRotationPoint(8.5F, -4.5F, 7F);
		bodyModel[470].rotateAngleY = -1.57079633F;

		bodyModel[471].addShapeBox(-1F, 0F, 2F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[471].setRotationPoint(8.5F, -4.5F, 7F);
		bodyModel[471].rotateAngleY = -1.57079633F;

		bodyModel[472].addShapeBox(-1F, 0F, 2F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[472].setRotationPoint(8.5F, -4.5F, -7F);
		bodyModel[472].rotateAngleY = -4.71238898F;

		bodyModel[473].addShapeBox(-1F, 0F, -3F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[473].setRotationPoint(8.5F, -4.5F, -7F);
		bodyModel[473].rotateAngleY = -4.71238898F;

		bodyModel[474].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[474].setRotationPoint(8.5F, -4.5F, -7F);
		bodyModel[474].rotateAngleY = -4.71238898F;

		bodyModel[475].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[475].setRotationPoint(8.5F, -4.5F, -7F);
		bodyModel[475].rotateAngleY = -4.71238898F;

		bodyModel[476].addShapeBox(-1F, 0F, -3F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[476].setRotationPoint(-1.5F, -4.5F, 7F);
		bodyModel[476].rotateAngleY = -1.57079633F;

		bodyModel[477].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[477].setRotationPoint(-1.5F, -4.5F, 7F);
		bodyModel[477].rotateAngleY = -1.57079633F;

		bodyModel[478].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[478].setRotationPoint(-1.5F, -4.5F, 7F);
		bodyModel[478].rotateAngleY = -1.57079633F;

		bodyModel[479].addShapeBox(-1F, 0F, 2F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[479].setRotationPoint(-1.5F, -4.5F, 7F);
		bodyModel[479].rotateAngleY = -1.57079633F;

		bodyModel[480].addShapeBox(-1F, 0F, 2F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[480].setRotationPoint(-1.5F, -4.5F, -7F);
		bodyModel[480].rotateAngleY = -4.71238898F;

		bodyModel[481].addShapeBox(-1F, 0F, -3F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[481].setRotationPoint(-1.5F, -4.5F, -7F);
		bodyModel[481].rotateAngleY = -4.71238898F;

		bodyModel[482].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[482].setRotationPoint(-1.5F, -4.5F, -7F);
		bodyModel[482].rotateAngleY = -4.71238898F;

		bodyModel[483].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[483].setRotationPoint(-1.5F, -4.5F, -7F);
		bodyModel[483].rotateAngleY = -4.71238898F;

		bodyModel[484].addShapeBox(-1F, 0F, -3F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[484].setRotationPoint(-11.5F, -4.5F, 7F);
		bodyModel[484].rotateAngleY = -1.57079633F;

		bodyModel[485].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[485].setRotationPoint(-11.5F, -4.5F, 7F);
		bodyModel[485].rotateAngleY = -1.57079633F;

		bodyModel[486].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[486].setRotationPoint(-11.5F, -4.5F, 7F);
		bodyModel[486].rotateAngleY = -1.57079633F;

		bodyModel[487].addShapeBox(-1F, 0F, 2F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[487].setRotationPoint(-11.5F, -4.5F, 7F);
		bodyModel[487].rotateAngleY = -1.57079633F;

		bodyModel[488].addShapeBox(-1F, 0F, 2F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[488].setRotationPoint(-11.5F, -4.5F, -7F);
		bodyModel[488].rotateAngleY = -4.71238898F;

		bodyModel[489].addShapeBox(-1F, 0F, -3F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[489].setRotationPoint(-11.5F, -4.5F, -7F);
		bodyModel[489].rotateAngleY = -4.71238898F;

		bodyModel[490].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[490].setRotationPoint(-11.5F, -4.5F, -7F);
		bodyModel[490].rotateAngleY = -4.71238898F;

		bodyModel[491].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[491].setRotationPoint(-11.5F, -4.5F, -7F);
		bodyModel[491].rotateAngleY = -4.71238898F;

		bodyModel[492].addShapeBox(-1F, 0F, -3F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[492].setRotationPoint(-21.5F, -4.5F, 7F);
		bodyModel[492].rotateAngleY = -1.57079633F;

		bodyModel[493].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[493].setRotationPoint(-21.5F, -4.5F, 7F);
		bodyModel[493].rotateAngleY = -1.57079633F;

		bodyModel[494].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[494].setRotationPoint(-21.5F, -4.5F, 7F);
		bodyModel[494].rotateAngleY = -1.57079633F;

		bodyModel[495].addShapeBox(-1F, 0F, 2F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[495].setRotationPoint(-21.5F, -4.5F, 7F);
		bodyModel[495].rotateAngleY = -1.57079633F;

		bodyModel[496].addShapeBox(-1F, 0F, 2F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[496].setRotationPoint(-21.5F, -4.5F, -7F);
		bodyModel[496].rotateAngleY = -4.71238898F;

		bodyModel[497].addShapeBox(-1F, 0F, -3F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[497].setRotationPoint(-21.5F, -4.5F, -7F);
		bodyModel[497].rotateAngleY = -4.71238898F;

		bodyModel[498].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[498].setRotationPoint(-21.5F, -4.5F, -7F);
		bodyModel[498].rotateAngleY = -4.71238898F;

		bodyModel[499].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[499].setRotationPoint(-21.5F, -4.5F, -7F);
		bodyModel[499].rotateAngleY = -4.71238898F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 341, 74, textureX, textureY); // Box 38
		bodyModel[501] = new ModelRendererTurbo(this, 341, 97, textureX, textureY); // Box 327
		bodyModel[502] = new ModelRendererTurbo(this, 283, 138, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[503] = new ModelRendererTurbo(this, 283, 144, textureX, textureY); // Box 31
		bodyModel[504] = new ModelRendererTurbo(this, 283, 148, textureX, textureY,"cull"); // Box 475 cull
		bodyModel[505] = new ModelRendererTurbo(this, 283, 154, textureX, textureY); // Box 476
		bodyModel[506] = new ModelRendererTurbo(this, 342, 80, textureX, textureY); // Box 2
		bodyModel[507] = new ModelRendererTurbo(this, 353, 75, textureX, textureY,"lamp"); // tail sign glow
		bodyModel[508] = new ModelRendererTurbo(this, 378, 114, textureX, textureY); // Box 128
		bodyModel[509] = new ModelRendererTurbo(this, 371, 114, textureX, textureY); // Box 128
		bodyModel[510] = new ModelRendererTurbo(this, 347, 94, textureX, textureY); // Box 169
		bodyModel[511] = new ModelRendererTurbo(this, 352, 94, textureX, textureY,"lamp"); // Box 169 marker lense RR
		bodyModel[512] = new ModelRendererTurbo(this, 342, 94, textureX, textureY,"lamp"); // Box 169 marker lense RF
		bodyModel[513] = new ModelRendererTurbo(this, 347, 71, textureX, textureY); // Box 548
		bodyModel[514] = new ModelRendererTurbo(this, 352, 71, textureX, textureY,"lamp"); // Box 549 marker lense LR
		bodyModel[515] = new ModelRendererTurbo(this, 342, 71, textureX, textureY,"lamp"); // Box 547 marker lense LF
		bodyModel[516] = new ModelRendererTurbo(this, 305, 219, textureX, textureY); // Box 38
		bodyModel[517] = new ModelRendererTurbo(this, 322, 213, textureX, textureY); // Box 128
		bodyModel[518] = new ModelRendererTurbo(this, 322, 191, textureX, textureY); // Box 176
		bodyModel[519] = new ModelRendererTurbo(this, 311, 197, textureX, textureY); // Box 128
		bodyModel[520] = new ModelRendererTurbo(this, 1, 219, textureX, textureY); // Box 38
		bodyModel[521] = new ModelRendererTurbo(this, 15, 191, textureX, textureY); // Box 128
		bodyModel[522] = new ModelRendererTurbo(this, 15, 213, textureX, textureY); // Box 176
		bodyModel[523] = new ModelRendererTurbo(this, 4, 197, textureX, textureY); // Box 128
		bodyModel[524] = new ModelRendererTurbo(this, 103, 247, textureX, textureY); // Box 38
		bodyModel[525] = new ModelRendererTurbo(this, 106, 242, textureX, textureY); // Box 38
		bodyModel[526] = new ModelRendererTurbo(this, 103, 252, textureX, textureY); // Box 275
		bodyModel[527] = new ModelRendererTurbo(this, 105, 259, textureX, textureY); // Box 276
		bodyModel[528] = new ModelRendererTurbo(this, 105, 257, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[529] = new ModelRendererTurbo(this, 105, 245, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[530] = new ModelRendererTurbo(this, 93, 262, textureX, textureY); // Box 38
		bodyModel[531] = new ModelRendererTurbo(this, 45, 252, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[532] = new ModelRendererTurbo(this, 52, 252, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[533] = new ModelRendererTurbo(this, 59, 252, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[534] = new ModelRendererTurbo(this, 66, 252, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[535] = new ModelRendererTurbo(this, 73, 252, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[536] = new ModelRendererTurbo(this, 80, 252, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[537] = new ModelRendererTurbo(this, 87, 252, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[538] = new ModelRendererTurbo(this, 262, 256, textureX, textureY); // Box 38
		bodyModel[539] = new ModelRendererTurbo(this, 252, 250, textureX, textureY); // Box 462
		bodyModel[540] = new ModelRendererTurbo(this, 443, 256, textureX, textureY); // Box 38
		bodyModel[541] = new ModelRendererTurbo(this, 460, 256, textureX, textureY); // Box 38
		bodyModel[542] = new ModelRendererTurbo(this, 467, 252, textureX, textureY); // Box 2
		bodyModel[543] = new ModelRendererTurbo(this, 476, 253, textureX, textureY); // Rear end door part
		bodyModel[544] = new ModelRendererTurbo(this, 443, 250, textureX, textureY); // Box 564
		bodyModel[545] = new ModelRendererTurbo(this, 460, 250, textureX, textureY); // Box 565
		bodyModel[546] = new ModelRendererTurbo(this, 467, 246, textureX, textureY); // Box 566
		bodyModel[547] = new ModelRendererTurbo(this, 476, 247, textureX, textureY); // Rear end door part
		bodyModel[548] = new ModelRendererTurbo(this, 489, 357, textureX, textureY); // Box 38
		bodyModel[549] = new ModelRendererTurbo(this, 477, 358, textureX, textureY); // Box 38
		bodyModel[550] = new ModelRendererTurbo(this, 482, 357, textureX, textureY); // Box 38
		bodyModel[551] = new ModelRendererTurbo(this, 489, 334, textureX, textureY); // Box 556
		bodyModel[552] = new ModelRendererTurbo(this, 477, 335, textureX, textureY); // Box 557
		bodyModel[553] = new ModelRendererTurbo(this, 482, 334, textureX, textureY); // Box 558
		bodyModel[554] = new ModelRendererTurbo(this, 378, 354, textureX, textureY); // Box 492
		bodyModel[555] = new ModelRendererTurbo(this, 383, 348, textureX, textureY); // Box 493
		bodyModel[556] = new ModelRendererTurbo(this, 359, 347, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[557] = new ModelRendererTurbo(this, 399, 347, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[558] = new ModelRendererTurbo(this, 379, 361, textureX, textureY,"cull"); // Box 493 cull
		bodyModel[559] = new ModelRendererTurbo(this, 437, 354, textureX, textureY); // Box 492
		bodyModel[560] = new ModelRendererTurbo(this, 442, 348, textureX, textureY); // Box 493
		bodyModel[561] = new ModelRendererTurbo(this, 418, 347, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[562] = new ModelRendererTurbo(this, 458, 347, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[563] = new ModelRendererTurbo(this, 438, 361, textureX, textureY,"cull"); // Box 493 cull
		bodyModel[564] = new ModelRendererTurbo(this, 378, 331, textureX, textureY); // Box 563
		bodyModel[565] = new ModelRendererTurbo(this, 383, 325, textureX, textureY); // Box 564
		bodyModel[566] = new ModelRendererTurbo(this, 359, 324, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[567] = new ModelRendererTurbo(this, 399, 324, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[568] = new ModelRendererTurbo(this, 379, 338, textureX, textureY,"cull"); // Box 567 cull
		bodyModel[569] = new ModelRendererTurbo(this, 437, 331, textureX, textureY); // Box 563
		bodyModel[570] = new ModelRendererTurbo(this, 442, 325, textureX, textureY); // Box 564
		bodyModel[571] = new ModelRendererTurbo(this, 418, 324, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[572] = new ModelRendererTurbo(this, 458, 324, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[573] = new ModelRendererTurbo(this, 438, 338, textureX, textureY,"cull"); // Box 567 cull
		bodyModel[574] = new ModelRendererTurbo(this, 411, 324, textureX, textureY); // Right seat part
		bodyModel[575] = new ModelRendererTurbo(this, 420, 324, textureX, textureY); // Right seat part
		bodyModel[576] = new ModelRendererTurbo(this, 411, 328, textureX, textureY); // Right seat part
		bodyModel[577] = new ModelRendererTurbo(this, 411, 347, textureX, textureY); // Right seat part
		bodyModel[578] = new ModelRendererTurbo(this, 420, 347, textureX, textureY); // Right seat part
		bodyModel[579] = new ModelRendererTurbo(this, 411, 351, textureX, textureY); // Right seat part
		bodyModel[580] = new ModelRendererTurbo(this, 490, 353, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[581] = new ModelRendererTurbo(this, 480, 343, textureX, textureY); // Box 275
		bodyModel[582] = new ModelRendererTurbo(this, 488, 349, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[583] = new ModelRendererTurbo(this, 490, 330, textureX, textureY); // Box 611
		bodyModel[584] = new ModelRendererTurbo(this, 480, 320, textureX, textureY); // Box 612
		bodyModel[585] = new ModelRendererTurbo(this, 488, 326, textureX, textureY,"lamp"); // Box 613 glow
		bodyModel[586] = new ModelRendererTurbo(this, 78, 245, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[587] = new ModelRendererTurbo(this, 82, 245, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[588] = new ModelRendererTurbo(this, 88, 247, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[589] = new ModelRendererTurbo(this, 181, 289, textureX, textureY); // Box 38
		bodyModel[590] = new ModelRendererTurbo(this, 199, 292, textureX, textureY); // Box 492
		bodyModel[591] = new ModelRendererTurbo(this, 206, 294, textureX, textureY); // Box 492
		bodyModel[592] = new ModelRendererTurbo(this, 214, 303, textureX, textureY); // Box 38
		bodyModel[593] = new ModelRendererTurbo(this, 221, 303, textureX, textureY); // Box 38
		bodyModel[594] = new ModelRendererTurbo(this, 215, 272, textureX, textureY); // Box 38
		bodyModel[595] = new ModelRendererTurbo(this, 81, 289, textureX, textureY); // Box 38
		bodyModel[596] = new ModelRendererTurbo(this, 99, 275, textureX, textureY); // Box 38
		bodyModel[597] = new ModelRendererTurbo(this, 91, 275, textureX, textureY); // Box 38
		bodyModel[598] = new ModelRendererTurbo(this, 137, 275, textureX, textureY); // Box 38
		bodyModel[599] = new ModelRendererTurbo(this, 151, 301, textureX, textureY); // Box 492
		bodyModel[600] = new ModelRendererTurbo(this, 140, 300, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[601] = new ModelRendererTurbo(this, 162, 300, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[602] = new ModelRendererTurbo(this, 153, 319, textureX, textureY,"cull"); // Box 493 cull
		bodyModel[603] = new ModelRendererTurbo(this, 156, 295, textureX, textureY); // Box 493
		bodyModel[604] = new ModelRendererTurbo(this, 117, 305, textureX, textureY); // Box 492
		bodyModel[605] = new ModelRendererTurbo(this, 117, 287, textureX, textureY); // Box 493
		bodyModel[606] = new ModelRendererTurbo(this, 120, 325, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[607] = new ModelRendererTurbo(this, 120, 275, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[608] = new ModelRendererTurbo(this, 87, 294, textureX, textureY,"cull"); // Box 493 cull
		bodyModel[609] = new ModelRendererTurbo(this, 117, 309, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[610] = new ModelRendererTurbo(this, 84, 302, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[611] = new ModelRendererTurbo(this, 84, 276, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[612] = new ModelRendererTurbo(this, 84, 300, textureX, textureY); // Box 38
		bodyModel[613] = new ModelRendererTurbo(this, 84, 278, textureX, textureY); // Box 38
		bodyModel[614] = new ModelRendererTurbo(this, 39, 297, textureX, textureY); // Box 38
		bodyModel[615] = new ModelRendererTurbo(this, 56, 303, textureX, textureY); // Box 38
		bodyModel[616] = new ModelRendererTurbo(this, 56, 312, textureX, textureY); // Box 38
		bodyModel[617] = new ModelRendererTurbo(this, 59, 271, textureX, textureY); // Box 38
		bodyModel[618] = new ModelRendererTurbo(this, 44, 270, textureX, textureY); // Box 38
		bodyModel[619] = new ModelRendererTurbo(this, 1, 275, textureX, textureY); // Box 38
		bodyModel[620] = new ModelRendererTurbo(this, 1, 303, textureX, textureY); // Box 38
		bodyModel[621] = new ModelRendererTurbo(this, 31, 280, textureX, textureY); // Box 38
		bodyModel[622] = new ModelRendererTurbo(this, 29, 283, textureX, textureY); // Box 38
		bodyModel[623] = new ModelRendererTurbo(this, 34, 283, textureX, textureY); // Box 38
		bodyModel[624] = new ModelRendererTurbo(this, 31, 286, textureX, textureY); // Box 38
		bodyModel[625] = new ModelRendererTurbo(this, 29, 275, textureX, textureY); // Box 38
		bodyModel[626] = new ModelRendererTurbo(this, 16, 280, textureX, textureY); // Box 38
		bodyModel[627] = new ModelRendererTurbo(this, 19, 285, textureX, textureY); // Box 38
		bodyModel[628] = new ModelRendererTurbo(this, 18, 289, textureX, textureY); // Box 38
		bodyModel[629] = new ModelRendererTurbo(this, 29, 268, textureX, textureY); // Box 38
		bodyModel[630] = new ModelRendererTurbo(this, 29, 303, textureX, textureY); // Box 663
		bodyModel[631] = new ModelRendererTurbo(this, 29, 296, textureX, textureY); // Box 664
		bodyModel[632] = new ModelRendererTurbo(this, 31, 308, textureX, textureY); // Box 38
		bodyModel[633] = new ModelRendererTurbo(this, 29, 311, textureX, textureY); // Box 38
		bodyModel[634] = new ModelRendererTurbo(this, 34, 311, textureX, textureY); // Box 38
		bodyModel[635] = new ModelRendererTurbo(this, 31, 314, textureX, textureY); // Box 38
		bodyModel[636] = new ModelRendererTurbo(this, 16, 308, textureX, textureY); // Box 38
		bodyModel[637] = new ModelRendererTurbo(this, 19, 313, textureX, textureY); // Box 38
		bodyModel[638] = new ModelRendererTurbo(this, 18, 317, textureX, textureY); // Box 38
		bodyModel[639] = new ModelRendererTurbo(this, 145, 284, textureX, textureY); // Right seat part
		bodyModel[640] = new ModelRendererTurbo(this, 147, 288, textureX, textureY); // Right seat part
		bodyModel[641] = new ModelRendererTurbo(this, 145, 296, textureX, textureY); // Right seat part
		bodyModel[642] = new ModelRendererTurbo(this, 25, 248, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[643] = new ModelRendererTurbo(this, 38, 255, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[644] = new ModelRendererTurbo(this, 38, 253, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[645] = new ModelRendererTurbo(this, 41, 253, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[646] = new ModelRendererTurbo(this, 32, 253, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[647] = new ModelRendererTurbo(this, 39, 275, textureX, textureY); // Box 38
		bodyModel[648] = new ModelRendererTurbo(this, 139, 15, textureX, textureY); // Box 847
		bodyModel[649] = new ModelRendererTurbo(this, 138, 11, textureX, textureY); // Box 848
		bodyModel[650] = new ModelRendererTurbo(this, 129, 11, textureX, textureY); // Box 204
		bodyModel[651] = new ModelRendererTurbo(this, 129, 16, textureX, textureY); // Box 205
		bodyModel[652] = new ModelRendererTurbo(this, 149, 11, textureX, textureY); // Box 204
		bodyModel[653] = new ModelRendererTurbo(this, 149, 16, textureX, textureY); // Box 205
		bodyModel[654] = new ModelRendererTurbo(this, 129, 6, textureX, textureY); // Box 275
		bodyModel[655] = new ModelRendererTurbo(this, 128, 2, textureX, textureY); // Box 276
		bodyModel[656] = new ModelRendererTurbo(this, 139, 1, textureX, textureY); // Box 128
		bodyModel[657] = new ModelRendererTurbo(this, 139, 6, textureX, textureY); // Box 128
		bodyModel[658] = new ModelRendererTurbo(this, 75, 170, textureX, textureY); // Box 41
		bodyModel[659] = new ModelRendererTurbo(this, 75, 168, textureX, textureY); // Box 41
		bodyModel[660] = new ModelRendererTurbo(this, 95, 168, textureX, textureY); // Box 41
		bodyModel[661] = new ModelRendererTurbo(this, 103, 166, textureX, textureY); // Box 2
		bodyModel[662] = new ModelRendererTurbo(this, 103, 174, textureX, textureY); // Box 2
		bodyModel[663] = new ModelRendererTurbo(this, 90, 172, textureX, textureY); // Box 2
		bodyModel[664] = new ModelRendererTurbo(this, 86, 158, textureX, textureY); // Box 59
		bodyModel[665] = new ModelRendererTurbo(this, 221, 175, textureX, textureY); // Box 52
		bodyModel[666] = new ModelRendererTurbo(this, 119, 155, textureX, textureY); // Box 2
		bodyModel[667] = new ModelRendererTurbo(this, 100, 157, textureX, textureY); // Box 41
		bodyModel[668] = new ModelRendererTurbo(this, 99, 155, textureX, textureY); // Box 41
		bodyModel[669] = new ModelRendererTurbo(this, 117, 155, textureX, textureY); // Box 41
		bodyModel[670] = new ModelRendererTurbo(this, 140, 157, textureX, textureY); // Box 41
		bodyModel[671] = new ModelRendererTurbo(this, 139, 155, textureX, textureY); // Box 41
		bodyModel[672] = new ModelRendererTurbo(this, 153, 155, textureX, textureY); // Box 41
		bodyModel[673] = new ModelRendererTurbo(this, 80, 157, textureX, textureY); // Box 52
		bodyModel[674] = new ModelRendererTurbo(this, 87, 157, textureX, textureY); // Box 52
		bodyModel[675] = new ModelRendererTurbo(this, 199, 181, textureX, textureY); // Box 41
		bodyModel[676] = new ModelRendererTurbo(this, 198, 179, textureX, textureY); // Box 41
		bodyModel[677] = new ModelRendererTurbo(this, 218, 179, textureX, textureY); // Box 41
		bodyModel[678] = new ModelRendererTurbo(this, 191, 179, textureX, textureY); // Box 52
		bodyModel[679] = new ModelRendererTurbo(this, 148, 175, textureX, textureY); // Box 2
		bodyModel[680] = new ModelRendererTurbo(this, 148, 164, textureX, textureY); // Box 2
		bodyModel[681] = new ModelRendererTurbo(this, 179, 164, textureX, textureY); // Box 2
		bodyModel[682] = new ModelRendererTurbo(this, 14, 115, textureX, textureY); // Box 128
		bodyModel[683] = new ModelRendererTurbo(this, 2, 115, textureX, textureY); // Box 261
		bodyModel[684] = new ModelRendererTurbo(this, 54, 103, textureX, textureY); // Right step part
		bodyModel[685] = new ModelRendererTurbo(this, 87, 255, textureX, textureY); // Box 275
		bodyModel[686] = new ModelRendererTurbo(this, 82, 255, textureX, textureY); // Box 275
		bodyModel[687] = new ModelRendererTurbo(this, 488, 322, textureX, textureY); // Box 612
		bodyModel[688] = new ModelRendererTurbo(this, 488, 345, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[689] = new ModelRendererTurbo(this, 24, 277, textureX, textureY); // Box 38
		bodyModel[690] = new ModelRendererTurbo(this, 24, 305, textureX, textureY); // Box 416
		bodyModel[691] = new ModelRendererTurbo(this, 154, 273, textureX, textureY); // Box 38
		bodyModel[692] = new ModelRendererTurbo(this, 289, 142, textureX, textureY); // Box 38
		bodyModel[693] = new ModelRendererTurbo(this, 289, 152, textureX, textureY); // Box 329
		bodyModel[694] = new ModelRendererTurbo(this, 296, 142, textureX, textureY); // Box 38
		bodyModel[695] = new ModelRendererTurbo(this, 296, 152, textureX, textureY); // Box 329

		bodyModel[500].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[500].setRotationPoint(48.25F, -2F, -11.97F);
		bodyModel[500].rotateAngleY = 0.2443461F;

		bodyModel[501].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[501].setRotationPoint(48F, -2F, 11F);
		bodyModel[501].rotateAngleY = -0.2443461F;

		bodyModel[502].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, -0.5F, 0F, 0.06F, -0.5F, 0F, 0.06F, -0.5F, -0.51F, 0F, -0.5F, -0.51F); // Box 31 cull
		bodyModel[502].setRotationPoint(49.12F, 3F, -11.22F);
		bodyModel[502].rotateAngleY = 0.2443461F;

		bodyModel[503].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, -0.51F, 0F, 0F, -0.51F); // Box 31
		bodyModel[503].setRotationPoint(49.12F, 4.75F, -11.22F);
		bodyModel[503].rotateAngleY = 0.2443461F;

		bodyModel[504].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -0.01F, 0.06F, 0F, -0.01F, 0.06F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.01F, 0.06F, -0.5F, -0.01F, 0.06F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 475 cull
		bodyModel[504].setRotationPoint(49F, 3F, 10.74F);
		bodyModel[504].rotateAngleY = -0.2443461F;

		bodyModel[505].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.01F, 0.06F, 0F, -0.01F, 0.06F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0.06F, 0F, -0.01F, 0.06F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 476
		bodyModel[505].setRotationPoint(49F, 4.75F, 10.74F);
		bodyModel[505].rotateAngleY = -0.2443461F;

		bodyModel[506].addShapeBox(0.62F, 0F, -3.5F, 1, 5, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[506].setRotationPoint(60.5F, -4.5F, 1.5F);

		bodyModel[507].addShapeBox(1.38F, 0F, -3.5F, 0, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, -3F, -5F); // tail sign glow
		bodyModel[507].setRotationPoint(60.5F, -4.5F, 1.5F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[508].setRotationPoint(62.5F, 1F, -3F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[509].setRotationPoint(61F, 1F, -2F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 169
		bodyModel[510].setRotationPoint(48.24F, -14F, 10.94F);
		bodyModel[510].rotateAngleY = -0.2443461F;

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, 0F, 0F, -1F); // Box 169 marker lense RR
		bodyModel[511].setRotationPoint(49.21F, -14F, 10.7F);
		bodyModel[511].rotateAngleY = -0.2443461F;

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, -0.5F, -1F); // Box 169 marker lense RF
		bodyModel[512].setRotationPoint(48F, -14F, 11F);
		bodyModel[512].rotateAngleY = -0.2443461F;

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 548
		bodyModel[513].setRotationPoint(48.48F, -14F, -11.91F);
		bodyModel[513].rotateAngleY = 0.2443461F;

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 549 marker lense LR
		bodyModel[514].setRotationPoint(49.45F, -14F, -11.67F);
		bodyModel[514].rotateAngleY = 0.2443461F;

		bodyModel[515].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 547 marker lense LF
		bodyModel[515].setRotationPoint(48.24F, -14F, -11.97F);
		bodyModel[515].rotateAngleY = 0.2443461F;

		bodyModel[516].addShapeBox(0F, 0F, 0F, 4, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[516].setRotationPoint(44F, -16.25F, -10F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[517].setRotationPoint(44F, -18F, -10F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[518].setRotationPoint(44F, -18F, 7F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[519].setRotationPoint(44F, -17F, -7F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 28, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[520].setRotationPoint(-55F, -16.25F, -10F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 28, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[521].setRotationPoint(-55F, -18F, -10F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 28, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[522].setRotationPoint(-55F, -18F, 7F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 28, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[523].setRotationPoint(-55F, -17F, -7F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 71, 1, 3, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[524].setRotationPoint(-27F, -14F, 7F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 71, 1, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[525].setRotationPoint(-27F, -13F, 9F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 71, 1, 3, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[526].setRotationPoint(-27F, -14F, -10F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 71, 1, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[527].setRotationPoint(-27F, -13F, -10F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 71, 0, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 275 glow
		bodyModel[528].setRotationPoint(-27F, -12.99F, -8.5F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 71, 0, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 285 glow
		bodyModel[529].setRotationPoint(-27F, -12.99F, 7.5F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 71, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[530].setRotationPoint(-27F, -17F, -2F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[531].setRotationPoint(-22.5F, -16.5F, -0.5F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[532].setRotationPoint(-12.5F, -16.5F, -0.5F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[533].setRotationPoint(-2.5F, -16.5F, -0.5F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[534].setRotationPoint(7.5F, -16.5F, -0.5F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[535].setRotationPoint(17.5F, -16.5F, -0.5F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[536].setRotationPoint(27.5F, -16.5F, -0.5F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[537].setRotationPoint(37.5F, -16.5F, -0.5F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 90, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[538].setRotationPoint(-42F, -11F, -9.9F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 95, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[539].setRotationPoint(-47F, -11F, 9.9F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 8, 5, 0, 0F,0F, 0F, 0F, -0.6F, 0F, -1.82F, -0.6F, 0F, 1.82F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -1.82F, -0.6F, 0F, 1.82F, 0F, 0F, 0F); // Box 38
		bodyModel[540].setRotationPoint(48F, -11F, -9.9F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 3, 5, 0, 0F,0F, 0F, 0F, -0.27F, 0F, -2.75F, -0.27F, 0F, 2.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.27F, 0F, -2.75F, -0.27F, 0F, 2.75F, 0F, 0F, 0F); // Box 38
		bodyModel[541].setRotationPoint(55.4F, -11F, -8.08F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 0, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.77F, 0F, -0.67F, -1.77F, 0F, -0.67F, 0F, 0F, 0F, 0F, 0F, 0F, 1.77F, 0F, -0.67F, -1.77F, 0F, -0.67F); // Box 2
		bodyModel[542].setRotationPoint(58.13F, -11F, -5.33F);

		bodyModel[543].addShapeBox(-0.1F, 0F, -5F, 0, 5, 3, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear end door part
		bodyModel[543].setRotationPoint(60.5F, -11F, 2F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 8, 5, 0, 0F,0F, 0F, 0F, -0.6F, 0F, 1.82F, -0.6F, 0F, -1.82F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 1.82F, -0.6F, 0F, -1.82F, 0F, 0F, 0F); // Box 564
		bodyModel[544].setRotationPoint(48F, -11F, 9.9F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 3, 5, 0, 0F,0F, 0F, 0F, -0.27F, 0F, 2.75F, -0.27F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.27F, 0F, 2.75F, -0.27F, 0F, -2.75F, 0F, 0F, 0F); // Box 565
		bodyModel[545].setRotationPoint(55.4F, -11F, 8.08F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 0, 5, 4, 0F,-1.77F, 0F, -0.67F, 1.77F, 0F, -0.67F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0F, -0.67F, 1.77F, 0F, -0.67F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[546].setRotationPoint(58.13F, -11F, 1.33F);

		bodyModel[547].addShapeBox(-0.1F, 0F, -3F, 0, 5, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Rear end door part
		bodyModel[547].setRotationPoint(60.5F, -11F, 2F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0.21F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, -1F, 0F, 0F, 0.21F, 0F, 0.45F, 0F, 0F, 0.45F); // Box 38
		bodyModel[548].setRotationPoint(58.3F, -5F, -5.45F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38
		bodyModel[549].setRotationPoint(57F, -5F, -6.7F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.45F, 0F, 0F, 0.45F); // Box 38
		bodyModel[550].setRotationPoint(57F, -5F, -5.45F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0.45F, 0.21F, 0F, 0.45F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0.21F, 0F, 0.45F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[551].setRotationPoint(58.3F, -5F, 3.45F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0.25F, 0.3F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.3F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[552].setRotationPoint(57F, -5F, 5.7F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0.45F, 0.3F, 0F, 0.45F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0.3F, 0F, 0.45F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[553].setRotationPoint(57F, -5F, 3.45F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[554].setRotationPoint(45.75F, -3F, -8.75F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.11F, 0F, -0.5F, 0.11F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.11F, 0F, 0F, 0.11F, 0F, 0F); // Box 493
		bodyModel[555].setRotationPoint(46.25F, -7F, -8.75F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.37F, 0F, -0.3F, -0.23F, 0F, -0.3F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, -0.37F, -4.5F, -0.3F, -0.23F, -4.5F, -0.3F, -0.5F, -4.5F, -4.5F, 0F, -4.5F, -4.5F); // Box 495 cull
		bodyModel[556].setRotationPoint(45.79F, -4.5F, -8.25F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.23F, 0F, -0.3F, -0.37F, 0F, -0.3F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.23F, -4.5F, -0.3F, -0.37F, -4.5F, -0.3F, 0F, -4.5F, -4.5F, -0.5F, -4.5F, -4.5F); // Box 495 cull
		bodyModel[557].setRotationPoint(49.71F, -4.5F, -8.25F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493 cull
		bodyModel[558].setRotationPoint(46.25F, -2F, -8.5F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[559].setRotationPoint(51.25F, -3F, -7.15F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.11F, 0F, -0.5F, 0.11F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.11F, 0F, 0F, 0.11F, 0F, 0F); // Box 493
		bodyModel[560].setRotationPoint(51.75F, -7F, -7.15F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.37F, 0F, -0.3F, -0.23F, 0F, -0.3F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, -0.37F, -4.5F, -0.3F, -0.23F, -4.5F, -0.3F, -0.5F, -4.5F, -4.5F, 0F, -4.5F, -4.5F); // Box 495 cull
		bodyModel[561].setRotationPoint(51.29F, -4.5F, -6.65F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.23F, 0F, -0.3F, -0.37F, 0F, -0.3F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.23F, -4.5F, -0.3F, -0.37F, -4.5F, -0.3F, 0F, -4.5F, -4.5F, -0.5F, -4.5F, -4.5F); // Box 495 cull
		bodyModel[562].setRotationPoint(55.21F, -4.5F, -6.65F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493 cull
		bodyModel[563].setRotationPoint(51.75F, -2F, -6.9F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 563
		bodyModel[564].setRotationPoint(45.75F, -3F, 3.75F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0.11F, 0F, -0.5F, 0.11F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.11F, 0F, 0F, 0.11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[565].setRotationPoint(46.25F, -7F, 7.75F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.23F, 0F, -0.3F, -0.37F, 0F, -0.3F, 0F, -4.5F, -4.5F, -0.5F, -4.5F, -4.5F, -0.23F, -4.5F, -0.3F, -0.37F, -4.5F, -0.3F); // Box 565 cull
		bodyModel[566].setRotationPoint(45.79F, -4.5F, 0.25F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4.5F, 0F, 0F, -4.5F, -0.37F, 0F, -0.3F, -0.23F, 0F, -0.3F, -0.5F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, -0.37F, -4.5F, -0.3F, -0.23F, -4.5F, -0.3F); // Box 566 cull
		bodyModel[567].setRotationPoint(49.71F, -4.5F, 0.25F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 567 cull
		bodyModel[568].setRotationPoint(46.25F, -2F, 7.5F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 563
		bodyModel[569].setRotationPoint(51.25F, -3F, 2.15F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0.11F, 0F, -0.5F, 0.11F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.11F, 0F, 0F, 0.11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[570].setRotationPoint(51.75F, -7F, 6.15F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.23F, 0F, -0.3F, -0.37F, 0F, -0.3F, 0F, -4.5F, -4.5F, -0.5F, -4.5F, -4.5F, -0.23F, -4.5F, -0.3F, -0.37F, -4.5F, -0.3F); // Box 565 cull
		bodyModel[571].setRotationPoint(51.29F, -4.5F, -1.35F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4.5F, 0F, 0F, -4.5F, -0.37F, 0F, -0.3F, -0.23F, 0F, -0.3F, -0.5F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, -0.37F, -4.5F, -0.3F, -0.23F, -4.5F, -0.3F); // Box 566 cull
		bodyModel[572].setRotationPoint(55.21F, -4.5F, -1.35F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 567 cull
		bodyModel[573].setRotationPoint(51.75F, -2F, 5.9F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[574].setRotationPoint(49F, -5F, 2.25F);

		bodyModel[575].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[575].setRotationPoint(50F, -5.5F, 3.25F);
		bodyModel[575].rotateAngleY = -0.78539816F;

		bodyModel[576].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[576].setRotationPoint(49F, 0.5F, 2.25F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[577].setRotationPoint(49F, -5F, -4.25F);

		bodyModel[578].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[578].setRotationPoint(50F, -5.5F, -3.25F);
		bodyModel[578].rotateAngleY = -0.78539816F;

		bodyModel[579].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[579].setRotationPoint(49F, 0.5F, -4.25F);

		bodyModel[580].addShapeBox(-0.12F, 0F, -0.12F, 1, 2, 1, 0F,0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0.25F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F, -0.625F, 0F, 0.25F, -0.625F); // Box 275 cull
		bodyModel[580].setRotationPoint(57.77F, -7.25F, -3.9F);
		bodyModel[580].rotateAngleY = -0.78539816F;

		bodyModel[581].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, -1.75F); // Box 275
		bodyModel[581].setRotationPoint(57.27F, -7F, -4.52F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.01F, -0.01F, -0.01F, -0.76F, -0.01F, -0.01F, -0.76F, -0.01F, -0.76F, -0.01F, -0.01F, -0.76F, -0.01F, -0.01F, -0.01F, -0.76F, -0.01F, -0.01F, -0.76F, -0.01F, -0.76F, -0.01F, -0.01F, -0.76F); // Box 275 glow
		bodyModel[582].setRotationPoint(57.27F, -7F, -4.52F);

		bodyModel[583].addShapeBox(-0.12F, 0F, -0.12F, 1, 2, 1, 0F,0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0.25F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F, -0.625F, 0F, 0.25F, -0.625F); // Box 611
		bodyModel[583].setRotationPoint(57.77F, -7.25F, 3.9F);
		bodyModel[583].rotateAngleY = -0.78539816F;

		bodyModel[584].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, -1.75F, -1.75F, 0F, -1.75F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -1.75F, 0F, -1.75F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 612
		bodyModel[584].setRotationPoint(57.27F, -7F, 1.52F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.01F, -0.01F, -0.76F, -0.76F, -0.01F, -0.76F, -0.76F, -0.01F, -0.01F, -0.01F, -0.01F, -0.01F, -0.01F, -0.01F, -0.76F, -0.76F, -0.01F, -0.76F, -0.76F, -0.01F, -0.01F, -0.01F, -0.01F, -0.01F); // Box 613 glow
		bodyModel[585].setRotationPoint(57.27F, -7F, 2.52F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 1, 0, 16, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 275 glow
		bodyModel[586].setRotationPoint(46F, -14.99F, -8F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 1, 0, 15, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 275 glow
		bodyModel[587].setRotationPoint(50F, -14.99F, -7.5F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 275 glow
		bodyModel[588].setRotationPoint(54F, -14.99F, -6F);

		bodyModel[589].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[589].setRotationPoint(-33F, -15F, -10F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[590].setRotationPoint(-32F, -8F, -10F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[591].setRotationPoint(-32F, -3F, -9F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 38
		bodyModel[592].setRotationPoint(-32F, -15F, -1F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 38
		bodyModel[593].setRotationPoint(-30F, -15F, -3F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 2, 16, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[594].setRotationPoint(-30F, -15F, 6F);

		bodyModel[595].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[595].setRotationPoint(-43F, -15F, -10F);

		bodyModel[596].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 38
		bodyModel[596].setRotationPoint(-42F, -15F, 5F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[597].setRotationPoint(-43F, -15F, 5F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[598].setRotationPoint(-33F, -15F, 5F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[599].setRotationPoint(-37F, -3F, -9F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.37F, 0F, -0.3F, -0.23F, 0F, -0.3F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, -0.37F, -4.5F, -0.3F, -0.23F, -4.5F, -0.3F, -0.5F, -4.5F, -4.5F, 0F, -4.5F, -4.5F); // Box 495 cull
		bodyModel[600].setRotationPoint(-36.96F, -4.5F, -8.5F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.23F, 0F, -0.3F, -0.37F, 0F, -0.3F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.23F, -4.5F, -0.3F, -0.37F, -4.5F, -0.3F, 0F, -4.5F, -4.5F, -0.5F, -4.5F, -4.5F); // Box 495 cull
		bodyModel[601].setRotationPoint(-34.04F, -4.5F, -8.5F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493 cull
		bodyModel[602].setRotationPoint(-36.5F, -2F, -8.75F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.11F, 0F, -0.5F, 0.11F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.11F, 0F, 0F, 0.11F, 0F, 0F); // Box 493
		bodyModel[603].setRotationPoint(-36.5F, -7F, -9F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F); // Box 492
		bodyModel[604].setRotationPoint(-41.5F, -3F, -9.44F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0.11F, -0.5F, 0F, 0.11F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.11F, 0F, 0F, 0.11F, 0F, 0F, 0F); // Box 493
		bodyModel[605].setRotationPoint(-41.5F, -7F, -8.94F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,-0.5F, 0F, -0.6F, -4.3F, 0F, -0.26F, -4.3F, 0F, -0.34F, -0.5F, 0F, 0.1F, -0.5F, -4.5F, -0.6F, -4.3F, -4.5F, -0.26F, -4.3F, -4.5F, -0.34F, -0.5F, -4.5F, 0.1F); // Box 495 cull
		bodyModel[606].setRotationPoint(-41.19F, -4.5F, -9.64F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,-0.5F, 0F, 0.1F, -4.3F, 0F, -0.34F, -4.3F, 0F, -0.26F, -0.5F, 0F, -0.6F, -0.5F, -4.5F, 0.1F, -4.3F, -4.5F, -0.34F, -4.3F, -4.5F, -0.25F, -0.5F, -4.5F, -0.6F); // Box 495 cull
		bodyModel[607].setRotationPoint(-41.21F, -4.5F, 3.75F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 1, 3, 27, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -0.5F, 0F, -14F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -0.5F, 0F, -14F); // Box 493 cull
		bodyModel[608].setRotationPoint(-41.75F, -2F, -8.94F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 495 cull
		bodyModel[609].setRotationPoint(-39F, -2.5F, -3F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[610].setRotationPoint(-37.5F, -7F, -11F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[611].setRotationPoint(-40F, -7F, 11F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[612].setRotationPoint(-37.5F, -7F, -10.5F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[613].setRotationPoint(-40F, -7F, 10.5F);

		bodyModel[614].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[614].setRotationPoint(-49F, -15F, -10F);

		bodyModel[615].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 38
		bodyModel[615].setRotationPoint(-48F, -10F, -10F);

		bodyModel[616].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 38
		bodyModel[616].setRotationPoint(-48F, -4F, -10F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[617].setRotationPoint(-48F, -15F, 5F);

		bodyModel[618].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 38
		bodyModel[618].setRotationPoint(-49F, -15F, 4F);

		bodyModel[619].addBox(0F, 0F, 0F, 6, 16, 1, 0F); // Box 38
		bodyModel[619].setRotationPoint(-55F, -15F, 3F);

		bodyModel[620].addBox(0F, 0F, 0F, 6, 16, 1, 0F); // Box 38
		bodyModel[620].setRotationPoint(-55F, -15F, -4F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[621].setRotationPoint(-51F, -5F, 9F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[622].setRotationPoint(-51F, -5F, 8F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[623].setRotationPoint(-50F, -5F, 8F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[624].setRotationPoint(-50.03F, -4F, 8.63F);
		bodyModel[624].rotateAngleY = 0.78539816F;

		bodyModel[625].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
		bodyModel[625].setRotationPoint(-51F, -9F, 8F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[626].setRotationPoint(-54.95F, -2F, 8.55F);
		bodyModel[626].rotateAngleY = -0.78539816F;

		bodyModel[627].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[627].setRotationPoint(-54.6F, -1F, 8.9F);
		bodyModel[627].rotateAngleY = -0.78539816F;

		bodyModel[628].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[628].setRotationPoint(-54.95F, 0.5F, 8.55F);
		bodyModel[628].rotateAngleY = -0.78539816F;

		bodyModel[629].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
		bodyModel[629].setRotationPoint(-51F, -14F, 8F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 663
		bodyModel[630].setRotationPoint(-51F, -9F, -10F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 664
		bodyModel[631].setRotationPoint(-51F, -14F, -10F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[632].setRotationPoint(-51F, -5F, -10F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[633].setRotationPoint(-51F, -5F, -9F);

		bodyModel[634].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[634].setRotationPoint(-50F, -5F, -9F);

		bodyModel[635].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[635].setRotationPoint(-49.63F, -4F, -9.69F);
		bodyModel[635].rotateAngleY = 0.78539816F;

		bodyModel[636].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[636].setRotationPoint(-53.5F, -2F, -9.95F);
		bodyModel[636].rotateAngleY = 0.78539816F;

		bodyModel[637].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[637].setRotationPoint(-53.85F, -1F, -9.6F);
		bodyModel[637].rotateAngleY = 0.78539816F;

		bodyModel[638].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[638].setRotationPoint(-53.5F, 0.5F, -9.95F);
		bodyModel[638].rotateAngleY = 0.78539816F;

		bodyModel[639].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[639].setRotationPoint(-38F, -5F, -4.25F);

		bodyModel[640].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[640].setRotationPoint(-37F, -5.5F, -3.25F);
		bodyModel[640].rotateAngleY = -0.78539816F;

		bodyModel[641].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[641].setRotationPoint(-38F, 0.5F, -4.25F);

		bodyModel[642].addShapeBox(0F, 0F, 0F, 1, 0, 11, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 275 glow
		bodyModel[642].setRotationPoint(-40.5F, -14.99F, -8F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 275 glow
		bodyModel[643].setRotationPoint(-35.5F, -14.99F, -7F);

		bodyModel[644].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 275 glow
		bodyModel[644].setRotationPoint(-41F, -14.99F, 7.5F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 275 glow
		bodyModel[645].setRotationPoint(-30.5F, -14.99F, 4F);

		bodyModel[646].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 275 glow
		bodyModel[646].setRotationPoint(-49F, -14.99F, -0.5F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[647].setRotationPoint(-49F, -15F, 3F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1.1F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -1F, -0.35F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, -0.5F, -2.25F, 0F); // Box 847
		bodyModel[648].setRotationPoint(-31F, -18F, -11F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, -0.5F, 0F, 0.15F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, -0.5F, -1F, 0.15F); // Box 848
		bodyModel[649].setRotationPoint(-31F, -18.5F, -10F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F); // Box 204
		bodyModel[650].setRotationPoint(-45.5F, -19.36F, -8.36F);
		bodyModel[650].rotateAngleX = -1.04283423F;

		bodyModel[651].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, -0.5F, 0F, -0.54F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[651].setRotationPoint(-45.5F, -17.65F, -10.92F);
		bodyModel[651].rotateAngleX = -0.41887902F;

		bodyModel[652].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F); // Box 204
		bodyModel[652].setRotationPoint(43.5F, -19.36F, -8.36F);
		bodyModel[652].rotateAngleX = -1.04283423F;

		bodyModel[653].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, -0.5F, 0F, -0.54F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[653].setRotationPoint(43.5F, -17.65F, -10.92F);
		bodyModel[653].rotateAngleX = -0.41887902F;

		bodyModel[654].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -1.1F, -0.75F, 0F, -0.5F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 275
		bodyModel[654].setRotationPoint(-55F, -18F, 10F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -1F, -0.85F, 0F, -0.5F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 276
		bodyModel[655].setRotationPoint(-55F, -18.5F, 8F);

		bodyModel[656].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F); // Box 128
		bodyModel[656].setRotationPoint(-45.5F, -18.5F, 7.85F);
		bodyModel[656].rotateAngleX = 1.04283423F;

		bodyModel[657].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.5F, 0F, -0.54F, -0.5F); // Box 128
		bodyModel[657].setRotationPoint(-45.5F, -17.25F, 10F);
		bodyModel[657].rotateAngleX = 0.41887902F;

		bodyModel[658].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[658].setRotationPoint(-27F, 4F, 0F);
		bodyModel[658].rotateAngleX = -0.78539816F;

		bodyModel[659].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[659].setRotationPoint(-27.01F, 4F, -0.5F);

		bodyModel[660].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[660].setRotationPoint(-18.99F, 4F, -0.5F);

		bodyModel[661].addShapeBox(0F, 0F, 0F, 18, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[661].setRotationPoint(12F, 4F, -2F);

		bodyModel[662].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[662].setRotationPoint(12F, 6.5F, -2F);

		bodyModel[663].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 2
		bodyModel[663].setRotationPoint(16F, 3F, 2F);

		bodyModel[664].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 59
		bodyModel[664].setRotationPoint(16F, 3F, -10F);

		bodyModel[665].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 52
		bodyModel[665].setRotationPoint(19F, 3F, -10F);

		bodyModel[666].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 2
		bodyModel[666].setRotationPoint(19F, 3F, 5F);

		bodyModel[667].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[667].setRotationPoint(8F, 3F, 8.9F);
		bodyModel[667].rotateAngleX = -0.78539816F;

		bodyModel[668].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[668].setRotationPoint(7.99F, 3F, 8.4F);

		bodyModel[669].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[669].setRotationPoint(15.01F, 3F, 8.4F);

		bodyModel[670].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[670].setRotationPoint(28F, 3F, 8.9F);
		bodyModel[670].rotateAngleX = -0.78539816F;

		bodyModel[671].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[671].setRotationPoint(27.99F, 3F, 8.4F);

		bodyModel[672].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[672].setRotationPoint(33.01F, 3F, 8.4F);

		bodyModel[673].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[673].setRotationPoint(-4F, 3F, 9F);

		bodyModel[674].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[674].setRotationPoint(0F, 3F, 9F);

		bodyModel[675].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[675].setRotationPoint(4F, 3F, -8.9F);
		bodyModel[675].rotateAngleX = -0.78539816F;

		bodyModel[676].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[676].setRotationPoint(3.99F, 3F, -9.4F);

		bodyModel[677].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[677].setRotationPoint(12.01F, 3F, -9.4F);

		bodyModel[678].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[678].setRotationPoint(-1F, 3F, -10F);

		bodyModel[679].addBox(0F, 0F, 0F, 16, 5, 5, 0F); // Box 2
		bodyModel[679].setRotationPoint(-22F, 3F, -10F);

		bodyModel[680].addBox(0F, 0F, 0F, 10, 5, 5, 0F); // Box 2
		bodyModel[680].setRotationPoint(-16F, 3F, -10F);

		bodyModel[681].addBox(0F, 0F, 0F, 3, 5, 5, 0F); // Box 2
		bodyModel[681].setRotationPoint(-22F, 3F, -10F);

		bodyModel[682].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[682].setRotationPoint(-63F, -7F, -10F);

		bodyModel[683].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[683].setRotationPoint(-63F, -7F, 5F);

		bodyModel[684].addShapeBox(0F, 2F, 0.5F, 4, 0, 2, 0F,0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[684].setRotationPoint(-59.99F, 4F, 8F);

		bodyModel[685].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[685].setRotationPoint(56F, -14.99F, -1F);

		bodyModel[686].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[686].setRotationPoint(51.5F, -14.99F, -1F);

		bodyModel[687].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 612
		bodyModel[687].setRotationPoint(57.27F, -7F, 2.52F);

		bodyModel[688].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 275 cull
		bodyModel[688].setRotationPoint(57.27F, -7F, -4.52F);

		bodyModel[689].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[689].setRotationPoint(-50F, -5F, -6F);

		bodyModel[690].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[690].setRotationPoint(-50F, -5F, 4F);

		bodyModel[691].addBox(0F, 0F, 0F, 2, 14, 5, 0F); // Box 38
		bodyModel[691].setRotationPoint(-35F, -13F, 0F);

		bodyModel[692].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.22F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.22F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[692].setRotationPoint(57.58F, 4F, -8.83F);
		bodyModel[692].rotateAngleY = 0.78539816F;

		bodyModel[693].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.22F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.22F, 0F, -0.02F, 0F, 0F, 0F); // Box 329
		bodyModel[693].setRotationPoint(56.88F, 4F, 8.12F);
		bodyModel[693].rotateAngleY = -0.78539816F;

		bodyModel[694].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[694].setRotationPoint(59.89F, 4F, -6.45F);
		bodyModel[694].rotateAngleY = 1.10828408F;

		bodyModel[695].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F); // Box 329
		bodyModel[695].setRotationPoint(59F, 4F, 6F);
		bodyModel[695].rotateAngleY = -1.10828408F;
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 696; i++)
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