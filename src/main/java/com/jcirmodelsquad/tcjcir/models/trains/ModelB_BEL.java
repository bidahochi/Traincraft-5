//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: B-BEL
// Model Creator: bida
// Created on: 25.10.2023 - 07:39:18
// Last changed on: 25.10.2023 - 07:39:18

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFB2_new;
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
import train.common.api.Locomotive;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelB_BEL extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelB_BEL() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[348];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 247, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 99, 114, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[3] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[5] = new ModelRendererTurbo(this, 155, 133, textureX, textureY); // Box 63
		bodyModel[6] = new ModelRendererTurbo(this, 269, 82, textureX, textureY); // Box 156
		bodyModel[7] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[8] = new ModelRendererTurbo(this, 82, 132, textureX, textureY); // Box 196
		bodyModel[9] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[10] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[11] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[12] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[13] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[14] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[15] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[16] = new ModelRendererTurbo(this, 101, 105, textureX, textureY); // box65
		bodyModel[17] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[18] = new ModelRendererTurbo(this, 433, 128, textureX, textureY); // Box 218
		bodyModel[19] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[21] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[22] = new ModelRendererTurbo(this, 447, 128, textureX, textureY); // Box 256
		bodyModel[23] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[24] = new ModelRendererTurbo(this, 359, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[25] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[26] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[27] = new ModelRendererTurbo(this, 362, 116, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[28] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[29] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[30] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[31] = new ModelRendererTurbo(this, 77, 120, textureX, textureY); // Box 2603
		bodyModel[32] = new ModelRendererTurbo(this, 84, 132, textureX, textureY); // Box 261
		bodyModel[33] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 263
		bodyModel[34] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[35] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[36] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[37] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[39] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 270434
		bodyModel[40] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[41] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 310 cull fueltank support
		bodyModel[42] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 311 cull fueltank support
		bodyModel[43] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[44] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[45] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[46] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[47] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[48] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[49] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[50] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[51] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[52] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[53] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[54] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[55] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[56] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[57] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[58] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[59] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[60] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[61] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[62] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[63] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[64] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[65] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[66] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[67] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318 ph1 mounting stuff
		bodyModel[68] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 322 ph1 mounting stuff
		bodyModel[69] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 757 ph1 mounting stuff
		bodyModel[70] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 758 ph1 mounting stuff
		bodyModel[71] = new ModelRendererTurbo(this, 256, 128, textureX, textureY); // Box 440 front mounting stuff
		bodyModel[72] = new ModelRendererTurbo(this, 176, 116, textureX, textureY); // Box 631 front mounting stuff
		bodyModel[73] = new ModelRendererTurbo(this, 240, 127, textureX, textureY); // Box 882 front mounting stuff
		bodyModel[74] = new ModelRendererTurbo(this, 240, 127, textureX, textureY); // Box 883 front mounting stuff
		bodyModel[75] = new ModelRendererTurbo(this, 217, 173, textureX, textureY); // Box 630
		bodyModel[76] = new ModelRendererTurbo(this, 315, 117, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[77] = new ModelRendererTurbo(this, 255, 64, textureX, textureY); // Box 251
		bodyModel[78] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[79] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[80] = new ModelRendererTurbo(this, 1, 139, textureX, textureY); // Box 32
		bodyModel[81] = new ModelRendererTurbo(this, 12, 136, textureX, textureY); // Box 33
		bodyModel[82] = new ModelRendererTurbo(this, 85, 54, textureX, textureY); // Box 298
		bodyModel[83] = new ModelRendererTurbo(this, 41, 101, textureX, textureY); // Box 302
		bodyModel[84] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 303
		bodyModel[85] = new ModelRendererTurbo(this, 34, 105, textureX, textureY); // Box 304
		bodyModel[86] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[87] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[88] = new ModelRendererTurbo(this, 7, 136, textureX, textureY); // Box 688
		bodyModel[89] = new ModelRendererTurbo(this, 1, 130, textureX, textureY); // Box 37
		bodyModel[90] = new ModelRendererTurbo(this, 14, 130, textureX, textureY); // Box 38
		bodyModel[91] = new ModelRendererTurbo(this, 7, 127, textureX, textureY); // Box 557
		bodyModel[92] = new ModelRendererTurbo(this, 12, 127, textureX, textureY); // Box 558
		bodyModel[93] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 185
		bodyModel[94] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "lamp"); // Box 247 Headlight Front nose R
		bodyModel[95] = new ModelRendererTurbo(this, 12, 81, textureX, textureY, "lamp"); // Box 248 Headlight Front nose L
		bodyModel[96] = new ModelRendererTurbo(this, 78, 55, textureX, textureY); // Box 299
		bodyModel[97] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 300
		bodyModel[98] = new ModelRendererTurbo(this, 70, 59, textureX, textureY); // Box 301
		bodyModel[99] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[100] = new ModelRendererTurbo(this, 28, 101, textureX, textureY); // Box 316
		bodyModel[101] = new ModelRendererTurbo(this, 40, 100, textureX, textureY); // Box 317
		bodyModel[102] = new ModelRendererTurbo(this, 28, 100, textureX, textureY); // Box 318
		bodyModel[103] = new ModelRendererTurbo(this, 42, 101, textureX, textureY); // Box 319
		bodyModel[104] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 7
		bodyModel[105] = new ModelRendererTurbo(this, 31, 9, textureX, textureY); // Box 24
		bodyModel[106] = new ModelRendererTurbo(this, 10, 7, textureX, textureY); // Box 28
		bodyModel[107] = new ModelRendererTurbo(this, 52, 7, textureX, textureY); // Box 30
		bodyModel[108] = new ModelRendererTurbo(this, 59, 43, textureX, textureY); // Box 67
		bodyModel[109] = new ModelRendererTurbo(this, 30, 43, textureX, textureY); // Box 68
		bodyModel[110] = new ModelRendererTurbo(this, 77, 25, textureX, textureY); // Box 106
		bodyModel[111] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 107
		bodyModel[112] = new ModelRendererTurbo(this, 109, 9, textureX, textureY); // Box 160
		bodyModel[113] = new ModelRendererTurbo(this, 35, 45, textureX, textureY); // Box 161
		bodyModel[114] = new ModelRendererTurbo(this, 90, 45, textureX, textureY); // Box 162
		bodyModel[115] = new ModelRendererTurbo(this, 50, 45, textureX, textureY); // Box 163
		bodyModel[116] = new ModelRendererTurbo(this, 75, 45, textureX, textureY); // Box 164
		bodyModel[117] = new ModelRendererTurbo(this, 99, 43, textureX, textureY); // Box 166
		bodyModel[118] = new ModelRendererTurbo(this, 70, 43, textureX, textureY); // Box 168
		bodyModel[119] = new ModelRendererTurbo(this, 109, 21, textureX, textureY); // Box 169
		bodyModel[120] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 309
		bodyModel[121] = new ModelRendererTurbo(this, 98, 6, textureX, textureY); // Box 52 door swing right
		bodyModel[122] = new ModelRendererTurbo(this, 56, 6, textureX, textureY); // Box 314 door swing right
		bodyModel[123] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 123
		bodyModel[124] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 350
		bodyModel[125] = new ModelRendererTurbo(this, 98, 24, textureX, textureY); // Box 321
		bodyModel[126] = new ModelRendererTurbo(this, 34, 5, textureX, textureY); // Box 311
		bodyModel[127] = new ModelRendererTurbo(this, 110, 3, textureX, textureY); // Box 165
		bodyModel[128] = new ModelRendererTurbo(this, 110, 29, textureX, textureY); // Box 167
		bodyModel[129] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 48
		bodyModel[130] = new ModelRendererTurbo(this, 1, 47, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[131] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[132] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[133] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[134] = new ModelRendererTurbo(this, 21, 39, textureX, textureY); // Box 43
		bodyModel[135] = new ModelRendererTurbo(this, 7, 39, textureX, textureY); // Box 175
		bodyModel[136] = new ModelRendererTurbo(this, 274, 2, textureX, textureY); // Box 6
		bodyModel[137] = new ModelRendererTurbo(this, 201, 16, textureX, textureY); // Box 292
		bodyModel[138] = new ModelRendererTurbo(this, 201, 2, textureX, textureY); // Box 293
		bodyModel[139] = new ModelRendererTurbo(this, 199, 8, textureX, textureY); // Box 294
		bodyModel[140] = new ModelRendererTurbo(this, 464, 116, textureX, textureY); // Box 148
		bodyModel[141] = new ModelRendererTurbo(this, 471, 111, textureX, textureY); // Box 149
		bodyModel[142] = new ModelRendererTurbo(this, 447, 111, textureX, textureY); // Box 150
		bodyModel[143] = new ModelRendererTurbo(this, 438, 2, textureX, textureY); // Box 283
		bodyModel[144] = new ModelRendererTurbo(this, 419, 2, textureX, textureY); // Box 284
		bodyModel[145] = new ModelRendererTurbo(this, 256, 115, textureX, textureY); // Box 182 ph2 mounting stuff
		bodyModel[146] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 183 ph2 mounting stuff
		bodyModel[147] = new ModelRendererTurbo(this, 176, 140, textureX, textureY); // Box 184 ph2 mounting stuff
		bodyModel[148] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 185 ph2 mounting stuff
		bodyModel[149] = new ModelRendererTurbo(this, 8, 62, textureX, textureY); // Box 133
		bodyModel[150] = new ModelRendererTurbo(this, 8, 58, textureX, textureY); // Box 187
		bodyModel[151] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[152] = new ModelRendererTurbo(this, 144, 38, textureX, textureY); // Box 566
		bodyModel[153] = new ModelRendererTurbo(this, 144, 35, textureX, textureY); // Box 565
		bodyModel[154] = new ModelRendererTurbo(this, 144, 32, textureX, textureY); // Box 564
		bodyModel[155] = new ModelRendererTurbo(this, 142, 27, textureX, textureY, "cull"); // Box 561 cull bell holder
		bodyModel[156] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 284 Headlight Rear down early
		bodyModel[157] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 285 Headlight Rear up early
		bodyModel[158] = new ModelRendererTurbo(this, 461, 104, textureX, textureY); // Box 288 rear gyralight mount
		bodyModel[159] = new ModelRendererTurbo(this, 454, 102, textureX, textureY, "lamp"); // Box 289 gyralight rear l
		bodyModel[160] = new ModelRendererTurbo(this, 474, 102, textureX, textureY, "lamp"); // Box 290 gyralight rear r
		bodyModel[161] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 165 numberboard early
		bodyModel[162] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 167 numberboard early
		bodyModel[163] = new ModelRendererTurbo(this, 474, 92, textureX, textureY); // Box 215 numberboard late HOLDER
		bodyModel[164] = new ModelRendererTurbo(this, 474, 92, textureX, textureY); // Box 216 numberboard late HOLDER
		bodyModel[165] = new ModelRendererTurbo(this, 487, 100, textureX, textureY, "lamp"); // Box 284 Headlight Rear down late
		bodyModel[166] = new ModelRendererTurbo(this, 487, 100, textureX, textureY, "lamp"); // Box 285 Headlight Rear up late
		bodyModel[167] = new ModelRendererTurbo(this, 487, 93, textureX, textureY); // Box 219 late headlight plate
		bodyModel[168] = new ModelRendererTurbo(this, 113, 36, textureX, textureY); // Box 355 brakewheel
		bodyModel[169] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 277
		bodyModel[170] = new ModelRendererTurbo(this, 484, 53, textureX, textureY); // Box 230 smol low radiator 2
		bodyModel[171] = new ModelRendererTurbo(this, 484, 60, textureX, textureY); // Box 233 smol low radiator 2
		bodyModel[172] = new ModelRendererTurbo(this, 499, 91, textureX, textureY, "lamp"); // Box 215 numberboard late
		bodyModel[173] = new ModelRendererTurbo(this, 499, 91, textureX, textureY, "lamp"); // Box 216 numberboard late
		bodyModel[174] = new ModelRendererTurbo(this, 460, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[175] = new ModelRendererTurbo(this, 98, 145, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[176] = new ModelRendererTurbo(this, 499, 140, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[177] = new ModelRendererTurbo(this, 499, 140, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[178] = new ModelRendererTurbo(this, 210, 32, textureX, textureY); // Box 286
		bodyModel[179] = new ModelRendererTurbo(this, 219, 35, textureX, textureY); // Box 287
		bodyModel[180] = new ModelRendererTurbo(this, 210, 38, textureX, textureY); // Box 288
		bodyModel[181] = new ModelRendererTurbo(this, 208, 35, textureX, textureY); // Box 289
		bodyModel[182] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[183] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[184] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[185] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[186] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[187] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[188] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[189] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[190] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[191] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[192] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[193] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[194] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[195] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[196] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[197] = new ModelRendererTurbo(this, 89, 170, textureX, textureY); // Box 734
		bodyModel[198] = new ModelRendererTurbo(this, 127, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[199] = new ModelRendererTurbo(this, 105, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[200] = new ModelRendererTurbo(this, 413, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[201] = new ModelRendererTurbo(this, 424, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[202] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[203] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[204] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[205] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[206] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418
		bodyModel[207] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419
		bodyModel[208] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420
		bodyModel[209] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421
		bodyModel[210] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 61
		bodyModel[211] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 63
		bodyModel[212] = new ModelRendererTurbo(this, 103, 109, textureX, textureY); // Box 80
		bodyModel[213] = new ModelRendererTurbo(this, 487, 139, textureX, textureY); // Box 259
		bodyModel[214] = new ModelRendererTurbo(this, 451, 123, textureX, textureY); // Box 267
		bodyModel[215] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 269
		bodyModel[216] = new ModelRendererTurbo(this, 136, 124, textureX, textureY); // Box 298
		bodyModel[217] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 299
		bodyModel[218] = new ModelRendererTurbo(this, 448, 138, textureX, textureY); // Box 300
		bodyModel[219] = new ModelRendererTurbo(this, 484, 138, textureX, textureY); // Box 301
		bodyModel[220] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[221] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[222] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[223] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[224] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[225] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[226] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[227] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[228] = new ModelRendererTurbo(this, 151, 14, textureX, textureY); // Box 184 o2 generator
		bodyModel[229] = new ModelRendererTurbo(this, 136, 66, textureX, textureY, "cull"); // Box 418 cull platform atsf
		bodyModel[230] = new ModelRendererTurbo(this, 178, 65, textureX, textureY, "cull"); // Box 419 cull atsf bit
		bodyModel[231] = new ModelRendererTurbo(this, 181, 63, textureX, textureY); // Box 425
		bodyModel[232] = new ModelRendererTurbo(this, 156, 68, textureX, textureY); // Box 308
		bodyModel[233] = new ModelRendererTurbo(this, 63, 6, textureX, textureY); // Box 309 cab roof vent
		bodyModel[234] = new ModelRendererTurbo(this, 145, 84, textureX, textureY); // Box 310
		bodyModel[235] = new ModelRendererTurbo(this, 145, 82, textureX, textureY); // Box 311
		bodyModel[236] = new ModelRendererTurbo(this, 145, 82, textureX, textureY); // Box 312
		bodyModel[237] = new ModelRendererTurbo(this, 145, 84, textureX, textureY); // Box 313
		bodyModel[238] = new ModelRendererTurbo(this, 148, 12, textureX, textureY); // Box 364 prime base
		bodyModel[239] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "prime1"); // Box 6 PRIME2-1
		bodyModel[240] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "prime3"); // Box 7 PRIME2-3
		bodyModel[241] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "prime2"); // Box 8 PRIME2-2
		bodyModel[242] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "prime4"); // Box 9 PRIME2-4
		bodyModel[243] = new ModelRendererTurbo(this, 146, 16, textureX, textureY, "cull"); // Box 330 cull sp beacon holder
		bodyModel[244] = new ModelRendererTurbo(this, 156, 65, textureX, textureY); // Box 279
		bodyModel[245] = new ModelRendererTurbo(this, 182, 8, textureX, textureY); // Box 409 commander base
		bodyModel[246] = new ModelRendererTurbo(this, 182, 4, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[247] = new ModelRendererTurbo(this, 152, 42, textureX, textureY); // Box 427
		bodyModel[248] = new ModelRendererTurbo(this, 152, 45, textureX, textureY); // Box 428
		bodyModel[249] = new ModelRendererTurbo(this, 152, 48, textureX, textureY); // Box 429
		bodyModel[250] = new ModelRendererTurbo(this, 161, 45, textureX, textureY); // Box 430
		bodyModel[251] = new ModelRendererTurbo(this, 16, 55, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[252] = new ModelRendererTurbo(this, 16, 50, textureX, textureY); // Box 5
		bodyModel[253] = new ModelRendererTurbo(this, 206, 100, textureX, textureY); // Box 355 special sus box
		bodyModel[254] = new ModelRendererTurbo(this, 174, 29, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[255] = new ModelRendererTurbo(this, 155, 29, textureX, textureY, "cull"); // Box 562 cull ptc antenna shiz
		bodyModel[256] = new ModelRendererTurbo(this, 178, 27, textureX, textureY); // Box 563
		bodyModel[257] = new ModelRendererTurbo(this, 159, 27, textureX, textureY); // Box 564
		bodyModel[258] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime1"); // Box 6 PRIME3-1
		bodyModel[259] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime3"); // Box 7 PRIME3-3
		bodyModel[260] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime2"); // Box 8 PRIME3-2
		bodyModel[261] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime4"); // Box 9 PRIME3-4
		bodyModel[262] = new ModelRendererTurbo(this, 161, 56, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[263] = new ModelRendererTurbo(this, 151, 59, textureX, textureY); // Box 428 prime base
		bodyModel[264] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[265] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "ditch"); // Box 190 ditchlight f1
		bodyModel[266] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "ditch"); // Box 446 ditchlight f1
		bodyModel[267] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[268] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 281
		bodyModel[269] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "ditch"); // Box 276 ditchlight r1
		bodyModel[270] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[271] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "ditch"); // Box 443 ditchlight r1
		bodyModel[272] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 114
		bodyModel[273] = new ModelRendererTurbo(this, 191, 6, textureX, textureY); // Box 74
		bodyModel[274] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 78
		bodyModel[275] = new ModelRendererTurbo(this, 190, 1, textureX, textureY); // Box 245
		bodyModel[276] = new ModelRendererTurbo(this, 162, 108, textureX, textureY); // Box 250
		bodyModel[277] = new ModelRendererTurbo(this, 162, 99, textureX, textureY); // Box 410
		bodyModel[278] = new ModelRendererTurbo(this, 92, 117, textureX, textureY); // Box 406
		bodyModel[279] = new ModelRendererTurbo(this, 97, 125, textureX, textureY); // Box 407
		bodyModel[280] = new ModelRendererTurbo(this, 139, 125, textureX, textureY); // Box 293
		bodyModel[281] = new ModelRendererTurbo(this, 142, 117, textureX, textureY); // Box 294
		bodyModel[282] = new ModelRendererTurbo(this, 155, 101, textureX, textureY); // Box 399
		bodyModel[283] = new ModelRendererTurbo(this, 155, 110, textureX, textureY); // Box 400
		bodyModel[284] = new ModelRendererTurbo(this, 156, 79, textureX, textureY); // Box 285
		bodyModel[285] = new ModelRendererTurbo(this, 178, 81, textureX, textureY); // Box 288
		bodyModel[286] = new ModelRendererTurbo(this, 156, 90, textureX, textureY); // Box 300
		bodyModel[287] = new ModelRendererTurbo(this, 178, 90, textureX, textureY); // Box 303
		bodyModel[288] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[289] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[290] = new ModelRendererTurbo(this, 442, 109, textureX, textureY); // Box 296
		bodyModel[291] = new ModelRendererTurbo(this, 444, 124, textureX, textureY); // Box 280
		bodyModel[292] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[293] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[294] = new ModelRendererTurbo(this, 155, 99, textureX, textureY); // Box 411
		bodyModel[295] = new ModelRendererTurbo(this, 155, 108, textureX, textureY); // Box 412
		bodyModel[296] = new ModelRendererTurbo(this, 94, 34, textureX, textureY, "cull"); // Box 339 cull ccrcl beacon holdy
		bodyModel[297] = new ModelRendererTurbo(this, 101, 34, textureX, textureY, "cull"); // Box 340 cull ccrcl beacon holdy
		bodyModel[298] = new ModelRendererTurbo(this, 102, 30, textureX, textureY, "commander"); // Box 410 commander beacon ccrcl
		bodyModel[299] = new ModelRendererTurbo(this, 95, 30, textureX, textureY, "commander"); // Box 342 commander beacon ccrcl
		bodyModel[300] = new ModelRendererTurbo(this, 30, 197, textureX, textureY); // Box 412 cs
		bodyModel[301] = new ModelRendererTurbo(this, 42, 197, textureX, textureY); // Box 413 cs
		bodyModel[302] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86 cs
		bodyModel[303] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // Box 531 cs
		bodyModel[304] = new ModelRendererTurbo(this, 55, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[305] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[306] = new ModelRendererTurbo(this, 210, 126, textureX, textureY); // Box 280
		bodyModel[307] = new ModelRendererTurbo(this, 67, 186, textureX, textureY); // Box 429 backwall
		bodyModel[308] = new ModelRendererTurbo(this, 90, 192, textureX, textureY, "cull"); // Box 430 backwall cull bit
		bodyModel[309] = new ModelRendererTurbo(this, 101, 186, textureX, textureY); // Box 431 backpannel bulgy bit
		bodyModel[310] = new ModelRendererTurbo(this, 492, 140, textureX, textureY, "lamp"); // Box 339 glowey marker 2
		bodyModel[311] = new ModelRendererTurbo(this, 492, 140, textureX, textureY, "lamp"); // Box 340 glowey marker 2
		bodyModel[312] = new ModelRendererTurbo(this, 1, 186, textureX, textureY); // Box 445
		bodyModel[313] = new ModelRendererTurbo(this, 12, 188, textureX, textureY); // Box 446
		bodyModel[314] = new ModelRendererTurbo(this, 182, 72, textureX, textureY); // Box 447 pw antenna
		bodyModel[315] = new ModelRendererTurbo(this, 222, 100, textureX, textureY); // Box 331 sp thing
		bodyModel[316] = new ModelRendererTurbo(this, 255, 87, textureX, textureY); // Box 453
		bodyModel[317] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 454
		bodyModel[318] = new ModelRendererTurbo(this, 220, 10, textureX, textureY); // Box 459
		bodyModel[319] = new ModelRendererTurbo(this, 222, 18, textureX, textureY); // Box 460
		bodyModel[320] = new ModelRendererTurbo(this, 222, 4, textureX, textureY); // Box 461
		bodyModel[321] = new ModelRendererTurbo(this, 239, 18, textureX, textureY); // Box 285
		bodyModel[322] = new ModelRendererTurbo(this, 239, 3, textureX, textureY); // Box 157
		bodyModel[323] = new ModelRendererTurbo(this, 259, 3, textureX, textureY); // Box 278
		bodyModel[324] = new ModelRendererTurbo(this, 269, 5, textureX, textureY); // Box 279
		bodyModel[325] = new ModelRendererTurbo(this, 257, 12, textureX, textureY); // Box 466
		bodyModel[326] = new ModelRendererTurbo(this, 274, 115, textureX, textureY); // Box 467
		bodyModel[327] = new ModelRendererTurbo(this, 125, 138, textureX, textureY, "cull"); // Box 314 cull anticlimber
		bodyModel[328] = new ModelRendererTurbo(this, 148, 144, textureX, textureY, "cull"); // Box 315 cull anticlimber
		bodyModel[329] = new ModelRendererTurbo(this, 146, 148, textureX, textureY); // Box 407
		bodyModel[330] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime1"); // Box 6 PRIME4-1
		bodyModel[331] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime3"); // Box 7 PRIME4-3
		bodyModel[332] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime2"); // Box 8 PRIME4-2
		bodyModel[333] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime4"); // Box 9 PRIME4-4
		bodyModel[334] = new ModelRendererTurbo(this, 174, 59, textureX, textureY); // Box 428 prime base
		bodyModel[335] = new ModelRendererTurbo(this, 502, 101, textureX, textureY, "cull"); // Box 561 cull bell holder
		bodyModel[336] = new ModelRendererTurbo(this, 177, 8, textureX, textureY); // Box 409 commander base
		bodyModel[337] = new ModelRendererTurbo(this, 177, 4, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[338] = new ModelRendererTurbo(this, 491, 138, textureX, textureY); // Box 439 honse
		bodyModel[339] = new ModelRendererTurbo(this, 125, 138, textureX, textureY); // Box 440 honse
		bodyModel[340] = new ModelRendererTurbo(this, 382, 112, textureX, textureY); // Box 340
		bodyModel[341] = new ModelRendererTurbo(this, 382, 132, textureX, textureY); // Box 341
		bodyModel[342] = new ModelRendererTurbo(this, 268, 102, textureX, textureY); // Box 342
		bodyModel[343] = new ModelRendererTurbo(this, 268, 105, textureX, textureY); // Box 343
		bodyModel[344] = new ModelRendererTurbo(this, 28, 220, textureX, textureY); // Box 132
		bodyModel[345] = new ModelRendererTurbo(this, 7, 220, textureX, textureY); // Box 133
		bodyModel[346] = new ModelRendererTurbo(this, 28, 232, textureX, textureY); // Box 132
		bodyModel[347] = new ModelRendererTurbo(this, 7, 232, textureX, textureY); // Box 133

		bodyModel[0].addBox(0F, 0F, 0F, 76, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[1].setRotationPoint(-42.01F, -1F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 8
		bodyModel[2].setRotationPoint(-42F, -1F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[3].setRotationPoint(10F, 4F, -9F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[4].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[5].setRotationPoint(-38F, 2F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 156
		bodyModel[6].setRotationPoint(-38F, 1.5F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[7].setRotationPoint(-39F, -1F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[8].setRotationPoint(-39F, 7F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[9].setRotationPoint(-42F, 8F, 8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[10].setRotationPoint(-39F, 7F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[11].setRotationPoint(-42F, -1F, 7F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[12].setRotationPoint(-42F, 2F, 7F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[13].setRotationPoint(-42F, -1F, -8F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[14].setRotationPoint(-42F, 2F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[15].setRotationPoint(-42F, 8F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[16].setRotationPoint(-42F, 8F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 215
		bodyModel[17].setRotationPoint(38F, -1F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[18].setRotationPoint(38F, 7F, 10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[19].setRotationPoint(38F, 7F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[20].setRotationPoint(42F, 3F, -1.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[21].setRotationPoint(42F, 8F, -9F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[22].setRotationPoint(42.01F, -1F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[23].setRotationPoint(10F, 4F, -9.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[24].setRotationPoint(9F, 1F, 8.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[25].setRotationPoint(7F, 4F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[26].setRotationPoint(7F, 4F, -9.5F);

		bodyModel[27].addBox(-0.5F, -6F, -1F, 1, 6, 1, 0F); // Box 305 pipe cull
		bodyModel[27].setRotationPoint(7.5F, 5.5F, 10.01F);
		bodyModel[27].rotateAngleZ = 0.2268928F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[28].setRotationPoint(8.5F, 2.5F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[29].setRotationPoint(8.5F, 1.5F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[30].setRotationPoint(8.75F, 3F, -9.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[31].setRotationPoint(-38F, 1F, 7F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[32].setRotationPoint(-39F, -1F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 263
		bodyModel[33].setRotationPoint(37F, 1F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[34].setRotationPoint(38F, -1F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[35].setRotationPoint(-42F, 1F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[36].setRotationPoint(37F, 1F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[37].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[38].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 270434
		bodyModel[39].setRotationPoint(37F, 1F, 7F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[40].setRotationPoint(38F, -1F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310 cull fueltank support
		bodyModel[41].setRotationPoint(9F, 3F, -6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 311 cull fueltank support
		bodyModel[42].setRotationPoint(6F, 3F, -6F);

		bodyModel[43].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[43].setRotationPoint(42.01F, 7F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[44].setRotationPoint(-42.01F, 7F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[45].setRotationPoint(-42F, 6F, -8F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[46].setRotationPoint(-42F, 6F, 8F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[47].setRotationPoint(39F, 6F, 8F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[48].setRotationPoint(39F, 6F, -8F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[49].setRotationPoint(39F, 8F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[50].setRotationPoint(39F, 2F, -9F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[51].setRotationPoint(39F, 8F, 8F);

		bodyModel[52].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[52].setRotationPoint(39F, 2F, 7F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[53].setRotationPoint(39F, -1F, 7F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[54].setRotationPoint(-42F, 5F, 8F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[55].setRotationPoint(-42F, 5F, -10F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[56].setRotationPoint(39F, 5F, -10F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[57].setRotationPoint(39F, 5F, 8F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[58].setRotationPoint(39F, 4F, 8F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[59].setRotationPoint(-42F, 4F, 8F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[60].setRotationPoint(-42F, 4F, -8F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[61].setRotationPoint(39F, 4F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[62].setRotationPoint(6F, 5F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[63].setRotationPoint(8F, 5F, -9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[64].setRotationPoint(9F, 5F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[65].setRotationPoint(11F, 5F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 76, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[66].setRotationPoint(-38F, 2.75F, -7.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318 ph1 mounting stuff
		bodyModel[67].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322 ph1 mounting stuff
		bodyModel[68].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757 ph1 mounting stuff
		bodyModel[69].setRotationPoint(23.5F, 2F, 6F);

		bodyModel[70].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758 ph1 mounting stuff
		bodyModel[70].setRotationPoint(22.5F, 2.5F, -2F);

		bodyModel[71].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440 front mounting stuff
		bodyModel[71].setRotationPoint(-26.5F, 2.5F, -2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631 front mounting stuff
		bodyModel[72].setRotationPoint(-26.5F, 1F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882 front mounting stuff
		bodyModel[73].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883 front mounting stuff
		bodyModel[74].setRotationPoint(-25.5F, 2F, 6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 76, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[75].setRotationPoint(-38F, 1F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[76].setRotationPoint(9.25F, 0.75F, 8.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 76, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[77].setRotationPoint(-38F, 1F, -7F);

		bodyModel[78].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[78].setRotationPoint(39F, -1F, -8F);

		bodyModel[79].addBox(0F, 0F, 0F, 25, 4, 22, 0F); // Box 25
		bodyModel[79].setRotationPoint(-36F, -5F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 32
		bodyModel[80].setRotationPoint(-37F, -3F, -10F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 33
		bodyModel[81].setRotationPoint(-37F, -5F, 7F);

		bodyModel[82].addBox(0F, 0F, 0F, 5, 12, 14, 0F); // Box 298
		bodyModel[82].setRotationPoint(-38F, -13F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 302
		bodyModel[83].setRotationPoint(-39F, -13F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[84].setRotationPoint(-39F, -13F, 1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304
		bodyModel[85].setRotationPoint(-39F, -13F, -1F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[86].setRotationPoint(-38.85F, -12.7F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[87].setRotationPoint(-38.85F, -12.7F, 5F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[88].setRotationPoint(-37F, -5F, -11F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[89].setRotationPoint(-11F, -3F, -10F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[90].setRotationPoint(-11F, -3F, 7F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[91].setRotationPoint(-11F, -5F, -11F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[92].setRotationPoint(-11F, -5F, 10F);

		bodyModel[93].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 185
		bodyModel[93].setRotationPoint(-38.75F, -13.75F, -2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front nose R
		bodyModel[94].setRotationPoint(-39.5F, -13.7F, -2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front nose L
		bodyModel[95].setRotationPoint(-39.5F, -13.7F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[96].setRotationPoint(-38F, -14F, -1F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[97].setRotationPoint(-38F, -14F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[98].setRotationPoint(-38F, -14F, 1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[99].setRotationPoint(-37.5F, -14F, -1F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[100].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 317
		bodyModel[101].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[102].setRotationPoint(-37F, -13.75F, 3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[103].setRotationPoint(-37F, -13.75F, 6F);

		bodyModel[104].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 7
		bodyModel[104].setRotationPoint(-32F, -18F, -11F);

		bodyModel[105].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 24
		bodyModel[105].setRotationPoint(-32F, -18F, 10F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 28
		bodyModel[106].setRotationPoint(-21F, -18F, -11F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 30
		bodyModel[107].setRotationPoint(-33F, -18F, -7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[108].setRotationPoint(-33F, -21F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[109].setRotationPoint(-33F, -21F, -11F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 106
		bodyModel[110].setRotationPoint(-21F, -21F, -7F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 107
		bodyModel[111].setRotationPoint(-33F, -21F, -7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[112].setRotationPoint(-32F, -22F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[113].setRotationPoint(-33F, -22F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[114].setRotationPoint(-21F, -22F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[115].setRotationPoint(-33F, -22F, 1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[116].setRotationPoint(-21F, -22F, 1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[117].setRotationPoint(-21F, -21F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[118].setRotationPoint(-21F, -21F, 7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[119].setRotationPoint(-32F, -22F, 1F);

		bodyModel[120].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // Box 309
		bodyModel[120].setRotationPoint(-33F, -22F, -1F);

		bodyModel[121].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 52 door swing right
		bodyModel[121].setRotationPoint(-32.5F, -18F, -10.5F);

		bodyModel[122].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[122].setRotationPoint(-20.5F, -18F, 10.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[123].setRotationPoint(-31F, -18F, -11F);
		bodyModel[123].rotateAngleX = -0.61086524F;

		bodyModel[124].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 350
		bodyModel[124].setRotationPoint(-29F, -16F, -11F);

		bodyModel[125].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[125].setRotationPoint(-29.01F, -16F, 11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[126].setRotationPoint(-31F, -18F, 11F);
		bodyModel[126].rotateAngleX = 0.61086524F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[127].setRotationPoint(-32F, -19F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[128].setRotationPoint(-32F, -19F, 7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 48
		bodyModel[129].setRotationPoint(-34F, -21.75F, -1F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[130].setRotationPoint(-34.25F, -21.75F, -1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[131].setRotationPoint(-34.25F, -19.75F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 117 numberboard
		bodyModel[132].setRotationPoint(-34.1F, -20.75F, -1F);
		bodyModel[132].rotateAngleY = 0.14835299F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[133].setRotationPoint(-34.1F, -20.75F, 1F);
		bodyModel[133].rotateAngleY = -0.14835299F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[134].setRotationPoint(-34F, -20.75F, -6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 175
		bodyModel[135].setRotationPoint(-34F, -20.75F, 1F);

		bodyModel[136].addBox(0F, 0F, 0F, 58, 19, 14, 0F); // Box 6
		bodyModel[136].setRotationPoint(-20F, -20F, -7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[137].setRotationPoint(-20F, -21F, -7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[138].setRotationPoint(-20F, -21F, 3F);

		bodyModel[139].addBox(0F, 0F, 0F, 7, 1, 6, 0F); // Box 294
		bodyModel[139].setRotationPoint(-20F, -21F, -3F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 148
		bodyModel[140].setRotationPoint(38F, -20F, -1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 19, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 149
		bodyModel[141].setRotationPoint(38F, -20F, 1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 19, 7, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[142].setRotationPoint(38F, -20F, -8F);

		bodyModel[143].addBox(0F, 0F, 0F, 8, 19, 1, 0F); // Box 283
		bodyModel[143].setRotationPoint(30F, -20F, -7.75F);

		bodyModel[144].addBox(0F, 0F, 0F, 8, 19, 1, 0F); // Box 284
		bodyModel[144].setRotationPoint(30F, -20F, 6.75F);

		bodyModel[145].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 182 ph2 mounting stuff
		bodyModel[145].setRotationPoint(23.5F, 2.5F, -2F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 183 ph2 mounting stuff
		bodyModel[146].setRotationPoint(24.5F, 2F, 6F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 184 ph2 mounting stuff
		bodyModel[147].setRotationPoint(23.5F, 1F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 185 ph2 mounting stuff
		bodyModel[148].setRotationPoint(24.5F, 2F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[149].setRotationPoint(-34F, -18F, -1F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[150].setRotationPoint(-34F, -22.5F, -1F);

		bodyModel[151].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[151].setRotationPoint(37F, -21.25F, 0F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 566
		bodyModel[152].setRotationPoint(-35.75F, -20F, -0.25F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 565
		bodyModel[153].setRotationPoint(-36F, -20.5F, -0.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[154].setRotationPoint(-36F, -21.5F, -0.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 561 cull bell holder
		bodyModel[155].setRotationPoint(-36F, -21.5F, -1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down early
		bodyModel[156].setRotationPoint(38.1F, -16F, -1F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up early
		bodyModel[157].setRotationPoint(38.1F, -18F, -1F);

		bodyModel[158].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 288 rear gyralight mount
		bodyModel[158].setRotationPoint(38F, -20.25F, -2F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight rear l
		bodyModel[159].setRotationPoint(39.75F, -20.2F, -2F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290 gyralight rear r
		bodyModel[160].setRotationPoint(39.75F, -20.2F, 0F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165 numberboard early
		bodyModel[161].setRotationPoint(38.3F, -18F, -6.25F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 167 numberboard early
		bodyModel[162].setRotationPoint(38.3F, -18F, 1.25F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 215 numberboard late HOLDER
		bodyModel[163].setRotationPoint(38.6F, -18F, -6.25F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 216 numberboard late HOLDER
		bodyModel[164].setRotationPoint(38.6F, -18F, 1.25F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down late
		bodyModel[165].setRotationPoint(38.45F, -16F, -1F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up late
		bodyModel[166].setRotationPoint(38.45F, -18F, -1F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 219 late headlight plate
		bodyModel[167].setRotationPoint(38.2F, -18F, -1F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[168].setRotationPoint(-38F, -13F, 7.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[169].setRotationPoint(-36F, -11F, 6.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 230 smol low radiator 2
		bodyModel[170].setRotationPoint(31F, -6.5F, 7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 233 smol low radiator 2
		bodyModel[171].setRotationPoint(31F, -6.5F, -8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 215 numberboard late
		bodyModel[172].setRotationPoint(38.6F, -18F, -6.25F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F); // Box 216 numberboard late 
		bodyModel[173].setRotationPoint(38.6F, -18F, 1.25F);

		bodyModel[174].addBox(-3F, 0F, 0F, 3, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[174].setRotationPoint(42F, -1F, 2F);
		bodyModel[174].rotateAngleY = -3.14159265F;
		bodyModel[174].rotateAngleZ = -1.48352986F;

		bodyModel[175].addBox(-3F, 0F, 0F, 3, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[175].setRotationPoint(-42F, -1F, -2F);
		bodyModel[175].rotateAngleZ = -1.48352986F;

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[176].setRotationPoint(37.85F, -14F, -7F);
		bodyModel[176].rotateAngleY = -0.05235988F;

		bodyModel[177].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[177].setRotationPoint(37.85F, -14F, 7F);
		bodyModel[177].rotateAngleY = 0.05235988F;

		bodyModel[178].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 286
		bodyModel[178].setRotationPoint(36.5F, -22.25F, 4.5F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 287
		bodyModel[179].setRotationPoint(37F, -21.5F, 3.5F);

		bodyModel[180].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 288
		bodyModel[180].setRotationPoint(37F, -22.25F, 2.5F);

		bodyModel[181].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 289
		bodyModel[181].setRotationPoint(36.5F, -22.5F, 3.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[182].setRotationPoint(-46F, 7F, 0F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[183].setRotationPoint(-46F, 7F, -10F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[184].setRotationPoint(-45F, 6F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[185].setRotationPoint(-45F, 4F, 2F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[186].setRotationPoint(-45F, 6F, -10F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[187].setRotationPoint(-45F, 4F, -10F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[188].setRotationPoint(-45F, 4F, 2F);

		bodyModel[189].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[189].setRotationPoint(-45F, 4F, -8F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[190].setRotationPoint(44F, 6F, 0F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[191].setRotationPoint(44F, 6F, -10F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[192].setRotationPoint(45F, 7F, -10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[193].setRotationPoint(45F, 7F, 0F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[194].setRotationPoint(44F, 5F, 2F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[195].setRotationPoint(44F, 4F, 2F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[196].setRotationPoint(44F, 5F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[197].setRotationPoint(44F, 4F, -8F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[198].setRotationPoint(-42.75F, -1F, -5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[199].setRotationPoint(-42.75F, -1F, 3F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[200].setRotationPoint(41.75F, -1F, -5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[201].setRotationPoint(41.75F, -1F, 3F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[202].setRotationPoint(42F, -1F, -7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[203].setRotationPoint(42F, -1F, 2F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[204].setRotationPoint(-43F, -1F, -7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[205].setRotationPoint(-43F, -1F, 2F);

		bodyModel[206].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 418
		bodyModel[206].setRotationPoint(31.5F, -21F, -7.5F);

		bodyModel[207].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[207].setRotationPoint(30F, -21.75F, -6.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[208].setRotationPoint(29F, -22F, -7.5F);

		bodyModel[209].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[209].setRotationPoint(30.5F, -21.75F, -8.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 61
		bodyModel[210].setRotationPoint(-42F, -1F, 10F);

		bodyModel[211].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 63
		bodyModel[211].setRotationPoint(-42F, -1F, -11F);

		bodyModel[212].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[212].setRotationPoint(-42F, -9F, -8F);

		bodyModel[213].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 259
		bodyModel[213].setRotationPoint(42.01F, -1F, 10F);

		bodyModel[214].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[214].setRotationPoint(42.01F, -9F, -8F);

		bodyModel[215].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 269
		bodyModel[215].setRotationPoint(42.01F, -1F, -11F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[216].setRotationPoint(-42.01F, -9F, -10F);
		bodyModel[216].rotateAngleY = -3.14159265F;

		bodyModel[217].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[217].setRotationPoint(-42.01F, -9F, 11F);
		bodyModel[217].rotateAngleY = -3.14159265F;

		bodyModel[218].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[218].setRotationPoint(42.01F, -9F, -10F);
		bodyModel[218].rotateAngleY = -3.14159265F;

		bodyModel[219].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[219].setRotationPoint(42.01F, -9F, 11F);
		bodyModel[219].rotateAngleY = -3.14159265F;

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[220].setRotationPoint(42F, -1F, -7F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[221].setRotationPoint(42F, -9F, -2F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[222].setRotationPoint(42F, -9F, 2F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[223].setRotationPoint(42F, -1F, 2F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[224].setRotationPoint(-43F, -9F, -2F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[225].setRotationPoint(-43F, -9F, 2F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[226].setRotationPoint(-43F, -1F, -7F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[227].setRotationPoint(-43F, -1F, 2F);

		bodyModel[228].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[228].setRotationPoint(-31.5F, -23.5F, -4F);

		bodyModel[229].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 418 cull platform atsf
		bodyModel[229].setRotationPoint(-26F, -23.5F, -2.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419 cull atsf bit
		bodyModel[230].setRotationPoint(-26F, -22.5F, 3.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[231].setRotationPoint(-26F, -23.5F, 5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[232].setRotationPoint(-25F, -24.5F, 0F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 309 cab roof vent
		bodyModel[233].setRotationPoint(-22F, -21.5F, -5F);
		bodyModel[233].rotateAngleX = 0.15707963F;

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 310
		bodyModel[234].setRotationPoint(-40F, -1F, -9F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 311
		bodyModel[235].setRotationPoint(-40F, -1F, 8F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 312
		bodyModel[236].setRotationPoint(39F, -1F, 8F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[237].setRotationPoint(39F, -1F, -9F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[238].setRotationPoint(-34F, -24F, -1F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[239].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[240].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[241].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[242].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 330 cull sp beacon holder
		bodyModel[243].setRotationPoint(-34F, -23F, -1.5F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[244].setRotationPoint(-28F, -24F, 0F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[245].setRotationPoint(-29.5F, -23F, -0.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[246].setRotationPoint(-29.5F, -24F, -0.5F);

		bodyModel[247].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[247].setRotationPoint(-34F, -23.5F, -1.5F);

		bodyModel[248].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[248].setRotationPoint(-33F, -23.5F, -0.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[249].setRotationPoint(-34F, -23.5F, 0.5F);

		bodyModel[250].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[250].setRotationPoint(-32.5F, -22.5F, -0.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[251].setRotationPoint(-29F, -17F, 10F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[252].setRotationPoint(-29F, -18F, 10F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 355 special sus box
		bodyModel[253].setRotationPoint(-36F, -8F, 7F);

		bodyModel[254].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[254].setRotationPoint(-28F, -22F, -9.5F);

		bodyModel[255].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[255].setRotationPoint(-28F, -22F, 6.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[256].setRotationPoint(-27.5F, -23F, -8F);

		bodyModel[257].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[257].setRotationPoint(-27.5F, -23F, 8F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[258].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[259].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[260].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[261].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[262].setRotationPoint(-30.5F, -21F, 7F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[263].setRotationPoint(-30F, -22F, 7.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[264].setRotationPoint(-42F, -4F, -6.75F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[265].setRotationPoint(-42.25F, -4F, -6.75F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[266].setRotationPoint(-42.25F, -4F, 4.75F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[267].setRotationPoint(-42F, -4F, 4.75F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[268].setRotationPoint(41F, -4F, -6.75F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[269].setRotationPoint(41.75F, -4F, -6.75F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[270].setRotationPoint(41F, -4F, 4.75F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[271].setRotationPoint(41.75F, -4F, 4.75F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[272].setRotationPoint(-19F, -18.25F, -9F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[273].setRotationPoint(-19F, -19.25F, -9F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[274].setRotationPoint(-18.75F, -17.75F, -8.75F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[275].setRotationPoint(-19F, -20.25F, -8.8F);

		bodyModel[276].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 250
		bodyModel[276].setRotationPoint(-37F, -13F, -11F);

		bodyModel[277].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 410
		bodyModel[277].setRotationPoint(-37F, -13F, 11F);

		bodyModel[278].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 406
		bodyModel[278].setRotationPoint(-39F, -10F, 9F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 407
		bodyModel[279].setRotationPoint(-39F, -6F, 10.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 293
		bodyModel[280].setRotationPoint(-39F, -6F, -11.5F);

		bodyModel[281].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 294
		bodyModel[281].setRotationPoint(-39F, -10F, -11F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, -2F, 0F, 3F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, -2F); // Box 399
		bodyModel[282].setRotationPoint(-39F, -13F, 11F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 2F, 0F, 3F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 2F); // Box 400
		bodyModel[283].setRotationPoint(-39F, -13F, -11F);

		bodyModel[284].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 285
		bodyModel[284].setRotationPoint(-20F, -13F, 11F);

		bodyModel[285].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 288
		bodyModel[285].setRotationPoint(-5F, -9F, 11F);

		bodyModel[286].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 300
		bodyModel[286].setRotationPoint(-20F, -13F, -11F);

		bodyModel[287].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 303
		bodyModel[287].setRotationPoint(-5F, -9F, -11F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 296
		bodyModel[288].setRotationPoint(-9F, -13F, -11.01F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 297
		bodyModel[289].setRotationPoint(-9F, -13F, 11.01F);

		bodyModel[290].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[290].setRotationPoint(39F, -9F, -11F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[291].setRotationPoint(39F, -6F, -11.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[292].setRotationPoint(39F, -6F, 10.5F);

		bodyModel[293].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[293].setRotationPoint(39F, -9F, 9F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F); // Box 411
		bodyModel[294].setRotationPoint(-39F, -13F, 11.01F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F); // Box 412
		bodyModel[295].setRotationPoint(-39F, -13F, -11.01F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F); // Box 339 cull ccrcl beacon holdy
		bodyModel[296].setRotationPoint(-32F, -21F, 7F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F); // Box 340 cull ccrcl beacon holdy
		bodyModel[297].setRotationPoint(-32F, -21F, -9F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon ccrcl
		bodyModel[298].setRotationPoint(-32F, -22.75F, -8.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 342 commander beacon ccrcl
		bodyModel[299].setRotationPoint(-32F, -22.75F, 7.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[300].setRotationPoint(-26.05F, -15F, 1F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[301].setRotationPoint(-32.75F, -13F, 3F);
		bodyModel[301].rotateAngleY = -0.45378561F;

		bodyModel[302].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[302].setRotationPoint(-32.75F, -15F, 3F);
		bodyModel[302].rotateAngleY = -0.45378561F;

		bodyModel[303].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[303].setRotationPoint(-32.75F, -9F, 3F);
		bodyModel[303].rotateAngleY = -0.45378561F;

		bodyModel[304].addShapeBox(0F, 0F, -2F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[304].setRotationPoint(-32F, -17F, 7.5F);
		//bodyModel[304].rotateAngleY = 0.17453293F;

		bodyModel[305].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[305].setRotationPoint(-33F, 1F, 9F);
		bodyModel[305].rotateAngleZ = -0.27925268F;

		bodyModel[306].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[306].setRotationPoint(-36F, 1F, 9F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 429 backwall
		bodyModel[307].setRotationPoint(-22F, -21F, -5F);

		bodyModel[308].addBox(0F, 0F, 0F, 1, 10, 4, 0F); // Box 430 backwall cull bit
		bodyModel[308].setRotationPoint(-22F, -15F, 1F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -5.125F, 0.125F, -0.125F, -5.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -5.125F, 0.125F, -5.125F, -5.125F); // Box 431 backpannel bulgy bit
		bodyModel[309].setRotationPoint(-22F, -20F, 0F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker 2
		bodyModel[310].setRotationPoint(37.85F, -20F, -7F);
		bodyModel[310].rotateAngleY = -0.05235988F;

		bodyModel[311].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker 2
		bodyModel[311].setRotationPoint(37.85F, -20F, 7F);
		bodyModel[311].rotateAngleY = 0.05235988F;

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 445
		bodyModel[312].setRotationPoint(-45F, 3F, 2F);

		bodyModel[313].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 446
		bodyModel[313].setRotationPoint(-45F, 3F, -8F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447 pw antenna
		bodyModel[314].setRotationPoint(-31F, -23F, 0F);

		bodyModel[315].addBox(0F, 0F, 0F, 7, 7, 4, 0F); // Box 331 sp thing
		bodyModel[315].setRotationPoint(-20F, -12F, -11F);

		bodyModel[316].addBox(0F, 0F, 0F, 17, 6, 21, 0F); // Box 453
		bodyModel[316].setRotationPoint(-12F, 3F, -10.5F);

		bodyModel[317].addBox(0F, 0F, 0F, 39, 4, 14, 0F); // Box 454
		bodyModel[317].setRotationPoint(-13F, -24F, -7F);

		bodyModel[318].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 459
		bodyModel[318].setRotationPoint(26F, -21F, -3F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[319].setRotationPoint(26F, -21F, -7F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[320].setRotationPoint(26F, -21F, 3F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[321].setRotationPoint(30F, -21F, -8F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 157
		bodyModel[322].setRotationPoint(30F, -21F, 3F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -2F); // Box 278
		bodyModel[323].setRotationPoint(38F, -20.5F, -8F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, -2F, 0F, 0.5F, 0F, -1F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, -1F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 279
		bodyModel[324].setRotationPoint(38F, -20.5F, 1F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 466
		bodyModel[325].setRotationPoint(38F, -21F, -2F);

		bodyModel[326].addBox(0F, 0F, 0F, 3, 2, 16, 0F); // Box 467
		bodyModel[326].setRotationPoint(5F, 7F, -8F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 314 cull anticlimber
		bodyModel[327].setRotationPoint(-43F, -1F, -9F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 315 cull anticlimber
		bodyModel[328].setRotationPoint(-44.5F, -1F, -8F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 0, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F); // Box 407
		bodyModel[329].setRotationPoint(-44.5F, 0F, -2.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[330].setRotationPoint(39F, -22.5F, -1F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[331].setRotationPoint(39F, -22.5F, -1F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[332].setRotationPoint(39F, -22.5F, -1F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[333].setRotationPoint(39F, -22.5F, -1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[334].setRotationPoint(39F, -22F, -1F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 561 cull bell holder
		bodyModel[335].setRotationPoint(39F, -21F, -1F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[336].setRotationPoint(39.5F, -22F, -0.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[337].setRotationPoint(39.5F, -23F, -0.5F);

		bodyModel[338].addBox(0F, 0F, 0F, 0, 4, 8, 0F); // Box 439 honse
		bodyModel[338].setRotationPoint(42F, -0.5F, -4F);
		bodyModel[338].rotateAngleZ = 0.43633231F;

		bodyModel[339].addBox(0F, 0F, 0F, 0, 4, 8, 0F); // Box 440 honse
		bodyModel[339].setRotationPoint(-42F, -0.5F, -4F);
		bodyModel[339].rotateAngleZ = -0.43633231F;

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 4, 14, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 340
		bodyModel[340].setRotationPoint(-15F, -24F, -7F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 2, 4, 14, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[341].setRotationPoint(26F, -24F, -7F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 342
		bodyModel[342].setRotationPoint(1F, 2F, -11F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[343].setRotationPoint(1F, 2F, 10F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[344].setRotationPoint(-44.01F, 6F, -8F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[345].setRotationPoint(-44.01F, 6F, 0F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[346].setRotationPoint(42.01F, 6F, -8F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[347].setRotationPoint(42.01F, 6F, 0F);
	}
	ModelFB2_new theTrucks2 = new ModelFB2_new();
	ModelBlombergBnew theTrucks3 = new ModelBlombergBnew();
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 43231||GetColor(entity) == 320
				||GetColor(entity) == 343) {
			//fb2 black late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6||GetColor(entity) == 14236){
			//type b silver early
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.015, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.06, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 7||GetColor(entity) == 9){
			//fb2 blac early
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.015, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.06, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1123){
			//fb2 u p is where the poop is early
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_up_early.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.015, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.06, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 8||GetColor(entity) == 5
				||GetColor(entity) == 11){
			//type b black early
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.015, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.06, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 16){
			//fb2 silver early
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.06, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 3247){
			//fb2 grey late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 3249){
			//fb2 CRASH SMASH XPLODE late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_de_bleu.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			//type b black late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.015, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}