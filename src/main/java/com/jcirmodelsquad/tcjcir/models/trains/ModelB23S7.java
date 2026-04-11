//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: B23-S7
// Model Creator: cubed and bida
// Created on: 07.03.2024 - 08:39:52
// Last changed on: 07.03.2024 - 08:39:52

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFB2_new;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
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

public class ModelB23S7 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelB23S7() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[357];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 247, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 260, 118, textureX, textureY); // Box 2 fuel tank
		bodyModel[2] = new ModelRendererTurbo(this, 97, 103, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 274, 2, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 254, 89, textureX, textureY); // Box 10 fuel tank
		bodyModel[6] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[8] = new ModelRendererTurbo(this, 155, 133, textureX, textureY); // Box 63
		bodyModel[9] = new ModelRendererTurbo(this, 464, 115, textureX, textureY); // Box 148
		bodyModel[10] = new ModelRendererTurbo(this, 471, 112, textureX, textureY); // Box 149
		bodyModel[11] = new ModelRendererTurbo(this, 269, 82, textureX, textureY); // Box 156
		bodyModel[12] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 157 fuel tank
		bodyModel[13] = new ModelRendererTurbo(this, 273, 139, textureX, textureY); // Box 158 fuel tank
		bodyModel[14] = new ModelRendererTurbo(this, 101, 118, textureX, textureY); // box65
		bodyModel[15] = new ModelRendererTurbo(this, 422, 147, textureX, textureY); // Box 215
		bodyModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[17] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[18] = new ModelRendererTurbo(this, 255, 64, textureX, textureY); // Box 251
		bodyModel[19] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[20] = new ModelRendererTurbo(this, 445, 125, textureX, textureY); // Box 256
		bodyModel[21] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 281
		bodyModel[22] = new ModelRendererTurbo(this, 155, 81, textureX, textureY); // Box 285
		bodyModel[23] = new ModelRendererTurbo(this, 178, 81, textureX, textureY); // Box 288
		bodyModel[24] = new ModelRendererTurbo(this, 161, 90, textureX, textureY); // Box 300
		bodyModel[25] = new ModelRendererTurbo(this, 178, 90, textureX, textureY); // Box 303
		bodyModel[26] = new ModelRendererTurbo(this, 447, 115, textureX, textureY); // Box 296
		bodyModel[27] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[28] = new ModelRendererTurbo(this, 359, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[29] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[30] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[31] = new ModelRendererTurbo(this, 362, 116, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[32] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 101
		bodyModel[33] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 101
		bodyModel[34] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[35] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[36] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[37] = new ModelRendererTurbo(this, 59, 119, textureX, textureY); // Box 2603
		bodyModel[38] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 263
		bodyModel[39] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[40] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f1
		bodyModel[41] = new ModelRendererTurbo(this, 486, 152, textureX, textureY); // Box 273
		bodyModel[42] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, BoxName.ditch); // Box 275 ditchlight f2
		bodyModel[43] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, BoxName.ditch); // Box 276 ditchlight r1
		bodyModel[44] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, BoxName.ditch); // Box 278 ditchlight r2
		bodyModel[45] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[46] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[47] = new ModelRendererTurbo(this, 431, 128, textureX, textureY); // Box 270434
		bodyModel[48] = new ModelRendererTurbo(this, 448, 130, textureX, textureY); // Box 280
		bodyModel[49] = new ModelRendererTurbo(this, 485, 130, textureX, textureY); // Box 281
		bodyModel[50] = new ModelRendererTurbo(this, 484, 115, textureX, textureY); // Box 282
		bodyModel[51] = new ModelRendererTurbo(this, 204, 16, textureX, textureY); // Box 292
		bodyModel[52] = new ModelRendererTurbo(this, 204, 1, textureX, textureY); // Box 293
		bodyModel[53] = new ModelRendererTurbo(this, 205, 9, textureX, textureY); // Box 294
		bodyModel[54] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[55] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[56] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[57] = new ModelRendererTurbo(this, 210, 126, textureX, textureY); // Box 280
		bodyModel[58] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 440
		bodyModel[59] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, BoxName.ditch); // Box 441 ditchlight r2
		bodyModel[60] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[61] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, BoxName.ditch); // Box 443 ditchlight r1
		bodyModel[62] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 444
		bodyModel[63] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, BoxName.ditch); // Box 445 ditchlight f2
		bodyModel[64] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, BoxName.ditch); // Box 446 ditchlight f1
		bodyModel[65] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[66] = new ModelRendererTurbo(this, 92, 90, textureX, textureY); // Box 38
		bodyModel[67] = new ModelRendererTurbo(this, 87, 90, textureX, textureY); // Box 558
		bodyModel[68] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[69] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[70] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[71] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[72] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[73] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[74] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[75] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[76] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[77] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[78] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[79] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[80] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[81] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[82] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[83] = new ModelRendererTurbo(this, 89, 170, textureX, textureY); // Box 734
		bodyModel[84] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[85] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[86] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[87] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[88] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[89] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318
		bodyModel[90] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 322
		bodyModel[91] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 757
		bodyModel[92] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 758
		bodyModel[93] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 440
		bodyModel[94] = new ModelRendererTurbo(this, 176, 116, textureX, textureY); // Box 631
		bodyModel[95] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 882
		bodyModel[96] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 883
		bodyModel[97] = new ModelRendererTurbo(this, 217, 173, textureX, textureY); // Box 630
		bodyModel[98] = new ModelRendererTurbo(this, 315, 117, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[99] = new ModelRendererTurbo(this, 324, 117, textureX, textureY); // Box 382
		bodyModel[100] = new ModelRendererTurbo(this, 324, 117, textureX, textureY); // Box 383
		bodyModel[101] = new ModelRendererTurbo(this, 120, 120, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[102] = new ModelRendererTurbo(this, 112, 120, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[103] = new ModelRendererTurbo(this, 468, 142, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[104] = new ModelRendererTurbo(this, 460, 142, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[105] = new ModelRendererTurbo(this, 70, 183, textureX, textureY); // Box 24
		bodyModel[106] = new ModelRendererTurbo(this, 83, 181, textureX, textureY); // Box 25
		bodyModel[107] = new ModelRendererTurbo(this, 96, 183, textureX, textureY); // Box 405
		bodyModel[108] = new ModelRendererTurbo(this, 109, 181, textureX, textureY); // Box 406
		bodyModel[109] = new ModelRendererTurbo(this, 434, 210, textureX, textureY); // Box 413 smol fuel tank
		bodyModel[110] = new ModelRendererTurbo(this, 389, 202, textureX, textureY); // Box 414 smol fuel tank
		bodyModel[111] = new ModelRendererTurbo(this, 338, 201, textureX, textureY); // Box 415 smol fuel tank
		bodyModel[112] = new ModelRendererTurbo(this, 434, 202, textureX, textureY); // Box 416 smol fuel tank
		bodyModel[113] = new ModelRendererTurbo(this, 406, 186, textureX, textureY, "cull"); // Box 296 cull fuel tank smol support
		bodyModel[114] = new ModelRendererTurbo(this, 406, 186, textureX, textureY, "cull"); // Box 296 cull fuel tank smol support
		bodyModel[115] = new ModelRendererTurbo(this, 343, 231, textureX, textureY); // Box 421 engineroom oil drain small tank
		bodyModel[116] = new ModelRendererTurbo(this, 156, 227, textureX, textureY); // Box 298
		bodyModel[117] = new ModelRendererTurbo(this, 123, 228, textureX, textureY); // Box 279
		bodyModel[118] = new ModelRendererTurbo(this, 108, 234, textureX, textureY); // Box 282
		bodyModel[119] = new ModelRendererTurbo(this, 93, 234, textureX, textureY); // Box 283
		bodyModel[120] = new ModelRendererTurbo(this, 118, 231, textureX, textureY); // Box 297
		bodyModel[121] = new ModelRendererTurbo(this, 183, 218, textureX, textureY); // Box 298
		bodyModel[122] = new ModelRendererTurbo(this, 169, 208, textureX, textureY); // Box 299
		bodyModel[123] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 300
		bodyModel[124] = new ModelRendererTurbo(this, 154, 219, textureX, textureY); // Box 301
		bodyModel[125] = new ModelRendererTurbo(this, 145, 231, textureX, textureY); // Box 302
		bodyModel[126] = new ModelRendererTurbo(this, 200, 244, textureX, textureY, "cull"); // Box cull rachetbrake
		bodyModel[127] = new ModelRendererTurbo(this, 40, 69, textureX, textureY); // Box 7
		bodyModel[128] = new ModelRendererTurbo(this, 40, 103, textureX, textureY); // Box 24
		bodyModel[129] = new ModelRendererTurbo(this, 1, 86, textureX, textureY); // Box 28
		bodyModel[130] = new ModelRendererTurbo(this, 1, 53, textureX, textureY); // Box 30
		bodyModel[131] = new ModelRendererTurbo(this, 65, 100, textureX, textureY); // Box 52 door swing right
		bodyModel[132] = new ModelRendererTurbo(this, 65, 66, textureX, textureY); // Box 314 door swing right
		bodyModel[133] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 266
		bodyModel[134] = new ModelRendererTurbo(this, 58, 61, textureX, textureY); // Box 268
		bodyModel[135] = new ModelRendererTurbo(this, 5, 47, textureX, textureY); // Box 271
		bodyModel[136] = new ModelRendererTurbo(this, 58, 42, textureX, textureY); // Box 374
		bodyModel[137] = new ModelRendererTurbo(this, 22, 65, textureX, textureY); // Box 375
		bodyModel[138] = new ModelRendererTurbo(this, 47, 61, textureX, textureY); // Box 376
		bodyModel[139] = new ModelRendererTurbo(this, 5, 41, textureX, textureY); // Box 377
		bodyModel[140] = new ModelRendererTurbo(this, 47, 42, textureX, textureY); // Box 378
		bodyModel[141] = new ModelRendererTurbo(this, 22, 62, textureX, textureY); // Box 379
		bodyModel[142] = new ModelRendererTurbo(this, 15, 129, textureX, textureY, "cull"); // Box 162 cull
		bodyModel[143] = new ModelRendererTurbo(this, 27, 130, textureX, textureY, "cull"); // Box 163 cull
		bodyModel[144] = new ModelRendererTurbo(this, 34, 129, textureX, textureY, "cull"); // Box 164 cull
		bodyModel[145] = new ModelRendererTurbo(this, 136, 72, textureX, textureY); // Box 285
		bodyModel[146] = new ModelRendererTurbo(this, 142, 60, textureX, textureY, "lamp"); // Box 247 Headlight Front
		bodyModel[147] = new ModelRendererTurbo(this, 134, 60, textureX, textureY, "lamp"); // Box 248 Headlight Front
		bodyModel[148] = new ModelRendererTurbo(this, 136, 65, textureX, textureY); // Box 296
		bodyModel[149] = new ModelRendererTurbo(this, 180, 121, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[150] = new ModelRendererTurbo(this, 180, 121, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[151] = new ModelRendererTurbo(this, 143, 68, textureX, textureY); // Box 371
		bodyModel[152] = new ModelRendererTurbo(this, 152, 56, textureX, textureY); // Box 372
		bodyModel[153] = new ModelRendererTurbo(this, 152, 52, textureX, textureY); // Box 373
		bodyModel[154] = new ModelRendererTurbo(this, 135, 57, textureX, textureY, "lamp"); // Box 301 markerlight glow
		bodyModel[155] = new ModelRendererTurbo(this, 135, 57, textureX, textureY, "lamp"); // Box 344 markerlight glow
		bodyModel[156] = new ModelRendererTurbo(this, 22, 87, textureX, textureY); // Box 368
		bodyModel[157] = new ModelRendererTurbo(this, 153, 60, textureX, textureY); // Box 419
		bodyModel[158] = new ModelRendererTurbo(this, 145, 56, textureX, textureY); // Box 420
		bodyModel[159] = new ModelRendererTurbo(this, 145, 52, textureX, textureY); // Box 421
		bodyModel[160] = new ModelRendererTurbo(this, 140, 57, textureX, textureY); // Box 422
		bodyModel[161] = new ModelRendererTurbo(this, 127, 68, textureX, textureY); // Box 425
		bodyModel[162] = new ModelRendererTurbo(this, 422, 62, textureX, textureY); // Box 96
		bodyModel[163] = new ModelRendererTurbo(this, 288, 228, textureX, textureY); // Box 88
		bodyModel[164] = new ModelRendererTurbo(this, 344, 228, textureX, textureY); // Box 233
		bodyModel[165] = new ModelRendererTurbo(this, 288, 242, textureX, textureY); // Box 312
		bodyModel[166] = new ModelRendererTurbo(this, 452, 112, textureX, textureY); // Box 280
		bodyModel[167] = new ModelRendererTurbo(this, 82, 126, textureX, textureY); // Box 432
		bodyModel[168] = new ModelRendererTurbo(this, 69, 128, textureX, textureY); // Box 433
		bodyModel[169] = new ModelRendererTurbo(this, 60, 130, textureX, textureY); // Box 434
		bodyModel[170] = new ModelRendererTurbo(this, 48, 136, textureX, textureY); // Box 143
		bodyModel[171] = new ModelRendererTurbo(this, 14, 136, textureX, textureY); // Box 559
		bodyModel[172] = new ModelRendererTurbo(this, 87, 143, textureX, textureY); // Box 435
		bodyModel[173] = new ModelRendererTurbo(this, 90, 143, textureX, textureY); // Box 436
		bodyModel[174] = new ModelRendererTurbo(this, 73, 50, textureX, textureY); // Box 258
		bodyModel[175] = new ModelRendererTurbo(this, 59, 39, textureX, textureY); // Box 522
		bodyModel[176] = new ModelRendererTurbo(this, 66, 50, textureX, textureY); // Box 244
		bodyModel[177] = new ModelRendererTurbo(this, 68, 39, textureX, textureY); // Box 326
		bodyModel[178] = new ModelRendererTurbo(this, 43, 139, textureX, textureY); // Box 81
		bodyModel[179] = new ModelRendererTurbo(this, 54, 129, textureX, textureY); // Box 81
		bodyModel[180] = new ModelRendererTurbo(this, 78, 38, textureX, textureY); // Box 246
		bodyModel[181] = new ModelRendererTurbo(this, 73, 48, textureX, textureY); // Box 249
		bodyModel[182] = new ModelRendererTurbo(this, 71, 38, textureX, textureY); // Box 250
		bodyModel[183] = new ModelRendererTurbo(this, 68, 41, textureX, textureY); // Box 327
		bodyModel[184] = new ModelRendererTurbo(this, 40, 139, textureX, textureY); // Box 247
		bodyModel[185] = new ModelRendererTurbo(this, 9, 129, textureX, textureY); // Box 248
		bodyModel[186] = new ModelRendererTurbo(this, 367, 99, textureX, textureY); // Box 18 late stack
		bodyModel[187] = new ModelRendererTurbo(this, 380, 96, textureX, textureY); // Box 21 late stack
		bodyModel[188] = new ModelRendererTurbo(this, 61, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME5-4
		bodyModel[189] = new ModelRendererTurbo(this, 61, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME5-2
		bodyModel[190] = new ModelRendererTurbo(this, 61, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME5-3
		bodyModel[191] = new ModelRendererTurbo(this, 61, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME5-1
		bodyModel[192] = new ModelRendererTurbo(this, 70, 8, textureX, textureY); // Box 421 prime base
		bodyModel[193] = new ModelRendererTurbo(this, 71, 4, textureX, textureY); // Box 184 o2 generator
		bodyModel[194] = new ModelRendererTurbo(this, 72, 6, textureX, textureY); // Box 233
		bodyModel[195] = new ModelRendererTurbo(this, 72, 4, textureX, textureY); // Box 234
		bodyModel[196] = new ModelRendererTurbo(this, 30, 214, textureX, textureY); // Box 261
		bodyModel[197] = new ModelRendererTurbo(this, 2, 202, textureX, textureY); // Box 467
		bodyModel[198] = new ModelRendererTurbo(this, 471, 97, textureX, textureY); // Box 292
		bodyModel[199] = new ModelRendererTurbo(this, 460, 96, textureX, textureY); // Box 293
		bodyModel[200] = new ModelRendererTurbo(this, 477, 96, textureX, textureY); // Box 294
		bodyModel[201] = new ModelRendererTurbo(this, 207, 217, textureX, textureY, "cull"); // Box 317 cull nose rails
		bodyModel[202] = new ModelRendererTurbo(this, 207, 212, textureX, textureY, "cull"); // Box 318 cull nose rails
		bodyModel[203] = new ModelRendererTurbo(this, 216, 223, textureX, textureY, "cull"); // Box 222 cull nose handrails
		bodyModel[204] = new ModelRendererTurbo(this, 205, 223, textureX, textureY, "cull"); // Box 224 cull nose handrails
		bodyModel[205] = new ModelRendererTurbo(this, 73, 122, textureX, textureY); // Box 402
		bodyModel[206] = new ModelRendererTurbo(this, 87, 123, textureX, textureY); // Box 300
		bodyModel[207] = new ModelRendererTurbo(this, 82, 123, textureX, textureY); // Box 369
		bodyModel[208] = new ModelRendererTurbo(this, 468, 7, textureX, textureY); // Box 31
		bodyModel[209] = new ModelRendererTurbo(this, 468, 2, textureX, textureY, "lamp"); // Box 247 headlight rear
		bodyModel[210] = new ModelRendererTurbo(this, 468, 2, textureX, textureY, "lamp"); // Box 248 headlight rear
		bodyModel[211] = new ModelRendererTurbo(this, 485, 137, textureX, textureY); // Box 318 sandcap top rear
		bodyModel[212] = new ModelRendererTurbo(this, 236, 246, textureX, textureY); // Box 127
		bodyModel[213] = new ModelRendererTurbo(this, 235, 250, textureX, textureY); // Box 130
		bodyModel[214] = new ModelRendererTurbo(this, 237, 236, textureX, textureY); // Box 135
		bodyModel[215] = new ModelRendererTurbo(this, 236, 241, textureX, textureY); // Box 136
		bodyModel[216] = new ModelRendererTurbo(this, 266, 229, textureX, textureY); // Box 276
		bodyModel[217] = new ModelRendererTurbo(this, 266, 229, textureX, textureY); // Box 277
		bodyModel[218] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 688
		bodyModel[219] = new ModelRendererTurbo(this, 81, 92, textureX, textureY); // Box 210
		bodyModel[220] = new ModelRendererTurbo(this, 228, 224, textureX, textureY); // Box 415 intake
		bodyModel[221] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 279
		bodyModel[222] = new ModelRendererTurbo(this, 420, 17, textureX, textureY); // Box 280
		bodyModel[223] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 281
		bodyModel[224] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[225] = new ModelRendererTurbo(this, 152, 146, textureX, textureY); // Box 196
		bodyModel[226] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[227] = new ModelRendererTurbo(this, 90, 40, textureX, textureY); // Box 203
		bodyModel[228] = new ModelRendererTurbo(this, 89, 58, textureX, textureY); // Box 205
		bodyModel[229] = new ModelRendererTurbo(this, 146, 146, textureX, textureY); // Box 261
		bodyModel[230] = new ModelRendererTurbo(this, 91, 55, textureX, textureY); // Box 411
		bodyModel[231] = new ModelRendererTurbo(this, 91, 37, textureX, textureY); // Box 312 some scl units have these
		bodyModel[232] = new ModelRendererTurbo(this, 440, 129, textureX, textureY); // Box 218
		bodyModel[233] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[234] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[235] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[236] = new ModelRendererTurbo(this, 464, 166, textureX, textureY); // Box 291
		bodyModel[237] = new ModelRendererTurbo(this, 473, 164, textureX, textureY); // Box 292
		bodyModel[238] = new ModelRendererTurbo(this, 452, 138, textureX, textureY); // Box 294
		bodyModel[239] = new ModelRendererTurbo(this, 451, 164, textureX, textureY); // Box 295
		bodyModel[240] = new ModelRendererTurbo(this, 455, 138, textureX, textureY); // Box 297
		bodyModel[241] = new ModelRendererTurbo(this, 87, 141, textureX, textureY); // Box 298
		bodyModel[242] = new ModelRendererTurbo(this, 90, 141, textureX, textureY); // Box 299
		bodyModel[243] = new ModelRendererTurbo(this, 105, 5, textureX, textureY); // Box 450
		bodyModel[244] = new ModelRendererTurbo(this, 98, 7, textureX, textureY, "cull"); // Box 282 antenna plate cull
		bodyModel[245] = new ModelRendererTurbo(this, 114, 9, textureX, textureY); // Box 364
		bodyModel[246] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 363
		bodyModel[247] = new ModelRendererTurbo(this, 119, 12, textureX, textureY); // Box 362
		bodyModel[248] = new ModelRendererTurbo(this, 120, 6, textureX, textureY); // Box 361
		bodyModel[249] = new ModelRendererTurbo(this, 65, 4, textureX, textureY, "cull"); // Box cull
		bodyModel[250] = new ModelRendererTurbo(this, 254, 201, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[251] = new ModelRendererTurbo(this, 280, 223, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[252] = new ModelRendererTurbo(this, 289, 223, textureX, textureY); // Box 428
		bodyModel[253] = new ModelRendererTurbo(this, 280, 223, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[254] = new ModelRendererTurbo(this, 280, 223, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[255] = new ModelRendererTurbo(this, 280, 223, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[256] = new ModelRendererTurbo(this, 315, 201, textureX, textureY); // Box 421
		bodyModel[257] = new ModelRendererTurbo(this, 314, 198, textureX, textureY); // Box 420
		bodyModel[258] = new ModelRendererTurbo(this, 315, 204, textureX, textureY); // Box 419
		bodyModel[259] = new ModelRendererTurbo(this, 317, 207, textureX, textureY); // Box 418
		bodyModel[260] = new ModelRendererTurbo(this, 327, 218, textureX, textureY); // Box 564
		bodyModel[261] = new ModelRendererTurbo(this, 327, 216, textureX, textureY); // Box 563
		bodyModel[262] = new ModelRendererTurbo(this, 340, 206, textureX, textureY, "cull"); // Box 562 cull ptc antenna shiz
		bodyModel[263] = new ModelRendererTurbo(this, 340, 198, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[264] = new ModelRendererTurbo(this, 82, 247, textureX, textureY); // Box 354
		bodyModel[265] = new ModelRendererTurbo(this, 85, 242, textureX, textureY, "lamp"); // Box 353 headlight nose
		bodyModel[266] = new ModelRendererTurbo(this, 85, 237, textureX, textureY, "lamp"); // Box 352 headlight nose
		bodyModel[267] = new ModelRendererTurbo(this, 497, 111, textureX, textureY, "cull"); // Box 361 cull horn mount
		bodyModel[268] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 362
		bodyModel[269] = new ModelRendererTurbo(this, 490, 109, textureX, textureY); // Box 363
		bodyModel[270] = new ModelRendererTurbo(this, 490, 112, textureX, textureY); // Box 364
		bodyModel[271] = new ModelRendererTurbo(this, 89, 52, textureX, textureY); // Box 395
		bodyModel[272] = new ModelRendererTurbo(this, 91, 50, textureX, textureY); // Box 394
		bodyModel[273] = new ModelRendererTurbo(this, 91, 45, textureX, textureY); // Box 294
		bodyModel[274] = new ModelRendererTurbo(this, 89, 47, textureX, textureY); // Box 202
		bodyModel[275] = new ModelRendererTurbo(this, 89, 42, textureX, textureY); // Box 204
		bodyModel[276] = new ModelRendererTurbo(this, 91, 37, textureX, textureY); // Box 321
		bodyModel[277] = new ModelRendererTurbo(this, 90, 40, textureX, textureY); // Box 322
		bodyModel[278] = new ModelRendererTurbo(this, 89, 42, textureX, textureY); // Box 323
		bodyModel[279] = new ModelRendererTurbo(this, 89, 47, textureX, textureY); // Box 324
		bodyModel[280] = new ModelRendererTurbo(this, 91, 45, textureX, textureY); // Box 325
		bodyModel[281] = new ModelRendererTurbo(this, 89, 52, textureX, textureY); // Box 326
		bodyModel[282] = new ModelRendererTurbo(this, 91, 50, textureX, textureY); // Box 327
		bodyModel[283] = new ModelRendererTurbo(this, 91, 55, textureX, textureY); // Box 328
		bodyModel[284] = new ModelRendererTurbo(this, 89, 58, textureX, textureY); // Box 329
		bodyModel[285] = new ModelRendererTurbo(this, 101, 40, textureX, textureY); // Box 339
		bodyModel[286] = new ModelRendererTurbo(this, 101, 58, textureX, textureY); // Box 340
		bodyModel[287] = new ModelRendererTurbo(this, 101, 55, textureX, textureY); // Box 341
		bodyModel[288] = new ModelRendererTurbo(this, 101, 37, textureX, textureY); // Box 342
		bodyModel[289] = new ModelRendererTurbo(this, 101, 52, textureX, textureY); // Box 343
		bodyModel[290] = new ModelRendererTurbo(this, 101, 50, textureX, textureY); // Box 344
		bodyModel[291] = new ModelRendererTurbo(this, 101, 45, textureX, textureY); // Box 345
		bodyModel[292] = new ModelRendererTurbo(this, 101, 47, textureX, textureY); // Box 346
		bodyModel[293] = new ModelRendererTurbo(this, 101, 42, textureX, textureY); // Box 347
		bodyModel[294] = new ModelRendererTurbo(this, 101, 40, textureX, textureY); // Box 348
		bodyModel[295] = new ModelRendererTurbo(this, 101, 58, textureX, textureY); // Box 349
		bodyModel[296] = new ModelRendererTurbo(this, 101, 55, textureX, textureY); // Box 350
		bodyModel[297] = new ModelRendererTurbo(this, 101, 37, textureX, textureY); // Box 351
		bodyModel[298] = new ModelRendererTurbo(this, 101, 52, textureX, textureY); // Box 352
		bodyModel[299] = new ModelRendererTurbo(this, 101, 50, textureX, textureY); // Box 353
		bodyModel[300] = new ModelRendererTurbo(this, 101, 45, textureX, textureY); // Box 354
		bodyModel[301] = new ModelRendererTurbo(this, 101, 47, textureX, textureY); // Box 355
		bodyModel[302] = new ModelRendererTurbo(this, 101, 42, textureX, textureY); // Box 356
		bodyModel[303] = new ModelRendererTurbo(this, 76, 22, textureX, textureY); // Box 5 aww
		bodyModel[304] = new ModelRendererTurbo(this, 115, 16, textureX, textureY, "cull"); // Box 362 cull allweather
		bodyModel[305] = new ModelRendererTurbo(this, 96, 27, textureX, textureY); // Box 311
		bodyModel[306] = new ModelRendererTurbo(this, 116, 27, textureX, textureY); // Box 123
		bodyModel[307] = new ModelRendererTurbo(this, 76, 17, textureX, textureY); // Box 361 aww
		bodyModel[308] = new ModelRendererTurbo(this, 94, 16, textureX, textureY, "cull"); // Box 362 cull allweather
		bodyModel[309] = new ModelRendererTurbo(this, 353, 230, textureX, textureY); // Box 485
		bodyModel[310] = new ModelRendererTurbo(this, 355, 236, textureX, textureY, "cull"); // Box 484 cull
		bodyModel[311] = new ModelRendererTurbo(this, 146, 5, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[312] = new ModelRendererTurbo(this, 146, 9, textureX, textureY); // Box 409 commander base
		bodyModel[313] = new ModelRendererTurbo(this, 414, 234, textureX, textureY); // Box 345
		bodyModel[314] = new ModelRendererTurbo(this, 414, 234, textureX, textureY); // Box 333
		bodyModel[315] = new ModelRendererTurbo(this, 142, 24, textureX, textureY); // Box 277
		bodyModel[316] = new ModelRendererTurbo(this, 140, 17, textureX, textureY); // Box 355 brakewheel
		bodyModel[317] = new ModelRendererTurbo(this, 212, 238, textureX, textureY); // Box 43
		bodyModel[318] = new ModelRendererTurbo(this, 211, 235, textureX, textureY); // Box 43
		bodyModel[319] = new ModelRendererTurbo(this, 175, 177, textureX, textureY); // Box 431 backpannel bulgy bit
		bodyModel[320] = new ModelRendererTurbo(this, 117, 198, textureX, textureY); // Box 530 not a fridge
		bodyModel[321] = new ModelRendererTurbo(this, 143, 188, textureX, textureY, "lamp"); // Box 412 cab signalling glowey
		bodyModel[322] = new ModelRendererTurbo(this, 148, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[323] = new ModelRendererTurbo(this, 132, 195, textureX, textureY); // Box 531 cs
		bodyModel[324] = new ModelRendererTurbo(this, 144, 181, textureX, textureY); // Box 86 cs
		bodyModel[325] = new ModelRendererTurbo(this, 132, 202, textureX, textureY); // Box 413 cs
		bodyModel[326] = new ModelRendererTurbo(this, 132, 182, textureX, textureY); // Box 412 cs
		bodyModel[327] = new ModelRendererTurbo(this, 30, 44, textureX, textureY); // Box 348
		bodyModel[328] = new ModelRendererTurbo(this, 465, 27, textureX, textureY, "lamp"); // Box 395 numberboard
		bodyModel[329] = new ModelRendererTurbo(this, 465, 27, textureX, textureY, "lamp"); // Box 393 numberboard
		bodyModel[330] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 219 sandcap
		bodyModel[331] = new ModelRendererTurbo(this, 462, 104, textureX, textureY, "cull"); // Box cull sandcap housing
		bodyModel[332] = new ModelRendererTurbo(this, 367, 85, textureX, textureY); // Box 354
		bodyModel[333] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 356
		bodyModel[334] = new ModelRendererTurbo(this, 52, 14, textureX, textureY); // Box 357
		bodyModel[335] = new ModelRendererTurbo(this, 475, 4, textureX, textureY); // Box 399
		bodyModel[336] = new ModelRendererTurbo(this, 475, 7, textureX, textureY); // Box 398
		bodyModel[337] = new ModelRendererTurbo(this, 168, 188, textureX, textureY); // Box 461 nose stairs hand rail inside your ass
		bodyModel[338] = new ModelRendererTurbo(this, 504, 122, textureX, textureY, "lamp"); // Box 349 markerlight glow
		bodyModel[339] = new ModelRendererTurbo(this, 504, 122, textureX, textureY, "lamp"); // Box 348 glow markerlight
		bodyModel[340] = new ModelRendererTurbo(this, 54, 63, textureX, textureY); // Box 357
		bodyModel[341] = new ModelRendererTurbo(this, 51, 90, textureX, textureY); // Box 358
		bodyModel[342] = new ModelRendererTurbo(this, 174, 9, textureX, textureY); // Box 359
		bodyModel[343] = new ModelRendererTurbo(this, 226, 220, textureX, textureY); // Box 360
		bodyModel[344] = new ModelRendererTurbo(this, 55, 207, textureX, textureY); // Box 361
		bodyModel[345] = new ModelRendererTurbo(this, 320, 138, textureX, textureY, "cull"); // Box 310 cull fueltank support
		bodyModel[346] = new ModelRendererTurbo(this, 320, 139, textureX, textureY, "cull"); // Box 311 cull fueltank support
		bodyModel[347] = new ModelRendererTurbo(this, 315, 97, textureX, textureY, "cull"); // Box 364 cull fueltank support
		bodyModel[348] = new ModelRendererTurbo(this, 315, 97, textureX, textureY, "cull"); // Box 365 cull fueltank support
		bodyModel[349] = new ModelRendererTurbo(this, 153, 4, textureX, textureY); // Box 525
		bodyModel[350] = new ModelRendererTurbo(this, 153, 7, textureX, textureY); // Box 433
		bodyModel[351] = new ModelRendererTurbo(this, 162, 7, textureX, textureY); // Box 434
		bodyModel[352] = new ModelRendererTurbo(this, 153, 10, textureX, textureY); // Box 436
		bodyModel[353] = new ModelRendererTurbo(this, 165, 19, textureX, textureY); // Box 353
		bodyModel[354] = new ModelRendererTurbo(this, 156, 16, textureX, textureY); // Box 354
		bodyModel[355] = new ModelRendererTurbo(this, 156, 19, textureX, textureY); // Box 355
		bodyModel[356] = new ModelRendererTurbo(this, 156, 22, textureX, textureY); // Box 356

		bodyModel[0].addBox(0F, 0F, 0F, 76, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 18, 4, 16, 0F); // Box 2 fuel tank
		bodyModel[1].setRotationPoint(-9F, 5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 3
		bodyModel[2].setRotationPoint(-42.01F, -2F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 53, 20, 14, 0F); // Box 6
		bodyModel[3].setRotationPoint(-18F, -21F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 8
		bodyModel[4].setRotationPoint(-42F, -1F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 18, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10 fuel tank
		bodyModel[5].setRotationPoint(-9F, 2F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[6].setRotationPoint(10F, 4F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[7].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[8].setRotationPoint(-38F, 2F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 20, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[9].setRotationPoint(38F, -21F, -1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 20, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[10].setRotationPoint(38F, -21F, 1F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 156
		bodyModel[11].setRotationPoint(-38F, 1.5F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157 fuel tank
		bodyModel[12].setRotationPoint(-9F, 5F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158 fuel tank
		bodyModel[13].setRotationPoint(-9F, 5F, 8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[14].setRotationPoint(-42F, 8F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 215
		bodyModel[15].setRotationPoint(38F, -1F, -7F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[16].setRotationPoint(42F, 3F, -1.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[17].setRotationPoint(42F, 8F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 76, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[18].setRotationPoint(-38F, 1F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[19].setRotationPoint(-43F, -4F, -6.75F);

		bodyModel[20].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 256
		bodyModel[20].setRotationPoint(42.01F, -2F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[21].setRotationPoint(42F, -4F, -6.75F);

		bodyModel[22].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 285
		bodyModel[22].setRotationPoint(-18F, -13F, 11F);

		bodyModel[23].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 288
		bodyModel[23].setRotationPoint(-5F, -9F, 11F);

		bodyModel[24].addBox(0F, 0F, 0F, 8, 7, 0, 0F); // Box 300
		bodyModel[24].setRotationPoint(-18F, -17F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 303
		bodyModel[25].setRotationPoint(-5F, -9F, -11F);

		bodyModel[26].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[26].setRotationPoint(39F, -9F, -11F);

		bodyModel[27].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[27].setRotationPoint(10.5F, 6F, -9.5F);
		bodyModel[27].rotateAngleZ = -0.10471976F;

		bodyModel[28].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[28].setRotationPoint(9F, 1F, 8.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[29].setRotationPoint(-11F, 4F, -9F);

		bodyModel[30].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[30].setRotationPoint(-10.5F, 6F, -9.5F);
		bodyModel[30].rotateAngleZ = 0.10471976F;

		bodyModel[31].addBox(-0.5F, -6F, -1F, 1, 6, 1, 0F); // Box 305 pipe cull
		bodyModel[31].setRotationPoint(-10.5F, 5.5F, 10.01F);
		bodyModel[31].rotateAngleZ = -0.2268928F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[32].setRotationPoint(-42.5F, -0.25F, -7.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[33].setRotationPoint(42F, -0.25F, -7.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[34].setRotationPoint(-11F, 2.5F, 8.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[35].setRotationPoint(-11F, 1.5F, 8.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[36].setRotationPoint(-10.75F, 3F, 8.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[37].setRotationPoint(-38F, 1F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[38].setRotationPoint(36F, 1F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[39].setRotationPoint(-42F, 1F, -3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[40].setRotationPoint(-43.25F, -4F, -6.75F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[41].setRotationPoint(37F, 1F, -3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f2
		bodyModel[42].setRotationPoint(-42.75F, -0.25F, -7.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[43].setRotationPoint(42.75F, -4F, -6.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 ditchlight r2
		bodyModel[44].setRotationPoint(42.25F, -0.25F, -7.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[45].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[46].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[47].setRotationPoint(36F, 1F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[48].setRotationPoint(39F, -4F, -11.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[49].setRotationPoint(39F, -4F, 10.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[50].setRotationPoint(39F, -9F, 9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 25, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[51].setRotationPoint(-8F, -22F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 25, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[52].setRotationPoint(-8F, -22F, 2F);

		bodyModel[53].addBox(0F, 0F, 0F, 25, 1, 4, 0F); // Box 294
		bodyModel[53].setRotationPoint(-8F, -22F, -2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0.4F, -8F, 0F, 0.4F, -8F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0.4F, 0F, 0F); // Box 296
		bodyModel[54].setRotationPoint(-10F, -17F, -11.01F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 297
		bodyModel[55].setRotationPoint(-7F, -13F, 11.01F);

		bodyModel[56].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[56].setRotationPoint(-32F, 1F, 9F);
		bodyModel[56].rotateAngleZ = -0.27925268F;

		bodyModel[57].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[57].setRotationPoint(-35F, 1F, 9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[58].setRotationPoint(42F, -0.25F, 5.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r2
		bodyModel[59].setRotationPoint(42.25F, -0.25F, 5.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[60].setRotationPoint(42F, -4F, 4.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[61].setRotationPoint(42.75F, -4F, 4.75F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[62].setRotationPoint(-42.5F, -0.25F, 5.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f2
		bodyModel[63].setRotationPoint(-42.75F, -0.25F, 5.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[64].setRotationPoint(-43.25F, -4F, 4.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[65].setRotationPoint(-43F, -4F, 4.75F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[66].setRotationPoint(-9F, -3F, 7F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[67].setRotationPoint(-9F, -5F, 10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[68].setRotationPoint(-46F, 7F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[69].setRotationPoint(-46F, 7F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[70].setRotationPoint(-45F, 6F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[71].setRotationPoint(-45F, 5F, 2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[72].setRotationPoint(-45F, 6F, -10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[73].setRotationPoint(-45F, 5F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[74].setRotationPoint(-45F, 4F, 2F);

		bodyModel[75].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[75].setRotationPoint(-45F, 4F, -8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[76].setRotationPoint(44F, 6F, 0F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[77].setRotationPoint(44F, 6F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[78].setRotationPoint(45F, 7F, -10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[79].setRotationPoint(45F, 7F, 0F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[80].setRotationPoint(44F, 5F, 2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[81].setRotationPoint(44F, 4F, 2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[82].setRotationPoint(44F, 5F, -10F);

		bodyModel[83].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[83].setRotationPoint(44F, 4F, -8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[84].setRotationPoint(-12F, 5F, -9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[85].setRotationPoint(-10F, 5F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[86].setRotationPoint(9F, 5F, -9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[87].setRotationPoint(11F, 5F, -9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 76, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[88].setRotationPoint(-38F, 2.75F, -7.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 318
		bodyModel[89].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322
		bodyModel[90].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757
		bodyModel[91].setRotationPoint(23.5F, 2F, 6F);

		bodyModel[92].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758
		bodyModel[92].setRotationPoint(22.5F, 2.5F, -2F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440
		bodyModel[93].setRotationPoint(-26.5F, 2.5F, -2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 631
		bodyModel[94].setRotationPoint(-26.5F, 1F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882
		bodyModel[95].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883
		bodyModel[96].setRotationPoint(-25.5F, 2F, 6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 76, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[97].setRotationPoint(-38F, 1F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[98].setRotationPoint(9.25F, 0.25F, 8.5F);

		bodyModel[99].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[99].setRotationPoint(-1F, 1.5F, -11.25F);
		bodyModel[99].rotateAngleX = 1.57079633F;

		bodyModel[100].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[100].setRotationPoint(-1F, 1.5F, 11.25F);
		bodyModel[100].rotateAngleX = -1.57079633F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[101].setRotationPoint(-42.75F, -1F, -5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[102].setRotationPoint(-42.75F, -1F, 3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[103].setRotationPoint(41.75F, -1F, -5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[104].setRotationPoint(41.75F, -1F, 3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[105].setRotationPoint(-45F, 6F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[106].setRotationPoint(-45F, 6F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 405
		bodyModel[107].setRotationPoint(44F, 6F, 0F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 406
		bodyModel[108].setRotationPoint(44F, 6F, -10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 smol fuel tank
		bodyModel[109].setRotationPoint(-7F, 5F, -11F);

		bodyModel[110].addBox(0F, 0F, 0F, 14, 4, 16, 0F); // Box 414 smol fuel tank
		bodyModel[110].setRotationPoint(-7F, 5F, -8F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 14, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415 smol fuel tank
		bodyModel[111].setRotationPoint(-7F, 2F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 416 smol fuel tank
		bodyModel[112].setRotationPoint(-7F, 5F, 8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 296 cull fuel tank smol support
		bodyModel[113].setRotationPoint(-9F, 3F, -6F);

		bodyModel[114].addShapeBox(-2F, 0F, -12F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 296 cull fuel tank smol support
		bodyModel[114].setRotationPoint(7F, 3F, -6F);
		bodyModel[114].rotateAngleY = -3.14159265F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 engineroom oil drain small tank
		bodyModel[115].setRotationPoint(7F, 1.5F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[116].setRotationPoint(-36F, -13F, -7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 12, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F); // Box 279
		bodyModel[117].setRotationPoint(-39.5F, -13F, -6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 282
		bodyModel[118].setRotationPoint(-40.5F, -13F, -6F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 283
		bodyModel[119].setRotationPoint(-40.5F, -13F, 0F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 297
		bodyModel[120].setRotationPoint(-40.5F, -14.25F, -6F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 298
		bodyModel[121].setRotationPoint(-36F, -14.25F, -7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 299
		bodyModel[122].setRotationPoint(-36F, -14.25F, 0F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -1F, 0F, -0.5F, -1F, 1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 300
		bodyModel[123].setRotationPoint(-39.5F, -14.25F, -6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 1F, 0F, -1F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 1F, 0F, 0.25F, 0F); // Box 301
		bodyModel[124].setRotationPoint(-39.5F, -14.25F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 302
		bodyModel[125].setRotationPoint(-40.5F, -14.25F, 0F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull rachetbrake
		bodyModel[126].setRotationPoint(-34F, -12F, 6F);

		bodyModel[127].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 7
		bodyModel[127].setRotationPoint(-30F, -19F, -11F);

		bodyModel[128].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 24
		bodyModel[128].setRotationPoint(-30F, -19F, 10F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 28
		bodyModel[129].setRotationPoint(-19F, -19F, -11F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 30
		bodyModel[130].setRotationPoint(-31F, -19F, -7F);

		bodyModel[131].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[131].setRotationPoint(-30.5F, -19F, -10.5F);

		bodyModel[132].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[132].setRotationPoint(-18.5F, -19F, 10.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 13, 1, 14, 0F); // Box 266
		bodyModel[133].setRotationPoint(-31F, -22F, -7F);

		bodyModel[134].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[134].setRotationPoint(-30F, -22F, -11F);

		bodyModel[135].addShapeBox(-1F, 0F, 0F, 11, 1, 4, 0F,0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[135].setRotationPoint(-29F, -22F, -11F);

		bodyModel[136].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[136].setRotationPoint(-18F, -22F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[137].setRotationPoint(-30F, -20F, -11F);

		bodyModel[138].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[138].setRotationPoint(-30F, -22F, 7F);

		bodyModel[139].addShapeBox(-1F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, -1F); // Box 377
		bodyModel[139].setRotationPoint(-29F, -22F, 7F);

		bodyModel[140].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[140].setRotationPoint(-18F, -22F, 7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[141].setRotationPoint(-30F, -20F, 10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 162 cull
		bodyModel[142].setRotationPoint(-44F, -1F, -7.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.25F, 0F); // Box 163 cull
		bodyModel[143].setRotationPoint(-44F, -1F, -1.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F, 0F); // Box 164 cull
		bodyModel[144].setRotationPoint(-44F, -1F, 1.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[145].setRotationPoint(-32F, -21F, -2F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front
		bodyModel[146].setRotationPoint(-33F, -21.2F, -2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front
		bodyModel[147].setRotationPoint(-33F, -21.2F, 0F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 296
		bodyModel[148].setRotationPoint(-32.25F, -21.2F, -2F);

		bodyModel[149].addShapeBox(0F, 0F, -5.5F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 117 numberboard
		bodyModel[149].setRotationPoint(-32.2F, -21.37F, -2F);
		bodyModel[149].rotateAngleY = 0.09162979F;

		bodyModel[150].addShapeBox(0F, 0F, 0.5F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 118 numberboard
		bodyModel[150].setRotationPoint(-32.2F, -21.37F, 2F);
		bodyModel[150].rotateAngleY = -0.09162979F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[151].setRotationPoint(-32F, -21F, -7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 372
		bodyModel[152].setRotationPoint(-32F, -20F, -9.75F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 373
		bodyModel[153].setRotationPoint(-32F, -21F, -9.75F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 301 markerlight glow
		bodyModel[154].setRotationPoint(-31.7F, -20.5F, -9F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 344 markerlight glow
		bodyModel[155].setRotationPoint(-31.7F, -20.5F, 8F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 368
		bodyModel[156].setRotationPoint(-31F, -21F, -7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 419
		bodyModel[157].setRotationPoint(-32F, -21F, -7.75F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F); // Box 420
		bodyModel[158].setRotationPoint(-32F, -20F, 7.75F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 421
		bodyModel[159].setRotationPoint(-32F, -21F, 7.75F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 422
		bodyModel[160].setRotationPoint(-32F, -21F, 6.75F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 425
		bodyModel[161].setRotationPoint(-32F, -21F, 2F);

		bodyModel[162].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 96
		bodyModel[162].setRotationPoint(-18F, -22F, -7F);

		bodyModel[163].addShapeBox(0F, -1F, 0F, 21, 2, 11, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[163].setRotationPoint(17F, -22F, -11F);

		bodyModel[164].addBox(0F, -1F, 0F, 21, 2, 22, 0F); // Box 233
		bodyModel[164].setRotationPoint(17F, -20F, -11F);

		bodyModel[165].addShapeBox(0F, -1F, 0F, 21, 2, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[165].setRotationPoint(17F, -22F, 0F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 20, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[166].setRotationPoint(38F, -21F, -6F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 432
		bodyModel[167].setRotationPoint(-43.5F, -9F, -8F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 433
		bodyModel[168].setRotationPoint(-43.5F, -9F, 2F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[169].setRotationPoint(-44F, -9F, -2F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[170].setRotationPoint(-42F, -9F, -8F);
		bodyModel[170].rotateAngleY = -3.14159265F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[171].setRotationPoint(-42F, -9F, 9F);
		bodyModel[171].rotateAngleY = -3.14159265F;

		bodyModel[172].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 435
		bodyModel[172].setRotationPoint(-42F, -8F, -8F);
		bodyModel[172].rotateAngleY = 0.33161256F;

		bodyModel[173].addShapeBox(0F, 0F, -1F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[173].setRotationPoint(-42F, -8F, 8F);
		bodyModel[173].rotateAngleY = -0.33161256F;

		bodyModel[174].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 258
		bodyModel[174].setRotationPoint(-38F, -9F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[175].setRotationPoint(-36F, -9F, -11.01F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[176].setRotationPoint(-34F, -13F, -11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 326
		bodyModel[177].setRotationPoint(-39F, -9F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[178].setRotationPoint(-39.01F, -6F, -11.5F);

		bodyModel[179].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[179].setRotationPoint(-39.01F, -9F, -11F);

		bodyModel[180].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 246
		bodyModel[180].setRotationPoint(-38F, -9F, 11F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[181].setRotationPoint(-36F, -9F, 11.01F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[182].setRotationPoint(-34F, -13F, 11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 327
		bodyModel[183].setRotationPoint(-39F, -9F, 11F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 247
		bodyModel[184].setRotationPoint(-39.01F, -6F, 10.5F);

		bodyModel[185].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 248
		bodyModel[185].setRotationPoint(-39.01F, -9F, 9F);

		bodyModel[186].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18 late stack
		bodyModel[186].setRotationPoint(12F, -23.5F, -3F);

		bodyModel[187].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 21 late stack
		bodyModel[187].setRotationPoint(11.5F, -22.5F, -3.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME5-4
		bodyModel[188].setRotationPoint(-32F, -23.5F, -1F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME5-2
		bodyModel[189].setRotationPoint(-32F, -23.5F, -1F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME5-3
		bodyModel[190].setRotationPoint(-32F, -23.5F, -1F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME5-1
		bodyModel[191].setRotationPoint(-32F, -23.5F, -1F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[192].setRotationPoint(-32F, -23F, -1F);

		bodyModel[193].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[193].setRotationPoint(-29.5F, -23.75F, -4F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[194].setRotationPoint(-27F, -23F, 6F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[195].setRotationPoint(-27F, -23F, -6F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 20, 10, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -10F, -5F, 0F, -10F, -5F, 0F, 0F, -5F, 0F); // Box 261
		bodyModel[196].setRotationPoint(-18F, -21.5F, -7.01F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 20, 0, 11, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 467
		bodyModel[197].setRotationPoint(-18F, -22.01F, 1F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0.5F, 0F); // Box 292
		bodyModel[198].setRotationPoint(42F, -1F, -1.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 293
		bodyModel[199].setRotationPoint(42F, -1F, 1.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 294
		bodyModel[200].setRotationPoint(42F, -1F, -7.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 317 cull nose rails
		bodyModel[201].setRotationPoint(-39F, -13.8F, -5.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 318 cull nose rails
		bodyModel[202].setRotationPoint(-39F, -13.8F, 1.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 222 cull nose handrails
		bodyModel[203].setRotationPoint(-40F, -10.5F, -5.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224 cull nose handrails
		bodyModel[204].setRotationPoint(-40F, -10.5F, 1.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[205].setRotationPoint(-39.5F, -14F, -1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[206].setRotationPoint(-38.5F, -13.75F, 4F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[207].setRotationPoint(-38.5F, -13.75F, -5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[208].setRotationPoint(39.5F, -21F, -1F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear
		bodyModel[209].setRotationPoint(39F, -21.05F, -1F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear
		bodyModel[210].setRotationPoint(39F, -19.05F, -1F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318 sandcap top rear
		bodyModel[211].setRotationPoint(38.37F, -21.5F, -0.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 21, 1, 2, 0F); // Box 127
		bodyModel[212].setRotationPoint(17F, -19F, -8F);

		bodyModel[213].addBox(0F, 0F, 0F, 21, 1, 3, 0F); // Box 130
		bodyModel[213].setRotationPoint(17F, -19F, 5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[214].setRotationPoint(17F, -19F, -11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 136
		bodyModel[215].setRotationPoint(17F, -19F, 8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[216].setRotationPoint(26F, -18F, -8F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 277
		bodyModel[217].setRotationPoint(26F, -18F, 7F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[218].setRotationPoint(-35F, -5F, -11F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 210
		bodyModel[219].setRotationPoint(-35F, -3F, -10F);

		bodyModel[220].addShapeBox(-1F, 0F, 0F, 18, 10, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9F, -5F, 0F, -9F, -5F, 0F, 0F, -5F, 0F); // Box 415 intake
		bodyModel[220].setRotationPoint(-16.5F, -15.5F, -7.12F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 17, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[221].setRotationPoint(35F, -18F, -7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 3, 17, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 280
		bodyModel[222].setRotationPoint(35F, -18F, 5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 16, 20, 0, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -8F, -10F, 0F, -8F, -10F, 0F, 0F, -10F, 0F); // Box 281
		bodyModel[223].setRotationPoint(26F, -12.5F, -7.01F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[224].setRotationPoint(-39F, -1F, -10F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[225].setRotationPoint(-39F, 7F, 10F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[226].setRotationPoint(-39F, 7F, -11F);

		bodyModel[227].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[227].setRotationPoint(-42F, -1F, -8F);

		bodyModel[228].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 205
		bodyModel[228].setRotationPoint(-42F, 8F, -11F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[229].setRotationPoint(-39F, -1F, 7F);

		bodyModel[230].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[230].setRotationPoint(-42F, 6F, -9F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312 some scl units have these
		bodyModel[231].setRotationPoint(-40F, -1F, -10F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[232].setRotationPoint(38F, 7F, 10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[233].setRotationPoint(38F, 7F, -11F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[234].setRotationPoint(38F, -1F, -10F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[235].setRotationPoint(38F, -1F, 7F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[236].setRotationPoint(44F, -9F, -2F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 292
		bodyModel[237].setRotationPoint(43.5F, -9F, 2F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 294
		bodyModel[238].setRotationPoint(42F, -9F, 9F);
		bodyModel[238].rotateAngleY = -3.14159265F;

		bodyModel[239].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 295
		bodyModel[239].setRotationPoint(43.5F, -9F, -8F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 297
		bodyModel[240].setRotationPoint(42F, -9F, -8F);
		bodyModel[240].rotateAngleY = -3.14159265F;

		bodyModel[241].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 298
		bodyModel[241].setRotationPoint(42F, -8F, -8F);
		bodyModel[241].rotateAngleY = -0.33161256F;

		bodyModel[242].addShapeBox(0F, 0F, -1F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[242].setRotationPoint(42F, -8F, 8F);
		bodyModel[242].rotateAngleY = 0.33161256F;

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[243].setRotationPoint(-23F, -24.75F, 0F);

		bodyModel[244].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 282 antenna plate cull
		bodyModel[244].setRotationPoint(-24F, -23.75F, -2.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[245].setRotationPoint(-3F, -23.5F, -0.5F);

		bodyModel[246].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[246].setRotationPoint(-4F, -23.5F, -1.5F);

		bodyModel[247].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[247].setRotationPoint(-5F, -23.5F, 0.5F);

		bodyModel[248].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 361
		bodyModel[248].setRotationPoint(-3F, -22.5F, -0.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box cull
		bodyModel[249].setRotationPoint(-32F, -22F, -1F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[250].setRotationPoint(-29.5F, -22F, 7F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[251].setRotationPoint(-29F, -23.5F, 7.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[252].setRotationPoint(-29F, -23F, 7.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[253].setRotationPoint(-29F, -23.5F, 7.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[254].setRotationPoint(-29F, -23.5F, 7.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[255].setRotationPoint(-29F, -23.5F, 7.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[256].setRotationPoint(6F, -22.75F, -7.5F);

		bodyModel[257].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[257].setRotationPoint(4F, -23F, -6.5F);

		bodyModel[258].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[258].setRotationPoint(5F, -22.75F, -5.5F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 418
		bodyModel[259].setRotationPoint(6.5F, -22F, -6.5F);

		bodyModel[260].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[260].setRotationPoint(-24.5F, -23.5F, 8F);

		bodyModel[261].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[261].setRotationPoint(-24.5F, -23.5F, -8F);

		bodyModel[262].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[262].setRotationPoint(-25F, -22.5F, 6.5F);

		bodyModel[263].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[263].setRotationPoint(-25F, -22.5F, -9.5F);

		bodyModel[264].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 354
		bodyModel[264].setRotationPoint(-40.4F, -13.5F, -2F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 353 headlight nose
		bodyModel[265].setRotationPoint(-41.1F, -13.5F, -2F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 352 headlight nose
		bodyModel[266].setRotationPoint(-41.1F, -13.5F, 0F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361 cull horn mount
		bodyModel[267].setRotationPoint(38F, -22.25F, 1F);

		bodyModel[268].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[268].setRotationPoint(38F, -23.25F, 0.5F);

		bodyModel[269].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[269].setRotationPoint(38F, -23.25F, 2.5F);

		bodyModel[270].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[270].setRotationPoint(37F, -23.25F, 1.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 395
		bodyModel[271].setRotationPoint(-42F, 5.5F, -10F);

		bodyModel[272].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 394
		bodyModel[272].setRotationPoint(-42F, 4.5F, -8F);

		bodyModel[273].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[273].setRotationPoint(-42F, 2F, -8F);

		bodyModel[274].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[274].setRotationPoint(-42F, 3F, -10F);

		bodyModel[275].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[275].setRotationPoint(-42F, 1F, -9F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[276].setRotationPoint(39F, -1F, -10F);

		bodyModel[277].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 322
		bodyModel[277].setRotationPoint(39F, -1F, -8F);

		bodyModel[278].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 323
		bodyModel[278].setRotationPoint(39F, 1F, -9F);

		bodyModel[279].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 324
		bodyModel[279].setRotationPoint(39F, 3F, -10F);

		bodyModel[280].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 325
		bodyModel[280].setRotationPoint(39F, 2F, -8F);

		bodyModel[281].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 326
		bodyModel[281].setRotationPoint(39F, 5.5F, -10F);

		bodyModel[282].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 327
		bodyModel[282].setRotationPoint(39F, 4.5F, -8F);

		bodyModel[283].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 328
		bodyModel[283].setRotationPoint(39F, 6F, -9F);

		bodyModel[284].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 329
		bodyModel[284].setRotationPoint(39F, 8F, -11F);

		bodyModel[285].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 339
		bodyModel[285].setRotationPoint(-42F, -1F, 7F);

		bodyModel[286].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 340
		bodyModel[286].setRotationPoint(-42F, 8F, 9F);

		bodyModel[287].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 341
		bodyModel[287].setRotationPoint(-42F, 6F, 9F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 342
		bodyModel[288].setRotationPoint(-40F, -1F, 8F);

		bodyModel[289].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 343
		bodyModel[289].setRotationPoint(-42F, 5.5F, 8F);

		bodyModel[290].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 344
		bodyModel[290].setRotationPoint(-42F, 4.5F, 8F);

		bodyModel[291].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 345
		bodyModel[291].setRotationPoint(-42F, 2F, 8F);

		bodyModel[292].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 346
		bodyModel[292].setRotationPoint(-42F, 3F, 8F);

		bodyModel[293].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 347
		bodyModel[293].setRotationPoint(-42F, 1F, 7F);

		bodyModel[294].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 348
		bodyModel[294].setRotationPoint(39F, -1F, 7F);

		bodyModel[295].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 349
		bodyModel[295].setRotationPoint(39F, 8F, 9F);

		bodyModel[296].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 350
		bodyModel[296].setRotationPoint(39F, 6F, 9F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[297].setRotationPoint(39F, -1F, 8F);

		bodyModel[298].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 352
		bodyModel[298].setRotationPoint(39F, 5.5F, 8F);

		bodyModel[299].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 353
		bodyModel[299].setRotationPoint(39F, 4.5F, 8F);

		bodyModel[300].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 354
		bodyModel[300].setRotationPoint(39F, 2F, 8F);

		bodyModel[301].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 355
		bodyModel[301].setRotationPoint(39F, 3F, 8F);

		bodyModel[302].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 356
		bodyModel[302].setRotationPoint(39F, 1F, 7F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 aww
		bodyModel[303].setRotationPoint(-27F, -18F, 10F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 362 cull allweather
		bodyModel[304].setRotationPoint(-27F, -17F, 10F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[305].setRotationPoint(-29F, -17.5F, 11F);
		bodyModel[305].rotateAngleX = 0.61086524F;

		bodyModel[306].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[306].setRotationPoint(-29F, -17.5F, -11F);
		bodyModel[306].rotateAngleX = -0.61086524F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361 aww
		bodyModel[307].setRotationPoint(-27F, -18F, -13F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362 cull allweather
		bodyModel[308].setRotationPoint(-27F, -17F, -15F);

		bodyModel[309].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[309].setRotationPoint(-11F, 2.5F, -10F);
		bodyModel[309].rotateAngleY = -0.78539816F;

		bodyModel[310].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484 cull
		bodyModel[310].setRotationPoint(-12.5F, 1.5F, -10.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[311].setRotationPoint(-32F, -23.5F, -0.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[312].setRotationPoint(-32F, -22.5F, -0.5F);

		bodyModel[313].addShapeBox(0F, 0F, -10F, 24, 1, 19, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -9.4F, 0F, 0F, -9.4F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -9.4F, 0F, 0F, -9.4F); // Box 345
		bodyModel[313].setRotationPoint(21.5F, -22.45F, -1F);
		bodyModel[313].rotateAngleX = 0.13613568F;

		bodyModel[314].addShapeBox(0F, 0F, -9F, 24, 1, 19, 0F,0F, 0F, -9.4F, -12F, 0F, -9.4F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.4F, -12F, 0F, -9.4F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[314].setRotationPoint(21.5F, -22.45F, 1F);
		bodyModel[314].rotateAngleX = -0.13613568F;

		bodyModel[315].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[315].setRotationPoint(-35.5F, -10.5F, 6.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[316].setRotationPoint(-37.5F, -12.5F, 7.5F);

		bodyModel[317].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[317].setRotationPoint(-33F, -9.5F, 6F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[318].setRotationPoint(-33.5F, -11.5F, 6F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -5.125F, 0.125F, -0.125F, -5.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -5.125F, 0.125F, -5.125F, -5.125F); // Box 431 backpannel bulgy bit
		bodyModel[319].setRotationPoint(-20F, -19.5F, 0.5F);

		bodyModel[320].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 530 not a fridge
		bodyModel[320].setRotationPoint(-20F, -21F, -6F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 412 cab signalling glowey
		bodyModel[321].setRotationPoint(-30F, -20F, -0.5F);
		bodyModel[321].rotateAngleY = 0.43633231F;

		bodyModel[322].addShapeBox(0F, 0F, -2F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[322].setRotationPoint(-30F, -18F, 7.5F);
		//bodyModel[322].rotateAngleY = 0.17453293F;

		bodyModel[323].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[323].setRotationPoint(-30.5F, -9F, 3F);
		bodyModel[323].rotateAngleY = -0.45378561F;

		bodyModel[324].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[324].setRotationPoint(-30.5F, -15F, 3F);
		bodyModel[324].rotateAngleY = -0.45378561F;

		bodyModel[325].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[325].setRotationPoint(-30.5F, -13F, 3F);
		bodyModel[325].rotateAngleY = -0.45378561F;

		bodyModel[326].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[326].setRotationPoint(-23.8F, -15F, 1F);

		bodyModel[327].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 348
		bodyModel[327].setRotationPoint(-19F, -21F, -7F);

		bodyModel[328].addBox(-1F, 0F, -4.5F, 1, 2, 4, 0F); // Box 395 numberboard
		bodyModel[328].setRotationPoint(38.05F, -17F, 6F);
		bodyModel[328].rotateAngleY = 0.29670597F;

		bodyModel[329].addShapeBox(-1F, 0F, 0.5F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393 numberboard
		bodyModel[329].setRotationPoint(38.05F, -17F, -6F);
		bodyModel[329].rotateAngleY = -0.29670597F;

		bodyModel[330].addShapeBox(-1F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 219 sandcap
		bodyModel[330].setRotationPoint(37.5F, -15F, -1F);
		bodyModel[330].rotateAngleZ = 0.78539816F;

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box cull sandcap housing
		bodyModel[331].setRotationPoint(36.5F, -17F, -1F);

		bodyModel[332].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 354
		bodyModel[332].setRotationPoint(18.5F, -16.5F, -7.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 16, 20, 0, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -8F, -10F, 0F, -8F, -10F, 0F, 0F, -10F, 0F); // Box 356
		bodyModel[333].setRotationPoint(26F, -12.5F, 7.01F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 357
		bodyModel[334].setRotationPoint(-29.5F, -22.24F, -4F);

		bodyModel[335].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 399
		bodyModel[335].setRotationPoint(37.5F, -19.25F, 6.75F);

		bodyModel[336].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 398
		bodyModel[336].setRotationPoint(37.5F, -19.25F, -7.75F);

		bodyModel[337].addBox(0F, 0F, 0F, 3, 8, 0, 0F); // Box 461 nose stairs hand rail inside your ass
		bodyModel[337].setRotationPoint(-30F, -13F, -3.5F);

		bodyModel[338].addShapeBox(-0.25F, 0F, -2.25F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 349 markerlight glow
		bodyModel[338].setRotationPoint(38.15F, -14F, -3.5F);
		bodyModel[338].rotateAngleY = -0.34906585F;

		bodyModel[339].addShapeBox(0F, 0F, 0.25F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 348 glow markerlight
		bodyModel[339].setRotationPoint(37.9F, -14F, 3.5F);
		bodyModel[339].rotateAngleY = 0.34906585F;

		bodyModel[340].addShapeBox(0F, 0F, 0F, 25, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[340].setRotationPoint(-34F, -5F, -11F);

		bodyModel[341].addBox(0F, 0F, 0F, 9, 5, 4, 0F); // Box 358
		bodyModel[341].setRotationPoint(-18F, -10F, -11F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 7, 1, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[342].setRotationPoint(-8F, -22F, -7F);

		bodyModel[343].addBox(0F, 0F, 0F, 19, 1, 2, 0F); // Box 360
		bodyModel[343].setRotationPoint(18F, -22.55F, -1F);

		bodyModel[344].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 361
		bodyModel[344].setRotationPoint(-13.5F, -20F, 7.01F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310 cull fueltank support
		bodyModel[345].setRotationPoint(9F, 3F, -6F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 311 cull fueltank support
		bodyModel[346].setRotationPoint(-12F, 3F, -6F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 364 cull fueltank support
		bodyModel[347].setRotationPoint(-11F, 3F, -5F);

		bodyModel[348].addShapeBox(-2F, 0F, -12F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 365 cull fueltank support
		bodyModel[348].setRotationPoint(9F, 3F, -7F);
		bodyModel[348].rotateAngleY = -3.14159265F;

		bodyModel[349].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 525
		bodyModel[349].setRotationPoint(-33.25F, -23.75F, 0.5F);

		bodyModel[350].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 433
		bodyModel[350].setRotationPoint(-31.5F, -24F, -0.5F);

		bodyModel[351].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 434
		bodyModel[351].setRotationPoint(-31.5F, -23F, -0.5F);

		bodyModel[352].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 436
		bodyModel[352].setRotationPoint(-33.25F, -23.75F, -1.5F);

		bodyModel[353].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 353
		bodyModel[353].setRotationPoint(-3.5F, -22F, -6.5F);

		bodyModel[354].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[354].setRotationPoint(-5.25F, -22.75F, -5.5F);

		bodyModel[355].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[355].setRotationPoint(-3.5F, -23F, -6.5F);

		bodyModel[356].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[356].setRotationPoint(-5.25F, -22.75F, -7.5F);
	}
	ModelFB2_new theTrucks2 = new ModelFB2_new();
	ModelBlombergBnew theTrucks3 = new ModelBlombergBnew();
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 1478) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 223 ||GetColor(entity) == 1823){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 643 ||GetColor(entity) == 2900){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 299){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}