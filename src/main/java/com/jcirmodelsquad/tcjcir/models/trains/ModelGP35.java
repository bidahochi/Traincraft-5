//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GP35
// Model Creator: Bida an Cubort
// Created on: 03.08.2022 - 22:47:07
// Last changed on: 03.08.2022 - 22:47:07

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

public class ModelGP35 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGP35() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[495];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 2, 7, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 270, 92, textureX, textureY); // Box 23
		bodyModel[5] = new ModelRendererTurbo(this, 266, 107, textureX, textureY); // Box 163
		bodyModel[6] = new ModelRendererTurbo(this, 266, 107, textureX, textureY); // Box 166
		bodyModel[7] = new ModelRendererTurbo(this, 264, 123, textureX, textureY); // Box 63
		bodyModel[8] = new ModelRendererTurbo(this, 285, 114, textureX, textureY); // Box 129
		bodyModel[9] = new ModelRendererTurbo(this, 300, 114, textureX, textureY); // Box 130
		bodyModel[10] = new ModelRendererTurbo(this, 282, 114, textureX, textureY); // Box 133
		bodyModel[11] = new ModelRendererTurbo(this, 297, 114, textureX, textureY); // Box 134
		bodyModel[12] = new ModelRendererTurbo(this, 428, 65, textureX, textureY); // Box 192
		bodyModel[13] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 193
		bodyModel[14] = new ModelRendererTurbo(this, 443, 65, textureX, textureY); // Box 194
		bodyModel[15] = new ModelRendererTurbo(this, 440, 65, textureX, textureY); // Box 195
		bodyModel[16] = new ModelRendererTurbo(this, 264, 113, textureX, textureY); // Box 4
		bodyModel[17] = new ModelRendererTurbo(this, 403, 114, textureX, textureY); // Box 203
		bodyModel[18] = new ModelRendererTurbo(this, 366, 150, textureX, textureY); // Box 164
		bodyModel[19] = new ModelRendererTurbo(this, 398, 150, textureX, textureY); // Box 259
		bodyModel[20] = new ModelRendererTurbo(this, 373, 155, textureX, textureY); // Box 264
		bodyModel[21] = new ModelRendererTurbo(this, 391, 155, textureX, textureY); // Box 265
		bodyModel[22] = new ModelRendererTurbo(this, 79, 139, textureX, textureY); // Box 541
		bodyModel[23] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 542
		bodyModel[24] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 543
		bodyModel[25] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 544
		bodyModel[26] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 545
		bodyModel[27] = new ModelRendererTurbo(this, 78, 133, textureX, textureY); // Box 546
		bodyModel[28] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 553
		bodyModel[29] = new ModelRendererTurbo(this, 69, 133, textureX, textureY); // Box 554
		bodyModel[30] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 555
		bodyModel[31] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 556
		bodyModel[32] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 557
		bodyModel[33] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 558
		bodyModel[34] = new ModelRendererTurbo(this, 368, 168, textureX, textureY); // Box 3
		bodyModel[35] = new ModelRendererTurbo(this, 366, 174, textureX, textureY); // Box 207
		bodyModel[36] = new ModelRendererTurbo(this, 370, 180, textureX, textureY); // Box 225
		bodyModel[37] = new ModelRendererTurbo(this, 12, 125, textureX, textureY); // Box 3
		bodyModel[38] = new ModelRendererTurbo(this, 14, 137, textureX, textureY); // Box 226
		bodyModel[39] = new ModelRendererTurbo(this, 10, 131, textureX, textureY); // Box 227
		bodyModel[40] = new ModelRendererTurbo(this, 373, 147, textureX, textureY); // Box 261
		bodyModel[41] = new ModelRendererTurbo(this, 391, 147, textureX, textureY); // Box 262
		bodyModel[42] = new ModelRendererTurbo(this, 287, 106, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 286, 69, textureX, textureY); // Box 112
		bodyModel[44] = new ModelRendererTurbo(this, 17, 101, textureX, textureY); // Box 352
		bodyModel[45] = new ModelRendererTurbo(this, 23, 92, textureX, textureY); // Box 353
		bodyModel[46] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 354
		bodyModel[47] = new ModelRendererTurbo(this, 3, 73, textureX, textureY); // Box 356
		bodyModel[48] = new ModelRendererTurbo(this, 31, 73, textureX, textureY); // Box 357
		bodyModel[49] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 355
		bodyModel[50] = new ModelRendererTurbo(this, 8, 46, textureX, textureY, "lamp"); // Box 545 headlight nose high b
		bodyModel[51] = new ModelRendererTurbo(this, 1, 46, textureX, textureY, "lamp"); // Box 546 headlight nose high a
		bodyModel[52] = new ModelRendererTurbo(this, 1, 51, textureX, textureY, "lamp"); // Box 547 headlight nose low a
		bodyModel[53] = new ModelRendererTurbo(this, 8, 51, textureX, textureY, "lamp"); // Box 548 headlight nose low b
		bodyModel[54] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 296 nose cover
		bodyModel[55] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Box 299 nose cover
		bodyModel[56] = new ModelRendererTurbo(this, 2, 45, textureX, textureY); // Box 43
		bodyModel[57] = new ModelRendererTurbo(this, 44, 46, textureX, textureY); // Box 43
		bodyModel[58] = new ModelRendererTurbo(this, 75, 54, textureX, textureY); // Box 43
		bodyModel[59] = new ModelRendererTurbo(this, 75, 62, textureX, textureY); // Box 346 nose brake cover
		bodyModel[60] = new ModelRendererTurbo(this, 101, 55, textureX, textureY); // Box 356
		bodyModel[61] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[62] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[63] = new ModelRendererTurbo(this, 42, 50, textureX, textureY, "lamp"); // Box 314 headlight sp front b
		bodyModel[64] = new ModelRendererTurbo(this, 30, 50, textureX, textureY, "lamp"); // Box 315 headlight sp front a
		bodyModel[65] = new ModelRendererTurbo(this, 48, 47, textureX, textureY, "lamp"); // Box 316 headlight front gyralight sp red
		bodyModel[66] = new ModelRendererTurbo(this, 46, 52, textureX, textureY); // Box 317
		bodyModel[67] = new ModelRendererTurbo(this, 33, 51, textureX, textureY); // Box 20
		bodyModel[68] = new ModelRendererTurbo(this, 119, 61, textureX, textureY); // Box 43
		bodyModel[69] = new ModelRendererTurbo(this, 119, 64, textureX, textureY); // Box 43
		bodyModel[70] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 48
		bodyModel[71] = new ModelRendererTurbo(this, 104, 12, textureX, textureY); // Box 221
		bodyModel[72] = new ModelRendererTurbo(this, 51, 18, textureX, textureY); // Box 52 door swing right
		bodyModel[73] = new ModelRendererTurbo(this, 83, 4, textureX, textureY); // Box 70
		bodyModel[74] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 72
		bodyModel[75] = new ModelRendererTurbo(this, 30, 6, textureX, textureY); // Box 190
		bodyModel[76] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 313
		bodyModel[77] = new ModelRendererTurbo(this, 69, 18, textureX, textureY); // Box 314 door swing right
		bodyModel[78] = new ModelRendererTurbo(this, 101, 23, textureX, textureY); // Box 316
		bodyModel[79] = new ModelRendererTurbo(this, 93, 37, textureX, textureY); // Box 11
		bodyModel[80] = new ModelRendererTurbo(this, 27, 37, textureX, textureY); // Box 210
		bodyModel[81] = new ModelRendererTurbo(this, 66, 23, textureX, textureY); // Box 211
		bodyModel[82] = new ModelRendererTurbo(this, 34, 23, textureX, textureY); // Box 219
		bodyModel[83] = new ModelRendererTurbo(this, 119, 6, textureX, textureY); // Box 220
		bodyModel[84] = new ModelRendererTurbo(this, 104, 4, textureX, textureY); // Box 222
		bodyModel[85] = new ModelRendererTurbo(this, 34, 41, textureX, textureY); // Box 223
		bodyModel[86] = new ModelRendererTurbo(this, 86, 41, textureX, textureY); // Box 224
		bodyModel[87] = new ModelRendererTurbo(this, 78, 47, textureX, textureY); // Box 48
		bodyModel[88] = new ModelRendererTurbo(this, 82, 49, textureX, textureY); // Box 43
		bodyModel[89] = new ModelRendererTurbo(this, 62, 44, textureX, textureY); // Box 44
		bodyModel[90] = new ModelRendererTurbo(this, 104, 37, textureX, textureY, "lamp"); // Box 117 numberboard front
		bodyModel[91] = new ModelRendererTurbo(this, 93, 45, textureX, textureY, "lamp"); // Box 118 numberboard front
		bodyModel[92] = new ModelRendererTurbo(this, 79, 42, textureX, textureY, "lamp"); // Box 186 headlight front up 1
		bodyModel[93] = new ModelRendererTurbo(this, 72, 44, textureX, textureY, "lamp"); // Box 187 headlight front up 2
		bodyModel[94] = new ModelRendererTurbo(this, 65, 55, textureX, textureY); // Box 133
		bodyModel[95] = new ModelRendererTurbo(this, 330, 29, textureX, textureY); // Box 19 the hooh
		bodyModel[96] = new ModelRendererTurbo(this, 478, 84, textureX, textureY); // Box 31
		bodyModel[97] = new ModelRendererTurbo(this, 461, 84, textureX, textureY); // Box 40
		bodyModel[98] = new ModelRendererTurbo(this, 487, 84, textureX, textureY); // Box 41
		bodyModel[99] = new ModelRendererTurbo(this, 465, 76, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[100] = new ModelRendererTurbo(this, 491, 76, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[101] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 247 headlight rear 2 beam
		bodyModel[102] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 248 headlight rear 2 beam
		bodyModel[103] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[104] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[105] = new ModelRendererTurbo(this, 454, 84, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[106] = new ModelRendererTurbo(this, 454, 84, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[107] = new ModelRendererTurbo(this, 242, 156, textureX, textureY); // Box 489
		bodyModel[108] = new ModelRendererTurbo(this, 218, 213, textureX, textureY); // Box 278
		bodyModel[109] = new ModelRendererTurbo(this, 219, 218, textureX, textureY); // Box 281
		bodyModel[110] = new ModelRendererTurbo(this, 246, 182, textureX, textureY); // Box 288
		bodyModel[111] = new ModelRendererTurbo(this, 304, 213, textureX, textureY); // Box 315
		bodyModel[112] = new ModelRendererTurbo(this, 305, 218, textureX, textureY); // Box 316
		bodyModel[113] = new ModelRendererTurbo(this, 248, 138, textureX, textureY); // Box 559
		bodyModel[114] = new ModelRendererTurbo(this, 303, 186, textureX, textureY); // Box 564
		bodyModel[115] = new ModelRendererTurbo(this, 331, 198, textureX, textureY); // Box 565
		bodyModel[116] = new ModelRendererTurbo(this, 299, 160, textureX, textureY); // Box 566
		bodyModel[117] = new ModelRendererTurbo(this, 330, 193, textureX, textureY); // Box 567
		bodyModel[118] = new ModelRendererTurbo(this, 299, 140, textureX, textureY); // Box 568
		bodyModel[119] = new ModelRendererTurbo(this, 330, 166, textureX, textureY); // Box 569
		bodyModel[120] = new ModelRendererTurbo(this, 331, 160, textureX, textureY); // Box 570
		bodyModel[121] = new ModelRendererTurbo(this, 217, 186, textureX, textureY); // Box 571
		bodyModel[122] = new ModelRendererTurbo(this, 221, 198, textureX, textureY); // Box 572
		bodyModel[123] = new ModelRendererTurbo(this, 211, 160, textureX, textureY); // Box 573
		bodyModel[124] = new ModelRendererTurbo(this, 220, 193, textureX, textureY); // Box 574
		bodyModel[125] = new ModelRendererTurbo(this, 225, 140, textureX, textureY); // Box 575
		bodyModel[126] = new ModelRendererTurbo(this, 221, 160, textureX, textureY); // Box 576
		bodyModel[127] = new ModelRendererTurbo(this, 220, 166, textureX, textureY); // Box 577
		bodyModel[128] = new ModelRendererTurbo(this, 219, 228, textureX, textureY); // Box 60
		bodyModel[129] = new ModelRendererTurbo(this, 252, 233, textureX, textureY); // Box 61
		bodyModel[130] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Box 62
		bodyModel[131] = new ModelRendererTurbo(this, 230, 233, textureX, textureY); // Box 63
		bodyModel[132] = new ModelRendererTurbo(this, 219, 233, textureX, textureY); // Box 64
		bodyModel[133] = new ModelRendererTurbo(this, 219, 224, textureX, textureY); // Box 72
		bodyModel[134] = new ModelRendererTurbo(this, 46, 136, textureX, textureY); // Box 143
		bodyModel[135] = new ModelRendererTurbo(this, 13, 137, textureX, textureY); // Box 61
		bodyModel[136] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 63
		bodyModel[137] = new ModelRendererTurbo(this, 35, 131, textureX, textureY); // Box 80
		bodyModel[138] = new ModelRendererTurbo(this, 41, 134, textureX, textureY); // Box 144
		bodyModel[139] = new ModelRendererTurbo(this, 26, 130, textureX, textureY); // Box 145
		bodyModel[140] = new ModelRendererTurbo(this, 19, 134, textureX, textureY); // Box 148
		bodyModel[141] = new ModelRendererTurbo(this, 42, 133, textureX, textureY); // Box 363
		bodyModel[142] = new ModelRendererTurbo(this, 20, 133, textureX, textureY); // Box 870
		bodyModel[143] = new ModelRendererTurbo(this, 16, 136, textureX, textureY); // Box 559
		bodyModel[144] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 302
		bodyModel[145] = new ModelRendererTurbo(this, 23, 124, textureX, textureY); // Box 303
		bodyModel[146] = new ModelRendererTurbo(this, 34, 129, textureX, textureY); // Box 304
		bodyModel[147] = new ModelRendererTurbo(this, 23, 131, textureX, textureY); // Box 147
		bodyModel[148] = new ModelRendererTurbo(this, 407, 168, textureX, textureY); // Box 61
		bodyModel[149] = new ModelRendererTurbo(this, 367, 168, textureX, textureY); // Box 63
		bodyModel[150] = new ModelRendererTurbo(this, 375, 167, textureX, textureY); // Box 80
		bodyModel[151] = new ModelRendererTurbo(this, 397, 167, textureX, textureY); // Box 81
		bodyModel[152] = new ModelRendererTurbo(this, 382, 161, textureX, textureY); // Box 234
		bodyModel[153] = new ModelRendererTurbo(this, 375, 164, textureX, textureY); // Box 236
		bodyModel[154] = new ModelRendererTurbo(this, 379, 178, textureX, textureY); // Box 202
		bodyModel[155] = new ModelRendererTurbo(this, 382, 180, textureX, textureY); // Box 204
		bodyModel[156] = new ModelRendererTurbo(this, 395, 164, textureX, textureY); // Box 206
		bodyModel[157] = new ModelRendererTurbo(this, 390, 180, textureX, textureY); // Box 301
		bodyModel[158] = new ModelRendererTurbo(this, 402, 166, textureX, textureY); // Box 871
		bodyModel[159] = new ModelRendererTurbo(this, 372, 166, textureX, textureY); // Box 872
		bodyModel[160] = new ModelRendererTurbo(this, 402, 168, textureX, textureY); // Box 560
		bodyModel[161] = new ModelRendererTurbo(this, 372, 168, textureX, textureY); // Box 561
		bodyModel[162] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 44
		bodyModel[163] = new ModelRendererTurbo(this, 90, 103, textureX, textureY); // Box 45
		bodyModel[164] = new ModelRendererTurbo(this, 91, 113, textureX, textureY); // Box 56
		bodyModel[165] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 178
		bodyModel[166] = new ModelRendererTurbo(this, 76, 107, textureX, textureY); // Box 300
		bodyModel[167] = new ModelRendererTurbo(this, 76, 79, textureX, textureY); // Box 382hh
		bodyModel[168] = new ModelRendererTurbo(this, 67, 77, textureX, textureY); // Box 383
		bodyModel[169] = new ModelRendererTurbo(this, 53, 86, textureX, textureY); // Box 384
		bodyModel[170] = new ModelRendererTurbo(this, 118, 85, textureX, textureY, "lamp"); // Box 385 headlight f hh
		bodyModel[171] = new ModelRendererTurbo(this, 118, 85, textureX, textureY, "lamp"); // Box 386 headlight f hh
		bodyModel[172] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 387
		bodyModel[173] = new ModelRendererTurbo(this, 77, 69, textureX, textureY, "lamp"); // Box 350 numberboard hh
		bodyModel[174] = new ModelRendererTurbo(this, 109, 85, textureX, textureY, "lamp"); // Box 351 numberboard hh
		bodyModel[175] = new ModelRendererTurbo(this, 185, 32, textureX, textureY); // Box 354
		bodyModel[176] = new ModelRendererTurbo(this, 187, 26, textureX, textureY); // Box 355
		bodyModel[177] = new ModelRendererTurbo(this, 187, 38, textureX, textureY); // Box 356
		bodyModel[178] = new ModelRendererTurbo(this, 196, 32, textureX, textureY); // Box 357
		bodyModel[179] = new ModelRendererTurbo(this, 189, 35, textureX, textureY); // Box 1217
		bodyModel[180] = new ModelRendererTurbo(this, 189, 29, textureX, textureY); // Box 1218
		bodyModel[181] = new ModelRendererTurbo(this, 154, 14, textureX, textureY); // Box 114
		bodyModel[182] = new ModelRendererTurbo(this, 154, 11, textureX, textureY); // Box 74
		bodyModel[183] = new ModelRendererTurbo(this, 154, 17, textureX, textureY); // Box 78
		bodyModel[184] = new ModelRendererTurbo(this, 94, 75, textureX, textureY); // Box 1250
		bodyModel[185] = new ModelRendererTurbo(this, 18, 41, textureX, textureY); // Box 1251
		bodyModel[186] = new ModelRendererTurbo(this, 365, 15, textureX, textureY); // Box 101
		bodyModel[187] = new ModelRendererTurbo(this, 392, 15, textureX, textureY); // Box 104
		bodyModel[188] = new ModelRendererTurbo(this, 365, 22, textureX, textureY); // Box 284
		bodyModel[189] = new ModelRendererTurbo(this, 392, 22, textureX, textureY); // Box 286
		bodyModel[190] = new ModelRendererTurbo(this, 376, 5, textureX, textureY); // Box 278
		bodyModel[191] = new ModelRendererTurbo(this, 481, 5, textureX, textureY); // Box 276 gp28 fan
		bodyModel[192] = new ModelRendererTurbo(this, 462, 8, textureX, textureY); // Box 277 gp28 fan
		bodyModel[193] = new ModelRendererTurbo(this, 426, 7, textureX, textureY); // Box 276
		bodyModel[194] = new ModelRendererTurbo(this, 337, 4, textureX, textureY); // Box 274 exhausting
		bodyModel[195] = new ModelRendererTurbo(this, 298, 16, textureX, textureY); // Box 275
		bodyModel[196] = new ModelRendererTurbo(this, 302, 54, textureX, textureY); // Box 271 bubbl
		bodyModel[197] = new ModelRendererTurbo(this, 302, 49, textureX, textureY); // Box 272 bubble
		bodyModel[198] = new ModelRendererTurbo(this, 319, 116, textureX, textureY); // Box 36
		bodyModel[199] = new ModelRendererTurbo(this, 161, 12, textureX, textureY); // Box 114
		bodyModel[200] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 74
		bodyModel[201] = new ModelRendererTurbo(this, 161, 15, textureX, textureY); // Box 78
		bodyModel[202] = new ModelRendererTurbo(this, 159, 6, textureX, textureY); // Box 245
		bodyModel[203] = new ModelRendererTurbo(this, 118, 164, textureX, textureY); // Box 527 cab backpannel
		bodyModel[204] = new ModelRendererTurbo(this, 119, 162, textureX, textureY); // Box 412 cs
		bodyModel[205] = new ModelRendererTurbo(this, 96, 164, textureX, textureY); // Box 413 cs
		bodyModel[206] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 86 cs
		bodyModel[207] = new ModelRendererTurbo(this, 107, 149, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[208] = new ModelRendererTurbo(this, 98, 151, textureX, textureY); // Box 307 spedo
		bodyModel[209] = new ModelRendererTurbo(this, 192, 100, textureX, textureY); // Box 260
		bodyModel[210] = new ModelRendererTurbo(this, 190, 105, textureX, textureY); // Box 264
		bodyModel[211] = new ModelRendererTurbo(this, 181, 99, textureX, textureY); // Box 268
		bodyModel[212] = new ModelRendererTurbo(this, 189, 98, textureX, textureY); // Box 274
		bodyModel[213] = new ModelRendererTurbo(this, 180, 105, textureX, textureY); // Box 283
		bodyModel[214] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 284
		bodyModel[215] = new ModelRendererTurbo(this, 206, 105, textureX, textureY); // Box 291
		bodyModel[216] = new ModelRendererTurbo(this, 219, 105, textureX, textureY); // Box 292
		bodyModel[217] = new ModelRendererTurbo(this, 218, 98, textureX, textureY); // Box 293
		bodyModel[218] = new ModelRendererTurbo(this, 220, 99, textureX, textureY); // Box 294
		bodyModel[219] = new ModelRendererTurbo(this, 213, 100, textureX, textureY); // Box 295
		bodyModel[220] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 296
		bodyModel[221] = new ModelRendererTurbo(this, 236, 40, textureX, textureY); // Box 327
		bodyModel[222] = new ModelRendererTurbo(this, 238, 34, textureX, textureY); // Box 328
		bodyModel[223] = new ModelRendererTurbo(this, 238, 46, textureX, textureY); // Box 329
		bodyModel[224] = new ModelRendererTurbo(this, 247, 40, textureX, textureY); // Box 330
		bodyModel[225] = new ModelRendererTurbo(this, 240, 37, textureX, textureY); // Box 331
		bodyModel[226] = new ModelRendererTurbo(this, 240, 43, textureX, textureY); // Box 332
		bodyModel[227] = new ModelRendererTurbo(this, 190, 12, textureX, textureY); // Box 114
		bodyModel[228] = new ModelRendererTurbo(this, 190, 9, textureX, textureY); // Box 74
		bodyModel[229] = new ModelRendererTurbo(this, 190, 15, textureX, textureY); // Box 78
		bodyModel[230] = new ModelRendererTurbo(this, 189, 5, textureX, textureY); // Box 245
		bodyModel[231] = new ModelRendererTurbo(this, 208, 61, textureX, textureY); // Box 361
		bodyModel[232] = new ModelRendererTurbo(this, 201, 58, textureX, textureY); // Box 362
		bodyModel[233] = new ModelRendererTurbo(this, 201, 64, textureX, textureY); // Box 363
		bodyModel[234] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 364
		bodyModel[235] = new ModelRendererTurbo(this, 201, 44, textureX, textureY); // Box 365
		bodyModel[236] = new ModelRendererTurbo(this, 201, 50, textureX, textureY); // Box 366
		bodyModel[237] = new ModelRendererTurbo(this, 176, 44, textureX, textureY); // Box 352
		bodyModel[238] = new ModelRendererTurbo(this, 183, 43, textureX, textureY, "lamp"); // Box 353 lamp front arr
		bodyModel[239] = new ModelRendererTurbo(this, 173, 43, textureX, textureY, "lamp"); // Box 354 lamp front arr
		bodyModel[240] = new ModelRendererTurbo(this, 256, 12, textureX, textureY); // Box 421 prime base
		bodyModel[241] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[242] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[243] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[244] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[245] = new ModelRendererTurbo(this, 256, 16, textureX, textureY, "cull"); // Box 355 support cull
		bodyModel[246] = new ModelRendererTurbo(this, 175, 9, textureX, textureY); // Box 421 prime base
		bodyModel[247] = new ModelRendererTurbo(this, 175, 5, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[248] = new ModelRendererTurbo(this, 175, 5, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[249] = new ModelRendererTurbo(this, 175, 5, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[250] = new ModelRendererTurbo(this, 175, 5, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[251] = new ModelRendererTurbo(this, 149, 25, textureX, textureY); // Box 430
		bodyModel[252] = new ModelRendererTurbo(this, 198, 26, textureX, textureY); // Box 409 commander base
		bodyModel[253] = new ModelRendererTurbo(this, 198, 22, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[254] = new ModelRendererTurbo(this, 149, 28, textureX, textureY); // Box 448
		bodyModel[255] = new ModelRendererTurbo(this, 152, 25, textureX, textureY); // Box 446
		bodyModel[256] = new ModelRendererTurbo(this, 149, 30, textureX, textureY); // Box 415
		bodyModel[257] = new ModelRendererTurbo(this, 203, 26, textureX, textureY); // Box 409 commander base
		bodyModel[258] = new ModelRendererTurbo(this, 203, 22, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[259] = new ModelRendererTurbo(this, 165, 51, textureX, textureY); // Box 184 o2 generator
		bodyModel[260] = new ModelRendererTurbo(this, 54, 127, textureX, textureY); // Box 81
		bodyModel[261] = new ModelRendererTurbo(this, 51, 128, textureX, textureY); // Box 81
		bodyModel[262] = new ModelRendererTurbo(this, 112, 145, textureX, textureY); // Box 174
		bodyModel[263] = new ModelRendererTurbo(this, 95, 136, textureX, textureY); // Box 293
		bodyModel[264] = new ModelRendererTurbo(this, 11, 128, textureX, textureY); // Box 176
		bodyModel[265] = new ModelRendererTurbo(this, 6, 125, textureX, textureY); // Box 177
		bodyModel[266] = new ModelRendererTurbo(this, 95, 125, textureX, textureY); // Box 258
		bodyModel[267] = new ModelRendererTurbo(this, 111, 113, textureX, textureY); // Box 1203 crab signals
		bodyModel[268] = new ModelRendererTurbo(this, 410, 155, textureX, textureY); // Box 243
		bodyModel[269] = new ModelRendererTurbo(this, 407, 161, textureX, textureY); // Box 244
		bodyModel[270] = new ModelRendererTurbo(this, 367, 161, textureX, textureY); // Box 249
		bodyModel[271] = new ModelRendererTurbo(this, 362, 155, textureX, textureY); // Box 250
		bodyModel[272] = new ModelRendererTurbo(this, 117, 107, textureX, textureY); // Box 303
		bodyModel[273] = new ModelRendererTurbo(this, 113, 102, textureX, textureY); // Box 304
		bodyModel[274] = new ModelRendererTurbo(this, 112, 107, textureX, textureY); // Box 305
		bodyModel[275] = new ModelRendererTurbo(this, 108, 102, textureX, textureY); // Box 836
		bodyModel[276] = new ModelRendererTurbo(this, 112, 125, textureX, textureY); // Box 38R
		bodyModel[277] = new ModelRendererTurbo(this, 112, 134, textureX, textureY); // Box 306
		bodyModel[278] = new ModelRendererTurbo(this, 115, 134, textureX, textureY); // Box 307
		bodyModel[279] = new ModelRendererTurbo(this, 112, 136, textureX, textureY); // Box 176
		bodyModel[280] = new ModelRendererTurbo(this, 117, 145, textureX, textureY); // Box 313
		bodyModel[281] = new ModelRendererTurbo(this, 175, 136, textureX, textureY); // Box 315
		bodyModel[282] = new ModelRendererTurbo(this, 180, 136, textureX, textureY); // Box 316
		bodyModel[283] = new ModelRendererTurbo(this, 82, 2, textureX, textureY); // box64
		bodyModel[284] = new ModelRendererTurbo(this, 34, 2, textureX, textureY); // box65
		bodyModel[285] = new ModelRendererTurbo(this, 55, 12, textureX, textureY); // Box 350
		bodyModel[286] = new ModelRendererTurbo(this, 73, 7, textureX, textureY); // Box 351
		bodyModel[287] = new ModelRendererTurbo(this, 129, 75, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[288] = new ModelRendererTurbo(this, 131, 70, textureX, textureY); // Box 5
		bodyModel[289] = new ModelRendererTurbo(this, 129, 91, textureX, textureY, "cull"); // Box 1087 cull
		bodyModel[290] = new ModelRendererTurbo(this, 131, 86, textureX, textureY); // Box 1088
		bodyModel[291] = new ModelRendererTurbo(this, 275, 209, textureX, textureY); // Box 560
		bodyModel[292] = new ModelRendererTurbo(this, 363, 114, textureX, textureY); // Box 113
		bodyModel[293] = new ModelRendererTurbo(this, 357, 114, textureX, textureY); // Box 116
		bodyModel[294] = new ModelRendererTurbo(this, 312, 114, textureX, textureY); // Box 196
		bodyModel[295] = new ModelRendererTurbo(this, 360, 114, textureX, textureY); // Box 197
		bodyModel[296] = new ModelRendererTurbo(this, 363, 114, textureX, textureY); // Box 493
		bodyModel[297] = new ModelRendererTurbo(this, 357, 114, textureX, textureY); // Box 494
		bodyModel[298] = new ModelRendererTurbo(this, 312, 114, textureX, textureY); // Box 495
		bodyModel[299] = new ModelRendererTurbo(this, 360, 114, textureX, textureY); // Box 496
		bodyModel[300] = new ModelRendererTurbo(this, 266, 191, textureX, textureY); // Box 490
		bodyModel[301] = new ModelRendererTurbo(this, 273, 197, textureX, textureY); // Box 329
		bodyModel[302] = new ModelRendererTurbo(this, 274, 194, textureX, textureY); // Box 330
		bodyModel[303] = new ModelRendererTurbo(this, 266, 194, textureX, textureY); // Box 506
		bodyModel[304] = new ModelRendererTurbo(this, 266, 197, textureX, textureY); // Box 507
		bodyModel[305] = new ModelRendererTurbo(this, 274, 191, textureX, textureY); // Box 508
		bodyModel[306] = new ModelRendererTurbo(this, 280, 209, textureX, textureY); // Box 19
		bodyModel[307] = new ModelRendererTurbo(this, 236, 95, textureX, textureY); // Box 246 roof air tank
		bodyModel[308] = new ModelRendererTurbo(this, 236, 95, textureX, textureY); // Box 249 roof air tank
		bodyModel[309] = new ModelRendererTurbo(this, 271, 96, textureX, textureY); // Box 250
		bodyModel[310] = new ModelRendererTurbo(this, 233, 96, textureX, textureY); // Box 251
		bodyModel[311] = new ModelRendererTurbo(this, 271, 96, textureX, textureY); // Box 252
		bodyModel[312] = new ModelRendererTurbo(this, 233, 96, textureX, textureY); // Box 253
		bodyModel[313] = new ModelRendererTurbo(this, 405, 15, textureX, textureY); // Box 105
		bodyModel[314] = new ModelRendererTurbo(this, 405, 22, textureX, textureY); // Box 285
		bodyModel[315] = new ModelRendererTurbo(this, 293, 33, textureX, textureY); // Box 275 gp15T part
		bodyModel[316] = new ModelRendererTurbo(this, 204, 86, textureX, textureY); // Box 147
		bodyModel[317] = new ModelRendererTurbo(this, 325, 87, textureX, textureY, "lamp"); // Box 171 lamp headlight front double
		bodyModel[318] = new ModelRendererTurbo(this, 325, 82, textureX, textureY, "lamp"); // Box 172 lamp headlight front double
		bodyModel[319] = new ModelRendererTurbo(this, 193, 86, textureX, textureY, "lamp"); // Box 169 lamp headlight front big
		bodyModel[320] = new ModelRendererTurbo(this, 197, 75, textureX, textureY); // Box 274
		bodyModel[321] = new ModelRendererTurbo(this, 182, 75, textureX, textureY); // Box 275
		bodyModel[322] = new ModelRendererTurbo(this, 182, 85, textureX, textureY); // Box 276
		bodyModel[323] = new ModelRendererTurbo(this, 225, 77, textureX, textureY, "lamp"); // Box 512 numberboard wp
		bodyModel[324] = new ModelRendererTurbo(this, 212, 77, textureX, textureY, "lamp"); // Box 513
		bodyModel[325] = new ModelRendererTurbo(this, 156, 72, textureX, textureY); // Box 506 atsf thing
		bodyModel[326] = new ModelRendererTurbo(this, 156, 74, textureX, textureY); // Box 507 atsf thing
		bodyModel[327] = new ModelRendererTurbo(this, 200, 10, textureX, textureY, BoxName.prime1); // Box 509 PRIME2-1
		bodyModel[328] = new ModelRendererTurbo(this, 200, 10, textureX, textureY, BoxName.prime4); // Box 510PRIME2-4
		bodyModel[329] = new ModelRendererTurbo(this, 200, 10, textureX, textureY, BoxName.prime3); // Box 511 PRIME2-3
		bodyModel[330] = new ModelRendererTurbo(this, 200, 10, textureX, textureY, BoxName.prime2); // Box 512 PRIME2-2
		bodyModel[331] = new ModelRendererTurbo(this, 200, 6, textureX, textureY); // Box 513
		bodyModel[332] = new ModelRendererTurbo(this, 441, 32, textureX, textureY, "cull"); // Box 196 winterization hatch
		bodyModel[333] = new ModelRendererTurbo(this, 161, 29, textureX, textureY, "cull"); // Box 420 cull
		bodyModel[334] = new ModelRendererTurbo(this, 161, 24, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[335] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 364 prime base
		bodyModel[336] = new ModelRendererTurbo(this, 225, 29, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[337] = new ModelRendererTurbo(this, 225, 29, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[338] = new ModelRendererTurbo(this, 225, 29, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[339] = new ModelRendererTurbo(this, 225, 29, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[340] = new ModelRendererTurbo(this, 224, 33, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[341] = new ModelRendererTurbo(this, 208, 30, textureX, textureY, "cull"); // Box 420 cull
		bodyModel[342] = new ModelRendererTurbo(this, 209, 26, textureX, textureY); // Box 421 prime base
		bodyModel[343] = new ModelRendererTurbo(this, 209, 22, textureX, textureY, BoxName.prime1); // Box 6 PRIME5-1
		bodyModel[344] = new ModelRendererTurbo(this, 209, 22, textureX, textureY, BoxName.prime3); // Box 7 PRIME5-3
		bodyModel[345] = new ModelRendererTurbo(this, 209, 22, textureX, textureY, BoxName.prime2); // Box 8 PRIME5-2
		bodyModel[346] = new ModelRendererTurbo(this, 209, 22, textureX, textureY, BoxName.prime4); // Box 9 PRIME5-4
		bodyModel[347] = new ModelRendererTurbo(this, 397, 81, textureX, textureY); // Box 381 sp mount
		bodyModel[348] = new ModelRendererTurbo(this, 386, 85, textureX, textureY); // Box 31 sp mount
		bodyModel[349] = new ModelRendererTurbo(this, 332, 87, textureX, textureY, "lamp"); // Box 247 lamp gyralight rear
		bodyModel[350] = new ModelRendererTurbo(this, 332, 82, textureX, textureY, "lamp"); // Box 248 lamp gyralight rear
		bodyModel[351] = new ModelRendererTurbo(this, 339, 87, textureX, textureY, "lamp"); // Box 386 lamp rear
		bodyModel[352] = new ModelRendererTurbo(this, 339, 82, textureX, textureY, "lamp"); // Box 387lamp rear
		bodyModel[353] = new ModelRendererTurbo(this, 346, 87, textureX, textureY, "lamp"); // Box 388 light red gyralight rear
		bodyModel[354] = new ModelRendererTurbo(this, 346, 82, textureX, textureY); // Box 389 sp mount
		bodyModel[355] = new ModelRendererTurbo(this, 421, 85, textureX, textureY); // Box 198
		bodyModel[356] = new ModelRendererTurbo(this, 410, 85, textureX, textureY, "lamp"); // Box 170 lamp headlight rear big
		bodyModel[357] = new ModelRendererTurbo(this, 353, 87, textureX, textureY, "lamp"); // Box 197 lamp headlight rear double
		bodyModel[358] = new ModelRendererTurbo(this, 353, 82, textureX, textureY, "lamp"); // Box 200 lamp headlight rear double
		bodyModel[359] = new ModelRendererTurbo(this, 429, 72, textureX, textureY); // Box 31
		bodyModel[360] = new ModelRendererTurbo(this, 360, 82, textureX, textureY, "lamp"); // Box 295 lamp rear gmd
		bodyModel[361] = new ModelRendererTurbo(this, 360, 87, textureX, textureY, "lamp"); // Box 295 lamp rear gmd
		bodyModel[362] = new ModelRendererTurbo(this, 47, 106, textureX, textureY); // Box 78
		bodyModel[363] = new ModelRendererTurbo(this, 47, 106, textureX, textureY); // Box 188
		bodyModel[364] = new ModelRendererTurbo(this, 54, 106, textureX, textureY, BoxName.ditch); // Box 189 ditchlight f
		bodyModel[365] = new ModelRendererTurbo(this, 54, 106, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f
		bodyModel[366] = new ModelRendererTurbo(this, 54, 111, textureX, textureY, BoxName.ditch); // Box 416 ditchlight f
		bodyModel[367] = new ModelRendererTurbo(this, 47, 111, textureX, textureY, "cull"); // Box 417 cull
		bodyModel[368] = new ModelRendererTurbo(this, 54, 111, textureX, textureY, BoxName.ditch); // Box 418 ditchlight f
		bodyModel[369] = new ModelRendererTurbo(this, 47, 111, textureX, textureY, "cull"); // Box 419 cull
		bodyModel[370] = new ModelRendererTurbo(this, 40, 111, textureX, textureY); // Box 410
		bodyModel[371] = new ModelRendererTurbo(this, 40, 111, textureX, textureY); // Box 411
		bodyModel[372] = new ModelRendererTurbo(this, 40, 106, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f
		bodyModel[373] = new ModelRendererTurbo(this, 40, 106, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f
		bodyModel[374] = new ModelRendererTurbo(this, 439, 115, textureX, textureY); // Box 239
		bodyModel[375] = new ModelRendererTurbo(this, 446, 115, textureX, textureY, BoxName.ditch); // Box 240 ditchlight r
		bodyModel[376] = new ModelRendererTurbo(this, 446, 115, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r
		bodyModel[377] = new ModelRendererTurbo(this, 439, 115, textureX, textureY); // Box 242
		bodyModel[378] = new ModelRendererTurbo(this, 446, 120, textureX, textureY, "cull"); // Box 386 cull
		bodyModel[379] = new ModelRendererTurbo(this, 446, 120, textureX, textureY, "cull"); // Box 387 cull
		bodyModel[380] = new ModelRendererTurbo(this, 439, 120, textureX, textureY, BoxName.ditch); // Box 388 ditchlight r
		bodyModel[381] = new ModelRendererTurbo(this, 439, 120, textureX, textureY, BoxName.ditch); // Box 389 ditchlight r
		bodyModel[382] = new ModelRendererTurbo(this, 439, 125, textureX, textureY); // Box 414
		bodyModel[383] = new ModelRendererTurbo(this, 439, 125, textureX, textureY); // Box 415
		bodyModel[384] = new ModelRendererTurbo(this, 446, 125, textureX, textureY, BoxName.ditch); // Box 416 ditchlight r
		bodyModel[385] = new ModelRendererTurbo(this, 446, 125, textureX, textureY, BoxName.ditch); // Box 417 ditchlight r
		bodyModel[386] = new ModelRendererTurbo(this, 284, 62, textureX, textureY); // Box 394
		bodyModel[387] = new ModelRendererTurbo(this, 289, 62, textureX, textureY); // Box 395
		bodyModel[388] = new ModelRendererTurbo(this, 294, 62, textureX, textureY); // Box 396
		bodyModel[389] = new ModelRendererTurbo(this, 106, 52, textureX, textureY); // Box 386 brakewheel snoot
		bodyModel[390] = new ModelRendererTurbo(this, 320, 139, textureX, textureY); // Box 562
		bodyModel[391] = new ModelRendererTurbo(this, 320, 144, textureX, textureY); // Box 563
		bodyModel[392] = new ModelRendererTurbo(this, 236, 56, textureX, textureY); // Box 327
		bodyModel[393] = new ModelRendererTurbo(this, 238, 53, textureX, textureY); // Box 328
		bodyModel[394] = new ModelRendererTurbo(this, 238, 50, textureX, textureY); // Box 329
		bodyModel[395] = new ModelRendererTurbo(this, 247, 53, textureX, textureY); // Box 330
		bodyModel[396] = new ModelRendererTurbo(this, 231, 50, textureX, textureY); // Box 331
		bodyModel[397] = new ModelRendererTurbo(this, 229, 53, textureX, textureY); // Box 332
		bodyModel[398] = new ModelRendererTurbo(this, 177, 16, textureX, textureY); // Box 320
		bodyModel[399] = new ModelRendererTurbo(this, 177, 13, textureX, textureY); // Box 321
		bodyModel[400] = new ModelRendererTurbo(this, 182, 12, textureX, textureY); // Box 323
		bodyModel[401] = new ModelRendererTurbo(this, 255, 58, textureX, textureY); // Box 384
		bodyModel[402] = new ModelRendererTurbo(this, 257, 55, textureX, textureY); // Box 385
		bodyModel[403] = new ModelRendererTurbo(this, 257, 52, textureX, textureY); // Box 386
		bodyModel[404] = new ModelRendererTurbo(this, 255, 48, textureX, textureY); // Box 384
		bodyModel[405] = new ModelRendererTurbo(this, 257, 45, textureX, textureY); // Box 385
		bodyModel[406] = new ModelRendererTurbo(this, 257, 42, textureX, textureY); // Box 386
		bodyModel[407] = new ModelRendererTurbo(this, 264, 40, textureX, textureY); // Box 387
		bodyModel[408] = new ModelRendererTurbo(this, 253, 39, textureX, textureY); // Box 327
		bodyModel[409] = new ModelRendererTurbo(this, 255, 33, textureX, textureY); // Box 328
		bodyModel[410] = new ModelRendererTurbo(this, 255, 36, textureX, textureY); // Box 329
		bodyModel[411] = new ModelRendererTurbo(this, 264, 55, textureX, textureY); // Box 330
		bodyModel[412] = new ModelRendererTurbo(this, 287, 6, textureX, textureY); // Box 528 bubble 2
		bodyModel[413] = new ModelRendererTurbo(this, 287, 11, textureX, textureY); // Box 529 bubble 2
		bodyModel[414] = new ModelRendererTurbo(this, 278, 31, textureX, textureY, "cull"); // Box 524 snowshield cull
		bodyModel[415] = new ModelRendererTurbo(this, 278, 39, textureX, textureY, "cull"); // Box 525 snowshield cull
		bodyModel[416] = new ModelRendererTurbo(this, 1, 214, textureX, textureY); // Box 22
		bodyModel[417] = new ModelRendererTurbo(this, 24, 214, textureX, textureY); // Box 23
		bodyModel[418] = new ModelRendererTurbo(this, 1, 202, textureX, textureY); // Box 24
		bodyModel[419] = new ModelRendererTurbo(this, 24, 202, textureX, textureY); // Box 25
		bodyModel[420] = new ModelRendererTurbo(this, 3, 180, textureX, textureY); // Box 280
		bodyModel[421] = new ModelRendererTurbo(this, 26, 180, textureX, textureY); // Box 285
		bodyModel[422] = new ModelRendererTurbo(this, 3, 170, textureX, textureY); // Box 448
		bodyModel[423] = new ModelRendererTurbo(this, 26, 170, textureX, textureY); // Box 323
		bodyModel[424] = new ModelRendererTurbo(this, 5, 160, textureX, textureY); // Box 280
		bodyModel[425] = new ModelRendererTurbo(this, 26, 160, textureX, textureY); // Box 285
		bodyModel[426] = new ModelRendererTurbo(this, 439, 210, textureX, textureY); // Box 509
		bodyModel[427] = new ModelRendererTurbo(this, 416, 210, textureX, textureY); // Box 510
		bodyModel[428] = new ModelRendererTurbo(this, 441, 176, textureX, textureY); // Box 513
		bodyModel[429] = new ModelRendererTurbo(this, 418, 176, textureX, textureY); // Box 514
		bodyModel[430] = new ModelRendererTurbo(this, 416, 198, textureX, textureY); // Box 515
		bodyModel[431] = new ModelRendererTurbo(this, 439, 198, textureX, textureY); // Box 516
		bodyModel[432] = new ModelRendererTurbo(this, 441, 156, textureX, textureY); // Box 517
		bodyModel[433] = new ModelRendererTurbo(this, 441, 166, textureX, textureY); // Box 518
		bodyModel[434] = new ModelRendererTurbo(this, 418, 166, textureX, textureY); // Box 519
		bodyModel[435] = new ModelRendererTurbo(this, 418, 156, textureX, textureY); // Box 520
		bodyModel[436] = new ModelRendererTurbo(this, 1, 190, textureX, textureY); // Box 4
		bodyModel[437] = new ModelRendererTurbo(this, 24, 190, textureX, textureY); // Box 322
		bodyModel[438] = new ModelRendererTurbo(this, 439, 186, textureX, textureY); // Box 523
		bodyModel[439] = new ModelRendererTurbo(this, 416, 186, textureX, textureY); // Box 524
		bodyModel[440] = new ModelRendererTurbo(this, 177, 34, textureX, textureY); // Box 409 commander base
		bodyModel[441] = new ModelRendererTurbo(this, 177, 30, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[442] = new ModelRendererTurbo(this, 172, 34, textureX, textureY); // Box 409 commander base
		bodyModel[443] = new ModelRendererTurbo(this, 172, 30, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[444] = new ModelRendererTurbo(this, 177, 27, textureX, textureY); // Box 409 commander base
		bodyModel[445] = new ModelRendererTurbo(this, 177, 23, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[446] = new ModelRendererTurbo(this, 161, 34, textureX, textureY, "cull"); // Box 561 cull bell holder
		bodyModel[447] = new ModelRendererTurbo(this, 287, 56, textureX, textureY, "cull"); // Box 499 cull bell holder
		bodyModel[448] = new ModelRendererTurbo(this, 316, 35, textureX, textureY); // Box 270 filtererererer
		bodyModel[449] = new ModelRendererTurbo(this, 306, 1, textureX, textureY); // Box 273 atsf did this not me
		bodyModel[450] = new ModelRendererTurbo(this, 443, 5, textureX, textureY); // Box 276
		bodyModel[451] = new ModelRendererTurbo(this, 401, 5, textureX, textureY); // Box 277
		bodyModel[452] = new ModelRendererTurbo(this, 354, 22, textureX, textureY); // Box 504
		bodyModel[453] = new ModelRendererTurbo(this, 354, 15, textureX, textureY); // Box 505
		bodyModel[454] = new ModelRendererTurbo(this, 65, 156, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[455] = new ModelRendererTurbo(this, 65, 150, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[456] = new ModelRendererTurbo(this, 410, 184, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[457] = new ModelRendererTurbo(this, 410, 178, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[458] = new ModelRendererTurbo(this, 191, 21, textureX, textureY); // Box 402
		bodyModel[459] = new ModelRendererTurbo(this, 190, 19, textureX, textureY); // Box 401 milw ebell
		bodyModel[460] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Box 78
		bodyModel[461] = new ModelRendererTurbo(this, 184, 6, textureX, textureY); // Box 74
		bodyModel[462] = new ModelRendererTurbo(this, 184, 9, textureX, textureY); // Box 114
		bodyModel[463] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 493
		bodyModel[464] = new ModelRendererTurbo(this, 79, 139, textureX, textureY); // Box 494
		bodyModel[465] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 495
		bodyModel[466] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 496
		bodyModel[467] = new ModelRendererTurbo(this, 52, 159, textureX, textureY); // Box 497
		bodyModel[468] = new ModelRendererTurbo(this, 52, 150, textureX, textureY); // Box 498
		bodyModel[469] = new ModelRendererTurbo(this, 52, 144, textureX, textureY); // Box 499
		bodyModel[470] = new ModelRendererTurbo(this, 78, 133, textureX, textureY); // Box 500
		bodyModel[471] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 501
		bodyModel[472] = new ModelRendererTurbo(this, 0, 159, textureX, textureY); // Box 502
		bodyModel[473] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 503
		bodyModel[474] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 504
		bodyModel[475] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 505
		bodyModel[476] = new ModelRendererTurbo(this, 69, 133, textureX, textureY); // Box 506
		bodyModel[477] = new ModelRendererTurbo(this, 0, 144, textureX, textureY); // Box 507
		bodyModel[478] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 508
		bodyModel[479] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 509
		bodyModel[480] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 510
		bodyModel[481] = new ModelRendererTurbo(this, 457, 54, textureX, textureY); // Box 297
		bodyModel[482] = new ModelRendererTurbo(this, 457, 43, textureX, textureY); // Box 272
		bodyModel[483] = new ModelRendererTurbo(this, 457, 43, textureX, textureY); // Box 514
		bodyModel[484] = new ModelRendererTurbo(this, 457, 54, textureX, textureY); // Box 515
		bodyModel[485] = new ModelRendererTurbo(this, 86, 117, textureX, textureY); // Box 516
		bodyModel[486] = new ModelRendererTurbo(this, 83, 107, textureX, textureY); // Box 517
		bodyModel[487] = new ModelRendererTurbo(this, 432, 18, textureX, textureY); // Box 518
		bodyModel[488] = new ModelRendererTurbo(this, 432, 18, textureX, textureY); // Box 519
		bodyModel[489] = new ModelRendererTurbo(this, 166, 12, textureX, textureY); // Box 520
		bodyModel[490] = new ModelRendererTurbo(this, 166, 9, textureX, textureY); // Box 521
		bodyModel[491] = new ModelRendererTurbo(this, 60, 41, textureX, textureY, "cull"); // Box 522 cull bell nose thing
		bodyModel[492] = new ModelRendererTurbo(this, 351, 139, textureX, textureY, "cull"); // Box 523 pipework cull
		bodyModel[493] = new ModelRendererTurbo(this, 351, 139, textureX, textureY, "cull"); // Box 524 pipework cull
		bodyModel[494] = new ModelRendererTurbo(this, 154, 216, textureX, textureY); // Box 494 extended tank

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[0].setRotationPoint(-42F, 3F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-39F, 2.5F, -2F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 5
		bodyModel[2].setRotationPoint(39F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(38F, 2.5F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 76, 2, 12, 0F); // Box 23
		bodyModel[4].setRotationPoint(-38F, 1F, -6F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[5].setRotationPoint(-24F, 3F, -2F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[6].setRotationPoint(20F, 3F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 76, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[7].setRotationPoint(-38F, 3F, -6.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[8].setRotationPoint(-23.5F, 2F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[9].setRotationPoint(-23.5F, 2F, 6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[10].setRotationPoint(-22.5F, 2F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[11].setRotationPoint(-22.5F, 2F, 9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[12].setRotationPoint(20.5F, 2F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 193
		bodyModel[13].setRotationPoint(21.5F, 2F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		bodyModel[14].setRotationPoint(20.5F, 2F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 195
		bodyModel[15].setRotationPoint(21.5F, 2F, 9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[16].setRotationPoint(-38F, 3F, -2.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 203
		bodyModel[17].setRotationPoint(33F, 3F, -2.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 164
		bodyModel[18].setRotationPoint(33F, 2F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[19].setRotationPoint(33F, 2F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F); // Box 264
		bodyModel[20].setRotationPoint(33F, 5F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[21].setRotationPoint(33F, 5F, 6F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 541
		bodyModel[22].setRotationPoint(34F, 4F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[23].setRotationPoint(34F, 5F, -10F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 543
		bodyModel[24].setRotationPoint(34F, 7F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[25].setRotationPoint(34F, 8F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 545
		bodyModel[26].setRotationPoint(34F, 3F, -9F);

		bodyModel[27].addShapeBox(1F, 0F, 0F, 3, 0, 2, 0F,0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[27].setRotationPoint(34F, 1F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 553
		bodyModel[28].setRotationPoint(34F, 3F, 7F);

		bodyModel[29].addShapeBox(1F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F); // Box 554
		bodyModel[29].setRotationPoint(34F, 1F, 6F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 555
		bodyModel[30].setRotationPoint(34F, 4F, 8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 556
		bodyModel[31].setRotationPoint(34F, 5F, 8F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 557
		bodyModel[32].setRotationPoint(34F, 7F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 558
		bodyModel[33].setRotationPoint(34F, 8F, 9F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 3
		bodyModel[34].setRotationPoint(38F, 1F, -10F);

		bodyModel[35].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[35].setRotationPoint(38F, 7F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[36].setRotationPoint(38F, 8F, -9F);

		bodyModel[37].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 3
		bodyModel[37].setRotationPoint(-38F, 1F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[38].setRotationPoint(-38F, 8F, -9F);

		bodyModel[39].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[39].setRotationPoint(-38F, 7F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[40].setRotationPoint(33F, 1F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[41].setRotationPoint(33F, 1F, 6F);

		bodyModel[42].addBox(0F, 0F, 0F, 66, 1, 5, 0F); // Box 0
		bodyModel[42].setRotationPoint(-33F, 1F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 66, 1, 5, 0F); // Box 112
		bodyModel[43].setRotationPoint(-33F, 1F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[44].setRotationPoint(-37F, -7F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 353
		bodyModel[45].setRotationPoint(-37F, -9F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 354
		bodyModel[46].setRotationPoint(-37F, -9F, 1F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 356
		bodyModel[47].setRotationPoint(-37F, -12F, 1F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 357
		bodyModel[48].setRotationPoint(-37F, -12F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 355
		bodyModel[49].setRotationPoint(-37F, -7F, 0F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 545 headlight nose high b
		bodyModel[50].setRotationPoint(-37F, -10F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 546 headlight nose high a
		bodyModel[51].setRotationPoint(-37F, -12F, -1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 547 headlight nose low a
		bodyModel[52].setRotationPoint(-37F, -11F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 548 headlight nose low b
		bodyModel[53].setRotationPoint(-37F, -9F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[54].setRotationPoint(-37F, -12F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[55].setRotationPoint(-37F, -12F, -1F);

		bodyModel[56].addBox(0F, 0F, 0F, 6, 13, 14, 0F); // Box 43
		bodyModel[56].setRotationPoint(-32F, -12F, -7F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[57].setRotationPoint(-34F, -12F, -6F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[58].setRotationPoint(-34F, -12F, -7F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 nose brake cover
		bodyModel[59].setRotationPoint(-34F, -8F, -7F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[60].setRotationPoint(-32F, -10F, -7.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[61].setRotationPoint(-34.65F, -11F, -6.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[62].setRotationPoint(-34.65F, -11F, 4.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 314 headlight sp front b
		bodyModel[63].setRotationPoint(-36.75F, -11F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 315 headlight sp front a
		bodyModel[64].setRotationPoint(-36.75F, -11F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 headlight front gyralight sp red
		bodyModel[65].setRotationPoint(-36.75F, -13F, -1F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 317
		bodyModel[66].setRotationPoint(-35.98F, -13F, -1.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[67].setRotationPoint(-36.15F, -12F, -2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[68].setRotationPoint(-33.5F, -7.5F, -7F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[69].setRotationPoint(-33F, -5.5F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[70].setRotationPoint(-35.98F, -12F, -1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[71].setRotationPoint(-25F, -20F, -11F);

		bodyModel[72].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[72].setRotationPoint(-25.5F, -17F, -10.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[73].setRotationPoint(-15F, -17F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[74].setRotationPoint(-25F, -17F, 10F);

		bodyModel[75].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[75].setRotationPoint(-25F, -17F, -11F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[76].setRotationPoint(-26F, -17F, -7F);

		bodyModel[77].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[77].setRotationPoint(-14.5F, -17F, 10.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[78].setRotationPoint(-26F, -3F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[79].setRotationPoint(-26F, -20F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[80].setRotationPoint(-15F, -20F, -11F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[81].setRotationPoint(-26F, -20F, -7F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[82].setRotationPoint(-15F, -20F, -7F);

		bodyModel[83].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[83].setRotationPoint(-25F, -20F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[84].setRotationPoint(-25F, -20F, 7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[85].setRotationPoint(-15F, -20F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[86].setRotationPoint(-26F, -20F, 7F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[87].setRotationPoint(-28F, -20F, -1F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[88].setRotationPoint(-28F, -20F, -6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[89].setRotationPoint(-28F, -20F, 1F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 numberboard front
		bodyModel[90].setRotationPoint(-26.05F, -18.5F, -6F);
		bodyModel[90].rotateAngleY = 0.38397244F;

		bodyModel[91].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118 numberboard front
		bodyModel[91].setRotationPoint(-26.05F, -18.5F, 6F);
		bodyModel[91].rotateAngleY = -0.38397244F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front up 1
		bodyModel[92].setRotationPoint(-28.5F, -20F, -1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front up 2
		bodyModel[93].setRotationPoint(-28.5F, -18F, -1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[94].setRotationPoint(-28F, -16F, -1F);

		bodyModel[95].addBox(0F, 0F, 0F, 48, 21, 14, 0F); // Box 19 the hooh
		bodyModel[95].setRotationPoint(-14F, -20F, -7F);

		bodyModel[96].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[96].setRotationPoint(35.25F, -18F, -2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[97].setRotationPoint(34F, -20F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[98].setRotationPoint(34F, -20F, 0F);

		bodyModel[99].addShapeBox(-1F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115 numberboard rear
		bodyModel[99].setRotationPoint(34.5F, -15.5F, -6F);
		bodyModel[99].rotateAngleY = -0.40142573F;

		bodyModel[100].addShapeBox(-1F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116 numberboard rear
		bodyModel[100].setRotationPoint(34.5F, -15.5F, 6F);
		bodyModel[100].rotateAngleY = 0.40142573F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear 2 beam
		bodyModel[101].setRotationPoint(36.5F, -18F, -2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear 2 beam
		bodyModel[102].setRotationPoint(36.5F, -18F, 0F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[103].setRotationPoint(33.65F, -12F, -6.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[104].setRotationPoint(33.65F, -12F, 4.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[105].setRotationPoint(33.65F, -18F, -6.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[106].setRotationPoint(33.65F, -18F, 4.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 16, 2, 22, 0F); // Box 489
		bodyModel[107].setRotationPoint(-8F, 4F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[108].setRotationPoint(-8F, 3F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[109].setRotationPoint(-8F, 6F, -11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 16, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[110].setRotationPoint(-8F, 6F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[111].setRotationPoint(-8F, 3F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[112].setRotationPoint(-8F, 6F, 9F);

		bodyModel[113].addBox(0F, 0F, 0F, 16, 1, 14, 0F); // Box 559
		bodyModel[113].setRotationPoint(-8F, 3F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[114].setRotationPoint(8F, 6F, -9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[115].setRotationPoint(8F, 6F, -11F);

		bodyModel[116].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 566
		bodyModel[116].setRotationPoint(8F, 4F, -11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[117].setRotationPoint(8F, 3F, -11F);

		bodyModel[118].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 568
		bodyModel[118].setRotationPoint(8F, 3F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[119].setRotationPoint(8F, 3F, 7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 570
		bodyModel[120].setRotationPoint(8F, 6F, 9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[121].setRotationPoint(-10F, 6F, -9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[122].setRotationPoint(-10F, 6F, -11F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 573
		bodyModel[123].setRotationPoint(-10F, 4F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[124].setRotationPoint(-10F, 3F, -11F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 575
		bodyModel[125].setRotationPoint(-10F, 3F, -7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 576
		bodyModel[126].setRotationPoint(-10F, 6F, 9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[127].setRotationPoint(-10F, 3F, 7F);

		bodyModel[128].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 60
		bodyModel[128].setRotationPoint(-10.5F, 3F, -6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 61
		bodyModel[129].setRotationPoint(-14.5F, 3F, -6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 62
		bodyModel[130].setRotationPoint(-14.5F, 3F, 5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[131].setRotationPoint(10.5F, 3F, 5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[132].setRotationPoint(10.5F, 3F, -6F);

		bodyModel[133].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 72
		bodyModel[133].setRotationPoint(-10.5F, 3F, 5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[134].setRotationPoint(-38F, -7F, -8F);
		bodyModel[134].rotateAngleY = -3.14159265F;

		bodyModel[135].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[135].setRotationPoint(-38F, 0F, 10F);

		bodyModel[136].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[136].setRotationPoint(-38F, 0F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[137].setRotationPoint(-38F, -7F, -6F);

		bodyModel[138].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 144
		bodyModel[138].setRotationPoint(-38F, -7F, -8F);

		bodyModel[139].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 145
		bodyModel[139].setRotationPoint(-39F, -7F, -3F);

		bodyModel[140].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 148
		bodyModel[140].setRotationPoint(-38F, -7F, 6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[141].setRotationPoint(-38.01F, -6F, -8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		bodyModel[142].setRotationPoint(-38.01F, -6F, 7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[143].setRotationPoint(-38F, -7F, 9F);
		bodyModel[143].rotateAngleY = -3.14159265F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[144].setRotationPoint(-39F, 1F, 4F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[145].setRotationPoint(-39F, 1F, -4F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[146].setRotationPoint(-39F, 1F, -5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[147].setRotationPoint(-38F, -7F, 3F);

		bodyModel[148].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[148].setRotationPoint(38F, 0F, 10F);

		bodyModel[149].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[149].setRotationPoint(38F, 0F, -11F);

		bodyModel[150].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 80
		bodyModel[150].setRotationPoint(38F, -7F, -8F);

		bodyModel[151].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 81
		bodyModel[151].setRotationPoint(38F, -7F, 6F);

		bodyModel[152].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 234
		bodyModel[152].setRotationPoint(39F, -7F, -3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[153].setRotationPoint(38F, -7F, -6F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[154].setRotationPoint(38F, 1F, -4F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[155].setRotationPoint(38F, 1F, -5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[156].setRotationPoint(38F, -7F, 3F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[157].setRotationPoint(38F, 1F, 4F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 871
		bodyModel[158].setRotationPoint(38.01F, -6F, 7F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 872
		bodyModel[159].setRotationPoint(38.01F, -6F, -8F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 560
		bodyModel[160].setRotationPoint(38F, -7F, 9F);
		bodyModel[160].rotateAngleY = -3.14159265F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 561
		bodyModel[161].setRotationPoint(38F, -7F, -8F);
		bodyModel[161].rotateAngleY = -3.14159265F;

		bodyModel[162].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 44
		bodyModel[162].setRotationPoint(-32F, -1F, -11F);

		bodyModel[163].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 45
		bodyModel[163].setRotationPoint(-32F, -3F, 7F);

		bodyModel[164].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 56
		bodyModel[164].setRotationPoint(-31F, -3F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[165].setRotationPoint(-33F, -3F, -11F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 300
		bodyModel[166].setRotationPoint(-33F, -1F, 7F);

		bodyModel[167].addBox(0F, 0F, 0F, 8, 8, 14, 0F); // Box 382hh
		bodyModel[167].setRotationPoint(-34F, -20F, -7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[168].setRotationPoint(-37F, -20F, -7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 384
		bodyModel[169].setRotationPoint(-37F, -20F, 0F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385 headlight f hh
		bodyModel[170].setRotationPoint(-37.5F, -18F, 0F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386 headlight f hh
		bodyModel[171].setRotationPoint(-37.5F, -18F, -2F);

		bodyModel[172].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 387
		bodyModel[172].setRotationPoint(-37.25F, -18F, -2F);

		bodyModel[173].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 350 numberboard hh
		bodyModel[173].setRotationPoint(-34.5F, -15F, 6F);
		bodyModel[173].rotateAngleY = -0.40142573F;

		bodyModel[174].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 351 numberboard hh
		bodyModel[174].setRotationPoint(-34.5F, -15F, -6F);
		bodyModel[174].rotateAngleY = 0.40142573F;

		bodyModel[175].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[175].setRotationPoint(-36.5F, -21.5F, -5.5F);

		bodyModel[176].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[176].setRotationPoint(-35.5F, -21.25F, -4.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[177].setRotationPoint(-36F, -21.25F, -6.5F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[178].setRotationPoint(-34F, -20.5F, -5.5F);

		bodyModel[179].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 1217
		bodyModel[179].setRotationPoint(-35F, -22.5F, -6F);

		bodyModel[180].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 1218
		bodyModel[180].setRotationPoint(-35F, -22.5F, -4.75F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[181].setRotationPoint(-38.5F, -20.5F, -0.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[182].setRotationPoint(-38.5F, -21.5F, -0.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[183].setRotationPoint(-38.25F, -20F, -0.25F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1250
		bodyModel[184].setRotationPoint(-35F, -20.5F, -1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1251
		bodyModel[185].setRotationPoint(-35F, -12.5F, -1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[186].setRotationPoint(-1F, -20F, 7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[187].setRotationPoint(10F, -20F, 7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[188].setRotationPoint(-1F, -20F, -9F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[189].setRotationPoint(10F, -20F, -9F);

		bodyModel[190].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[190].setRotationPoint(2F, -21F, -3F);

		bodyModel[191].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276 gp28 fan
		bodyModel[191].setRotationPoint(25.25F, -21.25F, -3F);

		bodyModel[192].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277 gp28 fan
		bodyModel[192].setRotationPoint(16.75F, -21.25F, -3F);

		bodyModel[193].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 276
		bodyModel[193].setRotationPoint(22F, -20.75F, -2F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 274 exhausting
		bodyModel[194].setRotationPoint(-4F, -21.5F, -2.5F);

		bodyModel[195].addBox(0F, 0F, 0F, 9, 1, 13, 0F); // Box 275
		bodyModel[195].setRotationPoint(-13.5F, -20.25F, -6.5F);

		bodyModel[196].addBox(0F, 0F, 0F, 8, 12, 2, 0F); // Box 271 bubbl
		bodyModel[196].setRotationPoint(-12.5F, -13F, -9F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272 bubble
		bodyModel[197].setRotationPoint(-12.5F, -15F, -9F);

		bodyModel[198].addBox(0F, 0F, 0F, 34, 2, 4, 0F); // Box 36
		bodyModel[198].setRotationPoint(-14F, -1F, -11F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[199].setRotationPoint(-30F, -18F, -0.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[200].setRotationPoint(-30F, -19F, -0.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[201].setRotationPoint(-29.75F, -17.5F, -0.25F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[202].setRotationPoint(-30F, -20F, -0.5F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 527 cab backpannel
		bodyModel[203].setRotationPoint(-16F, -19F, -6F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412 cs
		bodyModel[204].setRotationPoint(-25F, -12F, 3F);

		bodyModel[205].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413 cs
		bodyModel[205].setRotationPoint(-25.1F, -11F, 1F);
		bodyModel[205].rotateAngleY = -0.38397244F;

		bodyModel[206].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[206].setRotationPoint(-23.5F, -13F, 1F);
		bodyModel[206].rotateAngleY = -0.38397244F;

		bodyModel[207].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[207].setRotationPoint(-22.5F, -15.25F, 2F);
		bodyModel[207].rotateAngleY = 0.78539816F;

		bodyModel[208].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo
		bodyModel[208].setRotationPoint(-22.5F, -15.25F, 2F);
		bodyModel[208].rotateAngleY = 0.78539816F;

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[209].setRotationPoint(-21F, -27F, 6F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[210].setRotationPoint(-21F, -27F, 8F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 268
		bodyModel[211].setRotationPoint(-21F, -26F, 5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 274
		bodyModel[212].setRotationPoint(-21F, -26F, 8F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -2F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 283
		bodyModel[213].setRotationPoint(-21F, -24F, 7F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -2F, -0.5F, 0F, -3F, -3F); // Box 284
		bodyModel[214].setRotationPoint(-21F, -24F, 5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -2F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 291
		bodyModel[215].setRotationPoint(-21F, -24F, -8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, -2F, -0.5F, 0F, 0F, -3F); // Box 292
		bodyModel[216].setRotationPoint(-21F, -24F, -10F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 293
		bodyModel[217].setRotationPoint(-21F, -26F, -9F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[218].setRotationPoint(-21F, -26F, -8F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[219].setRotationPoint(-21F, -27F, -8F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[220].setRotationPoint(-21F, -27F, -9F);

		bodyModel[221].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[221].setRotationPoint(5F, -21.5F, -8.5F);

		bodyModel[222].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[222].setRotationPoint(6F, -21.25F, -7.5F);

		bodyModel[223].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[223].setRotationPoint(5.5F, -21.25F, -9.5F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[224].setRotationPoint(7.5F, -20.5F, -8.5F);

		bodyModel[225].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[225].setRotationPoint(6.5F, -22.5F, -7.75F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[226].setRotationPoint(6.5F, -22.5F, -9F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[227].setRotationPoint(-3.5F, -18F, -8.7F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[228].setRotationPoint(-3.5F, -19F, -8.7F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[229].setRotationPoint(-3.25F, -17.5F, -8.45F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[230].setRotationPoint(-3.5F, -20F, -8.5F);

		bodyModel[231].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 361
		bodyModel[231].setRotationPoint(-22.5F, -22F, -6F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[232].setRotationPoint(-23.5F, -22F, -6F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 363
		bodyModel[233].setRotationPoint(-23.5F, -21F, -6F);

		bodyModel[234].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[234].setRotationPoint(-22.5F, -22F, 2F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[235].setRotationPoint(-23.5F, -22F, 2F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 366
		bodyModel[236].setRotationPoint(-23.5F, -21F, 2F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 352
		bodyModel[237].setRotationPoint(-28F, -22F, -2F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 353 lamp front arr
		bodyModel[238].setRotationPoint(-28.25F, -22F, -2F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 354 lamp front arr
		bodyModel[239].setRotationPoint(-28.25F, -22F, 0F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[240].setRotationPoint(-27F, -23F, -1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[241].setRotationPoint(-27F, -23.5F, -1F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[242].setRotationPoint(-27F, -23.5F, -1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[243].setRotationPoint(-27F, -23.5F, -1F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[244].setRotationPoint(-27F, -23.5F, -1F);

		bodyModel[245].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 355 support cull
		bodyModel[245].setRotationPoint(-27F, -22F, -1F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[246].setRotationPoint(-21F, -21F, -1F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[247].setRotationPoint(-21F, -21.5F, -1F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[248].setRotationPoint(-21F, -21.5F, -1F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[249].setRotationPoint(-21F, -21.5F, -1F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[250].setRotationPoint(-21F, -21.5F, -1F);

		bodyModel[251].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 430
		bodyModel[251].setRotationPoint(-22F, -22F, 0F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[252].setRotationPoint(-20F, -21F, -0.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[253].setRotationPoint(-20F, -22F, -0.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[254].setRotationPoint(-20F, -21F, 0F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 446
		bodyModel[255].setRotationPoint(-18F, -22F, 3F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[256].setRotationPoint(-18.5F, -21F, -5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[257].setRotationPoint(-16.5F, -21F, -0.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[258].setRotationPoint(-16.5F, -22F, -0.5F);

		bodyModel[259].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[259].setRotationPoint(-23F, -21.75F, -4F);

		bodyModel[260].addBox(0F, 0F, 0F, 0, 15, 2, 0F); // Box 81
		bodyModel[260].setRotationPoint(-34F, -9F, -11F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[261].setRotationPoint(-34F, -7F, -11.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 174
		bodyModel[262].setRotationPoint(-31F, -10F, -11F);

		bodyModel[263].addBox(0F, 0F, 0F, 8, 12, 0, 0F); // Box 293
		bodyModel[263].setRotationPoint(-34F, -11F, -11.01F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[264].setRotationPoint(-34F, -9F, 10.5F);

		bodyModel[265].addBox(0F, 0F, 0F, 0, 17, 2, 0F); // Box 177
		bodyModel[265].setRotationPoint(-34F, -11F, 9F);

		bodyModel[266].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 258
		bodyModel[266].setRotationPoint(-34F, -11F, 11F);

		bodyModel[267].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Box 1203 crab signals
		bodyModel[267].setRotationPoint(-31F, -7F, 7F);

		bodyModel[268].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 243
		bodyModel[268].setRotationPoint(34F, -7F, 9F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[269].setRotationPoint(34F, -6F, 10.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[270].setRotationPoint(34F, -6F, -11.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 250
		bodyModel[271].setRotationPoint(34F, -7F, -11F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[272].setRotationPoint(-12F, -3F, 11F);

		bodyModel[273].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 304
		bodyModel[273].setRotationPoint(-13F, -1F, 7F);

		bodyModel[274].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 305
		bodyModel[274].setRotationPoint(-14F, -3F, 11F);

		bodyModel[275].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 836
		bodyModel[275].setRotationPoint(-14F, -3F, 7F);

		bodyModel[276].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 38R
		bodyModel[276].setRotationPoint(-10F, -7F, 11F);

		bodyModel[277].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 306
		bodyModel[277].setRotationPoint(-14F, -11F, 11F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 307
		bodyModel[278].setRotationPoint(-13F, -11F, 11.01F);

		bodyModel[279].addBox(0F, 0F, 0F, 31, 8, 0, 0F); // Box 176
		bodyModel[279].setRotationPoint(-12F, -9F, -11F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.1F, 0F, 0F); // Box 313
		bodyModel[280].setRotationPoint(-14F, -11F, -11.01F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.2F, -2F, 0F, 0.2F, -2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.2F, 0F, 0F); // Box 315
		bodyModel[281].setRotationPoint(19F, -9F, -11.01F);

		bodyModel[282].addBox(0F, 0F, 0F, 13, 8, 0, 0F); // Box 316
		bodyModel[282].setRotationPoint(21F, -7F, -11F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[283].setRotationPoint(-23F, -17F, 11F);
		bodyModel[283].rotateAngleX = 0.26179939F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[284].setRotationPoint(-23F, -17.25F, -11.97F);
		bodyModel[284].rotateAngleX = -0.26179939F;

		bodyModel[285].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[285].setRotationPoint(-23F, -15F, -12F);

		bodyModel[286].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[286].setRotationPoint(-23F, -15F, 11F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[287].setRotationPoint(-23F, -16F, 10F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[288].setRotationPoint(-23F, -17F, 10F);

		bodyModel[289].addShapeBox(0F, 0F, -2F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1087 cull
		bodyModel[289].setRotationPoint(-23F, -16F, -13F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1088
		bodyModel[290].setRotationPoint(-23F, -17F, -13F);

		bodyModel[291].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 560
		bodyModel[291].setRotationPoint(-7F, 3F, 11.25F);
		bodyModel[291].rotateAngleX = 1.02974426F;
		bodyModel[291].rotateAngleY = -3.14159265F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[292].setRotationPoint(11F, 2F, -11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 116
		bodyModel[293].setRotationPoint(-11F, 2F, -11F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		bodyModel[294].setRotationPoint(-33F, 2F, -11F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[295].setRotationPoint(10F, 2F, -11F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 493
		bodyModel[296].setRotationPoint(11F, 2F, 11F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 494
		bodyModel[297].setRotationPoint(-11F, 2F, 11F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 495
		bodyModel[298].setRotationPoint(-33F, 2F, 11F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 496
		bodyModel[299].setRotationPoint(10F, 2F, 11F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F); // Box 490
		bodyModel[300].setRotationPoint(-11F, 2F, 10.99F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[301].setRotationPoint(-6F, 2F, 10.99F);

		bodyModel[302].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 330
		bodyModel[302].setRotationPoint(-8F, 2F, 10.99F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F); // Box 506
		bodyModel[303].setRotationPoint(-11F, 2F, -10.99F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 507
		bodyModel[304].setRotationPoint(-6F, 2F, -10.99F);

		bodyModel[305].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 508
		bodyModel[305].setRotationPoint(-8F, 2F, -10.99F);

		bodyModel[306].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[306].setRotationPoint(-7F, 3F, -11.25F);
		bodyModel[306].rotateAngleX = 1.02974426F;

		bodyModel[307].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 246 roof air tank
		bodyModel[307].setRotationPoint(-2F, -22.5F, -7F);

		bodyModel[308].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 249 roof air tank
		bodyModel[308].setRotationPoint(-2F, -22.5F, 5F);

		bodyModel[309].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 250
		bodyModel[309].setRotationPoint(-2.01F, -22F, -6.5F);

		bodyModel[310].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 251
		bodyModel[310].setRotationPoint(-2.01F, -22F, 5.5F);

		bodyModel[311].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 252
		bodyModel[311].setRotationPoint(13.01F, -22F, 5.5F);

		bodyModel[312].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 253
		bodyModel[312].setRotationPoint(13.01F, -22F, -6.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[313].setRotationPoint(-4F, -20F, 7F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 285
		bodyModel[314].setRotationPoint(-4F, -20F, -9F);

		bodyModel[315].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box 275 gp15T part
		bodyModel[315].setRotationPoint(-5F, -21F, -7F);

		bodyModel[316].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 147
		bodyModel[316].setRotationPoint(-28.75F, -19.5F, -1.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 171 lamp headlight front double
		bodyModel[317].setRotationPoint(-29F, -19.25F, -1.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 172 lamp headlight front double
		bodyModel[318].setRotationPoint(-29F, -19.25F, 0F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 lamp headlight front big
		bodyModel[319].setRotationPoint(-29F, -19.25F, -1.25F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 274
		bodyModel[320].setRotationPoint(-28F, -20F, 1F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 275
		bodyModel[321].setRotationPoint(-28F, -20F, -6F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 276
		bodyModel[322].setRotationPoint(-28F, -20F, -1.5F);

		bodyModel[323].addShapeBox(0.25F, 0F, -5.25F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 512 numberboard wp
		bodyModel[323].setRotationPoint(-29F, -18.5F, -1.5F);
		bodyModel[323].rotateAngleY = 0.50614548F;

		bodyModel[324].addShapeBox(0.25F, 0F, -0.25F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[324].setRotationPoint(-28.75F, -18.5F, 2F);
		bodyModel[324].rotateAngleY = -0.50614548F;

		bodyModel[325].addShapeBox(0F, 0F, 0F, 11, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506 atsf thing
		bodyModel[325].setRotationPoint(-14F, -21F, -6.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 11, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507 atsf thing
		bodyModel[326].setRotationPoint(-14F, -21F, 6.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 509 PRIME2-1
		bodyModel[327].setRotationPoint(-21.5F, -21.5F, -6F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 510PRIME2-4
		bodyModel[328].setRotationPoint(-21.5F, -21.5F, -6F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 511 PRIME2-3
		bodyModel[329].setRotationPoint(-21.5F, -21.5F, -6F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 512 PRIME2-2
		bodyModel[330].setRotationPoint(-21.5F, -21.5F, -6F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[331].setRotationPoint(-21.5F, -21F, -6F);

		bodyModel[332].addBox(0F, 0F, 0F, 10, 2, 8, 0F); // Box 196 winterization hatch
		bodyModel[332].setRotationPoint(11.5F, -21.75F, -4F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 420 cull
		bodyModel[333].setRotationPoint(-20F, -19.5F, -10F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356 support cull
		bodyModel[334].setRotationPoint(-20F, -19.5F, 8F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[335].setRotationPoint(-23.5F, -21F, 7F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[336].setRotationPoint(-23.5F, -21.5F, 7F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[337].setRotationPoint(-23.5F, -21.5F, 7F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[338].setRotationPoint(-23.5F, -21.5F, 7F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[339].setRotationPoint(-23.5F, -21.5F, 7F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356 support cull
		bodyModel[340].setRotationPoint(-24F, -20F, 7F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 420 cull
		bodyModel[341].setRotationPoint(-24F, -20.5F, -9F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[342].setRotationPoint(-23.5F, -21.5F, -9F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME5-1
		bodyModel[343].setRotationPoint(-23.5F, -22F, -9F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME5-3
		bodyModel[344].setRotationPoint(-23.5F, -22F, -9F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME5-2
		bodyModel[345].setRotationPoint(-23.5F, -22F, -9F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME5-4
		bodyModel[346].setRotationPoint(-23.5F, -22F, -9F);

		bodyModel[347].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 381 sp mount
		bodyModel[347].setRotationPoint(35.5F, -21.75F, -2F);

		bodyModel[348].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31 sp mount
		bodyModel[348].setRotationPoint(37.5F, -19.75F, -2F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp gyralight rear
		bodyModel[349].setRotationPoint(37.75F, -19.75F, -2F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp gyralight rear
		bodyModel[350].setRotationPoint(37.75F, -19.75F, 0F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 386 lamp rear
		bodyModel[351].setRotationPoint(36.75F, -17.75F, 0F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 387lamp rear
		bodyModel[352].setRotationPoint(36.75F, -17.75F, -2F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 light red gyralight rear
		bodyModel[353].setRotationPoint(37.75F, -21.75F, -1F);

		bodyModel[354].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 389 sp mount
		bodyModel[354].setRotationPoint(37.5F, -21.75F, -1F);

		bodyModel[355].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 198
		bodyModel[355].setRotationPoint(36F, -19F, -1.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 170 lamp headlight rear big
		bodyModel[356].setRotationPoint(36.75F, -18.75F, -1.25F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 197 lamp headlight rear double
		bodyModel[357].setRotationPoint(37.25F, -17.5F, -0.75F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 200 lamp headlight rear double
		bodyModel[358].setRotationPoint(37.25F, -19F, -0.75F);

		bodyModel[359].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 31
		bodyModel[359].setRotationPoint(35.25F, -19F, -1F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp rear gmd
		bodyModel[360].setRotationPoint(36.5F, -19F, -1F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp rear gmd
		bodyModel[361].setRotationPoint(36.5F, -17F, -1F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[362].setRotationPoint(-38F, -1F, 4.75F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[363].setRotationPoint(-38F, -1F, -6.75F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f
		bodyModel[364].setRotationPoint(-38.25F, -1F, 4.75F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f
		bodyModel[365].setRotationPoint(-38.25F, -1F, -6.75F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 ditchlight f
		bodyModel[366].setRotationPoint(-38.75F, 2F, -5.75F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417 cull
		bodyModel[367].setRotationPoint(-38.5F, 2F, -5.75F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 ditchlight f
		bodyModel[368].setRotationPoint(-38.75F, 2F, 3.75F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419 cull
		bodyModel[369].setRotationPoint(-38.5F, 2F, 3.75F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[370].setRotationPoint(-39F, -2F, -5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[371].setRotationPoint(-39F, -2F, 3F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f
		bodyModel[372].setRotationPoint(-39.25F, -2F, -5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f
		bodyModel[373].setRotationPoint(-39.25F, -2F, 3F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[374].setRotationPoint(37F, -1F, -6.75F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r
		bodyModel[375].setRotationPoint(37.25F, -1F, -6.75F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r
		bodyModel[376].setRotationPoint(37.25F, -1F, 4.75F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[377].setRotationPoint(37F, -1F, 4.75F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 386 cull
		bodyModel[378].setRotationPoint(37.5F, 2F, 3.75F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 387 cull
		bodyModel[379].setRotationPoint(37.5F, 2F, -5.75F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 ditchlight r
		bodyModel[380].setRotationPoint(37.75F, 2F, -5.75F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 389 ditchlight r
		bodyModel[381].setRotationPoint(37.75F, 2F, 3.75F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 414
		bodyModel[382].setRotationPoint(38F, -2F, 3F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 415
		bodyModel[383].setRotationPoint(38F, -2F, -5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 416 ditchlight r
		bodyModel[384].setRotationPoint(38.25F, -2F, -5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 417 ditchlight r
		bodyModel[385].setRotationPoint(38.25F, -2F, 3F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[386].setRotationPoint(37.5F, -21.5F, -0.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 395
		bodyModel[387].setRotationPoint(37.5F, -20.5F, -0.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 396
		bodyModel[388].setRotationPoint(37.25F, -20F, -0.25F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 386 brakewheel snoot
		bodyModel[389].setRotationPoint(-34F, -12F, -7.5F);

		bodyModel[390].addShapeBox(0F, -1F, -1F, 13, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 562
		bodyModel[390].setRotationPoint(-4F, 2.5F, -9.5F);
		bodyModel[390].rotateAngleX = 0.78539816F;

		bodyModel[391].addShapeBox(0F, -1F, -1F, 13, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 563
		bodyModel[391].setRotationPoint(-4F, 2.5F, 9.5F);
		bodyModel[391].rotateAngleX = 0.78539816F;

		bodyModel[392].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[392].setRotationPoint(-28F, -21.5F, 4.5F);

		bodyModel[393].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[393].setRotationPoint(-27F, -21.25F, 5.5F);

		bodyModel[394].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[394].setRotationPoint(-25.5F, -21.25F, 6.5F);

		bodyModel[395].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[395].setRotationPoint(-25.5F, -20.5F, 5.5F);

		bodyModel[396].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[396].setRotationPoint(-26.5F, -22.25F, 6.5F);

		bodyModel[397].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 332
		bodyModel[397].setRotationPoint(-25.5F, -22.25F, 5.5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 320
		bodyModel[398].setRotationPoint(-23F, -21.5F, -4.5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[399].setRotationPoint(-23F, -22.5F, -4.5F);

		bodyModel[400].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 323
		bodyModel[400].setRotationPoint(-24.25F, -23F, -5.75F);
		bodyModel[400].rotateAngleY = -0.78539816F;

		bodyModel[401].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[401].setRotationPoint(-27.5F, -21.5F, 2.5F);

		bodyModel[402].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[402].setRotationPoint(-26F, -21.5F, 3.5F);

		bodyModel[403].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[403].setRotationPoint(-26.75F, -21.5F, 4.5F);

		bodyModel[404].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[404].setRotationPoint(-28F, -22F, -1.5F);

		bodyModel[405].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[405].setRotationPoint(-26.5F, -22F, -0.5F);

		bodyModel[406].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[406].setRotationPoint(-27.25F, -22F, 0.5F);

		bodyModel[407].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 387
		bodyModel[407].setRotationPoint(-26.25F, -21F, -0.5F);

		bodyModel[408].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[408].setRotationPoint(-28.75F, -21.5F, -1.5F);

		bodyModel[409].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[409].setRotationPoint(-27.25F, -21.25F, 0.5F);

		bodyModel[410].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[410].setRotationPoint(-26.35F, -21.5F, -0.5F);

		bodyModel[411].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[411].setRotationPoint(-26F, -20.5F, 3.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528 bubble 2
		bodyModel[412].setRotationPoint(-10.5F, -14F, -9F);

		bodyModel[413].addBox(0F, 0F, 0F, 6, 11, 2, 0F); // Box 529 bubble 2
		bodyModel[413].setRotationPoint(-10.5F, -12F, -9F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524 snowshield cull
		bodyModel[414].setRotationPoint(-14F, -20F, 7F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525 snowshield cull
		bodyModel[415].setRotationPoint(-14F, -20F, -11F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[416].setRotationPoint(-42F, 7F, 0F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[417].setRotationPoint(-42F, 7F, -10F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[418].setRotationPoint(-41F, 6F, 0F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[419].setRotationPoint(-41F, 6F, -10F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[420].setRotationPoint(-41F, 5F, 2F);

		bodyModel[421].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[421].setRotationPoint(-41F, 5F, -8F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[422].setRotationPoint(-41F, 5F, 2F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[423].setRotationPoint(-41F, 5F, -10F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[424].setRotationPoint(-41F, 4F, 2F);

		bodyModel[425].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[425].setRotationPoint(-41F, 4F, -8F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 509
		bodyModel[426].setRotationPoint(41F, 7F, 0F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 510
		bodyModel[427].setRotationPoint(41F, 7F, -10F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 513
		bodyModel[428].setRotationPoint(40F, 5F, 2F);

		bodyModel[429].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[429].setRotationPoint(40F, 5F, -8F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 515
		bodyModel[430].setRotationPoint(40F, 6F, -10F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 516
		bodyModel[431].setRotationPoint(40F, 6F, 0F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 517
		bodyModel[432].setRotationPoint(40F, 4F, 2F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 518
		bodyModel[433].setRotationPoint(40F, 5F, 2F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[434].setRotationPoint(40F, 5F, -10F);

		bodyModel[435].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[435].setRotationPoint(40F, 4F, -8F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[436].setRotationPoint(-41F, 6F, 0F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[437].setRotationPoint(-41F, 6F, -10F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 523
		bodyModel[438].setRotationPoint(40F, 6F, 0F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 524
		bodyModel[439].setRotationPoint(40F, 6F, -10F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[440].setRotationPoint(-19.5F, -20.5F, -9.5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[441].setRotationPoint(-19.5F, -21.5F, -9.5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[442].setRotationPoint(-19.5F, -20.5F, 8.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[443].setRotationPoint(-19.5F, -21.5F, 8.5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[444].setRotationPoint(-30.5F, -21F, -0.5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[445].setRotationPoint(-30.5F, -22F, -0.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 561 cull bell holder
		bodyModel[446].setRotationPoint(-37.5F, -21.5F, -1F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 499 cull bell holder
		bodyModel[447].setRotationPoint(35.5F, -21.5F, -1F);

		bodyModel[448].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270 filtererererer
		bodyModel[448].setRotationPoint(-14F, -9F, -10F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273 atsf did this not me
		bodyModel[449].setRotationPoint(-12F, -21F, -4F);

		bodyModel[450].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[450].setRotationPoint(27.5F, -21.5F, -3F);

		bodyModel[451].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[451].setRotationPoint(14.5F, -21.5F, -3F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 504
		bodyModel[452].setRotationPoint(-4F, -20F, -9F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 505
		bodyModel[453].setRotationPoint(-4F, -20F, 7F);

		bodyModel[454].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[454].setRotationPoint(-39.5F, -2F, -2F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[455].setRotationPoint(-39.5F, -3F, -2F);

		bodyModel[456].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[456].setRotationPoint(38.5F, -2F, -2F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[457].setRotationPoint(38.5F, -3F, -2F);

		bodyModel[458].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 402
		bodyModel[458].setRotationPoint(-25.5F, -22F, -3.5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F); // Box 401 milw ebell
		bodyModel[459].setRotationPoint(-26.5F, -22F, -3.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[460].setRotationPoint(-11.25F, 3.5F, -10.25F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[461].setRotationPoint(-11.5F, 2F, -10.5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[462].setRotationPoint(-11.5F, 3F, -10.5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[463].setRotationPoint(-38F, 5F, -10F);

		bodyModel[464].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 494
		bodyModel[464].setRotationPoint(-38F, 4F, -8F);

		bodyModel[465].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 495
		bodyModel[465].setRotationPoint(-38F, 7F, -9F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[466].setRotationPoint(-38F, 8F, -11F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 497
		bodyModel[467].setRotationPoint(-34F, 5F, -11F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 498
		bodyModel[468].setRotationPoint(-34F, 2F, -11F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 499
		bodyModel[469].setRotationPoint(-34F, 1F, -11F);

		bodyModel[470].addShapeBox(1F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[470].setRotationPoint(-39F, 1F, -8F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[471].setRotationPoint(-38F, 3F, -9F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 502
		bodyModel[472].setRotationPoint(-34F, 5F, 6F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[473].setRotationPoint(-38F, 5F, 8F);

		bodyModel[474].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 504
		bodyModel[474].setRotationPoint(-38F, 4F, 8F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[475].setRotationPoint(-38F, 3F, 7F);

		bodyModel[476].addShapeBox(1F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[476].setRotationPoint(-39F, 1F, 6F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 507
		bodyModel[477].setRotationPoint(-34F, 1F, 6F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 508
		bodyModel[478].setRotationPoint(-34F, 2F, 6F);

		bodyModel[479].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 509
		bodyModel[479].setRotationPoint(-38F, 7F, 9F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[480].setRotationPoint(-38F, 8F, 9F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F,-0.25F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -5F, 0F, -9.25F, -5F, 0F, -9.25F, -5F, 0F, -0.25F, -5F, 0F); // Box 297
		bodyModel[481].setRotationPoint(23.5F, -18.5F, -7.15F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F,-0.25F, -1F, 0F, -9.25F, -1F, 0F, -9.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -4F, 0F, -9.25F, -4F, 0F, -9.25F, -4F, 0F, -0.25F, -4F, 0F); // Box 272
		bodyModel[482].setRotationPoint(13.5F, -19.5F, -7.15F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F,-0.25F, -1F, 0F, -9.25F, -1F, 0F, -9.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -4F, 0F, -9.25F, -4F, 0F, -9.25F, -4F, 0F, -0.25F, -4F, 0F); // Box 514
		bodyModel[483].setRotationPoint(13.5F, -19.5F, 6.15F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F,-0.25F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -5F, 0F, -9.25F, -5F, 0F, -9.25F, -5F, 0F, -0.25F, -5F, 0F); // Box 515
		bodyModel[484].setRotationPoint(23.5F, -18.5F, 6.15F);

		bodyModel[485].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 516
		bodyModel[485].setRotationPoint(-32F, -3F, -11F);

		bodyModel[486].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 517
		bodyModel[486].setRotationPoint(-33F, -3F, 11F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 16, 8, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, -4F, 0F); // Box 518
		bodyModel[487].setRotationPoint(-13F, -19.5F, -7.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 16, 8, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, -4F, 0F); // Box 519
		bodyModel[488].setRotationPoint(-13F, -19.5F, 6.5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 520
		bodyModel[489].setRotationPoint(-30.5F, -8F, 5.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[490].setRotationPoint(-30.5F, -9F, 5.5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522 cull bell nose thing
		bodyModel[491].setRotationPoint(-31F, -9F, 6F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 523 pipework cull
		bodyModel[492].setRotationPoint(-5F, 2.25F, -11F);
		bodyModel[492].rotateAngleX = 0.40142573F;

		bodyModel[493].addShapeBox(0F, -1F, 0F, 15, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 524 pipework cull
		bodyModel[493].setRotationPoint(-3F, 2.25F, 11F);
		bodyModel[493].rotateAngleX = 2.67035376F;

		bodyModel[494].addShapeBox(0F, 0F, 0F, 20, 2, 22, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494 extended tank
		bodyModel[494].setRotationPoint(-10F, 2F, -11F);
	}
	ModelBlombergBnew theBlombi = new ModelBlombergBnew();
	ModelTypeBnew theB = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 1 || GetColor(entity) == 0
				|| GetColor(entity) == 18 || GetColor(entity) == 19
				|| GetColor(entity) == 9 || GetColor(entity) == 15
				|| GetColor(entity) == 23 || GetColor(entity) == 24
				|| GetColor(entity) == 26 || GetColor(entity) == 27
				|| GetColor(entity) == 28|| GetColor(entity) == 25
				|| GetColor(entity) == 29|| GetColor(entity) == 30
			    || GetColor(entity) == 33|| GetColor(entity) == 33
				|| GetColor(entity) == 34||GetColor(entity) == 34) {
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.75, 0, 0);//rear
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 11 ||GetColor(entity) == 40){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 35 || GetColor(entity) == 36 || GetColor(entity) == 37){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/BlombergB_csxbleu.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 8|| GetColor(entity) == 17){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Espee.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
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