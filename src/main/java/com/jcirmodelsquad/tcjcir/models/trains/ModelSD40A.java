//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.08.2022 - 16:45:29
// Last changed on: 17.08.2022 - 16:45:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Late;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Mid;
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

public class ModelSD40A extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSD40A() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[365];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 284, 64, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 12, 125, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 284, 70, textureX, textureY); // Box 159
		bodyModel[3] = new ModelRendererTurbo(this, 12, 135, textureX, textureY); // Box 226
		bodyModel[4] = new ModelRendererTurbo(this, 10, 131, textureX, textureY); // Box 227
		bodyModel[5] = new ModelRendererTurbo(this, 53, 152, textureX, textureY); // Box 164
		bodyModel[6] = new ModelRendererTurbo(this, 1, 152, textureX, textureY); // Box 259
		bodyModel[7] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 262
		bodyModel[8] = new ModelRendererTurbo(this, 53, 160, textureX, textureY); // Box 264
		bodyModel[9] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 265
		bodyModel[10] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 261
		bodyModel[11] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 274
		bodyModel[12] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 451
		bodyModel[13] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 272
		bodyModel[14] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 273
		bodyModel[15] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 275
		bodyModel[16] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 276
		bodyModel[17] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 333
		bodyModel[18] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 334
		bodyModel[19] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 335
		bodyModel[20] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 336
		bodyModel[21] = new ModelRendererTurbo(this, 266, 92, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 459, 154, textureX, textureY); // Box 408
		bodyModel[23] = new ModelRendererTurbo(this, 264, 123, textureX, textureY); // Box 63
		bodyModel[24] = new ModelRendererTurbo(this, 264, 76, textureX, textureY); // Box 170
		bodyModel[25] = new ModelRendererTurbo(this, 285, 114, textureX, textureY); // Box 129
		bodyModel[26] = new ModelRendererTurbo(this, 488, 170, textureX, textureY); // Box 130
		bodyModel[27] = new ModelRendererTurbo(this, 282, 114, textureX, textureY); // Box 133
		bodyModel[28] = new ModelRendererTurbo(this, 489, 166, textureX, textureY); // Box 134
		bodyModel[29] = new ModelRendererTurbo(this, 300, 114, textureX, textureY); // Box 192
		bodyModel[30] = new ModelRendererTurbo(this, 297, 114, textureX, textureY); // Box 193
		bodyModel[31] = new ModelRendererTurbo(this, 488, 170, textureX, textureY); // Box 194
		bodyModel[32] = new ModelRendererTurbo(this, 489, 166, textureX, textureY); // Box 195
		bodyModel[33] = new ModelRendererTurbo(this, 248, 81, textureX, textureY); // Box 4
		bodyModel[34] = new ModelRendererTurbo(this, 487, 100, textureX, textureY); // Box 203
		bodyModel[35] = new ModelRendererTurbo(this, 459, 154, textureX, textureY); // Box 100
		bodyModel[36] = new ModelRendererTurbo(this, 371, 109, textureX, textureY); // Box 113
		bodyModel[37] = new ModelRendererTurbo(this, 357, 114, textureX, textureY); // Box 116
		bodyModel[38] = new ModelRendererTurbo(this, 312, 109, textureX, textureY); // Box 196
		bodyModel[39] = new ModelRendererTurbo(this, 360, 114, textureX, textureY); // Box 197
		bodyModel[40] = new ModelRendererTurbo(this, 371, 109, textureX, textureY); // Box 111
		bodyModel[41] = new ModelRendererTurbo(this, 357, 114, textureX, textureY); // Box 112
		bodyModel[42] = new ModelRendererTurbo(this, 312, 109, textureX, textureY); // Box 113
		bodyModel[43] = new ModelRendererTurbo(this, 360, 114, textureX, textureY); // Box 114
		bodyModel[44] = new ModelRendererTurbo(this, 261, 74, textureX, textureY); // Box 163
		bodyModel[45] = new ModelRendererTurbo(this, 405, 113, textureX, textureY); // Box 166
		bodyModel[46] = new ModelRendererTurbo(this, 208, 177, textureX, textureY); // Box 489
		bodyModel[47] = new ModelRendererTurbo(this, 310, 153, textureX, textureY); // Box 278
		bodyModel[48] = new ModelRendererTurbo(this, 311, 159, textureX, textureY); // Box 281
		bodyModel[49] = new ModelRendererTurbo(this, 212, 181, textureX, textureY); // Box 288
		bodyModel[50] = new ModelRendererTurbo(this, 310, 172, textureX, textureY); // Box 315
		bodyModel[51] = new ModelRendererTurbo(this, 311, 165, textureX, textureY); // Box 316
		bodyModel[52] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Box 559
		bodyModel[53] = new ModelRendererTurbo(this, 185, 154, textureX, textureY); // Box 564
		bodyModel[54] = new ModelRendererTurbo(this, 186, 166, textureX, textureY); // Box 565
		bodyModel[55] = new ModelRendererTurbo(this, 181, 150, textureX, textureY); // Box 566
		bodyModel[56] = new ModelRendererTurbo(this, 184, 161, textureX, textureY); // Box 567
		bodyModel[57] = new ModelRendererTurbo(this, 187, 156, textureX, textureY); // Box 568
		bodyModel[58] = new ModelRendererTurbo(this, 184, 161, textureX, textureY); // Box 569
		bodyModel[59] = new ModelRendererTurbo(this, 186, 166, textureX, textureY); // Box 570
		bodyModel[60] = new ModelRendererTurbo(this, 227, 149, textureX, textureY); // Box 571
		bodyModel[61] = new ModelRendererTurbo(this, 226, 161, textureX, textureY); // Box 572
		bodyModel[62] = new ModelRendererTurbo(this, 223, 145, textureX, textureY); // Box 573
		bodyModel[63] = new ModelRendererTurbo(this, 226, 156, textureX, textureY); // Box 574
		bodyModel[64] = new ModelRendererTurbo(this, 280, 176, textureX, textureY); // Box 576
		bodyModel[65] = new ModelRendererTurbo(this, 278, 171, textureX, textureY); // Box 577
		bodyModel[66] = new ModelRendererTurbo(this, 272, 152, textureX, textureY); // Box 562
		bodyModel[67] = new ModelRendererTurbo(this, 311, 177, textureX, textureY); // Box 563
		bodyModel[68] = new ModelRendererTurbo(this, 281, 166, textureX, textureY); // Box 575
		bodyModel[69] = new ModelRendererTurbo(this, 330, 137, textureX, textureY); // Box 436
		bodyModel[70] = new ModelRendererTurbo(this, 325, 137, textureX, textureY); // Box 437
		bodyModel[71] = new ModelRendererTurbo(this, 330, 142, textureX, textureY); // Box 438
		bodyModel[72] = new ModelRendererTurbo(this, 325, 142, textureX, textureY); // Box 439
		bodyModel[73] = new ModelRendererTurbo(this, 51, 18, textureX, textureY); // Box 52 door swing right
		bodyModel[74] = new ModelRendererTurbo(this, 83, 4, textureX, textureY); // Box 70
		bodyModel[75] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 72
		bodyModel[76] = new ModelRendererTurbo(this, 30, 6, textureX, textureY); // Box 190
		bodyModel[77] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 313
		bodyModel[78] = new ModelRendererTurbo(this, 69, 18, textureX, textureY); // Box 314 door swing right
		bodyModel[79] = new ModelRendererTurbo(this, 101, 23, textureX, textureY); // Box 316
		bodyModel[80] = new ModelRendererTurbo(this, 93, 37, textureX, textureY); // Box 11
		bodyModel[81] = new ModelRendererTurbo(this, 27, 37, textureX, textureY); // Box 210
		bodyModel[82] = new ModelRendererTurbo(this, 66, 23, textureX, textureY); // Box 211
		bodyModel[83] = new ModelRendererTurbo(this, 34, 23, textureX, textureY); // Box 219
		bodyModel[84] = new ModelRendererTurbo(this, 119, 6, textureX, textureY); // Box 220
		bodyModel[85] = new ModelRendererTurbo(this, 104, 12, textureX, textureY); // Box 221
		bodyModel[86] = new ModelRendererTurbo(this, 104, 4, textureX, textureY); // Box 222
		bodyModel[87] = new ModelRendererTurbo(this, 34, 41, textureX, textureY); // Box 223
		bodyModel[88] = new ModelRendererTurbo(this, 86, 41, textureX, textureY); // Box 224
		bodyModel[89] = new ModelRendererTurbo(this, 303, 1, textureX, textureY); // Box 273
		bodyModel[90] = new ModelRendererTurbo(this, 340, 3, textureX, textureY); // Box 275
		bodyModel[91] = new ModelRendererTurbo(this, 357, 3, textureX, textureY); // Box 278
		bodyModel[92] = new ModelRendererTurbo(this, 376, 5, textureX, textureY); // Box 280
		bodyModel[93] = new ModelRendererTurbo(this, 387, 22, textureX, textureY); // Box 100
		bodyModel[94] = new ModelRendererTurbo(this, 387, 15, textureX, textureY); // Box 101
		bodyModel[95] = new ModelRendererTurbo(this, 414, 22, textureX, textureY); // Box 103
		bodyModel[96] = new ModelRendererTurbo(this, 414, 15, textureX, textureY); // Box 104
		bodyModel[97] = new ModelRendererTurbo(this, 478, 84, textureX, textureY); // Box 31
		bodyModel[98] = new ModelRendererTurbo(this, 487, 90, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[99] = new ModelRendererTurbo(this, 487, 90, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[100] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 247 headlight rear 2 beam
		bodyModel[101] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 248 headlight rear 2 beam
		bodyModel[102] = new ModelRendererTurbo(this, 482, 99, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[103] = new ModelRendererTurbo(this, 475, 99, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[104] = new ModelRendererTurbo(this, 313, 116, textureX, textureY); // Box 36
		bodyModel[105] = new ModelRendererTurbo(this, 305, 50, textureX, textureY); // Box 271
		bodyModel[106] = new ModelRendererTurbo(this, 305, 45, textureX, textureY); // Box 272
		bodyModel[107] = new ModelRendererTurbo(this, 311, 33, textureX, textureY); // Box 270
		bodyModel[108] = new ModelRendererTurbo(this, 90, 113, textureX, textureY); // Box 245
		bodyModel[109] = new ModelRendererTurbo(this, 89, 103, textureX, textureY); // Box 246
		bodyModel[110] = new ModelRendererTurbo(this, 378, 22, textureX, textureY); // Box 879 dynamics short
		bodyModel[111] = new ModelRendererTurbo(this, 378, 15, textureX, textureY); // Box 880 dynamics short
		bodyModel[112] = new ModelRendererTurbo(this, 34, 2, textureX, textureY); // box65
		bodyModel[113] = new ModelRendererTurbo(this, 17, 101, textureX, textureY); // Box 352
		bodyModel[114] = new ModelRendererTurbo(this, 23, 92, textureX, textureY); // Box 353
		bodyModel[115] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 354
		bodyModel[116] = new ModelRendererTurbo(this, 3, 73, textureX, textureY); // Box 356
		bodyModel[117] = new ModelRendererTurbo(this, 31, 73, textureX, textureY); // Box 357
		bodyModel[118] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 355
		bodyModel[119] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 296 nose cover
		bodyModel[120] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Box 299 nose cover
		bodyModel[121] = new ModelRendererTurbo(this, 2, 45, textureX, textureY); // Box 43
		bodyModel[122] = new ModelRendererTurbo(this, 44, 46, textureX, textureY); // Box 43
		bodyModel[123] = new ModelRendererTurbo(this, 75, 54, textureX, textureY); // Box 43
		bodyModel[124] = new ModelRendererTurbo(this, 119, 61, textureX, textureY); // Box 43
		bodyModel[125] = new ModelRendererTurbo(this, 119, 64, textureX, textureY); // Box 43
		bodyModel[126] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[127] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[128] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 48
		bodyModel[129] = new ModelRendererTurbo(this, 78, 47, textureX, textureY); // Box 48
		bodyModel[130] = new ModelRendererTurbo(this, 82, 49, textureX, textureY); // Box 43
		bodyModel[131] = new ModelRendererTurbo(this, 62, 44, textureX, textureY); // Box 44
		bodyModel[132] = new ModelRendererTurbo(this, 65, 55, textureX, textureY); // Box 133
		bodyModel[133] = new ModelRendererTurbo(this, 104, 37, textureX, textureY, "lamp"); // Box 117 numberboard front
		bodyModel[134] = new ModelRendererTurbo(this, 93, 45, textureX, textureY, "lamp"); // Box 118 numberboard front
		bodyModel[135] = new ModelRendererTurbo(this, 118, 125, textureX, textureY); // Box 38R
		bodyModel[136] = new ModelRendererTurbo(this, 119, 136, textureX, textureY); // Box 176
		bodyModel[137] = new ModelRendererTurbo(this, 119, 134, textureX, textureY); // Box 313
		bodyModel[138] = new ModelRendererTurbo(this, 192, 134, textureX, textureY); // Box 315
		bodyModel[139] = new ModelRendererTurbo(this, 194, 136, textureX, textureY); // Box 316
		bodyModel[140] = new ModelRendererTurbo(this, 54, 129, textureX, textureY); // Box 81
		bodyModel[141] = new ModelRendererTurbo(this, 51, 129, textureX, textureY); // Box 81
		bodyModel[142] = new ModelRendererTurbo(this, 11, 129, textureX, textureY); // Box 176
		bodyModel[143] = new ModelRendererTurbo(this, 6, 129, textureX, textureY); // Box 177
		bodyModel[144] = new ModelRendererTurbo(this, 11, 136, textureX, textureY); // Box 61
		bodyModel[145] = new ModelRendererTurbo(this, 51, 136, textureX, textureY); // Box 63
		bodyModel[146] = new ModelRendererTurbo(this, 41, 134, textureX, textureY); // Box 144
		bodyModel[147] = new ModelRendererTurbo(this, 19, 134, textureX, textureY); // Box 148
		bodyModel[148] = new ModelRendererTurbo(this, 42, 133, textureX, textureY); // Box 363
		bodyModel[149] = new ModelRendererTurbo(this, 20, 133, textureX, textureY); // Box 870
		bodyModel[150] = new ModelRendererTurbo(this, 14, 136, textureX, textureY); // Box 559
		bodyModel[151] = new ModelRendererTurbo(this, 48, 136, textureX, textureY); // Box 143
		bodyModel[152] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 302
		bodyModel[153] = new ModelRendererTurbo(this, 21, 122, textureX, textureY); // Box 303
		bodyModel[154] = new ModelRendererTurbo(this, 34, 129, textureX, textureY); // Box 304
		bodyModel[155] = new ModelRendererTurbo(this, 37, 132, textureX, textureY); // Box 80
		bodyModel[156] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[157] = new ModelRendererTurbo(this, 23, 132, textureX, textureY); // Box 147
		bodyModel[158] = new ModelRendererTurbo(this, 35, 172, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[159] = new ModelRendererTurbo(this, 32, 166, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[160] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[161] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[162] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 5
		bodyModel[163] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[164] = new ModelRendererTurbo(this, 368, 178, textureX, textureY); // Box 225
		bodyModel[165] = new ModelRendererTurbo(this, 366, 174, textureX, textureY); // Box 207
		bodyModel[166] = new ModelRendererTurbo(this, 390, 180, textureX, textureY); // Box 204
		bodyModel[167] = new ModelRendererTurbo(this, 377, 176, textureX, textureY); // Box 202
		bodyModel[168] = new ModelRendererTurbo(this, 368, 168, textureX, textureY); // Box 3
		bodyModel[169] = new ModelRendererTurbo(this, 367, 151, textureX, textureY); // Box 164
		bodyModel[170] = new ModelRendererTurbo(this, 399, 151, textureX, textureY); // Box 259
		bodyModel[171] = new ModelRendererTurbo(this, 374, 149, textureX, textureY); // Box 261
		bodyModel[172] = new ModelRendererTurbo(this, 392, 149, textureX, textureY); // Box 262
		bodyModel[173] = new ModelRendererTurbo(this, 374, 156, textureX, textureY); // Box 264
		bodyModel[174] = new ModelRendererTurbo(this, 392, 156, textureX, textureY); // Box 265
		bodyModel[175] = new ModelRendererTurbo(this, 79, 139, textureX, textureY); // Box 541
		bodyModel[176] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 542
		bodyModel[177] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 543
		bodyModel[178] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 544
		bodyModel[179] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 545
		bodyModel[180] = new ModelRendererTurbo(this, 79, 134, textureX, textureY); // Box 546
		bodyModel[181] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 553
		bodyModel[182] = new ModelRendererTurbo(this, 70, 134, textureX, textureY); // Box 554
		bodyModel[183] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 555
		bodyModel[184] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 556
		bodyModel[185] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 557
		bodyModel[186] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 558
		bodyModel[187] = new ModelRendererTurbo(this, 407, 168, textureX, textureY); // Box 61
		bodyModel[188] = new ModelRendererTurbo(this, 367, 168, textureX, textureY); // Box 63
		bodyModel[189] = new ModelRendererTurbo(this, 375, 167, textureX, textureY); // Box 80
		bodyModel[190] = new ModelRendererTurbo(this, 397, 167, textureX, textureY); // Box 81
		bodyModel[191] = new ModelRendererTurbo(this, 380, 159, textureX, textureY); // Box 234
		bodyModel[192] = new ModelRendererTurbo(this, 375, 165, textureX, textureY); // Box 236
		bodyModel[193] = new ModelRendererTurbo(this, 397, 165, textureX, textureY); // Box 206
		bodyModel[194] = new ModelRendererTurbo(this, 402, 166, textureX, textureY); // Box 871
		bodyModel[195] = new ModelRendererTurbo(this, 372, 166, textureX, textureY); // Box 872
		bodyModel[196] = new ModelRendererTurbo(this, 404, 168, textureX, textureY); // Box 560
		bodyModel[197] = new ModelRendererTurbo(this, 370, 168, textureX, textureY); // Box 561
		bodyModel[198] = new ModelRendererTurbo(this, 410, 155, textureX, textureY); // Box 243
		bodyModel[199] = new ModelRendererTurbo(this, 407, 160, textureX, textureY); // Box 244
		bodyModel[200] = new ModelRendererTurbo(this, 367, 160, textureX, textureY); // Box 249
		bodyModel[201] = new ModelRendererTurbo(this, 362, 155, textureX, textureY); // Box 250
		bodyModel[202] = new ModelRendererTurbo(this, 326, 28, textureX, textureY); // Box 19 the hooh
		bodyModel[203] = new ModelRendererTurbo(this, 484, 34, textureX, textureY); // Box 40
		bodyModel[204] = new ModelRendererTurbo(this, 484, 5, textureX, textureY); // Box 41
		bodyModel[205] = new ModelRendererTurbo(this, 480, 80, textureX, textureY); // Box 351 sandcap
		bodyModel[206] = new ModelRendererTurbo(this, 117, 107, textureX, textureY); // Box 303
		bodyModel[207] = new ModelRendererTurbo(this, 113, 102, textureX, textureY); // Box 304
		bodyModel[208] = new ModelRendererTurbo(this, 112, 107, textureX, textureY); // Box 305
		bodyModel[209] = new ModelRendererTurbo(this, 108, 102, textureX, textureY); // Box 836
		bodyModel[210] = new ModelRendererTurbo(this, 332, 3, textureX, textureY); // Box 274 exhausting
		bodyModel[211] = new ModelRendererTurbo(this, 308, 15, textureX, textureY); // Box 285
		bodyModel[212] = new ModelRendererTurbo(this, 331, 15, textureX, textureY); // Box 286
		bodyModel[213] = new ModelRendererTurbo(this, 443, 13, textureX, textureY); // Box 518
		bodyModel[214] = new ModelRendererTurbo(this, 443, 13, textureX, textureY); // Box 253
		bodyModel[215] = new ModelRendererTurbo(this, 354, 22, textureX, textureY); // Box 102
		bodyModel[216] = new ModelRendererTurbo(this, 354, 15, textureX, textureY); // Box 105
		bodyModel[217] = new ModelRendererTurbo(this, 369, 22, textureX, textureY); // Box 881
		bodyModel[218] = new ModelRendererTurbo(this, 369, 15, textureX, textureY); // Box 882
		bodyModel[219] = new ModelRendererTurbo(this, 488, 127, textureX, textureY); // Box 444
		bodyModel[220] = new ModelRendererTurbo(this, 474, 123, textureX, textureY, "cull"); // Box 445
		bodyModel[221] = new ModelRendererTurbo(this, 485, 125, textureX, textureY); // Box 527 brakewheel rear
		bodyModel[222] = new ModelRendererTurbo(this, 150, 145, textureX, textureY); // Box 440 honse
		bodyModel[223] = new ModelRendererTurbo(this, 5, 175, textureX, textureY); // Box 396
		bodyModel[224] = new ModelRendererTurbo(this, 5, 187, textureX, textureY); // Box 397
		bodyModel[225] = new ModelRendererTurbo(this, 5, 170, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[226] = new ModelRendererTurbo(this, 5, 182, textureX, textureY); // Box 399 not a ditchlight will not glow
		bodyModel[227] = new ModelRendererTurbo(this, 5, 182, textureX, textureY); // Box 249
		bodyModel[228] = new ModelRendererTurbo(this, 150, 145, textureX, textureY); // Box 250
		bodyModel[229] = new ModelRendererTurbo(this, 5, 187, textureX, textureY); // Box 251
		bodyModel[230] = new ModelRendererTurbo(this, 5, 170, textureX, textureY); // Box 252
		bodyModel[231] = new ModelRendererTurbo(this, 5, 175, textureX, textureY); // Box 253
		bodyModel[232] = new ModelRendererTurbo(this, 390, 180, textureX, textureY); // Box 301
		bodyModel[233] = new ModelRendererTurbo(this, 161, 12, textureX, textureY); // Box 114
		bodyModel[234] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 74
		bodyModel[235] = new ModelRendererTurbo(this, 161, 15, textureX, textureY); // Box 78
		bodyModel[236] = new ModelRendererTurbo(this, 159, 6, textureX, textureY); // Box 245
		bodyModel[237] = new ModelRendererTurbo(this, 226, 12, textureX, textureY); // Box 364 prime base
		bodyModel[238] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[239] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[240] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[241] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[242] = new ModelRendererTurbo(this, 165, 51, textureX, textureY); // Box 184 o2 generator
		bodyModel[243] = new ModelRendererTurbo(this, 226, 50, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[244] = new ModelRendererTurbo(this, 226, 57, textureX, textureY, "cull"); // Box 562 cull ptc antenna shiz
		bodyModel[245] = new ModelRendererTurbo(this, 242, 51, textureX, textureY); // Box 563
		bodyModel[246] = new ModelRendererTurbo(this, 242, 58, textureX, textureY); // Box 564
		bodyModel[247] = new ModelRendererTurbo(this, 107, 149, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[248] = new ModelRendererTurbo(this, 98, 151, textureX, textureY); // Box 307
		bodyModel[249] = new ModelRendererTurbo(this, 119, 162, textureX, textureY); // Box 412
		bodyModel[250] = new ModelRendererTurbo(this, 96, 164, textureX, textureY); // Box 413
		bodyModel[251] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 86
		bodyModel[252] = new ModelRendererTurbo(this, 4, 182, textureX, textureY); // Box 22
		bodyModel[253] = new ModelRendererTurbo(this, 38, 182, textureX, textureY); // Box 23
		bodyModel[254] = new ModelRendererTurbo(this, 2, 170, textureX, textureY); // Box 4
		bodyModel[255] = new ModelRendererTurbo(this, 36, 170, textureX, textureY); // Box 4
		bodyModel[256] = new ModelRendererTurbo(this, 6, 160, textureX, textureY); // Box 280
		bodyModel[257] = new ModelRendererTurbo(this, 40, 160, textureX, textureY); // Box 285
		bodyModel[258] = new ModelRendererTurbo(this, 441, 188, textureX, textureY); // Box 1163
		bodyModel[259] = new ModelRendererTurbo(this, 424, 185, textureX, textureY); // Box 1164
		bodyModel[260] = new ModelRendererTurbo(this, 422, 173, textureX, textureY); // Box 1167
		bodyModel[261] = new ModelRendererTurbo(this, 439, 175, textureX, textureY); // Box 1168
		bodyModel[262] = new ModelRendererTurbo(this, 441, 165, textureX, textureY); // Box 1169
		bodyModel[263] = new ModelRendererTurbo(this, 426, 163, textureX, textureY); // Box 1170
		bodyModel[264] = new ModelRendererTurbo(this, 211, 30, textureX, textureY); // Box 361
		bodyModel[265] = new ModelRendererTurbo(this, 202, 31, textureX, textureY); // Box 362
		bodyModel[266] = new ModelRendererTurbo(this, 204, 37, textureX, textureY); // Box 363
		bodyModel[267] = new ModelRendererTurbo(this, 204, 34, textureX, textureY); // Box 364
		bodyModel[268] = new ModelRendererTurbo(this, 169, 12, textureX, textureY); // Box 114
		bodyModel[269] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 74
		bodyModel[270] = new ModelRendererTurbo(this, 169, 15, textureX, textureY); // Box 78
		bodyModel[271] = new ModelRendererTurbo(this, 168, 5, textureX, textureY); // Box 245
		bodyModel[272] = new ModelRendererTurbo(this, 1, 51, textureX, textureY, "lamp"); // Box 547 headlight nose low a
		bodyModel[273] = new ModelRendererTurbo(this, 8, 51, textureX, textureY, "lamp"); // Box 548 headlight nose low b
		bodyModel[274] = new ModelRendererTurbo(this, 79, 42, textureX, textureY, "lamp"); // Box 186 headlight standard
		bodyModel[275] = new ModelRendererTurbo(this, 72, 44, textureX, textureY, "lamp"); // Box 187 headlight standard
		bodyModel[276] = new ModelRendererTurbo(this, 86, 117, textureX, textureY); // Box 281
		bodyModel[277] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 282
		bodyModel[278] = new ModelRendererTurbo(this, 83, 107, textureX, textureY); // Box 283
		bodyModel[279] = new ModelRendererTurbo(this, 86, 107, textureX, textureY); // Box 284
		bodyModel[280] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 408
		bodyModel[281] = new ModelRendererTurbo(this, 76, 107, textureX, textureY); // Box 409
		bodyModel[282] = new ModelRendererTurbo(this, 453, 30, textureX, textureY, "cull"); // Box 196 winterization hatch cull
		bodyModel[283] = new ModelRendererTurbo(this, 82, 2, textureX, textureY); // box64
		bodyModel[284] = new ModelRendererTurbo(this, 73, 7, textureX, textureY); // Box 351
		bodyModel[285] = new ModelRendererTurbo(this, 55, 12, textureX, textureY); // Box 350
		bodyModel[286] = new ModelRendererTurbo(this, 129, 75, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[287] = new ModelRendererTurbo(this, 131, 70, textureX, textureY); // Box 5
		bodyModel[288] = new ModelRendererTurbo(this, 198, 22, textureX, textureY); // Box 403
		bodyModel[289] = new ModelRendererTurbo(this, 198, 25, textureX, textureY); // Box 404
		bodyModel[290] = new ModelRendererTurbo(this, 198, 28, textureX, textureY); // Box 405
		bodyModel[291] = new ModelRendererTurbo(this, 196, 15, textureX, textureY, "cull"); // Box 407 bell holder cull
		bodyModel[292] = new ModelRendererTurbo(this, 172, 32, textureX, textureY); // Box 342
		bodyModel[293] = new ModelRendererTurbo(this, 172, 29, textureX, textureY); // Box 343
		bodyModel[294] = new ModelRendererTurbo(this, 170, 35, textureX, textureY); // Box 344
		bodyModel[295] = new ModelRendererTurbo(this, 179, 31, textureX, textureY); // Box 345
		bodyModel[296] = new ModelRendererTurbo(this, 256, 12, textureX, textureY); // Box 421 prime base
		bodyModel[297] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[298] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[299] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[300] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[301] = new ModelRendererTurbo(this, 256, 16, textureX, textureY, "cull"); // Box 355 support cull
		bodyModel[302] = new ModelRendererTurbo(this, 149, 25, textureX, textureY); // Box 430
		bodyModel[303] = new ModelRendererTurbo(this, 253, 39, textureX, textureY); // Box 446
		bodyModel[304] = new ModelRendererTurbo(this, 252, 32, textureX, textureY); // Box 447
		bodyModel[305] = new ModelRendererTurbo(this, 267, 47, textureX, textureY); // Box 448
		bodyModel[306] = new ModelRendererTurbo(this, 267, 49, textureX, textureY); // Box 449
		bodyModel[307] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 416 ditchlight front b
		bodyModel[308] = new ModelRendererTurbo(this, 19, 163, textureX, textureY); // Box 417
		bodyModel[309] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 418 ditchlight front b
		bodyModel[310] = new ModelRendererTurbo(this, 19, 163, textureX, textureY); // Box 419
		bodyModel[311] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, BoxName.ditch); // Box 337 ditchlight rear b
		bodyModel[312] = new ModelRendererTurbo(this, 360, 189, textureX, textureY); // Box 338
		bodyModel[313] = new ModelRendererTurbo(this, 360, 189, textureX, textureY); // Box 339
		bodyModel[314] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, BoxName.ditch); // Box 340 ditchlight rear b
		bodyModel[315] = new ModelRendererTurbo(this, 15, 123, textureX, textureY); // Box 101 cull
		bodyModel[316] = new ModelRendererTurbo(this, 8, 123, textureX, textureY, BoxName.ditch); // Box 275 ditchlight f d
		bodyModel[317] = new ModelRendererTurbo(this, 15, 123, textureX, textureY); // Box 444 cull
		bodyModel[318] = new ModelRendererTurbo(this, 8, 123, textureX, textureY, BoxName.ditch); // Box 445 ditchlight f d
		bodyModel[319] = new ModelRendererTurbo(this, 407, 182, textureX, textureY); // Box 337
		bodyModel[320] = new ModelRendererTurbo(this, 407, 177, textureX, textureY); // Box 338
		bodyModel[321] = new ModelRendererTurbo(this, 407, 182, textureX, textureY); // Box 339
		bodyModel[322] = new ModelRendererTurbo(this, 407, 177, textureX, textureY); // Box 340
		bodyModel[323] = new ModelRendererTurbo(this, 190, 12, textureX, textureY); // Box 114
		bodyModel[324] = new ModelRendererTurbo(this, 190, 9, textureX, textureY); // Box 74
		bodyModel[325] = new ModelRendererTurbo(this, 190, 15, textureX, textureY); // Box 78
		bodyModel[326] = new ModelRendererTurbo(this, 189, 5, textureX, textureY); // Box 245
		bodyModel[327] = new ModelRendererTurbo(this, 165, 32, textureX, textureY); // Box 1095
		bodyModel[328] = new ModelRendererTurbo(this, 156, 29, textureX, textureY); // Box 1096
		bodyModel[329] = new ModelRendererTurbo(this, 154, 32, textureX, textureY); // Box 1097
		bodyModel[330] = new ModelRendererTurbo(this, 156, 35, textureX, textureY); // Box 1098
		bodyModel[331] = new ModelRendererTurbo(this, 75, 62, textureX, textureY); // Box 346 nose brake cover
		bodyModel[332] = new ModelRendererTurbo(this, 18, 41, textureX, textureY); // Box 1251
		bodyModel[333] = new ModelRendererTurbo(this, 118, 164, textureX, textureY); // Box 527 cab backpannel
		bodyModel[334] = new ModelRendererTurbo(this, 133, 168, textureX, textureY); // Box 461 nose stairs hand rail inside your ass
		bodyModel[335] = new ModelRendererTurbo(this, 434, 2, textureX, textureY); // Box 276
		bodyModel[336] = new ModelRendererTurbo(this, 415, 6, textureX, textureY); // Box 277
		bodyModel[337] = new ModelRendererTurbo(this, 396, 2, textureX, textureY); // Box 279
		bodyModel[338] = new ModelRendererTurbo(this, 427, 220, textureX, textureY); // Box 297 sd40 vent
		bodyModel[339] = new ModelRendererTurbo(this, 384, 220, textureX, textureY); // Box 272 sd40 vent
		bodyModel[340] = new ModelRendererTurbo(this, 427, 220, textureX, textureY); // Box 351
		bodyModel[341] = new ModelRendererTurbo(this, 384, 220, textureX, textureY); // Box 352
		bodyModel[342] = new ModelRendererTurbo(this, 125, 123, textureX, textureY); // Box 306
		bodyModel[343] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 307
		bodyModel[344] = new ModelRendererTurbo(this, 115, 123, textureX, textureY); // Box 868
		bodyModel[345] = new ModelRendererTurbo(this, 118, 121, textureX, textureY); // Box 359
		bodyModel[346] = new ModelRendererTurbo(this, 125, 121, textureX, textureY); // Box 360
		bodyModel[347] = new ModelRendererTurbo(this, 115, 121, textureX, textureY); // Box 361
		bodyModel[348] = new ModelRendererTurbo(this, 118, 117, textureX, textureY); // Box 362
		bodyModel[349] = new ModelRendererTurbo(this, 116, 119, textureX, textureY); // Box 363
		bodyModel[350] = new ModelRendererTurbo(this, 115, 117, textureX, textureY); // Box 364
		bodyModel[351] = new ModelRendererTurbo(this, 137, 116, textureX, textureY); // Box 365
		bodyModel[352] = new ModelRendererTurbo(this, 137, 107, textureX, textureY); // Box 366
		bodyModel[353] = new ModelRendererTurbo(this, 148, 107, textureX, textureY); // Box 367
		bodyModel[354] = new ModelRendererTurbo(this, 70, 134, textureX, textureY); // Box 368
		bodyModel[355] = new ModelRendererTurbo(this, 79, 134, textureX, textureY); // Box 369
		bodyModel[356] = new ModelRendererTurbo(this, 203, 26, textureX, textureY); // Box 409 commander base
		bodyModel[357] = new ModelRendererTurbo(this, 203, 22, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[358] = new ModelRendererTurbo(this, 220, 24, textureX, textureY); // Box 1231
		bodyModel[359] = new ModelRendererTurbo(this, 211, 24, textureX, textureY); // Box 1232
		bodyModel[360] = new ModelRendererTurbo(this, 211, 21, textureX, textureY); // Box 1233
		bodyModel[361] = new ModelRendererTurbo(this, 210, 27, textureX, textureY); // Box 1234
		bodyModel[362] = new ModelRendererTurbo(this, 92, 94, textureX, textureY); // Box 1203
		bodyModel[363] = new ModelRendererTurbo(this, 267, 26, textureX, textureY); // Box 276 gp38/39 fan
		bodyModel[364] = new ModelRendererTurbo(this, 286, 23, textureX, textureY); // Box 277 gp38/39 fan

		bodyModel[0].addBox(0F, 0F, 0F, 88, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-44F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[1].setRotationPoint(-49.01F, 0F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 88, 1, 4, 0F); // Box 159
		bodyModel[2].setRotationPoint(-44F, 0F, 7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[3].setRotationPoint(-49F, 8F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[4].setRotationPoint(-49F, 7F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[5].setRotationPoint(-45F, 1F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[6].setRotationPoint(-45F, 1F, 7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[7].setRotationPoint(-45F, 0F, 7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[8].setRotationPoint(-45F, 5F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[9].setRotationPoint(-45F, 5F, 7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[10].setRotationPoint(-45F, 0F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[11].setRotationPoint(-49F, 3F, -9F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 451
		bodyModel[12].setRotationPoint(-49F, 3F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[13].setRotationPoint(-49F, 8F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[14].setRotationPoint(-49F, 5F, -10F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[15].setRotationPoint(-49F, 7F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[16].setRotationPoint(-49F, 4F, -8F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 333
		bodyModel[17].setRotationPoint(-49F, 7F, 9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[18].setRotationPoint(-49F, 8F, 9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[19].setRotationPoint(-49F, 5F, 8F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 336
		bodyModel[20].setRotationPoint(-49F, 4F, 8F);

		bodyModel[21].addBox(0F, 0F, 0F, 98, 2, 12, 0F); // Box 23
		bodyModel[21].setRotationPoint(-49F, 1F, -6F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 408
		bodyModel[22].setRotationPoint(27.5F, 1F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 98, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[23].setRotationPoint(-49F, 3F, -6.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 98, 1, 14, 0F); // Box 170
		bodyModel[24].setRotationPoint(-49F, 0F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[25].setRotationPoint(-31.5F, 2F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[26].setRotationPoint(-31.5F, 2F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[27].setRotationPoint(-30.5F, 2F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[28].setRotationPoint(-30.5F, 2F, 9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[29].setRotationPoint(27.5F, 2F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 193
		bodyModel[30].setRotationPoint(28.5F, 2F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		bodyModel[31].setRotationPoint(27.5F, 2F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 195
		bodyModel[32].setRotationPoint(28.5F, 2F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[33].setRotationPoint(-49F, 3F, -2.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 203
		bodyModel[34].setRotationPoint(43F, 3F, -2.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 100
		bodyModel[35].setRotationPoint(-31.5F, 1F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[36].setRotationPoint(15F, 1F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 116
		bodyModel[37].setRotationPoint(-15F, 1F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		bodyModel[38].setRotationPoint(-44F, 1F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[39].setRotationPoint(14F, 1F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 111
		bodyModel[40].setRotationPoint(15F, 1F, 11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 112
		bodyModel[41].setRotationPoint(-15F, 1F, 11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[42].setRotationPoint(-44F, 1F, 11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 114
		bodyModel[43].setRotationPoint(14F, 1F, 11F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[44].setRotationPoint(-32F, 3F, -2F);

		bodyModel[45].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[45].setRotationPoint(27F, 3F, -2F);

		bodyModel[46].addBox(0F, 0F, 0F, 16, 3, 22, 0F); // Box 489
		bodyModel[46].setRotationPoint(-8F, 3F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[47].setRotationPoint(-8F, 2F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[48].setRotationPoint(-8F, 6F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 16, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[49].setRotationPoint(-8F, 6F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[50].setRotationPoint(-8F, 2F, 8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[51].setRotationPoint(-8F, 6F, 9F);

		bodyModel[52].addBox(0F, 0F, 0F, 16, 1, 16, 0F); // Box 559
		bodyModel[52].setRotationPoint(-8F, 2F, -8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[53].setRotationPoint(8F, 6F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[54].setRotationPoint(8F, 6F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 6, 3, 22, 0F); // Box 566
		bodyModel[55].setRotationPoint(8F, 3F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[56].setRotationPoint(8F, 2F, -11F);

		bodyModel[57].addBox(0F, 0F, 0F, 6, 1, 16, 0F); // Box 568
		bodyModel[57].setRotationPoint(8F, 2F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[58].setRotationPoint(8F, 2F, 8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 570
		bodyModel[59].setRotationPoint(8F, 6F, 9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[60].setRotationPoint(-14F, 6F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[61].setRotationPoint(-14F, 6F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 6, 3, 22, 0F); // Box 573
		bodyModel[62].setRotationPoint(-14F, 3F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[63].setRotationPoint(-14F, 2F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 576
		bodyModel[64].setRotationPoint(-14F, 6F, 9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[65].setRotationPoint(-14F, 2F, 8F);

		bodyModel[66].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 562
		bodyModel[66].setRotationPoint(-4.5F, 1.3F, -9.5F);
		bodyModel[66].rotateAngleX = 0.78539816F;

		bodyModel[67].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 563
		bodyModel[67].setRotationPoint(-4.5F, 1.3F, 9.5F);
		bodyModel[67].rotateAngleX = 0.78539816F;

		bodyModel[68].addBox(0F, 0F, 0F, 6, 1, 16, 0F); // Box 575
		bodyModel[68].setRotationPoint(-14F, 2F, -8F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 436
		bodyModel[69].setRotationPoint(-13F, 2F, -11.25F);
		bodyModel[69].rotateAngleX = 1.02974426F;

		bodyModel[70].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 437
		bodyModel[70].setRotationPoint(-13F, 2F, 11.25F);
		bodyModel[70].rotateAngleX = 1.02974426F;
		bodyModel[70].rotateAngleY = -3.14159265F;

		bodyModel[71].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 438
		bodyModel[71].setRotationPoint(12.75F, 2F, -11.25F);
		bodyModel[71].rotateAngleX = 1.02974426F;

		bodyModel[72].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 439
		bodyModel[72].setRotationPoint(12.75F, 2F, 11.25F);
		bodyModel[72].rotateAngleX = 1.02974426F;
		bodyModel[72].rotateAngleY = -3.14159265F;

		bodyModel[73].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[73].setRotationPoint(-29.5F, -18F, -10.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[74].setRotationPoint(-19F, -18F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[75].setRotationPoint(-29F, -18F, 10F);

		bodyModel[76].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[76].setRotationPoint(-29F, -18F, -11F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[77].setRotationPoint(-30F, -18F, -7F);

		bodyModel[78].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[78].setRotationPoint(-18.5F, -18F, 10.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[79].setRotationPoint(-30F, -4F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[80].setRotationPoint(-30F, -21F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[81].setRotationPoint(-19F, -21F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[82].setRotationPoint(-30F, -21F, -7F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[83].setRotationPoint(-19F, -21F, -7F);

		bodyModel[84].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[84].setRotationPoint(-29F, -21F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[85].setRotationPoint(-29F, -21F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[86].setRotationPoint(-29F, -21F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[87].setRotationPoint(-19F, -21F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[88].setRotationPoint(-30F, -21F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 8, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[89].setRotationPoint(-16F, -22F, -6F);

		bodyModel[90].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[90].setRotationPoint(-7F, -21.5F, -4F);

		bodyModel[91].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[91].setRotationPoint(-1F, -22F, -3F);

		bodyModel[92].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[92].setRotationPoint(5.5F, -22F, -3F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[93].setRotationPoint(0F, -21F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[94].setRotationPoint(0F, -21F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[95].setRotationPoint(11F, -21F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[96].setRotationPoint(11F, -21F, 7F);

		bodyModel[97].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[97].setRotationPoint(39.25F, -19F, -2F);

		bodyModel[98].addShapeBox(-1F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115 numberboard rear
		bodyModel[98].setRotationPoint(38.45F, -16.5F, -6F);
		bodyModel[98].rotateAngleY = -0.41887902F;

		bodyModel[99].addShapeBox(-1F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116 numberboard rear
		bodyModel[99].setRotationPoint(38.45F, -16.5F, 6F);
		bodyModel[99].rotateAngleY = 0.41887902F;

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear 2 beam
		bodyModel[100].setRotationPoint(40.5F, -19F, -2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear 2 beam
		bodyModel[101].setRotationPoint(40.5F, -19F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[102].setRotationPoint(37.65F, -12F, -6.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[103].setRotationPoint(37.65F, -12F, 4.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 40, 2, 4, 0F); // Box 36
		bodyModel[104].setRotationPoint(-18F, -2F, -11F);

		bodyModel[105].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[105].setRotationPoint(-14F, -13F, -9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[106].setRotationPoint(-14F, -15F, -9F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[107].setRotationPoint(-18F, -10F, -10.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 245
		bodyModel[108].setRotationPoint(-36F, -4F, -11F);

		bodyModel[109].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 246
		bodyModel[109].setRotationPoint(-36F, -4F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 879 dynamics short
		bodyModel[110].setRotationPoint(-2F, -21F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 880 dynamics short
		bodyModel[111].setRotationPoint(-2F, -21F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[112].setRotationPoint(-27F, -18.25F, -11.97F);
		bodyModel[112].rotateAngleX = -0.26179939F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[113].setRotationPoint(-41F, -8F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 353
		bodyModel[114].setRotationPoint(-41F, -10F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 354
		bodyModel[115].setRotationPoint(-41F, -10F, 1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 356
		bodyModel[116].setRotationPoint(-41F, -13F, 1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 357
		bodyModel[117].setRotationPoint(-41F, -13F, -7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 355
		bodyModel[118].setRotationPoint(-41F, -8F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[119].setRotationPoint(-41F, -13F, 0F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[120].setRotationPoint(-41F, -13F, -1F);

		bodyModel[121].addBox(0F, 0F, 0F, 6, 13, 14, 0F); // Box 43
		bodyModel[121].setRotationPoint(-36F, -13F, -7F);

		bodyModel[122].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[122].setRotationPoint(-38F, -13F, -6F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[123].setRotationPoint(-38F, -13F, -7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[124].setRotationPoint(-37.5F, -8.5F, -7F);

		bodyModel[125].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[125].setRotationPoint(-37F, -6.5F, -7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[126].setRotationPoint(-38.65F, -12F, -6.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[127].setRotationPoint(-38.65F, -12F, 4.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[128].setRotationPoint(-39.98F, -13F, -1F);

		bodyModel[129].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[129].setRotationPoint(-32F, -21F, -1F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[130].setRotationPoint(-32F, -21F, -6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[131].setRotationPoint(-32F, -21F, 1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[132].setRotationPoint(-32F, -17F, -1F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 numberboard front
		bodyModel[133].setRotationPoint(-30.05F, -19.5F, -6F);
		bodyModel[133].rotateAngleY = 0.38397244F;

		bodyModel[134].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118 numberboard front
		bodyModel[134].setRotationPoint(-30.05F, -19.5F, 6F);
		bodyModel[134].rotateAngleY = -0.38397244F;

		bodyModel[135].addBox(0F, 0F, 0F, 58, 8, 0, 0F); // Box 38R
		bodyModel[135].setRotationPoint(-13F, -8F, 11F);

		bodyModel[136].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 176
		bodyModel[136].setRotationPoint(-16F, -10F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[137].setRotationPoint(-18F, -12F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[138].setRotationPoint(21F, -10F, -11F);

		bodyModel[139].addBox(0F, 0F, 0F, 22, 8, 0, 0F); // Box 316
		bodyModel[139].setRotationPoint(23F, -8F, -11F);

		bodyModel[140].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 81
		bodyModel[140].setRotationPoint(-45F, -8F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[141].setRotationPoint(-45F, -6F, -11.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[142].setRotationPoint(-45F, -6F, 10.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 177
		bodyModel[143].setRotationPoint(-45F, -8F, 9F);

		bodyModel[144].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[144].setRotationPoint(-49F, -1F, 10F);

		bodyModel[145].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[145].setRotationPoint(-49F, -1F, -11F);

		bodyModel[146].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 144
		bodyModel[146].setRotationPoint(-49F, -8F, -8F);

		bodyModel[147].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 148
		bodyModel[147].setRotationPoint(-49F, -8F, 6F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[148].setRotationPoint(-49.01F, -7F, -8F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		bodyModel[149].setRotationPoint(-49.01F, -7F, 7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[150].setRotationPoint(-49F, -8F, 9F);
		bodyModel[150].rotateAngleY = -3.14159265F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[151].setRotationPoint(-49F, -8F, -8F);
		bodyModel[151].rotateAngleY = -3.14159265F;

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[152].setRotationPoint(-50F, 0F, 5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[153].setRotationPoint(-50F, 0F, -5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[154].setRotationPoint(-50F, 0F, -6F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[155].setRotationPoint(-49F, -8F, -6F);

		bodyModel[156].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[156].setRotationPoint(-50F, -8F, -4F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[157].setRotationPoint(-49F, -8F, 4F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[158].setRotationPoint(-50.5F, -3F, -2F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[159].setRotationPoint(-50.5F, -4F, -2F);

		bodyModel[160].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[160].setRotationPoint(-53F, 3F, -1.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[161].setRotationPoint(-50F, 2.5F, -2F);

		bodyModel[162].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[162].setRotationPoint(49F, 3F, -1.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[163].setRotationPoint(49F, 2.5F, -2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[164].setRotationPoint(49.01F, 8F, -10F);

		bodyModel[165].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[165].setRotationPoint(49.01F, 7F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[166].setRotationPoint(49F, 0F, -6F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[167].setRotationPoint(49F, 0F, -5F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[168].setRotationPoint(49.01F, 0F, -10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[169].setRotationPoint(44F, 1F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[170].setRotationPoint(44F, 1F, 7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[171].setRotationPoint(44F, 0F, -11F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[172].setRotationPoint(44F, 0F, 7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Box 264
		bodyModel[173].setRotationPoint(44F, 5F, -11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[174].setRotationPoint(44F, 5F, 7F);

		bodyModel[175].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 541
		bodyModel[175].setRotationPoint(45F, 4F, -8F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[176].setRotationPoint(45F, 5F, -10F);

		bodyModel[177].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 543
		bodyModel[177].setRotationPoint(45F, 7F, -9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[178].setRotationPoint(45F, 8F, -11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[179].setRotationPoint(45F, 3F, -9F);

		bodyModel[180].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[180].setRotationPoint(45F, 1F, -8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[181].setRotationPoint(45F, 3F, 7F);

		bodyModel[182].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 554
		bodyModel[182].setRotationPoint(45F, 1F, 7F);

		bodyModel[183].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 555
		bodyModel[183].setRotationPoint(45F, 4F, 8F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 556
		bodyModel[184].setRotationPoint(45F, 5F, 8F);

		bodyModel[185].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 557
		bodyModel[185].setRotationPoint(45F, 7F, 9F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 558
		bodyModel[186].setRotationPoint(45F, 8F, 9F);

		bodyModel[187].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[187].setRotationPoint(49F, -1F, 10F);

		bodyModel[188].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[188].setRotationPoint(49F, -1F, -11F);

		bodyModel[189].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 80
		bodyModel[189].setRotationPoint(49F, -8F, -8F);

		bodyModel[190].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 81
		bodyModel[190].setRotationPoint(49F, -8F, 6F);

		bodyModel[191].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 234
		bodyModel[191].setRotationPoint(50F, -8F, -4F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[192].setRotationPoint(49F, -8F, -6F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[193].setRotationPoint(49F, -8F, 4F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 871
		bodyModel[194].setRotationPoint(49.01F, -7F, 7F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 872
		bodyModel[195].setRotationPoint(49.01F, -7F, -8F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 560
		bodyModel[196].setRotationPoint(49F, -8F, 9F);
		bodyModel[196].rotateAngleY = -3.14159265F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 561
		bodyModel[197].setRotationPoint(49F, -8F, -8F);
		bodyModel[197].rotateAngleY = -3.14159265F;

		bodyModel[198].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 243
		bodyModel[198].setRotationPoint(45F, -8F, 9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[199].setRotationPoint(45F, -6F, 10.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[200].setRotationPoint(45F, -6F, -11.5F);

		bodyModel[201].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 250
		bodyModel[201].setRotationPoint(45F, -8F, -11F);

		bodyModel[202].addBox(0F, 0F, 0F, 56, 21, 14, 0F); // Box 19 the hooh
		bodyModel[202].setRotationPoint(-18F, -21F, -7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[203].setRotationPoint(38F, -21F, -7F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[204].setRotationPoint(38F, -21F, 0F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 351 sandcap
		bodyModel[205].setRotationPoint(37.5F, -21.5F, -1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[206].setRotationPoint(-16F, -4F, 11F);

		bodyModel[207].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 304
		bodyModel[207].setRotationPoint(-17F, -2F, 7F);

		bodyModel[208].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 305
		bodyModel[208].setRotationPoint(-18F, -4F, 11F);

		bodyModel[209].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 836
		bodyModel[209].setRotationPoint(-18F, -4F, 7F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 274 exhausting
		bodyModel[210].setRotationPoint(-6F, -23F, -2.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 10, 5, 1, 0F); // Box 285
		bodyModel[211].setRotationPoint(-17.5F, -20.5F, -7.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 10, 5, 1, 0F); // Box 286
		bodyModel[212].setRotationPoint(-17.5F, -20.5F, 6.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 16, 10, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -8F, -5F, 0F, -8F, -5F, 0F, 0F, -5F, 0F); // Box 518
		bodyModel[213].setRotationPoint(-16F, -20.5F, -7.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 16, 10, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -8F, -5F, 0F, -8F, -5F, 0F, 0F, -5F, 0F); // Box 253
		bodyModel[214].setRotationPoint(-16F, -20.5F, 6.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 102
		bodyModel[215].setRotationPoint(-7F, -21F, -9F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[216].setRotationPoint(-7F, -21F, 7F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 881
		bodyModel[217].setRotationPoint(-2F, -21F, -9F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 882
		bodyModel[218].setRotationPoint(-2F, -21F, 7F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 444
		bodyModel[219].setRotationPoint(41.5F, -7.5F, -0.5F);

		bodyModel[220].addBox(0F, 0F, 0F, 1, 8, 4, 0F); // Box 445
		bodyModel[220].setRotationPoint(41F, -8F, -2F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527 brakewheel rear
		bodyModel[221].setRotationPoint(42.5F, -9.5F, -2.5F);

		bodyModel[222].addBox(0F, 0F, 0F, 0, 4, 8, 0F); // Box 440 honse
		bodyModel[222].setRotationPoint(-50F, -1F, -4F);
		bodyModel[222].rotateAngleZ = -0.08726646F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[223].setRotationPoint(-50F, -2F, -4.75F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[224].setRotationPoint(-50F, -2F, 2.75F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[225].setRotationPoint(-50.25F, -2F, -4.75F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399 not a ditchlight will not glow
		bodyModel[226].setRotationPoint(-50.25F, -2F, 2.75F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 249
		bodyModel[227].setRotationPoint(49.25F, -2F, -4.75F);

		bodyModel[228].addBox(0F, 0F, 0F, 0, 4, 8, 0F); // Box 250
		bodyModel[228].setRotationPoint(50F, -1F, -4F);
		bodyModel[228].rotateAngleZ = 0.08726646F;

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 251
		bodyModel[229].setRotationPoint(49F, -2F, -4.75F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 252
		bodyModel[230].setRotationPoint(49.25F, -2F, 2.75F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 253
		bodyModel[231].setRotationPoint(49F, -2F, 2.75F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[232].setRotationPoint(49F, 0F, 5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[233].setRotationPoint(-34F, -19F, -0.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[234].setRotationPoint(-34F, -20F, -0.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[235].setRotationPoint(-33.75F, -18.5F, -0.25F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[236].setRotationPoint(-34F, -21F, -0.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[237].setRotationPoint(-29.5F, -22F, 4F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[238].setRotationPoint(-29.5F, -22.5F, 4F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[239].setRotationPoint(-29.5F, -22.5F, 4F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[240].setRotationPoint(-29.5F, -22.5F, 4F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[241].setRotationPoint(-29.5F, -22.5F, 4F);

		bodyModel[242].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[242].setRotationPoint(-26.5F, -22.75F, -4F);

		bodyModel[243].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[243].setRotationPoint(-27F, -22F, -9.5F);

		bodyModel[244].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[244].setRotationPoint(-27F, -22F, 6.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[245].setRotationPoint(-26.5F, -23F, -8F);

		bodyModel[246].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[246].setRotationPoint(-26.5F, -23F, 8F);

		bodyModel[247].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[247].setRotationPoint(-26.5F, -16.25F, -3F);
		bodyModel[247].rotateAngleY = 0.78539816F;

		bodyModel[248].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307
		bodyModel[248].setRotationPoint(-26.5F, -16.25F, -3F);
		bodyModel[248].rotateAngleY = 0.78539816F;

		bodyModel[249].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412
		bodyModel[249].setRotationPoint(-29F, -13F, -2F);

		bodyModel[250].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[250].setRotationPoint(-29.1F, -12F, -4F);
		bodyModel[250].rotateAngleY = -0.38397244F;

		bodyModel[251].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[251].setRotationPoint(-27.5F, -14F, -4F);
		bodyModel[251].rotateAngleY = -0.38397244F;

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[252].setRotationPoint(-53F, 7F, 0F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[253].setRotationPoint(-53F, 7F, -10F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[254].setRotationPoint(-52F, 6F, 0F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[255].setRotationPoint(-52F, 6F, -10F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[256].setRotationPoint(-52F, 5F, 2F);

		bodyModel[257].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[257].setRotationPoint(-52F, 5F, -8F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 1163
		bodyModel[258].setRotationPoint(52F, 7F, 0F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1164
		bodyModel[259].setRotationPoint(52F, 7F, -10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 1167
		bodyModel[260].setRotationPoint(49F, 6F, -10F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 1168
		bodyModel[261].setRotationPoint(49F, 6F, 0F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 1169
		bodyModel[262].setRotationPoint(51F, 5F, 2F);

		bodyModel[263].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1170
		bodyModel[263].setRotationPoint(51F, 5F, -8F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[264].setRotationPoint(11F, -22.5F, -6.5F);

		bodyModel[265].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[265].setRotationPoint(9F, -23.5F, -4.5F);

		bodyModel[266].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[266].setRotationPoint(10F, -23.5F, -6.5F);

		bodyModel[267].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[267].setRotationPoint(11F, -23.5F, -5.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[268].setRotationPoint(-5F, -19.5F, 7.7F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[269].setRotationPoint(-5F, -20.5F, 7.7F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[270].setRotationPoint(-4.75F, -19F, 7.95F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[271].setRotationPoint(-5F, -21.5F, 6.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 547 headlight nose low a
		bodyModel[272].setRotationPoint(-41F, -12F, -1F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 548 headlight nose low b
		bodyModel[273].setRotationPoint(-41F, -10F, -1F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight standard
		bodyModel[274].setRotationPoint(-32.5F, -21F, -1F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight standard
		bodyModel[275].setRotationPoint(-32.5F, -19F, -1F);

		bodyModel[276].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 281
		bodyModel[276].setRotationPoint(-37F, -4F, -11F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[277].setRotationPoint(-38F, -4F, -11F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[278].setRotationPoint(-38F, -4F, 11F);

		bodyModel[279].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 284
		bodyModel[279].setRotationPoint(-37F, -4F, 11F);

		bodyModel[280].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 408
		bodyModel[280].setRotationPoint(-37F, -2F, -11F);

		bodyModel[281].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 409
		bodyModel[281].setRotationPoint(-37F, -2F, 7F);

		bodyModel[282].addBox(0F, 0F, 0F, 8, 2, 7, 0F); // Box 196 winterization hatch cull
		bodyModel[282].setRotationPoint(15.55F, -23F, -3.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[283].setRotationPoint(-27F, -18F, 11F);
		bodyModel[283].rotateAngleX = 0.26179939F;

		bodyModel[284].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[284].setRotationPoint(-27F, -16F, 11F);

		bodyModel[285].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[285].setRotationPoint(-27F, -16F, -12F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[286].setRotationPoint(-27F, -17F, 10F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[287].setRotationPoint(-27F, -18F, 10F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[288].setRotationPoint(11F, -24F, -0.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 404
		bodyModel[289].setRotationPoint(11F, -23F, -0.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		bodyModel[290].setRotationPoint(11.25F, -22.5F, -0.25F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407 bell holder cull
		bodyModel[291].setRotationPoint(11F, -24F, -1.5F);

		bodyModel[292].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 342
		bodyModel[292].setRotationPoint(-29F, -23F, -5.5F);

		bodyModel[293].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 343
		bodyModel[293].setRotationPoint(-29.75F, -22.5F, -4.5F);

		bodyModel[294].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 344
		bodyModel[294].setRotationPoint(-30.5F, -22.5F, -6.5F);

		bodyModel[295].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 345
		bodyModel[295].setRotationPoint(-28.75F, -22.5F, -5.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[296].setRotationPoint(-31F, -24F, -1F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[297].setRotationPoint(-31F, -24.5F, -1F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[298].setRotationPoint(-31F, -24.5F, -1F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[299].setRotationPoint(-31F, -24.5F, -1F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[300].setRotationPoint(-31F, -24.5F, -1F);

		bodyModel[301].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 355 support cull
		bodyModel[301].setRotationPoint(-31F, -23F, -1F);

		bodyModel[302].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 430
		bodyModel[302].setRotationPoint(-28F, -23F, 0F);

		bodyModel[303].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 446
		bodyModel[303].setRotationPoint(-11.5F, -22.5F, 2.5F);

		bodyModel[304].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 447
		bodyModel[304].setRotationPoint(-11.5F, -22.5F, -6.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[305].setRotationPoint(-11F, -23.5F, -4.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[306].setRotationPoint(-11F, -23.5F, 4.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 ditchlight front b
		bodyModel[307].setRotationPoint(-49.75F, 0F, -7.75F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[308].setRotationPoint(-49.5F, 0F, -7.75F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 ditchlight front b
		bodyModel[309].setRotationPoint(-49.75F, 0F, 5.75F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[310].setRotationPoint(-49.5F, 0F, 5.75F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 ditchlight rear b
		bodyModel[311].setRotationPoint(48.75F, 0F, 5.75F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 338
		bodyModel[312].setRotationPoint(48.5F, 0F, 5.75F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 339
		bodyModel[313].setRotationPoint(48.5F, 0F, -7.75F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 340 ditchlight rear b
		bodyModel[314].setRotationPoint(48.75F, 0F, -7.75F);

		bodyModel[315].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 101 cull
		bodyModel[315].setRotationPoint(-50F, 0.5F, -6F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f d
		bodyModel[316].setRotationPoint(-50.25F, 0.5F, -6F);

		bodyModel[317].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 444 cull
		bodyModel[317].setRotationPoint(-50F, 0.5F, 4F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f d
		bodyModel[318].setRotationPoint(-50.25F, 0.5F, 4F);

		bodyModel[319].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 337
		bodyModel[319].setRotationPoint(49F, 0.5F, 4F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338
		bodyModel[320].setRotationPoint(49.25F, 0.5F, 4F);

		bodyModel[321].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 339
		bodyModel[321].setRotationPoint(49F, 0.5F, -6F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 340
		bodyModel[322].setRotationPoint(49.25F, 0.5F, -6F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[323].setRotationPoint(-7F, -19.5F, -8.7F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[324].setRotationPoint(-7F, -20.5F, -8.7F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[325].setRotationPoint(-6.75F, -19F, -8.45F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[326].setRotationPoint(-7F, -21.5F, -8.5F);

		bodyModel[327].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 1095
		bodyModel[327].setRotationPoint(-30.5F, -21.5F, -0.5F);

		bodyModel[328].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1096
		bodyModel[328].setRotationPoint(-32F, -22.25F, 0.5F);

		bodyModel[329].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 1097
		bodyModel[329].setRotationPoint(-33F, -22.5F, -0.5F);

		bodyModel[330].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1098
		bodyModel[330].setRotationPoint(-32.5F, -22.25F, -1.5F);

		bodyModel[331].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 nose brake cover
		bodyModel[331].setRotationPoint(-38F, -9F, -7F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1251
		bodyModel[332].setRotationPoint(-39F, -13.5F, -1F);

		bodyModel[333].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 527 cab backpannel
		bodyModel[333].setRotationPoint(-20F, -20F, -6F);

		bodyModel[334].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 461 nose stairs hand rail inside your ass
		bodyModel[334].setRotationPoint(-29F, -11F, -4F);

		bodyModel[335].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[335].setRotationPoint(31.5F, -22.5F, -3F);

		bodyModel[336].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[336].setRotationPoint(24.5F, -22.5F, -3F);

		bodyModel[337].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 279
		bodyModel[337].setRotationPoint(17.5F, -22.5F, -3F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, 0F, 0F, -10.25F, 0F, 0F, -10.25F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -10.25F, -5F, 0F, -10.25F, -5F, 0F, 0F, -5F, 0F); // Box 297 sd40 vent
		bodyModel[338].setRotationPoint(27.65F, -19.5F, -7.15F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, -1F, 0F, -10.25F, -1F, 0F, -10.25F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -10.25F, -4F, 0F, -10.25F, -4F, 0F, 0F, -4F, 0F); // Box 272 sd40 vent
		bodyModel[339].setRotationPoint(17.65F, -20.5F, -7.15F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, 0F, 0F, -10.25F, 0F, 0F, -10.25F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -10.25F, -5F, 0F, -10.25F, -5F, 0F, 0F, -5F, 0F); // Box 351
		bodyModel[340].setRotationPoint(27.65F, -19.5F, 6.15F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, -1F, 0F, -10.25F, -1F, 0F, -10.25F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -10.25F, -4F, 0F, -10.25F, -4F, 0F, 0F, -4F, 0F); // Box 352
		bodyModel[341].setRotationPoint(17.65F, -20.5F, 6.15F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[342].setRotationPoint(-18F, -12F, 11F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 307
		bodyModel[343].setRotationPoint(-17F, -12F, 11F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		bodyModel[344].setRotationPoint(-14F, -8F, 11F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0.25F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F); // Box 359
		bodyModel[345].setRotationPoint(-39F, -12F, 11F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 360
		bodyModel[346].setRotationPoint(-37F, -12F, 11F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[347].setRotationPoint(-40F, -8F, 11F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.25F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F); // Box 362
		bodyModel[348].setRotationPoint(-38F, -12F, -11F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 363
		bodyModel[349].setRotationPoint(-35F, -12F, -11F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[350].setRotationPoint(-39F, -8F, -11F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 6, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[351].setRotationPoint(-45F, -8F, -11F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 5, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[352].setRotationPoint(-45F, -8F, 11F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 6, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[353].setRotationPoint(-36F, -12F, 11F);

		bodyModel[354].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[354].setRotationPoint(-50F, 1F, -8F);

		bodyModel[355].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[355].setRotationPoint(-50F, 1F, 7F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[356].setRotationPoint(-20.5F, -22F, -0.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[357].setRotationPoint(-20.5F, -23F, -0.5F);

		bodyModel[358].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 1231
		bodyModel[358].setRotationPoint(38.75F, -22F, 1.5F);

		bodyModel[359].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1232
		bodyModel[359].setRotationPoint(38.25F, -22.75F, 2.5F);

		bodyModel[360].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 1233
		bodyModel[360].setRotationPoint(38.25F, -23F, 1.5F);

		bodyModel[361].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1234
		bodyModel[361].setRotationPoint(38.75F, -22.75F, 0.5F);

		bodyModel[362].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Box 1203
		bodyModel[362].setRotationPoint(-35F, -8F, 7F);

		bodyModel[363].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276 gp38/39 fan
		bodyModel[363].setRotationPoint(28.75F, -22.5F, -3F);

		bodyModel[364].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277 gp38/39 fan
		bodyModel[364].setRotationPoint(20.25F, -22.5F, -3F);
	}
	ModelFlexicoil_C_Mid flexMid = new ModelFlexicoil_C_Mid();
	ModelFlexicoil_C_Late flexLate = new ModelFlexicoil_C_Late();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 43324 ) {
			//silver regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexcoil_c2h_silvers.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.725F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.45F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1623) {
			//sPee regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexcoil_c2h_sp.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.725F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.45F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			//blac regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_c2h_black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.85F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.67F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}