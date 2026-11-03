//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: sd70m
// Model Creator: bidahochi
// Created on: 15.02.2025 - 14:06:03
// Last changed on: 15.02.2025 - 14:06:03

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelAlcoPATruck_new;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.library.Info;

public class ModelDRX642000 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelDRX642000() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[895];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 144, 134, textureX, textureY); // Box 120
		bodyModel[1] = new ModelRendererTurbo(this, 144, 85, textureX, textureY); // Box 481
		bodyModel[2] = new ModelRendererTurbo(this, 100, 153, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 108, 136, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 138, 169, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 107, 167, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 84, 180, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 129, 134, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 138, 165, textureX, textureY); // Box 495
		bodyModel[9] = new ModelRendererTurbo(this, 107, 161, textureX, textureY); // Box 496
		bodyModel[10] = new ModelRendererTurbo(this, 129, 142, textureX, textureY); // Box 497
		bodyModel[11] = new ModelRendererTurbo(this, 117, 180, textureX, textureY); // Box 114
		bodyModel[12] = new ModelRendererTurbo(this, 117, 177, textureX, textureY); // Box 74
		bodyModel[13] = new ModelRendererTurbo(this, 117, 183, textureX, textureY); // Box 78
		bodyModel[14] = new ModelRendererTurbo(this, 88, 179, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 115, 179, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 127, 120, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 143, 126, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 127, 71, textureX, textureY); // Box 60
		bodyModel[19] = new ModelRendererTurbo(this, 143, 77, textureX, textureY); // Box 61
		bodyModel[20] = new ModelRendererTurbo(this, 120, 111, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 120, 62, textureX, textureY); // Box 105
		bodyModel[22] = new ModelRendererTurbo(this, 154, 114, textureX, textureY); // Box 79
		bodyModel[23] = new ModelRendererTurbo(this, 140, 114, textureX, textureY); // Box 80
		bodyModel[24] = new ModelRendererTurbo(this, 154, 65, textureX, textureY); // Box 108
		bodyModel[25] = new ModelRendererTurbo(this, 140, 65, textureX, textureY); // Box 109
		bodyModel[26] = new ModelRendererTurbo(this, 135, 114, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 143, 114, textureX, textureY); // Front side door L
		bodyModel[28] = new ModelRendererTurbo(this, 143, 65, textureX, textureY); // Front side door R
		bodyModel[29] = new ModelRendererTurbo(this, 302, 21, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 364, 24, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 369, 19, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 364, 6, textureX, textureY); // Box 146
		bodyModel[33] = new ModelRendererTurbo(this, 364, 1, textureX, textureY); // Box 147
		bodyModel[34] = new ModelRendererTurbo(this, 135, 65, textureX, textureY); // Box 252
		bodyModel[35] = new ModelRendererTurbo(this, 329, 6, textureX, textureY); // Box 389
		bodyModel[36] = new ModelRendererTurbo(this, 331, 1, textureX, textureY); // Box 389
		bodyModel[37] = new ModelRendererTurbo(this, 324, 3, textureX, textureY,"speedo_front"); // Box 197
		bodyModel[38] = new ModelRendererTurbo(this, 337, 15, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 345, 6, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 342, 2, textureX, textureY); // Box 389
		bodyModel[41] = new ModelRendererTurbo(this, 41, 159, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 63, 133, textureX, textureY); // Box 565
		bodyModel[43] = new ModelRendererTurbo(this, 342, 15, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 119, 85, textureX, textureY,"cull"); // Box 120 cull
		bodyModel[45] = new ModelRendererTurbo(this, 153, 87, textureX, textureY,"cull"); // Box 120 cull
		bodyModel[46] = new ModelRendererTurbo(this, 126, 114, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[47] = new ModelRendererTurbo(this, 126, 65, textureX, textureY,"cull"); // Box 346 cull
		bodyModel[48] = new ModelRendererTurbo(this, 121, 114, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[49] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 348
		bodyModel[50] = new ModelRendererTurbo(this, 14, 40, textureX, textureY); // Box 0
		bodyModel[51] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 0
		bodyModel[52] = new ModelRendererTurbo(this, 17, 32, textureX, textureY); // Box 88
		bodyModel[53] = new ModelRendererTurbo(this, 21, 57, textureX, textureY); // Box 0
		bodyModel[54] = new ModelRendererTurbo(this, 21, 28, textureX, textureY); // Box 336
		bodyModel[55] = new ModelRendererTurbo(this, 22, 25, textureX, textureY); // Box 355
		bodyModel[56] = new ModelRendererTurbo(this, 41, 53, textureX, textureY); // Box 0
		bodyModel[57] = new ModelRendererTurbo(this, 43, 68, textureX, textureY); // Box 0
		bodyModel[58] = new ModelRendererTurbo(this, 41, 31, textureX, textureY); // Box 361
		bodyModel[59] = new ModelRendererTurbo(this, 43, 21, textureX, textureY); // Box 362
		bodyModel[60] = new ModelRendererTurbo(this, 43, 71, textureX, textureY); // Box 0
		bodyModel[61] = new ModelRendererTurbo(this, 43, 18, textureX, textureY); // Box 364
		bodyModel[62] = new ModelRendererTurbo(this, 58, 36, textureX, textureY); // Box 363
		bodyModel[63] = new ModelRendererTurbo(this, 56, 40, textureX, textureY); // Box 364
		bodyModel[64] = new ModelRendererTurbo(this, 56, 30, textureX, textureY); // Box 364
		bodyModel[65] = new ModelRendererTurbo(this, 56, 56, textureX, textureY); // Box 384
		bodyModel[66] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 0
		bodyModel[67] = new ModelRendererTurbo(this, 294, 49, textureX, textureY); // Box 0
		bodyModel[68] = new ModelRendererTurbo(this, 295, 26, textureX, textureY); // Box 396
		bodyModel[69] = new ModelRendererTurbo(this, 251, 33, textureX, textureY); // Box 0
		bodyModel[70] = new ModelRendererTurbo(this, 23, 77, textureX, textureY); // Box 207
		bodyModel[71] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 529
		bodyModel[72] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 208
		bodyModel[73] = new ModelRendererTurbo(this, 1, 35, textureX, textureY); // Box 209
		bodyModel[74] = new ModelRendererTurbo(this, 3, 32, textureX, textureY); // Box 208
		bodyModel[75] = new ModelRendererTurbo(this, 3, 29, textureX, textureY); // Box 194
		bodyModel[76] = new ModelRendererTurbo(this, 6, 74, textureX, textureY); // Box 209
		bodyModel[77] = new ModelRendererTurbo(this, 115, 62, textureX, textureY); // Box 105
		bodyModel[78] = new ModelRendererTurbo(this, 116, 69, textureX, textureY); // Box 105
		bodyModel[79] = new ModelRendererTurbo(this, 22, 61, textureX, textureY); // Box 420
		bodyModel[80] = new ModelRendererTurbo(this, 115, 111, textureX, textureY); // Box 423
		bodyModel[81] = new ModelRendererTurbo(this, 4, 66, textureX, textureY); // Box 429
		bodyModel[82] = new ModelRendererTurbo(this, 34, 77, textureX, textureY); // Box 430
		bodyModel[83] = new ModelRendererTurbo(this, 45, 74, textureX, textureY); // Box 431
		bodyModel[84] = new ModelRendererTurbo(this, 109, 113, textureX, textureY); // Box 0
		bodyModel[85] = new ModelRendererTurbo(this, 109, 64, textureX, textureY); // Box 0
		bodyModel[86] = new ModelRendererTurbo(this, 14, 16, textureX, textureY); // Box 88
		bodyModel[87] = new ModelRendererTurbo(this, 10, 13, textureX, textureY); // Box 88
		bodyModel[88] = new ModelRendererTurbo(this, 10, 10, textureX, textureY); // Box 88
		bodyModel[89] = new ModelRendererTurbo(this, 10, 7, textureX, textureY); // Box 88
		bodyModel[90] = new ModelRendererTurbo(this, 108, 143, textureX, textureY); // Box 0
		bodyModel[91] = new ModelRendererTurbo(this, 32, 113, textureX, textureY); // Box 103
		bodyModel[92] = new ModelRendererTurbo(this, 31, 109, textureX, textureY); // Box 103
		bodyModel[93] = new ModelRendererTurbo(this, 52, 109, textureX, textureY); // Box 103
		bodyModel[94] = new ModelRendererTurbo(this, 53, 113, textureX, textureY); // Box 103
		bodyModel[95] = new ModelRendererTurbo(this, 32, 117, textureX, textureY); // Box 103
		bodyModel[96] = new ModelRendererTurbo(this, 53, 117, textureX, textureY); // Box 103
		bodyModel[97] = new ModelRendererTurbo(this, 31, 121, textureX, textureY); // Box 103
		bodyModel[98] = new ModelRendererTurbo(this, 52, 121, textureX, textureY); // Box 103
		bodyModel[99] = new ModelRendererTurbo(this, 50, 129, textureX, textureY,"headlight2beamUA1"); // Box 186 headlight front 2beam top A
		bodyModel[100] = new ModelRendererTurbo(this, 50, 135, textureX, textureY,"headlight2beamUA2"); // Box 187 headlight front 2beam top A
		bodyModel[101] = new ModelRendererTurbo(this, 41, 134, textureX, textureY,"big_headlight_top"); // Box 169 headlight front big top
		bodyModel[102] = new ModelRendererTurbo(this, 34, 129, textureX, textureY,"headlight2beamUB1"); // Box 186 headlight front 2beam top B
		bodyModel[103] = new ModelRendererTurbo(this, 34, 135, textureX, textureY,"headlight2beamUB2"); // Box 187 headlight front 2beam top B
		bodyModel[104] = new ModelRendererTurbo(this, 1, 163, textureX, textureY); // Box 0
		bodyModel[105] = new ModelRendererTurbo(this, 10, 163, textureX, textureY); // Box 0
		bodyModel[106] = new ModelRendererTurbo(this, 28, 158, textureX, textureY); // Box 0
		bodyModel[107] = new ModelRendererTurbo(this, 19, 159, textureX, textureY); // Box 496
		bodyModel[108] = new ModelRendererTurbo(this, 63, 138, textureX, textureY); // Box 565
		bodyModel[109] = new ModelRendererTurbo(this, 72, 138, textureX, textureY); // Box 506
		bodyModel[110] = new ModelRendererTurbo(this, 21, 166, textureX, textureY); // Box 496
		bodyModel[111] = new ModelRendererTurbo(this, 83, 163, textureX, textureY); // Box 445
		bodyModel[112] = new ModelRendererTurbo(this, 74, 163, textureX, textureY); // Box 446
		bodyModel[113] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Box 447
		bodyModel[114] = new ModelRendererTurbo(this, 65, 159, textureX, textureY); // Box 448
		bodyModel[115] = new ModelRendererTurbo(this, 65, 166, textureX, textureY); // Box 449
		bodyModel[116] = new ModelRendererTurbo(this, 260, 31, textureX, textureY); // Box 208
		bodyModel[117] = new ModelRendererTurbo(this, 274, 31, textureX, textureY); // Box 413
		bodyModel[118] = new ModelRendererTurbo(this, 250, 30, textureX, textureY); // Box 209
		bodyModel[119] = new ModelRendererTurbo(this, 278, 30, textureX, textureY); // Box 413
		bodyModel[120] = new ModelRendererTurbo(this, 274, 39, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 248, 39, textureX, textureY); // Box 416
		bodyModel[122] = new ModelRendererTurbo(this, 1, 84, textureX, textureY); // Box 529
		bodyModel[123] = new ModelRendererTurbo(this, 113, 123, textureX, textureY); // Box 429
		bodyModel[124] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 430
		bodyModel[125] = new ModelRendererTurbo(this, 116, 118, textureX, textureY); // Box 431
		bodyModel[126] = new ModelRendererTurbo(this, 62, 76, textureX, textureY); // Box 434
		bodyModel[127] = new ModelRendererTurbo(this, 62, 84, textureX, textureY); // Box 436
		bodyModel[128] = new ModelRendererTurbo(this, 112, 65, textureX, textureY); // Box 105
		bodyModel[129] = new ModelRendererTurbo(this, 112, 114, textureX, textureY); // Box 438
		bodyModel[130] = new ModelRendererTurbo(this, 331, 11, textureX, textureY); // Box 389
		bodyModel[131] = new ModelRendererTurbo(this, 343, 11, textureX, textureY); // Box 0
		bodyModel[132] = new ModelRendererTurbo(this, 336, 10, textureX, textureY); // Box 0
		bodyModel[133] = new ModelRendererTurbo(this, 40, 144, textureX, textureY); // Box 0
		bodyModel[134] = new ModelRendererTurbo(this, 27, 142, textureX, textureY); // Box 497
		bodyModel[135] = new ModelRendererTurbo(this, 51, 142, textureX, textureY); // Box 463
		bodyModel[136] = new ModelRendererTurbo(this, 38, 114, textureX, textureY); // Box 167
		bodyModel[137] = new ModelRendererTurbo(this, 45, 114, textureX, textureY); // Box 166
		bodyModel[138] = new ModelRendererTurbo(this, 45, 109, textureX, textureY); // Box 165
		bodyModel[139] = new ModelRendererTurbo(this, 38, 109, textureX, textureY); // Box 164
		bodyModel[140] = new ModelRendererTurbo(this, 51, 141, textureX, textureY); // Box 0
		bodyModel[141] = new ModelRendererTurbo(this, 46, 141, textureX, textureY); // Box 0
		bodyModel[142] = new ModelRendererTurbo(this, 36, 141, textureX, textureY); // Box 430
		bodyModel[143] = new ModelRendererTurbo(this, 41, 141, textureX, textureY); // Box 431
		bodyModel[144] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 430
		bodyModel[145] = new ModelRendererTurbo(this, 60, 113, textureX, textureY); // Box 433
		bodyModel[146] = new ModelRendererTurbo(this, 4, 117, textureX, textureY); // Box 497
		bodyModel[147] = new ModelRendererTurbo(this, 113, 74, textureX, textureY); // Box 435
		bodyModel[148] = new ModelRendererTurbo(this, 118, 74, textureX, textureY); // Box 436
		bodyModel[149] = new ModelRendererTurbo(this, 9, 146, textureX, textureY); // Box 437
		bodyModel[150] = new ModelRendererTurbo(this, 18, 146, textureX, textureY); // Box 438
		bodyModel[151] = new ModelRendererTurbo(this, 25, 109, textureX, textureY); // Box 430
		bodyModel[152] = new ModelRendererTurbo(this, 30, 88, textureX, textureY); // Box 208
		bodyModel[153] = new ModelRendererTurbo(this, 5, 106, textureX, textureY); // Box 438
		bodyModel[154] = new ModelRendererTurbo(this, 73, 117, textureX, textureY); // Box 445
		bodyModel[155] = new ModelRendererTurbo(this, 12, 113, textureX, textureY); // Box 497
		bodyModel[156] = new ModelRendererTurbo(this, 57, 26, textureX, textureY); // Box 457
		bodyModel[157] = new ModelRendererTurbo(this, 57, 18, textureX, textureY); // Box 458
		bodyModel[158] = new ModelRendererTurbo(this, 58, 23, textureX, textureY); // Box 459
		bodyModel[159] = new ModelRendererTurbo(this, 15, 99, textureX, textureY); // Box 209
		bodyModel[160] = new ModelRendererTurbo(this, 14, 99, textureX, textureY); // Box 209
		bodyModel[161] = new ModelRendererTurbo(this, 69, 99, textureX, textureY); // Box 468
		bodyModel[162] = new ModelRendererTurbo(this, 14, 107, textureX, textureY); // Box 209
		bodyModel[163] = new ModelRendererTurbo(this, 8, 102, textureX, textureY); // Box 209
		bodyModel[164] = new ModelRendererTurbo(this, 6, 111, textureX, textureY); // Box 209
		bodyModel[165] = new ModelRendererTurbo(this, 65, 107, textureX, textureY); // Box 472
		bodyModel[166] = new ModelRendererTurbo(this, 39, 100, textureX, textureY); // Box 430
		bodyModel[167] = new ModelRendererTurbo(this, 38, 96, textureX, textureY); // Box 430
		bodyModel[168] = new ModelRendererTurbo(this, 60, 109, textureX, textureY); // Box 459
		bodyModel[169] = new ModelRendererTurbo(this, 46, 100, textureX, textureY); // Box 460
		bodyModel[170] = new ModelRendererTurbo(this, 30, 92, textureX, textureY); // Box 208
		bodyModel[171] = new ModelRendererTurbo(this, 45, 96, textureX, textureY); // Box 465
		bodyModel[172] = new ModelRendererTurbo(this, 45, 88, textureX, textureY); // Box 466
		bodyModel[173] = new ModelRendererTurbo(this, 45, 92, textureX, textureY); // Box 467
		bodyModel[174] = new ModelRendererTurbo(this, 27, 101, textureX, textureY); // Box 209
		bodyModel[175] = new ModelRendererTurbo(this, 58, 99, textureX, textureY); // Box 470
		bodyModel[176] = new ModelRendererTurbo(this, 47, 101, textureX, textureY); // Box 471
		bodyModel[177] = new ModelRendererTurbo(this, 6, 88, textureX, textureY); // Box 209
		bodyModel[178] = new ModelRendererTurbo(this, 18, 90, textureX, textureY); // Box 209
		bodyModel[179] = new ModelRendererTurbo(this, 65, 88, textureX, textureY); // Box 480
		bodyModel[180] = new ModelRendererTurbo(this, 53, 90, textureX, textureY); // Box 481
		bodyModel[181] = new ModelRendererTurbo(this, 37, 119, textureX, textureY); // Box 403
		bodyModel[182] = new ModelRendererTurbo(this, 40, 119, textureX, textureY); // Box 403
		bodyModel[183] = new ModelRendererTurbo(this, 38, 123, textureX, textureY); // Box 406
		bodyModel[184] = new ModelRendererTurbo(this, 40, 125, textureX, textureY); // Box 406
		bodyModel[185] = new ModelRendererTurbo(this, 50, 119, textureX, textureY); // Box 489
		bodyModel[186] = new ModelRendererTurbo(this, 45, 119, textureX, textureY); // Box 490
		bodyModel[187] = new ModelRendererTurbo(this, 49, 123, textureX, textureY); // Box 491
		bodyModel[188] = new ModelRendererTurbo(this, 45, 125, textureX, textureY); // Box 492
		bodyModel[189] = new ModelRendererTurbo(this, 42, 129, textureX, textureY,"small_headlight_top"); // Box 186 headlight front small top
		bodyModel[190] = new ModelRendererTurbo(this, 29, 139, textureX, textureY); // Box 0
		bodyModel[191] = new ModelRendererTurbo(this, 59, 139, textureX, textureY); // Box 539
		bodyModel[192] = new ModelRendererTurbo(this, 1, 136, textureX, textureY,"markerlight_353_3"); // Markerlight R type 3 FRONT
		bodyModel[193] = new ModelRendererTurbo(this, 6, 136, textureX, textureY); // Box 216
		bodyModel[194] = new ModelRendererTurbo(this, 24, 136, textureX, textureY,"markerlight_545_3"); // Markerlight L type 3 FRONT
		bodyModel[195] = new ModelRendererTurbo(this, 16, 140, textureX, textureY,"numberboard_L_type_3"); // Numberboard L type 3 FRONT
		bodyModel[196] = new ModelRendererTurbo(this, 7, 140, textureX, textureY,"numberboard_R_type_3"); // Numberboard R type 3 FRONT
		bodyModel[197] = new ModelRendererTurbo(this, 73, 146, textureX, textureY); // Box 517
		bodyModel[198] = new ModelRendererTurbo(this, 64, 146, textureX, textureY); // Box 518
		bodyModel[199] = new ModelRendererTurbo(this, 15, 136, textureX, textureY); // Box 519
		bodyModel[200] = new ModelRendererTurbo(this, 23, 126, textureX, textureY); // Box 525
		bodyModel[201] = new ModelRendererTurbo(this, 10, 125, textureX, textureY,"numberboard_R_type_2"); // Numberboard R type 2 FRONT
		bodyModel[202] = new ModelRendererTurbo(this, 57, 126, textureX, textureY); // Box 524
		bodyModel[203] = new ModelRendererTurbo(this, 68, 125, textureX, textureY,"numberboard_L_type_2"); // Numberboard L Type 2 FRONT
		bodyModel[204] = new ModelRendererTurbo(this, 25, 133, textureX, textureY,"markerlight_353_2"); // Box 353 markerlight type 3 FRONT
		bodyModel[205] = new ModelRendererTurbo(this, 61, 133, textureX, textureY,"markerlight_545_2"); // Box 545 markerlight type 3 FRONT
		bodyModel[206] = new ModelRendererTurbo(this, 72, 133, textureX, textureY); // Box 574
		bodyModel[207] = new ModelRendererTurbo(this, 2, 90, textureX, textureY); // Box 60
		bodyModel[208] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 437
		bodyModel[209] = new ModelRendererTurbo(this, 72, 106, textureX, textureY); // Box 554
		bodyModel[210] = new ModelRendererTurbo(this, 61, 113, textureX, textureY); // Box 555
		bodyModel[211] = new ModelRendererTurbo(this, 75, 102, textureX, textureY); // Box 556
		bodyModel[212] = new ModelRendererTurbo(this, 73, 111, textureX, textureY); // Box 557
		bodyModel[213] = new ModelRendererTurbo(this, 77, 90, textureX, textureY); // Box 558
		bodyModel[214] = new ModelRendererTurbo(this, 76, 97, textureX, textureY); // Box 559
		bodyModel[215] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 560
		bodyModel[216] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Box 561
		bodyModel[217] = new ModelRendererTurbo(this, 4, 63, textureX, textureY); // Box 562
		bodyModel[218] = new ModelRendererTurbo(this, 58, 52, textureX, textureY); // Box 563
		bodyModel[219] = new ModelRendererTurbo(this, 56, 46, textureX, textureY); // Box 564
		bodyModel[220] = new ModelRendererTurbo(this, 57, 62, textureX, textureY); // Box 565
		bodyModel[221] = new ModelRendererTurbo(this, 57, 69, textureX, textureY); // Box 566
		bodyModel[222] = new ModelRendererTurbo(this, 58, 66, textureX, textureY); // Box 567
		bodyModel[223] = new ModelRendererTurbo(this, 358, 153, textureX, textureY); // Box 0
		bodyModel[224] = new ModelRendererTurbo(this, 363, 136, textureX, textureY); // Box 0
		bodyModel[225] = new ModelRendererTurbo(this, 358, 169, textureX, textureY); // Box 0
		bodyModel[226] = new ModelRendererTurbo(this, 385, 167, textureX, textureY); // Box 0
		bodyModel[227] = new ModelRendererTurbo(this, 410, 180, textureX, textureY); // Box 1
		bodyModel[228] = new ModelRendererTurbo(this, 362, 142, textureX, textureY); // Box 0
		bodyModel[229] = new ModelRendererTurbo(this, 358, 165, textureX, textureY); // Box 495
		bodyModel[230] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 496
		bodyModel[231] = new ModelRendererTurbo(this, 362, 134, textureX, textureY); // Box 497
		bodyModel[232] = new ModelRendererTurbo(this, 390, 179, textureX, textureY); // Box 2
		bodyModel[233] = new ModelRendererTurbo(this, 369, 179, textureX, textureY); // Box 2
		bodyModel[234] = new ModelRendererTurbo(this, 455, 159, textureX, textureY); // Box 0
		bodyModel[235] = new ModelRendererTurbo(this, 487, 133, textureX, textureY); // Box 565
		bodyModel[236] = new ModelRendererTurbo(this, 385, 143, textureX, textureY); // Box 0
		bodyModel[237] = new ModelRendererTurbo(this, 497, 163, textureX, textureY); // Box 0
		bodyModel[238] = new ModelRendererTurbo(this, 488, 163, textureX, textureY); // Box 0
		bodyModel[239] = new ModelRendererTurbo(this, 466, 158, textureX, textureY); // Box 0
		bodyModel[240] = new ModelRendererTurbo(this, 479, 159, textureX, textureY); // Box 496
		bodyModel[241] = new ModelRendererTurbo(this, 487, 138, textureX, textureY); // Box 565
		bodyModel[242] = new ModelRendererTurbo(this, 478, 138, textureX, textureY); // Box 506
		bodyModel[243] = new ModelRendererTurbo(this, 479, 166, textureX, textureY); // Box 496
		bodyModel[244] = new ModelRendererTurbo(this, 415, 163, textureX, textureY); // Box 445
		bodyModel[245] = new ModelRendererTurbo(this, 424, 163, textureX, textureY); // Box 446
		bodyModel[246] = new ModelRendererTurbo(this, 442, 158, textureX, textureY); // Box 447
		bodyModel[247] = new ModelRendererTurbo(this, 433, 159, textureX, textureY); // Box 448
		bodyModel[248] = new ModelRendererTurbo(this, 435, 166, textureX, textureY); // Box 449
		bodyModel[249] = new ModelRendererTurbo(this, 478, 133, textureX, textureY); // Box 574
		bodyModel[250] = new ModelRendererTurbo(this, 125, 154, textureX, textureY); // Box 0
		bodyModel[251] = new ModelRendererTurbo(this, 125, 179, textureX, textureY); // Box 0
		bodyModel[252] = new ModelRendererTurbo(this, 334, 134, textureX, textureY); // Box 120
		bodyModel[253] = new ModelRendererTurbo(this, 334, 85, textureX, textureY); // Box 481
		bodyModel[254] = new ModelRendererTurbo(this, 347, 120, textureX, textureY); // Box 0
		bodyModel[255] = new ModelRendererTurbo(this, 333, 126, textureX, textureY); // Box 0
		bodyModel[256] = new ModelRendererTurbo(this, 347, 71, textureX, textureY); // Box 60
		bodyModel[257] = new ModelRendererTurbo(this, 333, 77, textureX, textureY); // Box 61
		bodyModel[258] = new ModelRendererTurbo(this, 344, 114, textureX, textureY); // Box 79
		bodyModel[259] = new ModelRendererTurbo(this, 330, 114, textureX, textureY); // Box 80
		bodyModel[260] = new ModelRendererTurbo(this, 344, 65, textureX, textureY); // Box 108
		bodyModel[261] = new ModelRendererTurbo(this, 330, 65, textureX, textureY); // Box 109
		bodyModel[262] = new ModelRendererTurbo(this, 333, 114, textureX, textureY); // Rear side door L
		bodyModel[263] = new ModelRendererTurbo(this, 333, 65, textureX, textureY); // Rear side door R
		bodyModel[264] = new ModelRendererTurbo(this, 302, 85, textureX, textureY,"cull"); // Box 120 cull
		bodyModel[265] = new ModelRendererTurbo(this, 327, 87, textureX, textureY,"cull"); // Box 120 cull
		bodyModel[266] = new ModelRendererTurbo(this, 366, 69, textureX, textureY); // Box 105
		bodyModel[267] = new ModelRendererTurbo(this, 369, 123, textureX, textureY); // Box 429
		bodyModel[268] = new ModelRendererTurbo(this, 360, 123, textureX, textureY); // Box 430
		bodyModel[269] = new ModelRendererTurbo(this, 366, 118, textureX, textureY); // Box 431
		bodyModel[270] = new ModelRendererTurbo(this, 455, 144, textureX, textureY); // Box 0
		bodyModel[271] = new ModelRendererTurbo(this, 466, 142, textureX, textureY); // Box 497
		bodyModel[272] = new ModelRendererTurbo(this, 442, 142, textureX, textureY); // Box 463
		bodyModel[273] = new ModelRendererTurbo(this, 369, 74, textureX, textureY); // Box 435
		bodyModel[274] = new ModelRendererTurbo(this, 360, 74, textureX, textureY); // Box 436
		bodyModel[275] = new ModelRendererTurbo(this, 488, 146, textureX, textureY); // Box 437
		bodyModel[276] = new ModelRendererTurbo(this, 479, 146, textureX, textureY); // Box 438
		bodyModel[277] = new ModelRendererTurbo(this, 474, 139, textureX, textureY); // Box 0
		bodyModel[278] = new ModelRendererTurbo(this, 444, 139, textureX, textureY); // Box 539
		bodyModel[279] = new ModelRendererTurbo(this, 439, 136, textureX, textureY,"markerlight_353_back_3"); // Markerlight R type 3 BACK
		bodyModel[280] = new ModelRendererTurbo(this, 430, 136, textureX, textureY); // Box 216
		bodyModel[281] = new ModelRendererTurbo(this, 416, 136, textureX, textureY,"markerlight_545_back_3"); // Markerlight L type 3 BACK
		bodyModel[282] = new ModelRendererTurbo(this, 422, 140, textureX, textureY,"numberboard_L_back_type_3"); // Numberboard L type 3 BACK
		bodyModel[283] = new ModelRendererTurbo(this, 431, 140, textureX, textureY,"numberboard_R_back_type_3"); // Numberboard R type 3 BACK
		bodyModel[284] = new ModelRendererTurbo(this, 424, 146, textureX, textureY); // Box 517
		bodyModel[285] = new ModelRendererTurbo(this, 433, 146, textureX, textureY); // Box 518
		bodyModel[286] = new ModelRendererTurbo(this, 421, 136, textureX, textureY); // Box 519
		bodyModel[287] = new ModelRendererTurbo(this, 476, 133, textureX, textureY,"markerlight_353_back_2"); // Box 353 markerlight type 3 BACK
		bodyModel[288] = new ModelRendererTurbo(this, 440, 133, textureX, textureY,"markerlight_545_back_2"); // Box 545 markerlight type 3 BACK
		bodyModel[289] = new ModelRendererTurbo(this, 350, 111, textureX, textureY); // Box 0
		bodyModel[290] = new ModelRendererTurbo(this, 350, 62, textureX, textureY); // Box 105
		bodyModel[291] = new ModelRendererTurbo(this, 347, 114, textureX, textureY); // Box 0
		bodyModel[292] = new ModelRendererTurbo(this, 465, 13, textureX, textureY); // Box 0
		bodyModel[293] = new ModelRendererTurbo(this, 399, 6, textureX, textureY); // Box 0
		bodyModel[294] = new ModelRendererTurbo(this, 399, 1, textureX, textureY); // Box 0
		bodyModel[295] = new ModelRendererTurbo(this, 420, 1, textureX, textureY); // Box 0
		bodyModel[296] = new ModelRendererTurbo(this, 449, 6, textureX, textureY); // Box 146
		bodyModel[297] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 147
		bodyModel[298] = new ModelRendererTurbo(this, 347, 65, textureX, textureY); // Box 252
		bodyModel[299] = new ModelRendererTurbo(this, 352, 114, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[300] = new ModelRendererTurbo(this, 352, 65, textureX, textureY,"cull"); // Box 346 cull
		bodyModel[301] = new ModelRendererTurbo(this, 361, 114, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[302] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 348
		bodyModel[303] = new ModelRendererTurbo(this, 367, 62, textureX, textureY); // Box 105
		bodyModel[304] = new ModelRendererTurbo(this, 367, 111, textureX, textureY); // Box 423
		bodyModel[305] = new ModelRendererTurbo(this, 375, 113, textureX, textureY); // Box 0
		bodyModel[306] = new ModelRendererTurbo(this, 375, 64, textureX, textureY); // Box 0
		bodyModel[307] = new ModelRendererTurbo(this, 366, 65, textureX, textureY); // Box 105
		bodyModel[308] = new ModelRendererTurbo(this, 366, 114, textureX, textureY); // Box 438
		bodyModel[309] = new ModelRendererTurbo(this, 460, 77, textureX, textureY); // Box 207
		bodyModel[310] = new ModelRendererTurbo(this, 488, 76, textureX, textureY); // Box 529
		bodyModel[311] = new ModelRendererTurbo(this, 430, 44, textureX, textureY); // Box 208
		bodyModel[312] = new ModelRendererTurbo(this, 428, 36, textureX, textureY); // Box 209
		bodyModel[313] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 208
		bodyModel[314] = new ModelRendererTurbo(this, 433, 30, textureX, textureY); // Box 194
		bodyModel[315] = new ModelRendererTurbo(this, 471, 74, textureX, textureY); // Box 209
		bodyModel[316] = new ModelRendererTurbo(this, 433, 67, textureX, textureY); // Box 429
		bodyModel[317] = new ModelRendererTurbo(this, 449, 77, textureX, textureY); // Box 430
		bodyModel[318] = new ModelRendererTurbo(this, 432, 74, textureX, textureY); // Box 431
		bodyModel[319] = new ModelRendererTurbo(this, 488, 84, textureX, textureY); // Box 529
		bodyModel[320] = new ModelRendererTurbo(this, 427, 76, textureX, textureY); // Box 434
		bodyModel[321] = new ModelRendererTurbo(this, 427, 84, textureX, textureY); // Box 436
		bodyModel[322] = new ModelRendererTurbo(this, 430, 50, textureX, textureY); // Box 560
		bodyModel[323] = new ModelRendererTurbo(this, 428, 56, textureX, textureY); // Box 561
		bodyModel[324] = new ModelRendererTurbo(this, 433, 64, textureX, textureY); // Box 562
		bodyModel[325] = new ModelRendererTurbo(this, 402, 41, textureX, textureY); // Box 0
		bodyModel[326] = new ModelRendererTurbo(this, 405, 50, textureX, textureY); // Box 0
		bodyModel[327] = new ModelRendererTurbo(this, 405, 33, textureX, textureY); // Box 88
		bodyModel[328] = new ModelRendererTurbo(this, 409, 58, textureX, textureY); // Box 0
		bodyModel[329] = new ModelRendererTurbo(this, 409, 29, textureX, textureY); // Box 336
		bodyModel[330] = new ModelRendererTurbo(this, 380, 36, textureX, textureY); // Box 363
		bodyModel[331] = new ModelRendererTurbo(this, 378, 40, textureX, textureY); // Box 364
		bodyModel[332] = new ModelRendererTurbo(this, 378, 30, textureX, textureY); // Box 364
		bodyModel[333] = new ModelRendererTurbo(this, 378, 56, textureX, textureY); // Box 384
		bodyModel[334] = new ModelRendererTurbo(this, 300, 10, textureX, textureY); // Box 88
		bodyModel[335] = new ModelRendererTurbo(this, 296, 7, textureX, textureY); // Box 88
		bodyModel[336] = new ModelRendererTurbo(this, 296, 16, textureX, textureY); // Box 88
		bodyModel[337] = new ModelRendererTurbo(this, 296, 13, textureX, textureY); // Box 88
		bodyModel[338] = new ModelRendererTurbo(this, 379, 26, textureX, textureY); // Box 457
		bodyModel[339] = new ModelRendererTurbo(this, 379, 18, textureX, textureY); // Box 458
		bodyModel[340] = new ModelRendererTurbo(this, 380, 23, textureX, textureY); // Box 459
		bodyModel[341] = new ModelRendererTurbo(this, 380, 52, textureX, textureY); // Box 563
		bodyModel[342] = new ModelRendererTurbo(this, 378, 46, textureX, textureY); // Box 564
		bodyModel[343] = new ModelRendererTurbo(this, 379, 62, textureX, textureY); // Box 565
		bodyModel[344] = new ModelRendererTurbo(this, 379, 69, textureX, textureY); // Box 566
		bodyModel[345] = new ModelRendererTurbo(this, 380, 66, textureX, textureY); // Box 567
		bodyModel[346] = new ModelRendererTurbo(this, 387, 53, textureX, textureY); // Box 0
		bodyModel[347] = new ModelRendererTurbo(this, 389, 68, textureX, textureY); // Box 0
		bodyModel[348] = new ModelRendererTurbo(this, 387, 32, textureX, textureY); // Box 361
		bodyModel[349] = new ModelRendererTurbo(this, 389, 22, textureX, textureY); // Box 362
		bodyModel[350] = new ModelRendererTurbo(this, 389, 71, textureX, textureY); // Box 0
		bodyModel[351] = new ModelRendererTurbo(this, 389, 19, textureX, textureY); // Box 364
		bodyModel[352] = new ModelRendererTurbo(this, 451, 141, textureX, textureY); // Box 0
		bodyModel[353] = new ModelRendererTurbo(this, 456, 141, textureX, textureY); // Box 0
		bodyModel[354] = new ModelRendererTurbo(this, 466, 141, textureX, textureY); // Box 430
		bodyModel[355] = new ModelRendererTurbo(this, 461, 141, textureX, textureY); // Box 431
		bodyModel[356] = new ModelRendererTurbo(this, 475, 113, textureX, textureY); // Box 430
		bodyModel[357] = new ModelRendererTurbo(this, 440, 113, textureX, textureY); // Box 433
		bodyModel[358] = new ModelRendererTurbo(this, 488, 117, textureX, textureY); // Box 497
		bodyModel[359] = new ModelRendererTurbo(this, 487, 106, textureX, textureY); // Box 438
		bodyModel[360] = new ModelRendererTurbo(this, 419, 117, textureX, textureY); // Box 445
		bodyModel[361] = new ModelRendererTurbo(this, 476, 113, textureX, textureY); // Box 497
		bodyModel[362] = new ModelRendererTurbo(this, 492, 90, textureX, textureY); // Box 60
		bodyModel[363] = new ModelRendererTurbo(this, 491, 97, textureX, textureY); // Box 437
		bodyModel[364] = new ModelRendererTurbo(this, 420, 106, textureX, textureY); // Box 554
		bodyModel[365] = new ModelRendererTurbo(this, 427, 113, textureX, textureY); // Box 555
		bodyModel[366] = new ModelRendererTurbo(this, 417, 90, textureX, textureY); // Box 558
		bodyModel[367] = new ModelRendererTurbo(this, 416, 97, textureX, textureY); // Box 559
		bodyModel[368] = new ModelRendererTurbo(this, 468, 113, textureX, textureY); // Box 103
		bodyModel[369] = new ModelRendererTurbo(this, 467, 109, textureX, textureY); // Box 103
		bodyModel[370] = new ModelRendererTurbo(this, 446, 109, textureX, textureY); // Box 103
		bodyModel[371] = new ModelRendererTurbo(this, 447, 113, textureX, textureY); // Box 103
		bodyModel[372] = new ModelRendererTurbo(this, 468, 117, textureX, textureY); // Box 103
		bodyModel[373] = new ModelRendererTurbo(this, 447, 117, textureX, textureY); // Box 103
		bodyModel[374] = new ModelRendererTurbo(this, 467, 121, textureX, textureY); // Box 103
		bodyModel[375] = new ModelRendererTurbo(this, 446, 121, textureX, textureY); // Box 103
		bodyModel[376] = new ModelRendererTurbo(this, 460, 114, textureX, textureY); // Box 167
		bodyModel[377] = new ModelRendererTurbo(this, 453, 114, textureX, textureY); // Box 166
		bodyModel[378] = new ModelRendererTurbo(this, 453, 109, textureX, textureY); // Box 165
		bodyModel[379] = new ModelRendererTurbo(this, 460, 109, textureX, textureY); // Box 164
		bodyModel[380] = new ModelRendererTurbo(this, 465, 119, textureX, textureY); // Box 403
		bodyModel[381] = new ModelRendererTurbo(this, 460, 119, textureX, textureY); // Box 403
		bodyModel[382] = new ModelRendererTurbo(this, 464, 123, textureX, textureY); // Box 406
		bodyModel[383] = new ModelRendererTurbo(this, 460, 125, textureX, textureY); // Box 406
		bodyModel[384] = new ModelRendererTurbo(this, 452, 119, textureX, textureY); // Box 489
		bodyModel[385] = new ModelRendererTurbo(this, 455, 119, textureX, textureY); // Box 490
		bodyModel[386] = new ModelRendererTurbo(this, 453, 123, textureX, textureY); // Box 491
		bodyModel[387] = new ModelRendererTurbo(this, 455, 125, textureX, textureY); // Box 492
		bodyModel[388] = new ModelRendererTurbo(this, 465, 129, textureX, textureY,"backlight2beamUA1"); // Box 186 headlight back 2beam top A
		bodyModel[389] = new ModelRendererTurbo(this, 465, 135, textureX, textureY,"backlight2beamUA2"); // Box 187 headlight back 2beam top A
		bodyModel[390] = new ModelRendererTurbo(this, 456, 134, textureX, textureY,"big_backlight_top"); // Box 169 headlight back big top
		bodyModel[391] = new ModelRendererTurbo(this, 449, 135, textureX, textureY,"backlight2beamUB1"); // Box 186 headlight back 2beam top B
		bodyModel[392] = new ModelRendererTurbo(this, 449, 129, textureX, textureY,"backlight2beamUB2"); // Box 187 headlight back 2beam top B
		bodyModel[393] = new ModelRendererTurbo(this, 475, 109, textureX, textureY); // Box 430
		bodyModel[394] = new ModelRendererTurbo(this, 461, 100, textureX, textureY); // Box 430
		bodyModel[395] = new ModelRendererTurbo(this, 460, 96, textureX, textureY); // Box 430
		bodyModel[396] = new ModelRendererTurbo(this, 440, 109, textureX, textureY); // Box 459
		bodyModel[397] = new ModelRendererTurbo(this, 454, 100, textureX, textureY); // Box 460
		bodyModel[398] = new ModelRendererTurbo(this, 453, 96, textureX, textureY); // Box 465
		bodyModel[399] = new ModelRendererTurbo(this, 457, 129, textureX, textureY,"small_backlight_top"); // Box 186 headlight back small top
		bodyModel[400] = new ModelRendererTurbo(this, 460, 88, textureX, textureY); // Box 208
		bodyModel[401] = new ModelRendererTurbo(this, 473, 99, textureX, textureY); // Box 209
		bodyModel[402] = new ModelRendererTurbo(this, 484, 99, textureX, textureY); // Box 209
		bodyModel[403] = new ModelRendererTurbo(this, 429, 99, textureX, textureY); // Box 468
		bodyModel[404] = new ModelRendererTurbo(this, 480, 107, textureX, textureY); // Box 209
		bodyModel[405] = new ModelRendererTurbo(this, 490, 102, textureX, textureY); // Box 209
		bodyModel[406] = new ModelRendererTurbo(this, 488, 111, textureX, textureY); // Box 209
		bodyModel[407] = new ModelRendererTurbo(this, 429, 107, textureX, textureY); // Box 472
		bodyModel[408] = new ModelRendererTurbo(this, 460, 92, textureX, textureY); // Box 208
		bodyModel[409] = new ModelRendererTurbo(this, 445, 88, textureX, textureY); // Box 466
		bodyModel[410] = new ModelRendererTurbo(this, 445, 92, textureX, textureY); // Box 467
		bodyModel[411] = new ModelRendererTurbo(this, 462, 101, textureX, textureY); // Box 209
		bodyModel[412] = new ModelRendererTurbo(this, 430, 99, textureX, textureY); // Box 470
		bodyModel[413] = new ModelRendererTurbo(this, 441, 101, textureX, textureY); // Box 471
		bodyModel[414] = new ModelRendererTurbo(this, 480, 88, textureX, textureY); // Box 209
		bodyModel[415] = new ModelRendererTurbo(this, 468, 90, textureX, textureY); // Box 209
		bodyModel[416] = new ModelRendererTurbo(this, 421, 88, textureX, textureY); // Box 480
		bodyModel[417] = new ModelRendererTurbo(this, 433, 90, textureX, textureY); // Box 481
		bodyModel[418] = new ModelRendererTurbo(this, 423, 102, textureX, textureY); // Box 556
		bodyModel[419] = new ModelRendererTurbo(this, 421, 111, textureX, textureY); // Box 557
		bodyModel[420] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 208
		bodyModel[421] = new ModelRendererTurbo(this, 475, 41, textureX, textureY); // Box 413
		bodyModel[422] = new ModelRendererTurbo(this, 493, 40, textureX, textureY); // Box 209
		bodyModel[423] = new ModelRendererTurbo(this, 465, 40, textureX, textureY); // Box 413
		bodyModel[424] = new ModelRendererTurbo(this, 410, 26, textureX, textureY); // Box 355
		bodyModel[425] = new ModelRendererTurbo(this, 410, 62, textureX, textureY); // Box 420
		bodyModel[426] = new ModelRendererTurbo(this, 492, 25, textureX, textureY); // Box 0
		bodyModel[427] = new ModelRendererTurbo(this, 462, 18, textureX, textureY); // Box 0
		bodyModel[428] = new ModelRendererTurbo(this, 462, 3, textureX, textureY); // Box 396
		bodyModel[429] = new ModelRendererTurbo(this, 466, 43, textureX, textureY); // Box 0
		bodyModel[430] = new ModelRendererTurbo(this, 463, 49, textureX, textureY); // Box 0
		bodyModel[431] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 416
		bodyModel[432] = new ModelRendererTurbo(this, 65, 42, textureX, textureY); // Box 0
		bodyModel[433] = new ModelRendererTurbo(this, 64, 49, textureX, textureY); // Box 0
		bodyModel[434] = new ModelRendererTurbo(this, 64, 34, textureX, textureY); // Box 88
		bodyModel[435] = new ModelRendererTurbo(this, 67, 29, textureX, textureY); // Box 336
		bodyModel[436] = new ModelRendererTurbo(this, 67, 57, textureX, textureY); // Box 579
		bodyModel[437] = new ModelRendererTurbo(this, 41, 42, textureX, textureY); // Box 0
		bodyModel[438] = new ModelRendererTurbo(this, 45, 50, textureX, textureY); // Box 0
		bodyModel[439] = new ModelRendererTurbo(this, 45, 39, textureX, textureY); // Box 358
		bodyModel[440] = new ModelRendererTurbo(this, 387, 43, textureX, textureY); // Box 0
		bodyModel[441] = new ModelRendererTurbo(this, 391, 50, textureX, textureY); // Box 0
		bodyModel[442] = new ModelRendererTurbo(this, 391, 40, textureX, textureY); // Box 358
		bodyModel[443] = new ModelRendererTurbo(this, 114, 198, textureX, textureY); // Box 2
		bodyModel[444] = new ModelRendererTurbo(this, 361, 200, textureX, textureY); // Box 2
		bodyModel[445] = new ModelRendererTurbo(this, 362, 206, textureX, textureY); // Box 0
		bodyModel[446] = new ModelRendererTurbo(this, 362, 193, textureX, textureY); // Box 0
		bodyModel[447] = new ModelRendererTurbo(this, 115, 204, textureX, textureY); // Box 0
		bodyModel[448] = new ModelRendererTurbo(this, 115, 191, textureX, textureY); // Box 0
		bodyModel[449] = new ModelRendererTurbo(this, 167, 193, textureX, textureY); // Box 420 water filler
		bodyModel[450] = new ModelRendererTurbo(this, 311, 195, textureX, textureY); // Box 421 water filler
		bodyModel[451] = new ModelRendererTurbo(this, 202, 193, textureX, textureY); // Box 0
		bodyModel[452] = new ModelRendererTurbo(this, 179, 202, textureX, textureY); // Box 0
		bodyModel[453] = new ModelRendererTurbo(this, 177, 197, textureX, textureY); // Box 0
		bodyModel[454] = new ModelRendererTurbo(this, 180, 193, textureX, textureY); // Box 0
		bodyModel[455] = new ModelRendererTurbo(this, 322, 193, textureX, textureY); // Box 538
		bodyModel[456] = new ModelRendererTurbo(this, 321, 199, textureX, textureY); // Box 539
		bodyModel[457] = new ModelRendererTurbo(this, 323, 204, textureX, textureY); // Box 540
		bodyModel[458] = new ModelRendererTurbo(this, 295, 203, textureX, textureY); // Box 0
		bodyModel[459] = new ModelRendererTurbo(this, 295, 194, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[460] = new ModelRendererTurbo(this, 145, 199, textureX, textureY); // Box 343
		bodyModel[461] = new ModelRendererTurbo(this, 146, 193, textureX, textureY); // Box 344
		bodyModel[462] = new ModelRendererTurbo(this, 130, 193, textureX, textureY); // Box 420 water filler
		bodyModel[463] = new ModelRendererTurbo(this, 287, 195, textureX, textureY); // Box 421 water filler
		bodyModel[464] = new ModelRendererTurbo(this, 212, 133, textureX, textureY); // Box 120
		bodyModel[465] = new ModelRendererTurbo(this, 208, 134, textureX, textureY); // Box 120
		bodyModel[466] = new ModelRendererTurbo(this, 222, 134, textureX, textureY); // Box 120
		bodyModel[467] = new ModelRendererTurbo(this, 266, 84, textureX, textureY); // Box 481
		bodyModel[468] = new ModelRendererTurbo(this, 262, 85, textureX, textureY,"cull"); // Box 120 cull
		bodyModel[469] = new ModelRendererTurbo(this, 276, 85, textureX, textureY,"cull"); // Box 120 cull
		bodyModel[470] = new ModelRendererTurbo(this, 222, 120, textureX, textureY); // Box 79
		bodyModel[471] = new ModelRendererTurbo(this, 208, 120, textureX, textureY); // Box 80
		bodyModel[472] = new ModelRendererTurbo(this, 276, 71, textureX, textureY); // Box 0
		bodyModel[473] = new ModelRendererTurbo(this, 262, 71, textureX, textureY); // Box 0
		bodyModel[474] = new ModelRendererTurbo(this, 211, 113, textureX, textureY); // Box 0
		bodyModel[475] = new ModelRendererTurbo(this, 211, 123, textureX, textureY); // Middle side door L
		bodyModel[476] = new ModelRendererTurbo(this, 265, 64, textureX, textureY); // Box 348
		bodyModel[477] = new ModelRendererTurbo(this, 265, 74, textureX, textureY); // Middle side door R
		bodyModel[478] = new ModelRendererTurbo(this, 178, 142, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[479] = new ModelRendererTurbo(this, 178, 93, textureX, textureY,"cull"); // Box 378 cull
		bodyModel[480] = new ModelRendererTurbo(this, 157, 115, textureX, textureY); // Box 0
		bodyModel[481] = new ModelRendererTurbo(this, 157, 66, textureX, textureY); // Box 62
		bodyModel[482] = new ModelRendererTurbo(this, 225, 115, textureX, textureY); // Box 0
		bodyModel[483] = new ModelRendererTurbo(this, 279, 66, textureX, textureY); // Box 62
		bodyModel[484] = new ModelRendererTurbo(this, 305, 93, textureX, textureY,"cull"); // Box 378 cull
		bodyModel[485] = new ModelRendererTurbo(this, 305, 142, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[486] = new ModelRendererTurbo(this, 156, 94, textureX, textureY,"cull"); // Box 378 cull
		bodyModel[487] = new ModelRendererTurbo(this, 159, 142, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[488] = new ModelRendererTurbo(this, 458, 244, textureX, textureY); // Box 0
		bodyModel[489] = new ModelRendererTurbo(this, 444, 210, textureX, textureY); // Box 0
		bodyModel[490] = new ModelRendererTurbo(this, 460, 237, textureX, textureY); // Box 394
		bodyModel[491] = new ModelRendererTurbo(this, 499, 237, textureX, textureY); // Box 394
		bodyModel[492] = new ModelRendererTurbo(this, 448, 193, textureX, textureY); // Box 0
		bodyModel[493] = new ModelRendererTurbo(this, 457, 179, textureX, textureY); // Box 0
		bodyModel[494] = new ModelRendererTurbo(this, 441, 245, textureX, textureY); // Box 0
		bodyModel[495] = new ModelRendererTurbo(this, 444, 245, textureX, textureY); // Box 0
		bodyModel[496] = new ModelRendererTurbo(this, 447, 245, textureX, textureY); // Box 0
		bodyModel[497] = new ModelRendererTurbo(this, 450, 245, textureX, textureY); // Box 0
		bodyModel[498] = new ModelRendererTurbo(this, 453, 245, textureX, textureY); // Box 0
		bodyModel[499] = new ModelRendererTurbo(this, 456, 245, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 120
		bodyModel[0].setRotationPoint(-43.5F, 2F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 481
		bodyModel[1].setRotationPoint(-43.5F, 2F, 11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[2].setRotationPoint(-55F, 0F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[3].setRotationPoint(-57.5F, 0F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[4].setRotationPoint(-55F, 0F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(-57.5F, 0F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[6].setRotationPoint(-61.5F, 3F, -1.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(-59.5F, 0F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 495
		bodyModel[8].setRotationPoint(-55F, 0F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F); // Box 496
		bodyModel[9].setRotationPoint(-57.5F, 0F, 7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 497
		bodyModel[10].setRotationPoint(-59.5F, 0F, 2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F); // Box 114
		bodyModel[11].setRotationPoint(-53.3F, 2.75F, 6.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 74
		bodyModel[12].setRotationPoint(-53.3F, 2F, 6.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[13].setRotationPoint(-53.05F, 3F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,0F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[14].setRotationPoint(-58.28F, 2F, -3.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[15].setRotationPoint(-52.5F, 2F, -3.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 5, 12, 1, 0F); // Box 0
		bodyModel[16].setRotationPoint(-48.5F, -12F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 0
		bodyModel[17].setRotationPoint(-43.5F, -6F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 5, 12, 1, 0F); // Box 60
		bodyModel[18].setRotationPoint(-48.5F, -12F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 61
		bodyModel[19].setRotationPoint(-43.5F, -6F, 10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(-46.5F, -17F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[21].setRotationPoint(-46.5F, -17F, 10F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 18, 1, 0F); // Box 79
		bodyModel[22].setRotationPoint(-39F, -15F, -12F);

		bodyModel[23].addBox(0F, 0F, 0F, 0, 18, 1, 0F); // Box 80
		bodyModel[23].setRotationPoint(-44F, -15F, -12F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 18, 1, 0F); // Box 108
		bodyModel[24].setRotationPoint(-39F, -15F, 11F);

		bodyModel[25].addBox(0F, 0F, 0F, 0, 18, 1, 0F); // Box 109
		bodyModel[25].setRotationPoint(-44F, -15F, 11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[26].setRotationPoint(-44.5F, -16F, -11F);

		bodyModel[27].addShapeBox(-4F, 0F, -0.5F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Front side door L
		bodyModel[27].setRotationPoint(-39.5F, -16F, -10F);

		bodyModel[28].addShapeBox(-4F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Front side door R
		bodyModel[28].setRotationPoint(-39.5F, -16F, 10F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 6, 20, 0F); // Box 0
		bodyModel[29].setRotationPoint(-45.5F, -6F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[30].setRotationPoint(-39.5F, -17F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[31].setRotationPoint(-39.5F, -19F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[32].setRotationPoint(-39.5F, -17F, 8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[33].setRotationPoint(-39.5F, -19F, 8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[34].setRotationPoint(-44.5F, -16F, 10F);

		bodyModel[35].addShapeBox(-1F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[35].setRotationPoint(-47F, -12F, 3.5F);
		bodyModel[35].rotateAngleY = 0.52359878F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 389
		bodyModel[36].setRotationPoint(-47.25F, -12.5F, 3.25F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 197
		bodyModel[37].setRotationPoint(-48.23F, -14F, 1.63F);
		bodyModel[37].rotateAngleY = 0.52359878F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[38].setRotationPoint(-47.85F, -10.75F, 5.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[39].setRotationPoint(-47.85F, -11.75F, 8.25F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 389
		bodyModel[40].setRotationPoint(-47.73F, -11.5F, 6.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.425F, 0F, 0F, -0.425F, 0F, 0F, -0.425F, 0F, 0F, 0.425F, 0F, 0F); // Box 0
		bodyModel[41].setRotationPoint(-59F, 2F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -1F, 0F, 0F); // Box 565
		bodyModel[42].setRotationPoint(-60F, 1F, 0F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 0
		bodyModel[43].setRotationPoint(-48.17F, -9F, 8.62F);
		bodyModel[43].rotateAngleY = -0.78539816F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[44].setRotationPoint(-44F, 2F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[45].setRotationPoint(-39.5F, 2F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.51F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, -0.5F, -0.51F, -0.01F, -0.5F, -0.51F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, -0.5F, -0.51F, -0.01F, -0.5F); // Box 0 cull
		bodyModel[46].setRotationPoint(-47.5F, -16F, -10.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.51F, -0.01F, -0.5F, -0.01F, -0.01F, -0.5F, -0.01F, -0.01F, 0F, -0.51F, -0.01F, 0F, -0.51F, -0.01F, -0.5F, -0.01F, -0.01F, -0.5F, -0.01F, -0.01F, 0F, -0.51F, -0.01F, 0F); // Box 346 cull
		bodyModel[47].setRotationPoint(-47.5F, -16F, 9.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, 0.49F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0.49F, -0.01F, -0.5F); // Box 0 cull
		bodyModel[48].setRotationPoint(-48F, -16F, -10.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0.49F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0.49F, -0.01F, 0F); // Box 348
		bodyModel[49].setRotationPoint(-48F, -16F, 9.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[50].setRotationPoint(-47.15F, -20F, -3.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -1.5F, 0F, -0.35F, -1.5F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -0.35F, 1.5F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[51].setRotationPoint(-47.15F, -20F, -9.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 88
		bodyModel[52].setRotationPoint(-47.15F, -20F, 3.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, -0.35F, -1F, 0F, -0.35F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[53].setRotationPoint(-47.15F, -18F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0.5F, -0.5F, -0.35F, 0.5F, -0.5F, -0.35F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[54].setRotationPoint(-47.15F, -18F, 9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.05F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.35F, -1F, 0F, 0F, -1F, 0F, 0.05F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.35F, 0F, -1F, 0.09F, 0F, -1F); // Box 355
		bodyModel[55].setRotationPoint(-47.15F, -18F, 10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[56].setRotationPoint(-43.5F, -21F, -8.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1.335F, 0F, 0F, -1.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 0
		bodyModel[57].setRotationPoint(-43.5F, -19F, -9.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 361
		bodyModel[58].setRotationPoint(-43.5F, -21F, 3.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.335F, 0F, 0F, -1.335F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 362
		bodyModel[59].setRotationPoint(-43.5F, -19F, 8.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.335F, 0.5F, 0F, -0.335F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 0
		bodyModel[60].setRotationPoint(-43.5F, -18F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.335F, 0.5F, 0F, -0.335F, 0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 364
		bodyModel[61].setRotationPoint(-43.5F, -18F, 10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.715F, 0F, 0F, 0F, 0F, 0F, 0F, -0.335F, 0F, -1F, -0.335F, 0F, 0.675F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.535F, 0F, 0F); // Box 363
		bodyModel[62].setRotationPoint(-44.5F, -22F, 2.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.715F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.675F, 0F, 0F); // Box 364
		bodyModel[63].setRotationPoint(-44.5F, -22F, -0.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-2F, -0.335F, 0F, 1F, -0.335F, 0F, 1F, -1.335F, 0F, -2F, -1.335F, 0F, -0.465F, 0F, 0F, 1F, 0F, 0F, 1F, 0.75F, 0F, -0.675F, 0.75F, 0F); // Box 364
		bodyModel[64].setRotationPoint(-45.5F, -22F, 3.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-2F, -1.335F, 0F, 1F, -1.335F, 0F, 1F, -0.335F, 0F, -2F, -0.335F, 0F, -0.675F, 0.75F, 0F, 1F, 0.75F, 0F, 1F, 0F, 0F, -0.465F, 0F, 0F); // Box 384
		bodyModel[65].setRotationPoint(-45.5F, -22F, -6.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[66].setRotationPoint(-47F, -3F, -2F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 6, 8, 0F); // Box 0
		bodyModel[67].setRotationPoint(-48.5F, -6F, -10F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 6, 8, 0F); // Box 396
		bodyModel[68].setRotationPoint(-48.5F, -6F, 2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[69].setRotationPoint(-49.5F, -10F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.35F, 0F, 0F, -0.35F, 0F, 0F, 1.5F, -0.3F, -0.5F, -1.5F, -0.3F, -0.5F, -1.15F, -0.1F, 0F, 1.15F, -0.1F, 0F); // Box 207
		bodyModel[70].setRotationPoint(-49.15F, -19F, -0.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.625F, 0F, 0F, -1.63F, 0F, 0F, -1.62F, 0F, 0F, 0.62F, 0F, 0F); // Box 529
		bodyModel[71].setRotationPoint(-48.15F, -17F, 10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1.35F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.35F, 0F, -0.5F); // Box 208
		bodyModel[72].setRotationPoint(-49.15F, -20F, 0F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, -1.5F, 0F, -1.6F, -1.5F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 1.5F, 0F, -0.6F, 1.5F, 0F); // Box 209
		bodyModel[73].setRotationPoint(-48.8F, -20F, 3.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, -0.5F, -1.05F, -0.5F, -0.5F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.125F, -0.5F, -0.05F, 0.125F, -0.5F); // Box 208
		bodyModel[74].setRotationPoint(-48.2F, -18.5F, 9.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[75].setRotationPoint(-48.15F, -18F, 10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.65F, -1.625F, -0.5F, -0.65F, -1.625F, -0.5F, 1.5F, -0.1F, 0F, -1.5F, -0.1F, 0F, -0.85F, 1.525F, -0.5F, 0.85F, 1.525F, -0.5F); // Box 209
		bodyModel[76].setRotationPoint(-48.8F, -19F, 3.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.255F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.08F, 0F, 0F); // Box 105
		bodyModel[77].setRotationPoint(-47.5F, -17F, 10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.985F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F); // Box 105
		bodyModel[78].setRotationPoint(-49.5F, -12F, 10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, -0.35F, -1F, 0F, -0.35F, -0.5F, 0.5F, 0.05F, -0.5F, 0.5F, 0.09F, 0F, -1F, -0.35F, 0F, -1F, -0.35F, -0.5F, 0.5F, 0.05F, -0.5F, 0.5F); // Box 420
		bodyModel[79].setRotationPoint(-47.15F, -18F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.255F, 0F, 0F, -0.08F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[80].setRotationPoint(-47.5F, -17F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 429
		bodyModel[81].setRotationPoint(-48.15F, -18F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.15F, -0.1F, 0F, -1.15F, -0.1F, 0F, -1.5F, -0.3F, -0.5F, 1.5F, -0.3F, -0.5F); // Box 430
		bodyModel[82].setRotationPoint(-49.15F, -19F, -3.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,-0.65F, -1.625F, -0.5F, 0.65F, -1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.85F, 1.525F, -0.5F, -0.85F, 1.525F, -0.5F, -1.5F, -0.1F, 0F, 1.5F, -0.1F, 0F); // Box 431
		bodyModel[83].setRotationPoint(-48.8F, -19F, -10.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,-1.075F, 0F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, 0F, -1.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[84].setRotationPoint(-48.5F, -16F, -12F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,-1.075F, 0F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, 0F, -1.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[85].setRotationPoint(-48.5F, -16F, 11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[86].setRotationPoint(-46.5F, -21F, 0.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[87].setRotationPoint(-48.5F, -22F, 0.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[88].setRotationPoint(-48F, -21F, -1.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[89].setRotationPoint(-48F, -22F, -1.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[90].setRotationPoint(-59F, 0F, -2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[91].setRotationPoint(-58F, -12.5F, 1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[92].setRotationPoint(-58F, -12.5F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[93].setRotationPoint(-58F, -12.5F, -2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[94].setRotationPoint(-58F, -12.5F, -2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[95].setRotationPoint(-58F, -10.5F, 1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[96].setRotationPoint(-58F, -10.5F, -2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[97].setRotationPoint(-58F, -9.5F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[98].setRotationPoint(-58F, -9.5F, -2F);

		bodyModel[99].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front 2beam top A
		bodyModel[99].setRotationPoint(-57.25F, -10.5F, 0F);

		bodyModel[100].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front 2beam top A
		bodyModel[100].setRotationPoint(-57.25F, -10.5F, 0F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big top
		bodyModel[101].setRotationPoint(-57.25F, -11.75F, -1.25F);

		bodyModel[102].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front 2beam top B
		bodyModel[102].setRotationPoint(-57.25F, -10.5F, 0F);
		bodyModel[102].rotateAngleX = 1.57079633F;

		bodyModel[103].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front 2beam top B
		bodyModel[103].setRotationPoint(-57.25F, -10.5F, 0F);
		bodyModel[103].rotateAngleX = 1.57079633F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[104].setRotationPoint(-52.5F, 2F, 10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 0
		bodyModel[105].setRotationPoint(-55F, 2F, 10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.425F, 0F, 0F, -0.425F, 0F, 0F, 1.07F, 0F, -0.425F, -1.285F, 0F, 0F); // Box 0
		bodyModel[106].setRotationPoint(-59F, 2F, 2F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0F, 0F, -1F, -0.65F, 0F, 0.35F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0.18F, 0F, -1F); // Box 496
		bodyModel[107].setRotationPoint(-57.5F, 2F, 7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[108].setRotationPoint(-60F, 1F, 0F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[109].setRotationPoint(-60F, 1F, -3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.65F, 0F, 0.355F, -0.1125F, 0F, -1.22F, -0.385F, 0F, 1F, 0.18F, 0F, -1F, -0.53F, -0.5F, 0.465F, -1.47F, -0.5F, 0.465F, -2.23F, -0.5F, -1F, 0.23F, -0.5F, -1F); // Box 496
		bodyModel[110].setRotationPoint(-57.5F, 7F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[111].setRotationPoint(-52.5F, 2F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F); // Box 446
		bodyModel[112].setRotationPoint(-55F, 2F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.285F, 0F, 0F, 1.07F, 0F, -0.425F, -0.425F, 0F, 0F, 0.425F, 0F, 0F); // Box 447
		bodyModel[113].setRotationPoint(-59F, 2F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -1F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, -1F, 0F, 0F, 0.18F, 0F, -1F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, -0.65F, 0F, 0.355F); // Box 448
		bodyModel[114].setRotationPoint(-57.5F, 2F, -8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.18F, 0F, -1F, -0.385F, 0F, 1F, -0.1125F, 0F, -1.22F, -0.65F, 0F, 0.355F, 0.23F, -0.5F, -1F, -2.23F, -0.5F, -1F, -1.47F, -0.5F, 0.465F, -0.53F, -0.5F, 0.465F); // Box 449
		bodyModel[115].setRotationPoint(-57.5F, 7F, -8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F); // Box 208
		bodyModel[116].setRotationPoint(-50.65F, -13.1F, 0F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.35F, 0F, -0.5F, 0.35F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.35F, 0F, -0.5F, 0.35F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[117].setRotationPoint(-50.65F, -13.1F, -4F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.65F, -1.625F, -0.5F, -0.65F, -1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 1.625F, -0.5F, -0.65F, 1.625F, -0.5F); // Box 209
		bodyModel[118].setRotationPoint(-50.3F, -13.1F, 3.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.65F, -1.625F, -0.5F, 0.65F, -1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 1.625F, -0.5F, 0.65F, 1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[119].setRotationPoint(-50.3F, -13.1F, -10.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-0.35F, -1.95F, 0F, -0.65F, -1.95F, 0F, -1.65F, 0.3F, 0F, 0.65F, 0.3F, 0F, -0.35F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.65F, 0F, 0F); // Box 0
		bodyModel[120].setRotationPoint(-49F, -13F, -10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0.65F, 0.3F, 0F, -1.65F, 0.3F, 0F, -0.65F, -1.95F, 0F, -0.35F, -1.95F, 0F, 0.65F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.35F, 0F, 0F); // Box 416
		bodyModel[121].setRotationPoint(-49F, -13F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.625F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.46F, 0F, 0F); // Box 529
		bodyModel[122].setRotationPoint(-49.77F, -11F, 10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[123].setRotationPoint(-52.5F, -9F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[124].setRotationPoint(-51.5F, -9F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.985F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F); // Box 431
		bodyModel[125].setRotationPoint(-49.5F, -12F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0.62F, 0F, 0F, -1.62F, 0F, 0F, -1.63F, 0F, 0F, 1.625F, 0F, 0F); // Box 434
		bodyModel[126].setRotationPoint(-48.15F, -17F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.46F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, 0.625F, 0F, 0F); // Box 436
		bodyModel[127].setRotationPoint(-49.77F, -11F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.075F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.075F, -0.5F, 0F, -0.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.075F, 0.5F, 0F); // Box 105
		bodyModel[128].setRotationPoint(-47.5F, -16F, 11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.075F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F); // Box 438
		bodyModel[129].setRotationPoint(-47.5F, -16F, -12F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 389
		bodyModel[130].setRotationPoint(-47F, -10F, 2.77F);
		bodyModel[130].rotateAngleY = 0.78539816F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
		bodyModel[131].setRotationPoint(-47.85F, -10F, 6.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[132].setRotationPoint(-49F, -11.5F, 5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,-1.115F, 0F, 0F, 1.115F, 0F, 0F, 1.115F, 0F, 0F, -1.115F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[133].setRotationPoint(-59F, -8F, -2F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,-0.75F, 0F, 0F, 0.75F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 497
		bodyModel[134].setRotationPoint(-58.5F, -9F, 2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,-2.25F, 0F, 0F, 2.25F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 463
		bodyModel[135].setRotationPoint(-58.5F, -9F, -7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 167
		bodyModel[136].setRotationPoint(-57F, -10.5F, 0F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[137].setRotationPoint(-57F, -10.5F, -2F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[138].setRotationPoint(-57F, -12.5F, -2F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[139].setRotationPoint(-57F, -12.5F, 0F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 0
		bodyModel[140].setRotationPoint(-57.75F, -9F, -2F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.07F, -0.5F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 0
		bodyModel[141].setRotationPoint(-57.75F, -9F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 430
		bodyModel[142].setRotationPoint(-57.75F, -9F, 1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.07F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 431
		bodyModel[143].setRotationPoint(-57.75F, -9F, 0F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.202F, 0F, -1F, 0.202F, 0F, -1F, 0.202F, 0F, 0F, -0.202F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		bodyModel[144].setRotationPoint(-57.75F, -10.5F, 1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.202F, 0F, 0F, 0.202F, 0F, 0F, 0.202F, 0F, -1F, -0.202F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 433
		bodyModel[145].setRotationPoint(-57.75F, -10.5F, -2F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.1325F, -0.125F, 0F, -0.135F, -0.125F, 0F, 1.375F, -0.125F, 0F, -1.375F, -0.125F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 497
		bodyModel[146].setRotationPoint(-57.5F, -10F, 2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[147].setRotationPoint(-52.5F, -9F, 10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[148].setRotationPoint(-51.5F, -9F, 10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,-1F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 437
		bodyModel[149].setRotationPoint(-55F, -9F, 10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,-2.25F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, 2F, -1.25F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0F, 0F, -1F); // Box 438
		bodyModel[150].setRotationPoint(-57.5F, -9F, 7F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.61F, 0F, -0.5F, -0.61F, 0F, 0F, -0.03F, 0F, 0F, 1.41F, -0.5F, -1F, -0.61F, -0.5F, -1F, -0.61F, -0.5F, 0F, 1.41F, -0.5F, 0F); // Box 430
		bodyModel[151].setRotationPoint(-56.14F, -12F, 1F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.6F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.085F, 0F, 0F, -0.725F, 0F, 0F, 0.6F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.6F, 0F); // Box 208
		bodyModel[152].setRotationPoint(-55.75F, -13.1F, 0F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1.525F, 0.125F, 0F, -0.05F, -0.1F, -2.19F, -0.44F, -2.25F, -0.03F, -0.375F, -1.875F, -3F, -1.525F, 1.75F, 0F, -0.05F, 1.75F, -2.19F, -0.5F, 1.75F, 0F, -0.25F, 1.75F, -3F); // Box 438
		bodyModel[153].setRotationPoint(-56.5F, -11.75F, 7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1.375F, -0.125F, 0F, 1.375F, -0.125F, 0F, -0.135F, -0.125F, 0F, 0.135F, -0.125F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 445
		bodyModel[154].setRotationPoint(-57.5F, -10F, -7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.2F, -1.9F, 0F, -1F, -0.025F, 0F, -0.225F, -0.525F, 0F, -1.625F, -2.525F, 0F, -0.1175F, 1.525F, 0F, -1F, 1.525F, 0F, -0.225F, 1.525F, 0F, -1.625F, 1.525F, 0F); // Box 497
		bodyModel[155].setRotationPoint(-57.75F, -12.4F, 2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, -1F, 0F, -0.555F, -1F, 0F, 0.325F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.25F, 0F, 0.175F, 1.25F, 0F); // Box 457
		bodyModel[156].setRotationPoint(-44.5F, -21F, 6.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.335F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0.105F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[157].setRotationPoint(-44.5F, -19F, 9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.555F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, -0.335F, -1.2F, 0F, 0.175F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0.105F, 0.5F, 0F); // Box 459
		bodyModel[158].setRotationPoint(-44.5F, -20F, 8.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-2.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -1.18F, -0.31F, 0F, -1.25F, -0.31F, -2.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 1.18F, -0.31F, 0F, 1.25F, -0.31F); // Box 209
		bodyModel[159].setRotationPoint(-53.55F, -12.9F, 3.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.07F, 0.01F, 0.05F, 0F, 0.01F, 0.05F, -0.17F, -0.2F, 0F, -0.07F, -1.01F, 0F, 0.07F, 0.01F, 0.05F, 0F, 0.01F, 0.05F, 0.17F, -0.2F, 0F, 0.07F, -1.01F); // Box 209
		bodyModel[160].setRotationPoint(-53.55F, -11.72F, 9.2F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.07F, -1.01F, 0.05F, -0.17F, -0.2F, 0.05F, 0F, 0.01F, 0F, -0.07F, 0.01F, 0F, 0.07F, -1.01F, 0.05F, 0.17F, -0.2F, 0.05F, 0F, 0.01F, 0F, 0.07F, 0.01F); // Box 468
		bodyModel[161].setRotationPoint(-53.55F, -11.72F, -10.2F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.005F, -0.2435F, 0F, 0.42F, -0.005F, 0F, 0.42F, -0.5615F, -0.5F, 0.005F, -0.685F, -0.5F, 0.005F, 0.2435F, 0F, 0.42F, 0.005F, 0F, 0.42F, 0.5615F, -0.5F, 0.005F, 0.685F, -0.5F); // Box 209
		bodyModel[162].setRotationPoint(-54.97F, -12.56F, 3.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.005F, -0.125F, 0F, 0.42F, -0.0015F, 0F, 0.42F, -0.35F, 0.19F, -1.42F, -0.35F, 0.19F, 0.005F, 0.1265F, 0F, 0.42F, 0.0015F, 0F, 0.42F, 0.35F, 0.19F, -1.42F, 0.35F, 0.19F); // Box 209
		bodyModel[163].setRotationPoint(-54.97F, -12F, 7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.0935F, 0F, -0.455F, -0.005F, 0F, -0.455F, -0.445F, -0.5F, -0.545F, -0.445F, -0.5F, 0F, 0.0935F, 0F, -0.455F, 0.004F, 0F, -0.455F, 0.445F, -0.5F, -0.545F, 0.445F, -0.5F); // Box 209
		bodyModel[164].setRotationPoint(-55.52F, -12.32F, 3.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.005F, -0.685F, -0.5F, 0.42F, -0.5615F, -0.5F, 0.42F, -0.005F, 0F, 0.005F, -0.2435F, 0F, 0.005F, 0.685F, -0.5F, 0.42F, 0.5615F, -0.5F, 0.42F, 0.005F, 0F, 0.005F, 0.2435F, 0F); // Box 472
		bodyModel[165].setRotationPoint(-54.97F, -12.56F, -7.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.39F, 0.006F, -0.5F, -0.61F, 0.006F, -0.5F, -0.61F, -0.025F, 0F, -0.39F, -0.025F, 0F, 0F, -0.6F, -0.5F, -0.61F, -0.6F, -0.5F, -0.61F, -0.6F, 0F, -0.03F, -0.6F, 0F); // Box 430
		bodyModel[166].setRotationPoint(-56.14F, -12.4F, 1F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.094F, -0.5F, -1F, -0.094F, -0.5F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, -0.5F, -0.51F, -0.4F, -0.5F); // Box 430
		bodyModel[167].setRotationPoint(-56.75F, -12.5F, 0F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.03F, 0F, 0F, -0.61F, 0F, 0F, -0.61F, 0F, -0.5F, 0F, 0F, -0.5F, 1.41F, -0.5F, 0F, -0.61F, -0.5F, 0F, -0.61F, -0.5F, -1F, 1.41F, -0.5F, -1F); // Box 459
		bodyModel[168].setRotationPoint(-56.14F, -12F, -2F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.39F, -0.025F, 0F, -0.61F, -0.025F, 0F, -0.61F, 0.006F, -0.5F, -0.39F, 0.006F, -0.5F, -0.03F, -0.6F, 0F, -0.61F, -0.6F, 0F, -0.61F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 460
		bodyModel[169].setRotationPoint(-56.14F, -12.4F, -2F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.725F, -0.5F, 0.3F, 0.085F, -0.5F, 0.45F, 0F, 0F, -0.2325F, -0.875F, 0F, 0F, 0.6F, -0.5F, 0.3F, 0F, -0.5F, 0.45F, 0F, 0F, -0.2325F, 0.875F, 0F); // Box 208
		bodyModel[170].setRotationPoint(-55.75F, -13.1F, 1.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, -0.094F, -0.5F, 0F, -0.094F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.51F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 465
		bodyModel[171].setRotationPoint(-56.75F, -12.5F, -2F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.725F, 0F, 0.3F, 0.085F, 0F, 0.1F, 0.2F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0.6F, 0F); // Box 466
		bodyModel[172].setRotationPoint(-55.75F, -13.1F, -2F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.2325F, -0.875F, 0F, 0.45F, 0F, 0F, 0.3F, 0.085F, -0.5F, 0F, -0.725F, -0.5F, -0.2325F, 0.875F, 0F, 0.45F, 0F, 0F, 0.3F, 0F, -0.5F, 0F, 0.6F, -0.5F); // Box 467
		bodyModel[173].setRotationPoint(-55.75F, -13.1F, -3.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.345F, 0F, 0.05F, 0F, 0F, -2F, -1.25F, -0.31F, 0F, -1.25F, -0.31F, 0F, 0.345F, 0F, 0.05F, 0F, 0F, -2F, 1.25F, -0.31F, 0F, 1.25F, -0.31F); // Box 209
		bodyModel[174].setRotationPoint(-53.55F, -12.9F, 3.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -1.25F, -0.31F, 0.05F, -1.18F, -0.31F, 0.05F, 0F, 0F, -2.05F, 0F, 0F, 0F, 1.25F, -0.31F, 0.05F, 1.18F, -0.31F, 0.05F, 0F, 0F, -2.05F, 0F, 0F); // Box 470
		bodyModel[175].setRotationPoint(-53.55F, -12.9F, -9.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -1.25F, -0.31F, -2F, -1.25F, -0.31F, 0.05F, 0F, 0F, 0F, -0.345F, 0F, 0F, 1.25F, -0.31F, -2F, 1.25F, -0.31F, 0.05F, 0F, 0F, 0F, 0.345F, 0F); // Box 471
		bodyModel[176].setRotationPoint(-53.55F, -12.9F, -9.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1.2F, 0F, 0F, -0.8F, 0F, 0F, -0.15F, -1.625F, -0.5F, 0F, -1.55F, -0.5F, -1.2F, 0F, 0F, -0.8F, 0F, 0F, -0.15F, 1.625F, -0.5F, 0F, 1.55F, -0.5F); // Box 209
		bodyModel[177].setRotationPoint(-51.5F, -13.1F, 3.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -0.2F, 0F, -0.8F, 0F, 0F, -2F, -1.55F, -0.5F, 0F, -1.55F, -0.5F, 0F, 0.2F, 0F, -0.8F, 0F, 0F, -2F, 1.55F, -0.5F, 0F, 1.55F, -0.5F); // Box 209
		bodyModel[178].setRotationPoint(-51.5F, -13.1F, 3.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -1.55F, -0.5F, -0.15F, -1.625F, -0.5F, -0.8F, 0F, 0F, -1.2F, 0F, 0F, 0F, 1.55F, -0.5F, -0.15F, 1.625F, -0.5F, -0.8F, 0F, 0F, -1.2F, 0F, 0F); // Box 480
		bodyModel[179].setRotationPoint(-51.5F, -13.1F, -10.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -1.55F, -0.5F, -2F, -1.55F, -0.5F, -0.8F, 0F, 0F, 0F, -0.2F, 0F, 0F, 1.55F, -0.5F, -2F, 1.55F, -0.5F, -0.8F, 0F, 0F, 0F, 0.2F, 0F); // Box 481
		bodyModel[180].setRotationPoint(-51.5F, -13.1F, -10.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[181].setRotationPoint(-58.01F, -12.5F, 1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F); // Box 403
		bodyModel[182].setRotationPoint(-58.01F, -12.5F, 0F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[183].setRotationPoint(-58.01F, -10.5F, 1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[184].setRotationPoint(-58.01F, -9.5F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 489
		bodyModel[185].setRotationPoint(-58.01F, -12.5F, -2F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 490
		bodyModel[186].setRotationPoint(-58.01F, -12.5F, -2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F); // Box 491
		bodyModel[187].setRotationPoint(-58.01F, -10.5F, -2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[188].setRotationPoint(-58.01F, -9.5F, -2F);

		bodyModel[189].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front small top
		bodyModel[189].setRotationPoint(-57.25F, -10.5F, 0F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,-0.97F, 0F, 0F, 0.97F, 0F, 0F, 0.97F, 0F, 0F, -0.97F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[190].setRotationPoint(-59.7F, -7F, 3F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,-0.97F, 0F, 0F, 0.97F, 0F, 0F, 0.97F, 0F, 0F, -0.97F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[191].setRotationPoint(-59.7F, -7F, -3F);

		bodyModel[192].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Markerlight R type 3 FRONT
		bodyModel[192].setRotationPoint(-53.95F, -7.75F, 10.69F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.245F, -0.32F, 0F, -0.99F, -0.32F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0.035F, -0.32F, -0.5F, -0.99F, -0.32F, -0.5F, -0.01F, 0F, -0.5F, -0.01F); // Box 216
		bodyModel[193].setRotationPoint(-54.24F, -8.5F, 10F);

		bodyModel[194].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Markerlight L type 3 FRONT
		bodyModel[194].setRotationPoint(-53.95F, -7.75F, -10.69F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F); // Numberboard L type 3 FRONT
		bodyModel[195].setRotationPoint(-53.25F, -8.25F, -11.04F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F); // Numberboard R type 3 FRONT
		bodyModel[196].setRotationPoint(-53.25F, -8.25F, 10.99F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,-1F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F); // Box 517
		bodyModel[197].setRotationPoint(-55F, -9F, -11F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,-1.25F, 0F, -1F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, -2.25F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, -1F, 0F, 0F); // Box 518
		bodyModel[198].setRotationPoint(-57.5F, -9F, -8F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.01F, -0.32F, 0F, -0.01F, -0.32F, 0F, -0.99F, 0F, 0F, 0.245F, 0F, -0.5F, -0.01F, -0.32F, -0.5F, -0.01F, -0.32F, -0.5F, -0.95F, 0F, -0.5F, 0.035F); // Box 519
		bodyModel[199].setRotationPoint(-54.24F, -8.5F, -11F);

		bodyModel[200].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, -0.17F, -0.15F, 0F, -0.17F, -0.08F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.17F, -0.41F, -0.125F, -0.17F, -0.4F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 525
		bodyModel[200].setRotationPoint(-56.65F, -9.87F, 7.02F);
		bodyModel[200].rotateAngleY = -0.47298423F;

		bodyModel[201].addShapeBox(0F, 0F, -2F, 1, 2, 5, 0F,0F, -0.05F, -0.22F, -0.95F, -0.05F, -0.22F, -0.95F, -0.05F, -1.05F, 0F, -0.05F, -1.05F, 0F, -0.175F, -0.22F, -0.95F, -0.175F, -0.22F, -0.95F, -0.175F, -1.05F, 0F, -0.175F, -1.05F); // Numberboard R type 2 FRONT
		bodyModel[201].setRotationPoint(-56.7F, -9.87F, 7.04F);
		bodyModel[201].rotateAngleY = -0.47298423F;

		bodyModel[202].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, -0.08F, 0F, 0F, -0.15F, 0F, -0.17F, 0F, 0F, -0.17F, 0F, -0.125F, 0F, -0.4F, -0.125F, 0F, -0.41F, -0.125F, -0.17F, 0F, -0.125F, -0.17F); // Box 524
		bodyModel[202].setRotationPoint(-56.65F, -9.87F, -7.02F);
		bodyModel[202].rotateAngleY = 0.47298423F;

		bodyModel[203].addShapeBox(0F, 0F, -2F, 1, 2, 5, 0F,0F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -1.22F, 0F, -0.05F, -1.22F, 0F, -0.175F, -0.05F, -0.95F, -0.175F, -0.05F, -0.95F, -0.175F, -1.22F, 0F, -0.175F, -1.22F); // Numberboard L Type 2 FRONT
		bodyModel[203].setRotationPoint(-56.7F, -9.87F, -7.04F);
		bodyModel[203].rotateAngleY = 0.47298423F;

		bodyModel[204].addShapeBox(-0.79F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F); // Box 353 markerlight type 3 FRONT
		bodyModel[204].setRotationPoint(-56.72F, -6F, 7.02F);
		bodyModel[204].rotateAngleY = -0.47298423F;

		bodyModel[205].addShapeBox(-0.79F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F); // Box 545 markerlight type 3 FRONT
		bodyModel[205].setRotationPoint(-56.72F, -6F, -7.02F);
		bodyModel[205].rotateAngleY = 0.47298423F;

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[206].setRotationPoint(-60F, 1F, -3F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.55F, 0F, -0.15F, 0.48F, 0F, 0.19F, -2F, -2F, 0F, -1.75F, -2F, 0F, 1F, 0F, -0.9F, 1F, 0F, 0.19F, 1F, -2F, 0F, 1F, -2F); // Box 60
		bodyModel[207].setRotationPoint(-51.5F, -11F, 10F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1.45F, 0F, 0.81F, 0.5F, -0.1F, 0F, 0.5F, -2.4F, -2F, -1.06F, -2.15F, -3.03F, -1.45F, 1.65F, 0.82F, 0.5F, 1.65F, 0F, 0.5F, 1.65F, -2F, -1F, 1.65F, -3F); // Box 437
		bodyModel[208].setRotationPoint(-55F, -11.65F, 10F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.375F, -1.875F, -2F, -0.44F, -2.25F, 0.97F, -0.05F, -0.1F, -3.19F, -1.525F, 0.125F, -1F, -0.25F, 1.75F, -2F, -0.5F, 1.75F, 1F, -0.05F, 1.75F, -3.19F, -1.525F, 1.75F, -1F); // Box 554
		bodyModel[209].setRotationPoint(-56.5F, -11.75F, -9F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-1.625F, -2.525F, 0F, -0.225F, -0.525F, 0F, -1F, -0.025F, 0F, -0.2F, -1.9F, 0F, -1.625F, 1.525F, 0F, -0.225F, 1.525F, 0F, -1F, 1.525F, 0F, -0.1175F, 1.525F, 0F); // Box 555
		bodyModel[210].setRotationPoint(-57.75F, -12.4F, -7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.42F, -0.35F, 0.19F, 0.42F, -0.35F, 0.19F, 0.42F, -0.0015F, 0F, 0.005F, -0.125F, 0F, -1.42F, 0.35F, 0.19F, 0.42F, 0.35F, 0.19F, 0.42F, 0.0015F, 0F, 0.005F, 0.1265F, 0F); // Box 556
		bodyModel[211].setRotationPoint(-54.97F, -12F, -9F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.545F, -0.445F, -0.5F, -0.455F, -0.445F, -0.5F, -0.455F, -0.005F, 0F, 0F, -0.0935F, 0F, -0.545F, 0.445F, -0.5F, -0.455F, 0.445F, -0.5F, -0.455F, 0.004F, 0F, 0F, 0.0935F, 0F); // Box 557
		bodyModel[212].setRotationPoint(-55.52F, -12.32F, -7.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1.75F, -2F, 0.19F, -2F, -2F, -0.15F, 0.48F, 0F, 0F, 0.55F, 0F, 0F, 1F, -2F, 0.19F, 1F, -2F, -0.9F, 1F, 0F, 0F, 1F, 0F); // Box 558
		bodyModel[213].setRotationPoint(-51.5F, -11F, -13F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1.06F, -2.15F, -3.03F, 0.5F, -2.4F, -2F, 0.5F, -0.1F, 0F, -1.45F, 0F, 0.81F, -1F, 1.65F, -3F, 0.5F, 1.65F, -2F, 0.5F, 1.65F, 0F, -1.45F, 1.65F, 0.82F); // Box 559
		bodyModel[214].setRotationPoint(-55F, -11.65F, -13F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1.35F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[215].setRotationPoint(-49.15F, -20F, -4F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1.6F, -1.5F, 0F, 0.65F, -1.5F, 0F, 0.65F, 0F, 0F, -1F, 0F, 0F, -0.6F, 1.5F, 0F, 0.65F, 1.5F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[216].setRotationPoint(-48.8F, -20F, -9.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.05F, -0.5F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0.125F, -0.5F, 0.05F, 0.125F, -0.5F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 562
		bodyModel[217].setRotationPoint(-48.2F, -18.5F, -10.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, 0F, 0F, -0.715F, 0F, 0F, 0.535F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.675F, 0F, 0F); // Box 563
		bodyModel[218].setRotationPoint(-44.5F, -22F, -3.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.715F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.675F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 564
		bodyModel[219].setRotationPoint(-44.5F, -22F, -2.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.555F, -1F, 0F, 0F, -1F, 0F, 0F, -0.335F, 0F, -1F, -0.335F, 0F, 0.175F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.75F, 0F, 0.325F, 0.75F, 0F); // Box 565
		bodyModel[220].setRotationPoint(-44.5F, -21F, -8.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.2F, -0.5F, -0.335F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0.105F, -1.5F, -0.5F); // Box 566
		bodyModel[221].setRotationPoint(-44.5F, -19F, -11F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.335F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, -0.555F, 0F, 0F, 0.105F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0.175F, 0.25F, 0F); // Box 567
		bodyModel[222].setRotationPoint(-44.5F, -20F, -9.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 2, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[223].setRotationPoint(52.5F, 0F, -10F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[224].setRotationPoint(55F, 0F, -7F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[225].setRotationPoint(52F, 0F, -11F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[226].setRotationPoint(54.5F, 0F, -10F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[227].setRotationPoint(59F, 3F, -1.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[228].setRotationPoint(57.5F, 0F, -7F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F); // Box 495
		bodyModel[229].setRotationPoint(52F, 0F, 10F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F); // Box 496
		bodyModel[230].setRotationPoint(54.5F, 0F, 7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[231].setRotationPoint(57.5F, 0F, 2F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,0F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[232].setRotationPoint(52.5F, 2F, -3.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 2
		bodyModel[233].setRotationPoint(49.5F, 2F, -3.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0.425F, 0F, 0F, 0.425F, 0F, 0F, -0.425F, 0F, 0F); // Box 0
		bodyModel[234].setRotationPoint(58F, 2F, -2F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0F); // Box 565
		bodyModel[235].setRotationPoint(59F, 1F, 0F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[236].setRotationPoint(57.5F, 0F, -2F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 0
		bodyModel[237].setRotationPoint(49.5F, 2F, 10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 0F); // Box 0
		bodyModel[238].setRotationPoint(52F, 2F, 10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.425F, 0F, 0F, 0.425F, 0F, 0F, -1.285F, 0F, 0F, 1.07F, 0F, -0.5F); // Box 0
		bodyModel[239].setRotationPoint(58F, 2F, 2F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-0.5F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, -0.65F, 0F, 0.35F, 0.18F, 0F, -1F, -0.5F, 0F, 2F); // Box 496
		bodyModel[240].setRotationPoint(54.5F, 2F, 7F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[241].setRotationPoint(59F, 1F, 0F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 506
		bodyModel[242].setRotationPoint(59F, 1F, -3F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.1125F, 0F, -1.22F, -0.65F, 0F, 0.355F, 0.18F, 0F, -1F, -0.385F, 0F, 1F, -1.47F, -0.5F, 0.465F, -0.53F, -0.5F, 0.465F, 0.23F, -0.5F, -1F, -2.23F, -0.5F, -1F); // Box 496
		bodyModel[243].setRotationPoint(55.5F, 7F, 7F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 445
		bodyModel[244].setRotationPoint(49.5F, 2F, -11F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F); // Box 446
		bodyModel[245].setRotationPoint(52F, 2F, -11F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.07F, 0F, -0.425F, -1.285F, 0F, 0F, 0.425F, 0F, 0F, -0.425F, 0F, 0F); // Box 447
		bodyModel[246].setRotationPoint(58F, 2F, -7F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-0.5F, 0F, 2F, 0F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0.18F, 0F, -1F, -0.65F, 0F, 0.35F, -0.5F, 0F, -2F); // Box 448
		bodyModel[247].setRotationPoint(54.5F, 2F, -8F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.385F, 0F, 1F, 0.18F, 0F, -1F, -0.65F, 0F, 0.355F, -0.1125F, 0F, -1.22F, -2.23F, -0.5F, -1F, 0.23F, -0.5F, -1F, -0.53F, -0.5F, 0.465F, -1.47F, -0.5F, 0.465F); // Box 449
		bodyModel[248].setRotationPoint(55.5F, 7F, -8F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[249].setRotationPoint(59F, 1F, -3F);

		bodyModel[250].addBox(0F, 0F, 0F, 105, 2, 22, 0F); // Box 0
		bodyModel[250].setRotationPoint(-52.5F, 0F, -11F);

		bodyModel[251].addBox(0F, 0F, 0F, 115, 1, 12, 0F); // Box 0
		bodyModel[251].setRotationPoint(-57.5F, 2F, -6F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 4, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 120
		bodyModel[252].setRotationPoint(39.5F, 2F, -11F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 4, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 481
		bodyModel[253].setRotationPoint(39.5F, 2F, 11F);

		bodyModel[254].addBox(0F, 0F, 0F, 5, 12, 1, 0F); // Box 0
		bodyModel[254].setRotationPoint(43.5F, -12F, -11F);

		bodyModel[255].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 0
		bodyModel[255].setRotationPoint(39.5F, -6F, -11F);

		bodyModel[256].addBox(0F, 0F, 0F, 5, 12, 1, 0F); // Box 60
		bodyModel[256].setRotationPoint(43.5F, -12F, 10F);

		bodyModel[257].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 61
		bodyModel[257].setRotationPoint(39.5F, -6F, 10F);

		bodyModel[258].addBox(0F, 0F, 0F, 0, 18, 1, 0F); // Box 79
		bodyModel[258].setRotationPoint(44F, -15F, -12F);

		bodyModel[259].addBox(0F, 0F, 0F, 0, 18, 1, 0F); // Box 80
		bodyModel[259].setRotationPoint(39F, -15F, -12F);

		bodyModel[260].addBox(0F, 0F, 0F, 0, 18, 1, 0F); // Box 108
		bodyModel[260].setRotationPoint(44F, -15F, 11F);

		bodyModel[261].addBox(0F, 0F, 0F, 0, 18, 1, 0F); // Box 109
		bodyModel[261].setRotationPoint(39F, -15F, 11F);

		bodyModel[262].addShapeBox(0F, 0F, -0.5F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Rear side door L
		bodyModel[262].setRotationPoint(39.5F, -16F, -10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Rear side door R
		bodyModel[263].setRotationPoint(39.5F, -16F, 10F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[264].setRotationPoint(39F, 2F, -11F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[265].setRotationPoint(43.5F, 2F, -11F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.985F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[266].setRotationPoint(48.5F, -12F, 10F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[267].setRotationPoint(51.5F, -9F, -11F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[268].setRotationPoint(48.5F, -9F, -11F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.985F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[269].setRotationPoint(48.5F, -12F, -11F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,1.115F, 0F, 0F, -1.115F, 0F, 0F, -1.115F, 0F, 0F, 1.115F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[270].setRotationPoint(58F, -8F, -2F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 497
		bodyModel[271].setRotationPoint(57.5F, -9F, 2F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 463
		bodyModel[272].setRotationPoint(57.5F, -9F, -7F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[273].setRotationPoint(51.5F, -9F, 10F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[274].setRotationPoint(48.5F, -9F, 10F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0.5F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 0F); // Box 437
		bodyModel[275].setRotationPoint(52F, -9F, 10F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0.5F, 0F, -2F, -2.25F, 0F, 0F, -1.25F, 0F, -1F, 0.5F, 0F, 2F, -0.5F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 2F); // Box 438
		bodyModel[276].setRotationPoint(54.5F, -9F, 7F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0.97F, 0F, 0F, -0.97F, 0F, 0F, -0.97F, 0F, 0F, 0.97F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[277].setRotationPoint(58.7F, -7F, 3F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0.97F, 0F, 0F, -0.97F, 0F, 0F, -0.97F, 0F, 0F, 0.97F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[278].setRotationPoint(58.7F, -7F, -3F);

		bodyModel[279].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Markerlight R type 3 BACK
		bodyModel[279].setRotationPoint(54F, -7.75F, 10.69F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.99F, 0F, 0F, 0.245F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.99F, 0F, -0.5F, 0.035F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F); // Box 216
		bodyModel[280].setRotationPoint(51.26F, -8.5F, 10F);

		bodyModel[281].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Markerlight L type 3 BACK
		bodyModel[281].setRotationPoint(54F, -7.75F, -10.69F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F); // Numberboard L type 3 BACK
		bodyModel[282].setRotationPoint(51.75F, -8.25F, -11.04F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F); // Numberboard R type 3 BACK
		bodyModel[283].setRotationPoint(51.75F, -8.25F, 10.99F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F); // Box 517
		bodyModel[284].setRotationPoint(52F, -9F, -11F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0.5F, 0F, 2F, -1.25F, 0F, -1F, -2.25F, 0F, 0F, 0.5F, 0F, -2F, -0.5F, 0F, 2F, 0F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, -2F); // Box 518
		bodyModel[285].setRotationPoint(54.5F, -9F, -8F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.32F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.245F, -0.32F, 0F, -0.99F, -0.32F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, 0.035F, -0.32F, -0.5F, -0.95F); // Box 519
		bodyModel[286].setRotationPoint(51.26F, -8.5F, -11F);

		bodyModel[287].addShapeBox(-1.04F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F); // Box 353 markerlight type 3 BACK
		bodyModel[287].setRotationPoint(56.81F, -6F, 7.02F);
		bodyModel[287].rotateAngleY = 0.47298423F;

		bodyModel[288].addShapeBox(-1.04F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F); // Box 545 markerlight type 3 BACK
		bodyModel[288].setRotationPoint(56.81F, -6F, -7.02F);
		bodyModel[288].rotateAngleY = -0.47298423F;

		bodyModel[289].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[289].setRotationPoint(39.5F, -17F, -11F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[290].setRotationPoint(39.5F, -17F, 10F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[291].setRotationPoint(43.5F, -16F, -11F);

		bodyModel[292].addBox(0F, 0F, 0F, 3, 6, 20, 0F); // Box 0
		bodyModel[292].setRotationPoint(42.5F, -6F, -10F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[293].setRotationPoint(38.5F, -17F, -10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[294].setRotationPoint(38.5F, -19F, -10F);

		bodyModel[295].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 0
		bodyModel[295].setRotationPoint(41.5F, -19F, -3F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[296].setRotationPoint(38.5F, -17F, 8F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[297].setRotationPoint(38.5F, -19F, 8F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[298].setRotationPoint(43.5F, -16F, 10F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.51F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, -0.5F, -0.51F, -0.01F, -0.5F, -0.51F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, -0.5F, -0.51F, -0.01F, -0.5F); // Box 0 cull
		bodyModel[299].setRotationPoint(44F, -16F, -10.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.51F, -0.01F, -0.5F, -0.01F, -0.01F, -0.5F, -0.01F, -0.01F, 0F, -0.51F, -0.01F, 0F, -0.51F, -0.01F, -0.5F, -0.01F, -0.01F, -0.5F, -0.01F, -0.01F, 0F, -0.51F, -0.01F, 0F); // Box 346 cull
		bodyModel[300].setRotationPoint(44F, -16F, 9.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0.49F, -0.01F, 0F, 0.49F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 0 cull
		bodyModel[301].setRotationPoint(47F, -16F, -10.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0.49F, -0.01F, -0.5F, 0.49F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 348
		bodyModel[302].setRotationPoint(47F, -16F, 9.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.255F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.08F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[303].setRotationPoint(46.5F, -17F, 10F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.255F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.08F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[304].setRotationPoint(46.5F, -17F, -11F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,1.075F, 0F, 0F, -1.075F, 0F, 0F, -1.075F, 0F, 0F, 1.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[305].setRotationPoint(48.5F, -16F, -12F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,1.075F, 0F, 0F, -1.075F, 0F, 0F, -1.075F, 0F, 0F, 1.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[306].setRotationPoint(48.5F, -16F, 11F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 105
		bodyModel[307].setRotationPoint(44.5F, -16F, 11F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, -0.5F, 0F, -0.075F, -0.5F, 0F, -0.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.075F, 0.5F, 0F, -0.075F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[308].setRotationPoint(44.5F, -16F, -12F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.35F, 0F, 0F, 0.35F, 0F, 0F, -1.5F, -0.3F, -0.5F, 1.5F, -0.3F, -0.5F, 1.15F, -0.1F, 0F, -1.15F, -0.1F, 0F); // Box 207
		bodyModel[309].setRotationPoint(48.15F, -19F, -0.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.375F, 0F, 0F, 0.375F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.63F, 0F, 0F, 1.625F, 0F, 0F, 0.62F, 0F, 0F, -1.62F, 0F, 0F); // Box 529
		bodyModel[310].setRotationPoint(47.15F, -17F, 10F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1.35F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 208
		bodyModel[311].setRotationPoint(48.15F, -20F, 0F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.65F, 0F, 0F, -1F, 0F, 0F, -1.6F, -1.5F, 0F, 0.65F, -1.5F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, -0.6F, 1.5F, 0F, 0.65F, 1.5F, 0F); // Box 209
		bodyModel[312].setRotationPoint(47.8F, -20F, 3.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, 0F, 0F, -1F, 0F, 0F, -1.05F, -0.5F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0.125F, -0.5F, 0.05F, 0.125F, -0.5F); // Box 208
		bodyModel[313].setRotationPoint(47.2F, -18.5F, 9.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[314].setRotationPoint(47.15F, -18F, 10F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -1.625F, -0.5F, 0.65F, -1.625F, -0.5F, -1.5F, -0.1F, 0F, 1.5F, -0.1F, 0F, 0.85F, 1.525F, -0.5F, -0.85F, 1.525F, -0.5F); // Box 209
		bodyModel[315].setRotationPoint(47.8F, -19F, 3.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 429
		bodyModel[316].setRotationPoint(47.15F, -18F, -11F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.15F, -0.1F, 0F, 1.15F, -0.1F, 0F, 1.5F, -0.3F, -0.5F, -1.5F, -0.3F, -0.5F); // Box 430
		bodyModel[317].setRotationPoint(48.15F, -19F, -3.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0.65F, -1.625F, -0.5F, -0.65F, -1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 1.525F, -0.5F, 0.85F, 1.525F, -0.5F, 1.5F, -0.1F, 0F, -1.5F, -0.1F, 0F); // Box 431
		bodyModel[318].setRotationPoint(47.8F, -19F, -10.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0.01F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.54F, 0F, 0F, 0.625F, 0F, 0F, -0.46F, 0F, 0F, -0.54F, 0F, 0F); // Box 529
		bodyModel[319].setRotationPoint(48.77F, -11F, 10F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, -1.62F, 0F, 0F, 0.62F, 0F, 0F, 1.625F, 0F, 0F, -1.63F, 0F, 0F); // Box 434
		bodyModel[320].setRotationPoint(47.15F, -17F, -11F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.54F, 0F, 0F, -0.46F, 0F, 0F, 0.625F, 0F, 0F, -0.54F, 0F, 0F); // Box 436
		bodyModel[321].setRotationPoint(48.77F, -11F, -11F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, -0.5F, -1.35F, 0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 560
		bodyModel[322].setRotationPoint(48.15F, -20F, -4F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.65F, -1.5F, 0F, -1.6F, -1.5F, 0F, -1F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 1.5F, 0F, -0.6F, 1.5F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 561
		bodyModel[323].setRotationPoint(47.8F, -20F, -9.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, -0.5F, -0.5F, -1.05F, -0.5F, -0.5F, -1F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.125F, -0.5F, -0.05F, 0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		bodyModel[324].setRotationPoint(47.2F, -18.5F, -10.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[325].setRotationPoint(41.5F, -20F, -3.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -1.5F, 0F, -0.35F, -1.5F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -0.35F, 1.5F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[326].setRotationPoint(43.5F, -20F, -9.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 88
		bodyModel[327].setRotationPoint(43.5F, -20F, 3.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, -0.35F, -1F, 0F, -0.35F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[328].setRotationPoint(43.5F, -18F, -11F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0.5F, -0.5F, -0.35F, 0.5F, -0.5F, -0.35F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[329].setRotationPoint(43.5F, -18F, 9F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.715F, 0F, 0F, -1F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, 0F, 0F, 0.675F, 0F, 0F, 0.535F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[330].setRotationPoint(43.5F, -22F, 2.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.715F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0.675F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[331].setRotationPoint(43.5F, -22F, -0.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,1F, -0.335F, 0F, -2F, -0.335F, 0F, -2F, -1.335F, 0F, 1F, -1.335F, 0F, 1F, 0F, 0F, -0.465F, 0F, 0F, -0.675F, 0.75F, 0F, 1F, 0.75F, 0F); // Box 364
		bodyModel[332].setRotationPoint(44.5F, -22F, 3.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,1F, -1.335F, 0F, -2F, -1.335F, 0F, -2F, -0.335F, 0F, 1F, -0.335F, 0F, 1F, 0.75F, 0F, -0.675F, 0.75F, 0F, -0.465F, 0F, 0F, 1F, 0F, 0F); // Box 384
		bodyModel[333].setRotationPoint(44.5F, -22F, -6.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[334].setRotationPoint(47F, -21F, 0.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[335].setRotationPoint(45F, -22F, 0.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[336].setRotationPoint(45.5F, -21F, -1.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[337].setRotationPoint(45.5F, -22F, -1.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.335F, 0F, -1F, -0.335F, 0F, -0.555F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0.325F, 0.75F, 0F, 0.175F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 457
		bodyModel[338].setRotationPoint(43.5F, -21F, 6.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.2F, -0.5F, -0.335F, -0.2F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, -0.5F, 0.105F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[339].setRotationPoint(43.5F, -19F, 9F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.555F, 0F, 0F, -0.335F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.25F, 0F, 0.175F, 0.25F, 0F, 0.105F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 459
		bodyModel[340].setRotationPoint(43.5F, -20F, 8.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.335F, 0F, -1F, -0.335F, 0F, -0.715F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.535F, 0F, 0F, 0.675F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[341].setRotationPoint(43.5F, -22F, -3.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.715F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.675F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 564
		bodyModel[342].setRotationPoint(43.5F, -22F, -2.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.555F, -1F, 0F, -1F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, 1.25F, 0F, 0.175F, 1.25F, 0F, 0.325F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 565
		bodyModel[343].setRotationPoint(43.5F, -21F, -8.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, -0.335F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.105F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 566
		bodyModel[344].setRotationPoint(43.5F, -19F, -11F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.2F, 0F, -0.335F, -1.2F, 0F, -0.555F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.105F, 0.5F, 0F, 0.175F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 567
		bodyModel[345].setRotationPoint(43.5F, -20F, -9.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[346].setRotationPoint(41.5F, -21F, -8.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1.335F, 0F, 0F, -1.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 0
		bodyModel[347].setRotationPoint(39.5F, -19F, -9.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 361
		bodyModel[348].setRotationPoint(41.5F, -21F, 3.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.335F, 0F, 0F, -1.335F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 362
		bodyModel[349].setRotationPoint(39.5F, -19F, 8.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.335F, 0.5F, 0F, -0.335F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 0
		bodyModel[350].setRotationPoint(39.5F, -18F, -11F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.335F, 0.5F, 0F, -0.335F, 0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 364
		bodyModel[351].setRotationPoint(39.5F, -18F, 10F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F); // Box 0
		bodyModel[352].setRotationPoint(56.75F, -9F, -2F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.07F, -0.5F, 0F, 0F, -0.5F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F); // Box 0
		bodyModel[353].setRotationPoint(56.75F, -9F, -1F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F); // Box 430
		bodyModel[354].setRotationPoint(56.75F, -9F, 1F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0.07F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F); // Box 431
		bodyModel[355].setRotationPoint(56.75F, -9F, 0F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.202F, 0F, -1F, -0.202F, 0F, -1F, -0.202F, 0F, 0F, 0.202F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		bodyModel[356].setRotationPoint(56.75F, -10.5F, 1F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.202F, 0F, 0F, -0.202F, 0F, 0F, -0.202F, 0F, -1F, 0.202F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 433
		bodyModel[357].setRotationPoint(56.75F, -10.5F, -2F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.135F, -0.125F, 0F, 0.1325F, -0.125F, 0F, -1.375F, -0.125F, 0F, 1.375F, -0.125F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F); // Box 497
		bodyModel[358].setRotationPoint(56.5F, -10F, 2F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.05F, -0.1F, -2.19F, -1.525F, 0.125F, 0F, -0.375F, -1.875F, -3F, -0.44F, -2.25F, -0.03F, -0.05F, 1.75F, -2.19F, -1.525F, 1.75F, 0F, -0.25F, 1.75F, -3F, -0.5F, 1.75F, 0F); // Box 438
		bodyModel[359].setRotationPoint(53.5F, -11.75F, 7F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,1.375F, -0.125F, 0F, -1.375F, -0.125F, 0F, 0.135F, -0.125F, 0F, -0.135F, -0.125F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 445
		bodyModel[360].setRotationPoint(56.5F, -10F, -7F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-1F, -0.025F, 0F, -0.2F, -1.9F, 0F, -1.625F, -2.525F, 0F, -0.225F, -0.525F, 0F, -1F, 1.525F, 0F, -0.1175F, 1.525F, 0F, -1.625F, 1.525F, 0F, -0.225F, 1.525F, 0F); // Box 497
		bodyModel[361].setRotationPoint(54.75F, -12.4F, 2F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.15F, 0.48F, 0F, 0F, 0.55F, 0F, 0F, -1.75F, -2F, 0.19F, -2F, -2F, -0.9F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0.19F, 1F, -2F); // Box 60
		bodyModel[362].setRotationPoint(49.5F, -11F, 10F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.5F, -0.1F, 0F, -1.45F, 0F, 0.81F, -1.06F, -2.15F, -3.03F, 0.5F, -2.4F, -2F, 0.5F, 1.65F, 0F, -1.45F, 1.65F, 0.82F, -1F, 1.65F, -3F, 0.5F, 1.65F, -2F); // Box 437
		bodyModel[363].setRotationPoint(52F, -11.65F, 10F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.44F, -2.25F, 0.97F, -0.375F, -1.875F, -2F, -1.525F, 0.125F, -1F, -0.05F, -0.1F, -3.19F, -0.5F, 1.75F, 1F, -0.25F, 1.75F, -2F, -1.525F, 1.75F, -1F, -0.05F, 1.75F, -3.19F); // Box 554
		bodyModel[364].setRotationPoint(53.5F, -11.75F, -9F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.225F, -0.525F, 0F, -1.625F, -2.525F, 0F, -0.2F, -1.9F, 0F, -1F, -0.025F, 0F, -0.225F, 1.525F, 0F, -1.625F, 1.525F, 0F, -0.1175F, 1.525F, 0F, -1F, 1.525F, 0F); // Box 555
		bodyModel[365].setRotationPoint(54.75F, -12.4F, -7F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.19F, -2F, -2F, 0F, -1.75F, -2F, 0F, 0.55F, 0F, -0.15F, 0.48F, 0F, 0.19F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, -0.9F, 1F, 0F); // Box 558
		bodyModel[366].setRotationPoint(49.5F, -11F, -13F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.5F, -2.4F, -2F, -1.06F, -2.15F, -3.03F, -1.45F, 0F, 0.81F, 0.5F, -0.1F, 0F, 0.5F, 1.65F, -2F, -1F, 1.65F, -3F, -1.45F, 1.65F, 0.82F, 0.5F, 1.65F, 0F); // Box 559
		bodyModel[367].setRotationPoint(52F, -11.65F, -13F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[368].setRotationPoint(57F, -12.5F, 1F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[369].setRotationPoint(57F, -12.5F, 0F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[370].setRotationPoint(57F, -12.5F, -2F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[371].setRotationPoint(57F, -12.5F, -2F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[372].setRotationPoint(57F, -10.5F, 1F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[373].setRotationPoint(57F, -10.5F, -2F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[374].setRotationPoint(57F, -9.5F, 0F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[375].setRotationPoint(57F, -9.5F, -2F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 167
		bodyModel[376].setRotationPoint(55.75F, -10.5F, 0F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[377].setRotationPoint(55.75F, -10.5F, -2F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[378].setRotationPoint(55.75F, -12.5F, -2F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[379].setRotationPoint(55.75F, -12.5F, 0F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[380].setRotationPoint(58.01F, -12.5F, 1F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F); // Box 403
		bodyModel[381].setRotationPoint(58.01F, -12.5F, 0F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[382].setRotationPoint(58.01F, -10.5F, 1F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[383].setRotationPoint(58.01F, -9.5F, 0F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 489
		bodyModel[384].setRotationPoint(58.01F, -12.5F, -2F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 490
		bodyModel[385].setRotationPoint(58.01F, -12.5F, -2F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F); // Box 491
		bodyModel[386].setRotationPoint(58.01F, -10.5F, -2F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[387].setRotationPoint(58.01F, -9.5F, -2F);

		bodyModel[388].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight back 2beam top A
		bodyModel[388].setRotationPoint(57F, -10.5F, 0F);

		bodyModel[389].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight back 2beam top A
		bodyModel[389].setRotationPoint(57F, -10.5F, 0F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight back big top
		bodyModel[390].setRotationPoint(57F, -11.75F, -1.25F);

		bodyModel[391].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight back 2beam top B
		bodyModel[391].setRotationPoint(57F, -10.5F, 0F);
		bodyModel[391].rotateAngleX = 1.57079633F;

		bodyModel[392].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight back 2beam top B
		bodyModel[392].setRotationPoint(57F, -10.5F, 0F);
		bodyModel[392].rotateAngleX = 1.57079633F;

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.61F, 0F, -0.5F, 0F, 0F, -0.5F, -0.03F, 0F, 0F, -0.61F, 0F, 0F, -0.61F, -0.5F, -1F, 1.41F, -0.5F, -1F, 1.41F, -0.5F, 0F, -0.61F, -0.5F, 0F); // Box 430
		bodyModel[393].setRotationPoint(55.14F, -12F, 1F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.61F, 0.006F, -0.5F, -0.39F, 0.006F, -0.5F, -0.39F, -0.025F, 0F, -0.61F, -0.025F, 0F, -0.61F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, -0.03F, -0.6F, 0F, -0.61F, -0.6F, 0F); // Box 430
		bodyModel[394].setRotationPoint(55.14F, -12.4F, 1F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.094F, -0.5F, 0F, -0.094F, -0.5F, 0F, -1F, 0F, -1F, -1F, 0F, -0.51F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 430
		bodyModel[395].setRotationPoint(55.75F, -12.5F, 0F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.61F, 0F, 0F, -0.03F, 0F, 0F, 0F, 0F, -0.5F, -0.61F, 0F, -0.5F, -0.61F, -0.5F, 0F, 1.41F, -0.5F, 0F, 1.41F, -0.5F, -1F, -0.61F, -0.5F, -1F); // Box 459
		bodyModel[396].setRotationPoint(55.14F, -12F, -2F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.61F, -0.025F, 0F, -0.39F, -0.025F, 0F, -0.39F, 0.006F, -0.5F, -0.61F, 0.006F, -0.5F, -0.61F, -0.6F, 0F, -0.03F, -0.6F, 0F, 0F, -0.6F, -0.5F, -0.61F, -0.6F, -0.5F); // Box 460
		bodyModel[397].setRotationPoint(55.14F, -12.4F, -2F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.094F, -0.5F, -1F, -0.094F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.5F, -0.51F, -0.4F, -0.5F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 465
		bodyModel[398].setRotationPoint(55.75F, -12.5F, -2F);

		bodyModel[399].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight back small top
		bodyModel[399].setRotationPoint(57F, -10.5F, 0F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0.1F, 0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.725F, 0F, 0.3F, 0.085F, 0F, 0.1F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0.3F, 0F, 0F); // Box 208
		bodyModel[400].setRotationPoint(50.75F, -13.1F, 0F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0.05F, 0F, 0F, -2.05F, 0F, 0F, 0F, -1.25F, -0.31F, 0.05F, -1.18F, -0.31F, 0.05F, 0F, 0F, -2.05F, 0F, 0F, 0F, 1.25F, -0.31F, 0.05F, 1.18F, -0.31F); // Box 209
		bodyModel[401].setRotationPoint(51.55F, -12.9F, 3.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.05F, 0F, 0.01F, 0F, -0.07F, 0.01F, 0F, -0.07F, -1.01F, 0.05F, -0.17F, -0.2F, 0.05F, 0F, 0.01F, 0F, 0.07F, 0.01F, 0F, 0.07F, -1.01F, 0.05F, 0.17F, -0.2F); // Box 209
		bodyModel[402].setRotationPoint(51.55F, -11.72F, 9.2F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.05F, -0.17F, -0.2F, 0F, -0.07F, -1.01F, 0F, -0.07F, 0.01F, 0.05F, 0F, 0.01F, 0.05F, 0.17F, -0.2F, 0F, 0.07F, -1.01F, 0F, 0.07F, 0.01F, 0.05F, 0F, 0.01F); // Box 468
		bodyModel[403].setRotationPoint(51.55F, -11.72F, -10.2F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.42F, -0.005F, 0F, 0.005F, -0.2435F, 0F, 0.005F, -0.685F, -0.5F, 0.42F, -0.5615F, -0.5F, 0.42F, 0.005F, 0F, 0.005F, 0.2435F, 0F, 0.005F, 0.685F, -0.5F, 0.42F, 0.5615F, -0.5F); // Box 209
		bodyModel[404].setRotationPoint(53.97F, -12.56F, 3.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.42F, -0.0015F, 0F, 0.005F, -0.125F, 0F, -1.42F, -0.35F, 0.19F, 0.42F, -0.35F, 0.19F, 0.42F, 0.0015F, 0F, 0.005F, 0.1265F, 0F, -1.42F, 0.35F, 0.19F, 0.42F, 0.35F, 0.19F); // Box 209
		bodyModel[405].setRotationPoint(53.97F, -12F, 7F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.455F, -0.005F, 0F, 0F, -0.0935F, 0F, -0.545F, -0.445F, -0.5F, -0.455F, -0.445F, -0.5F, -0.455F, 0.004F, 0F, 0F, 0.0935F, 0F, -0.545F, 0.445F, -0.5F, -0.455F, 0.445F, -0.5F); // Box 209
		bodyModel[406].setRotationPoint(54.52F, -12.32F, 3.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.42F, -0.5615F, -0.5F, 0.005F, -0.685F, -0.5F, 0.005F, -0.2435F, 0F, 0.42F, -0.005F, 0F, 0.42F, 0.5615F, -0.5F, 0.005F, 0.685F, -0.5F, 0.005F, 0.2435F, 0F, 0.42F, 0.005F, 0F); // Box 472
		bodyModel[407].setRotationPoint(53.97F, -12.56F, -7.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0.3F, 0.085F, -0.5F, 0F, -0.725F, -0.5F, -0.2325F, -0.875F, 0F, 0.45F, 0F, 0F, 0.3F, 0F, -0.5F, 0F, 0.6F, -0.5F, -0.2325F, 0.875F, 0F, 0.45F, 0F, 0F); // Box 208
		bodyModel[408].setRotationPoint(50.75F, -13.1F, 1.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0.3F, 0.085F, 0F, 0F, -0.725F, 0F, 0F, -0.6F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0.1F, 0F, 0F); // Box 466
		bodyModel[409].setRotationPoint(50.75F, -13.1F, -2F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0.45F, 0F, 0F, -0.2325F, -0.875F, 0F, 0F, -0.725F, -0.5F, 0.3F, 0.085F, -0.5F, 0.45F, 0F, 0F, -0.2325F, 0.875F, 0F, 0F, 0.6F, -0.5F, 0.3F, 0F, -0.5F); // Box 467
		bodyModel[410].setRotationPoint(50.75F, -13.1F, -3.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0.05F, 0F, 0F, 0F, -0.345F, 0F, 0F, -1.25F, -0.31F, -2F, -1.25F, -0.31F, 0.05F, 0F, 0F, 0F, 0.345F, 0F, 0F, 1.25F, -0.31F, -2F, 1.25F, -0.31F); // Box 209
		bodyModel[411].setRotationPoint(51.55F, -12.9F, 3.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0.05F, -1.18F, -0.31F, 0F, -1.25F, -0.31F, -2.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 1.18F, -0.31F, 0F, 1.25F, -0.31F, -2.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 470
		bodyModel[412].setRotationPoint(51.55F, -12.9F, -9.5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-2F, -1.25F, -0.31F, 0F, -1.25F, -0.31F, 0F, -0.345F, 0F, 0.05F, 0F, 0F, -2F, 1.25F, -0.31F, 0F, 1.25F, -0.31F, 0F, 0.345F, 0F, 0.05F, 0F, 0F); // Box 471
		bodyModel[413].setRotationPoint(51.55F, -12.9F, -9.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.8F, 0F, 0F, -1.2F, 0F, 0F, 0F, -1.55F, -0.5F, -0.15F, -1.625F, -0.5F, -0.8F, 0F, 0F, -1.2F, 0F, 0F, 0F, 1.55F, -0.5F, -0.15F, 1.625F, -0.5F); // Box 209
		bodyModel[414].setRotationPoint(49.5F, -13.1F, 3.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.8F, 0F, 0F, 0F, -0.2F, 0F, 0F, -1.55F, -0.5F, -2F, -1.55F, -0.5F, -0.8F, 0F, 0F, 0F, 0.2F, 0F, 0F, 1.55F, -0.5F, -2F, 1.55F, -0.5F); // Box 209
		bodyModel[415].setRotationPoint(49.5F, -13.1F, 3.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.15F, -1.625F, -0.5F, 0F, -1.55F, -0.5F, -1.2F, 0F, 0F, -0.8F, 0F, 0F, -0.15F, 1.625F, -0.5F, 0F, 1.55F, -0.5F, -1.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 480
		bodyModel[416].setRotationPoint(49.5F, -13.1F, -10.5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-2F, -1.55F, -0.5F, 0F, -1.55F, -0.5F, 0F, -0.2F, 0F, -0.8F, 0F, 0F, -2F, 1.55F, -0.5F, 0F, 1.55F, -0.5F, 0F, 0.2F, 0F, -0.8F, 0F, 0F); // Box 481
		bodyModel[417].setRotationPoint(49.5F, -13.1F, -10.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.42F, -0.35F, 0.19F, -1.42F, -0.35F, 0.19F, 0.005F, -0.125F, 0F, 0.42F, -0.0015F, 0F, 0.42F, 0.35F, 0.19F, -1.42F, 0.35F, 0.19F, 0.005F, 0.1265F, 0F, 0.42F, 0.0015F, 0F); // Box 556
		bodyModel[418].setRotationPoint(53.97F, -12F, -9F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.455F, -0.445F, -0.5F, -0.545F, -0.445F, -0.5F, 0F, -0.0935F, 0F, -0.455F, -0.005F, 0F, -0.455F, 0.445F, -0.5F, -0.545F, 0.445F, -0.5F, 0F, 0.0935F, 0F, -0.455F, 0.004F, 0F); // Box 557
		bodyModel[419].setRotationPoint(54.52F, -12.32F, -7.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.35F, 0F, -0.5F, 0.35F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.5F, 0.35F, 0F, -0.5F); // Box 208
		bodyModel[420].setRotationPoint(49.65F, -13.1F, 0F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[421].setRotationPoint(49.65F, -13.1F, -4F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -1.625F, -0.5F, 0.65F, -1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 1.625F, -0.5F, 0.65F, 1.625F, -0.5F); // Box 209
		bodyModel[422].setRotationPoint(49.3F, -13.1F, 3.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0.65F, -1.625F, -0.5F, -0.65F, -1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 1.625F, -0.5F, -0.65F, 1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[423].setRotationPoint(49.3F, -13.1F, -10.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.35F, -0.5F, 0.5F, 0.05F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.35F, -0.5F, 0.5F, 0.05F, -0.5F, 0.5F, 0.09F, 0F, -1F, -0.35F, 0F, -1F); // Box 355
		bodyModel[424].setRotationPoint(43.15F, -18F, 10F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.35F, -1F, 0F, 0F, -1F, 0F, 0.05F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.35F, 0F, -1F, 0.09F, 0F, -1F, 0.05F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F); // Box 420
		bodyModel[425].setRotationPoint(43.15F, -18F, -11F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[426].setRotationPoint(45.5F, -3F, -2F);

		bodyModel[427].addBox(0F, 0F, 0F, 3, 6, 8, 0F); // Box 0
		bodyModel[427].setRotationPoint(45.5F, -6F, -10F);

		bodyModel[428].addBox(0F, 0F, 0F, 3, 6, 8, 0F); // Box 396
		bodyModel[428].setRotationPoint(45.5F, -6F, 2F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[429].setRotationPoint(48.5F, -10F, -10F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-0.65F, -1.95F, 0F, -0.35F, -1.95F, 0F, 0.65F, 0.3F, 0F, -1.65F, 0.3F, 0F, -0.5F, 0F, 0F, -0.35F, 0F, 0F, 0.65F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[430].setRotationPoint(48F, -13F, -10F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-1.65F, 0.3F, 0F, 0.65F, 0.3F, 0F, -0.35F, -1.95F, 0F, -0.65F, -1.95F, 0F, -0.5F, 0F, 0F, 0.65F, 0F, 0F, -0.35F, 0F, 0F, -0.5F, 0F, 0F); // Box 416
		bodyModel[431].setRotationPoint(48F, -13F, 0F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 87, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[432].setRotationPoint(-43.5F, -22F, -2.5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 87, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[433].setRotationPoint(-43.5F, -22F, -8.5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 87, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 88
		bodyModel[434].setRotationPoint(-43.5F, -22F, 2.5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 87, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 336
		bodyModel[435].setRotationPoint(-43.5F, -20F, 8F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 87, 1, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 579
		bodyModel[436].setRotationPoint(-43.5F, -20F, -11F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[437].setRotationPoint(-43.5F, -21F, -2.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[438].setRotationPoint(-43.5F, -21F, -3.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[439].setRotationPoint(-43.5F, -21F, 2.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[440].setRotationPoint(41.5F, -21F, -2.5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[441].setRotationPoint(41.5F, -21F, -3.5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[442].setRotationPoint(41.5F, -21F, 2.5F);

		bodyModel[443].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[443].setRotationPoint(-36.5F, 2.5F, -2F);

		bodyModel[444].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[444].setRotationPoint(32.5F, 2.5F, -2F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[445].setRotationPoint(33.5F, 2F, -11F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[446].setRotationPoint(33.5F, 2F, 6F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[447].setRotationPoint(-35.5F, 2F, -11F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[448].setRotationPoint(-36F, 2F, 6F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420 water filler
		bodyModel[449].setRotationPoint(-1F, 2F, 5.85F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 421 water filler
		bodyModel[450].setRotationPoint(-1F, 2F, -10.85F);

		bodyModel[451].addBox(0F, 0F, 0F, 34, 6, 16, 0F); // Box 0
		bodyModel[451].setRotationPoint(-17F, 3F, -8F);

		bodyModel[452].addBox(0F, 0F, 0F, 17, 4, 2, 0F); // Box 0
		bodyModel[452].setRotationPoint(0F, 5F, 8F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 1F, -2F); // Box 0
		bodyModel[453].setRotationPoint(0F, 3F, 9F);

		bodyModel[454].addBox(0F, 0F, 0F, 17, 2, 1, 0F); // Box 0
		bodyModel[454].setRotationPoint(0F, 3F, 8F);

		bodyModel[455].addBox(0F, 0F, 0F, 17, 3, 2, 0F); // Box 538
		bodyModel[455].setRotationPoint(0F, 5F, -10F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F,0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 539
		bodyModel[456].setRotationPoint(0F, 3F, -12F);

		bodyModel[457].addBox(0F, 0F, 0F, 17, 2, 1, 0F); // Box 540
		bodyModel[457].setRotationPoint(0F, 3F, -9F);

		bodyModel[458].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Box 0
		bodyModel[458].setRotationPoint(-10F, 3F, -9.59F);
		bodyModel[458].rotateAngleX = -0.78539816F;

		bodyModel[459].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0.415F, 0F, 0F, 0.415F, 0F, 0F, 0.415F, -0.175F, 0F, 0.415F, -0.175F); // Box 0 cull
		bodyModel[459].setRotationPoint(-9F, 2F, -11F);

		bodyModel[460].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Box 343
		bodyModel[460].setRotationPoint(-10F, 3F, 9.59F);
		bodyModel[460].rotateAngleX = -0.78539816F;

		bodyModel[461].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.415F, -0.175F, 0F, 0.415F, -0.175F, 0F, 0.415F, 0F, 0F, 0.415F, 0F); // Box 344
		bodyModel[461].setRotationPoint(-9F, 2F, 8F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420 water filler
		bodyModel[462].setRotationPoint(-13.5F, 2F, 5.85F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 421 water filler
		bodyModel[463].setRotationPoint(-14F, 2F, -10.85F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 4, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 120
		bodyModel[464].setRotationPoint(-15.5F, 2F, -11F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[465].setRotationPoint(-16F, 2F, -11F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[466].setRotationPoint(-11.5F, 2F, -11F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 4, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 481
		bodyModel[467].setRotationPoint(11.5F, 2F, 11F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[468].setRotationPoint(11F, 2F, 11F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[469].setRotationPoint(15.5F, 2F, 11F);

		bodyModel[470].addBox(0F, 0F, 0F, 0, 12, 1, 0F); // Box 79
		bodyModel[470].setRotationPoint(-11F, -9F, -12F);

		bodyModel[471].addBox(0F, 0F, 0F, 0, 12, 1, 0F); // Box 80
		bodyModel[471].setRotationPoint(-16F, -9F, -12F);

		bodyModel[472].addBox(0F, 0F, 0F, 0, 12, 1, 0F); // Box 0
		bodyModel[472].setRotationPoint(16F, -9F, 11F);

		bodyModel[473].addBox(0F, 0F, 0F, 0, 12, 1, 0F); // Box 0
		bodyModel[473].setRotationPoint(11F, -9F, 11F);

		bodyModel[474].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 0
		bodyModel[474].setRotationPoint(-15.5F, -17F, -11F);

		bodyModel[475].addShapeBox(0F, 0F, -0.5F, 4, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Middle side door L
		bodyModel[475].setRotationPoint(-15.5F, -9F, -10F);

		bodyModel[476].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 348
		bodyModel[476].setRotationPoint(11.5F, -17F, 10F);

		bodyModel[477].addShapeBox(-4F, 0F, -0.5F, 4, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Middle side door R
		bodyModel[477].setRotationPoint(15.5F, -9F, 10F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 62, 10, 1, 0F,0F, 0F, 0F, -31F, 0F, 0F, -31F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -5F, 0F, -31F, -5F, 0F, -31F, -5F, 0.02F, 0F, -5F, 0.02F); // Box 0 cull
		bodyModel[478].setRotationPoint(-15.5F, -15.01F, -11.01F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 62, 10, 1, 0F,0F, 0F, 0.02F, -31F, 0F, 0.02F, -31F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0.02F, -31F, -5F, 0.02F, -31F, -5F, 0F, 0F, -5F, 0F); // Box 378 cull
		bodyModel[479].setRotationPoint(-15.5F, -15.01F, 10.01F);

		bodyModel[480].addBox(0F, 0F, 0F, 24, 17, 1, 0F); // Box 0
		bodyModel[480].setRotationPoint(-39.5F, -17F, -11F);

		bodyModel[481].addBox(0F, 0F, 0F, 51, 17, 1, 0F); // Box 62
		bodyModel[481].setRotationPoint(-39.5F, -17F, 10F);

		bodyModel[482].addBox(0F, 0F, 0F, 51, 17, 1, 0F); // Box 0
		bodyModel[482].setRotationPoint(-11.5F, -17F, -11F);

		bodyModel[483].addBox(0F, 0F, 0F, 24, 17, 1, 0F); // Box 62
		bodyModel[483].setRotationPoint(15.5F, -17F, 10F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0.02F, -4F, 0F, 0.02F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0.02F, -4F, -5F, 0.02F, -4F, -5F, 0F, 0F, -5F, 0F); // Box 378 cull
		bodyModel[484].setRotationPoint(27.5F, -15.01F, 10.01F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -5F, 0F, -4F, -5F, 0F, -4F, -5F, 0.02F, 0F, -5F, 0.02F); // Box 0 cull
		bodyModel[485].setRotationPoint(27.5F, -15.01F, -11.01F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0.02F, -4F, 0F, 0.02F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0.02F, -4F, -5F, 0.02F, -4F, -5F, 0F, 0F, -5F, 0F); // Box 378 cull
		bodyModel[486].setRotationPoint(-31.5F, -15.01F, 10.01F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -5F, 0F, -4F, -5F, 0F, -4F, -5F, 0.02F, 0F, -5F, 0.02F); // Box 0 cull
		bodyModel[487].setRotationPoint(-31.5F, -15.01F, -11.01F);

		bodyModel[488].addBox(0F, 0F, 0F, 19, 4, 7, 0F); // Box 0
		bodyModel[488].setRotationPoint(15.5F, -4F, -3.5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 19, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[489].setRotationPoint(15.5F, -4F, -5.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[490].setRotationPoint(15.5F, -4F, 3.5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[491].setRotationPoint(32.5F, -4F, 3.5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 24, 9, 7, 0F,0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[492].setRotationPoint(15.5F, -13F, -3.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 18, 2, 5, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[493].setRotationPoint(16.3F, -15F, -2.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[494].setRotationPoint(16.6F, -15F, -3.83F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[495].setRotationPoint(18.98F, -15F, -3.83F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[496].setRotationPoint(21.36F, -15F, -3.83F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[497].setRotationPoint(23.71F, -15F, -3.83F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[498].setRotationPoint(26.08F, -15F, -3.83F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[499].setRotationPoint(28.46F, -15F, -3.83F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 459, 245, textureX, textureY); // Box 0
		bodyModel[501] = new ModelRendererTurbo(this, 462, 245, textureX, textureY); // Box 0
		bodyModel[502] = new ModelRendererTurbo(this, 369, 216, textureX, textureY); // Box 0
		bodyModel[503] = new ModelRendererTurbo(this, 372, 207, textureX, textureY); // Box 0
		bodyModel[504] = new ModelRendererTurbo(this, 454, 187, textureX, textureY); // Box 0
		bodyModel[505] = new ModelRendererTurbo(this, 414, 199, textureX, textureY); // Box 0
		bodyModel[506] = new ModelRendererTurbo(this, 431, 199, textureX, textureY); // Box 0
		bodyModel[507] = new ModelRendererTurbo(this, 435, 177, textureX, textureY); // Box 0
		bodyModel[508] = new ModelRendererTurbo(this, 478, 170, textureX, textureY); // Box 0
		bodyModel[509] = new ModelRendererTurbo(this, 495, 154, textureX, textureY); // Box 0
		bodyModel[510] = new ModelRendererTurbo(this, 495, 170, textureX, textureY); // Box 0
		bodyModel[511] = new ModelRendererTurbo(this, 198, 23, textureX, textureY); // Box 0
		bodyModel[512] = new ModelRendererTurbo(this, 415, 194, textureX, textureY); // Box 394
		bodyModel[513] = new ModelRendererTurbo(this, 415, 189, textureX, textureY); // Box 394
		bodyModel[514] = new ModelRendererTurbo(this, 226, 5, textureX, textureY); // Box 0
		bodyModel[515] = new ModelRendererTurbo(this, 231, 5, textureX, textureY); // Box 0
		bodyModel[516] = new ModelRendererTurbo(this, 236, 5, textureX, textureY); // Box 0
		bodyModel[517] = new ModelRendererTurbo(this, 221, 5, textureX, textureY); // Box 0
		bodyModel[518] = new ModelRendererTurbo(this, 443, 43, textureX, textureY); // Box 0
		bodyModel[519] = new ModelRendererTurbo(this, 435, 2, textureX, textureY); // Box 0
		bodyModel[520] = new ModelRendererTurbo(this, 477, 2, textureX, textureY); // Box 0
		bodyModel[521] = new ModelRendererTurbo(this, 443, 31, textureX, textureY); // Box 615
		bodyModel[522] = new ModelRendererTurbo(this, 413, 2, textureX, textureY); // Box 616
		bodyModel[523] = new ModelRendererTurbo(this, 485, 1, textureX, textureY); // Box 617
		bodyModel[524] = new ModelRendererTurbo(this, 442, 3, textureX, textureY); // Box 615
		bodyModel[525] = new ModelRendererTurbo(this, 406, 3, textureX, textureY); // Box 619
		bodyModel[526] = new ModelRendererTurbo(this, 387, 25, textureX, textureY); // Box 361
		bodyModel[527] = new ModelRendererTurbo(this, 387, 61, textureX, textureY); // Box 621
		bodyModel[528] = new ModelRendererTurbo(this, 457, 3, textureX, textureY); // Box 0
		bodyModel[529] = new ModelRendererTurbo(this, 457, 18, textureX, textureY); // Box 623
		bodyModel[530] = new ModelRendererTurbo(this, 349, 25, textureX, textureY); // Box 0
		bodyModel[531] = new ModelRendererTurbo(this, 317, 52, textureX, textureY); // Box 0
		bodyModel[532] = new ModelRendererTurbo(this, 350, 1, textureX, textureY); // Box 0
		bodyModel[533] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 0
		bodyModel[534] = new ModelRendererTurbo(this, 329, 29, textureX, textureY); // Box 615
		bodyModel[535] = new ModelRendererTurbo(this, 364, 38, textureX, textureY); // Box 616
		bodyModel[536] = new ModelRendererTurbo(this, 310, 48, textureX, textureY); // Box 617
		bodyModel[537] = new ModelRendererTurbo(this, 357, 2, textureX, textureY); // Box 615
		bodyModel[538] = new ModelRendererTurbo(this, 371, 39, textureX, textureY); // Box 619
		bodyModel[539] = new ModelRendererTurbo(this, 41, 24, textureX, textureY); // Box 361
		bodyModel[540] = new ModelRendererTurbo(this, 41, 61, textureX, textureY); // Box 621
		bodyModel[541] = new ModelRendererTurbo(this, 336, 21, textureX, textureY); // Box 0
		bodyModel[542] = new ModelRendererTurbo(this, 336, 56, textureX, textureY); // Box 623
		bodyModel[543] = new ModelRendererTurbo(this, 445, 20, textureX, textureY); // Box 0
		bodyModel[544] = new ModelRendererTurbo(this, 314, 7, textureX, textureY); // Box 638
		bodyModel[545] = new ModelRendererTurbo(this, 70, 23, textureX, textureY); // Box 0
		bodyModel[546] = new ModelRendererTurbo(this, 88, 88, textureX, textureY); // Box 270
		bodyModel[547] = new ModelRendererTurbo(this, 8, 222, textureX, textureY); // Box 271
		bodyModel[548] = new ModelRendererTurbo(this, 10, 229, textureX, textureY); // Box 272
		bodyModel[549] = new ModelRendererTurbo(this, 1, 229, textureX, textureY); // Box 273
		bodyModel[550] = new ModelRendererTurbo(this, 1, 189, textureX, textureY); // Box 274
		bodyModel[551] = new ModelRendererTurbo(this, 9, 181, textureX, textureY); // Box 275
		bodyModel[552] = new ModelRendererTurbo(this, 18, 70, textureX, textureY); // Box 276
		bodyModel[553] = new ModelRendererTurbo(this, 21, 70, textureX, textureY); // Box 277
		bodyModel[554] = new ModelRendererTurbo(this, 24, 70, textureX, textureY); // Box 278
		bodyModel[555] = new ModelRendererTurbo(this, 27, 70, textureX, textureY); // Box 279
		bodyModel[556] = new ModelRendererTurbo(this, 30, 70, textureX, textureY); // Box 280
		bodyModel[557] = new ModelRendererTurbo(this, 33, 70, textureX, textureY); // Box 281
		bodyModel[558] = new ModelRendererTurbo(this, 36, 70, textureX, textureY); // Box 282
		bodyModel[559] = new ModelRendererTurbo(this, 39, 70, textureX, textureY); // Box 283
		bodyModel[560] = new ModelRendererTurbo(this, 63, 62, textureX, textureY); // Box 284
		bodyModel[561] = new ModelRendererTurbo(this, 74, 67, textureX, textureY); // Box 285
		bodyModel[562] = new ModelRendererTurbo(this, 6, 206, textureX, textureY); // Box 286
		bodyModel[563] = new ModelRendererTurbo(this, 85, 64, textureX, textureY); // Box 287
		bodyModel[564] = new ModelRendererTurbo(this, 96, 67, textureX, textureY); // Box 288
		bodyModel[565] = new ModelRendererTurbo(this, 69, 76, textureX, textureY); // Box 289
		bodyModel[566] = new ModelRendererTurbo(this, 80, 79, textureX, textureY); // Box 290
		bodyModel[567] = new ModelRendererTurbo(this, 91, 76, textureX, textureY); // Box 291
		bodyModel[568] = new ModelRendererTurbo(this, 102, 79, textureX, textureY); // Box 292
		bodyModel[569] = new ModelRendererTurbo(this, 10, 217, textureX, textureY); // Box 306
		bodyModel[570] = new ModelRendererTurbo(this, 10, 212, textureX, textureY); // Box 308
		bodyModel[571] = new ModelRendererTurbo(this, 74, 5, textureX, textureY); // Box 0
		bodyModel[572] = new ModelRendererTurbo(this, 79, 5, textureX, textureY); // Box 0
		bodyModel[573] = new ModelRendererTurbo(this, 84, 5, textureX, textureY); // Box 0
		bodyModel[574] = new ModelRendererTurbo(this, 89, 5, textureX, textureY); // Box 0
		bodyModel[575] = new ModelRendererTurbo(this, 153, 2, textureX, textureY); // Box 0
		bodyModel[576] = new ModelRendererTurbo(this, 268, 224, textureX, textureY); // Box 0
		bodyModel[577] = new ModelRendererTurbo(this, 238, 216, textureX, textureY); // Box 0
		bodyModel[578] = new ModelRendererTurbo(this, 236, 233, textureX, textureY); // Box 0
		bodyModel[579] = new ModelRendererTurbo(this, 253, 235, textureX, textureY); // Box 0
		bodyModel[580] = new ModelRendererTurbo(this, 268, 234, textureX, textureY); // Box 0
		bodyModel[581] = new ModelRendererTurbo(this, 227, 239, textureX, textureY); // Box 0
		bodyModel[582] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 0
		bodyModel[583] = new ModelRendererTurbo(this, 298, 208, textureX, textureY); // Box 169
		bodyModel[584] = new ModelRendererTurbo(this, 340, 220, textureX, textureY); // Box 169
		bodyModel[585] = new ModelRendererTurbo(this, 340, 215, textureX, textureY); // Box 439
		bodyModel[586] = new ModelRendererTurbo(this, 278, 228, textureX, textureY); // Box 0
		bodyModel[587] = new ModelRendererTurbo(this, 277, 236, textureX, textureY); // Box 0
		bodyModel[588] = new ModelRendererTurbo(this, 278, 216, textureX, textureY); // Box 103
		bodyModel[589] = new ModelRendererTurbo(this, 305, 228, textureX, textureY); // Box 169
		bodyModel[590] = new ModelRendererTurbo(this, 380, 198, textureX, textureY); // Box 169
		bodyModel[591] = new ModelRendererTurbo(this, 356, 251, textureX, textureY); // Box 169
		bodyModel[592] = new ModelRendererTurbo(this, 380, 191, textureX, textureY); // Box 347
		bodyModel[593] = new ModelRendererTurbo(this, 358, 225, textureX, textureY); // Box 348
		bodyModel[594] = new ModelRendererTurbo(this, 350, 233, textureX, textureY); // Box 169
		bodyModel[595] = new ModelRendererTurbo(this, 354, 242, textureX, textureY); // Box 169
		bodyModel[596] = new ModelRendererTurbo(this, 354, 228, textureX, textureY); // Box 351
		bodyModel[597] = new ModelRendererTurbo(this, 137, 204, textureX, textureY); // Box 169
		bodyModel[598] = new ModelRendererTurbo(this, 125, 216, textureX, textureY); // Box 169
		bodyModel[599] = new ModelRendererTurbo(this, 125, 211, textureX, textureY); // Box 439
		bodyModel[600] = new ModelRendererTurbo(this, 191, 227, textureX, textureY); // Box 0
		bodyModel[601] = new ModelRendererTurbo(this, 190, 235, textureX, textureY); // Box 0
		bodyModel[602] = new ModelRendererTurbo(this, 190, 218, textureX, textureY); // Box 103
		bodyModel[603] = new ModelRendererTurbo(this, 135, 224, textureX, textureY); // Box 169
		bodyModel[604] = new ModelRendererTurbo(this, 98, 219, textureX, textureY); // Box 169
		bodyModel[605] = new ModelRendererTurbo(this, 125, 252, textureX, textureY); // Box 169
		bodyModel[606] = new ModelRendererTurbo(this, 98, 211, textureX, textureY); // Box 347
		bodyModel[607] = new ModelRendererTurbo(this, 125, 224, textureX, textureY); // Box 348
		bodyModel[608] = new ModelRendererTurbo(this, 116, 232, textureX, textureY); // Box 169
		bodyModel[609] = new ModelRendererTurbo(this, 123, 247, textureX, textureY); // Box 169
		bodyModel[610] = new ModelRendererTurbo(this, 123, 227, textureX, textureY); // Box 351
		bodyModel[611] = new ModelRendererTurbo(this, 420, 225, textureX, textureY); // Box 0
		bodyModel[612] = new ModelRendererTurbo(this, 421, 208, textureX, textureY); // Box 0
		bodyModel[613] = new ModelRendererTurbo(this, 443, 230, textureX, textureY); // Box 0
		bodyModel[614] = new ModelRendererTurbo(this, 420, 210, textureX, textureY); // Box 0
		bodyModel[615] = new ModelRendererTurbo(this, 421, 215, textureX, textureY); // Box 0
		bodyModel[616] = new ModelRendererTurbo(this, 401, 250, textureX, textureY); // Box 0
		bodyModel[617] = new ModelRendererTurbo(this, 411, 243, textureX, textureY); // Box 0
		bodyModel[618] = new ModelRendererTurbo(this, 409, 249, textureX, textureY); // Box 0
		bodyModel[619] = new ModelRendererTurbo(this, 390, 249, textureX, textureY); // Box 471
		bodyModel[620] = new ModelRendererTurbo(this, 409, 236, textureX, textureY); // Box 0
		bodyModel[621] = new ModelRendererTurbo(this, 398, 239, textureX, textureY); // Box 0
		bodyModel[622] = new ModelRendererTurbo(this, 389, 236, textureX, textureY); // Box 0
		bodyModel[623] = new ModelRendererTurbo(this, 391, 241, textureX, textureY); // Box 0
		bodyModel[624] = new ModelRendererTurbo(this, 396, 231, textureX, textureY); // Box 0
		bodyModel[625] = new ModelRendererTurbo(this, 418, 242, textureX, textureY); // Box 0
		bodyModel[626] = new ModelRendererTurbo(this, 415, 245, textureX, textureY); // Box 0
		bodyModel[627] = new ModelRendererTurbo(this, 417, 230, textureX, textureY); // Box 0
		bodyModel[628] = new ModelRendererTurbo(this, 411, 227, textureX, textureY); // Box 0
		bodyModel[629] = new ModelRendererTurbo(this, 405, 232, textureX, textureY); // Box 0
		bodyModel[630] = new ModelRendererTurbo(this, 413, 223, textureX, textureY); // Box 757
		bodyModel[631] = new ModelRendererTurbo(this, 411, 211, textureX, textureY); // Box 0
		bodyModel[632] = new ModelRendererTurbo(this, 411, 199, textureX, textureY); // Box 0
		bodyModel[633] = new ModelRendererTurbo(this, 411, 217, textureX, textureY); // Box 0
		bodyModel[634] = new ModelRendererTurbo(this, 427, 226, textureX, textureY); // Box 0
		bodyModel[635] = new ModelRendererTurbo(this, 422, 226, textureX, textureY); // Box 0
		bodyModel[636] = new ModelRendererTurbo(this, 423, 243, textureX, textureY); // Box 0
		bodyModel[637] = new ModelRendererTurbo(this, 423, 247, textureX, textureY); // Box 0
		bodyModel[638] = new ModelRendererTurbo(this, 49, 223, textureX, textureY); // Box 293
		bodyModel[639] = new ModelRendererTurbo(this, 49, 206, textureX, textureY); // Box 294
		bodyModel[640] = new ModelRendererTurbo(this, 73, 188, textureX, textureY); // Box 295
		bodyModel[641] = new ModelRendererTurbo(this, 82, 212, textureX, textureY); // Box 296
		bodyModel[642] = new ModelRendererTurbo(this, 73, 205, textureX, textureY); // Box 297
		bodyModel[643] = new ModelRendererTurbo(this, 73, 211, textureX, textureY); // Box 298
		bodyModel[644] = new ModelRendererTurbo(this, 89, 211, textureX, textureY); // Box 299
		bodyModel[645] = new ModelRendererTurbo(this, 73, 198, textureX, textureY); // Box 300
		bodyModel[646] = new ModelRendererTurbo(this, 82, 200, textureX, textureY); // Box 301
		bodyModel[647] = new ModelRendererTurbo(this, 95, 198, textureX, textureY); // Box 302
		bodyModel[648] = new ModelRendererTurbo(this, 95, 203, textureX, textureY); // Box 303
		bodyModel[649] = new ModelRendererTurbo(this, 84, 192, textureX, textureY); // Box 304
		bodyModel[650] = new ModelRendererTurbo(this, 49, 240, textureX, textureY); // Box 305
		bodyModel[651] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 835
		bodyModel[652] = new ModelRendererTurbo(this, 52, 247, textureX, textureY); // Box 0
		bodyModel[653] = new ModelRendererTurbo(this, 79, 245, textureX, textureY); // Box 0
		bodyModel[654] = new ModelRendererTurbo(this, 91, 247, textureX, textureY); // Box 0
		bodyModel[655] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // Box 0
		bodyModel[656] = new ModelRendererTurbo(this, 83, 240, textureX, textureY); // Box 0
		bodyModel[657] = new ModelRendererTurbo(this, 91, 239, textureX, textureY); // Box 0
		bodyModel[658] = new ModelRendererTurbo(this, 85, 236, textureX, textureY); // Box 757
		bodyModel[659] = new ModelRendererTurbo(this, 84, 224, textureX, textureY); // Box 0
		bodyModel[660] = new ModelRendererTurbo(this, 84, 218, textureX, textureY); // Box 0
		bodyModel[661] = new ModelRendererTurbo(this, 84, 230, textureX, textureY); // Box 0
		bodyModel[662] = new ModelRendererTurbo(this, 78, 241, textureX, textureY); // Box 0
		bodyModel[663] = new ModelRendererTurbo(this, 80, 248, textureX, textureY); // Box 0
		bodyModel[664] = new ModelRendererTurbo(this, 93, 224, textureX, textureY); // Box 0
		bodyModel[665] = new ModelRendererTurbo(this, 390, 205, textureX, textureY); // Box 0
		bodyModel[666] = new ModelRendererTurbo(this, 99, 239, textureX, textureY); // Box 0
		bodyModel[667] = new ModelRendererTurbo(this, 98, 226, textureX, textureY); // Box 0
		bodyModel[668] = new ModelRendererTurbo(this, 386, 218, textureX, textureY); // Box 0
		bodyModel[669] = new ModelRendererTurbo(this, 417, 171, textureX, textureY); // Box 169
		bodyModel[670] = new ModelRendererTurbo(this, 417, 170, textureX, textureY); // Box 394
		bodyModel[671] = new ModelRendererTurbo(this, 417, 175, textureX, textureY); // Box 717
		bodyModel[672] = new ModelRendererTurbo(this, 423, 179, textureX, textureY); // Box 169
		bodyModel[673] = new ModelRendererTurbo(this, 43, 244, textureX, textureY); // Box 719
		bodyModel[674] = new ModelRendererTurbo(this, 16, 236, textureX, textureY); // Box 169
		bodyModel[675] = new ModelRendererTurbo(this, 34, 246, textureX, textureY); // Box 394
		bodyModel[676] = new ModelRendererTurbo(this, 34, 241, textureX, textureY); // Box 717
		bodyModel[677] = new ModelRendererTurbo(this, 489, 210, textureX, textureY); // Box 394
		bodyModel[678] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 394
		bodyModel[679] = new ModelRendererTurbo(this, 40, 2, textureX, textureY); // Box 394
		bodyModel[680] = new ModelRendererTurbo(this, 69, 17, textureX, textureY); // Box 394
		bodyModel[681] = new ModelRendererTurbo(this, 86, 171, textureX, textureY); // Box 394
		bodyModel[682] = new ModelRendererTurbo(this, 87, 175, textureX, textureY); // Box 394
		bodyModel[683] = new ModelRendererTurbo(this, 458, 221, textureX, textureY); // Box 0
		bodyModel[684] = new ModelRendererTurbo(this, 3, 241, textureX, textureY); // Box 0
		bodyModel[685] = new ModelRendererTurbo(this, 484, 221, textureX, textureY); // Box 394
		bodyModel[686] = new ModelRendererTurbo(this, 475, 219, textureX, textureY); // Box 394
		bodyModel[687] = new ModelRendererTurbo(this, 58, 183, textureX, textureY); // Box 734
		bodyModel[688] = new ModelRendererTurbo(this, 63, 174, textureX, textureY); // Box 735
		bodyModel[689] = new ModelRendererTurbo(this, 16, 243, textureX, textureY); // Box 0
		bodyModel[690] = new ModelRendererTurbo(this, 15, 239, textureX, textureY); // Box 0
		bodyModel[691] = new ModelRendererTurbo(this, 41, 236, textureX, textureY); // Box 0
		bodyModel[692] = new ModelRendererTurbo(this, 6, 178, textureX, textureY); // Box 0
		bodyModel[693] = new ModelRendererTurbo(this, 21, 236, textureX, textureY); // Box 0
		bodyModel[694] = new ModelRendererTurbo(this, 34, 238, textureX, textureY); // Box 0
		bodyModel[695] = new ModelRendererTurbo(this, 21, 248, textureX, textureY); // Box 0
		bodyModel[696] = new ModelRendererTurbo(this, 26, 240, textureX, textureY); // Box 0
		bodyModel[697] = new ModelRendererTurbo(this, 26, 237, textureX, textureY); // Box 0
		bodyModel[698] = new ModelRendererTurbo(this, 26, 248, textureX, textureY); // Box 0
		bodyModel[699] = new ModelRendererTurbo(this, 476, 217, textureX, textureY); // Box 0
		bodyModel[700] = new ModelRendererTurbo(this, 487, 214, textureX, textureY); // Box 0
		bodyModel[701] = new ModelRendererTurbo(this, 499, 227, textureX, textureY); // Box 0
		bodyModel[702] = new ModelRendererTurbo(this, 451, 234, textureX, textureY); // Box 0
		bodyModel[703] = new ModelRendererTurbo(this, 475, 231, textureX, textureY); // Box 0
		bodyModel[704] = new ModelRendererTurbo(this, 456, 221, textureX, textureY); // Box 0
		bodyModel[705] = new ModelRendererTurbo(this, 471, 217, textureX, textureY); // Box 0
		bodyModel[706] = new ModelRendererTurbo(this, 478, 228, textureX, textureY); // Box 0
		bodyModel[707] = new ModelRendererTurbo(this, 472, 227, textureX, textureY); // Box 0
		bodyModel[708] = new ModelRendererTurbo(this, 456, 218, textureX, textureY); // Box 0
		bodyModel[709] = new ModelRendererTurbo(this, 72, 175, textureX, textureY); // Box 394
		bodyModel[710] = new ModelRendererTurbo(this, 443, 225, textureX, textureY); // Box 394
		bodyModel[711] = new ModelRendererTurbo(this, 338, 3, textureX, textureY,"gauges_front"); // Box 389
		bodyModel[712] = new ModelRendererTurbo(this, 456, 68, textureX, textureY); // Box 758
		bodyModel[713] = new ModelRendererTurbo(this, 461, 64, textureX, textureY); // Box 759
		bodyModel[714] = new ModelRendererTurbo(this, 456, 60, textureX, textureY); // Box 760
		bodyModel[715] = new ModelRendererTurbo(this, 461, 69, textureX, textureY); // Box 761
		bodyModel[716] = new ModelRendererTurbo(this, 456, 64, textureX, textureY); // Box 762
		bodyModel[717] = new ModelRendererTurbo(this, 440, 64, textureX, textureY); // Box 763
		bodyModel[718] = new ModelRendererTurbo(this, 440, 57, textureX, textureY); // Box 764
		bodyModel[719] = new ModelRendererTurbo(this, 446, 55, textureX, textureY,"speedo_back"); // Box 765
		bodyModel[720] = new ModelRendererTurbo(this, 443, 69, textureX, textureY); // Box 766
		bodyModel[721] = new ModelRendererTurbo(this, 449, 69, textureX, textureY); // Box 767
		bodyModel[722] = new ModelRendererTurbo(this, 449, 62, textureX, textureY,"gauges_back"); // Box 768
		bodyModel[723] = new ModelRendererTurbo(this, 324, 8, textureX, textureY); // Box 31
		bodyModel[724] = new ModelRendererTurbo(this, 453, 56, textureX, textureY); // Box 31
		bodyModel[725] = new ModelRendererTurbo(this, 162, 21, textureX, textureY); // Box 0
		bodyModel[726] = new ModelRendererTurbo(this, 118, 21, textureX, textureY); // Box 0
		bodyModel[727] = new ModelRendererTurbo(this, 162, 5, textureX, textureY); // Box 0
		bodyModel[728] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Box 0
		bodyModel[729] = new ModelRendererTurbo(this, 193, 12, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[730] = new ModelRendererTurbo(this, 65, 12, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[731] = new ModelRendererTurbo(this, 42, 102, textureX, textureY); // Box 439 bug deflector
		bodyModel[732] = new ModelRendererTurbo(this, 456, 102, textureX, textureY); // Box 439 bug deflector
		bodyModel[733] = new ModelRendererTurbo(this, 448, 171, textureX, textureY); // Box 574
		bodyModel[734] = new ModelRendererTurbo(this, 39, 170, textureX, textureY); // Box 574
		bodyModel[735] = new ModelRendererTurbo(this, 296, 22, textureX, textureY); // Box 778
		bodyModel[736] = new ModelRendererTurbo(this, 296, 19, textureX, textureY); // Box 88
		bodyModel[737] = new ModelRendererTurbo(this, 14, 22, textureX, textureY); // Box 780
		bodyModel[738] = new ModelRendererTurbo(this, 12, 19, textureX, textureY); // Box 781
		bodyModel[739] = new ModelRendererTurbo(this, 92, 128, textureX, textureY); // Box 103
		bodyModel[740] = new ModelRendererTurbo(this, 91, 124, textureX, textureY); // Box 103
		bodyModel[741] = new ModelRendererTurbo(this, 98, 124, textureX, textureY); // Box 103
		bodyModel[742] = new ModelRendererTurbo(this, 99, 128, textureX, textureY); // Box 103
		bodyModel[743] = new ModelRendererTurbo(this, 92, 132, textureX, textureY); // Box 103
		bodyModel[744] = new ModelRendererTurbo(this, 99, 132, textureX, textureY); // Box 103
		bodyModel[745] = new ModelRendererTurbo(this, 91, 136, textureX, textureY); // Box 103
		bodyModel[746] = new ModelRendererTurbo(this, 98, 136, textureX, textureY); // Box 103
		bodyModel[747] = new ModelRendererTurbo(this, 102, 103, textureX, textureY,"headlight2beamBA1"); // Box 186 headlight front 2beam bottom A
		bodyModel[748] = new ModelRendererTurbo(this, 102, 108, textureX, textureY,"headlight2beamBA2"); // Box 187 headlight front 2beam bottom A
		bodyModel[749] = new ModelRendererTurbo(this, 93, 107, textureX, textureY,"big_headlight_bottom"); // Box 169 headlight front big bottom
		bodyModel[750] = new ModelRendererTurbo(this, 86, 103, textureX, textureY,"headlight2beamBB1"); // Box 186 headlight front 2beam bottom B
		bodyModel[751] = new ModelRendererTurbo(this, 86, 108, textureX, textureY,"headlight2beamBB2"); // Box 187 headlight front 2beam bottom B
		bodyModel[752] = new ModelRendererTurbo(this, 88, 157, textureX, textureY); // Box 430
		bodyModel[753] = new ModelRendererTurbo(this, 93, 157, textureX, textureY); // Box 431
		bodyModel[754] = new ModelRendererTurbo(this, 88, 153, textureX, textureY); // Box 430
		bodyModel[755] = new ModelRendererTurbo(this, 103, 153, textureX, textureY); // Box 433
		bodyModel[756] = new ModelRendererTurbo(this, 90, 139, textureX, textureY); // Box 403
		bodyModel[757] = new ModelRendererTurbo(this, 93, 139, textureX, textureY); // Box 403
		bodyModel[758] = new ModelRendererTurbo(this, 90, 142, textureX, textureY); // Box 406
		bodyModel[759] = new ModelRendererTurbo(this, 93, 142, textureX, textureY); // Box 406
		bodyModel[760] = new ModelRendererTurbo(this, 103, 139, textureX, textureY); // Box 489
		bodyModel[761] = new ModelRendererTurbo(this, 98, 139, textureX, textureY); // Box 490
		bodyModel[762] = new ModelRendererTurbo(this, 103, 142, textureX, textureY); // Box 491
		bodyModel[763] = new ModelRendererTurbo(this, 98, 142, textureX, textureY); // Box 492
		bodyModel[764] = new ModelRendererTurbo(this, 94, 102, textureX, textureY,"small_headlight_bottom"); // Box 186 headlight front small bottom
		bodyModel[765] = new ModelRendererTurbo(this, 88, 149, textureX, textureY); // Box 430
		bodyModel[766] = new ModelRendererTurbo(this, 88, 146, textureX, textureY); // Box 430
		bodyModel[767] = new ModelRendererTurbo(this, 93, 146, textureX, textureY); // Box 431
		bodyModel[768] = new ModelRendererTurbo(this, 103, 149, textureX, textureY); // Box 528
		bodyModel[769] = new ModelRendererTurbo(this, 103, 146, textureX, textureY); // Box 529
		bodyModel[770] = new ModelRendererTurbo(this, 98, 146, textureX, textureY); // Box 530
		bodyModel[771] = new ModelRendererTurbo(this, 103, 157, textureX, textureY); // Box 531
		bodyModel[772] = new ModelRendererTurbo(this, 98, 157, textureX, textureY); // Box 532
		bodyModel[773] = new ModelRendererTurbo(this, 91, 114, textureX, textureY); // Box 403
		bodyModel[774] = new ModelRendererTurbo(this, 98, 114, textureX, textureY); // Box 404
		bodyModel[775] = new ModelRendererTurbo(this, 98, 119, textureX, textureY); // Box 405
		bodyModel[776] = new ModelRendererTurbo(this, 91, 119, textureX, textureY); // Box 406
		bodyModel[777] = new ModelRendererTurbo(this, 92, 160, textureX, textureY); // Box 0
		bodyModel[778] = new ModelRendererTurbo(this, 409, 128, textureX, textureY); // Box 103
		bodyModel[779] = new ModelRendererTurbo(this, 408, 124, textureX, textureY); // Box 103
		bodyModel[780] = new ModelRendererTurbo(this, 401, 124, textureX, textureY); // Box 103
		bodyModel[781] = new ModelRendererTurbo(this, 402, 128, textureX, textureY); // Box 103
		bodyModel[782] = new ModelRendererTurbo(this, 409, 132, textureX, textureY); // Box 103
		bodyModel[783] = new ModelRendererTurbo(this, 402, 132, textureX, textureY); // Box 103
		bodyModel[784] = new ModelRendererTurbo(this, 408, 136, textureX, textureY); // Box 103
		bodyModel[785] = new ModelRendererTurbo(this, 401, 136, textureX, textureY); // Box 103
		bodyModel[786] = new ModelRendererTurbo(this, 412, 103, textureX, textureY,"backlight2beamBA1"); // Box 186 headlight back 2beam bottom A
		bodyModel[787] = new ModelRendererTurbo(this, 412, 108, textureX, textureY,"backlight2beamBA2"); // Box 187 headlight back 2beam bottom A
		bodyModel[788] = new ModelRendererTurbo(this, 403, 107, textureX, textureY,"big_backlight_bottom"); // Box 169 headlight back big bottom
		bodyModel[789] = new ModelRendererTurbo(this, 396, 108, textureX, textureY,"backlight2beamBB1"); // Box 186 headlight back 2beam bottom B
		bodyModel[790] = new ModelRendererTurbo(this, 396, 103, textureX, textureY,"backlight2beamBB2"); // Box 187 headlight back 2beam bottom B
		bodyModel[791] = new ModelRendererTurbo(this, 413, 157, textureX, textureY); // Box 430
		bodyModel[792] = new ModelRendererTurbo(this, 408, 157, textureX, textureY); // Box 431
		bodyModel[793] = new ModelRendererTurbo(this, 413, 153, textureX, textureY); // Box 430
		bodyModel[794] = new ModelRendererTurbo(this, 398, 153, textureX, textureY); // Box 433
		bodyModel[795] = new ModelRendererTurbo(this, 413, 139, textureX, textureY); // Box 403
		bodyModel[796] = new ModelRendererTurbo(this, 408, 139, textureX, textureY); // Box 403
		bodyModel[797] = new ModelRendererTurbo(this, 413, 142, textureX, textureY); // Box 406
		bodyModel[798] = new ModelRendererTurbo(this, 408, 142, textureX, textureY); // Box 406
		bodyModel[799] = new ModelRendererTurbo(this, 400, 139, textureX, textureY); // Box 489
		bodyModel[800] = new ModelRendererTurbo(this, 403, 139, textureX, textureY); // Box 490
		bodyModel[801] = new ModelRendererTurbo(this, 400, 142, textureX, textureY); // Box 491
		bodyModel[802] = new ModelRendererTurbo(this, 403, 142, textureX, textureY); // Box 492
		bodyModel[803] = new ModelRendererTurbo(this, 404, 102, textureX, textureY,"small_backlight_bottom"); // Box 186 headligh tback small bottom
		bodyModel[804] = new ModelRendererTurbo(this, 413, 149, textureX, textureY); // Box 430
		bodyModel[805] = new ModelRendererTurbo(this, 413, 146, textureX, textureY); // Box 430
		bodyModel[806] = new ModelRendererTurbo(this, 408, 146, textureX, textureY); // Box 431
		bodyModel[807] = new ModelRendererTurbo(this, 398, 149, textureX, textureY); // Box 528
		bodyModel[808] = new ModelRendererTurbo(this, 398, 146, textureX, textureY); // Box 529
		bodyModel[809] = new ModelRendererTurbo(this, 403, 146, textureX, textureY); // Box 530
		bodyModel[810] = new ModelRendererTurbo(this, 398, 157, textureX, textureY); // Box 531
		bodyModel[811] = new ModelRendererTurbo(this, 403, 157, textureX, textureY); // Box 532
		bodyModel[812] = new ModelRendererTurbo(this, 408, 114, textureX, textureY); // Box 403
		bodyModel[813] = new ModelRendererTurbo(this, 401, 114, textureX, textureY); // Box 404
		bodyModel[814] = new ModelRendererTurbo(this, 401, 119, textureX, textureY); // Box 405
		bodyModel[815] = new ModelRendererTurbo(this, 408, 119, textureX, textureY); // Box 406
		bodyModel[816] = new ModelRendererTurbo(this, 402, 160, textureX, textureY); // Box 0
		bodyModel[817] = new ModelRendererTurbo(this, 153, 20, textureX, textureY); // Box 0
		bodyModel[818] = new ModelRendererTurbo(this, 472, 126, textureX, textureY); // Box 525
		bodyModel[819] = new ModelRendererTurbo(this, 483, 125, textureX, textureY,"numberboard_back_R_type_2"); // Numberboard R type 2 BACK
		bodyModel[820] = new ModelRendererTurbo(this, 438, 126, textureX, textureY); // Box 524
		bodyModel[821] = new ModelRendererTurbo(this, 425, 125, textureX, textureY,"numberboard_back_L_type_2"); // Numberboard L Type 2 BACK
		bodyModel[822] = new ModelRendererTurbo(this, 5, 10, textureX, textureY); // Box 88
		bodyModel[823] = new ModelRendererTurbo(this, 36, 9, textureX, textureY); // Box 80
		bodyModel[824] = new ModelRendererTurbo(this, 28, 10, textureX, textureY); // Box 80
		bodyModel[825] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 88
		bodyModel[826] = new ModelRendererTurbo(this, 3, 1, textureX, textureY); // Box 88
		bodyModel[827] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 88
		bodyModel[828] = new ModelRendererTurbo(this, 21, 17, textureX, textureY); // Box 409 commander base
		bodyModel[829] = new ModelRendererTurbo(this, 21, 13, textureX, textureY, "commander_f"); // Box 410 commander beacon FRONT
		bodyModel[830] = new ModelRendererTurbo(this, 10, 4, textureX, textureY); // Box 88
		bodyModel[831] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 88
		bodyModel[832] = new ModelRendererTurbo(this, 19, 9, textureX, textureY); // Box 364 prime base
		bodyModel[833] = new ModelRendererTurbo(this, 19, 1, textureX, textureY, "prime1_f"); // Box 6 PRIME1-1 FRONT
		bodyModel[834] = new ModelRendererTurbo(this, 28, 5, textureX, textureY, "prime3_f"); // Box 7 PRIME1-3 FRONT
		bodyModel[835] = new ModelRendererTurbo(this, 28, 1, textureX, textureY, "prime2_f"); // Box 8 PRIME1-2 FRONT
		bodyModel[836] = new ModelRendererTurbo(this, 19, 5, textureX, textureY, "prime4_f"); // Box 9 PRIME1-4 FRONT
		bodyModel[837] = new ModelRendererTurbo(this, 5, 22, textureX, textureY); // Box 88
		bodyModel[838] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 88
		bodyModel[839] = new ModelRendererTurbo(this, 3, 13, textureX, textureY); // Box 88
		bodyModel[840] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Box 88
		bodyModel[841] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 409 commander base
		bodyModel[842] = new ModelRendererTurbo(this, 289, 13, textureX, textureY, "commander_back"); // Box 410 commander beacon BACK
		bodyModel[843] = new ModelRendererTurbo(this, 287, 9, textureX, textureY); // Box 364 prime base
		bodyModel[844] = new ModelRendererTurbo(this, 287, 1, textureX, textureY, "prime1_back"); // Box 6 PRIME1-1 BACK
		bodyModel[845] = new ModelRendererTurbo(this, 278, 5, textureX, textureY, "prime3_back"); // Box 7 PRIME1-3 BACK
		bodyModel[846] = new ModelRendererTurbo(this, 278, 1, textureX, textureY, "prime2_back"); // Box 8 PRIME1-2 BACK
		bodyModel[847] = new ModelRendererTurbo(this, 287, 5, textureX, textureY, "prime4_back"); // Box 9 PRIME1-4 BACK
		bodyModel[848] = new ModelRendererTurbo(this, 67, 144, textureX, textureY,"numberboard_L_type_1"); // Numberboard L FRONT
		bodyModel[849] = new ModelRendererTurbo(this, 19, 144, textureX, textureY,"numberboard_R_type_1"); // Numberboard R FRONT
		bodyModel[850] = new ModelRendererTurbo(this, 434, 144, textureX, textureY,"numberboard_back_L_type_1"); // Numberboard L BACK
		bodyModel[851] = new ModelRendererTurbo(this, 482, 144, textureX, textureY,"numberboard_back_R_type_1"); // Numberboard R BACK
		bodyModel[852] = new ModelRendererTurbo(this, 24, 143, textureX, textureY,"markerlight_353_1"); // Box 353 markerlight FRONT
		bodyModel[853] = new ModelRendererTurbo(this, 62, 143, textureX, textureY,"markerlight_545_1"); // Box 545 markerlight FRONT
		bodyModel[854] = new ModelRendererTurbo(this, 477, 143, textureX, textureY,"markerlight_back_353_1"); // Box 353 markerlight BACK
		bodyModel[855] = new ModelRendererTurbo(this, 439, 143, textureX, textureY,"markerlight_back_545_1"); // Box 545 markerlight BACK
		bodyModel[856] = new ModelRendererTurbo(this, 276, 9, textureX, textureY); // Box 899
		bodyModel[857] = new ModelRendererTurbo(this, 280, 10, textureX, textureY); // Box 900
		bodyModel[858] = new ModelRendererTurbo(this, 305, 10, textureX, textureY); // Box 903
		bodyModel[859] = new ModelRendererTurbo(this, 305, 4, textureX, textureY); // Box 904
		bodyModel[860] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 905
		bodyModel[861] = new ModelRendererTurbo(this, 305, 7, textureX, textureY); // Box 906
		bodyModel[862] = new ModelRendererTurbo(this, 300, 4, textureX, textureY); // Box 907
		bodyModel[863] = new ModelRendererTurbo(this, 296, 1, textureX, textureY); // Box 908
		bodyModel[864] = new ModelRendererTurbo(this, 305, 22, textureX, textureY); // Box 909
		bodyModel[865] = new ModelRendererTurbo(this, 305, 16, textureX, textureY); // Box 910
		bodyModel[866] = new ModelRendererTurbo(this, 305, 13, textureX, textureY); // Box 911
		bodyModel[867] = new ModelRendererTurbo(this, 305, 19, textureX, textureY); // Box 912
		bodyModel[868] = new ModelRendererTurbo(this, 457, 170, textureX, textureY); // Box 497 EARR MU
		bodyModel[869] = new ModelRendererTurbo(this, 48, 170, textureX, textureY); // Box 912
		bodyModel[870] = new ModelRendererTurbo(this, 54, 170, textureX, textureY,"cull"); // Box 448 cull
		bodyModel[871] = new ModelRendererTurbo(this, 24, 170, textureX, textureY,"cull"); // Box 449 cull
		bodyModel[872] = new ModelRendererTurbo(this, 438, 170, textureX, textureY,"cull"); // Box 448 cull
		bodyModel[873] = new ModelRendererTurbo(this, 459, 170, textureX, textureY,"cull"); // Box 449 cull
		bodyModel[874] = new ModelRendererTurbo(this, 52, 13, textureX, textureY); // Box 560
		bodyModel[875] = new ModelRendererTurbo(this, 29, 9, textureX, textureY); // Box 560
		bodyModel[876] = new ModelRendererTurbo(this, 26, 14, textureX, textureY); // Box 560
		bodyModel[877] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 920
		bodyModel[878] = new ModelRendererTurbo(this, 70, 14, textureX, textureY); // Box 921
		bodyModel[879] = new ModelRendererTurbo(this, 258, 13, textureX, textureY); // Box 560
		bodyModel[880] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 560
		bodyModel[881] = new ModelRendererTurbo(this, 286, 14, textureX, textureY); // Box 560
		bodyModel[882] = new ModelRendererTurbo(this, 245, 9, textureX, textureY); // Box 920
		bodyModel[883] = new ModelRendererTurbo(this, 242, 14, textureX, textureY); // Box 921
		bodyModel[884] = new ModelRendererTurbo(this, 268, 13, textureX, textureY); // Box 927
		bodyModel[885] = new ModelRendererTurbo(this, 42, 13, textureX, textureY); // Box 927
		bodyModel[886] = new ModelRendererTurbo(this, 383, 180, textureX, textureY); // Box 929
		bodyModel[887] = new ModelRendererTurbo(this, 383, 177, textureX, textureY); // Box 930
		bodyModel[888] = new ModelRendererTurbo(this, 383, 183, textureX, textureY); // Box 931
		bodyModel[889] = new ModelRendererTurbo(this, 13, 170, textureX, textureY); // Box 447
		bodyModel[890] = new ModelRendererTurbo(this, 2, 170, textureX, textureY); // Box 934
		bodyModel[891] = new ModelRendererTurbo(this, 422, 157, textureX, textureY); // Box 447
		bodyModel[892] = new ModelRendererTurbo(this, 489, 170, textureX, textureY); // Box 934
		bodyModel[893] = new ModelRendererTurbo(this, 237, 139, textureX, textureY); // Box 0
		bodyModel[894] = new ModelRendererTurbo(this, 237, 90, textureX, textureY); // Box 938

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[500].setRotationPoint(30.84F, -15F, -3.83F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[501].setRotationPoint(33.22F, -15F, -3.83F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[502].setRotationPoint(16.3F, -17F, -3.83F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[503].setRotationPoint(18.68F, -17F, -3.83F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 24, 3, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.34F, 0F, 0F, -0.34F); // Box 0
		bodyModel[504].setRotationPoint(15.5F, -10F, -4.83F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[505].setRotationPoint(21.06F, -17F, -3.83F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[506].setRotationPoint(23.41F, -17F, -3.83F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[507].setRotationPoint(25.78F, -17F, -3.83F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[508].setRotationPoint(28.16F, -17F, -3.83F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[509].setRotationPoint(30.54F, -17F, -3.83F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[510].setRotationPoint(32.9F, -17F, -3.83F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[511].setRotationPoint(16F, -22.5F, -2F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 394
		bodyModel[512].setRotationPoint(16.25F, -15.28F, 3.5F);
		bodyModel[512].rotateAngleX = -0.78539816F;

		bodyModel[513].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 394
		bodyModel[513].setRotationPoint(17.29F, -17.75F, 3.5F);
		bodyModel[513].rotateAngleX = -0.78539816F;

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 0
		bodyModel[514].setRotationPoint(23.05F, -22.5F, 3F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 0
		bodyModel[515].setRotationPoint(27.75F, -22.5F, 3F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 0
		bodyModel[516].setRotationPoint(32.52F, -22.5F, 3F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 0
		bodyModel[517].setRotationPoint(18.3F, -22.5F, 3F);

		bodyModel[518].addBox(0F, 0F, 0F, 4, 6, 5, 0F); // Box 0
		bodyModel[518].setRotationPoint(38.5F, -6F, -10F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 0
		bodyModel[519].setRotationPoint(41.5F, -21F, 3F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[520].setRotationPoint(41.5F, -6F, 3F);

		bodyModel[521].addBox(0F, 0F, 0F, 4, 6, 5, 0F); // Box 615
		bodyModel[521].setRotationPoint(38.5F, -6F, 5F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 21, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		bodyModel[522].setRotationPoint(41.5F, -21F, -5F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 617
		bodyModel[523].setRotationPoint(41.5F, -9F, -5F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		bodyModel[524].setRotationPoint(38.5F, -21F, 4F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 619
		bodyModel[525].setRotationPoint(38.5F, -21F, -5F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F); // Box 361
		bodyModel[526].setRotationPoint(38.5F, -21F, 5F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.375F, 0F, 0F, 0.375F, 0F); // Box 621
		bodyModel[527].setRotationPoint(38.5F, -21F, -9F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[528].setRotationPoint(37F, -3F, 5F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 623
		bodyModel[529].setRotationPoint(37F, -3F, -9F);

		bodyModel[530].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 0
		bodyModel[530].setRotationPoint(-42.5F, -19F, -3F);

		bodyModel[531].addBox(0F, 0F, 0F, 4, 6, 5, 0F); // Box 0
		bodyModel[531].setRotationPoint(-42.5F, -6F, -10F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[532].setRotationPoint(-42.5F, -21F, 3F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[533].setRotationPoint(-42.5F, -9F, 3F);

		bodyModel[534].addBox(0F, 0F, 0F, 4, 6, 5, 0F); // Box 615
		bodyModel[534].setRotationPoint(-42.5F, -6F, 5F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 21, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		bodyModel[535].setRotationPoint(-42.5F, -21F, -5F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 617
		bodyModel[536].setRotationPoint(-42.5F, -6F, -5F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		bodyModel[537].setRotationPoint(-40.5F, -21F, 4F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 619
		bodyModel[538].setRotationPoint(-40.5F, -21F, -5F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F); // Box 361
		bodyModel[539].setRotationPoint(-41.5F, -21F, 5F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.375F, 0F, 0F, 0.375F, 0F); // Box 621
		bodyModel[540].setRotationPoint(-41.5F, -21F, -9F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[541].setRotationPoint(-38.5F, -3F, 5F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 623
		bodyModel[542].setRotationPoint(-38.5F, -3F, -9F);

		bodyModel[543].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 0
		bodyModel[543].setRotationPoint(42.5F, -9F, -5F);

		bodyModel[544].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 638
		bodyModel[544].setRotationPoint(-43.5F, -9F, -2F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[545].setRotationPoint(-35F, -22.5F, -2F);

		bodyModel[546].addBox(0F, 0F, 0F, 19, 4, 7, 0F); // Box 270
		bodyModel[546].setRotationPoint(-34.5F, -4F, -3.5F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 19, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[547].setRotationPoint(-34.5F, -4F, 3.5F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[548].setRotationPoint(-32.5F, -4F, -5.5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[549].setRotationPoint(-34.5F, -4F, -5.5F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 24, 9, 7, 0F,0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[550].setRotationPoint(-34.5F, -13F, -3.5F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 18, 2, 5, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[551].setRotationPoint(-34.5F, -15F, -2.5F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[552].setRotationPoint(-34.2F, -15F, 3.83F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[553].setRotationPoint(-31.82F, -15F, 3.83F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[554].setRotationPoint(-29.44F, -15F, 3.83F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[555].setRotationPoint(-27.09F, -15F, 3.83F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[556].setRotationPoint(-24.72F, -15F, 3.83F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[557].setRotationPoint(-22.34F, -15F, 3.83F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[558].setRotationPoint(-19.96F, -15F, 3.83F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[559].setRotationPoint(-17.58F, -15F, 3.83F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[560].setRotationPoint(-34.5F, -17F, -2.17F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[561].setRotationPoint(-32.12F, -17F, -2.17F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 24, 3, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, -5F, 0F, -0.34F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[562].setRotationPoint(-34.5F, -10F, 2.83F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[563].setRotationPoint(-29.74F, -17F, -2.17F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[564].setRotationPoint(-27.39F, -17F, -2.17F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[565].setRotationPoint(-25.02F, -17F, -2.17F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[566].setRotationPoint(-22.64F, -17F, -2.17F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[567].setRotationPoint(-20.26F, -17F, -2.17F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[568].setRotationPoint(-17.9F, -17F, -2.17F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F); // Box 306
		bodyModel[569].setRotationPoint(-33.25F, -15.28F, -3.5F);
		bodyModel[569].rotateAngleX = -0.78539816F;

		bodyModel[570].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0.22F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F); // Box 308
		bodyModel[570].setRotationPoint(-34.29F, -17.75F, -3.5F);
		bodyModel[570].rotateAngleX = -0.78539816F;

		bodyModel[571].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 0
		bodyModel[571].setRotationPoint(-33.5F, -22.5F, -4F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 0
		bodyModel[572].setRotationPoint(-28.75F, -22.5F, -4F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 0
		bodyModel[573].setRotationPoint(-24.05F, -22.5F, -4F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 0
		bodyModel[574].setRotationPoint(-19.28F, -22.5F, -4F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.67F, 0F, 0F, -0.67F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[575].setRotationPoint(-1F, -22.5F, 2.5F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[576].setRotationPoint(-1F, -21F, -5F);

		bodyModel[577].addBox(0F, 0F, 0F, 7, 9, 7, 0F); // Box 0
		bodyModel[577].setRotationPoint(-3.5F, -9F, -2F);

		bodyModel[578].addBox(0F, 0F, 0F, 4, 8, 4, 0F); // Box 0
		bodyModel[578].setRotationPoint(-2.5F, -8F, -6F);

		bodyModel[579].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 0
		bodyModel[579].setRotationPoint(-1.5F, -14F, -6F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[580].setRotationPoint(4.55F, -9F, 3.57F);
		bodyModel[580].rotateAngleY = 0.78539816F;

		bodyModel[581].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[581].setRotationPoint(-4F, -4F, -6F);
		bodyModel[581].rotateAngleY = 0.78539816F;

		bodyModel[582].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[582].setRotationPoint(-1F, -22F, -5F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 12, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[583].setRotationPoint(3.5F, -19F, -8.5F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[584].setRotationPoint(3.5F, -19F, -10F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[585].setRotationPoint(3.5F, -19F, 8F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[586].setRotationPoint(3.5F, -21F, -2.5F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[587].setRotationPoint(3.5F, -21F, -8.5F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[588].setRotationPoint(3.5F, -21F, 2.5F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 12, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[589].setRotationPoint(3.5F, -17F, -10F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[590].setRotationPoint(3.5F, -15F, -10F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 169
		bodyModel[591].setRotationPoint(3.5F, -15F, -9.5F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[592].setRotationPoint(3.5F, -15F, 9F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[593].setRotationPoint(3.5F, -15F, 8.5F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[594].setRotationPoint(3.5F, -15F, -3.5F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[595].setRotationPoint(3.5F, -15F, -6.5F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 351
		bodyModel[596].setRotationPoint(3.5F, -15F, 3.5F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 12, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[597].setRotationPoint(-15.5F, -19F, -8.5F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[598].setRotationPoint(-15.5F, -19F, -10F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[599].setRotationPoint(-15.5F, -19F, 8F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[600].setRotationPoint(-15.5F, -21F, -2.5F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[601].setRotationPoint(-15.5F, -21F, -8.5F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[602].setRotationPoint(-15.5F, -21F, 2.5F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 12, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[603].setRotationPoint(-15.5F, -17F, -10F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[604].setRotationPoint(-15.5F, -15F, -10F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 169
		bodyModel[605].setRotationPoint(-15.5F, -15F, -9.5F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[606].setRotationPoint(-15.5F, -15F, 9F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[607].setRotationPoint(-15.5F, -15F, 8.5F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[608].setRotationPoint(-15.5F, -15F, -3.5F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[609].setRotationPoint(-15.5F, -15F, -6.5F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 351
		bodyModel[610].setRotationPoint(-15.5F, -15F, 3.5F);

		bodyModel[611].addBox(0F, 0F, 0F, 5, 4, 12, 0F); // Box 0
		bodyModel[611].setRotationPoint(9F, -5F, -6F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[612].setRotationPoint(9F, -9F, -6F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[613].setRotationPoint(14F, -3.7F, 0F);
		bodyModel[613].rotateAngleX = -0.78539816F;

		bodyModel[614].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 0
		bodyModel[614].setRotationPoint(9F, -11.21F, -4.79F);
		bodyModel[614].rotateAngleX = -0.78539816F;

		bodyModel[615].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.47F, 0F, 0F, -0.47F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.47F, 0F, 0F, -0.47F); // Box 0
		bodyModel[615].setRotationPoint(9F, -9.79F, -3.37F);
		bodyModel[615].rotateAngleX = -0.78539816F;

		bodyModel[616].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 0
		bodyModel[616].setRotationPoint(8F, -4F, -1F);

		bodyModel[617].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 0
		bodyModel[617].setRotationPoint(8F, -6F, 1F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 0
		bodyModel[618].setRotationPoint(8F, -4F, 1F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[619].setRotationPoint(8F, -4F, -4F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[620].setRotationPoint(8F, -9F, 1F);

		bodyModel[621].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 0
		bodyModel[621].setRotationPoint(8F, -9F, -4F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F); // Box 0
		bodyModel[622].setRotationPoint(8F, -11.21F, -4.79F);
		bodyModel[622].rotateAngleX = -0.78539816F;

		bodyModel[623].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0.445F, -0.15F, 0F, 0.445F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[623].setRotationPoint(8F, -9F, -6F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.145F, 0.435F, 0F, -0.145F, 0.435F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[624].setRotationPoint(8F, -11F, -4F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[625].setRotationPoint(9F, -1F, -6F);

		bodyModel[626].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		bodyModel[626].setRotationPoint(6F, -1F, -2.5F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 0
		bodyModel[627].setRotationPoint(5.5F, -2.3F, -2.5F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[628].setRotationPoint(5.5F, -4.3F, -1.5F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[629].setRotationPoint(5.5F, -4.3F, -2.5F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 757
		bodyModel[630].setRotationPoint(5.5F, -4.3F, 1.5F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[631].setRotationPoint(5.5F, -7.3F, -1F);

		bodyModel[632].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[632].setRotationPoint(6.5F, -3.3F, 2F);
		bodyModel[632].rotateAngleX = -1.10828408F;

		bodyModel[633].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[633].setRotationPoint(6.5F, -3.3F, -2F);
		bodyModel[633].rotateAngleX = 1.10828408F;

		bodyModel[634].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 0
		bodyModel[634].setRotationPoint(5.15F, -7.5F, -0.7F);
		bodyModel[634].rotateAngleY = 0.78539816F;

		bodyModel[635].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[635].setRotationPoint(6.9F, -3.5F, 4F);
		bodyModel[635].rotateAngleY = -0.78539816F;

		bodyModel[636].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[636].setRotationPoint(7.6F, -3.5F, -4.7F);
		bodyModel[636].rotateAngleY = 0.78539816F;

		bodyModel[637].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[637].setRotationPoint(7.5F, -2.99F, 0F);
		bodyModel[637].rotateAngleX = -0.78539816F;

		bodyModel[638].addBox(0F, 0F, 0F, 5, 4, 12, 0F); // Box 293
		bodyModel[638].setRotationPoint(-14.5F, -5F, -6F);

		bodyModel[639].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[639].setRotationPoint(-14.5F, -9F, -6F);

		bodyModel[640].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 295
		bodyModel[640].setRotationPoint(-13.5F, -9.8F, 3.37F);
		bodyModel[640].rotateAngleX = 0.78539816F;

		bodyModel[641].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 296
		bodyModel[641].setRotationPoint(-9.5F, -4F, -1F);

		bodyModel[642].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 297
		bodyModel[642].setRotationPoint(-9.5F, -6F, -4F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[643].setRotationPoint(-9.5F, -4F, -4F);

		bodyModel[644].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 299
		bodyModel[644].setRotationPoint(-9.5F, -4F, 1F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[645].setRotationPoint(-9.5F, -9F, -4F);

		bodyModel[646].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 301
		bodyModel[646].setRotationPoint(-9.5F, -9F, -1F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0.12F, 0F, -1F, 0.12F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 302
		bodyModel[647].setRotationPoint(-9.5F, -9.8F, 3.37F);
		bodyModel[647].rotateAngleX = 0.78539816F;

		bodyModel[648].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.445F, -0.15F, 0F, 0.445F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 303
		bodyModel[648].setRotationPoint(-9.5F, -9F, 4F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.145F, 0.435F, 0F, -0.145F, 0.435F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[649].setRotationPoint(-9.5F, -11F, -1F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 305
		bodyModel[650].setRotationPoint(-14.5F, -1F, -6F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -0.47F, 0F, 0F, -0.47F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.47F, 0F, 0F, -0.47F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 835
		bodyModel[651].setRotationPoint(-12.5F, -8.38F, 1.96F);
		bodyModel[651].rotateAngleX = 0.78539816F;

		bodyModel[652].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[652].setRotationPoint(-16F, -3.7F, 0F);
		bodyModel[652].rotateAngleX = -0.78539816F;

		bodyModel[653].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[653].setRotationPoint(-8.5F, -2.99F, 0F);
		bodyModel[653].rotateAngleX = -0.78539816F;

		bodyModel[654].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		bodyModel[654].setRotationPoint(-7.5F, -1F, -2.5F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 0
		bodyModel[655].setRotationPoint(-8F, -2.3F, -2.5F);

		bodyModel[656].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[656].setRotationPoint(-8F, -4.3F, -1.5F);

		bodyModel[657].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[657].setRotationPoint(-8F, -4.3F, -2.5F);

		bodyModel[658].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 757
		bodyModel[658].setRotationPoint(-8F, -4.3F, 1.5F);

		bodyModel[659].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[659].setRotationPoint(-8F, -7.3F, -1F);

		bodyModel[660].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[660].setRotationPoint(-7F, -3.3F, 2F);
		bodyModel[660].rotateAngleX = -1.10828408F;

		bodyModel[661].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[661].setRotationPoint(-7F, -3.3F, -2F);
		bodyModel[661].rotateAngleX = 1.10828408F;

		bodyModel[662].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[662].setRotationPoint(-8.82F, -3.5F, 4F);
		bodyModel[662].rotateAngleY = -0.78539816F;

		bodyModel[663].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[663].setRotationPoint(-8.12F, -3.5F, -4.7F);
		bodyModel[663].rotateAngleY = 0.78539816F;

		bodyModel[664].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 0
		bodyModel[664].setRotationPoint(-5.64F, -7.5F, -0.7F);
		bodyModel[664].rotateAngleY = 0.78539816F;

		bodyModel[665].addBox(0F, 0F, 0F, 7, 10, 2, 0F); // Box 0
		bodyModel[665].setRotationPoint(4.5F, -10F, 8F);

		bodyModel[666].addBox(0F, 0F, 0F, 7, 10, 2, 0F); // Box 0
		bodyModel[666].setRotationPoint(-11.5F, -10F, -10F);

		bodyModel[667].addBox(0F, 0F, 0F, 10, 10, 2, 0F); // Box 0
		bodyModel[667].setRotationPoint(-13.5F, -10F, 8F);

		bodyModel[668].addBox(0F, 0F, 0F, 10, 10, 2, 0F); // Box 0
		bodyModel[668].setRotationPoint(3.5F, -10F, -10F);

		bodyModel[669].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[669].setRotationPoint(15.5F, -17.4F, -7.25F);

		bodyModel[670].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[670].setRotationPoint(16.5F, -17.75F, 6.15F);
		bodyModel[670].rotateAngleX = -0.78539816F;

		bodyModel[671].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 717
		bodyModel[671].setRotationPoint(16.5F, -17.75F, -6.15F);
		bodyModel[671].rotateAngleX = -0.78539816F;

		bodyModel[672].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.01F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 169
		bodyModel[672].setRotationPoint(15.5F, -15.4F, 2.25F);

		bodyModel[673].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.26F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 719
		bodyModel[673].setRotationPoint(-16.25F, -15.4F, -5.25F);

		bodyModel[674].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[674].setRotationPoint(-16.25F, -17.4F, -7.25F);

		bodyModel[675].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[675].setRotationPoint(-18.25F, -17.75F, 6.15F);
		bodyModel[675].rotateAngleX = -0.78539816F;

		bodyModel[676].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 717
		bodyModel[676].setRotationPoint(-18.25F, -17.75F, -6.15F);
		bodyModel[676].rotateAngleX = -0.78539816F;

		bodyModel[677].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[677].setRotationPoint(38.5F, -20.5F, -4F);

		bodyModel[678].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[678].setRotationPoint(39F, -22.5F, -0.5F);

		bodyModel[679].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[679].setRotationPoint(-41.5F, -20.5F, -4F);

		bodyModel[680].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[680].setRotationPoint(-40F, -22.5F, -0.5F);

		bodyModel[681].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[681].setRotationPoint(-21F, -7F, -10F);

		bodyModel[682].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[682].setRotationPoint(-21F, -5F, -10F);

		bodyModel[683].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[683].setRotationPoint(38.5F, -9F, 0.0999999999999998F);
		bodyModel[683].rotateAngleY = 0.78539816F;

		bodyModel[684].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[684].setRotationPoint(-38.5F, -9F, -4.35F);
		bodyModel[684].rotateAngleY = 0.78539816F;

		bodyModel[685].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		bodyModel[685].setRotationPoint(40.5F, -5.5F, -4F);

		bodyModel[686].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[686].setRotationPoint(40.5F, -6.5F, -4F);

		bodyModel[687].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 734
		bodyModel[687].setRotationPoint(-41.5F, -5.5F, -2F);

		bodyModel[688].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 735
		bodyModel[688].setRotationPoint(-41.5F, -6.5F, -2F);

		bodyModel[689].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[689].setRotationPoint(-40.79F, -14.5F, -0.7F);
		bodyModel[689].rotateAngleY = 0.78539816F;

		bodyModel[690].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[690].setRotationPoint(-40.79F, -15.23F, -1F);
		bodyModel[690].rotateAngleZ = -0.78539816F;

		bodyModel[691].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.08F, -0.25F, -0.25F, 0.08F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.08F, -0.25F, -0.25F, 0.08F); // Box 0
		bodyModel[691].setRotationPoint(-40.79F, -15.23F, -2.23F);
		bodyModel[691].rotateAngleZ = -0.78539816F;

		bodyModel[692].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[692].setRotationPoint(-40.79F, -15.23F, 2.85F);
		bodyModel[692].rotateAngleX = -0.78539816F;

		bodyModel[693].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.5F, -0.5F, -0.645F); // Box 0
		bodyModel[693].setRotationPoint(-40.79F, -15.23F, 2.85F);
		bodyModel[693].rotateAngleZ = -0.78539816F;

		bodyModel[694].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[694].setRotationPoint(-38.5F, -15.23F, 2.85F);
		bodyModel[694].rotateAngleX = -0.78539816F;

		bodyModel[695].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[695].setRotationPoint(-40.79F, -9.34F, -2.23F);
		bodyModel[695].rotateAngleX = -0.78539816F;

		bodyModel[696].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.11F, 0F, -0.25F, -0.11F, 0F, -0.25F, -0.11F, -0.5F, -0.25F, -0.11F, -0.5F); // Box 0
		bodyModel[696].setRotationPoint(-41.32F, -14.52F, -2.05F);
		bodyModel[696].rotateAngleY = -0.78539816F;

		bodyModel[697].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.35F, -0.25F, -0.75F, -0.35F, -0.25F, -0.75F, -0.65F, -0.25F, -0.25F, -0.65F); // Box 0
		bodyModel[697].setRotationPoint(-40.79F, -15.23F, -2.58F);
		bodyModel[697].rotateAngleZ = -0.78539816F;

		bodyModel[698].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -1F, -0.5F, -0.65F, -0.75F); // Box 0
		bodyModel[698].setRotationPoint(-41.32F, -8.63F, -2.05F);
		bodyModel[698].rotateAngleY = -0.78539816F;

		bodyModel[699].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[699].setRotationPoint(40.79F, -14.5F, -0.7F);
		bodyModel[699].rotateAngleY = 0.78539816F;

		bodyModel[700].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[700].setRotationPoint(40.79F, -15.23F, -1F);
		bodyModel[700].rotateAngleZ = -0.78539816F;

		bodyModel[701].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.08F, -0.25F, -0.25F, 0.08F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.08F, -0.25F, -0.25F, 0.08F); // Box 0
		bodyModel[701].setRotationPoint(40.79F, -15.23F, -2.85F);
		bodyModel[701].rotateAngleZ = -0.78539816F;

		bodyModel[702].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[702].setRotationPoint(16.29F, -15.23F, -2.85F);
		bodyModel[702].rotateAngleX = -0.78539816F;

		bodyModel[703].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[703].setRotationPoint(36F, -15.23F, -2.85F);
		bodyModel[703].rotateAngleX = -0.78539816F;

		bodyModel[704].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F); // Box 0
		bodyModel[704].setRotationPoint(39.79F, -9.34F, 2.22F);
		bodyModel[704].rotateAngleX = -0.78539816F;

		bodyModel[705].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.11F, 0F, -0.25F, -0.11F, 0F, -0.25F, -0.11F, -0.5F, -0.25F, -0.11F, -0.5F); // Box 0
		bodyModel[705].setRotationPoint(40.26F, -14.52F, 2.4F);
		bodyModel[705].rotateAngleY = -0.78539816F;

		bodyModel[706].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.35F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.65F, -0.75F, -0.25F, -0.35F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, -0.65F, -0.75F, -0.25F, -0.65F); // Box 0
		bodyModel[706].setRotationPoint(40.79F, -15.23F, -3.2F);
		bodyModel[706].rotateAngleZ = -0.78539816F;

		bodyModel[707].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.5F, -0.5F, -0.65F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.25F, -1F); // Box 0
		bodyModel[707].setRotationPoint(40.79F, -15.23F, 2.23F);
		bodyModel[707].rotateAngleZ = -0.78539816F;

		bodyModel[708].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.5F, -0.65F, -0.75F, -0.25F, -1F, -0.5F); // Box 0
		bodyModel[708].setRotationPoint(40.26F, -8.63F, 2.4F);
		bodyModel[708].rotateAngleY = -0.78539816F;

		bodyModel[709].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[709].setRotationPoint(-32.5F, -10F, -10F);

		bodyModel[710].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[710].setRotationPoint(26.5F, -10F, -10F);

		bodyModel[711].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F); // Box 389
		bodyModel[711].setRotationPoint(-48.49F, -11.5F, 5F);

		bodyModel[712].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 758
		bodyModel[712].setRotationPoint(47.15F, -10.75F, -6.75F);

		bodyModel[713].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 759
		bodyModel[713].setRotationPoint(47.15F, -11.75F, -9.25F);

		bodyModel[714].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 760
		bodyModel[714].setRotationPoint(47.27F, -11.5F, -8.5F);

		bodyModel[715].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 761
		bodyModel[715].setRotationPoint(46.83F, -9F, -8.62F);
		bodyModel[715].rotateAngleY = -0.78539816F;

		bodyModel[716].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		bodyModel[716].setRotationPoint(47.9F, -10F, -8.5F);

		bodyModel[717].addShapeBox(-1F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 763
		bodyModel[717].setRotationPoint(47F, -12F, -3.5F);
		bodyModel[717].rotateAngleY = 0.52359878F;

		bodyModel[718].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 764
		bodyModel[718].setRotationPoint(46.75F, -12.5F, -6.25F);

		bodyModel[719].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 765
		bodyModel[719].setRotationPoint(48.15F, -14F, -3.99F);
		bodyModel[719].rotateAngleY = 0.52359878F;

		bodyModel[720].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 766
		bodyModel[720].setRotationPoint(47F, -10F, -4.22F);
		bodyModel[720].rotateAngleY = 0.78539816F;

		bodyModel[721].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 767
		bodyModel[721].setRotationPoint(48F, -11.5F, -7F);

		bodyModel[722].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 768
		bodyModel[722].setRotationPoint(48.49F, -11.5F, -8F);

		bodyModel[723].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, 0F, 0.125F, 1.05F, 0F, 0.125F, -1.05F, 0.25F, -0.125F, -1.05F, 0.25F, -0.125F, 1.05F, 0F, 0.125F); // Box 31
		bodyModel[723].setRotationPoint(-48.42F, -18F, -0.5F);

		bodyModel[724].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.25F, -0.125F, -1.05F, 0.25F, -0.125F, 1.05F, 0F, 0.125F, 1.05F, 0F, 0.125F, -1.05F, 0.25F, -0.125F); // Box 31
		bodyModel[724].setRotationPoint(47.42F, -18F, -0.5F);

		bodyModel[725].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.335F, 0F, -1F, -0.335F, 0F, -1F, -0.335F, 0F, 0F, -0.335F, 0F); // Box 0
		bodyModel[725].setRotationPoint(4.5F, -22.5F, -3F);

		bodyModel[726].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.335F, 0F, -1F, -0.335F, 0F, -1F, -0.335F, 0F, 0F, -0.335F, 0F); // Box 0
		bodyModel[726].setRotationPoint(-14.5F, -22.5F, -3F);

		bodyModel[727].addShapeBox(0F, 0F, 0F, 21, 0, 6, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[727].setRotationPoint(4.5F, -22.51F, -3F);

		bodyModel[728].addShapeBox(0F, 0F, 0F, 21, 0, 6, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[728].setRotationPoint(-14.5F, -22.51F, -3F);

		bodyModel[729].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F); // Box 0 cull
		bodyModel[729].setRotationPoint(16F, -22.25F, -4.5F);

		bodyModel[730].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F); // Box 0 cull
		bodyModel[730].setRotationPoint(-35F, -22.25F, -4.5F);

		bodyModel[731].addBox(0F, -1F, 0F, 0, 1, 3, 0F); // Box 439 bug deflector
		bodyModel[731].setRotationPoint(-57.75F, -12.25F, -1.5F);
		bodyModel[731].rotateAngleZ = -0.41887902F;

		bodyModel[732].addBox(0F, -1F, 0F, 0, 1, 3, 0F); // Box 439 bug deflector
		bodyModel[732].setRotationPoint(57.75F, -12.25F, -1.5F);
		bodyModel[732].rotateAngleZ = 0.41887902F;

		bodyModel[733].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[733].setRotationPoint(58.7F, 1F, -3F);

		bodyModel[734].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[734].setRotationPoint(-59.7F, 1F, -3F);

		bodyModel[735].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 778
		bodyModel[735].setRotationPoint(45.5F, -20.5F, 0.5F);

		bodyModel[736].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[736].setRotationPoint(45.5F, -21.5F, 0.5F);

		bodyModel[737].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 780
		bodyModel[737].setRotationPoint(-46.5F, -20.5F, -1.5F);

		bodyModel[738].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 781
		bodyModel[738].setRotationPoint(-47.5F, -21.5F, -1.5F);

		bodyModel[739].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[739].setRotationPoint(-58.69F, -7.5F, 1F);

		bodyModel[740].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[740].setRotationPoint(-58.69F, -7.5F, 0F);

		bodyModel[741].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[741].setRotationPoint(-58.69F, -7.5F, -2F);

		bodyModel[742].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[742].setRotationPoint(-58.69F, -7.5F, -2F);

		bodyModel[743].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[743].setRotationPoint(-58.69F, -5.5F, 1F);

		bodyModel[744].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[744].setRotationPoint(-58.69F, -5.5F, -2F);

		bodyModel[745].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[745].setRotationPoint(-58.69F, -4.5F, 0F);

		bodyModel[746].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[746].setRotationPoint(-58.69F, -4.5F, -2F);

		bodyModel[747].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front 2beam bottom A
		bodyModel[747].setRotationPoint(-57.94F, -5.5F, 0F);

		bodyModel[748].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front 2beam bottom A
		bodyModel[748].setRotationPoint(-57.94F, -5.5F, 0F);

		bodyModel[749].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big bottom
		bodyModel[749].setRotationPoint(-57.94F, -6.75F, -1.25F);

		bodyModel[750].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front 2beam bottom B
		bodyModel[750].setRotationPoint(-57.94F, -5.5F, 0F);
		bodyModel[750].rotateAngleX = 1.57079633F;

		bodyModel[751].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front 2beam bottom B
		bodyModel[751].setRotationPoint(-57.94F, -5.5F, 0F);
		bodyModel[751].rotateAngleX = 1.57079633F;

		bodyModel[752].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F); // Box 430
		bodyModel[752].setRotationPoint(-58.44F, -4F, 1F);

		bodyModel[753].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.07F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F); // Box 431
		bodyModel[753].setRotationPoint(-58.44F, -4F, 0F);

		bodyModel[754].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.202F, 0F, -1F, 0.202F, 0F, -1F, 0.202F, 0F, 0F, -0.202F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		bodyModel[754].setRotationPoint(-58.44F, -5.5F, 1F);

		bodyModel[755].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.202F, 0F, 0F, 0.202F, 0F, 0F, 0.202F, 0F, -1F, -0.202F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 433
		bodyModel[755].setRotationPoint(-58.44F, -5.5F, -2F);

		bodyModel[756].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[756].setRotationPoint(-58.7F, -7.5F, 1F);

		bodyModel[757].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F); // Box 403
		bodyModel[757].setRotationPoint(-58.7F, -7.5F, 0F);

		bodyModel[758].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[758].setRotationPoint(-58.7F, -5.5F, 1F);

		bodyModel[759].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[759].setRotationPoint(-58.7F, -4.5F, 0F);

		bodyModel[760].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 489
		bodyModel[760].setRotationPoint(-58.7F, -7.5F, -2F);

		bodyModel[761].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 490
		bodyModel[761].setRotationPoint(-58.7F, -7.5F, -2F);

		bodyModel[762].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F); // Box 491
		bodyModel[762].setRotationPoint(-58.7F, -5.5F, -2F);

		bodyModel[763].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[763].setRotationPoint(-58.7F, -4.5F, -2F);

		bodyModel[764].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front small bottom
		bodyModel[764].setRotationPoint(-57.94F, -5.5F, 0F);

		bodyModel[765].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.005F, -0.5F, -0.5F, 0.005F, -0.5F, -0.5F, 0.005F, -0.5F, 0F, -0.005F, -0.5F, 0F, 0.202F, 0F, -1F, -0.202F, 0F, -1F, -0.202F, 0F, 0F, 0.202F, 0F, 0F); // Box 430
		bodyModel[765].setRotationPoint(-58.03F, -7.5F, 1F);

		bodyModel[766].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.005F, 0F, 0F, 0.005F, 0F, 0F, 0.005F, 0F, 0F, -0.005F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 430
		bodyModel[766].setRotationPoint(-57.89F, -8F, 1F);

		bodyModel[767].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, 0F, -0.5F, 0F, 0.07F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[767].setRotationPoint(-58.02F, -8F, 0F);

		bodyModel[768].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.005F, -0.5F, 0F, 0.005F, -0.5F, 0F, 0.005F, -0.5F, -0.5F, -0.005F, -0.5F, -0.5F, 0.202F, 0F, 0F, -0.202F, 0F, 0F, -0.202F, 0F, -1F, 0.202F, 0F, -1F); // Box 528
		bodyModel[768].setRotationPoint(-58.03F, -7.5F, -2F);

		bodyModel[769].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.005F, 0F, 0F, 0.005F, 0F, 0F, 0.005F, 0F, 0F, -0.005F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 529
		bodyModel[769].setRotationPoint(-57.89F, -8F, -2F);

		bodyModel[770].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.07F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 530
		bodyModel[770].setRotationPoint(-58.02F, -8F, -1F);

		bodyModel[771].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F); // Box 531
		bodyModel[771].setRotationPoint(-58.44F, -4F, -2F);

		bodyModel[772].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.07F, -0.5F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F); // Box 532
		bodyModel[772].setRotationPoint(-58.44F, -4F, -1F);

		bodyModel[773].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[773].setRotationPoint(-57.69F, -7.5F, 0F);

		bodyModel[774].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.96F, -0.5F, -0.5F, -0.96F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[774].setRotationPoint(-57.69F, -7.5F, -2F);

		bodyModel[775].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.96F, -0.5F, -0.5F, -0.96F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[775].setRotationPoint(-57.69F, -5.5F, -2F);

		bodyModel[776].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[776].setRotationPoint(-57.69F, -5.5F, 0F);

		bodyModel[777].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.415F, 0F, 0F, 0.415F, 0F, 0F, 0.415F, 0F, 0F, -0.415F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[777].setRotationPoint(-59F, -3F, -2F);

		bodyModel[778].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[778].setRotationPoint(57.69F, -7.5F, 1F);

		bodyModel[779].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[779].setRotationPoint(57.69F, -7.5F, 0F);

		bodyModel[780].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[780].setRotationPoint(57.69F, -7.5F, -2F);

		bodyModel[781].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[781].setRotationPoint(57.69F, -7.5F, -2F);

		bodyModel[782].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[782].setRotationPoint(57.69F, -5.5F, 1F);

		bodyModel[783].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[783].setRotationPoint(57.69F, -5.5F, -2F);

		bodyModel[784].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[784].setRotationPoint(57.69F, -4.5F, 0F);

		bodyModel[785].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[785].setRotationPoint(57.69F, -4.5F, -2F);

		bodyModel[786].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight back 2beam bottom A
		bodyModel[786].setRotationPoint(57.7F, -5.5F, 0F);

		bodyModel[787].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight back 2beam bottom A
		bodyModel[787].setRotationPoint(57.7F, -5.5F, 0F);

		bodyModel[788].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight back big bottom
		bodyModel[788].setRotationPoint(57.7F, -6.75F, -1.25F);

		bodyModel[789].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight back 2beam bottom B
		bodyModel[789].setRotationPoint(57.7F, -5.5F, 0F);
		bodyModel[789].rotateAngleX = 1.57079633F;

		bodyModel[790].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight back 2beam bottom B
		bodyModel[790].setRotationPoint(57.7F, -5.5F, 0F);
		bodyModel[790].rotateAngleX = 1.57079633F;

		bodyModel[791].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F); // Box 430
		bodyModel[791].setRotationPoint(57.44F, -4F, 1F);

		bodyModel[792].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0.07F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F); // Box 431
		bodyModel[792].setRotationPoint(57.44F, -4F, 0F);

		bodyModel[793].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.202F, 0F, -1F, -0.202F, 0F, -1F, -0.202F, 0F, 0F, 0.202F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		bodyModel[793].setRotationPoint(57.44F, -5.5F, 1F);

		bodyModel[794].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.202F, 0F, 0F, -0.202F, 0F, 0F, -0.202F, 0F, -1F, 0.202F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 433
		bodyModel[794].setRotationPoint(57.44F, -5.5F, -2F);

		bodyModel[795].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[795].setRotationPoint(58.7F, -7.5F, 1F);

		bodyModel[796].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F); // Box 403
		bodyModel[796].setRotationPoint(58.7F, -7.5F, 0F);

		bodyModel[797].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[797].setRotationPoint(58.7F, -5.5F, 1F);

		bodyModel[798].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[798].setRotationPoint(58.7F, -4.5F, 0F);

		bodyModel[799].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 489
		bodyModel[799].setRotationPoint(58.7F, -7.5F, -2F);

		bodyModel[800].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 490
		bodyModel[800].setRotationPoint(58.7F, -7.5F, -2F);

		bodyModel[801].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F); // Box 491
		bodyModel[801].setRotationPoint(58.7F, -5.5F, -2F);

		bodyModel[802].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[802].setRotationPoint(58.7F, -4.5F, -2F);

		bodyModel[803].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headligh tback small bottom
		bodyModel[803].setRotationPoint(57.7F, -5.5F, 0F);

		bodyModel[804].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.005F, -0.5F, -0.5F, -0.005F, -0.5F, -0.5F, -0.005F, -0.5F, 0F, 0.005F, -0.5F, 0F, -0.202F, 0F, -1F, 0.202F, 0F, -1F, 0.202F, 0F, 0F, -0.202F, 0F, 0F); // Box 430
		bodyModel[804].setRotationPoint(57.03F, -7.5F, 1F);

		bodyModel[805].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.005F, 0F, 0F, -0.005F, 0F, 0F, -0.005F, 0F, 0F, 0.005F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F); // Box 430
		bodyModel[805].setRotationPoint(56.89F, -8F, 1F);

		bodyModel[806].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.07F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[806].setRotationPoint(57.02F, -8F, 0F);

		bodyModel[807].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.005F, -0.5F, 0F, -0.005F, -0.5F, 0F, -0.005F, -0.5F, -0.5F, 0.005F, -0.5F, -0.5F, -0.202F, 0F, 0F, 0.202F, 0F, 0F, 0.202F, 0F, -1F, -0.202F, 0F, -1F); // Box 528
		bodyModel[807].setRotationPoint(57.03F, -7.5F, -2F);

		bodyModel[808].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.005F, 0F, 0F, -0.005F, 0F, 0F, -0.005F, 0F, 0F, 0.005F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F); // Box 529
		bodyModel[808].setRotationPoint(56.89F, -8F, -2F);

		bodyModel[809].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.07F, -0.5F, 0F); // Box 530
		bodyModel[809].setRotationPoint(57.02F, -8F, -1F);

		bodyModel[810].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F); // Box 531
		bodyModel[810].setRotationPoint(57.44F, -4F, -2F);

		bodyModel[811].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.07F, -0.5F, 0F, 0F, -0.5F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F); // Box 532
		bodyModel[811].setRotationPoint(57.44F, -4F, -1F);

		bodyModel[812].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[812].setRotationPoint(57.65F, -7.5F, 0F);

		bodyModel[813].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.96F, -0.5F, -0.5F, -0.96F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[813].setRotationPoint(57.65F, -7.5F, -2F);

		bodyModel[814].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.96F, -0.5F, -0.5F, -0.96F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[814].setRotationPoint(57.65F, -5.5F, -2F);

		bodyModel[815].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[815].setRotationPoint(57.65F, -5.5F, 0F);

		bodyModel[816].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.415F, 0F, 0F, -0.415F, 0F, 0F, -0.415F, 0F, 0F, 0.415F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[816].setRotationPoint(58F, -3F, -2F);

		bodyModel[817].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 0
		bodyModel[817].setRotationPoint(-1F, -22.5F, -5F);

		bodyModel[818].addShapeBox(-1F, 0F, -2F, 1, 2, 4, 0F,-0.15F, 0F, -0.17F, 0F, 0F, -0.17F, 0F, 0F, 0F, -0.08F, 0F, 0F, -0.41F, -0.125F, -0.17F, 0F, -0.125F, -0.17F, 0F, -0.125F, 0F, -0.4F, -0.125F, 0F); // Box 525
		bodyModel[818].setRotationPoint(56.65F, -9.87F, 7.02F);
		bodyModel[818].rotateAngleY = 0.47298423F;

		bodyModel[819].addShapeBox(-0.05F, 0F, -2F, 1, 2, 5, 0F,0F, -0.05F, -0.22F, -0.95F, -0.05F, -0.22F, -0.95F, -0.05F, -1.05F, 0F, -0.05F, -1.05F, 0F, -0.175F, -0.22F, -0.95F, -0.175F, -0.22F, -0.95F, -0.175F, -1.05F, 0F, -0.175F, -1.05F); // Numberboard R type 2 BACK
		bodyModel[819].setRotationPoint(56.7F, -9.87F, 7.04F);
		bodyModel[819].rotateAngleY = 0.47298423F;

		bodyModel[820].addShapeBox(-1F, 0F, -2F, 1, 2, 4, 0F,-0.08F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.17F, -0.15F, 0F, -0.17F, -0.4F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.17F, -0.41F, -0.125F, -0.17F); // Box 524
		bodyModel[820].setRotationPoint(56.65F, -9.87F, -7.02F);
		bodyModel[820].rotateAngleY = -0.47298423F;

		bodyModel[821].addShapeBox(-0.05F, 0F, -2F, 1, 2, 5, 0F,0F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -1.22F, 0F, -0.05F, -1.22F, 0F, -0.175F, -0.05F, -0.95F, -0.175F, -0.05F, -0.95F, -0.175F, -1.22F, 0F, -0.175F, -1.22F); // Numberboard L Type 2 BACK
		bodyModel[821].setRotationPoint(56.7F, -9.87F, -7.04F);
		bodyModel[821].rotateAngleY = -0.47298423F;

		bodyModel[822].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[822].setRotationPoint(-46.5F, -21F, -0.5F);

		bodyModel[823].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 80
		bodyModel[823].setRotationPoint(-37F, -24F, -1F);

		bodyModel[824].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[824].setRotationPoint(-41F, -23F, -1F);

		bodyModel[825].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[825].setRotationPoint(-48.5F, -22F, -0.5F);

		bodyModel[826].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[826].setRotationPoint(-47F, -22F, 0.5F);

		bodyModel[827].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[827].setRotationPoint(-48F, -22F, -1.5F);

		bodyModel[828].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[828].setRotationPoint(-43F, -23F, -0.5F);

		bodyModel[829].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon FRONT
		bodyModel[829].setRotationPoint(-43F, -24F, -0.5F);

		bodyModel[830].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[830].setRotationPoint(-48F, -22F, -1.5F);

		bodyModel[831].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[831].setRotationPoint(-48F, -23F, -1.5F);

		bodyModel[832].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[832].setRotationPoint(-43.5F, -23F, -1F);

		bodyModel[833].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1 FRONT
		bodyModel[833].setRotationPoint(-43.5F, -23.5F, -1F);

		bodyModel[834].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3 FRONT
		bodyModel[834].setRotationPoint(-43.5F, -23.5F, -1F);

		bodyModel[835].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2 FRONT
		bodyModel[835].setRotationPoint(-43.5F, -23.5F, -1F);

		bodyModel[836].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4 FRONT
		bodyModel[836].setRotationPoint(-43.5F, -23.5F, -1F);

		bodyModel[837].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[837].setRotationPoint(-46.5F, -20.75F, 3.5F);

		bodyModel[838].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[838].setRotationPoint(-48.5F, -21.75F, 3.5F);

		bodyModel[839].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[839].setRotationPoint(-47.5F, -21.75F, 4.5F);

		bodyModel[840].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[840].setRotationPoint(-48F, -21.75F, 2.5F);

		bodyModel[841].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[841].setRotationPoint(42F, -23F, -0.5F);

		bodyModel[842].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon BACK
		bodyModel[842].setRotationPoint(42F, -24F, -0.5F);

		bodyModel[843].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[843].setRotationPoint(41.5F, -23F, -1F);

		bodyModel[844].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1 BACK
		bodyModel[844].setRotationPoint(41.5F, -23.5F, -1F);

		bodyModel[845].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3 BACK
		bodyModel[845].setRotationPoint(41.5F, -23.5F, -1F);

		bodyModel[846].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2 BACK
		bodyModel[846].setRotationPoint(41.5F, -23.5F, -1F);

		bodyModel[847].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4 BACK
		bodyModel[847].setRotationPoint(41.5F, -23.5F, -1F);

		bodyModel[848].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Numberboard L FRONT
		bodyModel[848].setRotationPoint(-51.5F, -6F, -11.01F);

		bodyModel[849].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Numberboard R FRONT
		bodyModel[849].setRotationPoint(-51.5F, -6F, 11.01F);

		bodyModel[850].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Numberboard L BACK
		bodyModel[850].setRotationPoint(49.5F, -6F, -11.01F);

		bodyModel[851].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Numberboard R BACK
		bodyModel[851].setRotationPoint(49.5F, -6F, 11.01F);

		bodyModel[852].addShapeBox(-0.5F, -0.5F, -0.75F, 1, 1, 1, 0F,-0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 353 markerlight FRONT
		bodyModel[852].setRotationPoint(-53.5F, -5.5F, 10.34F);
		bodyModel[852].rotateAngleY = 0.37960911F;

		bodyModel[853].addShapeBox(-0.5F, -0.5F, -0.25F, 1, 1, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F); // Box 545 markerlight FRONT
		bodyModel[853].setRotationPoint(-53.5F, -5.5F, -10.34F);
		bodyModel[853].rotateAngleY = -0.37960911F;

		bodyModel[854].addShapeBox(-0.5F, -0.5F, -0.75F, 1, 1, 1, 0F,-0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 353 markerlight BACK
		bodyModel[854].setRotationPoint(53.5F, -5.5F, 10.34F);
		bodyModel[854].rotateAngleY = -0.37960911F;

		bodyModel[855].addShapeBox(-0.5F, -0.5F, -0.25F, 1, 1, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F); // Box 545 markerlight BACK
		bodyModel[855].setRotationPoint(53.5F, -5.5F, -10.34F);
		bodyModel[855].rotateAngleY = 0.37960911F;

		bodyModel[856].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 899
		bodyModel[856].setRotationPoint(36F, -24F, 1F);

		bodyModel[857].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 900
		bodyModel[857].setRotationPoint(38F, -23F, 1F);

		bodyModel[858].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 903
		bodyModel[858].setRotationPoint(45.5F, -21F, -0.5F);

		bodyModel[859].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 904
		bodyModel[859].setRotationPoint(45.5F, -22F, -0.5F);

		bodyModel[860].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 905
		bodyModel[860].setRotationPoint(45F, -22F, -1.5F);

		bodyModel[861].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 906
		bodyModel[861].setRotationPoint(45.5F, -22F, 0.5F);

		bodyModel[862].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 907
		bodyModel[862].setRotationPoint(47F, -22F, 0.5F);

		bodyModel[863].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 908
		bodyModel[863].setRotationPoint(45F, -23F, 0.5F);

		bodyModel[864].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 909
		bodyModel[864].setRotationPoint(45.5F, -20.75F, -4.5F);

		bodyModel[865].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
		bodyModel[865].setRotationPoint(45.5F, -21.75F, -4.5F);

		bodyModel[866].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911
		bodyModel[866].setRotationPoint(45.5F, -21.75F, -5.5F);

		bodyModel[867].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 912
		bodyModel[867].setRotationPoint(45.5F, -21.75F, -3.5F);

		bodyModel[868].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.315F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.29F, 0F, 0F, -0.585F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.015F, 0F, 0F); // Box 497 EARR MU
		bodyModel[868].setRotationPoint(57F, -10F, 3F);

		bodyModel[869].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.29F, 0F, 0F, -0.315F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.015F, 0F, 0F, -0.585F, 0F, 0F, 0F, 0F, 0F); // Box 912
		bodyModel[869].setRotationPoint(-58F, -10F, -5F);

		bodyModel[870].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 448 cull
		bodyModel[870].setRotationPoint(-59.5F, 7F, -8F);

		bodyModel[871].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 449 cull
		bodyModel[871].setRotationPoint(-59.5F, 7F, 3F);

		bodyModel[872].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 448 cull
		bodyModel[872].setRotationPoint(57.5F, 7F, -8F);

		bodyModel[873].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 449 cull
		bodyModel[873].setRotationPoint(57.5F, 7F, 3F);

		bodyModel[874].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.325F, 0F, 0F, 0.325F, 0F, 0F, 0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.325F, -0.25F, 0F, 0.325F, -0.25F, 0F); // Box 560
		bodyModel[874].setRotationPoint(-47.65F, -20.75F, -3.5F);

		bodyModel[875].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 560
		bodyModel[875].setRotationPoint(-47.15F, -20.75F, 3.5F);

		bodyModel[876].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 560
		bodyModel[876].setRotationPoint(-47.15F, -19.25F, 9.5F);

		bodyModel[877].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.625F, 0F, 0F, 0.625F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.625F, -0.25F, 0F, 0.625F, -0.25F, 0F); // Box 920
		bodyModel[877].setRotationPoint(-47.15F, -20.75F, -9.5F);

		bodyModel[878].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 921
		bodyModel[878].setRotationPoint(-47.15F, -19.25F, -10.5F);

		bodyModel[879].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.325F, 0F, 0F, -0.325F, 0F, 0F, -0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.325F, -0.25F, 0F, -0.325F, -0.25F, 0F); // Box 560
		bodyModel[879].setRotationPoint(47.65F, -20.75F, -3.5F);

		bodyModel[880].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,-0.625F, 0F, 0F, 0.625F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.625F, -0.25F, 0F, 0.625F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 560
		bodyModel[880].setRotationPoint(47.15F, -20.75F, 3.5F);

		bodyModel[881].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 560
		bodyModel[881].setRotationPoint(47.15F, -19.25F, 9.5F);

		bodyModel[882].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F); // Box 920
		bodyModel[882].setRotationPoint(47.15F, -20.75F, -9.5F);

		bodyModel[883].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 921
		bodyModel[883].setRotationPoint(47.15F, -19.25F, -10.5F);

		bodyModel[884].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-0.325F, 0F, 0F, 0.325F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.325F, -0.25F, 0F, 0.325F, -0.25F, 0F, 0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Box 927
		bodyModel[884].setRotationPoint(47.65F, -20.75F, 1.5F);

		bodyModel[885].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0.325F, 0F, 0F, -0.325F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.325F, -0.25F, 0F, -0.325F, -0.25F, 0F, -0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F); // Box 927
		bodyModel[885].setRotationPoint(-47.65F, -20.75F, 1.5F);

		bodyModel[886].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F); // Box 929
		bodyModel[886].setRotationPoint(52.3F, 2.75F, -7.75F);

		bodyModel[887].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 930
		bodyModel[887].setRotationPoint(52.3F, 2F, -7.75F);

		bodyModel[888].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 931
		bodyModel[888].setRotationPoint(52.55F, 3F, -8F);

		bodyModel[889].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1.285F, 0F, 0F, 1.07F, 0F, -0.425F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, -0.5F, -0.175F, 0F, 0F, 0.175F, 0F, 0F); // Box 447
		bodyModel[889].setRotationPoint(-59F, 8F, -7F);

		bodyModel[890].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, 0F, 0F, -0.1F, 0F, 0F, 1.07F, 0F, -0.425F, -1.285F, 0F, 0F, 0.175F, 0F, 0F, -0.175F, 0F, 0F, 1F, 0F, -0.5F, -1.25F, 0F, 0F); // Box 934
		bodyModel[890].setRotationPoint(-59F, 8F, 3F);

		bodyModel[891].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1.07F, 0F, -0.425F, -1.285F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, 1F, 0F, -0.5F, -1.25F, 0F, 0F, 0.175F, 0F, 0F, -0.175F, 0F, 0F); // Box 447
		bodyModel[891].setRotationPoint(58F, 8F, -7F);

		bodyModel[892].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.1F, 0F, 0F, 0.1F, 0F, 0F, -1.285F, 0F, 0F, 1.07F, 0F, -0.425F, -0.175F, 0F, 0F, 0.175F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, -0.5F); // Box 934
		bodyModel[892].setRotationPoint(58F, 8F, 3F);

		bodyModel[893].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 0
		bodyModel[893].setRotationPoint(-2F, -15F, -11.01F);

		bodyModel[894].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 938
		bodyModel[894].setRotationPoint(-2F, -15F, 11.01F);
	}
	ModelAlcoPATruck_new bogie = new ModelAlcoPATruck_new();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
		if (GetColor(entity) == 123456) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/Alco_PA_truck_new_CNJ_blue.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-2.15F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4.3F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}else if (GetColor(entity) == 0) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/Alco_PA_truck_new_silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-2.15F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4.3F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/Alco_PA_truck_new_black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-2.15F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4.3F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}
	}
}