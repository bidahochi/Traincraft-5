//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GP39T-2B
// Model Creator: bida
// Created on: 03.08.2024 - 23:04:14
// Last changed on: 03.08.2024 - 23:04:14

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

public class ModelGP39TB extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGP39TB() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[223];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 2, 7, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 266, 92, textureX, textureY); // Box 23
		bodyModel[5] = new ModelRendererTurbo(this, 53, 151, textureX, textureY); // Box 164
		bodyModel[6] = new ModelRendererTurbo(this, 12, 125, textureX, textureY); // Box 3
		bodyModel[7] = new ModelRendererTurbo(this, 1, 151, textureX, textureY); // Box 259
		bodyModel[8] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 262
		bodyModel[9] = new ModelRendererTurbo(this, 53, 160, textureX, textureY); // Box 264
		bodyModel[10] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 265
		bodyModel[11] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 261
		bodyModel[12] = new ModelRendererTurbo(this, 46, 136, textureX, textureY); // Box 143
		bodyModel[13] = new ModelRendererTurbo(this, 13, 137, textureX, textureY); // Box 61
		bodyModel[14] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 63
		bodyModel[15] = new ModelRendererTurbo(this, 37, 132, textureX, textureY); // Box 80
		bodyModel[16] = new ModelRendererTurbo(this, 41, 134, textureX, textureY); // Box 144
		bodyModel[17] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[18] = new ModelRendererTurbo(this, 23, 132, textureX, textureY); // Box 147
		bodyModel[19] = new ModelRendererTurbo(this, 19, 134, textureX, textureY); // Box 148
		bodyModel[20] = new ModelRendererTurbo(this, 14, 137, textureX, textureY); // Box 226
		bodyModel[21] = new ModelRendererTurbo(this, 10, 131, textureX, textureY); // Box 227
		bodyModel[22] = new ModelRendererTurbo(this, 79, 134, textureX, textureY); // Box 271
		bodyModel[23] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 274
		bodyModel[24] = new ModelRendererTurbo(this, 284, 107, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 283, 70, textureX, textureY); // Box 112
		bodyModel[26] = new ModelRendererTurbo(this, 363, 114, textureX, textureY); // Box 113
		bodyModel[27] = new ModelRendererTurbo(this, 357, 114, textureX, textureY); // Box 116
		bodyModel[28] = new ModelRendererTurbo(this, 154, 199, textureX, textureY); // Box 43
		bodyModel[29] = new ModelRendererTurbo(this, 44, 46, textureX, textureY); // Box 43
		bodyModel[30] = new ModelRendererTurbo(this, 75, 54, textureX, textureY); // Box 43
		bodyModel[31] = new ModelRendererTurbo(this, 119, 61, textureX, textureY); // Box 43
		bodyModel[32] = new ModelRendererTurbo(this, 119, 64, textureX, textureY); // Box 43
		bodyModel[33] = new ModelRendererTurbo(this, 75, 62, textureX, textureY); // Box 346 nose brake cover
		bodyModel[34] = new ModelRendererTurbo(this, 261, 74, textureX, textureY); // Box 163
		bodyModel[35] = new ModelRendererTurbo(this, 405, 113, textureX, textureY); // Box 166
		bodyModel[36] = new ModelRendererTurbo(this, 429, 94, textureX, textureY); // Box 408
		bodyModel[37] = new ModelRendererTurbo(this, 233, 90, textureX, textureY); // Box 409
		bodyModel[38] = new ModelRendererTurbo(this, 326, 29, textureX, textureY); // Box 19 the hooh
		bodyModel[39] = new ModelRendererTurbo(this, 478, 84, textureX, textureY); // Box 31
		bodyModel[40] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 247 headlight rear 2 beam
		bodyModel[41] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 248 headlight rear 2 beam
		bodyModel[42] = new ModelRendererTurbo(this, 335, 22, textureX, textureY); // Box 285
		bodyModel[43] = new ModelRendererTurbo(this, 335, 15, textureX, textureY); // Box 286
		bodyModel[44] = new ModelRendererTurbo(this, 389, 15, textureX, textureY); // Box 101
		bodyModel[45] = new ModelRendererTurbo(this, 420, 15, textureX, textureY); // Box 104
		bodyModel[46] = new ModelRendererTurbo(this, 354, 15, textureX, textureY); // Box 105 dynamics special
		bodyModel[47] = new ModelRendererTurbo(this, 389, 22, textureX, textureY); // Box 284
		bodyModel[48] = new ModelRendererTurbo(this, 354, 22, textureX, textureY); // Box 285 dynamics special
		bodyModel[49] = new ModelRendererTurbo(this, 420, 22, textureX, textureY); // Box 286
		bodyModel[50] = new ModelRendererTurbo(this, 317, 116, textureX, textureY); // Box 36
		bodyModel[51] = new ModelRendererTurbo(this, 302, 55, textureX, textureY); // Box 271
		bodyModel[52] = new ModelRendererTurbo(this, 302, 50, textureX, textureY); // Box 272
		bodyModel[53] = new ModelRendererTurbo(this, 308, 38, textureX, textureY); // Box 270
		bodyModel[54] = new ModelRendererTurbo(this, 264, 123, textureX, textureY); // Box 63
		bodyModel[55] = new ModelRendererTurbo(this, 264, 76, textureX, textureY); // Box 170
		bodyModel[56] = new ModelRendererTurbo(this, 285, 114, textureX, textureY); // Box 129
		bodyModel[57] = new ModelRendererTurbo(this, 428, 65, textureX, textureY); // Box 130
		bodyModel[58] = new ModelRendererTurbo(this, 282, 114, textureX, textureY); // Box 133
		bodyModel[59] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 134
		bodyModel[60] = new ModelRendererTurbo(this, 300, 114, textureX, textureY); // Box 192
		bodyModel[61] = new ModelRendererTurbo(this, 297, 114, textureX, textureY); // Box 193
		bodyModel[62] = new ModelRendererTurbo(this, 443, 65, textureX, textureY); // Box 194
		bodyModel[63] = new ModelRendererTurbo(this, 440, 65, textureX, textureY); // Box 195
		bodyModel[64] = new ModelRendererTurbo(this, 312, 114, textureX, textureY); // Box 196
		bodyModel[65] = new ModelRendererTurbo(this, 360, 114, textureX, textureY); // Box 197
		bodyModel[66] = new ModelRendererTurbo(this, 368, 67, textureX, textureY); // Box 198
		bodyModel[67] = new ModelRendererTurbo(this, 323, 67, textureX, textureY); // Box 199
		bodyModel[68] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 200
		bodyModel[69] = new ModelRendererTurbo(this, 371, 67, textureX, textureY); // Box 201
		bodyModel[70] = new ModelRendererTurbo(this, 248, 81, textureX, textureY); // Box 4
		bodyModel[71] = new ModelRendererTurbo(this, 449, 72, textureX, textureY); // Box 203
		bodyModel[72] = new ModelRendererTurbo(this, 242, 156, textureX, textureY); // Box 489
		bodyModel[73] = new ModelRendererTurbo(this, 218, 213, textureX, textureY); // Box 278
		bodyModel[74] = new ModelRendererTurbo(this, 219, 218, textureX, textureY); // Box 281
		bodyModel[75] = new ModelRendererTurbo(this, 246, 182, textureX, textureY); // Box 288
		bodyModel[76] = new ModelRendererTurbo(this, 304, 213, textureX, textureY); // Box 315
		bodyModel[77] = new ModelRendererTurbo(this, 305, 218, textureX, textureY); // Box 316
		bodyModel[78] = new ModelRendererTurbo(this, 256, 172, textureX, textureY); // Box 19
		bodyModel[79] = new ModelRendererTurbo(this, 248, 138, textureX, textureY); // Box 559
		bodyModel[80] = new ModelRendererTurbo(this, 300, 172, textureX, textureY); // Box 560
		bodyModel[81] = new ModelRendererTurbo(this, 220, 208, textureX, textureY); // Box 562
		bodyModel[82] = new ModelRendererTurbo(this, 306, 208, textureX, textureY); // Box 563
		bodyModel[83] = new ModelRendererTurbo(this, 301, 186, textureX, textureY); // Box 564
		bodyModel[84] = new ModelRendererTurbo(this, 329, 198, textureX, textureY); // Box 565
		bodyModel[85] = new ModelRendererTurbo(this, 297, 160, textureX, textureY); // Box 566
		bodyModel[86] = new ModelRendererTurbo(this, 328, 193, textureX, textureY); // Box 567
		bodyModel[87] = new ModelRendererTurbo(this, 297, 140, textureX, textureY); // Box 568
		bodyModel[88] = new ModelRendererTurbo(this, 328, 166, textureX, textureY); // Box 569
		bodyModel[89] = new ModelRendererTurbo(this, 329, 160, textureX, textureY); // Box 570
		bodyModel[90] = new ModelRendererTurbo(this, 215, 186, textureX, textureY); // Box 571
		bodyModel[91] = new ModelRendererTurbo(this, 219, 198, textureX, textureY); // Box 572
		bodyModel[92] = new ModelRendererTurbo(this, 211, 160, textureX, textureY); // Box 573
		bodyModel[93] = new ModelRendererTurbo(this, 218, 193, textureX, textureY); // Box 574
		bodyModel[94] = new ModelRendererTurbo(this, 223, 140, textureX, textureY); // Box 575
		bodyModel[95] = new ModelRendererTurbo(this, 219, 160, textureX, textureY); // Box 576
		bodyModel[96] = new ModelRendererTurbo(this, 218, 166, textureX, textureY); // Box 577
		bodyModel[97] = new ModelRendererTurbo(this, 376, 5, textureX, textureY); // Box 278
		bodyModel[98] = new ModelRendererTurbo(this, 306, 1, textureX, textureY); // Box 273
		bodyModel[99] = new ModelRendererTurbo(this, 333, 4, textureX, textureY); // Box 274 gp39/40 exhaust
		bodyModel[100] = new ModelRendererTurbo(this, 340, 3, textureX, textureY); // Box 275
		bodyModel[101] = new ModelRendererTurbo(this, 102, 115, textureX, textureY); // Box 38R
		bodyModel[102] = new ModelRendererTurbo(this, 104, 145, textureX, textureY); // Box 176
		bodyModel[103] = new ModelRendererTurbo(this, 112, 134, textureX, textureY); // Box 313
		bodyModel[104] = new ModelRendererTurbo(this, 177, 134, textureX, textureY); // Box 315
		bodyModel[105] = new ModelRendererTurbo(this, 177, 136, textureX, textureY); // Box 316
		bodyModel[106] = new ModelRendererTurbo(this, 42, 133, textureX, textureY); // Box 363
		bodyModel[107] = new ModelRendererTurbo(this, 20, 133, textureX, textureY); // Box 870
		bodyModel[108] = new ModelRendererTurbo(this, 184, 9, textureX, textureY); // Box 114
		bodyModel[109] = new ModelRendererTurbo(this, 184, 6, textureX, textureY); // Box 74
		bodyModel[110] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Box 78
		bodyModel[111] = new ModelRendererTurbo(this, 183, 2, textureX, textureY, "cull"); // Box 1007 cull
		bodyModel[112] = new ModelRendererTurbo(this, 41, 207, textureX, textureY, "cull"); // Box 450 cull
		bodyModel[113] = new ModelRendererTurbo(this, 7, 207, textureX, textureY, "cull"); // Box 451 cull
		bodyModel[114] = new ModelRendererTurbo(this, 357, 219, textureX, textureY, "cull"); // Box 453 cull
		bodyModel[115] = new ModelRendererTurbo(this, 375, 219, textureX, textureY, "cull"); // Box 455 cull
		bodyModel[116] = new ModelRendererTurbo(this, 368, 219, textureX, textureY, "cull"); // Box 479 cull
		bodyModel[117] = new ModelRendererTurbo(this, 26, 204, textureX, textureY, "cull"); // Box 339 cull
		bodyModel[118] = new ModelRendererTurbo(this, 265, 15, textureX, textureY, "cull"); // Box 378 cull
		bodyModel[119] = new ModelRendererTurbo(this, 375, 7, textureX, textureY); // Box 317
		bodyModel[120] = new ModelRendererTurbo(this, 161, 91, textureX, textureY, "cull"); // Box 282 antenna plate cull
		bodyModel[121] = new ModelRendererTurbo(this, 149, 30, textureX, textureY); // Box 450
		bodyModel[122] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[123] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[124] = new ModelRendererTurbo(this, 18, 41, textureX, textureY); // Box 1251
		bodyModel[125] = new ModelRendererTurbo(this, 264, 38, textureX, textureY); // Box 1252
		bodyModel[126] = new ModelRendererTurbo(this, 255, 46, textureX, textureY); // Box 1253
		bodyModel[127] = new ModelRendererTurbo(this, 255, 34, textureX, textureY); // Box 1255
		bodyModel[128] = new ModelRendererTurbo(this, 265, 42, textureX, textureY); // Box 1258
		bodyModel[129] = new ModelRendererTurbo(this, 266, 12, textureX, textureY); // Box 409 commander base
		bodyModel[130] = new ModelRendererTurbo(this, 266, 8, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[131] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 272
		bodyModel[132] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 273
		bodyModel[133] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 400
		bodyModel[134] = new ModelRendererTurbo(this, 79, 139, textureX, textureY); // Box 401
		bodyModel[135] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 451
		bodyModel[136] = new ModelRendererTurbo(this, 70, 134, textureX, textureY); // Box 452
		bodyModel[137] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 453
		bodyModel[138] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 454
		bodyModel[139] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 394
		bodyModel[140] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 395
		bodyModel[141] = new ModelRendererTurbo(this, 16, 136, textureX, textureY); // Box 559
		bodyModel[142] = new ModelRendererTurbo(this, 273, 114, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[143] = new ModelRendererTurbo(this, 440, 22, textureX, textureY); // Box 538 dynamics longy
		bodyModel[144] = new ModelRendererTurbo(this, 440, 15, textureX, textureY); // Box 539 dynamics longy
		bodyModel[145] = new ModelRendererTurbo(this, 368, 203, textureX, textureY); // Box 365
		bodyModel[146] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 366
		bodyModel[147] = new ModelRendererTurbo(this, 390, 224, textureX, textureY); // Box 299 big radiator
		bodyModel[148] = new ModelRendererTurbo(this, 390, 216, textureX, textureY); // Box 300 big radiator
		bodyModel[149] = new ModelRendererTurbo(this, 417, 208, textureX, textureY); // Box 306
		bodyModel[150] = new ModelRendererTurbo(this, 417, 232, textureX, textureY); // Box 308
		bodyModel[151] = new ModelRendererTurbo(this, 402, 166, textureX, textureY, "cull"); // Box 305 vent cull
		bodyModel[152] = new ModelRendererTurbo(this, 220, 76, textureX, textureY); // Box 567
		bodyModel[153] = new ModelRendererTurbo(this, 12, 125, textureX, textureY); // Box 264
		bodyModel[154] = new ModelRendererTurbo(this, 10, 131, textureX, textureY); // Box 265
		bodyModel[155] = new ModelRendererTurbo(this, 14, 137, textureX, textureY); // Box 266
		bodyModel[156] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 267
		bodyModel[157] = new ModelRendererTurbo(this, 13, 137, textureX, textureY); // Box 268
		bodyModel[158] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 269
		bodyModel[159] = new ModelRendererTurbo(this, 37, 132, textureX, textureY); // Box 270
		bodyModel[160] = new ModelRendererTurbo(this, 41, 134, textureX, textureY); // Box 271
		bodyModel[161] = new ModelRendererTurbo(this, 23, 132, textureX, textureY); // Box 272
		bodyModel[162] = new ModelRendererTurbo(this, 19, 134, textureX, textureY); // Box 273
		bodyModel[163] = new ModelRendererTurbo(this, 16, 136, textureX, textureY); // Box 274
		bodyModel[164] = new ModelRendererTurbo(this, 46, 136, textureX, textureY); // Box 275
		bodyModel[165] = new ModelRendererTurbo(this, 42, 133, textureX, textureY); // Box 276
		bodyModel[166] = new ModelRendererTurbo(this, 20, 133, textureX, textureY); // Box 277
		bodyModel[167] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 302
		bodyModel[168] = new ModelRendererTurbo(this, 21, 122, textureX, textureY); // Box 303
		bodyModel[169] = new ModelRendererTurbo(this, 34, 129, textureX, textureY); // Box 304
		bodyModel[170] = new ModelRendererTurbo(this, 21, 122, textureX, textureY); // Box 202
		bodyModel[171] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 204
		bodyModel[172] = new ModelRendererTurbo(this, 34, 129, textureX, textureY); // Box 301
		bodyModel[173] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 284
		bodyModel[174] = new ModelRendererTurbo(this, 1, 151, textureX, textureY); // Box 285
		bodyModel[175] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 286
		bodyModel[176] = new ModelRendererTurbo(this, 53, 160, textureX, textureY); // Box 287
		bodyModel[177] = new ModelRendererTurbo(this, 53, 151, textureX, textureY); // Box 288
		bodyModel[178] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 289
		bodyModel[179] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 290
		bodyModel[180] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 291
		bodyModel[181] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 292
		bodyModel[182] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 293
		bodyModel[183] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 294
		bodyModel[184] = new ModelRendererTurbo(this, 70, 134, textureX, textureY); // Box 295
		bodyModel[185] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 296
		bodyModel[186] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 297
		bodyModel[187] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 298
		bodyModel[188] = new ModelRendererTurbo(this, 79, 139, textureX, textureY); // Box 299
		bodyModel[189] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 300
		bodyModel[190] = new ModelRendererTurbo(this, 79, 134, textureX, textureY); // Box 301
		bodyModel[191] = new ModelRendererTurbo(this, 461, 85, textureX, textureY); // Box 40
		bodyModel[192] = new ModelRendererTurbo(this, 487, 84, textureX, textureY); // Box 41
		bodyModel[193] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[194] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[195] = new ModelRendererTurbo(this, 487, 84, textureX, textureY); // Box 306
		bodyModel[196] = new ModelRendererTurbo(this, 461, 85, textureX, textureY); // Box 307
		bodyModel[197] = new ModelRendererTurbo(this, 478, 84, textureX, textureY); // Box 31
		bodyModel[198] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 247 headlight 2 beam
		bodyModel[199] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 248 headlight 2 beam
		bodyModel[200] = new ModelRendererTurbo(this, 134, 189, textureX, textureY); // Box 311
		bodyModel[201] = new ModelRendererTurbo(this, 261, 120, textureX, textureY); // Box 312
		bodyModel[202] = new ModelRendererTurbo(this, 410, 155, textureX, textureY); // Box 243
		bodyModel[203] = new ModelRendererTurbo(this, 355, 155, textureX, textureY); // Box 250
		bodyModel[204] = new ModelRendererTurbo(this, 370, 161, textureX, textureY); // Box 542
		bodyModel[205] = new ModelRendererTurbo(this, 404, 161, textureX, textureY); // Box 543
		bodyModel[206] = new ModelRendererTurbo(this, 410, 155, textureX, textureY); // Box 243
		bodyModel[207] = new ModelRendererTurbo(this, 355, 155, textureX, textureY); // Box 250
		bodyModel[208] = new ModelRendererTurbo(this, 370, 161, textureX, textureY); // Box 542
		bodyModel[209] = new ModelRendererTurbo(this, 404, 161, textureX, textureY); // Box 543
		bodyModel[210] = new ModelRendererTurbo(this, 175, 145, textureX, textureY); // Box 321
		bodyModel[211] = new ModelRendererTurbo(this, 104, 37, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[212] = new ModelRendererTurbo(this, 104, 37, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[213] = new ModelRendererTurbo(this, 104, 37, textureX, textureY, "lamp"); // Box 350 numberboard hh
		bodyModel[214] = new ModelRendererTurbo(this, 104, 37, textureX, textureY, "lamp"); // Box 351 numberboard hh
		bodyModel[215] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, "ditch"); // Box 412 ditchlight ane f
		bodyModel[216] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, "ditch"); // Box 412  ditchlight ane f
		bodyModel[217] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 411 ane ditchlight mount
		bodyModel[218] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 410 ane ditchlight mount
		bodyModel[219] = new ModelRendererTurbo(this, 400, 166, textureX, textureY, "ditch"); // Box 417 ditchlight ane r
		bodyModel[220] = new ModelRendererTurbo(this, 400, 166, textureX, textureY, "ditch"); // Box 416 ditchlight ane r
		bodyModel[221] = new ModelRendererTurbo(this, 400, 171, textureX, textureY); // Box 415 ane ditchlight mount
		bodyModel[222] = new ModelRendererTurbo(this, 400, 171, textureX, textureY); // Box 414 ane ditchlight mount

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[0].setRotationPoint(-44F, 3F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-41F, 2.5F, -2F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 5
		bodyModel[2].setRotationPoint(41F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(40F, 2.5F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 80, 2, 12, 0F); // Box 23
		bodyModel[4].setRotationPoint(-40F, 1F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[5].setRotationPoint(-36F, 1F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[6].setRotationPoint(-40F, 0F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[7].setRotationPoint(-36F, 1F, 7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[8].setRotationPoint(-36F, 0F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[9].setRotationPoint(-36F, 5F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[10].setRotationPoint(-36F, 5F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[11].setRotationPoint(-36F, 0F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[12].setRotationPoint(-40F, -8F, -8F);
		bodyModel[12].rotateAngleY = -3.14159265F;

		bodyModel[13].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[13].setRotationPoint(-40F, -1F, 10F);

		bodyModel[14].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[14].setRotationPoint(-40F, -1F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[15].setRotationPoint(-40F, -8F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 144
		bodyModel[16].setRotationPoint(-40F, -8F, -8F);

		bodyModel[17].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[17].setRotationPoint(-41F, -8F, -4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[18].setRotationPoint(-40F, -8F, 4F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 148
		bodyModel[19].setRotationPoint(-40F, -8F, 6F);

		bodyModel[20].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 226
		bodyModel[20].setRotationPoint(-40F, 8F, -9F);

		bodyModel[21].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[21].setRotationPoint(-40F, 7F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[22].setRotationPoint(-40F, 1F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[23].setRotationPoint(-40F, 3F, -9F);

		bodyModel[24].addBox(0F, 0F, 0F, 70, 1, 4, 0F); // Box 0
		bodyModel[24].setRotationPoint(-35F, 0F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 70, 1, 4, 0F); // Box 112
		bodyModel[25].setRotationPoint(-35F, 0F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[26].setRotationPoint(13F, 1F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 116
		bodyModel[27].setRotationPoint(-13F, 1F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 15, 21, 14, 0F); // Box 43
		bodyModel[28].setRotationPoint(-34F, -21F, -7F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[29].setRotationPoint(-36F, -13F, -6F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[30].setRotationPoint(-36F, -13F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[31].setRotationPoint(-35.5F, -8.5F, -7F);

		bodyModel[32].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[32].setRotationPoint(-35F, -6.5F, -7F);

		bodyModel[33].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 nose brake cover
		bodyModel[33].setRotationPoint(-36F, -9F, -7F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[34].setRotationPoint(-25.5F, 3F, -2F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[35].setRotationPoint(21.5F, 3F, -2F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 408
		bodyModel[36].setRotationPoint(22F, 1F, -11F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 409
		bodyModel[37].setRotationPoint(-25F, 1F, -11F);

		bodyModel[38].addBox(0F, 0F, 0F, 52, 21, 14, 0F); // Box 19 the hooh
		bodyModel[38].setRotationPoint(-19F, -21F, -7F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[39].setRotationPoint(37.25F, -19F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear 2 beam
		bodyModel[40].setRotationPoint(38.5F, -19F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear 2 beam
		bodyModel[41].setRotationPoint(38.5F, -19F, 0F);

		bodyModel[42].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 285
		bodyModel[42].setRotationPoint(-18F, -20.5F, -7.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 286
		bodyModel[43].setRotationPoint(-18F, -20.5F, 6.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[44].setRotationPoint(-4F, -21F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[45].setRotationPoint(9F, -21F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105 dynamics special
		bodyModel[46].setRotationPoint(-10F, -21F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[47].setRotationPoint(-4F, -21F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 285 dynamics special
		bodyModel[48].setRotationPoint(-10F, -21F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[49].setRotationPoint(9F, -21F, -9F);

		bodyModel[50].addBox(0F, 0F, 0F, 36, 2, 4, 0F); // Box 36
		bodyModel[50].setRotationPoint(-16F, -2F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[51].setRotationPoint(-18F, -13F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[52].setRotationPoint(-18F, -15F, -9F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[53].setRotationPoint(-22F, -8F, -7F);
		bodyModel[53].rotateAngleY = -1.57079633F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 80, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[54].setRotationPoint(-40F, 3F, -6.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 80, 1, 14, 0F); // Box 170
		bodyModel[55].setRotationPoint(-40F, 0F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[56].setRotationPoint(-25F, 2F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[57].setRotationPoint(-25F, 2F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[58].setRotationPoint(-24F, 2F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[59].setRotationPoint(-24F, 2F, 9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[60].setRotationPoint(22F, 2F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 193
		bodyModel[61].setRotationPoint(23F, 2F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		bodyModel[62].setRotationPoint(22F, 2F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 195
		bodyModel[63].setRotationPoint(23F, 2F, 9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		bodyModel[64].setRotationPoint(-35F, 1F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[65].setRotationPoint(12F, 1F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 198
		bodyModel[66].setRotationPoint(-13F, 1F, 11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 199
		bodyModel[67].setRotationPoint(-35F, 1F, 11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 200
		bodyModel[68].setRotationPoint(13F, 1F, 11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 201
		bodyModel[69].setRotationPoint(12F, 1F, 11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[70].setRotationPoint(-40F, 3F, -2.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 203
		bodyModel[71].setRotationPoint(35F, 3F, -2.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 16, 3, 22, 0F); // Box 489
		bodyModel[72].setRotationPoint(-8F, 3F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[73].setRotationPoint(-8F, 2F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[74].setRotationPoint(-8F, 6F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 16, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[75].setRotationPoint(-8F, 6F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[76].setRotationPoint(-8F, 2F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[77].setRotationPoint(-8F, 6F, 9F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[78].setRotationPoint(-6F, 2F, -11.25F);
		bodyModel[78].rotateAngleX = 1.02974426F;

		bodyModel[79].addBox(0F, 0F, 0F, 16, 1, 16, 0F); // Box 559
		bodyModel[79].setRotationPoint(-8F, 2F, -8F);

		bodyModel[80].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 560
		bodyModel[80].setRotationPoint(-6F, 2F, 11.25F);
		bodyModel[80].rotateAngleX = 1.02974426F;
		bodyModel[80].rotateAngleY = -3.14159265F;

		bodyModel[81].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 562
		bodyModel[81].setRotationPoint(-3F, 1.3F, -9.5F);
		bodyModel[81].rotateAngleX = 0.78539816F;

		bodyModel[82].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 563
		bodyModel[82].setRotationPoint(-3F, 1.3F, 9.5F);
		bodyModel[82].rotateAngleX = 0.78539816F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[83].setRotationPoint(8F, 6F, -9F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[84].setRotationPoint(8F, 6F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 566
		bodyModel[85].setRotationPoint(8F, 3F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[86].setRotationPoint(8F, 2F, -11F);

		bodyModel[87].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 568
		bodyModel[87].setRotationPoint(8F, 2F, -8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[88].setRotationPoint(8F, 2F, 8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 570
		bodyModel[89].setRotationPoint(8F, 6F, 9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[90].setRotationPoint(-12F, 6F, -9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[91].setRotationPoint(-12F, 6F, -11F);

		bodyModel[92].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 573
		bodyModel[92].setRotationPoint(-12F, 3F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[93].setRotationPoint(-12F, 2F, -11F);

		bodyModel[94].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 575
		bodyModel[94].setRotationPoint(-12F, 2F, -8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 576
		bodyModel[95].setRotationPoint(-12F, 6F, 9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[96].setRotationPoint(-12F, 2F, 8F);

		bodyModel[97].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[97].setRotationPoint(1F, -22F, -3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[98].setRotationPoint(-18F, -22F, -5.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274 gp39/40 exhaust
		bodyModel[99].setRotationPoint(-9F, -22.5F, -2.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[100].setRotationPoint(-10F, -21.5F, -4F);

		bodyModel[101].addBox(0F, 0F, 0F, 72, 8, 0, 0F); // Box 38R
		bodyModel[101].setRotationPoint(-36F, -8F, 11F);

		bodyModel[102].addBox(0F, 0F, 0F, 35, 8, 0, 0F); // Box 176
		bodyModel[102].setRotationPoint(-17F, -10F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 313
		bodyModel[103].setRotationPoint(-19F, -10F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[104].setRotationPoint(18F, -10F, -11F);

		bodyModel[105].addBox(0F, 0F, 0F, 16, 8, 0, 0F); // Box 316
		bodyModel[105].setRotationPoint(20F, -8F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[106].setRotationPoint(-40.01F, -7F, -8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		bodyModel[107].setRotationPoint(-40.01F, -7F, 7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[108].setRotationPoint(-14.5F, 2.75F, -10.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[109].setRotationPoint(-14.5F, 1.75F, -10.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[110].setRotationPoint(-14.25F, 3.25F, -10.25F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[111].setRotationPoint(-14.5F, 0.75F, -10.9F);

		bodyModel[112].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 450 cull
		bodyModel[112].setRotationPoint(-42F, 7F, -9F);

		bodyModel[113].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 451 cull
		bodyModel[113].setRotationPoint(-42F, 7F, 3F);

		bodyModel[114].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 453 cull
		bodyModel[114].setRotationPoint(40F, 7F, 3F);

		bodyModel[115].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 455 cull
		bodyModel[115].setRotationPoint(40F, 7F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479 cull
		bodyModel[116].setRotationPoint(40F, 8F, -2F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339 cull
		bodyModel[117].setRotationPoint(-42F, 8F, -2F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 378 cull
		bodyModel[118].setRotationPoint(12F, -21F, 7F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[119].setRotationPoint(10F, -22F, -1F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 282 antenna plate cull
		bodyModel[120].setRotationPoint(-29F, -22F, -2.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[121].setRotationPoint(-28.5F, -23F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[122].setRotationPoint(-36.65F, -12F, -6.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[123].setRotationPoint(-36.65F, -12F, 4.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1251
		bodyModel[124].setRotationPoint(-37F, -13.5F, -1F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1252
		bodyModel[125].setRotationPoint(-3F, -22.5F, -1F);

		bodyModel[126].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1253
		bodyModel[126].setRotationPoint(-3F, -23.5F, -1F);

		bodyModel[127].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1255
		bodyModel[127].setRotationPoint(-4.5F, -23.5F, 0F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 1258
		bodyModel[128].setRotationPoint(-3F, -21.5F, -0.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[129].setRotationPoint(12.5F, -22.01F, 7.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[130].setRotationPoint(12.5F, -23.01F, 7.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[131].setRotationPoint(-40F, 8F, -11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[132].setRotationPoint(-40F, 5F, -10F);

		bodyModel[133].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[133].setRotationPoint(-40F, 7F, -9F);

		bodyModel[134].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 401
		bodyModel[134].setRotationPoint(-40F, 4F, -8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[135].setRotationPoint(-40F, 3F, 7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[136].setRotationPoint(-40F, 1F, 7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[137].setRotationPoint(-40F, 5F, 8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[138].setRotationPoint(-40F, 8F, 9F);

		bodyModel[139].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 394
		bodyModel[139].setRotationPoint(-40F, 7F, 9F);

		bodyModel[140].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
		bodyModel[140].setRotationPoint(-40F, 4F, 8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[141].setRotationPoint(-40F, -8F, 9F);
		bodyModel[141].rotateAngleY = -3.14159265F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[142].setRotationPoint(-15F, 1F, 8.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 538 dynamics longy
		bodyModel[143].setRotationPoint(-8F, -21F, -9F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 539 dynamics longy
		bodyModel[144].setRotationPoint(-8F, -21F, 7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[145].setRotationPoint(14F, -21F, -8F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 366
		bodyModel[146].setRotationPoint(14F, -21F, 7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 48, 1, 6, 0F,-0.25F, 1F, 0F, -27.25F, 1F, 0F, -27.25F, 0F, 0.8F, -0.25F, 0F, 0.8F, -0.25F, -1F, 0F, -27.25F, -1F, 0F, -27.25F, 0F, 0.8F, -0.25F, 0F, 0.8F); // Box 299 big radiator
		bodyModel[147].setRotationPoint(14F, -21.75F, 0.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 48, 1, 6, 0F,-0.25F, 0F, 0.8F, -27.25F, 0F, 0.8F, -27.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0.8F, -27.25F, 0F, 0.8F, -27.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 300 big radiator
		bodyModel[148].setRotationPoint(14F, -21.75F, -6.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 21, 1, 6, 0F,0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 306
		bodyModel[149].setRotationPoint(14F, -22F, -7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 21, 1, 6, 0F,0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 308
		bodyModel[150].setRotationPoint(14F, -22F, 1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 34, 20, 14, 0F,0F, 0F, 0.25F, -17F, 0F, 0.25F, -17F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -10F, 0.25F, -17F, -10F, 0.25F, -17F, -10F, 0.25F, 0F, -10F, 0.25F); // Box 305 vent cull
		bodyModel[151].setRotationPoint(18F, -10F, -7F);

		bodyModel[152].addBox(0F, 0F, 0F, 3, 21, 14, 0F); // Box 567
		bodyModel[152].setRotationPoint(33F, -21F, -7F);

		bodyModel[153].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 264
		bodyModel[153].setRotationPoint(40F, 0F, 10F);
		bodyModel[153].rotateAngleY = -3.14159265F;

		bodyModel[154].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 265
		bodyModel[154].setRotationPoint(40F, 7F, 11F);
		bodyModel[154].rotateAngleY = -3.14159265F;

		bodyModel[155].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 266
		bodyModel[155].setRotationPoint(40F, 8F, 9F);
		bodyModel[155].rotateAngleY = -3.14159265F;

		bodyModel[156].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 267
		bodyModel[156].setRotationPoint(40F, -1F, 11F);
		bodyModel[156].rotateAngleY = -3.14159265F;

		bodyModel[157].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 268
		bodyModel[157].setRotationPoint(40F, -1F, -10F);
		bodyModel[157].rotateAngleY = -3.14159265F;

		bodyModel[158].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 269
		bodyModel[158].setRotationPoint(41F, -8F, -4F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 270
		bodyModel[159].setRotationPoint(40F, -8F, -6F);

		bodyModel[160].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 271
		bodyModel[160].setRotationPoint(40F, -8F, -8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[161].setRotationPoint(40F, -8F, 4F);

		bodyModel[162].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 273
		bodyModel[162].setRotationPoint(40F, -8F, 6F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 274
		bodyModel[163].setRotationPoint(40F, -8F, 9F);
		bodyModel[163].rotateAngleY = -3.14159265F;

		bodyModel[164].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 275
		bodyModel[164].setRotationPoint(40F, -8F, -8F);
		bodyModel[164].rotateAngleY = -3.14159265F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 276
		bodyModel[165].setRotationPoint(40.01F, -7F, -8F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[166].setRotationPoint(40.01F, -7F, 7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[167].setRotationPoint(-41F, 0F, 5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[168].setRotationPoint(-41F, 0F, -5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[169].setRotationPoint(-41F, 0F, -6F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[170].setRotationPoint(40F, 0F, -5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[171].setRotationPoint(40F, 0F, -6F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[172].setRotationPoint(40F, 0F, 5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[173].setRotationPoint(35F, 5F, 7F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[174].setRotationPoint(35F, 1F, 7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[175].setRotationPoint(35F, 0F, 7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Box 287
		bodyModel[176].setRotationPoint(35F, 5F, -11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 288
		bodyModel[177].setRotationPoint(35F, 1F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[178].setRotationPoint(35F, 0F, -11F);

		bodyModel[179].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 290
		bodyModel[179].setRotationPoint(36F, 7F, 9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 291
		bodyModel[180].setRotationPoint(36F, 8F, 9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 292
		bodyModel[181].setRotationPoint(36F, 5F, 8F);

		bodyModel[182].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 293
		bodyModel[182].setRotationPoint(36F, 4F, 8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[183].setRotationPoint(36F, 3F, 7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 295
		bodyModel[184].setRotationPoint(37F, 1F, 7F);

		bodyModel[185].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 296
		bodyModel[185].setRotationPoint(36F, 7F, -9F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[186].setRotationPoint(36F, 8F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[187].setRotationPoint(36F, 5F, -10F);

		bodyModel[188].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 299
		bodyModel[188].setRotationPoint(36F, 4F, -8F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[189].setRotationPoint(36F, 3F, -9F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[190].setRotationPoint(37F, 1F, -8F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[191].setRotationPoint(36F, -21F, -7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[192].setRotationPoint(36F, -21F, 0F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[193].setRotationPoint(35.65F, -12F, -6.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[194].setRotationPoint(35.65F, -12F, 4.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[195].setRotationPoint(-36F, -21F, 0F);
		bodyModel[195].rotateAngleY = -3.14159265F;

		bodyModel[196].addShapeBox(0F, 0F, -14F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[196].setRotationPoint(-36F, -21F, -7F);
		bodyModel[196].rotateAngleY = -3.14159265F;

		bodyModel[197].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[197].setRotationPoint(-37.25F, -19F, 2F);
		bodyModel[197].rotateAngleY = -3.14159265F;

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 247 headlight 2 beam
		bodyModel[198].setRotationPoint(-39F, -19F, 0F);
		bodyModel[198].rotateAngleY = -3.14159265F;

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 248 headlight 2 beam
		bodyModel[199].setRotationPoint(-39F, -19F, 2F);
		bodyModel[199].rotateAngleY = -3.14159265F;

		bodyModel[200].addBox(0F, 0F, 0F, 2, 8, 14, 0F); // Box 311
		bodyModel[200].setRotationPoint(-36F, -21F, -7F);

		bodyModel[201].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 312
		bodyModel[201].setRotationPoint(-19F, -2F, -11F);

		bodyModel[202].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 243
		bodyModel[202].setRotationPoint(36F, -8F, 9F);

		bodyModel[203].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 250
		bodyModel[203].setRotationPoint(36F, -8F, -11F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 542
		bodyModel[204].setRotationPoint(36F, -3F, -11.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 543
		bodyModel[205].setRotationPoint(36F, -3F, 10.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 243
		bodyModel[206].setRotationPoint(-36F, -8F, 9F);

		bodyModel[207].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 250
		bodyModel[207].setRotationPoint(-36F, -8F, -11F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 542
		bodyModel[208].setRotationPoint(-36F, -3F, -11.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 543
		bodyModel[209].setRotationPoint(-36F, -3F, 10.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 17, 8, 0, 0F); // Box 321
		bodyModel[210].setRotationPoint(-36F, -8F, -11F);

		bodyModel[211].addShapeBox(-1F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115 numberboard rear
		bodyModel[211].setRotationPoint(36.45F, -16.5F, -6F);
		bodyModel[211].rotateAngleY = -0.41887902F;

		bodyModel[212].addShapeBox(-1F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116 numberboard rear
		bodyModel[212].setRotationPoint(36.45F, -16.5F, 6F);
		bodyModel[212].rotateAngleY = 0.41887902F;

		bodyModel[213].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 350 numberboard hh
		bodyModel[213].setRotationPoint(-36.5F, -16.5F, 6F);
		bodyModel[213].rotateAngleY = -0.40142573F;

		bodyModel[214].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 351 numberboard hh
		bodyModel[214].setRotationPoint(-36.5F, -16.5F, -6F);
		bodyModel[214].rotateAngleY = 0.40142573F;

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight ane f
		bodyModel[215].setRotationPoint(-41.25F, -3F, 4F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412  ditchlight ane f
		bodyModel[216].setRotationPoint(-41.25F, -3F, -6F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411 ane ditchlight mount
		bodyModel[217].setRotationPoint(-41F, -3F, 4F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410 ane ditchlight mount
		bodyModel[218].setRotationPoint(-41F, -3F, -6F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 417 ditchlight ane r
		bodyModel[219].setRotationPoint(40.25F, -3F, 4F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 416 ditchlight ane r
		bodyModel[220].setRotationPoint(40.25F, -3F, -6F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 415 ane ditchlight mount
		bodyModel[221].setRotationPoint(40F, -3F, -6F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 414 ane ditchlight mount
		bodyModel[222].setRotationPoint(40F, -3F, 4F);
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