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

public class Model0_6_6_0_1000_2_DE_68 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public Model0_6_6_0_1000_2_DE_68() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[950];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 155, 134, textureX, textureY); // Box 120
		bodyModel[1] = new ModelRendererTurbo(this, 163, 85, textureX, textureY); // Box 481
		bodyModel[2] = new ModelRendererTurbo(this, 99, 153, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 115, 136, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 138, 169, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 106, 167, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 84, 180, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 126, 153, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 495
		bodyModel[9] = new ModelRendererTurbo(this, 106, 161, textureX, textureY); // Box 496
		bodyModel[10] = new ModelRendererTurbo(this, 127, 161, textureX, textureY); // Box 497
		bodyModel[11] = new ModelRendererTurbo(this, 117, 180, textureX, textureY); // Box 114
		bodyModel[12] = new ModelRendererTurbo(this, 117, 177, textureX, textureY); // Box 74
		bodyModel[13] = new ModelRendererTurbo(this, 117, 183, textureX, textureY); // Box 78
		bodyModel[14] = new ModelRendererTurbo(this, 88, 179, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 115, 179, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 127, 120, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 144, 134, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 127, 71, textureX, textureY); // Box 60
		bodyModel[19] = new ModelRendererTurbo(this, 152, 85, textureX, textureY); // Box 61
		bodyModel[20] = new ModelRendererTurbo(this, 132, 111, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 131, 62, textureX, textureY); // Box 105
		bodyModel[22] = new ModelRendererTurbo(this, 173, 119, textureX, textureY); // Box 79
		bodyModel[23] = new ModelRendererTurbo(this, 159, 119, textureX, textureY); // Box 80
		bodyModel[24] = new ModelRendererTurbo(this, 173, 70, textureX, textureY); // Box 108
		bodyModel[25] = new ModelRendererTurbo(this, 159, 70, textureX, textureY); // Box 109
		bodyModel[26] = new ModelRendererTurbo(this, 138, 115, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 162, 124, textureX, textureY); // Front side door L
		bodyModel[28] = new ModelRendererTurbo(this, 162, 75, textureX, textureY); // Front side door R
		bodyModel[29] = new ModelRendererTurbo(this, 302, 20, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 376, 10, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 370, 7, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 316, 6, textureX, textureY); // Box 146
		bodyModel[33] = new ModelRendererTurbo(this, 316, 1, textureX, textureY); // Box 147
		bodyModel[34] = new ModelRendererTurbo(this, 138, 66, textureX, textureY); // Box 252
		bodyModel[35] = new ModelRendererTurbo(this, 329, 6, textureX, textureY); // Box 389
		bodyModel[36] = new ModelRendererTurbo(this, 331, 1, textureX, textureY); // Box 389
		bodyModel[37] = new ModelRendererTurbo(this, 324, 3, textureX, textureY,"speedo_front"); // Box 197
		bodyModel[38] = new ModelRendererTurbo(this, 337, 15, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 345, 6, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 342, 2, textureX, textureY); // Box 389
		bodyModel[41] = new ModelRendererTurbo(this, 41, 159, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 125, 87, textureX, textureY,"cull"); // Box 120 cull
		bodyModel[44] = new ModelRendererTurbo(this, 150, 85, textureX, textureY,"cull"); // Box 120 cull
		bodyModel[45] = new ModelRendererTurbo(this, 129, 114, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[46] = new ModelRendererTurbo(this, 129, 65, textureX, textureY,"cull"); // Box 346 cull
		bodyModel[47] = new ModelRendererTurbo(this, 124, 114, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[48] = new ModelRendererTurbo(this, 124, 65, textureX, textureY); // Box 348
		bodyModel[49] = new ModelRendererTurbo(this, 14, 40, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 0
		bodyModel[51] = new ModelRendererTurbo(this, 17, 32, textureX, textureY); // Box 88
		bodyModel[52] = new ModelRendererTurbo(this, 21, 57, textureX, textureY); // Box 0
		bodyModel[53] = new ModelRendererTurbo(this, 21, 20, textureX, textureY); // Box 336
		bodyModel[54] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 355
		bodyModel[55] = new ModelRendererTurbo(this, 60, 53, textureX, textureY); // Box 0
		bodyModel[56] = new ModelRendererTurbo(this, 60, 27, textureX, textureY); // Box 361
		bodyModel[57] = new ModelRendererTurbo(this, 288, 41, textureX, textureY); // Box 0
		bodyModel[58] = new ModelRendererTurbo(this, 293, 48, textureX, textureY); // Box 0
		bodyModel[59] = new ModelRendererTurbo(this, 295, 25, textureX, textureY); // Box 396
		bodyModel[60] = new ModelRendererTurbo(this, 250, 33, textureX, textureY); // Box 0
		bodyModel[61] = new ModelRendererTurbo(this, 23, 77, textureX, textureY); // Box 207
		bodyModel[62] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 529
		bodyModel[63] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 208
		bodyModel[64] = new ModelRendererTurbo(this, 1, 35, textureX, textureY); // Box 209
		bodyModel[65] = new ModelRendererTurbo(this, 2, 32, textureX, textureY); // Box 208
		bodyModel[66] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Box 194
		bodyModel[67] = new ModelRendererTurbo(this, 6, 74, textureX, textureY); // Box 209
		bodyModel[68] = new ModelRendererTurbo(this, 126, 62, textureX, textureY); // Box 105
		bodyModel[69] = new ModelRendererTurbo(this, 119, 69, textureX, textureY); // Box 105
		bodyModel[70] = new ModelRendererTurbo(this, 22, 61, textureX, textureY); // Box 420
		bodyModel[71] = new ModelRendererTurbo(this, 127, 111, textureX, textureY); // Box 423
		bodyModel[72] = new ModelRendererTurbo(this, 3, 66, textureX, textureY); // Box 429
		bodyModel[73] = new ModelRendererTurbo(this, 34, 77, textureX, textureY); // Box 430
		bodyModel[74] = new ModelRendererTurbo(this, 45, 74, textureX, textureY); // Box 431
		bodyModel[75] = new ModelRendererTurbo(this, 112, 113, textureX, textureY); // Box 0
		bodyModel[76] = new ModelRendererTurbo(this, 112, 64, textureX, textureY); // Box 0
		bodyModel[77] = new ModelRendererTurbo(this, 14, 16, textureX, textureY); // Box 88
		bodyModel[78] = new ModelRendererTurbo(this, 10, 13, textureX, textureY); // Box 88
		bodyModel[79] = new ModelRendererTurbo(this, 10, 10, textureX, textureY); // Box 88
		bodyModel[80] = new ModelRendererTurbo(this, 10, 7, textureX, textureY); // Box 88
		bodyModel[81] = new ModelRendererTurbo(this, 108, 143, textureX, textureY); // Box 0
		bodyModel[82] = new ModelRendererTurbo(this, 32, 113, textureX, textureY); // Box 103
		bodyModel[83] = new ModelRendererTurbo(this, 31, 109, textureX, textureY); // Box 103
		bodyModel[84] = new ModelRendererTurbo(this, 52, 109, textureX, textureY); // Box 103
		bodyModel[85] = new ModelRendererTurbo(this, 53, 113, textureX, textureY); // Box 103
		bodyModel[86] = new ModelRendererTurbo(this, 32, 117, textureX, textureY); // Box 103
		bodyModel[87] = new ModelRendererTurbo(this, 53, 117, textureX, textureY); // Box 103
		bodyModel[88] = new ModelRendererTurbo(this, 31, 121, textureX, textureY); // Box 103
		bodyModel[89] = new ModelRendererTurbo(this, 52, 121, textureX, textureY); // Box 103
		bodyModel[90] = new ModelRendererTurbo(this, 50, 129, textureX, textureY,"headlight2beamUA1"); // Box 186 headlight front 2beam top A
		bodyModel[91] = new ModelRendererTurbo(this, 50, 135, textureX, textureY,"headlight2beamUA2"); // Box 187 headlight front 2beam top A
		bodyModel[92] = new ModelRendererTurbo(this, 41, 134, textureX, textureY,"big_headlight_top"); // Box 169 headlight front big top
		bodyModel[93] = new ModelRendererTurbo(this, 34, 129, textureX, textureY,"headlight2beamUB1"); // Box 186 headlight front 2beam top B
		bodyModel[94] = new ModelRendererTurbo(this, 34, 135, textureX, textureY,"headlight2beamUB2"); // Box 187 headlight front 2beam top B
		bodyModel[95] = new ModelRendererTurbo(this, 1, 163, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 10, 163, textureX, textureY); // Box 0
		bodyModel[97] = new ModelRendererTurbo(this, 28, 158, textureX, textureY); // Box 0
		bodyModel[98] = new ModelRendererTurbo(this, 19, 159, textureX, textureY); // Box 496
		bodyModel[99] = new ModelRendererTurbo(this, 21, 166, textureX, textureY); // Box 496
		bodyModel[100] = new ModelRendererTurbo(this, 83, 163, textureX, textureY); // Box 445
		bodyModel[101] = new ModelRendererTurbo(this, 74, 163, textureX, textureY); // Box 446
		bodyModel[102] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Box 447
		bodyModel[103] = new ModelRendererTurbo(this, 65, 162, textureX, textureY); // Box 448
		bodyModel[104] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 449
		bodyModel[105] = new ModelRendererTurbo(this, 259, 31, textureX, textureY); // Box 208
		bodyModel[106] = new ModelRendererTurbo(this, 273, 31, textureX, textureY); // Box 413
		bodyModel[107] = new ModelRendererTurbo(this, 249, 30, textureX, textureY); // Box 209
		bodyModel[108] = new ModelRendererTurbo(this, 277, 30, textureX, textureY); // Box 413
		bodyModel[109] = new ModelRendererTurbo(this, 273, 39, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 247, 39, textureX, textureY); // Box 416
		bodyModel[111] = new ModelRendererTurbo(this, 1, 84, textureX, textureY); // Box 529
		bodyModel[112] = new ModelRendererTurbo(this, 113, 123, textureX, textureY); // Box 429
		bodyModel[113] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 430
		bodyModel[114] = new ModelRendererTurbo(this, 119, 118, textureX, textureY); // Box 431
		bodyModel[115] = new ModelRendererTurbo(this, 62, 76, textureX, textureY); // Box 434
		bodyModel[116] = new ModelRendererTurbo(this, 62, 84, textureX, textureY); // Box 436
		bodyModel[117] = new ModelRendererTurbo(this, 115, 65, textureX, textureY); // Box 105
		bodyModel[118] = new ModelRendererTurbo(this, 115, 114, textureX, textureY); // Box 438
		bodyModel[119] = new ModelRendererTurbo(this, 331, 11, textureX, textureY); // Box 389
		bodyModel[120] = new ModelRendererTurbo(this, 343, 11, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 336, 10, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 40, 144, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 27, 142, textureX, textureY); // Box 497
		bodyModel[124] = new ModelRendererTurbo(this, 51, 142, textureX, textureY); // Box 463
		bodyModel[125] = new ModelRendererTurbo(this, 38, 114, textureX, textureY); // Box 167
		bodyModel[126] = new ModelRendererTurbo(this, 45, 114, textureX, textureY); // Box 166
		bodyModel[127] = new ModelRendererTurbo(this, 45, 109, textureX, textureY); // Box 165
		bodyModel[128] = new ModelRendererTurbo(this, 38, 109, textureX, textureY); // Box 164
		bodyModel[129] = new ModelRendererTurbo(this, 51, 141, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 46, 141, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 36, 141, textureX, textureY); // Box 430
		bodyModel[132] = new ModelRendererTurbo(this, 41, 141, textureX, textureY); // Box 431
		bodyModel[133] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 430
		bodyModel[134] = new ModelRendererTurbo(this, 60, 113, textureX, textureY); // Box 433
		bodyModel[135] = new ModelRendererTurbo(this, 4, 117, textureX, textureY); // Box 497
		bodyModel[136] = new ModelRendererTurbo(this, 113, 74, textureX, textureY); // Box 435
		bodyModel[137] = new ModelRendererTurbo(this, 118, 74, textureX, textureY); // Box 436
		bodyModel[138] = new ModelRendererTurbo(this, 9, 146, textureX, textureY); // Box 437
		bodyModel[139] = new ModelRendererTurbo(this, 18, 146, textureX, textureY); // Box 438
		bodyModel[140] = new ModelRendererTurbo(this, 25, 109, textureX, textureY); // Box 430
		bodyModel[141] = new ModelRendererTurbo(this, 30, 88, textureX, textureY); // Box 208
		bodyModel[142] = new ModelRendererTurbo(this, 5, 106, textureX, textureY); // Box 438
		bodyModel[143] = new ModelRendererTurbo(this, 73, 117, textureX, textureY); // Box 445
		bodyModel[144] = new ModelRendererTurbo(this, 12, 113, textureX, textureY); // Box 497
		bodyModel[145] = new ModelRendererTurbo(this, 15, 99, textureX, textureY); // Box 209
		bodyModel[146] = new ModelRendererTurbo(this, 14, 99, textureX, textureY); // Box 209
		bodyModel[147] = new ModelRendererTurbo(this, 69, 99, textureX, textureY); // Box 468
		bodyModel[148] = new ModelRendererTurbo(this, 14, 107, textureX, textureY); // Box 209
		bodyModel[149] = new ModelRendererTurbo(this, 8, 102, textureX, textureY); // Box 209
		bodyModel[150] = new ModelRendererTurbo(this, 6, 111, textureX, textureY); // Box 209
		bodyModel[151] = new ModelRendererTurbo(this, 65, 107, textureX, textureY); // Box 472
		bodyModel[152] = new ModelRendererTurbo(this, 39, 100, textureX, textureY); // Box 430
		bodyModel[153] = new ModelRendererTurbo(this, 38, 96, textureX, textureY); // Box 430
		bodyModel[154] = new ModelRendererTurbo(this, 60, 109, textureX, textureY); // Box 459
		bodyModel[155] = new ModelRendererTurbo(this, 46, 100, textureX, textureY); // Box 460
		bodyModel[156] = new ModelRendererTurbo(this, 30, 92, textureX, textureY); // Box 208
		bodyModel[157] = new ModelRendererTurbo(this, 45, 96, textureX, textureY); // Box 465
		bodyModel[158] = new ModelRendererTurbo(this, 45, 88, textureX, textureY); // Box 466
		bodyModel[159] = new ModelRendererTurbo(this, 45, 92, textureX, textureY); // Box 467
		bodyModel[160] = new ModelRendererTurbo(this, 27, 101, textureX, textureY); // Box 209
		bodyModel[161] = new ModelRendererTurbo(this, 58, 99, textureX, textureY); // Box 470
		bodyModel[162] = new ModelRendererTurbo(this, 47, 101, textureX, textureY); // Box 471
		bodyModel[163] = new ModelRendererTurbo(this, 6, 88, textureX, textureY); // Box 209
		bodyModel[164] = new ModelRendererTurbo(this, 18, 90, textureX, textureY); // Box 209
		bodyModel[165] = new ModelRendererTurbo(this, 65, 88, textureX, textureY); // Box 480
		bodyModel[166] = new ModelRendererTurbo(this, 53, 90, textureX, textureY); // Box 481
		bodyModel[167] = new ModelRendererTurbo(this, 37, 119, textureX, textureY); // Box 403
		bodyModel[168] = new ModelRendererTurbo(this, 40, 119, textureX, textureY); // Box 403
		bodyModel[169] = new ModelRendererTurbo(this, 38, 123, textureX, textureY); // Box 406
		bodyModel[170] = new ModelRendererTurbo(this, 40, 125, textureX, textureY); // Box 406
		bodyModel[171] = new ModelRendererTurbo(this, 50, 119, textureX, textureY); // Box 489
		bodyModel[172] = new ModelRendererTurbo(this, 45, 119, textureX, textureY); // Box 490
		bodyModel[173] = new ModelRendererTurbo(this, 49, 123, textureX, textureY); // Box 491
		bodyModel[174] = new ModelRendererTurbo(this, 45, 125, textureX, textureY); // Box 492
		bodyModel[175] = new ModelRendererTurbo(this, 42, 129, textureX, textureY,"small_headlight_top"); // Box 186 headlight front small top
		bodyModel[176] = new ModelRendererTurbo(this, 29, 139, textureX, textureY); // Box 0
		bodyModel[177] = new ModelRendererTurbo(this, 59, 139, textureX, textureY); // Box 539
		bodyModel[178] = new ModelRendererTurbo(this, 1, 136, textureX, textureY,"markerlight_353_3"); // Markerlight R type 3 FRONT
		bodyModel[179] = new ModelRendererTurbo(this, 6, 136, textureX, textureY); // Box 216
		bodyModel[180] = new ModelRendererTurbo(this, 24, 136, textureX, textureY,"markerlight_545_3"); // Markerlight L type 3 FRONT
		bodyModel[181] = new ModelRendererTurbo(this, 16, 140, textureX, textureY,"numberboard_L_type_3"); // Numberboard L type 3 FRONT
		bodyModel[182] = new ModelRendererTurbo(this, 7, 140, textureX, textureY,"numberboard_R_type_3"); // Numberboard R type 3 FRONT
		bodyModel[183] = new ModelRendererTurbo(this, 73, 146, textureX, textureY); // Box 517
		bodyModel[184] = new ModelRendererTurbo(this, 64, 146, textureX, textureY); // Box 518
		bodyModel[185] = new ModelRendererTurbo(this, 15, 136, textureX, textureY); // Box 519
		bodyModel[186] = new ModelRendererTurbo(this, 23, 126, textureX, textureY); // Box 525
		bodyModel[187] = new ModelRendererTurbo(this, 10, 125, textureX, textureY,"numberboard_R_type_2"); // Numberboard R type 2 FRONT
		bodyModel[188] = new ModelRendererTurbo(this, 57, 126, textureX, textureY); // Box 524
		bodyModel[189] = new ModelRendererTurbo(this, 68, 125, textureX, textureY,"numberboard_L_type_2"); // Numberboard L Type 2 FRONT
		bodyModel[190] = new ModelRendererTurbo(this, 25, 133, textureX, textureY,"markerlight_353_2"); // Box 353 markerlight type 3 FRONT
		bodyModel[191] = new ModelRendererTurbo(this, 60, 133, textureX, textureY,"markerlight_545_2"); // Box 545 markerlight type 3 FRONT
		bodyModel[192] = new ModelRendererTurbo(this, 2, 90, textureX, textureY); // Box 60
		bodyModel[193] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 437
		bodyModel[194] = new ModelRendererTurbo(this, 72, 106, textureX, textureY); // Box 554
		bodyModel[195] = new ModelRendererTurbo(this, 61, 113, textureX, textureY); // Box 555
		bodyModel[196] = new ModelRendererTurbo(this, 75, 102, textureX, textureY); // Box 556
		bodyModel[197] = new ModelRendererTurbo(this, 73, 111, textureX, textureY); // Box 557
		bodyModel[198] = new ModelRendererTurbo(this, 77, 90, textureX, textureY); // Box 558
		bodyModel[199] = new ModelRendererTurbo(this, 76, 97, textureX, textureY); // Box 559
		bodyModel[200] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 560
		bodyModel[201] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Box 561
		bodyModel[202] = new ModelRendererTurbo(this, 4, 63, textureX, textureY); // Box 562
		bodyModel[203] = new ModelRendererTurbo(this, 358, 153, textureX, textureY); // Box 0
		bodyModel[204] = new ModelRendererTurbo(this, 364, 136, textureX, textureY); // Box 0
		bodyModel[205] = new ModelRendererTurbo(this, 358, 169, textureX, textureY); // Box 0
		bodyModel[206] = new ModelRendererTurbo(this, 385, 167, textureX, textureY); // Box 0
		bodyModel[207] = new ModelRendererTurbo(this, 410, 180, textureX, textureY); // Box 1
		bodyModel[208] = new ModelRendererTurbo(this, 363, 142, textureX, textureY); // Box 0
		bodyModel[209] = new ModelRendererTurbo(this, 358, 165, textureX, textureY); // Box 495
		bodyModel[210] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 496
		bodyModel[211] = new ModelRendererTurbo(this, 363, 134, textureX, textureY); // Box 497
		bodyModel[212] = new ModelRendererTurbo(this, 390, 179, textureX, textureY); // Box 2
		bodyModel[213] = new ModelRendererTurbo(this, 369, 179, textureX, textureY); // Box 2
		bodyModel[214] = new ModelRendererTurbo(this, 455, 159, textureX, textureY); // Box 0
		bodyModel[215] = new ModelRendererTurbo(this, 385, 143, textureX, textureY); // Box 0
		bodyModel[216] = new ModelRendererTurbo(this, 497, 163, textureX, textureY); // Box 0
		bodyModel[217] = new ModelRendererTurbo(this, 488, 163, textureX, textureY); // Box 0
		bodyModel[218] = new ModelRendererTurbo(this, 466, 158, textureX, textureY); // Box 0
		bodyModel[219] = new ModelRendererTurbo(this, 479, 159, textureX, textureY); // Box 496
		bodyModel[220] = new ModelRendererTurbo(this, 479, 166, textureX, textureY); // Box 496
		bodyModel[221] = new ModelRendererTurbo(this, 415, 163, textureX, textureY); // Box 445
		bodyModel[222] = new ModelRendererTurbo(this, 424, 163, textureX, textureY); // Box 446
		bodyModel[223] = new ModelRendererTurbo(this, 442, 158, textureX, textureY); // Box 447
		bodyModel[224] = new ModelRendererTurbo(this, 433, 159, textureX, textureY); // Box 448
		bodyModel[225] = new ModelRendererTurbo(this, 435, 166, textureX, textureY); // Box 449
		bodyModel[226] = new ModelRendererTurbo(this, 125, 154, textureX, textureY); // Box 0
		bodyModel[227] = new ModelRendererTurbo(this, 125, 179, textureX, textureY); // Box 0
		bodyModel[228] = new ModelRendererTurbo(this, 306, 134, textureX, textureY); // Box 120
		bodyModel[229] = new ModelRendererTurbo(this, 294, 85, textureX, textureY); // Box 481
		bodyModel[230] = new ModelRendererTurbo(this, 343, 120, textureX, textureY); // Box 0
		bodyModel[231] = new ModelRendererTurbo(this, 305, 142, textureX, textureY); // Box 0
		bodyModel[232] = new ModelRendererTurbo(this, 343, 71, textureX, textureY); // Box 60
		bodyModel[233] = new ModelRendererTurbo(this, 303, 85, textureX, textureY); // Box 61
		bodyModel[234] = new ModelRendererTurbo(this, 319, 119, textureX, textureY); // Box 79
		bodyModel[235] = new ModelRendererTurbo(this, 305, 119, textureX, textureY); // Box 80
		bodyModel[236] = new ModelRendererTurbo(this, 319, 70, textureX, textureY); // Box 108
		bodyModel[237] = new ModelRendererTurbo(this, 305, 70, textureX, textureY); // Box 109
		bodyModel[238] = new ModelRendererTurbo(this, 308, 124, textureX, textureY); // Rear side door L
		bodyModel[239] = new ModelRendererTurbo(this, 308, 75, textureX, textureY); // Rear side door R
		bodyModel[240] = new ModelRendererTurbo(this, 292, 85, textureX, textureY,"cull"); // Box 120 cull
		bodyModel[241] = new ModelRendererTurbo(this, 319, 87, textureX, textureY,"cull"); // Box 120 cull
		bodyModel[242] = new ModelRendererTurbo(this, 357, 69, textureX, textureY); // Box 105
		bodyModel[243] = new ModelRendererTurbo(this, 363, 123, textureX, textureY); // Box 429
		bodyModel[244] = new ModelRendererTurbo(this, 354, 123, textureX, textureY); // Box 430
		bodyModel[245] = new ModelRendererTurbo(this, 357, 118, textureX, textureY); // Box 431
		bodyModel[246] = new ModelRendererTurbo(this, 455, 144, textureX, textureY); // Box 0
		bodyModel[247] = new ModelRendererTurbo(this, 466, 142, textureX, textureY); // Box 497
		bodyModel[248] = new ModelRendererTurbo(this, 442, 142, textureX, textureY); // Box 463
		bodyModel[249] = new ModelRendererTurbo(this, 363, 74, textureX, textureY); // Box 435
		bodyModel[250] = new ModelRendererTurbo(this, 354, 74, textureX, textureY); // Box 436
		bodyModel[251] = new ModelRendererTurbo(this, 488, 146, textureX, textureY); // Box 437
		bodyModel[252] = new ModelRendererTurbo(this, 479, 146, textureX, textureY); // Box 438
		bodyModel[253] = new ModelRendererTurbo(this, 472, 134, textureX, textureY); // Box 0
		bodyModel[254] = new ModelRendererTurbo(this, 444, 139, textureX, textureY); // Box 539
		bodyModel[255] = new ModelRendererTurbo(this, 439, 136, textureX, textureY,"markerlight_353_back_3"); // Markerlight R type 3 BACK
		bodyModel[256] = new ModelRendererTurbo(this, 430, 136, textureX, textureY); // Box 216
		bodyModel[257] = new ModelRendererTurbo(this, 416, 136, textureX, textureY,"markerlight_545_back_3"); // Markerlight L type 3 BACK
		bodyModel[258] = new ModelRendererTurbo(this, 422, 140, textureX, textureY,"numberboard_L_back_type_3"); // Numberboard L type 3 BACK
		bodyModel[259] = new ModelRendererTurbo(this, 431, 140, textureX, textureY,"numberboard_R_back_type_3"); // Numberboard R type 3 BACK
		bodyModel[260] = new ModelRendererTurbo(this, 424, 146, textureX, textureY); // Box 517
		bodyModel[261] = new ModelRendererTurbo(this, 433, 146, textureX, textureY); // Box 518
		bodyModel[262] = new ModelRendererTurbo(this, 421, 136, textureX, textureY); // Box 519
		bodyModel[263] = new ModelRendererTurbo(this, 476, 133, textureX, textureY,"markerlight_353_back_2"); // Box 353 markerlight type 3 BACK
		bodyModel[264] = new ModelRendererTurbo(this, 440, 133, textureX, textureY,"markerlight_545_back_2"); // Box 545 markerlight type 3 BACK
		bodyModel[265] = new ModelRendererTurbo(this, 343, 111, textureX, textureY); // Box 0
		bodyModel[266] = new ModelRendererTurbo(this, 343, 62, textureX, textureY); // Box 105
		bodyModel[267] = new ModelRendererTurbo(this, 461, 21, textureX, textureY); // Box 0
		bodyModel[268] = new ModelRendererTurbo(this, 362, 24, textureX, textureY); // Box 0
		bodyModel[269] = new ModelRendererTurbo(this, 362, 19, textureX, textureY); // Box 0
		bodyModel[270] = new ModelRendererTurbo(this, 496, 3, textureX, textureY); // Box 146
		bodyModel[271] = new ModelRendererTurbo(this, 503, 1, textureX, textureY); // Box 147
		bodyModel[272] = new ModelRendererTurbo(this, 343, 114, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[273] = new ModelRendererTurbo(this, 343, 65, textureX, textureY,"cull"); // Box 346 cull
		bodyModel[274] = new ModelRendererTurbo(this, 352, 114, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[275] = new ModelRendererTurbo(this, 352, 65, textureX, textureY); // Box 348
		bodyModel[276] = new ModelRendererTurbo(this, 350, 62, textureX, textureY); // Box 105
		bodyModel[277] = new ModelRendererTurbo(this, 350, 111, textureX, textureY); // Box 423
		bodyModel[278] = new ModelRendererTurbo(this, 366, 113, textureX, textureY); // Box 0
		bodyModel[279] = new ModelRendererTurbo(this, 366, 64, textureX, textureY); // Box 0
		bodyModel[280] = new ModelRendererTurbo(this, 357, 65, textureX, textureY); // Box 105
		bodyModel[281] = new ModelRendererTurbo(this, 357, 114, textureX, textureY); // Box 438
		bodyModel[282] = new ModelRendererTurbo(this, 459, 77, textureX, textureY); // Box 207
		bodyModel[283] = new ModelRendererTurbo(this, 493, 79, textureX, textureY); // Box 529
		bodyModel[284] = new ModelRendererTurbo(this, 430, 44, textureX, textureY); // Box 208
		bodyModel[285] = new ModelRendererTurbo(this, 428, 36, textureX, textureY); // Box 209
		bodyModel[286] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 208
		bodyModel[287] = new ModelRendererTurbo(this, 438, 33, textureX, textureY); // Box 194
		bodyModel[288] = new ModelRendererTurbo(this, 418, 62, textureX, textureY); // Box 209
		bodyModel[289] = new ModelRendererTurbo(this, 435, 67, textureX, textureY); // Box 429
		bodyModel[290] = new ModelRendererTurbo(this, 448, 77, textureX, textureY); // Box 430
		bodyModel[291] = new ModelRendererTurbo(this, 431, 74, textureX, textureY); // Box 431
		bodyModel[292] = new ModelRendererTurbo(this, 488, 84, textureX, textureY); // Box 529
		bodyModel[293] = new ModelRendererTurbo(this, 426, 76, textureX, textureY); // Box 434
		bodyModel[294] = new ModelRendererTurbo(this, 426, 84, textureX, textureY); // Box 436
		bodyModel[295] = new ModelRendererTurbo(this, 430, 50, textureX, textureY); // Box 560
		bodyModel[296] = new ModelRendererTurbo(this, 428, 56, textureX, textureY); // Box 561
		bodyModel[297] = new ModelRendererTurbo(this, 433, 64, textureX, textureY); // Box 562
		bodyModel[298] = new ModelRendererTurbo(this, 403, 46, textureX, textureY); // Box 0
		bodyModel[299] = new ModelRendererTurbo(this, 399, 58, textureX, textureY); // Box 0
		bodyModel[300] = new ModelRendererTurbo(this, 405, 38, textureX, textureY); // Box 88
		bodyModel[301] = new ModelRendererTurbo(this, 401, 69, textureX, textureY); // Box 0
		bodyModel[302] = new ModelRendererTurbo(this, 409, 34, textureX, textureY); // Box 336
		bodyModel[303] = new ModelRendererTurbo(this, 300, 10, textureX, textureY); // Box 88
		bodyModel[304] = new ModelRendererTurbo(this, 296, 7, textureX, textureY); // Box 88
		bodyModel[305] = new ModelRendererTurbo(this, 296, 16, textureX, textureY); // Box 88
		bodyModel[306] = new ModelRendererTurbo(this, 296, 13, textureX, textureY); // Box 88
		bodyModel[307] = new ModelRendererTurbo(this, 451, 141, textureX, textureY); // Box 0
		bodyModel[308] = new ModelRendererTurbo(this, 456, 141, textureX, textureY); // Box 0
		bodyModel[309] = new ModelRendererTurbo(this, 466, 141, textureX, textureY); // Box 430
		bodyModel[310] = new ModelRendererTurbo(this, 461, 141, textureX, textureY); // Box 431
		bodyModel[311] = new ModelRendererTurbo(this, 475, 113, textureX, textureY); // Box 430
		bodyModel[312] = new ModelRendererTurbo(this, 440, 113, textureX, textureY); // Box 433
		bodyModel[313] = new ModelRendererTurbo(this, 488, 117, textureX, textureY); // Box 497
		bodyModel[314] = new ModelRendererTurbo(this, 487, 106, textureX, textureY); // Box 438
		bodyModel[315] = new ModelRendererTurbo(this, 419, 117, textureX, textureY); // Box 445
		bodyModel[316] = new ModelRendererTurbo(this, 476, 113, textureX, textureY); // Box 497
		bodyModel[317] = new ModelRendererTurbo(this, 492, 90, textureX, textureY); // Box 60
		bodyModel[318] = new ModelRendererTurbo(this, 491, 97, textureX, textureY); // Box 437
		bodyModel[319] = new ModelRendererTurbo(this, 420, 106, textureX, textureY); // Box 554
		bodyModel[320] = new ModelRendererTurbo(this, 427, 113, textureX, textureY); // Box 555
		bodyModel[321] = new ModelRendererTurbo(this, 417, 90, textureX, textureY); // Box 558
		bodyModel[322] = new ModelRendererTurbo(this, 416, 97, textureX, textureY); // Box 559
		bodyModel[323] = new ModelRendererTurbo(this, 468, 113, textureX, textureY); // Box 103
		bodyModel[324] = new ModelRendererTurbo(this, 467, 109, textureX, textureY); // Box 103
		bodyModel[325] = new ModelRendererTurbo(this, 446, 109, textureX, textureY); // Box 103
		bodyModel[326] = new ModelRendererTurbo(this, 447, 113, textureX, textureY); // Box 103
		bodyModel[327] = new ModelRendererTurbo(this, 468, 117, textureX, textureY); // Box 103
		bodyModel[328] = new ModelRendererTurbo(this, 447, 117, textureX, textureY); // Box 103
		bodyModel[329] = new ModelRendererTurbo(this, 467, 121, textureX, textureY); // Box 103
		bodyModel[330] = new ModelRendererTurbo(this, 446, 121, textureX, textureY); // Box 103
		bodyModel[331] = new ModelRendererTurbo(this, 460, 114, textureX, textureY); // Box 167
		bodyModel[332] = new ModelRendererTurbo(this, 453, 114, textureX, textureY); // Box 166
		bodyModel[333] = new ModelRendererTurbo(this, 453, 109, textureX, textureY); // Box 165
		bodyModel[334] = new ModelRendererTurbo(this, 460, 109, textureX, textureY); // Box 164
		bodyModel[335] = new ModelRendererTurbo(this, 465, 119, textureX, textureY); // Box 403
		bodyModel[336] = new ModelRendererTurbo(this, 460, 119, textureX, textureY); // Box 403
		bodyModel[337] = new ModelRendererTurbo(this, 464, 123, textureX, textureY); // Box 406
		bodyModel[338] = new ModelRendererTurbo(this, 460, 125, textureX, textureY); // Box 406
		bodyModel[339] = new ModelRendererTurbo(this, 452, 119, textureX, textureY); // Box 489
		bodyModel[340] = new ModelRendererTurbo(this, 455, 119, textureX, textureY); // Box 490
		bodyModel[341] = new ModelRendererTurbo(this, 453, 123, textureX, textureY); // Box 491
		bodyModel[342] = new ModelRendererTurbo(this, 455, 125, textureX, textureY); // Box 492
		bodyModel[343] = new ModelRendererTurbo(this, 465, 129, textureX, textureY,"backlight2beamUA1"); // Box 186 headlight back 2beam top A
		bodyModel[344] = new ModelRendererTurbo(this, 465, 135, textureX, textureY,"backlight2beamUA2"); // Box 187 headlight back 2beam top A
		bodyModel[345] = new ModelRendererTurbo(this, 456, 134, textureX, textureY,"big_backlight_top"); // Box 169 headlight back big top
		bodyModel[346] = new ModelRendererTurbo(this, 449, 135, textureX, textureY,"backlight2beamUB1"); // Box 186 headlight back 2beam top B
		bodyModel[347] = new ModelRendererTurbo(this, 449, 129, textureX, textureY,"backlight2beamUB2"); // Box 187 headlight back 2beam top B
		bodyModel[348] = new ModelRendererTurbo(this, 475, 109, textureX, textureY); // Box 430
		bodyModel[349] = new ModelRendererTurbo(this, 461, 100, textureX, textureY); // Box 430
		bodyModel[350] = new ModelRendererTurbo(this, 460, 96, textureX, textureY); // Box 430
		bodyModel[351] = new ModelRendererTurbo(this, 440, 109, textureX, textureY); // Box 459
		bodyModel[352] = new ModelRendererTurbo(this, 454, 100, textureX, textureY); // Box 460
		bodyModel[353] = new ModelRendererTurbo(this, 453, 96, textureX, textureY); // Box 465
		bodyModel[354] = new ModelRendererTurbo(this, 457, 129, textureX, textureY,"small_backlight_top"); // Box 186 headlight back small top
		bodyModel[355] = new ModelRendererTurbo(this, 460, 88, textureX, textureY); // Box 208
		bodyModel[356] = new ModelRendererTurbo(this, 473, 99, textureX, textureY); // Box 209
		bodyModel[357] = new ModelRendererTurbo(this, 484, 99, textureX, textureY); // Box 209
		bodyModel[358] = new ModelRendererTurbo(this, 429, 99, textureX, textureY); // Box 468
		bodyModel[359] = new ModelRendererTurbo(this, 480, 107, textureX, textureY); // Box 209
		bodyModel[360] = new ModelRendererTurbo(this, 490, 102, textureX, textureY); // Box 209
		bodyModel[361] = new ModelRendererTurbo(this, 488, 111, textureX, textureY); // Box 209
		bodyModel[362] = new ModelRendererTurbo(this, 429, 107, textureX, textureY); // Box 472
		bodyModel[363] = new ModelRendererTurbo(this, 460, 92, textureX, textureY); // Box 208
		bodyModel[364] = new ModelRendererTurbo(this, 445, 88, textureX, textureY); // Box 466
		bodyModel[365] = new ModelRendererTurbo(this, 445, 92, textureX, textureY); // Box 467
		bodyModel[366] = new ModelRendererTurbo(this, 462, 101, textureX, textureY); // Box 209
		bodyModel[367] = new ModelRendererTurbo(this, 430, 99, textureX, textureY); // Box 470
		bodyModel[368] = new ModelRendererTurbo(this, 441, 101, textureX, textureY); // Box 471
		bodyModel[369] = new ModelRendererTurbo(this, 480, 88, textureX, textureY); // Box 209
		bodyModel[370] = new ModelRendererTurbo(this, 468, 90, textureX, textureY); // Box 209
		bodyModel[371] = new ModelRendererTurbo(this, 421, 88, textureX, textureY); // Box 480
		bodyModel[372] = new ModelRendererTurbo(this, 433, 90, textureX, textureY); // Box 481
		bodyModel[373] = new ModelRendererTurbo(this, 423, 102, textureX, textureY); // Box 556
		bodyModel[374] = new ModelRendererTurbo(this, 421, 111, textureX, textureY); // Box 557
		bodyModel[375] = new ModelRendererTurbo(this, 475, 53, textureX, textureY); // Box 208
		bodyModel[376] = new ModelRendererTurbo(this, 461, 53, textureX, textureY); // Box 413
		bodyModel[377] = new ModelRendererTurbo(this, 492, 32, textureX, textureY); // Box 209
		bodyModel[378] = new ModelRendererTurbo(this, 493, 80, textureX, textureY); // Box 413
		bodyModel[379] = new ModelRendererTurbo(this, 410, 31, textureX, textureY); // Box 355
		bodyModel[380] = new ModelRendererTurbo(this, 400, 73, textureX, textureY); // Box 420
		bodyModel[381] = new ModelRendererTurbo(this, 492, 24, textureX, textureY); // Box 0
		bodyModel[382] = new ModelRendererTurbo(this, 458, 21, textureX, textureY); // Box 0
		bodyModel[383] = new ModelRendererTurbo(this, 448, 3, textureX, textureY); // Box 396
		bodyModel[384] = new ModelRendererTurbo(this, 466, 48, textureX, textureY); // Box 0
		bodyModel[385] = new ModelRendererTurbo(this, 462, 49, textureX, textureY); // Box 0
		bodyModel[386] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 416
		bodyModel[387] = new ModelRendererTurbo(this, 69, 42, textureX, textureY); // Box 0
		bodyModel[388] = new ModelRendererTurbo(this, 68, 49, textureX, textureY); // Box 0
		bodyModel[389] = new ModelRendererTurbo(this, 68, 34, textureX, textureY); // Box 88
		bodyModel[390] = new ModelRendererTurbo(this, 71, 29, textureX, textureY); // Box 336
		bodyModel[391] = new ModelRendererTurbo(this, 71, 57, textureX, textureY); // Box 579
		bodyModel[392] = new ModelRendererTurbo(this, 60, 40, textureX, textureY); // Box 0
		bodyModel[393] = new ModelRendererTurbo(this, 62, 47, textureX, textureY); // Box 0
		bodyModel[394] = new ModelRendererTurbo(this, 62, 35, textureX, textureY); // Box 358
		bodyModel[395] = new ModelRendererTurbo(this, 368, 40, textureX, textureY); // Box 0
		bodyModel[396] = new ModelRendererTurbo(this, 143, 193, textureX, textureY); // Box 0
		bodyModel[397] = new ModelRendererTurbo(this, 127, 193, textureX, textureY); // Box 0
		bodyModel[398] = new ModelRendererTurbo(this, 128, 205, textureX, textureY); // Box 0
		bodyModel[399] = new ModelRendererTurbo(this, 172, 193, textureX, textureY); // Box 833
		bodyModel[400] = new ModelRendererTurbo(this, 201, 215, textureX, textureY); // Box 834
		bodyModel[401] = new ModelRendererTurbo(this, 199, 220, textureX, textureY); // Box 835
		bodyModel[402] = new ModelRendererTurbo(this, 222, 197, textureX, textureY); // Box 0
		bodyModel[403] = new ModelRendererTurbo(this, 181, 193, textureX, textureY); // Box 0
		bodyModel[404] = new ModelRendererTurbo(this, 229, 199, textureX, textureY); // Box 420 water filler
		bodyModel[405] = new ModelRendererTurbo(this, 229, 206, textureX, textureY); // Box 421 water filler
		bodyModel[406] = new ModelRendererTurbo(this, 263, 193, textureX, textureY); // Box 0
		bodyModel[407] = new ModelRendererTurbo(this, 304, 199, textureX, textureY); // Box 0
		bodyModel[408] = new ModelRendererTurbo(this, 305, 193, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[409] = new ModelRendererTurbo(this, 329, 199, textureX, textureY); // Box 343
		bodyModel[410] = new ModelRendererTurbo(this, 330, 204, textureX, textureY); // Box 420 fuel filler
		bodyModel[411] = new ModelRendererTurbo(this, 312, 204, textureX, textureY); // Box 421 fuel filler
		bodyModel[412] = new ModelRendererTurbo(this, 111, 194, textureX, textureY); // Box 2
		bodyModel[413] = new ModelRendererTurbo(this, 330, 209, textureX, textureY); // Box 2
		bodyModel[414] = new ModelRendererTurbo(this, 343, 206, textureX, textureY); // Box 0
		bodyModel[415] = new ModelRendererTurbo(this, 320, 210, textureX, textureY); // Box 0
		bodyModel[416] = new ModelRendererTurbo(this, 106, 200, textureX, textureY); // Box 0
		bodyModel[417] = new ModelRendererTurbo(this, 100, 191, textureX, textureY); // Box 0
		bodyModel[418] = new ModelRendererTurbo(this, 369, 90, textureX, textureY); // Box 0
		bodyModel[419] = new ModelRendererTurbo(this, 197, 85, textureX, textureY); // Box 378
		bodyModel[420] = new ModelRendererTurbo(this, 176, 115, textureX, textureY); // Box 0
		bodyModel[421] = new ModelRendererTurbo(this, 176, 66, textureX, textureY); // Box 62
		bodyModel[422] = new ModelRendererTurbo(this, 322, 115, textureX, textureY); // Box 0
		bodyModel[423] = new ModelRendererTurbo(this, 322, 66, textureX, textureY); // Box 62
		bodyModel[424] = new ModelRendererTurbo(this, 162, 13, textureX, textureY); // Box 378
		bodyModel[425] = new ModelRendererTurbo(this, 475, 136, textureX, textureY); // Box 0
		bodyModel[426] = new ModelRendererTurbo(this, 175, 86, textureX, textureY); // Box 378
		bodyModel[427] = new ModelRendererTurbo(this, 6, 24, textureX, textureY); // Box 0
		bodyModel[428] = new ModelRendererTurbo(this, 458, 244, textureX, textureY); // Box 0
		bodyModel[429] = new ModelRendererTurbo(this, 444, 210, textureX, textureY); // Box 0
		bodyModel[430] = new ModelRendererTurbo(this, 460, 237, textureX, textureY); // Box 394
		bodyModel[431] = new ModelRendererTurbo(this, 499, 237, textureX, textureY); // Box 394
		bodyModel[432] = new ModelRendererTurbo(this, 448, 193, textureX, textureY); // Box 0
		bodyModel[433] = new ModelRendererTurbo(this, 457, 179, textureX, textureY); // Box 0
		bodyModel[434] = new ModelRendererTurbo(this, 441, 245, textureX, textureY); // Box 0
		bodyModel[435] = new ModelRendererTurbo(this, 444, 245, textureX, textureY); // Box 0
		bodyModel[436] = new ModelRendererTurbo(this, 447, 245, textureX, textureY); // Box 0
		bodyModel[437] = new ModelRendererTurbo(this, 450, 245, textureX, textureY); // Box 0
		bodyModel[438] = new ModelRendererTurbo(this, 453, 245, textureX, textureY); // Box 0
		bodyModel[439] = new ModelRendererTurbo(this, 456, 245, textureX, textureY); // Box 0
		bodyModel[440] = new ModelRendererTurbo(this, 459, 245, textureX, textureY); // Box 0
		bodyModel[441] = new ModelRendererTurbo(this, 462, 245, textureX, textureY); // Box 0
		bodyModel[442] = new ModelRendererTurbo(this, 369, 216, textureX, textureY); // Box 0
		bodyModel[443] = new ModelRendererTurbo(this, 383, 221, textureX, textureY); // Box 0
		bodyModel[444] = new ModelRendererTurbo(this, 454, 187, textureX, textureY); // Box 0
		bodyModel[445] = new ModelRendererTurbo(this, 414, 199, textureX, textureY); // Box 0
		bodyModel[446] = new ModelRendererTurbo(this, 431, 199, textureX, textureY); // Box 0
		bodyModel[447] = new ModelRendererTurbo(this, 435, 177, textureX, textureY); // Box 0
		bodyModel[448] = new ModelRendererTurbo(this, 478, 170, textureX, textureY); // Box 0
		bodyModel[449] = new ModelRendererTurbo(this, 495, 154, textureX, textureY); // Box 0
		bodyModel[450] = new ModelRendererTurbo(this, 495, 170, textureX, textureY); // Box 0
		bodyModel[451] = new ModelRendererTurbo(this, 198, 23, textureX, textureY); // Box 0
		bodyModel[452] = new ModelRendererTurbo(this, 414, 194, textureX, textureY); // Box 394
		bodyModel[453] = new ModelRendererTurbo(this, 415, 189, textureX, textureY); // Box 394
		bodyModel[454] = new ModelRendererTurbo(this, 226, 5, textureX, textureY); // Box 0
		bodyModel[455] = new ModelRendererTurbo(this, 231, 5, textureX, textureY); // Box 0
		bodyModel[456] = new ModelRendererTurbo(this, 236, 5, textureX, textureY); // Box 0
		bodyModel[457] = new ModelRendererTurbo(this, 221, 5, textureX, textureY); // Box 0
		bodyModel[458] = new ModelRendererTurbo(this, 369, 28, textureX, textureY); // Box 361
		bodyModel[459] = new ModelRendererTurbo(this, 369, 52, textureX, textureY); // Box 621
		bodyModel[460] = new ModelRendererTurbo(this, 333, 15, textureX, textureY); // Box 0
		bodyModel[461] = new ModelRendererTurbo(this, 438, 27, textureX, textureY); // Box 0
		bodyModel[462] = new ModelRendererTurbo(this, 317, 93, textureX, textureY); // Box 638
		bodyModel[463] = new ModelRendererTurbo(this, 70, 23, textureX, textureY); // Box 0
		bodyModel[464] = new ModelRendererTurbo(this, 86, 88, textureX, textureY); // Box 270
		bodyModel[465] = new ModelRendererTurbo(this, 8, 221, textureX, textureY); // Box 271
		bodyModel[466] = new ModelRendererTurbo(this, 10, 228, textureX, textureY); // Box 272
		bodyModel[467] = new ModelRendererTurbo(this, 1, 228, textureX, textureY); // Box 273
		bodyModel[468] = new ModelRendererTurbo(this, 1, 188, textureX, textureY); // Box 274
		bodyModel[469] = new ModelRendererTurbo(this, 9, 180, textureX, textureY); // Box 275
		bodyModel[470] = new ModelRendererTurbo(this, 16, 70, textureX, textureY); // Box 276
		bodyModel[471] = new ModelRendererTurbo(this, 19, 70, textureX, textureY); // Box 277
		bodyModel[472] = new ModelRendererTurbo(this, 22, 70, textureX, textureY); // Box 278
		bodyModel[473] = new ModelRendererTurbo(this, 25, 70, textureX, textureY); // Box 279
		bodyModel[474] = new ModelRendererTurbo(this, 28, 70, textureX, textureY); // Box 280
		bodyModel[475] = new ModelRendererTurbo(this, 31, 70, textureX, textureY); // Box 281
		bodyModel[476] = new ModelRendererTurbo(this, 34, 70, textureX, textureY); // Box 282
		bodyModel[477] = new ModelRendererTurbo(this, 37, 70, textureX, textureY); // Box 283
		bodyModel[478] = new ModelRendererTurbo(this, 63, 62, textureX, textureY); // Box 284
		bodyModel[479] = new ModelRendererTurbo(this, 74, 67, textureX, textureY); // Box 285
		bodyModel[480] = new ModelRendererTurbo(this, 6, 205, textureX, textureY); // Box 286
		bodyModel[481] = new ModelRendererTurbo(this, 85, 64, textureX, textureY); // Box 287
		bodyModel[482] = new ModelRendererTurbo(this, 96, 67, textureX, textureY); // Box 288
		bodyModel[483] = new ModelRendererTurbo(this, 69, 76, textureX, textureY); // Box 289
		bodyModel[484] = new ModelRendererTurbo(this, 80, 79, textureX, textureY); // Box 290
		bodyModel[485] = new ModelRendererTurbo(this, 91, 76, textureX, textureY); // Box 291
		bodyModel[486] = new ModelRendererTurbo(this, 102, 79, textureX, textureY); // Box 292
		bodyModel[487] = new ModelRendererTurbo(this, 8, 216, textureX, textureY); // Box 306
		bodyModel[488] = new ModelRendererTurbo(this, 10, 211, textureX, textureY); // Box 308
		bodyModel[489] = new ModelRendererTurbo(this, 74, 5, textureX, textureY); // Box 0
		bodyModel[490] = new ModelRendererTurbo(this, 79, 5, textureX, textureY); // Box 0
		bodyModel[491] = new ModelRendererTurbo(this, 84, 5, textureX, textureY); // Box 0
		bodyModel[492] = new ModelRendererTurbo(this, 89, 5, textureX, textureY); // Box 0
		bodyModel[493] = new ModelRendererTurbo(this, 153, 2, textureX, textureY); // Box 0
		bodyModel[494] = new ModelRendererTurbo(this, 266, 223, textureX, textureY); // Box 0
		bodyModel[495] = new ModelRendererTurbo(this, 237, 223, textureX, textureY); // Box 0
		bodyModel[496] = new ModelRendererTurbo(this, 307, 240, textureX, textureY); // Box 0
		bodyModel[497] = new ModelRendererTurbo(this, 263, 198, textureX, textureY); // Box 0
		bodyModel[498] = new ModelRendererTurbo(this, 267, 236, textureX, textureY); // Box 0
		bodyModel[499] = new ModelRendererTurbo(this, 242, 240, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 120
		bodyModel[0].setRotationPoint(-35.5F, 2F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 481
		bodyModel[1].setRotationPoint(-35.5F, 2F, 11F);

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

		bodyModel[16].addBox(0F, 0F, 0F, 4, 12, 1, 0F); // Box 0
		bodyModel[16].setRotationPoint(-48.5F, -12F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 0
		bodyModel[17].setRotationPoint(-35.5F, -17F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 12, 1, 0F); // Box 60
		bodyModel[18].setRotationPoint(-48.5F, -12F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 61
		bodyModel[19].setRotationPoint(-35.5F, -17F, 10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(-46.5F, -17F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[21].setRotationPoint(-46.5F, -17F, 10F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 79
		bodyModel[22].setRotationPoint(-31F, -10F, -12F);

		bodyModel[23].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 80
		bodyModel[23].setRotationPoint(-36F, -10F, -12F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 108
		bodyModel[24].setRotationPoint(-31F, -10F, 11F);

		bodyModel[25].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 109
		bodyModel[25].setRotationPoint(-36F, -10F, 11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 9, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[26].setRotationPoint(-44.5F, -17F, -11F);

		bodyModel[27].addShapeBox(-4F, 0F, -0.5F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Front side door L
		bodyModel[27].setRotationPoint(-31.5F, -8F, -10F);

		bodyModel[28].addShapeBox(-4F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Front side door R
		bodyModel[28].setRotationPoint(-31.5F, -8F, 10F);

		bodyModel[29].addBox(0F, 0F, 0F, 5, 6, 20, 0F); // Box 0
		bodyModel[29].setRotationPoint(-45.5F, -6F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[30].setRotationPoint(-41.5F, -17F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[31].setRotationPoint(-41.5F, -19F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[32].setRotationPoint(-41.5F, -17F, 8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[33].setRotationPoint(-41.5F, -19F, 8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 9, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[34].setRotationPoint(-44.5F, -17F, 10F);

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

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 0
		bodyModel[42].setRotationPoint(-48.17F, -9F, 8.62F);
		bodyModel[42].rotateAngleY = -0.78539816F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[43].setRotationPoint(-36F, 2F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[44].setRotationPoint(-31.5F, 2F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.51F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, -0.5F, -0.51F, -0.01F, -0.5F, -0.51F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, -0.5F, -0.51F, -0.01F, -0.5F); // Box 0 cull
		bodyModel[45].setRotationPoint(-47.5F, -16F, -10.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.51F, -0.01F, -0.5F, -0.01F, -0.01F, -0.5F, -0.01F, -0.01F, 0F, -0.51F, -0.01F, 0F, -0.51F, -0.01F, -0.5F, -0.01F, -0.01F, -0.5F, -0.01F, -0.01F, 0F, -0.51F, -0.01F, 0F); // Box 346 cull
		bodyModel[46].setRotationPoint(-47.5F, -16F, 9.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, 0.49F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0.49F, -0.01F, -0.5F); // Box 0 cull
		bodyModel[47].setRotationPoint(-48F, -16F, -10.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0.49F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0.49F, -0.01F, 0F); // Box 348
		bodyModel[48].setRotationPoint(-48F, -16F, 9.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[49].setRotationPoint(-47.15F, -20F, -3.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -1.5F, 0F, -0.35F, -1.5F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -0.35F, 1.5F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[50].setRotationPoint(-47.15F, -20F, -9.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 88
		bodyModel[51].setRotationPoint(-47.15F, -20F, 3.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -1F, 0F, -0.35F, -1F, 0F, -0.35F, 0.5F, -0.5F, 0.05F, 0.5F, -0.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, -0.5F, 0.05F, -0.5F, -0.5F); // Box 0
		bodyModel[52].setRotationPoint(-47.15F, -18F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0.5F, -0.5F, -0.35F, 0.5F, -0.5F, -0.35F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[53].setRotationPoint(-47.15F, -18F, 9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.05F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.35F, -1F, 0F, 0F, -1F, 0F, 0.05F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.35F, 0F, -1F, 0.09F, 0F, -1F); // Box 355
		bodyModel[54].setRotationPoint(-47.15F, -18F, 10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.035F, -0.5F, 0F, -0.035F, -0.5F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.425F, -0.5F, 0F, -0.425F, -0.5F); // Box 0
		bodyModel[55].setRotationPoint(-41.5F, -20.2F, -8.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.035F, 0F, 0F, -0.035F, 0F, 0F, -1.2F, -0.5F, 0F, -1.2F, -0.5F, 0F, -0.425F, 0F, 0F, -0.425F, 0F, 0F, 0.45F, -0.5F, 0F, 0.45F, -0.5F); // Box 361
		bodyModel[56].setRotationPoint(-41.5F, -20.2F, 5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[57].setRotationPoint(-47F, -3F, -2F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 6, 8, 0F); // Box 0
		bodyModel[58].setRotationPoint(-48.5F, -6F, -10F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 6, 8, 0F); // Box 396
		bodyModel[59].setRotationPoint(-48.5F, -6F, 2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[60].setRotationPoint(-49.5F, -10F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.35F, 0F, 0F, -0.35F, 0F, 0F, 1.5F, -0.3F, -0.5F, -1.5F, -0.3F, -0.5F, -1.15F, -0.1F, 0F, 1.15F, -0.1F, 0F); // Box 207
		bodyModel[61].setRotationPoint(-49.15F, -19F, -0.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.625F, 0F, 0F, -1.63F, 0F, 0F, -1.62F, 0F, 0F, 0.62F, 0F, 0F); // Box 529
		bodyModel[62].setRotationPoint(-48.15F, -17F, 10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1.35F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.35F, 0F, -0.5F); // Box 208
		bodyModel[63].setRotationPoint(-49.15F, -20F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, -1.5F, 0F, -1.6F, -1.5F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 1.5F, 0F, -0.6F, 1.5F, 0F); // Box 209
		bodyModel[64].setRotationPoint(-48.8F, -20F, 3.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, -0.5F, -1.05F, -0.5F, -0.5F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.125F, -0.5F, -0.05F, 0.125F, -0.5F); // Box 208
		bodyModel[65].setRotationPoint(-48.2F, -18.5F, 9.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[66].setRotationPoint(-48.15F, -18F, 10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.65F, -1.625F, -0.5F, -0.65F, -1.625F, -0.5F, 1.5F, -0.1F, 0F, -1.5F, -0.1F, 0F, -0.85F, 1.525F, -0.5F, 0.85F, 1.525F, -0.5F); // Box 209
		bodyModel[67].setRotationPoint(-48.8F, -19F, 3.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.255F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.08F, 0F, 0F); // Box 105
		bodyModel[68].setRotationPoint(-47.5F, -17F, 10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.985F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F); // Box 105
		bodyModel[69].setRotationPoint(-49.5F, -12F, 10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -1F, 0F, -0.35F, -1F, 0F, -0.35F, -0.5F, 0.5F, 0.05F, -0.5F, 0.5F, 0.09F, 0F, -1F, -0.35F, 0F, -1F, -0.35F, -0.5F, 0.5F, 0.05F, -0.5F, 0.5F); // Box 420
		bodyModel[70].setRotationPoint(-47.15F, -18F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.255F, 0F, 0F, -0.08F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[71].setRotationPoint(-47.5F, -17F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.965F, 0F, -1F, -0.035F, 0F, -1F, -0.035F, 0F, 0F, -0.965F, 0F, 0F, -0.985F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 429
		bodyModel[72].setRotationPoint(-48.15F, -18F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.15F, -0.1F, 0F, -1.15F, -0.1F, 0F, -1.5F, -0.3F, -0.5F, 1.5F, -0.3F, -0.5F); // Box 430
		bodyModel[73].setRotationPoint(-49.15F, -19F, -3.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,-0.65F, -1.625F, -0.5F, 0.65F, -1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.85F, 1.525F, -0.5F, -0.85F, 1.525F, -0.5F, -1.5F, -0.1F, 0F, 1.5F, -0.1F, 0F); // Box 431
		bodyModel[74].setRotationPoint(-48.8F, -19F, -10.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,-1.075F, 0F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, 0F, -1.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[75].setRotationPoint(-48.5F, -16F, -12F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,-1.075F, 0F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, 0F, -1.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[76].setRotationPoint(-48.5F, -16F, 11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[77].setRotationPoint(-46.5F, -21F, 0.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[78].setRotationPoint(-48.5F, -22F, 0.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[79].setRotationPoint(-48F, -21F, -1.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[80].setRotationPoint(-48F, -22F, -1.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[81].setRotationPoint(-59F, 0F, -2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[82].setRotationPoint(-58F, -12.5F, 1F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[83].setRotationPoint(-58F, -12.5F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[84].setRotationPoint(-58F, -12.5F, -2F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[85].setRotationPoint(-58F, -12.5F, -2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[86].setRotationPoint(-58F, -10.5F, 1F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[87].setRotationPoint(-58F, -10.5F, -2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[88].setRotationPoint(-58F, -9.5F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[89].setRotationPoint(-58F, -9.5F, -2F);

		bodyModel[90].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front 2beam top A
		bodyModel[90].setRotationPoint(-57.25F, -10.5F, 0F);

		bodyModel[91].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front 2beam top A
		bodyModel[91].setRotationPoint(-57.25F, -10.5F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big top
		bodyModel[92].setRotationPoint(-57.25F, -11.75F, -1.25F);

		bodyModel[93].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front 2beam top B
		bodyModel[93].setRotationPoint(-57.25F, -10.5F, 0F);
		bodyModel[93].rotateAngleX = 1.57079633F;

		bodyModel[94].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front 2beam top B
		bodyModel[94].setRotationPoint(-57.25F, -10.5F, 0F);
		bodyModel[94].rotateAngleX = 1.57079633F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[95].setRotationPoint(-52.5F, 2F, 10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 0
		bodyModel[96].setRotationPoint(-55F, 2F, 10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.425F, 0F, 0F, -0.425F, 0F, 0F, 1.07F, 0F, -0.425F, -1.285F, 0F, 0F); // Box 0
		bodyModel[97].setRotationPoint(-59F, 2F, 2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0F, 0F, -1F, -0.65F, 0F, 0.35F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0.18F, 0F, -1F); // Box 496
		bodyModel[98].setRotationPoint(-57.5F, 2F, 7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.65F, 0F, 0.355F, -0.1125F, 0F, -1.22F, -0.385F, 0F, 1F, 0.18F, 0F, -1F, -0.53F, -0.5F, 0.465F, -1.47F, -0.5F, 0.465F, -2.23F, -0.5F, -1F, 0.23F, -0.5F, -1F); // Box 496
		bodyModel[99].setRotationPoint(-57.5F, 7F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[100].setRotationPoint(-52.5F, 2F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F); // Box 446
		bodyModel[101].setRotationPoint(-55F, 2F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.285F, 0F, 0F, 1.07F, 0F, -0.425F, -0.425F, 0F, 0F, 0.425F, 0F, 0F); // Box 447
		bodyModel[102].setRotationPoint(-59F, 2F, -7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -1F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, -1F, 0F, 0F, 0.18F, 0F, -1F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, -0.65F, 0F, 0.355F); // Box 448
		bodyModel[103].setRotationPoint(-57.5F, 2F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.18F, 0F, -1F, -0.385F, 0F, 1F, -0.1125F, 0F, -1.22F, -0.65F, 0F, 0.355F, 0.23F, -0.5F, -1F, -2.23F, -0.5F, -1F, -1.47F, -0.5F, 0.465F, -0.53F, -0.5F, 0.465F); // Box 449
		bodyModel[104].setRotationPoint(-57.5F, 7F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F); // Box 208
		bodyModel[105].setRotationPoint(-50.65F, -13.1F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.35F, 0F, -0.5F, 0.35F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.35F, 0F, -0.5F, 0.35F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[106].setRotationPoint(-50.65F, -13.1F, -4F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.65F, -1.625F, -0.5F, -0.65F, -1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 1.625F, -0.5F, -0.65F, 1.625F, -0.5F); // Box 209
		bodyModel[107].setRotationPoint(-50.3F, -13.1F, 3.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.65F, -1.625F, -0.5F, 0.65F, -1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 1.625F, -0.5F, 0.65F, 1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[108].setRotationPoint(-50.3F, -13.1F, -10.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-0.35F, -1.95F, 0F, -0.65F, -1.95F, 0F, -1.65F, 0.3F, 0F, 0.65F, 0.3F, 0F, -0.35F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.65F, 0F, 0F); // Box 0
		bodyModel[109].setRotationPoint(-49F, -13F, -10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0.65F, 0.3F, 0F, -1.65F, 0.3F, 0F, -0.65F, -1.95F, 0F, -0.35F, -1.95F, 0F, 0.65F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.35F, 0F, 0F); // Box 416
		bodyModel[110].setRotationPoint(-49F, -13F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.625F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.46F, 0F, 0F); // Box 529
		bodyModel[111].setRotationPoint(-49.77F, -11F, 10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[112].setRotationPoint(-52.5F, -9F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[113].setRotationPoint(-51.5F, -9F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.985F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F); // Box 431
		bodyModel[114].setRotationPoint(-49.5F, -12F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0.62F, 0F, 0F, -1.62F, 0F, 0F, -1.63F, 0F, 0F, 1.625F, 0F, 0F); // Box 434
		bodyModel[115].setRotationPoint(-48.15F, -17F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.46F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, 0.625F, 0F, 0F); // Box 436
		bodyModel[116].setRotationPoint(-49.77F, -11F, -11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.075F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.075F, -0.5F, 0F, -0.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.075F, 0.5F, 0F); // Box 105
		bodyModel[117].setRotationPoint(-47.5F, -16F, 11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.075F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F); // Box 438
		bodyModel[118].setRotationPoint(-47.5F, -16F, -12F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 389
		bodyModel[119].setRotationPoint(-47F, -10F, 2.77F);
		bodyModel[119].rotateAngleY = 0.78539816F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
		bodyModel[120].setRotationPoint(-47.85F, -10F, 6.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[121].setRotationPoint(-49F, -11.5F, 5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,-1.115F, 0F, 0F, 1.115F, 0F, 0F, 1.115F, 0F, 0F, -1.115F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[122].setRotationPoint(-59F, -8F, -2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,-0.75F, 0F, 0F, 0.75F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 497
		bodyModel[123].setRotationPoint(-58.5F, -9F, 2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,-2.25F, 0F, 0F, 2.25F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 463
		bodyModel[124].setRotationPoint(-58.5F, -9F, -7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 167
		bodyModel[125].setRotationPoint(-57F, -10.5F, 0F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[126].setRotationPoint(-57F, -10.5F, -2F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[127].setRotationPoint(-57F, -12.5F, -2F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[128].setRotationPoint(-57F, -12.5F, 0F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 0
		bodyModel[129].setRotationPoint(-57.75F, -9F, -2F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.07F, -0.5F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 0
		bodyModel[130].setRotationPoint(-57.75F, -9F, -1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 430
		bodyModel[131].setRotationPoint(-57.75F, -9F, 1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.07F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 431
		bodyModel[132].setRotationPoint(-57.75F, -9F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.202F, 0F, -1F, 0.202F, 0F, -1F, 0.202F, 0F, 0F, -0.202F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		bodyModel[133].setRotationPoint(-57.75F, -10.5F, 1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.202F, 0F, 0F, 0.202F, 0F, 0F, 0.202F, 0F, -1F, -0.202F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 433
		bodyModel[134].setRotationPoint(-57.75F, -10.5F, -2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.1325F, -0.125F, 0F, -0.135F, -0.125F, 0F, 1.375F, -0.125F, 0F, -1.375F, -0.125F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 497
		bodyModel[135].setRotationPoint(-57.5F, -10F, 2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[136].setRotationPoint(-52.5F, -9F, 10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[137].setRotationPoint(-51.5F, -9F, 10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,-1F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 437
		bodyModel[138].setRotationPoint(-55F, -9F, 10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,-2.25F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, 2F, -1.25F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0F, 0F, -1F); // Box 438
		bodyModel[139].setRotationPoint(-57.5F, -9F, 7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.61F, 0F, -0.5F, -0.61F, 0F, 0F, -0.03F, 0F, 0F, 1.41F, -0.5F, -1F, -0.61F, -0.5F, -1F, -0.61F, -0.5F, 0F, 1.41F, -0.5F, 0F); // Box 430
		bodyModel[140].setRotationPoint(-56.14F, -12F, 1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.6F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.085F, 0F, 0F, -0.725F, 0F, 0F, 0.6F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.6F, 0F); // Box 208
		bodyModel[141].setRotationPoint(-55.75F, -13.1F, 0F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1.525F, 0.125F, 0F, -0.05F, -0.1F, -2.19F, -0.44F, -2.25F, -0.03F, -0.375F, -1.875F, -3F, -1.525F, 1.75F, 0F, -0.05F, 1.75F, -2.19F, -0.5F, 1.75F, 0F, -0.25F, 1.75F, -3F); // Box 438
		bodyModel[142].setRotationPoint(-56.5F, -11.75F, 7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1.375F, -0.125F, 0F, 1.375F, -0.125F, 0F, -0.135F, -0.125F, 0F, 0.135F, -0.125F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 445
		bodyModel[143].setRotationPoint(-57.5F, -10F, -7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.2F, -1.9F, 0F, -1F, -0.025F, 0F, -0.225F, -0.525F, 0F, -1.625F, -2.525F, 0F, -0.1175F, 1.525F, 0F, -1F, 1.525F, 0F, -0.225F, 1.525F, 0F, -1.625F, 1.525F, 0F); // Box 497
		bodyModel[144].setRotationPoint(-57.75F, -12.4F, 2F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-2.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -1.18F, -0.31F, 0F, -1.25F, -0.31F, -2.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 1.18F, -0.31F, 0F, 1.25F, -0.31F); // Box 209
		bodyModel[145].setRotationPoint(-53.55F, -12.9F, 3.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.07F, 0.01F, 0.05F, 0F, 0.01F, 0.05F, -0.17F, -0.2F, 0F, -0.07F, -1.01F, 0F, 0.07F, 0.01F, 0.05F, 0F, 0.01F, 0.05F, 0.17F, -0.2F, 0F, 0.07F, -1.01F); // Box 209
		bodyModel[146].setRotationPoint(-53.55F, -11.72F, 9.2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.07F, -1.01F, 0.05F, -0.17F, -0.2F, 0.05F, 0F, 0.01F, 0F, -0.07F, 0.01F, 0F, 0.07F, -1.01F, 0.05F, 0.17F, -0.2F, 0.05F, 0F, 0.01F, 0F, 0.07F, 0.01F); // Box 468
		bodyModel[147].setRotationPoint(-53.55F, -11.72F, -10.2F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.005F, -0.2435F, 0F, 0.42F, -0.005F, 0F, 0.42F, -0.5615F, -0.5F, 0.005F, -0.685F, -0.5F, 0.005F, 0.2435F, 0F, 0.42F, 0.005F, 0F, 0.42F, 0.5615F, -0.5F, 0.005F, 0.685F, -0.5F); // Box 209
		bodyModel[148].setRotationPoint(-54.97F, -12.56F, 3.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.005F, -0.125F, 0F, 0.42F, -0.0015F, 0F, 0.42F, -0.35F, 0.19F, -1.42F, -0.35F, 0.19F, 0.005F, 0.1265F, 0F, 0.42F, 0.0015F, 0F, 0.42F, 0.35F, 0.19F, -1.42F, 0.35F, 0.19F); // Box 209
		bodyModel[149].setRotationPoint(-54.97F, -12F, 7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.0935F, 0F, -0.455F, -0.005F, 0F, -0.455F, -0.445F, -0.5F, -0.545F, -0.445F, -0.5F, 0F, 0.0935F, 0F, -0.455F, 0.004F, 0F, -0.455F, 0.445F, -0.5F, -0.545F, 0.445F, -0.5F); // Box 209
		bodyModel[150].setRotationPoint(-55.52F, -12.32F, 3.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.005F, -0.685F, -0.5F, 0.42F, -0.5615F, -0.5F, 0.42F, -0.005F, 0F, 0.005F, -0.2435F, 0F, 0.005F, 0.685F, -0.5F, 0.42F, 0.5615F, -0.5F, 0.42F, 0.005F, 0F, 0.005F, 0.2435F, 0F); // Box 472
		bodyModel[151].setRotationPoint(-54.97F, -12.56F, -7.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.39F, 0.006F, -0.5F, -0.61F, 0.006F, -0.5F, -0.61F, -0.025F, 0F, -0.39F, -0.025F, 0F, 0F, -0.6F, -0.5F, -0.61F, -0.6F, -0.5F, -0.61F, -0.6F, 0F, -0.03F, -0.6F, 0F); // Box 430
		bodyModel[152].setRotationPoint(-56.14F, -12.4F, 1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.094F, -0.5F, -1F, -0.094F, -0.5F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, -0.5F, -0.51F, -0.4F, -0.5F); // Box 430
		bodyModel[153].setRotationPoint(-56.75F, -12.5F, 0F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.03F, 0F, 0F, -0.61F, 0F, 0F, -0.61F, 0F, -0.5F, 0F, 0F, -0.5F, 1.41F, -0.5F, 0F, -0.61F, -0.5F, 0F, -0.61F, -0.5F, -1F, 1.41F, -0.5F, -1F); // Box 459
		bodyModel[154].setRotationPoint(-56.14F, -12F, -2F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.39F, -0.025F, 0F, -0.61F, -0.025F, 0F, -0.61F, 0.006F, -0.5F, -0.39F, 0.006F, -0.5F, -0.03F, -0.6F, 0F, -0.61F, -0.6F, 0F, -0.61F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 460
		bodyModel[155].setRotationPoint(-56.14F, -12.4F, -2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.725F, -0.5F, 0.3F, 0.085F, -0.5F, 0.45F, 0F, 0F, -0.2325F, -0.875F, 0F, 0F, 0.6F, -0.5F, 0.3F, 0F, -0.5F, 0.45F, 0F, 0F, -0.2325F, 0.875F, 0F); // Box 208
		bodyModel[156].setRotationPoint(-55.75F, -13.1F, 1.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, -0.094F, -0.5F, 0F, -0.094F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.51F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 465
		bodyModel[157].setRotationPoint(-56.75F, -12.5F, -2F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.725F, 0F, 0.3F, 0.085F, 0F, 0.1F, 0.2F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0.6F, 0F); // Box 466
		bodyModel[158].setRotationPoint(-55.75F, -13.1F, -2F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.2325F, -0.875F, 0F, 0.45F, 0F, 0F, 0.3F, 0.085F, -0.5F, 0F, -0.725F, -0.5F, -0.2325F, 0.875F, 0F, 0.45F, 0F, 0F, 0.3F, 0F, -0.5F, 0F, 0.6F, -0.5F); // Box 467
		bodyModel[159].setRotationPoint(-55.75F, -13.1F, -3.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.345F, 0F, 0.05F, 0F, 0F, -2F, -1.25F, -0.31F, 0F, -1.25F, -0.31F, 0F, 0.345F, 0F, 0.05F, 0F, 0F, -2F, 1.25F, -0.31F, 0F, 1.25F, -0.31F); // Box 209
		bodyModel[160].setRotationPoint(-53.55F, -12.9F, 3.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -1.25F, -0.31F, 0.05F, -1.18F, -0.31F, 0.05F, 0F, 0F, -2.05F, 0F, 0F, 0F, 1.25F, -0.31F, 0.05F, 1.18F, -0.31F, 0.05F, 0F, 0F, -2.05F, 0F, 0F); // Box 470
		bodyModel[161].setRotationPoint(-53.55F, -12.9F, -9.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -1.25F, -0.31F, -2F, -1.25F, -0.31F, 0.05F, 0F, 0F, 0F, -0.345F, 0F, 0F, 1.25F, -0.31F, -2F, 1.25F, -0.31F, 0.05F, 0F, 0F, 0F, 0.345F, 0F); // Box 471
		bodyModel[162].setRotationPoint(-53.55F, -12.9F, -9.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1.2F, 0F, 0F, -0.8F, 0F, 0F, -0.15F, -1.625F, -0.5F, 0F, -1.55F, -0.5F, -1.2F, 0F, 0F, -0.8F, 0F, 0F, -0.15F, 1.625F, -0.5F, 0F, 1.55F, -0.5F); // Box 209
		bodyModel[163].setRotationPoint(-51.5F, -13.1F, 3.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -0.2F, 0F, -0.8F, 0F, 0F, -2F, -1.55F, -0.5F, 0F, -1.55F, -0.5F, 0F, 0.2F, 0F, -0.8F, 0F, 0F, -2F, 1.55F, -0.5F, 0F, 1.55F, -0.5F); // Box 209
		bodyModel[164].setRotationPoint(-51.5F, -13.1F, 3.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -1.55F, -0.5F, -0.15F, -1.625F, -0.5F, -0.8F, 0F, 0F, -1.2F, 0F, 0F, 0F, 1.55F, -0.5F, -0.15F, 1.625F, -0.5F, -0.8F, 0F, 0F, -1.2F, 0F, 0F); // Box 480
		bodyModel[165].setRotationPoint(-51.5F, -13.1F, -10.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -1.55F, -0.5F, -2F, -1.55F, -0.5F, -0.8F, 0F, 0F, 0F, -0.2F, 0F, 0F, 1.55F, -0.5F, -2F, 1.55F, -0.5F, -0.8F, 0F, 0F, 0F, 0.2F, 0F); // Box 481
		bodyModel[166].setRotationPoint(-51.5F, -13.1F, -10.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[167].setRotationPoint(-58.01F, -12.5F, 1F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F); // Box 403
		bodyModel[168].setRotationPoint(-58.01F, -12.5F, 0F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[169].setRotationPoint(-58.01F, -10.5F, 1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[170].setRotationPoint(-58.01F, -9.5F, 0F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 489
		bodyModel[171].setRotationPoint(-58.01F, -12.5F, -2F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 490
		bodyModel[172].setRotationPoint(-58.01F, -12.5F, -2F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F); // Box 491
		bodyModel[173].setRotationPoint(-58.01F, -10.5F, -2F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[174].setRotationPoint(-58.01F, -9.5F, -2F);

		bodyModel[175].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front small top
		bodyModel[175].setRotationPoint(-57.25F, -10.5F, 0F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,-0.97F, 0F, 0F, 0.97F, 0F, 0F, 0.97F, 0F, 0F, -0.97F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[176].setRotationPoint(-59.7F, -7F, 3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,-0.97F, 0F, 0F, 0.97F, 0F, 0F, 0.97F, 0F, 0F, -0.97F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[177].setRotationPoint(-59.7F, -7F, -3F);

		bodyModel[178].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Markerlight R type 3 FRONT
		bodyModel[178].setRotationPoint(-53.95F, -7.75F, 10.69F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.245F, -0.32F, 0F, -0.99F, -0.32F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0.035F, -0.32F, -0.5F, -0.99F, -0.32F, -0.5F, -0.01F, 0F, -0.5F, -0.01F); // Box 216
		bodyModel[179].setRotationPoint(-54.24F, -8.5F, 10F);

		bodyModel[180].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Markerlight L type 3 FRONT
		bodyModel[180].setRotationPoint(-53.95F, -7.75F, -10.69F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F); // Numberboard L type 3 FRONT
		bodyModel[181].setRotationPoint(-53.25F, -8.25F, -11.04F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F); // Numberboard R type 3 FRONT
		bodyModel[182].setRotationPoint(-53.25F, -8.25F, 10.99F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,-1F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F); // Box 517
		bodyModel[183].setRotationPoint(-55F, -9F, -11F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,-1.25F, 0F, -1F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, -2.25F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, -1F, 0F, 0F); // Box 518
		bodyModel[184].setRotationPoint(-57.5F, -9F, -8F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.01F, -0.32F, 0F, -0.01F, -0.32F, 0F, -0.99F, 0F, 0F, 0.245F, 0F, -0.5F, -0.01F, -0.32F, -0.5F, -0.01F, -0.32F, -0.5F, -0.95F, 0F, -0.5F, 0.035F); // Box 519
		bodyModel[185].setRotationPoint(-54.24F, -8.5F, -11F);

		bodyModel[186].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, -0.17F, -0.15F, 0F, -0.17F, -0.08F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.17F, -0.41F, -0.125F, -0.17F, -0.4F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 525
		bodyModel[186].setRotationPoint(-56.65F, -9.87F, 7.02F);
		bodyModel[186].rotateAngleY = -0.47298423F;

		bodyModel[187].addShapeBox(0F, 0F, -2F, 1, 2, 5, 0F,0F, -0.05F, -0.22F, -0.95F, -0.05F, -0.22F, -0.95F, -0.05F, -1.05F, 0F, -0.05F, -1.05F, 0F, -0.175F, -0.22F, -0.95F, -0.175F, -0.22F, -0.95F, -0.175F, -1.05F, 0F, -0.175F, -1.05F); // Numberboard R type 2 FRONT
		bodyModel[187].setRotationPoint(-56.7F, -9.87F, 7.04F);
		bodyModel[187].rotateAngleY = -0.47298423F;

		bodyModel[188].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, -0.08F, 0F, 0F, -0.15F, 0F, -0.17F, 0F, 0F, -0.17F, 0F, -0.125F, 0F, -0.4F, -0.125F, 0F, -0.41F, -0.125F, -0.17F, 0F, -0.125F, -0.17F); // Box 524
		bodyModel[188].setRotationPoint(-56.65F, -9.87F, -7.02F);
		bodyModel[188].rotateAngleY = 0.47298423F;

		bodyModel[189].addShapeBox(0F, 0F, -2F, 1, 2, 5, 0F,0F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -1.22F, 0F, -0.05F, -1.22F, 0F, -0.175F, -0.05F, -0.95F, -0.175F, -0.05F, -0.95F, -0.175F, -1.22F, 0F, -0.175F, -1.22F); // Numberboard L Type 2 FRONT
		bodyModel[189].setRotationPoint(-56.7F, -9.87F, -7.04F);
		bodyModel[189].rotateAngleY = 0.47298423F;

		bodyModel[190].addShapeBox(-0.79F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F); // Box 353 markerlight type 3 FRONT
		bodyModel[190].setRotationPoint(-56.72F, -6F, 7.02F);
		bodyModel[190].rotateAngleY = -0.47298423F;

		bodyModel[191].addShapeBox(-0.79F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F); // Box 545 markerlight type 3 FRONT
		bodyModel[191].setRotationPoint(-56.72F, -6F, -7.02F);
		bodyModel[191].rotateAngleY = 0.47298423F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.55F, 0F, -0.15F, 0.48F, 0F, 0.19F, -2F, -2F, 0F, -1.75F, -2F, 0F, 1F, 0F, -0.9F, 1F, 0F, 0.19F, 1F, -2F, 0F, 1F, -2F); // Box 60
		bodyModel[192].setRotationPoint(-51.5F, -11F, 10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1.45F, 0F, 0.81F, 0.5F, -0.1F, 0F, 0.5F, -2.4F, -2F, -1.06F, -2.15F, -3.03F, -1.45F, 1.65F, 0.82F, 0.5F, 1.65F, 0F, 0.5F, 1.65F, -2F, -1F, 1.65F, -3F); // Box 437
		bodyModel[193].setRotationPoint(-55F, -11.65F, 10F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.375F, -1.875F, -2F, -0.44F, -2.25F, 0.97F, -0.05F, -0.1F, -3.19F, -1.525F, 0.125F, -1F, -0.25F, 1.75F, -2F, -0.5F, 1.75F, 1F, -0.05F, 1.75F, -3.19F, -1.525F, 1.75F, -1F); // Box 554
		bodyModel[194].setRotationPoint(-56.5F, -11.75F, -9F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-1.625F, -2.525F, 0F, -0.225F, -0.525F, 0F, -1F, -0.025F, 0F, -0.2F, -1.9F, 0F, -1.625F, 1.525F, 0F, -0.225F, 1.525F, 0F, -1F, 1.525F, 0F, -0.1175F, 1.525F, 0F); // Box 555
		bodyModel[195].setRotationPoint(-57.75F, -12.4F, -7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.42F, -0.35F, 0.19F, 0.42F, -0.35F, 0.19F, 0.42F, -0.0015F, 0F, 0.005F, -0.125F, 0F, -1.42F, 0.35F, 0.19F, 0.42F, 0.35F, 0.19F, 0.42F, 0.0015F, 0F, 0.005F, 0.1265F, 0F); // Box 556
		bodyModel[196].setRotationPoint(-54.97F, -12F, -9F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.545F, -0.445F, -0.5F, -0.455F, -0.445F, -0.5F, -0.455F, -0.005F, 0F, 0F, -0.0935F, 0F, -0.545F, 0.445F, -0.5F, -0.455F, 0.445F, -0.5F, -0.455F, 0.004F, 0F, 0F, 0.0935F, 0F); // Box 557
		bodyModel[197].setRotationPoint(-55.52F, -12.32F, -7.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1.75F, -2F, 0.19F, -2F, -2F, -0.15F, 0.48F, 0F, 0F, 0.55F, 0F, 0F, 1F, -2F, 0.19F, 1F, -2F, -0.9F, 1F, 0F, 0F, 1F, 0F); // Box 558
		bodyModel[198].setRotationPoint(-51.5F, -11F, -13F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1.06F, -2.15F, -3.03F, 0.5F, -2.4F, -2F, 0.5F, -0.1F, 0F, -1.45F, 0F, 0.81F, -1F, 1.65F, -3F, 0.5F, 1.65F, -2F, 0.5F, 1.65F, 0F, -1.45F, 1.65F, 0.82F); // Box 559
		bodyModel[199].setRotationPoint(-55F, -11.65F, -13F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1.35F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[200].setRotationPoint(-49.15F, -20F, -4F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1.6F, -1.5F, 0F, 0.65F, -1.5F, 0F, 0.65F, 0F, 0F, -1F, 0F, 0F, -0.6F, 1.5F, 0F, 0.65F, 1.5F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[201].setRotationPoint(-48.8F, -20F, -9.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.015F, -0.5F, -0.5F, 0.015F, -0.5F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0.125F, -0.5F, 0.015F, 0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		bodyModel[202].setRotationPoint(-48.2F, -18.5F, -10.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 2, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[203].setRotationPoint(52.5F, 0F, -10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[204].setRotationPoint(55F, 0F, -7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[205].setRotationPoint(52F, 0F, -11F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[206].setRotationPoint(54.5F, 0F, -10F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[207].setRotationPoint(59F, 3F, -1.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[208].setRotationPoint(57.5F, 0F, -7F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F); // Box 495
		bodyModel[209].setRotationPoint(52F, 0F, 10F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F); // Box 496
		bodyModel[210].setRotationPoint(54.5F, 0F, 7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[211].setRotationPoint(57.5F, 0F, 2F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,0F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[212].setRotationPoint(52.5F, 2F, -3.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 2
		bodyModel[213].setRotationPoint(49.5F, 2F, -3.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0.425F, 0F, 0F, 0.425F, 0F, 0F, -0.425F, 0F, 0F); // Box 0
		bodyModel[214].setRotationPoint(58F, 2F, -2F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[215].setRotationPoint(57.5F, 0F, -2F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 0
		bodyModel[216].setRotationPoint(49.5F, 2F, 10F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 0F); // Box 0
		bodyModel[217].setRotationPoint(52F, 2F, 10F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.425F, 0F, 0F, 0.425F, 0F, 0F, -1.285F, 0F, 0F, 1.07F, 0F, -0.5F); // Box 0
		bodyModel[218].setRotationPoint(58F, 2F, 2F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-0.5F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, -0.65F, 0F, 0.35F, 0.18F, 0F, -1F, -0.5F, 0F, 2F); // Box 496
		bodyModel[219].setRotationPoint(54.5F, 2F, 7F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.1125F, 0F, -1.22F, -0.65F, 0F, 0.355F, 0.18F, 0F, -1F, -0.385F, 0F, 1F, -1.47F, -0.5F, 0.465F, -0.53F, -0.5F, 0.465F, 0.23F, -0.5F, -1F, -2.23F, -0.5F, -1F); // Box 496
		bodyModel[220].setRotationPoint(55.5F, 7F, 7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 445
		bodyModel[221].setRotationPoint(49.5F, 2F, -11F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F); // Box 446
		bodyModel[222].setRotationPoint(52F, 2F, -11F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.07F, 0F, -0.425F, -1.285F, 0F, 0F, 0.425F, 0F, 0F, -0.425F, 0F, 0F); // Box 447
		bodyModel[223].setRotationPoint(58F, 2F, -7F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-0.5F, 0F, 2F, 0F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0.18F, 0F, -1F, -0.65F, 0F, 0.35F, -0.5F, 0F, -2F); // Box 448
		bodyModel[224].setRotationPoint(54.5F, 2F, -8F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.385F, 0F, 1F, 0.18F, 0F, -1F, -0.65F, 0F, 0.355F, -0.1125F, 0F, -1.22F, -2.23F, -0.5F, -1F, 0.23F, -0.5F, -1F, -0.53F, -0.5F, 0.465F, -1.47F, -0.5F, 0.465F); // Box 449
		bodyModel[225].setRotationPoint(55.5F, 7F, -8F);

		bodyModel[226].addBox(0F, 0F, 0F, 105, 2, 22, 0F); // Box 0
		bodyModel[226].setRotationPoint(-52.5F, 0F, -11F);

		bodyModel[227].addBox(0F, 0F, 0F, 115, 1, 12, 0F); // Box 0
		bodyModel[227].setRotationPoint(-57.5F, 2F, -6F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 4, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 120
		bodyModel[228].setRotationPoint(31.5F, 2F, -11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 481
		bodyModel[229].setRotationPoint(31.5F, 2F, 11F);

		bodyModel[230].addBox(0F, 0F, 0F, 4, 12, 1, 0F); // Box 0
		bodyModel[230].setRotationPoint(44.5F, -12F, -11F);

		bodyModel[231].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 0
		bodyModel[231].setRotationPoint(31.5F, -17F, -11F);

		bodyModel[232].addBox(0F, 0F, 0F, 4, 12, 1, 0F); // Box 60
		bodyModel[232].setRotationPoint(44.5F, -12F, 10F);

		bodyModel[233].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 61
		bodyModel[233].setRotationPoint(31.5F, -17F, 10F);

		bodyModel[234].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 79
		bodyModel[234].setRotationPoint(36F, -10F, -12F);

		bodyModel[235].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 80
		bodyModel[235].setRotationPoint(31F, -10F, -12F);

		bodyModel[236].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 108
		bodyModel[236].setRotationPoint(36F, -10F, 11F);

		bodyModel[237].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 109
		bodyModel[237].setRotationPoint(31F, -10F, 11F);

		bodyModel[238].addShapeBox(0F, 0F, -0.5F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Rear side door L
		bodyModel[238].setRotationPoint(31.5F, -8F, -10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Rear side door R
		bodyModel[239].setRotationPoint(31.5F, -8F, 10F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[240].setRotationPoint(31F, 2F, -11F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[241].setRotationPoint(35.5F, 2F, -11F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.985F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[242].setRotationPoint(48.5F, -12F, 10F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[243].setRotationPoint(51.5F, -9F, -11F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[244].setRotationPoint(48.5F, -9F, -11F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.985F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[245].setRotationPoint(48.5F, -12F, -11F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,1.115F, 0F, 0F, -1.115F, 0F, 0F, -1.115F, 0F, 0F, 1.115F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[246].setRotationPoint(58F, -8F, -2F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 497
		bodyModel[247].setRotationPoint(57.5F, -9F, 2F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 463
		bodyModel[248].setRotationPoint(57.5F, -9F, -7F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[249].setRotationPoint(51.5F, -9F, 10F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[250].setRotationPoint(48.5F, -9F, 10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0.5F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 0F); // Box 437
		bodyModel[251].setRotationPoint(52F, -9F, 10F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0.5F, 0F, -2F, -2.25F, 0F, 0F, -1.25F, 0F, -1F, 0.5F, 0F, 2F, -0.5F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 2F); // Box 438
		bodyModel[252].setRotationPoint(54.5F, -9F, 7F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0.97F, 0F, 0F, -0.97F, 0F, 0F, -0.97F, 0F, 0F, 0.97F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[253].setRotationPoint(58.7F, -7F, 3F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0.97F, 0F, 0F, -0.97F, 0F, 0F, -0.97F, 0F, 0F, 0.97F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[254].setRotationPoint(58.7F, -7F, -3F);

		bodyModel[255].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Markerlight R type 3 BACK
		bodyModel[255].setRotationPoint(54F, -7.75F, 10.69F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.99F, 0F, 0F, 0.245F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.99F, 0F, -0.5F, 0.035F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F); // Box 216
		bodyModel[256].setRotationPoint(51.26F, -8.5F, 10F);

		bodyModel[257].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Markerlight L type 3 BACK
		bodyModel[257].setRotationPoint(54F, -7.75F, -10.69F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F); // Numberboard L type 3 BACK
		bodyModel[258].setRotationPoint(51.75F, -8.25F, -11.04F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F); // Numberboard R type 3 BACK
		bodyModel[259].setRotationPoint(51.75F, -8.25F, 10.99F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F); // Box 517
		bodyModel[260].setRotationPoint(52F, -9F, -11F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0.5F, 0F, 2F, -1.25F, 0F, -1F, -2.25F, 0F, 0F, 0.5F, 0F, -2F, -0.5F, 0F, 2F, 0F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, -2F); // Box 518
		bodyModel[261].setRotationPoint(54.5F, -9F, -8F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.32F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.245F, -0.32F, 0F, -0.99F, -0.32F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, 0.035F, -0.32F, -0.5F, -0.95F); // Box 519
		bodyModel[262].setRotationPoint(51.26F, -8.5F, -11F);

		bodyModel[263].addShapeBox(-1.04F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F); // Box 353 markerlight type 3 BACK
		bodyModel[263].setRotationPoint(56.81F, -6F, 7.02F);
		bodyModel[263].rotateAngleY = 0.47298423F;

		bodyModel[264].addShapeBox(-1.04F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F); // Box 545 markerlight type 3 BACK
		bodyModel[264].setRotationPoint(56.81F, -6F, -7.02F);
		bodyModel[264].rotateAngleY = -0.47298423F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[265].setRotationPoint(44.5F, -17F, -11F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[266].setRotationPoint(44.5F, -17F, 10F);

		bodyModel[267].addBox(0F, 0F, 0F, 5, 6, 20, 0F); // Box 0
		bodyModel[267].setRotationPoint(40.5F, -6F, -10F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[268].setRotationPoint(40.5F, -17F, -10F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[269].setRotationPoint(40.5F, -19F, -10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[270].setRotationPoint(40.5F, -17F, 8F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[271].setRotationPoint(40.5F, -19F, 8F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.51F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, -0.5F, -0.51F, -0.01F, -0.5F, -0.51F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, -0.5F, -0.51F, -0.01F, -0.5F); // Box 0 cull
		bodyModel[272].setRotationPoint(44F, -16F, -10.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.51F, -0.01F, -0.5F, -0.01F, -0.01F, -0.5F, -0.01F, -0.01F, 0F, -0.51F, -0.01F, 0F, -0.51F, -0.01F, -0.5F, -0.01F, -0.01F, -0.5F, -0.01F, -0.01F, 0F, -0.51F, -0.01F, 0F); // Box 346 cull
		bodyModel[273].setRotationPoint(44F, -16F, 9.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0.49F, -0.01F, 0F, 0.49F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 0 cull
		bodyModel[274].setRotationPoint(47F, -16F, -10.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0.49F, -0.01F, -0.5F, 0.49F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 348
		bodyModel[275].setRotationPoint(47F, -16F, 9.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.255F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.08F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[276].setRotationPoint(46.5F, -17F, 10F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.255F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.08F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[277].setRotationPoint(46.5F, -17F, -11F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,1.075F, 0F, 0F, -1.075F, 0F, 0F, -1.075F, 0F, 0F, 1.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[278].setRotationPoint(48.5F, -16F, -12F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,1.075F, 0F, 0F, -1.075F, 0F, 0F, -1.075F, 0F, 0F, 1.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[279].setRotationPoint(48.5F, -16F, 11F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 105
		bodyModel[280].setRotationPoint(44.5F, -16F, 11F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, -0.5F, 0F, -0.075F, -0.5F, 0F, -0.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.075F, 0.5F, 0F, -0.075F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[281].setRotationPoint(44.5F, -16F, -12F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.35F, 0F, 0F, 0.35F, 0F, 0F, -1.5F, -0.3F, -0.5F, 1.5F, -0.3F, -0.5F, 1.15F, -0.1F, 0F, -1.15F, -0.1F, 0F); // Box 207
		bodyModel[282].setRotationPoint(48.15F, -19F, -0.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.375F, 0F, 0F, 0.375F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.63F, 0F, 0F, 1.625F, 0F, 0F, 0.62F, 0F, 0F, -1.62F, 0F, 0F); // Box 529
		bodyModel[283].setRotationPoint(47.15F, -17F, 10F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1.35F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 208
		bodyModel[284].setRotationPoint(48.15F, -20F, 0F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.65F, 0F, 0F, -1F, 0F, 0F, -1.6F, -1.5F, 0F, 0.65F, -1.5F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, -0.6F, 1.5F, 0F, 0.65F, 1.5F, 0F); // Box 209
		bodyModel[285].setRotationPoint(47.8F, -20F, 3.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, 0F, 0F, -1F, 0F, 0F, -1.05F, -0.5F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0.125F, -0.5F, 0.05F, 0.125F, -0.5F); // Box 208
		bodyModel[286].setRotationPoint(47.2F, -18.5F, 9.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[287].setRotationPoint(47.15F, -18F, 10F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -1.625F, -0.5F, 0.65F, -1.625F, -0.5F, -1.5F, -0.1F, 0F, 1.5F, -0.1F, 0F, 0.85F, 1.525F, -0.5F, -0.85F, 1.525F, -0.5F); // Box 209
		bodyModel[288].setRotationPoint(47.8F, -19F, 3.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 429
		bodyModel[289].setRotationPoint(47.15F, -18F, -11F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.15F, -0.1F, 0F, 1.15F, -0.1F, 0F, 1.5F, -0.3F, -0.5F, -1.5F, -0.3F, -0.5F); // Box 430
		bodyModel[290].setRotationPoint(48.15F, -19F, -3.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0.65F, -1.625F, -0.5F, -0.65F, -1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 1.525F, -0.5F, 0.85F, 1.525F, -0.5F, 1.5F, -0.1F, 0F, -1.5F, -0.1F, 0F); // Box 431
		bodyModel[291].setRotationPoint(47.8F, -19F, -10.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0.01F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.54F, 0F, 0F, 0.625F, 0F, 0F, -0.46F, 0F, 0F, -0.54F, 0F, 0F); // Box 529
		bodyModel[292].setRotationPoint(48.77F, -11F, 10F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, -1.62F, 0F, 0F, 0.62F, 0F, 0F, 1.625F, 0F, 0F, -1.63F, 0F, 0F); // Box 434
		bodyModel[293].setRotationPoint(47.15F, -17F, -11F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.54F, 0F, 0F, -0.46F, 0F, 0F, 0.625F, 0F, 0F, -0.54F, 0F, 0F); // Box 436
		bodyModel[294].setRotationPoint(48.77F, -11F, -11F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, -0.5F, -1.35F, 0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 560
		bodyModel[295].setRotationPoint(48.15F, -20F, -4F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.65F, -1.5F, 0F, -1.6F, -1.5F, 0F, -1F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 1.5F, 0F, -0.6F, 1.5F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 561
		bodyModel[296].setRotationPoint(47.8F, -20F, -9.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, -0.5F, -0.5F, -1.05F, -0.5F, -0.5F, -1F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.125F, -0.5F, -0.05F, 0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		bodyModel[297].setRotationPoint(47.2F, -18.5F, -10.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[298].setRotationPoint(41.5F, -20F, -3.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -1.5F, 0F, -0.35F, -1.5F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -0.35F, 1.5F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[299].setRotationPoint(41.5F, -20F, -9.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 88
		bodyModel[300].setRotationPoint(41.5F, -20F, 3.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -1F, 0F, -0.35F, -1F, 0F, -0.35F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[301].setRotationPoint(41.5F, -18F, -11F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0.5F, -0.5F, -0.35F, 0.5F, -0.5F, -0.35F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[302].setRotationPoint(41.5F, -18F, 9F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[303].setRotationPoint(47F, -21F, 0.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[304].setRotationPoint(45F, -22F, 0.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[305].setRotationPoint(45.5F, -21F, -1.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[306].setRotationPoint(45.5F, -22F, -1.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F); // Box 0
		bodyModel[307].setRotationPoint(56.75F, -9F, -2F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.07F, -0.5F, 0F, 0F, -0.5F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F); // Box 0
		bodyModel[308].setRotationPoint(56.75F, -9F, -1F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F); // Box 430
		bodyModel[309].setRotationPoint(56.75F, -9F, 1F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0.07F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F); // Box 431
		bodyModel[310].setRotationPoint(56.75F, -9F, 0F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.202F, 0F, -1F, -0.202F, 0F, -1F, -0.202F, 0F, 0F, 0.202F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		bodyModel[311].setRotationPoint(56.75F, -10.5F, 1F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.202F, 0F, 0F, -0.202F, 0F, 0F, -0.202F, 0F, -1F, 0.202F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 433
		bodyModel[312].setRotationPoint(56.75F, -10.5F, -2F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.135F, -0.125F, 0F, 0.1325F, -0.125F, 0F, -1.375F, -0.125F, 0F, 1.375F, -0.125F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F); // Box 497
		bodyModel[313].setRotationPoint(56.5F, -10F, 2F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.05F, -0.1F, -2.19F, -1.525F, 0.125F, 0F, -0.375F, -1.875F, -3F, -0.44F, -2.25F, -0.03F, -0.05F, 1.75F, -2.19F, -1.525F, 1.75F, 0F, -0.25F, 1.75F, -3F, -0.5F, 1.75F, 0F); // Box 438
		bodyModel[314].setRotationPoint(53.5F, -11.75F, 7F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,1.375F, -0.125F, 0F, -1.375F, -0.125F, 0F, 0.135F, -0.125F, 0F, -0.135F, -0.125F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 445
		bodyModel[315].setRotationPoint(56.5F, -10F, -7F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-1F, -0.025F, 0F, -0.2F, -1.9F, 0F, -1.625F, -2.525F, 0F, -0.225F, -0.525F, 0F, -1F, 1.525F, 0F, -0.1175F, 1.525F, 0F, -1.625F, 1.525F, 0F, -0.225F, 1.525F, 0F); // Box 497
		bodyModel[316].setRotationPoint(54.75F, -12.4F, 2F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.15F, 0.48F, 0F, 0F, 0.55F, 0F, 0F, -1.75F, -2F, 0.19F, -2F, -2F, -0.9F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0.19F, 1F, -2F); // Box 60
		bodyModel[317].setRotationPoint(49.5F, -11F, 10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.5F, -0.1F, 0F, -1.45F, 0F, 0.81F, -1.06F, -2.15F, -3.03F, 0.5F, -2.4F, -2F, 0.5F, 1.65F, 0F, -1.45F, 1.65F, 0.82F, -1F, 1.65F, -3F, 0.5F, 1.65F, -2F); // Box 437
		bodyModel[318].setRotationPoint(52F, -11.65F, 10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.44F, -2.25F, 0.97F, -0.375F, -1.875F, -2F, -1.525F, 0.125F, -1F, -0.05F, -0.1F, -3.19F, -0.5F, 1.75F, 1F, -0.25F, 1.75F, -2F, -1.525F, 1.75F, -1F, -0.05F, 1.75F, -3.19F); // Box 554
		bodyModel[319].setRotationPoint(53.5F, -11.75F, -9F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.225F, -0.525F, 0F, -1.625F, -2.525F, 0F, -0.2F, -1.9F, 0F, -1F, -0.025F, 0F, -0.225F, 1.525F, 0F, -1.625F, 1.525F, 0F, -0.1175F, 1.525F, 0F, -1F, 1.525F, 0F); // Box 555
		bodyModel[320].setRotationPoint(54.75F, -12.4F, -7F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.19F, -2F, -2F, 0F, -1.75F, -2F, 0F, 0.55F, 0F, -0.15F, 0.48F, 0F, 0.19F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, -0.9F, 1F, 0F); // Box 558
		bodyModel[321].setRotationPoint(49.5F, -11F, -13F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.5F, -2.4F, -2F, -1.06F, -2.15F, -3.03F, -1.45F, 0F, 0.81F, 0.5F, -0.1F, 0F, 0.5F, 1.65F, -2F, -1F, 1.65F, -3F, -1.45F, 1.65F, 0.82F, 0.5F, 1.65F, 0F); // Box 559
		bodyModel[322].setRotationPoint(52F, -11.65F, -13F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[323].setRotationPoint(57F, -12.5F, 1F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[324].setRotationPoint(57F, -12.5F, 0F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[325].setRotationPoint(57F, -12.5F, -2F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[326].setRotationPoint(57F, -12.5F, -2F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[327].setRotationPoint(57F, -10.5F, 1F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[328].setRotationPoint(57F, -10.5F, -2F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[329].setRotationPoint(57F, -9.5F, 0F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[330].setRotationPoint(57F, -9.5F, -2F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 167
		bodyModel[331].setRotationPoint(55.75F, -10.5F, 0F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[332].setRotationPoint(55.75F, -10.5F, -2F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[333].setRotationPoint(55.75F, -12.5F, -2F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[334].setRotationPoint(55.75F, -12.5F, 0F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[335].setRotationPoint(58.01F, -12.5F, 1F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F); // Box 403
		bodyModel[336].setRotationPoint(58.01F, -12.5F, 0F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[337].setRotationPoint(58.01F, -10.5F, 1F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[338].setRotationPoint(58.01F, -9.5F, 0F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 489
		bodyModel[339].setRotationPoint(58.01F, -12.5F, -2F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 490
		bodyModel[340].setRotationPoint(58.01F, -12.5F, -2F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F); // Box 491
		bodyModel[341].setRotationPoint(58.01F, -10.5F, -2F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[342].setRotationPoint(58.01F, -9.5F, -2F);

		bodyModel[343].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight back 2beam top A
		bodyModel[343].setRotationPoint(57F, -10.5F, 0F);

		bodyModel[344].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight back 2beam top A
		bodyModel[344].setRotationPoint(57F, -10.5F, 0F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight back big top
		bodyModel[345].setRotationPoint(57F, -11.75F, -1.25F);

		bodyModel[346].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight back 2beam top B
		bodyModel[346].setRotationPoint(57F, -10.5F, 0F);
		bodyModel[346].rotateAngleX = 1.57079633F;

		bodyModel[347].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight back 2beam top B
		bodyModel[347].setRotationPoint(57F, -10.5F, 0F);
		bodyModel[347].rotateAngleX = 1.57079633F;

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.61F, 0F, -0.5F, 0F, 0F, -0.5F, -0.03F, 0F, 0F, -0.61F, 0F, 0F, -0.61F, -0.5F, -1F, 1.41F, -0.5F, -1F, 1.41F, -0.5F, 0F, -0.61F, -0.5F, 0F); // Box 430
		bodyModel[348].setRotationPoint(55.14F, -12F, 1F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.61F, 0.006F, -0.5F, -0.39F, 0.006F, -0.5F, -0.39F, -0.025F, 0F, -0.61F, -0.025F, 0F, -0.61F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, -0.03F, -0.6F, 0F, -0.61F, -0.6F, 0F); // Box 430
		bodyModel[349].setRotationPoint(55.14F, -12.4F, 1F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.094F, -0.5F, 0F, -0.094F, -0.5F, 0F, -1F, 0F, -1F, -1F, 0F, -0.51F, -0.4F, -0.5F, 0F, -0.4F, -0.5F); // Box 430
		bodyModel[350].setRotationPoint(55.75F, -12.5F, 0F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.61F, 0F, 0F, -0.03F, 0F, 0F, 0F, 0F, -0.5F, -0.61F, 0F, -0.5F, -0.61F, -0.5F, 0F, 1.41F, -0.5F, 0F, 1.41F, -0.5F, -1F, -0.61F, -0.5F, -1F); // Box 459
		bodyModel[351].setRotationPoint(55.14F, -12F, -2F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.61F, -0.025F, 0F, -0.39F, -0.025F, 0F, -0.39F, 0.006F, -0.5F, -0.61F, 0.006F, -0.5F, -0.61F, -0.6F, 0F, -0.03F, -0.6F, 0F, 0F, -0.6F, -0.5F, -0.61F, -0.6F, -0.5F); // Box 460
		bodyModel[352].setRotationPoint(55.14F, -12.4F, -2F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.094F, -0.5F, -1F, -0.094F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.5F, -0.51F, -0.4F, -0.5F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 465
		bodyModel[353].setRotationPoint(55.75F, -12.5F, -2F);

		bodyModel[354].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight back small top
		bodyModel[354].setRotationPoint(57F, -10.5F, 0F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0.1F, 0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.725F, 0F, 0.3F, 0.085F, 0F, 0.1F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0.3F, 0F, 0F); // Box 208
		bodyModel[355].setRotationPoint(50.75F, -13.1F, 0F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0.05F, 0F, 0F, -2.05F, 0F, 0F, 0F, -1.25F, -0.31F, 0.05F, -1.18F, -0.31F, 0.05F, 0F, 0F, -2.05F, 0F, 0F, 0F, 1.25F, -0.31F, 0.05F, 1.18F, -0.31F); // Box 209
		bodyModel[356].setRotationPoint(51.55F, -12.9F, 3.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.05F, 0F, 0.01F, 0F, -0.07F, 0.01F, 0F, -0.07F, -1.01F, 0.05F, -0.17F, -0.2F, 0.05F, 0F, 0.01F, 0F, 0.07F, 0.01F, 0F, 0.07F, -1.01F, 0.05F, 0.17F, -0.2F); // Box 209
		bodyModel[357].setRotationPoint(51.55F, -11.72F, 9.2F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.05F, -0.17F, -0.2F, 0F, -0.07F, -1.01F, 0F, -0.07F, 0.01F, 0.05F, 0F, 0.01F, 0.05F, 0.17F, -0.2F, 0F, 0.07F, -1.01F, 0F, 0.07F, 0.01F, 0.05F, 0F, 0.01F); // Box 468
		bodyModel[358].setRotationPoint(51.55F, -11.72F, -10.2F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.42F, -0.005F, 0F, 0.005F, -0.2435F, 0F, 0.005F, -0.685F, -0.5F, 0.42F, -0.5615F, -0.5F, 0.42F, 0.005F, 0F, 0.005F, 0.2435F, 0F, 0.005F, 0.685F, -0.5F, 0.42F, 0.5615F, -0.5F); // Box 209
		bodyModel[359].setRotationPoint(53.97F, -12.56F, 3.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.42F, -0.0015F, 0F, 0.005F, -0.125F, 0F, -1.42F, -0.35F, 0.19F, 0.42F, -0.35F, 0.19F, 0.42F, 0.0015F, 0F, 0.005F, 0.1265F, 0F, -1.42F, 0.35F, 0.19F, 0.42F, 0.35F, 0.19F); // Box 209
		bodyModel[360].setRotationPoint(53.97F, -12F, 7F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.455F, -0.005F, 0F, 0F, -0.0935F, 0F, -0.545F, -0.445F, -0.5F, -0.455F, -0.445F, -0.5F, -0.455F, 0.004F, 0F, 0F, 0.0935F, 0F, -0.545F, 0.445F, -0.5F, -0.455F, 0.445F, -0.5F); // Box 209
		bodyModel[361].setRotationPoint(54.52F, -12.32F, 3.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.42F, -0.5615F, -0.5F, 0.005F, -0.685F, -0.5F, 0.005F, -0.2435F, 0F, 0.42F, -0.005F, 0F, 0.42F, 0.5615F, -0.5F, 0.005F, 0.685F, -0.5F, 0.005F, 0.2435F, 0F, 0.42F, 0.005F, 0F); // Box 472
		bodyModel[362].setRotationPoint(53.97F, -12.56F, -7.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0.3F, 0.085F, -0.5F, 0F, -0.725F, -0.5F, -0.2325F, -0.875F, 0F, 0.45F, 0F, 0F, 0.3F, 0F, -0.5F, 0F, 0.6F, -0.5F, -0.2325F, 0.875F, 0F, 0.45F, 0F, 0F); // Box 208
		bodyModel[363].setRotationPoint(50.75F, -13.1F, 1.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0.3F, 0.085F, 0F, 0F, -0.725F, 0F, 0F, -0.6F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0.1F, 0F, 0F); // Box 466
		bodyModel[364].setRotationPoint(50.75F, -13.1F, -2F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0.45F, 0F, 0F, -0.2325F, -0.875F, 0F, 0F, -0.725F, -0.5F, 0.3F, 0.085F, -0.5F, 0.45F, 0F, 0F, -0.2325F, 0.875F, 0F, 0F, 0.6F, -0.5F, 0.3F, 0F, -0.5F); // Box 467
		bodyModel[365].setRotationPoint(50.75F, -13.1F, -3.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0.05F, 0F, 0F, 0F, -0.345F, 0F, 0F, -1.25F, -0.31F, -2F, -1.25F, -0.31F, 0.05F, 0F, 0F, 0F, 0.345F, 0F, 0F, 1.25F, -0.31F, -2F, 1.25F, -0.31F); // Box 209
		bodyModel[366].setRotationPoint(51.55F, -12.9F, 3.5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0.05F, -1.18F, -0.31F, 0F, -1.25F, -0.31F, -2.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 1.18F, -0.31F, 0F, 1.25F, -0.31F, -2.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 470
		bodyModel[367].setRotationPoint(51.55F, -12.9F, -9.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-2F, -1.25F, -0.31F, 0F, -1.25F, -0.31F, 0F, -0.345F, 0F, 0.05F, 0F, 0F, -2F, 1.25F, -0.31F, 0F, 1.25F, -0.31F, 0F, 0.345F, 0F, 0.05F, 0F, 0F); // Box 471
		bodyModel[368].setRotationPoint(51.55F, -12.9F, -9.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.8F, 0F, 0F, -1.2F, 0F, 0F, 0F, -1.55F, -0.5F, -0.15F, -1.625F, -0.5F, -0.8F, 0F, 0F, -1.2F, 0F, 0F, 0F, 1.55F, -0.5F, -0.15F, 1.625F, -0.5F); // Box 209
		bodyModel[369].setRotationPoint(49.5F, -13.1F, 3.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.8F, 0F, 0F, 0F, -0.2F, 0F, 0F, -1.55F, -0.5F, -2F, -1.55F, -0.5F, -0.8F, 0F, 0F, 0F, 0.2F, 0F, 0F, 1.55F, -0.5F, -2F, 1.55F, -0.5F); // Box 209
		bodyModel[370].setRotationPoint(49.5F, -13.1F, 3.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.15F, -1.625F, -0.5F, 0F, -1.55F, -0.5F, -1.2F, 0F, 0F, -0.8F, 0F, 0F, -0.15F, 1.625F, -0.5F, 0F, 1.55F, -0.5F, -1.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 480
		bodyModel[371].setRotationPoint(49.5F, -13.1F, -10.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-2F, -1.55F, -0.5F, 0F, -1.55F, -0.5F, 0F, -0.2F, 0F, -0.8F, 0F, 0F, -2F, 1.55F, -0.5F, 0F, 1.55F, -0.5F, 0F, 0.2F, 0F, -0.8F, 0F, 0F); // Box 481
		bodyModel[372].setRotationPoint(49.5F, -13.1F, -10.5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.42F, -0.35F, 0.19F, -1.42F, -0.35F, 0.19F, 0.005F, -0.125F, 0F, 0.42F, -0.0015F, 0F, 0.42F, 0.35F, 0.19F, -1.42F, 0.35F, 0.19F, 0.005F, 0.1265F, 0F, 0.42F, 0.0015F, 0F); // Box 556
		bodyModel[373].setRotationPoint(53.97F, -12F, -9F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.455F, -0.445F, -0.5F, -0.545F, -0.445F, -0.5F, 0F, -0.0935F, 0F, -0.455F, -0.005F, 0F, -0.455F, 0.445F, -0.5F, -0.545F, 0.445F, -0.5F, 0F, 0.0935F, 0F, -0.455F, 0.004F, 0F); // Box 557
		bodyModel[374].setRotationPoint(54.52F, -12.32F, -7.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.35F, 0F, -0.5F, 0.35F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.5F, 0.35F, 0F, -0.5F); // Box 208
		bodyModel[375].setRotationPoint(49.65F, -13.1F, 0F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[376].setRotationPoint(49.65F, -13.1F, -4F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -1.625F, -0.5F, 0.65F, -1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 1.625F, -0.5F, 0.65F, 1.625F, -0.5F); // Box 209
		bodyModel[377].setRotationPoint(49.3F, -13.1F, 3.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0.65F, -1.625F, -0.5F, -0.65F, -1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 1.625F, -0.5F, -0.65F, 1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[378].setRotationPoint(49.3F, -13.1F, -10.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.05F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.35F, -1F, 0F, 0F, -1F, 0F, 0.05F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.25F, 0F, -1F, 0.09F, 0F, -1F); // Box 355
		bodyModel[379].setRotationPoint(41.5F, -18F, 10F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.35F, -1F, 0F, 0F, -1F, 0F, 0.05F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.35F, 0F, -1F, 0.09F, 0F, -1F, 0.05F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F); // Box 420
		bodyModel[380].setRotationPoint(41.15F, -18F, -11F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[381].setRotationPoint(45.5F, -3F, -2F);

		bodyModel[382].addBox(0F, 0F, 0F, 3, 6, 8, 0F); // Box 0
		bodyModel[382].setRotationPoint(45.5F, -6F, -10F);

		bodyModel[383].addBox(0F, 0F, 0F, 3, 6, 8, 0F); // Box 396
		bodyModel[383].setRotationPoint(45.5F, -6F, 2F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[384].setRotationPoint(48.5F, -10F, -10F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-0.65F, -1.95F, 0F, -0.35F, -1.95F, 0F, 0.65F, 0.3F, 0F, -1.65F, 0.3F, 0F, -0.5F, 0F, 0F, -0.35F, 0F, 0F, 0.65F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[385].setRotationPoint(48F, -13F, -10F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-1.65F, 0.3F, 0F, 0.65F, 0.3F, 0F, -0.35F, -1.95F, 0F, -0.65F, -1.95F, 0F, -0.5F, 0F, 0F, 0.65F, 0F, 0F, -0.35F, 0F, 0F, -0.5F, 0F, 0F); // Box 416
		bodyModel[386].setRotationPoint(48F, -13F, 0F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 83, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[387].setRotationPoint(-41.5F, -22F, -2.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 83, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[388].setRotationPoint(-41.5F, -22F, -8.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 83, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 88
		bodyModel[389].setRotationPoint(-41.5F, -22F, 2.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 83, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 336
		bodyModel[390].setRotationPoint(-41.5F, -20F, 8F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 83, 1, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 579
		bodyModel[391].setRotationPoint(-41.5F, -20F, -11F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[392].setRotationPoint(-41.5F, -21F, -2.5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.835F, 0F, 0F, -0.835F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[393].setRotationPoint(-41.5F, -21F, -5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.835F, -0.5F, 0F, -0.835F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 358
		bodyModel[394].setRotationPoint(-41.5F, -21F, 2.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[395].setRotationPoint(40.5F, -21F, -2.5F);

		bodyModel[396].addBox(0F, 0F, 0F, 9, 6, 5, 0F); // Box 0
		bodyModel[396].setRotationPoint(-17F, 2F, 4F);

		bodyModel[397].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 0
		bodyModel[397].setRotationPoint(-17F, 5F, 9F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -2F, 0F, 1.5F, -2F); // Box 0
		bodyModel[398].setRotationPoint(-17F, 2.5F, 9F);

		bodyModel[399].addBox(0F, 0F, 0F, 9, 6, 5, 0F); // Box 833
		bodyModel[399].setRotationPoint(-17F, 2F, -9F);

		bodyModel[400].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 834
		bodyModel[400].setRotationPoint(-17F, 5F, -10F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -2F, 0F, 1.5F, -2F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 835
		bodyModel[401].setRotationPoint(-17F, 2.5F, -12F);

		bodyModel[402].addBox(0F, 0F, 0F, 10, 5, 20, 0F); // Box 0
		bodyModel[402].setRotationPoint(-6.5F, 3F, -10F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[403].setRotationPoint(-6.5F, 8F, -10F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420 water filler
		bodyModel[404].setRotationPoint(-3.5F, 2F, 5.85F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 421 water filler
		bodyModel[405].setRotationPoint(-3.5F, 2F, -10.85F);

		bodyModel[406].addBox(0F, 0F, 0F, 12, 5, 16, 0F); // Box 0
		bodyModel[406].setRotationPoint(5F, 3F, -8F);

		bodyModel[407].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 0
		bodyModel[407].setRotationPoint(7F, 3F, -9.59F);
		bodyModel[407].rotateAngleX = -0.78539816F;

		bodyModel[408].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0.415F, 0F, 0F, 0.415F, 0F, 0F, 0.415F, -0.175F, 0F, 0.415F, -0.175F); // Box 0 cull
		bodyModel[408].setRotationPoint(8F, 2F, -11F);

		bodyModel[409].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 343
		bodyModel[409].setRotationPoint(7F, 3F, 9.59F);
		bodyModel[409].rotateAngleX = -0.78539816F;

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420 fuel filler
		bodyModel[410].setRotationPoint(5.75F, 2F, 7.85F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 421 fuel filler
		bodyModel[411].setRotationPoint(5.75F, 2F, -10.85F);

		bodyModel[412].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[412].setRotationPoint(-36.5F, 2.5F, -2F);

		bodyModel[413].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[413].setRotationPoint(32.5F, 2.5F, -2F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[414].setRotationPoint(33.5F, 2F, -11F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[415].setRotationPoint(33.5F, 2F, 6F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[416].setRotationPoint(-35.5F, 2F, -11F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[417].setRotationPoint(-36F, 2F, 6F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 23, 29, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -11F, -16F, 0F, -11F, -16F, 0F, 0F, -16F, 0F); // Box 0
		bodyModel[418].setRotationPoint(-15.5F, -14.01F, -11.01F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 23, 29, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -11F, -16F, 0F, -11F, -16F, 0F, 0F, -16F, 0F); // Box 378
		bodyModel[419].setRotationPoint(-15.5F, -14.01F, 11.01F);

		bodyModel[420].addBox(0F, 0F, 0F, 63, 17, 1, 0F); // Box 0
		bodyModel[420].setRotationPoint(-31.5F, -17F, -11F);

		bodyModel[421].addBox(0F, 0F, 0F, 63, 17, 1, 0F); // Box 62
		bodyModel[421].setRotationPoint(-31.5F, -17F, 10F);

		bodyModel[422].addBox(0F, 0F, 0F, 9, 17, 1, 0F); // Box 0
		bodyModel[422].setRotationPoint(35.5F, -17F, -11F);

		bodyModel[423].addBox(0F, 0F, 0F, 9, 17, 1, 0F); // Box 62
		bodyModel[423].setRotationPoint(35.5F, -17F, 10F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0.02F, -3F, 0F, 0.02F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.02F, -3F, -3F, 0.02F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 378
		bodyModel[424].setRotationPoint(16.5F, -14.01F, 10.01F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0.02F, 0F, -3F, 0.02F); // Box 0
		bodyModel[425].setRotationPoint(25.5F, -14.01F, -11.01F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0.02F, -3F, 0F, 0.02F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.02F, -3F, -3F, 0.02F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 378
		bodyModel[426].setRotationPoint(-30.5F, -14.01F, 10.01F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0.02F, 0F, -3F, 0.02F); // Box 0
		bodyModel[427].setRotationPoint(-30.5F, -14.01F, -11.01F);

		bodyModel[428].addBox(0F, 0F, 0F, 19, 4, 7, 0F); // Box 0
		bodyModel[428].setRotationPoint(16.5F, -4F, -3.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 19, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[429].setRotationPoint(16.5F, -4F, -5.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[430].setRotationPoint(16.5F, -4F, 3.5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[431].setRotationPoint(33.5F, -4F, 3.5F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 24, 9, 7, 0F,0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[432].setRotationPoint(16.5F, -13F, -3.5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 18, 2, 5, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[433].setRotationPoint(17.3F, -15F, -2.5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[434].setRotationPoint(17.6F, -15F, -3.83F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[435].setRotationPoint(19.98F, -15F, -3.83F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[436].setRotationPoint(22.36F, -15F, -3.83F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[437].setRotationPoint(24.71F, -15F, -3.83F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[438].setRotationPoint(27.08F, -15F, -3.83F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[439].setRotationPoint(29.46F, -15F, -3.83F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[440].setRotationPoint(31.84F, -15F, -3.83F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[441].setRotationPoint(34.22F, -15F, -3.83F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[442].setRotationPoint(17.3F, -17F, -3.83F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[443].setRotationPoint(19.68F, -17F, -3.83F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 24, 3, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.34F, 0F, 0F, -0.34F); // Box 0
		bodyModel[444].setRotationPoint(16.5F, -10F, -4.83F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[445].setRotationPoint(22.06F, -17F, -3.83F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[446].setRotationPoint(24.41F, -17F, -3.83F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[447].setRotationPoint(26.78F, -17F, -3.83F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[448].setRotationPoint(29.16F, -17F, -3.83F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[449].setRotationPoint(31.54F, -17F, -3.83F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[450].setRotationPoint(33.9F, -17F, -3.83F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[451].setRotationPoint(17F, -22.5F, -2F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 394
		bodyModel[452].setRotationPoint(16.25F, -15.28F, 3.5F);
		bodyModel[452].rotateAngleX = -0.78539816F;

		bodyModel[453].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 394
		bodyModel[453].setRotationPoint(18.29F, -17.75F, 3.5F);
		bodyModel[453].rotateAngleX = -0.78539816F;

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 0
		bodyModel[454].setRotationPoint(24.05F, -22.5F, 3F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 0
		bodyModel[455].setRotationPoint(28.75F, -22.5F, 3F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 0
		bodyModel[456].setRotationPoint(33.52F, -22.5F, 3F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 0
		bodyModel[457].setRotationPoint(19.3F, -22.5F, 3F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F); // Box 361
		bodyModel[458].setRotationPoint(40.5F, -21F, 5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.375F, 0F, 0F, 0.375F, 0F); // Box 621
		bodyModel[459].setRotationPoint(40.5F, -21F, -9F);

		bodyModel[460].addBox(0F, 0F, 0F, 1, 14, 10, 0F); // Box 0
		bodyModel[460].setRotationPoint(-41.5F, -20F, -5F);

		bodyModel[461].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // Box 0
		bodyModel[461].setRotationPoint(41.5F, -9F, -5F);

		bodyModel[462].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // Box 638
		bodyModel[462].setRotationPoint(-42.5F, -9F, -5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[463].setRotationPoint(-36F, -22.5F, -2F);

		bodyModel[464].addBox(0F, 0F, 0F, 19, 4, 7, 0F); // Box 270
		bodyModel[464].setRotationPoint(-35.5F, -4F, -3.5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 19, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[465].setRotationPoint(-35.5F, -4F, 3.5F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[466].setRotationPoint(-32.5F, -4F, -5.5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[467].setRotationPoint(-35.5F, -4F, -5.5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 24, 9, 7, 0F,0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[468].setRotationPoint(-35.5F, -13F, -3.5F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 18, 2, 5, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[469].setRotationPoint(-35.5F, -15F, -2.5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[470].setRotationPoint(-35.2F, -15F, 3.83F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[471].setRotationPoint(-32.82F, -15F, 3.83F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[472].setRotationPoint(-30.44F, -15F, 3.83F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[473].setRotationPoint(-28.09F, -15F, 3.83F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[474].setRotationPoint(-25.72F, -15F, 3.83F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[475].setRotationPoint(-23.34F, -15F, 3.83F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[476].setRotationPoint(-20.96F, -15F, 3.83F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[477].setRotationPoint(-18.58F, -15F, 3.83F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[478].setRotationPoint(-35.5F, -17F, -2.17F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[479].setRotationPoint(-33.12F, -17F, -2.17F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 24, 3, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, -5F, 0F, -0.34F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[480].setRotationPoint(-35.5F, -10F, 2.83F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[481].setRotationPoint(-30.74F, -17F, -2.17F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[482].setRotationPoint(-28.39F, -17F, -2.17F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[483].setRotationPoint(-26.02F, -17F, -2.17F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[484].setRotationPoint(-23.64F, -17F, -2.17F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[485].setRotationPoint(-21.26F, -17F, -2.17F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, -0.4F, 0F, 0.33F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[486].setRotationPoint(-18.9F, -17F, -2.17F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F); // Box 306
		bodyModel[487].setRotationPoint(-34.25F, -15.28F, -3.5F);
		bodyModel[487].rotateAngleX = -0.78539816F;

		bodyModel[488].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0.22F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.22F, -0.125F, -0.125F); // Box 308
		bodyModel[488].setRotationPoint(-35.29F, -17.75F, -3.5F);
		bodyModel[488].rotateAngleX = -0.78539816F;

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 0
		bodyModel[489].setRotationPoint(-34.5F, -22.5F, -4F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 0
		bodyModel[490].setRotationPoint(-29.75F, -22.5F, -4F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 0
		bodyModel[491].setRotationPoint(-25.05F, -22.5F, -4F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F, 0F, 0.435F, 0F); // Box 0
		bodyModel[492].setRotationPoint(-20.28F, -22.5F, -4F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.67F, 0F, 0F, -0.67F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[493].setRotationPoint(-1F, -22.5F, 2.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[494].setRotationPoint(-1F, -21F, -5F);

		bodyModel[495].addBox(0F, 0F, 0F, 7, 9, 7, 0F); // Box 0
		bodyModel[495].setRotationPoint(-3.5F, -9F, -2F);

		bodyModel[496].addBox(0F, 0F, 0F, 4, 8, 4, 0F); // Box 0
		bodyModel[496].setRotationPoint(-2.5F, -8F, -6F);

		bodyModel[497].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 0
		bodyModel[497].setRotationPoint(-1.5F, -14F, -6F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[498].setRotationPoint(4.55F, -9F, 3.57F);
		bodyModel[498].rotateAngleY = 0.78539816F;

		bodyModel[499].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[499].setRotationPoint(-4F, -4F, -6F);
		bodyModel[499].rotateAngleY = 0.78539816F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 0
		bodyModel[501] = new ModelRendererTurbo(this, 266, 216, textureX, textureY); // Box 169
		bodyModel[502] = new ModelRendererTurbo(this, 340, 220, textureX, textureY); // Box 169
		bodyModel[503] = new ModelRendererTurbo(this, 340, 215, textureX, textureY); // Box 439
		bodyModel[504] = new ModelRendererTurbo(this, 276, 236, textureX, textureY); // Box 0
		bodyModel[505] = new ModelRendererTurbo(this, 270, 244, textureX, textureY); // Box 0
		bodyModel[506] = new ModelRendererTurbo(this, 309, 219, textureX, textureY); // Box 103
		bodyModel[507] = new ModelRendererTurbo(this, 305, 233, textureX, textureY); // Box 169
		bodyModel[508] = new ModelRendererTurbo(this, 354, 193, textureX, textureY); // Box 169
		bodyModel[509] = new ModelRendererTurbo(this, 356, 247, textureX, textureY); // Box 169
		bodyModel[510] = new ModelRendererTurbo(this, 382, 191, textureX, textureY); // Box 347
		bodyModel[511] = new ModelRendererTurbo(this, 356, 225, textureX, textureY); // Box 348
		bodyModel[512] = new ModelRendererTurbo(this, 350, 233, textureX, textureY); // Box 169
		bodyModel[513] = new ModelRendererTurbo(this, 354, 242, textureX, textureY); // Box 169
		bodyModel[514] = new ModelRendererTurbo(this, 354, 228, textureX, textureY); // Box 351
		bodyModel[515] = new ModelRendererTurbo(this, 137, 205, textureX, textureY); // Box 169
		bodyModel[516] = new ModelRendererTurbo(this, 125, 215, textureX, textureY); // Box 169
		bodyModel[517] = new ModelRendererTurbo(this, 125, 210, textureX, textureY); // Box 439
		bodyModel[518] = new ModelRendererTurbo(this, 181, 248, textureX, textureY); // Box 0
		bodyModel[519] = new ModelRendererTurbo(this, 203, 236, textureX, textureY); // Box 0
		bodyModel[520] = new ModelRendererTurbo(this, 195, 227, textureX, textureY); // Box 103
		bodyModel[521] = new ModelRendererTurbo(this, 150, 225, textureX, textureY); // Box 169
		bodyModel[522] = new ModelRendererTurbo(this, 98, 239, textureX, textureY); // Box 169
		bodyModel[523] = new ModelRendererTurbo(this, 152, 248, textureX, textureY); // Box 169
		bodyModel[524] = new ModelRendererTurbo(this, 98, 207, textureX, textureY); // Box 347
		bodyModel[525] = new ModelRendererTurbo(this, 116, 202, textureX, textureY); // Box 348
		bodyModel[526] = new ModelRendererTurbo(this, 98, 230, textureX, textureY); // Box 169
		bodyModel[527] = new ModelRendererTurbo(this, 98, 225, textureX, textureY); // Box 169
		bodyModel[528] = new ModelRendererTurbo(this, 150, 251, textureX, textureY); // Box 351
		bodyModel[529] = new ModelRendererTurbo(this, 420, 225, textureX, textureY); // Box 0
		bodyModel[530] = new ModelRendererTurbo(this, 421, 208, textureX, textureY); // Box 0
		bodyModel[531] = new ModelRendererTurbo(this, 456, 220, textureX, textureY); // Box 0
		bodyModel[532] = new ModelRendererTurbo(this, 420, 210, textureX, textureY); // Box 0
		bodyModel[533] = new ModelRendererTurbo(this, 421, 215, textureX, textureY); // Box 0
		bodyModel[534] = new ModelRendererTurbo(this, 401, 250, textureX, textureY); // Box 0
		bodyModel[535] = new ModelRendererTurbo(this, 411, 243, textureX, textureY); // Box 0
		bodyModel[536] = new ModelRendererTurbo(this, 409, 249, textureX, textureY); // Box 0
		bodyModel[537] = new ModelRendererTurbo(this, 390, 249, textureX, textureY); // Box 471
		bodyModel[538] = new ModelRendererTurbo(this, 409, 236, textureX, textureY); // Box 0
		bodyModel[539] = new ModelRendererTurbo(this, 398, 239, textureX, textureY); // Box 0
		bodyModel[540] = new ModelRendererTurbo(this, 389, 236, textureX, textureY); // Box 0
		bodyModel[541] = new ModelRendererTurbo(this, 391, 241, textureX, textureY); // Box 0
		bodyModel[542] = new ModelRendererTurbo(this, 396, 231, textureX, textureY); // Box 0
		bodyModel[543] = new ModelRendererTurbo(this, 418, 242, textureX, textureY); // Box 0
		bodyModel[544] = new ModelRendererTurbo(this, 415, 245, textureX, textureY); // Box 0
		bodyModel[545] = new ModelRendererTurbo(this, 417, 230, textureX, textureY); // Box 0
		bodyModel[546] = new ModelRendererTurbo(this, 411, 227, textureX, textureY); // Box 0
		bodyModel[547] = new ModelRendererTurbo(this, 405, 232, textureX, textureY); // Box 0
		bodyModel[548] = new ModelRendererTurbo(this, 413, 223, textureX, textureY); // Box 757
		bodyModel[549] = new ModelRendererTurbo(this, 411, 211, textureX, textureY); // Box 0
		bodyModel[550] = new ModelRendererTurbo(this, 411, 199, textureX, textureY); // Box 0
		bodyModel[551] = new ModelRendererTurbo(this, 411, 217, textureX, textureY); // Box 0
		bodyModel[552] = new ModelRendererTurbo(this, 427, 226, textureX, textureY); // Box 0
		bodyModel[553] = new ModelRendererTurbo(this, 422, 226, textureX, textureY); // Box 0
		bodyModel[554] = new ModelRendererTurbo(this, 423, 243, textureX, textureY); // Box 0
		bodyModel[555] = new ModelRendererTurbo(this, 423, 247, textureX, textureY); // Box 0
		bodyModel[556] = new ModelRendererTurbo(this, 49, 223, textureX, textureY); // Box 293
		bodyModel[557] = new ModelRendererTurbo(this, 49, 206, textureX, textureY); // Box 294
		bodyModel[558] = new ModelRendererTurbo(this, 73, 188, textureX, textureY); // Box 295
		bodyModel[559] = new ModelRendererTurbo(this, 82, 212, textureX, textureY); // Box 296
		bodyModel[560] = new ModelRendererTurbo(this, 73, 205, textureX, textureY); // Box 297
		bodyModel[561] = new ModelRendererTurbo(this, 73, 211, textureX, textureY); // Box 298
		bodyModel[562] = new ModelRendererTurbo(this, 89, 211, textureX, textureY); // Box 299
		bodyModel[563] = new ModelRendererTurbo(this, 73, 198, textureX, textureY); // Box 300
		bodyModel[564] = new ModelRendererTurbo(this, 82, 200, textureX, textureY); // Box 301
		bodyModel[565] = new ModelRendererTurbo(this, 93, 192, textureX, textureY); // Box 302
		bodyModel[566] = new ModelRendererTurbo(this, 95, 198, textureX, textureY); // Box 303
		bodyModel[567] = new ModelRendererTurbo(this, 84, 192, textureX, textureY); // Box 304
		bodyModel[568] = new ModelRendererTurbo(this, 49, 240, textureX, textureY); // Box 305
		bodyModel[569] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 835
		bodyModel[570] = new ModelRendererTurbo(this, 43, 245, textureX, textureY); // Box 0
		bodyModel[571] = new ModelRendererTurbo(this, 73, 245, textureX, textureY); // Box 0
		bodyModel[572] = new ModelRendererTurbo(this, 85, 242, textureX, textureY); // Box 0
		bodyModel[573] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // Box 0
		bodyModel[574] = new ModelRendererTurbo(this, 79, 240, textureX, textureY); // Box 0
		bodyModel[575] = new ModelRendererTurbo(this, 91, 237, textureX, textureY); // Box 0
		bodyModel[576] = new ModelRendererTurbo(this, 84, 236, textureX, textureY); // Box 757
		bodyModel[577] = new ModelRendererTurbo(this, 84, 224, textureX, textureY); // Box 0
		bodyModel[578] = new ModelRendererTurbo(this, 84, 218, textureX, textureY); // Box 0
		bodyModel[579] = new ModelRendererTurbo(this, 84, 230, textureX, textureY); // Box 0
		bodyModel[580] = new ModelRendererTurbo(this, 74, 241, textureX, textureY); // Box 0
		bodyModel[581] = new ModelRendererTurbo(this, 80, 248, textureX, textureY); // Box 0
		bodyModel[582] = new ModelRendererTurbo(this, 93, 224, textureX, textureY); // Box 0
		bodyModel[583] = new ModelRendererTurbo(this, 388, 208, textureX, textureY); // Box 0
		bodyModel[584] = new ModelRendererTurbo(this, 138, 226, textureX, textureY); // Box 0
		bodyModel[585] = new ModelRendererTurbo(this, 417, 171, textureX, textureY); // Box 169
		bodyModel[586] = new ModelRendererTurbo(this, 417, 170, textureX, textureY); // Box 394
		bodyModel[587] = new ModelRendererTurbo(this, 417, 175, textureX, textureY); // Box 717
		bodyModel[588] = new ModelRendererTurbo(this, 423, 179, textureX, textureY); // Box 169
		bodyModel[589] = new ModelRendererTurbo(this, 52, 242, textureX, textureY); // Box 719
		bodyModel[590] = new ModelRendererTurbo(this, 16, 235, textureX, textureY); // Box 169
		bodyModel[591] = new ModelRendererTurbo(this, 34, 245, textureX, textureY); // Box 394
		bodyModel[592] = new ModelRendererTurbo(this, 34, 238, textureX, textureY); // Box 717
		bodyModel[593] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 394
		bodyModel[594] = new ModelRendererTurbo(this, 69, 17, textureX, textureY); // Box 394
		bodyModel[595] = new ModelRendererTurbo(this, 21, 242, textureX, textureY); // Box 0
		bodyModel[596] = new ModelRendererTurbo(this, 15, 235, textureX, textureY); // Box 0
		bodyModel[597] = new ModelRendererTurbo(this, 35, 235, textureX, textureY); // Box 0
		bodyModel[598] = new ModelRendererTurbo(this, 26, 244, textureX, textureY); // Box 0
		bodyModel[599] = new ModelRendererTurbo(this, 26, 241, textureX, textureY); // Box 0
		bodyModel[600] = new ModelRendererTurbo(this, 3, 253, textureX, textureY); // Box 0
		bodyModel[601] = new ModelRendererTurbo(this, 11, 238, textureX, textureY); // Box 0
		bodyModel[602] = new ModelRendererTurbo(this, 16, 244, textureX, textureY); // Box 0
		bodyModel[603] = new ModelRendererTurbo(this, 16, 247, textureX, textureY); // Box 0
		bodyModel[604] = new ModelRendererTurbo(this, 478, 217, textureX, textureY); // Box 0
		bodyModel[605] = new ModelRendererTurbo(this, 495, 217, textureX, textureY); // Box 0
		bodyModel[606] = new ModelRendererTurbo(this, 483, 214, textureX, textureY); // Box 0
		bodyModel[607] = new ModelRendererTurbo(this, 487, 211, textureX, textureY); // Box 0
		bodyModel[608] = new ModelRendererTurbo(this, 452, 225, textureX, textureY); // Box 0
		bodyModel[609] = new ModelRendererTurbo(this, 503, 210, textureX, textureY); // Box 0
		bodyModel[610] = new ModelRendererTurbo(this, 492, 211, textureX, textureY); // Box 0
		bodyModel[611] = new ModelRendererTurbo(this, 503, 223, textureX, textureY); // Box 0
		bodyModel[612] = new ModelRendererTurbo(this, 503, 226, textureX, textureY); // Box 0
		bodyModel[613] = new ModelRendererTurbo(this, 90, 171, textureX, textureY); // Box 394
		bodyModel[614] = new ModelRendererTurbo(this, 443, 225, textureX, textureY); // Box 394
		bodyModel[615] = new ModelRendererTurbo(this, 338, 3, textureX, textureY,"gauges_front"); // Box 389
		bodyModel[616] = new ModelRendererTurbo(this, 456, 69, textureX, textureY); // Box 758
		bodyModel[617] = new ModelRendererTurbo(this, 461, 65, textureX, textureY); // Box 759
		bodyModel[618] = new ModelRendererTurbo(this, 456, 61, textureX, textureY); // Box 760
		bodyModel[619] = new ModelRendererTurbo(this, 461, 70, textureX, textureY); // Box 761
		bodyModel[620] = new ModelRendererTurbo(this, 456, 65, textureX, textureY); // Box 762
		bodyModel[621] = new ModelRendererTurbo(this, 440, 64, textureX, textureY); // Box 763
		bodyModel[622] = new ModelRendererTurbo(this, 439, 57, textureX, textureY); // Box 764
		bodyModel[623] = new ModelRendererTurbo(this, 445, 55, textureX, textureY,"speedo_back"); // Box 765
		bodyModel[624] = new ModelRendererTurbo(this, 443, 69, textureX, textureY); // Box 766
		bodyModel[625] = new ModelRendererTurbo(this, 449, 69, textureX, textureY); // Box 767
		bodyModel[626] = new ModelRendererTurbo(this, 449, 62, textureX, textureY,"gauges_back"); // Box 768
		bodyModel[627] = new ModelRendererTurbo(this, 324, 8, textureX, textureY); // Box 31
		bodyModel[628] = new ModelRendererTurbo(this, 453, 57, textureX, textureY); // Box 31
		bodyModel[629] = new ModelRendererTurbo(this, 162, 21, textureX, textureY); // Box 0
		bodyModel[630] = new ModelRendererTurbo(this, 118, 21, textureX, textureY); // Box 0
		bodyModel[631] = new ModelRendererTurbo(this, 162, 5, textureX, textureY); // Box 0
		bodyModel[632] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Box 0
		bodyModel[633] = new ModelRendererTurbo(this, 193, 12, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[634] = new ModelRendererTurbo(this, 65, 12, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[635] = new ModelRendererTurbo(this, 42, 102, textureX, textureY); // Box 439 bug deflector
		bodyModel[636] = new ModelRendererTurbo(this, 456, 102, textureX, textureY); // Box 439 bug deflector
		bodyModel[637] = new ModelRendererTurbo(this, 448, 171, textureX, textureY); // Box 574
		bodyModel[638] = new ModelRendererTurbo(this, 39, 170, textureX, textureY); // Box 574
		bodyModel[639] = new ModelRendererTurbo(this, 297, 22, textureX, textureY); // Box 778
		bodyModel[640] = new ModelRendererTurbo(this, 297, 19, textureX, textureY); // Box 88
		bodyModel[641] = new ModelRendererTurbo(this, 10, 19, textureX, textureY); // Box 780
		bodyModel[642] = new ModelRendererTurbo(this, 15, 19, textureX, textureY); // Box 781
		bodyModel[643] = new ModelRendererTurbo(this, 92, 128, textureX, textureY); // Box 103
		bodyModel[644] = new ModelRendererTurbo(this, 91, 124, textureX, textureY); // Box 103
		bodyModel[645] = new ModelRendererTurbo(this, 98, 124, textureX, textureY); // Box 103
		bodyModel[646] = new ModelRendererTurbo(this, 99, 128, textureX, textureY); // Box 103
		bodyModel[647] = new ModelRendererTurbo(this, 92, 132, textureX, textureY); // Box 103
		bodyModel[648] = new ModelRendererTurbo(this, 99, 132, textureX, textureY); // Box 103
		bodyModel[649] = new ModelRendererTurbo(this, 91, 136, textureX, textureY); // Box 103
		bodyModel[650] = new ModelRendererTurbo(this, 98, 136, textureX, textureY); // Box 103
		bodyModel[651] = new ModelRendererTurbo(this, 109, 109, textureX, textureY,"headlight2beamBA1"); // Box 186 headlight front 2beam bottom A
		bodyModel[652] = new ModelRendererTurbo(this, 102, 109, textureX, textureY,"headlight2beamBA2"); // Box 187 headlight front 2beam bottom A
		bodyModel[653] = new ModelRendererTurbo(this, 93, 107, textureX, textureY,"big_headlight_bottom"); // Box 169 headlight front big bottom
		bodyModel[654] = new ModelRendererTurbo(this, 85, 103, textureX, textureY,"headlight2beamBB1"); // Box 186 headlight front 2beam bottom B
		bodyModel[655] = new ModelRendererTurbo(this, 86, 108, textureX, textureY,"headlight2beamBB2"); // Box 187 headlight front 2beam bottom B
		bodyModel[656] = new ModelRendererTurbo(this, 88, 157, textureX, textureY); // Box 430
		bodyModel[657] = new ModelRendererTurbo(this, 93, 157, textureX, textureY); // Box 431
		bodyModel[658] = new ModelRendererTurbo(this, 88, 153, textureX, textureY); // Box 430
		bodyModel[659] = new ModelRendererTurbo(this, 103, 153, textureX, textureY); // Box 433
		bodyModel[660] = new ModelRendererTurbo(this, 90, 141, textureX, textureY); // Box 403
		bodyModel[661] = new ModelRendererTurbo(this, 93, 141, textureX, textureY); // Box 403
		bodyModel[662] = new ModelRendererTurbo(this, 90, 144, textureX, textureY); // Box 406
		bodyModel[663] = new ModelRendererTurbo(this, 93, 144, textureX, textureY); // Box 406
		bodyModel[664] = new ModelRendererTurbo(this, 103, 141, textureX, textureY); // Box 489
		bodyModel[665] = new ModelRendererTurbo(this, 98, 141, textureX, textureY); // Box 490
		bodyModel[666] = new ModelRendererTurbo(this, 103, 144, textureX, textureY); // Box 491
		bodyModel[667] = new ModelRendererTurbo(this, 98, 144, textureX, textureY); // Box 492
		bodyModel[668] = new ModelRendererTurbo(this, 92, 102, textureX, textureY,"small_headlight_bottom"); // Box 186 headlight front small bottom
		bodyModel[669] = new ModelRendererTurbo(this, 93, 151, textureX, textureY); // Box 430
		bodyModel[670] = new ModelRendererTurbo(this, 88, 148, textureX, textureY); // Box 430
		bodyModel[671] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 431
		bodyModel[672] = new ModelRendererTurbo(this, 98, 151, textureX, textureY); // Box 528
		bodyModel[673] = new ModelRendererTurbo(this, 103, 148, textureX, textureY); // Box 529
		bodyModel[674] = new ModelRendererTurbo(this, 98, 148, textureX, textureY); // Box 530
		bodyModel[675] = new ModelRendererTurbo(this, 103, 157, textureX, textureY); // Box 531
		bodyModel[676] = new ModelRendererTurbo(this, 98, 157, textureX, textureY); // Box 532
		bodyModel[677] = new ModelRendererTurbo(this, 91, 114, textureX, textureY); // Box 403
		bodyModel[678] = new ModelRendererTurbo(this, 98, 114, textureX, textureY); // Box 404
		bodyModel[679] = new ModelRendererTurbo(this, 98, 119, textureX, textureY); // Box 405
		bodyModel[680] = new ModelRendererTurbo(this, 91, 119, textureX, textureY); // Box 406
		bodyModel[681] = new ModelRendererTurbo(this, 92, 162, textureX, textureY); // Box 0
		bodyModel[682] = new ModelRendererTurbo(this, 410, 128, textureX, textureY); // Box 103
		bodyModel[683] = new ModelRendererTurbo(this, 409, 124, textureX, textureY); // Box 103
		bodyModel[684] = new ModelRendererTurbo(this, 402, 124, textureX, textureY); // Box 103
		bodyModel[685] = new ModelRendererTurbo(this, 403, 128, textureX, textureY); // Box 103
		bodyModel[686] = new ModelRendererTurbo(this, 410, 132, textureX, textureY); // Box 103
		bodyModel[687] = new ModelRendererTurbo(this, 403, 132, textureX, textureY); // Box 103
		bodyModel[688] = new ModelRendererTurbo(this, 409, 136, textureX, textureY); // Box 103
		bodyModel[689] = new ModelRendererTurbo(this, 402, 136, textureX, textureY); // Box 103
		bodyModel[690] = new ModelRendererTurbo(this, 419, 77, textureX, textureY,"backlight2beamBA1"); // Box 186 headlight back 2beam bottom A
		bodyModel[691] = new ModelRendererTurbo(this, 419, 82, textureX, textureY,"backlight2beamBA2"); // Box 187 headlight back 2beam bottom A
		bodyModel[692] = new ModelRendererTurbo(this, 410, 81, textureX, textureY,"big_backlight_bottom"); // Box 169 headlight back big bottom
		bodyModel[693] = new ModelRendererTurbo(this, 403, 82, textureX, textureY,"backlight2beamBB1"); // Box 186 headlight back 2beam bottom B
		bodyModel[694] = new ModelRendererTurbo(this, 403, 77, textureX, textureY,"backlight2beamBB2"); // Box 187 headlight back 2beam bottom B
		bodyModel[695] = new ModelRendererTurbo(this, 414, 157, textureX, textureY); // Box 430
		bodyModel[696] = new ModelRendererTurbo(this, 409, 157, textureX, textureY); // Box 431
		bodyModel[697] = new ModelRendererTurbo(this, 414, 153, textureX, textureY); // Box 430
		bodyModel[698] = new ModelRendererTurbo(this, 399, 153, textureX, textureY); // Box 433
		bodyModel[699] = new ModelRendererTurbo(this, 413, 139, textureX, textureY); // Box 403
		bodyModel[700] = new ModelRendererTurbo(this, 408, 139, textureX, textureY); // Box 403
		bodyModel[701] = new ModelRendererTurbo(this, 413, 142, textureX, textureY); // Box 406
		bodyModel[702] = new ModelRendererTurbo(this, 408, 142, textureX, textureY); // Box 406
		bodyModel[703] = new ModelRendererTurbo(this, 400, 139, textureX, textureY); // Box 489
		bodyModel[704] = new ModelRendererTurbo(this, 403, 139, textureX, textureY); // Box 490
		bodyModel[705] = new ModelRendererTurbo(this, 400, 142, textureX, textureY); // Box 491
		bodyModel[706] = new ModelRendererTurbo(this, 403, 142, textureX, textureY); // Box 492
		bodyModel[707] = new ModelRendererTurbo(this, 411, 76, textureX, textureY,"small_backlight_bottom"); // Box 186 headligh tback small bottom
		bodyModel[708] = new ModelRendererTurbo(this, 414, 149, textureX, textureY); // Box 430
		bodyModel[709] = new ModelRendererTurbo(this, 414, 146, textureX, textureY); // Box 430
		bodyModel[710] = new ModelRendererTurbo(this, 409, 146, textureX, textureY); // Box 431
		bodyModel[711] = new ModelRendererTurbo(this, 399, 149, textureX, textureY); // Box 528
		bodyModel[712] = new ModelRendererTurbo(this, 399, 146, textureX, textureY); // Box 529
		bodyModel[713] = new ModelRendererTurbo(this, 404, 146, textureX, textureY); // Box 530
		bodyModel[714] = new ModelRendererTurbo(this, 399, 157, textureX, textureY); // Box 531
		bodyModel[715] = new ModelRendererTurbo(this, 404, 157, textureX, textureY); // Box 532
		bodyModel[716] = new ModelRendererTurbo(this, 421, 125, textureX, textureY); // Box 403
		bodyModel[717] = new ModelRendererTurbo(this, 416, 117, textureX, textureY); // Box 404
		bodyModel[718] = new ModelRendererTurbo(this, 415, 128, textureX, textureY); // Box 405
		bodyModel[719] = new ModelRendererTurbo(this, 420, 131, textureX, textureY); // Box 406
		bodyModel[720] = new ModelRendererTurbo(this, 402, 160, textureX, textureY); // Box 0
		bodyModel[721] = new ModelRendererTurbo(this, 153, 20, textureX, textureY); // Box 0
		bodyModel[722] = new ModelRendererTurbo(this, 472, 126, textureX, textureY); // Box 525
		bodyModel[723] = new ModelRendererTurbo(this, 483, 125, textureX, textureY,"numberboard_back_R_type_2"); // Numberboard R type 2 BACK
		bodyModel[724] = new ModelRendererTurbo(this, 438, 126, textureX, textureY); // Box 524
		bodyModel[725] = new ModelRendererTurbo(this, 425, 125, textureX, textureY,"numberboard_back_L_type_2"); // Numberboard L Type 2 BACK
		bodyModel[726] = new ModelRendererTurbo(this, 5, 10, textureX, textureY); // Box 88
		bodyModel[727] = new ModelRendererTurbo(this, 36, 9, textureX, textureY); // Box 80
		bodyModel[728] = new ModelRendererTurbo(this, 28, 10, textureX, textureY); // Box 80
		bodyModel[729] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 88
		bodyModel[730] = new ModelRendererTurbo(this, 3, 1, textureX, textureY); // Box 88
		bodyModel[731] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 88
		bodyModel[732] = new ModelRendererTurbo(this, 19, 13, textureX, textureY); // Box 409 commander base
		bodyModel[733] = new ModelRendererTurbo(this, 24, 13, textureX, textureY, "commander_f"); // Box 410 commander beacon FRONT
		bodyModel[734] = new ModelRendererTurbo(this, 10, 4, textureX, textureY); // Box 88
		bodyModel[735] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 88
		bodyModel[736] = new ModelRendererTurbo(this, 19, 9, textureX, textureY); // Box 364 prime base
		bodyModel[737] = new ModelRendererTurbo(this, 19, 1, textureX, textureY, "prime1_f"); // Box 6 PRIME1-1 FRONT
		bodyModel[738] = new ModelRendererTurbo(this, 28, 5, textureX, textureY, "prime3_f"); // Box 7 PRIME1-3 FRONT
		bodyModel[739] = new ModelRendererTurbo(this, 28, 1, textureX, textureY, "prime2_f"); // Box 8 PRIME1-2 FRONT
		bodyModel[740] = new ModelRendererTurbo(this, 19, 5, textureX, textureY, "prime4_f"); // Box 9 PRIME1-4 FRONT
		bodyModel[741] = new ModelRendererTurbo(this, 2, 22, textureX, textureY); // Box 88
		bodyModel[742] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 88
		bodyModel[743] = new ModelRendererTurbo(this, 3, 13, textureX, textureY); // Box 88
		bodyModel[744] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Box 88
		bodyModel[745] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 409 commander base
		bodyModel[746] = new ModelRendererTurbo(this, 289, 13, textureX, textureY, "commander_back"); // Box 410 commander beacon BACK
		bodyModel[747] = new ModelRendererTurbo(this, 287, 9, textureX, textureY); // Box 364 prime base
		bodyModel[748] = new ModelRendererTurbo(this, 287, 1, textureX, textureY, "prime1_back"); // Box 6 PRIME1-1 BACK
		bodyModel[749] = new ModelRendererTurbo(this, 278, 5, textureX, textureY, "prime3_back"); // Box 7 PRIME1-3 BACK
		bodyModel[750] = new ModelRendererTurbo(this, 278, 1, textureX, textureY, "prime2_back"); // Box 8 PRIME1-2 BACK
		bodyModel[751] = new ModelRendererTurbo(this, 287, 5, textureX, textureY, "prime4_back"); // Box 9 PRIME1-4 BACK
		bodyModel[752] = new ModelRendererTurbo(this, 67, 144, textureX, textureY,"numberboard_L_type_1"); // Numberboard L FRONT
		bodyModel[753] = new ModelRendererTurbo(this, 19, 144, textureX, textureY,"numberboard_R_type_1"); // Numberboard R FRONT
		bodyModel[754] = new ModelRendererTurbo(this, 434, 144, textureX, textureY,"numberboard_back_L_type_1"); // Numberboard L BACK
		bodyModel[755] = new ModelRendererTurbo(this, 482, 144, textureX, textureY,"numberboard_back_R_type_1"); // Numberboard R BACK
		bodyModel[756] = new ModelRendererTurbo(this, 24, 143, textureX, textureY,"markerlight_353_1"); // Box 353 markerlight FRONT
		bodyModel[757] = new ModelRendererTurbo(this, 62, 143, textureX, textureY,"markerlight_545_1"); // Box 545 markerlight FRONT
		bodyModel[758] = new ModelRendererTurbo(this, 475, 144, textureX, textureY,"markerlight_back_353_1"); // Box 353 markerlight BACK
		bodyModel[759] = new ModelRendererTurbo(this, 439, 143, textureX, textureY,"markerlight_back_545_1"); // Box 545 markerlight BACK
		bodyModel[760] = new ModelRendererTurbo(this, 276, 9, textureX, textureY); // Box 899
		bodyModel[761] = new ModelRendererTurbo(this, 280, 10, textureX, textureY); // Box 900
		bodyModel[762] = new ModelRendererTurbo(this, 305, 10, textureX, textureY); // Box 903
		bodyModel[763] = new ModelRendererTurbo(this, 305, 4, textureX, textureY); // Box 904
		bodyModel[764] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 905
		bodyModel[765] = new ModelRendererTurbo(this, 305, 7, textureX, textureY); // Box 906
		bodyModel[766] = new ModelRendererTurbo(this, 300, 4, textureX, textureY); // Box 907
		bodyModel[767] = new ModelRendererTurbo(this, 296, 1, textureX, textureY); // Box 908
		bodyModel[768] = new ModelRendererTurbo(this, 305, 22, textureX, textureY); // Box 909
		bodyModel[769] = new ModelRendererTurbo(this, 305, 16, textureX, textureY); // Box 910
		bodyModel[770] = new ModelRendererTurbo(this, 305, 13, textureX, textureY); // Box 911
		bodyModel[771] = new ModelRendererTurbo(this, 305, 19, textureX, textureY); // Box 912
		bodyModel[772] = new ModelRendererTurbo(this, 457, 170, textureX, textureY); // Box 497 EARR MU
		bodyModel[773] = new ModelRendererTurbo(this, 48, 170, textureX, textureY); // Box 912
		bodyModel[774] = new ModelRendererTurbo(this, 54, 170, textureX, textureY,"cull"); // Box 448 cull
		bodyModel[775] = new ModelRendererTurbo(this, 24, 170, textureX, textureY,"cull"); // Box 449 cull
		bodyModel[776] = new ModelRendererTurbo(this, 438, 170, textureX, textureY,"cull"); // Box 448 cull
		bodyModel[777] = new ModelRendererTurbo(this, 459, 170, textureX, textureY,"cull"); // Box 449 cull
		bodyModel[778] = new ModelRendererTurbo(this, 60, 14, textureX, textureY); // Box 560
		bodyModel[779] = new ModelRendererTurbo(this, 29, 9, textureX, textureY); // Box 560
		bodyModel[780] = new ModelRendererTurbo(this, 32, 12, textureX, textureY); // Box 560
		bodyModel[781] = new ModelRendererTurbo(this, 60, 6, textureX, textureY); // Box 920
		bodyModel[782] = new ModelRendererTurbo(this, 70, 14, textureX, textureY); // Box 921
		bodyModel[783] = new ModelRendererTurbo(this, 258, 13, textureX, textureY); // Box 560
		bodyModel[784] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 560
		bodyModel[785] = new ModelRendererTurbo(this, 286, 14, textureX, textureY); // Box 560
		bodyModel[786] = new ModelRendererTurbo(this, 245, 9, textureX, textureY); // Box 920
		bodyModel[787] = new ModelRendererTurbo(this, 242, 14, textureX, textureY); // Box 921
		bodyModel[788] = new ModelRendererTurbo(this, 268, 13, textureX, textureY); // Box 927
		bodyModel[789] = new ModelRendererTurbo(this, 38, 22, textureX, textureY); // Box 927
		bodyModel[790] = new ModelRendererTurbo(this, 383, 180, textureX, textureY); // Box 929
		bodyModel[791] = new ModelRendererTurbo(this, 383, 177, textureX, textureY); // Box 930
		bodyModel[792] = new ModelRendererTurbo(this, 383, 183, textureX, textureY); // Box 931
		bodyModel[793] = new ModelRendererTurbo(this, 13, 170, textureX, textureY); // Box 447
		bodyModel[794] = new ModelRendererTurbo(this, 2, 170, textureX, textureY); // Box 934
		bodyModel[795] = new ModelRendererTurbo(this, 422, 157, textureX, textureY); // Box 447
		bodyModel[796] = new ModelRendererTurbo(this, 489, 170, textureX, textureY); // Box 934
		bodyModel[797] = new ModelRendererTurbo(this, 241, 62, textureX, textureY); // Box 0
		bodyModel[798] = new ModelRendererTurbo(this, 232, 62, textureX, textureY); // Box 938
		bodyModel[799] = new ModelRendererTurbo(this, 41, 44, textureX, textureY); // Box 0
		bodyModel[800] = new ModelRendererTurbo(this, 43, 50, textureX, textureY); // Box 0
		bodyModel[801] = new ModelRendererTurbo(this, 43, 54, textureX, textureY); // Box 0
		bodyModel[802] = new ModelRendererTurbo(this, 40, 58, textureX, textureY); // Box 0
		bodyModel[803] = new ModelRendererTurbo(this, 40, 66, textureX, textureY); // Box 0
		bodyModel[804] = new ModelRendererTurbo(this, 25, 67, textureX, textureY); // Box 579
		bodyModel[805] = new ModelRendererTurbo(this, 25, 64, textureX, textureY); // Box 579
		bodyModel[806] = new ModelRendererTurbo(this, 8, 66, textureX, textureY); // Box 579
		bodyModel[807] = new ModelRendererTurbo(this, 41, 38, textureX, textureY); // Box 934
		bodyModel[808] = new ModelRendererTurbo(this, 43, 34, textureX, textureY); // Box 935
		bodyModel[809] = new ModelRendererTurbo(this, 43, 30, textureX, textureY); // Box 936
		bodyModel[810] = new ModelRendererTurbo(this, 40, 14, textureX, textureY); // Box 937
		bodyModel[811] = new ModelRendererTurbo(this, 40, 22, textureX, textureY); // Box 938
		bodyModel[812] = new ModelRendererTurbo(this, 44, 8, textureX, textureY); // Box 939
		bodyModel[813] = new ModelRendererTurbo(this, 44, 11, textureX, textureY); // Box 940
		bodyModel[814] = new ModelRendererTurbo(this, 43, 4, textureX, textureY); // Box 941
		bodyModel[815] = new ModelRendererTurbo(this, 159, 63, textureX, textureY); // Box 61
		bodyModel[816] = new ModelRendererTurbo(this, 169, 63, textureX, textureY); // Box 61
		bodyModel[817] = new ModelRendererTurbo(this, 164, 67, textureX, textureY); // Front side door R
		bodyModel[818] = new ModelRendererTurbo(this, 162, 70, textureX, textureY); // Front side door R
		bodyModel[819] = new ModelRendererTurbo(this, 171, 67, textureX, textureY); // Front side door R
		bodyModel[820] = new ModelRendererTurbo(this, 159, 67, textureX, textureY); // Front side door R
		bodyModel[821] = new ModelRendererTurbo(this, 159, 112, textureX, textureY); // Box 953
		bodyModel[822] = new ModelRendererTurbo(this, 169, 112, textureX, textureY); // Box 954
		bodyModel[823] = new ModelRendererTurbo(this, 162, 119, textureX, textureY); // Front side door L
		bodyModel[824] = new ModelRendererTurbo(this, 159, 116, textureX, textureY); // Front side door L
		bodyModel[825] = new ModelRendererTurbo(this, 171, 116, textureX, textureY); // Front side door L
		bodyModel[826] = new ModelRendererTurbo(this, 164, 116, textureX, textureY); // Front side door L
		bodyModel[827] = new ModelRendererTurbo(this, 136, 153, textureX, textureY); // Box 0
		bodyModel[828] = new ModelRendererTurbo(this, 108, 155, textureX, textureY); // Box 0
		bodyModel[829] = new ModelRendererTurbo(this, 67, 121, textureX, textureY); // Box 0
		bodyModel[830] = new ModelRendererTurbo(this, 63, 142, textureX, textureY); // Box 0
		bodyModel[831] = new ModelRendererTurbo(this, 64, 135, textureX, textureY); // Box 152
		bodyModel[832] = new ModelRendererTurbo(this, 75, 134, textureX, textureY); // Box 153
		bodyModel[833] = new ModelRendererTurbo(this, 117, 135, textureX, textureY); // Box 0
		bodyModel[834] = new ModelRendererTurbo(this, 117, 141, textureX, textureY); // Box 0
		bodyModel[835] = new ModelRendererTurbo(this, 51, 180, textureX, textureY); // Box 335
		bodyModel[836] = new ModelRendererTurbo(this, 3, 179, textureX, textureY); // Box 336
		bodyModel[837] = new ModelRendererTurbo(this, 22, 235, textureX, textureY); // Box 0
		bodyModel[838] = new ModelRendererTurbo(this, 1, 155, textureX, textureY); // Box 481
		bodyModel[839] = new ModelRendererTurbo(this, 1, 124, textureX, textureY); // Box 482
		bodyModel[840] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 483
		bodyModel[841] = new ModelRendererTurbo(this, 50, 223, textureX, textureY); // Box 580
		bodyModel[842] = new ModelRendererTurbo(this, 72, 230, textureX, textureY); // Box 581
		bodyModel[843] = new ModelRendererTurbo(this, 72, 223, textureX, textureY); // Box 582
		bodyModel[844] = new ModelRendererTurbo(this, 323, 48, textureX, textureY); // Box 638
		bodyModel[845] = new ModelRendererTurbo(this, 305, 63, textureX, textureY); // Box 61
		bodyModel[846] = new ModelRendererTurbo(this, 315, 63, textureX, textureY); // Box 61
		bodyModel[847] = new ModelRendererTurbo(this, 305, 112, textureX, textureY); // Box 963
		bodyModel[848] = new ModelRendererTurbo(this, 315, 112, textureX, textureY); // Box 964
		bodyModel[849] = new ModelRendererTurbo(this, 308, 70, textureX, textureY); // Rear side door R
		bodyModel[850] = new ModelRendererTurbo(this, 308, 119, textureX, textureY); // Rear side door L
		bodyModel[851] = new ModelRendererTurbo(this, 498, 126, textureX, textureY); // Box 481
		bodyModel[852] = new ModelRendererTurbo(this, 501, 114, textureX, textureY); // Box 482
		bodyModel[853] = new ModelRendererTurbo(this, 501, 119, textureX, textureY); // Box 483
		bodyModel[854] = new ModelRendererTurbo(this, 500, 134, textureX, textureY); // Box 580
		bodyModel[855] = new ModelRendererTurbo(this, 499, 149, textureX, textureY); // Box 581
		bodyModel[856] = new ModelRendererTurbo(this, 499, 142, textureX, textureY); // Box 582
		bodyModel[857] = new ModelRendererTurbo(this, 381, 43, textureX, textureY); // Box 934
		bodyModel[858] = new ModelRendererTurbo(this, 383, 55, textureX, textureY); // Box 935
		bodyModel[859] = new ModelRendererTurbo(this, 383, 59, textureX, textureY); // Box 936
		bodyModel[860] = new ModelRendererTurbo(this, 380, 71, textureX, textureY); // Box 937
		bodyModel[861] = new ModelRendererTurbo(this, 380, 63, textureX, textureY); // Box 938
		bodyModel[862] = new ModelRendererTurbo(this, 384, 82, textureX, textureY); // Box 939
		bodyModel[863] = new ModelRendererTurbo(this, 384, 79, textureX, textureY); // Box 940
		bodyModel[864] = new ModelRendererTurbo(this, 383, 85, textureX, textureY); // Box 941
		bodyModel[865] = new ModelRendererTurbo(this, 381, 49, textureX, textureY); // Box 982
		bodyModel[866] = new ModelRendererTurbo(this, 383, 39, textureX, textureY); // Box 983
		bodyModel[867] = new ModelRendererTurbo(this, 383, 35, textureX, textureY); // Box 984
		bodyModel[868] = new ModelRendererTurbo(this, 378, 19, textureX, textureY); // Box 985
		bodyModel[869] = new ModelRendererTurbo(this, 380, 27, textureX, textureY); // Box 986
		bodyModel[870] = new ModelRendererTurbo(this, 384, 13, textureX, textureY); // Box 987
		bodyModel[871] = new ModelRendererTurbo(this, 384, 16, textureX, textureY); // Box 988
		bodyModel[872] = new ModelRendererTurbo(this, 383, 9, textureX, textureY); // Box 989
		bodyModel[873] = new ModelRendererTurbo(this, 346, 37, textureX, textureY); // Box 0
		bodyModel[874] = new ModelRendererTurbo(this, 345, 95, textureX, textureY); // Box 0
		bodyModel[875] = new ModelRendererTurbo(this, 330, 98, textureX, textureY); // Box 0
		bodyModel[876] = new ModelRendererTurbo(this, 330, 92, textureX, textureY); // Box 0
		bodyModel[877] = new ModelRendererTurbo(this, 349, 70, textureX, textureY); // Box 0
		bodyModel[878] = new ModelRendererTurbo(this, 86, 121, textureX, textureY); // Box 0
		bodyModel[879] = new ModelRendererTurbo(this, 358, 100, textureX, textureY); // Box 152
		bodyModel[880] = new ModelRendererTurbo(this, 358, 94, textureX, textureY); // Box 153
		bodyModel[881] = new ModelRendererTurbo(this, 344, 100, textureX, textureY); // Box 0
		bodyModel[882] = new ModelRendererTurbo(this, 344, 94, textureX, textureY); // Box 0
		bodyModel[883] = new ModelRendererTurbo(this, 373, 82, textureX, textureY); // Box 335
		bodyModel[884] = new ModelRendererTurbo(this, 373, 62, textureX, textureY); // Box 336
		bodyModel[885] = new ModelRendererTurbo(this, 310, 67, textureX, textureY); // Rear side door R
		bodyModel[886] = new ModelRendererTurbo(this, 305, 67, textureX, textureY); // Rear side door R
		bodyModel[887] = new ModelRendererTurbo(this, 317, 67, textureX, textureY); // Rear side door R
		bodyModel[888] = new ModelRendererTurbo(this, 310, 116, textureX, textureY); // Rear side door L
		bodyModel[889] = new ModelRendererTurbo(this, 305, 116, textureX, textureY); // Rear side door L
		bodyModel[890] = new ModelRendererTurbo(this, 317, 116, textureX, textureY); // Rear side door L
		bodyModel[891] = new ModelRendererTurbo(this, 356, 5, textureX, textureY); // Box 638
		bodyModel[892] = new ModelRendererTurbo(this, 347, 9, textureX, textureY); // Box 638
		bodyModel[893] = new ModelRendererTurbo(this, 441, 44, textureX, textureY); // Box 1010
		bodyModel[894] = new ModelRendererTurbo(this, 450, 42, textureX, textureY); // Box 1011
		bodyModel[895] = new ModelRendererTurbo(this, 370, 47, textureX, textureY); // Box 0
		bodyModel[896] = new ModelRendererTurbo(this, 370, 35, textureX, textureY); // Box 358
		bodyModel[897] = new ModelRendererTurbo(this, 494, 212, textureX, textureY); // Box 0
		bodyModel[898] = new ModelRendererTurbo(this, 386, 158, textureX, textureY); // Box 394
		bodyModel[899] = new ModelRendererTurbo(this, 388, 155, textureX, textureY); // Box 394
		bodyModel[900] = new ModelRendererTurbo(this, 367, 166, textureX, textureY); // Box 406
		bodyModel[901] = new ModelRendererTurbo(this, 358, 153, textureX, textureY); // Box 407
		bodyModel[902] = new ModelRendererTurbo(this, 359, 153, textureX, textureY); // Box 408
		bodyModel[903] = new ModelRendererTurbo(this, 367, 153, textureX, textureY); // Box 409
		bodyModel[904] = new ModelRendererTurbo(this, 371, 162, textureX, textureY); // Box 410
		bodyModel[905] = new ModelRendererTurbo(this, 359, 156, textureX, textureY); // Box 411
		bodyModel[906] = new ModelRendererTurbo(this, 67, 175, textureX, textureY); // Box 942
		bodyModel[907] = new ModelRendererTurbo(this, 58, 184, textureX, textureY); // Box 943
		bodyModel[908] = new ModelRendererTurbo(this, 76, 172, textureX, textureY); // Box 944
		bodyModel[909] = new ModelRendererTurbo(this, 67, 182, textureX, textureY); // Box 945
		bodyModel[910] = new ModelRendererTurbo(this, 74, 175, textureX, textureY); // Box 946
		bodyModel[911] = new ModelRendererTurbo(this, 71, 172, textureX, textureY); // Box 947
		bodyModel[912] = new ModelRendererTurbo(this, 78, 179, textureX, textureY); // Box 394
		bodyModel[913] = new ModelRendererTurbo(this, 62, 179, textureX, textureY); // Box 394
		bodyModel[914] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 0
		bodyModel[915] = new ModelRendererTurbo(this, 244, 85, textureX, textureY); // Box 378
		bodyModel[916] = new ModelRendererTurbo(this, 211, 136, textureX, textureY); // Box 378
		bodyModel[917] = new ModelRendererTurbo(this, 250, 20, textureX, textureY); // Box 378
		bodyModel[918] = new ModelRendererTurbo(this, 164, 136, textureX, textureY); // Box 378
		bodyModel[919] = new ModelRendererTurbo(this, 99, 100, textureX, textureY); // Box 378
		bodyModel[920] = new ModelRendererTurbo(this, 316, 135, textureX, textureY); // Box 957
		bodyModel[921] = new ModelRendererTurbo(this, 452, 228, textureX, textureY); // Box 958
		bodyModel[922] = new ModelRendererTurbo(this, 258, 136, textureX, textureY); // Box 959
		bodyModel[923] = new ModelRendererTurbo(this, 216, 247, textureX, textureY); // Box 960
		bodyModel[924] = new ModelRendererTurbo(this, 175, 94, textureX, textureY); // Box 378
		bodyModel[925] = new ModelRendererTurbo(this, 177, 13, textureX, textureY); // Box 378
		bodyModel[926] = new ModelRendererTurbo(this, 139, 142, textureX, textureY); // Box 0
		bodyModel[927] = new ModelRendererTurbo(this, 368, 120, textureX, textureY); // Box 0
		bodyModel[928] = new ModelRendererTurbo(this, 388, 128, textureX, textureY); // Box 0
		bodyModel[929] = new ModelRendererTurbo(this, 150, 99, textureX, textureY); // Box 378
		bodyModel[930] = new ModelRendererTurbo(this, 128, 13, textureX, textureY); // Box 0
		bodyModel[931] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 378
		bodyModel[932] = new ModelRendererTurbo(this, 132, 87, textureX, textureY); // Box 378
		bodyModel[933] = new ModelRendererTurbo(this, 113, 13, textureX, textureY); // Box 0
		bodyModel[934] = new ModelRendererTurbo(this, 373, 128, textureX, textureY); // Box 0
		bodyModel[935] = new ModelRendererTurbo(this, 256, 1, textureX, textureY); // Box 378
		bodyModel[936] = new ModelRendererTurbo(this, 330, 193, textureX, textureY); // Box 938
		bodyModel[937] = new ModelRendererTurbo(this, 154, 112, textureX, textureY); // Box 953
		bodyModel[938] = new ModelRendererTurbo(this, 176, 112, textureX, textureY); // Box 953
		bodyModel[939] = new ModelRendererTurbo(this, 300, 112, textureX, textureY); // Box 953
		bodyModel[940] = new ModelRendererTurbo(this, 322, 112, textureX, textureY); // Box 953
		bodyModel[941] = new ModelRendererTurbo(this, 154, 63, textureX, textureY); // Box 941
		bodyModel[942] = new ModelRendererTurbo(this, 176, 63, textureX, textureY); // Box 942
		bodyModel[943] = new ModelRendererTurbo(this, 300, 63, textureX, textureY); // Box 943
		bodyModel[944] = new ModelRendererTurbo(this, 322, 63, textureX, textureY); // Box 944
		bodyModel[945] = new ModelRendererTurbo(this, 455, 3, textureX, textureY); // Box 0
		bodyModel[946] = new ModelRendererTurbo(this, 125, 228, textureX, textureY); // Box 169
		bodyModel[947] = new ModelRendererTurbo(this, 125, 228, textureX, textureY); // Box 169
		bodyModel[948] = new ModelRendererTurbo(this, 308, 48, textureX, textureY); // Box 0
		bodyModel[949] = new ModelRendererTurbo(this, 376, 1, textureX, textureY); // Box 0

		bodyModel[500].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[500].setRotationPoint(-1F, -22F, -5F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 12, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[501].setRotationPoint(3.5F, -19F, -8.5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[502].setRotationPoint(3.5F, -19F, -10F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[503].setRotationPoint(3.5F, -19F, 8F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[504].setRotationPoint(3.5F, -21F, -2.5F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[505].setRotationPoint(3.5F, -21F, -8.5F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[506].setRotationPoint(3.5F, -21F, 2.5F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 12, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[507].setRotationPoint(3.5F, -17F, -10F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 12, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[508].setRotationPoint(3.5F, -15F, -10F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 169
		bodyModel[509].setRotationPoint(3.5F, -15F, -9.5F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 12, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[510].setRotationPoint(3.5F, -15F, 9F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[511].setRotationPoint(3.5F, -15F, 8.5F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[512].setRotationPoint(3.5F, -15F, -3.5F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[513].setRotationPoint(3.5F, -15F, -6.5F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 351
		bodyModel[514].setRotationPoint(3.5F, -15F, 3.5F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 12, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[515].setRotationPoint(-15.5F, -19F, -8.5F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[516].setRotationPoint(-15.5F, -19F, -10F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[517].setRotationPoint(-15.5F, -19F, 8F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[518].setRotationPoint(-15.5F, -21F, -2.5F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[519].setRotationPoint(-15.5F, -21F, -8.5F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[520].setRotationPoint(-15.5F, -21F, 2.5F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 12, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[521].setRotationPoint(-15.5F, -17F, -10F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 12, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[522].setRotationPoint(-15.5F, -15F, -10F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 169
		bodyModel[523].setRotationPoint(-15.5F, -15F, -9.5F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 12, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[524].setRotationPoint(-15.5F, -15F, 9F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[525].setRotationPoint(-15.5F, -15F, 8.5F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[526].setRotationPoint(-15.5F, -15F, -3.5F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[527].setRotationPoint(-15.5F, -15F, -6.5F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 351
		bodyModel[528].setRotationPoint(-15.5F, -15F, 3.5F);

		bodyModel[529].addBox(0F, 0F, 0F, 5, 4, 12, 0F); // Box 0
		bodyModel[529].setRotationPoint(10F, -5F, -6F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[530].setRotationPoint(10F, -9F, -6F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[531].setRotationPoint(15F, -3.7F, 0F);
		bodyModel[531].rotateAngleX = -0.78539816F;

		bodyModel[532].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 0
		bodyModel[532].setRotationPoint(10F, -11.21F, -4.79F);
		bodyModel[532].rotateAngleX = -0.78539816F;

		bodyModel[533].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.47F, 0F, 0F, -0.47F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.47F, 0F, 0F, -0.47F); // Box 0
		bodyModel[533].setRotationPoint(10F, -9.79F, -3.37F);
		bodyModel[533].rotateAngleX = -0.78539816F;

		bodyModel[534].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 0
		bodyModel[534].setRotationPoint(9F, -4F, -1F);

		bodyModel[535].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 0
		bodyModel[535].setRotationPoint(9F, -6F, 1F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 0
		bodyModel[536].setRotationPoint(9F, -4F, 1F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[537].setRotationPoint(9F, -4F, -4F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[538].setRotationPoint(9F, -9F, 1F);

		bodyModel[539].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 0
		bodyModel[539].setRotationPoint(9F, -9F, -4F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F); // Box 0
		bodyModel[540].setRotationPoint(9F, -11.21F, -4.79F);
		bodyModel[540].rotateAngleX = -0.78539816F;

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0.445F, -0.15F, 0F, 0.445F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[541].setRotationPoint(9F, -9F, -6F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.145F, 0.435F, 0F, -0.145F, 0.435F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[542].setRotationPoint(9F, -11F, -4F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[543].setRotationPoint(10F, -1F, -6F);

		bodyModel[544].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		bodyModel[544].setRotationPoint(6F, -1F, -2.5F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 0
		bodyModel[545].setRotationPoint(5.5F, -2.3F, -2.5F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[546].setRotationPoint(5.5F, -4.3F, -1.5F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[547].setRotationPoint(5.5F, -4.3F, -2.5F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 757
		bodyModel[548].setRotationPoint(5.5F, -4.3F, 1.5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[549].setRotationPoint(5.5F, -7.3F, -1F);

		bodyModel[550].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[550].setRotationPoint(6.5F, -3.3F, 2F);
		bodyModel[550].rotateAngleX = -1.10828408F;

		bodyModel[551].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[551].setRotationPoint(6.5F, -3.3F, -2F);
		bodyModel[551].rotateAngleX = 1.10828408F;

		bodyModel[552].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 0
		bodyModel[552].setRotationPoint(5.15F, -7.5F, -0.7F);
		bodyModel[552].rotateAngleY = 0.78539816F;

		bodyModel[553].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[553].setRotationPoint(6.9F, -3.5F, 4F);
		bodyModel[553].rotateAngleY = -0.78539816F;

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[554].setRotationPoint(7.6F, -3.5F, -4.7F);
		bodyModel[554].rotateAngleY = 0.78539816F;

		bodyModel[555].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[555].setRotationPoint(7.5F, -2.99F, 0F);
		bodyModel[555].rotateAngleX = -0.78539816F;

		bodyModel[556].addBox(0F, 0F, 0F, 5, 4, 12, 0F); // Box 293
		bodyModel[556].setRotationPoint(-15.5F, -5F, -6F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[557].setRotationPoint(-15.5F, -9F, -6F);

		bodyModel[558].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 295
		bodyModel[558].setRotationPoint(-14.5F, -9.8F, 3.37F);
		bodyModel[558].rotateAngleX = 0.78539816F;

		bodyModel[559].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 296
		bodyModel[559].setRotationPoint(-10.5F, -4F, -1F);

		bodyModel[560].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 297
		bodyModel[560].setRotationPoint(-10.5F, -6F, -4F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[561].setRotationPoint(-10.5F, -4F, -4F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 299
		bodyModel[562].setRotationPoint(-10.5F, -4F, 1F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[563].setRotationPoint(-10.5F, -9F, -4F);

		bodyModel[564].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 301
		bodyModel[564].setRotationPoint(-10.5F, -9F, -1F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0.12F, 0F, -1F, 0.12F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 302
		bodyModel[565].setRotationPoint(-10.5F, -9.8F, 3.37F);
		bodyModel[565].rotateAngleX = 0.78539816F;

		bodyModel[566].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.445F, -0.15F, 0F, 0.445F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 303
		bodyModel[566].setRotationPoint(-10.5F, -9F, 4F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.145F, 0.435F, 0F, -0.145F, 0.435F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[567].setRotationPoint(-10.5F, -11F, -1F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 305
		bodyModel[568].setRotationPoint(-15.5F, -1F, -6F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -0.47F, 0F, 0F, -0.47F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.47F, 0F, 0F, -0.47F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 835
		bodyModel[569].setRotationPoint(-13.5F, -8.38F, 1.96F);
		bodyModel[569].rotateAngleX = 0.78539816F;

		bodyModel[570].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[570].setRotationPoint(-17F, -3.7F, 0F);
		bodyModel[570].rotateAngleX = -0.78539816F;

		bodyModel[571].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[571].setRotationPoint(-9.5F, -2.99F, 0F);
		bodyModel[571].rotateAngleX = -0.78539816F;

		bodyModel[572].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		bodyModel[572].setRotationPoint(-7.5F, -1F, -2.5F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 0
		bodyModel[573].setRotationPoint(-8F, -2.3F, -2.5F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[574].setRotationPoint(-8F, -4.3F, -1.5F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[575].setRotationPoint(-8F, -4.3F, -2.5F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 757
		bodyModel[576].setRotationPoint(-8F, -4.3F, 1.5F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[577].setRotationPoint(-8F, -7.3F, -1F);

		bodyModel[578].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[578].setRotationPoint(-7F, -3.3F, 2F);
		bodyModel[578].rotateAngleX = -1.10828408F;

		bodyModel[579].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[579].setRotationPoint(-7F, -3.3F, -2F);
		bodyModel[579].rotateAngleX = 1.10828408F;

		bodyModel[580].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[580].setRotationPoint(-8.82F, -3.5F, 4F);
		bodyModel[580].rotateAngleY = -0.78539816F;

		bodyModel[581].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[581].setRotationPoint(-8.12F, -3.5F, -4.7F);
		bodyModel[581].rotateAngleY = 0.78539816F;

		bodyModel[582].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 0
		bodyModel[582].setRotationPoint(-5.64F, -7.5F, -0.7F);
		bodyModel[582].rotateAngleY = 0.78539816F;

		bodyModel[583].addBox(0F, 0F, 0F, 9, 10, 2, 0F); // Box 0
		bodyModel[583].setRotationPoint(18.5F, -10F, 8F);

		bodyModel[584].addBox(0F, 0F, 0F, 9, 10, 2, 0F); // Box 0
		bodyModel[584].setRotationPoint(-27.5F, -10F, 8F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[585].setRotationPoint(15.5F, -17.4F, -7.25F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[586].setRotationPoint(16.5F, -17.75F, 6.15F);
		bodyModel[586].rotateAngleX = -0.78539816F;

		bodyModel[587].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 717
		bodyModel[587].setRotationPoint(16.5F, -17.75F, -6.15F);
		bodyModel[587].rotateAngleX = -0.78539816F;

		bodyModel[588].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.01F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.02F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.02F, -0.25F, -0.5F); // Box 169
		bodyModel[588].setRotationPoint(15.5F, -15.4F, 2.25F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.5F, -0.26F, 0F, -0.5F, -0.26F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.27F, -0.25F, -0.5F, -0.27F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 719
		bodyModel[589].setRotationPoint(-16.25F, -15.4F, -5.25F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[590].setRotationPoint(-16.25F, -17.4F, -7.25F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[591].setRotationPoint(-18.25F, -17.75F, 6.15F);
		bodyModel[591].rotateAngleX = -0.78539816F;

		bodyModel[592].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 717
		bodyModel[592].setRotationPoint(-18.25F, -17.75F, -6.15F);
		bodyModel[592].rotateAngleX = -0.78539816F;

		bodyModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[593].setRotationPoint(9F, -22.25F, 3.5F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[594].setRotationPoint(-10F, -22.25F, -4.5F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[595].setRotationPoint(-36.21F, -11.5F, -4.7F);
		bodyModel[595].rotateAngleY = 0.78539816F;

		bodyModel[596].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[596].setRotationPoint(-36.21F, -12.23F, -5F);
		bodyModel[596].rotateAngleZ = -0.78539816F;

		bodyModel[597].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, -0.05F); // Box 0
		bodyModel[597].setRotationPoint(-36.21F, -12.23F, -5.68F);
		bodyModel[597].rotateAngleZ = -0.78539816F;

		bodyModel[598].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, -0.29F, -0.25F, -0.25F, -0.29F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.29F, -0.25F, -0.25F, -0.29F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[598].setRotationPoint(-36.21F, -12.23F, 2.27F);
		bodyModel[598].rotateAngleX = -0.78539816F;

		bodyModel[599].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.5F, -0.5F, -0.645F); // Box 0
		bodyModel[599].setRotationPoint(-36.21F, -12.23F, 2.27F);
		bodyModel[599].rotateAngleZ = -0.78539816F;

		bodyModel[600].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -0.25F, -0.25F, -0.29F, -0.25F, -0.25F, -0.29F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.29F, -0.25F, -0.25F, -0.29F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[600].setRotationPoint(-36.21F, -1.04F, -5.68F);
		bodyModel[600].rotateAngleX = -0.78539816F;

		bodyModel[601].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.19F, 0F, -0.25F, 0.19F, 0F, -0.25F, 0.19F, -0.5F, -0.25F, 0.19F, -0.5F); // Box 0
		bodyModel[601].setRotationPoint(-36.74F, -11.52F, -5.5F);
		bodyModel[601].rotateAngleY = -0.78539816F;

		bodyModel[602].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.35F, -0.25F, -0.75F, -0.35F, -0.25F, -0.75F, -0.65F, -0.25F, -0.25F, -0.65F); // Box 0
		bodyModel[602].setRotationPoint(-36.21F, -12.23F, -6.03F);
		bodyModel[602].rotateAngleZ = -0.78539816F;

		bodyModel[603].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -1F, -0.5F, -0.65F, -0.75F); // Box 0
		bodyModel[603].setRotationPoint(-36.74F, -0.33F, -5.5F);
		bodyModel[603].rotateAngleY = -0.78539816F;

		bodyModel[604].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[604].setRotationPoint(36.21F, -11.51F, 3.3F);
		bodyModel[604].rotateAngleY = 0.78539816F;

		bodyModel[605].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[605].setRotationPoint(36.21F, -12.23F, 3F);
		bodyModel[605].rotateAngleZ = -0.78539816F;

		bodyModel[606].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.05F, -0.25F, -0.25F, -0.05F); // Box 0
		bodyModel[606].setRotationPoint(36.21F, -12.23F, -2.27F);
		bodyModel[606].rotateAngleZ = -0.78539816F;

		bodyModel[607].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, -0.29F, -0.25F, -0.25F, -0.29F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.29F, -0.25F, -0.25F, -0.29F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[607].setRotationPoint(35.5F, -12.23F, -2.27F);
		bodyModel[607].rotateAngleX = -0.78539816F;

		bodyModel[608].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -0.25F, -0.25F, -0.29F, -0.25F, -0.25F, -0.29F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.29F, -0.25F, -0.25F, -0.29F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[608].setRotationPoint(16.5F, -1.04F, 5.67F);
		bodyModel[608].rotateAngleX = -0.78539816F;

		bodyModel[609].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.19F, 0F, -0.25F, 0.19F, 0F, -0.25F, 0.19F, -0.5F, -0.25F, 0.19F, -0.5F); // Box 0
		bodyModel[609].setRotationPoint(35.68F, -11.52F, 5.85F);
		bodyModel[609].rotateAngleY = -0.78539816F;

		bodyModel[610].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.35F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.65F, -0.75F, -0.25F, -0.35F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, -0.65F, -0.75F, -0.25F, -0.65F); // Box 0
		bodyModel[610].setRotationPoint(36.21F, -12.23F, -2.62F);
		bodyModel[610].rotateAngleZ = -0.78539816F;

		bodyModel[611].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.5F, -0.5F, -0.65F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.25F, -1F); // Box 0
		bodyModel[611].setRotationPoint(36.21F, -12.23F, 5.68F);
		bodyModel[611].rotateAngleZ = -0.78539816F;

		bodyModel[612].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, -1F, 0F, -0.25F, -1F, 0F, -0.5F, -0.65F, -0.75F, -0.25F, -1F, -0.5F); // Box 0
		bodyModel[612].setRotationPoint(35.68F, -0.330000000000001F, 5.85F);
		bodyModel[612].rotateAngleY = -0.78539816F;

		bodyModel[613].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[613].setRotationPoint(-39.5F, -14F, 9F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[614].setRotationPoint(36.5F, -14F, 9F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F); // Box 389
		bodyModel[615].setRotationPoint(-48.49F, -11.5F, 5F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 758
		bodyModel[616].setRotationPoint(47.15F, -10.75F, -6.75F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 759
		bodyModel[617].setRotationPoint(47.15F, -11.75F, -9.25F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 760
		bodyModel[618].setRotationPoint(47.27F, -11.5F, -8.5F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 761
		bodyModel[619].setRotationPoint(46.83F, -9F, -8.62F);
		bodyModel[619].rotateAngleY = -0.78539816F;

		bodyModel[620].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		bodyModel[620].setRotationPoint(47.9F, -10F, -8.5F);

		bodyModel[621].addShapeBox(-1F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 763
		bodyModel[621].setRotationPoint(47F, -12F, -3.5F);
		bodyModel[621].rotateAngleY = 0.52359878F;

		bodyModel[622].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 764
		bodyModel[622].setRotationPoint(46.75F, -12.5F, -6.25F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 765
		bodyModel[623].setRotationPoint(48.15F, -14F, -3.99F);
		bodyModel[623].rotateAngleY = 0.52359878F;

		bodyModel[624].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 766
		bodyModel[624].setRotationPoint(47F, -10F, -4.22F);
		bodyModel[624].rotateAngleY = 0.78539816F;

		bodyModel[625].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 767
		bodyModel[625].setRotationPoint(48F, -11.5F, -7F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 768
		bodyModel[626].setRotationPoint(48.49F, -11.5F, -8F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, 0F, 0.125F, 1.05F, 0F, 0.125F, -1.05F, 0.25F, -0.125F, -1.05F, 0.25F, -0.125F, 1.05F, 0F, 0.125F); // Box 31
		bodyModel[627].setRotationPoint(-48.42F, -18F, -0.5F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.25F, -0.125F, -1.05F, 0.25F, -0.125F, 1.05F, 0F, 0.125F, 1.05F, 0F, 0.125F, -1.05F, 0.25F, -0.125F); // Box 31
		bodyModel[628].setRotationPoint(47.42F, -18F, -0.5F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.335F, 0F, -1F, -0.335F, 0F, -1F, -0.335F, 0F, 0F, -0.335F, 0F); // Box 0
		bodyModel[629].setRotationPoint(4.5F, -22.5F, -3F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.335F, 0F, -1F, -0.335F, 0F, -1F, -0.335F, 0F, 0F, -0.335F, 0F); // Box 0
		bodyModel[630].setRotationPoint(-14.5F, -22.5F, -3F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 21, 0, 6, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[631].setRotationPoint(4.5F, -22.51F, -3F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 21, 0, 6, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[632].setRotationPoint(-14.5F, -22.51F, -3F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F); // Box 0 cull
		bodyModel[633].setRotationPoint(17F, -22.25F, -4.5F);

		bodyModel[634].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F); // Box 0 cull
		bodyModel[634].setRotationPoint(-36F, -22.25F, -4.5F);

		bodyModel[635].addBox(0F, -1F, 0F, 0, 1, 3, 0F); // Box 439 bug deflector
		bodyModel[635].setRotationPoint(-57.75F, -12.25F, -1.5F);
		bodyModel[635].rotateAngleZ = -0.41887902F;

		bodyModel[636].addBox(0F, -1F, 0F, 0, 1, 3, 0F); // Box 439 bug deflector
		bodyModel[636].setRotationPoint(57.75F, -12.25F, -1.5F);
		bodyModel[636].rotateAngleZ = 0.41887902F;

		bodyModel[637].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[637].setRotationPoint(58.7F, 1F, -3F);

		bodyModel[638].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[638].setRotationPoint(-59.7F, 1F, -3F);

		bodyModel[639].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 778
		bodyModel[639].setRotationPoint(45.5F, -20.5F, 0.5F);

		bodyModel[640].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[640].setRotationPoint(45.5F, -21.5F, 0.5F);

		bodyModel[641].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 780
		bodyModel[641].setRotationPoint(-46.5F, -20.5F, -1.5F);

		bodyModel[642].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 781
		bodyModel[642].setRotationPoint(-47.5F, -21.5F, -1.5F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[643].setRotationPoint(-58.69F, -7.5F, 1F);

		bodyModel[644].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[644].setRotationPoint(-58.69F, -7.5F, 0F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[645].setRotationPoint(-58.69F, -7.5F, -2F);

		bodyModel[646].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[646].setRotationPoint(-58.69F, -7.5F, -2F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[647].setRotationPoint(-58.69F, -5.5F, 1F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[648].setRotationPoint(-58.69F, -5.5F, -2F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[649].setRotationPoint(-58.69F, -4.5F, 0F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[650].setRotationPoint(-58.69F, -4.5F, -2F);

		bodyModel[651].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front 2beam bottom A
		bodyModel[651].setRotationPoint(-57.94F, -5.5F, 0F);

		bodyModel[652].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front 2beam bottom A
		bodyModel[652].setRotationPoint(-57.94F, -5.5F, 0F);

		bodyModel[653].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big bottom
		bodyModel[653].setRotationPoint(-57.94F, -6.75F, -1.25F);

		bodyModel[654].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front 2beam bottom B
		bodyModel[654].setRotationPoint(-57.94F, -5.5F, 0F);
		bodyModel[654].rotateAngleX = 1.57079633F;

		bodyModel[655].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front 2beam bottom B
		bodyModel[655].setRotationPoint(-57.94F, -5.5F, 0F);
		bodyModel[655].rotateAngleX = 1.57079633F;

		bodyModel[656].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F); // Box 430
		bodyModel[656].setRotationPoint(-58.44F, -4F, 1F);

		bodyModel[657].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.07F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F); // Box 431
		bodyModel[657].setRotationPoint(-58.44F, -4F, 0F);

		bodyModel[658].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.202F, 0F, -1F, 0.202F, 0F, -1F, 0.202F, 0F, 0F, -0.202F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		bodyModel[658].setRotationPoint(-58.44F, -5.5F, 1F);

		bodyModel[659].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.202F, 0F, 0F, 0.202F, 0F, 0F, 0.202F, 0F, -1F, -0.202F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 433
		bodyModel[659].setRotationPoint(-58.44F, -5.5F, -2F);

		bodyModel[660].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[660].setRotationPoint(-58.7F, -7.5F, 1F);

		bodyModel[661].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F); // Box 403
		bodyModel[661].setRotationPoint(-58.7F, -7.5F, 0F);

		bodyModel[662].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[662].setRotationPoint(-58.7F, -5.5F, 1F);

		bodyModel[663].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[663].setRotationPoint(-58.7F, -4.5F, 0F);

		bodyModel[664].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 489
		bodyModel[664].setRotationPoint(-58.7F, -7.5F, -2F);

		bodyModel[665].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 490
		bodyModel[665].setRotationPoint(-58.7F, -7.5F, -2F);

		bodyModel[666].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F); // Box 491
		bodyModel[666].setRotationPoint(-58.7F, -5.5F, -2F);

		bodyModel[667].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[667].setRotationPoint(-58.7F, -4.5F, -2F);

		bodyModel[668].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front small bottom
		bodyModel[668].setRotationPoint(-57.94F, -5.5F, 0F);

		bodyModel[669].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.005F, -0.5F, -0.5F, 0.005F, -0.5F, -0.5F, 0.005F, -0.5F, 0F, -0.005F, -0.5F, 0F, 0.202F, 0F, -1F, -0.202F, 0F, -1F, -0.202F, 0F, 0F, 0.202F, 0F, 0F); // Box 430
		bodyModel[669].setRotationPoint(-58.03F, -7.5F, 1F);

		bodyModel[670].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.005F, 0F, 0F, 0.005F, 0F, 0F, 0.005F, 0F, 0F, -0.005F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 430
		bodyModel[670].setRotationPoint(-57.89F, -8F, 1F);

		bodyModel[671].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, 0F, -0.5F, 0F, 0.07F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[671].setRotationPoint(-58.02F, -8F, 0F);

		bodyModel[672].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.005F, -0.5F, 0F, 0.005F, -0.5F, 0F, 0.005F, -0.5F, -0.5F, -0.005F, -0.5F, -0.5F, 0.202F, 0F, 0F, -0.202F, 0F, 0F, -0.202F, 0F, -1F, 0.202F, 0F, -1F); // Box 528
		bodyModel[672].setRotationPoint(-58.03F, -7.5F, -2F);

		bodyModel[673].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.005F, 0F, 0F, 0.005F, 0F, 0F, 0.005F, 0F, 0F, -0.005F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 529
		bodyModel[673].setRotationPoint(-57.89F, -8F, -2F);

		bodyModel[674].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.07F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 530
		bodyModel[674].setRotationPoint(-58.02F, -8F, -1F);

		bodyModel[675].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F); // Box 531
		bodyModel[675].setRotationPoint(-58.44F, -4F, -2F);

		bodyModel[676].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.07F, -0.5F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F); // Box 532
		bodyModel[676].setRotationPoint(-58.44F, -4F, -1F);

		bodyModel[677].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[677].setRotationPoint(-57.69F, -7.5F, 0F);

		bodyModel[678].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.96F, -0.5F, -0.5F, -0.96F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[678].setRotationPoint(-57.69F, -7.5F, -2F);

		bodyModel[679].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.96F, -0.5F, -0.5F, -0.96F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[679].setRotationPoint(-57.69F, -5.5F, -2F);

		bodyModel[680].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[680].setRotationPoint(-57.69F, -5.5F, 0F);

		bodyModel[681].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.415F, 0F, 0F, 0.415F, 0F, 0F, 0.415F, 0F, 0F, -0.415F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[681].setRotationPoint(-59F, -3F, -2F);

		bodyModel[682].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[682].setRotationPoint(57.69F, -7.5F, 1F);

		bodyModel[683].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[683].setRotationPoint(57.69F, -7.5F, 0F);

		bodyModel[684].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[684].setRotationPoint(57.69F, -7.5F, -2F);

		bodyModel[685].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[685].setRotationPoint(57.69F, -7.5F, -2F);

		bodyModel[686].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[686].setRotationPoint(57.69F, -5.5F, 1F);

		bodyModel[687].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[687].setRotationPoint(57.69F, -5.5F, -2F);

		bodyModel[688].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[688].setRotationPoint(57.69F, -4.5F, 0F);

		bodyModel[689].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[689].setRotationPoint(57.69F, -4.5F, -2F);

		bodyModel[690].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight back 2beam bottom A
		bodyModel[690].setRotationPoint(57.7F, -5.5F, 0F);

		bodyModel[691].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight back 2beam bottom A
		bodyModel[691].setRotationPoint(57.7F, -5.5F, 0F);

		bodyModel[692].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight back big bottom
		bodyModel[692].setRotationPoint(57.7F, -6.75F, -1.25F);

		bodyModel[693].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight back 2beam bottom B
		bodyModel[693].setRotationPoint(57.7F, -5.5F, 0F);
		bodyModel[693].rotateAngleX = 1.57079633F;

		bodyModel[694].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight back 2beam bottom B
		bodyModel[694].setRotationPoint(57.7F, -5.5F, 0F);
		bodyModel[694].rotateAngleX = 1.57079633F;

		bodyModel[695].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F); // Box 430
		bodyModel[695].setRotationPoint(57.44F, -4F, 1F);

		bodyModel[696].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0.07F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F); // Box 431
		bodyModel[696].setRotationPoint(57.44F, -4F, 0F);

		bodyModel[697].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.202F, 0F, -1F, -0.202F, 0F, -1F, -0.202F, 0F, 0F, 0.202F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		bodyModel[697].setRotationPoint(57.44F, -5.5F, 1F);

		bodyModel[698].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.202F, 0F, 0F, -0.202F, 0F, 0F, -0.202F, 0F, -1F, 0.202F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 433
		bodyModel[698].setRotationPoint(57.44F, -5.5F, -2F);

		bodyModel[699].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[699].setRotationPoint(58.7F, -7.5F, 1F);

		bodyModel[700].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F); // Box 403
		bodyModel[700].setRotationPoint(58.7F, -7.5F, 0F);

		bodyModel[701].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[701].setRotationPoint(58.7F, -5.5F, 1F);

		bodyModel[702].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[702].setRotationPoint(58.7F, -4.5F, 0F);

		bodyModel[703].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 489
		bodyModel[703].setRotationPoint(58.7F, -7.5F, -2F);

		bodyModel[704].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 490
		bodyModel[704].setRotationPoint(58.7F, -7.5F, -2F);

		bodyModel[705].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F); // Box 491
		bodyModel[705].setRotationPoint(58.7F, -5.5F, -2F);

		bodyModel[706].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[706].setRotationPoint(58.7F, -4.5F, -2F);

		bodyModel[707].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headligh tback small bottom
		bodyModel[707].setRotationPoint(57.7F, -5.5F, 0F);

		bodyModel[708].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.005F, -0.5F, -0.5F, -0.005F, -0.5F, -0.5F, -0.005F, -0.5F, 0F, 0.005F, -0.5F, 0F, -0.202F, 0F, -1F, 0.202F, 0F, -1F, 0.202F, 0F, 0F, -0.202F, 0F, 0F); // Box 430
		bodyModel[708].setRotationPoint(57.03F, -7.5F, 1F);

		bodyModel[709].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.005F, 0F, 0F, -0.005F, 0F, 0F, -0.005F, 0F, 0F, 0.005F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F); // Box 430
		bodyModel[709].setRotationPoint(56.89F, -8F, 1F);

		bodyModel[710].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.07F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[710].setRotationPoint(57.02F, -8F, 0F);

		bodyModel[711].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.005F, -0.5F, 0F, -0.005F, -0.5F, 0F, -0.005F, -0.5F, -0.5F, 0.005F, -0.5F, -0.5F, -0.202F, 0F, 0F, 0.202F, 0F, 0F, 0.202F, 0F, -1F, -0.202F, 0F, -1F); // Box 528
		bodyModel[711].setRotationPoint(57.03F, -7.5F, -2F);

		bodyModel[712].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.005F, 0F, 0F, -0.005F, 0F, 0F, -0.005F, 0F, 0F, 0.005F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F); // Box 529
		bodyModel[712].setRotationPoint(56.89F, -8F, -2F);

		bodyModel[713].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.07F, -0.5F, 0F); // Box 530
		bodyModel[713].setRotationPoint(57.02F, -8F, -1F);

		bodyModel[714].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F); // Box 531
		bodyModel[714].setRotationPoint(57.44F, -4F, -2F);

		bodyModel[715].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.07F, -0.5F, 0F, 0F, -0.5F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F); // Box 532
		bodyModel[715].setRotationPoint(57.44F, -4F, -1F);

		bodyModel[716].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[716].setRotationPoint(57.65F, -7.5F, 0F);

		bodyModel[717].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.96F, -0.5F, -0.5F, -0.96F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[717].setRotationPoint(57.65F, -7.5F, -2F);

		bodyModel[718].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.96F, -0.5F, -0.5F, -0.96F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[718].setRotationPoint(57.65F, -5.5F, -2F);

		bodyModel[719].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[719].setRotationPoint(57.65F, -5.5F, 0F);

		bodyModel[720].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.415F, 0F, 0F, -0.415F, 0F, 0F, -0.415F, 0F, 0F, 0.415F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[720].setRotationPoint(58F, -3F, -2F);

		bodyModel[721].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 0
		bodyModel[721].setRotationPoint(-1F, -22.5F, -5F);

		bodyModel[722].addShapeBox(-1F, 0F, -2F, 1, 2, 4, 0F,-0.15F, 0F, -0.17F, 0F, 0F, -0.17F, 0F, 0F, 0F, -0.08F, 0F, 0F, -0.41F, -0.125F, -0.17F, 0F, -0.125F, -0.17F, 0F, -0.125F, 0F, -0.4F, -0.125F, 0F); // Box 525
		bodyModel[722].setRotationPoint(56.65F, -9.87F, 7.02F);
		bodyModel[722].rotateAngleY = 0.47298423F;

		bodyModel[723].addShapeBox(-0.05F, 0F, -2F, 1, 2, 5, 0F,0F, -0.05F, -0.22F, -0.95F, -0.05F, -0.22F, -0.95F, -0.05F, -1.05F, 0F, -0.05F, -1.05F, 0F, -0.175F, -0.22F, -0.95F, -0.175F, -0.22F, -0.95F, -0.175F, -1.05F, 0F, -0.175F, -1.05F); // Numberboard R type 2 BACK
		bodyModel[723].setRotationPoint(56.7F, -9.87F, 7.04F);
		bodyModel[723].rotateAngleY = 0.47298423F;

		bodyModel[724].addShapeBox(-1F, 0F, -2F, 1, 2, 4, 0F,-0.08F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.17F, -0.15F, 0F, -0.17F, -0.4F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.17F, -0.41F, -0.125F, -0.17F); // Box 524
		bodyModel[724].setRotationPoint(56.65F, -9.87F, -7.02F);
		bodyModel[724].rotateAngleY = -0.47298423F;

		bodyModel[725].addShapeBox(-0.05F, 0F, -2F, 1, 2, 5, 0F,0F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -1.22F, 0F, -0.05F, -1.22F, 0F, -0.175F, -0.05F, -0.95F, -0.175F, -0.05F, -0.95F, -0.175F, -1.22F, 0F, -0.175F, -1.22F); // Numberboard L Type 2 BACK
		bodyModel[725].setRotationPoint(56.7F, -9.87F, -7.04F);
		bodyModel[725].rotateAngleY = -0.47298423F;

		bodyModel[726].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[726].setRotationPoint(-46.5F, -21F, -0.5F);

		bodyModel[727].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 80
		bodyModel[727].setRotationPoint(-38F, -24F, -1F);

		bodyModel[728].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[728].setRotationPoint(-41F, -23F, -1.5F);

		bodyModel[729].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[729].setRotationPoint(-48.5F, -22F, -0.5F);

		bodyModel[730].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[730].setRotationPoint(-47F, -22F, 0.5F);

		bodyModel[731].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[731].setRotationPoint(-48F, -22F, -1.5F);

		bodyModel[732].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[732].setRotationPoint(-41F, -23F, -0.5F);

		bodyModel[733].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon FRONT
		bodyModel[733].setRotationPoint(-41F, -24F, -0.5F);

		bodyModel[734].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[734].setRotationPoint(-48F, -22F, -1.5F);

		bodyModel[735].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[735].setRotationPoint(-48F, -23F, -1.5F);

		bodyModel[736].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[736].setRotationPoint(-41F, -23F, -1F);

		bodyModel[737].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1 FRONT
		bodyModel[737].setRotationPoint(-41F, -23.5F, -1F);

		bodyModel[738].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3 FRONT
		bodyModel[738].setRotationPoint(-41F, -23.5F, -1F);

		bodyModel[739].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2 FRONT
		bodyModel[739].setRotationPoint(-41F, -23.5F, -1F);

		bodyModel[740].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4 FRONT
		bodyModel[740].setRotationPoint(-41F, -23.5F, -1F);

		bodyModel[741].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[741].setRotationPoint(-46.5F, -20.75F, 3.5F);

		bodyModel[742].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[742].setRotationPoint(-48.5F, -21.75F, 3.5F);

		bodyModel[743].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[743].setRotationPoint(-47.5F, -21.75F, 4.5F);

		bodyModel[744].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[744].setRotationPoint(-48F, -21.75F, 2.5F);

		bodyModel[745].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[745].setRotationPoint(40F, -23F, -0.5F);

		bodyModel[746].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon BACK
		bodyModel[746].setRotationPoint(40F, -24F, -0.5F);

		bodyModel[747].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[747].setRotationPoint(39F, -23F, -1F);

		bodyModel[748].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1 BACK
		bodyModel[748].setRotationPoint(39F, -23.5F, -1F);

		bodyModel[749].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3 BACK
		bodyModel[749].setRotationPoint(39F, -23.5F, -1F);

		bodyModel[750].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2 BACK
		bodyModel[750].setRotationPoint(39F, -23.5F, -1F);

		bodyModel[751].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4 BACK
		bodyModel[751].setRotationPoint(39F, -23.5F, -1F);

		bodyModel[752].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Numberboard L FRONT
		bodyModel[752].setRotationPoint(-51.5F, -6F, -11.01F);

		bodyModel[753].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Numberboard R FRONT
		bodyModel[753].setRotationPoint(-51.5F, -6F, 11.01F);

		bodyModel[754].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Numberboard L BACK
		bodyModel[754].setRotationPoint(49.5F, -6F, -11.01F);

		bodyModel[755].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Numberboard R BACK
		bodyModel[755].setRotationPoint(49.5F, -6F, 11.01F);

		bodyModel[756].addShapeBox(-0.5F, -0.5F, -0.75F, 1, 1, 1, 0F,-0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 353 markerlight FRONT
		bodyModel[756].setRotationPoint(-53.5F, -5.5F, 10.34F);
		bodyModel[756].rotateAngleY = 0.37960911F;

		bodyModel[757].addShapeBox(-0.5F, -0.5F, -0.25F, 1, 1, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F); // Box 545 markerlight FRONT
		bodyModel[757].setRotationPoint(-53.5F, -5.5F, -10.34F);
		bodyModel[757].rotateAngleY = -0.37960911F;

		bodyModel[758].addShapeBox(-0.5F, -0.5F, -0.75F, 1, 1, 1, 0F,-0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 353 markerlight BACK
		bodyModel[758].setRotationPoint(53.5F, -5.5F, 10.34F);
		bodyModel[758].rotateAngleY = -0.37960911F;

		bodyModel[759].addShapeBox(-0.5F, -0.5F, -0.25F, 1, 1, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F); // Box 545 markerlight BACK
		bodyModel[759].setRotationPoint(53.5F, -5.5F, -10.34F);
		bodyModel[759].rotateAngleY = 0.37960911F;

		bodyModel[760].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 899
		bodyModel[760].setRotationPoint(37F, -24F, 1F);

		bodyModel[761].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 900
		bodyModel[761].setRotationPoint(38F, -23F, 1.5F);

		bodyModel[762].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 903
		bodyModel[762].setRotationPoint(45.5F, -21F, -0.5F);

		bodyModel[763].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 904
		bodyModel[763].setRotationPoint(45.5F, -22F, -0.5F);

		bodyModel[764].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 905
		bodyModel[764].setRotationPoint(45F, -22F, -1.5F);

		bodyModel[765].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 906
		bodyModel[765].setRotationPoint(45.5F, -22F, 0.5F);

		bodyModel[766].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 907
		bodyModel[766].setRotationPoint(47F, -22F, 0.5F);

		bodyModel[767].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 908
		bodyModel[767].setRotationPoint(45F, -23F, 0.5F);

		bodyModel[768].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 909
		bodyModel[768].setRotationPoint(45.5F, -20.75F, -4.5F);

		bodyModel[769].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
		bodyModel[769].setRotationPoint(45.5F, -21.75F, -4.5F);

		bodyModel[770].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911
		bodyModel[770].setRotationPoint(45.5F, -21.75F, -5.5F);

		bodyModel[771].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 912
		bodyModel[771].setRotationPoint(45.5F, -21.75F, -3.5F);

		bodyModel[772].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.315F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.29F, 0F, 0F, -0.585F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.015F, 0F, 0F); // Box 497 EARR MU
		bodyModel[772].setRotationPoint(57F, -10F, 3F);

		bodyModel[773].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.29F, 0F, 0F, -0.315F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.015F, 0F, 0F, -0.585F, 0F, 0F, 0F, 0F, 0F); // Box 912
		bodyModel[773].setRotationPoint(-58F, -10F, -5F);

		bodyModel[774].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 448 cull
		bodyModel[774].setRotationPoint(-59.5F, 7F, -8F);

		bodyModel[775].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 449 cull
		bodyModel[775].setRotationPoint(-59.5F, 7F, 3F);

		bodyModel[776].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 448 cull
		bodyModel[776].setRotationPoint(57.5F, 7F, -8F);

		bodyModel[777].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 449 cull
		bodyModel[777].setRotationPoint(57.5F, 7F, 3F);

		bodyModel[778].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.325F, 0F, 0F, 0.325F, 0F, 0F, 0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.325F, -0.25F, 0F, 0.325F, -0.25F, 0F); // Box 560
		bodyModel[778].setRotationPoint(-47.65F, -20.75F, -3.5F);

		bodyModel[779].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 560
		bodyModel[779].setRotationPoint(-47.15F, -20.75F, 3.5F);

		bodyModel[780].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 560
		bodyModel[780].setRotationPoint(-47.15F, -19.25F, 9.5F);

		bodyModel[781].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.625F, 0F, 0F, 0.625F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.625F, -0.25F, 0F, 0.625F, -0.25F, 0F); // Box 920
		bodyModel[781].setRotationPoint(-47.15F, -20.75F, -9.5F);

		bodyModel[782].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 921
		bodyModel[782].setRotationPoint(-47.15F, -19.25F, -10.5F);

		bodyModel[783].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.325F, 0F, 0F, -0.325F, 0F, 0F, -0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.325F, -0.25F, 0F, -0.325F, -0.25F, 0F); // Box 560
		bodyModel[783].setRotationPoint(47.65F, -20.75F, -3.5F);

		bodyModel[784].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,-0.625F, 0F, 0F, 0.625F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.625F, -0.25F, 0F, 0.625F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 560
		bodyModel[784].setRotationPoint(47.15F, -20.75F, 3.5F);

		bodyModel[785].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 560
		bodyModel[785].setRotationPoint(47.15F, -19.25F, 9.5F);

		bodyModel[786].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F); // Box 920
		bodyModel[786].setRotationPoint(47.15F, -20.75F, -9.5F);

		bodyModel[787].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 921
		bodyModel[787].setRotationPoint(47.15F, -19.25F, -10.5F);

		bodyModel[788].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-0.325F, 0F, 0F, 0.325F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.325F, -0.25F, 0F, 0.325F, -0.25F, 0F, 0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Box 927
		bodyModel[788].setRotationPoint(47.65F, -20.75F, 1.5F);

		bodyModel[789].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0.325F, 0F, 0F, -0.325F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.325F, -0.25F, 0F, -0.325F, -0.25F, 0F, -0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F); // Box 927
		bodyModel[789].setRotationPoint(-47.65F, -20.75F, 1.5F);

		bodyModel[790].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F); // Box 929
		bodyModel[790].setRotationPoint(52.3F, 2.75F, -7.75F);

		bodyModel[791].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 930
		bodyModel[791].setRotationPoint(52.3F, 2F, -7.75F);

		bodyModel[792].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 931
		bodyModel[792].setRotationPoint(52.55F, 3F, -8F);

		bodyModel[793].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1.285F, 0F, 0F, 1.07F, 0F, -0.425F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, -0.5F, -0.175F, 0F, 0F, 0.175F, 0F, 0F); // Box 447
		bodyModel[793].setRotationPoint(-59F, 8F, -7F);

		bodyModel[794].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, 0F, 0F, -0.1F, 0F, 0F, 1.07F, 0F, -0.425F, -1.285F, 0F, 0F, 0.175F, 0F, 0F, -0.175F, 0F, 0F, 1F, 0F, -0.5F, -1.25F, 0F, 0F); // Box 934
		bodyModel[794].setRotationPoint(-59F, 8F, 3F);

		bodyModel[795].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1.07F, 0F, -0.425F, -1.285F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, 1F, 0F, -0.5F, -1.25F, 0F, 0F, 0.175F, 0F, 0F, -0.175F, 0F, 0F); // Box 447
		bodyModel[795].setRotationPoint(58F, 8F, -7F);

		bodyModel[796].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.1F, 0F, 0F, 0.1F, 0F, 0F, -1.285F, 0F, 0F, 1.07F, 0F, -0.425F, -0.175F, 0F, 0F, 0.175F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, -0.5F); // Box 934
		bodyModel[796].setRotationPoint(58F, 8F, 3F);

		bodyModel[797].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 0
		bodyModel[797].setRotationPoint(-2F, -14.5F, -11.01F);

		bodyModel[798].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 938
		bodyModel[798].setRotationPoint(-2F, -14.5F, 11.01F);

		bodyModel[799].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,-0.6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.35F, -2F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.35F, 0F, -0.5F); // Box 0
		bodyModel[799].setRotationPoint(-48.5F, -22F, -2.5F);

		bodyModel[800].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-0.7F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.6F, -2F, 0F, -0.7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 0
		bodyModel[800].setRotationPoint(-48.5F, -22F, -3.5F);

		bodyModel[801].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-0.7F, -2F, 0F, 0F, -0.335F, 0F, 0F, 0F, 0F, -0.7F, -2F, -1F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -1F); // Box 0
		bodyModel[801].setRotationPoint(-48.5F, -22F, -3.5F);

		bodyModel[802].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,-0.2F, -3.25F, 0F, 0F, -2F, 0F, 0F, -0.335F, 0F, -0.2F, -3.25F, -5F, -0.2F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, -0.2F, 1.25F, -5F); // Box 0
		bodyModel[802].setRotationPoint(-47.5F, -22F, -8.5F);

		bodyModel[803].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,-0.2F, -3.25F, 0F, 0F, -0.335F, -5F, 0F, -0.335F, 0F, 0.3F, -2F, 0F, -0.2F, 1.25F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0.3F, 0F, 0F); // Box 0
		bodyModel[803].setRotationPoint(-47.5F, -22F, -8.5F);

		bodyModel[804].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.3F, -1.5F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, -0.3F, -1.5F, -1F, -0.3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -0.3F, 0.5F, -1F); // Box 579
		bodyModel[804].setRotationPoint(-47.5F, -20F, -9.5F);

		bodyModel[805].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.3F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.2F, -1.25F, 0F, -0.3F, 0.5F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, -0.2F, 0.25F, 0F); // Box 579
		bodyModel[805].setRotationPoint(-47.5F, -20F, -9.5F);

		bodyModel[806].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.3F, -0.5F, -1.5F, 0F, -2F, 0F, 0F, -0.2F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -1.5F, 0F, 1F, 0F, 0F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F); // Box 579
		bodyModel[806].setRotationPoint(-47.5F, -19F, -11F);

		bodyModel[807].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,-0.35F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.6F, -2F, 0F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 934
		bodyModel[807].setRotationPoint(-48.5F, -22F, -0.5F);

		bodyModel[808].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-0.6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.7F, -2F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.7F, 0F, 0F); // Box 935
		bodyModel[808].setRotationPoint(-48.5F, -22F, 2.5F);

		bodyModel[809].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-0.7F, -2F, -1F, 0F, 0F, 0F, 0F, -0.335F, 0F, -0.7F, -2F, 0F, -0.7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 936
		bodyModel[809].setRotationPoint(-48.5F, -22F, 2.5F);

		bodyModel[810].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,-0.2F, -3.25F, -5F, 0F, -0.335F, 0F, 0F, -2F, 0F, -0.2F, -3.25F, 0F, -0.2F, 1.25F, -5F, 0F, 0F, 0F, 0F, 1.25F, 0F, -0.2F, 1.25F, 0F); // Box 937
		bodyModel[810].setRotationPoint(-47.5F, -22F, 3.5F);

		bodyModel[811].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0.3F, -2F, 0F, 0F, -0.335F, 0F, 0F, -0.335F, -5F, -0.2F, -3.25F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 1.25F, 0F); // Box 938
		bodyModel[811].setRotationPoint(-47.5F, -22F, 3.5F);

		bodyModel[812].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.3F, -1.5F, -1F, 0F, 0F, 0F, 0F, -1.2F, 0F, -0.3F, -1.5F, 0F, -0.3F, 0.5F, -1F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, -0.3F, 0.5F, 0F); // Box 939
		bodyModel[812].setRotationPoint(-47.5F, -20F, 8.5F);

		bodyModel[813].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.2F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.3F, -1.5F, 0F, -0.2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, -0.3F, 0.5F, 0F); // Box 940
		bodyModel[813].setRotationPoint(-47.5F, -20F, 8.5F);

		bodyModel[814].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.3F, -0.5F, -0.5F, 0F, -0.2F, -0.5F, 0F, -2F, 0F, -0.3F, -0.5F, -1.5F, -0.3F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 1F, 0F, -0.3F, -0.5F, -1.5F); // Box 941
		bodyModel[814].setRotationPoint(-47.5F, -19F, 9F);

		bodyModel[815].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -2F, -0.75F, 0F, -2F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 61
		bodyModel[815].setRotationPoint(-35.5F, -11F, 10F);

		bodyModel[816].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -2F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2F, -0.75F, 0F); // Box 61
		bodyModel[816].setRotationPoint(-33.5F, -11F, 10F);

		bodyModel[817].addShapeBox(-3F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F); // Front side door R
		bodyModel[817].setRotationPoint(-31.5F, -11F, 10F);

		bodyModel[818].addShapeBox(-4F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F); // Front side door R
		bodyModel[818].setRotationPoint(-31.5F, -9.75F, 10F);

		bodyModel[819].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Front side door R
		bodyModel[819].setRotationPoint(-31.5F, -10.25F, 10F);

		bodyModel[820].addShapeBox(-4F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Front side door R
		bodyModel[820].setRotationPoint(-31.5F, -10.25F, 10F);

		bodyModel[821].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -2F, -0.75F, 0F, -2F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 953
		bodyModel[821].setRotationPoint(-35.5F, -11F, -11F);

		bodyModel[822].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -2F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2F, -0.75F, 0F); // Box 954
		bodyModel[822].setRotationPoint(-33.5F, -11F, -11F);

		bodyModel[823].addShapeBox(-4F, 0F, -0.5F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F); // Front side door L
		bodyModel[823].setRotationPoint(-31.5F, -9.75F, -10F);

		bodyModel[824].addShapeBox(-4F, 0F, -0.5F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Front side door L
		bodyModel[824].setRotationPoint(-31.5F, -10.25F, -10F);

		bodyModel[825].addShapeBox(-1F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Front side door L
		bodyModel[825].setRotationPoint(-31.5F, -10.25F, -10F);

		bodyModel[826].addShapeBox(-3F, 0F, -0.5F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F); // Front side door L
		bodyModel[826].setRotationPoint(-31.5F, -11F, -10F);

		bodyModel[827].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[827].setRotationPoint(-40.5F, -2.5F, -9F);

		bodyModel[828].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[828].setRotationPoint(-40.5F, -6F, -9F);

		bodyModel[829].addShapeBox(0F, 0F, 0F, 2, 0, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		bodyModel[829].setRotationPoint(-40.5F, -4F, -8.5F);

		bodyModel[830].addShapeBox(0F, 0F, 0F, 2, 0, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		bodyModel[830].setRotationPoint(-38.5F, -2F, -8.5F);

		bodyModel[831].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 152
		bodyModel[831].setRotationPoint(-40.5F, -2.5F, 8.5F);

		bodyModel[832].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 153
		bodyModel[832].setRotationPoint(-40.5F, -6F, 8.5F);

		bodyModel[833].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[833].setRotationPoint(-40.5F, -2.5F, -5F);

		bodyModel[834].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[834].setRotationPoint(-40.5F, -6F, -5F);

		bodyModel[835].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 335
		bodyModel[835].setRotationPoint(-40.5F, -2.5F, 4.5F);

		bodyModel[836].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 336
		bodyModel[836].setRotationPoint(-40.5F, -6F, 4.5F);

		bodyModel[837].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[837].setRotationPoint(-36.21F, -12.23F, -2F);
		bodyModel[837].rotateAngleZ = -0.78539816F;

		bodyModel[838].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.2F, 0F, 0F, -0.7F, 0F, 0F, 0.5F, 0F, 0F, -1.05F, 0F, 0.2F, 0.2F, -2F, 0F, -0.7F, -2F, 0F, 0.5F, -2F, 0F, -1.05F, -2F, 0.2F); // Box 481
		bodyModel[838].setRotationPoint(-59F, 1F, 3F);

		bodyModel[839].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.15F, 0F, -1.14F, -0.5F, -2F, 0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, -0.15F, -2F, -1.14F); // Box 482
		bodyModel[839].setRotationPoint(-55.5F, 1F, 10.5F);

		bodyModel[840].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.05F, 0F, -0.21F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.65F, 0F, 0.36F, -0.05F, -2F, -0.21F, -0.5F, -2F, 0F, 2F, -2F, 0F, -2.65F, -2F, 0.36F); // Box 483
		bodyModel[840].setRotationPoint(-58F, 1F, 7F);

		bodyModel[841].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1.05F, 0F, 0.2F, 0.5F, 0F, 0F, -0.7F, 0F, 0F, 0.2F, 0F, 0F, -1.05F, -2F, 0.2F, 0.5F, -2F, 0F, -0.7F, -2F, 0F, 0.2F, -2F, 0F); // Box 580
		bodyModel[841].setRotationPoint(-59F, 1F, -7F);

		bodyModel[842].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.15F, 0F, -1.14F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.15F, -2F, -1.14F, 0F, -2F, 0F, 0F, -2F, -0.5F, -0.5F, -2F, 0.5F); // Box 581
		bodyModel[842].setRotationPoint(-55.5F, 1F, -11.5F);

		bodyModel[843].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-2.65F, 0F, 0.36F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.05F, 0F, -0.2F, -2.65F, -2F, 0.36F, 2F, -2F, 0F, -0.5F, -2F, 0F, -0.05F, -2F, -0.2F); // Box 582
		bodyModel[843].setRotationPoint(-58F, 1F, -10F);

		bodyModel[844].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 638
		bodyModel[844].setRotationPoint(-43.5F, -9F, -5F);

		bodyModel[845].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -2F, -0.75F, 0F, -2F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 61
		bodyModel[845].setRotationPoint(31.5F, -11F, 10F);

		bodyModel[846].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -2F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2F, -0.75F, 0F); // Box 61
		bodyModel[846].setRotationPoint(33.5F, -11F, 10F);

		bodyModel[847].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -2F, -0.75F, 0F, -2F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 963
		bodyModel[847].setRotationPoint(31.5F, -11F, -11F);

		bodyModel[848].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -2F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2F, -0.75F, 0F); // Box 964
		bodyModel[848].setRotationPoint(33.5F, -11F, -11F);

		bodyModel[849].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F); // Rear side door R
		bodyModel[849].setRotationPoint(31.5F, -9.75F, 10F);

		bodyModel[850].addShapeBox(0F, 0F, -0.5F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F); // Rear side door L
		bodyModel[850].setRotationPoint(31.5F, -9.75F, -10F);

		bodyModel[851].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.7F, 0F, 0F, 0.2F, 0F, 0F, -1.05F, 0F, 0.2F, 0.5F, 0F, 0F, -0.7F, -2F, 0F, 0.2F, -2F, 0F, -1.05F, -2F, 0.2F, 0.5F, -2F, 0F); // Box 481
		bodyModel[851].setRotationPoint(58F, 1F, 3F);

		bodyModel[852].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.15F, 0F, -1.14F, 0F, 0F, 0F, 0F, -2F, -0.5F, -0.5F, -2F, 0.5F, -0.15F, -2F, -1.14F, 0F, -2F, 0F); // Box 482
		bodyModel[852].setRotationPoint(52.5F, 1F, 10.5F);

		bodyModel[853].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, -0.05F, 0F, -0.21F, -2.65F, 0F, 0.36F, 2F, 0F, 0F, -0.5F, -2F, 0F, -0.05F, -2F, -0.21F, -2.65F, -2F, 0.36F, 2F, -2F, 0F); // Box 483
		bodyModel[853].setRotationPoint(57F, 1F, 7F);

		bodyModel[854].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.5F, 0F, 0F, -1.05F, 0F, 0.2F, 0.2F, 0F, 0F, -0.7F, 0F, 0F, 0.5F, -2F, 0F, -1.05F, -2F, 0.2F, 0.2F, -2F, 0F, -0.7F, -2F, 0F); // Box 580
		bodyModel[854].setRotationPoint(58F, 1F, -7F);

		bodyModel[855].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, -0.15F, 0F, -1.14F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -0.15F, -2F, -1.14F, -0.5F, -2F, 0.5F, 0F, -2F, -0.5F); // Box 581
		bodyModel[855].setRotationPoint(52.5F, 1F, -11.5F);

		bodyModel[856].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,2F, 0F, 0F, -2.65F, 0F, 0.36F, -0.05F, 0F, -0.2F, -0.5F, 0F, 0F, 2F, -2F, 0F, -2.65F, -2F, 0.36F, -0.05F, -2F, -0.2F, -0.5F, -2F, 0F); // Box 582
		bodyModel[856].setRotationPoint(57F, 1F, -10F);

		bodyModel[857].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, -0.5F, -0.35F, -2F, -0.5F, -0.6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 934
		bodyModel[857].setRotationPoint(41.5F, -22F, -0.5F);

		bodyModel[858].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, -0.6F, -2F, 0F, -0.7F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -1F); // Box 935
		bodyModel[858].setRotationPoint(41.5F, -22F, 2.5F);

		bodyModel[859].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, -0.7F, -2F, -1F, -0.7F, -2F, 0F, 0F, -0.335F, 0F, 0F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 936
		bodyModel[859].setRotationPoint(41.5F, -22F, 2.5F);

		bodyModel[860].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, -0.335F, 0F, -0.2F, -3.25F, -5F, -0.2F, -3.25F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.2F, 1.25F, -5F, -0.2F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 937
		bodyModel[860].setRotationPoint(41.5F, -22F, 3.5F);

		bodyModel[861].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, -0.335F, 0F, 0.3F, -2F, 0F, -0.2F, -3.25F, 0F, 0F, -0.335F, -5F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.2F, 1.25F, 0F, 0F, 0F, -5F); // Box 938
		bodyModel[861].setRotationPoint(41.5F, -22F, 3.5F);

		bodyModel[862].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, -0.3F, -1.5F, -1F, -0.3F, -1.5F, 0F, 0F, -1.2F, 0F, 0F, 0.25F, 0F, -0.3F, 0.5F, -1F, -0.3F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 939
		bodyModel[862].setRotationPoint(41.5F, -20F, 8.5F);

		bodyModel[863].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, -0.2F, -1.25F, 0F, -0.3F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.3F, 0.5F, 0F, 0F, 0.25F, -1F); // Box 940
		bodyModel[863].setRotationPoint(41.5F, -20F, 8.5F);

		bodyModel[864].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.2F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -1.5F, 0F, -2F, 0F, 0F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -1.5F, 0F, 1F, 0F); // Box 941
		bodyModel[864].setRotationPoint(41.5F, -19F, 9F);

		bodyModel[865].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, 0F, -0.6F, -2F, 0F, -0.35F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 982
		bodyModel[865].setRotationPoint(41.5F, -22F, -2.5F);

		bodyModel[866].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -1F, -0.7F, -2F, 0F, -0.6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.7F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 983
		bodyModel[866].setRotationPoint(41.5F, -22F, -3.5F);

		bodyModel[867].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, -0.335F, 0F, -0.7F, -2F, 0F, -0.7F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -1F, 0F, 0F, 0F); // Box 984
		bodyModel[867].setRotationPoint(41.5F, -22F, -3.5F);

		bodyModel[868].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, -2F, 0F, -0.2F, -3.25F, 0F, -0.2F, -3.25F, -5F, 0F, -0.335F, 0F, 0F, 1.25F, 0F, -0.2F, 1.25F, 0F, -0.2F, 1.25F, -5F, 0F, 0F, 0F); // Box 985
		bodyModel[868].setRotationPoint(41.5F, -22F, -8.5F);

		bodyModel[869].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, -0.335F, -5F, -0.2F, -3.25F, 0F, 0.3F, -2F, 0F, 0F, -0.335F, 0F, 0F, 0F, -5F, -0.2F, 1.25F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 986
		bodyModel[869].setRotationPoint(41.5F, -22F, -8.5F);

		bodyModel[870].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -1.2F, 0F, -0.3F, -1.5F, 0F, -0.3F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, -1F, 0F, 0.25F, 0F); // Box 987
		bodyModel[870].setRotationPoint(41.5F, -20F, -9.5F);

		bodyModel[871].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -1F, -0.3F, -1.5F, 0F, -0.2F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, -0.3F, 0.5F, 0F, -0.2F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 988
		bodyModel[871].setRotationPoint(41.5F, -20F, -9.5F);

		bodyModel[872].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -2F, 0F, -0.3F, -0.5F, -1.5F, -0.3F, -0.5F, -0.5F, 0F, -0.2F, -0.5F, 0F, 1F, 0F, -0.3F, -0.5F, -1.5F, -0.3F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 989
		bodyModel[872].setRotationPoint(41.5F, -19F, -11F);

		bodyModel[873].addBox(0F, 0F, 0F, 1, 14, 10, 0F); // Box 0
		bodyModel[873].setRotationPoint(40.5F, -20F, -5F);

		bodyModel[874].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[874].setRotationPoint(42.5F, -9F, -5F);

		bodyModel[875].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[875].setRotationPoint(36.5F, -2.5F, -9F);

		bodyModel[876].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[876].setRotationPoint(36.5F, -6F, -9F);

		bodyModel[877].addShapeBox(0F, 0F, 0F, 2, 0, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		bodyModel[877].setRotationPoint(38.5F, -4F, -8.5F);

		bodyModel[878].addShapeBox(0F, 0F, 0F, 2, 0, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		bodyModel[878].setRotationPoint(36.5F, -2F, -8.5F);

		bodyModel[879].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 152
		bodyModel[879].setRotationPoint(36.5F, -2.5F, 8.5F);

		bodyModel[880].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 153
		bodyModel[880].setRotationPoint(36.5F, -6F, 8.5F);

		bodyModel[881].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[881].setRotationPoint(36.5F, -2.5F, -5F);

		bodyModel[882].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[882].setRotationPoint(36.5F, -6F, -5F);

		bodyModel[883].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 335
		bodyModel[883].setRotationPoint(36.5F, -2.5F, 4.5F);

		bodyModel[884].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 336
		bodyModel[884].setRotationPoint(36.5F, -6F, 4.5F);

		bodyModel[885].addShapeBox(1F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F); // Rear side door R
		bodyModel[885].setRotationPoint(31.5F, -11F, 10F);

		bodyModel[886].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Rear side door R
		bodyModel[886].setRotationPoint(31.5F, -10.25F, 10F);

		bodyModel[887].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Rear side door R
		bodyModel[887].setRotationPoint(31.5F, -10.25F, 10F);

		bodyModel[888].addShapeBox(1F, 0F, -0.5F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F); // Rear side door L
		bodyModel[888].setRotationPoint(31.5F, -11F, -10F);

		bodyModel[889].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Rear side door L
		bodyModel[889].setRotationPoint(31.5F, -10.25F, -10F);

		bodyModel[890].addShapeBox(3F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Rear side door L
		bodyModel[890].setRotationPoint(31.5F, -10.25F, -10F);

		bodyModel[891].addBox(0F, 0F, 0F, 1, 6, 3, 0F); // Box 638
		bodyModel[891].setRotationPoint(-42.5F, -16F, -5F);

		bodyModel[892].addBox(0F, 0F, 0F, 1, 8, 6, 0F); // Box 638
		bodyModel[892].setRotationPoint(-42.5F, -18F, -1F);

		bodyModel[893].addBox(0F, 0F, 0F, 1, 6, 3, 0F); // Box 1010
		bodyModel[893].setRotationPoint(41.5F, -16F, 2F);

		bodyModel[894].addBox(0F, 0F, 0F, 1, 8, 6, 0F); // Box 1011
		bodyModel[894].setRotationPoint(41.5F, -18F, -5F);

		bodyModel[895].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.835F, 0F, 0F, -0.835F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[895].setRotationPoint(40.5F, -21F, -5F);

		bodyModel[896].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.835F, -0.5F, 0F, -0.835F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 358
		bodyModel[896].setRotationPoint(40.5F, -21F, 2.5F);

		bodyModel[897].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[897].setRotationPoint(36.21F, -12.23F, -1F);
		bodyModel[897].rotateAngleZ = -0.78539816F;

		bodyModel[898].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[898].setRotationPoint(35.5F, -4.75F, 0F);
		bodyModel[898].rotateAngleX = -0.78539816F;

		bodyModel[899].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[899].setRotationPoint(39.5F, -4.25F, 2.8F);
		bodyModel[899].rotateAngleX = -0.78539816F;

		bodyModel[900].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 406
		bodyModel[900].setRotationPoint(38.5F, -5.5F, 0F);

		bodyModel[901].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 407
		bodyModel[901].setRotationPoint(38.5F, -3.5F, -2F);

		bodyModel[902].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[902].setRotationPoint(38.5F, -5.5F, -2F);

		bodyModel[903].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 409
		bodyModel[903].setRotationPoint(38.5F, -4F, 0F);

		bodyModel[904].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[904].setRotationPoint(38.5F, -4.5F, -2F);

		bodyModel[905].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[905].setRotationPoint(38.5F, -5.5F, -1F);

		bodyModel[906].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 942
		bodyModel[906].setRotationPoint(-39.5F, -5.5F, -4F);

		bodyModel[907].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 943
		bodyModel[907].setRotationPoint(-39.5F, -3.5F, -4F);

		bodyModel[908].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 944
		bodyModel[908].setRotationPoint(-39.5F, -5.5F, 1F);

		bodyModel[909].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 945
		bodyModel[909].setRotationPoint(-39.5F, -4F, -4F);

		bodyModel[910].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 946
		bodyModel[910].setRotationPoint(-39.5F, -4.5F, 0F);

		bodyModel[911].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 947
		bodyModel[911].setRotationPoint(-39.5F, -5.5F, 0F);

		bodyModel[912].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[912].setRotationPoint(-38.5F, -4.75F, 0F);
		bodyModel[912].rotateAngleX = -0.78539816F;

		bodyModel[913].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[913].setRotationPoint(-40.5F, -4.25F, -2.8F);
		bodyModel[913].rotateAngleX = -0.78539816F;

		bodyModel[914].addShapeBox(0F, 0F, 0F, 23, 29, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -11F, -16F, 0F, -11F, -16F, 0F, 0F, -16F, 0F); // Box 0
		bodyModel[914].setRotationPoint(3.5F, -14.01F, -11.01F);

		bodyModel[915].addShapeBox(0F, 0F, 0F, 23, 29, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -11F, -16F, 0F, -11F, -16F, 0F, 0F, -16F, 0F); // Box 378
		bodyModel[915].setRotationPoint(3.5F, -14.01F, 11.01F);

		bodyModel[916].addShapeBox(0F, 0F, 0F, 23, 16, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -11F, -8F, 0F, -11F, -8F, 0F, 0F, -8F, 0F); // Box 378
		bodyModel[916].setRotationPoint(3.5F, -14.01F, 11.01F);

		bodyModel[917].addShapeBox(0F, 0F, 0F, 23, 8, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -11F, -5F, 0F, -11F, -5F, 0F, 0F, -5F, 0F); // Box 378
		bodyModel[917].setRotationPoint(3.5F, -4.01F, 11.01F);

		bodyModel[918].addShapeBox(0F, 0F, 0F, 23, 16, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -11F, -8F, 0F, -11F, -8F, 0F, 0F, -8F, 0F); // Box 378
		bodyModel[918].setRotationPoint(-15.5F, -14.01F, 11.01F);

		bodyModel[919].addShapeBox(0F, 0F, 0F, 23, 8, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -11F, -5F, 0F, -11F, -5F, 0F, 0F, -5F, 0F); // Box 378
		bodyModel[919].setRotationPoint(-15.5F, -4.01F, 11.01F);

		bodyModel[920].addShapeBox(0F, 0F, 0F, 23, 16, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -11F, -8F, 0F, -11F, -8F, 0F, 0F, -8F, 0F); // Box 957
		bodyModel[920].setRotationPoint(3.5F, -14.01F, -11.01F);

		bodyModel[921].addShapeBox(0F, 0F, 0F, 23, 8, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -11F, -5F, 0F, -11F, -5F, 0F, 0F, -5F, 0F); // Box 958
		bodyModel[921].setRotationPoint(3.5F, -4.01F, -11.01F);

		bodyModel[922].addShapeBox(0F, 0F, 0F, 23, 16, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -11F, -8F, 0F, -11F, -8F, 0F, 0F, -8F, 0F); // Box 959
		bodyModel[922].setRotationPoint(-15.5F, -14.01F, -11.01F);

		bodyModel[923].addShapeBox(0F, 0F, 0F, 23, 8, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -11F, -5F, 0F, -11F, -5F, 0F, 0F, -5F, 0F); // Box 960
		bodyModel[923].setRotationPoint(-15.5F, -4.01F, -11.01F);

		bodyModel[924].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0.02F, -3F, 0F, 0.02F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.02F, -3F, -3F, 0.02F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 378
		bodyModel[924].setRotationPoint(-19.5F, -14.01F, 10.01F);

		bodyModel[925].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0.02F, -3F, 0F, 0.02F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.02F, -3F, -3F, 0.02F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 378
		bodyModel[925].setRotationPoint(27.5F, -14.01F, 10.01F);

		bodyModel[926].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0.02F, 0F, -3F, 0.02F); // Box 0
		bodyModel[926].setRotationPoint(-21.5F, -14.01F, -11.01F);

		bodyModel[927].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0.02F, 0F, -3F, 0.02F); // Box 0
		bodyModel[927].setRotationPoint(16.5F, -14.01F, -11.01F);

		bodyModel[928].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0.02F, 0F, -3F, 0.02F); // Box 0
		bodyModel[928].setRotationPoint(27.5F, -4.01F, -11.01F);

		bodyModel[929].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0.02F, -3F, 0F, 0.02F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.02F, -3F, -3F, 0.02F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 378
		bodyModel[929].setRotationPoint(-30.5F, -4.01F, 10.01F);

		bodyModel[930].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0.02F, 0F, -3F, 0.02F); // Box 0
		bodyModel[930].setRotationPoint(-30.5F, -4.01F, -11.01F);

		bodyModel[931].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0.02F, -3F, 0F, 0.02F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.02F, -3F, -3F, 0.02F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 378
		bodyModel[931].setRotationPoint(27.5F, -4.01F, 10.01F);

		bodyModel[932].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0.02F, -3F, 0F, 0.02F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.02F, -3F, -3F, 0.02F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 378
		bodyModel[932].setRotationPoint(-39.5F, -4.01F, 10.01F);

		bodyModel[933].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0.02F, 0F, -3F, 0.02F); // Box 0
		bodyModel[933].setRotationPoint(-39.5F, -4.01F, -11.01F);

		bodyModel[934].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0.02F, 0F, -3F, 0.02F); // Box 0
		bodyModel[934].setRotationPoint(36.5F, -4.01F, -11.01F);

		bodyModel[935].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0.02F, -3F, 0F, 0.02F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.02F, -3F, -3F, 0.02F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 378
		bodyModel[935].setRotationPoint(36.5F, -4.01F, 10.01F);

		bodyModel[936].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.415F, -0.175F, 0F, 0.415F, -0.175F, 0F, 0.415F, 0F, 0F, 0.415F, 0F); // Box 938
		bodyModel[936].setRotationPoint(8F, 2F, 8F);

		bodyModel[937].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.01F, 0F, 0.01F, 0.25F, 0F, 0.01F, 0.25F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0.01F, -0.75F, 0F, 0.01F, -0.75F, 0F, 0F, 0.01F, 0F, 0F); // Box 953
		bodyModel[937].setRotationPoint(-35.49F, -11F, -11F);

		bodyModel[938].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0F, -0.75F, 0F, 0F); // Box 953
		bodyModel[938].setRotationPoint(-32.51F, -11F, -11F);

		bodyModel[939].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.01F, 0F, 0.01F, 0.25F, 0F, 0.01F, 0.25F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0.01F, -0.75F, 0F, 0.01F, -0.75F, 0F, 0F, 0.01F, 0F, 0F); // Box 953
		bodyModel[939].setRotationPoint(31.51F, -11F, -11F);

		bodyModel[940].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0F, -0.75F, 0F, 0F); // Box 953
		bodyModel[940].setRotationPoint(34.49F, -11F, -11F);

		bodyModel[941].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.01F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.01F, 0.01F, 0F, 0.01F); // Box 941
		bodyModel[941].setRotationPoint(-35.49F, -11F, 10F);

		bodyModel[942].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0.01F, 0.25F, 0F, 0.01F, -0.75F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0.01F, -0.75F, 0F, 0.01F); // Box 942
		bodyModel[942].setRotationPoint(-32.51F, -11F, 10F);

		bodyModel[943].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.01F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.01F, 0.01F, 0F, 0.01F); // Box 943
		bodyModel[943].setRotationPoint(31.51F, -11F, 10F);

		bodyModel[944].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0.01F, 0.25F, 0F, 0.01F, -0.75F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0.01F, -0.75F, 0F, 0.01F); // Box 944
		bodyModel[944].setRotationPoint(34.49F, -11F, 10F);

		bodyModel[945].addShapeBox(0F, 0F, 0F, 12, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[945].setRotationPoint(5F, 8F, -8F);

		bodyModel[946].addShapeBox(0F, 0F, 0F, 0, 15, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[946].setRotationPoint(-15.51F, -15F, -6F);

		bodyModel[947].addShapeBox(0F, 0F, 0F, 0, 15, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[947].setRotationPoint(15.51F, -15F, -6F);

		bodyModel[948].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0.02F, 0F, -3F, 0.02F); // Box 0
		bodyModel[948].setRotationPoint(-24.5F, -4.01F, -11.01F);

		bodyModel[949].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0.02F, 0F, -3F, 0.02F); // Box 0
		bodyModel[949].setRotationPoint(19.5F, -4.01F, -11.01F);
	}
	ModelAlcoPATruck_new bogie = new ModelAlcoPATruck_new();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
		if (GetColor(entity) == 123456) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/Alco_PA_truck_new_silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-2.15F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4.3F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}else if (GetColor(entity) == 0) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/Alco_PA_truck_new_CNJ_blue.png"));
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