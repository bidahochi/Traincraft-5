//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: U30C_PH2
// Model Creator: bidahochi
// Created on: 04.11.2023 - 18:41:24
// Last changed on: 04.11.2023 - 18:41:24

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFB3_new;
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

public class ModelU30C_new extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelU30C_new() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[440];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[1] = new ModelRendererTurbo(this, 101, 125, textureX, textureY); // box65
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[3] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[4] = new ModelRendererTurbo(this, 445, 118, textureX, textureY); // Box 256
		bodyModel[5] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[6] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[7] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[9] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[10] = new ModelRendererTurbo(this, 152, 137, textureX, textureY); // Box 63
		bodyModel[11] = new ModelRendererTurbo(this, 143, 138, textureX, textureY); // Box 195
		bodyModel[12] = new ModelRendererTurbo(this, 149, 152, textureX, textureY); // Box 196
		bodyModel[13] = new ModelRendererTurbo(this, 95, 102, textureX, textureY); // Box 197
		bodyModel[14] = new ModelRendererTurbo(this, 149, 138, textureX, textureY); // Box 198
		bodyModel[15] = new ModelRendererTurbo(this, 96, 84, textureX, textureY); // Box 199
		bodyModel[16] = new ModelRendererTurbo(this, 95, 86, textureX, textureY); // Box 200
		bodyModel[17] = new ModelRendererTurbo(this, 105, 84, textureX, textureY); // Box 203
		bodyModel[18] = new ModelRendererTurbo(this, 104, 86, textureX, textureY); // Box 204
		bodyModel[19] = new ModelRendererTurbo(this, 104, 102, textureX, textureY); // Box 205
		bodyModel[20] = new ModelRendererTurbo(this, 152, 151, textureX, textureY); // Box 2603
		bodyModel[21] = new ModelRendererTurbo(this, 143, 152, textureX, textureY); // Box 261
		bodyModel[22] = new ModelRendererTurbo(this, 106, 99, textureX, textureY); // Box 411
		bodyModel[23] = new ModelRendererTurbo(this, 97, 99, textureX, textureY); // Box 412
		bodyModel[24] = new ModelRendererTurbo(this, 95, 96, textureX, textureY); // Box 201
		bodyModel[25] = new ModelRendererTurbo(this, 104, 96, textureX, textureY); // Box 202
		bodyModel[26] = new ModelRendererTurbo(this, 97, 94, textureX, textureY); // Box 293
		bodyModel[27] = new ModelRendererTurbo(this, 106, 94, textureX, textureY); // Box 294
		bodyModel[28] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 206 early stairwell pillar
		bodyModel[29] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 207 early stairwell pillar
		bodyModel[30] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[31] = new ModelRendererTurbo(this, 440, 129, textureX, textureY); // Box 218
		bodyModel[32] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[33] = new ModelRendererTurbo(this, 491, 128, textureX, textureY); // Box 263
		bodyModel[34] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[35] = new ModelRendererTurbo(this, 431, 128, textureX, textureY); // Box 270434
		bodyModel[36] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[37] = new ModelRendererTurbo(this, 435, 106, textureX, textureY); // Box 217 early stairwell pillar
		bodyModel[38] = new ModelRendererTurbo(this, 435, 106, textureX, textureY); // Box 221 early stairwell pillar
		bodyModel[39] = new ModelRendererTurbo(this, 260, 118, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 254, 89, textureX, textureY); // Box 10
		bodyModel[41] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 157
		bodyModel[42] = new ModelRendererTurbo(this, 273, 139, textureX, textureY); // Box 158
		bodyModel[43] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[44] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[45] = new ModelRendererTurbo(this, 362, 116, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[46] = new ModelRendererTurbo(this, 103, 29, textureX, textureY); // Box 114
		bodyModel[47] = new ModelRendererTurbo(this, 103, 29, textureX, textureY); // Box 74
		bodyModel[48] = new ModelRendererTurbo(this, 103, 32, textureX, textureY); // Box 78
		bodyModel[49] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 19
		bodyModel[50] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 548
		bodyModel[51] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[52] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[53] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 19
		bodyModel[54] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 548
		bodyModel[55] = new ModelRendererTurbo(this, 322, 116, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[56] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 440
		bodyModel[57] = new ModelRendererTurbo(this, 176, 116, textureX, textureY); // Box 631
		bodyModel[58] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 882
		bodyModel[59] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 883
		bodyModel[60] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318
		bodyModel[61] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 322
		bodyModel[62] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 757
		bodyModel[63] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 758
		bodyModel[64] = new ModelRendererTurbo(this, 231, 64, textureX, textureY); // Box 251
		bodyModel[65] = new ModelRendererTurbo(this, 210, 156, textureX, textureY); // Box 63
		bodyModel[66] = new ModelRendererTurbo(this, 223, 37, textureX, textureY); // Box 0
		bodyModel[67] = new ModelRendererTurbo(this, 269, 82, textureX, textureY); // Box 156
		bodyModel[68] = new ModelRendererTurbo(this, 203, 173, textureX, textureY); // Box 630
		bodyModel[69] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 7
		bodyModel[70] = new ModelRendererTurbo(this, 31, 9, textureX, textureY); // Box 24
		bodyModel[71] = new ModelRendererTurbo(this, 10, 7, textureX, textureY); // Box 28
		bodyModel[72] = new ModelRendererTurbo(this, 52, 7, textureX, textureY); // Box 30
		bodyModel[73] = new ModelRendererTurbo(this, 59, 43, textureX, textureY); // Box 67
		bodyModel[74] = new ModelRendererTurbo(this, 30, 43, textureX, textureY); // Box 68
		bodyModel[75] = new ModelRendererTurbo(this, 77, 25, textureX, textureY); // Box 106
		bodyModel[76] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 107
		bodyModel[77] = new ModelRendererTurbo(this, 109, 9, textureX, textureY); // Box 160
		bodyModel[78] = new ModelRendererTurbo(this, 35, 45, textureX, textureY); // Box 161
		bodyModel[79] = new ModelRendererTurbo(this, 90, 45, textureX, textureY); // Box 162
		bodyModel[80] = new ModelRendererTurbo(this, 50, 45, textureX, textureY); // Box 163
		bodyModel[81] = new ModelRendererTurbo(this, 75, 45, textureX, textureY); // Box 164
		bodyModel[82] = new ModelRendererTurbo(this, 99, 43, textureX, textureY); // Box 166
		bodyModel[83] = new ModelRendererTurbo(this, 70, 43, textureX, textureY); // Box 168
		bodyModel[84] = new ModelRendererTurbo(this, 109, 21, textureX, textureY); // Box 169
		bodyModel[85] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 277
		bodyModel[86] = new ModelRendererTurbo(this, 85, 54, textureX, textureY); // Box 298
		bodyModel[87] = new ModelRendererTurbo(this, 78, 55, textureX, textureY); // Box 299
		bodyModel[88] = new ModelRendererTurbo(this, 50, 57, textureX, textureY); // Box 300
		bodyModel[89] = new ModelRendererTurbo(this, 71, 59, textureX, textureY); // Box 301
		bodyModel[90] = new ModelRendererTurbo(this, 41, 101, textureX, textureY); // Box 302
		bodyModel[91] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 303
		bodyModel[92] = new ModelRendererTurbo(this, 34, 105, textureX, textureY); // Box 304
		bodyModel[93] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[94] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[95] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 309
		bodyModel[96] = new ModelRendererTurbo(this, 98, 6, textureX, textureY); // Box 52 door swing right
		bodyModel[97] = new ModelRendererTurbo(this, 56, 6, textureX, textureY); // Box 314 door swing right
		bodyModel[98] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[99] = new ModelRendererTurbo(this, 10, 101, textureX, textureY, "cull"); // Box 316 cull nose handrail
		bodyModel[100] = new ModelRendererTurbo(this, 8, 96, textureX, textureY, "cull"); // Box 318 cull nose handrail
		bodyModel[101] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 123
		bodyModel[102] = new ModelRendererTurbo(this, 34, 5, textureX, textureY); // Box 311
		bodyModel[103] = new ModelRendererTurbo(this, 110, 3, textureX, textureY); // Box 165
		bodyModel[104] = new ModelRendererTurbo(this, 110, 29, textureX, textureY); // Box 167
		bodyModel[105] = new ModelRendererTurbo(this, 115, 45, textureX, textureY); // Box 355 brakewheel
		bodyModel[106] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[107] = new ModelRendererTurbo(this, 1, 139, textureX, textureY); // Box 32
		bodyModel[108] = new ModelRendererTurbo(this, 12, 136, textureX, textureY); // Box 33
		bodyModel[109] = new ModelRendererTurbo(this, 7, 136, textureX, textureY); // Box 688
		bodyModel[110] = new ModelRendererTurbo(this, 1, 130, textureX, textureY); // Box 37
		bodyModel[111] = new ModelRendererTurbo(this, 14, 130, textureX, textureY); // Box 38
		bodyModel[112] = new ModelRendererTurbo(this, 7, 127, textureX, textureY); // Box 557
		bodyModel[113] = new ModelRendererTurbo(this, 12, 127, textureX, textureY); // Box 558
		bodyModel[114] = new ModelRendererTurbo(this, 248, 2, textureX, textureY); // Box 6
		bodyModel[115] = new ModelRendererTurbo(this, 141, 17, textureX, textureY); // Box 292
		bodyModel[116] = new ModelRendererTurbo(this, 141, 1, textureX, textureY); // Box 293
		bodyModel[117] = new ModelRendererTurbo(this, 139, 7, textureX, textureY); // Box 294
		bodyModel[118] = new ModelRendererTurbo(this, 215, 40, textureX, textureY); // Box 376
		bodyModel[119] = new ModelRendererTurbo(this, 234, 40, textureX, textureY); // Box 377
		bodyModel[120] = new ModelRendererTurbo(this, 216, 36, textureX, textureY); // Box 378
		bodyModel[121] = new ModelRendererTurbo(this, 216, 36, textureX, textureY); // Box 544
		bodyModel[122] = new ModelRendererTurbo(this, 234, 40, textureX, textureY); // Box 545
		bodyModel[123] = new ModelRendererTurbo(this, 215, 40, textureX, textureY); // Box 546
		bodyModel[124] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 48
		bodyModel[125] = new ModelRendererTurbo(this, 1, 47, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[126] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[127] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[128] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[129] = new ModelRendererTurbo(this, 21, 39, textureX, textureY); // Box 43
		bodyModel[130] = new ModelRendererTurbo(this, 7, 39, textureX, textureY); // Box 175
		bodyModel[131] = new ModelRendererTurbo(this, 464, 115, textureX, textureY); // Box 148
		bodyModel[132] = new ModelRendererTurbo(this, 471, 110, textureX, textureY); // Box 149
		bodyModel[133] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 150
		bodyModel[134] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 284 Headlight Rear down
		bodyModel[135] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 285 Headlight Rear up
		bodyModel[136] = new ModelRendererTurbo(this, 493, 152, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[137] = new ModelRendererTurbo(this, 493, 152, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[138] = new ModelRendererTurbo(this, 422, 24, textureX, textureY); // Box 283
		bodyModel[139] = new ModelRendererTurbo(this, 417, 2, textureX, textureY); // Box 284
		bodyModel[140] = new ModelRendererTurbo(this, 433, 67, textureX, textureY); // Box 298
		bodyModel[141] = new ModelRendererTurbo(this, 440, 57, textureX, textureY); // Box 369
		bodyModel[142] = new ModelRendererTurbo(this, 440, 44, textureX, textureY); // Box 370
		bodyModel[143] = new ModelRendererTurbo(this, 446, 53, textureX, textureY); // Box 371
		bodyModel[144] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[145] = new ModelRendererTurbo(this, 448, 98, textureX, textureY); // Box 278
		bodyModel[146] = new ModelRendererTurbo(this, 470, 98, textureX, textureY); // Box 279
		bodyModel[147] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[148] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[149] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[150] = new ModelRendererTurbo(this, 462, 104, textureX, textureY); // Box 288 rear gyralight mount
		bodyModel[151] = new ModelRendererTurbo(this, 1, 91, textureX, textureY, "lamp"); // Box 289 gyralight rear l
		bodyModel[152] = new ModelRendererTurbo(this, 8, 91, textureX, textureY, "lamp"); // Box 290 gyralight rear r
		bodyModel[153] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 293
		bodyModel[154] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 293
		bodyModel[155] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 293
		bodyModel[156] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 293 paper filter (late units)
		bodyModel[157] = new ModelRendererTurbo(this, 488, 10, textureX, textureY); // Box 293 oilbath filter (early units)
		bodyModel[158] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 165 numberboard
		bodyModel[159] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 167 numberboard
		bodyModel[160] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 534
		bodyModel[161] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 535
		bodyModel[162] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 536
		bodyModel[163] = new ModelRendererTurbo(this, 488, 10, textureX, textureY); // Box 537 oilbath filter (early units)
		bodyModel[164] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 538 paper filter (late units)
		bodyModel[165] = new ModelRendererTurbo(this, 411, 186, textureX, textureY); // Box 547
		bodyModel[166] = new ModelRendererTurbo(this, 411, 202, textureX, textureY); // Box 548
		bodyModel[167] = new ModelRendererTurbo(this, 228, 63, textureX, textureY); // Box 18
		bodyModel[168] = new ModelRendererTurbo(this, 226, 70, textureX, textureY); // Box 21
		bodyModel[169] = new ModelRendererTurbo(this, 437, 78, textureX, textureY); // Box 430 early nonsense
		bodyModel[170] = new ModelRendererTurbo(this, 437, 74, textureX, textureY); // Box 431 early nonsense
		bodyModel[171] = new ModelRendererTurbo(this, 59, 105, textureX, textureY); // Box 196 phase 2a shit
		bodyModel[172] = new ModelRendererTurbo(this, 10, 121, textureX, textureY); // Box 197 phase 2a shit
		bodyModel[173] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 198 phase 2a shit
		bodyModel[174] = new ModelRendererTurbo(this, 58, 96, textureX, textureY); // Box 199
		bodyModel[175] = new ModelRendererTurbo(this, 95, 91, textureX, textureY); // Box 200
		bodyModel[176] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 201
		bodyModel[177] = new ModelRendererTurbo(this, 106, 89, textureX, textureY); // Box 202
		bodyModel[178] = new ModelRendererTurbo(this, 104, 91, textureX, textureY); // Box 203
		bodyModel[179] = new ModelRendererTurbo(this, 142, 123, textureX, textureY); // Box 298
		bodyModel[180] = new ModelRendererTurbo(this, 94, 123, textureX, textureY); // Box 299
		bodyModel[181] = new ModelRendererTurbo(this, 111, 107, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[182] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[183] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[184] = new ModelRendererTurbo(this, 442, 140, textureX, textureY); // Box 300
		bodyModel[185] = new ModelRendererTurbo(this, 490, 140, textureX, textureY); // Box 301
		bodyModel[186] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[187] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[188] = new ModelRendererTurbo(this, 459, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[189] = new ModelRendererTurbo(this, 90, 115, textureX, textureY); // Box 410
		bodyModel[190] = new ModelRendererTurbo(this, 90, 124, textureX, textureY); // Box 310
		bodyModel[191] = new ModelRendererTurbo(this, 80, 122, textureX, textureY); // Box 81
		bodyModel[192] = new ModelRendererTurbo(this, 77, 130, textureX, textureY); // Box 81
		bodyModel[193] = new ModelRendererTurbo(this, 77, 125, textureX, textureY); // Box 275
		bodyModel[194] = new ModelRendererTurbo(this, 77, 115, textureX, textureY); // Box 250
		bodyModel[195] = new ModelRendererTurbo(this, 77, 123, textureX, textureY); // Box 276
		bodyModel[196] = new ModelRendererTurbo(this, 442, 110, textureX, textureY); // Box 296
		bodyModel[197] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 280
		bodyModel[198] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[199] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[200] = new ModelRendererTurbo(this, 156, 101, textureX, textureY); // Box 285
		bodyModel[201] = new ModelRendererTurbo(this, 156, 81, textureX, textureY); // Box 288
		bodyModel[202] = new ModelRendererTurbo(this, 157, 110, textureX, textureY); // Box 300
		bodyModel[203] = new ModelRendererTurbo(this, 156, 90, textureX, textureY); // Box 303
		bodyModel[204] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[205] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[206] = new ModelRendererTurbo(this, 170, 99, textureX, textureY); // Box 241
		bodyModel[207] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[208] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[209] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[210] = new ModelRendererTurbo(this, 32, 153, textureX, textureY); // Box 448
		bodyModel[211] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[212] = new ModelRendererTurbo(this, 78, 153, textureX, textureY); // Box 323
		bodyModel[213] = new ModelRendererTurbo(this, 43, 151, textureX, textureY); // Box 280
		bodyModel[214] = new ModelRendererTurbo(this, 89, 151, textureX, textureY); // Box 285
		bodyModel[215] = new ModelRendererTurbo(this, 1, 186, textureX, textureY); // Box 445
		bodyModel[216] = new ModelRendererTurbo(this, 1, 196, textureX, textureY); // Box 446
		bodyModel[217] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[218] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[219] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[220] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[221] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[222] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[223] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[224] = new ModelRendererTurbo(this, 89, 170, textureX, textureY); // Box 734
		bodyModel[225] = new ModelRendererTurbo(this, 112, 146, textureX, textureY); // Box 205
		bodyModel[226] = new ModelRendererTurbo(this, 417, 141, textureX, textureY); // Box 205
		bodyModel[227] = new ModelRendererTurbo(this, 238, 138, textureX, textureY); // Box 305
		bodyModel[228] = new ModelRendererTurbo(this, 209, 140, textureX, textureY); // Box 305 
		bodyModel[229] = new ModelRendererTurbo(this, 209, 140, textureX, textureY); // Box 264
		bodyModel[230] = new ModelRendererTurbo(this, 238, 138, textureX, textureY); // Box 265
		bodyModel[231] = new ModelRendererTurbo(this, 102, 25, textureX, textureY, "cull"); // Box 266 cull
		bodyModel[232] = new ModelRendererTurbo(this, 331, 117, textureX, textureY); // Box 382 fillerup please
		bodyModel[233] = new ModelRendererTurbo(this, 331, 117, textureX, textureY); // Box 383 fillerup please
		bodyModel[234] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 185
		bodyModel[235] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "lamp"); // Box 247 Headlight Front nose R
		bodyModel[236] = new ModelRendererTurbo(this, 12, 81, textureX, textureY, "lamp"); // Box 248 Headlight Front nose L
		bodyModel[237] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[238] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[239] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[240] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[241] = new ModelRendererTurbo(this, 150, 152, textureX, textureY, "cull"); // Box 314 cull anticlimber
		bodyModel[242] = new ModelRendererTurbo(this, 171, 156, textureX, textureY, "cull"); // Box 315 cull anticlimber
		bodyModel[243] = new ModelRendererTurbo(this, 169, 160, textureX, textureY); // Box 407
		bodyModel[244] = new ModelRendererTurbo(this, 127, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[245] = new ModelRendererTurbo(this, 105, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[246] = new ModelRendererTurbo(this, 413, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[247] = new ModelRendererTurbo(this, 424, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[248] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418
		bodyModel[249] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419
		bodyModel[250] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420
		bodyModel[251] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421
		bodyModel[252] = new ModelRendererTurbo(this, 56, 67, textureX, textureY); // Box 289 highhood bit
		bodyModel[253] = new ModelRendererTurbo(this, 44, 66, textureX, textureY); // Box 295 highhood bit
		bodyModel[254] = new ModelRendererTurbo(this, 25, 66, textureX, textureY); // Box 296 highhood bit
		bodyModel[255] = new ModelRendererTurbo(this, 10, 66, textureX, textureY); // Box 297 highhood bit
		bodyModel[256] = new ModelRendererTurbo(this, 1, 39, textureX, textureY, "lamp"); // Box 298 headlight f highhood bit
		bodyModel[257] = new ModelRendererTurbo(this, 1, 39, textureX, textureY, "lamp"); // Box 299 headlight f highhood bit
		bodyModel[258] = new ModelRendererTurbo(this, 19, 75, textureX, textureY); // Box 303 highhood bit
		bodyModel[259] = new ModelRendererTurbo(this, 34, 79, textureX, textureY); // Box 304 highhood bit
		bodyModel[260] = new ModelRendererTurbo(this, 41, 75, textureX, textureY); // Box 305 highhood bit
		bodyModel[261] = new ModelRendererTurbo(this, 34, 74, textureX, textureY); // Box 306 highhood bit
		bodyModel[262] = new ModelRendererTurbo(this, 50, 72, textureX, textureY); // Box 307 highhood bit
		bodyModel[263] = new ModelRendererTurbo(this, 10, 72, textureX, textureY); // Box 308 highhood bit
		bodyModel[264] = new ModelRendererTurbo(this, 128, 45, textureX, textureY); // Box 354
		bodyModel[265] = new ModelRendererTurbo(this, 130, 42, textureX, textureY); // Box 355
		bodyModel[266] = new ModelRendererTurbo(this, 130, 48, textureX, textureY); // Box 356
		bodyModel[267] = new ModelRendererTurbo(this, 139, 45, textureX, textureY); // Box 357
		bodyModel[268] = new ModelRendererTurbo(this, 8, 59, textureX, textureY, "lamp"); // Box 307 glowey marker highhood bit
		bodyModel[269] = new ModelRendererTurbo(this, 8, 59, textureX, textureY, "lamp"); // Box 308 glowey marker highhood bit
		bodyModel[270] = new ModelRendererTurbo(this, 37, 62, textureX, textureY); // Box 402 highhood bit sandcap
		bodyModel[271] = new ModelRendererTurbo(this, 8, 50, textureX, textureY, "lamp"); // Box 388 numberboard highhood bit
		bodyModel[272] = new ModelRendererTurbo(this, 8, 50, textureX, textureY, "lamp"); // Box 389 numberboard highhood bit
		bodyModel[273] = new ModelRendererTurbo(this, 152, 42, textureX, textureY); // Box 427
		bodyModel[274] = new ModelRendererTurbo(this, 152, 45, textureX, textureY); // Box 428
		bodyModel[275] = new ModelRendererTurbo(this, 152, 48, textureX, textureY); // Box 429
		bodyModel[276] = new ModelRendererTurbo(this, 161, 45, textureX, textureY); // Box 430
		bodyModel[277] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime1"); // Box 6 PRIME3-1
		bodyModel[278] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime3"); // Box 7 PRIME3-3
		bodyModel[279] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime2"); // Box 8 PRIME3-2
		bodyModel[280] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime4"); // Box 9 PRIME3-4
		bodyModel[281] = new ModelRendererTurbo(this, 161, 56, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[282] = new ModelRendererTurbo(this, 151, 59, textureX, textureY); // Box 428
		bodyModel[283] = new ModelRendererTurbo(this, 136, 28, textureX, textureY); // Box 184 o2 generator
		bodyModel[284] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime1"); // Box 6 PRIME4-1
		bodyModel[285] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime3"); // Box 7 PRIME4-3
		bodyModel[286] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime2"); // Box 8 PRIME4-2
		bodyModel[287] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime4"); // Box 9 PRIME4-4
		bodyModel[288] = new ModelRendererTurbo(this, 174, 59, textureX, textureY); // Box 428
		bodyModel[289] = new ModelRendererTurbo(this, 165, 38, textureX, textureY); // Box 364 prime base
		bodyModel[290] = new ModelRendererTurbo(this, 165, 34, textureX, textureY, "prime1"); // Box 6 PRIME1-1
		bodyModel[291] = new ModelRendererTurbo(this, 165, 34, textureX, textureY, "prime3"); // Box 7 PRIME1-3
		bodyModel[292] = new ModelRendererTurbo(this, 165, 34, textureX, textureY, "prime2"); // Box 8 PRIME1-2
		bodyModel[293] = new ModelRendererTurbo(this, 165, 34, textureX, textureY, "prime4"); // Box 9 PRIME1-4
		bodyModel[294] = new ModelRendererTurbo(this, 322, 124, textureX, textureY); // Box 331 why dont you ALSO filter some biiiitchhheesssssssss
		bodyModel[295] = new ModelRendererTurbo(this, 332, 124, textureX, textureY); // Box 332 why dont you additonally filter some bitches on you dick
		bodyModel[296] = new ModelRendererTurbo(this, 142, 47, textureX, textureY, "lamp"); // Box 401 sp emergency gyra
		bodyModel[297] = new ModelRendererTurbo(this, 141, 52, textureX, textureY); // Box 400 sp E gyra box
		bodyModel[298] = new ModelRendererTurbo(this, 142, 57, textureX, textureY); // Box 335
		bodyModel[299] = new ModelRendererTurbo(this, 198, 99, textureX, textureY); // Box 36 electrical locker
		bodyModel[300] = new ModelRendererTurbo(this, 151, 120, textureX, textureY); // Box 302 early mu plug area
		bodyModel[301] = new ModelRendererTurbo(this, 166, 120, textureX, textureY); // Box 303 early mu plug area
		bodyModel[302] = new ModelRendererTurbo(this, 160, 119, textureX, textureY); // Box 279 early mu plug area
		bodyModel[303] = new ModelRendererTurbo(this, 175, 121, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[304] = new ModelRendererTurbo(this, 150, 121, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[305] = new ModelRendererTurbo(this, 414, 109, textureX, textureY); // Box 324 early mu plug area
		bodyModel[306] = new ModelRendererTurbo(this, 414, 125, textureX, textureY); // Box 327 early mu plug area
		bodyModel[307] = new ModelRendererTurbo(this, 416, 118, textureX, textureY); // Box 280 early mu plug area
		bodyModel[308] = new ModelRendererTurbo(this, 413, 126, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[309] = new ModelRendererTurbo(this, 424, 126, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[310] = new ModelRendererTurbo(this, 201, 32, textureX, textureY); // Box 286
		bodyModel[311] = new ModelRendererTurbo(this, 210, 35, textureX, textureY); // Box 287
		bodyModel[312] = new ModelRendererTurbo(this, 201, 38, textureX, textureY); // Box 288
		bodyModel[313] = new ModelRendererTurbo(this, 199, 35, textureX, textureY); // Box 289
		bodyModel[314] = new ModelRendererTurbo(this, 116, 59, textureX, textureY); // Box 352
		bodyModel[315] = new ModelRendererTurbo(this, 116, 62, textureX, textureY); // Box 353
		bodyModel[316] = new ModelRendererTurbo(this, 116, 56, textureX, textureY); // Box 354
		bodyModel[317] = new ModelRendererTurbo(this, 115, 51, textureX, textureY, "cull"); // Box 332 bell mount cull
		bodyModel[318] = new ModelRendererTurbo(this, 166, 42, textureX, textureY); // Box 333
		bodyModel[319] = new ModelRendererTurbo(this, 176, 45, textureX, textureY); // Box 334
		bodyModel[320] = new ModelRendererTurbo(this, 166, 45, textureX, textureY); // Box 335
		bodyModel[321] = new ModelRendererTurbo(this, 166, 48, textureX, textureY); // Box 336
		bodyModel[322] = new ModelRendererTurbo(this, 113, 42, textureX, textureY); // Box 337
		bodyModel[323] = new ModelRendererTurbo(this, 218, 49, textureX, textureY); // Box 745
		bodyModel[324] = new ModelRendererTurbo(this, 206, 49, textureX, textureY); // Box 746
		bodyModel[325] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 747
		bodyModel[326] = new ModelRendererTurbo(this, 208, 52, textureX, textureY); // Box 748
		bodyModel[327] = new ModelRendererTurbo(this, 112, 40, textureX, textureY); // Box 785
		bodyModel[328] = new ModelRendererTurbo(this, 195, 46, textureX, textureY); // Box 786
		bodyModel[329] = new ModelRendererTurbo(this, 186, 43, textureX, textureY); // Box 787
		bodyModel[330] = new ModelRendererTurbo(this, 184, 46, textureX, textureY); // Box 788
		bodyModel[331] = new ModelRendererTurbo(this, 186, 49, textureX, textureY); // Box 789
		bodyModel[332] = new ModelRendererTurbo(this, 142, 63, textureX, textureY); // Box 279
		bodyModel[333] = new ModelRendererTurbo(this, 172, 31, textureX, textureY); // Box 409 commander base
		bodyModel[334] = new ModelRendererTurbo(this, 172, 27, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[335] = new ModelRendererTurbo(this, 142, 66, textureX, textureY); // Box 374
		bodyModel[336] = new ModelRendererTurbo(this, 112, 38, textureX, textureY); // Box 413
		bodyModel[337] = new ModelRendererTurbo(this, 133, 64, textureX, textureY); // Box 376 bn bababooey
		bodyModel[338] = new ModelRendererTurbo(this, 201, 72, textureX, textureY); // Box 403
		bodyModel[339] = new ModelRendererTurbo(this, 201, 75, textureX, textureY); // Box 404
		bodyModel[340] = new ModelRendererTurbo(this, 201, 78, textureX, textureY); // Box 405
		bodyModel[341] = new ModelRendererTurbo(this, 206, 74, textureX, textureY, "cull"); // Box 407 sp bell holder cull
		bodyModel[342] = new ModelRendererTurbo(this, 140, 69, textureX, textureY); // Box 308
		bodyModel[343] = new ModelRendererTurbo(this, 140, 71, textureX, textureY); // Box 382
		bodyModel[344] = new ModelRendererTurbo(this, 160, 32, textureX, textureY); // Box 402 milw egirl
		bodyModel[345] = new ModelRendererTurbo(this, 160, 29, textureX, textureY); // Box 0 milw egirl
		bodyModel[346] = new ModelRendererTurbo(this, 160, 29, textureX, textureY); // Box 213 milw egirl
		bodyModel[347] = new ModelRendererTurbo(this, 155, 32, textureX, textureY); // Box 3868 bn egirl
		bodyModel[348] = new ModelRendererTurbo(this, 155, 29, textureX, textureY); // Box 3878 bn egirl
		bodyModel[349] = new ModelRendererTurbo(this, 155, 29, textureX, textureY); // Box 388 bn egirl
		bodyModel[350] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[351] = new ModelRendererTurbo(this, 141, 153, textureX, textureY); // Box 390
		bodyModel[352] = new ModelRendererTurbo(this, 16, 55, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[353] = new ModelRendererTurbo(this, 16, 50, textureX, textureY); // Box 5
		bodyModel[354] = new ModelRendererTurbo(this, 115, 87, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[355] = new ModelRendererTurbo(this, 117, 82, textureX, textureY); // Box 5
		bodyModel[356] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 106 cab backbox
		bodyModel[357] = new ModelRendererTurbo(this, 72, 195, textureX, textureY); // Box 530 fridge?
		bodyModel[358] = new ModelRendererTurbo(this, 28, 197, textureX, textureY); // Box 412 cs
		bodyModel[359] = new ModelRendererTurbo(this, 42, 197, textureX, textureY); // Box 413 cs
		bodyModel[360] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86 cs
		bodyModel[361] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // Box 531 cs
		bodyModel[362] = new ModelRendererTurbo(this, 55, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[363] = new ModelRendererTurbo(this, 112, 36, textureX, textureY); // Box 402
		bodyModel[364] = new ModelRendererTurbo(this, 165, 28, textureX, textureY); // Box 114
		bodyModel[365] = new ModelRendererTurbo(this, 165, 28, textureX, textureY); // Box 74
		bodyModel[366] = new ModelRendererTurbo(this, 165, 31, textureX, textureY); // Box 78
		bodyModel[367] = new ModelRendererTurbo(this, 163, 23, textureX, textureY); // Box 245
		bodyModel[368] = new ModelRendererTurbo(this, 125, 58, textureX, textureY); // Box 364 prime base
		bodyModel[369] = new ModelRendererTurbo(this, 125, 54, textureX, textureY, "prime1"); // Box 6 PRIME2-1
		bodyModel[370] = new ModelRendererTurbo(this, 125, 54, textureX, textureY, "prime3"); // Box 7 PRIME2-3
		bodyModel[371] = new ModelRendererTurbo(this, 125, 54, textureX, textureY, "prime2"); // Box 8 PRIME2-2
		bodyModel[372] = new ModelRendererTurbo(this, 125, 54, textureX, textureY, "prime4"); // Box 9 PRIME2-4
		bodyModel[373] = new ModelRendererTurbo(this, 124, 62, textureX, textureY, "cull"); // Box 426 cull atsf bit
		bodyModel[374] = new ModelRendererTurbo(this, 124, 68, textureX, textureY, "cull"); // Box 418 cull platform atsf
		bodyModel[375] = new ModelRendererTurbo(this, 135, 66, textureX, textureY); // Box 308
		bodyModel[376] = new ModelRendererTurbo(this, 359, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[377] = new ModelRendererTurbo(this, 216, 59, textureX, textureY); // Box 417
		bodyModel[378] = new ModelRendererTurbo(this, 205, 59, textureX, textureY); // Box 418
		bodyModel[379] = new ModelRendererTurbo(this, 207, 62, textureX, textureY); // Box 419
		bodyModel[380] = new ModelRendererTurbo(this, 207, 56, textureX, textureY); // Box 420
		bodyModel[381] = new ModelRendererTurbo(this, 253, 197, textureX, textureY, "cull"); // Box 428 early radiators cull
		bodyModel[382] = new ModelRendererTurbo(this, 198, 199, textureX, textureY, "cull"); // Box 350 early intakes cull
		bodyModel[383] = new ModelRendererTurbo(this, 97, 102, textureX, textureY); // Box 410
		bodyModel[384] = new ModelRendererTurbo(this, 104, 102, textureX, textureY); // Box 411
		bodyModel[385] = new ModelRendererTurbo(this, 106, 99, textureX, textureY); // Box 412
		bodyModel[386] = new ModelRendererTurbo(this, 104, 96, textureX, textureY); // Box 413
		bodyModel[387] = new ModelRendererTurbo(this, 106, 94, textureX, textureY); // Box 414
		bodyModel[388] = new ModelRendererTurbo(this, 104, 91, textureX, textureY); // Box 415
		bodyModel[389] = new ModelRendererTurbo(this, 106, 89, textureX, textureY); // Box 416
		bodyModel[390] = new ModelRendererTurbo(this, 104, 86, textureX, textureY); // Box 417
		bodyModel[391] = new ModelRendererTurbo(this, 105, 84, textureX, textureY); // Box 418
		bodyModel[392] = new ModelRendererTurbo(this, 95, 102, textureX, textureY); // Box 419
		bodyModel[393] = new ModelRendererTurbo(this, 97, 99, textureX, textureY); // Box 420
		bodyModel[394] = new ModelRendererTurbo(this, 95, 96, textureX, textureY); // Box 421
		bodyModel[395] = new ModelRendererTurbo(this, 97, 94, textureX, textureY); // Box 422
		bodyModel[396] = new ModelRendererTurbo(this, 95, 91, textureX, textureY); // Box 423
		bodyModel[397] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 424
		bodyModel[398] = new ModelRendererTurbo(this, 95, 86, textureX, textureY); // Box 425
		bodyModel[399] = new ModelRendererTurbo(this, 96, 84, textureX, textureY); // Box 426
		bodyModel[400] = new ModelRendererTurbo(this, 177, 31, textureX, textureY); // Box 409 commander base
		bodyModel[401] = new ModelRendererTurbo(this, 177, 27, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[402] = new ModelRendererTurbo(this, 336, 117, textureX, textureY); // Box 433
		bodyModel[403] = new ModelRendererTurbo(this, 341, 117, textureX, textureY); // Box 434
		bodyModel[404] = new ModelRendererTurbo(this, 346, 115, textureX, textureY); // Box 435
		bodyModel[405] = new ModelRendererTurbo(this, 351, 115, textureX, textureY); // Box 436
		bodyModel[406] = new ModelRendererTurbo(this, 167, 199, textureX, textureY); // Box 437 early intakes filler fakebox
		bodyModel[407] = new ModelRendererTurbo(this, 119, 36, textureX, textureY); // Box 438
		bodyModel[408] = new ModelRendererTurbo(this, 139, 63, textureX, textureY); // Box 439
		bodyModel[409] = new ModelRendererTurbo(this, 179, 68, textureX, textureY); // Box 281
		bodyModel[410] = new ModelRendererTurbo(this, 200, 66, textureX, textureY); // Box 101
		bodyModel[411] = new ModelRendererTurbo(this, 179, 63, textureX, textureY, "ditch"); // Box 276 ditchlight r1
		bodyModel[412] = new ModelRendererTurbo(this, 200, 61, textureX, textureY, "ditch"); // Box 278 ditchlight r2
		bodyModel[413] = new ModelRendererTurbo(this, 200, 66, textureX, textureY); // Box 440
		bodyModel[414] = new ModelRendererTurbo(this, 200, 61, textureX, textureY, "ditch"); // Box 441 ditchlight r2
		bodyModel[415] = new ModelRendererTurbo(this, 179, 68, textureX, textureY); // Box 442
		bodyModel[416] = new ModelRendererTurbo(this, 179, 63, textureX, textureY, "ditch"); // Box 443 ditchlight r1
		bodyModel[417] = new ModelRendererTurbo(this, 186, 68, textureX, textureY); // Box 252
		bodyModel[418] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 101
		bodyModel[419] = new ModelRendererTurbo(this, 186, 63, textureX, textureY, "ditch"); // Box 190 ditchlight f1
		bodyModel[420] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "ditch"); // Box 275 ditchlight f2
		bodyModel[421] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 444
		bodyModel[422] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "ditch"); // Box 445 ditchlight f2
		bodyModel[423] = new ModelRendererTurbo(this, 186, 63, textureX, textureY, "ditch"); // Box 446 ditchlight f1
		bodyModel[424] = new ModelRendererTurbo(this, 186, 68, textureX, textureY); // Box 447
		bodyModel[425] = new ModelRendererTurbo(this, 308, 239, textureX, textureY); // Box 456 soop line tiny fuel tank
		bodyModel[426] = new ModelRendererTurbo(this, 246, 231, textureX, textureY); // Box 457 soop line tiny fuel tank
		bodyModel[427] = new ModelRendererTurbo(this, 210, 239, textureX, textureY); // Box 458 soop line tiny fuel tank
		bodyModel[428] = new ModelRendererTurbo(this, 185, 26, textureX, textureY); // Box 292
		bodyModel[429] = new ModelRendererTurbo(this, 187, 29, textureX, textureY); // Box 293
		bodyModel[430] = new ModelRendererTurbo(this, 194, 27, textureX, textureY); // Box 294
		bodyModel[431] = new ModelRendererTurbo(this, 185, 32, textureX, textureY); // Box 295
		bodyModel[432] = new ModelRendererTurbo(this, 153, 71, textureX, textureY, "cull"); // Box 339 cull pw beacon holdy
		bodyModel[433] = new ModelRendererTurbo(this, 160, 71, textureX, textureY, "cull"); // Box 340 cull pw beacon holdy
		bodyModel[434] = new ModelRendererTurbo(this, 161, 67, textureX, textureY, "commander"); // Box 410 commander beacon pw
		bodyModel[435] = new ModelRendererTurbo(this, 154, 67, textureX, textureY, "commander"); // Box 342 commander beacon pw
		bodyModel[436] = new ModelRendererTurbo(this, 140, 162, textureX, textureY); // Box 440 honse
		bodyModel[437] = new ModelRendererTurbo(this, 140, 167, textureX, textureY); // Box 468 honse
		bodyModel[438] = new ModelRendererTurbo(this, 187, 74, textureX, textureY); // Box 354 cnw bELL
		bodyModel[439] = new ModelRendererTurbo(this, 190, 75, textureX, textureY, "cull"); // Box 403 cnw step cull thing

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[0].setRotationPoint(-52F, 3F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[1].setRotationPoint(-48F, 8F, -9F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[2].setRotationPoint(48F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[3].setRotationPoint(48F, 8F, -9F);

		bodyModel[4].addBox(0F, 0F, 0F, 0, 18, 22, 0F); // Box 256
		bodyModel[4].setRotationPoint(48.01F, -10F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[5].setRotationPoint(-48F, 1F, -3F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[6].setRotationPoint(43F, 1F, -3F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[7].setRotationPoint(-49F, 2.5F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[8].setRotationPoint(48F, 2.5F, -2F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 8
		bodyModel[9].setRotationPoint(-48F, -2F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[10].setRotationPoint(-44F, 1F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 195
		bodyModel[11].setRotationPoint(-45F, -2F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[12].setRotationPoint(-45F, 7F, 10F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 197
		bodyModel[13].setRotationPoint(-48F, 8F, 9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[14].setRotationPoint(-45F, 7F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[15].setRotationPoint(-48F, -2F, 7F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[16].setRotationPoint(-48F, 0.5F, 7F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[17].setRotationPoint(-48F, -2F, -8F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[18].setRotationPoint(-48F, 0.5F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 205
		bodyModel[19].setRotationPoint(-48F, 8F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 8, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[20].setRotationPoint(-44F, 0F, 7F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 261
		bodyModel[21].setRotationPoint(-45F, -2F, 7F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[22].setRotationPoint(-48F, 6F, -9F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[23].setRotationPoint(-48F, 6F, 9F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[24].setRotationPoint(-48F, 5.5F, 8.25F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[25].setRotationPoint(-48F, 5.5F, -10.25F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[26].setRotationPoint(-48F, 4.5F, 8.25F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[27].setRotationPoint(-48F, 4.5F, -8.25F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206 early stairwell pillar
		bodyModel[28].setRotationPoint(-45F, 3F, 10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207 early stairwell pillar
		bodyModel[29].setRotationPoint(-45F, 3F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 215
		bodyModel[30].setRotationPoint(44F, -2F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[31].setRotationPoint(44F, 7F, 10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[32].setRotationPoint(44F, 7F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 8, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[33].setRotationPoint(42F, 0F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 264
		bodyModel[34].setRotationPoint(44F, -2F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 8, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[35].setRotationPoint(42F, 0F, 7F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 271
		bodyModel[36].setRotationPoint(44F, -2F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217 early stairwell pillar
		bodyModel[37].setRotationPoint(44F, 3F, 10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221 early stairwell pillar
		bodyModel[38].setRotationPoint(44F, 3F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 22, 4, 16, 0F); // Box 2
		bodyModel[39].setRotationPoint(-11F, 5F, -8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 22, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[40].setRotationPoint(-11F, 2F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 22, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[41].setRotationPoint(-11F, 5F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 22, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[42].setRotationPoint(-11F, 5F, 8F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[43].setRotationPoint(-13F, 4F, -9F);

		bodyModel[44].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[44].setRotationPoint(-12.5F, 6F, -9.5F);
		bodyModel[44].rotateAngleZ = 0.10471976F;

		bodyModel[45].addBox(-0.5F, -6F, -1F, 1, 6, 1, 0F); // Box 305 pipe cull
		bodyModel[45].setRotationPoint(-12.5F, 5.5F, 10.01F);
		bodyModel[45].rotateAngleZ = -0.2268928F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[46].setRotationPoint(-12.5F, 2.5F, 8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[47].setRotationPoint(-12.5F, 1.5F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[48].setRotationPoint(-12.25F, 3F, 8.25F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[49].setRotationPoint(-14F, 5F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[50].setRotationPoint(-12F, 5F, -9F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[51].setRotationPoint(12F, 4F, -9F);

		bodyModel[52].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[52].setRotationPoint(12.5F, 6F, -9.5F);
		bodyModel[52].rotateAngleZ = -0.10471976F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[53].setRotationPoint(11F, 5F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[54].setRotationPoint(13F, 5F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[55].setRotationPoint(11.25F, 0.5F, 8.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 440
		bodyModel[56].setRotationPoint(-30.5F, 1.5F, -2F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631
		bodyModel[57].setRotationPoint(-30.5F, 0F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882
		bodyModel[58].setRotationPoint(-29.5F, 1F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883
		bodyModel[59].setRotationPoint(-29.5F, 1F, 6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318
		bodyModel[60].setRotationPoint(26.5F, 0F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322
		bodyModel[61].setRotationPoint(27.5F, 1F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757
		bodyModel[62].setRotationPoint(27.5F, 1F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 758
		bodyModel[63].setRotationPoint(26.5F, 1.5F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 88, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[64].setRotationPoint(-44F, 0F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 88, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[65].setRotationPoint(-44F, 1.75F, -7.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 88, 2, 22, 0F); // Box 0
		bodyModel[66].setRotationPoint(-44F, -2F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 156
		bodyModel[67].setRotationPoint(-44F, 0.5F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 88, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[68].setRotationPoint(-44F, 0F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 7
		bodyModel[69].setRotationPoint(-38F, -19F, -11F);

		bodyModel[70].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 24
		bodyModel[70].setRotationPoint(-38F, -19F, 10F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 28
		bodyModel[71].setRotationPoint(-27F, -19F, -11F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 30
		bodyModel[72].setRotationPoint(-39F, -19F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[73].setRotationPoint(-39F, -22F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[74].setRotationPoint(-39F, -22F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 106
		bodyModel[75].setRotationPoint(-27F, -22F, -7F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 107
		bodyModel[76].setRotationPoint(-39F, -22F, -7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[77].setRotationPoint(-38F, -23F, -7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[78].setRotationPoint(-39F, -23F, -7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[79].setRotationPoint(-27F, -23F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[80].setRotationPoint(-39F, -23F, 1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[81].setRotationPoint(-27F, -23F, 1F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[82].setRotationPoint(-27F, -22F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[83].setRotationPoint(-27F, -22F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[84].setRotationPoint(-38F, -23F, 1F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[85].setRotationPoint(-42F, -12F, 6.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 5, 12, 14, 0F); // Box 298
		bodyModel[86].setRotationPoint(-44F, -14F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[87].setRotationPoint(-44F, -15F, -1F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[88].setRotationPoint(-44F, -15F, -7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[89].setRotationPoint(-44F, -15F, 1F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 302
		bodyModel[90].setRotationPoint(-45F, -14F, -7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[91].setRotationPoint(-45F, -14F, 1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304
		bodyModel[92].setRotationPoint(-45F, -14F, -1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[93].setRotationPoint(-44.85F, -13.7F, -7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[94].setRotationPoint(-44.85F, -13.7F, 5F);

		bodyModel[95].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // Box 309
		bodyModel[95].setRotationPoint(-39F, -23F, -1F);

		bodyModel[96].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 52 door swing right
		bodyModel[96].setRotationPoint(-38.5F, -19F, -10.5F);

		bodyModel[97].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[97].setRotationPoint(-26.5F, -19F, 10.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[98].setRotationPoint(-43.5F, -15F, -1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.7F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, 0F, 0F, 0F); // Box 316 cull nose handrail
		bodyModel[99].setRotationPoint(-43F, -14.75F, -6F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318 cull nose handrail
		bodyModel[100].setRotationPoint(-43F, -14.75F, 3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[101].setRotationPoint(-37F, -19F, -11F);
		bodyModel[101].rotateAngleX = -0.61086524F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[102].setRotationPoint(-37F, -19F, 11F);
		bodyModel[102].rotateAngleX = 0.61086524F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[103].setRotationPoint(-38F, -20F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[104].setRotationPoint(-38F, -20F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[105].setRotationPoint(-44F, -14F, 7.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 25, 4, 22, 0F); // Box 25
		bodyModel[106].setRotationPoint(-42F, -6F, -11F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 32
		bodyModel[107].setRotationPoint(-43F, -4F, -10F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 33
		bodyModel[108].setRotationPoint(-43F, -6F, 7F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[109].setRotationPoint(-43F, -6F, -11F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[110].setRotationPoint(-17F, -4F, -10F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[111].setRotationPoint(-8F, -4F, 7F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[112].setRotationPoint(-17F, -6F, -11F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[113].setRotationPoint(-8F, -6F, 10F);

		bodyModel[114].addBox(0F, 0F, 0F, 70, 19, 14, 0F); // Box 6
		bodyModel[114].setRotationPoint(-26F, -21F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 49, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[115].setRotationPoint(-26F, -22F, -7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 49, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[116].setRotationPoint(-26F, -22F, 3F);

		bodyModel[117].addBox(0F, 0F, 0F, 49, 1, 6, 0F); // Box 294
		bodyModel[117].setRotationPoint(-26F, -22F, -3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[118].setRotationPoint(-18.5F, -17.5F, 6.15F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[119].setRotationPoint(-14F, -17.5F, 6.15F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[120].setRotationPoint(-18.5F, -20F, 6.15F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[121].setRotationPoint(-18.5F, -20F, -7.15F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[122].setRotationPoint(-18.5F, -17.5F, -7.15F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[123].setRotationPoint(-16F, -17.5F, -7.15F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48
		bodyModel[124].setRotationPoint(-40F, -23F, -1F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[125].setRotationPoint(-40.1F, -23F, -1F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[126].setRotationPoint(-40.1F, -21F, -1F);

		bodyModel[127].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0.25F, 0F, -0.05F, 0.25F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0.25F, 0F, -0.05F, 0.25F); // Box 117 numberboard
		bodyModel[127].setRotationPoint(-40.05F, -22F, -1.5F);
		bodyModel[127].rotateAngleY = 0.13089969F;

		bodyModel[128].addShapeBox(0F, 0F, 0.5F, 1, 2, 5, 0F,0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[128].setRotationPoint(-40.05F, -22F, 1F);
		bodyModel[128].rotateAngleY = -0.13089969F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 43
		bodyModel[129].setRotationPoint(-40F, -22F, -6.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F); // Box 175
		bodyModel[130].setRotationPoint(-40F, -22F, 1F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 148
		bodyModel[131].setRotationPoint(44F, -22F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 149
		bodyModel[132].setRotationPoint(44F, -22F, 1F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[133].setRotationPoint(44F, -22F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down
		bodyModel[134].setRotationPoint(44.1F, -17F, -1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up
		bodyModel[135].setRotationPoint(44.1F, -19F, -1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[136].setRotationPoint(43.85F, -15F, -7F);
		bodyModel[136].rotateAngleY = -0.05235988F;

		bodyModel[137].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[137].setRotationPoint(43.85F, -15F, 7F);
		bodyModel[137].rotateAngleY = 0.05235988F;

		bodyModel[138].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 283
		bodyModel[138].setRotationPoint(23F, -19F, -7.75F);

		bodyModel[139].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 284
		bodyModel[139].setRotationPoint(23F, -19F, 6.75F);

		bodyModel[140].addBox(0F, 0F, 0F, 21, 3, 16, 0F); // Box 298
		bodyModel[140].setRotationPoint(23F, -22F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[141].setRotationPoint(23F, -23F, 1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[142].setRotationPoint(23F, -23F, -8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[143].setRotationPoint(23F, -23F, -1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[144].setRotationPoint(43F, -23F, -1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[145].setRotationPoint(44F, -23F, -8F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 279
		bodyModel[146].setRotationPoint(44F, -23F, 1F);

		bodyModel[147].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[147].setRotationPoint(44F, -23.25F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[148].setRotationPoint(43.8F, -21F, -7.5F);
		bodyModel[148].rotateAngleY = -0.05235988F;

		bodyModel[149].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[149].setRotationPoint(43.8F, -21F, 7.5F);
		bodyModel[149].rotateAngleY = 0.05235988F;

		bodyModel[150].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288 rear gyralight mount
		bodyModel[150].setRotationPoint(44.75F, -21.25F, -2F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight rear l
		bodyModel[151].setRotationPoint(45.5F, -21.2F, -2F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290 gyralight rear r
		bodyModel[152].setRotationPoint(45.5F, -21.2F, 0F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[153].setRotationPoint(32.75F, -15F, 7.25F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 293
		bodyModel[154].setRotationPoint(30F, -15F, 7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[155].setRotationPoint(27F, -15F, 7F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 293 paper filter (late units)
		bodyModel[156].setRotationPoint(23.5F, -9F, 7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 293 oilbath filter (early units)
		bodyModel[157].setRotationPoint(23.5F, -18F, 7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165 numberboard
		bodyModel[158].setRotationPoint(44.3F, -19F, -6.25F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 167 numberboard
		bodyModel[159].setRotationPoint(44.3F, -19F, 1.25F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 534
		bodyModel[160].setRotationPoint(30F, -15F, -8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F); // Box 535
		bodyModel[161].setRotationPoint(32.75F, -15F, -8.25F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[162].setRotationPoint(27F, -15F, -8F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 537 oilbath filter (early units)
		bodyModel[163].setRotationPoint(23.5F, -18F, -8F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 538 paper filter (late units)
		bodyModel[164].setRotationPoint(23.5F, -9F, -8F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 1F, -7F, 0F, 1F, -7F); // Box 547
		bodyModel[165].setRotationPoint(24F, -23.51F, 1F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, -1F, -7F, -19F, -1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, -19F, 1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[166].setRotationPoint(24F, -23.51F, -15F);

		bodyModel[167].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 18
		bodyModel[167].setRotationPoint(16.5F, -23.5F, -2.5F);

		bodyModel[168].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 21
		bodyModel[168].setRotationPoint(16F, -22.5F, -3F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.35F, 0F, 0F, 0F, 0F); // Box 430 early nonsense
		bodyModel[169].setRotationPoint(19F, -21F, -8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.35F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 431 early nonsense
		bodyModel[170].setRotationPoint(19F, -21F, 7F);

		bodyModel[171].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Box 196 phase 2a shit
		bodyModel[171].setRotationPoint(-17F, -6F, -11F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 197 phase 2a shit
		bodyModel[172].setRotationPoint(-9F, -6F, -11F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 198 phase 2a shit
		bodyModel[173].setRotationPoint(-9F, -4F, -10F);

		bodyModel[174].addBox(0F, 0F, 0F, 9, 4, 4, 0F); // Box 199
		bodyModel[174].setRotationPoint(-17F, -6F, 7F);

		bodyModel[175].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[175].setRotationPoint(-48F, 3F, 7.5F);

		bodyModel[176].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 201
		bodyModel[176].setRotationPoint(-48F, 2F, 7.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 202
		bodyModel[177].setRotationPoint(-48F, 2F, -7.5F);

		bodyModel[178].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 203
		bodyModel[178].setRotationPoint(-48F, 3F, -9.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[179].setRotationPoint(-48.01F, -10F, -10F);
		bodyModel[179].rotateAngleY = -3.14159265F;

		bodyModel[180].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[180].setRotationPoint(-48.01F, -10F, 11F);
		bodyModel[180].rotateAngleY = -3.14159265F;

		bodyModel[181].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[181].setRotationPoint(-48F, -2F, -2F);
		bodyModel[181].rotateAngleZ = -1.48352986F;

		bodyModel[182].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[182].setRotationPoint(-49F, -10F, -2F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[183].setRotationPoint(-49F, -10F, 2F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[184].setRotationPoint(48.01F, -10F, -10F);
		bodyModel[184].rotateAngleY = -3.14159265F;

		bodyModel[185].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[185].setRotationPoint(48.01F, -10F, 11F);
		bodyModel[185].rotateAngleY = -3.14159265F;

		bodyModel[186].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[186].setRotationPoint(48F, -10F, -2F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[187].setRotationPoint(48F, -10F, 2F);

		bodyModel[188].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[188].setRotationPoint(48F, -2F, 2F);
		bodyModel[188].rotateAngleY = -3.14159265F;
		bodyModel[188].rotateAngleZ = -1.48352986F;

		bodyModel[189].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 410
		bodyModel[189].setRotationPoint(-44F, -14F, 11F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 17, 0, 0F); // Box 310
		bodyModel[190].setRotationPoint(-45F, -14F, 11F);

		bodyModel[191].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 81
		bodyModel[191].setRotationPoint(-45.01F, -9F, -11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[192].setRotationPoint(-45.01F, -6F, -11.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 275
		bodyModel[193].setRotationPoint(-45F, -13F, -9.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 250
		bodyModel[194].setRotationPoint(-45F, -14F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[195].setRotationPoint(-45F, -14F, -11F);

		bodyModel[196].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[196].setRotationPoint(45F, -10F, -11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[197].setRotationPoint(45F, -5F, -11.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[198].setRotationPoint(45F, -5F, 10.5F);

		bodyModel[199].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[199].setRotationPoint(45F, -10F, 9F);

		bodyModel[200].addBox(0F, 0F, 0F, 20, 8, 0, 0F); // Box 285
		bodyModel[200].setRotationPoint(-26F, -14F, 11F);

		bodyModel[201].addBox(0F, 0F, 0F, 47, 8, 0, 0F); // Box 288
		bodyModel[201].setRotationPoint(-2F, -10F, 11F);

		bodyModel[202].addBox(0F, 0F, 0F, 19, 8, 0, 0F); // Box 300
		bodyModel[202].setRotationPoint(-26F, -14F, -11F);

		bodyModel[203].addBox(0F, 0F, 0F, 56, 8, 0, 0F); // Box 303
		bodyModel[203].setRotationPoint(-11F, -10F, -11F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 296
		bodyModel[204].setRotationPoint(-7F, -14F, -11.01F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 297
		bodyModel[205].setRotationPoint(-6F, -14F, 11.01F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 241
		bodyModel[206].setRotationPoint(-15F, -14F, -11.01F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[207].setRotationPoint(-52F, 7F, 0F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[208].setRotationPoint(-52F, 7F, -10F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[209].setRotationPoint(-51F, 6F, 0F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[210].setRotationPoint(-51F, 4F, 2F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[211].setRotationPoint(-51F, 6F, -10F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[212].setRotationPoint(-51F, 4F, -10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[213].setRotationPoint(-51F, 4F, 2F);

		bodyModel[214].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[214].setRotationPoint(-51F, 4F, -8F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 445
		bodyModel[215].setRotationPoint(-51F, 3F, 2F);

		bodyModel[216].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 446
		bodyModel[216].setRotationPoint(-51F, 3F, -8F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[217].setRotationPoint(50F, 6F, 0F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[218].setRotationPoint(50F, 6F, -10F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[219].setRotationPoint(51F, 7F, -10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[220].setRotationPoint(51F, 7F, 0F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[221].setRotationPoint(50F, 5F, 2F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[222].setRotationPoint(50F, 4F, 2F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[223].setRotationPoint(50F, 5F, -10F);

		bodyModel[224].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[224].setRotationPoint(50F, 4F, -8F);

		bodyModel[225].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[225].setRotationPoint(-50F, 8F, -10F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[226].setRotationPoint(48F, 8F, -10F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F); // Box 305
		bodyModel[227].setRotationPoint(-14F, 2F, -7F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 305 
		bodyModel[228].setRotationPoint(-14F, 2F, -6.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 264
		bodyModel[229].setRotationPoint(13F, 2F, -6.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F); // Box 265
		bodyModel[230].setRotationPoint(11F, 2F, -7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266 cull
		bodyModel[231].setRotationPoint(-12.5F, 0.5F, 7.5F);

		bodyModel[232].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382 fillerup please
		bodyModel[232].setRotationPoint(1F, 1.25F, -11F);
		bodyModel[232].rotateAngleX = 1.25663706F;

		bodyModel[233].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383 fillerup please
		bodyModel[233].setRotationPoint(1F, 1.25F, 11F);
		bodyModel[233].rotateAngleX = -1.25663706F;

		bodyModel[234].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 185
		bodyModel[234].setRotationPoint(-44.75F, -14.75F, -2F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front nose R
		bodyModel[235].setRotationPoint(-45.35F, -14.7F, -2F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front nose L
		bodyModel[236].setRotationPoint(-45.35F, -14.7F, 0F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[237].setRotationPoint(-49F, -2F, -7F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[238].setRotationPoint(-49F, -2F, 2F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[239].setRotationPoint(48F, -2F, -7F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[240].setRotationPoint(48F, -2F, 2F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 314 cull anticlimber
		bodyModel[241].setRotationPoint(-49F, -2F, -8F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 315 cull anticlimber
		bodyModel[242].setRotationPoint(-50.5F, -2F, -7F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 0, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F); // Box 407
		bodyModel[243].setRotationPoint(-50.5F, -1F, -2.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[244].setRotationPoint(-48.75F, -2F, -5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[245].setRotationPoint(-48.75F, -2F, 3F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[246].setRotationPoint(47.75F, -2F, -5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[247].setRotationPoint(47.75F, -2F, 3F);

		bodyModel[248].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[248].setRotationPoint(-4.5F, -22.5F, -6.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[249].setRotationPoint(-6F, -23.25F, -5.5F);

		bodyModel[250].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[250].setRotationPoint(-7F, -23.5F, -6.5F);

		bodyModel[251].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[251].setRotationPoint(-5.5F, -23.25F, -7.5F);

		bodyModel[252].addBox(0F, 0F, 0F, 5, 7, 14, 0F); // Box 289 highhood bit
		bodyModel[252].setRotationPoint(-44F, -21F, -7F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295 highhood bit
		bodyModel[253].setRotationPoint(-44F, -22F, -7F);

		bodyModel[254].addBox(0F, 0F, 0F, 5, 1, 6, 0F); // Box 296 highhood bit
		bodyModel[254].setRotationPoint(-44F, -22F, -3F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297 highhood bit
		bodyModel[255].setRotationPoint(-44F, -22F, 3F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 298 headlight f highhood bit
		bodyModel[256].setRotationPoint(-45.1F, -19.5F, -1F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 299 headlight f highhood bit
		bodyModel[257].setRotationPoint(-45.1F, -17.5F, -1F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 19, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303 highhood bit
		bodyModel[258].setRotationPoint(-45F, -21F, 1F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 304 highhood bit
		bodyModel[259].setRotationPoint(-45F, -21F, -1F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 19, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 highhood bit
		bodyModel[260].setRotationPoint(-45F, -21F, -7F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306 highhood bit
		bodyModel[261].setRotationPoint(-45F, -22F, -1F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307 highhood bit
		bodyModel[262].setRotationPoint(-45F, -22F, -7F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 308 highhood bit
		bodyModel[263].setRotationPoint(-45F, -22F, 1F);

		bodyModel[264].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[264].setRotationPoint(-41F, -24.5F, 1F);

		bodyModel[265].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[265].setRotationPoint(-40F, -24.25F, 2F);

		bodyModel[266].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[266].setRotationPoint(-40.5F, -24.25F, 0F);

		bodyModel[267].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[267].setRotationPoint(-38.5F, -23.5F, 1F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker highhood bit
		bodyModel[268].setRotationPoint(-44.8F, -20.5F, -7F);
		bodyModel[268].rotateAngleY = 0.05235988F;

		bodyModel[269].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker highhood bit
		bodyModel[269].setRotationPoint(-44.8F, -20.5F, 7F);
		bodyModel[269].rotateAngleY = -0.05235988F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402 highhood bit sandcap
		bodyModel[270].setRotationPoint(-44.75F, -22.5F, -1F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F); // Box 388 numberboard highhood bit
		bodyModel[271].setRotationPoint(-45.3F, -18F, 1.25F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 389 numberboard highhood bit
		bodyModel[272].setRotationPoint(-45.3F, -18F, -6.25F);

		bodyModel[273].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[273].setRotationPoint(-40F, -24.5F, -1.5F);

		bodyModel[274].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[274].setRotationPoint(-39F, -24.5F, -0.5F);

		bodyModel[275].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[275].setRotationPoint(-40F, -24.5F, 0.5F);

		bodyModel[276].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[276].setRotationPoint(-38.5F, -23.5F, -0.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[277].setRotationPoint(-36F, -23.5F, 7.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[278].setRotationPoint(-36F, -23.5F, 7.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[279].setRotationPoint(-36F, -23.5F, 7.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[280].setRotationPoint(-36F, -23.5F, 7.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[281].setRotationPoint(-36.5F, -22F, 7F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[282].setRotationPoint(-36F, -23F, 7.5F);

		bodyModel[283].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[283].setRotationPoint(-36.5F, -24F, -4F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[284].setRotationPoint(-29F, -24.5F, -1F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[285].setRotationPoint(-29F, -24.5F, -1F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[286].setRotationPoint(-29F, -24.5F, -1F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[287].setRotationPoint(-29F, -24.5F, -1F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[288].setRotationPoint(-29F, -24F, -1F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 364 prime base
		bodyModel[289].setRotationPoint(-38.5F, -23.5F, -1F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[290].setRotationPoint(-38.5F, -24.5F, -1F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[291].setRotationPoint(-38.5F, -24.5F, -1F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[292].setRotationPoint(-38.5F, -24.5F, -1F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[293].setRotationPoint(-38.5F, -24.5F, -1F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F); // Box 331 why dont you ALSO filter some biiiitchhheesssssssss
		bodyModel[294].setRotationPoint(13.75F, 0.5F, 8.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F); // Box 332 why dont you additonally filter some bitches on you dick
		bodyModel[295].setRotationPoint(-15.5F, 0.5F, 8.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 401 sp emergency gyra
		bodyModel[296].setRotationPoint(-40.1F, -25.5F, -1F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 400 sp E gyra box
		bodyModel[297].setRotationPoint(-40F, -25.5F, -1F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 335
		bodyModel[298].setRotationPoint(-38F, -25F, -0.5F);

		bodyModel[299].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 36 electrical locker
		bodyModel[299].setRotationPoint(-25F, -10F, -11F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302 early mu plug area
		bodyModel[300].setRotationPoint(-49F, -2F, -8F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303 early mu plug area
		bodyModel[301].setRotationPoint(-49F, -2F, 2F);

		bodyModel[302].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 279 early mu plug area
		bodyModel[302].setRotationPoint(-49F, -2F, -2F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[303].setRotationPoint(-49F, -2F, -5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[304].setRotationPoint(-49F, -2F, 3F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324 early mu plug area
		bodyModel[305].setRotationPoint(48F, -2F, -8F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 327 early mu plug area
		bodyModel[306].setRotationPoint(48F, -2F, 2F);

		bodyModel[307].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 280 early mu plug area
		bodyModel[307].setRotationPoint(48F, -2F, -2F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[308].setRotationPoint(48F, -2F, -5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[309].setRotationPoint(48F, -2F, 3F);

		bodyModel[310].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 286
		bodyModel[310].setRotationPoint(42F, -24.5F, 3.5F);

		bodyModel[311].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 287
		bodyModel[311].setRotationPoint(43.5F, -23.75F, 2.5F);

		bodyModel[312].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 288
		bodyModel[312].setRotationPoint(42.5F, -24.5F, 1.5F);

		bodyModel[313].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 289
		bodyModel[313].setRotationPoint(42F, -24.75F, 2.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 352
		bodyModel[314].setRotationPoint(45.5F, -22F, -0.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 353
		bodyModel[315].setRotationPoint(45.75F, -21.5F, -0.25F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[316].setRotationPoint(45.5F, -23F, -0.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 332 bell mount cull
		bodyModel[317].setRotationPoint(44.5F, -23F, -1F);

		bodyModel[318].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 333
		bodyModel[318].setRotationPoint(-25F, -23.25F, 3.5F);

		bodyModel[319].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 334
		bodyModel[319].setRotationPoint(-23.5F, -22.75F, 4.5F);

		bodyModel[320].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 335
		bodyModel[320].setRotationPoint(-24F, -23.75F, 4.5F);

		bodyModel[321].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 336
		bodyModel[321].setRotationPoint(-25F, -23.25F, 5.5F);

		bodyModel[322].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 337
		bodyModel[322].setRotationPoint(-25F, -24F, -1.5F);

		bodyModel[323].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 745
		bodyModel[323].setRotationPoint(-21.5F, -23F, -0.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 746
		bodyModel[324].setRotationPoint(-24F, -24F, -0.5F);

		bodyModel[325].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 747
		bodyModel[325].setRotationPoint(-23F, -23.75F, 0.5F);

		bodyModel[326].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 748
		bodyModel[326].setRotationPoint(-22.5F, -23.75F, -1.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 785
		bodyModel[327].setRotationPoint(-24F, -23F, 0F);

		bodyModel[328].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 786
		bodyModel[328].setRotationPoint(-22.5F, -22.5F, -4.5F);

		bodyModel[329].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 787
		bodyModel[329].setRotationPoint(-23F, -23.25F, -3.5F);

		bodyModel[330].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 788
		bodyModel[330].setRotationPoint(-25F, -23.5F, -4.5F);

		bodyModel[331].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 789
		bodyModel[331].setRotationPoint(-24F, -23.25F, -5.5F);

		bodyModel[332].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[332].setRotationPoint(-34F, -25F, 0F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[333].setRotationPoint(-38F, -24F, -0.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[334].setRotationPoint(-38F, -25.5F, -0.5F);

		bodyModel[335].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 374
		bodyModel[335].setRotationPoint(-31F, -25F, 0F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[336].setRotationPoint(-30F, -24F, 0F);

		bodyModel[337].addBox(0F, 0F, 0F, 3, 2, 12, 0F); // Box 376 bn bababooey
		bodyModel[337].setRotationPoint(-19F, -23F, -6F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[338].setRotationPoint(-16F, -25F, -1F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 404
		bodyModel[339].setRotationPoint(-16F, -24F, -1F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		bodyModel[340].setRotationPoint(-15.75F, -23.5F, -0.75F);

		bodyModel[341].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 407 sp bell holder cull
		bodyModel[341].setRotationPoint(-16F, -25F, -2F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[342].setRotationPoint(-19F, -23.5F, -5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[343].setRotationPoint(-19F, -23.5F, 5F);

		bodyModel[344].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 402 milw egirl
		bodyModel[344].setRotationPoint(-37.5F, -24.5F, -0.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0.25F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0.25F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0.25F, 0.15F); // Box 0 milw egirl
		bodyModel[345].setRotationPoint(-38.5F, -24.5F, -1.25F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0.15F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.15F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0.25F, 0.25F); // Box 213 milw egirl
		bodyModel[346].setRotationPoint(-38.5F, -24.5F, 0.25F);

		bodyModel[347].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 3868 bn egirl
		bodyModel[347].setRotationPoint(-37.5F, -24.5F, 2.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0.25F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0.25F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0.25F, 0.15F); // Box 3878 bn egirl
		bodyModel[348].setRotationPoint(-38.5F, -24.5F, 1.75F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0.15F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.15F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0.25F, 0.25F); // Box 388 bn egirl
		bodyModel[349].setRotationPoint(-38.5F, -24.5F, 3.25F);

		bodyModel[350].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 253
		bodyModel[350].setRotationPoint(-40F, 0F, 9F);
		bodyModel[350].rotateAngleZ = -0.15707963F;

		bodyModel[351].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 390
		bodyModel[351].setRotationPoint(-42.5F, 0.5F, 11.01F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[352].setRotationPoint(-35F, -18F, 10F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[353].setRotationPoint(-35F, -19F, 10F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 cull aww
		bodyModel[354].setRotationPoint(-35F, -18F, -15F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[355].setRotationPoint(-35F, -19F, -13F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 12, 24, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -12F, -0.5F, -6F, -12F); // Box 106 cab backbox
		bodyModel[356].setRotationPoint(-28.5F, -22F, -6F);

		bodyModel[357].addBox(0F, 0F, 0F, 2, 8, 3, 0F); // Box 530 fridge?
		bodyModel[357].setRotationPoint(-29F, -14F, -5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[358].setRotationPoint(-31.8F, -16F, 1F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[359].setRotationPoint(-38.5F, -14F, 3F);
		bodyModel[359].rotateAngleY = -0.45378561F;

		bodyModel[360].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[360].setRotationPoint(-38.5F, -16F, 3F);
		bodyModel[360].rotateAngleY = -0.45378561F;

		bodyModel[361].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[361].setRotationPoint(-38.5F, -10F, 3F);
		bodyModel[361].rotateAngleY = -0.45378561F;

		bodyModel[362].addShapeBox(0F, 0F, -2F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[362].setRotationPoint(-38F, -19F, 7.5F);//6.5
		//bodyModel[362].rotateAngleY = 0.17453293F;

		bodyModel[363].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[363].setRotationPoint(-30F, -23F, -7F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[364].setRotationPoint(-25F, -19.25F, -9F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[365].setRotationPoint(-25F, -20.25F, -9F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[366].setRotationPoint(-24.75F, -18.75F, -8.75F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[367].setRotationPoint(-25F, -21.25F, -8.8F);

		bodyModel[368].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 364 prime base
		bodyModel[368].setRotationPoint(-38F, -23.5F, -8F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[369].setRotationPoint(-38F, -24.5F, -8F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[370].setRotationPoint(-38F, -24.5F, -8F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[371].setRotationPoint(-38F, -24.5F, -8F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[372].setRotationPoint(-38F, -24.5F, -8F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull atsf bit
		bodyModel[373].setRotationPoint(-38F, -22.5F, -8.5F);

		bodyModel[374].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 418 cull platform atsf
		bodyModel[374].setRotationPoint(-31.1F, -24F, -2.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[375].setRotationPoint(-30.1F, -25F, 0F);

		bodyModel[376].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[376].setRotationPoint(11F, 1F, 8.5F);

		bodyModel[377].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 417
		bodyModel[377].setRotationPoint(0.5F, -22.5F, -0.5F);

		bodyModel[378].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 418
		bodyModel[378].setRotationPoint(-2F, -23.5F, -0.5F);

		bodyModel[379].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[379].setRotationPoint(-0.5F, -23.25F, -1.5F);

		bodyModel[380].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 420
		bodyModel[380].setRotationPoint(-1F, -23.25F, 0.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 33, 14, 16, 0F,0F, 0F, -0.2F, -17F, 0F, -0.2F, -17F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -7F, -0.2F, -17F, -7F, -0.2F, -17F, -7F, -0.2F, 0F, -7F, -0.2F); // Box 428 early radiators cull
		bodyModel[381].setRotationPoint(27F, -15F, -8F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 13, 13, 14, 0F,0F, 0F, 0.05F, -6.5F, 0F, 0.05F, -6.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -6.5F, 0.05F, -6.5F, -6.5F, 0.05F, -6.5F, -6.5F, 0.05F, 0F, -6.5F, 0.05F); // Box 350 early intakes cull
		bodyModel[382].setRotationPoint(-18.5F, -20F, -7F);

		bodyModel[383].addBox(0F, 0F, 0F, 0, 18, 22, 0F); // Box 410
		bodyModel[383].setRotationPoint(-48.01F, -10F, -11F);

		bodyModel[384].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 411
		bodyModel[384].setRotationPoint(45F, 8F, -11F);

		bodyModel[385].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[385].setRotationPoint(45F, 6F, -9F);

		bodyModel[386].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 413
		bodyModel[386].setRotationPoint(45F, 5.5F, -10.25F);

		bodyModel[387].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 414
		bodyModel[387].setRotationPoint(45F, 4.5F, -8.25F);

		bodyModel[388].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 415
		bodyModel[388].setRotationPoint(45F, 3F, -9.5F);

		bodyModel[389].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 416
		bodyModel[389].setRotationPoint(45F, 2F, -7.5F);

		bodyModel[390].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 417
		bodyModel[390].setRotationPoint(45F, 0.5F, -9F);

		bodyModel[391].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 418
		bodyModel[391].setRotationPoint(45F, -2F, -8F);

		bodyModel[392].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 419
		bodyModel[392].setRotationPoint(45F, 8F, 9F);

		bodyModel[393].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 420
		bodyModel[393].setRotationPoint(45F, 6F, 9F);

		bodyModel[394].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 421
		bodyModel[394].setRotationPoint(45F, 5.5F, 8.25F);

		bodyModel[395].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 422
		bodyModel[395].setRotationPoint(45F, 4.5F, 8.25F);

		bodyModel[396].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 423
		bodyModel[396].setRotationPoint(45F, 3F, 7.5F);

		bodyModel[397].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 424
		bodyModel[397].setRotationPoint(45F, 2F, 7.5F);

		bodyModel[398].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 425
		bodyModel[398].setRotationPoint(45F, 0.5F, 7F);

		bodyModel[399].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 426
		bodyModel[399].setRotationPoint(45F, -2F, 7F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[400].setRotationPoint(-33F, -24F, -0.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[401].setRotationPoint(-33F, -25F, -0.5F);

		bodyModel[402].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 433
		bodyModel[402].setRotationPoint(-8F, 1.25F, -11F);
		bodyModel[402].rotateAngleX = 1.25663706F;

		bodyModel[403].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 434
		bodyModel[403].setRotationPoint(-8F, 1.25F, 11F);
		bodyModel[403].rotateAngleX = -1.25663706F;

		bodyModel[404].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 435
		bodyModel[404].setRotationPoint(9F, 1.25F, -11F);
		bodyModel[404].rotateAngleX = 1.25663706F;

		bodyModel[405].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 436
		bodyModel[405].setRotationPoint(9F, 1.25F, 11F);
		bodyModel[405].rotateAngleX = -1.25663706F;

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 13, 14, 0F,-0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, -6.5F, 0.05F, 0F, -6.5F, 0.05F, 0F, -6.5F, 0.05F, -0.5F, -6.5F, 0.05F); // Box 437 early intakes filler fakebox
		bodyModel[406].setRotationPoint(-19.5F, -20F, -7F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[407].setRotationPoint(-30F, -23F, 7F);

		bodyModel[408].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 439
		bodyModel[408].setRotationPoint(-39.5F, -25F, 0F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[409].setRotationPoint(47F, -5F, -6.75F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[410].setRotationPoint(48F, -2F, -6.75F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[411].setRotationPoint(47.75F, -5F, -6.75F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 ditchlight r2
		bodyModel[412].setRotationPoint(48.25F, -2F, -6.75F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[413].setRotationPoint(48F, -2F, 4.75F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r2
		bodyModel[414].setRotationPoint(48.25F, -2F, 4.75F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[415].setRotationPoint(47F, -5F, 4.75F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[416].setRotationPoint(47.75F, -5F, 4.75F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[417].setRotationPoint(-48F, -5F, -6.75F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[418].setRotationPoint(-48.5F, -2F, -6.75F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[419].setRotationPoint(-48.25F, -5F, -6.75F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f2
		bodyModel[420].setRotationPoint(-48.75F, -2F, -6.75F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[421].setRotationPoint(-48.5F, -2F, 4.75F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f2
		bodyModel[422].setRotationPoint(-48.75F, -2F, 4.75F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[423].setRotationPoint(-48.25F, -5F, 4.75F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[424].setRotationPoint(-48F, -5F, 4.75F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 22, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456 soop line tiny fuel tank
		bodyModel[425].setRotationPoint(-11F, 5F, -11F);

		bodyModel[426].addBox(0F, 0F, 0F, 22, 3, 16, 0F); // Box 457 soop line tiny fuel tank
		bodyModel[426].setRotationPoint(-11F, 5F, -8F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 22, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 458 soop line tiny fuel tank
		bodyModel[427].setRotationPoint(-11F, 5F, 8F);

		bodyModel[428].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 292
		bodyModel[428].setRotationPoint(-40.5F, -22.75F, 7.5F);

		bodyModel[429].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 293
		bodyModel[429].setRotationPoint(-39.5F, -22F, 8.5F);

		bodyModel[430].addShapeBox(0F, 0F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 294
		bodyModel[430].setRotationPoint(-38.55F, -20F, 10F);
		bodyModel[430].rotateAngleX = -0.64577182F;

		bodyModel[431].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 295
		bodyModel[431].setRotationPoint(-39.5F, -21.25F, 9.5F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 339 cull pw beacon holdy
		bodyModel[432].setRotationPoint(-33F, -22F, 7F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 cull pw beacon holdy
		bodyModel[433].setRotationPoint(-33F, -22F, -9F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon pw
		bodyModel[434].setRotationPoint(-33F, -23.75F, -8.5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 342 commander beacon pw
		bodyModel[435].setRotationPoint(-33F, -23.75F, 7.5F);

		bodyModel[436].addBox(0F, 0F, 0F, 0, 4, 9, 0F); // Box 440 honse
		bodyModel[436].setRotationPoint(-48.25F, -1F, -4.5F);
		bodyModel[436].rotateAngleZ = -0.31415927F;

		bodyModel[437].addBox(0F, 0F, 0F, 0, 4, 9, 0F); // Box 468 honse
		bodyModel[437].setRotationPoint(-49F, -1F, -4.5F);
		bodyModel[437].rotateAngleZ = -0.31415927F;

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 354 cnw bELL
		bodyModel[438].setRotationPoint(-43.5F, -5F, 8F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 403 cnw step cull thing
		bodyModel[439].setRotationPoint(-44F, -6F, 7F);
	}

	ModelFB3_new theTrucc = new ModelFB3_new();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 6||GetColor(entity) == 1544) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb3_new_earliie_silvers.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.775, 0.0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.775, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 8) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb3_new_earliie_sothernpacicics.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.775, 0.0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.775, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 21 ||GetColor(entity) == 22 ||GetColor(entity) == 24){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb3_new_csxandmpblu.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.775, 0.0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.775, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 24 ||GetColor(entity) == 22 ) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb3_new_earliie_silvers.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.775, 0.0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.775, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb3_earlis_blacc.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.775, 0.0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.775, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}
}