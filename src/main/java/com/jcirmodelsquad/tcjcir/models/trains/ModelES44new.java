//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Dash9_AC4400
// Model Creator: Bidahochi
// Created on: 06.06.2021 - 08:36:38
// Last changed on: 06.06.2021 - 08:36:38

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Modelge_hiad;
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

public class ModelES44new extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelES44new() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[438];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 165, 149, textureX, textureY, "cull"); // Box 0 culll frame
		bodyModel[1] = new ModelRendererTurbo(this, 325, 181, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 49, 134, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 427, 188, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 170, 141, textureX, textureY); // Box 156
		bodyModel[5] = new ModelRendererTurbo(this, 46, 153, textureX, textureY); // Box 61
		bodyModel[6] = new ModelRendererTurbo(this, 90, 153, textureX, textureY); // Box 63
		bodyModel[7] = new ModelRendererTurbo(this, 74, 131, textureX, textureY); // Box 80
		bodyModel[8] = new ModelRendererTurbo(this, 396, 213, textureX, textureY); // Box 19
		bodyModel[9] = new ModelRendererTurbo(this, 73, 197, textureX, textureY); // Box 440
		bodyModel[10] = new ModelRendererTurbo(this, 73, 197, textureX, textureY); // Box 441
		bodyModel[11] = new ModelRendererTurbo(this, 413, 221, textureX, textureY); // Box 19
		bodyModel[12] = new ModelRendererTurbo(this, 413, 221, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 1, 192, textureX, textureY); // Box 193
		bodyModel[14] = new ModelRendererTurbo(this, 267, 198, textureX, textureY); // Box 318
		bodyModel[15] = new ModelRendererTurbo(this, 88, 163, textureX, textureY); // Box 321
		bodyModel[16] = new ModelRendererTurbo(this, 49, 139, textureX, textureY); // Box 299
		bodyModel[17] = new ModelRendererTurbo(this, 298, 201, textureX, textureY); // Box 322
		bodyModel[18] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 96
		bodyModel[19] = new ModelRendererTurbo(this, 252, 75, textureX, textureY); // Box 97
		bodyModel[20] = new ModelRendererTurbo(this, 464, 76, textureX, textureY); // Box 124
		bodyModel[21] = new ModelRendererTurbo(this, 445, 76, textureX, textureY); // Box 130
		bodyModel[22] = new ModelRendererTurbo(this, 428, 83, textureX, textureY); // Box 131
		bodyModel[23] = new ModelRendererTurbo(this, 310, 57, textureX, textureY); // Box 2 this was EXHAUSTING to make haha
		bodyModel[24] = new ModelRendererTurbo(this, 331, 69, textureX, textureY); // Box 97
		bodyModel[25] = new ModelRendererTurbo(this, 331, 55, textureX, textureY); // Box 97
		bodyModel[26] = new ModelRendererTurbo(this, 329, 61, textureX, textureY); // Box 97
		bodyModel[27] = new ModelRendererTurbo(this, 382, 43, textureX, textureY); // Box 219
		bodyModel[28] = new ModelRendererTurbo(this, 437, 106, textureX, textureY); // Box 247 Support for Rear Vertical  HL
		bodyModel[29] = new ModelRendererTurbo(this, 430, 108, textureX, textureY, "lamp"); // Box 247 headlight rear Vertical
		bodyModel[30] = new ModelRendererTurbo(this, 430, 108, textureX, textureY, "lamp"); // Box 247 headlight rear Vertical
		bodyModel[31] = new ModelRendererTurbo(this, 477, 26, textureX, textureY); // Box 119
		bodyModel[32] = new ModelRendererTurbo(this, 287, 4, textureX, textureY); // Box 233
		bodyModel[33] = new ModelRendererTurbo(this, 14, 185, textureX, textureY); // Box 4
		bodyModel[34] = new ModelRendererTurbo(this, 1, 183, textureX, textureY); // Box 2
		bodyModel[35] = new ModelRendererTurbo(this, 1, 183, textureX, textureY); // Box 211
		bodyModel[36] = new ModelRendererTurbo(this, 14, 185, textureX, textureY); // Box 212
		bodyModel[37] = new ModelRendererTurbo(this, 76, 146, textureX, textureY, "cull"); // Box 162 cull
		bodyModel[38] = new ModelRendererTurbo(this, 63, 148, textureX, textureY, "cull"); // Box 163 cull
		bodyModel[39] = new ModelRendererTurbo(this, 46, 146, textureX, textureY, "cull"); // Box 164 cull
		bodyModel[40] = new ModelRendererTurbo(this, 200, 100, textureX, textureY); // Box 138
		bodyModel[41] = new ModelRendererTurbo(this, 239, 102, textureX, textureY, "cull"); // Box 138 cull
		bodyModel[42] = new ModelRendererTurbo(this, 51, 146, textureX, textureY); // Box 21
		bodyModel[43] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 284
		bodyModel[44] = new ModelRendererTurbo(this, 52, 131, textureX, textureY); // Box 307
		bodyModel[45] = new ModelRendererTurbo(this, 65, 133, textureX, textureY); // Box 308
		bodyModel[46] = new ModelRendererTurbo(this, 49, 136, textureX, textureY); // Box 310
		bodyModel[47] = new ModelRendererTurbo(this, 186, 112, textureX, textureY); // Box 325
		bodyModel[48] = new ModelRendererTurbo(this, 146, 112, textureX, textureY); // Box 326
		bodyModel[49] = new ModelRendererTurbo(this, 177, 112, textureX, textureY); // Box 328
		bodyModel[50] = new ModelRendererTurbo(this, 284, 120, textureX, textureY); // Box 281
		bodyModel[51] = new ModelRendererTurbo(this, 287, 110, textureX, textureY); // Box 282
		bodyModel[52] = new ModelRendererTurbo(this, 386, 43, textureX, textureY, "lamp"); // Box 393 numberboard
		bodyModel[53] = new ModelRendererTurbo(this, 432, 63, textureX, textureY); // Box 394
		bodyModel[54] = new ModelRendererTurbo(this, 386, 43, textureX, textureY, "lamp"); // Box 395 numberboard
		bodyModel[55] = new ModelRendererTurbo(this, 391, 35, textureX, textureY); // Box 398
		bodyModel[56] = new ModelRendererTurbo(this, 391, 35, textureX, textureY); // Box 399
		bodyModel[57] = new ModelRendererTurbo(this, 9, 141, textureX, textureY); // Box 252
		bodyModel[58] = new ModelRendererTurbo(this, 9, 136, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f u
		bodyModel[59] = new ModelRendererTurbo(this, 27, 130, textureX, textureY, "cull"); // Box 444 cull
		bodyModel[60] = new ModelRendererTurbo(this, 9, 136, textureX, textureY, BoxName.ditch); // Box 446 ditchlight f u
		bodyModel[61] = new ModelRendererTurbo(this, 9, 141, textureX, textureY); // Box 447
		bodyModel[62] = new ModelRendererTurbo(this, 341, 47, textureX, textureY); // Box 354
		bodyModel[63] = new ModelRendererTurbo(this, 343, 44, textureX, textureY); // Box 355
		bodyModel[64] = new ModelRendererTurbo(this, 343, 50, textureX, textureY); // Box 356
		bodyModel[65] = new ModelRendererTurbo(this, 352, 47, textureX, textureY); // Box 357
		bodyModel[66] = new ModelRendererTurbo(this, 353, 116, textureX, textureY); // Box 435 AC intake A
		bodyModel[67] = new ModelRendererTurbo(this, 336, 44, textureX, textureY); // Box 443
		bodyModel[68] = new ModelRendererTurbo(this, 336, 50, textureX, textureY); // Box 444
		bodyModel[69] = new ModelRendererTurbo(this, 302, 134, textureX, textureY); // Box 282
		bodyModel[70] = new ModelRendererTurbo(this, 348, 134, textureX, textureY); // Box 283
		bodyModel[71] = new ModelRendererTurbo(this, 315, 132, textureX, textureY); // Box 4
		bodyModel[72] = new ModelRendererTurbo(this, 328, 131, textureX, textureY); // Box 448
		bodyModel[73] = new ModelRendererTurbo(this, 16, 141, textureX, textureY); // Box 314
		bodyModel[74] = new ModelRendererTurbo(this, 16, 136, textureX, textureY, BoxName.ditch); // Box 315 ditchlight r
		bodyModel[75] = new ModelRendererTurbo(this, 16, 141, textureX, textureY); // Box 318
		bodyModel[76] = new ModelRendererTurbo(this, 16, 136, textureX, textureY, BoxName.ditch); // Box 319 ditchlight r
		bodyModel[77] = new ModelRendererTurbo(this, 361, 132, textureX, textureY); // Box 322
		bodyModel[78] = new ModelRendererTurbo(this, 374, 131, textureX, textureY); // Box 323
		bodyModel[79] = new ModelRendererTurbo(this, 339, 129, textureX, textureY); // Box 280
		bodyModel[80] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 285
		bodyModel[81] = new ModelRendererTurbo(this, 460, 192, textureX, textureY); // Box 434
		bodyModel[82] = new ModelRendererTurbo(this, 332, 158, textureX, textureY); // Box 435
		bodyModel[83] = new ModelRendererTurbo(this, 28, 72, textureX, textureY); // Box 94
		bodyModel[84] = new ModelRendererTurbo(this, 129, 47, textureX, textureY); // Box 100
		bodyModel[85] = new ModelRendererTurbo(this, 104, 70, textureX, textureY); // Box 112
		bodyModel[86] = new ModelRendererTurbo(this, 179, 62, textureX, textureY); // Box 120
		bodyModel[87] = new ModelRendererTurbo(this, 47, 73, textureX, textureY); // Box 1
		bodyModel[88] = new ModelRendererTurbo(this, 205, 66, textureX, textureY); // Box 99
		bodyModel[89] = new ModelRendererTurbo(this, 96, 66, textureX, textureY); // Box 135
		bodyModel[90] = new ModelRendererTurbo(this, 127, 27, textureX, textureY); // Box 123
		bodyModel[91] = new ModelRendererTurbo(this, 42, 44, textureX, textureY); // Box 150
		bodyModel[92] = new ModelRendererTurbo(this, 4, 44, textureX, textureY); // Box 152
		bodyModel[93] = new ModelRendererTurbo(this, 4, 58, textureX, textureY); // Box 153
		bodyModel[94] = new ModelRendererTurbo(this, 42, 58, textureX, textureY); // Box 154
		bodyModel[95] = new ModelRendererTurbo(this, 108, 62, textureX, textureY); // Box 119
		bodyModel[96] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 120
		bodyModel[97] = new ModelRendererTurbo(this, 179, 70, textureX, textureY); // Box 121
		bodyModel[98] = new ModelRendererTurbo(this, 81, 61, textureX, textureY); // Box 69 schnozz door
		bodyModel[99] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 94 schnozz door
		bodyModel[100] = new ModelRendererTurbo(this, 89, 61, textureX, textureY); // Box 95 schnozz door
		bodyModel[101] = new ModelRendererTurbo(this, 216, 16, textureX, textureY); // Box 21
		bodyModel[102] = new ModelRendererTurbo(this, 141, 30, textureX, textureY); // Box 172
		bodyModel[103] = new ModelRendererTurbo(this, 36, 83, textureX, textureY); // Box 177
		bodyModel[104] = new ModelRendererTurbo(this, 168, 61, textureX, textureY); // Box 314 door swing right
		bodyModel[105] = new ModelRendererTurbo(this, 149, 27, textureX, textureY, "lamp"); // Box 242 numberboard top
		bodyModel[106] = new ModelRendererTurbo(this, 52, 81, textureX, textureY); // Box 210
		bodyModel[107] = new ModelRendererTurbo(this, 36, 76, textureX, textureY); // Box 122
		bodyModel[108] = new ModelRendererTurbo(this, 29, 78, textureX, textureY, "lamp"); // Box 154 headlight nose
		bodyModel[109] = new ModelRendererTurbo(this, 29, 78, textureX, textureY, "lamp"); // Box 155 headlight nose
		bodyModel[110] = new ModelRendererTurbo(this, 200, 62, textureX, textureY); // Box 397
		bodyModel[111] = new ModelRendererTurbo(this, 43, 62, textureX, textureY); // Box 351 sandcap
		bodyModel[112] = new ModelRendererTurbo(this, 31, 62, textureX, textureY); // Box 399 sandcap
		bodyModel[113] = new ModelRendererTurbo(this, 32, 66, textureX, textureY); // Box 253
		bodyModel[114] = new ModelRendererTurbo(this, 128, 11, textureX, textureY); // Box 267
		bodyModel[115] = new ModelRendererTurbo(this, 189, 16, textureX, textureY); // Box 269
		bodyModel[116] = new ModelRendererTurbo(this, 27, 7, textureX, textureY); // Box 272
		bodyModel[117] = new ModelRendererTurbo(this, 42, 9, textureX, textureY); // Box 273
		bodyModel[118] = new ModelRendererTurbo(this, 14, 9, textureX, textureY); // Box 274
		bodyModel[119] = new ModelRendererTurbo(this, 55, 10, textureX, textureY); // Box 275
		bodyModel[120] = new ModelRendererTurbo(this, 37, 97, textureX, textureY, "lamp"); // Box 396 glow marker
		bodyModel[121] = new ModelRendererTurbo(this, 37, 97, textureX, textureY, "lamp"); // Box 396 glow marker
		bodyModel[122] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 284
		bodyModel[123] = new ModelRendererTurbo(this, 4, 30, textureX, textureY); // Box 285
		bodyModel[124] = new ModelRendererTurbo(this, 20, 34, textureX, textureY); // Box 286
		bodyModel[125] = new ModelRendererTurbo(this, 16, 23, textureX, textureY); // Box 287
		bodyModel[126] = new ModelRendererTurbo(this, 4, 101, textureX, textureY); // Box 232 Cool it!
		bodyModel[127] = new ModelRendererTurbo(this, 114, 34, textureX, textureY); // Box 233
		bodyModel[128] = new ModelRendererTurbo(this, 114, 30, textureX, textureY); // Box 234
		bodyModel[129] = new ModelRendererTurbo(this, 114, 32, textureX, textureY); // Box 235
		bodyModel[130] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 137
		bodyModel[131] = new ModelRendererTurbo(this, 29, 96, textureX, textureY); // Box 131
		bodyModel[132] = new ModelRendererTurbo(this, 69, 40, textureX, textureY); // Box 216
		bodyModel[133] = new ModelRendererTurbo(this, 84, 36, textureX, textureY); // Box 217
		bodyModel[134] = new ModelRendererTurbo(this, 80, 6, textureX, textureY); // Box 281 ES44 Modern Control Stand Side
		bodyModel[135] = new ModelRendererTurbo(this, 27, 96, textureX, textureY, "lamp"); // Box 239 numberboard nose
		bodyModel[136] = new ModelRendererTurbo(this, 27, 96, textureX, textureY, "lamp"); // Box 240 numberboard nose
		bodyModel[137] = new ModelRendererTurbo(this, 139, 48, textureX, textureY); // Box 114
		bodyModel[138] = new ModelRendererTurbo(this, 139, 45, textureX, textureY); // Box 74
		bodyModel[139] = new ModelRendererTurbo(this, 139, 51, textureX, textureY); // Box 78
		bodyModel[140] = new ModelRendererTurbo(this, 126, 45, textureX, textureY, "cull"); // Box 481 Cull
		bodyModel[141] = new ModelRendererTurbo(this, 38, 96, textureX, textureY); // Box 227
		bodyModel[142] = new ModelRendererTurbo(this, 38, 96, textureX, textureY); // Box 228
		bodyModel[143] = new ModelRendererTurbo(this, 399, 83, textureX, textureY); // Box 276
		bodyModel[144] = new ModelRendererTurbo(this, 402, 80, textureX, textureY); // Box 277
		bodyModel[145] = new ModelRendererTurbo(this, 111, 42, textureX, textureY); // Box 352 cabmount assembly
		bodyModel[146] = new ModelRendererTurbo(this, 114, 49, textureX, textureY, "lamp"); // Box 353 headlight high
		bodyModel[147] = new ModelRendererTurbo(this, 114, 49, textureX, textureY, "lamp"); // Box 354 headlight high
		bodyModel[148] = new ModelRendererTurbo(this, 111, 9, textureX, textureY); // Box 288
		bodyModel[149] = new ModelRendererTurbo(this, 47, 76, textureX, textureY); // Box 312 nose cover
		bodyModel[150] = new ModelRendererTurbo(this, 308, 66, textureX, textureY); // Box 314
		bodyModel[151] = new ModelRendererTurbo(this, 48, 163, textureX, textureY); // Box 301
		bodyModel[152] = new ModelRendererTurbo(this, 1, 203, textureX, textureY); // Box 23
		bodyModel[153] = new ModelRendererTurbo(this, 1, 220, textureX, textureY); // Box 63
		bodyModel[154] = new ModelRendererTurbo(this, 17, 150, textureX, textureY); // Box 312
		bodyModel[155] = new ModelRendererTurbo(this, 225, 156, textureX, textureY, "cull"); // Box 295 culll frame
		bodyModel[156] = new ModelRendererTurbo(this, 165, 170, textureX, textureY, "cull"); // Box 296 culll frame
		bodyModel[157] = new ModelRendererTurbo(this, 398, 205, textureX, textureY); // Box 450
		bodyModel[158] = new ModelRendererTurbo(this, 331, 210, textureX, textureY); // Box 451
		bodyModel[159] = new ModelRendererTurbo(this, 345, 206, textureX, textureY); // Box 452
		bodyModel[160] = new ModelRendererTurbo(this, 345, 228, textureX, textureY); // Box 453
		bodyModel[161] = new ModelRendererTurbo(this, 398, 228, textureX, textureY); // Box 454
		bodyModel[162] = new ModelRendererTurbo(this, 164, 163, textureX, textureY, "cull"); // Box 459 cull frame
		bodyModel[163] = new ModelRendererTurbo(this, 149, 156, textureX, textureY); // Box 460
		bodyModel[164] = new ModelRendererTurbo(this, 47, 127, textureX, textureY); // Box 466
		bodyModel[165] = new ModelRendererTurbo(this, 50, 127, textureX, textureY); // Box 467
		bodyModel[166] = new ModelRendererTurbo(this, 92, 127, textureX, textureY); // Box 468
		bodyModel[167] = new ModelRendererTurbo(this, 87, 139, textureX, textureY); // Box 469
		bodyModel[168] = new ModelRendererTurbo(this, 87, 136, textureX, textureY); // Box 470
		bodyModel[169] = new ModelRendererTurbo(this, 86, 127, textureX, textureY); // Box 471
		bodyModel[170] = new ModelRendererTurbo(this, 89, 127, textureX, textureY); // Box 472
		bodyModel[171] = new ModelRendererTurbo(this, 44, 127, textureX, textureY); // Box 473
		bodyModel[172] = new ModelRendererTurbo(this, 111, 176, textureX, textureY); // Box 475
		bodyModel[173] = new ModelRendererTurbo(this, 22, 192, textureX, textureY); // Box 476
		bodyModel[174] = new ModelRendererTurbo(this, 157, 154, textureX, textureY); // Box 480
		bodyModel[175] = new ModelRendererTurbo(this, 83, 181, textureX, textureY); // Box 481
		bodyModel[176] = new ModelRendererTurbo(this, 83, 171, textureX, textureY); // Box 483
		bodyModel[177] = new ModelRendererTurbo(this, 3, 172, textureX, textureY); // Box 485
		bodyModel[178] = new ModelRendererTurbo(this, 5, 170, textureX, textureY); // Box 486
		bodyModel[179] = new ModelRendererTurbo(this, 3, 167, textureX, textureY); // Box 487
		bodyModel[180] = new ModelRendererTurbo(this, 5, 165, textureX, textureY); // Box 488
		bodyModel[181] = new ModelRendererTurbo(this, 3, 162, textureX, textureY); // Box 489
		bodyModel[182] = new ModelRendererTurbo(this, 5, 160, textureX, textureY); // Box 490
		bodyModel[183] = new ModelRendererTurbo(this, 3, 157, textureX, textureY); // Box 491
		bodyModel[184] = new ModelRendererTurbo(this, 5, 155, textureX, textureY); // Box 492
		bodyModel[185] = new ModelRendererTurbo(this, 3, 152, textureX, textureY); // Box 493
		bodyModel[186] = new ModelRendererTurbo(this, 4, 150, textureX, textureY); // Box 494
		bodyModel[187] = new ModelRendererTurbo(this, 398, 210, textureX, textureY); // Box 495
		bodyModel[188] = new ModelRendererTurbo(this, 398, 218, textureX, textureY); // Box 496
		bodyModel[189] = new ModelRendererTurbo(this, 398, 210, textureX, textureY); // Box 497
		bodyModel[190] = new ModelRendererTurbo(this, 396, 213, textureX, textureY); // Box 498
		bodyModel[191] = new ModelRendererTurbo(this, 398, 218, textureX, textureY); // Box 499
		bodyModel[192] = new ModelRendererTurbo(this, 206, 156, textureX, textureY, "cull"); // Box 500 cull frame
		bodyModel[193] = new ModelRendererTurbo(this, 172, 143, textureX, textureY); // Box 501
		bodyModel[194] = new ModelRendererTurbo(this, 201, 141, textureX, textureY); // Box 502
		bodyModel[195] = new ModelRendererTurbo(this, 134, 57, textureX, textureY); // box64
		bodyModel[196] = new ModelRendererTurbo(this, 134, 61, textureX, textureY); // box65
		bodyModel[197] = new ModelRendererTurbo(this, 153, 27, textureX, textureY); // Box 311
		bodyModel[198] = new ModelRendererTurbo(this, 189, 23, textureX, textureY); // Box 313
		bodyModel[199] = new ModelRendererTurbo(this, 216, 23, textureX, textureY); // Box 314
		bodyModel[200] = new ModelRendererTurbo(this, 103, 62, textureX, textureY); // Box 315
		bodyModel[201] = new ModelRendererTurbo(this, 3, 10, textureX, textureY); // Box 316
		bodyModel[202] = new ModelRendererTurbo(this, 141, 30, textureX, textureY); // Box 317
		bodyModel[203] = new ModelRendererTurbo(this, 149, 27, textureX, textureY, "lamp"); // Box 318 numerboard top
		bodyModel[204] = new ModelRendererTurbo(this, 167, 28, textureX, textureY); // Box 309
		bodyModel[205] = new ModelRendererTurbo(this, 178, 24, textureX, textureY); // Box 310
		bodyModel[206] = new ModelRendererTurbo(this, 121, 28, textureX, textureY); // Box 311
		bodyModel[207] = new ModelRendererTurbo(this, 178, 17, textureX, textureY); // Box 312
		bodyModel[208] = new ModelRendererTurbo(this, 181, 11, textureX, textureY); // Box 313
		bodyModel[209] = new ModelRendererTurbo(this, 190, 10, textureX, textureY); // Box 314
		bodyModel[210] = new ModelRendererTurbo(this, 215, 10, textureX, textureY); // Box 315
		bodyModel[211] = new ModelRendererTurbo(this, 190, 4, textureX, textureY); // Box 316
		bodyModel[212] = new ModelRendererTurbo(this, 181, 5, textureX, textureY); // Box 317
		bodyModel[213] = new ModelRendererTurbo(this, 215, 4, textureX, textureY); // Box 318
		bodyModel[214] = new ModelRendererTurbo(this, 35, 103, textureX, textureY, "lamp"); // Box 315 aussy markers
		bodyModel[215] = new ModelRendererTurbo(this, 42, 103, textureX, textureY, "lamp"); // Box 316 aussy markers
		bodyModel[216] = new ModelRendererTurbo(this, 99, 134, textureX, textureY); // Box 317
		bodyModel[217] = new ModelRendererTurbo(this, 140, 153, textureX, textureY); // Box 318
		bodyModel[218] = new ModelRendererTurbo(this, 96, 153, textureX, textureY); // Box 319
		bodyModel[219] = new ModelRendererTurbo(this, 101, 146, textureX, textureY); // Box 320
		bodyModel[220] = new ModelRendererTurbo(this, 138, 163, textureX, textureY); // Box 341
		bodyModel[221] = new ModelRendererTurbo(this, 98, 163, textureX, textureY); // Box 347
		bodyModel[222] = new ModelRendererTurbo(this, 149, 163, textureX, textureY); // Box 361
		bodyModel[223] = new ModelRendererTurbo(this, 84, 24, textureX, textureY); // Box 270
		bodyModel[224] = new ModelRendererTurbo(this, 84, 12, textureX, textureY); // Box 366
		bodyModel[225] = new ModelRendererTurbo(this, 52, 192, textureX, textureY); // Box 367
		bodyModel[226] = new ModelRendererTurbo(this, 37, 192, textureX, textureY); // Box 368
		bodyModel[227] = new ModelRendererTurbo(this, 291, 137, textureX, textureY); // Box 375
		bodyModel[228] = new ModelRendererTurbo(this, 294, 127, textureX, textureY); // Box 376
		bodyModel[229] = new ModelRendererTurbo(this, 113, 148, textureX, textureY, "cull"); // Box 377 cull
		bodyModel[230] = new ModelRendererTurbo(this, 126, 146, textureX, textureY, "cull"); // Box 378 cull
		bodyModel[231] = new ModelRendererTurbo(this, 96, 146, textureX, textureY, "cull"); // Box 379 cull
		bodyModel[232] = new ModelRendererTurbo(this, 115, 133, textureX, textureY); // Box 380
		bodyModel[233] = new ModelRendererTurbo(this, 102, 131, textureX, textureY); // Box 381
		bodyModel[234] = new ModelRendererTurbo(this, 99, 136, textureX, textureY); // Box 382
		bodyModel[235] = new ModelRendererTurbo(this, 99, 139, textureX, textureY); // Box 383
		bodyModel[236] = new ModelRendererTurbo(this, 137, 139, textureX, textureY); // Box 384
		bodyModel[237] = new ModelRendererTurbo(this, 137, 136, textureX, textureY); // Box 385
		bodyModel[238] = new ModelRendererTurbo(this, 124, 131, textureX, textureY); // Box 386
		bodyModel[239] = new ModelRendererTurbo(this, 103, 103, textureX, textureY); // Box 387
		bodyModel[240] = new ModelRendererTurbo(this, 115, 127, textureX, textureY); // Box 388
		bodyModel[241] = new ModelRendererTurbo(this, 121, 127, textureX, textureY); // Box 389
		bodyModel[242] = new ModelRendererTurbo(this, 420, 211, textureX, textureY); // Box 390
		bodyModel[243] = new ModelRendererTurbo(this, 420, 211, textureX, textureY); // Box 391
		bodyModel[244] = new ModelRendererTurbo(this, 420, 211, textureX, textureY); // Box 392
		bodyModel[245] = new ModelRendererTurbo(this, 420, 211, textureX, textureY); // Box 393
		bodyModel[246] = new ModelRendererTurbo(this, 298, 215, textureX, textureY); // Box 394
		bodyModel[247] = new ModelRendererTurbo(this, 298, 215, textureX, textureY); // Box 395
		bodyModel[248] = new ModelRendererTurbo(this, 240, 215, textureX, textureY); // Box 396
		bodyModel[249] = new ModelRendererTurbo(this, 240, 201, textureX, textureY); // Box 399
		bodyModel[250] = new ModelRendererTurbo(this, 209, 198, textureX, textureY); // Box 400
		bodyModel[251] = new ModelRendererTurbo(this, 240, 215, textureX, textureY); // Box 401
		bodyModel[252] = new ModelRendererTurbo(this, 124, 179, textureX, textureY, "cull"); // Box 402 lots of little pipes
		bodyModel[253] = new ModelRendererTurbo(this, 210, 208, textureX, textureY); // Box 403
		bodyModel[254] = new ModelRendererTurbo(this, 221, 206, textureX, textureY); // Box 404
		bodyModel[255] = new ModelRendererTurbo(this, 137, 188, textureX, textureY, "cull"); // Box 405 lots of little pipes 2
		bodyModel[256] = new ModelRendererTurbo(this, 279, 189, textureX, textureY, "cull"); // Box 406 lots of little pipes 2 a
		bodyModel[257] = new ModelRendererTurbo(this, 315, 184, textureX, textureY, "cull"); // Box 407 lot of little pipes 3a
		bodyModel[258] = new ModelRendererTurbo(this, 315, 184, textureX, textureY, "cull"); // Box 408 lot of little pipes 3b
		bodyModel[259] = new ModelRendererTurbo(this, 315, 184, textureX, textureY, "cull"); // Box 409 lot of little pipes 3c
		bodyModel[260] = new ModelRendererTurbo(this, 418, 210, textureX, textureY); // Box 61
		bodyModel[261] = new ModelRendererTurbo(this, 418, 210, textureX, textureY); // Box 62
		bodyModel[262] = new ModelRendererTurbo(this, 418, 210, textureX, textureY); // Box 412
		bodyModel[263] = new ModelRendererTurbo(this, 418, 210, textureX, textureY); // Box 413
		bodyModel[264] = new ModelRendererTurbo(this, 323, 116, textureX, textureY); // Box 435 AC intake A
		bodyModel[265] = new ModelRendererTurbo(this, 146, 121, textureX, textureY); // Box 418 Inverter Handrail
		bodyModel[266] = new ModelRendererTurbo(this, 236, 141, textureX, textureY); // Box 420 AC4400 EXTENDUS
		bodyModel[267] = new ModelRendererTurbo(this, 188, 30, textureX, textureY); // Box 421 INVERTER
		bodyModel[268] = new ModelRendererTurbo(this, 227, 30, textureX, textureY); // Box 422 AC4400 THING
		bodyModel[269] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 424 ac44 handrails
		bodyModel[270] = new ModelRendererTurbo(this, 179, 123, textureX, textureY); // Box 425 ac44 handrails
		bodyModel[271] = new ModelRendererTurbo(this, 243, 99, textureX, textureY); // Box 426 ac4400 super special step part
		bodyModel[272] = new ModelRendererTurbo(this, 92, 134, textureX, textureY); // Box 395
		bodyModel[273] = new ModelRendererTurbo(this, 92, 130, textureX, textureY); // Box 396
		bodyModel[274] = new ModelRendererTurbo(this, 44, 134, textureX, textureY); // Box 397
		bodyModel[275] = new ModelRendererTurbo(this, 44, 130, textureX, textureY); // Box 398
		bodyModel[276] = new ModelRendererTurbo(this, 83, 127, textureX, textureY); // Box 399
		bodyModel[277] = new ModelRendererTurbo(this, 74, 124, textureX, textureY); // Box 400
		bodyModel[278] = new ModelRendererTurbo(this, 53, 127, textureX, textureY); // Box 401
		bodyModel[279] = new ModelRendererTurbo(this, 56, 124, textureX, textureY); // Box 402
		bodyModel[280] = new ModelRendererTurbo(this, 124, 124, textureX, textureY); // Box 404
		bodyModel[281] = new ModelRendererTurbo(this, 133, 127, textureX, textureY); // Box 405
		bodyModel[282] = new ModelRendererTurbo(this, 106, 124, textureX, textureY); // Box 406
		bodyModel[283] = new ModelRendererTurbo(this, 103, 127, textureX, textureY); // Box 407
		bodyModel[284] = new ModelRendererTurbo(this, 32, 66, textureX, textureY); // Box 408
		bodyModel[285] = new ModelRendererTurbo(this, 36, 61, textureX, textureY); // Box 410
		bodyModel[286] = new ModelRendererTurbo(this, 4, 150, textureX, textureY); // Box 407
		bodyModel[287] = new ModelRendererTurbo(this, 17, 150, textureX, textureY); // Box 419
		bodyModel[288] = new ModelRendererTurbo(this, 430, 76, textureX, textureY); // Box 422 rear sanscap cover
		bodyModel[289] = new ModelRendererTurbo(this, 159, 51, textureX, textureY); // Box 114
		bodyModel[290] = new ModelRendererTurbo(this, 159, 48, textureX, textureY); // Box 74
		bodyModel[291] = new ModelRendererTurbo(this, 159, 54, textureX, textureY); // Box 78
		bodyModel[292] = new ModelRendererTurbo(this, 150, 59, textureX, textureY); // Box 136
		bodyModel[293] = new ModelRendererTurbo(this, 150, 48, textureX, textureY); // Box 287
		bodyModel[294] = new ModelRendererTurbo(this, 150, 52, textureX, textureY); // Box 288
		bodyModel[295] = new ModelRendererTurbo(this, 152, 56, textureX, textureY); // Box 289
		bodyModel[296] = new ModelRendererTurbo(this, 151, 45, textureX, textureY); // Box 430
		bodyModel[297] = new ModelRendererTurbo(this, 163, 143, textureX, textureY); // Box 431 csx cringe
		bodyModel[298] = new ModelRendererTurbo(this, 158, 140, textureX, textureY); // Box 432 csx cringe
		bodyModel[299] = new ModelRendererTurbo(this, 162, 59, textureX, textureY); // Box 350
		bodyModel[300] = new ModelRendererTurbo(this, 159, 59, textureX, textureY); // Box 351
		bodyModel[301] = new ModelRendererTurbo(this, 38, 162, textureX, textureY); // Box 435 WHY GE, JUST WHY
		bodyModel[302] = new ModelRendererTurbo(this, 38, 155, textureX, textureY); // Box 435 WHY GE, JUST WHY
		bodyModel[303] = new ModelRendererTurbo(this, 127, 147, textureX, textureY); // Box 437
		bodyModel[304] = new ModelRendererTurbo(this, 107, 147, textureX, textureY); // Box 438
		bodyModel[305] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 439 honse
		bodyModel[306] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 440 honse
		bodyModel[307] = new ModelRendererTurbo(this, 169, 49, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[308] = new ModelRendererTurbo(this, 169, 49, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[309] = new ModelRendererTurbo(this, 169, 49, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[310] = new ModelRendererTurbo(this, 169, 49, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[311] = new ModelRendererTurbo(this, 169, 53, textureX, textureY); // Box 428 PRIME BASE
		bodyModel[312] = new ModelRendererTurbo(this, 164, 54, textureX, textureY); // Box 409 commander base
		bodyModel[313] = new ModelRendererTurbo(this, 164, 50, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[314] = new ModelRendererTurbo(this, 372, 47, textureX, textureY); // Box 361
		bodyModel[315] = new ModelRendererTurbo(this, 363, 45, textureX, textureY); // Box 362
		bodyModel[316] = new ModelRendererTurbo(this, 365, 51, textureX, textureY); // Box 363
		bodyModel[317] = new ModelRendererTurbo(this, 365, 48, textureX, textureY); // Box 364
		bodyModel[318] = new ModelRendererTurbo(this, 93, 82, textureX, textureY); // Box 69 schnozz door
		bodyModel[319] = new ModelRendererTurbo(this, 106, 96, textureX, textureY); // Box 94 schnozz door
		bodyModel[320] = new ModelRendererTurbo(this, 106, 90, textureX, textureY); // Box 95 schnozz door
		bodyModel[321] = new ModelRendererTurbo(this, 106, 84, textureX, textureY); // Box 310 schnozz door
		bodyModel[322] = new ModelRendererTurbo(this, 77, 56, textureX, textureY); // Box 310 schnozz door
		bodyModel[323] = new ModelRendererTurbo(this, 27, 136, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[324] = new ModelRendererTurbo(this, 29, 162, textureX, textureY); // Box 435 WHY GE, JUST WHY
		bodyModel[325] = new ModelRendererTurbo(this, 29, 155, textureX, textureY); // Box 435 WHY GE, JUST WHY
		bodyModel[326] = new ModelRendererTurbo(this, 27, 136, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[327] = new ModelRendererTurbo(this, 27, 130, textureX, textureY, "cull"); // Box 444 cull
		bodyModel[328] = new ModelRendererTurbo(this, 9, 110, textureX, textureY); // Box 232
		bodyModel[329] = new ModelRendererTurbo(this, 2, 110, textureX, textureY); // Box 232 Why don't you locate some Bitches
		bodyModel[330] = new ModelRendererTurbo(this, 371, 57, textureX, textureY); // Box 233 ES44 goes bump in the night
		bodyModel[331] = new ModelRendererTurbo(this, 458, 106, textureX, textureY); // Box 247 Support for Rear Horizontal HL
		bodyModel[332] = new ModelRendererTurbo(this, 449, 108, textureX, textureY, "lamp"); // Box 247 headlight rear Horizontal
		bodyModel[333] = new ModelRendererTurbo(this, 449, 108, textureX, textureY, "lamp"); // Box 247 headlight rear Horizontal
		bodyModel[334] = new ModelRendererTurbo(this, 495, 58, textureX, textureY); // Box 131
		bodyModel[335] = new ModelRendererTurbo(this, 495, 49, textureX, textureY); // Box 131
		bodyModel[336] = new ModelRendererTurbo(this, 430, 70, textureX, textureY); // Box 422 rear sanscap cover
		bodyModel[337] = new ModelRendererTurbo(this, 408, 10, textureX, textureY); // Box 233 ECO-radiator
		bodyModel[338] = new ModelRendererTurbo(this, 408, 19, textureX, textureY); // Box 233 ECO-radiator
		bodyModel[339] = new ModelRendererTurbo(this, 372, 18, textureX, textureY); // Box 233 ECO-radiator
		bodyModel[340] = new ModelRendererTurbo(this, 449, 26, textureX, textureY); // Box 119
		bodyModel[341] = new ModelRendererTurbo(this, 478, 37, textureX, textureY); // Box 119
		bodyModel[342] = new ModelRendererTurbo(this, 450, 37, textureX, textureY); // Box 119
		bodyModel[343] = new ModelRendererTurbo(this, 451, 46, textureX, textureY); // Box 119 For some reason the Engineer side has this Notch
		bodyModel[344] = new ModelRendererTurbo(this, 462, 46, textureX, textureY); // Box 119 For some reason the Engineer side has this Notch
		bodyModel[345] = new ModelRendererTurbo(this, 1, 125, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[346] = new ModelRendererTurbo(this, 1, 120, textureX, textureY, "cull"); // Box 444 cull
		bodyModel[347] = new ModelRendererTurbo(this, 23, 118, textureX, textureY, "cull"); // Box 444 cull
		bodyModel[348] = new ModelRendererTurbo(this, 13, 126, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[349] = new ModelRendererTurbo(this, 13, 126, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[350] = new ModelRendererTurbo(this, 13, 121, textureX, textureY, "cull"); // Box 444 cull
		bodyModel[351] = new ModelRendererTurbo(this, 1, 125, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[352] = new ModelRendererTurbo(this, 1, 120, textureX, textureY, "cull"); // Box 444 cull
		bodyModel[353] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 436 fuel monitor
		bodyModel[354] = new ModelRendererTurbo(this, 407, 165, textureX, textureY); // Box 547 an exact science
		bodyModel[355] = new ModelRendererTurbo(this, 407, 144, textureX, textureY); // Box 345 an exact science
		bodyModel[356] = new ModelRendererTurbo(this, 422, 42, textureX, textureY); // Box 233 ECO-radiator
		bodyModel[357] = new ModelRendererTurbo(this, 408, 38, textureX, textureY); // Box 233 ECO-radiator
		bodyModel[358] = new ModelRendererTurbo(this, 370, 2, textureX, textureY); // Box 233 ECO-radiator
		bodyModel[359] = new ModelRendererTurbo(this, 421, 30, textureX, textureY); // Box 233 ECO-radiator
		bodyModel[360] = new ModelRendererTurbo(this, 421, 30, textureX, textureY); // Box 233 ECO-radiator
		bodyModel[361] = new ModelRendererTurbo(this, 372, 10, textureX, textureY); // Box 233 ECO-radiator
		bodyModel[362] = new ModelRendererTurbo(this, 291, 7, textureX, textureY); // Box 233 ECO-radiator
		bodyModel[363] = new ModelRendererTurbo(this, 328, 31, textureX, textureY); // Box 233 ECO-radiator
		bodyModel[364] = new ModelRendererTurbo(this, 238, 6, textureX, textureY, "doesnt need to be a cull"); // Box 233 Roof Fan Cull
		bodyModel[365] = new ModelRendererTurbo(this, 46, 19, textureX, textureY); // Box 236 Modern Control Stand Desk 
		bodyModel[366] = new ModelRendererTurbo(this, 57, 26, textureX, textureY); // Box 280 Modern Control Stand Throttle Tower Front
		bodyModel[367] = new ModelRendererTurbo(this, 68, 19, textureX, textureY, "lamp"); // Box 412 ES44  cs glow
		bodyModel[368] = new ModelRendererTurbo(this, 68, 12, textureX, textureY, "lamp"); // Box 412 ES44 cs glow
		bodyModel[369] = new ModelRendererTurbo(this, 73, 26, textureX, textureY); // Box 412 Modern Control Stand AB Tower Front
		bodyModel[370] = new ModelRendererTurbo(this, 39, 18, textureX, textureY); // Box 11 Modern Control Stand Desk 
		bodyModel[371] = new ModelRendererTurbo(this, 88, 4, textureX, textureY); // Box 12 Modern Control Stand Desk 
		bodyModel[372] = new ModelRendererTurbo(this, 36, 25, textureX, textureY); // Box 14 Modern Control Stand AB Tower Back
		bodyModel[373] = new ModelRendererTurbo(this, 255, 34, textureX, textureY); // Box 416
		bodyModel[374] = new ModelRendererTurbo(this, 51, 176, textureX, textureY); // Box 475
		bodyModel[375] = new ModelRendererTurbo(this, 16, 172, textureX, textureY); // Box 485
		bodyModel[376] = new ModelRendererTurbo(this, 5, 170, textureX, textureY); // Box 486
		bodyModel[377] = new ModelRendererTurbo(this, 16, 167, textureX, textureY); // Box 487
		bodyModel[378] = new ModelRendererTurbo(this, 5, 165, textureX, textureY); // Box 488
		bodyModel[379] = new ModelRendererTurbo(this, 16, 162, textureX, textureY); // Box 489
		bodyModel[380] = new ModelRendererTurbo(this, 5, 160, textureX, textureY); // Box 490
		bodyModel[381] = new ModelRendererTurbo(this, 16, 167, textureX, textureY); // Box 491
		bodyModel[382] = new ModelRendererTurbo(this, 5, 155, textureX, textureY); // Box 492
		bodyModel[383] = new ModelRendererTurbo(this, 16, 152, textureX, textureY); // Box 493
		bodyModel[384] = new ModelRendererTurbo(this, 79, 181, textureX, textureY); // Box 481
		bodyModel[385] = new ModelRendererTurbo(this, 79, 171, textureX, textureY); // Box 483
		bodyModel[386] = new ModelRendererTurbo(this, 98, 176, textureX, textureY); // Box 475
		bodyModel[387] = new ModelRendererTurbo(this, 87, 181, textureX, textureY); // Box 481
		bodyModel[388] = new ModelRendererTurbo(this, 87, 171, textureX, textureY); // Box 483
		bodyModel[389] = new ModelRendererTurbo(this, 3, 172, textureX, textureY); // Box 485
		bodyModel[390] = new ModelRendererTurbo(this, 5, 170, textureX, textureY); // Box 486
		bodyModel[391] = new ModelRendererTurbo(this, 3, 162, textureX, textureY); // Box 487
		bodyModel[392] = new ModelRendererTurbo(this, 5, 165, textureX, textureY); // Box 488
		bodyModel[393] = new ModelRendererTurbo(this, 3, 162, textureX, textureY); // Box 489
		bodyModel[394] = new ModelRendererTurbo(this, 5, 160, textureX, textureY); // Box 490
		bodyModel[395] = new ModelRendererTurbo(this, 3, 167, textureX, textureY); // Box 491
		bodyModel[396] = new ModelRendererTurbo(this, 5, 155, textureX, textureY); // Box 492
		bodyModel[397] = new ModelRendererTurbo(this, 3, 152, textureX, textureY); // Box 493
		bodyModel[398] = new ModelRendererTurbo(this, 64, 176, textureX, textureY); // Box 475
		bodyModel[399] = new ModelRendererTurbo(this, 16, 172, textureX, textureY); // Box 485
		bodyModel[400] = new ModelRendererTurbo(this, 18, 170, textureX, textureY); // Box 486
		bodyModel[401] = new ModelRendererTurbo(this, 16, 167, textureX, textureY); // Box 487
		bodyModel[402] = new ModelRendererTurbo(this, 18, 165, textureX, textureY); // Box 488
		bodyModel[403] = new ModelRendererTurbo(this, 16, 162, textureX, textureY); // Box 489
		bodyModel[404] = new ModelRendererTurbo(this, 18, 160, textureX, textureY); // Box 490
		bodyModel[405] = new ModelRendererTurbo(this, 16, 157, textureX, textureY); // Box 491
		bodyModel[406] = new ModelRendererTurbo(this, 18, 155, textureX, textureY); // Box 492
		bodyModel[407] = new ModelRendererTurbo(this, 16, 152, textureX, textureY); // Box 493
		bodyModel[408] = new ModelRendererTurbo(this, 91, 181, textureX, textureY); // Box 481
		bodyModel[409] = new ModelRendererTurbo(this, 91, 171, textureX, textureY); // Box 483
		bodyModel[410] = new ModelRendererTurbo(this, 149, 163, textureX, textureY); // Box 361
		bodyModel[411] = new ModelRendererTurbo(this, 287, 110, textureX, textureY); // Box 282
		bodyModel[412] = new ModelRendererTurbo(this, 287, 110, textureX, textureY); // Box 282
		bodyModel[413] = new ModelRendererTurbo(this, 287, 110, textureX, textureY); // Box 282
		bodyModel[414] = new ModelRendererTurbo(this, 287, 110, textureX, textureY); // Box 282
		bodyModel[415] = new ModelRendererTurbo(this, 111, 167, textureX, textureY, "cull"); // Box 377 cull De-flat-ass-inator
		bodyModel[416] = new ModelRendererTurbo(this, 126, 168, textureX, textureY, "cull"); // Box 377 cull De-flat-ass-inator
		bodyModel[417] = new ModelRendererTurbo(this, 102, 168, textureX, textureY, "cull"); // Box 377 cull De-flat-ass-inator
		bodyModel[418] = new ModelRendererTurbo(this, 169, 87, textureX, textureY); // Box 261
		bodyModel[419] = new ModelRendererTurbo(this, 473, 108, textureX, textureY, "lamp"); // Box 247 headlight rear BNSF Funny
		bodyModel[420] = new ModelRendererTurbo(this, 473, 108, textureX, textureY, "lamp"); // Box 247 headlight rear BNSF Funny
		bodyModel[421] = new ModelRendererTurbo(this, 42, 33, textureX, textureY); // Box 287
		bodyModel[422] = new ModelRendererTurbo(this, 446, 7, textureX, textureY); // Box 442
		bodyModel[423] = new ModelRendererTurbo(this, 446, 16, textureX, textureY); // Box 442
		bodyModel[424] = new ModelRendererTurbo(this, 478, 8, textureX, textureY); // Box 442
		bodyModel[425] = new ModelRendererTurbo(this, 478, 16, textureX, textureY); // Box 442
		bodyModel[426] = new ModelRendererTurbo(this, 417, 118, textureX, textureY); // Box 282
		bodyModel[427] = new ModelRendererTurbo(this, 384, 140, textureX, textureY); // Box 283
		bodyModel[428] = new ModelRendererTurbo(this, 415, 131, textureX, textureY); // Box 4
		bodyModel[429] = new ModelRendererTurbo(this, 407, 114, textureX, textureY); // Box 448
		bodyModel[430] = new ModelRendererTurbo(this, 401, 148, textureX, textureY); // Box 322
		bodyModel[431] = new ModelRendererTurbo(this, 376, 112, textureX, textureY); // Box 323
		bodyModel[432] = new ModelRendererTurbo(this, 372, 147, textureX, textureY); // Box 280
		bodyModel[433] = new ModelRendererTurbo(this, 392, 110, textureX, textureY); // Box 285
		bodyModel[434] = new ModelRendererTurbo(this, 452, 116, textureX, textureY); // Box 277
		bodyModel[435] = new ModelRendererTurbo(this, 92, 141, textureX, textureY); // Box 396
		bodyModel[436] = new ModelRendererTurbo(this, 44, 142, textureX, textureY); // Box 396
		bodyModel[437] = new ModelRendererTurbo(this, 406, 2, textureX, textureY); // Box 437

		bodyModel[0].addBox(0F, 0F, 0F, 88, 1, 5, 0F); // Box 0 culll frame
		bodyModel[0].setRotationPoint(-44F, -2F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 24, 3, 20, 0F); // Box 2
		bodyModel[1].setRotationPoint(-12F, 5F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 9, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(-49.01F, -1F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 5, 3, 22, 0F); // Box 10
		bodyModel[3].setRotationPoint(-12F, 2F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 10, 2, 5, 0F); // Box 156
		bodyModel[4].setRotationPoint(-40F, -1F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 61
		bodyModel[5].setRotationPoint(-49F, -2F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 63
		bodyModel[6].setRotationPoint(-49F, -2F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 80
		bodyModel[7].setRotationPoint(-49F, -10F, -8F);

		bodyModel[8].addBox(0F, -0.5F, 0F, 8, 1, 3, 0F); // Box 19
		bodyModel[8].setRotationPoint(-7F, 3F, 8F);
		bodyModel[8].rotateAngleZ = -0.03490659F;

		bodyModel[9].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440
		bodyModel[9].setRotationPoint(-34F, 2F, -2F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 441
		bodyModel[10].setRotationPoint(30F, 2F, -2F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 19
		bodyModel[11].setRotationPoint(-5.5F, 1.5F, -11.5F);
		bodyModel[11].rotateAngleX = 1.22173048F;

		bodyModel[12].addBox(0F, 0F, -1F, 1, 5, 1, 0F); // Box 19
		bodyModel[12].setRotationPoint(-10.5F, 1.5F, 11.5F);
		bodyModel[12].rotateAngleX = -1.22173048F;

		bodyModel[13].addBox(0F, 0F, 0F, 4, 4, 6, 0F); // Box 193
		bodyModel[13].setRotationPoint(-49F, 2F, -3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 22, 0F,-0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 318
		bodyModel[14].setRotationPoint(26F, -2F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[15].setRotationPoint(-49.01F, 7F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[16].setRotationPoint(-49F, -10F, 11F);
		bodyModel[16].rotateAngleY = -3.14159265F;

		bodyModel[17].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 322
		bodyModel[17].setRotationPoint(27F, 0F, -11F);

		bodyModel[18].addBox(-1F, 0F, 0F, 23, 3, 14, 0F); // Box 96
		bodyModel[18].setRotationPoint(-23F, -24F, -7F);

		bodyModel[19].addBox(0F, 0F, 0F, 66, 19, 14, 0F); // Box 97
		bodyModel[19].setRotationPoint(-24F, -21F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 17, 6, 0F,1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 124
		bodyModel[20].setRotationPoint(43F, -19F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 17, 6, 0F,1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 130
		bodyModel[21].setRotationPoint(43F, -19F, 1F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 12, 4, 0F); // Box 131
		bodyModel[22].setRotationPoint(42F, -14F, -2F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 2 this was EXHAUSTING to make haha
		bodyModel[23].setRotationPoint(14.5F, -24F, -3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[24].setRotationPoint(-1F, -22F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[25].setRotationPoint(-1F, -22F, 3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[26].setRotationPoint(-1F, -22F, -3F);

		bodyModel[27].addShapeBox(-1F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 219
		bodyModel[27].setRotationPoint(43F, -15F, -1F);
		bodyModel[27].rotateAngleZ = 0.78539816F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0.375F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.375F, 0.25F, 0F, 0.375F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.375F, 0.25F); // Box 247 Support for Rear Vertical  HL
		bodyModel[28].setRotationPoint(45F, -22F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear Vertical
		bodyModel[29].setRotationPoint(45F, -22F, -1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear Vertical
		bodyModel[30].setRotationPoint(45F, -20F, -1F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[31].setRotationPoint(29F, -19F, -9F);

		bodyModel[32].addBox(0F, -1F, 0F, 26, 3, 22, 0F); // Box 233
		bodyModel[32].setRotationPoint(19F, -21F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[33].setRotationPoint(-53F, 3F, -1.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[34].setRotationPoint(-50F, 2.5F, -2.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[35].setRotationPoint(49F, 2.5F, -2.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 212
		bodyModel[36].setRotationPoint(50F, 3F, -1.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 cull
		bodyModel[37].setRotationPoint(-51F, -2F, -8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163 cull
		bodyModel[38].setRotationPoint(-51F, -2F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 164 cull
		bodyModel[39].setRotationPoint(-51F, -2F, 2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[40].setRotationPoint(-24F, -6F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138 cull
		bodyModel[41].setRotationPoint(-9F, -4F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[42].setRotationPoint(-49F, 8F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 54, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[43].setRotationPoint(-9F, -10F, -11F);

		bodyModel[44].addShapeBox(1F, 0F, 0F, 0, 8, 6, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[44].setRotationPoint(-50F, -10F, 2F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 8, 4, 0F); // Box 308
		bodyModel[45].setRotationPoint(-51F, -10F, -2F);

		bodyModel[46].addShapeBox(0F, 0F, -1F, 0, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[46].setRotationPoint(-49F, -9F, 8F);
		bodyModel[46].rotateAngleY = -0.38397244F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 50, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[47].setRotationPoint(-5F, -10F, 11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 15, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[48].setRotationPoint(-24F, -14F, 11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[49].setRotationPoint(-9F, -14F, 11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[50].setRotationPoint(45F, -7F, 10.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 15, 2, 0F); // Box 282
		bodyModel[51].setRotationPoint(45F, -10F, 9F);

		bodyModel[52].addBox(-1.25F, 0F, 1F, 1, 2, 5, 0F); // Box 393 numberboard
		bodyModel[52].setRotationPoint(42.25F, -17F, -7.5F);
		bodyModel[52].rotateAngleY = -0.52359878F;

		bodyModel[53].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 394
		bodyModel[53].setRotationPoint(42F, -17F, -1F);

		bodyModel[54].addBox(-1.15F, 0F, -5.5F, 1, 2, 5, 0F); // Box 395 numberboard
		bodyModel[54].setRotationPoint(42.35F, -17F, 7F);
		bodyModel[54].rotateAngleY = 0.54105207F;

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 398
		bodyModel[55].setRotationPoint(44.5F, -20.25F, -8.75F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 399
		bodyModel[56].setRotationPoint(44.5F, -20.25F, 7.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[57].setRotationPoint(-50F, -5F, -6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f u
		bodyModel[58].setRotationPoint(-50.25F, -5F, -6F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 444 cull
		bodyModel[59].setRotationPoint(49F, 0.15F, 4F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f u
		bodyModel[60].setRotationPoint(-50.25F, -5F, 4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[61].setRotationPoint(-50F, -5F, 4F);

		bodyModel[62].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[62].setRotationPoint(3F, -23.5F, -0.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[63].setRotationPoint(4F, -23.25F, 0.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[64].setRotationPoint(3.5F, -23.25F, -1.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[65].setRotationPoint(5.5F, -22.5F, -0.5F);

		bodyModel[66].addShapeBox(-1F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 435 AC intake A
		bodyModel[66].setRotationPoint(-5F, -23F, -7.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 443
		bodyModel[67].setRotationPoint(4.5F, -24.25F, 0.25F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 444
		bodyModel[68].setRotationPoint(4.5F, -24.25F, -1.25F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[69].setRotationPoint(-53F, 7F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[70].setRotationPoint(-53F, 7F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[71].setRotationPoint(-52F, 6F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[72].setRotationPoint(-52F, 4F, 2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 314
		bodyModel[73].setRotationPoint(49F, -5F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 315 ditchlight r
		bodyModel[74].setRotationPoint(49.25F, -5F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 318
		bodyModel[75].setRotationPoint(49F, -5F, 4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 319 ditchlight r
		bodyModel[76].setRotationPoint(49.25F, -5F, 4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[77].setRotationPoint(-52F, 6F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[78].setRotationPoint(-52F, 4F, -10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[79].setRotationPoint(-52F, 3F, 2F);

		bodyModel[80].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[80].setRotationPoint(-52F, 3F, -8F);

		bodyModel[81].addBox(0F, 0F, 0F, 2, 3, 22, 0F); // Box 434
		bodyModel[81].setRotationPoint(10F, 2F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 17, 3, 19, 0F); // Box 435
		bodyModel[82].setRotationPoint(-7F, 2F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 11, 1, 2, 0F); // Box 94
		bodyModel[83].setRotationPoint(-47F, -17F, -1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 15, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[84].setRotationPoint(-25F, -22F, -11F);

		bodyModel[85].addShapeBox(3F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[85].setRotationPoint(-39F, -16F, -11F);

		bodyModel[86].addBox(3F, 0F, 0F, 9, 6, 1, 0F); // Box 120
		bodyModel[86].setRotationPoint(-37F, -22F, 10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[87].setRotationPoint(-47F, -14F, -11F);

		bodyModel[88].addShapeBox(3F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[88].setRotationPoint(-39F, -17F, 10F);

		bodyModel[89].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 135
		bodyModel[89].setRotationPoint(-36F, -17F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,-1.75F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, -4.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 123
		bodyModel[90].setRotationPoint(-39F, -22F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 3, 10, 0F,-8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 150
		bodyModel[91].setRotationPoint(-44F, -17F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 8, 3, 10, 0F,3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 152
		bodyModel[92].setRotationPoint(-44F, -17F, 1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 8, 3, 10, 0F,3F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -3F, 0F, 3F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[93].setRotationPoint(-44F, -17F, 1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 8, 3, 10, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 3F, 0F, 0F); // Box 154
		bodyModel[94].setRotationPoint(-44F, -17F, -11F);

		bodyModel[95].addBox(3F, 0F, 0F, 9, 6, 1, 0F); // Box 119
		bodyModel[95].setRotationPoint(-37F, -22F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 120
		bodyModel[96].setRotationPoint(-47F, -14F, 1F);

		bodyModel[97].addShapeBox(3F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[97].setRotationPoint(-39F, -16F, 10F);

		bodyModel[98].addShapeBox(0F, 0F, 1F, 1, 13, 4, 0F,0F, 0F, 0F, -0.36F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.36F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F); // Box 69 schnozz door
		bodyModel[98].setRotationPoint(-45.75F, -15F, -6F);
		bodyModel[98].rotateAngleY = 0.29670597F;

		bodyModel[99].addShapeBox(0F, 0F, 3F, 1, 1, 2, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 94 schnozz door
		bodyModel[99].setRotationPoint(-45.75F, -16F, -6F);
		bodyModel[99].rotateAngleY = 0.29670597F;

		bodyModel[100].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.55F, 0F, -0.35F, -0.55F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 95 schnozz door
		bodyModel[100].setRotationPoint(-45.75F, -16F, -6F);
		bodyModel[100].rotateAngleY = 0.29670597F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[101].setRotationPoint(-25F, -24F, 7F);

		bodyModel[102].addBox(0F, 0F, -6F, 1, 2, 5, 0F); // Box 172
		bodyModel[102].setRotationPoint(-35.02F, -24F, 8F);
		bodyModel[102].rotateAngleY = -0.27488936F;

		bodyModel[103].addBox(0F, 0F, 0F, 3, 10, 2, 0F); // Box 177
		bodyModel[103].setRotationPoint(-47F, -12F, -1F);

		bodyModel[104].addBox(-0.5F, 0F, -3.5F, 1, 15, 4, 0F); // Box 314 door swing right
		bodyModel[104].setRotationPoint(-24.5F, -22F, 10.5F);

		bodyModel[105].addShapeBox(0F, 0F, -6F, 1, 2, 5, 0F,0F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, 0F, -0.05F, -0.05F); // Box 242 numberboard top
		bodyModel[105].setRotationPoint(-35.03F, -24F, 8F);
		bodyModel[105].rotateAngleY = -0.27488936F;

		bodyModel[106].addBox(0F, 0F, 0F, 8, 12, 22, 0F); // Box 210
		bodyModel[106].setRotationPoint(-44F, -14F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 122
		bodyModel[107].setRotationPoint(-47F, -16F, -1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 154 headlight nose
		bodyModel[108].setRotationPoint(-46.75F, -16F, -1F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 155 headlight nose
		bodyModel[109].setRotationPoint(-46.75F, -14F, -1F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[110].setRotationPoint(-35F, -22F, 10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F); // Box 351 sandcap
		bodyModel[111].setRotationPoint(-43.25F, -16.75F, -8.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F); // Box 399 sandcap
		bodyModel[112].setRotationPoint(-43.25F, -16.75F, 6.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 8, 0, 1, 0F,0F, -0.5F, 0F, 0F, 2.5F, 0F, -1.1F, 2.5F, 0F, 0.3F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, -1.1F, -2.5F, 0F, 0.3F, 0.2F, 0F); // Box 253
		bodyModel[113].setRotationPoint(-44F, -14.51F, -11F);

		bodyModel[114].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 267
		bodyModel[114].setRotationPoint(-34F, -24F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 269
		bodyModel[115].setRotationPoint(-34F, -24F, 7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[116].setRotationPoint(-34F, -23F, -3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[117].setRotationPoint(-34F, -23F, 3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[118].setRotationPoint(-34F, -23F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[119].setRotationPoint(-34F, -23F, 7F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 396 glow marker
		bodyModel[120].setRotationPoint(-45F, -14.5F, -9.25F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 396 glow marker
		bodyModel[121].setRotationPoint(-45F, -14.5F, 8.25F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 284
		bodyModel[122].setRotationPoint(-35F, -15F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 285
		bodyModel[123].setRotationPoint(-33F, -14F, -10F);

		bodyModel[124].addBox(0F, 0F, 0F, 4, 7, 1, 0F); // Box 286
		bodyModel[124].setRotationPoint(-35F, -14F, -4F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[125].setRotationPoint(-35F, -17F, -10F);

		bodyModel[126].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 232 Cool it!
		bodyModel[126].setRotationPoint(-33F, -25F, -2.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[127].setRotationPoint(-31F, -25F, 6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[128].setRotationPoint(-31F, -25F, -6F);

		bodyModel[129].addShapeBox(0F, 0F, -5F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[129].setRotationPoint(-28F, -25F, 0F);

		bodyModel[130].addBox(0F, 0F, 0F, 12, 5, 22, 0F); // Box 137
		bodyModel[130].setRotationPoint(-36F, -7F, -11F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 10, 20, 0F); // Box 131
		bodyModel[131].setRotationPoint(-36F, -17F, -10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 216
		bodyModel[132].setRotationPoint(-38F, -17F, 1F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[133].setRotationPoint(-38F, -17F, -11F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 281 ES44 Modern Control Stand Side
		bodyModel[134].setRotationPoint(-35F, -17F, 1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F); // Box 239 numberboard nose
		bodyModel[135].setRotationPoint(-44.51F, -13F, -10.2F);
		bodyModel[135].rotateAngleY = 0.27925268F;

		bodyModel[136].addShapeBox(0F, 0F, -4F, 1, 2, 4, 0F,0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F); // Box 240 numberboard nose
		bodyModel[136].setRotationPoint(-44.51F, -13F, 10.2F);
		bodyModel[136].rotateAngleY = -0.27925268F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[137].setRotationPoint(-39F, -22.75F, -0.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[138].setRotationPoint(-39F, -23.75F, -0.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[139].setRotationPoint(-38.75F, -22.25F, -0.25F);

		bodyModel[140].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 481 Cull
		bodyModel[140].setRotationPoint(-39F, -24F, -1F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 227
		bodyModel[141].setRotationPoint(-44.5F, -13F, -10.2F);
		bodyModel[141].rotateAngleY = 0.27925268F;

		bodyModel[142].addBox(0F, 0F, -4F, 1, 2, 4, 0F); // Box 228
		bodyModel[142].setRotationPoint(-44.5F, -13F, 10.2F);
		bodyModel[142].rotateAngleY = -0.27925268F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[143].setRotationPoint(33.5F, -11.5F, -7.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[144].setRotationPoint(35F, -10F, -7.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 352 cabmount assembly
		bodyModel[145].setRotationPoint(-37.25F, -23.99F, -2F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 353 headlight high
		bodyModel[146].setRotationPoint(-37.5F, -23.99F, -2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 354 headlight high
		bodyModel[147].setRotationPoint(-37.5F, -23.99F, 0F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 288
		bodyModel[148].setRotationPoint(-25F, -23F, -7F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 312 nose cover
		bodyModel[149].setRotationPoint(-47F, -16F, -1F);

		bodyModel[150].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 314
		bodyModel[150].setRotationPoint(14F, -23F, -3.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[151].setRotationPoint(-49.01F, 7F, 10F);

		bodyModel[152].addBox(0F, 0F, 0F, 98, 4, 12, 0F); // Box 23
		bodyModel[152].setRotationPoint(-49F, -2F, -6F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 97, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[153].setRotationPoint(-49F, 2F, -6.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 312
		bodyModel[154].setRotationPoint(-49F, -1.95F, 6F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 295 culll frame
		bodyModel[155].setRotationPoint(-9F, -1F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 88, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 296 culll frame
		bodyModel[156].setRotationPoint(-44F, -1F, 6F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 450
		bodyModel[157].setRotationPoint(-12F, 5F, 10F);

		bodyModel[158].addBox(0F, 0F, 0F, 24, 1, 16, 0F); // Box 451
		bodyModel[158].setRotationPoint(-12F, 8F, -8F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 24, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 452
		bodyModel[159].setRotationPoint(-12F, 8F, 8F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 24, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[160].setRotationPoint(-12F, 8F, -10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[161].setRotationPoint(-12F, 5F, -11F);

		bodyModel[162].addBox(0F, 0F, 0F, 88, 1, 5, 0F); // Box 459 cull frame
		bodyModel[162].setRotationPoint(-44F, -2F, 6F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 460
		bodyModel[163].setRotationPoint(-45F, -2F, 6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[164].setRotationPoint(-45F, -10F, 11F);
		bodyModel[164].rotateAngleY = -3.14159265F;

		bodyModel[165].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 467
		bodyModel[165].setRotationPoint(-45F, -2F, 10F);

		bodyModel[166].addShapeBox(0F, 0F, -1F, 0, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[166].setRotationPoint(-45F, -9F, 8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		bodyModel[167].setRotationPoint(-49F, -10F, -10F);
		bodyModel[167].rotateAngleY = -3.14159265F;

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 470
		bodyModel[168].setRotationPoint(-49F, -9F, -8F);
		bodyModel[168].rotateAngleY = 0.38397244F;

		bodyModel[169].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 471
		bodyModel[169].setRotationPoint(-45F, -2F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[170].setRotationPoint(-45F, -10F, -10F);
		bodyModel[170].rotateAngleY = -3.14159265F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 473
		bodyModel[171].setRotationPoint(-45F, -9F, -8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 475
		bodyModel[172].setRotationPoint(-44.5F, -0.5F, -11F);
		bodyModel[172].rotateAngleY = 0.19198622F;

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[173].setRotationPoint(-45F, 2F, -3F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 480
		bodyModel[174].setRotationPoint(-45F, -2F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 481
		bodyModel[175].setRotationPoint(-45F, -0.5F, -11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 483
		bodyModel[176].setRotationPoint(-44F, -0.5F, -11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.55F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[177].setRotationPoint(-49F, 8F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[178].setRotationPoint(-49F, 7F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.35F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F); // Box 487
		bodyModel[179].setRotationPoint(-49F, 6.25F, -10.25F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[180].setRotationPoint(-49F, 5.25F, -8.25F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[181].setRotationPoint(-49F, 4.5F, -9.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[182].setRotationPoint(-49F, 3.5F, -7.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[183].setRotationPoint(-49F, 2.75F, -8.75F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[184].setRotationPoint(-49F, 1.75F, -6.75F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[185].setRotationPoint(-49F, 0F, -8F);

		bodyModel[186].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 494
		bodyModel[186].setRotationPoint(-49F, -1.95F, -7F);

		bodyModel[187].addShapeBox(0F, -1.5F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 495
		bodyModel[187].setRotationPoint(-7F, 3F, 9F);
		bodyModel[187].rotateAngleZ = -0.03490659F;

		bodyModel[188].addShapeBox(0F, 0.5F, 0F, 8, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[188].setRotationPoint(-7F, 3F, 9F);
		bodyModel[188].rotateAngleZ = -0.03490659F;

		bodyModel[189].addShapeBox(-8F, -1.5F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 497
		bodyModel[189].setRotationPoint(10F, 3F, 9F);
		bodyModel[189].rotateAngleZ = 0.03490659F;

		bodyModel[190].addBox(-8F, -0.5F, 0F, 8, 1, 3, 0F); // Box 498
		bodyModel[190].setRotationPoint(10F, 3F, 8F);
		bodyModel[190].rotateAngleZ = 0.03490659F;

		bodyModel[191].addShapeBox(-8F, 0.5F, 0F, 8, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[191].setRotationPoint(10F, 3F, 9F);
		bodyModel[191].rotateAngleZ = 0.03490659F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 500 cull frame
		bodyModel[192].setRotationPoint(-44F, -1F, -11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 501
		bodyModel[193].setRotationPoint(-41F, -1F, -11F);

		bodyModel[194].addBox(0F, 0F, 0F, 12, 2, 5, 0F); // Box 502
		bodyModel[194].setRotationPoint(-26F, -1F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[195].setRotationPoint(-32F, -22F, 11F);
		bodyModel[195].rotateAngleX = 0.26179939F;

		bodyModel[196].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[196].setRotationPoint(-32F, -22.25F, -11.97F);
		bodyModel[196].rotateAngleX = -0.26179939F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,-4.75F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[197].setRotationPoint(-39F, -22F, -11F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 313
		bodyModel[198].setRotationPoint(-34F, -24F, -11F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[199].setRotationPoint(-25F, -24F, -11F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 315
		bodyModel[200].setRotationPoint(-35F, -22F, -11F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[201].setRotationPoint(-34F, -23F, -10F);

		bodyModel[202].addBox(0F, 0F, 1F, 1, 2, 5, 0F); // Box 317
		bodyModel[202].setRotationPoint(-35.02F, -24F, -8F);
		bodyModel[202].rotateAngleY = 0.27488936F;

		bodyModel[203].addShapeBox(0F, 0F, 1F, 1, 2, 5, 0F,0F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, 0F, -0.05F, -0.05F); // Box 318 numerboard top
		bodyModel[203].setRotationPoint(-35.03F, -24F, -8F);
		bodyModel[203].rotateAngleY = 0.27488936F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F); // Box 309
		bodyModel[204].setRotationPoint(-35F, -24F, -7F);

		bodyModel[205].addShapeBox(0F, 1F, -4F, 1, 1, 4, 0F,-0.75F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.34F, 0F, 0F); // Box 310
		bodyModel[205].setRotationPoint(-35F, -24F, -7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.34F, 0F, 0F); // Box 311
		bodyModel[206].setRotationPoint(-35F, -24F, 0F);

		bodyModel[207].addShapeBox(0F, 1F, -4F, 1, 1, 4, 0F,-0.75F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, 0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 312
		bodyModel[207].setRotationPoint(-35F, -24F, 11F);

		bodyModel[208].addShapeBox(0F, 1F, -3F, 1, 1, 3, 0F,-0.478F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.75F, 1F, 0F, -0.478F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.34F, 0F, 0F); // Box 313
		bodyModel[208].setRotationPoint(-35F, -24F, -7F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 314
		bodyModel[209].setRotationPoint(-34F, -24F, -10F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[210].setRotationPoint(-25F, -24F, -10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 316
		bodyModel[211].setRotationPoint(-34F, -24F, 7F);

		bodyModel[212].addShapeBox(0F, 1F, -3F, 1, 1, 3, 0F,-0.75F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -0.478F, -1F, 0F, 0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.478F, 0F, 0F); // Box 317
		bodyModel[212].setRotationPoint(-35F, -24F, 10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[213].setRotationPoint(-25F, -24F, 7F);

		bodyModel[214].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 315 aussy markers
		bodyModel[214].setRotationPoint(-45.25F, -14F, 7.25F);
		bodyModel[214].rotateAngleY = -0.26179939F;

		bodyModel[215].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 316 aussy markers
		bodyModel[215].setRotationPoint(-45.25F, -14F, -7.25F);
		bodyModel[215].rotateAngleY = 0.26179939F;

		bodyModel[216].addBox(0F, 0F, 0F, 0, 9, 20, 0F); // Box 317
		bodyModel[216].setRotationPoint(49.01F, -1F, -10F);

		bodyModel[217].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 318
		bodyModel[217].setRotationPoint(49F, -2F, 10F);

		bodyModel[218].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 319
		bodyModel[218].setRotationPoint(49F, -2F, -11F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[219].setRotationPoint(49.02F, 8F, -9F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[220].setRotationPoint(49.01F, 7F, 10F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[221].setRotationPoint(49.01F, 7F, -11F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 361
		bodyModel[222].setRotationPoint(44F, -2F, 6F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F); // Box 270
		bodyModel[223].setRotationPoint(-36F, -22F, 0F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,-1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3F, 0F, 0F); // Box 366
		bodyModel[224].setRotationPoint(-36F, -22F, -10F);

		bodyModel[225].addBox(0F, 0F, 0F, 4, 4, 6, 0F); // Box 367
		bodyModel[225].setRotationPoint(45F, 2F, -3F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 368
		bodyModel[226].setRotationPoint(44F, 2F, -3F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 375
		bodyModel[227].setRotationPoint(45F, -7F, -11.5F);

		bodyModel[228].addBox(0F, 0F, 0F, 0, 15, 2, 0F); // Box 376
		bodyModel[228].setRotationPoint(45F, -10F, -11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377 cull
		bodyModel[229].setRotationPoint(49F, -2F, -2F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 378 cull
		bodyModel[230].setRotationPoint(49F, -2F, 2F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379 cull
		bodyModel[231].setRotationPoint(49F, -2F, -8F);

		bodyModel[232].addBox(0F, 0F, 0F, 0, 8, 4, 0F); // Box 380
		bodyModel[232].setRotationPoint(51F, -10F, -2F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 381
		bodyModel[233].setRotationPoint(49F, -10F, -8F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 382
		bodyModel[234].setRotationPoint(49F, -9F, -8F);
		bodyModel[234].rotateAngleY = -0.38397244F;

		bodyModel[235].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[235].setRotationPoint(49F, -10F, -10F);
		bodyModel[235].rotateAngleY = -3.14159265F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[236].setRotationPoint(49F, -10F, 11F);
		bodyModel[236].rotateAngleY = -3.14159265F;

		bodyModel[237].addShapeBox(0F, 0F, -1F, 0, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[237].setRotationPoint(49F, -9F, 8F);
		bodyModel[237].rotateAngleY = 0.38397244F;

		bodyModel[238].addShapeBox(1F, 0F, 0F, 0, 8, 6, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[238].setRotationPoint(48F, -10F, 2F);

		bodyModel[239].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 387
		bodyModel[239].setRotationPoint(49F, -10F, -8F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 388
		bodyModel[240].setRotationPoint(49F, -9F, -8F);

		bodyModel[241].addShapeBox(0F, 0F, -1F, 0, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[241].setRotationPoint(49F, -9F, 8F);

		bodyModel[242].addBox(-8F, -0.5F, 0F, 0, 2, 3, 0F); // Box 390
		bodyModel[242].setRotationPoint(11.5F, 3.5F, 8F);

		bodyModel[243].addBox(-8F, -0.5F, 0F, 0, 2, 3, 0F); // Box 391
		bodyModel[243].setRotationPoint(16.5F, 3.5F, 8F);

		bodyModel[244].addBox(-8F, -0.5F, 0F, 0, 2, 3, 0F); // Box 392
		bodyModel[244].setRotationPoint(2.5F, 3.5F, 8F);

		bodyModel[245].addBox(-8F, -0.5F, 0F, 0, 2, 3, 0F); // Box 393
		bodyModel[245].setRotationPoint(7.5F, 3.5F, 8F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 394
		bodyModel[246].setRotationPoint(26F, 0F, -9F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 395
		bodyModel[247].setRotationPoint(26F, 0F, 6F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 396
		bodyModel[248].setRotationPoint(-30F, 0F, 6F);

		bodyModel[249].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 399
		bodyModel[249].setRotationPoint(-29F, 0F, -11F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 4, 2, 22, 0F,-0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 400
		bodyModel[250].setRotationPoint(-30F, -2F, -11F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 401
		bodyModel[251].setRotationPoint(-30F, 0F, -9F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 88, 1, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F); // Box 402 lots of little pipes
		bodyModel[252].setRotationPoint(-44F, -0.5F, 7F);

		bodyModel[253].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 403
		bodyModel[253].setRotationPoint(12.5F, -0.5F, 8F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 404
		bodyModel[254].setRotationPoint(-13.5F, -0.5F, 9F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 63, 2, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -1F, -4F); // Box 405 lots of little pipes 2
		bodyModel[255].setRotationPoint(-44F, -0.5F, -10F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 19, 1, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F); // Box 406 lots of little pipes 2 a
		bodyModel[256].setRotationPoint(19F, -0.5F, -10F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 407 lot of little pipes 3a
		bodyModel[257].setRotationPoint(17F, 0F, -10F);
		bodyModel[257].rotateAngleY = 1.57079633F;
		bodyModel[257].rotateAngleZ = -0.40142573F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 408 lot of little pipes 3b
		bodyModel[258].setRotationPoint(21F, -0.5F, -10F);
		bodyModel[258].rotateAngleY = 1.57079633F;
		bodyModel[258].rotateAngleZ = -0.50614548F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 409 lot of little pipes 3c
		bodyModel[259].setRotationPoint(39F, -0.5F, -10F);
		bodyModel[259].rotateAngleY = 1.57079633F;
		bodyModel[259].rotateAngleZ = -0.50614548F;

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F); // Box 61
		bodyModel[260].setRotationPoint(-15F, 2F, -6F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F); // Box 62
		bodyModel[261].setRotationPoint(-15F, 2F, 5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F); // Box 412
		bodyModel[262].setRotationPoint(12F, 2F, -6F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F); // Box 413
		bodyModel[263].setRotationPoint(12F, 2F, 5F);

		bodyModel[264].addShapeBox(-1F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 435 AC intake A
		bodyModel[264].setRotationPoint(-6.5F, -22.5F, 6.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 15, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418 Inverter Handrail
		bodyModel[265].setRotationPoint(-24F, -22F, -11F);

		bodyModel[266].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 420 AC4400 EXTENDUS
		bodyModel[266].setRotationPoint(-14F, -1F, -11F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 15, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 INVERTER
		bodyModel[267].setRotationPoint(-24F, -15F, -11F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422 AC4400 THING
		bodyModel[268].setRotationPoint(-9F, -15F, -10.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 8F, 0F, -1F, 8F, 0F, 0.25F, 0F, 0F); // Box 424 ac44 handrails
		bodyModel[269].setRotationPoint(-9F, -22F, -11.01F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425 ac44 handrails
		bodyModel[270].setRotationPoint(-4F, -13F, -11F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426 ac4400 super special step part
		bodyModel[271].setRotationPoint(-9F, -6F, 11F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,-0.5F, 0F, 4F, 0.5F, 0F, 4F, 0.5F, 0F, -4F, -0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[272].setRotationPoint(-45F, -7F, -10F);
		bodyModel[272].rotateAngleY = -3.14159265F;

		bodyModel[273].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 396
		bodyModel[273].setRotationPoint(-45.5F, -10F, -6F);
		bodyModel[273].rotateAngleY = -3.14159265F;

		bodyModel[274].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,-0.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, 4F, -0.5F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[274].setRotationPoint(-45F, -7F, 11F);
		bodyModel[274].rotateAngleY = -3.14159265F;

		bodyModel[275].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 398
		bodyModel[275].setRotationPoint(-45.5F, -10F, 7F);
		bodyModel[275].rotateAngleY = -3.14159265F;

		bodyModel[276].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -1F, 4F, 0F, -1F, 4F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[276].setRotationPoint(-49F, -8F, -10F);
		bodyModel[276].rotateAngleY = -3.14159265F;

		bodyModel[277].addShapeBox(0F, 0F, -4F, 0, 8, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[277].setRotationPoint(-51F, -10F, -2F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[278].setRotationPoint(-49F, -8F, 11F);
		bodyModel[278].rotateAngleY = -3.14159265F;

		bodyModel[279].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 402
		bodyModel[279].setRotationPoint(-51F, -10F, 2F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 404
		bodyModel[280].setRotationPoint(51F, -10F, 2F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[281].setRotationPoint(49F, -8F, 11F);
		bodyModel[281].rotateAngleY = -3.14159265F;

		bodyModel[282].addShapeBox(0F, 0F, -4F, 0, 8, 4, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[282].setRotationPoint(51F, -10F, -2F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -1F, 4F, 0F, -1F, 4F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[283].setRotationPoint(49F, -8F, -10F);
		bodyModel[283].rotateAngleY = -3.14159265F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 8, 0, 1, 0F,0.3F, -0.2F, 0F, -1.1F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0.3F, 0.2F, 0F, -1.1F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F); // Box 408
		bodyModel[284].setRotationPoint(-44F, -14.51F, 10F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, -1F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0F, 0F, -1F); // Box 410
		bodyModel[285].setRotationPoint(-47F, -17.01F, -2F);

		bodyModel[286].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 407
		bodyModel[286].setRotationPoint(45F, -1.95F, -7F);

		bodyModel[287].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 419
		bodyModel[287].setRotationPoint(45F, -1.95F, 6F);

		bodyModel[288].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 422 rear sanscap cover
		bodyModel[288].setRotationPoint(42F, -17F, -1F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[289].setRotationPoint(-13.5F, 3.5F, -10.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[290].setRotationPoint(-13.5F, 2.5F, -10.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[291].setRotationPoint(-13.25F, 4F, -10.25F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 136
		bodyModel[292].setRotationPoint(-14F, 4F, -11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 287
		bodyModel[293].setRotationPoint(-14F, 2.5F, -11F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 288
		bodyModel[294].setRotationPoint(-14F, 3.5F, -11F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 289
		bodyModel[295].setRotationPoint(-13.5F, 4F, -10.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		bodyModel[296].setRotationPoint(-13.5F, 2F, -10.5F);

		bodyModel[297].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 431 csx cringe
		bodyModel[297].setRotationPoint(-44F, -1F, -10.99F);

		bodyModel[298].addBox(0F, 0F, 0F, 8, 2, 0, 0F); // Box 432 csx cringe
		bodyModel[298].setRotationPoint(-44F, -1F, 10.99F);

		bodyModel[299].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[299].setRotationPoint(-32F, -21F, -12F);

		bodyModel[300].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[300].setRotationPoint(-32F, -21F, 11F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 435 WHY GE, JUST WHY
		bodyModel[301].setRotationPoint(-49.8F, -1F, -6.5F);
		bodyModel[301].rotateAngleY = 0.2268928F;

		bodyModel[302].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 435 WHY GE, JUST WHY
		bodyModel[302].setRotationPoint(-49.8F, 0F, -6.5F);
		bodyModel[302].rotateAngleY = 0.2268928F;

		bodyModel[303].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 437
		bodyModel[303].setRotationPoint(50F, -2F, 3F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 438
		bodyModel[304].setRotationPoint(50F, -2F, -5F);

		bodyModel[305].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 439 honse
		bodyModel[305].setRotationPoint(49F, -0.5F, -3F);
		bodyModel[305].rotateAngleZ = 0.43633231F;

		bodyModel[306].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 440 honse
		bodyModel[306].setRotationPoint(-49F, -0.5F, -2F);
		bodyModel[306].rotateAngleZ = -0.43633231F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[307].setRotationPoint(-34F, -25.5F, 4.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[308].setRotationPoint(-34F, -25.5F, 4.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[309].setRotationPoint(-34F, -25.5F, 4.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[310].setRotationPoint(-34F, -25.5F, 4.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 PRIME BASE
		bodyModel[311].setRotationPoint(-34F, -25F, 4.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[312].setRotationPoint(-35F, -25F, -0.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[313].setRotationPoint(-35F, -26F, -0.5F);

		bodyModel[314].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 361
		bodyModel[314].setRotationPoint(10F, -22F, -6.5F);

		bodyModel[315].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[315].setRotationPoint(8F, -23F, -5.5F);

		bodyModel[316].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[316].setRotationPoint(9F, -23F, -7.5F);

		bodyModel[317].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[317].setRotationPoint(10F, -23F, -6.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 13, 4, 0F,0F, 0F, 0F, -0.36F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.36F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F); // Box 69 schnozz door
		bodyModel[318].setRotationPoint(-47.25F, -15F, 1.25F);
		bodyModel[318].rotateAngleY = -0.29670597F;

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 94 schnozz door
		bodyModel[319].setRotationPoint(-47.25F, -16F, 1.25F);
		bodyModel[319].rotateAngleY = -0.29670597F;

		bodyModel[320].addShapeBox(0F, 0F, 2F, 1, 1, 2, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 95 schnozz door
		bodyModel[320].setRotationPoint(-47.25F, -16F, 1.25F);
		bodyModel[320].rotateAngleY = -0.29670597F;

		bodyModel[321].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 310 schnozz door
		bodyModel[321].setRotationPoint(-47.25F, -16F, 1.25F);
		bodyModel[321].rotateAngleY = -0.29670597F;

		bodyModel[322].addShapeBox(0F, -1F, 3F, 1, 1, 2, 0F,0F, -1F, 0F, -0.35F, -1F, 0F, -0.35F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 310 schnozz door
		bodyModel[322].setRotationPoint(-45.75F, -16F, -6F);
		bodyModel[322].rotateAngleY = 0.29670597F;

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[323].setRotationPoint(49.25F, 0.15F, -6F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435 WHY GE, JUST WHY
		bodyModel[324].setRotationPoint(-50.5F, -1F, 3.5F);
		bodyModel[324].rotateAngleY = -0.2268928F;

		bodyModel[325].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 435 WHY GE, JUST WHY
		bodyModel[325].setRotationPoint(-50.5F, 0F, 3.5F);
		bodyModel[325].rotateAngleY = -0.2268928F;

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[326].setRotationPoint(49.25F, 0.15F, 4F);

		bodyModel[327].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 444 cull
		bodyModel[327].setRotationPoint(49F, 0.15F, -6F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[328].setRotationPoint(-27F, -25F, -4.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 232 Why don't you locate some Bitches
		bodyModel[329].setRotationPoint(-27F, -25.25F, -4.5F);

		bodyModel[330].addBox(0F, 0F, 0F, 6, 1, 14, 0F); // Box 233 ES44 goes bump in the night
		bodyModel[330].setRotationPoint(13F, -22F, -7F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.375F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.375F, 0F); // Box 247 Support for Rear Horizontal HL
		bodyModel[331].setRotationPoint(45F, -20F, -2F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear Horizontal
		bodyModel[332].setRotationPoint(45F, -20F, -2F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear Horizontal
		bodyModel[333].setRotationPoint(45F, -20F, 0F);

		bodyModel[334].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 131
		bodyModel[334].setRotationPoint(42F, -19F, -2F);

		bodyModel[335].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 131
		bodyModel[335].setRotationPoint(42F, -19F, 1F);

		bodyModel[336].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 422 rear sanscap cover
		bodyModel[336].setRotationPoint(42F, -19F, -1F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233 ECO-radiator
		bodyModel[337].setRotationPoint(19F, -24F, -7F);

		bodyModel[338].addShapeBox(0F, -1F, 0F, 12, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233 ECO-radiator
		bodyModel[338].setRotationPoint(19F, -23F, -11F);

		bodyModel[339].addShapeBox(0F, -1F, 0F, 12, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233 ECO-radiator
		bodyModel[339].setRotationPoint(19F, -23F, 7F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[340].setRotationPoint(22F, -19F, -11F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 119
		bodyModel[341].setRotationPoint(29F, -19F, 7F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 119
		bodyModel[342].setRotationPoint(22F, -19F, 7F);

		bodyModel[343].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 119 For some reason the Engineer side has this Notch
		bodyModel[343].setRotationPoint(27F, -18F, 7F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 119 For some reason the Engineer side has this Notch
		bodyModel[344].setRotationPoint(27F, -17F, 7F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[345].setRotationPoint(49.25F, -0.85F, 1.5F);

		bodyModel[346].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 444 cull
		bodyModel[346].setRotationPoint(49F, -0.85F, 1.5F);

		bodyModel[347].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 444 cull
		bodyModel[347].setRotationPoint(-50F, 0.15F, 4F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[348].setRotationPoint(-50.75F, 0.15F, -6F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[349].setRotationPoint(-50.75F, 0.15F, 4F);

		bodyModel[350].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 444 cull
		bodyModel[350].setRotationPoint(-50F, 0.15F, -6F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[351].setRotationPoint(-50.75F, -0.85F, -3.5F);

		bodyModel[352].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 444 cull
		bodyModel[352].setRotationPoint(-50F, -0.85F, -3.5F);

		bodyModel[353].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 436 fuel monitor
		bodyModel[353].setRotationPoint(-7.75F, 1F, -11.25F);

		bodyModel[354].addShapeBox(0F, 0F, 0.5F, 27, 1, 19, 0F,0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, -9.4F, 0F, 0F, -9.4F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, -9.4F, 0F, 0F, -9.4F); // Box 547 an exact science
		bodyModel[354].setRotationPoint(31F, -23.87F, 1F);
		bodyModel[354].rotateAngleX = -0.13613568F;

		bodyModel[355].addShapeBox(0F, 0F, -19.5F, 27, 1, 19, 0F,0F, 0F, -9.4F, -14F, 0F, -9.4F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.4F, -14F, 0F, -9.4F, -14F, 0F, 0F, 0F, 0F, 0F); // Box 345 an exact science
		bodyModel[355].setRotationPoint(31F, -23.87F, -1F);
		bodyModel[355].rotateAngleX = 0.13613568F;

		bodyModel[356].addShapeBox(0F, -1F, 0F, 1, 2, 10, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 233 ECO-radiator
		bodyModel[356].setRotationPoint(44F, -23F, -11F);

		bodyModel[357].addShapeBox(0F, -1F, 0F, 1, 2, 10, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233 ECO-radiator
		bodyModel[357].setRotationPoint(44F, -23F, 1F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233 ECO-radiator
		bodyModel[358].setRotationPoint(31F, -24.5F, -1.5F);

		bodyModel[359].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 233 ECO-radiator
		bodyModel[359].setRotationPoint(25.75F, -23F, -2F);

		bodyModel[360].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 233 ECO-radiator
		bodyModel[360].setRotationPoint(21.25F, -23F, -2F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233 ECO-radiator
		bodyModel[361].setRotationPoint(19F, -24F, 3F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233 ECO-radiator
		bodyModel[362].setRotationPoint(19F, -24F, -3F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233 ECO-radiator
		bodyModel[363].setRotationPoint(30F, -24F, -3F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 18, 2, 12, 0F,0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -6F, 0F, 0F, -6F); // Box 233 Roof Fan Cull
		bodyModel[364].setRotationPoint(21F, -24F, -3F);

		bodyModel[365].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 236 Modern Control Stand Desk 
		bodyModel[365].setRotationPoint(-35F, -15F, 5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 280 Modern Control Stand Throttle Tower Front
		bodyModel[366].setRotationPoint(-34F, -17F, 0F);

		bodyModel[367].addShapeBox(0F, 0F, -0.25F, 1, 2, 3, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ES44  cs glow
		bodyModel[367].setRotationPoint(-35.25F, -16.5F, 7F);
		bodyModel[367].rotateAngleZ = 0.2443461F;

		bodyModel[368].addShapeBox(0F, 0F, -0.25F, 1, 2, 3, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ES44 cs glow
		bodyModel[368].setRotationPoint(-35.25F, -16.5F, 4F);
		bodyModel[368].rotateAngleZ = 0.2443461F;

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 Modern Control Stand AB Tower Front
		bodyModel[369].setRotationPoint(-29F, -18F, 2F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11 Modern Control Stand Desk 
		bodyModel[370].setRotationPoint(-33F, -15F, 3F);

		bodyModel[371].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 12 Modern Control Stand Desk 
		bodyModel[371].setRotationPoint(-35F, -15F, 3F);

		bodyModel[372].addBox(0F, 0F, 0F, 3, 11, 2, 0F); // Box 14 Modern Control Stand AB Tower Back
		bodyModel[372].setRotationPoint(-30F, -18F, 0F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 28, 12, 0, 0F,0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -14F, -6F, 0F, -14F, -6F, 0F, 0F, -6F, 0F); // Box 416
		bodyModel[373].setRotationPoint(-22.5F, -23.5F, 7.01F);

		bodyModel[374].addShapeBox(0F, 0F, -5F, 0, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 475
		bodyModel[374].setRotationPoint(-44.5F, -0.5F, 11F);
		bodyModel[374].rotateAngleY = -0.19198622F;

		bodyModel[375].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[375].setRotationPoint(-49F, 8F, 9F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[376].setRotationPoint(-49F, 7F, 9F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.05F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F); // Box 487
		bodyModel[377].setRotationPoint(-49F, 6.25F, 8.25F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[378].setRotationPoint(-49F, 5.25F, 8.25F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[379].setRotationPoint(-49F, 4.5F, 7.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[380].setRotationPoint(-49F, 3.5F, 7.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[381].setRotationPoint(-49F, 2.75F, 6.75F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[382].setRotationPoint(-49F, 1.75F, 6.75F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[383].setRotationPoint(-49F, 0F, 6F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 481
		bodyModel[384].setRotationPoint(-45F, -0.5F, 11F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 483
		bodyModel[385].setRotationPoint(-44F, -0.5F, 11F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 475
		bodyModel[386].setRotationPoint(44.5F, -0.5F, -11F);
		bodyModel[386].rotateAngleY = -0.19198622F;

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 481
		bodyModel[387].setRotationPoint(44F, -0.5F, -11F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 483
		bodyModel[388].setRotationPoint(43F, -0.5F, -11F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F); // Box 485
		bodyModel[389].setRotationPoint(45F, 8F, -11F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F); // Box 486
		bodyModel[390].setRotationPoint(45F, 7F, -9F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F); // Box 487
		bodyModel[391].setRotationPoint(45F, 6.25F, -10.25F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F); // Box 488
		bodyModel[392].setRotationPoint(45F, 5.25F, -8.25F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 489
		bodyModel[393].setRotationPoint(45F, 4.5F, -9.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 490
		bodyModel[394].setRotationPoint(45F, 3.5F, -7.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 491
		bodyModel[395].setRotationPoint(45F, 2.75F, -8.75F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 492
		bodyModel[396].setRotationPoint(45F, 1.75F, -6.75F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 493
		bodyModel[397].setRotationPoint(45F, 0F, -8F);

		bodyModel[398].addShapeBox(0F, 0F, -5F, 0, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 475
		bodyModel[398].setRotationPoint(44.5F, -0.5F, 11F);
		bodyModel[398].rotateAngleY = 0.19198622F;

		bodyModel[399].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.55F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 485
		bodyModel[399].setRotationPoint(45F, 8F, 9F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F); // Box 486
		bodyModel[400].setRotationPoint(45F, 7F, 9F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F); // Box 487
		bodyModel[401].setRotationPoint(45F, 6.25F, 8.25F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F); // Box 488
		bodyModel[402].setRotationPoint(45F, 5.25F, 8.25F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 489
		bodyModel[403].setRotationPoint(45F, 4.5F, 7.5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 490
		bodyModel[404].setRotationPoint(45F, 3.5F, 7.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 491
		bodyModel[405].setRotationPoint(45F, 2.75F, 6.75F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 492
		bodyModel[406].setRotationPoint(45F, 1.75F, 6.75F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 493
		bodyModel[407].setRotationPoint(45F, 0F, 6F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 481
		bodyModel[408].setRotationPoint(44F, -0.5F, 11F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 483
		bodyModel[409].setRotationPoint(43F, -0.5F, 11F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 361
		bodyModel[410].setRotationPoint(44F, -2F, -11F);

		bodyModel[411].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 282
		bodyModel[411].setRotationPoint(44F, 4F, 11.01F);

		bodyModel[412].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 282
		bodyModel[412].setRotationPoint(-45F, 4F, 11.01F);

		bodyModel[413].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 282
		bodyModel[413].setRotationPoint(-45F, 4F, -11.01F);

		bodyModel[414].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 282
		bodyModel[414].setRotationPoint(44F, 4F, -11.01F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377 cull De-flat-ass-inator
		bodyModel[415].setRotationPoint(49F, -2F, -3F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 377 cull De-flat-ass-inator
		bodyModel[416].setRotationPoint(49F, -2F, 3F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377 cull De-flat-ass-inator
		bodyModel[417].setRotationPoint(49F, -2F, -6F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 28, 10, 0, 0F,0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -14F, -5F, 0F, -14F, -5F, 0F, 0F, -5F, 0F); // Box 261
		bodyModel[418].setRotationPoint(-23.5F, -23.5F, -7.01F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear BNSF Funny
		bodyModel[419].setRotationPoint(44.15F, -13.05F, -1F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear BNSF Funny
		bodyModel[420].setRotationPoint(44.15F, -11.05F, -1F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[421].setRotationPoint(-35F, -17F, 3F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0.1F, -6F, 0F, 0.1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, -6F, 0F, -1.9F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[422].setRotationPoint(29.25F, -19F, -9F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0.1F, -6F, 0F, 0.1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, -6F, 0F, -1.9F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[423].setRotationPoint(35.75F, -19F, -9F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1.9F, 0F, 0F, -1.9F); // Box 442
		bodyModel[424].setRotationPoint(29.25F, -19F, 7F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1.9F, 0F, 0F, -1.9F); // Box 442
		bodyModel[425].setRotationPoint(35.75F, -19F, 7F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 282
		bodyModel[426].setRotationPoint(52F, 7F, 0F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 283
		bodyModel[427].setRotationPoint(52F, 7F, -10F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 4
		bodyModel[428].setRotationPoint(51F, 6F, 0F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 448
		bodyModel[429].setRotationPoint(51F, 4F, 2F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 322
		bodyModel[430].setRotationPoint(51F, 6F, -10F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[431].setRotationPoint(51F, 4F, -10F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 280
		bodyModel[432].setRotationPoint(51F, 3F, 2F);

		bodyModel[433].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[433].setRotationPoint(51F, 3F, -8F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 10, 10, 14, 0F,0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 277
		bodyModel[434].setRotationPoint(23F, -16F, -7F);

		bodyModel[435].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 396
		bodyModel[435].setRotationPoint(-45F, -10F, -7F);
		bodyModel[435].rotateAngleY = -3.14159265F;

		bodyModel[436].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 396
		bodyModel[436].setRotationPoint(-45F, -10F, 8F);
		bodyModel[436].rotateAngleY = -3.14159265F;

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyModel[437].setRotationPoint(44F, -24F, -1.5F);
	}
	Modelge_hiad bogie = new Modelge_hiad();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 14 || GetColor(entity) == 17 || GetColor(entity) == 230) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/ge_hiad_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-2F, 0.0F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}else if (GetColor(entity) == 11 || GetColor(entity) == 15437) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/ge_hiad_youpee.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-2F, 0.0F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/ge_hiad_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-2.0F, -0.0F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4.0F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}
	}
}