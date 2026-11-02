//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: sd70m
// Model Creator: bidahochi
// Created on: 15.02.2025 - 14:06:03
// Last changed on: 15.02.2025 - 14:06:03

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelAlcoPATruck_new;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.library.Info;

public class Model0_6_6_0_1000_2B_DE extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Model0_6_6_0_1000_2B_DE() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[657];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 211, 164, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 226, 16, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 224, 22, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 224, 8, textureX, textureY); // Box 88
		bodyModel[4] = new ModelRendererTurbo(this, 228, 4, textureX, textureY); // Box 336
		bodyModel[5] = new ModelRendererTurbo(this, 228, 30, textureX, textureY); // Box 579
		bodyModel[6] = new ModelRendererTurbo(this, 213, 63, textureX, textureY); // Box 62
		bodyModel[7] = new ModelRendererTurbo(this, 359, 56, textureX, textureY); // Box 348
		bodyModel[8] = new ModelRendererTurbo(this, 359, 70, textureX, textureY); // Rear side door R
		bodyModel[9] = new ModelRendererTurbo(this, 375, 63, textureX, textureY); // Box 62
		bodyModel[10] = new ModelRendererTurbo(this, 354, 64, textureX, textureY); // Box 348
		bodyModel[11] = new ModelRendererTurbo(this, 368, 64, textureX, textureY); // Box 348
		bodyModel[12] = new ModelRendererTurbo(this, 354, 67, textureX, textureY); // Rear side door R
		bodyModel[13] = new ModelRendererTurbo(this, 368, 67, textureX, textureY); // Rear side door R
		bodyModel[14] = new ModelRendererTurbo(this, 361, 67, textureX, textureY); // Rear side door R
		bodyModel[15] = new ModelRendererTurbo(this, 229, 1, textureX, textureY); // Box 336
		bodyModel[16] = new ModelRendererTurbo(this, 213, 117, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 359, 110, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 359, 124, textureX, textureY); // Rear side door L
		bodyModel[19] = new ModelRendererTurbo(this, 375, 117, textureX, textureY); // Box 30
		bodyModel[20] = new ModelRendererTurbo(this, 354, 118, textureX, textureY); // Box 32
		bodyModel[21] = new ModelRendererTurbo(this, 368, 118, textureX, textureY); // Box 33
		bodyModel[22] = new ModelRendererTurbo(this, 354, 121, textureX, textureY); // Rear side door L
		bodyModel[23] = new ModelRendererTurbo(this, 229, 34, textureX, textureY); // Box 38
		bodyModel[24] = new ModelRendererTurbo(this, 368, 121, textureX, textureY); // Rear side door L
		bodyModel[25] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Rear side door L
		bodyModel[26] = new ModelRendererTurbo(this, 230, 93, textureX, textureY); // Box 348
		bodyModel[27] = new ModelRendererTurbo(this, 239, 93, textureX, textureY); // Box 348
		bodyModel[28] = new ModelRendererTurbo(this, 212, 93, textureX, textureY); // Box 348
		bodyModel[29] = new ModelRendererTurbo(this, 221, 93, textureX, textureY); // Box 348
		bodyModel[30] = new ModelRendererTurbo(this, 440, 84, textureX, textureY); // Box 348
		bodyModel[31] = new ModelRendererTurbo(this, 440, 90, textureX, textureY); // Box 348
		bodyModel[32] = new ModelRendererTurbo(this, 431, 84, textureX, textureY); // Box 348
		bodyModel[33] = new ModelRendererTurbo(this, 431, 90, textureX, textureY); // Box 348
		bodyModel[34] = new ModelRendererTurbo(this, 149, 99, textureX, textureY, "cull"); // Box 348 cull
		bodyModel[35] = new ModelRendererTurbo(this, 362, 100, textureX, textureY, "cull"); // Box 348 cull
		bodyModel[36] = new ModelRendererTurbo(this, 230, 147, textureX, textureY); // Box 55
		bodyModel[37] = new ModelRendererTurbo(this, 239, 147, textureX, textureY); // Box 56
		bodyModel[38] = new ModelRendererTurbo(this, 212, 147, textureX, textureY); // Box 57
		bodyModel[39] = new ModelRendererTurbo(this, 221, 147, textureX, textureY); // Box 58
		bodyModel[40] = new ModelRendererTurbo(this, 440, 138, textureX, textureY); // Box 59
		bodyModel[41] = new ModelRendererTurbo(this, 440, 144, textureX, textureY); // Box 60
		bodyModel[42] = new ModelRendererTurbo(this, 431, 138, textureX, textureY); // Box 61
		bodyModel[43] = new ModelRendererTurbo(this, 431, 144, textureX, textureY); // Box 62
		bodyModel[44] = new ModelRendererTurbo(this, 149, 153, textureX, textureY, "cull"); // Box 63 cull
		bodyModel[45] = new ModelRendererTurbo(this, 362, 154, textureX, textureY, "cull"); // Box 64 cull
		bodyModel[46] = new ModelRendererTurbo(this, 37, 86, textureX, textureY); // Box 108
		bodyModel[47] = new ModelRendererTurbo(this, 27, 86, textureX, textureY); // Box 109
		bodyModel[48] = new ModelRendererTurbo(this, 260, 91, textureX, textureY); // Box 0
		bodyModel[49] = new ModelRendererTurbo(this, 248, 91, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 37, 140, textureX, textureY); // Box 69
		bodyModel[51] = new ModelRendererTurbo(this, 27, 140, textureX, textureY); // Box 70
		bodyModel[52] = new ModelRendererTurbo(this, 260, 145, textureX, textureY); // Box 71
		bodyModel[53] = new ModelRendererTurbo(this, 248, 145, textureX, textureY); // Box 72
		bodyModel[54] = new ModelRendererTurbo(this, 463, 44, textureX, textureY); // Box 0
		bodyModel[55] = new ModelRendererTurbo(this, 482, 48, textureX, textureY); // Rear door
		bodyModel[56] = new ModelRendererTurbo(this, 493, 44, textureX, textureY); // Box 0
		bodyModel[57] = new ModelRendererTurbo(this, 469, 19, textureX, textureY); // Box 0
		bodyModel[58] = new ModelRendererTurbo(this, 460, 67, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 462, 79, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 469, 79, textureX, textureY); // Box 99
		bodyModel[61] = new ModelRendererTurbo(this, 487, 82, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 480, 82, textureX, textureY); // Box 128
		bodyModel[63] = new ModelRendererTurbo(this, 494, 82, textureX, textureY); // Box 128
		bodyModel[64] = new ModelRendererTurbo(this, 473, 82, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 489, 70, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 476, 69, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 477, 100, textureX, textureY); // Box 99
		bodyModel[68] = new ModelRendererTurbo(this, 466, 98, textureX, textureY); // Box 99
		bodyModel[69] = new ModelRendererTurbo(this, 497, 98, textureX, textureY); // Box 94
		bodyModel[70] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 0
		bodyModel[71] = new ModelRendererTurbo(this, 474, 13, textureX, textureY); // Box 0
		bodyModel[72] = new ModelRendererTurbo(this, 484, 13, textureX, textureY); // Box 80
		bodyModel[73] = new ModelRendererTurbo(this, 470, 1, textureX, textureY); // Box 0
		bodyModel[74] = new ModelRendererTurbo(this, 461, 1, textureX, textureY); // Box 0
		bodyModel[75] = new ModelRendererTurbo(this, 484, 1, textureX, textureY); // Box 103
		bodyModel[76] = new ModelRendererTurbo(this, 466, 88, textureX, textureY,"backlight_1"); // backing light type 1
		bodyModel[77] = new ModelRendererTurbo(this, 459, 88, textureX, textureY,"backlight_3"); // backing light type 3
		bodyModel[78] = new ModelRendererTurbo(this, 463, 83, textureX, textureY,"backlight_2"); // backing light type 1
		bodyModel[79] = new ModelRendererTurbo(this, 494, 200, textureX, textureY); // Box 2
		bodyModel[80] = new ModelRendererTurbo(this, 495, 206, textureX, textureY); // Box 2
		bodyModel[81] = new ModelRendererTurbo(this, 272, 190, textureX, textureY); // Box 0
		bodyModel[82] = new ModelRendererTurbo(this, 474, 208, textureX, textureY); // Box 2
		bodyModel[83] = new ModelRendererTurbo(this, 490, 100, textureX, textureY); // Box 108
		bodyModel[84] = new ModelRendererTurbo(this, 385, 219, textureX, textureY); // Box 2
		bodyModel[85] = new ModelRendererTurbo(this, 461, 208, textureX, textureY); // Box 2
		bodyModel[86] = new ModelRendererTurbo(this, 479, 200, textureX, textureY); // Box 2
		bodyModel[87] = new ModelRendererTurbo(this, 339, 214, textureX, textureY); // Box 2
		bodyModel[88] = new ModelRendererTurbo(this, 359, 221, textureX, textureY); // Box 2
		bodyModel[89] = new ModelRendererTurbo(this, 359, 213, textureX, textureY); // Box 2
		bodyModel[90] = new ModelRendererTurbo(this, 343, 203, textureX, textureY); // Box 2
		bodyModel[91] = new ModelRendererTurbo(this, 433, 206, textureX, textureY); // Box 2
		bodyModel[92] = new ModelRendererTurbo(this, 368, 201, textureX, textureY); // Box 2
		bodyModel[93] = new ModelRendererTurbo(this, 460, 214, textureX, textureY); // Box 0
		bodyModel[94] = new ModelRendererTurbo(this, 460, 200, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 384, 225, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 384, 211, textureX, textureY); // Box 0
		bodyModel[97] = new ModelRendererTurbo(this, 408, 211, textureX, textureY, "cull"); // Box 120 cull
		bodyModel[98] = new ModelRendererTurbo(this, 435, 216, textureX, textureY, "cull"); // Box 120 cull
		bodyModel[99] = new ModelRendererTurbo(this, 30, 149, textureX, textureY); // Box 120
		bodyModel[100] = new ModelRendererTurbo(this, 30, 95, textureX, textureY); // Box 481
		bodyModel[101] = new ModelRendererTurbo(this, 251, 153, textureX, textureY); // Box 120
		bodyModel[102] = new ModelRendererTurbo(this, 251, 99, textureX, textureY); // Box 481
		bodyModel[103] = new ModelRendererTurbo(this, 302, 46, textureX, textureY); // Box 0
		bodyModel[104] = new ModelRendererTurbo(this, 327, 46, textureX, textureY); // Box 0
		bodyModel[105] = new ModelRendererTurbo(this, 409, 46, textureX, textureY); // Box 0
		bodyModel[106] = new ModelRendererTurbo(this, 434, 46, textureX, textureY); // Box 0
		bodyModel[107] = new ModelRendererTurbo(this, 245, 48, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 352, 48, textureX, textureY); // Box 0
		bodyModel[109] = new ModelRendererTurbo(this, 202, 187, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 193, 191, textureX, textureY); // Box 0
		bodyModel[111] = new ModelRendererTurbo(this, 66, 243, textureX, textureY); // Box 348
		bodyModel[112] = new ModelRendererTurbo(this, 66, 227, textureX, textureY); // Box 177
		bodyModel[113] = new ModelRendererTurbo(this, 85, 217, textureX, textureY); // Box 177
		bodyModel[114] = new ModelRendererTurbo(this, 69, 184, textureX, textureY); // Box 177
		bodyModel[115] = new ModelRendererTurbo(this, 29, 174, textureX, textureY); // Box 177
		bodyModel[116] = new ModelRendererTurbo(this, 85, 210, textureX, textureY); // Box 181
		bodyModel[117] = new ModelRendererTurbo(this, 66, 253, textureX, textureY); // Box 348
		bodyModel[118] = new ModelRendererTurbo(this, 66, 237, textureX, textureY); // Box 183
		bodyModel[119] = new ModelRendererTurbo(this, 68, 240, textureX, textureY); // Box 348
		bodyModel[120] = new ModelRendererTurbo(this, 66, 214, textureX, textureY); // Box 177
		bodyModel[121] = new ModelRendererTurbo(this, 110, 213, textureX, textureY); // Box 177
		bodyModel[122] = new ModelRendererTurbo(this, 65, 215, textureX, textureY); // Box 348
		bodyModel[123] = new ModelRendererTurbo(this, 125, 214, textureX, textureY); // Box 348
		bodyModel[124] = new ModelRendererTurbo(this, 68, 224, textureX, textureY); // Box 189
		bodyModel[125] = new ModelRendererTurbo(this, 70, 204, textureX, textureY); // Box 190
		bodyModel[126] = new ModelRendererTurbo(this, 110, 203, textureX, textureY); // Box 191
		bodyModel[127] = new ModelRendererTurbo(this, 69, 205, textureX, textureY); // Box 192
		bodyModel[128] = new ModelRendererTurbo(this, 125, 204, textureX, textureY); // Box 193
		bodyModel[129] = new ModelRendererTurbo(this, 386, 365, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 391, 377, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 393, 358, textureX, textureY); // Box 394
		bodyModel[132] = new ModelRendererTurbo(this, 432, 358, textureX, textureY); // Box 394
		bodyModel[133] = new ModelRendererTurbo(this, 381, 341, textureX, textureY); // Box 0
		bodyModel[134] = new ModelRendererTurbo(this, 389, 327, textureX, textureY); // Box 0
		bodyModel[135] = new ModelRendererTurbo(this, 455, 346, textureX, textureY); // Box 0
		bodyModel[136] = new ModelRendererTurbo(this, 472, 346, textureX, textureY); // Box 0
		bodyModel[137] = new ModelRendererTurbo(this, 489, 346, textureX, textureY); // Box 0
		bodyModel[138] = new ModelRendererTurbo(this, 506, 346, textureX, textureY); // Box 0
		bodyModel[139] = new ModelRendererTurbo(this, 455, 355, textureX, textureY); // Box 0
		bodyModel[140] = new ModelRendererTurbo(this, 473, 355, textureX, textureY); // Box 0
		bodyModel[141] = new ModelRendererTurbo(this, 489, 355, textureX, textureY); // Box 0
		bodyModel[142] = new ModelRendererTurbo(this, 506, 355, textureX, textureY); // Box 0
		bodyModel[143] = new ModelRendererTurbo(this, 444, 346, textureX, textureY); // Box 0
		bodyModel[144] = new ModelRendererTurbo(this, 461, 346, textureX, textureY); // Box 0
		bodyModel[145] = new ModelRendererTurbo(this, 386, 335, textureX, textureY); // Box 0
		bodyModel[146] = new ModelRendererTurbo(this, 478, 346, textureX, textureY); // Box 0
		bodyModel[147] = new ModelRendererTurbo(this, 495, 346, textureX, textureY); // Box 0
		bodyModel[148] = new ModelRendererTurbo(this, 444, 355, textureX, textureY); // Box 0
		bodyModel[149] = new ModelRendererTurbo(this, 461, 355, textureX, textureY); // Box 0
		bodyModel[150] = new ModelRendererTurbo(this, 478, 355, textureX, textureY); // Box 0
		bodyModel[151] = new ModelRendererTurbo(this, 495, 355, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 353, 348, textureX, textureY); // Box 0
		bodyModel[153] = new ModelRendererTurbo(this, 353, 331, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 376, 338, textureX, textureY); // Box 0
		bodyModel[155] = new ModelRendererTurbo(this, 364, 321, textureX, textureY); // Box 0
		bodyModel[156] = new ModelRendererTurbo(this, 337, 373, textureX, textureY); // Box 0
		bodyModel[157] = new ModelRendererTurbo(this, 344, 366, textureX, textureY); // Box 0
		bodyModel[158] = new ModelRendererTurbo(this, 344, 372, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 328, 372, textureX, textureY); // Box 471
		bodyModel[160] = new ModelRendererTurbo(this, 344, 359, textureX, textureY); // Box 0
		bodyModel[161] = new ModelRendererTurbo(this, 331, 361, textureX, textureY); // Box 0
		bodyModel[162] = new ModelRendererTurbo(this, 324, 359, textureX, textureY); // Box 0
		bodyModel[163] = new ModelRendererTurbo(this, 324, 364, textureX, textureY); // Box 0
		bodyModel[164] = new ModelRendererTurbo(this, 331, 353, textureX, textureY); // Box 0
		bodyModel[165] = new ModelRendererTurbo(this, 353, 365, textureX, textureY); // Box 0
		bodyModel[166] = new ModelRendererTurbo(this, 96, 194, textureX, textureY); // Box 177
		bodyModel[167] = new ModelRendererTurbo(this, 96, 198, textureX, textureY); // Box 232
		bodyModel[168] = new ModelRendererTurbo(this, 117, 231, textureX, textureY); // Box 177
		bodyModel[169] = new ModelRendererTurbo(this, 119, 213, textureX, textureY); // Box 177
		bodyModel[170] = new ModelRendererTurbo(this, 131, 199, textureX, textureY); // Box 177
		bodyModel[171] = new ModelRendererTurbo(this, 129, 205, textureX, textureY); // Box 177
		bodyModel[172] = new ModelRendererTurbo(this, 129, 191, textureX, textureY); // Box 237
		bodyModel[173] = new ModelRendererTurbo(this, 457, 304, textureX, textureY); // Box 348
		bodyModel[174] = new ModelRendererTurbo(this, 410, 243, textureX, textureY); // Box 177
		bodyModel[175] = new ModelRendererTurbo(this, 484, 264, textureX, textureY); // Box 177
		bodyModel[176] = new ModelRendererTurbo(this, 469, 273, textureX, textureY); // Box 177
		bodyModel[177] = new ModelRendererTurbo(this, 457, 253, textureX, textureY); // Box 177
		bodyModel[178] = new ModelRendererTurbo(this, 484, 257, textureX, textureY); // Box 181
		bodyModel[179] = new ModelRendererTurbo(this, 457, 314, textureX, textureY); // Box 348
		bodyModel[180] = new ModelRendererTurbo(this, 459, 301, textureX, textureY); // Box 348
		bodyModel[181] = new ModelRendererTurbo(this, 473, 317, textureX, textureY); // Box 177
		bodyModel[182] = new ModelRendererTurbo(this, 492, 317, textureX, textureY); // Box 177
		bodyModel[183] = new ModelRendererTurbo(this, 454, 301, textureX, textureY); // Box 348
		bodyModel[184] = new ModelRendererTurbo(this, 506, 301, textureX, textureY); // Box 348
		bodyModel[185] = new ModelRendererTurbo(this, 412, 240, textureX, textureY); // Box 189
		bodyModel[186] = new ModelRendererTurbo(this, 391, 243, textureX, textureY); // Box 190
		bodyModel[187] = new ModelRendererTurbo(this, 461, 243, textureX, textureY); // Box 191
		bodyModel[188] = new ModelRendererTurbo(this, 407, 240, textureX, textureY); // Box 192
		bodyModel[189] = new ModelRendererTurbo(this, 459, 240, textureX, textureY); // Box 193
		bodyModel[190] = new ModelRendererTurbo(this, 419, 278, textureX, textureY); // Box 177
		bodyModel[191] = new ModelRendererTurbo(this, 419, 300, textureX, textureY); // Box 232
		bodyModel[192] = new ModelRendererTurbo(this, 403, 304, textureX, textureY); // Box 177
		bodyModel[193] = new ModelRendererTurbo(this, 405, 282, textureX, textureY); // Box 177
		bodyModel[194] = new ModelRendererTurbo(this, 417, 264, textureX, textureY); // Box 177
		bodyModel[195] = new ModelRendererTurbo(this, 415, 270, textureX, textureY); // Box 177
		bodyModel[196] = new ModelRendererTurbo(this, 415, 256, textureX, textureY); // Box 237
		bodyModel[197] = new ModelRendererTurbo(this, 410, 253, textureX, textureY); // Box 183
		bodyModel[198] = new ModelRendererTurbo(this, 471, 332, textureX, textureY); // Box 394
		bodyModel[199] = new ModelRendererTurbo(this, 497, 337, textureX, textureY); // Box 394
		bodyModel[200] = new ModelRendererTurbo(this, 471, 327, textureX, textureY); // Box 394
		bodyModel[201] = new ModelRendererTurbo(this, 371, 42, textureX, textureY); // Box 0
		bodyModel[202] = new ModelRendererTurbo(this, 366, 42, textureX, textureY); // Box 0
		bodyModel[203] = new ModelRendererTurbo(this, 361, 42, textureX, textureY); // Box 0
		bodyModel[204] = new ModelRendererTurbo(this, 356, 42, textureX, textureY); // Box 0
		bodyModel[205] = new ModelRendererTurbo(this, 224, 293, textureX, textureY); // Box 270
		bodyModel[206] = new ModelRendererTurbo(this, 229, 286, textureX, textureY); // Box 271
		bodyModel[207] = new ModelRendererTurbo(this, 231, 305, textureX, textureY); // Box 272
		bodyModel[208] = new ModelRendererTurbo(this, 222, 305, textureX, textureY); // Box 273
		bodyModel[209] = new ModelRendererTurbo(this, 219, 269, textureX, textureY); // Box 274
		bodyModel[210] = new ModelRendererTurbo(this, 227, 255, textureX, textureY); // Box 275
		bodyModel[211] = new ModelRendererTurbo(this, 289, 287, textureX, textureY); // Box 276
		bodyModel[212] = new ModelRendererTurbo(this, 306, 287, textureX, textureY); // Box 277
		bodyModel[213] = new ModelRendererTurbo(this, 323, 287, textureX, textureY); // Box 278
		bodyModel[214] = new ModelRendererTurbo(this, 340, 287, textureX, textureY); // Box 279
		bodyModel[215] = new ModelRendererTurbo(this, 289, 296, textureX, textureY); // Box 280
		bodyModel[216] = new ModelRendererTurbo(this, 306, 296, textureX, textureY); // Box 281
		bodyModel[217] = new ModelRendererTurbo(this, 323, 296, textureX, textureY); // Box 282
		bodyModel[218] = new ModelRendererTurbo(this, 340, 296, textureX, textureY); // Box 283
		bodyModel[219] = new ModelRendererTurbo(this, 278, 287, textureX, textureY); // Box 284
		bodyModel[220] = new ModelRendererTurbo(this, 295, 287, textureX, textureY); // Box 285
		bodyModel[221] = new ModelRendererTurbo(this, 224, 263, textureX, textureY); // Box 286
		bodyModel[222] = new ModelRendererTurbo(this, 312, 287, textureX, textureY); // Box 287
		bodyModel[223] = new ModelRendererTurbo(this, 329, 287, textureX, textureY); // Box 288
		bodyModel[224] = new ModelRendererTurbo(this, 278, 296, textureX, textureY); // Box 289
		bodyModel[225] = new ModelRendererTurbo(this, 295, 296, textureX, textureY); // Box 290
		bodyModel[226] = new ModelRendererTurbo(this, 312, 296, textureX, textureY); // Box 291
		bodyModel[227] = new ModelRendererTurbo(this, 329, 296, textureX, textureY); // Box 292
		bodyModel[228] = new ModelRendererTurbo(this, 346, 275, textureX, textureY); // Box 293
		bodyModel[229] = new ModelRendererTurbo(this, 346, 253, textureX, textureY); // Box 294
		bodyModel[230] = new ModelRendererTurbo(this, 369, 255, textureX, textureY); // Box 295
		bodyModel[231] = new ModelRendererTurbo(this, 390, 298, textureX, textureY); // Box 296
		bodyModel[232] = new ModelRendererTurbo(this, 381, 291, textureX, textureY); // Box 297
		bodyModel[233] = new ModelRendererTurbo(this, 381, 297, textureX, textureY); // Box 298
		bodyModel[234] = new ModelRendererTurbo(this, 397, 297, textureX, textureY); // Box 299
		bodyModel[235] = new ModelRendererTurbo(this, 381, 284, textureX, textureY); // Box 300
		bodyModel[236] = new ModelRendererTurbo(this, 390, 286, textureX, textureY); // Box 301
		bodyModel[237] = new ModelRendererTurbo(this, 403, 284, textureX, textureY); // Box 302
		bodyModel[238] = new ModelRendererTurbo(this, 403, 289, textureX, textureY); // Box 303
		bodyModel[239] = new ModelRendererTurbo(this, 390, 278, textureX, textureY); // Box 304
		bodyModel[240] = new ModelRendererTurbo(this, 346, 292, textureX, textureY); // Box 305
		bodyModel[241] = new ModelRendererTurbo(this, 282, 273, textureX, textureY); // Box 306
		bodyModel[242] = new ModelRendererTurbo(this, 282, 278, textureX, textureY); // Box 307
		bodyModel[243] = new ModelRendererTurbo(this, 282, 268, textureX, textureY); // Box 308
		bodyModel[244] = new ModelRendererTurbo(this, 293, 43, textureX, textureY); // Box 0
		bodyModel[245] = new ModelRendererTurbo(this, 288, 43, textureX, textureY); // Box 0
		bodyModel[246] = new ModelRendererTurbo(this, 283, 43, textureX, textureY); // Box 0
		bodyModel[247] = new ModelRendererTurbo(this, 278, 43, textureX, textureY); // Box 0
		bodyModel[248] = new ModelRendererTurbo(this, 275, 256, textureX, textureY); // Box 0
		bodyModel[249] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Box 0
		bodyModel[250] = new ModelRendererTurbo(this, 292, 256, textureX, textureY); // Box 0
		bodyModel[251] = new ModelRendererTurbo(this, 298, 265, textureX, textureY); // Box 0
		bodyModel[252] = new ModelRendererTurbo(this, 309, 256, textureX, textureY); // Box 0
		bodyModel[253] = new ModelRendererTurbo(this, 315, 265, textureX, textureY); // Box 0
		bodyModel[254] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 0
		bodyModel[255] = new ModelRendererTurbo(this, 332, 265, textureX, textureY); // Box 0
		bodyModel[256] = new ModelRendererTurbo(this, 75, 287, textureX, textureY); // Box 0
		bodyModel[257] = new ModelRendererTurbo(this, 113, 276, textureX, textureY); // Box 0
		bodyModel[258] = new ModelRendererTurbo(this, 57, 274, textureX, textureY); // Box 0
		bodyModel[259] = new ModelRendererTurbo(this, 70, 293, textureX, textureY); // Box 0
		bodyModel[260] = new ModelRendererTurbo(this, 68, 282, textureX, textureY); // Box 0
		bodyModel[261] = new ModelRendererTurbo(this, 70, 268, textureX, textureY); // Box 396
		bodyModel[262] = new ModelRendererTurbo(this, 68, 257, textureX, textureY); // Box 389
		bodyModel[263] = new ModelRendererTurbo(this, 107, 282, textureX, textureY); // Box 0
		bodyModel[264] = new ModelRendererTurbo(this, 120, 282, textureX, textureY); // Box 146
		bodyModel[265] = new ModelRendererTurbo(this, 108, 282, textureX, textureY); // Box 341
		bodyModel[266] = new ModelRendererTurbo(this, 150, 306, textureX, textureY); // Box 0
		bodyModel[267] = new ModelRendererTurbo(this, 150, 301, textureX, textureY); // Box 0
		bodyModel[268] = new ModelRendererTurbo(this, 127, 292, textureX, textureY); // Box 0
		bodyModel[269] = new ModelRendererTurbo(this, 127, 273, textureX, textureY); // Box 0
		bodyModel[270] = new ModelRendererTurbo(this, 150, 278, textureX, textureY); // Box 152
		bodyModel[271] = new ModelRendererTurbo(this, 150, 273, textureX, textureY); // Box 153
		bodyModel[272] = new ModelRendererTurbo(this, 150, 297, textureX, textureY); // Box 0
		bodyModel[273] = new ModelRendererTurbo(this, 150, 292, textureX, textureY); // Box 0
		bodyModel[274] = new ModelRendererTurbo(this, 150, 287, textureX, textureY); // Box 335
		bodyModel[275] = new ModelRendererTurbo(this, 150, 282, textureX, textureY); // Box 336
		bodyModel[276] = new ModelRendererTurbo(this, 32, 227, textureX, textureY); // Box 0
		bodyModel[277] = new ModelRendererTurbo(this, 34, 220, textureX, textureY); // Box 0
		bodyModel[278] = new ModelRendererTurbo(this, 35, 224, textureX, textureY); // Box 0
		bodyModel[279] = new ModelRendererTurbo(this, 35, 217, textureX, textureY); // Box 757
		bodyModel[280] = new ModelRendererTurbo(this, 34, 204, textureX, textureY); // Box 0
		bodyModel[281] = new ModelRendererTurbo(this, 25, 204, textureX, textureY); // Box 0
		bodyModel[282] = new ModelRendererTurbo(this, 43, 204, textureX, textureY); // Box 0
		bodyModel[283] = new ModelRendererTurbo(this, 39, 213, textureX, textureY); // Box 0
		bodyModel[284] = new ModelRendererTurbo(this, 26, 195, textureX, textureY); // Box 0
		bodyModel[285] = new ModelRendererTurbo(this, 53, 224, textureX, textureY); // Box 394
		bodyModel[286] = new ModelRendererTurbo(this, 53, 217, textureX, textureY); // Box 394
		bodyModel[287] = new ModelRendererTurbo(this, 21, 229, textureX, textureY); // Box 0
		bodyModel[288] = new ModelRendererTurbo(this, 53, 195, textureX, textureY); // Box 394
		bodyModel[289] = new ModelRendererTurbo(this, 53, 217, textureX, textureY); // Box 394
		bodyModel[290] = new ModelRendererTurbo(this, 61, 219, textureX, textureY); // Box 394
		bodyModel[291] = new ModelRendererTurbo(this, 44, 204, textureX, textureY); // Box 394
		bodyModel[292] = new ModelRendererTurbo(this, 67, 194, textureX, textureY); // Box 394
		bodyModel[293] = new ModelRendererTurbo(this, 55, 204, textureX, textureY); // Box 394
		bodyModel[294] = new ModelRendererTurbo(this, 65, 197, textureX, textureY); // Box 394
		bodyModel[295] = new ModelRendererTurbo(this, 62, 195, textureX, textureY); // Box 394
		bodyModel[296] = new ModelRendererTurbo(this, 28, 210, textureX, textureY); // Box 357
		bodyModel[297] = new ModelRendererTurbo(this, 14, 218, textureX, textureY); // Box 358
		bodyModel[298] = new ModelRendererTurbo(this, 22, 211, textureX, textureY); // Box 359
		bodyModel[299] = new ModelRendererTurbo(this, 23, 217, textureX, textureY); // Box 360
		bodyModel[300] = new ModelRendererTurbo(this, 20, 214, textureX, textureY); // Box 361
		bodyModel[301] = new ModelRendererTurbo(this, 27, 211, textureX, textureY); // Box 362
		bodyModel[302] = new ModelRendererTurbo(this, 35, 211, textureX, textureY); // Box 394
		bodyModel[303] = new ModelRendererTurbo(this, 48, 244, textureX, textureY); // Box 394
		bodyModel[304] = new ModelRendererTurbo(this, 56, 235, textureX, textureY); // Box 0
		bodyModel[305] = new ModelRendererTurbo(this, 61, 235, textureX, textureY); // Box 0
		bodyModel[306] = new ModelRendererTurbo(this, 61, 245, textureX, textureY); // Box 0
		bodyModel[307] = new ModelRendererTurbo(this, 57, 248, textureX, textureY); // Box 0
		bodyModel[308] = new ModelRendererTurbo(this, 34, 235, textureX, textureY); // Box 0
		bodyModel[309] = new ModelRendererTurbo(this, 51, 235, textureX, textureY); // Box 0
		bodyModel[310] = new ModelRendererTurbo(this, 34, 247, textureX, textureY); // Box 0
		bodyModel[311] = new ModelRendererTurbo(this, 29, 235, textureX, textureY); // Box 0
		bodyModel[312] = new ModelRendererTurbo(this, 34, 242, textureX, textureY); // Box 0
		bodyModel[313] = new ModelRendererTurbo(this, 29, 242, textureX, textureY); // Box 0
		bodyModel[314] = new ModelRendererTurbo(this, 393, 268, textureX, textureY); // Box 394
		bodyModel[315] = new ModelRendererTurbo(this, 381, 259, textureX, textureY); // Box 0
		bodyModel[316] = new ModelRendererTurbo(this, 386, 260, textureX, textureY); // Box 0
		bodyModel[317] = new ModelRendererTurbo(this, 386, 273, textureX, textureY); // Box 0
		bodyModel[318] = new ModelRendererTurbo(this, 378, 276, textureX, textureY); // Box 0
		bodyModel[319] = new ModelRendererTurbo(this, 381, 270, textureX, textureY); // Box 0
		bodyModel[320] = new ModelRendererTurbo(this, 370, 292, textureX, textureY); // Box 0
		bodyModel[321] = new ModelRendererTurbo(this, 373, 275, textureX, textureY); // Box 0
		bodyModel[322] = new ModelRendererTurbo(this, 374, 282, textureX, textureY); // Box 0
		bodyModel[323] = new ModelRendererTurbo(this, 386, 270, textureX, textureY); // Box 0
		bodyModel[324] = new ModelRendererTurbo(this, 369, 282, textureX, textureY); // Box 0
		bodyModel[325] = new ModelRendererTurbo(this, 183, 293, textureX, textureY); // Box 388
		bodyModel[326] = new ModelRendererTurbo(this, 185, 286, textureX, textureY); // Box 389
		bodyModel[327] = new ModelRendererTurbo(this, 186, 283, textureX, textureY); // Box 390
		bodyModel[328] = new ModelRendererTurbo(this, 186, 290, textureX, textureY); // Box 391
		bodyModel[329] = new ModelRendererTurbo(this, 194, 277, textureX, textureY); // Box 392
		bodyModel[330] = new ModelRendererTurbo(this, 185, 277, textureX, textureY); // Box 393
		bodyModel[331] = new ModelRendererTurbo(this, 203, 277, textureX, textureY); // Box 394
		bodyModel[332] = new ModelRendererTurbo(this, 196, 273, textureX, textureY); // Box 395
		bodyModel[333] = new ModelRendererTurbo(this, 180, 301, textureX, textureY); // Box 396
		bodyModel[334] = new ModelRendererTurbo(this, 172, 275, textureX, textureY); // Box 397
		bodyModel[335] = new ModelRendererTurbo(this, 172, 268, textureX, textureY); // Box 398
		bodyModel[336] = new ModelRendererTurbo(this, 212, 278, textureX, textureY); // Box 399
		bodyModel[337] = new ModelRendererTurbo(this, 163, 280, textureX, textureY); // Box 400
		bodyModel[338] = new ModelRendererTurbo(this, 161, 297, textureX, textureY); // Box 401
		bodyModel[339] = new ModelRendererTurbo(this, 164, 279, textureX, textureY); // Box 402
		bodyModel[340] = new ModelRendererTurbo(this, 163, 289, textureX, textureY); // Box 403
		bodyModel[341] = new ModelRendererTurbo(this, 162, 282, textureX, textureY); // Box 404
		bodyModel[342] = new ModelRendererTurbo(this, 168, 277, textureX, textureY); // Box 405
		bodyModel[343] = new ModelRendererTurbo(this, 209, 292, textureX, textureY); // Box 406
		bodyModel[344] = new ModelRendererTurbo(this, 207, 299, textureX, textureY); // Box 407
		bodyModel[345] = new ModelRendererTurbo(this, 220, 289, textureX, textureY); // Box 408
		bodyModel[346] = new ModelRendererTurbo(this, 209, 286, textureX, textureY); // Box 409
		bodyModel[347] = new ModelRendererTurbo(this, 219, 292, textureX, textureY); // Box 410
		bodyModel[348] = new ModelRendererTurbo(this, 212, 283, textureX, textureY); // Box 411
		bodyModel[349] = new ModelRendererTurbo(this, 204, 298, textureX, textureY); // Box 412
		bodyModel[350] = new ModelRendererTurbo(this, 172, 302, textureX, textureY); // Box 412
		bodyModel[351] = new ModelRendererTurbo(this, 172, 292, textureX, textureY); // Box 414
		bodyModel[352] = new ModelRendererTurbo(this, 180, 205, textureX, textureY); // Box 0
		bodyModel[353] = new ModelRendererTurbo(this, 184, 233, textureX, textureY); // Box 0
		bodyModel[354] = new ModelRendererTurbo(this, 185, 222, textureX, textureY); // Box 0
		bodyModel[355] = new ModelRendererTurbo(this, 184, 193, textureX, textureY); // Box 0
		bodyModel[356] = new ModelRendererTurbo(this, 176, 222, textureX, textureY); // Box 0
		bodyModel[357] = new ModelRendererTurbo(this, 175, 193, textureX, textureY); // Box 0
		bodyModel[358] = new ModelRendererTurbo(this, 177, 203, textureX, textureY); // Box 0
		bodyModel[359] = new ModelRendererTurbo(this, 323, 268, textureX, textureY); // Box 0
		bodyModel[360] = new ModelRendererTurbo(this, 325, 278, textureX, textureY); // Box 0
		bodyModel[361] = new ModelRendererTurbo(this, 141, 311, textureX, textureY); // Box 0
		bodyModel[362] = new ModelRendererTurbo(this, 141, 256, textureX, textureY); // Box 0
		bodyModel[363] = new ModelRendererTurbo(this, 57, 179, textureX, textureY); // Box 183
		bodyModel[364] = new ModelRendererTurbo(this, 72, 189, textureX, textureY); // Box 431
		bodyModel[365] = new ModelRendererTurbo(this, 134, 276, textureX, textureY); // Box 0
		bodyModel[366] = new ModelRendererTurbo(this, 134, 292, textureX, textureY); // Box 474
		bodyModel[367] = new ModelRendererTurbo(this, 348, 215, textureX, textureY); // Box 2
		bodyModel[368] = new ModelRendererTurbo(this, 266, 39, textureX, textureY); // Box 88
		bodyModel[369] = new ModelRendererTurbo(this, 255, 39, textureX, textureY); // Box 88
		bodyModel[370] = new ModelRendererTurbo(this, 266, 45, textureX, textureY); // Box 88
		bodyModel[371] = new ModelRendererTurbo(this, 257, 45, textureX, textureY); // Box 88
		bodyModel[372] = new ModelRendererTurbo(this, 241, 210, textureX, textureY); // Box 0
		bodyModel[373] = new ModelRendererTurbo(this, 277, 241, textureX, textureY); // Box 0
		bodyModel[374] = new ModelRendererTurbo(this, 278, 235, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[375] = new ModelRendererTurbo(this, 248, 205, textureX, textureY); // Box 343
		bodyModel[376] = new ModelRendererTurbo(this, 249, 199, textureX, textureY); // Box 344
		bodyModel[377] = new ModelRendererTurbo(this, 282, 200, textureX, textureY); // Box 0
		bodyModel[378] = new ModelRendererTurbo(this, 282, 226, textureX, textureY); // Box 0
		bodyModel[379] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Box 0
		bodyModel[380] = new ModelRendererTurbo(this, 250, 210, textureX, textureY); // Box 141 fuel tank filler panel
		bodyModel[381] = new ModelRendererTurbo(this, 241, 210, textureX, textureY); // Box 420 fuel filler
		bodyModel[382] = new ModelRendererTurbo(this, 275, 246, textureX, textureY); // Box 140 fuel tank filler panel
		bodyModel[383] = new ModelRendererTurbo(this, 266, 246, textureX, textureY); // Box 421 fuel filler
		bodyModel[384] = new ModelRendererTurbo(this, 270, 237, textureX, textureY); // Box 619
		bodyModel[385] = new ModelRendererTurbo(this, 209, 207, textureX, textureY); // Box 0
		bodyModel[386] = new ModelRendererTurbo(this, 213, 202, textureX, textureY); // Box 0
		bodyModel[387] = new ModelRendererTurbo(this, 211, 197, textureX, textureY); // Box 0
		bodyModel[388] = new ModelRendererTurbo(this, 289, 213, textureX, textureY); // Box 420 water filler
		bodyModel[389] = new ModelRendererTurbo(this, 286, 248, textureX, textureY); // Box 421 water filler
		bodyModel[390] = new ModelRendererTurbo(this, 291, 215, textureX, textureY); // Box 420 water filler
		bodyModel[391] = new ModelRendererTurbo(this, 288, 250, textureX, textureY); // Box 626 water filler
		bodyModel[392] = new ModelRendererTurbo(this, 323, 213, textureX, textureY); // Box 420 water filler
		bodyModel[393] = new ModelRendererTurbo(this, 323, 226, textureX, textureY); // Box 421 water filler
		bodyModel[394] = new ModelRendererTurbo(this, 325, 215, textureX, textureY); // Box 420 water filler
		bodyModel[395] = new ModelRendererTurbo(this, 325, 228, textureX, textureY); // Box 626 water filler
		bodyModel[396] = new ModelRendererTurbo(this, 95, 277, textureX, textureY); // Box 43
		bodyModel[397] = new ModelRendererTurbo(this, 95, 271, textureX, textureY); // Box 2
		bodyModel[398] = new ModelRendererTurbo(this, 102, 277, textureX, textureY); // Box 43
		bodyModel[399] = new ModelRendererTurbo(this, 96, 282, textureX, textureY); // Box 43
		bodyModel[400] = new ModelRendererTurbo(this, 207, 235, textureX, textureY); // Box 833
		bodyModel[401] = new ModelRendererTurbo(this, 211, 230, textureX, textureY); // Box 834
		bodyModel[402] = new ModelRendererTurbo(this, 209, 226, textureX, textureY); // Box 835
		bodyModel[403] = new ModelRendererTurbo(this, 53, 82, textureX, textureY, "cull"); // Box 348 cull
		bodyModel[404] = new ModelRendererTurbo(this, 203, 83, textureX, textureY); // Box 348
		bodyModel[405] = new ModelRendererTurbo(this, 213, 83, textureX, textureY); // Box 348
		bodyModel[406] = new ModelRendererTurbo(this, 208, 83, textureX, textureY); // Box 348
		bodyModel[407] = new ModelRendererTurbo(this, 197, 90, textureX, textureY); // Box 348
		bodyModel[408] = new ModelRendererTurbo(this, 54, 90, textureX, textureY, "cull"); // Box 348 cull
		bodyModel[409] = new ModelRendererTurbo(this, 263, 100, textureX, textureY, "cull"); // Box 348 cull
		bodyModel[410] = new ModelRendererTurbo(this, 324, 83, textureX, textureY); // Box 348
		bodyModel[411] = new ModelRendererTurbo(this, 329, 83, textureX, textureY); // Box 348
		bodyModel[412] = new ModelRendererTurbo(this, 314, 83, textureX, textureY); // Box 348
		bodyModel[413] = new ModelRendererTurbo(this, 309, 83, textureX, textureY); // Box 348
		bodyModel[414] = new ModelRendererTurbo(this, 334, 83, textureX, textureY, "cull"); // Box 348 cull
		bodyModel[415] = new ModelRendererTurbo(this, 54, 144, textureX, textureY); // Box 609
		bodyModel[416] = new ModelRendererTurbo(this, 334, 137, textureX, textureY); // Box 616
		bodyModel[417] = new ModelRendererTurbo(this, 199, 59, textureX, textureY); // Box 62
		bodyModel[418] = new ModelRendererTurbo(this, 202, 113, textureX, textureY); // Box 655
		bodyModel[419] = new ModelRendererTurbo(this, 263, 154, textureX, textureY, "cull"); // Box 653 cull
		bodyModel[420] = new ModelRendererTurbo(this, 324, 137, textureX, textureY); // Box 654
		bodyModel[421] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 655
		bodyModel[422] = new ModelRendererTurbo(this, 314, 137, textureX, textureY); // Box 656
		bodyModel[423] = new ModelRendererTurbo(this, 319, 137, textureX, textureY); // Box 657
		bodyModel[424] = new ModelRendererTurbo(this, 309, 137, textureX, textureY); // Box 658
		bodyModel[425] = new ModelRendererTurbo(this, 53, 136, textureX, textureY); // Box 659
		bodyModel[426] = new ModelRendererTurbo(this, 202, 137, textureX, textureY); // Box 660
		bodyModel[427] = new ModelRendererTurbo(this, 212, 137, textureX, textureY); // Box 661
		bodyModel[428] = new ModelRendererTurbo(this, 207, 137, textureX, textureY); // Box 662
		bodyModel[429] = new ModelRendererTurbo(this, 197, 144, textureX, textureY); // Box 663
		bodyModel[430] = new ModelRendererTurbo(this, 150, 137, textureX, textureY, "cull"); // Box 680 cull
		bodyModel[431] = new ModelRendererTurbo(this, 186, 147, textureX, textureY); // Box 681
		bodyModel[432] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 682
		bodyModel[433] = new ModelRendererTurbo(this, 181, 147, textureX, textureY); // Box 684
		bodyModel[434] = new ModelRendererTurbo(this, 122, 127, textureX, textureY); // Box 685
		bodyModel[435] = new ModelRendererTurbo(this, 147, 125, textureX, textureY); // Box 686
		bodyModel[436] = new ModelRendererTurbo(this, 221, 137, textureX, textureY, "cull"); // Box 687 cull
		bodyModel[437] = new ModelRendererTurbo(this, 314, 148, textureX, textureY); // Box 689
		bodyModel[438] = new ModelRendererTurbo(this, 319, 148, textureX, textureY); // Box 690
		bodyModel[439] = new ModelRendererTurbo(this, 309, 148, textureX, textureY); // Box 691
		bodyModel[440] = new ModelRendererTurbo(this, 266, 108, textureX, textureY); // Box 692
		bodyModel[441] = new ModelRendererTurbo(this, 266, 143, textureX, textureY); // Box 693
		bodyModel[442] = new ModelRendererTurbo(this, 278, 38, textureX, textureY); // Box 0
		bodyModel[443] = new ModelRendererTurbo(this, 283, 38, textureX, textureY); // Box 0
		bodyModel[444] = new ModelRendererTurbo(this, 288, 38, textureX, textureY); // Box 0
		bodyModel[445] = new ModelRendererTurbo(this, 293, 38, textureX, textureY); // Box 0
		bodyModel[446] = new ModelRendererTurbo(this, 376, 37, textureX, textureY); // Box 0
		bodyModel[447] = new ModelRendererTurbo(this, 381, 37, textureX, textureY); // Box 0
		bodyModel[448] = new ModelRendererTurbo(this, 386, 37, textureX, textureY); // Box 0
		bodyModel[449] = new ModelRendererTurbo(this, 391, 37, textureX, textureY); // Box 0
		bodyModel[450] = new ModelRendererTurbo(this, 154, 33, textureX, textureY); // Box 0 exhaust
		bodyModel[451] = new ModelRendererTurbo(this, 181, 48, textureX, textureY); // Box 394
		bodyModel[452] = new ModelRendererTurbo(this, 184, 43, textureX, textureY); // Box 394
		bodyModel[453] = new ModelRendererTurbo(this, 227, 43, textureX, textureY); // Box 394
		bodyModel[454] = new ModelRendererTurbo(this, 154, 37, textureX, textureY); // Box 0
		bodyModel[455] = new ModelRendererTurbo(this, 166, 54, textureX, textureY); // Box 0
		bodyModel[456] = new ModelRendererTurbo(this, 173, 64, textureX, textureY); // Box 0
		bodyModel[457] = new ModelRendererTurbo(this, 167, 49, textureX, textureY); // Box 0
		bodyModel[458] = new ModelRendererTurbo(this, 143, 57, textureX, textureY); // Box 0
		bodyModel[459] = new ModelRendererTurbo(this, 151, 57, textureX, textureY); // Box 0
		bodyModel[460] = new ModelRendererTurbo(this, 137, 47, textureX, textureY); // Box 394
		bodyModel[461] = new ModelRendererTurbo(this, 152, 50, textureX, textureY); // Box 394
		bodyModel[462] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 394
		bodyModel[463] = new ModelRendererTurbo(this, 156, 44, textureX, textureY); // Box 394
		bodyModel[464] = new ModelRendererTurbo(this, 158, 49, textureX, textureY); // Box 394
		bodyModel[465] = new ModelRendererTurbo(this, 158, 57, textureX, textureY); // Box 0
		bodyModel[466] = new ModelRendererTurbo(this, 81, 74, textureX, textureY); // Box 177
		bodyModel[467] = new ModelRendererTurbo(this, 97, 64, textureX, textureY); // Box 177
		bodyModel[468] = new ModelRendererTurbo(this, 63, 27, textureX, textureY); // Box 177
		bodyModel[469] = new ModelRendererTurbo(this, 47, 38, textureX, textureY); // Box 181
		bodyModel[470] = new ModelRendererTurbo(this, 123, 32, textureX, textureY); // Box 191
		bodyModel[471] = new ModelRendererTurbo(this, 68, 51, textureX, textureY); // Box 177
		bodyModel[472] = new ModelRendererTurbo(this, 95, 49, textureX, textureY); // Box 177
		bodyModel[473] = new ModelRendererTurbo(this, 116, 48, textureX, textureY); // Box 177
		bodyModel[474] = new ModelRendererTurbo(this, 82, 22, textureX, textureY); // Box 177
		bodyModel[475] = new ModelRendererTurbo(this, 123, 38, textureX, textureY); // Box 191
		bodyModel[476] = new ModelRendererTurbo(this, 111, 23, textureX, textureY); // Box 177
		bodyModel[477] = new ModelRendererTurbo(this, 111, 26, textureX, textureY); // Box 754
		bodyModel[478] = new ModelRendererTurbo(this, 4, 47, textureX, textureY); // Box 755
		bodyModel[479] = new ModelRendererTurbo(this, 1, 71, textureX, textureY); // Box 756
		bodyModel[480] = new ModelRendererTurbo(this, 12, 65, textureX, textureY); // Box 757
		bodyModel[481] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 758
		bodyModel[482] = new ModelRendererTurbo(this, 4, 51, textureX, textureY); // Box 759
		bodyModel[483] = new ModelRendererTurbo(this, 32, 38, textureX, textureY); // Box 760
		bodyModel[484] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 761
		bodyModel[485] = new ModelRendererTurbo(this, 33, 48, textureX, textureY); // Box 762
		bodyModel[486] = new ModelRendererTurbo(this, 6, 51, textureX, textureY); // Box 763
		bodyModel[487] = new ModelRendererTurbo(this, 19, 51, textureX, textureY); // Box 764
		bodyModel[488] = new ModelRendererTurbo(this, 41, 56, textureX, textureY); // Box 765
		bodyModel[489] = new ModelRendererTurbo(this, 36, 53, textureX, textureY); // Box 766
		bodyModel[490] = new ModelRendererTurbo(this, 3, 39, textureX, textureY); // Box 767
		bodyModel[491] = new ModelRendererTurbo(this, 18, 42, textureX, textureY); // Box 768
		bodyModel[492] = new ModelRendererTurbo(this, 19, 47, textureX, textureY); // Box 769
		bodyModel[493] = new ModelRendererTurbo(this, 21, 51, textureX, textureY); // Box 770
		bodyModel[494] = new ModelRendererTurbo(this, 66, 7, textureX, textureY); // Box 771
		bodyModel[495] = new ModelRendererTurbo(this, 59, 57, textureX, textureY); // Box 772
		bodyModel[496] = new ModelRendererTurbo(this, 66, 75, textureX, textureY); // Box 773
		bodyModel[497] = new ModelRendererTurbo(this, 70, 39, textureX, textureY); // Box 774
		bodyModel[498] = new ModelRendererTurbo(this, 70, 42, textureX, textureY); // Box 775
		bodyModel[499] = new ModelRendererTurbo(this, 80, 30, textureX, textureY); // Box 177

		bodyModel[0].addBox(0F, 0F, 0F, 114, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-57F, 0F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 114, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(-57F, -21F, -2F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 114, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[2].setRotationPoint(-57F, -21F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 114, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 88
		bodyModel[3].setRotationPoint(-57F, -21F, 2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 114, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 336
		bodyModel[4].setRotationPoint(-57F, -20F, 8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 114, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		bodyModel[5].setRotationPoint(-57F, -20F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 69, 18, 1, 0F); // Box 62
		bodyModel[6].setRotationPoint(-57F, -18F, 10F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 348
		bodyModel[7].setRotationPoint(12F, -18F, 10F);

		bodyModel[8].addShapeBox(-4F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear side door R
		bodyModel[8].setRotationPoint(16F, -11F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 41, 18, 1, 0F); // Box 62
		bodyModel[9].setRotationPoint(16F, -18F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.675F, 0F, 0F, -0.675F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.675F, -1F, 0F, -0.675F, -1F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[10].setRotationPoint(12F, -12F, 10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.675F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.675F, 0F, 0F, -0.675F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.675F, -1F, 0F); // Box 348
		bodyModel[11].setRotationPoint(14F, -12F, 10F);

		bodyModel[12].addShapeBox(-4F, 0F, -0.5F, 2, 1, 1, 0F,0F, -1F, -0.5F, -0.675F, 0F, -0.5F, -0.675F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.675F, 0F, -0.5F, -0.675F, 0F, 0F, 0F, 0F, 0F); // Rear side door R
		bodyModel[12].setRotationPoint(16F, -12F, 10F);

		bodyModel[13].addShapeBox(-2F, 0F, -0.5F, 2, 1, 1, 0F,-0.675F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.675F, 0F, 0F, -0.675F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.675F, 0F, 0F); // Rear side door R
		bodyModel[13].setRotationPoint(16F, -12F, 10F);

		bodyModel[14].addShapeBox(-3F, 0F, -0.5F, 2, 1, 1, 0F,-0.325F, 0F, -0.5F, -0.325F, 0F, -0.5F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, -0.5F, -0.325F, 0F, -0.5F, -0.325F, 0F, 0F, -0.325F, 0F, 0F); // Rear side door R
		bodyModel[14].setRotationPoint(16F, -12F, 10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 114, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[15].setRotationPoint(-57F, -19F, 10F);

		bodyModel[16].addBox(0F, 0F, 0F, 69, 18, 1, 0F); // Box 27
		bodyModel[16].setRotationPoint(-57F, -18F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 28
		bodyModel[17].setRotationPoint(12F, -18F, -11F);

		bodyModel[18].addShapeBox(-4F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Rear side door L
		bodyModel[18].setRotationPoint(16F, -11F, -10F);

		bodyModel[19].addBox(0F, 0F, 0F, 41, 18, 1, 0F); // Box 30
		bodyModel[19].setRotationPoint(16F, -18F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.675F, 0F, 0F, -0.675F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.675F, -1F, 0F, -0.675F, -1F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[20].setRotationPoint(12F, -12F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.675F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.675F, 0F, 0F, -0.675F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.675F, -1F, 0F); // Box 33
		bodyModel[21].setRotationPoint(14F, -12F, -11F);

		bodyModel[22].addShapeBox(-4F, 0F, -0.5F, 2, 1, 1, 0F,0F, -1F, 0F, -0.675F, 0F, 0F, -0.675F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.675F, 0F, 0F, -0.675F, 0F, -0.5F, 0F, 0F, -0.5F); // Rear side door L
		bodyModel[22].setRotationPoint(16F, -12F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 114, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[23].setRotationPoint(-57F, -19F, -11F);

		bodyModel[24].addShapeBox(-2F, 0F, -0.5F, 2, 1, 1, 0F,-0.675F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -0.675F, 0F, -0.5F, -0.675F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.675F, 0F, -0.5F); // Rear side door L
		bodyModel[24].setRotationPoint(16F, -12F, -10F);

		bodyModel[25].addShapeBox(-3F, 0F, -0.5F, 2, 1, 1, 0F,-0.325F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, -0.5F, -0.325F, 0F, -0.5F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, -0.5F, -0.325F, 0F, -0.5F); // Rear side door L
		bodyModel[25].setRotationPoint(16F, -12F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F); // Box 348
		bodyModel[26].setRotationPoint(9F, -18F, 11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 348
		bodyModel[27].setRotationPoint(9F, -14F, 11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F); // Box 348
		bodyModel[28].setRotationPoint(-18F, -18F, 11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 348
		bodyModel[29].setRotationPoint(-18F, -14F, 11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F); // Box 348
		bodyModel[30].setRotationPoint(53F, -18F, 11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 348
		bodyModel[31].setRotationPoint(53F, -14F, 11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F); // Box 348
		bodyModel[32].setRotationPoint(26F, -18F, 11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 348
		bodyModel[33].setRotationPoint(26F, -14F, 11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 48, 8, 1, 0F,0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 348 cull
		bodyModel[34].setRotationPoint(-15F, -18F, 11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 48, 8, 1, 0F,0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 348 cull
		bodyModel[35].setRotationPoint(29F, -18F, 11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[36].setRotationPoint(9F, -18F, -12F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[37].setRotationPoint(9F, -14F, -12F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[38].setRotationPoint(-18F, -18F, -12F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 58
		bodyModel[39].setRotationPoint(-18F, -14F, -12F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[40].setRotationPoint(53F, -18F, -12F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[41].setRotationPoint(53F, -14F, -12F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[42].setRotationPoint(26F, -18F, -12F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 62
		bodyModel[43].setRotationPoint(26F, -14F, -12F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 48, 8, 1, 0F,0F, 0F, -0.5F, -24F, 0F, -0.5F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -24F, 0F, -0.5F, -24F, 0F, 0F, 0F, 0F, 0F); // Box 63 cull
		bodyModel[44].setRotationPoint(-15F, -18F, -12F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 48, 8, 1, 0F,0F, 0F, -0.5F, -24F, 0F, -0.5F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -24F, 0F, -0.5F, -24F, 0F, 0F, 0F, 0F, 0F); // Box 64 cull
		bodyModel[45].setRotationPoint(29F, -18F, -12F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 108
		bodyModel[46].setRotationPoint(-54F, -13F, 11F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 109
		bodyModel[47].setRotationPoint(-57F, -13F, 11F);

		bodyModel[48].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 0
		bodyModel[48].setRotationPoint(16.5F, -12F, 11F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 0
		bodyModel[49].setRotationPoint(11.5F, -12F, 11F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 69
		bodyModel[50].setRotationPoint(-54F, -13F, -12F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 70
		bodyModel[51].setRotationPoint(-57F, -13F, -12F);

		bodyModel[52].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 71
		bodyModel[52].setRotationPoint(16.5F, -12F, -12F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 72
		bodyModel[53].setRotationPoint(11.5F, -12F, -12F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 0
		bodyModel[54].setRotationPoint(56F, -14F, -10F);

		bodyModel[55].addBox(0F, 0F, -4F, 1, 14, 4, 0F); // Rear door
		bodyModel[55].setRotationPoint(56F, -14F, 2F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 0
		bodyModel[56].setRotationPoint(56F, -14F, 2F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 0
		bodyModel[57].setRotationPoint(56F, -18F, -10F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Box 128
		bodyModel[58].setRotationPoint(57F, 1F, -5F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 128
		bodyModel[59].setRotationPoint(57F, 2F, -5F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 99
		bodyModel[60].setRotationPoint(57F, 2F, 4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[61].setRotationPoint(58.5F, -14F, 3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[62].setRotationPoint(58.5F, -14F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[63].setRotationPoint(57F, -15F, 3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[64].setRotationPoint(57F, -15F, -3.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[65].setRotationPoint(57F, -15.5F, -3.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[66].setRotationPoint(58.5F, -16F, -5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[67].setRotationPoint(56F, 2F, -5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[68].setRotationPoint(56F, 2F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 94
		bodyModel[69].setRotationPoint(56F, 2F, 5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[70].setRotationPoint(56F, -19F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[71].setRotationPoint(56F, -19F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[72].setRotationPoint(56F, -19F, 8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[73].setRotationPoint(56F, -20F, -2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[74].setRotationPoint(56F, -20F, -8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[75].setRotationPoint(56F, -20F, 2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[76].setRotationPoint(57F, -9F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 3
		bodyModel[77].setRotationPoint(57F, -9F, -9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[78].setRotationPoint(57F, -18.5F, -1F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[79].setRotationPoint(57F, 3F, -1.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[80].setRotationPoint(55F, 2F, -3F);

		bodyModel[81].addBox(0F, 0F, 0F, 102, 1, 8, 0F); // Box 0
		bodyModel[81].setRotationPoint(-51F, 2F, -4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 2
		bodyModel[82].setRotationPoint(51F, 3F, -3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[83].setRotationPoint(56F, 2F, 3F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[84].setRotationPoint(-39F, 2.5F, -2F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[85].setRotationPoint(34.5F, 2.5F, -2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 2
		bodyModel[86].setRotationPoint(51F, 2F, -3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[87].setRotationPoint(-60F, 3F, -1.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[88].setRotationPoint(-55F, 3F, -3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 2
		bodyModel[89].setRotationPoint(-55F, 2F, -3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[90].setRotationPoint(14F, 3F, -4F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[91].setRotationPoint(-22F, 3F, -4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 28, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[92].setRotationPoint(-14F, 3F, -4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[93].setRotationPoint(35F, 2F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[94].setRotationPoint(35F, 2F, 4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[95].setRotationPoint(-38.5F, 2F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[96].setRotationPoint(-38.5F, 2F, 4F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[97].setRotationPoint(11.5F, 2F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[98].setRotationPoint(16F, 2F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 120
		bodyModel[99].setRotationPoint(-57F, 2F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 481
		bodyModel[100].setRotationPoint(-57F, 2F, 11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 120
		bodyModel[101].setRotationPoint(12F, 2F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 481
		bodyModel[102].setRotationPoint(12F, 2F, 11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[103].setRotationPoint(-9.5F, -21.5F, -3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[104].setRotationPoint(-2.5F, -21.5F, -3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[105].setRotationPoint(34.5F, -21.5F, -3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[106].setRotationPoint(41.5F, -21.5F, -3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 24, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[107].setRotationPoint(-35F, -21.5F, -2F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 24, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[108].setRotationPoint(9F, -21.5F, -2F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,0F, 0.08F, 0F, 0F, 0.08F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[109].setRotationPoint(49.5F, -21F, 4.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 0
		bodyModel[110].setRotationPoint(49.5F, -21.5F, -3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[111].setRotationPoint(29F, -18F, -10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[112].setRotationPoint(29F, -18F, 9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[113].setRotationPoint(37F, -15F, -9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[114].setRotationPoint(44F, -15F, -9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[115].setRotationPoint(34F, -15F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[116].setRotationPoint(37F, -15F, 4F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 348
		bodyModel[117].setRotationPoint(29F, -11F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[118].setRotationPoint(29F, -11F, 9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 348
		bodyModel[119].setRotationPoint(30.25F, -14F, -9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 177
		bodyModel[120].setRotationPoint(29F, -18F, -9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[121].setRotationPoint(48F, -18F, -9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F); // Box 348
		bodyModel[122].setRotationPoint(29F, -14F, -9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F); // Box 348
		bodyModel[123].setRotationPoint(52F, -14F, -9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[124].setRotationPoint(30.25F, -14F, 8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[125].setRotationPoint(29F, -18F, 5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[126].setRotationPoint(48F, -18F, 5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[127].setRotationPoint(29F, -14F, 8F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 193
		bodyModel[128].setRotationPoint(52F, -14F, 8F);

		bodyModel[129].addBox(0F, 0F, 0F, 19, 4, 7, 0F); // Box 0
		bodyModel[129].setRotationPoint(10.5F, -4F, -3.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 19, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[130].setRotationPoint(10.5F, -4F, -5.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[131].setRotationPoint(10.5F, -4F, 3.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[132].setRotationPoint(27.5F, -4F, 3.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 24, 9, 7, 0F,0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[133].setRotationPoint(10.5F, -13F, -3.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 18, 2, 5, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[134].setRotationPoint(11.3F, -15F, -2.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[135].setRotationPoint(11.6F, -15F, -3.83F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[136].setRotationPoint(13.98F, -15F, -3.83F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[137].setRotationPoint(16.36F, -15F, -3.83F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[138].setRotationPoint(18.71F, -15F, -3.83F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[139].setRotationPoint(21.08F, -15F, -3.83F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[140].setRotationPoint(23.46F, -15F, -3.83F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[141].setRotationPoint(25.84F, -15F, -3.83F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[142].setRotationPoint(28.22F, -15F, -3.83F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[143].setRotationPoint(11.3F, -17F, -3.83F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[144].setRotationPoint(13.68F, -17F, -3.83F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 24, 3, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.34F, 0F, 0F, -0.34F); // Box 0
		bodyModel[145].setRotationPoint(10.5F, -10F, -4.83F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[146].setRotationPoint(16.06F, -17F, -3.83F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[147].setRotationPoint(18.41F, -17F, -3.83F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[148].setRotationPoint(20.78F, -17F, -3.83F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[149].setRotationPoint(23.16F, -17F, -3.83F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[150].setRotationPoint(25.54F, -17F, -3.83F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[151].setRotationPoint(27.9F, -17F, -3.83F);

		bodyModel[152].addBox(0F, 0F, 0F, 5, 4, 12, 0F); // Box 0
		bodyModel[152].setRotationPoint(4F, -5F, -6F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[153].setRotationPoint(4F, -9F, -6F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[154].setRotationPoint(9F, -3.7F, 0F);
		bodyModel[154].rotateAngleX = -0.78539816F;

		bodyModel[155].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 0
		bodyModel[155].setRotationPoint(4F, -11.21F, -4.79F);
		bodyModel[155].rotateAngleX = -0.78539816F;

		bodyModel[156].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 0
		bodyModel[156].setRotationPoint(3F, -4F, -1F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 0
		bodyModel[157].setRotationPoint(3F, -6F, 1F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 0
		bodyModel[158].setRotationPoint(3F, -4F, 1F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[159].setRotationPoint(3F, -4F, -4F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[160].setRotationPoint(3F, -9F, 1F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 0
		bodyModel[161].setRotationPoint(3F, -9F, -4F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F); // Box 0
		bodyModel[162].setRotationPoint(3F, -11.21F, -4.79F);
		bodyModel[162].rotateAngleX = -0.78539816F;

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0.445F, -0.15F, 0F, 0.445F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[163].setRotationPoint(3F, -9F, -6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.145F, 0.435F, 0F, -0.145F, 0.435F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[164].setRotationPoint(3F, -11F, -4F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[165].setRotationPoint(4F, -1F, -6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[166].setRotationPoint(34F, -19F, 8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[167].setRotationPoint(34F, -19F, -10F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 14, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[168].setRotationPoint(34F, -18F, -9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 14, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[169].setRotationPoint(34F, -19F, -8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[170].setRotationPoint(34F, -20F, -2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[171].setRotationPoint(34F, -20F, -8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[172].setRotationPoint(34F, -20F, 2F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[173].setRotationPoint(-15F, -18F, -10F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[174].setRotationPoint(-15F, -18F, 9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[175].setRotationPoint(-6F, -15F, -9F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[176].setRotationPoint(1F, -15F, -9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[177].setRotationPoint(-10F, -15F, -9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[178].setRotationPoint(-6F, -15F, 4F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 348
		bodyModel[179].setRotationPoint(-15F, -11F, -10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 348
		bodyModel[180].setRotationPoint(-13.75F, -14F, -9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 177
		bodyModel[181].setRotationPoint(-15F, -18F, -9F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[182].setRotationPoint(4F, -18F, -9F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F); // Box 348
		bodyModel[183].setRotationPoint(-15F, -14F, -9F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F); // Box 348
		bodyModel[184].setRotationPoint(8F, -14F, -9F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[185].setRotationPoint(-13.75F, -14F, 8F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[186].setRotationPoint(-15F, -18F, 5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[187].setRotationPoint(4F, -18F, 5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[188].setRotationPoint(-15F, -14F, 8F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 193
		bodyModel[189].setRotationPoint(8F, -14F, 8F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[190].setRotationPoint(-10F, -19F, 8F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[191].setRotationPoint(-10F, -19F, -10F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 14, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[192].setRotationPoint(-10F, -18F, -9F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 14, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[193].setRotationPoint(-10F, -19F, -8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[194].setRotationPoint(-10F, -20F, -2F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[195].setRotationPoint(-10F, -20F, -8F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[196].setRotationPoint(-10F, -20F, 2F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[197].setRotationPoint(-15F, -11F, 9F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, -0.125F, -0.125F, 0.21F, -0.125F, -0.125F, 0.21F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.21F, -0.125F, -0.125F, 0.21F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 394
		bodyModel[198].setRotationPoint(11.29F, -15.28F, 3.5F);
		bodyModel[198].rotateAngleX = -0.78539816F;

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[199].setRotationPoint(29.5F, -16.66F, 3.5F);
		bodyModel[199].rotateAngleX = -0.78539816F;

		bodyModel[200].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 394
		bodyModel[200].setRotationPoint(11.29F, -17.75F, 3.5F);
		bodyModel[200].rotateAngleX = -0.78539816F;

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.005F, 0F, 0F, -0.005F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F); // Box 0
		bodyModel[201].setRotationPoint(27.02F, -21.34F, 3F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.005F, 0F, 0F, -0.005F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F); // Box 0
		bodyModel[202].setRotationPoint(22.25F, -21.34F, 3F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.005F, 0F, 0F, -0.005F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F); // Box 0
		bodyModel[203].setRotationPoint(17.55F, -21.34F, 3F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.005F, 0F, 0F, -0.005F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F); // Box 0
		bodyModel[204].setRotationPoint(12.8F, -21.34F, 3F);

		bodyModel[205].addBox(0F, 0F, 0F, 19, 4, 7, 0F); // Box 270
		bodyModel[205].setRotationPoint(-32.5F, -4F, -3.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 19, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[206].setRotationPoint(-32.5F, -4F, 3.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[207].setRotationPoint(-30.5F, -4F, -5.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[208].setRotationPoint(-32.5F, -4F, -5.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 24, 9, 7, 0F,0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[209].setRotationPoint(-32.5F, -13F, -3.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 18, 2, 5, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[210].setRotationPoint(-32.5F, -15F, -2.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[211].setRotationPoint(-32.2F, -15F, 3.83F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[212].setRotationPoint(-29.82F, -15F, 3.83F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[213].setRotationPoint(-27.44F, -15F, 3.83F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[214].setRotationPoint(-25.09F, -15F, 3.83F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[215].setRotationPoint(-22.72F, -15F, 3.83F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[216].setRotationPoint(-20.34F, -15F, 3.83F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[217].setRotationPoint(-17.96F, -15F, 3.83F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[218].setRotationPoint(-15.58F, -15F, 3.83F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[219].setRotationPoint(-32.5F, -17F, -2.17F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[220].setRotationPoint(-30.12F, -17F, -2.17F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 24, 3, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, -5F, 0F, -0.34F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[221].setRotationPoint(-32.5F, -10F, 2.83F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[222].setRotationPoint(-27.74F, -17F, -2.17F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[223].setRotationPoint(-25.39F, -17F, -2.17F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[224].setRotationPoint(-23.02F, -17F, -2.17F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[225].setRotationPoint(-20.64F, -17F, -2.17F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[226].setRotationPoint(-18.26F, -17F, -2.17F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[227].setRotationPoint(-15.9F, -17F, -2.17F);

		bodyModel[228].addBox(0F, 0F, 0F, 5, 4, 12, 0F); // Box 293
		bodyModel[228].setRotationPoint(-13.5F, -5F, -6F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[229].setRotationPoint(-13.5F, -9F, -6F);

		bodyModel[230].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 295
		bodyModel[230].setRotationPoint(-12.5F, -9.8F, 3.37F);
		bodyModel[230].rotateAngleX = 0.78539816F;

		bodyModel[231].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 296
		bodyModel[231].setRotationPoint(-8.5F, -4F, -1F);

		bodyModel[232].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 297
		bodyModel[232].setRotationPoint(-8.5F, -6F, -4F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[233].setRotationPoint(-8.5F, -4F, -4F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 299
		bodyModel[234].setRotationPoint(-8.5F, -4F, 1F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[235].setRotationPoint(-8.5F, -9F, -4F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 301
		bodyModel[236].setRotationPoint(-8.5F, -9F, -1F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0.12F, 0F, -1F, 0.12F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 302
		bodyModel[237].setRotationPoint(-8.5F, -9.8F, 3.37F);
		bodyModel[237].rotateAngleX = 0.78539816F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.445F, -0.15F, 0F, 0.445F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 303
		bodyModel[238].setRotationPoint(-8.5F, -9F, 4F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.145F, 0.435F, 0F, -0.145F, 0.435F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[239].setRotationPoint(-8.5F, -11F, -1F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 305
		bodyModel[240].setRotationPoint(-13.5F, -1F, -6F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0.21F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.21F, -0.125F, -0.125F, 0.21F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.21F, -0.125F, -0.125F); // Box 306
		bodyModel[241].setRotationPoint(-32.29F, -15.28F, -3.5F);
		bodyModel[241].rotateAngleX = -0.78539816F;

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[242].setRotationPoint(-35.5F, -16.66F, -3.5F);
		bodyModel[242].rotateAngleX = -0.78539816F;

		bodyModel[243].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0.22F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F); // Box 308
		bodyModel[243].setRotationPoint(-32.29F, -17.75F, -3.5F);
		bodyModel[243].rotateAngleX = -0.78539816F;

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.005F, 0F, 0F, -0.005F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0F, -0.16F, 0F, 0F, -0.16F, 0F, 0F, -0.16F, 0F, 0F, -0.16F, 0F); // Box 0
		bodyModel[244].setRotationPoint(-16.78F, -21.34F, 3F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.005F, 0F, 0F, -0.005F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0F, -0.16F, 0F, 0F, -0.16F, 0F, 0F, -0.16F, 0F, 0F, -0.16F, 0F); // Box 0
		bodyModel[245].setRotationPoint(-21.55F, -21.34F, 3F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.005F, 0F, 0F, -0.005F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0F, -0.16F, 0F, 0F, -0.16F, 0F, 0F, -0.16F, 0F, 0F, -0.16F, 0F); // Box 0
		bodyModel[246].setRotationPoint(-26.25F, -21.34F, 3F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.005F, 0F, 0F, -0.005F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0F, -0.16F, 0F, 0F, -0.16F, 0F, 0F, -0.16F, 0F, 0F, -0.16F, 0F); // Box 0
		bodyModel[247].setRotationPoint(-31F, -21.34F, 3F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[248].setRotationPoint(-31F, -18.5F, -4F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.57F, 0F, 0F, -0.57F, 0F, 0F, -0.57F, 0F, 0F, -0.57F, 0F); // Box 0
		bodyModel[249].setRotationPoint(-31F, -17.5F, -4F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[250].setRotationPoint(-26.25F, -18.5F, -4F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.57F, 0F, 0F, -0.57F, 0F, 0F, -0.57F, 0F, 0F, -0.57F, 0F); // Box 0
		bodyModel[251].setRotationPoint(-26.25F, -17.5F, -4F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[252].setRotationPoint(-21.55F, -18.5F, -4F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.57F, 0F, 0F, -0.57F, 0F, 0F, -0.57F, 0F, 0F, -0.57F, 0F); // Box 0
		bodyModel[253].setRotationPoint(-21.55F, -17.5F, -4F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[254].setRotationPoint(-16.78F, -18.5F, -4F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.57F, 0F, 0F, -0.57F, 0F, 0F, -0.57F, 0F, 0F, -0.57F, 0F); // Box 0
		bodyModel[255].setRotationPoint(-16.78F, -17.5F, -4F);

		bodyModel[256].addBox(0F, 0F, 0F, 5, 5, 20, 0F); // Box 0
		bodyModel[256].setRotationPoint(-47F, -5F, -10F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 0
		bodyModel[257].setRotationPoint(-43F, -20F, -2F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[258].setRotationPoint(-48.5F, -2.5F, -2F);

		bodyModel[259].addBox(0F, 0F, 0F, 3, 5, 8, 0F); // Box 0
		bodyModel[259].setRotationPoint(-50F, -5F, -10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[260].setRotationPoint(-50F, -7F, -10F);

		bodyModel[261].addBox(0F, 0F, 0F, 3, 5, 8, 0F); // Box 396
		bodyModel[261].setRotationPoint(-50F, -5F, 2F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[262].setRotationPoint(-50F, -7F, 2F);

		bodyModel[263].addBox(0F, 0F, 0F, 1, 14, 10, 0F); // Box 0
		bodyModel[263].setRotationPoint(-43F, -19F, -5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[264].setRotationPoint(-43F, -20F, 2F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[265].setRotationPoint(-43F, -20F, -5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[266].setRotationPoint(-42F, -2F, -9.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[267].setRotationPoint(-42F, -5F, -9.5F);

		bodyModel[268].addBox(0F, 0F, 0F, 2, 0, 18, 0F); // Box 0
		bodyModel[268].setRotationPoint(-42F, -3.5F, -9F);

		bodyModel[269].addBox(0F, 0F, 0F, 2, 0, 18, 0F); // Box 0
		bodyModel[269].setRotationPoint(-40F, -2F, -9F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 152
		bodyModel[270].setRotationPoint(-42F, -2F, 9F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 153
		bodyModel[271].setRotationPoint(-42F, -5F, 9F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[272].setRotationPoint(-42F, -2F, -6F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[273].setRotationPoint(-42F, -5F, -6F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 335
		bodyModel[274].setRotationPoint(-42F, -2F, 5.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 336
		bodyModel[275].setRotationPoint(-42F, -5F, 5.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 0
		bodyModel[276].setRotationPoint(34F, -3.3F, 0.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[277].setRotationPoint(34F, -4.3F, 1.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[278].setRotationPoint(34F, -4.3F, 0.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 757
		bodyModel[279].setRotationPoint(34F, -4.3F, 3.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[280].setRotationPoint(36F, -7.3F, 1.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[281].setRotationPoint(34F, -7.3F, 1.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[282].setRotationPoint(38F, -7.3F, 1.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[283].setRotationPoint(37F, -6.3F, 0.34F);
		bodyModel[283].rotateAngleY = 0.78539816F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.3F, 0F, -6F, 0.3F, 0F, -6F, 0.3F, -0.5F, 0F, 0.3F, -0.5F); // Box 0
		bodyModel[284].setRotationPoint(34F, -7.3F, 4.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		bodyModel[285].setRotationPoint(39F, -4.5F, -4.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[286].setRotationPoint(39F, -5.5F, -4.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[287].setRotationPoint(29.5F, -3.99F, 0F);
		bodyModel[287].rotateAngleX = -0.78539816F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 394
		bodyModel[288].setRotationPoint(40.5F, -5.5F, -3.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[289].setRotationPoint(40F, -3.25F, 2.5F);
		bodyModel[289].rotateAngleX = -0.78539816F;

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[290].setRotationPoint(40F, -3.25F, -2F);
		bodyModel[290].rotateAngleX = -0.78539816F;

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 394
		bodyModel[291].setRotationPoint(40.5F, -3.5F, -3.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[292].setRotationPoint(40.5F, -5.5F, 3F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 394
		bodyModel[293].setRotationPoint(40.5F, -4F, -3.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[294].setRotationPoint(40.5F, -4.5F, 2F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[295].setRotationPoint(40.5F, -5.5F, 2F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 357
		bodyModel[296].setRotationPoint(32F, -5.5F, 0F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 358
		bodyModel[297].setRotationPoint(32F, -3.5F, -2F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[298].setRotationPoint(32F, -5.5F, -2F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 360
		bodyModel[299].setRotationPoint(32F, -4F, 0F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[300].setRotationPoint(32F, -4.5F, -2F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[301].setRotationPoint(32F, -5.5F, -1F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[302].setRotationPoint(33F, -3.25F, 2.5F);
		bodyModel[302].rotateAngleX = -0.78539816F;

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 394
		bodyModel[303].setRotationPoint(38F, -15F, -2.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.165F, 0F, 0F, 0F, 0F, 0F, -0.165F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[304].setRotationPoint(37.75F, -15F, -4F);
		bodyModel[304].rotateAngleY = 0.78539816F;

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[305].setRotationPoint(39.5F, -15F, -4F);
		bodyModel[305].rotateAngleY = 0.78539816F;

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -0.5F, -0.28F, -0.5F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 0
		bodyModel[306].setRotationPoint(39.5F, -7F, -4F);
		bodyModel[306].rotateAngleY = 0.78539816F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[307].setRotationPoint(37.75F, -7.7F, -3.29F);
		bodyModel[307].rotateAngleX = -0.78539816F;

		bodyModel[308].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[308].setRotationPoint(34F, -3.55F, -2.75F);
		bodyModel[308].rotateAngleX = -0.78539816F;

		bodyModel[309].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,0.005F, 0F, 0.005F, 0F, 0F, 0F, 0.01F, 0F, 0.01F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 0
		bodyModel[309].setRotationPoint(37.75F, -6F, -3.29F);
		bodyModel[309].rotateAngleX = 0.15707963F;
		bodyModel[309].rotateAngleY = 0.78539816F;
		bodyModel[309].rotateAngleZ = 0.15707963F;

		bodyModel[310].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, -0.5F, 0F, -0.23F, -0.5F); // Box 0
		bodyModel[310].setRotationPoint(35F, -0.77F, -3.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[311].setRotationPoint(34.9F, -9F, -6F);
		bodyModel[311].rotateAngleY = 0.78539816F;

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.42F, 0F, 0F, -0.29F, 0F, -0.275F, 0F, 0F, -1F, 0F, -1.575F, -1.6F, 0.42F, -1.575F, -1.6F, -0.29F, -2F, 1F, 0F, -1.575F, 0.6F); // Box 0
		bodyModel[312].setRotationPoint(34.19F, -4F, -5.3F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.71F, 0F, 0.7F, 0.42F, 0F, 0F, 0.42F, 0F, -1F, 0F, 0F, -1F, -0.71F, -1.125F, -1.125F, 0.42F, -1.575F, -1.6F, 0.42F, -1.575F, 0.6F, 0F, -1.575F, 0.6F); // Box 0
		bodyModel[313].setRotationPoint(34.19F, -4F, -5.3F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 394
		bodyModel[314].setRotationPoint(-3F, -15F, -2.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.165F, 0F, 0F, 0F, 0F, 0F, -0.165F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[315].setRotationPoint(-3.25F, -15F, -4F);
		bodyModel[315].rotateAngleY = 0.78539816F;

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[316].setRotationPoint(-1.5F, -15F, -4F);
		bodyModel[316].rotateAngleY = 0.78539816F;

		bodyModel[317].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[317].setRotationPoint(-3.25F, -7.7F, -3.29F);
		bodyModel[317].rotateAngleX = -0.78539816F;

		bodyModel[318].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[318].setRotationPoint(-7F, -3.55F, -2.75F);
		bodyModel[318].rotateAngleX = -0.78539816F;

		bodyModel[319].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,0.005F, 0F, 0.005F, 0F, 0F, 0F, 0.01F, 0F, 0.01F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 0
		bodyModel[319].setRotationPoint(-3.25F, -6F, -3.29F);
		bodyModel[319].rotateAngleX = 0.15707963F;
		bodyModel[319].rotateAngleY = 0.78539816F;
		bodyModel[319].rotateAngleZ = 0.15707963F;

		bodyModel[320].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, -0.5F, 0F, -0.23F, -0.5F); // Box 0
		bodyModel[320].setRotationPoint(-6F, -0.77F, -3.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[321].setRotationPoint(-6.1F, -9F, -6F);
		bodyModel[321].rotateAngleY = 0.78539816F;

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.42F, 0F, 0F, -0.29F, 0F, -0.275F, 0F, 0F, -1F, 0F, -1.575F, -1.6F, 0.42F, -1.575F, -1.6F, -0.29F, -2F, 1F, 0F, -1.575F, 0.6F); // Box 0
		bodyModel[322].setRotationPoint(-6.81F, -4F, -5.3F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -0.5F, -0.28F, -0.5F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 0
		bodyModel[323].setRotationPoint(-1.5F, -7F, -4F);
		bodyModel[323].rotateAngleY = 0.78539816F;

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.71F, 0F, 0.7F, 0.42F, 0F, 0F, 0.42F, 0F, -1F, 0F, 0F, -1F, -0.71F, -1.125F, -1.125F, 0.42F, -1.575F, -1.6F, 0.42F, -1.575F, 0.6F, 0F, -1.575F, 0.6F); // Box 0
		bodyModel[324].setRotationPoint(-6.81F, -4F, -5.3F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 388
		bodyModel[325].setRotationPoint(-40.5F, -3.3F, -4.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[326].setRotationPoint(-40.5F, -4.3F, -3.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[327].setRotationPoint(-40.5F, -4.3F, -1.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[328].setRotationPoint(-40.5F, -4.3F, -4.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 392
		bodyModel[329].setRotationPoint(-38.5F, -7.3F, -3.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 393
		bodyModel[330].setRotationPoint(-40.5F, -7.3F, -3.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 394
		bodyModel[331].setRotationPoint(-36.5F, -7.3F, -3.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[332].setRotationPoint(-37.5F, -6.3F, -1.75F);
		bodyModel[332].rotateAngleY = 0.78539816F;

		bodyModel[333].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.5F, -6F, 0.3F, -0.5F, -6F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 396
		bodyModel[333].setRotationPoint(-40.5F, -7.3F, -5.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 397
		bodyModel[334].setRotationPoint(-40.5F, -4.5F, -0.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[335].setRotationPoint(-40.5F, -5.5F, -0.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[336].setRotationPoint(-33F, -3.99F, 0F);
		bodyModel[336].rotateAngleX = -0.78539816F;

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 400
		bodyModel[337].setRotationPoint(-42F, -5.5F, -2.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 401
		bodyModel[338].setRotationPoint(-42F, -3.5F, -4.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[339].setRotationPoint(-42F, -5.5F, -4F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 403
		bodyModel[340].setRotationPoint(-42F, -4F, -2.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[341].setRotationPoint(-42F, -4.5F, -4F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[342].setRotationPoint(-42F, -5.5F, -3F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 406
		bodyModel[343].setRotationPoint(-34F, -5.5F, -4F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 407
		bodyModel[344].setRotationPoint(-34F, -3.5F, -4F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[345].setRotationPoint(-34F, -5.5F, 1F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 409
		bodyModel[346].setRotationPoint(-34F, -4F, -4F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[347].setRotationPoint(-34F, -4.5F, 0F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[348].setRotationPoint(-34F, -5.5F, 0F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[349].setRotationPoint(-34.5F, -3.25F, -2.5F);
		bodyModel[349].rotateAngleX = -0.78539816F;

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[350].setRotationPoint(-41F, -3.25F, -2.5F);
		bodyModel[350].rotateAngleX = -0.78539816F;

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[351].setRotationPoint(-41F, -3.25F, 2F);
		bodyModel[351].rotateAngleX = -0.78539816F;

		bodyModel[352].addBox(0F, 0F, 0F, 7, 9, 7, 0F); // Box 0
		bodyModel[352].setRotationPoint(46.5F, -9F, 0F);

		bodyModel[353].addBox(0F, 0F, 0F, 4, 8, 4, 0F); // Box 0
		bodyModel[353].setRotationPoint(48F, -8F, -4F);

		bodyModel[354].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 0
		bodyModel[354].setRotationPoint(49F, -14F, -4F);

		bodyModel[355].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 0
		bodyModel[355].setRotationPoint(49.5F, -9F, 7F);
		bodyModel[355].rotateAngleY = 0.78539816F;

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[356].setRotationPoint(46.5F, -4F, -4F);
		bodyModel[356].rotateAngleY = 0.78539816F;

		bodyModel[357].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 0
		bodyModel[357].setRotationPoint(43.5F, -14F, 7F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 7, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[358].setRotationPoint(44F, -7F, 8F);

		bodyModel[359].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 0
		bodyModel[359].setRotationPoint(-29.5F, -14F, 8F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 7, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[360].setRotationPoint(-29F, -7F, 9F);

		bodyModel[361].addBox(0F, 0F, 0F, 8, 14, 2, 0F); // Box 0
		bodyModel[361].setRotationPoint(-38F, -14F, -10F);

		bodyModel[362].addBox(0F, 0F, 0F, 8, 14, 2, 0F); // Box 0
		bodyModel[362].setRotationPoint(-38F, -14F, 8F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[363].setRotationPoint(52F, -11F, 9F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[364].setRotationPoint(52F, -11F, -10F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 11, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[365].setRotationPoint(-42F, -18F, 2F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 11, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[366].setRotationPoint(-42F, -18F, -5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[367].setRotationPoint(-57F, 2F, -3F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 88
		bodyModel[368].setRotationPoint(-46F, -21.5F, 0.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[369].setRotationPoint(-48.5F, -22.5F, 0.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 88
		bodyModel[370].setRotationPoint(-46F, -21.5F, -1.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[371].setRotationPoint(-47.5F, -22.5F, -1.5F);

		bodyModel[372].addBox(0F, 0F, 0F, 12, 6, 16, 0F); // Box 0
		bodyModel[372].setRotationPoint(-8.5F, 3F, -8F);

		bodyModel[373].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 0
		bodyModel[373].setRotationPoint(-6.5F, 3F, -9.59F);
		bodyModel[373].rotateAngleX = -0.78539816F;

		bodyModel[374].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0.415F, 0F, 0F, 0.415F, 0F, 0F, 0.415F, -0.175F, 0F, 0.415F, -0.175F); // Box 0 cull
		bodyModel[374].setRotationPoint(-5.5F, 2F, -11F);

		bodyModel[375].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 343
		bodyModel[375].setRotationPoint(-6.5F, 3F, 9.59F);
		bodyModel[375].rotateAngleX = -0.78539816F;

		bodyModel[376].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.415F, -0.175F, 0F, 0.415F, -0.175F, 0F, 0.415F, 0F, 0F, 0.415F, 0F); // Box 344
		bodyModel[376].setRotationPoint(-5.5F, 2F, 8F);

		bodyModel[377].addBox(0F, 0F, 0F, 10, 5, 20, 0F); // Box 0
		bodyModel[377].setRotationPoint(6.5F, 3F, -10F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[378].setRotationPoint(6.5F, 8F, -10F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[379].setRotationPoint(-6.51F, 2F, 8F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 141 fuel tank filler panel
		bodyModel[380].setRotationPoint(-8.5F, 1.5F, 9.45F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420 fuel filler
		bodyModel[381].setRotationPoint(-8.25F, 2.5F, 7.85F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 140 fuel tank filler panel
		bodyModel[382].setRotationPoint(-8.5F, 1.5F, -10.45F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 421 fuel filler
		bodyModel[383].setRotationPoint(-8.25F, 2.5F, -10.85F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 619
		bodyModel[384].setRotationPoint(-6.51F, 2F, -11F);

		bodyModel[385].addBox(0F, 0F, 0F, 9, 6, 5, 0F); // Box 0
		bodyModel[385].setRotationPoint(-18.5F, 2F, 4F);

		bodyModel[386].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 0
		bodyModel[386].setRotationPoint(-18.5F, 5F, 9F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -2F, 0F, 1.5F, -2F); // Box 0
		bodyModel[387].setRotationPoint(-18.5F, 2.5F, 9F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420 water filler
		bodyModel[388].setRotationPoint(5.5F, 2F, 5.85F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 421 water filler
		bodyModel[389].setRotationPoint(5.5F, 2F, -10.85F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F); // Box 420 water filler
		bodyModel[390].setRotationPoint(5.5F, 2F, 9.85F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F); // Box 626 water filler
		bodyModel[391].setRotationPoint(5.5F, 2F, -9.85F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420 water filler
		bodyModel[392].setRotationPoint(16.5F, 2F, 5.85F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 421 water filler
		bodyModel[393].setRotationPoint(16.5F, 2F, -10.85F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F); // Box 420 water filler
		bodyModel[394].setRotationPoint(16.5F, 2F, 9.85F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F); // Box 626 water filler
		bodyModel[395].setRotationPoint(16.5F, 2F, -9.85F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 43
		bodyModel[396].setRotationPoint(-49F, -12F, -10.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 2
		bodyModel[397].setRotationPoint(-49.5F, -13.25F, -9F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.51F, 0F, -0.5F, -0.51F); // Box 43
		bodyModel[398].setRotationPoint(-48.25F, -12F, -9.5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 43
		bodyModel[399].setRotationPoint(-48.5F, -9.5F, -10.5F);

		bodyModel[400].addBox(0F, 0F, 0F, 9, 6, 5, 0F); // Box 833
		bodyModel[400].setRotationPoint(-18.5F, 2F, -9F);

		bodyModel[401].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 834
		bodyModel[401].setRotationPoint(-18.5F, 5F, -10F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -2F, 0F, 1.5F, -2F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 835
		bodyModel[402].setRotationPoint(-18.5F, 2.5F, -12F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 46, 6, 1, 0F,0.05F, 0.05F, -0.01F, -22.95F, 0.05F, -0.01F, -22.95F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, -0.01F, -22.95F, 0.05F, -0.01F, -22.95F, 0.05F, 0F, 0.05F, 0.05F, 0F); // Box 348 cull
		bodyModel[403].setRotationPoint(-15F, -17F, 10F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.05F, -0.01F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.125F); // Box 348
		bodyModel[404].setRotationPoint(-7F, -17F, 10F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.05F, -0.01F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.125F); // Box 348
		bodyModel[405].setRotationPoint(3F, -17F, 10F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -2F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.125F, 0F, -2F, -0.125F, -2F, 0.05F, -0.01F, 2F, 0.05F, -0.01F, 2F, 0.05F, -0.125F, -2F, 0.05F, -0.125F); // Box 348
		bodyModel[406].setRotationPoint(-6F, -17F, 10F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.05F, -1.5F, -0.01F, -1.05F, 0F, -0.01F, -1.05F, 0F, -0.125F, 0.05F, -1.5F, -0.125F, -1.25F, 0.05F, -0.01F, 1.25F, 0.05F, -0.01F, 1.25F, 0.05F, -0.125F, -1.25F, 0.05F, -0.125F); // Box 348
		bodyModel[407].setRotationPoint(-15F, -15F, 10F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 46, 12, 0, 0F,0F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -23F, -6F, 0F, -23F, -6F, 0F, 0F, -6F, 0F); // Box 348 cull
		bodyModel[408].setRotationPoint(-15F, -17F, 11F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 48, 6, 1, 0F,0.05F, 0.05F, -0.01F, -23.95F, 0.05F, -0.01F, -23.95F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, -0.01F, -23.95F, 0.05F, -0.01F, -23.95F, 0.05F, 0F, 0.05F, 0.05F, 0F); // Box 348 cull
		bodyModel[409].setRotationPoint(29F, -17F, 10F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.05F, -0.01F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.125F); // Box 348
		bodyModel[410].setRotationPoint(46F, -17F, 10F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -2F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.125F, 0F, -2F, -0.125F, -2.5F, 0.05F, -0.01F, 2.5F, 0.05F, -0.01F, 2.5F, 0.05F, -0.125F, -2.5F, 0.05F, -0.125F); // Box 348
		bodyModel[411].setRotationPoint(47F, -17F, 10F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.05F, -0.01F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.125F); // Box 348
		bodyModel[412].setRotationPoint(37F, -17F, 10F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.125F, -1F, 0F, -0.125F, 2F, 0.05F, -0.01F, -2F, 0.05F, -0.01F, -2F, 0.05F, -0.125F, 2F, 0.05F, -0.125F); // Box 348
		bodyModel[413].setRotationPoint(36F, -17F, 10F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 48, 12, 0, 0F,0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -24F, -6F, 0F, -24F, -6F, 0F, 0F, -6F, 0F); // Box 348 cull
		bodyModel[414].setRotationPoint(29F, -17F, 11F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 46, 12, 0, 0F,0F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -23F, -6F, 0F, -23F, -6F, 0F, 0F, -6F, 0F); // Box 609
		bodyModel[415].setRotationPoint(-15F, -17F, -11F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 48, 12, 0, 0F,0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -24F, -6F, 0F, -24F, -6F, 0F, 0F, -6F, 0F); // Box 616
		bodyModel[416].setRotationPoint(29F, -17F, -11F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.065F, 0F, 0F, 0.065F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.065F, 0F, 0F, 0.065F); // Box 62
		bodyModel[417].setRotationPoint(-50F, -17F, 11F);
		bodyModel[417].rotateAngleX = -0.34906585F;

		bodyModel[418].addShapeBox(0F, 0F, -1F, 6, 0, 1, 0F,0F, 0F, 0.065F, 0F, 0F, 0.065F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.065F, 0F, 0F, 0.065F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 655
		bodyModel[418].setRotationPoint(-50F, -17F, -11F);
		bodyModel[418].rotateAngleX = 0.34906585F;

		bodyModel[419].addShapeBox(0F, 0F, 0F, 48, 6, 1, 0F,0.05F, 0.05F, 0F, -23.95F, 0.05F, 0F, -23.95F, 0.05F, -0.01F, 0.05F, 0.05F, -0.01F, 0.05F, 0.05F, 0F, -23.95F, 0.05F, 0F, -23.95F, 0.05F, -0.01F, 0.05F, 0.05F, -0.01F); // Box 653 cull
		bodyModel[419].setRotationPoint(29F, -17F, -11F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.05F, -0.125F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.01F); // Box 654
		bodyModel[420].setRotationPoint(46F, -17F, -11F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -2F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.01F, 0F, -2F, -0.01F, -2.5F, 0.05F, -0.125F, 2.5F, 0.05F, -0.125F, 2.5F, 0.05F, -0.01F, -2.5F, 0.05F, -0.01F); // Box 655
		bodyModel[421].setRotationPoint(47F, -17F, -11F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.05F, -0.125F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.01F); // Box 656
		bodyModel[422].setRotationPoint(37F, -17F, -11F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -2F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.01F, 0F, -2F, -0.01F, -2F, 0.05F, -0.125F, 2F, 0.05F, -0.125F, 2F, 0.05F, -0.01F, -2F, 0.05F, -0.01F); // Box 657
		bodyModel[423].setRotationPoint(38F, -17F, -11F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, -0.125F, 0F, -2F, -0.125F, 0F, -2F, -0.01F, -1F, 0F, -0.01F, 2F, 0.05F, -0.125F, -2F, 0.05F, -0.125F, -2F, 0.05F, -0.01F, 2F, 0.05F, -0.01F); // Box 658
		bodyModel[424].setRotationPoint(36F, -17F, -11F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 46, 6, 1, 0F,0.05F, 0.05F, 0F, -22.95F, 0.05F, 0F, -22.95F, 0.05F, -0.01F, 0.05F, 0.05F, -0.01F, 0.05F, 0.05F, 0F, -22.95F, 0.05F, 0F, -22.95F, 0.05F, -0.01F, 0.05F, 0.05F, -0.01F); // Box 659
		bodyModel[425].setRotationPoint(-15F, -17F, -11F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.05F, -0.125F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.01F); // Box 660
		bodyModel[426].setRotationPoint(-7F, -17F, -11F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.05F, -0.125F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.01F); // Box 661
		bodyModel[427].setRotationPoint(3F, -17F, -11F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -2F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.01F, 0F, -2F, -0.01F, -2F, 0.05F, -0.125F, 2F, 0.05F, -0.125F, 2F, 0.05F, -0.01F, -2F, 0.05F, -0.01F); // Box 662
		bodyModel[428].setRotationPoint(-6F, -17F, -11F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.05F, -1.5F, -0.125F, -1.05F, 0F, -0.125F, -1.05F, 0F, -0.01F, 0.05F, -1.5F, -0.01F, -1.25F, 0.05F, -0.125F, 1.25F, 0.05F, -0.125F, 1.25F, 0.05F, -0.01F, -1.25F, 0.05F, -0.01F); // Box 663
		bodyModel[429].setRotationPoint(-15F, -15F, -11F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 24, 4, 1, 0F,0.05F, 0.05F, 0F, -11.95F, 0.05F, 0F, -11.95F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, -11.95F, 0.05F, 0F, -11.95F, 0.05F, 0F, 0.05F, 0.05F, 0F); // Box 680 cull
		bodyModel[430].setRotationPoint(-31F, -16F, -11F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.125F, 0F, 0.05F, -0.01F, 0F, 0.05F, -0.01F); // Box 681
		bodyModel[431].setRotationPoint(-26F, -16F, -11F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.01F, 0F, 0F, -0.01F, -2F, 0.05F, -0.125F, 2F, 0.05F, -0.125F, 2F, 0.05F, -0.01F, -2F, 0.05F, -0.01F); // Box 682
		bodyModel[432].setRotationPoint(-25F, -16F, -11F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.125F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.01F, 0.125F, 0F, -0.01F, 2.5F, 0.05F, -0.125F, -2.5F, 0.05F, -0.125F, -2.5F, 0.05F, -0.01F, 2.5F, 0.05F, -0.01F); // Box 684
		bodyModel[433].setRotationPoint(-27F, -16F, -11F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 12, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 685
		bodyModel[434].setRotationPoint(-31F, -16F, -10F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 24, 8, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -12F, -4F, 0F, -12F, -4F, 0F, 0F, -4F, 0F); // Box 686
		bodyModel[435].setRotationPoint(-31F, -16F, -11F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 18, 4, 1, 0F,0.05F, 0.05F, 0F, -8.95F, 0.05F, 0F, -8.95F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, -8.95F, 0.05F, 0F, -8.95F, 0.05F, 0F, 0.05F, 0.05F, 0F); // Box 687 cull
		bodyModel[436].setRotationPoint(17F, -16F, -11F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.125F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.01F, 0.125F, 0F, -0.01F, 2.4F, 0.05F, -0.125F, -2.35F, 0.05F, -0.125F, -2.35F, 0.05F, -0.01F, 2.4F, 0.05F, -0.01F); // Box 689
		bodyModel[437].setRotationPoint(25F, -16F, -11F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.125F, -0.95F, 0F, -0.125F, -0.95F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0.05F, -0.125F, -0.95F, 0.05F, -0.125F, -0.95F, 0.05F, -0.01F, 0F, 0.05F, -0.01F); // Box 690
		bodyModel[438].setRotationPoint(26F, -16F, -11F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.125F, -0.95F, 0F, -0.125F, -0.95F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0.05F, -0.125F, -0.95F, 0.05F, -0.125F, -0.95F, 0.05F, -0.01F, 0F, 0.05F, -0.01F); // Box 691
		bodyModel[439].setRotationPoint(16.95F, -16F, -11F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 9, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 692
		bodyModel[440].setRotationPoint(17F, -16F, -10F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 18, 8, 0, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 693
		bodyModel[441].setRotationPoint(17F, -16F, -11F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[442].setRotationPoint(-31F, -21.5F, 3F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[443].setRotationPoint(-26.25F, -21.5F, 3F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[444].setRotationPoint(-21.55F, -21.5F, 3F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[445].setRotationPoint(-16.78F, -21.5F, 3F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.565F, 0F, 0F, -0.565F, 0F, 0F, -0.565F, 0F, 0F, -0.565F, 0F); // Box 0
		bodyModel[446].setRotationPoint(12.8F, -21.5F, 3F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.565F, 0F, 0F, -0.565F, 0F, 0F, -0.565F, 0F, 0F, -0.565F, 0F); // Box 0
		bodyModel[447].setRotationPoint(17.55F, -21.5F, 3F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.565F, 0F, 0F, -0.565F, 0F, 0F, -0.565F, 0F, 0F, -0.565F, 0F); // Box 0
		bodyModel[448].setRotationPoint(22.25F, -21.5F, 3F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.565F, 0F, 0F, -0.565F, 0F, 0F, -0.565F, 0F, 0F, -0.565F, 0F); // Box 0
		bodyModel[449].setRotationPoint(27.02F, -21.5F, 3F);

		bodyModel[450].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 exhaust
		bodyModel[450].setRotationPoint(6F, -20.92F, 2.5F);
		bodyModel[450].rotateAngleX = -0.16580628F;

		bodyModel[451].addShapeBox(0F, 0F, 0F, 23, 5, 5, 0F,0F, 0F, 0F, -4.37F, 0F, 0F, -4.37F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, -4.37F, -1F, 0F, -4.37F, -1F, -1F, 0F, -1F, -1F); // Box 394
		bodyModel[451].setRotationPoint(8.5F, -15F, 2.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[452].setRotationPoint(10.5F, -17F, 2.5F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -0.63F, 0F, 0F, -0.63F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.63F, -0.25F, 0F, -0.63F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 394
		bodyModel[453].setRotationPoint(27.13F, -15F, 2.5F);

		bodyModel[454].addShapeBox(0F, -0.5F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 0
		bodyModel[454].setRotationPoint(6F, -19.5F, 2.5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[455].setRotationPoint(4.5F, -16F, 2.5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[456].setRotationPoint(4.5F, -14F, 0.5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[457].setRotationPoint(4.5F, -14F, 5.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 0, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[458].setRotationPoint(4.49F, -16F, 0.5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[459].setRotationPoint(6.49F, -12F, 0.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[460].setRotationPoint(0.5F, -15.25F, 2F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 394
		bodyModel[461].setRotationPoint(3.5F, -15.37F, 4F);
		bodyModel[461].rotateAngleX = -0.78539816F;

		bodyModel[462].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[462].setRotationPoint(8.5F, -17F, -0.5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[463].setRotationPoint(4.5F, -17F, -0.5F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 394
		bodyModel[464].setRotationPoint(4.5F, -15F, -0.5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 0, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[465].setRotationPoint(8.51F, -16F, 0.5F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[466].setRotationPoint(-2F, -15F, -9F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[467].setRotationPoint(1F, -15F, -9F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[468].setRotationPoint(-7F, -15F, -1F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[469].setRotationPoint(-6F, -15F, 4F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[470].setRotationPoint(4F, -18F, 7F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[471].setRotationPoint(-2F, -18F, -9F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 5, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[472].setRotationPoint(-1F, -18F, -9F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[473].setRotationPoint(-1F, -18F, 1F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[474].setRotationPoint(-1F, -16F, 7F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[475].setRotationPoint(4F, -15F, 7F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 177
		bodyModel[476].setRotationPoint(-1F, -16F, 1F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 754
		bodyModel[477].setRotationPoint(-1F, -16F, 6F);

		bodyModel[478].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 755
		bodyModel[478].setRotationPoint(-11.5F, -20.59F, -4.5F);
		bodyModel[478].rotateAngleX = 0.16580628F;

		bodyModel[479].addShapeBox(0F, 0F, 0F, 23, 5, 5, 0F,0F, 0F, -1F, -4.37F, 0F, -1F, -4.37F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -4.37F, -1F, -1F, -4.37F, -1F, 0F, 0F, -1F, 0F); // Box 756
		bodyModel[479].setRotationPoint(-30F, -15F, -7.5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 757
		bodyModel[480].setRotationPoint(-32.5F, -17F, -4.5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -0.25F, -0.63F, 0F, -0.25F, -0.63F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.63F, -0.25F, -0.25F, -0.63F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 758
		bodyModel[481].setRotationPoint(-32.37F, -15F, -4.5F);

		bodyModel[482].addShapeBox(0F, -0.5F, 0F, 2, 4, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.01F, 0F, -0.1F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 759
		bodyModel[482].setRotationPoint(-11.5F, -19.5F, -4.5F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		bodyModel[483].setRotationPoint(-11.5F, -16F, -5.5F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 761
		bodyModel[484].setRotationPoint(-11.5F, -14F, -2.5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 762
		bodyModel[485].setRotationPoint(-11.5F, -14F, -7.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 0, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 763
		bodyModel[486].setRotationPoint(-11.51F, -16F, -7.5F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 764
		bodyModel[487].setRotationPoint(-11.49F, -12F, -2.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 765
		bodyModel[488].setRotationPoint(-6.5F, -15.25F, -6F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 766
		bodyModel[489].setRotationPoint(-7.5F, -15.37F, -4F);
		bodyModel[489].rotateAngleX = -0.78539816F;

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		bodyModel[490].setRotationPoint(-13.5F, -17F, -4.5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 768
		bodyModel[491].setRotationPoint(-11.5F, -17F, -1.5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 769
		bodyModel[492].setRotationPoint(-9.5F, -15F, -1.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 0, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 770
		bodyModel[493].setRotationPoint(-7.49F, -16F, -7.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 5, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 771
		bodyModel[494].setRotationPoint(-7F, -18F, -1F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 772
		bodyModel[495].setRotationPoint(-7F, -18F, -9F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 773
		bodyModel[496].setRotationPoint(-7F, -16F, -9F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 774
		bodyModel[497].setRotationPoint(-7F, -16F, -2F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 775
		bodyModel[498].setRotationPoint(-7F, -16F, -7F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 13, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[499].setRotationPoint(-9F, -19F, -8F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 47, 45, textureX, textureY); // Box 177
		bodyModel[501] = new ModelRendererTurbo(this, 86, 17, textureX, textureY); // Box 177
		bodyModel[502] = new ModelRendererTurbo(this, 84, 30, textureX, textureY); // Box 780
		bodyModel[503] = new ModelRendererTurbo(this, 77, 28, textureX, textureY); // Box 177
		bodyModel[504] = new ModelRendererTurbo(this, 76, 29, textureX, textureY); // Box 177
		bodyModel[505] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 177
		bodyModel[506] = new ModelRendererTurbo(this, 52, 24, textureX, textureY); // Box 177
		bodyModel[507] = new ModelRendererTurbo(this, 53, 68, textureX, textureY); // Box 785
		bodyModel[508] = new ModelRendererTurbo(this, 83, 38, textureX, textureY); // Box 785
		bodyModel[509] = new ModelRendererTurbo(this, 56, 57, textureX, textureY); // Box 785
		bodyModel[510] = new ModelRendererTurbo(this, 115, 4, textureX, textureY); // Box 394
		bodyModel[511] = new ModelRendererTurbo(this, 105, 3, textureX, textureY); // Box 0
		bodyModel[512] = new ModelRendererTurbo(this, 124, 4, textureX, textureY); // Box 0
		bodyModel[513] = new ModelRendererTurbo(this, 114, 14, textureX, textureY); // Box 0
		bodyModel[514] = new ModelRendererTurbo(this, 100, 14, textureX, textureY); // Box 0
		bodyModel[515] = new ModelRendererTurbo(this, 110, 8, textureX, textureY); // Box 0
		bodyModel[516] = new ModelRendererTurbo(this, 100, 21, textureX, textureY); // Box 0
		bodyModel[517] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Box 0
		bodyModel[518] = new ModelRendererTurbo(this, 93, 12, textureX, textureY); // Box 0
		bodyModel[519] = new ModelRendererTurbo(this, 121, 14, textureX, textureY); // Box 0
		bodyModel[520] = new ModelRendererTurbo(this, 98, 12, textureX, textureY); // Box 0
		bodyModel[521] = new ModelRendererTurbo(this, 311, 59, textureX, textureY); // Box 0
		bodyModel[522] = new ModelRendererTurbo(this, 310, 54, textureX, textureY); // Box 0
		bodyModel[523] = new ModelRendererTurbo(this, 311, 37, textureX, textureY); // Box 805
		bodyModel[524] = new ModelRendererTurbo(this, 310, 41, textureX, textureY); // Box 806
		bodyModel[525] = new ModelRendererTurbo(this, 418, 59, textureX, textureY); // Box 0
		bodyModel[526] = new ModelRendererTurbo(this, 417, 54, textureX, textureY); // Box 0
		bodyModel[527] = new ModelRendererTurbo(this, 418, 37, textureX, textureY); // Box 805
		bodyModel[528] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 806
		bodyModel[529] = new ModelRendererTurbo(this, 245, 45, textureX, textureY); // Box 471
		bodyModel[530] = new ModelRendererTurbo(this, 246, 39, textureX, textureY); // Box 468
		bodyModel[531] = new ModelRendererTurbo(this, 244, 42, textureX, textureY); // Box 470
		bodyModel[532] = new ModelRendererTurbo(this, 239, 49, textureX, textureY); // Box 88
		bodyModel[533] = new ModelRendererTurbo(this, 275, 45, textureX, textureY); // Box 404
		bodyModel[534] = new ModelRendererTurbo(this, 271, 43, textureX, textureY); // Box 612
		bodyModel[535] = new ModelRendererTurbo(this, 501, 80, textureX, textureY); // Box 31 HEP plug
		bodyModel[536] = new ModelRendererTurbo(this, 505, 85, textureX, textureY); // Box 31 HEP plug
		bodyModel[537] = new ModelRendererTurbo(this, 505, 95, textureX, textureY); // Box 515 HEP plug
		bodyModel[538] = new ModelRendererTurbo(this, 501, 90, textureX, textureY); // Box 516 HEP plug
		bodyModel[539] = new ModelRendererTurbo(this, 485, 122, textureX, textureY); // Box 0
		bodyModel[540] = new ModelRendererTurbo(this, 482, 130, textureX, textureY); // Box 0
		bodyModel[541] = new ModelRendererTurbo(this, 483, 112, textureX, textureY); // Box 757
		bodyModel[542] = new ModelRendererTurbo(this, 480, 104, textureX, textureY); // Box 0
		bodyModel[543] = new ModelRendererTurbo(this, 485, 104, textureX, textureY); // Box 0
		bodyModel[544] = new ModelRendererTurbo(this, 479, 160, textureX, textureY); // Box 0
		bodyModel[545] = new ModelRendererTurbo(this, 463, 127, textureX, textureY); // Box 0
		bodyModel[546] = new ModelRendererTurbo(this, 461, 117, textureX, textureY); // Box 0
		bodyModel[547] = new ModelRendererTurbo(this, 474, 126, textureX, textureY); // Box 0
		bodyModel[548] = new ModelRendererTurbo(this, 466, 136, textureX, textureY); // Box 0
		bodyModel[549] = new ModelRendererTurbo(this, 485, 141, textureX, textureY); // Box 0
		bodyModel[550] = new ModelRendererTurbo(this, 484, 177, textureX, textureY); // Box 0
		bodyModel[551] = new ModelRendererTurbo(this, 464, 151, textureX, textureY); // Box 0
		bodyModel[552] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 0
		bodyModel[553] = new ModelRendererTurbo(this, 467, 109, textureX, textureY); // Box 0
		bodyModel[554] = new ModelRendererTurbo(this, 460, 110, textureX, textureY); // Box 0
		bodyModel[555] = new ModelRendererTurbo(this, 469, 113, textureX, textureY); // Box 0
		bodyModel[556] = new ModelRendererTurbo(this, 462, 104, textureX, textureY); // Box 0
		bodyModel[557] = new ModelRendererTurbo(this, 471, 104, textureX, textureY); // Box 0
		bodyModel[558] = new ModelRendererTurbo(this, 472, 123, textureX, textureY); // Box 0
		bodyModel[559] = new ModelRendererTurbo(this, 472, 120, textureX, textureY); // Box 0
		bodyModel[560] = new ModelRendererTurbo(this, 462, 162, textureX, textureY); // Box 0
		bodyModel[561] = new ModelRendererTurbo(this, 222, 203, textureX, textureY); // Box 0
		bodyModel[562] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Box 0
		bodyModel[563] = new ModelRendererTurbo(this, 216, 227, textureX, textureY); // Box 0
		bodyModel[564] = new ModelRendererTurbo(this, 365, 326, textureX, textureY); // Box 0
		bodyModel[565] = new ModelRendererTurbo(this, 370, 260, textureX, textureY); // Box 835
		bodyModel[566] = new ModelRendererTurbo(this, 271, 55, textureX, textureY); // Box 404 she wheel on my antenna till i wagon
		bodyModel[567] = new ModelRendererTurbo(this, 270, 56, textureX, textureY); // Box 405 she wheel on my antenna till i wagon
		bodyModel[568] = new ModelRendererTurbo(this, 257, 60, textureX, textureY); // box horn wpsr
		bodyModel[569] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // box horn wpsr
		bodyModel[570] = new ModelRendererTurbo(this, 257, 54, textureX, textureY); // box horn wpsr
		bodyModel[571] = new ModelRendererTurbo(this, 266, 57, textureX, textureY); // box horn mount
		bodyModel[572] = new ModelRendererTurbo(this, 319, 83, textureX, textureY); // Box 348
		bodyModel[573] = new ModelRendererTurbo(this, 266, 42, textureX, textureY); // Box 88
		bodyModel[574] = new ModelRendererTurbo(this, 255, 42, textureX, textureY); // Box 88
		bodyModel[575] = new ModelRendererTurbo(this, 148, 109, textureX, textureY); // Box 0
		bodyModel[576] = new ModelRendererTurbo(this, 148, 83, textureX, textureY); // Box 566
		bodyModel[577] = new ModelRendererTurbo(this, 163, 109, textureX, textureY); // Box 0
		bodyModel[578] = new ModelRendererTurbo(this, 163, 83, textureX, textureY); // Box 566
		bodyModel[579] = new ModelRendererTurbo(this, 272, 45, textureX, textureY); // Box 404
		bodyModel[580] = new ModelRendererTurbo(this, 20, 169, textureX, textureY); // Box 0
		bodyModel[581] = new ModelRendererTurbo(this, 12, 158, textureX, textureY); // Rear door
		bodyModel[582] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 0
		bodyModel[583] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 0
		bodyModel[584] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 0
		bodyModel[585] = new ModelRendererTurbo(this, 20, 109, textureX, textureY); // Box 0
		bodyModel[586] = new ModelRendererTurbo(this, 10, 83, textureX, textureY); // Box 0
		bodyModel[587] = new ModelRendererTurbo(this, 12, 89, textureX, textureY); // Box 0
		bodyModel[588] = new ModelRendererTurbo(this, 1, 87, textureX, textureY); // Box 103
		bodyModel[589] = new ModelRendererTurbo(this, 17, 146, textureX, textureY); // Box 99
		bodyModel[590] = new ModelRendererTurbo(this, 10, 129, textureX, textureY); // Box 99
		bodyModel[591] = new ModelRendererTurbo(this, 1, 127, textureX, textureY); // Box 94
		bodyModel[592] = new ModelRendererTurbo(this, 10, 109, textureX, textureY); // Box 80
		bodyModel[593] = new ModelRendererTurbo(this, 5, 146, textureX, textureY); // Box 108
		bodyModel[594] = new ModelRendererTurbo(this, 2, 140, textureX, textureY); // Box 128
		bodyModel[595] = new ModelRendererTurbo(this, 20, 152, textureX, textureY); // Box 128
		bodyModel[596] = new ModelRendererTurbo(this, 2, 152, textureX, textureY); // Box 99
		bodyModel[597] = new ModelRendererTurbo(this, 31, 117, textureX, textureY); // Box 128
		bodyModel[598] = new ModelRendererTurbo(this, 45, 117, textureX, textureY); // Box 128
		bodyModel[599] = new ModelRendererTurbo(this, 2, 115, textureX, textureY); // Box 128
		bodyModel[600] = new ModelRendererTurbo(this, 24, 117, textureX, textureY); // Box 128
		bodyModel[601] = new ModelRendererTurbo(this, 38, 117, textureX, textureY); // Box 128
		bodyModel[602] = new ModelRendererTurbo(this, 52, 115, textureX, textureY); // Box 128
		bodyModel[603] = new ModelRendererTurbo(this, 9, 157, textureX, textureY, "headlight_1_f"); // backing light type 1 front
		bodyModel[604] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, "headlight_3_f"); // backing light type 3 front
		bodyModel[605] = new ModelRendererTurbo(this, 14, 153, textureX, textureY, "headlight_2_f"); // backing light type 1 front
		bodyModel[606] = new ModelRendererTurbo(this, 28, 161, textureX, textureY); // Box 31 HEP plug
		bodyModel[607] = new ModelRendererTurbo(this, 23, 164, textureX, textureY); // Box 31 HEP plug
		bodyModel[608] = new ModelRendererTurbo(this, 0, 161, textureX, textureY); // Box 515 HEP plug
		bodyModel[609] = new ModelRendererTurbo(this, 5, 164, textureX, textureY); // Box 516 HEP plug
		bodyModel[610] = new ModelRendererTurbo(this, 96, 266, textureX, textureY); // Box 389
		bodyModel[611] = new ModelRendererTurbo(this, 96, 261, textureX, textureY); // Box 389
		bodyModel[612] = new ModelRendererTurbo(this, 98, 257, textureX, textureY); // Box 0
		bodyModel[613] = new ModelRendererTurbo(this, 115, 260, textureX, textureY); // Box 0
		bodyModel[614] = new ModelRendererTurbo(this, 114, 256, textureX, textureY); // Box 389
		bodyModel[615] = new ModelRendererTurbo(this, 115, 265, textureX, textureY); // Box 0
		bodyModel[616] = new ModelRendererTurbo(this, 107, 263, textureX, textureY); // Box 0
		bodyModel[617] = new ModelRendererTurbo(this, 110, 258, textureX, textureY); // Box 0
		bodyModel[618] = new ModelRendererTurbo(this, 102, 258, textureX, textureY); // Box 279
		bodyModel[619] = new ModelRendererTurbo(this, 106, 256, textureX, textureY, "gauges"); // Box 0
		bodyModel[620] = new ModelRendererTurbo(this, 107, 259, textureX, textureY); // Box 0
		bodyModel[621] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 61
		bodyModel[622] = new ModelRendererTurbo(this, 96, 163, textureX, textureY); // Box 62
		bodyModel[623] = new ModelRendererTurbo(this, 105, 157, textureX, textureY, "cull"); // Box 64 cull
		bodyModel[624] = new ModelRendererTurbo(this, 96, 103, textureX, textureY); // Box 635
		bodyModel[625] = new ModelRendererTurbo(this, 96, 109, textureX, textureY); // Box 636
		bodyModel[626] = new ModelRendererTurbo(this, 105, 103, textureX, textureY); // Box 637
		bodyModel[627] = new ModelRendererTurbo(this, 44, 158, textureX, textureY); // Box 61
		bodyModel[628] = new ModelRendererTurbo(this, 44, 164, textureX, textureY); // Box 62
		bodyModel[629] = new ModelRendererTurbo(this, 53, 157, textureX, textureY, "cull"); // Box 64 cull
		bodyModel[630] = new ModelRendererTurbo(this, 44, 104, textureX, textureY); // Box 641
		bodyModel[631] = new ModelRendererTurbo(this, 44, 110, textureX, textureY); // Box 642
		bodyModel[632] = new ModelRendererTurbo(this, 53, 103, textureX, textureY); // Box 643
		bodyModel[633] = new ModelRendererTurbo(this, 50, 88, textureX, textureY); // Box 108
		bodyModel[634] = new ModelRendererTurbo(this, 40, 88, textureX, textureY); // Box 109
		bodyModel[635] = new ModelRendererTurbo(this, 50, 142, textureX, textureY); // Box 69
		bodyModel[636] = new ModelRendererTurbo(this, 40, 142, textureX, textureY); // Box 70
		bodyModel[637] = new ModelRendererTurbo(this, 43, 149, textureX, textureY); // Box 120
		bodyModel[638] = new ModelRendererTurbo(this, 43, 95, textureX, textureY); // Box 481
		bodyModel[639] = new ModelRendererTurbo(this, 75, 167, textureX, textureY); // Box 348
		bodyModel[640] = new ModelRendererTurbo(this, 75, 176, textureX, textureY); // Box 348
		bodyModel[641] = new ModelRendererTurbo(this, 70, 167, textureX, textureY); // Box 348
		bodyModel[642] = new ModelRendererTurbo(this, 70, 176, textureX, textureY); // Box 348
		bodyModel[643] = new ModelRendererTurbo(this, 75, 113, textureX, textureY); // Box 656
		bodyModel[644] = new ModelRendererTurbo(this, 75, 122, textureX, textureY); // Box 657
		bodyModel[645] = new ModelRendererTurbo(this, 70, 113, textureX, textureY); // Box 658
		bodyModel[646] = new ModelRendererTurbo(this, 70, 122, textureX, textureY); // Box 659
		bodyModel[647] = new ModelRendererTurbo(this, 127, 167, textureX, textureY); // Box 348
		bodyModel[648] = new ModelRendererTurbo(this, 127, 176, textureX, textureY); // Box 348
		bodyModel[649] = new ModelRendererTurbo(this, 122, 167, textureX, textureY); // Box 348
		bodyModel[650] = new ModelRendererTurbo(this, 122, 176, textureX, textureY); // Box 348
		bodyModel[651] = new ModelRendererTurbo(this, 127, 113, textureX, textureY); // Box 656
		bodyModel[652] = new ModelRendererTurbo(this, 127, 122, textureX, textureY); // Box 657
		bodyModel[653] = new ModelRendererTurbo(this, 122, 113, textureX, textureY); // Box 658
		bodyModel[654] = new ModelRendererTurbo(this, 122, 122, textureX, textureY); // Box 659
		bodyModel[655] = new ModelRendererTurbo(this, 162, 260, textureX, textureY); // Box 183
		bodyModel[656] = new ModelRendererTurbo(this, 162, 315, textureX, textureY); // Box 431

		bodyModel[500].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[500].setRotationPoint(-9F, -20F, -8F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 177
		bodyModel[501].setRotationPoint(-10F, -19F, -2.5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 780
		bodyModel[502].setRotationPoint(-10F, -19F, -8.5F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.415F, -0.5F, 0F, -0.415F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 177
		bodyModel[503].setRotationPoint(-10F, -20F, -8F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, -0.085F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 177
		bodyModel[504].setRotationPoint(-10F, -20F, -2.5F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[505].setRotationPoint(-10F, -18F, 1F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[506].setRotationPoint(-10F, -18F, 2F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -5F, 0F, -0.5F); // Box 785
		bodyModel[507].setRotationPoint(-15F, -18F, -9F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 785
		bodyModel[508].setRotationPoint(-10F, -18F, -7.5F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 785
		bodyModel[509].setRotationPoint(-10F, -18F, -9F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 394
		bodyModel[510].setRotationPoint(-1F, -15F, -2.5F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.165F, 0F, 0F, 0F, 0F, 0F, -0.165F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[511].setRotationPoint(-1.25F, -15F, -4F);
		bodyModel[511].rotateAngleY = 0.78539816F;

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[512].setRotationPoint(0.5F, -15F, -4F);
		bodyModel[512].rotateAngleY = 0.78539816F;

		bodyModel[513].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[513].setRotationPoint(-1.25F, -7.7F, -3.29F);
		bodyModel[513].rotateAngleX = -0.78539816F;

		bodyModel[514].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[514].setRotationPoint(-5F, -3.55F, -2.75F);
		bodyModel[514].rotateAngleX = -0.78539816F;

		bodyModel[515].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,0.005F, 0F, 0.005F, 0F, 0F, 0F, 0.01F, 0F, 0.01F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 0
		bodyModel[515].setRotationPoint(-1.25F, -6F, -3.29F);
		bodyModel[515].rotateAngleX = 0.15707963F;
		bodyModel[515].rotateAngleY = 0.78539816F;
		bodyModel[515].rotateAngleZ = 0.15707963F;

		bodyModel[516].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, -0.5F, 0F, -0.23F, -0.5F); // Box 0
		bodyModel[516].setRotationPoint(-4F, -0.77F, -3.5F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[517].setRotationPoint(-4.1F, -9F, -6F);
		bodyModel[517].rotateAngleY = 0.78539816F;

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.42F, 0F, 0F, -0.29F, 0F, -0.275F, 0F, 0F, -1F, 0F, -1.575F, -1.6F, 0.42F, -1.575F, -1.6F, -0.29F, -2F, 1F, 0F, -1.575F, 0.6F); // Box 0
		bodyModel[518].setRotationPoint(-4.81F, -4F, -5.3F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -0.5F, -0.28F, -0.5F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 0
		bodyModel[519].setRotationPoint(0.5F, -7F, -4F);
		bodyModel[519].rotateAngleY = 0.78539816F;

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.71F, 0F, 0.7F, 0.42F, 0F, 0F, 0.42F, 0F, -1F, 0F, 0F, -1F, -0.71F, -1.125F, -1.125F, 0.42F, -1.575F, -1.6F, 0.42F, -1.575F, 0.6F, 0F, -1.575F, 0.6F); // Box 0
		bodyModel[520].setRotationPoint(-4.81F, -4F, -5.3F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, -0.425F, -0.05F, 0F, -0.425F, -0.05F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[521].setRotationPoint(-10F, -20F, -10F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[522].setRotationPoint(-10F, -20.5F, -8F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.425F, -0.05F, 0F, -0.425F, -0.05F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 805
		bodyModel[523].setRotationPoint(-10F, -20F, 8F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 806
		bodyModel[524].setRotationPoint(-10F, -20.5F, 5F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, -0.425F, -0.05F, 0F, -0.425F, -0.05F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[525].setRotationPoint(34F, -20F, -10F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[526].setRotationPoint(34F, -20.5F, -8F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.425F, -0.05F, 0F, -0.425F, -0.05F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 805
		bodyModel[527].setRotationPoint(34F, -20F, 8F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 806
		bodyModel[528].setRotationPoint(34F, -20.5F, 5F);

		bodyModel[529].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 471
		bodyModel[529].setRotationPoint(-48F, -22.5F, -0.5F);

		bodyModel[530].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 468
		bodyModel[530].setRotationPoint(-47F, -22.5F, 1.5F);

		bodyModel[531].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 470
		bodyModel[531].setRotationPoint(-46F, -22.5F, 0.5F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[532].setRotationPoint(-46F, -22.5F, -1.5F);

		bodyModel[533].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 404
		bodyModel[533].setRotationPoint(-39.5F, -23F, 0F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		bodyModel[534].setRotationPoint(-40.5F, -21.33F, 6F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 31 HEP plug
		bodyModel[535].setRotationPoint(57F, -0.25F, -9F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 31 HEP plug
		bodyModel[536].setRotationPoint(57F, -0.25F, -7F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 515 HEP plug
		bodyModel[537].setRotationPoint(57F, -0.25F, 7F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 516 HEP plug
		bodyModel[538].setRotationPoint(57F, -0.25F, 5F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[539].setRotationPoint(48F, -20F, -2F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[540].setRotationPoint(48F, -20F, -8F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 757
		bodyModel[541].setRotationPoint(48F, -20F, 2F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 0
		bodyModel[542].setRotationPoint(48.27F, -21.5F, 1F);
		bodyModel[542].rotateAngleY = -0.78539816F;

		bodyModel[543].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 0
		bodyModel[543].setRotationPoint(50.15F, -21.5F, -2F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 4, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		bodyModel[544].setRotationPoint(47F, -5F, -3F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[545].setRotationPoint(48F, -6F, 6F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[546].setRotationPoint(46F, -6F, 6F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[547].setRotationPoint(50F, -6F, 6F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,1F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, -2F, 1F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		bodyModel[548].setRotationPoint(47F, -8F, -3F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,-1F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, -2F, -1F, 0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		bodyModel[549].setRotationPoint(49F, -8F, -3F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 0
		bodyModel[550].setRotationPoint(48F, -8.25F, -3F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[551].setRotationPoint(48F, -9.25F, -3F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[552].setRotationPoint(47F, -10.25F, 5.99F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[553].setRotationPoint(47F, -11.25F, 5.99F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[554].setRotationPoint(47.85F, -11.1F, 2F);
		bodyModel[554].rotateAngleZ = -0.78539816F;

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[555].setRotationPoint(50.15F, -11.1F, 2F);
		bodyModel[555].rotateAngleZ = -0.78539816F;

		bodyModel[556].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[556].setRotationPoint(47.85F, -11.45F, 6.04F);
		bodyModel[556].rotateAngleZ = -0.78539816F;

		bodyModel[557].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[557].setRotationPoint(50.15F, -11.45F, 6F);
		bodyModel[557].rotateAngleZ = -0.78539816F;

		bodyModel[558].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[558].setRotationPoint(47F, -10.25F, 1F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[559].setRotationPoint(47F, -11.25F, 1F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 0, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		bodyModel[560].setRotationPoint(52.25F, -8F, -3F);

		bodyModel[561].addBox(0F, 0F, 0F, 1, 6, 16, 0F); // Box 0
		bodyModel[561].setRotationPoint(3.5F, 3F, -8F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[562].setRotationPoint(4.5F, 8F, -10F);

		bodyModel[563].addBox(0F, 0F, 0F, 2, 5, 20, 0F); // Box 0
		bodyModel[563].setRotationPoint(4.5F, 3F, -10F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.47F, 0F, 0F, -0.47F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.47F, 0F, 0F, -0.47F); // Box 0
		bodyModel[564].setRotationPoint(4F, -9.79F, -3.37F);
		bodyModel[564].rotateAngleX = -0.78539816F;

		bodyModel[565].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -0.47F, 0F, 0F, -0.47F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.47F, 0F, 0F, -0.47F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 835
		bodyModel[565].setRotationPoint(-11.5F, -8.38F, 1.96F);
		bodyModel[565].rotateAngleX = 0.78539816F;

		bodyModel[566].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 404 she wheel on my antenna till i wagon
		bodyModel[566].setRotationPoint(-38.5F, -24F, -4F);

		bodyModel[567].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 405 she wheel on my antenna till i wagon
		bodyModel[567].setRotationPoint(-40F, -22F, -6F);

		bodyModel[568].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // box horn wpsr
		bodyModel[568].setRotationPoint(-40.75F, -22.45F, 4.25F);

		bodyModel[569].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // box horn wpsr
		bodyModel[569].setRotationPoint(-38.5F, -22.2F, 5.25F);

		bodyModel[570].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // box horn wpsr
		bodyModel[570].setRotationPoint(-40.25F, -21.95F, 6.25F);

		bodyModel[571].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // box horn mount
		bodyModel[571].setRotationPoint(-38.5F, -21.2F, 5.25F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -2F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.125F, 0F, -2F, -0.125F, -2F, 0.05F, -0.01F, 2F, 0.05F, -0.01F, 2F, 0.05F, -0.125F, -2F, 0.05F, -0.125F); // Box 348
		bodyModel[572].setRotationPoint(38F, -17F, 10F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 88
		bodyModel[573].setRotationPoint(-46F, -21.5F, 0F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[574].setRotationPoint(-48.5F, -22.5F, 0F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -7F, 0F, -3F, -7F, 0F, -3F, -7F, 0.02F, 0F, -7F, 0.02F); // Box 0
		bodyModel[575].setRotationPoint(-5F, -10F, -11.01F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F,0F, 0F, 0.02F, -3F, 0F, 0.02F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0.02F, -3F, -7F, 0.02F, -3F, -7F, 0F, 0F, -7F, 0F); // Box 566
		bodyModel[576].setRotationPoint(-5F, -10F, 10.01F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -7F, 0F, -3F, -7F, 0F, -3F, -7F, 0.02F, 0F, -7F, 0.02F); // Box 0
		bodyModel[577].setRotationPoint(8F, -10F, -11.01F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F,0F, 0F, 0.02F, -3F, 0F, 0.02F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0.02F, -3F, -7F, 0.02F, -3F, -7F, 0F, 0F, -7F, 0F); // Box 566
		bodyModel[578].setRotationPoint(8F, -10F, 10.01F);

		bodyModel[579].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 404
		bodyModel[579].setRotationPoint(-43.5F, -23F, 0F);

		bodyModel[580].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 0
		bodyModel[580].setRotationPoint(-57F, -14F, -10F);

		bodyModel[581].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Rear door
		bodyModel[581].setRotationPoint(-57F, -14F, -2F);

		bodyModel[582].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 0
		bodyModel[582].setRotationPoint(-57F, -14F, 2F);

		bodyModel[583].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 0
		bodyModel[583].setRotationPoint(-57F, -18F, -10F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[584].setRotationPoint(-57F, -19F, -8F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[585].setRotationPoint(-57F, -19F, -10F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[586].setRotationPoint(-57F, -20F, -2F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[587].setRotationPoint(-57F, -20F, -8F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[588].setRotationPoint(-57F, -20F, 2F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[589].setRotationPoint(-57F, 2F, -5F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[590].setRotationPoint(-57F, 2F, -9F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 94
		bodyModel[591].setRotationPoint(-57F, 2F, 5F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[592].setRotationPoint(-57F, -19F, 8F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[593].setRotationPoint(-57F, 2F, 3F);

		bodyModel[594].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Box 128
		bodyModel[594].setRotationPoint(-59F, 1F, -5F);

		bodyModel[595].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 128
		bodyModel[595].setRotationPoint(-59F, 2F, -5F);

		bodyModel[596].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 99
		bodyModel[596].setRotationPoint(-59F, 2F, 4F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[597].setRotationPoint(-58.5F, -15F, 3F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[598].setRotationPoint(-58.5F, -15F, -3.5F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[599].setRotationPoint(-58.5F, -15.5F, -3.5F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[600].setRotationPoint(-59F, -14F, 3F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[601].setRotationPoint(-59F, -14F, -5F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[602].setRotationPoint(-59F, -16F, -5F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1 front
		bodyModel[603].setRotationPoint(-57.5F, -9F, 7F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 3 front
		bodyModel[604].setRotationPoint(-57.5F, -9F, -9F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1 front
		bodyModel[605].setRotationPoint(-57.5F, -18.5F, -1F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 31 HEP plug
		bodyModel[606].setRotationPoint(-57.5F, -0.25F, -9F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 31 HEP plug
		bodyModel[607].setRotationPoint(-57.5F, -0.25F, -7F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 515 HEP plug
		bodyModel[608].setRotationPoint(-57.5F, -0.25F, 7F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 516 HEP plug
		bodyModel[609].setRotationPoint(-57.5F, -0.25F, 5F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[610].setRotationPoint(-49F, -9F, 6F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 389
		bodyModel[611].setRotationPoint(-48.25F, -9.5F, 6.75F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[612].setRotationPoint(-49.35F, -10.75F, 6.75F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[613].setRotationPoint(-49.35F, -11.75F, 8.5F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 389
		bodyModel[614].setRotationPoint(-49.23F, -11.5F, 6.75F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 0
		bodyModel[615].setRotationPoint(-49.67F, -9F, 8.87F);
		bodyModel[615].rotateAngleY = -0.78539816F;

		bodyModel[616].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[616].setRotationPoint(-49.35F, -12F, 7.5F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[617].setRotationPoint(-49.35F, -14F, 6F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.5F, -0.5F, 0.75F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 279
		bodyModel[618].setRotationPoint(-49.35F, -14F, 8.5F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0.375F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[619].setRotationPoint(-49.59F, -13.25F, 7F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[620].setRotationPoint(-49.35F, -14F, 7.5F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[621].setRotationPoint(16F, -18F, -12F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 62
		bodyModel[622].setRotationPoint(16F, -14F, -12F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,0F, 0F, -0.5F, -10F, 0F, -0.5F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -10F, 0F, -0.5F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 64 cull
		bodyModel[623].setRotationPoint(19F, -18F, -12F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F); // Box 635
		bodyModel[624].setRotationPoint(16F, -18F, 11F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 636
		bodyModel[625].setRotationPoint(16F, -14F, 11F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 637
		bodyModel[626].setRotationPoint(19F, -18F, 11F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[627].setRotationPoint(-28F, -18F, -12F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 62
		bodyModel[628].setRotationPoint(-28F, -14F, -12F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,0F, 0F, -0.5F, -10F, 0F, -0.5F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -10F, 0F, -0.5F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 64 cull
		bodyModel[629].setRotationPoint(-25F, -18F, -12F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F); // Box 641
		bodyModel[630].setRotationPoint(-28F, -18F, 11F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 642
		bodyModel[631].setRotationPoint(-28F, -14F, 11F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 643
		bodyModel[632].setRotationPoint(-25F, -18F, 11F);

		bodyModel[633].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 108
		bodyModel[633].setRotationPoint(57F, -11F, 11F);

		bodyModel[634].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 109
		bodyModel[634].setRotationPoint(54F, -11F, 11F);

		bodyModel[635].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 69
		bodyModel[635].setRotationPoint(57F, -11F, -12F);

		bodyModel[636].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 70
		bodyModel[636].setRotationPoint(54F, -11F, -12F);

		bodyModel[637].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 120
		bodyModel[637].setRotationPoint(54F, 2F, -11F);

		bodyModel[638].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 481
		bodyModel[638].setRotationPoint(54F, 2F, 11F);

		bodyModel[639].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[639].setRotationPoint(-24F, -18F, -10F);

		bodyModel[640].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 348
		bodyModel[640].setRotationPoint(-24F, -11F, -10F);

		bodyModel[641].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 348
		bodyModel[641].setRotationPoint(-25F, -18F, -10F);

		bodyModel[642].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 348
		bodyModel[642].setRotationPoint(-25F, -11F, -10F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 656
		bodyModel[643].setRotationPoint(-24F, -18F, 9F);

		bodyModel[644].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 657
		bodyModel[644].setRotationPoint(-24F, -11F, 9F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 658
		bodyModel[645].setRotationPoint(-25F, -18F, 9F);

		bodyModel[646].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 659
		bodyModel[646].setRotationPoint(-25F, -11F, 9F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[647].setRotationPoint(20F, -18F, -10F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 348
		bodyModel[648].setRotationPoint(20F, -11F, -10F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 348
		bodyModel[649].setRotationPoint(19F, -18F, -10F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 348
		bodyModel[650].setRotationPoint(19F, -11F, -10F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 656
		bodyModel[651].setRotationPoint(20F, -18F, 9F);

		bodyModel[652].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 657
		bodyModel[652].setRotationPoint(20F, -11F, 9F);

		bodyModel[653].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 658
		bodyModel[653].setRotationPoint(19F, -18F, 9F);

		bodyModel[654].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 659
		bodyModel[654].setRotationPoint(19F, -11F, 9F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 6, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[655].setRotationPoint(-56F, -11F, 9F);

		bodyModel[656].addShapeBox(0F, 0F, 0F, 6, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[656].setRotationPoint(-56F, -11F, -10F);
	}
	ModelAlcoPATruck_new bogie = new ModelAlcoPATruck_new();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
		if (GetColor(entity) == 123456) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/Alco_PA_truck_new_silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-2.31F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4.595F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}else if (GetColor(entity) == 12345) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/Alco_PA_truck_new_silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-2.31F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4.595F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/Alco_PA_truck_new_black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-2.31F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4.595F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}
	}
}