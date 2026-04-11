//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: B23-30A
// Model Creator: Biba
// Created on: 20.04.2023 - 21:59:09
// Last changed on: 20.04.2023 - 21:59:09

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.detailkits.Modelb30_booster_bits;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFB2_new;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelB23 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelB23() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[460];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 247, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 260, 118, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 99, 114, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 254, 89, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[7] = new ModelRendererTurbo(this, 155, 133, textureX, textureY); // Box 63
		bodyModel[8] = new ModelRendererTurbo(this, 269, 82, textureX, textureY); // Box 156
		bodyModel[9] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 157
		bodyModel[10] = new ModelRendererTurbo(this, 273, 139, textureX, textureY); // Box 158
		bodyModel[11] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[12] = new ModelRendererTurbo(this, 82, 132, textureX, textureY); // Box 196
		bodyModel[13] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[14] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[15] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[16] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[17] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[18] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[19] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[20] = new ModelRendererTurbo(this, 101, 105, textureX, textureY); // box65
		bodyModel[21] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[22] = new ModelRendererTurbo(this, 433, 128, textureX, textureY); // Box 218
		bodyModel[23] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[25] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[26] = new ModelRendererTurbo(this, 447, 128, textureX, textureY); // Box 256
		bodyModel[27] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[28] = new ModelRendererTurbo(this, 359, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[29] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[30] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[31] = new ModelRendererTurbo(this, 362, 116, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[32] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[33] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[34] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[35] = new ModelRendererTurbo(this, 77, 120, textureX, textureY); // Box 2603
		bodyModel[36] = new ModelRendererTurbo(this, 84, 132, textureX, textureY); // Box 261
		bodyModel[37] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 263
		bodyModel[38] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[39] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[40] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[41] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[43] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 270434
		bodyModel[44] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[45] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 310 cull fueltank support
		bodyModel[46] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 311 cull fueltank support
		bodyModel[47] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[48] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[49] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[50] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[51] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[52] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[53] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[54] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[55] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[56] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[57] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[58] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[59] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[60] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[61] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[62] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[63] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[64] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[65] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[66] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[67] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[68] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[69] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[70] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[71] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318 ph1 mounting stuff
		bodyModel[72] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 322 ph1 mounting stuff
		bodyModel[73] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 757 ph1 mounting stuff
		bodyModel[74] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 758 ph1 mounting stuff
		bodyModel[75] = new ModelRendererTurbo(this, 256, 128, textureX, textureY); // Box 440 front mounting stuff
		bodyModel[76] = new ModelRendererTurbo(this, 176, 116, textureX, textureY); // Box 631 front mounting stuff
		bodyModel[77] = new ModelRendererTurbo(this, 240, 127, textureX, textureY); // Box 882 front mounting stuff
		bodyModel[78] = new ModelRendererTurbo(this, 240, 127, textureX, textureY); // Box 883 front mounting stuff
		bodyModel[79] = new ModelRendererTurbo(this, 217, 173, textureX, textureY); // Box 630
		bodyModel[80] = new ModelRendererTurbo(this, 315, 117, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[81] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 382
		bodyModel[82] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 383
		bodyModel[83] = new ModelRendererTurbo(this, 255, 64, textureX, textureY); // Box 251
		bodyModel[84] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[85] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[86] = new ModelRendererTurbo(this, 1, 139, textureX, textureY); // Box 32
		bodyModel[87] = new ModelRendererTurbo(this, 12, 136, textureX, textureY); // Box 33
		bodyModel[88] = new ModelRendererTurbo(this, 85, 54, textureX, textureY); // Box 298
		bodyModel[89] = new ModelRendererTurbo(this, 41, 101, textureX, textureY); // Box 302
		bodyModel[90] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 303
		bodyModel[91] = new ModelRendererTurbo(this, 34, 105, textureX, textureY); // Box 304
		bodyModel[92] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[93] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[94] = new ModelRendererTurbo(this, 7, 136, textureX, textureY); // Box 688
		bodyModel[95] = new ModelRendererTurbo(this, 1, 130, textureX, textureY); // Box 37
		bodyModel[96] = new ModelRendererTurbo(this, 14, 130, textureX, textureY); // Box 38
		bodyModel[97] = new ModelRendererTurbo(this, 7, 127, textureX, textureY); // Box 557
		bodyModel[98] = new ModelRendererTurbo(this, 12, 127, textureX, textureY); // Box 558
		bodyModel[99] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 185
		bodyModel[100] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "lamp"); // Box 247 Headlight Front nose R
		bodyModel[101] = new ModelRendererTurbo(this, 12, 81, textureX, textureY, "lamp"); // Box 248 Headlight Front nose L
		bodyModel[102] = new ModelRendererTurbo(this, 78, 55, textureX, textureY); // Box 299
		bodyModel[103] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 300
		bodyModel[104] = new ModelRendererTurbo(this, 70, 59, textureX, textureY); // Box 301
		bodyModel[105] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[106] = new ModelRendererTurbo(this, 28, 101, textureX, textureY); // Box 316
		bodyModel[107] = new ModelRendererTurbo(this, 40, 100, textureX, textureY); // Box 317
		bodyModel[108] = new ModelRendererTurbo(this, 28, 100, textureX, textureY); // Box 318
		bodyModel[109] = new ModelRendererTurbo(this, 42, 101, textureX, textureY); // Box 319
		bodyModel[110] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 7
		bodyModel[111] = new ModelRendererTurbo(this, 31, 9, textureX, textureY); // Box 24
		bodyModel[112] = new ModelRendererTurbo(this, 10, 7, textureX, textureY); // Box 28
		bodyModel[113] = new ModelRendererTurbo(this, 52, 7, textureX, textureY); // Box 30
		bodyModel[114] = new ModelRendererTurbo(this, 59, 43, textureX, textureY); // Box 67
		bodyModel[115] = new ModelRendererTurbo(this, 30, 43, textureX, textureY); // Box 68
		bodyModel[116] = new ModelRendererTurbo(this, 77, 25, textureX, textureY); // Box 106
		bodyModel[117] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 107
		bodyModel[118] = new ModelRendererTurbo(this, 109, 9, textureX, textureY); // Box 160
		bodyModel[119] = new ModelRendererTurbo(this, 35, 45, textureX, textureY); // Box 161
		bodyModel[120] = new ModelRendererTurbo(this, 90, 45, textureX, textureY); // Box 162
		bodyModel[121] = new ModelRendererTurbo(this, 50, 45, textureX, textureY); // Box 163
		bodyModel[122] = new ModelRendererTurbo(this, 75, 45, textureX, textureY); // Box 164
		bodyModel[123] = new ModelRendererTurbo(this, 99, 43, textureX, textureY); // Box 166
		bodyModel[124] = new ModelRendererTurbo(this, 70, 43, textureX, textureY); // Box 168
		bodyModel[125] = new ModelRendererTurbo(this, 109, 21, textureX, textureY); // Box 169
		bodyModel[126] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 309
		bodyModel[127] = new ModelRendererTurbo(this, 98, 6, textureX, textureY); // Box 52 door swing right
		bodyModel[128] = new ModelRendererTurbo(this, 56, 6, textureX, textureY); // Box 314 door swing right
		bodyModel[129] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 123
		bodyModel[130] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 350
		bodyModel[131] = new ModelRendererTurbo(this, 98, 24, textureX, textureY); // Box 321
		bodyModel[132] = new ModelRendererTurbo(this, 34, 5, textureX, textureY); // Box 311
		bodyModel[133] = new ModelRendererTurbo(this, 110, 3, textureX, textureY); // Box 165
		bodyModel[134] = new ModelRendererTurbo(this, 110, 29, textureX, textureY); // Box 167
		bodyModel[135] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 48
		bodyModel[136] = new ModelRendererTurbo(this, 1, 47, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[137] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[138] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[139] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[140] = new ModelRendererTurbo(this, 21, 39, textureX, textureY); // Box 43
		bodyModel[141] = new ModelRendererTurbo(this, 7, 39, textureX, textureY); // Box 175
		bodyModel[142] = new ModelRendererTurbo(this, 274, 2, textureX, textureY); // Box 6
		bodyModel[143] = new ModelRendererTurbo(this, 193, 16, textureX, textureY); // Box 292
		bodyModel[144] = new ModelRendererTurbo(this, 205, 2, textureX, textureY); // Box 293
		bodyModel[145] = new ModelRendererTurbo(this, 203, 8, textureX, textureY); // Box 294
		bodyModel[146] = new ModelRendererTurbo(this, 464, 115, textureX, textureY); // Box 148
		bodyModel[147] = new ModelRendererTurbo(this, 471, 110, textureX, textureY); // Box 149
		bodyModel[148] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 150
		bodyModel[149] = new ModelRendererTurbo(this, 422, 24, textureX, textureY); // Box 283
		bodyModel[150] = new ModelRendererTurbo(this, 417, 2, textureX, textureY); // Box 284
		bodyModel[151] = new ModelRendererTurbo(this, 249, 29, textureX, textureY); // Box 285
		bodyModel[152] = new ModelRendererTurbo(this, 249, 22, textureX, textureY); // Box 157
		bodyModel[153] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 18 early stack
		bodyModel[154] = new ModelRendererTurbo(this, 246, 68, textureX, textureY); // Box 21 early stack
		bodyModel[155] = new ModelRendererTurbo(this, 248, 41, textureX, textureY); // Box 18 late stack
		bodyModel[156] = new ModelRendererTurbo(this, 246, 49, textureX, textureY); // Box 21 late stack
		bodyModel[157] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 405 EXTRA STACC
		bodyModel[158] = new ModelRendererTurbo(this, 256, 115, textureX, textureY); // Box 182 ph2 mounting stuff
		bodyModel[159] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 183 ph2 mounting stuff
		bodyModel[160] = new ModelRendererTurbo(this, 176, 140, textureX, textureY); // Box 184 ph2 mounting stuff
		bodyModel[161] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 185 ph2 mounting stuff
		bodyModel[162] = new ModelRendererTurbo(this, 8, 62, textureX, textureY); // Box 133
		bodyModel[163] = new ModelRendererTurbo(this, 8, 58, textureX, textureY); // Box 187
		bodyModel[164] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[165] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[166] = new ModelRendererTurbo(this, 144, 38, textureX, textureY); // Box 566
		bodyModel[167] = new ModelRendererTurbo(this, 144, 35, textureX, textureY); // Box 565
		bodyModel[168] = new ModelRendererTurbo(this, 144, 32, textureX, textureY); // Box 564
		bodyModel[169] = new ModelRendererTurbo(this, 142, 27, textureX, textureY, "cull"); // Box 561 cull bell holder
		bodyModel[170] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 284 Headlight Rear down early
		bodyModel[171] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 285 Headlight Rear up early
		bodyModel[172] = new ModelRendererTurbo(this, 461, 104, textureX, textureY); // Box 288 rear gyralight mount
		bodyModel[173] = new ModelRendererTurbo(this, 454, 102, textureX, textureY, "lamp"); // Box 289 gyralight rear l
		bodyModel[174] = new ModelRendererTurbo(this, 474, 102, textureX, textureY, "lamp"); // Box 290 gyralight rear r
		bodyModel[175] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 165 numberboard early
		bodyModel[176] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 167 numberboard early
		bodyModel[177] = new ModelRendererTurbo(this, 474, 92, textureX, textureY, ""); // Box 215 numberboard late HOLDER
		bodyModel[178] = new ModelRendererTurbo(this, 474, 92, textureX, textureY, ""); // Box 216 numberboard late HOLDER
		bodyModel[179] = new ModelRendererTurbo(this, 487, 100, textureX, textureY, "lamp"); // Box 284 Headlight Rear down late
		bodyModel[180] = new ModelRendererTurbo(this, 487, 100, textureX, textureY, "lamp"); // Box 285 Headlight Rear up late
		bodyModel[181] = new ModelRendererTurbo(this, 487, 93, textureX, textureY); // Box 219 late headlight plate
		bodyModel[182] = new ModelRendererTurbo(this, 336, 112, textureX, textureY); // Box 220 what'le it be fellas? ketchup? or mustard!
		bodyModel[183] = new ModelRendererTurbo(this, 334, 122, textureX, textureY); // Box 221 what'le it be fellas? ketchup? or mustard!
		bodyModel[184] = new ModelRendererTurbo(this, 113, 36, textureX, textureY); // Box 355 brakewheel
		bodyModel[185] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 277
		bodyModel[186] = new ModelRendererTurbo(this, 444, 60, textureX, textureY); // Box 535 b23-7 radi
		bodyModel[187] = new ModelRendererTurbo(this, 444, 60, textureX, textureY); // Box 293 b23-7 radi
		bodyModel[188] = new ModelRendererTurbo(this, 493, 25, textureX, textureY); // Box 293 regular thin radi
		bodyModel[189] = new ModelRendererTurbo(this, 484, 46, textureX, textureY); // Box 229 smol low radiator smol
		bodyModel[190] = new ModelRendererTurbo(this, 484, 53, textureX, textureY); // Box 230 smol low radiator 2
		bodyModel[191] = new ModelRendererTurbo(this, 476, 16, textureX, textureY); // Box 293  smol low radiator 1
		bodyModel[192] = new ModelRendererTurbo(this, 484, 46, textureX, textureY); // Box 232 smol low radiator smol
		bodyModel[193] = new ModelRendererTurbo(this, 484, 60, textureX, textureY); // Box 233 smol low radiator 2
		bodyModel[194] = new ModelRendererTurbo(this, 493, 25, textureX, textureY); // Box 234 regular thin radi
		bodyModel[195] = new ModelRendererTurbo(this, 476, 16, textureX, textureY); // Box 235 smol low radiator 1
		bodyModel[196] = new ModelRendererTurbo(this, 482, 25, textureX, textureY); // Box 236 b30-7a early
		bodyModel[197] = new ModelRendererTurbo(this, 482, 25, textureX, textureY); // Box 237 b30-7a early
		bodyModel[198] = new ModelRendererTurbo(this, 444, 46, textureX, textureY); // Box 238 b30-7 radi
		bodyModel[199] = new ModelRendererTurbo(this, 444, 53, textureX, textureY); // Box 239 b30-7 radi
		bodyModel[200] = new ModelRendererTurbo(this, 444, 46, textureX, textureY); // Box 240 b30-7 radi
		bodyModel[201] = new ModelRendererTurbo(this, 444, 53, textureX, textureY); // Box 241 b30-7 radi
		bodyModel[202] = new ModelRendererTurbo(this, 56, 67, textureX, textureY); // Box 289
		bodyModel[203] = new ModelRendererTurbo(this, 44, 66, textureX, textureY); // Box 295
		bodyModel[204] = new ModelRendererTurbo(this, 25, 66, textureX, textureY); // Box 296
		bodyModel[205] = new ModelRendererTurbo(this, 10, 66, textureX, textureY); // Box 297
		bodyModel[206] = new ModelRendererTurbo(this, 1, 96, textureX, textureY, "lamp"); // Box 298 headlight f hh
		bodyModel[207] = new ModelRendererTurbo(this, 1, 96, textureX, textureY, "lamp"); // Box 299 headlight f hh
		bodyModel[208] = new ModelRendererTurbo(this, 19, 75, textureX, textureY); // Box 303
		bodyModel[209] = new ModelRendererTurbo(this, 34, 79, textureX, textureY); // Box 304
		bodyModel[210] = new ModelRendererTurbo(this, 41, 75, textureX, textureY); // Box 305
		bodyModel[211] = new ModelRendererTurbo(this, 34, 74, textureX, textureY); // Box 306
		bodyModel[212] = new ModelRendererTurbo(this, 50, 72, textureX, textureY); // Box 307
		bodyModel[213] = new ModelRendererTurbo(this, 10, 72, textureX, textureY); // Box 308
		bodyModel[214] = new ModelRendererTurbo(this, 37, 62, textureX, textureY); // Box 402
		bodyModel[215] = new ModelRendererTurbo(this, 8, 50, textureX, textureY); // Box 388 numberboard hh HOLDER
		bodyModel[216] = new ModelRendererTurbo(this, 8, 50, textureX, textureY); // Box 389 numberboard hh HOLDER
		bodyModel[217] = new ModelRendererTurbo(this, 8, 100, textureX, textureY); // Box 237
		bodyModel[218] = new ModelRendererTurbo(this, 1, 101, textureX, textureY); // Box 238
		bodyModel[219] = new ModelRendererTurbo(this, 8, 107, textureX, textureY); // Box 239
		bodyModel[220] = new ModelRendererTurbo(this, 499, 91, textureX, textureY, "lamp"); // Box 215 numberboard late
		bodyModel[221] = new ModelRendererTurbo(this, 499, 91, textureX, textureY, "lamp"); // Box 216 numberboard late
		bodyModel[222] = new ModelRendererTurbo(this, 11, 99, textureX, textureY, "lamp"); // Box 388 numberboard hh
		bodyModel[223] = new ModelRendererTurbo(this, 11, 99, textureX, textureY, "lamp"); // Box 389 numberboard hh
		bodyModel[224] = new ModelRendererTurbo(this, 504, 112, textureX, textureY); // Box 566
		bodyModel[225] = new ModelRendererTurbo(this, 504, 109, textureX, textureY); // Box 565
		bodyModel[226] = new ModelRendererTurbo(this, 504, 106, textureX, textureY); // Box 564
		bodyModel[227] = new ModelRendererTurbo(this, 502, 101, textureX, textureY, "cull"); // Box 561 cull bell holder
		bodyModel[228] = new ModelRendererTurbo(this, 460, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[229] = new ModelRendererTurbo(this, 98, 145, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[230] = new ModelRendererTurbo(this, 499, 140, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[231] = new ModelRendererTurbo(this, 499, 140, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[232] = new ModelRendererTurbo(this, 128, 45, textureX, textureY); // Box 354
		bodyModel[233] = new ModelRendererTurbo(this, 130, 42, textureX, textureY); // Box 355
		bodyModel[234] = new ModelRendererTurbo(this, 130, 48, textureX, textureY); // Box 356
		bodyModel[235] = new ModelRendererTurbo(this, 139, 45, textureX, textureY); // Box 357
		bodyModel[236] = new ModelRendererTurbo(this, 210, 32, textureX, textureY); // Box 286
		bodyModel[237] = new ModelRendererTurbo(this, 219, 35, textureX, textureY); // Box 287
		bodyModel[238] = new ModelRendererTurbo(this, 210, 38, textureX, textureY); // Box 288
		bodyModel[239] = new ModelRendererTurbo(this, 208, 35, textureX, textureY); // Box 289
		bodyModel[240] = new ModelRendererTurbo(this, 139, 42, textureX, textureY); // Box 332
		bodyModel[241] = new ModelRendererTurbo(this, 132, 39, textureX, textureY); // Box 331
		bodyModel[242] = new ModelRendererTurbo(this, 212, 29, textureX, textureY); // Box 526
		bodyModel[243] = new ModelRendererTurbo(this, 212, 41, textureX, textureY); // Box 527
		bodyModel[244] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[245] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[246] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[247] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[248] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[249] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[250] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[251] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[252] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[253] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[254] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[255] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[256] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[257] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[258] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[259] = new ModelRendererTurbo(this, 89, 170, textureX, textureY); // Box 734
		bodyModel[260] = new ModelRendererTurbo(this, 127, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[261] = new ModelRendererTurbo(this, 105, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[262] = new ModelRendererTurbo(this, 413, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[263] = new ModelRendererTurbo(this, 424, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[264] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[265] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[266] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[267] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[268] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418
		bodyModel[269] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419
		bodyModel[270] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420
		bodyModel[271] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421
		bodyModel[272] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 61
		bodyModel[273] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 63
		bodyModel[274] = new ModelRendererTurbo(this, 103, 109, textureX, textureY); // Box 80
		bodyModel[275] = new ModelRendererTurbo(this, 487, 139, textureX, textureY); // Box 259
		bodyModel[276] = new ModelRendererTurbo(this, 451, 123, textureX, textureY); // Box 267
		bodyModel[277] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 269
		bodyModel[278] = new ModelRendererTurbo(this, 136, 124, textureX, textureY); // Box 298
		bodyModel[279] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 299
		bodyModel[280] = new ModelRendererTurbo(this, 448, 138, textureX, textureY); // Box 300
		bodyModel[281] = new ModelRendererTurbo(this, 484, 138, textureX, textureY); // Box 301
		bodyModel[282] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[283] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[284] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[285] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[286] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[287] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[288] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[289] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[290] = new ModelRendererTurbo(this, 151, 14, textureX, textureY); // Box 184 o2 generator
		bodyModel[291] = new ModelRendererTurbo(this, 136, 66, textureX, textureY, "cull"); // Box 418 cull platform atsf
		bodyModel[292] = new ModelRendererTurbo(this, 178, 65, textureX, textureY, "cull"); // Box 419 cull atsf bit
		bodyModel[293] = new ModelRendererTurbo(this, 181, 63, textureX, textureY); // Box 425
		bodyModel[294] = new ModelRendererTurbo(this, 156, 68, textureX, textureY); // Box 308
		bodyModel[295] = new ModelRendererTurbo(this, 63, 6, textureX, textureY); // Box 309 cab roof vent
		bodyModel[296] = new ModelRendererTurbo(this, 145, 84, textureX, textureY); // Box 310
		bodyModel[297] = new ModelRendererTurbo(this, 145, 82, textureX, textureY); // Box 311
		bodyModel[298] = new ModelRendererTurbo(this, 145, 82, textureX, textureY); // Box 312
		bodyModel[299] = new ModelRendererTurbo(this, 145, 84, textureX, textureY); // Box 313
		bodyModel[300] = new ModelRendererTurbo(this, 125, 138, textureX, textureY, "cull"); // Box 314 cull anticlimber
		bodyModel[301] = new ModelRendererTurbo(this, 148, 144, textureX, textureY, "cull"); // Box 315 cull anticlimber
		bodyModel[302] = new ModelRendererTurbo(this, 218, 49, textureX, textureY); // Box 745
		bodyModel[303] = new ModelRendererTurbo(this, 206, 49, textureX, textureY); // Box 746
		bodyModel[304] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 747
		bodyModel[305] = new ModelRendererTurbo(this, 208, 52, textureX, textureY); // Box 748
		bodyModel[306] = new ModelRendererTurbo(this, 166, 42, textureX, textureY); // Box 333
		bodyModel[307] = new ModelRendererTurbo(this, 176, 45, textureX, textureY); // Box 334
		bodyModel[308] = new ModelRendererTurbo(this, 166, 45, textureX, textureY); // Box 335
		bodyModel[309] = new ModelRendererTurbo(this, 166, 48, textureX, textureY); // Box 336
		bodyModel[310] = new ModelRendererTurbo(this, 157, 64, textureX, textureY); // Box 324 sp platform box NO CULL
		bodyModel[311] = new ModelRendererTurbo(this, 148, 12, textureX, textureY); // Box 364 prime base
		bodyModel[312] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "prime1"); // Box 6 PRIME2-1
		bodyModel[313] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "prime3"); // Box 7 PRIME2-3
		bodyModel[314] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "prime2"); // Box 8 PRIME2-2
		bodyModel[315] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "prime4"); // Box 9 PRIME2-4
		bodyModel[316] = new ModelRendererTurbo(this, 146, 16, textureX, textureY, "cull"); // Box 330 cull sp beacon holder
		bodyModel[317] = new ModelRendererTurbo(this, 234, 101, textureX, textureY); // Box 331 sp thing
		bodyModel[318] = new ModelRendererTurbo(this, 137, 1, textureX, textureY, "lamp"); // Box 401 sp emergency gyra
		bodyModel[319] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 400 sp E gyra box
		bodyModel[320] = new ModelRendererTurbo(this, 142, -1, textureX, textureY); // Box 335 sp e gyra box holder stick
		bodyModel[321] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 336 tiny mini mexico tank
		bodyModel[322] = new ModelRendererTurbo(this, 493, 103, textureX, textureY, ""); // Box 414 sp e gyra holdy rear
		bodyModel[323] = new ModelRendererTurbo(this, 494, 98, textureX, textureY, "lamp"); // Box 415 sp e gyra reart
		bodyModel[324] = new ModelRendererTurbo(this, 494, 108, textureX, textureY, "cull"); // Box 416 cull sp e gyra holdy rear
		bodyModel[325] = new ModelRendererTurbo(this, 339, 122, textureX, textureY); // Box 340 spee pee lol
		bodyModel[326] = new ModelRendererTurbo(this, 341, 112, textureX, textureY); // Box 341 spee pee lol
		bodyModel[327] = new ModelRendererTurbo(this, 156, 65, textureX, textureY); // Box 279
		bodyModel[328] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime1"); // Box 6 PRIME4-1
		bodyModel[329] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime3"); // Box 7 PRIME4-3
		bodyModel[330] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime2"); // Box 8 PRIME4-2
		bodyModel[331] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime4"); // Box 9 PRIME4-4
		bodyModel[332] = new ModelRendererTurbo(this, 174, 59, textureX, textureY); // Box 428 prime base
		bodyModel[333] = new ModelRendererTurbo(this, 182, 8, textureX, textureY); // Box 409 commander base
		bodyModel[334] = new ModelRendererTurbo(this, 182, 4, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[335] = new ModelRendererTurbo(this, 152, 42, textureX, textureY); // Box 427
		bodyModel[336] = new ModelRendererTurbo(this, 152, 45, textureX, textureY); // Box 428
		bodyModel[337] = new ModelRendererTurbo(this, 152, 48, textureX, textureY); // Box 429
		bodyModel[338] = new ModelRendererTurbo(this, 161, 45, textureX, textureY); // Box 430
		bodyModel[339] = new ModelRendererTurbo(this, 16, 55, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[340] = new ModelRendererTurbo(this, 16, 50, textureX, textureY); // Box 5
		bodyModel[341] = new ModelRendererTurbo(this, 251, 101, textureX, textureY); // Box 355 special sus box
		bodyModel[342] = new ModelRendererTurbo(this, 174, 29, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[343] = new ModelRendererTurbo(this, 155, 29, textureX, textureY, "cull"); // Box 562 cull ptc antenna shiz
		bodyModel[344] = new ModelRendererTurbo(this, 178, 27, textureX, textureY); // Box 563
		bodyModel[345] = new ModelRendererTurbo(this, 159, 27, textureX, textureY); // Box 564
		bodyModel[346] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime1"); // Box 6 PRIME3-1
		bodyModel[347] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime3"); // Box 7 PRIME3-3
		bodyModel[348] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime2"); // Box 8 PRIME3-2
		bodyModel[349] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime4"); // Box 9 PRIME3-4
		bodyModel[350] = new ModelRendererTurbo(this, 161, 56, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[351] = new ModelRendererTurbo(this, 151, 59, textureX, textureY); // Box 428 prime base
		bodyModel[352] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[353] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 101
		bodyModel[354] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "ditch"); // Box 190 ditchlight f1
		bodyModel[355] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "ditch"); // Box 275 ditchlight f2
		bodyModel[356] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 444
		bodyModel[357] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "ditch"); // Box 445 ditchlight f2
		bodyModel[358] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "ditch"); // Box 446 ditchlight f1
		bodyModel[359] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[360] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 281
		bodyModel[361] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 101
		bodyModel[362] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "ditch"); // Box 276 ditchlight r1
		bodyModel[363] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, "ditch"); // Box 278 ditchlight r2
		bodyModel[364] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 440
		bodyModel[365] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, "ditch"); // Box 441 ditchlight r2
		bodyModel[366] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[367] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "ditch"); // Box 443 ditchlight r1
		bodyModel[368] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 114
		bodyModel[369] = new ModelRendererTurbo(this, 191, 6, textureX, textureY); // Box 74
		bodyModel[370] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 78
		bodyModel[371] = new ModelRendererTurbo(this, 190, 1, textureX, textureY); // Box 245
		bodyModel[372] = new ModelRendererTurbo(this, 142, 59, textureX, textureY); // Box 364 prime base
		bodyModel[373] = new ModelRendererTurbo(this, 142, 55, textureX, textureY, "prime1"); // Box 6 PRIME1-1
		bodyModel[374] = new ModelRendererTurbo(this, 142, 55, textureX, textureY, "prime3"); // Box 7 PRIME1-3
		bodyModel[375] = new ModelRendererTurbo(this, 142, 55, textureX, textureY, "prime2"); // Box 8 PRIME1-2
		bodyModel[376] = new ModelRendererTurbo(this, 142, 55, textureX, textureY, "prime4"); // Box 9 PRIME1-4
		bodyModel[377] = new ModelRendererTurbo(this, 162, 108, textureX, textureY); // Box 250
		bodyModel[378] = new ModelRendererTurbo(this, 162, 99, textureX, textureY); // Box 410
		bodyModel[379] = new ModelRendererTurbo(this, 92, 117, textureX, textureY); // Box 406
		bodyModel[380] = new ModelRendererTurbo(this, 97, 125, textureX, textureY); // Box 407
		bodyModel[381] = new ModelRendererTurbo(this, 139, 125, textureX, textureY); // Box 293
		bodyModel[382] = new ModelRendererTurbo(this, 142, 117, textureX, textureY); // Box 294
		bodyModel[383] = new ModelRendererTurbo(this, 155, 101, textureX, textureY); // Box 399
		bodyModel[384] = new ModelRendererTurbo(this, 155, 110, textureX, textureY); // Box 400
		bodyModel[385] = new ModelRendererTurbo(this, 156, 79, textureX, textureY); // Box 285
		bodyModel[386] = new ModelRendererTurbo(this, 178, 81, textureX, textureY); // Box 288
		bodyModel[387] = new ModelRendererTurbo(this, 156, 90, textureX, textureY); // Box 300
		bodyModel[388] = new ModelRendererTurbo(this, 178, 90, textureX, textureY); // Box 303
		bodyModel[389] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[390] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[391] = new ModelRendererTurbo(this, 442, 109, textureX, textureY); // Box 296
		bodyModel[392] = new ModelRendererTurbo(this, 444, 124, textureX, textureY); // Box 280
		bodyModel[393] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[394] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[395] = new ModelRendererTurbo(this, 155, 99, textureX, textureY); // Box 411
		bodyModel[396] = new ModelRendererTurbo(this, 155, 108, textureX, textureY); // Box 412
		bodyModel[397] = new ModelRendererTurbo(this, 94, 34, textureX, textureY, "cull"); // Box 339 cull ccrcl beacon holdy
		bodyModel[398] = new ModelRendererTurbo(this, 101, 34, textureX, textureY, "cull"); // Box 340 cull ccrcl beacon holdy
		bodyModel[399] = new ModelRendererTurbo(this, 102, 30, textureX, textureY, "commander"); // Box 410 commander beacon ccrcl
		bodyModel[400] = new ModelRendererTurbo(this, 95, 30, textureX, textureY, "commander"); // Box 342 commander beacon ccrcl
		bodyModel[401] = new ModelRendererTurbo(this, 116, 42, textureX, textureY); // Box 324
		bodyModel[402] = new ModelRendererTurbo(this, 370, 88, textureX, textureY); // Box 379 big box boye
		bodyModel[403] = new ModelRendererTurbo(this, 30, 197, textureX, textureY); // Box 412 cs
		bodyModel[404] = new ModelRendererTurbo(this, 42, 197, textureX, textureY); // Box 413 cs
		bodyModel[405] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86 cs
		bodyModel[406] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // Box 531 cs
		bodyModel[407] = new ModelRendererTurbo(this, 55, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[408] = new ModelRendererTurbo(this, 133, 55, textureX, textureY, "prime1"); // Box 6 PRIME5-1
		bodyModel[409] = new ModelRendererTurbo(this, 133, 55, textureX, textureY, "prime3"); // Box 7 PRIME5-3
		bodyModel[410] = new ModelRendererTurbo(this, 133, 55, textureX, textureY, "prime2"); // Box 8 PRIME5-2
		bodyModel[411] = new ModelRendererTurbo(this, 133, 55, textureX, textureY, "prime4"); // Box 9 PRIME5-4
		bodyModel[412] = new ModelRendererTurbo(this, 133, 59, textureX, textureY); // Box 428 prime base
		bodyModel[413] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[414] = new ModelRendererTurbo(this, 210, 126, textureX, textureY); // Box 280
		bodyModel[415] = new ModelRendererTurbo(this, 67, 186, textureX, textureY); // Box 429 backwall
		bodyModel[416] = new ModelRendererTurbo(this, 90, 192, textureX, textureY, "cull"); // Box 430 backwall cull bit
		bodyModel[417] = new ModelRendererTurbo(this, 101, 186, textureX, textureY); // Box 431 backpannel bulgy bit
		bodyModel[418] = new ModelRendererTurbo(this, 344, 198, textureX, textureY); // Box 144
		bodyModel[419] = new ModelRendererTurbo(this, 360, 226, textureX, textureY); // Box 292
		bodyModel[420] = new ModelRendererTurbo(this, 360, 221, textureX, textureY); // Box 347
		bodyModel[421] = new ModelRendererTurbo(this, 439, 244, textureX, textureY); // Box 371
		bodyModel[422] = new ModelRendererTurbo(this, 442, 231, textureX, textureY); // Box 361
		bodyModel[423] = new ModelRendererTurbo(this, 384, 243, textureX, textureY); // Box 365
		bodyModel[424] = new ModelRendererTurbo(this, 436, 234, textureX, textureY); // Box 368
		bodyModel[425] = new ModelRendererTurbo(this, 378, 233, textureX, textureY); // Box 369
		bodyModel[426] = new ModelRendererTurbo(this, 415, 213, textureX, textureY); // Box 370
		bodyModel[427] = new ModelRendererTurbo(this, 415, 189, textureX, textureY); // Box 371
		bodyModel[428] = new ModelRendererTurbo(this, 486, 235, textureX, textureY); // Box 133
		bodyModel[429] = new ModelRendererTurbo(this, 376, 235, textureX, textureY); // Box 138
		bodyModel[430] = new ModelRendererTurbo(this, 421, 204, textureX, textureY); // Box 455
		bodyModel[431] = new ModelRendererTurbo(this, 363, 235, textureX, textureY); // Box 456
		bodyModel[432] = new ModelRendererTurbo(this, 377, 232, textureX, textureY); // Box 459
		bodyModel[433] = new ModelRendererTurbo(this, 370, 232, textureX, textureY); // Box 461
		bodyModel[434] = new ModelRendererTurbo(this, 492, 232, textureX, textureY); // Box 462
		bodyModel[435] = new ModelRendererTurbo(this, 485, 235, textureX, textureY); // Box 465
		bodyModel[436] = new ModelRendererTurbo(this, 487, 232, textureX, textureY); // Box 467
		bodyModel[437] = new ModelRendererTurbo(this, 415, 233, textureX, textureY); // Box 468
		bodyModel[438] = new ModelRendererTurbo(this, 492, 140, textureX, textureY, "lamp"); // Box 339 glowey marker 2
		bodyModel[439] = new ModelRendererTurbo(this, 492, 140, textureX, textureY, "lamp"); // Box 340 glowey marker 2
		bodyModel[440] = new ModelRendererTurbo(this, 491, 6, textureX, textureY); // Box 471 funky double radiator
		bodyModel[441] = new ModelRendererTurbo(this, 491, 15, textureX, textureY); // Box 472 funky double radiator
		bodyModel[442] = new ModelRendererTurbo(this, 491, 6, textureX, textureY); // Box 471 funky double radiator
		bodyModel[443] = new ModelRendererTurbo(this, 491, 15, textureX, textureY); // Box 472 funky double radiator
		bodyModel[444] = new ModelRendererTurbo(this, 146, 148, textureX, textureY); // Box 407
		bodyModel[445] = new ModelRendererTurbo(this, 1, 186, textureX, textureY); // Box 445
		bodyModel[446] = new ModelRendererTurbo(this, 12, 188, textureX, textureY); // Box 446
		bodyModel[447] = new ModelRendererTurbo(this, 182, 72, textureX, textureY); // Box 447 pw antenna
		bodyModel[448] = new ModelRendererTurbo(this, 195, 46, textureX, textureY); // Box 786
		bodyModel[449] = new ModelRendererTurbo(this, 186, 43, textureX, textureY); // Box 787
		bodyModel[450] = new ModelRendererTurbo(this, 184, 46, textureX, textureY); // Box 788
		bodyModel[451] = new ModelRendererTurbo(this, 186, 49, textureX, textureY); // Box 789
		bodyModel[452] = new ModelRendererTurbo(this, 187, 4, textureX, textureY); // Box 104 cnrc antenna
		bodyModel[453] = new ModelRendererTurbo(this, 153, 51, textureX, textureY); // Box 453
		bodyModel[454] = new ModelRendererTurbo(this, 153, 39, textureX, textureY); // Box 454
		bodyModel[455] = new ModelRendererTurbo(this, 307, 233, textureX, textureY); // Box 455 2900 gal fuel tank
		bodyModel[456] = new ModelRendererTurbo(this, 186, 65, textureX, textureY); // Box 456 csx floater
		bodyModel[457] = new ModelRendererTurbo(this, 188, 59, textureX, textureY); // Box 457 csx floater
		bodyModel[458] = new ModelRendererTurbo(this, 189, 62, textureX, textureY); // Box 458 csx floater
		bodyModel[459] = new ModelRendererTurbo(this, 406, 83, textureX, textureY, "cull"); // Box 459 cull sound baffles

		bodyModel[0].addBox(0F, 0F, 0F, 76, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 18, 4, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-9F, 5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(-42.01F, -1F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 8
		bodyModel[3].setRotationPoint(-42F, -1F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 18, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[4].setRotationPoint(-9F, 2F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[5].setRotationPoint(10F, 4F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[6].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[7].setRotationPoint(-38F, 2F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 156
		bodyModel[8].setRotationPoint(-38F, 1.5F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[9].setRotationPoint(-9F, 5F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[10].setRotationPoint(-9F, 5F, 8F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[11].setRotationPoint(-39F, -1F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[12].setRotationPoint(-39F, 7F, 10F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[13].setRotationPoint(-42F, 8F, 8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[14].setRotationPoint(-39F, 7F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[15].setRotationPoint(-42F, -1F, 7F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[16].setRotationPoint(-42F, 2F, 7F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[17].setRotationPoint(-42F, -1F, -8F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[18].setRotationPoint(-42F, 2F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[19].setRotationPoint(-42F, 8F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[20].setRotationPoint(-42F, 8F, -9F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 215
		bodyModel[21].setRotationPoint(38F, -1F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[22].setRotationPoint(38F, 7F, 10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[23].setRotationPoint(38F, 7F, -11F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[24].setRotationPoint(42F, 3F, -1.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[25].setRotationPoint(42F, 8F, -9F);

		bodyModel[26].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[26].setRotationPoint(42.01F, -1F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[27].setRotationPoint(10F, 4F, -9.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[28].setRotationPoint(9F, 1F, 8.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[29].setRotationPoint(-11F, 4F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[30].setRotationPoint(-11F, 4F, -9.5F);

		bodyModel[31].addBox(-0.5F, -6F, -1F, 1, 6, 1, 0F); // Box 305 pipe cull
		bodyModel[31].setRotationPoint(-10.5F, 5.5F, 10.01F);
		bodyModel[31].rotateAngleZ = -0.2268928F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[32].setRotationPoint(-11F, 2.5F, 8.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[33].setRotationPoint(-11F, 1.5F, 8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[34].setRotationPoint(-10.75F, 3F, 8.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[35].setRotationPoint(-38F, 1F, 7F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[36].setRotationPoint(-39F, -1F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 263
		bodyModel[37].setRotationPoint(37F, 1F, -11F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[38].setRotationPoint(38F, -1F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[39].setRotationPoint(-42F, 1F, -3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[40].setRotationPoint(37F, 1F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[41].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[42].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 270434
		bodyModel[43].setRotationPoint(37F, 1F, 7F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[44].setRotationPoint(38F, -1F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310 cull fueltank support
		bodyModel[45].setRotationPoint(9F, 3F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 311 cull fueltank support
		bodyModel[46].setRotationPoint(-12F, 3F, -6F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[47].setRotationPoint(42.01F, 7F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[48].setRotationPoint(-42.01F, 7F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[49].setRotationPoint(-42F, 6F, -8F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[50].setRotationPoint(-42F, 6F, 8F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[51].setRotationPoint(39F, 6F, 8F);

		bodyModel[52].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[52].setRotationPoint(39F, 6F, -8F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[53].setRotationPoint(39F, 8F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[54].setRotationPoint(39F, 2F, -9F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[55].setRotationPoint(39F, 8F, 8F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[56].setRotationPoint(39F, 2F, 7F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[57].setRotationPoint(39F, -1F, 7F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[58].setRotationPoint(-42F, 5F, 8F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[59].setRotationPoint(-42F, 5F, -10F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[60].setRotationPoint(39F, 5F, -10F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[61].setRotationPoint(39F, 5F, 8F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[62].setRotationPoint(39F, 4F, 8F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[63].setRotationPoint(-42F, 4F, 8F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[64].setRotationPoint(-42F, 4F, -8F);

		bodyModel[65].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[65].setRotationPoint(39F, 4F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[66].setRotationPoint(-12F, 5F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[67].setRotationPoint(-10F, 5F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[68].setRotationPoint(9F, 5F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[69].setRotationPoint(11F, 5F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 76, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[70].setRotationPoint(-38F, 2.75F, -7.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318 ph1 mounting stuff
		bodyModel[71].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322 ph1 mounting stuff
		bodyModel[72].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757 ph1 mounting stuff
		bodyModel[73].setRotationPoint(23.5F, 2F, 6F);

		bodyModel[74].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758 ph1 mounting stuff
		bodyModel[74].setRotationPoint(22.5F, 2.5F, -2F);

		bodyModel[75].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440 front mounting stuff
		bodyModel[75].setRotationPoint(-26.5F, 2.5F, -2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631 front mounting stuff
		bodyModel[76].setRotationPoint(-26.5F, 1F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882 front mounting stuff
		bodyModel[77].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883 front mounting stuff
		bodyModel[78].setRotationPoint(-25.5F, 2F, 6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 76, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[79].setRotationPoint(-38F, 1F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[80].setRotationPoint(9.25F, 0.75F, 8.5F);

		bodyModel[81].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[81].setRotationPoint(-1F, 1.5F, -11.25F);
		bodyModel[81].rotateAngleX = 1.57079633F;

		bodyModel[82].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[82].setRotationPoint(-1F, 1.5F, 11.25F);
		bodyModel[82].rotateAngleX = -1.57079633F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 76, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[83].setRotationPoint(-38F, 1F, -7F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[84].setRotationPoint(39F, -1F, -8F);

		bodyModel[85].addBox(0F, 0F, 0F, 25, 4, 22, 0F); // Box 25
		bodyModel[85].setRotationPoint(-36F, -5F, -11F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 32
		bodyModel[86].setRotationPoint(-37F, -3F, -10F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 33
		bodyModel[87].setRotationPoint(-37F, -5F, 7F);

		bodyModel[88].addBox(0F, 0F, 0F, 5, 12, 14, 0F); // Box 298
		bodyModel[88].setRotationPoint(-38F, -13F, -7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 302
		bodyModel[89].setRotationPoint(-39F, -13F, -7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[90].setRotationPoint(-39F, -13F, 1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304
		bodyModel[91].setRotationPoint(-39F, -13F, -1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[92].setRotationPoint(-38.85F, -12.7F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[93].setRotationPoint(-38.85F, -12.7F, 5F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[94].setRotationPoint(-37F, -5F, -11F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[95].setRotationPoint(-11F, -3F, -10F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[96].setRotationPoint(-11F, -3F, 7F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[97].setRotationPoint(-11F, -5F, -11F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[98].setRotationPoint(-11F, -5F, 10F);

		bodyModel[99].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 185
		bodyModel[99].setRotationPoint(-38.75F, -13.75F, -2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front nose R
		bodyModel[100].setRotationPoint(-39.5F, -13.7F, -2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front nose L
		bodyModel[101].setRotationPoint(-39.5F, -13.7F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[102].setRotationPoint(-38F, -14F, -1F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[103].setRotationPoint(-38F, -14F, -7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[104].setRotationPoint(-38F, -14F, 1F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[105].setRotationPoint(-37.5F, -14F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[106].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 317
		bodyModel[107].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[108].setRotationPoint(-37F, -13.75F, 3F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[109].setRotationPoint(-37F, -13.75F, 6F);

		bodyModel[110].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 7
		bodyModel[110].setRotationPoint(-32F, -18F, -11F);

		bodyModel[111].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 24
		bodyModel[111].setRotationPoint(-32F, -18F, 10F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 28
		bodyModel[112].setRotationPoint(-21F, -18F, -11F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 30
		bodyModel[113].setRotationPoint(-33F, -18F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[114].setRotationPoint(-33F, -21F, 7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[115].setRotationPoint(-33F, -21F, -11F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 106
		bodyModel[116].setRotationPoint(-21F, -21F, -7F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 107
		bodyModel[117].setRotationPoint(-33F, -21F, -7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[118].setRotationPoint(-32F, -22F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[119].setRotationPoint(-33F, -22F, -7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[120].setRotationPoint(-21F, -22F, -7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[121].setRotationPoint(-33F, -22F, 1F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[122].setRotationPoint(-21F, -22F, 1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[123].setRotationPoint(-21F, -21F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[124].setRotationPoint(-21F, -21F, 7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[125].setRotationPoint(-32F, -22F, 1F);

		bodyModel[126].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // Box 309
		bodyModel[126].setRotationPoint(-33F, -22F, -1F);

		bodyModel[127].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 52 door swing right
		bodyModel[127].setRotationPoint(-32.5F, -18F, -10.5F);

		bodyModel[128].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[128].setRotationPoint(-20.5F, -18F, 10.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[129].setRotationPoint(-31F, -18F, -11F);
		bodyModel[129].rotateAngleX = -0.61086524F;

		bodyModel[130].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 350
		bodyModel[130].setRotationPoint(-29F, -16F, -11F);

		bodyModel[131].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[131].setRotationPoint(-29.01F, -16F, 11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[132].setRotationPoint(-31F, -18F, 11F);
		bodyModel[132].rotateAngleX = 0.61086524F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[133].setRotationPoint(-32F, -19F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[134].setRotationPoint(-32F, -19F, 7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 48
		bodyModel[135].setRotationPoint(-34F, -21.75F, -1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[136].setRotationPoint(-34.25F, -21.75F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[137].setRotationPoint(-34.25F, -19.75F, -1F);

		bodyModel[138].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 117 numberboard
		bodyModel[138].setRotationPoint(-34.1F, -20.75F, -1F);
		bodyModel[138].rotateAngleY = 0.14835299F;

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[139].setRotationPoint(-34.1F, -20.75F, 1F);
		bodyModel[139].rotateAngleY = -0.14835299F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[140].setRotationPoint(-34F, -20.75F, -6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 175
		bodyModel[141].setRotationPoint(-34F, -20.75F, 1F);

		bodyModel[142].addBox(0F, 0F, 0F, 57, 19, 14, 0F); // Box 6
		bodyModel[142].setRotationPoint(-20F, -20F, -7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[143].setRotationPoint(-20F, -21F, -7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[144].setRotationPoint(-20F, -21F, 3F);

		bodyModel[145].addBox(0F, 0F, 0F, 37, 1, 6, 0F); // Box 294
		bodyModel[145].setRotationPoint(-20F, -21F, -3F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 148
		bodyModel[146].setRotationPoint(38F, -21F, -1F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 149
		bodyModel[147].setRotationPoint(38F, -21F, 1F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[148].setRotationPoint(38F, -21F, -8F);

		bodyModel[149].addBox(0F, 0F, 0F, 28, 19, 1, 0F); // Box 283
		bodyModel[149].setRotationPoint(10F, -20F, -7.75F);

		bodyModel[150].addBox(0F, 0F, 0F, 28, 19, 1, 0F); // Box 284
		bodyModel[150].setRotationPoint(10F, -20F, 6.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[151].setRotationPoint(10F, -21F, -8F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 157
		bodyModel[152].setRotationPoint(10F, -21F, 3F);

		bodyModel[153].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 18 early stack
		bodyModel[153].setRotationPoint(11.5F, -22.5F, -2.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 21 early stack
		bodyModel[154].setRotationPoint(11F, -21.5F, -3F);

		bodyModel[155].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18 late stack
		bodyModel[155].setRotationPoint(10.5F, -22.5F, -3F);

		bodyModel[156].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 21 late stack
		bodyModel[156].setRotationPoint(10F, -21.5F, -3.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 405 EXTRA STACC
		bodyModel[157].setRotationPoint(10.5F, -23.5F, -3F);

		bodyModel[158].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 182 ph2 mounting stuff
		bodyModel[158].setRotationPoint(23.5F, 2.5F, -2F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 183 ph2 mounting stuff
		bodyModel[159].setRotationPoint(24.5F, 2F, 6F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 184 ph2 mounting stuff
		bodyModel[160].setRotationPoint(23.5F, 1F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 185 ph2 mounting stuff
		bodyModel[161].setRotationPoint(24.5F, 2F, -11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[162].setRotationPoint(-34F, -18F, -1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[163].setRotationPoint(-34F, -22.5F, -1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[164].setRotationPoint(37F, -22F, -1F);

		bodyModel[165].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[165].setRotationPoint(38F, -22.25F, 0F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 566
		bodyModel[166].setRotationPoint(-35.75F, -20F, -0.25F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 565
		bodyModel[167].setRotationPoint(-36F, -20.5F, -0.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[168].setRotationPoint(-36F, -21.5F, -0.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 561 cull bell holder
		bodyModel[169].setRotationPoint(-36F, -21.5F, -1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down early
		bodyModel[170].setRotationPoint(38.1F, -16F, -1F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up early
		bodyModel[171].setRotationPoint(38.1F, -18F, -1F);

		bodyModel[172].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 288 rear gyralight mount
		bodyModel[172].setRotationPoint(38.5F, -20.25F, -2F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight rear l
		bodyModel[173].setRotationPoint(40.25F, -20.2F, -2F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290 gyralight rear r
		bodyModel[174].setRotationPoint(40.25F, -20.2F, 0F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165 numberboard early
		bodyModel[175].setRotationPoint(38.3F, -18F, -6.25F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 167 numberboard early
		bodyModel[176].setRotationPoint(38.3F, -18F, 1.25F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 215 numberboard late HOLDER
		bodyModel[177].setRotationPoint(38.6F, -18F, -6.25F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 216 numberboard late HOLDER
		bodyModel[178].setRotationPoint(38.6F, -18F, 1.25F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down late
		bodyModel[179].setRotationPoint(38.45F, -16F, -1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up late
		bodyModel[180].setRotationPoint(38.45F, -18F, -1F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 219 late headlight plate
		bodyModel[181].setRotationPoint(38.2F, -18F, -1F);

		bodyModel[182].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 220 what'le it be fellas? ketchup? or mustard!
		bodyModel[182].setRotationPoint(6F, 1.5F, -11.25F);
		bodyModel[182].rotateAngleX = 1.57079633F;

		bodyModel[183].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 221 what'le it be fellas? ketchup? or mustard!
		bodyModel[183].setRotationPoint(-7F, 1.5F, 11.25F);
		bodyModel[183].rotateAngleX = -1.57079633F;

		bodyModel[184].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[184].setRotationPoint(-38F, -13F, 7.5F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[185].setRotationPoint(-36F, -11F, 6.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 18, 7, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F); // Box 535 b23-7 radi
		bodyModel[186].setRotationPoint(27.75F, -14F, -8.25F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 18, 7, 1, 0F,1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 293 b23-7 radi
		bodyModel[187].setRotationPoint(27.75F, -14F, 7.25F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 293 regular thin radi
		bodyModel[188].setRotationPoint(25F, -14F, 7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 229 smol low radiator smol
		bodyModel[189].setRotationPoint(27.5F, -6.5F, 7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 230 smol low radiator 2
		bodyModel[190].setRotationPoint(31F, -6.5F, 7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 293  smol low radiator 1
		bodyModel[191].setRotationPoint(17F, -7F, 7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 232 smol low radiator smol
		bodyModel[192].setRotationPoint(27.5F, -6.5F, -8F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 233 smol low radiator 2
		bodyModel[193].setRotationPoint(31F, -6.5F, -8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 234 regular thin radi
		bodyModel[194].setRotationPoint(25F, -14F, -8F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 235 smol low radiator 1
		bodyModel[195].setRotationPoint(17F, -7F, -8F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 236 b30-7a early
		bodyModel[196].setRotationPoint(22.5F, -14F, -8F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 237 b30-7a early
		bodyModel[197].setRotationPoint(22.5F, -14F, 7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F,1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 238 b30-7 radi
		bodyModel[198].setRotationPoint(27.75F, -14F, 7.25F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F,1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 239 b30-7 radi
		bodyModel[199].setRotationPoint(27.75F, -8F, 7.25F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F); // Box 240 b30-7 radi
		bodyModel[200].setRotationPoint(27.75F, -14F, -8.25F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F); // Box 241 b30-7 radi
		bodyModel[201].setRotationPoint(27.75F, -8F, -8.25F);

		bodyModel[202].addBox(0F, 0F, 0F, 5, 7, 14, 0F); // Box 289
		bodyModel[202].setRotationPoint(-38F, -20F, -7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[203].setRotationPoint(-38F, -21F, -7F);

		bodyModel[204].addBox(0F, 0F, 0F, 5, 1, 6, 0F); // Box 296
		bodyModel[204].setRotationPoint(-38F, -21F, -3F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[205].setRotationPoint(-38F, -21F, 3F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 298 headlight f hh
		bodyModel[206].setRotationPoint(-39.5F, -18.75F, -1F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 299 headlight f hh
		bodyModel[207].setRotationPoint(-39.5F, -16.75F, -1F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 19, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[208].setRotationPoint(-39F, -20F, 1F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 304
		bodyModel[209].setRotationPoint(-39F, -20F, -1F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 19, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[210].setRotationPoint(-39F, -20F, -7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[211].setRotationPoint(-39F, -21F, -1F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[212].setRotationPoint(-39F, -21F, -7F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 308
		bodyModel[213].setRotationPoint(-39F, -21F, 1F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[214].setRotationPoint(-38.75F, -21.5F, -1F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F); // Box 388 numberboard hh HOLDER
		bodyModel[215].setRotationPoint(-39.5F, -17F, 1.25F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 389 numberboard hh HOLDER
		bodyModel[216].setRotationPoint(-39.5F, -17F, -6.25F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0.225F, 0F, 0F, 0.225F, 0F, 0F, 0.225F, 0F, 0F, 0.225F); // Box 237
		bodyModel[217].setRotationPoint(-39.25F, -19.25F, -1F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.5F, 0.225F, 0F, -0.5F, 0.225F, 0F, -0.5F, 0.225F, 0F, -0.5F, 0.225F, 0F, -0.25F, 0.225F, 0F, -0.25F, 0.225F, 0F, -0.25F, 0.225F, 0F, -0.25F, 0.225F); // Box 238
		bodyModel[218].setRotationPoint(-39.25F, -18.75F, -1F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.225F, 0F, 0F, 0.225F, 0F, 0F, 0.225F, 0F, 0F, 0.225F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 239
		bodyModel[219].setRotationPoint(-39.25F, -15F, -1F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 215 numberboard late
		bodyModel[220].setRotationPoint(38.6F, -18F, -6.25F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F); // Box 216 numberboard late 
		bodyModel[221].setRotationPoint(38.6F, -18F, 1.25F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.15F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F); // Box 388 numberboard hh 
		bodyModel[222].setRotationPoint(-39.5F, -17F, 1.25F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.9F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F); // Box 389 numberboard hh
		bodyModel[223].setRotationPoint(-39.5F, -17F, -6.25F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 566
		bodyModel[224].setRotationPoint(40.25F, -20.5F, -0.25F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 565
		bodyModel[225].setRotationPoint(40F, -21F, -0.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[226].setRotationPoint(40F, -22F, -0.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 561 cull bell holder
		bodyModel[227].setRotationPoint(39F, -22F, -1F);

		bodyModel[228].addBox(-3F, 0F, 0F, 3, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[228].setRotationPoint(42F, -1F, 2F);
		bodyModel[228].rotateAngleY = -3.14159265F;
		bodyModel[228].rotateAngleZ = -1.48352986F;

		bodyModel[229].addBox(-3F, 0F, 0F, 3, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[229].setRotationPoint(-42F, -1F, -2F);
		bodyModel[229].rotateAngleZ = -1.48352986F;

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[230].setRotationPoint(37.85F, -14F, -7F);
		bodyModel[230].rotateAngleY = -0.05235988F;

		bodyModel[231].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[231].setRotationPoint(37.85F, -14F, 7F);
		bodyModel[231].rotateAngleY = 0.05235988F;

		bodyModel[232].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[232].setRotationPoint(-39F, -22.5F, -4F);

		bodyModel[233].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[233].setRotationPoint(-38F, -22.25F, -3F);

		bodyModel[234].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[234].setRotationPoint(-38.5F, -22.25F, -5F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[235].setRotationPoint(-36.5F, -21.5F, -4F);

		bodyModel[236].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 286
		bodyModel[236].setRotationPoint(36.5F, -23.25F, 4.5F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 287
		bodyModel[237].setRotationPoint(37F, -22.5F, 3.5F);

		bodyModel[238].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 288
		bodyModel[238].setRotationPoint(37F, -23.25F, 2.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 289
		bodyModel[239].setRotationPoint(36.5F, -23.5F, 3.5F);

		bodyModel[240].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[240].setRotationPoint(-37.5F, -23.5F, -4.5F);

		bodyModel[241].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[241].setRotationPoint(-37.5F, -23.5F, -3.25F);

		bodyModel[242].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 526
		bodyModel[242].setRotationPoint(37F, -24.5F, 4.25F);

		bodyModel[243].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 527
		bodyModel[243].setRotationPoint(37F, -24.5F, 3F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[244].setRotationPoint(-46F, 7F, 0F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[245].setRotationPoint(-46F, 7F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[246].setRotationPoint(-45F, 6F, 0F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[247].setRotationPoint(-45F, 4F, 2F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[248].setRotationPoint(-45F, 6F, -10F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[249].setRotationPoint(-45F, 4F, -10F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[250].setRotationPoint(-45F, 4F, 2F);

		bodyModel[251].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[251].setRotationPoint(-45F, 4F, -8F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[252].setRotationPoint(44F, 6F, 0F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[253].setRotationPoint(44F, 6F, -10F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[254].setRotationPoint(45F, 7F, -10F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[255].setRotationPoint(45F, 7F, 0F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[256].setRotationPoint(44F, 5F, 2F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[257].setRotationPoint(44F, 4F, 2F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[258].setRotationPoint(44F, 5F, -10F);

		bodyModel[259].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[259].setRotationPoint(44F, 4F, -8F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[260].setRotationPoint(-42.75F, -1F, -5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[261].setRotationPoint(-42.75F, -1F, 3F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[262].setRotationPoint(41.75F, -1F, -5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[263].setRotationPoint(41.75F, -1F, 3F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[264].setRotationPoint(42F, -1F, -7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[265].setRotationPoint(42F, -1F, 2F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[266].setRotationPoint(-43F, -1F, -7F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[267].setRotationPoint(-43F, -1F, 2F);

		bodyModel[268].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 418
		bodyModel[268].setRotationPoint(4.5F, -21F, -6.5F);

		bodyModel[269].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[269].setRotationPoint(3F, -21.75F, -5.5F);

		bodyModel[270].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[270].setRotationPoint(2F, -22F, -6.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[271].setRotationPoint(3.5F, -21.75F, -7.5F);

		bodyModel[272].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 61
		bodyModel[272].setRotationPoint(-42F, -1F, 10F);

		bodyModel[273].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 63
		bodyModel[273].setRotationPoint(-42F, -1F, -11F);

		bodyModel[274].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[274].setRotationPoint(-42F, -9F, -8F);

		bodyModel[275].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 259
		bodyModel[275].setRotationPoint(42.01F, -1F, 10F);

		bodyModel[276].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[276].setRotationPoint(42.01F, -9F, -8F);

		bodyModel[277].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 269
		bodyModel[277].setRotationPoint(42.01F, -1F, -11F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[278].setRotationPoint(-42.01F, -9F, -10F);
		bodyModel[278].rotateAngleY = -3.14159265F;

		bodyModel[279].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[279].setRotationPoint(-42.01F, -9F, 11F);
		bodyModel[279].rotateAngleY = -3.14159265F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[280].setRotationPoint(42.01F, -9F, -10F);
		bodyModel[280].rotateAngleY = -3.14159265F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[281].setRotationPoint(42.01F, -9F, 11F);
		bodyModel[281].rotateAngleY = -3.14159265F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[282].setRotationPoint(42F, -1F, -7F);

		bodyModel[283].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[283].setRotationPoint(42F, -9F, -2F);

		bodyModel[284].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[284].setRotationPoint(42F, -9F, 2F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[285].setRotationPoint(42F, -1F, 2F);

		bodyModel[286].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[286].setRotationPoint(-43F, -9F, -2F);

		bodyModel[287].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[287].setRotationPoint(-43F, -9F, 2F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[288].setRotationPoint(-43F, -1F, -7F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[289].setRotationPoint(-43F, -1F, 2F);

		bodyModel[290].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[290].setRotationPoint(-31.5F, -23.5F, -4F);

		bodyModel[291].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 418 cull platform atsf
		bodyModel[291].setRotationPoint(-26F, -23.5F, -2.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419 cull atsf bit
		bodyModel[292].setRotationPoint(-26F, -22.5F, 3.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[293].setRotationPoint(-26F, -23.5F, 5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[294].setRotationPoint(-25F, -24.5F, 0F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 309 cab roof vent
		bodyModel[295].setRotationPoint(-22F, -21.5F, -5F);
		bodyModel[295].rotateAngleX = 0.15707963F;

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 310
		bodyModel[296].setRotationPoint(-40F, -1F, -9F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 311
		bodyModel[297].setRotationPoint(-40F, -1F, 8F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 312
		bodyModel[298].setRotationPoint(39F, -1F, 8F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[299].setRotationPoint(39F, -1F, -9F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 314 cull anticlimber
		bodyModel[300].setRotationPoint(-43F, -1F, -9F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 315 cull anticlimber
		bodyModel[301].setRotationPoint(-44.5F, -1F, -8F);

		bodyModel[302].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 745
		bodyModel[302].setRotationPoint(-13.5F, -22F, -0.5F);

		bodyModel[303].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 746
		bodyModel[303].setRotationPoint(-16F, -23F, -0.5F);

		bodyModel[304].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 747
		bodyModel[304].setRotationPoint(-15F, -22.75F, 0.5F);

		bodyModel[305].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 748
		bodyModel[305].setRotationPoint(-13.5F, -22.75F, -1.5F);

		bodyModel[306].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 333
		bodyModel[306].setRotationPoint(-18F, -22.5F, 3.5F);

		bodyModel[307].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 334
		bodyModel[307].setRotationPoint(-16.5F, -22F, 4.5F);

		bodyModel[308].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 335
		bodyModel[308].setRotationPoint(-17F, -23F, 4.5F);

		bodyModel[309].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 336
		bodyModel[309].setRotationPoint(-18F, -22.5F, 5.5F);

		bodyModel[310].addBox(0F, 0F, 0F, 5, 2, 7, 0F); // Box 324 sp platform box NO CULL
		bodyModel[310].setRotationPoint(-26F, -23.5F, -3.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[311].setRotationPoint(-34F, -24F, -1F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[312].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[313].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[314].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[315].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 330 cull sp beacon holder
		bodyModel[316].setRotationPoint(-34F, -23F, -1.5F);

		bodyModel[317].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 331 sp thing
		bodyModel[317].setRotationPoint(-20F, -9F, -11F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 401 sp emergency gyra
		bodyModel[318].setRotationPoint(-34.1F, -24.5F, -1F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 400 sp E gyra box
		bodyModel[319].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[320].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 335 sp e gyra box holder stick
		bodyModel[320].setRotationPoint(-32F, -22.5F, -1F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 18, 1, 20, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 336 tiny mini mexico tank
		bodyModel[321].setRotationPoint(-9F, 5F, -10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 414 sp e gyra holdy rear
		bodyModel[322].setRotationPoint(39.01F, -22.6F, -1F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 415 sp e gyra reart
		bodyModel[323].setRotationPoint(39.9F, -22.6F, -1F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.05F, 0.3F, -0.5F, 0.05F, 0.3F, -0.5F, 0.05F, 0.3F, 0F, 0.05F, 0.3F, 0F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F, 0F, 0.5F, 0.3F); // Box 416 cull sp e gyra holdy rear
		bodyModel[324].setRotationPoint(39F, -22.76F, -1F);

		bodyModel[325].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 340 spee pee lol
		bodyModel[325].setRotationPoint(-7F, 1.5F, -11.25F);
		bodyModel[325].rotateAngleX = 1.57079633F;

		bodyModel[326].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 341 spee pee lol
		bodyModel[326].setRotationPoint(6F, 1.5F, 11.25F);
		bodyModel[326].rotateAngleX = -1.57079633F;

		bodyModel[327].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[327].setRotationPoint(-28F, -24F, 0F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[328].setRotationPoint(-25F, -23.5F, -1F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[329].setRotationPoint(-25F, -23.5F, -1F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[330].setRotationPoint(-25F, -23.5F, -1F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[331].setRotationPoint(-25F, -23.5F, -1F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[332].setRotationPoint(-25F, -23F, -1F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[333].setRotationPoint(-29.5F, -23F, -0.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[334].setRotationPoint(-29.5F, -24F, -0.5F);

		bodyModel[335].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[335].setRotationPoint(-34F, -23.5F, -1.5F);

		bodyModel[336].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[336].setRotationPoint(-33F, -23.5F, -0.5F);

		bodyModel[337].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[337].setRotationPoint(-34F, -23.5F, 0.5F);

		bodyModel[338].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[338].setRotationPoint(-32.5F, -22.5F, -0.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[339].setRotationPoint(-29F, -17F, 10F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[340].setRotationPoint(-29F, -18F, 10F);

		bodyModel[341].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 355 special sus box
		bodyModel[341].setRotationPoint(-36F, -8F, 7F);

		bodyModel[342].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[342].setRotationPoint(-28F, -22F, -9.5F);

		bodyModel[343].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[343].setRotationPoint(-28F, -22F, 6.5F);

		bodyModel[344].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[344].setRotationPoint(-27.5F, -23F, -8F);

		bodyModel[345].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[345].setRotationPoint(-27.5F, -23F, 8F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[346].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[347].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[348].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[349].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[350].setRotationPoint(-30.5F, -21F, 7F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[351].setRotationPoint(-30F, -22F, 7.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[352].setRotationPoint(-42F, -4F, -6.75F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[353].setRotationPoint(-42.5F, 0F, -8.75F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[354].setRotationPoint(-42.25F, -4F, -6.75F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f2
		bodyModel[355].setRotationPoint(-42.75F, 0F, -8.75F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[356].setRotationPoint(-42.5F, 0F, 6.75F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f2
		bodyModel[357].setRotationPoint(-42.75F, 0F, 6.75F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[358].setRotationPoint(-42.25F, -4F, 4.75F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[359].setRotationPoint(-42F, -4F, 4.75F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[360].setRotationPoint(41F, -4F, -6.75F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[361].setRotationPoint(42F, 0F, -8.75F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[362].setRotationPoint(41.75F, -4F, -6.75F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 ditchlight r2
		bodyModel[363].setRotationPoint(42.25F, 0F, -8.75F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[364].setRotationPoint(42F, 0F, 6.75F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r2
		bodyModel[365].setRotationPoint(42.25F, 0F, 6.75F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[366].setRotationPoint(41F, -4F, 4.75F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[367].setRotationPoint(41.75F, -4F, 4.75F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[368].setRotationPoint(-19F, -18.25F, -9F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[369].setRotationPoint(-19F, -19.25F, -9F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[370].setRotationPoint(-18.75F, -17.75F, -8.75F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[371].setRotationPoint(-19F, -20.25F, -8.8F);

		bodyModel[372].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 364 prime base
		bodyModel[372].setRotationPoint(-32F, -22.5F, -3.5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[373].setRotationPoint(-32F, -23.5F, -3.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[374].setRotationPoint(-32F, -23.5F, -3.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[375].setRotationPoint(-32F, -23.5F, -3.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[376].setRotationPoint(-32F, -23.5F, -3.5F);

		bodyModel[377].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 250
		bodyModel[377].setRotationPoint(-37F, -13F, -11F);

		bodyModel[378].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 410
		bodyModel[378].setRotationPoint(-37F, -13F, 11F);

		bodyModel[379].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 406
		bodyModel[379].setRotationPoint(-39F, -10F, 9F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 407
		bodyModel[380].setRotationPoint(-39F, -6F, 10.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 293
		bodyModel[381].setRotationPoint(-39F, -6F, -11.5F);

		bodyModel[382].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 294
		bodyModel[382].setRotationPoint(-39F, -10F, -11F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, -2F, 0F, 3F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, -2F); // Box 399
		bodyModel[383].setRotationPoint(-39F, -13F, 11F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 2F, 0F, 3F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 2F); // Box 400
		bodyModel[384].setRotationPoint(-39F, -13F, -11F);

		bodyModel[385].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 285
		bodyModel[385].setRotationPoint(-20F, -13F, 11F);

		bodyModel[386].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 288
		bodyModel[386].setRotationPoint(-5F, -9F, 11F);

		bodyModel[387].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 300
		bodyModel[387].setRotationPoint(-20F, -13F, -11F);

		bodyModel[388].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 303
		bodyModel[388].setRotationPoint(-5F, -9F, -11F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 296
		bodyModel[389].setRotationPoint(-9F, -13F, -11.01F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 297
		bodyModel[390].setRotationPoint(-9F, -13F, 11.01F);

		bodyModel[391].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[391].setRotationPoint(39F, -9F, -11F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[392].setRotationPoint(39F, -6F, -11.5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[393].setRotationPoint(39F, -6F, 10.5F);

		bodyModel[394].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[394].setRotationPoint(39F, -9F, 9F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F); // Box 411
		bodyModel[395].setRotationPoint(-39F, -13F, 11.01F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F); // Box 412
		bodyModel[396].setRotationPoint(-39F, -13F, -11.01F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F); // Box 339 cull ccrcl beacon holdy
		bodyModel[397].setRotationPoint(-32F, -21F, 7F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F); // Box 340 cull ccrcl beacon holdy
		bodyModel[398].setRotationPoint(-32F, -21F, -9F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon ccrcl
		bodyModel[399].setRotationPoint(-32F, -22.75F, -8.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 342 commander beacon ccrcl
		bodyModel[400].setRotationPoint(-32F, -22.75F, 7.5F);

		bodyModel[401].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 324
		bodyModel[401].setRotationPoint(-33F, -24F, -1.5F);

		bodyModel[402].addBox(0F, 0F, 0F, 9, 5, 15, 0F); // Box 379 big box boye
		bodyModel[402].setRotationPoint(-13F, -23F, -7.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[403].setRotationPoint(-26.05F, -15F, 1F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[404].setRotationPoint(-32.75F, -13F, 3F);
		bodyModel[404].rotateAngleY = -0.45378561F;

		bodyModel[405].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[405].setRotationPoint(-32.75F, -15F, 3F);
		bodyModel[405].rotateAngleY = -0.45378561F;

		bodyModel[406].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[406].setRotationPoint(-32.75F, -9F, 3F);
		bodyModel[406].rotateAngleY = -0.45378561F;

		bodyModel[407].addShapeBox(0F, 0F, -2F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[407].setRotationPoint(-32F, -17F, 7.5F);
		//bodyModel[407].rotateAngleY = 0.17453293F;

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME5-1
		bodyModel[408].setRotationPoint(-36.5F, -22.5F, -1F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME5-3
		bodyModel[409].setRotationPoint(-36.5F, -22.5F, -1F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME5-2
		bodyModel[410].setRotationPoint(-36.5F, -22.5F, -1F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME5-4
		bodyModel[411].setRotationPoint(-36.5F, -22.5F, -1F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[412].setRotationPoint(-36.5F, -22F, -1F);

		bodyModel[413].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[413].setRotationPoint(-33F, 1F, 9F);
		bodyModel[413].rotateAngleZ = -0.27925268F;

		bodyModel[414].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[414].setRotationPoint(-36F, 1F, 9F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 429 backwall
		bodyModel[415].setRotationPoint(-22F, -21F, -5F);

		bodyModel[416].addBox(0F, 0F, 0F, 1, 10, 4, 0F); // Box 430 backwall cull bit
		bodyModel[416].setRotationPoint(-22F, -15F, 1F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -5.125F, 0.125F, -0.125F, -5.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -5.125F, 0.125F, -5.125F, -5.125F); // Box 431 backpannel bulgy bit
		bodyModel[417].setRotationPoint(-22F, -20F, 0F);

		bodyModel[418].addBox(0F, 0F, 0F, 20, 2, 20, 0F); // Box 144
		bodyModel[418].setRotationPoint(17F, -20F, -10F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, -0.34F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 292
		bodyModel[419].setRotationPoint(17F, -18F, -10F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.34F, -1F, 0F, 0F, -1F, 0F); // Box 347
		bodyModel[420].setRotationPoint(17F, -18F, 7F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[421].setRotationPoint(17F, -22F, -2F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[422].setRotationPoint(17F, -21F, 9F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[423].setRotationPoint(17F, -21F, -10F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 20, 2, 7, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[424].setRotationPoint(17F, -22F, 2F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 20, 2, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[425].setRotationPoint(17F, -22F, -9F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 34, 0, 14, 0F,0F, -1.5F, -7F, -17F, -1.5F, -7F, -17F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, -7F, -17F, 1.5F, -7F, -17F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 370
		bodyModel[426].setRotationPoint(19F, -22.51F, -16F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 34, 0, 14, 0F,0F, -0.25F, 0F, -17F, -0.25F, 0F, -17F, -1.5F, -7F, 0F, -1.5F, -7F, 0F, 0.25F, 0F, -17F, 0.25F, 0F, -17F, 1.5F, -7F, 0F, 1.5F, -7F); // Box 371
		bodyModel[427].setRotationPoint(19F, -22.51F, 2F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.34F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.34F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 133
		bodyModel[428].setRotationPoint(37F, -20F, 7.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.34F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, -0.34F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 138
		bodyModel[429].setRotationPoint(37F, -20F, -10.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 34, 0, 8, 0F,0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, -4F, 0F, 0F, -4F); // Box 455
		bodyModel[430].setRotationPoint(19F, -22.26F, -2F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -1F, 0F, -1.185F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0F, 0F, -1.185F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 456
		bodyModel[431].setRotationPoint(37F, -22F, -9F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.34F, -0.5F, 0F, -0.185F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.185F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[432].setRotationPoint(37F, -21F, -10F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[433].setRotationPoint(37F, -22F, -2F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 462
		bodyModel[434].setRotationPoint(37F, -22F, 1F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0.25F, -1F, 0F, 0.25F, 0F, -1.185F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1.185F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[435].setRotationPoint(37F, -22F, 1F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.185F, 0F, 0F, -0.34F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.185F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[436].setRotationPoint(37F, -21F, 9F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.82F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.82F, 0F, 0F, -0.82F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.82F, 0F, 0F); // Box 468
		bodyModel[437].setRotationPoint(37F, -21F, -9F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker 2
		bodyModel[438].setRotationPoint(37.85F, -20F, -7F);
		bodyModel[438].rotateAngleY = -0.05235988F;

		bodyModel[439].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker 2
		bodyModel[439].setRotationPoint(37.85F, -20F, 7F);
		bodyModel[439].rotateAngleY = 0.05235988F;

		bodyModel[440].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 471 funky double radiator
		bodyModel[440].setRotationPoint(20.25F, -16F, -8F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 472 funky double radiator
		bodyModel[441].setRotationPoint(20.25F, -8F, -8F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 471 funky double radiator
		bodyModel[442].setRotationPoint(20.25F, -16F, 7F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 472 funky double radiator
		bodyModel[443].setRotationPoint(20.25F, -8F, 7F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 0, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F); // Box 407
		bodyModel[444].setRotationPoint(-44.5F, 0F, -2.5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 445
		bodyModel[445].setRotationPoint(-45F, 3F, 2F);

		bodyModel[446].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 446
		bodyModel[446].setRotationPoint(-45F, 3F, -8F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447 pw antenna
		bodyModel[447].setRotationPoint(-31F, -23F, 0F);

		bodyModel[448].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 786
		bodyModel[448].setRotationPoint(-16.5F, -21.5F, -4.5F);

		bodyModel[449].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 787
		bodyModel[449].setRotationPoint(-17F, -22.25F, -3.5F);

		bodyModel[450].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 788
		bodyModel[450].setRotationPoint(-19F, -22.5F, -4.5F);

		bodyModel[451].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 789
		bodyModel[451].setRotationPoint(-18F, -22.25F, -5.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 104 cnrc antenna
		bodyModel[452].setRotationPoint(-24F, -27.5F, 1F);

		bodyModel[453].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 453
		bodyModel[453].setRotationPoint(-33F, -23.25F, 1.5F);

		bodyModel[454].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 454
		bodyModel[454].setRotationPoint(-33F, -23.25F, -2.5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 18, 4, 18, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455 2900 gal fuel tank
		bodyModel[455].setRotationPoint(-9F, 4F, -9F);

		bodyModel[456].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 456 csx floater
		bodyModel[456].setRotationPoint(-23F, -22.5F, 4F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457 csx floater
		bodyModel[457].setRotationPoint(-22.5F, -23.51F, 4.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 458 csx floater
		bodyModel[458].setRotationPoint(-22.5F, -22.5F, 5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F); // Box 459 cull sound baffles
		bodyModel[459].setRotationPoint(25F, -17F, -11F);
	}

	ModelFB2_new theTrucks2 = new ModelFB2_new();
	ModelBlombergBnew theTrucks3 = new ModelBlombergBnew();
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();
	Modelb30_booster_bits bits = new Modelb30_booster_bits();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 1||GetColor(entity) == 0
				||GetColor(entity) == 3||GetColor(entity) == 2945
				||GetColor(entity) == 30||GetColor(entity) == 31
				||GetColor(entity) == 34) {
			//fb2 black late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			if (((AbstractTrains) entity).getColor() == 30 || ((AbstractTrains) entity).getColor() == 34){
				if (((AbstractTrains) entity).getColor() == 30){
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/b36-7_Skin30.png"));
				} else{
					Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/b30-7_Skin34.png"));
				}
				GL11.glPushMatrix();
				GL11.glTranslated(0, 0, 0);
				bits.render(entity, f, f1, f2, f3, f4, f5);
				GL11.glPopMatrix();
			}
		} else if (GetColor(entity) == 6||GetColor(entity) == 14236){
			//type b silver early
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.015, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 14){
			//type b BEANSNIF
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_BeansniffGreen.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.015, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 19||GetColor(entity) == 26
				||GetColor(entity) == 28){
			//fb2 blac early
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.015, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 11 ||GetColor(entity) == 25){
			//fb2 u p is where the poop is early
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_up_early.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.015, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 8||GetColor(entity) == 17){
			//fb2 sp late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_sp.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 16 ||GetColor(entity) == 10){
			//fb2 silver late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 7 || GetColor(entity) == 29){
			//fb2 grey late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 9){
			//fb2 CRASH SMASH XPLODE late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_de_bleu.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 32||GetColor(entity) == 33
				||GetColor(entity) == 3434){
			//type b blacs early
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.015, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 35 ||GetColor(entity) == 36
				||GetColor(entity) == 38 ||GetColor(entity) == 41 ||GetColor(entity) == 42){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/BlombergB_csxbleu.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
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
//holy fucc