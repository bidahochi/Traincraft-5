//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 11.03.2023 - 01:19:56
// Last changed on: 11.03.2023 - 01:19:56

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


public class ModelAC44C extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelAC44C() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[429];

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
		bodyModel[4] = new ModelRendererTurbo(this, 16, 172, textureX, textureY); // Box 197
		bodyModel[5] = new ModelRendererTurbo(this, 46, 153, textureX, textureY); // Box 61
		bodyModel[6] = new ModelRendererTurbo(this, 90, 153, textureX, textureY); // Box 63
		bodyModel[7] = new ModelRendererTurbo(this, 396, 213, textureX, textureY); // Box 19
		bodyModel[8] = new ModelRendererTurbo(this, 73, 197, textureX, textureY); // Box 440
		bodyModel[9] = new ModelRendererTurbo(this, 73, 197, textureX, textureY); // Box 441
		bodyModel[10] = new ModelRendererTurbo(this, 413, 221, textureX, textureY); // Box 19 reg cap
		bodyModel[11] = new ModelRendererTurbo(this, 423, 221, textureX, textureY); // Box 19
		bodyModel[12] = new ModelRendererTurbo(this, 1, 192, textureX, textureY); // Box 193
		bodyModel[13] = new ModelRendererTurbo(this, 267, 198, textureX, textureY); // Box 318
		bodyModel[14] = new ModelRendererTurbo(this, 88, 163, textureX, textureY); // Box 321
		bodyModel[15] = new ModelRendererTurbo(this, 18, 170, textureX, textureY); // Box 412
		bodyModel[16] = new ModelRendererTurbo(this, 298, 201, textureX, textureY); // Box 322
		bodyModel[17] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 96
		bodyModel[18] = new ModelRendererTurbo(this, 250, 75, textureX, textureY); // Box 97
		bodyModel[19] = new ModelRendererTurbo(this, 413, 81, textureX, textureY); // Box 124
		bodyModel[20] = new ModelRendererTurbo(this, 443, 81, textureX, textureY); // Box 130
		bodyModel[21] = new ModelRendererTurbo(this, 432, 94, textureX, textureY); // Box 131
		bodyModel[22] = new ModelRendererTurbo(this, 310, 57, textureX, textureY); // Box 2 this was EXHAUSTING to make haha
		bodyModel[23] = new ModelRendererTurbo(this, 331, 69, textureX, textureY); // Box 97
		bodyModel[24] = new ModelRendererTurbo(this, 331, 55, textureX, textureY); // Box 97
		bodyModel[25] = new ModelRendererTurbo(this, 329, 61, textureX, textureY); // Box 97
		bodyModel[26] = new ModelRendererTurbo(this, 382, 43, textureX, textureY); // Box 219
		bodyModel[27] = new ModelRendererTurbo(this, 394, 36, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 394, 43, textureX, textureY, "lamp"); // Box 247 headlight rear
		bodyModel[29] = new ModelRendererTurbo(this, 394, 43, textureX, textureY, "lamp"); // Box 248 headlight rear
		bodyModel[30] = new ModelRendererTurbo(this, 401, 22, textureX, textureY); // Box 88
		bodyModel[31] = new ModelRendererTurbo(this, 311, 13, textureX, textureY); // Box 119
		bodyModel[32] = new ModelRendererTurbo(this, 346, 18, textureX, textureY); // Box 127
		bodyModel[33] = new ModelRendererTurbo(this, 311, 13, textureX, textureY); // Box 128
		bodyModel[34] = new ModelRendererTurbo(this, 346, 24, textureX, textureY); // Box 130
		bodyModel[35] = new ModelRendererTurbo(this, 348, 14, textureX, textureY); // Box 135
		bodyModel[36] = new ModelRendererTurbo(this, 348, 30, textureX, textureY); // Box 136
		bodyModel[37] = new ModelRendererTurbo(this, 432, 80, textureX, textureY); // Box 132
		bodyModel[38] = new ModelRendererTurbo(this, 390, 36, textureX, textureY); // Box 233
		bodyModel[39] = new ModelRendererTurbo(this, 14, 185, textureX, textureY); // Box 4
		bodyModel[40] = new ModelRendererTurbo(this, 1, 183, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 1, 183, textureX, textureY); // Box 211
		bodyModel[42] = new ModelRendererTurbo(this, 14, 185, textureX, textureY); // Box 212
		bodyModel[43] = new ModelRendererTurbo(this, 76, 146, textureX, textureY, "cull"); // Box 162 cull
		bodyModel[44] = new ModelRendererTurbo(this, 63, 148, textureX, textureY, "cull"); // Box 163 cull
		bodyModel[45] = new ModelRendererTurbo(this, 46, 146, textureX, textureY, "cull"); // Box 164 cull
		bodyModel[46] = new ModelRendererTurbo(this, 217, 48, textureX, textureY); // Box 138
		bodyModel[47] = new ModelRendererTurbo(this, 229, 93, textureX, textureY, "cull"); // Box 138 cull
		bodyModel[48] = new ModelRendererTurbo(this, 188, 48, textureX, textureY); // Box 254 D9 WALKWAY
		bodyModel[49] = new ModelRendererTurbo(this, 51, 146, textureX, textureY); // Box 21
		bodyModel[50] = new ModelRendererTurbo(this, 125, 84, textureX, textureY); // Box 284
		bodyModel[51] = new ModelRendererTurbo(this, 401, 8, textureX, textureY); // Box 312
		bodyModel[52] = new ModelRendererTurbo(this, 162, 75, textureX, textureY); // Box 325
		bodyModel[53] = new ModelRendererTurbo(this, 146, 112, textureX, textureY); // Box 326
		bodyModel[54] = new ModelRendererTurbo(this, 391, 35, textureX, textureY); // Box 398
		bodyModel[55] = new ModelRendererTurbo(this, 391, 35, textureX, textureY); // Box 399
		bodyModel[56] = new ModelRendererTurbo(this, 283, 51, textureX, textureY); // Box 435 AC intake A
		bodyModel[57] = new ModelRendererTurbo(this, 302, 134, textureX, textureY); // Box 282
		bodyModel[58] = new ModelRendererTurbo(this, 348, 134, textureX, textureY); // Box 283
		bodyModel[59] = new ModelRendererTurbo(this, 315, 132, textureX, textureY); // Box 4
		bodyModel[60] = new ModelRendererTurbo(this, 328, 131, textureX, textureY); // Box 448
		bodyModel[61] = new ModelRendererTurbo(this, 361, 132, textureX, textureY); // Box 322
		bodyModel[62] = new ModelRendererTurbo(this, 374, 131, textureX, textureY); // Box 323
		bodyModel[63] = new ModelRendererTurbo(this, 339, 129, textureX, textureY); // Box 280
		bodyModel[64] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 285
		bodyModel[65] = new ModelRendererTurbo(this, 460, 192, textureX, textureY); // Box 434
		bodyModel[66] = new ModelRendererTurbo(this, 333, 158, textureX, textureY); // Box 435
		bodyModel[67] = new ModelRendererTurbo(this, 166, 61, textureX, textureY); // Box 233
		bodyModel[68] = new ModelRendererTurbo(this, 166, 57, textureX, textureY); // Box 234
		bodyModel[69] = new ModelRendererTurbo(this, 166, 59, textureX, textureY); // Box 235
		bodyModel[70] = new ModelRendererTurbo(this, 399, 83, textureX, textureY); // Box 276
		bodyModel[71] = new ModelRendererTurbo(this, 402, 80, textureX, textureY); // Box 277
		bodyModel[72] = new ModelRendererTurbo(this, 308, 66, textureX, textureY); // Box 314
		bodyModel[73] = new ModelRendererTurbo(this, 48, 163, textureX, textureY); // Box 301
		bodyModel[74] = new ModelRendererTurbo(this, 16, 167, textureX, textureY); // Box 302
		bodyModel[75] = new ModelRendererTurbo(this, 18, 165, textureX, textureY); // Box 303
		bodyModel[76] = new ModelRendererTurbo(this, 16, 162, textureX, textureY); // Box 304
		bodyModel[77] = new ModelRendererTurbo(this, 18, 160, textureX, textureY); // Box 305
		bodyModel[78] = new ModelRendererTurbo(this, 16, 157, textureX, textureY); // Box 306
		bodyModel[79] = new ModelRendererTurbo(this, 18, 155, textureX, textureY); // Box 307
		bodyModel[80] = new ModelRendererTurbo(this, 1, 204, textureX, textureY); // Box 23
		bodyModel[81] = new ModelRendererTurbo(this, 2, 223, textureX, textureY); // Box 63
		bodyModel[82] = new ModelRendererTurbo(this, 54, 166, textureX, textureY); // Box 325
		bodyModel[83] = new ModelRendererTurbo(this, 444, 72, textureX, textureY); // Box 133
		bodyModel[84] = new ModelRendererTurbo(this, 414, 72, textureX, textureY); // Box 173
		bodyModel[85] = new ModelRendererTurbo(this, 432, 76, textureX, textureY); // Box 294
		bodyModel[86] = new ModelRendererTurbo(this, 165, 156, textureX, textureY, "cull"); // Box 295 culll frame
		bodyModel[87] = new ModelRendererTurbo(this, 165, 170, textureX, textureY, "cull"); // Box 296 culll frame
		bodyModel[88] = new ModelRendererTurbo(this, 398, 205, textureX, textureY); // Box 450
		bodyModel[89] = new ModelRendererTurbo(this, 331, 210, textureX, textureY); // Box 451
		bodyModel[90] = new ModelRendererTurbo(this, 345, 206, textureX, textureY); // Box 452
		bodyModel[91] = new ModelRendererTurbo(this, 345, 228, textureX, textureY); // Box 453
		bodyModel[92] = new ModelRendererTurbo(this, 398, 228, textureX, textureY); // Box 454
		bodyModel[93] = new ModelRendererTurbo(this, 61, 175, textureX, textureY); // Box 455
		bodyModel[94] = new ModelRendererTurbo(this, 59, 166, textureX, textureY); // Box 456
		bodyModel[95] = new ModelRendererTurbo(this, 165, 163, textureX, textureY, "cull"); // Box 459 cull frame
		bodyModel[96] = new ModelRendererTurbo(this, 149, 156, textureX, textureY); // Box 460
		bodyModel[97] = new ModelRendererTurbo(this, 51, 168, textureX, textureY); // Box 461
		bodyModel[98] = new ModelRendererTurbo(this, 48, 167, textureX, textureY); // Box 462
		bodyModel[99] = new ModelRendererTurbo(this, 45, 168, textureX, textureY); // Box 463
		bodyModel[100] = new ModelRendererTurbo(this, 64, 174, textureX, textureY); // Box 464
		bodyModel[101] = new ModelRendererTurbo(this, 47, 127, textureX, textureY); // Box 466
		bodyModel[102] = new ModelRendererTurbo(this, 113, 115, textureX, textureY); // Box 468
		bodyModel[103] = new ModelRendererTurbo(this, 47, 136, textureX, textureY); // Box 472
		bodyModel[104] = new ModelRendererTurbo(this, 44, 127, textureX, textureY); // Box 473
		bodyModel[105] = new ModelRendererTurbo(this, 75, 166, textureX, textureY); // Box 474
		bodyModel[106] = new ModelRendererTurbo(this, 80, 166, textureX, textureY); // Box 475
		bodyModel[107] = new ModelRendererTurbo(this, 22, 192, textureX, textureY); // Box 476
		bodyModel[108] = new ModelRendererTurbo(this, 70, 174, textureX, textureY); // Box 478
		bodyModel[109] = new ModelRendererTurbo(this, 75, 175, textureX, textureY); // Box 479
		bodyModel[110] = new ModelRendererTurbo(this, 157, 154, textureX, textureY); // Box 480
		bodyModel[111] = new ModelRendererTurbo(this, 88, 167, textureX, textureY); // Box 481
		bodyModel[112] = new ModelRendererTurbo(this, 85, 168, textureX, textureY); // Box 482
		bodyModel[113] = new ModelRendererTurbo(this, 91, 168, textureX, textureY); // Box 483
		bodyModel[114] = new ModelRendererTurbo(this, 3, 172, textureX, textureY); // Box 485
		bodyModel[115] = new ModelRendererTurbo(this, 5, 170, textureX, textureY); // Box 486
		bodyModel[116] = new ModelRendererTurbo(this, 3, 167, textureX, textureY); // Box 487
		bodyModel[117] = new ModelRendererTurbo(this, 5, 165, textureX, textureY); // Box 488
		bodyModel[118] = new ModelRendererTurbo(this, 3, 162, textureX, textureY); // Box 489
		bodyModel[119] = new ModelRendererTurbo(this, 5, 160, textureX, textureY); // Box 490
		bodyModel[120] = new ModelRendererTurbo(this, 3, 157, textureX, textureY); // Box 491
		bodyModel[121] = new ModelRendererTurbo(this, 5, 155, textureX, textureY); // Box 492
		bodyModel[122] = new ModelRendererTurbo(this, 4, 150, textureX, textureY); // Box 493
		bodyModel[123] = new ModelRendererTurbo(this, 398, 210, textureX, textureY); // Box 495
		bodyModel[124] = new ModelRendererTurbo(this, 398, 218, textureX, textureY); // Box 496
		bodyModel[125] = new ModelRendererTurbo(this, 398, 210, textureX, textureY); // Box 497
		bodyModel[126] = new ModelRendererTurbo(this, 396, 213, textureX, textureY); // Box 498
		bodyModel[127] = new ModelRendererTurbo(this, 398, 218, textureX, textureY); // Box 499
		bodyModel[128] = new ModelRendererTurbo(this, 99, 134, textureX, textureY); // Box 317
		bodyModel[129] = new ModelRendererTurbo(this, 101, 146, textureX, textureY); // Box 320
		bodyModel[130] = new ModelRendererTurbo(this, 138, 163, textureX, textureY); // Box 341
		bodyModel[131] = new ModelRendererTurbo(this, 125, 175, textureX, textureY); // Box 342
		bodyModel[132] = new ModelRendererTurbo(this, 120, 174, textureX, textureY); // Box 344
		bodyModel[133] = new ModelRendererTurbo(this, 114, 174, textureX, textureY); // Box 345
		bodyModel[134] = new ModelRendererTurbo(this, 111, 175, textureX, textureY); // Box 346
		bodyModel[135] = new ModelRendererTurbo(this, 98, 163, textureX, textureY); // Box 347
		bodyModel[136] = new ModelRendererTurbo(this, 135, 168, textureX, textureY); // Box 349
		bodyModel[137] = new ModelRendererTurbo(this, 138, 167, textureX, textureY); // Box 350
		bodyModel[138] = new ModelRendererTurbo(this, 141, 168, textureX, textureY); // Box 351
		bodyModel[139] = new ModelRendererTurbo(this, 101, 168, textureX, textureY); // Box 352
		bodyModel[140] = new ModelRendererTurbo(this, 98, 167, textureX, textureY); // Box 353
		bodyModel[141] = new ModelRendererTurbo(this, 95, 168, textureX, textureY); // Box 354
		bodyModel[142] = new ModelRendererTurbo(this, 104, 166, textureX, textureY); // Box 355
		bodyModel[143] = new ModelRendererTurbo(this, 109, 166, textureX, textureY); // Box 356
		bodyModel[144] = new ModelRendererTurbo(this, 130, 166, textureX, textureY); // Box 358
		bodyModel[145] = new ModelRendererTurbo(this, 125, 166, textureX, textureY); // Box 359
		bodyModel[146] = new ModelRendererTurbo(this, 149, 163, textureX, textureY); // Box 361
		bodyModel[147] = new ModelRendererTurbo(this, 157, 161, textureX, textureY); // Box 362
		bodyModel[148] = new ModelRendererTurbo(this, 124, 156, textureX, textureY); // Box 363
		bodyModel[149] = new ModelRendererTurbo(this, 52, 192, textureX, textureY); // Box 367
		bodyModel[150] = new ModelRendererTurbo(this, 37, 192, textureX, textureY); // Box 368
		bodyModel[151] = new ModelRendererTurbo(this, 100, 118, textureX, textureY); // Box 383
		bodyModel[152] = new ModelRendererTurbo(this, 136, 118, textureX, textureY); // Box 384
		bodyModel[153] = new ModelRendererTurbo(this, 103, 103, textureX, textureY); // Box 387
		bodyModel[154] = new ModelRendererTurbo(this, 115, 127, textureX, textureY); // Box 388
		bodyModel[155] = new ModelRendererTurbo(this, 121, 127, textureX, textureY); // Box 389
		bodyModel[156] = new ModelRendererTurbo(this, 419, 211, textureX, textureY); // Box 390
		bodyModel[157] = new ModelRendererTurbo(this, 419, 211, textureX, textureY); // Box 391
		bodyModel[158] = new ModelRendererTurbo(this, 419, 211, textureX, textureY); // Box 392
		bodyModel[159] = new ModelRendererTurbo(this, 419, 211, textureX, textureY); // Box 393
		bodyModel[160] = new ModelRendererTurbo(this, 298, 215, textureX, textureY); // Box 394
		bodyModel[161] = new ModelRendererTurbo(this, 298, 215, textureX, textureY); // Box 395
		bodyModel[162] = new ModelRendererTurbo(this, 240, 215, textureX, textureY); // Box 396
		bodyModel[163] = new ModelRendererTurbo(this, 240, 201, textureX, textureY); // Box 399
		bodyModel[164] = new ModelRendererTurbo(this, 209, 198, textureX, textureY); // Box 400
		bodyModel[165] = new ModelRendererTurbo(this, 240, 215, textureX, textureY); // Box 401
		bodyModel[166] = new ModelRendererTurbo(this, 132, 179, textureX, textureY, "cull"); // Box 402 lots of little pipes
		bodyModel[167] = new ModelRendererTurbo(this, 210, 208, textureX, textureY); // Box 403
		bodyModel[168] = new ModelRendererTurbo(this, 221, 206, textureX, textureY); // Box 404
		bodyModel[169] = new ModelRendererTurbo(this, 148, 188, textureX, textureY, "cull"); // Box 405 lots of little pipes 2
		bodyModel[170] = new ModelRendererTurbo(this, 291, 189, textureX, textureY, "cull"); // Box 406 lots of little pipes 2 a
		bodyModel[171] = new ModelRendererTurbo(this, 327, 184, textureX, textureY, "cull"); // Box 407 lot of little pipes 3a
		bodyModel[172] = new ModelRendererTurbo(this, 327, 184, textureX, textureY, "cull"); // Box 408 lot of little pipes 3b
		bodyModel[173] = new ModelRendererTurbo(this, 327, 184, textureX, textureY, "cull"); // Box 409 lot of little pipes 3c
		bodyModel[174] = new ModelRendererTurbo(this, 418, 210, textureX, textureY); // Box 61
		bodyModel[175] = new ModelRendererTurbo(this, 418, 210, textureX, textureY); // Box 62
		bodyModel[176] = new ModelRendererTurbo(this, 418, 210, textureX, textureY); // Box 412
		bodyModel[177] = new ModelRendererTurbo(this, 418, 210, textureX, textureY); // Box 413
		bodyModel[178] = new ModelRendererTurbo(this, 256, 51, textureX, textureY); // Box 414 AC intake B
		bodyModel[179] = new ModelRendererTurbo(this, 263, 45, textureX, textureY); // Box 415 D9 intake
		bodyModel[180] = new ModelRendererTurbo(this, 283, 51, textureX, textureY); // Box 435 AC intake A
		bodyModel[181] = new ModelRendererTurbo(this, 256, 51, textureX, textureY); // Box 414 AC intake B
		bodyModel[182] = new ModelRendererTurbo(this, 146, 121, textureX, textureY); // Box 418 handrails no d9 ac - handrails ac44
		bodyModel[183] = new ModelRendererTurbo(this, 236, 141, textureX, textureY); // Box 420 AC4400 EXTENDUS
		bodyModel[184] = new ModelRendererTurbo(this, 192, 30, textureX, textureY); // Box 421 AC4400 INVERTER
		bodyModel[185] = new ModelRendererTurbo(this, 231, 30, textureX, textureY); // Box 422 AC4400 THING
		bodyModel[186] = new ModelRendererTurbo(this, 244, 40, textureX, textureY); // Box 423 AC4400 CAPACITOR
		bodyModel[187] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 424 ac44 handrails
		bodyModel[188] = new ModelRendererTurbo(this, 177, 123, textureX, textureY); // Box 425 ac44 handrails
		bodyModel[189] = new ModelRendererTurbo(this, 242, 97, textureX, textureY); // Box 426 ac4400 super special step part
		bodyModel[190] = new ModelRendererTurbo(this, 432, 88, textureX, textureY); // Box 422 rear sanscap cover
		bodyModel[191] = new ModelRendererTurbo(this, 159, 51, textureX, textureY); // Box 114
		bodyModel[192] = new ModelRendererTurbo(this, 159, 48, textureX, textureY); // Box 74
		bodyModel[193] = new ModelRendererTurbo(this, 159, 54, textureX, textureY); // Box 78
		bodyModel[194] = new ModelRendererTurbo(this, 152, 70, textureX, textureY); // Box 136
		bodyModel[195] = new ModelRendererTurbo(this, 152, 66, textureX, textureY); // Box 287
		bodyModel[196] = new ModelRendererTurbo(this, 152, 62, textureX, textureY); // Box 288
		bodyModel[197] = new ModelRendererTurbo(this, 164, 48, textureX, textureY); // Box 289
		bodyModel[198] = new ModelRendererTurbo(this, 151, 45, textureX, textureY); // Box 430
		bodyModel[199] = new ModelRendererTurbo(this, 57, 147, textureX, textureY); // Box 435
		bodyModel[200] = new ModelRendererTurbo(this, 77, 147, textureX, textureY); // Box 436
		bodyModel[201] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 440 honse
		bodyModel[202] = new ModelRendererTurbo(this, 374, 39, textureX, textureY); // Box 361
		bodyModel[203] = new ModelRendererTurbo(this, 351, 40, textureX, textureY); // Box 362
		bodyModel[204] = new ModelRendererTurbo(this, 367, 40, textureX, textureY); // Box 363
		bodyModel[205] = new ModelRendererTurbo(this, 360, 40, textureX, textureY); // Box 364
		bodyModel[206] = new ModelRendererTurbo(this, 38, 14, textureX, textureY); // Box 7
		bodyModel[207] = new ModelRendererTurbo(this, 7, 14, textureX, textureY); // Box 24
		bodyModel[208] = new ModelRendererTurbo(this, 112, 1, textureX, textureY); // Box 28
		bodyModel[209] = new ModelRendererTurbo(this, 151, 1, textureX, textureY); // Box 30
		bodyModel[210] = new ModelRendererTurbo(this, 122, 35, textureX, textureY); // Box 52 door swing right
		bodyModel[211] = new ModelRendererTurbo(this, 190, 10, textureX, textureY); // Box 314 door swing right
		bodyModel[212] = new ModelRendererTurbo(this, 71, 2, textureX, textureY); // Box 266
		bodyModel[213] = new ModelRendererTurbo(this, 119, 4, textureX, textureY); // Box 268
		bodyModel[214] = new ModelRendererTurbo(this, 35, 5, textureX, textureY); // Box 271
		bodyModel[215] = new ModelRendererTurbo(this, 111, 51, textureX, textureY); // Box 285
		bodyModel[216] = new ModelRendererTurbo(this, 200, 100, textureX, textureY); // Box 460
		bodyModel[217] = new ModelRendererTurbo(this, 34, 31, textureX, textureY); // Box 298
		bodyModel[218] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 279
		bodyModel[219] = new ModelRendererTurbo(this, 88, 39, textureX, textureY); // Box 282
		bodyModel[220] = new ModelRendererTurbo(this, 73, 39, textureX, textureY); // Box 283
		bodyModel[221] = new ModelRendererTurbo(this, 106, 39, textureX, textureY); // Box 297
		bodyModel[222] = new ModelRendererTurbo(this, 69, 21, textureX, textureY); // Box 298
		bodyModel[223] = new ModelRendererTurbo(this, 87, 19, textureX, textureY); // Box 299
		bodyModel[224] = new ModelRendererTurbo(this, 82, 31, textureX, textureY); // Box 300
		bodyModel[225] = new ModelRendererTurbo(this, 97, 29, textureX, textureY); // Box 301
		bodyModel[226] = new ModelRendererTurbo(this, 97, 37, textureX, textureY); // Box 302
		bodyModel[227] = new ModelRendererTurbo(this, 48, 59, textureX, textureY); // Box 275
		bodyModel[228] = new ModelRendererTurbo(this, 32, 61, textureX, textureY); // Box 688
		bodyModel[229] = new ModelRendererTurbo(this, 75, 64, textureX, textureY); // Box 210
		bodyModel[230] = new ModelRendererTurbo(this, 97, 64, textureX, textureY); // Box 317
		bodyModel[231] = new ModelRendererTurbo(this, 97, 62, textureX, textureY); // Box 318
		bodyModel[232] = new ModelRendererTurbo(this, 97, 70, textureX, textureY); // Box 319
		bodyModel[233] = new ModelRendererTurbo(this, 97, 72, textureX, textureY); // Box 220
		bodyModel[234] = new ModelRendererTurbo(this, 90, 153, textureX, textureY); // Box 350
		bodyModel[235] = new ModelRendererTurbo(this, 46, 153, textureX, textureY); // Box 351
		bodyModel[236] = new ModelRendererTurbo(this, 168, 199, textureX, textureY); // Box 123
		bodyModel[237] = new ModelRendererTurbo(this, 149, 199, textureX, textureY); // Box 311
		bodyModel[238] = new ModelRendererTurbo(this, 116, 134, textureX, textureY, "lamp"); // Box 247 Headlight Front
		bodyModel[239] = new ModelRendererTurbo(this, 116, 134, textureX, textureY, "lamp"); // Box 248 Headlight Front
		bodyModel[240] = new ModelRendererTurbo(this, 108, 137, textureX, textureY); // Box 296
		bodyModel[241] = new ModelRendererTurbo(this, 132, 133, textureX, textureY, "lamp"); // Box 352 headlight nose
		bodyModel[242] = new ModelRendererTurbo(this, 127, 136, textureX, textureY, "lamp"); // Box 353 headlight nose
		bodyModel[243] = new ModelRendererTurbo(this, 120, 137, textureX, textureY); // Box 354
		bodyModel[244] = new ModelRendererTurbo(this, 87, 123, textureX, textureY); // Box 300
		bodyModel[245] = new ModelRendererTurbo(this, 82, 123, textureX, textureY); // Box 369
		bodyModel[246] = new ModelRendererTurbo(this, 86, 177, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[247] = new ModelRendererTurbo(this, 78, 180, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[248] = new ModelRendererTurbo(this, 17, 150, textureX, textureY); // Box 314
		bodyModel[249] = new ModelRendererTurbo(this, 133, 66, textureX, textureY); // Box 184 o2 generator
		bodyModel[250] = new ModelRendererTurbo(this, 120, 64, textureX, textureY, BoxName.prime4); // Box 9 PRIME5-4
		bodyModel[251] = new ModelRendererTurbo(this, 120, 64, textureX, textureY, BoxName.prime2); // Box 8 PRIME5-2
		bodyModel[252] = new ModelRendererTurbo(this, 120, 64, textureX, textureY, BoxName.prime3); // Box 7 PRIME5-3
		bodyModel[253] = new ModelRendererTurbo(this, 120, 64, textureX, textureY, BoxName.prime1); // Box 6 PRIME5-1
		bodyModel[254] = new ModelRendererTurbo(this, 120, 68, textureX, textureY); // Box 421 prime base
		bodyModel[255] = new ModelRendererTurbo(this, 120, 72, textureX, textureY); // Box 355 prime base
		bodyModel[256] = new ModelRendererTurbo(this, 132, 61, textureX, textureY); // Box 566
		bodyModel[257] = new ModelRendererTurbo(this, 132, 61, textureX, textureY); // Box 565
		bodyModel[258] = new ModelRendererTurbo(this, 132, 61, textureX, textureY); // Box 564
		bodyModel[259] = new ModelRendererTurbo(this, 130, 56, textureX, textureY, "cull"); // Box 561 cull bell holder
		bodyModel[260] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[261] = new ModelRendererTurbo(this, 37, 130, textureX, textureY); // Box 144
		bodyModel[262] = new ModelRendererTurbo(this, 23, 129, textureX, textureY); // Box 80
		bodyModel[263] = new ModelRendererTurbo(this, 15, 130, textureX, textureY); // Box 148
		bodyModel[264] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 147
		bodyModel[265] = new ModelRendererTurbo(this, 123, 110, textureX, textureY); // Box 300
		bodyModel[266] = new ModelRendererTurbo(this, 35, 125, textureX, textureY); // Box 301
		bodyModel[267] = new ModelRendererTurbo(this, 173, 141, textureX, textureY); // Box 333
		bodyModel[268] = new ModelRendererTurbo(this, 113, 148, textureX, textureY, "cull"); // Box 377 cull
		bodyModel[269] = new ModelRendererTurbo(this, 126, 146, textureX, textureY, "cull"); // Box 378 cull
		bodyModel[270] = new ModelRendererTurbo(this, 96, 146, textureX, textureY, "cull"); // Box 379 cull
		bodyModel[271] = new ModelRendererTurbo(this, 127, 147, textureX, textureY); // Box 437
		bodyModel[272] = new ModelRendererTurbo(this, 107, 147, textureX, textureY); // Box 438
		bodyModel[273] = new ModelRendererTurbo(this, 112, 95, textureX, textureY); // Box 341
		bodyModel[274] = new ModelRendererTurbo(this, 120, 110, textureX, textureY); // Box 342
		bodyModel[275] = new ModelRendererTurbo(this, 32, 125, textureX, textureY); // Box 343
		bodyModel[276] = new ModelRendererTurbo(this, 26, 131, textureX, textureY); // Box 344
		bodyModel[277] = new ModelRendererTurbo(this, 23, 131, textureX, textureY); // Box 346
		bodyModel[278] = new ModelRendererTurbo(this, 386, 43, textureX, textureY, "lamp"); // Box 393 numberboard
		bodyModel[279] = new ModelRendererTurbo(this, 386, 43, textureX, textureY, "lamp"); // Box 395 numberboard
		bodyModel[280] = new ModelRendererTurbo(this, 487, 119, textureX, textureY); // Box 318
		bodyModel[281] = new ModelRendererTurbo(this, 407, 165, textureX, textureY); // Box 547 an exact science
		bodyModel[282] = new ModelRendererTurbo(this, 407, 144, textureX, textureY); // Box 345 an exact science
		bodyModel[283] = new ModelRendererTurbo(this, 144, 97, textureX, textureY); // Box 258
		bodyModel[284] = new ModelRendererTurbo(this, 40, 126, textureX, textureY); // Box 81
		bodyModel[285] = new ModelRendererTurbo(this, 54, 129, textureX, textureY); // Box 81
		bodyModel[286] = new ModelRendererTurbo(this, 136, 93, textureX, textureY); // Box 522
		bodyModel[287] = new ModelRendererTurbo(this, 125, 97, textureX, textureY); // Box 244
		bodyModel[288] = new ModelRendererTurbo(this, 163, 59, textureX, textureY); // Box 326
		bodyModel[289] = new ModelRendererTurbo(this, 63, 59, textureX, textureY); // Box 359
		bodyModel[290] = new ModelRendererTurbo(this, 139, 97, textureX, textureY); // Box 246
		bodyModel[291] = new ModelRendererTurbo(this, 18, 127, textureX, textureY); // Box 247
		bodyModel[292] = new ModelRendererTurbo(this, 10, 127, textureX, textureY); // Box 248
		bodyModel[293] = new ModelRendererTurbo(this, 136, 95, textureX, textureY); // Box 249
		bodyModel[294] = new ModelRendererTurbo(this, 132, 97, textureX, textureY); // Box 250
		bodyModel[295] = new ModelRendererTurbo(this, 163, 61, textureX, textureY); // Box 327
		bodyModel[296] = new ModelRendererTurbo(this, 125, 93, textureX, textureY); // Box 280
		bodyModel[297] = new ModelRendererTurbo(this, 125, 95, textureX, textureY); // Box 367
		bodyModel[298] = new ModelRendererTurbo(this, 93, 79, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[299] = new ModelRendererTurbo(this, 95, 74, textureX, textureY); // Box 5
		bodyModel[300] = new ModelRendererTurbo(this, 37, 59, textureX, textureY); // Box 370
		bodyModel[301] = new ModelRendererTurbo(this, 103, 53, textureX, textureY); // Box 371
		bodyModel[302] = new ModelRendererTurbo(this, 106, 68, textureX, textureY); // Box 372
		bodyModel[303] = new ModelRendererTurbo(this, 113, 68, textureX, textureY); // Box 373
		bodyModel[304] = new ModelRendererTurbo(this, 112, 8, textureX, textureY); // Box 374
		bodyModel[305] = new ModelRendererTurbo(this, 38, 11, textureX, textureY); // Box 375
		bodyModel[306] = new ModelRendererTurbo(this, 74, 8, textureX, textureY); // Box 376
		bodyModel[307] = new ModelRendererTurbo(this, 4, 5, textureX, textureY); // Box 377
		bodyModel[308] = new ModelRendererTurbo(this, 67, 4, textureX, textureY); // Box 378
		bodyModel[309] = new ModelRendererTurbo(this, 7, 11, textureX, textureY); // Box 379
		bodyModel[310] = new ModelRendererTurbo(this, 115, 39, textureX, textureY, "lamp"); // Box 301 markerlight glow
		bodyModel[311] = new ModelRendererTurbo(this, 115, 42, textureX, textureY, "lamp"); // Box 344
		bodyModel[312] = new ModelRendererTurbo(this, 4, 110, textureX, textureY); // Box 280
		bodyModel[313] = new ModelRendererTurbo(this, 15, 112, textureX, textureY); // Box 285
		bodyModel[314] = new ModelRendererTurbo(this, 41, 90, textureX, textureY); // Box 727
		bodyModel[315] = new ModelRendererTurbo(this, 28, 92, textureX, textureY); // Box 728
		bodyModel[316] = new ModelRendererTurbo(this, 15, 94, textureX, textureY); // Box 729
		bodyModel[317] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // Box 730
		bodyModel[318] = new ModelRendererTurbo(this, 15, 84, textureX, textureY); // Box 732
		bodyModel[319] = new ModelRendererTurbo(this, 4, 86, textureX, textureY); // Box 734
		bodyModel[320] = new ModelRendererTurbo(this, 418, 221, textureX, textureY); // Box 356 ac44cap
		bodyModel[321] = new ModelRendererTurbo(this, 324, 43, textureX, textureY); // Box 261
		bodyModel[322] = new ModelRendererTurbo(this, 490, 112, textureX, textureY); // Box 364
		bodyModel[323] = new ModelRendererTurbo(this, 490, 109, textureX, textureY); // Box 363
		bodyModel[324] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 362
		bodyModel[325] = new ModelRendererTurbo(this, 497, 111, textureX, textureY); // Box 361
		bodyModel[326] = new ModelRendererTurbo(this, 156, 36, textureX, textureY); // Box 81
		bodyModel[327] = new ModelRendererTurbo(this, 156, 39, textureX, textureY); // Box 82
		bodyModel[328] = new ModelRendererTurbo(this, 163, 39, textureX, textureY); // Box 83
		bodyModel[329] = new ModelRendererTurbo(this, 163, 42, textureX, textureY); // Box 84
		bodyModel[330] = new ModelRendererTurbo(this, 163, 36, textureX, textureY); // Box 85
		bodyModel[331] = new ModelRendererTurbo(this, 145, 36, textureX, textureY); // Box 361
		bodyModel[332] = new ModelRendererTurbo(this, 112, 127, textureX, textureY); // Box 252
		bodyModel[333] = new ModelRendererTurbo(this, 67, 129, textureX, textureY); // Box 253
		bodyModel[334] = new ModelRendererTurbo(this, 60, 129, textureX, textureY); // Box 278
		bodyModel[335] = new ModelRendererTurbo(this, 124, 127, textureX, textureY); // Box 279
		bodyModel[336] = new ModelRendererTurbo(this, 71, 43, textureX, textureY); // Box 328
		bodyModel[337] = new ModelRendererTurbo(this, 68, 43, textureX, textureY); // Box 329
		bodyModel[338] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f
		bodyModel[339] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f
		bodyModel[340] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 411
		bodyModel[341] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 410
		bodyModel[342] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 242
		bodyModel[343] = new ModelRendererTurbo(this, 160, 145, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r
		bodyModel[344] = new ModelRendererTurbo(this, 160, 145, textureX, textureY, BoxName.ditch); // Box 240 ditchlight r
		bodyModel[345] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 239
		bodyModel[346] = new ModelRendererTurbo(this, 138, 52, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[347] = new ModelRendererTurbo(this, 138, 52, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[348] = new ModelRendererTurbo(this, 138, 52, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[349] = new ModelRendererTurbo(this, 138, 52, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[350] = new ModelRendererTurbo(this, 164, 52, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[351] = new ModelRendererTurbo(this, 139, 56, textureX, textureY); // Box 428 prime base
		bodyModel[352] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[353] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[354] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[355] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[356] = new ModelRendererTurbo(this, 174, 59, textureX, textureY, "cull"); // Box 428 support cull
		bodyModel[357] = new ModelRendererTurbo(this, 138, 42, textureX, textureY); // Box 409 commander base
		bodyModel[358] = new ModelRendererTurbo(this, 138, 38, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[359] = new ModelRendererTurbo(this, 136, 36, textureX, textureY); // Box 563
		bodyModel[360] = new ModelRendererTurbo(this, 133, 36, textureX, textureY); // Box 564
		bodyModel[361] = new ModelRendererTurbo(this, 97, 115, textureX, textureY); // Box 414
		bodyModel[362] = new ModelRendererTurbo(this, 106, 112, textureX, textureY); // Box 415
		bodyModel[363] = new ModelRendererTurbo(this, 97, 112, textureX, textureY); // Box 416
		bodyModel[364] = new ModelRendererTurbo(this, 97, 109, textureX, textureY); // Box 417
		bodyModel[365] = new ModelRendererTurbo(this, 133, 42, textureX, textureY); // Box 114
		bodyModel[366] = new ModelRendererTurbo(this, 133, 45, textureX, textureY); // Box 74
		bodyModel[367] = new ModelRendererTurbo(this, 133, 39, textureX, textureY); // Box 78
		bodyModel[368] = new ModelRendererTurbo(this, 133, 48, textureX, textureY); // Box 245
		bodyModel[369] = new ModelRendererTurbo(this, 133, 2, textureX, textureY); // Box 368
		bodyModel[370] = new ModelRendererTurbo(this, 54, 76, textureX, textureY); // Box 412 cs
		bodyModel[371] = new ModelRendererTurbo(this, 65, 75, textureX, textureY); // Box 413 cs
		bodyModel[372] = new ModelRendererTurbo(this, 65, 83, textureX, textureY); // Box 531 cs
		bodyModel[373] = new ModelRendererTurbo(this, 65, 68, textureX, textureY); // Box 86 cs
		bodyModel[374] = new ModelRendererTurbo(this, 85, 79, textureX, textureY, "lamp"); // Box 412 cs glow
		bodyModel[375] = new ModelRendererTurbo(this, 85, 75, textureX, textureY, "lamp"); // Box 413 cs glow
		bodyModel[376] = new ModelRendererTurbo(this, 28, 69, textureX, textureY, BoxName.ditch); // Box 551 ditchlight f mccloud
		bodyModel[377] = new ModelRendererTurbo(this, 28, 69, textureX, textureY, BoxName.ditch); // Box 550 ditchlight f mccloud
		bodyModel[378] = new ModelRendererTurbo(this, 19, 69, textureX, textureY); // Box 549
		bodyModel[379] = new ModelRendererTurbo(this, 19, 69, textureX, textureY); // Box 548
		bodyModel[380] = new ModelRendererTurbo(this, 28, 74, textureX, textureY, BoxName.ditch); // Box 555 ditchlight r mccloud
		bodyModel[381] = new ModelRendererTurbo(this, 28, 74, textureX, textureY, BoxName.ditch); // Box 554 ditchlight r mccloud
		bodyModel[382] = new ModelRendererTurbo(this, 19, 74, textureX, textureY); // Box 553
		bodyModel[383] = new ModelRendererTurbo(this, 19, 74, textureX, textureY); // Box 552
		bodyModel[384] = new ModelRendererTurbo(this, 18, 170, textureX, textureY); // Box 422
		bodyModel[385] = new ModelRendererTurbo(this, 16, 172, textureX, textureY); // Box 423
		bodyModel[386] = new ModelRendererTurbo(this, 16, 167, textureX, textureY); // Box 424
		bodyModel[387] = new ModelRendererTurbo(this, 18, 165, textureX, textureY); // Box 425
		bodyModel[388] = new ModelRendererTurbo(this, 16, 162, textureX, textureY); // Box 426
		bodyModel[389] = new ModelRendererTurbo(this, 18, 160, textureX, textureY); // Box 427
		bodyModel[390] = new ModelRendererTurbo(this, 16, 157, textureX, textureY); // Box 428
		bodyModel[391] = new ModelRendererTurbo(this, 18, 155, textureX, textureY); // Box 429
		bodyModel[392] = new ModelRendererTurbo(this, 17, 150, textureX, textureY); // Box 430
		bodyModel[393] = new ModelRendererTurbo(this, 4, 150, textureX, textureY); // Box 431
		bodyModel[394] = new ModelRendererTurbo(this, 5, 155, textureX, textureY); // Box 432
		bodyModel[395] = new ModelRendererTurbo(this, 3, 157, textureX, textureY); // Box 433
		bodyModel[396] = new ModelRendererTurbo(this, 5, 160, textureX, textureY); // Box 434
		bodyModel[397] = new ModelRendererTurbo(this, 3, 162, textureX, textureY); // Box 435
		bodyModel[398] = new ModelRendererTurbo(this, 5, 165, textureX, textureY); // Box 436
		bodyModel[399] = new ModelRendererTurbo(this, 3, 167, textureX, textureY); // Box 437
		bodyModel[400] = new ModelRendererTurbo(this, 5, 170, textureX, textureY); // Box 438
		bodyModel[401] = new ModelRendererTurbo(this, 3, 172, textureX, textureY); // Box 439
		bodyModel[402] = new ModelRendererTurbo(this, 320, 28, textureX, textureY); // Box 440
		bodyModel[403] = new ModelRendererTurbo(this, 312, 21, textureX, textureY); // Box 442
		bodyModel[404] = new ModelRendererTurbo(this, 320, 28, textureX, textureY); // Box 445
		bodyModel[405] = new ModelRendererTurbo(this, 312, 21, textureX, textureY); // Box 446
		bodyModel[406] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 418
		bodyModel[407] = new ModelRendererTurbo(this, 124, 156, textureX, textureY); // Box 418
		bodyModel[408] = new ModelRendererTurbo(this, 109, 65, textureX, textureY); // Box 419
		bodyModel[409] = new ModelRendererTurbo(this, 106, 68, textureX, textureY); // Box 420
		bodyModel[410] = new ModelRendererTurbo(this, 113, 68, textureX, textureY); // Box 421
		bodyModel[411] = new ModelRendererTurbo(this, 114, 65, textureX, textureY); // Box 422
		bodyModel[412] = new ModelRendererTurbo(this, 263, 45, textureX, textureY); // Box 415
		bodyModel[413] = new ModelRendererTurbo(this, 271, 32, textureX, textureY); // Box 416
		bodyModel[414] = new ModelRendererTurbo(this, 201, 13, textureX, textureY); // Box 288
		bodyModel[415] = new ModelRendererTurbo(this, 74, 149, textureX, textureY); // Box 417
		bodyModel[416] = new ModelRendererTurbo(this, 74, 147, textureX, textureY); // Box 418
		bodyModel[417] = new ModelRendererTurbo(this, 74, 149, textureX, textureY); // Box 420
		bodyModel[418] = new ModelRendererTurbo(this, 74, 147, textureX, textureY); // Box 421
		bodyModel[419] = new ModelRendererTurbo(this, 244, 10, textureX, textureY); // Box 530 not a fridge
		bodyModel[420] = new ModelRendererTurbo(this, 219, 5, textureX, textureY); // Box 431 backpannel bulgy bit
		bodyModel[421] = new ModelRendererTurbo(this, 103, 53, textureX, textureY); // Box 425
		bodyModel[422] = new ModelRendererTurbo(this, 183, 58, textureX, textureY, "cull"); // Box 423 support cull
		bodyModel[423] = new ModelRendererTurbo(this, 331, 111, textureX, textureY); // Box 336
		bodyModel[424] = new ModelRendererTurbo(this, 317, 113, textureX, textureY, "lamp"); // Box 337 Front Gyralight L
		bodyModel[425] = new ModelRendererTurbo(this, 324, 113, textureX, textureY, "lamp"); // Box 338 Front Gyralight R
		bodyModel[426] = new ModelRendererTurbo(this, 202, 59, textureX, textureY); // Box 333
		bodyModel[427] = new ModelRendererTurbo(this, 192, 58, textureX, textureY, "lamp"); // Box 334 Rear Gyralight L
		bodyModel[428] = new ModelRendererTurbo(this, 199, 58, textureX, textureY, "lamp"); // Box 335 Rear Gyralight R

		bodyModel[0].addBox(0F, 0F, 0F, 88, 1, 5, 0F); // Box 0 culll frame
		bodyModel[0].setRotationPoint(-44F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 24, 3, 20, 0F); // Box 2
		bodyModel[1].setRotationPoint(-12F, 5F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(-49.01F, 0F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 5, 3, 22, 0F); // Box 10
		bodyModel[3].setRotationPoint(-12F, 2F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 197
		bodyModel[4].setRotationPoint(-49F, 8F, 9F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 61
		bodyModel[5].setRotationPoint(-49F, -1F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 63
		bodyModel[6].setRotationPoint(-49F, -1F, -11F);

		bodyModel[7].addBox(0F, -0.5F, 0F, 8, 1, 3, 0F); // Box 19
		bodyModel[7].setRotationPoint(-7F, 3F, 8F);
		bodyModel[7].rotateAngleZ = -0.03490659F;

		bodyModel[8].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440
		bodyModel[8].setRotationPoint(-34F, 2F, -2F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 441
		bodyModel[9].setRotationPoint(30F, 2F, -2F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 19 reg cap
		bodyModel[10].setRotationPoint(-10.5F, 1.5F, -11.5F);
		bodyModel[10].rotateAngleX = 1.22173048F;

		bodyModel[11].addBox(0F, 0F, -1F, 1, 5, 1, 0F); // Box 19
		bodyModel[11].setRotationPoint(-10.5F, 1.5F, 11.5F);
		bodyModel[11].rotateAngleX = -1.22173048F;

		bodyModel[12].addBox(0F, 0F, 0F, 4, 4, 6, 0F); // Box 193
		bodyModel[12].setRotationPoint(-49F, 2F, -3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 22, 0F,-0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 318
		bodyModel[13].setRotationPoint(26F, -1F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[14].setRotationPoint(-49.01F, 7F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 412
		bodyModel[15].setRotationPoint(-49F, 7F, 9F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 322
		bodyModel[16].setRotationPoint(27F, 1F, -11F);

		bodyModel[17].addBox(-1F, 0F, 0F, 23, 3, 14, 0F); // Box 96
		bodyModel[17].setRotationPoint(-23F, -23F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 67, 19, 14, 0F); // Box 97
		bodyModel[18].setRotationPoint(-24F, -20F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 20, 7, 0F,1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 124
		bodyModel[19].setRotationPoint(44F, -21F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 20, 7, 0F,1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 130
		bodyModel[20].setRotationPoint(44F, -21F, 0F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 13, 2, 0F); // Box 131
		bodyModel[21].setRotationPoint(43F, -14F, -1F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 2 this was EXHAUSTING to make haha
		bodyModel[22].setRotationPoint(15F, -23F, -3F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 23, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[23].setRotationPoint(-1F, -21F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 23, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[24].setRotationPoint(-1F, -21F, 3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[25].setRotationPoint(-1F, -21F, -3F);

		bodyModel[26].addShapeBox(-1F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 219
		bodyModel[26].setRotationPoint(44F, -15F, -1F);
		bodyModel[26].rotateAngleZ = 0.78539816F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[27].setRotationPoint(46F, -21.5F, -1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear
		bodyModel[28].setRotationPoint(45.5F, -21.55F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear
		bodyModel[29].setRotationPoint(45.5F, -19.55F, -1F);

		bodyModel[30].addShapeBox(0F, -1F, 0F, 22, 2, 11, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[30].setRotationPoint(22F, -22F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 119
		bodyModel[31].setRotationPoint(26F, -18F, 7F);

		bodyModel[32].addBox(0F, 0F, 0F, 22, 1, 4, 0F); // Box 127
		bodyModel[32].setRotationPoint(22F, -19F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[33].setRotationPoint(26F, -18F, -9F);

		bodyModel[34].addBox(0F, 0F, 0F, 22, 1, 4, 0F); // Box 130
		bodyModel[34].setRotationPoint(22F, -19F, 5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[35].setRotationPoint(22F, -19F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 136
		bodyModel[36].setRotationPoint(22F, -19F, 9F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 132
		bodyModel[37].setRotationPoint(43F, -21F, -1F);

		bodyModel[38].addBox(0F, -1F, 0F, 22, 2, 22, 0F); // Box 233
		bodyModel[38].setRotationPoint(22F, -20F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[39].setRotationPoint(-53F, 3F, -1.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[40].setRotationPoint(-50F, 2.5F, -2.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[41].setRotationPoint(49F, 2.5F, -2.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 212
		bodyModel[42].setRotationPoint(50F, 3F, -1.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 cull
		bodyModel[43].setRotationPoint(-51F, -1F, -8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163 cull
		bodyModel[44].setRotationPoint(-51F, -1F, -2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 164 cull
		bodyModel[45].setRotationPoint(-51F, -1F, 2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[46].setRotationPoint(-24F, -5F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138 cull
		bodyModel[47].setRotationPoint(-9F, -3F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254 D9 WALKWAY
		bodyModel[48].setRotationPoint(-24F, -5F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[49].setRotationPoint(-49F, 8F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 57, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[50].setRotationPoint(-13F, -9F, -11F);

		bodyModel[51].addShapeBox(0F, -1F, 0F, 22, 2, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[51].setRotationPoint(22F, -22F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 49, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[52].setRotationPoint(-5F, -9F, 11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 16, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[53].setRotationPoint(-24F, -13F, 11F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 398
		bodyModel[54].setRotationPoint(43.5F, -19.25F, -8.75F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 399
		bodyModel[55].setRotationPoint(43.5F, -19.25F, 7.75F);

		bodyModel[56].addShapeBox(-1F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 435 AC intake A
		bodyModel[56].setRotationPoint(-6.5F, -22F, -7.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[57].setRotationPoint(-53F, 7F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[58].setRotationPoint(-53F, 7F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[59].setRotationPoint(-52F, 6F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[60].setRotationPoint(-52F, 4F, 2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[61].setRotationPoint(-52F, 6F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[62].setRotationPoint(-52F, 4F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[63].setRotationPoint(-52F, 3F, 2F);

		bodyModel[64].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[64].setRotationPoint(-52F, 3F, -8F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 3, 22, 0F); // Box 434
		bodyModel[65].setRotationPoint(10F, 2F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 17, 3, 19, 0F); // Box 435
		bodyModel[66].setRotationPoint(-7F, 2F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[67].setRotationPoint(-29F, -24F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[68].setRotationPoint(-29F, -24F, -6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[69].setRotationPoint(-27F, -24F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[70].setRotationPoint(30.5F, -11.5F, -7.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[71].setRotationPoint(32F, -10F, -7.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 314
		bodyModel[72].setRotationPoint(14.5F, -21F, -3.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[73].setRotationPoint(-49.01F, 7F, 10F);

		bodyModel[74].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 302
		bodyModel[74].setRotationPoint(-49F, 6F, 7.75F);

		bodyModel[75].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 303
		bodyModel[75].setRotationPoint(-49F, 5F, 7.75F);

		bodyModel[76].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 304
		bodyModel[76].setRotationPoint(-49F, 4F, 7.25F);

		bodyModel[77].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 305
		bodyModel[77].setRotationPoint(-49F, 3F, 7.25F);

		bodyModel[78].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 306
		bodyModel[78].setRotationPoint(-49F, 1.75F, 6.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 307
		bodyModel[79].setRotationPoint(-49F, 0.75F, 6.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 98, 3, 12, 0F); // Box 23
		bodyModel[80].setRotationPoint(-49F, -1F, -6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 98, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[81].setRotationPoint(-49F, 2F, -6.5F);

		bodyModel[82].addBox(0F, 0F, 2F, 0, 7, 2, 0F); // Box 325
		bodyModel[82].setRotationPoint(-45F, 0.5F, 6F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, -0.5F, -1F, 0F, -0.5F, -1F, -2F, -0.5F, -2F, 1F, -0.5F, -2F, 1F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -2F); // Box 133
		bodyModel[83].setRotationPoint(45F, -22F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, -0.5F, -2F, -2F, -0.5F, -2F, 0F, -0.5F, -1F, 1F, -0.5F, -1F, 1F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 173
		bodyModel[84].setRotationPoint(45F, -22F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[85].setRotationPoint(43F, -22F, -1F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 88, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 295 culll frame
		bodyModel[86].setRotationPoint(-44F, 0F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 88, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 296 culll frame
		bodyModel[87].setRotationPoint(-44F, 0F, 6F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 450
		bodyModel[88].setRotationPoint(-12F, 5F, 10F);

		bodyModel[89].addBox(0F, 0F, 0F, 24, 1, 16, 0F); // Box 451
		bodyModel[89].setRotationPoint(-12F, 8F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 24, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 452
		bodyModel[90].setRotationPoint(-12F, 8F, 8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 24, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[91].setRotationPoint(-12F, 8F, -10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[92].setRotationPoint(-12F, 5F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[93].setRotationPoint(-45F, 7F, 10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[94].setRotationPoint(-45F, 0.5F, 6F);

		bodyModel[95].addBox(0F, 0F, 0F, 88, 1, 5, 0F); // Box 459 cull frame
		bodyModel[95].setRotationPoint(-44F, -1F, 6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 460
		bodyModel[96].setRotationPoint(-45F, -1F, 6F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 461
		bodyModel[97].setRotationPoint(-45F, 0.5F, 10F);

		bodyModel[98].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 462
		bodyModel[98].setRotationPoint(-44F, 0.5F, 10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[99].setRotationPoint(-44F, 0.5F, 11F);

		bodyModel[100].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 464
		bodyModel[100].setRotationPoint(-45.02F, 7F, 8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[101].setRotationPoint(-49F, -9F, 11F);
		bodyModel[101].rotateAngleY = -3.14159265F;

		bodyModel[102].addShapeBox(0F, 0F, -1F, 0, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[102].setRotationPoint(-49F, -8F, 8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[103].setRotationPoint(-49F, -9F, -10F);
		bodyModel[103].rotateAngleY = -3.14159265F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 473
		bodyModel[104].setRotationPoint(-49F, -8F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 474
		bodyModel[105].setRotationPoint(-45F, 0.5F, -8F);

		bodyModel[106].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 475
		bodyModel[106].setRotationPoint(-45F, 0.5F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[107].setRotationPoint(-45F, 2F, -3F);

		bodyModel[108].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 478
		bodyModel[108].setRotationPoint(-45.02F, 7F, -10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[109].setRotationPoint(-45F, 7F, -11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 480
		bodyModel[110].setRotationPoint(-45F, -1F, -11F);

		bodyModel[111].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 481
		bodyModel[111].setRotationPoint(-44F, 0.5F, -11F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 482
		bodyModel[112].setRotationPoint(-45F, 0.5F, -10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[113].setRotationPoint(-44F, 0.5F, -11F);

		bodyModel[114].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 485
		bodyModel[114].setRotationPoint(-49F, 8F, -11F);

		bodyModel[115].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 486
		bodyModel[115].setRotationPoint(-49F, 7F, -9F);

		bodyModel[116].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 487
		bodyModel[116].setRotationPoint(-49F, 6.25F, -9.75F);

		bodyModel[117].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 488
		bodyModel[117].setRotationPoint(-49F, 5.25F, -7.75F);

		bodyModel[118].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 489
		bodyModel[118].setRotationPoint(-49F, 4F, -9.25F);

		bodyModel[119].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 490
		bodyModel[119].setRotationPoint(-49F, 3F, -7.25F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 491
		bodyModel[120].setRotationPoint(-49F, 1.75F, -8.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 492
		bodyModel[121].setRotationPoint(-49F, 0.75F, -6.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 493
		bodyModel[122].setRotationPoint(-49F, -0.99F, -7F);

		bodyModel[123].addShapeBox(0F, -1.5F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 495
		bodyModel[123].setRotationPoint(-7F, 3F, 9F);
		bodyModel[123].rotateAngleZ = -0.03490659F;

		bodyModel[124].addShapeBox(0F, 0.5F, 0F, 8, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[124].setRotationPoint(-7F, 3F, 9F);
		bodyModel[124].rotateAngleZ = -0.03490659F;

		bodyModel[125].addShapeBox(-8F, -1.5F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 497
		bodyModel[125].setRotationPoint(10F, 3F, 9F);
		bodyModel[125].rotateAngleZ = 0.03490659F;

		bodyModel[126].addBox(-8F, -0.5F, 0F, 8, 1, 3, 0F); // Box 498
		bodyModel[126].setRotationPoint(10F, 3F, 8F);
		bodyModel[126].rotateAngleZ = 0.03490659F;

		bodyModel[127].addShapeBox(-8F, 0.5F, 0F, 8, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[127].setRotationPoint(10F, 3F, 9F);
		bodyModel[127].rotateAngleZ = 0.03490659F;

		bodyModel[128].addBox(0F, 0F, 0F, 0, 9, 20, 0F); // Box 317
		bodyModel[128].setRotationPoint(49.01F, -1F, -10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[129].setRotationPoint(49.02F, 8F, -9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[130].setRotationPoint(49.01F, 7F, 10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[131].setRotationPoint(45F, 7F, 10F);

		bodyModel[132].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 344
		bodyModel[132].setRotationPoint(45.02F, 7F, 8F);

		bodyModel[133].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 345
		bodyModel[133].setRotationPoint(45.02F, 7F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[134].setRotationPoint(45F, 7F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[135].setRotationPoint(49.01F, 7F, -11F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 349
		bodyModel[136].setRotationPoint(44F, 0.5F, 10F);

		bodyModel[137].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 350
		bodyModel[137].setRotationPoint(44F, 0.5F, 10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 351
		bodyModel[138].setRotationPoint(43F, 0.5F, 11F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 352
		bodyModel[139].setRotationPoint(44F, 0.5F, -10F);

		bodyModel[140].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 353
		bodyModel[140].setRotationPoint(44F, -0.5F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 354
		bodyModel[141].setRotationPoint(43F, -0.5F, -11F);

		bodyModel[142].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 355
		bodyModel[142].setRotationPoint(45F, 0.5F, -10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 356
		bodyModel[143].setRotationPoint(45F, 0.5F, -8F);

		bodyModel[144].addBox(0F, 0F, 2F, 0, 7, 2, 0F); // Box 358
		bodyModel[144].setRotationPoint(45F, 0.5F, 6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[145].setRotationPoint(45F, 0.5F, 6F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 361
		bodyModel[146].setRotationPoint(44F, -1F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 362
		bodyModel[147].setRotationPoint(44F, -1F, 6F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 0, 20, 0F); // Box 363
		bodyModel[148].setRotationPoint(44F, 0.5F, -10F);

		bodyModel[149].addBox(0F, 0F, 0F, 4, 4, 6, 0F); // Box 367
		bodyModel[149].setRotationPoint(45F, 2F, -3F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 368
		bodyModel[150].setRotationPoint(44F, 2F, -3F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[151].setRotationPoint(49F, -9F, -10F);
		bodyModel[151].rotateAngleY = -3.14159265F;

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[152].setRotationPoint(49F, -9F, 11F);
		bodyModel[152].rotateAngleY = -3.14159265F;

		bodyModel[153].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 387
		bodyModel[153].setRotationPoint(49F, -9F, -8F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 388
		bodyModel[154].setRotationPoint(49F, -8F, -8F);

		bodyModel[155].addShapeBox(0F, 0F, -1F, 0, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[155].setRotationPoint(49F, -8F, 8F);

		bodyModel[156].addBox(-8F, -0.5F, 0F, 0, 2, 3, 0F); // Box 390
		bodyModel[156].setRotationPoint(11.5F, 3.5F, 8F);

		bodyModel[157].addBox(-8F, -0.5F, 0F, 0, 2, 3, 0F); // Box 391
		bodyModel[157].setRotationPoint(16.5F, 3.5F, 8F);

		bodyModel[158].addBox(-8F, -0.5F, 0F, 0, 2, 3, 0F); // Box 392
		bodyModel[158].setRotationPoint(2.5F, 3.5F, 8F);

		bodyModel[159].addBox(-8F, -0.5F, 0F, 0, 2, 3, 0F); // Box 393
		bodyModel[159].setRotationPoint(7.5F, 3.5F, 8F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 394
		bodyModel[160].setRotationPoint(26F, 1F, -9F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 395
		bodyModel[161].setRotationPoint(26F, 1F, 6F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 396
		bodyModel[162].setRotationPoint(-30F, 0F, 6F);

		bodyModel[163].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 399
		bodyModel[163].setRotationPoint(-29F, 1F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 2, 22, 0F,-0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 400
		bodyModel[164].setRotationPoint(-30F, -1F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 401
		bodyModel[165].setRotationPoint(-30F, 1F, -9F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 90, 1, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F); // Box 402 lots of little pipes
		bodyModel[166].setRotationPoint(-45F, 0.5F, 6.99F);

		bodyModel[167].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 403
		bodyModel[167].setRotationPoint(12.5F, 0.5F, 8F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 404
		bodyModel[168].setRotationPoint(-13.5F, 0.5F, 9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 64, 2, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -1.05F, -4F, 0F, -1.05F, -4F); // Box 405 lots of little pipes 2
		bodyModel[169].setRotationPoint(-44.99F, 0.5F, -9.99F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 19, 1, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F); // Box 406 lots of little pipes 2 a
		bodyModel[170].setRotationPoint(19F, 0.5F, -10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 407 lot of little pipes 3a
		bodyModel[171].setRotationPoint(17F, 1F, -10F);
		bodyModel[171].rotateAngleY = 1.57079633F;
		bodyModel[171].rotateAngleZ = -0.19198622F;

		bodyModel[172].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 408 lot of little pipes 3b
		bodyModel[172].setRotationPoint(21F, 0.5F, -10F);
		bodyModel[172].rotateAngleY = 1.57079633F;
		bodyModel[172].rotateAngleZ = -0.27925268F;

		bodyModel[173].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 409 lot of little pipes 3c
		bodyModel[173].setRotationPoint(39F, 0.5F, -10F);
		bodyModel[173].rotateAngleY = 1.57079633F;
		bodyModel[173].rotateAngleZ = -0.31415927F;

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F); // Box 61
		bodyModel[174].setRotationPoint(-15F, 2F, -6F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F); // Box 62
		bodyModel[175].setRotationPoint(-15F, 2F, 5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F); // Box 412
		bodyModel[176].setRotationPoint(12F, 2F, -6F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F); // Box 413
		bodyModel[177].setRotationPoint(12F, 2F, 5F);

		bodyModel[178].addShapeBox(-1F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 414 AC intake B
		bodyModel[178].setRotationPoint(-9.5F, -22F, -7.5F);

		bodyModel[179].addShapeBox(-1F, 0F, 0F, 18, 4, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 415 D9 intake
		bodyModel[179].setRotationPoint(-9.5F, -22F, -7.5F);

		bodyModel[180].addShapeBox(-1F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 435 AC intake A
		bodyModel[180].setRotationPoint(-6.5F, -22F, 6.5F);

		bodyModel[181].addShapeBox(-1F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 414 AC intake B
		bodyModel[181].setRotationPoint(-9.5F, -22F, 6.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 15, 15, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418 handrails no d9 ac - handrails ac44
		bodyModel[182].setRotationPoint(-24F, -20F, -11.01F);

		bodyModel[183].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 420 AC4400 EXTENDUS
		bodyModel[183].setRotationPoint(-14F, 0.5F, -11F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 15, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 AC4400 INVERTER
		bodyModel[184].setRotationPoint(-24F, -14F, -11F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422 AC4400 THING
		bodyModel[185].setRotationPoint(-9F, -14F, -10.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423 AC4400 CAPACITOR
		bodyModel[186].setRotationPoint(-7F, -4F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0.25F, -8F, 0F, 0.25F, -8F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0.25F, 0F, 0F); // Box 424 ac44 handrails
		bodyModel[187].setRotationPoint(-9F, -20F, -11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425 ac44 handrails
		bodyModel[188].setRotationPoint(-3.75F, -12F, -11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426 ac4400 super special step part
		bodyModel[189].setRotationPoint(-9F, -5F, 11F);

		bodyModel[190].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 422 rear sanscap cover
		bodyModel[190].setRotationPoint(43F, -17F, -1F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[191].setRotationPoint(-13.5F, 3.5F, -10.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[192].setRotationPoint(-13.5F, 2.5F, -10.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[193].setRotationPoint(-13.25F, 4F, -10.25F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 136
		bodyModel[194].setRotationPoint(-14F, 4F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 287
		bodyModel[195].setRotationPoint(-14F, 2.5F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 288
		bodyModel[196].setRotationPoint(-14F, 3.5F, -11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 289
		bodyModel[197].setRotationPoint(-13.5F, 4F, -10.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		bodyModel[198].setRotationPoint(-13.5F, 2F, -10.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 435
		bodyModel[199].setRotationPoint(-50F, -0.5F, 3F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 436
		bodyModel[200].setRotationPoint(-50F, -0.5F, -5F);

		bodyModel[201].addBox(0F, 0F, 0F, 0, 4, 8, 0F); // Box 440 honse
		bodyModel[201].setRotationPoint(-49F, 0.5F, -4F);
		bodyModel[201].rotateAngleZ = -0.54105207F;

		bodyModel[202].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 361
		bodyModel[202].setRotationPoint(15F, -22F, -6.5F);

		bodyModel[203].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[203].setRotationPoint(13F, -23F, -5.5F);

		bodyModel[204].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[204].setRotationPoint(14F, -23F, -7.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[205].setRotationPoint(15F, -23F, -6.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 11, 15, 1, 0F); // Box 7
		bodyModel[206].setRotationPoint(-36F, -20F, -11F);

		bodyModel[207].addBox(0F, 0F, 0F, 11, 15, 1, 0F); // Box 24
		bodyModel[207].setRotationPoint(-36F, -20F, 10F);

		bodyModel[208].addBox(0F, 0F, 0F, 1, 15, 18, 0F); // Box 28
		bodyModel[208].setRotationPoint(-25F, -20F, -11F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 15, 18, 0F); // Box 30
		bodyModel[209].setRotationPoint(-37F, -20F, -7F);

		bodyModel[210].addBox(-0.5F, 0F, -0.5F, 1, 15, 4, 0F); // Box 52 door swing right
		bodyModel[210].setRotationPoint(-36.5F, -20F, -10.5F);

		bodyModel[211].addBox(-0.5F, 0F, -3.5F, 1, 15, 4, 0F); // Box 314 door swing right
		bodyModel[211].setRotationPoint(-24.5F, -20F, 10.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 13, 1, 14, 0F); // Box 266
		bodyModel[212].setRotationPoint(-37F, -23F, -7F);

		bodyModel[213].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[213].setRotationPoint(-36F, -23F, -11F);

		bodyModel[214].addShapeBox(-1F, 0F, 0F, 11, 1, 4, 0F,0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[214].setRotationPoint(-35F, -23F, -11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[215].setRotationPoint(-38F, -22F, -2F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 13, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[216].setRotationPoint(-37F, -5F, -11F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 5, 13, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[217].setRotationPoint(-42F, -14F, -7F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 13, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F); // Box 279
		bodyModel[218].setRotationPoint(-45.5F, -14F, -6F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 282
		bodyModel[219].setRotationPoint(-46.5F, -14F, -6F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 283
		bodyModel[220].setRotationPoint(-46.5F, -14F, 0F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 297
		bodyModel[221].setRotationPoint(-46.5F, -15.25F, -6F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 298
		bodyModel[222].setRotationPoint(-42F, -15.25F, -7F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 299
		bodyModel[223].setRotationPoint(-42F, -15.25F, 0F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.7F, 0F, -0.5F, -0.7F, 1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 300
		bodyModel[224].setRotationPoint(-45.5F, -15.25F, -6F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.7F, 1F, 0F, -0.7F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 1F, 0F, 0.25F, 0F); // Box 301
		bodyModel[225].setRotationPoint(-45.5F, -15.25F, 0F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 302
		bodyModel[226].setRotationPoint(-46.5F, -15.25F, 0F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[227].setRotationPoint(-40F, -5F, -11F);

		bodyModel[228].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[228].setRotationPoint(-41F, -5F, -11F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 210
		bodyModel[229].setRotationPoint(-41F, -3F, -10F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 317
		bodyModel[230].setRotationPoint(-45F, -15F, -5.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[231].setRotationPoint(-45F, -15F, 1.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 319
		bodyModel[232].setRotationPoint(-45F, -15F, 5.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 220
		bodyModel[233].setRotationPoint(-45F, -15F, -5.5F);

		bodyModel[234].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 350
		bodyModel[234].setRotationPoint(49F, -1F, -11F);

		bodyModel[235].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 351
		bodyModel[235].setRotationPoint(49F, -1F, 10F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[236].setRotationPoint(-35F, -18.5F, -11F);
		bodyModel[236].rotateAngleX = -0.61086524F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[237].setRotationPoint(-35F, -18.5F, 11F);
		bodyModel[237].rotateAngleX = 0.61086524F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front
		bodyModel[238].setRotationPoint(-39F, -22.2F, -2F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front
		bodyModel[239].setRotationPoint(-39F, -22.2F, 0F);

		bodyModel[240].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 296
		bodyModel[240].setRotationPoint(-38.25F, -22.2F, -2F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 352 headlight nose
		bodyModel[241].setRotationPoint(-47.15F, -14.5F, 0F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 353 headlight nose
		bodyModel[242].setRotationPoint(-47.15F, -14.5F, -2F);

		bodyModel[243].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 354
		bodyModel[243].setRotationPoint(-46.4F, -14.5F, -2F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[244].setRotationPoint(-44.5F, -14.75F, 4F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[245].setRotationPoint(-44.5F, -14.75F, -5F);

		bodyModel[246].addShapeBox(0F, 0F, -5.5F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 117 numberboard
		bodyModel[246].setRotationPoint(-38.2F, -22.37F, -2F);
		bodyModel[246].rotateAngleY = 0.09162979F;

		bodyModel[247].addShapeBox(0F, 0F, 0.5F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 118 numberboard
		bodyModel[247].setRotationPoint(-38.2F, -22.37F, 2F);
		bodyModel[247].rotateAngleY = -0.09162979F;

		bodyModel[248].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 314
		bodyModel[248].setRotationPoint(-49F, -0.95F, 6F);

		bodyModel[249].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[249].setRotationPoint(-34F, -25F, -4F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME5-4
		bodyModel[250].setRotationPoint(-37.5F, -26F, -1F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME5-2
		bodyModel[251].setRotationPoint(-37.5F, -26F, -1F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME5-3
		bodyModel[252].setRotationPoint(-37.5F, -26F, -1F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME5-1
		bodyModel[253].setRotationPoint(-37.5F, -26F, -1F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[254].setRotationPoint(-37.5F, -25.5F, -1F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 355 prime base
		bodyModel[255].setRotationPoint(-36.5F, -24.5F, -5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 566
		bodyModel[256].setRotationPoint(-40F, -20.75F, -0.25F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 565
		bodyModel[257].setRotationPoint(-40.25F, -21.25F, -0.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[258].setRotationPoint(-40.25F, -22.25F, -0.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 561 cull bell holder
		bodyModel[259].setRotationPoint(-40.25F, -22.25F, -1F);

		bodyModel[260].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 145
		bodyModel[260].setRotationPoint(-50F, -9F, -3F);

		bodyModel[261].addBox(0F, 0F, 0F, 0, 8, 4, 0F); // Box 144
		bodyModel[261].setRotationPoint(-49F, -9F, -8F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[262].setRotationPoint(-49F, -9F, -4F);

		bodyModel[263].addBox(0F, 0F, 0F, 0, 8, 4, 0F); // Box 148
		bodyModel[263].setRotationPoint(-49F, -9F, 4F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[264].setRotationPoint(-49F, -9F, 3F);

		bodyModel[265].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 300
		bodyModel[265].setRotationPoint(-50.5F, -9F, -2F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 301
		bodyModel[266].setRotationPoint(-50.5F, -9F, 2F);

		bodyModel[267].addBox(0F, 0F, 0F, 26, 1, 5, 0F); // Box 333
		bodyModel[267].setRotationPoint(-40F, 0.5F, -11F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377 cull
		bodyModel[268].setRotationPoint(49F, -1F, -2F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 378 cull
		bodyModel[269].setRotationPoint(49F, -1F, 2F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379 cull
		bodyModel[270].setRotationPoint(49F, -1F, -8F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 437
		bodyModel[271].setRotationPoint(50F, -0.5F, 3F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 438
		bodyModel[272].setRotationPoint(50F, -0.5F, -5F);

		bodyModel[273].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 341
		bodyModel[273].setRotationPoint(50F, -9F, -3F);

		bodyModel[274].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 342
		bodyModel[274].setRotationPoint(49.5F, -9F, -2F);

		bodyModel[275].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 343
		bodyModel[275].setRotationPoint(49.5F, -9F, 2F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[276].setRotationPoint(49F, -9F, 3F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 346
		bodyModel[277].setRotationPoint(49F, -9F, -4F);

		bodyModel[278].addShapeBox(-1F, 0F, -0.25F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393 numberboard
		bodyModel[278].setRotationPoint(43.55F, -17F, -6F);
		bodyModel[278].rotateAngleY = -0.4712389F;

		bodyModel[279].addBox(-1F, 0F, -4.75F, 1, 2, 5, 0F); // Box 395 numberboard
		bodyModel[279].setRotationPoint(43.55F, -17F, 6F);
		bodyModel[279].rotateAngleY = 0.4712389F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318
		bodyModel[280].setRotationPoint(44.5F, -22.25F, -0.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0.5F, 34, 1, 19, 0F,0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, -9.4F, 0F, 0F, -9.4F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, -9.4F, 0F, 0F, -9.4F); // Box 547 an exact science
		bodyModel[281].setRotationPoint(24.5F, -22.37F, 1F);
		bodyModel[281].rotateAngleX = -0.13613568F;

		bodyModel[282].addShapeBox(0F, 0F, -19.5F, 34, 1, 19, 0F,0F, 0F, -9.4F, -17F, 0F, -9.4F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.4F, -17F, 0F, -9.4F, -17F, 0F, 0F, 0F, 0F, 0F); // Box 345 an exact science
		bodyModel[282].setRotationPoint(24.5F, -22.37F, -1F);
		bodyModel[282].rotateAngleX = 0.13613568F;

		bodyModel[283].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 258
		bodyModel[283].setRotationPoint(-44F, -9F, -11F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[284].setRotationPoint(-45.01F, -6F, -11.5F);

		bodyModel[285].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[285].setRotationPoint(-45.01F, -9F, -11F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[286].setRotationPoint(-42F, -9F, -11.01F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[287].setRotationPoint(-40F, -13F, -11F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 326
		bodyModel[288].setRotationPoint(-45F, -9F, -11F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[289].setRotationPoint(-40F, -5F, 7F);

		bodyModel[290].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 246
		bodyModel[290].setRotationPoint(-44F, -9F, 11F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 247
		bodyModel[291].setRotationPoint(-45.01F, -6F, 10.5F);

		bodyModel[292].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 248
		bodyModel[292].setRotationPoint(-45.01F, -9F, 9F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[293].setRotationPoint(-42F, -9F, 11.01F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[294].setRotationPoint(-40F, -13F, 11F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 327
		bodyModel[295].setRotationPoint(-45F, -9F, 11F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,-2F, 4F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F); // Box 280
		bodyModel[296].setRotationPoint(-10F, -9F, 11.01F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,-2F, 4F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F); // Box 367
		bodyModel[297].setRotationPoint(-16F, -9F, -11.01F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[298].setRotationPoint(-33F, -18F, 10F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[299].setRotationPoint(-33F, -19F, 10F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 370
		bodyModel[300].setRotationPoint(-39F, -13F, 7F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[301].setRotationPoint(-38F, -22F, -7F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 372
		bodyModel[302].setRotationPoint(-38F, -21F, -9.75F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 373
		bodyModel[303].setRotationPoint(-38F, -22F, -9.75F);

		bodyModel[304].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[304].setRotationPoint(-24F, -23F, -11F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[305].setRotationPoint(-36F, -21F, -11F);

		bodyModel[306].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[306].setRotationPoint(-36F, -23F, 7F);

		bodyModel[307].addShapeBox(-1F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, -1F); // Box 377
		bodyModel[307].setRotationPoint(-35F, -23F, 7F);

		bodyModel[308].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[308].setRotationPoint(-24F, -23F, 7F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[309].setRotationPoint(-36F, -21F, 10F);

		bodyModel[310].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 301 markerlight glow
		bodyModel[310].setRotationPoint(-37.7F, -21.5F, -9F);

		bodyModel[311].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 344
		bodyModel[311].setRotationPoint(-37.7F, -21.5F, 8F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[312].setRotationPoint(-52F, 5F, 2F);

		bodyModel[313].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[313].setRotationPoint(-52F, 5F, -8F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[314].setRotationPoint(51F, 6F, 0F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[315].setRotationPoint(51F, 6F, -10F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[316].setRotationPoint(52F, 7F, -10F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[317].setRotationPoint(52F, 7F, 0F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[318].setRotationPoint(51F, 5F, 2F);

		bodyModel[319].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[319].setRotationPoint(51F, 5F, -8F);

		bodyModel[320].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 356 ac44cap
		bodyModel[320].setRotationPoint(-6.5F, 1.5F, -11.5F);
		bodyModel[320].rotateAngleX = 1.22173048F;

		bodyModel[321].addShapeBox(0F, 0F, 0F, 26, 10, 0, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -13F, -5F, 0F, -13F, -5F, 0F, 0F, -5F, 0F); // Box 261
		bodyModel[321].setRotationPoint(-23.5F, -22.5F, -7.03F);

		bodyModel[322].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[322].setRotationPoint(43F, -23.5F, 1.5F);

		bodyModel[323].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[323].setRotationPoint(44F, -23.5F, 2.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[324].setRotationPoint(44F, -23.5F, 0.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[325].setRotationPoint(44F, -22.5F, 1F);

		bodyModel[326].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 81
		bodyModel[326].setRotationPoint(9F, -22F, -2.5F);

		bodyModel[327].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 82
		bodyModel[327].setRotationPoint(9F, -22F, 1.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 83
		bodyModel[328].setRotationPoint(8F, -22.5F, -1.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 84
		bodyModel[329].setRotationPoint(8F, -22.5F, 0.5F);

		bodyModel[330].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 85
		bodyModel[330].setRotationPoint(8F, -22.5F, -0.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[331].setRotationPoint(9.5F, -22F, -1.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 252
		bodyModel[332].setRotationPoint(45.01F, -6F, -11.5F);

		bodyModel[333].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 253
		bodyModel[333].setRotationPoint(45.01F, -9F, -11F);

		bodyModel[334].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 278
		bodyModel[334].setRotationPoint(45.01F, -9F, 9F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 279
		bodyModel[335].setRotationPoint(45.01F, -6F, 10.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 328
		bodyModel[336].setRotationPoint(44F, -9F, -11F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 329
		bodyModel[337].setRotationPoint(44F, -9F, 11F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f
		bodyModel[338].setRotationPoint(-49.75F, -4F, 5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f
		bodyModel[339].setRotationPoint(-49.75F, -4F, -7F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[340].setRotationPoint(-49.5F, -4F, 5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[341].setRotationPoint(-49.5F, -4F, -7F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[342].setRotationPoint(48F, -4F, 4.75F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r
		bodyModel[343].setRotationPoint(48.25F, -4F, 4.75F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r
		bodyModel[344].setRotationPoint(48.25F, -4F, -6.75F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[345].setRotationPoint(48F, -4F, -6.75F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[346].setRotationPoint(-35F, -24.5F, 6.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[347].setRotationPoint(-35F, -24.5F, 6.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[348].setRotationPoint(-35F, -24.5F, 6.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[349].setRotationPoint(-35F, -24.5F, 6.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[350].setRotationPoint(-35.5F, -23F, 7F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[351].setRotationPoint(-35F, -24F, 6.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[352].setRotationPoint(-36.5F, -25.5F, -5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[353].setRotationPoint(-36.5F, -25.5F, -5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[354].setRotationPoint(-36.5F, -25.5F, -5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[355].setRotationPoint(-36.5F, -25.5F, -5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 support cull
		bodyModel[356].setRotationPoint(-36.5F, -24F, -5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[357].setRotationPoint(-37F, -24F, -0.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[358].setRotationPoint(-37F, -25F, -0.5F);

		bodyModel[359].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 563
		bodyModel[359].setRotationPoint(-16.5F, -24.75F, -5F);

		bodyModel[360].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 564
		bodyModel[360].setRotationPoint(-16.5F, -24.75F, 5F);

		bodyModel[361].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 414
		bodyModel[361].setRotationPoint(7F, -19.5F, -8.5F);

		bodyModel[362].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 415
		bodyModel[362].setRotationPoint(9.5F, -19.5F, -7.5F);

		bodyModel[363].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 416
		bodyModel[363].setRotationPoint(7.5F, -18.5F, -8.25F);

		bodyModel[364].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 417
		bodyModel[364].setRotationPoint(8F, -20.5F, -8.25F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[365].setRotationPoint(0F, -18.5F, 7.7F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[366].setRotationPoint(0F, -19.5F, 7.7F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[367].setRotationPoint(0.25F, -18F, 7.95F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[368].setRotationPoint(0F, -20.5F, 6.5F);

		bodyModel[369].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 368
		bodyModel[369].setRotationPoint(-37F, -22F, -7F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 3, 11, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[370].setRotationPoint(-30.05F, -16F, 1F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[371].setRotationPoint(-36.75F, -13F, 3F);
		bodyModel[371].rotateAngleY = -0.45378561F;

		bodyModel[372].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[372].setRotationPoint(-36.75F, -9F, 3F);
		bodyModel[372].rotateAngleY = -0.45378561F;

		bodyModel[373].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0.5F, -0.5F, -5F, 0.5F, -0.5F, -5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[373].setRotationPoint(-36.75F, -15F, 3F);
		bodyModel[373].rotateAngleY = -0.45378561F;

		bodyModel[374].addShapeBox(0F, 0F, -0.25F, 3, 2, 1, 0F,-0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 412 cs glow
		bodyModel[374].setRotationPoint(-36.25F, -15F, 4F);
		bodyModel[374].rotateAngleX = 0.12217305F;
		bodyModel[374].rotateAngleY = -0.45378561F;

		bodyModel[375].addShapeBox(3F, 0F, -0.25F, 3, 2, 1, 0F,-0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 413 cs glow
		bodyModel[375].setRotationPoint(-36.25F, -15F, 4F);
		bodyModel[375].rotateAngleX = 0.12217305F;
		bodyModel[375].rotateAngleY = -0.45378561F;

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 551 ditchlight f mccloud
		bodyModel[376].setRotationPoint(-51F, -1.5F, 3.75F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 550 ditchlight f mccloud
		bodyModel[377].setRotationPoint(-51F, -1.5F, -5.75F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 549
		bodyModel[378].setRotationPoint(-50.7F, -1.5F, 3.75F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[379].setRotationPoint(-50.7F, -1.5F, -5.75F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 555 ditchlight r mccloud
		bodyModel[380].setRotationPoint(49F, -2F, -5.75F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 554 ditchlight r mccloud
		bodyModel[381].setRotationPoint(49F, -2F, 3.75F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[382].setRotationPoint(49F, -2F, 3.75F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[383].setRotationPoint(49F, -2F, -5.75F);

		bodyModel[384].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 422
		bodyModel[384].setRotationPoint(45F, 7F, 9F);

		bodyModel[385].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 423
		bodyModel[385].setRotationPoint(45F, 8F, 9F);

		bodyModel[386].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 424
		bodyModel[386].setRotationPoint(45F, 6F, 7.75F);

		bodyModel[387].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 425
		bodyModel[387].setRotationPoint(45F, 5F, 7.75F);

		bodyModel[388].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 426
		bodyModel[388].setRotationPoint(45F, 4F, 7.25F);

		bodyModel[389].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 427
		bodyModel[389].setRotationPoint(45F, 3F, 7.25F);

		bodyModel[390].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 428
		bodyModel[390].setRotationPoint(45F, 1.75F, 6.5F);

		bodyModel[391].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 429
		bodyModel[391].setRotationPoint(45F, 0.75F, 6.5F);

		bodyModel[392].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 430
		bodyModel[392].setRotationPoint(45F, -0.95F, 6F);

		bodyModel[393].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 431
		bodyModel[393].setRotationPoint(45F, -0.99F, -7F);

		bodyModel[394].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 432
		bodyModel[394].setRotationPoint(45F, 0.75F, -6.5F);

		bodyModel[395].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 433
		bodyModel[395].setRotationPoint(45F, 1.75F, -8.5F);

		bodyModel[396].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 434
		bodyModel[396].setRotationPoint(45F, 3F, -7.25F);

		bodyModel[397].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 435
		bodyModel[397].setRotationPoint(45F, 4F, -9.25F);

		bodyModel[398].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 436
		bodyModel[398].setRotationPoint(45F, 5.25F, -7.75F);

		bodyModel[399].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 437
		bodyModel[399].setRotationPoint(45F, 6.25F, -9.75F);

		bodyModel[400].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 438
		bodyModel[400].setRotationPoint(45F, 7F, -9F);

		bodyModel[401].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 439
		bodyModel[401].setRotationPoint(45F, 8F, -11F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, -5F, 0F, -1.9F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[402].setRotationPoint(27F, -18F, -9F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 14, 4, 2, 0F,0F, 0F, 0.1F, -7F, 0F, 0.1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, -7F, 0F, -1.9F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[403].setRotationPoint(33F, -18F, -9F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1.9F, 0F, 0F, -1.9F); // Box 445
		bodyModel[404].setRotationPoint(27F, -18F, 7F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 14, 4, 2, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1.9F, 0F, 0F, -1.9F); // Box 446
		bodyModel[405].setRotationPoint(33F, -18F, 7F);

		bodyModel[406].addBox(0F, 0F, 0F, 0, 4, 8, 0F); // Box 418
		bodyModel[406].setRotationPoint(49F, 0.5F, -4F);
		bodyModel[406].rotateAngleZ = 0.54105207F;

		bodyModel[407].addBox(0F, 0F, 0F, 1, 0, 20, 0F); // Box 418
		bodyModel[407].setRotationPoint(-45F, 0.5F, -10F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 419
		bodyModel[408].setRotationPoint(-38F, -22F, -7.75F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F); // Box 420
		bodyModel[409].setRotationPoint(-38F, -21F, 7.75F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 421
		bodyModel[410].setRotationPoint(-38F, -22F, 7.75F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 422
		bodyModel[411].setRotationPoint(-38F, -22F, 6.75F);

		bodyModel[412].addShapeBox(-1F, 0F, 0F, 18, 4, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[412].setRotationPoint(-9.5F, -22F, 6.5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 24, 12, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -12F, -6F, 0F, -12F, -6F, 0F, 0F, -6F, 0F); // Box 416
		bodyModel[413].setRotationPoint(-23F, -22.5F, 7.05F);

		bodyModel[414].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 288
		bodyModel[414].setRotationPoint(-25F, -22F, -7F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[415].setRotationPoint(-49.01F, 0F, -9F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[416].setRotationPoint(-49.01F, 0F, 8F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[417].setRotationPoint(48.99F, 0F, -9F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[418].setRotationPoint(48.99F, 0F, 8F);

		bodyModel[419].addBox(0F, 0F, 0F, 1, 17, 12, 0F); // Box 530 not a fridge
		bodyModel[419].setRotationPoint(-26F, -22F, -6F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -5.125F, 0.125F, -0.125F, -5.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -5.125F, 0.125F, -5.125F, -5.125F); // Box 431 backpannel bulgy bit
		bodyModel[420].setRotationPoint(-26F, -21F, 1F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 425
		bodyModel[421].setRotationPoint(-38F, -22F, 2F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423 support cull
		bodyModel[422].setRotationPoint(-37.5F, -24.5F, -1F);

		bodyModel[423].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[423].setRotationPoint(-38.5F, -24.5F, -2F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 Front Gyralight L
		bodyModel[424].setRotationPoint(-39.25F, -24.5F, 0F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 Front Gyralight R
		bodyModel[425].setRotationPoint(-39.25F, -24.5F, -2F);

		bodyModel[426].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 333
		bodyModel[426].setRotationPoint(44.25F, -23.5F, -2F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 334 Rear Gyralight L
		bodyModel[427].setRotationPoint(45.5F, -23.5F, -2F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 335 Rear Gyralight R
		bodyModel[428].setRotationPoint(45.5F, -23.5F, 0F);
	}

	Modelge_hiad bogie = new Modelge_hiad();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
		if (GetColor(entity) == 6 ||GetColor(entity) == 12
				||GetColor(entity) == 16) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/ge_hiad_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-2F, 0.0F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}else if (GetColor(entity) == 13546) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/ge_hiad_SP_2.png"));
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