//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SD40
// Model Creator: Bida
// Created on: 22.08.2022 - 18:09:58
// Last changed on: 22.08.2022 - 18:09:58

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

public class ModelSD40dash3 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSD40dash3() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[303];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 289
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 288
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 287
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 136
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY, BoxName.ditch); // Box 417 ditchlight r 1
		bodyModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY, BoxName.ditch); // Box 416 ditchlight r 1
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 415
		bodyModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 414
		bodyModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f 1
		bodyModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f 1
		bodyModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 411
		bodyModel[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 410
		bodyModel[12] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 409
		bodyModel[13] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 394 awvr window
		bodyModel[14] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 394 awvr window
		bodyModel[15] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 372
		bodyModel[16] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 332
		bodyModel[17] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 331
		bodyModel[18] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 330
		bodyModel[19] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 329
		bodyModel[20] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 328
		bodyModel[21] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 327
		bodyModel[22] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 351
		bodyModel[23] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 350
		bodyModel[24] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // box65
		bodyModel[25] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // box64
		bodyModel[26] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 415
		bodyModel[27] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 78
		bodyModel[28] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 74
		bodyModel[29] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 378
		bodyModel[30] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 377
		bodyModel[31] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 105
		bodyModel[32] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 104
		bodyModel[33] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 103
		bodyModel[34] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 102
		bodyModel[35] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 346 cover
		bodyModel[36] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 345
		bodyModel[37] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 322 ptc forehead
		bodyModel[38] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 321 ptc forehead
		bodyModel[39] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 320 ptc forehead
		bodyModel[40] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 318
		bodyModel[41] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 316
		bodyModel[42] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 315
		bodyModel[43] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 313
		bodyModel[44] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 312
		bodyModel[45] = new ModelRendererTurbo(this, 481, 1, textureX, textureY, "lamp"); // Box 248 headlight r
		bodyModel[46] = new ModelRendererTurbo(this, 489, 1, textureX, textureY, "lamp"); // Box 247 headlight r
		bodyModel[47] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 31
		bodyModel[48] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 303
		bodyModel[49] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 302
		bodyModel[50] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 301
		bodyModel[51] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 296
		bodyModel[52] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 295
		bodyModel[53] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 291
		bodyModel[54] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 286
		bodyModel[55] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 285
		bodyModel[56] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 284
		bodyModel[57] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 283
		bodyModel[58] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 280
		bodyModel[59] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 278
		bodyModel[60] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 275
		bodyModel[61] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 274
		bodyModel[62] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 273
		bodyModel[63] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 272
		bodyModel[64] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 271
		bodyModel[65] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 270
		bodyModel[66] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 269
		bodyModel[67] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 268
		bodyModel[68] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 267
		bodyModel[69] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 265
		bodyModel[70] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 177
		bodyModel[71] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 176
		bodyModel[72] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 81
		bodyModel[73] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 81
		bodyModel[74] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 246
		bodyModel[75] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 227
		bodyModel[76] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 226
		bodyModel[77] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 225
		bodyModel[78] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 224
		bodyModel[79] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 222
		bodyModel[80] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 220
		bodyModel[81] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 219
		bodyModel[82] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 207
		bodyModel[83] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 204
		bodyModel[84] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 202
		bodyModel[85] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 316
		bodyModel[86] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 314 door swing right
		bodyModel[87] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 313
		bodyModel[88] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 190
		bodyModel[89] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 72
		bodyModel[90] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 70
		bodyModel[91] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 2
		bodyModel[92] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 5
		bodyModel[93] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 3
		bodyModel[94] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 159
		bodyModel[95] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 2
		bodyModel[96] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 4
		bodyModel[97] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 3
		bodyModel[98] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 34
		bodyModel[99] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 36
		bodyModel[100] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 7
		bodyModel[101] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 6
		bodyModel[102] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 0
		bodyModel[103] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 170
		bodyModel[104] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 23
		bodyModel[105] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 63
		bodyModel[106] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 163
		bodyModel[107] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 409
		bodyModel[108] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 129
		bodyModel[109] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 130
		bodyModel[110] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 133
		bodyModel[111] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 134
		bodyModel[112] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 166
		bodyModel[113] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 408
		bodyModel[114] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 192
		bodyModel[115] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 193
		bodyModel[116] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 194
		bodyModel[117] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 195
		bodyModel[118] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 276
		bodyModel[119] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 277
		bodyModel[120] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 279
		bodyModel[121] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 489
		bodyModel[122] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 278
		bodyModel[123] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 281
		bodyModel[124] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 288
		bodyModel[125] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 315
		bodyModel[126] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 316
		bodyModel[127] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 559
		bodyModel[128] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 564
		bodyModel[129] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 565
		bodyModel[130] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 566
		bodyModel[131] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 567
		bodyModel[132] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 568
		bodyModel[133] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 569
		bodyModel[134] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 570
		bodyModel[135] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 571
		bodyModel[136] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 572
		bodyModel[137] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 573
		bodyModel[138] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 574
		bodyModel[139] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 576
		bodyModel[140] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 577
		bodyModel[141] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 562
		bodyModel[142] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 563
		bodyModel[143] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 575
		bodyModel[144] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 436
		bodyModel[145] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 437
		bodyModel[146] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 439
		bodyModel[147] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 201
		bodyModel[148] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 200
		bodyModel[149] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 197
		bodyModel[150] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 113
		bodyModel[151] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[152] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 199
		bodyModel[153] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 198
		bodyModel[154] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 196
		bodyModel[155] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 116
		bodyModel[156] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 164
		bodyModel[157] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 259
		bodyModel[158] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 261
		bodyModel[159] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 262
		bodyModel[160] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 264
		bodyModel[161] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 265
		bodyModel[162] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 541
		bodyModel[163] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 542
		bodyModel[164] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 543
		bodyModel[165] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 544
		bodyModel[166] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 545
		bodyModel[167] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 546
		bodyModel[168] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 553
		bodyModel[169] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 554
		bodyModel[170] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 555
		bodyModel[171] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 556
		bodyModel[172] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 557
		bodyModel[173] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 558
		bodyModel[174] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 164
		bodyModel[175] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 259
		bodyModel[176] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 262
		bodyModel[177] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 264
		bodyModel[178] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 265
		bodyModel[179] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 261
		bodyModel[180] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 271
		bodyModel[181] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 274
		bodyModel[182] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 272
		bodyModel[183] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 273
		bodyModel[184] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 400
		bodyModel[185] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 401
		bodyModel[186] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 451
		bodyModel[187] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 452
		bodyModel[188] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 453
		bodyModel[189] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 454
		bodyModel[190] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 394
		bodyModel[191] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 395
		bodyModel[192] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 61
		bodyModel[193] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 63
		bodyModel[194] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 80
		bodyModel[195] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 81
		bodyModel[196] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 234
		bodyModel[197] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 236
		bodyModel[198] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 206
		bodyModel[199] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 871
		bodyModel[200] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 872
		bodyModel[201] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 560
		bodyModel[202] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 561
		bodyModel[203] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 243
		bodyModel[204] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 244
		bodyModel[205] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 249
		bodyModel[206] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 250
		bodyModel[207] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 543
		bodyModel[208] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[209] = new ModelRendererTurbo(this, 257, 1, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[210] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 48
		bodyModel[211] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 43
		bodyModel[212] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 43
		bodyModel[213] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 1251
		bodyModel[214] = new ModelRendererTurbo(this, 401, 65, textureX, textureY, "lamp"); // Box 547 headlight nose low a
		bodyModel[215] = new ModelRendererTurbo(this, 409, 65, textureX, textureY, "lamp"); // Box 548 headlight nose low b
		bodyModel[216] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 303
		bodyModel[217] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 304
		bodyModel[218] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 305
		bodyModel[219] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 836
		bodyModel[220] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 1163
		bodyModel[221] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 1164
		bodyModel[222] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 1167
		bodyModel[223] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 1168
		bodyModel[224] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 1171
		bodyModel[225] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 1172
		bodyModel[226] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 1173
		bodyModel[227] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 1174
		bodyModel[228] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 4
		bodyModel[229] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 203
		bodyModel[230] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 444
		bodyModel[231] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 445
		bodyModel[232] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 143
		bodyModel[233] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 61
		bodyModel[234] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 63
		bodyModel[235] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 80
		bodyModel[236] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 144
		bodyModel[237] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 145
		bodyModel[238] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 147
		bodyModel[239] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 148
		bodyModel[240] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 363
		bodyModel[241] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 870
		bodyModel[242] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 559
		bodyModel[243] = new ModelRendererTurbo(this, 73, 73, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[244] = new ModelRendererTurbo(this, 433, 65, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[245] = new ModelRendererTurbo(this, 105, 25, textureX, textureY, "cull"); // Box 1007 cull
		bodyModel[246] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 521
		bodyModel[247] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 297 sd40 vent
		bodyModel[248] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 272 sd40 vent
		bodyModel[249] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 297 sd40 vent
		bodyModel[250] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 272 sd40 vent
		bodyModel[251] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 533 sd40-2 vent
		bodyModel[252] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 534 sd40-2 vent
		bodyModel[253] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 533 sd40-2 vent
		bodyModel[254] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 534 sd40-2 vent
		bodyModel[255] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 409 commander base csx
		bodyModel[256] = new ModelRendererTurbo(this, 297, 25, textureX, textureY, BoxName.commander); // Box 410 commander beacon csx
		bodyModel[257] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 409 commander base csx
		bodyModel[258] = new ModelRendererTurbo(this, 89, 57, textureX, textureY, BoxName.commander); // Box 410 commander beacon csx
		bodyModel[259] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 224
		bodyModel[260] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 224
		bodyModel[261] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 222
		bodyModel[262] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 224
		bodyModel[263] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 43
		bodyModel[264] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 346 cover
		bodyModel[265] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 48
		bodyModel[266] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 409
		bodyModel[267] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 246
		bodyModel[268] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 284
		bodyModel[269] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 283
		bodyModel[270] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 267
		bodyModel[271] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 265
		bodyModel[272] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 521
		bodyModel[273] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 101
		bodyModel[274] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 100
		bodyModel[275] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 224
		bodyModel[276] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 224
		bodyModel[277] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 224
		bodyModel[278] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 224
		bodyModel[279] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 436 fuel monitor
		bodyModel[280] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 394 awvr window
		bodyModel[281] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 394 awvr window
		bodyModel[282] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 394 awvr window
		bodyModel[283] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 394 awvr window
		bodyModel[284] = new ModelRendererTurbo(this, 113, 25, textureX, textureY, "lamp"); // Box 320 NUMBERBOARD
		bodyModel[285] = new ModelRendererTurbo(this, 161, 25, textureX, textureY, "lamp"); // Box 320 NUMBERBOARD
		bodyModel[286] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 436 fuel monitor
		bodyModel[287] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 129
		bodyModel[288] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 131
		bodyModel[289] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 132
		bodyModel[290] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 214
		bodyModel[291] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 215
		bodyModel[292] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 231
		bodyModel[293] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 412 cs
		bodyModel[294] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 413 cs
		bodyModel[295] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 531 cs
		bodyModel[296] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 86 cs
		bodyModel[297] = new ModelRendererTurbo(this, 497, 113, textureX, textureY, "lamp"); // Box 412 cs glow
		bodyModel[298] = new ModelRendererTurbo(this, 73, 121, textureX, textureY, "lamp"); // Box 413 cs glow
		bodyModel[299] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 1251
		bodyModel[300] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 378
		bodyModel[301] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 320 ptc forehead
		bodyModel[302] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 320 ptc forehead

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 289
		bodyModel[0].setRotationPoint(-13.5F, 3.25F, -10.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 288
		bodyModel[1].setRotationPoint(-14F, 2.75F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 287
		bodyModel[2].setRotationPoint(-14F, 1.75F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 136
		bodyModel[3].setRotationPoint(-14F, 3.25F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 417 ditchlight r 1
		bodyModel[4].setRotationPoint(47.25F, -3F, 3F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 416 ditchlight r 1
		bodyModel[5].setRotationPoint(47.25F, -3F, -5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 415
		bodyModel[6].setRotationPoint(47F, -3F, -5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 414
		bodyModel[7].setRotationPoint(47F, -3F, 3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f 1
		bodyModel[8].setRotationPoint(-48.25F, -3F, 4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f 1
		bodyModel[9].setRotationPoint(-48.25F, -3F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[10].setRotationPoint(-48F, -3F, 4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[11].setRotationPoint(-48F, -3F, -6F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 409
		bodyModel[12].setRotationPoint(-37F, -2F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 8, 7, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 394 awvr window
		bodyModel[13].setRotationPoint(-30F, -20.99F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 8, 7, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 394 awvr window
		bodyModel[14].setRotationPoint(-30F, -20.99F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[15].setRotationPoint(-31F, -22F, 4F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[16].setRotationPoint(7F, -23.5F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[17].setRotationPoint(7F, -23.5F, -7.75F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[18].setRotationPoint(8F, -21.5F, -8.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[19].setRotationPoint(6F, -22.25F, -9.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[20].setRotationPoint(6.5F, -22.25F, -7.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[21].setRotationPoint(5.5F, -22.5F, -8.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[22].setRotationPoint(-27F, -16F, 11F);

		bodyModel[23].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[23].setRotationPoint(-27F, -16F, -12F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[24].setRotationPoint(-26F, -18F, -12F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[25].setRotationPoint(-26F, -18F, 11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[26].setRotationPoint(-26F, -22F, -6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[27].setRotationPoint(-13.25F, 2.25F, -10.25F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[28].setRotationPoint(-13.5F, 1.75F, -10.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[29].setRotationPoint(-21F, -22F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[30].setRotationPoint(-26F, -22F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[31].setRotationPoint(-7F, -21F, 7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[32].setRotationPoint(12F, -21F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[33].setRotationPoint(12F, -21F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 102
		bodyModel[34].setRotationPoint(-7F, -21F, -9F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 346 cover
		bodyModel[35].setRotationPoint(-41F, -13F, -3F);

		bodyModel[36].addBox(0F, 0F, 0F, 12, 13, 14, 0F); // Box 345
		bodyModel[36].setRotationPoint(-40F, -13F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 322 ptc forehead
		bodyModel[37].setRotationPoint(-32F, -21F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321 ptc forehead
		bodyModel[38].setRotationPoint(-32F, -21F, -6F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 3, 12, 0F); // Box 320 ptc forehead
		bodyModel[39].setRotationPoint(-31F, -21F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318
		bodyModel[40].setRotationPoint(37.75F, -21.5F, -0.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 19, 8, 0, 0F); // Box 316
		bodyModel[41].setRotationPoint(24F, -8F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[42].setRotationPoint(22F, -10F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[43].setRotationPoint(-17F, -12F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 312
		bodyModel[44].setRotationPoint(-15F, -10F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight r
		bodyModel[45].setRotationPoint(40.5F, -19F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight r
		bodyModel[46].setRotationPoint(40.5F, -19F, -2F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[47].setRotationPoint(39.25F, -19F, -2F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 303
		bodyModel[48].setRotationPoint(-48F, 0F, -7F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 302
		bodyModel[49].setRotationPoint(-49F, 0F, -3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[50].setRotationPoint(47F, 0F, 5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 2F, 0F, 0.25F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.25F, -2F, 0F); // Box 296
		bodyModel[51].setRotationPoint(-16F, -10F, 11.01F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 295
		bodyModel[52].setRotationPoint(-17F, -12F, 11F);

		bodyModel[53].addBox(0F, 0F, 0F, 56, 8, 0, 0F); // Box 291
		bodyModel[53].setRotationPoint(-13F, -8F, 11F);

		bodyModel[54].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 286
		bodyModel[54].setRotationPoint(-16.05F, -20.5F, 6.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 285
		bodyModel[55].setRotationPoint(-16.05F, -20.5F, -7.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 284
		bodyModel[56].setRotationPoint(-37F, -4F, 11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[57].setRotationPoint(-38F, -4F, 11F);

		bodyModel[58].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[58].setRotationPoint(6F, -22F, -3F);

		bodyModel[59].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[59].setRotationPoint(-1F, -22F, -3F);

		bodyModel[60].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[60].setRotationPoint(-7F, -21.5F, -4F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[61].setRotationPoint(-6F, -22.5F, -2.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[62].setRotationPoint(-15F, -22F, -6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[63].setRotationPoint(-15F, -15F, -9F);

		bodyModel[64].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[64].setRotationPoint(-15F, -13F, -9F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[65].setRotationPoint(-17F, -10F, -10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269
		bodyModel[66].setRotationPoint(-49F, 0F, 3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[67].setRotationPoint(-49F, 0F, -7F);

		bodyModel[68].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 267
		bodyModel[68].setRotationPoint(-37F, -12F, 11F);

		bodyModel[69].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 265
		bodyModel[69].setRotationPoint(-43F, -8F, 11F);

		bodyModel[70].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 177
		bodyModel[70].setRotationPoint(-43F, -8F, 9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[71].setRotationPoint(-43F, -6F, 10.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[72].setRotationPoint(-43F, -6F, -11.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[73].setRotationPoint(-43F, -8F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 246
		bodyModel[74].setRotationPoint(-36F, -4F, 7F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[75].setRotationPoint(-47F, 7F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[76].setRotationPoint(-47F, 8F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[77].setRotationPoint(47F, 8F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[78].setRotationPoint(-28F, -21F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 222
		bodyModel[79].setRotationPoint(-27F, -21F, 7F);

		bodyModel[80].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[80].setRotationPoint(-28F, -21F, -7F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 219
		bodyModel[81].setRotationPoint(-18F, -21F, -7F);

		bodyModel[82].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[82].setRotationPoint(47F, 7F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[83].setRotationPoint(47F, 0F, -6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[84].setRotationPoint(47F, 0F, -5F);

		bodyModel[85].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[85].setRotationPoint(-29F, -4F, -11F);

		bodyModel[86].addBox(-0.5F, 0F, -3.5F, 1, 16, 4, 0F); // Box 314 door swing right
		bodyModel[86].setRotationPoint(-17.5F, -20F, 10.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 313
		bodyModel[87].setRotationPoint(-29F, -21F, -7F);

		bodyModel[88].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 190
		bodyModel[88].setRotationPoint(-27F, -20F, -11F);

		bodyModel[89].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 72
		bodyModel[89].setRotationPoint(-27F, -20F, 10F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 16, 18, 0F); // Box 70
		bodyModel[90].setRotationPoint(-18F, -20F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[91].setRotationPoint(47F, 2.5F, -2F);

		bodyModel[92].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[92].setRotationPoint(47F, 3F, -1.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[93].setRotationPoint(47F, 0F, -10F);

		bodyModel[94].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 159
		bodyModel[94].setRotationPoint(-42F, 0F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[95].setRotationPoint(-48F, 2.5F, -2F);

		bodyModel[96].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[96].setRotationPoint(-51F, 3F, -1.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[97].setRotationPoint(-47F, 0F, -10F);

		bodyModel[98].addBox(0F, 0F, 0F, 55, 21, 14, 0F); // Box 34
		bodyModel[98].setRotationPoint(-17F, -21F, -7F);

		bodyModel[99].addBox(0F, 0F, 0F, 40, 2, 4, 0F); // Box 36
		bodyModel[99].setRotationPoint(-17F, -2F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[100].setRotationPoint(38F, -21F, -7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[101].setRotationPoint(38F, -21F, 0F);

		bodyModel[102].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 0
		bodyModel[102].setRotationPoint(-42F, 0F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 94, 1, 14, 0F); // Box 170
		bodyModel[103].setRotationPoint(-47F, 0F, -7F);

		bodyModel[104].addBox(0F, 0F, 0F, 94, 2, 12, 0F); // Box 23
		bodyModel[104].setRotationPoint(-47F, 1F, -6F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 94, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[105].setRotationPoint(-47F, 3F, -6.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[106].setRotationPoint(-29.5F, 3F, -2F);

		bodyModel[107].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 409
		bodyModel[107].setRotationPoint(-29F, 1F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[108].setRotationPoint(-29F, 2F, -10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[109].setRotationPoint(-29F, 2F, 6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[110].setRotationPoint(-28F, 2F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[111].setRotationPoint(-28F, 2F, 9F);

		bodyModel[112].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[112].setRotationPoint(25.5F, 3F, -2F);

		bodyModel[113].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 408
		bodyModel[113].setRotationPoint(26F, 1F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[114].setRotationPoint(26F, 2F, -10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 193
		bodyModel[115].setRotationPoint(27F, 2F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		bodyModel[116].setRotationPoint(26F, 2F, 6F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 195
		bodyModel[117].setRotationPoint(27F, 2F, 9F);

		bodyModel[118].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[118].setRotationPoint(31F, -22.5F, -3F);

		bodyModel[119].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[119].setRotationPoint(24F, -22.5F, -3F);

		bodyModel[120].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 279
		bodyModel[120].setRotationPoint(17F, -22.5F, -3F);

		bodyModel[121].addBox(0F, 0F, 0F, 16, 3, 22, 0F); // Box 489
		bodyModel[121].setRotationPoint(-7.5F, 3F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[122].setRotationPoint(-7.5F, 2F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[123].setRotationPoint(-7.5F, 6F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 16, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[124].setRotationPoint(-7.5F, 6F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[125].setRotationPoint(-7.5F, 2F, 8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[126].setRotationPoint(-7.5F, 6F, 9F);

		bodyModel[127].addBox(0F, 0F, 0F, 16, 1, 16, 0F); // Box 559
		bodyModel[127].setRotationPoint(-7.5F, 3F, -8F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[128].setRotationPoint(8.5F, 6F, -9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[129].setRotationPoint(8.5F, 6F, -11F);

		bodyModel[130].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 566
		bodyModel[130].setRotationPoint(8.5F, 3F, -11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[131].setRotationPoint(8.5F, 2F, -11F);

		bodyModel[132].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 568
		bodyModel[132].setRotationPoint(8.5F, 2F, -8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[133].setRotationPoint(8.5F, 2F, 8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 570
		bodyModel[134].setRotationPoint(8.5F, 6F, 9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[135].setRotationPoint(-11.5F, 6F, -9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[136].setRotationPoint(-11.5F, 6F, -11F);

		bodyModel[137].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 573
		bodyModel[137].setRotationPoint(-11.5F, 3F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[138].setRotationPoint(-11.5F, 2F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 576
		bodyModel[139].setRotationPoint(-11.5F, 6F, 9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[140].setRotationPoint(-11.5F, 2F, 8F);

		bodyModel[141].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 562
		bodyModel[141].setRotationPoint(-4F, 1.3F, -9.5F);
		bodyModel[141].rotateAngleX = 0.78539816F;

		bodyModel[142].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 563
		bodyModel[142].setRotationPoint(-4F, 1.3F, 9.5F);
		bodyModel[142].rotateAngleX = 0.78539816F;

		bodyModel[143].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 575
		bodyModel[143].setRotationPoint(-11.5F, 2F, -8F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 436
		bodyModel[144].setRotationPoint(-10.5F, 2F, -11.25F);
		bodyModel[144].rotateAngleX = 1.02974426F;

		bodyModel[145].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 437
		bodyModel[145].setRotationPoint(-10.5F, 2F, 11.25F);
		bodyModel[145].rotateAngleX = 1.02974426F;
		bodyModel[145].rotateAngleY = -3.14159265F;

		bodyModel[146].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 439
		bodyModel[146].setRotationPoint(11.25F, 2F, 11.25F);
		bodyModel[146].rotateAngleX = 1.02974426F;
		bodyModel[146].rotateAngleY = -3.14159265F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 201
		bodyModel[147].setRotationPoint(12F, 1F, 11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 200
		bodyModel[148].setRotationPoint(13F, 1F, 11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[149].setRotationPoint(12F, 1F, -11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[150].setRotationPoint(13F, 1F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[151].setRotationPoint(-15F, 1F, 8.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 199
		bodyModel[152].setRotationPoint(-42F, 1F, 11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 198
		bodyModel[153].setRotationPoint(-13F, 1F, 11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		bodyModel[154].setRotationPoint(-42F, 1F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 116
		bodyModel[155].setRotationPoint(-13F, 1F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[156].setRotationPoint(42F, 1F, -11F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[157].setRotationPoint(42F, 1F, 7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[158].setRotationPoint(42F, 0F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[159].setRotationPoint(42F, 0F, 7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Box 264
		bodyModel[160].setRotationPoint(42F, 5F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[161].setRotationPoint(42F, 5F, 7F);

		bodyModel[162].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 541
		bodyModel[162].setRotationPoint(43F, 4F, -8F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[163].setRotationPoint(43F, 5F, -10F);

		bodyModel[164].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 543
		bodyModel[164].setRotationPoint(43F, 7F, -9F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[165].setRotationPoint(43F, 8F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[166].setRotationPoint(43F, 3F, -9F);

		bodyModel[167].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[167].setRotationPoint(43F, 1F, -8F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[168].setRotationPoint(43F, 3F, 7F);

		bodyModel[169].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 554
		bodyModel[169].setRotationPoint(43F, 1F, 7F);

		bodyModel[170].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 555
		bodyModel[170].setRotationPoint(43F, 4F, 8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 556
		bodyModel[171].setRotationPoint(43F, 5F, 8F);

		bodyModel[172].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 557
		bodyModel[172].setRotationPoint(43F, 7F, 9F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 558
		bodyModel[173].setRotationPoint(43F, 8F, 9F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[174].setRotationPoint(-43F, 1F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[175].setRotationPoint(-43F, 1F, 7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[176].setRotationPoint(-43F, 0F, 7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[177].setRotationPoint(-43F, 5F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[178].setRotationPoint(-43F, 5F, 7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[179].setRotationPoint(-43F, 0F, -11F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[180].setRotationPoint(-47F, 1F, -8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[181].setRotationPoint(-47F, 3F, -9F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[182].setRotationPoint(-47F, 8F, -11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[183].setRotationPoint(-47F, 5F, -10F);

		bodyModel[184].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[184].setRotationPoint(-47F, 7F, -9F);

		bodyModel[185].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 401
		bodyModel[185].setRotationPoint(-47F, 4F, -8F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[186].setRotationPoint(-47F, 3F, 7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[187].setRotationPoint(-47F, 1F, 7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[188].setRotationPoint(-47F, 5F, 8F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[189].setRotationPoint(-47F, 8F, 9F);

		bodyModel[190].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 394
		bodyModel[190].setRotationPoint(-47F, 7F, 9F);

		bodyModel[191].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
		bodyModel[191].setRotationPoint(-47F, 4F, 8F);

		bodyModel[192].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[192].setRotationPoint(47F, -1F, 10F);

		bodyModel[193].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[193].setRotationPoint(47F, -1F, -11F);

		bodyModel[194].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 80
		bodyModel[194].setRotationPoint(47F, -8F, -8F);

		bodyModel[195].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 81
		bodyModel[195].setRotationPoint(47F, -8F, 6F);

		bodyModel[196].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 234
		bodyModel[196].setRotationPoint(48F, -8F, -4F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[197].setRotationPoint(47F, -8F, -6F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[198].setRotationPoint(47F, -8F, 4F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 871
		bodyModel[199].setRotationPoint(47.01F, -7F, 7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 872
		bodyModel[200].setRotationPoint(47.01F, -7F, -8F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 560
		bodyModel[201].setRotationPoint(47F, -8F, 9F);
		bodyModel[201].rotateAngleY = -3.14159265F;

		bodyModel[202].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 561
		bodyModel[202].setRotationPoint(47F, -8F, -8F);
		bodyModel[202].rotateAngleY = -3.14159265F;

		bodyModel[203].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 243
		bodyModel[203].setRotationPoint(43F, -8F, 9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[204].setRotationPoint(43F, -7F, 10.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[205].setRotationPoint(43F, -7F, -11.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 250
		bodyModel[206].setRotationPoint(43F, -8F, -11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 543
		bodyModel[207].setRotationPoint(43F, -3F, 10.5F);

		bodyModel[208].addShapeBox(-1F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115 numberboard rear
		bodyModel[208].setRotationPoint(38.5F, -16.5F, -6F);
		bodyModel[208].rotateAngleY = -0.41887902F;

		bodyModel[209].addShapeBox(-1F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116 numberboard rear
		bodyModel[209].setRotationPoint(38.5F, -16.5F, 6F);
		bodyModel[209].rotateAngleY = 0.41887902F;

		bodyModel[210].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[210].setRotationPoint(-39.98F, -12F, -1F);

		bodyModel[211].addBox(0F, 0F, 0F, 1, 8, 6, 0F); // Box 43
		bodyModel[211].setRotationPoint(-41F, -8F, -3F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 13, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[212].setRotationPoint(-41F, -13F, -7F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1251
		bodyModel[213].setRotationPoint(-40F, -13.5F, -1F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 547 headlight nose low a
		bodyModel[214].setRotationPoint(-41F, -12F, -1F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 548 headlight nose low b
		bodyModel[215].setRotationPoint(-41F, -10F, -1F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[216].setRotationPoint(-15F, -4F, 11F);

		bodyModel[217].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 304
		bodyModel[217].setRotationPoint(-16F, -2F, 7F);

		bodyModel[218].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 305
		bodyModel[218].setRotationPoint(-17F, -4F, 11F);

		bodyModel[219].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 836
		bodyModel[219].setRotationPoint(-17F, -4F, 7F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 1163
		bodyModel[220].setRotationPoint(-51F, 7F, 0F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1164
		bodyModel[221].setRotationPoint(-51F, 7F, -10F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 1167
		bodyModel[222].setRotationPoint(-50F, 6F, -10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 1168
		bodyModel[223].setRotationPoint(-50F, 6F, 0F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 1171
		bodyModel[224].setRotationPoint(-50F, 4F, -10F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 1172
		bodyModel[225].setRotationPoint(-50F, 4F, 2F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 1F, -1.5F, 1F, 1F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 1173
		bodyModel[226].setRotationPoint(-50F, 3F, 2F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 1F, -0.5F, 1F, 1F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 1174
		bodyModel[227].setRotationPoint(-50.5F, 3F, -10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[228].setRotationPoint(-47F, 3F, -2.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 203
		bodyModel[229].setRotationPoint(42F, 3F, -2.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 444
		bodyModel[230].setRotationPoint(41.5F, -7.5F, -1.5F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 8, 4, 0F); // Box 445
		bodyModel[231].setRotationPoint(41F, -8F, -2F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[232].setRotationPoint(-47F, -8F, -8F);
		bodyModel[232].rotateAngleY = -3.14159265F;

		bodyModel[233].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[233].setRotationPoint(-47F, -1F, 10F);

		bodyModel[234].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[234].setRotationPoint(-47F, -1F, -11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 80
		bodyModel[235].setRotationPoint(-47F, -8F, -6F);

		bodyModel[236].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 144
		bodyModel[236].setRotationPoint(-47F, -8F, -8F);

		bodyModel[237].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 145
		bodyModel[237].setRotationPoint(-49F, -8F, -3F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[238].setRotationPoint(-47F, -8F, 3F);

		bodyModel[239].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 148
		bodyModel[239].setRotationPoint(-47F, -8F, 6F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[240].setRotationPoint(-47.01F, -7F, -8F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		bodyModel[241].setRotationPoint(-47.01F, -7F, 7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[242].setRotationPoint(-47F, -8F, 9F);
		bodyModel[242].rotateAngleY = -3.14159265F;

		bodyModel[243].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 160 cull crossover
		bodyModel[243].setRotationPoint(47F, 0F, -2F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[244].setRotationPoint(49F, 0F, -2F);

		bodyModel[245].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[245].setRotationPoint(-13.5F, 0.75F, -10.9F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[246].setRotationPoint(-39F, -8F, 11.01F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, 0F, 0F, -10.25F, 0F, 0F, -10.25F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -10.25F, -5F, 0F, -10.25F, -5F, 0F, 0F, -5F, 0F); // Box 297 sd40 vent
		bodyModel[247].setRotationPoint(27.65F, -19.5F, -7.15F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, -1F, 0F, -10.25F, -1F, 0F, -10.25F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -10.25F, -4F, 0F, -10.25F, -4F, 0F, 0F, -4F, 0F); // Box 272 sd40 vent
		bodyModel[248].setRotationPoint(17.65F, -20.5F, -7.15F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, 0F, 0F, -10.25F, 0F, 0F, -10.25F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -10.25F, -5F, 0F, -10.25F, -5F, 0F, 0F, -5F, 0F); // Box 297 sd40 vent
		bodyModel[249].setRotationPoint(27.65F, -19.5F, 6.15F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, -1F, 0F, -10.25F, -1F, 0F, -10.25F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -10.25F, -4F, 0F, -10.25F, -4F, 0F, 0F, -4F, 0F); // Box 272 sd40 vent
		bodyModel[250].setRotationPoint(17.65F, -20.5F, 6.15F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F); // Box 533 sd40-2 vent
		bodyModel[251].setRotationPoint(17.65F, -19.5F, 6.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F); // Box 534 sd40-2 vent
		bodyModel[252].setRotationPoint(27.65F, -19.5F, 6.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F); // Box 533 sd40-2 vent
		bodyModel[253].setRotationPoint(17.65F, -19.5F, -7.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F); // Box 534 sd40-2 vent
		bodyModel[254].setRotationPoint(27.65F, -19.5F, -7.5F);

		bodyModel[255].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base csx
		bodyModel[255].setRotationPoint(-23.5F, -21.5F, -9.25F);
		bodyModel[255].rotateAngleX = 0.26179939F;

		bodyModel[256].addShapeBox(0F, -1F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon csx
		bodyModel[256].setRotationPoint(-23.5F, -21.5F, -9.25F);
		bodyModel[256].rotateAngleX = 0.26179939F;

		bodyModel[257].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base csx
		bodyModel[257].setRotationPoint(-23.5F, -21.5F, 9.25F);
		bodyModel[257].rotateAngleX = -0.26179939F;

		bodyModel[258].addShapeBox(0F, -1F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon csx
		bodyModel[258].setRotationPoint(-23.5F, -21.5F, 9.25F);
		bodyModel[258].rotateAngleX = -0.26179939F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[259].setRotationPoint(-18F, -21F, 7F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 224
		bodyModel[260].setRotationPoint(-28F, -21F, -11F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 222
		bodyModel[261].setRotationPoint(-27F, -21F, -11F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[262].setRotationPoint(-18F, -21F, -11F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 43
		bodyModel[263].setRotationPoint(-41F, -13F, 3F);

		bodyModel[264].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 346 cover
		bodyModel[264].setRotationPoint(-41F, -13F, 1F);

		bodyModel[265].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 48
		bodyModel[265].setRotationPoint(-40.98F, -13F, -1F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 409
		bodyModel[266].setRotationPoint(-37F, -2F, -11F);

		bodyModel[267].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 246
		bodyModel[267].setRotationPoint(-36F, -4F, -11F);

		bodyModel[268].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 284
		bodyModel[268].setRotationPoint(-37F, -4F, -11F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[269].setRotationPoint(-38F, -4F, -11F);

		bodyModel[270].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 267
		bodyModel[270].setRotationPoint(-37F, -12F, -11F);

		bodyModel[271].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 265
		bodyModel[271].setRotationPoint(-43F, -8F, -11F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[272].setRotationPoint(-39F, -8F, -10.99F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 14, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[273].setRotationPoint(-2F, -21F, 7F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 14, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[274].setRotationPoint(-2F, -21F, -9F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-3F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 224
		bodyModel[275].setRotationPoint(-31F, -21F, -11F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -3F, 0F, 0F); // Box 224
		bodyModel[276].setRotationPoint(-31F, -21F, 7F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[277].setRotationPoint(-17F, -21F, 7F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 224
		bodyModel[278].setRotationPoint(-17F, -21F, -11F);

		bodyModel[279].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 436 fuel monitor
		bodyModel[279].setRotationPoint(-8.5F, 1F, -11.25F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394 awvr window
		bodyModel[280].setRotationPoint(-28F, -20F, 7F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 394 awvr window
		bodyModel[281].setRotationPoint(-28F, -20F, -11F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 394 awvr window
		bodyModel[282].setRotationPoint(-28F, -20F, -11F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 394 awvr window
		bodyModel[283].setRotationPoint(-28F, -20F, 10F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 320 NUMBERBOARD
		bodyModel[284].setRotationPoint(-32F, -20.5F, 0.5F);
		bodyModel[284].rotateAngleY = -0.15707963F;

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 320 NUMBERBOARD
		bodyModel[285].setRotationPoint(-31.25F, -20.5F, -5.5F);
		bodyModel[285].rotateAngleY = 0.15707963F;

		bodyModel[286].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 436 fuel monitor
		bodyModel[286].setRotationPoint(-8.5F, 1F, 10.25F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[287].setRotationPoint(12.75F, -23F, -1.75F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[288].setRotationPoint(14.5F, -22F, -2.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[289].setRotationPoint(13.75F, -23F, 2F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[290].setRotationPoint(13.75F, -23F, -3F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[291].setRotationPoint(16.75F, -23F, 1.75F);
		bodyModel[291].rotateAngleY = -3.14159265F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[292].setRotationPoint(11.75F, -23F, -0.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[293].setRotationPoint(-22.05F, -13F, 1F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,0F, 0F, -0.5F, 0.15F, 0F, -0.5F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.15F, 0F, -0.5F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[294].setRotationPoint(-27.75F, -12F, 3F);
		bodyModel[294].rotateAngleY = -0.45378561F;

		bodyModel[295].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[295].setRotationPoint(-26.75F, -8F, 2.5F);
		bodyModel[295].rotateAngleY = -0.45378561F;

		bodyModel[296].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0.5F, -0.5F, -5F, 0.5F, -0.5F, -5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[296].setRotationPoint(-28.75F, -14F, 3F);
		bodyModel[296].rotateAngleY = -0.45378561F;

		bodyModel[297].addShapeBox(0F, 0F, -0.25F, 3, 2, 1, 0F,-0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 412 cs glow
		bodyModel[297].setRotationPoint(-28.25F, -14F, 4F);
		bodyModel[297].rotateAngleX = 0.12217305F;
		bodyModel[297].rotateAngleY = -0.45378561F;

		bodyModel[298].addShapeBox(3F, 0F, -0.25F, 3, 2, 1, 0F,-0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 413 cs glow
		bodyModel[298].setRotationPoint(-28.25F, -14F, 4F);
		bodyModel[298].rotateAngleX = 0.12217305F;
		bodyModel[298].rotateAngleY = -0.45378561F;

		bodyModel[299].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 1251
		bodyModel[299].setRotationPoint(-38F, -13.5F, -6F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[300].setRotationPoint(-21F, -22F, 6F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320 ptc forehead
		bodyModel[301].setRotationPoint(-31F, -21F, -7F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320 ptc forehead
		bodyModel[302].setRotationPoint(-31F, -21F, 6F);
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