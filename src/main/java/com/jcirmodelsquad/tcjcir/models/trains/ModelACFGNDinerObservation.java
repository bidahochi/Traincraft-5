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

public class ModelACFGNDinerObservation extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelACFGNDinerObservation() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[661];

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
		bodyModel[3] = new ModelRendererTurbo(this, 324, 135, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 303, 132, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 29, 123, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 48, 132, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 283, 122, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 33, 114, textureX, textureY); // Left trapdoor
		bodyModel[11] = new ModelRendererTurbo(this, 35, 129, textureX, textureY); // Right trapdoor
		bodyModel[12] = new ModelRendererTurbo(this, 72, 69, textureX, textureY); // Left side door
		bodyModel[13] = new ModelRendererTurbo(this, 83, 68, textureX, textureY); // Box 38
		bodyModel[14] = new ModelRendererTurbo(this, 83, 87, textureX, textureY); // Box 128
		bodyModel[15] = new ModelRendererTurbo(this, 28, 90, textureX, textureY); // Box 128
		bodyModel[16] = new ModelRendererTurbo(this, 29, 56, textureX, textureY); // Box 128
		bodyModel[17] = new ModelRendererTurbo(this, 45, 30, textureX, textureY); // Box 128
		bodyModel[18] = new ModelRendererTurbo(this, 44, 5, textureX, textureY); // Box 128
		bodyModel[19] = new ModelRendererTurbo(this, 72, 90, textureX, textureY); // Right side door
		bodyModel[20] = new ModelRendererTurbo(this, 35, 81, textureX, textureY); // Box 128
		bodyModel[21] = new ModelRendererTurbo(this, 29, 17, textureX, textureY); // Box 128
		bodyModel[22] = new ModelRendererTurbo(this, 72, 66, textureX, textureY); // Box 128
		bodyModel[23] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[24] = new ModelRendererTurbo(this, 20, 75, textureX, textureY); // Vestibule door
		bodyModel[25] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[26] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[27] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[28] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[29] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[30] = new ModelRendererTurbo(this, 72, 218, textureX, textureY); // Box 128
		bodyModel[31] = new ModelRendererTurbo(this, 72, 196, textureX, textureY); // Box 177
		bodyModel[32] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[33] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[34] = new ModelRendererTurbo(this, 32, 24, textureX, textureY); // Front gate closed
		bodyModel[35] = new ModelRendererTurbo(this, 29, 29, textureX, textureY); // Front gate open
		bodyModel[36] = new ModelRendererTurbo(this, 101, 7, textureX, textureY); // Box 128
		bodyModel[37] = new ModelRendererTurbo(this, 96, 14, textureX, textureY); // Box 128
		bodyModel[38] = new ModelRendererTurbo(this, 96, 2, textureX, textureY); // Box 176
		bodyModel[39] = new ModelRendererTurbo(this, 63, 3, textureX, textureY); // Box 128
		bodyModel[40] = new ModelRendererTurbo(this, 72, 202, textureX, textureY); // Box 128
		bodyModel[41] = new ModelRendererTurbo(this, 77, 148, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 77, 151, textureX, textureY); // Box 2
		bodyModel[43] = new ModelRendererTurbo(this, 84, 151, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[45] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[46] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[47] = new ModelRendererTurbo(this, 244, 151, textureX, textureY); // Box 2
		bodyModel[48] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[49] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[50] = new ModelRendererTurbo(this, 105, 148, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[51] = new ModelRendererTurbo(this, 107, 151, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[52] = new ModelRendererTurbo(this, 77, 138, textureX, textureY); // Box 24
		bodyModel[53] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 25
		bodyModel[54] = new ModelRendererTurbo(this, 82, 141, textureX, textureY); // Box 27
		bodyModel[55] = new ModelRendererTurbo(this, 256, 138, textureX, textureY); // Box 28
		bodyModel[56] = new ModelRendererTurbo(this, 256, 141, textureX, textureY); // Box 29
		bodyModel[57] = new ModelRendererTurbo(this, 261, 138, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[58] = new ModelRendererTurbo(this, 91, 138, textureX, textureY); // Box 32
		bodyModel[59] = new ModelRendererTurbo(this, 89, 141, textureX, textureY); // Box 33
		bodyModel[60] = new ModelRendererTurbo(this, 242, 138, textureX, textureY); // Box 34
		bodyModel[61] = new ModelRendererTurbo(this, 240, 141, textureX, textureY); // Box 35
		bodyModel[62] = new ModelRendererTurbo(this, 96, 138, textureX, textureY); // Box 36
		bodyModel[63] = new ModelRendererTurbo(this, 96, 141, textureX, textureY); // Box 37
		bodyModel[64] = new ModelRendererTurbo(this, 101, 138, textureX, textureY); // Box 38
		bodyModel[65] = new ModelRendererTurbo(this, 103, 141, textureX, textureY); // Box 39
		bodyModel[66] = new ModelRendererTurbo(this, 84, 148, textureX, textureY); // Box 2
		bodyModel[67] = new ModelRendererTurbo(this, 82, 138, textureX, textureY); // Box 41
		bodyModel[68] = new ModelRendererTurbo(this, 27, 3, textureX, textureY); // Box 128
		bodyModel[69] = new ModelRendererTurbo(this, 14, 31, textureX, textureY); // Box 128
		bodyModel[70] = new ModelRendererTurbo(this, 22, 14, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 128
		bodyModel[72] = new ModelRendererTurbo(this, 15, 13, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 8, 13, textureX, textureY); // Box 128
		bodyModel[74] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 128
		bodyModel[75] = new ModelRendererTurbo(this, 4, 1, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 22, 5, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 1, 5, textureX, textureY); // Box 153
		bodyModel[78] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 72, 228, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 72, 187, textureX, textureY); // Box 193
		bodyModel[81] = new ModelRendererTurbo(this, 72, 224, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 72, 192, textureX, textureY); // Box 194
		bodyModel[83] = new ModelRendererTurbo(this, 282, 108, textureX, textureY); // Box 2
		bodyModel[84] = new ModelRendererTurbo(this, 317, 118, textureX, textureY); // Box 2
		bodyModel[85] = new ModelRendererTurbo(this, 294, 68, textureX, textureY); // Box 38
		bodyModel[86] = new ModelRendererTurbo(this, 326, 111, textureX, textureY); // Box 2
		bodyModel[87] = new ModelRendererTurbo(this, 345, 117, textureX, textureY); // Box 2
		bodyModel[88] = new ModelRendererTurbo(this, 355, 113, textureX, textureY); // Box 2
		bodyModel[89] = new ModelRendererTurbo(this, 333, 71, textureX, textureY); // Rear end door part
		bodyModel[90] = new ModelRendererTurbo(this, 345, 94, textureX, textureY); // Rear end door part
		bodyModel[91] = new ModelRendererTurbo(this, 366, 118, textureX, textureY); // Box 2
		bodyModel[92] = new ModelRendererTurbo(this, 357, 120, textureX, textureY); // Box 2
		bodyModel[93] = new ModelRendererTurbo(this, 345, 111, textureX, textureY); // Box 161
		bodyModel[94] = new ModelRendererTurbo(this, 366, 112, textureX, textureY); // Box 162
		bodyModel[95] = new ModelRendererTurbo(this, 355, 106, textureX, textureY); // Box 163
		bodyModel[96] = new ModelRendererTurbo(this, 322, 65, textureX, textureY); // Box 2
		bodyModel[97] = new ModelRendererTurbo(this, 334, 63, textureX, textureY); // Box 2
		bodyModel[98] = new ModelRendererTurbo(this, 346, 86, textureX, textureY); // Box 168
		bodyModel[99] = new ModelRendererTurbo(this, 313, 68, textureX, textureY); // Box 38
		bodyModel[100] = new ModelRendererTurbo(this, 317, 113, textureX, textureY); // Box 174
		bodyModel[101] = new ModelRendererTurbo(this, 306, 87, textureX, textureY); // Box 175
		bodyModel[102] = new ModelRendererTurbo(this, 334, 86, textureX, textureY); // Box 176
		bodyModel[103] = new ModelRendererTurbo(this, 325, 87, textureX, textureY); // Box 177
		bodyModel[104] = new ModelRendererTurbo(this, 296, 64, textureX, textureY); // Box 38
		bodyModel[105] = new ModelRendererTurbo(this, 318, 61, textureX, textureY); // Box 38
		bodyModel[106] = new ModelRendererTurbo(this, 341, 60, textureX, textureY); // Box 2
		bodyModel[107] = new ModelRendererTurbo(this, 296, 22, textureX, textureY); // Box 182
		bodyModel[108] = new ModelRendererTurbo(this, 317, 25, textureX, textureY); // Box 183
		bodyModel[109] = new ModelRendererTurbo(this, 319, 19, textureX, textureY); // Box 184
		bodyModel[110] = new ModelRendererTurbo(this, 295, 59, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 295, 26, textureX, textureY); // Box 188
		bodyModel[112] = new ModelRendererTurbo(this, 327, 58, textureX, textureY); // Box 128
		bodyModel[113] = new ModelRendererTurbo(this, 325, 29, textureX, textureY); // Box 191
		bodyModel[114] = new ModelRendererTurbo(this, 339, 54, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 328, 23, textureX, textureY); // Box 196
		bodyModel[116] = new ModelRendererTurbo(this, 349, 48, textureX, textureY); // Box 128
		bodyModel[117] = new ModelRendererTurbo(this, 353, 44, textureX, textureY); // Box 200
		bodyModel[118] = new ModelRendererTurbo(this, 309, 38, textureX, textureY); // Box 128
		bodyModel[119] = new ModelRendererTurbo(this, 316, 48, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 295, 51, textureX, textureY); // Box 128
		bodyModel[121] = new ModelRendererTurbo(this, 308, 53, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 316, 33, textureX, textureY); // Box 205
		bodyModel[123] = new ModelRendererTurbo(this, 297, 37, textureX, textureY); // Box 206
		bodyModel[124] = new ModelRendererTurbo(this, 295, 31, textureX, textureY); // Box 207
		bodyModel[125] = new ModelRendererTurbo(this, 328, 46, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 329, 51, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 329, 40, textureX, textureY); // Box 214
		bodyModel[128] = new ModelRendererTurbo(this, 330, 52, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 325, 34, textureX, textureY); // Box 220
		bodyModel[130] = new ModelRendererTurbo(this, 340, 48, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 334, 30, textureX, textureY); // Box 222
		bodyModel[132] = new ModelRendererTurbo(this, 340, 42, textureX, textureY); // Box 128
		bodyModel[133] = new ModelRendererTurbo(this, 334, 36, textureX, textureY); // Box 224
		bodyModel[134] = new ModelRendererTurbo(this, 268, 138, textureX, textureY); // Box 31
		bodyModel[135] = new ModelRendererTurbo(this, 268, 141, textureX, textureY); // Box 31
		bodyModel[136] = new ModelRendererTurbo(this, 265, 148, textureX, textureY); // Box 228
		bodyModel[137] = new ModelRendererTurbo(this, 265, 151, textureX, textureY); // Box 229
		bodyModel[138] = new ModelRendererTurbo(this, 275, 143, textureX, textureY); // Box 30
		bodyModel[139] = new ModelRendererTurbo(this, 277, 138, textureX, textureY); // Box 31
		bodyModel[140] = new ModelRendererTurbo(this, 274, 154, textureX, textureY); // Box 232
		bodyModel[141] = new ModelRendererTurbo(this, 274, 149, textureX, textureY); // Box 233
		bodyModel[142] = new ModelRendererTurbo(this, 263, 141, textureX, textureY,"cull"); // Box 30 cull
		bodyModel[143] = new ModelRendererTurbo(this, 253, 148, textureX, textureY); // Box 235
		bodyModel[144] = new ModelRendererTurbo(this, 253, 151, textureX, textureY); // Box 236
		bodyModel[145] = new ModelRendererTurbo(this, 258, 148, textureX, textureY); // Box 237
		bodyModel[146] = new ModelRendererTurbo(this, 260, 151, textureX, textureY); // Box 238
		bodyModel[147] = new ModelRendererTurbo(this, 373, 117, textureX, textureY); // Box 2
		bodyModel[148] = new ModelRendererTurbo(this, 373, 113, textureX, textureY); // Box 240
		bodyModel[149] = new ModelRendererTurbo(this, 371, 121, textureX, textureY); // Box 2
		bodyModel[150] = new ModelRendererTurbo(this, 371, 109, textureX, textureY); // Box 242
		bodyModel[151] = new ModelRendererTurbo(this, 350, 63, textureX, textureY); // Box 128
		bodyModel[152] = new ModelRendererTurbo(this, 350, 56, textureX, textureY); // Box 128
		bodyModel[153] = new ModelRendererTurbo(this, 360, 49, textureX, textureY); // Box 128
		bodyModel[154] = new ModelRendererTurbo(this, 369, 46, textureX, textureY); // Box 128
		bodyModel[155] = new ModelRendererTurbo(this, 382, 46, textureX, textureY); // Box 128
		bodyModel[156] = new ModelRendererTurbo(this, 343, 25, textureX, textureY); // Box 248
		bodyModel[157] = new ModelRendererTurbo(this, 343, 32, textureX, textureY); // Box 249
		bodyModel[158] = new ModelRendererTurbo(this, 360, 35, textureX, textureY); // Box 250
		bodyModel[159] = new ModelRendererTurbo(this, 369, 38, textureX, textureY); // Box 251
		bodyModel[160] = new ModelRendererTurbo(this, 382, 38, textureX, textureY); // Box 252
		bodyModel[161] = new ModelRendererTurbo(this, 363, 63, textureX, textureY); // Box 128
		bodyModel[162] = new ModelRendererTurbo(this, 360, 31, textureX, textureY); // Box 254
		bodyModel[163] = new ModelRendererTurbo(this, 373, 53, textureX, textureY); // Box 128
		bodyModel[164] = new ModelRendererTurbo(this, 375, 34, textureX, textureY); // Box 256
		bodyModel[165] = new ModelRendererTurbo(this, 395, 49, textureX, textureY); // Box 128
		bodyModel[166] = new ModelRendererTurbo(this, 395, 41, textureX, textureY); // Box 258
		bodyModel[167] = new ModelRendererTurbo(this, 384, 53, textureX, textureY); // Box 128
		bodyModel[168] = new ModelRendererTurbo(this, 386, 34, textureX, textureY); // Box 260
		bodyModel[169] = new ModelRendererTurbo(this, 364, 67, textureX, textureY); // Box 128
		bodyModel[170] = new ModelRendererTurbo(this, 360, 26, textureX, textureY); // Box 269
		bodyModel[171] = new ModelRendererTurbo(this, 390, 54, textureX, textureY); // Box 128
		bodyModel[172] = new ModelRendererTurbo(this, 380, 29, textureX, textureY); // Box 272
		bodyModel[173] = new ModelRendererTurbo(this, 379, 57, textureX, textureY); // Box 128
		bodyModel[174] = new ModelRendererTurbo(this, 391, 35, textureX, textureY); // Box 274
		bodyModel[175] = new ModelRendererTurbo(this, 404, 49, textureX, textureY); // Box 128
		bodyModel[176] = new ModelRendererTurbo(this, 404, 41, textureX, textureY); // Box 276
		bodyModel[177] = new ModelRendererTurbo(this, 217, 87, textureX, textureY); // Box 128
		bodyModel[178] = new ModelRendererTurbo(this, 203, 87, textureX, textureY); // Box 128
		bodyModel[179] = new ModelRendererTurbo(this, 203, 91, textureX, textureY); // Right side loading door
		bodyModel[180] = new ModelRendererTurbo(this, 3, 114, textureX, textureY); // Box 38
		bodyModel[181] = new ModelRendererTurbo(this, 10, 103, textureX, textureY); // Box 38
		bodyModel[182] = new ModelRendererTurbo(this, 2, 110, textureX, textureY); // Box 128
		bodyModel[183] = new ModelRendererTurbo(this, 8, 100, textureX, textureY); // Box 128
		bodyModel[184] = new ModelRendererTurbo(this, 1, 141, textureX, textureY); // Box 128
		bodyModel[185] = new ModelRendererTurbo(this, 1, 104, textureX, textureY); // Box 128
		bodyModel[186] = new ModelRendererTurbo(this, 7, 96, textureX, textureY); // Box 128
		bodyModel[187] = new ModelRendererTurbo(this, 2, 99, textureX, textureY); // Box 128
		bodyModel[188] = new ModelRendererTurbo(this, 6, 91, textureX, textureY); // Box 128
		bodyModel[189] = new ModelRendererTurbo(this, 2, 83, textureX, textureY); // Box 128
		bodyModel[190] = new ModelRendererTurbo(this, 5, 82, textureX, textureY); // Box 128
		bodyModel[191] = new ModelRendererTurbo(this, 2, 91, textureX, textureY); // Box 128
		bodyModel[192] = new ModelRendererTurbo(this, 3, 43, textureX, textureY); // Box 247
		bodyModel[193] = new ModelRendererTurbo(this, 10, 51, textureX, textureY); // Box 248
		bodyModel[194] = new ModelRendererTurbo(this, 2, 63, textureX, textureY); // Box 249
		bodyModel[195] = new ModelRendererTurbo(this, 8, 70, textureX, textureY); // Box 250
		bodyModel[196] = new ModelRendererTurbo(this, 1, 67, textureX, textureY); // Box 251
		bodyModel[197] = new ModelRendererTurbo(this, 7, 73, textureX, textureY); // Box 252
		bodyModel[198] = new ModelRendererTurbo(this, 2, 73, textureX, textureY); // Box 253
		bodyModel[199] = new ModelRendererTurbo(this, 6, 77, textureX, textureY); // Box 254
		bodyModel[200] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Box 255
		bodyModel[201] = new ModelRendererTurbo(this, 247, 138, textureX, textureY,"cull"); // Box 475 cull
		bodyModel[202] = new ModelRendererTurbo(this, 247, 143, textureX, textureY); // Box 476
		bodyModel[203] = new ModelRendererTurbo(this, 51, 69, textureX, textureY); // Box 128
		bodyModel[204] = new ModelRendererTurbo(this, 63, 69, textureX, textureY); // Box 128
		bodyModel[205] = new ModelRendererTurbo(this, 51, 90, textureX, textureY); // Box 202
		bodyModel[206] = new ModelRendererTurbo(this, 63, 90, textureX, textureY); // Box 203
		bodyModel[207] = new ModelRendererTurbo(this, 200, 97, textureX, textureY); // Box 202
		bodyModel[208] = new ModelRendererTurbo(this, 214, 97, textureX, textureY); // Box 203
		bodyModel[209] = new ModelRendererTurbo(this, 279, 22, textureX, textureY); // Box 264
		bodyModel[210] = new ModelRendererTurbo(this, 279, 19, textureX, textureY); // Box 264
		bodyModel[211] = new ModelRendererTurbo(this, 279, 16, textureX, textureY); // Box 264
		bodyModel[212] = new ModelRendererTurbo(this, 279, 12, textureX, textureY); // Box 264
		bodyModel[213] = new ModelRendererTurbo(this, 279, 14, textureX, textureY); // Box 264
		bodyModel[214] = new ModelRendererTurbo(this, 271, 12, textureX, textureY); // Box 257
		bodyModel[215] = new ModelRendererTurbo(this, 271, 9, textureX, textureY); // Box 258
		bodyModel[216] = new ModelRendererTurbo(this, 271, 6, textureX, textureY); // Box 259
		bodyModel[217] = new ModelRendererTurbo(this, 272, 2, textureX, textureY); // Box 260
		bodyModel[218] = new ModelRendererTurbo(this, 272, 4, textureX, textureY); // Box 261
		bodyModel[219] = new ModelRendererTurbo(this, 268, 17, textureX, textureY); // Box 260
		bodyModel[220] = new ModelRendererTurbo(this, 288, 2, textureX, textureY); // Box 275
		bodyModel[221] = new ModelRendererTurbo(this, 288, 18, textureX, textureY); // Box 549
		bodyModel[222] = new ModelRendererTurbo(this, 283, 5, textureX, textureY); // Box 275
		bodyModel[223] = new ModelRendererTurbo(this, 347, 72, textureX, textureY); // Box 38
		bodyModel[224] = new ModelRendererTurbo(this, 352, 72, textureX, textureY,"lamp"); // marker light glow
		bodyModel[225] = new ModelRendererTurbo(this, 342, 72, textureX, textureY); // Box 38
		bodyModel[226] = new ModelRendererTurbo(this, 358, 87, textureX, textureY); // Box 290
		bodyModel[227] = new ModelRendererTurbo(this, 363, 87, textureX, textureY,"lamp"); // marker light glow
		bodyModel[228] = new ModelRendererTurbo(this, 353, 87, textureX, textureY); // Box 292
		bodyModel[229] = new ModelRendererTurbo(this, 435, 39, textureX, textureY); // Box 103
		bodyModel[230] = new ModelRendererTurbo(this, 434, 43, textureX, textureY); // Box 103
		bodyModel[231] = new ModelRendererTurbo(this, 434, 48, textureX, textureY); // Box 103
		bodyModel[232] = new ModelRendererTurbo(this, 435, 52, textureX, textureY); // Box 103
		bodyModel[233] = new ModelRendererTurbo(this, 435, 35, textureX, textureY); // Box 103
		bodyModel[234] = new ModelRendererTurbo(this, 435, 56, textureX, textureY); // Box 103
		bodyModel[235] = new ModelRendererTurbo(this, 434, 31, textureX, textureY); // Box 103
		bodyModel[236] = new ModelRendererTurbo(this, 434, 60, textureX, textureY); // Box 103
		bodyModel[237] = new ModelRendererTurbo(this, 415, 48, textureX, textureY); // Box 165
		bodyModel[238] = new ModelRendererTurbo(this, 415, 41, textureX, textureY); // Box 164
		bodyModel[239] = new ModelRendererTurbo(this, 427, 36, textureX, textureY); // Box 167
		bodyModel[240] = new ModelRendererTurbo(this, 427, 53, textureX, textureY); // Box 166
		bodyModel[241] = new ModelRendererTurbo(this, 451, 54, textureX, textureY); // Box 2
		bodyModel[242] = new ModelRendererTurbo(this, 451, 38, textureX, textureY); // Box 307
		bodyModel[243] = new ModelRendererTurbo(this, 420, 53, textureX, textureY); // Box 166
		bodyModel[244] = new ModelRendererTurbo(this, 420, 36, textureX, textureY); // Box 309
		bodyModel[245] = new ModelRendererTurbo(this, 451, 51, textureX, textureY); // Box 2
		bodyModel[246] = new ModelRendererTurbo(this, 451, 41, textureX, textureY); // Box 311
		bodyModel[247] = new ModelRendererTurbo(this, 451, 48, textureX, textureY); // Box 2
		bodyModel[248] = new ModelRendererTurbo(this, 451, 44, textureX, textureY); // Box 313
		bodyModel[249] = new ModelRendererTurbo(this, 444, 42, textureX, textureY,"lamp"); // Box 186 rear MARS light R
		bodyModel[250] = new ModelRendererTurbo(this, 444, 48, textureX, textureY,"lamp"); // Box 187 rear MARS light W
		bodyModel[251] = new ModelRendererTurbo(this, 441, 50, textureX, textureY); // Box 405
		bodyModel[252] = new ModelRendererTurbo(this, 441, 40, textureX, textureY); // Box 317
		bodyModel[253] = new ModelRendererTurbo(this, 441, 47, textureX, textureY); // Box 405
		bodyModel[254] = new ModelRendererTurbo(this, 441, 43, textureX, textureY); // Box 319
		bodyModel[255] = new ModelRendererTurbo(this, 286, 138, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[256] = new ModelRendererTurbo(this, 286, 143, textureX, textureY); // Box 31
		bodyModel[257] = new ModelRendererTurbo(this, 283, 148, textureX, textureY,"cull"); // Box 475 cull
		bodyModel[258] = new ModelRendererTurbo(this, 283, 153, textureX, textureY); // Box 476
		bodyModel[259] = new ModelRendererTurbo(this, 290, 147, textureX, textureY); // Box 31
		bodyModel[260] = new ModelRendererTurbo(this, 293, 137, textureX, textureY); // Box 325
		bodyModel[261] = new ModelRendererTurbo(this, 341, 75, textureX, textureY); // Box 38
		bodyModel[262] = new ModelRendererTurbo(this, 352, 90, textureX, textureY); // Box 327
		bodyModel[263] = new ModelRendererTurbo(this, 291, 143, textureX, textureY); // Box 38
		bodyModel[264] = new ModelRendererTurbo(this, 288, 153, textureX, textureY); // Box 329
		bodyModel[265] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 2
		bodyModel[266] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 2
		bodyModel[267] = new ModelRendererTurbo(this, 228, 164, textureX, textureY); // Box 41
		bodyModel[268] = new ModelRendererTurbo(this, 228, 162, textureX, textureY); // Box 41
		bodyModel[269] = new ModelRendererTurbo(this, 248, 162, textureX, textureY); // Box 41
		bodyModel[270] = new ModelRendererTurbo(this, 168, 181, textureX, textureY); // Box 38
		bodyModel[271] = new ModelRendererTurbo(this, 158, 180, textureX, textureY); // Box 38
		bodyModel[272] = new ModelRendererTurbo(this, 163, 180, textureX, textureY); // Box 38
		bodyModel[273] = new ModelRendererTurbo(this, 177, 181, textureX, textureY); // Box 38
		bodyModel[274] = new ModelRendererTurbo(this, 132, 178, textureX, textureY); // Box 41
		bodyModel[275] = new ModelRendererTurbo(this, 145, 178, textureX, textureY); // Box 41
		bodyModel[276] = new ModelRendererTurbo(this, 141, 178, textureX, textureY); // Box 41
		bodyModel[277] = new ModelRendererTurbo(this, 154, 178, textureX, textureY); // Box 41
		bodyModel[278] = new ModelRendererTurbo(this, 146, 178, textureX, textureY); // Box 41
		bodyModel[279] = new ModelRendererTurbo(this, 133, 178, textureX, textureY); // Box 41
		bodyModel[280] = new ModelRendererTurbo(this, 195, 169, textureX, textureY); // Box 2
		bodyModel[281] = new ModelRendererTurbo(this, 195, 178, textureX, textureY); // Box 2
		bodyModel[282] = new ModelRendererTurbo(this, 216, 169, textureX, textureY); // Box 2
		bodyModel[283] = new ModelRendererTurbo(this, 216, 178, textureX, textureY); // Box 2
		bodyModel[284] = new ModelRendererTurbo(this, 130, 156, textureX, textureY); // Box 52
		bodyModel[285] = new ModelRendererTurbo(this, 155, 156, textureX, textureY); // Box 52
		bodyModel[286] = new ModelRendererTurbo(this, 173, 156, textureX, textureY); // Box 52
		bodyModel[287] = new ModelRendererTurbo(this, 117, 156, textureX, textureY); // Box 41
		bodyModel[288] = new ModelRendererTurbo(this, 126, 157, textureX, textureY); // Box 41
		bodyModel[289] = new ModelRendererTurbo(this, 118, 157, textureX, textureY); // Box 41
		bodyModel[290] = new ModelRendererTurbo(this, 88, 158, textureX, textureY); // Box 41
		bodyModel[291] = new ModelRendererTurbo(this, 87, 156, textureX, textureY); // Box 41
		bodyModel[292] = new ModelRendererTurbo(this, 115, 156, textureX, textureY); // Box 41
		bodyModel[293] = new ModelRendererTurbo(this, 88, 164, textureX, textureY); // Box 41
		bodyModel[294] = new ModelRendererTurbo(this, 87, 162, textureX, textureY); // Box 41
		bodyModel[295] = new ModelRendererTurbo(this, 115, 162, textureX, textureY); // Box 41
		bodyModel[296] = new ModelRendererTurbo(this, 73, 156, textureX, textureY); // Box 52
		bodyModel[297] = new ModelRendererTurbo(this, 82, 156, textureX, textureY); // Box 52
		bodyModel[298] = new ModelRendererTurbo(this, 182, 178, textureX, textureY); // Box 41
		bodyModel[299] = new ModelRendererTurbo(this, 191, 179, textureX, textureY); // Box 41
		bodyModel[300] = new ModelRendererTurbo(this, 183, 179, textureX, textureY); // Box 41
		bodyModel[301] = new ModelRendererTurbo(this, 118, 180, textureX, textureY); // Box 52
		bodyModel[302] = new ModelRendererTurbo(this, 127, 182, textureX, textureY); // Box 52
		bodyModel[303] = new ModelRendererTurbo(this, 7, 264, textureX, textureY); // Box 38
		bodyModel[304] = new ModelRendererTurbo(this, 1, 292, textureX, textureY); // Box 38
		bodyModel[305] = new ModelRendererTurbo(this, 68, 266, textureX, textureY); // Box 128
		bodyModel[306] = new ModelRendererTurbo(this, 71, 281, textureX, textureY); // Box 128
		bodyModel[307] = new ModelRendererTurbo(this, 60, 273, textureX, textureY); // Box 128
		bodyModel[308] = new ModelRendererTurbo(this, 50, 279, textureX, textureY); // Box 128
		bodyModel[309] = new ModelRendererTurbo(this, 23, 271, textureX, textureY); // Box 128
		bodyModel[310] = new ModelRendererTurbo(this, 117, 271, textureX, textureY); // Box 128
		bodyModel[311] = new ModelRendererTurbo(this, 22, 278, textureX, textureY); // Box 128
		bodyModel[312] = new ModelRendererTurbo(this, 86, 279, textureX, textureY); // Box 128
		bodyModel[313] = new ModelRendererTurbo(this, 39, 269, textureX, textureY); // Box 128
		bodyModel[314] = new ModelRendererTurbo(this, 91, 269, textureX, textureY); // Box 128
		bodyModel[315] = new ModelRendererTurbo(this, 68, 295, textureX, textureY); // Box 358
		bodyModel[316] = new ModelRendererTurbo(this, 71, 310, textureX, textureY); // Box 359
		bodyModel[317] = new ModelRendererTurbo(this, 60, 302, textureX, textureY); // Box 360
		bodyModel[318] = new ModelRendererTurbo(this, 50, 308, textureX, textureY); // Box 361
		bodyModel[319] = new ModelRendererTurbo(this, 23, 300, textureX, textureY); // Box 363
		bodyModel[320] = new ModelRendererTurbo(this, 117, 300, textureX, textureY); // Box 364
		bodyModel[321] = new ModelRendererTurbo(this, 86, 308, textureX, textureY); // Box 368
		bodyModel[322] = new ModelRendererTurbo(this, 98, 304, textureX, textureY); // Box 375
		bodyModel[323] = new ModelRendererTurbo(this, 39, 298, textureX, textureY); // Box 377
		bodyModel[324] = new ModelRendererTurbo(this, 91, 298, textureX, textureY); // Box 378
		bodyModel[325] = new ModelRendererTurbo(this, 65, 310, textureX, textureY); // Box 366
		bodyModel[326] = new ModelRendererTurbo(this, 79, 310, textureX, textureY); // Box 366
		bodyModel[327] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Box 399
		bodyModel[328] = new ModelRendererTurbo(this, 79, 281, textureX, textureY); // Box 400
		bodyModel[329] = new ModelRendererTurbo(this, 91, 295, textureX, textureY); // Box 380
		bodyModel[330] = new ModelRendererTurbo(this, 107, 295, textureX, textureY); // Box 380
		bodyModel[331] = new ModelRendererTurbo(this, 39, 295, textureX, textureY); // Box 380
		bodyModel[332] = new ModelRendererTurbo(this, 55, 295, textureX, textureY); // Box 380
		bodyModel[333] = new ModelRendererTurbo(this, 129, 266, textureX, textureY); // Box 38
		bodyModel[334] = new ModelRendererTurbo(this, 35, 279, textureX, textureY); // Box 128
		bodyModel[335] = new ModelRendererTurbo(this, 22, 307, textureX, textureY); // Box 445
		bodyModel[336] = new ModelRendererTurbo(this, 35, 308, textureX, textureY); // Box 446
		bodyModel[337] = new ModelRendererTurbo(this, 116, 278, textureX, textureY); // Box 128
		bodyModel[338] = new ModelRendererTurbo(this, 101, 279, textureX, textureY); // Box 128
		bodyModel[339] = new ModelRendererTurbo(this, 116, 307, textureX, textureY); // Box 445
		bodyModel[340] = new ModelRendererTurbo(this, 101, 308, textureX, textureY); // Box 446
		bodyModel[341] = new ModelRendererTurbo(this, 127, 290, textureX, textureY); // Box 38
		bodyModel[342] = new ModelRendererTurbo(this, 129, 304, textureX, textureY); // Box 38
		bodyModel[343] = new ModelRendererTurbo(this, 122, 252, textureX, textureY); // Box 38
		bodyModel[344] = new ModelRendererTurbo(this, 1, 230, textureX, textureY); // Box 38
		bodyModel[345] = new ModelRendererTurbo(this, 13, 249, textureX, textureY); // Box 38
		bodyModel[346] = new ModelRendererTurbo(this, 15, 225, textureX, textureY); // Box 276
		bodyModel[347] = new ModelRendererTurbo(this, 96, 295, textureX, textureY); // Box 380
		bodyModel[348] = new ModelRendererTurbo(this, 44, 295, textureX, textureY); // Box 380
		bodyModel[349] = new ModelRendererTurbo(this, 48, 304, textureX, textureY); // Box 375
		bodyModel[350] = new ModelRendererTurbo(this, 98, 275, textureX, textureY); // Box 463
		bodyModel[351] = new ModelRendererTurbo(this, 48, 275, textureX, textureY); // Box 464
		bodyModel[352] = new ModelRendererTurbo(this, 234, 255, textureX, textureY); // Box 38
		bodyModel[353] = new ModelRendererTurbo(this, 232, 288, textureX, textureY); // Box 38
		bodyModel[354] = new ModelRendererTurbo(this, 249, 310, textureX, textureY); // Box 38
		bodyModel[355] = new ModelRendererTurbo(this, 235, 282, textureX, textureY); // Box 38
		bodyModel[356] = new ModelRendererTurbo(this, 292, 296, textureX, textureY); // Box 38
		bodyModel[357] = new ModelRendererTurbo(this, 359, 261, textureX, textureY); // Box 38
		bodyModel[358] = new ModelRendererTurbo(this, 368, 304, textureX, textureY); // Box 38
		bodyModel[359] = new ModelRendererTurbo(this, 321, 261, textureX, textureY); // Box 38
		bodyModel[360] = new ModelRendererTurbo(this, 338, 304, textureX, textureY); // Box 38
		bodyModel[361] = new ModelRendererTurbo(this, 355, 310, textureX, textureY); // Box 38
		bodyModel[362] = new ModelRendererTurbo(this, 346, 267, textureX, textureY); // Box 38
		bodyModel[363] = new ModelRendererTurbo(this, 325, 307, textureX, textureY); // Box 515
		bodyModel[364] = new ModelRendererTurbo(this, 242, 238, textureX, textureY); // Box 38
		bodyModel[365] = new ModelRendererTurbo(this, 247, 257, textureX, textureY); // Box 38
		bodyModel[366] = new ModelRendererTurbo(this, 242, 249, textureX, textureY); // Box 276
		bodyModel[367] = new ModelRendererTurbo(this, 295, 226, textureX, textureY); // Box 38
		bodyModel[368] = new ModelRendererTurbo(this, 309, 221, textureX, textureY); // Box 276
		bodyModel[369] = new ModelRendererTurbo(this, 261, 245, textureX, textureY); // Box 38
		bodyModel[370] = new ModelRendererTurbo(this, 395, 294, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[371] = new ModelRendererTurbo(this, 397, 297, textureX, textureY); // Box 275
		bodyModel[372] = new ModelRendererTurbo(this, 386, 251, textureX, textureY,"lamp"); // Box 485 glow
		bodyModel[373] = new ModelRendererTurbo(this, 388, 254, textureX, textureY); // Box 486
		bodyModel[374] = new ModelRendererTurbo(this, 454, 294, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[375] = new ModelRendererTurbo(this, 456, 297, textureX, textureY); // Box 38
		bodyModel[376] = new ModelRendererTurbo(this, 445, 251, textureX, textureY,"lamp"); // Box 490 glow
		bodyModel[377] = new ModelRendererTurbo(this, 446, 254, textureX, textureY); // Box 491
		bodyModel[378] = new ModelRendererTurbo(this, 473, 294, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[379] = new ModelRendererTurbo(this, 474, 297, textureX, textureY); // Box 38
		bodyModel[380] = new ModelRendererTurbo(this, 464, 251, textureX, textureY,"lamp"); // Box 495 glow
		bodyModel[381] = new ModelRendererTurbo(this, 465, 254, textureX, textureY); // Box 496
		bodyModel[382] = new ModelRendererTurbo(this, 386, 296, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[383] = new ModelRendererTurbo(this, 387, 298, textureX, textureY); // Box 275
		bodyModel[384] = new ModelRendererTurbo(this, 384, 303, textureX, textureY); // Box 275
		bodyModel[385] = new ModelRendererTurbo(this, 377, 254, textureX, textureY,"lamp"); // Box 500 glow
		bodyModel[386] = new ModelRendererTurbo(this, 378, 256, textureX, textureY); // Box 501
		bodyModel[387] = new ModelRendererTurbo(this, 375, 261, textureX, textureY); // Box 502
		bodyModel[388] = new ModelRendererTurbo(this, 482, 291, textureX, textureY,"lamp"); // Box 2 glow
		bodyModel[389] = new ModelRendererTurbo(this, 484, 294, textureX, textureY); // Box 2
		bodyModel[390] = new ModelRendererTurbo(this, 478, 251, textureX, textureY,"lamp"); // Box 506 glow
		bodyModel[391] = new ModelRendererTurbo(this, 480, 254, textureX, textureY); // Box 507
		bodyModel[392] = new ModelRendererTurbo(this, 493, 293, textureX, textureY,"lamp"); // Box 2 glow
		bodyModel[393] = new ModelRendererTurbo(this, 494, 295, textureX, textureY); // Box 2
		bodyModel[394] = new ModelRendererTurbo(this, 489, 251, textureX, textureY,"lamp"); // Box 510 glow
		bodyModel[395] = new ModelRendererTurbo(this, 490, 253, textureX, textureY); // Box 511
		bodyModel[396] = new ModelRendererTurbo(this, 426, 197, textureX, textureY); // Box 526
		bodyModel[397] = new ModelRendererTurbo(this, 429, 188, textureX, textureY); // Box 527
		bodyModel[398] = new ModelRendererTurbo(this, 429, 194, textureX, textureY); // Box 532
		bodyModel[399] = new ModelRendererTurbo(this, 387, 265, textureX, textureY); // Box 526
		bodyModel[400] = new ModelRendererTurbo(this, 390, 256, textureX, textureY); // Box 527
		bodyModel[401] = new ModelRendererTurbo(this, 376, 264, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[402] = new ModelRendererTurbo(this, 390, 262, textureX, textureY); // Box 532
		bodyModel[403] = new ModelRendererTurbo(this, 426, 265, textureX, textureY); // Box 526
		bodyModel[404] = new ModelRendererTurbo(this, 429, 256, textureX, textureY); // Box 527
		bodyModel[405] = new ModelRendererTurbo(this, 429, 262, textureX, textureY); // Box 532
		bodyModel[406] = new ModelRendererTurbo(this, 465, 265, textureX, textureY); // Box 526
		bodyModel[407] = new ModelRendererTurbo(this, 468, 256, textureX, textureY); // Box 527
		bodyModel[408] = new ModelRendererTurbo(this, 468, 262, textureX, textureY); // Box 532
		bodyModel[409] = new ModelRendererTurbo(this, 435, 231, textureX, textureY); // Box 558
		bodyModel[410] = new ModelRendererTurbo(this, 438, 222, textureX, textureY); // Box 559
		bodyModel[411] = new ModelRendererTurbo(this, 438, 228, textureX, textureY); // Box 566
		bodyModel[412] = new ModelRendererTurbo(this, 396, 308, textureX, textureY); // Box 567
		bodyModel[413] = new ModelRendererTurbo(this, 399, 299, textureX, textureY); // Box 568
		bodyModel[414] = new ModelRendererTurbo(this, 399, 305, textureX, textureY); // Box 575
		bodyModel[415] = new ModelRendererTurbo(this, 435, 308, textureX, textureY); // Box 576
		bodyModel[416] = new ModelRendererTurbo(this, 438, 299, textureX, textureY); // Box 577
		bodyModel[417] = new ModelRendererTurbo(this, 438, 305, textureX, textureY); // Box 584
		bodyModel[418] = new ModelRendererTurbo(this, 474, 308, textureX, textureY); // Box 585
		bodyModel[419] = new ModelRendererTurbo(this, 477, 299, textureX, textureY); // Box 586
		bodyModel[420] = new ModelRendererTurbo(this, 477, 305, textureX, textureY); // Box 593
		bodyModel[421] = new ModelRendererTurbo(this, 465, 197, textureX, textureY); // Box 526
		bodyModel[422] = new ModelRendererTurbo(this, 468, 188, textureX, textureY); // Box 527
		bodyModel[423] = new ModelRendererTurbo(this, 474, 196, textureX, textureY,"cull"); // Box 528 cull
		bodyModel[424] = new ModelRendererTurbo(this, 454, 196, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[425] = new ModelRendererTurbo(this, 468, 194, textureX, textureY); // Box 532
		bodyModel[426] = new ModelRendererTurbo(this, 474, 231, textureX, textureY); // Box 621
		bodyModel[427] = new ModelRendererTurbo(this, 477, 222, textureX, textureY); // Box 622
		bodyModel[428] = new ModelRendererTurbo(this, 483, 230, textureX, textureY,"cull"); // Box 623 cull
		bodyModel[429] = new ModelRendererTurbo(this, 463, 230, textureX, textureY,"cull"); // Box 624 cull
		bodyModel[430] = new ModelRendererTurbo(this, 477, 228, textureX, textureY); // Box 629
		bodyModel[431] = new ModelRendererTurbo(this, 493, 186, textureX, textureY); // Box 275
		bodyModel[432] = new ModelRendererTurbo(this, 493, 204, textureX, textureY); // Box 631
		bodyModel[433] = new ModelRendererTurbo(this, 485, 192, textureX, textureY); // Box 275
		bodyModel[434] = new ModelRendererTurbo(this, 473, 162, textureX, textureY); // Box 527
		bodyModel[435] = new ModelRendererTurbo(this, 473, 174, textureX, textureY); // Box 532
		bodyModel[436] = new ModelRendererTurbo(this, 498, 192, textureX, textureY); // Box 275
		bodyModel[437] = new ModelRendererTurbo(this, 490, 174, textureX, textureY); // Box 526
		bodyModel[438] = new ModelRendererTurbo(this, 490, 176, textureX, textureY); // Box 532
		bodyModel[439] = new ModelRendererTurbo(this, 504, 176, textureX, textureY); // Box 574
		bodyModel[440] = new ModelRendererTurbo(this, 455, 222, textureX, textureY); // Right seat part
		bodyModel[441] = new ModelRendererTurbo(this, 457, 226, textureX, textureY); // Right seat part
		bodyModel[442] = new ModelRendererTurbo(this, 455, 234, textureX, textureY); // Right seat part
		bodyModel[443] = new ModelRendererTurbo(this, 494, 299, textureX, textureY); // Right seat part
		bodyModel[444] = new ModelRendererTurbo(this, 496, 303, textureX, textureY); // Right seat part
		bodyModel[445] = new ModelRendererTurbo(this, 494, 311, textureX, textureY); // Right seat part
		bodyModel[446] = new ModelRendererTurbo(this, 446, 256, textureX, textureY); // Right seat part
		bodyModel[447] = new ModelRendererTurbo(this, 448, 260, textureX, textureY); // Right seat part
		bodyModel[448] = new ModelRendererTurbo(this, 446, 268, textureX, textureY); // Right seat part
		bodyModel[449] = new ModelRendererTurbo(this, 417, 299, textureX, textureY); // Right seat part
		bodyModel[450] = new ModelRendererTurbo(this, 419, 303, textureX, textureY); // Right seat part
		bodyModel[451] = new ModelRendererTurbo(this, 417, 311, textureX, textureY); // Right seat part
		bodyModel[452] = new ModelRendererTurbo(this, 319, 287, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[453] = new ModelRendererTurbo(this, 247, 330, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[454] = new ModelRendererTurbo(this, 240, 330, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[455] = new ModelRendererTurbo(this, 71, 260, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[456] = new ModelRendererTurbo(this, 71, 318, textureX, textureY,"lamp"); // Box 592 glow
		bodyModel[457] = new ModelRendererTurbo(this, 70, 324, textureX, textureY); // Box 593
		bodyModel[458] = new ModelRendererTurbo(this, 362, 288, textureX, textureY); // Box 38
		bodyModel[459] = new ModelRendererTurbo(this, 352, 288, textureX, textureY); // Box 38
		bodyModel[460] = new ModelRendererTurbo(this, 357, 288, textureX, textureY); // Box 38
		bodyModel[461] = new ModelRendererTurbo(this, 353, 245, textureX, textureY); // Box 38
		bodyModel[462] = new ModelRendererTurbo(this, 343, 245, textureX, textureY); // Box 38
		bodyModel[463] = new ModelRendererTurbo(this, 348, 245, textureX, textureY); // Box 38
		bodyModel[464] = new ModelRendererTurbo(this, 355, 297, textureX, textureY); // Box 38
		bodyModel[465] = new ModelRendererTurbo(this, 358, 302, textureX, textureY); // Box 38
		bodyModel[466] = new ModelRendererTurbo(this, 357, 306, textureX, textureY); // Box 38
		bodyModel[467] = new ModelRendererTurbo(this, 346, 254, textureX, textureY); // Box 38
		bodyModel[468] = new ModelRendererTurbo(this, 349, 259, textureX, textureY); // Box 38
		bodyModel[469] = new ModelRendererTurbo(this, 348, 263, textureX, textureY); // Box 38
		bodyModel[470] = new ModelRendererTurbo(this, 58, 329, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[471] = new ModelRendererTurbo(this, 58, 250, textureX, textureY,"lamp"); // Box 623 glow
		bodyModel[472] = new ModelRendererTurbo(this, 193, 308, textureX, textureY); // Box 128
		bodyModel[473] = new ModelRendererTurbo(this, 157, 290, textureX, textureY); // Box 128
		bodyModel[474] = new ModelRendererTurbo(this, 177, 290, textureX, textureY); // Box 128
		bodyModel[475] = new ModelRendererTurbo(this, 154, 257, textureX, textureY); // Box 128
		bodyModel[476] = new ModelRendererTurbo(this, 193, 298, textureX, textureY); // Box 128
		bodyModel[477] = new ModelRendererTurbo(this, 157, 272, textureX, textureY); // Box 128
		bodyModel[478] = new ModelRendererTurbo(this, 180, 296, textureX, textureY); // Box 128
		bodyModel[479] = new ModelRendererTurbo(this, 154, 271, textureX, textureY); // Box 128
		bodyModel[480] = new ModelRendererTurbo(this, 181, 307, textureX, textureY); // Box 128
		bodyModel[481] = new ModelRendererTurbo(this, 164, 307, textureX, textureY); // Box 128
		bodyModel[482] = new ModelRendererTurbo(this, 180, 317, textureX, textureY); // Box 128
		bodyModel[483] = new ModelRendererTurbo(this, 163, 318, textureX, textureY); // Box 128
		bodyModel[484] = new ModelRendererTurbo(this, 173, 307, textureX, textureY); // Box 128
		bodyModel[485] = new ModelRendererTurbo(this, 158, 307, textureX, textureY); // Box 128
		bodyModel[486] = new ModelRendererTurbo(this, 176, 300, textureX, textureY); // Box 128
		bodyModel[487] = new ModelRendererTurbo(this, 159, 302, textureX, textureY); // Box 128
		bodyModel[488] = new ModelRendererTurbo(this, 185, 267, textureX, textureY); // Box 128
		bodyModel[489] = new ModelRendererTurbo(this, 178, 281, textureX, textureY); // Box 128
		bodyModel[490] = new ModelRendererTurbo(this, 172, 268, textureX, textureY); // Box 128
		bodyModel[491] = new ModelRendererTurbo(this, 195, 249, textureX, textureY); // Box 128
		bodyModel[492] = new ModelRendererTurbo(this, 197, 258, textureX, textureY); // Box 128
		bodyModel[493] = new ModelRendererTurbo(this, 192, 258, textureX, textureY); // Box 128
		bodyModel[494] = new ModelRendererTurbo(this, 204, 258, textureX, textureY); // Box 128
		bodyModel[495] = new ModelRendererTurbo(this, 209, 259, textureX, textureY); // Box 128
		bodyModel[496] = new ModelRendererTurbo(this, 230, 285, textureX, textureY); // swing door left
		bodyModel[497] = new ModelRendererTurbo(this, 230, 276, textureX, textureY); // swing door right
		bodyModel[498] = new ModelRendererTurbo(this, 227, 317, textureX, textureY); // Box 128
		bodyModel[499] = new ModelRendererTurbo(this, 230, 330, textureX, textureY); // Box 128

		bodyModel[0].addBox(0F, 0F, 0F, 104, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-56.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(-61.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(-60.5F, 1F, -5F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[3].setRotationPoint(60.5F, 3F, -1.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[4].setRotationPoint(56.5F, 3F, -3F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[5].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[6].setRotationPoint(-60.5F, 3F, -4F);

		bodyModel[7].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[7].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[8].setRotationPoint(43F, 4F, -1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[9].setRotationPoint(-45F, 4F, -1F);

		bodyModel[10].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[10].setRotationPoint(-56.5F, 1F, -10.99F);

		bodyModel[11].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[11].setRotationPoint(-56.5F, 1F, 4.99F);

		bodyModel[12].addShapeBox(-4F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[12].setRotationPoint(-56.49F, -14F, -10.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 104, 16, 1, 0F); // Box 38
		bodyModel[13].setRotationPoint(-56.5F, -15F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 57, 16, 1, 0F); // Box 128
		bodyModel[14].setRotationPoint(-56.5F, -15F, 10F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[15].setRotationPoint(-56.5F, -15F, -10F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[16].setRotationPoint(-56.5F, -15F, 3F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[17].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[18].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[19].addShapeBox(-4F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[19].setRotationPoint(-56.49F, -14F, 10.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[20].setRotationPoint(-56.5F, -15F, -3F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[21].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[22].setRotationPoint(-60.5F, -15F, -11F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[23].setRotationPoint(-60.5F, -15F, 10F);

		bodyModel[24].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[24].setRotationPoint(-55.49F, -14F, -3F);

		bodyModel[25].addBox(0F, 0F, 0F, 109, 2, 6, 0F); // Box 128
		bodyModel[25].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[26].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 109, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[27].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[28].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 109, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[29].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[30].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[31].setRotationPoint(-61.5F, -19F, 3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 109, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[32].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 109, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[33].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate closed
		bodyModel[34].setRotationPoint(-61.5F, -7F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate open
		bodyModel[35].setRotationPoint(-61.5F, -7F, 2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[36].setRotationPoint(-61.5F, -17F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[37].setRotationPoint(-61.5F, -18F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 176
		bodyModel[38].setRotationPoint(-61.5F, -18F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[39].setRotationPoint(-61.5F, -16.25F, -10F);

		bodyModel[40].addBox(0F, 0F, 0F, 109, 1, 14, 0F); // Box 128
		bodyModel[40].setRotationPoint(-61.5F, -18F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[41].setRotationPoint(-61.5F, 3F, 10.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[42].setRotationPoint(-61.5F, 4F, 10.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[43].setRotationPoint(-56.5F, 4F, 10.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[44].setRotationPoint(-53.25F, 3F, 10.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[45].setRotationPoint(-55F, 4F, 10.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[46].setRotationPoint(34.75F, 3F, 10.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[47].setRotationPoint(33F, 4F, 10.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[48].setRotationPoint(-35.75F, 3F, 10.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[49].setRotationPoint(-35F, 4F, 10.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull
		bodyModel[50].setRotationPoint(-34.5F, 3F, 10.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull
		bodyModel[51].setRotationPoint(-33.5F, 4F, 10.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[52].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[53].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[54].setRotationPoint(-56.5F, 4F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.2F, 0F, 0F, -0.5F, -0.75F, 0F, -0.15F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.2F, -0.75F, 0F, -0.35F); // Box 28
		bodyModel[55].setRotationPoint(52.25F, 3F, -9.8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.1F, 0F, 0F, -0.5F, -1F, 0F, -0.8F, -0.5F, 0F, -0.9F, -0.5F, 0F, 0.4F, -1F, 0F, 0.3F); // Box 29
		bodyModel[56].setRotationPoint(53F, 4F, -9.65F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.05F, 0F, 0F, -0.5F); // Box 31 cull
		bodyModel[57].setRotationPoint(53.5F, 3F, -9.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[58].setRotationPoint(-53.25F, 3F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[59].setRotationPoint(-55F, 4F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[60].setRotationPoint(34.75F, 3F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[61].setRotationPoint(33F, 4F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[62].setRotationPoint(-35.75F, 3F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[63].setRotationPoint(-35F, 4F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[64].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[65].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[66].setRotationPoint(-56.5F, 3F, 10.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[67].setRotationPoint(-56.5F, 3F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[68].setRotationPoint(-63F, -15F, -4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[69].setRotationPoint(-63F, 1F, -4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[70].setRotationPoint(-63F, -14F, -4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[71].setRotationPoint(-63F, -14F, 3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[72].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[73].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[74].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[75].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[76].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 153
		bodyModel[77].setRotationPoint(-63.5F, -16F, 1.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[78].setRotationPoint(-63.5F, -16F, -1.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 103, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F); // Box 128
		bodyModel[79].setRotationPoint(-55.5F, -16F, -10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 103, 1, 3, 0F,0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[80].setRotationPoint(-55.5F, -16F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 103, 1, 2, 0F,0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[81].setRotationPoint(-55.5F, -18F, -9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 103, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[82].setRotationPoint(-55.5F, -18F, 6.7F);

		bodyModel[83].addBox(0F, 0F, 0F, 8, 2, 18, 0F); // Box 2
		bodyModel[83].setRotationPoint(47.5F, 1F, -9F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[84].setRotationPoint(47.5F, 1F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, -0.55F, 0F, 1.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.55F, 0F, 1.85F, 0F, 0F, 0F); // Box 38
		bodyModel[85].setRotationPoint(47.5F, -15F, -11F);

		bodyModel[86].addBox(0F, 0F, 0F, 3, 2, 12, 0F); // Box 2
		bodyModel[86].setRotationPoint(55.5F, 1F, -6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[87].setRotationPoint(55.5F, 1F, -9F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 2
		bodyModel[88].setRotationPoint(58.5F, 1F, -2F);

		bodyModel[89].addShapeBox(0F, 0F, -5F, 1, 11, 3, 0F,0F, -0.01F, -1.01F, -0.5F, -0.01F, -1.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear end door part
		bodyModel[89].setRotationPoint(60F, -10F, 2F);

		bodyModel[90].addShapeBox(0F, 0F, -3F, 1, 11, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Rear end door part
		bodyModel[90].setRotationPoint(60F, -10F, 2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[91].setRotationPoint(60.5F, 1F, -2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[92].setRotationPoint(58.5F, 1F, -6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 161
		bodyModel[93].setRotationPoint(55.5F, 1F, 6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[94].setRotationPoint(60.5F, 1F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[95].setRotationPoint(58.5F, 1F, 2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,-0.3F, 0F, -0.55F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -0.3F, 0F, -0.55F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 2
		bodyModel[96].setRotationPoint(57.5F, -15F, -6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		bodyModel[97].setRotationPoint(59.5F, -15F, -2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[98].setRotationPoint(59.5F, -15F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,-0.55F, 0F, -0.15F, 0.55F, 0F, -3.15F, -0.15F, 0F, 2.7F, 0F, 0F, 0F, -0.55F, 0F, -0.15F, 0.55F, 0F, -3.15F, -0.15F, 0F, 2.7F, 0F, 0F, 0F); // Box 38
		bodyModel[99].setRotationPoint(54.95F, -15F, -9.15F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 174
		bodyModel[100].setRotationPoint(47.5F, 1F, 9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 0F, 0F, -0.55F, 0F, 1.85F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 1.85F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 175
		bodyModel[101].setRotationPoint(47.5F, -15F, 10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.55F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.55F); // Box 176
		bodyModel[102].setRotationPoint(57.5F, -15F, 2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, -0.15F, 0F, 2.7F, 0.55F, 0F, -3.15F, -0.55F, 0F, -0.15F, 0F, 0F, 0F, -0.15F, 0F, 2.7F, 0.55F, 0F, -3.15F, -0.55F, 0F, -0.15F); // Box 177
		bodyModel[103].setRotationPoint(54.95F, -15F, 8.15F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, -0.55F, 1.25F, 0.85F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -0.55F, 0F, 0.85F, 0F, 0F, -1F); // Box 38
		bodyModel[104].setRotationPoint(47.5F, -16F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.55F, -1F, -0.15F, 0.55F, -1F, -3.15F, -0.15F, 1.25F, 1.7F, 0F, 1.25F, -1F, -0.55F, 0F, -0.15F, 0.55F, 0F, -3.15F, -0.15F, 0F, 1.7F, 0F, 0F, -1F); // Box 38
		bodyModel[105].setRotationPoint(54.95F, -16F, -9.15F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.3F, 1.25F, -0.55F, -1F, -1F, 0F, 1F, -1F, 0F, -2F, 1.25F, 0F, -0.3F, 0F, -0.55F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 2
		bodyModel[106].setRotationPoint(57.5F, -16F, -6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 1.25F, -1F, -0.55F, 1.25F, 0.85F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, -0.55F, 0F, 0.85F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 182
		bodyModel[107].setRotationPoint(47.5F, -16F, 9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 1.25F, -1F, -0.15F, 1.25F, 1.7F, 0.55F, -1F, -3.15F, -0.55F, -1F, -0.15F, 0F, 0F, -1F, -0.15F, 0F, 1.7F, 0.55F, 0F, -3.15F, -0.55F, 0F, -0.15F); // Box 183
		bodyModel[108].setRotationPoint(54.95F, -16F, 7.15F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2F, 1.25F, 0F, 1F, -1F, 0F, -1F, -1F, 0F, -0.3F, 1.25F, -0.55F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, -0.55F); // Box 184
		bodyModel[109].setRotationPoint(57.5F, -16F, 2F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -1.75F, 0F, -0.55F, -1.75F, -1.85F, -2.2F, 0F, 1.35F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.55F, 1.75F, -1.85F, -2.2F, 0F, 1.35F, 0F, 0F, 0F); // Box 128
		bodyModel[110].setRotationPoint(47.5F, -19F, -10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, -2.2F, 0F, 1.35F, -0.55F, -1.75F, -1.85F, 0F, -1.75F, 0F, 0F, 0F, 0F, -2.2F, 0F, 1.35F, -0.55F, 1.75F, -1.85F, 0F, 1.75F, 0F); // Box 188
		bodyModel[111].setRotationPoint(47.5F, -19F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2.2F, -1.75F, 2.35F, 2.05F, -1.75F, -0.35F, -0.4F, 0F, -0.75F, -0.55F, 0F, -2.85F, -2.2F, 1.75F, 2.35F, 2.05F, 1.75F, -0.35F, -0.4F, 0F, -0.75F, -0.55F, 0F, -2.85F); // Box 128
		bodyModel[112].setRotationPoint(52.75F, -19F, -5.8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.55F, 0F, -2.85F, -0.4F, 0F, -0.75F, 2.05F, -1.75F, -0.35F, -2.2F, -1.75F, 2.35F, -0.55F, 0F, -2.85F, -0.4F, 0F, -0.75F, 2.05F, 1.75F, -0.35F, -2.2F, 1.75F, 2.35F); // Box 191
		bodyModel[113].setRotationPoint(52.75F, -19F, 2.8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-0.4F, 0F, -0.75F, -0.9F, 0F, -4.2F, -3.9F, 1.75F, 0.2F, 2.05F, 1.75F, -1.35F, -0.4F, 0F, -0.75F, -0.9F, 0F, -4.2F, -3.9F, -1.75F, 0.2F, 2.05F, -1.75F, -1.35F); // Box 128
		bodyModel[114].setRotationPoint(57.4F, -17.25F, -6.2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,2.05F, 1.75F, -1.35F, -3.9F, 1.75F, 0.2F, -0.9F, 0F, -4.2F, -0.4F, 0F, -0.75F, 2.05F, -1.75F, -1.35F, -3.9F, -1.75F, 0.2F, -0.9F, 0F, -4.2F, -0.4F, 0F, -0.75F); // Box 196
		bodyModel[115].setRotationPoint(57.4F, -17.25F, 2.2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0.5F, 1.75F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[116].setRotationPoint(56.5F, -19F, -2F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, 0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[117].setRotationPoint(56.5F, -19F, 0F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 128
		bodyModel[118].setRotationPoint(47.5F, -20F, -2.3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.35F, 0F, -0.7F, -0.35F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.35F, 0F, -0.7F, -0.35F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 128
		bodyModel[119].setRotationPoint(47.5F, -20F, -3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, 0F, -0.35F, 0F, -4.7F, -0.35F, 0F, 0.7F, 0F, 0F, 0F, 0F, 1F, 0F, -0.35F, 0F, -4.7F, -0.35F, 0F, 0.7F, 0F, 0F, 0F); // Box 128
		bodyModel[120].setRotationPoint(47.5F, -20F, -7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0.7F, -0.2F, 0F, -0.65F, -2.35F, 1F, 0F, 0F, 0F, -4.7F, 0F, 0F, 0.7F, -0.2F, 0F, -0.65F, -2.35F, -1F, 0F, 0F, 0F, -4.7F); // Box 128
		bodyModel[121].setRotationPoint(47.5F, -19F, -6.3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.7F, 0F, 0F, 0F); // Box 205
		bodyModel[122].setRotationPoint(47.5F, -20F, 2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.4F, 0F, 0.7F, -0.35F, 0F, -4.7F, 0F, -1F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0.7F, -0.35F, 0F, -4.7F, 0F, 1F, 0F); // Box 206
		bodyModel[123].setRotationPoint(47.5F, -20F, 3F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, -4.7F, -2.35F, 1F, 0F, -0.2F, 0F, -0.65F, 0F, 0F, 0.7F, 0F, 0F, -4.7F, -2.35F, -1F, 0F, -0.2F, 0F, -0.65F, 0F, 0F, 0.7F); // Box 207
		bodyModel[124].setRotationPoint(47.5F, -19F, 2.3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.95F, 0F, 0F, -0.45F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.45F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 128
		bodyModel[125].setRotationPoint(51.15F, -20F, -1.1F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.05F, 0F, -1.2F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.05F, 0F, -1.2F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 128
		bodyModel[126].setRotationPoint(51.15F, -20F, -2.3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -1.2F, 0F, 0F, 0F); // Box 214
		bodyModel[127].setRotationPoint(51.15F, -20F, 1.3F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2.15F, -1F, 0F, 2.2F, -1F, -2.1F, -0.95F, 0F, 0.55F, 0F, 0F, -0.65F, -2.15F, 1F, 0F, 2.2F, 1F, -2.1F, -0.95F, 0F, 0.55F, 0F, 0F, -0.65F); // Box 128
		bodyModel[128].setRotationPoint(51.15F, -20F, -5.65F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -0.65F, -0.95F, 0F, 0.55F, 2.2F, -1F, -2.1F, -2.15F, -1F, 0F, 0F, 0F, -0.65F, -0.95F, 0F, 0.55F, 2.2F, 1F, -2.1F, -2.15F, 1F, 0F); // Box 220
		bodyModel[129].setRotationPoint(51.15F, -20F, 1.65F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.95F, 0F, 0.55F, 0.1F, 0F, -1F, -4.2F, 1F, -2.1F, 2.2F, 1F, -2.1F, -0.95F, 0F, 0.55F, 0.1F, 0F, -1F, -4.2F, -1F, -2.1F, 2.2F, -1F, -2.1F); // Box 128
		bodyModel[130].setRotationPoint(54.4F, -19F, -3F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,2.2F, 1F, -2.1F, -4.2F, 1F, -2.1F, 0.1F, 0F, -1F, -0.95F, 0F, 0.55F, 2.2F, -1F, -2.1F, -4.2F, -1F, -2.1F, 0.1F, 0F, -1F, -0.95F, 0F, 0.55F); // Box 222
		bodyModel[131].setRotationPoint(54.4F, -19F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-4.2F, -1F, -2.1F, 2.7F, -1F, -4.1F, -1.6F, 0F, 0.1F, 0.1F, 0F, -1F, -4.2F, 1F, -2.1F, 2.7F, 1F, -4.1F, -1.6F, 0F, 0.1F, 0.1F, 0F, -1F); // Box 128
		bodyModel[132].setRotationPoint(52.3F, -20F, -4.1F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.1F, 0F, -1F, -1.6F, 0F, 0.1F, 2.7F, -1F, -4.1F, -4.2F, -1F, -2.1F, 0.1F, 0F, -1F, -1.6F, 0F, 0.1F, 2.7F, 1F, -4.1F, -4.2F, 1F, -2.1F); // Box 224
		bodyModel[133].setRotationPoint(52.3F, -20F, 0.0999999999999996F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, -0.4F, 0F, 2.3F, 0.3F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, -3F, -0.4F, 0F, 2.3F, 0.3F, 0F, -0.55F); // Box 31
		bodyModel[134].setRotationPoint(55.5F, 3F, -9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, -0.4F, 0F, 2.3F, 0.3F, 0F, -0.55F, 0.25F, 0F, -0.4F, -0.4F, 0F, -3.3F, -0.8F, 0F, 2.6F, 0.55F, 0F, -0.15F); // Box 31
		bodyModel[135].setRotationPoint(55.5F, 4F, -9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.3F, 0F, -0.55F, -0.4F, 0F, 2.3F, 0F, 0F, -3F, 0F, 0F, 0F, 0.3F, 0F, -0.55F, -0.4F, 0F, 2.3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 228
		bodyModel[136].setRotationPoint(55.5F, 3F, 8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.3F, 0F, -0.55F, -0.4F, 0F, 2.3F, 0F, 0F, -3F, 0F, 0F, 0F, 0.55F, 0F, -0.15F, -0.8F, 0F, 2.6F, -0.4F, 0F, -3.3F, 0.25F, 0F, -0.4F); // Box 229
		bodyModel[137].setRotationPoint(55.5F, 4F, 8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.9F, 0F, -0.3F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.3F, 0F, -0.6F, -1.9F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[138].setRotationPoint(59F, 4F, -6F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.1F, 0F, -0.3F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.1F, 0F, -0.3F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 31
		bodyModel[139].setRotationPoint(58F, 3F, -6F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.9F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.9F, 0F, -0.3F, 1.3F, 0F, -0.6F); // Box 232
		bodyModel[140].setRotationPoint(59F, 4F, 3F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, -0.3F, -1.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, -0.3F); // Box 233
		bodyModel[141].setRotationPoint(58F, 3F, 3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, -0.3F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.65F, -0.55F, 0F, 0.1F, 0F, 0F, 0F); // Box 30 cull
		bodyModel[142].setRotationPoint(54.5F, 4F, -9.25F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.3F, 0F, 0F, 0F, -0.75F, 0F, -0.35F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.3F, -0.75F, 0F, -0.15F); // Box 235
		bodyModel[143].setRotationPoint(52.25F, 3F, 8.8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.4F, 0F, 0F, 0F, -1F, 0F, 0.3F, -0.5F, 0F, 0.4F, -0.5F, 0F, -0.9F, -1F, 0F, -0.8F); // Box 236
		bodyModel[144].setRotationPoint(53F, 4F, 8.65F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.3F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 237
		bodyModel[145].setRotationPoint(53.5F, 3F, 8.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0.1F, -0.25F, 0F, -0.65F, 0F, 0F, -0.5F); // Box 238
		bodyModel[146].setRotationPoint(54.5F, 4F, 8.25F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		bodyModel[147].setRotationPoint(60.5F, 1F, -2F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[148].setRotationPoint(60.5F, 1F, 0F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[149].setRotationPoint(59.5F, 1F, -4F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[150].setRotationPoint(59.5F, 1F, 2F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -1F, 0F, -0.35F, 0F, -4.7F, -0.35F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -4.7F, -0.35F, 0F, 0.7F, 0F, 0F, 0F); // Box 128
		bodyModel[151].setRotationPoint(47.5F, -19F, -7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0.7F, -0.2F, 0F, -0.65F, -2.35F, 1F, 0F, 0F, 0F, -4.7F, 0F, -1F, 0.7F, -0.2F, -1F, -0.65F, -2.35F, -1F, 0F, 0F, -1F, -4.7F); // Box 128
		bodyModel[152].setRotationPoint(47.5F, -18F, -6.3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-2.15F, -1F, 0F, 2.2F, -1F, -2.1F, -0.95F, 0F, 0.55F, 0F, 0F, -0.65F, -2.15F, 0F, 0F, 2.2F, 0F, -2.1F, -0.95F, 0F, 0.55F, 0F, 0F, -0.65F); // Box 128
		bodyModel[153].setRotationPoint(51.15F, -19F, -5.65F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.95F, 0F, 0.55F, 0.1F, 0F, -1F, -4.2F, 1F, -2.1F, 2.2F, 1F, -2.1F, -0.95F, -1F, 0.55F, 0.1F, -1F, -1F, -4.2F, -1F, -2.1F, 2.2F, -1F, -2.1F); // Box 128
		bodyModel[154].setRotationPoint(54.4F, -18F, -3F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-4.2F, -1F, -2.1F, 2.7F, -1F, -4.1F, -1.6F, 0F, 0.1F, 0.1F, 0F, -1F, -4.2F, 0F, -2.1F, 2.7F, 0F, -4.1F, -1.6F, 0F, 0.1F, 0.1F, 0F, -1F); // Box 128
		bodyModel[155].setRotationPoint(52.3F, -19F, -4.1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -0.35F, 0F, 0.7F, -0.35F, 0F, -4.7F, 0F, -1F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0.7F, -0.35F, 0F, -4.7F, 0F, 0F, 0F); // Box 248
		bodyModel[156].setRotationPoint(47.5F, -19F, 3F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -4.7F, -2.35F, 1F, 0F, -0.2F, 0F, -0.65F, 0F, 0F, 0.7F, 0F, -1F, -4.7F, -2.35F, -1F, 0F, -0.2F, -1F, -0.65F, 0F, -1F, 0.7F); // Box 249
		bodyModel[157].setRotationPoint(47.5F, -18F, 2.3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -0.65F, -0.95F, 0F, 0.55F, 2.2F, -1F, -2.1F, -2.15F, -1F, 0F, 0F, 0F, -0.65F, -0.95F, 0F, 0.55F, 2.2F, 0F, -2.1F, -2.15F, 0F, 0F); // Box 250
		bodyModel[158].setRotationPoint(51.15F, -19F, 1.65F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,2.2F, 1F, -2.1F, -4.2F, 1F, -2.1F, 0.1F, 0F, -1F, -0.95F, 0F, 0.55F, 2.2F, -1F, -2.1F, -4.2F, -1F, -2.1F, 0.1F, -1F, -1F, -0.95F, -1F, 0.55F); // Box 251
		bodyModel[159].setRotationPoint(54.4F, -18F, -1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.1F, 0F, -1F, -1.6F, 0F, 0.1F, 2.7F, -1F, -4.1F, -4.2F, -1F, -2.1F, 0.1F, 0F, -1F, -1.6F, 0F, 0.1F, 2.7F, 0F, -4.1F, -4.2F, 0F, -2.1F); // Box 252
		bodyModel[160].setRotationPoint(52.3F, -19F, 0.0999999999999996F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -1F, -0.3F, 0.75F, -1F, -1.9F, -0.2F, 0F, 1.35F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.75F, 0F, -1.9F, -0.2F, 0F, 1.35F, 0F, 0F, 0F); // Box 128
		bodyModel[161].setRotationPoint(47.5F, -18F, -9F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, -0.2F, 0F, 1.35F, 0.75F, -1F, -1.9F, 0F, -1F, -0.3F, 0F, 0F, 0F, -0.2F, 0F, 1.35F, 0.75F, 0F, -1.9F, 0F, 0F, -0.3F); // Box 254
		bodyModel[162].setRotationPoint(47.5F, -18F, 7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.2F, -1F, 1.35F, -0.3F, -1F, -1.1F, -1.7F, 0F, 0.2F, 0.75F, 0F, -1.9F, -0.2F, 0F, 1.35F, -0.3F, 0F, -1.1F, -1.7F, 0F, 0.2F, 0.75F, 0F, -1.9F); // Box 128
		bodyModel[163].setRotationPoint(54.05F, -18F, -5.75F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0.75F, 0F, -1.9F, -1.7F, 0F, 0.2F, -0.3F, -1F, -1.1F, -0.2F, -1F, 1.35F, 0.75F, 0F, -1.9F, -1.7F, 0F, 0.2F, -0.3F, 0F, -1.1F, -0.2F, 0F, 1.35F); // Box 256
		bodyModel[164].setRotationPoint(54.05F, -18F, 3.75F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, 0F, 0F, -0.8F, -1F, 0F, -0.3F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[165].setRotationPoint(57F, -18F, -2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.3F, -1F, 0F, -0.8F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F); // Box 258
		bodyModel[166].setRotationPoint(57F, -18F, 0F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1.15F, 0F, -0.45F, -1.75F, -1F, 0.65F, -0.3F, -1F, 0F, 0F, 0F, 0F, 1.15F, 0F, -0.45F, -1.75F, 0F, 0.65F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[167].setRotationPoint(56.5F, -18F, -4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.3F, -1F, 0F, -1.75F, -1F, 0.65F, 1.15F, 0F, -0.45F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1.75F, 0F, 0.65F, 1.15F, 0F, -0.45F); // Box 260
		bodyModel[168].setRotationPoint(56.5F, -18F, 2F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0.25F, 0F, -0.55F, 0.25F, -1.85F, -1.3F, 1F, -0.05F, 0F, 1F, -1.7F, 0F, 0F, 0F, -0.55F, 0F, -1.85F, -1.85F, -2F, 0.8F, 0F, -2F, -0.65F); // Box 128
		bodyModel[169].setRotationPoint(47.5F, -16F, -10F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 1F, -1.7F, -1.3F, 1F, -0.05F, -0.55F, 0.25F, -1.85F, 0F, 0.25F, 0F, 0F, -2F, -0.65F, -1.85F, -2F, 0.85F, -0.55F, 0F, -1.85F, 0F, 0F, 0F); // Box 269
		bodyModel[170].setRotationPoint(47.5F, -16F, 7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.25F, 0F, -0.15F, 0.25F, -2.7F, -1.2F, 1F, 0.5F, 0.75F, 1F, -1.9F, 0F, 0F, 0F, -0.15F, 0F, -2.7F, -2.1F, -2F, 1.2F, 1.3F, -2F, -1.05F); // Box 128
		bodyModel[171].setRotationPoint(54.95F, -16F, -8.15F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.75F, 1F, -1.9F, -1.2F, 1F, 0.5F, -0.15F, 0.25F, -2.7F, 0F, 0.25F, 0F, 1.3F, -2F, -1F, -2.1F, -2F, 1.2F, -0.15F, 0F, -2.7F, 0F, 0F, 0F); // Box 272
		bodyModel[172].setRotationPoint(54.95F, -16F, 5.15F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-1.95F, 1F, -0.8F, 0F, 0.25F, 0F, 1.7F, 0.25F, -0.55F, -3.5F, 1F, -0.25F, -1.05F, -2F, -1.5F, 0F, 0F, 0F, 1.7F, 0F, -0.55F, -2.45F, -2F, -0.05F); // Box 128
		bodyModel[173].setRotationPoint(54.8F, -16F, -5.45F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-3.5F, 1F, -0.25F, 1.7F, 0.25F, -0.55F, 0F, 0.25F, 0F, -1.95F, 1F, -0.8F, -2.45F, -2F, -0.05F, 1.7F, 0F, -0.55F, 0F, 0F, 0F, -1.05F, -2F, -1.5F); // Box 274
		bodyModel[174].setRotationPoint(54.8F, -16F, 1.45F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1.3F, 1F, -0.3F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -1.7F, 1F, 0F, -0.25F, -2F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.65F, -2F, 0F); // Box 128
		bodyModel[175].setRotationPoint(57F, -16F, -2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1.7F, 1F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1.3F, 1F, -0.3F, -0.65F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -2F, -0.5F); // Box 276
		bodyModel[176].setRotationPoint(57F, -16F, 0F);

		bodyModel[177].addBox(0F, 0F, 0F, 43, 16, 1, 0F); // Box 128
		bodyModel[177].setRotationPoint(4.5F, -15F, 10F);

		bodyModel[178].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 128
		bodyModel[178].setRotationPoint(0.5F, -15F, 10F);

		bodyModel[179].addBox(-4F, 0F, 0F, 4, 14, 1, 0F); // Right side loading door
		bodyModel[179].setRotationPoint(4.5F, -13F, 10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[180].setRotationPoint(-63.5F, -15F, -11F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[181].setRotationPoint(-63F, -15F, -11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[182].setRotationPoint(-63.5F, -16F, -11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[183].setRotationPoint(-63F, -15F, -11F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[184].setRotationPoint(-63.5F, 1F, -10F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[185].setRotationPoint(-63.5F, -19F, -10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[186].setRotationPoint(-63F, -19F, -10F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[187].setRotationPoint(-63.5F, -19.5F, -7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[188].setRotationPoint(-63F, -20F, -7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[189].setRotationPoint(-63.5F, -20F, -3F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[190].setRotationPoint(-63F, -20F, -3F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[191].setRotationPoint(-63.5F, -20F, -5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[192].setRotationPoint(-63.5F, -15F, 10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[193].setRotationPoint(-63F, -15F, 11F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[194].setRotationPoint(-63.5F, -16F, 9F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[195].setRotationPoint(-63F, -15F, 9F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[196].setRotationPoint(-63.5F, -19F, 7F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[197].setRotationPoint(-63F, -19F, 7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 253
		bodyModel[198].setRotationPoint(-63.5F, -19.5F, 5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[199].setRotationPoint(-63F, -20F, 3F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[200].setRotationPoint(-63.5F, -20F, 3F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 475 cull
		bodyModel[201].setRotationPoint(0.5F, 3F, 10.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 476
		bodyModel[202].setRotationPoint(0.5F, 4.5F, 10.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[203].setRotationPoint(-61F, -6F, -12F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[204].setRotationPoint(-56F, -6F, -12F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[205].setRotationPoint(-61F, -6F, 11F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[206].setRotationPoint(-56F, -6F, 11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[207].setRotationPoint(0F, -6F, 11F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[208].setRotationPoint(5F, -6F, 11F);

		bodyModel[209].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 264
		bodyModel[209].setRotationPoint(4.5F, -19.75F, -4.85F);
		bodyModel[209].rotateAngleY = -0.78539816F;

		bodyModel[210].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F); // Box 264
		bodyModel[210].setRotationPoint(4.5F, -20.4F, -4.85F);
		bodyModel[210].rotateAngleY = -0.78539816F;

		bodyModel[211].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 264
		bodyModel[211].setRotationPoint(4.5F, -20.9F, -4.85F);
		bodyModel[211].rotateAngleY = -0.78539816F;

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 264
		bodyModel[212].setRotationPoint(3.15F, -21.4F, -4.85F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 264
		bodyModel[213].setRotationPoint(3.15F, -20.9F, -4.85F);

		bodyModel[214].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 257
		bodyModel[214].setRotationPoint(2.5F, -19.75F, 5.85F);
		bodyModel[214].rotateAngleY = -0.78539816F;

		bodyModel[215].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F); // Box 258
		bodyModel[215].setRotationPoint(2.5F, -20.4F, 5.85F);
		bodyModel[215].rotateAngleY = -0.78539816F;

		bodyModel[216].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 259
		bodyModel[216].setRotationPoint(2.5F, -20.9F, 5.85F);
		bodyModel[216].rotateAngleY = -0.78539816F;

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 260
		bodyModel[217].setRotationPoint(1.15F, -21.4F, 5.85F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 261
		bodyModel[218].setRotationPoint(1.15F, -20.9F, 5.85F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, 0.16F, 0F, -1F, 0.16F); // Box 260
		bodyModel[219].setRotationPoint(1.5F, -18.25F, -10.45F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.05F, 0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F); // Box 275
		bodyModel[220].setRotationPoint(15.5F, -17.5F, 9.85F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F); // Box 549
		bodyModel[221].setRotationPoint(15.5F, -17.5F, -10.85F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, 0F, -1F, 0.3F, 0F, -1F, 0.3F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F); // Box 275
		bodyModel[222].setRotationPoint(11.5F, -19F, 7.3F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[223].setRotationPoint(46.75F, -14F, -11.75F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // marker light glow
		bodyModel[224].setRotationPoint(46.9F, -13.85F, -11.9F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[225].setRotationPoint(45.5F, -14F, -12F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[226].setRotationPoint(46.75F, -14F, 10.75F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, 0F, 0F, -0.3F, 0F); // marker light glow
		bodyModel[227].setRotationPoint(46.9F, -13.85F, 10.9F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, -0.5F, -1F); // Box 292
		bodyModel[228].setRotationPoint(45.5F, -14F, 11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[229].setRotationPoint(60F, -20F, 1F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[230].setRotationPoint(60F, -20F, 0F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[231].setRotationPoint(60F, -20F, -2F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[232].setRotationPoint(60F, -20F, -2F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[233].setRotationPoint(60F, -18F, 1F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[234].setRotationPoint(60F, -18F, -2F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[235].setRotationPoint(60F, -17F, 0F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[236].setRotationPoint(60F, -17F, -2F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[237].setRotationPoint(52.7F, -20F, -2F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[238].setRotationPoint(52.7F, -20F, 0F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 167
		bodyModel[239].setRotationPoint(59F, -18F, 0F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[240].setRotationPoint(59F, -18F, -2F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1.25F, 0F, -1F, -1F, 0F, -0.875F, -1F, -0.5F, -0.125F, 1.25F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.875F, 0F, -0.5F, -0.125F, 0F, -0.5F); // Box 2
		bodyModel[241].setRotationPoint(59.5F, -16F, -2F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.125F, 1.25F, -0.5F, -0.875F, -1F, -0.5F, -1F, -1F, 0F, 0F, 1.25F, 0F, -0.125F, 0F, -0.5F, -0.875F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[242].setRotationPoint(59.5F, -16F, 1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, -0.8F, -0.5F, 0F); // Box 166
		bodyModel[243].setRotationPoint(58.2F, -18F, -2F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 309
		bodyModel[244].setRotationPoint(58.2F, -18F, 0F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.125F, 0.5F, 0F, -1.54F, 0.5F, 0F, -1.335F, 0.325F, -0.5F, -0.25F, 0.325F, -0.5F, -0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 2
		bodyModel[245].setRotationPoint(59.5F, -16F, -1.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0.35F, -0.5F, -1.35F, 0.35F, -0.5F, -1.54F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.875F, 0F, 0F, -0.125F, 0F, 0F); // Box 311
		bodyModel[246].setRotationPoint(59.5F, -16F, 0.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0.325F, 0F, -1.335F, 0.325F, 0F, -0.95F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		bodyModel[247].setRotationPoint(59.5F, -16F, -1F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.95F, 0F, 0F, -1.335F, 0.325F, 0F, -0.25F, 0.325F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F); // Box 313
		bodyModel[248].setRotationPoint(59.5F, -16F, 0F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 rear MARS light R
		bodyModel[249].setRotationPoint(59.25F, -19.85F, -1F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 rear MARS light W
		bodyModel[250].setRotationPoint(59.75F, -18.15F, -1F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F, 0F, -0.465F, 0F, 0F, -0.465F, 0F); // Box 405
		bodyModel[251].setRotationPoint(60.99F, -18F, -1.8F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.465F, 0F, 0F, -0.465F, 0F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F); // Box 317
		bodyModel[252].setRotationPoint(60.99F, -18F, 0.8F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F, 0F, -0.535F, -0.2F, 0F, -0.535F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 405
		bodyModel[253].setRotationPoint(60.99F, -20F, -1.8F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.535F, -0.2F, 0F, -0.535F, -0.2F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[254].setRotationPoint(60.99F, -20F, 0.8F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F); // Box 31 cull
		bodyModel[255].setRotationPoint(49.5F, 3F, -10.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F); // Box 31
		bodyModel[256].setRotationPoint(49.5F, 4.5F, -10.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 475 cull
		bodyModel[257].setRotationPoint(49.5F, 3F, 10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 476
		bodyModel[258].setRotationPoint(49.5F, 4.5F, 10F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F); // Box 31
		bodyModel[259].setRotationPoint(51.5F, 3F, -10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[260].setRotationPoint(51.5F, 3F, 9F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[261].setRotationPoint(47.75F, -2F, -11.97F);
		bodyModel[261].rotateAngleY = 0.2443461F;

		bodyModel[262].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[262].setRotationPoint(47.5F, -2F, 11F);
		bodyModel[262].rotateAngleY = -0.2443461F;

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[263].setRotationPoint(57.08F, 3F, -8.83F);
		bodyModel[263].rotateAngleY = 0.78539816F;

		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[264].setRotationPoint(56.38F, 3F, 8.13F);
		bodyModel[264].rotateAngleY = -0.78539816F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 18, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[265].setRotationPoint(-29.5F, 4F, -2F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[266].setRotationPoint(-29.5F, 6.5F, -2F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[267].setRotationPoint(19.5F, 4F, 0F);
		bodyModel[267].rotateAngleX = -0.78539816F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[268].setRotationPoint(19.49F, 4F, -0.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[269].setRotationPoint(27.51F, 4F, -0.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[270].setRotationPoint(-22.05F, 4F, -10F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[271].setRotationPoint(-18.05F, 4F, -10F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[272].setRotationPoint(-19.05F, 4F, -10F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -1.375F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, -1.375F, -0.5F, -0.25F, -0.375F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.25F, -0.375F, -0.5F); // Box 38
		bodyModel[273].setRotationPoint(-23.05F, 3.75F, -10F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[274].setRotationPoint(-21.5F, 4.2F, -9.5F);
		bodyModel[274].rotateAngleZ = -0.78539816F;

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[275].setRotationPoint(-18.3F, 4.2F, -9.5F);
		bodyModel[275].rotateAngleZ = -0.78539816F;

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[276].setRotationPoint(-22F, 3F, -5.49F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[277].setRotationPoint(-18.8F, 3F, -5.49F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[278].setRotationPoint(-18.8F, 3F, -9.49F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[279].setRotationPoint(-22F, 3F, -9.49F);

		bodyModel[280].addBox(0F, 0F, 0F, 5, 3, 5, 0F); // Box 2
		bodyModel[280].setRotationPoint(4.5F, 3F, -10F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[281].setRotationPoint(4.5F, 6F, -10F);

		bodyModel[282].addBox(0F, 0F, 0F, 3, 3, 5, 0F); // Box 2
		bodyModel[282].setRotationPoint(14.5F, 3F, -10F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[283].setRotationPoint(14.5F, 6F, -10F);

		bodyModel[284].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 52
		bodyModel[284].setRotationPoint(4.5F, 3F, 5F);

		bodyModel[285].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 52
		bodyModel[285].setRotationPoint(15.5F, 3F, 5F);

		bodyModel[286].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 52
		bodyModel[286].setRotationPoint(25.5F, 3F, 9F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[287].setRotationPoint(-4.5F, 3.2F, 6F);
		bodyModel[287].rotateAngleZ = -0.78539816F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[288].setRotationPoint(-5F, 3F, 10.01F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[289].setRotationPoint(-5F, 3F, 5.99F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[290].setRotationPoint(-18.5F, 3F, 8.9F);
		bodyModel[290].rotateAngleX = -0.78539816F;

		bodyModel[291].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[291].setRotationPoint(-18.51F, 3F, 8.4F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[292].setRotationPoint(-6.49F, 3F, 8.4F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[293].setRotationPoint(-18.5F, 3F, 4.9F);
		bodyModel[293].rotateAngleX = -0.78539816F;

		bodyModel[294].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[294].setRotationPoint(-18.51F, 3F, 4.4F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[295].setRotationPoint(-6.49F, 3F, 4.4F);

		bodyModel[296].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 52
		bodyModel[296].setRotationPoint(-29.5F, 3F, 9F);

		bodyModel[297].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 52
		bodyModel[297].setRotationPoint(-20.5F, 3F, 9.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[298].setRotationPoint(-0.5F, 3.2F, -10F);
		bodyModel[298].rotateAngleZ = -0.78539816F;

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[299].setRotationPoint(-1F, 3F, -5.99F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[300].setRotationPoint(-1F, 3F, -10.01F);

		bodyModel[301].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 52
		bodyModel[301].setRotationPoint(-31.5F, 3F, -10F);

		bodyModel[302].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 52
		bodyModel[302].setRotationPoint(-25.5F, 3F, -10.5F);

		bodyModel[303].addBox(0F, 0F, 0F, 0, 16, 7, 0F); // Box 38
		bodyModel[303].setRotationPoint(-52.5F, -15F, 3F);

		bodyModel[304].addBox(0F, 0F, 0F, 3, 16, 7, 0F); // Box 38
		bodyModel[304].setRotationPoint(-55.5F, -15F, -10F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[305].setRotationPoint(-46.5F, -6F, 7F);

		bodyModel[306].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 128
		bodyModel[306].setRotationPoint(-45.5F, -3F, 7F);

		bodyModel[307].addBox(0F, 0F, 0F, 14, 4, 1, 0F); // Box 128
		bodyModel[307].setRotationPoint(-51.5F, -3F, 9F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[308].setRotationPoint(-48.5F, -3F, 5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[309].setRotationPoint(-52.5F, -6F, 7F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[310].setRotationPoint(-38.5F, -6F, 7F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[311].setRotationPoint(-52.5F, -3F, 5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[312].setRotationPoint(-43.5F, -3F, 5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, -3F, 0F, 3.75F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 3.75F, 0F, 0F, -4F, -3F, 0F, 0F); // Box 128
		bodyModel[313].setRotationPoint(-51.5F, -6F, 5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, -3F, 0F, 3.75F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 3.75F, 0F, 0F, -4F, -3F, 0F, 0F); // Box 128
		bodyModel[314].setRotationPoint(-43.5F, -6F, 5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 358
		bodyModel[315].setRotationPoint(-46.5F, -6F, -10F);

		bodyModel[316].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 359
		bodyModel[316].setRotationPoint(-45.5F, -3F, -9F);

		bodyModel[317].addBox(0F, 0F, 0F, 14, 4, 1, 0F); // Box 360
		bodyModel[317].setRotationPoint(-51.5F, -3F, -10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 361
		bodyModel[318].setRotationPoint(-48.5F, -3F, -9F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[319].setRotationPoint(-52.5F, -6F, -10F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 364
		bodyModel[320].setRotationPoint(-38.5F, -6F, -10F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 368
		bodyModel[321].setRotationPoint(-43.5F, -3F, -9F);

		bodyModel[322].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[322].setRotationPoint(-40.5F, -5F, -5F);
		bodyModel[322].rotateAngleY = -0.78539816F;

		bodyModel[323].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[323].setRotationPoint(-51.5F, -6F, -9F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[324].setRotationPoint(-43.5F, -6F, -9F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[325].setRotationPoint(-45.5F, -3F, -7F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 366
		bodyModel[326].setRotationPoint(-44.5F, -3F, -7F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[327].setRotationPoint(-45.5F, -3F, 5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[328].setRotationPoint(-44.5F, -3F, 5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 380
		bodyModel[329].setRotationPoint(-43.5F, -6F, -5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 380
		bodyModel[330].setRotationPoint(-38.5F, -6F, -5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 380
		bodyModel[331].setRotationPoint(-51.5F, -6F, -5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 380
		bodyModel[332].setRotationPoint(-46.5F, -6F, -5F);

		bodyModel[333].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 38
		bodyModel[333].setRotationPoint(-36.5F, -15F, 5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[334].setRotationPoint(-51.5F, -3F, 5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[335].setRotationPoint(-52.5F, -3F, -10F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[336].setRotationPoint(-51.5F, -3F, -9F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[337].setRotationPoint(-37.5F, -3F, 5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[338].setRotationPoint(-40.5F, -3F, 5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[339].setRotationPoint(-37.5F, -3F, -10F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 446
		bodyModel[340].setRotationPoint(-40.5F, -3F, -9F);

		bodyModel[341].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 38
		bodyModel[341].setRotationPoint(-36.5F, -6F, -10F);

		bodyModel[342].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 38
		bodyModel[342].setRotationPoint(-36.5F, -15F, -10F);

		bodyModel[343].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 38
		bodyModel[343].setRotationPoint(-36.5F, -15F, -7F);

		bodyModel[344].addBox(0F, 0F, 0F, 20, 2, 16, 0F); // Box 38
		bodyModel[344].setRotationPoint(-55.5F, -17F, -8F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[345].setRotationPoint(-55.5F, -17F, -10F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[346].setRotationPoint(-55.5F, -17F, 8F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[347].setRotationPoint(-42.5F, -6F, -5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[348].setRotationPoint(-50.5F, -6F, -5F);

		bodyModel[349].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[349].setRotationPoint(-48.5F, -5F, -5F);
		bodyModel[349].rotateAngleY = -0.78539816F;

		bodyModel[350].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[350].setRotationPoint(-40.5F, -5F, 5F);
		bodyModel[350].rotateAngleY = -0.78539816F;

		bodyModel[351].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[351].setRotationPoint(-48.5F, -5F, 5F);
		bodyModel[351].rotateAngleY = -0.78539816F;

		bodyModel[352].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 38
		bodyModel[352].setRotationPoint(-8.5F, -15F, 5F);

		bodyModel[353].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[353].setRotationPoint(-8.5F, -15F, -6F);

		bodyModel[354].addBox(0F, 0F, 0F, 16, 16, 1, 0F); // Box 38
		bodyModel[354].setRotationPoint(-7.5F, -15F, -6F);

		bodyModel[355].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 38
		bodyModel[355].setRotationPoint(-8.5F, -15F, 1F);

		bodyModel[356].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[356].setRotationPoint(7.5F, -15F, -5F);

		bodyModel[357].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[357].setRotationPoint(18.5F, -15F, 3F);

		bodyModel[358].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[358].setRotationPoint(18.5F, -15F, -10F);

		bodyModel[359].addBox(0F, 0F, 0F, 5, 16, 7, 0F); // Box 38
		bodyModel[359].setRotationPoint(8.5F, -15F, 3F);

		bodyModel[360].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[360].setRotationPoint(12.5F, -15F, -10F);

		bodyModel[361].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 38
		bodyModel[361].setRotationPoint(13.5F, -15F, -4F);

		bodyModel[362].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 38
		bodyModel[362].setRotationPoint(13.5F, -15F, 3F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 16, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 515
		bodyModel[363].setRotationPoint(10.5F, -15F, -10F);

		bodyModel[364].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 38
		bodyModel[364].setRotationPoint(-8.5F, -17F, -8F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 28, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[365].setRotationPoint(-8.5F, -17F, -10F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[366].setRotationPoint(-8.5F, -17F, 8F);

		bodyModel[367].addBox(0F, 0F, 0F, 12, 2, 16, 0F); // Box 38
		bodyModel[367].setRotationPoint(7.5F, -17F, -8F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[368].setRotationPoint(7.5F, -17F, 8F);

		bodyModel[369].addBox(0F, 0F, 0F, 15, 2, 3, 0F); // Box 38
		bodyModel[369].setRotationPoint(-7.5F, -17F, -8F);

		bodyModel[370].addBox(0F, 0F, 0F, 28, 1, 1, 0F); // Box 275 glow
		bodyModel[370].setRotationPoint(19.5F, -11F, -10F);

		bodyModel[371].addBox(0F, 0F, 0F, 27, 1, 0, 0F); // Box 275
		bodyModel[371].setRotationPoint(20.5F, -11F, -8.99F);

		bodyModel[372].addBox(0F, 0F, 0F, 28, 1, 1, 0F); // Box 485 glow
		bodyModel[372].setRotationPoint(19.5F, -11F, 9F);

		bodyModel[373].addBox(0F, 0F, 0F, 27, 1, 0, 0F); // Box 486
		bodyModel[373].setRotationPoint(20.5F, -11F, 8.99F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, -0.55F, 0F, -1.85F, -1.1F, 0F, 1.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, -1.85F, -1.1F, 0F, 1.7F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[374].setRotationPoint(47.5F, -11F, -10F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 0F, 0F, -0.1F, 0F, -1.7F, -0.1F, 0F, 1.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -1.7F, -0.1F, 0F, 1.7F, 0F, 0F, 0F); // Box 38
		bodyModel[375].setRotationPoint(47.5F, -11F, -8.99F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, -1.1F, 0F, 1.7F, -0.55F, 0F, -1.85F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 1.7F, -0.55F, 0F, -1.85F, 0F, 0F, 0F); // Box 490 glow
		bodyModel[376].setRotationPoint(47.5F, -11F, 9F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0F, 0F, -1.1F, 0F, 1.7F, -1.1F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 1.7F, -1.1F, 0F, -1.7F, 0F, 0F, 0F); // Box 491
		bodyModel[377].setRotationPoint(47.5F, -11F, 8.99F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.55F, 0F, -0.15F, 0.4F, 0F, -2.85F, -0.5F, 0F, 2.55F, 0F, 0F, 0F, -0.55F, 0F, -0.15F, 0.4F, 0F, -2.85F, -0.5F, 0F, 2.55F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[378].setRotationPoint(54.4F, -11F, -8.3F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, -2.55F, -0.5F, 0F, 2.55F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2.55F, -0.5F, 0F, 2.55F, 0F, 0F, 0F); // Box 38
		bodyModel[379].setRotationPoint(54.4F, -11F, -7.29F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 2.55F, 0.4F, 0F, -2.85F, -0.55F, 0F, -0.15F, 0F, 0F, 0F, -0.5F, 0F, 2.55F, 0.4F, 0F, -2.85F, -0.55F, 0F, -0.15F); // Box 495 glow
		bodyModel[380].setRotationPoint(54.4F, -11F, 7.3F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 2.55F, -0.5F, 0F, -2.55F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2.55F, -0.5F, 0F, -2.55F, 0F, 0F, 0F); // Box 496
		bodyModel[381].setRotationPoint(54.4F, -11F, 7.29F);

		bodyModel[382].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 275 glow
		bodyModel[382].setRotationPoint(19.5F, -11F, -9F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F); // Box 275
		bodyModel[383].setRotationPoint(20.51F, -11F, -9F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[384].setRotationPoint(19.5F, -11F, -3.99F);

		bodyModel[385].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 500 glow
		bodyModel[385].setRotationPoint(19.5F, -11F, 4F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[386].setRotationPoint(20.51F, -11F, 4F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[387].setRotationPoint(19.5F, -11F, 3.99F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, 0F, -0.55F, 0.2F, 0F, 0.15F, 1.9F, 0F, -0.7F, -1.9F, 0F, -0.5F, -0.3F, 0F, -0.55F, 0.2F, 0F, 0.15F, 1.9F, 0F, -0.7F, -1.9F, 0F, -0.5F); // Box 2 glow
		bodyModel[388].setRotationPoint(56.6F, -11F, -5.3F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.6F, 0F, -0.05F, -1.6F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 1.6F, 0F, -0.05F, -1.6F, 0F, -0.05F); // Box 2
		bodyModel[389].setRotationPoint(56.89F, -11F, -4.75F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1.9F, 0F, -0.5F, 1.9F, 0F, -0.7F, 0.2F, 0F, 0.15F, -0.3F, 0F, -0.55F, -1.9F, 0F, -0.5F, 1.9F, 0F, -0.7F, 0.2F, 0F, 0.15F, -0.3F, 0F, -0.55F); // Box 506 glow
		bodyModel[390].setRotationPoint(56.6F, -11F, 1.3F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,-1.6F, 0F, -0.05F, 1.6F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, -0.05F, 1.6F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		bodyModel[391].setRotationPoint(56.89F, -11F, 1.75F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 2 glow
		bodyModel[392].setRotationPoint(58.5F, -11F, -2F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		bodyModel[393].setRotationPoint(58.49F, -11F, -2F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 510 glow
		bodyModel[394].setRotationPoint(58.5F, -11F, 0F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 511
		bodyModel[395].setRotationPoint(58.49F, -11F, 0F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[396].setRotationPoint(39F, -3F, 4.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[397].setRotationPoint(39F, -6F, 8.5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[398].setRotationPoint(39F, -2.5F, 8.5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[399].setRotationPoint(21F, -3F, 4.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[400].setRotationPoint(21F, -6F, 8.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[401].setRotationPoint(20.5F, -4.5F, 5.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[402].setRotationPoint(21F, -2.5F, 8.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[403].setRotationPoint(27F, -3F, 4.5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[404].setRotationPoint(27F, -6F, 8.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[405].setRotationPoint(27F, -2.5F, 8.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[406].setRotationPoint(33F, -3F, 4.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[407].setRotationPoint(33F, -6F, 8.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[408].setRotationPoint(33F, -2.5F, 8.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 558
		bodyModel[409].setRotationPoint(39F, -3F, -8.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 559
		bodyModel[410].setRotationPoint(39F, -6F, -9.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[411].setRotationPoint(39F, -2.5F, -9.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 567
		bodyModel[412].setRotationPoint(21F, -3F, -8.5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 568
		bodyModel[413].setRotationPoint(21F, -6F, -9.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		bodyModel[414].setRotationPoint(21F, -2.5F, -9.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 576
		bodyModel[415].setRotationPoint(27F, -3F, -8.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 577
		bodyModel[416].setRotationPoint(27F, -6F, -9.5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[417].setRotationPoint(27F, -2.5F, -9.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 585
		bodyModel[418].setRotationPoint(33F, -3F, -8.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 586
		bodyModel[419].setRotationPoint(33F, -6F, -9.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[420].setRotationPoint(33F, -2.5F, -9.5F);

		bodyModel[421].addShapeBox(-2F, 0F, -2.75F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[421].setRotationPoint(47F, -3F, 7.04F);
		bodyModel[421].rotateAngleY = -0.12217305F;

		bodyModel[422].addShapeBox(-2F, 0F, 1.25F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[422].setRotationPoint(47F, -6F, 7.04F);
		bodyModel[422].rotateAngleY = -0.12217305F;

		bodyModel[423].addShapeBox(2F, 0F, -1.75F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 528 cull
		bodyModel[423].setRotationPoint(47F, -4.5F, 7.04F);
		bodyModel[423].rotateAngleY = -0.12217305F;

		bodyModel[424].addShapeBox(-2.5F, 0F, -1.75F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[424].setRotationPoint(47F, -4.5F, 7.04F);
		bodyModel[424].rotateAngleY = -0.12217305F;

		bodyModel[425].addShapeBox(-2F, 0F, 1.25F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[425].setRotationPoint(47F, -2.5F, 7.04F);
		bodyModel[425].rotateAngleY = -0.12217305F;

		bodyModel[426].addShapeBox(-2F, 0F, -1.25F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 621
		bodyModel[426].setRotationPoint(47F, -3F, -7.04F);
		bodyModel[426].rotateAngleY = 0.12217305F;

		bodyModel[427].addShapeBox(-2F, 0F, -2.25F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 622
		bodyModel[427].setRotationPoint(47F, -6F, -7.04F);
		bodyModel[427].rotateAngleY = 0.12217305F;

		bodyModel[428].addShapeBox(2F, 0F, -2.25F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 623 cull
		bodyModel[428].setRotationPoint(47F, -4.5F, -7.04F);
		bodyModel[428].rotateAngleY = 0.12217305F;

		bodyModel[429].addShapeBox(-2.5F, 0F, -2.25F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 624 cull
		bodyModel[429].setRotationPoint(47F, -4.5F, -7.04F);
		bodyModel[429].rotateAngleY = 0.12217305F;

		bodyModel[430].addShapeBox(-2F, 0F, -2.25F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 629
		bodyModel[430].setRotationPoint(47F, -2.5F, -7.04F);
		bodyModel[430].rotateAngleY = 0.12217305F;

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[431].setRotationPoint(51.5F, -5F, -2.5F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 631
		bodyModel[432].setRotationPoint(51.5F, -5F, 1.5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 275
		bodyModel[433].setRotationPoint(51.5F, -5F, -1.5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 527
		bodyModel[434].setRotationPoint(52.35F, -6F, -3.5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 532
		bodyModel[435].setRotationPoint(52.85F, -2.5F, -3.5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[436].setRotationPoint(52.5F, -5F, -2.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[437].setRotationPoint(53.35F, -3F, -3.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[438].setRotationPoint(53.1F, -4F, -4F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[439].setRotationPoint(53.1F, -4F, 3F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[440].setRotationPoint(42.75F, -5F, 2.5F);

		bodyModel[441].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[441].setRotationPoint(43.75F, -5.5F, 3.5F);
		bodyModel[441].rotateAngleY = -0.78539816F;

		bodyModel[442].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[442].setRotationPoint(42.75F, 0.5F, 2.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[443].setRotationPoint(37.25F, -5F, -4.5F);

		bodyModel[444].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[444].setRotationPoint(38.25F, -5.5F, -3.5F);
		bodyModel[444].rotateAngleY = -0.78539816F;

		bodyModel[445].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[445].setRotationPoint(37.25F, 0.5F, -4.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[446].setRotationPoint(30.5F, -5F, 2.5F);

		bodyModel[447].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[447].setRotationPoint(31.5F, -5.5F, 3.5F);
		bodyModel[447].rotateAngleY = -0.78539816F;

		bodyModel[448].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[448].setRotationPoint(30.5F, 0.5F, 2.5F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[449].setRotationPoint(25F, -5F, -4.5F);

		bodyModel[450].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[450].setRotationPoint(26F, -5.5F, -3.5F);
		bodyModel[450].rotateAngleY = -0.78539816F;

		bodyModel[451].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[451].setRotationPoint(25F, 0.5F, -4.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[452].setRotationPoint(14.5F, -15F, -0.5F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[453].setRotationPoint(7.5F, -15F, -8.5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[454].setRotationPoint(-3.5F, -15F, -8.5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[455].setRotationPoint(-45.5F, -10F, 9.99F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 592 glow
		bodyModel[456].setRotationPoint(-45.5F, -10F, -9.99F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 5, 4, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[457].setRotationPoint(-45.5F, -10F, -9.98F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[458].setRotationPoint(16.5F, -6F, -10F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[459].setRotationPoint(16.5F, -6F, -9F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[460].setRotationPoint(17.5F, -6F, -9F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[461].setRotationPoint(16.5F, -6F, 9F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[462].setRotationPoint(16.5F, -6F, 8F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[463].setRotationPoint(17.5F, -6F, 8F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 38
		bodyModel[464].setRotationPoint(14.64F, -2F, -10.28F);
		bodyModel[464].rotateAngleY = 0.78539816F;

		bodyModel[465].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 38
		bodyModel[465].setRotationPoint(14.47F, -1F, -9.75F);
		bodyModel[465].rotateAngleY = 0.78539816F;

		bodyModel[466].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[466].setRotationPoint(15.17F, 0.5F, -9.75F);
		bodyModel[466].rotateAngleY = 0.78539816F;

		bodyModel[467].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F); // Box 38
		bodyModel[467].setRotationPoint(14.28F, -2F, 7.81F);
		bodyModel[467].rotateAngleY = -0.78539816F;

		bodyModel[468].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[468].setRotationPoint(13.93F, -1F, 8.87F);
		bodyModel[468].rotateAngleY = -0.78539816F;

		bodyModel[469].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[469].setRotationPoint(13.93F, 0.5F, 8.17F);
		bodyModel[469].rotateAngleY = -0.78539816F;

		bodyModel[470].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[470].setRotationPoint(-52.5F, -15F, -5.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 623 glow
		bodyModel[471].setRotationPoint(-52.5F, -15F, 4.5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[472].setRotationPoint(-26.5F, -1F, -3F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[473].setRotationPoint(-30.5F, -1F, 1F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[474].setRotationPoint(-26.5F, -8F, -3F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[475].setRotationPoint(-30.5F, -8F, 1F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 18, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[476].setRotationPoint(-26.5F, -7F, -2F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[477].setRotationPoint(-29.5F, -7F, 1F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 18, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[478].setRotationPoint(-26.5F, -6F, -3F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 0, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[479].setRotationPoint(-30.5F, -6F, 1F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-0.05F, 0F, -1.5F, 0.15F, 0F, -0.6F, 0.15F, 0F, 0.6F, -0.75F, 0F, 1.2F, -0.05F, 0F, -1.5F, 0.15F, 0F, -0.6F, 0.15F, 0F, 0.6F, -0.75F, 0F, 1.2F); // Box 128
		bodyModel[480].setRotationPoint(-28.65F, -7F, -2.6F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,-1.5F, 0F, -0.05F, 1.2F, 0F, -0.75F, 0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F, -1.5F, 0F, -0.05F, 1.2F, 0F, -0.75F, 0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F); // Box 128
		bodyModel[481].setRotationPoint(-30.1F, -7F, -1.15F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.3F, 0F, -1.75F, 0.15F, 0F, -0.6F, 0.15F, 0F, 0.6F, -1.05F, 0F, 1.5F, -0.3F, 0F, -1.75F, 0.15F, 0F, -0.6F, 0.15F, 0F, 0.6F, -1.05F, 0F, 1.5F); // Box 128
		bodyModel[482].setRotationPoint(-29.65F, -1F, -3.6F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1.75F, 0F, -0.3F, 1.5F, 0F, -1.05F, 0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F, -1.75F, 0F, -0.3F, 1.5F, 0F, -1.05F, 0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F); // Box 128
		bodyModel[483].setRotationPoint(-31.1F, -1F, -2.15F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.3F, 0F, -1.75F, 0.15F, 0F, -0.6F, 0.15F, 0F, 0.6F, -1.05F, 0F, 1.5F, -0.3F, 0F, -1.75F, 0.15F, 0F, -0.6F, 0.15F, 0F, 0.6F, -1.05F, 0F, 1.5F); // Box 128
		bodyModel[484].setRotationPoint(-29.65F, -6F, -3.6F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-1.75F, 0F, -0.3F, 1.5F, 0F, -1.05F, 0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F, -1.75F, 0F, -0.3F, 1.5F, 0F, -1.05F, 0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F); // Box 128
		bodyModel[485].setRotationPoint(-31.1F, -6F, -2.15F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.3F, 0F, -1.75F, 0.15F, 0F, -0.6F, 0.15F, 0F, -0.4F, -3.15F, 0F, -0.4F, -0.3F, 0F, -1.75F, 0.15F, 0F, -0.6F, 0.15F, 0F, -0.4F, -3.15F, 0F, -0.4F); // Box 128
		bodyModel[486].setRotationPoint(-29.65F, -8F, -3.6F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,-1.75F, 0F, -0.3F, -0.4F, 0F, -3.15F, -0.4F, 0F, 0.15F, -0.6F, 0F, 0.15F, -1.75F, 0F, -0.3F, -0.4F, 0F, -3.15F, -0.4F, 0F, 0.15F, -0.6F, 0F, 0.15F); // Box 128
		bodyModel[487].setRotationPoint(-31.1F, -8F, -2.15F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 18, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[488].setRotationPoint(-26.5F, -8F, 6F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 19, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[489].setRotationPoint(-27.5F, -5F, -1F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[490].setRotationPoint(-28.5F, -7F, 6F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[491].setRotationPoint(-20.5F, -15F, 9F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[492].setRotationPoint(-19.5F, -15F, 8F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[493].setRotationPoint(-20.5F, -15F, 8F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[494].setRotationPoint(-17.5F, -15F, 8F);

		bodyModel[495].addShapeBox(-1F, 0F, -1F, 2, 5, 2, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 128
		bodyModel[495].setRotationPoint(-9.5F, -13F, 9F);
		bodyModel[495].rotateAngleY = 0.76794487F;

		bodyModel[496].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // swing door left
		bodyModel[496].setRotationPoint(-8F, -12F, 1F);

		bodyModel[497].addBox(0F, 0F, -2F, 0, 7, 2, 0F); // swing door right
		bodyModel[497].setRotationPoint(-8F, -12F, 5F);

		bodyModel[498].addShapeBox(-1.5F, 0F, -1.5F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[498].setRotationPoint(-11F, -5F, -4.75F);

		bodyModel[499].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 128
		bodyModel[499].setRotationPoint(-11F, 0.5F, -4.75F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 232, 323, textureX, textureY); // Box 128
		bodyModel[501] = new ModelRendererTurbo(this, 230, 312, textureX, textureY); // Box 128
		bodyModel[502] = new ModelRendererTurbo(this, 214, 319, textureX, textureY); // Box 128
		bodyModel[503] = new ModelRendererTurbo(this, 217, 332, textureX, textureY); // Box 128
		bodyModel[504] = new ModelRendererTurbo(this, 219, 325, textureX, textureY); // Box 128
		bodyModel[505] = new ModelRendererTurbo(this, 217, 312, textureX, textureY); // Box 128
		bodyModel[506] = new ModelRendererTurbo(this, 201, 317, textureX, textureY); // Box 128
		bodyModel[507] = new ModelRendererTurbo(this, 204, 330, textureX, textureY); // Box 128
		bodyModel[508] = new ModelRendererTurbo(this, 206, 323, textureX, textureY); // Box 128
		bodyModel[509] = new ModelRendererTurbo(this, 204, 312, textureX, textureY); // Box 128
		bodyModel[510] = new ModelRendererTurbo(this, 188, 319, textureX, textureY); // Box 128
		bodyModel[511] = new ModelRendererTurbo(this, 191, 332, textureX, textureY); // Box 128
		bodyModel[512] = new ModelRendererTurbo(this, 193, 325, textureX, textureY); // Box 128
		bodyModel[513] = new ModelRendererTurbo(this, 191, 312, textureX, textureY); // Box 128
		bodyModel[514] = new ModelRendererTurbo(this, 142, 317, textureX, textureY); // Box 128
		bodyModel[515] = new ModelRendererTurbo(this, 145, 330, textureX, textureY); // Box 128
		bodyModel[516] = new ModelRendererTurbo(this, 147, 323, textureX, textureY); // Box 128
		bodyModel[517] = new ModelRendererTurbo(this, 145, 312, textureX, textureY); // Box 128
		bodyModel[518] = new ModelRendererTurbo(this, 142, 296, textureX, textureY); // Box 128
		bodyModel[519] = new ModelRendererTurbo(this, 145, 308, textureX, textureY); // Box 128
		bodyModel[520] = new ModelRendererTurbo(this, 147, 301, textureX, textureY); // Box 128
		bodyModel[521] = new ModelRendererTurbo(this, 145, 289, textureX, textureY); // Box 128
		bodyModel[522] = new ModelRendererTurbo(this, 142, 273, textureX, textureY); // Box 128
		bodyModel[523] = new ModelRendererTurbo(this, 145, 285, textureX, textureY); // Box 128
		bodyModel[524] = new ModelRendererTurbo(this, 147, 278, textureX, textureY); // Box 128
		bodyModel[525] = new ModelRendererTurbo(this, 145, 266, textureX, textureY); // Box 128
		bodyModel[526] = new ModelRendererTurbo(this, 207, 246, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[527] = new ModelRendererTurbo(this, 200, 246, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[528] = new ModelRendererTurbo(this, 193, 246, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[529] = new ModelRendererTurbo(this, 207, 243, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[530] = new ModelRendererTurbo(this, 200, 243, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[531] = new ModelRendererTurbo(this, 193, 243, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[532] = new ModelRendererTurbo(this, 186, 246, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[533] = new ModelRendererTurbo(this, 186, 242, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[534] = new ModelRendererTurbo(this, 285, 262, textureX, textureY); // Box 38
		bodyModel[535] = new ModelRendererTurbo(this, 242, 273, textureX, textureY); // Box 128
		bodyModel[536] = new ModelRendererTurbo(this, 264, 272, textureX, textureY); // folding prep surface
		bodyModel[537] = new ModelRendererTurbo(this, 270, 262, textureX, textureY); // Box 38
		bodyModel[538] = new ModelRendererTurbo(this, 247, 262, textureX, textureY); // Box 38
		bodyModel[539] = new ModelRendererTurbo(this, 308, 260, textureX, textureY); // Folding sink part R
		bodyModel[540] = new ModelRendererTurbo(this, 311, 266, textureX, textureY); // Box 128
		bodyModel[541] = new ModelRendererTurbo(this, 308, 255, textureX, textureY); // Folding sink part R
		bodyModel[542] = new ModelRendererTurbo(this, 313, 273, textureX, textureY); // Box 128
		bodyModel[543] = new ModelRendererTurbo(this, 311, 285, textureX, textureY); // Box 38
		bodyModel[544] = new ModelRendererTurbo(this, 280, 297, textureX, textureY); // Box 128
		bodyModel[545] = new ModelRendererTurbo(this, 252, 296, textureX, textureY); // Box 128
		bodyModel[546] = new ModelRendererTurbo(this, 279, 300, textureX, textureY); // Box 128
		bodyModel[547] = new ModelRendererTurbo(this, 302, 278, textureX, textureY); // Box 128
		bodyModel[548] = new ModelRendererTurbo(this, 286, 288, textureX, textureY); // Box 128
		bodyModel[549] = new ModelRendererTurbo(this, 279, 290, textureX, textureY); // Box 128
		bodyModel[550] = new ModelRendererTurbo(this, 295, 288, textureX, textureY); // Box 128
		bodyModel[551] = new ModelRendererTurbo(this, 302, 269, textureX, textureY); // Box 128
		bodyModel[552] = new ModelRendererTurbo(this, 271, 296, textureX, textureY); // Box 128
		bodyModel[553] = new ModelRendererTurbo(this, 262, 289, textureX, textureY); // Box 38
		bodyModel[554] = new ModelRendererTurbo(this, 277, 251, textureX, textureY); // Box 38
		bodyModel[555] = new ModelRendererTurbo(this, 278, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[556] = new ModelRendererTurbo(this, 269, 21, textureX, textureY); // Box 259
		bodyModel[557] = new ModelRendererTurbo(this, 288, 21, textureX, textureY); // Box 550
		bodyModel[558] = new ModelRendererTurbo(this, 288, 5, textureX, textureY); // Box 701
		bodyModel[559] = new ModelRendererTurbo(this, 396, 264, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[560] = new ModelRendererTurbo(this, 415, 264, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[561] = new ModelRendererTurbo(this, 435, 264, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[562] = new ModelRendererTurbo(this, 454, 264, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[563] = new ModelRendererTurbo(this, 474, 264, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[564] = new ModelRendererTurbo(this, 415, 196, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[565] = new ModelRendererTurbo(this, 435, 196, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[566] = new ModelRendererTurbo(this, 385, 307, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[567] = new ModelRendererTurbo(this, 405, 307, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[568] = new ModelRendererTurbo(this, 424, 307, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[569] = new ModelRendererTurbo(this, 444, 307, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[570] = new ModelRendererTurbo(this, 463, 307, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[571] = new ModelRendererTurbo(this, 483, 307, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[572] = new ModelRendererTurbo(this, 424, 230, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[573] = new ModelRendererTurbo(this, 444, 230, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[574] = new ModelRendererTurbo(this, 304, 290, textureX, textureY); // Box 128
		bodyModel[575] = new ModelRendererTurbo(this, 334, 42, textureX, textureY); // Box 726
		bodyModel[576] = new ModelRendererTurbo(this, 249, 287, textureX, textureY); // Box 38
		bodyModel[577] = new ModelRendererTurbo(this, 463, 182, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[578] = new ModelRendererTurbo(this, 470, 183, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[579] = new ModelRendererTurbo(this, 462, 177, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[580] = new ModelRendererTurbo(this, 462, 172, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[581] = new ModelRendererTurbo(this, 459, 166, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[582] = new ModelRendererTurbo(this, 39, 269, textureX, textureY); // Box 128
		bodyModel[583] = new ModelRendererTurbo(this, 70, 254, textureX, textureY); // Box 128
		bodyModel[584] = new ModelRendererTurbo(this, 1, 260, textureX, textureY); // Box 38
		bodyModel[585] = new ModelRendererTurbo(this, 22, 260, textureX, textureY); // Box 38
		bodyModel[586] = new ModelRendererTurbo(this, 43, 260, textureX, textureY); // Box 38
		bodyModel[587] = new ModelRendererTurbo(this, 150, 66, textureX, textureY); // Box 38
		bodyModel[588] = new ModelRendererTurbo(this, 8, 119, textureX, textureY); // Box 128
		bodyModel[589] = new ModelRendererTurbo(this, 8, 117, textureX, textureY); // Box 261
		bodyModel[590] = new ModelRendererTurbo(this, 435, 67, textureX, textureY); // Box 550
		bodyModel[591] = new ModelRendererTurbo(this, 435, 73, textureX, textureY); // Box 552
		bodyModel[592] = new ModelRendererTurbo(this, 433, 70, textureX, textureY); // Box 553
		bodyModel[593] = new ModelRendererTurbo(this, 433, 82, textureX, textureY); // Box 554
		bodyModel[594] = new ModelRendererTurbo(this, 444, 68, textureX, textureY); // Box 555
		bodyModel[595] = new ModelRendererTurbo(this, 450, 65, textureX, textureY); // Box 556
		bodyModel[596] = new ModelRendererTurbo(this, 433, 76, textureX, textureY); // Box 557
		bodyModel[597] = new ModelRendererTurbo(this, 435, 79, textureX, textureY); // Box 558
		bodyModel[598] = new ModelRendererTurbo(this, 424, 69, textureX, textureY); // Box 559
		bodyModel[599] = new ModelRendererTurbo(this, 424, 66, textureX, textureY); // Box 560
		bodyModel[600] = new ModelRendererTurbo(this, 428, 84, textureX, textureY); // Box 26
		bodyModel[601] = new ModelRendererTurbo(this, 444, 84, textureX, textureY); // Box 26
		bodyModel[602] = new ModelRendererTurbo(this, 444, 82, textureX, textureY); // Box 26
		bodyModel[603] = new ModelRendererTurbo(this, 428, 82, textureX, textureY); // Box 26
		bodyModel[604] = new ModelRendererTurbo(this, 444, 88, textureX, textureY); // Box 26
		bodyModel[605] = new ModelRendererTurbo(this, 428, 88, textureX, textureY); // Box 26
		bodyModel[606] = new ModelRendererTurbo(this, 433, 85, textureX, textureY); // Box 26
		bodyModel[607] = new ModelRendererTurbo(this, 433, 64, textureX, textureY); // Box 551
		bodyModel[608] = new ModelRendererTurbo(this, 435, 88, textureX, textureY); // Box 26
		bodyModel[609] = new ModelRendererTurbo(this, 435, 102, textureX, textureY); // Left step part
		bodyModel[610] = new ModelRendererTurbo(this, 435, 98, textureX, textureY); // Left step part
		bodyModel[611] = new ModelRendererTurbo(this, 435, 92, textureX, textureY); // Left step part
		bodyModel[612] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Left step part
		bodyModel[613] = new ModelRendererTurbo(this, 444, 98, textureX, textureY); // Left step part
		bodyModel[614] = new ModelRendererTurbo(this, 430, 98, textureX, textureY); // Left step part
		bodyModel[615] = new ModelRendererTurbo(this, 444, 96, textureX, textureY); // Left step part
		bodyModel[616] = new ModelRendererTurbo(this, 430, 96, textureX, textureY); // Left step part
		bodyModel[617] = new ModelRendererTurbo(this, 430, 93, textureX, textureY); // Left step part
		bodyModel[618] = new ModelRendererTurbo(this, 444, 93, textureX, textureY); // Left step part
		bodyModel[619] = new ModelRendererTurbo(this, 433, 95, textureX, textureY); // Left step part
		bodyModel[620] = new ModelRendererTurbo(this, 404, 67, textureX, textureY); // Right step part
		bodyModel[621] = new ModelRendererTurbo(this, 404, 73, textureX, textureY); // Right step part
		bodyModel[622] = new ModelRendererTurbo(this, 402, 70, textureX, textureY); // Right step part
		bodyModel[623] = new ModelRendererTurbo(this, 402, 82, textureX, textureY); // Right step part
		bodyModel[624] = new ModelRendererTurbo(this, 413, 69, textureX, textureY); // Box 142
		bodyModel[625] = new ModelRendererTurbo(this, 419, 66, textureX, textureY); // Right step part
		bodyModel[626] = new ModelRendererTurbo(this, 402, 76, textureX, textureY); // Right step part
		bodyModel[627] = new ModelRendererTurbo(this, 404, 79, textureX, textureY); // Right step part
		bodyModel[628] = new ModelRendererTurbo(this, 393, 69, textureX, textureY); // Box 142
		bodyModel[629] = new ModelRendererTurbo(this, 393, 66, textureX, textureY); // Right step part
		bodyModel[630] = new ModelRendererTurbo(this, 397, 84, textureX, textureY); // Box 1353
		bodyModel[631] = new ModelRendererTurbo(this, 413, 84, textureX, textureY); // Box 1354
		bodyModel[632] = new ModelRendererTurbo(this, 413, 82, textureX, textureY); // Box 1357
		bodyModel[633] = new ModelRendererTurbo(this, 397, 82, textureX, textureY); // Box 1358
		bodyModel[634] = new ModelRendererTurbo(this, 413, 88, textureX, textureY); // Box 1359
		bodyModel[635] = new ModelRendererTurbo(this, 397, 88, textureX, textureY); // Box 1360
		bodyModel[636] = new ModelRendererTurbo(this, 402, 85, textureX, textureY); // Box 1356
		bodyModel[637] = new ModelRendererTurbo(this, 402, 64, textureX, textureY); // Right step part
		bodyModel[638] = new ModelRendererTurbo(this, 404, 88, textureX, textureY); // Box 1355
		bodyModel[639] = new ModelRendererTurbo(this, 404, 98, textureX, textureY); // Right step part
		bodyModel[640] = new ModelRendererTurbo(this, 404, 102, textureX, textureY); // Right step part
		bodyModel[641] = new ModelRendererTurbo(this, 404, 92, textureX, textureY); // Right step part
		bodyModel[642] = new ModelRendererTurbo(this, 402, 95, textureX, textureY); // Right step part
		bodyModel[643] = new ModelRendererTurbo(this, 402, 105, textureX, textureY); // Right step part
		bodyModel[644] = new ModelRendererTurbo(this, 399, 96, textureX, textureY); // Right step part
		bodyModel[645] = new ModelRendererTurbo(this, 413, 96, textureX, textureY); // Right step part
		bodyModel[646] = new ModelRendererTurbo(this, 399, 98, textureX, textureY); // Right step part
		bodyModel[647] = new ModelRendererTurbo(this, 413, 98, textureX, textureY); // Right step part
		bodyModel[648] = new ModelRendererTurbo(this, 399, 93, textureX, textureY); // Right step part
		bodyModel[649] = new ModelRendererTurbo(this, 413, 93, textureX, textureY); // Right step part
		bodyModel[650] = new ModelRendererTurbo(this, 58, 332, textureX, textureY); // Box 38
		bodyModel[651] = new ModelRendererTurbo(this, 74, 242, textureX, textureY); // Box 564
		bodyModel[652] = new ModelRendererTurbo(this, 383, 121, textureX, textureY); // Box 2
		bodyModel[653] = new ModelRendererTurbo(this, 380, 104, textureX, textureY,"lamp"); // tail sign glow
		bodyModel[654] = new ModelRendererTurbo(this, 383, 132, textureX, textureY); // Box 2
		bodyModel[655] = new ModelRendererTurbo(this, 373, 133, textureX, textureY); // Box 2
		bodyModel[656] = new ModelRendererTurbo(this, 373, 129, textureX, textureY); // Box 240
		bodyModel[657] = new ModelRendererTurbo(this, 371, 137, textureX, textureY); // Box 2
		bodyModel[658] = new ModelRendererTurbo(this, 371, 125, textureX, textureY); // Box 242
		bodyModel[659] = new ModelRendererTurbo(this, 369, 295, textureX, textureY); // Box 38
		bodyModel[660] = new ModelRendererTurbo(this, 369, 288, textureX, textureY); // Box 38

		bodyModel[500].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F); // Box 128
		bodyModel[500].setRotationPoint(-11F, -4F, -4.75F);

		bodyModel[501].addShapeBox(-1.5F, 0F, -1.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[501].setRotationPoint(-11F, -8F, -4.75F);

		bodyModel[502].addShapeBox(-1.5F, 0F, -1.5F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[502].setRotationPoint(-15F, -5F, -4.75F);

		bodyModel[503].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 128
		bodyModel[503].setRotationPoint(-15F, 0.5F, -4.75F);

		bodyModel[504].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F); // Box 128
		bodyModel[504].setRotationPoint(-15F, -4F, -4.75F);

		bodyModel[505].addShapeBox(-1.5F, 0F, -1.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[505].setRotationPoint(-15F, -8F, -4.75F);

		bodyModel[506].addShapeBox(-1.5F, 0F, -1.5F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[506].setRotationPoint(-19F, -5F, -4.75F);

		bodyModel[507].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 128
		bodyModel[507].setRotationPoint(-19F, 0.5F, -4.75F);

		bodyModel[508].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F); // Box 128
		bodyModel[508].setRotationPoint(-19F, -4F, -4.75F);

		bodyModel[509].addShapeBox(-1.5F, 0F, -1.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[509].setRotationPoint(-19F, -8F, -4.75F);

		bodyModel[510].addShapeBox(-1.5F, 0F, -1.5F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[510].setRotationPoint(-23F, -5F, -4.75F);

		bodyModel[511].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 128
		bodyModel[511].setRotationPoint(-23F, 0.5F, -4.75F);

		bodyModel[512].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F); // Box 128
		bodyModel[512].setRotationPoint(-23F, -4F, -4.75F);

		bodyModel[513].addShapeBox(-1.5F, 0F, -1.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[513].setRotationPoint(-23F, -8F, -4.75F);

		bodyModel[514].addShapeBox(-1.5F, 0F, -1.5F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[514].setRotationPoint(-27F, -5F, -4.5F);
		bodyModel[514].rotateAngleY = -0.26179939F;

		bodyModel[515].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 128
		bodyModel[515].setRotationPoint(-27F, 0.5F, -4.5F);
		bodyModel[515].rotateAngleY = -0.26179939F;

		bodyModel[516].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F); // Box 128
		bodyModel[516].setRotationPoint(-27F, -4F, -4.5F);
		bodyModel[516].rotateAngleY = -0.26179939F;

		bodyModel[517].addShapeBox(-1.5F, 0F, -1.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[517].setRotationPoint(-27F, -8F, -4.5F);
		bodyModel[517].rotateAngleY = -0.26179939F;

		bodyModel[518].addShapeBox(-1.5F, 0F, -1.5F, 4, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[518].setRotationPoint(-31F, -5F, -1.75F);
		bodyModel[518].rotateAngleY = 0.61086524F;

		bodyModel[519].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 128
		bodyModel[519].setRotationPoint(-31F, 0.5F, -1.75F);
		bodyModel[519].rotateAngleY = 0.61086524F;

		bodyModel[520].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F); // Box 128
		bodyModel[520].setRotationPoint(-31F, -4F, -1.75F);
		bodyModel[520].rotateAngleY = 0.61086524F;

		bodyModel[521].addShapeBox(-1.5F, 0F, -1.5F, 1, 3, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[521].setRotationPoint(-31F, -8F, -1.75F);
		bodyModel[521].rotateAngleY = 0.61086524F;

		bodyModel[522].addShapeBox(-1.5F, 0F, -1.5F, 4, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[522].setRotationPoint(-32F, -5F, 2.75F);

		bodyModel[523].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 128
		bodyModel[523].setRotationPoint(-32F, 0.5F, 2.75F);

		bodyModel[524].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F); // Box 128
		bodyModel[524].setRotationPoint(-32F, -4F, 2.75F);

		bodyModel[525].addShapeBox(-1.5F, 0F, -1.5F, 1, 3, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[525].setRotationPoint(-32F, -8F, 2.75F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[526].setRotationPoint(-13.5F, -17F, -1.5F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[527].setRotationPoint(-18.5F, -17F, -1.5F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[528].setRotationPoint(-23.5F, -17F, -1.5F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[529].setRotationPoint(-15.5F, -17F, 6F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[530].setRotationPoint(-20.5F, -17F, 6F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[531].setRotationPoint(-25.5F, -17F, 6F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[532].setRotationPoint(-28.5F, -17F, -1.5F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[533].setRotationPoint(-29F, -17F, 3.5F);

		bodyModel[534].addBox(0F, 0F, 0F, 3, 18, 5, 0F); // Box 38
		bodyModel[534].setRotationPoint(4.5F, -17F, 5F);

		bodyModel[535].addBox(0F, 0F, 0F, 8, 7, 5, 0F); // Box 128
		bodyModel[535].setRotationPoint(-7.5F, -6F, 5F);

		bodyModel[536].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // folding prep surface
		bodyModel[536].setRotationPoint(4.5F, -6F, 5F);

		bodyModel[537].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Box 38
		bodyModel[537].setRotationPoint(0.5F, -17F, 7F);

		bodyModel[538].addBox(0F, 0F, 0F, 8, 6, 3, 0F); // Box 38
		bodyModel[538].setRotationPoint(-7.5F, -17F, 7F);

		bodyModel[539].addShapeBox(-0.2F, -2F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.5F); // Folding sink part R
		bodyModel[539].setRotationPoint(6.69F, -5F, 1.5F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.2F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 128
		bodyModel[540].setRotationPoint(6.49F, -5F, 1.5F);

		bodyModel[541].addShapeBox(-0.2F, -3F, 0F, 1, 1, 3, 0F,-0.3F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.3F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Folding sink part R
		bodyModel[541].setRotationPoint(6.69F, -5F, 1.5F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[542].setRotationPoint(6.99F, -2F, 2.75F);

		bodyModel[543].addBox(0F, 0F, 0F, 1, 18, 5, 0F); // Box 38
		bodyModel[543].setRotationPoint(6.5F, -17F, -5F);

		bodyModel[544].addBox(0F, 0F, 0F, 8, 7, 5, 0F); // Box 128
		bodyModel[544].setRotationPoint(-1.5F, -6F, -5F);

		bodyModel[545].addBox(0F, 0F, 0F, 3, 7, 6, 0F); // Box 128
		bodyModel[545].setRotationPoint(-4.5F, -6F, -5F);

		bodyModel[546].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 128
		bodyModel[546].setRotationPoint(-1.5F, -6F, 0F);

		bodyModel[547].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 128
		bodyModel[547].setRotationPoint(0.5F, -13F, -5F);

		bodyModel[548].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 128
		bodyModel[548].setRotationPoint(0.5F, -10F, -5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[549].setRotationPoint(0.5F, -8.75F, -2F);

		bodyModel[550].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 128
		bodyModel[550].setRotationPoint(5.5F, -10F, -5F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 128
		bodyModel[551].setRotationPoint(3F, -19F, -4F);

		bodyModel[552].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 128
		bodyModel[552].setRotationPoint(-4.5F, -13F, -5F);

		bodyModel[553].addBox(0F, 0F, 0F, 5, 4, 2, 0F); // Box 38
		bodyModel[553].setRotationPoint(-7.5F, -17F, -5F);

		bodyModel[554].addBox(0F, 0F, 0F, 15, 1, 2, 0F); // Box 38
		bodyModel[554].setRotationPoint(-7.5F, -17F, 1.5F);

		bodyModel[555].addBox(0F, 0F, 0F, 15, 0, 1, 0F); // Box 38 glow
		bodyModel[555].setRotationPoint(-7.5F, -15.99F, 2F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.41F, -0.26F, 0F, 0.41F, -0.26F, 0F, 0.41F, -0.74F, 0F, 0.41F, -0.74F); // Box 259
		bodyModel[556].setRotationPoint(1.5F, -18F, -11F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.26F, 0.15F, -1F, -0.26F, 0.15F, -1F); // Box 550
		bodyModel[557].setRotationPoint(15.5F, -17.5F, -10.85F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.26F, 0.15F, -1F, -0.26F, 0.15F, -1F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F); // Box 701
		bodyModel[558].setRotationPoint(15.5F, -17.5F, 9.85F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[559].setRotationPoint(25F, -4.5F, 5.5F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[560].setRotationPoint(26.5F, -4.5F, 5.5F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[561].setRotationPoint(31F, -4.5F, 5.5F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[562].setRotationPoint(32.5F, -4.5F, 5.5F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[563].setRotationPoint(37F, -4.5F, 5.5F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[564].setRotationPoint(38.5F, -4.5F, 5.5F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[565].setRotationPoint(43F, -4.5F, 5.5F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[566].setRotationPoint(20.5F, -4.5F, -9.5F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[567].setRotationPoint(25F, -4.5F, -9.5F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[568].setRotationPoint(26.5F, -4.5F, -9.5F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[569].setRotationPoint(31F, -4.5F, -9.5F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[570].setRotationPoint(32.5F, -4.5F, -9.5F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[571].setRotationPoint(37F, -4.5F, -9.5F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[572].setRotationPoint(38.5F, -4.5F, -9.5F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[573].setRotationPoint(43F, -4.5F, -9.5F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[574].setRotationPoint(5.5F, -8.75F, -2F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0.1F, -0.45F, 0F, 0.1F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.45F, 0F, 0.1F, -0.95F, 0F, 0F, 0F, 0F, 0F); // Box 726
		bodyModel[575].setRotationPoint(51.15F, -20F, 0.1F);

		bodyModel[576].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 38
		bodyModel[576].setRotationPoint(-7.5F, -17F, -3F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.02F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -0.5F, 0F, -0.02F, -0.5F); // Box 275 cull
		bodyModel[577].setRotationPoint(51.85F, -7.99F, -0.75F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275 cull
		bodyModel[578].setRotationPoint(51.85F, -8.5F, 0F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 275 cull
		bodyModel[579].setRotationPoint(51.35F, -8F, -1.25F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.26F, -0.01F, -0.26F, -0.76F, -0.01F, -0.26F, -0.76F, -0.01F, -0.76F, -0.26F, -0.01F, -0.76F, -0.135F, -0.5F, -0.135F, -0.635F, -0.5F, -0.135F, -0.635F, -0.5F, -0.635F, -0.135F, -0.5F, -0.635F); // Box 275 glow
		bodyModel[580].setRotationPoint(51.35F, -8F, -1.25F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 3, 0, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F); // Box 275 cull
		bodyModel[581].setRotationPoint(51.6F, -8F, -1F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, -3F, 0F, 3.75F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 3.75F, 0F, 0F, -4F, -3F, 0F, 0F); // Box 128
		bodyModel[582].setRotationPoint(-51.5F, -6F, 5F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 5, 4, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[583].setRotationPoint(-45.5F, -10F, 9.98F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[584].setRotationPoint(-55.5F, -12F, 3F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[585].setRotationPoint(-55.5F, -8F, 3F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[586].setRotationPoint(-55.5F, -4F, 3F);

		bodyModel[587].addBox(0F, 0F, 0F, 38, 1, 0, 0F); // Box 38
		bodyModel[587].setRotationPoint(-33.5F, -8F, -9.99F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[588].setRotationPoint(-63.5F, -7F, -10F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[589].setRotationPoint(-63.5F, -7F, 5F);

		bodyModel[590].addShapeBox(0F, 2F, -2F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 550
		bodyModel[590].setRotationPoint(-60.49F, 0.75F, -4.5F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 552
		bodyModel[591].setRotationPoint(-60.49F, 4.5F, -8F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[592].setRotationPoint(-60.49F, 4.5F, -8.5F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[593].setRotationPoint(-60.49F, 8F, -11.5F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 555
		bodyModel[594].setRotationPoint(-56.51F, 3F, -10F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[595].setRotationPoint(-56.51F, 3F, -11.5F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[596].setRotationPoint(-60.49F, 6.25F, -10F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 558
		bodyModel[597].setRotationPoint(-60.49F, 6.25F, -9.5F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 559
		bodyModel[598].setRotationPoint(-60.49F, 3F, -10F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[599].setRotationPoint(-60.49F, 3F, -11.5F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[600].setRotationPoint(-60.5F, 3F, -7.5F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[601].setRotationPoint(-56.5F, 3F, -7.5F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[602].setRotationPoint(-56.5F, 3F, -10.5F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[603].setRotationPoint(-60.5F, 3F, -10.5F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[604].setRotationPoint(-56.5F, 4F, -10.5F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[605].setRotationPoint(-60.5F, 4F, -10.5F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[606].setRotationPoint(-60.49F, 3F, -7F);

		bodyModel[607].addShapeBox(0F, 2F, -2F, 4, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[607].setRotationPoint(-60.5F, 0.75F, -5F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[608].setRotationPoint(-60.49F, 3F, -7F);

		bodyModel[609].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[609].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[610].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[610].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[611].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[611].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[612].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[612].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[613].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[613].setRotationPoint(-56.51F, 4F, -8F);

		bodyModel[614].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[614].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[615].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[615].setRotationPoint(-56.51F, 4F, -8F);

		bodyModel[616].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[616].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[617].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[617].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[618].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[618].setRotationPoint(-56.51F, 4F, -8F);

		bodyModel[619].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[619].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[620].addShapeBox(0F, 2F, -2F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[620].setRotationPoint(-60.49F, 0.75F, 8.5F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[621].setRotationPoint(-60.49F, 4.5F, 8F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[622].setRotationPoint(-60.49F, 4.5F, 6.5F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[623].setRotationPoint(-60.49F, 8F, 9.5F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[624].setRotationPoint(-56.51F, 3F, 5F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[625].setRotationPoint(-56.51F, 3F, 9.5F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[626].setRotationPoint(-60.49F, 6.25F, 8F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[627].setRotationPoint(-60.49F, 6.25F, 9.5F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[628].setRotationPoint(-60.49F, 3F, 5F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[629].setRotationPoint(-60.49F, 3F, 9.5F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[630].setRotationPoint(-60.5F, 3F, 4.5F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[631].setRotationPoint(-56.5F, 3F, 4.5F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[632].setRotationPoint(-56.5F, 3F, 7.5F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[633].setRotationPoint(-60.5F, 3F, 7.5F);

		bodyModel[634].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1359
		bodyModel[634].setRotationPoint(-56.5F, 4F, 7.5F);

		bodyModel[635].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1360
		bodyModel[635].setRotationPoint(-60.5F, 4F, 7.5F);

		bodyModel[636].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[636].setRotationPoint(-60.49F, 3F, 5F);

		bodyModel[637].addShapeBox(0F, 2F, -2F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[637].setRotationPoint(-60.5F, 0.75F, 7F);

		bodyModel[638].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[638].setRotationPoint(-60.49F, 3F, 7F);

		bodyModel[639].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[639].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[640].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[640].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[641].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[641].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[642].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[642].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[643].addShapeBox(0F, 2F, 0.5F, 4, 0, 2, 0F,0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[643].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[644].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[644].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[645].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[645].setRotationPoint(-56.51F, 4F, 8F);

		bodyModel[646].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[646].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[647].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[647].setRotationPoint(-56.51F, 4F, 8F);

		bodyModel[648].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[648].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[649].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[649].setRotationPoint(-56.51F, 4F, 8F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[650].setRotationPoint(-52.5F, -16F, -10F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 564
		bodyModel[651].setRotationPoint(-52.5F, -16F, 9F);

		bodyModel[652].addShapeBox(0.62F, 0F, -4F, 1, 6, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[652].setRotationPoint(60F, -6F, 2F);

		bodyModel[653].addShapeBox(1.38F, 0F, -4F, 0, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -4F, -4F); // tail sign glow
		bodyModel[653].setRotationPoint(60F, -6F, 2F);

		bodyModel[654].addShapeBox(0.62F, 0F, -4F, 1, 1, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[654].setRotationPoint(60F, 0F, 2F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 2
		bodyModel[655].setRotationPoint(60.5F, 2F, -2F);

		bodyModel[656].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 240
		bodyModel[656].setRotationPoint(60.5F, 2F, 0F);

		bodyModel[657].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 2
		bodyModel[657].setRotationPoint(59.5F, 2F, -4F);

		bodyModel[658].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 242
		bodyModel[658].setRotationPoint(59.5F, 2F, 2F);

		bodyModel[659].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 38
		bodyModel[659].setRotationPoint(16.5F, -8F, -10F);

		bodyModel[660].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 38
		bodyModel[660].setRotationPoint(16.5F, -14F, -10F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 661; i++)
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