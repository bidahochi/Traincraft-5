//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SD38/39
// Model Creator: BIda
// Created on: 30.03.2022 - 07:56:07
// Last changed on: 30.03.2022 - 07:56:07

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Late;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Mid;
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

public class ModelSD39 extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSD39() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[589];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 297, 231, textureX, textureY); // Box 23
		bodyModel[3] = new ModelRendererTurbo(this, 53, 151, textureX, textureY); // Box 164
		bodyModel[4] = new ModelRendererTurbo(this, 12, 125, textureX, textureY); // Box 3
		bodyModel[5] = new ModelRendererTurbo(this, 1, 151, textureX, textureY); // Box 259
		bodyModel[6] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 262
		bodyModel[7] = new ModelRendererTurbo(this, 53, 160, textureX, textureY); // Box 264
		bodyModel[8] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 265
		bodyModel[9] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 261
		bodyModel[10] = new ModelRendererTurbo(this, 48, 136, textureX, textureY); // Box 143
		bodyModel[11] = new ModelRendererTurbo(this, 11, 137, textureX, textureY); // Box 61
		bodyModel[12] = new ModelRendererTurbo(this, 51, 137, textureX, textureY); // Box 63
		bodyModel[13] = new ModelRendererTurbo(this, 37, 132, textureX, textureY); // Box 80
		bodyModel[14] = new ModelRendererTurbo(this, 41, 134, textureX, textureY); // Box 144
		bodyModel[15] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[16] = new ModelRendererTurbo(this, 23, 132, textureX, textureY); // Box 147
		bodyModel[17] = new ModelRendererTurbo(this, 19, 134, textureX, textureY); // Box 148
		bodyModel[18] = new ModelRendererTurbo(this, 14, 137, textureX, textureY); // Box 226
		bodyModel[19] = new ModelRendererTurbo(this, 10, 131, textureX, textureY); // Box 227
		bodyModel[20] = new ModelRendererTurbo(this, 85, 132, textureX, textureY); // Box 271
		bodyModel[21] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 274
		bodyModel[22] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 302
		bodyModel[23] = new ModelRendererTurbo(this, 21, 122, textureX, textureY); // Box 303
		bodyModel[24] = new ModelRendererTurbo(this, 34, 129, textureX, textureY); // Box 304
		bodyModel[25] = new ModelRendererTurbo(this, 262, 102, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 270, 76, textureX, textureY); // Box 112
		bodyModel[27] = new ModelRendererTurbo(this, 350, 110, textureX, textureY); // Box 116
		bodyModel[28] = new ModelRendererTurbo(this, 294, 108, textureX, textureY); // Box 163
		bodyModel[29] = new ModelRendererTurbo(this, 333, 207, textureX, textureY); // Box 409
		bodyModel[30] = new ModelRendererTurbo(this, 95, 233, textureX, textureY); // Box 63
		bodyModel[31] = new ModelRendererTurbo(this, 243, 82, textureX, textureY); // Box 170
		bodyModel[32] = new ModelRendererTurbo(this, 341, 70, textureX, textureY); // Box 129
		bodyModel[33] = new ModelRendererTurbo(this, 338, 108, textureX, textureY); // Box 130
		bodyModel[34] = new ModelRendererTurbo(this, 337, 70, textureX, textureY); // Box 133
		bodyModel[35] = new ModelRendererTurbo(this, 335, 108, textureX, textureY); // Box 134
		bodyModel[36] = new ModelRendererTurbo(this, 312, 114, textureX, textureY); // Box 196
		bodyModel[37] = new ModelRendererTurbo(this, 380, 65, textureX, textureY); // Box 198
		bodyModel[38] = new ModelRendererTurbo(this, 324, 67, textureX, textureY); // Box 199
		bodyModel[39] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 4
		bodyModel[40] = new ModelRendererTurbo(this, 42, 133, textureX, textureY); // Box 363
		bodyModel[41] = new ModelRendererTurbo(this, 20, 133, textureX, textureY); // Box 870
		bodyModel[42] = new ModelRendererTurbo(this, 83, 146, textureX, textureY); // Box 272
		bodyModel[43] = new ModelRendererTurbo(this, 83, 141, textureX, textureY); // Box 273
		bodyModel[44] = new ModelRendererTurbo(this, 85, 144, textureX, textureY); // Box 400
		bodyModel[45] = new ModelRendererTurbo(this, 85, 139, textureX, textureY); // Box 401
		bodyModel[46] = new ModelRendererTurbo(this, 14, 136, textureX, textureY); // Box 559
		bodyModel[47] = new ModelRendererTurbo(this, 247, 104, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[48] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 451
		bodyModel[49] = new ModelRendererTurbo(this, 72, 132, textureX, textureY); // Box 452
		bodyModel[50] = new ModelRendererTurbo(this, 70, 141, textureX, textureY); // Box 453
		bodyModel[51] = new ModelRendererTurbo(this, 70, 146, textureX, textureY); // Box 454
		bodyModel[52] = new ModelRendererTurbo(this, 72, 144, textureX, textureY); // Box 394
		bodyModel[53] = new ModelRendererTurbo(this, 72, 139, textureX, textureY); // Box 395
		bodyModel[54] = new ModelRendererTurbo(this, 2, 7, textureX, textureY); // Box 5
		bodyModel[55] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[56] = new ModelRendererTurbo(this, 368, 168, textureX, textureY); // Box 3
		bodyModel[57] = new ModelRendererTurbo(this, 367, 151, textureX, textureY); // Box 164
		bodyModel[58] = new ModelRendererTurbo(this, 399, 151, textureX, textureY); // Box 259
		bodyModel[59] = new ModelRendererTurbo(this, 374, 149, textureX, textureY); // Box 261
		bodyModel[60] = new ModelRendererTurbo(this, 392, 149, textureX, textureY); // Box 262
		bodyModel[61] = new ModelRendererTurbo(this, 374, 156, textureX, textureY); // Box 264
		bodyModel[62] = new ModelRendererTurbo(this, 392, 156, textureX, textureY); // Box 265
		bodyModel[63] = new ModelRendererTurbo(this, 407, 168, textureX, textureY); // Box 61
		bodyModel[64] = new ModelRendererTurbo(this, 367, 168, textureX, textureY); // Box 63
		bodyModel[65] = new ModelRendererTurbo(this, 375, 167, textureX, textureY); // Box 80
		bodyModel[66] = new ModelRendererTurbo(this, 397, 167, textureX, textureY); // Box 81
		bodyModel[67] = new ModelRendererTurbo(this, 380, 159, textureX, textureY); // Box 234
		bodyModel[68] = new ModelRendererTurbo(this, 375, 165, textureX, textureY); // Box 236
		bodyModel[69] = new ModelRendererTurbo(this, 377, 176, textureX, textureY); // Box 202
		bodyModel[70] = new ModelRendererTurbo(this, 382, 180, textureX, textureY); // Box 204
		bodyModel[71] = new ModelRendererTurbo(this, 397, 165, textureX, textureY); // Box 206
		bodyModel[72] = new ModelRendererTurbo(this, 366, 174, textureX, textureY); // Box 207
		bodyModel[73] = new ModelRendererTurbo(this, 370, 180, textureX, textureY); // Box 225
		bodyModel[74] = new ModelRendererTurbo(this, 390, 180, textureX, textureY); // Box 301
		bodyModel[75] = new ModelRendererTurbo(this, 449, 72, textureX, textureY); // Box 203
		bodyModel[76] = new ModelRendererTurbo(this, 402, 166, textureX, textureY); // Box 871
		bodyModel[77] = new ModelRendererTurbo(this, 372, 166, textureX, textureY); // Box 872
		bodyModel[78] = new ModelRendererTurbo(this, 85, 139, textureX, textureY); // Box 541
		bodyModel[79] = new ModelRendererTurbo(this, 83, 141, textureX, textureY); // Box 542
		bodyModel[80] = new ModelRendererTurbo(this, 85, 144, textureX, textureY); // Box 543
		bodyModel[81] = new ModelRendererTurbo(this, 83, 146, textureX, textureY); // Box 544
		bodyModel[82] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 545
		bodyModel[83] = new ModelRendererTurbo(this, 85, 132, textureX, textureY); // Box 546
		bodyModel[84] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 553
		bodyModel[85] = new ModelRendererTurbo(this, 72, 132, textureX, textureY); // Box 554
		bodyModel[86] = new ModelRendererTurbo(this, 72, 139, textureX, textureY); // Box 555
		bodyModel[87] = new ModelRendererTurbo(this, 70, 141, textureX, textureY); // Box 556
		bodyModel[88] = new ModelRendererTurbo(this, 72, 144, textureX, textureY); // Box 557
		bodyModel[89] = new ModelRendererTurbo(this, 70, 146, textureX, textureY); // Box 558
		bodyModel[90] = new ModelRendererTurbo(this, 404, 168, textureX, textureY); // Box 560
		bodyModel[91] = new ModelRendererTurbo(this, 370, 168, textureX, textureY); // Box 561
		bodyModel[92] = new ModelRendererTurbo(this, 372, 114, textureX, textureY); // Box 113
		bodyModel[93] = new ModelRendererTurbo(this, 396, 108, textureX, textureY); // Box 166
		bodyModel[94] = new ModelRendererTurbo(this, 333, 207, textureX, textureY); // Box 408
		bodyModel[95] = new ModelRendererTurbo(this, 361, 70, textureX, textureY); // Box 192
		bodyModel[96] = new ModelRendererTurbo(this, 373, 70, textureX, textureY); // Box 193
		bodyModel[97] = new ModelRendererTurbo(this, 353, 108, textureX, textureY); // Box 194
		bodyModel[98] = new ModelRendererTurbo(this, 365, 108, textureX, textureY); // Box 195
		bodyModel[99] = new ModelRendererTurbo(this, 353, 110, textureX, textureY); // Box 197
		bodyModel[100] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 200
		bodyModel[101] = new ModelRendererTurbo(this, 383, 65, textureX, textureY); // Box 201
		bodyModel[102] = new ModelRendererTurbo(this, 335, 123, textureX, textureY); // Box 489
		bodyModel[103] = new ModelRendererTurbo(this, 310, 153, textureX, textureY); // Box 278
		bodyModel[104] = new ModelRendererTurbo(this, 311, 159, textureX, textureY); // Box 281
		bodyModel[105] = new ModelRendererTurbo(this, 339, 127, textureX, textureY); // Box 288
		bodyModel[106] = new ModelRendererTurbo(this, 311, 124, textureX, textureY); // Box 315
		bodyModel[107] = new ModelRendererTurbo(this, 312, 131, textureX, textureY); // Box 316
		bodyModel[108] = new ModelRendererTurbo(this, 258, 129, textureX, textureY); // Box 559
		bodyModel[109] = new ModelRendererTurbo(this, 279, 164, textureX, textureY); // Box 564
		bodyModel[110] = new ModelRendererTurbo(this, 282, 176, textureX, textureY); // Box 565
		bodyModel[111] = new ModelRendererTurbo(this, 275, 160, textureX, textureY); // Box 566
		bodyModel[112] = new ModelRendererTurbo(this, 281, 171, textureX, textureY); // Box 567
		bodyModel[113] = new ModelRendererTurbo(this, 281, 166, textureX, textureY); // Box 568
		bodyModel[114] = new ModelRendererTurbo(this, 306, 171, textureX, textureY); // Box 569
		bodyModel[115] = new ModelRendererTurbo(this, 307, 176, textureX, textureY); // Box 570
		bodyModel[116] = new ModelRendererTurbo(this, 229, 149, textureX, textureY); // Box 571
		bodyModel[117] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 572
		bodyModel[118] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 573
		bodyModel[119] = new ModelRendererTurbo(this, 232, 156, textureX, textureY); // Box 574
		bodyModel[120] = new ModelRendererTurbo(this, 231, 151, textureX, textureY); // Box 575
		bodyModel[121] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 576
		bodyModel[122] = new ModelRendererTurbo(this, 256, 156, textureX, textureY); // Box 577
		bodyModel[123] = new ModelRendererTurbo(this, 330, 147, textureX, textureY); // Box 19
		bodyModel[124] = new ModelRendererTurbo(this, 325, 147, textureX, textureY); // Box 560
		bodyModel[125] = new ModelRendererTurbo(this, 272, 152, textureX, textureY); // Box 562
		bodyModel[126] = new ModelRendererTurbo(this, 272, 124, textureX, textureY); // Box 563
		bodyModel[127] = new ModelRendererTurbo(this, 42, 50, textureX, textureY, "lamp"); // Box 314 headlight sp front b
		bodyModel[128] = new ModelRendererTurbo(this, 30, 50, textureX, textureY, "lamp"); // Box 315 headlight sp front a
		bodyModel[129] = new ModelRendererTurbo(this, 48, 47, textureX, textureY, "lamp"); // Box 316 headlight front gyralight sp red
		bodyModel[130] = new ModelRendererTurbo(this, 46, 52, textureX, textureY); // Box 317
		bodyModel[131] = new ModelRendererTurbo(this, 33, 51, textureX, textureY); // Box 20
		bodyModel[132] = new ModelRendererTurbo(this, 17, 101, textureX, textureY); // Box 352
		bodyModel[133] = new ModelRendererTurbo(this, 23, 92, textureX, textureY); // Box 353
		bodyModel[134] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 354
		bodyModel[135] = new ModelRendererTurbo(this, 3, 73, textureX, textureY); // Box 356
		bodyModel[136] = new ModelRendererTurbo(this, 31, 73, textureX, textureY); // Box 357
		bodyModel[137] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 355
		bodyModel[138] = new ModelRendererTurbo(this, 8, 46, textureX, textureY, "lamp"); // Box 545 headlight nose high b
		bodyModel[139] = new ModelRendererTurbo(this, 1, 46, textureX, textureY, "lamp"); // Box 546 headlight nose high a
		bodyModel[140] = new ModelRendererTurbo(this, 1, 51, textureX, textureY, "lamp"); // Box 547 headlight nose low a
		bodyModel[141] = new ModelRendererTurbo(this, 8, 51, textureX, textureY, "lamp"); // Box 548 headlight nose low b
		bodyModel[142] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 48
		bodyModel[143] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 296 nose cover
		bodyModel[144] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Box 299 nose cover
		bodyModel[145] = new ModelRendererTurbo(this, 2, 45, textureX, textureY); // Box 43
		bodyModel[146] = new ModelRendererTurbo(this, 44, 46, textureX, textureY); // Box 43
		bodyModel[147] = new ModelRendererTurbo(this, 75, 54, textureX, textureY); // Box 43
		bodyModel[148] = new ModelRendererTurbo(this, 119, 61, textureX, textureY); // Box 43
		bodyModel[149] = new ModelRendererTurbo(this, 119, 64, textureX, textureY); // Box 43
		bodyModel[150] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[151] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[152] = new ModelRendererTurbo(this, 18, 41, textureX, textureY); // Box 1251
		bodyModel[153] = new ModelRendererTurbo(this, 51, 18, textureX, textureY); // Box 52 door swing right
		bodyModel[154] = new ModelRendererTurbo(this, 83, 4, textureX, textureY); // Box 70
		bodyModel[155] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 72
		bodyModel[156] = new ModelRendererTurbo(this, 30, 6, textureX, textureY); // Box 190
		bodyModel[157] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 313
		bodyModel[158] = new ModelRendererTurbo(this, 69, 18, textureX, textureY); // Box 314 door swing right
		bodyModel[159] = new ModelRendererTurbo(this, 101, 23, textureX, textureY); // Box 316
		bodyModel[160] = new ModelRendererTurbo(this, 119, 162, textureX, textureY); // Box 412
		bodyModel[161] = new ModelRendererTurbo(this, 96, 164, textureX, textureY); // Box 413
		bodyModel[162] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 86
		bodyModel[163] = new ModelRendererTurbo(this, 118, 164, textureX, textureY); // Box 527 cab backpannel
		bodyModel[164] = new ModelRendererTurbo(this, 107, 149, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[165] = new ModelRendererTurbo(this, 98, 151, textureX, textureY); // Box 307
		bodyModel[166] = new ModelRendererTurbo(this, 93, 37, textureX, textureY); // Box 11
		bodyModel[167] = new ModelRendererTurbo(this, 27, 37, textureX, textureY); // Box 210
		bodyModel[168] = new ModelRendererTurbo(this, 66, 23, textureX, textureY); // Box 211
		bodyModel[169] = new ModelRendererTurbo(this, 78, 47, textureX, textureY); // Box 48
		bodyModel[170] = new ModelRendererTurbo(this, 82, 49, textureX, textureY); // Box 43
		bodyModel[171] = new ModelRendererTurbo(this, 62, 44, textureX, textureY); // Box 44
		bodyModel[172] = new ModelRendererTurbo(this, 79, 42, textureX, textureY, "lamp"); // Box 186 headlight standard
		bodyModel[173] = new ModelRendererTurbo(this, 72, 44, textureX, textureY, "lamp"); // Box 187 headlight standard
		bodyModel[174] = new ModelRendererTurbo(this, 34, 23, textureX, textureY); // Box 219
		bodyModel[175] = new ModelRendererTurbo(this, 119, 6, textureX, textureY); // Box 220
		bodyModel[176] = new ModelRendererTurbo(this, 104, 12, textureX, textureY); // Box 221
		bodyModel[177] = new ModelRendererTurbo(this, 104, 4, textureX, textureY); // Box 222
		bodyModel[178] = new ModelRendererTurbo(this, 34, 41, textureX, textureY); // Box 223
		bodyModel[179] = new ModelRendererTurbo(this, 86, 41, textureX, textureY); // Box 224
		bodyModel[180] = new ModelRendererTurbo(this, 161, 12, textureX, textureY); // Box 114
		bodyModel[181] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 74
		bodyModel[182] = new ModelRendererTurbo(this, 161, 15, textureX, textureY); // Box 78
		bodyModel[183] = new ModelRendererTurbo(this, 159, 6, textureX, textureY); // Box 245
		bodyModel[184] = new ModelRendererTurbo(this, 176, 44, textureX, textureY); // Box 336
		bodyModel[185] = new ModelRendererTurbo(this, 173, 43, textureX, textureY, "lamp"); // Box 337 lamp
		bodyModel[186] = new ModelRendererTurbo(this, 183, 43, textureX, textureY, "lamp"); // Box 338 lamp
		bodyModel[187] = new ModelRendererTurbo(this, 323, 29, textureX, textureY); // Box 34
		bodyModel[188] = new ModelRendererTurbo(this, 306, 1, textureX, textureY); // Box 273
		bodyModel[189] = new ModelRendererTurbo(this, 333, 4, textureX, textureY); // Box 274 sd39 exhaust
		bodyModel[190] = new ModelRendererTurbo(this, 340, 3, textureX, textureY); // Box 275
		bodyModel[191] = new ModelRendererTurbo(this, 434, 2, textureX, textureY); // Box 276
		bodyModel[192] = new ModelRendererTurbo(this, 415, 5, textureX, textureY); // Box 277
		bodyModel[193] = new ModelRendererTurbo(this, 357, 3, textureX, textureY); // Box 278
		bodyModel[194] = new ModelRendererTurbo(this, 376, 5, textureX, textureY); // Box 280
		bodyModel[195] = new ModelRendererTurbo(this, 308, 25, textureX, textureY); // Box 308
		bodyModel[196] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 309
		bodyModel[197] = new ModelRendererTurbo(this, 306, 15, textureX, textureY); // Box 310
		bodyModel[198] = new ModelRendererTurbo(this, 295, 15, textureX, textureY); // Box 311
		bodyModel[199] = new ModelRendererTurbo(this, 387, 22, textureX, textureY); // Box 100
		bodyModel[200] = new ModelRendererTurbo(this, 387, 15, textureX, textureY); // Box 101
		bodyModel[201] = new ModelRendererTurbo(this, 354, 22, textureX, textureY); // Box 102
		bodyModel[202] = new ModelRendererTurbo(this, 414, 22, textureX, textureY); // Box 103
		bodyModel[203] = new ModelRendererTurbo(this, 414, 15, textureX, textureY); // Box 104
		bodyModel[204] = new ModelRendererTurbo(this, 354, 15, textureX, textureY); // Box 105
		bodyModel[205] = new ModelRendererTurbo(this, 396, 2, textureX, textureY); // Box 279
		bodyModel[206] = new ModelRendererTurbo(this, 478, 84, textureX, textureY); // Box 31
		bodyModel[207] = new ModelRendererTurbo(this, 461, 84, textureX, textureY); // Box 40
		bodyModel[208] = new ModelRendererTurbo(this, 487, 84, textureX, textureY); // Box 41
		bodyModel[209] = new ModelRendererTurbo(this, 465, 76, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[210] = new ModelRendererTurbo(this, 491, 76, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[211] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 247 headlight rear 2 beam
		bodyModel[212] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 248 headlight rear 2 beam
		bodyModel[213] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 381 sp mount
		bodyModel[214] = new ModelRendererTurbo(this, 426, 134, textureX, textureY); // Box 31 sp mount
		bodyModel[215] = new ModelRendererTurbo(this, 423, 133, textureX, textureY, "lamp"); // Box 247 lamp gyralight rear
		bodyModel[216] = new ModelRendererTurbo(this, 423, 133, textureX, textureY, "lamp"); // Box 248 lamp gyralight rear
		bodyModel[217] = new ModelRendererTurbo(this, 423, 128, textureX, textureY, "lamp"); // Box 388 light red gyralight rear
		bodyModel[218] = new ModelRendererTurbo(this, 430, 128, textureX, textureY); // Box 389 sp mount
		bodyModel[219] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[220] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[221] = new ModelRendererTurbo(this, 450, 84, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[222] = new ModelRendererTurbo(this, 450, 84, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[223] = new ModelRendererTurbo(this, 313, 116, textureX, textureY); // Box 36
		bodyModel[224] = new ModelRendererTurbo(this, 302, 55, textureX, textureY); // Box 271
		bodyModel[225] = new ModelRendererTurbo(this, 302, 50, textureX, textureY); // Box 272
		bodyModel[226] = new ModelRendererTurbo(this, 308, 38, textureX, textureY); // Box 270
		bodyModel[227] = new ModelRendererTurbo(this, 125, 107, textureX, textureY); // Box 303
		bodyModel[228] = new ModelRendererTurbo(this, 116, 107, textureX, textureY); // Box 304
		bodyModel[229] = new ModelRendererTurbo(this, 116, 107, textureX, textureY); // Box 305
		bodyModel[230] = new ModelRendererTurbo(this, 112, 103, textureX, textureY); // Box 836
		bodyModel[231] = new ModelRendererTurbo(this, 118, 125, textureX, textureY); // Box 38R
		bodyModel[232] = new ModelRendererTurbo(this, 119, 136, textureX, textureY); // Box 176
		bodyModel[233] = new ModelRendererTurbo(this, 410, 155, textureX, textureY); // Box 243
		bodyModel[234] = new ModelRendererTurbo(this, 407, 160, textureX, textureY); // Box 244
		bodyModel[235] = new ModelRendererTurbo(this, 367, 160, textureX, textureY); // Box 249
		bodyModel[236] = new ModelRendererTurbo(this, 362, 155, textureX, textureY); // Box 250
		bodyModel[237] = new ModelRendererTurbo(this, 119, 134, textureX, textureY); // Box 313
		bodyModel[238] = new ModelRendererTurbo(this, 192, 134, textureX, textureY); // Box 315
		bodyModel[239] = new ModelRendererTurbo(this, 194, 136, textureX, textureY); // Box 316
		bodyModel[240] = new ModelRendererTurbo(this, 125, 123, textureX, textureY); // Box 306
		bodyModel[241] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 307
		bodyModel[242] = new ModelRendererTurbo(this, 115, 123, textureX, textureY); // Box 868
		bodyModel[243] = new ModelRendererTurbo(this, 427, 220, textureX, textureY); // Box 297 vent 2 part f
		bodyModel[244] = new ModelRendererTurbo(this, 387, 220, textureX, textureY); // Box 299 vent 2 part e
		bodyModel[245] = new ModelRendererTurbo(this, 427, 220, textureX, textureY); // Box 272 vent 2 part f
		bodyModel[246] = new ModelRendererTurbo(this, 387, 220, textureX, textureY); // Box 273 vent 2 part e
		bodyModel[247] = new ModelRendererTurbo(this, 440, 19, textureX, textureY); // Box 276
		bodyModel[248] = new ModelRendererTurbo(this, 465, 19, textureX, textureY); // Box 277
		bodyModel[249] = new ModelRendererTurbo(this, 65, 55, textureX, textureY); // Box 133
		bodyModel[250] = new ModelRendererTurbo(this, 90, 113, textureX, textureY); // Box 245
		bodyModel[251] = new ModelRendererTurbo(this, 89, 103, textureX, textureY); // Box 246
		bodyModel[252] = new ModelRendererTurbo(this, 54, 129, textureX, textureY); // Box 81
		bodyModel[253] = new ModelRendererTurbo(this, 51, 129, textureX, textureY); // Box 81
		bodyModel[254] = new ModelRendererTurbo(this, 11, 129, textureX, textureY); // Box 176
		bodyModel[255] = new ModelRendererTurbo(this, 6, 129, textureX, textureY); // Box 177
		bodyModel[256] = new ModelRendererTurbo(this, 98, 136, textureX, textureY); // Box 258
		bodyModel[257] = new ModelRendererTurbo(this, 106, 136, textureX, textureY); // Box 260
		bodyModel[258] = new ModelRendererTurbo(this, 101, 134, textureX, textureY); // Box 261
		bodyModel[259] = new ModelRendererTurbo(this, 97, 125, textureX, textureY); // Box 265
		bodyModel[260] = new ModelRendererTurbo(this, 101, 123, textureX, textureY); // Box 266
		bodyModel[261] = new ModelRendererTurbo(this, 105, 125, textureX, textureY); // Box 267
		bodyModel[262] = new ModelRendererTurbo(this, 86, 117, textureX, textureY); // Box 281
		bodyModel[263] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 282
		bodyModel[264] = new ModelRendererTurbo(this, 83, 107, textureX, textureY); // Box 283
		bodyModel[265] = new ModelRendererTurbo(this, 86, 107, textureX, textureY); // Box 284
		bodyModel[266] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 408
		bodyModel[267] = new ModelRendererTurbo(this, 76, 107, textureX, textureY); // Box 409
		bodyModel[268] = new ModelRendererTurbo(this, 53, 172, textureX, textureY, BoxName.ditch); // Box 356 front ditchlight C
		bodyModel[269] = new ModelRendererTurbo(this, 53, 172, textureX, textureY, BoxName.ditch); // Box 357 front ditchlight C
		bodyModel[270] = new ModelRendererTurbo(this, 59, 176, textureX, textureY); // Box 358
		bodyModel[271] = new ModelRendererTurbo(this, 59, 176, textureX, textureY); // Box 359
		bodyModel[272] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 78
		bodyModel[273] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 188
		bodyModel[274] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 189 ditchlight front a
		bodyModel[275] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 190 ditchlight front a
		bodyModel[276] = new ModelRendererTurbo(this, 34, 120, textureX, textureY); // Box 268 anticlimber
		bodyModel[277] = new ModelRendererTurbo(this, 12, 120, textureX, textureY); // Box 269anticlimber
		bodyModel[278] = new ModelRendererTurbo(this, 4, 182, textureX, textureY); // Box 22
		bodyModel[279] = new ModelRendererTurbo(this, 38, 182, textureX, textureY); // Box 23
		bodyModel[280] = new ModelRendererTurbo(this, 4, 195, textureX, textureY); // Box 24
		bodyModel[281] = new ModelRendererTurbo(this, 38, 195, textureX, textureY); // Box 25
		bodyModel[282] = new ModelRendererTurbo(this, 2, 170, textureX, textureY); // Box 4
		bodyModel[283] = new ModelRendererTurbo(this, 56, 162, textureX, textureY); // Box 4
		bodyModel[284] = new ModelRendererTurbo(this, 36, 170, textureX, textureY); // Box 4
		bodyModel[285] = new ModelRendererTurbo(this, 71, 160, textureX, textureY); // Box 4
		bodyModel[286] = new ModelRendererTurbo(this, 56, 174, textureX, textureY); // Box 448
		bodyModel[287] = new ModelRendererTurbo(this, 71, 171, textureX, textureY); // Box 449
		bodyModel[288] = new ModelRendererTurbo(this, 6, 160, textureX, textureY); // Box 280
		bodyModel[289] = new ModelRendererTurbo(this, 40, 160, textureX, textureY); // Box 285
		bodyModel[290] = new ModelRendererTurbo(this, 441, 188, textureX, textureY); // Box 1163
		bodyModel[291] = new ModelRendererTurbo(this, 424, 185, textureX, textureY); // Box 1164
		bodyModel[292] = new ModelRendererTurbo(this, 456, 191, textureX, textureY); // Box 1165
		bodyModel[293] = new ModelRendererTurbo(this, 409, 188, textureX, textureY); // Box 1166
		bodyModel[294] = new ModelRendererTurbo(this, 422, 173, textureX, textureY); // Box 1167
		bodyModel[295] = new ModelRendererTurbo(this, 439, 175, textureX, textureY); // Box 1168
		bodyModel[296] = new ModelRendererTurbo(this, 441, 165, textureX, textureY); // Box 1169
		bodyModel[297] = new ModelRendererTurbo(this, 426, 163, textureX, textureY); // Box 1170
		bodyModel[298] = new ModelRendererTurbo(this, 467, 176, textureX, textureY); // Box 1171
		bodyModel[299] = new ModelRendererTurbo(this, 482, 179, textureX, textureY); // Box 1172
		bodyModel[300] = new ModelRendererTurbo(this, 482, 168, textureX, textureY); // Box 1173
		bodyModel[301] = new ModelRendererTurbo(this, 467, 166, textureX, textureY); // Box 1174
		bodyModel[302] = new ModelRendererTurbo(this, 400, 181, textureX, textureY); // Box 239
		bodyModel[303] = new ModelRendererTurbo(this, 393, 181, textureX, textureY, BoxName.ditch); // Box 240 ditchlight rear a
		bodyModel[304] = new ModelRendererTurbo(this, 393, 181, textureX, textureY, BoxName.ditch); // Box 241 ditchlight rear a
		bodyModel[305] = new ModelRendererTurbo(this, 400, 181, textureX, textureY); // Box 242
		bodyModel[306] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 254
		bodyModel[307] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 255
		bodyModel[308] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, BoxName.ditch); // Box 256 ditchlight rear b
		bodyModel[309] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, BoxName.ditch); // Box 257 ditchlight rear b
		bodyModel[310] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 250
		bodyModel[311] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, BoxName.ditch); // Box 251 ditchlight front b
		bodyModel[312] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, BoxName.ditch); // Box 252 ditchlight front b
		bodyModel[313] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 253
		bodyModel[314] = new ModelRendererTurbo(this, 106, 52, textureX, textureY); // Box 355 brakewheel
		bodyModel[315] = new ModelRendererTurbo(this, 101, 55, textureX, textureY); // Box 356
		bodyModel[316] = new ModelRendererTurbo(this, 75, 62, textureX, textureY); // Box 346 nose brake cover
		bodyModel[317] = new ModelRendererTurbo(this, 268, 9, textureX, textureY); // Box 264 sd38 filter box
		bodyModel[318] = new ModelRendererTurbo(this, 335, 22, textureX, textureY); // Box 285
		bodyModel[319] = new ModelRendererTurbo(this, 335, 15, textureX, textureY); // Box 286
		bodyModel[320] = new ModelRendererTurbo(this, 378, 22, textureX, textureY); // Box 879 dynamics short
		bodyModel[321] = new ModelRendererTurbo(this, 378, 15, textureX, textureY); // Box 880 dynamics short
		bodyModel[322] = new ModelRendererTurbo(this, 437, 209, textureX, textureY); // Box 847 vent 1 part f
		bodyModel[323] = new ModelRendererTurbo(this, 362, 209, textureX, textureY); // Box 850 vent 1 part e
		bodyModel[324] = new ModelRendererTurbo(this, 5, 175, textureX, textureY); // Box 396
		bodyModel[325] = new ModelRendererTurbo(this, 5, 187, textureX, textureY); // Box 397
		bodyModel[326] = new ModelRendererTurbo(this, 5, 170, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[327] = new ModelRendererTurbo(this, 5, 182, textureX, textureY); // Box 399 not a ditchlight will not glow
		bodyModel[328] = new ModelRendererTurbo(this, 409, 186, textureX, textureY); // Box 392
		bodyModel[329] = new ModelRendererTurbo(this, 416, 183, textureX, textureY); // Box 393
		bodyModel[330] = new ModelRendererTurbo(this, 409, 181, textureX, textureY); // Box 394 not a ditchlight will not glow
		bodyModel[331] = new ModelRendererTurbo(this, 416, 178, textureX, textureY); // Box 395 not a ditchlight will not glow
		bodyModel[332] = new ModelRendererTurbo(this, 453, 1, textureX, textureY); // Box 274 sd38 exhaust
		bodyModel[333] = new ModelRendererTurbo(this, 454, 8, textureX, textureY); // Box 275 sd38 exhaust
		bodyModel[334] = new ModelRendererTurbo(this, 59, 240, textureX, textureY); // Box 352
		bodyModel[335] = new ModelRendererTurbo(this, 60, 231, textureX, textureY); // Box 353
		bodyModel[336] = new ModelRendererTurbo(this, 2, 231, textureX, textureY); // Box 354
		bodyModel[337] = new ModelRendererTurbo(this, 2, 221, textureX, textureY); // Box 356
		bodyModel[338] = new ModelRendererTurbo(this, 60, 221, textureX, textureY); // Box 357
		bodyModel[339] = new ModelRendererTurbo(this, 22, 228, textureX, textureY); // Box 358
		bodyModel[340] = new ModelRendererTurbo(this, 1, 240, textureX, textureY); // Box 355
		bodyModel[341] = new ModelRendererTurbo(this, 61, 234, textureX, textureY); // Box 542
		bodyModel[342] = new ModelRendererTurbo(this, 38, 217, textureX, textureY); // Box 544
		bodyModel[343] = new ModelRendererTurbo(this, 48, 236, textureX, textureY); // Box 386 brakewheel snoot
		bodyModel[344] = new ModelRendererTurbo(this, 21, 236, textureX, textureY, "lamp"); // Box 545 headlight nose high b
		bodyModel[345] = new ModelRendererTurbo(this, 21, 236, textureX, textureY, "lamp"); // Box 546 headlight nose high a
		bodyModel[346] = new ModelRendererTurbo(this, 29, 236, textureX, textureY, "lamp"); // Box 547 headlight nose low a
		bodyModel[347] = new ModelRendererTurbo(this, 21, 231, textureX, textureY, "lamp"); // Box 548 headlight nose low b
		bodyModel[348] = new ModelRendererTurbo(this, 36, 220, textureX, textureY); // Box 391
		bodyModel[349] = new ModelRendererTurbo(this, 45, 228, textureX, textureY); // Box 392
		bodyModel[350] = new ModelRendererTurbo(this, 31, 228, textureX, textureY); // Box 393
		bodyModel[351] = new ModelRendererTurbo(this, 82, 2, textureX, textureY); // box64
		bodyModel[352] = new ModelRendererTurbo(this, 34, 2, textureX, textureY); // box65
		bodyModel[353] = new ModelRendererTurbo(this, 192, 60, textureX, textureY); // Box 284
		bodyModel[354] = new ModelRendererTurbo(this, 55, 12, textureX, textureY); // Box 350
		bodyModel[355] = new ModelRendererTurbo(this, 73, 7, textureX, textureY); // Box 351
		bodyModel[356] = new ModelRendererTurbo(this, 129, 75, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[357] = new ModelRendererTurbo(this, 131, 70, textureX, textureY); // Box 5
		bodyModel[358] = new ModelRendererTurbo(this, 129, 91, textureX, textureY, "cull"); // Box 1087 cull
		bodyModel[359] = new ModelRendererTurbo(this, 131, 86, textureX, textureY); // Box 1088
		bodyModel[360] = new ModelRendererTurbo(this, 184, 9, textureX, textureY); // Box 114
		bodyModel[361] = new ModelRendererTurbo(this, 184, 6, textureX, textureY); // Box 74
		bodyModel[362] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Box 78
		bodyModel[363] = new ModelRendererTurbo(this, 183, 2, textureX, textureY, "cull"); // Box 1007 cull
		bodyModel[364] = new ModelRendererTurbo(this, 236, 27, textureX, textureY); // Box 327
		bodyModel[365] = new ModelRendererTurbo(this, 238, 24, textureX, textureY); // Box 328
		bodyModel[366] = new ModelRendererTurbo(this, 238, 30, textureX, textureY); // Box 329
		bodyModel[367] = new ModelRendererTurbo(this, 247, 27, textureX, textureY); // Box 330
		bodyModel[368] = new ModelRendererTurbo(this, 211, 30, textureX, textureY); // Box 361
		bodyModel[369] = new ModelRendererTurbo(this, 202, 31, textureX, textureY); // Box 362
		bodyModel[370] = new ModelRendererTurbo(this, 204, 37, textureX, textureY); // Box 363
		bodyModel[371] = new ModelRendererTurbo(this, 204, 34, textureX, textureY); // Box 364
		bodyModel[372] = new ModelRendererTurbo(this, 229, 26, textureX, textureY); // Box 403
		bodyModel[373] = new ModelRendererTurbo(this, 222, 27, textureX, textureY); // Box 404
		bodyModel[374] = new ModelRendererTurbo(this, 220, 24, textureX, textureY); // Box 405
		bodyModel[375] = new ModelRendererTurbo(this, 222, 30, textureX, textureY); // Box 406
		bodyModel[376] = new ModelRendererTurbo(this, 236, 40, textureX, textureY); // Box 327
		bodyModel[377] = new ModelRendererTurbo(this, 238, 34, textureX, textureY); // Box 328
		bodyModel[378] = new ModelRendererTurbo(this, 238, 46, textureX, textureY); // Box 329
		bodyModel[379] = new ModelRendererTurbo(this, 247, 40, textureX, textureY); // Box 330
		bodyModel[380] = new ModelRendererTurbo(this, 240, 37, textureX, textureY); // Box 331
		bodyModel[381] = new ModelRendererTurbo(this, 240, 43, textureX, textureY); // Box 332
		bodyModel[382] = new ModelRendererTurbo(this, 196, 32, textureX, textureY); // Box 1231
		bodyModel[383] = new ModelRendererTurbo(this, 187, 26, textureX, textureY); // Box 1232
		bodyModel[384] = new ModelRendererTurbo(this, 185, 32, textureX, textureY); // Box 1233
		bodyModel[385] = new ModelRendererTurbo(this, 187, 38, textureX, textureY); // Box 1234
		bodyModel[386] = new ModelRendererTurbo(this, 189, 29, textureX, textureY); // Box 1235
		bodyModel[387] = new ModelRendererTurbo(this, 189, 35, textureX, textureY); // Box 1236
		bodyModel[388] = new ModelRendererTurbo(this, 205, 5, textureX, textureY); // Box 1264
		bodyModel[389] = new ModelRendererTurbo(this, 206, 9, textureX, textureY); // Box 1265
		bodyModel[390] = new ModelRendererTurbo(this, 206, 12, textureX, textureY); // Box 1266
		bodyModel[391] = new ModelRendererTurbo(this, 206, 15, textureX, textureY); // Box 1267
		bodyModel[392] = new ModelRendererTurbo(this, 460, 17, textureX, textureY); // Box 532
		bodyModel[393] = new ModelRendererTurbo(this, 460, 21, textureX, textureY); // Box 533
		bodyModel[394] = new ModelRendererTurbo(this, 369, 22, textureX, textureY); // Box 881
		bodyModel[395] = new ModelRendererTurbo(this, 369, 15, textureX, textureY); // Box 882
		bodyModel[396] = new ModelRendererTurbo(this, 276, 25, textureX, textureY); // Box 445 sd38das2 filter box i think
		bodyModel[397] = new ModelRendererTurbo(this, 226, 12, textureX, textureY); // Box 364 prime base
		bodyModel[398] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[399] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[400] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[401] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[402] = new ModelRendererTurbo(this, 225, 16, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[403] = new ModelRendererTurbo(this, 237, 16, textureX, textureY, "cull"); // Box 420 cull
		bodyModel[404] = new ModelRendererTurbo(this, 238, 12, textureX, textureY); // Box 421 prime base
		bodyModel[405] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[406] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[407] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[408] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[409] = new ModelRendererTurbo(this, 264, 44, textureX, textureY, "cull"); // Box 389 support cull
		bodyModel[410] = new ModelRendererTurbo(this, 255, 44, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[411] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 409 commander base
		bodyModel[412] = new ModelRendererTurbo(this, 257, 37, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[413] = new ModelRendererTurbo(this, 266, 41, textureX, textureY); // Box 409 commander base
		bodyModel[414] = new ModelRendererTurbo(this, 266, 37, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[415] = new ModelRendererTurbo(this, 255, 24, textureX, textureY); // Box 271
		bodyModel[416] = new ModelRendererTurbo(this, 255, 30, textureX, textureY); // Box 272
		bodyModel[417] = new ModelRendererTurbo(this, 264, 27, textureX, textureY); // Box 273
		bodyModel[418] = new ModelRendererTurbo(this, 253, 27, textureX, textureY); // Box 274
		bodyModel[419] = new ModelRendererTurbo(this, 449, 30, textureX, textureY, "cull"); // Box 196 winterization hatch cull
		bodyModel[420] = new ModelRendererTurbo(this, 222, 43, textureX, textureY); // Box 338
		bodyModel[421] = new ModelRendererTurbo(this, 220, 40, textureX, textureY); // Box 339
		bodyModel[422] = new ModelRendererTurbo(this, 222, 37, textureX, textureY); // Box 340
		bodyModel[423] = new ModelRendererTurbo(this, 231, 39, textureX, textureY); // Box 341
		bodyModel[424] = new ModelRendererTurbo(this, 228, 65, textureX, textureY, "cull"); // Box 369 cull
		bodyModel[425] = new ModelRendererTurbo(this, 149, 35, textureX, textureY); // Box 372
		bodyModel[426] = new ModelRendererTurbo(this, 160, 57, textureX, textureY, "cull"); // Box 282 antenna plate cull
		bodyModel[427] = new ModelRendererTurbo(this, 149, 30, textureX, textureY); // Box 450
		bodyModel[428] = new ModelRendererTurbo(this, 208, 61, textureX, textureY); // Box 361
		bodyModel[429] = new ModelRendererTurbo(this, 201, 58, textureX, textureY); // Box 362
		bodyModel[430] = new ModelRendererTurbo(this, 201, 64, textureX, textureY); // Box 363
		bodyModel[431] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 364
		bodyModel[432] = new ModelRendererTurbo(this, 201, 44, textureX, textureY); // Box 365
		bodyModel[433] = new ModelRendererTurbo(this, 201, 50, textureX, textureY); // Box 366
		bodyModel[434] = new ModelRendererTurbo(this, 173, 57, textureX, textureY); // Box 184 o2 generator
		bodyModel[435] = new ModelRendererTurbo(this, 172, 32, textureX, textureY); // Box 342
		bodyModel[436] = new ModelRendererTurbo(this, 172, 29, textureX, textureY); // Box 343
		bodyModel[437] = new ModelRendererTurbo(this, 170, 35, textureX, textureY); // Box 344
		bodyModel[438] = new ModelRendererTurbo(this, 179, 31, textureX, textureY); // Box 345
		bodyModel[439] = new ModelRendererTurbo(this, 256, 12, textureX, textureY); // Box 421 prime base
		bodyModel[440] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[441] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[442] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[443] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[444] = new ModelRendererTurbo(this, 256, 16, textureX, textureY, "cull"); // Box 355 support cull
		bodyModel[445] = new ModelRendererTurbo(this, 165, 32, textureX, textureY); // Box 1095
		bodyModel[446] = new ModelRendererTurbo(this, 156, 29, textureX, textureY); // Box 1096
		bodyModel[447] = new ModelRendererTurbo(this, 154, 32, textureX, textureY); // Box 1097
		bodyModel[448] = new ModelRendererTurbo(this, 156, 35, textureX, textureY); // Box 1098
		bodyModel[449] = new ModelRendererTurbo(this, 175, 9, textureX, textureY); // Box 421 prime base
		bodyModel[450] = new ModelRendererTurbo(this, 175, 5, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[451] = new ModelRendererTurbo(this, 175, 5, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[452] = new ModelRendererTurbo(this, 175, 5, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[453] = new ModelRendererTurbo(this, 175, 5, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[454] = new ModelRendererTurbo(this, 149, 25, textureX, textureY); // Box 430
		bodyModel[455] = new ModelRendererTurbo(this, 219, 12, textureX, textureY); // Box 409 commander base
		bodyModel[456] = new ModelRendererTurbo(this, 219, 8, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[457] = new ModelRendererTurbo(this, 149, 28, textureX, textureY); // Box 448
		bodyModel[458] = new ModelRendererTurbo(this, 152, 25, textureX, textureY); // Box 446
		bodyModel[459] = new ModelRendererTurbo(this, 227, 21, textureX, textureY); // Box 415
		bodyModel[460] = new ModelRendererTurbo(this, 48, 129, textureX, textureY); // Box 540
		bodyModel[461] = new ModelRendererTurbo(this, 14, 129, textureX, textureY); // Box 541
		bodyModel[462] = new ModelRendererTurbo(this, 370, 160, textureX, textureY); // Box 542
		bodyModel[463] = new ModelRendererTurbo(this, 404, 160, textureX, textureY); // Box 543
		bodyModel[464] = new ModelRendererTurbo(this, 190, 12, textureX, textureY); // Box 114
		bodyModel[465] = new ModelRendererTurbo(this, 190, 9, textureX, textureY); // Box 74
		bodyModel[466] = new ModelRendererTurbo(this, 190, 15, textureX, textureY); // Box 78
		bodyModel[467] = new ModelRendererTurbo(this, 189, 5, textureX, textureY); // Box 245
		bodyModel[468] = new ModelRendererTurbo(this, 265, 15, textureX, textureY, "cull"); // Box 378 cull
		bodyModel[469] = new ModelRendererTurbo(this, 169, 12, textureX, textureY); // Box 114
		bodyModel[470] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 74
		bodyModel[471] = new ModelRendererTurbo(this, 169, 15, textureX, textureY); // Box 78
		bodyModel[472] = new ModelRendererTurbo(this, 168, 5, textureX, textureY); // Box 245
		bodyModel[473] = new ModelRendererTurbo(this, 266, 12, textureX, textureY); // Box 409 commander base
		bodyModel[474] = new ModelRendererTurbo(this, 266, 8, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[475] = new ModelRendererTurbo(this, 113, 114, textureX, textureY); // Box 1203
		bodyModel[476] = new ModelRendererTurbo(this, 456, 102, textureX, textureY); // Box 444
		bodyModel[477] = new ModelRendererTurbo(this, 449, 101, textureX, textureY); // Box 445
		bodyModel[478] = new ModelRendererTurbo(this, 449, 109, textureX, textureY); // Box 527 brakewheel rear
		bodyModel[479] = new ModelRendererTurbo(this, 35, 172, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[480] = new ModelRendererTurbo(this, 32, 166, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[481] = new ModelRendererTurbo(this, 419, 162, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[482] = new ModelRendererTurbo(this, 419, 156, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[483] = new ModelRendererTurbo(this, 350, 186, textureX, textureY); // Box 392
		bodyModel[484] = new ModelRendererTurbo(this, 351, 181, textureX, textureY); // Box 394 not a ditchlight will not glow
		bodyModel[485] = new ModelRendererTurbo(this, 351, 194, textureX, textureY); // Box 392
		bodyModel[486] = new ModelRendererTurbo(this, 19, 172, textureX, textureY); // Box 392 Santa Fe connector
		bodyModel[487] = new ModelRendererTurbo(this, 28, 175, textureX, textureY); // Box 392 Santa Fe connector
		bodyModel[488] = new ModelRendererTurbo(this, 26, 169, textureX, textureY); // Box 399 not a ditchlight will not glow
		bodyModel[489] = new ModelRendererTurbo(this, 172, 25, textureX, textureY); // Box 324 SP bell
		bodyModel[490] = new ModelRendererTurbo(this, 172, 22, textureX, textureY); // Box 324 SP bell
		bodyModel[491] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 324 SP bell
		bodyModel[492] = new ModelRendererTurbo(this, 169, 21, textureX, textureY); // Box 324 SP bell
		bodyModel[493] = new ModelRendererTurbo(this, 190, 50, textureX, textureY); // Box 302
		bodyModel[494] = new ModelRendererTurbo(this, 195, 47, textureX, textureY); // Box 405
		bodyModel[495] = new ModelRendererTurbo(this, 189, 47, textureX, textureY); // Box 406
		bodyModel[496] = new ModelRendererTurbo(this, 190, 44, textureX, textureY); // Box 302
		bodyModel[497] = new ModelRendererTurbo(this, 195, 41, textureX, textureY); // Box 405
		bodyModel[498] = new ModelRendererTurbo(this, 189, 41, textureX, textureY); // Box 406
		bodyModel[499] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 48

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[0].setRotationPoint(-51F, 3F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-48F, 2.5F, -2F);

		bodyModel[2].addBox(0F, 0F, 0F, 94, 2, 12, 0F); // Box 23
		bodyModel[2].setRotationPoint(-47F, 1F, -6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[3].setRotationPoint(-43F, 1F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[4].setRotationPoint(-47F, 0F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[5].setRotationPoint(-43F, 1F, 7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[6].setRotationPoint(-43F, 0F, 7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[7].setRotationPoint(-43F, 5F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[8].setRotationPoint(-43F, 5F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[9].setRotationPoint(-43F, 0F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[10].setRotationPoint(-47F, -8F, -8F);
		bodyModel[10].rotateAngleY = -3.14159265F;

		bodyModel[11].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[11].setRotationPoint(-47F, -1F, 10F);

		bodyModel[12].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[12].setRotationPoint(-47F, -1F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[13].setRotationPoint(-47F, -8F, -6F);

		bodyModel[14].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 144
		bodyModel[14].setRotationPoint(-47F, -8F, -8F);

		bodyModel[15].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[15].setRotationPoint(-48F, -8F, -4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[16].setRotationPoint(-47F, -8F, 4F);

		bodyModel[17].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 148
		bodyModel[17].setRotationPoint(-47F, -8F, 6F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 226
		bodyModel[18].setRotationPoint(-47F, 8F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[19].setRotationPoint(-47F, 7F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[20].setRotationPoint(-47F, 1F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[21].setRotationPoint(-47F, 3F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[22].setRotationPoint(-48F, 0F, 5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[23].setRotationPoint(-48F, 0F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[24].setRotationPoint(-48F, 0F, -6F);

		bodyModel[25].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 0
		bodyModel[25].setRotationPoint(-42F, 0F, -11F);

		bodyModel[26].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 112
		bodyModel[26].setRotationPoint(-42F, 0F, 7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 116
		bodyModel[27].setRotationPoint(-13F, 1F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[28].setRotationPoint(-29.5F, 3F, -2F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 409
		bodyModel[29].setRotationPoint(-29F, 1F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 94, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[30].setRotationPoint(-47F, 3F, -6.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 94, 1, 14, 0F); // Box 170
		bodyModel[31].setRotationPoint(-47F, 0F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[32].setRotationPoint(-29F, 2F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[33].setRotationPoint(-29F, 2F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[34].setRotationPoint(-28F, 2F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[35].setRotationPoint(-28F, 2F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		bodyModel[36].setRotationPoint(-42F, 1F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 198
		bodyModel[37].setRotationPoint(-13F, 1F, 11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 199
		bodyModel[38].setRotationPoint(-42F, 1F, 11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[39].setRotationPoint(-47F, 3F, -2.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[40].setRotationPoint(-47.01F, -7F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		bodyModel[41].setRotationPoint(-47.01F, -7F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[42].setRotationPoint(-47F, 8F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[43].setRotationPoint(-47F, 5F, -10F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[44].setRotationPoint(-47F, 7F, -9F);

		bodyModel[45].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 401
		bodyModel[45].setRotationPoint(-47F, 4F, -8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[46].setRotationPoint(-47F, -8F, 9F);
		bodyModel[46].rotateAngleY = -3.14159265F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[47].setRotationPoint(-15F, 1F, 8.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[48].setRotationPoint(-47F, 3F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[49].setRotationPoint(-47F, 1F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[50].setRotationPoint(-47F, 5F, 8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[51].setRotationPoint(-47F, 8F, 9F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 394
		bodyModel[52].setRotationPoint(-47F, 7F, 9F);

		bodyModel[53].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
		bodyModel[53].setRotationPoint(-47F, 4F, 8F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 5
		bodyModel[54].setRotationPoint(48F, 3F, -1.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[55].setRotationPoint(47F, 2.5F, -2F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[56].setRotationPoint(47F, 0F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[57].setRotationPoint(42F, 1F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[58].setRotationPoint(42F, 1F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[59].setRotationPoint(42F, 0F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[60].setRotationPoint(42F, 0F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Box 264
		bodyModel[61].setRotationPoint(42F, 5F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[62].setRotationPoint(42F, 5F, 7F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[63].setRotationPoint(47F, -1F, 10F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[64].setRotationPoint(47F, -1F, -11F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 80
		bodyModel[65].setRotationPoint(47F, -8F, -8F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 81
		bodyModel[66].setRotationPoint(47F, -8F, 6F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 234
		bodyModel[67].setRotationPoint(48F, -8F, -4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[68].setRotationPoint(47F, -8F, -6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[69].setRotationPoint(47F, 0F, -5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[70].setRotationPoint(47F, 0F, -6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[71].setRotationPoint(47F, -8F, 4F);

		bodyModel[72].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[72].setRotationPoint(47F, 7F, -11F);

		bodyModel[73].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 225
		bodyModel[73].setRotationPoint(47F, 8F, -9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[74].setRotationPoint(47F, 0F, 5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 203
		bodyModel[75].setRotationPoint(42F, 3F, -2.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 871
		bodyModel[76].setRotationPoint(47.01F, -7F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 872
		bodyModel[77].setRotationPoint(47.01F, -7F, -8F);

		bodyModel[78].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 541
		bodyModel[78].setRotationPoint(43F, 4F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[79].setRotationPoint(43F, 5F, -10F);

		bodyModel[80].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 543
		bodyModel[80].setRotationPoint(43F, 7F, -9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[81].setRotationPoint(43F, 8F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[82].setRotationPoint(43F, 3F, -9F);

		bodyModel[83].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[83].setRotationPoint(43F, 1F, -8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[84].setRotationPoint(43F, 3F, 7F);

		bodyModel[85].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 554
		bodyModel[85].setRotationPoint(43F, 1F, 7F);

		bodyModel[86].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 555
		bodyModel[86].setRotationPoint(43F, 4F, 8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 556
		bodyModel[87].setRotationPoint(43F, 5F, 8F);

		bodyModel[88].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 557
		bodyModel[88].setRotationPoint(43F, 7F, 9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 558
		bodyModel[89].setRotationPoint(43F, 8F, 9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 560
		bodyModel[90].setRotationPoint(47F, -8F, 9F);
		bodyModel[90].rotateAngleY = -3.14159265F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 561
		bodyModel[91].setRotationPoint(47F, -8F, -8F);
		bodyModel[91].rotateAngleY = -3.14159265F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[92].setRotationPoint(13F, 1F, -11F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[93].setRotationPoint(25.5F, 3F, -2F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 408
		bodyModel[94].setRotationPoint(26F, 1F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[95].setRotationPoint(26F, 2F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 193
		bodyModel[96].setRotationPoint(27F, 2F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		bodyModel[97].setRotationPoint(26F, 2F, 6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 195
		bodyModel[98].setRotationPoint(27F, 2F, 9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[99].setRotationPoint(12F, 1F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 200
		bodyModel[100].setRotationPoint(13F, 1F, 11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 201
		bodyModel[101].setRotationPoint(12F, 1F, 11F);

		bodyModel[102].addBox(0F, 0F, 0F, 16, 3, 22, 0F); // Box 489
		bodyModel[102].setRotationPoint(-8F, 3F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[103].setRotationPoint(-8F, 2F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[104].setRotationPoint(-8F, 6F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 16, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[105].setRotationPoint(-8F, 6F, -9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[106].setRotationPoint(-8F, 2F, 8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[107].setRotationPoint(-8F, 6F, 9F);

		bodyModel[108].addBox(0F, 0F, 0F, 16, 1, 16, 0F); // Box 559
		bodyModel[108].setRotationPoint(-8F, 2F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[109].setRotationPoint(8F, 6F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[110].setRotationPoint(8F, 6F, -11F);

		bodyModel[111].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 566
		bodyModel[111].setRotationPoint(8F, 3F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[112].setRotationPoint(8F, 2F, -11F);

		bodyModel[113].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 568
		bodyModel[113].setRotationPoint(8F, 2F, -8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[114].setRotationPoint(8F, 2F, 8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 570
		bodyModel[115].setRotationPoint(8F, 6F, 9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[116].setRotationPoint(-12F, 6F, -9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[117].setRotationPoint(-12F, 6F, -11F);

		bodyModel[118].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 573
		bodyModel[118].setRotationPoint(-12F, 3F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[119].setRotationPoint(-12F, 2F, -11F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 575
		bodyModel[120].setRotationPoint(-12F, 2F, -8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 576
		bodyModel[121].setRotationPoint(-12F, 6F, 9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[122].setRotationPoint(-12F, 2F, 8F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[123].setRotationPoint(-7F, 2F, -11.25F);
		bodyModel[123].rotateAngleX = 1.02974426F;

		bodyModel[124].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 560
		bodyModel[124].setRotationPoint(-7F, 2F, 11.25F);
		bodyModel[124].rotateAngleX = 1.02974426F;
		bodyModel[124].rotateAngleY = -3.14159265F;

		bodyModel[125].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 562
		bodyModel[125].setRotationPoint(-3F, 1.3F, -9.5F);
		bodyModel[125].rotateAngleX = 0.78539816F;

		bodyModel[126].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 563
		bodyModel[126].setRotationPoint(-3F, 1.3F, 9.5F);
		bodyModel[126].rotateAngleX = 0.78539816F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 314 headlight sp front b
		bodyModel[127].setRotationPoint(-40.75F, -12F, -2F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 315 headlight sp front a
		bodyModel[128].setRotationPoint(-40.75F, -12F, 0F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 headlight front gyralight sp red
		bodyModel[129].setRotationPoint(-40.75F, -14F, -1F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 317
		bodyModel[130].setRotationPoint(-39.98F, -14F, -1.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[131].setRotationPoint(-40.15F, -13F, -2F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[132].setRotationPoint(-41F, -8F, -7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 353
		bodyModel[133].setRotationPoint(-41F, -10F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 354
		bodyModel[134].setRotationPoint(-41F, -10F, 1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 356
		bodyModel[135].setRotationPoint(-41F, -13F, 1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 357
		bodyModel[136].setRotationPoint(-41F, -13F, -7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 355
		bodyModel[137].setRotationPoint(-41F, -8F, 0F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 545 headlight nose high b
		bodyModel[138].setRotationPoint(-41F, -11F, -1F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 546 headlight nose high a
		bodyModel[139].setRotationPoint(-41F, -13F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 547 headlight nose low a
		bodyModel[140].setRotationPoint(-41F, -12F, -1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 548 headlight nose low b
		bodyModel[141].setRotationPoint(-41F, -10F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[142].setRotationPoint(-39.98F, -13F, -1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[143].setRotationPoint(-41F, -13F, 0F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[144].setRotationPoint(-41F, -13F, -1F);

		bodyModel[145].addBox(0F, 0F, 0F, 6, 13, 14, 0F); // Box 43
		bodyModel[145].setRotationPoint(-36F, -13F, -7F);

		bodyModel[146].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[146].setRotationPoint(-38F, -13F, -6F);

		bodyModel[147].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[147].setRotationPoint(-38F, -13F, -7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[148].setRotationPoint(-37.5F, -8.5F, -7F);

		bodyModel[149].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[149].setRotationPoint(-37F, -6.5F, -7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[150].setRotationPoint(-38.65F, -12F, -6.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[151].setRotationPoint(-38.65F, -12F, 4.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1251
		bodyModel[152].setRotationPoint(-39F, -13.5F, -1F);

		bodyModel[153].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[153].setRotationPoint(-29.5F, -18F, -10.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[154].setRotationPoint(-19F, -18F, -11F);

		bodyModel[155].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[155].setRotationPoint(-29F, -18F, 10F);

		bodyModel[156].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[156].setRotationPoint(-29F, -18F, -11F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[157].setRotationPoint(-30F, -18F, -7F);

		bodyModel[158].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[158].setRotationPoint(-18.5F, -18F, 10.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[159].setRotationPoint(-30F, -4F, -11F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412
		bodyModel[160].setRotationPoint(-29F, -13F, -2F);

		bodyModel[161].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[161].setRotationPoint(-29.1F, -12F, -4F);
		bodyModel[161].rotateAngleY = -0.38397244F;

		bodyModel[162].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[162].setRotationPoint(-27.5F, -14F, -4F);
		bodyModel[162].rotateAngleY = -0.38397244F;

		bodyModel[163].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 527 cab backpannel
		bodyModel[163].setRotationPoint(-20F, -20F, -6F);

		bodyModel[164].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[164].setRotationPoint(-26.5F, -16.25F, -3F);
		bodyModel[164].rotateAngleY = 0.78539816F;

		bodyModel[165].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307
		bodyModel[165].setRotationPoint(-26.5F, -16.25F, -3F);
		bodyModel[165].rotateAngleY = 0.78539816F;

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[166].setRotationPoint(-30F, -21F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[167].setRotationPoint(-19F, -21F, -11F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[168].setRotationPoint(-30F, -21F, -7F);

		bodyModel[169].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[169].setRotationPoint(-32F, -21F, -1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[170].setRotationPoint(-32F, -21F, -6F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[171].setRotationPoint(-32F, -21F, 1F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight standard
		bodyModel[172].setRotationPoint(-32.5F, -21F, -1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight standard
		bodyModel[173].setRotationPoint(-32.5F, -19F, -1F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[174].setRotationPoint(-19F, -21F, -7F);

		bodyModel[175].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[175].setRotationPoint(-29F, -21F, -7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[176].setRotationPoint(-29F, -21F, -11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[177].setRotationPoint(-29F, -21F, 7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[178].setRotationPoint(-19F, -21F, 7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[179].setRotationPoint(-30F, -21F, 7F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[180].setRotationPoint(-34F, -19F, -0.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[181].setRotationPoint(-34F, -20F, -0.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[182].setRotationPoint(-33.75F, -18.5F, -0.25F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[183].setRotationPoint(-34F, -21F, -0.5F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 336
		bodyModel[184].setRotationPoint(-32F, -23F, -2F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 lamp
		bodyModel[185].setRotationPoint(-32.75F, -23F, 0F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 lamp
		bodyModel[186].setRotationPoint(-32.75F, -23F, -2F);

		bodyModel[187].addBox(0F, 0F, 0F, 55, 21, 14, 0F); // Box 34
		bodyModel[187].setRotationPoint(-18F, -21F, -7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[188].setRotationPoint(-16F, -22F, -6F);

		bodyModel[189].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274 sd39 exhaust
		bodyModel[189].setRotationPoint(-7F, -22.5F, -2.5F);

		bodyModel[190].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[190].setRotationPoint(-8F, -21.5F, -4F);

		bodyModel[191].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[191].setRotationPoint(30F, -22F, -3F);

		bodyModel[192].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[192].setRotationPoint(23F, -22F, -3F);

		bodyModel[193].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[193].setRotationPoint(0F, -22F, -3F);

		bodyModel[194].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[194].setRotationPoint(6.5F, -22F, -3F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 308
		bodyModel[195].setRotationPoint(-18F, -21F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[196].setRotationPoint(-8F, -21F, -11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		bodyModel[197].setRotationPoint(-18F, -21F, 7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[198].setRotationPoint(-8F, -21F, 7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[199].setRotationPoint(0F, -21F, -9F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[200].setRotationPoint(0F, -21F, 7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 102
		bodyModel[201].setRotationPoint(-7F, -21F, -9F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[202].setRotationPoint(11F, -21F, -9F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[203].setRotationPoint(11F, -21F, 7F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[204].setRotationPoint(-7F, -21F, 7F);

		bodyModel[205].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 279
		bodyModel[205].setRotationPoint(16F, -22F, -3F);

		bodyModel[206].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[206].setRotationPoint(38.25F, -19F, -2F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[207].setRotationPoint(37F, -21F, -7F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[208].setRotationPoint(37F, -21F, 0F);

		bodyModel[209].addShapeBox(-1F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115 numberboard rear
		bodyModel[209].setRotationPoint(37.45F, -16.5F, -6F);
		bodyModel[209].rotateAngleY = -0.41887902F;

		bodyModel[210].addShapeBox(-1F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116 numberboard rear
		bodyModel[210].setRotationPoint(37.45F, -16.5F, 6F);
		bodyModel[210].rotateAngleY = 0.41887902F;

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear 2 beam
		bodyModel[211].setRotationPoint(39.5F, -19F, -2F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear 2 beam
		bodyModel[212].setRotationPoint(39.5F, -19F, 0F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 381 sp mount
		bodyModel[213].setRotationPoint(39.25F, -23F, -2F);

		bodyModel[214].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31 sp mount
		bodyModel[214].setRotationPoint(40.25F, -21F, -2F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp gyralight rear
		bodyModel[215].setRotationPoint(40.5F, -21F, -2F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp gyralight rear
		bodyModel[216].setRotationPoint(40.5F, -21F, 0F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 light red gyralight rear
		bodyModel[217].setRotationPoint(40.5F, -23F, -1F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 389 sp mount
		bodyModel[218].setRotationPoint(40.25F, -23F, -1F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[219].setRotationPoint(36.65F, -12F, -6.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[220].setRotationPoint(36.65F, -12F, 4.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[221].setRotationPoint(36.65F, -19F, -6.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[222].setRotationPoint(36.65F, -19F, 4.5F);

		bodyModel[223].addBox(0F, 0F, 0F, 40, 2, 4, 0F); // Box 36
		bodyModel[223].setRotationPoint(-18F, -2F, -11F);

		bodyModel[224].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[224].setRotationPoint(-17F, -13F, -9F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[225].setRotationPoint(-17F, -15F, -9F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[226].setRotationPoint(-18F, -10F, -10.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[227].setRotationPoint(-16F, -4F, 11F);

		bodyModel[228].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 304
		bodyModel[228].setRotationPoint(-17F, -2F, 7F);

		bodyModel[229].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 305
		bodyModel[229].setRotationPoint(-18F, -4F, 11F);

		bodyModel[230].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 836
		bodyModel[230].setRotationPoint(-18F, -4F, 7F);

		bodyModel[231].addBox(0F, 0F, 0F, 56, 8, 0, 0F); // Box 38R
		bodyModel[231].setRotationPoint(-13F, -8F, 11F);

		bodyModel[232].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 176
		bodyModel[232].setRotationPoint(-16F, -10F, -11F);

		bodyModel[233].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 243
		bodyModel[233].setRotationPoint(43F, -8F, 9F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[234].setRotationPoint(43F, -7F, 10.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[235].setRotationPoint(43F, -7F, -11.5F);

		bodyModel[236].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 250
		bodyModel[236].setRotationPoint(43F, -8F, -11F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[237].setRotationPoint(-18F, -12F, -11F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[238].setRotationPoint(21F, -10F, -11F);

		bodyModel[239].addBox(0F, 0F, 0F, 20, 8, 0, 0F); // Box 316
		bodyModel[239].setRotationPoint(23F, -8F, -11F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[240].setRotationPoint(-18F, -12F, 11F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 307
		bodyModel[241].setRotationPoint(-17F, -12F, 11F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		bodyModel[242].setRotationPoint(-14F, -8F, 11F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9F, -5F, 0F, -9F, -5F, 0F, 0F, -5F, 0F); // Box 297 vent 2 part f
		bodyModel[243].setRotationPoint(26.75F, -19.5F, -7.25F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9F, -5F, 0F, -9F, -5F, 0F, 0F, -5F, 0F); // Box 299 vent 2 part e
		bodyModel[244].setRotationPoint(26.75F, -19.5F, 6.25F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, -1F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 272 vent 2 part f
		bodyModel[245].setRotationPoint(17.25F, -20.5F, -7.25F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, -1F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 273 vent 2 part e
		bodyModel[246].setRotationPoint(17.25F, -20.5F, 6.25F);

		bodyModel[247].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[247].setRotationPoint(28.25F, -22.25F, -3F);

		bodyModel[248].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[248].setRotationPoint(18.75F, -22.25F, -3F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[249].setRotationPoint(-32F, -17F, -1F);

		bodyModel[250].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 245
		bodyModel[250].setRotationPoint(-36F, -4F, -11F);

		bodyModel[251].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 246
		bodyModel[251].setRotationPoint(-36F, -4F, 7F);

		bodyModel[252].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[252].setRotationPoint(-43F, -8F, -11F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[253].setRotationPoint(-43F, -6F, -11.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[254].setRotationPoint(-43F, -6F, 10.5F);

		bodyModel[255].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 177
		bodyModel[255].setRotationPoint(-43F, -8F, 9F);

		bodyModel[256].addBox(0F, 0F, 0F, 3, 8, 0, 0F); // Box 258
		bodyModel[256].setRotationPoint(-43F, -8F, -11F);

		bodyModel[257].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 260
		bodyModel[257].setRotationPoint(-36F, -12F, -11F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[258].setRotationPoint(-40F, -8F, -11F);

		bodyModel[259].addBox(0F, 0F, 0F, 3, 8, 0, 0F); // Box 265
		bodyModel[259].setRotationPoint(-43F, -8F, 11F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[260].setRotationPoint(-40F, -8F, 11F);

		bodyModel[261].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 267
		bodyModel[261].setRotationPoint(-36F, -12F, 11F);

		bodyModel[262].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 281
		bodyModel[262].setRotationPoint(-37F, -4F, -11F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[263].setRotationPoint(-38F, -4F, -11F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[264].setRotationPoint(-38F, -4F, 11F);

		bodyModel[265].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 284
		bodyModel[265].setRotationPoint(-37F, -4F, 11F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 408
		bodyModel[266].setRotationPoint(-37F, -2F, -11F);

		bodyModel[267].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 409
		bodyModel[267].setRotationPoint(-37F, -2F, 7F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 356 front ditchlight C
		bodyModel[268].setRotationPoint(-47.75F, -3F, -9F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 357 front ditchlight C
		bodyModel[269].setRotationPoint(-47.75F, -3F, 7F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[270].setRotationPoint(-47.25F, -2F, -8.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[271].setRotationPoint(-47.25F, -2F, 7.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[272].setRotationPoint(-47.5F, -2F, 4.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[273].setRotationPoint(-47.5F, -2F, -6.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front a
		bodyModel[274].setRotationPoint(-47.75F, -2F, 4.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front a
		bodyModel[275].setRotationPoint(-47.75F, -2F, -6.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268 anticlimber
		bodyModel[276].setRotationPoint(-49F, 0F, -7F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269anticlimber
		bodyModel[277].setRotationPoint(-49F, 0F, 0F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[278].setRotationPoint(-51F, 7F, 0F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[279].setRotationPoint(-51F, 7F, -10F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[280].setRotationPoint(-50F, 6F, 0F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[281].setRotationPoint(-50F, 6F, -10F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[282].setRotationPoint(-50F, 6F, 0F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 1F, -1.5F, 1F, 1F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[283].setRotationPoint(-50F, 3F, 2F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[284].setRotationPoint(-50F, 6F, -10F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 1F, -0.5F, 1F, 1F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[285].setRotationPoint(-50.5F, 3F, -10F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[286].setRotationPoint(-50F, 4F, 2F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[287].setRotationPoint(-50F, 4F, -10F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[288].setRotationPoint(-50F, 5F, 2F);

		bodyModel[289].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[289].setRotationPoint(-50F, 5F, -8F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 1163
		bodyModel[290].setRotationPoint(50F, 7F, 0F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1164
		bodyModel[291].setRotationPoint(50F, 7F, -10F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 1165
		bodyModel[292].setRotationPoint(49F, 6F, 0F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1166
		bodyModel[293].setRotationPoint(49F, 6F, -10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 1167
		bodyModel[294].setRotationPoint(47F, 6F, -10F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 1168
		bodyModel[295].setRotationPoint(47F, 6F, 0F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 1169
		bodyModel[296].setRotationPoint(49F, 5F, 2F);

		bodyModel[297].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1170
		bodyModel[297].setRotationPoint(49F, 5F, -8F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 1171
		bodyModel[298].setRotationPoint(47F, 4F, -10F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 1172
		bodyModel[299].setRotationPoint(47F, 4F, 2F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 1F, -1F, 1F, 1F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 1173
		bodyModel[300].setRotationPoint(47F, 3F, 2F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 1F, -2F, 1F, 1F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 1174
		bodyModel[301].setRotationPoint(47.5F, 3F, -10F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[302].setRotationPoint(46.5F, -2F, -6.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear a
		bodyModel[303].setRotationPoint(46.75F, -2F, -6.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight rear a
		bodyModel[304].setRotationPoint(46.75F, -2F, 4.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[305].setRotationPoint(46.5F, -2F, 4.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 254
		bodyModel[306].setRotationPoint(46.5F, 0F, 6F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 255
		bodyModel[307].setRotationPoint(46.5F, 0F, -8F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 256 ditchlight rear b
		bodyModel[308].setRotationPoint(46.75F, 0F, -8F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 257 ditchlight rear b
		bodyModel[309].setRotationPoint(46.75F, 0F, 6F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[310].setRotationPoint(-47.5F, 0F, 6F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 251 ditchlight front b
		bodyModel[311].setRotationPoint(-47.75F, 0F, 6F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 252 ditchlight front b
		bodyModel[312].setRotationPoint(-47.75F, 0F, -8F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[313].setRotationPoint(-47.5F, 0F, -8F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[314].setRotationPoint(-38F, -13F, -7.5F);

		bodyModel[315].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[315].setRotationPoint(-36F, -11F, -7.5F);

		bodyModel[316].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 nose brake cover
		bodyModel[316].setRotationPoint(-38F, -9F, -7F);

		bodyModel[317].addBox(0F, 0F, 0F, 6, 1, 14, 0F); // Box 264 sd38 filter box
		bodyModel[317].setRotationPoint(-9F, -22F, -7F);

		bodyModel[318].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 285
		bodyModel[318].setRotationPoint(-17F, -20.5F, -7.5F);

		bodyModel[319].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 286
		bodyModel[319].setRotationPoint(-17F, -20.5F, 6.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 879 dynamics short
		bodyModel[320].setRotationPoint(-2F, -21F, -9F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 880 dynamics short
		bodyModel[321].setRotationPoint(-2F, -21F, 7F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 36, 9, 1, 0F,0F, -1F, 0F, -18F, -1F, 0F, -18F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -18F, -4F, 0F, -18F, -4F, 0F, 0F, -4F, 0F); // Box 847 vent 1 part f
		bodyModel[322].setRotationPoint(18F, -20.5F, -7.25F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 36, 9, 1, 0F,0F, -1F, 0F, -18F, -1F, 0F, -18F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -18F, -4F, 0F, -18F, -4F, 0F, 0F, -4F, 0F); // Box 850 vent 1 part e
		bodyModel[323].setRotationPoint(18F, -20.5F, 6.25F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[324].setRotationPoint(-48F, -2F, -4.75F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[325].setRotationPoint(-48F, -2F, 2.75F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[326].setRotationPoint(-48.25F, -2F, -4.75F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399 not a ditchlight will not glow
		bodyModel[327].setRotationPoint(-48.25F, -2F, 2.75F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 392
		bodyModel[328].setRotationPoint(47F, -2F, -4.75F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 393
		bodyModel[329].setRotationPoint(47F, -2F, 2.75F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394 not a ditchlight will not glow
		bodyModel[330].setRotationPoint(47.25F, -2F, -4.75F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 395 not a ditchlight will not glow
		bodyModel[331].setRotationPoint(47.25F, -2F, 2.75F);

		bodyModel[332].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274 sd38 exhaust
		bodyModel[332].setRotationPoint(-2.5F, -22F, -2.5F);

		bodyModel[333].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 275 sd38 exhaust
		bodyModel[333].setRotationPoint(13F, -22F, -2.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[334].setRotationPoint(-44F, -8F, -7F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 353
		bodyModel[335].setRotationPoint(-44F, -10F, -7F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 354
		bodyModel[336].setRotationPoint(-44F, -10F, 1F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 356
		bodyModel[337].setRotationPoint(-44F, -13F, 1F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 357
		bodyModel[338].setRotationPoint(-44F, -13F, -7F);

		bodyModel[339].addBox(0F, 0F, 0F, 3, 13, 14, 0F); // Box 358
		bodyModel[339].setRotationPoint(-41F, -13F, -7F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 355
		bodyModel[340].setRotationPoint(-44F, -8F, 0F);

		bodyModel[341].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 542
		bodyModel[341].setRotationPoint(-39F, -11F, -7.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 544
		bodyModel[342].setRotationPoint(-41.5F, -13.5F, -0.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 386 brakewheel snoot
		bodyModel[343].setRotationPoint(-41F, -13F, -7.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 545 headlight nose high b
		bodyModel[344].setRotationPoint(-44F, -11F, -1F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 546 headlight nose high a
		bodyModel[345].setRotationPoint(-44F, -13F, -1F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 547 headlight nose low a
		bodyModel[346].setRotationPoint(-44F, -12F, -1F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 548 headlight nose low b
		bodyModel[347].setRotationPoint(-44F, -10F, -1F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F); // Box 391
		bodyModel[348].setRotationPoint(-42.98F, -13F, -1F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[349].setRotationPoint(-44F, -13F, -1F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 393
		bodyModel[350].setRotationPoint(-44F, -13F, 0F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[351].setRotationPoint(-27F, -18F, 11F);
		bodyModel[351].rotateAngleX = 0.26179939F;

		bodyModel[352].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[352].setRotationPoint(-27F, -18.25F, -11.97F);
		bodyModel[352].rotateAngleX = -0.26179939F;

		bodyModel[353].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 284
		bodyModel[353].setRotationPoint(-28F, -19.5F, -9F);
		bodyModel[353].rotateAngleX = -0.9250245F;
		bodyModel[353].rotateAngleY = 0.01745329F;
		bodyModel[353].rotateAngleZ = -0.01745329F;

		bodyModel[354].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[354].setRotationPoint(-27F, -16F, -12F);

		bodyModel[355].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[355].setRotationPoint(-27F, -16F, 11F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[356].setRotationPoint(-27F, -17F, 10F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[357].setRotationPoint(-27F, -18F, 10F);

		bodyModel[358].addShapeBox(0F, 0F, -2F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1087 cull
		bodyModel[358].setRotationPoint(-27F, -17F, -13F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1088
		bodyModel[359].setRotationPoint(-27F, -18F, -13F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[360].setRotationPoint(-14.5F, 2.75F, -10.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[361].setRotationPoint(-14.5F, 1.75F, -10.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[362].setRotationPoint(-14.25F, 3.25F, -10.25F);

		bodyModel[363].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[363].setRotationPoint(-14.5F, 0.75F, -10.9F);

		bodyModel[364].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[364].setRotationPoint(17F, -22.5F, -5.5F);

		bodyModel[365].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[365].setRotationPoint(18F, -22.25F, -4.5F);

		bodyModel[366].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[366].setRotationPoint(17.5F, -22.25F, -6.5F);

		bodyModel[367].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[367].setRotationPoint(19.5F, -21.5F, -5.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[368].setRotationPoint(26F, -22.5F, -6.5F);

		bodyModel[369].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[369].setRotationPoint(24F, -23.5F, -4.5F);

		bodyModel[370].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[370].setRotationPoint(25F, -23.5F, -6.5F);

		bodyModel[371].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[371].setRotationPoint(26F, -23.5F, -5.5F);

		bodyModel[372].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 403
		bodyModel[372].setRotationPoint(35F, -22.5F, -5F);

		bodyModel[373].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 404
		bodyModel[373].setRotationPoint(35F, -23.5F, -4.5F);

		bodyModel[374].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 405
		bodyModel[374].setRotationPoint(33F, -23.5F, -3.5F);

		bodyModel[375].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 406
		bodyModel[375].setRotationPoint(34F, -23.5F, -5.5F);

		bodyModel[376].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[376].setRotationPoint(5F, -22.5F, -8.5F);

		bodyModel[377].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[377].setRotationPoint(6F, -22.25F, -7.5F);

		bodyModel[378].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[378].setRotationPoint(5.5F, -22.25F, -9.5F);

		bodyModel[379].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[379].setRotationPoint(7.5F, -21.5F, -8.5F);

		bodyModel[380].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[380].setRotationPoint(6.5F, -23.5F, -7.75F);

		bodyModel[381].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[381].setRotationPoint(6.5F, -23.5F, -9F);

		bodyModel[382].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 1231
		bodyModel[382].setRotationPoint(35F, -21.5F, 4.5F);

		bodyModel[383].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1232
		bodyModel[383].setRotationPoint(34.5F, -22.25F, 5.5F);

		bodyModel[384].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 1233
		bodyModel[384].setRotationPoint(34.5F, -22.5F, 4.5F);

		bodyModel[385].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1234
		bodyModel[385].setRotationPoint(35F, -22.25F, 3.5F);

		bodyModel[386].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 1235
		bodyModel[386].setRotationPoint(35F, -23.5F, 5.25F);

		bodyModel[387].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 1236
		bodyModel[387].setRotationPoint(35F, -23.5F, 4F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1264
		bodyModel[388].setRotationPoint(15F, -21F, -8.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1265
		bodyModel[389].setRotationPoint(15F, -20F, -8.7F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 1266
		bodyModel[390].setRotationPoint(15F, -19F, -8.7F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1267
		bodyModel[391].setRotationPoint(15.25F, -18.5F, -8.45F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 532
		bodyModel[392].setRotationPoint(0F, -23F, -9F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 533
		bodyModel[393].setRotationPoint(0F, -23F, 9F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 881
		bodyModel[394].setRotationPoint(-2F, -21F, -9F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 882
		bodyModel[395].setRotationPoint(-2F, -21F, 7F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 445 sd38das2 filter box i think
		bodyModel[396].setRotationPoint(-8.5F, -22F, -5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[397].setRotationPoint(-29F, -22F, 7F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[398].setRotationPoint(-29F, -22.5F, 7F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[399].setRotationPoint(-29F, -22.5F, 7F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[400].setRotationPoint(-29F, -22.5F, 7F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[401].setRotationPoint(-29F, -22.5F, 7F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356 support cull
		bodyModel[402].setRotationPoint(-29.5F, -21F, 7F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 420 cull
		bodyModel[403].setRotationPoint(-29.5F, -21.5F, -9F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[404].setRotationPoint(-29F, -22.5F, -9F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[405].setRotationPoint(-29F, -23F, -9F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[406].setRotationPoint(-29F, -23F, -9F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[407].setRotationPoint(-29F, -23F, -9F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[408].setRotationPoint(-29F, -23F, -9F);

		bodyModel[409].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 389 support cull
		bodyModel[409].setRotationPoint(-27.5F, -21.5F, -9F);

		bodyModel[410].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 356 support cull
		bodyModel[410].setRotationPoint(-27.5F, -21.5F, 7F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[411].setRotationPoint(-27F, -22.5F, 7.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[412].setRotationPoint(-27F, -23.5F, 7.5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[413].setRotationPoint(-27F, -22.5F, -8.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[414].setRotationPoint(-27F, -23.5F, -8.5F);

		bodyModel[415].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 271
		bodyModel[415].setRotationPoint(15.5F, -23.25F, 0.5F);

		bodyModel[416].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 272
		bodyModel[416].setRotationPoint(15F, -23.25F, -1.5F);

		bodyModel[417].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 273
		bodyModel[417].setRotationPoint(17F, -22.5F, -0.5F);

		bodyModel[418].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 274
		bodyModel[418].setRotationPoint(14.5F, -23.5F, -0.5F);

		bodyModel[419].addBox(0F, 0F, 0F, 8, 2, 7, 0F); // Box 196 winterization hatch cull
		bodyModel[419].setRotationPoint(18F, -23F, -3.5F);

		bodyModel[420].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 338
		bodyModel[420].setRotationPoint(-13F, -23.25F, -1.5F);

		bodyModel[421].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 339
		bodyModel[421].setRotationPoint(-13.5F, -23.5F, -0.5F);

		bodyModel[422].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 340
		bodyModel[422].setRotationPoint(-12.5F, -23.25F, 0.5F);

		bodyModel[423].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 341
		bodyModel[423].setRotationPoint(-11F, -22.5F, -0.5F);

		bodyModel[424].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 369 cull
		bodyModel[424].setRotationPoint(-19.5F, -23F, 2F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[425].setRotationPoint(-19.5F, -24F, 4F);

		bodyModel[426].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 282 antenna plate cull
		bodyModel[426].setRotationPoint(-21F, -23F, -2.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[427].setRotationPoint(-20F, -24F, 0F);

		bodyModel[428].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 361
		bodyModel[428].setRotationPoint(-27.5F, -23F, -6F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[429].setRotationPoint(-28.5F, -23F, -6F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 363
		bodyModel[430].setRotationPoint(-28.5F, -22F, -6F);

		bodyModel[431].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[431].setRotationPoint(-27.5F, -23F, 2F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[432].setRotationPoint(-28.5F, -23F, 2F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 366
		bodyModel[433].setRotationPoint(-28.5F, -22F, 2F);

		bodyModel[434].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[434].setRotationPoint(-26.5F, -22.75F, -4F);

		bodyModel[435].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 342
		bodyModel[435].setRotationPoint(-28F, -23F, -0.5F);

		bodyModel[436].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 343
		bodyModel[436].setRotationPoint(-28.75F, -22.5F, 0.5F);

		bodyModel[437].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 344
		bodyModel[437].setRotationPoint(-29.5F, -22.5F, -1.5F);

		bodyModel[438].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 345
		bodyModel[438].setRotationPoint(-27.75F, -22.5F, -0.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[439].setRotationPoint(-31F, -24F, -1F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[440].setRotationPoint(-31F, -24.5F, -1F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[441].setRotationPoint(-31F, -24.5F, -1F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[442].setRotationPoint(-31F, -24.5F, -1F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[443].setRotationPoint(-31F, -24.5F, -1F);

		bodyModel[444].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 355 support cull
		bodyModel[444].setRotationPoint(-31F, -23F, -1F);

		bodyModel[445].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 1095
		bodyModel[445].setRotationPoint(-30.5F, -21.5F, -0.5F);

		bodyModel[446].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1096
		bodyModel[446].setRotationPoint(-32F, -22.25F, 0.5F);

		bodyModel[447].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 1097
		bodyModel[447].setRotationPoint(-33F, -22.5F, -0.5F);

		bodyModel[448].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1098
		bodyModel[448].setRotationPoint(-32.5F, -22.25F, -1.5F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[449].setRotationPoint(-25F, -22F, -1F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[450].setRotationPoint(-25F, -22.5F, -1F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[451].setRotationPoint(-25F, -22.5F, -1F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[452].setRotationPoint(-25F, -22.5F, -1F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[453].setRotationPoint(-25F, -22.5F, -1F);

		bodyModel[454].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 430
		bodyModel[454].setRotationPoint(-26F, -23F, 0F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[455].setRotationPoint(-24F, -22F, -0.5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[456].setRotationPoint(-24F, -23F, -0.5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[457].setRotationPoint(-24F, -22F, 0F);

		bodyModel[458].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 446
		bodyModel[458].setRotationPoint(-22F, -23F, 3F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[459].setRotationPoint(-22.5F, -22F, -5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 540
		bodyModel[460].setRotationPoint(-43F, -3F, -11.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 541
		bodyModel[461].setRotationPoint(-43F, -3F, 10.5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 542
		bodyModel[462].setRotationPoint(43F, -3F, -11.5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 543
		bodyModel[463].setRotationPoint(43F, -3F, 10.5F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[464].setRotationPoint(-1.5F, -19F, -8.7F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[465].setRotationPoint(-1.5F, -20F, -8.7F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[466].setRotationPoint(-1.25F, -18.5F, -8.45F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[467].setRotationPoint(-1.5F, -21F, -8.5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 378 cull
		bodyModel[468].setRotationPoint(14F, -21F, 7F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[469].setRotationPoint(-5F, -19.5F, 7.7F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[470].setRotationPoint(-5F, -20.5F, 7.7F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[471].setRotationPoint(-4.75F, -19F, 7.95F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[472].setRotationPoint(-5F, -21.5F, 6.5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[473].setRotationPoint(14.5F, -22F, 6.5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[474].setRotationPoint(14.5F, -23F, 6.5F);

		bodyModel[475].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Box 1203
		bodyModel[475].setRotationPoint(-35F, -8F, 7F);

		bodyModel[476].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 444
		bodyModel[476].setRotationPoint(40.5F, -7.5F, -0.5F);

		bodyModel[477].addBox(0F, 0F, 0F, 1, 8, 4, 0F); // Box 445
		bodyModel[477].setRotationPoint(40F, -8F, -2F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527 brakewheel rear
		bodyModel[478].setRotationPoint(41.5F, -9.5F, -2.5F);

		bodyModel[479].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[479].setRotationPoint(-48.5F, -3F, -2F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[480].setRotationPoint(-48.5F, -4F, -2F);

		bodyModel[481].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[481].setRotationPoint(47.5F, -3F, -2F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[482].setRotationPoint(47.5F, -4F, -2F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 392
		bodyModel[483].setRotationPoint(46F, -5F, -6F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394 not a ditchlight will not glow
		bodyModel[484].setRotationPoint(47.25F, -5F, -6F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[485].setRotationPoint(47F, 0F, -6F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 392 Santa Fe connector
		bodyModel[486].setRotationPoint(-48F, -5F, 4F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 392 Santa Fe connector
		bodyModel[487].setRotationPoint(-48F, 0F, 4F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399 not a ditchlight will not glow
		bodyModel[488].setRotationPoint(-48.25F, -5F, 4F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 324 SP bell
		bodyModel[489].setRotationPoint(-25F, -22.5F, -0.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324 SP bell
		bodyModel[490].setRotationPoint(-25F, -23.5F, -0.5F);

		bodyModel[491].addBox(0F, 0F, -3F, 0, 1, 3, 0F); // Box 324 SP bell
		bodyModel[491].setRotationPoint(-22.5F, -24F, 2F);
		bodyModel[491].rotateAngleY = -0.78539816F;

		bodyModel[492].addBox(0F, 0F, -1F, 0, 2, 1, 0F); // Box 324 SP bell
		bodyModel[492].setRotationPoint(-22.5F, -23F, 2F);
		bodyModel[492].rotateAngleY = -0.78539816F;

		bodyModel[493].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302
		bodyModel[493].setRotationPoint(-28.5F, -21.5F, -0.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 405
		bodyModel[494].setRotationPoint(-29.5F, -23F, -1.5F);

		bodyModel[495].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 406
		bodyModel[495].setRotationPoint(-30.5F, -22.5F, -0.5F);

		bodyModel[496].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302
		bodyModel[496].setRotationPoint(-29.5F, -21.5F, -3.5F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 405
		bodyModel[497].setRotationPoint(-28.5F, -23F, -4.5F);

		bodyModel[498].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 406
		bodyModel[498].setRotationPoint(-29.5F, -22.5F, -3.5F);

		bodyModel[499].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48
		bodyModel[499].setRotationPoint(-33F, -21F, -1F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 1, 28, textureX, textureY, "lamp"); // Box 186 lamp Gyralites
		bodyModel[501] = new ModelRendererTurbo(this, 1, 28, textureX, textureY, "lamp"); // Box 186 lamp Gyralites
		bodyModel[502] = new ModelRendererTurbo(this, 48, 42, textureX, textureY); // Box 354 DT&I bELL
		bodyModel[503] = new ModelRendererTurbo(this, 121, 207, textureX, textureY); // Box 280
		bodyModel[504] = new ModelRendererTurbo(this, 107, 208, textureX, textureY); // Box 281
		bodyModel[505] = new ModelRendererTurbo(this, 93, 210, textureX, textureY); // Box 282
		bodyModel[506] = new ModelRendererTurbo(this, 166, 210, textureX, textureY); // Box 283
		bodyModel[507] = new ModelRendererTurbo(this, 152, 208, textureX, textureY); // Box 284
		bodyModel[508] = new ModelRendererTurbo(this, 142, 207, textureX, textureY); // Box 331
		bodyModel[509] = new ModelRendererTurbo(this, 79, 212, textureX, textureY); // Box 332
		bodyModel[510] = new ModelRendererTurbo(this, 181, 212, textureX, textureY); // Box 335
		bodyModel[511] = new ModelRendererTurbo(this, 121, 195, textureX, textureY); // Box 336
		bodyModel[512] = new ModelRendererTurbo(this, 109, 193, textureX, textureY); // Box 339
		bodyModel[513] = new ModelRendererTurbo(this, 142, 195, textureX, textureY); // Box 340
		bodyModel[514] = new ModelRendererTurbo(this, 154, 193, textureX, textureY); // Box 341
		bodyModel[515] = new ModelRendererTurbo(this, 2, 13, textureX, textureY); // Box 4 Coupler extention McCloud
		bodyModel[516] = new ModelRendererTurbo(this, 19, 163, textureX, textureY); // Box 250
		bodyModel[517] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 252 ditchlight front c
		bodyModel[518] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 252 ditchlight front c
		bodyModel[519] = new ModelRendererTurbo(this, 19, 163, textureX, textureY); // Box 253
		bodyModel[520] = new ModelRendererTurbo(this, 360, 189, textureX, textureY); // Box 254
		bodyModel[521] = new ModelRendererTurbo(this, 360, 189, textureX, textureY); // Box 255
		bodyModel[522] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, BoxName.ditch); // Box 256 ditchlight rear c
		bodyModel[523] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, BoxName.ditch); // Box 256 ditchlight rear c
		bodyModel[524] = new ModelRendererTurbo(this, 106, 39, textureX, textureY, "lamp"); // Box 117 Glow marker light NAR
		bodyModel[525] = new ModelRendererTurbo(this, 106, 39, textureX, textureY, "lamp"); // Box 117 Glow marker light NAR
		bodyModel[526] = new ModelRendererTurbo(this, 198, 22, textureX, textureY); // Box 403
		bodyModel[527] = new ModelRendererTurbo(this, 198, 25, textureX, textureY); // Box 404
		bodyModel[528] = new ModelRendererTurbo(this, 198, 28, textureX, textureY); // Box 405
		bodyModel[529] = new ModelRendererTurbo(this, 196, 15, textureX, textureY, "cull"); // Box 407 bell holder cull
		bodyModel[530] = new ModelRendererTurbo(this, 104, 37, textureX, textureY, "lamp"); // Box 117 numberboard front
		bodyModel[531] = new ModelRendererTurbo(this, 93, 45, textureX, textureY, "lamp"); // Box 118 numberboard front
		bodyModel[532] = new ModelRendererTurbo(this, 32, 83, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[533] = new ModelRendererTurbo(this, 39, 83, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[534] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 571
		bodyModel[535] = new ModelRendererTurbo(this, 284, 41, textureX, textureY); // Box 572
		bodyModel[536] = new ModelRendererTurbo(this, 273, 44, textureX, textureY); // Box 573
		bodyModel[537] = new ModelRendererTurbo(this, 273, 38, textureX, textureY); // Box 574
		bodyModel[538] = new ModelRendererTurbo(this, 271, 35, textureX, textureY); // Box 409 commander base
		bodyModel[539] = new ModelRendererTurbo(this, 271, 31, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[540] = new ModelRendererTurbo(this, 327, 181, textureX, textureY, "cull"); // Box 546 cull
		bodyModel[541] = new ModelRendererTurbo(this, 480, 80, textureX, textureY); // Box 547
		bodyModel[542] = new ModelRendererTurbo(this, 17, 187, textureX, textureY); // Box 548
		bodyModel[543] = new ModelRendererTurbo(this, 17, 187, textureX, textureY); // Box 549
		bodyModel[544] = new ModelRendererTurbo(this, 18, 182, textureX, textureY, BoxName.ditch); // Box 550 ditchlight f mccloud
		bodyModel[545] = new ModelRendererTurbo(this, 18, 182, textureX, textureY, BoxName.ditch); // Box 551 ditchlight f mccloud
		bodyModel[546] = new ModelRendererTurbo(this, 359, 179, textureX, textureY); // Box 552
		bodyModel[547] = new ModelRendererTurbo(this, 359, 179, textureX, textureY); // Box 553
		bodyModel[548] = new ModelRendererTurbo(this, 360, 174, textureX, textureY, BoxName.ditch); // Box 554 ditchlight r mccloud
		bodyModel[549] = new ModelRendererTurbo(this, 360, 174, textureX, textureY, BoxName.ditch); // Box 555 ditchlight r mccloud
		bodyModel[550] = new ModelRendererTurbo(this, 276, 32, textureX, textureY); // Box 409 commander base
		bodyModel[551] = new ModelRendererTurbo(this, 276, 28, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[552] = new ModelRendererTurbo(this, 226, 50, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[553] = new ModelRendererTurbo(this, 226, 57, textureX, textureY, "cull"); // Box 562 cull ptc antenna shiz
		bodyModel[554] = new ModelRendererTurbo(this, 242, 51, textureX, textureY); // Box 563
		bodyModel[555] = new ModelRendererTurbo(this, 242, 58, textureX, textureY); // Box 564
		bodyModel[556] = new ModelRendererTurbo(this, 469, 8, textureX, textureY); // Box 565 sd38 extended stack
		bodyModel[557] = new ModelRendererTurbo(this, 468, 1, textureX, textureY); // Box 566 sd38 extended stack
		bodyModel[558] = new ModelRendererTurbo(this, 44, 190, textureX, textureY, "cull"); // Box 567 cull
		bodyModel[559] = new ModelRendererTurbo(this, 271, 12, textureX, textureY); // Box 574 commander based
		bodyModel[560] = new ModelRendererTurbo(this, 271, 8, textureX, textureY, BoxName.commander); // Box 575 commander beacon mns
		bodyModel[561] = new ModelRendererTurbo(this, 276, 12, textureX, textureY); // Box 574 commander based
		bodyModel[562] = new ModelRendererTurbo(this, 276, 8, textureX, textureY, BoxName.commander); // Box 575 commander beacon mns
		bodyModel[563] = new ModelRendererTurbo(this, 25, 182, textureX, textureY, BoxName.ditch); // Box 578 THIS IS A DITCHLIGHT IT WILL GLOWE
		bodyModel[564] = new ModelRendererTurbo(this, 25, 182, textureX, textureY, BoxName.ditch); // Box 579THIS IS A DITCHLUIGHT IT WILL GLOW
		bodyModel[565] = new ModelRendererTurbo(this, 409, 176, textureX, textureY, BoxName.ditch); // Box 580THIS IS A DITCHLIGHT IT WILL GLOW
		bodyModel[566] = new ModelRendererTurbo(this, 409, 176, textureX, textureY, BoxName.ditch); // Box 581YARR AHOY MATEY THIS BE ERE A DITCHLIGHT AND THAR SHE SHALL GLOWETH
		bodyModel[567] = new ModelRendererTurbo(this, 279, 52, textureX, textureY); // Box 130
		bodyModel[568] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 131
		bodyModel[569] = new ModelRendererTurbo(this, 279, 65, textureX, textureY); // Box 132
		bodyModel[570] = new ModelRendererTurbo(this, 281, 72, textureX, textureY); // Box 314
		bodyModel[571] = new ModelRendererTurbo(this, 261, 50, textureX, textureY); // Box 570 early vent
		bodyModel[572] = new ModelRendererTurbo(this, 261, 57, textureX, textureY); // Box 571 early vent
		bodyModel[573] = new ModelRendererTurbo(this, 150, 119, textureX, textureY); // Box 572
		bodyModel[574] = new ModelRendererTurbo(this, 148, 119, textureX, textureY); // Box 573
		bodyModel[575] = new ModelRendererTurbo(this, 151, 119, textureX, textureY); // Box 574
		bodyModel[576] = new ModelRendererTurbo(this, 157, 115, textureX, textureY); // Box 575
		bodyModel[577] = new ModelRendererTurbo(this, 148, 110, textureX, textureY); // Box 579
		bodyModel[578] = new ModelRendererTurbo(this, 149, 110, textureX, textureY); // Box 580
		bodyModel[579] = new ModelRendererTurbo(this, 146, 110, textureX, textureY); // Box 581
		bodyModel[580] = new ModelRendererTurbo(this, 157, 106, textureX, textureY); // Box 582
		bodyModel[581] = new ModelRendererTurbo(this, 144, 115, textureX, textureY); // Box 567
		bodyModel[582] = new ModelRendererTurbo(this, 151, 117, textureX, textureY); // Box 568
		bodyModel[583] = new ModelRendererTurbo(this, 151, 115, textureX, textureY); // Box 569
		bodyModel[584] = new ModelRendererTurbo(this, 144, 117, textureX, textureY); // Box 576
		bodyModel[585] = new ModelRendererTurbo(this, 141, 117, textureX, textureY); // Box 577
		bodyModel[586] = new ModelRendererTurbo(this, 141, 115, textureX, textureY); // Box 578
		bodyModel[587] = new ModelRendererTurbo(this, 294, 42, textureX, textureY); // Box 570
		bodyModel[588] = new ModelRendererTurbo(this, 294, 42, textureX, textureY); // Box 571

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp Gyralites
		bodyModel[500].setRotationPoint(-33.25F, -21F, -1F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp Gyralites
		bodyModel[501].setRotationPoint(-33.25F, -19F, -1F);

		bodyModel[502].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 354 DT&I bELL
		bodyModel[502].setRotationPoint(-41F, -13F, -1F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0.5F, -1F, -0.5F, -1F, -1F, -0.5F, 3F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F); // Box 280
		bodyModel[503].setRotationPoint(-51F, 4F, 2F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F); // Box 281
		bodyModel[504].setRotationPoint(-51F, 6F, 0F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 4F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F); // Box 282
		bodyModel[505].setRotationPoint(-52F, 7F, 0F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-4.5F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[506].setRotationPoint(-52F, 7F, -11F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[507].setRotationPoint(-51F, 6F, -11F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, -1F, -1F, -0.5F, 0.5F, -1F, -0.5F, -3.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 331
		bodyModel[508].setRotationPoint(-51F, 4F, -11F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 4F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, -1F, -3.5F, 0F, -1F); // Box 332
		bodyModel[509].setRotationPoint(-53F, 8F, 0F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-4.5F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, -1F, 3F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[510].setRotationPoint(-53F, 8F, -11F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1F, -1F, -1F, -1.5F, -1F, -1F, 2.5F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 4F, -1F, 0F, -4.5F, -1F, 0F); // Box 336
		bodyModel[511].setRotationPoint(-52F, 3F, 2F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-1F, -1.5F, -1F, 0F, -1.5F, -1F, 3F, 0.5F, 0F, -4F, 0F, 0F, -1F, 0.5F, -1F, 0.5F, 0.5F, -1F, 4.5F, -0.5F, 0F, -5F, -0.5F, 0F); // Box 339
		bodyModel[512].setRotationPoint(-54F, 2.5F, 2F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-3F, 0F, 0F, 2.5F, 0F, 0F, -1.5F, -1F, -1F, 1F, -1F, -1F, -4.5F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 340
		bodyModel[513].setRotationPoint(-52F, 3F, -11F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-4F, 0F, 0F, 3F, 0.5F, 0F, 0F, -1.5F, -1F, -1F, -1.5F, -1F, -5F, -0.5F, 0F, 4.5F, -0.5F, 0F, 0.5F, 0.5F, -1F, -1F, 0.5F, -1F); // Box 341
		bodyModel[514].setRotationPoint(-54F, 2.5F, -11F);

		bodyModel[515].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4 Coupler extention McCloud
		bodyModel[515].setRotationPoint(-54F, 3F, -1.5F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[516].setRotationPoint(-47.5F, 3F, 7F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 252 ditchlight front c
		bodyModel[517].setRotationPoint(-47.75F, 3F, 7F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 252 ditchlight front c
		bodyModel[518].setRotationPoint(-47.75F, 3F, -9F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[519].setRotationPoint(-47.5F, 3F, -9F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 254
		bodyModel[520].setRotationPoint(46.5F, 3F, 7F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 255
		bodyModel[521].setRotationPoint(46.5F, 3F, -9F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 256 ditchlight rear c
		bodyModel[522].setRotationPoint(46.75F, 3F, -9F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 256 ditchlight rear c
		bodyModel[523].setRotationPoint(46.75F, 3F, 7F);

		bodyModel[524].addBox(0F, 0F, 1F, 0, 1, 1, 0F); // Box 117 Glow marker light NAR
		bodyModel[524].setRotationPoint(-30.05F, -20.5F, -6F);
		bodyModel[524].rotateAngleY = 0.38397244F;

		bodyModel[525].addBox(0F, 0F, -2F, 0, 1, 1, 0F); // Box 117 Glow marker light NAR
		bodyModel[525].setRotationPoint(-30.05F, -20.5F, 6F);
		bodyModel[525].rotateAngleY = -0.38397244F;

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[526].setRotationPoint(5F, -24F, -0.5F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 404
		bodyModel[527].setRotationPoint(5F, -23F, -0.5F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		bodyModel[528].setRotationPoint(5.25F, -22.5F, -0.25F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407 bell holder cull
		bodyModel[529].setRotationPoint(5F, -24F, -1.5F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 numberboard front
		bodyModel[530].setRotationPoint(-30.05F, -19.5F, -6F);
		bodyModel[530].rotateAngleY = 0.38397244F;

		bodyModel[531].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118 numberboard front
		bodyModel[531].setRotationPoint(-30.05F, -19.5F, 6F);
		bodyModel[531].rotateAngleY = -0.38397244F;

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[532].setRotationPoint(-41.65F, -12F, -6.5F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[533].setRotationPoint(-41.65F, -12F, 4.5F);

		bodyModel[534].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 571
		bodyModel[534].setRotationPoint(-29F, -22.5F, 4.5F);

		bodyModel[535].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 572
		bodyModel[535].setRotationPoint(-28.5F, -21.5F, 4.5F);

		bodyModel[536].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 573
		bodyModel[536].setRotationPoint(-30.5F, -22.25F, 3.5F);

		bodyModel[537].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 574
		bodyModel[537].setRotationPoint(-30F, -22.25F, 5.5F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[538].setRotationPoint(38F, -22F, -0.5F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[539].setRotationPoint(38F, -23F, -0.5F);

		bodyModel[540].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 546 cull
		bodyModel[540].setRotationPoint(47F, 6F, -9F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 547
		bodyModel[541].setRotationPoint(36F, -21.5F, -1F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[542].setRotationPoint(-48.25F, -0.1F, -4.75F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 549
		bodyModel[543].setRotationPoint(-48.25F, -0.1F, 2.75F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 550 ditchlight f mccloud
		bodyModel[544].setRotationPoint(-48.55F, -0.1F, -4.75F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 551 ditchlight f mccloud
		bodyModel[545].setRotationPoint(-48.55F, -0.1F, 2.75F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[546].setRotationPoint(46.25F, -0.1F, -4.75F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[547].setRotationPoint(46.25F, -0.1F, 2.75F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 554 ditchlight r mccloud
		bodyModel[548].setRotationPoint(47.25F, -0.1F, 2.75F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 555 ditchlight r mccloud
		bodyModel[549].setRotationPoint(47.25F, -0.1F, -4.75F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[550].setRotationPoint(-31.5F, -22F, -0.5F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[551].setRotationPoint(-31.5F, -23F, -0.5F);

		bodyModel[552].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[552].setRotationPoint(-27F, -22F, -9.5F);

		bodyModel[553].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[553].setRotationPoint(-27F, -22F, 6.5F);

		bodyModel[554].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[554].setRotationPoint(-26.5F, -23F, -8F);

		bodyModel[555].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[555].setRotationPoint(-26.5F, -23F, 8F);

		bodyModel[556].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 565 sd38 extended stack
		bodyModel[556].setRotationPoint(13F, -23F, -2.5F);

		bodyModel[557].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 566 sd38 extended stack
		bodyModel[557].setRotationPoint(-2.5F, -23F, -2.5F);

		bodyModel[558].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 567 cull
		bodyModel[558].setRotationPoint(-49F, 6F, -9F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 574 commander based
		bodyModel[559].setRotationPoint(47F, -3F, 3.25F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 575 commander beacon mns
		bodyModel[560].setRotationPoint(47F, -4F, 3.25F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 574 commander based
		bodyModel[561].setRotationPoint(-48F, -3F, -4.25F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 575 commander beacon mns
		bodyModel[562].setRotationPoint(-48F, -4F, -4.25F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 578 THIS IS A DITCHLIGHT IT WILL GLOWE
		bodyModel[563].setRotationPoint(-48.25F, -2.1F, -4.75F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 579THIS IS A DITCHLUIGHT IT WILL GLOW
		bodyModel[564].setRotationPoint(-48.25F, -2.1F, 2.75F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 580THIS IS A DITCHLIGHT IT WILL GLOW
		bodyModel[565].setRotationPoint(47.25F, -2.1F, 2.75F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 581YARR AHOY MATEY THIS BE ERE A DITCHLIGHT AND THAR SHE SHALL GLOWETH
		bodyModel[566].setRotationPoint(47.25F, -2.1F, -4.75F);

		bodyModel[567].addShapeBox(3F, 0F, 0F, 8, 9, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[567].setRotationPoint(-20F, -14F, -10F);

		bodyModel[568].addShapeBox(3F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[568].setRotationPoint(-20F, -15F, -8F);

		bodyModel[569].addShapeBox(3F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[569].setRotationPoint(-20F, -5F, -10F);

		bodyModel[570].addShapeBox(3F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[570].setRotationPoint(-20F, -4F, -11F);

		bodyModel[571].addBox(0F, 0F, 0F, 6, 5, 1, 0F); // Box 570 early vent
		bodyModel[571].setRotationPoint(-15.5F, -20.5F, -7.5F);

		bodyModel[572].addBox(0F, 0F, 0F, 6, 5, 1, 0F); // Box 571 early vent
		bodyModel[572].setRotationPoint(-15.5F, -20.5F, 6.5F);

		bodyModel[573].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 572
		bodyModel[573].setRotationPoint(-39.5F, -2F, -11F);

		bodyModel[574].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 573
		bodyModel[574].setRotationPoint(-39.5F, -4F, -11F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[575].setRotationPoint(-40.5F, -4F, -11F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 575
		bodyModel[576].setRotationPoint(-38.5F, -4F, -11F);

		bodyModel[577].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 579
		bodyModel[577].setRotationPoint(-39.5F, -2F, 7F);

		bodyModel[578].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 580
		bodyModel[578].setRotationPoint(-39.5F, -4F, 11F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		bodyModel[579].setRotationPoint(-40.5F, -4F, 11F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 582
		bodyModel[580].setRotationPoint(-38.5F, -4F, 7F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.25F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F); // Box 567
		bodyModel[581].setRotationPoint(-40.5F, -12F, -11F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 568
		bodyModel[582].setRotationPoint(-37.5F, -12F, -11F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 569
		bodyModel[583].setRotationPoint(-41.5F, -8F, -11F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.25F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F); // Box 576
		bodyModel[584].setRotationPoint(-40.5F, -12F, 11F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 577
		bodyModel[585].setRotationPoint(-37.5F, -12F, 11F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 578
		bodyModel[586].setRotationPoint(-41.5F, -8F, 11F);

		bodyModel[587].addBox(0F, 0F, 0F, 6, 5, 1, 0F); // Box 570
		bodyModel[587].setRotationPoint(-15.5F, -20.5F, -7.5F);

		bodyModel[588].addBox(0F, 0F, 0F, 6, 5, 1, 0F); // Box 571
		bodyModel[588].setRotationPoint(-15.5F, -20.5F, 6.5F);
	}
	ModelFlexicoil_C_Mid flexMid = new ModelFlexicoil_C_Mid();
	ModelFlexicoil_C_Late flexLate = new ModelFlexicoil_C_Late();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 135245) {
			//old model, just ignore it
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Blue.png"));
		} else if (GetColor(entity) == 43324 ) {
			//silver regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexcoil_c2h_silvers.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.725F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.45F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 43324 ) {
			//sp regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexcoil_c2h_sp.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.725F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.45F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 7||GetColor(entity) == 3
				||GetColor(entity) == 16||GetColor(entity) == 4
				||GetColor(entity) == 20) {
			//black regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_c2h_black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.725F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.45F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 14 ) {
			//beansnif regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_c1_something_bnsf.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.725F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.45F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6 ||GetColor(entity) == 5) {
			//grey regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexcoil_c2h_grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.725F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.45F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1347) {
			//grey dash2 truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_c_dash2_grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.8F, 0.0F, 0F);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.6F, 0.0F, 0);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 4324 ) {
			//silver dash 2 truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_C_dash2_longjohns.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.8F, 0.0F, 0F);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.6F, 0.0F, 0);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 23456 ) {
			//sp dash 2 truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_C_dash2_sp.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.8F, 0.0F, 0F);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.6F, 0.0F, 0);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			//black dash 2 truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_C_dash2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.8F, 0.0F, 0F);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.6F, 0.0F, 0);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}