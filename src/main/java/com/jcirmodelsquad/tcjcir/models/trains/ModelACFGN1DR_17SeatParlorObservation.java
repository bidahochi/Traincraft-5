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

public class ModelACFGN1DR_17SeatParlorObservation extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelACFGN1DR_17SeatParlorObservation() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[715];

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
		bodyModel[6] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 283, 122, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 33, 114, textureX, textureY); // Left trapdoor
		bodyModel[10] = new ModelRendererTurbo(this, 35, 129, textureX, textureY); // Right trapdoor
		bodyModel[11] = new ModelRendererTurbo(this, 72, 69, textureX, textureY); // Left side door
		bodyModel[12] = new ModelRendererTurbo(this, 83, 68, textureX, textureY); // Box 38
		bodyModel[13] = new ModelRendererTurbo(this, 83, 87, textureX, textureY); // Box 128
		bodyModel[14] = new ModelRendererTurbo(this, 28, 90, textureX, textureY); // Box 128
		bodyModel[15] = new ModelRendererTurbo(this, 29, 56, textureX, textureY); // Box 128
		bodyModel[16] = new ModelRendererTurbo(this, 45, 30, textureX, textureY); // Box 128
		bodyModel[17] = new ModelRendererTurbo(this, 44, 5, textureX, textureY); // Box 128
		bodyModel[18] = new ModelRendererTurbo(this, 72, 90, textureX, textureY); // Right side door
		bodyModel[19] = new ModelRendererTurbo(this, 35, 81, textureX, textureY); // Box 128
		bodyModel[20] = new ModelRendererTurbo(this, 29, 17, textureX, textureY); // Box 128
		bodyModel[21] = new ModelRendererTurbo(this, 72, 66, textureX, textureY); // Box 128
		bodyModel[22] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[23] = new ModelRendererTurbo(this, 20, 75, textureX, textureY); // Vestibule door
		bodyModel[24] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[25] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[26] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[27] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[28] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[29] = new ModelRendererTurbo(this, 72, 218, textureX, textureY); // Box 128
		bodyModel[30] = new ModelRendererTurbo(this, 72, 196, textureX, textureY); // Box 177
		bodyModel[31] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[32] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[33] = new ModelRendererTurbo(this, 32, 24, textureX, textureY); // Front gate closed
		bodyModel[34] = new ModelRendererTurbo(this, 29, 29, textureX, textureY); // Front gate open
		bodyModel[35] = new ModelRendererTurbo(this, 101, 7, textureX, textureY); // Box 128
		bodyModel[36] = new ModelRendererTurbo(this, 96, 14, textureX, textureY); // Box 128
		bodyModel[37] = new ModelRendererTurbo(this, 96, 2, textureX, textureY); // Box 176
		bodyModel[38] = new ModelRendererTurbo(this, 63, 3, textureX, textureY); // Box 128
		bodyModel[39] = new ModelRendererTurbo(this, 72, 202, textureX, textureY); // Box 128
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
		bodyModel[75] = new ModelRendererTurbo(this, 72, 228, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 72, 187, textureX, textureY); // Box 193
		bodyModel[77] = new ModelRendererTurbo(this, 72, 224, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 72, 192, textureX, textureY); // Box 194
		bodyModel[79] = new ModelRendererTurbo(this, 282, 108, textureX, textureY); // Box 2
		bodyModel[80] = new ModelRendererTurbo(this, 317, 118, textureX, textureY); // Box 2
		bodyModel[81] = new ModelRendererTurbo(this, 294, 68, textureX, textureY); // Box 38
		bodyModel[82] = new ModelRendererTurbo(this, 326, 111, textureX, textureY); // Box 2
		bodyModel[83] = new ModelRendererTurbo(this, 345, 117, textureX, textureY); // Box 2
		bodyModel[84] = new ModelRendererTurbo(this, 355, 113, textureX, textureY); // Box 2
		bodyModel[85] = new ModelRendererTurbo(this, 333, 71, textureX, textureY); // Rear end door part
		bodyModel[86] = new ModelRendererTurbo(this, 333, 94, textureX, textureY); // Rear end door part
		bodyModel[87] = new ModelRendererTurbo(this, 366, 118, textureX, textureY); // Box 2
		bodyModel[88] = new ModelRendererTurbo(this, 357, 120, textureX, textureY); // Box 2
		bodyModel[89] = new ModelRendererTurbo(this, 345, 111, textureX, textureY); // Box 161
		bodyModel[90] = new ModelRendererTurbo(this, 366, 112, textureX, textureY); // Box 162
		bodyModel[91] = new ModelRendererTurbo(this, 355, 106, textureX, textureY); // Box 163
		bodyModel[92] = new ModelRendererTurbo(this, 322, 65, textureX, textureY); // Box 2
		bodyModel[93] = new ModelRendererTurbo(this, 334, 63, textureX, textureY); // Box 2
		bodyModel[94] = new ModelRendererTurbo(this, 334, 86, textureX, textureY); // Box 168
		bodyModel[95] = new ModelRendererTurbo(this, 313, 68, textureX, textureY); // Box 38
		bodyModel[96] = new ModelRendererTurbo(this, 317, 113, textureX, textureY); // Box 174
		bodyModel[97] = new ModelRendererTurbo(this, 294, 87, textureX, textureY); // Box 175
		bodyModel[98] = new ModelRendererTurbo(this, 322, 86, textureX, textureY); // Box 176
		bodyModel[99] = new ModelRendererTurbo(this, 313, 87, textureX, textureY); // Box 177
		bodyModel[100] = new ModelRendererTurbo(this, 296, 64, textureX, textureY); // Box 38
		bodyModel[101] = new ModelRendererTurbo(this, 318, 61, textureX, textureY); // Box 38
		bodyModel[102] = new ModelRendererTurbo(this, 341, 60, textureX, textureY); // Box 2
		bodyModel[103] = new ModelRendererTurbo(this, 296, 22, textureX, textureY); // Box 182
		bodyModel[104] = new ModelRendererTurbo(this, 317, 25, textureX, textureY); // Box 183
		bodyModel[105] = new ModelRendererTurbo(this, 319, 19, textureX, textureY); // Box 184
		bodyModel[106] = new ModelRendererTurbo(this, 295, 59, textureX, textureY); // Box 128
		bodyModel[107] = new ModelRendererTurbo(this, 295, 26, textureX, textureY); // Box 188
		bodyModel[108] = new ModelRendererTurbo(this, 327, 58, textureX, textureY); // Box 128
		bodyModel[109] = new ModelRendererTurbo(this, 325, 29, textureX, textureY); // Box 191
		bodyModel[110] = new ModelRendererTurbo(this, 339, 54, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 328, 23, textureX, textureY); // Box 196
		bodyModel[112] = new ModelRendererTurbo(this, 309, 38, textureX, textureY); // Box 128
		bodyModel[113] = new ModelRendererTurbo(this, 316, 48, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 295, 51, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 308, 53, textureX, textureY); // Box 128
		bodyModel[116] = new ModelRendererTurbo(this, 316, 33, textureX, textureY); // Box 205
		bodyModel[117] = new ModelRendererTurbo(this, 297, 37, textureX, textureY); // Box 206
		bodyModel[118] = new ModelRendererTurbo(this, 295, 31, textureX, textureY); // Box 207
		bodyModel[119] = new ModelRendererTurbo(this, 329, 51, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 329, 40, textureX, textureY); // Box 214
		bodyModel[121] = new ModelRendererTurbo(this, 330, 52, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 325, 34, textureX, textureY); // Box 220
		bodyModel[123] = new ModelRendererTurbo(this, 340, 48, textureX, textureY); // Box 128
		bodyModel[124] = new ModelRendererTurbo(this, 334, 30, textureX, textureY); // Box 222
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
		bodyModel[138] = new ModelRendererTurbo(this, 373, 117, textureX, textureY); // Box 2
		bodyModel[139] = new ModelRendererTurbo(this, 373, 113, textureX, textureY); // Box 240
		bodyModel[140] = new ModelRendererTurbo(this, 371, 121, textureX, textureY); // Box 2
		bodyModel[141] = new ModelRendererTurbo(this, 371, 109, textureX, textureY); // Box 242
		bodyModel[142] = new ModelRendererTurbo(this, 350, 63, textureX, textureY); // Box 128
		bodyModel[143] = new ModelRendererTurbo(this, 350, 56, textureX, textureY); // Box 128
		bodyModel[144] = new ModelRendererTurbo(this, 360, 49, textureX, textureY); // Box 128
		bodyModel[145] = new ModelRendererTurbo(this, 369, 46, textureX, textureY); // Box 128
		bodyModel[146] = new ModelRendererTurbo(this, 382, 46, textureX, textureY); // Box 128
		bodyModel[147] = new ModelRendererTurbo(this, 343, 25, textureX, textureY); // Box 248
		bodyModel[148] = new ModelRendererTurbo(this, 343, 32, textureX, textureY); // Box 249
		bodyModel[149] = new ModelRendererTurbo(this, 360, 35, textureX, textureY); // Box 250
		bodyModel[150] = new ModelRendererTurbo(this, 369, 38, textureX, textureY); // Box 251
		bodyModel[151] = new ModelRendererTurbo(this, 382, 38, textureX, textureY); // Box 252
		bodyModel[152] = new ModelRendererTurbo(this, 363, 63, textureX, textureY); // Box 128
		bodyModel[153] = new ModelRendererTurbo(this, 360, 31, textureX, textureY); // Box 254
		bodyModel[154] = new ModelRendererTurbo(this, 373, 53, textureX, textureY); // Box 128
		bodyModel[155] = new ModelRendererTurbo(this, 375, 34, textureX, textureY); // Box 256
		bodyModel[156] = new ModelRendererTurbo(this, 395, 49, textureX, textureY); // Box 128
		bodyModel[157] = new ModelRendererTurbo(this, 395, 41, textureX, textureY); // Box 258
		bodyModel[158] = new ModelRendererTurbo(this, 384, 53, textureX, textureY); // Box 128
		bodyModel[159] = new ModelRendererTurbo(this, 386, 34, textureX, textureY); // Box 260
		bodyModel[160] = new ModelRendererTurbo(this, 364, 67, textureX, textureY); // Box 128
		bodyModel[161] = new ModelRendererTurbo(this, 360, 26, textureX, textureY); // Box 269
		bodyModel[162] = new ModelRendererTurbo(this, 390, 54, textureX, textureY); // Box 128
		bodyModel[163] = new ModelRendererTurbo(this, 380, 29, textureX, textureY); // Box 272
		bodyModel[164] = new ModelRendererTurbo(this, 379, 57, textureX, textureY); // Box 128
		bodyModel[165] = new ModelRendererTurbo(this, 391, 35, textureX, textureY); // Box 274
		bodyModel[166] = new ModelRendererTurbo(this, 404, 49, textureX, textureY); // Box 128
		bodyModel[167] = new ModelRendererTurbo(this, 404, 41, textureX, textureY); // Box 276
		bodyModel[168] = new ModelRendererTurbo(this, 328, 46, textureX, textureY); // Box 128
		bodyModel[169] = new ModelRendererTurbo(this, 334, 42, textureX, textureY); // Box 726
		bodyModel[170] = new ModelRendererTurbo(this, 349, 48, textureX, textureY); // Box 128
		bodyModel[171] = new ModelRendererTurbo(this, 353, 44, textureX, textureY); // Box 200
		bodyModel[172] = new ModelRendererTurbo(this, 340, 42, textureX, textureY); // Box 128
		bodyModel[173] = new ModelRendererTurbo(this, 334, 36, textureX, textureY); // Box 224
		bodyModel[174] = new ModelRendererTurbo(this, 383, 121, textureX, textureY); // Box 2
		bodyModel[175] = new ModelRendererTurbo(this, 380, 104, textureX, textureY,"lamp"); // tail sign glow
		bodyModel[176] = new ModelRendererTurbo(this, 435, 39, textureX, textureY); // Box 103
		bodyModel[177] = new ModelRendererTurbo(this, 434, 43, textureX, textureY); // Box 103
		bodyModel[178] = new ModelRendererTurbo(this, 434, 48, textureX, textureY); // Box 103
		bodyModel[179] = new ModelRendererTurbo(this, 435, 52, textureX, textureY); // Box 103
		bodyModel[180] = new ModelRendererTurbo(this, 435, 35, textureX, textureY); // Box 103
		bodyModel[181] = new ModelRendererTurbo(this, 435, 56, textureX, textureY); // Box 103
		bodyModel[182] = new ModelRendererTurbo(this, 434, 31, textureX, textureY); // Box 103
		bodyModel[183] = new ModelRendererTurbo(this, 434, 60, textureX, textureY); // Box 103
		bodyModel[184] = new ModelRendererTurbo(this, 415, 48, textureX, textureY); // Box 165
		bodyModel[185] = new ModelRendererTurbo(this, 415, 41, textureX, textureY); // Box 164
		bodyModel[186] = new ModelRendererTurbo(this, 427, 36, textureX, textureY); // Box 167
		bodyModel[187] = new ModelRendererTurbo(this, 427, 53, textureX, textureY); // Box 166
		bodyModel[188] = new ModelRendererTurbo(this, 451, 54, textureX, textureY); // Box 2
		bodyModel[189] = new ModelRendererTurbo(this, 451, 38, textureX, textureY); // Box 307
		bodyModel[190] = new ModelRendererTurbo(this, 420, 53, textureX, textureY); // Box 166
		bodyModel[191] = new ModelRendererTurbo(this, 420, 36, textureX, textureY); // Box 309
		bodyModel[192] = new ModelRendererTurbo(this, 451, 51, textureX, textureY); // Box 2
		bodyModel[193] = new ModelRendererTurbo(this, 451, 41, textureX, textureY); // Box 311
		bodyModel[194] = new ModelRendererTurbo(this, 451, 48, textureX, textureY); // Box 2
		bodyModel[195] = new ModelRendererTurbo(this, 451, 44, textureX, textureY); // Box 313
		bodyModel[196] = new ModelRendererTurbo(this, 444, 42, textureX, textureY,"lamp"); // Box 186 rear MARS light R
		bodyModel[197] = new ModelRendererTurbo(this, 444, 48, textureX, textureY,"lamp"); // Box 187 rear MARS light W
		bodyModel[198] = new ModelRendererTurbo(this, 441, 50, textureX, textureY); // Box 405
		bodyModel[199] = new ModelRendererTurbo(this, 441, 40, textureX, textureY); // Box 317
		bodyModel[200] = new ModelRendererTurbo(this, 441, 47, textureX, textureY); // Box 405
		bodyModel[201] = new ModelRendererTurbo(this, 441, 43, textureX, textureY); // Box 319
		bodyModel[202] = new ModelRendererTurbo(this, 347, 72, textureX, textureY); // Box 38
		bodyModel[203] = new ModelRendererTurbo(this, 352, 72, textureX, textureY,"lamp"); // marker light glow
		bodyModel[204] = new ModelRendererTurbo(this, 342, 72, textureX, textureY); // Box 38
		bodyModel[205] = new ModelRendererTurbo(this, 347, 87, textureX, textureY); // Box 290
		bodyModel[206] = new ModelRendererTurbo(this, 352, 87, textureX, textureY,"lamp"); // marker light glow
		bodyModel[207] = new ModelRendererTurbo(this, 342, 87, textureX, textureY); // Box 292
		bodyModel[208] = new ModelRendererTurbo(this, 283, 138, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[209] = new ModelRendererTurbo(this, 283, 143, textureX, textureY); // Box 31
		bodyModel[210] = new ModelRendererTurbo(this, 283, 148, textureX, textureY,"cull"); // Box 475 cull
		bodyModel[211] = new ModelRendererTurbo(this, 283, 153, textureX, textureY); // Box 476
		bodyModel[212] = new ModelRendererTurbo(this, 290, 147, textureX, textureY); // Box 31
		bodyModel[213] = new ModelRendererTurbo(this, 290, 137, textureX, textureY); // Box 325
		bodyModel[214] = new ModelRendererTurbo(this, 341, 75, textureX, textureY); // Box 38
		bodyModel[215] = new ModelRendererTurbo(this, 341, 90, textureX, textureY); // Box 327
		bodyModel[216] = new ModelRendererTurbo(this, 288, 143, textureX, textureY); // Box 38
		bodyModel[217] = new ModelRendererTurbo(this, 288, 153, textureX, textureY); // Box 329
		bodyModel[218] = new ModelRendererTurbo(this, 435, 67, textureX, textureY); // Box 550
		bodyModel[219] = new ModelRendererTurbo(this, 435, 73, textureX, textureY); // Box 552
		bodyModel[220] = new ModelRendererTurbo(this, 433, 70, textureX, textureY); // Box 553
		bodyModel[221] = new ModelRendererTurbo(this, 433, 82, textureX, textureY); // Box 554
		bodyModel[222] = new ModelRendererTurbo(this, 444, 68, textureX, textureY); // Box 555
		bodyModel[223] = new ModelRendererTurbo(this, 450, 65, textureX, textureY); // Box 556
		bodyModel[224] = new ModelRendererTurbo(this, 433, 76, textureX, textureY); // Box 557
		bodyModel[225] = new ModelRendererTurbo(this, 435, 79, textureX, textureY); // Box 558
		bodyModel[226] = new ModelRendererTurbo(this, 424, 69, textureX, textureY); // Box 559
		bodyModel[227] = new ModelRendererTurbo(this, 424, 66, textureX, textureY); // Box 560
		bodyModel[228] = new ModelRendererTurbo(this, 428, 84, textureX, textureY); // Box 26
		bodyModel[229] = new ModelRendererTurbo(this, 444, 84, textureX, textureY); // Box 26
		bodyModel[230] = new ModelRendererTurbo(this, 444, 82, textureX, textureY); // Box 26
		bodyModel[231] = new ModelRendererTurbo(this, 428, 82, textureX, textureY); // Box 26
		bodyModel[232] = new ModelRendererTurbo(this, 444, 88, textureX, textureY); // Box 26
		bodyModel[233] = new ModelRendererTurbo(this, 428, 88, textureX, textureY); // Box 26
		bodyModel[234] = new ModelRendererTurbo(this, 433, 85, textureX, textureY); // Box 26
		bodyModel[235] = new ModelRendererTurbo(this, 435, 88, textureX, textureY); // Box 26
		bodyModel[236] = new ModelRendererTurbo(this, 435, 102, textureX, textureY); // Left step part
		bodyModel[237] = new ModelRendererTurbo(this, 435, 98, textureX, textureY); // Left step part
		bodyModel[238] = new ModelRendererTurbo(this, 435, 92, textureX, textureY); // Left step part
		bodyModel[239] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Left step part
		bodyModel[240] = new ModelRendererTurbo(this, 444, 98, textureX, textureY); // Left step part
		bodyModel[241] = new ModelRendererTurbo(this, 430, 98, textureX, textureY); // Left step part
		bodyModel[242] = new ModelRendererTurbo(this, 444, 96, textureX, textureY); // Left step part
		bodyModel[243] = new ModelRendererTurbo(this, 430, 96, textureX, textureY); // Left step part
		bodyModel[244] = new ModelRendererTurbo(this, 430, 93, textureX, textureY); // Left step part
		bodyModel[245] = new ModelRendererTurbo(this, 444, 93, textureX, textureY); // Left step part
		bodyModel[246] = new ModelRendererTurbo(this, 433, 95, textureX, textureY); // Left step part
		bodyModel[247] = new ModelRendererTurbo(this, 404, 67, textureX, textureY); // Right step part
		bodyModel[248] = new ModelRendererTurbo(this, 404, 73, textureX, textureY); // Right step part
		bodyModel[249] = new ModelRendererTurbo(this, 402, 70, textureX, textureY); // Right step part
		bodyModel[250] = new ModelRendererTurbo(this, 402, 82, textureX, textureY); // Right step part
		bodyModel[251] = new ModelRendererTurbo(this, 413, 69, textureX, textureY); // Box 142
		bodyModel[252] = new ModelRendererTurbo(this, 419, 66, textureX, textureY); // Right step part
		bodyModel[253] = new ModelRendererTurbo(this, 402, 76, textureX, textureY); // Right step part
		bodyModel[254] = new ModelRendererTurbo(this, 404, 79, textureX, textureY); // Right step part
		bodyModel[255] = new ModelRendererTurbo(this, 393, 69, textureX, textureY); // Box 142
		bodyModel[256] = new ModelRendererTurbo(this, 393, 66, textureX, textureY); // Right step part
		bodyModel[257] = new ModelRendererTurbo(this, 397, 84, textureX, textureY); // Box 1353
		bodyModel[258] = new ModelRendererTurbo(this, 413, 84, textureX, textureY); // Box 1354
		bodyModel[259] = new ModelRendererTurbo(this, 413, 82, textureX, textureY); // Box 1357
		bodyModel[260] = new ModelRendererTurbo(this, 397, 82, textureX, textureY); // Box 1358
		bodyModel[261] = new ModelRendererTurbo(this, 413, 88, textureX, textureY); // Box 1359
		bodyModel[262] = new ModelRendererTurbo(this, 397, 88, textureX, textureY); // Box 1360
		bodyModel[263] = new ModelRendererTurbo(this, 402, 85, textureX, textureY); // Box 1356
		bodyModel[264] = new ModelRendererTurbo(this, 402, 64, textureX, textureY); // Right step part
		bodyModel[265] = new ModelRendererTurbo(this, 404, 88, textureX, textureY); // Box 1355
		bodyModel[266] = new ModelRendererTurbo(this, 433, 64, textureX, textureY); // Box 551
		bodyModel[267] = new ModelRendererTurbo(this, 404, 98, textureX, textureY); // Right step part
		bodyModel[268] = new ModelRendererTurbo(this, 404, 102, textureX, textureY); // Right step part
		bodyModel[269] = new ModelRendererTurbo(this, 404, 92, textureX, textureY); // Right step part
		bodyModel[270] = new ModelRendererTurbo(this, 402, 95, textureX, textureY); // Right step part
		bodyModel[271] = new ModelRendererTurbo(this, 402, 105, textureX, textureY); // Right step part
		bodyModel[272] = new ModelRendererTurbo(this, 399, 96, textureX, textureY); // Right step part
		bodyModel[273] = new ModelRendererTurbo(this, 413, 96, textureX, textureY); // Right step part
		bodyModel[274] = new ModelRendererTurbo(this, 399, 98, textureX, textureY); // Right step part
		bodyModel[275] = new ModelRendererTurbo(this, 413, 98, textureX, textureY); // Right step part
		bodyModel[276] = new ModelRendererTurbo(this, 399, 93, textureX, textureY); // Right step part
		bodyModel[277] = new ModelRendererTurbo(this, 413, 93, textureX, textureY); // Right step part
		bodyModel[278] = new ModelRendererTurbo(this, 51, 69, textureX, textureY); // Box 128
		bodyModel[279] = new ModelRendererTurbo(this, 63, 69, textureX, textureY); // Box 128
		bodyModel[280] = new ModelRendererTurbo(this, 51, 90, textureX, textureY); // Box 202
		bodyModel[281] = new ModelRendererTurbo(this, 63, 90, textureX, textureY); // Box 203
		bodyModel[282] = new ModelRendererTurbo(this, 22, 5, textureX, textureY); // Box 128
		bodyModel[283] = new ModelRendererTurbo(this, 1, 5, textureX, textureY); // Box 153
		bodyModel[284] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 128
		bodyModel[285] = new ModelRendererTurbo(this, 3, 114, textureX, textureY); // Box 38
		bodyModel[286] = new ModelRendererTurbo(this, 10, 103, textureX, textureY); // Box 38
		bodyModel[287] = new ModelRendererTurbo(this, 2, 110, textureX, textureY); // Box 128
		bodyModel[288] = new ModelRendererTurbo(this, 8, 100, textureX, textureY); // Box 128
		bodyModel[289] = new ModelRendererTurbo(this, 1, 141, textureX, textureY); // Box 128
		bodyModel[290] = new ModelRendererTurbo(this, 1, 104, textureX, textureY); // Box 128
		bodyModel[291] = new ModelRendererTurbo(this, 7, 96, textureX, textureY); // Box 128
		bodyModel[292] = new ModelRendererTurbo(this, 2, 99, textureX, textureY); // Box 128
		bodyModel[293] = new ModelRendererTurbo(this, 6, 91, textureX, textureY); // Box 128
		bodyModel[294] = new ModelRendererTurbo(this, 2, 83, textureX, textureY); // Box 128
		bodyModel[295] = new ModelRendererTurbo(this, 5, 82, textureX, textureY); // Box 128
		bodyModel[296] = new ModelRendererTurbo(this, 2, 91, textureX, textureY); // Box 128
		bodyModel[297] = new ModelRendererTurbo(this, 3, 43, textureX, textureY); // Box 247
		bodyModel[298] = new ModelRendererTurbo(this, 10, 51, textureX, textureY); // Box 248
		bodyModel[299] = new ModelRendererTurbo(this, 2, 63, textureX, textureY); // Box 249
		bodyModel[300] = new ModelRendererTurbo(this, 8, 70, textureX, textureY); // Box 250
		bodyModel[301] = new ModelRendererTurbo(this, 1, 67, textureX, textureY); // Box 251
		bodyModel[302] = new ModelRendererTurbo(this, 7, 73, textureX, textureY); // Box 252
		bodyModel[303] = new ModelRendererTurbo(this, 2, 73, textureX, textureY); // Box 253
		bodyModel[304] = new ModelRendererTurbo(this, 6, 77, textureX, textureY); // Box 254
		bodyModel[305] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Box 255
		bodyModel[306] = new ModelRendererTurbo(this, 8, 119, textureX, textureY); // Box 128
		bodyModel[307] = new ModelRendererTurbo(this, 8, 117, textureX, textureY); // Box 261
		bodyModel[308] = new ModelRendererTurbo(this, 48, 104, textureX, textureY); // Box 2
		bodyModel[309] = new ModelRendererTurbo(this, 341, 228, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[310] = new ModelRendererTurbo(this, 342, 231, textureX, textureY); // Box 275
		bodyModel[311] = new ModelRendererTurbo(this, 327, 220, textureX, textureY,"lamp"); // Box 485 glow
		bodyModel[312] = new ModelRendererTurbo(this, 328, 223, textureX, textureY); // Box 486
		bodyModel[313] = new ModelRendererTurbo(this, 466, 228, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[314] = new ModelRendererTurbo(this, 468, 231, textureX, textureY); // Box 38
		bodyModel[315] = new ModelRendererTurbo(this, 466, 220, textureX, textureY,"lamp"); // Box 490 glow
		bodyModel[316] = new ModelRendererTurbo(this, 467, 223, textureX, textureY); // Box 491
		bodyModel[317] = new ModelRendererTurbo(this, 485, 228, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[318] = new ModelRendererTurbo(this, 486, 231, textureX, textureY); // Box 38
		bodyModel[319] = new ModelRendererTurbo(this, 485, 220, textureX, textureY,"lamp"); // Box 495 glow
		bodyModel[320] = new ModelRendererTurbo(this, 486, 223, textureX, textureY); // Box 496
		bodyModel[321] = new ModelRendererTurbo(this, 494, 225, textureX, textureY,"lamp"); // Box 2 glow
		bodyModel[322] = new ModelRendererTurbo(this, 496, 228, textureX, textureY); // Box 2
		bodyModel[323] = new ModelRendererTurbo(this, 494, 217, textureX, textureY,"lamp"); // Box 506 glow
		bodyModel[324] = new ModelRendererTurbo(this, 496, 220, textureX, textureY); // Box 507
		bodyModel[325] = new ModelRendererTurbo(this, 505, 227, textureX, textureY,"lamp"); // Box 2 glow
		bodyModel[326] = new ModelRendererTurbo(this, 506, 229, textureX, textureY); // Box 2
		bodyModel[327] = new ModelRendererTurbo(this, 505, 219, textureX, textureY,"lamp"); // Box 510 glow
		bodyModel[328] = new ModelRendererTurbo(this, 506, 221, textureX, textureY); // Box 511
		bodyModel[329] = new ModelRendererTurbo(this, 492, 318, textureX, textureY); // Box 527
		bodyModel[330] = new ModelRendererTurbo(this, 492, 330, textureX, textureY); // Box 532
		bodyModel[331] = new ModelRendererTurbo(this, 489, 342, textureX, textureY); // Box 526
		bodyModel[332] = new ModelRendererTurbo(this, 489, 344, textureX, textureY); // Box 532
		bodyModel[333] = new ModelRendererTurbo(this, 503, 344, textureX, textureY); // Box 574
		bodyModel[334] = new ModelRendererTurbo(this, 461, 346, textureX, textureY); // Box 526
		bodyModel[335] = new ModelRendererTurbo(this, 464, 337, textureX, textureY); // Box 527
		bodyModel[336] = new ModelRendererTurbo(this, 450, 345, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[337] = new ModelRendererTurbo(this, 470, 345, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[338] = new ModelRendererTurbo(this, 461, 317, textureX, textureY); // Box 558
		bodyModel[339] = new ModelRendererTurbo(this, 464, 308, textureX, textureY); // Box 559
		bodyModel[340] = new ModelRendererTurbo(this, 450, 316, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[341] = new ModelRendererTurbo(this, 470, 316, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[342] = new ModelRendererTurbo(this, 422, 346, textureX, textureY); // Box 526
		bodyModel[343] = new ModelRendererTurbo(this, 425, 337, textureX, textureY); // Box 527
		bodyModel[344] = new ModelRendererTurbo(this, 411, 345, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[345] = new ModelRendererTurbo(this, 431, 345, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[346] = new ModelRendererTurbo(this, 425, 308, textureX, textureY); // Box 559
		bodyModel[347] = new ModelRendererTurbo(this, 411, 316, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[348] = new ModelRendererTurbo(this, 431, 316, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[349] = new ModelRendererTurbo(this, 383, 346, textureX, textureY); // Box 526
		bodyModel[350] = new ModelRendererTurbo(this, 386, 337, textureX, textureY); // Box 527
		bodyModel[351] = new ModelRendererTurbo(this, 372, 345, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[352] = new ModelRendererTurbo(this, 392, 345, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[353] = new ModelRendererTurbo(this, 386, 308, textureX, textureY); // Box 559
		bodyModel[354] = new ModelRendererTurbo(this, 372, 316, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[355] = new ModelRendererTurbo(this, 392, 316, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[356] = new ModelRendererTurbo(this, 422, 317, textureX, textureY); // Box 558
		bodyModel[357] = new ModelRendererTurbo(this, 383, 317, textureX, textureY); // Box 558
		bodyModel[358] = new ModelRendererTurbo(this, 277, 253, textureX, textureY); // Right seat part
		bodyModel[359] = new ModelRendererTurbo(this, 305, 253, textureX, textureY); // Right seat part
		bodyModel[360] = new ModelRendererTurbo(this, 284, 249, textureX, textureY); // Right seat part
		bodyModel[361] = new ModelRendererTurbo(this, 288, 233, textureX, textureY); // Right seat part
		bodyModel[362] = new ModelRendererTurbo(this, 303, 262, textureX, textureY); // Right seat part
		bodyModel[363] = new ModelRendererTurbo(this, 303, 259, textureX, textureY); // Right seat part
		bodyModel[364] = new ModelRendererTurbo(this, 277, 262, textureX, textureY); // Right seat part
		bodyModel[365] = new ModelRendererTurbo(this, 277, 259, textureX, textureY); // Right seat part
		bodyModel[366] = new ModelRendererTurbo(this, 290, 262, textureX, textureY); // Right seat part
		bodyModel[367] = new ModelRendererTurbo(this, 289, 243, textureX, textureY); // Right seat part
		bodyModel[368] = new ModelRendererTurbo(this, 307, 247, textureX, textureY); // Right seat part
		bodyModel[369] = new ModelRendererTurbo(this, 277, 247, textureX, textureY); // Right seat part
		bodyModel[370] = new ModelRendererTurbo(this, 289, 256, textureX, textureY); // Right seat part
		bodyModel[371] = new ModelRendererTurbo(this, 242, 254, textureX, textureY); // Box 38
		bodyModel[372] = new ModelRendererTurbo(this, 237, 268, textureX, textureY); // Box 38
		bodyModel[373] = new ModelRendererTurbo(this, 312, 253, textureX, textureY); // Right seat part
		bodyModel[374] = new ModelRendererTurbo(this, 340, 253, textureX, textureY); // Right seat part
		bodyModel[375] = new ModelRendererTurbo(this, 319, 249, textureX, textureY); // Right seat part
		bodyModel[376] = new ModelRendererTurbo(this, 323, 233, textureX, textureY); // Right seat part
		bodyModel[377] = new ModelRendererTurbo(this, 338, 262, textureX, textureY); // Right seat part
		bodyModel[378] = new ModelRendererTurbo(this, 338, 259, textureX, textureY); // Right seat part
		bodyModel[379] = new ModelRendererTurbo(this, 312, 262, textureX, textureY); // Right seat part
		bodyModel[380] = new ModelRendererTurbo(this, 312, 259, textureX, textureY); // Right seat part
		bodyModel[381] = new ModelRendererTurbo(this, 325, 262, textureX, textureY); // Right seat part
		bodyModel[382] = new ModelRendererTurbo(this, 324, 243, textureX, textureY); // Right seat part
		bodyModel[383] = new ModelRendererTurbo(this, 342, 247, textureX, textureY); // Right seat part
		bodyModel[384] = new ModelRendererTurbo(this, 312, 247, textureX, textureY); // Right seat part
		bodyModel[385] = new ModelRendererTurbo(this, 324, 256, textureX, textureY); // Right seat part
		bodyModel[386] = new ModelRendererTurbo(this, 347, 253, textureX, textureY); // Right seat part
		bodyModel[387] = new ModelRendererTurbo(this, 375, 253, textureX, textureY); // Right seat part
		bodyModel[388] = new ModelRendererTurbo(this, 354, 249, textureX, textureY); // Right seat part
		bodyModel[389] = new ModelRendererTurbo(this, 358, 233, textureX, textureY); // Right seat part
		bodyModel[390] = new ModelRendererTurbo(this, 373, 262, textureX, textureY); // Right seat part
		bodyModel[391] = new ModelRendererTurbo(this, 373, 259, textureX, textureY); // Right seat part
		bodyModel[392] = new ModelRendererTurbo(this, 347, 262, textureX, textureY); // Right seat part
		bodyModel[393] = new ModelRendererTurbo(this, 347, 259, textureX, textureY); // Right seat part
		bodyModel[394] = new ModelRendererTurbo(this, 360, 262, textureX, textureY); // Right seat part
		bodyModel[395] = new ModelRendererTurbo(this, 359, 243, textureX, textureY); // Right seat part
		bodyModel[396] = new ModelRendererTurbo(this, 377, 247, textureX, textureY); // Right seat part
		bodyModel[397] = new ModelRendererTurbo(this, 347, 247, textureX, textureY); // Right seat part
		bodyModel[398] = new ModelRendererTurbo(this, 359, 256, textureX, textureY); // Right seat part
		bodyModel[399] = new ModelRendererTurbo(this, 382, 253, textureX, textureY); // Right seat part
		bodyModel[400] = new ModelRendererTurbo(this, 410, 253, textureX, textureY); // Right seat part
		bodyModel[401] = new ModelRendererTurbo(this, 389, 249, textureX, textureY); // Right seat part
		bodyModel[402] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Right seat part
		bodyModel[403] = new ModelRendererTurbo(this, 408, 262, textureX, textureY); // Right seat part
		bodyModel[404] = new ModelRendererTurbo(this, 408, 259, textureX, textureY); // Right seat part
		bodyModel[405] = new ModelRendererTurbo(this, 382, 262, textureX, textureY); // Right seat part
		bodyModel[406] = new ModelRendererTurbo(this, 382, 259, textureX, textureY); // Right seat part
		bodyModel[407] = new ModelRendererTurbo(this, 395, 262, textureX, textureY); // Right seat part
		bodyModel[408] = new ModelRendererTurbo(this, 394, 243, textureX, textureY); // Right seat part
		bodyModel[409] = new ModelRendererTurbo(this, 412, 247, textureX, textureY); // Right seat part
		bodyModel[410] = new ModelRendererTurbo(this, 382, 247, textureX, textureY); // Right seat part
		bodyModel[411] = new ModelRendererTurbo(this, 394, 256, textureX, textureY); // Right seat part
		bodyModel[412] = new ModelRendererTurbo(this, 417, 253, textureX, textureY); // Right seat part
		bodyModel[413] = new ModelRendererTurbo(this, 445, 253, textureX, textureY); // Right seat part
		bodyModel[414] = new ModelRendererTurbo(this, 424, 249, textureX, textureY); // Right seat part
		bodyModel[415] = new ModelRendererTurbo(this, 428, 233, textureX, textureY); // Right seat part
		bodyModel[416] = new ModelRendererTurbo(this, 443, 262, textureX, textureY); // Right seat part
		bodyModel[417] = new ModelRendererTurbo(this, 443, 259, textureX, textureY); // Right seat part
		bodyModel[418] = new ModelRendererTurbo(this, 417, 262, textureX, textureY); // Right seat part
		bodyModel[419] = new ModelRendererTurbo(this, 417, 259, textureX, textureY); // Right seat part
		bodyModel[420] = new ModelRendererTurbo(this, 430, 262, textureX, textureY); // Right seat part
		bodyModel[421] = new ModelRendererTurbo(this, 429, 243, textureX, textureY); // Right seat part
		bodyModel[422] = new ModelRendererTurbo(this, 447, 247, textureX, textureY); // Right seat part
		bodyModel[423] = new ModelRendererTurbo(this, 417, 247, textureX, textureY); // Right seat part
		bodyModel[424] = new ModelRendererTurbo(this, 429, 256, textureX, textureY); // Right seat part
		bodyModel[425] = new ModelRendererTurbo(this, 452, 253, textureX, textureY); // Right seat part
		bodyModel[426] = new ModelRendererTurbo(this, 480, 253, textureX, textureY); // Right seat part
		bodyModel[427] = new ModelRendererTurbo(this, 459, 249, textureX, textureY); // Right seat part
		bodyModel[428] = new ModelRendererTurbo(this, 463, 233, textureX, textureY); // Right seat part
		bodyModel[429] = new ModelRendererTurbo(this, 478, 262, textureX, textureY); // Right seat part
		bodyModel[430] = new ModelRendererTurbo(this, 478, 259, textureX, textureY); // Right seat part
		bodyModel[431] = new ModelRendererTurbo(this, 452, 262, textureX, textureY); // Right seat part
		bodyModel[432] = new ModelRendererTurbo(this, 452, 259, textureX, textureY); // Right seat part
		bodyModel[433] = new ModelRendererTurbo(this, 465, 262, textureX, textureY); // Right seat part
		bodyModel[434] = new ModelRendererTurbo(this, 464, 243, textureX, textureY); // Right seat part
		bodyModel[435] = new ModelRendererTurbo(this, 482, 247, textureX, textureY); // Right seat part
		bodyModel[436] = new ModelRendererTurbo(this, 452, 247, textureX, textureY); // Right seat part
		bodyModel[437] = new ModelRendererTurbo(this, 464, 256, textureX, textureY); // Right seat part
		bodyModel[438] = new ModelRendererTurbo(this, 340, 294, textureX, textureY); // Left seat part
		bodyModel[439] = new ModelRendererTurbo(this, 312, 294, textureX, textureY); // Left seat part
		bodyModel[440] = new ModelRendererTurbo(this, 319, 290, textureX, textureY); // Left seat part
		bodyModel[441] = new ModelRendererTurbo(this, 338, 303, textureX, textureY); // Left seat part
		bodyModel[442] = new ModelRendererTurbo(this, 338, 300, textureX, textureY); // Left seat part
		bodyModel[443] = new ModelRendererTurbo(this, 312, 303, textureX, textureY); // Left seat part
		bodyModel[444] = new ModelRendererTurbo(this, 312, 300, textureX, textureY); // Left seat part
		bodyModel[445] = new ModelRendererTurbo(this, 325, 303, textureX, textureY); // Left seat part
		bodyModel[446] = new ModelRendererTurbo(this, 323, 274, textureX, textureY); // Left seat part
		bodyModel[447] = new ModelRendererTurbo(this, 324, 284, textureX, textureY); // Left seat part
		bodyModel[448] = new ModelRendererTurbo(this, 342, 288, textureX, textureY); // Left seat part
		bodyModel[449] = new ModelRendererTurbo(this, 312, 288, textureX, textureY); // Left seat part
		bodyModel[450] = new ModelRendererTurbo(this, 324, 297, textureX, textureY); // Left seat part
		bodyModel[451] = new ModelRendererTurbo(this, 375, 294, textureX, textureY); // Left seat part
		bodyModel[452] = new ModelRendererTurbo(this, 347, 294, textureX, textureY); // Left seat part
		bodyModel[453] = new ModelRendererTurbo(this, 354, 290, textureX, textureY); // Left seat part
		bodyModel[454] = new ModelRendererTurbo(this, 373, 303, textureX, textureY); // Left seat part
		bodyModel[455] = new ModelRendererTurbo(this, 373, 300, textureX, textureY); // Left seat part
		bodyModel[456] = new ModelRendererTurbo(this, 347, 303, textureX, textureY); // Left seat part
		bodyModel[457] = new ModelRendererTurbo(this, 347, 300, textureX, textureY); // Left seat part
		bodyModel[458] = new ModelRendererTurbo(this, 360, 303, textureX, textureY); // Left seat part
		bodyModel[459] = new ModelRendererTurbo(this, 358, 274, textureX, textureY); // Left seat part
		bodyModel[460] = new ModelRendererTurbo(this, 359, 284, textureX, textureY); // Left seat part
		bodyModel[461] = new ModelRendererTurbo(this, 377, 288, textureX, textureY); // Left seat part
		bodyModel[462] = new ModelRendererTurbo(this, 347, 288, textureX, textureY); // Left seat part
		bodyModel[463] = new ModelRendererTurbo(this, 359, 297, textureX, textureY); // Left seat part
		bodyModel[464] = new ModelRendererTurbo(this, 410, 294, textureX, textureY); // Left seat part
		bodyModel[465] = new ModelRendererTurbo(this, 382, 294, textureX, textureY); // Left seat part
		bodyModel[466] = new ModelRendererTurbo(this, 389, 290, textureX, textureY); // Left seat part
		bodyModel[467] = new ModelRendererTurbo(this, 408, 303, textureX, textureY); // Left seat part
		bodyModel[468] = new ModelRendererTurbo(this, 408, 300, textureX, textureY); // Left seat part
		bodyModel[469] = new ModelRendererTurbo(this, 382, 303, textureX, textureY); // Left seat part
		bodyModel[470] = new ModelRendererTurbo(this, 382, 300, textureX, textureY); // Left seat part
		bodyModel[471] = new ModelRendererTurbo(this, 395, 303, textureX, textureY); // Left seat part
		bodyModel[472] = new ModelRendererTurbo(this, 393, 274, textureX, textureY); // Left seat part
		bodyModel[473] = new ModelRendererTurbo(this, 394, 284, textureX, textureY); // Left seat part
		bodyModel[474] = new ModelRendererTurbo(this, 412, 288, textureX, textureY); // Left seat part
		bodyModel[475] = new ModelRendererTurbo(this, 382, 288, textureX, textureY); // Left seat part
		bodyModel[476] = new ModelRendererTurbo(this, 394, 297, textureX, textureY); // Left seat part
		bodyModel[477] = new ModelRendererTurbo(this, 445, 294, textureX, textureY); // Left seat part
		bodyModel[478] = new ModelRendererTurbo(this, 417, 294, textureX, textureY); // Left seat part
		bodyModel[479] = new ModelRendererTurbo(this, 424, 290, textureX, textureY); // Left seat part
		bodyModel[480] = new ModelRendererTurbo(this, 443, 303, textureX, textureY); // Left seat part
		bodyModel[481] = new ModelRendererTurbo(this, 443, 300, textureX, textureY); // Left seat part
		bodyModel[482] = new ModelRendererTurbo(this, 417, 303, textureX, textureY); // Left seat part
		bodyModel[483] = new ModelRendererTurbo(this, 417, 300, textureX, textureY); // Left seat part
		bodyModel[484] = new ModelRendererTurbo(this, 430, 303, textureX, textureY); // Left seat part
		bodyModel[485] = new ModelRendererTurbo(this, 428, 274, textureX, textureY); // Left seat part
		bodyModel[486] = new ModelRendererTurbo(this, 429, 284, textureX, textureY); // Left seat part
		bodyModel[487] = new ModelRendererTurbo(this, 447, 288, textureX, textureY); // Left seat part
		bodyModel[488] = new ModelRendererTurbo(this, 417, 288, textureX, textureY); // Left seat part
		bodyModel[489] = new ModelRendererTurbo(this, 429, 297, textureX, textureY); // Left seat part
		bodyModel[490] = new ModelRendererTurbo(this, 452, 294, textureX, textureY); // Left seat part
		bodyModel[491] = new ModelRendererTurbo(this, 480, 294, textureX, textureY); // Left seat part
		bodyModel[492] = new ModelRendererTurbo(this, 459, 290, textureX, textureY); // Left seat part
		bodyModel[493] = new ModelRendererTurbo(this, 478, 303, textureX, textureY); // Left seat part
		bodyModel[494] = new ModelRendererTurbo(this, 478, 300, textureX, textureY); // Left seat part
		bodyModel[495] = new ModelRendererTurbo(this, 452, 303, textureX, textureY); // Left seat part
		bodyModel[496] = new ModelRendererTurbo(this, 452, 300, textureX, textureY); // Left seat part
		bodyModel[497] = new ModelRendererTurbo(this, 465, 303, textureX, textureY); // Left seat part
		bodyModel[498] = new ModelRendererTurbo(this, 463, 274, textureX, textureY); // Left seat part
		bodyModel[499] = new ModelRendererTurbo(this, 464, 284, textureX, textureY); // Left seat part

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

		bodyModel[6].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[6].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[7].setRotationPoint(43F, 4F, -1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[8].setRotationPoint(-45F, 4F, -1F);

		bodyModel[9].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[9].setRotationPoint(-56.5F, 1F, -10.99F);

		bodyModel[10].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[10].setRotationPoint(-56.5F, 1F, 4.99F);

		bodyModel[11].addShapeBox(-4F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[11].setRotationPoint(-56.49F, -14F, -10.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 104, 16, 1, 0F); // Box 38
		bodyModel[12].setRotationPoint(-56.5F, -15F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 104, 16, 1, 0F); // Box 128
		bodyModel[13].setRotationPoint(-56.5F, -15F, 10F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[14].setRotationPoint(-56.5F, -15F, -10F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[15].setRotationPoint(-56.5F, -15F, 3F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[16].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[17].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[18].addShapeBox(-4F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[18].setRotationPoint(-56.49F, -14F, 10.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[19].setRotationPoint(-56.5F, -15F, -3F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[20].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[21].setRotationPoint(-60.5F, -15F, -11F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[22].setRotationPoint(-60.5F, -15F, 10F);

		bodyModel[23].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[23].setRotationPoint(-55.49F, -14F, -3F);

		bodyModel[24].addBox(0F, 0F, 0F, 109, 2, 6, 0F); // Box 128
		bodyModel[24].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[25].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 109, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[26].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[27].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 109, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[28].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[29].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[30].setRotationPoint(-61.5F, -19F, 3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 109, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[31].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 109, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[32].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate closed
		bodyModel[33].setRotationPoint(-61.5F, -7F, -3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate open
		bodyModel[34].setRotationPoint(-61.5F, -7F, 2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[35].setRotationPoint(-61.5F, -17F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[36].setRotationPoint(-61.5F, -18F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[37].setRotationPoint(-61.5F, -18F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[38].setRotationPoint(-61.5F, -16.25F, -10F);

		bodyModel[39].addBox(0F, 0F, 0F, 109, 1, 14, 0F); // Box 128
		bodyModel[39].setRotationPoint(-61.5F, -18F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[40].setRotationPoint(-61.5F, 3F, 10.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[41].setRotationPoint(-61.5F, 4F, 10.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[42].setRotationPoint(-56.5F, 4F, 10.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[43].setRotationPoint(-53.25F, 3F, 10.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[44].setRotationPoint(-55F, 4F, 10.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[45].setRotationPoint(34.75F, 3F, 10.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[46].setRotationPoint(33F, 4F, 10.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[47].setRotationPoint(-35.75F, 3F, 10.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[48].setRotationPoint(-35F, 4F, 10.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[49].setRotationPoint(-34.5F, 3F, 10.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[50].setRotationPoint(-33.5F, 4F, 10.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[51].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[52].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[53].setRotationPoint(-56.5F, 4F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.2F, 0F, 0F, -0.5F, -0.75F, 0F, -0.15F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.2F, -0.75F, 0F, -0.35F); // Box 28
		bodyModel[54].setRotationPoint(52.25F, 3F, -9.8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.1F, 0F, 0F, -0.5F, -1F, 0F, -0.8F, -0.5F, 0F, -0.9F, -0.5F, 0F, 0.4F, -1F, 0F, 0.3F); // Box 29
		bodyModel[55].setRotationPoint(53F, 4F, -9.65F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.05F, 0F, 0F, -0.5F); // Box 31 cull
		bodyModel[56].setRotationPoint(53.5F, 3F, -9.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[57].setRotationPoint(-53.25F, 3F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[58].setRotationPoint(-55F, 4F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[59].setRotationPoint(34.75F, 3F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[60].setRotationPoint(33F, 4F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[61].setRotationPoint(-35.75F, 3F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[62].setRotationPoint(-35F, 4F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[63].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[64].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[65].setRotationPoint(-56.5F, 3F, 10.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[66].setRotationPoint(-56.5F, 3F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[67].setRotationPoint(-63F, -15F, -4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[68].setRotationPoint(-63F, 1F, -4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[69].setRotationPoint(-63F, -14F, -4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[70].setRotationPoint(-63F, -14F, 3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[71].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[72].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[73].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[74].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 103, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F); // Box 128
		bodyModel[75].setRotationPoint(-55.5F, -16F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 103, 1, 3, 0F,0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[76].setRotationPoint(-55.5F, -16F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 103, 1, 2, 0F,0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[77].setRotationPoint(-55.5F, -18F, -9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 103, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[78].setRotationPoint(-55.5F, -18F, 6.7F);

		bodyModel[79].addBox(0F, 0F, 0F, 8, 2, 18, 0F); // Box 2
		bodyModel[79].setRotationPoint(47.5F, 1F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[80].setRotationPoint(47.5F, 1F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, -0.55F, 0F, 1.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.55F, 0F, 1.85F, 0F, 0F, 0F); // Box 38
		bodyModel[81].setRotationPoint(47.5F, -15F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 2, 12, 0F); // Box 2
		bodyModel[82].setRotationPoint(55.5F, 1F, -6F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[83].setRotationPoint(55.5F, 1F, -9F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 2
		bodyModel[84].setRotationPoint(58.5F, 1F, -2F);

		bodyModel[85].addShapeBox(0F, 0F, -5F, 1, 11, 3, 0F,0F, -0.01F, -1.01F, -0.5F, -0.01F, -1.01F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear end door part
		bodyModel[85].setRotationPoint(60F, -10F, 2F);

		bodyModel[86].addShapeBox(0F, 0F, -3F, 1, 11, 3, 0F,0F, -0.01F, -1F, 0F, -0.01F, -1F, -0.5F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Rear end door part
		bodyModel[86].setRotationPoint(60F, -10F, 2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[87].setRotationPoint(60.5F, 1F, -2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[88].setRotationPoint(58.5F, 1F, -6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 161
		bodyModel[89].setRotationPoint(55.5F, 1F, 6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[90].setRotationPoint(60.5F, 1F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[91].setRotationPoint(58.5F, 1F, 2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,-0.3F, 0F, -0.55F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -0.3F, 0F, -0.55F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 2
		bodyModel[92].setRotationPoint(57.5F, -15F, -6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		bodyModel[93].setRotationPoint(59.5F, -15F, -2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[94].setRotationPoint(59.5F, -15F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,-0.55F, 0F, -0.15F, 0.55F, 0F, -3.15F, -0.15F, 0F, 2.7F, 0F, 0F, 0F, -0.55F, 0F, -0.15F, 0.55F, 0F, -3.15F, -0.15F, 0F, 2.7F, 0F, 0F, 0F); // Box 38
		bodyModel[95].setRotationPoint(54.95F, -15F, -9.15F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 174
		bodyModel[96].setRotationPoint(47.5F, 1F, 9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 0F, 0F, -0.55F, 0F, 1.85F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 1.85F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 175
		bodyModel[97].setRotationPoint(47.5F, -15F, 10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.55F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.55F); // Box 176
		bodyModel[98].setRotationPoint(57.5F, -15F, 2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, -0.15F, 0F, 2.7F, 0.55F, 0F, -3.15F, -0.55F, 0F, -0.15F, 0F, 0F, 0F, -0.15F, 0F, 2.7F, 0.55F, 0F, -3.15F, -0.55F, 0F, -0.15F); // Box 177
		bodyModel[99].setRotationPoint(54.95F, -15F, 8.15F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, -0.55F, 1.25F, 0.85F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -0.55F, 0F, 0.85F, 0F, 0F, -1F); // Box 38
		bodyModel[100].setRotationPoint(47.5F, -16F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.55F, -1F, -0.15F, 0.55F, -1F, -3.15F, -0.15F, 1.25F, 1.7F, 0F, 1.25F, -1F, -0.55F, 0F, -0.15F, 0.55F, 0F, -3.15F, -0.15F, 0F, 1.7F, 0F, 0F, -1F); // Box 38
		bodyModel[101].setRotationPoint(54.95F, -16F, -9.15F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.3F, 1.25F, -0.55F, -1F, -1F, 0F, 1F, -1F, 0F, -2F, 1.25F, 0F, -0.3F, 0F, -0.55F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 2
		bodyModel[102].setRotationPoint(57.5F, -16F, -6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 1.25F, -1F, -0.55F, 1.25F, 0.85F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, -0.55F, 0F, 0.85F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 182
		bodyModel[103].setRotationPoint(47.5F, -16F, 9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 1.25F, -1F, -0.15F, 1.25F, 1.7F, 0.55F, -1F, -3.15F, -0.55F, -1F, -0.15F, 0F, 0F, -1F, -0.15F, 0F, 1.7F, 0.55F, 0F, -3.15F, -0.55F, 0F, -0.15F); // Box 183
		bodyModel[104].setRotationPoint(54.95F, -16F, 7.15F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2F, 1.25F, 0F, 1F, -1F, 0F, -1F, -1F, 0F, -0.3F, 1.25F, -0.55F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, -0.55F); // Box 184
		bodyModel[105].setRotationPoint(57.5F, -16F, 2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -1.75F, 0F, -0.55F, -1.75F, -1.85F, -2.2F, 0F, 1.35F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.55F, 1.75F, -1.85F, -2.2F, 0F, 1.35F, 0F, 0F, 0F); // Box 128
		bodyModel[106].setRotationPoint(47.5F, -19F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, -2.2F, 0F, 1.35F, -0.55F, -1.75F, -1.85F, 0F, -1.75F, 0F, 0F, 0F, 0F, -2.2F, 0F, 1.35F, -0.55F, 1.75F, -1.85F, 0F, 1.75F, 0F); // Box 188
		bodyModel[107].setRotationPoint(47.5F, -19F, 7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2.2F, -1.75F, 2.35F, 2.05F, -1.75F, -0.35F, -0.4F, 0F, -0.75F, -0.55F, 0F, -2.85F, -2.2F, 1.75F, 2.35F, 2.05F, 1.75F, -0.35F, -0.4F, 0F, -0.75F, -0.55F, 0F, -2.85F); // Box 128
		bodyModel[108].setRotationPoint(52.75F, -19F, -5.8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.55F, 0F, -2.85F, -0.4F, 0F, -0.75F, 2.05F, -1.75F, -0.35F, -2.2F, -1.75F, 2.35F, -0.55F, 0F, -2.85F, -0.4F, 0F, -0.75F, 2.05F, 1.75F, -0.35F, -2.2F, 1.75F, 2.35F); // Box 191
		bodyModel[109].setRotationPoint(52.75F, -19F, 2.8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-0.4F, 0F, -0.75F, -0.9F, 0F, -4.2F, -3.9F, 1.75F, 0.2F, 2.05F, 1.75F, -1.35F, -0.4F, 0F, -0.75F, -0.9F, 0F, -4.2F, -3.9F, -1.75F, 0.2F, 2.05F, -1.75F, -1.35F); // Box 128
		bodyModel[110].setRotationPoint(57.4F, -17.25F, -6.2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,2.05F, 1.75F, -1.35F, -3.9F, 1.75F, 0.2F, -0.9F, 0F, -4.2F, -0.4F, 0F, -0.75F, 2.05F, -1.75F, -1.35F, -3.9F, -1.75F, 0.2F, -0.9F, 0F, -4.2F, -0.4F, 0F, -0.75F); // Box 196
		bodyModel[111].setRotationPoint(57.4F, -17.25F, 2.2F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 128
		bodyModel[112].setRotationPoint(47.5F, -20F, -2.3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.35F, 0F, -0.7F, -0.35F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.35F, 0F, -0.7F, -0.35F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 128
		bodyModel[113].setRotationPoint(47.5F, -20F, -3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, 0F, -0.35F, 0F, -4.7F, -0.35F, 0F, 0.7F, 0F, 0F, 0F, 0F, 1F, 0F, -0.35F, 0F, -4.7F, -0.35F, 0F, 0.7F, 0F, 0F, 0F); // Box 128
		bodyModel[114].setRotationPoint(47.5F, -20F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0.7F, -0.2F, 0F, -0.65F, -2.35F, 1F, 0F, 0F, 0F, -4.7F, 0F, 0F, 0.7F, -0.2F, 0F, -0.65F, -2.35F, -1F, 0F, 0F, 0F, -4.7F); // Box 128
		bodyModel[115].setRotationPoint(47.5F, -19F, -6.3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.7F, 0F, 0F, 0F); // Box 205
		bodyModel[116].setRotationPoint(47.5F, -20F, 2F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.4F, 0F, 0.7F, -0.35F, 0F, -4.7F, 0F, -1F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0.7F, -0.35F, 0F, -4.7F, 0F, 1F, 0F); // Box 206
		bodyModel[117].setRotationPoint(47.5F, -20F, 3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, -4.7F, -2.35F, 1F, 0F, -0.2F, 0F, -0.65F, 0F, 0F, 0.7F, 0F, 0F, -4.7F, -2.35F, -1F, 0F, -0.2F, 0F, -0.65F, 0F, 0F, 0.7F); // Box 207
		bodyModel[118].setRotationPoint(47.5F, -19F, 2.3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.05F, 0F, -1.2F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.05F, 0F, -1.2F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 128
		bodyModel[119].setRotationPoint(51.15F, -20F, -2.3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -1.2F, 0F, 0F, 0F); // Box 214
		bodyModel[120].setRotationPoint(51.15F, -20F, 1.3F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2.15F, -1F, 0F, 2.2F, -1F, -2.1F, -0.95F, 0F, 0.55F, 0F, 0F, -0.65F, -2.15F, 1F, 0F, 2.2F, 1F, -2.1F, -0.95F, 0F, 0.55F, 0F, 0F, -0.65F); // Box 128
		bodyModel[121].setRotationPoint(51.15F, -20F, -5.65F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -0.65F, -0.95F, 0F, 0.55F, 2.2F, -1F, -2.1F, -2.15F, -1F, 0F, 0F, 0F, -0.65F, -0.95F, 0F, 0.55F, 2.2F, 1F, -2.1F, -2.15F, 1F, 0F); // Box 220
		bodyModel[122].setRotationPoint(51.15F, -20F, 1.65F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.95F, 0F, 0.55F, 0.1F, 0F, -1F, -4.2F, 1F, -2.1F, 2.2F, 1F, -2.1F, -0.95F, 0F, 0.55F, 0.1F, 0F, -1F, -4.2F, -1F, -2.1F, 2.2F, -1F, -2.1F); // Box 128
		bodyModel[123].setRotationPoint(54.4F, -19F, -3F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,2.2F, 1F, -2.1F, -4.2F, 1F, -2.1F, 0.1F, 0F, -1F, -0.95F, 0F, 0.55F, 2.2F, -1F, -2.1F, -4.2F, -1F, -2.1F, 0.1F, 0F, -1F, -0.95F, 0F, 0.55F); // Box 222
		bodyModel[124].setRotationPoint(54.4F, -19F, -1F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, -0.4F, 0F, 2.3F, 0.3F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, -3F, -0.4F, 0F, 2.3F, 0.3F, 0F, -0.55F); // Box 31
		bodyModel[125].setRotationPoint(55.5F, 3F, -9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, -0.4F, 0F, 2.3F, 0.3F, 0F, -0.55F, 0.25F, 0F, -0.4F, -0.4F, 0F, -3.3F, -0.8F, 0F, 2.6F, 0.55F, 0F, -0.15F); // Box 31
		bodyModel[126].setRotationPoint(55.5F, 4F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.3F, 0F, -0.55F, -0.4F, 0F, 2.3F, 0F, 0F, -3F, 0F, 0F, 0F, 0.3F, 0F, -0.55F, -0.4F, 0F, 2.3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 228
		bodyModel[127].setRotationPoint(55.5F, 3F, 8F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.3F, 0F, -0.55F, -0.4F, 0F, 2.3F, 0F, 0F, -3F, 0F, 0F, 0F, 0.55F, 0F, -0.15F, -0.8F, 0F, 2.6F, -0.4F, 0F, -3.3F, 0.25F, 0F, -0.4F); // Box 229
		bodyModel[128].setRotationPoint(55.5F, 4F, 8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.9F, 0F, -0.3F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.3F, 0F, -0.6F, -1.9F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[129].setRotationPoint(59F, 4F, -6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.1F, 0F, -0.3F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.1F, 0F, -0.3F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 31
		bodyModel[130].setRotationPoint(58F, 3F, -6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.9F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.9F, 0F, -0.3F, 1.3F, 0F, -0.6F); // Box 232
		bodyModel[131].setRotationPoint(59F, 4F, 3F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, -0.3F, -1.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, -0.3F); // Box 233
		bodyModel[132].setRotationPoint(58F, 3F, 3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, -0.3F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.65F, -0.55F, 0F, 0.1F, 0F, 0F, 0F); // Box 30 cull
		bodyModel[133].setRotationPoint(54.5F, 4F, -9.25F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.3F, 0F, 0F, 0F, -0.75F, 0F, -0.35F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.3F, -0.75F, 0F, -0.15F); // Box 235
		bodyModel[134].setRotationPoint(52.25F, 3F, 8.8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.4F, 0F, 0F, 0F, -1F, 0F, 0.3F, -0.5F, 0F, 0.4F, -0.5F, 0F, -0.9F, -1F, 0F, -0.8F); // Box 236
		bodyModel[135].setRotationPoint(53F, 4F, 8.65F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.3F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 237
		bodyModel[136].setRotationPoint(53.5F, 3F, 8.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0.1F, -0.25F, 0F, -0.65F, 0F, 0F, -0.5F); // Box 238
		bodyModel[137].setRotationPoint(54.5F, 4F, 8.25F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		bodyModel[138].setRotationPoint(60.5F, 1F, -2F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[139].setRotationPoint(60.5F, 1F, 0F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[140].setRotationPoint(59.5F, 1F, -4F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[141].setRotationPoint(59.5F, 1F, 2F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -1F, 0F, -0.35F, 0F, -4.7F, -0.35F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -4.7F, -0.35F, 0F, 0.7F, 0F, 0F, 0F); // Box 128
		bodyModel[142].setRotationPoint(47.5F, -19F, -7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0.7F, -0.2F, 0F, -0.65F, -2.35F, 1F, 0F, 0F, 0F, -4.7F, 0F, -1F, 0.7F, -0.2F, -1F, -0.65F, -2.35F, -1F, 0F, 0F, -1F, -4.7F); // Box 128
		bodyModel[143].setRotationPoint(47.5F, -18F, -6.3F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-2.15F, -1F, 0F, 2.2F, -1F, -2.1F, -0.95F, 0F, 0.55F, 0F, 0F, -0.65F, -2.15F, 0F, 0F, 2.2F, 0F, -2.1F, -0.95F, 0F, 0.55F, 0F, 0F, -0.65F); // Box 128
		bodyModel[144].setRotationPoint(51.15F, -19F, -5.65F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.95F, 0F, 0.55F, 0.1F, 0F, -1F, -4.2F, 1F, -2.1F, 2.2F, 1F, -2.1F, -0.95F, -1F, 0.55F, 0.1F, -1F, -1F, -4.2F, -1F, -2.1F, 2.2F, -1F, -2.1F); // Box 128
		bodyModel[145].setRotationPoint(54.4F, -18F, -3F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-4.2F, -1F, -2.1F, 2.7F, -1F, -4.1F, -1.6F, 0F, 0.1F, 0.1F, 0F, -1F, -4.2F, 0F, -2.1F, 2.7F, 0F, -4.1F, -1.6F, 0F, 0.1F, 0.1F, 0F, -1F); // Box 128
		bodyModel[146].setRotationPoint(52.3F, -19F, -4.1F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -0.35F, 0F, 0.7F, -0.35F, 0F, -4.7F, 0F, -1F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0.7F, -0.35F, 0F, -4.7F, 0F, 0F, 0F); // Box 248
		bodyModel[147].setRotationPoint(47.5F, -19F, 3F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -4.7F, -2.35F, 1F, 0F, -0.2F, 0F, -0.65F, 0F, 0F, 0.7F, 0F, -1F, -4.7F, -2.35F, -1F, 0F, -0.2F, -1F, -0.65F, 0F, -1F, 0.7F); // Box 249
		bodyModel[148].setRotationPoint(47.5F, -18F, 2.3F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -0.65F, -0.95F, 0F, 0.55F, 2.2F, -1F, -2.1F, -2.15F, -1F, 0F, 0F, 0F, -0.65F, -0.95F, 0F, 0.55F, 2.2F, 0F, -2.1F, -2.15F, 0F, 0F); // Box 250
		bodyModel[149].setRotationPoint(51.15F, -19F, 1.65F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,2.2F, 1F, -2.1F, -4.2F, 1F, -2.1F, 0.1F, 0F, -1F, -0.95F, 0F, 0.55F, 2.2F, -1F, -2.1F, -4.2F, -1F, -2.1F, 0.1F, -1F, -1F, -0.95F, -1F, 0.55F); // Box 251
		bodyModel[150].setRotationPoint(54.4F, -18F, -1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.1F, 0F, -1F, -1.6F, 0F, 0.1F, 2.7F, -1F, -4.1F, -4.2F, -1F, -2.1F, 0.1F, 0F, -1F, -1.6F, 0F, 0.1F, 2.7F, 0F, -4.1F, -4.2F, 0F, -2.1F); // Box 252
		bodyModel[151].setRotationPoint(52.3F, -19F, 0.0999999999999996F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -1F, -0.3F, 0.75F, -1F, -1.9F, -0.2F, 0F, 1.35F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.75F, 0F, -1.9F, -0.2F, 0F, 1.35F, 0F, 0F, 0F); // Box 128
		bodyModel[152].setRotationPoint(47.5F, -18F, -9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, -0.2F, 0F, 1.35F, 0.75F, -1F, -1.9F, 0F, -1F, -0.3F, 0F, 0F, 0F, -0.2F, 0F, 1.35F, 0.75F, 0F, -1.9F, 0F, 0F, -0.3F); // Box 254
		bodyModel[153].setRotationPoint(47.5F, -18F, 7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.2F, -1F, 1.35F, -0.3F, -1F, -1.1F, -1.7F, 0F, 0.2F, 0.75F, 0F, -1.9F, -0.2F, 0F, 1.35F, -0.3F, 0F, -1.1F, -1.7F, 0F, 0.2F, 0.75F, 0F, -1.9F); // Box 128
		bodyModel[154].setRotationPoint(54.05F, -18F, -5.75F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0.75F, 0F, -1.9F, -1.7F, 0F, 0.2F, -0.3F, -1F, -1.1F, -0.2F, -1F, 1.35F, 0.75F, 0F, -1.9F, -1.7F, 0F, 0.2F, -0.3F, 0F, -1.1F, -0.2F, 0F, 1.35F); // Box 256
		bodyModel[155].setRotationPoint(54.05F, -18F, 3.75F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, 0F, 0F, -0.8F, -1F, 0F, -0.3F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[156].setRotationPoint(57F, -18F, -2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.3F, -1F, 0F, -0.8F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F); // Box 258
		bodyModel[157].setRotationPoint(57F, -18F, 0F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1.15F, 0F, -0.45F, -1.75F, -1F, 0.65F, -0.3F, -1F, 0F, 0F, 0F, 0F, 1.15F, 0F, -0.45F, -1.75F, 0F, 0.65F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[158].setRotationPoint(56.5F, -18F, -4F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.3F, -1F, 0F, -1.75F, -1F, 0.65F, 1.15F, 0F, -0.45F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1.75F, 0F, 0.65F, 1.15F, 0F, -0.45F); // Box 260
		bodyModel[159].setRotationPoint(56.5F, -18F, 2F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0.25F, 0F, -0.55F, 0.25F, -1.85F, -1.3F, 1F, -0.05F, 0F, 1F, -1.7F, 0F, 0F, 0F, -0.55F, 0F, -1.85F, -1.85F, -2F, 0.8F, 0F, -2F, -0.65F); // Box 128
		bodyModel[160].setRotationPoint(47.5F, -16F, -10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 1F, -1.7F, -1.3F, 1F, -0.05F, -0.55F, 0.25F, -1.85F, 0F, 0.25F, 0F, 0F, -2F, -0.65F, -1.85F, -2F, 0.85F, -0.55F, 0F, -1.85F, 0F, 0F, 0F); // Box 269
		bodyModel[161].setRotationPoint(47.5F, -16F, 7F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.25F, 0F, -0.15F, 0.25F, -2.7F, -1.2F, 1F, 0.5F, 0.75F, 1F, -1.9F, 0F, 0F, 0F, -0.15F, 0F, -2.7F, -2.1F, -2F, 1.2F, 1.3F, -2F, -1.05F); // Box 128
		bodyModel[162].setRotationPoint(54.95F, -16F, -8.15F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.75F, 1F, -1.9F, -1.2F, 1F, 0.5F, -0.15F, 0.25F, -2.7F, 0F, 0.25F, 0F, 1.3F, -2F, -1F, -2.1F, -2F, 1.2F, -0.15F, 0F, -2.7F, 0F, 0F, 0F); // Box 272
		bodyModel[163].setRotationPoint(54.95F, -16F, 5.15F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-1.95F, 1F, -0.8F, 0F, 0.25F, 0F, 1.7F, 0.25F, -0.55F, -3.5F, 1F, -0.25F, -1.05F, -2F, -1.5F, 0F, 0F, 0F, 1.7F, 0F, -0.55F, -2.45F, -2F, -0.05F); // Box 128
		bodyModel[164].setRotationPoint(54.8F, -16F, -5.45F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-3.5F, 1F, -0.25F, 1.7F, 0.25F, -0.55F, 0F, 0.25F, 0F, -1.95F, 1F, -0.8F, -2.45F, -2F, -0.05F, 1.7F, 0F, -0.55F, 0F, 0F, 0F, -1.05F, -2F, -1.5F); // Box 274
		bodyModel[165].setRotationPoint(54.8F, -16F, 1.45F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1.3F, 1F, -0.3F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -1.7F, 1F, 0F, -0.25F, -2F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.65F, -2F, 0F); // Box 128
		bodyModel[166].setRotationPoint(57F, -16F, -2F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1.7F, 1F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1.3F, 1F, -0.3F, -0.65F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -2F, -0.5F); // Box 276
		bodyModel[167].setRotationPoint(57F, -16F, 0F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.95F, 0F, 0F, -0.45F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.45F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 128
		bodyModel[168].setRotationPoint(51.15F, -20F, -1.1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0.1F, -0.45F, 0F, 0.1F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.45F, 0F, 0.1F, -0.95F, 0F, 0F, 0F, 0F, 0F); // Box 726
		bodyModel[169].setRotationPoint(51.15F, -20F, 0.1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0.5F, 1.75F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[170].setRotationPoint(56.5F, -19F, -2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, 0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[171].setRotationPoint(56.5F, -19F, 0F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-4.2F, -1F, -2.1F, 2.7F, -1F, -4.1F, -1.6F, 0F, 0.1F, 0.1F, 0F, -1F, -4.2F, 1F, -2.1F, 2.7F, 1F, -4.1F, -1.6F, 0F, 0.1F, 0.1F, 0F, -1F); // Box 128
		bodyModel[172].setRotationPoint(52.3F, -20F, -4.1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.1F, 0F, -1F, -1.6F, 0F, 0.1F, 2.7F, -1F, -4.1F, -4.2F, -1F, -2.1F, 0.1F, 0F, -1F, -1.6F, 0F, 0.1F, 2.7F, 1F, -4.1F, -4.2F, 1F, -2.1F); // Box 224
		bodyModel[173].setRotationPoint(52.3F, -20F, 0.0999999999999996F);

		bodyModel[174].addShapeBox(0.62F, 0F, -4F, 1, 6, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[174].setRotationPoint(60F, -6F, 2F);

		bodyModel[175].addShapeBox(1.38F, 0F, -4F, 0, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -4F, -4F); // tail sign glow
		bodyModel[175].setRotationPoint(60F, -6F, 2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[176].setRotationPoint(60F, -20F, 1F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[177].setRotationPoint(60F, -20F, 0F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[178].setRotationPoint(60F, -20F, -2F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[179].setRotationPoint(60F, -20F, -2F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[180].setRotationPoint(60F, -18F, 1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[181].setRotationPoint(60F, -18F, -2F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[182].setRotationPoint(60F, -17F, 0F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[183].setRotationPoint(60F, -17F, -2F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[184].setRotationPoint(52.7F, -20F, -2F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[185].setRotationPoint(52.7F, -20F, 0F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 167
		bodyModel[186].setRotationPoint(59F, -18F, 0F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[187].setRotationPoint(59F, -18F, -2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1.25F, 0F, -1F, -1F, 0F, -0.875F, -1F, -0.5F, -0.125F, 1.25F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.875F, 0F, -0.5F, -0.125F, 0F, -0.5F); // Box 2
		bodyModel[188].setRotationPoint(59.5F, -16F, -2F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.125F, 1.25F, -0.5F, -0.875F, -1F, -0.5F, -1F, -1F, 0F, 0F, 1.25F, 0F, -0.125F, 0F, -0.5F, -0.875F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[189].setRotationPoint(59.5F, -16F, 1F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, -0.8F, -0.5F, 0F); // Box 166
		bodyModel[190].setRotationPoint(58.2F, -18F, -2F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 309
		bodyModel[191].setRotationPoint(58.2F, -18F, 0F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.125F, 0.5F, 0F, -1.54F, 0.5F, 0F, -1.335F, 0.325F, -0.5F, -0.25F, 0.325F, -0.5F, -0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 2
		bodyModel[192].setRotationPoint(59.5F, -16F, -1.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0.325F, -0.5F, -1.335F, 0.325F, -0.5F, -1.54F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.875F, 0F, 0F, -0.125F, 0F, 0F); // Box 311
		bodyModel[193].setRotationPoint(59.5F, -16F, 0.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0.325F, 0F, -1.335F, 0.325F, 0F, -0.95F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		bodyModel[194].setRotationPoint(59.5F, -16F, -1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.95F, 0F, 0F, -1.335F, 0.325F, 0F, -0.25F, 0.325F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F); // Box 313
		bodyModel[195].setRotationPoint(59.5F, -16F, 0F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 rear MARS light R
		bodyModel[196].setRotationPoint(59.25F, -19.85F, -1F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 rear MARS light W
		bodyModel[197].setRotationPoint(59.75F, -18.15F, -1F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F, 0F, -0.465F, 0F, 0F, -0.465F, 0F); // Box 405
		bodyModel[198].setRotationPoint(60.99F, -18F, -1.8F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.465F, 0F, 0F, -0.465F, 0F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F); // Box 317
		bodyModel[199].setRotationPoint(60.99F, -18F, 0.8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F, 0F, -0.535F, -0.2F, 0F, -0.535F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 405
		bodyModel[200].setRotationPoint(60.99F, -20F, -1.8F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.535F, -0.2F, 0F, -0.535F, -0.2F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[201].setRotationPoint(60.99F, -20F, 0.8F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[202].setRotationPoint(46.75F, -14F, -11.75F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // marker light glow
		bodyModel[203].setRotationPoint(46.9F, -13.85F, -11.9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[204].setRotationPoint(45.5F, -14F, -12F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[205].setRotationPoint(46.75F, -14F, 10.75F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, 0F, 0F, -0.3F, 0F); // marker light glow
		bodyModel[206].setRotationPoint(46.9F, -13.85F, 10.9F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, -0.5F, -1F); // Box 292
		bodyModel[207].setRotationPoint(45.5F, -14F, 11F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F); // Box 31 cull
		bodyModel[208].setRotationPoint(49.5F, 3F, -10.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F); // Box 31
		bodyModel[209].setRotationPoint(49.5F, 4.5F, -10.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 475 cull
		bodyModel[210].setRotationPoint(49.5F, 3F, 10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 476
		bodyModel[211].setRotationPoint(49.5F, 4.5F, 10F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F); // Box 31
		bodyModel[212].setRotationPoint(51.5F, 3F, -10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[213].setRotationPoint(51.5F, 3F, 9F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[214].setRotationPoint(47.75F, -2F, -11.97F);
		bodyModel[214].rotateAngleY = 0.2443461F;

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[215].setRotationPoint(47.5F, -2F, 11F);
		bodyModel[215].rotateAngleY = -0.2443461F;

		bodyModel[216].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[216].setRotationPoint(57.08F, 3F, -8.83F);
		bodyModel[216].rotateAngleY = 0.78539816F;

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[217].setRotationPoint(56.38F, 3F, 8.13F);
		bodyModel[217].rotateAngleY = -0.78539816F;

		bodyModel[218].addShapeBox(0F, 2F, -2F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 550
		bodyModel[218].setRotationPoint(-60.49F, 0.75F, -4.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 552
		bodyModel[219].setRotationPoint(-60.49F, 4.5F, -8F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[220].setRotationPoint(-60.49F, 4.5F, -8.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[221].setRotationPoint(-60.49F, 8F, -11.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 555
		bodyModel[222].setRotationPoint(-56.51F, 3F, -10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[223].setRotationPoint(-56.51F, 3F, -11.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[224].setRotationPoint(-60.49F, 6.25F, -10F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 558
		bodyModel[225].setRotationPoint(-60.49F, 6.25F, -9.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 559
		bodyModel[226].setRotationPoint(-60.49F, 3F, -10F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[227].setRotationPoint(-60.49F, 3F, -11.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[228].setRotationPoint(-60.5F, 3F, -7.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[229].setRotationPoint(-56.5F, 3F, -7.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[230].setRotationPoint(-56.5F, 3F, -10.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[231].setRotationPoint(-60.5F, 3F, -10.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[232].setRotationPoint(-56.5F, 4F, -10.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[233].setRotationPoint(-60.5F, 4F, -10.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[234].setRotationPoint(-60.49F, 3F, -7F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[235].setRotationPoint(-60.49F, 3F, -7F);

		bodyModel[236].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[236].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[237].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[237].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[238].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[238].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[239].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[239].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[240].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[240].setRotationPoint(-56.51F, 4F, -8F);

		bodyModel[241].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[241].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[242].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[242].setRotationPoint(-56.51F, 4F, -8F);

		bodyModel[243].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[243].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[244].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[244].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[245].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[245].setRotationPoint(-56.51F, 4F, -8F);

		bodyModel[246].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[246].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[247].addShapeBox(0F, 2F, -2F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[247].setRotationPoint(-60.49F, 0.75F, 8.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[248].setRotationPoint(-60.49F, 4.5F, 8F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[249].setRotationPoint(-60.49F, 4.5F, 6.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[250].setRotationPoint(-60.49F, 8F, 9.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[251].setRotationPoint(-56.51F, 3F, 5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[252].setRotationPoint(-56.51F, 3F, 9.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[253].setRotationPoint(-60.49F, 6.25F, 8F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[254].setRotationPoint(-60.49F, 6.25F, 9.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[255].setRotationPoint(-60.49F, 3F, 5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[256].setRotationPoint(-60.49F, 3F, 9.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[257].setRotationPoint(-60.5F, 3F, 4.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[258].setRotationPoint(-56.5F, 3F, 4.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[259].setRotationPoint(-56.5F, 3F, 7.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[260].setRotationPoint(-60.5F, 3F, 7.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1359
		bodyModel[261].setRotationPoint(-56.5F, 4F, 7.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1360
		bodyModel[262].setRotationPoint(-60.5F, 4F, 7.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[263].setRotationPoint(-60.49F, 3F, 5F);

		bodyModel[264].addShapeBox(0F, 2F, -2F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[264].setRotationPoint(-60.5F, 0.75F, 7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[265].setRotationPoint(-60.49F, 3F, 7F);

		bodyModel[266].addShapeBox(0F, 2F, -2F, 4, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[266].setRotationPoint(-60.5F, 0.75F, -5F);

		bodyModel[267].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[267].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[268].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[268].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[269].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[269].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[270].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[270].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[271].addShapeBox(0F, 2F, 0.5F, 4, 0, 2, 0F,0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[271].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[272].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[272].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[273].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[273].setRotationPoint(-56.51F, 4F, 8F);

		bodyModel[274].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[274].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[275].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[275].setRotationPoint(-56.51F, 4F, 8F);

		bodyModel[276].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[276].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[277].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[277].setRotationPoint(-56.51F, 4F, 8F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[278].setRotationPoint(-61F, -6F, -12F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[279].setRotationPoint(-56F, -6F, -12F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[280].setRotationPoint(-61F, -6F, 11F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[281].setRotationPoint(-56F, -6F, 11F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[282].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 153
		bodyModel[283].setRotationPoint(-63.5F, -16F, 1.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[284].setRotationPoint(-63.5F, -16F, -1.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[285].setRotationPoint(-63.5F, -15F, -11F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[286].setRotationPoint(-63F, -15F, -11F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[287].setRotationPoint(-63.5F, -16F, -11F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[288].setRotationPoint(-63F, -15F, -11F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[289].setRotationPoint(-63.5F, 1F, -10F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[290].setRotationPoint(-63.5F, -19F, -10F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[291].setRotationPoint(-63F, -19F, -10F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[292].setRotationPoint(-63.5F, -19.5F, -7F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[293].setRotationPoint(-63F, -20F, -7F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[294].setRotationPoint(-63.5F, -20F, -3F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[295].setRotationPoint(-63F, -20F, -3F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[296].setRotationPoint(-63.5F, -20F, -5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[297].setRotationPoint(-63.5F, -15F, 10F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[298].setRotationPoint(-63F, -15F, 11F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[299].setRotationPoint(-63.5F, -16F, 9F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[300].setRotationPoint(-63F, -15F, 9F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[301].setRotationPoint(-63.5F, -19F, 7F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[302].setRotationPoint(-63F, -19F, 7F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 253
		bodyModel[303].setRotationPoint(-63.5F, -19.5F, 5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[304].setRotationPoint(-63F, -20F, 3F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[305].setRotationPoint(-63.5F, -20F, 3F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[306].setRotationPoint(-63.5F, -7F, -10F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[307].setRotationPoint(-63.5F, -7F, 5F);

		bodyModel[308].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[308].setRotationPoint(-60.5F, 3F, -4F);

		bodyModel[309].addBox(0F, 0F, 0F, 61, 1, 1, 0F); // Box 275 glow
		bodyModel[309].setRotationPoint(-13.5F, -11F, -10F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 61, 1, 0, 0F,0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F); // Box 275
		bodyModel[310].setRotationPoint(-13.5F, -11F, -8.99F);

		bodyModel[311].addBox(0F, 0F, 0F, 68, 1, 1, 0F); // Box 485 glow
		bodyModel[311].setRotationPoint(-20.5F, -11F, 9F);

		bodyModel[312].addBox(0F, 0F, 0F, 68, 1, 0, 0F); // Box 486
		bodyModel[312].setRotationPoint(-20.5F, -11F, 8.99F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, -0.55F, 0F, -1.85F, -1.1F, 0F, 1.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, -1.85F, -1.1F, 0F, 1.7F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[313].setRotationPoint(47.5F, -11F, -10F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 0F, 0F, -0.1F, 0F, -1.7F, -0.1F, 0F, 1.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -1.7F, -0.1F, 0F, 1.7F, 0F, 0F, 0F); // Box 38
		bodyModel[314].setRotationPoint(47.5F, -11F, -8.99F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, -1.1F, 0F, 1.7F, -0.55F, 0F, -1.85F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 1.7F, -0.55F, 0F, -1.85F, 0F, 0F, 0F); // Box 490 glow
		bodyModel[315].setRotationPoint(47.5F, -11F, 9F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0F, 0F, -1.1F, 0F, 1.7F, -1.1F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 1.7F, -1.1F, 0F, -1.7F, 0F, 0F, 0F); // Box 491
		bodyModel[316].setRotationPoint(47.5F, -11F, 8.99F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.55F, 0F, -0.15F, 0.4F, 0F, -2.85F, -0.5F, 0F, 2.55F, 0F, 0F, 0F, -0.55F, 0F, -0.15F, 0.4F, 0F, -2.85F, -0.5F, 0F, 2.55F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[317].setRotationPoint(54.4F, -11F, -8.3F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, -2.55F, -0.5F, 0F, 2.55F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2.55F, -0.5F, 0F, 2.55F, 0F, 0F, 0F); // Box 38
		bodyModel[318].setRotationPoint(54.4F, -11F, -7.29F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 2.55F, 0.4F, 0F, -2.85F, -0.55F, 0F, -0.15F, 0F, 0F, 0F, -0.5F, 0F, 2.55F, 0.4F, 0F, -2.85F, -0.55F, 0F, -0.15F); // Box 495 glow
		bodyModel[319].setRotationPoint(54.4F, -11F, 7.3F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 2.55F, -0.5F, 0F, -2.55F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2.55F, -0.5F, 0F, -2.55F, 0F, 0F, 0F); // Box 496
		bodyModel[320].setRotationPoint(54.4F, -11F, 7.29F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, 0F, -0.55F, 0.2F, 0F, 0.15F, 1.9F, 0F, -0.7F, -1.9F, 0F, -0.5F, -0.3F, 0F, -0.55F, 0.2F, 0F, 0.15F, 1.9F, 0F, -0.7F, -1.9F, 0F, -0.5F); // Box 2 glow
		bodyModel[321].setRotationPoint(56.6F, -11F, -5.3F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.6F, 0F, -0.05F, -1.6F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 1.6F, 0F, -0.05F, -1.6F, 0F, -0.05F); // Box 2
		bodyModel[322].setRotationPoint(56.89F, -11F, -4.75F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1.9F, 0F, -0.5F, 1.9F, 0F, -0.7F, 0.2F, 0F, 0.15F, -0.3F, 0F, -0.55F, -1.9F, 0F, -0.5F, 1.9F, 0F, -0.7F, 0.2F, 0F, 0.15F, -0.3F, 0F, -0.55F); // Box 506 glow
		bodyModel[323].setRotationPoint(56.6F, -11F, 1.3F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,-1.6F, 0F, -0.05F, 1.6F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, -0.05F, 1.6F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		bodyModel[324].setRotationPoint(56.89F, -11F, 1.75F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 2 glow
		bodyModel[325].setRotationPoint(58.5F, -11F, -2F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		bodyModel[326].setRotationPoint(58.49F, -11F, -2F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 510 glow
		bodyModel[327].setRotationPoint(58.5F, -11F, 0F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 511
		bodyModel[328].setRotationPoint(58.49F, -11F, 0F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 527
		bodyModel[329].setRotationPoint(52.35F, -6F, -3.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 532
		bodyModel[330].setRotationPoint(52.85F, -2.5F, -3.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[331].setRotationPoint(53.35F, -3F, -3.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[332].setRotationPoint(53.1F, -4F, -4F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[333].setRotationPoint(53.1F, -4F, 3F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[334].setRotationPoint(47.5F, -3F, -5.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[335].setRotationPoint(47.5F, -6F, -1.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[336].setRotationPoint(47F, -4.5F, -4.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[337].setRotationPoint(51.5F, -4.5F, -4.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 558
		bodyModel[338].setRotationPoint(47.5F, -3F, 1.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 559
		bodyModel[339].setRotationPoint(47.5F, -6F, 0.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[340].setRotationPoint(47F, -4.5F, 0.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[341].setRotationPoint(51.5F, -4.5F, 0.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[342].setRotationPoint(42F, -3F, -5.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[343].setRotationPoint(42F, -6F, -1.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[344].setRotationPoint(41.5F, -4.5F, -4.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[345].setRotationPoint(46F, -4.5F, -4.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 559
		bodyModel[346].setRotationPoint(42F, -6F, 0.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[347].setRotationPoint(41.5F, -4.5F, 0.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[348].setRotationPoint(46F, -4.5F, 0.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[349].setRotationPoint(36.5F, -3F, -5.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[350].setRotationPoint(36.5F, -6F, -1.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[351].setRotationPoint(36F, -4.5F, -4.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[352].setRotationPoint(40.5F, -4.5F, -4.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 559
		bodyModel[353].setRotationPoint(36.5F, -6F, 0.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[354].setRotationPoint(36F, -4.5F, 0.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, -4F, 0F, -6.5F, -4F); // Box 529 cull
		bodyModel[355].setRotationPoint(40.5F, -4.5F, 0.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 558
		bodyModel[356].setRotationPoint(42F, -3F, 1.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 558
		bodyModel[357].setRotationPoint(36.5F, -3F, 1.5F);

		bodyModel[358].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[358].setRotationPoint(-16.5F, -5F, 6.4F);
		bodyModel[358].rotateAngleY = -1.57079633F;

		bodyModel[359].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[359].setRotationPoint(-16.5F, -5F, 6.4F);
		bodyModel[359].rotateAngleY = -1.57079633F;

		bodyModel[360].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[360].setRotationPoint(-16.5F, -3F, 6.4F);
		bodyModel[360].rotateAngleY = -1.57079633F;

		bodyModel[361].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[361].setRotationPoint(-16.5F, -8F, 6.4F);
		bodyModel[361].rotateAngleY = -1.57079633F;

		bodyModel[362].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[362].setRotationPoint(-16.5F, -4F, 6.4F);
		bodyModel[362].rotateAngleY = -1.57079633F;

		bodyModel[363].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[363].setRotationPoint(-16.5F, -5F, 6.4F);
		bodyModel[363].rotateAngleY = -1.57079633F;

		bodyModel[364].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[364].setRotationPoint(-16.5F, -4F, 6.4F);
		bodyModel[364].rotateAngleY = -1.57079633F;

		bodyModel[365].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[365].setRotationPoint(-16.5F, -5F, 6.4F);
		bodyModel[365].rotateAngleY = -1.57079633F;

		bodyModel[366].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[366].setRotationPoint(-16.5F, -1F, 6.4F);
		bodyModel[366].rotateAngleY = -0.78539816F;

		bodyModel[367].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[367].setRotationPoint(-16.5F, -4F, 6.4F);
		bodyModel[367].rotateAngleY = -1.57079633F;

		bodyModel[368].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[368].setRotationPoint(-16.5F, -4.5F, 6.4F);
		bodyModel[368].rotateAngleY = -1.57079633F;

		bodyModel[369].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[369].setRotationPoint(-16.5F, -4.5F, 6.4F);
		bodyModel[369].rotateAngleY = -1.57079633F;

		bodyModel[370].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[370].setRotationPoint(-16.5F, -1.5F, 6.4F);
		bodyModel[370].rotateAngleY = -1.57079633F;

		bodyModel[371].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[371].setRotationPoint(-21.5F, -15F, -5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[372].setRotationPoint(-21.5F, -15F, -6F);

		bodyModel[373].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[373].setRotationPoint(-9F, -5F, 6.4F);
		bodyModel[373].rotateAngleY = -1.57079633F;

		bodyModel[374].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[374].setRotationPoint(-9F, -5F, 6.4F);
		bodyModel[374].rotateAngleY = -1.57079633F;

		bodyModel[375].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[375].setRotationPoint(-9F, -3F, 6.4F);
		bodyModel[375].rotateAngleY = -1.57079633F;

		bodyModel[376].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[376].setRotationPoint(-9F, -8F, 6.4F);
		bodyModel[376].rotateAngleY = -1.57079633F;

		bodyModel[377].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[377].setRotationPoint(-9F, -4F, 6.4F);
		bodyModel[377].rotateAngleY = -1.57079633F;

		bodyModel[378].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[378].setRotationPoint(-9F, -5F, 6.4F);
		bodyModel[378].rotateAngleY = -1.57079633F;

		bodyModel[379].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[379].setRotationPoint(-9F, -4F, 6.4F);
		bodyModel[379].rotateAngleY = -1.57079633F;

		bodyModel[380].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[380].setRotationPoint(-9F, -5F, 6.4F);
		bodyModel[380].rotateAngleY = -1.57079633F;

		bodyModel[381].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[381].setRotationPoint(-9F, -1F, 6.4F);
		bodyModel[381].rotateAngleY = -0.78539816F;

		bodyModel[382].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[382].setRotationPoint(-9F, -4F, 6.4F);
		bodyModel[382].rotateAngleY = -1.57079633F;

		bodyModel[383].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[383].setRotationPoint(-9F, -4.5F, 6.4F);
		bodyModel[383].rotateAngleY = -1.57079633F;

		bodyModel[384].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[384].setRotationPoint(-9F, -4.5F, 6.4F);
		bodyModel[384].rotateAngleY = -1.57079633F;

		bodyModel[385].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[385].setRotationPoint(-9F, -1.5F, 6.4F);
		bodyModel[385].rotateAngleY = -1.57079633F;

		bodyModel[386].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[386].setRotationPoint(-1.5F, -5F, 6.4F);
		bodyModel[386].rotateAngleY = -1.57079633F;

		bodyModel[387].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[387].setRotationPoint(-1.5F, -5F, 6.4F);
		bodyModel[387].rotateAngleY = -1.57079633F;

		bodyModel[388].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[388].setRotationPoint(-1.5F, -3F, 6.4F);
		bodyModel[388].rotateAngleY = -1.57079633F;

		bodyModel[389].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[389].setRotationPoint(-1.5F, -8F, 6.4F);
		bodyModel[389].rotateAngleY = -1.57079633F;

		bodyModel[390].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[390].setRotationPoint(-1.5F, -4F, 6.4F);
		bodyModel[390].rotateAngleY = -1.57079633F;

		bodyModel[391].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[391].setRotationPoint(-1.5F, -5F, 6.4F);
		bodyModel[391].rotateAngleY = -1.57079633F;

		bodyModel[392].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[392].setRotationPoint(-1.5F, -4F, 6.4F);
		bodyModel[392].rotateAngleY = -1.57079633F;

		bodyModel[393].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[393].setRotationPoint(-1.5F, -5F, 6.4F);
		bodyModel[393].rotateAngleY = -1.57079633F;

		bodyModel[394].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[394].setRotationPoint(-1.5F, -1F, 6.4F);
		bodyModel[394].rotateAngleY = -0.78539816F;

		bodyModel[395].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[395].setRotationPoint(-1.5F, -4F, 6.4F);
		bodyModel[395].rotateAngleY = -1.57079633F;

		bodyModel[396].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[396].setRotationPoint(-1.5F, -4.5F, 6.4F);
		bodyModel[396].rotateAngleY = -1.57079633F;

		bodyModel[397].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[397].setRotationPoint(-1.5F, -4.5F, 6.4F);
		bodyModel[397].rotateAngleY = -1.57079633F;

		bodyModel[398].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[398].setRotationPoint(-1.5F, -1.5F, 6.4F);
		bodyModel[398].rotateAngleY = -1.57079633F;

		bodyModel[399].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[399].setRotationPoint(6F, -5F, 6.4F);
		bodyModel[399].rotateAngleY = -1.57079633F;

		bodyModel[400].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[400].setRotationPoint(6F, -5F, 6.4F);
		bodyModel[400].rotateAngleY = -1.57079633F;

		bodyModel[401].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[401].setRotationPoint(6F, -3F, 6.4F);
		bodyModel[401].rotateAngleY = -1.57079633F;

		bodyModel[402].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[402].setRotationPoint(6F, -8F, 6.4F);
		bodyModel[402].rotateAngleY = -1.57079633F;

		bodyModel[403].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[403].setRotationPoint(6F, -4F, 6.4F);
		bodyModel[403].rotateAngleY = -1.57079633F;

		bodyModel[404].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[404].setRotationPoint(6F, -5F, 6.4F);
		bodyModel[404].rotateAngleY = -1.57079633F;

		bodyModel[405].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[405].setRotationPoint(6F, -4F, 6.4F);
		bodyModel[405].rotateAngleY = -1.57079633F;

		bodyModel[406].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[406].setRotationPoint(6F, -5F, 6.4F);
		bodyModel[406].rotateAngleY = -1.57079633F;

		bodyModel[407].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[407].setRotationPoint(6F, -1F, 6.4F);
		bodyModel[407].rotateAngleY = -0.78539816F;

		bodyModel[408].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[408].setRotationPoint(6F, -4F, 6.4F);
		bodyModel[408].rotateAngleY = -1.57079633F;

		bodyModel[409].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[409].setRotationPoint(6F, -4.5F, 6.4F);
		bodyModel[409].rotateAngleY = -1.57079633F;

		bodyModel[410].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[410].setRotationPoint(6F, -4.5F, 6.4F);
		bodyModel[410].rotateAngleY = -1.57079633F;

		bodyModel[411].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[411].setRotationPoint(6F, -1.5F, 6.4F);
		bodyModel[411].rotateAngleY = -1.57079633F;

		bodyModel[412].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[412].setRotationPoint(13.5F, -5F, 6.4F);
		bodyModel[412].rotateAngleY = -1.57079633F;

		bodyModel[413].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[413].setRotationPoint(13.5F, -5F, 6.4F);
		bodyModel[413].rotateAngleY = -1.57079633F;

		bodyModel[414].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[414].setRotationPoint(13.5F, -3F, 6.4F);
		bodyModel[414].rotateAngleY = -1.57079633F;

		bodyModel[415].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[415].setRotationPoint(13.5F, -8F, 6.4F);
		bodyModel[415].rotateAngleY = -1.57079633F;

		bodyModel[416].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[416].setRotationPoint(13.5F, -4F, 6.4F);
		bodyModel[416].rotateAngleY = -1.57079633F;

		bodyModel[417].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[417].setRotationPoint(13.5F, -5F, 6.4F);
		bodyModel[417].rotateAngleY = -1.57079633F;

		bodyModel[418].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[418].setRotationPoint(13.5F, -4F, 6.4F);
		bodyModel[418].rotateAngleY = -1.57079633F;

		bodyModel[419].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[419].setRotationPoint(13.5F, -5F, 6.4F);
		bodyModel[419].rotateAngleY = -1.57079633F;

		bodyModel[420].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[420].setRotationPoint(13.5F, -1F, 6.4F);
		bodyModel[420].rotateAngleY = -0.78539816F;

		bodyModel[421].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[421].setRotationPoint(13.5F, -4F, 6.4F);
		bodyModel[421].rotateAngleY = -1.57079633F;

		bodyModel[422].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[422].setRotationPoint(13.5F, -4.5F, 6.4F);
		bodyModel[422].rotateAngleY = -1.57079633F;

		bodyModel[423].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[423].setRotationPoint(13.5F, -4.5F, 6.4F);
		bodyModel[423].rotateAngleY = -1.57079633F;

		bodyModel[424].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[424].setRotationPoint(13.5F, -1.5F, 6.4F);
		bodyModel[424].rotateAngleY = -1.57079633F;

		bodyModel[425].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[425].setRotationPoint(21F, -5F, 6.4F);
		bodyModel[425].rotateAngleY = -1.57079633F;

		bodyModel[426].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[426].setRotationPoint(21F, -5F, 6.4F);
		bodyModel[426].rotateAngleY = -1.57079633F;

		bodyModel[427].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[427].setRotationPoint(21F, -3F, 6.4F);
		bodyModel[427].rotateAngleY = -1.57079633F;

		bodyModel[428].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[428].setRotationPoint(21F, -8F, 6.4F);
		bodyModel[428].rotateAngleY = -1.57079633F;

		bodyModel[429].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[429].setRotationPoint(21F, -4F, 6.4F);
		bodyModel[429].rotateAngleY = -1.57079633F;

		bodyModel[430].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[430].setRotationPoint(21F, -5F, 6.4F);
		bodyModel[430].rotateAngleY = -1.57079633F;

		bodyModel[431].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[431].setRotationPoint(21F, -4F, 6.4F);
		bodyModel[431].rotateAngleY = -1.57079633F;

		bodyModel[432].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[432].setRotationPoint(21F, -5F, 6.4F);
		bodyModel[432].rotateAngleY = -1.57079633F;

		bodyModel[433].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[433].setRotationPoint(21F, -1F, 6.4F);
		bodyModel[433].rotateAngleY = -0.78539816F;

		bodyModel[434].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[434].setRotationPoint(21F, -4F, 6.4F);
		bodyModel[434].rotateAngleY = -1.57079633F;

		bodyModel[435].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[435].setRotationPoint(21F, -4.5F, 6.4F);
		bodyModel[435].rotateAngleY = -1.57079633F;

		bodyModel[436].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[436].setRotationPoint(21F, -4.5F, 6.4F);
		bodyModel[436].rotateAngleY = -1.57079633F;

		bodyModel[437].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[437].setRotationPoint(21F, -1.5F, 6.4F);
		bodyModel[437].rotateAngleY = -1.57079633F;

		bodyModel[438].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Left seat part
		bodyModel[438].setRotationPoint(-9F, -5F, -6.4F);
		bodyModel[438].rotateAngleY = -4.71238898F;

		bodyModel[439].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Left seat part
		bodyModel[439].setRotationPoint(-9F, -5F, -6.4F);
		bodyModel[439].rotateAngleY = -4.71238898F;

		bodyModel[440].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[440].setRotationPoint(-9F, -3F, -6.4F);
		bodyModel[440].rotateAngleY = -4.71238898F;

		bodyModel[441].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Left seat part
		bodyModel[441].setRotationPoint(-9F, -4F, -6.4F);
		bodyModel[441].rotateAngleY = -4.71238898F;

		bodyModel[442].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[442].setRotationPoint(-9F, -5F, -6.4F);
		bodyModel[442].rotateAngleY = -4.71238898F;

		bodyModel[443].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Left seat part
		bodyModel[443].setRotationPoint(-9F, -4F, -6.4F);
		bodyModel[443].rotateAngleY = -4.71238898F;

		bodyModel[444].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[444].setRotationPoint(-9F, -5F, -6.4F);
		bodyModel[444].rotateAngleY = -4.71238898F;

		bodyModel[445].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[445].setRotationPoint(-9F, -1F, -6.4F);
		bodyModel[445].rotateAngleY = -3.92699082F;

		bodyModel[446].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Left seat part
		bodyModel[446].setRotationPoint(-9F, -8F, -6.4F);
		bodyModel[446].rotateAngleY = -4.71238898F;

		bodyModel[447].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[447].setRotationPoint(-9F, -4F, -6.4F);
		bodyModel[447].rotateAngleY = -4.71238898F;

		bodyModel[448].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[448].setRotationPoint(-9F, -4.5F, -6.4F);
		bodyModel[448].rotateAngleY = -4.71238898F;

		bodyModel[449].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[449].setRotationPoint(-9F, -4.5F, -6.4F);
		bodyModel[449].rotateAngleY = -4.71238898F;

		bodyModel[450].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Left seat part
		bodyModel[450].setRotationPoint(-9F, -1.5F, -6.4F);
		bodyModel[450].rotateAngleY = -4.71238898F;

		bodyModel[451].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Left seat part
		bodyModel[451].setRotationPoint(-1.5F, -5F, -6.4F);
		bodyModel[451].rotateAngleY = -4.71238898F;

		bodyModel[452].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Left seat part
		bodyModel[452].setRotationPoint(-1.5F, -5F, -6.4F);
		bodyModel[452].rotateAngleY = -4.71238898F;

		bodyModel[453].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[453].setRotationPoint(-1.5F, -3F, -6.4F);
		bodyModel[453].rotateAngleY = -4.71238898F;

		bodyModel[454].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Left seat part
		bodyModel[454].setRotationPoint(-1.5F, -4F, -6.4F);
		bodyModel[454].rotateAngleY = -4.71238898F;

		bodyModel[455].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[455].setRotationPoint(-1.5F, -5F, -6.4F);
		bodyModel[455].rotateAngleY = -4.71238898F;

		bodyModel[456].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Left seat part
		bodyModel[456].setRotationPoint(-1.5F, -4F, -6.4F);
		bodyModel[456].rotateAngleY = -4.71238898F;

		bodyModel[457].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[457].setRotationPoint(-1.5F, -5F, -6.4F);
		bodyModel[457].rotateAngleY = -4.71238898F;

		bodyModel[458].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[458].setRotationPoint(-1.5F, -1F, -6.4F);
		bodyModel[458].rotateAngleY = -3.92699082F;

		bodyModel[459].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Left seat part
		bodyModel[459].setRotationPoint(-1.5F, -8F, -6.4F);
		bodyModel[459].rotateAngleY = -4.71238898F;

		bodyModel[460].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[460].setRotationPoint(-1.5F, -4F, -6.4F);
		bodyModel[460].rotateAngleY = -4.71238898F;

		bodyModel[461].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[461].setRotationPoint(-1.5F, -4.5F, -6.4F);
		bodyModel[461].rotateAngleY = -4.71238898F;

		bodyModel[462].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[462].setRotationPoint(-1.5F, -4.5F, -6.4F);
		bodyModel[462].rotateAngleY = -4.71238898F;

		bodyModel[463].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Left seat part
		bodyModel[463].setRotationPoint(-1.5F, -1.5F, -6.4F);
		bodyModel[463].rotateAngleY = -4.71238898F;

		bodyModel[464].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Left seat part
		bodyModel[464].setRotationPoint(6F, -5F, -6.4F);
		bodyModel[464].rotateAngleY = -4.71238898F;

		bodyModel[465].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Left seat part
		bodyModel[465].setRotationPoint(6F, -5F, -6.4F);
		bodyModel[465].rotateAngleY = -4.71238898F;

		bodyModel[466].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[466].setRotationPoint(6F, -3F, -6.4F);
		bodyModel[466].rotateAngleY = -4.71238898F;

		bodyModel[467].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Left seat part
		bodyModel[467].setRotationPoint(6F, -4F, -6.4F);
		bodyModel[467].rotateAngleY = -4.71238898F;

		bodyModel[468].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[468].setRotationPoint(6F, -5F, -6.4F);
		bodyModel[468].rotateAngleY = -4.71238898F;

		bodyModel[469].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Left seat part
		bodyModel[469].setRotationPoint(6F, -4F, -6.4F);
		bodyModel[469].rotateAngleY = -4.71238898F;

		bodyModel[470].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[470].setRotationPoint(6F, -5F, -6.4F);
		bodyModel[470].rotateAngleY = -4.71238898F;

		bodyModel[471].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[471].setRotationPoint(6F, -1F, -6.4F);
		bodyModel[471].rotateAngleY = -3.92699082F;

		bodyModel[472].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Left seat part
		bodyModel[472].setRotationPoint(6F, -8F, -6.4F);
		bodyModel[472].rotateAngleY = -4.71238898F;

		bodyModel[473].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[473].setRotationPoint(6F, -4F, -6.4F);
		bodyModel[473].rotateAngleY = -4.71238898F;

		bodyModel[474].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[474].setRotationPoint(6F, -4.5F, -6.4F);
		bodyModel[474].rotateAngleY = -4.71238898F;

		bodyModel[475].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[475].setRotationPoint(6F, -4.5F, -6.4F);
		bodyModel[475].rotateAngleY = -4.71238898F;

		bodyModel[476].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Left seat part
		bodyModel[476].setRotationPoint(6F, -1.5F, -6.4F);
		bodyModel[476].rotateAngleY = -4.71238898F;

		bodyModel[477].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Left seat part
		bodyModel[477].setRotationPoint(13.5F, -5F, -6.4F);
		bodyModel[477].rotateAngleY = -4.71238898F;

		bodyModel[478].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Left seat part
		bodyModel[478].setRotationPoint(13.5F, -5F, -6.4F);
		bodyModel[478].rotateAngleY = -4.71238898F;

		bodyModel[479].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[479].setRotationPoint(13.5F, -3F, -6.4F);
		bodyModel[479].rotateAngleY = -4.71238898F;

		bodyModel[480].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Left seat part
		bodyModel[480].setRotationPoint(13.5F, -4F, -6.4F);
		bodyModel[480].rotateAngleY = -4.71238898F;

		bodyModel[481].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[481].setRotationPoint(13.5F, -5F, -6.4F);
		bodyModel[481].rotateAngleY = -4.71238898F;

		bodyModel[482].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Left seat part
		bodyModel[482].setRotationPoint(13.5F, -4F, -6.4F);
		bodyModel[482].rotateAngleY = -4.71238898F;

		bodyModel[483].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[483].setRotationPoint(13.5F, -5F, -6.4F);
		bodyModel[483].rotateAngleY = -4.71238898F;

		bodyModel[484].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[484].setRotationPoint(13.5F, -1F, -6.4F);
		bodyModel[484].rotateAngleY = -3.92699082F;

		bodyModel[485].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Left seat part
		bodyModel[485].setRotationPoint(13.5F, -8F, -6.4F);
		bodyModel[485].rotateAngleY = -4.71238898F;

		bodyModel[486].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[486].setRotationPoint(13.5F, -4F, -6.4F);
		bodyModel[486].rotateAngleY = -4.71238898F;

		bodyModel[487].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[487].setRotationPoint(13.5F, -4.5F, -6.4F);
		bodyModel[487].rotateAngleY = -4.71238898F;

		bodyModel[488].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[488].setRotationPoint(13.5F, -4.5F, -6.4F);
		bodyModel[488].rotateAngleY = -4.71238898F;

		bodyModel[489].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Left seat part
		bodyModel[489].setRotationPoint(13.5F, -1.5F, -6.4F);
		bodyModel[489].rotateAngleY = -4.71238898F;

		bodyModel[490].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Left seat part
		bodyModel[490].setRotationPoint(21F, -5F, -6.4F);
		bodyModel[490].rotateAngleY = -4.71238898F;

		bodyModel[491].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Left seat part
		bodyModel[491].setRotationPoint(21F, -5F, -6.4F);
		bodyModel[491].rotateAngleY = -4.71238898F;

		bodyModel[492].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[492].setRotationPoint(21F, -3F, -6.4F);
		bodyModel[492].rotateAngleY = -4.71238898F;

		bodyModel[493].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Left seat part
		bodyModel[493].setRotationPoint(21F, -4F, -6.4F);
		bodyModel[493].rotateAngleY = -4.71238898F;

		bodyModel[494].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[494].setRotationPoint(21F, -5F, -6.4F);
		bodyModel[494].rotateAngleY = -4.71238898F;

		bodyModel[495].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Left seat part
		bodyModel[495].setRotationPoint(21F, -4F, -6.4F);
		bodyModel[495].rotateAngleY = -4.71238898F;

		bodyModel[496].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[496].setRotationPoint(21F, -5F, -6.4F);
		bodyModel[496].rotateAngleY = -4.71238898F;

		bodyModel[497].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[497].setRotationPoint(21F, -1F, -6.4F);
		bodyModel[497].rotateAngleY = -3.92699082F;

		bodyModel[498].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Left seat part
		bodyModel[498].setRotationPoint(21F, -8F, -6.4F);
		bodyModel[498].rotateAngleY = -4.71238898F;

		bodyModel[499].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[499].setRotationPoint(21F, -4F, -6.4F);
		bodyModel[499].rotateAngleY = -4.71238898F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 482, 288, textureX, textureY); // Left seat part
		bodyModel[501] = new ModelRendererTurbo(this, 452, 288, textureX, textureY); // Left seat part
		bodyModel[502] = new ModelRendererTurbo(this, 464, 297, textureX, textureY); // Left seat part
		bodyModel[503] = new ModelRendererTurbo(this, 262, 237, textureX, textureY); // Box 275
		bodyModel[504] = new ModelRendererTurbo(this, 270, 237, textureX, textureY); // Box 631
		bodyModel[505] = new ModelRendererTurbo(this, 260, 239, textureX, textureY); // Box 275
		bodyModel[506] = new ModelRendererTurbo(this, 260, 254, textureX, textureY); // Box 275
		bodyModel[507] = new ModelRendererTurbo(this, 487, 251, textureX, textureY); // Right seat part
		bodyModel[508] = new ModelRendererTurbo(this, 489, 255, textureX, textureY); // Right seat part
		bodyModel[509] = new ModelRendererTurbo(this, 487, 263, textureX, textureY); // Right seat part
		bodyModel[510] = new ModelRendererTurbo(this, 487, 292, textureX, textureY); // Right seat part
		bodyModel[511] = new ModelRendererTurbo(this, 489, 296, textureX, textureY); // Right seat part
		bodyModel[512] = new ModelRendererTurbo(this, 487, 304, textureX, textureY); // Right seat part
		bodyModel[513] = new ModelRendererTurbo(this, 496, 251, textureX, textureY); // Right seat part
		bodyModel[514] = new ModelRendererTurbo(this, 498, 255, textureX, textureY); // Right seat part
		bodyModel[515] = new ModelRendererTurbo(this, 496, 263, textureX, textureY); // Right seat part
		bodyModel[516] = new ModelRendererTurbo(this, 496, 292, textureX, textureY); // Right seat part
		bodyModel[517] = new ModelRendererTurbo(this, 498, 296, textureX, textureY); // Right seat part
		bodyModel[518] = new ModelRendererTurbo(this, 496, 304, textureX, textureY); // Right seat part
		bodyModel[519] = new ModelRendererTurbo(this, 283, 182, textureX, textureY); // Box 38
		bodyModel[520] = new ModelRendererTurbo(this, 269, 163, textureX, textureY); // Box 38
		bodyModel[521] = new ModelRendererTurbo(this, 283, 158, textureX, textureY); // Box 276
		bodyModel[522] = new ModelRendererTurbo(this, 349, 349, textureX, textureY); // Box 128
		bodyModel[523] = new ModelRendererTurbo(this, 339, 334, textureX, textureY); // Box 128
		bodyModel[524] = new ModelRendererTurbo(this, 338, 358, textureX, textureY); // Box 128
		bodyModel[525] = new ModelRendererTurbo(this, 333, 358, textureX, textureY); // Box 399
		bodyModel[526] = new ModelRendererTurbo(this, 334, 334, textureX, textureY); // Box 400
		bodyModel[527] = new ModelRendererTurbo(this, 333, 349, textureX, textureY); // Box 128
		bodyModel[528] = new ModelRendererTurbo(this, 348, 345, textureX, textureY); // Box 128
		bodyModel[529] = new ModelRendererTurbo(this, 348, 352, textureX, textureY); // Box 128
		bodyModel[530] = new ModelRendererTurbo(this, 333, 340, textureX, textureY); // Box 128
		bodyModel[531] = new ModelRendererTurbo(this, 316, 327, textureX, textureY); // Box 128
		bodyModel[532] = new ModelRendererTurbo(this, 324, 334, textureX, textureY); // Box 464
		bodyModel[533] = new ModelRendererTurbo(this, 349, 327, textureX, textureY); // Box 128
		bodyModel[534] = new ModelRendererTurbo(this, 342, 322, textureX, textureY); // Box 128
		bodyModel[535] = new ModelRendererTurbo(this, 342, 327, textureX, textureY); // Box 128
		bodyModel[536] = new ModelRendererTurbo(this, 356, 327, textureX, textureY); // Box 640
		bodyModel[537] = new ModelRendererTurbo(this, 142, 2, textureX, textureY); // Box 275
		bodyModel[538] = new ModelRendererTurbo(this, 142, 5, textureX, textureY); // Box 701
		bodyModel[539] = new ModelRendererTurbo(this, 142, 18, textureX, textureY); // Box 549
		bodyModel[540] = new ModelRendererTurbo(this, 142, 21, textureX, textureY); // Box 550
		bodyModel[541] = new ModelRendererTurbo(this, 149, 18, textureX, textureY); // Box 648
		bodyModel[542] = new ModelRendererTurbo(this, 154, 18, textureX, textureY); // Box 549
		bodyModel[543] = new ModelRendererTurbo(this, 154, 21, textureX, textureY); // Box 550
		bodyModel[544] = new ModelRendererTurbo(this, 339, 230, textureX, textureY); // Box 275
		bodyModel[545] = new ModelRendererTurbo(this, 204, 254, textureX, textureY); // Box 38
		bodyModel[546] = new ModelRendererTurbo(this, 150, 254, textureX, textureY); // Box 38
		bodyModel[547] = new ModelRendererTurbo(this, 107, 268, textureX, textureY); // Box 38
		bodyModel[548] = new ModelRendererTurbo(this, 63, 233, textureX, textureY); // Box 38
		bodyModel[549] = new ModelRendererTurbo(this, 76, 268, textureX, textureY); // Box 38
		bodyModel[550] = new ModelRendererTurbo(this, 96, 247, textureX, textureY); // Box 38
		bodyModel[551] = new ModelRendererTurbo(this, 98, 266, textureX, textureY); // Box 38
		bodyModel[552] = new ModelRendererTurbo(this, 183, 261, textureX, textureY); // Box 38
		bodyModel[553] = new ModelRendererTurbo(this, 166, 241, textureX, textureY); // Box 38
		bodyModel[554] = new ModelRendererTurbo(this, 170, 254, textureX, textureY); // Box 128
		bodyModel[555] = new ModelRendererTurbo(this, 182, 250, textureX, textureY); // Box 128
		bodyModel[556] = new ModelRendererTurbo(this, 89, 234, textureX, textureY); // Box 38
		bodyModel[557] = new ModelRendererTurbo(this, 136, 242, textureX, textureY); // Box 38
		bodyModel[558] = new ModelRendererTurbo(this, 136, 255, textureX, textureY); // Box 38
		bodyModel[559] = new ModelRendererTurbo(this, 195, 240, textureX, textureY); // Box 300
		bodyModel[560] = new ModelRendererTurbo(this, 118, 242, textureX, textureY); // Box 128
		bodyModel[561] = new ModelRendererTurbo(this, 118, 248, textureX, textureY); // Box 464
		bodyModel[562] = new ModelRendererTurbo(this, 130, 248, textureX, textureY); // Box 464
		bodyModel[563] = new ModelRendererTurbo(this, 195, 235, textureX, textureY); // Box 300
		bodyModel[564] = new ModelRendererTurbo(this, 246, 235, textureX, textureY); // Box 38
		bodyModel[565] = new ModelRendererTurbo(this, 122, 254, textureX, textureY); // Box 128
		bodyModel[566] = new ModelRendererTurbo(this, 123, 248, textureX, textureY); // Box 128
		bodyModel[567] = new ModelRendererTurbo(this, 117, 258, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[568] = new ModelRendererTurbo(this, 31, 237, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[569] = new ModelRendererTurbo(this, 27, 237, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[570] = new ModelRendererTurbo(this, 20, 237, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[571] = new ModelRendererTurbo(this, 89, 267, textureX, textureY); // Box 38
		bodyModel[572] = new ModelRendererTurbo(this, 89, 274, textureX, textureY); // Box 38
		bodyModel[573] = new ModelRendererTurbo(this, 89, 281, textureX, textureY); // Box 38
		bodyModel[574] = new ModelRendererTurbo(this, 84, 269, textureX, textureY); // Box 38
		bodyModel[575] = new ModelRendererTurbo(this, 84, 276, textureX, textureY); // Box 38
		bodyModel[576] = new ModelRendererTurbo(this, 84, 283, textureX, textureY); // Box 38
		bodyModel[577] = new ModelRendererTurbo(this, 83, 265, textureX, textureY); // Box 38
		bodyModel[578] = new ModelRendererTurbo(this, 83, 272, textureX, textureY); // Box 38
		bodyModel[579] = new ModelRendererTurbo(this, 83, 279, textureX, textureY); // Box 38
		bodyModel[580] = new ModelRendererTurbo(this, 1, 237, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[581] = new ModelRendererTurbo(this, 15, 237, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[582] = new ModelRendererTurbo(this, 8, 237, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[583] = new ModelRendererTurbo(this, 192, 236, textureX, textureY); // Box 38
		bodyModel[584] = new ModelRendererTurbo(this, 222, 239, textureX, textureY); // Folding seat/bed F
		bodyModel[585] = new ModelRendererTurbo(this, 239, 250, textureX, textureY,"lamp"); // Box 462 glow
		bodyModel[586] = new ModelRendererTurbo(this, 239, 239, textureX, textureY,"lamp"); // Box 462 glow
		bodyModel[587] = new ModelRendererTurbo(this, 46, 259, textureX, textureY); // Box 38
		bodyModel[588] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 38
		bodyModel[589] = new ModelRendererTurbo(this, 1, 240, textureX, textureY); // Box 38
		bodyModel[590] = new ModelRendererTurbo(this, 63, 265, textureX, textureY); // Box 515
		bodyModel[591] = new ModelRendererTurbo(this, 27, 274, textureX, textureY); // Box 38
		bodyModel[592] = new ModelRendererTurbo(this, 27, 265, textureX, textureY); // Box 38
		bodyModel[593] = new ModelRendererTurbo(this, 32, 265, textureX, textureY); // Box 38
		bodyModel[594] = new ModelRendererTurbo(this, 37, 248, textureX, textureY); // Box 38
		bodyModel[595] = new ModelRendererTurbo(this, 14, 270, textureX, textureY); // Box 38
		bodyModel[596] = new ModelRendererTurbo(this, 17, 275, textureX, textureY); // Box 38
		bodyModel[597] = new ModelRendererTurbo(this, 16, 279, textureX, textureY); // Box 38
		bodyModel[598] = new ModelRendererTurbo(this, 24, 245, textureX, textureY); // Box 38
		bodyModel[599] = new ModelRendererTurbo(this, 27, 250, textureX, textureY); // Box 38
		bodyModel[600] = new ModelRendererTurbo(this, 26, 254, textureX, textureY); // Box 38
		bodyModel[601] = new ModelRendererTurbo(this, 37, 279, textureX, textureY); // Box 38
		bodyModel[602] = new ModelRendererTurbo(this, 37, 272, textureX, textureY); // Box 38
		bodyModel[603] = new ModelRendererTurbo(this, 38, 245, textureX, textureY); // Box 38
		bodyModel[604] = new ModelRendererTurbo(this, 38, 239, textureX, textureY); // Box 38
		bodyModel[605] = new ModelRendererTurbo(this, 46, 238, textureX, textureY); // Box 38
		bodyModel[606] = new ModelRendererTurbo(this, 50, 246, textureX, textureY); // Box 38
		bodyModel[607] = new ModelRendererTurbo(this, 46, 250, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[608] = new ModelRendererTurbo(this, 218, 286, textureX, textureY); // Box 38
		bodyModel[609] = new ModelRendererTurbo(this, 163, 181, textureX, textureY); // Box 38
		bodyModel[610] = new ModelRendererTurbo(this, 153, 180, textureX, textureY); // Box 38
		bodyModel[611] = new ModelRendererTurbo(this, 158, 180, textureX, textureY); // Box 38
		bodyModel[612] = new ModelRendererTurbo(this, 172, 181, textureX, textureY); // Box 38
		bodyModel[613] = new ModelRendererTurbo(this, 127, 178, textureX, textureY); // Box 41
		bodyModel[614] = new ModelRendererTurbo(this, 140, 178, textureX, textureY); // Box 41
		bodyModel[615] = new ModelRendererTurbo(this, 136, 178, textureX, textureY); // Box 41
		bodyModel[616] = new ModelRendererTurbo(this, 149, 178, textureX, textureY); // Box 41
		bodyModel[617] = new ModelRendererTurbo(this, 141, 178, textureX, textureY); // Box 41
		bodyModel[618] = new ModelRendererTurbo(this, 128, 178, textureX, textureY); // Box 41
		bodyModel[619] = new ModelRendererTurbo(this, 95, 169, textureX, textureY); // Box 2
		bodyModel[620] = new ModelRendererTurbo(this, 95, 178, textureX, textureY); // Box 2
		bodyModel[621] = new ModelRendererTurbo(this, 118, 178, textureX, textureY); // Box 52
		bodyModel[622] = new ModelRendererTurbo(this, 199, 166, textureX, textureY); // Box 2
		bodyModel[623] = new ModelRendererTurbo(this, 199, 174, textureX, textureY); // Box 2
		bodyModel[624] = new ModelRendererTurbo(this, 73, 164, textureX, textureY); // Box 41
		bodyModel[625] = new ModelRendererTurbo(this, 73, 162, textureX, textureY); // Box 41
		bodyModel[626] = new ModelRendererTurbo(this, 93, 162, textureX, textureY); // Box 41
		bodyModel[627] = new ModelRendererTurbo(this, 183, 181, textureX, textureY); // Box 41
		bodyModel[628] = new ModelRendererTurbo(this, 182, 179, textureX, textureY); // Box 41
		bodyModel[629] = new ModelRendererTurbo(this, 204, 179, textureX, textureY); // Box 41
		bodyModel[630] = new ModelRendererTurbo(this, 177, 182, textureX, textureY); // Box 52
		bodyModel[631] = new ModelRendererTurbo(this, 82, 178, textureX, textureY); // Box 41
		bodyModel[632] = new ModelRendererTurbo(this, 91, 179, textureX, textureY); // Box 41
		bodyModel[633] = new ModelRendererTurbo(this, 83, 179, textureX, textureY); // Box 41
		bodyModel[634] = new ModelRendererTurbo(this, 73, 178, textureX, textureY); // Box 52
		bodyModel[635] = new ModelRendererTurbo(this, 96, 156, textureX, textureY); // Box 52
		bodyModel[636] = new ModelRendererTurbo(this, 126, 156, textureX, textureY); // Box 52
		bodyModel[637] = new ModelRendererTurbo(this, 121, 164, textureX, textureY); // Box 52
		bodyModel[638] = new ModelRendererTurbo(this, 149, 164, textureX, textureY); // Box 52
		bodyModel[639] = new ModelRendererTurbo(this, 156, 160, textureX, textureY); // Box 41
		bodyModel[640] = new ModelRendererTurbo(this, 165, 161, textureX, textureY); // Box 41
		bodyModel[641] = new ModelRendererTurbo(this, 157, 161, textureX, textureY); // Box 41
		bodyModel[642] = new ModelRendererTurbo(this, 169, 163, textureX, textureY); // Box 52
		bodyModel[643] = new ModelRendererTurbo(this, 176, 160, textureX, textureY); // Box 41
		bodyModel[644] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 41
		bodyModel[645] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 41
		bodyModel[646] = new ModelRendererTurbo(this, 190, 162, textureX, textureY); // Box 41
		bodyModel[647] = new ModelRendererTurbo(this, 189, 160, textureX, textureY); // Box 41
		bodyModel[648] = new ModelRendererTurbo(this, 201, 160, textureX, textureY); // Box 41
		bodyModel[649] = new ModelRendererTurbo(this, 400, 121, textureX, textureY); // Box 2
		bodyModel[650] = new ModelRendererTurbo(this, 397, 105, textureX, textureY,"lamp"); // tail sign glow
		bodyModel[651] = new ModelRendererTurbo(this, 458, 48, textureX, textureY,"lamp"); // Box 186 rear MARS light AMTK L
		bodyModel[652] = new ModelRendererTurbo(this, 458, 42, textureX, textureY,"lamp"); // Box 186 rear MARS light AMTK R
		bodyModel[653] = new ModelRendererTurbo(this, 458, 53, textureX, textureY); // Box 2
		bodyModel[654] = new ModelRendererTurbo(this, 458, 38, textureX, textureY); // Box 185
		bodyModel[655] = new ModelRendererTurbo(this, 352, 77, textureX, textureY,"lamp"); // marker light AMTK glow
		bodyModel[656] = new ModelRendererTurbo(this, 347, 77, textureX, textureY); // Box 38
		bodyModel[657] = new ModelRendererTurbo(this, 352, 92, textureX, textureY,"lamp"); // marker light AMTK glow
		bodyModel[658] = new ModelRendererTurbo(this, 347, 92, textureX, textureY); // Box 659
		bodyModel[659] = new ModelRendererTurbo(this, 291, 336, textureX, textureY); // Box 559
		bodyModel[660] = new ModelRendererTurbo(this, 277, 343, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[661] = new ModelRendererTurbo(this, 297, 343, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[662] = new ModelRendererTurbo(this, 288, 344, textureX, textureY); // Box 558
		bodyModel[663] = new ModelRendererTurbo(this, 464, 343, textureX, textureY); // Box 532
		bodyModel[664] = new ModelRendererTurbo(this, 464, 314, textureX, textureY); // Box 566
		bodyModel[665] = new ModelRendererTurbo(this, 425, 343, textureX, textureY); // Box 532
		bodyModel[666] = new ModelRendererTurbo(this, 425, 314, textureX, textureY); // Box 566
		bodyModel[667] = new ModelRendererTurbo(this, 386, 343, textureX, textureY); // Box 532
		bodyModel[668] = new ModelRendererTurbo(this, 386, 314, textureX, textureY); // Box 566
		bodyModel[669] = new ModelRendererTurbo(this, 291, 341, textureX, textureY); // Box 566
		bodyModel[670] = new ModelRendererTurbo(this, 394, 387, textureX, textureY); // Box 559
		bodyModel[671] = new ModelRendererTurbo(this, 408, 394, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[672] = new ModelRendererTurbo(this, 372, 394, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[673] = new ModelRendererTurbo(this, 391, 401, textureX, textureY); // Box 558
		bodyModel[674] = new ModelRendererTurbo(this, 394, 395, textureX, textureY); // Box 566
		bodyModel[675] = new ModelRendererTurbo(this, 462, 387, textureX, textureY); // Box 559
		bodyModel[676] = new ModelRendererTurbo(this, 476, 394, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[677] = new ModelRendererTurbo(this, 440, 394, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[678] = new ModelRendererTurbo(this, 459, 401, textureX, textureY); // Box 558
		bodyModel[679] = new ModelRendererTurbo(this, 462, 395, textureX, textureY); // Box 566
		bodyModel[680] = new ModelRendererTurbo(this, 291, 308, textureX, textureY); // Box 559
		bodyModel[681] = new ModelRendererTurbo(this, 277, 315, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[682] = new ModelRendererTurbo(this, 297, 315, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[683] = new ModelRendererTurbo(this, 288, 316, textureX, textureY); // Box 558
		bodyModel[684] = new ModelRendererTurbo(this, 291, 313, textureX, textureY); // Box 566
		bodyModel[685] = new ModelRendererTurbo(this, 320, 344, textureX, textureY); // Box 754
		bodyModel[686] = new ModelRendererTurbo(this, 324, 349, textureX, textureY); // Box 464
		bodyModel[687] = new ModelRendererTurbo(this, 427, 383, textureX, textureY); // Box 754
		bodyModel[688] = new ModelRendererTurbo(this, 431, 388, textureX, textureY); // Box 464
		bodyModel[689] = new ModelRendererTurbo(this, 394, 366, textureX, textureY); // Box 559
		bodyModel[690] = new ModelRendererTurbo(this, 408, 373, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[691] = new ModelRendererTurbo(this, 372, 373, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[692] = new ModelRendererTurbo(this, 391, 380, textureX, textureY); // Box 558
		bodyModel[693] = new ModelRendererTurbo(this, 394, 374, textureX, textureY); // Box 566
		bodyModel[694] = new ModelRendererTurbo(this, 462, 366, textureX, textureY); // Box 559
		bodyModel[695] = new ModelRendererTurbo(this, 476, 373, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[696] = new ModelRendererTurbo(this, 459, 380, textureX, textureY); // Box 558
		bodyModel[697] = new ModelRendererTurbo(this, 462, 374, textureX, textureY); // Box 566
		bodyModel[698] = new ModelRendererTurbo(this, 440, 373, textureX, textureY,"cull"); // Box 529 cull
		bodyModel[699] = new ModelRendererTurbo(this, 383, 132, textureX, textureY); // Box 2
		bodyModel[700] = new ModelRendererTurbo(this, 401, 125, textureX, textureY); // Box 2
		bodyModel[701] = new ModelRendererTurbo(this, 373, 133, textureX, textureY); // Box 2
		bodyModel[702] = new ModelRendererTurbo(this, 373, 129, textureX, textureY); // Box 240
		bodyModel[703] = new ModelRendererTurbo(this, 371, 137, textureX, textureY); // Box 2
		bodyModel[704] = new ModelRendererTurbo(this, 371, 125, textureX, textureY); // Box 242
		bodyModel[705] = new ModelRendererTurbo(this, 211, 236, textureX, textureY); // Box 38
		bodyModel[706] = new ModelRendererTurbo(this, 356, 163, textureX, textureY); // Box 38
		bodyModel[707] = new ModelRendererTurbo(this, 370, 158, textureX, textureY); // Box 276
		bodyModel[708] = new ModelRendererTurbo(this, 353, 173, textureX, textureY); // Box 38
		bodyModel[709] = new ModelRendererTurbo(this, 224, 288, textureX, textureY); // Box 38
		bodyModel[710] = new ModelRendererTurbo(this, 248, 239, textureX, textureY); // Box 38
		bodyModel[711] = new ModelRendererTurbo(this, 247, 250, textureX, textureY); // Box 38
		bodyModel[712] = new ModelRendererTurbo(this, 245, 238, textureX, textureY); // Box 38
		bodyModel[713] = new ModelRendererTurbo(this, 255, 239, textureX, textureY); // Box 38
		bodyModel[714] = new ModelRendererTurbo(this, 23, 237, textureX, textureY,"lamp"); // Box 128 glow

		bodyModel[500].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[500].setRotationPoint(21F, -4.5F, -6.4F);
		bodyModel[500].rotateAngleY = -4.71238898F;

		bodyModel[501].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[501].setRotationPoint(21F, -4.5F, -6.4F);
		bodyModel[501].rotateAngleY = -4.71238898F;

		bodyModel[502].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Left seat part
		bodyModel[502].setRotationPoint(21F, -1.5F, -6.4F);
		bodyModel[502].rotateAngleY = -4.71238898F;

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[503].setRotationPoint(-20F, -6F, -4F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 631
		bodyModel[504].setRotationPoint(-20F, -6F, 2F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 275
		bodyModel[505].setRotationPoint(-20F, -6F, -3F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[506].setRotationPoint(-20.5F, -6F, -4F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[507].setRotationPoint(-13.75F, -5F, 2F);

		bodyModel[508].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[508].setRotationPoint(-12.75F, -5.5F, 3F);
		bodyModel[508].rotateAngleY = -0.78539816F;

		bodyModel[509].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[509].setRotationPoint(-13.75F, 0.5F, 2F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[510].setRotationPoint(-6.27F, -5F, -4F);

		bodyModel[511].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[511].setRotationPoint(-5.27F, -5.5F, -3F);
		bodyModel[511].rotateAngleY = -0.78539816F;

		bodyModel[512].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[512].setRotationPoint(-6.27F, 0.5F, -4F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[513].setRotationPoint(1.25F, -5F, 2F);

		bodyModel[514].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[514].setRotationPoint(2.25F, -5.5F, 3F);
		bodyModel[514].rotateAngleY = -0.78539816F;

		bodyModel[515].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[515].setRotationPoint(1.25F, 0.5F, 2F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[516].setRotationPoint(15.73F, -5F, -4F);

		bodyModel[517].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[517].setRotationPoint(16.73F, -5.5F, -3F);
		bodyModel[517].rotateAngleY = -0.78539816F;

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[518].setRotationPoint(15.73F, 0.5F, -4F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 35, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[519].setRotationPoint(-55.5F, -17F, -10F);

		bodyModel[520].addBox(0F, 0F, 0F, 27, 2, 16, 0F); // Box 38
		bodyModel[520].setRotationPoint(-55.5F, -17F, -8F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 27, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[521].setRotationPoint(-55.5F, -17F, 8F);

		bodyModel[522].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Box 128
		bodyModel[522].setRotationPoint(33.5F, -3F, -5F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[523].setRotationPoint(31.5F, -3F, 4F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[524].setRotationPoint(31.5F, -3F, -5F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[525].setRotationPoint(30.5F, -3F, -5F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 400
		bodyModel[526].setRotationPoint(30.5F, -3F, 4F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 128
		bodyModel[527].setRotationPoint(30.5F, -3F, -4F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[528].setRotationPoint(32.5F, -6F, 2F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 128
		bodyModel[529].setRotationPoint(32.5F, -6F, -5F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[530].setRotationPoint(30.5F, -3F, 0F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,3F, 0F, -4F, -5F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 3F, 3F, 0F, -4F, -5F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 3F); // Box 128
		bodyModel[531].setRotationPoint(30.5F, -6F, -4F);

		bodyModel[532].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[532].setRotationPoint(30.5F, -5F, 0F);
		bodyModel[532].rotateAngleY = -0.78539816F;

		bodyModel[533].addBox(0F, 0F, 0F, 1, 7, 10, 0F); // Box 128
		bodyModel[533].setRotationPoint(34.5F, -6F, -5F);

		bodyModel[534].addBox(0F, 0F, 0F, 0, 3, 8, 0F); // Box 128
		bodyModel[534].setRotationPoint(35F, -9F, -4F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[535].setRotationPoint(35F, -9F, -4F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		bodyModel[536].setRotationPoint(35F, -9F, 3F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.05F, 0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F); // Box 275
		bodyModel[537].setRotationPoint(-54.5F, -17.5F, 9.85F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.26F, 0.15F, -1F, -0.26F, 0.15F, -1F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F); // Box 701
		bodyModel[538].setRotationPoint(-54.5F, -17.5F, 9.85F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F); // Box 549
		bodyModel[539].setRotationPoint(-54.5F, -17.5F, -10.85F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.26F, 0.15F, -1F, -0.26F, 0.15F, -1F); // Box 550
		bodyModel[540].setRotationPoint(-54.5F, -17.5F, -10.85F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -1F, 0.3F, 0F, -1F, 0.3F); // Box 648
		bodyModel[541].setRotationPoint(-38.5F, -18.4F, -9.3F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F); // Box 549
		bodyModel[542].setRotationPoint(-31.5F, -17.5F, -10.85F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.26F, 0.15F, -1F, -0.26F, 0.15F, -1F); // Box 550
		bodyModel[543].setRotationPoint(-31.5F, -17.5F, -10.85F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F); // Box 275
		bodyModel[544].setRotationPoint(-13.51F, -11F, -10F);

		bodyModel[545].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[545].setRotationPoint(-29.5F, -15F, -5F);

		bodyModel[546].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[546].setRotationPoint(-35.5F, -15F, -5F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 20, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[547].setRotationPoint(-41.5F, -15F, -6F);

		bodyModel[548].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[548].setRotationPoint(-45.5F, -15F, -5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[549].setRotationPoint(-45.5F, -15F, -6F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 9, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[550].setRotationPoint(-44.5F, -15F, -2F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[551].setRotationPoint(-39.5F, -15F, -5F);

		bodyModel[552].addBox(0F, 0F, 0F, 2, 16, 8, 0F); // Box 38
		bodyModel[552].setRotationPoint(-34.5F, -15F, -5F);

		bodyModel[553].addBox(0F, 0F, 0F, 2, 4, 7, 0F); // Box 38
		bodyModel[553].setRotationPoint(-34.5F, -15F, 3F);

		bodyModel[554].addBox(0F, 0F, 0F, 2, 7, 7, 0F); // Box 128
		bodyModel[554].setRotationPoint(-34.5F, -6F, 3F);

		bodyModel[555].addBox(0F, 0F, 0F, 3, 7, 3, 0F); // Box 128
		bodyModel[555].setRotationPoint(-32.5F, -6F, 7F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[556].setRotationPoint(-38.5F, -12F, -1F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[557].setRotationPoint(-38.5F, -8F, -1F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[558].setRotationPoint(-38.5F, -4F, -1F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[559].setRotationPoint(-28.5F, -5F, 7F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[560].setRotationPoint(-44F, -6F, 6F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 464
		bodyModel[561].setRotationPoint(-44F, -5F, 6F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 464
		bodyModel[562].setRotationPoint(-40.5F, -5F, 6F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 300
		bodyModel[563].setRotationPoint(-28.5F, -6F, 7.5F);

		bodyModel[564].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 38
		bodyModel[564].setRotationPoint(-25.5F, -15F, -5F);

		bodyModel[565].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 128
		bodyModel[565].setRotationPoint(-43F, -3.5F, 3.75F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[566].setRotationPoint(-43F, -6.5F, 3.25F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 4, 4, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2.5F, 0F, -0.5F, -2.5F); // Box 128 cull
		bodyModel[567].setRotationPoint(-43F, -2.5F, 3.25F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[568].setRotationPoint(-27.5F, -16.99F, 2F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[569].setRotationPoint(-32F, -14.99F, 8F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[570].setRotationPoint(-42F, -14.99F, 2F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[571].setRotationPoint(-40.5F, -12F, -5F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[572].setRotationPoint(-40.5F, -8F, -5F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[573].setRotationPoint(-40.5F, -4F, -5F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[574].setRotationPoint(-41.5F, -12F, -5F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[575].setRotationPoint(-41.5F, -8F, -5F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[576].setRotationPoint(-41.5F, -4F, -5F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[577].setRotationPoint(-41.5F, -12F, -4F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[578].setRotationPoint(-41.5F, -8F, -4F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[579].setRotationPoint(-41.5F, -4F, -4F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[580].setRotationPoint(-51.5F, -15F, -0.5F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[581].setRotationPoint(-29.5F, -15F, -8.5F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[582].setRotationPoint(-42.5F, -15F, -8.5F);

		bodyModel[583].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 38
		bodyModel[583].setRotationPoint(-25.5F, -3F, -4F);

		bodyModel[584].addShapeBox(-0.5F, -3.5F, 0F, 1, 4, 14, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Folding seat/bed F
		bodyModel[584].setRotationPoint(-22F, -3.5F, -4F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 462 glow
		bodyModel[585].setRotationPoint(-22.5F, -9F, -3.99F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 462 glow
		bodyModel[586].setRotationPoint(-22.5F, -9F, 9.99F);

		bodyModel[587].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[587].setRotationPoint(-50.5F, -15F, -10F);

		bodyModel[588].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 38
		bodyModel[588].setRotationPoint(-55.5F, -15F, -4F);

		bodyModel[589].addBox(0F, 0F, 0F, 10, 16, 1, 0F); // Box 38
		bodyModel[589].setRotationPoint(-55.5F, -15F, 3F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 2, 16, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[590].setRotationPoint(-49.5F, -15F, -10F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[591].setRotationPoint(-52.5F, -6F, -10F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[592].setRotationPoint(-52.5F, -6F, -9F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[593].setRotationPoint(-51.5F, -6F, -9F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[594].setRotationPoint(-52F, -6F, 8F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 38
		bodyModel[595].setRotationPoint(-54.36F, -2F, -10.28F);
		bodyModel[595].rotateAngleY = 0.78539816F;

		bodyModel[596].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 38
		bodyModel[596].setRotationPoint(-54.53F, -1F, -9.75F);
		bodyModel[596].rotateAngleY = 0.78539816F;

		bodyModel[597].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[597].setRotationPoint(-53.83F, 0.5F, -9.75F);
		bodyModel[597].rotateAngleY = 0.78539816F;

		bodyModel[598].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F); // Box 38
		bodyModel[598].setRotationPoint(-54.72F, -2F, 7.81F);
		bodyModel[598].rotateAngleY = -0.78539816F;

		bodyModel[599].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[599].setRotationPoint(-55.07F, -1F, 8.87F);
		bodyModel[599].rotateAngleY = -0.78539816F;

		bodyModel[600].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[600].setRotationPoint(-55.07F, 0.5F, 8.17F);
		bodyModel[600].rotateAngleY = -0.78539816F;

		bodyModel[601].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 38
		bodyModel[601].setRotationPoint(-52.5F, -8F, -10F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 38
		bodyModel[602].setRotationPoint(-52.5F, -14F, -10F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[603].setRotationPoint(-52F, -8F, 9F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[604].setRotationPoint(-52F, -14F, 9F);

		bodyModel[605].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 38
		bodyModel[605].setRotationPoint(-47.5F, -6F, 4F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[606].setRotationPoint(-49.5F, -3F, 4.5F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -2F, 0F, -0.01F, -2F); // Box 38 cull
		bodyModel[607].setRotationPoint(-49.5F, -2F, 4.5F);

		bodyModel[608].addBox(0F, 0F, 0F, 28, 1, 0, 0F); // Box 38
		bodyModel[608].setRotationPoint(-47.5F, -8F, -9.99F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[609].setRotationPoint(2.95F, 4F, -10F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[610].setRotationPoint(6.95F, 4F, -10F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[611].setRotationPoint(5.95F, 4F, -10F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -1.375F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, -1.375F, -0.5F, -0.25F, -0.375F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.25F, -0.375F, -0.5F); // Box 38
		bodyModel[612].setRotationPoint(1.95F, 3.75F, -10F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[613].setRotationPoint(3.5F, 4.2F, -9.5F);
		bodyModel[613].rotateAngleZ = -0.78539816F;

		bodyModel[614].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[614].setRotationPoint(6.7F, 4.2F, -9.5F);
		bodyModel[614].rotateAngleZ = -0.78539816F;

		bodyModel[615].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[615].setRotationPoint(3F, 3F, -5.49F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[616].setRotationPoint(6.2F, 3F, -5.49F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[617].setRotationPoint(6.2F, 3F, -9.49F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[618].setRotationPoint(3F, 3F, -9.49F);

		bodyModel[619].addBox(0F, 0F, 0F, 6, 3, 5, 0F); // Box 2
		bodyModel[619].setRotationPoint(-11.5F, 3F, -10F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[620].setRotationPoint(-11.5F, 6F, -10F);

		bodyModel[621].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 52
		bodyModel[621].setRotationPoint(-0.5F, 3F, -10F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 18, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[622].setRotationPoint(14.5F, 4F, -2F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[623].setRotationPoint(14.5F, 6.5F, -2F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[624].setRotationPoint(-27.5F, 4F, 0F);
		bodyModel[624].rotateAngleX = -0.78539816F;

		bodyModel[625].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[625].setRotationPoint(-27.51F, 4F, -0.5F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[626].setRotationPoint(-19.49F, 4F, -0.5F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[627].setRotationPoint(18.5F, 3F, -8.9F);
		bodyModel[627].rotateAngleX = -0.78539816F;

		bodyModel[628].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[628].setRotationPoint(18.49F, 3F, -9.4F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[629].setRotationPoint(27.51F, 3F, -9.4F);

		bodyModel[630].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 52
		bodyModel[630].setRotationPoint(15.5F, 3F, -10.5F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[631].setRotationPoint(-19.5F, 3.2F, -10F);
		bodyModel[631].rotateAngleZ = -0.78539816F;

		bodyModel[632].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[632].setRotationPoint(-20F, 3F, -5.99F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[633].setRotationPoint(-20F, 3F, -10.01F);

		bodyModel[634].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 52
		bodyModel[634].setRotationPoint(-28.5F, 3F, -10F);

		bodyModel[635].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 52
		bodyModel[635].setRotationPoint(-21.5F, 3F, 5F);

		bodyModel[636].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 52
		bodyModel[636].setRotationPoint(-10.5F, 3F, 5F);

		bodyModel[637].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 52
		bodyModel[637].setRotationPoint(-12.5F, 3F, 9.5F);

		bodyModel[638].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 52
		bodyModel[638].setRotationPoint(-4.5F, 3F, 9.5F);

		bodyModel[639].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[639].setRotationPoint(1.5F, 3.2F, 6F);
		bodyModel[639].rotateAngleZ = -0.78539816F;

		bodyModel[640].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[640].setRotationPoint(1F, 3F, 10.01F);

		bodyModel[641].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[641].setRotationPoint(1F, 3F, 5.99F);

		bodyModel[642].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[642].setRotationPoint(3.5F, 3F, 9.5F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[643].setRotationPoint(10.5F, 3.2F, 6F);
		bodyModel[643].rotateAngleZ = -0.78539816F;

		bodyModel[644].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[644].setRotationPoint(10F, 3F, 10.01F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[645].setRotationPoint(10F, 3F, 5.99F);

		bodyModel[646].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[646].setRotationPoint(23.5F, 3F, 7.1F);
		bodyModel[646].rotateAngleX = -0.78539816F;

		bodyModel[647].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[647].setRotationPoint(23.49F, 3F, 6.6F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[648].setRotationPoint(27.51F, 3F, 6.6F);

		bodyModel[649].addShapeBox(0.62F, 0F, -4F, 1, 3, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[649].setRotationPoint(60F, -3F, 2F);

		bodyModel[650].addShapeBox(1.38F, 0F, -4F, 0, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -4F, 0F, -3.5F, -4F); // tail sign glow
		bodyModel[650].setRotationPoint(60F, -3F, 2F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 rear MARS light AMTK L
		bodyModel[651].setRotationPoint(59.25F, -19F, -1.85F);

		bodyModel[652].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 rear MARS light AMTK R
		bodyModel[652].setRotationPoint(59.25F, -19F, -0.15F);

		bodyModel[653].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -1F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		bodyModel[653].setRotationPoint(59.5F, -16F, -2F);

		bodyModel[654].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[654].setRotationPoint(59.5F, -16F, 0F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // marker light AMTK glow
		bodyModel[655].setRotationPoint(47.4F, -13.75F, -11.6F);

		bodyModel[656].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 38
		bodyModel[656].setRotationPoint(46.5F, -14F, -11.75F);

		bodyModel[657].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // marker light AMTK glow
		bodyModel[657].setRotationPoint(47.4F, -13.75F, 10.6F);

		bodyModel[658].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F); // Box 659
		bodyModel[658].setRotationPoint(46.5F, -14F, 10.75F);

		bodyModel[659].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 559
		bodyModel[659].setRotationPoint(25F, -5F, -9.5F);

		bodyModel[660].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.51F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -6.51F, 0F, -0.51F, -6.51F, 0F, -0.5F, -6.51F, -4F, 0F, -6.51F, -4F); // Box 529 cull
		bodyModel[660].setRotationPoint(24.5F, -4.5F, -9.5F);

		bodyModel[661].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,-0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, -0.01F, -6.51F, 0F, -0.5F, -6.51F, 0F, -0.5F, -6.51F, -4F, 0F, -6.51F, -4F); // Box 529 cull
		bodyModel[661].setRotationPoint(29F, -4.5F, -9.5F);

		bodyModel[662].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 558
		bodyModel[662].setRotationPoint(25F, -3F, -8.5F);

		bodyModel[663].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[663].setRotationPoint(47.5F, -2.5F, -1.5F);

		bodyModel[664].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[664].setRotationPoint(47.5F, -2.5F, 0.5F);

		bodyModel[665].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[665].setRotationPoint(42F, -2.5F, -1.5F);

		bodyModel[666].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[666].setRotationPoint(42F, -2.5F, 0.5F);

		bodyModel[667].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[667].setRotationPoint(36.5F, -2.5F, -1.5F);

		bodyModel[668].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[668].setRotationPoint(36.5F, -2.5F, 0.5F);

		bodyModel[669].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[669].setRotationPoint(25F, -2.5F, -9.5F);

		bodyModel[670].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 559
		bodyModel[670].setRotationPoint(36F, -5F, -4.75F);

		bodyModel[671].addShapeBox(0F, 0F, 0F, 8, 12, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, -0.01F, 0F, -6.51F, -0.5F, -4F, -6.51F, -0.5F, -4F, -6.51F, 0F, 0F, -6.51F, -0.01F); // Box 529 cull
		bodyModel[671].setRotationPoint(36F, -4.5F, -5.75F);

		bodyModel[672].addShapeBox(0F, 0F, 0F, 8, 12, 1, 0F,0F, 0F, -0.51F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -6.51F, -0.51F, -4F, -6.51F, -0.5F, -4F, -6.51F, 0F, 0F, -6.51F, 0F); // Box 529 cull
		bodyModel[672].setRotationPoint(36F, -4.5F, -1.25F);

		bodyModel[673].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F); // Box 558
		bodyModel[673].setRotationPoint(37F, -3F, -4.75F);

		bodyModel[674].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[674].setRotationPoint(36F, -2.5F, -4.75F);

		bodyModel[675].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 559
		bodyModel[675].setRotationPoint(50F, -5F, -4.75F);

		bodyModel[676].addShapeBox(0F, 0F, 0F, 8, 12, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.01F, 0F, 0F, 0F, 0F, -6.51F, -0.5F, -4F, -6.51F, -0.5F, -4F, -6.51F, -0.01F, 0F, -6.51F, 0F); // Box 529 cull
		bodyModel[676].setRotationPoint(47F, -4.5F, -5.75F);

		bodyModel[677].addShapeBox(0F, 0F, 0F, 8, 12, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.51F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -6.51F, -0.5F, -4F, -6.51F, -0.51F, -4F, -6.51F, 0F, 0F, -6.51F, 0F); // Box 529 cull
		bodyModel[677].setRotationPoint(47F, -4.5F, -1.25F);

		bodyModel[678].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F); // Box 558
		bodyModel[678].setRotationPoint(46F, -3F, -4.75F);

		bodyModel[679].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[679].setRotationPoint(50F, -2.5F, -4.75F);

		bodyModel[680].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 559
		bodyModel[680].setRotationPoint(25F, -5F, 8.5F);

		bodyModel[681].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.51F, 0F, -4F, 0F, 0F, -4F, 0F, -6.51F, 0F, -0.5F, -6.51F, 0F, -0.51F, -6.51F, -4F, 0F, -6.51F, -4F); // Box 529 cull
		bodyModel[681].setRotationPoint(24.5F, -4.5F, 5.5F);

		bodyModel[682].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, -0.01F, 0F, -4F, 0F, -6.51F, 0F, -0.5F, -6.51F, 0F, -0.5F, -6.51F, -4F, -0.01F, -6.51F, -4F); // Box 529 cull
		bodyModel[682].setRotationPoint(29F, -4.5F, 5.5F);

		bodyModel[683].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 558
		bodyModel[683].setRotationPoint(25F, -3F, 4.5F);

		bodyModel[684].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[684].setRotationPoint(25F, -2.5F, 8.5F);

		bodyModel[685].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 754
		bodyModel[685].setRotationPoint(28.38F, -5F, 0F);
		bodyModel[685].rotateAngleY = -0.78539816F;

		bodyModel[686].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[686].setRotationPoint(30.5F, -4F, 0F);
		bodyModel[686].rotateAngleY = -0.78539816F;

		bodyModel[687].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 754
		bodyModel[687].setRotationPoint(41.38F, -5F, 0F);
		bodyModel[687].rotateAngleY = -0.78539816F;

		bodyModel[688].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[688].setRotationPoint(43.5F, -4F, 0F);
		bodyModel[688].rotateAngleY = -0.78539816F;

		bodyModel[689].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 559
		bodyModel[689].setRotationPoint(36F, -5F, 0.75F);

		bodyModel[690].addShapeBox(0F, 0F, 0F, 8, 12, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, -0.01F, 0F, -6.51F, -0.5F, -4F, -6.51F, -0.5F, -4F, -6.51F, 0F, 0F, -6.51F, -0.01F); // Box 529 cull
		bodyModel[690].setRotationPoint(36F, -4.5F, -0.25F);

		bodyModel[691].addShapeBox(0F, 0F, 0F, 8, 12, 1, 0F,0F, 0F, -0.51F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -6.51F, -0.51F, -4F, -6.51F, -0.5F, -4F, -6.51F, 0F, 0F, -6.51F, 0F); // Box 529 cull
		bodyModel[691].setRotationPoint(36F, -4.5F, 4.25F);

		bodyModel[692].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F); // Box 558
		bodyModel[692].setRotationPoint(37F, -3F, 0.75F);

		bodyModel[693].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[693].setRotationPoint(36F, -2.5F, 0.75F);

		bodyModel[694].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 559
		bodyModel[694].setRotationPoint(50F, -5F, 0.75F);

		bodyModel[695].addShapeBox(0F, 0F, 0F, 8, 12, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.51F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -6.51F, -0.5F, -4F, -6.51F, -0.51F, -4F, -6.51F, 0F, 0F, -6.51F, 0F); // Box 529 cull
		bodyModel[695].setRotationPoint(47F, -4.5F, 4.25F);

		bodyModel[696].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F); // Box 558
		bodyModel[696].setRotationPoint(46F, -3F, 0.75F);

		bodyModel[697].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[697].setRotationPoint(50F, -2.5F, 0.75F);

		bodyModel[698].addShapeBox(0F, 0F, 0F, 8, 12, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.01F, 0F, 0F, 0F, 0F, -6.51F, -0.5F, -4F, -6.51F, -0.5F, -4F, -6.51F, -0.01F, 0F, -6.51F, 0F); // Box 529 cull
		bodyModel[698].setRotationPoint(47F, -4.5F, -0.25F);

		bodyModel[699].addShapeBox(0.62F, 0F, -4F, 1, 1, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[699].setRotationPoint(60F, 0F, 2F);

		bodyModel[700].addShapeBox(0.01F, 0F, -4F, 0, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[700].setRotationPoint(60F, -6F, 2F);

		bodyModel[701].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 2
		bodyModel[701].setRotationPoint(60.5F, 2F, -2F);

		bodyModel[702].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 240
		bodyModel[702].setRotationPoint(60.5F, 2F, 0F);

		bodyModel[703].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 2
		bodyModel[703].setRotationPoint(59.5F, 2F, -4F);

		bodyModel[704].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 242
		bodyModel[704].setRotationPoint(59.5F, 2F, 2F);

		bodyModel[705].addShapeBox(0F, 0F, 0F, 7, 0, 4, 0F,0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[705].setRotationPoint(-28.5F, -13.5F, 8F);

		bodyModel[706].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 38
		bodyModel[706].setRotationPoint(-22.5F, -17F, -8F);

		bodyModel[707].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[707].setRotationPoint(-22.5F, -17F, 8F);

		bodyModel[708].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 38
		bodyModel[708].setRotationPoint(-28.5F, -17F, -8F);

		bodyModel[709].addShapeBox(-0.5F, -3.5F, 0F, 1, 6, 14, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[709].setRotationPoint(-22F, -11.5F, -4F);

		bodyModel[710].addBox(0F, 0F, 0F, 3, 10, 0, 0F); // Box 38
		bodyModel[710].setRotationPoint(-25.5F, -13F, -4F);

		bodyModel[711].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 38
		bodyModel[711].setRotationPoint(-25.5F, -1F, -4F);

		bodyModel[712].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F); // Box 38
		bodyModel[712].setRotationPoint(-23.5F, -13F, -5F);

		bodyModel[713].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 38
		bodyModel[713].setRotationPoint(-22.5F, -9F, -4F);

		bodyModel[714].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[714].setRotationPoint(-33.5F, -10.99F, 5.5F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 715; i++)
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