//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GP30
// Model Creator: Cubed64 & Bidahochi
// Created on: 07.03.2023 - 22:40:51
// Last changed on: 07.03.2023 - 22:40:51

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
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

public class ModelGP30new extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGP30new() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[530];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 51, 173, textureX, textureY); // box64
		bodyModel[1] = new ModelRendererTurbo(this, 72, 173, textureX, textureY); // box65
		bodyModel[2] = new ModelRendererTurbo(this, 241, 110, textureX, textureY); // Box 45
		bodyModel[3] = new ModelRendererTurbo(this, 14, 30, textureX, textureY, "lamp"); // Box 186 headlight front cab
		bodyModel[4] = new ModelRendererTurbo(this, 21, 30, textureX, textureY, "lamp"); // Box 187 headlight front cab
		bodyModel[5] = new ModelRendererTurbo(this, 184, 97, textureX, textureY); // Box 201
		bodyModel[6] = new ModelRendererTurbo(this, 29, 49, textureX, textureY); // Box 314 door swing right rear
		bodyModel[7] = new ModelRendererTurbo(this, 49, 78, textureX, textureY); // Box 315 door swing right front
		bodyModel[8] = new ModelRendererTurbo(this, 279, 23, textureX, textureY); // Box 392
		bodyModel[9] = new ModelRendererTurbo(this, 219, 1, textureX, textureY); // Box 394
		bodyModel[10] = new ModelRendererTurbo(this, 328, 24, textureX, textureY); // Box 107
		bodyModel[11] = new ModelRendererTurbo(this, 295, 26, textureX, textureY); // Box 110
		bodyModel[12] = new ModelRendererTurbo(this, 264, 27, textureX, textureY); // Box 111
		bodyModel[13] = new ModelRendererTurbo(this, 302, 56, textureX, textureY); // Box 112
		bodyModel[14] = new ModelRendererTurbo(this, 328, 28, textureX, textureY); // Box 113
		bodyModel[15] = new ModelRendererTurbo(this, 280, 15, textureX, textureY); // Box 265
		bodyModel[16] = new ModelRendererTurbo(this, 328, 32, textureX, textureY); // Box 113
		bodyModel[17] = new ModelRendererTurbo(this, 2, 52, textureX, textureY); // Box 9
		bodyModel[18] = new ModelRendererTurbo(this, 74, 52, textureX, textureY); // Box 10
		bodyModel[19] = new ModelRendererTurbo(this, 15, 75, textureX, textureY); // Box 15
		bodyModel[20] = new ModelRendererTurbo(this, 12, 36, textureX, textureY); // Box 48
		bodyModel[21] = new ModelRendererTurbo(this, 17, 38, textureX, textureY); // Box 43
		bodyModel[22] = new ModelRendererTurbo(this, 74, 71, textureX, textureY); // Box 338
		bodyModel[23] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 51
		bodyModel[24] = new ModelRendererTurbo(this, 18, 21, textureX, textureY); // Box 121
		bodyModel[25] = new ModelRendererTurbo(this, 46, 49, textureX, textureY); // Box 142
		bodyModel[26] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 153
		bodyModel[27] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 284
		bodyModel[28] = new ModelRendererTurbo(this, 32, 75, textureX, textureY); // Box 15
		bodyModel[29] = new ModelRendererTurbo(this, 56, 25, textureX, textureY); // Box 426
		bodyModel[30] = new ModelRendererTurbo(this, 65, 7, textureX, textureY); // Box 152
		bodyModel[31] = new ModelRendererTurbo(this, 13, 21, textureX, textureY); // Box 335
		bodyModel[32] = new ModelRendererTurbo(this, 30, 21, textureX, textureY); // Box 336
		bodyModel[33] = new ModelRendererTurbo(this, 443, 5, textureX, textureY); // Box 276
		bodyModel[34] = new ModelRendererTurbo(this, 401, 5, textureX, textureY); // Box 277
		bodyModel[35] = new ModelRendererTurbo(this, 457, 54, textureX, textureY); // Box 297 rear radiator
		bodyModel[36] = new ModelRendererTurbo(this, 457, 43, textureX, textureY); // Box 272 rear radiator
		bodyModel[37] = new ModelRendererTurbo(this, 457, 43, textureX, textureY); // Box 514 rear radiator
		bodyModel[38] = new ModelRendererTurbo(this, 457, 54, textureX, textureY); // Box 515 rear radiator
		bodyModel[39] = new ModelRendererTurbo(this, 461, 84, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 487, 84, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 491, 76, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[42] = new ModelRendererTurbo(this, 491, 76, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[43] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 71 markerlight rear low
		bodyModel[44] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 1208 makrerlight rear low
		bodyModel[45] = new ModelRendererTurbo(this, 454, 84, textureX, textureY, "lamp"); // Box 71 markerlight rear high
		bodyModel[46] = new ModelRendererTurbo(this, 454, 84, textureX, textureY, "lamp"); // Box 1208 makrerlight rear high
		bodyModel[47] = new ModelRendererTurbo(this, 331, 29, textureX, textureY); // Box 19 the hooh
		bodyModel[48] = new ModelRendererTurbo(this, 295, 153, textureX, textureY); // Box 36
		bodyModel[49] = new ModelRendererTurbo(this, 141, 108, textureX, textureY); // Box 352
		bodyModel[50] = new ModelRendererTurbo(this, 143, 99, textureX, textureY); // Box 353
		bodyModel[51] = new ModelRendererTurbo(this, 120, 99, textureX, textureY); // Box 354
		bodyModel[52] = new ModelRendererTurbo(this, 120, 89, textureX, textureY); // Box 356
		bodyModel[53] = new ModelRendererTurbo(this, 143, 89, textureX, textureY); // Box 357
		bodyModel[54] = new ModelRendererTurbo(this, 120, 108, textureX, textureY); // Box 355
		bodyModel[55] = new ModelRendererTurbo(this, 136, 108, textureX, textureY); // Box 296 nose cover
		bodyModel[56] = new ModelRendererTurbo(this, 143, 108, textureX, textureY); // Box 299 nose cover
		bodyModel[57] = new ModelRendererTurbo(this, 198, 91, textureX, textureY); // Box 43
		bodyModel[58] = new ModelRendererTurbo(this, 199, 94, textureX, textureY); // Box 43
		bodyModel[59] = new ModelRendererTurbo(this, 167, 86, textureX, textureY); // Box 48 noselight backbit
		bodyModel[60] = new ModelRendererTurbo(this, 228, 93, textureX, textureY); // Box 1251 sandcap
		bodyModel[61] = new ModelRendererTurbo(this, 287, 106, textureX, textureY); // Box 0
		bodyModel[62] = new ModelRendererTurbo(this, 287, 85, textureX, textureY); // Box 112
		bodyModel[63] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // Box 4
		bodyModel[64] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[65] = new ModelRendererTurbo(this, 2, 7, textureX, textureY); // Box 5
		bodyModel[66] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[67] = new ModelRendererTurbo(this, 308, 209, textureX, textureY); // Box 3
		bodyModel[68] = new ModelRendererTurbo(this, 306, 215, textureX, textureY); // Box 207
		bodyModel[69] = new ModelRendererTurbo(this, 310, 221, textureX, textureY); // Box 225
		bodyModel[70] = new ModelRendererTurbo(this, 14, 125, textureX, textureY); // Box 3
		bodyModel[71] = new ModelRendererTurbo(this, 16, 137, textureX, textureY); // Box 226
		bodyModel[72] = new ModelRendererTurbo(this, 12, 131, textureX, textureY); // Box 227
		bodyModel[73] = new ModelRendererTurbo(this, 1, 30, textureX, textureY, "lamp"); // Box 117 numberboard front
		bodyModel[74] = new ModelRendererTurbo(this, 1, 30, textureX, textureY, "lamp"); // Box 118 numberboard front
		bodyModel[75] = new ModelRendererTurbo(this, 270, 92, textureX, textureY); // Box 23
		bodyModel[76] = new ModelRendererTurbo(this, 266, 107, textureX, textureY); // Box 163
		bodyModel[77] = new ModelRendererTurbo(this, 266, 107, textureX, textureY); // Box 166
		bodyModel[78] = new ModelRendererTurbo(this, 265, 123, textureX, textureY); // Box 63
		bodyModel[79] = new ModelRendererTurbo(this, 285, 114, textureX, textureY); // Box 129
		bodyModel[80] = new ModelRendererTurbo(this, 300, 114, textureX, textureY); // Box 130
		bodyModel[81] = new ModelRendererTurbo(this, 282, 114, textureX, textureY); // Box 133
		bodyModel[82] = new ModelRendererTurbo(this, 297, 114, textureX, textureY); // Box 134
		bodyModel[83] = new ModelRendererTurbo(this, 428, 65, textureX, textureY); // Box 192
		bodyModel[84] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 193
		bodyModel[85] = new ModelRendererTurbo(this, 443, 65, textureX, textureY); // Box 194
		bodyModel[86] = new ModelRendererTurbo(this, 440, 65, textureX, textureY); // Box 195
		bodyModel[87] = new ModelRendererTurbo(this, 264, 113, textureX, textureY); // Box 4
		bodyModel[88] = new ModelRendererTurbo(this, 403, 114, textureX, textureY); // Box 203
		bodyModel[89] = new ModelRendererTurbo(this, 219, 228, textureX, textureY); // Box 60
		bodyModel[90] = new ModelRendererTurbo(this, 252, 233, textureX, textureY); // Box 61
		bodyModel[91] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Box 62
		bodyModel[92] = new ModelRendererTurbo(this, 230, 233, textureX, textureY); // Box 63
		bodyModel[93] = new ModelRendererTurbo(this, 219, 233, textureX, textureY); // Box 64
		bodyModel[94] = new ModelRendererTurbo(this, 219, 224, textureX, textureY); // Box 72
		bodyModel[95] = new ModelRendererTurbo(this, 363, 114, textureX, textureY); // Box 113
		bodyModel[96] = new ModelRendererTurbo(this, 360, 114, textureX, textureY); // Box 197
		bodyModel[97] = new ModelRendererTurbo(this, 363, 114, textureX, textureY); // Box 493
		bodyModel[98] = new ModelRendererTurbo(this, 357, 114, textureX, textureY); // Box 494
		bodyModel[99] = new ModelRendererTurbo(this, 312, 114, textureX, textureY); // Box 495
		bodyModel[100] = new ModelRendererTurbo(this, 360, 114, textureX, textureY); // Box 496
		bodyModel[101] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 493
		bodyModel[102] = new ModelRendererTurbo(this, 79, 139, textureX, textureY); // Box 494
		bodyModel[103] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 495
		bodyModel[104] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 496
		bodyModel[105] = new ModelRendererTurbo(this, 55, 160, textureX, textureY); // Box 497
		bodyModel[106] = new ModelRendererTurbo(this, 55, 151, textureX, textureY); // Box 498
		bodyModel[107] = new ModelRendererTurbo(this, 55, 144, textureX, textureY); // Box 499
		bodyModel[108] = new ModelRendererTurbo(this, 78, 133, textureX, textureY); // Box 500
		bodyModel[109] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 501
		bodyModel[110] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 502
		bodyModel[111] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 503
		bodyModel[112] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 504
		bodyModel[113] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 505
		bodyModel[114] = new ModelRendererTurbo(this, 69, 133, textureX, textureY); // Box 506
		bodyModel[115] = new ModelRendererTurbo(this, 1, 144, textureX, textureY); // Box 507
		bodyModel[116] = new ModelRendererTurbo(this, 1, 151, textureX, textureY); // Box 508
		bodyModel[117] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 509
		bodyModel[118] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 510
		bodyModel[119] = new ModelRendererTurbo(this, 349, 235, textureX, textureY); // Box 164
		bodyModel[120] = new ModelRendererTurbo(this, 295, 235, textureX, textureY); // Box 259
		bodyModel[121] = new ModelRendererTurbo(this, 349, 244, textureX, textureY); // Box 264
		bodyModel[122] = new ModelRendererTurbo(this, 295, 244, textureX, textureY); // Box 265
		bodyModel[123] = new ModelRendererTurbo(this, 79, 139, textureX, textureY); // Box 541
		bodyModel[124] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 542
		bodyModel[125] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 543
		bodyModel[126] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 544
		bodyModel[127] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 545
		bodyModel[128] = new ModelRendererTurbo(this, 78, 133, textureX, textureY); // Box 546
		bodyModel[129] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 553
		bodyModel[130] = new ModelRendererTurbo(this, 69, 133, textureX, textureY); // Box 554
		bodyModel[131] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 555
		bodyModel[132] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 556
		bodyModel[133] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 557
		bodyModel[134] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 558
		bodyModel[135] = new ModelRendererTurbo(this, 349, 228, textureX, textureY); // Box 261
		bodyModel[136] = new ModelRendererTurbo(this, 295, 228, textureX, textureY); // Box 262
		bodyModel[137] = new ModelRendererTurbo(this, 162, 90, textureX, textureY); // Box 279
		bodyModel[138] = new ModelRendererTurbo(this, 357, 114, textureX, textureY); // Box 280
		bodyModel[139] = new ModelRendererTurbo(this, 312, 114, textureX, textureY); // Box 281
		bodyModel[140] = new ModelRendererTurbo(this, 376, 5, textureX, textureY); // Box 288 she phinneas on my ferb till i https://youtu.be/gRus9T8wNBA
		bodyModel[141] = new ModelRendererTurbo(this, 342, 1, textureX, textureY); // Box 275
		bodyModel[142] = new ModelRendererTurbo(this, 29, 68, textureX, textureY); // Box 290
		bodyModel[143] = new ModelRendererTurbo(this, 54, 126, textureX, textureY); // Box 176
		bodyModel[144] = new ModelRendererTurbo(this, 57, 125, textureX, textureY); // Box 177
		bodyModel[145] = new ModelRendererTurbo(this, 95, 125, textureX, textureY); // Box 258
		bodyModel[146] = new ModelRendererTurbo(this, 65, 127, textureX, textureY); // Box 81
		bodyModel[147] = new ModelRendererTurbo(this, 62, 128, textureX, textureY); // Box 81
		bodyModel[148] = new ModelRendererTurbo(this, 95, 136, textureX, textureY); // Box 293
		bodyModel[149] = new ModelRendererTurbo(this, 49, 136, textureX, textureY); // Box 143
		bodyModel[150] = new ModelRendererTurbo(this, 14, 137, textureX, textureY); // Box 61
		bodyModel[151] = new ModelRendererTurbo(this, 52, 137, textureX, textureY); // Box 63
		bodyModel[152] = new ModelRendererTurbo(this, 39, 132, textureX, textureY); // Box 80
		bodyModel[153] = new ModelRendererTurbo(this, 44, 134, textureX, textureY); // Box 144
		bodyModel[154] = new ModelRendererTurbo(this, 26, 128, textureX, textureY); // Box 145
		bodyModel[155] = new ModelRendererTurbo(this, 20, 134, textureX, textureY); // Box 148
		bodyModel[156] = new ModelRendererTurbo(this, 44, 133, textureX, textureY); // Box 363
		bodyModel[157] = new ModelRendererTurbo(this, 22, 133, textureX, textureY); // Box 870
		bodyModel[158] = new ModelRendererTurbo(this, 17, 136, textureX, textureY); // Box 559
		bodyModel[159] = new ModelRendererTurbo(this, 25, 132, textureX, textureY); // Box 147
		bodyModel[160] = new ModelRendererTurbo(this, 112, 136, textureX, textureY); // Box 176
		bodyModel[161] = new ModelRendererTurbo(this, 127, 145, textureX, textureY); // Box 315
		bodyModel[162] = new ModelRendererTurbo(this, 177, 136, textureX, textureY); // Box 316
		bodyModel[163] = new ModelRendererTurbo(this, 117, 145, textureX, textureY); // Box 313
		bodyModel[164] = new ModelRendererTurbo(this, 112, 125, textureX, textureY); // Box 316
		bodyModel[165] = new ModelRendererTurbo(this, 117, 134, textureX, textureY); // Box 317
		bodyModel[166] = new ModelRendererTurbo(this, 177, 125, textureX, textureY); // Box 318
		bodyModel[167] = new ModelRendererTurbo(this, 112, 134, textureX, textureY); // Box 319
		bodyModel[168] = new ModelRendererTurbo(this, 199, 176, textureX, textureY); // Box 489
		bodyModel[169] = new ModelRendererTurbo(this, 262, 213, textureX, textureY); // Box 281
		bodyModel[170] = new ModelRendererTurbo(this, 262, 164, textureX, textureY); // Box 315
		bodyModel[171] = new ModelRendererTurbo(this, 262, 207, textureX, textureY); // Box 316
		bodyModel[172] = new ModelRendererTurbo(this, 205, 158, textureX, textureY); // Box 559
		bodyModel[173] = new ModelRendererTurbo(this, 320, 139, textureX, textureY); // Box 562
		bodyModel[174] = new ModelRendererTurbo(this, 320, 144, textureX, textureY); // Box 563
		bodyModel[175] = new ModelRendererTurbo(this, 351, 139, textureX, textureY, "cull"); // Box 523 pipework cull
		bodyModel[176] = new ModelRendererTurbo(this, 351, 139, textureX, textureY, "cull"); // Box 524 pipework cull
		bodyModel[177] = new ModelRendererTurbo(this, 262, 169, textureX, textureY); // Box 278
		bodyModel[178] = new ModelRendererTurbo(this, 191, 92, textureX, textureY, "cull"); // Box cull
		bodyModel[179] = new ModelRendererTurbo(this, 203, 201, textureX, textureY); // Box 288
		bodyModel[180] = new ModelRendererTurbo(this, 304, 19, textureX, textureY); // Box 348
		bodyModel[181] = new ModelRendererTurbo(this, 327, 19, textureX, textureY); // Box 349
		bodyModel[182] = new ModelRendererTurbo(this, 279, 5, textureX, textureY); // Box 350
		bodyModel[183] = new ModelRendererTurbo(this, 328, 6, textureX, textureY); // Box 351
		bodyModel[184] = new ModelRendererTurbo(this, 295, 8, textureX, textureY); // Box 352
		bodyModel[185] = new ModelRendererTurbo(this, 264, 9, textureX, textureY); // Box 353
		bodyModel[186] = new ModelRendererTurbo(this, 328, 10, textureX, textureY); // Box 354
		bodyModel[187] = new ModelRendererTurbo(this, 328, 14, textureX, textureY); // Box 355
		bodyModel[188] = new ModelRendererTurbo(this, 304, 1, textureX, textureY); // Box 356
		bodyModel[189] = new ModelRendererTurbo(this, 327, 1, textureX, textureY); // Box 357
		bodyModel[190] = new ModelRendererTurbo(this, 169, 99, textureX, textureY, "lamp"); // Box 548 headlight nose low b
		bodyModel[191] = new ModelRendererTurbo(this, 169, 94, textureX, textureY, "lamp"); // Box 547 headlight nose low a
		bodyModel[192] = new ModelRendererTurbo(this, 162, 94, textureX, textureY, "lamp"); // Box 546 headlight nose high a
		bodyModel[193] = new ModelRendererTurbo(this, 162, 99, textureX, textureY, "lamp"); // Box 545 headlight nose high b
		bodyModel[194] = new ModelRendererTurbo(this, 36, 129, textureX, textureY); // Box 304
		bodyModel[195] = new ModelRendererTurbo(this, 23, 122, textureX, textureY); // Box 303
		bodyModel[196] = new ModelRendererTurbo(this, 28, 129, textureX, textureY); // Box 302
		bodyModel[197] = new ModelRendererTurbo(this, 343, 220, textureX, textureY); // Box 561
		bodyModel[198] = new ModelRendererTurbo(this, 311, 220, textureX, textureY); // Box 560
		bodyModel[199] = new ModelRendererTurbo(this, 338, 217, textureX, textureY); // Box 872
		bodyModel[200] = new ModelRendererTurbo(this, 316, 217, textureX, textureY); // Box 871
		bodyModel[201] = new ModelRendererTurbo(this, 322, 213, textureX, textureY); // Box 301
		bodyModel[202] = new ModelRendererTurbo(this, 333, 216, textureX, textureY); // Box 206
		bodyModel[203] = new ModelRendererTurbo(this, 330, 213, textureX, textureY); // Box 204
		bodyModel[204] = new ModelRendererTurbo(this, 317, 206, textureX, textureY); // Box 202
		bodyModel[205] = new ModelRendererTurbo(this, 319, 216, textureX, textureY); // Box 236
		bodyModel[206] = new ModelRendererTurbo(this, 320, 212, textureX, textureY); // Box 234
		bodyModel[207] = new ModelRendererTurbo(this, 314, 218, textureX, textureY); // Box 81
		bodyModel[208] = new ModelRendererTurbo(this, 338, 218, textureX, textureY); // Box 80
		bodyModel[209] = new ModelRendererTurbo(this, 346, 221, textureX, textureY); // Box 63
		bodyModel[210] = new ModelRendererTurbo(this, 308, 222, textureX, textureY); // Box 61
		bodyModel[211] = new ModelRendererTurbo(this, 336, 200, textureX, textureY); // Box 250
		bodyModel[212] = new ModelRendererTurbo(this, 341, 201, textureX, textureY); // Box 249
		bodyModel[213] = new ModelRendererTurbo(this, 349, 201, textureX, textureY); // Box 244
		bodyModel[214] = new ModelRendererTurbo(this, 344, 200, textureX, textureY); // Box 243
		bodyModel[215] = new ModelRendererTurbo(this, 242, 97, textureX, textureY); // Box 36 cr society square
		bodyModel[216] = new ModelRendererTurbo(this, 304, 51, textureX, textureY); // Box 272 your either HI or KCS to use this
		bodyModel[217] = new ModelRendererTurbo(this, 28, 182, textureX, textureY); // Box 527 cab backpannel
		bodyModel[218] = new ModelRendererTurbo(this, 76, 35, textureX, textureY); // Box 386
		bodyModel[219] = new ModelRendererTurbo(this, 76, 31, textureX, textureY); // Box 387
		bodyModel[220] = new ModelRendererTurbo(this, 33, 31, textureX, textureY); // Box 388 remove this for gp30u
		bodyModel[221] = new ModelRendererTurbo(this, 1, 38, textureX, textureY); // Box 390
		bodyModel[222] = new ModelRendererTurbo(this, 74, 68, textureX, textureY); // Box 392
		bodyModel[223] = new ModelRendererTurbo(this, 72, 47, textureX, textureY); // Box 393
		bodyModel[224] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 394
		bodyModel[225] = new ModelRendererTurbo(this, 46, 76, textureX, textureY); // Box 395 door swing right front top
		bodyModel[226] = new ModelRendererTurbo(this, 56, 76, textureX, textureY); // Box 397 door swing right front top
		bodyModel[227] = new ModelRendererTurbo(this, 2, 71, textureX, textureY); // Box 398
		bodyModel[228] = new ModelRendererTurbo(this, 2, 68, textureX, textureY); // Box 399
		bodyModel[229] = new ModelRendererTurbo(this, 73, 42, textureX, textureY); // Box 400
		bodyModel[230] = new ModelRendererTurbo(this, 11, 76, textureX, textureY); // Box 401
		bodyModel[231] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 402
		bodyModel[232] = new ModelRendererTurbo(this, 36, 47, textureX, textureY); // Box 403 door swing right rear top
		bodyModel[233] = new ModelRendererTurbo(this, 26, 47, textureX, textureY); // Box 404 door swing right rear top
		bodyModel[234] = new ModelRendererTurbo(this, 43, 47, textureX, textureY); // Box 405
		bodyModel[235] = new ModelRendererTurbo(this, 53, 47, textureX, textureY); // Box 406
		bodyModel[236] = new ModelRendererTurbo(this, 2, 242, textureX, textureY); // Box 282
		bodyModel[237] = new ModelRendererTurbo(this, 51, 242, textureX, textureY); // Box 283
		bodyModel[238] = new ModelRendererTurbo(this, 15, 240, textureX, textureY); // Box 4
		bodyModel[239] = new ModelRendererTurbo(this, 28, 239, textureX, textureY); // Box 448
		bodyModel[240] = new ModelRendererTurbo(this, 64, 240, textureX, textureY); // Box 322
		bodyModel[241] = new ModelRendererTurbo(this, 77, 239, textureX, textureY); // Box 323
		bodyModel[242] = new ModelRendererTurbo(this, 39, 237, textureX, textureY); // Box 280
		bodyModel[243] = new ModelRendererTurbo(this, 88, 237, textureX, textureY); // Box 285
		bodyModel[244] = new ModelRendererTurbo(this, 199, 223, textureX, textureY); // Box 490
		bodyModel[245] = new ModelRendererTurbo(this, 206, 229, textureX, textureY); // Box 329
		bodyModel[246] = new ModelRendererTurbo(this, 207, 226, textureX, textureY); // Box 330
		bodyModel[247] = new ModelRendererTurbo(this, 199, 226, textureX, textureY); // Box 506
		bodyModel[248] = new ModelRendererTurbo(this, 199, 229, textureX, textureY); // Box 507
		bodyModel[249] = new ModelRendererTurbo(this, 207, 223, textureX, textureY); // Box 508
		bodyModel[250] = new ModelRendererTurbo(this, 203, 91, textureX, textureY, "lamp"); // Box 71 markerlight nose
		bodyModel[251] = new ModelRendererTurbo(this, 203, 91, textureX, textureY, "lamp"); // Box 1208 makrerlight nose
		bodyModel[252] = new ModelRendererTurbo(this, 478, 84, textureX, textureY); // Box 31 rear headlight mount
		bodyModel[253] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 247 headlight rear 2 beam
		bodyModel[254] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 248 headlight rear 2 beam
		bodyModel[255] = new ModelRendererTurbo(this, 68, 156, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[256] = new ModelRendererTurbo(this, 68, 150, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[257] = new ModelRendererTurbo(this, 362, 240, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[258] = new ModelRendererTurbo(this, 362, 234, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[259] = new ModelRendererTurbo(this, 385, 18, textureX, textureY); // Box 274 exhausting
		bodyModel[260] = new ModelRendererTurbo(this, 396, 241, textureX, textureY); // Box 509
		bodyModel[261] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Box 510
		bodyModel[262] = new ModelRendererTurbo(this, 382, 239, textureX, textureY); // Box 515
		bodyModel[263] = new ModelRendererTurbo(this, 409, 239, textureX, textureY); // Box 516
		bodyModel[264] = new ModelRendererTurbo(this, 265, 224, textureX, textureY); // Box 19 front fuel fill
		bodyModel[265] = new ModelRendererTurbo(this, 265, 224, textureX, textureY); // Box 19 front fuel fill
		bodyModel[266] = new ModelRendererTurbo(this, 249, 63, textureX, textureY); // Box 203
		bodyModel[267] = new ModelRendererTurbo(this, 258, 63, textureX, textureY); // Box 204
		bodyModel[268] = new ModelRendererTurbo(this, 241, 51, textureX, textureY); // Box 205
		bodyModel[269] = new ModelRendererTurbo(this, 232, 51, textureX, textureY); // Box 206
		bodyModel[270] = new ModelRendererTurbo(this, 279, 79, textureX, textureY); // Box 364 prime base
		bodyModel[271] = new ModelRendererTurbo(this, 279, 75, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[272] = new ModelRendererTurbo(this, 279, 75, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[273] = new ModelRendererTurbo(this, 279, 75, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[274] = new ModelRendererTurbo(this, 279, 75, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[275] = new ModelRendererTurbo(this, 35, 157, textureX, textureY); // Box 188
		bodyModel[276] = new ModelRendererTurbo(this, 42, 157, textureX, textureY); // Box 190 mu plug
		bodyModel[277] = new ModelRendererTurbo(this, 42, 162, textureX, textureY); // Box 190 mu plug
		bodyModel[278] = new ModelRendererTurbo(this, 27, 157, textureX, textureY); // Box 188
		bodyModel[279] = new ModelRendererTurbo(this, 20, 157, textureX, textureY); // Box 190 mu plug
		bodyModel[280] = new ModelRendererTurbo(this, 20, 162, textureX, textureY); // Box 190 mu plug
		bodyModel[281] = new ModelRendererTurbo(this, 35, 167, textureX, textureY); // Box 396
		bodyModel[282] = new ModelRendererTurbo(this, 27, 167, textureX, textureY); // Box 397
		bodyModel[283] = new ModelRendererTurbo(this, 42, 167, textureX, textureY); // Box 398 mu plug
		bodyModel[284] = new ModelRendererTurbo(this, 20, 167, textureX, textureY); // Box 399 mu plug
		bodyModel[285] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 188
		bodyModel[286] = new ModelRendererTurbo(this, 314, 241, textureX, textureY); // Box 190 mu plug
		bodyModel[287] = new ModelRendererTurbo(this, 314, 246, textureX, textureY); // Box 190 mu plug
		bodyModel[288] = new ModelRendererTurbo(this, 330, 241, textureX, textureY); // Box 188
		bodyModel[289] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Box 190 mu plug
		bodyModel[290] = new ModelRendererTurbo(this, 337, 246, textureX, textureY); // Box 190 mu plug
		bodyModel[291] = new ModelRendererTurbo(this, 321, 251, textureX, textureY); // Box 392
		bodyModel[292] = new ModelRendererTurbo(this, 330, 251, textureX, textureY); // Box 393
		bodyModel[293] = new ModelRendererTurbo(this, 314, 251, textureX, textureY); // Box 394 mu plug
		bodyModel[294] = new ModelRendererTurbo(this, 337, 251, textureX, textureY); // Box 395 mu plug
		bodyModel[295] = new ModelRendererTurbo(this, 441, 32, textureX, textureY, "cull"); // Box 196 winterization hatch
		bodyModel[296] = new ModelRendererTurbo(this, 244, 105, textureX, textureY); // Box 44
		bodyModel[297] = new ModelRendererTurbo(this, 242, 105, textureX, textureY); // Box 178
		bodyModel[298] = new ModelRendererTurbo(this, 245, 105, textureX, textureY); // Box 516
		bodyModel[299] = new ModelRendererTurbo(this, 252, 114, textureX, textureY); // Box 517
		bodyModel[300] = new ModelRendererTurbo(this, 6, 182, textureX, textureY); // Box 412 cs
		bodyModel[301] = new ModelRendererTurbo(this, 20, 182, textureX, textureY); // Box 413 cs
		bodyModel[302] = new ModelRendererTurbo(this, 6, 174, textureX, textureY); // Box 86 cs
		bodyModel[303] = new ModelRendererTurbo(this, 1, 195, textureX, textureY); // Box 531 cs
		bodyModel[304] = new ModelRendererTurbo(this, 306, 48, textureX, textureY); // Box 78 bell normal
		bodyModel[305] = new ModelRendererTurbo(this, 306, 45, textureX, textureY); // Box 74 bell normal
		bodyModel[306] = new ModelRendererTurbo(this, 306, 45, textureX, textureY); // Box 114 bell normal
		bodyModel[307] = new ModelRendererTurbo(this, 480, 80, textureX, textureY); // Box 351 sandcap
		bodyModel[308] = new ModelRendererTurbo(this, 215, 22, textureX, textureY); // Box 352 ane lightbox holder
		bodyModel[309] = new ModelRendererTurbo(this, 224, 21, textureX, textureY, "lamp"); // Box 353 ane highbeam f
		bodyModel[310] = new ModelRendererTurbo(this, 212, 21, textureX, textureY, "lamp"); // Box 354 ane highbeam f
		bodyModel[311] = new ModelRendererTurbo(this, 289, 79, textureX, textureY); // Box 364 prime base
		bodyModel[312] = new ModelRendererTurbo(this, 289, 75, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[313] = new ModelRendererTurbo(this, 289, 75, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[314] = new ModelRendererTurbo(this, 289, 75, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[315] = new ModelRendererTurbo(this, 289, 75, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[316] = new ModelRendererTurbo(this, 396, 21, textureX, textureY); // Box 274 exhausting TWO
		bodyModel[317] = new ModelRendererTurbo(this, 247, 21, textureX, textureY); // Box 522 additional horn
		bodyModel[318] = new ModelRendererTurbo(this, 256, 24, textureX, textureY); // Box 523 additional horn
		bodyModel[319] = new ModelRendererTurbo(this, 247, 24, textureX, textureY); // Box 524 additional horn
		bodyModel[320] = new ModelRendererTurbo(this, 247, 27, textureX, textureY); // Box 525 additional horn
		bodyModel[321] = new ModelRendererTurbo(this, 255, 112, textureX, textureY); // Box 635 locomotive plate
		bodyModel[322] = new ModelRendererTurbo(this, 255, 112, textureX, textureY); // Box 636 locomotive plate
		bodyModel[323] = new ModelRendererTurbo(this, 144, 172, textureX, textureY); // Box 489 small tank
		bodyModel[324] = new ModelRendererTurbo(this, 125, 164, textureX, textureY); // Box 278 small tank
		bodyModel[325] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Box 281 small tank
		bodyModel[326] = new ModelRendererTurbo(this, 148, 197, textureX, textureY); // Box 288 small tank
		bodyModel[327] = new ModelRendererTurbo(this, 125, 158, textureX, textureY); // Box 315 small tank
		bodyModel[328] = new ModelRendererTurbo(this, 129, 203, textureX, textureY); // Box 316 small tank
		bodyModel[329] = new ModelRendererTurbo(this, 152, 156, textureX, textureY); // Box 559 small tank
		bodyModel[330] = new ModelRendererTurbo(this, 1, 99, textureX, textureY); // Box 332 atsf gp30u window segment
		bodyModel[331] = new ModelRendererTurbo(this, 158, 78, textureX, textureY, "lamp"); // Box 314 headlight sp front b
		bodyModel[332] = new ModelRendererTurbo(this, 158, 78, textureX, textureY, "lamp"); // Box 315 headlight sp front a
		bodyModel[333] = new ModelRendererTurbo(this, 158, 83, textureX, textureY, "lamp"); // Box 316 nose gyra sp
		bodyModel[334] = new ModelRendererTurbo(this, 156, 88, textureX, textureY); // Box 317 sp lightkit mount front gyra bloc
		bodyModel[335] = new ModelRendererTurbo(this, 145, 82, textureX, textureY); // Box 20 sp lightkit mount front noselight bloc
		bodyModel[336] = new ModelRendererTurbo(this, 237, 93, textureX, textureY); // Box 344 sandcap if your sp
		bodyModel[337] = new ModelRendererTurbo(this, 176, 84, textureX, textureY, "cull"); // Box 345 cull? sp nose gyra cope triangle
		bodyModel[338] = new ModelRendererTurbo(this, 283, 63, textureX, textureY); // Box 346
		bodyModel[339] = new ModelRendererTurbo(this, 283, 63, textureX, textureY); // Box 347
		bodyModel[340] = new ModelRendererTurbo(this, 283, 66, textureX, textureY); // Box 348
		bodyModel[341] = new ModelRendererTurbo(this, 288, 59, textureX, textureY); // Box 349 ssw bell holdy
		bodyModel[342] = new ModelRendererTurbo(this, 231, 21, textureX, textureY); // Box 350
		bodyModel[343] = new ModelRendererTurbo(this, 240, 24, textureX, textureY); // Box 351
		bodyModel[344] = new ModelRendererTurbo(this, 231, 27, textureX, textureY); // Box 352
		bodyModel[345] = new ModelRendererTurbo(this, 231, 24, textureX, textureY); // Box 353
		bodyModel[346] = new ModelRendererTurbo(this, 374, 21, textureX, textureY); // Box 354 EXHAUSTING 3
		bodyModel[347] = new ModelRendererTurbo(this, 246, 93, textureX, textureY); // Box 355 ssw shidder vent
		bodyModel[348] = new ModelRendererTurbo(this, -17, 229, textureX, textureY); // Box 50
		bodyModel[349] = new ModelRendererTurbo(this, 11, 229, textureX, textureY, "cull"); // Box 456 cull mu receptical
		bodyModel[350] = new ModelRendererTurbo(this, 343, 212, textureX, textureY); // Box 475
		bodyModel[351] = new ModelRendererTurbo(this, 371, 213, textureX, textureY, "cull"); // Box 476 cull mu receptical
		bodyModel[352] = new ModelRendererTurbo(this, 232, 81, textureX, textureY); // Box 360
		bodyModel[353] = new ModelRendererTurbo(this, 11, 219, textureX, textureY, "cull"); // Box 456 cull mu receptical
		bodyModel[354] = new ModelRendererTurbo(this, 371, 223, textureX, textureY, "cull"); // Box 476 cull mu receptical
		bodyModel[355] = new ModelRendererTurbo(this, 251, 83, textureX, textureY); // Box 409 commander base
		bodyModel[356] = new ModelRendererTurbo(this, 251, 79, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[357] = new ModelRendererTurbo(this, 249, 86, textureX, textureY, "cull"); // Box 88 cull up literally put it to the side
		bodyModel[358] = new ModelRendererTurbo(this, 250, 46, textureX, textureY); // Box 327
		bodyModel[359] = new ModelRendererTurbo(this, 252, 43, textureX, textureY); // Box 328
		bodyModel[360] = new ModelRendererTurbo(this, 252, 49, textureX, textureY); // Box 329
		bodyModel[361] = new ModelRendererTurbo(this, 261, 46, textureX, textureY); // Box 330
		bodyModel[362] = new ModelRendererTurbo(this, 250, 36, textureX, textureY); // Box 327
		bodyModel[363] = new ModelRendererTurbo(this, 252, 33, textureX, textureY); // Box 328
		bodyModel[364] = new ModelRendererTurbo(this, 252, 39, textureX, textureY); // Box 329
		bodyModel[365] = new ModelRendererTurbo(this, 261, 36, textureX, textureY); // Box 330
		bodyModel[366] = new ModelRendererTurbo(this, 35, 162, textureX, textureY); // Box 376
		bodyModel[367] = new ModelRendererTurbo(this, 330, 246, textureX, textureY); // Box 377
		bodyModel[368] = new ModelRendererTurbo(this, 269, 79, textureX, textureY); // Box 364 prime base
		bodyModel[369] = new ModelRendererTurbo(this, 269, 75, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[370] = new ModelRendererTurbo(this, 269, 75, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[371] = new ModelRendererTurbo(this, 269, 75, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[372] = new ModelRendererTurbo(this, 269, 75, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[373] = new ModelRendererTurbo(this, 424, 114, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[374] = new ModelRendererTurbo(this, 57, 52, textureX, textureY); // Box 384 extendo cab
		bodyModel[375] = new ModelRendererTurbo(this, 67, 52, textureX, textureY); // Box 385 extendo cab
		bodyModel[376] = new ModelRendererTurbo(this, 60, 54, textureX, textureY); // Box 386 extendo cab
		bodyModel[377] = new ModelRendererTurbo(this, 219, 72, textureX, textureY); // Box 387 extendo cab floor fill
		bodyModel[378] = new ModelRendererTurbo(this, 122, 145, textureX, textureY); // Box 388 extendocab handrail
		bodyModel[379] = new ModelRendererTurbo(this, 445, 94, textureX, textureY); // Box 389 ssw/sp rear light mount
		bodyModel[380] = new ModelRendererTurbo(this, 99, 3, textureX, textureY); // Box 390 up 808 unibrow
		bodyModel[381] = new ModelRendererTurbo(this, 117, 21, textureX, textureY, "lamp"); // Box 391 up 808 headlight
		bodyModel[382] = new ModelRendererTurbo(this, 127, 21, textureX, textureY, "lamp"); // Box 392 up 808 headlight
		bodyModel[383] = new ModelRendererTurbo(this, 119, 21, textureX, textureY, "lamp"); // Box 393 up 808 numberboard
		bodyModel[384] = new ModelRendererTurbo(this, 100, 15, textureX, textureY); // Box 394 up 808 unibrow
		bodyModel[385] = new ModelRendererTurbo(this, 119, 21, textureX, textureY, "lamp"); // Box 395 up 808 numberboard
		bodyModel[386] = new ModelRendererTurbo(this, 136, 15, textureX, textureY); // Box 396 up 808 unibrow
		bodyModel[387] = new ModelRendererTurbo(this, 128, 6, textureX, textureY); // Box 397 up 808 unibrow
		bodyModel[388] = new ModelRendererTurbo(this, 106, 6, textureX, textureY); // Box 398 up 808 unibrow
		bodyModel[389] = new ModelRendererTurbo(this, 110, 1, textureX, textureY); // Box 399 up 808 unibrow
		bodyModel[390] = new ModelRendererTurbo(this, 132, 1, textureX, textureY); // Box 400 up 808 unibrow
		bodyModel[391] = new ModelRendererTurbo(this, 109, 1, textureX, textureY); // Box 401 up 808 unibrow
		bodyModel[392] = new ModelRendererTurbo(this, 145, 4, textureX, textureY); // Box 402 up 808 horn
		bodyModel[393] = new ModelRendererTurbo(this, 152, 4, textureX, textureY); // Box 403 up 808 horn
		bodyModel[394] = new ModelRendererTurbo(this, 143, 7, textureX, textureY); // Box 404 up 808 horn
		bodyModel[395] = new ModelRendererTurbo(this, 143, 1, textureX, textureY); // Box 405 up 808 horn
		bodyModel[396] = new ModelRendererTurbo(this, 244, 35, textureX, textureY); // Box 406
		bodyModel[397] = new ModelRendererTurbo(this, 235, 38, textureX, textureY); // Box 407
		bodyModel[398] = new ModelRendererTurbo(this, 237, 35, textureX, textureY); // Box 408
		bodyModel[399] = new ModelRendererTurbo(this, 235, 32, textureX, textureY); // Box 409
		bodyModel[400] = new ModelRendererTurbo(this, 242, 83, textureX, textureY); // Box 409 commander base
		bodyModel[401] = new ModelRendererTurbo(this, 242, 79, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[402] = new ModelRendererTurbo(this, 240, 86, textureX, textureY, "cull"); // Box 88 cull up blinky
		bodyModel[403] = new ModelRendererTurbo(this, 232, 78, textureX, textureY); // Box 413
		bodyModel[404] = new ModelRendererTurbo(this, 39, 227, textureX, textureY); // Box 280
		bodyModel[405] = new ModelRendererTurbo(this, 99, 235, textureX, textureY); // Box 285
		bodyModel[406] = new ModelRendererTurbo(this, 297, 56, textureX, textureY); // Box 416
		bodyModel[407] = new ModelRendererTurbo(this, 288, 59, textureX, textureY); // Box 417
		bodyModel[408] = new ModelRendererTurbo(this, 288, 53, textureX, textureY); // Box 418
		bodyModel[409] = new ModelRendererTurbo(this, 288, 56, textureX, textureY); // Box 419
		bodyModel[410] = new ModelRendererTurbo(this, 441, 20, textureX, textureY); // Box 420
		bodyModel[411] = new ModelRendererTurbo(this, 441, 15, textureX, textureY); // Box 421
		bodyModel[412] = new ModelRendererTurbo(this, 473, 2, textureX, textureY); // Box 422
		bodyModel[413] = new ModelRendererTurbo(this, 471, 7, textureX, textureY); // Box 423
		bodyModel[414] = new ModelRendererTurbo(this, 473, 21, textureX, textureY); // Box 424
		bodyModel[415] = new ModelRendererTurbo(this, 296, 33, textureX, textureY); // Box 425 dynamic radiator
		bodyModel[416] = new ModelRendererTurbo(this, 296, 33, textureX, textureY); // Box 426 dynamic radiator
		bodyModel[417] = new ModelRendererTurbo(this, 437, 91, textureX, textureY, "lamp"); // Box 224 gyra rear sp/ssw
		bodyModel[418] = new ModelRendererTurbo(this, 436, 96, textureX, textureY); // Box 225 sp rear gyra mount
		bodyModel[419] = new ModelRendererTurbo(this, 437, 91, textureX, textureY, "lamp"); // Box 226 gyra rear sp/ssw
		bodyModel[420] = new ModelRendererTurbo(this, 444, 89, textureX, textureY); // Box 440 rear e gyra BOX sp/ssw
		bodyModel[421] = new ModelRendererTurbo(this, 445, 84, textureX, textureY, "lamp"); // Box 441 rear e gyra sp
		bodyModel[422] = new ModelRendererTurbo(this, 452, 94, textureX, textureY); // Box 442 acl peanor light
		bodyModel[423] = new ModelRendererTurbo(this, 453, 101, textureX, textureY, "lamp"); // Box 443 rear gyra acl peenor
		bodyModel[424] = new ModelRendererTurbo(this, 453, 106, textureX, textureY, "lamp"); // Box 444 rear gyra acl peenor
		bodyModel[425] = new ModelRendererTurbo(this, 40, 52, textureX, textureY); // Box 445 cab bit dont forget me
		bodyModel[426] = new ModelRendererTurbo(this, 360, 206, textureX, textureY, "cull"); // Box 479 cull
		bodyModel[427] = new ModelRendererTurbo(this, 1, 219, textureX, textureY, "cull"); // Box 447 cull
		bodyModel[428] = new ModelRendererTurbo(this, 27, 162, textureX, textureY); // Box 448
		bodyModel[429] = new ModelRendererTurbo(this, 321, 246, textureX, textureY); // Box 449
		bodyModel[430] = new ModelRendererTurbo(this, 470, 15, textureX, textureY); // Box 450
		bodyModel[431] = new ModelRendererTurbo(this, 112, 145, textureX, textureY); // Box 451
		bodyModel[432] = new ModelRendererTurbo(this, 275, 180, textureX, textureY); // Box 452 pheleps dodge tonk
		bodyModel[433] = new ModelRendererTurbo(this, 279, 196, textureX, textureY); // Box 453 pheleps dodge tonk
		bodyModel[434] = new ModelRendererTurbo(this, 259, 145, textureX, textureY); // Box 34
		bodyModel[435] = new ModelRendererTurbo(this, 234, 144, textureX, textureY); // Box 34
		bodyModel[436] = new ModelRendererTurbo(this, 257, 139, textureX, textureY); // Box 34
		bodyModel[437] = new ModelRendererTurbo(this, 233, 138, textureX, textureY); // Box 34
		bodyModel[438] = new ModelRendererTurbo(this, 227, 130, textureX, textureY); // Box 34
		bodyModel[439] = new ModelRendererTurbo(this, 314, 45, textureX, textureY); // Box 114
		bodyModel[440] = new ModelRendererTurbo(this, 314, 45, textureX, textureY); // Box 74
		bodyModel[441] = new ModelRendererTurbo(this, 314, 48, textureX, textureY); // Box 78
		bodyModel[442] = new ModelRendererTurbo(this, 312, 40, textureX, textureY); // Box 245
		bodyModel[443] = new ModelRendererTurbo(this, 223, 48, textureX, textureY); // Box 333
		bodyModel[444] = new ModelRendererTurbo(this, 223, 51, textureX, textureY); // Box 335
		bodyModel[445] = new ModelRendererTurbo(this, 223, 54, textureX, textureY); // Box 336
		bodyModel[446] = new ModelRendererTurbo(this, 297, 46, textureX, textureY); // Box 745
		bodyModel[447] = new ModelRendererTurbo(this, 286, 46, textureX, textureY); // Box 746
		bodyModel[448] = new ModelRendererTurbo(this, 288, 43, textureX, textureY); // Box 747
		bodyModel[449] = new ModelRendererTurbo(this, 288, 49, textureX, textureY); // Box 748
		bodyModel[450] = new ModelRendererTurbo(this, 279, 45, textureX, textureY); // Box 745
		bodyModel[451] = new ModelRendererTurbo(this, 268, 45, textureX, textureY); // Box 746
		bodyModel[452] = new ModelRendererTurbo(this, 270, 42, textureX, textureY); // Box 747
		bodyModel[453] = new ModelRendererTurbo(this, 270, 48, textureX, textureY); // Box 748
		bodyModel[454] = new ModelRendererTurbo(this, 254, 67, textureX, textureY); // Box 457
		bodyModel[455] = new ModelRendererTurbo(this, 253, 60, textureX, textureY); // Box 458
		bodyModel[456] = new ModelRendererTurbo(this, 237, 48, textureX, textureY); // Box 459
		bodyModel[457] = new ModelRendererTurbo(this, 237, 55, textureX, textureY); // Box 460
		bodyModel[458] = new ModelRendererTurbo(this, 224, 78, textureX, textureY); // Box 308
		bodyModel[459] = new ModelRendererTurbo(this, 232, 84, textureX, textureY); // Box 462
		bodyModel[460] = new ModelRendererTurbo(this, 270, 55, textureX, textureY); // Box 470
		bodyModel[461] = new ModelRendererTurbo(this, 274, 58, textureX, textureY); // Box 471
		bodyModel[462] = new ModelRendererTurbo(this, 192, 56, textureX, textureY); // Box 184 o2 generator
		bodyModel[463] = new ModelRendererTurbo(this, 259, 75, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[464] = new ModelRendererTurbo(this, 259, 75, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[465] = new ModelRendererTurbo(this, 259, 75, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[466] = new ModelRendererTurbo(this, 259, 75, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[467] = new ModelRendererTurbo(this, 259, 79, textureX, textureY); // Box 428 prime base
		bodyModel[468] = new ModelRendererTurbo(this, 274, 52, textureX, textureY); // Box 478
		bodyModel[469] = new ModelRendererTurbo(this, 357, 68, textureX, textureY, "cull"); // Box 525 snowshield cull
		bodyModel[470] = new ModelRendererTurbo(this, 358, 75, textureX, textureY, "cull"); // Box 481 snowshield cull
		bodyModel[471] = new ModelRendererTurbo(this, 359, 65, textureX, textureY); // Box 482 snowshield bit
		bodyModel[472] = new ModelRendererTurbo(this, 330, 68, textureX, textureY, "cull"); // Box 525 snowshield cull
		bodyModel[473] = new ModelRendererTurbo(this, 329, 75, textureX, textureY, "cull"); // Box 481 snowshield cull
		bodyModel[474] = new ModelRendererTurbo(this, 332, 65, textureX, textureY); // Box 482 snowshield bit
		bodyModel[475] = new ModelRendererTurbo(this, 413, 14, textureX, textureY); // Box 486 UP THING (UP 848 for example)
		bodyModel[476] = new ModelRendererTurbo(this, 414, 19, textureX, textureY); // Box 487 UP THING
		bodyModel[477] = new ModelRendererTurbo(this, 428, 19, textureX, textureY); // Box 488 UP THING
		bodyModel[478] = new ModelRendererTurbo(this, 37, 16, textureX, textureY); // Box 489 add thsi for gp30u
		bodyModel[479] = new ModelRendererTurbo(this, 211, 61, textureX, textureY); // Box 184 o2 generator gp30u
		bodyModel[480] = new ModelRendererTurbo(this, 218, 82, textureX, textureY, "cull"); // Box 418 cull platform atsf
		bodyModel[481] = new ModelRendererTurbo(this, 224, 80, textureX, textureY); // Box 308
		bodyModel[482] = new ModelRendererTurbo(this, 347, 24, textureX, textureY); // Box 493
		bodyModel[483] = new ModelRendererTurbo(this, 347, 21, textureX, textureY); // Box 494
		bodyModel[484] = new ModelRendererTurbo(this, 48, 182, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[485] = new ModelRendererTurbo(this, 50, 177, textureX, textureY); // Box 5
		bodyModel[486] = new ModelRendererTurbo(this, 71, 182, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[487] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 5
		bodyModel[488] = new ModelRendererTurbo(this, 323, 45, textureX, textureY); // Box 499
		bodyModel[489] = new ModelRendererTurbo(this, 321, 40, textureX, textureY); // Box 500
		bodyModel[490] = new ModelRendererTurbo(this, 323, 45, textureX, textureY); // Box 501
		bodyModel[491] = new ModelRendererTurbo(this, 323, 48, textureX, textureY); // Box 502
		bodyModel[492] = new ModelRendererTurbo(this, 426, 7, textureX, textureY); // Box 276
		bodyModel[493] = new ModelRendererTurbo(this, 216, 82, textureX, textureY); // Box 354 gong bell WCFB ESTUPIDO
		bodyModel[494] = new ModelRendererTurbo(this, 258, 107, textureX, textureY); // Box 504
		bodyModel[495] = new ModelRendererTurbo(this, 255, 107, textureX, textureY); // Box 505
		bodyModel[496] = new ModelRendererTurbo(this, 298, 80, textureX, textureY, "cull"); // Box 506 cull
		bodyModel[497] = new ModelRendererTurbo(this, 40, 119, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f1
		bodyModel[498] = new ModelRendererTurbo(this, 40, 119, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f1
		bodyModel[499] = new ModelRendererTurbo(this, 40, 124, textureX, textureY); // Box 411 

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[0].setRotationPoint(-22.5F, -17F, 11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[1].setRotationPoint(-22.5F, -17F, -12F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 45
		bodyModel[2].setRotationPoint(-31.5F, -3F, 7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front cab
		bodyModel[3].setRotationPoint(-29.75F, -22F, -1F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front cab
		bodyModel[4].setRotationPoint(-29.75F, -20F, -1F);

		bodyModel[5].addBox(0F, 0F, 0F, 17, 4, 22, 0F); // Box 201
		bodyModel[5].setRotationPoint(-30.5F, -3F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, -3.5F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 314 door swing right rear
		bodyModel[6].setRotationPoint(-13.5F, -17F, 10.5F);

		bodyModel[7].addShapeBox(-1F, 0F, -0.5F, 1, 14, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315 door swing right front
		bodyModel[7].setRotationPoint(-25.5F, -17F, -10.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[8].setRotationPoint(-14.5F, -22F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 14, 2, 16, 0F); // Box 394
		bodyModel[9].setRotationPoint(-14.5F, -22F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -1F, 1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 107
		bodyModel[10].setRotationPoint(8.5F, -22F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 110
		bodyModel[11].setRotationPoint(-4.5F, -21F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 111
		bodyModel[12].setRotationPoint(-4.5F, -18F, -9F);

		bodyModel[13].addBox(0F, 0F, 0F, 10, 20, 3, 0F); // Box 112
		bodyModel[13].setRotationPoint(-14.5F, -21F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[14].setRotationPoint(8.5F, -20F, -8F);

		bodyModel[15].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 265
		bodyModel[15].setRotationPoint(-14.5F, -21F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[16].setRotationPoint(8.5F, -18F, -8F);

		bodyModel[17].addBox(0F, 0F, 0F, 12, 14, 1, 0F); // Box 9
		bodyModel[17].setRotationPoint(-25.5F, -17F, 10F);

		bodyModel[18].addBox(0F, 0F, 0F, 13, 14, 1, 0F); // Box 10
		bodyModel[18].setRotationPoint(-25.5F, -17F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 15, 7, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[19].setRotationPoint(-26.5F, -17F, 0F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 5, 2, 0F); // Box 48
		bodyModel[20].setRotationPoint(-29.5F, -22F, -1F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 2F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F); // Box 43
		bodyModel[21].setRotationPoint(-27.5F, -19F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[22].setRotationPoint(-25.5F, -18F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2.5F, -0.25F, 0F); // Box 51
		bodyModel[23].setRotationPoint(-29.5F, -22F, 1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 121
		bodyModel[24].setRotationPoint(-29.5F, -22F, -6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[25].setRotationPoint(-13.5F, -17F, -11F);

		bodyModel[26].addBox(0F, 0F, 0F, 12, 1, 12, 0F); // Box 153
		bodyModel[26].setRotationPoint(-26.5F, -22F, -6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 284
		bodyModel[27].setRotationPoint(-26.5F, -17F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 15, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 15
		bodyModel[28].setRotationPoint(-26.5F, -17F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[29].setRotationPoint(-26.5F, -19F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 152
		bodyModel[30].setRotationPoint(-25.5F, -22F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.375F, -1F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 335
		bodyModel[31].setRotationPoint(-27.5F, -22F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.375F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 336
		bodyModel[32].setRotationPoint(-27.5F, -22F, -7F);

		bodyModel[33].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[33].setRotationPoint(27F, -21.5F, -3F);

		bodyModel[34].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[34].setRotationPoint(14F, -21.5F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F,-0.25F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -5F, 0F, -9.25F, -5F, 0F, -9.25F, -5F, 0F, -0.25F, -5F, 0F); // Box 297 rear radiator
		bodyModel[35].setRotationPoint(24F, -18.5F, -7.15F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F,-0.25F, -1F, 0F, -9.25F, -1F, 0F, -9.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -4F, 0F, -9.25F, -4F, 0F, -9.25F, -4F, 0F, -0.25F, -4F, 0F); // Box 272 rear radiator
		bodyModel[36].setRotationPoint(14F, -19.5F, -7.15F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F,-0.25F, -1F, 0F, -9.25F, -1F, 0F, -9.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -4F, 0F, -9.25F, -4F, 0F, -9.25F, -4F, 0F, -0.25F, -4F, 0F); // Box 514 rear radiator
		bodyModel[37].setRotationPoint(14F, -19.5F, 6.15F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F,-0.25F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -5F, 0F, -9.25F, -5F, 0F, -9.25F, -5F, 0F, -0.25F, -5F, 0F); // Box 515 rear radiator
		bodyModel[38].setRotationPoint(24F, -18.5F, 6.15F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[39].setRotationPoint(34.5F, -20F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[40].setRotationPoint(34.5F, -20F, 0F);

		bodyModel[41].addShapeBox(-1F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115 numberboard rear
		bodyModel[41].setRotationPoint(35F, -15F, -6F);
		bodyModel[41].rotateAngleY = -0.40142573F;

		bodyModel[42].addShapeBox(-1F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116 numberboard rear
		bodyModel[42].setRotationPoint(35F, -15F, 6F);
		bodyModel[42].rotateAngleY = 0.40142573F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight rear low
		bodyModel[43].setRotationPoint(34.15F, -11.5F, -6.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight rear low
		bodyModel[44].setRotationPoint(34.15F, -11.5F, 4.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight rear high
		bodyModel[45].setRotationPoint(34.15F, -17.5F, -6.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight rear high
		bodyModel[46].setRotationPoint(34.15F, -17.5F, 4.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 47, 21, 14, 0F); // Box 19 the hooh
		bodyModel[47].setRotationPoint(-12.5F, -20F, -7F);

		bodyModel[48].addBox(0F, 0F, 0F, 35, 2, 22, 0F); // Box 36
		bodyModel[48].setRotationPoint(-13.5F, -1F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[49].setRotationPoint(-36.5F, -7F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 353
		bodyModel[50].setRotationPoint(-36.5F, -9F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 354
		bodyModel[51].setRotationPoint(-36.5F, -9F, 1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 356
		bodyModel[52].setRotationPoint(-36.5F, -12F, 1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 357
		bodyModel[53].setRotationPoint(-36.5F, -12F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 355
		bodyModel[54].setRotationPoint(-36.5F, -7F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[55].setRotationPoint(-36.5F, -12F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[56].setRotationPoint(-36.5F, -12F, -1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[57].setRotationPoint(-32F, -7.5F, -7F);

		bodyModel[58].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[58].setRotationPoint(-31.5F, -5.5F, -7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F); // Box 48 noselight backbit
		bodyModel[59].setRotationPoint(-35.48F, -12F, -1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1251 sandcap
		bodyModel[60].setRotationPoint(-34.5F, -12.5F, -1F);

		bodyModel[61].addBox(0F, 0F, 0F, 66, 1, 5, 0F); // Box 0
		bodyModel[61].setRotationPoint(-32.5F, 1F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 66, 1, 5, 0F); // Box 112
		bodyModel[62].setRotationPoint(-32.5F, 1F, 6F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[63].setRotationPoint(-41.5F, 3F, -1.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[64].setRotationPoint(-38.5F, 2.5F, -2F);

		bodyModel[65].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 5
		bodyModel[65].setRotationPoint(39.5F, 3F, -1.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[66].setRotationPoint(38.5F, 2.5F, -2F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 3
		bodyModel[67].setRotationPoint(38.51F, 1F, -10F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[68].setRotationPoint(38.51F, 7F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[69].setRotationPoint(38.51F, 8F, -9F);

		bodyModel[70].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 3
		bodyModel[70].setRotationPoint(-37.51F, 1F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[71].setRotationPoint(-37.51F, 8F, -9F);

		bodyModel[72].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[72].setRotationPoint(-37.51F, 7F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 numberboard front
		bodyModel[73].setRotationPoint(-27.05F, -19.05F, -6F);
		bodyModel[73].rotateAngleY = 0.4712389F;

		bodyModel[74].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118 numberboard front
		bodyModel[74].setRotationPoint(-27.05F, -19.05F, 6F);
		bodyModel[74].rotateAngleY = -0.4712389F;

		bodyModel[75].addBox(0F, 0F, 0F, 76, 2, 12, 0F); // Box 23
		bodyModel[75].setRotationPoint(-37.5F, 1F, -6F);

		bodyModel[76].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[76].setRotationPoint(-23.5F, 3F, -2F);

		bodyModel[77].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[77].setRotationPoint(20.5F, 3F, -2F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 76, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[78].setRotationPoint(-37.5F, 3F, -6.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[79].setRotationPoint(-23F, 2F, -10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[80].setRotationPoint(-23F, 2F, 6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 133
		bodyModel[81].setRotationPoint(-22F, 2F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 134
		bodyModel[82].setRotationPoint(-22F, 2F, 9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[83].setRotationPoint(21F, 2F, -10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 193
		bodyModel[84].setRotationPoint(22F, 2F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		bodyModel[85].setRotationPoint(21F, 2F, 6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 195
		bodyModel[86].setRotationPoint(22F, 2F, 9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[87].setRotationPoint(-37.5F, 3F, -2.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 203
		bodyModel[88].setRotationPoint(33.5F, 3F, -2.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 60
		bodyModel[89].setRotationPoint(-10F, 3F, -6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 61
		bodyModel[90].setRotationPoint(-14F, 3F, -6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 62
		bodyModel[91].setRotationPoint(-14F, 3F, 5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[92].setRotationPoint(11F, 3F, 5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[93].setRotationPoint(11F, 3F, -6F);

		bodyModel[94].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 72
		bodyModel[94].setRotationPoint(-10F, 3F, 5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[95].setRotationPoint(11.5F, 2F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[96].setRotationPoint(10.5F, 2F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 493
		bodyModel[97].setRotationPoint(11.5F, 2F, 11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 494
		bodyModel[98].setRotationPoint(-10.5F, 2F, 11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 495
		bodyModel[99].setRotationPoint(-32.5F, 2F, 11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 496
		bodyModel[100].setRotationPoint(10.5F, 2F, 11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[101].setRotationPoint(-37.5F, 5F, -10F);

		bodyModel[102].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 494
		bodyModel[102].setRotationPoint(-37.5F, 4F, -8F);

		bodyModel[103].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 495
		bodyModel[103].setRotationPoint(-37.5F, 7F, -9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[104].setRotationPoint(-37.5F, 8F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 497
		bodyModel[105].setRotationPoint(-33.5F, 5F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 498
		bodyModel[106].setRotationPoint(-33.5F, 2F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 499
		bodyModel[107].setRotationPoint(-33.5F, 1F, -11F);

		bodyModel[108].addShapeBox(1F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[108].setRotationPoint(-38.5F, 1F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[109].setRotationPoint(-37.5F, 3F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 502
		bodyModel[110].setRotationPoint(-33.5F, 5F, 6F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[111].setRotationPoint(-37.5F, 5F, 8F);

		bodyModel[112].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 504
		bodyModel[112].setRotationPoint(-37.5F, 4F, 8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[113].setRotationPoint(-37.5F, 3F, 7F);

		bodyModel[114].addShapeBox(1F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[114].setRotationPoint(-38.5F, 1F, 6F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 507
		bodyModel[115].setRotationPoint(-33.5F, 1F, 6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 508
		bodyModel[116].setRotationPoint(-33.5F, 2F, 6F);

		bodyModel[117].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 509
		bodyModel[117].setRotationPoint(-37.5F, 7F, 9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[118].setRotationPoint(-37.5F, 8F, 9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 164
		bodyModel[119].setRotationPoint(33.5F, 2F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[120].setRotationPoint(33.5F, 2F, 6F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F); // Box 264
		bodyModel[121].setRotationPoint(33.5F, 5F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[122].setRotationPoint(33.5F, 5F, 6F);

		bodyModel[123].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 541
		bodyModel[123].setRotationPoint(34.5F, 4F, -8F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[124].setRotationPoint(34.5F, 5F, -10F);

		bodyModel[125].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 543
		bodyModel[125].setRotationPoint(34.5F, 7F, -9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[126].setRotationPoint(34.5F, 8F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 545
		bodyModel[127].setRotationPoint(34.5F, 3F, -9F);

		bodyModel[128].addShapeBox(1F, 0F, 0F, 3, 0, 2, 0F,0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[128].setRotationPoint(34.5F, 1F, -8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 553
		bodyModel[129].setRotationPoint(34.5F, 3F, 7F);

		bodyModel[130].addShapeBox(1F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F); // Box 554
		bodyModel[130].setRotationPoint(34.5F, 1F, 6F);

		bodyModel[131].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 555
		bodyModel[131].setRotationPoint(34.5F, 4F, 8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 556
		bodyModel[132].setRotationPoint(34.5F, 5F, 8F);

		bodyModel[133].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 557
		bodyModel[133].setRotationPoint(34.5F, 7F, 9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 558
		bodyModel[134].setRotationPoint(34.5F, 8F, 9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[135].setRotationPoint(33.5F, 1F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[136].setRotationPoint(33.5F, 1F, 6F);

		bodyModel[137].addBox(0F, 0F, 0F, 7, 13, 14, 0F); // Box 279
		bodyModel[137].setRotationPoint(-33.5F, -12F, -7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 280
		bodyModel[138].setRotationPoint(-10.5F, 2F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 281
		bodyModel[139].setRotationPoint(-32.5F, 2F, -11F);

		bodyModel[140].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 288 she phinneas on my ferb till i https://youtu.be/gRus9T8wNBA
		bodyModel[140].setRotationPoint(1F, -21F, -3F);

		bodyModel[141].addBox(0F, 0F, 0F, 9, 1, 13, 0F); // Box 275
		bodyModel[141].setRotationPoint(-0.5F, -20.25F, -6.5F);

		bodyModel[142].addShapeBox(-0.5F, 0F, -3.5F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[142].setRotationPoint(-13F, -3F, 10.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[143].setRotationPoint(-33.5F, -9F, 10.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 0, 16, 2, 0F); // Box 177
		bodyModel[144].setRotationPoint(-33.5F, -11F, 9F);

		bodyModel[145].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 258
		bodyModel[145].setRotationPoint(-33.5F, -11F, 11F);

		bodyModel[146].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 81
		bodyModel[146].setRotationPoint(-33.5F, -9F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[147].setRotationPoint(-33.5F, -7F, -11.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 293
		bodyModel[148].setRotationPoint(-33.5F, -11F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[149].setRotationPoint(-37.5F, -7F, -8F);
		bodyModel[149].rotateAngleY = -3.14159265F;

		bodyModel[150].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[150].setRotationPoint(-37.5F, 0F, 10F);

		bodyModel[151].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[151].setRotationPoint(-37.5F, 0F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[152].setRotationPoint(-37.5F, -7F, -6F);

		bodyModel[153].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 144
		bodyModel[153].setRotationPoint(-37.5F, -7F, -8F);

		bodyModel[154].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[154].setRotationPoint(-38.5F, -7F, -4F);

		bodyModel[155].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 148
		bodyModel[155].setRotationPoint(-37.5F, -7F, 6F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[156].setRotationPoint(-37.51F, -6F, -8F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		bodyModel[157].setRotationPoint(-37.51F, -6F, 7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[158].setRotationPoint(-37.5F, -7F, 9F);
		bodyModel[158].rotateAngleY = -3.14159265F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[159].setRotationPoint(-37.5F, -7F, 4F);

		bodyModel[160].addBox(0F, 0F, 0F, 32, 8, 0, 0F); // Box 176
		bodyModel[160].setRotationPoint(-11.5F, -9F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.2F, -2F, 0F, 0.2F, -2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.2F, 0F, 0F); // Box 315
		bodyModel[161].setRotationPoint(20.5F, -9F, -11.01F);

		bodyModel[162].addBox(0F, 0F, 0F, 12, 8, 0, 0F); // Box 316
		bodyModel[162].setRotationPoint(22.5F, -7F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.1F, 0F, 0F); // Box 313
		bodyModel[163].setRotationPoint(-13.5F, -11F, -11.01F);

		bodyModel[164].addBox(0F, 0F, 0F, 32, 8, 0, 0F); // Box 316
		bodyModel[164].setRotationPoint(-11.5F, -9F, 11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.2F, -2F, 0F, 0.2F, -2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.2F, 0F, 0F); // Box 317
		bodyModel[165].setRotationPoint(20.5F, -9F, 11.01F);

		bodyModel[166].addBox(0F, 0F, 0F, 12, 8, 0, 0F); // Box 318
		bodyModel[166].setRotationPoint(22.5F, -7F, 11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.1F, 0F, 0F); // Box 319
		bodyModel[167].setRotationPoint(-13.5F, -11F, 11.01F);

		bodyModel[168].addBox(0F, 0F, 0F, 20, 2, 22, 0F); // Box 489
		bodyModel[168].setRotationPoint(-9.5F, 4F, -11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[169].setRotationPoint(-9.5F, 6F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[170].setRotationPoint(-9.5F, 3F, 8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[171].setRotationPoint(-9.5F, 6F, 9F);

		bodyModel[172].addBox(0F, 0F, 0F, 20, 1, 16, 0F); // Box 559
		bodyModel[172].setRotationPoint(-9.5F, 3F, -8F);

		bodyModel[173].addShapeBox(0F, -1F, -1F, 13, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 562
		bodyModel[173].setRotationPoint(-3.5F, 2.5F, -9.5F);
		bodyModel[173].rotateAngleX = 0.78539816F;

		bodyModel[174].addShapeBox(0F, -1F, -1F, 13, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 563
		bodyModel[174].setRotationPoint(-3.5F, 2.5F, 9.5F);
		bodyModel[174].rotateAngleX = 0.78539816F;

		bodyModel[175].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 523 pipework cull
		bodyModel[175].setRotationPoint(-4.5F, 2F, -11F);
		bodyModel[175].rotateAngleX = 0.10471976F;

		bodyModel[176].addShapeBox(0F, -1F, 0F, 15, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 524 pipework cull
		bodyModel[176].setRotationPoint(-4.5F, 2F, 11F);
		bodyModel[176].rotateAngleX = 3.0368729F;

		bodyModel[177].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[177].setRotationPoint(-9.5F, 3F, -11F);

		bodyModel[178].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box cull
		bodyModel[178].setRotationPoint(-32.5F, -8F, -7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 20, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[179].setRotationPoint(-9.5F, 6F, -9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[180].setRotationPoint(-0.5F, -22F, -8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[181].setRotationPoint(8.5F, -22F, -8F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[182].setRotationPoint(-14.5F, -22F, 8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 351
		bodyModel[183].setRotationPoint(8.5F, -22F, 7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 352
		bodyModel[184].setRotationPoint(-4.5F, -21F, 6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 353
		bodyModel[185].setRotationPoint(-4.5F, -18F, 7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 1F); // Box 354
		bodyModel[186].setRotationPoint(8.5F, -20F, 7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -1F, 0F, 0F, -1F); // Box 355
		bodyModel[187].setRotationPoint(8.5F, -18F, 7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[188].setRotationPoint(-0.5F, -22F, 6F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 357
		bodyModel[189].setRotationPoint(8.5F, -22F, 6F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 548 headlight nose low b
		bodyModel[190].setRotationPoint(-36.5F, -9F, -1F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 547 headlight nose low a
		bodyModel[191].setRotationPoint(-36.5F, -11F, -1F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 546 headlight nose high a
		bodyModel[192].setRotationPoint(-36.5F, -12F, -1F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 545 headlight nose high b
		bodyModel[193].setRotationPoint(-36.5F, -10F, -1F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[194].setRotationPoint(-38.5F, 1F, -6F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[195].setRotationPoint(-38.5F, 1F, -5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[196].setRotationPoint(-38.5F, 1F, 5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 561
		bodyModel[197].setRotationPoint(38.5F, -7F, -8F);
		bodyModel[197].rotateAngleY = -3.14159265F;

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 560
		bodyModel[198].setRotationPoint(38.5F, -7F, 9F);
		bodyModel[198].rotateAngleY = -3.14159265F;

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 872
		bodyModel[199].setRotationPoint(38.51F, -6F, -8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 871
		bodyModel[200].setRotationPoint(38.51F, -6F, 7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[201].setRotationPoint(38.5F, 1F, 5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[202].setRotationPoint(38.5F, -7F, 4F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[203].setRotationPoint(38.5F, 1F, -6F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[204].setRotationPoint(38.5F, 1F, -5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[205].setRotationPoint(38.5F, -7F, -6F);

		bodyModel[206].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 234
		bodyModel[206].setRotationPoint(39.5F, -7F, -4F);

		bodyModel[207].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 81
		bodyModel[207].setRotationPoint(38.5F, -7F, 6F);

		bodyModel[208].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 80
		bodyModel[208].setRotationPoint(38.5F, -7F, -8F);

		bodyModel[209].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 63
		bodyModel[209].setRotationPoint(38.5F, 0F, -11F);

		bodyModel[210].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 61
		bodyModel[210].setRotationPoint(38.5F, 0F, 10F);

		bodyModel[211].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 250
		bodyModel[211].setRotationPoint(34.5F, -7F, -11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[212].setRotationPoint(34.5F, -5F, -11.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[213].setRotationPoint(34.5F, -5F, 10.5F);

		bodyModel[214].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 243
		bodyModel[214].setRotationPoint(34.5F, -7F, 9F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 36 cr society square
		bodyModel[215].setRotationPoint(-31.5F, -7F, 7F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272 your either HI or KCS to use this
		bodyModel[216].setRotationPoint(-13.5F, -15F, -9F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 18, 12, 0F); // Box 527 cab backpannel
		bodyModel[217].setRotationPoint(-15.5F, -21F, -6F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, 0F); // Box 386
		bodyModel[218].setRotationPoint(-25.5F, -22F, -7F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 0F); // Box 387
		bodyModel[219].setRotationPoint(-25.5F, -22F, 6F);

		bodyModel[220].addBox(0F, 0F, 0F, 5, 3, 12, 0F); // Box 388 remove this for gp30u
		bodyModel[220].setRotationPoint(-26.5F, -21F, -6F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,2F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 390
		bodyModel[221].setRotationPoint(-27.5F, -19F, 1F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -1.125F, 0.25F, 0F, -1.125F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 392
		bodyModel[222].setRotationPoint(-25.5F, -19.25F, -10.25F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 393
		bodyModel[223].setRotationPoint(-25.5F, -19.25F, -9.25F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F); // Box 394
		bodyModel[224].setRotationPoint(-25.5F, -22F, 6F);

		bodyModel[225].addShapeBox(-1F, 0F, 1.25F, 1, 2, 2, 0F,-0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.55F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 395 door swing right front top
		bodyModel[225].setRotationPoint(-25.5F, -19.25F, -10.5F);

		bodyModel[226].addShapeBox(-1F, 0F, -0.5F, 1, 2, 2, 0F,-0.875F, -1.125F, -0.5F, 0F, -1.125F, -0.5F, 0F, 0F, -0.25F, -0.55F, 0F, -0.25F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F); // Box 397 door swing right front top
		bodyModel[226].setRotationPoint(-25.5F, -19.25F, -10.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[227].setRotationPoint(-25.5F, -18F, 10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.125F, 0.25F, 0F, -1.125F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 399
		bodyModel[228].setRotationPoint(-25.5F, -19.25F, 9.25F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 400
		bodyModel[229].setRotationPoint(-25.5F, -19.25F, 6.25F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, -0.55F, 0.25F, 0F); // Box 401
		bodyModel[230].setRotationPoint(-26.5F, -19.25F, 7.25F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.55F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.125F, -0.5F, -0.875F, -1.125F, -0.5F, -0.55F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 402
		bodyModel[231].setRotationPoint(-26.5F, -19.25F, 9F);

		bodyModel[232].addShapeBox(0F, 0F, -3.25F, 1, 2, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.55F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 403 door swing right rear top
		bodyModel[232].setRotationPoint(-13.5F, -19.25F, 10.5F);

		bodyModel[233].addShapeBox(0F, 0F, -1.5F, 1, 2, 2, 0F,0F, 0F, -0.25F, -0.55F, 0F, -0.25F, -0.875F, -1.125F, -0.5F, 0F, -1.125F, -0.5F, 0F, 0.25F, -0.25F, -0.55F, 0.25F, -0.25F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 404 door swing right rear top
		bodyModel[233].setRotationPoint(-13.5F, -19.25F, 10.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, -0.55F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 405
		bodyModel[234].setRotationPoint(-13.5F, -19.25F, -9.25F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.125F, -0.5F, -0.875F, -1.125F, -0.5F, -0.55F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.55F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 406
		bodyModel[235].setRotationPoint(-13.5F, -19.25F, -11F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[236].setRotationPoint(-41.5F, 7F, 0F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[237].setRotationPoint(-41.5F, 7F, -10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[238].setRotationPoint(-40.5F, 6F, 0F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[239].setRotationPoint(-40.5F, 4F, 2F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[240].setRotationPoint(-40.5F, 6F, -10F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[241].setRotationPoint(-40.5F, 4F, -10F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[242].setRotationPoint(-40.5F, 4F, 2F);

		bodyModel[243].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[243].setRotationPoint(-40.5F, 4F, -8F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F); // Box 490
		bodyModel[244].setRotationPoint(-10.5F, 2F, 10.99F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[245].setRotationPoint(-5.5F, 2F, 10.99F);

		bodyModel[246].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 330
		bodyModel[246].setRotationPoint(-7.5F, 2F, 10.99F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F); // Box 506
		bodyModel[247].setRotationPoint(-10.5F, 2F, -10.99F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 507
		bodyModel[248].setRotationPoint(-5.5F, 2F, -10.99F);

		bodyModel[249].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 508
		bodyModel[249].setRotationPoint(-7.5F, 2F, -10.99F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight nose
		bodyModel[250].setRotationPoint(-34.15F, -11F, -6.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight nose
		bodyModel[251].setRotationPoint(-34.15F, -11F, 4.5F);

		bodyModel[252].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31 rear headlight mount
		bodyModel[252].setRotationPoint(35.75F, -17.5F, -2F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear 2 beam
		bodyModel[253].setRotationPoint(37F, -17.5F, -2F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear 2 beam
		bodyModel[254].setRotationPoint(37F, -17.5F, 0F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[255].setRotationPoint(-39F, -2F, -2F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[256].setRotationPoint(-39F, -3F, -2F);

		bodyModel[257].addBox(-1F, 0F, -4F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[257].setRotationPoint(39F, -2F, -2F);
		bodyModel[257].rotateAngleY = -3.14159265F;

		bodyModel[258].addShapeBox(-1F, 0F, -4F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[258].setRotationPoint(39F, -3F, -2F);
		bodyModel[258].rotateAngleY = -3.14159265F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 274 exhausting
		bodyModel[259].setRotationPoint(-4F, -23.15F, -3F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 509
		bodyModel[260].setRotationPoint(41.5F, 7F, 0F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 510
		bodyModel[261].setRotationPoint(41.5F, 7F, -10F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 515
		bodyModel[262].setRotationPoint(40.5F, 6F, -10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 516
		bodyModel[263].setRotationPoint(40.5F, 6F, 0F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, 0.9F, 0F, -0.1F, 0.9F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, 0.9F, 0F, -0.1F, 0.9F, 0F); // Box 19 front fuel fill
		bodyModel[264].setRotationPoint(-6.5F, 3F, -11F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, 0.9F, 0F, -0.1F, 0.9F, 0F, -0.1F, 0.9F, 0F, -0.1F, 0.9F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F); // Box 19 front fuel fill
		bodyModel[265].setRotationPoint(-6.5F, 3F, 6F);

		bodyModel[266].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 203
		bodyModel[266].setRotationPoint(-26.5F, -21F, -9F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 204
		bodyModel[267].setRotationPoint(-25F, -20F, -9F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 205
		bodyModel[268].setRotationPoint(-25F, -20F, 8F);

		bodyModel[269].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 206
		bodyModel[269].setRotationPoint(-26.5F, -21F, 8F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[270].setRotationPoint(-23.5F, -23F, -1F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[271].setRotationPoint(-23.5F, -23.5F, -1F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[272].setRotationPoint(-23.5F, -23.5F, -1F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[273].setRotationPoint(-23.5F, -23.5F, -1F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[274].setRotationPoint(-23.5F, -23.5F, -1F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[275].setRotationPoint(-38.5F, -5F, -5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[276].setRotationPoint(-38.75F, -5F, -5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[277].setRotationPoint(-38.75F, -3F, -5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[278].setRotationPoint(-38.5F, -5F, 3F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[279].setRotationPoint(-38.75F, -5F, 3F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[280].setRotationPoint(-38.75F, -3F, 3F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[281].setRotationPoint(-38.5F, -1F, -5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, 0F, 0F, 0F); // Box 397
		bodyModel[282].setRotationPoint(-38.5F, -1F, 3F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 mu plug
		bodyModel[283].setRotationPoint(-38.75F, -1F, -5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399 mu plug
		bodyModel[284].setRotationPoint(-38.75F, -1F, 3F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188
		bodyModel[285].setRotationPoint(38.5F, -5F, -5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[286].setRotationPoint(38.75F, -5F, -5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[287].setRotationPoint(38.75F, -3F, -5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188
		bodyModel[288].setRotationPoint(38.5F, -5F, 3F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[289].setRotationPoint(38.75F, -5F, 3F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[290].setRotationPoint(38.75F, -3F, 3F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 392
		bodyModel[291].setRotationPoint(38.5F, -1F, -5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.75F); // Box 393
		bodyModel[292].setRotationPoint(38.5F, -1F, 3F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394 mu plug
		bodyModel[293].setRotationPoint(38.75F, -1F, -5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 395 mu plug
		bodyModel[294].setRotationPoint(38.75F, -1F, 3F);

		bodyModel[295].addBox(0F, 0F, 0F, 10, 2, 8, 0F); // Box 196 winterization hatch
		bodyModel[295].setRotationPoint(11F, -21.75F, -4F);

		bodyModel[296].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 44
		bodyModel[296].setRotationPoint(-31.5F, -1F, -11F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[297].setRotationPoint(-32.5F, -3F, -11F);

		bodyModel[298].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 516
		bodyModel[298].setRotationPoint(-31.5F, -3F, -11F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[299].setRotationPoint(-32.5F, -3F, 11F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[300].setRotationPoint(-19.7F, -13F, 1F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[301].setRotationPoint(-26.4F, -11F, 3F);
		bodyModel[301].rotateAngleY = -0.45378561F;

		bodyModel[302].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[302].setRotationPoint(-26.4F, -13F, 3F);
		bodyModel[302].rotateAngleY = -0.45378561F;

		bodyModel[303].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[303].setRotationPoint(-26.4F, -7F, 3F);
		bodyModel[303].rotateAngleY = -0.45378561F;

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78 bell normal
		bodyModel[304].setRotationPoint(-11.25F, 3.5F, -10.25F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 bell normal
		bodyModel[305].setRotationPoint(-11.5F, 2F, -10.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114 bell normal
		bodyModel[306].setRotationPoint(-11.5F, 3F, -10.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 351 sandcap
		bodyModel[307].setRotationPoint(33.5F, -20.5F, -1F);

		bodyModel[308].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 352 ane lightbox holder
		bodyModel[308].setRotationPoint(-29.5F, -24F, -2F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 353 ane highbeam f
		bodyModel[309].setRotationPoint(-29.75F, -24F, -2F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 354 ane highbeam f
		bodyModel[310].setRotationPoint(-29.75F, -24F, 0F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[311].setRotationPoint(-26F, -23F, 5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[312].setRotationPoint(-26F, -23.5F, 5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[313].setRotationPoint(-26F, -23.5F, 5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[314].setRotationPoint(-26F, -23.5F, 5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[315].setRotationPoint(-26F, -23.5F, 5F);

		bodyModel[316].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 274 exhausting TWO
		bodyModel[316].setRotationPoint(-4F, -23F, -3F);

		bodyModel[317].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 522 additional horn
		bodyModel[317].setRotationPoint(-28.25F, -23.5F, 4F);

		bodyModel[318].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 523 additional horn
		bodyModel[318].setRotationPoint(-27F, -22.5F, 3F);

		bodyModel[319].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 524 additional horn
		bodyModel[319].setRotationPoint(-27F, -23.5F, 3F);

		bodyModel[320].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 525 additional horn
		bodyModel[320].setRotationPoint(-28.75F, -23.5F, 2F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, -0.125F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -3.125F, 0F, -2F, -3.125F, 0F, -2F, -3.125F, 0F, 0F, -3.125F, 0F); // Box 635 locomotive plate
		bodyModel[321].setRotationPoint(-28.5F, -2F, -11.02F);

		bodyModel[322].addShapeBox(-2F, 0F, 0F, 4, 6, 0, 0F,0F, -0.125F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -3.125F, 0F, -2F, -3.125F, 0F, -2F, -3.125F, 0F, 0F, -3.125F, 0F); // Box 636 locomotive plate
		bodyModel[322].setRotationPoint(-29F, -2F, 11.02F);
		bodyModel[322].rotateAngleY = -3.14159265F;

		bodyModel[323].addBox(0F, 0F, 0F, 16, 2, 22, 0F); // Box 489 small tank
		bodyModel[323].setRotationPoint(-7.5F, 4F, -11F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278 small tank
		bodyModel[324].setRotationPoint(-7.5F, 3F, -11F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281 small tank
		bodyModel[325].setRotationPoint(-7.5F, 6F, -11F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 16, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288 small tank
		bodyModel[326].setRotationPoint(-7.5F, 6F, -9F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315 small tank
		bodyModel[327].setRotationPoint(-7.5F, 3F, 7F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316 small tank
		bodyModel[328].setRotationPoint(-7.5F, 6F, 9F);

		bodyModel[329].addBox(0F, 0F, 0F, 16, 1, 14, 0F); // Box 559 small tank
		bodyModel[329].setRotationPoint(-7.5F, 3F, -7F);

		bodyModel[330].addBox(0F, 0F, 0F, 1, 14, 14, 0F); // Box 332 atsf gp30u window segment
		bodyModel[330].setRotationPoint(-26.5F, -17F, -7F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 314 headlight sp front b
		bodyModel[331].setRotationPoint(-35.9F, -11F, -2F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 315 headlight sp front a
		bodyModel[332].setRotationPoint(-35.9F, -11F, 0F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 nose gyra sp
		bodyModel[333].setRotationPoint(-36.1F, -13F, -1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 317 sp lightkit mount front gyra bloc
		bodyModel[334].setRotationPoint(-36.45F, -13F, -1.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20 sp lightkit mount front noselight bloc
		bodyModel[335].setRotationPoint(-35.65F, -11F, -2F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 344 sandcap if your sp
		bodyModel[336].setRotationPoint(-33.5F, -12.5F, -1F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0.15F, 1F, 0F, 0.15F, 1F, 0F, 0F, 1F, 0F); // Box 345 cull? sp nose gyra cope triangle
		bodyModel[337].setRotationPoint(-35.65F, -13F, -2F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 346
		bodyModel[338].setRotationPoint(-25.75F, -21F, -9.25F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[339].setRotationPoint(-25.75F, -22F, -9.25F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 348
		bodyModel[340].setRotationPoint(-25.5F, -20.5F, -9F);

		bodyModel[341].addShapeBox(0F, 0F, -2F, 0, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -2F, 0F, -4F, -2F); // Box 349 ssw bell holdy
		bodyModel[341].setRotationPoint(-26F, -23F, -7F);
		bodyModel[341].rotateAngleY = 0.38397244F;

		bodyModel[342].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 350
		bodyModel[342].setRotationPoint(-28.25F, -23.5F, 0.5F);

		bodyModel[343].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 351
		bodyModel[343].setRotationPoint(-27F, -22.5F, -0.5F);

		bodyModel[344].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 352
		bodyModel[344].setRotationPoint(-28.75F, -23.5F, -1.5F);

		bodyModel[345].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 353
		bodyModel[345].setRotationPoint(-27F, -23.5F, -0.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 354 EXHAUSTING 3
		bodyModel[346].setRotationPoint(-4F, -23.75F, -3F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 355 ssw shidder vent
		bodyModel[347].setRotationPoint(-30.5F, -12.5F, -6F);

		bodyModel[348].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 50
		bodyModel[348].setRotationPoint(-40.5F, 9F, -10F);

		bodyModel[349].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 456 cull mu receptical
		bodyModel[349].setRotationPoint(-39.5F, 7F, -10F);

		bodyModel[350].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 475
		bodyModel[350].setRotationPoint(38.5F, 9F, -10F);

		bodyModel[351].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 476 cull mu receptical
		bodyModel[351].setRotationPoint(38.5F, 7F, -10F);

		bodyModel[352].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 360
		bodyModel[352].setRotationPoint(-20F, -24F, 0F);

		bodyModel[353].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 456 cull mu receptical
		bodyModel[353].setRotationPoint(-39.5F, 7F, 3F);

		bodyModel[354].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 476 cull mu receptical
		bodyModel[354].setRotationPoint(38.5F, 7F, 3F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[355].setRotationPoint(-17.5F, -23.5F, 0.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[356].setRotationPoint(-17.5F, -24.5F, 0.5F);

		bodyModel[357].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 88 cull up literally put it to the side
		bodyModel[357].setRotationPoint(-18F, -22.5F, 0F);

		bodyModel[358].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[358].setRotationPoint(4F, -23.5F, -7.5F);

		bodyModel[359].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[359].setRotationPoint(5F, -23.25F, -6.5F);

		bodyModel[360].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[360].setRotationPoint(4.5F, -23.25F, -8.5F);

		bodyModel[361].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[361].setRotationPoint(6.5F, -22.5F, -7.5F);

		bodyModel[362].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[362].setRotationPoint(4.75F, -22.5F, -3F);

		bodyModel[363].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[363].setRotationPoint(5.75F, -22.25F, -2F);

		bodyModel[364].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[364].setRotationPoint(5.25F, -22.25F, -4F);

		bodyModel[365].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 330
		bodyModel[365].setRotationPoint(7.25F, -21.5F, -3F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[366].setRotationPoint(-38.5F, -3F, -5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.75F); // Box 377
		bodyModel[367].setRotationPoint(38.5F, -3F, 3F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[368].setRotationPoint(-28.5F, -23F, -1F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[369].setRotationPoint(-28.5F, -23.5F, -1F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[370].setRotationPoint(-28.5F, -23.5F, -1F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[371].setRotationPoint(-28.5F, -23.5F, -1F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[372].setRotationPoint(-28.5F, -23.5F, -1F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[373].setRotationPoint(-12F, 2F, 8.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, -0.55F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 384 extendo cab
		bodyModel[374].setRotationPoint(-12.5F, -19.25F, -9.25F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.125F, -0.5F, -0.875F, -1.125F, -0.5F, -0.55F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.55F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 385 extendo cab
		bodyModel[375].setRotationPoint(-12.5F, -19.25F, -11F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386 extendo cab
		bodyModel[376].setRotationPoint(-12.5F, -17F, -11F);

		bodyModel[377].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 387 extendo cab floor fill
		bodyModel[377].setRotationPoint(-13.5F, -3F, -11F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.1F, 0F, 0F); // Box 388 extendocab handrail
		bodyModel[378].setRotationPoint(-12.5F, -11F, -11.01F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 389 ssw/sp rear light mount
		bodyModel[379].setRotationPoint(36.75F, -23.5F, -1F);

		bodyModel[380].addBox(0F, 0F, 0F, 3, 5, 2, 0F); // Box 390 up 808 unibrow
		bodyModel[380].setRotationPoint(-31.5F, -22F, -1F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 391 up 808 headlight
		bodyModel[381].setRotationPoint(-31.75F, -22F, -1F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 392 up 808 headlight
		bodyModel[382].setRotationPoint(-31.75F, -20F, -1F);

		bodyModel[383].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 393 up 808 numberboard
		bodyModel[383].setRotationPoint(-29.05F, -19.05F, 6F);
		bodyModel[383].rotateAngleY = -0.4712389F;

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 394 up 808 unibrow
		bodyModel[384].setRotationPoint(-29.5F, -19F, 1F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 395 up 808 numberboard
		bodyModel[385].setRotationPoint(-29.05F, -19.05F, -6F);
		bodyModel[385].rotateAngleY = 0.4712389F;

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 2F, 0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 396 up 808 unibrow
		bodyModel[386].setRotationPoint(-29.5F, -19F, -7F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 397 up 808 unibrow
		bodyModel[387].setRotationPoint(-31.5F, -22F, -6F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2.5F, -0.25F, 0F); // Box 398 up 808 unibrow
		bodyModel[388].setRotationPoint(-31.5F, -22F, 1F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, -1.375F, -1F, 0F, -0.5F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 399 up 808 unibrow
		bodyModel[389].setRotationPoint(-29.5F, -22F, 6F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1.375F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 400 up 808 unibrow
		bodyModel[390].setRotationPoint(-29.5F, -22F, -7F);

		bodyModel[391].addBox(0F, 0F, 0F, 2, 5, 14, 0F); // Box 401 up 808 unibrow
		bodyModel[391].setRotationPoint(-28.5F, -22F, -7F);

		bodyModel[392].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 402 up 808 horn
		bodyModel[392].setRotationPoint(-29.5F, -23.5F, -0.5F);

		bodyModel[393].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 403 up 808 horn
		bodyModel[393].setRotationPoint(-29.5F, -22.5F, -0.5F);

		bodyModel[394].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 404 up 808 horn
		bodyModel[394].setRotationPoint(-31.25F, -23.5F, -1.5F);

		bodyModel[395].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 405 up 808 horn
		bodyModel[395].setRotationPoint(-30.75F, -23.5F, 0.5F);

		bodyModel[396].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 406
		bodyModel[396].setRotationPoint(-21.5F, -22.5F, -0.5F);

		bodyModel[397].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 407
		bodyModel[397].setRotationPoint(-23.25F, -23.5F, -1.5F);

		bodyModel[398].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 408
		bodyModel[398].setRotationPoint(-21.5F, -23.5F, -0.5F);

		bodyModel[399].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 409
		bodyModel[399].setRotationPoint(-22.75F, -23.5F, 0.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[400].setRotationPoint(-25.5F, -23.5F, -0.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[401].setRotationPoint(-25.5F, -24.5F, -0.5F);

		bodyModel[402].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 88 cull up blinky
		bodyModel[402].setRotationPoint(-26F, -22.5F, -1F);

		bodyModel[403].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 413
		bodyModel[403].setRotationPoint(-27F, -24F, 4F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[404].setRotationPoint(-40.5F, 3F, 2F);

		bodyModel[405].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[405].setRotationPoint(-40.5F, 3F, -8F);

		bodyModel[406].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 416
		bodyModel[406].setRotationPoint(20.5F, -21.75F, -4.5F);

		bodyModel[407].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 417
		bodyModel[407].setRotationPoint(18.75F, -22.75F, -5.5F);

		bodyModel[408].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 418
		bodyModel[408].setRotationPoint(19.25F, -22.75F, -3.5F);

		bodyModel[409].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[409].setRotationPoint(20.5F, -22.75F, -4.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 13, 10, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -6.5F, -5F, 0F, -6.5F, -5F, 0F, 0F, -5F, 0F); // Box 420
		bodyModel[410].setRotationPoint(-11.5F, -21F, -9.1F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F,0F, 0F, -1F, -6.5F, 0F, -1F, -6.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -2F, 0F, -6.5F, -2F, 0F, -6.5F, -2F, 0F, 0F, -2F, 0F); // Box 421
		bodyModel[411].setRotationPoint(-11.5F, -22F, -9.1F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F,0F, 0F, 0.1F, -6.5F, 0F, 0.1F, -6.5F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, -6.5F, -2F, 0F, -6.5F, -2F, 0F, 0F, -2F, 0F); // Box 422
		bodyModel[412].setRotationPoint(-11.5F, -22F, 8.1F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0F, -2F, -6.5F, 0F, -2F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1.9F, -6.5F, -2F, -1.9F, -6.5F, -2F, 0F, 0F, -2F, 0F); // Box 423
		bodyModel[413].setRotationPoint(-11.5F, -21F, 6.1F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6.5F, -3F, 0F, -6.5F, -3F, 0F, 0F, -3F, 0F); // Box 424
		bodyModel[414].setRotationPoint(-11.5F, -19F, 6.1F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 2F, -7F, -2.5F, 2F, -7F, -2.5F, -2F, 0F, -2.5F, -2F); // Box 425 dynamic radiator
		bodyModel[415].setRotationPoint(1F, -18.5F, 8.1F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -2F, -7F, -2.5F, -2F, -7F, -2.5F, 2F, 0F, -2.5F, 2F); // Box 426 dynamic radiator
		bodyModel[416].setRotationPoint(1F, -18.5F, -9.1F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 224 gyra rear sp/ssw
		bodyModel[417].setRotationPoint(38.75F, -21.5F, -1F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 225 sp rear gyra mount
		bodyModel[418].setRotationPoint(37.5F, -21.5F, -1F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 226 gyra rear sp/ssw
		bodyModel[419].setRotationPoint(38.75F, -19.5F, -1F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, -0.25F, -0.1F, 0.25F, -0.25F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, -0.25F, -0.1F, 0.25F); // Box 440 rear e gyra BOX sp/ssw
		bodyModel[420].setRotationPoint(37.5F, -23.5F, -1F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 441 rear e gyra sp
		bodyModel[421].setRotationPoint(38.75F, -23.5F, -1F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 442 acl peanor light
		bodyModel[422].setRotationPoint(35.75F, -21.5F, -1F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 443 rear gyra acl peenor
		bodyModel[423].setRotationPoint(37F, -21.5F, -1F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 444 rear gyra acl peenor
		bodyModel[424].setRotationPoint(37F, -19.5F, -1F);

		bodyModel[425].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 445 cab bit dont forget me
		bodyModel[425].setRotationPoint(-13.5F, -20F, 6F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479 cull
		bodyModel[426].setRotationPoint(38.5F, 8F, -2F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447 cull
		bodyModel[427].setRotationPoint(-39.5F, 8F, -2F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, 0F, 0F, 0F); // Box 448
		bodyModel[428].setRotationPoint(-38.5F, -3F, 3F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 449
		bodyModel[429].setRotationPoint(38.5F, -3F, -5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, -0.9F, 0F, -6.5F, -0.9F, 0F, -6.5F, -0.9F, -2F, 0F, -0.9F, -2F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, -2F, 0F, 0F, -2F); // Box 450
		bodyModel[430].setRotationPoint(-11.5F, -19.9F, 7.1F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0.1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -2F, 0F, 0F, 2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 2F, 0F); // Box 451
		bodyModel[431].setRotationPoint(-30.5F, -11F, -11.01F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 20, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452 pheleps dodge tonk
		bodyModel[432].setRotationPoint(-9.5F, 3F, -5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 453 pheleps dodge tonk
		bodyModel[433].setRotationPoint(-9.5F, 8F, -3F);

		bodyModel[434].addShapeBox(-6F, 0F, 1F, 1, 0, 3, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 0.55F, 0F, -0.45F, -1F, 0F, -1F, -4F, 0F, 0F, 4F, 0F, 0F, 0.55F, 0F, -0.45F, -1F, 0F, -1F); // Box 34
		bodyModel[434].setRotationPoint(29F, -20.01F, 7F);
		bodyModel[434].rotateAngleZ = -1.57079633F;

		bodyModel[435].addShapeBox(-6F, 0F, -4F, 1, 0, 3, 0F,-1F, 0F, -1F, 0.55F, 0F, -0.45F, 4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, -1F, 0.55F, 0F, -0.45F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 34
		bodyModel[435].setRotationPoint(29F, -20.01F, -7F);
		bodyModel[435].rotateAngleZ = -1.57079633F;

		bodyModel[436].addShapeBox(-4F, 0F, 1F, 1, 0, 4, 0F,4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 34
		bodyModel[436].setRotationPoint(29F, -20.01F, 7F);
		bodyModel[436].rotateAngleZ = -1.57079633F;

		bodyModel[437].addShapeBox(-4F, 0F, -5F, 1, 0, 4, 0F,0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 34
		bodyModel[437].setRotationPoint(29F, -20.01F, -7F);
		bodyModel[437].rotateAngleZ = -1.57079633F;

		bodyModel[438].addBox(-8F, 0F, -1F, 8, 0, 16, 0F); // Box 34
		bodyModel[438].setRotationPoint(29F, -20.01F, -7F);
		bodyModel[438].rotateAngleZ = -1.57079633F;

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[439].setRotationPoint(-4F, -19.25F, -10.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[440].setRotationPoint(-4F, -20.25F, -10.5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[441].setRotationPoint(-3.75F, -18.75F, -10.25F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[442].setRotationPoint(-4F, -21.25F, -10.3F);

		bodyModel[443].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 333
		bodyModel[443].setRotationPoint(-27F, -20.5F, 7F);

		bodyModel[444].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 335
		bodyModel[444].setRotationPoint(-25.5F, -21F, 8F);

		bodyModel[445].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 336
		bodyModel[445].setRotationPoint(-26.5F, -20.5F, 9F);

		bodyModel[446].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 745
		bodyModel[446].setRotationPoint(20.5F, -22F, 2.5F);

		bodyModel[447].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 746
		bodyModel[447].setRotationPoint(18F, -23F, 2.5F);

		bodyModel[448].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 747
		bodyModel[448].setRotationPoint(19F, -22.75F, 3.5F);

		bodyModel[449].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 748
		bodyModel[449].setRotationPoint(19.5F, -22.75F, 1.5F);

		bodyModel[450].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 745
		bodyModel[450].setRotationPoint(11.5F, -21.5F, -0.5F);

		bodyModel[451].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 746
		bodyModel[451].setRotationPoint(9F, -22.5F, -0.5F);

		bodyModel[452].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 747
		bodyModel[452].setRotationPoint(10F, -22.25F, 0.5F);

		bodyModel[453].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 748
		bodyModel[453].setRotationPoint(10.5F, -22.25F, -1.5F);

		bodyModel[454].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 457
		bodyModel[454].setRotationPoint(-26F, -21F, -9.5F);

		bodyModel[455].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 458
		bodyModel[455].setRotationPoint(-27F, -21F, -8.5F);

		bodyModel[456].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 459
		bodyModel[456].setRotationPoint(-26F, -21F, 8.5F);

		bodyModel[457].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 460
		bodyModel[457].setRotationPoint(-27F, -21F, 7.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[458].setRotationPoint(-26.1F, -23F, 0F);

		bodyModel[459].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 462
		bodyModel[459].setRotationPoint(-23.5F, -21.25F, -8.5F);

		bodyModel[460].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 470
		bodyModel[460].setRotationPoint(-21.5F, -21F, -9.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 471
		bodyModel[461].setRotationPoint(-20F, -20F, -9.5F);

		bodyModel[462].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[462].setRotationPoint(-21F, -24F, -4F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[463].setRotationPoint(-26F, -23.5F, -6F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[464].setRotationPoint(-26F, -23.5F, -6F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[465].setRotationPoint(-26F, -23.5F, -6F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[466].setRotationPoint(-26F, -23.5F, -6F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[467].setRotationPoint(-26F, -23F, -6F);

		bodyModel[468].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 478
		bodyModel[468].setRotationPoint(-20F, -21F, -8.5F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 525 snowshield cull
		bodyModel[469].setRotationPoint(-12.5F, -22F, -11F);

		bodyModel[470].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 481 snowshield cull
		bodyModel[470].setRotationPoint(-12.5F, -19.5F, -11F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482 snowshield bit
		bodyModel[471].setRotationPoint(-12.5F, -22F, -9F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 525 snowshield cull
		bodyModel[472].setRotationPoint(-12.5F, -22F, 8F);

		bodyModel[473].addBox(0F, 0F, 0F, 8, 2, 4, 0F); // Box 481 snowshield cull
		bodyModel[473].setRotationPoint(-12.5F, -19.5F, 7F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 482 snowshield bit
		bodyModel[474].setRotationPoint(-12.5F, -22F, 8F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486 UP THING (UP 848 for example)
		bodyModel[475].setRotationPoint(-0.5F, -22F, -6F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 487 UP THING
		bodyModel[476].setRotationPoint(0.5F, -22F, -6F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488 UP THING
		bodyModel[477].setRotationPoint(0.5F, -22F, 2F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 489 add thsi for gp30u
		bodyModel[478].setRotationPoint(-26.5F, -21F, -6F);

		bodyModel[479].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator gp30u
		bodyModel[479].setRotationPoint(-25F, -23.8F, -4F);

		bodyModel[480].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 418 cull platform atsf
		bodyModel[480].setRotationPoint(-19F, -24F, -2.5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[481].setRotationPoint(-18.25F, -25F, 0F);

		bodyModel[482].addBox(0F, 0F, 0F, 16, 2, 0, 0F); // Box 493
		bodyModel[482].setRotationPoint(-14F, -23.75F, -5.99F);

		bodyModel[483].addBox(0F, 0F, 0F, 16, 2, 0, 0F); // Box 494
		bodyModel[483].setRotationPoint(-14F, -23.75F, 5.99F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[484].setRotationPoint(-22.5F, -16F, 10F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[485].setRotationPoint(-22.5F, -17F, 10F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 cull aww
		bodyModel[486].setRotationPoint(-22.5F, -16F, -15F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[487].setRotationPoint(-22.5F, -17F, -13F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[488].setRotationPoint(13F, -19.25F, -9F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 500
		bodyModel[489].setRotationPoint(13F, -20.25F, -8.8F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 501
		bodyModel[490].setRotationPoint(13F, -18.25F, -9F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 502
		bodyModel[491].setRotationPoint(13.25F, -17.75F, -8.75F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 276
		bodyModel[492].setRotationPoint(21.5F, -21F, -2F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 354 gong bell WCFB ESTUPIDO
		bodyModel[493].setRotationPoint(-32F, -2F, 8F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[494].setRotationPoint(-12.5F, -3F, 11.01F);

		bodyModel[495].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 505
		bodyModel[495].setRotationPoint(-13.5F, -3F, 11.01F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506 cull
		bodyModel[496].setRotationPoint(-26F, -22F, 6F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f1
		bodyModel[497].setRotationPoint(-38.75F, -2F, 3F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f1
		bodyModel[498].setRotationPoint(-38.75F, -2F, -5F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411 
		bodyModel[499].setRotationPoint(-38.5F, -2F, 3F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 40, 124, textureX, textureY); // Box 410 colonel meeber gascons ditchlight megamounting symposiom for the hard of hearing (or seeing in this case), refreshments included
		bodyModel[501] = new ModelRendererTurbo(this, 47, 124, textureX, textureY, "cull"); // Box 419 cull
		bodyModel[502] = new ModelRendererTurbo(this, 47, 119, textureX, textureY, BoxName.ditch); // Box 418 ditchlight f2
		bodyModel[503] = new ModelRendererTurbo(this, 47, 124, textureX, textureY, "cull"); // Box 417 cull
		bodyModel[504] = new ModelRendererTurbo(this, 47, 119, textureX, textureY, BoxName.ditch); // Box 416 ditchlight f2
		bodyModel[505] = new ModelRendererTurbo(this, 315, 205, textureX, textureY, BoxName.ditch); // Box 417 ditchlight r1
		bodyModel[506] = new ModelRendererTurbo(this, 315, 205, textureX, textureY, BoxName.ditch); // Box 416 ditchlight r1
		bodyModel[507] = new ModelRendererTurbo(this, 315, 210, textureX, textureY); // Box 415
		bodyModel[508] = new ModelRendererTurbo(this, 315, 210, textureX, textureY); // Box 414
		bodyModel[509] = new ModelRendererTurbo(this, 308, 205, textureX, textureY, BoxName.ditch); // Box 389 ditchlight r2
		bodyModel[510] = new ModelRendererTurbo(this, 308, 205, textureX, textureY, BoxName.ditch); // Box 388 ditchlight r2
		bodyModel[511] = new ModelRendererTurbo(this, 308, 210, textureX, textureY, "cull"); // Box 387 cull
		bodyModel[512] = new ModelRendererTurbo(this, 308, 210, textureX, textureY, "cull"); // Box 386 cull
		bodyModel[513] = new ModelRendererTurbo(this, 225, 31, textureX, textureY); // Box 570
		bodyModel[514] = new ModelRendererTurbo(this, 225, 37, textureX, textureY); // Box 567
		bodyModel[515] = new ModelRendererTurbo(this, 220, 37, textureX, textureY); // Box 895
		bodyModel[516] = new ModelRendererTurbo(this, 225, 34, textureX, textureY); // Box 894
		bodyModel[517] = new ModelRendererTurbo(this, 422, 237, textureX, textureY); // Box 517
		bodyModel[518] = new ModelRendererTurbo(this, 381, 225, textureX, textureY); // Box 518
		bodyModel[519] = new ModelRendererTurbo(this, 435, 236, textureX, textureY); // Box 519
		bodyModel[520] = new ModelRendererTurbo(this, 394, 224, textureX, textureY); // Box 520
		bodyModel[521] = new ModelRendererTurbo(this, 405, 222, textureX, textureY); // Box 521
		bodyModel[522] = new ModelRendererTurbo(this, 446, 234, textureX, textureY); // Box 522
		bodyModel[523] = new ModelRendererTurbo(this, 457, 232, textureX, textureY); // Box 523
		bodyModel[524] = new ModelRendererTurbo(this, 416, 220, textureX, textureY); // Box 524
		bodyModel[525] = new ModelRendererTurbo(this, 50, 227, textureX, textureY); // Box 525
		bodyModel[526] = new ModelRendererTurbo(this, 108, 235, textureX, textureY); // Box 526
		bodyModel[527] = new ModelRendererTurbo(this, 232, 75, textureX, textureY); // Box 527
		bodyModel[528] = new ModelRendererTurbo(this, 50, 158, textureX, textureY); // Box 528 arr mu plug holder
		bodyModel[529] = new ModelRendererTurbo(this, 344, 242, textureX, textureY); // Box 529 arr mu mount

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410 colonel meeber gascons ditchlight megamounting symposiom for the hard of hearing (or seeing in this case), refreshments included
		bodyModel[500].setRotationPoint(-38.5F, -2F, -5F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419 cull
		bodyModel[501].setRotationPoint(-38F, 2F, 3.75F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 ditchlight f2
		bodyModel[502].setRotationPoint(-38.25F, 2F, 3.75F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417 cull
		bodyModel[503].setRotationPoint(-38F, 2F, -5.75F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 ditchlight f2
		bodyModel[504].setRotationPoint(-38.25F, 2F, -5.75F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 417 ditchlight r1
		bodyModel[505].setRotationPoint(38.75F, -2F, 3F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 416 ditchlight r1
		bodyModel[506].setRotationPoint(38.75F, -2F, -5F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 415
		bodyModel[507].setRotationPoint(38.5F, -2F, -5F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 414
		bodyModel[508].setRotationPoint(38.5F, -2F, 3F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 389 ditchlight r2
		bodyModel[509].setRotationPoint(38.25F, 2F, 3.75F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 ditchlight r2
		bodyModel[510].setRotationPoint(38.25F, 2F, -5.75F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 387 cull
		bodyModel[511].setRotationPoint(38F, 2F, -5.75F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 386 cull
		bodyModel[512].setRotationPoint(38F, 2F, 3.75F);

		bodyModel[513].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 570
		bodyModel[513].setRotationPoint(30.5F, -21.75F, 5.5F);

		bodyModel[514].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 567
		bodyModel[514].setRotationPoint(32F, -21.75F, 3.5F);

		bodyModel[515].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895
		bodyModel[515].setRotationPoint(32F, -21F, 4.5F);

		bodyModel[516].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894
		bodyModel[516].setRotationPoint(32F, -22F, 4.5F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 517
		bodyModel[517].setRotationPoint(40.5F, 6F, 0F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 518
		bodyModel[518].setRotationPoint(40.5F, 6F, -10F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 519
		bodyModel[519].setRotationPoint(40.5F, 4F, 2F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[520].setRotationPoint(40.5F, 4F, -10F);

		bodyModel[521].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[521].setRotationPoint(40.5F, 4F, -8F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 522
		bodyModel[522].setRotationPoint(40.5F, 4F, 2F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 523
		bodyModel[523].setRotationPoint(40.5F, 3F, 2F);

		bodyModel[524].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 524
		bodyModel[524].setRotationPoint(40.5F, 3F, -8F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 525
		bodyModel[525].setRotationPoint(-40.5F, 6F, 0F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[526].setRotationPoint(-40.5F, 6F, -10F);

		bodyModel[527].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 527
		bodyModel[527].setRotationPoint(-24F, -24F, 0F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 528 arr mu plug holder
		bodyModel[528].setRotationPoint(-38.5F, -5F, -5F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 529 arr mu mount
		bodyModel[529].setRotationPoint(38.5F, -5F, 3F);
	}
	ModelBlombergBnew theBlombi = new ModelBlombergBnew();
	ModelTypeBnew theB = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 14 || GetColor(entity) == 5
				|| GetColor(entity) == 1348) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.75, 0, 0);//rear
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 16 ||GetColor(entity) == 11
				||GetColor(entity) == 28){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 4 || GetColor(entity) == 26){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/BlombergB_csxbleu.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.75, 0, 0);//rear
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 27){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Espee.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.75, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}