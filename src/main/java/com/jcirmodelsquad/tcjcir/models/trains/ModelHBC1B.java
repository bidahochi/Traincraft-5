//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FNCC HBC1-B
// Model Creator: Bida
// Created on: 12.08.2023 - 10:53:16
// Last changed on: 12.08.2023 - 10:53:16

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelCabooseTruck2;
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

public class ModelHBC1B extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHBC1B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[281];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 473, 233, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 349, 245, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 473, 233, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 336, 249, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 336, 249, textureX, textureY); // Box 65
		bodyModel[5] = new ModelRendererTurbo(this, 323, 245, textureX, textureY); // Box 73
		bodyModel[6] = new ModelRendererTurbo(this, 323, 245, textureX, textureY); // Box 73
		bodyModel[7] = new ModelRendererTurbo(this, 323, 245, textureX, textureY); // Box 194
		bodyModel[8] = new ModelRendererTurbo(this, 323, 245, textureX, textureY); // Box 195
		bodyModel[9] = new ModelRendererTurbo(this, 319, 194, textureX, textureY); // Box 8
		bodyModel[10] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 8
		bodyModel[11] = new ModelRendererTurbo(this, 321, 190, textureX, textureY); // Box 8
		bodyModel[12] = new ModelRendererTurbo(this, 319, 187, textureX, textureY); // Box 8
		bodyModel[13] = new ModelRendererTurbo(this, 319, 217, textureX, textureY); // Box 34
		bodyModel[14] = new ModelRendererTurbo(this, 321, 208, textureX, textureY); // Box 35
		bodyModel[15] = new ModelRendererTurbo(this, 321, 213, textureX, textureY); // Box 36
		bodyModel[16] = new ModelRendererTurbo(this, 319, 210, textureX, textureY); // Box 37
		bodyModel[17] = new ModelRendererTurbo(this, 328, 219, textureX, textureY); // Box 47
		bodyModel[18] = new ModelRendererTurbo(this, 321, 190, textureX, textureY); // Box 40
		bodyModel[19] = new ModelRendererTurbo(this, 319, 187, textureX, textureY); // Box 41
		bodyModel[20] = new ModelRendererTurbo(this, 319, 194, textureX, textureY); // Box 42
		bodyModel[21] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 43
		bodyModel[22] = new ModelRendererTurbo(this, 319, 217, textureX, textureY); // Box 44
		bodyModel[23] = new ModelRendererTurbo(this, 321, 213, textureX, textureY); // Box 45
		bodyModel[24] = new ModelRendererTurbo(this, 319, 210, textureX, textureY); // Box 46
		bodyModel[25] = new ModelRendererTurbo(this, 321, 208, textureX, textureY); // Box 47
		bodyModel[26] = new ModelRendererTurbo(this, 347, 222, textureX, textureY); // Box 1
		bodyModel[27] = new ModelRendererTurbo(this, 328, 225, textureX, textureY); // Box 1
		bodyModel[28] = new ModelRendererTurbo(this, 472, 225, textureX, textureY); // Box 50
		bodyModel[29] = new ModelRendererTurbo(this, 420, 212, textureX, textureY); // Box 286
		bodyModel[30] = new ModelRendererTurbo(this, 420, 212, textureX, textureY); // Box 287
		bodyModel[31] = new ModelRendererTurbo(this, 410, 213, textureX, textureY); // Box 196
		bodyModel[32] = new ModelRendererTurbo(this, 419, 217, textureX, textureY); // Box 197
		bodyModel[33] = new ModelRendererTurbo(this, 401, 220, textureX, textureY); // Box 198
		bodyModel[34] = new ModelRendererTurbo(this, 412, 217, textureX, textureY); // Box 199
		bodyModel[35] = new ModelRendererTurbo(this, 412, 217, textureX, textureY); // Box 200
		bodyModel[36] = new ModelRendererTurbo(this, 412, 214, textureX, textureY); // Box 201
		bodyModel[37] = new ModelRendererTurbo(this, 385, 220, textureX, textureY); // Box 202
		bodyModel[38] = new ModelRendererTurbo(this, 389, 220, textureX, textureY); // Box 203
		bodyModel[39] = new ModelRendererTurbo(this, 399, 220, textureX, textureY); // Box 204
		bodyModel[40] = new ModelRendererTurbo(this, 449, 213, textureX, textureY); // Box 62
		bodyModel[41] = new ModelRendererTurbo(this, 393, 213, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 393, 208, textureX, textureY); // Box 41
		bodyModel[43] = new ModelRendererTurbo(this, 393, 208, textureX, textureY); // Box 41
		bodyModel[44] = new ModelRendererTurbo(this, 446, 209, textureX, textureY); // Box 66
		bodyModel[45] = new ModelRendererTurbo(this, 446, 209, textureX, textureY); // Box 67
		bodyModel[46] = new ModelRendererTurbo(this, 3, 109, textureX, textureY); // Box 322
		bodyModel[47] = new ModelRendererTurbo(this, 312, 232, textureX, textureY); // Box 324
		bodyModel[48] = new ModelRendererTurbo(this, 276, 226, textureX, textureY); // Box 325
		bodyModel[49] = new ModelRendererTurbo(this, 3, 207, textureX, textureY); // Box 327
		bodyModel[50] = new ModelRendererTurbo(this, 3, 192, textureX, textureY); // Box 328
		bodyModel[51] = new ModelRendererTurbo(this, 10, 203, textureX, textureY); // Box 329
		bodyModel[52] = new ModelRendererTurbo(this, 3, 181, textureX, textureY); // Box 330
		bodyModel[53] = new ModelRendererTurbo(this, 297, 222, textureX, textureY); // Box 331
		bodyModel[54] = new ModelRendererTurbo(this, 3, 170, textureX, textureY); // Box 332
		bodyModel[55] = new ModelRendererTurbo(this, 490, 250, textureX, textureY); // Box 80
		bodyModel[56] = new ModelRendererTurbo(this, 490, 253, textureX, textureY); // Box 81
		bodyModel[57] = new ModelRendererTurbo(this, 353, 220, textureX, textureY); // Box 72
		bodyModel[58] = new ModelRendererTurbo(this, 355, 216, textureX, textureY); // Box 87
		bodyModel[59] = new ModelRendererTurbo(this, 235, 99, textureX, textureY); // Box 337
		bodyModel[60] = new ModelRendererTurbo(this, 358, 216, textureX, textureY); // Box 87
		bodyModel[61] = new ModelRendererTurbo(this, 128, 112, textureX, textureY); // Box 346
		bodyModel[62] = new ModelRendererTurbo(this, 117, 181, textureX, textureY); // Box 350
		bodyModel[63] = new ModelRendererTurbo(this, 117, 170, textureX, textureY); // Box 351
		bodyModel[64] = new ModelRendererTurbo(this, 336, 207, textureX, textureY); // Box 352
		bodyModel[65] = new ModelRendererTurbo(this, 336, 201, textureX, textureY); // Box 353
		bodyModel[66] = new ModelRendererTurbo(this, 448, 197, textureX, textureY); // Box 354
		bodyModel[67] = new ModelRendererTurbo(this, 448, 203, textureX, textureY); // Box 355
		bodyModel[68] = new ModelRendererTurbo(this, 379, 215, textureX, textureY); // Box 358
		bodyModel[69] = new ModelRendererTurbo(this, 345, 213, textureX, textureY); // Box 359
		bodyModel[70] = new ModelRendererTurbo(this, 382, 215, textureX, textureY); // Box 360
		bodyModel[71] = new ModelRendererTurbo(this, 96, 170, textureX, textureY); // Box 361
		bodyModel[72] = new ModelRendererTurbo(this, 96, 170, textureX, textureY); // Box 362
		bodyModel[73] = new ModelRendererTurbo(this, 96, 181, textureX, textureY); // Box 363
		bodyModel[74] = new ModelRendererTurbo(this, 96, 181, textureX, textureY); // Box 364
		bodyModel[75] = new ModelRendererTurbo(this, 108, 181, textureX, textureY); // Box 365
		bodyModel[76] = new ModelRendererTurbo(this, 108, 181, textureX, textureY); // Box 366
		bodyModel[77] = new ModelRendererTurbo(this, 36, 181, textureX, textureY); // Box 367
		bodyModel[78] = new ModelRendererTurbo(this, 34, 181, textureX, textureY); // Box 368
		bodyModel[79] = new ModelRendererTurbo(this, 34, 170, textureX, textureY); // Box 369
		bodyModel[80] = new ModelRendererTurbo(this, 36, 181, textureX, textureY); // Box 370
		bodyModel[81] = new ModelRendererTurbo(this, 34, 170, textureX, textureY); // Box 371
		bodyModel[82] = new ModelRendererTurbo(this, 34, 181, textureX, textureY); // Box 372
		bodyModel[83] = new ModelRendererTurbo(this, 36, 181, textureX, textureY); // Box 373
		bodyModel[84] = new ModelRendererTurbo(this, 34, 181, textureX, textureY); // Box 374
		bodyModel[85] = new ModelRendererTurbo(this, 34, 170, textureX, textureY); // Box 375
		bodyModel[86] = new ModelRendererTurbo(this, 36, 181, textureX, textureY); // Box 376
		bodyModel[87] = new ModelRendererTurbo(this, 34, 181, textureX, textureY); // Box 377
		bodyModel[88] = new ModelRendererTurbo(this, 34, 170, textureX, textureY); // Box 378
		bodyModel[89] = new ModelRendererTurbo(this, 36, 181, textureX, textureY); // Box 379
		bodyModel[90] = new ModelRendererTurbo(this, 34, 181, textureX, textureY); // Box 380
		bodyModel[91] = new ModelRendererTurbo(this, 34, 170, textureX, textureY); // Box 381
		bodyModel[92] = new ModelRendererTurbo(this, 36, 181, textureX, textureY); // Box 382
		bodyModel[93] = new ModelRendererTurbo(this, 34, 181, textureX, textureY); // Box 383
		bodyModel[94] = new ModelRendererTurbo(this, 34, 170, textureX, textureY); // Box 384
		bodyModel[95] = new ModelRendererTurbo(this, 36, 181, textureX, textureY); // Box 385
		bodyModel[96] = new ModelRendererTurbo(this, 34, 181, textureX, textureY); // Box 386
		bodyModel[97] = new ModelRendererTurbo(this, 34, 170, textureX, textureY); // Box 387
		bodyModel[98] = new ModelRendererTurbo(this, 8, 165, textureX, textureY); // Box 388
		bodyModel[99] = new ModelRendererTurbo(this, 235, 127, textureX, textureY); // Box 390
		bodyModel[100] = new ModelRendererTurbo(this, 118, 226, textureX, textureY); // Box 391
		bodyModel[101] = new ModelRendererTurbo(this, 154, 232, textureX, textureY); // Box 392
		bodyModel[102] = new ModelRendererTurbo(this, 432, 215, textureX, textureY); // Box 397
		bodyModel[103] = new ModelRendererTurbo(this, 432, 214, textureX, textureY); // Box 398
		bodyModel[104] = new ModelRendererTurbo(this, 432, 214, textureX, textureY); // Box 399
		bodyModel[105] = new ModelRendererTurbo(this, 246, 194, textureX, textureY); // Box 288
		bodyModel[106] = new ModelRendererTurbo(this, 248, 201, textureX, textureY, "lamp"); // Box 289 rear light L
		bodyModel[107] = new ModelRendererTurbo(this, 248, 206, textureX, textureY, "lamp"); // Box 290 rear light R
		bodyModel[108] = new ModelRendererTurbo(this, 257, 194, textureX, textureY); // Box 410
		bodyModel[109] = new ModelRendererTurbo(this, 259, 206, textureX, textureY, "lamp"); // Box 411 front light R
		bodyModel[110] = new ModelRendererTurbo(this, 259, 201, textureX, textureY, "lamp"); // Box 412 front light L
		bodyModel[111] = new ModelRendererTurbo(this, 251, 216, textureX, textureY, BoxName.prime1.prime1); // Box 6 PRIME1-1
		bodyModel[112] = new ModelRendererTurbo(this, 251, 216, textureX, textureY, BoxName.prime1.prime3); // Box 7 PRIME1-3
		bodyModel[113] = new ModelRendererTurbo(this, 251, 216, textureX, textureY, BoxName.prime1.prime2); // Box 8 PRIME1-2
		bodyModel[114] = new ModelRendererTurbo(this, 251, 216, textureX, textureY, BoxName.prime1.prime4); // Box 9 PRIME1-4
		bodyModel[115] = new ModelRendererTurbo(this, 251, 212, textureX, textureY); // Box 428
		bodyModel[116] = new ModelRendererTurbo(this, 25, 170, textureX, textureY); // Box 423
		bodyModel[117] = new ModelRendererTurbo(this, 25, 170, textureX, textureY); // Box 424
		bodyModel[118] = new ModelRendererTurbo(this, 83, 170, textureX, textureY); // Box 425
		bodyModel[119] = new ModelRendererTurbo(this, 83, 170, textureX, textureY); // Box 426
		bodyModel[120] = new ModelRendererTurbo(this, 320, 219, textureX, textureY); // Box 427
		bodyModel[121] = new ModelRendererTurbo(this, 325, 220, textureX, textureY); // Box 428
		bodyModel[122] = new ModelRendererTurbo(this, 320, 224, textureX, textureY); // Box 429
		bodyModel[123] = new ModelRendererTurbo(this, 325, 225, textureX, textureY); // Box 430
		bodyModel[124] = new ModelRendererTurbo(this, 328, 224, textureX, textureY); // Box 431
		bodyModel[125] = new ModelRendererTurbo(this, 325, 202, textureX, textureY); // Box 432
		bodyModel[126] = new ModelRendererTurbo(this, 328, 201, textureX, textureY); // Box 433
		bodyModel[127] = new ModelRendererTurbo(this, 320, 201, textureX, textureY); // Box 434
		bodyModel[128] = new ModelRendererTurbo(this, 328, 196, textureX, textureY); // Box 435
		bodyModel[129] = new ModelRendererTurbo(this, 325, 197, textureX, textureY); // Box 436
		bodyModel[130] = new ModelRendererTurbo(this, 320, 196, textureX, textureY); // Box 437
		bodyModel[131] = new ModelRendererTurbo(this, 451, 191, textureX, textureY); // Box 438
		bodyModel[132] = new ModelRendererTurbo(this, 472, 204, textureX, textureY); // Box 439
		bodyModel[133] = new ModelRendererTurbo(this, 243, 214, textureX, textureY); // Box 425
		bodyModel[134] = new ModelRendererTurbo(this, 77, 174, textureX, textureY, "cull"); // Box 445 cull
		bodyModel[135] = new ModelRendererTurbo(this, 89, 184, textureX, textureY); // Import Box39
		bodyModel[136] = new ModelRendererTurbo(this, 89, 184, textureX, textureY); // Import Box39
		bodyModel[137] = new ModelRendererTurbo(this, 55, 182, textureX, textureY, "cull"); // Box 449 cull
		bodyModel[138] = new ModelRendererTurbo(this, 55, 181, textureX, textureY); // Box 450
		bodyModel[139] = new ModelRendererTurbo(this, 55, 181, textureX, textureY); // Box 451
		bodyModel[140] = new ModelRendererTurbo(this, 75, 218, textureX, textureY); // Box 452
		bodyModel[141] = new ModelRendererTurbo(this, 75, 218, textureX, textureY); // Box 453
		bodyModel[142] = new ModelRendererTurbo(this, 82, 218, textureX, textureY); // Box 454
		bodyModel[143] = new ModelRendererTurbo(this, 82, 218, textureX, textureY); // Box 455
		bodyModel[144] = new ModelRendererTurbo(this, 238, 167, textureX, textureY); // Box 298
		bodyModel[145] = new ModelRendererTurbo(this, 274, 167, textureX, textureY); // Box 299
		bodyModel[146] = new ModelRendererTurbo(this, 277, 167, textureX, textureY); // Box 61
		bodyModel[147] = new ModelRendererTurbo(this, 235, 167, textureX, textureY); // Box 63
		bodyModel[148] = new ModelRendererTurbo(this, 241, 167, textureX, textureY); // Box 460
		bodyModel[149] = new ModelRendererTurbo(this, 271, 167, textureX, textureY); // Box 461
		bodyModel[150] = new ModelRendererTurbo(this, 235, 175, textureX, textureY); // Box 462
		bodyModel[151] = new ModelRendererTurbo(this, 277, 175, textureX, textureY); // Box 463
		bodyModel[152] = new ModelRendererTurbo(this, 277, 145, textureX, textureY); // Box 464
		bodyModel[153] = new ModelRendererTurbo(this, 277, 137, textureX, textureY); // Box 465
		bodyModel[154] = new ModelRendererTurbo(this, 274, 137, textureX, textureY); // Box 466
		bodyModel[155] = new ModelRendererTurbo(this, 271, 137, textureX, textureY); // Box 467
		bodyModel[156] = new ModelRendererTurbo(this, 235, 145, textureX, textureY); // Box 468
		bodyModel[157] = new ModelRendererTurbo(this, 235, 137, textureX, textureY); // Box 469
		bodyModel[158] = new ModelRendererTurbo(this, 238, 137, textureX, textureY); // Box 470
		bodyModel[159] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 471
		bodyModel[160] = new ModelRendererTurbo(this, 320, 201, textureX, textureY); // Box 472
		bodyModel[161] = new ModelRendererTurbo(this, 325, 202, textureX, textureY); // Box 473
		bodyModel[162] = new ModelRendererTurbo(this, 328, 201, textureX, textureY); // Box 474
		bodyModel[163] = new ModelRendererTurbo(this, 320, 196, textureX, textureY); // Box 475
		bodyModel[164] = new ModelRendererTurbo(this, 325, 197, textureX, textureY); // Box 476
		bodyModel[165] = new ModelRendererTurbo(this, 328, 196, textureX, textureY); // Box 477
		bodyModel[166] = new ModelRendererTurbo(this, 328, 219, textureX, textureY); // Box 478
		bodyModel[167] = new ModelRendererTurbo(this, 320, 219, textureX, textureY); // Box 479
		bodyModel[168] = new ModelRendererTurbo(this, 325, 220, textureX, textureY); // Box 480
		bodyModel[169] = new ModelRendererTurbo(this, 320, 224, textureX, textureY); // Box 481
		bodyModel[170] = new ModelRendererTurbo(this, 325, 225, textureX, textureY); // Box 482
		bodyModel[171] = new ModelRendererTurbo(this, 328, 224, textureX, textureY); // Box 483
		bodyModel[172] = new ModelRendererTurbo(this, 349, 216, textureX, textureY); // Box 484
		bodyModel[173] = new ModelRendererTurbo(this, 355, 216, textureX, textureY); // Box 485
		bodyModel[174] = new ModelRendererTurbo(this, 353, 220, textureX, textureY); // Box 486
		bodyModel[175] = new ModelRendererTurbo(this, 379, 215, textureX, textureY); // Box 487
		bodyModel[176] = new ModelRendererTurbo(this, 345, 213, textureX, textureY); // Box 488
		bodyModel[177] = new ModelRendererTurbo(this, 382, 215, textureX, textureY); // Box 489
		bodyModel[178] = new ModelRendererTurbo(this, 4, 155, textureX, textureY); // Box 490
		bodyModel[179] = new ModelRendererTurbo(this, 4, 145, textureX, textureY); // Box 491
		bodyModel[180] = new ModelRendererTurbo(this, 139, 222, textureX, textureY); // Box 494
		bodyModel[181] = new ModelRendererTurbo(this, 436, 138, textureX, textureY); // Box 496
		bodyModel[182] = new ModelRendererTurbo(this, 438, 189, textureX, textureY); // Import Box106
		bodyModel[183] = new ModelRendererTurbo(this, 432, 183, textureX, textureY); // Import Box106
		bodyModel[184] = new ModelRendererTurbo(this, 434, 173, textureX, textureY); // Import Box106
		bodyModel[185] = new ModelRendererTurbo(this, 435, 189, textureX, textureY); // Import Box106
		bodyModel[186] = new ModelRendererTurbo(this, 328, 163, textureX, textureY); // Import Box106
		bodyModel[187] = new ModelRendererTurbo(this, 343, 167, textureX, textureY); // Import Box106
		bodyModel[188] = new ModelRendererTurbo(this, 345, 157, textureX, textureY); // Import Box106
		bodyModel[189] = new ModelRendererTurbo(this, 346, 173, textureX, textureY); // Import Box106
		bodyModel[190] = new ModelRendererTurbo(this, 331, 143, textureX, textureY); // Import Box106
		bodyModel[191] = new ModelRendererTurbo(this, 334, 133, textureX, textureY); // Import Box106
		bodyModel[192] = new ModelRendererTurbo(this, 335, 149, textureX, textureY); // Import Box106
		bodyModel[193] = new ModelRendererTurbo(this, 370, 149, textureX, textureY); // Box 510
		bodyModel[194] = new ModelRendererTurbo(this, 366, 143, textureX, textureY); // Box 511
		bodyModel[195] = new ModelRendererTurbo(this, 369, 133, textureX, textureY); // Box 512
		bodyModel[196] = new ModelRendererTurbo(this, 347, 133, textureX, textureY); // Box 520
		bodyModel[197] = new ModelRendererTurbo(this, 347, 133, textureX, textureY); // Box 521
		bodyModel[198] = new ModelRendererTurbo(this, 410, 189, textureX, textureY); // Import Box106
		bodyModel[199] = new ModelRendererTurbo(this, 418, 180, textureX, textureY); // Import Box40
		bodyModel[200] = new ModelRendererTurbo(this, 418, 171, textureX, textureY); // Box 524
		bodyModel[201] = new ModelRendererTurbo(this, 423, 171, textureX, textureY); // Box 525
		bodyModel[202] = new ModelRendererTurbo(this, 423, 171, textureX, textureY); // Box 526
		bodyModel[203] = new ModelRendererTurbo(this, 419, 167, textureX, textureY); // Box 527
		bodyModel[204] = new ModelRendererTurbo(this, 414, 172, textureX, textureY); // Box 59
		bodyModel[205] = new ModelRendererTurbo(this, 423, 181, textureX, textureY); // Box 529
		bodyModel[206] = new ModelRendererTurbo(this, 423, 184, textureX, textureY); // Box 530
		bodyModel[207] = new ModelRendererTurbo(this, 409, 179, textureX, textureY); // Box 54
		bodyModel[208] = new ModelRendererTurbo(this, 362, 190, textureX, textureY, "cull"); // Box 54 cull
		bodyModel[209] = new ModelRendererTurbo(this, 357, 182, textureX, textureY); // Box 54
		bodyModel[210] = new ModelRendererTurbo(this, 398, 138, textureX, textureY); // Box 538
		bodyModel[211] = new ModelRendererTurbo(this, 383, 133, textureX, textureY); // Box 539
		bodyModel[212] = new ModelRendererTurbo(this, 386, 201, textureX, textureY); // Box 54
		bodyModel[213] = new ModelRendererTurbo(this, 384, 195, textureX, textureY); // Box 54
		bodyModel[214] = new ModelRendererTurbo(this, 386, 191, textureX, textureY); // Box 54
		bodyModel[215] = new ModelRendererTurbo(this, 395, 196, textureX, textureY); // Box 543
		bodyModel[216] = new ModelRendererTurbo(this, 396, 210, textureX, textureY); // Box 544
		bodyModel[217] = new ModelRendererTurbo(this, 409, 213, textureX, textureY); // Box 545
		bodyModel[218] = new ModelRendererTurbo(this, 2, 234, textureX, textureY); // Box 548
		bodyModel[219] = new ModelRendererTurbo(this, 9, 232, textureX, textureY); // Box 549
		bodyModel[220] = new ModelRendererTurbo(this, 2, 232, textureX, textureY); // Box 550
		bodyModel[221] = new ModelRendererTurbo(this, 2, 237, textureX, textureY); // Box 551
		bodyModel[222] = new ModelRendererTurbo(this, 2, 237, textureX, textureY); // Box 552
		bodyModel[223] = new ModelRendererTurbo(this, 2, 234, textureX, textureY); // Box 553
		bodyModel[224] = new ModelRendererTurbo(this, 2, 232, textureX, textureY); // Box 554
		bodyModel[225] = new ModelRendererTurbo(this, 9, 232, textureX, textureY); // Box 555
		bodyModel[226] = new ModelRendererTurbo(this, 9, 232, textureX, textureY); // Box 556
		bodyModel[227] = new ModelRendererTurbo(this, 2, 234, textureX, textureY); // Box 557
		bodyModel[228] = new ModelRendererTurbo(this, 2, 237, textureX, textureY); // Box 558
		bodyModel[229] = new ModelRendererTurbo(this, 2, 232, textureX, textureY); // Box 559
		bodyModel[230] = new ModelRendererTurbo(this, 9, 232, textureX, textureY); // Box 560
		bodyModel[231] = new ModelRendererTurbo(this, 2, 232, textureX, textureY); // Box 561
		bodyModel[232] = new ModelRendererTurbo(this, 2, 237, textureX, textureY); // Box 562
		bodyModel[233] = new ModelRendererTurbo(this, 2, 234, textureX, textureY); // Box 563
		bodyModel[234] = new ModelRendererTurbo(this, 340, 182, textureX, textureY); // Box 564
		bodyModel[235] = new ModelRendererTurbo(this, 357, 182, textureX, textureY); // Box 565
		bodyModel[236] = new ModelRendererTurbo(this, 383, 172, textureX, textureY); // Box 567
		bodyModel[237] = new ModelRendererTurbo(this, 297, 231, textureX, textureY); // Box 52 door swing right
		bodyModel[238] = new ModelRendererTurbo(this, 139, 231, textureX, textureY); // Box 314 door swing right
		bodyModel[239] = new ModelRendererTurbo(this, 423, 176, textureX, textureY); // Box 293
		bodyModel[240] = new ModelRendererTurbo(this, 241, 208, textureX, textureY, "lamp"); // Box 294 markerlight
		bodyModel[241] = new ModelRendererTurbo(this, 241, 208, textureX, textureY, "lamp"); // Box 294 markerlight
		bodyModel[242] = new ModelRendererTurbo(this, 234, 208, textureX, textureY, "lamp"); // Box 294 markerlight
		bodyModel[243] = new ModelRendererTurbo(this, 234, 208, textureX, textureY, "lamp"); // Box 294 markerlight
		bodyModel[244] = new ModelRendererTurbo(this, 151, 112, textureX, textureY); // Box 299
		bodyModel[245] = new ModelRendererTurbo(this, 119, 112, textureX, textureY); // Box 300
		bodyModel[246] = new ModelRendererTurbo(this, 127, 127, textureX, textureY); // Box 301
		bodyModel[247] = new ModelRendererTurbo(this, 152, 127, textureX, textureY); // Box 302
		bodyModel[248] = new ModelRendererTurbo(this, 118, 127, textureX, textureY); // Box 303
		bodyModel[249] = new ModelRendererTurbo(this, 127, 108, textureX, textureY); // Box 304
		bodyModel[250] = new ModelRendererTurbo(this, 118, 108, textureX, textureY); // Box 305
		bodyModel[251] = new ModelRendererTurbo(this, 152, 108, textureX, textureY); // Box 306
		bodyModel[252] = new ModelRendererTurbo(this, 75, 109, textureX, textureY); // Box 307
		bodyModel[253] = new ModelRendererTurbo(this, 44, 109, textureX, textureY); // Box 308
		bodyModel[254] = new ModelRendererTurbo(this, 96, 170, textureX, textureY); // Box 309
		bodyModel[255] = new ModelRendererTurbo(this, 96, 181, textureX, textureY); // Box 310
		bodyModel[256] = new ModelRendererTurbo(this, 96, 170, textureX, textureY); // Box 312
		bodyModel[257] = new ModelRendererTurbo(this, 96, 181, textureX, textureY); // Box 313
		bodyModel[258] = new ModelRendererTurbo(this, 96, 170, textureX, textureY); // Box 314
		bodyModel[259] = new ModelRendererTurbo(this, 96, 181, textureX, textureY); // Box 315
		bodyModel[260] = new ModelRendererTurbo(this, 36, 181, textureX, textureY); // Box 316
		bodyModel[261] = new ModelRendererTurbo(this, 36, 181, textureX, textureY); // Box 317
		bodyModel[262] = new ModelRendererTurbo(this, 36, 181, textureX, textureY); // Box 318
		bodyModel[263] = new ModelRendererTurbo(this, 75, 85, textureX, textureY); // Box 319
		bodyModel[264] = new ModelRendererTurbo(this, 44, 85, textureX, textureY); // Box 320
		bodyModel[265] = new ModelRendererTurbo(this, 3, 85, textureX, textureY); // Box 321
		bodyModel[266] = new ModelRendererTurbo(this, 127, 88, textureX, textureY); // Box 322
		bodyModel[267] = new ModelRendererTurbo(this, 150, 88, textureX, textureY); // Box 323
		bodyModel[268] = new ModelRendererTurbo(this, 151, 84, textureX, textureY); // Box 324
		bodyModel[269] = new ModelRendererTurbo(this, 126, 84, textureX, textureY); // Box 325
		bodyModel[270] = new ModelRendererTurbo(this, 117, 84, textureX, textureY); // Box 326
		bodyModel[271] = new ModelRendererTurbo(this, 118, 88, textureX, textureY); // Box 327
		bodyModel[272] = new ModelRendererTurbo(this, 152, 103, textureX, textureY); // Box 328
		bodyModel[273] = new ModelRendererTurbo(this, 127, 103, textureX, textureY); // Box 329
		bodyModel[274] = new ModelRendererTurbo(this, 118, 103, textureX, textureY); // Box 330
		bodyModel[275] = new ModelRendererTurbo(this, 409, 179, textureX, textureY); // Box 331
		bodyModel[276] = new ModelRendererTurbo(this, 365, 175, textureX, textureY); // Box 332
		bodyModel[277] = new ModelRendererTurbo(this, 365, 175, textureX, textureY); // Box 333
		bodyModel[278] = new ModelRendererTurbo(this, 423, 134, textureX, textureY); // Box 334
		bodyModel[279] = new ModelRendererTurbo(this, 363, 168, textureX, textureY); // Box 335
		bodyModel[280] = new ModelRendererTurbo(this, 251, 211, textureX, textureY); // Box 336

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[0].setRotationPoint(32.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 65, 2, 5, 0F); // Box 1
		bodyModel[1].setRotationPoint(-32.5F, 3F, -2.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[2].setRotationPoint(-35.5F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 1
		bodyModel[3].setRotationPoint(-19F, 5F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 65
		bodyModel[4].setRotationPoint(15F, 5F, -2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[5].setRotationPoint(-18.5F, 3F, -7.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[6].setRotationPoint(-18.5F, 3F, 2.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[7].setRotationPoint(15.5F, 3F, -7.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 195
		bodyModel[8].setRotationPoint(15.5F, 3F, 2.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 8
		bodyModel[9].setRotationPoint(-31F, 7F, 9F);

		bodyModel[10].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 8
		bodyModel[10].setRotationPoint(-31F, 3F, 7F);

		bodyModel[11].addBox(0F, 0F, 0F, 5, 3, 0, 0F); // Box 8
		bodyModel[11].setRotationPoint(-31F, 4F, 9F);

		bodyModel[12].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 8
		bodyModel[12].setRotationPoint(-31F, 4F, 7F);

		bodyModel[13].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 34
		bodyModel[13].setRotationPoint(-31F, 7F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 35
		bodyModel[14].setRotationPoint(-31F, 3F, -7F);

		bodyModel[15].addBox(0F, 0F, 0F, 5, 3, 0, 0F); // Box 36
		bodyModel[15].setRotationPoint(-31F, 4F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 37
		bodyModel[16].setRotationPoint(-31F, 4F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[17].setRotationPoint(-26F, 3F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 5, 3, 0, 0F); // Box 40
		bodyModel[18].setRotationPoint(26F, 4F, 9F);

		bodyModel[19].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 41
		bodyModel[19].setRotationPoint(26F, 4F, 7F);

		bodyModel[20].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 42
		bodyModel[20].setRotationPoint(26F, 7F, 9F);

		bodyModel[21].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 43
		bodyModel[21].setRotationPoint(26F, 3F, 7F);

		bodyModel[22].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 44
		bodyModel[22].setRotationPoint(26F, 7F, -11F);

		bodyModel[23].addBox(0F, 0F, 0F, 5, 3, 0, 0F); // Box 45
		bodyModel[23].setRotationPoint(26F, 4F, -9F);

		bodyModel[24].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 46
		bodyModel[24].setRotationPoint(26F, 4F, -9F);

		bodyModel[25].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 47
		bodyModel[25].setRotationPoint(26F, 3F, -7F);

		bodyModel[26].addBox(0F, 0F, 0F, 52, 2, 20, 0F); // Box 1
		bodyModel[26].setRotationPoint(-26F, 1F, -10F);

		bodyModel[27].addBox(0F, 0F, 0F, 5, 2, 14, 0F); // Box 1
		bodyModel[27].setRotationPoint(-31F, 1F, -7F);

		bodyModel[28].addBox(0F, 0F, 0F, 5, 2, 14, 0F); // Box 50
		bodyModel[28].setRotationPoint(26F, 1F, -7F);

		bodyModel[29].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 286
		bodyModel[29].setRotationPoint(2F, 6F, -2F);
		bodyModel[29].rotateAngleX = -0.78539816F;

		bodyModel[30].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F); // Box 287
		bodyModel[30].setRotationPoint(5F, 6F, -2F);
		bodyModel[30].rotateAngleX = -0.78539816F;

		bodyModel[31].addBox(-0.5F, 0F, -3F, 1, 0, 6, 0F); // Box 196
		bodyModel[31].setRotationPoint(-3F, 6.01F, 0F);
		bodyModel[31].rotateAngleY = -0.52359878F;

		bodyModel[32].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 197
		bodyModel[32].setRotationPoint(3F, 3.5F, -3F);

		bodyModel[33].addBox(0F, 0F, 0F, 8, 0, 1, 0F); // Box 198
		bodyModel[33].setRotationPoint(-4.5F, 6F, -2.5F);

		bodyModel[34].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[34].setRotationPoint(-3F, 6.01F, 0F);
		bodyModel[34].rotateAngleY = -0.52359878F;

		bodyModel[35].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 200
		bodyModel[35].setRotationPoint(11F, 6.01F, 0F);
		bodyModel[35].rotateAngleY = -0.26179939F;

		bodyModel[36].addBox(-0.5F, 0F, -2F, 1, 0, 4, 0F); // Box 201
		bodyModel[36].setRotationPoint(11F, 6.01F, 0F);
		bodyModel[36].rotateAngleY = -0.26179939F;

		bodyModel[37].addBox(-14.5F, 0F, 2F, 16, 0, 1, 0F); // Box 202
		bodyModel[37].setRotationPoint(-3F, 6.01F, -0.5F);
		bodyModel[37].rotateAngleY = 0.17453293F;
		bodyModel[37].rotateAngleZ = 0.08726646F;

		bodyModel[38].addBox(0F, 0F, 0F, 14, 0, 1, 0F); // Box 203
		bodyModel[38].setRotationPoint(-3F, 6F, 0F);

		bodyModel[39].addBox(-1F, 0F, -1.5F, 8, 0, 1, 0F); // Box 204
		bodyModel[39].setRotationPoint(11F, 6.01F, -0.5F);
		bodyModel[39].rotateAngleY = 0.17453293F;
		bodyModel[39].rotateAngleZ = -0.08726646F;

		bodyModel[40].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 62
		bodyModel[40].setRotationPoint(-7.5F, 3.5F, -10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[41].setRotationPoint(-6F, 3F, 7.1F);
		bodyModel[41].rotateAngleX = -0.78539816F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[42].setRotationPoint(-6.01F, 3F, 6.6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[43].setRotationPoint(0.00999999999999979F, 3F, 6.6F);

		bodyModel[44].addBox(0F, -4F, 0F, 0, 4, 3, 0F); // Box 66
		bodyModel[44].setRotationPoint(-7.5F, 6.5F, -9.5F);
		bodyModel[44].rotateAngleZ = 0.19198622F;

		bodyModel[45].addBox(0F, -4F, 0F, 0, 4, 3, 0F); // Box 67
		bodyModel[45].setRotationPoint(-0.5F, 6.5F, -9.5F);
		bodyModel[45].rotateAngleZ = -0.19198622F;

		bodyModel[46].addBox(0F, 0F, 0F, 19, 16, 1, 0F); // Box 322
		bodyModel[46].setRotationPoint(-26F, -15F, -10F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 16, 3, 0F); // Box 324
		bodyModel[47].setRotationPoint(-26F, -15F, -9F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 16, 9, 0F); // Box 325
		bodyModel[48].setRotationPoint(-26F, -15F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 64, 1, 9, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[49].setRotationPoint(-32F, -16F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 64, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[50].setRotationPoint(-32F, -16F, 1F);

		bodyModel[51].addBox(0F, 0F, 0F, 64, 1, 2, 0F); // Box 329
		bodyModel[51].setRotationPoint(-32F, -16F, -1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 330
		bodyModel[52].setRotationPoint(-32F, -15F, -10F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 331
		bodyModel[53].setRotationPoint(-26F, -15F, -6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[54].setRotationPoint(-32F, -15F, 1F);

		bodyModel[55].addBox(0F, -0.5F, 0F, 10, 2, 0, 0F); // Box 80
		bodyModel[55].setRotationPoint(-34.5F, 4F, 0.5F);
		bodyModel[55].rotateAngleY = 1.22173048F;

		bodyModel[56].addBox(-10F, -0.5F, 0F, 10, 2, 0, 0F); // Box 81
		bodyModel[56].setRotationPoint(34.5F, 4F, -0.5F);
		bodyModel[56].rotateAngleY = 1.22173048F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[57].setRotationPoint(30.51F, -6.5F, -7F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[58].setRotationPoint(30.5F, -5F, -5.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 16, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[59].setRotationPoint(32F, -15F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 87
		bodyModel[60].setRotationPoint(31.5F, -6F, -6.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // Box 346
		bodyModel[61].setRotationPoint(-5F, -12F, -12F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 350
		bodyModel[62].setRotationPoint(26F, -15F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[63].setRotationPoint(26F, -15F, 1F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 352
		bodyModel[64].setRotationPoint(-32F, 3F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 353
		bodyModel[65].setRotationPoint(-32F, 3F, 3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 354
		bodyModel[66].setRotationPoint(26F, 3F, 3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 355
		bodyModel[67].setRotationPoint(26F, 3F, -7F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 358
		bodyModel[68].setRotationPoint(31.5F, -2F, -5F);

		bodyModel[69].addBox(0F, 0F, 0F, 25, 1, 0, 0F); // Box 359
		bodyModel[69].setRotationPoint(7.5F, 3F, -5F);

		bodyModel[70].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 360
		bodyModel[70].setRotationPoint(4.5F, 2.5F, -6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 361
		bodyModel[71].setRotationPoint(22F, -17F, 1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 362
		bodyModel[72].setRotationPoint(27F, -17F, 1F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 363
		bodyModel[73].setRotationPoint(27F, -17F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 364
		bodyModel[74].setRotationPoint(22F, -17F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 365
		bodyModel[75].setRotationPoint(27F, -16F, -1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 366
		bodyModel[76].setRotationPoint(22F, -16F, -1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 367
		bodyModel[77].setRotationPoint(-28F, -16F, -1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 368
		bodyModel[78].setRotationPoint(-28F, -17F, -10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 369
		bodyModel[79].setRotationPoint(-28F, -17F, 1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 370
		bodyModel[80].setRotationPoint(-23F, -16F, -1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 371
		bodyModel[81].setRotationPoint(-23F, -17F, 1F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 372
		bodyModel[82].setRotationPoint(-23F, -17F, -10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 373
		bodyModel[83].setRotationPoint(-18F, -16F, -1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 374
		bodyModel[84].setRotationPoint(-18F, -17F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 375
		bodyModel[85].setRotationPoint(-18F, -17F, 1F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 376
		bodyModel[86].setRotationPoint(-13F, -16F, -1F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 377
		bodyModel[87].setRotationPoint(-13F, -17F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 378
		bodyModel[88].setRotationPoint(-13F, -17F, 1F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 379
		bodyModel[89].setRotationPoint(-8F, -16F, -1F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 380
		bodyModel[90].setRotationPoint(-8F, -17F, -10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 381
		bodyModel[91].setRotationPoint(-8F, -17F, 1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 382
		bodyModel[92].setRotationPoint(-3F, -16F, -1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 383
		bodyModel[93].setRotationPoint(-3F, -17F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 384
		bodyModel[94].setRotationPoint(-3F, -17F, 1F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 385
		bodyModel[95].setRotationPoint(2F, -16F, -1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 386
		bodyModel[96].setRotationPoint(2F, -17F, -10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 387
		bodyModel[97].setRotationPoint(2F, -17F, 1F);

		bodyModel[98].addBox(0F, 0F, 0F, 68, 0, 4, 0F); // Box 388
		bodyModel[98].setRotationPoint(-34F, -16.5F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 0, 18, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[99].setRotationPoint(-32F, -15F, -11F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 16, 9, 0F); // Box 391
		bodyModel[100].setRotationPoint(25F, -15F, -9F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 16, 3, 0F); // Box 392
		bodyModel[101].setRotationPoint(25F, -15F, 6F);

		bodyModel[102].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 397
		bodyModel[102].setRotationPoint(1.5F, 3.5F, -10F);

		bodyModel[103].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 398
		bodyModel[103].setRotationPoint(6.51F, 3F, -9F);

		bodyModel[104].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 399
		bodyModel[104].setRotationPoint(1.49F, 3F, -9F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288
		bodyModel[105].setRotationPoint(30.75F, -15F, -2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 rear light L
		bodyModel[106].setRotationPoint(31.5F, -14.95F, -2F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290 rear light R
		bodyModel[107].setRotationPoint(31.5F, -14.95F, 0F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 410
		bodyModel[108].setRotationPoint(-31.75F, -15F, -2F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 411 front light R
		bodyModel[109].setRotationPoint(-32F, -14.95F, -2F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 front light L
		bodyModel[110].setRotationPoint(-32F, -14.95F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[111].setRotationPoint(-1F, -17.5F, 2.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[112].setRotationPoint(-1F, -17.5F, 2.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[113].setRotationPoint(-1F, -17.5F, 2.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[114].setRotationPoint(-1F, -17.5F, 2.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[115].setRotationPoint(-1F, -17F, 2.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-1.1F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -1.1F, 0F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F); // Box 423
		bodyModel[116].setRotationPoint(-34F, -16.5F, -2F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-1.1F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -1.1F, 0F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F); // Box 424
		bodyModel[117].setRotationPoint(-34F, -16.5F, 2F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -0.6F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F); // Box 425
		bodyModel[118].setRotationPoint(32F, -16.5F, 2F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -0.6F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F); // Box 426
		bodyModel[119].setRotationPoint(32F, -16.5F, -2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 427
		bodyModel[120].setRotationPoint(-26F, 3F, -8F);

		bodyModel[121].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 428
		bodyModel[121].setRotationPoint(-26F, 3F, -9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 429
		bodyModel[122].setRotationPoint(-31F, 3F, -8F);

		bodyModel[123].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 430
		bodyModel[123].setRotationPoint(-31F, 3F, -9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[124].setRotationPoint(-31F, 3F, -11F);

		bodyModel[125].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 432
		bodyModel[125].setRotationPoint(-31F, 3F, 8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[126].setRotationPoint(-31F, 3F, 6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[127].setRotationPoint(-31F, 3F, 9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[128].setRotationPoint(-26F, 3F, 6F);

		bodyModel[129].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 436
		bodyModel[129].setRotationPoint(-26F, 3F, 8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyModel[130].setRotationPoint(-26F, 3F, 9F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 438
		bodyModel[131].setRotationPoint(-32F, 1F, -9F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 439
		bodyModel[132].setRotationPoint(31F, 1F, -9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[133].setRotationPoint(-1.5F, -17F, -4F);

		bodyModel[134].addBox(0F, 0F, 0F, 5, 2, 7, 0F); // Box 445 cull
		bodyModel[134].setRotationPoint(26F, -16.5F, 2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Import Box39
		bodyModel[135].setRotationPoint(29F, -18.5F, 5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		bodyModel[136].setRotationPoint(29F, -18.5F, 9F);

		bodyModel[137].addBox(0F, 0F, 0F, 5, 2, 7, 0F); // Box 449 cull
		bodyModel[137].setRotationPoint(-31F, -16.5F, -9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[138].setRotationPoint(-32F, -18.5F, -9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 451
		bodyModel[139].setRotationPoint(-32F, -18.5F, -5F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 17, 2, 0F); // Box 452
		bodyModel[140].setRotationPoint(-26.5F, -15F, -9.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 17, 2, 0F); // Box 453
		bodyModel[141].setRotationPoint(-26.5F, -15F, 7.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 17, 2, 0F); // Box 454
		bodyModel[142].setRotationPoint(25.5F, -15F, 7.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 17, 2, 0F); // Box 455
		bodyModel[143].setRotationPoint(25.5F, -15F, -9.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[144].setRotationPoint(-31.5F, -7F, -10F);
		bodyModel[144].rotateAngleY = -3.14159265F;

		bodyModel[145].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[145].setRotationPoint(-31.5F, -7F, 11F);
		bodyModel[145].rotateAngleY = -3.14159265F;

		bodyModel[146].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[146].setRotationPoint(-31.5F, -1F, 10F);

		bodyModel[147].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[147].setRotationPoint(-31.5F, -1F, -11F);

		bodyModel[148].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 460
		bodyModel[148].setRotationPoint(-31.5F, -7F, -8F);

		bodyModel[149].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 461
		bodyModel[149].setRotationPoint(-31.5F, -7F, 7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 462
		bodyModel[150].setRotationPoint(-31.5F, 6F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 463
		bodyModel[151].setRotationPoint(-31.5F, 6F, 10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 464
		bodyModel[152].setRotationPoint(31.5F, 6F, 10F);

		bodyModel[153].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 465
		bodyModel[153].setRotationPoint(31.5F, -1F, 10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[154].setRotationPoint(31.5F, -7F, 11F);
		bodyModel[154].rotateAngleY = -3.14159265F;

		bodyModel[155].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 467
		bodyModel[155].setRotationPoint(31.5F, -7F, 7F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 468
		bodyModel[156].setRotationPoint(31.5F, 6F, -11F);

		bodyModel[157].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 469
		bodyModel[157].setRotationPoint(31.5F, -1F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[158].setRotationPoint(31.5F, -7F, -10F);
		bodyModel[158].rotateAngleY = -3.14159265F;

		bodyModel[159].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 471
		bodyModel[159].setRotationPoint(31.5F, -7F, -8F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[160].setRotationPoint(31F, 3F, 9F);

		bodyModel[161].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 473
		bodyModel[161].setRotationPoint(31F, 3F, 8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[162].setRotationPoint(31F, 3F, 6F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		bodyModel[163].setRotationPoint(26F, 3F, 9F);

		bodyModel[164].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 476
		bodyModel[164].setRotationPoint(26F, 3F, 8F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		bodyModel[165].setRotationPoint(26F, 3F, 6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		bodyModel[166].setRotationPoint(26F, 3F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 479
		bodyModel[167].setRotationPoint(26F, 3F, -8F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 480
		bodyModel[168].setRotationPoint(26F, 3F, -9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 481
		bodyModel[169].setRotationPoint(31F, 3F, -8F);

		bodyModel[170].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 482
		bodyModel[170].setRotationPoint(31F, 3F, -9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[171].setRotationPoint(31F, 3F, -11F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 484
		bodyModel[172].setRotationPoint(-32.5F, -6F, 3.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 485
		bodyModel[173].setRotationPoint(-31.5F, -5F, 4.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 486
		bodyModel[174].setRotationPoint(-30.51F, -6.5F, 3F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 487
		bodyModel[175].setRotationPoint(-32.5F, -2F, 5F);

		bodyModel[176].addBox(0F, 0F, 0F, 25, 1, 0, 0F); // Box 488
		bodyModel[176].setRotationPoint(-32.5F, 3F, 5F);

		bodyModel[177].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 489
		bodyModel[177].setRotationPoint(-7.5F, 2.5F, 4F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 50, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 490
		bodyModel[178].setRotationPoint(-25F, -15F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 50, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[179].setRotationPoint(-25F, -15F, 1F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 494
		bodyModel[180].setRotationPoint(25F, -15F, 0F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 496
		bodyModel[181].setRotationPoint(19F, -15F, 3F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[182].setRotationPoint(22F, -5F, -8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[183].setRotationPoint(19F, -2F, -7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[184].setRotationPoint(18F, -6F, -7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[185].setRotationPoint(19F, -1F, -6F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[186].setRotationPoint(-25F, -5F, 3F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[187].setRotationPoint(-22F, -2F, 4F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[188].setRotationPoint(-19F, -6F, 4F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[189].setRotationPoint(-21F, -1F, 5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[190].setRotationPoint(-0.5F, -2F, 7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[191].setRotationPoint(3.5F, -6F, 7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[192].setRotationPoint(1F, -1F, 8F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[193].setRotationPoint(-3F, -1F, -10F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		bodyModel[194].setRotationPoint(-3.5F, -2F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[195].setRotationPoint(-4.5F, -6F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[196].setRotationPoint(1.5F, -4F, -11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[197].setRotationPoint(-4.5F, -4F, 5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 5, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[198].setRotationPoint(9F, -6F, -9F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Import Box40
		bodyModel[199].setRotationPoint(11F, -13F, -8.5F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 524
		bodyModel[200].setRotationPoint(13F, -21F, -4.5F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 525
		bodyModel[201].setRotationPoint(13F, -23F, -6F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 526
		bodyModel[202].setRotationPoint(13F, -23F, -3F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 527
		bodyModel[203].setRotationPoint(13F, -22F, -5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 0, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 59
		bodyModel[204].setRotationPoint(13F, -21F, -4.5F);
		bodyModel[204].rotateAngleZ = -0.9424778F;

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 529
		bodyModel[205].setRotationPoint(11F, -14F, -4.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[206].setRotationPoint(11F, -14F, -7.5F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 54
		bodyModel[207].setRotationPoint(2.5F, -3F, -5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 54 cull
		bodyModel[208].setRotationPoint(-19F, -1F, -4F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[209].setRotationPoint(-19F, -2F, -9F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 11, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[210].setRotationPoint(8F, -15F, 3F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[211].setRotationPoint(7F, -15F, 3F);

		bodyModel[212].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 54
		bodyModel[212].setRotationPoint(16.5F, -2F, 5.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 54
		bodyModel[213].setRotationPoint(14.5F, -3F, 5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 54
		bodyModel[214].setRotationPoint(15.5F, -3.5F, 5.5F);

		bodyModel[215].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 543
		bodyModel[215].setRotationPoint(8F, -5F, 4.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[216].setRotationPoint(0F, 4F, 6F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 545
		bodyModel[217].setRotationPoint(5F, 3F, 6F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 548
		bodyModel[218].setRotationPoint(25F, -7F, 10.01F);

		bodyModel[219].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 549
		bodyModel[219].setRotationPoint(18F, 0F, 10.01F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F); // Box 550
		bodyModel[220].setRotationPoint(20F, 0F, 10.01F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.5F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1.5F, 0.5F, 0F); // Box 551
		bodyModel[221].setRotationPoint(25F, -5F, 10.01F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, -2F, 1F, 0F); // Box 552
		bodyModel[222].setRotationPoint(-26F, -5F, 10.01F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 553
		bodyModel[223].setRotationPoint(-26F, -7F, 10.01F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F); // Box 554
		bodyModel[224].setRotationPoint(-23F, 0F, 10.01F);

		bodyModel[225].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 555
		bodyModel[225].setRotationPoint(-20F, 0F, 10.01F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 556
		bodyModel[226].setRotationPoint(-20F, 0F, -10.01F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 557
		bodyModel[227].setRotationPoint(-26F, -7F, -10.01F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, -2F, 1F, 0F); // Box 558
		bodyModel[228].setRotationPoint(-26F, -5F, -10.01F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F); // Box 559
		bodyModel[229].setRotationPoint(-23F, 0F, -10.01F);

		bodyModel[230].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 560
		bodyModel[230].setRotationPoint(18F, 0F, -10.01F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[231].setRotationPoint(20F, 0F, -10.01F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.5F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1.5F, 0.5F, 0F); // Box 562
		bodyModel[232].setRotationPoint(25F, -5F, -10.01F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 563
		bodyModel[233].setRotationPoint(25F, -7F, -10.01F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 5, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[234].setRotationPoint(-24.5F, -8F, -9F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[235].setRotationPoint(-19F, -9F, -9F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[236].setRotationPoint(-7F, -5F, 7F);
		bodyModel[236].rotateAngleY = 1.57079633F;

		bodyModel[237].addShapeBox(-0.5F, 0F, -0.5F, 1, 14, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 52 door swing right
		bodyModel[237].setRotationPoint(-25.5F, -13F, -5.5F);

		bodyModel[238].addShapeBox(-0.5F, 0F, -5.5F, 1, 14, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 314 door swing right
		bodyModel[238].setRotationPoint(25.5F, -13F, 5.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[239].setRotationPoint(13F, -23F, -4.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 markerlight
		bodyModel[240].setRotationPoint(26.25F, -13.7F, 9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 1F, -0.25F, -0.25F); // Box 294 markerlight
		bodyModel[241].setRotationPoint(26.25F, -13.7F, -11F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 294 markerlight
		bodyModel[242].setRotationPoint(-27.25F, -13.7F, 9F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 294 markerlight
		bodyModel[243].setRotationPoint(-27.25F, -13.7F, -11F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 13, 1, 0F,0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 0F); // Box 299
		bodyModel[244].setRotationPoint(5F, -12F, -12F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 13, 1, 0F,-1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F); // Box 300
		bodyModel[245].setRotationPoint(-8F, -12F, -12F);

		bodyModel[246].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 301
		bodyModel[246].setRotationPoint(-5F, 1F, -12F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[247].setRotationPoint(5F, 1F, -12F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[248].setRotationPoint(-7F, 1F, -12F);

		bodyModel[249].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 304
		bodyModel[249].setRotationPoint(-5F, -13F, -12F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[250].setRotationPoint(-7F, -13F, -12F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[251].setRotationPoint(5F, -13F, -12F);

		bodyModel[252].addBox(0F, 0F, 0F, 19, 16, 1, 0F); // Box 307
		bodyModel[252].setRotationPoint(7F, -15F, -10F);

		bodyModel[253].addBox(0F, 0F, 0F, 14, 3, 1, 0F); // Box 308
		bodyModel[253].setRotationPoint(-7F, -15F, -10F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 309
		bodyModel[254].setRotationPoint(17F, -17F, 1F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 310
		bodyModel[255].setRotationPoint(17F, -17F, -10F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 312
		bodyModel[256].setRotationPoint(12F, -17F, 1F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 313
		bodyModel[257].setRotationPoint(12F, -17F, -10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 314
		bodyModel[258].setRotationPoint(7F, -17F, 1F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 315
		bodyModel[259].setRotationPoint(7F, -17F, -10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 316
		bodyModel[260].setRotationPoint(7F, -16F, -1F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 317
		bodyModel[261].setRotationPoint(12F, -16F, -1F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F); // Box 318
		bodyModel[262].setRotationPoint(17F, -16F, -1F);

		bodyModel[263].addBox(0F, 0F, 0F, 19, 16, 1, 0F); // Box 319
		bodyModel[263].setRotationPoint(-26F, -15F, 9F);

		bodyModel[264].addBox(0F, 0F, 0F, 14, 3, 1, 0F); // Box 320
		bodyModel[264].setRotationPoint(-7F, -15F, 9F);

		bodyModel[265].addBox(0F, 0F, 0F, 19, 16, 1, 0F); // Box 321
		bodyModel[265].setRotationPoint(7F, -15F, 9F);

		bodyModel[266].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // Box 322
		bodyModel[266].setRotationPoint(-5F, -12F, 11F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 3, 13, 1, 0F,-1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F); // Box 323
		bodyModel[267].setRotationPoint(-8F, -12F, 11F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 324
		bodyModel[268].setRotationPoint(-7F, -13F, 10F);

		bodyModel[269].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 325
		bodyModel[269].setRotationPoint(-5F, -13F, 10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 326
		bodyModel[270].setRotationPoint(5F, -13F, 10F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 13, 1, 0F,0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, -2F, 0F, 0F, 0F); // Box 327
		bodyModel[271].setRotationPoint(5F, -12F, 11F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 328
		bodyModel[272].setRotationPoint(-7F, 1F, 10F);

		bodyModel[273].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 329
		bodyModel[273].setRotationPoint(-5F, 1F, 10F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 330
		bodyModel[274].setRotationPoint(5F, 1F, 10F);

		bodyModel[275].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 331
		bodyModel[275].setRotationPoint(-3.5F, -3F, 5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[276].setRotationPoint(-19F, -3F, -8.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[277].setRotationPoint(-19F, -10F, -8.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[278].setRotationPoint(19F, -15F, 4F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 9, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[279].setRotationPoint(-19F, -8F, -3F);

		bodyModel[280].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 336
		bodyModel[280].setRotationPoint(-1.5F, -16F, -5F);
	}
	ModelCabooseTruck2 theTrucks2 = new ModelCabooseTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 14|| GetColor(entity) == 15 ||GetColor(entity) == 7){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/swing-motion_caboose_Truck_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.055, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/swing-motion_caboose_Truck_Silver_generator.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(1.06, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/swing-motion_caboose_Truck.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.055, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/swing-motion_caboose_Truck_left-generator.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(1.06, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}