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

public class ModelM420B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelM420B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[330];

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
		bodyModel[7] = new ModelRendererTurbo(this, 25, 117, textureX, textureY); // Box 21
		bodyModel[8] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 26
		bodyModel[9] = new ModelRendererTurbo(this, 11, 11, textureX, textureY); // Box 27
		bodyModel[10] = new ModelRendererTurbo(this, 21, 111, textureX, textureY); // Box 28
		bodyModel[11] = new ModelRendererTurbo(this, 447, 117, textureX, textureY); // Box 48
		bodyModel[12] = new ModelRendererTurbo(this, 445, 124, textureX, textureY); // Box 49
		bodyModel[13] = new ModelRendererTurbo(this, 449, 130, textureX, textureY); // Box 50
		bodyModel[14] = new ModelRendererTurbo(this, 282, 83, textureX, textureY); // Box 52
		bodyModel[15] = new ModelRendererTurbo(this, 44, 137, textureX, textureY); // Box 132
		bodyModel[16] = new ModelRendererTurbo(this, 18, 137, textureX, textureY); // Box 133
		bodyModel[17] = new ModelRendererTurbo(this, 266, 82, textureX, textureY); // Box 141
		bodyModel[18] = new ModelRendererTurbo(this, 396, 34, textureX, textureY); // Box 117
		bodyModel[19] = new ModelRendererTurbo(this, 299, 75, textureX, textureY); // Box 206
		bodyModel[20] = new ModelRendererTurbo(this, 95, 137, textureX, textureY); // Box 455
		bodyModel[21] = new ModelRendererTurbo(this, 465, 76, textureX, textureY); // Box 471
		bodyModel[22] = new ModelRendererTurbo(this, 465, 95, textureX, textureY); // Box 472
		bodyModel[23] = new ModelRendererTurbo(this, 482, 97, textureX, textureY); // Box 473
		bodyModel[24] = new ModelRendererTurbo(this, 482, 78, textureX, textureY); // Box 474
		bodyModel[25] = new ModelRendererTurbo(this, 459, 34, textureX, textureY); // Box 490
		bodyModel[26] = new ModelRendererTurbo(this, 412, 5, textureX, textureY); // Box 493
		bodyModel[27] = new ModelRendererTurbo(this, 391, 15, textureX, textureY); // Box 494
		bodyModel[28] = new ModelRendererTurbo(this, 309, 35, textureX, textureY); // Box 496
		bodyModel[29] = new ModelRendererTurbo(this, 309, 19, textureX, textureY); // Box 497
		bodyModel[30] = new ModelRendererTurbo(this, 301, 23, textureX, textureY); // Box 498
		bodyModel[31] = new ModelRendererTurbo(this, 394, 28, textureX, textureY, "cull"); // Box 500 cull
		bodyModel[32] = new ModelRendererTurbo(this, 482, 9, textureX, textureY); // Box 502
		bodyModel[33] = new ModelRendererTurbo(this, 465, 10, textureX, textureY); // Box 503
		bodyModel[34] = new ModelRendererTurbo(this, 475, 19, textureX, textureY); // Box 504
		bodyModel[35] = new ModelRendererTurbo(this, 469, 3, textureX, textureY); // Box 155
		bodyModel[36] = new ModelRendererTurbo(this, 497, 10, textureX, textureY); // Box 156
		bodyModel[37] = new ModelRendererTurbo(this, 493, 3, textureX, textureY); // Box 157
		bodyModel[38] = new ModelRendererTurbo(this, 477, 22, textureX, textureY); // Box 158
		bodyModel[39] = new ModelRendererTurbo(this, 474, 25, textureX, textureY); // Box 159
		bodyModel[40] = new ModelRendererTurbo(this, 490, 25, textureX, textureY); // Box 160
		bodyModel[41] = new ModelRendererTurbo(this, 493, 22, textureX, textureY); // Box 161
		bodyModel[42] = new ModelRendererTurbo(this, 502, 23, textureX, textureY, "lamp"); // Box 162 rear headlight
		bodyModel[43] = new ModelRendererTurbo(this, 502, 23, textureX, textureY, "lamp"); // Box 163 rear headlight
		bodyModel[44] = new ModelRendererTurbo(this, 315, 107, textureX, textureY); // Box 201
		bodyModel[45] = new ModelRendererTurbo(this, 396, 156, textureX, textureY); // Box 202
		bodyModel[46] = new ModelRendererTurbo(this, 166, 107, textureX, textureY); // Box 224
		bodyModel[47] = new ModelRendererTurbo(this, 156, 96, textureX, textureY); // Box 225
		bodyModel[48] = new ModelRendererTurbo(this, 37, 99, textureX, textureY); // Box 226
		bodyModel[49] = new ModelRendererTurbo(this, 50, 104, textureX, textureY); // Box 228
		bodyModel[50] = new ModelRendererTurbo(this, 34, 104, textureX, textureY); // Box 229
		bodyModel[51] = new ModelRendererTurbo(this, 46, 100, textureX, textureY); // Box 230
		bodyModel[52] = new ModelRendererTurbo(this, 34, 100, textureX, textureY); // Box 231
		bodyModel[53] = new ModelRendererTurbo(this, 385, 21, textureX, textureY); // Box 236 smol stacc
		bodyModel[54] = new ModelRendererTurbo(this, 397, 118, textureX, textureY); // Box 237
		bodyModel[55] = new ModelRendererTurbo(this, 282, 101, textureX, textureY); // Box 245
		bodyModel[56] = new ModelRendererTurbo(this, 288, 101, textureX, textureY); // Box 246
		bodyModel[57] = new ModelRendererTurbo(this, 282, 75, textureX, textureY); // Box 247
		bodyModel[58] = new ModelRendererTurbo(this, 443, 77, textureX, textureY); // Box 248
		bodyModel[59] = new ModelRendererTurbo(this, 443, 102, textureX, textureY); // Box 250
		bodyModel[60] = new ModelRendererTurbo(this, 288, 75, textureX, textureY); // Box 557
		bodyModel[61] = new ModelRendererTurbo(this, 343, 107, textureX, textureY); // Box 561
		bodyModel[62] = new ModelRendererTurbo(this, 377, 107, textureX, textureY); // Box 562
		bodyModel[63] = new ModelRendererTurbo(this, 94, 66, textureX, textureY); // Box 563
		bodyModel[64] = new ModelRendererTurbo(this, 28, 107, textureX, textureY); // Box 61
		bodyModel[65] = new ModelRendererTurbo(this, 56, 107, textureX, textureY); // Box 682
		bodyModel[66] = new ModelRendererTurbo(this, 449, 110, textureX, textureY); // Box 684
		bodyModel[67] = new ModelRendererTurbo(this, 483, 110, textureX, textureY); // Box 685
		bodyModel[68] = new ModelRendererTurbo(this, 28, 100, textureX, textureY); // Box 708
		bodyModel[69] = new ModelRendererTurbo(this, 56, 100, textureX, textureY); // Box 709
		bodyModel[70] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 721
		bodyModel[71] = new ModelRendererTurbo(this, 167, 105, textureX, textureY); // Box 723
		bodyModel[72] = new ModelRendererTurbo(this, 155, 116, textureX, textureY); // Box 724
		bodyModel[73] = new ModelRendererTurbo(this, 93, 124, textureX, textureY); // Box 277
		bodyModel[74] = new ModelRendererTurbo(this, 105, 124, textureX, textureY); // Box 280
		bodyModel[75] = new ModelRendererTurbo(this, 91, 134, textureX, textureY); // Box 302
		bodyModel[76] = new ModelRendererTurbo(this, 92, 130, textureX, textureY); // Box 303
		bodyModel[77] = new ModelRendererTurbo(this, 92, 126, textureX, textureY); // Box 305
		bodyModel[78] = new ModelRendererTurbo(this, 93, 124, textureX, textureY); // Box 306
		bodyModel[79] = new ModelRendererTurbo(this, 92, 122, textureX, textureY); // Box 307
		bodyModel[80] = new ModelRendererTurbo(this, 255, 104, textureX, textureY); // Box 308
		bodyModel[81] = new ModelRendererTurbo(this, 104, 122, textureX, textureY); // Box 309
		bodyModel[82] = new ModelRendererTurbo(this, 105, 124, textureX, textureY); // Box 310
		bodyModel[83] = new ModelRendererTurbo(this, 104, 126, textureX, textureY); // Box 311
		bodyModel[84] = new ModelRendererTurbo(this, 104, 130, textureX, textureY); // Box 313
		bodyModel[85] = new ModelRendererTurbo(this, 103, 134, textureX, textureY); // Box 315
		bodyModel[86] = new ModelRendererTurbo(this, 255, 94, textureX, textureY); // Box 316
		bodyModel[87] = new ModelRendererTurbo(this, 288, 101, textureX, textureY); // Box 317
		bodyModel[88] = new ModelRendererTurbo(this, 288, 75, textureX, textureY); // Box 319
		bodyModel[89] = new ModelRendererTurbo(this, 464, 82, textureX, textureY); // Box 325
		bodyModel[90] = new ModelRendererTurbo(this, 342, 128, textureX, textureY); // Box 2
		bodyModel[91] = new ModelRendererTurbo(this, 354, 158, textureX, textureY); // Box 10
		bodyModel[92] = new ModelRendererTurbo(this, 362, 151, textureX, textureY); // Box 157
		bodyModel[93] = new ModelRendererTurbo(this, 362, 121, textureX, textureY); // Box 158
		bodyModel[94] = new ModelRendererTurbo(this, 353, 114, textureX, textureY); // Box 159
		bodyModel[95] = new ModelRendererTurbo(this, 379, 114, textureX, textureY); // Box 303
		bodyModel[96] = new ModelRendererTurbo(this, 371, 111, textureX, textureY); // Box 304
		bodyModel[97] = new ModelRendererTurbo(this, 372, 162, textureX, textureY); // Box 305
		bodyModel[98] = new ModelRendererTurbo(this, 378, 158, textureX, textureY); // Box 306
		bodyModel[99] = new ModelRendererTurbo(this, 112, 139, textureX, textureY); // Box 307
		bodyModel[100] = new ModelRendererTurbo(this, 82, 139, textureX, textureY); // Box 308
		bodyModel[101] = new ModelRendererTurbo(this, 264, 95, textureX, textureY); // Box 309
		bodyModel[102] = new ModelRendererTurbo(this, 263, 76, textureX, textureY); // Box 310
		bodyModel[103] = new ModelRendererTurbo(this, 50, 100, textureX, textureY); // Box 362
		bodyModel[104] = new ModelRendererTurbo(this, 53, 100, textureX, textureY); // Box 363
		bodyModel[105] = new ModelRendererTurbo(this, 31, 100, textureX, textureY); // Box 364
		bodyModel[106] = new ModelRendererTurbo(this, 34, 100, textureX, textureY); // Box 365
		bodyModel[107] = new ModelRendererTurbo(this, 74, 111, textureX, textureY); // Box 372
		bodyModel[108] = new ModelRendererTurbo(this, 72, 118, textureX, textureY); // Box 373
		bodyModel[109] = new ModelRendererTurbo(this, 92, 122, textureX, textureY); // Box 374
		bodyModel[110] = new ModelRendererTurbo(this, 92, 126, textureX, textureY); // Box 375
		bodyModel[111] = new ModelRendererTurbo(this, 10, 112, textureX, textureY); // Box 376
		bodyModel[112] = new ModelRendererTurbo(this, 10, 119, textureX, textureY); // Box 377
		bodyModel[113] = new ModelRendererTurbo(this, 103, 134, textureX, textureY); // Box 384
		bodyModel[114] = new ModelRendererTurbo(this, 104, 130, textureX, textureY); // Box 385
		bodyModel[115] = new ModelRendererTurbo(this, 104, 126, textureX, textureY); // Box 386
		bodyModel[116] = new ModelRendererTurbo(this, 104, 122, textureX, textureY); // Box 387
		bodyModel[117] = new ModelRendererTurbo(this, 339, 158, textureX, textureY); // Box 261
		bodyModel[118] = new ModelRendererTurbo(this, 347, 151, textureX, textureY); // Box 262
		bodyModel[119] = new ModelRendererTurbo(this, 317, 121, textureX, textureY); // Box 263
		bodyModel[120] = new ModelRendererTurbo(this, 347, 121, textureX, textureY); // Box 264
		bodyModel[121] = new ModelRendererTurbo(this, 338, 114, textureX, textureY); // Box 265
		bodyModel[122] = new ModelRendererTurbo(this, 397, 21, textureX, textureY); // Box 266 big stacc
		bodyModel[123] = new ModelRendererTurbo(this, 349, 15, textureX, textureY); // Box 267
		bodyModel[124] = new ModelRendererTurbo(this, 458, 35, textureX, textureY); // Box 356
		bodyModel[125] = new ModelRendererTurbo(this, 436, 50, textureX, textureY); // Box 272
		bodyModel[126] = new ModelRendererTurbo(this, 421, 26, textureX, textureY); // Box 273
		bodyModel[127] = new ModelRendererTurbo(this, 459, 39, textureX, textureY); // Box 274
		bodyModel[128] = new ModelRendererTurbo(this, 459, 30, textureX, textureY); // Box 275
		bodyModel[129] = new ModelRendererTurbo(this, 482, 2, textureX, textureY); // Box 276
		bodyModel[130] = new ModelRendererTurbo(this, 417, 133, textureX, textureY); // Box 292
		bodyModel[131] = new ModelRendererTurbo(this, 404, 133, textureX, textureY); // Box 293
		bodyModel[132] = new ModelRendererTurbo(this, 434, 133, textureX, textureY); // Box 294
		bodyModel[133] = new ModelRendererTurbo(this, 461, 104, textureX, textureY); // Box 295
		bodyModel[134] = new ModelRendererTurbo(this, 474, 109, textureX, textureY); // Box 296
		bodyModel[135] = new ModelRendererTurbo(this, 470, 105, textureX, textureY); // Box 297
		bodyModel[136] = new ModelRendererTurbo(this, 458, 105, textureX, textureY); // Box 298
		bodyModel[137] = new ModelRendererTurbo(this, 458, 109, textureX, textureY); // Box 299
		bodyModel[138] = new ModelRendererTurbo(this, 455, 107, textureX, textureY); // Box 300
		bodyModel[139] = new ModelRendererTurbo(this, 455, 109, textureX, textureY); // Box 301
		bodyModel[140] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 302
		bodyModel[141] = new ModelRendererTurbo(this, 477, 111, textureX, textureY); // Box 303
		bodyModel[142] = new ModelRendererTurbo(this, 477, 109, textureX, textureY); // Box 304
		bodyModel[143] = new ModelRendererTurbo(this, 477, 107, textureX, textureY); // Box 305
		bodyModel[144] = new ModelRendererTurbo(this, 115, 95, textureX, textureY); // Box 412 cs1
		bodyModel[145] = new ModelRendererTurbo(this, 96, 96, textureX, textureY); // Box 413 cs1
		bodyModel[146] = new ModelRendererTurbo(this, 89, 87, textureX, textureY); // Box 86 cs1
		bodyModel[147] = new ModelRendererTurbo(this, 120, 89, textureX, textureY); // Box 476 cs1 radio
		bodyModel[148] = new ModelRendererTurbo(this, 502, 30, textureX, textureY); // Box 504
		bodyModel[149] = new ModelRendererTurbo(this, 488, 47, textureX, textureY); // Box 490
		bodyModel[150] = new ModelRendererTurbo(this, 436, 50, textureX, textureY); // Box 490
		bodyModel[151] = new ModelRendererTurbo(this, 507, 34, textureX, textureY); // Box 504
		bodyModel[152] = new ModelRendererTurbo(this, 507, 30, textureX, textureY); // Box 504
		bodyModel[153] = new ModelRendererTurbo(this, 502, 36, textureX, textureY); // Box 504
		bodyModel[154] = new ModelRendererTurbo(this, 273, 111, textureX, textureY); // Box 557 type B shit
		bodyModel[155] = new ModelRendererTurbo(this, 407, 111, textureX, textureY); // Box 557 type B shit
		bodyModel[156] = new ModelRendererTurbo(this, 180, 22, textureX, textureY); // Box 114
		bodyModel[157] = new ModelRendererTurbo(this, 180, 19, textureX, textureY); // Box 74
		bodyModel[158] = new ModelRendererTurbo(this, 180, 25, textureX, textureY); // Box 78
		bodyModel[159] = new ModelRendererTurbo(this, 177, 13, textureX, textureY, "cull"); // Box 481 cull
		bodyModel[160] = new ModelRendererTurbo(this, 282, 172, textureX, textureY); // Box 63
		bodyModel[161] = new ModelRendererTurbo(this, 282, 172, textureX, textureY); // Box 370
		bodyModel[162] = new ModelRendererTurbo(this, 265, 172, textureX, textureY); // Box 372
		bodyModel[163] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 520
		bodyModel[164] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 521
		bodyModel[165] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 522
		bodyModel[166] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 523
		bodyModel[167] = new ModelRendererTurbo(this, 278, 172, textureX, textureY); // Box 524
		bodyModel[168] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 525
		bodyModel[169] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 526
		bodyModel[170] = new ModelRendererTurbo(this, 278, 172, textureX, textureY); // Box 528
		bodyModel[171] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 529
		bodyModel[172] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 530
		bodyModel[173] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 531
		bodyModel[174] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 532
		bodyModel[175] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 533
		bodyModel[176] = new ModelRendererTurbo(this, 286, 157, textureX, textureY); // Box 534
		bodyModel[177] = new ModelRendererTurbo(this, 325, 172, textureX, textureY); // Box 527
		bodyModel[178] = new ModelRendererTurbo(this, 344, 175, textureX, textureY); // Box 535
		bodyModel[179] = new ModelRendererTurbo(this, 344, 175, textureX, textureY); // Box 536
		bodyModel[180] = new ModelRendererTurbo(this, 260, 155, textureX, textureY); // Box 331 support your local B
		bodyModel[181] = new ModelRendererTurbo(this, 260, 155, textureX, textureY); // Box 331 support your local B
		bodyModel[182] = new ModelRendererTurbo(this, 260, 155, textureX, textureY); // Box 331 support your local B
		bodyModel[183] = new ModelRendererTurbo(this, 260, 155, textureX, textureY); // Box 331 support your local B
		bodyModel[184] = new ModelRendererTurbo(this, 344, 175, textureX, textureY); // Box 335
		bodyModel[185] = new ModelRendererTurbo(this, 315, 107, textureX, textureY); // Box 336
		bodyModel[186] = new ModelRendererTurbo(this, 344, 175, textureX, textureY); // Box 337
		bodyModel[187] = new ModelRendererTurbo(this, 325, 172, textureX, textureY); // Box 338
		bodyModel[188] = new ModelRendererTurbo(this, 273, 114, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[189] = new ModelRendererTurbo(this, 446, 32, textureX, textureY); // Box 355 brakewheel
		bodyModel[190] = new ModelRendererTurbo(this, 278, 123, textureX, textureY); // Box 246 B MOUNT
		bodyModel[191] = new ModelRendererTurbo(this, 265, 127, textureX, textureY); // Box 62 B MOUNT
		bodyModel[192] = new ModelRendererTurbo(this, 278, 123, textureX, textureY); // Box 67 B MOUNT
		bodyModel[193] = new ModelRendererTurbo(this, 265, 127, textureX, textureY); // Box 68 B MOUNT
		bodyModel[194] = new ModelRendererTurbo(this, 278, 123, textureX, textureY); // Box 246 B MOUNT
		bodyModel[195] = new ModelRendererTurbo(this, 265, 127, textureX, textureY); // Box 62 B MOUNT
		bodyModel[196] = new ModelRendererTurbo(this, 278, 123, textureX, textureY); // Box 67 B MOUNT
		bodyModel[197] = new ModelRendererTurbo(this, 265, 127, textureX, textureY); // Box 68 B MOUNT
		bodyModel[198] = new ModelRendererTurbo(this, 316, 13, textureX, textureY); // Box 496
		bodyModel[199] = new ModelRendererTurbo(this, 338, 13, textureX, textureY); // Box 497
		bodyModel[200] = new ModelRendererTurbo(this, 319, 7, textureX, textureY); // Box 498
		bodyModel[201] = new ModelRendererTurbo(this, 254, 42, textureX, textureY); // Box 494
		bodyModel[202] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 494
		bodyModel[203] = new ModelRendererTurbo(this, 491, 104, textureX, textureY); // Box 494
		bodyModel[204] = new ModelRendererTurbo(this, 494, 87, textureX, textureY); // Box 494
		bodyModel[205] = new ModelRendererTurbo(this, 501, 98, textureX, textureY); // Box 494
		bodyModel[206] = new ModelRendererTurbo(this, 496, 104, textureX, textureY); // Box 494
		bodyModel[207] = new ModelRendererTurbo(this, 494, 64, textureX, textureY); // Box 494
		bodyModel[208] = new ModelRendererTurbo(this, 501, 81, textureX, textureY); // Box 494
		bodyModel[209] = new ModelRendererTurbo(this, 501, 64, textureX, textureY); // Box 494
		bodyModel[210] = new ModelRendererTurbo(this, 255, 104, textureX, textureY); // Box 308
		bodyModel[211] = new ModelRendererTurbo(this, 255, 94, textureX, textureY); // Box 316
		bodyModel[212] = new ModelRendererTurbo(this, 255, 114, textureX, textureY); // Box 373
		bodyModel[213] = new ModelRendererTurbo(this, 255, 92, textureX, textureY); // Box 377
		bodyModel[214] = new ModelRendererTurbo(this, 249, 115, textureX, textureY); // Box 371
		bodyModel[215] = new ModelRendererTurbo(this, 252, 115, textureX, textureY); // Box 372
		bodyModel[216] = new ModelRendererTurbo(this, 252, 87, textureX, textureY); // Box 376
		bodyModel[217] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 378
		bodyModel[218] = new ModelRendererTurbo(this, 244, 114, textureX, textureY); // Box 373
		bodyModel[219] = new ModelRendererTurbo(this, 244, 92, textureX, textureY); // Box 377
		bodyModel[220] = new ModelRendererTurbo(this, 183, 36, textureX, textureY); // Box 502
		bodyModel[221] = new ModelRendererTurbo(this, 168, 36, textureX, textureY); // Box 503
		bodyModel[222] = new ModelRendererTurbo(this, 176, 46, textureX, textureY); // Box 504
		bodyModel[223] = new ModelRendererTurbo(this, 171, 32, textureX, textureY); // Box 155
		bodyModel[224] = new ModelRendererTurbo(this, 196, 36, textureX, textureY); // Box 156
		bodyModel[225] = new ModelRendererTurbo(this, 201, 32, textureX, textureY); // Box 157
		bodyModel[226] = new ModelRendererTurbo(this, 172, 53, textureX, textureY); // Box 158
		bodyModel[227] = new ModelRendererTurbo(this, 175, 52, textureX, textureY); // Box 159
		bodyModel[228] = new ModelRendererTurbo(this, 191, 52, textureX, textureY); // Box 160
		bodyModel[229] = new ModelRendererTurbo(this, 200, 53, textureX, textureY); // Box 161
		bodyModel[230] = new ModelRendererTurbo(this, 186, 25, textureX, textureY, "lamp"); // Box 162 rear headlight
		bodyModel[231] = new ModelRendererTurbo(this, 186, 25, textureX, textureY, "lamp"); // Box 163 rear headlight
		bodyModel[232] = new ModelRendererTurbo(this, 183, 30, textureX, textureY); // Box 276
		bodyModel[233] = new ModelRendererTurbo(this, 234, 39, textureX, textureY); // Box 2
		bodyModel[234] = new ModelRendererTurbo(this, 203, 44, textureX, textureY); // Box 504
		bodyModel[235] = new ModelRendererTurbo(this, 171, 57, textureX, textureY); // Box 504
		bodyModel[236] = new ModelRendererTurbo(this, 270, 35, textureX, textureY); // Box 496
		bodyModel[237] = new ModelRendererTurbo(this, 270, 19, textureX, textureY); // Box 497
		bodyModel[238] = new ModelRendererTurbo(this, 246, 23, textureX, textureY); // Box 498
		bodyModel[239] = new ModelRendererTurbo(this, 85, 41, textureX, textureY); // Box 95
		bodyModel[240] = new ModelRendererTurbo(this, 249, 115, textureX, textureY); // Box 371
		bodyModel[241] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 378
		bodyModel[242] = new ModelRendererTurbo(this, 244, 114, textureX, textureY); // Box 373
		bodyModel[243] = new ModelRendererTurbo(this, 244, 92, textureX, textureY); // Box 377
		bodyModel[244] = new ModelRendererTurbo(this, 155, 107, textureX, textureY); // Box 224
		bodyModel[245] = new ModelRendererTurbo(this, 145, 96, textureX, textureY); // Box 225
		bodyModel[246] = new ModelRendererTurbo(this, 160, 105, textureX, textureY); // Box 723
		bodyModel[247] = new ModelRendererTurbo(this, 168, 94, textureX, textureY); // Box 723
		bodyModel[248] = new ModelRendererTurbo(this, 168, 92, textureX, textureY); // Box 723
		bodyModel[249] = new ModelRendererTurbo(this, 66, 48, textureX, textureY); // Box 2
		bodyModel[250] = new ModelRendererTurbo(this, 57, 48, textureX, textureY); // Box 2 Door
		bodyModel[251] = new ModelRendererTurbo(this, 50, 48, textureX, textureY); // Box 2
		bodyModel[252] = new ModelRendererTurbo(this, 53, 31, textureX, textureY); // Box 2 Door
		bodyModel[253] = new ModelRendererTurbo(this, 62, 31, textureX, textureY); // Box 2
		bodyModel[254] = new ModelRendererTurbo(this, 199, 16, textureX, textureY); // Box 330
		bodyModel[255] = new ModelRendererTurbo(this, 192, 16, textureX, textureY); // Box 327
		bodyModel[256] = new ModelRendererTurbo(this, 176, 29, textureX, textureY); // Box 157
		bodyModel[257] = new ModelRendererTurbo(this, 192, 29, textureX, textureY); // Box 157
		bodyModel[258] = new ModelRendererTurbo(this, 81, 66, textureX, textureY, "cull"); // Box 563 Step Cull
		bodyModel[259] = new ModelRendererTurbo(this, 135, 66, textureX, textureY, "cull"); // Box 563 Step Cull
		bodyModel[260] = new ModelRendererTurbo(this, 89, 51, textureX, textureY, "cull"); // Box 563 Step Cull
		bodyModel[261] = new ModelRendererTurbo(this, 126, 51, textureX, textureY, "cull"); // Box 563 Step Cull
		bodyModel[262] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 2 Door
		bodyModel[263] = new ModelRendererTurbo(this, 53, 29, textureX, textureY); // Box 2 Door
		bodyModel[264] = new ModelRendererTurbo(this, 65, 120, textureX, textureY); // Box 66
		bodyModel[265] = new ModelRendererTurbo(this, 15, 120, textureX, textureY); // Box 67
		bodyModel[266] = new ModelRendererTurbo(this, 66, 122, textureX, textureY); // Box 311
		bodyModel[267] = new ModelRendererTurbo(this, 74, 124, textureX, textureY); // Box 312
		bodyModel[268] = new ModelRendererTurbo(this, 71, 124, textureX, textureY); // Box 313
		bodyModel[269] = new ModelRendererTurbo(this, 16, 122, textureX, textureY); // Box 381
		bodyModel[270] = new ModelRendererTurbo(this, 13, 124, textureX, textureY); // Box 382
		bodyModel[271] = new ModelRendererTurbo(this, 10, 124, textureX, textureY); // Box 383
		bodyModel[272] = new ModelRendererTurbo(this, 88, 134, textureX, textureY); // Box 13
		bodyModel[273] = new ModelRendererTurbo(this, 89, 130, textureX, textureY); // Box 14
		bodyModel[274] = new ModelRendererTurbo(this, 89, 122, textureX, textureY); // Box 374
		bodyModel[275] = new ModelRendererTurbo(this, 89, 126, textureX, textureY); // Box 375
		bodyModel[276] = new ModelRendererTurbo(this, 112, 134, textureX, textureY); // Box 384
		bodyModel[277] = new ModelRendererTurbo(this, 113, 130, textureX, textureY); // Box 385
		bodyModel[278] = new ModelRendererTurbo(this, 113, 126, textureX, textureY); // Box 386
		bodyModel[279] = new ModelRendererTurbo(this, 113, 122, textureX, textureY); // Box 387
		bodyModel[280] = new ModelRendererTurbo(this, 66, 122, textureX, textureY); // Box 311
		bodyModel[281] = new ModelRendererTurbo(this, 74, 124, textureX, textureY); // Box 312
		bodyModel[282] = new ModelRendererTurbo(this, 71, 124, textureX, textureY); // Box 313
		bodyModel[283] = new ModelRendererTurbo(this, 88, 134, textureX, textureY); // Box 13
		bodyModel[284] = new ModelRendererTurbo(this, 89, 130, textureX, textureY); // Box 14
		bodyModel[285] = new ModelRendererTurbo(this, 89, 122, textureX, textureY); // Box 374
		bodyModel[286] = new ModelRendererTurbo(this, 89, 126, textureX, textureY); // Box 375
		bodyModel[287] = new ModelRendererTurbo(this, 112, 134, textureX, textureY); // Box 384
		bodyModel[288] = new ModelRendererTurbo(this, 113, 130, textureX, textureY); // Box 385
		bodyModel[289] = new ModelRendererTurbo(this, 113, 126, textureX, textureY); // Box 386
		bodyModel[290] = new ModelRendererTurbo(this, 113, 122, textureX, textureY); // Box 387
		bodyModel[291] = new ModelRendererTurbo(this, 16, 122, textureX, textureY); // Box 381
		bodyModel[292] = new ModelRendererTurbo(this, 13, 124, textureX, textureY); // Box 382
		bodyModel[293] = new ModelRendererTurbo(this, 10, 124, textureX, textureY); // Box 383
		bodyModel[294] = new ModelRendererTurbo(this, 468, 150, textureX, textureY); // Box 132
		bodyModel[295] = new ModelRendererTurbo(this, 442, 150, textureX, textureY); // Box 133
		bodyModel[296] = new ModelRendererTurbo(this, 93, 127, textureX, textureY); // Box 18
		bodyModel[297] = new ModelRendererTurbo(this, 93, 131, textureX, textureY); // Box 20
		bodyModel[298] = new ModelRendererTurbo(this, 105, 127, textureX, textureY); // Box 85
		bodyModel[299] = new ModelRendererTurbo(this, 105, 131, textureX, textureY); // Box 87
		bodyModel[300] = new ModelRendererTurbo(this, 93, 127, textureX, textureY); // Box 18
		bodyModel[301] = new ModelRendererTurbo(this, 93, 131, textureX, textureY); // Box 20
		bodyModel[302] = new ModelRendererTurbo(this, 105, 127, textureX, textureY); // Box 85
		bodyModel[303] = new ModelRendererTurbo(this, 105, 131, textureX, textureY); // Box 87
		bodyModel[304] = new ModelRendererTurbo(this, 461, 0, textureX, textureY, "lamp"); // Box 117 liveryimg 2
		bodyModel[305] = new ModelRendererTurbo(this, 461, 0, textureX, textureY, "lamp"); // Box 298 liveryimg 2
		bodyModel[306] = new ModelRendererTurbo(this, 461, 8, textureX, textureY, "lamp"); // Box 298 rear morker lights
		bodyModel[307] = new ModelRendererTurbo(this, 503, 3, textureX, textureY, "lamp"); // Box 298 rear morker lights
		bodyModel[308] = new ModelRendererTurbo(this, 206, 33, textureX, textureY, "lamp"); // Box 117 liveryimg 2
		bodyModel[309] = new ModelRendererTurbo(this, 206, 33, textureX, textureY, "lamp"); // Box 298 liveryimg 2
		bodyModel[310] = new ModelRendererTurbo(this, 208, 28, textureX, textureY, "lamp"); // Box 298 rear morker lights
		bodyModel[311] = new ModelRendererTurbo(this, 214, 33, textureX, textureY, "lamp"); // Box 298 rear morker lights
		bodyModel[312] = new ModelRendererTurbo(this, 222, 21, textureX, textureY); // Box 327
		bodyModel[313] = new ModelRendererTurbo(this, 224, 18, textureX, textureY); // Box 328
		bodyModel[314] = new ModelRendererTurbo(this, 224, 24, textureX, textureY); // Box 329
		bodyModel[315] = new ModelRendererTurbo(this, 233, 21, textureX, textureY); // Box 330
		bodyModel[316] = new ModelRendererTurbo(this, 161, 20, textureX, textureY); // Box 439
		bodyModel[317] = new ModelRendererTurbo(this, 43, 139, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[318] = new ModelRendererTurbo(this, 36, 139, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[319] = new ModelRendererTurbo(this, 477, 130, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[320] = new ModelRendererTurbo(this, 484, 130, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[321] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[322] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[323] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[324] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[325] = new ModelRendererTurbo(this, 226, 12, textureX, textureY); // Box 364 prime base
		bodyModel[326] = new ModelRendererTurbo(this, 46, 153, textureX, textureY); // Box 132
		bodyModel[327] = new ModelRendererTurbo(this, 20, 153, textureX, textureY); // Box 133
		bodyModel[328] = new ModelRendererTurbo(this, 444, 166, textureX, textureY); // Box 328
		bodyModel[329] = new ModelRendererTurbo(this, 470, 166, textureX, textureY); // Box 329

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

		bodyModel[7].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 21
		bodyModel[7].setRotationPoint(-39.5F, 8F, -9F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 26
		bodyModel[8].setRotationPoint(40.5F, 3F, -1.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[9].setRotationPoint(39.5F, 2.5F, -2F);

		bodyModel[10].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 28
		bodyModel[10].setRotationPoint(-39.51F, 7F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 48
		bodyModel[11].setRotationPoint(39.51F, -1F, -10F);

		bodyModel[12].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 49
		bodyModel[12].setRotationPoint(39.49F, 7F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 50
		bodyModel[13].setRotationPoint(39.5F, 8F, -9F);

		bodyModel[14].addBox(0F, 0F, 0F, 79, 4, 12, 0F); // Box 52
		bodyModel[14].setRotationPoint(-39.5F, -1F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[15].setRotationPoint(-41.5F, 5F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[16].setRotationPoint(-41.5F, 5F, 0F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 141
		bodyModel[17].setRotationPoint(-39.5F, 3F, -3F);

		bodyModel[18].addBox(0F, 0F, 0F, 16, 3, 2, 0F); // Box 117
		bodyModel[18].setRotationPoint(19.5F, -21F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 69, 1, 5, 0F); // Box 206
		bodyModel[19].setRotationPoint(-34.5F, -1F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 455
		bodyModel[20].setRotationPoint(-41.5F, -1F, -3F);

		bodyModel[21].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 471
		bodyModel[21].setRotationPoint(34.5F, -1F, 6F);

		bodyModel[22].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 472
		bodyModel[22].setRotationPoint(34.5F, -1F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[23].setRotationPoint(34.5F, -1F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[24].setRotationPoint(34.5F, -1F, 9F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 15, 13, 0F); // Box 490
		bodyModel[25].setRotationPoint(35.5F, -16F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 16, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 493
		bodyModel[26].setRotationPoint(19.5F, -18F, -8F);

		bodyModel[27].addBox(0F, 0F, 0F, 16, 3, 2, 0F); // Box 494
		bodyModel[27].setRotationPoint(19.5F, -21F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[28].setRotationPoint(-16.5F, -22F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[29].setRotationPoint(-16.5F, -22F, 5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 36, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[30].setRotationPoint(-16.5F, -22F, -5F);

		bodyModel[31].addBox(0F, 0F, 0F, 16, 1, 4, 0F); // Box 500 cull
		bodyModel[31].setRotationPoint(19.5F, -22F, -2F);

		bodyModel[32].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 502
		bodyModel[32].setRotationPoint(35.5F, -21F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[33].setRotationPoint(35.5F, -21F, 2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 15, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[34].setRotationPoint(36.5F, -16F, -6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[35].setRotationPoint(35.5F, -22F, 2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[36].setRotationPoint(35.5F, -21F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[37].setRotationPoint(35.5F, -22F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[38].setRotationPoint(35.5F, -17F, 6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 159
		bodyModel[39].setRotationPoint(35.5F, -17F, 2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 160
		bodyModel[40].setRotationPoint(35.5F, -17F, -6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 161
		bodyModel[41].setRotationPoint(35.5F, -17F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 162 rear headlight
		bodyModel[42].setRotationPoint(37F, -20F, 0F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 163 rear headlight
		bodyModel[43].setRotationPoint(37F, -20F, -2F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 201
		bodyModel[44].setRotationPoint(-24.5F, 3.1F, -2F);

		bodyModel[45].addBox(0F, 0F, -3F, 1, 1, 3, 0F); // Box 202
		bodyModel[45].setRotationPoint(1.5F, 3.75F, -7F);
		bodyModel[45].rotateAngleX = -0.43633231F;

		bodyModel[46].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 224
		bodyModel[46].setRotationPoint(-8.5F, -9F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 49, 8, 0, 0F); // Box 225
		bodyModel[47].setRotationPoint(-13.5F, -9F, 11F);

		bodyModel[48].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 226
		bodyModel[48].setRotationPoint(-41.5F, -9F, -3F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 228
		bodyModel[49].setRotationPoint(-40.5F, -9F, -7F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 229
		bodyModel[50].setRotationPoint(-40.5F, -9F, 6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 230
		bodyModel[51].setRotationPoint(-40.5F, -9F, -6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[52].setRotationPoint(-40.5F, -9F, 3F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 236 smol stacc
		bodyModel[53].setRotationPoint(11F, -22.5F, -1.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 237
		bodyModel[54].setRotationPoint(1.5F, 3.75F, 7F);
		bodyModel[54].rotateAngleX = 0.43633231F;

		bodyModel[55].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 245
		bodyModel[55].setRotationPoint(-24F, 0F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 246
		bodyModel[56].setRotationPoint(-23.5F, 0F, -10F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 247
		bodyModel[57].setRotationPoint(-24F, 0F, 10F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 248
		bodyModel[58].setRotationPoint(21F, 0F, 10F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 250
		bodyModel[59].setRotationPoint(21F, 0F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 557
		bodyModel[60].setRotationPoint(-23.5F, 0F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 561
		bodyModel[61].setRotationPoint(-11F, 0F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 562
		bodyModel[62].setRotationPoint(3F, 0F, 7F);

		bodyModel[63].addBox(0F, 0F, 0F, 16, 3, 4, 0F); // Box 563
		bodyModel[63].setRotationPoint(-27.5F, -4F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[64].setRotationPoint(-39.5F, -3F, 10F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 682
		bodyModel[65].setRotationPoint(-39.5F, -3F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 684
		bodyModel[66].setRotationPoint(39.5F, -3F, 10F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 685
		bodyModel[67].setRotationPoint(39.5F, -3F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 708
		bodyModel[68].setRotationPoint(-39.5F, -9F, 8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,1F, 0F, -1F, -1F, 0F, -1F, -1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 709
		bodyModel[69].setRotationPoint(-39.5F, -9F, -9F);

		bodyModel[70].addBox(0F, 0F, 0F, 11, 6, 0, 0F); // Box 721
		bodyModel[70].setRotationPoint(-27.5F, -12F, 11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.25F, 0F, 0F); // Box 723
		bodyModel[71].setRotationPoint(-11.5F, -12F, -11.01F);

		bodyModel[72].addBox(0F, 0F, 0F, 16, 8, 0, 0F); // Box 724
		bodyModel[72].setRotationPoint(-27.5F, -12F, -11F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 277
		bodyModel[73].setRotationPoint(-39.5F, 2F, -9F);

		bodyModel[74].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 280
		bodyModel[74].setRotationPoint(-39.5F, 2F, 9F);

		bodyModel[75].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 302
		bodyModel[75].setRotationPoint(35.5F, 8F, -11F);

		bodyModel[76].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 303
		bodyModel[76].setRotationPoint(35.5F, 5.5F, -10F);

		bodyModel[77].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 305
		bodyModel[77].setRotationPoint(35.5F, 3F, -10F);

		bodyModel[78].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 306
		bodyModel[78].setRotationPoint(35.5F, 2F, -9F);

		bodyModel[79].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 307
		bodyModel[79].setRotationPoint(35.5F, 0.5F, -10F);

		bodyModel[80].addBox(0F, 0F, 0F, 0, 9, 2, 0F); // Box 308
		bodyModel[80].setRotationPoint(35.5F, -1F, -11F);

		bodyModel[81].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 309
		bodyModel[81].setRotationPoint(35.5F, 0.5F, 9F);

		bodyModel[82].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 310
		bodyModel[82].setRotationPoint(35.5F, 2F, 9F);

		bodyModel[83].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 311
		bodyModel[83].setRotationPoint(35.5F, 3F, 9F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 313
		bodyModel[84].setRotationPoint(35.5F, 5.5F, 9F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 315
		bodyModel[85].setRotationPoint(35.5F, 8F, 9F);

		bodyModel[86].addBox(0F, 0F, 0F, 0, 9, 2, 0F); // Box 316
		bodyModel[86].setRotationPoint(35.5F, -1F, 9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 317
		bodyModel[87].setRotationPoint(21.5F, 0F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 319
		bodyModel[88].setRotationPoint(21.5F, 0F, 7F);

		bodyModel[89].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 325
		bodyModel[89].setRotationPoint(37.5F, 3F, -3F);

		bodyModel[90].addBox(0F, 0F, 0F, 15, 6, 16, 0F); // Box 2
		bodyModel[90].setRotationPoint(-5.5F, 3.25F, -8F);

		bodyModel[91].addBox(0F, 0F, 0F, 7, 3, 3, 0F); // Box 10
		bodyModel[91].setRotationPoint(-5.5F, 3.25F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[92].setRotationPoint(-5.5F, 6.25F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 158
		bodyModel[93].setRotationPoint(-5.5F, 6.25F, 8F);

		bodyModel[94].addBox(0F, 0F, 0F, 7, 3, 3, 0F); // Box 159
		bodyModel[94].setRotationPoint(-5.5F, 3.25F, 8F);

		bodyModel[95].addBox(0F, 0F, 0F, 7, 3, 3, 0F); // Box 303
		bodyModel[95].setRotationPoint(2.5F, 3.25F, 8F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 304
		bodyModel[96].setRotationPoint(1.5F, 4.25F, 8F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 305
		bodyModel[97].setRotationPoint(1.5F, 4.25F, -11F);

		bodyModel[98].addBox(0F, 0F, 0F, 7, 3, 3, 0F); // Box 306
		bodyModel[98].setRotationPoint(2.5F, 3.25F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 307
		bodyModel[99].setRotationPoint(-41.5F, -1F, -7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F); // Box 308
		bodyModel[100].setRotationPoint(-41.5F, -1F, 3F);

		bodyModel[101].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 309
		bodyModel[101].setRotationPoint(-39.5F, -1F, -9F);

		bodyModel[102].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 310
		bodyModel[102].setRotationPoint(-39.5F, -1F, 6F);

		bodyModel[103].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 362
		bodyModel[103].setRotationPoint(-40.5F, -9F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[104].setRotationPoint(-40.5F, -8F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[105].setRotationPoint(-40.5F, -8F, 7F);

		bodyModel[106].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 365
		bodyModel[106].setRotationPoint(-40.5F, -9F, 7F);

		bodyModel[107].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 372
		bodyModel[107].setRotationPoint(-35.51F, -3F, -11F);

		bodyModel[108].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 373
		bodyModel[108].setRotationPoint(-35.51F, 4F, -11F);

		bodyModel[109].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 374
		bodyModel[109].setRotationPoint(-39.5F, 0.5F, -10F);

		bodyModel[110].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 375
		bodyModel[110].setRotationPoint(-39.5F, 3F, -10F);

		bodyModel[111].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 376
		bodyModel[111].setRotationPoint(-35.51F, -3F, 10F);

		bodyModel[112].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 377
		bodyModel[112].setRotationPoint(-35.51F, 4F, 9F);

		bodyModel[113].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 384
		bodyModel[113].setRotationPoint(-39.5F, 8F, 9F);

		bodyModel[114].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 385
		bodyModel[114].setRotationPoint(-39.5F, 5.5F, 9F);

		bodyModel[115].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 386
		bodyModel[115].setRotationPoint(-39.5F, 3F, 9F);

		bodyModel[116].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 387
		bodyModel[116].setRotationPoint(-39.5F, 0.5F, 9F);

		bodyModel[117].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 261
		bodyModel[117].setRotationPoint(-9.5F, 3.25F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[118].setRotationPoint(-9.5F, 6.25F, -11F);

		bodyModel[119].addBox(0F, 0F, 0F, 4, 6, 16, 0F); // Box 263
		bodyModel[119].setRotationPoint(-9.5F, 3.25F, -8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 264
		bodyModel[120].setRotationPoint(-9.5F, 6.25F, 8F);

		bodyModel[121].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 265
		bodyModel[121].setRotationPoint(-9.5F, 3.25F, 8F);

		bodyModel[122].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 266 big stacc
		bodyModel[122].setRotationPoint(11.25F, -23F, -2F);

		bodyModel[123].addBox(0F, 0F, 0F, 15, 1, 2, 0F); // Box 267
		bodyModel[123].setRotationPoint(-5.5F, -22.5F, -1F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[124].setRotationPoint(34F, -10F, 6F);

		bodyModel[125].addBox(0F, 0F, 0F, 4, 11, 13, 0F); // Box 272
		bodyModel[125].setRotationPoint(31.5F, -12F, -7F);

		bodyModel[126].addBox(0F, 0F, 0F, 4, 9, 14, 0F); // Box 273
		bodyModel[126].setRotationPoint(31.5F, -21F, -7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[127].setRotationPoint(32.5F, -7F, 6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 275
		bodyModel[128].setRotationPoint(32.5F, -12F, 6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[129].setRotationPoint(35.5F, -22F, -2F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 292
		bodyModel[130].setRotationPoint(39.5F, -1F, -3F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 293
		bodyModel[131].setRotationPoint(39.5F, -1F, -7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F); // Box 294
		bodyModel[132].setRotationPoint(39.5F, -1F, 3F);

		bodyModel[133].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 295
		bodyModel[133].setRotationPoint(41.5F, -9F, -3F);

		bodyModel[134].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 296
		bodyModel[134].setRotationPoint(40.5F, -9F, -7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 297
		bodyModel[135].setRotationPoint(40.5F, -9F, -6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[136].setRotationPoint(40.5F, -9F, 3F);

		bodyModel[137].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 299
		bodyModel[137].setRotationPoint(40.5F, -9F, 6F);

		bodyModel[138].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 300
		bodyModel[138].setRotationPoint(40.5F, -9F, 7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[139].setRotationPoint(40.5F, -8F, 7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,-1F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 302
		bodyModel[140].setRotationPoint(39.5F, -9F, 8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,-1F, 0F, -1F, 1F, 0F, -1F, 1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 303
		bodyModel[141].setRotationPoint(39.5F, -9F, -9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 304
		bodyModel[142].setRotationPoint(40.5F, -8F, -8F);

		bodyModel[143].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 305
		bodyModel[143].setRotationPoint(40.5F, -9F, -8F);

		bodyModel[144].addBox(0.5F, 0F, 0.5F, 3, 9, 2, 0F); // Box 412 cs1
		bodyModel[144].setRotationPoint(-23.4F, -15F, -2F);
		bodyModel[144].rotateAngleY = -0.19198622F;

		bodyModel[145].addBox(0F, 0F, 0F, 6, 7, 2, 0F); // Box 413 cs1
		bodyModel[145].setRotationPoint(-28.5F, -13F, 2F);
		bodyModel[145].rotateAngleY = -0.59341195F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs1
		bodyModel[146].setRotationPoint(-28.5F, -15F, 2F);
		bodyModel[146].rotateAngleY = -0.59341195F;

		bodyModel[147].addShapeBox(-0.5F, 0F, 0.5F, 4, 2, 2, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 476 cs1 radio
		bodyModel[147].setRotationPoint(-23.4F, -17F, -2F);
		bodyModel[147].rotateAngleY = -0.19198622F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 504
		bodyModel[148].setRotationPoint(36.5F, -16F, 6F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 490
		bodyModel[149].setRotationPoint(35.5F, -16F, 6F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 490
		bodyModel[150].setRotationPoint(31.5F, -12F, 6F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 504
		bodyModel[151].setRotationPoint(36.5F, -7F, 6F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[152].setRotationPoint(36.5F, -9F, 6F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 504
		bodyModel[153].setRotationPoint(36.5F, -12F, 6F);

		bodyModel[154].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 557 type B shit
		bodyModel[154].setRotationPoint(-23.5F, 0F, -10F);

		bodyModel[155].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 557 type B shit
		bodyModel[155].setRotationPoint(21.5F, 0F, -10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[156].setRotationPoint(-32.5F, -20.35F, -9F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[157].setRotationPoint(-32.5F, -21.35F, -9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[158].setRotationPoint(-32.25F, -19.85F, -8.75F);

		bodyModel[159].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 481 cull
		bodyModel[159].setRotationPoint(-33F, -21.35F, -9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[160].setRotationPoint(-39.5F, 3F, -6.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 370
		bodyModel[161].setRotationPoint(33.5F, 3F, -6.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 23, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 372
		bodyModel[162].setRotationPoint(-11.5F, 3F, -6.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F); // Box 520
		bodyModel[163].setRotationPoint(-33.5F, 3F, -6.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F); // Box 521
		bodyModel[164].setRotationPoint(-29.5F, 3F, -6.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F); // Box 522
		bodyModel[165].setRotationPoint(-13.5F, 3F, -6.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F); // Box 523
		bodyModel[166].setRotationPoint(-17.5F, 3F, -6.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 10, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 524
		bodyModel[167].setRotationPoint(-27.5F, 3F, -6.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 525
		bodyModel[168].setRotationPoint(-31.5F, 2F, -6.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 526
		bodyModel[169].setRotationPoint(-15.5F, 2F, -6.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 10, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 528
		bodyModel[170].setRotationPoint(17.5F, 3F, -6.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F); // Box 529
		bodyModel[171].setRotationPoint(15.5F, 3F, -6.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 530
		bodyModel[172].setRotationPoint(13.5F, 2F, -6.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F); // Box 531
		bodyModel[173].setRotationPoint(11.5F, 3F, -6.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F); // Box 532
		bodyModel[174].setRotationPoint(27.5F, 3F, -6.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 533
		bodyModel[175].setRotationPoint(29.5F, 2F, -6.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F); // Box 534
		bodyModel[176].setRotationPoint(31.5F, 3F, -6.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 527
		bodyModel[177].setRotationPoint(-24F, 3F, -5.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, -3F); // Box 535
		bodyModel[178].setRotationPoint(-25F, 3F, -5.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 536
		bodyModel[179].setRotationPoint(-21F, 3F, -5.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 331 support your local B
		bodyModel[180].setRotationPoint(-33.5F, 3F, -6.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 331 support your local B
		bodyModel[181].setRotationPoint(-17.5F, 3F, -6.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 331 support your local B
		bodyModel[182].setRotationPoint(11.5F, 3F, -6.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 331 support your local B
		bodyModel[183].setRotationPoint(27.5F, 3F, -6.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 335
		bodyModel[184].setRotationPoint(24F, 3F, -5.5F);

		bodyModel[185].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 336
		bodyModel[185].setRotationPoint(20.5F, 3.1F, -2F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, -3F); // Box 337
		bodyModel[186].setRotationPoint(20F, 3F, -5.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 338
		bodyModel[187].setRotationPoint(21F, 3F, -5.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,-0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, -3.75F, -0.1F, -0.1F, -3.5F, -0.1F, -0.1F, -3.5F, -0.1F, -0.1F, -3.75F, -0.1F); // Box 527 why dont you filter some bitches instead
		bodyModel[188].setRotationPoint(-15F, 0F, 7.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 355 brakewheel
		bodyModel[189].setRotationPoint(32F, -12F, 7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 246 B MOUNT
		bodyModel[190].setRotationPoint(-24F, 0F, -10F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 62 B MOUNT
		bodyModel[191].setRotationPoint(-24F, 2.5F, -6.75F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F); // Box 67 B MOUNT
		bodyModel[192].setRotationPoint(-24F, 0F, 6F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68 B MOUNT
		bodyModel[193].setRotationPoint(-24F, 2.5F, 5.75F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 246 B MOUNT
		bodyModel[194].setRotationPoint(21F, 0F, -10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 62 B MOUNT
		bodyModel[195].setRotationPoint(21F, 2.5F, -6.75F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F); // Box 67 B MOUNT
		bodyModel[196].setRotationPoint(21F, 0F, 6F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68 B MOUNT
		bodyModel[197].setRotationPoint(21F, 2.5F, 5.75F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[198].setRotationPoint(19.5F, -22F, -7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[199].setRotationPoint(19.5F, -22F, 5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[200].setRotationPoint(19.5F, -22F, -5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 16, 0, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 494
		bodyModel[201].setRotationPoint(19.5F, -21.01F, -9F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 22, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F); // Box 494
		bodyModel[202].setRotationPoint(20.5F, -13F, 7.01F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 22, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F); // Box 494
		bodyModel[203].setRotationPoint(17.5F, -13F, 7.01F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 494
		bodyModel[204].setRotationPoint(29.5F, -10F, 7.01F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 5, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 494
		bodyModel[205].setRotationPoint(23.5F, -10F, 7.01F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 22, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F); // Box 494
		bodyModel[206].setRotationPoint(21.5F, -13F, -7.01F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 22, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F); // Box 494
		bodyModel[207].setRotationPoint(17.5F, -13F, -7.01F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 5, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 494
		bodyModel[208].setRotationPoint(30.5F, -10F, -7.01F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 5, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 494
		bodyModel[209].setRotationPoint(24.5F, -10F, -7.01F);

		bodyModel[210].addBox(0F, 0F, 0F, 0, 9, 2, 0F); // Box 308
		bodyModel[210].setRotationPoint(-35.5F, -1F, -11F);

		bodyModel[211].addBox(0F, 0F, 0F, 0, 9, 2, 0F); // Box 316
		bodyModel[211].setRotationPoint(-35.5F, -1F, 9F);

		bodyModel[212].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 373
		bodyModel[212].setRotationPoint(35.51F, 4F, -11F);

		bodyModel[213].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 377
		bodyModel[213].setRotationPoint(35.51F, 4F, 9F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 371
		bodyModel[214].setRotationPoint(35.51F, -8F, -10F);

		bodyModel[215].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 372
		bodyModel[215].setRotationPoint(35.51F, -3F, -11F);

		bodyModel[216].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 376
		bodyModel[216].setRotationPoint(35.51F, -3F, 10F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 378
		bodyModel[217].setRotationPoint(35.51F, -8F, 9F);

		bodyModel[218].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 373
		bodyModel[218].setRotationPoint(35.51F, -9F, -11F);

		bodyModel[219].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 377
		bodyModel[219].setRotationPoint(35.51F, -9F, 9F);

		bodyModel[220].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 502
		bodyModel[220].setRotationPoint(-35.5F, -21F, -2F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 503
		bodyModel[221].setRotationPoint(-35.5F, -21F, 2F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 15, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[222].setRotationPoint(-35.5F, -16F, -6F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 155
		bodyModel[223].setRotationPoint(-34.5F, -22F, 5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[224].setRotationPoint(-35.5F, -21F, -7F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 157
		bodyModel[225].setRotationPoint(-34.5F, -22F, -7F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 158
		bodyModel[226].setRotationPoint(-35.5F, -17F, 6F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -0.4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[227].setRotationPoint(-35.5F, -17F, 2F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, -0.4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[228].setRotationPoint(-35.5F, -17F, -6F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[229].setRotationPoint(-35.5F, -17F, -7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 162 rear headlight
		bodyModel[230].setRotationPoint(-36F, -20F, 0F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 163 rear headlight
		bodyModel[231].setRotationPoint(-36F, -20F, -2F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[232].setRotationPoint(-35.5F, -22F, -2F);

		bodyModel[233].addBox(0F, 0F, 0F, 6, 20, 14, 0F); // Box 2
		bodyModel[233].setRotationPoint(-33.5F, -21F, -7F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 15, 14, 0F); // Box 504
		bodyModel[234].setRotationPoint(-34.5F, -16F, -7F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 504
		bodyModel[235].setRotationPoint(-35.5F, -16F, 6F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[236].setRotationPoint(-33.5F, -22F, -7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[237].setRotationPoint(-33.5F, -22F, 5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[238].setRotationPoint(-33.5F, -22F, -5F);

		bodyModel[239].addBox(0F, 0F, 0F, 11, 5, 18, 0F); // Box 95
		bodyModel[239].setRotationPoint(-27.5F, -6F, -7F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 371
		bodyModel[240].setRotationPoint(-35.51F, -8F, -10F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 378
		bodyModel[241].setRotationPoint(-35.51F, -8F, 9F);

		bodyModel[242].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 373
		bodyModel[242].setRotationPoint(-35.51F, -9F, -11F);

		bodyModel[243].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 377
		bodyModel[243].setRotationPoint(-35.51F, -9F, 9F);

		bodyModel[244].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 224
		bodyModel[244].setRotationPoint(-35.5F, -9F, -11F);

		bodyModel[245].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 225
		bodyModel[245].setRotationPoint(-35.5F, -9F, 11F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.25F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -3F, 0F, 0F, 3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 3F, 0F); // Box 723
		bodyModel[246].setRotationPoint(-30.5F, -12F, -11.01F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.25F, 0F, 0F); // Box 723
		bodyModel[247].setRotationPoint(-16.5F, -12F, 11.01F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.25F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -3F, 0F, 0F, 3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 3F, 0F); // Box 723
		bodyModel[248].setRotationPoint(-30.5F, -12F, 11.01F);

		bodyModel[249].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Box 2
		bodyModel[249].setRotationPoint(-22.5F, -21F, -7F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 Door
		bodyModel[250].setRotationPoint(-25.5F, -21F, -8F);

		bodyModel[251].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 2
		bodyModel[251].setRotationPoint(-27.5F, -21F, -7F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 Door
		bodyModel[252].setRotationPoint(-19.5F, -21F, 7F);

		bodyModel[253].addBox(0F, 0F, 0F, 8, 15, 1, 0F); // Box 2
		bodyModel[253].setRotationPoint(-27.5F, -21F, 6F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 330
		bodyModel[254].setRotationPoint(-32F, -21.8F, -6.5F);

		bodyModel[255].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 327
		bodyModel[255].setRotationPoint(-33F, -22.8F, -6.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[256].setRotationPoint(-35.5F, -22F, -5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F); // Box 157
		bodyModel[257].setRotationPoint(-35.5F, -22F, 2F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 563 Step Cull
		bodyModel[258].setRotationPoint(-29.5F, -3F, -11F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 563 Step Cull
		bodyModel[259].setRotationPoint(-12F, -3F, -11F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 563 Step Cull
		bodyModel[260].setRotationPoint(-29.5F, -4F, 7F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 563 Step Cull
		bodyModel[261].setRotationPoint(-17F, -4F, 7F);

		bodyModel[262].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 2 Door
		bodyModel[262].setRotationPoint(-25.5F, -21.01F, -7.5F);

		bodyModel[263].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 2 Door
		bodyModel[263].setRotationPoint(-19.5F, -21.01F, 6.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[264].setRotationPoint(-35.5F, -1F, -11F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 67
		bodyModel[265].setRotationPoint(-35.5F, -1F, 9F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 0, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 311
		bodyModel[266].setRotationPoint(-34.5F, 0F, -11F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[267].setRotationPoint(-33.5F, 0F, -11F);

		bodyModel[268].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 313
		bodyModel[268].setRotationPoint(-34.5F, 0F, -11F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 0, 8, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[269].setRotationPoint(-34.5F, 0F, 9F);

		bodyModel[270].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 382
		bodyModel[270].setRotationPoint(-34.5F, 0F, 11F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[271].setRotationPoint(-33.5F, 0F, 11F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[272].setRotationPoint(-35.5F, 8F, -11F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[273].setRotationPoint(-35.5F, 5.5F, -10F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[274].setRotationPoint(-35.5F, 0.5F, -10F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[275].setRotationPoint(-35.5F, 3F, -10F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[276].setRotationPoint(-35.5F, 8F, 9F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[277].setRotationPoint(-35.5F, 5.5F, 9F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[278].setRotationPoint(-35.5F, 3F, 9F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[279].setRotationPoint(-35.5F, 0.5F, 9F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 0, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 311
		bodyModel[280].setRotationPoint(34.5F, 0F, -11F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 312
		bodyModel[281].setRotationPoint(32.5F, 0F, -11F);

		bodyModel[282].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 313
		bodyModel[282].setRotationPoint(33.5F, 0F, -11F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 13
		bodyModel[283].setRotationPoint(34.5F, 8F, -11F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 14
		bodyModel[284].setRotationPoint(34.5F, 5.5F, -10F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 374
		bodyModel[285].setRotationPoint(34.5F, 0.5F, -10F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 375
		bodyModel[286].setRotationPoint(34.5F, 3F, -10F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[287].setRotationPoint(34.5F, 8F, 9F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 385
		bodyModel[288].setRotationPoint(34.5F, 5.5F, 9F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 386
		bodyModel[289].setRotationPoint(34.5F, 3F, 9F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 387
		bodyModel[290].setRotationPoint(34.5F, 0.5F, 9F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 0, 8, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[291].setRotationPoint(34.5F, 0F, 9F);

		bodyModel[292].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 382
		bodyModel[292].setRotationPoint(33.5F, 0F, 11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 383
		bodyModel[293].setRotationPoint(32.5F, 0F, 11F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[294].setRotationPoint(39.5F, 5F, -10F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[295].setRotationPoint(39.5F, 5F, 0F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[296].setRotationPoint(-39.5F, 3.5F, -9F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[297].setRotationPoint(-39.5F, 6F, -9F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[298].setRotationPoint(-39.5F, 3.5F, 9F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[299].setRotationPoint(-39.5F, 6F, 9F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[300].setRotationPoint(35.5F, 3.5F, -9F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[301].setRotationPoint(35.5F, 6F, -9F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[302].setRotationPoint(35.5F, 3.5F, 9F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[303].setRotationPoint(35.5F, 6F, 9F);

		bodyModel[304].addShapeBox(0F, 0F, -0.5F, 1, 2, 5, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 117 liveryimg 2
		bodyModel[304].setRotationPoint(36.31F, -19.5F, 2.5F);
		bodyModel[304].rotateAngleY = 0.37960911F;

		bodyModel[305].addShapeBox(0F, 0F, -4.5F, 1, 2, 5, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 298 liveryimg 2
		bodyModel[305].setRotationPoint(36.31F, -19.5F, -2.5F);
		bodyModel[305].rotateAngleY = -0.37960911F;

		bodyModel[306].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 298 rear morker lights
		bodyModel[306].setRotationPoint(36.3F, -21F, 2.5F);
		bodyModel[306].rotateAngleY = 0.37524579F;

		bodyModel[307].addShapeBox(0F, 0F, -4F, 1, 1, 3, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 298 rear morker lights
		bodyModel[307].setRotationPoint(36.3F, -21F, -2.5F);
		bodyModel[307].rotateAngleY = -0.37524579F;

		bodyModel[308].addShapeBox(0F, 0F, -0.5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 117 liveryimg 2
		bodyModel[308].setRotationPoint(-35.4F, -19.5F, 2.5F);
		bodyModel[308].rotateAngleY = -0.37960911F;

		bodyModel[309].addShapeBox(0F, 0F, -4.5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 298 liveryimg 2
		bodyModel[309].setRotationPoint(-35.4F, -19.5F, -2.5F);
		bodyModel[309].rotateAngleY = 0.37960911F;

		bodyModel[310].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 298 rear morker lights
		bodyModel[310].setRotationPoint(-35.41F, -21F, 2.5F);
		bodyModel[310].rotateAngleY = -0.38397244F;

		bodyModel[311].addShapeBox(0F, 0F, -4F, 1, 1, 3, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 298 rear morker lights
		bodyModel[311].setRotationPoint(-35.41F, -21F, -2.5F);
		bodyModel[311].rotateAngleY = 0.38397244F;

		bodyModel[312].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[312].setRotationPoint(6F, -23F, -5.5F);

		bodyModel[313].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[313].setRotationPoint(7F, -22.75F, -4.5F);

		bodyModel[314].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[314].setRotationPoint(6.5F, -22.75F, -6.5F);

		bodyModel[315].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[315].setRotationPoint(8.5F, -22F, -5.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[316].setRotationPoint(-21.5F, -22.5F, -2F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[317].setRotationPoint(-40.5F, 0.5F, -4F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[318].setRotationPoint(-40.5F, 0.5F, 2F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[319].setRotationPoint(39.5F, 0.5F, -4F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[320].setRotationPoint(39.5F, 0.5F, 2F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[321].setRotationPoint(-27F, -23F, -1F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[322].setRotationPoint(-27F, -23F, -1F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[323].setRotationPoint(-27F, -23F, -1F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[324].setRotationPoint(-27F, -23F, -1F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[325].setRotationPoint(-27F, -22.5F, -1F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[326].setRotationPoint(-41.51F, 6F, -8F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[327].setRotationPoint(-41.51F, 6F, 0F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[328].setRotationPoint(39.51F, 6F, 0F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[329].setRotationPoint(39.51F, 6F, -8F);
	}
	ModelTypeBnew theB = new ModelTypeBnew();
	ModelZWT theZ = new ModelZWT();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 15464) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.025, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6){
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