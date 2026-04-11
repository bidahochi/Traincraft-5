//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.02.2023 - 00:41:54
// Last changed on: 19.02.2023 - 00:41:54

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Late;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Mid;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.enums.BoxName;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelSDP45 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSDP45() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[351];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 284, 64, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 12, 125, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 284, 70, textureX, textureY); // Box 159
		bodyModel[3] = new ModelRendererTurbo(this, 12, 135, textureX, textureY); // Box 226
		bodyModel[4] = new ModelRendererTurbo(this, 10, 131, textureX, textureY); // Box 227
		bodyModel[5] = new ModelRendererTurbo(this, 53, 152, textureX, textureY); // Box 164
		bodyModel[6] = new ModelRendererTurbo(this, 1, 152, textureX, textureY); // Box 259
		bodyModel[7] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 262
		bodyModel[8] = new ModelRendererTurbo(this, 53, 160, textureX, textureY); // Box 264
		bodyModel[9] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 265
		bodyModel[10] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 261
		bodyModel[11] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 274
		bodyModel[12] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 451
		bodyModel[13] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 272
		bodyModel[14] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 273
		bodyModel[15] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 275
		bodyModel[16] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 276
		bodyModel[17] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 333
		bodyModel[18] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 334
		bodyModel[19] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 335
		bodyModel[20] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 336
		bodyModel[21] = new ModelRendererTurbo(this, 266, 92, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 454, 169, textureX, textureY); // Box 408
		bodyModel[23] = new ModelRendererTurbo(this, 264, 123, textureX, textureY); // Box 63
		bodyModel[24] = new ModelRendererTurbo(this, 264, 76, textureX, textureY); // Box 170
		bodyModel[25] = new ModelRendererTurbo(this, 285, 110, textureX, textureY); // Box 129
		bodyModel[26] = new ModelRendererTurbo(this, 483, 185, textureX, textureY); // Box 130
		bodyModel[27] = new ModelRendererTurbo(this, 282, 110, textureX, textureY); // Box 133
		bodyModel[28] = new ModelRendererTurbo(this, 487, 180, textureX, textureY); // Box 134
		bodyModel[29] = new ModelRendererTurbo(this, 300, 110, textureX, textureY); // Box 192
		bodyModel[30] = new ModelRendererTurbo(this, 297, 110, textureX, textureY); // Box 193
		bodyModel[31] = new ModelRendererTurbo(this, 483, 185, textureX, textureY); // Box 194
		bodyModel[32] = new ModelRendererTurbo(this, 487, 180, textureX, textureY); // Box 195
		bodyModel[33] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 4
		bodyModel[34] = new ModelRendererTurbo(this, 475, 81, textureX, textureY); // Box 203
		bodyModel[35] = new ModelRendererTurbo(this, 454, 169, textureX, textureY); // Box 100
		bodyModel[36] = new ModelRendererTurbo(this, 371, 109, textureX, textureY); // Box 113
		bodyModel[37] = new ModelRendererTurbo(this, 357, 114, textureX, textureY); // Box 116
		bodyModel[38] = new ModelRendererTurbo(this, 312, 109, textureX, textureY); // Box 196
		bodyModel[39] = new ModelRendererTurbo(this, 360, 114, textureX, textureY); // Box 197
		bodyModel[40] = new ModelRendererTurbo(this, 371, 109, textureX, textureY); // Box 111
		bodyModel[41] = new ModelRendererTurbo(this, 357, 114, textureX, textureY); // Box 112
		bodyModel[42] = new ModelRendererTurbo(this, 312, 109, textureX, textureY); // Box 113
		bodyModel[43] = new ModelRendererTurbo(this, 360, 114, textureX, textureY); // Box 114
		bodyModel[44] = new ModelRendererTurbo(this, 261, 74, textureX, textureY); // Box 163
		bodyModel[45] = new ModelRendererTurbo(this, 475, 75, textureX, textureY); // Box 166
		bodyModel[46] = new ModelRendererTurbo(this, 208, 177, textureX, textureY); // Box 489
		bodyModel[47] = new ModelRendererTurbo(this, 310, 153, textureX, textureY); // Box 278
		bodyModel[48] = new ModelRendererTurbo(this, 311, 159, textureX, textureY); // Box 281
		bodyModel[49] = new ModelRendererTurbo(this, 212, 181, textureX, textureY); // Box 288
		bodyModel[50] = new ModelRendererTurbo(this, 310, 172, textureX, textureY); // Box 315
		bodyModel[51] = new ModelRendererTurbo(this, 311, 165, textureX, textureY); // Box 316
		bodyModel[52] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Box 559
		bodyModel[53] = new ModelRendererTurbo(this, 185, 154, textureX, textureY); // Box 564
		bodyModel[54] = new ModelRendererTurbo(this, 186, 166, textureX, textureY); // Box 565
		bodyModel[55] = new ModelRendererTurbo(this, 181, 150, textureX, textureY); // Box 566
		bodyModel[56] = new ModelRendererTurbo(this, 184, 161, textureX, textureY); // Box 567
		bodyModel[57] = new ModelRendererTurbo(this, 187, 156, textureX, textureY); // Box 568
		bodyModel[58] = new ModelRendererTurbo(this, 184, 161, textureX, textureY); // Box 569
		bodyModel[59] = new ModelRendererTurbo(this, 186, 166, textureX, textureY); // Box 570
		bodyModel[60] = new ModelRendererTurbo(this, 227, 149, textureX, textureY); // Box 571
		bodyModel[61] = new ModelRendererTurbo(this, 226, 161, textureX, textureY); // Box 572
		bodyModel[62] = new ModelRendererTurbo(this, 223, 145, textureX, textureY); // Box 573
		bodyModel[63] = new ModelRendererTurbo(this, 226, 156, textureX, textureY); // Box 574
		bodyModel[64] = new ModelRendererTurbo(this, 280, 176, textureX, textureY); // Box 576
		bodyModel[65] = new ModelRendererTurbo(this, 278, 171, textureX, textureY); // Box 577
		bodyModel[66] = new ModelRendererTurbo(this, 272, 152, textureX, textureY); // Box 562
		bodyModel[67] = new ModelRendererTurbo(this, 311, 177, textureX, textureY); // Box 563
		bodyModel[68] = new ModelRendererTurbo(this, 281, 166, textureX, textureY); // Box 575
		bodyModel[69] = new ModelRendererTurbo(this, 330, 137, textureX, textureY); // Box 436
		bodyModel[70] = new ModelRendererTurbo(this, 325, 137, textureX, textureY); // Box 437
		bodyModel[71] = new ModelRendererTurbo(this, 330, 142, textureX, textureY); // Box 438
		bodyModel[72] = new ModelRendererTurbo(this, 325, 142, textureX, textureY); // Box 439
		bodyModel[73] = new ModelRendererTurbo(this, 11, 136, textureX, textureY); // Box 61
		bodyModel[74] = new ModelRendererTurbo(this, 51, 136, textureX, textureY); // Box 63
		bodyModel[75] = new ModelRendererTurbo(this, 41, 134, textureX, textureY); // Box 144
		bodyModel[76] = new ModelRendererTurbo(this, 19, 134, textureX, textureY); // Box 148
		bodyModel[77] = new ModelRendererTurbo(this, 42, 133, textureX, textureY); // Box 363
		bodyModel[78] = new ModelRendererTurbo(this, 20, 133, textureX, textureY); // Box 870
		bodyModel[79] = new ModelRendererTurbo(this, 14, 136, textureX, textureY); // Box 559
		bodyModel[80] = new ModelRendererTurbo(this, 48, 136, textureX, textureY); // Box 143
		bodyModel[81] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 302
		bodyModel[82] = new ModelRendererTurbo(this, 21, 122, textureX, textureY); // Box 303
		bodyModel[83] = new ModelRendererTurbo(this, 34, 129, textureX, textureY); // Box 304
		bodyModel[84] = new ModelRendererTurbo(this, 37, 132, textureX, textureY); // Box 80
		bodyModel[85] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[86] = new ModelRendererTurbo(this, 23, 132, textureX, textureY); // Box 147
		bodyModel[87] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[88] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[89] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 5
		bodyModel[90] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[91] = new ModelRendererTurbo(this, 150, 145, textureX, textureY); // Box 440 honse
		bodyModel[92] = new ModelRendererTurbo(this, 5, 175, textureX, textureY); // Box 396
		bodyModel[93] = new ModelRendererTurbo(this, 5, 187, textureX, textureY); // Box 397
		bodyModel[94] = new ModelRendererTurbo(this, 5, 170, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[95] = new ModelRendererTurbo(this, 5, 182, textureX, textureY); // Box 399 not a ditchlight will not glow
		bodyModel[96] = new ModelRendererTurbo(this, 57, 191, textureX, textureY); // Box 22
		bodyModel[97] = new ModelRendererTurbo(this, 44, 194, textureX, textureY); // Box 23
		bodyModel[98] = new ModelRendererTurbo(this, 27, 192, textureX, textureY); // Box 4
		bodyModel[99] = new ModelRendererTurbo(this, 10, 194, textureX, textureY); // Box 4
		bodyModel[100] = new ModelRendererTurbo(this, 81, 176, textureX, textureY); // Box 280
		bodyModel[101] = new ModelRendererTurbo(this, 70, 191, textureX, textureY); // Box 285
		bodyModel[102] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 416 ditchlight front b
		bodyModel[103] = new ModelRendererTurbo(this, 19, 163, textureX, textureY); // Box 417
		bodyModel[104] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 418 ditchlight front b
		bodyModel[105] = new ModelRendererTurbo(this, 19, 163, textureX, textureY); // Box 419
		bodyModel[106] = new ModelRendererTurbo(this, 15, 123, textureX, textureY, "cull"); // Box 101 cull
		bodyModel[107] = new ModelRendererTurbo(this, 8, 123, textureX, textureY, BoxName.ditch); // Box 275 ditchlight f d
		bodyModel[108] = new ModelRendererTurbo(this, 15, 123, textureX, textureY, "cull"); // Box 444 cull
		bodyModel[109] = new ModelRendererTurbo(this, 8, 123, textureX, textureY, BoxName.ditch); // Box 445 ditchlight f d
		bodyModel[110] = new ModelRendererTurbo(this, 70, 134, textureX, textureY); // Box 368
		bodyModel[111] = new ModelRendererTurbo(this, 79, 134, textureX, textureY); // Box 369
		bodyModel[112] = new ModelRendererTurbo(this, 35, 172, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[113] = new ModelRendererTurbo(this, 32, 166, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[114] = new ModelRendererTurbo(this, 3, 73, textureX, textureY); // Box 318
		bodyModel[115] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Box 299 nose cover
		bodyModel[116] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 296 nose cover
		bodyModel[117] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 48
		bodyModel[118] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 42
		bodyModel[119] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 345
		bodyModel[120] = new ModelRendererTurbo(this, 41, 46, textureX, textureY); // Box 43
		bodyModel[121] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 45
		bodyModel[122] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 245
		bodyModel[123] = new ModelRendererTurbo(this, 87, 103, textureX, textureY); // Box 246
		bodyModel[124] = new ModelRendererTurbo(this, 81, 2, textureX, textureY); // box64
		bodyModel[125] = new ModelRendererTurbo(this, 86, 41, textureX, textureY); // Box 224
		bodyModel[126] = new ModelRendererTurbo(this, 34, 41, textureX, textureY); // Box 223
		bodyModel[127] = new ModelRendererTurbo(this, 104, 4, textureX, textureY); // Box 222
		bodyModel[128] = new ModelRendererTurbo(this, 104, 12, textureX, textureY); // Box 221
		bodyModel[129] = new ModelRendererTurbo(this, 119, 6, textureX, textureY); // Box 220
		bodyModel[130] = new ModelRendererTurbo(this, 34, 23, textureX, textureY); // Box 219
		bodyModel[131] = new ModelRendererTurbo(this, 72, 44, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[132] = new ModelRendererTurbo(this, 79, 42, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[133] = new ModelRendererTurbo(this, 62, 44, textureX, textureY); // Box 44
		bodyModel[134] = new ModelRendererTurbo(this, 82, 49, textureX, textureY); // Box 43
		bodyModel[135] = new ModelRendererTurbo(this, 78, 47, textureX, textureY); // Box 48
		bodyModel[136] = new ModelRendererTurbo(this, 66, 23, textureX, textureY); // Box 211
		bodyModel[137] = new ModelRendererTurbo(this, 27, 37, textureX, textureY); // Box 210
		bodyModel[138] = new ModelRendererTurbo(this, 93, 37, textureX, textureY); // Box 11
		bodyModel[139] = new ModelRendererTurbo(this, 101, 23, textureX, textureY); // Box 316
		bodyModel[140] = new ModelRendererTurbo(this, 69, 18, textureX, textureY); // Box 314 door swing right
		bodyModel[141] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 313
		bodyModel[142] = new ModelRendererTurbo(this, 30, 6, textureX, textureY); // Box 190
		bodyModel[143] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 72
		bodyModel[144] = new ModelRendererTurbo(this, 83, 4, textureX, textureY); // Box 70
		bodyModel[145] = new ModelRendererTurbo(this, 51, 18, textureX, textureY); // Box 52 door swing right
		bodyModel[146] = new ModelRendererTurbo(this, 77, 71, textureX, textureY, "lamp"); // Box 117 numberboard front
		bodyModel[147] = new ModelRendererTurbo(this, 69, 68, textureX, textureY, "lamp"); // Box 118 numberboard front
		bodyModel[148] = new ModelRendererTurbo(this, 65, 55, textureX, textureY); // Box 133
		bodyModel[149] = new ModelRendererTurbo(this, 3, 133, textureX, textureY); // Box 176
		bodyModel[150] = new ModelRendererTurbo(this, 6, 125, textureX, textureY); // Box 177
		bodyModel[151] = new ModelRendererTurbo(this, 92, 130, textureX, textureY); // Box 267
		bodyModel[152] = new ModelRendererTurbo(this, 97, 136, textureX, textureY); // Box 424
		bodyModel[153] = new ModelRendererTurbo(this, 323, 29, textureX, textureY); // Box 34
		bodyModel[154] = new ModelRendererTurbo(this, 331, 22, textureX, textureY); // Box 285
		bodyModel[155] = new ModelRendererTurbo(this, 331, 15, textureX, textureY); // Box 286
		bodyModel[156] = new ModelRendererTurbo(this, 501, 124, textureX, textureY); // Box 259
		bodyModel[157] = new ModelRendererTurbo(this, 501, 121, textureX, textureY); // Box 259
		bodyModel[158] = new ModelRendererTurbo(this, 506, 124, textureX, textureY); // Box 259
		bodyModel[159] = new ModelRendererTurbo(this, 506, 121, textureX, textureY); // Box 259
		bodyModel[160] = new ModelRendererTurbo(this, 476, 151, textureX, textureY); // Box 319
		bodyModel[161] = new ModelRendererTurbo(this, 476, 156, textureX, textureY); // Box 319
		bodyModel[162] = new ModelRendererTurbo(this, 476, 161, textureX, textureY); // Box 319
		bodyModel[163] = new ModelRendererTurbo(this, 465, 151, textureX, textureY); // Box 319
		bodyModel[164] = new ModelRendererTurbo(this, 465, 156, textureX, textureY); // Box 319
		bodyModel[165] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 319
		bodyModel[166] = new ModelRendererTurbo(this, 474, 166, textureX, textureY); // Box 329
		bodyModel[167] = new ModelRendererTurbo(this, 463, 166, textureX, textureY); // Box 323
		bodyModel[168] = new ModelRendererTurbo(this, 474, 153, textureX, textureY); // Box 329
		bodyModel[169] = new ModelRendererTurbo(this, 474, 158, textureX, textureY); // Box 327
		bodyModel[170] = new ModelRendererTurbo(this, 474, 163, textureX, textureY); // Box 326
		bodyModel[171] = new ModelRendererTurbo(this, 463, 153, textureX, textureY); // Box 323
		bodyModel[172] = new ModelRendererTurbo(this, 463, 158, textureX, textureY); // Box 322
		bodyModel[173] = new ModelRendererTurbo(this, 463, 163, textureX, textureY); // Box 319
		bodyModel[174] = new ModelRendererTurbo(this, 481, 112, textureX, textureY); // Box 266
		bodyModel[175] = new ModelRendererTurbo(this, 475, 96, textureX, textureY); // Box 265
		bodyModel[176] = new ModelRendererTurbo(this, 488, 124, textureX, textureY); // Box 264
		bodyModel[177] = new ModelRendererTurbo(this, 493, 96, textureX, textureY); // Box 262
		bodyModel[178] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 261
		bodyModel[179] = new ModelRendererTurbo(this, 484, 92, textureX, textureY); // Box 259
		bodyModel[180] = new ModelRendererTurbo(this, 488, 116, textureX, textureY); // Box 164
		bodyModel[181] = new ModelRendererTurbo(this, 460, 128, textureX, textureY); // Box 225
		bodyModel[182] = new ModelRendererTurbo(this, 458, 117, textureX, textureY); // Box 3
		bodyModel[183] = new ModelRendererTurbo(this, 369, 141, textureX, textureY); // Box 202
		bodyModel[184] = new ModelRendererTurbo(this, 394, 140, textureX, textureY); // Box 364
		bodyModel[185] = new ModelRendererTurbo(this, 481, 116, textureX, textureY); // Box 468
		bodyModel[186] = new ModelRendererTurbo(this, 373, 110, textureX, textureY); // Box 644
		bodyModel[187] = new ModelRendererTurbo(this, 373, 110, textureX, textureY); // Box 645
		bodyModel[188] = new ModelRendererTurbo(this, 467, 114, textureX, textureY); // Box 234
		bodyModel[189] = new ModelRendererTurbo(this, 503, 138, textureX, textureY); // Box 234
		bodyModel[190] = new ModelRendererTurbo(this, 470, 108, textureX, textureY); // Box 251
		bodyModel[191] = new ModelRendererTurbo(this, 509, 132, textureX, textureY); // Box 241
		bodyModel[192] = new ModelRendererTurbo(this, 459, 173, textureX, textureY); // Box 234
		bodyModel[193] = new ModelRendererTurbo(this, 506, 132, textureX, textureY); // Box 63
		bodyModel[194] = new ModelRendererTurbo(this, 473, 108, textureX, textureY); // Box 61
		bodyModel[195] = new ModelRendererTurbo(this, 503, 136, textureX, textureY); // Box 427
		bodyModel[196] = new ModelRendererTurbo(this, 500, 136, textureX, textureY); // Box 428
		bodyModel[197] = new ModelRendererTurbo(this, 118, 125, textureX, textureY); // Box 291
		bodyModel[198] = new ModelRendererTurbo(this, 125, 123, textureX, textureY); // Box 306
		bodyModel[199] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 307
		bodyModel[200] = new ModelRendererTurbo(this, 115, 123, textureX, textureY); // Box 868
		bodyModel[201] = new ModelRendererTurbo(this, 201, 123, textureX, textureY); // Box 291
		bodyModel[202] = new ModelRendererTurbo(this, 208, 123, textureX, textureY); // Box 315
		bodyModel[203] = new ModelRendererTurbo(this, 198, 123, textureX, textureY); // Box 315
		bodyModel[204] = new ModelRendererTurbo(this, 238, 93, textureX, textureY); // Box 36
		bodyModel[205] = new ModelRendererTurbo(this, 211, 123, textureX, textureY); // Box 315
		bodyModel[206] = new ModelRendererTurbo(this, 229, 135, textureX, textureY); // Box 316
		bodyModel[207] = new ModelRendererTurbo(this, 118, 135, textureX, textureY); // Box 312
		bodyModel[208] = new ModelRendererTurbo(this, 309, 116, textureX, textureY); // Box 36
		bodyModel[209] = new ModelRendererTurbo(this, 371, 22, textureX, textureY); // Box 100
		bodyModel[210] = new ModelRendererTurbo(this, 371, 15, textureX, textureY); // Box 101
		bodyModel[211] = new ModelRendererTurbo(this, 356, 22, textureX, textureY); // Box 102
		bodyModel[212] = new ModelRendererTurbo(this, 356, 15, textureX, textureY); // Box 105
		bodyModel[213] = new ModelRendererTurbo(this, 470, 13, textureX, textureY); // Box 377
		bodyModel[214] = new ModelRendererTurbo(this, 459, 19, textureX, textureY); // Box 378
		bodyModel[215] = new ModelRendererTurbo(this, 459, 1, textureX, textureY); // Box 380
		bodyModel[216] = new ModelRendererTurbo(this, 485, 13, textureX, textureY); // Box 376
		bodyModel[217] = new ModelRendererTurbo(this, 498, 29, textureX, textureY); // Box 379
		bodyModel[218] = new ModelRendererTurbo(this, 498, 38, textureX, textureY); // Box 148
		bodyModel[219] = new ModelRendererTurbo(this, 448, 180, textureX, textureY); // Box 425
		bodyModel[220] = new ModelRendererTurbo(this, 448, 180, textureX, textureY); // Box 427
		bodyModel[221] = new ModelRendererTurbo(this, 111, 134, textureX, textureY); // Box 313
		bodyModel[222] = new ModelRendererTurbo(this, 117, 107, textureX, textureY); // Box 303
		bodyModel[223] = new ModelRendererTurbo(this, 113, 102, textureX, textureY); // Box 304
		bodyModel[224] = new ModelRendererTurbo(this, 112, 107, textureX, textureY); // Box 305
		bodyModel[225] = new ModelRendererTurbo(this, 108, 102, textureX, textureY); // Box 836
		bodyModel[226] = new ModelRendererTurbo(this, 496, 47, textureX, textureY); // Box 31
		bodyModel[227] = new ModelRendererTurbo(this, 505, 52, textureX, textureY, "lamp"); // Box 294 lamp rear short SDP40
		bodyModel[228] = new ModelRendererTurbo(this, 505, 47, textureX, textureY, "lamp"); // Box 294 lamp rear short SDP40
		bodyModel[229] = new ModelRendererTurbo(this, 488, 35, textureX, textureY); // Box 318
		bodyModel[230] = new ModelRendererTurbo(this, 480, 28, textureX, textureY); // Box 318
		bodyModel[231] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 318
		bodyModel[232] = new ModelRendererTurbo(this, 492, 39, textureX, textureY); // Box 318
		bodyModel[233] = new ModelRendererTurbo(this, 434, 2, textureX, textureY); // Box 276
		bodyModel[234] = new ModelRendererTurbo(this, 415, 5, textureX, textureY); // Box 277
		bodyModel[235] = new ModelRendererTurbo(this, 396, 2, textureX, textureY); // Box 279
		bodyModel[236] = new ModelRendererTurbo(this, 376, 5, textureX, textureY); // Box 280
		bodyModel[237] = new ModelRendererTurbo(this, 357, 3, textureX, textureY); // Box 278
		bodyModel[238] = new ModelRendererTurbo(this, 340, 3, textureX, textureY); // Box 275
		bodyModel[239] = new ModelRendererTurbo(this, 306, 19, textureX, textureY); // Box 274
		bodyModel[240] = new ModelRendererTurbo(this, 306, 1, textureX, textureY); // Box 273
		bodyModel[241] = new ModelRendererTurbo(this, 39, 83, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[242] = new ModelRendererTurbo(this, 39, 83, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[243] = new ModelRendererTurbo(this, 302, 50, textureX, textureY); // Box 271
		bodyModel[244] = new ModelRendererTurbo(this, 302, 45, textureX, textureY); // Box 272
		bodyModel[245] = new ModelRendererTurbo(this, 206, 209, textureX, textureY); // Box 558
		bodyModel[246] = new ModelRendererTurbo(this, 239, 209, textureX, textureY); // Box 560
		bodyModel[247] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 561
		bodyModel[248] = new ModelRendererTurbo(this, 206, 209, textureX, textureY); // Box 562
		bodyModel[249] = new ModelRendererTurbo(this, 239, 209, textureX, textureY); // Box 563
		bodyModel[250] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 564
		bodyModel[251] = new ModelRendererTurbo(this, 104, 134, textureX, textureY); // Box 61
		bodyModel[252] = new ModelRendererTurbo(this, 54, 127, textureX, textureY); // Box 81
		bodyModel[253] = new ModelRendererTurbo(this, 51, 128, textureX, textureY); // Box 81
		bodyModel[254] = new ModelRendererTurbo(this, 106, 136, textureX, textureY); // Box 174
		bodyModel[255] = new ModelRendererTurbo(this, 100, 136, textureX, textureY); // Box 191
		bodyModel[256] = new ModelRendererTurbo(this, 102, 132, textureX, textureY); // Box 280
		bodyModel[257] = new ModelRendererTurbo(this, 48, 75, textureX, textureY); // Box 298
		bodyModel[258] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 43
		bodyModel[259] = new ModelRendererTurbo(this, 23, 92, textureX, textureY); // Box 42
		bodyModel[260] = new ModelRendererTurbo(this, 27, 84, textureX, textureY); // Box 298
		bodyModel[261] = new ModelRendererTurbo(this, 31, 73, textureX, textureY); // Box 319
		bodyModel[262] = new ModelRendererTurbo(this, 79, 59, textureX, textureY); // Box 43
		bodyModel[263] = new ModelRendererTurbo(this, 17, 104, textureX, textureY); // Box 42
		bodyModel[264] = new ModelRendererTurbo(this, 51, 78, textureX, textureY); // Box 43
		bodyModel[265] = new ModelRendererTurbo(this, 50, 73, textureX, textureY); // Box 294
		bodyModel[266] = new ModelRendererTurbo(this, 52, 75, textureX, textureY); // Box 43
		bodyModel[267] = new ModelRendererTurbo(this, 97, 54, textureX, textureY); // Box 356
		bodyModel[268] = new ModelRendererTurbo(this, 104, 37, textureX, textureY); // Box 355 brakewheel
		bodyModel[269] = new ModelRendererTurbo(this, 205, 41, textureX, textureY); // BN iceical breakers
		bodyModel[270] = new ModelRendererTurbo(this, 211, 38, textureX, textureY); // BN iceical breakers
		bodyModel[271] = new ModelRendererTurbo(this, 191, 40, textureX, textureY); // BN iceical breakers
		bodyModel[272] = new ModelRendererTurbo(this, 211, 42, textureX, textureY); // BN iceical breakers
		bodyModel[273] = new ModelRendererTurbo(this, 188, 40, textureX, textureY); // BN iceical breakers
		bodyModel[274] = new ModelRendererTurbo(this, 205, 37, textureX, textureY); // BN iceical breakers
		bodyModel[275] = new ModelRendererTurbo(this, 172, 32, textureX, textureY); // Box 484
		bodyModel[276] = new ModelRendererTurbo(this, 172, 29, textureX, textureY); // Box 485
		bodyModel[277] = new ModelRendererTurbo(this, 170, 35, textureX, textureY); // Box 486
		bodyModel[278] = new ModelRendererTurbo(this, 179, 31, textureX, textureY); // Box 487
		bodyModel[279] = new ModelRendererTurbo(this, 191, 48, textureX, textureY); // M5 Hork
		bodyModel[280] = new ModelRendererTurbo(this, 191, 51, textureX, textureY); // M5 Hork
		bodyModel[281] = new ModelRendererTurbo(this, 179, 46, textureX, textureY); // M5 Hork
		bodyModel[282] = new ModelRendererTurbo(this, 179, 49, textureX, textureY); // M5 Hork
		bodyModel[283] = new ModelRendererTurbo(this, 191, 54, textureX, textureY); // M5 Hork
		bodyModel[284] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 282
		bodyModel[285] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 408
		bodyModel[286] = new ModelRendererTurbo(this, 81, 188, textureX, textureY); // Box 448
		bodyModel[287] = new ModelRendererTurbo(this, 59, 180, textureX, textureY); // Box 323
		bodyModel[288] = new ModelRendererTurbo(this, 92, 186, textureX, textureY); // Box 280
		bodyModel[289] = new ModelRendererTurbo(this, 70, 178, textureX, textureY); // Box 285
		bodyModel[290] = new ModelRendererTurbo(this, 149, 25, textureX, textureY); // Box 430
		bodyModel[291] = new ModelRendererTurbo(this, 73, 7, textureX, textureY); // Box 351
		bodyModel[292] = new ModelRendererTurbo(this, 55, 12, textureX, textureY); // Box 350
		bodyModel[293] = new ModelRendererTurbo(this, 33, 2, textureX, textureY); // box65
		bodyModel[294] = new ModelRendererTurbo(this, 200, 21, textureX, textureY); // Box 320
		bodyModel[295] = new ModelRendererTurbo(this, 200, 18, textureX, textureY); // Box 321
		bodyModel[296] = new ModelRendererTurbo(this, 198, 14, textureX, textureY); // Box 323
		bodyModel[297] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 329
		bodyModel[298] = new ModelRendererTurbo(this, 250, 49, textureX, textureY); // Box 415
		bodyModel[299] = new ModelRendererTurbo(this, 250, 55, textureX, textureY); // Box 415
		bodyModel[300] = new ModelRendererTurbo(this, 190, 19, textureX, textureY); // Box 401
		bodyModel[301] = new ModelRendererTurbo(this, 191, 21, textureX, textureY); // Box 402
		bodyModel[302] = new ModelRendererTurbo(this, 207, 20, textureX, textureY); // Box 421 prime base
		bodyModel[303] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[304] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[305] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[306] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[307] = new ModelRendererTurbo(this, 218, 12, textureX, textureY); // Box 409
		bodyModel[308] = new ModelRendererTurbo(this, 219, 8, textureX, textureY, BoxName.commander); // Box 410 glow commander
		bodyModel[309] = new ModelRendererTurbo(this, 267, 35, textureX, textureY); // Box 384
		bodyModel[310] = new ModelRendererTurbo(this, 269, 32, textureX, textureY); // Box 385
		bodyModel[311] = new ModelRendererTurbo(this, 269, 29, textureX, textureY); // Box 386
		bodyModel[312] = new ModelRendererTurbo(this, 276, 32, textureX, textureY); // Box 387
		bodyModel[313] = new ModelRendererTurbo(this, 208, 42, textureX, textureY); // Box 345
		bodyModel[314] = new ModelRendererTurbo(this, 208, 38, textureX, textureY); // Box 346
		bodyModel[315] = new ModelRendererTurbo(this, 191, 37, textureX, textureY); // Box 348
		bodyModel[316] = new ModelRendererTurbo(this, 202, 41, textureX, textureY); // Box 349
		bodyModel[317] = new ModelRendererTurbo(this, 426, 170, textureX, textureY, "cull"); // Box 196 winterization hatch
		bodyModel[318] = new ModelRendererTurbo(this, 174, 22, textureX, textureY); // Box 373
		bodyModel[319] = new ModelRendererTurbo(this, 184, 9, textureX, textureY); // Box 114
		bodyModel[320] = new ModelRendererTurbo(this, 184, 6, textureX, textureY); // Box 74
		bodyModel[321] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Box 78
		bodyModel[322] = new ModelRendererTurbo(this, 183, 2, textureX, textureY, "cull"); // Box 1007 cull
		bodyModel[323] = new ModelRendererTurbo(this, 269, 23, textureX, textureY); // Box 278
		bodyModel[324] = new ModelRendererTurbo(this, 269, 20, textureX, textureY); // Box 279
		bodyModel[325] = new ModelRendererTurbo(this, 269, 17, textureX, textureY); // Box 280
		bodyModel[326] = new ModelRendererTurbo(this, 264, 20, textureX, textureY); // Box 214
		bodyModel[327] = new ModelRendererTurbo(this, 96, 76, textureX, textureY); // Box 352
		bodyModel[328] = new ModelRendererTurbo(this, 118, 164, textureX, textureY); // Box 527 cab backpannel
		bodyModel[329] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 86
		bodyModel[330] = new ModelRendererTurbo(this, 96, 164, textureX, textureY); // Box 413
		bodyModel[331] = new ModelRendererTurbo(this, 119, 162, textureX, textureY); // Box 412
		bodyModel[332] = new ModelRendererTurbo(this, 76, 107, textureX, textureY); // Box 409
		bodyModel[333] = new ModelRendererTurbo(this, 247, 104, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[334] = new ModelRendererTurbo(this, 106, 59, textureX, textureY, "lamp"); // Box 314 headlight sp front b
		bodyModel[335] = new ModelRendererTurbo(this, 106, 59, textureX, textureY, "lamp"); // Box 315 headlight sp front a
		bodyModel[336] = new ModelRendererTurbo(this, 101, 62, textureX, textureY, "lamp"); // Box 316 headlight front gyralight sp red
		bodyModel[337] = new ModelRendererTurbo(this, 85, 61, textureX, textureY); // Box 317
		bodyModel[338] = new ModelRendererTurbo(this, 92, 63, textureX, textureY); // Box 20
		bodyModel[339] = new ModelRendererTurbo(this, 210, 90, textureX, textureY); // Box 339
		bodyModel[340] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 340
		bodyModel[341] = new ModelRendererTurbo(this, 208, 121, textureX, textureY); // Box 341
		bodyModel[342] = new ModelRendererTurbo(this, 198, 121, textureX, textureY); // Box 342
		bodyModel[343] = new ModelRendererTurbo(this, 290, 116, textureX, textureY); // Box 343
		bodyModel[344] = new ModelRendererTurbo(this, 172, 144, textureX, textureY); // Box 344
		bodyModel[345] = new ModelRendererTurbo(this, 211, 121, textureX, textureY); // Box 345
		bodyModel[346] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[347] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[348] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[349] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[350] = new ModelRendererTurbo(this, 174, 59, textureX, textureY); // Box 428

		bodyModel[0].addBox(0F, 0F, 0F, 88, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-44F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[1].setRotationPoint(-49.01F, 0F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 88, 1, 4, 0F); // Box 159
		bodyModel[2].setRotationPoint(-44F, 0F, 7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[3].setRotationPoint(-49F, 8F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[4].setRotationPoint(-49F, 7F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[5].setRotationPoint(-45F, 1F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[6].setRotationPoint(-45F, 1F, 7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[7].setRotationPoint(-45F, 0F, 7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[8].setRotationPoint(-45F, 5F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[9].setRotationPoint(-45F, 5F, 7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[10].setRotationPoint(-45F, 0F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[11].setRotationPoint(-49F, 3F, -9F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 451
		bodyModel[12].setRotationPoint(-49F, 3F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[13].setRotationPoint(-49F, 8F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[14].setRotationPoint(-49F, 5F, -10F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[15].setRotationPoint(-49F, 7F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[16].setRotationPoint(-49F, 4F, -8F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 333
		bodyModel[17].setRotationPoint(-49F, 7F, 9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[18].setRotationPoint(-49F, 8F, 9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[19].setRotationPoint(-49F, 5F, 8F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 336
		bodyModel[20].setRotationPoint(-49F, 4F, 8F);

		bodyModel[21].addBox(0F, 0F, 0F, 98, 2, 12, 0F); // Box 23
		bodyModel[21].setRotationPoint(-49F, 1F, -6F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 408
		bodyModel[22].setRotationPoint(27.5F, 1F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 98, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[23].setRotationPoint(-49F, 3F, -6.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 98, 1, 14, 0F); // Box 170
		bodyModel[24].setRotationPoint(-49F, 0F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[25].setRotationPoint(-31.5F, 2F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[26].setRotationPoint(-31.5F, 2F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[27].setRotationPoint(-30.5F, 2F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[28].setRotationPoint(-30.5F, 2F, 9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[29].setRotationPoint(27.5F, 2F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 193
		bodyModel[30].setRotationPoint(28.5F, 2F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		bodyModel[31].setRotationPoint(27.5F, 2F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 195
		bodyModel[32].setRotationPoint(28.5F, 2F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[33].setRotationPoint(-49F, 3F, -2.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 203
		bodyModel[34].setRotationPoint(43F, 3F, -2.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 100
		bodyModel[35].setRotationPoint(-31.5F, 1F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[36].setRotationPoint(15F, 1F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 116
		bodyModel[37].setRotationPoint(-15F, 1F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		bodyModel[38].setRotationPoint(-44F, 1F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[39].setRotationPoint(14F, 1F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 111
		bodyModel[40].setRotationPoint(15F, 1F, 11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 112
		bodyModel[41].setRotationPoint(-15F, 1F, 11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[42].setRotationPoint(-44F, 1F, 11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 114
		bodyModel[43].setRotationPoint(14F, 1F, 11F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[44].setRotationPoint(-32F, 3F, -2F);

		bodyModel[45].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[45].setRotationPoint(27F, 3F, -2F);

		bodyModel[46].addBox(0F, 0F, 0F, 16, 3, 22, 0F); // Box 489
		bodyModel[46].setRotationPoint(-8F, 3F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[47].setRotationPoint(-8F, 2F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[48].setRotationPoint(-8F, 6F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 16, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[49].setRotationPoint(-8F, 6F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[50].setRotationPoint(-8F, 2F, 8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[51].setRotationPoint(-8F, 6F, 9F);

		bodyModel[52].addBox(0F, 0F, 0F, 16, 1, 16, 0F); // Box 559
		bodyModel[52].setRotationPoint(-8F, 2F, -8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[53].setRotationPoint(8F, 6F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[54].setRotationPoint(8F, 6F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 6, 3, 22, 0F); // Box 566
		bodyModel[55].setRotationPoint(8F, 3F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[56].setRotationPoint(8F, 2F, -11F);

		bodyModel[57].addBox(0F, 0F, 0F, 6, 1, 16, 0F); // Box 568
		bodyModel[57].setRotationPoint(8F, 2F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[58].setRotationPoint(8F, 2F, 8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 570
		bodyModel[59].setRotationPoint(8F, 6F, 9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[60].setRotationPoint(-14F, 6F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[61].setRotationPoint(-14F, 6F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 6, 3, 22, 0F); // Box 573
		bodyModel[62].setRotationPoint(-14F, 3F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[63].setRotationPoint(-14F, 2F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 576
		bodyModel[64].setRotationPoint(-14F, 6F, 9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[65].setRotationPoint(-14F, 2F, 8F);

		bodyModel[66].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 562
		bodyModel[66].setRotationPoint(-4.5F, 1.3F, -9.5F);
		bodyModel[66].rotateAngleX = 0.78539816F;

		bodyModel[67].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 563
		bodyModel[67].setRotationPoint(-4.5F, 1.3F, 9.5F);
		bodyModel[67].rotateAngleX = 0.78539816F;

		bodyModel[68].addBox(0F, 0F, 0F, 6, 1, 16, 0F); // Box 575
		bodyModel[68].setRotationPoint(-14F, 2F, -8F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 436
		bodyModel[69].setRotationPoint(-13F, 2F, -11.25F);
		bodyModel[69].rotateAngleX = 1.02974426F;

		bodyModel[70].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 437
		bodyModel[70].setRotationPoint(-13F, 2F, 11.25F);
		bodyModel[70].rotateAngleX = 1.02974426F;
		bodyModel[70].rotateAngleY = -3.14159265F;

		bodyModel[71].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 438
		bodyModel[71].setRotationPoint(12.75F, 2F, -11.25F);
		bodyModel[71].rotateAngleX = 1.02974426F;

		bodyModel[72].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 439
		bodyModel[72].setRotationPoint(12.75F, 2F, 11.25F);
		bodyModel[72].rotateAngleX = 1.02974426F;
		bodyModel[72].rotateAngleY = -3.14159265F;

		bodyModel[73].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[73].setRotationPoint(-49F, -1F, 10F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[74].setRotationPoint(-49F, -1F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 144
		bodyModel[75].setRotationPoint(-49F, -8F, -8F);

		bodyModel[76].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 148
		bodyModel[76].setRotationPoint(-49F, -8F, 6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[77].setRotationPoint(-49.01F, -7F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		bodyModel[78].setRotationPoint(-49.01F, -7F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[79].setRotationPoint(-49F, -8F, 9F);
		bodyModel[79].rotateAngleY = -3.14159265F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[80].setRotationPoint(-49F, -8F, -8F);
		bodyModel[80].rotateAngleY = -3.14159265F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[81].setRotationPoint(-50F, 0F, 5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[82].setRotationPoint(-50F, 0F, -5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[83].setRotationPoint(-50F, 0F, -6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[84].setRotationPoint(-49F, -8F, -6F);

		bodyModel[85].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[85].setRotationPoint(-50F, -8F, -4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[86].setRotationPoint(-49F, -8F, 4F);

		bodyModel[87].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[87].setRotationPoint(-53F, 3F, -1.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[88].setRotationPoint(-50F, 2.5F, -2F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[89].setRotationPoint(49F, 3F, -1.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[90].setRotationPoint(49F, 2.5F, -2F);

		bodyModel[91].addBox(0F, 0F, 0F, 0, 4, 8, 0F); // Box 440 honse
		bodyModel[91].setRotationPoint(-50F, -1F, -4F);
		bodyModel[91].rotateAngleZ = -0.08726646F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[92].setRotationPoint(-50F, -2F, -4.75F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[93].setRotationPoint(-50F, -2F, 2.75F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[94].setRotationPoint(-50.25F, -2F, -4.75F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399 not a ditchlight will not glow
		bodyModel[95].setRotationPoint(-50.25F, -2F, 2.75F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[96].setRotationPoint(-53F, 7F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[97].setRotationPoint(-53F, 7F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[98].setRotationPoint(-52F, 6F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[99].setRotationPoint(-52F, 6F, -10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[100].setRotationPoint(-52F, 5F, 2F);

		bodyModel[101].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[101].setRotationPoint(-52F, 5F, -8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 ditchlight front b
		bodyModel[102].setRotationPoint(-49.75F, 0F, -7.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[103].setRotationPoint(-49.5F, 0F, -7.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 ditchlight front b
		bodyModel[104].setRotationPoint(-49.75F, 0F, 5.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[105].setRotationPoint(-49.5F, 0F, 5.75F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 101 cull
		bodyModel[106].setRotationPoint(-50F, 0.5F, -6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f d
		bodyModel[107].setRotationPoint(-50.25F, 0.5F, -6F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 444 cull
		bodyModel[108].setRotationPoint(-50F, 0.5F, 4F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f d
		bodyModel[109].setRotationPoint(-50.25F, 0.5F, 4F);

		bodyModel[110].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[110].setRotationPoint(-50F, 1F, -8F);

		bodyModel[111].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[111].setRotationPoint(-50F, 1F, 7F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[112].setRotationPoint(-50.5F, -3F, -2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[113].setRotationPoint(-50.5F, -4F, -2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 318
		bodyModel[114].setRotationPoint(-48F, -13F, 1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.57F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[115].setRotationPoint(-48F, -13F, -1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.57F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[116].setRotationPoint(-48F, -13F, 0F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[117].setRotationPoint(-46.98F, -13F, -1F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 42
		bodyModel[118].setRotationPoint(-48F, -10F, 1F);

		bodyModel[119].addBox(0F, 0F, 0F, 5, 13, 14, 0F); // Box 345
		bodyModel[119].setRotationPoint(-41F, -13F, -7F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 13, 13, 0F); // Box 43
		bodyModel[120].setRotationPoint(-44F, -13F, -6F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[121].setRotationPoint(-48F, -8F, 0F);

		bodyModel[122].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 245
		bodyModel[122].setRotationPoint(-41F, -4F, -11F);

		bodyModel[123].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 246
		bodyModel[123].setRotationPoint(-43F, -4F, 7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[124].setRotationPoint(-33F, -18F, 11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[125].setRotationPoint(-36F, -21F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[126].setRotationPoint(-25F, -21F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[127].setRotationPoint(-35F, -21F, 7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[128].setRotationPoint(-35F, -21F, -11F);

		bodyModel[129].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[129].setRotationPoint(-35F, -21F, -7F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[130].setRotationPoint(-25F, -21F, -7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[131].setRotationPoint(-38.5F, -19F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[132].setRotationPoint(-38.5F, -21F, -1F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[133].setRotationPoint(-38F, -21F, 1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[134].setRotationPoint(-38F, -21F, -6F);

		bodyModel[135].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[135].setRotationPoint(-38F, -21F, -1F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[136].setRotationPoint(-36F, -21F, -7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[137].setRotationPoint(-25F, -21F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[138].setRotationPoint(-36F, -21F, -11F);

		bodyModel[139].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[139].setRotationPoint(-36F, -4F, -11F);

		bodyModel[140].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[140].setRotationPoint(-24.5F, -18F, 10.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[141].setRotationPoint(-36F, -18F, -7F);

		bodyModel[142].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[142].setRotationPoint(-35F, -18F, -11F);

		bodyModel[143].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[143].setRotationPoint(-35F, -18F, 10F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[144].setRotationPoint(-25F, -18F, -11F);

		bodyModel[145].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[145].setRotationPoint(-35.5F, -18F, -10.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 numberboard front
		bodyModel[146].setRotationPoint(-36.05F, -19.5F, -6F);
		bodyModel[146].rotateAngleY = 0.38397244F;

		bodyModel[147].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118 numberboard front
		bodyModel[147].setRotationPoint(-36.05F, -19.5F, 6F);
		bodyModel[147].rotateAngleY = -0.38397244F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[148].setRotationPoint(-38F, -17F, -1F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 0, 10, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[149].setRotationPoint(-45F, -10F, 10.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 0, 17, 2, 0F); // Box 177
		bodyModel[150].setRotationPoint(-45F, -12F, 9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 9, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[151].setRotationPoint(-45F, -12F, 11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[152].setRotationPoint(-43F, -11F, 11.01F);

		bodyModel[153].addBox(0F, 0F, 0F, 71, 21, 14, 0F); // Box 34
		bodyModel[153].setRotationPoint(-24F, -21F, -7F);

		bodyModel[154].addBox(0F, 0F, 0F, 11, 5, 1, 0F); // Box 285
		bodyModel[154].setRotationPoint(-23.25F, -20.5F, -7.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 11, 5, 1, 0F); // Box 286
		bodyModel[155].setRotationPoint(-23.25F, -20.5F, 6.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[156].setRotationPoint(44F, 2F, -11.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[157].setRotationPoint(44F, 1F, -11.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 259
		bodyModel[158].setRotationPoint(44F, 2F, 10.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 259
		bodyModel[159].setRotationPoint(44F, 1F, 10.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[160].setRotationPoint(46F, 0F, -10.5F);

		bodyModel[161].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[161].setRotationPoint(46F, 2.5F, -10.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[162].setRotationPoint(46F, 5F, -10.5F);

		bodyModel[163].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[163].setRotationPoint(46F, 0F, 10.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[164].setRotationPoint(46F, 2.5F, 10.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[165].setRotationPoint(46F, 5F, 10.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[166].setRotationPoint(46F, 0F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 323
		bodyModel[167].setRotationPoint(46F, 0F, 9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[168].setRotationPoint(46F, 2.5F, -11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[169].setRotationPoint(46F, 5F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[170].setRotationPoint(46F, 8F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 323
		bodyModel[171].setRotationPoint(46F, 2.5F, 9F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 322
		bodyModel[172].setRotationPoint(46F, 5F, 9F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 319
		bodyModel[173].setRotationPoint(46F, 8F, 9F);

		bodyModel[174].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 266
		bodyModel[174].setRotationPoint(46F, 0F, -9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 265
		bodyModel[175].setRotationPoint(44F, 5F, 7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[176].setRotationPoint(44F, 5F, -11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 262
		bodyModel[177].setRotationPoint(44F, 0F, 7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[178].setRotationPoint(44F, 0F, -11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 259
		bodyModel[179].setRotationPoint(44F, 2F, 7F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[180].setRotationPoint(44F, 2F, -11F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[181].setRotationPoint(49.01F, 8F, -10F);

		bodyModel[182].addBox(0F, 0F, 0F, 0, 8, 22, 0F); // Box 3
		bodyModel[182].setRotationPoint(49.01F, 0F, -11F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 202
		bodyModel[183].setRotationPoint(49F, 0F, -11F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 364
		bodyModel[184].setRotationPoint(50F, 0F, -10F);

		bodyModel[185].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 468
		bodyModel[185].setRotationPoint(46F, 0F, 7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 644
		bodyModel[186].setRotationPoint(44F, 1F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 645
		bodyModel[187].setRotationPoint(44F, 1F, 10F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 234
		bodyModel[188].setRotationPoint(49F, -8F, 11F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 234
		bodyModel[189].setRotationPoint(49F, -8F, -11F);

		bodyModel[190].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 251
		bodyModel[190].setRotationPoint(45.01F, -8F, 10.5F);

		bodyModel[191].addBox(0F, 0F, -1F, 0, 13, 1, 0F); // Box 241
		bodyModel[191].setRotationPoint(45.01F, -8F, -10.5F);

		bodyModel[192].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 234
		bodyModel[192].setRotationPoint(51F, -8F, -10F);

		bodyModel[193].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 63
		bodyModel[193].setRotationPoint(48.99F, -8F, -11.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 61
		bodyModel[194].setRotationPoint(48.99F, -8F, 10.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 427
		bodyModel[195].setRotationPoint(50F, -8F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 428
		bodyModel[196].setRotationPoint(50F, -8F, 11F);

		bodyModel[197].addBox(0F, 0F, 0F, 64, 8, 0, 0F); // Box 291
		bodyModel[197].setRotationPoint(-19F, -8F, 11F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[198].setRotationPoint(-24F, -12F, 11F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 307
		bodyModel[199].setRotationPoint(-23F, -12F, 11F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		bodyModel[200].setRotationPoint(-20F, -8F, 11F);

		bodyModel[201].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 291
		bodyModel[201].setRotationPoint(26F, -9F, 11F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[202].setRotationPoint(29F, -9F, 11F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 315
		bodyModel[203].setRotationPoint(25F, -9F, 11F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 36
		bodyModel[204].setRotationPoint(26.5F, -2F, -11.25F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[205].setRotationPoint(33F, -10F, -11F);

		bodyModel[206].addBox(0F, 0F, 0F, 10, 8, 0, 0F); // Box 316
		bodyModel[206].setRotationPoint(35F, -8F, -11F);

		bodyModel[207].addBox(0F, 0F, 0F, 55, 8, 0, 0F); // Box 312
		bodyModel[207].setRotationPoint(-22F, -10F, -11F);

		bodyModel[208].addBox(0F, 0F, 0F, 58, 2, 4, 0F); // Box 36
		bodyModel[208].setRotationPoint(-24F, -2F, -11F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[209].setRotationPoint(-7F, -21F, -9F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[210].setRotationPoint(-7F, -21F, 7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 102
		bodyModel[211].setRotationPoint(-12F, -21F, -9F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[212].setRotationPoint(-12F, -21F, 7F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 377
		bodyModel[213].setRotationPoint(6F, -21F, 7F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 24, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[214].setRotationPoint(11F, -21F, -9F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 24, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 380
		bodyModel[215].setRotationPoint(11F, -21F, 7F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[216].setRotationPoint(6F, -21F, -9F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[217].setRotationPoint(35F, -21F, -9F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 148
		bodyModel[218].setRotationPoint(35F, -21F, 7F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5.5F, -5F, 0F, -5.5F, -5F, 0F, 0F, -5F, 0F); // Box 425
		bodyModel[219].setRotationPoint(39.75F, -19.5F, 6.1F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5.5F, -5F, 0F, -5.5F, -5F, 0F, 0F, -5F, 0F); // Box 427
		bodyModel[220].setRotationPoint(39.75F, -19.5F, -7.1F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[221].setRotationPoint(-24F, -12F, -11F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[222].setRotationPoint(-22F, -4F, 11F);

		bodyModel[223].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 304
		bodyModel[223].setRotationPoint(-23F, -2F, 7F);

		bodyModel[224].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 305
		bodyModel[224].setRotationPoint(-24F, -4F, 11F);

		bodyModel[225].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 836
		bodyModel[225].setRotationPoint(-24F, -4F, 7F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 31
		bodyModel[226].setRotationPoint(45.5F, -19F, -1F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp rear short SDP40
		bodyModel[227].setRotationPoint(46.75F, -19F, -1F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp rear short SDP40
		bodyModel[228].setRotationPoint(46.75F, -17F, -1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[229].setRotationPoint(39.55F, -21.75F, -4.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[230].setRotationPoint(38.5F, -22.5F, 1F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[231].setRotationPoint(39F, -21.75F, 1.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318
		bodyModel[232].setRotationPoint(45.5F, -21.5F, -0.5F);

		bodyModel[233].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[233].setRotationPoint(28.5F, -22.5F, -3F);

		bodyModel[234].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[234].setRotationPoint(20.5F, -22.5F, -3F);

		bodyModel[235].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 279
		bodyModel[235].setRotationPoint(12.5F, -22.5F, -3F);

		bodyModel[236].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[236].setRotationPoint(1F, -22F, -3F);

		bodyModel[237].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[237].setRotationPoint(-6F, -22F, -3F);

		bodyModel[238].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[238].setRotationPoint(-13F, -21.5F, -4F);

		bodyModel[239].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[239].setRotationPoint(-12F, -22.5F, -2.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 8, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[240].setRotationPoint(-22F, -22F, -6F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[241].setRotationPoint(-45.65F, -12F, -6.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[242].setRotationPoint(-45.65F, -12F, 4.5F);

		bodyModel[243].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[243].setRotationPoint(-20.5F, -13F, -9F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[244].setRotationPoint(-20.5F, -15F, -9F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 15, 13, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, -8F, -7.5F, 0F, -8F, -7.5F, 0F, 0F, -7.5F, 0F); // Box 558
		bodyModel[245].setRotationPoint(12F, -20.05F, -8.95F);
		bodyModel[245].rotateAngleX = 0.31415927F;

		bodyModel[246].addShapeBox(0F, 0F, 0F, 15, 13, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, -8F, -7.5F, 0F, -8F, -7.5F, 0F, 0F, -7.5F, 0F); // Box 560
		bodyModel[246].setRotationPoint(20F, -20.05F, -8.95F);
		bodyModel[246].rotateAngleX = 0.31415927F;

		bodyModel[247].addShapeBox(0F, 0F, 0F, 15, 13, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, -8F, -7.5F, 0F, -8F, -7.5F, 0F, 0F, -7.5F, 0F); // Box 561
		bodyModel[247].setRotationPoint(28F, -20.05F, -8.95F);
		bodyModel[247].rotateAngleX = 0.31415927F;

		bodyModel[248].addShapeBox(0F, 0F, -1F, 15, 13, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, -8F, -7.5F, 0F, -8F, -7.5F, 0F, 0F, -7.5F, 0F); // Box 562
		bodyModel[248].setRotationPoint(12F, -20.05F, 9.05F);
		bodyModel[248].rotateAngleX = -0.31415927F;

		bodyModel[249].addShapeBox(0F, 0F, -1F, 15, 13, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, -8F, -7.5F, 0F, -8F, -7.5F, 0F, 0F, -7.5F, 0F); // Box 563
		bodyModel[249].setRotationPoint(20F, -20.05F, 9.05F);
		bodyModel[249].rotateAngleX = -0.31415927F;

		bodyModel[250].addShapeBox(0F, 0F, -1F, 15, 13, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, -8F, -7.5F, 0F, -8F, -7.5F, 0F, 0F, -7.5F, 0F); // Box 564
		bodyModel[250].setRotationPoint(28F, -20.05F, 9.05F);
		bodyModel[250].rotateAngleX = -0.31415927F;

		bodyModel[251].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 61
		bodyModel[251].setRotationPoint(-45F, -10F, -11F);

		bodyModel[252].addBox(0F, 0F, 0F, 0, 15, 2, 0F); // Box 81
		bodyModel[252].setRotationPoint(-45F, -10F, -11F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[253].setRotationPoint(-45F, -8F, -11.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[254].setRotationPoint(-42F, -11F, -11F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 191
		bodyModel[255].setRotationPoint(-43F, -9F, -11.01F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[256].setRotationPoint(-40F, -12F, -11F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.57F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.57F, 0F, 0F); // Box 298
		bodyModel[257].setRotationPoint(-46F, -10F, -7F);

		bodyModel[258].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 43
		bodyModel[258].setRotationPoint(-45F, -13F, -7F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,-2.57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[259].setRotationPoint(-48F, -8F, -6F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-2.57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -2.57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 298
		bodyModel[260].setRotationPoint(-48F, -10F, -6F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 319
		bodyModel[261].setRotationPoint(-48F, -13F, -7F);

		bodyModel[262].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 43
		bodyModel[262].setRotationPoint(-44F, -13F, -7F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[263].setRotationPoint(-48F, -4F, -7F);

		bodyModel[264].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 43
		bodyModel[264].setRotationPoint(-45F, -4F, -7F);

		bodyModel[265].addBox(0F, 0F, 0F, 1, 13, 13, 0F); // Box 294
		bodyModel[265].setRotationPoint(-45F, -13F, -6F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[266].setRotationPoint(-45F, -10F, -7F);

		bodyModel[267].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[267].setRotationPoint(-43.75F, -8.25F, -7F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[268].setRotationPoint(-45.75F, -10.25F, -7F);

		bodyModel[269].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // BN iceical breakers
		bodyModel[269].setRotationPoint(-34F, -20.6F, 8.7F);

		bodyModel[270].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // BN iceical breakers
		bodyModel[270].setRotationPoint(-34F, -22.3F, 4F);

		bodyModel[271].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // BN iceical breakers
		bodyModel[271].setRotationPoint(-34F, -22.3F, 4F);
		bodyModel[271].rotateAngleX = -0.34906585F;

		bodyModel[272].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // BN iceical breakers
		bodyModel[272].setRotationPoint(-34F, -22.3F, -4F);

		bodyModel[273].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // BN iceical breakers
		bodyModel[273].setRotationPoint(-34F, -22.3F, -4F);
		bodyModel[273].rotateAngleX = 3.4906585F;

		bodyModel[274].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // BN iceical breakers
		bodyModel[274].setRotationPoint(-34F, -20.6F, -8.7F);

		bodyModel[275].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 484
		bodyModel[275].setRotationPoint(-37F, -23F, -0.5F);

		bodyModel[276].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 485
		bodyModel[276].setRotationPoint(-37.75F, -22.5F, -1.5F);

		bodyModel[277].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 486
		bodyModel[277].setRotationPoint(-38.5F, -22.5F, 0.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 487
		bodyModel[278].setRotationPoint(-36.75F, -22.5F, -0.5F);

		bodyModel[279].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // M5 Hork
		bodyModel[279].setRotationPoint(-39F, -22.5F, -0.5F);

		bodyModel[280].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // M5 Hork
		bodyModel[280].setRotationPoint(-38F, -22.25F, 0.5F);

		bodyModel[281].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // M5 Hork
		bodyModel[281].setRotationPoint(-38.5F, -22.25F, -1.5F);

		bodyModel[282].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // M5 Hork
		bodyModel[282].setRotationPoint(-37.5F, -23.5F, -1F);

		bodyModel[283].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // M5 Hork
		bodyModel[283].setRotationPoint(-37.5F, -23.5F, 0.25F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[284].setRotationPoint(-43F, -4F, -11F);

		bodyModel[285].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 408
		bodyModel[285].setRotationPoint(-42F, -2F, -11F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[286].setRotationPoint(-52F, 4F, 2F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[287].setRotationPoint(-52F, 4F, -10F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[288].setRotationPoint(-52F, 3F, 2F);

		bodyModel[289].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[289].setRotationPoint(-52F, 3F, -8F);

		bodyModel[290].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 430
		bodyModel[290].setRotationPoint(-34F, -23F, 3F);

		bodyModel[291].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[291].setRotationPoint(-33F, -16F, 11F);

		bodyModel[292].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[292].setRotationPoint(-33F, -16F, -12F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[293].setRotationPoint(-33F, -18F, -12F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 320
		bodyModel[294].setRotationPoint(-30F, -22.5F, -0.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[295].setRotationPoint(-30F, -23.5F, -0.5F);

		bodyModel[296].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 323
		bodyModel[296].setRotationPoint(-32F, -24F, 0F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[297].setRotationPoint(-42F, -4F, -11F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[298].setRotationPoint(-31.5F, -22F, 3F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[299].setRotationPoint(-28.5F, -22F, -5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F); // Box 401
		bodyModel[300].setRotationPoint(-36F, -23F, -5.5F);

		bodyModel[301].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 402
		bodyModel[301].setRotationPoint(-35F, -23F, -5.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[302].setRotationPoint(-30.5F, -22F, -1F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[303].setRotationPoint(-30.5F, -22.5F, -1F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[304].setRotationPoint(-30.5F, -22.5F, -1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[305].setRotationPoint(-30.5F, -22.5F, -1F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[306].setRotationPoint(-30.5F, -22.5F, -1F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409
		bodyModel[307].setRotationPoint(-37F, -22F, -0.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow commander
		bodyModel[308].setRotationPoint(-37F, -23F, -0.5F);

		bodyModel[309].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[309].setRotationPoint(-31.5F, -23F, -1.5F);

		bodyModel[310].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[310].setRotationPoint(-30F, -23F, -0.5F);

		bodyModel[311].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[311].setRotationPoint(-30.75F, -23F, 0.5F);

		bodyModel[312].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 387
		bodyModel[312].setRotationPoint(-29.75F, -22F, -0.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 345
		bodyModel[313].setRotationPoint(42.5F, -23.5F, -4F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 346
		bodyModel[314].setRotationPoint(42.5F, -23.5F, 4F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 0, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[315].setRotationPoint(42.5F, -23.5F, -4F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 349
		bodyModel[316].setRotationPoint(43.5F, -23.5F, -0.5F);

		bodyModel[317].addBox(0F, 0F, 0F, 11, 2, 7, 0F); // Box 196 winterization hatch
		bodyModel[317].setRotationPoint(9F, -22.75F, -3.5F);

		bodyModel[318].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[318].setRotationPoint(-25.5F, -23F, 0F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[319].setRotationPoint(-15.5F, 2.75F, -10.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[320].setRotationPoint(-15.5F, 1.75F, -10.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[321].setRotationPoint(-15.25F, 3.25F, -10.25F);

		bodyModel[322].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[322].setRotationPoint(-15.5F, 0.75F, -10.9F);

		bodyModel[323].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 278
		bodyModel[323].setRotationPoint(6.75F, -24F, -1.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 279
		bodyModel[324].setRotationPoint(7.75F, -24F, -0.5F);

		bodyModel[325].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[325].setRotationPoint(5.75F, -24F, 0.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 214
		bodyModel[326].setRotationPoint(7.75F, -23F, -0.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 352
		bodyModel[327].setRotationPoint(-46F, -13.5F, -0.5F);

		bodyModel[328].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 527 cab backpannel
		bodyModel[328].setRotationPoint(-26F, -20F, -6F);

		bodyModel[329].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[329].setRotationPoint(-33.5F, -14F, -4F);
		bodyModel[329].rotateAngleY = -0.38397244F;

		bodyModel[330].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[330].setRotationPoint(-35.1F, -12F, -4F);
		bodyModel[330].rotateAngleY = -0.38397244F;

		bodyModel[331].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412
		bodyModel[331].setRotationPoint(-35F, -13F, -2F);

		bodyModel[332].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 409
		bodyModel[332].setRotationPoint(-44F, -2F, 7F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[333].setRotationPoint(-17F, 1F, 8.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 314 headlight sp front b
		bodyModel[334].setRotationPoint(-47.75F, -12F, -2F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 315 headlight sp front a
		bodyModel[335].setRotationPoint(-47.75F, -12F, 0F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 headlight front gyralight sp red
		bodyModel[336].setRotationPoint(-47.75F, -14F, -1F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 317
		bodyModel[337].setRotationPoint(-46.98F, -14F, -1.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[338].setRotationPoint(-47.15F, -13F, -2F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 2, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 339
		bodyModel[339].setRotationPoint(37.5F, -2F, -11.25F);

		bodyModel[340].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 340
		bodyModel[340].setRotationPoint(37F, -9F, 11F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[341].setRotationPoint(40F, -9F, 11F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 342
		bodyModel[342].setRotationPoint(36F, -9F, 11F);

		bodyModel[343].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 343
		bodyModel[343].setRotationPoint(34F, -2F, -11F);

		bodyModel[344].addBox(0F, 0F, 0F, 6, 10, 0, 0F); // Box 344
		bodyModel[344].setRotationPoint(33F, -10F, -11F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[345].setRotationPoint(39F, -10F, -11F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[346].setRotationPoint(-37F, -22.5F, -1F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[347].setRotationPoint(-37F, -22.5F, -1F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[348].setRotationPoint(-37F, -22.5F, -1F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[349].setRotationPoint(-37F, -22.5F, -1F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[350].setRotationPoint(-37F, -22F, -1F);

	}
	ModelFlexicoil_C_Mid flexMid = new ModelFlexicoil_C_Mid();
	ModelFlexicoil_C_Late flexLate = new ModelFlexicoil_C_Late();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 43324 ) {
			//silver regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexcoil_c2h_silvers.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.725F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.45F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1) {
			//sPee regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexcoil_c2h_sp.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.85F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.67F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			//blac regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_c2h_black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.85F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.67F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}