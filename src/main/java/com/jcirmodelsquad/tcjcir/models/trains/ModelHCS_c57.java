//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.05.2024 - 00:53:16
// Last changed on: 08.05.2024 - 00:53:16

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.Locomotive;

public class ModelHCS_c57 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHCS_c57() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[507];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 251, 67, textureX, textureY, "cull"); // Box cull low steppa
		bodyModel[1] = new ModelRendererTurbo(this, 21, 93, textureX, textureY); // Box 501
		bodyModel[2] = new ModelRendererTurbo(this, 19, 100, textureX, textureY, "cull"); // Box 500
		bodyModel[3] = new ModelRendererTurbo(this, 21, 93, textureX, textureY); // Box 499
		bodyModel[4] = new ModelRendererTurbo(this, 19, 95, textureX, textureY, "cull"); // Box 498
		bodyModel[5] = new ModelRendererTurbo(this, 36, 59, textureX, textureY, "cull"); // Box frontal cull
		bodyModel[6] = new ModelRendererTurbo(this, 87, 55, textureX, textureY, "cull"); // Box cull steppies
		bodyModel[7] = new ModelRendererTurbo(this, 172, 163, textureX, textureY, "cull"); // Box 498 cull
		bodyModel[8] = new ModelRendererTurbo(this, 161, 11, textureX, textureY, "cull"); // Box cull up nameplate
		bodyModel[9] = new ModelRendererTurbo(this, 161, 2, textureX, textureY, "cull"); // Box cull
		bodyModel[10] = new ModelRendererTurbo(this, 150, 2, textureX, textureY); // Box UP diesel era bodybit
		bodyModel[11] = new ModelRendererTurbo(this, 315, 226, textureX, textureY); // Box 494
		bodyModel[12] = new ModelRendererTurbo(this, 315, 226, textureX, textureY); // Box 493
		bodyModel[13] = new ModelRendererTurbo(this, 304, 226, textureX, textureY); // Box 492
		bodyModel[14] = new ModelRendererTurbo(this, 304, 226, textureX, textureY); // Box 491
		bodyModel[15] = new ModelRendererTurbo(this, 270, 35, textureX, textureY); // Box 496
		bodyModel[16] = new ModelRendererTurbo(this, 280, 39, textureX, textureY); // Box 495
		bodyModel[17] = new ModelRendererTurbo(this, 45, 84, textureX, textureY, "lamp"); // Box 171 nep upfit twinbeam glow
		bodyModel[18] = new ModelRendererTurbo(this, 45, 84, textureX, textureY, "lamp"); // Box 171 nep upfit twinbeam glow
		bodyModel[19] = new ModelRendererTurbo(this, 406, 181, textureX, textureY); // Box 490
		bodyModel[20] = new ModelRendererTurbo(this, 428, 32, textureX, textureY, "cull"); // Box cull c8 extendo
		bodyModel[21] = new ModelRendererTurbo(this, 417, 32, textureX, textureY, "cull"); // Box cull c8 walkway extendio
		bodyModel[22] = new ModelRendererTurbo(this, 2, 122, textureX, textureY,  "cull"); // Box cull MORE pipes
		bodyModel[23] = new ModelRendererTurbo(this, 2, 129, textureX, textureY,  "cull"); // Box cull more pipes
		bodyModel[24] = new ModelRendererTurbo(this, 28, 64, textureX, textureY); // Box 485
		bodyModel[25] = new ModelRendererTurbo(this, 18, 63, textureX, textureY, "lamp"); // Box glow marker
		bodyModel[26] = new ModelRendererTurbo(this, 28, 64, textureX, textureY); // Box 483
		bodyModel[27] = new ModelRendererTurbo(this, 23, 63, textureX, textureY, "lamp"); // Box 479 glow marker
		bodyModel[28] = new ModelRendererTurbo(this, 121, 67, textureX, textureY, "cull"); // Box cull
		bodyModel[29] = new ModelRendererTurbo(this, 181, 184, textureX, textureY); // Box 574
		bodyModel[30] = new ModelRendererTurbo(this, 183, 181, textureX, textureY); // Box 574
		bodyModel[31] = new ModelRendererTurbo(this, 178, 177, textureX, textureY); // Box 575
		bodyModel[32] = new ModelRendererTurbo(this, 59, 43, textureX, textureY, "cull"); // Box cull pipes
		bodyModel[33] = new ModelRendererTurbo(this, 40, 24, textureX, textureY); // Box 473
		bodyModel[34] = new ModelRendererTurbo(this, 37, 24, textureX, textureY); // Box 471
		bodyModel[35] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Box flaggy
		bodyModel[36] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box flaggy
		bodyModel[37] = new ModelRendererTurbo(this, 60, 156, textureX, textureY, "cull"); // Box cull stack curver
		bodyModel[38] = new ModelRendererTurbo(this, 349, 88, textureX, textureY); // Box 471
		bodyModel[39] = new ModelRendererTurbo(this, 126, 125, textureX, textureY); // Box 482
		bodyModel[40] = new ModelRendererTurbo(this, 103, 133, textureX, textureY); // Box 481
		bodyModel[41] = new ModelRendererTurbo(this, 127, 156, textureX, textureY); // Box 480
		bodyModel[42] = new ModelRendererTurbo(this, 134, 156, textureX, textureY); // Box 479
		bodyModel[43] = new ModelRendererTurbo(this, 443, 151, textureX, textureY); // Box 478
		bodyModel[44] = new ModelRendererTurbo(this, 443, 130, textureX, textureY); // Box 477
		bodyModel[45] = new ModelRendererTurbo(this, 402, 151, textureX, textureY); // Box 476
		bodyModel[46] = new ModelRendererTurbo(this, 402, 130, textureX, textureY); // Box 475
		bodyModel[47] = new ModelRendererTurbo(this, 361, 151, textureX, textureY); // Box 474
		bodyModel[48] = new ModelRendererTurbo(this, 361, 130, textureX, textureY); // Box 473
		bodyModel[49] = new ModelRendererTurbo(this, 320, 151, textureX, textureY); // Box 472
		bodyModel[50] = new ModelRendererTurbo(this, 62, 45, textureX, textureY, "cull"); // Box cull squat cowcatcher
		bodyModel[51] = new ModelRendererTurbo(this, 55, 44, textureX, textureY,"cull"); // Box cull squat cowcatcher
		bodyModel[52] = new ModelRendererTurbo(this, 48, 44, textureX, textureY, "cull"); // Box cull squat cowcatcher
		bodyModel[53] = new ModelRendererTurbo(this, 387, 66, textureX, textureY); // Box hehe peanits
		bodyModel[54] = new ModelRendererTurbo(this, 376, 56, textureX, textureY); // Box hehe peanits
		bodyModel[55] = new ModelRendererTurbo(this, 376, 61, textureX, textureY); // Box hehe peanits
		bodyModel[56] = new ModelRendererTurbo(this, 259, 43, textureX, textureY); // Box firehose reel
		bodyModel[57] = new ModelRendererTurbo(this, 265, 40, textureX, textureY); // Box firehose reel
		bodyModel[58] = new ModelRendererTurbo(this, 263, 42, textureX, textureY); // Box 306 late espee firehose box
		bodyModel[59] = new ModelRendererTurbo(this, 11, 8, textureX, textureY); // Box 462
		bodyModel[60] = new ModelRendererTurbo(this, 355, 113, textureX, textureY, "cull"); // Box cull random pipes
		bodyModel[61] = new ModelRendererTurbo(this, 289, 39, textureX, textureY); // Box 459
		bodyModel[62] = new ModelRendererTurbo(this, 43, 156, textureX, textureY); // Box fat smaller stack
		bodyModel[63] = new ModelRendererTurbo(this, 289, 48, textureX, textureY); // Box 457
		bodyModel[64] = new ModelRendererTurbo(this, 406, 188, textureX, textureY); // Box 455
		bodyModel[65] = new ModelRendererTurbo(this, 355, 246, textureX, textureY); // Box 454
		bodyModel[66] = new ModelRendererTurbo(this, 355, 239, textureX, textureY); // Box 453
		bodyModel[67] = new ModelRendererTurbo(this, 371, 228, textureX, textureY); // Box 452
		bodyModel[68] = new ModelRendererTurbo(this, 355, 239, textureX, textureY); // Box 451
		bodyModel[69] = new ModelRendererTurbo(this, 355, 246, textureX, textureY); // Box 450
		bodyModel[70] = new ModelRendererTurbo(this, 400, 122, textureX, textureY); // Box 
		bodyModel[71] = new ModelRendererTurbo(this, 409, 122, textureX, textureY, "cull"); // Box cull walkway c9
		bodyModel[72] = new ModelRendererTurbo(this, 55, 31, textureX, textureY, "cull"); // Box cull espee cowcatcher
		bodyModel[73] = new ModelRendererTurbo(this, 48, 31, textureX, textureY, "cull"); // Box cull espee cowcatcher
		bodyModel[74] = new ModelRendererTurbo(this, 366, 23, textureX, textureY, "cull"); // Box 443 cull espee c10 walkway
		bodyModel[75] = new ModelRendererTurbo(this, 418, 26, textureX, textureY, "cull"); // Box 442 cull espee c10 walkways
		bodyModel[76] = new ModelRendererTurbo(this, 375, 23, textureX, textureY, "cull"); // Box 441 cull espee c10 walkway
		bodyModel[77] = new ModelRendererTurbo(this, 407, 18, textureX, textureY, "cull"); // Box 440 cull espee c10 walkway
		bodyModel[78] = new ModelRendererTurbo(this, 404, 106, textureX, textureY, "cull"); // Box 439 cull
		bodyModel[79] = new ModelRendererTurbo(this, 133, 52, textureX, textureY); // Box 438
		bodyModel[80] = new ModelRendererTurbo(this, 141, 58, textureX, textureY, "lamp"); // Box glow early up headlight
		bodyModel[81] = new ModelRendererTurbo(this, 132, 56, textureX, textureY, "lamp"); // Box glow early up headlight
		bodyModel[82] = new ModelRendererTurbo(this, 153, 51, textureX, textureY); // Box 435
		bodyModel[83] = new ModelRendererTurbo(this, 142, 49, textureX, textureY); // Box 434
		bodyModel[84] = new ModelRendererTurbo(this, 302, 37, textureX, textureY, "cull"); // handrails cull up early and espee
		bodyModel[85] = new ModelRendererTurbo(this, 302, 46, textureX, textureY, "cull"); // handrails cull up early and espee
		bodyModel[86] = new ModelRendererTurbo(this, 14, 1, textureX, textureY); // Box 431
		bodyModel[87] = new ModelRendererTurbo(this, 40, 1, textureX, textureY); // Box 87
		bodyModel[88] = new ModelRendererTurbo(this, 170, 206, textureX, textureY); // Box 429
		bodyModel[89] = new ModelRendererTurbo(this, 343, 178, textureX, textureY); // Box 428
		bodyModel[90] = new ModelRendererTurbo(this, 343, 178, textureX, textureY); // Box 427
		bodyModel[91] = new ModelRendererTurbo(this, 347, 182, textureX, textureY); // Box 426
		bodyModel[92] = new ModelRendererTurbo(this, 177, 189, textureX, textureY); // Box 425
		bodyModel[93] = new ModelRendererTurbo(this, 36, 71, textureX, textureY, "cull"); // Box NEP frontals cull
		bodyModel[94] = new ModelRendererTurbo(this, 2, 71, textureX, textureY, "cull"); // Box espee interwar light
		bodyModel[95] = new ModelRendererTurbo(this, 12, 84, textureX, textureY, "lamp"); // Box espee interwar light glow
		bodyModel[96] = new ModelRendererTurbo(this, 2, 77, textureX, textureY,  "cull"); // Box espee interwar light cull
		bodyModel[97] = new ModelRendererTurbo(this, 17, 78, textureX, textureY); // Box espee interwar light
		bodyModel[98] = new ModelRendererTurbo(this, 11, 70, textureX, textureY, "lamp"); // Box espee interwar light glow
		bodyModel[99] = new ModelRendererTurbo(this, 1, 83, textureX, textureY); // Box espee interwar light
		bodyModel[100] = new ModelRendererTurbo(this, 36, 77, textureX, textureY, "lamp"); // Box NEP frontals glow
		bodyModel[101] = new ModelRendererTurbo(this, 36, 77, textureX, textureY, "lamp"); // Box NEP frontals glow
		bodyModel[102] = new ModelRendererTurbo(this, 45, 70, textureX, textureY, "lamp"); // Box NEP frontals glow
		bodyModel[103] = new ModelRendererTurbo(this, 36, 85, textureX, textureY); // Box NEP frontals
		bodyModel[104] = new ModelRendererTurbo(this, 35, 65, textureX, textureY); // Box NEP frontals
		bodyModel[105] = new ModelRendererTurbo(this, 36, 81, textureX, textureY); // Box NEP frontals
		bodyModel[106] = new ModelRendererTurbo(this, 43, 63, textureX, textureY); // Box NEP frontals
		bodyModel[107] = new ModelRendererTurbo(this, 45, 77, textureX, textureY); // Box NEP frontals
		bodyModel[108] = new ModelRendererTurbo(this, 138, 212, textureX, textureY); // Box 416
		bodyModel[109] = new ModelRendererTurbo(this, 124, 210, textureX, textureY); // Box 616
		bodyModel[110] = new ModelRendererTurbo(this, 119, 210, textureX, textureY); // Box 615
		bodyModel[111] = new ModelRendererTurbo(this, 153, 207, textureX, textureY); // Box 614
		bodyModel[112] = new ModelRendererTurbo(this, 146, 205, textureX, textureY); // Box 412
		bodyModel[113] = new ModelRendererTurbo(this, 153, 203, textureX, textureY); // Box 411
		bodyModel[114] = new ModelRendererTurbo(this, 124, 202, textureX, textureY); // Box 410
		bodyModel[115] = new ModelRendererTurbo(this, 110, 207, textureX, textureY); // Box 409
		bodyModel[116] = new ModelRendererTurbo(this, 131, 203, textureX, textureY); // Box 407
		bodyModel[117] = new ModelRendererTurbo(this, 110, 202, textureX, textureY); // Box 406
		bodyModel[118] = new ModelRendererTurbo(this, 117, 202, textureX, textureY); // Box 405
		bodyModel[119] = new ModelRendererTurbo(this, 129, 210, textureX, textureY); // Box 404
		bodyModel[120] = new ModelRendererTurbo(this, 108, 214, textureX, textureY); // Box 403
		bodyModel[121] = new ModelRendererTurbo(this, 138, 203, textureX, textureY); // Box 402
		bodyModel[122] = new ModelRendererTurbo(this, 196, 228, textureX, textureY); // Box 279
		bodyModel[123] = new ModelRendererTurbo(this, 196, 224, textureX, textureY); // Box 280
		bodyModel[124] = new ModelRendererTurbo(this, 194, 220, textureX, textureY); // Box 399
		bodyModel[125] = new ModelRendererTurbo(this, 194, 216, textureX, textureY); // Box 398
		bodyModel[126] = new ModelRendererTurbo(this, 470, 243, textureX, textureY); // Box 397
		bodyModel[127] = new ModelRendererTurbo(this, 465, 214, textureX, textureY,  "cull"); // Box 396 cull espee danglybits
		bodyModel[128] = new ModelRendererTurbo(this, 465, 187, textureX, textureY,  "cull"); // Box cull espee danglybits
		bodyModel[129] = new ModelRendererTurbo(this, 182, 204, textureX, textureY); // Box 394
		bodyModel[130] = new ModelRendererTurbo(this, 27, 174, textureX, textureY,  "cull"); // Box cull crown/cover
		bodyModel[131] = new ModelRendererTurbo(this, 2, 146, textureX, textureY,  "cull"); // Box cull
		bodyModel[132] = new ModelRendererTurbo(this, 2, 136, textureX, textureY,  "cull"); // Box 519 cull
		bodyModel[133] = new ModelRendererTurbo(this, 434, 228, textureX, textureY); // Box 390
		bodyModel[134] = new ModelRendererTurbo(this, 452, 229, textureX, textureY); // Box 389
		bodyModel[135] = new ModelRendererTurbo(this, 443, 230, textureX, textureY); // Box 388
		bodyModel[136] = new ModelRendererTurbo(this, 421, 228, textureX, textureY); // Box 387
		bodyModel[137] = new ModelRendererTurbo(this, 432, 230, textureX, textureY); // Box 386
		bodyModel[138] = new ModelRendererTurbo(this, 388, 212, textureX, textureY); // Box boiler button
		bodyModel[139] = new ModelRendererTurbo(this, 18, 38, textureX, textureY, "cull"); // Box fncc frontals
		bodyModel[140] = new ModelRendererTurbo(this, 24, 40, textureX, textureY); // Box fncc frontals
		bodyModel[141] = new ModelRendererTurbo(this, 39, 38, textureX, textureY, "lamp"); // Box fncc frontals glow
		bodyModel[142] = new ModelRendererTurbo(this, 30, 37, textureX, textureY, "lamp"); // Box fncc frontals glow
		bodyModel[143] = new ModelRendererTurbo(this, 5, 37, textureX, textureY); // Box fncc frontals
		bodyModel[144] = new ModelRendererTurbo(this, 385, 245, textureX, textureY); // Box 379
		bodyModel[145] = new ModelRendererTurbo(this, 427, 214, textureX, textureY); // Box 378
		bodyModel[146] = new ModelRendererTurbo(this, 405, 238, textureX, textureY); // Box 377
		bodyModel[147] = new ModelRendererTurbo(this, 380, 246, textureX, textureY); // Box 376
		bodyModel[148] = new ModelRendererTurbo(this, 405, 214, textureX, textureY); // Box 375
		bodyModel[149] = new ModelRendererTurbo(this, 375, 246, textureX, textureY); // Box 374
		bodyModel[150] = new ModelRendererTurbo(this, 442, 251, textureX, textureY); // Box 373
		bodyModel[151] = new ModelRendererTurbo(this, 405, 250, textureX, textureY); // Box 372
		bodyModel[152] = new ModelRendererTurbo(this, 370, 246, textureX, textureY); // Box 371
		bodyModel[153] = new ModelRendererTurbo(this, 435, 233, textureX, textureY); // Box 370
		bodyModel[154] = new ModelRendererTurbo(this, 406, 200, textureX, textureY); // Box 369
		bodyModel[155] = new ModelRendererTurbo(this, 478, 248, textureX, textureY); // Box 368
		bodyModel[156] = new ModelRendererTurbo(this, 445, 238, textureX, textureY); // Box 365
		bodyModel[157] = new ModelRendererTurbo(this, 360, 239, textureX, textureY); // Box 364
		bodyModel[158] = new ModelRendererTurbo(this, 395, 242, textureX, textureY); // Box 363
		bodyModel[159] = new ModelRendererTurbo(this, 451, 251, textureX, textureY); // Box 362
		bodyModel[160] = new ModelRendererTurbo(this, 440, 233, textureX, textureY); // Box 361
		bodyModel[161] = new ModelRendererTurbo(this, 435, 238, textureX, textureY); // Box 360
		bodyModel[162] = new ModelRendererTurbo(this, 405, 241, textureX, textureY); // Box 359
		bodyModel[163] = new ModelRendererTurbo(this, 405, 229, textureX, textureY); // Box 358
		bodyModel[164] = new ModelRendererTurbo(this, 405, 247, textureX, textureY); // Box 357
		bodyModel[165] = new ModelRendererTurbo(this, 365, 239, textureX, textureY); // Box 363
		bodyModel[166] = new ModelRendererTurbo(this, 365, 246, textureX, textureY); // Box 362
		bodyModel[167] = new ModelRendererTurbo(this, 388, 228, textureX, textureY); // Box 361
		bodyModel[168] = new ModelRendererTurbo(this, 370, 239, textureX, textureY); // Box 326
		bodyModel[169] = new ModelRendererTurbo(this, 360, 246, textureX, textureY); // Box 357
		bodyModel[170] = new ModelRendererTurbo(this, 391, 237, textureX, textureY); // Box 355
		bodyModel[171] = new ModelRendererTurbo(this, 440, 236, textureX, textureY); // Box 354
		bodyModel[172] = new ModelRendererTurbo(this, 440, 239, textureX, textureY); // Box 353
		bodyModel[173] = new ModelRendererTurbo(this, 405, 226, textureX, textureY); // Box 352
		bodyModel[174] = new ModelRendererTurbo(this, 405, 223, textureX, textureY); // Box 351
		bodyModel[175] = new ModelRendererTurbo(this, 385, 239, textureX, textureY); // Box 326
		bodyModel[176] = new ModelRendererTurbo(this, 415, 10, textureX, textureY, "cull"); // Box cull up all handrails
		bodyModel[177] = new ModelRendererTurbo(this, 400, 10, textureX, textureY, "cull"); // Box cull up all handrails
		bodyModel[178] = new ModelRendererTurbo(this, 369, 2, textureX, textureY, "cull"); // Box cull up all handrails
		bodyModel[179] = new ModelRendererTurbo(this, 430, 2, textureX, textureY, "cull"); // Box cull up all handrails
		bodyModel[180] = new ModelRendererTurbo(this, 385, 10, textureX, textureY, "cull"); // Box cull up all handrails
		bodyModel[181] = new ModelRendererTurbo(this, 369, 6, textureX, textureY, "cull"); // Box cull up all handrails
		bodyModel[182] = new ModelRendererTurbo(this, 370, 10, textureX, textureY, "cull"); // Box cull up all handrails
		bodyModel[183] = new ModelRendererTurbo(this, 430, 10, textureX, textureY, "cull"); // Box cull up all handrails
		bodyModel[184] = new ModelRendererTurbo(this, 375, 239, textureX, textureY); // Box 340
		bodyModel[185] = new ModelRendererTurbo(this, 405, 253, textureX, textureY); // Box 339
		bodyModel[186] = new ModelRendererTurbo(this, 405, 217, textureX, textureY); // Box 338
		bodyModel[187] = new ModelRendererTurbo(this, 405, 235, textureX, textureY); // Box 337
		bodyModel[188] = new ModelRendererTurbo(this, 416, 214, textureX, textureY); // Box 334
		bodyModel[189] = new ModelRendererTurbo(this, 390, 244, textureX, textureY); // Box 332
		bodyModel[190] = new ModelRendererTurbo(this, 405, 244, textureX, textureY); // Box 331
		bodyModel[191] = new ModelRendererTurbo(this, 400, 237, textureX, textureY); // Box 330
		bodyModel[192] = new ModelRendererTurbo(this, 435, 242, textureX, textureY); // Box 329
		bodyModel[193] = new ModelRendererTurbo(this, 442, 246, textureX, textureY); // Box 328
		bodyModel[194] = new ModelRendererTurbo(this, 25, 163, textureX, textureY); // Box 191
		bodyModel[195] = new ModelRendererTurbo(this, 34, 163, textureX, textureY); // Box 190
		bodyModel[196] = new ModelRendererTurbo(this, 34, 157, textureX, textureY); // Box 189
		bodyModel[197] = new ModelRendererTurbo(this, 25, 157, textureX, textureY); // Box 188
		bodyModel[198] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Box 187
		bodyModel[199] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Box 186
		bodyModel[200] = new ModelRendererTurbo(this, 418, 195, textureX, textureY); // Box 317
		bodyModel[201] = new ModelRendererTurbo(this, 37, 1, textureX, textureY); // Box 378
		bodyModel[202] = new ModelRendererTurbo(this, 380, 72, textureX, textureY); // Box 341
		bodyModel[203] = new ModelRendererTurbo(this, 378, 74, textureX, textureY); // Box 1086
		bodyModel[204] = new ModelRendererTurbo(this, 447, 101, textureX, textureY); // Box power reverse.jpg
		bodyModel[205] = new ModelRendererTurbo(this, 502, 105, textureX, textureY); // Box power reverse.jpg
		bodyModel[206] = new ModelRendererTurbo(this, 477, 101, textureX, textureY); // Box power reverse.jpg
		bodyModel[207] = new ModelRendererTurbo(this, 466, 101, textureX, textureY); // Box 312
		bodyModel[208] = new ModelRendererTurbo(this, 92, 10, textureX, textureY,  "cull"); // Box cull plowsteps
		bodyModel[209] = new ModelRendererTurbo(this, 92, 6, textureX, textureY,  "cull"); // Box cull plowsteps
		bodyModel[210] = new ModelRendererTurbo(this, 107, 11, textureX, textureY); // Box 309
		bodyModel[211] = new ModelRendererTurbo(this, 118, 8, textureX, textureY); // Box 285
		bodyModel[212] = new ModelRendererTurbo(this, 129, 11, textureX, textureY); // Box 323
		bodyModel[213] = new ModelRendererTurbo(this, 53, 10, textureX, textureY); // Box 322
		bodyModel[214] = new ModelRendererTurbo(this, 140, 8, textureX, textureY); // Box 448
		bodyModel[215] = new ModelRendererTurbo(this, 92, 7, textureX, textureY); // Box 4
		bodyModel[216] = new ModelRendererTurbo(this, 66, 7, textureX, textureY); // Box 283
		bodyModel[217] = new ModelRendererTurbo(this, 79, 4, textureX, textureY); // Box 282
		bodyModel[218] = new ModelRendererTurbo(this, 407, 195, textureX, textureY); // Box 576
		bodyModel[219] = new ModelRendererTurbo(this, 418, 197, textureX, textureY); // Box 578
		bodyModel[220] = new ModelRendererTurbo(this, 429, 197, textureX, textureY); // Box 579
		bodyModel[221] = new ModelRendererTurbo(this, 438, 196, textureX, textureY); // Box 580
		bodyModel[222] = new ModelRendererTurbo(this, 406, 207, textureX, textureY); // Box 483
		bodyModel[223] = new ModelRendererTurbo(this, 108, 183, textureX, textureY); // Box 320
		bodyModel[224] = new ModelRendererTurbo(this, 108, 179, textureX, textureY); // Box 319
		bodyModel[225] = new ModelRendererTurbo(this, 61, 36, textureX, textureY); // Box 201
		bodyModel[226] = new ModelRendererTurbo(this, 69, 34, textureX, textureY); // Box 229
		bodyModel[227] = new ModelRendererTurbo(this, 72, 39, textureX, textureY); // Box 202
		bodyModel[228] = new ModelRendererTurbo(this, 77, 39, textureX, textureY); // Box 201
		bodyModel[229] = new ModelRendererTurbo(this, 398, 24, textureX, textureY); // Box 310
		bodyModel[230] = new ModelRendererTurbo(this, 396, 27, textureX, textureY); // Box 309
		bodyModel[231] = new ModelRendererTurbo(this, 399, 28, textureX, textureY); // Box 308
		bodyModel[232] = new ModelRendererTurbo(this, 393, 27, textureX, textureY); // Box 305
		bodyModel[233] = new ModelRendererTurbo(this, 396, 28, textureX, textureY); // Box 2
		bodyModel[234] = new ModelRendererTurbo(this, 389, 94, textureX, textureY); // Box 297
		bodyModel[235] = new ModelRendererTurbo(this, 257, 215, textureX, textureY); // Box 296
		bodyModel[236] = new ModelRendererTurbo(this, 246, 221, textureX, textureY); // Box 295
		bodyModel[237] = new ModelRendererTurbo(this, 280, 221, textureX, textureY); // Box 294
		bodyModel[238] = new ModelRendererTurbo(this, 502, 105, textureX, textureY); // Box 291
		bodyModel[239] = new ModelRendererTurbo(this, 447, 105, textureX, textureY); // Box 290
		bodyModel[240] = new ModelRendererTurbo(this, 323, 25, textureX, textureY); // Box 289
		bodyModel[241] = new ModelRendererTurbo(this, 366, 94, textureX, textureY); // Box 288
		bodyModel[242] = new ModelRendererTurbo(this, 28, 68, textureX, textureY); // Box 287
		bodyModel[243] = new ModelRendererTurbo(this, 23, 67, textureX, textureY, "lamp"); // Box 284 glow marker
		bodyModel[244] = new ModelRendererTurbo(this, 28, 68, textureX, textureY); // Box 285
		bodyModel[245] = new ModelRendererTurbo(this, 23, 67, textureX, textureY, "lamp"); // Box 284 glow marker
		bodyModel[246] = new ModelRendererTurbo(this, 77, 70, textureX, textureY); // Box epsee frontals
		bodyModel[247] = new ModelRendererTurbo(this, 77, 77, textureX, textureY, "lamp"); // Box epsee frontals glow
		bodyModel[248] = new ModelRendererTurbo(this, 68, 80, textureX, textureY,  "cull"); // Box epsee frontals cull
		bodyModel[249] = new ModelRendererTurbo(this, 68, 72, textureX, textureY); // Box epsee frontals
		bodyModel[250] = new ModelRendererTurbo(this, 68, 76, textureX, textureY); // Box epsee frontals
		bodyModel[251] = new ModelRendererTurbo(this, 68, 67, textureX, textureY); // Box epsee frontals
		bodyModel[252] = new ModelRendererTurbo(this, 76, 64, textureX, textureY); // Box epsee frontals
		bodyModel[253] = new ModelRendererTurbo(this, 19, 181, textureX, textureY); // Box sp smokeboxdoor
		bodyModel[254] = new ModelRendererTurbo(this, 19, 172, textureX, textureY); // Box sp smokeboxdoor
		bodyModel[255] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box sp smokeboxdoor
		bodyModel[256] = new ModelRendererTurbo(this, 291, 227, textureX, textureY); // Box 264
		bodyModel[257] = new ModelRendererTurbo(this, 247, 218, textureX, textureY); // Box 262
		bodyModel[258] = new ModelRendererTurbo(this, 291, 230, textureX, textureY); // Box 259
		bodyModel[259] = new ModelRendererTurbo(this, 299, 218, textureX, textureY); // Box 256
		bodyModel[260] = new ModelRendererTurbo(this, 274, 218, textureX, textureY); // Box 255
		bodyModel[261] = new ModelRendererTurbo(this, 248, 209, textureX, textureY); // Box up cabtail
		bodyModel[262] = new ModelRendererTurbo(this, 268, 237, textureX, textureY); // Box up cabtail
		bodyModel[263] = new ModelRendererTurbo(this, 269, 210, textureX, textureY); // Box up cabtail
		bodyModel[264] = new ModelRendererTurbo(this, 288, 209, textureX, textureY); // Box up cabtail
		bodyModel[265] = new ModelRendererTurbo(this, 277, 237, textureX, textureY); // Box up cabtail
		bodyModel[266] = new ModelRendererTurbo(this, 447, 218, textureX, textureY); // Box 249
		bodyModel[267] = new ModelRendererTurbo(this, 447, 218, textureX, textureY); // Box 248
		bodyModel[268] = new ModelRendererTurbo(this, 428, 218, textureX, textureY,  "cull"); // Box leafspring rider cull
		bodyModel[269] = new ModelRendererTurbo(this, 447, 218, textureX, textureY); // Box 246
		bodyModel[270] = new ModelRendererTurbo(this, 447, 218, textureX, textureY); // Box 245
		bodyModel[271] = new ModelRendererTurbo(this, 428, 218, textureX, textureY,  "cull"); // Box leafspring rider cull
		bodyModel[272] = new ModelRendererTurbo(this, 447, 218, textureX, textureY); // Box 243
		bodyModel[273] = new ModelRendererTurbo(this, 447, 218, textureX, textureY); // Box 242
		bodyModel[274] = new ModelRendererTurbo(this, 428, 218, textureX, textureY,  "cull"); // Box leafspring rider cull
		bodyModel[275] = new ModelRendererTurbo(this, 447, 218, textureX, textureY); // Box 43
		bodyModel[276] = new ModelRendererTurbo(this, 447, 218, textureX, textureY); // Box 44
		bodyModel[277] = new ModelRendererTurbo(this, 428, 218, textureX, textureY,  "cull"); // Box leafspring rider cull
		bodyModel[278] = new ModelRendererTurbo(this, 472, 110, textureX, textureY); // Box 239
		bodyModel[279] = new ModelRendererTurbo(this, 486, 101, textureX, textureY); // Box 238
		bodyModel[280] = new ModelRendererTurbo(this, 486, 105, textureX, textureY); // Box 237
		bodyModel[281] = new ModelRendererTurbo(this, 486, 98, textureX, textureY); // Box 236
		bodyModel[282] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 235
		bodyModel[283] = new ModelRendererTurbo(this, 447, 107, textureX, textureY); // Box 234
		bodyModel[284] = new ModelRendererTurbo(this, 493, 97, textureX, textureY); // Box 233
		bodyModel[285] = new ModelRendererTurbo(this, 447, 113, textureX, textureY); // Box 232
		bodyModel[286] = new ModelRendererTurbo(this, 493, 101, textureX, textureY); // Box 231
		bodyModel[287] = new ModelRendererTurbo(this, 493, 105, textureX, textureY); // Box 230
		bodyModel[288] = new ModelRendererTurbo(this, 493, 105, textureX, textureY); // Box 229
		bodyModel[289] = new ModelRendererTurbo(this, 447, 117, textureX, textureY); // Box 228
		bodyModel[290] = new ModelRendererTurbo(this, 493, 105, textureX, textureY); // Box 227
		bodyModel[291] = new ModelRendererTurbo(this, 493, 109, textureX, textureY); // Box 230
		bodyModel[292] = new ModelRendererTurbo(this, 500, 97, textureX, textureY); // Box 229
		bodyModel[293] = new ModelRendererTurbo(this, 505, 103, textureX, textureY); // Box 228
		bodyModel[294] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 227
		bodyModel[295] = new ModelRendererTurbo(this, 438, 105, textureX, textureY); // Box 226
		bodyModel[296] = new ModelRendererTurbo(this, 431, 100, textureX, textureY); // Box 225
		bodyModel[297] = new ModelRendererTurbo(this, 500, 97, textureX, textureY); // Box 224
		bodyModel[298] = new ModelRendererTurbo(this, 473, 107, textureX, textureY); // Box 223
		bodyModel[299] = new ModelRendererTurbo(this, 98, 39, textureX, textureY,  "cull"); // Box cull
		bodyModel[300] = new ModelRendererTurbo(this, 438, 99, textureX, textureY); // Box 238
		bodyModel[301] = new ModelRendererTurbo(this, 404, 85, textureX, textureY); // Box 233
		bodyModel[302] = new ModelRendererTurbo(this, 438, 99, textureX, textureY); // Box 232
		bodyModel[303] = new ModelRendererTurbo(this, 505, 103, textureX, textureY); // Box 369
		bodyModel[304] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 367
		bodyModel[305] = new ModelRendererTurbo(this, 438, 105, textureX, textureY); // Box 366
		bodyModel[306] = new ModelRendererTurbo(this, 486, 101, textureX, textureY); // Box 379
		bodyModel[307] = new ModelRendererTurbo(this, 486, 105, textureX, textureY); // Box 378
		bodyModel[308] = new ModelRendererTurbo(this, 486, 98, textureX, textureY); // Box 377
		bodyModel[309] = new ModelRendererTurbo(this, 493, 97, textureX, textureY); // Box 221
		bodyModel[310] = new ModelRendererTurbo(this, 447, 113, textureX, textureY); // Box 380
		bodyModel[311] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 376
		bodyModel[312] = new ModelRendererTurbo(this, 447, 107, textureX, textureY); // Box 375
		bodyModel[313] = new ModelRendererTurbo(this, 23, 71, textureX, textureY, "lamp"); // Box 595 glow marker
		bodyModel[314] = new ModelRendererTurbo(this, 28, 72, textureX, textureY); // Box 594
		bodyModel[315] = new ModelRendererTurbo(this, 23, 71, textureX, textureY, "lamp"); // Box 410 glow marker
		bodyModel[316] = new ModelRendererTurbo(this, 28, 72, textureX, textureY); // Box 2
		bodyModel[317] = new ModelRendererTurbo(this, 98, 44, textureX, textureY); // Box 623
		bodyModel[318] = new ModelRendererTurbo(this, 98, 48, textureX, textureY, "lamp"); // Box 626 numberboard glow
		bodyModel[319] = new ModelRendererTurbo(this, 98, 48, textureX, textureY, "lamp"); // Box 626 numberboard glow
		bodyModel[320] = new ModelRendererTurbo(this, 111, 48, textureX, textureY); // Box 627
		bodyModel[321] = new ModelRendererTurbo(this, 111, 39, textureX, textureY,  "cull"); // Box 355 cull
		bodyModel[322] = new ModelRendererTurbo(this, 36, 51, textureX, textureY); // Box 201
		bodyModel[323] = new ModelRendererTurbo(this, 41, 51, textureX, textureY); // Box 114
		bodyModel[324] = new ModelRendererTurbo(this, 41, 54, textureX, textureY); // Box 74
		bodyModel[325] = new ModelRendererTurbo(this, 30, 51, textureX, textureY,  "cull"); // Box 407 bell holder cull
		bodyModel[326] = new ModelRendererTurbo(this, 386, 25, textureX, textureY); // Box 315
		bodyModel[327] = new ModelRendererTurbo(this, 371, 28, textureX, textureY,  "cull"); // Box 317 cull multi-step
		bodyModel[328] = new ModelRendererTurbo(this, 386, 29, textureX, textureY); // Box 318
		bodyModel[329] = new ModelRendererTurbo(this, 360, 28, textureX, textureY,  "cull"); // Box 317 cull multi-step
		bodyModel[330] = new ModelRendererTurbo(this, 390, 61, textureX, textureY); // Box 184
		bodyModel[331] = new ModelRendererTurbo(this, 321, 186, textureX, textureY); // Box 183
		bodyModel[332] = new ModelRendererTurbo(this, 269, 55, textureX, textureY,  "cull"); // Box 182 cull walkway
		bodyModel[333] = new ModelRendererTurbo(this, 269, 61, textureX, textureY,  "cull"); // Box 181 cull walkway
		bodyModel[334] = new ModelRendererTurbo(this, 12, 169, textureX, textureY); // Box 180
		bodyModel[335] = new ModelRendererTurbo(this, 5, 169, textureX, textureY); // Box 179
		bodyModel[336] = new ModelRendererTurbo(this, 127, 160, textureX, textureY); // Box 178
		bodyModel[337] = new ModelRendererTurbo(this, 134, 160, textureX, textureY); // Box 177
		bodyModel[338] = new ModelRendererTurbo(this, 208, 3, textureX, textureY); // Box 176
		bodyModel[339] = new ModelRendererTurbo(this, 208, 10, textureX, textureY); // Box 175
		bodyModel[340] = new ModelRendererTurbo(this, 243, 28, textureX, textureY); // Box 174
		bodyModel[341] = new ModelRendererTurbo(this, 493, 101, textureX, textureY); // Box 377
		bodyModel[342] = new ModelRendererTurbo(this, 493, 101, textureX, textureY); // Box 376
		bodyModel[343] = new ModelRendererTurbo(this, 493, 101, textureX, textureY); // Box 375
		bodyModel[344] = new ModelRendererTurbo(this, 447, 117, textureX, textureY); // Box 380
		bodyModel[345] = new ModelRendererTurbo(this, 493, 101, textureX, textureY); // Box 370
		bodyModel[346] = new ModelRendererTurbo(this, 158, 30, textureX, textureY); // Box up high mount headlight
		bodyModel[347] = new ModelRendererTurbo(this, 158, 34, textureX, textureY); // Box up high mount headlight
		bodyModel[348] = new ModelRendererTurbo(this, 140, 30, textureX, textureY); // Box up high mount headlight
		bodyModel[349] = new ModelRendererTurbo(this, 149, 30, textureX, textureY); // Box up high mount headlight
		bodyModel[350] = new ModelRendererTurbo(this, 131, 30, textureX, textureY, "lamp"); // Box 205 glow
		bodyModel[351] = new ModelRendererTurbo(this, 103, 31, textureX, textureY, "cull"); // Box cull
		bodyModel[352] = new ModelRendererTurbo(this, 259, 235, textureX, textureY); // Box 203
		bodyModel[353] = new ModelRendererTurbo(this, 268, 234, textureX, textureY); // Box up cabtail
		bodyModel[354] = new ModelRendererTurbo(this, 275, 234, textureX, textureY); // Box up cabtail
		bodyModel[355] = new ModelRendererTurbo(this, 303, 245, textureX, textureY); // Box 199
		bodyModel[356] = new ModelRendererTurbo(this, 320, 246, textureX, textureY); // Box 198
		bodyModel[357] = new ModelRendererTurbo(this, 335, 245, textureX, textureY); // Box 197
		bodyModel[358] = new ModelRendererTurbo(this, 244, 235, textureX, textureY); // Box 196
		bodyModel[359] = new ModelRendererTurbo(this, 282, 234, textureX, textureY); // Box 468
		bodyModel[360] = new ModelRendererTurbo(this, 287, 234, textureX, textureY); // Box 467
		bodyModel[361] = new ModelRendererTurbo(this, 213, 182, textureX, textureY); // Box 193
		bodyModel[362] = new ModelRendererTurbo(this, 208, 194, textureX, textureY); // Box 192
		bodyModel[363] = new ModelRendererTurbo(this, 207, 202, textureX, textureY); // Box 191
		bodyModel[364] = new ModelRendererTurbo(this, 207, 185, textureX, textureY); // Box 189
		bodyModel[365] = new ModelRendererTurbo(this, 213, 179, textureX, textureY); // Box 186
		bodyModel[366] = new ModelRendererTurbo(this, 250, 198, textureX, textureY); // Box 185
		bodyModel[367] = new ModelRendererTurbo(this, 282, 198, textureX, textureY); // Box 184
		bodyModel[368] = new ModelRendererTurbo(this, 267, 199, textureX, textureY); // Box 182
		bodyModel[369] = new ModelRendererTurbo(this, 274, 240, textureX, textureY); // Box 173
		bodyModel[370] = new ModelRendererTurbo(this, 215, 240, textureX, textureY); // Box 172
		bodyModel[371] = new ModelRendererTurbo(this, 168, 219, textureX, textureY); // Box 171
		bodyModel[372] = new ModelRendererTurbo(this, 193, 211, textureX, textureY); // Box 170
		bodyModel[373] = new ModelRendererTurbo(this, 417, 48, textureX, textureY); // Box 2
		bodyModel[374] = new ModelRendererTurbo(this, 414, 47, textureX, textureY); // Box 2
		bodyModel[375] = new ModelRendererTurbo(this, 65, 22, textureX, textureY,  "cull"); // Box cull cowcatcher
		bodyModel[376] = new ModelRendererTurbo(this, 49, 25, textureX, textureY,  "cull"); // Box cull cowcatcher
		bodyModel[377] = new ModelRendererTurbo(this, 54, 22, textureX, textureY,  "cull"); // Box cull cowcatcher
		bodyModel[378] = new ModelRendererTurbo(this, 158, 38, textureX, textureY); // Box up frontals
		bodyModel[379] = new ModelRendererTurbo(this, 158, 42, textureX, textureY); // Box up frontals
		bodyModel[380] = new ModelRendererTurbo(this, 149, 37, textureX, textureY); // Box up frontals
		bodyModel[381] = new ModelRendererTurbo(this, 140, 37, textureX, textureY, "lamp"); // Box up frontals glow
		bodyModel[382] = new ModelRendererTurbo(this, 116, 31, textureX, textureY,  "cull"); // Box up frontals cull
		bodyModel[383] = new ModelRendererTurbo(this, 131, 37, textureX, textureY); // Box up frontals
		bodyModel[384] = new ModelRendererTurbo(this, 110, 184, textureX, textureY,  "cull"); // Box 222 cull
		bodyModel[385] = new ModelRendererTurbo(this, 63, 181, textureX, textureY); // Box 152
		bodyModel[386] = new ModelRendererTurbo(this, 61, 171, textureX, textureY); // Box 151
		bodyModel[387] = new ModelRendererTurbo(this, 61, 166, textureX, textureY); // Box 150
		bodyModel[388] = new ModelRendererTurbo(this, 49, 182, textureX, textureY); // Box 149
		bodyModel[389] = new ModelRendererTurbo(this, 49, 173, textureX, textureY); // Box 148
		bodyModel[390] = new ModelRendererTurbo(this, 51, 168, textureX, textureY); // Box 147
		bodyModel[391] = new ModelRendererTurbo(this, 43, 181, textureX, textureY); // Box 146
		bodyModel[392] = new ModelRendererTurbo(this, 45, 171, textureX, textureY); // Box 145
		bodyModel[393] = new ModelRendererTurbo(this, 45, 166, textureX, textureY); // Box 144
		bodyModel[394] = new ModelRendererTurbo(this, 82, 166, textureX, textureY); // Box 193
		bodyModel[395] = new ModelRendererTurbo(this, 75, 164, textureX, textureY); // Box 194
		bodyModel[396] = new ModelRendererTurbo(this, 73, 180, textureX, textureY); // Box 196
		bodyModel[397] = new ModelRendererTurbo(this, 95, 164, textureX, textureY); // Box 197
		bodyModel[398] = new ModelRendererTurbo(this, 97, 180, textureX, textureY); // Box 199
		bodyModel[399] = new ModelRendererTurbo(this, 80, 181, textureX, textureY); // Box 201
		bodyModel[400] = new ModelRendererTurbo(this, 75, 171, textureX, textureY); // Box 202
		bodyModel[401] = new ModelRendererTurbo(this, 80, 172, textureX, textureY); // Box 203
		bodyModel[402] = new ModelRendererTurbo(this, 95, 171, textureX, textureY); // Box 204
		bodyModel[403] = new ModelRendererTurbo(this, 28, 180, textureX, textureY); // Box 166
		bodyModel[404] = new ModelRendererTurbo(this, 270, 2, textureX, textureY); // Box 127
		bodyModel[405] = new ModelRendererTurbo(this, 259, 2, textureX, textureY); // Box 54
		bodyModel[406] = new ModelRendererTurbo(this, 292, 1, textureX, textureY); // Box 124
		bodyModel[407] = new ModelRendererTurbo(this, 395, 70, textureX, textureY); // Box 123
		bodyModel[408] = new ModelRendererTurbo(this, 416, 70, textureX, textureY); // Box 122
		bodyModel[409] = new ModelRendererTurbo(this, 458, 71, textureX, textureY); // Box 121
		bodyModel[410] = new ModelRendererTurbo(this, 393, 66, textureX, textureY); // Box 120
		bodyModel[411] = new ModelRendererTurbo(this, 404, 65, textureX, textureY); // Box 119
		bodyModel[412] = new ModelRendererTurbo(this, 227, 16, textureX, textureY); // Box 118
		bodyModel[413] = new ModelRendererTurbo(this, 281, 4, textureX, textureY); // Box 116
		bodyModel[414] = new ModelRendererTurbo(this, 227, 10, textureX, textureY); // Box 115
		bodyModel[415] = new ModelRendererTurbo(this, 227, 5, textureX, textureY); // Box 114
		bodyModel[416] = new ModelRendererTurbo(this, 253, 16, textureX, textureY); // Box 113
		bodyModel[417] = new ModelRendererTurbo(this, 243, 21, textureX, textureY); // Box 112
		bodyModel[418] = new ModelRendererTurbo(this, 279, 23, textureX, textureY); // Box 111
		bodyModel[419] = new ModelRendererTurbo(this, 291, 17, textureX, textureY); // Box 110
		bodyModel[420] = new ModelRendererTurbo(this, 240, 5, textureX, textureY); // Box 109
		bodyModel[421] = new ModelRendererTurbo(this, 224, 28, textureX, textureY); // Box 347
		bodyModel[422] = new ModelRendererTurbo(this, 315, 4, textureX, textureY); // Box 345
		bodyModel[423] = new ModelRendererTurbo(this, 240, 10, textureX, textureY); // Box 266
		bodyModel[424] = new ModelRendererTurbo(this, 240, 16, textureX, textureY); // Box 265
		bodyModel[425] = new ModelRendererTurbo(this, 268, 16, textureX, textureY); // Box 264
		bodyModel[426] = new ModelRendererTurbo(this, 224, 21, textureX, textureY); // Box 263
		bodyModel[427] = new ModelRendererTurbo(this, 262, 23, textureX, textureY); // Box 281
		bodyModel[428] = new ModelRendererTurbo(this, 291, 20, textureX, textureY); // Box 160
		bodyModel[429] = new ModelRendererTurbo(this, 296, 17, textureX, textureY); // Box 100
		bodyModel[430] = new ModelRendererTurbo(this, 128, 167, textureX, textureY); // Box 99
		bodyModel[431] = new ModelRendererTurbo(this, 148, 167, textureX, textureY); // Box 98
		bodyModel[432] = new ModelRendererTurbo(this, 138, 161, textureX, textureY); // Box 97
		bodyModel[433] = new ModelRendererTurbo(this, 491, 85, textureX, textureY); // Box 92
		bodyModel[434] = new ModelRendererTurbo(this, 500, 85, textureX, textureY); // Box 91
		bodyModel[435] = new ModelRendererTurbo(this, 130, 175, textureX, textureY); // Box 90
		bodyModel[436] = new ModelRendererTurbo(this, 96, 220, textureX, textureY); // Box 87
		bodyModel[437] = new ModelRendererTurbo(this, 130, 187, textureX, textureY); // Box 86
		bodyModel[438] = new ModelRendererTurbo(this, 5, 234, textureX, textureY); // Box 83
		bodyModel[439] = new ModelRendererTurbo(this, 5, 202, textureX, textureY); // Box 82
		bodyModel[440] = new ModelRendererTurbo(this, 405, 61, textureX, textureY,  "cull"); // Box cull pilot
		bodyModel[441] = new ModelRendererTurbo(this, 410, 61, textureX, textureY,  "cull"); // Box cull pilot
		bodyModel[442] = new ModelRendererTurbo(this, 448, 50, textureX, textureY,  "cull"); // Box cull pilot
		bodyModel[443] = new ModelRendererTurbo(this, 27, 1, textureX, textureY); // Box 1
		bodyModel[444] = new ModelRendererTurbo(this, 480, 86, textureX, textureY); // Box 96
		bodyModel[445] = new ModelRendererTurbo(this, 395, 70, textureX, textureY); // Box 60
		bodyModel[446] = new ModelRendererTurbo(this, 416, 70, textureX, textureY); // Box 59
		bodyModel[447] = new ModelRendererTurbo(this, 402, 56, textureX, textureY); // Box 57
		bodyModel[448] = new ModelRendererTurbo(this, 393, 66, textureX, textureY); // Box 55
		bodyModel[449] = new ModelRendererTurbo(this, 393, 66, textureX, textureY); // Box 51
		bodyModel[450] = new ModelRendererTurbo(this, 500, 85, textureX, textureY); // Box 48
		bodyModel[451] = new ModelRendererTurbo(this, 491, 85, textureX, textureY); // Box 47
		bodyModel[452] = new ModelRendererTurbo(this, 491, 85, textureX, textureY); // Box 46
		bodyModel[453] = new ModelRendererTurbo(this, 500, 85, textureX, textureY); // Box 45
		bodyModel[454] = new ModelRendererTurbo(this, 500, 85, textureX, textureY); // Box 44
		bodyModel[455] = new ModelRendererTurbo(this, 491, 85, textureX, textureY); // Box 43
		bodyModel[456] = new ModelRendererTurbo(this, 491, 85, textureX, textureY); // Box 42
		bodyModel[457] = new ModelRendererTurbo(this, 500, 85, textureX, textureY); // Box 41
		bodyModel[458] = new ModelRendererTurbo(this, 500, 85, textureX, textureY); // Box 40
		bodyModel[459] = new ModelRendererTurbo(this, 491, 85, textureX, textureY); // Box 39
		bodyModel[460] = new ModelRendererTurbo(this, 491, 85, textureX, textureY); // Box 38
		bodyModel[461] = new ModelRendererTurbo(this, 500, 85, textureX, textureY); // Box 37
		bodyModel[462] = new ModelRendererTurbo(this, 491, 85, textureX, textureY); // Box 36
		bodyModel[463] = new ModelRendererTurbo(this, 500, 85, textureX, textureY); // Box 35
		bodyModel[464] = new ModelRendererTurbo(this, 500, 85, textureX, textureY); // Box 34
		bodyModel[465] = new ModelRendererTurbo(this, 491, 85, textureX, textureY); // Box 33
		bodyModel[466] = new ModelRendererTurbo(this, 395, 70, textureX, textureY); // Box 32
		bodyModel[467] = new ModelRendererTurbo(this, 395, 70, textureX, textureY); // Box 31
		bodyModel[468] = new ModelRendererTurbo(this, 435, 70, textureX, textureY); // Box 30
		bodyModel[469] = new ModelRendererTurbo(this, 435, 70, textureX, textureY); // Box 28
		bodyModel[470] = new ModelRendererTurbo(this, 488, 70, textureX, textureY); // Box 27
		bodyModel[471] = new ModelRendererTurbo(this, 488, 70, textureX, textureY); // Box 26
		bodyModel[472] = new ModelRendererTurbo(this, 488, 70, textureX, textureY); // Box 25
		bodyModel[473] = new ModelRendererTurbo(this, 488, 70, textureX, textureY); // Box 24
		bodyModel[474] = new ModelRendererTurbo(this, 488, 70, textureX, textureY); // Box 23
		bodyModel[475] = new ModelRendererTurbo(this, 488, 70, textureX, textureY); // Box 22
		bodyModel[476] = new ModelRendererTurbo(this, 389, 56, textureX, textureY); // Box 20
		bodyModel[477] = new ModelRendererTurbo(this, 485, 54, textureX, textureY); // Box 18
		bodyModel[478] = new ModelRendererTurbo(this, 395, 75, textureX, textureY); // Box 17
		bodyModel[479] = new ModelRendererTurbo(this, 395, 80, textureX, textureY); // Box 16
		bodyModel[480] = new ModelRendererTurbo(this, 369, 212, textureX, textureY); // Box 15
		bodyModel[481] = new ModelRendererTurbo(this, 369, 212, textureX, textureY); // Box 14
		bodyModel[482] = new ModelRendererTurbo(this, 369, 212, textureX, textureY); // Box 13
		bodyModel[483] = new ModelRendererTurbo(this, 369, 212, textureX, textureY); // Box 12
		bodyModel[484] = new ModelRendererTurbo(this, 320, 130, textureX, textureY); // Box 4
		bodyModel[485] = new ModelRendererTurbo(this, 326, 171, textureX, textureY); // Box 2
		bodyModel[486] = new ModelRendererTurbo(this, 334, 186, textureX, textureY); // Box 1
		bodyModel[487] = new ModelRendererTurbo(this, 405, 220, textureX, textureY); // Box 502
		bodyModel[488] = new ModelRendererTurbo(this, 2, 105, textureX, textureY); // Box worthington feedwaterheatrr bits
		bodyModel[489] = new ModelRendererTurbo(this, 23, 108, textureX, textureY); // Box 499
		bodyModel[490] = new ModelRendererTurbo(this, 13, 108, textureX, textureY); // Box worthington feedwaterheatrr bits
		bodyModel[491] = new ModelRendererTurbo(this, 23, 115, textureX, textureY); // Box worthington feedwaterheatrr bits
		bodyModel[492] = new ModelRendererTurbo(this, 10, 115, textureX, textureY); // Box worthington feedwaterheatrr bits
		bodyModel[493] = new ModelRendererTurbo(this, 18, 108, textureX, textureY); // Box worthington feedwaterheatrr bits
		bodyModel[494] = new ModelRendererTurbo(this, 32, 115, textureX, textureY); // Box worthington feedwaterheatrr bits
		bodyModel[495] = new ModelRendererTurbo(this, 37, 111, textureX, textureY); // Box worthington feedwaterheatrr bits
		bodyModel[496] = new ModelRendererTurbo(this, 2, 112, textureX, textureY); // Box worthington feedwaterheatrr bits
		bodyModel[497] = new ModelRendererTurbo(this, 28, 109, textureX, textureY); // Box worthington feedwaterheatrr bits
		bodyModel[498] = new ModelRendererTurbo(this, 7, 163, textureX, textureY); // Box 369
		bodyModel[499] = new ModelRendererTurbo(this, 16, 163, textureX, textureY); // Box 368

		bodyModel[0].addShapeBox(0F, 0F, 0F, 10, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box cull low steppa
		bodyModel[0].setRotationPoint(-27F, -2.5F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 3.625F, -0.05F, 0F, 3.625F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0.25F, 0F, -3.75F, -0.25F, 0F, 0F, 0F); // Box 501
		bodyModel[1].setRotationPoint(-19.75F, -13F, 8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[2].setRotationPoint(-27.75F, -13F, 6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 3.625F, 0.05F, 0F, 3.625F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, -0.25F, 0F, -3.75F, 0.25F, 0F, 0F, 0F); // Box 499
		bodyModel[3].setRotationPoint(-19.75F, -13F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[4].setRotationPoint(-27.75F, -13F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box frontal cull
		bodyModel[5].setRotationPoint(-32F, -11.5F, -1.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box cull steppies
		bodyModel[6].setRotationPoint(-30F, 0.5F, -9.25F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 2, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 498 cull
		bodyModel[7].setRotationPoint(24F, -20F, -4.5F);
		bodyModel[7].rotateAngleZ = 6.28318531F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box cull up nameplate
		bodyModel[8].setRotationPoint(-30F, -9F, -2F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 1.75F, 0.25F, 0F, 1.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box cull
		bodyModel[9].setRotationPoint(-30F, 0F, 1.7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.25F, -1F, 0F, 0.25F, -1F); // Box UP diesel era bodybit
		bodyModel[10].setRotationPoint(-29F, -1F, 1.45F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[11].setRotationPoint(37.99F, 0F, -12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[12].setRotationPoint(37.99F, -10F, -12F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 492
		bodyModel[13].setRotationPoint(37.99F, 0F, 11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[14].setRotationPoint(37.99F, -10F, 7F);

		bodyModel[15].addShapeBox(0F, -6F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 496
		bodyModel[15].setRotationPoint(17.25F, -11F, -6F);
		bodyModel[15].rotateAngleX = 0.34906585F;

		bodyModel[16].addShapeBox(0F, -6F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 495
		bodyModel[16].setRotationPoint(17.25F, -11F, 6F);
		bodyModel[16].rotateAngleX = -0.34906585F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 171 nep upfit twinbeam glow
		bodyModel[17].setRotationPoint(-30.25F, -18F, -0.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 171 nep upfit twinbeam glow
		bodyModel[18].setRotationPoint(-30.25F, -19.5F, -0.75F);

		bodyModel[19].addBox(0F, 0F, 0F, 19, 3, 3, 0F); // Box 490
		bodyModel[19].setRotationPoint(-16.75F, -5.25F, -11F);
		bodyModel[19].rotateAngleX = 0.78539816F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box cull c8 extendo
		bodyModel[20].setRotationPoint(-26F, -7.5F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box cull c8 walkway extendio
		bodyModel[21].setRotationPoint(-26F, -7.5F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 41, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box cull MORE pipes
		bodyModel[22].setRotationPoint(-24F, -7F, 8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 47, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box cull more pipes
		bodyModel[23].setRotationPoint(-24F, -7F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[24].setRotationPoint(-26F, -15.5F, 7.25F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box glow marker
		bodyModel[25].setRotationPoint(-26.5F, -15.75F, 7.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[26].setRotationPoint(-26F, -15.5F, -8.25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 479 glow marker
		bodyModel[27].setRotationPoint(-26.5F, -15.75F, -8.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box cull
		bodyModel[28].setRotationPoint(-31F, -8.5F, -2F);

		bodyModel[29].addBox(0F, 0F, 0F, 13, 4, 0, 0F); // Box 574
		bodyModel[29].setRotationPoint(24F, -21F, 6F);

		bodyModel[30].addShapeBox(-0.5F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[30].setRotationPoint(24F, -18F, 7.75F);

		bodyModel[31].addShapeBox(-0.25F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		bodyModel[31].setRotationPoint(32F, -18.5F, 8.25F);
		bodyModel[31].rotateAngleX = 0.38397244F;
		bodyModel[31].rotateAngleY = 1.57079633F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 5, 8, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box cull pipes
		bodyModel[32].setRotationPoint(-32.5F, 2.98F, -4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,-6F, 0.5F, -1F, 6.25F, 0.5F, -1F, 6.25F, 0.5F, 1F, -6F, 0.5F, 1F, 1F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 1F, 1F, 0F); // Box 473
		bodyModel[33].setRotationPoint(-29.5F, -5F, 5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,-6F, 0.5F, 1F, 6.25F, 0.5F, 1F, 6.25F, 0.5F, -1F, -6F, 0.5F, -1F, 1F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 1F, 1F, 0F); // Box 471
		bodyModel[34].setRotationPoint(-29.5F, -5F, -5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 8, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F); // Box flaggy
		bodyModel[35].setRotationPoint(-27F, -21.75F, 3.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 8, 8, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F); // Box flaggy
		bodyModel[36].setRotationPoint(-27F, -21.75F, -3.75F);

		bodyModel[37].addShapeBox(-3.87F, -2F, 0F, 4, 2, 4, 0F,-1.125F, 0.5F, -0.125F, -0.125F, 1F, -0.125F, -0.125F, 1F, -0.125F, -1.125F, 0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box cull stack curver
		bodyModel[37].setRotationPoint(-19.62F, -23F, -2F);
		bodyModel[37].rotateAngleZ = -2.60054059F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[38].setRotationPoint(14.25F, -0.5F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 15, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[39].setRotationPoint(-27.01F, -18F, -7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[40].setRotationPoint(-27.51F, -16F, -5.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		bodyModel[41].setRotationPoint(-27.75F, -9F, -5.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[42].setRotationPoint(-27.75F, -13F, -5.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 478
		bodyModel[43].setRotationPoint(16F, 0F, 6.01F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 477
		bodyModel[44].setRotationPoint(16F, 0F, -6.01F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 476
		bodyModel[45].setRotationPoint(5F, 0F, 6.01F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 475
		bodyModel[46].setRotationPoint(5F, 0F, -6.01F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 474
		bodyModel[47].setRotationPoint(-6F, 0F, 6.01F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 473
		bodyModel[48].setRotationPoint(-6F, 0F, -6.01F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 472
		bodyModel[49].setRotationPoint(-17F, 0F, 6.01F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -1F, 0F); // Box cull squat cowcatcher
		bodyModel[50].setRotationPoint(-33.02F, 7F, -0.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -1F, 0F); // Box cull squat cowcatcher
		bodyModel[51].setRotationPoint(-33.02F, 7F, -2.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F); // Box cull squat cowcatcher
		bodyModel[52].setRotationPoint(-33.02F, 7F, 0.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box hehe peanits
		bodyModel[53].setRotationPoint(-28F, 0F, -0.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box hehe peanits
		bodyModel[54].setRotationPoint(-28.5F, 3.5F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box hehe peanits
		bodyModel[55].setRotationPoint(-28.5F, 3.5F, -3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box firehose reel
		bodyModel[56].setRotationPoint(-31F, -5F, 3.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box firehose reel
		bodyModel[57].setRotationPoint(-29F, -3F, 2.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 5, 7, 0F); // Box 306 late espee firehose box
		bodyModel[58].setRotationPoint(-30F, -4F, -3.75F);

		bodyModel[59].addBox(0F, 0F, 0F, 9, 2, 3, 0F); // Box 462
		bodyModel[59].setRotationPoint(31.5F, -2F, -1.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 12, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull random pipes
		bodyModel[60].setRotationPoint(30F, -2.5F, -5F);

		bodyModel[61].addShapeBox(0F, -6F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 459
		bodyModel[61].setRotationPoint(5.25F, -11F, 6F);
		bodyModel[61].rotateAngleX = -0.34906585F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box fat smaller stack
		bodyModel[62].setRotationPoint(-23.5F, -23F, -2F);

		bodyModel[63].addShapeBox(0F, -6F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 457
		bodyModel[63].setRotationPoint(5.25F, -11F, -6F);
		bodyModel[63].rotateAngleX = 0.34906585F;

		bodyModel[64].addBox(0F, 0F, 0F, 20, 3, 3, 0F); // Box 455
		bodyModel[64].setRotationPoint(-16.75F, -5.25F, 6.75F);
		bodyModel[64].rotateAngleX = 0.78539816F;

		bodyModel[65].addShapeBox(0F, -2F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[65].setRotationPoint(-17.5F, -12F, 7F);

		bodyModel[66].addShapeBox(0F, -2F, 0F, 1, 5, 1, 0F,0F, -1F, 4.5F, 0F, -1F, 4.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 453
		bodyModel[66].setRotationPoint(-17.5F, -16.5F, 8F);

		bodyModel[67].addShapeBox(0F, -2F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[67].setRotationPoint(-17.5F, -16.5F, -3.5F);

		bodyModel[68].addShapeBox(0F, -2F, 0F, 1, 5, 1, 0F,0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -1F, 4.5F, 0F, -1F, 4.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 451
		bodyModel[68].setRotationPoint(-17.5F, -16.5F, -9F);

		bodyModel[69].addShapeBox(0F, -2F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[69].setRotationPoint(-17.5F, -12F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 
		bodyModel[70].setRotationPoint(15.01F, -10F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box cull walkway c9
		bodyModel[71].setRotationPoint(1F, -10.5F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -1F, 0F); // Box cull espee cowcatcher
		bodyModel[72].setRotationPoint(-33.02F, 6F, -2.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F); // Box cull espee cowcatcher
		bodyModel[73].setRotationPoint(-33.02F, 6F, 0.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 443 cull espee c10 walkway
		bodyModel[74].setRotationPoint(-26F, -7F, 7.74F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 42, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 442 cull espee c10 walkways
		bodyModel[75].setRotationPoint(-25F, -7.5F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 441 cull espee c10 walkway
		bodyModel[76].setRotationPoint(-26F, -7F, -10.74F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 48, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 440 cull espee c10 walkway
		bodyModel[77].setRotationPoint(-25F, -7.5F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 8, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439 cull
		bodyModel[78].setRotationPoint(29.99F, -3.5F, -6.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 438
		bodyModel[79].setRotationPoint(-27F, -23F, -1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.05F, 0F, 0.1F, -0.05F, 0F, 0.1F, -0.05F, 0F, 0.1F, -0.05F, 0F, 0.1F, -0.05F, 0F, 0.1F, -0.05F, 0F, 0.1F, -0.05F, 0F, 0.1F, -0.05F, 0F, 0.1F); // Box glow early up headlight 
		bodyModel[80].setRotationPoint(-27F, -21.5F, -1.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box glow early up headlight
		bodyModel[81].setRotationPoint(-27.25F, -22F, -1.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[82].setRotationPoint(-27F, -19F, -1.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[83].setRotationPoint(-27F, -22F, -1.5F);

		bodyModel[84].addShapeBox(0F, -6F, -2F, 51, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // handrails cull up early and espee
		bodyModel[84].setRotationPoint(-27.75F, -11F, 6F);
		bodyModel[84].rotateAngleX = -0.34906585F;

		bodyModel[85].addShapeBox(0F, -6F, 0F, 51, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // handrails cull up early and espee
		bodyModel[85].setRotationPoint(-27.75F, -11F, -6F);
		bodyModel[85].rotateAngleX = 0.34906585F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[86].setRotationPoint(37.5F, 4F, -2.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 87
		bodyModel[87].setRotationPoint(38.5F, 3F, -1.5F);

		bodyModel[88].addShapeBox(0.5F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[88].setRotationPoint(30.25F, -9F, -2.5F);
		bodyModel[88].rotateAngleZ = 0.10471976F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 428
		bodyModel[89].setRotationPoint(-26F, 6F, 2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 427
		bodyModel[90].setRotationPoint(-26F, 6F, -3F);

		bodyModel[91].addBox(0F, 0F, 0F, 3, 2, 8, 0F); // Box 426
		bodyModel[91].setRotationPoint(-29F, 6F, -4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 5, 9, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[92].setRotationPoint(25.5F, -1.75F, -4.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box NEP frontals cull
		bodyModel[93].setRotationPoint(-31F, -19.5F, -1.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box espee interwar light
		bodyModel[94].setRotationPoint(-31.75F, -11.75F, -1.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.35F); // Box espee interwar light glow
		bodyModel[95].setRotationPoint(-30.5F, -11.25F, -1.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box espee interwar light cull 
		bodyModel[96].setRotationPoint(-30.75F, -8F, -1.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box espee interwar light
		bodyModel[97].setRotationPoint(-30.73F, -8.75F, -1.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box espee interwar light glow
		bodyModel[98].setRotationPoint(-31F, -11.75F, -1.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box espee interwar light
		bodyModel[99].setRotationPoint(-30.75F, -11.75F, -1.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0.05F, -0.1F, -0.25F, -0.9F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0.05F, -0.1F, -0.25F, -0.9F); // Box NEP frontals glow
		bodyModel[100].setRotationPoint(-30F, -19F, 1.51F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.1F, -0.25F, -0.9F, -0.1F, -0.25F, 0.05F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, -0.9F, -0.1F, -0.25F, 0.05F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F); // Box NEP frontals glow
		bodyModel[101].setRotationPoint(-30F, -19F, -2.51F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box NEP frontals glow
		bodyModel[102].setRotationPoint(-30.25F, -19.5F, -1.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box NEP frontals
		bodyModel[103].setRotationPoint(-30F, -19F, 1.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box NEP frontals
		bodyModel[104].setRotationPoint(-29F, -18.5F, -1.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box NEP frontals
		bodyModel[105].setRotationPoint(-30F, -19F, -2.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box NEP frontals
		bodyModel[106].setRotationPoint(-29F, -19.5F, -1.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box NEP frontals
		bodyModel[107].setRotationPoint(-30F, -19.5F, -1.5F);

		bodyModel[108].addBox(0F, -7F, 0F, 7, 7, 0, 0F); // Box 416
		bodyModel[108].setRotationPoint(31F, -4F, 8.5F);
		bodyModel[108].rotateAngleZ = 0.78539816F;

		bodyModel[109].addShapeBox(-0.5F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		bodyModel[109].setRotationPoint(32F, -12F, 8.25F);

		bodyModel[110].addShapeBox(-0.5F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		bodyModel[110].setRotationPoint(31F, -12F, 7.25F);
		bodyModel[110].rotateAngleZ = 0.15707963F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		bodyModel[111].setRotationPoint(27F, -5F, 7.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 14, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[112].setRotationPoint(31F, -18F, -7.5F);
		bodyModel[112].rotateAngleZ = 0.05235988F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 411
		bodyModel[113].setRotationPoint(31.5F, -12F, -7.5F);
		bodyModel[113].rotateAngleZ = 0.10471976F;

		bodyModel[114].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 410
		bodyModel[114].setRotationPoint(31F, -17F, 5F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 409
		bodyModel[115].setRotationPoint(31F, -18F, 3F);

		bodyModel[116].addShapeBox(-0.5F, 0F, -2F, 1, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[116].setRotationPoint(32F, -12F, 5.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 406
		bodyModel[117].setRotationPoint(31F, -17F, -7F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 405
		bodyModel[118].setRotationPoint(31F, -14F, -3F);

		bodyModel[119].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 404
		bodyModel[119].setRotationPoint(31F, -11F, 4.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 403
		bodyModel[120].setRotationPoint(31F, -13F, -7.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[121].setRotationPoint(31F, -8F, -2F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 279
		bodyModel[122].setRotationPoint(29F, -17.75F, -11.97F);
		bodyModel[122].rotateAngleX = -0.26179939F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[123].setRotationPoint(29F, -17.5F, 10.97F);
		bodyModel[123].rotateAngleX = 0.26179939F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 399
		bodyModel[124].setRotationPoint(29F, -10F, 10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 398
		bodyModel[125].setRotationPoint(29F, -10F, -12F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 397
		bodyModel[126].setRotationPoint(-24.75F, -5.65F, -11F);
		bodyModel[126].rotateAngleX = 0.78539816F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 5, 9, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396 cull espee danglybits
		bodyModel[127].setRotationPoint(13F, 0.25F, -9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 8, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull espee danglybits
		bodyModel[128].setRotationPoint(31.5F, 1.25F, -9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[129].setRotationPoint(23F, -22.25F, -2.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box cull crown/cover
		bodyModel[130].setRotationPoint(-23.5F, -24.5F, -2F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 47, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box cull
		bodyModel[131].setRotationPoint(-24F, -5.5F, 7.99F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 47, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 519 cull
		bodyModel[132].setRotationPoint(-24F, -5.5F, -11.01F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[133].setRotationPoint(-10.75F, -3F, 8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[134].setRotationPoint(-11.75F, -3.5F, 7.45F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[135].setRotationPoint(-14.75F, -2.5F, 7.2F);
		bodyModel[135].rotateAngleX = 0.78539816F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[136].setRotationPoint(-18.75F, -2.5F, 6.5F);
		bodyModel[136].rotateAngleX = 0.78539816F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[137].setRotationPoint(-14.75F, -2.5F, 6.5F);
		bodyModel[137].rotateAngleX = 0.78539816F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box boiler button
		bodyModel[138].setRotationPoint(-28F, -12F, -1.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box fncc frontals
		bodyModel[139].setRotationPoint(-32F, -19.5F, -1.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box fncc frontals
		bodyModel[140].setRotationPoint(-33F, -19.5F, -1.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box fncc frontals glow
		bodyModel[141].setRotationPoint(-30.5F, -19F, -1.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box fncc frontals glow
		bodyModel[142].setRotationPoint(-31.5F, -19.5F, -1.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box fncc frontals
		bodyModel[143].setRotationPoint(-31F, -19.5F, -1.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 379
		bodyModel[144].setRotationPoint(19.75F, -3F, 7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[145].setRotationPoint(35F, 2F, 7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[146].setRotationPoint(25F, -1F, 7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[147].setRotationPoint(19.75F, -11F, 7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[148].setRotationPoint(21F, -5F, 7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[149].setRotationPoint(21F, -12F, 7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 373
		bodyModel[150].setRotationPoint(19.75F, -12.5F, 6.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 372
		bodyModel[151].setRotationPoint(9F, -17.5F, -5.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[152].setRotationPoint(8F, -14F, -8.25F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, 3.75F, 0F, 0F, 3.75F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F); // Box 370
		bodyModel[153].setRotationPoint(8F, -16.5F, -9.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 16, 3, 3, 0F); // Box 369
		bodyModel[154].setRotationPoint(-16.75F, -3.75F, -11F);
		bodyModel[154].rotateAngleX = 0.78539816F;

		bodyModel[155].addBox(0F, 0F, 0F, 13, 3, 3, 0F); // Box 368
		bodyModel[155].setRotationPoint(-9.75F, -3.75F, 6.5F);
		bodyModel[155].rotateAngleX = 0.78539816F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[156].setRotationPoint(20F, -18.5F, 0.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, -1F, 4.5F, 2F, -1F, 4.5F, 2F, 0F, -5.5F, -2F, 0F, -5.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 364
		bodyModel[157].setRotationPoint(18F, -18.5F, 8F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[158].setRotationPoint(18F, -14F, 7F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 362
		bodyModel[159].setRotationPoint(17.75F, -12.5F, 6.75F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[160].setRotationPoint(-10F, -10F, 7.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[161].setRotationPoint(-9F, -10.5F, 7.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[162].setRotationPoint(-8F, -8.5F, 7.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 358
		bodyModel[163].setRotationPoint(4F, -11.5F, 7.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[164].setRotationPoint(10F, -11.5F, 7.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 4.5F, 0F, -1F, 4.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 363
		bodyModel[165].setRotationPoint(-24.9F, -18.5F, 8F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[166].setRotationPoint(-24.9F, -14F, 7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[167].setRotationPoint(-24.9F, -18.5F, -3.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -1F, 4.5F, 0F, -1F, 4.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 326
		bodyModel[168].setRotationPoint(-24.9F, -18.5F, -9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[169].setRotationPoint(-24.9F, -14F, -8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 355
		bodyModel[170].setRotationPoint(16F, -18.5F, -3.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[171].setRotationPoint(-10F, -10F, -8.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[172].setRotationPoint(-9F, -10.5F, -8.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[173].setRotationPoint(-8F, -8.5F, -8.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 351
		bodyModel[174].setRotationPoint(-2F, -11.5F, -8.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,1F, 1F, -6F, -1F, 1F, -6F, -1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 326
		bodyModel[175].setRotationPoint(17F, -17.5F, -9.5F);

		bodyModel[176].addShapeBox(0F, 0F, -1F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box cull up all handrails
		bodyModel[176].setRotationPoint(12F, -15.5F, 7F);
		bodyModel[176].rotateAngleX = 0.27925268F;

		bodyModel[177].addShapeBox(0F, 0F, -1F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box cull up all handrails
		bodyModel[177].setRotationPoint(-5F, -15.5F, 7F);
		bodyModel[177].rotateAngleX = 0.27925268F;

		bodyModel[178].addShapeBox(-5F, -1F, -1F, 28, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull up all handrails
		bodyModel[178].setRotationPoint(0F, -15.5F, 7F);
		bodyModel[178].rotateAngleX = 0.27925268F;

		bodyModel[179].addShapeBox(0F, 0F, -1F, 38, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull up all handrails
		bodyModel[179].setRotationPoint(-26F, -15.5F, 7F);
		bodyModel[179].rotateAngleX = 0.27925268F;

		bodyModel[180].addShapeBox(0F, 0F, -1F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box cull up all handrails
		bodyModel[180].setRotationPoint(12F, -15.5F, -7F);
		bodyModel[180].rotateAngleX = -0.27925268F;

		bodyModel[181].addShapeBox(-5F, -1F, -1F, 28, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull up all handrails
		bodyModel[181].setRotationPoint(0F, -15.5F, -7F);
		bodyModel[181].rotateAngleX = -0.27925268F;

		bodyModel[182].addShapeBox(0F, 0F, -1F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box cull up all handrails
		bodyModel[182].setRotationPoint(-5F, -15.5F, -7F);
		bodyModel[182].rotateAngleX = -0.27925268F;

		bodyModel[183].addShapeBox(0F, 0F, -1F, 38, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull up all handrails
		bodyModel[183].setRotationPoint(-26F, -15.5F, -7F);
		bodyModel[183].rotateAngleX = -0.27925268F;

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[184].setRotationPoint(36F, -2F, -8.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[185].setRotationPoint(19F, -3F, -8.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[186].setRotationPoint(33F, 3F, -8.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[187].setRotationPoint(23F, -1F, -8.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[188].setRotationPoint(19F, -1F, -8.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[189].setRotationPoint(18F, -11F, -8.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[190].setRotationPoint(4F, -11.5F, -8.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 330
		bodyModel[191].setRotationPoint(16.75F, -11F, -8.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[192].setRotationPoint(17F, -13.5F, -8.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 328
		bodyModel[193].setRotationPoint(16.5F, -12.5F, -8.75F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 191
		bodyModel[194].setRotationPoint(9.25F, -4.75F, -9.25F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 190
		bodyModel[195].setRotationPoint(11.5F, -4.75F, -9.25F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 189
		bodyModel[196].setRotationPoint(11.5F, -9.75F, -9.25F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 188
		bodyModel[197].setRotationPoint(9.25F, -9.75F, -9.25F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 187
		bodyModel[198].setRotationPoint(12F, -6.5F, -8.75F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 186
		bodyModel[199].setRotationPoint(9.75F, -6.5F, -8.75F);

		bodyModel[200].addShapeBox(-0.5F, 0F, 0F, 12, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[200].setRotationPoint(3.5F, -4F, 9.01F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 378
		bodyModel[201].setRotationPoint(-32.75F, 2F, 0F);

		bodyModel[202].addBox(0F, -3F, 0F, 0, 3, 14, 0F); // Box 341
		bodyModel[202].setRotationPoint(-32.5F, 4.5F, -7F);
		bodyModel[202].rotateAngleZ = -0.27925268F;

		bodyModel[203].addBox(0F, 0F, 0F, 0, 2, 16, 0F); // Box 1086
		bodyModel[203].setRotationPoint(-31F, 1.5F, -8F);

		bodyModel[204].addShapeBox(-0.5F, 0F, 0F, 9, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box power reverse.jpg
		bodyModel[204].setRotationPoint(-17.5F, -0.5F, 8.01F);

		bodyModel[205].addShapeBox(-0.5F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box power reverse.jpg
		bodyModel[205].setRotationPoint(-8.5F, -1F, 8.01F);
		bodyModel[205].rotateAngleZ = -0.19198622F;

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box power reverse.jpg
		bodyModel[206].setRotationPoint(-9.5F, -0.5F, 6F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 312
		bodyModel[207].setRotationPoint(-9.75F, 0.5F, 6F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull plowsteps
		bodyModel[208].setRotationPoint(-34.5F, 6.5F, 6F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull plowsteps
		bodyModel[209].setRotationPoint(-34.5F, 6.5F, -8F);

		bodyModel[210].addShapeBox(0F, 0F, -2F, 1, 2, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 309
		bodyModel[210].setRotationPoint(-34.5F, 2F, 4F);

		bodyModel[211].addShapeBox(0F, 0F, -2F, 1, 2, 8, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[211].setRotationPoint(-34.5F, 2F, -8F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[212].setRotationPoint(-34.5F, 4F, -10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[213].setRotationPoint(-34.5F, 6F, -10F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[214].setRotationPoint(-34.5F, 4F, 2F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[215].setRotationPoint(-34.5F, 6F, 0F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[216].setRotationPoint(-35.5F, 7F, -10F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[217].setRotationPoint(-35.5F, 7F, 0F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		bodyModel[218].setRotationPoint(18.25F, -3.5F, 7.5F);
		bodyModel[218].rotateAngleX = 0.78539816F;

		bodyModel[219].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[219].setRotationPoint(14.25F, -3.5F, 7.5F);
		bodyModel[219].rotateAngleX = 0.78539816F;

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		bodyModel[220].setRotationPoint(15.25F, -3.5F, 8.2F);
		bodyModel[220].rotateAngleX = 0.78539816F;

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[221].setRotationPoint(14.25F, -4.5F, 8.45F);

		bodyModel[222].addBox(0F, 0F, 0F, 20, 3, 3, 0F); // Box 483
		bodyModel[222].setRotationPoint(-16.75F, -3.75F, 6.5F);
		bodyModel[222].rotateAngleX = 0.78539816F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[223].setRotationPoint(14.5F, -21.5F, 0.25F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[224].setRotationPoint(14.5F, -22F, -1.25F);

		bodyModel[225].addBox(-1F, -1F, 0F, 2, 2, 3, 0F); // Box 201
		bodyModel[225].setRotationPoint(19F, -19.5F, -1.5F);
		bodyModel[225].rotateAngleZ = 0.78539816F;

		bodyModel[226].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 229
		bodyModel[226].setRotationPoint(18.5F, -18.5F, -1.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 202
		bodyModel[227].setRotationPoint(19F, -21.5F, -1.25F);

		bodyModel[228].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 201
		bodyModel[228].setRotationPoint(19F, -19.55F, 1.25F);
		bodyModel[228].rotateAngleZ = 0.78539816F;

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[229].setRotationPoint(-27.75F, -4.5F, -3.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[230].setRotationPoint(-27.75F, -11F, 6F);

		bodyModel[231].addShapeBox(0F, 0F, -3F, 1, 0, 3, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[231].setRotationPoint(-27.75F, -7F, 6F);
		bodyModel[231].rotateAngleX = 0.78539816F;

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[232].setRotationPoint(-27.75F, -11F, -6F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 2
		bodyModel[233].setRotationPoint(-27.75F, -7F, -6F);
		bodyModel[233].rotateAngleX = -0.78539816F;

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[234].setRotationPoint(31.25F, -3.5F, -6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 0, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[235].setRotationPoint(38F, -3.5F, -5.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 295
		bodyModel[236].setRotationPoint(38F, -3.5F, 5.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[237].setRotationPoint(38F, -3.5F, -10.5F);

		bodyModel[238].addShapeBox(-0.5F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[238].setRotationPoint(-5F, 0.5F, -8F);
		bodyModel[238].rotateAngleZ = -0.34906585F;

		bodyModel[239].addShapeBox(0F, 0F, 0F, 13, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[239].setRotationPoint(-18.5F, 0.25F, -8F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 289
		bodyModel[240].setRotationPoint(-23.5F, 1.25F, -4F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[241].setRotationPoint(4.25F, -5.5F, -5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[242].setRotationPoint(-27F, -17.75F, 5.75F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 284 glow marker
		bodyModel[243].setRotationPoint(-27.05F, -18F, 5.25F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[244].setRotationPoint(-27F, -17.75F, -5.75F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 284 glow marker
		bodyModel[245].setRotationPoint(-27.05F, -18F, -6.25F);

		bodyModel[246].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box epsee frontals
		bodyModel[246].setRotationPoint(-31F, -11.5F, -1.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box epsee frontals glow
		bodyModel[247].setRotationPoint(-31.25F, -11.5F, -1.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box epsee frontals cull
		bodyModel[248].setRotationPoint(-30F, -8.49F, -2F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box epsee frontals
		bodyModel[249].setRotationPoint(-31F, -11F, -2.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box epsee frontals
		bodyModel[250].setRotationPoint(-31F, -11F, 1.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box epsee frontals
		bodyModel[251].setRotationPoint(-30F, -11.5F, -1.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box epsee frontals
		bodyModel[252].setRotationPoint(-30F, -10.5F, -1.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box sp smokeboxdoor
		bodyModel[253].setRotationPoint(-27.5F, -13F, -5.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box sp smokeboxdoor
		bodyModel[254].setRotationPoint(-27.5F, -13F, 2.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box sp smokeboxdoor
		bodyModel[255].setRotationPoint(-27.5F, -16F, -2.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[256].setRotationPoint(41F, -19.5F, 9F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F); // Box 262
		bodyModel[257].setRotationPoint(41F, -21.5F, 3F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 259
		bodyModel[258].setRotationPoint(41F, -19.5F, -10F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[259].setRotationPoint(41F, -21.5F, -9F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[260].setRotationPoint(41F, -21.5F, -3F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box up cabtail
		bodyModel[261].setRotationPoint(38F, -21.5F, 3F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box up cabtail
		bodyModel[262].setRotationPoint(38F, -19F, 10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box up cabtail
		bodyModel[263].setRotationPoint(38F, -21.5F, -3F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box up cabtail
		bodyModel[264].setRotationPoint(38F, -21.5F, -10F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box up cabtail
		bodyModel[265].setRotationPoint(38F, -19F, -11F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 249
		bodyModel[266].setRotationPoint(-5F, -2F, 3.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 248
		bodyModel[267].setRotationPoint(-1F, -2F, 3.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box leafspring rider cull
		bodyModel[268].setRotationPoint(-5F, -2.5F, 3.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 246
		bodyModel[269].setRotationPoint(-16F, -2F, 3.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 245
		bodyModel[270].setRotationPoint(-12F, -2F, 3.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box leafspring rider cull
		bodyModel[271].setRotationPoint(-16F, -2.5F, 3.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 243
		bodyModel[272].setRotationPoint(-5F, -2F, -4.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 242
		bodyModel[273].setRotationPoint(-1F, -2F, -4.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box leafspring rider cull
		bodyModel[274].setRotationPoint(-5F, -2.5F, -4.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 43
		bodyModel[275].setRotationPoint(-16F, -2F, -4.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 44
		bodyModel[276].setRotationPoint(-12F, -2F, -4.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box leafspring rider cull
		bodyModel[277].setRotationPoint(-16F, -2.5F, -4.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Box 239
		bodyModel[278].setRotationPoint(-18F, 5F, 7.65F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 238
		bodyModel[279].setRotationPoint(-11.5F, 4.75F, 7.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F); // Box 237
		bodyModel[280].setRotationPoint(-11.5F, 6F, 7.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 236
		bodyModel[281].setRotationPoint(-11.5F, 4F, 7.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[282].setRotationPoint(-17.5F, 6.75F, 7.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 234
		bodyModel[283].setRotationPoint(-17.5F, 3.25F, 7.5F);

		bodyModel[284].addShapeBox(21F, -1F, 0F, 2, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[284].setRotationPoint(-10F, 5.5F, 7.65F);
		bodyModel[284].rotateAngleZ = 0.02617994F;

		bodyModel[285].addShapeBox(0F, -1F, 0F, 21, 2, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Box 232
		bodyModel[285].setRotationPoint(-10F, 5.5F, 7.65F);
		bodyModel[285].rotateAngleZ = 0.02617994F;

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0.5F); // Box 231
		bodyModel[286].setRotationPoint(11F, 4F, 6F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 230
		bodyModel[287].setRotationPoint(22F, 4F, 6F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 229
		bodyModel[288].setRotationPoint(0F, 4F, 6F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 31, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 228
		bodyModel[289].setRotationPoint(-9F, 4F, 6F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 227
		bodyModel[290].setRotationPoint(-11F, 4F, 6F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[291].setRotationPoint(-6.75F, 2F, 7F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[292].setRotationPoint(-6.75F, 2F, 5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F); // Box 228
		bodyModel[293].setRotationPoint(-6.75F, 1F, 8F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[294].setRotationPoint(-6.75F, 4F, 9F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 226
		bodyModel[295].setRotationPoint(-6.75F, 8F, 6F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[296].setRotationPoint(-6.75F, 2F, -9F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[297].setRotationPoint(-6.75F, 2F, -6F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 223
		bodyModel[298].setRotationPoint(-18F, 5F, -8.65F);

		bodyModel[299].addShapeBox(0.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box cull
		bodyModel[299].setRotationPoint(-22.5F, -18F, 4.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[300].setRotationPoint(-6.75F, -1F, 6F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[301].setRotationPoint(-6.75F, -6F, -6F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[302].setRotationPoint(-6.75F, -1F, -9F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 369
		bodyModel[303].setRotationPoint(-6.75F, 1F, -9F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[304].setRotationPoint(-6.75F, 4F, -10F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 366
		bodyModel[305].setRotationPoint(-6.75F, 8F, -9F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 379
		bodyModel[306].setRotationPoint(-13.5F, 4.75F, -8.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F); // Box 378
		bodyModel[307].setRotationPoint(-13.5F, 6F, -8.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 377
		bodyModel[308].setRotationPoint(-13.5F, 4F, -8.5F);

		bodyModel[309].addShapeBox(21F, -1F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 221
		bodyModel[309].setRotationPoint(-12F, 5.5F, -8.65F);
		bodyModel[309].rotateAngleZ = -0.06981317F;

		bodyModel[310].addShapeBox(0F, -1F, 0F, 21, 2, 1, 0F,0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 380
		bodyModel[310].setRotationPoint(-12F, 5.5F, -8.65F);
		bodyModel[310].rotateAngleZ = -0.06981317F;

		bodyModel[311].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[311].setRotationPoint(-17.5F, 6.75F, -8.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 375
		bodyModel[312].setRotationPoint(-17.5F, 3.25F, -8.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 595 glow marker
		bodyModel[313].setRotationPoint(-28.05F, -17F, 4.75F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[314].setRotationPoint(-28F, -16.75F, 5.25F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow marker
		bodyModel[315].setRotationPoint(-28.05F, -17F, -5.75F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[316].setRotationPoint(-28F, -16.75F, -5.25F);

		bodyModel[317].addBox(-2.5F, 0F, -1F, 5, 2, 1, 0F); // Box 623
		bodyModel[317].setRotationPoint(-21F, -20F, -5F);
		bodyModel[317].rotateAngleY = -0.61086524F;

		bodyModel[318].addShapeBox(-2.5F, 0F, -1.05F, 5, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 626 numberboard glow
		bodyModel[318].setRotationPoint(-21F, -20F, -5F);
		bodyModel[318].rotateAngleY = -0.61086524F;

		bodyModel[319].addShapeBox(-2.5F, 0F, 0.05F, 5, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 626 numberboard glow
		bodyModel[319].setRotationPoint(-21F, -20F, 5F);
		bodyModel[319].rotateAngleY = 0.61086524F;

		bodyModel[320].addBox(-2.5F, 0F, 0F, 5, 2, 1, 0F); // Box 627
		bodyModel[320].setRotationPoint(-21F, -20F, 5F);
		bodyModel[320].rotateAngleY = 0.61086524F;

		bodyModel[321].addShapeBox(0.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 355 cull
		bodyModel[321].setRotationPoint(-22.5F, -18F, -4.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[322].setRotationPoint(-3F, -18.5F, -0.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[323].setRotationPoint(-3F, -20.5F, -0.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[324].setRotationPoint(-3F, -21.5F, -0.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407 bell holder cull
		bodyModel[325].setRotationPoint(-3F, -21.5F, -1.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[326].setRotationPoint(-26F, -5.5F, 7.74F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317 cull multi-step
		bodyModel[327].setRotationPoint(-28F, -3.5F, 7.74F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 318
		bodyModel[328].setRotationPoint(-26F, -5.5F, -10.74F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 317 cull multi-step
		bodyModel[329].setRotationPoint(-28F, -3.5F, -10.74F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 184
		bodyModel[330].setRotationPoint(-31.5F, 3F, 3F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 183
		bodyModel[331].setRotationPoint(-30F, 5F, 6.01F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 49, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 182 cull walkway
		bodyModel[332].setRotationPoint(-26F, -6F, 7F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 49, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 181 cull walkway
		bodyModel[333].setRotationPoint(-26F, -6F, -11F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 180
		bodyModel[334].setRotationPoint(-27.25F, -8.5F, -7.75F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 179
		bodyModel[335].setRotationPoint(-27.25F, -13.5F, -7.75F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[336].setRotationPoint(-27.75F, -9.5F, -5.05F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[337].setRotationPoint(-27.75F, -12.5F, -5.05F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[338].setRotationPoint(-23.5F, 5F, 5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[339].setRotationPoint(-23.5F, 5F, -9F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[340].setRotationPoint(-24F, -0.25F, 6.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 377
		bodyModel[341].setRotationPoint(9F, 6F, -7F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 376
		bodyModel[342].setRotationPoint(20F, 6F, -7F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 375
		bodyModel[343].setRotationPoint(-2F, 6F, -7F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 31, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[344].setRotationPoint(-11F, 6F, -7F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 370
		bodyModel[345].setRotationPoint(-13F, 6F, -7F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box up high mount headlight
		bodyModel[346].setRotationPoint(-29.5F, -19F, 1.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box up high mount headlight
		bodyModel[347].setRotationPoint(-29.5F, -19F, -2.5F);

		bodyModel[348].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box up high mount headlight
		bodyModel[348].setRotationPoint(-29.5F, -19.5F, -1.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box up high mount headlight
		bodyModel[349].setRotationPoint(-28.5F, -19.5F, -1.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 205 glow
		bodyModel[350].setRotationPoint(-29.75F, -19.5F, -1.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box cull
		bodyModel[351].setRotationPoint(-29.5F, -16.5F, -2F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[352].setRotationPoint(37F, -18F, 5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box up cabtail
		bodyModel[353].setRotationPoint(38F, -18.5F, 10F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box up cabtail
		bodyModel[354].setRotationPoint(38F, -18.5F, -11F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[355].setRotationPoint(37F, -21F, 3F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[356].setRotationPoint(37F, -21F, -3F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[357].setRotationPoint(37F, -21F, -10F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[358].setRotationPoint(37F, -18F, -11F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[359].setRotationPoint(22F, -18.5F, 10F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[360].setRotationPoint(22F, -18.5F, -11F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[361].setRotationPoint(22F, -19F, 10F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 16, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[362].setRotationPoint(22F, -21.5F, -3F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 16, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 191
		bodyModel[363].setRotationPoint(22F, -21.5F, 3F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 16, 1, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[364].setRotationPoint(22F, -21.5F, -10F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[365].setRotationPoint(22F, -19F, -11F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[366].setRotationPoint(23F, -21F, 3F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[367].setRotationPoint(23F, -21F, -10F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[368].setRotationPoint(23F, -21F, -3F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[369].setRotationPoint(24F, -18F, 10F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[370].setRotationPoint(24F, -18F, -11F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[371].setRotationPoint(23F, -18F, -11F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 15, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 170
		bodyModel[372].setRotationPoint(23F, -4F, -11F);

		bodyModel[373].addBox(0F, 0F, 0F, 0, 6, 15, 0F); // Box 2
		bodyModel[373].setRotationPoint(-32.02F, 3F, -7.5F);

		bodyModel[374].addBox(0F, 0F, 0F, 3, 0, 15, 0F); // Box 2
		bodyModel[374].setRotationPoint(-35.02F, 9F, -7.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -1F, 0F); // Box cull cowcatcher
		bodyModel[375].setRotationPoint(-33.02F, 6F, -4.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -1F, 0F); // Box cull cowcatcher
		bodyModel[376].setRotationPoint(-33.02F, 6F, -0.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F); // Box cull cowcatcher
		bodyModel[377].setRotationPoint(-33.02F, 6F, 0.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box up frontals
		bodyModel[378].setRotationPoint(-30F, -11.5F, 1.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box up frontals
		bodyModel[379].setRotationPoint(-30F, -11.5F, -2.5F);

		bodyModel[380].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box up frontals
		bodyModel[380].setRotationPoint(-30F, -12F, -1.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box up frontals glow
		bodyModel[381].setRotationPoint(-30.25F, -12F, -1.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box up frontals cull
		bodyModel[382].setRotationPoint(-30F, -9F, -2F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box up frontals
		bodyModel[383].setRotationPoint(-29F, -12F, -1.5F);

		bodyModel[384].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 222 cull
		bodyModel[384].setRotationPoint(15F, -20F, 0F);
		bodyModel[384].rotateAngleY = -0.78539816F;

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F); // Box 152
		bodyModel[385].setRotationPoint(-10F, -19F, -1.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F); // Box 151
		bodyModel[386].setRotationPoint(-10F, -22F, -1.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 150
		bodyModel[387].setRotationPoint(-10F, -23F, -1.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 149
		bodyModel[388].setRotationPoint(-13F, -19F, -2.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 148
		bodyModel[389].setRotationPoint(-13F, -22F, -2.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 147
		bodyModel[390].setRotationPoint(-13F, -23F, -1.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F); // Box 146
		bodyModel[391].setRotationPoint(-14F, -19F, -1.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F); // Box 145
		bodyModel[392].setRotationPoint(-14F, -22F, -1.5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 144
		bodyModel[393].setRotationPoint(-14F, -23F, -1.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 193
		bodyModel[394].setRotationPoint(5F, -22F, -2F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 194
		bodyModel[395].setRotationPoint(4F, -22F, -2F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F); // Box 196
		bodyModel[396].setRotationPoint(4F, -19F, -2F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 197
		bodyModel[397].setRotationPoint(9F, -22F, -2F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F); // Box 199
		bodyModel[398].setRotationPoint(9F, -19F, -2F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 201
		bodyModel[399].setRotationPoint(5F, -19F, -3F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F); // Box 202
		bodyModel[400].setRotationPoint(4F, -21F, -2F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 203
		bodyModel[401].setRotationPoint(5F, -21F, -3F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F); // Box 204
		bodyModel[402].setRotationPoint(9F, -21F, -2F);

		bodyModel[403].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 166
		bodyModel[403].setRotationPoint(-23F, -24F, -1.5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F,0F, -1F, 2F, 0F, -1F, 2F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 127
		bodyModel[404].setRotationPoint(-22.5F, -7F, 6.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F,0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 54
		bodyModel[405].setRotationPoint(-22.5F, -7F, -8.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 5, 3, 12, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 124
		bodyModel[406].setRotationPoint(-23.5F, 2.5F, -6.25F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 123
		bodyModel[407].setRotationPoint(-23.5F, 6.5F, 3F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 122
		bodyModel[408].setRotationPoint(-23.5F, 2.5F, 3F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F); // Box 121
		bodyModel[409].setRotationPoint(-26.5F, 4F, 3F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F); // Box 120
		bodyModel[410].setRotationPoint(-26.5F, 5.5F, 3F);

		bodyModel[411].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 119
		bodyModel[411].setRotationPoint(-16.5F, 6.5F, 3F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[412].setRotationPoint(-23.5F, -0.75F, 5.25F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[413].setRotationPoint(-24.5F, 3.75F, 6.25F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[414].setRotationPoint(-23.5F, 3F, 10F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 114
		bodyModel[415].setRotationPoint(-23.5F, 0F, 9.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 113
		bodyModel[416].setRotationPoint(-23.5F, 7F, 9F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[417].setRotationPoint(-23.5F, 7F, 5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 5, 8, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[418].setRotationPoint(-23.5F, -1F, 6.25F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[419].setRotationPoint(-23.5F, -0.75F, 9.25F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[420].setRotationPoint(-23.5F, -0.75F, -6.25F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 347
		bodyModel[421].setRotationPoint(-24F, -0.25F, -9.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 345
		bodyModel[422].setRotationPoint(-24.5F, 3.75F, -10.25F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 266
		bodyModel[423].setRotationPoint(-23.5F, 3F, -11F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 265
		bodyModel[424].setRotationPoint(-23.5F, 0F, -10.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 264
		bodyModel[425].setRotationPoint(-23.5F, 7F, -11F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 263
		bodyModel[426].setRotationPoint(-23.5F, 7F, -9F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 5, 8, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[427].setRotationPoint(-23.5F, -1F, -9.25F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[428].setRotationPoint(-23.5F, -0.75F, -10.25F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 5, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[429].setRotationPoint(-23.5F, -7.75F, -4F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[430].setRotationPoint(-27.5F, -12F, 1.5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 98
		bodyModel[431].setRotationPoint(-27.5F, -12F, -4.5F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[432].setRotationPoint(-27.5F, -15F, -1.5F);

		bodyModel[433].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 92
		bodyModel[433].setRotationPoint(28.5F, 3.5F, -6F);

		bodyModel[434].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 91
		bodyModel[434].setRotationPoint(28.5F, 3.5F, 3F);

		bodyModel[435].addBox(0F, 0F, 0F, 16, 4, 7, 0F); // Box 90
		bodyModel[435].setRotationPoint(15F, -18F, -3.5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 17, 7, 15, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, -1F); // Box 87
		bodyModel[436].setRotationPoint(14F, -7F, -7.5F);

		bodyModel[437].addBox(0F, 0F, 0F, 16, 7, 7, 0F); // Box 86
		bodyModel[437].setRotationPoint(15F, -14F, -3.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 41, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[438].setRotationPoint(-27F, -7F, -7.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 41, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 82
		bodyModel[439].setRotationPoint(-27F, -7F, 3.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull pilot
		bodyModel[440].setRotationPoint(-31.01F, 2.99F, 8F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box cull pilot
		bodyModel[441].setRotationPoint(-31.01F, 2.99F, -9F);

		bodyModel[442].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box cull pilot
		bodyModel[442].setRotationPoint(-32.01F, 2.99F, -8F);

		bodyModel[443].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[443].setRotationPoint(-36F, 3F, -1.5F);

		bodyModel[444].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 96
		bodyModel[444].setRotationPoint(-33F, 3F, -2F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[445].setRotationPoint(-23.5F, 6.5F, -6F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[446].setRotationPoint(-23.5F, 2.5F, -6F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 57
		bodyModel[447].setRotationPoint(-31.5F, 3F, -5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F); // Box 55
		bodyModel[448].setRotationPoint(-26.5F, 4F, -5F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F); // Box 51
		bodyModel[449].setRotationPoint(-26.5F, 5.5F, -5F);

		bodyModel[450].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 48
		bodyModel[450].setRotationPoint(18.5F, 3.5F, 3F);

		bodyModel[451].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 47
		bodyModel[451].setRotationPoint(18.5F, 3.5F, -6F);

		bodyModel[452].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 46
		bodyModel[452].setRotationPoint(22.5F, 3.5F, -6F);

		bodyModel[453].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 45
		bodyModel[453].setRotationPoint(22.5F, 3.5F, 3F);

		bodyModel[454].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 44
		bodyModel[454].setRotationPoint(7.5F, 3.5F, 3F);

		bodyModel[455].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 43
		bodyModel[455].setRotationPoint(7.5F, 3.5F, -6F);

		bodyModel[456].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 42
		bodyModel[456].setRotationPoint(11.5F, 3.5F, -6F);

		bodyModel[457].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 41
		bodyModel[457].setRotationPoint(11.5F, 3.5F, 3F);

		bodyModel[458].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 40
		bodyModel[458].setRotationPoint(-3.5F, 3.5F, 3F);

		bodyModel[459].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 39
		bodyModel[459].setRotationPoint(-3.5F, 3.5F, -6F);

		bodyModel[460].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 38
		bodyModel[460].setRotationPoint(0.5F, 3.5F, -6F);

		bodyModel[461].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 37
		bodyModel[461].setRotationPoint(0.5F, 3.5F, 3F);

		bodyModel[462].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 36
		bodyModel[462].setRotationPoint(-10.5F, 3.5F, -6F);

		bodyModel[463].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 35
		bodyModel[463].setRotationPoint(-10.5F, 3.5F, 3F);

		bodyModel[464].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 34
		bodyModel[464].setRotationPoint(-14.5F, 3.5F, 3F);

		bodyModel[465].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 33
		bodyModel[465].setRotationPoint(-14.5F, 3.5F, -6F);

		bodyModel[466].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 32
		bodyModel[466].setRotationPoint(22.5F, 6.5F, 3F);

		bodyModel[467].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 31
		bodyModel[467].setRotationPoint(22.5F, 6.5F, -6F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[468].setRotationPoint(29.5F, 6.5F, 3F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[469].setRotationPoint(29.5F, 6.5F, -6F);

		bodyModel[470].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 27
		bodyModel[470].setRotationPoint(11.5F, 6.5F, 3F);

		bodyModel[471].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 26
		bodyModel[471].setRotationPoint(11.5F, 6.5F, -6F);

		bodyModel[472].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 25
		bodyModel[472].setRotationPoint(0.5F, 6.5F, 3F);

		bodyModel[473].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 24
		bodyModel[473].setRotationPoint(0.5F, 6.5F, -6F);

		bodyModel[474].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 23
		bodyModel[474].setRotationPoint(-10.5F, 6.5F, 3F);

		bodyModel[475].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 22
		bodyModel[475].setRotationPoint(-10.5F, 6.5F, -6F);

		bodyModel[476].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 20
		bodyModel[476].setRotationPoint(-16.5F, 6.5F, -6F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[477].setRotationPoint(37.5F, 2.5F, -6F);

		bodyModel[478].addBox(0F, 0F, 0F, 55, 1, 3, 0F); // Box 17
		bodyModel[478].setRotationPoint(-17.5F, 2.5F, 3F);

		bodyModel[479].addBox(0F, 0F, 0F, 55, 1, 3, 0F); // Box 16
		bodyModel[479].setRotationPoint(-17.5F, 2.5F, -6F);

		bodyModel[480].addBox(0F, 0F, 0F, 3, 3, 12, 0F); // Box 15
		bodyModel[480].setRotationPoint(8.5F, 3.5F, -6F);

		bodyModel[481].addBox(0F, 0F, 0F, 3, 3, 12, 0F); // Box 14
		bodyModel[481].setRotationPoint(19.5F, 3.5F, -6F);

		bodyModel[482].addBox(0F, 0F, 0F, 3, 3, 12, 0F); // Box 13
		bodyModel[482].setRotationPoint(-2.5F, 3.5F, -6F);

		bodyModel[483].addBox(0F, 0F, 0F, 3, 3, 12, 0F); // Box 12
		bodyModel[483].setRotationPoint(-13.5F, 3.5F, -6F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 4
		bodyModel[484].setRotationPoint(-17F, 0F, -6.01F);

		bodyModel[485].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 2
		bodyModel[485].setRotationPoint(-28.5F, 6.5F, -6F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 1
		bodyModel[486].setRotationPoint(-30F, 5F, -6.01F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 502
		bodyModel[487].setRotationPoint(-2F, -5.5F, -8.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box worthington feedwaterheatrr bits
		bodyModel[488].setRotationPoint(3.75F, -4.75F, -10.25F);

		bodyModel[489].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 499
		bodyModel[489].setRotationPoint(3.75F, -5.5F, -9.75F);

		bodyModel[490].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box worthington feedwaterheatrr bits
		bodyModel[490].setRotationPoint(6F, -6.5F, -9.75F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box worthington feedwaterheatrr bits
		bodyModel[491].setRotationPoint(5.5F, -9.75F, -10.25F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box worthington feedwaterheatrr bits
		bodyModel[492].setRotationPoint(1.25F, -9.75F, -10.25F);

		bodyModel[493].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box worthington feedwaterheatrr bits
		bodyModel[493].setRotationPoint(1.75F, -5.5F, -9.75F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box worthington feedwaterheatrr bits
		bodyModel[494].setRotationPoint(1.25F, -3.75F, -10.25F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -2.25F, -1.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -2.25F, 2.25F, 0F, 2.75F, -1.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 2.75F, 2.25F); // Box worthington feedwaterheatrr bits
		bodyModel[495].setRotationPoint(-5.75F, -6.75F, -9.75F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F); // Box worthington feedwaterheatrr bits
		bodyModel[496].setRotationPoint(-17.75F, -4.25F, -7.75F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box worthington feedwaterheatrr bits
		bodyModel[497].setRotationPoint(-18.75F, -4.25F, -6.25F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 369
		bodyModel[498].setRotationPoint(3.25F, -4.75F, -10.25F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 368
		bodyModel[499].setRotationPoint(5.5F, -4.75F, -10.25F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 40, 169, textureX, textureY); // Box 367
		bodyModel[501] = new ModelRendererTurbo(this, 35, 169, textureX, textureY); // Box 366
		bodyModel[502] = new ModelRendererTurbo(this, 16, 157, textureX, textureY); // Box 365
		bodyModel[503] = new ModelRendererTurbo(this, 7, 157, textureX, textureY); // Box 364
		bodyModel[504] = new ModelRendererTurbo(this, 5, 190, textureX, textureY); // Box 274
		bodyModel[505] = new ModelRendererTurbo(this, 5, 243, textureX, textureY); // Box 84
		bodyModel[506] = new ModelRendererTurbo(this, 2, 211, textureX, textureY); // Box 18

		bodyModel[500].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 367
		bodyModel[500].setRotationPoint(6F, -6.5F, -9.75F);

		bodyModel[501].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 366
		bodyModel[501].setRotationPoint(3.75F, -6.5F, -9.75F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 365
		bodyModel[502].setRotationPoint(5.5F, -9.75F, -10.25F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 364
		bodyModel[503].setRotationPoint(3.25F, -9.75F, -10.25F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 58, 7, 4, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[504].setRotationPoint(-27F, -14F, 3.5F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 58, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[505].setRotationPoint(-27F, -14F, -7.5F);

		bodyModel[506].addBox(0F, 0F, 0F, 42, 15, 7, 0F); // Box 18
		bodyModel[506].setRotationPoint(-27F, -18F, -3.5F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
	}
}