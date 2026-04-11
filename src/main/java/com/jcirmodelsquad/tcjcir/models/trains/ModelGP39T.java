//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GP39T-2
// Model Creator: Bida
// Created on: 28.02.2022 - 07:22:48
// Last changed on: 28.02.2022 - 07:22:48

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelGP39T extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGP39T() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[272];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 17, 102, textureX, textureY); // Box 352
		bodyModel[1] = new ModelRendererTurbo(this, 23, 92, textureX, textureY); // Box 353
		bodyModel[2] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 354
		bodyModel[3] = new ModelRendererTurbo(this, 3, 73, textureX, textureY); // Box 356
		bodyModel[4] = new ModelRendererTurbo(this, 31, 73, textureX, textureY); // Box 357
		bodyModel[5] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 355
		bodyModel[6] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // Box 4
		bodyModel[7] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 2, 7, textureX, textureY); // Box 5
		bodyModel[9] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 266, 92, textureX, textureY); // Box 23
		bodyModel[11] = new ModelRendererTurbo(this, 53, 151, textureX, textureY); // Box 164
		bodyModel[12] = new ModelRendererTurbo(this, 12, 125, textureX, textureY); // Box 3
		bodyModel[13] = new ModelRendererTurbo(this, 1, 151, textureX, textureY); // Box 259
		bodyModel[14] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 262
		bodyModel[15] = new ModelRendererTurbo(this, 53, 160, textureX, textureY); // Box 264
		bodyModel[16] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 265
		bodyModel[17] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 261
		bodyModel[18] = new ModelRendererTurbo(this, 46, 136, textureX, textureY); // Box 143
		bodyModel[19] = new ModelRendererTurbo(this, 13, 137, textureX, textureY); // Box 61
		bodyModel[20] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 63
		bodyModel[21] = new ModelRendererTurbo(this, 37, 132, textureX, textureY); // Box 80
		bodyModel[22] = new ModelRendererTurbo(this, 41, 134, textureX, textureY); // Box 144
		bodyModel[23] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[24] = new ModelRendererTurbo(this, 23, 132, textureX, textureY); // Box 147
		bodyModel[25] = new ModelRendererTurbo(this, 19, 134, textureX, textureY); // Box 148
		bodyModel[26] = new ModelRendererTurbo(this, 14, 137, textureX, textureY); // Box 226
		bodyModel[27] = new ModelRendererTurbo(this, 10, 131, textureX, textureY); // Box 227
		bodyModel[28] = new ModelRendererTurbo(this, 79, 134, textureX, textureY); // Box 271
		bodyModel[29] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 274
		bodyModel[30] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 48
		bodyModel[31] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 296 nose cover
		bodyModel[32] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Box 299 nose cover
		bodyModel[33] = new ModelRendererTurbo(this, 284, 107, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 283, 70, textureX, textureY); // Box 112
		bodyModel[35] = new ModelRendererTurbo(this, 363, 114, textureX, textureY); // Box 113
		bodyModel[36] = new ModelRendererTurbo(this, 357, 114, textureX, textureY); // Box 116
		bodyModel[37] = new ModelRendererTurbo(this, 78, 47, textureX, textureY); // Box 48
		bodyModel[38] = new ModelRendererTurbo(this, 82, 49, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 62, 44, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 104, 37, textureX, textureY, "lamp"); // Box 117 numberboard front
		bodyModel[41] = new ModelRendererTurbo(this, 93, 45, textureX, textureY, "lamp"); // Box 118 numberboard front
		bodyModel[42] = new ModelRendererTurbo(this, 79, 42, textureX, textureY, "lamp"); // Box 186 headlight front up 1
		bodyModel[43] = new ModelRendererTurbo(this, 72, 44, textureX, textureY, "lamp"); // Box 187 headlight front up 2
		bodyModel[44] = new ModelRendererTurbo(this, 104, 12, textureX, textureY); // Box 221
		bodyModel[45] = new ModelRendererTurbo(this, 118, 164, textureX, textureY); // Box 527 cab backpannel
		bodyModel[46] = new ModelRendererTurbo(this, 2, 45, textureX, textureY); // Box 43
		bodyModel[47] = new ModelRendererTurbo(this, 44, 46, textureX, textureY); // Box 43
		bodyModel[48] = new ModelRendererTurbo(this, 75, 54, textureX, textureY); // Box 43
		bodyModel[49] = new ModelRendererTurbo(this, 119, 61, textureX, textureY); // Box 43
		bodyModel[50] = new ModelRendererTurbo(this, 119, 64, textureX, textureY); // Box 43
		bodyModel[51] = new ModelRendererTurbo(this, 75, 62, textureX, textureY); // Box 346 nose brake cover
		bodyModel[52] = new ModelRendererTurbo(this, 261, 74, textureX, textureY); // Box 163
		bodyModel[53] = new ModelRendererTurbo(this, 405, 113, textureX, textureY); // Box 166
		bodyModel[54] = new ModelRendererTurbo(this, 429, 94, textureX, textureY); // Box 408
		bodyModel[55] = new ModelRendererTurbo(this, 233, 90, textureX, textureY); // Box 409
		bodyModel[56] = new ModelRendererTurbo(this, 326, 29, textureX, textureY); // Box 19 the hooh
		bodyModel[57] = new ModelRendererTurbo(this, 478, 84, textureX, textureY); // Box 31
		bodyModel[58] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 247 headlight rear 2 beam
		bodyModel[59] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 248 headlight rear 2 beam
		bodyModel[60] = new ModelRendererTurbo(this, 335, 22, textureX, textureY); // Box 285
		bodyModel[61] = new ModelRendererTurbo(this, 335, 15, textureX, textureY); // Box 286
		bodyModel[62] = new ModelRendererTurbo(this, 389, 15, textureX, textureY); // Box 101
		bodyModel[63] = new ModelRendererTurbo(this, 420, 15, textureX, textureY); // Box 104
		bodyModel[64] = new ModelRendererTurbo(this, 354, 15, textureX, textureY); // Box 105 dynamics special
		bodyModel[65] = new ModelRendererTurbo(this, 389, 22, textureX, textureY); // Box 284
		bodyModel[66] = new ModelRendererTurbo(this, 354, 22, textureX, textureY); // Box 285 dynamics special
		bodyModel[67] = new ModelRendererTurbo(this, 420, 22, textureX, textureY); // Box 286
		bodyModel[68] = new ModelRendererTurbo(this, 317, 116, textureX, textureY); // Box 36
		bodyModel[69] = new ModelRendererTurbo(this, 302, 55, textureX, textureY); // Box 271
		bodyModel[70] = new ModelRendererTurbo(this, 302, 50, textureX, textureY); // Box 272
		bodyModel[71] = new ModelRendererTurbo(this, 308, 38, textureX, textureY); // Box 270
		bodyModel[72] = new ModelRendererTurbo(this, 264, 123, textureX, textureY); // Box 63
		bodyModel[73] = new ModelRendererTurbo(this, 264, 76, textureX, textureY); // Box 170
		bodyModel[74] = new ModelRendererTurbo(this, 51, 18, textureX, textureY); // Box 52 door swing right
		bodyModel[75] = new ModelRendererTurbo(this, 83, 4, textureX, textureY); // Box 70
		bodyModel[76] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 72
		bodyModel[77] = new ModelRendererTurbo(this, 30, 6, textureX, textureY); // Box 190
		bodyModel[78] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 313
		bodyModel[79] = new ModelRendererTurbo(this, 69, 18, textureX, textureY); // Box 314 door swing right
		bodyModel[80] = new ModelRendererTurbo(this, 101, 23, textureX, textureY); // Box 316
		bodyModel[81] = new ModelRendererTurbo(this, 93, 37, textureX, textureY); // Box 11
		bodyModel[82] = new ModelRendererTurbo(this, 27, 37, textureX, textureY); // Box 210
		bodyModel[83] = new ModelRendererTurbo(this, 66, 23, textureX, textureY); // Box 211
		bodyModel[84] = new ModelRendererTurbo(this, 34, 23, textureX, textureY); // Box 219
		bodyModel[85] = new ModelRendererTurbo(this, 119, 6, textureX, textureY); // Box 220
		bodyModel[86] = new ModelRendererTurbo(this, 104, 4, textureX, textureY); // Box 222
		bodyModel[87] = new ModelRendererTurbo(this, 34, 41, textureX, textureY); // Box 223
		bodyModel[88] = new ModelRendererTurbo(this, 86, 41, textureX, textureY); // Box 224
		bodyModel[89] = new ModelRendererTurbo(this, 285, 114, textureX, textureY); // Box 129
		bodyModel[90] = new ModelRendererTurbo(this, 428, 65, textureX, textureY); // Box 130
		bodyModel[91] = new ModelRendererTurbo(this, 282, 114, textureX, textureY); // Box 133
		bodyModel[92] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 134
		bodyModel[93] = new ModelRendererTurbo(this, 300, 114, textureX, textureY); // Box 192
		bodyModel[94] = new ModelRendererTurbo(this, 297, 114, textureX, textureY); // Box 193
		bodyModel[95] = new ModelRendererTurbo(this, 443, 65, textureX, textureY); // Box 194
		bodyModel[96] = new ModelRendererTurbo(this, 440, 65, textureX, textureY); // Box 195
		bodyModel[97] = new ModelRendererTurbo(this, 312, 114, textureX, textureY); // Box 196
		bodyModel[98] = new ModelRendererTurbo(this, 360, 114, textureX, textureY); // Box 197
		bodyModel[99] = new ModelRendererTurbo(this, 368, 67, textureX, textureY); // Box 198
		bodyModel[100] = new ModelRendererTurbo(this, 323, 67, textureX, textureY); // Box 199
		bodyModel[101] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 200
		bodyModel[102] = new ModelRendererTurbo(this, 371, 67, textureX, textureY); // Box 201
		bodyModel[103] = new ModelRendererTurbo(this, 248, 81, textureX, textureY); // Box 4
		bodyModel[104] = new ModelRendererTurbo(this, 449, 72, textureX, textureY); // Box 203
		bodyModel[105] = new ModelRendererTurbo(this, 242, 156, textureX, textureY); // Box 489
		bodyModel[106] = new ModelRendererTurbo(this, 218, 213, textureX, textureY); // Box 278
		bodyModel[107] = new ModelRendererTurbo(this, 219, 218, textureX, textureY); // Box 281
		bodyModel[108] = new ModelRendererTurbo(this, 246, 182, textureX, textureY); // Box 288
		bodyModel[109] = new ModelRendererTurbo(this, 304, 213, textureX, textureY); // Box 315
		bodyModel[110] = new ModelRendererTurbo(this, 305, 218, textureX, textureY); // Box 316
		bodyModel[111] = new ModelRendererTurbo(this, 256, 172, textureX, textureY); // Box 19
		bodyModel[112] = new ModelRendererTurbo(this, 248, 138, textureX, textureY); // Box 559
		bodyModel[113] = new ModelRendererTurbo(this, 300, 172, textureX, textureY); // Box 560
		bodyModel[114] = new ModelRendererTurbo(this, 220, 208, textureX, textureY); // Box 562
		bodyModel[115] = new ModelRendererTurbo(this, 306, 208, textureX, textureY); // Box 563
		bodyModel[116] = new ModelRendererTurbo(this, 301, 186, textureX, textureY); // Box 564
		bodyModel[117] = new ModelRendererTurbo(this, 329, 198, textureX, textureY); // Box 565
		bodyModel[118] = new ModelRendererTurbo(this, 297, 160, textureX, textureY); // Box 566
		bodyModel[119] = new ModelRendererTurbo(this, 328, 193, textureX, textureY); // Box 567
		bodyModel[120] = new ModelRendererTurbo(this, 297, 140, textureX, textureY); // Box 568
		bodyModel[121] = new ModelRendererTurbo(this, 328, 166, textureX, textureY); // Box 569
		bodyModel[122] = new ModelRendererTurbo(this, 329, 160, textureX, textureY); // Box 570
		bodyModel[123] = new ModelRendererTurbo(this, 215, 186, textureX, textureY); // Box 571
		bodyModel[124] = new ModelRendererTurbo(this, 219, 198, textureX, textureY); // Box 572
		bodyModel[125] = new ModelRendererTurbo(this, 211, 160, textureX, textureY); // Box 573
		bodyModel[126] = new ModelRendererTurbo(this, 218, 193, textureX, textureY); // Box 574
		bodyModel[127] = new ModelRendererTurbo(this, 223, 140, textureX, textureY); // Box 575
		bodyModel[128] = new ModelRendererTurbo(this, 219, 160, textureX, textureY); // Box 576
		bodyModel[129] = new ModelRendererTurbo(this, 218, 166, textureX, textureY); // Box 577
		bodyModel[130] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 44
		bodyModel[131] = new ModelRendererTurbo(this, 90, 103, textureX, textureY); // Box 45
		bodyModel[132] = new ModelRendererTurbo(this, 91, 113, textureX, textureY); // Box 56
		bodyModel[133] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 178
		bodyModel[134] = new ModelRendererTurbo(this, 102, 134, textureX, textureY); // Box 61
		bodyModel[135] = new ModelRendererTurbo(this, 54, 127, textureX, textureY); // Box 81
		bodyModel[136] = new ModelRendererTurbo(this, 51, 128, textureX, textureY); // Box 81
		bodyModel[137] = new ModelRendererTurbo(this, 106, 136, textureX, textureY); // Box 174
		bodyModel[138] = new ModelRendererTurbo(this, 11, 128, textureX, textureY); // Box 176
		bodyModel[139] = new ModelRendererTurbo(this, 6, 125, textureX, textureY); // Box 177
		bodyModel[140] = new ModelRendererTurbo(this, 100, 136, textureX, textureY); // Box 191
		bodyModel[141] = new ModelRendererTurbo(this, 99, 125, textureX, textureY); // Box 227
		bodyModel[142] = new ModelRendererTurbo(this, 105, 139, textureX, textureY); // Box 293
		bodyModel[143] = new ModelRendererTurbo(this, 97, 123, textureX, textureY); // Box 258
		bodyModel[144] = new ModelRendererTurbo(this, 65, 55, textureX, textureY); // Box 133
		bodyModel[145] = new ModelRendererTurbo(this, 117, 107, textureX, textureY); // Box 303
		bodyModel[146] = new ModelRendererTurbo(this, 113, 102, textureX, textureY); // Box 304
		bodyModel[147] = new ModelRendererTurbo(this, 112, 107, textureX, textureY); // Box 305
		bodyModel[148] = new ModelRendererTurbo(this, 108, 102, textureX, textureY); // Box 836
		bodyModel[149] = new ModelRendererTurbo(this, 376, 5, textureX, textureY); // Box 278
		bodyModel[150] = new ModelRendererTurbo(this, 306, 1, textureX, textureY); // Box 273
		bodyModel[151] = new ModelRendererTurbo(this, 333, 4, textureX, textureY); // Box 274 gp39/40 exhaust
		bodyModel[152] = new ModelRendererTurbo(this, 340, 3, textureX, textureY); // Box 275
		bodyModel[153] = new ModelRendererTurbo(this, 102, 125, textureX, textureY); // Box 38R
		bodyModel[154] = new ModelRendererTurbo(this, 112, 136, textureX, textureY); // Box 176
		bodyModel[155] = new ModelRendererTurbo(this, 112, 134, textureX, textureY); // Box 313
		bodyModel[156] = new ModelRendererTurbo(this, 177, 134, textureX, textureY); // Box 315
		bodyModel[157] = new ModelRendererTurbo(this, 177, 136, textureX, textureY); // Box 316
		bodyModel[158] = new ModelRendererTurbo(this, 125, 123, textureX, textureY); // Box 306
		bodyModel[159] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 307
		bodyModel[160] = new ModelRendererTurbo(this, 115, 123, textureX, textureY); // Box 868
		bodyModel[161] = new ModelRendererTurbo(this, 42, 133, textureX, textureY); // Box 363
		bodyModel[162] = new ModelRendererTurbo(this, 20, 133, textureX, textureY); // Box 870
		bodyModel[163] = new ModelRendererTurbo(this, 82, 2, textureX, textureY); // box64
		bodyModel[164] = new ModelRendererTurbo(this, 34, 2, textureX, textureY); // box65
		bodyModel[165] = new ModelRendererTurbo(this, 119, 162, textureX, textureY); // Box 412 cs
		bodyModel[166] = new ModelRendererTurbo(this, 96, 164, textureX, textureY); // Box 413 cs
		bodyModel[167] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 86 cs
		bodyModel[168] = new ModelRendererTurbo(this, 107, 149, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[169] = new ModelRendererTurbo(this, 98, 151, textureX, textureY); // Box 307 spedo
		bodyModel[170] = new ModelRendererTurbo(this, 184, 9, textureX, textureY); // Box 114
		bodyModel[171] = new ModelRendererTurbo(this, 184, 6, textureX, textureY); // Box 74
		bodyModel[172] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Box 78
		bodyModel[173] = new ModelRendererTurbo(this, 183, 2, textureX, textureY, "cull"); // Box 1007 cull
		bodyModel[174] = new ModelRendererTurbo(this, 41, 207, textureX, textureY, "cull"); // Box 450 cull
		bodyModel[175] = new ModelRendererTurbo(this, 7, 207, textureX, textureY, "cull"); // Box 451 cull
		bodyModel[176] = new ModelRendererTurbo(this, 357, 219, textureX, textureY, "cull"); // Box 453 cull
		bodyModel[177] = new ModelRendererTurbo(this, 375, 219, textureX, textureY, "cull"); // Box 455 cull
		bodyModel[178] = new ModelRendererTurbo(this, 368, 219, textureX, textureY, "cull"); // Box 479 cull
		bodyModel[179] = new ModelRendererTurbo(this, 26, 204, textureX, textureY, "cull"); // Box 339 cull
		bodyModel[180] = new ModelRendererTurbo(this, 34, 120, textureX, textureY, "cull"); // Box 268 anticlimber
		bodyModel[181] = new ModelRendererTurbo(this, 12, 120, textureX, textureY, "cull"); // Box 269anticlimber
		bodyModel[182] = new ModelRendererTurbo(this, 265, 15, textureX, textureY, "cull"); // Box 378 cull
		bodyModel[183] = new ModelRendererTurbo(this, 191, 42, textureX, textureY); // Box 284
		bodyModel[184] = new ModelRendererTurbo(this, 129, 75, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[185] = new ModelRendererTurbo(this, 131, 70, textureX, textureY); // Box 5
		bodyModel[186] = new ModelRendererTurbo(this, 129, 91, textureX, textureY, "cull"); // Box 1087 cull
		bodyModel[187] = new ModelRendererTurbo(this, 131, 86, textureX, textureY); // Box 1088
		bodyModel[188] = new ModelRendererTurbo(this, 375, 7, textureX, textureY); // Box 317
		bodyModel[189] = new ModelRendererTurbo(this, 165, 51, textureX, textureY); // Box 184 o2 generator
		bodyModel[190] = new ModelRendererTurbo(this, 161, 91, textureX, textureY); // Box 282 antenna plate cull
		bodyModel[191] = new ModelRendererTurbo(this, 149, 30, textureX, textureY); // Box 450
		bodyModel[192] = new ModelRendererTurbo(this, 111, 113, textureX, textureY); // Box 1203
		bodyModel[193] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[194] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[195] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[196] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[197] = new ModelRendererTurbo(this, 18, 41, textureX, textureY); // Box 1251
		bodyModel[198] = new ModelRendererTurbo(this, 264, 38, textureX, textureY); // Box 1252
		bodyModel[199] = new ModelRendererTurbo(this, 255, 46, textureX, textureY); // Box 1253
		bodyModel[200] = new ModelRendererTurbo(this, 253, 40, textureX, textureY); // Box 1254
		bodyModel[201] = new ModelRendererTurbo(this, 255, 34, textureX, textureY); // Box 1255
		bodyModel[202] = new ModelRendererTurbo(this, 257, 37, textureX, textureY); // Box 1256
		bodyModel[203] = new ModelRendererTurbo(this, 257, 43, textureX, textureY); // Box 1257
		bodyModel[204] = new ModelRendererTurbo(this, 265, 42, textureX, textureY); // Box 1258
		bodyModel[205] = new ModelRendererTurbo(this, 266, 12, textureX, textureY); // Box 409 commander base
		bodyModel[206] = new ModelRendererTurbo(this, 266, 8, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[207] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 272
		bodyModel[208] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 273
		bodyModel[209] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 400
		bodyModel[210] = new ModelRendererTurbo(this, 79, 139, textureX, textureY); // Box 401
		bodyModel[211] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 451
		bodyModel[212] = new ModelRendererTurbo(this, 70, 134, textureX, textureY); // Box 452
		bodyModel[213] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 453
		bodyModel[214] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 454
		bodyModel[215] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 394
		bodyModel[216] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 395
		bodyModel[217] = new ModelRendererTurbo(this, 16, 136, textureX, textureY); // Box 559
		bodyModel[218] = new ModelRendererTurbo(this, 133, 168, textureX, textureY); // Box 461 nose stairs hand rail inside your ass
		bodyModel[219] = new ModelRendererTurbo(this, 273, 114, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[220] = new ModelRendererTurbo(this, 440, 22, textureX, textureY); // Box 538 dynamics longy
		bodyModel[221] = new ModelRendererTurbo(this, 440, 15, textureX, textureY); // Box 539 dynamics longy
		bodyModel[222] = new ModelRendererTurbo(this, 48, 128, textureX, textureY); // Box 540
		bodyModel[223] = new ModelRendererTurbo(this, 14, 128, textureX, textureY); // Box 541
		bodyModel[224] = new ModelRendererTurbo(this, 368, 203, textureX, textureY); // Box 365
		bodyModel[225] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 366
		bodyModel[226] = new ModelRendererTurbo(this, 390, 224, textureX, textureY); // Box 299 big radiator
		bodyModel[227] = new ModelRendererTurbo(this, 390, 216, textureX, textureY); // Box 300 big radiator
		bodyModel[228] = new ModelRendererTurbo(this, 417, 208, textureX, textureY); // Box 306
		bodyModel[229] = new ModelRendererTurbo(this, 417, 232, textureX, textureY); // Box 308
		bodyModel[230] = new ModelRendererTurbo(this, 402, 166, textureX, textureY, "cull"); // Box 305 vent cull
		bodyModel[231] = new ModelRendererTurbo(this, 220, 76, textureX, textureY); // Box 567
		bodyModel[232] = new ModelRendererTurbo(this, 482, 75, textureX, textureY); // Box 313 drgw mount
		bodyModel[233] = new ModelRendererTurbo(this, 328, 229, textureX, textureY, "cull"); // Box 202 cull
		bodyModel[234] = new ModelRendererTurbo(this, 303, 226, textureX, textureY, "cull"); // Box 364 cull
		bodyModel[235] = new ModelRendererTurbo(this, 437, 137, textureX, textureY); // Box 571
		bodyModel[236] = new ModelRendererTurbo(this, 429, 117, textureX, textureY, "cull"); // Box 80 cull handrails
		bodyModel[237] = new ModelRendererTurbo(this, 372, 169, textureX, textureY, "cull"); // Box 288 cull stairs
		bodyModel[238] = new ModelRendererTurbo(this, 386, 169, textureX, textureY, "cull"); // Box 373 cull stairs
		bodyModel[239] = new ModelRendererTurbo(this, 363, 192, textureX, textureY); // Box 326
		bodyModel[240] = new ModelRendererTurbo(this, 364, 189, textureX, textureY); // Box 327
		bodyModel[241] = new ModelRendererTurbo(this, 364, 186, textureX, textureY); // Box 329
		bodyModel[242] = new ModelRendererTurbo(this, 354, 192, textureX, textureY); // Box 372
		bodyModel[243] = new ModelRendererTurbo(this, 354, 189, textureX, textureY); // Box 374
		bodyModel[244] = new ModelRendererTurbo(this, 354, 183, textureX, textureY); // Box 376
		bodyModel[245] = new ModelRendererTurbo(this, 373, 155, textureX, textureY); // Box 266
		bodyModel[246] = new ModelRendererTurbo(this, 364, 183, textureX, textureY); // Box 330
		bodyModel[247] = new ModelRendererTurbo(this, 354, 186, textureX, textureY); // Box 375
		bodyModel[248] = new ModelRendererTurbo(this, 387, 155, textureX, textureY); // Box 389
		bodyModel[249] = new ModelRendererTurbo(this, 372, 161, textureX, textureY); // Box 519
		bodyModel[250] = new ModelRendererTurbo(this, 386, 161, textureX, textureY); // Box 520
		bodyModel[251] = new ModelRendererTurbo(this, 365, 158, textureX, textureY); // Box 521
		bodyModel[252] = new ModelRendererTurbo(this, 368, 158, textureX, textureY); // Box 522
		bodyModel[253] = new ModelRendererTurbo(this, 365, 158, textureX, textureY); // Box 523
		bodyModel[254] = new ModelRendererTurbo(this, 368, 158, textureX, textureY); // Box 524
		bodyModel[255] = new ModelRendererTurbo(this, 14, 179, textureX, textureY); // Box 282
		bodyModel[256] = new ModelRendererTurbo(this, 53, 176, textureX, textureY); // Box 283
		bodyModel[257] = new ModelRendererTurbo(this, 27, 177, textureX, textureY); // Box 4
		bodyModel[258] = new ModelRendererTurbo(this, 42, 181, textureX, textureY); // Box 448
		bodyModel[259] = new ModelRendererTurbo(this, 66, 174, textureX, textureY); // Box 322
		bodyModel[260] = new ModelRendererTurbo(this, 81, 178, textureX, textureY); // Box 323
		bodyModel[261] = new ModelRendererTurbo(this, 42, 171, textureX, textureY); // Box 280
		bodyModel[262] = new ModelRendererTurbo(this, 81, 168, textureX, textureY); // Box 285
		bodyModel[263] = new ModelRendererTurbo(this, 120, 107, textureX, textureY); // Box 602
		bodyModel[264] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, "ditch"); // Box 412 ditchlight ane f
		bodyModel[265] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, "ditch"); // Box 412  ditchlight ane f
		bodyModel[266] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 411 ane ditchlight mount
		bodyModel[267] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 410 ane ditchlight mount
		bodyModel[268] = new ModelRendererTurbo(this, 400, 166, textureX, textureY, "ditch"); // Box 417 ditchlight ane r
		bodyModel[269] = new ModelRendererTurbo(this, 400, 166, textureX, textureY, "ditch"); // Box 416 ditchlight ane r
		bodyModel[270] = new ModelRendererTurbo(this, 400, 171, textureX, textureY); // Box 415 ane ditchlight mount
		bodyModel[271] = new ModelRendererTurbo(this, 400, 171, textureX, textureY); // Box 414 ane ditchlight mount

		bodyModel[0].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[0].setRotationPoint(-39F, -8F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 353
		bodyModel[1].setRotationPoint(-39F, -10F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 354
		bodyModel[2].setRotationPoint(-39F, -10F, 1F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 356
		bodyModel[3].setRotationPoint(-39F, -13F, 1F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 357
		bodyModel[4].setRotationPoint(-39F, -13F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 355
		bodyModel[5].setRotationPoint(-39F, -8F, 0F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[6].setRotationPoint(-44F, 3F, -1.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[7].setRotationPoint(-41F, 2.5F, -2F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 5
		bodyModel[8].setRotationPoint(41F, 3F, -1.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[9].setRotationPoint(40F, 2.5F, -2F);

		bodyModel[10].addBox(0F, 0F, 0F, 80, 2, 12, 0F); // Box 23
		bodyModel[10].setRotationPoint(-40F, 1F, -6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[11].setRotationPoint(-36F, 1F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[12].setRotationPoint(-40F, 0F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[13].setRotationPoint(-36F, 1F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[14].setRotationPoint(-36F, 0F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[15].setRotationPoint(-36F, 5F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[16].setRotationPoint(-36F, 5F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[17].setRotationPoint(-36F, 0F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[18].setRotationPoint(-40F, -8F, -8F);
		bodyModel[18].rotateAngleY = -3.14159265F;

		bodyModel[19].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[19].setRotationPoint(-40F, -1F, 10F);

		bodyModel[20].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[20].setRotationPoint(-40F, -1F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[21].setRotationPoint(-40F, -8F, -6F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 144
		bodyModel[22].setRotationPoint(-40F, -8F, -8F);

		bodyModel[23].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[23].setRotationPoint(-41F, -8F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[24].setRotationPoint(-40F, -8F, 4F);

		bodyModel[25].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 148
		bodyModel[25].setRotationPoint(-40F, -8F, 6F);

		bodyModel[26].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 226
		bodyModel[26].setRotationPoint(-40F, 8F, -9F);

		bodyModel[27].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[27].setRotationPoint(-40F, 7F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[28].setRotationPoint(-40F, 1F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[29].setRotationPoint(-40F, 3F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[30].setRotationPoint(-37.98F, -13F, -1F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[31].setRotationPoint(-39F, -13F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[32].setRotationPoint(-39F, -13F, -1F);

		bodyModel[33].addBox(0F, 0F, 0F, 70, 1, 4, 0F); // Box 0
		bodyModel[33].setRotationPoint(-35F, 0F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 70, 1, 4, 0F); // Box 112
		bodyModel[34].setRotationPoint(-35F, 0F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[35].setRotationPoint(13F, 1F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 116
		bodyModel[36].setRotationPoint(-13F, 1F, -11F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[37].setRotationPoint(-30F, -21F, -1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[38].setRotationPoint(-30F, -21F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[39].setRotationPoint(-30F, -21F, 1F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 numberboard front
		bodyModel[40].setRotationPoint(-28.05F, -19.5F, -6F);
		bodyModel[40].rotateAngleY = 0.38397244F;

		bodyModel[41].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118 numberboard front
		bodyModel[41].setRotationPoint(-28.05F, -19.5F, 6F);
		bodyModel[41].rotateAngleY = -0.38397244F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front up 1
		bodyModel[42].setRotationPoint(-30.25F, -21F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front up 2
		bodyModel[43].setRotationPoint(-30.25F, -19F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[44].setRotationPoint(-27F, -21F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 527 cab backpannel
		bodyModel[45].setRotationPoint(-18F, -20F, -6F);

		bodyModel[46].addBox(0F, 0F, 0F, 6, 13, 14, 0F); // Box 43
		bodyModel[46].setRotationPoint(-34F, -13F, -7F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[47].setRotationPoint(-36F, -13F, -6F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[48].setRotationPoint(-36F, -13F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[49].setRotationPoint(-35.5F, -8.5F, -7F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[50].setRotationPoint(-35F, -6.5F, -7F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 nose brake cover
		bodyModel[51].setRotationPoint(-36F, -9F, -7F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[52].setRotationPoint(-25.5F, 3F, -2F);

		bodyModel[53].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[53].setRotationPoint(21.5F, 3F, -2F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 408
		bodyModel[54].setRotationPoint(22F, 1F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 409
		bodyModel[55].setRotationPoint(-25F, 1F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 52, 21, 14, 0F); // Box 19 the hooh
		bodyModel[56].setRotationPoint(-16F, -21F, -7F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[57].setRotationPoint(38F, -17F, -1F);
		bodyModel[57].rotateAngleX = 1.57079633F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear 2 beam
		bodyModel[58].setRotationPoint(39.25F, -19F, -1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear 2 beam
		bodyModel[59].setRotationPoint(39.25F, -21F, -1F);

		bodyModel[60].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 285
		bodyModel[60].setRotationPoint(-15F, -20.5F, -7.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 286
		bodyModel[61].setRotationPoint(-15F, -20.5F, 6.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[62].setRotationPoint(-1F, -21F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[63].setRotationPoint(12F, -21F, 7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105 dynamics special
		bodyModel[64].setRotationPoint(-7F, -21F, 7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[65].setRotationPoint(-1F, -21F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 285 dynamics special
		bodyModel[66].setRotationPoint(-7F, -21F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[67].setRotationPoint(12F, -21F, -9F);

		bodyModel[68].addBox(0F, 0F, 0F, 36, 2, 4, 0F); // Box 36
		bodyModel[68].setRotationPoint(-16F, -2F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[69].setRotationPoint(-15F, -13F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[70].setRotationPoint(-15F, -15F, -9F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[71].setRotationPoint(-16F, -10F, -10.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 80, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[72].setRotationPoint(-40F, 3F, -6.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 80, 1, 14, 0F); // Box 170
		bodyModel[73].setRotationPoint(-40F, 0F, -7F);

		bodyModel[74].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[74].setRotationPoint(-27.5F, -18F, -10.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[75].setRotationPoint(-17F, -18F, -11F);

		bodyModel[76].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[76].setRotationPoint(-27F, -18F, 10F);

		bodyModel[77].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[77].setRotationPoint(-27F, -18F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[78].setRotationPoint(-28F, -18F, -7F);

		bodyModel[79].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[79].setRotationPoint(-16.5F, -18F, 10.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[80].setRotationPoint(-28F, -4F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[81].setRotationPoint(-28F, -21F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[82].setRotationPoint(-17F, -21F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[83].setRotationPoint(-28F, -21F, -7F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[84].setRotationPoint(-17F, -21F, -7F);

		bodyModel[85].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[85].setRotationPoint(-27F, -21F, -7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[86].setRotationPoint(-27F, -21F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[87].setRotationPoint(-17F, -21F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[88].setRotationPoint(-28F, -21F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[89].setRotationPoint(-25F, 2F, -10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[90].setRotationPoint(-25F, 2F, 6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[91].setRotationPoint(-24F, 2F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[92].setRotationPoint(-24F, 2F, 9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[93].setRotationPoint(22F, 2F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 193
		bodyModel[94].setRotationPoint(23F, 2F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		bodyModel[95].setRotationPoint(22F, 2F, 6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 195
		bodyModel[96].setRotationPoint(23F, 2F, 9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		bodyModel[97].setRotationPoint(-35F, 1F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[98].setRotationPoint(12F, 1F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 198
		bodyModel[99].setRotationPoint(-13F, 1F, 11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 199
		bodyModel[100].setRotationPoint(-35F, 1F, 11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 200
		bodyModel[101].setRotationPoint(13F, 1F, 11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 201
		bodyModel[102].setRotationPoint(12F, 1F, 11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[103].setRotationPoint(-40F, 3F, -2.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 203
		bodyModel[104].setRotationPoint(35F, 3F, -2.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 16, 3, 22, 0F); // Box 489
		bodyModel[105].setRotationPoint(-8F, 3F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[106].setRotationPoint(-8F, 2F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[107].setRotationPoint(-8F, 6F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 16, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[108].setRotationPoint(-8F, 6F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[109].setRotationPoint(-8F, 2F, 8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[110].setRotationPoint(-8F, 6F, 9F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[111].setRotationPoint(-6F, 2F, -11.25F);
		bodyModel[111].rotateAngleX = 1.02974426F;

		bodyModel[112].addBox(0F, 0F, 0F, 16, 1, 16, 0F); // Box 559
		bodyModel[112].setRotationPoint(-8F, 2F, -8F);

		bodyModel[113].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 560
		bodyModel[113].setRotationPoint(-6F, 2F, 11.25F);
		bodyModel[113].rotateAngleX = 1.02974426F;
		bodyModel[113].rotateAngleY = -3.14159265F;

		bodyModel[114].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 562
		bodyModel[114].setRotationPoint(-3F, 1.3F, -9.5F);
		bodyModel[114].rotateAngleX = 0.78539816F;

		bodyModel[115].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 563
		bodyModel[115].setRotationPoint(-3F, 1.3F, 9.5F);
		bodyModel[115].rotateAngleX = 0.78539816F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[116].setRotationPoint(8F, 6F, -9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[117].setRotationPoint(8F, 6F, -11F);

		bodyModel[118].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 566
		bodyModel[118].setRotationPoint(8F, 3F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[119].setRotationPoint(8F, 2F, -11F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 568
		bodyModel[120].setRotationPoint(8F, 2F, -8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[121].setRotationPoint(8F, 2F, 8F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 570
		bodyModel[122].setRotationPoint(8F, 6F, 9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[123].setRotationPoint(-12F, 6F, -9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[124].setRotationPoint(-12F, 6F, -11F);

		bodyModel[125].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 573
		bodyModel[125].setRotationPoint(-12F, 3F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[126].setRotationPoint(-12F, 2F, -11F);

		bodyModel[127].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 575
		bodyModel[127].setRotationPoint(-12F, 2F, -8F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 576
		bodyModel[128].setRotationPoint(-12F, 6F, 9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[129].setRotationPoint(-12F, 2F, 8F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 44
		bodyModel[130].setRotationPoint(-34F, -2F, -11F);

		bodyModel[131].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 45
		bodyModel[131].setRotationPoint(-34F, -4F, 7F);

		bodyModel[132].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 56
		bodyModel[132].setRotationPoint(-33F, -4F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[133].setRotationPoint(-34F, -4F, -11F);

		bodyModel[134].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 61
		bodyModel[134].setRotationPoint(-36F, -10F, -11F);

		bodyModel[135].addBox(0F, 0F, 0F, 0, 15, 2, 0F); // Box 81
		bodyModel[135].setRotationPoint(-36F, -10F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[136].setRotationPoint(-36F, -8F, -11.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[137].setRotationPoint(-33F, -11F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[138].setRotationPoint(-36F, -10F, 10.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 0, 17, 2, 0F); // Box 177
		bodyModel[139].setRotationPoint(-36F, -12F, 9F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 191
		bodyModel[140].setRotationPoint(-34F, -9F, -11.01F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 227
		bodyModel[141].setRotationPoint(-34F, -11F, 11F);

		bodyModel[142].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[142].setRotationPoint(-31F, -12F, -11F);

		bodyModel[143].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 258
		bodyModel[143].setRotationPoint(-36F, -12F, 11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[144].setRotationPoint(-30F, -17F, -1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[145].setRotationPoint(-14F, -4F, 11F);

		bodyModel[146].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 304
		bodyModel[146].setRotationPoint(-15F, -2F, 7F);

		bodyModel[147].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 305
		bodyModel[147].setRotationPoint(-16F, -4F, 11F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 836
		bodyModel[148].setRotationPoint(-16F, -4F, 7F);

		bodyModel[149].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[149].setRotationPoint(4F, -22F, -3F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[150].setRotationPoint(-15F, -22F, -5.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274 gp39/40 exhaust
		bodyModel[151].setRotationPoint(-6F, -22.5F, -2.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[152].setRotationPoint(-7F, -21.5F, -4F);

		bodyModel[153].addBox(0F, 0F, 0F, 47, 8, 0, 0F); // Box 38R
		bodyModel[153].setRotationPoint(-11F, -8F, 11F);

		bodyModel[154].addBox(0F, 0F, 0F, 32, 8, 0, 0F); // Box 176
		bodyModel[154].setRotationPoint(-14F, -10F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[155].setRotationPoint(-16F, -12F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[156].setRotationPoint(18F, -10F, -11F);

		bodyModel[157].addBox(0F, 0F, 0F, 16, 8, 0, 0F); // Box 316
		bodyModel[157].setRotationPoint(20F, -8F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[158].setRotationPoint(-16F, -12F, 11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 307
		bodyModel[159].setRotationPoint(-15F, -12F, 11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		bodyModel[160].setRotationPoint(-12F, -8F, 11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[161].setRotationPoint(-40.01F, -7F, -8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		bodyModel[162].setRotationPoint(-40.01F, -7F, 7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[163].setRotationPoint(-25F, -18F, 11F);
		bodyModel[163].rotateAngleX = 0.26179939F;

		bodyModel[164].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[164].setRotationPoint(-25F, -18.25F, -11.97F);
		bodyModel[164].rotateAngleX = -0.26179939F;

		bodyModel[165].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412 cs
		bodyModel[165].setRotationPoint(-27F, -13F, 3F);

		bodyModel[166].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413 cs
		bodyModel[166].setRotationPoint(-27.1F, -12F, 1F);
		bodyModel[166].rotateAngleY = -0.38397244F;

		bodyModel[167].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[167].setRotationPoint(-25.5F, -14F, 1F);
		bodyModel[167].rotateAngleY = -0.38397244F;

		bodyModel[168].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[168].setRotationPoint(-24.5F, -16.25F, 2F);
		bodyModel[168].rotateAngleY = 0.78539816F;

		bodyModel[169].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo
		bodyModel[169].setRotationPoint(-24.5F, -16.25F, 2F);
		bodyModel[169].rotateAngleY = 0.78539816F;

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[170].setRotationPoint(-14.5F, 2.75F, -10.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[171].setRotationPoint(-14.5F, 1.75F, -10.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[172].setRotationPoint(-14.25F, 3.25F, -10.25F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[173].setRotationPoint(-14.5F, 0.75F, -10.9F);

		bodyModel[174].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 450 cull
		bodyModel[174].setRotationPoint(-42F, 7F, -9F);

		bodyModel[175].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 451 cull
		bodyModel[175].setRotationPoint(-42F, 7F, 3F);

		bodyModel[176].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 453 cull
		bodyModel[176].setRotationPoint(40F, 7F, 3F);

		bodyModel[177].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 455 cull
		bodyModel[177].setRotationPoint(40F, 7F, -9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479 cull
		bodyModel[178].setRotationPoint(40F, 8F, -2F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339 cull
		bodyModel[179].setRotationPoint(-42F, 8F, -2F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268 anticlimber
		bodyModel[180].setRotationPoint(-42F, 0F, -7F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269anticlimber
		bodyModel[181].setRotationPoint(-42F, 0F, 0F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 378 cull
		bodyModel[182].setRotationPoint(15F, -21F, 7F);

		bodyModel[183].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 284
		bodyModel[183].setRotationPoint(-26F, -19.5F, -9F);
		bodyModel[183].rotateAngleX = -0.9250245F;
		bodyModel[183].rotateAngleY = 0.01745329F;
		bodyModel[183].rotateAngleZ = -0.01745329F;

		bodyModel[184].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[184].setRotationPoint(-25F, -17F, 10F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[185].setRotationPoint(-25F, -18F, 10F);

		bodyModel[186].addShapeBox(0F, 0F, -2F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1087 cull
		bodyModel[186].setRotationPoint(-25F, -17F, -13F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1088
		bodyModel[187].setRotationPoint(-25F, -18F, -13F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[188].setRotationPoint(13F, -22F, -1F);

		bodyModel[189].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[189].setRotationPoint(-24.5F, -22.75F, -4F);

		bodyModel[190].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 282 antenna plate cull
		bodyModel[190].setRotationPoint(-29F, -22F, -2.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[191].setRotationPoint(-28.5F, -23F, 0F);

		bodyModel[192].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Box 1203
		bodyModel[192].setRotationPoint(-33F, -8F, 7F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[193].setRotationPoint(-36.65F, -12F, -6.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[194].setRotationPoint(-36.65F, -12F, 4.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[195].setRotationPoint(38.25F, -17F, -6.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[196].setRotationPoint(38.25F, -17F, 4.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1251
		bodyModel[197].setRotationPoint(-37F, -13.5F, -1F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1252
		bodyModel[198].setRotationPoint(0F, -22.5F, -1F);

		bodyModel[199].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1253
		bodyModel[199].setRotationPoint(0F, -22.5F, -2F);

		bodyModel[200].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 1254
		bodyModel[200].setRotationPoint(-2.5F, -23.5F, -0.5F);

		bodyModel[201].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1255
		bodyModel[201].setRotationPoint(-0.5F, -22.5F, 1F);

		bodyModel[202].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 1256
		bodyModel[202].setRotationPoint(-1F, -23.5F, 0.5F);

		bodyModel[203].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 1257
		bodyModel[203].setRotationPoint(-1F, -23.5F, -1.5F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 1258
		bodyModel[204].setRotationPoint(0F, -21.5F, -0.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[205].setRotationPoint(15.5F, -22.01F, 7.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[206].setRotationPoint(15.5F, -23.01F, 7.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[207].setRotationPoint(-40F, 8F, -11F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[208].setRotationPoint(-40F, 5F, -10F);

		bodyModel[209].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[209].setRotationPoint(-40F, 7F, -9F);

		bodyModel[210].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 401
		bodyModel[210].setRotationPoint(-40F, 4F, -8F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[211].setRotationPoint(-40F, 3F, 7F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[212].setRotationPoint(-40F, 1F, 7F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[213].setRotationPoint(-40F, 5F, 8F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[214].setRotationPoint(-40F, 8F, 9F);

		bodyModel[215].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 394
		bodyModel[215].setRotationPoint(-40F, 7F, 9F);

		bodyModel[216].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
		bodyModel[216].setRotationPoint(-40F, 4F, 8F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[217].setRotationPoint(-40F, -8F, 9F);
		bodyModel[217].rotateAngleY = -3.14159265F;

		bodyModel[218].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 461 nose stairs hand rail inside your ass
		bodyModel[218].setRotationPoint(-27F, -11F, -4F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[219].setRotationPoint(-15F, 1F, 8.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 538 dynamics longy
		bodyModel[220].setRotationPoint(-5F, -21F, -9F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 539 dynamics longy
		bodyModel[221].setRotationPoint(-5F, -21F, 7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 540
		bodyModel[222].setRotationPoint(-36F, -3F, -11.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 541
		bodyModel[223].setRotationPoint(-36F, -3F, 10.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[224].setRotationPoint(17F, -21F, -8F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 366
		bodyModel[225].setRotationPoint(17F, -21F, 7F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 48, 1, 6, 0F,-0.25F, 1F, 0F, -27.25F, 1F, 0F, -27.25F, 0F, 0.8F, -0.25F, 0F, 0.8F, -0.25F, -1F, 0F, -27.25F, -1F, 0F, -27.25F, 0F, 0.8F, -0.25F, 0F, 0.8F); // Box 299 big radiator
		bodyModel[226].setRotationPoint(17F, -21.75F, 0.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 48, 1, 6, 0F,-0.25F, 0F, 0.8F, -27.25F, 0F, 0.8F, -27.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0.8F, -27.25F, 0F, 0.8F, -27.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 300 big radiator
		bodyModel[227].setRotationPoint(17F, -21.75F, -6.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 21, 1, 6, 0F,0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 306
		bodyModel[228].setRotationPoint(17F, -22F, -7F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 21, 1, 6, 0F,0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 308
		bodyModel[229].setRotationPoint(17F, -22F, 1F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 34, 20, 14, 0F,0F, 0F, 0.25F, -17F, 0F, 0.25F, -17F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -10F, 0.25F, -17F, -10F, 0.25F, -17F, -10F, 0.25F, 0F, -10F, 0.25F); // Box 305 vent cull
		bodyModel[230].setRotationPoint(21F, -10F, -7F);

		bodyModel[231].addBox(0F, 0F, 0F, 3, 21, 14, 0F); // Box 567
		bodyModel[231].setRotationPoint(36F, -21F, -7F);

		bodyModel[232].addBox(0F, 0F, 0F, 2, 5, 3, 0F); // Box 313 drgw mount
		bodyModel[232].setRotationPoint(37.5F, -21.5F, -1.5F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 202 cull
		bodyModel[233].setRotationPoint(40F, 0F, -11F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 364 cull
		bodyModel[234].setRotationPoint(41F, 0F, -11F);

		bodyModel[235].addBox(0F, 0F, 0F, 0, 7, 18, 0F); // Box 571
		bodyModel[235].setRotationPoint(40F, 2F, -9F);

		bodyModel[236].addBox(0F, 0F, 0F, 2, 8, 22, 0F); // Box 80 cull handrails
		bodyModel[236].setRotationPoint(40.01F, -8F, -11F);

		bodyModel[237].addBox(0F, 0F, 0F, 4, 7, 2, 0F); // Box 288 cull stairs
		bodyModel[237].setRotationPoint(36F, 1F, -11F);

		bodyModel[238].addBox(0F, 0F, 0F, 4, 7, 2, 0F); // Box 373 cull stairs
		bodyModel[238].setRotationPoint(36F, 1F, 9F);

		bodyModel[239].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 326
		bodyModel[239].setRotationPoint(36F, 8F, -11F);

		bodyModel[240].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 327
		bodyModel[240].setRotationPoint(36F, 5F, -10F);

		bodyModel[241].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 329
		bodyModel[241].setRotationPoint(36F, 2F, -10F);

		bodyModel[242].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 372
		bodyModel[242].setRotationPoint(36F, 5F, 9F);

		bodyModel[243].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 374
		bodyModel[243].setRotationPoint(36F, 2F, 9F);

		bodyModel[244].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 376
		bodyModel[244].setRotationPoint(36F, 8F, 9F);

		bodyModel[245].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 266
		bodyModel[245].setRotationPoint(35F, 0F, -11F);

		bodyModel[246].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 330
		bodyModel[246].setRotationPoint(36F, 0F, -10F);

		bodyModel[247].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 375
		bodyModel[247].setRotationPoint(36F, 0F, 9F);

		bodyModel[248].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 389
		bodyModel[248].setRotationPoint(35F, 0F, 7F);

		bodyModel[249].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 519
		bodyModel[249].setRotationPoint(36F, 0F, -9F);

		bodyModel[250].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 520
		bodyModel[250].setRotationPoint(36F, 0F, 7F);

		bodyModel[251].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 521
		bodyModel[251].setRotationPoint(35F, 1F, -11F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 522
		bodyModel[252].setRotationPoint(35F, 1F, 11F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 523
		bodyModel[253].setRotationPoint(40F, 2F, -11F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 524
		bodyModel[254].setRotationPoint(40F, 2F, 11F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[255].setRotationPoint(-44F, 7F, 0F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[256].setRotationPoint(-44F, 7F, -10F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[257].setRotationPoint(-43F, 6F, 0F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[258].setRotationPoint(-43F, 5F, 2F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[259].setRotationPoint(-43F, 6F, -10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[260].setRotationPoint(-43F, 5F, -10F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[261].setRotationPoint(-43F, 4F, 2F);

		bodyModel[262].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[262].setRotationPoint(-43F, 4F, -8F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[263].setRotationPoint(-35F, -4F, -11F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight ane f
		bodyModel[264].setRotationPoint(-41.25F, -3F, 4F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412  ditchlight ane f
		bodyModel[265].setRotationPoint(-41.25F, -3F, -6F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411 ane ditchlight mount
		bodyModel[266].setRotationPoint(-41F, -3F, 4F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410 ane ditchlight mount
		bodyModel[267].setRotationPoint(-41F, -3F, -6F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 417 ditchlight ane r
		bodyModel[268].setRotationPoint(41.25F, -3F, 4F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 416 ditchlight ane r
		bodyModel[269].setRotationPoint(41.25F, -3F, -6F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 415 ane ditchlight mount
		bodyModel[270].setRotationPoint(41F, -3F, -6F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 414 ane ditchlight mount
		bodyModel[271].setRotationPoint(41F, -3F, 4F);
	}
	ModelBlombergBnew theBlombi = new ModelBlombergBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
		if (GetColor(entity) == 1564) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_DarkerGrey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.47, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.93, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.47, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.93, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}