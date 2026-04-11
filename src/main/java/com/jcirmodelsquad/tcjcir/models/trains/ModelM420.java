//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.09.2020 - 00:28:20
// Last changed on: 26.09.2020 - 00:28:20

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelZWT;
import net.minecraft.client.Minecraft;
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

public class ModelM420 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelM420() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[423];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 11, 3, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 310, 40, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 299, 100, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 23, 104, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 91, 134, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 92, 130, textureX, textureY); // Box 14
		bodyModel[7] = new ModelRendererTurbo(this, 93, 127, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 93, 131, textureX, textureY); // Box 20
		bodyModel[9] = new ModelRendererTurbo(this, 25, 117, textureX, textureY); // Box 21
		bodyModel[10] = new ModelRendererTurbo(this, 105, 127, textureX, textureY); // Box 85
		bodyModel[11] = new ModelRendererTurbo(this, 105, 131, textureX, textureY); // Box 87
		bodyModel[12] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 26
		bodyModel[13] = new ModelRendererTurbo(this, 11, 11, textureX, textureY); // Box 27
		bodyModel[14] = new ModelRendererTurbo(this, 21, 111, textureX, textureY); // Box 28
		bodyModel[15] = new ModelRendererTurbo(this, 447, 117, textureX, textureY); // Box 48
		bodyModel[16] = new ModelRendererTurbo(this, 445, 124, textureX, textureY); // Box 49
		bodyModel[17] = new ModelRendererTurbo(this, 449, 130, textureX, textureY); // Box 50
		bodyModel[18] = new ModelRendererTurbo(this, 282, 83, textureX, textureY); // Box 52
		bodyModel[19] = new ModelRendererTurbo(this, 65, 120, textureX, textureY); // Box 66
		bodyModel[20] = new ModelRendererTurbo(this, 15, 120, textureX, textureY); // Box 67
		bodyModel[21] = new ModelRendererTurbo(this, 59, 133, textureX, textureY); // Box 132
		bodyModel[22] = new ModelRendererTurbo(this, 7, 133, textureX, textureY); // Box 133
		bodyModel[23] = new ModelRendererTurbo(this, 266, 82, textureX, textureY); // Box 141
		bodyModel[24] = new ModelRendererTurbo(this, 396, 34, textureX, textureY); // Box 117
		bodyModel[25] = new ModelRendererTurbo(this, 299, 75, textureX, textureY); // Box 206
		bodyModel[26] = new ModelRendererTurbo(this, 63, 61, textureX, textureY, BoxName.ditch); // Box 451 front ditchlight U
		bodyModel[27] = new ModelRendererTurbo(this, 63, 61, textureX, textureY, BoxName.ditch); // Box 454 front ditchlight U
		bodyModel[28] = new ModelRendererTurbo(this, 95, 137, textureX, textureY); // Box 455
		bodyModel[29] = new ModelRendererTurbo(this, 15, 158, textureX, textureY); // Box 4
		bodyModel[30] = new ModelRendererTurbo(this, 15, 170, textureX, textureY); // Box 4
		bodyModel[31] = new ModelRendererTurbo(this, 45, 158, textureX, textureY); // Box 4
		bodyModel[32] = new ModelRendererTurbo(this, 45, 170, textureX, textureY); // Box 4
		bodyModel[33] = new ModelRendererTurbo(this, 59, 145, textureX, textureY); // Box 446
		bodyModel[34] = new ModelRendererTurbo(this, 5, 145, textureX, textureY); // Box 447
		bodyModel[35] = new ModelRendererTurbo(this, 20, 148, textureX, textureY); // Box 448
		bodyModel[36] = new ModelRendererTurbo(this, 44, 148, textureX, textureY); // Box 449
		bodyModel[37] = new ModelRendererTurbo(this, 465, 76, textureX, textureY); // Box 471
		bodyModel[38] = new ModelRendererTurbo(this, 465, 95, textureX, textureY); // Box 472
		bodyModel[39] = new ModelRendererTurbo(this, 482, 97, textureX, textureY); // Box 473
		bodyModel[40] = new ModelRendererTurbo(this, 482, 78, textureX, textureY); // Box 474
		bodyModel[41] = new ModelRendererTurbo(this, 459, 34, textureX, textureY); // Box 490
		bodyModel[42] = new ModelRendererTurbo(this, 412, 5, textureX, textureY); // Box 493
		bodyModel[43] = new ModelRendererTurbo(this, 391, 15, textureX, textureY); // Box 494
		bodyModel[44] = new ModelRendererTurbo(this, 309, 35, textureX, textureY); // Box 496
		bodyModel[45] = new ModelRendererTurbo(this, 309, 19, textureX, textureY); // Box 497
		bodyModel[46] = new ModelRendererTurbo(this, 301, 23, textureX, textureY); // Box 498
		bodyModel[47] = new ModelRendererTurbo(this, 394, 28, textureX, textureY, "cull"); // Box 500 cull
		bodyModel[48] = new ModelRendererTurbo(this, 482, 9, textureX, textureY); // Box 502
		bodyModel[49] = new ModelRendererTurbo(this, 465, 10, textureX, textureY); // Box 503
		bodyModel[50] = new ModelRendererTurbo(this, 475, 19, textureX, textureY); // Box 504
		bodyModel[51] = new ModelRendererTurbo(this, 469, 3, textureX, textureY); // Box 155
		bodyModel[52] = new ModelRendererTurbo(this, 497, 10, textureX, textureY); // Box 156
		bodyModel[53] = new ModelRendererTurbo(this, 493, 3, textureX, textureY); // Box 157
		bodyModel[54] = new ModelRendererTurbo(this, 477, 22, textureX, textureY); // Box 158
		bodyModel[55] = new ModelRendererTurbo(this, 474, 25, textureX, textureY); // Box 159
		bodyModel[56] = new ModelRendererTurbo(this, 490, 25, textureX, textureY); // Box 160
		bodyModel[57] = new ModelRendererTurbo(this, 493, 22, textureX, textureY); // Box 161
		bodyModel[58] = new ModelRendererTurbo(this, 502, 23, textureX, textureY, "lamp"); // Box 162 rear headlight
		bodyModel[59] = new ModelRendererTurbo(this, 502, 23, textureX, textureY, "lamp"); // Box 163 rear headlight
		bodyModel[60] = new ModelRendererTurbo(this, 439, 170, textureX, textureY); // Box 168
		bodyModel[61] = new ModelRendererTurbo(this, 469, 170, textureX, textureY); // Box 169
		bodyModel[62] = new ModelRendererTurbo(this, 469, 182, textureX, textureY); // Box 170
		bodyModel[63] = new ModelRendererTurbo(this, 439, 182, textureX, textureY); // Box 171
		bodyModel[64] = new ModelRendererTurbo(this, 315, 107, textureX, textureY); // Box 201
		bodyModel[65] = new ModelRendererTurbo(this, 396, 156, textureX, textureY); // Box 202
		bodyModel[66] = new ModelRendererTurbo(this, 165, 107, textureX, textureY); // Box 224
		bodyModel[67] = new ModelRendererTurbo(this, 165, 96, textureX, textureY); // Box 225
		bodyModel[68] = new ModelRendererTurbo(this, 37, 99, textureX, textureY); // Box 226
		bodyModel[69] = new ModelRendererTurbo(this, 50, 104, textureX, textureY); // Box 228
		bodyModel[70] = new ModelRendererTurbo(this, 34, 104, textureX, textureY); // Box 229
		bodyModel[71] = new ModelRendererTurbo(this, 46, 100, textureX, textureY); // Box 230
		bodyModel[72] = new ModelRendererTurbo(this, 34, 100, textureX, textureY); // Box 231
		bodyModel[73] = new ModelRendererTurbo(this, 385, 21, textureX, textureY); // Box 236 smol stacc
		bodyModel[74] = new ModelRendererTurbo(this, 397, 118, textureX, textureY); // Box 237
		bodyModel[75] = new ModelRendererTurbo(this, 282, 101, textureX, textureY); // Box 245
		bodyModel[76] = new ModelRendererTurbo(this, 288, 101, textureX, textureY); // Box 246
		bodyModel[77] = new ModelRendererTurbo(this, 282, 75, textureX, textureY); // Box 247
		bodyModel[78] = new ModelRendererTurbo(this, 443, 77, textureX, textureY); // Box 248
		bodyModel[79] = new ModelRendererTurbo(this, 443, 102, textureX, textureY); // Box 250
		bodyModel[80] = new ModelRendererTurbo(this, 288, 75, textureX, textureY); // Box 557
		bodyModel[81] = new ModelRendererTurbo(this, 343, 107, textureX, textureY); // Box 561
		bodyModel[82] = new ModelRendererTurbo(this, 377, 107, textureX, textureY); // Box 562
		bodyModel[83] = new ModelRendererTurbo(this, 117, 94, textureX, textureY); // Box 563
		bodyModel[84] = new ModelRendererTurbo(this, 28, 107, textureX, textureY); // Box 61
		bodyModel[85] = new ModelRendererTurbo(this, 56, 107, textureX, textureY); // Box 682
		bodyModel[86] = new ModelRendererTurbo(this, 449, 110, textureX, textureY); // Box 684
		bodyModel[87] = new ModelRendererTurbo(this, 483, 110, textureX, textureY); // Box 685
		bodyModel[88] = new ModelRendererTurbo(this, 28, 100, textureX, textureY); // Box 708
		bodyModel[89] = new ModelRendererTurbo(this, 56, 100, textureX, textureY); // Box 709
		bodyModel[90] = new ModelRendererTurbo(this, 154, 96, textureX, textureY); // Box 721
		bodyModel[91] = new ModelRendererTurbo(this, 159, 94, textureX, textureY); // Box 722
		bodyModel[92] = new ModelRendererTurbo(this, 160, 105, textureX, textureY); // Box 723
		bodyModel[93] = new ModelRendererTurbo(this, 154, 107, textureX, textureY); // Box 724
		bodyModel[94] = new ModelRendererTurbo(this, 73, 34, textureX, textureY, "cull"); // Box 3 cull
		bodyModel[95] = new ModelRendererTurbo(this, 76, 29, textureX, textureY); // Box 5
		bodyModel[96] = new ModelRendererTurbo(this, 25, 2, textureX, textureY); // box64
		bodyModel[97] = new ModelRendererTurbo(this, 49, 2, textureX, textureY); // box65
		bodyModel[98] = new ModelRendererTurbo(this, 61, 110, textureX, textureY, BoxName.ditch); // Box 359 front ditchlight L
		bodyModel[99] = new ModelRendererTurbo(this, 61, 115, textureX, textureY, "cull"); // Box 360 cull
		bodyModel[100] = new ModelRendererTurbo(this, 93, 124, textureX, textureY); // Box 277
		bodyModel[101] = new ModelRendererTurbo(this, 105, 124, textureX, textureY); // Box 280
		bodyModel[102] = new ModelRendererTurbo(this, 461, 0, textureX, textureY, "lamp"); // Box 117 liveryimg 2
		bodyModel[103] = new ModelRendererTurbo(this, 461, 0, textureX, textureY, "lamp"); // Box 298 liveryimg 2
		bodyModel[104] = new ModelRendererTurbo(this, 91, 134, textureX, textureY); // Box 302
		bodyModel[105] = new ModelRendererTurbo(this, 92, 130, textureX, textureY); // Box 303
		bodyModel[106] = new ModelRendererTurbo(this, 92, 126, textureX, textureY); // Box 305
		bodyModel[107] = new ModelRendererTurbo(this, 93, 124, textureX, textureY); // Box 306
		bodyModel[108] = new ModelRendererTurbo(this, 92, 122, textureX, textureY); // Box 307
		bodyModel[109] = new ModelRendererTurbo(this, 255, 104, textureX, textureY); // Box 308
		bodyModel[110] = new ModelRendererTurbo(this, 104, 122, textureX, textureY); // Box 309
		bodyModel[111] = new ModelRendererTurbo(this, 105, 124, textureX, textureY); // Box 310
		bodyModel[112] = new ModelRendererTurbo(this, 104, 126, textureX, textureY); // Box 311
		bodyModel[113] = new ModelRendererTurbo(this, 104, 130, textureX, textureY); // Box 313
		bodyModel[114] = new ModelRendererTurbo(this, 103, 134, textureX, textureY); // Box 315
		bodyModel[115] = new ModelRendererTurbo(this, 255, 94, textureX, textureY); // Box 316
		bodyModel[116] = new ModelRendererTurbo(this, 288, 101, textureX, textureY); // Box 317
		bodyModel[117] = new ModelRendererTurbo(this, 288, 75, textureX, textureY); // Box 319
		bodyModel[118] = new ModelRendererTurbo(this, 61, 115, textureX, textureY, "cull"); // Box 320 cull
		bodyModel[119] = new ModelRendererTurbo(this, 61, 110, textureX, textureY, BoxName.ditch); // Box 321 front ditchlight L
		bodyModel[120] = new ModelRendererTurbo(this, 464, 82, textureX, textureY); // Box 325
		bodyModel[121] = new ModelRendererTurbo(this, 342, 128, textureX, textureY); // Box 2
		bodyModel[122] = new ModelRendererTurbo(this, 354, 158, textureX, textureY); // Box 10
		bodyModel[123] = new ModelRendererTurbo(this, 362, 151, textureX, textureY); // Box 157
		bodyModel[124] = new ModelRendererTurbo(this, 362, 121, textureX, textureY); // Box 158
		bodyModel[125] = new ModelRendererTurbo(this, 353, 114, textureX, textureY); // Box 159
		bodyModel[126] = new ModelRendererTurbo(this, 379, 114, textureX, textureY); // Box 303
		bodyModel[127] = new ModelRendererTurbo(this, 371, 111, textureX, textureY); // Box 304
		bodyModel[128] = new ModelRendererTurbo(this, 372, 162, textureX, textureY); // Box 305
		bodyModel[129] = new ModelRendererTurbo(this, 378, 158, textureX, textureY); // Box 306
		bodyModel[130] = new ModelRendererTurbo(this, 112, 139, textureX, textureY); // Box 307
		bodyModel[131] = new ModelRendererTurbo(this, 82, 139, textureX, textureY); // Box 308
		bodyModel[132] = new ModelRendererTurbo(this, 264, 95, textureX, textureY); // Box 309
		bodyModel[133] = new ModelRendererTurbo(this, 263, 76, textureX, textureY); // Box 310
		bodyModel[134] = new ModelRendererTurbo(this, 66, 122, textureX, textureY); // Box 311
		bodyModel[135] = new ModelRendererTurbo(this, 74, 124, textureX, textureY); // Box 312
		bodyModel[136] = new ModelRendererTurbo(this, 71, 124, textureX, textureY); // Box 313
		bodyModel[137] = new ModelRendererTurbo(this, 50, 100, textureX, textureY); // Box 362
		bodyModel[138] = new ModelRendererTurbo(this, 53, 100, textureX, textureY); // Box 363
		bodyModel[139] = new ModelRendererTurbo(this, 31, 100, textureX, textureY); // Box 364
		bodyModel[140] = new ModelRendererTurbo(this, 34, 100, textureX, textureY); // Box 365
		bodyModel[141] = new ModelRendererTurbo(this, 68, 106, textureX, textureY); // Box 369
		bodyModel[142] = new ModelRendererTurbo(this, 68, 104, textureX, textureY); // Box 370
		bodyModel[143] = new ModelRendererTurbo(this, 74, 104, textureX, textureY); // Box 371
		bodyModel[144] = new ModelRendererTurbo(this, 74, 111, textureX, textureY); // Box 372
		bodyModel[145] = new ModelRendererTurbo(this, 72, 118, textureX, textureY); // Box 373
		bodyModel[146] = new ModelRendererTurbo(this, 92, 122, textureX, textureY); // Box 374
		bodyModel[147] = new ModelRendererTurbo(this, 92, 126, textureX, textureY); // Box 375
		bodyModel[148] = new ModelRendererTurbo(this, 10, 112, textureX, textureY); // Box 376
		bodyModel[149] = new ModelRendererTurbo(this, 10, 119, textureX, textureY); // Box 377
		bodyModel[150] = new ModelRendererTurbo(this, 10, 105, textureX, textureY); // Box 378
		bodyModel[151] = new ModelRendererTurbo(this, 16, 107, textureX, textureY); // Box 379
		bodyModel[152] = new ModelRendererTurbo(this, 16, 105, textureX, textureY); // Box 380
		bodyModel[153] = new ModelRendererTurbo(this, 16, 122, textureX, textureY); // Box 381
		bodyModel[154] = new ModelRendererTurbo(this, 13, 124, textureX, textureY); // Box 382
		bodyModel[155] = new ModelRendererTurbo(this, 10, 124, textureX, textureY); // Box 383
		bodyModel[156] = new ModelRendererTurbo(this, 103, 134, textureX, textureY); // Box 384
		bodyModel[157] = new ModelRendererTurbo(this, 104, 130, textureX, textureY); // Box 385
		bodyModel[158] = new ModelRendererTurbo(this, 104, 126, textureX, textureY); // Box 386
		bodyModel[159] = new ModelRendererTurbo(this, 104, 122, textureX, textureY); // Box 387
		bodyModel[160] = new ModelRendererTurbo(this, 441, 160, textureX, textureY); // Box 244
		bodyModel[161] = new ModelRendererTurbo(this, 471, 160, textureX, textureY); // Box 245
		bodyModel[162] = new ModelRendererTurbo(this, 471, 150, textureX, textureY); // Box 246
		bodyModel[163] = new ModelRendererTurbo(this, 441, 150, textureX, textureY); // Box 247
		bodyModel[164] = new ModelRendererTurbo(this, 163, 9, textureX, textureY, "lamp"); // Box 248 front headlight U
		bodyModel[165] = new ModelRendererTurbo(this, 163, 9, textureX, textureY, "lamp"); // Box 249 front headlight U
		bodyModel[166] = new ModelRendererTurbo(this, 166, 10, textureX, textureY); // Box 250
		bodyModel[167] = new ModelRendererTurbo(this, 203, 12, textureX, textureY); // Box 319
		bodyModel[168] = new ModelRendererTurbo(this, 212, 12, textureX, textureY); // Box 320
		bodyModel[169] = new ModelRendererTurbo(this, 203, 9, textureX, textureY); // Box 321
		bodyModel[170] = new ModelRendererTurbo(this, 203, 15, textureX, textureY); // Box 322
		bodyModel[171] = new ModelRendererTurbo(this, 19, 111, textureX, textureY, BoxName.ditch); // Box 356 front ditchlight C
		bodyModel[172] = new ModelRendererTurbo(this, 19, 111, textureX, textureY, BoxName.ditch); // Box 357 front ditchlight C
		bodyModel[173] = new ModelRendererTurbo(this, 20, 116, textureX, textureY); // Box 358
		bodyModel[174] = new ModelRendererTurbo(this, 20, 116, textureX, textureY); // Box 359
		bodyModel[175] = new ModelRendererTurbo(this, 44, 137, textureX, textureY); // Box 360
		bodyModel[176] = new ModelRendererTurbo(this, 20, 137, textureX, textureY); // Box 361
		bodyModel[177] = new ModelRendererTurbo(this, 426, 147, textureX, textureY); // Box 362
		bodyModel[178] = new ModelRendererTurbo(this, 486, 147, textureX, textureY); // Box 363
		bodyModel[179] = new ModelRendererTurbo(this, 161, 20, textureX, textureY); // Box 439
		bodyModel[180] = new ModelRendererTurbo(this, 222, 21, textureX, textureY); // Box 327
		bodyModel[181] = new ModelRendererTurbo(this, 224, 18, textureX, textureY); // Box 328
		bodyModel[182] = new ModelRendererTurbo(this, 224, 24, textureX, textureY); // Box 329
		bodyModel[183] = new ModelRendererTurbo(this, 233, 21, textureX, textureY); // Box 330
		bodyModel[184] = new ModelRendererTurbo(this, 339, 158, textureX, textureY); // Box 261
		bodyModel[185] = new ModelRendererTurbo(this, 347, 151, textureX, textureY); // Box 262
		bodyModel[186] = new ModelRendererTurbo(this, 317, 121, textureX, textureY); // Box 263
		bodyModel[187] = new ModelRendererTurbo(this, 347, 121, textureX, textureY); // Box 264
		bodyModel[188] = new ModelRendererTurbo(this, 338, 114, textureX, textureY); // Box 265
		bodyModel[189] = new ModelRendererTurbo(this, 397, 21, textureX, textureY); // Box 266 big stacc
		bodyModel[190] = new ModelRendererTurbo(this, 349, 15, textureX, textureY); // Box 267
		bodyModel[191] = new ModelRendererTurbo(this, 458, 35, textureX, textureY); // Box 356
		bodyModel[192] = new ModelRendererTurbo(this, 436, 50, textureX, textureY); // Box 272
		bodyModel[193] = new ModelRendererTurbo(this, 421, 26, textureX, textureY); // Box 273
		bodyModel[194] = new ModelRendererTurbo(this, 459, 39, textureX, textureY); // Box 274
		bodyModel[195] = new ModelRendererTurbo(this, 459, 30, textureX, textureY); // Box 275
		bodyModel[196] = new ModelRendererTurbo(this, 482, 2, textureX, textureY); // Box 276
		bodyModel[197] = new ModelRendererTurbo(this, 71, 104, textureX, textureY); // Box 277
		bodyModel[198] = new ModelRendererTurbo(this, 71, 109, textureX, textureY); // Box 278
		bodyModel[199] = new ModelRendererTurbo(this, 13, 110, textureX, textureY); // Box 279
		bodyModel[200] = new ModelRendererTurbo(this, 13, 105, textureX, textureY); // Box 280
		bodyModel[201] = new ModelRendererTurbo(this, 161, 18, textureX, textureY); // Box 285
		bodyModel[202] = new ModelRendererTurbo(this, 458, 130, textureX, textureY); // Box 239
		bodyModel[203] = new ModelRendererTurbo(this, 470, 130, textureX, textureY, BoxName.ditch); // Box 240 ditchlight r
		bodyModel[204] = new ModelRendererTurbo(this, 470, 130, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r
		bodyModel[205] = new ModelRendererTurbo(this, 458, 130, textureX, textureY); // Box 242
		bodyModel[206] = new ModelRendererTurbo(this, 171, 18, textureX, textureY, BoxName.commander); // Box 340 commander bacon
		bodyModel[207] = new ModelRendererTurbo(this, 170, 22, textureX, textureY); // Box 341
		bodyModel[208] = new ModelRendererTurbo(this, 417, 133, textureX, textureY); // Box 292
		bodyModel[209] = new ModelRendererTurbo(this, 404, 133, textureX, textureY); // Box 293
		bodyModel[210] = new ModelRendererTurbo(this, 434, 133, textureX, textureY); // Box 294
		bodyModel[211] = new ModelRendererTurbo(this, 461, 104, textureX, textureY); // Box 295
		bodyModel[212] = new ModelRendererTurbo(this, 474, 109, textureX, textureY); // Box 296
		bodyModel[213] = new ModelRendererTurbo(this, 470, 105, textureX, textureY); // Box 297
		bodyModel[214] = new ModelRendererTurbo(this, 458, 105, textureX, textureY); // Box 298
		bodyModel[215] = new ModelRendererTurbo(this, 458, 109, textureX, textureY); // Box 299
		bodyModel[216] = new ModelRendererTurbo(this, 455, 107, textureX, textureY); // Box 300
		bodyModel[217] = new ModelRendererTurbo(this, 455, 109, textureX, textureY); // Box 301
		bodyModel[218] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 302
		bodyModel[219] = new ModelRendererTurbo(this, 477, 111, textureX, textureY); // Box 303
		bodyModel[220] = new ModelRendererTurbo(this, 477, 109, textureX, textureY); // Box 304
		bodyModel[221] = new ModelRendererTurbo(this, 477, 107, textureX, textureY); // Box 305
		bodyModel[222] = new ModelRendererTurbo(this, 53, 108, textureX, textureY); // Box 306
		bodyModel[223] = new ModelRendererTurbo(this, 53, 102, textureX, textureY); // Box 307
		bodyModel[224] = new ModelRendererTurbo(this, 31, 108, textureX, textureY); // Box 308
		bodyModel[225] = new ModelRendererTurbo(this, 31, 102, textureX, textureY); // Box 309
		bodyModel[226] = new ModelRendererTurbo(this, 452, 113, textureX, textureY); // Box 310
		bodyModel[227] = new ModelRendererTurbo(this, 452, 108, textureX, textureY); // Box 311
		bodyModel[228] = new ModelRendererTurbo(this, 480, 113, textureX, textureY); // Box 312
		bodyModel[229] = new ModelRendererTurbo(this, 480, 108, textureX, textureY); // Box 313
		bodyModel[230] = new ModelRendererTurbo(this, 461, 8, textureX, textureY, "lamp"); // Box 298 rear morker lights
		bodyModel[231] = new ModelRendererTurbo(this, 503, 3, textureX, textureY, "lamp"); // Box 298 rear morker lights
		bodyModel[232] = new ModelRendererTurbo(this, 115, 95, textureX, textureY); // Box 412 cs1
		bodyModel[233] = new ModelRendererTurbo(this, 96, 96, textureX, textureY); // Box 413 cs1
		bodyModel[234] = new ModelRendererTurbo(this, 89, 87, textureX, textureY); // Box 86 cs1
		bodyModel[235] = new ModelRendererTurbo(this, 120, 89, textureX, textureY); // Box 476 cs1 radio
		bodyModel[236] = new ModelRendererTurbo(this, 502, 30, textureX, textureY); // Box 504
		bodyModel[237] = new ModelRendererTurbo(this, 488, 47, textureX, textureY); // Box 490
		bodyModel[238] = new ModelRendererTurbo(this, 436, 50, textureX, textureY); // Box 490
		bodyModel[239] = new ModelRendererTurbo(this, 507, 34, textureX, textureY); // Box 504
		bodyModel[240] = new ModelRendererTurbo(this, 507, 30, textureX, textureY); // Box 504
		bodyModel[241] = new ModelRendererTurbo(this, 502, 36, textureX, textureY); // Box 504
		bodyModel[242] = new ModelRendererTurbo(this, 273, 111, textureX, textureY); // Box 557 type B shit
		bodyModel[243] = new ModelRendererTurbo(this, 407, 111, textureX, textureY); // Box 557 type B shit
		bodyModel[244] = new ModelRendererTurbo(this, 94, 65, textureX, textureY, "cull"); // Box 406 hot plate cull
		bodyModel[245] = new ModelRendererTurbo(this, 110, 45, textureX, textureY); // Box 95
		bodyModel[246] = new ModelRendererTurbo(this, 46, 6, textureX, textureY); // Box 29
		bodyModel[247] = new ModelRendererTurbo(this, 22, 6, textureX, textureY); // Box 32
		bodyModel[248] = new ModelRendererTurbo(this, 155, 48, textureX, textureY); // Box 314 door swing left
		bodyModel[249] = new ModelRendererTurbo(this, 36, 40, textureX, textureY, "lamp"); // Box 449 front headlight N
		bodyModel[250] = new ModelRendererTurbo(this, 180, 22, textureX, textureY); // Box 114
		bodyModel[251] = new ModelRendererTurbo(this, 180, 19, textureX, textureY); // Box 74
		bodyModel[252] = new ModelRendererTurbo(this, 180, 25, textureX, textureY); // Box 78
		bodyModel[253] = new ModelRendererTurbo(this, 178, 15, textureX, textureY, "cull"); // Box 481 cull
		bodyModel[254] = new ModelRendererTurbo(this, 52, 54, textureX, textureY); // Box 238
		bodyModel[255] = new ModelRendererTurbo(this, 90, 1, textureX, textureY); // Box 71
		bodyModel[256] = new ModelRendererTurbo(this, 92, 25, textureX, textureY); // Box 55
		bodyModel[257] = new ModelRendererTurbo(this, 102, 18, textureX, textureY); // Box 74
		bodyModel[258] = new ModelRendererTurbo(this, 25, 48, textureX, textureY); // Box 35
		bodyModel[259] = new ModelRendererTurbo(this, 62, 52, textureX, textureY); // Box 55
		bodyModel[260] = new ModelRendererTurbo(this, 57, 51, textureX, textureY); // Box 35
		bodyModel[261] = new ModelRendererTurbo(this, 10, 52, textureX, textureY); // Box 55
		bodyModel[262] = new ModelRendererTurbo(this, 38, 74, textureX, textureY); // Box 74 door swing right
		bodyModel[263] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 84
		bodyModel[264] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 85
		bodyModel[265] = new ModelRendererTurbo(this, 52, 42, textureX, textureY); // Box 86
		bodyModel[266] = new ModelRendererTurbo(this, 8, 42, textureX, textureY); // Box 87
		bodyModel[267] = new ModelRendererTurbo(this, 127, 1, textureX, textureY); // Box 94
		bodyModel[268] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 95
		bodyModel[269] = new ModelRendererTurbo(this, 134, 11, textureX, textureY); // Box 96
		bodyModel[270] = new ModelRendererTurbo(this, 78, 11, textureX, textureY); // Box 97
		bodyModel[271] = new ModelRendererTurbo(this, 44, 40, textureX, textureY); // Box 74
		bodyModel[272] = new ModelRendererTurbo(this, 103, 24, textureX, textureY, "lamp"); // Box 137 numberboard cab
		bodyModel[273] = new ModelRendererTurbo(this, 119, 24, textureX, textureY, "lamp"); // Box 137 numberboard cab
		bodyModel[274] = new ModelRendererTurbo(this, 166, 48, textureX, textureY); // Box 346 door swing right
		bodyModel[275] = new ModelRendererTurbo(this, 28, 26, textureX, textureY); // Box 350
		bodyModel[276] = new ModelRendererTurbo(this, 62, 86, textureX, textureY); // Box 355
		bodyModel[277] = new ModelRendererTurbo(this, 10, 86, textureX, textureY); // Box 356
		bodyModel[278] = new ModelRendererTurbo(this, 46, 26, textureX, textureY); // Box 359
		bodyModel[279] = new ModelRendererTurbo(this, 132, 25, textureX, textureY); // Box 360
		bodyModel[280] = new ModelRendererTurbo(this, 26, 54, textureX, textureY); // Box 361
		bodyModel[281] = new ModelRendererTurbo(this, 119, 19, textureX, textureY, "lamp"); // Box 703 glow marker lights
		bodyModel[282] = new ModelRendererTurbo(this, 107, 19, textureX, textureY, "lamp"); // Box 704 glow marker lights
		bodyModel[283] = new ModelRendererTurbo(this, 29, 40, textureX, textureY, "lamp"); // Box 448 front headlight N
		bodyModel[284] = new ModelRendererTurbo(this, 51, 43, textureX, textureY, "lamp"); // Box 74 P&W weird light front
		bodyModel[285] = new ModelRendererTurbo(this, 51, 39, textureX, textureY, "lamp"); // Box 74 P&W weird light
		bodyModel[286] = new ModelRendererTurbo(this, 15, 26, textureX, textureY); // Box 55
		bodyModel[287] = new ModelRendererTurbo(this, 63, 26, textureX, textureY); // Box 56
		bodyModel[288] = new ModelRendererTurbo(this, 117, 62, textureX, textureY); // Box 57 nose cope slope
		bodyModel[289] = new ModelRendererTurbo(this, 140, 62, textureX, textureY); // Box 58 nose cope slope
		bodyModel[290] = new ModelRendererTurbo(this, 100, 38, textureX, textureY); // Box 406 cull backpannel
		bodyModel[291] = new ModelRendererTurbo(this, 190, 28, textureX, textureY); // Box 332
		bodyModel[292] = new ModelRendererTurbo(this, 190, 22, textureX, textureY); // Box 331
		bodyModel[293] = new ModelRendererTurbo(this, 197, 25, textureX, textureY); // Box 330
		bodyModel[294] = new ModelRendererTurbo(this, 188, 31, textureX, textureY); // Box 329
		bodyModel[295] = new ModelRendererTurbo(this, 188, 19, textureX, textureY); // Box 328
		bodyModel[296] = new ModelRendererTurbo(this, 186, 25, textureX, textureY); // Box 327
		bodyModel[297] = new ModelRendererTurbo(this, 282, 172, textureX, textureY); // Box 63
		bodyModel[298] = new ModelRendererTurbo(this, 282, 172, textureX, textureY); // Box 370
		bodyModel[299] = new ModelRendererTurbo(this, 265, 172, textureX, textureY); // Box 372
		bodyModel[300] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 520
		bodyModel[301] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 521
		bodyModel[302] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 522
		bodyModel[303] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 523
		bodyModel[304] = new ModelRendererTurbo(this, 278, 172, textureX, textureY); // Box 524
		bodyModel[305] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 525
		bodyModel[306] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 526
		bodyModel[307] = new ModelRendererTurbo(this, 278, 172, textureX, textureY); // Box 528
		bodyModel[308] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 529
		bodyModel[309] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 530
		bodyModel[310] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 531
		bodyModel[311] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 532
		bodyModel[312] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 533
		bodyModel[313] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 534
		bodyModel[314] = new ModelRendererTurbo(this, 325, 172, textureX, textureY); // Box 527
		bodyModel[315] = new ModelRendererTurbo(this, 344, 175, textureX, textureY); // Box 535
		bodyModel[316] = new ModelRendererTurbo(this, 344, 175, textureX, textureY); // Box 536
		bodyModel[317] = new ModelRendererTurbo(this, 260, 155, textureX, textureY); // Box 331 support your local B
		bodyModel[318] = new ModelRendererTurbo(this, 260, 155, textureX, textureY); // Box 331 support your local B
		bodyModel[319] = new ModelRendererTurbo(this, 260, 155, textureX, textureY); // Box 331 support your local B
		bodyModel[320] = new ModelRendererTurbo(this, 260, 155, textureX, textureY); // Box 331 support your local B
		bodyModel[321] = new ModelRendererTurbo(this, 344, 175, textureX, textureY); // Box 335
		bodyModel[322] = new ModelRendererTurbo(this, 315, 107, textureX, textureY); // Box 336
		bodyModel[323] = new ModelRendererTurbo(this, 344, 175, textureX, textureY); // Box 337
		bodyModel[324] = new ModelRendererTurbo(this, 325, 172, textureX, textureY); // Box 338
		bodyModel[325] = new ModelRendererTurbo(this, 273, 114, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[326] = new ModelRendererTurbo(this, 446, 32, textureX, textureY); // Box 355 brakewheel
		bodyModel[327] = new ModelRendererTurbo(this, 278, 123, textureX, textureY); // Box 246 B MOUNT
		bodyModel[328] = new ModelRendererTurbo(this, 265, 127, textureX, textureY); // Box 62 B MOUNT
		bodyModel[329] = new ModelRendererTurbo(this, 278, 123, textureX, textureY); // Box 67 B MOUNT
		bodyModel[330] = new ModelRendererTurbo(this, 265, 127, textureX, textureY); // Box 68 B MOUNT
		bodyModel[331] = new ModelRendererTurbo(this, 278, 123, textureX, textureY); // Box 246 B MOUNT
		bodyModel[332] = new ModelRendererTurbo(this, 265, 127, textureX, textureY); // Box 62 B MOUNT
		bodyModel[333] = new ModelRendererTurbo(this, 278, 123, textureX, textureY); // Box 67 B MOUNT
		bodyModel[334] = new ModelRendererTurbo(this, 265, 127, textureX, textureY); // Box 68 B MOUNT
		bodyModel[335] = new ModelRendererTurbo(this, 503, 52, textureX, textureY, "lamp"); // Box 349 PW rear headlight
		bodyModel[336] = new ModelRendererTurbo(this, 503, 47, textureX, textureY, "lamp"); // Box 74 P&W weird light rear
		bodyModel[337] = new ModelRendererTurbo(this, 503, 42, textureX, textureY); // Box 74 P&W weird light
		bodyModel[338] = new ModelRendererTurbo(this, 157, 31, textureX, textureY, "cull"); // Box 339 cull pw beacon holdy
		bodyModel[339] = new ModelRendererTurbo(this, 164, 31, textureX, textureY, "cull"); // Box 340 cull pw beacon holdy
		bodyModel[340] = new ModelRendererTurbo(this, 165, 27, textureX, textureY, BoxName.commander); // Box 410 commander beacon pw
		bodyModel[341] = new ModelRendererTurbo(this, 158, 27, textureX, textureY, BoxName.commander); // Box 342 commander beacon pw
		bodyModel[342] = new ModelRendererTurbo(this, 166, 29, textureX, textureY); // Box 184 o2 generator
		bodyModel[343] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[344] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[345] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[346] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[347] = new ModelRendererTurbo(this, 226, 12, textureX, textureY); // Box 364 prime base
		bodyModel[348] = new ModelRendererTurbo(this, 207, 28, textureX, textureY); // Box 332
		bodyModel[349] = new ModelRendererTurbo(this, 207, 22, textureX, textureY); // Box 331
		bodyModel[350] = new ModelRendererTurbo(this, 214, 25, textureX, textureY); // Box 330
		bodyModel[351] = new ModelRendererTurbo(this, 205, 31, textureX, textureY); // Box 329
		bodyModel[352] = new ModelRendererTurbo(this, 205, 19, textureX, textureY); // Box 328
		bodyModel[353] = new ModelRendererTurbo(this, 203, 25, textureX, textureY); // Box 327
		bodyModel[354] = new ModelRendererTurbo(this, 316, 13, textureX, textureY); // Box 496
		bodyModel[355] = new ModelRendererTurbo(this, 338, 13, textureX, textureY); // Box 497
		bodyModel[356] = new ModelRendererTurbo(this, 319, 7, textureX, textureY); // Box 498
		bodyModel[357] = new ModelRendererTurbo(this, 254, 42, textureX, textureY); // Box 494
		bodyModel[358] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 494
		bodyModel[359] = new ModelRendererTurbo(this, 491, 104, textureX, textureY); // Box 494
		bodyModel[360] = new ModelRendererTurbo(this, 494, 87, textureX, textureY); // Box 494
		bodyModel[361] = new ModelRendererTurbo(this, 501, 98, textureX, textureY); // Box 494
		bodyModel[362] = new ModelRendererTurbo(this, 496, 104, textureX, textureY); // Box 494
		bodyModel[363] = new ModelRendererTurbo(this, 494, 64, textureX, textureY); // Box 494
		bodyModel[364] = new ModelRendererTurbo(this, 501, 81, textureX, textureY); // Box 494
		bodyModel[365] = new ModelRendererTurbo(this, 501, 64, textureX, textureY); // Box 494
		bodyModel[366] = new ModelRendererTurbo(this, 88, 134, textureX, textureY); // Box 13
		bodyModel[367] = new ModelRendererTurbo(this, 89, 130, textureX, textureY); // Box 14
		bodyModel[368] = new ModelRendererTurbo(this, 89, 122, textureX, textureY); // Box 374
		bodyModel[369] = new ModelRendererTurbo(this, 89, 126, textureX, textureY); // Box 375
		bodyModel[370] = new ModelRendererTurbo(this, 112, 134, textureX, textureY); // Box 384
		bodyModel[371] = new ModelRendererTurbo(this, 113, 130, textureX, textureY); // Box 385
		bodyModel[372] = new ModelRendererTurbo(this, 113, 126, textureX, textureY); // Box 386
		bodyModel[373] = new ModelRendererTurbo(this, 113, 122, textureX, textureY); // Box 387
		bodyModel[374] = new ModelRendererTurbo(this, 66, 122, textureX, textureY); // Box 311
		bodyModel[375] = new ModelRendererTurbo(this, 74, 124, textureX, textureY); // Box 312
		bodyModel[376] = new ModelRendererTurbo(this, 71, 124, textureX, textureY); // Box 313
		bodyModel[377] = new ModelRendererTurbo(this, 16, 122, textureX, textureY); // Box 381
		bodyModel[378] = new ModelRendererTurbo(this, 13, 124, textureX, textureY); // Box 382
		bodyModel[379] = new ModelRendererTurbo(this, 10, 124, textureX, textureY); // Box 383
		bodyModel[380] = new ModelRendererTurbo(this, 88, 134, textureX, textureY); // Box 13
		bodyModel[381] = new ModelRendererTurbo(this, 89, 130, textureX, textureY); // Box 14
		bodyModel[382] = new ModelRendererTurbo(this, 89, 122, textureX, textureY); // Box 374
		bodyModel[383] = new ModelRendererTurbo(this, 89, 126, textureX, textureY); // Box 375
		bodyModel[384] = new ModelRendererTurbo(this, 112, 134, textureX, textureY); // Box 384
		bodyModel[385] = new ModelRendererTurbo(this, 113, 130, textureX, textureY); // Box 385
		bodyModel[386] = new ModelRendererTurbo(this, 113, 126, textureX, textureY); // Box 386
		bodyModel[387] = new ModelRendererTurbo(this, 113, 122, textureX, textureY); // Box 387
		bodyModel[388] = new ModelRendererTurbo(this, 255, 104, textureX, textureY); // Box 308
		bodyModel[389] = new ModelRendererTurbo(this, 255, 94, textureX, textureY); // Box 316
		bodyModel[390] = new ModelRendererTurbo(this, 255, 114, textureX, textureY); // Box 373
		bodyModel[391] = new ModelRendererTurbo(this, 255, 92, textureX, textureY); // Box 377
		bodyModel[392] = new ModelRendererTurbo(this, 249, 115, textureX, textureY); // Box 371
		bodyModel[393] = new ModelRendererTurbo(this, 252, 115, textureX, textureY); // Box 372
		bodyModel[394] = new ModelRendererTurbo(this, 252, 87, textureX, textureY); // Box 376
		bodyModel[395] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 378
		bodyModel[396] = new ModelRendererTurbo(this, 244, 114, textureX, textureY); // Box 373
		bodyModel[397] = new ModelRendererTurbo(this, 244, 92, textureX, textureY); // Box 377
		bodyModel[398] = new ModelRendererTurbo(this, 238, 115, textureX, textureY); // Box 278 CN Handrails
		bodyModel[399] = new ModelRendererTurbo(this, 241, 115, textureX, textureY); // Box 278 CN Handrails
		bodyModel[400] = new ModelRendererTurbo(this, 241, 91, textureX, textureY); // Box 278 CN Handrails
		bodyModel[401] = new ModelRendererTurbo(this, 238, 90, textureX, textureY); // Box 278 CN Handrails
		bodyModel[402] = new ModelRendererTurbo(this, 93, 127, textureX, textureY); // Box 18
		bodyModel[403] = new ModelRendererTurbo(this, 93, 131, textureX, textureY); // Box 20
		bodyModel[404] = new ModelRendererTurbo(this, 105, 127, textureX, textureY); // Box 85
		bodyModel[405] = new ModelRendererTurbo(this, 105, 131, textureX, textureY); // Box 87
		bodyModel[406] = new ModelRendererTurbo(this, 46, 183, textureX, textureY); // Box 132
		bodyModel[407] = new ModelRendererTurbo(this, 16, 183, textureX, textureY); // Box 133
		bodyModel[408] = new ModelRendererTurbo(this, 470, 195, textureX, textureY); // Box 132
		bodyModel[409] = new ModelRendererTurbo(this, 440, 195, textureX, textureY); // Box 133
		bodyModel[410] = new ModelRendererTurbo(this, 146, 57, textureX, textureY); // Box 114
		bodyModel[411] = new ModelRendererTurbo(this, 146, 57, textureX, textureY); // Box 74
		bodyModel[412] = new ModelRendererTurbo(this, 146, 60, textureX, textureY); // Box 78
		bodyModel[413] = new ModelRendererTurbo(this, 145, 53, textureX, textureY, "cull"); // Box 1007 cull
		bodyModel[414] = new ModelRendererTurbo(this, 246, 183, textureX, textureY); // Box 384 fncc engine oil sump
		bodyModel[415] = new ModelRendererTurbo(this, 43, 139, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[416] = new ModelRendererTurbo(this, 36, 139, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[417] = new ModelRendererTurbo(this, 477, 130, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[418] = new ModelRendererTurbo(this, 484, 130, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[419] = new ModelRendererTurbo(this, 102, 151, textureX, textureY); // Box 132
		bodyModel[420] = new ModelRendererTurbo(this, 79, 151, textureX, textureY); // Box 133
		bodyModel[421] = new ModelRendererTurbo(this, 399, 163, textureX, textureY); // Box 328
		bodyModel[422] = new ModelRendererTurbo(this, 425, 163, textureX, textureY); // Box 329

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(-43.5F, 3F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-40.5F, 2.5F, -2F);

		bodyModel[2].addBox(0F, 0F, 0F, 48, 20, 14, 0F); // Box 2
		bodyModel[2].setRotationPoint(-16.5F, -21F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 69, 1, 5, 0F); // Box 0
		bodyModel[3].setRotationPoint(-34.5F, -1F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 6
		bodyModel[4].setRotationPoint(-39.51F, -1F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 13
		bodyModel[5].setRotationPoint(-39.5F, 8F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 14
		bodyModel[6].setRotationPoint(-39.5F, 5.5F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[7].setRotationPoint(-39.5F, 3.5F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[8].setRotationPoint(-39.5F, 6F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 21
		bodyModel[9].setRotationPoint(-39.5F, 8F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[10].setRotationPoint(-39.5F, 3.5F, 9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[11].setRotationPoint(-39.5F, 6F, 9F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 26
		bodyModel[12].setRotationPoint(40.5F, 3F, -1.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[13].setRotationPoint(39.5F, 2.5F, -2F);

		bodyModel[14].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 28
		bodyModel[14].setRotationPoint(-39.51F, 7F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 48
		bodyModel[15].setRotationPoint(39.51F, -1F, -10F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 49
		bodyModel[16].setRotationPoint(39.49F, 7F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 50
		bodyModel[17].setRotationPoint(39.5F, 8F, -9F);

		bodyModel[18].addBox(0F, 0F, 0F, 79, 4, 12, 0F); // Box 52
		bodyModel[18].setRotationPoint(-39.5F, -1F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[19].setRotationPoint(-35.5F, -1F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 67
		bodyModel[20].setRotationPoint(-35.5F, -1F, 9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[21].setRotationPoint(-41.5F, 6F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[22].setRotationPoint(-41.5F, 6F, 0F);

		bodyModel[23].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 141
		bodyModel[23].setRotationPoint(-39.5F, 3F, -3F);

		bodyModel[24].addBox(0F, 0F, 0F, 16, 3, 2, 0F); // Box 117
		bodyModel[24].setRotationPoint(19.5F, -21F, -9F);

		bodyModel[25].addBox(0F, 0F, 0F, 69, 1, 5, 0F); // Box 206
		bodyModel[25].setRotationPoint(-34.5F, -1F, 6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 451 front ditchlight U
		bodyModel[26].setRotationPoint(-36F, -7F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 454 front ditchlight U
		bodyModel[27].setRotationPoint(-36F, -7F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 455
		bodyModel[28].setRotationPoint(-41.5F, -1F, -3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[29].setRotationPoint(-42.5F, 6F, 0F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[30].setRotationPoint(-42.5F, 7F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[31].setRotationPoint(-42.5F, 6F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[32].setRotationPoint(-42.5F, 7F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[33].setRotationPoint(-43F, 4F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 447
		bodyModel[34].setRotationPoint(-42.5F, 4F, 2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[35].setRotationPoint(-42.5F, 5F, 2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[36].setRotationPoint(-42.5F, 5F, -10F);

		bodyModel[37].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 471
		bodyModel[37].setRotationPoint(34.5F, -1F, 6F);

		bodyModel[38].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 472
		bodyModel[38].setRotationPoint(34.5F, -1F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[39].setRotationPoint(34.5F, -1F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[40].setRotationPoint(34.5F, -1F, 9F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 15, 13, 0F); // Box 490
		bodyModel[41].setRotationPoint(35.5F, -16F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 16, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 493
		bodyModel[42].setRotationPoint(19.5F, -18F, -8F);

		bodyModel[43].addBox(0F, 0F, 0F, 16, 3, 2, 0F); // Box 494
		bodyModel[43].setRotationPoint(19.5F, -21F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[44].setRotationPoint(-16.5F, -22F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[45].setRotationPoint(-16.5F, -22F, 5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 36, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[46].setRotationPoint(-16.5F, -22F, -5F);

		bodyModel[47].addBox(0F, 0F, 0F, 16, 1, 4, 0F); // Box 500 cull
		bodyModel[47].setRotationPoint(19.5F, -22F, -2F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 502
		bodyModel[48].setRotationPoint(35.5F, -21F, -2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[49].setRotationPoint(35.5F, -21F, 2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 15, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[50].setRotationPoint(36.5F, -16F, -6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[51].setRotationPoint(35.5F, -22F, 2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[52].setRotationPoint(35.5F, -21F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[53].setRotationPoint(35.5F, -22F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[54].setRotationPoint(35.5F, -17F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 159
		bodyModel[55].setRotationPoint(35.5F, -17F, 2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 160
		bodyModel[56].setRotationPoint(35.5F, -17F, -6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 161
		bodyModel[57].setRotationPoint(35.5F, -17F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 162 rear headlight
		bodyModel[58].setRotationPoint(37F, -20F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 163 rear headlight
		bodyModel[59].setRotationPoint(37F, -20F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[60].setRotationPoint(39.5F, 6F, 0F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 169
		bodyModel[61].setRotationPoint(39.5F, 6F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 170
		bodyModel[62].setRotationPoint(39.5F, 7F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 171
		bodyModel[63].setRotationPoint(39.5F, 7F, 0F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 201
		bodyModel[64].setRotationPoint(-24.5F, 3.1F, -2F);

		bodyModel[65].addBox(0F, 0F, -3F, 1, 1, 3, 0F); // Box 202
		bodyModel[65].setRotationPoint(1.5F, 3.75F, -7F);
		bodyModel[65].rotateAngleX = -0.43633231F;

		bodyModel[66].addBox(0F, 0F, 0F, 42, 8, 0, 0F); // Box 224
		bodyModel[66].setRotationPoint(-6.5F, -9F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 42, 8, 0, 0F); // Box 225
		bodyModel[67].setRotationPoint(-6.5F, -9F, 11F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 226
		bodyModel[68].setRotationPoint(-41.5F, -9F, -3F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 228
		bodyModel[69].setRotationPoint(-40.5F, -9F, -7F);

		bodyModel[70].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 229
		bodyModel[70].setRotationPoint(-40.5F, -9F, 6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 230
		bodyModel[71].setRotationPoint(-40.5F, -9F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[72].setRotationPoint(-40.5F, -9F, 3F);

		bodyModel[73].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 236 smol stacc
		bodyModel[73].setRotationPoint(11F, -22.5F, -1.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 237
		bodyModel[74].setRotationPoint(1.5F, 3.75F, 7F);
		bodyModel[74].rotateAngleX = 0.43633231F;

		bodyModel[75].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 245
		bodyModel[75].setRotationPoint(-24F, 0F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 246
		bodyModel[76].setRotationPoint(-23.5F, 0F, -10F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 247
		bodyModel[77].setRotationPoint(-24F, 0F, 10F);

		bodyModel[78].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 248
		bodyModel[78].setRotationPoint(21F, 0F, 10F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 250
		bodyModel[79].setRotationPoint(21F, 0F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 557
		bodyModel[80].setRotationPoint(-23.5F, 0F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 561
		bodyModel[81].setRotationPoint(-11F, 0F, 7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 562
		bodyModel[82].setRotationPoint(3F, 0F, 7F);

		bodyModel[83].addBox(0F, 0F, 0F, 7, 3, 22, 0F); // Box 563
		bodyModel[83].setRotationPoint(-16.5F, -4F, -11F);

		bodyModel[84].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[84].setRotationPoint(-39.5F, -3F, 10F);

		bodyModel[85].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 682
		bodyModel[85].setRotationPoint(-39.5F, -3F, -11F);

		bodyModel[86].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 684
		bodyModel[86].setRotationPoint(39.5F, -3F, 10F);

		bodyModel[87].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 685
		bodyModel[87].setRotationPoint(39.5F, -3F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 708
		bodyModel[88].setRotationPoint(-39.5F, -9F, 8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,1F, 0F, -1F, -1F, 0F, -1F, -1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 709
		bodyModel[89].setRotationPoint(-39.5F, -9F, -9F);

		bodyModel[90].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 721
		bodyModel[90].setRotationPoint(-16.5F, -12F, 11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 722
		bodyModel[91].setRotationPoint(-11.5F, -12F, 11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 723
		bodyModel[92].setRotationPoint(-11.5F, -12F, -11F);

		bodyModel[93].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 724
		bodyModel[93].setRotationPoint(-16.5F, -12F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull
		bodyModel[94].setRotationPoint(-25.5F, -19F, 10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[95].setRotationPoint(-25.5F, -20F, 10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[96].setRotationPoint(-25.5F, -20F, 11F);
		bodyModel[96].rotateAngleX = 0.26179939F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[97].setRotationPoint(-25.5F, -20.25F, -11.97F);
		bodyModel[97].rotateAngleX = -0.26179939F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 359 front ditchlight L
		bodyModel[98].setRotationPoint(-40.75F, -1F, -9.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 360 cull
		bodyModel[99].setRotationPoint(-40.5F, -1F, -9.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 277
		bodyModel[100].setRotationPoint(-39.5F, 2F, -9F);

		bodyModel[101].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 280
		bodyModel[101].setRotationPoint(-39.5F, 2F, 9F);

		bodyModel[102].addShapeBox(0F, 0F, -0.5F, 1, 2, 5, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 117 liveryimg 2
		bodyModel[102].setRotationPoint(36.31F, -19.5F, 2.5F);
		bodyModel[102].rotateAngleY = 0.37960911F;

		bodyModel[103].addShapeBox(0F, 0F, -4.5F, 1, 2, 5, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 298 liveryimg 2
		bodyModel[103].setRotationPoint(36.31F, -19.5F, -2.5F);
		bodyModel[103].rotateAngleY = -0.37960911F;

		bodyModel[104].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 302
		bodyModel[104].setRotationPoint(35.5F, 8F, -11F);

		bodyModel[105].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 303
		bodyModel[105].setRotationPoint(35.5F, 5.5F, -10F);

		bodyModel[106].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 305
		bodyModel[106].setRotationPoint(35.5F, 3F, -10F);

		bodyModel[107].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 306
		bodyModel[107].setRotationPoint(35.5F, 2F, -9F);

		bodyModel[108].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 307
		bodyModel[108].setRotationPoint(35.5F, 0.5F, -10F);

		bodyModel[109].addBox(0F, 0F, 0F, 0, 9, 2, 0F); // Box 308
		bodyModel[109].setRotationPoint(35.5F, -1F, -11F);

		bodyModel[110].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 309
		bodyModel[110].setRotationPoint(35.5F, 0.5F, 9F);

		bodyModel[111].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 310
		bodyModel[111].setRotationPoint(35.5F, 2F, 9F);

		bodyModel[112].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 311
		bodyModel[112].setRotationPoint(35.5F, 3F, 9F);

		bodyModel[113].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 313
		bodyModel[113].setRotationPoint(35.5F, 5.5F, 9F);

		bodyModel[114].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 315
		bodyModel[114].setRotationPoint(35.5F, 8F, 9F);

		bodyModel[115].addBox(0F, 0F, 0F, 0, 9, 2, 0F); // Box 316
		bodyModel[115].setRotationPoint(35.5F, -1F, 9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 317
		bodyModel[116].setRotationPoint(21.5F, 0F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 319
		bodyModel[117].setRotationPoint(21.5F, 0F, 7F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 320 cull
		bodyModel[118].setRotationPoint(-40.5F, -1F, 7.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 321 front ditchlight L
		bodyModel[119].setRotationPoint(-40.75F, -1F, 7.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 325
		bodyModel[120].setRotationPoint(37.5F, 3F, -3F);

		bodyModel[121].addBox(0F, 0F, 0F, 15, 6, 16, 0F); // Box 2
		bodyModel[121].setRotationPoint(-5.5F, 3.25F, -8F);

		bodyModel[122].addBox(0F, 0F, 0F, 7, 3, 3, 0F); // Box 10
		bodyModel[122].setRotationPoint(-5.5F, 3.25F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[123].setRotationPoint(-5.5F, 6.25F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 158
		bodyModel[124].setRotationPoint(-5.5F, 6.25F, 8F);

		bodyModel[125].addBox(0F, 0F, 0F, 7, 3, 3, 0F); // Box 159
		bodyModel[125].setRotationPoint(-5.5F, 3.25F, 8F);

		bodyModel[126].addBox(0F, 0F, 0F, 7, 3, 3, 0F); // Box 303
		bodyModel[126].setRotationPoint(2.5F, 3.25F, 8F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 304
		bodyModel[127].setRotationPoint(1.5F, 4.25F, 8F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 305
		bodyModel[128].setRotationPoint(1.5F, 4.25F, -11F);

		bodyModel[129].addBox(0F, 0F, 0F, 7, 3, 3, 0F); // Box 306
		bodyModel[129].setRotationPoint(2.5F, 3.25F, -11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 307
		bodyModel[130].setRotationPoint(-41.5F, -1F, -7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F); // Box 308
		bodyModel[131].setRotationPoint(-41.5F, -1F, 3F);

		bodyModel[132].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 309
		bodyModel[132].setRotationPoint(-39.5F, -1F, -9F);

		bodyModel[133].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 310
		bodyModel[133].setRotationPoint(-39.5F, -1F, 6F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 311
		bodyModel[134].setRotationPoint(-34.5F, 0F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[135].setRotationPoint(-33.5F, 0F, -11F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 313
		bodyModel[136].setRotationPoint(-34.5F, 0F, -11F);

		bodyModel[137].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 362
		bodyModel[137].setRotationPoint(-40.5F, -9F, -8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[138].setRotationPoint(-40.5F, -8F, -8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[139].setRotationPoint(-40.5F, -8F, 7F);

		bodyModel[140].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 365
		bodyModel[140].setRotationPoint(-40.5F, -9F, 7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 369
		bodyModel[141].setRotationPoint(-35.51F, -8F, -8F);

		bodyModel[142].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 370
		bodyModel[142].setRotationPoint(-35.51F, -9F, -8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 371
		bodyModel[143].setRotationPoint(-35.51F, -9F, -9F);

		bodyModel[144].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 372
		bodyModel[144].setRotationPoint(-35.51F, -3F, -11F);

		bodyModel[145].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 373
		bodyModel[145].setRotationPoint(-35.51F, 4F, -11F);

		bodyModel[146].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 374
		bodyModel[146].setRotationPoint(-39.5F, 0.5F, -10F);

		bodyModel[147].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 375
		bodyModel[147].setRotationPoint(-39.5F, 3F, -10F);

		bodyModel[148].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 376
		bodyModel[148].setRotationPoint(-35.51F, -3F, 10F);

		bodyModel[149].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 377
		bodyModel[149].setRotationPoint(-35.51F, 4F, 9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 378
		bodyModel[150].setRotationPoint(-35.51F, -9F, 8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[151].setRotationPoint(-35.51F, -8F, 7F);

		bodyModel[152].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 380
		bodyModel[152].setRotationPoint(-35.51F, -9F, 7F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 0, 8, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[153].setRotationPoint(-34.5F, 0F, 9F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 382
		bodyModel[154].setRotationPoint(-34.5F, 0F, 11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[155].setRotationPoint(-33.5F, 0F, 11F);

		bodyModel[156].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 384
		bodyModel[156].setRotationPoint(-39.5F, 8F, 9F);

		bodyModel[157].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 385
		bodyModel[157].setRotationPoint(-39.5F, 5.5F, 9F);

		bodyModel[158].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 386
		bodyModel[158].setRotationPoint(-39.5F, 3F, 9F);

		bodyModel[159].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 387
		bodyModel[159].setRotationPoint(-39.5F, 0.5F, 9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[160].setRotationPoint(39.5F, 5F, 2F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 245
		bodyModel[161].setRotationPoint(39.5F, 5F, -10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 246
		bodyModel[162].setRotationPoint(40F, 4F, -10F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[163].setRotationPoint(39.5F, 4F, 2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 248 front headlight U
		bodyModel[164].setRotationPoint(-30.75F, -22.25F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 249 front headlight U
		bodyModel[165].setRotationPoint(-30.75F, -22.25F, -2F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 250
		bodyModel[166].setRotationPoint(-30.5F, -22.25F, -2F);

		bodyModel[167].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 319
		bodyModel[167].setRotationPoint(-28F, -24F, -0.5F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 320
		bodyModel[168].setRotationPoint(-27.5F, -23F, -0.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 321
		bodyModel[169].setRotationPoint(-29F, -23.5F, 0.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 322
		bodyModel[170].setRotationPoint(-29F, -23.5F, -1.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 356 front ditchlight C
		bodyModel[171].setRotationPoint(-41.75F, -4F, -5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 357 front ditchlight C
		bodyModel[172].setRotationPoint(-41.75F, -4F, 3F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[173].setRotationPoint(-41.25F, -3F, -4.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[174].setRotationPoint(-41.25F, -3F, 3.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 360
		bodyModel[175].setRotationPoint(-43F, 3F, -10F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F); // Box 361
		bodyModel[176].setRotationPoint(-43F, 3F, 2F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F); // Box 362
		bodyModel[177].setRotationPoint(40F, 3F, 2F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 363
		bodyModel[178].setRotationPoint(40F, 3F, -10F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[179].setRotationPoint(-21.5F, -23F, -5F);

		bodyModel[180].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[180].setRotationPoint(6F, -23F, -5.5F);

		bodyModel[181].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[181].setRotationPoint(7F, -22.75F, -4.5F);

		bodyModel[182].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[182].setRotationPoint(6.5F, -22.75F, -6.5F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[183].setRotationPoint(8.5F, -22F, -5.5F);

		bodyModel[184].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 261
		bodyModel[184].setRotationPoint(-9.5F, 3.25F, -11F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[185].setRotationPoint(-9.5F, 6.25F, -11F);

		bodyModel[186].addBox(0F, 0F, 0F, 4, 6, 16, 0F); // Box 263
		bodyModel[186].setRotationPoint(-9.5F, 3.25F, -8F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 264
		bodyModel[187].setRotationPoint(-9.5F, 6.25F, 8F);

		bodyModel[188].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 265
		bodyModel[188].setRotationPoint(-9.5F, 3.25F, 8F);

		bodyModel[189].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 266 big stacc
		bodyModel[189].setRotationPoint(11.25F, -23F, -2F);

		bodyModel[190].addBox(0F, 0F, 0F, 15, 1, 2, 0F); // Box 267
		bodyModel[190].setRotationPoint(-5.5F, -22.5F, -1F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[191].setRotationPoint(34F, -10F, 6F);

		bodyModel[192].addBox(0F, 0F, 0F, 4, 11, 13, 0F); // Box 272
		bodyModel[192].setRotationPoint(31.5F, -12F, -7F);

		bodyModel[193].addBox(0F, 0F, 0F, 4, 9, 14, 0F); // Box 273
		bodyModel[193].setRotationPoint(31.5F, -21F, -7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[194].setRotationPoint(32.5F, -7F, 6F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 275
		bodyModel[195].setRotationPoint(32.5F, -12F, 6F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[196].setRotationPoint(35.5F, -22F, -2F);

		bodyModel[197].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 277
		bodyModel[197].setRotationPoint(-35.51F, -9F, -9F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 278
		bodyModel[198].setRotationPoint(-35.51F, -5F, -9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 279
		bodyModel[199].setRotationPoint(-35.51F, -5F, 8F);

		bodyModel[200].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 280
		bodyModel[200].setRotationPoint(-35.51F, -9F, 8F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[201].setRotationPoint(-23.5F, -23F, 0F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[202].setRotationPoint(40.5F, -3F, -5.75F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r
		bodyModel[203].setRotationPoint(40.75F, -3F, -5.75F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r
		bodyModel[204].setRotationPoint(40.75F, -3F, 3.75F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[205].setRotationPoint(40.5F, -3F, 3.75F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 commander bacon
		bodyModel[206].setRotationPoint(-25F, -24F, -0.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[207].setRotationPoint(-24.85F, -23F, -0.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 292
		bodyModel[208].setRotationPoint(39.5F, -1F, -3F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 293
		bodyModel[209].setRotationPoint(39.5F, -1F, -7F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F); // Box 294
		bodyModel[210].setRotationPoint(39.5F, -1F, 3F);

		bodyModel[211].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 295
		bodyModel[211].setRotationPoint(41.5F, -9F, -3F);

		bodyModel[212].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 296
		bodyModel[212].setRotationPoint(40.5F, -9F, -7F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 297
		bodyModel[213].setRotationPoint(40.5F, -9F, -6F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[214].setRotationPoint(40.5F, -9F, 3F);

		bodyModel[215].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 299
		bodyModel[215].setRotationPoint(40.5F, -9F, 6F);

		bodyModel[216].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 300
		bodyModel[216].setRotationPoint(40.5F, -9F, 7F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[217].setRotationPoint(40.5F, -8F, 7F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,-1F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 302
		bodyModel[218].setRotationPoint(39.5F, -9F, 8F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,-1F, 0F, -1F, 1F, 0F, -1F, 1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 303
		bodyModel[219].setRotationPoint(39.5F, -9F, -9F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 304
		bodyModel[220].setRotationPoint(40.5F, -8F, -8F);

		bodyModel[221].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 305
		bodyModel[221].setRotationPoint(40.5F, -9F, -8F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 306
		bodyModel[222].setRotationPoint(-39.5F, -5F, -9F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[223].setRotationPoint(-40.5F, -9F, -9F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 308
		bodyModel[224].setRotationPoint(-39.5F, -5F, 8F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[225].setRotationPoint(-40.5F, -9F, 8F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 310
		bodyModel[226].setRotationPoint(39.5F, -5F, 8F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[227].setRotationPoint(40.5F, -9F, 8F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 312
		bodyModel[228].setRotationPoint(39.5F, -5F, -9F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[229].setRotationPoint(40.5F, -9F, -9F);

		bodyModel[230].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 298 rear morker lights
		bodyModel[230].setRotationPoint(36.3F, -21F, 2.5F);
		bodyModel[230].rotateAngleY = 0.37524579F;

		bodyModel[231].addShapeBox(0F, 0F, -4F, 1, 1, 3, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 298 rear morker lights
		bodyModel[231].setRotationPoint(36.3F, -21F, -2.5F);
		bodyModel[231].rotateAngleY = -0.37524579F;

		bodyModel[232].addBox(0.5F, 0F, 0.5F, 3, 9, 2, 0F); // Box 412 cs1
		bodyModel[232].setRotationPoint(-23F, -15F, 0F);
		bodyModel[232].rotateAngleY = -0.19198622F;

		bodyModel[233].addBox(0F, 0F, 0F, 6, 7, 2, 0F); // Box 413 cs1
		bodyModel[233].setRotationPoint(-28.1F, -13F, 4F);
		bodyModel[233].rotateAngleY = -0.59341195F;

		bodyModel[234].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs1
		bodyModel[234].setRotationPoint(-28.1F, -15F, 4F);
		bodyModel[234].rotateAngleY = -0.59341195F;

		bodyModel[235].addShapeBox(-0.5F, 0F, 0.5F, 4, 2, 2, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 476 cs1 radio
		bodyModel[235].setRotationPoint(-23F, -17F, 0F);
		bodyModel[235].rotateAngleY = -0.19198622F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 504
		bodyModel[236].setRotationPoint(36.5F, -16F, 6F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 490
		bodyModel[237].setRotationPoint(35.5F, -16F, 6F);

		bodyModel[238].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 490
		bodyModel[238].setRotationPoint(31.5F, -12F, 6F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 504
		bodyModel[239].setRotationPoint(36.5F, -7F, 6F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[240].setRotationPoint(36.5F, -9F, 6F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 504
		bodyModel[241].setRotationPoint(36.5F, -12F, 6F);

		bodyModel[242].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 557 type B shit
		bodyModel[242].setRotationPoint(-23.5F, 0F, -10F);

		bodyModel[243].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 557 type B shit
		bodyModel[243].setRotationPoint(21.5F, 0F, -10F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 406 hot plate cull
		bodyModel[244].setRotationPoint(-17.5F, -14F, -6F);

		bodyModel[245].addBox(0F, 0F, 0F, 11, 5, 22, 0F); // Box 95
		bodyModel[245].setRotationPoint(-27.5F, -6F, -11F);

		bodyModel[246].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 29
		bodyModel[246].setRotationPoint(-27.5F, -20F, -11F);

		bodyModel[247].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 32
		bodyModel[247].setRotationPoint(-27.5F, -20F, 10F);

		bodyModel[248].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 314 door swing left
		bodyModel[248].setRotationPoint(-17F, -20F, 7.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 449 front headlight N
		bodyModel[249].setRotationPoint(-37.75F, -13F, 0F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[250].setRotationPoint(-32.8F, -21F, -0.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[251].setRotationPoint(-32.8F, -22F, -0.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[252].setRotationPoint(-32.55F, -20.5F, -0.25F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 481 cull
		bodyModel[253].setRotationPoint(-33F, -22F, -1F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 238
		bodyModel[254].setRotationPoint(-35F, -15.75F, -7F);

		bodyModel[255].addBox(0F, 0F, 0F, 11, 2, 14, 0F); // Box 71
		bodyModel[255].setRotationPoint(-27.5F, -22F, -7F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -1F, 1.5F, 0F); // Box 55
		bodyModel[256].setRotationPoint(-28.5F, -22F, 7F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 74
		bodyModel[257].setRotationPoint(-28.5F, -22F, -7F);

		bodyModel[258].addShapeBox(0F, -1F, 0F, 8, 14, 10, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[258].setRotationPoint(-36F, -14F, -5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 55
		bodyModel[259].setRotationPoint(-35.5F, -15F, -11F);

		bodyModel[260].addBox(0F, -1F, 0F, 7, 12, 22, 0F); // Box 35
		bodyModel[260].setRotationPoint(-34.5F, -12F, -11F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 55
		bodyModel[261].setRotationPoint(-35.5F, -15F, 5F);

		bodyModel[262].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 74 door swing right
		bodyModel[262].setRotationPoint(-36.5F, -15F, -5F);
		bodyModel[262].rotateAngleY = 0.2443461F;

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 84
		bodyModel[263].setRotationPoint(-37F, -15F, -5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 85
		bodyModel[264].setRotationPoint(-37F, -15F, 0F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[265].setRotationPoint(-34.5F, -15F, -11F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[266].setRotationPoint(-34.5F, -15F, 5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[267].setRotationPoint(-27.5F, -22F, -11F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[268].setRotationPoint(-27.5F, -22F, 7F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 96
		bodyModel[269].setRotationPoint(-30.5F, -22F, -7F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 97
		bodyModel[270].setRotationPoint(-30.5F, -22F, 0F);

		bodyModel[271].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 74
		bodyModel[271].setRotationPoint(-37.5F, -15F, 0F);

		bodyModel[272].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 137 numberboard cab
		bodyModel[272].setRotationPoint(-28.6F, -22F, 7F);
		bodyModel[272].rotateAngleY = -0.25307274F;

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 137 numberboard cab
		bodyModel[273].setRotationPoint(-28.6F, -22F, -7F);
		bodyModel[273].rotateAngleY = 0.25307274F;

		bodyModel[274].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 346 door swing right
		bodyModel[274].setRotationPoint(-17F, -20F, -7.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[275].setRotationPoint(-28.5F, -20F, 0F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 355
		bodyModel[276].setRotationPoint(-35.5F, -13F, -11F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 356
		bodyModel[277].setRotationPoint(-35.5F, -13F, 5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, 1.8F, 0F, 0F); // Box 359
		bodyModel[278].setRotationPoint(-28.5F, -20F, -7F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[279].setRotationPoint(-28.5F, -22F, -11F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F); // Box 361
		bodyModel[280].setRotationPoint(-35F, -15.75F, 5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 703 glow marker lights
		bodyModel[281].setRotationPoint(-27.7F, -20F, -10.5F);
		bodyModel[281].rotateAngleX = 0.41887902F;
		bodyModel[281].rotateAngleY = 0.2443461F;

		bodyModel[282].addShapeBox(0F, 0F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 704 glow marker lights
		bodyModel[282].setRotationPoint(-27.7F, -20F, 10.5F);
		bodyModel[282].rotateAngleX = -0.41887902F;
		bodyModel[282].rotateAngleY = -0.2443461F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 448 front headlight N
		bodyModel[283].setRotationPoint(-37.75F, -15F, 0F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 74 P&W weird light front
		bodyModel[284].setRotationPoint(-38.6F, -15F, 0F);

		bodyModel[285].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 74 P&W weird light
		bodyModel[285].setRotationPoint(-38.5F, -15F, 0F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,0.26F, 0F, 0F, -0.27F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, 0.26F, 0F, 0F, -0.27F, 0F, 0F, 0F, 1.5F, 0F, -1F, 1.5F, 0F); // Box 55
		bodyModel[286].setRotationPoint(-28.5F, -21F, 6F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,-1F, -1.5F, 0F, 0F, -1.5F, 0F, -0.27F, 0F, 0F, 0.26F, 0F, 0F, -1F, 1.5F, 0F, 0F, 1.5F, 0F, -0.27F, 0F, 0F, 0.26F, 0F, 0F); // Box 56
		bodyModel[287].setRotationPoint(-28.5F, -21F, -11F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 0, 14, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.75F, 0F, 0F, -2.75F, 0F, 0F); // Box 57 nose cope slope
		bodyModel[288].setRotationPoint(-37.26F, -15F, 0F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 0, 14, 11, 0F,-2.75F, 0F, 0F, 2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, 2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58 nose cope slope
		bodyModel[289].setRotationPoint(-37.26F, -15F, -11F);

		bodyModel[290].addBox(0F, 0F, 0F, 1, 14, 14, 0F); // Box 406 cull backpannel
		bodyModel[290].setRotationPoint(-17.5F, -20F, -7F);

		bodyModel[291].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[291].setRotationPoint(-33F, -24.5F, -1F);

		bodyModel[292].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[292].setRotationPoint(-33F, -24.5F, 0.25F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 330
		bodyModel[293].setRotationPoint(-32F, -22.5F, -0.5F);

		bodyModel[294].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[294].setRotationPoint(-34F, -23.25F, -1.5F);

		bodyModel[295].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[295].setRotationPoint(-33.5F, -23.25F, 0.5F);

		bodyModel[296].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[296].setRotationPoint(-34.5F, -23.5F, -0.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[297].setRotationPoint(-39.5F, 3F, -6.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 370
		bodyModel[298].setRotationPoint(33.5F, 3F, -6.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 23, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 372
		bodyModel[299].setRotationPoint(-11.5F, 3F, -6.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F); // Box 520
		bodyModel[300].setRotationPoint(-33.5F, 3F, -6.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F); // Box 521
		bodyModel[301].setRotationPoint(-29.5F, 3F, -6.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F); // Box 522
		bodyModel[302].setRotationPoint(-13.5F, 3F, -6.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F); // Box 523
		bodyModel[303].setRotationPoint(-17.5F, 3F, -6.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 10, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 524
		bodyModel[304].setRotationPoint(-27.5F, 3F, -6.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 525
		bodyModel[305].setRotationPoint(-31.5F, 2F, -6.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 526
		bodyModel[306].setRotationPoint(-15.5F, 2F, -6.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 10, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 528
		bodyModel[307].setRotationPoint(17.5F, 3F, -6.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F); // Box 529
		bodyModel[308].setRotationPoint(15.5F, 3F, -6.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 530
		bodyModel[309].setRotationPoint(13.5F, 2F, -6.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F); // Box 531
		bodyModel[310].setRotationPoint(11.5F, 3F, -6.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F); // Box 532
		bodyModel[311].setRotationPoint(27.5F, 3F, -6.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 533
		bodyModel[312].setRotationPoint(29.5F, 2F, -6.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F); // Box 534
		bodyModel[313].setRotationPoint(31.5F, 3F, -6.5F);

		bodyModel[314].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 527
		bodyModel[314].setRotationPoint(-24F, 3F, -5.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, -3F); // Box 535
		bodyModel[315].setRotationPoint(-25F, 3F, -5.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 536
		bodyModel[316].setRotationPoint(-21F, 3F, -5.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 331 support your local B
		bodyModel[317].setRotationPoint(-33.5F, 3F, -6.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 331 support your local B
		bodyModel[318].setRotationPoint(-17.5F, 3F, -6.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 331 support your local B
		bodyModel[319].setRotationPoint(11.5F, 3F, -6.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 331 support your local B
		bodyModel[320].setRotationPoint(27.5F, 3F, -6.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 335
		bodyModel[321].setRotationPoint(24F, 3F, -5.5F);

		bodyModel[322].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 336
		bodyModel[322].setRotationPoint(20.5F, 3.1F, -2F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, -3F); // Box 337
		bodyModel[323].setRotationPoint(20F, 3F, -5.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 338
		bodyModel[324].setRotationPoint(21F, 3F, -5.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,-0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, -3.75F, -0.1F, -0.1F, -3.5F, -0.1F, -0.1F, -3.5F, -0.1F, -0.1F, -3.75F, -0.1F); // Box 527 why dont you filter some bitches instead
		bodyModel[325].setRotationPoint(-15F, 0F, 7.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 355 brakewheel
		bodyModel[326].setRotationPoint(32F, -12F, 7F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 246 B MOUNT
		bodyModel[327].setRotationPoint(-24F, 0F, -10F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 62 B MOUNT
		bodyModel[328].setRotationPoint(-24F, 2.5F, -6.75F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F); // Box 67 B MOUNT
		bodyModel[329].setRotationPoint(-24F, 0F, 6F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68 B MOUNT
		bodyModel[330].setRotationPoint(-24F, 2.5F, 5.75F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 246 B MOUNT
		bodyModel[331].setRotationPoint(21F, 0F, -10F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 62 B MOUNT
		bodyModel[332].setRotationPoint(21F, 2.5F, -6.75F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F); // Box 67 B MOUNT
		bodyModel[333].setRotationPoint(21F, 0F, 6F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68 B MOUNT
		bodyModel[334].setRotationPoint(21F, 2.5F, 5.75F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 349 PW rear headlight
		bodyModel[335].setRotationPoint(37F, -18.5F, -1F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 74 P&W weird light rear
		bodyModel[336].setRotationPoint(37.6F, -20.5F, -1F);

		bodyModel[337].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 74 P&W weird light
		bodyModel[337].setRotationPoint(37.5F, -20.5F, -1F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 339 cull pw beacon holdy
		bodyModel[338].setRotationPoint(-23F, -22F, 7F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 cull pw beacon holdy
		bodyModel[339].setRotationPoint(-23F, -22F, -9F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon pw
		bodyModel[340].setRotationPoint(-23F, -23.75F, -8.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 342 commander beacon pw
		bodyModel[341].setRotationPoint(-23F, -23.75F, 7.5F);

		bodyModel[342].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[342].setRotationPoint(-25F, -23.25F, -4F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[343].setRotationPoint(-29F, -23.5F, -1F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[344].setRotationPoint(-29F, -23.5F, -1F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[345].setRotationPoint(-29F, -23.5F, -1F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[346].setRotationPoint(-29F, -23.5F, -1F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[347].setRotationPoint(-29F, -23F, -1F);

		bodyModel[348].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[348].setRotationPoint(-9F, -24F, -1F);

		bodyModel[349].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[349].setRotationPoint(-9F, -24F, 0.25F);

		bodyModel[350].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[350].setRotationPoint(-8F, -22F, -0.5F);

		bodyModel[351].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[351].setRotationPoint(-10F, -22.75F, -1.5F);

		bodyModel[352].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[352].setRotationPoint(-9.5F, -22.75F, 0.5F);

		bodyModel[353].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[353].setRotationPoint(-10.5F, -23F, -0.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[354].setRotationPoint(19.5F, -22F, -7F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[355].setRotationPoint(19.5F, -22F, 5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[356].setRotationPoint(19.5F, -22F, -5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 16, 0, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 494
		bodyModel[357].setRotationPoint(19.5F, -21.01F, -9F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 22, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F); // Box 494
		bodyModel[358].setRotationPoint(20.5F, -13F, 7.01F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 22, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F); // Box 494
		bodyModel[359].setRotationPoint(17.5F, -13F, 7.01F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 3, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 494
		bodyModel[360].setRotationPoint(29.5F, -10F, 7.01F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 5, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 494
		bodyModel[361].setRotationPoint(23.5F, -10F, 7.01F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 22, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F); // Box 494
		bodyModel[362].setRotationPoint(21.5F, -13F, -7.01F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 3, 22, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F); // Box 494
		bodyModel[363].setRotationPoint(17.5F, -13F, -7.01F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 5, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 494
		bodyModel[364].setRotationPoint(30.5F, -10F, -7.01F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 5, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 494
		bodyModel[365].setRotationPoint(24.5F, -10F, -7.01F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[366].setRotationPoint(-35.5F, 8F, -11F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[367].setRotationPoint(-35.5F, 5.5F, -10F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[368].setRotationPoint(-35.5F, 0.5F, -10F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[369].setRotationPoint(-35.5F, 3F, -10F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[370].setRotationPoint(-35.5F, 8F, 9F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[371].setRotationPoint(-35.5F, 5.5F, 9F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[372].setRotationPoint(-35.5F, 3F, 9F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[373].setRotationPoint(-35.5F, 0.5F, 9F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 0, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 311
		bodyModel[374].setRotationPoint(34.5F, 0F, -11F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 312
		bodyModel[375].setRotationPoint(32.5F, 0F, -11F);

		bodyModel[376].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 313
		bodyModel[376].setRotationPoint(33.5F, 0F, -11F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 0, 8, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[377].setRotationPoint(34.5F, 0F, 9F);

		bodyModel[378].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 382
		bodyModel[378].setRotationPoint(33.5F, 0F, 11F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 383
		bodyModel[379].setRotationPoint(32.5F, 0F, 11F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 13
		bodyModel[380].setRotationPoint(34.5F, 8F, -11F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 14
		bodyModel[381].setRotationPoint(34.5F, 5.5F, -10F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 374
		bodyModel[382].setRotationPoint(34.5F, 0.5F, -10F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 375
		bodyModel[383].setRotationPoint(34.5F, 3F, -10F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[384].setRotationPoint(34.5F, 8F, 9F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 385
		bodyModel[385].setRotationPoint(34.5F, 5.5F, 9F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 386
		bodyModel[386].setRotationPoint(34.5F, 3F, 9F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 387
		bodyModel[387].setRotationPoint(34.5F, 0.5F, 9F);

		bodyModel[388].addBox(0F, 0F, 0F, 0, 9, 2, 0F); // Box 308
		bodyModel[388].setRotationPoint(-35.5F, -1F, -11F);

		bodyModel[389].addBox(0F, 0F, 0F, 0, 9, 2, 0F); // Box 316
		bodyModel[389].setRotationPoint(-35.5F, -1F, 9F);

		bodyModel[390].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 373
		bodyModel[390].setRotationPoint(35.51F, 4F, -11F);

		bodyModel[391].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 377
		bodyModel[391].setRotationPoint(35.51F, 4F, 9F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 371
		bodyModel[392].setRotationPoint(35.51F, -8F, -10F);

		bodyModel[393].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 372
		bodyModel[393].setRotationPoint(35.51F, -3F, -11F);

		bodyModel[394].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 376
		bodyModel[394].setRotationPoint(35.51F, -3F, 10F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 378
		bodyModel[395].setRotationPoint(35.51F, -8F, 9F);

		bodyModel[396].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 373
		bodyModel[396].setRotationPoint(35.51F, -9F, -11F);

		bodyModel[397].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 377
		bodyModel[397].setRotationPoint(35.51F, -9F, 9F);

		bodyModel[398].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 278 CN Handrails
		bodyModel[398].setRotationPoint(35.51F, -8F, -10F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 278 CN Handrails
		bodyModel[399].setRotationPoint(35.51F, -4F, -10F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 278 CN Handrails
		bodyModel[400].setRotationPoint(35.51F, -4F, 9F);

		bodyModel[401].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 278 CN Handrails
		bodyModel[401].setRotationPoint(35.51F, -8F, 9F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[402].setRotationPoint(35.5F, 3.5F, -9F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[403].setRotationPoint(35.5F, 6F, -9F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[404].setRotationPoint(35.5F, 3.5F, 9F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[405].setRotationPoint(35.5F, 6F, 9F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[406].setRotationPoint(-41.5F, 5F, -10F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[407].setRotationPoint(-41.5F, 5F, 0F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[408].setRotationPoint(39.5F, 5F, -10F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[409].setRotationPoint(39.5F, 5F, 0F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[410].setRotationPoint(-8.5F, 1.75F, -9.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[411].setRotationPoint(-8.5F, 0.75F, -9.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[412].setRotationPoint(-8.25F, 2.25F, -9.25F);

		bodyModel[413].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[413].setRotationPoint(-8.5F, -0.25F, -10F);

		bodyModel[414].addBox(0F, 0F, 0F, 7, 3, 4, 0F); // Box 384 fncc engine oil sump
		bodyModel[414].setRotationPoint(-6F, -0.5F, -10F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[415].setRotationPoint(-40.5F, 0.5F, -4F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[416].setRotationPoint(-40.5F, 0.5F, 2F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[417].setRotationPoint(39.5F, 0.5F, -4F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[418].setRotationPoint(39.5F, 0.5F, 2F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[419].setRotationPoint(-41.51F, 6F, -8F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[420].setRotationPoint(-41.51F, 6F, 0F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[421].setRotationPoint(39.51F, 6F, 0F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[422].setRotationPoint(39.51F, 6F, -8F);
	}

	ModelTypeBnew theB = new ModelTypeBnew();
	ModelZWT theZ = new ModelZWT();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel ,entity ,f5);

		if (GetColor(entity) == 15464) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.025, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6|| GetColor(entity) == 8){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/zwt_fncc_silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.4, -0.025, 0);
			theZ.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.8, 0, 0);
			theZ.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/zwt_black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.4, -0.025, 0);
			theZ.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.8, 0, 0);
			theZ.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}